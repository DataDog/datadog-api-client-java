// Delete a Nebius Cloud integration account returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.NebiusCloudIntegrationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.deleteNebiusCloudIntegrationAccount", true);
    NebiusCloudIntegrationApi apiInstance = new NebiusCloudIntegrationApi(defaultClient);

    try {
      apiInstance.deleteNebiusCloudIntegrationAccount("account_id");
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling NebiusCloudIntegrationApi#deleteNebiusCloudIntegrationAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
