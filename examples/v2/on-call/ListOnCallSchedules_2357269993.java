// List On-Call schedules returns "OK" response with pagination

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.PaginationIterable;
import com.datadog.api.client.v2.api.OnCallApi;
import com.datadog.api.client.v2.model.ScheduleListItem;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    OnCallApi apiInstance = new OnCallApi(defaultClient);

    try {
      PaginationIterable<ScheduleListItem> iterable =
          apiInstance.listOnCallSchedulesWithPagination();

      for (ScheduleListItem item : iterable) {
        System.out.println(item);
      }
    } catch (RuntimeException e) {
      System.err.println("Exception when calling OnCallApi#listOnCallSchedulesWithPagination");
      System.err.println("Reason: " + e.getMessage());
      e.printStackTrace();
    }
  }
}
