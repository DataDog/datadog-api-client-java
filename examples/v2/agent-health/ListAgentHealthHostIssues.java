// List active Agent Health issues returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.AgentHealthApi;
import com.datadog.api.client.v2.api.AgentHealthApi.ListAgentHealthHostIssuesOptionalParameters;
import com.datadog.api.client.v2.model.AgentHealthAgentType;
import com.datadog.api.client.v2.model.AgentHealthHostIssuesResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    AgentHealthApi apiInstance = new AgentHealthApi(defaultClient);

    try {
      AgentHealthHostIssuesResponse result =
          apiInstance.listAgentHealthHostIssues(
              "123e4567-e89b-12d3-a456-426614174000",
              new ListAgentHealthHostIssuesOptionalParameters()
                  .agentType(AgentHealthAgentType.NODE));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentHealthApi#listAgentHealthHostIssues");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
