package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.ArchiveSearchCreateRequest;
import com.datadog.api.client.v2.model.ArchiveSearchResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogsArchiveSearchesApi {
  private ApiClient apiClient;

  public LogsArchiveSearchesApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public LogsArchiveSearchesApi(ApiClient apiClient) {
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

  /**
   * Create an Archive Search.
   *
   * <p>See {@link #createArchiveSearchWithHttpInfo}.
   *
   * @param body (required)
   * @return ArchiveSearchResponse
   * @throws ApiException if fails to make API call
   */
  public ArchiveSearchResponse createArchiveSearch(ArchiveSearchCreateRequest body)
      throws ApiException {
    return createArchiveSearchWithHttpInfo(body).getData();
  }

  /**
   * Create an Archive Search.
   *
   * <p>See {@link #createArchiveSearchWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ArchiveSearchResponse&gt;
   */
  public CompletableFuture<ArchiveSearchResponse> createArchiveSearchAsync(
      ArchiveSearchCreateRequest body) {
    return createArchiveSearchWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Start a search over the logs stored in an archive.
   *
   * <p>Without a <code>rehydration</code> object, the search only scans the archive and reports how
   * much data matched. With one, the matched logs are also indexed into a retained historical view,
   * which requires the <code>logs_write_historical_view</code> permission.
   *
   * @param body (required)
   * @return ApiResponse&lt;ArchiveSearchResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ArchiveSearchResponse> createArchiveSearchWithHttpInfo(
      ArchiveSearchCreateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createArchiveSearch";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createArchiveSearch");
    }
    // create path and map variables
    String localVarPath = "/api/v2/logs/archive_searches";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.LogsArchiveSearchesApi.createArchiveSearch",
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
        new GenericType<ArchiveSearchResponse>() {});
  }

  /**
   * Create an Archive Search.
   *
   * <p>See {@link #createArchiveSearchWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ArchiveSearchResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ArchiveSearchResponse>> createArchiveSearchWithHttpInfoAsync(
      ArchiveSearchCreateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createArchiveSearch";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ArchiveSearchResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<ArchiveSearchResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createArchiveSearch"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/logs/archive_searches";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.LogsArchiveSearchesApi.createArchiveSearch",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ArchiveSearchResponse>> result = new CompletableFuture<>();
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
        new GenericType<ArchiveSearchResponse>() {});
  }

  /**
   * Get an Archive Search.
   *
   * <p>See {@link #getArchiveSearchWithHttpInfo}.
   *
   * @param archiveSearchId Unique identifier of the Archive Search. (required)
   * @return ArchiveSearchResponse
   * @throws ApiException if fails to make API call
   */
  public ArchiveSearchResponse getArchiveSearch(String archiveSearchId) throws ApiException {
    return getArchiveSearchWithHttpInfo(archiveSearchId).getData();
  }

  /**
   * Get an Archive Search.
   *
   * <p>See {@link #getArchiveSearchWithHttpInfoAsync}.
   *
   * @param archiveSearchId Unique identifier of the Archive Search. (required)
   * @return CompletableFuture&lt;ArchiveSearchResponse&gt;
   */
  public CompletableFuture<ArchiveSearchResponse> getArchiveSearchAsync(String archiveSearchId) {
    return getArchiveSearchWithHttpInfoAsync(archiveSearchId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a single Archive Search, including its status and the amount of archive data scanned when
   * the search finishes.
   *
   * @param archiveSearchId Unique identifier of the Archive Search. (required)
   * @return ApiResponse&lt;ArchiveSearchResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ArchiveSearchResponse> getArchiveSearchWithHttpInfo(String archiveSearchId)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getArchiveSearch";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'archiveSearchId' is set
    if (archiveSearchId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'archiveSearchId' when calling getArchiveSearch");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/logs/archive_searches/{archive_search_id}"
            .replaceAll(
                "\\{" + "archive_search_id" + "\\}",
                apiClient.escapeString(archiveSearchId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.LogsArchiveSearchesApi.getArchiveSearch",
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
        new GenericType<ArchiveSearchResponse>() {});
  }

  /**
   * Get an Archive Search.
   *
   * <p>See {@link #getArchiveSearchWithHttpInfo}.
   *
   * @param archiveSearchId Unique identifier of the Archive Search. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ArchiveSearchResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ArchiveSearchResponse>> getArchiveSearchWithHttpInfoAsync(
      String archiveSearchId) {
    // Check if unstable operation is enabled
    String operationId = "getArchiveSearch";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ArchiveSearchResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'archiveSearchId' is set
    if (archiveSearchId == null) {
      CompletableFuture<ApiResponse<ArchiveSearchResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'archiveSearchId' when calling getArchiveSearch"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/logs/archive_searches/{archive_search_id}"
            .replaceAll(
                "\\{" + "archive_search_id" + "\\}",
                apiClient.escapeString(archiveSearchId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.LogsArchiveSearchesApi.getArchiveSearch",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ArchiveSearchResponse>> result = new CompletableFuture<>();
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
        new GenericType<ArchiveSearchResponse>() {});
  }
}
