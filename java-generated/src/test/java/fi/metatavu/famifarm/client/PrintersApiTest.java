package fi.metatavu.famifarm.client;

import fi.metatavu.famifarm.ApiClient;
import fi.metatavu.famifarm.client.model.ErrorResponse;
import fi.metatavu.famifarm.client.model.PrintData;
import fi.metatavu.famifarm.client.model.Printer;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PrintersApi
 */
public class PrintersApiTest {

    private PrintersApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(PrintersApi.class);
    }

    /**
     * List all connected printers
     *
     * 
     */
    @Test
    public void listPrintersTest() {
        // List<Printer> response = api.listPrinters();

        // TODO: test validations
    }

    /**
     * Print
     *
     * 
     */
    @Test
    public void printTest() {
        PrintData body = null;
        String printerId = null;
        // Object response = api.print(body, printerId);

        // TODO: test validations
    }

}
