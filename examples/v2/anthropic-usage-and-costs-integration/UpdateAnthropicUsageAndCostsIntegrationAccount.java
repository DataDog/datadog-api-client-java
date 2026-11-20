// Update an Anthropic Usage and Costs account returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.AnthropicUsageAndCostsIntegrationApi;
import com.datadog.api.client.v2.model.AnthropicUsageAndCostsCloudCostMetricsIntegrationDataflowRequest;
import com.datadog.api.client.v2.model.AnthropicUsageAndCostsIntegrationAccountAuthenticationUpdate;
import com.datadog.api.client.v2.model.AnthropicUsageAndCostsIntegrationAccountBearerTokenAuthType;
import com.datadog.api.client.v2.model.AnthropicUsageAndCostsIntegrationAccountBearerTokenAuthUpdate;
import com.datadog.api.client.v2.model.AnthropicUsageAndCostsIntegrationAccountResponse;
import com.datadog.api.client.v2.model.AnthropicUsageAndCostsIntegrationAccountUpdateAttributes;
import com.datadog.api.client.v2.model.AnthropicUsageAndCostsIntegrationAccountUpdateData;
import com.datadog.api.client.v2.model.AnthropicUsageAndCostsIntegrationAccountUpdateRequest;
import com.datadog.api.client.v2.model.AnthropicUsageAndCostsIntegrationDataflowsRequest;
import com.datadog.api.client.v2.model.IntegrationAccountType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled(
        "v2.updateAnthropicUsageAndCostsIntegrationAccount", true);
    AnthropicUsageAndCostsIntegrationApi apiInstance =
        new AnthropicUsageAndCostsIntegrationApi(defaultClient);

    AnthropicUsageAndCostsIntegrationAccountUpdateRequest body =
        new AnthropicUsageAndCostsIntegrationAccountUpdateRequest()
            .data(
                new AnthropicUsageAndCostsIntegrationAccountUpdateData()
                    .attributes(
                        new AnthropicUsageAndCostsIntegrationAccountUpdateAttributes()
                            .authentication(
                                new AnthropicUsageAndCostsIntegrationAccountAuthenticationUpdate(
                                    new AnthropicUsageAndCostsIntegrationAccountBearerTokenAuthUpdate()
                                        .authType(
                                            AnthropicUsageAndCostsIntegrationAccountBearerTokenAuthType
                                                .BEARER_TOKEN)
                                        .token("your-token")))
                            .dataflows(
                                new AnthropicUsageAndCostsIntegrationDataflowsRequest()
                                    .anthropicCloudCostMetrics(
                                        new AnthropicUsageAndCostsCloudCostMetricsIntegrationDataflowRequest()
                                            .enabled(true)))
                            .name("anthropic-acme"))
                    .id("9b4c7e2a-1d6f-4a3b-8e5c-0f2d7a9b6c18")
                    .type(IntegrationAccountType.INTEGRATION_ACCOUNT));

    try {
      AnthropicUsageAndCostsIntegrationAccountResponse result =
          apiInstance.updateAnthropicUsageAndCostsIntegrationAccount("account_id", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling"
              + " AnthropicUsageAndCostsIntegrationApi#updateAnthropicUsageAndCostsIntegrationAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
