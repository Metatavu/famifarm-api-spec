package fi.metatavu.famifarm.client;

import fi.metatavu.famifarm.ApiClient;
import fi.metatavu.famifarm.client.model.Error;
import fi.metatavu.famifarm.client.model.Team;
import java.util.UUID;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TeamsApi
 */
public class TeamsApiTest {

    private TeamsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(TeamsApi.class);
    }

    /**
     * Create new team
     *
     * 
     */
    @Test
    public void createTeamTest() {
        Team body = null;
        // Team response = api.createTeam(body);

        // TODO: test validations
    }

    /**
     * Deletes a team
     *
     * 
     */
    @Test
    public void deleteTeamTest() {
        UUID teamId = null;
        // api.deleteTeam(teamId);

        // TODO: test validations
    }

    /**
     * Find a team
     *
     * 
     */
    @Test
    public void findTeamTest() {
        UUID teamId = null;
        // Team response = api.findTeam(teamId);

        // TODO: test validations
    }

    /**
     * List all teams
     *
     * 
     */
    @Test
    public void listTeamsTest() {
        Integer firstResult = null;
        Integer maxResults = null;
        // List<Team> response = api.listTeams(firstResult, maxResults);

        // TODO: test validations
    }

    /**
     * List all teams
     *
     * 
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void listTeamsTestQueryMap() {
        TeamsApi.ListTeamsQueryParams queryParams = new TeamsApi.ListTeamsQueryParams()
            .firstResult(null)
            .maxResults(null);
        // List<Team> response = api.listTeams(queryParams);

    // TODO: test validations
    }
    /**
     * Updates a team
     *
     * 
     */
    @Test
    public void updateTeamTest() {
        Team body = null;
        UUID teamId = null;
        // Team response = api.updateTeam(body, teamId);

        // TODO: test validations
    }

}
