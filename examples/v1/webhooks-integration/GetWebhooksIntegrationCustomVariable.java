// Get a custom variable returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.WebhooksIntegrationApi;
import com.datadog.api.client.v1.model.WebhooksIntegrationCustomVariableResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    WebhooksIntegrationApi apiInstance = new WebhooksIntegrationApi(defaultClient);

    // there is a valid "webhook_custom_variable" in the system
    String WEBHOOK_CUSTOM_VARIABLE_NAME = System.getenv("WEBHOOK_CUSTOM_VARIABLE_NAME");

    try {
      WebhooksIntegrationCustomVariableResponse result =
          apiInstance.getWebhooksIntegrationCustomVariable(WEBHOOK_CUSTOM_VARIABLE_NAME);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling WebhooksIntegrationApi#getWebhooksIntegrationCustomVariable");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
