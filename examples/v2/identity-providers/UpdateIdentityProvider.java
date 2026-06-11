// Update an identity provider returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.IdentityProvidersApi;
import com.datadog.api.client.v2.model.IdentityProviderResponse;
import com.datadog.api.client.v2.model.IdentityProviderType;
import com.datadog.api.client.v2.model.IdentityProviderUpdateAttributes;
import com.datadog.api.client.v2.model.IdentityProviderUpdateData;
import com.datadog.api.client.v2.model.IdentityProviderUpdateRequest;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    IdentityProvidersApi apiInstance = new IdentityProvidersApi(defaultClient);

    IdentityProviderUpdateRequest body =
        new IdentityProviderUpdateRequest()
            .data(
                new IdentityProviderUpdateData()
                    .attributes(new IdentityProviderUpdateAttributes().enabled(true))
                    .id("00000000-0000-0000-0000-000000000001")
                    .type(IdentityProviderType.IDENTITY_PROVIDERS));

    try {
      IdentityProviderResponse result =
          apiInstance.updateIdentityProvider("00000000-0000-0000-0000-000000000001", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IdentityProvidersApi#updateIdentityProvider");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
