// Delete a CoreWeave integration account returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CoreWeaveIntegrationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.deleteCoreWeaveCloudIntegrationAccount", true);
    CoreWeaveIntegrationApi apiInstance = new CoreWeaveIntegrationApi(defaultClient);

    try {
      apiInstance.deleteCoreWeaveCloudIntegrationAccount("account_id");
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling CoreWeaveIntegrationApi#deleteCoreWeaveCloudIntegrationAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
