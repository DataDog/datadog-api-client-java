// Get the RUM configuration returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumConfigApi;
import com.datadog.api.client.v2.model.RumConfigResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.getRumConfig", true);
    RumConfigApi apiInstance = new RumConfigApi(defaultClient);

    try {
      RumConfigResponse result = apiInstance.getRumConfig();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RumConfigApi#getRumConfig");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
