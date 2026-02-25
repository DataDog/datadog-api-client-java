// Bulk write datastore items returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.ActionsDatastoresApi;
import com.datadog.api.client.v2.model.PutAppsDatastoreItemResponseArray;
import com.datadog.api.client.v2.model.BulkPutAppsDatastoreItemsRequest;
import com.datadog.api.client.v2.model.BulkPutAppsDatastoreItemsRequestData;
import com.datadog.api.client.v2.model.BulkPutAppsDatastoreItemsRequestDataAttributes;
import com.datadog.api.client.v2.model.DatastoreItemsDataType;
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

    BulkPutAppsDatastoreItemsRequest body = new BulkPutAppsDatastoreItemsRequest()
.data(new BulkPutAppsDatastoreItemsRequestData()
.attributes(new BulkPutAppsDatastoreItemsRequestDataAttributes()
.values(Arrays.asList(Map.ofEntries(Map.entry("id", "cust_3141"),Map.entry("name", "Johnathan")), Map.ofEntries(Map.entry("id", "cust_3142"),Map.entry("name", "Mary")))))
.type(DatastoreItemsDataType.ITEMS));

    try {
      PutAppsDatastoreItemResponseArray result = apiInstance.bulkWriteDatastoreItems(DATASTORE_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsDatastoresApi#bulkWriteDatastoreItems");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}