package com.datadog.api.v2.client.api;

import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.ApiResponse;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.Pair;
import com.datadog.api.v2.client.model.LogsArchive;
import com.datadog.api.v2.client.model.LogsArchiveCreateRequest;
import com.datadog.api.v2.client.model.LogsArchiveOrder;
import com.datadog.api.v2.client.model.LogsArchives;
import com.datadog.api.v2.client.model.RelationshipToRole;
import com.datadog.api.v2.client.model.RolesResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.core.GenericType;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class LogsArchivesApi {
  private ApiClient apiClient;

  public LogsArchivesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public LogsArchivesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get the API client
   *
   * @return API client
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * Set the API client
   *
   * @param apiClient an instance of API client
   */
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Grant role to an archive
   *
   * <p>See {@link #addReadRoleToArchiveWithHttpInfo}.
   *
   * @param archiveId The ID of the archive. (required)
   * @param body (required)
   * @throws ApiException if fails to make API call
   */
  public void addReadRoleToArchive(String archiveId, RelationshipToRole body) throws ApiException {
    addReadRoleToArchiveWithHttpInfo(archiveId, body);
  }

  /**
   * Grant role to an archive
   *
   * <p>See {@link #addReadRoleToArchiveWithHttpInfoAsync}.
   *
   * @param archiveId The ID of the archive. (required)
   * @param body (required)
   */
  public CompletableFuture<Void> addReadRoleToArchiveAsync(
      String archiveId, RelationshipToRole body) {
    return addReadRoleToArchiveWithHttpInfoAsync(archiveId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Grant role to an archive
   *
   * <p>Adds a read role to an archive. ([Roles API](https://docs.datadoghq.com/api/v2/roles/))
   *
   * @param archiveId The ID of the archive. (required)
   * @param body (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> addReadRoleToArchiveWithHttpInfo(
      String archiveId, RelationshipToRole body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'archiveId' is set
    if (archiveId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'archiveId' when calling addReadRoleToArchive");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling addReadRoleToArchive");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/logs/config/archives/{archive_id}/readers"
            .replaceAll("\\{" + "archive_id" + "\\}", apiClient.escapeString(archiveId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "LogsArchivesApi.addReadRoleToArchive",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Grant role to an archive
   *
   * <p>See {@link #addReadRoleToArchiveWithHttpInfo}.
   *
   * @param archiveId The ID of the archive. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> addReadRoleToArchiveWithHttpInfoAsync(
      String archiveId, RelationshipToRole body) {
    Object localVarPostBody = body;

    // verify the required parameter 'archiveId' is set
    if (archiveId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'archiveId' when calling addReadRoleToArchive"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling addReadRoleToArchive"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/logs/config/archives/{archive_id}/readers"
            .replaceAll("\\{" + "archive_id" + "\\}", apiClient.escapeString(archiveId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "addReadRoleToArchive");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "LogsArchivesApi.addReadRoleToArchive",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
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
        null);
  }

  /**
   * Create an archive
   *
   * <p>See {@link #createLogsArchiveWithHttpInfo}.
   *
   * @param body The definition of the new archive. (required)
   * @return LogsArchive
   * @throws ApiException if fails to make API call
   */
  public LogsArchive createLogsArchive(LogsArchiveCreateRequest body) throws ApiException {
    return createLogsArchiveWithHttpInfo(body).getData();
  }

  /**
   * Create an archive
   *
   * <p>See {@link #createLogsArchiveWithHttpInfoAsync}.
   *
   * @param body The definition of the new archive. (required)
   * @return CompletableFuture&lt;LogsArchive&gt;
   */
  public CompletableFuture<LogsArchive> createLogsArchiveAsync(LogsArchiveCreateRequest body) {
    return createLogsArchiveWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create an archive
   *
   * <p>Create an archive in your organization.
   *
   * @param body The definition of the new archive. (required)
   * @return ApiResponse&lt;LogsArchive&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<LogsArchive> createLogsArchiveWithHttpInfo(LogsArchiveCreateRequest body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createLogsArchive");
    }
    // create path and map variables
    String localVarPath = "/api/v2/logs/config/archives";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "LogsArchivesApi.createLogsArchive",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<LogsArchive>() {});
  }

  /**
   * Create an archive
   *
   * <p>See {@link #createLogsArchiveWithHttpInfo}.
   *
   * @param body The definition of the new archive. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;LogsArchive&gt;&gt;
   */
  public CompletableFuture<ApiResponse<LogsArchive>> createLogsArchiveWithHttpInfoAsync(
      LogsArchiveCreateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<LogsArchive>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createLogsArchive"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/logs/config/archives";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "createLogsArchive");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "LogsArchivesApi.createLogsArchive",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<LogsArchive>> result = new CompletableFuture<>();
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
        new GenericType<LogsArchive>() {});
  }

  /**
   * Delete an archive
   *
   * <p>See {@link #deleteLogsArchiveWithHttpInfo}.
   *
   * @param archiveId The ID of the archive. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteLogsArchive(String archiveId) throws ApiException {
    deleteLogsArchiveWithHttpInfo(archiveId);
  }

  /**
   * Delete an archive
   *
   * <p>See {@link #deleteLogsArchiveWithHttpInfoAsync}.
   *
   * @param archiveId The ID of the archive. (required)
   */
  public CompletableFuture<Void> deleteLogsArchiveAsync(String archiveId) {
    return deleteLogsArchiveWithHttpInfoAsync(archiveId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete an archive
   *
   * <p>Delete a given archive from your organization.
   *
   * @param archiveId The ID of the archive. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteLogsArchiveWithHttpInfo(String archiveId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'archiveId' is set
    if (archiveId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'archiveId' when calling deleteLogsArchive");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/logs/config/archives/{archive_id}"
            .replaceAll("\\{" + "archive_id" + "\\}", apiClient.escapeString(archiveId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "LogsArchivesApi.deleteLogsArchive",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
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
   * Delete an archive
   *
   * <p>See {@link #deleteLogsArchiveWithHttpInfo}.
   *
   * @param archiveId The ID of the archive. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteLogsArchiveWithHttpInfoAsync(String archiveId) {
    Object localVarPostBody = null;

    // verify the required parameter 'archiveId' is set
    if (archiveId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'archiveId' when calling deleteLogsArchive"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/logs/config/archives/{archive_id}"
            .replaceAll("\\{" + "archive_id" + "\\}", apiClient.escapeString(archiveId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "deleteLogsArchive");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "LogsArchivesApi.deleteLogsArchive",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
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
   * Get an archive
   *
   * <p>See {@link #getLogsArchiveWithHttpInfo}.
   *
   * @param archiveId The ID of the archive. (required)
   * @return LogsArchive
   * @throws ApiException if fails to make API call
   */
  public LogsArchive getLogsArchive(String archiveId) throws ApiException {
    return getLogsArchiveWithHttpInfo(archiveId).getData();
  }

  /**
   * Get an archive
   *
   * <p>See {@link #getLogsArchiveWithHttpInfoAsync}.
   *
   * @param archiveId The ID of the archive. (required)
   * @return CompletableFuture&lt;LogsArchive&gt;
   */
  public CompletableFuture<LogsArchive> getLogsArchiveAsync(String archiveId) {
    return getLogsArchiveWithHttpInfoAsync(archiveId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get an archive
   *
   * <p>Get a specific archive from your organization.
   *
   * @param archiveId The ID of the archive. (required)
   * @return ApiResponse&lt;LogsArchive&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<LogsArchive> getLogsArchiveWithHttpInfo(String archiveId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'archiveId' is set
    if (archiveId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'archiveId' when calling getLogsArchive");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/logs/config/archives/{archive_id}"
            .replaceAll("\\{" + "archive_id" + "\\}", apiClient.escapeString(archiveId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "LogsArchivesApi.getLogsArchive",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<LogsArchive>() {});
  }

  /**
   * Get an archive
   *
   * <p>See {@link #getLogsArchiveWithHttpInfo}.
   *
   * @param archiveId The ID of the archive. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;LogsArchive&gt;&gt;
   */
  public CompletableFuture<ApiResponse<LogsArchive>> getLogsArchiveWithHttpInfoAsync(
      String archiveId) {
    Object localVarPostBody = null;

    // verify the required parameter 'archiveId' is set
    if (archiveId == null) {
      CompletableFuture<ApiResponse<LogsArchive>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'archiveId' when calling getLogsArchive"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/logs/config/archives/{archive_id}"
            .replaceAll("\\{" + "archive_id" + "\\}", apiClient.escapeString(archiveId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getLogsArchive");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "LogsArchivesApi.getLogsArchive",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<LogsArchive>> result = new CompletableFuture<>();
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
        new GenericType<LogsArchive>() {});
  }

  /**
   * Get archive order
   *
   * <p>See {@link #getLogsArchiveOrderWithHttpInfo}.
   *
   * @return LogsArchiveOrder
   * @throws ApiException if fails to make API call
   */
  public LogsArchiveOrder getLogsArchiveOrder() throws ApiException {
    return getLogsArchiveOrderWithHttpInfo().getData();
  }

  /**
   * Get archive order
   *
   * <p>See {@link #getLogsArchiveOrderWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;LogsArchiveOrder&gt;
   */
  public CompletableFuture<LogsArchiveOrder> getLogsArchiveOrderAsync() {
    return getLogsArchiveOrderWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get archive order
   *
   * <p>Get the current order of your archives. This endpoint takes no JSON arguments.
   *
   * @return ApiResponse&lt;LogsArchiveOrder&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<LogsArchiveOrder> getLogsArchiveOrderWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/logs/config/archive-order";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "LogsArchivesApi.getLogsArchiveOrder",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<LogsArchiveOrder>() {});
  }

  /**
   * Get archive order
   *
   * <p>See {@link #getLogsArchiveOrderWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;LogsArchiveOrder&gt;&gt;
   */
  public CompletableFuture<ApiResponse<LogsArchiveOrder>> getLogsArchiveOrderWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/logs/config/archive-order";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getLogsArchiveOrder");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "LogsArchivesApi.getLogsArchiveOrder",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<LogsArchiveOrder>> result = new CompletableFuture<>();
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
        new GenericType<LogsArchiveOrder>() {});
  }

  /**
   * List read roles for an archive
   *
   * <p>See {@link #listArchiveReadRolesWithHttpInfo}.
   *
   * @param archiveId The ID of the archive. (required)
   * @return RolesResponse
   * @throws ApiException if fails to make API call
   */
  public RolesResponse listArchiveReadRoles(String archiveId) throws ApiException {
    return listArchiveReadRolesWithHttpInfo(archiveId).getData();
  }

  /**
   * List read roles for an archive
   *
   * <p>See {@link #listArchiveReadRolesWithHttpInfoAsync}.
   *
   * @param archiveId The ID of the archive. (required)
   * @return CompletableFuture&lt;RolesResponse&gt;
   */
  public CompletableFuture<RolesResponse> listArchiveReadRolesAsync(String archiveId) {
    return listArchiveReadRolesWithHttpInfoAsync(archiveId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List read roles for an archive
   *
   * <p>Returns all read roles a given archive is restricted to.
   *
   * @param archiveId The ID of the archive. (required)
   * @return ApiResponse&lt;RolesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<RolesResponse> listArchiveReadRolesWithHttpInfo(String archiveId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'archiveId' is set
    if (archiveId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'archiveId' when calling listArchiveReadRoles");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/logs/config/archives/{archive_id}/readers"
            .replaceAll("\\{" + "archive_id" + "\\}", apiClient.escapeString(archiveId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "LogsArchivesApi.listArchiveReadRoles",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<RolesResponse>() {});
  }

  /**
   * List read roles for an archive
   *
   * <p>See {@link #listArchiveReadRolesWithHttpInfo}.
   *
   * @param archiveId The ID of the archive. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;RolesResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RolesResponse>> listArchiveReadRolesWithHttpInfoAsync(
      String archiveId) {
    Object localVarPostBody = null;

    // verify the required parameter 'archiveId' is set
    if (archiveId == null) {
      CompletableFuture<ApiResponse<RolesResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'archiveId' when calling listArchiveReadRoles"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/logs/config/archives/{archive_id}/readers"
            .replaceAll("\\{" + "archive_id" + "\\}", apiClient.escapeString(archiveId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listArchiveReadRoles");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "LogsArchivesApi.listArchiveReadRoles",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RolesResponse>> result = new CompletableFuture<>();
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
        new GenericType<RolesResponse>() {});
  }

  /**
   * Get all archives
   *
   * <p>See {@link #listLogsArchivesWithHttpInfo}.
   *
   * @return LogsArchives
   * @throws ApiException if fails to make API call
   */
  public LogsArchives listLogsArchives() throws ApiException {
    return listLogsArchivesWithHttpInfo().getData();
  }

  /**
   * Get all archives
   *
   * <p>See {@link #listLogsArchivesWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;LogsArchives&gt;
   */
  public CompletableFuture<LogsArchives> listLogsArchivesAsync() {
    return listLogsArchivesWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get all archives
   *
   * <p>Get the list of configured logs archives with their definitions.
   *
   * @return ApiResponse&lt;LogsArchives&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<LogsArchives> listLogsArchivesWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/logs/config/archives";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "LogsArchivesApi.listLogsArchives",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<LogsArchives>() {});
  }

  /**
   * Get all archives
   *
   * <p>See {@link #listLogsArchivesWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;LogsArchives&gt;&gt;
   */
  public CompletableFuture<ApiResponse<LogsArchives>> listLogsArchivesWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/logs/config/archives";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listLogsArchives");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "LogsArchivesApi.listLogsArchives",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<LogsArchives>> result = new CompletableFuture<>();
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
        new GenericType<LogsArchives>() {});
  }

  /**
   * Revoke role from an archive
   *
   * <p>See {@link #removeRoleFromArchiveWithHttpInfo}.
   *
   * @param archiveId The ID of the archive. (required)
   * @param body (required)
   * @throws ApiException if fails to make API call
   */
  public void removeRoleFromArchive(String archiveId, RelationshipToRole body) throws ApiException {
    removeRoleFromArchiveWithHttpInfo(archiveId, body);
  }

  /**
   * Revoke role from an archive
   *
   * <p>See {@link #removeRoleFromArchiveWithHttpInfoAsync}.
   *
   * @param archiveId The ID of the archive. (required)
   * @param body (required)
   */
  public CompletableFuture<Void> removeRoleFromArchiveAsync(
      String archiveId, RelationshipToRole body) {
    return removeRoleFromArchiveWithHttpInfoAsync(archiveId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Revoke role from an archive
   *
   * <p>Removes a role from an archive. ([Roles API](https://docs.datadoghq.com/api/v2/roles/))
   *
   * @param archiveId The ID of the archive. (required)
   * @param body (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> removeRoleFromArchiveWithHttpInfo(
      String archiveId, RelationshipToRole body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'archiveId' is set
    if (archiveId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'archiveId' when calling removeRoleFromArchive");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling removeRoleFromArchive");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/logs/config/archives/{archive_id}/readers"
            .replaceAll("\\{" + "archive_id" + "\\}", apiClient.escapeString(archiveId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "LogsArchivesApi.removeRoleFromArchive",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
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
   * Revoke role from an archive
   *
   * <p>See {@link #removeRoleFromArchiveWithHttpInfo}.
   *
   * @param archiveId The ID of the archive. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> removeRoleFromArchiveWithHttpInfoAsync(
      String archiveId, RelationshipToRole body) {
    Object localVarPostBody = body;

    // verify the required parameter 'archiveId' is set
    if (archiveId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'archiveId' when calling removeRoleFromArchive"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling removeRoleFromArchive"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/logs/config/archives/{archive_id}/readers"
            .replaceAll("\\{" + "archive_id" + "\\}", apiClient.escapeString(archiveId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "removeRoleFromArchive");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "LogsArchivesApi.removeRoleFromArchive",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
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
   * Update an archive
   *
   * <p>See {@link #updateLogsArchiveWithHttpInfo}.
   *
   * @param archiveId The ID of the archive. (required)
   * @param body New definition of the archive. (required)
   * @return LogsArchive
   * @throws ApiException if fails to make API call
   */
  public LogsArchive updateLogsArchive(String archiveId, LogsArchiveCreateRequest body)
      throws ApiException {
    return updateLogsArchiveWithHttpInfo(archiveId, body).getData();
  }

  /**
   * Update an archive
   *
   * <p>See {@link #updateLogsArchiveWithHttpInfoAsync}.
   *
   * @param archiveId The ID of the archive. (required)
   * @param body New definition of the archive. (required)
   * @return CompletableFuture&lt;LogsArchive&gt;
   */
  public CompletableFuture<LogsArchive> updateLogsArchiveAsync(
      String archiveId, LogsArchiveCreateRequest body) {
    return updateLogsArchiveWithHttpInfoAsync(archiveId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update an archive
   *
   * <p>Update a given archive configuration. **Note**: Using this method updates your archive
   * configuration by **replacing** your current configuration with the new one sent to your Datadog
   * organization.
   *
   * @param archiveId The ID of the archive. (required)
   * @param body New definition of the archive. (required)
   * @return ApiResponse&lt;LogsArchive&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<LogsArchive> updateLogsArchiveWithHttpInfo(
      String archiveId, LogsArchiveCreateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'archiveId' is set
    if (archiveId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'archiveId' when calling updateLogsArchive");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateLogsArchive");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/logs/config/archives/{archive_id}"
            .replaceAll("\\{" + "archive_id" + "\\}", apiClient.escapeString(archiveId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "LogsArchivesApi.updateLogsArchive",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "PUT",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<LogsArchive>() {});
  }

  /**
   * Update an archive
   *
   * <p>See {@link #updateLogsArchiveWithHttpInfo}.
   *
   * @param archiveId The ID of the archive. (required)
   * @param body New definition of the archive. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;LogsArchive&gt;&gt;
   */
  public CompletableFuture<ApiResponse<LogsArchive>> updateLogsArchiveWithHttpInfoAsync(
      String archiveId, LogsArchiveCreateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'archiveId' is set
    if (archiveId == null) {
      CompletableFuture<ApiResponse<LogsArchive>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'archiveId' when calling updateLogsArchive"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<LogsArchive>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateLogsArchive"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/logs/config/archives/{archive_id}"
            .replaceAll("\\{" + "archive_id" + "\\}", apiClient.escapeString(archiveId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "updateLogsArchive");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "LogsArchivesApi.updateLogsArchive",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<LogsArchive>> result = new CompletableFuture<>();
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
        new GenericType<LogsArchive>() {});
  }

  /**
   * Update archive order
   *
   * <p>See {@link #updateLogsArchiveOrderWithHttpInfo}.
   *
   * @param body An object containing the new ordered list of archive IDs. (required)
   * @return LogsArchiveOrder
   * @throws ApiException if fails to make API call
   */
  public LogsArchiveOrder updateLogsArchiveOrder(LogsArchiveOrder body) throws ApiException {
    return updateLogsArchiveOrderWithHttpInfo(body).getData();
  }

  /**
   * Update archive order
   *
   * <p>See {@link #updateLogsArchiveOrderWithHttpInfoAsync}.
   *
   * @param body An object containing the new ordered list of archive IDs. (required)
   * @return CompletableFuture&lt;LogsArchiveOrder&gt;
   */
  public CompletableFuture<LogsArchiveOrder> updateLogsArchiveOrderAsync(LogsArchiveOrder body) {
    return updateLogsArchiveOrderWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update archive order
   *
   * <p>Update the order of your archives. Since logs are processed sequentially, reordering an
   * archive may change the structure and content of the data processed by other archives. **Note**:
   * Using the &#x60;PUT&#x60; method updates your archive&#39;s order by replacing the current
   * order with the new one.
   *
   * @param body An object containing the new ordered list of archive IDs. (required)
   * @return ApiResponse&lt;LogsArchiveOrder&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<LogsArchiveOrder> updateLogsArchiveOrderWithHttpInfo(LogsArchiveOrder body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateLogsArchiveOrder");
    }
    // create path and map variables
    String localVarPath = "/api/v2/logs/config/archive-order";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "LogsArchivesApi.updateLogsArchiveOrder",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "PUT",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<LogsArchiveOrder>() {});
  }

  /**
   * Update archive order
   *
   * <p>See {@link #updateLogsArchiveOrderWithHttpInfo}.
   *
   * @param body An object containing the new ordered list of archive IDs. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;LogsArchiveOrder&gt;&gt;
   */
  public CompletableFuture<ApiResponse<LogsArchiveOrder>> updateLogsArchiveOrderWithHttpInfoAsync(
      LogsArchiveOrder body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<LogsArchiveOrder>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateLogsArchiveOrder"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/logs/config/archive-order";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "updateLogsArchiveOrder");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "LogsArchivesApi.updateLogsArchiveOrder",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<LogsArchiveOrder>> result = new CompletableFuture<>();
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
        new GenericType<LogsArchiveOrder>() {});
  }
}
