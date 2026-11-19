// Get a cost recommendation notification rule returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CloudCostManagementApi;
import com.datadog.api.client.v2.model.CostRecommendationNotificationRuleResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.getCostRecommendationNotificationRule", true);
    CloudCostManagementApi apiInstance = new CloudCostManagementApi(defaultClient);

    try {
      CostRecommendationNotificationRuleResponse result =
          apiInstance.getCostRecommendationNotificationRule("2c59b248-6a91-4f95-972a-dc236cae9cbb");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling CloudCostManagementApi#getCostRecommendationNotificationRule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
