// Assign seats to users returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SeatsApi;
import com.datadog.api.client.v2.model.AssignSeatsUserRequest;
import com.datadog.api.client.v2.model.AssignSeatsUserRequestData;
import com.datadog.api.client.v2.model.AssignSeatsUserRequestDataAttributes;
import com.datadog.api.client.v2.model.AssignSeatsUserResponse;
import com.datadog.api.client.v2.model.SeatAssignmentsDataType;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SeatsApi apiInstance = new SeatsApi(defaultClient);

    // there is a valid "user" in the system
    String USER_DATA_ID = System.getenv("USER_DATA_ID");

    AssignSeatsUserRequest body =
        new AssignSeatsUserRequest()
            .data(
                new AssignSeatsUserRequestData()
                    .type(SeatAssignmentsDataType.SEAT_ASSIGNMENTS)
                    .attributes(
                        new AssignSeatsUserRequestDataAttributes()
                            .productCode("incident_response")
                            .userUuids(Collections.singletonList(USER_DATA_ID))));

    try {
      AssignSeatsUserResponse result = apiInstance.assignSeatsUser(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SeatsApi#assignSeatsUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
