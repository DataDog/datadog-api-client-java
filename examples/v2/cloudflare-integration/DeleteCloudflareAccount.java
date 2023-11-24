// Delete Cloudflare account returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CloudflareIntegrationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    CloudflareIntegrationApi apiInstance = new CloudflareIntegrationApi(defaultClient);

    // there is a valid "cloudflare_account" in the system
    String CLOUDFLARE_ACCOUNT_DATA_ID = System.getenv("CLOUDFLARE_ACCOUNT_DATA_ID");

    try {
      apiInstance.deleteCloudflareAccount(CLOUDFLARE_ACCOUNT_DATA_ID);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudflareIntegrationApi#deleteCloudflareAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
