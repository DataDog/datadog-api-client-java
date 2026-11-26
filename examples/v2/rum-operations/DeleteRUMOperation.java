// Delete a RUM operation returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumOperationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    RumOperationsApi apiInstance = new RumOperationsApi(defaultClient);

    // there is a valid "rum_operation" in the system
    String RUM_OPERATION_DATA_ID = System.getenv("RUM_OPERATION_DATA_ID");

    try {
      apiInstance.deleteRUMOperation(RUM_OPERATION_DATA_ID);
    } catch (ApiException e) {
      System.err.println("Exception when calling RumOperationsApi#deleteRUMOperation");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
