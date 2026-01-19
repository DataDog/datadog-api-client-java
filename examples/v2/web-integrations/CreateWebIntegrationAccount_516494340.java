// Create integration account returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.WebIntegrationsApi;
import com.datadog.api.client.v2.model.WebIntegrationAccountCreateRequest;
import com.datadog.api.client.v2.model.WebIntegrationAccountCreateRequestAttributes;
import com.datadog.api.client.v2.model.WebIntegrationAccountCreateRequestData;
import com.datadog.api.client.v2.model.WebIntegrationAccountResponse;
import com.datadog.api.client.v2.model.WebIntegrationAccountType;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    WebIntegrationsApi apiInstance = new WebIntegrationsApi(defaultClient);

    WebIntegrationAccountCreateRequest body =
        new WebIntegrationAccountCreateRequest()
            .data(
                new WebIntegrationAccountCreateRequestData()
                    .type(WebIntegrationAccountType.ACCOUNT)
                    .attributes(
                        new WebIntegrationAccountCreateRequestAttributes()
                            .name("Example-Web-Integration")
                            .settings(
                                Map.ofEntries(
                                    Map.entry("api_key", "SKxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"),
                                    Map.entry("account_sid", "ACxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"),
                                    Map.entry("events", "True"),
                                    Map.entry("messages", "True"),
                                    Map.entry("alerts", "True"),
                                    Map.entry("call_summaries", "True"),
                                    Map.entry("ccm_enabled", "True"),
                                    Map.entry("censor_logs", "True")))
                            .secrets(
                                Map.ofEntries(Map.entry("api_key_token", "test_secret_token")))));

    try {
      WebIntegrationAccountResponse result =
          apiInstance.createWebIntegrationAccount("twilio", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebIntegrationsApi#createWebIntegrationAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
