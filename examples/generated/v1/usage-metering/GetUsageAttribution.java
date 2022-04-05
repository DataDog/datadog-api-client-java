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
        UsageAttributionSupportedMetrics fields = UsageAttributionSupportedMetrics.fromValue("custom_timeseries_usage"); // UsageAttributionSupportedMetrics | Comma-separated list of usage types to return, or `*` for all usage types.
        OffsetDateTime endMonth = OffsetDateTime.now(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to month: `[YYYY-MM]` for usage ending this month.
        UsageSortDirection sortDirection = UsageSortDirection.fromValue("desc"); // UsageSortDirection | The direction to sort by: `[desc, asc]`.
        UsageAttributionSort sortName = UsageAttributionSort.fromValue("api_percentage"); // UsageAttributionSort | The field to sort by.
        Boolean includeDescendants = false; // Boolean | Include child org usage in the response. Defaults to false.
        Long offset = 0L; // Long | Number of records to skip before beginning to return.
        Long limit = 5000L; // Long | Maximum number of records to be returned.
        try {
            UsageAttributionResponse result = apiInstance.getUsageAttribution(startMonth, fields, new UsageMeteringApi.GetUsageAttributionOptionalParameters()
                .endMonth(endMonth)
                .sortDirection(sortDirection)
                .sortName(sortName)
                .includeDescendants(includeDescendants)
                .offset(offset)
                .limit(limit));
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsageMeteringApi#getUsageAttribution");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
