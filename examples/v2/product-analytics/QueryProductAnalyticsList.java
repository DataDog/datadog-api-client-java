// List analytics events returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ProductAnalyticsApi;
import com.datadog.api.client.v2.model.ProductAnalyticsAnalyticsListQuery;
import com.datadog.api.client.v2.model.ProductAnalyticsAnalyticsListRequest;
import com.datadog.api.client.v2.model.ProductAnalyticsAnalyticsListRequestAttributes;
import com.datadog.api.client.v2.model.ProductAnalyticsAnalyticsListRequestData;
import com.datadog.api.client.v2.model.ProductAnalyticsAnalyticsListRequestType;
import com.datadog.api.client.v2.model.ProductAnalyticsAnalyticsListResponse;
import com.datadog.api.client.v2.model.ProductAnalyticsBaseQuery;
import com.datadog.api.client.v2.model.ProductAnalyticsEventQuery;
import com.datadog.api.client.v2.model.ProductAnalyticsEventQueryDataSource;
import com.datadog.api.client.v2.model.ProductAnalyticsEventSearch;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.queryProductAnalyticsList", true);
    ProductAnalyticsApi apiInstance = new ProductAnalyticsApi(defaultClient);

    ProductAnalyticsAnalyticsListRequest body =
        new ProductAnalyticsAnalyticsListRequest()
            .data(
                new ProductAnalyticsAnalyticsListRequestData()
                    .attributes(
                        new ProductAnalyticsAnalyticsListRequestAttributes()
                            .from(1771232048460L)
                            .query(
                                new ProductAnalyticsAnalyticsListQuery()
                                    .columns(Collections.singletonList("@view.name"))
                                    .limit(100L)
                                    .query(
                                        new ProductAnalyticsBaseQuery(
                                            new ProductAnalyticsEventQuery()
                                                .dataSource(
                                                    ProductAnalyticsEventQueryDataSource
                                                        .PRODUCT_ANALYTICS)
                                                .search(
                                                    new ProductAnalyticsEventSearch()
                                                        .query("@type:view")))))
                            .to(1771836848262L))
                    .type(
                        ProductAnalyticsAnalyticsListRequestType
                            .FORMULA_ANALYTICS_EXTENDED_LIST_REQUEST));

    try {
      ProductAnalyticsAnalyticsListResponse result = apiInstance.queryProductAnalyticsList(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductAnalyticsApi#queryProductAnalyticsList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
