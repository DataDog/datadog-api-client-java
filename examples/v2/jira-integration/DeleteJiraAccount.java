// Delete Jira account returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.JiraIntegrationApi;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.deleteJiraAccount", true);
    JiraIntegrationApi apiInstance = new JiraIntegrationApi(defaultClient);

    try {
      apiInstance.deleteJiraAccount(UUID.fromString("65b3341b-0680-47f9-a6d4-134db45c603e"));
    } catch (ApiException e) {
      System.err.println("Exception when calling JiraIntegrationApi#deleteJiraAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
