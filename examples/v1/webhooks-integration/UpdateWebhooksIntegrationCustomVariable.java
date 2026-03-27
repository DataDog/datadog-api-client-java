// Update a custom variable returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v1.api.WebhooksIntegrationApi;
import com.datadog.api.client.v1.model.WebhooksIntegrationCustomVariableResponse;
import com.datadog.api.client.v1.model.WebhooksIntegrationCustomVariableUpdateRequest;
import java.io.File;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    WebhooksIntegrationApi apiInstance = new WebhooksIntegrationApi(defaultClient);

    // there is a valid "webhook_custom_variable" in the system
    String WEBHOOK_CUSTOM_VARIABLE_NAME = System.getenv("WEBHOOK_CUSTOM_VARIABLE_NAME");

    WebhooksIntegrationCustomVariableUpdateRequest body = new WebhooksIntegrationCustomVariableUpdateRequest()
.value("variable-updated");

    try {
      WebhooksIntegrationCustomVariableResponse result = apiInstance.updateWebhooksIntegrationCustomVariable(WEBHOOK_CUSTOM_VARIABLE_NAME, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksIntegrationApi#updateWebhooksIntegrationCustomVariable");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}