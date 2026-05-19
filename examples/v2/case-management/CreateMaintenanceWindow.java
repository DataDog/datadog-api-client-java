// Create a maintenance window returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CaseManagementApi;
import com.datadog.api.client.v2.model.MaintenanceWindowCreate;
import com.datadog.api.client.v2.model.MaintenanceWindowCreateAttributes;
import com.datadog.api.client.v2.model.MaintenanceWindowCreateRequest;
import com.datadog.api.client.v2.model.MaintenanceWindowResourceType;
import com.datadog.api.client.v2.model.MaintenanceWindowResponse;
import java.time.OffsetDateTime;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createMaintenanceWindow", true);
    CaseManagementApi apiInstance = new CaseManagementApi(defaultClient);

    MaintenanceWindowCreateRequest body =
        new MaintenanceWindowCreateRequest()
            .data(
                new MaintenanceWindowCreate()
                    .attributes(
                        new MaintenanceWindowCreateAttributes()
                            .endAt(OffsetDateTime.parse("2026-06-01T06:00:00Z"))
                            .name("Weekly maintenance")
                            .query("project:SEC")
                            .startAt(OffsetDateTime.parse("2026-06-01T00:00:00Z")))
                    .type(MaintenanceWindowResourceType.MAINTENANCE_WINDOW));

    try {
      MaintenanceWindowResponse result = apiInstance.createMaintenanceWindow(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseManagementApi#createMaintenanceWindow");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
