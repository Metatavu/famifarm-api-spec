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
        // File response = api.getReport(type);

        // TODO: test validations
    }

}
