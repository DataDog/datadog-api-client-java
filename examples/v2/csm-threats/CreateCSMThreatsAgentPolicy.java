// Create a Workload Protection policy returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.CsmThreatsApi;
import com.datadog.api.client.v2.model.CloudWorkloadSecurityAgentPolicyResponse;
import com.datadog.api.client.v2.model.CloudWorkloadSecurityAgentPolicyCreateAttributes;
import com.datadog.api.client.v2.model.CloudWorkloadSecurityAgentPolicyCreateData;
import com.datadog.api.client.v2.model.CloudWorkloadSecurityAgentPolicyCreateRequest;
import com.datadog.api.client.v2.model.CloudWorkloadSecurityAgentPolicyType;
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

    CloudWorkloadSecurityAgentPolicyCreateRequest body = new CloudWorkloadSecurityAgentPolicyCreateRequest()
.data(new CloudWorkloadSecurityAgentPolicyCreateData()
.attributes(new CloudWorkloadSecurityAgentPolicyCreateAttributes()
.description("My agent policy")
.enabled(true)
.hostTagsLists(Collections.singletonList(Collections.singletonList("env:test")))
.name("my_agent_policy_2"))
.type(CloudWorkloadSecurityAgentPolicyType.POLICY));

    try {
      CloudWorkloadSecurityAgentPolicyResponse result = apiInstance.createCSMThreatsAgentPolicy(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CsmThreatsApi#createCSMThreatsAgentPolicy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}