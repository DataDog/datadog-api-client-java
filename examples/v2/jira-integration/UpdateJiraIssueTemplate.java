// Update Jira issue template returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.JiraIntegrationApi;
import com.datadog.api.client.v2.model.JiraIssueTemplateResponse;
import com.datadog.api.client.v2.model.JiraIssueTemplateType;
import com.datadog.api.client.v2.model.JiraIssueTemplateUpdateRequest;
import com.datadog.api.client.v2.model.JiraIssueTemplateUpdateRequestAttributes;
import com.datadog.api.client.v2.model.JiraIssueTemplateUpdateRequestData;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.updateJiraIssueTemplate", true);
    JiraIntegrationApi apiInstance = new JiraIntegrationApi(defaultClient);

    JiraIssueTemplateUpdateRequest body =
        new JiraIssueTemplateUpdateRequest()
            .data(
                new JiraIssueTemplateUpdateRequestData()
                    .attributes(
                        new JiraIssueTemplateUpdateRequestAttributes()
                            .fields(
                                Map.ofEntries(
                                    Map.entry(
                                        "description",
                                        "{'payload': 'Updated Description', 'type': 'json'}")))
                            .name("test_template_updated"))
                    .type(JiraIssueTemplateType.JIRA_ISSUE_TEMPLATE));

    try {
      JiraIssueTemplateResponse result =
          apiInstance.updateJiraIssueTemplate(
              UUID.fromString("65b3341b-0680-47f9-a6d4-134db45c603e"), body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JiraIntegrationApi#updateJiraIssueTemplate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
