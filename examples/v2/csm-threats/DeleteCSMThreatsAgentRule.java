// Delete a CSM Threats Agent rule returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CsmThreatsApi;
import com.datadog.api.client.v2.api.CsmThreatsApi.DeleteCSMThreatsAgentRuleOptionalParameters;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    CsmThreatsApi apiInstance = new CsmThreatsApi(defaultClient);

    // there is a valid "agent_rule_rc" in the system
    String AGENT_RULE_DATA_ID = System.getenv("AGENT_RULE_DATA_ID");

    // there is a valid "policy_rc" in the system
    String POLICY_DATA_ID = System.getenv("POLICY_DATA_ID");

    try {
      apiInstance.deleteCSMThreatsAgentRule(
          AGENT_RULE_DATA_ID,
          new DeleteCSMThreatsAgentRuleOptionalParameters().policyId(POLICY_DATA_ID));
    } catch (ApiException e) {
      System.err.println("Exception when calling CsmThreatsApi#deleteCSMThreatsAgentRule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
