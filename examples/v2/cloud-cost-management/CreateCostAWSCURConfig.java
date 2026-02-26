// Create Cloud Cost Management AWS CUR config returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CloudCostManagementApi;
import com.datadog.api.client.v2.model.AwsCURConfigPostData;
import com.datadog.api.client.v2.model.AwsCURConfigPostRequest;
import com.datadog.api.client.v2.model.AwsCURConfigPostRequestAttributes;
import com.datadog.api.client.v2.model.AwsCURConfigPostRequestType;
import com.datadog.api.client.v2.model.AwsCurConfigResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    CloudCostManagementApi apiInstance = new CloudCostManagementApi(defaultClient);

    AwsCURConfigPostRequest body =
        new AwsCURConfigPostRequest()
            .data(
                new AwsCURConfigPostData()
                    .attributes(
                        new AwsCURConfigPostRequestAttributes()
                            .accountId("123456789123")
                            .bucketName("dd-cost-bucket")
                            .bucketRegion("us-east-1")
                            .reportName("dd-report-name")
                            .reportPrefix("dd-report-prefix"))
                    .type(AwsCURConfigPostRequestType.AWS_CUR_CONFIG_POST_REQUEST));

    try {
      AwsCurConfigResponse result = apiInstance.createCostAWSCURConfig(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudCostManagementApi#createCostAWSCURConfig");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
