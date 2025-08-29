// Write datastore item returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ActionsDatastoresApi;
import com.datadog.api.client.v2.model.DatastoreItemsDataType;
import com.datadog.api.client.v2.model.PutAppsDatastoreItemRequest;
import com.datadog.api.client.v2.model.PutAppsDatastoreItemRequestData;
import com.datadog.api.client.v2.model.PutAppsDatastoreItemRequestDataAttributes;
import com.datadog.api.client.v2.model.PutAppsDatastoreItemResponse;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    ActionsDatastoresApi apiInstance = new ActionsDatastoresApi(defaultClient);

    // there is a valid "datastore" in the system
    String DATASTORE_DATA_ID = System.getenv("DATASTORE_DATA_ID");

    PutAppsDatastoreItemRequest body =
        new PutAppsDatastoreItemRequest()
            .data(
                new PutAppsDatastoreItemRequestData()
                    .attributes(
                        new PutAppsDatastoreItemRequestDataAttributes()
                            .value(
                                Map.ofEntries(
                                    Map.entry("id", "new-item-key"),
                                    Map.entry("data", "example data"),
                                    Map.entry("key", "value"))))
                    .type(DatastoreItemsDataType.ITEMS)
                    .id("e7e64418-b60c-4789-9612-895ac8423207"));

    try {
      PutAppsDatastoreItemResponse result = apiInstance.writeDatastoreItem(DATASTORE_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsDatastoresApi#writeDatastoreItem");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
