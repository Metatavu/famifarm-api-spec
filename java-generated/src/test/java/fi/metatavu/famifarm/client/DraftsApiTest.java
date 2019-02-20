package fi.metatavu.famifarm.client;

import fi.metatavu.famifarm.ApiClient;
import fi.metatavu.famifarm.client.model.Draft;
import fi.metatavu.famifarm.client.model.ErrorResponse;
import java.util.UUID;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DraftsApi
 */
public class DraftsApiTest {

    private DraftsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(DraftsApi.class);
    }

    /**
     * Create new draft
     *
     * 
     */
    @Test
    public void createDraftTest() {
        Draft body = null;
        // Draft response = api.createDraft(body);

        // TODO: test validations
    }

    /**
     * Deletes a draft
     *
     * 
     */
    @Test
    public void deleteDraftTest() {
        UUID draftId = null;
        // api.deleteDraft(draftId);

        // TODO: test validations
    }

    /**
     * List all drafts
     *
     * 
     */
    @Test
    public void listDraftsTest() {
        UUID userId = null;
        String type = null;
        // List<Draft> response = api.listDrafts(userId, type);

        // TODO: test validations
    }

    /**
     * List all drafts
     *
     * 
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void listDraftsTestQueryMap() {
        DraftsApi.ListDraftsQueryParams queryParams = new DraftsApi.ListDraftsQueryParams()
            .userId(null)
            .type(null);
        // List<Draft> response = api.listDrafts(queryParams);

    // TODO: test validations
    }
}
