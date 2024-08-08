// Enable an AWS Logs integration returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v1.api.AwsLogsIntegrationApi;
import com.datadog.api.client.v1.model.AWSLogsServicesRequest;
import java.io.File;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    AwsLogsIntegrationApi apiInstance = new AwsLogsIntegrationApi(defaultClient);

    AWSLogsServicesRequest body = new AWSLogsServicesRequest()
.accountId("1234567")
.services(Arrays.asList("s3", "elb", "elbv2", "cloudfront", "redshift", "lambda"));

    try {
      apiInstance.enableAWSLogServices(body);
    } catch (ApiException e) {
      System.err.println("Exception when calling AwsLogsIntegrationApi#enableAWSLogServices");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}