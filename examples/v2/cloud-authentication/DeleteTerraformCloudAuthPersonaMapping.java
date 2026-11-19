// Delete an HCP Terraform persona mapping returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CloudAuthenticationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.deleteTerraformCloudAuthPersonaMapping", true);
    CloudAuthenticationApi apiInstance = new CloudAuthenticationApi(defaultClient);

    // there is a valid "terraform_cloud_auth_persona_mapping" in the system
    String TERRAFORM_CLOUD_AUTH_PERSONA_MAPPING_DATA_ID =
        System.getenv("TERRAFORM_CLOUD_AUTH_PERSONA_MAPPING_DATA_ID");

    try {
      apiInstance.deleteTerraformCloudAuthPersonaMapping(
          TERRAFORM_CLOUD_AUTH_PERSONA_MAPPING_DATA_ID);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling CloudAuthenticationApi#deleteTerraformCloudAuthPersonaMapping");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
