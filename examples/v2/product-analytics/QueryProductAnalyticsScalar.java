// Compute scalar analytics returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.ProductAnalyticsApi;
import com.datadog.api.client.v2.model.ProductAnalyticsScalarResponse;
import com.datadog.api.client.v2.model.ProductAnalyticsAnalyticsQuery;
import com.datadog.api.client.v2.model.ProductAnalyticsAnalyticsRequest;
import com.datadog.api.client.v2.model.ProductAnalyticsAnalyticsRequestAttributes;
import com.datadog.api.client.v2.model.ProductAnalyticsAnalyticsRequestData;
import com.datadog.api.client.v2.model.ProductAnalyticsAnalyticsRequestType;
import com.datadog.api.client.v2.model.ProductAnalyticsBaseQuery;
import com.datadog.api.client.v2.model.ProductAnalyticsCompute;
import com.datadog.api.client.v2.model.ProductAnalyticsEventQuery;
import com.datadog.api.client.v2.model.ProductAnalyticsEventQueryDataSource;
import com.datadog.api.client.v2.model.ProductAnalyticsEventSearch;
import java.io.File;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    ProductAnalyticsApi apiInstance = new ProductAnalyticsApi(defaultClient);

    ProductAnalyticsAnalyticsRequest body = new ProductAnalyticsAnalyticsRequest()
.data(new ProductAnalyticsAnalyticsRequestData()
.attributes(new ProductAnalyticsAnalyticsRequestAttributes()
.from(1771232048460L)
.query(new ProductAnalyticsAnalyticsQuery()
.compute(new ProductAnalyticsCompute()
.aggregation("count"))
.query(new ProductAnalyticsBaseQuery(
new ProductAnalyticsEventQuery()
.dataSource(ProductAnalyticsEventQueryDataSource.PRODUCT_ANALYTICS)
.search(new ProductAnalyticsEventSearch()
.query("@type:view")))))
.to(1771836848262L))
.type(ProductAnalyticsAnalyticsRequestType.FORMULA_ANALYTICS_EXTENDED_REQUEST));

    try {
      ProductAnalyticsScalarResponse result = apiInstance.queryProductAnalyticsScalar(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductAnalyticsApi#queryProductAnalyticsScalar");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}