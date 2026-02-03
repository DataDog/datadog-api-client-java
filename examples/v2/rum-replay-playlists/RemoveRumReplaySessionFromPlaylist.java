// Remove rum replay session from playlist returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumReplayPlaylistsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    RumReplayPlaylistsApi apiInstance = new RumReplayPlaylistsApi(defaultClient);

    try {
      apiInstance.removeRumReplaySessionFromPlaylist(
          1234567, "00000000-0000-0000-0000-000000000001");
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling RumReplayPlaylistsApi#removeRumReplaySessionFromPlaylist");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
