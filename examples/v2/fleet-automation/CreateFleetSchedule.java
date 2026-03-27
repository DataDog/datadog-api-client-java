// Create a schedule returns "CREATED" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.FleetAutomationApi;
import com.datadog.api.client.v2.model.FleetScheduleResponse;
import com.datadog.api.client.v2.model.FleetScheduleCreate;
import com.datadog.api.client.v2.model.FleetScheduleCreateAttributes;
import com.datadog.api.client.v2.model.FleetScheduleCreateRequest;
import com.datadog.api.client.v2.model.FleetScheduleRecurrenceRule;
import com.datadog.api.client.v2.model.FleetScheduleResourceType;
import com.datadog.api.client.v2.model.FleetScheduleStatus;
import java.io.File;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createFleetSchedule", true);
    FleetAutomationApi apiInstance = new FleetAutomationApi(defaultClient);

    FleetScheduleCreateRequest body = new FleetScheduleCreateRequest()
.data(new FleetScheduleCreate()
.attributes(new FleetScheduleCreateAttributes()
.name("Weekly Production Agent Updates")
.query("env:prod AND service:web")
.rule(new FleetScheduleRecurrenceRule()
.daysOfWeek(Arrays.asList("Mon", "Wed", "Fri"))
.maintenanceWindowDuration(1200L)
.startMaintenanceWindow("02:00")
.timezone("America/New_York"))
.status(FleetScheduleStatus.ACTIVE)
.versionToLatest(0L))
.type(FleetScheduleResourceType.SCHEDULE));

    try {
      FleetScheduleResponse result = apiInstance.createFleetSchedule(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FleetAutomationApi#createFleetSchedule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}