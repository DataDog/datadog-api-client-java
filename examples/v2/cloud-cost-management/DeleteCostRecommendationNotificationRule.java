// Delete a cost recommendation notification rule returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CloudCostManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.deleteCostRecommendationNotificationRule", true);
    CloudCostManagementApi apiInstance = new CloudCostManagementApi(defaultClient);

    try {
      apiInstance.deleteCostRecommendationNotificationRule("2c59b248-6a91-4f95-972a-dc236cae9cbb");
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling CloudCostManagementApi#deleteCostRecommendationNotificationRule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
