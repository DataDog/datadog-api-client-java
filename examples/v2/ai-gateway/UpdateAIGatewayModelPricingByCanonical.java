// Set a model pricing override by canonical ID returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.AiGatewayApi;
import com.datadog.api.client.v2.model.AiGatewayModelPricingCustomRequestConfig;
import com.datadog.api.client.v2.model.AiGatewayModelPricingCustomRequestSource;
import com.datadog.api.client.v2.model.AiGatewayModelPricingCustomRequestSourceType;
import com.datadog.api.client.v2.model.AiGatewayModelPricingRates;
import com.datadog.api.client.v2.model.AiGatewayModelPricingRequest;
import com.datadog.api.client.v2.model.AiGatewayModelPricingRequestAttributes;
import com.datadog.api.client.v2.model.AiGatewayModelPricingRequestConfig;
import com.datadog.api.client.v2.model.AiGatewayModelPricingRequestData;
import com.datadog.api.client.v2.model.AiGatewayModelPricingRequiredRates;
import com.datadog.api.client.v2.model.AiGatewayModelPricingResponse;
import com.datadog.api.client.v2.model.AiGatewayModelPricingTier;
import com.datadog.api.client.v2.model.AiGatewayModelPricingType;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.updateAIGatewayModelPricingByCanonical", true);
    AiGatewayApi apiInstance = new AiGatewayApi(defaultClient);

    AiGatewayModelPricingRequest body =
        new AiGatewayModelPricingRequest()
            .data(
                new AiGatewayModelPricingRequestData()
                    .attributes(
                        new AiGatewayModelPricingRequestAttributes()
                            .pricingConfig(
                                new AiGatewayModelPricingRequestConfig(
                                    new AiGatewayModelPricingCustomRequestConfig()
                                        .rates(new AiGatewayModelPricingRequiredRates())
                                        .source(
                                            new AiGatewayModelPricingCustomRequestSource()
                                                .type(
                                                    AiGatewayModelPricingCustomRequestSourceType
                                                        .CUSTOM))
                                        .tiers(
                                            Collections.singletonList(
                                                new AiGatewayModelPricingTier()
                                                    .contextMinTokens(200000L)
                                                    .rates(
                                                        new AiGatewayModelPricingRates()
                                                            .cacheReadCostPerMtok(0.6)
                                                            .cacheWriteCostPerMtok(7.5)
                                                            .nonCachedInputCostPerMtok(6.0)
                                                            .outputCostPerMtok(22.5))
                                                    .serviceTier("priority")))
                                        .version(1L))))
                    .id("gpt-4o")
                    .type(AiGatewayModelPricingType.MODEL_PRICING));

    try {
      AiGatewayModelPricingResponse result =
          apiInstance.updateAIGatewayModelPricingByCanonical(42L, "openai/gpt-4o", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling AiGatewayApi#updateAIGatewayModelPricingByCanonical");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
