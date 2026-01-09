// Create degradation returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.StatusPagesApi;
import com.datadog.api.client.v2.model.CreateDegradationRequest;
import com.datadog.api.client.v2.model.CreateDegradationRequestData;
import com.datadog.api.client.v2.model.CreateDegradationRequestDataAttributes;
import com.datadog.api.client.v2.model.CreateDegradationRequestDataAttributesComponentsAffectedItems;
import com.datadog.api.client.v2.model.CreateDegradationRequestDataAttributesStatus;
import com.datadog.api.client.v2.model.Degradation;
import com.datadog.api.client.v2.model.PatchDegradationRequestDataType;
import com.datadog.api.client.v2.model.StatusPagesComponentDataAttributesStatus;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    StatusPagesApi apiInstance = new StatusPagesApi(defaultClient);

    // there is a valid "status_page" in the system
    String STATUS_PAGE_DATA_ATTRIBUTES_COMPONENTS_0_ID =
        System.getenv("STATUS_PAGE_DATA_ATTRIBUTES_COMPONENTS_0_ID");
    String STATUS_PAGE_DATA_ID = System.getenv("STATUS_PAGE_DATA_ID");

    CreateDegradationRequest body =
        new CreateDegradationRequest()
            .data(
                new CreateDegradationRequestData()
                    .attributes(
                        new CreateDegradationRequestDataAttributes()
                            .componentsAffected(
                                Collections.singletonList(
                                    new CreateDegradationRequestDataAttributesComponentsAffectedItems()
                                        .id(STATUS_PAGE_DATA_ATTRIBUTES_COMPONENTS_0_ID)
                                        .status(
                                            StatusPagesComponentDataAttributesStatus.MAJOR_OUTAGE)))
                            .description("5e2fd69be33e79aa")
                            .status(CreateDegradationRequestDataAttributesStatus.INVESTIGATING)
                            .title("5e2fd69be33e79aa"))
                    .type(PatchDegradationRequestDataType.DEGRADATIONS));

    try {
      Degradation result = apiInstance.createDegradation(STATUS_PAGE_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StatusPagesApi#createDegradation");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
