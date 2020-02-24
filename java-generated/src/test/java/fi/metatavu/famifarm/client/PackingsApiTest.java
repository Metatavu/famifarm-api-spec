package fi.metatavu.famifarm.client;

import fi.metatavu.famifarm.ApiClient;
import fi.metatavu.famifarm.client.model.ErrorResponse;
import fi.metatavu.famifarm.client.model.Packing;
import fi.metatavu.famifarm.client.model.PackingState;
import java.util.UUID;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PackingsApi
 */
public class PackingsApiTest {

    private PackingsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(PackingsApi.class);
    }

    /**
     * Deletes a packing
     *
     * 
     */
    @Test
    public void deletePackingTest() {
        UUID packingId = null;
        // api.deletePacking(packingId);

        // TODO: test validations
    }

    /**
     * Find a packing
     *
     * 
     */
    @Test
    public void findPackingTest() {
        UUID packingId = null;
        // Packing response = api.findPacking(packingId);

        // TODO: test validations
    }

    /**
     * List all packings
     *
     * 
     */
    @Test
    public void listPackingsTest() {
        Integer firstResult = null;
        Integer maxResults = null;
        UUID productId = null;
        PackingState status = null;
        String createdBefore = null;
        String createdAfter = null;
        // List<Packing> response = api.listPackings(firstResult, maxResults, productId, status, createdBefore, createdAfter);

        // TODO: test validations
    }

    /**
     * List all packings
     *
     * 
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void listPackingsTestQueryMap() {
        PackingsApi.ListPackingsQueryParams queryParams = new PackingsApi.ListPackingsQueryParams()
            .firstResult(null)
            .maxResults(null)
            .productId(null)
            .status(null)
            .createdBefore(null)
            .createdAfter(null);
        // List<Packing> response = api.listPackings(queryParams);

    // TODO: test validations
    }
    /**
     * Updates a packing
     *
     * 
     */
    @Test
    public void updatePackingTest() {
        Packing body = null;
        UUID packingId = null;
        // Packing response = api.updatePacking(body, packingId);

        // TODO: test validations
    }

}
