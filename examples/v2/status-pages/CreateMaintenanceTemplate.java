// Create maintenance template returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.StatusPagesApi;
import com.datadog.api.client.v2.model.CreateMaintenanceTemplateRequest;
import com.datadog.api.client.v2.model.CreateMaintenanceTemplateRequestData;
import com.datadog.api.client.v2.model.CreateMaintenanceTemplateRequestDataAttributes;
import com.datadog.api.client.v2.model.MaintenanceTemplate;
import com.datadog.api.client.v2.model.PatchMaintenanceTemplateRequestDataType;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    StatusPagesApi apiInstance = new StatusPagesApi(defaultClient);

    CreateMaintenanceTemplateRequest body =
        new CreateMaintenanceTemplateRequest()
            .data(
                new CreateMaintenanceTemplateRequestData()
                    .attributes(new CreateMaintenanceTemplateRequestDataAttributes().name(""))
                    .type(PatchMaintenanceTemplateRequestDataType.MAINTENANCE_TEMPLATES));

    try {
      MaintenanceTemplate result =
          apiInstance.createMaintenanceTemplate(
              UUID.fromString("9b1deb4d-3b7d-4bad-9bdd-2b0d7b3dcb6d"), body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StatusPagesApi#createMaintenanceTemplate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
