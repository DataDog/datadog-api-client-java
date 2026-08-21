// Compute a Sankey diagram returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ProductAnalyticsApi;
import com.datadog.api.client.v2.model.ProductAnalyticsAudienceAccountSubquery;
import com.datadog.api.client.v2.model.ProductAnalyticsAudienceFilters;
import com.datadog.api.client.v2.model.ProductAnalyticsAudienceSegmentSubquery;
import com.datadog.api.client.v2.model.ProductAnalyticsAudienceUserSubquery;
import com.datadog.api.client.v2.model.ProductAnalyticsJoinKeys;
import com.datadog.api.client.v2.model.ProductAnalyticsSankeyDefinition;
import com.datadog.api.client.v2.model.ProductAnalyticsSankeyRequest;
import com.datadog.api.client.v2.model.ProductAnalyticsSankeyRequestAttributes;
import com.datadog.api.client.v2.model.ProductAnalyticsSankeyRequestData;
import com.datadog.api.client.v2.model.ProductAnalyticsSankeyRequestType;
import com.datadog.api.client.v2.model.ProductAnalyticsSankeyResponse;
import com.datadog.api.client.v2.model.ProductAnalyticsSankeySearch;
import com.datadog.api.client.v2.model.ProductAnalyticsSankeyTime;
import java.util.Collections;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.queryProductAnalyticsSankey", true);
    ProductAnalyticsApi apiInstance = new ProductAnalyticsApi(defaultClient);

    ProductAnalyticsSankeyRequest body =
        new ProductAnalyticsSankeyRequest()
            .data(
                new ProductAnalyticsSankeyRequestData()
                    .attributes(
                        new ProductAnalyticsSankeyRequestAttributes()
                            .definition(
                                new ProductAnalyticsSankeyDefinition()
                                    .entriesPerStep(10L)
                                    .numberOfSteps(3L)
                                    .source("@view.name")
                                    .target("@view.name"))
                            .search(
                                new ProductAnalyticsSankeySearch()
                                    .audienceFilters(
                                        new ProductAnalyticsAudienceFilters()
                                            .accounts(
                                                Collections.singletonList(
                                                    new ProductAnalyticsAudienceAccountSubquery()
                                                        .name("")))
                                            .formula("u")
                                            .segments(
                                                Collections.singletonList(
                                                    new ProductAnalyticsAudienceSegmentSubquery()
                                                        .name("")
                                                        .segmentId(
                                                            UUID.fromString(
                                                                "00000000-0000-0000-0000-000000000000"))))
                                            .users(
                                                Collections.singletonList(
                                                    new ProductAnalyticsAudienceUserSubquery()
                                                        .name("u")
                                                        .query("*"))))
                                    .joinKeys(new ProductAnalyticsJoinKeys().primary("@session.id"))
                                    .query("@type:view"))
                            .time(
                                new ProductAnalyticsSankeyTime()
                                    .from(1756425600000L)
                                    .to(1756857600000L)))
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
