// Get AWS On Demand tasks returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.AgentlessScanningApi;
import com.datadog.api.client.v2.model.AwsOnDemandListResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    AgentlessScanningApi apiInstance = new AgentlessScanningApi(defaultClient);

    try {
      AwsOnDemandListResponse result = apiInstance.listAwsOnDemandTasks();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentlessScanningApi#listAwsOnDemandTasks");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
