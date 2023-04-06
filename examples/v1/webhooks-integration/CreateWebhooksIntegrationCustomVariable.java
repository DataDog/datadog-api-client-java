// Create a custom variable returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.WebhooksIntegrationApi;
import com.datadog.api.client.v1.model.WebhooksIntegrationCustomVariable;
import com.datadog.api.client.v1.model.WebhooksIntegrationCustomVariableResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    WebhooksIntegrationApi apiInstance = new WebhooksIntegrationApi(defaultClient);

    WebhooksIntegrationCustomVariable body =
        new WebhooksIntegrationCustomVariable()
            .isSecret(true)
            .name("EXAMPLEWEBHOOKSINTEGRATION")
            .value("CUSTOM_VARIABLE_VALUE");

    try {
      WebhooksIntegrationCustomVariableResponse result =
          apiInstance.createWebhooksIntegrationCustomVariable(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling WebhooksIntegrationApi#createWebhooksIntegrationCustomVariable");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
