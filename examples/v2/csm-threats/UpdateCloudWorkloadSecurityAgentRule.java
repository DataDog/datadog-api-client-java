// Update a Workload Protection agent rule (US1-FED) returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CsmThreatsApi;
import com.datadog.api.client.v2.model.CloudWorkloadSecurityAgentRuleAction;
import com.datadog.api.client.v2.model.CloudWorkloadSecurityAgentRuleActionCoreDump;
import com.datadog.api.client.v2.model.CloudWorkloadSecurityAgentRuleActionHash;
import com.datadog.api.client.v2.model.CloudWorkloadSecurityAgentRuleActionLog;
import com.datadog.api.client.v2.model.CloudWorkloadSecurityAgentRuleActionMetadata;
import com.datadog.api.client.v2.model.CloudWorkloadSecurityAgentRuleActionNetworkFilter;
import com.datadog.api.client.v2.model.CloudWorkloadSecurityAgentRuleActionSet;
import com.datadog.api.client.v2.model.CloudWorkloadSecurityAgentRuleKill;
import com.datadog.api.client.v2.model.CloudWorkloadSecurityAgentRuleResponse;
import com.datadog.api.client.v2.model.CloudWorkloadSecurityAgentRuleType;
import com.datadog.api.client.v2.model.CloudWorkloadSecurityAgentRuleUpdateAttributes;
import com.datadog.api.client.v2.model.CloudWorkloadSecurityAgentRuleUpdateData;
import com.datadog.api.client.v2.model.CloudWorkloadSecurityAgentRuleUpdateRequest;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    CsmThreatsApi apiInstance = new CsmThreatsApi(defaultClient);

    CloudWorkloadSecurityAgentRuleUpdateRequest body =
        new CloudWorkloadSecurityAgentRuleUpdateRequest()
            .data(
                new CloudWorkloadSecurityAgentRuleUpdateData()
                    .attributes(
                        new CloudWorkloadSecurityAgentRuleUpdateAttributes()
                            .actions(
                                Collections.singletonList(
                                    new CloudWorkloadSecurityAgentRuleAction()
                                        .coredump(
                                            new CloudWorkloadSecurityAgentRuleActionCoreDump())
                                        .disabled(false)
                                        .hash(new CloudWorkloadSecurityAgentRuleActionHash())
                                        .kill(new CloudWorkloadSecurityAgentRuleKill())
                                        .log(new CloudWorkloadSecurityAgentRuleActionLog())
                                        .metadata(
                                            new CloudWorkloadSecurityAgentRuleActionMetadata())
                                        .networkFilter(
                                            new CloudWorkloadSecurityAgentRuleActionNetworkFilter())
                                        .set(new CloudWorkloadSecurityAgentRuleActionSet())))
                            .description("My Agent rule")
                            .enabled(true)
                            .expression("""
exec.file.name == "sh"
""")
                            .policyId("a8c8e364-6556-434d-b798-a4c23de29c0b")
                            .silent(false))
                    .id("3dd-0uc-h1s")
                    .type(CloudWorkloadSecurityAgentRuleType.AGENT_RULE));

    try {
      CloudWorkloadSecurityAgentRuleResponse result =
          apiInstance.updateCloudWorkloadSecurityAgentRule("3b5-v82-ns6", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling CsmThreatsApi#updateCloudWorkloadSecurityAgentRule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
