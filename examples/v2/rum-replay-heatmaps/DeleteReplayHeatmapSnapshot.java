// Delete replay heatmap snapshot returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumReplayHeatmapsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    RumReplayHeatmapsApi apiInstance = new RumReplayHeatmapsApi(defaultClient);

    try {
      apiInstance.deleteReplayHeatmapSnapshot("00000000-0000-0000-0000-000000000001");
    } catch (ApiException e) {
      System.err.println("Exception when calling RumReplayHeatmapsApi#deleteReplayHeatmapSnapshot");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
