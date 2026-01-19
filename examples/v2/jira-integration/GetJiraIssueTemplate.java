// Get Jira issue template returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.JiraIntegrationApi;
import com.datadog.api.client.v2.model.JiraIssueTemplateResponse;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.getJiraIssueTemplate", true);
    JiraIntegrationApi apiInstance = new JiraIntegrationApi(defaultClient);

    try {
      JiraIssueTemplateResponse result =
          apiInstance.getJiraIssueTemplate(UUID.fromString("65b3341b-0680-47f9-a6d4-134db45c603e"));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JiraIntegrationApi#getJiraIssueTemplate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
