// List Nebius Cloud integration accounts returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.NebiusCloudIntegrationApi;
import com.datadog.api.client.v2.model.NebiusCloudIntegrationAccountsResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.listNebiusCloudIntegrationAccounts", true);
    NebiusCloudIntegrationApi apiInstance = new NebiusCloudIntegrationApi(defaultClient);

    try {
      NebiusCloudIntegrationAccountsResponse result =
          apiInstance.listNebiusCloudIntegrationAccounts();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling NebiusCloudIntegrationApi#listNebiusCloudIntegrationAccounts");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
