// Update an OAuth2 client credentials auth method returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.WebhooksIntegrationApi;
import com.datadog.api.client.v2.model.WebhooksOAuth2ClientCredentialsResponse;
import com.datadog.api.client.v2.model.WebhooksOAuth2ClientCredentialsType;
import com.datadog.api.client.v2.model.WebhooksOAuth2ClientCredentialsUpdateAttributes;
import com.datadog.api.client.v2.model.WebhooksOAuth2ClientCredentialsUpdateData;
import com.datadog.api.client.v2.model.WebhooksOAuth2ClientCredentialsUpdateRequest;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    WebhooksIntegrationApi apiInstance = new WebhooksIntegrationApi(defaultClient);

    WebhooksOAuth2ClientCredentialsUpdateRequest body =
        new WebhooksOAuth2ClientCredentialsUpdateRequest()
            .data(
                new WebhooksOAuth2ClientCredentialsUpdateData()
                    .attributes(
                        new WebhooksOAuth2ClientCredentialsUpdateAttributes()
                            .accessTokenUrl("https://example.com/oauth/token")
                            .audience("https://api.example.com")
                            .clientId("my-client-id")
                            .clientSecret("my-client-secret")
                            .name("my-oauth2-auth")
                            .scope("read:webhooks write:webhooks"))
                    .type(
                        WebhooksOAuth2ClientCredentialsType
                            .WEBHOOKS_AUTH_METHOD_OAUTH2_CLIENT_CREDENTIALS));

    try {
      WebhooksOAuth2ClientCredentialsResponse result =
          apiInstance.updateOAuth2ClientCredentials("auth_method_id", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling WebhooksIntegrationApi#updateOAuth2ClientCredentials");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
