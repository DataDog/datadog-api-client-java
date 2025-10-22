// Remove the assignee of an issue returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ErrorTrackingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    ErrorTrackingApi apiInstance = new ErrorTrackingApi(defaultClient);

    // there is a valid "issue" in the system
    String ISSUE_ID = System.getenv("ISSUE_ID");

    try {
      apiInstance.deleteIssueAssignee(ISSUE_ID);
    } catch (ApiException e) {
      System.err.println("Exception when calling ErrorTrackingApi#deleteIssueAssignee");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
