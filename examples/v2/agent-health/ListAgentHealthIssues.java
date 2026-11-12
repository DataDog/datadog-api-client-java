// List Agent Health issues returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.AgentHealthApi;
import com.datadog.api.client.v2.model.AgentHealthIssuesResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.listAgentHealthIssues", true);
    AgentHealthApi apiInstance = new AgentHealthApi(defaultClient);

    try {
      AgentHealthIssuesResponse result = apiInstance.listAgentHealthIssues();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentHealthApi#listAgentHealthIssues");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
