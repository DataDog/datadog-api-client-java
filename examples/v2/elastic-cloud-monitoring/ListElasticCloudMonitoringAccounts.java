// List Elastic Cloud monitoring accounts returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ElasticCloudMonitoringApi;
import com.datadog.api.client.v2.model.ElasticCloudMonitoringAccountsResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.listElasticCloudMonitoringAccounts", true);
    ElasticCloudMonitoringApi apiInstance = new ElasticCloudMonitoringApi(defaultClient);

    try {
      ElasticCloudMonitoringAccountsResponse result =
          apiInstance.listElasticCloudMonitoringAccounts();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling ElasticCloudMonitoringApi#listElasticCloudMonitoringAccounts");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
