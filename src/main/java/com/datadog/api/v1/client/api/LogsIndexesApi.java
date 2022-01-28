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
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "createLogsIndex");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<LogsIndex> localVarReturnType = new GenericType<LogsIndex>() {};

    return apiClient.invokeAPI(
        "LogsIndexesApi.createLogsIndex",
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false);
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "createLogsIndex");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<LogsIndex> localVarReturnType = new GenericType<LogsIndex>() {};

    return apiClient.invokeAPIAsync(
        "LogsIndexesApi.createLogsIndex",
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false);
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getLogsIndex");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<LogsIndex> localVarReturnType = new GenericType<LogsIndex>() {};

    return apiClient.invokeAPI(
        "LogsIndexesApi.getLogsIndex",
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false);
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getLogsIndex");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<LogsIndex> localVarReturnType = new GenericType<LogsIndex>() {};

    return apiClient.invokeAPIAsync(
        "LogsIndexesApi.getLogsIndex",
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false);
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getLogsIndexOrder");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<LogsIndexesOrder> localVarReturnType = new GenericType<LogsIndexesOrder>() {};

    return apiClient.invokeAPI(
        "LogsIndexesApi.getLogsIndexOrder",
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false);
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getLogsIndexOrder");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<LogsIndexesOrder> localVarReturnType = new GenericType<LogsIndexesOrder>() {};

    return apiClient.invokeAPIAsync(
        "LogsIndexesApi.getLogsIndexOrder",
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false);
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listLogIndexes");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<LogsIndexListResponse> localVarReturnType =
        new GenericType<LogsIndexListResponse>() {};

    return apiClient.invokeAPI(
        "LogsIndexesApi.listLogIndexes",
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false);
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listLogIndexes");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<LogsIndexListResponse> localVarReturnType =
        new GenericType<LogsIndexListResponse>() {};

    return apiClient.invokeAPIAsync(
        "LogsIndexesApi.listLogIndexes",
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false);
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "updateLogsIndex");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<LogsIndex> localVarReturnType = new GenericType<LogsIndex>() {};

    return apiClient.invokeAPI(
        "LogsIndexesApi.updateLogsIndex",
        localVarPath,
        "PUT",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false);
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "updateLogsIndex");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<LogsIndex> localVarReturnType = new GenericType<LogsIndex>() {};

    return apiClient.invokeAPIAsync(
        "LogsIndexesApi.updateLogsIndex",
        localVarPath,
        "PUT",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false);
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "updateLogsIndexOrder");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<LogsIndexesOrder> localVarReturnType = new GenericType<LogsIndexesOrder>() {};

    return apiClient.invokeAPI(
        "LogsIndexesApi.updateLogsIndexOrder",
        localVarPath,
        "PUT",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false);
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "updateLogsIndexOrder");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<LogsIndexesOrder> localVarReturnType = new GenericType<LogsIndexesOrder>() {};

    return apiClient.invokeAPIAsync(
        "LogsIndexesApi.updateLogsIndexOrder",
        localVarPath,
        "PUT",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false);
  }
}
