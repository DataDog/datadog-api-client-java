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
        OffsetDateTime month = OffsetDateTime.now(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to month: `[YYYY-MM]` for usage starting this month.
        try {
            UsageBillableSummaryResponse result = apiInstance.getUsageBillableSummary(new UsageMeteringApi.GetUsageBillableSummaryOptionalParameters()
                .month(month));
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsageMeteringApi#getUsageBillableSummary");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
