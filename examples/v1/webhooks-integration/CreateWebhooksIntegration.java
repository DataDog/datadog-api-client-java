// Create a webhooks integration returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.Configuration;
import com.datadog.api.client.v1.api.WebhooksIntegrationApi;
import com.datadog.api.client.v1.model.WebhooksIntegration;

public class CreateWebhooksIntegration {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    WebhooksIntegrationApi apiInstance = new WebhooksIntegrationApi(defaultClient);

    WebhooksIntegration body =
        new WebhooksIntegration()
            .name("Example-Create_a_webhooks_integration_returns_OK_response")
            .url("https://example.com/webhook");

    try {
      WebhooksIntegration result = apiInstance.createWebhooksIntegration(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksIntegrationApi#createWebhooksIntegration");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
