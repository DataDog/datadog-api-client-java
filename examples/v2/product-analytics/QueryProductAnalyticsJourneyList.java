// List journey entities returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ProductAnalyticsApi;
import com.datadog.api.client.v2.model.ProductAnalyticsBaseQuery;
import com.datadog.api.client.v2.model.ProductAnalyticsEventQuery;
import com.datadog.api.client.v2.model.ProductAnalyticsEventQueryDataSource;
import com.datadog.api.client.v2.model.ProductAnalyticsEventSearch;
import com.datadog.api.client.v2.model.ProductAnalyticsGraphQueryGroupBy;
import com.datadog.api.client.v2.model.ProductAnalyticsGraphQueryGroupBySource;
import com.datadog.api.client.v2.model.ProductAnalyticsGroupBySort;
import com.datadog.api.client.v2.model.ProductAnalyticsJoinKeys;
import com.datadog.api.client.v2.model.ProductAnalyticsJourneyAudienceAccountQuery;
import com.datadog.api.client.v2.model.ProductAnalyticsJourneyAudienceFilters;
import com.datadog.api.client.v2.model.ProductAnalyticsJourneyAudienceSegmentQuery;
import com.datadog.api.client.v2.model.ProductAnalyticsJourneyAudienceUserQuery;
import com.datadog.api.client.v2.model.ProductAnalyticsJourneyComputedColumn;
import com.datadog.api.client.v2.model.ProductAnalyticsJourneyComputedColumnName;
import com.datadog.api.client.v2.model.ProductAnalyticsJourneyConversionType;
import com.datadog.api.client.v2.model.ProductAnalyticsJourneyListQuery;
import com.datadog.api.client.v2.model.ProductAnalyticsJourneyListRequest;
import com.datadog.api.client.v2.model.ProductAnalyticsJourneyListRequestAttributes;
import com.datadog.api.client.v2.model.ProductAnalyticsJourneyListRequestData;
import com.datadog.api.client.v2.model.ProductAnalyticsJourneyListRequestType;
import com.datadog.api.client.v2.model.ProductAnalyticsJourneyListResponse;
import com.datadog.api.client.v2.model.ProductAnalyticsJourneyListSort;
import com.datadog.api.client.v2.model.ProductAnalyticsJourneyNodeTarget;
import com.datadog.api.client.v2.model.ProductAnalyticsJourneyNodeTargetType;
import com.datadog.api.client.v2.model.ProductAnalyticsJourneySearch;
import com.datadog.api.client.v2.model.ProductAnalyticsJourneySearchFilters;
import com.datadog.api.client.v2.model.ProductAnalyticsJourneySearchGraphFilter;
import com.datadog.api.client.v2.model.ProductAnalyticsJourneySearchGraphFilterName;
import com.datadog.api.client.v2.model.ProductAnalyticsJourneySearchGraphFilterOperator;
import com.datadog.api.client.v2.model.ProductAnalyticsJourneyTarget;
import com.datadog.api.client.v2.model.QuerySortOrder;
import java.util.Collections;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.queryProductAnalyticsJourneyList", true);
    ProductAnalyticsApi apiInstance = new ProductAnalyticsApi(defaultClient);

    ProductAnalyticsJourneyListRequest body =
        new ProductAnalyticsJourneyListRequest()
            .data(
                new ProductAnalyticsJourneyListRequestData()
                    .attributes(
                        new ProductAnalyticsJourneyListRequestAttributes()
                            .from(1756425600000L)
                            .query(
                                new ProductAnalyticsJourneyListQuery()
                                    .computedColumns(
                                        Collections.singletonList(
                                            new ProductAnalyticsJourneyComputedColumn()
                                                .name(
                                                    ProductAnalyticsJourneyComputedColumnName
                                                        .FIRST_CONVERSION_TIMESTAMPS)))
                                    .conversionType(
                                        ProductAnalyticsJourneyConversionType.CONVERSION)
                                    .groupBy(
                                        Collections.singletonList(
                                            new ProductAnalyticsGraphQueryGroupBy()
                                                .facet("@geo.country")
                                                .shouldExcludeMissing(false)
                                                .sort(
                                                    new ProductAnalyticsGroupBySort()
                                                        .aggregation("count")
                                                        .order(QuerySortOrder.DESC))
                                                .source(
                                                    ProductAnalyticsGraphQueryGroupBySource.USERS)
                                                .target(
                                                    new ProductAnalyticsJourneyTarget(
                                                        new ProductAnalyticsJourneyNodeTarget()
                                                            .type(
                                                                ProductAnalyticsJourneyNodeTargetType
                                                                    .NODE)
                                                            .value("A")))))
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
                                    .sort(
                                        new ProductAnalyticsJourneyListSort()
                                            .order(QuerySortOrder.DESC))
                                    .target(
                                        new ProductAnalyticsJourneyTarget(
                                            new ProductAnalyticsJourneyNodeTarget()
                                                .type(ProductAnalyticsJourneyNodeTargetType.NODE)
                                                .value("A"))))
                            .to(1756857600000L))
                    .type(ProductAnalyticsJourneyListRequestType.JOURNEY_LIST_REQUEST));

    try {
      ProductAnalyticsJourneyListResponse result =
          apiInstance.queryProductAnalyticsJourneyList(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling ProductAnalyticsApi#queryProductAnalyticsJourneyList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
