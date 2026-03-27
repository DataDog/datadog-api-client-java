// Update datastore item returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.ActionsDatastoresApi;
import com.datadog.api.client.v2.model.ItemApiPayload;
import com.datadog.api.client.v2.model.UpdateAppsDatastoreItemRequest;
import com.datadog.api.client.v2.model.UpdateAppsDatastoreItemRequestData;
import com.datadog.api.client.v2.model.UpdateAppsDatastoreItemRequestDataAttributes;
import com.datadog.api.client.v2.model.UpdateAppsDatastoreItemRequestDataAttributesItemChanges;
import com.datadog.api.client.v2.model.UpdateAppsDatastoreItemRequestDataType;
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

    UpdateAppsDatastoreItemRequest body = new UpdateAppsDatastoreItemRequest()
.data(new UpdateAppsDatastoreItemRequestData()
.attributes(new UpdateAppsDatastoreItemRequestDataAttributes()
.itemChanges(new UpdateAppsDatastoreItemRequestDataAttributesItemChanges())
.itemKey("test-key"))
.type(UpdateAppsDatastoreItemRequestDataType.ITEMS));

    try {
      ItemApiPayload result = apiInstance.updateDatastoreItem(DATASTORE_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsDatastoresApi#updateDatastoreItem");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}