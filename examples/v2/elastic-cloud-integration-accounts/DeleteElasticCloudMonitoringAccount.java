// Delete an Elastic Cloud monitoring account returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ElasticCloudIntegrationAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.deleteElasticCloudMonitoringAccount", true);
    ElasticCloudIntegrationAccountsApi apiInstance =
        new ElasticCloudIntegrationAccountsApi(defaultClient);

    try {
      apiInstance.deleteElasticCloudMonitoringAccount("account_id");
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling"
              + " ElasticCloudIntegrationAccountsApi#deleteElasticCloudMonitoringAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
