// Get aggregated connections returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CloudNetworkMonitoringApi;
import com.datadog.api.client.v2.model.SingleAggregatedConnectionResponseArray;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    CloudNetworkMonitoringApi apiInstance = new CloudNetworkMonitoringApi(defaultClient);

    try {
      SingleAggregatedConnectionResponseArray result = apiInstance.getAggregatedConnections();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling CloudNetworkMonitoringApi#getAggregatedConnections");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
