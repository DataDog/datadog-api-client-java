// Snooze an issue returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ErrorTrackingApi;
import com.datadog.api.client.v2.model.IssueResponse;
import com.datadog.api.client.v2.model.IssueSnoozeRequest;
import com.datadog.api.client.v2.model.IssueSnoozeRequestData;
import com.datadog.api.client.v2.model.IssueSnoozeRequestDataAttributes;
import com.datadog.api.client.v2.model.IssueSnoozeRequestDataType;
import com.datadog.api.client.v2.model.IssueWatchCondition;
import com.datadog.api.client.v2.model.IssueWatchConditionKind;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.snoozeIssue", true);
    ErrorTrackingApi apiInstance = new ErrorTrackingApi(defaultClient);

    // there is a valid "issue" in the system
    String ISSUE_ID = System.getenv("ISSUE_ID");

    IssueSnoozeRequest body =
        new IssueSnoozeRequest()
            .data(
                new IssueSnoozeRequestData()
                    .attributes(
                        new IssueSnoozeRequestDataAttributes()
                            .condition(
                                new IssueWatchCondition()
                                    .kind(IssueWatchConditionKind.ELAPSED_TIME)
                                    .duration("168h")))
                    .id(ISSUE_ID)
                    .type(IssueSnoozeRequestDataType.ERROR_TRACKING_ISSUE));

    try {
      IssueResponse result = apiInstance.snoozeIssue(ISSUE_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ErrorTrackingApi#snoozeIssue");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
