// Check permissions for log services returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.AwsLogsIntegrationApi;
import com.datadog.api.client.v1.model.AWSLogsAsyncResponse;
import com.datadog.api.client.v1.model.AWSLogsServicesRequest;
import java.util.Arrays;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    AwsLogsIntegrationApi apiInstance = new AwsLogsIntegrationApi(defaultClient);

    AWSLogsServicesRequest body =
        new AWSLogsServicesRequest()
            .accountId("1234567")
            .services(Arrays.asList("s3", "elb", "elbv2", "cloudfront", "redshift", "lambda"));

    try {
      AWSLogsAsyncResponse result = apiInstance.checkAWSLogsServicesAsync(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AwsLogsIntegrationApi#checkAWSLogsServicesAsync");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
