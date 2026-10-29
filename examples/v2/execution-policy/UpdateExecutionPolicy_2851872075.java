// Update an execution policy to Slack with scope and targets returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ExecutionPolicyApi;
import com.datadog.api.client.v2.model.ExecutionPolicyActionPattern;
import com.datadog.api.client.v2.model.ExecutionPolicyEffect;
import com.datadog.api.client.v2.model.ExecutionPolicyIntegration;
import com.datadog.api.client.v2.model.ExecutionPolicyResponse;
import com.datadog.api.client.v2.model.ExecutionPolicyScope;
import com.datadog.api.client.v2.model.ExecutionPolicySlackScope;
import com.datadog.api.client.v2.model.ExecutionPolicySlackScopeRule;
import com.datadog.api.client.v2.model.ExecutionPolicyTarget;
import com.datadog.api.client.v2.model.ExecutionPolicyType;
import com.datadog.api.client.v2.model.ExecutionPolicyUpdateRequest;
import com.datadog.api.client.v2.model.ExecutionPolicyUpdateRequestData;
import com.datadog.api.client.v2.model.ExecutionPolicyWriteAttributes;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.updateExecutionPolicy", true);
    ExecutionPolicyApi apiInstance = new ExecutionPolicyApi(defaultClient);

    // there is a valid "execution_policy" in the system
    String EXECUTION_POLICY_DATA_ID = System.getenv("EXECUTION_POLICY_DATA_ID");

    ExecutionPolicyUpdateRequest body =
        new ExecutionPolicyUpdateRequest()
            .data(
                new ExecutionPolicyUpdateRequestData()
                    .id(EXECUTION_POLICY_DATA_ID)
                    .type(ExecutionPolicyType.EXECUTION_POLICY)
                    .attributes(
                        new ExecutionPolicyWriteAttributes()
                            .name("Cassette Execution Policy Updated")
                            .effect(ExecutionPolicyEffect.DENY)
                            .actionPattern(
                                new ExecutionPolicyActionPattern()
                                    .integration(ExecutionPolicyIntegration.INTEGRATION_SLACK)
                                    .actionFqns(Collections.singletonList("*")))
                            .scope(
                                new ExecutionPolicyScope()
                                    .slack(
                                        new ExecutionPolicySlackScope()
                                            .rules(
                                                Collections.singletonList(
                                                    new ExecutionPolicySlackScopeRule()
                                                        .channelNameSelectors(
                                                            Collections.singletonList(
                                                                "incident-denied"))))))
                            .targets(
                                Collections.singletonList(
                                    new ExecutionPolicyTarget()
                                        .name("Incident workspace")
                                        .agentTags(
                                            Collections.singletonList(
                                                "slack_workspace_id:T01234567"))))));

    try {
      ExecutionPolicyResponse result =
          apiInstance.updateExecutionPolicy(EXECUTION_POLICY_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExecutionPolicyApi#updateExecutionPolicy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
