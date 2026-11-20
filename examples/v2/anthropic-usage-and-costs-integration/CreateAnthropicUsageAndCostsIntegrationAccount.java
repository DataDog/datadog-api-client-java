// Create an Anthropic Usage and Costs account returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.AnthropicUsageAndCostsIntegrationApi;
import com.datadog.api.client.v2.model.AnthropicUsageAndCostsCloudCostMetricsIntegrationDataflowRequest;
import com.datadog.api.client.v2.model.AnthropicUsageAndCostsIntegrationAccountAuthenticationRequest;
import com.datadog.api.client.v2.model.AnthropicUsageAndCostsIntegrationAccountBearerTokenAuthRequest;
import com.datadog.api.client.v2.model.AnthropicUsageAndCostsIntegrationAccountBearerTokenAuthType;
import com.datadog.api.client.v2.model.AnthropicUsageAndCostsIntegrationAccountCreateAttributes;
import com.datadog.api.client.v2.model.AnthropicUsageAndCostsIntegrationAccountCreateData;
import com.datadog.api.client.v2.model.AnthropicUsageAndCostsIntegrationAccountCreateRequest;
import com.datadog.api.client.v2.model.AnthropicUsageAndCostsIntegrationAccountResponse;
import com.datadog.api.client.v2.model.AnthropicUsageAndCostsIntegrationDataflowsRequest;
import com.datadog.api.client.v2.model.IntegrationAccountType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled(
        "v2.createAnthropicUsageAndCostsIntegrationAccount", true);
    AnthropicUsageAndCostsIntegrationApi apiInstance =
        new AnthropicUsageAndCostsIntegrationApi(defaultClient);

    AnthropicUsageAndCostsIntegrationAccountCreateRequest body =
        new AnthropicUsageAndCostsIntegrationAccountCreateRequest()
            .data(
                new AnthropicUsageAndCostsIntegrationAccountCreateData()
                    .attributes(
                        new AnthropicUsageAndCostsIntegrationAccountCreateAttributes()
                            .authentication(
                                new AnthropicUsageAndCostsIntegrationAccountAuthenticationRequest(
                                    new AnthropicUsageAndCostsIntegrationAccountBearerTokenAuthRequest()
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
                    .type(IntegrationAccountType.INTEGRATION_ACCOUNT));

    try {
      AnthropicUsageAndCostsIntegrationAccountResponse result =
          apiInstance.createAnthropicUsageAndCostsIntegrationAccount(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling"
              + " AnthropicUsageAndCostsIntegrationApi#createAnthropicUsageAndCostsIntegrationAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
