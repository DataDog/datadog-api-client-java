// Get a cost recommendation custom rule returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CloudCostManagementApi;
import com.datadog.api.client.v2.model.CostRecommendationCustomRuleResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.getCostRecommendationCustomRule", true);
    CloudCostManagementApi apiInstance = new CloudCostManagementApi(defaultClient);

    try {
      CostRecommendationCustomRuleResponse result =
          apiInstance.getCostRecommendationCustomRule("8a1b6f3e-2c4d-4e5f-9a7b-1c2d3e4f5a6b");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling CloudCostManagementApi#getCostRecommendationCustomRule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
