// List replay analysis issues returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumReplayAnalysisApi;
import com.datadog.api.client.v2.model.ReplayAnalysisIssuesResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.listReplayAnalysisIssues", true);
    RumReplayAnalysisApi apiInstance = new RumReplayAnalysisApi(defaultClient);

    try {
      ReplayAnalysisIssuesResponse result = apiInstance.listReplayAnalysisIssues();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RumReplayAnalysisApi#listReplayAnalysisIssues");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
