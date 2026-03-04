// Schedule maintenance returns "Created" response

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

    CreateMaintenanceRequest body =
        new CreateMaintenanceRequest()
            .data(
                new CreateMaintenanceRequestData()
                    .attributes(
                        new CreateMaintenanceRequestDataAttributes()
                            .completedDate(OffsetDateTime.parse("2026-02-18T19:51:13.332360075Z"))
                            .completedDescription(
                                "We have completed maintenance on the API to improve performance.")
                            .componentsAffected(
                                Collections.singletonList(
                                    new CreateMaintenanceRequestDataAttributesComponentsAffectedItems()
                                        .id(UUID.fromString("1234abcd-12ab-34cd-56ef-123456abcdef"))
                                        .status(
                                            PatchMaintenanceRequestDataAttributesComponentsAffectedItemsStatus
                                                .OPERATIONAL)))
                            .inProgressDescription(
                                "We are currently performing maintenance on the API to improve"
                                    + " performance.")
                            .scheduledDescription(
                                "We will be performing maintenance on the API to improve"
                                    + " performance.")
                            .startDate(OffsetDateTime.parse("2026-02-18T19:21:13.332360075Z"))
                            .title("API Maintenance"))
                    .type(PatchMaintenanceRequestDataType.MAINTENANCES));

    try {
      Maintenance result =
          apiInstance.createMaintenance(
              UUID.fromString("9b1deb4d-3b7d-4bad-9bdd-2b0d7b3dcb6d"), body);
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
