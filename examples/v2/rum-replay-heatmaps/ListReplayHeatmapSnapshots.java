// List replay heatmap snapshots returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumReplayHeatmapsApi;
import com.datadog.api.client.v2.model.SnapshotArray;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    RumReplayHeatmapsApi apiInstance = new RumReplayHeatmapsApi(defaultClient);

    try {
      SnapshotArray result = apiInstance.listReplayHeatmapSnapshots("/home");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RumReplayHeatmapsApi#listReplayHeatmapSnapshots");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
