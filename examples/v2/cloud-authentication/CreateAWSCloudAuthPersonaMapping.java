// Create an AWS cloud authentication persona mapping returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CloudAuthenticationApi;
import com.datadog.api.client.v2.model.AWSCloudAuthPersonaMappingCreateAttributes;
import com.datadog.api.client.v2.model.AWSCloudAuthPersonaMappingCreateData;
import com.datadog.api.client.v2.model.AWSCloudAuthPersonaMappingCreateRequest;
import com.datadog.api.client.v2.model.AWSCloudAuthPersonaMappingResponse;
import com.datadog.api.client.v2.model.AWSCloudAuthPersonaMappingType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createAWSCloudAuthPersonaMapping", true);
    CloudAuthenticationApi apiInstance = new CloudAuthenticationApi(defaultClient);

    AWSCloudAuthPersonaMappingCreateRequest body =
        new AWSCloudAuthPersonaMappingCreateRequest()
            .data(
                new AWSCloudAuthPersonaMappingCreateData()
                    .attributes(
                        new AWSCloudAuthPersonaMappingCreateAttributes()
                            .accountIdentifier("test@test.com")
                            .arnPattern("arn:aws:iam::123456789012:user/testuser"))
                    .type(AWSCloudAuthPersonaMappingType.AWS_CLOUD_AUTH_CONFIG));

    try {
      AWSCloudAuthPersonaMappingResponse result =
          apiInstance.createAWSCloudAuthPersonaMapping(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling CloudAuthenticationApi#createAWSCloudAuthPersonaMapping");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
