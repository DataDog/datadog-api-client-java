// Update a maintenance window returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CaseManagementApi;
import com.datadog.api.client.v2.model.MaintenanceWindowResourceType;
import com.datadog.api.client.v2.model.MaintenanceWindowResponse;
import com.datadog.api.client.v2.model.MaintenanceWindowUpdate;
import com.datadog.api.client.v2.model.MaintenanceWindowUpdateAttributes;
import com.datadog.api.client.v2.model.MaintenanceWindowUpdateRequest;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    CaseManagementApi apiInstance = new CaseManagementApi(defaultClient);

    MaintenanceWindowUpdateRequest body =
        new MaintenanceWindowUpdateRequest()
            .data(
                new MaintenanceWindowUpdate()
                    .attributes(new MaintenanceWindowUpdateAttributes())
                    .type(MaintenanceWindowResourceType.MAINTENANCE_WINDOW));

    try {
      MaintenanceWindowResponse result =
          apiInstance.updateMaintenanceWindow("a1b2c3d4-e5f6-7890-abcd-ef1234567890", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseManagementApi#updateMaintenanceWindow");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
