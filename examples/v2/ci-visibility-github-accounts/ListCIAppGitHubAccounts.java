// List GitHub CI Visibility status returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CiVisibilityGitHubAccountsApi;
import com.datadog.api.client.v2.model.CIAppGitHubAccountsResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    CiVisibilityGitHubAccountsApi apiInstance = new CiVisibilityGitHubAccountsApi(defaultClient);

    try {
      CIAppGitHubAccountsResponse result = apiInstance.listCIAppGitHubAccounts();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling CiVisibilityGitHubAccountsApi#listCIAppGitHubAccounts");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
