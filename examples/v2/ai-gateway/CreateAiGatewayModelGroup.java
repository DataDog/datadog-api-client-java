// Create an AI Gateway model group returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.AiGatewayApi;
import com.datadog.api.client.v2.model.AiGatewayMaxReasoningLevel;
import com.datadog.api.client.v2.model.AiGatewayModelGroupBinding;
import com.datadog.api.client.v2.model.AiGatewayModelGroupBindingRelation;
import com.datadog.api.client.v2.model.AiGatewayModelGroupCreateAttributes;
import com.datadog.api.client.v2.model.AiGatewayModelGroupCreateData;
import com.datadog.api.client.v2.model.AiGatewayModelGroupCreateRequest;
import com.datadog.api.client.v2.model.AiGatewayModelGroupResponse;
import com.datadog.api.client.v2.model.AiGatewayModelGroupType;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.createAiGatewayModelGroup", true);
    AiGatewayApi apiInstance = new AiGatewayApi(defaultClient);

    AiGatewayModelGroupCreateRequest body =
        new AiGatewayModelGroupCreateRequest()
            .data(
                new AiGatewayModelGroupCreateData()
                    .attributes(
                        new AiGatewayModelGroupCreateAttributes()
                            .allowFastMode(true)
                            .bindings(
                                Collections.singletonList(
                                    new AiGatewayModelGroupBinding()
                                        .principals(
                                            Collections.singletonList(
                                                "user:55555555-5555-5555-5555-555555555555"))
                                        .relation(AiGatewayModelGroupBindingRelation.RUNNER)))
                            .maxReasoningLevel(AiGatewayMaxReasoningLevel.HIGH)
                            .modelIds(Collections.singletonList(101L))
                            .name("Coding models")
                            .routingRuleSlugs(Collections.singletonList("coding-route")))
                    .type(AiGatewayModelGroupType.MODEL_GROUPS));

    try {
      AiGatewayModelGroupResponse result = apiInstance.createAiGatewayModelGroup(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AiGatewayApi#createAiGatewayModelGroup");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
