// package io.swagger.api;
package fi.metatavu.famifarm.rest;

import io.swagger.model.Error;
import io.swagger.model.Event;
import java.util.UUID;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/events")

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJAXRSSpecServerCodegen", date = "2018-12-09T20:02:49.924+02:00[Europe/Helsinki]")
public interface EventsApi {

    @POST
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    Event createEvent(@Valid Event body);

    @DELETE
    @Path("/{eventId}")
    @Produces({ "application/json" })
    void deleteEvent(@PathParam("eventId") UUID eventId);

    @GET
    @Path("/{eventId}")
    @Produces({ "application/json" })
    Event findEvent(@PathParam("eventId") UUID eventId);

    @GET
    @Produces({ "application/json" })
    List<Event> listEvents(@QueryParam("firstResult")  Integer firstResult,@QueryParam("maxResults")  Integer maxResults);

    @PUT
    @Path("/{eventId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    Event updateEvent(@Valid Event body@PathParam("eventId") UUID eventId);
}
