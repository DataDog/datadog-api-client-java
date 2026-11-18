// Analyze journey drop-off returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ProductAnalyticsApi;
import com.datadog.api.client.v2.model.ProductAnalyticsBaseQuery;
import com.datadog.api.client.v2.model.ProductAnalyticsEventQuery;
import com.datadog.api.client.v2.model.ProductAnalyticsEventQueryDataSource;
import com.datadog.api.client.v2.model.ProductAnalyticsEventSearch;
import com.datadog.api.client.v2.model.ProductAnalyticsJoinKeys;
import com.datadog.api.client.v2.model.ProductAnalyticsJourneyAudienceAccountQuery;
import com.datadog.api.client.v2.model.ProductAnalyticsJourneyAudienceFilters;
import com.datadog.api.client.v2.model.ProductAnalyticsJourneyAudienceSegmentQuery;
import com.datadog.api.client.v2.model.ProductAnalyticsJourneyAudienceUserQuery;
import com.datadog.api.client.v2.model.ProductAnalyticsJourneyDropOffQuery;
import com.datadog.api.client.v2.model.ProductAnalyticsJourneyDropOffRequest;
import com.datadog.api.client.v2.model.ProductAnalyticsJourneyDropOffRequestAttributes;
import com.datadog.api.client.v2.model.ProductAnalyticsJourneyDropOffRequestData;
import com.datadog.api.client.v2.model.ProductAnalyticsJourneyDropOffRequestType;
import com.datadog.api.client.v2.model.ProductAnalyticsJourneyDropOffResponse;
import com.datadog.api.client.v2.model.ProductAnalyticsJourneyNodeTarget;
import com.datadog.api.client.v2.model.ProductAnalyticsJourneyNodeTargetType;
import com.datadog.api.client.v2.model.ProductAnalyticsJourneySearch;
import com.datadog.api.client.v2.model.ProductAnalyticsJourneySearchFilters;
import com.datadog.api.client.v2.model.ProductAnalyticsJourneySearchGraphFilter;
import com.datadog.api.client.v2.model.ProductAnalyticsJourneySearchGraphFilterName;
import com.datadog.api.client.v2.model.ProductAnalyticsJourneySearchGraphFilterOperator;
import com.datadog.api.client.v2.model.ProductAnalyticsJourneyTarget;
import com.datadog.api.client.v2.model.ProductAnalyticsSampling;
import java.util.Collections;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.queryProductAnalyticsJourneyDropOff", true);
    ProductAnalyticsApi apiInstance = new ProductAnalyticsApi(defaultClient);

    ProductAnalyticsJourneyDropOffRequest body =
        new ProductAnalyticsJourneyDropOffRequest()
            .data(
                new ProductAnalyticsJourneyDropOffRequestData()
                    .attributes(
                        new ProductAnalyticsJourneyDropOffRequestAttributes()
                            .from(1756425600000L)
                            .query(
                                new ProductAnalyticsJourneyDropOffQuery()
                                    .sampling(new ProductAnalyticsSampling().enabled(false))
                                    .search(
                                        new ProductAnalyticsJourneySearch()
                                            .expression("A -> B")
                                            .filters(
                                                new ProductAnalyticsJourneySearchFilters()
                                                    .audienceFilters(
                                                        new ProductAnalyticsJourneyAudienceFilters()
                                                            .accounts(
                                                                Collections.singletonList(
                                                                    new ProductAnalyticsJourneyAudienceAccountQuery()
                                                                        .name(
                                                                            "enterprise_accounts")))
                                                            .formula(
                                                                "power_users AND NOT trial_segment")
                                                            .segments(
                                                                Collections.singletonList(
                                                                    new ProductAnalyticsJourneyAudienceSegmentQuery()
                                                                        .name("trial_segment")
                                                                        .segmentId(
                                                                            "00000000-0000-0000-0000-000000000000")))
                                                            .users(
                                                                Collections.singletonList(
                                                                    new ProductAnalyticsJourneyAudienceUserQuery()
                                                                        .name("power_users"))))
                                                    .graphFilters(
                                                        Collections.singletonList(
                                                            new ProductAnalyticsJourneySearchGraphFilter()
                                                                .name(
                                                                    ProductAnalyticsJourneySearchGraphFilterName
                                                                        .TIME_TO_CONVERT)
                                                                .operator(
                                                                    ProductAnalyticsJourneySearchGraphFilterOperator
                                                                        .LESS_THAN_OR_EQUAL)
                                                                .target(
                                                                    new ProductAnalyticsJourneyTarget(
                                                                        new ProductAnalyticsJourneyNodeTarget()
                                                                            .type(
                                                                                ProductAnalyticsJourneyNodeTargetType
                                                                                    .NODE)
                                                                            .value("A")))
                                                                .value(60000L))))
                                            .joinKeys(
                                                new ProductAnalyticsJoinKeys()
                                                    .primary("@session.id"))
                                            .nodeObjects(
                                                Map.ofEntries(
                                                    Map.entry(
                                                        "A",
                                                        new ProductAnalyticsBaseQuery(
                                                            new ProductAnalyticsEventQuery()
                                                                .dataSource(
                                                                    ProductAnalyticsEventQueryDataSource
                                                                        .PRODUCT_ANALYTICS)
                                                                .search(
                                                                    new ProductAnalyticsEventSearch()
                                                                        .query(
                                                                            "@type:view"
                                                                                + " @view.name:Login")))),
                                                    Map.entry(
                                                        "B",
                                                        new ProductAnalyticsBaseQuery(
                                                            new ProductAnalyticsEventQuery()
                                                                .dataSource(
                                                                    ProductAnalyticsEventQueryDataSource
                                                                        .PRODUCT_ANALYTICS)
                                                                .search(
                                                                    new ProductAnalyticsEventSearch()
                                                                        .query(
                                                                            "@type:action"
                                                                                + " @action.target.name:Submit")))))))
                                    .target(
                                        new ProductAnalyticsJourneyNodeTarget()
                                            .type(ProductAnalyticsJourneyNodeTargetType.NODE)
                                            .value("B"))
                                    .topIssueCount(5L))
                            .to(1756857600000L))
                    .type(
                        ProductAnalyticsJourneyDropOffRequestType
                            .JOURNEY_DROP_OFF_ANALYSIS_REQUEST));

    try {
      ProductAnalyticsJourneyDropOffResponse result =
          apiInstance.queryProductAnalyticsJourneyDropOff(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling ProductAnalyticsApi#queryProductAnalyticsJourneyDropOff");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
