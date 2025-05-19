// Update a Workload Protection policy returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CsmThreatsApi;
import com.datadog.api.client.v2.model.CloudWorkloadSecurityAgentPolicyResponse;
import com.datadog.api.client.v2.model.CloudWorkloadSecurityAgentPolicyType;
import com.datadog.api.client.v2.model.CloudWorkloadSecurityAgentPolicyUpdateAttributes;
import com.datadog.api.client.v2.model.CloudWorkloadSecurityAgentPolicyUpdateData;
import com.datadog.api.client.v2.model.CloudWorkloadSecurityAgentPolicyUpdateRequest;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    CsmThreatsApi apiInstance = new CsmThreatsApi(defaultClient);

    // there is a valid "policy_rc" in the system
    String POLICY_DATA_ID = System.getenv("POLICY_DATA_ID");

    CloudWorkloadSecurityAgentPolicyUpdateRequest body =
        new CloudWorkloadSecurityAgentPolicyUpdateRequest()
            .data(
                new CloudWorkloadSecurityAgentPolicyUpdateData()
                    .attributes(
                        new CloudWorkloadSecurityAgentPolicyUpdateAttributes()
                            .description("Updated agent policy")
                            .enabled(true)
                            .hostTagsLists(
                                Collections.singletonList(Collections.singletonList("env:test")))
                            .name("updated_agent_policy"))
                    .id(POLICY_DATA_ID)
                    .type(CloudWorkloadSecurityAgentPolicyType.POLICY));

    try {
      CloudWorkloadSecurityAgentPolicyResponse result =
          apiInstance.updateCSMThreatsAgentPolicy(POLICY_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CsmThreatsApi#updateCSMThreatsAgentPolicy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
