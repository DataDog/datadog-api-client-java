import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.AwsLogsIntegrationApi;
import com.datadog.api.v1.client.model.*;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();

    AwsLogsIntegrationApi apiInstance = new AwsLogsIntegrationApi(defaultClient);
    AWSAccountAndLambdaRequest body =
        new AWSAccountAndLambdaRequest(); // AWSAccountAndLambdaRequest | Check AWS Log Lambda Async
                                          // request body.
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
