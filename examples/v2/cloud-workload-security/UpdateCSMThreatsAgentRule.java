// Update a CSM Threats Agent rule returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CloudWorkloadSecurityApi;
import com.datadog.api.client.v2.model.CloudWorkloadSecurityAgentRuleResponse;
import com.datadog.api.client.v2.model.CloudWorkloadSecurityAgentRuleType;
import com.datadog.api.client.v2.model.CloudWorkloadSecurityAgentRuleUpdateAttributes;
import com.datadog.api.client.v2.model.CloudWorkloadSecurityAgentRuleUpdateData;
import com.datadog.api.client.v2.model.CloudWorkloadSecurityAgentRuleUpdateRequest;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    CloudWorkloadSecurityApi apiInstance = new CloudWorkloadSecurityApi(defaultClient);

    // there is a valid "agent_rule_rc" in the system
    String AGENT_RULE_DATA_ID = System.getenv("AGENT_RULE_DATA_ID");

    CloudWorkloadSecurityAgentRuleUpdateRequest body =
        new CloudWorkloadSecurityAgentRuleUpdateRequest()
            .data(
                new CloudWorkloadSecurityAgentRuleUpdateData()
                    .attributes(
                        new CloudWorkloadSecurityAgentRuleUpdateAttributes()
                            .description("Test Agent rule")
                            .enabled(true)
                            .expression("""
exec.file.name == "sh"
"""))
                    .type(CloudWorkloadSecurityAgentRuleType.AGENT_RULE)
                    .id(AGENT_RULE_DATA_ID));

    try {
      CloudWorkloadSecurityAgentRuleResponse result =
          apiInstance.updateCSMThreatsAgentRule(AGENT_RULE_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling CloudWorkloadSecurityApi#updateCSMThreatsAgentRule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
