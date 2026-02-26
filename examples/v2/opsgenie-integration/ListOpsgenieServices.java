// Get all service objects returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.OpsgenieIntegrationApi;
import com.datadog.api.client.v2.model.OpsgenieServicesResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    OpsgenieIntegrationApi apiInstance = new OpsgenieIntegrationApi(defaultClient);

    try {
      OpsgenieServicesResponse result = apiInstance.listOpsgenieServices();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OpsgenieIntegrationApi#listOpsgenieServices");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
