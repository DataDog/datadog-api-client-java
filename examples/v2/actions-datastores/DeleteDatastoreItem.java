// Delete datastore item returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ActionsDatastoresApi;
import com.datadog.api.client.v2.model.DeleteAppsDatastoreItemRequest;
import com.datadog.api.client.v2.model.DeleteAppsDatastoreItemRequestData;
import com.datadog.api.client.v2.model.DeleteAppsDatastoreItemRequestDataAttributes;
import com.datadog.api.client.v2.model.DeleteAppsDatastoreItemRequestDataType;
import com.datadog.api.client.v2.model.DeleteAppsDatastoreItemResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    ActionsDatastoresApi apiInstance = new ActionsDatastoresApi(defaultClient);

    // there is a valid "datastore" in the system
    String DATASTORE_DATA_ID = System.getenv("DATASTORE_DATA_ID");

    // there are valid "datastore items" in the system
    String DATASTORE_ITEMS_DATA_0_ID = System.getenv("DATASTORE_ITEMS_DATA_0_ID");

    DeleteAppsDatastoreItemRequest body =
        new DeleteAppsDatastoreItemRequest()
            .data(
                new DeleteAppsDatastoreItemRequestData()
                    .attributes(
                        new DeleteAppsDatastoreItemRequestDataAttributes()
                            .id(DATASTORE_ITEMS_DATA_0_ID)
                            .itemKey("test-key"))
                    .type(DeleteAppsDatastoreItemRequestDataType.ITEMS)
                    .id(DATASTORE_DATA_ID));

    try {
      DeleteAppsDatastoreItemResponse result =
          apiInstance.deleteDatastoreItem(DATASTORE_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsDatastoresApi#deleteDatastoreItem");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
