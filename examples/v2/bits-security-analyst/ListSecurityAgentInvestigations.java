// List Bits Security Analyst investigations returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.BitsSecurityAnalystApi;
import com.datadog.api.client.v2.api.BitsSecurityAnalystApi.ListSecurityAgentInvestigationsOptionalParameters;
import com.datadog.api.client.v2.model.SecurityAgentInvestigationsListResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.listSecurityAgentInvestigations", true);
    BitsSecurityAnalystApi apiInstance = new BitsSecurityAnalystApi(defaultClient);

    try {
      SecurityAgentInvestigationsListResponse result =
          apiInstance.listSecurityAgentInvestigations(
              new ListSecurityAgentInvestigationsOptionalParameters().pageSize(1L));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling BitsSecurityAnalystApi#listSecurityAgentInvestigations");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
