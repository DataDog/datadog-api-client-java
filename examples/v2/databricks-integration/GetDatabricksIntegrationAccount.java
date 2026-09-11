// Get a Databricks integration account returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.DatabricksIntegrationApi;
import com.datadog.api.client.v2.model.DatabricksIntegrationAccountResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.getDatabricksIntegrationAccount", true);
    DatabricksIntegrationApi apiInstance = new DatabricksIntegrationApi(defaultClient);

    try {
      DatabricksIntegrationAccountResponse result =
          apiInstance.getDatabricksIntegrationAccount("account_id");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling DatabricksIntegrationApi#getDatabricksIntegrationAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
