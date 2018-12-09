// package io.swagger.api;
package fi.metatavu.famifarm.rest;

import io.swagger.model.Error;
import io.swagger.model.SeedBatch;
import java.util.UUID;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/seedBatches")

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJAXRSSpecServerCodegen", date = "2018-12-09T20:02:49.924+02:00[Europe/Helsinki]")
public interface SeedBatchesApi {

    @POST
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    SeedBatch createSeedBatch(@Valid SeedBatch body);

    @DELETE
    @Path("/{seedBatchId}")
    @Produces({ "application/json" })
    void deleteSeedBatch(@PathParam("seedBatchId") UUID seedBatchId);

    @GET
    @Path("/{seedBatchId}")
    @Produces({ "application/json" })
    SeedBatch findSeedBatch(@PathParam("seedBatchId") UUID seedBatchId);

    @GET
    @Produces({ "application/json" })
    List<SeedBatch> listSeedBatches(@QueryParam("firstResult")  Integer firstResult,@QueryParam("maxResults")  Integer maxResults);

    @PUT
    @Path("/{seedBatchId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    SeedBatch updateSeedBatch(@Valid SeedBatch body@PathParam("seedBatchId") UUID seedBatchId);
}
