// Update a Synthetics downtime returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SyntheticsApi;
import com.datadog.api.client.v2.model.SyntheticsDowntimeDataAttributesRequest;
import com.datadog.api.client.v2.model.SyntheticsDowntimeDataRequest;
import com.datadog.api.client.v2.model.SyntheticsDowntimeRequest;
import com.datadog.api.client.v2.model.SyntheticsDowntimeResourceType;
import com.datadog.api.client.v2.model.SyntheticsDowntimeResponse;
import com.datadog.api.client.v2.model.SyntheticsDowntimeTimeSlotDate;
import com.datadog.api.client.v2.model.SyntheticsDowntimeTimeSlotRequest;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SyntheticsApi apiInstance = new SyntheticsApi(defaultClient);

    SyntheticsDowntimeRequest body =
        new SyntheticsDowntimeRequest()
            .data(
                new SyntheticsDowntimeDataRequest()
                    .attributes(
                        new SyntheticsDowntimeDataAttributesRequest()
                            .isEnabled(true)
                            .name("Weekly maintenance")
                            .testIds(Collections.singletonList("abc-def-123"))
                            .timeSlots(
                                Collections.singletonList(
                                    new SyntheticsDowntimeTimeSlotRequest()
                                        .duration(3600L)
                                        .start(
                                            new SyntheticsDowntimeTimeSlotDate()
                                                .day(15L)
                                                .hour(10L)
                                                .minute(30L)
                                                .month(1L)
                                                .year(2024L))
                                        .timezone("Europe/Paris"))))
                    .type(SyntheticsDowntimeResourceType.DOWNTIME));

    try {
      SyntheticsDowntimeResponse result =
          apiInstance.updateSyntheticsDowntime("00000000-0000-0000-0000-000000000001", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SyntheticsApi#updateSyntheticsDowntime");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
