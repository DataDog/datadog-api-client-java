// Update a downtime returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.DowntimesApi;
import com.datadog.api.client.v2.model.DowntimeResourceType;
import com.datadog.api.client.v2.model.DowntimeResponse;
import com.datadog.api.client.v2.model.DowntimeUpdateRequest;
import com.datadog.api.client.v2.model.DowntimeUpdateRequestAttributes;
import com.datadog.api.client.v2.model.DowntimeUpdateRequestData;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    DowntimesApi apiInstance = new DowntimesApi(defaultClient);

    // there is a valid "downtime_v2" in the system
    String DOWNTIME_V2_DATA_ID = System.getenv("DOWNTIME_V2_DATA_ID");

    DowntimeUpdateRequest body =
        new DowntimeUpdateRequest()
            .data(
                new DowntimeUpdateRequestData()
                    .attributes(new DowntimeUpdateRequestAttributes().message("light speed"))
                    .id(DOWNTIME_V2_DATA_ID)
                    .type(DowntimeResourceType.DOWNTIME));

    try {
      DowntimeResponse result = apiInstance.updateDowntime(DOWNTIME_V2_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DowntimesApi#updateDowntime");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
