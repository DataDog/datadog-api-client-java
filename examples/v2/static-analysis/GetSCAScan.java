// Retrieve a dependency scan result returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.StaticAnalysisApi;
import com.datadog.api.client.v2.model.ScanResultResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.getSCAScan", true);
    StaticAnalysisApi apiInstance = new StaticAnalysisApi(defaultClient);

    try {
      ScanResultResponse result = apiInstance.getSCAScan("0190a3d4-1234-7000-8000-000000000000");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StaticAnalysisApi#getSCAScan");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
