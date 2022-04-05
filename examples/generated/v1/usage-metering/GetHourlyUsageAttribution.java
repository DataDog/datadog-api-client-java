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
    OffsetDateTime startHr =
        OffsetDateTime
            .now(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour:
                    // `[YYYY-MM-DDThh]` for usage beginning at this hour.
    HourlyUsageAttributionUsageType usageType =
        HourlyUsageAttributionUsageType.fromValue(
            "api_usage"); // HourlyUsageAttributionUsageType | Usage type to retrieve.
    OffsetDateTime endHr =
        OffsetDateTime
            .now(); // OffsetDateTime | Datetime in ISO-8601 format, UTC, precise to hour:
                    // `[YYYY-MM-DDThh]` for usage ending **before** this hour.
    String nextRecordId =
        "nextRecordId_example"; // String | List following results with a next_record_id provided in
                                // the previous query.
    String tagBreakdownKeys =
        "tagBreakdownKeys_example"; // String | Comma separated list of tags used to group usage. If
                                    // no value is provided the usage will not be broken down by
                                    // tags.  To see which tags are available, look for the value of
                                    // `tag_config_source` in the API response.
    try {
      HourlyUsageAttributionResponse result =
          apiInstance.getHourlyUsageAttribution(
              startHr,
              usageType,
              new UsageMeteringApi.GetHourlyUsageAttributionOptionalParameters()
                  .endHr(endHr)
                  .nextRecordId(nextRecordId)
                  .tagBreakdownKeys(tagBreakdownKeys));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsageMeteringApi#getHourlyUsageAttribution");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
