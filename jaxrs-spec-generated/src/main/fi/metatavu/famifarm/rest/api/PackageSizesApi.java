// package io.swagger.api;
package fi.metatavu.famifarm.rest;

import io.swagger.model.Error;
import io.swagger.model.PackageSize;
import java.util.UUID;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/packageSizes")

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJAXRSSpecServerCodegen", date = "2018-12-09T20:02:49.924+02:00[Europe/Helsinki]")
public interface PackageSizesApi {

    @POST
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    PackageSize createPackageSize(@Valid PackageSize body);

    @DELETE
    @Path("/{packageSizeId}")
    @Produces({ "application/json" })
    void deletePackageSize(@PathParam("packageSizeId") UUID packageSizeId);

    @GET
    @Path("/{packageSizeId}")
    @Produces({ "application/json" })
    PackageSize findPackageSize(@PathParam("packageSizeId") UUID packageSizeId);

    @GET
    @Produces({ "application/json" })
    List<PackageSize> listPackageSizes(@QueryParam("firstResult")  Integer firstResult,@QueryParam("maxResults")  Integer maxResults);

    @PUT
    @Path("/{packageSizeId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    PackageSize updatePackageSize(@Valid PackageSize body@PathParam("packageSizeId") UUID packageSizeId);
}
