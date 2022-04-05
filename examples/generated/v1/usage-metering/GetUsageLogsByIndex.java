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
        OffsetDateTime startHr = OffsetDateTime.now(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour.
        OffsetDateTime endHr = OffsetDateTime.now(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending **before** this hour.
        List<String> indexName = Arrays.asList(); // List<String> | Comma-separated list of log index names.
        try {
            UsageLogsByIndexResponse result = apiInstance.getUsageLogsByIndex(startHr, new UsageMeteringApi.GetUsageLogsByIndexOptionalParameters()
                .endHr(endHr)
                .indexName(indexName));
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsageMeteringApi#getUsageLogsByIndex");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
