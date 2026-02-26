// Create rum replay session watch returns "Created" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.RumReplayViewershipApi;
import com.datadog.api.client.v2.model.Watch;
import com.datadog.api.client.v2.model.Watch;
import com.datadog.api.client.v2.model.WatchData;
import com.datadog.api.client.v2.model.WatchDataAttributes;
import com.datadog.api.client.v2.model.WatchDataType;
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
    RumReplayViewershipApi apiInstance = new RumReplayViewershipApi(defaultClient);

    Watch body = new Watch()
.data(new WatchData()
.attributes(new WatchDataAttributes()
.applicationId("aaaaaaaa-1111-2222-3333-bbbbbbbbbbbb")
.eventId("11111111-2222-3333-4444-555555555555")
.timestamp(OffsetDateTime.parse("2026-01-13T17:15:53.208340Z")))
.type(WatchDataType.RUM_REPLAY_WATCH));

    try {
      Watch result = apiInstance.createRumReplaySessionWatch("00000000-0000-0000-0000-000000000001", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RumReplayViewershipApi#createRumReplaySessionWatch");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}