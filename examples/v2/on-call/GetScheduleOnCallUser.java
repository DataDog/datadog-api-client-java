// Get the schedule on-call user returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.OnCallApi;
import com.datadog.api.client.v2.model.Shift;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    OnCallApi apiInstance = new OnCallApi(defaultClient);

    // there is a valid "schedule" in the system
    String SCHEDULE_DATA_ID = System.getenv("SCHEDULE_DATA_ID");

    try {
      Shift result = apiInstance.getScheduleOnCallUser(SCHEDULE_DATA_ID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OnCallApi#getScheduleOnCallUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
