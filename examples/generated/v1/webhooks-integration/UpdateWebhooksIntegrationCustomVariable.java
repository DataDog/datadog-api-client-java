import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.WebhooksIntegrationApi;
import com.datadog.api.v1.client.model.*;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();

    WebhooksIntegrationApi apiInstance = new WebhooksIntegrationApi(defaultClient);
    String customVariableName =
        "customVariableName_example"; // String | The name of the custom variable.
    WebhooksIntegrationCustomVariableUpdateRequest body =
        new WebhooksIntegrationCustomVariableUpdateRequest(); // WebhooksIntegrationCustomVariableUpdateRequest | Update an existing custom variable request body.
    try {
      WebhooksIntegrationCustomVariableResponse result =
          apiInstance.updateWebhooksIntegrationCustomVariable(customVariableName, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling WebhooksIntegrationApi#updateWebhooksIntegrationCustomVariable");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
