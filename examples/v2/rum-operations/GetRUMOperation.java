// Get a RUM operation returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumOperationsApi;
import com.datadog.api.client.v2.model.RUMOperationResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.getRUMOperation", true);
    RumOperationsApi apiInstance = new RumOperationsApi(defaultClient);

    try {
      RUMOperationResponse result = apiInstance.getRUMOperation("operation_id");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RumOperationsApi#getRUMOperation");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
