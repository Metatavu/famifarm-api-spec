// package io.swagger.api;
package fi.metatavu.famifarm.rest;

import io.swagger.model.Error;
import io.swagger.model.Team;
import java.util.UUID;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/teams")

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJAXRSSpecServerCodegen", date = "2018-12-09T20:02:49.924+02:00[Europe/Helsinki]")
public interface TeamsApi {

    @POST
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    Team createTeam(@Valid Team body);

    @DELETE
    @Path("/{teamId}")
    @Produces({ "application/json" })
    void deleteTeam(@PathParam("teamId") UUID teamId);

    @GET
    @Path("/{teamId}")
    @Produces({ "application/json" })
    Team findTeam(@PathParam("teamId") UUID teamId);

    @GET
    @Produces({ "application/json" })
    List<Team> listTeams(@QueryParam("firstResult")  Integer firstResult,@QueryParam("maxResults")  Integer maxResults);

    @PUT
    @Path("/{teamId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    Team updateTeam(@Valid Team body@PathParam("teamId") UUID teamId);
}
