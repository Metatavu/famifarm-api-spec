package fi.metatavu.famifarm.client;

import fi.metatavu.famifarm.ApiClient;
import fi.metatavu.famifarm.client.model.Error;
import fi.metatavu.famifarm.client.model.PerformedCultivationAction;
import java.util.UUID;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PerformedCultivationActionsApi
 */
public class PerformedCultivationActionsApiTest {

    private PerformedCultivationActionsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(PerformedCultivationActionsApi.class);
    }

    /**
     * Create new performed cultivation action
     *
     * 
     */
    @Test
    public void createPerformedCultivationActionTest() {
        PerformedCultivationAction body = null;
        // PerformedCultivationAction response = api.createPerformedCultivationAction(body);

        // TODO: test validations
    }

    /**
     * Deletes a performed cultivation action
     *
     * 
     */
    @Test
    public void deletePerformedCultivationActionTest() {
        UUID performedCultivationActionId = null;
        // api.deletePerformedCultivationAction(performedCultivationActionId);

        // TODO: test validations
    }

    /**
     * Find a performed cultivation action
     *
     * 
     */
    @Test
    public void findPerformedCultivationActionTest() {
        UUID performedCultivationActionId = null;
        // PerformedCultivationAction response = api.findPerformedCultivationAction(performedCultivationActionId);

        // TODO: test validations
    }

    /**
     * List all performed cultivation actions
     *
     * 
     */
    @Test
    public void listPerformedCultivationActionsTest() {
        Integer firstResult = null;
        Integer maxResults = null;
        // List<PerformedCultivationAction> response = api.listPerformedCultivationActions(firstResult, maxResults);

        // TODO: test validations
    }

    /**
     * List all performed cultivation actions
     *
     * 
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void listPerformedCultivationActionsTestQueryMap() {
        PerformedCultivationActionsApi.ListPerformedCultivationActionsQueryParams queryParams = new PerformedCultivationActionsApi.ListPerformedCultivationActionsQueryParams()
            .firstResult(null)
            .maxResults(null);
        // List<PerformedCultivationAction> response = api.listPerformedCultivationActions(queryParams);

    // TODO: test validations
    }
    /**
     * Updates a performed cultivation action
     *
     * 
     */
    @Test
    public void updatePerformedCultivationActionTest() {
        PerformedCultivationAction body = null;
        UUID performedCultivationActionId = null;
        // PerformedCultivationAction response = api.updatePerformedCultivationAction(body, performedCultivationActionId);

        // TODO: test validations
    }

}
