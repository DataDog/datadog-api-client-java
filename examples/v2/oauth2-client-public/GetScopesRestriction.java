// Get an OAuth2 client scopes restriction returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.OAuth2ClientPublicApi;
import com.datadog.api.client.v2.model.OAuthScopesRestrictionResponse;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.getScopesRestriction", true);
    OAuth2ClientPublicApi apiInstance = new OAuth2ClientPublicApi(defaultClient);

    try {
      OAuthScopesRestrictionResponse result =
          apiInstance.getScopesRestriction(UUID.fromString("fafa8e1c-36a5-11f0-a83d-da7ad0900001"));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OAuth2ClientPublicApi#getScopesRestriction");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
