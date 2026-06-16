// List Slack user bindings returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SlackIntegrationApi;
import com.datadog.api.client.v2.model.SlackUserBindingsResponse;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SlackIntegrationApi apiInstance = new SlackIntegrationApi(defaultClient);

    try {
      SlackUserBindingsResponse result =
          apiInstance.listSlackUserBindings(
              UUID.fromString("9b1deb4d-3b7d-4bad-9bdd-2b0d7b3dcb6d"));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SlackIntegrationApi#listSlackUserBindings");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
