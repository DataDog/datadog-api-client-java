// Get account schema for an integration returns "OK: The JSON schema for the integration's account
// configuration."
// response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.WebIntegrationsApi;
import com.datadog.api.client.v2.model.WebIntegrationAccountSchemaResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    WebIntegrationsApi apiInstance = new WebIntegrationsApi(defaultClient);

    try {
      WebIntegrationAccountSchemaResponse result =
          apiInstance.getWebIntegrationAccountSchema("twilio");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling WebIntegrationsApi#getWebIntegrationAccountSchema");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
