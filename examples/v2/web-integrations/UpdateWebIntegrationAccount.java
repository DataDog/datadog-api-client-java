// Update integration account returns "OK: The account was successfully updated." response

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

    WebIntegrationAccountUpdateRequest body =
        new WebIntegrationAccountUpdateRequest()
            .data(
                new WebIntegrationAccountUpdateRequestData()
                    .attributes(
                        new WebIntegrationAccountUpdateRequestAttributes()
                            .name("My Production Account (Updated)")
                            .secrets(
                                Map.ofEntries(Map.entry("api_key_token", "new_secret_token_value")))
                            .settings(
                                Map.ofEntries(
                                    Map.entry("ccm_enabled", "True"),
                                    Map.entry("events", "True"),
                                    Map.entry("messages", "False"))))
                    .type(WebIntegrationAccountType.ACCOUNT));

    try {
      WebIntegrationAccountResponse result =
          apiInstance.updateWebIntegrationAccount("twilio", "abc123def456", body);
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
