// package io.swagger.api;
package fi.metatavu.famifarm.rest;

import io.swagger.model.Error;
import io.swagger.model.Seed;
import java.util.UUID;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/seeds")

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJAXRSSpecServerCodegen", date = "2018-12-09T20:02:49.924+02:00[Europe/Helsinki]")
public interface SeedsApi {

    @POST
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    Seed createSeed(@Valid Seed body);

    @DELETE
    @Path("/{seedId}")
    @Produces({ "application/json" })
    void deleteSeed(@PathParam("seedId") UUID seedId);

    @GET
    @Path("/{seedId}")
    @Produces({ "application/json" })
    Seed findSeed(@PathParam("seedId") UUID seedId);

    @GET
    @Produces({ "application/json" })
    List<Seed> listSeeds(@QueryParam("firstResult")  Integer firstResult,@QueryParam("maxResults")  Integer maxResults);

    @PUT
    @Path("/{seedId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    Seed updateSeed(@Valid Seed body@PathParam("seedId") UUID seedId);
}
