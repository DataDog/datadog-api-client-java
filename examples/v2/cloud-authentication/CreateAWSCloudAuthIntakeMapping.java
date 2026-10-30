// Create an AWS cloud authentication intake mapping returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CloudAuthenticationApi;
import com.datadog.api.client.v2.model.AWSCloudAuthIntakeMappingCreateAttributes;
import com.datadog.api.client.v2.model.AWSCloudAuthIntakeMappingCreateData;
import com.datadog.api.client.v2.model.AWSCloudAuthIntakeMappingCreateRequest;
import com.datadog.api.client.v2.model.AWSCloudAuthIntakeMappingResponse;
import com.datadog.api.client.v2.model.AWSCloudAuthIntakeMappingType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.createAWSCloudAuthIntakeMapping", true);
    CloudAuthenticationApi apiInstance = new CloudAuthenticationApi(defaultClient);

    // there is an integrated AWS test account for WIF
    String AWS_WIF_ACCOUNT_V2_DATA_0_ATTRIBUTES_AWS_ACCOUNT_ID =
        System.getenv("AWS_WIF_ACCOUNT_V2_DATA_0_ATTRIBUTES_AWS_ACCOUNT_ID");

    AWSCloudAuthIntakeMappingCreateRequest body =
        new AWSCloudAuthIntakeMappingCreateRequest()
            .data(
                new AWSCloudAuthIntakeMappingCreateData()
                    .type(AWSCloudAuthIntakeMappingType.AWS_CLOUD_AUTH_INTAKE_MAPPING)
                    .attributes(
                        new AWSCloudAuthIntakeMappingCreateAttributes()
                            .arnPattern(
                                "arn:aws:sts::123456789012:assumed-role/DatadogAgent-de20b7e944abfac3/*")));

    try {
      AWSCloudAuthIntakeMappingResponse result = apiInstance.createAWSCloudAuthIntakeMapping(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling CloudAuthenticationApi#createAWSCloudAuthIntakeMapping");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
