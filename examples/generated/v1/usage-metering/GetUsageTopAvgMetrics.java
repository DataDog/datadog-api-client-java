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
        OffsetDateTime month = OffsetDateTime.now(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to month: [YYYY-MM] for usage beginning at this hour. (Either month or day should be specified, but not both)
        OffsetDateTime day = OffsetDateTime.now(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to day: [YYYY-MM-DD] for usage beginning at this hour. (Either month or day should be specified, but not both)
        List<String> names = Arrays.asList(); // List<String> | Comma-separated list of metric names.
        Integer limit = 500; // Integer | Maximum number of results to return (between 1 and 5000) - defaults to 500 results if limit not specified.
        String nextRecordId = "nextRecordId_example"; // String | List following results with a next_record_id provided in the previous query.
        try {
            UsageTopAvgMetricsResponse result = apiInstance.getUsageTopAvgMetrics(new UsageMeteringApi.GetUsageTopAvgMetricsOptionalParameters()
                .month(month)
                .day(day)
                .names(names)
                .limit(limit)
                .nextRecordId(nextRecordId));
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsageMeteringApi#getUsageTopAvgMetrics");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
