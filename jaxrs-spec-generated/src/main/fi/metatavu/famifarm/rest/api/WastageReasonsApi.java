// package io.swagger.api;
package fi.metatavu.famifarm.rest;

import io.swagger.model.Error;
import java.util.UUID;
import io.swagger.model.WastageReason;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/wastageReasons")

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJAXRSSpecServerCodegen", date = "2018-12-09T20:02:49.924+02:00[Europe/Helsinki]")
public interface WastageReasonsApi {

    @POST
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    WastageReason createWastageReason(@Valid WastageReason body);

    @DELETE
    @Path("/{wastageReasonId}")
    @Produces({ "application/json" })
    void deleteWastageReason(@PathParam("wastageReasonId") UUID wastageReasonId);

    @GET
    @Path("/{wastageReasonId}")
    @Produces({ "application/json" })
    WastageReason findWastageReason(@PathParam("wastageReasonId") UUID wastageReasonId);

    @GET
    @Produces({ "application/json" })
    List<WastageReason> listWastageReasons(@QueryParam("firstResult")  Integer firstResult,@QueryParam("maxResults")  Integer maxResults);

    @PUT
    @Path("/{wastageReasonId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    WastageReason updateWastageReason(@Valid WastageReason body@PathParam("wastageReasonId") UUID wastageReasonId);
}
