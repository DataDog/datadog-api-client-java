// Get integration account returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.IntegrationAccountsApi;
import com.datadog.api.client.v2.model.WebIntegrationAccountResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    IntegrationAccountsApi apiInstance = new IntegrationAccountsApi(defaultClient);

    // there is a valid "web_integration_account" in the system
    String WEB_INTEGRATION_ACCOUNT_DATA_ID = System.getenv("WEB_INTEGRATION_ACCOUNT_DATA_ID");

    try {
      WebIntegrationAccountResponse result =
          apiInstance.getWebIntegrationAccount("twilio", WEB_INTEGRATION_ACCOUNT_DATA_ID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationAccountsApi#getWebIntegrationAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
