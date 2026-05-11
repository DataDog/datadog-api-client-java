// Create a web integration account returns "CREATED" response

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
    defaultClient.setUnstableOperationEnabled("v2.createWebIntegrationAccount", true);
    WebIntegrationsApi apiInstance = new WebIntegrationsApi(defaultClient);

    WebIntegrationAccountCreateRequest body =
        new WebIntegrationAccountCreateRequest()
            .data(
                new WebIntegrationAccountCreateRequestData()
                    .attributes(
                        new WebIntegrationAccountCreateRequestAttributes()
                            .name("my-databricks-account")
                            .secrets(Map.ofEntries(Map.entry("client_secret", "my-client-secret")))
                            .settings(
                                Map.ofEntries(
                                    Map.entry(
                                        "workspace_url", "https://example.azuredatabricks.net"))))
                    .type(WebIntegrationAccountType.ACCOUNT));

    try {
      WebIntegrationAccountResponse result =
          apiInstance.createWebIntegrationAccount("integration_name", body);
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
