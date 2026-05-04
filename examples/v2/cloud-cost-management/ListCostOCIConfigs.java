// List Cloud Cost Management OCI configs returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CloudCostManagementApi;
import com.datadog.api.client.v2.model.OCIConfigsResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    CloudCostManagementApi apiInstance = new CloudCostManagementApi(defaultClient);

    try {
      OCIConfigsResponse result = apiInstance.listCostOCIConfigs();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudCostManagementApi#listCostOCIConfigs");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
