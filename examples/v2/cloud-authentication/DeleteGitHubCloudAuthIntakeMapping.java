// Delete a GitHub cloud auth intake mapping returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CloudAuthenticationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.deleteGitHubCloudAuthIntakeMapping", true);
    CloudAuthenticationApi apiInstance = new CloudAuthenticationApi(defaultClient);

    try {
      apiInstance.deleteGitHubCloudAuthIntakeMapping("d6d869d7-29d3-5595-bf40-57c95235cf5b");
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling CloudAuthenticationApi#deleteGitHubCloudAuthIntakeMapping");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
