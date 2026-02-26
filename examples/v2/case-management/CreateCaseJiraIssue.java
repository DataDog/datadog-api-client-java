// Create Jira issue for case returns "Accepted" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CaseManagementApi;
import com.datadog.api.client.v2.model.JiraIssueCreateAttributes;
import com.datadog.api.client.v2.model.JiraIssueCreateData;
import com.datadog.api.client.v2.model.JiraIssueCreateRequest;
import com.datadog.api.client.v2.model.JiraIssueResourceType;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createCaseJiraIssue", true);
    CaseManagementApi apiInstance = new CaseManagementApi(defaultClient);

    JiraIssueCreateRequest body =
        new JiraIssueCreateRequest()
            .data(
                new JiraIssueCreateData()
                    .attributes(
                        new JiraIssueCreateAttributes()
                            .fields(Map.ofEntries())
                            .issueTypeId("10001")
                            .jiraAccountId("1234")
                            .projectId("5678"))
                    .type(JiraIssueResourceType.ISSUES));

    try {
      apiInstance.createCaseJiraIssue("f98a5a5b-e0ff-45d4-b2f5-afe6e74de504", body);
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseManagementApi#createCaseJiraIssue");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
