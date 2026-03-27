// Update degradation returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.StatusPagesApi;
import com.datadog.api.client.v2.model.Degradation;
import com.datadog.api.client.v2.model.PatchDegradationRequest;
import com.datadog.api.client.v2.model.PatchDegradationRequestData;
import com.datadog.api.client.v2.model.PatchDegradationRequestDataAttributes;
import com.datadog.api.client.v2.model.PatchDegradationRequestDataType;
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
    UUID STATUS_PAGE_DATA_ID = null;
    try {
      STATUS_PAGE_DATA_ID = UUID.fromString(System.getenv("STATUS_PAGE_DATA_ID"));
    } catch (IllegalArgumentException e) {
        System.err.println("Error parsing UUID: " + e.getMessage());
    }

    // there is a valid "degradation" in the system
    UUID DEGRADATION_DATA_ID = null;
    try {
      DEGRADATION_DATA_ID = UUID.fromString(System.getenv("DEGRADATION_DATA_ID"));
    } catch (IllegalArgumentException e) {
        System.err.println("Error parsing UUID: " + e.getMessage());
    }

    PatchDegradationRequest body = new PatchDegradationRequest()
.data(new PatchDegradationRequestData()
.attributes(new PatchDegradationRequestDataAttributes()
.title("Elevated API Latency in US1"))
.id(DEGRADATION_DATA_ID)
.type(PatchDegradationRequestDataType.DEGRADATIONS));

    try {
      Degradation result = apiInstance.updateDegradation(STATUS_PAGE_DATA_ID, DEGRADATION_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StatusPagesApi#updateDegradation");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}