// Unassign seats from users returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SeatsApi;
import com.datadog.api.client.v2.model.SeatAssignmentsDataType;
import com.datadog.api.client.v2.model.UnassignSeatsUserRequest;
import com.datadog.api.client.v2.model.UnassignSeatsUserRequestData;
import com.datadog.api.client.v2.model.UnassignSeatsUserRequestDataAttributes;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SeatsApi apiInstance = new SeatsApi(defaultClient);

    UnassignSeatsUserRequest body =
        new UnassignSeatsUserRequest()
            .data(
                new UnassignSeatsUserRequestData()
                    .attributes(
                        new UnassignSeatsUserRequestDataAttributes()
                            .productCode("")
                            .userUuids(Collections.singletonList("")))
                    .type(SeatAssignmentsDataType.SEAT_ASSIGNMENTS));

    try {
      apiInstance.unassignSeatsUserV2(body);
    } catch (ApiException e) {
      System.err.println("Exception when calling SeatsApi#unassignSeatsUserV2");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
