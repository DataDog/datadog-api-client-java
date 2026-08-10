// Edit maintenance update returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.StatusPagesApi;
import com.datadog.api.client.v2.model.MaintenanceUpdate;
import com.datadog.api.client.v2.model.PatchMaintenanceUpdateRequest;
import com.datadog.api.client.v2.model.PatchMaintenanceUpdateRequestData;
import com.datadog.api.client.v2.model.PatchMaintenanceUpdateRequestDataAttributes;
import com.datadog.api.client.v2.model.PatchMaintenanceUpdateRequestDataType;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    StatusPagesApi apiInstance = new StatusPagesApi(defaultClient);

    PatchMaintenanceUpdateRequest body =
        new PatchMaintenanceUpdateRequest()
            .data(
                new PatchMaintenanceUpdateRequestData()
                    .attributes(
                        new PatchMaintenanceUpdateRequestDataAttributes()
                            .description(
                                "We have completed maintenance on the API to improve performance."))
                    .id("00000000-0000-0000-0000-000000000000")
                    .type(PatchMaintenanceUpdateRequestDataType.MAINTENANCE_UPDATES));

    try {
      MaintenanceUpdate result =
          apiInstance.patchMaintenanceUpdate(
              UUID.fromString("9b1deb4d-3b7d-4bad-9bdd-2b0d7b3dcb6d"),
              UUID.fromString("9b1deb4d-3b7d-4bad-9bdd-2b0d7b3dcb6d"),
              UUID.fromString("9b1deb4d-3b7d-4bad-9bdd-2b0d7b3dcb6d"),
              body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StatusPagesApi#patchMaintenanceUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
