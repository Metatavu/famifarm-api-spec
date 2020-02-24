package fi.metatavu.famifarm.client;

import fi.metatavu.famifarm.ApiClient;
import fi.metatavu.famifarm.client.model.ErrorResponse;
import fi.metatavu.famifarm.client.model.Packing;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PackingApi
 */
public class PackingApiTest {

    private PackingApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(PackingApi.class);
    }

    /**
     * Create new packing
     *
     * 
     */
    @Test
    public void createPackagingTest() {
        Packing body = null;
        // Packing response = api.createPackaging(body);

        // TODO: test validations
    }

}
