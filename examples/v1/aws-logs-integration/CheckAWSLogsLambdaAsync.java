// Check that an AWS Lambda Function exists returns "OK" response

import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.AwsLogsIntegrationApi;
import com.datadog.api.v1.client.model.AWSAccountAndLambdaRequest;
import com.datadog.api.v1.client.model.AWSLogsAsyncResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    AwsLogsIntegrationApi apiInstance = new AwsLogsIntegrationApi(defaultClient);

    AWSAccountAndLambdaRequest body =
        new AWSAccountAndLambdaRequest()
            .accountId("1234567")
            .lambdaArn("arn:aws:lambda:us-east-1:1234567:function:LogsCollectionAPITest");

    try {
      AWSLogsAsyncResponse result = apiInstance.checkAWSLogsLambdaAsync(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AwsLogsIntegrationApi#checkAWSLogsLambdaAsync");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
