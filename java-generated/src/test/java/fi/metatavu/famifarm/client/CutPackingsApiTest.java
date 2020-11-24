package fi.metatavu.famifarm.client;

import fi.metatavu.famifarm.ApiClient;
import fi.metatavu.famifarm.client.model.CutPacking;
import fi.metatavu.famifarm.client.model.ErrorResponse;
import java.util.UUID;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CutPackingsApi
 */
public class CutPackingsApiTest {

    private CutPackingsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(CutPackingsApi.class);
    }

    /**
     * Create a new cut packing
     *
     * 
     */
    @Test
    public void createCutPackingTest() {
        CutPacking body = null;
        // CutPacking response = api.createCutPacking(body);

        // TODO: test validations
    }

    /**
     * Deletes a cut packing
     *
     * 
     */
    @Test
    public void deleteCutPackingTest() {
        UUID cutPackingId = null;
        // api.deleteCutPacking(cutPackingId);

        // TODO: test validations
    }

    /**
     * Find a cut packing
     *
     * 
     */
    @Test
    public void findCutPackingTest() {
        UUID cutPackingId = null;
        // CutPacking response = api.findCutPacking(cutPackingId);

        // TODO: test validations
    }

    /**
     * List all cut packings
     *
     * 
     */
    @Test
    public void listCutPackingsTest() {
        Integer firstResult = null;
        Integer maxResults = null;
        UUID productId = null;
        String createdBefore = null;
        String createdAfter = null;
        // List<CutPacking> response = api.listCutPackings(firstResult, maxResults, productId, createdBefore, createdAfter);

        // TODO: test validations
    }

    /**
     * List all cut packings
     *
     * 
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void listCutPackingsTestQueryMap() {
        CutPackingsApi.ListCutPackingsQueryParams queryParams = new CutPackingsApi.ListCutPackingsQueryParams()
            .firstResult(null)
            .maxResults(null)
            .productId(null)
            .createdBefore(null)
            .createdAfter(null);
        // List<CutPacking> response = api.listCutPackings(queryParams);

    // TODO: test validations
    }
    /**
     * Updates a cut packing
     *
     * 
     */
    @Test
    public void updateCutPackingTest() {
        CutPacking body = null;
        UUID cutPackingId = null;
        // CutPacking response = api.updateCutPacking(body, cutPackingId);

        // TODO: test validations
    }

}
