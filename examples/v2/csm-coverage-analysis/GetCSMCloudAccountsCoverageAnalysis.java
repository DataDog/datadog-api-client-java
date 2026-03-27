// Get the CSM Cloud Accounts Coverage Analysis returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CsmCoverageAnalysisApi;
import com.datadog.api.client.v2.model.CsmCloudAccountsCoverageAnalysisResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    CsmCoverageAnalysisApi apiInstance = new CsmCoverageAnalysisApi(defaultClient);

    try {
      CsmCloudAccountsCoverageAnalysisResponse result =
          apiInstance.getCSMCloudAccountsCoverageAnalysis();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling CsmCoverageAnalysisApi#getCSMCloudAccountsCoverageAnalysis");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
