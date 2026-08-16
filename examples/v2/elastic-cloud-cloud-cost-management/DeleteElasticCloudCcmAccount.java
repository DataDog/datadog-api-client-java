// Delete an Elastic Cloud CCM account returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ElasticCloudCloudCostManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.deleteElasticCloudCcmAccount", true);
    ElasticCloudCloudCostManagementApi apiInstance =
        new ElasticCloudCloudCostManagementApi(defaultClient);

    try {
      apiInstance.deleteElasticCloudCcmAccount("account_id");
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling ElasticCloudCloudCostManagementApi#deleteElasticCloudCcmAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
