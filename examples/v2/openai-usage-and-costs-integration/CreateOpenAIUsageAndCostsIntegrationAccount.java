// Create an OpenAI Usage and Costs account returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.OpenAiUsageandCostsIntegrationApi;
import com.datadog.api.client.v2.model.IntegrationAccountType;
import com.datadog.api.client.v2.model.OpenAIUsageAndCostsCloudCostDataIntegrationDataflowRequest;
import com.datadog.api.client.v2.model.OpenAIUsageAndCostsIntegrationAccountAuthenticationRequest;
import com.datadog.api.client.v2.model.OpenAIUsageAndCostsIntegrationAccountBearerTokenAuthRequest;
import com.datadog.api.client.v2.model.OpenAIUsageAndCostsIntegrationAccountBearerTokenAuthType;
import com.datadog.api.client.v2.model.OpenAIUsageAndCostsIntegrationAccountCreateAttributes;
import com.datadog.api.client.v2.model.OpenAIUsageAndCostsIntegrationAccountCreateData;
import com.datadog.api.client.v2.model.OpenAIUsageAndCostsIntegrationAccountCreateRequest;
import com.datadog.api.client.v2.model.OpenAIUsageAndCostsIntegrationAccountResponse;
import com.datadog.api.client.v2.model.OpenAIUsageAndCostsIntegrationAccountSettingsRequest;
import com.datadog.api.client.v2.model.OpenAIUsageAndCostsIntegrationDataflowsRequest;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled(
        "v2.createOpenAIUsageAndCostsIntegrationAccount", true);
    OpenAiUsageandCostsIntegrationApi apiInstance =
        new OpenAiUsageandCostsIntegrationApi(defaultClient);

    OpenAIUsageAndCostsIntegrationAccountCreateRequest body =
        new OpenAIUsageAndCostsIntegrationAccountCreateRequest()
            .data(
                new OpenAIUsageAndCostsIntegrationAccountCreateData()
                    .attributes(
                        new OpenAIUsageAndCostsIntegrationAccountCreateAttributes()
                            .authentication(
                                new OpenAIUsageAndCostsIntegrationAccountAuthenticationRequest(
                                    new OpenAIUsageAndCostsIntegrationAccountBearerTokenAuthRequest()
                                        .authType(
                                            OpenAIUsageAndCostsIntegrationAccountBearerTokenAuthType
                                                .BEARER_TOKEN)
                                        .token("your-token")))
                            .dataflows(
                                new OpenAIUsageAndCostsIntegrationDataflowsRequest()
                                    .openaiCloudCostData(
                                        new OpenAIUsageAndCostsCloudCostDataIntegrationDataflowRequest()
                                            .enabled(true)))
                            .name("openai-usage-and-costs-acme")
                            .settings(
                                new OpenAIUsageAndCostsIntegrationAccountSettingsRequest()
                                    .customTags("team:ai,env:prod")))
                    .type(IntegrationAccountType.INTEGRATION_ACCOUNT));

    try {
      OpenAIUsageAndCostsIntegrationAccountResponse result =
          apiInstance.createOpenAIUsageAndCostsIntegrationAccount(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling"
              + " OpenAiUsageandCostsIntegrationApi#createOpenAIUsageAndCostsIntegrationAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
