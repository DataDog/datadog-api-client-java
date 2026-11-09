// Replace an AI Gateway routing rule returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.AiGatewayApi;
import com.datadog.api.client.v2.model.AiGatewayNullableRoutingRuleTierOrdering;
import com.datadog.api.client.v2.model.AiGatewayRoutingReasoningLevel;
import com.datadog.api.client.v2.model.AiGatewayRoutingRuleClassifierRequest;
import com.datadog.api.client.v2.model.AiGatewayRoutingRuleReplaceAttributes;
import com.datadog.api.client.v2.model.AiGatewayRoutingRuleReplaceData;
import com.datadog.api.client.v2.model.AiGatewayRoutingRuleReplaceRequest;
import com.datadog.api.client.v2.model.AiGatewayRoutingRuleResponse;
import com.datadog.api.client.v2.model.AiGatewayRoutingRuleTargetRequest;
import com.datadog.api.client.v2.model.AiGatewayRoutingRuleTargetType;
import com.datadog.api.client.v2.model.AiGatewayRoutingRuleTierRequest;
import com.datadog.api.client.v2.model.AiGatewayRoutingRuleType;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.updateAiGatewayRoutingRule", true);
    AiGatewayApi apiInstance = new AiGatewayApi(defaultClient);

    AiGatewayRoutingRuleReplaceRequest body =
        new AiGatewayRoutingRuleReplaceRequest()
            .data(
                new AiGatewayRoutingRuleReplaceData()
                    .attributes(
                        new AiGatewayRoutingRuleReplaceAttributes()
                            .tiers(
                                Collections.singletonList(
                                    new AiGatewayRoutingRuleTierRequest()
                                        .classifier(
                                            new AiGatewayRoutingRuleClassifierRequest()
                                                .confidenceThreshold(0.6)
                                                .context(
                                                    "Requests come from the internal coding"
                                                        + " assistant.")
                                                .model("gpt-6-luna")
                                                .provider("prod-us"))
                                        .ordering(
                                            AiGatewayNullableRoutingRuleTierOrdering.CONFIGURED)
                                        .targets(
                                            Collections.singletonList(
                                                new AiGatewayRoutingRuleTargetRequest()
                                                    ._default(false)
                                                    .id(901L)
                                                    .model("gpt-5.2-codex")
                                                    .modelId(101L)
                                                    .provider("prod-us")
                                                    .reasoningLevel(
                                                        AiGatewayRoutingReasoningLevel.MEDIUM)
                                                    .rubric(
                                                        "Writing, reviewing, or debugging code.")
                                                    .slug("coding-fallback")
                                                    .type(AiGatewayRoutingRuleTargetType.MODEL)
                                                    .weight(70L))))))
                    .id("coding")
                    .type(AiGatewayRoutingRuleType.ROUTING_RULES));

    try {
      AiGatewayRoutingRuleResponse result = apiInstance.updateAiGatewayRoutingRule("coding", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AiGatewayApi#updateAiGatewayRoutingRule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
