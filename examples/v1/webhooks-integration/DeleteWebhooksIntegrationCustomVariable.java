// Delete a custom variable returns "OK" response

import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.WebhooksIntegrationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    WebhooksIntegrationApi apiInstance = new WebhooksIntegrationApi(defaultClient);

    // there is a valid "webhook_custom_variable" in the system
    String WEBHOOK_CUSTOM_VARIABLE_NAME = System.getenv("WEBHOOK_CUSTOM_VARIABLE_NAME");

    try {
      apiInstance.deleteWebhooksIntegrationCustomVariable(WEBHOOK_CUSTOM_VARIABLE_NAME);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling WebhooksIntegrationApi#deleteWebhooksIntegrationCustomVariable");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
