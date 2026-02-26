// Create Jira issue template returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.JiraIntegrationApi;
import com.datadog.api.client.v2.model.JiraIssueTemplateCreateRequest;
import com.datadog.api.client.v2.model.JiraIssueTemplateCreateRequestAttributes;
import com.datadog.api.client.v2.model.JiraIssueTemplateCreateRequestAttributesJiraAccount;
import com.datadog.api.client.v2.model.JiraIssueTemplateCreateRequestData;
import com.datadog.api.client.v2.model.JiraIssueTemplateResponse;
import com.datadog.api.client.v2.model.JiraIssueTemplateType;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createJiraIssueTemplate", true);
    JiraIntegrationApi apiInstance = new JiraIntegrationApi(defaultClient);

    JiraIssueTemplateCreateRequest body =
        new JiraIssueTemplateCreateRequest()
            .data(
                new JiraIssueTemplateCreateRequestData()
                    .attributes(
                        new JiraIssueTemplateCreateRequestAttributes()
                            .fields(
                                Map.ofEntries(
                                    Map.entry(
                                        "description", "{'payload': 'Test', 'type': 'json'}")))
                            .issueTypeId("12730")
                            .jiraAccount(
                                new JiraIssueTemplateCreateRequestAttributesJiraAccount()
                                    .id(UUID.fromString("80f16d40-1fba-486e-b1fc-983e6ca19bec")))
                            .name("test-template")
                            .projectId("10772"))
                    .type(JiraIssueTemplateType.JIRA_ISSUE_TEMPLATE));

    try {
      JiraIssueTemplateResponse result = apiInstance.createJiraIssueTemplate(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JiraIntegrationApi#createJiraIssueTemplate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
