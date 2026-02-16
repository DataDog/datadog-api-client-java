// Create Jira issues for security findings returns "Accepted" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.FindingStatus;
import com.datadog.api.client.v2.model.JiraIssueDataAttributesRequest;
import com.datadog.api.client.v2.model.JiraIssueDataAttributesRequestMode;
import com.datadog.api.client.v2.model.JiraIssueDataMeta;
import com.datadog.api.client.v2.model.JiraIssueDataRequest;
import com.datadog.api.client.v2.model.JiraIssueFinding;
import com.datadog.api.client.v2.model.JiraIssueFindingId;
import com.datadog.api.client.v2.model.JiraIssueRequest;
import com.datadog.api.client.v2.model.JiraIssueType;
import java.util.Collections;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createJiraIssue", true);
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    JiraIssueRequest body =
        new JiraIssueRequest()
            .data(
                new JiraIssueDataRequest()
                    .attributes(
                        new JiraIssueDataAttributesRequest()
                            .accountId("f7ccdf99-0e22-4378-bdf9-03fde5379fea")
                            .fields(
                                Map.ofEntries(Map.entry("customfield_10000", "Custom field value")))
                            .issueType("story")
                            .issuetypeId("1235")
                            .mode(JiraIssueDataAttributesRequestMode.SINGLE)
                            .projectId("1234")
                            .projectKey("SEC"))
                    .id("ID")
                    .meta(
                        new JiraIssueDataMeta()
                            .findings(
                                Collections.singletonList(
                                    new JiraIssueFinding()
                                        .description("Description")
                                        .ids(
                                            Collections.singletonList(
                                                new JiraIssueFindingId()
                                                    .discovered(123213123L)
                                                    .id("afa-afa-hze")
                                                    .resource("Resource")
                                                    .tags("akjasd:asdsad")))
                                        .impacted(1L)
                                        .references("")
                                        .remediation("Remediation")
                                        .severity(FindingStatus.CRITICAL)
                                        .title("Title")
                                        .type("ciem")))
                            .vulnerabilities(
                                Collections.singletonList(
                                    new JiraIssueFinding()
                                        .description("Description")
                                        .ids(
                                            Collections.singletonList(
                                                new JiraIssueFindingId()
                                                    .discovered(123213123L)
                                                    .id("afa-afa-hze")
                                                    .resource("Resource")
                                                    .tags("akjasd:asdsad")))
                                        .impacted(1L)
                                        .references("")
                                        .remediation("Remediation")
                                        .severity(FindingStatus.CRITICAL)
                                        .title("Title")
                                        .type("ciem"))))
                    .type(JiraIssueType.JIRA_ISSUE));

    try {
      apiInstance.createJiraIssue(body);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityMonitoringApi#createJiraIssue");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
