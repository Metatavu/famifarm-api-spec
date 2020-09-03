package fi.metatavu.famifarm.client;

import fi.metatavu.famifarm.ApiClient;
import fi.metatavu.famifarm.client.model.Campaign;
import fi.metatavu.famifarm.client.model.ErrorResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CampaignsApi
 */
public class CampaignsApiTest {

    private CampaignsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(CampaignsApi.class);
    }

    /**
     * Create a campaign
     *
     * 
     */
    @Test
    public void createCampaignTest() {
        Campaign body = null;
        // Campaign response = api.createCampaign(body);

        // TODO: test validations
    }

    /**
     * Delete a campaign
     *
     * 
     */
    @Test
    public void deleteCampaignTest() {
        String campaignId = null;
        // api.deleteCampaign(campaignId);

        // TODO: test validations
    }

    /**
     * Find a campaign
     *
     * 
     */
    @Test
    public void findCampaignTest() {
        String campaignId = null;
        // Campaign response = api.findCampaign(campaignId);

        // TODO: test validations
    }

    /**
     * List all campaigns
     *
     * 
     */
    @Test
    public void listCampaignsTest() {
        // List<Campaign> response = api.listCampaigns();

        // TODO: test validations
    }

    /**
     * Update a campaign
     *
     * 
     */
    @Test
    public void updateCampaignTest() {
        Campaign body = null;
        String campaignId = null;
        // Campaign response = api.updateCampaign(body, campaignId);

        // TODO: test validations
    }

}
