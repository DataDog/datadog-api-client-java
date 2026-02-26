// Update datastore returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.ActionsDatastoresApi;
import com.datadog.api.client.v2.model.Datastore;
import com.datadog.api.client.v2.model.DatastoreDataType;
import com.datadog.api.client.v2.model.UpdateAppsDatastoreRequest;
import com.datadog.api.client.v2.model.UpdateAppsDatastoreRequestData;
import com.datadog.api.client.v2.model.UpdateAppsDatastoreRequestDataAttributes;
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

    UpdateAppsDatastoreRequest body = new UpdateAppsDatastoreRequest()
.data(new UpdateAppsDatastoreRequestData()
.attributes(new UpdateAppsDatastoreRequestDataAttributes()
.name("updated name"))
.type(DatastoreDataType.DATASTORES)
.id(DATASTORE_DATA_ID));

    try {
      Datastore result = apiInstance.updateDatastore(DATASTORE_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsDatastoresApi#updateDatastore");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}