// package io.swagger.api;
package fi.metatavu.famifarm.rest;

import io.swagger.model.Error;
import io.swagger.model.Product;
import java.util.UUID;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/products")

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJAXRSSpecServerCodegen", date = "2018-12-09T20:02:49.924+02:00[Europe/Helsinki]")
public interface ProductsApi {

    @POST
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    Product createProduct(@Valid Product body);

    @DELETE
    @Path("/{productId}")
    @Produces({ "application/json" })
    void deleteProduct(@PathParam("productId") UUID productId);

    @GET
    @Path("/{productId}")
    @Produces({ "application/json" })
    Product findProduct(@PathParam("productId") UUID productId);

    @GET
    @Produces({ "application/json" })
    List<Product> listProducts(@QueryParam("firstResult")  Integer firstResult,@QueryParam("maxResults")  Integer maxResults);

    @PUT
    @Path("/{productId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    Product updateProduct(@Valid Product body@PathParam("productId") UUID productId);
}
