// Create a Workload Protection agent rule returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CsmThreatsApi;
import com.datadog.api.client.v2.model.CloudWorkloadSecurityAgentRuleCreateAttributes;
import com.datadog.api.client.v2.model.CloudWorkloadSecurityAgentRuleCreateData;
import com.datadog.api.client.v2.model.CloudWorkloadSecurityAgentRuleCreateRequest;
import com.datadog.api.client.v2.model.CloudWorkloadSecurityAgentRuleResponse;
import com.datadog.api.client.v2.model.CloudWorkloadSecurityAgentRuleType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    CsmThreatsApi apiInstance = new CsmThreatsApi(defaultClient);

    // there is a valid "policy_rc" in the system
    String POLICY_DATA_ID = System.getenv("POLICY_DATA_ID");

    CloudWorkloadSecurityAgentRuleCreateRequest body =
        new CloudWorkloadSecurityAgentRuleCreateRequest()
            .data(
                new CloudWorkloadSecurityAgentRuleCreateData()
                    .attributes(
                        new CloudWorkloadSecurityAgentRuleCreateAttributes()
                            .description("My Agent rule")
                            .enabled(true)
                            .expression("""
exec.file.name == "sh"
""")
                            .agentVersion("> 7.60")
                            .name("examplecsmthreat")
                            .policyId(POLICY_DATA_ID))
                    .type(CloudWorkloadSecurityAgentRuleType.AGENT_RULE));

    try {
      CloudWorkloadSecurityAgentRuleResponse result = apiInstance.createCSMThreatsAgentRule(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CsmThreatsApi#createCSMThreatsAgentRule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
