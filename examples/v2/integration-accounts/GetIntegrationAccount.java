// Get an integration account returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.IntegrationAccountsApi;
import com.datadog.api.client.v2.model.IntegrationAccountIntegrationId;
import com.datadog.api.client.v2.model.IntegrationAccountInterfaceId;
import com.datadog.api.client.v2.model.IntegrationAccountResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.getIntegrationAccount", true);
    IntegrationAccountsApi apiInstance = new IntegrationAccountsApi(defaultClient);

    try {
      IntegrationAccountResponse result =
          apiInstance.getIntegrationAccount(
              IntegrationAccountIntegrationId.TWILIO,
              IntegrationAccountInterfaceId.TWILIO,
              "account_id");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationAccountsApi#getIntegrationAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
