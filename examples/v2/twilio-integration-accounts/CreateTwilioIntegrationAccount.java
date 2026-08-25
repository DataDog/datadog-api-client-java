// Create a Twilio integration account returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.TwilioIntegrationAccountsApi;
import com.datadog.api.client.v2.model.IntegrationAccountBasicAuthRequest;
import com.datadog.api.client.v2.model.IntegrationAccountBasicAuthType;
import com.datadog.api.client.v2.model.IntegrationAccountType;
import com.datadog.api.client.v2.model.TwilioAlertsLogsIntegrationDataflowRequest;
import com.datadog.api.client.v2.model.TwilioCallSummariesLogsIntegrationDataflowRequest;
import com.datadog.api.client.v2.model.TwilioCloudCostMetricsIntegrationDataflowRequest;
import com.datadog.api.client.v2.model.TwilioEventsLogsIntegrationDataflowRequest;
import com.datadog.api.client.v2.model.TwilioIntegrationAccountAuthenticationRequest;
import com.datadog.api.client.v2.model.TwilioIntegrationAccountCreateAttributes;
import com.datadog.api.client.v2.model.TwilioIntegrationAccountCreateData;
import com.datadog.api.client.v2.model.TwilioIntegrationAccountCreateRequest;
import com.datadog.api.client.v2.model.TwilioIntegrationAccountResponse;
import com.datadog.api.client.v2.model.TwilioIntegrationAccountSettingsRequest;
import com.datadog.api.client.v2.model.TwilioIntegrationDataflowsRequest;
import com.datadog.api.client.v2.model.TwilioMessagesLogsIntegrationDataflowRequest;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createTwilioIntegrationAccount", true);
    TwilioIntegrationAccountsApi apiInstance = new TwilioIntegrationAccountsApi(defaultClient);

    TwilioIntegrationAccountCreateRequest body =
        new TwilioIntegrationAccountCreateRequest()
            .data(
                new TwilioIntegrationAccountCreateData()
                    .attributes(
                        new TwilioIntegrationAccountCreateAttributes()
                            .authentication(
                                new TwilioIntegrationAccountAuthenticationRequest(
                                    new IntegrationAccountBasicAuthRequest()
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
                                new TwilioIntegrationAccountSettingsRequest()
                                    .accountSid("ACxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                                    .censorLogs(true)))
                    .type(IntegrationAccountType.INTEGRATION_ACCOUNT));

    try {
      TwilioIntegrationAccountResponse result = apiInstance.createTwilioIntegrationAccount(body);
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
