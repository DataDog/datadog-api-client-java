// List Elastic Cloud integration accounts returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ElasticCloudIntegrationApi;
import com.datadog.api.client.v2.model.ElasticCloudIntegrationAccountsResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.listElasticCloudIntegrationAccounts", true);
    ElasticCloudIntegrationApi apiInstance = new ElasticCloudIntegrationApi(defaultClient);

    try {
      ElasticCloudIntegrationAccountsResponse result =
          apiInstance.listElasticCloudIntegrationAccounts();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling ElasticCloudIntegrationApi#listElasticCloudIntegrationAccounts");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
