// package io.swagger.api;
package fi.metatavu.famifarm.rest;

import io.swagger.model.Error;
import io.swagger.model.ProductionLine;
import java.util.UUID;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/productionLines")

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJAXRSSpecServerCodegen", date = "2018-12-09T20:02:49.924+02:00[Europe/Helsinki]")
public interface ProductionLinesApi {

    @POST
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    ProductionLine createProductionLine(@Valid ProductionLine body);

    @DELETE
    @Path("/{productionLineId}")
    @Produces({ "application/json" })
    void deleteProductionLine(@PathParam("productionLineId") UUID productionLineId);

    @GET
    @Path("/{productionLineId}")
    @Produces({ "application/json" })
    ProductionLine findProductionLine(@PathParam("productionLineId") UUID productionLineId);

    @GET
    @Produces({ "application/json" })
    List<ProductionLine> listProductionLines(@QueryParam("firstResult")  Integer firstResult,@QueryParam("maxResults")  Integer maxResults);

    @PUT
    @Path("/{productionLineId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    ProductionLine updateProductionLine(@Valid ProductionLine body@PathParam("productionLineId") UUID productionLineId);
}
