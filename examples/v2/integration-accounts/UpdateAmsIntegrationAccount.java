// Update integration account returns "OK: The account was successfully updated." response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.IntegrationAccountsApi;
import com.datadog.api.client.v2.model.AmsIntegrationAccountResponse;
import com.datadog.api.client.v2.model.AmsIntegrationAccountType;
import com.datadog.api.client.v2.model.AmsIntegrationAccountUpdateRequest;
import com.datadog.api.client.v2.model.AmsIntegrationAccountUpdateRequestAttributes;
import com.datadog.api.client.v2.model.AmsIntegrationAccountUpdateRequestData;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    IntegrationAccountsApi apiInstance = new IntegrationAccountsApi(defaultClient);

    AmsIntegrationAccountUpdateRequest body =
        new AmsIntegrationAccountUpdateRequest()
            .data(
                new AmsIntegrationAccountUpdateRequestData()
                    .attributes(
                        new AmsIntegrationAccountUpdateRequestAttributes()
                            .name("My Production Account (Updated)")
                            .secrets(
                                Map.ofEntries(Map.entry("api_key_token", "new_secret_token_value")))
                            .settings(
                                Map.ofEntries(
                                    Map.entry("ccm_enabled", "True"),
                                    Map.entry("events", "True"),
                                    Map.entry("messages", "False"))))
                    .type(AmsIntegrationAccountType.ACCOUNT));

    try {
      AmsIntegrationAccountResponse result =
          apiInstance.updateAmsIntegrationAccount(
              "twilio", "twilio.messaging", "abc123def456", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling IntegrationAccountsApi#updateAmsIntegrationAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
