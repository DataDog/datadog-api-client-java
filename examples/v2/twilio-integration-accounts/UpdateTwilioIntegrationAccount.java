// Update a Twilio integration account returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.TwilioIntegrationAccountsApi;
import com.datadog.api.client.v2.model.IntegrationAccountBasicAuthType;
import com.datadog.api.client.v2.model.IntegrationAccountBasicAuthUpdate;
import com.datadog.api.client.v2.model.IntegrationAccountType;
import com.datadog.api.client.v2.model.TwilioAlertsLogsIntegrationDataflowRequest;
import com.datadog.api.client.v2.model.TwilioCallSummariesLogsIntegrationDataflowRequest;
import com.datadog.api.client.v2.model.TwilioCloudCostMetricsIntegrationDataflowRequest;
import com.datadog.api.client.v2.model.TwilioEventsLogsIntegrationDataflowRequest;
import com.datadog.api.client.v2.model.TwilioIntegrationAccountAuthenticationUpdate;
import com.datadog.api.client.v2.model.TwilioIntegrationAccountResponse;
import com.datadog.api.client.v2.model.TwilioIntegrationAccountSettingsUpdate;
import com.datadog.api.client.v2.model.TwilioIntegrationAccountUpdateAttributes;
import com.datadog.api.client.v2.model.TwilioIntegrationAccountUpdateData;
import com.datadog.api.client.v2.model.TwilioIntegrationAccountUpdateRequest;
import com.datadog.api.client.v2.model.TwilioIntegrationDataflowsRequest;
import com.datadog.api.client.v2.model.TwilioMessagesLogsIntegrationDataflowRequest;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.updateTwilioIntegrationAccount", true);
    TwilioIntegrationAccountsApi apiInstance = new TwilioIntegrationAccountsApi(defaultClient);

    TwilioIntegrationAccountUpdateRequest body =
        new TwilioIntegrationAccountUpdateRequest()
            .data(
                new TwilioIntegrationAccountUpdateData()
                    .attributes(
                        new TwilioIntegrationAccountUpdateAttributes()
                            .authentication(
                                new TwilioIntegrationAccountAuthenticationUpdate(
                                    new IntegrationAccountBasicAuthUpdate()
                                        .authType(IntegrationAccountBasicAuthType.BASIC)
                                        .password("your-password")
                                        .username("datadog")))
                            .dataflows(
                                new TwilioIntegrationDataflowsRequest()
                                    .twilioAlertsLogs(
                                        new TwilioAlertsLogsIntegrationDataflowRequest()
                                            .enabled(true))
                                    .twilioCallSummariesLogs(
                                        new TwilioCallSummariesLogsIntegrationDataflowRequest()
                                            .enabled(true))
                                    .twilioCloudCostMetrics(
                                        new TwilioCloudCostMetricsIntegrationDataflowRequest()
                                            .enabled(true))
                                    .twilioEventsLogs(
                                        new TwilioEventsLogsIntegrationDataflowRequest()
                                            .enabled(true))
                                    .twilioMessagesLogs(
                                        new TwilioMessagesLogsIntegrationDataflowRequest()
                                            .enabled(true)))
                            .name("twilio-prod")
                            .settings(
                                new TwilioIntegrationAccountSettingsUpdate()
                                    .accountSid("ACxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                                    .censorLogs(true)))
                    .id("953a0060-81ec-4221-aed4-d4733b59cd96")
                    .type(IntegrationAccountType.INTEGRATION_ACCOUNT));

    try {
      TwilioIntegrationAccountResponse result =
          apiInstance.updateTwilioIntegrationAccount("account_id", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling TwilioIntegrationAccountsApi#updateTwilioIntegrationAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
