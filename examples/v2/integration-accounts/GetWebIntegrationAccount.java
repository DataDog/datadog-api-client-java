// Get integration account returns "OK: The account details for the specified integration." response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.IntegrationAccountsApi;
import com.datadog.api.client.v2.model.WebIntegrationAccountResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    IntegrationAccountsApi apiInstance = new IntegrationAccountsApi(defaultClient);

    try {
      WebIntegrationAccountResponse result =
          apiInstance.getWebIntegrationAccount("twilio", "abc123def456");
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
