// Delete a Custom OIDC persona mapping returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CloudAuthenticationApi;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.deleteOIDCCloudAuthPersonaMapping", true);
    CloudAuthenticationApi apiInstance = new CloudAuthenticationApi(defaultClient);

    // there is a valid "oidc_cloud_auth_persona_mapping" in the system
    UUID OIDC_CLOUD_AUTH_PERSONA_MAPPING_DATA_ID = null;
    try {
      OIDC_CLOUD_AUTH_PERSONA_MAPPING_DATA_ID =
          UUID.fromString(System.getenv("OIDC_CLOUD_AUTH_PERSONA_MAPPING_DATA_ID"));
    } catch (IllegalArgumentException e) {
      System.err.println("Error parsing UUID: " + e.getMessage());
    }

    try {
      apiInstance.deleteOIDCCloudAuthPersonaMapping(OIDC_CLOUD_AUTH_PERSONA_MAPPING_DATA_ID);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling CloudAuthenticationApi#deleteOIDCCloudAuthPersonaMapping");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
