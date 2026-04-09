// Get a secure embed for a dashboard returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.DashboardSecureEmbedApi;
import com.datadog.api.client.v2.model.SecureEmbedGetResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.getDashboardSecureEmbed", true);
    DashboardSecureEmbedApi apiInstance = new DashboardSecureEmbedApi(defaultClient);

    try {
      SecureEmbedGetResponse result =
          apiInstance.getDashboardSecureEmbed("abc-def-ghi", "s3cur3t0k3n-abcdef123456");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DashboardSecureEmbedApi#getDashboardSecureEmbed");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
