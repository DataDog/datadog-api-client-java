// Get the impact of an error tracking issue returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ErrorTrackingApi;
import com.datadog.api.client.v2.model.IssueImpactResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.getIssueImpact", true);
    ErrorTrackingApi apiInstance = new ErrorTrackingApi(defaultClient);

    // there is a valid "issue" in the system
    String ISSUE_ID = System.getenv("ISSUE_ID");

    try {
      IssueImpactResponse result =
          apiInstance.getIssueImpact(ISSUE_ID, 1635333071000L, 1636629071000L);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ErrorTrackingApi#getIssueImpact");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
