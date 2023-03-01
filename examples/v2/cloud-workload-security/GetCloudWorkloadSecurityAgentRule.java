// Get a Cloud Workload Security Agent rule returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.CloudWorkloadSecurityApi;
import com.datadog.api.client.v2.model.CloudWorkloadSecurityAgentRuleResponse;
import java.io.File;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    CloudWorkloadSecurityApi apiInstance = new CloudWorkloadSecurityApi(defaultClient);

    // there is a valid "agent_rule" in the system
    String AGENT_RULE_DATA_ID = System.getenv("AGENT_RULE_DATA_ID");

    try {
      CloudWorkloadSecurityAgentRuleResponse result = apiInstance.getCloudWorkloadSecurityAgentRule(AGENT_RULE_DATA_ID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudWorkloadSecurityApi#getCloudWorkloadSecurityAgentRule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}