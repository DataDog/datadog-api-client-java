import java.time.OffsetDateTime;
import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.UsageMeteringApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);
        OffsetDateTime startMonth = OffsetDateTime.now(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to month: `[YYYY-MM]` for usage beginning in this month. Maximum of 15 months ago.
        MonthlyUsageAttributionSupportedMetrics fields = MonthlyUsageAttributionSupportedMetrics.fromValue("api_usage"); // MonthlyUsageAttributionSupportedMetrics | Comma-separated list of usage types to return, or `*` for all usage types.
        OffsetDateTime endMonth = OffsetDateTime.now(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to month: `[YYYY-MM]` for usage ending this month.
        UsageSortDirection sortDirection = UsageSortDirection.fromValue("desc"); // UsageSortDirection | The direction to sort by: `[desc, asc]`.
        MonthlyUsageAttributionSupportedMetrics sortName = MonthlyUsageAttributionSupportedMetrics.fromValue("api_usage"); // MonthlyUsageAttributionSupportedMetrics | The field to sort by.
        String tagBreakdownKeys = "tagBreakdownKeys_example"; // String | Comma separated list of tag keys used to group usage. If no value is provided the usage will not be broken down by tags.  To see which tags are available, look for the value of `tag_config_source` in the API response.
        String nextRecordId = "nextRecordId_example"; // String | List following results with a next_record_id provided in the previous query.
        try {
            MonthlyUsageAttributionResponse result = apiInstance.getMonthlyUsageAttribution(startMonth, fields, new UsageMeteringApi.GetMonthlyUsageAttributionOptionalParameters()
                .endMonth(endMonth)
                .sortDirection(sortDirection)
                .sortName(sortName)
                .tagBreakdownKeys(tagBreakdownKeys)
                .nextRecordId(nextRecordId));
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsageMeteringApi#getMonthlyUsageAttribution");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
