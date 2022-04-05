import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.UsageMeteringApi;
import com.datadog.api.v1.client.model.*;
import java.time.OffsetDateTime;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();

    UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);
    OffsetDateTime startMonth =
        OffsetDateTime
            .now(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to month:
                    // `[YYYY-MM]` for usage beginning in this month. Maximum of 15 months ago.
    OffsetDateTime endMonth =
        OffsetDateTime
            .now(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to month:
                    // `[YYYY-MM]` for usage ending this month.
    Boolean includeOrgDetails = true; // Boolean | Include usage summaries for each sub-org.
    try {
      UsageSummaryResponse result =
          apiInstance.getUsageSummary(
              startMonth,
              new UsageMeteringApi.GetUsageSummaryOptionalParameters()
                  .endMonth(endMonth)
                  .includeOrgDetails(includeOrgDetails));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsageMeteringApi#getUsageSummary");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
