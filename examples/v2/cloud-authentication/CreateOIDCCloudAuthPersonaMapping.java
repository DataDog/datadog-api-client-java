// Create a Custom OIDC persona mapping returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CloudAuthenticationApi;
import com.datadog.api.client.v2.model.OIDCCloudAuthClaimMatchMode;
import com.datadog.api.client.v2.model.OIDCCloudAuthClaimMatcherCreate;
import com.datadog.api.client.v2.model.OIDCCloudAuthPersonaMappingCreateAttributes;
import com.datadog.api.client.v2.model.OIDCCloudAuthPersonaMappingCreateData;
import com.datadog.api.client.v2.model.OIDCCloudAuthPersonaMappingCreateRequest;
import com.datadog.api.client.v2.model.OIDCCloudAuthPersonaMappingResponse;
import com.datadog.api.client.v2.model.OIDCCloudAuthPersonaMappingType;
import java.util.Collections;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.createOIDCCloudAuthPersonaMapping", true);
    CloudAuthenticationApi apiInstance = new CloudAuthenticationApi(defaultClient);

    // there is a valid "oidc_cloud_auth_provider" in the system
    UUID OIDC_CLOUD_AUTH_PROVIDER_DATA_ID = null;
    try {
      OIDC_CLOUD_AUTH_PROVIDER_DATA_ID =
          UUID.fromString(System.getenv("OIDC_CLOUD_AUTH_PROVIDER_DATA_ID"));
    } catch (IllegalArgumentException e) {
      System.err.println("Error parsing UUID: " + e.getMessage());
    }

    // there is a valid "service_account_user_with_role" in the system
    String SERVICE_ACCOUNT_USER_WITH_ROLE_DATA_ID =
        System.getenv("SERVICE_ACCOUNT_USER_WITH_ROLE_DATA_ID");

    OIDCCloudAuthPersonaMappingCreateRequest body =
        new OIDCCloudAuthPersonaMappingCreateRequest()
            .data(
                new OIDCCloudAuthPersonaMappingCreateData()
                    .type(OIDCCloudAuthPersonaMappingType.CUSTOM_OIDC_IDENTITY_MAPPING)
                    .attributes(
                        new OIDCCloudAuthPersonaMappingCreateAttributes()
                            .providerId(OIDC_CLOUD_AUTH_PROVIDER_DATA_ID)
                            .accountUuid(SERVICE_ACCOUNT_USER_WITH_ROLE_DATA_ID)
                            .claimMatchers(
                                Collections.singletonList(
                                    new OIDCCloudAuthClaimMatcherCreate()
                                        .claim("sub")
                                        .mode(OIDCCloudAuthClaimMatchMode.EXACT)
                                        .values(
                                            Collections.singletonList(
                                                "system:serviceaccount:controllers:example-controller"))))));

    try {
      OIDCCloudAuthPersonaMappingResponse result =
          apiInstance.createOIDCCloudAuthPersonaMapping(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling CloudAuthenticationApi#createOIDCCloudAuthPersonaMapping");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
