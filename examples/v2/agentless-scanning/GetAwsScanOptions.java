// Get AWS scan options returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.AgentlessScanningApi;
import com.datadog.api.client.v2.model.AwsScanOptionsResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    AgentlessScanningApi apiInstance = new AgentlessScanningApi(defaultClient);

    // there is a valid "aws_scan_options" in the system
    String AWS_SCAN_OPTIONS_ID = System.getenv("AWS_SCAN_OPTIONS_ID");

    try {
      AwsScanOptionsResponse result = apiInstance.getAwsScanOptions(AWS_SCAN_OPTIONS_ID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentlessScanningApi#getAwsScanOptions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
