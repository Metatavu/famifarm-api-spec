package fi.metatavu.famifarm.client;

import fi.metatavu.famifarm.ApiClient;
import fi.metatavu.famifarm.EncodingUtils;

import fi.metatavu.famifarm.client.model.Error;
import fi.metatavu.famifarm.client.model.Team;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-12-10T07:26:39.900+02:00[Europe/Helsinki]")public interface TeamsApi extends ApiClient.Api {

  /**
   * Create new team
   * 
   * @param body Team to be added (required)
   * @return Team
   */
  @RequestLine("POST /teams")
  @Headers({
      "Accept: */*",
  })
  Team createTeam(Team body);
  /**
   * Deletes a team
   * 
   * @param teamId Team id (required)
   */
  @RequestLine("DELETE /teams/{teamId}")
  @Headers({
      "Accept: */*",
  })
  void deleteTeam(@Param("teamId") UUID teamId);
  /**
   * Find a team
   * 
   * @param teamId Team id (required)
   * @return Team
   */
  @RequestLine("GET /teams/{teamId}")
  @Headers({
      "Accept: */*",
  })
  Team findTeam(@Param("teamId") UUID teamId);
  /**
   * List all teams
   * 
   * @param firstResult First index of results to be returned (optional)
   * @param maxResults How many items to return at one time (optional)
   * @return List&lt;Team&gt;
   */
  @RequestLine("GET /teams?firstResult={firstResult}&maxResults={maxResults}")
  @Headers({
      "Accept: */*",
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
  @RequestLine("GET /teams?firstResult={firstResult}&maxResults={maxResults}")
  @Headers({
      "Content-Type: */*",
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
  @RequestLine("PUT /teams/{teamId}")
  @Headers({
      "Accept: */*",
  })
  Team updateTeam(Team body, @Param("teamId") UUID teamId);
}
