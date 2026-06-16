// Delete a RUM rate limit configuration returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumRateLimitApi;
import com.datadog.api.client.v2.model.RumRateLimitScopeType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.deleteRumRateLimitConfig", true);
    RumRateLimitApi apiInstance = new RumRateLimitApi(defaultClient);

    try {
      apiInstance.deleteRumRateLimitConfig(
          RumRateLimitScopeType.APPLICATION, "cd73a516-a481-4af5-8352-9b577465c77b");
    } catch (ApiException e) {
      System.err.println("Exception when calling RumRateLimitApi#deleteRumRateLimitConfig");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
