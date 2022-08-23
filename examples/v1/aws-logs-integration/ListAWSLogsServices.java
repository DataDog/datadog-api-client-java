// Get list of AWS log ready services returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.AwsLogsIntegrationApi;
import com.datadog.api.client.v1.model.AWSLogsListServicesResponse;
import java.util.List;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    AwsLogsIntegrationApi apiInstance = new AwsLogsIntegrationApi(defaultClient);

    try {
      List<AWSLogsListServicesResponse> result = apiInstance.listAWSLogsServices();
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
