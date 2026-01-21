// Update integration account returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.WebIntegrationsApi;
import com.datadog.api.client.v2.model.WebIntegrationAccountResponse;
import com.datadog.api.client.v2.model.WebIntegrationAccountType;
import com.datadog.api.client.v2.model.WebIntegrationAccountUpdateRequest;
import com.datadog.api.client.v2.model.WebIntegrationAccountUpdateRequestAttributes;
import com.datadog.api.client.v2.model.WebIntegrationAccountUpdateRequestData;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    WebIntegrationsApi apiInstance = new WebIntegrationsApi(defaultClient);

    // there is a valid "web_integration_account" in the system
    String WEB_INTEGRATION_ACCOUNT_DATA_ID = System.getenv("WEB_INTEGRATION_ACCOUNT_DATA_ID");

    WebIntegrationAccountUpdateRequest body =
        new WebIntegrationAccountUpdateRequest()
            .data(
                new WebIntegrationAccountUpdateRequestData()
                    .type(WebIntegrationAccountType.ACCOUNT)
                    .attributes(
                        new WebIntegrationAccountUpdateRequestAttributes()
                            .name("Example-Web-Integration-updated")
                            .settings(
                                Map.ofEntries(
                                    Map.entry("events", "False"),
                                    Map.entry("messages", "False"),
                                    Map.entry("ccm_enabled", "False")))));

    try {
      WebIntegrationAccountResponse result =
          apiInstance.updateWebIntegrationAccount("twilio", WEB_INTEGRATION_ACCOUNT_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebIntegrationsApi#updateWebIntegrationAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
