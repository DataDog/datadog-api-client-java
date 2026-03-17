// Create integration account returns "Created: The account was successfully created." response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.IntegrationAccountsApi;
import com.datadog.api.client.v2.model.WebIntegrationAccountCreateRequest;
import com.datadog.api.client.v2.model.WebIntegrationAccountCreateRequestAttributes;
import com.datadog.api.client.v2.model.WebIntegrationAccountCreateRequestData;
import com.datadog.api.client.v2.model.WebIntegrationAccountResponse;
import com.datadog.api.client.v2.model.WebIntegrationAccountType;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    IntegrationAccountsApi apiInstance = new IntegrationAccountsApi(defaultClient);

    WebIntegrationAccountCreateRequest body =
        new WebIntegrationAccountCreateRequest()
            .data(
                new WebIntegrationAccountCreateRequestData()
                    .attributes(
                        new WebIntegrationAccountCreateRequestAttributes()
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
                    .type(WebIntegrationAccountType.ACCOUNT));

    try {
      WebIntegrationAccountResponse result =
          apiInstance.createWebIntegrationAccount("twilio", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling IntegrationAccountsApi#createWebIntegrationAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
