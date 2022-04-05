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
    WebhooksIntegrationCustomVariable body =
        new WebhooksIntegrationCustomVariable(); // WebhooksIntegrationCustomVariable | Define a
                                                 // custom variable request body.
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
