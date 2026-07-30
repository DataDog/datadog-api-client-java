// Delete an integration account returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.IntegrationAccountsApi;
import com.datadog.api.client.v2.model.IntegrationAccountIntegrationId;
import com.datadog.api.client.v2.model.IntegrationAccountInterfaceId;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.deleteIntegrationAccount", true);
    IntegrationAccountsApi apiInstance = new IntegrationAccountsApi(defaultClient);

    try {
      apiInstance.deleteIntegrationAccount(
          IntegrationAccountIntegrationId.TWILIO,
          IntegrationAccountInterfaceId.TWILIO,
          "account_id");
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationAccountsApi#deleteIntegrationAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
