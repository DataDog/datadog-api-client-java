// Compute Sankey flow analysis returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ProductAnalyticsApi;
import com.datadog.api.client.v2.model.ProductAnalyticsJoinKeys;
import com.datadog.api.client.v2.model.ProductAnalyticsSankeyDefinition;
import com.datadog.api.client.v2.model.ProductAnalyticsSankeyRequest;
import com.datadog.api.client.v2.model.ProductAnalyticsSankeyRequestAttributes;
import com.datadog.api.client.v2.model.ProductAnalyticsSankeyRequestData;
import com.datadog.api.client.v2.model.ProductAnalyticsSankeyRequestType;
import com.datadog.api.client.v2.model.ProductAnalyticsSankeyResponse;
import com.datadog.api.client.v2.model.ProductAnalyticsSankeySearch;
import com.datadog.api.client.v2.model.ProductAnalyticsSankeyTime;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    ProductAnalyticsApi apiInstance = new ProductAnalyticsApi(defaultClient);

    ProductAnalyticsSankeyRequest body =
        new ProductAnalyticsSankeyRequest()
            .data(
                new ProductAnalyticsSankeyRequestData()
                    .attributes(
                        new ProductAnalyticsSankeyRequestAttributes()
                            .dataSource("product_analytics")
                            .definition(
                                new ProductAnalyticsSankeyDefinition()
                                    .entriesPerStep(5L)
                                    .numberOfSteps(5L)
                                    .source("/logs")
                                    .target(""))
                            .search(
                                new ProductAnalyticsSankeySearch()
                                    .joinKeys(new ProductAnalyticsJoinKeys().primary("@session.id"))
                                    .query("@type:view"))
                            .time(
                                new ProductAnalyticsSankeyTime()
                                    .from(1771232048460L)
                                    .to(1771836848262L)))
                    .type(ProductAnalyticsSankeyRequestType.SANKEY_REQUEST));

    try {
      ProductAnalyticsSankeyResponse result = apiInstance.queryProductAnalyticsSankey(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductAnalyticsApi#queryProductAnalyticsSankey");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
