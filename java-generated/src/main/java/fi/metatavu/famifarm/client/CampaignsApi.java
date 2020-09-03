package fi.metatavu.famifarm.client;

import fi.metatavu.famifarm.ApiClient;
import java.time.OffsetDateTime;
import fi.metatavu.famifarm.EncodingUtils;

import fi.metatavu.famifarm.client.model.Campaign;
import fi.metatavu.famifarm.client.model.ErrorResponse;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-09-03T16:19:25.038+03:00[Europe/Helsinki]")public interface CampaignsApi extends ApiClient.Api {

  /**
   * Create a campaign
   * 
   * @param body A campaign to create (required)
   * @return Campaign
   */
  @RequestLine("POST /v1/campaigns")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  Campaign createCampaign(Campaign body);
  /**
   * Delete a campaign
   * 
   * @param campaignId  (required)
   */
  @RequestLine("DELETE /v1/campaigns/{campaignId}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  void deleteCampaign(@Param("campaignId") UUID campaignId);
  /**
   * Find a campaign
   * 
   * @param campaignId  (required)
   * @return Campaign
   */
  @RequestLine("GET /v1/campaigns/{campaignId}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  Campaign findCampaign(@Param("campaignId") UUID campaignId);
  /**
   * List all campaigns
   * 
   * @return List&lt;Campaign&gt;
   */
  @RequestLine("GET /v1/campaigns")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  List<Campaign> listCampaigns();
  /**
   * Update a campaign
   * 
   * @param body An updated campaign (required)
   * @param campaignId  (required)
   * @return Campaign
   */
  @RequestLine("PUT /v1/campaigns/{campaignId}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  Campaign updateCampaign(Campaign body, @Param("campaignId") UUID campaignId);
}
