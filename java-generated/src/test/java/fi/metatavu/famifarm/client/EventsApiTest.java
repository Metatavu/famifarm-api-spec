package fi.metatavu.famifarm.client;

import fi.metatavu.famifarm.ApiClient;
import fi.metatavu.famifarm.client.model.ErrorResponse;
import fi.metatavu.famifarm.client.model.Event;
import java.util.UUID;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EventsApi
 */
public class EventsApiTest {

    private EventsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(EventsApi.class);
    }

    /**
     * Create new event
     *
     * 
     */
    @Test
    public void createEventTest() {
        Event body = null;
        // Event response = api.createEvent(body);

        // TODO: test validations
    }

    /**
     * Deletes an event
     *
     * 
     */
    @Test
    public void deleteEventTest() {
        UUID eventId = null;
        // api.deleteEvent(eventId);

        // TODO: test validations
    }

    /**
     * Find an event
     *
     * 
     */
    @Test
    public void findEventTest() {
        UUID eventId = null;
        // Event response = api.findEvent(eventId);

        // TODO: test validations
    }

    /**
     * List all events
     *
     * 
     */
    @Test
    public void listEventsTest() {
        Integer firstResult = null;
        Integer maxResults = null;
        UUID batchId = null;
        // List<Event> response = api.listEvents(firstResult, maxResults, batchId);

        // TODO: test validations
    }

    /**
     * List all events
     *
     * 
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void listEventsTestQueryMap() {
        EventsApi.ListEventsQueryParams queryParams = new EventsApi.ListEventsQueryParams()
            .firstResult(null)
            .maxResults(null)
            .batchId(null);
        // List<Event> response = api.listEvents(queryParams);

    // TODO: test validations
    }
    /**
     * Updates an event
     *
     * 
     */
    @Test
    public void updateEventTest() {
        Event body = null;
        UUID eventId = null;
        // Event response = api.updateEvent(body, eventId);

        // TODO: test validations
    }

}
