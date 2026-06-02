// Create an OAuth2 client credentials auth method returns "CREATED" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.WebhooksIntegrationApi;
import com.datadog.api.client.v2.model.WebhooksOAuth2ClientCredentialsCreateAttributes;
import com.datadog.api.client.v2.model.WebhooksOAuth2ClientCredentialsCreateData;
import com.datadog.api.client.v2.model.WebhooksOAuth2ClientCredentialsCreateRequest;
import com.datadog.api.client.v2.model.WebhooksOAuth2ClientCredentialsResponse;
import com.datadog.api.client.v2.model.WebhooksOAuth2ClientCredentialsType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    WebhooksIntegrationApi apiInstance = new WebhooksIntegrationApi(defaultClient);

    WebhooksOAuth2ClientCredentialsCreateRequest body =
        new WebhooksOAuth2ClientCredentialsCreateRequest()
            .data(
                new WebhooksOAuth2ClientCredentialsCreateData()
                    .attributes(
                        new WebhooksOAuth2ClientCredentialsCreateAttributes()
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
          apiInstance.createOAuth2ClientCredentials(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling WebhooksIntegrationApi#createOAuth2ClientCredentials");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
