package fi.metatavu.famifarm.client;

import fi.metatavu.famifarm.ApiClient;
import fi.metatavu.famifarm.client.model.Batch;
import fi.metatavu.famifarm.client.model.ErrorResponse;
import java.util.UUID;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BatchesApi
 */
public class BatchesApiTest {

    private BatchesApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(BatchesApi.class);
    }

    /**
     * Create new batch
     *
     * 
     */
    @Test
    public void createBatchTest() {
        Batch body = null;
        // Batch response = api.createBatch(body);

        // TODO: test validations
    }

    /**
     * Deletes a batch
     *
     * 
     */
    @Test
    public void deleteBatchTest() {
        UUID batchId = null;
        // api.deleteBatch(batchId);

        // TODO: test validations
    }

    /**
     * Find a batch
     *
     * 
     */
    @Test
    public void findBatchTest() {
        UUID batchId = null;
        // Batch response = api.findBatch(batchId);

        // TODO: test validations
    }

    /**
     * List all batches
     *
     * 
     */
    @Test
    public void listBatchesTest() {
        Integer firstResult = null;
        Integer maxResult = null;
        String createdBefore = null;
        String createdAfter = null;
        // List<Batch> response = api.listBatches(firstResult, maxResult, createdBefore, createdAfter);

        // TODO: test validations
    }

    /**
     * List all batches
     *
     * 
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void listBatchesTestQueryMap() {
        BatchesApi.ListBatchesQueryParams queryParams = new BatchesApi.ListBatchesQueryParams()
            .firstResult(null)
            .maxResult(null)
            .createdBefore(null)
            .createdAfter(null);
        // List<Batch> response = api.listBatches(queryParams);

    // TODO: test validations
    }
    /**
     * Updates a batch
     *
     * 
     */
    @Test
    public void updateBatchTest() {
        Batch body = null;
        UUID batchId = null;
        // Batch response = api.updateBatch(body, batchId);

        // TODO: test validations
    }

}
