// Bulk remove rum replay playlist sessions returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumReplayPlaylistsApi;
import com.datadog.api.client.v2.model.SessionIdArray;
import com.datadog.api.client.v2.model.SessionIdData;
import com.datadog.api.client.v2.model.ViewershipHistorySessionDataType;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    RumReplayPlaylistsApi apiInstance = new RumReplayPlaylistsApi(defaultClient);

    SessionIdArray body =
        new SessionIdArray()
            .data(
                Collections.singletonList(
                    new SessionIdData()
                        .id("00000000-0000-0000-0000-000000000001")
                        .type(ViewershipHistorySessionDataType.RUM_REPLAY_SESSION)));

    try {
      apiInstance.bulkRemoveRumReplayPlaylistSessions(1234567, body);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling RumReplayPlaylistsApi#bulkRemoveRumReplayPlaylistSessions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
