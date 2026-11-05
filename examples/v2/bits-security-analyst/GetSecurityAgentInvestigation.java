// Get a Bits Security Analyst investigation returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.BitsSecurityAnalystApi;
import com.datadog.api.client.v2.model.SecurityAgentInvestigationResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.getSecurityAgentInvestigation", true);
    BitsSecurityAnalystApi apiInstance = new BitsSecurityAnalystApi(defaultClient);

    try {
      SecurityAgentInvestigationResponse result =
          apiInstance.getSecurityAgentInvestigation("7f3c9a2e-5d14-4e8b-9c61-2a0b4f8d1e53");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling BitsSecurityAnalystApi#getSecurityAgentInvestigation");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
