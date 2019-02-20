package fi.metatavu.famifarm.client;

import fi.metatavu.famifarm.ApiClient;
import java.time.OffsetDateTime;
import fi.metatavu.famifarm.EncodingUtils;

import fi.metatavu.famifarm.client.model.ErrorResponse;
import fi.metatavu.famifarm.client.model.Team;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-02-20T14:36:54.043+02:00[Europe/Helsinki]")public interface TeamsApi extends ApiClient.Api {

  /**
   * Create new team
   * 
   * @param body Team to be added (required)
   * @return Team
   */
  @RequestLine("POST /v1/teams")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  Team createTeam(Team body);
  /**
   * Deletes a team
   * 
   * @param teamId Team id (required)
   */
  @RequestLine("DELETE /v1/teams/{teamId}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  void deleteTeam(@Param("teamId") UUID teamId);
  /**
   * Find a team
   * 
   * @param teamId Team id (required)
   * @return Team
   */
  @RequestLine("GET /v1/teams/{teamId}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  Team findTeam(@Param("teamId") UUID teamId);
  /**
   * List all teams
   * 
   * @param firstResult First index of results to be returned (optional)
   * @param maxResults How many items to return at one time (optional)
   * @return List&lt;Team&gt;
   */
  @RequestLine("GET /v1/teams?firstResult={firstResult}&maxResults={maxResults}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  List<Team> listTeams(@Param("firstResult") Integer firstResult, @Param("maxResults") Integer maxResults);

  /**
   * List all teams
   * 
   * Note, this is equivalent to the other <code>listTeams</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListTeamsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>firstResult - First index of results to be returned (optional)</li>
   *   <li>maxResults - How many items to return at one time (optional)</li>
   *   </ul>
   * @return List&lt;Team&gt;

   */
  @RequestLine("GET /v1/teams?firstResult={firstResult}&maxResults={maxResults}")
  @Headers({
      "Content-Type: application/json",
  })
  List<Team> listTeams(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>listTeams</code> method in a fluent style.
   */
  public static class ListTeamsQueryParams extends HashMap<String, Object> {
    public ListTeamsQueryParams firstResult(final Integer value) {
      put("firstResult", EncodingUtils.encode(value));
      return this;
    }
    public ListTeamsQueryParams maxResults(final Integer value) {
      put("maxResults", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * Updates a team
   * 
   * @param body Request payload (required)
   * @param teamId Team id (required)
   * @return Team
   */
  @RequestLine("PUT /v1/teams/{teamId}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  Team updateTeam(Team body, @Param("teamId") UUID teamId);
}
