// Unlink a Product Analytics monitor from its chart returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ProductAnalyticsApi;
import com.datadog.api.client.v2.model.ProductAnalyticsMonitorUnlinkAttributes;
import com.datadog.api.client.v2.model.ProductAnalyticsMonitorUnlinkData;
import com.datadog.api.client.v2.model.ProductAnalyticsMonitorUnlinkRequest;
import com.datadog.api.client.v2.model.ProductAnalyticsMonitorUnlinkRequestType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.removeChartFromProductAnalyticsMonitor", true);
    ProductAnalyticsApi apiInstance = new ProductAnalyticsApi(defaultClient);

    ProductAnalyticsMonitorUnlinkRequest body =
        new ProductAnalyticsMonitorUnlinkRequest()
            .data(
                new ProductAnalyticsMonitorUnlinkData()
                    .attributes(
                        new ProductAnalyticsMonitorUnlinkAttributes()
                            .chartId("chart-1")
                            .dashboardId("dash-1"))
                    .type(ProductAnalyticsMonitorUnlinkRequestType.PA_MONITOR_UNLINK_REQUEST));

    try {
      apiInstance.removeChartFromProductAnalyticsMonitor("12345", body);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling ProductAnalyticsApi#removeChartFromProductAnalyticsMonitor");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
