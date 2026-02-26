// Get AWS on demand task returns "OK." response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.AgentlessScanningApi;
import com.datadog.api.client.v2.model.AwsOnDemandResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    AgentlessScanningApi apiInstance = new AgentlessScanningApi(defaultClient);

    try {
      AwsOnDemandResponse result =
          apiInstance.getAwsOnDemandTask("63d6b4f5-e5d0-4d90-824a-9580f05f026a");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentlessScanningApi#getAwsOnDemandTask");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
