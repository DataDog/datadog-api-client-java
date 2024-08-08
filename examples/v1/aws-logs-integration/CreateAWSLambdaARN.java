// Add AWS Log Lambda ARN returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v1.api.AwsLogsIntegrationApi;
import com.datadog.api.client.v1.model.AWSAccountAndLambdaRequest;
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

    AWSAccountAndLambdaRequest body = new AWSAccountAndLambdaRequest()
.accountId("1234567")
.lambdaArn("arn:aws:lambda:us-east-1:1234567:function:LogsCollectionAPITest");

    try {
      apiInstance.createAWSLambdaARN(body);
    } catch (ApiException e) {
      System.err.println("Exception when calling AwsLogsIntegrationApi#createAWSLambdaARN");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}