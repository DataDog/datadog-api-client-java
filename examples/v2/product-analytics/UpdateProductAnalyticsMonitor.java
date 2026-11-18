// Update a Product Analytics monitor returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ProductAnalyticsApi;
import com.datadog.api.client.v2.model.ProductAnalyticsMonitorOptions;
import com.datadog.api.client.v2.model.ProductAnalyticsMonitorRequestType;
import com.datadog.api.client.v2.model.ProductAnalyticsMonitorResponse;
import com.datadog.api.client.v2.model.ProductAnalyticsMonitorThresholds;
import com.datadog.api.client.v2.model.ProductAnalyticsMonitorUpdateAttributes;
import com.datadog.api.client.v2.model.ProductAnalyticsMonitorUpdateData;
import com.datadog.api.client.v2.model.ProductAnalyticsMonitorUpdateRequest;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.updateProductAnalyticsMonitor", true);
    ProductAnalyticsApi apiInstance = new ProductAnalyticsApi(defaultClient);

    ProductAnalyticsMonitorUpdateRequest body =
        new ProductAnalyticsMonitorUpdateRequest()
            .data(
                new ProductAnalyticsMonitorUpdateData()
                    .attributes(
                        new ProductAnalyticsMonitorUpdateAttributes()
                            .name("Funnel conversion drop")
                            .options(
                                new ProductAnalyticsMonitorOptions()
                                    .thresholds(
                                        new ProductAnalyticsMonitorThresholds()
                                            .critical(1.0)
                                            .warning(1.5))))
                    .type(ProductAnalyticsMonitorRequestType.PA_MONITOR_REQUEST));

    try {
      ProductAnalyticsMonitorResponse result =
          apiInstance.updateProductAnalyticsMonitor("12345", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling ProductAnalyticsApi#updateProductAnalyticsMonitor");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
