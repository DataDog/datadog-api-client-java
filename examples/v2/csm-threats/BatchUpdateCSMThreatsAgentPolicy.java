// Batch update CSM Threats Agent policies returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CsmThreatsApi;
import com.datadog.api.client.v2.model.CloudWorkloadSecurityAgentPoliciesListResponse;
import com.datadog.api.client.v2.model.CloudWorkloadSecurityAgentPolicyBatchUpdateAttributes;
import com.datadog.api.client.v2.model.CloudWorkloadSecurityAgentPolicyBatchUpdateAttributesPoliciesItems;
import com.datadog.api.client.v2.model.CloudWorkloadSecurityAgentPolicyBatchUpdateData;
import com.datadog.api.client.v2.model.CloudWorkloadSecurityAgentPolicyBatchUpdateDataType;
import com.datadog.api.client.v2.model.CloudWorkloadSecurityAgentPolicyBatchUpdateRequest;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    CsmThreatsApi apiInstance = new CsmThreatsApi(defaultClient);

    // there is a valid "policy_rc" in the system
    String POLICY_DATA_ID = System.getenv("POLICY_DATA_ID");

    CloudWorkloadSecurityAgentPolicyBatchUpdateRequest body =
        new CloudWorkloadSecurityAgentPolicyBatchUpdateRequest()
            .data(
                new CloudWorkloadSecurityAgentPolicyBatchUpdateData()
                    .attributes(
                        new CloudWorkloadSecurityAgentPolicyBatchUpdateAttributes()
                            .policies(
                                Collections.singletonList(
                                    new CloudWorkloadSecurityAgentPolicyBatchUpdateAttributesPoliciesItems()
                                        .delete(false)
                                        .description("Updated agent policy")
                                        .enabled(true)
                                        .hostTags(Collections.singletonList("env:test"))
                                        .id(POLICY_DATA_ID)
                                        .name("updated_agent_policy")
                                        .priority(20L))))
                    .id("batch_update_req")
                    .type(CloudWorkloadSecurityAgentPolicyBatchUpdateDataType.POLICIES));

    try {
      CloudWorkloadSecurityAgentPoliciesListResponse result =
          apiInstance.batchUpdateCSMThreatsAgentPolicy(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CsmThreatsApi#batchUpdateCSMThreatsAgentPolicy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
