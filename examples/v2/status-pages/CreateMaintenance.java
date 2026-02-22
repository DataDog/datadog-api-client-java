// Create maintenance returns "Created" response
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.StatusPagesApi;
import com.datadog.api.client.v2.model.CreateMaintenanceRequest;
import com.datadog.api.client.v2.model.CreateMaintenanceRequestData;
import com.datadog.api.client.v2.model.CreateMaintenanceRequestDataAttributes;
import com.datadog.api.client.v2.model.CreateMaintenanceRequestDataAttributesComponentsAffectedItems;
import com.datadog.api.client.v2.model.Maintenance;
import com.datadog.api.client.v2.model.PatchMaintenanceRequestDataAttributesComponentsAffectedItemsStatus;
import com.datadog.api.client.v2.model.PatchMaintenanceRequestDataType;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    StatusPagesApi apiInstance = new StatusPagesApi(defaultClient);

    // there is a valid "status_page" in the system
    UUID STATUS_PAGE_DATA_ATTRIBUTES_COMPONENTS_0_COMPONENTS_0_ID = null;
    try {
      STATUS_PAGE_DATA_ATTRIBUTES_COMPONENTS_0_COMPONENTS_0_ID =
          UUID.fromString(
              System.getenv("STATUS_PAGE_DATA_ATTRIBUTES_COMPONENTS_0_COMPONENTS_0_ID"));
    } catch (IllegalArgumentException e) {
      System.err.println("Error parsing UUID: " + e.getMessage());
    }
    UUID STATUS_PAGE_DATA_ID = null;
    try {
      STATUS_PAGE_DATA_ID = UUID.fromString(System.getenv("STATUS_PAGE_DATA_ID"));
    } catch (IllegalArgumentException e) {
      System.err.println("Error parsing UUID: " + e.getMessage());
    }

    CreateMaintenanceRequest body =
        new CreateMaintenanceRequest()
            .data(
                new CreateMaintenanceRequestData()
                    .attributes(
                        new CreateMaintenanceRequestDataAttributes()
                            .title("API Maintenance")
                            .scheduledDescription(
                                "We will be performing maintenance on the API to improve"
                                    + " performance.")
                            .inProgressDescription(
                                "We are currently performing maintenance on the API to improve"
                                    + " performance.")
                            .completedDescription(
                                "We have completed maintenance on the API to improve performance.")
                            .startDate(OffsetDateTime.now().plusHours(1))
                            .completedDate(OffsetDateTime.now().plusHours(2))
                            .componentsAffected(
                                Collections.singletonList(
                                    new CreateMaintenanceRequestDataAttributesComponentsAffectedItems()
                                        .id(
                                            STATUS_PAGE_DATA_ATTRIBUTES_COMPONENTS_0_COMPONENTS_0_ID)
                                        .status(
                                            PatchMaintenanceRequestDataAttributesComponentsAffectedItemsStatus
                                                .OPERATIONAL))))
                    .type(PatchMaintenanceRequestDataType.MAINTENANCES));

    try {
      Maintenance result = apiInstance.createMaintenance(STATUS_PAGE_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StatusPagesApi#createMaintenance");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
