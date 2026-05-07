// Get preferred cost allocation tags returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CloudCostManagementApi;
import com.datadog.api.client.v2.model.CostAIPreferredTagsResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.getCostAIPreferredTags", true);
    CloudCostManagementApi apiInstance = new CloudCostManagementApi(defaultClient);

    try {
      CostAIPreferredTagsResponse result = apiInstance.getCostAIPreferredTags();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudCostManagementApi#getCostAIPreferredTags");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
