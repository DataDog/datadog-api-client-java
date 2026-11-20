// Get the RUM configuration returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumConfigApi;
import com.datadog.api.client.v2.model.RUMConfigResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.getRUMConfig", true);
    RumConfigApi apiInstance = new RumConfigApi(defaultClient);

    try {
      RUMConfigResponse result = apiInstance.getRUMConfig();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RumConfigApi#getRUMConfig");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
