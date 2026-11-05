// Create or replace an AI Gateway routing policy returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.AiGatewayApi;
import com.datadog.api.client.v2.model.AiGatewayPolicyRequest;
import com.datadog.api.client.v2.model.AiGatewayPolicyRequestAttributes;
import com.datadog.api.client.v2.model.AiGatewayPolicyRequestData;
import com.datadog.api.client.v2.model.AiGatewayPolicyResponse;
import com.datadog.api.client.v2.model.AiGatewayPolicyTargetRequest;
import com.datadog.api.client.v2.model.AiGatewayPolicyTierRequest;
import com.datadog.api.client.v2.model.AiGatewayPolicyType;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.upsertAiGatewayPolicy", true);
    AiGatewayApi apiInstance = new AiGatewayApi(defaultClient);

    AiGatewayPolicyRequest body =
        new AiGatewayPolicyRequest()
            .data(
                new AiGatewayPolicyRequestData()
                    .attributes(
                        new AiGatewayPolicyRequestAttributes()
                            .inbound("coding-agent")
                            .priority(1L)
                            .tiers(
                                Collections.singletonList(
                                    new AiGatewayPolicyTierRequest()
                                        .priority(1L)
                                        .targets(
                                            Collections.singletonList(
                                                new AiGatewayPolicyTargetRequest()
                                                    .id(901L)
                                                    .model("gpt-5.2-codex")
                                                    .provider("prod-us"))))))
                    .type(AiGatewayPolicyType.ROUTING_DOCUMENTS));

    try {
      AiGatewayPolicyResponse result = apiInstance.upsertAiGatewayPolicy(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AiGatewayApi#upsertAiGatewayPolicy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
