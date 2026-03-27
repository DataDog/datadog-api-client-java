// Update replay heatmap snapshot returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumReplayHeatmapsApi;
import com.datadog.api.client.v2.model.Snapshot;
import com.datadog.api.client.v2.model.SnapshotUpdateRequest;
import com.datadog.api.client.v2.model.SnapshotUpdateRequestData;
import com.datadog.api.client.v2.model.SnapshotUpdateRequestDataAttributes;
import com.datadog.api.client.v2.model.SnapshotUpdateRequestDataType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    RumReplayHeatmapsApi apiInstance = new RumReplayHeatmapsApi(defaultClient);

    SnapshotUpdateRequest body =
        new SnapshotUpdateRequest()
            .data(
                new SnapshotUpdateRequestData()
                    .attributes(
                        new SnapshotUpdateRequestDataAttributes()
                            .eventId("11111111-2222-3333-4444-555555555555")
                            .isDeviceTypeSelectedByUser(false)
                            .start(0L))
                    .id("00000000-0000-0000-0000-000000000001")
                    .type(SnapshotUpdateRequestDataType.SNAPSHOTS));

    try {
      Snapshot result =
          apiInstance.updateReplayHeatmapSnapshot("00000000-0000-0000-0000-000000000001", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RumReplayHeatmapsApi#updateReplayHeatmapSnapshot");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
