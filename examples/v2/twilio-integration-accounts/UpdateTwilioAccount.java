// Update a Twilio integration account returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.TwilioIntegrationAccountsApi;
import com.datadog.api.client.v2.model.IntegrationAccountType;
import com.datadog.api.client.v2.model.TwilioAccountResponse;
import com.datadog.api.client.v2.model.TwilioAccountUpdateAttributes;
import com.datadog.api.client.v2.model.TwilioAccountUpdateData;
import com.datadog.api.client.v2.model.TwilioAccountUpdateRequest;
import com.datadog.api.client.v2.model.TwilioAuthentication;
import com.datadog.api.client.v2.model.TwilioBasicAuth;
import com.datadog.api.client.v2.model.TwilioBasicAuthType;
import com.datadog.api.client.v2.model.TwilioDataflow;
import com.datadog.api.client.v2.model.TwilioDataflowId;
import com.datadog.api.client.v2.model.TwilioSettingsUpdate;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.updateTwilioAccount", true);
    TwilioIntegrationAccountsApi apiInstance = new TwilioIntegrationAccountsApi(defaultClient);

    TwilioAccountUpdateRequest body =
        new TwilioAccountUpdateRequest()
            .data(
                new TwilioAccountUpdateData()
                    .attributes(
                        new TwilioAccountUpdateAttributes()
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
                            .name("twilio-prod")
                            .settings(
                                new TwilioSettingsUpdate()
                                    .accountSid("ACxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                                    .censorLogs(true)))
                    .type(IntegrationAccountType.INTEGRATION_ACCOUNT));

    try {
      TwilioAccountResponse result = apiInstance.updateTwilioAccount("account_id", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TwilioIntegrationAccountsApi#updateTwilioAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
