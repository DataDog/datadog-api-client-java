// Update a web integration account returns "OK" response

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
    defaultClient.setUnstableOperationEnabled("v2.updateWebIntegrationAccount", true);
    WebIntegrationsApi apiInstance = new WebIntegrationsApi(defaultClient);

    WebIntegrationAccountUpdateRequest body =
        new WebIntegrationAccountUpdateRequest()
            .data(
                new WebIntegrationAccountUpdateRequestData()
                    .attributes(
                        new WebIntegrationAccountUpdateRequestAttributes()
                            .name("my-databricks-account")
                            .secrets(Map.ofEntries(Map.entry("client_secret", "my-client-secret")))
                            .settings(
                                Map.ofEntries(
                                    Map.entry(
                                        "workspace_url", "https://example.azuredatabricks.net"))))
                    .type(WebIntegrationAccountType.ACCOUNT));

    try {
      WebIntegrationAccountResponse result =
          apiInstance.updateWebIntegrationAccount("integration_name", "account_id", body);
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
