// Get commitments utilization (scalar) returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CloudCostManagementApi;
import com.datadog.api.client.v2.model.CommitmentsProvider;
import com.datadog.api.client.v2.model.CommitmentsUtilizationScalarResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.getCommitmentsUtilizationScalar", true);
    CloudCostManagementApi apiInstance = new CloudCostManagementApi(defaultClient);

    try {
      CommitmentsUtilizationScalarResponse result =
          apiInstance.getCommitmentsUtilizationScalar(
              CommitmentsProvider.AWS, "ec2", 1693526400000L, 1696118400000L);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling CloudCostManagementApi#getCommitmentsUtilizationScalar");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
