// package io.swagger.api;
package fi.metatavu.famifarm.rest;

import io.swagger.model.Batch;
import io.swagger.model.Error;
import java.util.UUID;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/batches")

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJAXRSSpecServerCodegen", date = "2018-12-09T20:02:49.924+02:00[Europe/Helsinki]")
public interface BatchesApi {

    @POST
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    Batch createBatch(@Valid Batch body);

    @DELETE
    @Path("/{batchId}")
    @Produces({ "application/json" })
    void deleteBatch(@PathParam("batchId") UUID batchId);

    @GET
    @Path("/{batchId}")
    @Produces({ "application/json" })
    Batch findBatch(@PathParam("batchId") UUID batchId);

    @GET
    @Produces({ "application/json" })
    List<Batch> listBatches(@QueryParam("maxResult")  Integer maxResult);

    @PUT
    @Path("/{batchId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    Batch updateBatch(@Valid Batch body@PathParam("batchId") UUID batchId);
}
