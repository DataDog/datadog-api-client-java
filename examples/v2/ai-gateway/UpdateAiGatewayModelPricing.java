// Set a model pricing override returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.AiGatewayApi;
import com.datadog.api.client.v2.model.AiGatewayModelPricingCustomRequestConfig;
import com.datadog.api.client.v2.model.AiGatewayModelPricingCustomRequestSource;
import com.datadog.api.client.v2.model.AiGatewayModelPricingCustomRequestSourceType;
import com.datadog.api.client.v2.model.AiGatewayModelPricingRequest;
import com.datadog.api.client.v2.model.AiGatewayModelPricingRequestAttributes;
import com.datadog.api.client.v2.model.AiGatewayModelPricingRequestConfig;
import com.datadog.api.client.v2.model.AiGatewayModelPricingRequestData;
import com.datadog.api.client.v2.model.AiGatewayModelPricingRequiredRates;
import com.datadog.api.client.v2.model.AiGatewayModelPricingResponse;
import com.datadog.api.client.v2.model.AiGatewayModelPricingType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.updateAiGatewayModelPricing", true);
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
                                        .version(1L))))
                    .id("gpt-4o")
                    .type(AiGatewayModelPricingType.MODEL_PRICING));

    try {
      AiGatewayModelPricingResponse result =
          apiInstance.updateAiGatewayModelPricing(42L, "gpt-5.2-codex", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AiGatewayApi#updateAiGatewayModelPricing");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
