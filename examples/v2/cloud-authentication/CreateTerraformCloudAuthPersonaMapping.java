// Create an HCP Terraform persona mapping returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CloudAuthenticationApi;
import com.datadog.api.client.v2.model.TerraformCloudAuthIssuerURL;
import com.datadog.api.client.v2.model.TerraformCloudAuthPersonaMappingCreateAttributes;
import com.datadog.api.client.v2.model.TerraformCloudAuthPersonaMappingCreateData;
import com.datadog.api.client.v2.model.TerraformCloudAuthPersonaMappingCreateRequest;
import com.datadog.api.client.v2.model.TerraformCloudAuthPersonaMappingResponse;
import com.datadog.api.client.v2.model.TerraformCloudAuthPersonaMappingType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.createTerraformCloudAuthPersonaMapping", true);
    CloudAuthenticationApi apiInstance = new CloudAuthenticationApi(defaultClient);

    // there is a valid "service_account_user_with_role" in the system
    String SERVICE_ACCOUNT_USER_WITH_ROLE_DATA_ATTRIBUTES_EMAIL =
        System.getenv("SERVICE_ACCOUNT_USER_WITH_ROLE_DATA_ATTRIBUTES_EMAIL");

    TerraformCloudAuthPersonaMappingCreateRequest body =
        new TerraformCloudAuthPersonaMappingCreateRequest()
            .data(
                new TerraformCloudAuthPersonaMappingCreateData()
                    .type(TerraformCloudAuthPersonaMappingType.TERRAFORM_CLOUD_AUTH_CONFIG)
                    .attributes(
                        new TerraformCloudAuthPersonaMappingCreateAttributes()
                            .issuerUrl(TerraformCloudAuthIssuerURL.US)
                            .subPattern(
                                "organization:datadog-api-spec:project:Default"
                                    + " Project:workspace:sdk-examplecloudauthentication:run_phase:*")
                            .accountIdentifier(
                                SERVICE_ACCOUNT_USER_WITH_ROLE_DATA_ATTRIBUTES_EMAIL)));

    try {
      TerraformCloudAuthPersonaMappingResponse result =
          apiInstance.createTerraformCloudAuthPersonaMapping(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling CloudAuthenticationApi#createTerraformCloudAuthPersonaMapping");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
