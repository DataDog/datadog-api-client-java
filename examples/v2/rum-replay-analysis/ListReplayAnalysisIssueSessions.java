// List replay analysis issue sessions returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumReplayAnalysisApi;
import com.datadog.api.client.v2.model.ReplayAnalysisIssueSessionsResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.listReplayAnalysisIssueSessions", true);
    RumReplayAnalysisApi apiInstance = new RumReplayAnalysisApi(defaultClient);

    try {
      ReplayAnalysisIssueSessionsResponse result =
          apiInstance.listReplayAnalysisIssueSessions("00000000-0000-0000-0000-000000000001");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling RumReplayAnalysisApi#listReplayAnalysisIssueSessions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
