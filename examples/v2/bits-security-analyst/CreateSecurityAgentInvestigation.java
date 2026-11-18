// Create a Bits Security Analyst investigation returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.BitsSecurityAnalystApi;
import com.datadog.api.client.v2.model.SecurityAgentInvestigationCreateAttributes;
import com.datadog.api.client.v2.model.SecurityAgentInvestigationCreateData;
import com.datadog.api.client.v2.model.SecurityAgentInvestigationCreateRequest;
import com.datadog.api.client.v2.model.SecurityAgentInvestigationResponse;
import com.datadog.api.client.v2.model.SecurityAgentInvestigationType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.createSecurityAgentInvestigation", true);
    BitsSecurityAnalystApi apiInstance = new BitsSecurityAnalystApi(defaultClient);

    SecurityAgentInvestigationCreateRequest body =
        new SecurityAgentInvestigationCreateRequest()
            .data(
                new SecurityAgentInvestigationCreateData()
                    .attributes(
                        new SecurityAgentInvestigationCreateAttributes()
                            .rerun(false)
                            .signalId("AQAAAaGNHjq4XzqcIQAAAABBWm8xY0wybUFBQmNYSjl1QUFBQUFBQUE"))
                    .type(SecurityAgentInvestigationType.INVESTIGATIONS));

    try {
      SecurityAgentInvestigationResponse result =
          apiInstance.createSecurityAgentInvestigation(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling BitsSecurityAnalystApi#createSecurityAgentInvestigation");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
