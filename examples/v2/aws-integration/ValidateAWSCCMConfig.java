// Validate AWS CCM config returns "AWS CCM Config validation result" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.AwsIntegrationApi;
import com.datadog.api.client.v2.model.AWSCcmConfigValidationRequest;
import com.datadog.api.client.v2.model.AWSCcmConfigValidationRequestAttributes;
import com.datadog.api.client.v2.model.AWSCcmConfigValidationRequestData;
import com.datadog.api.client.v2.model.AWSCcmConfigValidationResponse;
import com.datadog.api.client.v2.model.AWSCcmConfigValidationType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.validateAWSCCMConfig", true);
    AwsIntegrationApi apiInstance = new AwsIntegrationApi(defaultClient);

    AWSCcmConfigValidationRequest body =
        new AWSCcmConfigValidationRequest()
            .data(
                new AWSCcmConfigValidationRequestData()
                    .attributes(
                        new AWSCcmConfigValidationRequestAttributes()
                            .accountId("123456789012")
                            .bucketName("billing")
                            .bucketRegion("us-east-1")
                            .reportName("cost-and-usage-report")
                            .reportPrefix("reports"))
                    .type(AWSCcmConfigValidationType.CCM_CONFIG_VALIDATION));

    try {
      AWSCcmConfigValidationResponse result = apiInstance.validateAWSCCMConfig(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AwsIntegrationApi#validateAWSCCMConfig");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
