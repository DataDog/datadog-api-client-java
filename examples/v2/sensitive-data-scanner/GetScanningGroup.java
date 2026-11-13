// Get Scanning Group returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SensitiveDataScannerApi;
import com.datadog.api.client.v2.model.SensitiveDataScannerTargetGroupResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    SensitiveDataScannerApi apiInstance = new SensitiveDataScannerApi(defaultClient);

    try {
      SensitiveDataScannerTargetGroupResponse result = apiInstance.getScanningGroup("group_id");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SensitiveDataScannerApi#getScanningGroup");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
