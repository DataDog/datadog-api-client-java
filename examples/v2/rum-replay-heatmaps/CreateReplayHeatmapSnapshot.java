// Create replay heatmap snapshot returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumReplayHeatmapsApi;
import com.datadog.api.client.v2.model.Snapshot;
import com.datadog.api.client.v2.model.SnapshotCreateRequest;
import com.datadog.api.client.v2.model.SnapshotCreateRequestData;
import com.datadog.api.client.v2.model.SnapshotCreateRequestDataAttributes;
import com.datadog.api.client.v2.model.SnapshotUpdateRequestDataType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    RumReplayHeatmapsApi apiInstance = new RumReplayHeatmapsApi(defaultClient);

    SnapshotCreateRequest body =
        new SnapshotCreateRequest()
            .data(
                new SnapshotCreateRequestData()
                    .attributes(
                        new SnapshotCreateRequestDataAttributes()
                            .applicationId("aaaaaaaa-1111-2222-3333-bbbbbbbbbbbb")
                            .deviceType("desktop")
                            .eventId("11111111-2222-3333-4444-555555555555")
                            .isDeviceTypeSelectedByUser(false)
                            .snapshotName("My Snapshot")
                            .start(0L)
                            .viewName("/home"))
                    .type(SnapshotUpdateRequestDataType.SNAPSHOTS));

    try {
      Snapshot result = apiInstance.createReplayHeatmapSnapshot(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RumReplayHeatmapsApi#createReplayHeatmapSnapshot");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
