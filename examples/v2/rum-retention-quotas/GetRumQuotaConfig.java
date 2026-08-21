// Get a RUM retention quota configuration returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumRetentionQuotasApi;
import com.datadog.api.client.v2.model.RumRetentionQuotaConfigResponse;
import com.datadog.api.client.v2.model.RumRetentionQuotaScopeType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    RumRetentionQuotasApi apiInstance = new RumRetentionQuotasApi(defaultClient);

    try {
      RumRetentionQuotaConfigResponse result =
          apiInstance.getRumQuotaConfig(
              RumRetentionQuotaScopeType.APPLICATION, "cd73a516-a481-4af5-8352-9b577465c77b");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RumRetentionQuotasApi#getRumQuotaConfig");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
