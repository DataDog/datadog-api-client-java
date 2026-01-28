// Link existing Jira issue to case returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CaseManagementApi;
import com.datadog.api.client.v2.model.JiraIssueLinkAttributes;
import com.datadog.api.client.v2.model.JiraIssueLinkData;
import com.datadog.api.client.v2.model.JiraIssueLinkRequest;
import com.datadog.api.client.v2.model.JiraIssueResourceType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.linkJiraIssueToCase", true);
    CaseManagementApi apiInstance = new CaseManagementApi(defaultClient);

    JiraIssueLinkRequest body =
        new JiraIssueLinkRequest()
            .data(
                new JiraIssueLinkData()
                    .attributes(
                        new JiraIssueLinkAttributes()
                            .jiraIssueUrl("https://jira.example.com/browse/PROJ-123"))
                    .type(JiraIssueResourceType.ISSUES));

    try {
      apiInstance.linkJiraIssueToCase("f98a5a5b-e0ff-45d4-b2f5-afe6e74de504", body);
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseManagementApi#linkJiraIssueToCase");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
