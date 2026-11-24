package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.Playlist;
import com.datadog.api.client.v2.model.PlaylistArray;
import com.datadog.api.client.v2.model.PlaylistsSession;
import com.datadog.api.client.v2.model.PlaylistsSessionArray;
import com.datadog.api.client.v2.model.SessionIdArray;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RumReplayPlaylistsApi {
  private ApiClient apiClient;

  public RumReplayPlaylistsApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public RumReplayPlaylistsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get the API client.
   *
   * @return API client
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * Set the API client.
   *
   * @param apiClient an instance of API client
   */
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /** Manage optional parameters to addRUMReplaySessionToPlaylist. */
  public static class AddRUMReplaySessionToPlaylistOptionalParameters {
    private String dataSource;

    /**
     * Set dataSource.
     *
     * @param dataSource Data source type. Valid values: 'rum' or 'product_analytics'. Defaults to
     *     'rum'. (optional)
     * @return AddRUMReplaySessionToPlaylistOptionalParameters
     */
    public AddRUMReplaySessionToPlaylistOptionalParameters dataSource(String dataSource) {
      this.dataSource = dataSource;
      return this;
    }
  }

  /**
   * Add RUM replay session to playlist.
   *
   * <p>See {@link #addRUMReplaySessionToPlaylistWithHttpInfo}.
   *
   * @param ts Server-side timestamp in milliseconds. (required)
   * @param playlistId Unique identifier of the playlist. (required)
   * @param sessionId Unique identifier of the session. (required)
   * @return PlaylistsSession
   * @throws ApiException if fails to make API call
   */
  public PlaylistsSession addRUMReplaySessionToPlaylist(Long ts, Long playlistId, String sessionId)
      throws ApiException {
    return addRUMReplaySessionToPlaylistWithHttpInfo(
            ts, playlistId, sessionId, new AddRUMReplaySessionToPlaylistOptionalParameters())
        .getData();
  }

  /**
   * Add RUM replay session to playlist.
   *
   * <p>See {@link #addRUMReplaySessionToPlaylistWithHttpInfoAsync}.
   *
   * @param ts Server-side timestamp in milliseconds. (required)
   * @param playlistId Unique identifier of the playlist. (required)
   * @param sessionId Unique identifier of the session. (required)
   * @return CompletableFuture&lt;PlaylistsSession&gt;
   */
  public CompletableFuture<PlaylistsSession> addRUMReplaySessionToPlaylistAsync(
      Long ts, Long playlistId, String sessionId) {
    return addRUMReplaySessionToPlaylistWithHttpInfoAsync(
            ts, playlistId, sessionId, new AddRUMReplaySessionToPlaylistOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Add RUM replay session to playlist.
   *
   * <p>See {@link #addRUMReplaySessionToPlaylistWithHttpInfo}.
   *
   * @param ts Server-side timestamp in milliseconds. (required)
   * @param playlistId Unique identifier of the playlist. (required)
   * @param sessionId Unique identifier of the session. (required)
   * @param parameters Optional parameters for the request.
   * @return PlaylistsSession
   * @throws ApiException if fails to make API call
   */
  public PlaylistsSession addRUMReplaySessionToPlaylist(
      Long ts,
      Long playlistId,
      String sessionId,
      AddRUMReplaySessionToPlaylistOptionalParameters parameters)
      throws ApiException {
    return addRUMReplaySessionToPlaylistWithHttpInfo(ts, playlistId, sessionId, parameters)
        .getData();
  }

  /**
   * Add RUM replay session to playlist.
   *
   * <p>See {@link #addRUMReplaySessionToPlaylistWithHttpInfoAsync}.
   *
   * @param ts Server-side timestamp in milliseconds. (required)
   * @param playlistId Unique identifier of the playlist. (required)
   * @param sessionId Unique identifier of the session. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;PlaylistsSession&gt;
   */
  public CompletableFuture<PlaylistsSession> addRUMReplaySessionToPlaylistAsync(
      Long ts,
      Long playlistId,
      String sessionId,
      AddRUMReplaySessionToPlaylistOptionalParameters parameters) {
    return addRUMReplaySessionToPlaylistWithHttpInfoAsync(ts, playlistId, sessionId, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Add a session to a playlist.
   *
   * @param ts Server-side timestamp in milliseconds. (required)
   * @param playlistId Unique identifier of the playlist. (required)
   * @param sessionId Unique identifier of the session. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;PlaylistsSession&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<PlaylistsSession> addRUMReplaySessionToPlaylistWithHttpInfo(
      Long ts,
      Long playlistId,
      String sessionId,
      AddRUMReplaySessionToPlaylistOptionalParameters parameters)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'ts' is set
    if (ts == null) {
      throw new ApiException(
          400, "Missing the required parameter 'ts' when calling addRUMReplaySessionToPlaylist");
    }

    // verify the required parameter 'playlistId' is set
    if (playlistId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'playlistId' when calling addRUMReplaySessionToPlaylist");
    }

    // verify the required parameter 'sessionId' is set
    if (sessionId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'sessionId' when calling addRUMReplaySessionToPlaylist");
    }
    String dataSource = parameters.dataSource;
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/replay/playlists/{playlist_id}/sessions/{session_id}"
            .replaceAll(
                "\\{" + "playlist_id" + "\\}", apiClient.escapeString(playlistId.toString()))
            .replaceAll("\\{" + "session_id" + "\\}", apiClient.escapeString(sessionId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ts", ts));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "data_source", dataSource));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumReplayPlaylistsApi.addRUMReplaySessionToPlaylist",
            localVarPath,
            localVarQueryParams,
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "PUT",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<PlaylistsSession>() {});
  }

  /**
   * Add RUM replay session to playlist.
   *
   * <p>See {@link #addRUMReplaySessionToPlaylistWithHttpInfo}.
   *
   * @param ts Server-side timestamp in milliseconds. (required)
   * @param playlistId Unique identifier of the playlist. (required)
   * @param sessionId Unique identifier of the session. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;PlaylistsSession&gt;&gt;
   */
  public CompletableFuture<ApiResponse<PlaylistsSession>>
      addRUMReplaySessionToPlaylistWithHttpInfoAsync(
          Long ts,
          Long playlistId,
          String sessionId,
          AddRUMReplaySessionToPlaylistOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'ts' is set
    if (ts == null) {
      CompletableFuture<ApiResponse<PlaylistsSession>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'ts' when calling addRUMReplaySessionToPlaylist"));
      return result;
    }

    // verify the required parameter 'playlistId' is set
    if (playlistId == null) {
      CompletableFuture<ApiResponse<PlaylistsSession>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'playlistId' when calling"
                  + " addRUMReplaySessionToPlaylist"));
      return result;
    }

    // verify the required parameter 'sessionId' is set
    if (sessionId == null) {
      CompletableFuture<ApiResponse<PlaylistsSession>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'sessionId' when calling"
                  + " addRUMReplaySessionToPlaylist"));
      return result;
    }
    String dataSource = parameters.dataSource;
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/replay/playlists/{playlist_id}/sessions/{session_id}"
            .replaceAll(
                "\\{" + "playlist_id" + "\\}", apiClient.escapeString(playlistId.toString()))
            .replaceAll("\\{" + "session_id" + "\\}", apiClient.escapeString(sessionId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ts", ts));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "data_source", dataSource));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumReplayPlaylistsApi.addRUMReplaySessionToPlaylist",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<PlaylistsSession>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "PUT",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<PlaylistsSession>() {});
  }

  /**
   * Bulk remove RUM replay playlist sessions.
   *
   * <p>See {@link #bulkRemoveRUMReplayPlaylistSessionsWithHttpInfo}.
   *
   * @param playlistId Unique identifier of the playlist. (required)
   * @param body (required)
   * @throws ApiException if fails to make API call
   */
  public void bulkRemoveRUMReplayPlaylistSessions(Long playlistId, SessionIdArray body)
      throws ApiException {
    bulkRemoveRUMReplayPlaylistSessionsWithHttpInfo(playlistId, body);
  }

  /**
   * Bulk remove RUM replay playlist sessions.
   *
   * <p>See {@link #bulkRemoveRUMReplayPlaylistSessionsWithHttpInfoAsync}.
   *
   * @param playlistId Unique identifier of the playlist. (required)
   * @param body (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> bulkRemoveRUMReplayPlaylistSessionsAsync(
      Long playlistId, SessionIdArray body) {
    return bulkRemoveRUMReplayPlaylistSessionsWithHttpInfoAsync(playlistId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Remove sessions from a playlist.
   *
   * @param playlistId Unique identifier of the playlist. (required)
   * @param body (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> bulkRemoveRUMReplayPlaylistSessionsWithHttpInfo(
      Long playlistId, SessionIdArray body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'playlistId' is set
    if (playlistId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'playlistId' when calling"
              + " bulkRemoveRUMReplayPlaylistSessions");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'body' when calling bulkRemoveRUMReplayPlaylistSessions");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/replay/playlists/{playlist_id}/sessions"
            .replaceAll(
                "\\{" + "playlist_id" + "\\}", apiClient.escapeString(playlistId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumReplayPlaylistsApi.bulkRemoveRUMReplayPlaylistSessions",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Bulk remove RUM replay playlist sessions.
   *
   * <p>See {@link #bulkRemoveRUMReplayPlaylistSessionsWithHttpInfo}.
   *
   * @param playlistId Unique identifier of the playlist. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> bulkRemoveRUMReplayPlaylistSessionsWithHttpInfoAsync(
      Long playlistId, SessionIdArray body) {
    Object localVarPostBody = body;

    // verify the required parameter 'playlistId' is set
    if (playlistId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'playlistId' when calling"
                  + " bulkRemoveRUMReplayPlaylistSessions"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " bulkRemoveRUMReplayPlaylistSessions"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/replay/playlists/{playlist_id}/sessions"
            .replaceAll(
                "\\{" + "playlist_id" + "\\}", apiClient.escapeString(playlistId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumReplayPlaylistsApi.bulkRemoveRUMReplayPlaylistSessions",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"*/*"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Create RUM replay playlist.
   *
   * <p>See {@link #createRUMReplayPlaylistWithHttpInfo}.
   *
   * @param body (required)
   * @return Playlist
   * @throws ApiException if fails to make API call
   */
  public Playlist createRUMReplayPlaylist(Playlist body) throws ApiException {
    return createRUMReplayPlaylistWithHttpInfo(body).getData();
  }

  /**
   * Create RUM replay playlist.
   *
   * <p>See {@link #createRUMReplayPlaylistWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;Playlist&gt;
   */
  public CompletableFuture<Playlist> createRUMReplayPlaylistAsync(Playlist body) {
    return createRUMReplayPlaylistWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a playlist.
   *
   * @param body (required)
   * @return ApiResponse&lt;Playlist&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Playlist> createRUMReplayPlaylistWithHttpInfo(Playlist body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createRUMReplayPlaylist");
    }
    // create path and map variables
    String localVarPath = "/api/v2/rum/replay/playlists";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumReplayPlaylistsApi.createRUMReplayPlaylist",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<Playlist>() {});
  }

  /**
   * Create RUM replay playlist.
   *
   * <p>See {@link #createRUMReplayPlaylistWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Playlist&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Playlist>> createRUMReplayPlaylistWithHttpInfoAsync(
      Playlist body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Playlist>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createRUMReplayPlaylist"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/rum/replay/playlists";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumReplayPlaylistsApi.createRUMReplayPlaylist",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Playlist>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<Playlist>() {});
  }

  /**
   * Delete RUM replay playlist.
   *
   * <p>See {@link #deleteRUMReplayPlaylistWithHttpInfo}.
   *
   * @param playlistId Unique identifier of the playlist. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteRUMReplayPlaylist(Long playlistId) throws ApiException {
    deleteRUMReplayPlaylistWithHttpInfo(playlistId);
  }

  /**
   * Delete RUM replay playlist.
   *
   * <p>See {@link #deleteRUMReplayPlaylistWithHttpInfoAsync}.
   *
   * @param playlistId Unique identifier of the playlist. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteRUMReplayPlaylistAsync(Long playlistId) {
    return deleteRUMReplayPlaylistWithHttpInfoAsync(playlistId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete a playlist.
   *
   * @param playlistId Unique identifier of the playlist. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteRUMReplayPlaylistWithHttpInfo(Long playlistId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'playlistId' is set
    if (playlistId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'playlistId' when calling deleteRUMReplayPlaylist");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/replay/playlists/{playlist_id}"
            .replaceAll(
                "\\{" + "playlist_id" + "\\}", apiClient.escapeString(playlistId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumReplayPlaylistsApi.deleteRUMReplayPlaylist",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Delete RUM replay playlist.
   *
   * <p>See {@link #deleteRUMReplayPlaylistWithHttpInfo}.
   *
   * @param playlistId Unique identifier of the playlist. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteRUMReplayPlaylistWithHttpInfoAsync(
      Long playlistId) {
    Object localVarPostBody = null;

    // verify the required parameter 'playlistId' is set
    if (playlistId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'playlistId' when calling deleteRUMReplayPlaylist"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/replay/playlists/{playlist_id}"
            .replaceAll(
                "\\{" + "playlist_id" + "\\}", apiClient.escapeString(playlistId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumReplayPlaylistsApi.deleteRUMReplayPlaylist",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"*/*"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Get RUM replay playlist.
   *
   * <p>See {@link #getRUMReplayPlaylistWithHttpInfo}.
   *
   * @param playlistId Unique identifier of the playlist. (required)
   * @return Playlist
   * @throws ApiException if fails to make API call
   */
  public Playlist getRUMReplayPlaylist(Long playlistId) throws ApiException {
    return getRUMReplayPlaylistWithHttpInfo(playlistId).getData();
  }

  /**
   * Get RUM replay playlist.
   *
   * <p>See {@link #getRUMReplayPlaylistWithHttpInfoAsync}.
   *
   * @param playlistId Unique identifier of the playlist. (required)
   * @return CompletableFuture&lt;Playlist&gt;
   */
  public CompletableFuture<Playlist> getRUMReplayPlaylistAsync(Long playlistId) {
    return getRUMReplayPlaylistWithHttpInfoAsync(playlistId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a playlist.
   *
   * @param playlistId Unique identifier of the playlist. (required)
   * @return ApiResponse&lt;Playlist&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Playlist> getRUMReplayPlaylistWithHttpInfo(Long playlistId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'playlistId' is set
    if (playlistId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'playlistId' when calling getRUMReplayPlaylist");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/replay/playlists/{playlist_id}"
            .replaceAll(
                "\\{" + "playlist_id" + "\\}", apiClient.escapeString(playlistId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumReplayPlaylistsApi.getRUMReplayPlaylist",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<Playlist>() {});
  }

  /**
   * Get RUM replay playlist.
   *
   * <p>See {@link #getRUMReplayPlaylistWithHttpInfo}.
   *
   * @param playlistId Unique identifier of the playlist. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Playlist&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Playlist>> getRUMReplayPlaylistWithHttpInfoAsync(
      Long playlistId) {
    Object localVarPostBody = null;

    // verify the required parameter 'playlistId' is set
    if (playlistId == null) {
      CompletableFuture<ApiResponse<Playlist>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'playlistId' when calling getRUMReplayPlaylist"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/replay/playlists/{playlist_id}"
            .replaceAll(
                "\\{" + "playlist_id" + "\\}", apiClient.escapeString(playlistId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumReplayPlaylistsApi.getRUMReplayPlaylist",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Playlist>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<Playlist>() {});
  }

  /** Manage optional parameters to listRUMReplayPlaylists. */
  public static class ListRUMReplayPlaylistsOptionalParameters {
    private String filterCreatedByUuid;
    private String filterQuery;
    private Long pageNumber;
    private Long pageSize;

    /**
     * Set filterCreatedByUuid.
     *
     * @param filterCreatedByUuid Filter playlists by the UUID of the user who created them.
     *     (optional)
     * @return ListRUMReplayPlaylistsOptionalParameters
     */
    public ListRUMReplayPlaylistsOptionalParameters filterCreatedByUuid(
        String filterCreatedByUuid) {
      this.filterCreatedByUuid = filterCreatedByUuid;
      return this;
    }

    /**
     * Set filterQuery.
     *
     * @param filterQuery Search query to filter playlists by name. (optional)
     * @return ListRUMReplayPlaylistsOptionalParameters
     */
    public ListRUMReplayPlaylistsOptionalParameters filterQuery(String filterQuery) {
      this.filterQuery = filterQuery;
      return this;
    }

    /**
     * Set pageNumber.
     *
     * @param pageNumber Page number for pagination (0-indexed). (optional)
     * @return ListRUMReplayPlaylistsOptionalParameters
     */
    public ListRUMReplayPlaylistsOptionalParameters pageNumber(Long pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set pageSize.
     *
     * @param pageSize Number of items per page. (optional)
     * @return ListRUMReplayPlaylistsOptionalParameters
     */
    public ListRUMReplayPlaylistsOptionalParameters pageSize(Long pageSize) {
      this.pageSize = pageSize;
      return this;
    }
  }

  /**
   * List RUM replay playlists.
   *
   * <p>See {@link #listRUMReplayPlaylistsWithHttpInfo}.
   *
   * @return PlaylistArray
   * @throws ApiException if fails to make API call
   */
  public PlaylistArray listRUMReplayPlaylists() throws ApiException {
    return listRUMReplayPlaylistsWithHttpInfo(new ListRUMReplayPlaylistsOptionalParameters())
        .getData();
  }

  /**
   * List RUM replay playlists.
   *
   * <p>See {@link #listRUMReplayPlaylistsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;PlaylistArray&gt;
   */
  public CompletableFuture<PlaylistArray> listRUMReplayPlaylistsAsync() {
    return listRUMReplayPlaylistsWithHttpInfoAsync(new ListRUMReplayPlaylistsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List RUM replay playlists.
   *
   * <p>See {@link #listRUMReplayPlaylistsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return PlaylistArray
   * @throws ApiException if fails to make API call
   */
  public PlaylistArray listRUMReplayPlaylists(ListRUMReplayPlaylistsOptionalParameters parameters)
      throws ApiException {
    return listRUMReplayPlaylistsWithHttpInfo(parameters).getData();
  }

  /**
   * List RUM replay playlists.
   *
   * <p>See {@link #listRUMReplayPlaylistsWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;PlaylistArray&gt;
   */
  public CompletableFuture<PlaylistArray> listRUMReplayPlaylistsAsync(
      ListRUMReplayPlaylistsOptionalParameters parameters) {
    return listRUMReplayPlaylistsWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List playlists.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;PlaylistArray&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<PlaylistArray> listRUMReplayPlaylistsWithHttpInfo(
      ListRUMReplayPlaylistsOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    String filterCreatedByUuid = parameters.filterCreatedByUuid;
    String filterQuery = parameters.filterQuery;
    Long pageNumber = parameters.pageNumber;
    Long pageSize = parameters.pageSize;
    // create path and map variables
    String localVarPath = "/api/v2/rum/replay/playlists";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[created_by_uuid]", filterCreatedByUuid));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[query]", filterQuery));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumReplayPlaylistsApi.listRUMReplayPlaylists",
            localVarPath,
            localVarQueryParams,
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<PlaylistArray>() {});
  }

  /**
   * List RUM replay playlists.
   *
   * <p>See {@link #listRUMReplayPlaylistsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;PlaylistArray&gt;&gt;
   */
  public CompletableFuture<ApiResponse<PlaylistArray>> listRUMReplayPlaylistsWithHttpInfoAsync(
      ListRUMReplayPlaylistsOptionalParameters parameters) {
    Object localVarPostBody = null;
    String filterCreatedByUuid = parameters.filterCreatedByUuid;
    String filterQuery = parameters.filterQuery;
    Long pageNumber = parameters.pageNumber;
    Long pageSize = parameters.pageSize;
    // create path and map variables
    String localVarPath = "/api/v2/rum/replay/playlists";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[created_by_uuid]", filterCreatedByUuid));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[query]", filterQuery));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumReplayPlaylistsApi.listRUMReplayPlaylists",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<PlaylistArray>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<PlaylistArray>() {});
  }

  /** Manage optional parameters to listRUMReplayPlaylistSessions. */
  public static class ListRUMReplayPlaylistSessionsOptionalParameters {
    private Long pageNumber;
    private Long pageSize;

    /**
     * Set pageNumber.
     *
     * @param pageNumber Page number for pagination (0-indexed). (optional)
     * @return ListRUMReplayPlaylistSessionsOptionalParameters
     */
    public ListRUMReplayPlaylistSessionsOptionalParameters pageNumber(Long pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set pageSize.
     *
     * @param pageSize Number of items per page. (optional)
     * @return ListRUMReplayPlaylistSessionsOptionalParameters
     */
    public ListRUMReplayPlaylistSessionsOptionalParameters pageSize(Long pageSize) {
      this.pageSize = pageSize;
      return this;
    }
  }

  /**
   * List RUM replay playlist sessions.
   *
   * <p>See {@link #listRUMReplayPlaylistSessionsWithHttpInfo}.
   *
   * @param playlistId Unique identifier of the playlist. (required)
   * @return PlaylistsSessionArray
   * @throws ApiException if fails to make API call
   */
  public PlaylistsSessionArray listRUMReplayPlaylistSessions(Long playlistId) throws ApiException {
    return listRUMReplayPlaylistSessionsWithHttpInfo(
            playlistId, new ListRUMReplayPlaylistSessionsOptionalParameters())
        .getData();
  }

  /**
   * List RUM replay playlist sessions.
   *
   * <p>See {@link #listRUMReplayPlaylistSessionsWithHttpInfoAsync}.
   *
   * @param playlistId Unique identifier of the playlist. (required)
   * @return CompletableFuture&lt;PlaylistsSessionArray&gt;
   */
  public CompletableFuture<PlaylistsSessionArray> listRUMReplayPlaylistSessionsAsync(
      Long playlistId) {
    return listRUMReplayPlaylistSessionsWithHttpInfoAsync(
            playlistId, new ListRUMReplayPlaylistSessionsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List RUM replay playlist sessions.
   *
   * <p>See {@link #listRUMReplayPlaylistSessionsWithHttpInfo}.
   *
   * @param playlistId Unique identifier of the playlist. (required)
   * @param parameters Optional parameters for the request.
   * @return PlaylistsSessionArray
   * @throws ApiException if fails to make API call
   */
  public PlaylistsSessionArray listRUMReplayPlaylistSessions(
      Long playlistId, ListRUMReplayPlaylistSessionsOptionalParameters parameters)
      throws ApiException {
    return listRUMReplayPlaylistSessionsWithHttpInfo(playlistId, parameters).getData();
  }

  /**
   * List RUM replay playlist sessions.
   *
   * <p>See {@link #listRUMReplayPlaylistSessionsWithHttpInfoAsync}.
   *
   * @param playlistId Unique identifier of the playlist. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;PlaylistsSessionArray&gt;
   */
  public CompletableFuture<PlaylistsSessionArray> listRUMReplayPlaylistSessionsAsync(
      Long playlistId, ListRUMReplayPlaylistSessionsOptionalParameters parameters) {
    return listRUMReplayPlaylistSessionsWithHttpInfoAsync(playlistId, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List sessions in a playlist.
   *
   * @param playlistId Unique identifier of the playlist. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;PlaylistsSessionArray&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<PlaylistsSessionArray> listRUMReplayPlaylistSessionsWithHttpInfo(
      Long playlistId, ListRUMReplayPlaylistSessionsOptionalParameters parameters)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'playlistId' is set
    if (playlistId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'playlistId' when calling listRUMReplayPlaylistSessions");
    }
    Long pageNumber = parameters.pageNumber;
    Long pageSize = parameters.pageSize;
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/replay/playlists/{playlist_id}/sessions"
            .replaceAll(
                "\\{" + "playlist_id" + "\\}", apiClient.escapeString(playlistId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumReplayPlaylistsApi.listRUMReplayPlaylistSessions",
            localVarPath,
            localVarQueryParams,
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<PlaylistsSessionArray>() {});
  }

  /**
   * List RUM replay playlist sessions.
   *
   * <p>See {@link #listRUMReplayPlaylistSessionsWithHttpInfo}.
   *
   * @param playlistId Unique identifier of the playlist. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;PlaylistsSessionArray&gt;&gt;
   */
  public CompletableFuture<ApiResponse<PlaylistsSessionArray>>
      listRUMReplayPlaylistSessionsWithHttpInfoAsync(
          Long playlistId, ListRUMReplayPlaylistSessionsOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'playlistId' is set
    if (playlistId == null) {
      CompletableFuture<ApiResponse<PlaylistsSessionArray>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'playlistId' when calling"
                  + " listRUMReplayPlaylistSessions"));
      return result;
    }
    Long pageNumber = parameters.pageNumber;
    Long pageSize = parameters.pageSize;
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/replay/playlists/{playlist_id}/sessions"
            .replaceAll(
                "\\{" + "playlist_id" + "\\}", apiClient.escapeString(playlistId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumReplayPlaylistsApi.listRUMReplayPlaylistSessions",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<PlaylistsSessionArray>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<PlaylistsSessionArray>() {});
  }

  /**
   * Remove RUM replay session from playlist.
   *
   * <p>See {@link #removeRUMReplaySessionFromPlaylistWithHttpInfo}.
   *
   * @param playlistId Unique identifier of the playlist. (required)
   * @param sessionId Unique identifier of the session. (required)
   * @throws ApiException if fails to make API call
   */
  public void removeRUMReplaySessionFromPlaylist(Long playlistId, String sessionId)
      throws ApiException {
    removeRUMReplaySessionFromPlaylistWithHttpInfo(playlistId, sessionId);
  }

  /**
   * Remove RUM replay session from playlist.
   *
   * <p>See {@link #removeRUMReplaySessionFromPlaylistWithHttpInfoAsync}.
   *
   * @param playlistId Unique identifier of the playlist. (required)
   * @param sessionId Unique identifier of the session. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> removeRUMReplaySessionFromPlaylistAsync(
      Long playlistId, String sessionId) {
    return removeRUMReplaySessionFromPlaylistWithHttpInfoAsync(playlistId, sessionId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Remove a session from a playlist.
   *
   * @param playlistId Unique identifier of the playlist. (required)
   * @param sessionId Unique identifier of the session. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> removeRUMReplaySessionFromPlaylistWithHttpInfo(
      Long playlistId, String sessionId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'playlistId' is set
    if (playlistId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'playlistId' when calling"
              + " removeRUMReplaySessionFromPlaylist");
    }

    // verify the required parameter 'sessionId' is set
    if (sessionId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'sessionId' when calling"
              + " removeRUMReplaySessionFromPlaylist");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/replay/playlists/{playlist_id}/sessions/{session_id}"
            .replaceAll(
                "\\{" + "playlist_id" + "\\}", apiClient.escapeString(playlistId.toString()))
            .replaceAll("\\{" + "session_id" + "\\}", apiClient.escapeString(sessionId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumReplayPlaylistsApi.removeRUMReplaySessionFromPlaylist",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Remove RUM replay session from playlist.
   *
   * <p>See {@link #removeRUMReplaySessionFromPlaylistWithHttpInfo}.
   *
   * @param playlistId Unique identifier of the playlist. (required)
   * @param sessionId Unique identifier of the session. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> removeRUMReplaySessionFromPlaylistWithHttpInfoAsync(
      Long playlistId, String sessionId) {
    Object localVarPostBody = null;

    // verify the required parameter 'playlistId' is set
    if (playlistId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'playlistId' when calling"
                  + " removeRUMReplaySessionFromPlaylist"));
      return result;
    }

    // verify the required parameter 'sessionId' is set
    if (sessionId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'sessionId' when calling"
                  + " removeRUMReplaySessionFromPlaylist"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/replay/playlists/{playlist_id}/sessions/{session_id}"
            .replaceAll(
                "\\{" + "playlist_id" + "\\}", apiClient.escapeString(playlistId.toString()))
            .replaceAll("\\{" + "session_id" + "\\}", apiClient.escapeString(sessionId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumReplayPlaylistsApi.removeRUMReplaySessionFromPlaylist",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"*/*"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Update RUM replay playlist.
   *
   * <p>See {@link #updateRUMReplayPlaylistWithHttpInfo}.
   *
   * @param playlistId Unique identifier of the playlist. (required)
   * @param body (required)
   * @return Playlist
   * @throws ApiException if fails to make API call
   */
  public Playlist updateRUMReplayPlaylist(Long playlistId, Playlist body) throws ApiException {
    return updateRUMReplayPlaylistWithHttpInfo(playlistId, body).getData();
  }

  /**
   * Update RUM replay playlist.
   *
   * <p>See {@link #updateRUMReplayPlaylistWithHttpInfoAsync}.
   *
   * @param playlistId Unique identifier of the playlist. (required)
   * @param body (required)
   * @return CompletableFuture&lt;Playlist&gt;
   */
  public CompletableFuture<Playlist> updateRUMReplayPlaylistAsync(Long playlistId, Playlist body) {
    return updateRUMReplayPlaylistWithHttpInfoAsync(playlistId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update a playlist.
   *
   * @param playlistId Unique identifier of the playlist. (required)
   * @param body (required)
   * @return ApiResponse&lt;Playlist&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Playlist> updateRUMReplayPlaylistWithHttpInfo(Long playlistId, Playlist body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'playlistId' is set
    if (playlistId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'playlistId' when calling updateRUMReplayPlaylist");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateRUMReplayPlaylist");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/replay/playlists/{playlist_id}"
            .replaceAll(
                "\\{" + "playlist_id" + "\\}", apiClient.escapeString(playlistId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumReplayPlaylistsApi.updateRUMReplayPlaylist",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "PUT",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<Playlist>() {});
  }

  /**
   * Update RUM replay playlist.
   *
   * <p>See {@link #updateRUMReplayPlaylistWithHttpInfo}.
   *
   * @param playlistId Unique identifier of the playlist. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Playlist&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Playlist>> updateRUMReplayPlaylistWithHttpInfoAsync(
      Long playlistId, Playlist body) {
    Object localVarPostBody = body;

    // verify the required parameter 'playlistId' is set
    if (playlistId == null) {
      CompletableFuture<ApiResponse<Playlist>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'playlistId' when calling updateRUMReplayPlaylist"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Playlist>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateRUMReplayPlaylist"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/replay/playlists/{playlist_id}"
            .replaceAll(
                "\\{" + "playlist_id" + "\\}", apiClient.escapeString(playlistId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumReplayPlaylistsApi.updateRUMReplayPlaylist",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Playlist>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "PUT",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<Playlist>() {});
  }
}
