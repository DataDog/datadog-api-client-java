// Get a RUM retention quota configuration returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumRetentionQuotaApi;
import com.datadog.api.client.v2.model.RumRetentionQuotaConfigResponse;
import com.datadog.api.client.v2.model.RumRetentionQuotaScopeType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    RumRetentionQuotaApi apiInstance = new RumRetentionQuotaApi(defaultClient);

    try {
      RumRetentionQuotaConfigResponse result =
          apiInstance.getRumQuotaConfig(
              RumRetentionQuotaScopeType.APPLICATION, "ced16651-97b6-4e67-8590-8caec3af0695");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RumRetentionQuotaApi#getRumQuotaConfig");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
