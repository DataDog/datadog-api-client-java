// Get an AWS cloud authentication intake mapping returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CloudAuthenticationApi;
import com.datadog.api.client.v2.model.AWSCloudAuthIntakeMappingResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.getAWSCloudAuthIntakeMapping", true);
    CloudAuthenticationApi apiInstance = new CloudAuthenticationApi(defaultClient);

    // there is a valid "aws_cloud_auth_intake_mapping" in the system
    String AWS_CLOUD_AUTH_INTAKE_MAPPING_DATA_ID =
        System.getenv("AWS_CLOUD_AUTH_INTAKE_MAPPING_DATA_ID");

    try {
      AWSCloudAuthIntakeMappingResponse result =
          apiInstance.getAWSCloudAuthIntakeMapping(AWS_CLOUD_AUTH_INTAKE_MAPPING_DATA_ID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling CloudAuthenticationApi#getAWSCloudAuthIntakeMapping");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
