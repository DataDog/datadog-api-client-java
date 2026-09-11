// List Databricks integration accounts returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.DatabricksIntegrationApi;
import com.datadog.api.client.v2.model.DatabricksIntegrationAccountsResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.listDatabricksIntegrationAccounts", true);
    DatabricksIntegrationApi apiInstance = new DatabricksIntegrationApi(defaultClient);

    try {
      DatabricksIntegrationAccountsResponse result =
          apiInstance.listDatabricksIntegrationAccounts();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling DatabricksIntegrationApi#listDatabricksIntegrationAccounts");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
