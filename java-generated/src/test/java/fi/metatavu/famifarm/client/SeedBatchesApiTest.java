package fi.metatavu.famifarm.client;

import fi.metatavu.famifarm.ApiClient;
import fi.metatavu.famifarm.client.model.Error;
import fi.metatavu.famifarm.client.model.SeedBatch;
import java.util.UUID;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SeedBatchesApi
 */
public class SeedBatchesApiTest {

    private SeedBatchesApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(SeedBatchesApi.class);
    }

    /**
     * Create new seed batch
     *
     * 
     */
    @Test
    public void createSeedBatchTest() {
        SeedBatch body = null;
        // SeedBatch response = api.createSeedBatch(body);

        // TODO: test validations
    }

    /**
     * Deletes a seed batch
     *
     * 
     */
    @Test
    public void deleteSeedBatchTest() {
        UUID seedBatchId = null;
        // api.deleteSeedBatch(seedBatchId);

        // TODO: test validations
    }

    /**
     * Find a seed batch
     *
     * 
     */
    @Test
    public void findSeedBatchTest() {
        UUID seedBatchId = null;
        // SeedBatch response = api.findSeedBatch(seedBatchId);

        // TODO: test validations
    }

    /**
     * List all seed batches
     *
     * 
     */
    @Test
    public void listSeedBatchesTest() {
        Integer firstResult = null;
        Integer maxResults = null;
        // List<SeedBatch> response = api.listSeedBatches(firstResult, maxResults);

        // TODO: test validations
    }

    /**
     * List all seed batches
     *
     * 
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void listSeedBatchesTestQueryMap() {
        SeedBatchesApi.ListSeedBatchesQueryParams queryParams = new SeedBatchesApi.ListSeedBatchesQueryParams()
            .firstResult(null)
            .maxResults(null);
        // List<SeedBatch> response = api.listSeedBatches(queryParams);

    // TODO: test validations
    }
    /**
     * Updates a seed batch
     *
     * 
     */
    @Test
    public void updateSeedBatchTest() {
        SeedBatch body = null;
        UUID seedBatchId = null;
        // SeedBatch response = api.updateSeedBatch(body, seedBatchId);

        // TODO: test validations
    }

}
