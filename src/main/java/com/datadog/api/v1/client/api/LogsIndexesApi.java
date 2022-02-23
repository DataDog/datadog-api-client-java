package com.datadog.api.v1.client.api;

import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.ApiResponse;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.Pair;
import com.datadog.api.v1.client.model.LogsIndex;
import com.datadog.api.v1.client.model.LogsIndexListResponse;
import com.datadog.api.v1.client.model.LogsIndexUpdateRequest;
import com.datadog.api.v1.client.model.LogsIndexesOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.core.GenericType;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class LogsIndexesApi {
  private ApiClient apiClient;

  public LogsIndexesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public LogsIndexesApi(ApiClient apiClient) {
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
   * Create an index
   *
   * <p>See {@link #createLogsIndexWithHttpInfo}.
   *
   * @param body Object containing the new index. (required)
   * @return LogsIndex
   * @throws ApiException if fails to make API call
   */
  public LogsIndex createLogsIndex(LogsIndex body) throws ApiException {
    return createLogsIndexWithHttpInfo(body).getData();
  }

  /**
   * Create an index
   *
   * <p>See {@link #createLogsIndexWithHttpInfoAsync}.
   *
   * @param body Object containing the new index. (required)
   * @return CompletableFuture&lt;LogsIndex&gt;
   */
  public CompletableFuture<LogsIndex> createLogsIndexAsync(LogsIndex body) {
    return createLogsIndexWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create an index
   *
   * <p>Creates a new index. Returns the Index object passed in the request body when the request is
   * successful.
   *
   * @param body Object containing the new index. (required)
   * @return ApiResponse&lt;LogsIndex&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Invalid Parameter Error </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<LogsIndex> createLogsIndexWithHttpInfo(LogsIndex body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createLogsIndex");
    }
    // create path and map variables
    String localVarPath = "/api/v1/logs/config/indexes";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "LogsIndexesApi.createLogsIndex",
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
        new GenericType<LogsIndex>() {});
  }

  /**
   * Create an index
   *
   * <p>See {@link #createLogsIndexWithHttpInfo}.
   *
   * @param body Object containing the new index. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;LogsIndex&gt;&gt;
   */
  public CompletableFuture<ApiResponse<LogsIndex>> createLogsIndexWithHttpInfoAsync(
      LogsIndex body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<LogsIndex>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createLogsIndex"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/logs/config/indexes";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "createLogsIndex");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "LogsIndexesApi.createLogsIndex",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<LogsIndex>> result = new CompletableFuture<>();
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
        new GenericType<LogsIndex>() {});
  }

  /**
   * Get an index
   *
   * <p>See {@link #getLogsIndexWithHttpInfo}.
   *
   * @param name Name of the log index. (required)
   * @return LogsIndex
   * @throws ApiException if fails to make API call
   */
  public LogsIndex getLogsIndex(String name) throws ApiException {
    return getLogsIndexWithHttpInfo(name).getData();
  }

  /**
   * Get an index
   *
   * <p>See {@link #getLogsIndexWithHttpInfoAsync}.
   *
   * @param name Name of the log index. (required)
   * @return CompletableFuture&lt;LogsIndex&gt;
   */
  public CompletableFuture<LogsIndex> getLogsIndexAsync(String name) {
    return getLogsIndexWithHttpInfoAsync(name)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get an index
   *
   * <p>Get one log index from your organization. This endpoint takes no JSON arguments.
   *
   * @param name Name of the log index. (required)
   * @return ApiResponse&lt;LogsIndex&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<LogsIndex> getLogsIndexWithHttpInfo(String name) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(
          400, "Missing the required parameter 'name' when calling getLogsIndex");
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/logs/config/indexes/{name}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "LogsIndexesApi.getLogsIndex",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<LogsIndex>() {});
  }

  /**
   * Get an index
   *
   * <p>See {@link #getLogsIndexWithHttpInfo}.
   *
   * @param name Name of the log index. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;LogsIndex&gt;&gt;
   */
  public CompletableFuture<ApiResponse<LogsIndex>> getLogsIndexWithHttpInfoAsync(String name) {
    Object localVarPostBody = null;

    // verify the required parameter 'name' is set
    if (name == null) {
      CompletableFuture<ApiResponse<LogsIndex>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'name' when calling getLogsIndex"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/logs/config/indexes/{name}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getLogsIndex");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "LogsIndexesApi.getLogsIndex",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<LogsIndex>> result = new CompletableFuture<>();
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
        new GenericType<LogsIndex>() {});
  }

  /**
   * Get indexes order
   *
   * <p>See {@link #getLogsIndexOrderWithHttpInfo}.
   *
   * @return LogsIndexesOrder
   * @throws ApiException if fails to make API call
   */
  public LogsIndexesOrder getLogsIndexOrder() throws ApiException {
    return getLogsIndexOrderWithHttpInfo().getData();
  }

  /**
   * Get indexes order
   *
   * <p>See {@link #getLogsIndexOrderWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;LogsIndexesOrder&gt;
   */
  public CompletableFuture<LogsIndexesOrder> getLogsIndexOrderAsync() {
    return getLogsIndexOrderWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get indexes order
   *
   * <p>Get the current order of your log indexes. This endpoint takes no JSON arguments.
   *
   * @return ApiResponse&lt;LogsIndexesOrder&gt;
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
  public ApiResponse<LogsIndexesOrder> getLogsIndexOrderWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v1/logs/config/index-order";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "LogsIndexesApi.getLogsIndexOrder",
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
        new GenericType<LogsIndexesOrder>() {});
  }

  /**
   * Get indexes order
   *
   * <p>See {@link #getLogsIndexOrderWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;LogsIndexesOrder&gt;&gt;
   */
  public CompletableFuture<ApiResponse<LogsIndexesOrder>> getLogsIndexOrderWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v1/logs/config/index-order";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getLogsIndexOrder");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "LogsIndexesApi.getLogsIndexOrder",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<LogsIndexesOrder>> result = new CompletableFuture<>();
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
        new GenericType<LogsIndexesOrder>() {});
  }

  /**
   * Get all indexes
   *
   * <p>See {@link #listLogIndexesWithHttpInfo}.
   *
   * @return LogsIndexListResponse
   * @throws ApiException if fails to make API call
   */
  public LogsIndexListResponse listLogIndexes() throws ApiException {
    return listLogIndexesWithHttpInfo().getData();
  }

  /**
   * Get all indexes
   *
   * <p>See {@link #listLogIndexesWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;LogsIndexListResponse&gt;
   */
  public CompletableFuture<LogsIndexListResponse> listLogIndexesAsync() {
    return listLogIndexesWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get all indexes
   *
   * <p>The Index object describes the configuration of a log index. This endpoint returns an array
   * of the &#x60;LogIndex&#x60; objects of your organization.
   *
   * @return ApiResponse&lt;LogsIndexListResponse&gt;
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
  public ApiResponse<LogsIndexListResponse> listLogIndexesWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v1/logs/config/indexes";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "LogsIndexesApi.listLogIndexes",
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
        new GenericType<LogsIndexListResponse>() {});
  }

  /**
   * Get all indexes
   *
   * <p>See {@link #listLogIndexesWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;LogsIndexListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<LogsIndexListResponse>> listLogIndexesWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v1/logs/config/indexes";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listLogIndexes");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "LogsIndexesApi.listLogIndexes",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<LogsIndexListResponse>> result = new CompletableFuture<>();
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
        new GenericType<LogsIndexListResponse>() {});
  }

  /**
   * Update an index
   *
   * <p>See {@link #updateLogsIndexWithHttpInfo}.
   *
   * @param name Name of the log index. (required)
   * @param body Object containing the new &#x60;LogsIndexUpdateRequest&#x60;. (required)
   * @return LogsIndex
   * @throws ApiException if fails to make API call
   */
  public LogsIndex updateLogsIndex(String name, LogsIndexUpdateRequest body) throws ApiException {
    return updateLogsIndexWithHttpInfo(name, body).getData();
  }

  /**
   * Update an index
   *
   * <p>See {@link #updateLogsIndexWithHttpInfoAsync}.
   *
   * @param name Name of the log index. (required)
   * @param body Object containing the new &#x60;LogsIndexUpdateRequest&#x60;. (required)
   * @return CompletableFuture&lt;LogsIndex&gt;
   */
  public CompletableFuture<LogsIndex> updateLogsIndexAsync(
      String name, LogsIndexUpdateRequest body) {
    return updateLogsIndexWithHttpInfoAsync(name, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update an index
   *
   * <p>Update an index as identified by its name. Returns the Index object passed in the request
   * body when the request is successful. Using the &#x60;PUT&#x60; method updates your index’s
   * configuration by **replacing** your current configuration with the new one sent to your Datadog
   * organization.
   *
   * @param name Name of the log index. (required)
   * @param body Object containing the new &#x60;LogsIndexUpdateRequest&#x60;. (required)
   * @return ApiResponse&lt;LogsIndex&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Invalid Parameter Error </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<LogsIndex> updateLogsIndexWithHttpInfo(
      String name, LogsIndexUpdateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(
          400, "Missing the required parameter 'name' when calling updateLogsIndex");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateLogsIndex");
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/logs/config/indexes/{name}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "LogsIndexesApi.updateLogsIndex",
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
        new GenericType<LogsIndex>() {});
  }

  /**
   * Update an index
   *
   * <p>See {@link #updateLogsIndexWithHttpInfo}.
   *
   * @param name Name of the log index. (required)
   * @param body Object containing the new &#x60;LogsIndexUpdateRequest&#x60;. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;LogsIndex&gt;&gt;
   */
  public CompletableFuture<ApiResponse<LogsIndex>> updateLogsIndexWithHttpInfoAsync(
      String name, LogsIndexUpdateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'name' is set
    if (name == null) {
      CompletableFuture<ApiResponse<LogsIndex>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'name' when calling updateLogsIndex"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<LogsIndex>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateLogsIndex"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/logs/config/indexes/{name}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "updateLogsIndex");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "LogsIndexesApi.updateLogsIndex",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<LogsIndex>> result = new CompletableFuture<>();
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
        new GenericType<LogsIndex>() {});
  }

  /**
   * Update indexes order
   *
   * <p>See {@link #updateLogsIndexOrderWithHttpInfo}.
   *
   * @param body Object containing the new ordered list of index names (required)
   * @return LogsIndexesOrder
   * @throws ApiException if fails to make API call
   */
  public LogsIndexesOrder updateLogsIndexOrder(LogsIndexesOrder body) throws ApiException {
    return updateLogsIndexOrderWithHttpInfo(body).getData();
  }

  /**
   * Update indexes order
   *
   * <p>See {@link #updateLogsIndexOrderWithHttpInfoAsync}.
   *
   * @param body Object containing the new ordered list of index names (required)
   * @return CompletableFuture&lt;LogsIndexesOrder&gt;
   */
  public CompletableFuture<LogsIndexesOrder> updateLogsIndexOrderAsync(LogsIndexesOrder body) {
    return updateLogsIndexOrderWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update indexes order
   *
   * <p>This endpoint updates the index order of your organization. It returns the index order
   * object passed in the request body when the request is successful.
   *
   * @param body Object containing the new ordered list of index names (required)
   * @return ApiResponse&lt;LogsIndexesOrder&gt;
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
  public ApiResponse<LogsIndexesOrder> updateLogsIndexOrderWithHttpInfo(LogsIndexesOrder body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateLogsIndexOrder");
    }
    // create path and map variables
    String localVarPath = "/api/v1/logs/config/index-order";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "LogsIndexesApi.updateLogsIndexOrder",
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
        new GenericType<LogsIndexesOrder>() {});
  }

  /**
   * Update indexes order
   *
   * <p>See {@link #updateLogsIndexOrderWithHttpInfo}.
   *
   * @param body Object containing the new ordered list of index names (required)
   * @return CompletableFuture&lt;ApiResponse&lt;LogsIndexesOrder&gt;&gt;
   */
  public CompletableFuture<ApiResponse<LogsIndexesOrder>> updateLogsIndexOrderWithHttpInfoAsync(
      LogsIndexesOrder body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<LogsIndexesOrder>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateLogsIndexOrder"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/logs/config/index-order";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "updateLogsIndexOrder");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "LogsIndexesApi.updateLogsIndexOrder",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<LogsIndexesOrder>> result = new CompletableFuture<>();
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
        new GenericType<LogsIndexesOrder>() {});
  }
}
