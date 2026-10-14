// Delete a deployment event returns "Accepted" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.DeliveryPerformanceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    DeliveryPerformanceApi apiInstance = new DeliveryPerformanceApi(defaultClient);

    try {
      apiInstance.deleteDORADeployment("NO_VALUE");
    } catch (ApiException e) {
      System.err.println("Exception when calling DeliveryPerformanceApi#deleteDORADeployment");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
