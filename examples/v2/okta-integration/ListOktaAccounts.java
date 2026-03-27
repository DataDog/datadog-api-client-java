// List Okta accounts returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.OktaIntegrationApi;
import com.datadog.api.client.v2.model.OktaAccountsResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    OktaIntegrationApi apiInstance = new OktaIntegrationApi(defaultClient);

    try {
      OktaAccountsResponse result = apiInstance.listOktaAccounts();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OktaIntegrationApi#listOktaAccounts");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
