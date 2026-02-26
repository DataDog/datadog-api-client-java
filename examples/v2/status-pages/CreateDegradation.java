// Create degradation returns "Created" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.StatusPagesApi;
import com.datadog.api.client.v2.model.Degradation;
import com.datadog.api.client.v2.model.CreateDegradationRequest;
import com.datadog.api.client.v2.model.CreateDegradationRequestData;
import com.datadog.api.client.v2.model.CreateDegradationRequestDataAttributes;
import com.datadog.api.client.v2.model.CreateDegradationRequestDataAttributesComponentsAffectedItems;
import com.datadog.api.client.v2.model.CreateDegradationRequestDataAttributesStatus;
import com.datadog.api.client.v2.model.PatchDegradationRequestDataType;
import com.datadog.api.client.v2.model.StatusPagesComponentDataAttributesStatus;
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
    StatusPagesApi apiInstance = new StatusPagesApi(defaultClient);

    // there is a valid "status_page" in the system
    UUID STATUS_PAGE_DATA_ATTRIBUTES_COMPONENTS_0_COMPONENTS_0_ID = null;
    try {
      STATUS_PAGE_DATA_ATTRIBUTES_COMPONENTS_0_COMPONENTS_0_ID = UUID.fromString(System.getenv("STATUS_PAGE_DATA_ATTRIBUTES_COMPONENTS_0_COMPONENTS_0_ID"));
    } catch (IllegalArgumentException e) {
        System.err.println("Error parsing UUID: " + e.getMessage());
    }
    UUID STATUS_PAGE_DATA_ID = null;
    try {
      STATUS_PAGE_DATA_ID = UUID.fromString(System.getenv("STATUS_PAGE_DATA_ID"));
    } catch (IllegalArgumentException e) {
        System.err.println("Error parsing UUID: " + e.getMessage());
    }

    CreateDegradationRequest body = new CreateDegradationRequest()
.data(new CreateDegradationRequestData()
.attributes(new CreateDegradationRequestDataAttributes()
.componentsAffected(Collections.singletonList(new CreateDegradationRequestDataAttributesComponentsAffectedItems()
.id(STATUS_PAGE_DATA_ATTRIBUTES_COMPONENTS_0_COMPONENTS_0_ID)
.status(StatusPagesComponentDataAttributesStatus.MAJOR_OUTAGE)))
.description("Our API is experiencing elevated latency. We are investigating the issue.")
.status(CreateDegradationRequestDataAttributesStatus.INVESTIGATING)
.title("Elevated API Latency"))
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