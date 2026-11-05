// Update an AI Gateway budget returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.AiGatewayApi;
import com.datadog.api.client.v2.model.AiGatewayBudgetEnforcement;
import com.datadog.api.client.v2.model.AiGatewayBudgetResponse;
import com.datadog.api.client.v2.model.AiGatewayBudgetType;
import com.datadog.api.client.v2.model.AiGatewayBudgetUpdateAttributes;
import com.datadog.api.client.v2.model.AiGatewayBudgetUpdateData;
import com.datadog.api.client.v2.model.AiGatewayBudgetUpdateRequest;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.updateAiGatewayBudget", true);
    AiGatewayApi apiInstance = new AiGatewayApi(defaultClient);

    AiGatewayBudgetUpdateRequest body =
        new AiGatewayBudgetUpdateRequest()
            .data(
                new AiGatewayBudgetUpdateData()
                    .attributes(
                        new AiGatewayBudgetUpdateAttributes()
                            .applyToCurrentPeriod(false)
                            .capacityMicrocents(120000000L)
                            .enabled(true)
                            .enforcement(AiGatewayBudgetEnforcement.BLOCK)
                            .name("Coding agents")
                            .reason("Temporary capacity increase approved for an incident")
                            .trackExisting(false)
                            .warningThreshold(0.8))
                    .id(UUID.fromString("11111111-1111-1111-1111-111111111111"))
                    .type(AiGatewayBudgetType.BUDGETS));

    try {
      AiGatewayBudgetResponse result =
          apiInstance.updateAiGatewayBudget(
              UUID.fromString("11111111-1111-1111-1111-111111111111"), body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AiGatewayApi#updateAiGatewayBudget");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
