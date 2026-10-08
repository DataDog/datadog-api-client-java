// Get a GitHub cloud authentication intake mapping returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CloudAuthenticationApi;
import com.datadog.api.client.v2.model.GitHubCloudAuthIntakeMappingResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.getGitHubCloudAuthIntakeMapping", true);
    CloudAuthenticationApi apiInstance = new CloudAuthenticationApi(defaultClient);

    try {
      GitHubCloudAuthIntakeMappingResponse result =
          apiInstance.getGitHubCloudAuthIntakeMapping("d6d869d7-29d3-5595-bf40-57c95235cf5b");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling CloudAuthenticationApi#getGitHubCloudAuthIntakeMapping");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
