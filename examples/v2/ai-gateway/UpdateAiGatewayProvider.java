// Update an AI Gateway provider returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.AiGatewayApi;
import com.datadog.api.client.v2.model.AiGatewayProviderResponse;
import com.datadog.api.client.v2.model.AiGatewayProviderType;
import com.datadog.api.client.v2.model.AiGatewayProviderUpdateAttributes;
import com.datadog.api.client.v2.model.AiGatewayProviderUpdateData;
import com.datadog.api.client.v2.model.AiGatewayProviderUpdateRequest;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.updateAiGatewayProvider", true);
    AiGatewayApi apiInstance = new AiGatewayApi(defaultClient);

    AiGatewayProviderUpdateRequest body =
        new AiGatewayProviderUpdateRequest()
            .data(
                new AiGatewayProviderUpdateData()
                    .attributes(
                        new AiGatewayProviderUpdateAttributes()
                            .costMultiplier(1.0)
                            .name("production-us-v2"))
                    .id("42")
                    .type(AiGatewayProviderType.PROVIDERS));

    try {
      AiGatewayProviderResponse result = apiInstance.updateAiGatewayProvider(42L, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AiGatewayApi#updateAiGatewayProvider");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
