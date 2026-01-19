// Delete integration account returns "OK: The account was successfully deleted." response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.WebIntegrationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    WebIntegrationsApi apiInstance = new WebIntegrationsApi(defaultClient);

    try {
      apiInstance.deleteWebIntegrationAccount("twilio", "abc123def456");
    } catch (ApiException e) {
      System.err.println("Exception when calling WebIntegrationsApi#deleteWebIntegrationAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
