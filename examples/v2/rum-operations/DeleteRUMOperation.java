// Delete a RUM operation returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumOperationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.deleteRUMOperation", true);
    RumOperationsApi apiInstance = new RumOperationsApi(defaultClient);

    try {
      apiInstance.deleteRUMOperation("operation_id");
    } catch (ApiException e) {
      System.err.println("Exception when calling RumOperationsApi#deleteRUMOperation");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
