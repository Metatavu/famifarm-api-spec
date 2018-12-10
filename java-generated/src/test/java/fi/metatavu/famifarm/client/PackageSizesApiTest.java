package fi.metatavu.famifarm.client;

import fi.metatavu.famifarm.ApiClient;
import fi.metatavu.famifarm.client.model.Error;
import fi.metatavu.famifarm.client.model.PackageSize;
import java.util.UUID;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PackageSizesApi
 */
public class PackageSizesApiTest {

    private PackageSizesApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(PackageSizesApi.class);
    }

    /**
     * Create new package size
     *
     * 
     */
    @Test
    public void createPackageSizeTest() {
        PackageSize body = null;
        // PackageSize response = api.createPackageSize(body);

        // TODO: test validations
    }

    /**
     * Deletes a package size
     *
     * 
     */
    @Test
    public void deletePackageSizeTest() {
        UUID packageSizeId = null;
        // api.deletePackageSize(packageSizeId);

        // TODO: test validations
    }

    /**
     * Find a package size
     *
     * 
     */
    @Test
    public void findPackageSizeTest() {
        UUID packageSizeId = null;
        // PackageSize response = api.findPackageSize(packageSizeId);

        // TODO: test validations
    }

    /**
     * List all package sizes
     *
     * 
     */
    @Test
    public void listPackageSizesTest() {
        Integer firstResult = null;
        Integer maxResults = null;
        // List<PackageSize> response = api.listPackageSizes(firstResult, maxResults);

        // TODO: test validations
    }

    /**
     * List all package sizes
     *
     * 
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void listPackageSizesTestQueryMap() {
        PackageSizesApi.ListPackageSizesQueryParams queryParams = new PackageSizesApi.ListPackageSizesQueryParams()
            .firstResult(null)
            .maxResults(null);
        // List<PackageSize> response = api.listPackageSizes(queryParams);

    // TODO: test validations
    }
    /**
     * Updates a package size
     *
     * 
     */
    @Test
    public void updatePackageSizeTest() {
        PackageSize body = null;
        UUID packageSizeId = null;
        // PackageSize response = api.updatePackageSize(body, packageSizeId);

        // TODO: test validations
    }

}
