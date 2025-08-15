// Bulk put datastore items returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ActionsDatastoresApi;
import com.datadog.api.client.v2.model.BulkPutAppsDatastoreItemsRequest;
import com.datadog.api.client.v2.model.BulkPutAppsDatastoreItemsRequestData;
import com.datadog.api.client.v2.model.BulkPutAppsDatastoreItemsRequestDataAttributes;
import com.datadog.api.client.v2.model.BulkPutAppsDatastoreItemsRequestDataType;
import com.datadog.api.client.v2.model.PutAppsDatastoreItemResponseArray;
import java.util.Arrays;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    ActionsDatastoresApi apiInstance = new ActionsDatastoresApi(defaultClient);

    // there is a valid "datastore" in the system
    String DATASTORE_DATA_ATTRIBUTES_PRIMARY_COLUMN_NAME =
        System.getenv("DATASTORE_DATA_ATTRIBUTES_PRIMARY_COLUMN_NAME");
    String DATASTORE_DATA_ID = System.getenv("DATASTORE_DATA_ID");

    BulkPutAppsDatastoreItemsRequest body =
        new BulkPutAppsDatastoreItemsRequest()
            .data(
                new BulkPutAppsDatastoreItemsRequestData()
                    .attributes(
                        new BulkPutAppsDatastoreItemsRequestDataAttributes()
                            .values(
                                Arrays.asList(
                                    Map.ofEntries(
                                        Map.entry("28173b88-1a0e-001e-28c0-7664b6410518", "key1"),
                                        Map.entry(
                                            "value", "{'data': 'example data 1', 'key': 'value'}")),
                                    Map.ofEntries(
                                        Map.entry("28173b88-1a0e-001e-28c0-7664b6410518", "key2"),
                                        Map.entry(
                                            "value",
                                            "{'data': 'example data 2', 'key': 'value'}")))))
                    .type(BulkPutAppsDatastoreItemsRequestDataType.ITEMS));

    try {
      PutAppsDatastoreItemResponseArray result =
          apiInstance.bulkPutDatastoreItems(DATASTORE_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsDatastoresApi#bulkPutDatastoreItems");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
