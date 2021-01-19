package fi.metatavu.famifarm.client;

import fi.metatavu.famifarm.ApiClient;
import java.time.OffsetDateTime;
import fi.metatavu.famifarm.EncodingUtils;

import fi.metatavu.famifarm.client.model.ErrorResponse;
import fi.metatavu.famifarm.client.model.Event;
import java.time.OffsetDateTime;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-01-19T13:04:40.726+02:00[Europe/Helsinki]")public interface EventsApi extends ApiClient.Api {

  /**
   * Create new event
   * 
   * @param body Event to be added (required)
   * @return Event
   */
  @RequestLine("POST /v1/events")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  Event createEvent(Event body);
  /**
   * Deletes an event
   * 
   * @param eventId Event id (required)
   */
  @RequestLine("DELETE /v1/events/{eventId}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  void deleteEvent(@Param("eventId") UUID eventId);
  /**
   * Find an event
   * 
   * @param eventId Event id (required)
   * @return Event
   */
  @RequestLine("GET /v1/events/{eventId}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  Event findEvent(@Param("eventId") UUID eventId);
  /**
   * List all events
   * 
   * @param firstResult First index of results to be returned (optional)
   * @param maxResults How many items to return at one time (optional)
   * @param productId Filter results by productId (optional)
   * @param createdAfter Filter results by created after (optional)
   * @param createdBefore Filter results by created before (optional)
   * @return List&lt;Event&gt;
   */
  @RequestLine("GET /v1/events?firstResult={firstResult}&maxResults={maxResults}&productId={productId}&createdAfter={createdAfter}&createdBefore={createdBefore}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  List<Event> listEvents(@Param("firstResult") Integer firstResult, @Param("maxResults") Integer maxResults, @Param("productId") UUID productId, @Param("createdAfter") OffsetDateTime createdAfter, @Param("createdBefore") OffsetDateTime createdBefore);

  /**
   * List all events
   * 
   * Note, this is equivalent to the other <code>listEvents</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListEventsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>firstResult - First index of results to be returned (optional)</li>
   *   <li>maxResults - How many items to return at one time (optional)</li>
   *   <li>productId - Filter results by productId (optional)</li>
   *   <li>createdAfter - Filter results by created after (optional)</li>
   *   <li>createdBefore - Filter results by created before (optional)</li>
   *   </ul>
   * @return List&lt;Event&gt;

   */
  @RequestLine("GET /v1/events?firstResult={firstResult}&maxResults={maxResults}&productId={productId}&createdAfter={createdAfter}&createdBefore={createdBefore}")
  @Headers({
      "Content-Type: application/json",
  })
  List<Event> listEvents(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>listEvents</code> method in a fluent style.
   */
  public static class ListEventsQueryParams extends HashMap<String, Object> {
    public ListEventsQueryParams firstResult(final Integer value) {
      put("firstResult", EncodingUtils.encode(value));
      return this;
    }
    public ListEventsQueryParams maxResults(final Integer value) {
      put("maxResults", EncodingUtils.encode(value));
      return this;
    }
    public ListEventsQueryParams productId(final UUID value) {
      put("productId", EncodingUtils.encode(value));
      return this;
    }
    public ListEventsQueryParams createdAfter(final OffsetDateTime value) {
      put("createdAfter", EncodingUtils.encode(value));
      return this;
    }
    public ListEventsQueryParams createdBefore(final OffsetDateTime value) {
      put("createdBefore", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * Updates an event
   * 
   * @param body Request payload (required)
   * @param eventId Event id (required)
   * @return Event
   */
  @RequestLine("PUT /v1/events/{eventId}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  Event updateEvent(Event body, @Param("eventId") UUID eventId);
}
