// Upsert an OAuth2 client scopes restriction returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.OAuth2ClientPublicApi;
import com.datadog.api.client.v2.model.OAuthOidcScope;
import com.datadog.api.client.v2.model.OAuthScopesRestrictionResponse;
import com.datadog.api.client.v2.model.UpsertOAuthScopesRestrictionData;
import com.datadog.api.client.v2.model.UpsertOAuthScopesRestrictionDataAttributes;
import com.datadog.api.client.v2.model.UpsertOAuthScopesRestrictionRequest;
import com.datadog.api.client.v2.model.UpsertOAuthScopesRestrictionType;
import java.util.Arrays;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.upsertScopesRestriction", true);
    OAuth2ClientPublicApi apiInstance = new OAuth2ClientPublicApi(defaultClient);

    UpsertOAuthScopesRestrictionRequest body =
        new UpsertOAuthScopesRestrictionRequest()
            .data(
                new UpsertOAuthScopesRestrictionData()
                    .attributes(
                        new UpsertOAuthScopesRestrictionDataAttributes()
                            .oidcScopes(Arrays.asList(OAuthOidcScope.OPENID, OAuthOidcScope.EMAIL))
                            .permissionScopes(Arrays.asList("dashboards_read", "metrics_read")))
                    .type(UpsertOAuthScopesRestrictionType.UPSERT_SCOPES_RESTRICTION));

    try {
      OAuthScopesRestrictionResponse result =
          apiInstance.upsertScopesRestriction(
              UUID.fromString("fafa8e1c-36a5-11f0-a83d-da7ad0900001"), body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OAuth2ClientPublicApi#upsertScopesRestriction");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
