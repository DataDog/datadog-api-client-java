// Get an Elastic Cloud CCM account returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ElasticCloudIntegrationAccountsApi;
import com.datadog.api.client.v2.model.ElasticCloudCcmAccountResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.getElasticCloudCcmAccount", true);
    ElasticCloudIntegrationAccountsApi apiInstance =
        new ElasticCloudIntegrationAccountsApi(defaultClient);

    try {
      ElasticCloudCcmAccountResponse result = apiInstance.getElasticCloudCcmAccount("account_id");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling ElasticCloudIntegrationAccountsApi#getElasticCloudCcmAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
