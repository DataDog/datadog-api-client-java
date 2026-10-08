// Get a GitHub cloud authentication persona mapping returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CloudAuthenticationApi;
import com.datadog.api.client.v2.model.GitHubCloudAuthPersonaMappingResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.getGitHubCloudAuthPersonaMapping", true);
    CloudAuthenticationApi apiInstance = new CloudAuthenticationApi(defaultClient);

    try {
      GitHubCloudAuthPersonaMappingResponse result =
          apiInstance.getGitHubCloudAuthPersonaMapping("c5c758c6-18c2-4484-ae3f-46b84128404a");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling CloudAuthenticationApi#getGitHubCloudAuthPersonaMapping");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
