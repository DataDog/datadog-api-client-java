// Create a Twilio integration account returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.TwilioIntegrationAccountsApi;
import com.datadog.api.client.v2.model.IntegrationAccountType;
import com.datadog.api.client.v2.model.TwilioAuthentication;
import com.datadog.api.client.v2.model.TwilioBasicAuth;
import com.datadog.api.client.v2.model.TwilioBasicAuthType;
import com.datadog.api.client.v2.model.TwilioDataflow;
import com.datadog.api.client.v2.model.TwilioDataflowId;
import com.datadog.api.client.v2.model.TwilioIntegrationAccountAttributes;
import com.datadog.api.client.v2.model.TwilioIntegrationAccountCreateData;
import com.datadog.api.client.v2.model.TwilioIntegrationAccountRequest;
import com.datadog.api.client.v2.model.TwilioIntegrationAccountResponse;
import com.datadog.api.client.v2.model.TwilioInterface;
import com.datadog.api.client.v2.model.TwilioInterfaceType;
import com.datadog.api.client.v2.model.TwilioSettings;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createTwilioIntegrationAccount", true);
    TwilioIntegrationAccountsApi apiInstance = new TwilioIntegrationAccountsApi(defaultClient);

    TwilioIntegrationAccountRequest body =
        new TwilioIntegrationAccountRequest()
            .data(
                new TwilioIntegrationAccountCreateData()
                    .attributes(
                        new TwilioIntegrationAccountAttributes()
                            ._interface(
                                new TwilioInterface()
                                    .authentication(
                                        new TwilioAuthentication(
                                            new TwilioBasicAuth()
                                                .apiKey("SKxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                                                .apiKeyToken("your-api-key-secret")
                                                .type(TwilioBasicAuthType.BASIC)))
                                    .dataflows(
                                        Collections.singletonList(
                                            new TwilioDataflow()
                                                .enabled(true)
                                                .id(TwilioDataflowId.MESSAGES_LOGS)))
                                    .settings(
                                        new TwilioSettings()
                                            .accountSid("ACxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                                            .censorLogs(true))
                                    .type(TwilioInterfaceType.TWILIO))
                            .name("twilio-prod"))
                    .type(IntegrationAccountType.INTEGRATION_ACCOUNT));

    try {
      TwilioIntegrationAccountResponse result =
          apiInstance.createTwilioIntegrationAccount(TwilioInterfaceType.TWILIO, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling TwilioIntegrationAccountsApi#createTwilioIntegrationAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
