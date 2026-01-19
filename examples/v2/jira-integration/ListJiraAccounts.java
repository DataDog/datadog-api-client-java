// List Jira accounts returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.JiraIntegrationApi;
import com.datadog.api.client.v2.model.JiraAccountsResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.listJiraAccounts", true);
    JiraIntegrationApi apiInstance = new JiraIntegrationApi(defaultClient);

    try {
      JiraAccountsResponse result = apiInstance.listJiraAccounts();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JiraIntegrationApi#listJiraAccounts");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
