// List Elastic Cloud CCM accounts returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ElasticCloudIntegrationAccountsApi;
import com.datadog.api.client.v2.model.ElasticCloudCcmAccountsResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.listElasticCloudCcmAccounts", true);
    ElasticCloudIntegrationAccountsApi apiInstance =
        new ElasticCloudIntegrationAccountsApi(defaultClient);

    try {
      ElasticCloudCcmAccountsResponse result = apiInstance.listElasticCloudCcmAccounts();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling ElasticCloudIntegrationAccountsApi#listElasticCloudCcmAccounts");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
