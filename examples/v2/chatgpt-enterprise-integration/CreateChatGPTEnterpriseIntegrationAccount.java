// Create a ChatGPT Enterprise integration account returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ChatGptEnterpriseIntegrationApi;
import com.datadog.api.client.v2.model.ChatGPTEnterpriseAgentConsoleIntegrationDataflowRequest;
import com.datadog.api.client.v2.model.ChatGPTEnterpriseCloudCostDataIntegrationDataflowRequest;
import com.datadog.api.client.v2.model.ChatGPTEnterpriseIntegrationAccountAuthenticationRequest;
import com.datadog.api.client.v2.model.ChatGPTEnterpriseIntegrationAccountBearerTokenAuthRequest;
import com.datadog.api.client.v2.model.ChatGPTEnterpriseIntegrationAccountBearerTokenAuthType;
import com.datadog.api.client.v2.model.ChatGPTEnterpriseIntegrationAccountCreateAttributes;
import com.datadog.api.client.v2.model.ChatGPTEnterpriseIntegrationAccountCreateData;
import com.datadog.api.client.v2.model.ChatGPTEnterpriseIntegrationAccountCreateRequest;
import com.datadog.api.client.v2.model.ChatGPTEnterpriseIntegrationAccountResponse;
import com.datadog.api.client.v2.model.ChatGPTEnterpriseIntegrationAccountSettingsRequest;
import com.datadog.api.client.v2.model.ChatGPTEnterpriseIntegrationDataflowsRequest;
import com.datadog.api.client.v2.model.IntegrationAccountType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.createChatGPTEnterpriseIntegrationAccount", true);
    ChatGptEnterpriseIntegrationApi apiInstance =
        new ChatGptEnterpriseIntegrationApi(defaultClient);

    ChatGPTEnterpriseIntegrationAccountCreateRequest body =
        new ChatGPTEnterpriseIntegrationAccountCreateRequest()
            .data(
                new ChatGPTEnterpriseIntegrationAccountCreateData()
                    .attributes(
                        new ChatGPTEnterpriseIntegrationAccountCreateAttributes()
                            .authentication(
                                new ChatGPTEnterpriseIntegrationAccountAuthenticationRequest(
                                    new ChatGPTEnterpriseIntegrationAccountBearerTokenAuthRequest()
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
                                new ChatGPTEnterpriseIntegrationAccountSettingsRequest()
                                    .openaiOrgId("org-AbC123dEf456")))
                    .type(IntegrationAccountType.INTEGRATION_ACCOUNT));

    try {
      ChatGPTEnterpriseIntegrationAccountResponse result =
          apiInstance.createChatGPTEnterpriseIntegrationAccount(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling"
              + " ChatGptEnterpriseIntegrationApi#createChatGPTEnterpriseIntegrationAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
