// Delete a webhook returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.WebhooksIntegrationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    WebhooksIntegrationApi apiInstance = new WebhooksIntegrationApi(defaultClient);

    // there is a valid "webhook" in the system
    String WEBHOOK_NAME = System.getenv("WEBHOOK_NAME");

    try {
      apiInstance.deleteWebhooksIntegration(WEBHOOK_NAME);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksIntegrationApi#deleteWebhooksIntegration");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
