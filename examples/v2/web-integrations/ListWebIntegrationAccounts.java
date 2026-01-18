// List integration accounts returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.WebIntegrationsApi;
import com.datadog.api.client.v2.model.WebIntegrationAccountsResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    WebIntegrationsApi apiInstance = new WebIntegrationsApi(defaultClient);

    try {
      WebIntegrationAccountsResponse result = apiInstance.listWebIntegrationAccounts("twilio");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebIntegrationsApi#listWebIntegrationAccounts");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
