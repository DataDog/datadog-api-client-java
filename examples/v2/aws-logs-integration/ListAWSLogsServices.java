// Get list of AWS log ready services returns "AWS Logs Services List object" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.AwsLogsIntegrationApi;
import com.datadog.api.client.v2.model.AWSLogsServicesResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    AwsLogsIntegrationApi apiInstance = new AwsLogsIntegrationApi(defaultClient);

    try {
      AWSLogsServicesResponse result = apiInstance.listAWSLogsServices();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AwsLogsIntegrationApi#listAWSLogsServices");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
