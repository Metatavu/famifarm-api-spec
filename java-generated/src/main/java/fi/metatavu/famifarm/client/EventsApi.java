package fi.metatavu.famifarm.client;

import fi.metatavu.famifarm.ApiClient;
import java.time.OffsetDateTime;
import fi.metatavu.famifarm.EncodingUtils;

import fi.metatavu.famifarm.client.model.ErrorResponse;
import fi.metatavu.famifarm.client.model.Event;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-02-20T19:21:39.764+02:00[Europe/Helsinki]")public interface EventsApi extends ApiClient.Api {

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
   * @param batchId Filter results by batch id (optional)
   * @return List&lt;Event&gt;
   */
  @RequestLine("GET /v1/events?firstResult={firstResult}&maxResults={maxResults}&batchId={batchId}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  List<Event> listEvents(@Param("firstResult") Integer firstResult, @Param("maxResults") Integer maxResults, @Param("batchId") UUID batchId);

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
   *   <li>batchId - Filter results by batch id (optional)</li>
   *   </ul>
   * @return List&lt;Event&gt;

   */
  @RequestLine("GET /v1/events?firstResult={firstResult}&maxResults={maxResults}&batchId={batchId}")
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
    public ListEventsQueryParams batchId(final UUID value) {
      put("batchId", EncodingUtils.encode(value));
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
