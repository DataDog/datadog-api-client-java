// Update an AI Gateway model group returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.AiGatewayApi;
import com.datadog.api.client.v2.model.AiGatewayModelGroupResponse;
import com.datadog.api.client.v2.model.AiGatewayModelGroupType;
import com.datadog.api.client.v2.model.AiGatewayModelGroupUpdateAttributes;
import com.datadog.api.client.v2.model.AiGatewayModelGroupUpdateData;
import com.datadog.api.client.v2.model.AiGatewayModelGroupUpdateRequest;
import com.datadog.api.client.v2.model.AiGatewayNullableMaxReasoningLevel;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.updateAiGatewayModelGroup", true);
    AiGatewayApi apiInstance = new AiGatewayApi(defaultClient);

    AiGatewayModelGroupUpdateRequest body =
        new AiGatewayModelGroupUpdateRequest()
            .data(
                new AiGatewayModelGroupUpdateData()
                    .attributes(
                        new AiGatewayModelGroupUpdateAttributes()
                            .allowFastMode(true)
                            .maxReasoningLevel(AiGatewayNullableMaxReasoningLevel.HIGH)
                            .modelIds(Collections.singletonList(101L))
                            .name("Coding models")
                            .routingRuleSlugs(Collections.singletonList("coding-route")))
                    .id("7")
                    .type(AiGatewayModelGroupType.MODEL_GROUPS));

    try {
      AiGatewayModelGroupResponse result = apiInstance.updateAiGatewayModelGroup("7", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AiGatewayApi#updateAiGatewayModelGroup");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
