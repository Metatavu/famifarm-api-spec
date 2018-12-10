package fi.metatavu.famifarm.client;

import fi.metatavu.famifarm.ApiClient;
import fi.metatavu.famifarm.client.model.Error;
import fi.metatavu.famifarm.client.model.ProductionLine;
import java.util.UUID;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProductionLinesApi
 */
public class ProductionLinesApiTest {

    private ProductionLinesApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(ProductionLinesApi.class);
    }

    /**
     * Create new production line
     *
     * 
     */
    @Test
    public void createProductionLineTest() {
        ProductionLine body = null;
        // ProductionLine response = api.createProductionLine(body);

        // TODO: test validations
    }

    /**
     * Deletes a production line
     *
     * 
     */
    @Test
    public void deleteProductionLineTest() {
        UUID productionLineId = null;
        // api.deleteProductionLine(productionLineId);

        // TODO: test validations
    }

    /**
     * Find a production line
     *
     * 
     */
    @Test
    public void findProductionLineTest() {
        UUID productionLineId = null;
        // ProductionLine response = api.findProductionLine(productionLineId);

        // TODO: test validations
    }

    /**
     * List all production lines
     *
     * 
     */
    @Test
    public void listProductionLinesTest() {
        Integer firstResult = null;
        Integer maxResults = null;
        // List<ProductionLine> response = api.listProductionLines(firstResult, maxResults);

        // TODO: test validations
    }

    /**
     * List all production lines
     *
     * 
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void listProductionLinesTestQueryMap() {
        ProductionLinesApi.ListProductionLinesQueryParams queryParams = new ProductionLinesApi.ListProductionLinesQueryParams()
            .firstResult(null)
            .maxResults(null);
        // List<ProductionLine> response = api.listProductionLines(queryParams);

    // TODO: test validations
    }
    /**
     * Updates a production line
     *
     * 
     */
    @Test
    public void updateProductionLineTest() {
        ProductionLine body = null;
        UUID productionLineId = null;
        // ProductionLine response = api.updateProductionLine(body, productionLineId);

        // TODO: test validations
    }

}
