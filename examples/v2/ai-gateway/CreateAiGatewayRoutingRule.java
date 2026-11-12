// Create an AI Gateway routing rule returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.AiGatewayApi;
import com.datadog.api.client.v2.model.AiGatewayNullableRoutingRuleTierOrdering;
import com.datadog.api.client.v2.model.AiGatewayRoutingClassifierRequest;
import com.datadog.api.client.v2.model.AiGatewayRoutingReasoningLevel;
import com.datadog.api.client.v2.model.AiGatewayRoutingRuleCreateAttributes;
import com.datadog.api.client.v2.model.AiGatewayRoutingRuleCreateData;
import com.datadog.api.client.v2.model.AiGatewayRoutingRuleCreateRequest;
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
    defaultClient.setUnstableOperationEnabled("v2.createAiGatewayRoutingRule", true);
    AiGatewayApi apiInstance = new AiGatewayApi(defaultClient);

    AiGatewayRoutingRuleCreateRequest body =
        new AiGatewayRoutingRuleCreateRequest()
            .data(
                new AiGatewayRoutingRuleCreateData()
                    .attributes(
                        new AiGatewayRoutingRuleCreateAttributes()
                            .slug("coding")
                            .tiers(
                                Collections.singletonList(
                                    new AiGatewayRoutingRuleTierRequest()
                                        .classifier(
                                            new AiGatewayRoutingClassifierRequest()
                                                .confidenceThreshold(0.5)
                                                .context("Requests come from engineers.")
                                                .model("gpt-6-luna")
                                                .provider("openai"))
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
                                                    .rubric("Short factual questions.")
                                                    .slug("coding-fallback")
                                                    .type(AiGatewayRoutingRuleTargetType.MODEL)
                                                    .weight(70L))))))
                    .type(AiGatewayRoutingRuleType.ROUTING_RULES));

    try {
      AiGatewayRoutingRuleResponse result = apiInstance.createAiGatewayRoutingRule(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AiGatewayApi#createAiGatewayRoutingRule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
