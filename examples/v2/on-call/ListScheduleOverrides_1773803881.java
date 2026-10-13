// List On-Call schedule overrides returns "OK" response with pagination

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.PaginationIterable;
import com.datadog.api.client.v2.api.OnCallApi;
import com.datadog.api.client.v2.model.OverrideData;
import java.time.OffsetDateTime;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    OnCallApi apiInstance = new OnCallApi(defaultClient);

    try {
      PaginationIterable<OverrideData> iterable =
          apiInstance.listScheduleOverridesWithPagination(
              "3653d3c6-0c75-11ea-ad28-fb5701eabc7d",
              OffsetDateTime.parse("2024-01-07T02:53:01Z"),
              OffsetDateTime.parse("2024-01-14T02:53:01Z"));

      for (OverrideData item : iterable) {
        System.out.println(item);
      }
    } catch (RuntimeException e) {
      System.err.println("Exception when calling OnCallApi#listScheduleOverridesWithPagination");
      System.err.println("Reason: " + e.getMessage());
      e.printStackTrace();
    }
  }
}
