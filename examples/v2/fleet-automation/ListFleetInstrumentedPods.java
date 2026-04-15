// List instrumented pods for a cluster returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.FleetAutomationApi;
import com.datadog.api.client.v2.model.FleetInstrumentedPodsResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.listFleetInstrumentedPods", true);
    FleetAutomationApi apiInstance = new FleetAutomationApi(defaultClient);

    try {
      FleetInstrumentedPodsResponse result = apiInstance.listFleetInstrumentedPods("cluster_name");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FleetAutomationApi#listFleetInstrumentedPods");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
