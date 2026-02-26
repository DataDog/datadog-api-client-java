// Get a Workload Protection agent rule returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.CsmThreatsApi;
import com.datadog.api.client.v2.api.CsmThreatsApi.GetCSMThreatsAgentRuleOptionalParameters;
import com.datadog.api.client.v2.model.CloudWorkloadSecurityAgentRuleResponse;
import java.io.File;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    CsmThreatsApi apiInstance = new CsmThreatsApi(defaultClient);

    // there is a valid "agent_rule_rc" in the system
    String AGENT_RULE_DATA_ID = System.getenv("AGENT_RULE_DATA_ID");

    // there is a valid "policy_rc" in the system
    String POLICY_DATA_ID = System.getenv("POLICY_DATA_ID");

    try {
      CloudWorkloadSecurityAgentRuleResponse result = apiInstance.getCSMThreatsAgentRule(AGENT_RULE_DATA_ID,new GetCSMThreatsAgentRuleOptionalParameters().policyId(POLICY_DATA_ID));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CsmThreatsApi#getCSMThreatsAgentRule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}