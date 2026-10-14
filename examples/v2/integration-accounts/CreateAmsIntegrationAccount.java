// Create integration account returns "Created: The account was successfully created." response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.IntegrationAccountsApi;
import com.datadog.api.client.v2.model.AmsIntegrationAccountCreateRequest;
import com.datadog.api.client.v2.model.AmsIntegrationAccountCreateRequestAttributes;
import com.datadog.api.client.v2.model.AmsIntegrationAccountCreateRequestData;
import com.datadog.api.client.v2.model.AmsIntegrationAccountResponse;
import com.datadog.api.client.v2.model.AmsIntegrationAccountType;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    IntegrationAccountsApi apiInstance = new IntegrationAccountsApi(defaultClient);

    AmsIntegrationAccountCreateRequest body =
        new AmsIntegrationAccountCreateRequest()
            .data(
                new AmsIntegrationAccountCreateRequestData()
                    .attributes(
                        new AmsIntegrationAccountCreateRequestAttributes()
                            .name("My Production Account")
                            .secrets(
                                Map.ofEntries(
                                    Map.entry("api_key_token", "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")))
                            .settings(
                                Map.ofEntries(
                                    Map.entry("account_sid", "ACxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"),
                                    Map.entry("alerts", "True"),
                                    Map.entry("api_key", "SKxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"),
                                    Map.entry("call_summaries", "True"),
                                    Map.entry("ccm_enabled", "True"),
                                    Map.entry("censor_logs", "True"),
                                    Map.entry("events", "True"),
                                    Map.entry("messages", "True"))))
                    .type(AmsIntegrationAccountType.ACCOUNT));

    try {
      AmsIntegrationAccountResponse result =
          apiInstance.createAmsIntegrationAccount("twilio", "twilio.messaging", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling IntegrationAccountsApi#createAmsIntegrationAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
