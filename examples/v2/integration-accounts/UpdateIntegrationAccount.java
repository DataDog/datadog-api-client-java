// Update an integration account returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.IntegrationAccountsApi;
import com.datadog.api.client.v2.model.IntegrationAccountIntegrationId;
import com.datadog.api.client.v2.model.IntegrationAccountIntegrationUpdate;
import com.datadog.api.client.v2.model.IntegrationAccountInterfaceId;
import com.datadog.api.client.v2.model.IntegrationAccountResponse;
import com.datadog.api.client.v2.model.IntegrationAccountType;
import com.datadog.api.client.v2.model.IntegrationAccountUpdateAttributes;
import com.datadog.api.client.v2.model.IntegrationAccountUpdateData;
import com.datadog.api.client.v2.model.IntegrationAccountUpdateRequest;
import com.datadog.api.client.v2.model.TwilioAuthentication;
import com.datadog.api.client.v2.model.TwilioBasicAuth;
import com.datadog.api.client.v2.model.TwilioBasicAuthType;
import com.datadog.api.client.v2.model.TwilioDataflow;
import com.datadog.api.client.v2.model.TwilioDataflowId;
import com.datadog.api.client.v2.model.TwilioIntegrationType;
import com.datadog.api.client.v2.model.TwilioIntegrationUpdate;
import com.datadog.api.client.v2.model.TwilioInterfaceType;
import com.datadog.api.client.v2.model.TwilioInterfaceUpdate;
import com.datadog.api.client.v2.model.TwilioSettingsUpdate;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.updateIntegrationAccount", true);
    IntegrationAccountsApi apiInstance = new IntegrationAccountsApi(defaultClient);

    IntegrationAccountUpdateRequest body =
        new IntegrationAccountUpdateRequest()
            .data(
                new IntegrationAccountUpdateData()
                    .attributes(
                        new IntegrationAccountUpdateAttributes()
                            .integration(
                                new IntegrationAccountIntegrationUpdate(
                                    new TwilioIntegrationUpdate()
                                        ._interface(
                                            new TwilioInterfaceUpdate()
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
                                                    new TwilioSettingsUpdate()
                                                        .accountSid(
                                                            "ACxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                                                        .censorLogs(true))
                                                .type(TwilioInterfaceType.TWILIO))
                                        .type(TwilioIntegrationType.TWILIO)))
                            .name("twilio-prod"))
                    .type(IntegrationAccountType.INTEGRATION_ACCOUNT));

    try {
      IntegrationAccountResponse result =
          apiInstance.updateIntegrationAccount(
              IntegrationAccountIntegrationId.TWILIO,
              IntegrationAccountInterfaceId.TWILIO,
              "account_id",
              body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationAccountsApi#updateIntegrationAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
