// package io.swagger.api;
package fi.metatavu.famifarm.rest;

import io.swagger.model.Error;
import io.swagger.model.PerformedCultivationAction;
import java.util.UUID;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/performedCultivationActions")

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJAXRSSpecServerCodegen", date = "2018-12-09T20:02:49.924+02:00[Europe/Helsinki]")
public interface PerformedCultivationActionsApi {

    @POST
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    PerformedCultivationAction createPerformedCultivationAction(@Valid PerformedCultivationAction body);

    @DELETE
    @Path("/{performedCultivationActionId}")
    @Produces({ "application/json" })
    void deletePerformedCultivationAction(@PathParam("performedCultivationActionId") UUID performedCultivationActionId);

    @GET
    @Path("/{performedCultivationActionId}")
    @Produces({ "application/json" })
    PerformedCultivationAction findPerformedCultivationAction(@PathParam("performedCultivationActionId") UUID performedCultivationActionId);

    @GET
    @Produces({ "application/json" })
    List<PerformedCultivationAction> listPerformedCultivationActions(@QueryParam("firstResult")  Integer firstResult,@QueryParam("maxResults")  Integer maxResults);

    @PUT
    @Path("/{performedCultivationActionId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    PerformedCultivationAction updatePerformedCultivationAction(@Valid PerformedCultivationAction body@PathParam("performedCultivationActionId") UUID performedCultivationActionId);
}
