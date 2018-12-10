package fi.metatavu.famifarm.client;

import fi.metatavu.famifarm.ApiClient;
import fi.metatavu.famifarm.EncodingUtils;

import fi.metatavu.famifarm.client.model.Error;
import fi.metatavu.famifarm.client.model.Event;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-12-10T07:26:39.900+02:00[Europe/Helsinki]")public interface EventsApi extends ApiClient.Api {

  /**
   * Create new event
   * 
   * @param body Event to be added (required)
   * @return Event
   */
  @RequestLine("POST /events")
  @Headers({
      "Accept: */*",
  })
  Event createEvent(Event body);
  /**
   * Deletes an event
   * 
   * @param eventId Event id (required)
   */
  @RequestLine("DELETE /events/{eventId}")
  @Headers({
      "Accept: */*",
  })
  void deleteEvent(@Param("eventId") UUID eventId);
  /**
   * Find an event
   * 
   * @param eventId Event id (required)
   * @return Event
   */
  @RequestLine("GET /events/{eventId}")
  @Headers({
      "Accept: */*",
  })
  Event findEvent(@Param("eventId") UUID eventId);
  /**
   * List all events
   * 
   * @param firstResult First index of results to be returned (optional)
   * @param maxResults How many items to return at one time (optional)
   * @return List&lt;Event&gt;
   */
  @RequestLine("GET /events?firstResult={firstResult}&maxResults={maxResults}")
  @Headers({
      "Accept: */*",
  })
  List<Event> listEvents(@Param("firstResult") Integer firstResult, @Param("maxResults") Integer maxResults);

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
   *   </ul>
   * @return List&lt;Event&gt;

   */
  @RequestLine("GET /events?firstResult={firstResult}&maxResults={maxResults}")
  @Headers({
      "Content-Type: */*",
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
  }
  /**
   * Updates an event
   * 
   * @param body Request payload (required)
   * @param eventId Event id (required)
   * @return Event
   */
  @RequestLine("PUT /events/{eventId}")
  @Headers({
      "Accept: */*",
  })
  Event updateEvent(Event body, @Param("eventId") UUID eventId);
}
