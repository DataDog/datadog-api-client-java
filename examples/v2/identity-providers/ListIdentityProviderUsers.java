// List users with an identity provider override returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.IdentityProvidersApi;
import com.datadog.api.client.v2.model.UsersResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    IdentityProvidersApi apiInstance = new IdentityProvidersApi(defaultClient);

    try {
      UsersResponse result =
          apiInstance.listIdentityProviderUsers("00000000-0000-0000-0000-000000000001");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IdentityProvidersApi#listIdentityProviderUsers");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
