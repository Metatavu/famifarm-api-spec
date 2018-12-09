// package io.swagger.api;
package fi.metatavu.famifarm.rest;

import io.swagger.model.Error;
import io.swagger.model.Event;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/events")

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJAXRSSpecServerCodegen", date = "2018-12-09T14:00:25.826+02:00[Europe/Helsinki]")
public interface EventsApi {

    @GET
    @Produces({ "application/json" })
    Event listEvents(@QueryParam("maxResult")  Integer maxResult);
}
