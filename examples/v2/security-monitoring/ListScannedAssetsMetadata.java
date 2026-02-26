// List scanned assets metadata returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.ScannedAssetsMetadata;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.listScannedAssetsMetadata", true);
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    try {
      ScannedAssetsMetadata result = apiInstance.listScannedAssetsMetadata();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityMonitoringApi#listScannedAssetsMetadata");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
