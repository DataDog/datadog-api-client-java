// Update maintenance returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.StatusPagesApi;
import com.datadog.api.client.v2.model.Maintenance;
import com.datadog.api.client.v2.model.PatchMaintenanceRequest;
import com.datadog.api.client.v2.model.PatchMaintenanceRequestData;
import com.datadog.api.client.v2.model.PatchMaintenanceRequestDataAttributes;
import com.datadog.api.client.v2.model.PatchMaintenanceRequestDataType;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    StatusPagesApi apiInstance = new StatusPagesApi(defaultClient);

    // there is a valid "status_page" in the system
    UUID STATUS_PAGE_DATA_ID = null;
    try {
      STATUS_PAGE_DATA_ID = UUID.fromString(System.getenv("STATUS_PAGE_DATA_ID"));
    } catch (IllegalArgumentException e) {
      System.err.println("Error parsing UUID: " + e.getMessage());
    }

    // there is a valid "maintenance" in the system
    UUID MAINTENANCE_DATA_ID = null;
    try {
      MAINTENANCE_DATA_ID = UUID.fromString(System.getenv("MAINTENANCE_DATA_ID"));
    } catch (IllegalArgumentException e) {
      System.err.println("Error parsing UUID: " + e.getMessage());
    }

    PatchMaintenanceRequest body =
        new PatchMaintenanceRequest()
            .data(
                new PatchMaintenanceRequestData()
                    .attributes(
                        new PatchMaintenanceRequestDataAttributes()
                            .scheduledDescription(
                                "We will be performing maintenance on the API to improve"
                                    + " performance for 40 minutes.")
                            .inProgressDescription(
                                "We are currently performing maintenance on the API to improve"
                                    + " performance for 40 minutes."))
                    .id(MAINTENANCE_DATA_ID)
                    .type(PatchMaintenanceRequestDataType.MAINTENANCES));

    try {
      Maintenance result =
          apiInstance.updateMaintenance(STATUS_PAGE_DATA_ID, MAINTENANCE_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StatusPagesApi#updateMaintenance");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
