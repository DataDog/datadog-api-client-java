// Delete an override returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.OnCallApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    OnCallApi apiInstance = new OnCallApi(defaultClient);

    // there is a valid "schedule" in the system
    String SCHEDULE_DATA_ID = System.getenv("SCHEDULE_DATA_ID");

    // there is a valid "override" in the system
    String OVERRIDE_DATA_0_ID = System.getenv("OVERRIDE_DATA_0_ID");

    try {
      apiInstance.deleteOnCallScheduleOverride(SCHEDULE_DATA_ID, OVERRIDE_DATA_0_ID);
    } catch (ApiException e) {
      System.err.println("Exception when calling OnCallApi#deleteOnCallScheduleOverride");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
