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
    defaultClient.setUnstableOperationEnabled("v2.updateAWSAccountCCMConfig", true);
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
                                                .bucketName("billing")
                                                .bucketRegion("us-east-1")
                                                .reportName("cost-and-usage-report")
                                                .reportPrefix("reports")
                                                .reportType("CUR2.0")))))
                    .type(AWSCcmConfigType.CCM_CONFIG));

    try {
      AWSCcmConfigResponse result =
          apiInstance.updateAWSAccountCCMConfig("aws_account_config_id", body);
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
