// Unassign seats from users returns "No Content" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.SeatsApi;
import com.datadog.api.client.v2.model.SeatAssignmentsDataType;
import com.datadog.api.client.v2.model.UnassignSeatsUserRequest;
import com.datadog.api.client.v2.model.UnassignSeatsUserRequestData;
import com.datadog.api.client.v2.model.UnassignSeatsUserRequestDataAttributes;
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
    SeatsApi apiInstance = new SeatsApi(defaultClient);

    // there is a valid "user" in the system
    String USER_DATA_ID = System.getenv("USER_DATA_ID");

    UnassignSeatsUserRequest body = new UnassignSeatsUserRequest()
.data(new UnassignSeatsUserRequestData()
.type(SeatAssignmentsDataType.SEAT_ASSIGNMENTS)
.attributes(new UnassignSeatsUserRequestDataAttributes()
.productCode("incident_response")
.userUuids(Collections.singletonList(USER_DATA_ID))));

    try {
      apiInstance.unassignSeatsUser(body);
    } catch (ApiException e) {
      System.err.println("Exception when calling SeatsApi#unassignSeatsUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}