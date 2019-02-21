package fi.metatavu.famifarm.client;

import fi.metatavu.famifarm.ApiClient;
import fi.metatavu.famifarm.client.model.ErrorResponse;
import fi.metatavu.famifarm.client.model.Pest;
import java.util.UUID;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PestsApi
 */
public class PestsApiTest {

    private PestsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(PestsApi.class);
    }

    /**
     * Create new pest
     *
     * 
     */
    @Test
    public void createPestTest() {
        Pest body = null;
        // Pest response = api.createPest(body);

        // TODO: test validations
    }

    /**
     * Deletes a pest
     *
     * 
     */
    @Test
    public void deletePestTest() {
        UUID pestId = null;
        // api.deletePest(pestId);

        // TODO: test validations
    }

    /**
     * Find a pest
     *
     * 
     */
    @Test
    public void findPestTest() {
        UUID pestId = null;
        // Pest response = api.findPest(pestId);

        // TODO: test validations
    }

    /**
     * List all pests
     *
     * 
     */
    @Test
    public void listPestsTest() {
        Integer firstResult = null;
        Integer maxResults = null;
        // List<Pest> response = api.listPests(firstResult, maxResults);

        // TODO: test validations
    }

    /**
     * List all pests
     *
     * 
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void listPestsTestQueryMap() {
        PestsApi.ListPestsQueryParams queryParams = new PestsApi.ListPestsQueryParams()
            .firstResult(null)
            .maxResults(null);
        // List<Pest> response = api.listPests(queryParams);

    // TODO: test validations
    }
    /**
     * Updates a pest
     *
     * 
     */
    @Test
    public void updatePestTest() {
        Pest body = null;
        UUID pestId = null;
        // Pest response = api.updatePest(body, pestId);

        // TODO: test validations
    }

}
