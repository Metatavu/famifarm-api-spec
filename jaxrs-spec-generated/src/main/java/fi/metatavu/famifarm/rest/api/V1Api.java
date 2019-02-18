package fi.metatavu.famifarm.rest.api;

import java.util.UUID;
import fi.metatavu.famifarm.rest.model.*;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.io.File;

import java.time.OffsetDateTime;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/v1")

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJAXRSSpecServerCodegen", date = "2019-02-18T07:27:03.596+02:00[Europe/Helsinki]")
public interface V1Api {

    @POST
    @Path("/batches")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @Operation(summary = "Create new batch", description = "", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "batches" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A created batch", content = @Content(schema = @Schema(implementation = Batch.class))),
        @ApiResponse(responseCode = "200", description = "unexpected error", content = @Content(schema = @Schema(implementation = ErrorResponse.class))) })
    Response createBatch(@Valid Batch body);
    @POST
    @Path("/events")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @Operation(summary = "Create new event", description = "", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "events" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A created event", content = @Content(schema = @Schema(implementation = Event.class))),
        @ApiResponse(responseCode = "200", description = "unexpected error", content = @Content(schema = @Schema(implementation = ErrorResponse.class))) })
    Response createEvent(@Valid Event body);
    @POST
    @Path("/packageSizes")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @Operation(summary = "Create new package size", description = "", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "packageSizes" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A created packageSize", content = @Content(schema = @Schema(implementation = PackageSize.class))),
        @ApiResponse(responseCode = "200", description = "unexpected error", content = @Content(schema = @Schema(implementation = ErrorResponse.class))) })
    Response createPackageSize(@Valid PackageSize body);
    @POST
    @Path("/performedCultivationActions")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @Operation(summary = "Create new performed cultivation action", description = "", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "performedCultivationActions" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A created performedCultivationAction", content = @Content(schema = @Schema(implementation = PerformedCultivationAction.class))),
        @ApiResponse(responseCode = "200", description = "unexpected error", content = @Content(schema = @Schema(implementation = ErrorResponse.class))) })
    Response createPerformedCultivationAction(@Valid PerformedCultivationAction body);
    @POST
    @Path("/products")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @Operation(summary = "Create new product", description = "", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "products" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A created product", content = @Content(schema = @Schema(implementation = Product.class))),
        @ApiResponse(responseCode = "200", description = "unexpected error", content = @Content(schema = @Schema(implementation = ErrorResponse.class))) })
    Response createProduct(@Valid Product body);
    @POST
    @Path("/productionLines")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @Operation(summary = "Create new production line", description = "", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "productionLines" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A created productionLine", content = @Content(schema = @Schema(implementation = ProductionLine.class))),
        @ApiResponse(responseCode = "200", description = "unexpected error", content = @Content(schema = @Schema(implementation = ErrorResponse.class))) })
    Response createProductionLine(@Valid ProductionLine body);
    @POST
    @Path("/seeds")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @Operation(summary = "Create new seed", description = "", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "seeds" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A created seed", content = @Content(schema = @Schema(implementation = Seed.class))),
        @ApiResponse(responseCode = "200", description = "unexpected error", content = @Content(schema = @Schema(implementation = ErrorResponse.class))) })
    Response createSeed(@Valid Seed body);
    @POST
    @Path("/seedBatches")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @Operation(summary = "Create new seed batch", description = "", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "seedBatches" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A created seedBatch", content = @Content(schema = @Schema(implementation = SeedBatch.class))),
        @ApiResponse(responseCode = "200", description = "unexpected error", content = @Content(schema = @Schema(implementation = ErrorResponse.class))) })
    Response createSeedBatch(@Valid SeedBatch body);
    @POST
    @Path("/teams")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @Operation(summary = "Create new team", description = "", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "teams" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A created team", content = @Content(schema = @Schema(implementation = Team.class))),
        @ApiResponse(responseCode = "200", description = "unexpected error", content = @Content(schema = @Schema(implementation = ErrorResponse.class))) })
    Response createTeam(@Valid Team body);
    @POST
    @Path("/wastageReasons")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @Operation(summary = "Create new wastage reason", description = "", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "wastageReasons" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A created wastageReason", content = @Content(schema = @Schema(implementation = WastageReason.class))),
        @ApiResponse(responseCode = "200", description = "unexpected error", content = @Content(schema = @Schema(implementation = ErrorResponse.class))) })
    Response createWastageReason(@Valid WastageReason body);
    @DELETE
    @Path("/batches/{batchId}")
    @Produces({ "application/json" })
    @Operation(summary = "Deletes a batch", description = "", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "batches" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "204", description = "Empty result indication a successful removal"),
        @ApiResponse(responseCode = "200", description = "unexpected error", content = @Content(schema = @Schema(implementation = ErrorResponse.class))) })
    Response deleteBatch( @PathParam("batchId")

 @Parameter(description = "BatchId") UUID batchId
);
    @DELETE
    @Path("/events/{eventId}")
    @Produces({ "application/json" })
    @Operation(summary = "Deletes an event", description = "", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "events" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "204", description = "Empty result indication a successful removal"),
        @ApiResponse(responseCode = "200", description = "unexpected error", content = @Content(schema = @Schema(implementation = ErrorResponse.class))) })
    Response deleteEvent( @PathParam("eventId")

 @Parameter(description = "Event id") UUID eventId
);
    @DELETE
    @Path("/packageSizes/{packageSizeId}")
    @Produces({ "application/json" })
    @Operation(summary = "Deletes a package size", description = "", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "packageSizes" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "204", description = "Empty result indication a successful removal"),
        @ApiResponse(responseCode = "200", description = "unexpected error", content = @Content(schema = @Schema(implementation = ErrorResponse.class))) })
    Response deletePackageSize( @PathParam("packageSizeId")

 @Parameter(description = "PackageSizeId") UUID packageSizeId
);
    @DELETE
    @Path("/performedCultivationActions/{performedCultivationActionId}")
    @Produces({ "application/json" })
    @Operation(summary = "Deletes a performed cultivation action", description = "", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "performedCultivationActions" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "204", description = "Empty result indication a successful removal"),
        @ApiResponse(responseCode = "200", description = "unexpected error", content = @Content(schema = @Schema(implementation = ErrorResponse.class))) })
    Response deletePerformedCultivationAction( @PathParam("performedCultivationActionId")

 @Parameter(description = "PerformedCultivationActionId") UUID performedCultivationActionId
);
    @DELETE
    @Path("/products/{productId}")
    @Produces({ "application/json" })
    @Operation(summary = "Deletes a product", description = "", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "products" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "204", description = "Empty result indication a successful removal"),
        @ApiResponse(responseCode = "200", description = "unexpected error", content = @Content(schema = @Schema(implementation = ErrorResponse.class))) })
    Response deleteProduct( @PathParam("productId")

 @Parameter(description = "Product id") UUID productId
);
    @DELETE
    @Path("/productionLines/{productionLineId}")
    @Produces({ "application/json" })
    @Operation(summary = "Deletes a production line", description = "", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "productionLines" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "204", description = "Empty result indication a successful removal"),
        @ApiResponse(responseCode = "200", description = "unexpected error", content = @Content(schema = @Schema(implementation = ErrorResponse.class))) })
    Response deleteProductionLine( @PathParam("productionLineId")

 @Parameter(description = "ProductionLineId") UUID productionLineId
);
    @DELETE
    @Path("/seeds/{seedId}")
    @Produces({ "application/json" })
    @Operation(summary = "Deletes a seed", description = "", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "seeds" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "204", description = "Empty result indication a successful removal"),
        @ApiResponse(responseCode = "200", description = "unexpected error", content = @Content(schema = @Schema(implementation = ErrorResponse.class))) })
    Response deleteSeed( @PathParam("seedId")

 @Parameter(description = "Seed id") UUID seedId
);
    @DELETE
    @Path("/seedBatches/{seedBatchId}")
    @Produces({ "application/json" })
    @Operation(summary = "Deletes a seed batch", description = "", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "seedBatches" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "204", description = "Empty result indication a successful removal"),
        @ApiResponse(responseCode = "200", description = "unexpected error", content = @Content(schema = @Schema(implementation = ErrorResponse.class))) })
    Response deleteSeedBatch( @PathParam("seedBatchId")

 @Parameter(description = "SeedBatchId") UUID seedBatchId
);
    @DELETE
    @Path("/teams/{teamId}")
    @Produces({ "application/json" })
    @Operation(summary = "Deletes a team", description = "", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "teams" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "204", description = "Empty result indication a successful removal"),
        @ApiResponse(responseCode = "200", description = "unexpected error", content = @Content(schema = @Schema(implementation = ErrorResponse.class))) })
    Response deleteTeam( @PathParam("teamId")

 @Parameter(description = "Team id") UUID teamId
);
    @DELETE
    @Path("/wastageReasons/{wastageReasonId}")
    @Produces({ "application/json" })
    @Operation(summary = "Deletes an wastage reason", description = "", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "wastageReasons" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "204", description = "Empty result indication a successful removal"),
        @ApiResponse(responseCode = "200", description = "unexpected error", content = @Content(schema = @Schema(implementation = ErrorResponse.class))) })
    Response deleteWastageReason( @PathParam("wastageReasonId")

 @Parameter(description = "WastageReasonId") UUID wastageReasonId
);
    @GET
    @Path("/batches/{batchId}")
    @Produces({ "application/json" })
    @Operation(summary = "Find a batch", description = "", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "batches" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A found batch", content = @Content(schema = @Schema(implementation = Batch.class))),
        @ApiResponse(responseCode = "200", description = "unexpected error", content = @Content(schema = @Schema(implementation = ErrorResponse.class))) })
    Response findBatch( @PathParam("batchId")

 @Parameter(description = "Batch id") UUID batchId
);
    @GET
    @Path("/events/{eventId}")
    @Produces({ "application/json" })
    @Operation(summary = "Find an event", description = "", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "events" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A found event", content = @Content(schema = @Schema(implementation = Event.class))),
        @ApiResponse(responseCode = "200", description = "unexpected error", content = @Content(schema = @Schema(implementation = ErrorResponse.class))) })
    Response findEvent( @PathParam("eventId")

 @Parameter(description = "Event id") UUID eventId
);
    @GET
    @Path("/packageSizes/{packageSizeId}")
    @Produces({ "application/json" })
    @Operation(summary = "Find a package size", description = "", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "packageSizes" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A found package size", content = @Content(schema = @Schema(implementation = PackageSize.class))),
        @ApiResponse(responseCode = "200", description = "unexpected error", content = @Content(schema = @Schema(implementation = ErrorResponse.class))) })
    Response findPackageSize( @PathParam("packageSizeId")

 @Parameter(description = "Wastage reason id") UUID packageSizeId
);
    @GET
    @Path("/performedCultivationActions/{performedCultivationActionId}")
    @Produces({ "application/json" })
    @Operation(summary = "Find a performed cultivation action", description = "", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "performedCultivationActions" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A found performed cultivation action", content = @Content(schema = @Schema(implementation = PerformedCultivationAction.class))),
        @ApiResponse(responseCode = "200", description = "unexpected error", content = @Content(schema = @Schema(implementation = ErrorResponse.class))) })
    Response findPerformedCultivationAction( @PathParam("performedCultivationActionId")

 @Parameter(description = "Wastage reason id") UUID performedCultivationActionId
);
    @GET
    @Path("/products/{productId}")
    @Produces({ "application/json" })
    @Operation(summary = "Find a product", description = "", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "products" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A found product", content = @Content(schema = @Schema(implementation = Product.class))),
        @ApiResponse(responseCode = "200", description = "unexpected error", content = @Content(schema = @Schema(implementation = ErrorResponse.class))) })
    Response findProduct( @PathParam("productId")

 @Parameter(description = "Product id") UUID productId
);
    @GET
    @Path("/productionLines/{productionLineId}")
    @Produces({ "application/json" })
    @Operation(summary = "Find a production line", description = "", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "productionLines" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A found production line", content = @Content(schema = @Schema(implementation = ProductionLine.class))),
        @ApiResponse(responseCode = "200", description = "unexpected error", content = @Content(schema = @Schema(implementation = ErrorResponse.class))) })
    Response findProductionLine( @PathParam("productionLineId")

 @Parameter(description = "Wastage reason id") UUID productionLineId
);
    @GET
    @Path("/seeds/{seedId}")
    @Produces({ "application/json" })
    @Operation(summary = "Find a seed", description = "", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "seeds" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A found seed", content = @Content(schema = @Schema(implementation = Seed.class))),
        @ApiResponse(responseCode = "200", description = "unexpected error", content = @Content(schema = @Schema(implementation = ErrorResponse.class))) })
    Response findSeed( @PathParam("seedId")

 @Parameter(description = "Seed id") UUID seedId
);
    @GET
    @Path("/seedBatches/{seedBatchId}")
    @Produces({ "application/json" })
    @Operation(summary = "Find a seed batch", description = "", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "seedBatches" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A found seed batch", content = @Content(schema = @Schema(implementation = SeedBatch.class))),
        @ApiResponse(responseCode = "200", description = "unexpected error", content = @Content(schema = @Schema(implementation = ErrorResponse.class))) })
    Response findSeedBatch( @PathParam("seedBatchId")

 @Parameter(description = "Wastage reason id") UUID seedBatchId
);
    @GET
    @Path("/teams/{teamId}")
    @Produces({ "application/json" })
    @Operation(summary = "Find a team", description = "", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "teams" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A found team", content = @Content(schema = @Schema(implementation = Team.class))),
        @ApiResponse(responseCode = "200", description = "unexpected error", content = @Content(schema = @Schema(implementation = ErrorResponse.class))) })
    Response findTeam( @PathParam("teamId")

 @Parameter(description = "Team id") UUID teamId
);
    @GET
    @Path("/wastageReasons/{wastageReasonId}")
    @Produces({ "application/json" })
    @Operation(summary = "Find an wastage reason", description = "", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "wastageReasons" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A found wastage reason", content = @Content(schema = @Schema(implementation = WastageReason.class))),
        @ApiResponse(responseCode = "200", description = "unexpected error", content = @Content(schema = @Schema(implementation = ErrorResponse.class))) })
    Response findWastageReason( @PathParam("wastageReasonId")

 @Parameter(description = "Wastage reason id") UUID wastageReasonId
);
    @GET
    @Path("/reports/{type}")
    @Produces({ "application/vnd.ms-excel", "application/json" })
    @Operation(summary = "Constructs report", description = "", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "reports" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Excel report", content = @Content(schema = @Schema(implementation = File.class))),
        @ApiResponse(responseCode = "200", description = "unexpected error", content = @Content(schema = @Schema(implementation = ErrorResponse.class))) })
    Response getReport( @PathParam("type")

 @Parameter(description = "Report type") String type
);
    @GET
    @Path("/batches")
    @Produces({ "application/json" })
    @Operation(summary = "List all batches", description = "", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "batches" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A paged array of batches", content = @Content(array = @ArraySchema(schema = @Schema(implementation = Batch.class)))),
        @ApiResponse(responseCode = "200", description = "unexpected error", content = @Content(schema = @Schema(implementation = ErrorResponse.class))) })
    Response listBatches(  @QueryParam("firstResult") 

 @Parameter(description = "Where to start listing")  Integer firstResult
,  @QueryParam("maxResult") 

 @Parameter(description = "How many items to return at one time")  Integer maxResult
,  @QueryParam("createdBefore") 

 @Parameter(description = "Created before time")  OffsetDateTime createdBefore
,  @QueryParam("createdAfter") 

 @Parameter(description = "Created after time")  OffsetDateTime createdAfter
);
    @GET
    @Path("/events")
    @Produces({ "application/json" })
    @Operation(summary = "List all events", description = "", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "events" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A paged array of events", content = @Content(array = @ArraySchema(schema = @Schema(implementation = Event.class)))),
        @ApiResponse(responseCode = "200", description = "unexpected error", content = @Content(schema = @Schema(implementation = ErrorResponse.class))) })
    Response listEvents(  @QueryParam("firstResult") 

 @Parameter(description = "First index of results to be returned")  Integer firstResult
,  @QueryParam("maxResults") 

 @Parameter(description = "How many items to return at one time")  Integer maxResults
,  @QueryParam("batchId") 

 @Parameter(description = "Filter results by batch id")  UUID batchId
);
    @GET
    @Path("/packageSizes")
    @Produces({ "application/json" })
    @Operation(summary = "List all package sizes", description = "", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "packageSizes" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A paged array of package sizes", content = @Content(array = @ArraySchema(schema = @Schema(implementation = PackageSize.class)))),
        @ApiResponse(responseCode = "200", description = "unexpected error", content = @Content(schema = @Schema(implementation = ErrorResponse.class))) })
    Response listPackageSizes(  @QueryParam("firstResult") 

 @Parameter(description = "First index of results to be returned")  Integer firstResult
,  @QueryParam("maxResults") 

 @Parameter(description = "How many items to return at one time")  Integer maxResults
);
    @GET
    @Path("/performedCultivationActions")
    @Produces({ "application/json" })
    @Operation(summary = "List all performed cultivation actions", description = "", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "performedCultivationActions" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A paged array of performed cultivation actions", content = @Content(array = @ArraySchema(schema = @Schema(implementation = PerformedCultivationAction.class)))),
        @ApiResponse(responseCode = "200", description = "unexpected error", content = @Content(schema = @Schema(implementation = ErrorResponse.class))) })
    Response listPerformedCultivationActions(  @QueryParam("firstResult") 

 @Parameter(description = "First index of results to be returned")  Integer firstResult
,  @QueryParam("maxResults") 

 @Parameter(description = "How many items to return at one time")  Integer maxResults
);
    @GET
    @Path("/productionLines")
    @Produces({ "application/json" })
    @Operation(summary = "List all production lines", description = "", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "productionLines" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A paged array of production lines", content = @Content(array = @ArraySchema(schema = @Schema(implementation = ProductionLine.class)))),
        @ApiResponse(responseCode = "200", description = "unexpected error", content = @Content(schema = @Schema(implementation = ErrorResponse.class))) })
    Response listProductionLines(  @QueryParam("firstResult") 

 @Parameter(description = "First index of results to be returned")  Integer firstResult
,  @QueryParam("maxResults") 

 @Parameter(description = "How many items to return at one time")  Integer maxResults
);
    @GET
    @Path("/products")
    @Produces({ "application/json" })
    @Operation(summary = "List all products", description = "", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "products" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A paged array of products", content = @Content(array = @ArraySchema(schema = @Schema(implementation = Product.class)))),
        @ApiResponse(responseCode = "200", description = "unexpected error", content = @Content(schema = @Schema(implementation = ErrorResponse.class))) })
    Response listProducts(  @QueryParam("firstResult") 

 @Parameter(description = "First index of results to be returned")  Integer firstResult
,  @QueryParam("maxResults") 

 @Parameter(description = "How many items to return at one time")  Integer maxResults
);
    @GET
    @Path("/seedBatches")
    @Produces({ "application/json" })
    @Operation(summary = "List all seed batches", description = "", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "seedBatches" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A paged array of seed batches", content = @Content(array = @ArraySchema(schema = @Schema(implementation = SeedBatch.class)))),
        @ApiResponse(responseCode = "200", description = "unexpected error", content = @Content(schema = @Schema(implementation = ErrorResponse.class))) })
    Response listSeedBatches(  @QueryParam("firstResult") 

 @Parameter(description = "First index of results to be returned")  Integer firstResult
,  @QueryParam("maxResults") 

 @Parameter(description = "How many items to return at one time")  Integer maxResults
);
    @GET
    @Path("/seeds")
    @Produces({ "application/json" })
    @Operation(summary = "List all seeds", description = "", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "seeds" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A paged array of seeds", content = @Content(array = @ArraySchema(schema = @Schema(implementation = Seed.class)))),
        @ApiResponse(responseCode = "200", description = "unexpected error", content = @Content(schema = @Schema(implementation = ErrorResponse.class))) })
    Response listSeeds(  @QueryParam("firstResult") 

 @Parameter(description = "First index of results to be returned")  Integer firstResult
,  @QueryParam("maxResults") 

 @Parameter(description = "How many items to return at one time")  Integer maxResults
);
    @GET
    @Path("/teams")
    @Produces({ "application/json" })
    @Operation(summary = "List all teams", description = "", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "teams" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A paged array of teams", content = @Content(array = @ArraySchema(schema = @Schema(implementation = Team.class)))),
        @ApiResponse(responseCode = "200", description = "unexpected error", content = @Content(schema = @Schema(implementation = ErrorResponse.class))) })
    Response listTeams(  @QueryParam("firstResult") 

 @Parameter(description = "First index of results to be returned")  Integer firstResult
,  @QueryParam("maxResults") 

 @Parameter(description = "How many items to return at one time")  Integer maxResults
);
    @GET
    @Path("/wastageReasons")
    @Produces({ "application/json" })
    @Operation(summary = "List all wastage reasons", description = "", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "wastageReasons" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A paged array of wastage reasons", content = @Content(array = @ArraySchema(schema = @Schema(implementation = WastageReason.class)))),
        @ApiResponse(responseCode = "200", description = "unexpected error", content = @Content(schema = @Schema(implementation = ErrorResponse.class))) })
    Response listWastageReasons(  @QueryParam("firstResult") 

 @Parameter(description = "First index of results to be returned")  Integer firstResult
,  @QueryParam("maxResults") 

 @Parameter(description = "How many items to return at one time")  Integer maxResults
);
    @PUT
    @Path("/batches/{batchId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @Operation(summary = "Updates a batch", description = "", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "batches" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "An updated batch", content = @Content(schema = @Schema(implementation = Batch.class))),
        @ApiResponse(responseCode = "200", description = "unexpected error", content = @Content(schema = @Schema(implementation = ErrorResponse.class))) })
    Response updateBatch(@Valid Batch body, @PathParam("batchId")

 @Parameter(description = "Batch id") UUID batchId
);
    @PUT
    @Path("/events/{eventId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @Operation(summary = "Updates an event", description = "", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "events" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "An updated event", content = @Content(schema = @Schema(implementation = Event.class))),
        @ApiResponse(responseCode = "200", description = "unexpected error", content = @Content(schema = @Schema(implementation = ErrorResponse.class))) })
    Response updateEvent(@Valid Event body, @PathParam("eventId")

 @Parameter(description = "Event id") UUID eventId
);
    @PUT
    @Path("/packageSizes/{packageSizeId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @Operation(summary = "Updates a package size", description = "", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "packageSizes" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "An updated package size", content = @Content(schema = @Schema(implementation = PackageSize.class))),
        @ApiResponse(responseCode = "200", description = "unexpected error", content = @Content(schema = @Schema(implementation = ErrorResponse.class))) })
    Response updatePackageSize(@Valid PackageSize body, @PathParam("packageSizeId")

 @Parameter(description = "Wastage reason id") UUID packageSizeId
);
    @PUT
    @Path("/performedCultivationActions/{performedCultivationActionId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @Operation(summary = "Updates a performed cultivation action", description = "", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "performedCultivationActions" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "An updated performed cultivation action", content = @Content(schema = @Schema(implementation = PerformedCultivationAction.class))),
        @ApiResponse(responseCode = "200", description = "unexpected error", content = @Content(schema = @Schema(implementation = ErrorResponse.class))) })
    Response updatePerformedCultivationAction(@Valid PerformedCultivationAction body, @PathParam("performedCultivationActionId")

 @Parameter(description = "Wastage reason id") UUID performedCultivationActionId
);
    @PUT
    @Path("/products/{productId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @Operation(summary = "Updates a product", description = "", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "products" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "An updated product", content = @Content(schema = @Schema(implementation = Product.class))),
        @ApiResponse(responseCode = "200", description = "unexpected error", content = @Content(schema = @Schema(implementation = ErrorResponse.class))) })
    Response updateProduct(@Valid Product body, @PathParam("productId")

 @Parameter(description = "Product id") UUID productId
);
    @PUT
    @Path("/productionLines/{productionLineId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @Operation(summary = "Updates a production line", description = "", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "productionLines" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "An updated production line", content = @Content(schema = @Schema(implementation = ProductionLine.class))),
        @ApiResponse(responseCode = "200", description = "unexpected error", content = @Content(schema = @Schema(implementation = ErrorResponse.class))) })
    Response updateProductionLine(@Valid ProductionLine body, @PathParam("productionLineId")

 @Parameter(description = "Wastage reason id") UUID productionLineId
);
    @PUT
    @Path("/seeds/{seedId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @Operation(summary = "Updates a seed", description = "", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "seeds" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "An updated seed", content = @Content(schema = @Schema(implementation = Seed.class))),
        @ApiResponse(responseCode = "200", description = "unexpected error", content = @Content(schema = @Schema(implementation = ErrorResponse.class))) })
    Response updateSeed(@Valid Seed body, @PathParam("seedId")

 @Parameter(description = "Seed id") UUID seedId
);
    @PUT
    @Path("/seedBatches/{seedBatchId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @Operation(summary = "Updates a seed batch", description = "", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "seedBatches" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "An updated seed batch", content = @Content(schema = @Schema(implementation = SeedBatch.class))),
        @ApiResponse(responseCode = "200", description = "unexpected error", content = @Content(schema = @Schema(implementation = ErrorResponse.class))) })
    Response updateSeedBatch(@Valid SeedBatch body, @PathParam("seedBatchId")

 @Parameter(description = "Wastage reason id") UUID seedBatchId
);
    @PUT
    @Path("/teams/{teamId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @Operation(summary = "Updates a team", description = "", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "teams" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "An updated team", content = @Content(schema = @Schema(implementation = Team.class))),
        @ApiResponse(responseCode = "200", description = "unexpected error", content = @Content(schema = @Schema(implementation = ErrorResponse.class))) })
    Response updateTeam(@Valid Team body, @PathParam("teamId")

 @Parameter(description = "Team id") UUID teamId
);
    @PUT
    @Path("/wastageReasons/{wastageReasonId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @Operation(summary = "Updates an wastage reason", description = "", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "wastageReasons" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "An updated wastage reason", content = @Content(schema = @Schema(implementation = WastageReason.class))),
        @ApiResponse(responseCode = "200", description = "unexpected error", content = @Content(schema = @Schema(implementation = ErrorResponse.class))) })
    Response updateWastageReason(@Valid WastageReason body, @PathParam("wastageReasonId")

 @Parameter(description = "Wastage reason id") UUID wastageReasonId
);}
