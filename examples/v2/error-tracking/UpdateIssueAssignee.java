// Update the assignee of an issue returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.ErrorTrackingApi;
import com.datadog.api.client.v2.model.IssueResponse;
import com.datadog.api.client.v2.model.IssueUpdateAssigneeRequest;
import com.datadog.api.client.v2.model.IssueUpdateAssigneeRequestData;
import com.datadog.api.client.v2.model.IssueUpdateAssigneeRequestDataType;
import java.io.File;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    ErrorTrackingApi apiInstance = new ErrorTrackingApi(defaultClient);

    // there is a valid "issue" in the system
    String ISSUE_ID = System.getenv("ISSUE_ID");

    IssueUpdateAssigneeRequest body = new IssueUpdateAssigneeRequest()
.data(new IssueUpdateAssigneeRequestData()
.id("87cb11a0-278c-440a-99fe-701223c80296")
.type(IssueUpdateAssigneeRequestDataType.ASSIGNEE));

    try {
      IssueResponse result = apiInstance.updateIssueAssignee(ISSUE_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ErrorTrackingApi#updateIssueAssignee");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}