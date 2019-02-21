package fi.metatavu.famifarm.client;

import fi.metatavu.famifarm.ApiClient;
import fi.metatavu.famifarm.client.model.ErrorResponse;
import java.io.File;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ReportsApi
 */
public class ReportsApiTest {

    private ReportsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(ReportsApi.class);
    }

    /**
     * Constructs report
     *
     * 
     */
    @Test
    public void getReportTest() {
        String type = null;
        String fromTime = null;
        String toTime = null;
        // File response = api.getReport(type, fromTime, toTime);

        // TODO: test validations
    }

    /**
     * Constructs report
     *
     * 
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getReportTestQueryMap() {
        String type = null;
        ReportsApi.GetReportQueryParams queryParams = new ReportsApi.GetReportQueryParams()
            .fromTime(null)
            .toTime(null);
        // File response = api.getReport(type, queryParams);

    // TODO: test validations
    }
}
