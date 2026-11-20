// Update an OpenAI Usage and Costs account returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.OpenAiUsageandCostsIntegrationApi;
import com.datadog.api.client.v2.model.IntegrationAccountType;
import com.datadog.api.client.v2.model.OpenAIUsageAndCostsCloudCostDataIntegrationDataflowRequest;
import com.datadog.api.client.v2.model.OpenAIUsageAndCostsIntegrationAccountAuthenticationUpdate;
import com.datadog.api.client.v2.model.OpenAIUsageAndCostsIntegrationAccountBearerTokenAuthType;
import com.datadog.api.client.v2.model.OpenAIUsageAndCostsIntegrationAccountBearerTokenAuthUpdate;
import com.datadog.api.client.v2.model.OpenAIUsageAndCostsIntegrationAccountResponse;
import com.datadog.api.client.v2.model.OpenAIUsageAndCostsIntegrationAccountSettingsUpdate;
import com.datadog.api.client.v2.model.OpenAIUsageAndCostsIntegrationAccountUpdateAttributes;
import com.datadog.api.client.v2.model.OpenAIUsageAndCostsIntegrationAccountUpdateData;
import com.datadog.api.client.v2.model.OpenAIUsageAndCostsIntegrationAccountUpdateRequest;
import com.datadog.api.client.v2.model.OpenAIUsageAndCostsIntegrationDataflowsRequest;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled(
        "v2.updateOpenAIUsageAndCostsIntegrationAccount", true);
    OpenAiUsageandCostsIntegrationApi apiInstance =
        new OpenAiUsageandCostsIntegrationApi(defaultClient);

    OpenAIUsageAndCostsIntegrationAccountUpdateRequest body =
        new OpenAIUsageAndCostsIntegrationAccountUpdateRequest()
            .data(
                new OpenAIUsageAndCostsIntegrationAccountUpdateData()
                    .attributes(
                        new OpenAIUsageAndCostsIntegrationAccountUpdateAttributes()
                            .authentication(
                                new OpenAIUsageAndCostsIntegrationAccountAuthenticationUpdate(
                                    new OpenAIUsageAndCostsIntegrationAccountBearerTokenAuthUpdate()
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
                                new OpenAIUsageAndCostsIntegrationAccountSettingsUpdate()
                                    .customTags("team:ai,env:prod")))
                    .id("9c4e7a2b-1d5f-4e8a-b3c6-0f2d8a6e4b17")
                    .type(IntegrationAccountType.INTEGRATION_ACCOUNT));

    try {
      OpenAIUsageAndCostsIntegrationAccountResponse result =
          apiInstance.updateOpenAIUsageAndCostsIntegrationAccount("account_id", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling"
              + " OpenAiUsageandCostsIntegrationApi#updateOpenAIUsageAndCostsIntegrationAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
