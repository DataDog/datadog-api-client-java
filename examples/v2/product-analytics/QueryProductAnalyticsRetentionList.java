// List the entities behind a retention cell returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ProductAnalyticsApi;
import com.datadog.api.client.v2.model.ProductAnalyticsAudienceAccountSubquery;
import com.datadog.api.client.v2.model.ProductAnalyticsAudienceFilters;
import com.datadog.api.client.v2.model.ProductAnalyticsAudienceSegmentSubquery;
import com.datadog.api.client.v2.model.ProductAnalyticsAudienceUserSubquery;
import com.datadog.api.client.v2.model.ProductAnalyticsBaseQuery;
import com.datadog.api.client.v2.model.ProductAnalyticsCalendarInterval;
import com.datadog.api.client.v2.model.ProductAnalyticsCalendarIntervalType;
import com.datadog.api.client.v2.model.ProductAnalyticsEventQuery;
import com.datadog.api.client.v2.model.ProductAnalyticsEventQueryDataSource;
import com.datadog.api.client.v2.model.ProductAnalyticsEventSearch;
import com.datadog.api.client.v2.model.ProductAnalyticsRetentionCalendarTimeInterval;
import com.datadog.api.client.v2.model.ProductAnalyticsRetentionCalendarTimeIntervalType;
import com.datadog.api.client.v2.model.ProductAnalyticsRetentionCellScope;
import com.datadog.api.client.v2.model.ProductAnalyticsRetentionCellScopeType;
import com.datadog.api.client.v2.model.ProductAnalyticsRetentionCohortCriteria;
import com.datadog.api.client.v2.model.ProductAnalyticsRetentionCohortTarget;
import com.datadog.api.client.v2.model.ProductAnalyticsRetentionEntity;
import com.datadog.api.client.v2.model.ProductAnalyticsRetentionFilters;
import com.datadog.api.client.v2.model.ProductAnalyticsRetentionIndexTarget;
import com.datadog.api.client.v2.model.ProductAnalyticsRetentionIndexTargetType;
import com.datadog.api.client.v2.model.ProductAnalyticsRetentionListColumn;
import com.datadog.api.client.v2.model.ProductAnalyticsRetentionListColumnField;
import com.datadog.api.client.v2.model.ProductAnalyticsRetentionListQuery;
import com.datadog.api.client.v2.model.ProductAnalyticsRetentionListRequest;
import com.datadog.api.client.v2.model.ProductAnalyticsRetentionListRequestAttributes;
import com.datadog.api.client.v2.model.ProductAnalyticsRetentionListRequestData;
import com.datadog.api.client.v2.model.ProductAnalyticsRetentionListRequestType;
import com.datadog.api.client.v2.model.ProductAnalyticsRetentionListResponse;
import com.datadog.api.client.v2.model.ProductAnalyticsRetentionReturnCondition;
import com.datadog.api.client.v2.model.ProductAnalyticsRetentionReturnCriteria;
import com.datadog.api.client.v2.model.ProductAnalyticsRetentionSearch;
import com.datadog.api.client.v2.model.ProductAnalyticsRetentionTimeInterval;
import java.util.Collections;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.queryProductAnalyticsRetentionList", true);
    ProductAnalyticsApi apiInstance = new ProductAnalyticsApi(defaultClient);

    ProductAnalyticsRetentionListRequest body =
        new ProductAnalyticsRetentionListRequest()
            .data(
                new ProductAnalyticsRetentionListRequestData()
                    .attributes(
                        new ProductAnalyticsRetentionListRequestAttributes()
                            .from(1756425600000L)
                            .query(
                                new ProductAnalyticsRetentionListQuery()
                                    .columns(
                                        Collections.singletonList(
                                            new ProductAnalyticsRetentionListColumn()
                                                .field(
                                                    new ProductAnalyticsRetentionListColumnField()
                                                        .path("@usr.email"))))
                                    .computationScope(
                                        new ProductAnalyticsRetentionCellScope()
                                            .cohortTarget(
                                                new ProductAnalyticsRetentionCohortTarget(
                                                    new ProductAnalyticsRetentionIndexTarget()
                                                        .type(
                                                            ProductAnalyticsRetentionIndexTargetType
                                                                .INDEX)
                                                        .value(0L)))
                                            .returnPeriodTarget(
                                                new ProductAnalyticsRetentionIndexTarget()
                                                    .type(
                                                        ProductAnalyticsRetentionIndexTargetType
                                                            .INDEX)
                                                    .value(0L))
                                            .type(ProductAnalyticsRetentionCellScopeType.CELL))
                                    .limit(100L)
                                    .search(
                                        new ProductAnalyticsRetentionSearch()
                                            .cohortCriteria(
                                                new ProductAnalyticsRetentionCohortCriteria()
                                                    .baseQuery(
                                                        new ProductAnalyticsBaseQuery(
                                                            new ProductAnalyticsEventQuery()
                                                                .dataSource(
                                                                    ProductAnalyticsEventQueryDataSource
                                                                        .PRODUCT_ANALYTICS)
                                                                .search(
                                                                    new ProductAnalyticsEventSearch()
                                                                        .query("@type:view"))))
                                                    .timeInterval(
                                                        new ProductAnalyticsRetentionTimeInterval(
                                                            new ProductAnalyticsRetentionCalendarTimeInterval()
                                                                .type(
                                                                    ProductAnalyticsRetentionCalendarTimeIntervalType
                                                                        .CALENDAR)
                                                                .value(
                                                                    new ProductAnalyticsCalendarInterval()
                                                                        .alignment("monday")
                                                                        .quantity(1L)
                                                                        .timezone("UTC")
                                                                        .type(
                                                                            ProductAnalyticsCalendarIntervalType
                                                                                .WEEK)))))
                                            .filters(
                                                new ProductAnalyticsRetentionFilters()
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
                                                                        .query("*")))))
                                            .retentionEntity(
                                                ProductAnalyticsRetentionEntity.USER_ID)
                                            .returnCondition(
                                                ProductAnalyticsRetentionReturnCondition
                                                    .CONVERSION_ON_OR_AFTER)
                                            .returnCriteria(
                                                new ProductAnalyticsRetentionReturnCriteria()
                                                    .baseQuery(
                                                        new ProductAnalyticsBaseQuery(
                                                            new ProductAnalyticsEventQuery()
                                                                .dataSource(
                                                                    ProductAnalyticsEventQueryDataSource
                                                                        .PRODUCT_ANALYTICS)
                                                                .search(
                                                                    new ProductAnalyticsEventSearch()
                                                                        .query("@type:view"))))
                                                    .timeInterval(
                                                        new ProductAnalyticsRetentionTimeInterval(
                                                            new ProductAnalyticsRetentionCalendarTimeInterval()
                                                                .type(
                                                                    ProductAnalyticsRetentionCalendarTimeIntervalType
                                                                        .CALENDAR)
                                                                .value(
                                                                    new ProductAnalyticsCalendarInterval()
                                                                        .alignment("monday")
                                                                        .quantity(1L)
                                                                        .timezone("UTC")
                                                                        .type(
                                                                            ProductAnalyticsCalendarIntervalType
                                                                                .WEEK)))))))
                            .to(1756857600000L))
                    .type(ProductAnalyticsRetentionListRequestType.RETENTION_LIST_REQUEST));

    try {
      ProductAnalyticsRetentionListResponse result =
          apiInstance.queryProductAnalyticsRetentionList(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling ProductAnalyticsApi#queryProductAnalyticsRetentionList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
