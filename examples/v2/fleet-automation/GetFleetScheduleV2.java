// Get a schedule by ID returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.FleetAutomationApi;
import com.datadog.api.client.v2.model.FleetScheduleV2Response;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    FleetAutomationApi apiInstance = new FleetAutomationApi(defaultClient);

    // there is a valid "fleet_schedule" in the system
    String SCHEDULE_ID = System.getenv("SCHEDULE_ID");

    try {
      FleetScheduleV2Response result = apiInstance.getFleetScheduleV2(SCHEDULE_ID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FleetAutomationApi#getFleetScheduleV2");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
