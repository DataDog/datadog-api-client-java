// Update a ChatGPT Enterprise integration account returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ChatGptEnterpriseIntegrationApi;
import com.datadog.api.client.v2.model.ChatGPTEnterpriseAgentConsoleIntegrationDataflowRequest;
import com.datadog.api.client.v2.model.ChatGPTEnterpriseCloudCostDataIntegrationDataflowRequest;
import com.datadog.api.client.v2.model.ChatGPTEnterpriseIntegrationAccountAuthenticationUpdate;
import com.datadog.api.client.v2.model.ChatGPTEnterpriseIntegrationAccountBearerTokenAuthType;
import com.datadog.api.client.v2.model.ChatGPTEnterpriseIntegrationAccountBearerTokenAuthUpdate;
import com.datadog.api.client.v2.model.ChatGPTEnterpriseIntegrationAccountResponse;
import com.datadog.api.client.v2.model.ChatGPTEnterpriseIntegrationAccountSettingsUpdate;
import com.datadog.api.client.v2.model.ChatGPTEnterpriseIntegrationAccountUpdateAttributes;
import com.datadog.api.client.v2.model.ChatGPTEnterpriseIntegrationAccountUpdateData;
import com.datadog.api.client.v2.model.ChatGPTEnterpriseIntegrationAccountUpdateRequest;
import com.datadog.api.client.v2.model.ChatGPTEnterpriseIntegrationDataflowsRequest;
import com.datadog.api.client.v2.model.IntegrationAccountType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.updateChatGPTEnterpriseIntegrationAccount", true);
    ChatGptEnterpriseIntegrationApi apiInstance =
        new ChatGptEnterpriseIntegrationApi(defaultClient);

    ChatGPTEnterpriseIntegrationAccountUpdateRequest body =
        new ChatGPTEnterpriseIntegrationAccountUpdateRequest()
            .data(
                new ChatGPTEnterpriseIntegrationAccountUpdateData()
                    .attributes(
                        new ChatGPTEnterpriseIntegrationAccountUpdateAttributes()
                            .authentication(
                                new ChatGPTEnterpriseIntegrationAccountAuthenticationUpdate(
                                    new ChatGPTEnterpriseIntegrationAccountBearerTokenAuthUpdate()
                                        .authType(
                                            ChatGPTEnterpriseIntegrationAccountBearerTokenAuthType
                                                .BEARER_TOKEN)
                                        .token("your-token")))
                            .dataflows(
                                new ChatGPTEnterpriseIntegrationDataflowsRequest()
                                    .chatgptEnterpriseAgentConsole(
                                        new ChatGPTEnterpriseAgentConsoleIntegrationDataflowRequest()
                                            .enabled(true))
                                    .chatgptEnterpriseCloudCostData(
                                        new ChatGPTEnterpriseCloudCostDataIntegrationDataflowRequest()
                                            .enabled(true)))
                            .name("chatgpt-enterprise-acme")
                            .settings(
                                new ChatGPTEnterpriseIntegrationAccountSettingsUpdate()
                                    .openaiOrgId("org-AbC123dEf456")))
                    .id("3e8a1f6b-9c2d-4b7e-8a5f-6d1c4e9b2a03")
                    .type(IntegrationAccountType.INTEGRATION_ACCOUNT));

    try {
      ChatGPTEnterpriseIntegrationAccountResponse result =
          apiInstance.updateChatGPTEnterpriseIntegrationAccount("account_id", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling"
              + " ChatGptEnterpriseIntegrationApi#updateChatGPTEnterpriseIntegrationAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
