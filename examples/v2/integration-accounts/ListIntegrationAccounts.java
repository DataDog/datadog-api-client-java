// List integration accounts returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.IntegrationAccountsApi;
import com.datadog.api.client.v2.model.IntegrationAccountIntegrationId;
import com.datadog.api.client.v2.model.IntegrationAccountInterfaceId;
import com.datadog.api.client.v2.model.IntegrationAccountsResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.listIntegrationAccounts", true);
    IntegrationAccountsApi apiInstance = new IntegrationAccountsApi(defaultClient);

    try {
      IntegrationAccountsResponse result =
          apiInstance.listIntegrationAccounts(
              IntegrationAccountIntegrationId.TWILIO, IntegrationAccountInterfaceId.TWILIO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationAccountsApi#listIntegrationAccounts");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
