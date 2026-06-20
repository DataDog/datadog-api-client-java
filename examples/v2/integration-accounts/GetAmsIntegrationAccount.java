// Get integration account returns "OK: The account details for the specified integration." response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.IntegrationAccountsApi;
import com.datadog.api.client.v2.model.AmsIntegrationAccountResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    IntegrationAccountsApi apiInstance = new IntegrationAccountsApi(defaultClient);

    try {
      AmsIntegrationAccountResponse result =
          apiInstance.getAmsIntegrationAccount("twilio", "twilio.messaging", "abc123def456");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationAccountsApi#getAmsIntegrationAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
