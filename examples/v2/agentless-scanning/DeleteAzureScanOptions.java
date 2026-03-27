// Delete Azure scan options returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.AgentlessScanningApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    AgentlessScanningApi apiInstance = new AgentlessScanningApi(defaultClient);

    try {
      apiInstance.deleteAzureScanOptions("12345678-90ab-cdef-1234-567890abcdef");
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentlessScanningApi#deleteAzureScanOptions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
