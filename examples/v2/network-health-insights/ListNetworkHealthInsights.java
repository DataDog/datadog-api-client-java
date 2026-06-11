// List network health insights returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.NetworkHealthInsightsApi;
import com.datadog.api.client.v2.model.NetworkHealthInsightsResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.listNetworkHealthInsights", true);
    NetworkHealthInsightsApi apiInstance = new NetworkHealthInsightsApi(defaultClient);

    try {
      NetworkHealthInsightsResponse result = apiInstance.listNetworkHealthInsights();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling NetworkHealthInsightsApi#listNetworkHealthInsights");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
