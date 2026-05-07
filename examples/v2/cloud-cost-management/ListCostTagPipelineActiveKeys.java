// List active tag pipeline keys returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CloudCostManagementApi;
import com.datadog.api.client.v2.model.CostTagPipelineActiveKeyResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.listCostTagPipelineActiveKeys", true);
    CloudCostManagementApi apiInstance = new CloudCostManagementApi(defaultClient);

    try {
      CostTagPipelineActiveKeyResponse result = apiInstance.listCostTagPipelineActiveKeys();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling CloudCostManagementApi#listCostTagPipelineActiveKeys");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
