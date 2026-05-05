// Create backfilled maintenance returns "Created" response
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.StatusPagesApi;
import com.datadog.api.client.v2.model.CreateBackfilledMaintenanceRequest;
import com.datadog.api.client.v2.model.CreateBackfilledMaintenanceRequestData;
import com.datadog.api.client.v2.model.CreateBackfilledMaintenanceRequestDataAttributes;
import com.datadog.api.client.v2.model.CreateBackfilledMaintenanceRequestDataAttributesUpdatesItems;
import com.datadog.api.client.v2.model.CreateBackfilledMaintenanceRequestDataAttributesUpdatesItemsStatus;
import com.datadog.api.client.v2.model.CreateMaintenanceRequestDataAttributesComponentsAffectedItems;
import com.datadog.api.client.v2.model.Maintenance;
import com.datadog.api.client.v2.model.PatchMaintenanceRequestDataAttributesComponentsAffectedItemsStatus;
import com.datadog.api.client.v2.model.PatchMaintenanceRequestDataType;
import java.time.OffsetDateTime;
import java.util.Arrays;
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

    CreateBackfilledMaintenanceRequest body =
        new CreateBackfilledMaintenanceRequest()
            .data(
                new CreateBackfilledMaintenanceRequestData()
                    .attributes(
                        new CreateBackfilledMaintenanceRequestDataAttributes()
                            .title("Past Database Maintenance")
                            .updates(
                                Arrays.asList(
                                    new CreateBackfilledMaintenanceRequestDataAttributesUpdatesItems()
                                        .componentsAffected(
                                            Collections.singletonList(
                                                new CreateMaintenanceRequestDataAttributesComponentsAffectedItems()
                                                    .id(
                                                        STATUS_PAGE_DATA_ATTRIBUTES_COMPONENTS_0_COMPONENTS_0_ID)
                                                    .status(
                                                        PatchMaintenanceRequestDataAttributesComponentsAffectedItemsStatus
                                                            .MAINTENANCE)))
                                        .description("Database maintenance is in progress.")
                                        .startedAt(OffsetDateTime.now().plusHours(-1))
                                        .status(
                                            CreateBackfilledMaintenanceRequestDataAttributesUpdatesItemsStatus
                                                .IN_PROGRESS),
                                    new CreateBackfilledMaintenanceRequestDataAttributesUpdatesItems()
                                        .componentsAffected(
                                            Collections.singletonList(
                                                new CreateMaintenanceRequestDataAttributesComponentsAffectedItems()
                                                    .id(
                                                        STATUS_PAGE_DATA_ATTRIBUTES_COMPONENTS_0_COMPONENTS_0_ID)
                                                    .status(
                                                        PatchMaintenanceRequestDataAttributesComponentsAffectedItemsStatus
                                                            .OPERATIONAL)))
                                        .description(
                                            "Database maintenance has been completed successfully.")
                                        .startedAt(OffsetDateTime.now())
                                        .status(
                                            CreateBackfilledMaintenanceRequestDataAttributesUpdatesItemsStatus
                                                .COMPLETED))))
                    .type(PatchMaintenanceRequestDataType.MAINTENANCES));

    try {
      Maintenance result = apiInstance.createBackfilledMaintenance(STATUS_PAGE_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StatusPagesApi#createBackfilledMaintenance");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
