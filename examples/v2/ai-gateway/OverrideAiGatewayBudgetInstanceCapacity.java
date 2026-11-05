// Override a budget instance's capacity returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.AiGatewayApi;
import com.datadog.api.client.v2.model.AiGatewayBudgetInstanceCapacityOverrideAttributes;
import com.datadog.api.client.v2.model.AiGatewayBudgetInstanceCapacityOverrideData;
import com.datadog.api.client.v2.model.AiGatewayBudgetInstanceCapacityOverrideRequest;
import com.datadog.api.client.v2.model.AiGatewayBudgetInstanceResponse;
import com.datadog.api.client.v2.model.AiGatewayBudgetInstanceType;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.overrideAiGatewayBudgetInstanceCapacity", true);
    AiGatewayApi apiInstance = new AiGatewayApi(defaultClient);

    AiGatewayBudgetInstanceCapacityOverrideRequest body =
        new AiGatewayBudgetInstanceCapacityOverrideRequest()
            .data(
                new AiGatewayBudgetInstanceCapacityOverrideData()
                    .attributes(
                        new AiGatewayBudgetInstanceCapacityOverrideAttributes()
                            .capacityMicrocents(250000000L)
                            .instanceKey("v1|7:user_id=36:22222222-2222-2222-2222-222222222222")
                            .reason("Temporary increase for a launch week"))
                    .type(AiGatewayBudgetInstanceType.BUDGET_INSTANCES));

    try {
      AiGatewayBudgetInstanceResponse result =
          apiInstance.overrideAiGatewayBudgetInstanceCapacity(
              UUID.fromString("11111111-1111-1111-1111-111111111111"), body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling AiGatewayApi#overrideAiGatewayBudgetInstanceCapacity");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
