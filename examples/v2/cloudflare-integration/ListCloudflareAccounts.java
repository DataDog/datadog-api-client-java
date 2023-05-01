// List Cloudflare accounts returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CloudflareIntegrationApi;
import com.datadog.api.client.v2.model.CloudflareAccountsResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    CloudflareIntegrationApi apiInstance = new CloudflareIntegrationApi(defaultClient);

    try {
      CloudflareAccountsResponse result = apiInstance.listCloudflareAccounts();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudflareIntegrationApi#listCloudflareAccounts");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
