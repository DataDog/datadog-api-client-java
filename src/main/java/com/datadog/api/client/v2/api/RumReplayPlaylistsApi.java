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

  /** Manage optional parameters to addRumReplaySessionToPlaylist. */
  public static class AddRumReplaySessionToPlaylistOptionalParameters {
    private String dataSource;

    /**
     * Set dataSource.
     *
     * @param dataSource Data source type. Valid values: 'rum' or 'product_analytics'. Defaults to
     *     'rum'. (optional)
     * @return AddRumReplaySessionToPlaylistOptionalParameters
     */
    public AddRumReplaySessionToPlaylistOptionalParameters dataSource(String dataSource) {
      this.dataSource = dataSource;
      return this;
    }
  }

  /**
   * Add rum replay session to playlist.
   *
   * <p>See {@link #addRumReplaySessionToPlaylistWithHttpInfo}.
   *
   * @param ts Server-side timestamp in milliseconds. (required)
   * @param playlistId Unique identifier of the playlist. (required)
   * @param sessionId Unique identifier of the session. (required)
   * @return PlaylistsSession
   * @throws ApiException if fails to make API call
   */
  public PlaylistsSession addRumReplaySessionToPlaylist(
      Long ts, Integer playlistId, String sessionId) throws ApiException {
    return addRumReplaySessionToPlaylistWithHttpInfo(
            ts, playlistId, sessionId, new AddRumReplaySessionToPlaylistOptionalParameters())
        .getData();
  }

  /**
   * Add rum replay session to playlist.
   *
   * <p>See {@link #addRumReplaySessionToPlaylistWithHttpInfoAsync}.
   *
   * @param ts Server-side timestamp in milliseconds. (required)
   * @param playlistId Unique identifier of the playlist. (required)
   * @param sessionId Unique identifier of the session. (required)
   * @return CompletableFuture&lt;PlaylistsSession&gt;
   */
  public CompletableFuture<PlaylistsSession> addRumReplaySessionToPlaylistAsync(
      Long ts, Integer playlistId, String sessionId) {
    return addRumReplaySessionToPlaylistWithHttpInfoAsync(
            ts, playlistId, sessionId, new AddRumReplaySessionToPlaylistOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Add rum replay session to playlist.
   *
   * <p>See {@link #addRumReplaySessionToPlaylistWithHttpInfo}.
   *
   * @param ts Server-side timestamp in milliseconds. (required)
   * @param playlistId Unique identifier of the playlist. (required)
   * @param sessionId Unique identifier of the session. (required)
   * @param parameters Optional parameters for the request.
   * @return PlaylistsSession
   * @throws ApiException if fails to make API call
   */
  public PlaylistsSession addRumReplaySessionToPlaylist(
      Long ts,
      Integer playlistId,
      String sessionId,
      AddRumReplaySessionToPlaylistOptionalParameters parameters)
      throws ApiException {
    return addRumReplaySessionToPlaylistWithHttpInfo(ts, playlistId, sessionId, parameters)
        .getData();
  }

  /**
   * Add rum replay session to playlist.
   *
   * <p>See {@link #addRumReplaySessionToPlaylistWithHttpInfoAsync}.
   *
   * @param ts Server-side timestamp in milliseconds. (required)
   * @param playlistId Unique identifier of the playlist. (required)
   * @param sessionId Unique identifier of the session. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;PlaylistsSession&gt;
   */
  public CompletableFuture<PlaylistsSession> addRumReplaySessionToPlaylistAsync(
      Long ts,
      Integer playlistId,
      String sessionId,
      AddRumReplaySessionToPlaylistOptionalParameters parameters) {
    return addRumReplaySessionToPlaylistWithHttpInfoAsync(ts, playlistId, sessionId, parameters)
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
  public ApiResponse<PlaylistsSession> addRumReplaySessionToPlaylistWithHttpInfo(
      Long ts,
      Integer playlistId,
      String sessionId,
      AddRumReplaySessionToPlaylistOptionalParameters parameters)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'ts' is set
    if (ts == null) {
      throw new ApiException(
          400, "Missing the required parameter 'ts' when calling addRumReplaySessionToPlaylist");
    }

    // verify the required parameter 'playlistId' is set
    if (playlistId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'playlistId' when calling addRumReplaySessionToPlaylist");
    }

    // verify the required parameter 'sessionId' is set
    if (sessionId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'sessionId' when calling addRumReplaySessionToPlaylist");
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
            "v2.RumReplayPlaylistsApi.addRumReplaySessionToPlaylist",
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
   * Add rum replay session to playlist.
   *
   * <p>See {@link #addRumReplaySessionToPlaylistWithHttpInfo}.
   *
   * @param ts Server-side timestamp in milliseconds. (required)
   * @param playlistId Unique identifier of the playlist. (required)
   * @param sessionId Unique identifier of the session. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;PlaylistsSession&gt;&gt;
   */
  public CompletableFuture<ApiResponse<PlaylistsSession>>
      addRumReplaySessionToPlaylistWithHttpInfoAsync(
          Long ts,
          Integer playlistId,
          String sessionId,
          AddRumReplaySessionToPlaylistOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'ts' is set
    if (ts == null) {
      CompletableFuture<ApiResponse<PlaylistsSession>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'ts' when calling addRumReplaySessionToPlaylist"));
      return result;
    }

    // verify the required parameter 'playlistId' is set
    if (playlistId == null) {
      CompletableFuture<ApiResponse<PlaylistsSession>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'playlistId' when calling"
                  + " addRumReplaySessionToPlaylist"));
      return result;
    }

    // verify the required parameter 'sessionId' is set
    if (sessionId == null) {
      CompletableFuture<ApiResponse<PlaylistsSession>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'sessionId' when calling"
                  + " addRumReplaySessionToPlaylist"));
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
              "v2.RumReplayPlaylistsApi.addRumReplaySessionToPlaylist",
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
   * Bulk remove rum replay playlist sessions.
   *
   * <p>See {@link #bulkRemoveRumReplayPlaylistSessionsWithHttpInfo}.
   *
   * @param playlistId Unique identifier of the playlist. (required)
   * @param body (required)
   * @throws ApiException if fails to make API call
   */
  public void bulkRemoveRumReplayPlaylistSessions(Integer playlistId, SessionIdArray body)
      throws ApiException {
    bulkRemoveRumReplayPlaylistSessionsWithHttpInfo(playlistId, body);
  }

  /**
   * Bulk remove rum replay playlist sessions.
   *
   * <p>See {@link #bulkRemoveRumReplayPlaylistSessionsWithHttpInfoAsync}.
   *
   * @param playlistId Unique identifier of the playlist. (required)
   * @param body (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> bulkRemoveRumReplayPlaylistSessionsAsync(
      Integer playlistId, SessionIdArray body) {
    return bulkRemoveRumReplayPlaylistSessionsWithHttpInfoAsync(playlistId, body)
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
  public ApiResponse<Void> bulkRemoveRumReplayPlaylistSessionsWithHttpInfo(
      Integer playlistId, SessionIdArray body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'playlistId' is set
    if (playlistId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'playlistId' when calling"
              + " bulkRemoveRumReplayPlaylistSessions");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'body' when calling bulkRemoveRumReplayPlaylistSessions");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/replay/playlists/{playlist_id}/sessions"
            .replaceAll(
                "\\{" + "playlist_id" + "\\}", apiClient.escapeString(playlistId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumReplayPlaylistsApi.bulkRemoveRumReplayPlaylistSessions",
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
   * Bulk remove rum replay playlist sessions.
   *
   * <p>See {@link #bulkRemoveRumReplayPlaylistSessionsWithHttpInfo}.
   *
   * @param playlistId Unique identifier of the playlist. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> bulkRemoveRumReplayPlaylistSessionsWithHttpInfoAsync(
      Integer playlistId, SessionIdArray body) {
    Object localVarPostBody = body;

    // verify the required parameter 'playlistId' is set
    if (playlistId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'playlistId' when calling"
                  + " bulkRemoveRumReplayPlaylistSessions"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " bulkRemoveRumReplayPlaylistSessions"));
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
              "v2.RumReplayPlaylistsApi.bulkRemoveRumReplayPlaylistSessions",
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
   * Create rum replay playlist.
   *
   * <p>See {@link #createRumReplayPlaylistWithHttpInfo}.
   *
   * @param body (required)
   * @return Playlist
   * @throws ApiException if fails to make API call
   */
  public Playlist createRumReplayPlaylist(Playlist body) throws ApiException {
    return createRumReplayPlaylistWithHttpInfo(body).getData();
  }

  /**
   * Create rum replay playlist.
   *
   * <p>See {@link #createRumReplayPlaylistWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;Playlist&gt;
   */
  public CompletableFuture<Playlist> createRumReplayPlaylistAsync(Playlist body) {
    return createRumReplayPlaylistWithHttpInfoAsync(body)
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
  public ApiResponse<Playlist> createRumReplayPlaylistWithHttpInfo(Playlist body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createRumReplayPlaylist");
    }
    // create path and map variables
    String localVarPath = "/api/v2/rum/replay/playlists";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumReplayPlaylistsApi.createRumReplayPlaylist",
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
   * Create rum replay playlist.
   *
   * <p>See {@link #createRumReplayPlaylistWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Playlist&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Playlist>> createRumReplayPlaylistWithHttpInfoAsync(
      Playlist body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Playlist>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createRumReplayPlaylist"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/rum/replay/playlists";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumReplayPlaylistsApi.createRumReplayPlaylist",
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
   * Delete rum replay playlist.
   *
   * <p>See {@link #deleteRumReplayPlaylistWithHttpInfo}.
   *
   * @param playlistId Unique identifier of the playlist. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteRumReplayPlaylist(Integer playlistId) throws ApiException {
    deleteRumReplayPlaylistWithHttpInfo(playlistId);
  }

  /**
   * Delete rum replay playlist.
   *
   * <p>See {@link #deleteRumReplayPlaylistWithHttpInfoAsync}.
   *
   * @param playlistId Unique identifier of the playlist. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteRumReplayPlaylistAsync(Integer playlistId) {
    return deleteRumReplayPlaylistWithHttpInfoAsync(playlistId)
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
  public ApiResponse<Void> deleteRumReplayPlaylistWithHttpInfo(Integer playlistId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'playlistId' is set
    if (playlistId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'playlistId' when calling deleteRumReplayPlaylist");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/replay/playlists/{playlist_id}"
            .replaceAll(
                "\\{" + "playlist_id" + "\\}", apiClient.escapeString(playlistId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumReplayPlaylistsApi.deleteRumReplayPlaylist",
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
   * Delete rum replay playlist.
   *
   * <p>See {@link #deleteRumReplayPlaylistWithHttpInfo}.
   *
   * @param playlistId Unique identifier of the playlist. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteRumReplayPlaylistWithHttpInfoAsync(
      Integer playlistId) {
    Object localVarPostBody = null;

    // verify the required parameter 'playlistId' is set
    if (playlistId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'playlistId' when calling deleteRumReplayPlaylist"));
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
              "v2.RumReplayPlaylistsApi.deleteRumReplayPlaylist",
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
   * Get rum replay playlist.
   *
   * <p>See {@link #getRumReplayPlaylistWithHttpInfo}.
   *
   * @param playlistId Unique identifier of the playlist. (required)
   * @return Playlist
   * @throws ApiException if fails to make API call
   */
  public Playlist getRumReplayPlaylist(Integer playlistId) throws ApiException {
    return getRumReplayPlaylistWithHttpInfo(playlistId).getData();
  }

  /**
   * Get rum replay playlist.
   *
   * <p>See {@link #getRumReplayPlaylistWithHttpInfoAsync}.
   *
   * @param playlistId Unique identifier of the playlist. (required)
   * @return CompletableFuture&lt;Playlist&gt;
   */
  public CompletableFuture<Playlist> getRumReplayPlaylistAsync(Integer playlistId) {
    return getRumReplayPlaylistWithHttpInfoAsync(playlistId)
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
  public ApiResponse<Playlist> getRumReplayPlaylistWithHttpInfo(Integer playlistId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'playlistId' is set
    if (playlistId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'playlistId' when calling getRumReplayPlaylist");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/replay/playlists/{playlist_id}"
            .replaceAll(
                "\\{" + "playlist_id" + "\\}", apiClient.escapeString(playlistId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumReplayPlaylistsApi.getRumReplayPlaylist",
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
   * Get rum replay playlist.
   *
   * <p>See {@link #getRumReplayPlaylistWithHttpInfo}.
   *
   * @param playlistId Unique identifier of the playlist. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Playlist&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Playlist>> getRumReplayPlaylistWithHttpInfoAsync(
      Integer playlistId) {
    Object localVarPostBody = null;

    // verify the required parameter 'playlistId' is set
    if (playlistId == null) {
      CompletableFuture<ApiResponse<Playlist>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'playlistId' when calling getRumReplayPlaylist"));
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
              "v2.RumReplayPlaylistsApi.getRumReplayPlaylist",
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

  /** Manage optional parameters to listRumReplayPlaylists. */
  public static class ListRumReplayPlaylistsOptionalParameters {
    private String filterCreatedByUuid;
    private String filterQuery;
    private Integer pageNumber;
    private Integer pageSize;

    /**
     * Set filterCreatedByUuid.
     *
     * @param filterCreatedByUuid Filter playlists by the UUID of the user who created them.
     *     (optional)
     * @return ListRumReplayPlaylistsOptionalParameters
     */
    public ListRumReplayPlaylistsOptionalParameters filterCreatedByUuid(
        String filterCreatedByUuid) {
      this.filterCreatedByUuid = filterCreatedByUuid;
      return this;
    }

    /**
     * Set filterQuery.
     *
     * @param filterQuery Search query to filter playlists by name. (optional)
     * @return ListRumReplayPlaylistsOptionalParameters
     */
    public ListRumReplayPlaylistsOptionalParameters filterQuery(String filterQuery) {
      this.filterQuery = filterQuery;
      return this;
    }

    /**
     * Set pageNumber.
     *
     * @param pageNumber Page number for pagination (0-indexed). (optional)
     * @return ListRumReplayPlaylistsOptionalParameters
     */
    public ListRumReplayPlaylistsOptionalParameters pageNumber(Integer pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set pageSize.
     *
     * @param pageSize Number of items per page. (optional)
     * @return ListRumReplayPlaylistsOptionalParameters
     */
    public ListRumReplayPlaylistsOptionalParameters pageSize(Integer pageSize) {
      this.pageSize = pageSize;
      return this;
    }
  }

  /**
   * List rum replay playlists.
   *
   * <p>See {@link #listRumReplayPlaylistsWithHttpInfo}.
   *
   * @return PlaylistArray
   * @throws ApiException if fails to make API call
   */
  public PlaylistArray listRumReplayPlaylists() throws ApiException {
    return listRumReplayPlaylistsWithHttpInfo(new ListRumReplayPlaylistsOptionalParameters())
        .getData();
  }

  /**
   * List rum replay playlists.
   *
   * <p>See {@link #listRumReplayPlaylistsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;PlaylistArray&gt;
   */
  public CompletableFuture<PlaylistArray> listRumReplayPlaylistsAsync() {
    return listRumReplayPlaylistsWithHttpInfoAsync(new ListRumReplayPlaylistsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List rum replay playlists.
   *
   * <p>See {@link #listRumReplayPlaylistsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return PlaylistArray
   * @throws ApiException if fails to make API call
   */
  public PlaylistArray listRumReplayPlaylists(ListRumReplayPlaylistsOptionalParameters parameters)
      throws ApiException {
    return listRumReplayPlaylistsWithHttpInfo(parameters).getData();
  }

  /**
   * List rum replay playlists.
   *
   * <p>See {@link #listRumReplayPlaylistsWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;PlaylistArray&gt;
   */
  public CompletableFuture<PlaylistArray> listRumReplayPlaylistsAsync(
      ListRumReplayPlaylistsOptionalParameters parameters) {
    return listRumReplayPlaylistsWithHttpInfoAsync(parameters)
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
  public ApiResponse<PlaylistArray> listRumReplayPlaylistsWithHttpInfo(
      ListRumReplayPlaylistsOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    String filterCreatedByUuid = parameters.filterCreatedByUuid;
    String filterQuery = parameters.filterQuery;
    Integer pageNumber = parameters.pageNumber;
    Integer pageSize = parameters.pageSize;
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
            "v2.RumReplayPlaylistsApi.listRumReplayPlaylists",
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
   * List rum replay playlists.
   *
   * <p>See {@link #listRumReplayPlaylistsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;PlaylistArray&gt;&gt;
   */
  public CompletableFuture<ApiResponse<PlaylistArray>> listRumReplayPlaylistsWithHttpInfoAsync(
      ListRumReplayPlaylistsOptionalParameters parameters) {
    Object localVarPostBody = null;
    String filterCreatedByUuid = parameters.filterCreatedByUuid;
    String filterQuery = parameters.filterQuery;
    Integer pageNumber = parameters.pageNumber;
    Integer pageSize = parameters.pageSize;
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
              "v2.RumReplayPlaylistsApi.listRumReplayPlaylists",
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

  /** Manage optional parameters to listRumReplayPlaylistSessions. */
  public static class ListRumReplayPlaylistSessionsOptionalParameters {
    private Integer pageNumber;
    private Integer pageSize;

    /**
     * Set pageNumber.
     *
     * @param pageNumber Page number for pagination (0-indexed). (optional)
     * @return ListRumReplayPlaylistSessionsOptionalParameters
     */
    public ListRumReplayPlaylistSessionsOptionalParameters pageNumber(Integer pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set pageSize.
     *
     * @param pageSize Number of items per page. (optional)
     * @return ListRumReplayPlaylistSessionsOptionalParameters
     */
    public ListRumReplayPlaylistSessionsOptionalParameters pageSize(Integer pageSize) {
      this.pageSize = pageSize;
      return this;
    }
  }

  /**
   * List rum replay playlist sessions.
   *
   * <p>See {@link #listRumReplayPlaylistSessionsWithHttpInfo}.
   *
   * @param playlistId Unique identifier of the playlist. (required)
   * @return PlaylistsSessionArray
   * @throws ApiException if fails to make API call
   */
  public PlaylistsSessionArray listRumReplayPlaylistSessions(Integer playlistId)
      throws ApiException {
    return listRumReplayPlaylistSessionsWithHttpInfo(
            playlistId, new ListRumReplayPlaylistSessionsOptionalParameters())
        .getData();
  }

  /**
   * List rum replay playlist sessions.
   *
   * <p>See {@link #listRumReplayPlaylistSessionsWithHttpInfoAsync}.
   *
   * @param playlistId Unique identifier of the playlist. (required)
   * @return CompletableFuture&lt;PlaylistsSessionArray&gt;
   */
  public CompletableFuture<PlaylistsSessionArray> listRumReplayPlaylistSessionsAsync(
      Integer playlistId) {
    return listRumReplayPlaylistSessionsWithHttpInfoAsync(
            playlistId, new ListRumReplayPlaylistSessionsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List rum replay playlist sessions.
   *
   * <p>See {@link #listRumReplayPlaylistSessionsWithHttpInfo}.
   *
   * @param playlistId Unique identifier of the playlist. (required)
   * @param parameters Optional parameters for the request.
   * @return PlaylistsSessionArray
   * @throws ApiException if fails to make API call
   */
  public PlaylistsSessionArray listRumReplayPlaylistSessions(
      Integer playlistId, ListRumReplayPlaylistSessionsOptionalParameters parameters)
      throws ApiException {
    return listRumReplayPlaylistSessionsWithHttpInfo(playlistId, parameters).getData();
  }

  /**
   * List rum replay playlist sessions.
   *
   * <p>See {@link #listRumReplayPlaylistSessionsWithHttpInfoAsync}.
   *
   * @param playlistId Unique identifier of the playlist. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;PlaylistsSessionArray&gt;
   */
  public CompletableFuture<PlaylistsSessionArray> listRumReplayPlaylistSessionsAsync(
      Integer playlistId, ListRumReplayPlaylistSessionsOptionalParameters parameters) {
    return listRumReplayPlaylistSessionsWithHttpInfoAsync(playlistId, parameters)
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
  public ApiResponse<PlaylistsSessionArray> listRumReplayPlaylistSessionsWithHttpInfo(
      Integer playlistId, ListRumReplayPlaylistSessionsOptionalParameters parameters)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'playlistId' is set
    if (playlistId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'playlistId' when calling listRumReplayPlaylistSessions");
    }
    Integer pageNumber = parameters.pageNumber;
    Integer pageSize = parameters.pageSize;
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
            "v2.RumReplayPlaylistsApi.listRumReplayPlaylistSessions",
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
   * List rum replay playlist sessions.
   *
   * <p>See {@link #listRumReplayPlaylistSessionsWithHttpInfo}.
   *
   * @param playlistId Unique identifier of the playlist. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;PlaylistsSessionArray&gt;&gt;
   */
  public CompletableFuture<ApiResponse<PlaylistsSessionArray>>
      listRumReplayPlaylistSessionsWithHttpInfoAsync(
          Integer playlistId, ListRumReplayPlaylistSessionsOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'playlistId' is set
    if (playlistId == null) {
      CompletableFuture<ApiResponse<PlaylistsSessionArray>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'playlistId' when calling"
                  + " listRumReplayPlaylistSessions"));
      return result;
    }
    Integer pageNumber = parameters.pageNumber;
    Integer pageSize = parameters.pageSize;
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
              "v2.RumReplayPlaylistsApi.listRumReplayPlaylistSessions",
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
   * Remove rum replay session from playlist.
   *
   * <p>See {@link #removeRumReplaySessionFromPlaylistWithHttpInfo}.
   *
   * @param playlistId Unique identifier of the playlist. (required)
   * @param sessionId Unique identifier of the session. (required)
   * @throws ApiException if fails to make API call
   */
  public void removeRumReplaySessionFromPlaylist(Integer playlistId, String sessionId)
      throws ApiException {
    removeRumReplaySessionFromPlaylistWithHttpInfo(playlistId, sessionId);
  }

  /**
   * Remove rum replay session from playlist.
   *
   * <p>See {@link #removeRumReplaySessionFromPlaylistWithHttpInfoAsync}.
   *
   * @param playlistId Unique identifier of the playlist. (required)
   * @param sessionId Unique identifier of the session. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> removeRumReplaySessionFromPlaylistAsync(
      Integer playlistId, String sessionId) {
    return removeRumReplaySessionFromPlaylistWithHttpInfoAsync(playlistId, sessionId)
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
  public ApiResponse<Void> removeRumReplaySessionFromPlaylistWithHttpInfo(
      Integer playlistId, String sessionId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'playlistId' is set
    if (playlistId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'playlistId' when calling"
              + " removeRumReplaySessionFromPlaylist");
    }

    // verify the required parameter 'sessionId' is set
    if (sessionId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'sessionId' when calling"
              + " removeRumReplaySessionFromPlaylist");
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
            "v2.RumReplayPlaylistsApi.removeRumReplaySessionFromPlaylist",
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
   * Remove rum replay session from playlist.
   *
   * <p>See {@link #removeRumReplaySessionFromPlaylistWithHttpInfo}.
   *
   * @param playlistId Unique identifier of the playlist. (required)
   * @param sessionId Unique identifier of the session. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> removeRumReplaySessionFromPlaylistWithHttpInfoAsync(
      Integer playlistId, String sessionId) {
    Object localVarPostBody = null;

    // verify the required parameter 'playlistId' is set
    if (playlistId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'playlistId' when calling"
                  + " removeRumReplaySessionFromPlaylist"));
      return result;
    }

    // verify the required parameter 'sessionId' is set
    if (sessionId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'sessionId' when calling"
                  + " removeRumReplaySessionFromPlaylist"));
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
              "v2.RumReplayPlaylistsApi.removeRumReplaySessionFromPlaylist",
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
   * Update rum replay playlist.
   *
   * <p>See {@link #updateRumReplayPlaylistWithHttpInfo}.
   *
   * @param playlistId Unique identifier of the playlist. (required)
   * @param body (required)
   * @return Playlist
   * @throws ApiException if fails to make API call
   */
  public Playlist updateRumReplayPlaylist(Integer playlistId, Playlist body) throws ApiException {
    return updateRumReplayPlaylistWithHttpInfo(playlistId, body).getData();
  }

  /**
   * Update rum replay playlist.
   *
   * <p>See {@link #updateRumReplayPlaylistWithHttpInfoAsync}.
   *
   * @param playlistId Unique identifier of the playlist. (required)
   * @param body (required)
   * @return CompletableFuture&lt;Playlist&gt;
   */
  public CompletableFuture<Playlist> updateRumReplayPlaylistAsync(
      Integer playlistId, Playlist body) {
    return updateRumReplayPlaylistWithHttpInfoAsync(playlistId, body)
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
  public ApiResponse<Playlist> updateRumReplayPlaylistWithHttpInfo(
      Integer playlistId, Playlist body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'playlistId' is set
    if (playlistId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'playlistId' when calling updateRumReplayPlaylist");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateRumReplayPlaylist");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/replay/playlists/{playlist_id}"
            .replaceAll(
                "\\{" + "playlist_id" + "\\}", apiClient.escapeString(playlistId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumReplayPlaylistsApi.updateRumReplayPlaylist",
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
   * Update rum replay playlist.
   *
   * <p>See {@link #updateRumReplayPlaylistWithHttpInfo}.
   *
   * @param playlistId Unique identifier of the playlist. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Playlist&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Playlist>> updateRumReplayPlaylistWithHttpInfoAsync(
      Integer playlistId, Playlist body) {
    Object localVarPostBody = body;

    // verify the required parameter 'playlistId' is set
    if (playlistId == null) {
      CompletableFuture<ApiResponse<Playlist>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'playlistId' when calling updateRumReplayPlaylist"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Playlist>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateRumReplayPlaylist"));
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
              "v2.RumReplayPlaylistsApi.updateRumReplayPlaylist",
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
