// Bulk delete datastore items returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.ActionsDatastoresApi;
import com.datadog.api.client.v2.model.DeleteAppsDatastoreItemResponseArray;
import com.datadog.api.client.v2.model.BulkDeleteAppsDatastoreItemsRequest;
import com.datadog.api.client.v2.model.BulkDeleteAppsDatastoreItemsRequestData;
import com.datadog.api.client.v2.model.BulkDeleteAppsDatastoreItemsRequestDataAttributes;
import com.datadog.api.client.v2.model.BulkDeleteAppsDatastoreItemsRequestDataType;
import java.io.File;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    ActionsDatastoresApi apiInstance = new ActionsDatastoresApi(defaultClient);

    // there is a valid "datastore" in the system
    String DATASTORE_DATA_ID = System.getenv("DATASTORE_DATA_ID");

    BulkDeleteAppsDatastoreItemsRequest body = new BulkDeleteAppsDatastoreItemsRequest()
.data(new BulkDeleteAppsDatastoreItemsRequestData()
.attributes(new BulkDeleteAppsDatastoreItemsRequestDataAttributes()
.itemKeys(Collections.singletonList("test-key")))
.type(BulkDeleteAppsDatastoreItemsRequestDataType.ITEMS));

    try {
      DeleteAppsDatastoreItemResponseArray result = apiInstance.bulkDeleteDatastoreItems(DATASTORE_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsDatastoresApi#bulkDeleteDatastoreItems");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}