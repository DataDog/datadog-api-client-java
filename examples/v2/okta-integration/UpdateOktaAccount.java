// Update Okta account returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.OktaIntegrationApi;
import com.datadog.api.client.v2.model.OktaAccountResponse;
import com.datadog.api.client.v2.model.OktaAccountType;
import com.datadog.api.client.v2.model.OktaAccountUpdateRequest;
import com.datadog.api.client.v2.model.OktaAccountUpdateRequestAttributes;
import com.datadog.api.client.v2.model.OktaAccountUpdateRequestData;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    OktaIntegrationApi apiInstance = new OktaIntegrationApi(defaultClient);

    // there is a valid "okta_account" in the system
    String OKTA_ACCOUNT_DATA_ID = System.getenv("OKTA_ACCOUNT_DATA_ID");

    OktaAccountUpdateRequest body =
        new OktaAccountUpdateRequest()
            .data(
                new OktaAccountUpdateRequestData()
                    .attributes(
                        new OktaAccountUpdateRequestAttributes()
                            .authMethod("oauth")
                            .domain("https://example.okta.com/")
                            .clientId("client_id")
                            .clientSecret("client_secret"))
                    .type(OktaAccountType.OKTA_ACCOUNTS));

    try {
      OktaAccountResponse result = apiInstance.updateOktaAccount(OKTA_ACCOUNT_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OktaIntegrationApi#updateOktaAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
