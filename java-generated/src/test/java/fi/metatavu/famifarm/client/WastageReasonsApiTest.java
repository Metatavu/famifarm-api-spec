package fi.metatavu.famifarm.client;

import fi.metatavu.famifarm.ApiClient;
import fi.metatavu.famifarm.client.model.Error;
import java.util.UUID;
import fi.metatavu.famifarm.client.model.WastageReason;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WastageReasonsApi
 */
public class WastageReasonsApiTest {

    private WastageReasonsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(WastageReasonsApi.class);
    }

    /**
     * Create new wastage reason
     *
     * 
     */
    @Test
    public void createWastageReasonTest() {
        WastageReason body = null;
        // WastageReason response = api.createWastageReason(body);

        // TODO: test validations
    }

    /**
     * Deletes an wastage reason
     *
     * 
     */
    @Test
    public void deleteWastageReasonTest() {
        UUID wastageReasonId = null;
        // api.deleteWastageReason(wastageReasonId);

        // TODO: test validations
    }

    /**
     * Find an wastage reason
     *
     * 
     */
    @Test
    public void findWastageReasonTest() {
        UUID wastageReasonId = null;
        // WastageReason response = api.findWastageReason(wastageReasonId);

        // TODO: test validations
    }

    /**
     * List all wastage reasons
     *
     * 
     */
    @Test
    public void listWastageReasonsTest() {
        Integer firstResult = null;
        Integer maxResults = null;
        // List<WastageReason> response = api.listWastageReasons(firstResult, maxResults);

        // TODO: test validations
    }

    /**
     * List all wastage reasons
     *
     * 
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void listWastageReasonsTestQueryMap() {
        WastageReasonsApi.ListWastageReasonsQueryParams queryParams = new WastageReasonsApi.ListWastageReasonsQueryParams()
            .firstResult(null)
            .maxResults(null);
        // List<WastageReason> response = api.listWastageReasons(queryParams);

    // TODO: test validations
    }
    /**
     * Updates an wastage reason
     *
     * 
     */
    @Test
    public void updateWastageReasonTest() {
        WastageReason body = null;
        UUID wastageReasonId = null;
        // WastageReason response = api.updateWastageReason(body, wastageReasonId);

        // TODO: test validations
    }

}
