// Delete datastore returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ActionsDatastoresApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    ActionsDatastoresApi apiInstance = new ActionsDatastoresApi(defaultClient);

    // a "datastore" is created in the system
    String CREATED_DATASTORE_DATA_ID = System.getenv("CREATED_DATASTORE_DATA_ID");

    try {
      apiInstance.deleteDatastore(CREATED_DATASTORE_DATA_ID);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsDatastoresApi#deleteDatastore");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
