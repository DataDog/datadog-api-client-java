// Create an AI Gateway budget returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.AiGatewayApi;
import com.datadog.api.client.v2.model.AiGatewayBudgetCreateAttributes;
import com.datadog.api.client.v2.model.AiGatewayBudgetCreateData;
import com.datadog.api.client.v2.model.AiGatewayBudgetCreateRequest;
import com.datadog.api.client.v2.model.AiGatewayBudgetEnforcement;
import com.datadog.api.client.v2.model.AiGatewayBudgetResponse;
import com.datadog.api.client.v2.model.AiGatewayBudgetSelectorEntry;
import com.datadog.api.client.v2.model.AiGatewayBudgetType;
import com.datadog.api.client.v2.model.AiGatewayBudgetWindowPolicy;
import java.util.Collections;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.createAiGatewayBudget", true);
    AiGatewayApi apiInstance = new AiGatewayApi(defaultClient);

    AiGatewayBudgetCreateRequest body =
        new AiGatewayBudgetCreateRequest()
            .data(
                new AiGatewayBudgetCreateData()
                    .attributes(
                        new AiGatewayBudgetCreateAttributes()
                            .capacityMicrocents(100000000L)
                            .enforcement(AiGatewayBudgetEnforcement.BLOCK)
                            .name("Coding agents")
                            .selector(
                                Collections.singletonList(
                                    new AiGatewayBudgetSelectorEntry()
                                        .dim("user_id")
                                        .perValue(true)
                                        .values(
                                            Collections.singletonList(
                                                "11111111-1111-1111-1111-111111111111"))))
                            .tags(Map.ofEntries(Map.entry("model", "gpt-5.2-codex")))
                            .trackExisting(false)
                            .warningThreshold(0.9)
                            .windowPolicy(AiGatewayBudgetWindowPolicy.MONTHLY))
                    .type(AiGatewayBudgetType.BUDGETS));

    try {
      AiGatewayBudgetResponse result = apiInstance.createAiGatewayBudget(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AiGatewayApi#createAiGatewayBudget");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
