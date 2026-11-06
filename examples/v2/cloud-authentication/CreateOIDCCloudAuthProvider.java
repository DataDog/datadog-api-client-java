// Create a Custom OIDC provider returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CloudAuthenticationApi;
import com.datadog.api.client.v2.model.OIDCCloudAuthDiscoveryType;
import com.datadog.api.client.v2.model.OIDCCloudAuthProviderCreateAttributes;
import com.datadog.api.client.v2.model.OIDCCloudAuthProviderCreateData;
import com.datadog.api.client.v2.model.OIDCCloudAuthProviderCreateRequest;
import com.datadog.api.client.v2.model.OIDCCloudAuthProviderResponse;
import com.datadog.api.client.v2.model.OIDCCloudAuthProviderType;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.createOIDCCloudAuthProvider", true);
    CloudAuthenticationApi apiInstance = new CloudAuthenticationApi(defaultClient);

    OIDCCloudAuthProviderCreateRequest body =
        new OIDCCloudAuthProviderCreateRequest()
            .data(
                new OIDCCloudAuthProviderCreateData()
                    .type(OIDCCloudAuthProviderType.CUSTOM_OIDC_PROVIDER_CONFIG)
                    .attributes(
                        new OIDCCloudAuthProviderCreateAttributes()
                            .providerName("oidc-de20b7e944abfac3")
                            .issuerUrl("https://oidc-de20b7e944abfac3.example.com")
                            .discoveryType(OIDCCloudAuthDiscoveryType.OIDC_DISCOVERY)
                            .audiences(Collections.singletonList("sdk-test"))));

    try {
      OIDCCloudAuthProviderResponse result = apiInstance.createOIDCCloudAuthProvider(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling CloudAuthenticationApi#createOIDCCloudAuthProvider");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
