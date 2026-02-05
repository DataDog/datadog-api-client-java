// Assign seats to users for a product code returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SeatsApi;
import com.datadog.api.client.v2.model.AssignSeatsUserRequest;
import com.datadog.api.client.v2.model.AssignSeatsUserRequestData;
import com.datadog.api.client.v2.model.AssignSeatsUserRequestDataAttributes;
import com.datadog.api.client.v2.model.AssignSeatsUserResponse;
import com.datadog.api.client.v2.model.SeatAssignmentsDataType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SeatsApi apiInstance = new SeatsApi(defaultClient);

    AssignSeatsUserRequest body =
        new AssignSeatsUserRequest()
            .data(
                new AssignSeatsUserRequestData()
                    .attributes(new AssignSeatsUserRequestDataAttributes())
                    .type(SeatAssignmentsDataType.SEAT_ASSIGNMENTS));

    try {
      AssignSeatsUserResponse result = apiInstance.assignSeatsUserV2(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SeatsApi#assignSeatsUserV2");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
