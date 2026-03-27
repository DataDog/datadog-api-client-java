// List rum replay session watchers returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumReplayViewershipApi;
import com.datadog.api.client.v2.model.WatcherArray;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    RumReplayViewershipApi apiInstance = new RumReplayViewershipApi(defaultClient);

    try {
      WatcherArray result =
          apiInstance.listRumReplaySessionWatchers("00000000-0000-0000-0000-000000000001");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling RumReplayViewershipApi#listRumReplaySessionWatchers");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
