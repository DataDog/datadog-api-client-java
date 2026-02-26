// Update the state of an issue returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.ErrorTrackingApi;
import com.datadog.api.client.v2.model.IssueResponse;
import com.datadog.api.client.v2.model.IssueState;
import com.datadog.api.client.v2.model.IssueUpdateStateRequest;
import com.datadog.api.client.v2.model.IssueUpdateStateRequestData;
import com.datadog.api.client.v2.model.IssueUpdateStateRequestDataAttributes;
import com.datadog.api.client.v2.model.IssueUpdateStateRequestDataType;
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

    IssueUpdateStateRequest body = new IssueUpdateStateRequest()
.data(new IssueUpdateStateRequestData()
.attributes(new IssueUpdateStateRequestDataAttributes()
.state(IssueState.RESOLVED))
.id(ISSUE_ID)
.type(IssueUpdateStateRequestDataType.ERROR_TRACKING_ISSUE));

    try {
      IssueResponse result = apiInstance.updateIssueState(ISSUE_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ErrorTrackingApi#updateIssueState");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}