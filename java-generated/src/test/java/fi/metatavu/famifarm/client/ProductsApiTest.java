package fi.metatavu.famifarm.client;

import fi.metatavu.famifarm.ApiClient;
import fi.metatavu.famifarm.client.model.ErrorResponse;
import fi.metatavu.famifarm.client.model.Product;
import java.util.UUID;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProductsApi
 */
public class ProductsApiTest {

    private ProductsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(ProductsApi.class);
    }

    /**
     * Create new product
     *
     * 
     */
    @Test
    public void createProductTest() {
        Product body = null;
        // Product response = api.createProduct(body);

        // TODO: test validations
    }

    /**
     * Deletes a product
     *
     * 
     */
    @Test
    public void deleteProductTest() {
        UUID productId = null;
        // api.deleteProduct(productId);

        // TODO: test validations
    }

    /**
     * Find a product
     *
     * 
     */
    @Test
    public void findProductTest() {
        UUID productId = null;
        // Product response = api.findProduct(productId);

        // TODO: test validations
    }

    /**
     * List all products
     *
     * 
     */
    @Test
    public void listProductsTest() {
        Integer firstResult = null;
        Integer maxResults = null;
        // List<Product> response = api.listProducts(firstResult, maxResults);

        // TODO: test validations
    }

    /**
     * List all products
     *
     * 
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void listProductsTestQueryMap() {
        ProductsApi.ListProductsQueryParams queryParams = new ProductsApi.ListProductsQueryParams()
            .firstResult(null)
            .maxResults(null);
        // List<Product> response = api.listProducts(queryParams);

    // TODO: test validations
    }
    /**
     * Updates a product
     *
     * 
     */
    @Test
    public void updateProductTest() {
        Product body = null;
        UUID productId = null;
        // Product response = api.updateProduct(body, productId);

        // TODO: test validations
    }

}
