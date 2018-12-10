package fi.metatavu.famifarm.client;

import fi.metatavu.famifarm.ApiClient;
import fi.metatavu.famifarm.client.model.Error;
import fi.metatavu.famifarm.client.model.Seed;
import java.util.UUID;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SeedsApi
 */
public class SeedsApiTest {

    private SeedsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(SeedsApi.class);
    }

    /**
     * Create new seed
     *
     * 
     */
    @Test
    public void createSeedTest() {
        Seed body = null;
        // Seed response = api.createSeed(body);

        // TODO: test validations
    }

    /**
     * Deletes a seed
     *
     * 
     */
    @Test
    public void deleteSeedTest() {
        UUID seedId = null;
        // api.deleteSeed(seedId);

        // TODO: test validations
    }

    /**
     * Find a seed
     *
     * 
     */
    @Test
    public void findSeedTest() {
        UUID seedId = null;
        // Seed response = api.findSeed(seedId);

        // TODO: test validations
    }

    /**
     * List all seeds
     *
     * 
     */
    @Test
    public void listSeedsTest() {
        Integer firstResult = null;
        Integer maxResults = null;
        // List<Seed> response = api.listSeeds(firstResult, maxResults);

        // TODO: test validations
    }

    /**
     * List all seeds
     *
     * 
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void listSeedsTestQueryMap() {
        SeedsApi.ListSeedsQueryParams queryParams = new SeedsApi.ListSeedsQueryParams()
            .firstResult(null)
            .maxResults(null);
        // List<Seed> response = api.listSeeds(queryParams);

    // TODO: test validations
    }
    /**
     * Updates a seed
     *
     * 
     */
    @Test
    public void updateSeedTest() {
        Seed body = null;
        UUID seedId = null;
        // Seed response = api.updateSeed(body, seedId);

        // TODO: test validations
    }

}
