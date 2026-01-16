// Update AWS CCM config returns "AWS CCM Config object" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.AwsIntegrationApi;
import com.datadog.api.client.v2.model.AWSCcmConfig;
import com.datadog.api.client.v2.model.AWSCcmConfigRequest;
import com.datadog.api.client.v2.model.AWSCcmConfigRequestAttributes;
import com.datadog.api.client.v2.model.AWSCcmConfigRequestData;
import com.datadog.api.client.v2.model.AWSCcmConfigResponse;
import com.datadog.api.client.v2.model.AWSCcmConfigType;
import com.datadog.api.client.v2.model.DataExportConfig;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    AwsIntegrationApi apiInstance = new AwsIntegrationApi(defaultClient);

    AWSCcmConfigRequest body =
        new AWSCcmConfigRequest()
            .data(
                new AWSCcmConfigRequestData()
                    .attributes(
                        new AWSCcmConfigRequestAttributes()
                            .ccmConfig(
                                new AWSCcmConfig()
                                    .dataExportConfigs(
                                        Collections.singletonList(
                                            new DataExportConfig()
                                                .bucketName("billing-updated")
                                                .bucketRegion("us-west-2")
                                                .reportName("cost-report-updated")
                                                .reportPrefix("reports-updated")
                                                .reportType("CUR2.0")))))
                    .type(AWSCcmConfigType.CCM_CONFIG));

    try {
      AWSCcmConfigResponse result =
          apiInstance.updateAWSAccountCCMConfig("873c7e78-8915-4c7a-a3a7-33a57adf54f4", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AwsIntegrationApi#updateAWSAccountCCMConfig");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
