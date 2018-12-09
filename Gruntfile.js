/*global module:false*/

const _ = require("lodash");
const fs = require("fs");
const path = require("path");

module.exports = function(grunt) {
  require("load-grunt-tasks")(grunt);
  
  const SWAGGER_VERSION = "3.0.3";
  const SWAGGER_JAR = `swagger-codegen-cli-${SWAGGER_VERSION}.jar`;
  const SWAGGER_URL = `https://search.maven.org/remotecontent?filepath=io/swagger/codegen/v3/swagger-codegen-cli/${SWAGGER_VERSION}/${SWAGGER_JAR}`;
  
  const JAXRS_ARTIFACT = "famifarm-api-spec";
  const JAXRS_PACKAGE = "fi.metatavu.famifarm.rest";
  const JAXRS_GROUP = "fi.metatavu.famifarm";

  grunt.initConfig({
    "curl": {
      "swagger-codegen":  {
        src: SWAGGER_URL,
        dest: SWAGGER_JAR
      }
    },
    "clean": {
      "jaxrs-spec-cruft": [
        "jaxrs-spec-generated/src/main/java/fi/metatavu/famifarm/server/RestApplication.java"
      ],
      "jaxrs-spec-sources": ["jaxrs-spec-generated/src"]
    },
    "shell": {
      "jaxrs-spec-generate": {
        command : "mv jaxrs-spec-generated/pom.xml jaxrs-spec-generated/pom.xml.before && " +
          `java -jar ${SWAGGER_JAR} generate ` +
          "-i ./swagger.yaml " +
          "-l jaxrs-spec " +
          `--api-package ${JAXRS_PACKAGE} ` +
          `--model-package ${JAXRS_PACKAGE}.model ` +
          `--group-id ${JAXRS_GROUP} ` +
          `--artifact-id ${JAXRS_ARTIFACT} ` +
          "--template-engine mustache " +
          "--artifact-version `cat jaxrs-spec-generated/pom.xml.before|grep version -m 1|sed -e \"s/.*<version>//\"|sed -e \"s/<.*//\"` " +
          "--template-dir jaxrs-spec-templates " +
          `--additional-properties dateLibrary=java8,useBeanValidation=true,sourceFolder=src/main/java,interfaceOnly=true ` +
          "-o jaxrs-spec-generated/"
      },
      "jaxrs-fix-folders": {
        command : "mkdir -p jaxrs-spec-generated/src/main/fi/metatavu/famifarm/rest && mv jaxrs-spec-generated/src/main/java/io/swagger/* jaxrs-spec-generated/src/main/fi/metatavu/famifarm/rest"
      },
      "jaxrs-spec-install": {
        command : "mvn install",
        options: {
          execOptions: {
            cwd: "jaxrs-spec-generated"
          }
        }
      },
      "jaxrs-spec-release": {
        command : "git add src pom.xml swagger.json && git commit -m 'Generated source' && git push && mvn -B release:clean release:prepare release:perform",
        options: {
          execOptions: {
            cwd: "jaxrs-spec-generated"
          }
        }
      }
    }
  });

  grunt.registerTask("download-dependencies", "if-missing:curl:swagger-codegen");
  grunt.registerTask("jaxrs-gen", [ "download-dependencies", "clean:jaxrs-spec-sources", "shell:jaxrs-spec-generate", "clean:jaxrs-spec-cruft", "shell:jaxrs-fix-folders", "shell:jaxrs-spec-install" ]);
  grunt.registerTask("jaxrs-spec", [ "jaxrs-gen", "shell:jaxrs-spec-release" ]);
  grunt.registerTask("default", [ "jaxrs-spec"]);
  
};
