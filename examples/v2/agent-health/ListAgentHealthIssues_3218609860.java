// List Agent Health issues returns "OK" response with pagination

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.PaginationIterable;
import com.datadog.api.client.v2.api.AgentHealthApi;
import com.datadog.api.client.v2.model.AgentHealthIssueData;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    AgentHealthApi apiInstance = new AgentHealthApi(defaultClient);

    try {
      PaginationIterable<AgentHealthIssueData> iterable =
          apiInstance.listAgentHealthIssuesWithPagination();

      for (AgentHealthIssueData item : iterable) {
        System.out.println(item);
      }
    } catch (RuntimeException e) {
      System.err.println(
          "Exception when calling AgentHealthApi#listAgentHealthIssuesWithPagination");
      System.err.println("Reason: " + e.getMessage());
      e.printStackTrace();
    }
  }
}
