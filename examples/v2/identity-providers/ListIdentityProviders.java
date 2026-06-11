// List identity providers returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.IdentityProvidersApi;
import com.datadog.api.client.v2.model.IdentityProvidersResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    IdentityProvidersApi apiInstance = new IdentityProvidersApi(defaultClient);

    try {
      IdentityProvidersResponse result = apiInstance.listIdentityProviders();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IdentityProvidersApi#listIdentityProviders");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
