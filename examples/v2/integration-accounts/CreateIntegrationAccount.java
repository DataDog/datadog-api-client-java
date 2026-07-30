// Create an integration account returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.IntegrationAccountsApi;
import com.datadog.api.client.v2.model.IntegrationAccountAttributes;
import com.datadog.api.client.v2.model.IntegrationAccountCreateData;
import com.datadog.api.client.v2.model.IntegrationAccountIntegration;
import com.datadog.api.client.v2.model.IntegrationAccountIntegrationId;
import com.datadog.api.client.v2.model.IntegrationAccountInterfaceId;
import com.datadog.api.client.v2.model.IntegrationAccountRequest;
import com.datadog.api.client.v2.model.IntegrationAccountResponse;
import com.datadog.api.client.v2.model.IntegrationAccountType;
import com.datadog.api.client.v2.model.TwilioAuthentication;
import com.datadog.api.client.v2.model.TwilioBasicAuth;
import com.datadog.api.client.v2.model.TwilioBasicAuthType;
import com.datadog.api.client.v2.model.TwilioDataflow;
import com.datadog.api.client.v2.model.TwilioDataflowId;
import com.datadog.api.client.v2.model.TwilioIntegration;
import com.datadog.api.client.v2.model.TwilioIntegrationType;
import com.datadog.api.client.v2.model.TwilioInterface;
import com.datadog.api.client.v2.model.TwilioInterfaceType;
import com.datadog.api.client.v2.model.TwilioSettings;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createIntegrationAccount", true);
    IntegrationAccountsApi apiInstance = new IntegrationAccountsApi(defaultClient);

    IntegrationAccountRequest body =
        new IntegrationAccountRequest()
            .data(
                new IntegrationAccountCreateData()
                    .attributes(
                        new IntegrationAccountAttributes()
                            .integration(
                                new IntegrationAccountIntegration(
                                    new TwilioIntegration()
                                        ._interface(
                                            new TwilioInterface()
                                                .authentication(
                                                    new TwilioAuthentication(
                                                        new TwilioBasicAuth()
                                                            .apiKey(
                                                                "SKxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                                                            .apiKeyToken("your-api-key-secret")
                                                            .type(TwilioBasicAuthType.BASIC)))
                                                .dataflows(
                                                    Collections.singletonList(
                                                        new TwilioDataflow()
                                                            .enabled(true)
                                                            .id(TwilioDataflowId.MESSAGES_LOGS)))
                                                .settings(
                                                    new TwilioSettings()
                                                        .accountSid(
                                                            "ACxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                                                        .censorLogs(true))
                                                .type(TwilioInterfaceType.TWILIO))
                                        .type(TwilioIntegrationType.TWILIO)))
                            .name("twilio-prod"))
                    .type(IntegrationAccountType.INTEGRATION_ACCOUNT));

    try {
      IntegrationAccountResponse result =
          apiInstance.createIntegrationAccount(
              IntegrationAccountIntegrationId.TWILIO, IntegrationAccountInterfaceId.TWILIO, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationAccountsApi#createIntegrationAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
