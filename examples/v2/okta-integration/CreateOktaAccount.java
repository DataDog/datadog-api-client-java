// Add Okta account returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.OktaIntegrationApi;
import com.datadog.api.client.v2.model.OktaAccountResponse;
import com.datadog.api.client.v2.model.OktaAccount;
import com.datadog.api.client.v2.model.OktaAccountAttributes;
import com.datadog.api.client.v2.model.OktaAccountRequest;
import com.datadog.api.client.v2.model.OktaAccountType;
import java.io.File;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    OktaIntegrationApi apiInstance = new OktaIntegrationApi(defaultClient);

    OktaAccountRequest body = new OktaAccountRequest()
.data(new OktaAccount()
.attributes(new OktaAccountAttributes()
.authMethod("oauth")
.domain("https://example.okta.com/")
.name("exampleoktaintegration")
.clientId("client_id")
.clientSecret("client_secret"))
.id("f749daaf-682e-4208-a38d-c9b43162c609")
.type(OktaAccountType.OKTA_ACCOUNTS));

    try {
      OktaAccountResponse result = apiInstance.createOktaAccount(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OktaIntegrationApi#createOktaAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}