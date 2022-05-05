// Update a Cloud Workload Security Agent rule returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.api.CloudWorkloadSecurityApi;
import com.datadog.api.v2.client.model.CloudWorkloadSecurityAgentRuleResponse;
import com.datadog.api.v2.client.model.CloudWorkloadSecurityAgentRuleType;
import com.datadog.api.v2.client.model.CloudWorkloadSecurityAgentRuleUpdateAttributes;
import com.datadog.api.v2.client.model.CloudWorkloadSecurityAgentRuleUpdateData;
import com.datadog.api.v2.client.model.CloudWorkloadSecurityAgentRuleUpdateRequest;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    CloudWorkloadSecurityApi apiInstance = new CloudWorkloadSecurityApi(defaultClient);

    // there is a valid "agent_rule" in the system
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
                    .type(CloudWorkloadSecurityAgentRuleType.AGENT_RULE));

    try {
      CloudWorkloadSecurityAgentRuleResponse result =
          apiInstance.updateCloudWorkloadSecurityAgentRule(AGENT_RULE_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling CloudWorkloadSecurityApi#updateCloudWorkloadSecurityAgentRule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
