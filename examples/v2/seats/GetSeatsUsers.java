// Get users with seats returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.SeatsApi;
import com.datadog.api.client.v2.api.SeatsApi.GetSeatsUsersOptionalParameters;
import com.datadog.api.client.v2.model.SeatUserDataArray;
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

    try {
      SeatUserDataArray result = apiInstance.getSeatsUsers("incident_response",new GetSeatsUsersOptionalParameters().pageLimit(100));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SeatsApi#getSeatsUsers");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}