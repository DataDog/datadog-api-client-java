// Get an HCP Terraform persona mapping returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CloudAuthenticationApi;
import com.datadog.api.client.v2.model.TerraformCloudAuthPersonaMappingResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.getTerraformCloudAuthPersonaMapping", true);
    CloudAuthenticationApi apiInstance = new CloudAuthenticationApi(defaultClient);

    // there is a valid "terraform_cloud_auth_persona_mapping" in the system
    String TERRAFORM_CLOUD_AUTH_PERSONA_MAPPING_DATA_ID =
        System.getenv("TERRAFORM_CLOUD_AUTH_PERSONA_MAPPING_DATA_ID");

    try {
      TerraformCloudAuthPersonaMappingResponse result =
          apiInstance.getTerraformCloudAuthPersonaMapping(
              TERRAFORM_CLOUD_AUTH_PERSONA_MAPPING_DATA_ID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling CloudAuthenticationApi#getTerraformCloudAuthPersonaMapping");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
