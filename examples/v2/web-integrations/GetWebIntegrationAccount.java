// Get a web integration account returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.WebIntegrationsApi;
import com.datadog.api.client.v2.model.WebIntegrationAccountResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.getWebIntegrationAccount", true);
    WebIntegrationsApi apiInstance = new WebIntegrationsApi(defaultClient);

    try {
      WebIntegrationAccountResponse result =
          apiInstance.getWebIntegrationAccount("integration_name", "account_id");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebIntegrationsApi#getWebIntegrationAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
