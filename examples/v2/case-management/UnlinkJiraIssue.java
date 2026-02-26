// Remove Jira issue link from case returns "No Content" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.CaseManagementApi;
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
    defaultClient.setUnstableOperationEnabled("v2.unlinkJiraIssue", true);
    CaseManagementApi apiInstance = new CaseManagementApi(defaultClient);

    try {
      apiInstance.unlinkJiraIssue("f98a5a5b-e0ff-45d4-b2f5-afe6e74de504");
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseManagementApi#unlinkJiraIssue");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}