// Create rum replay playlist returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumReplayPlaylistsApi;
import com.datadog.api.client.v2.model.Playlist;
import com.datadog.api.client.v2.model.PlaylistData;
import com.datadog.api.client.v2.model.PlaylistDataAttributes;
import com.datadog.api.client.v2.model.PlaylistDataAttributesCreatedBy;
import com.datadog.api.client.v2.model.PlaylistDataType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    RumReplayPlaylistsApi apiInstance = new RumReplayPlaylistsApi(defaultClient);

    Playlist body =
        new Playlist()
            .data(
                new PlaylistData()
                    .attributes(
                        new PlaylistDataAttributes()
                            .createdBy(
                                new PlaylistDataAttributesCreatedBy()
                                    .handle("john.doe@example.com")
                                    .id("00000000-0000-0000-0000-000000000001")
                                    .uuid("00000000-0000-0000-0000-000000000001"))
                            .name("My Playlist"))
                    .type(PlaylistDataType.RUM_REPLAY_PLAYLIST));

    try {
      Playlist result = apiInstance.createRumReplayPlaylist(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RumReplayPlaylistsApi#createRumReplayPlaylist");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
