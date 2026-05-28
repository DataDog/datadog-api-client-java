// Register an OAuth2 client returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.OAuth2ClientPublicApi;
import com.datadog.api.client.v2.model.OAuthClientRegistrationGrantType;
import com.datadog.api.client.v2.model.OAuthClientRegistrationRequest;
import com.datadog.api.client.v2.model.OAuthClientRegistrationResponse;
import com.datadog.api.client.v2.model.OAuthClientRegistrationResponseType;
import java.util.Arrays;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.registerOAuthClient", true);
    OAuth2ClientPublicApi apiInstance = new OAuth2ClientPublicApi(defaultClient);

    OAuthClientRegistrationRequest body =
        new OAuthClientRegistrationRequest()
            .clientName("Example MCP Client")
            .clientUri("https://example.com")
            .grantTypes(
                Arrays.asList(
                    OAuthClientRegistrationGrantType.AUTHORIZATION_CODE,
                    OAuthClientRegistrationGrantType.REFRESH_TOKEN))
            .jwksUri("https://example.com/.well-known/jwks.json")
            .logoUri("https://example.com/logo.png")
            .policyUri("https://example.com/privacy")
            .redirectUris(Collections.singletonList("https://example.com/oauth/callback"))
            .responseTypes(Collections.singletonList(OAuthClientRegistrationResponseType.CODE))
            .scope("openid profile")
            .tokenEndpointAuthMethod("none")
            .tosUri("https://example.com/tos");

    try {
      OAuthClientRegistrationResponse result = apiInstance.registerOAuthClient(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OAuth2ClientPublicApi#registerOAuthClient");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
