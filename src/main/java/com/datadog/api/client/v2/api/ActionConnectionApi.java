package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.CreateActionConnectionRequest;
import com.datadog.api.client.v2.model.CreateActionConnectionResponse;
import com.datadog.api.client.v2.model.GetActionConnectionResponse;
import com.datadog.api.client.v2.model.GetAppKeyRegistrationResponse;
import com.datadog.api.client.v2.model.ListActionConnectionsResponse;
import com.datadog.api.client.v2.model.ListAppKeyRegistrationsResponse;
import com.datadog.api.client.v2.model.ListConnectionGroupsResponse;
import com.datadog.api.client.v2.model.RegisterAppKeyResponse;
import com.datadog.api.client.v2.model.UpdateActionConnectionRequest;
import com.datadog.api.client.v2.model.UpdateActionConnectionResponse;
import com.datadog.api.client.v2.model.UpdateConnectionGroupRequest;
import com.datadog.api.client.v2.model.UpdateConnectionGroupResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ActionConnectionApi {
  private ApiClient apiClient;

  public ActionConnectionApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public ActionConnectionApi(ApiClient apiClient) {
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
   * Create a new Action Connection.
   *
   * <p>See {@link #createActionConnectionWithHttpInfo}.
   *
   * @param body (required)
   * @return CreateActionConnectionResponse
   * @throws ApiException if fails to make API call
   */
  public CreateActionConnectionResponse createActionConnection(CreateActionConnectionRequest body)
      throws ApiException {
    return createActionConnectionWithHttpInfo(body).getData();
  }

  /**
   * Create a new Action Connection.
   *
   * <p>See {@link #createActionConnectionWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;CreateActionConnectionResponse&gt;
   */
  public CompletableFuture<CreateActionConnectionResponse> createActionConnectionAsync(
      CreateActionConnectionRequest body) {
    return createActionConnectionWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a new Action Connection. This API requires a <a
   * href="https://docs.datadoghq.com/api/latest/action-connection/#register-a-new-app-key">registered
   * application key</a>.
   *
   * @param body (required)
   * @return ApiResponse&lt;CreateActionConnectionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Successfully created Action Connection </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too Many Request </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CreateActionConnectionResponse> createActionConnectionWithHttpInfo(
      CreateActionConnectionRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createActionConnection");
    }
    // create path and map variables
    String localVarPath = "/api/v2/actions/connections";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ActionConnectionApi.createActionConnection",
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
        new GenericType<CreateActionConnectionResponse>() {});
  }

  /**
   * Create a new Action Connection.
   *
   * <p>See {@link #createActionConnectionWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CreateActionConnectionResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CreateActionConnectionResponse>>
      createActionConnectionWithHttpInfoAsync(CreateActionConnectionRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<CreateActionConnectionResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createActionConnection"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/actions/connections";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ActionConnectionApi.createActionConnection",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CreateActionConnectionResponse>> result =
          new CompletableFuture<>();
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
        new GenericType<CreateActionConnectionResponse>() {});
  }

  /**
   * Delete an existing Action Connection.
   *
   * <p>See {@link #deleteActionConnectionWithHttpInfo}.
   *
   * @param connectionId The ID of the action connection (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteActionConnection(String connectionId) throws ApiException {
    deleteActionConnectionWithHttpInfo(connectionId);
  }

  /**
   * Delete an existing Action Connection.
   *
   * <p>See {@link #deleteActionConnectionWithHttpInfoAsync}.
   *
   * @param connectionId The ID of the action connection (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteActionConnectionAsync(String connectionId) {
    return deleteActionConnectionWithHttpInfoAsync(connectionId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete an existing Action Connection. This API requires a <a
   * href="https://docs.datadoghq.com/api/latest/action-connection/#register-a-new-app-key">registered
   * application key</a>. Alternatively, you can configure these permissions <a
   * href="https://docs.datadoghq.com/account_management/api-app-keys/#actions-api-access">in the
   * UI</a>.
   *
   * @param connectionId The ID of the action connection (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> The resource was deleted successfully. </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too Many Request </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteActionConnectionWithHttpInfo(String connectionId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'connectionId' is set
    if (connectionId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'connectionId' when calling deleteActionConnection");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/actions/connections/{connection_id}"
            .replaceAll(
                "\\{" + "connection_id" + "\\}", apiClient.escapeString(connectionId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ActionConnectionApi.deleteActionConnection",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
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
   * Delete an existing Action Connection.
   *
   * <p>See {@link #deleteActionConnectionWithHttpInfo}.
   *
   * @param connectionId The ID of the action connection (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteActionConnectionWithHttpInfoAsync(
      String connectionId) {
    Object localVarPostBody = null;

    // verify the required parameter 'connectionId' is set
    if (connectionId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'connectionId' when calling deleteActionConnection"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/actions/connections/{connection_id}"
            .replaceAll(
                "\\{" + "connection_id" + "\\}", apiClient.escapeString(connectionId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ActionConnectionApi.deleteActionConnection",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"*/*"},
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
   * Get an existing Action Connection.
   *
   * <p>See {@link #getActionConnectionWithHttpInfo}.
   *
   * @param connectionId The ID of the action connection (required)
   * @return GetActionConnectionResponse
   * @throws ApiException if fails to make API call
   */
  public GetActionConnectionResponse getActionConnection(String connectionId) throws ApiException {
    return getActionConnectionWithHttpInfo(connectionId).getData();
  }

  /**
   * Get an existing Action Connection.
   *
   * <p>See {@link #getActionConnectionWithHttpInfoAsync}.
   *
   * @param connectionId The ID of the action connection (required)
   * @return CompletableFuture&lt;GetActionConnectionResponse&gt;
   */
  public CompletableFuture<GetActionConnectionResponse> getActionConnectionAsync(
      String connectionId) {
    return getActionConnectionWithHttpInfoAsync(connectionId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get an existing Action Connection. This API requires a <a
   * href="https://docs.datadoghq.com/api/latest/action-connection/#register-a-new-app-key">registered
   * application key</a>.
   *
   * @param connectionId The ID of the action connection (required)
   * @return ApiResponse&lt;GetActionConnectionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> Successfully get Action Connection </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too Many Request </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<GetActionConnectionResponse> getActionConnectionWithHttpInfo(
      String connectionId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'connectionId' is set
    if (connectionId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'connectionId' when calling getActionConnection");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/actions/connections/{connection_id}"
            .replaceAll(
                "\\{" + "connection_id" + "\\}", apiClient.escapeString(connectionId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ActionConnectionApi.getActionConnection",
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
        new GenericType<GetActionConnectionResponse>() {});
  }

  /**
   * Get an existing Action Connection.
   *
   * <p>See {@link #getActionConnectionWithHttpInfo}.
   *
   * @param connectionId The ID of the action connection (required)
   * @return CompletableFuture&lt;ApiResponse&lt;GetActionConnectionResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<GetActionConnectionResponse>>
      getActionConnectionWithHttpInfoAsync(String connectionId) {
    Object localVarPostBody = null;

    // verify the required parameter 'connectionId' is set
    if (connectionId == null) {
      CompletableFuture<ApiResponse<GetActionConnectionResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'connectionId' when calling getActionConnection"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/actions/connections/{connection_id}"
            .replaceAll(
                "\\{" + "connection_id" + "\\}", apiClient.escapeString(connectionId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ActionConnectionApi.getActionConnection",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<GetActionConnectionResponse>> result =
          new CompletableFuture<>();
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
        new GenericType<GetActionConnectionResponse>() {});
  }

  /**
   * Get an existing App Key Registration.
   *
   * <p>See {@link #getAppKeyRegistrationWithHttpInfo}.
   *
   * @param appKeyId The ID of the app key (required)
   * @return GetAppKeyRegistrationResponse
   * @throws ApiException if fails to make API call
   */
  public GetAppKeyRegistrationResponse getAppKeyRegistration(String appKeyId) throws ApiException {
    return getAppKeyRegistrationWithHttpInfo(appKeyId).getData();
  }

  /**
   * Get an existing App Key Registration.
   *
   * <p>See {@link #getAppKeyRegistrationWithHttpInfoAsync}.
   *
   * @param appKeyId The ID of the app key (required)
   * @return CompletableFuture&lt;GetAppKeyRegistrationResponse&gt;
   */
  public CompletableFuture<GetAppKeyRegistrationResponse> getAppKeyRegistrationAsync(
      String appKeyId) {
    return getAppKeyRegistrationWithHttpInfoAsync(appKeyId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get an existing App Key Registration
   *
   * @param appKeyId The ID of the app key (required)
   * @return ApiResponse&lt;GetAppKeyRegistrationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<GetAppKeyRegistrationResponse> getAppKeyRegistrationWithHttpInfo(
      String appKeyId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'appKeyId' is set
    if (appKeyId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'appKeyId' when calling getAppKeyRegistration");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/actions/app_key_registrations/{app_key_id}"
            .replaceAll("\\{" + "app_key_id" + "\\}", apiClient.escapeString(appKeyId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ActionConnectionApi.getAppKeyRegistration",
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
        new GenericType<GetAppKeyRegistrationResponse>() {});
  }

  /**
   * Get an existing App Key Registration.
   *
   * <p>See {@link #getAppKeyRegistrationWithHttpInfo}.
   *
   * @param appKeyId The ID of the app key (required)
   * @return CompletableFuture&lt;ApiResponse&lt;GetAppKeyRegistrationResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<GetAppKeyRegistrationResponse>>
      getAppKeyRegistrationWithHttpInfoAsync(String appKeyId) {
    Object localVarPostBody = null;

    // verify the required parameter 'appKeyId' is set
    if (appKeyId == null) {
      CompletableFuture<ApiResponse<GetAppKeyRegistrationResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'appKeyId' when calling getAppKeyRegistration"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/actions/app_key_registrations/{app_key_id}"
            .replaceAll("\\{" + "app_key_id" + "\\}", apiClient.escapeString(appKeyId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ActionConnectionApi.getAppKeyRegistration",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<GetAppKeyRegistrationResponse>> result =
          new CompletableFuture<>();
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
        new GenericType<GetAppKeyRegistrationResponse>() {});
  }

  /** Manage optional parameters to listActionConnections. */
  public static class ListActionConnectionsOptionalParameters {
    private Long pageSize;
    private Long pageNumber;
    private List<String> filterIntegration;
    private List<String> filterTags;
    private String filterEnvironment;
    private List<String> filterConnectionIds;
    private List<String> filterCreatorIds;
    private String filterSearch;
    private List<String> sort;

    /**
     * Set pageSize.
     *
     * @param pageSize The number of connections to return per page. (optional, default to 50)
     * @return ListActionConnectionsOptionalParameters
     */
    public ListActionConnectionsOptionalParameters pageSize(Long pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set pageNumber.
     *
     * @param pageNumber The page number to return. (optional, default to 0)
     * @return ListActionConnectionsOptionalParameters
     */
    public ListActionConnectionsOptionalParameters pageNumber(Long pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set filterIntegration.
     *
     * @param filterIntegration Filter by integration type. (optional)
     * @return ListActionConnectionsOptionalParameters
     */
    public ListActionConnectionsOptionalParameters filterIntegration(
        List<String> filterIntegration) {
      this.filterIntegration = filterIntegration;
      return this;
    }

    /**
     * Set filterTags.
     *
     * @param filterTags Filter by tags. (optional)
     * @return ListActionConnectionsOptionalParameters
     */
    public ListActionConnectionsOptionalParameters filterTags(List<String> filterTags) {
      this.filterTags = filterTags;
      return this;
    }

    /**
     * Set filterEnvironment.
     *
     * @param filterEnvironment Filter by environment. (optional)
     * @return ListActionConnectionsOptionalParameters
     */
    public ListActionConnectionsOptionalParameters filterEnvironment(String filterEnvironment) {
      this.filterEnvironment = filterEnvironment;
      return this;
    }

    /**
     * Set filterConnectionIds.
     *
     * @param filterConnectionIds Filter by connection IDs. (optional)
     * @return ListActionConnectionsOptionalParameters
     */
    public ListActionConnectionsOptionalParameters filterConnectionIds(
        List<String> filterConnectionIds) {
      this.filterConnectionIds = filterConnectionIds;
      return this;
    }

    /**
     * Set filterCreatorIds.
     *
     * @param filterCreatorIds Filter by creator IDs. (optional)
     * @return ListActionConnectionsOptionalParameters
     */
    public ListActionConnectionsOptionalParameters filterCreatorIds(List<String> filterCreatorIds) {
      this.filterCreatorIds = filterCreatorIds;
      return this;
    }

    /**
     * Set filterSearch.
     *
     * @param filterSearch Search string to filter connections. (optional)
     * @return ListActionConnectionsOptionalParameters
     */
    public ListActionConnectionsOptionalParameters filterSearch(String filterSearch) {
      this.filterSearch = filterSearch;
      return this;
    }

    /**
     * Set sort.
     *
     * @param sort Sort parameters. (optional)
     * @return ListActionConnectionsOptionalParameters
     */
    public ListActionConnectionsOptionalParameters sort(List<String> sort) {
      this.sort = sort;
      return this;
    }
  }

  /**
   * List action connections.
   *
   * <p>See {@link #listActionConnectionsWithHttpInfo}.
   *
   * @return ListActionConnectionsResponse
   * @throws ApiException if fails to make API call
   */
  public ListActionConnectionsResponse listActionConnections() throws ApiException {
    return listActionConnectionsWithHttpInfo(new ListActionConnectionsOptionalParameters())
        .getData();
  }

  /**
   * List action connections.
   *
   * <p>See {@link #listActionConnectionsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;ListActionConnectionsResponse&gt;
   */
  public CompletableFuture<ListActionConnectionsResponse> listActionConnectionsAsync() {
    return listActionConnectionsWithHttpInfoAsync(new ListActionConnectionsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List action connections.
   *
   * <p>See {@link #listActionConnectionsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return ListActionConnectionsResponse
   * @throws ApiException if fails to make API call
   */
  public ListActionConnectionsResponse listActionConnections(
      ListActionConnectionsOptionalParameters parameters) throws ApiException {
    return listActionConnectionsWithHttpInfo(parameters).getData();
  }

  /**
   * List action connections.
   *
   * <p>See {@link #listActionConnectionsWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ListActionConnectionsResponse&gt;
   */
  public CompletableFuture<ListActionConnectionsResponse> listActionConnectionsAsync(
      ListActionConnectionsOptionalParameters parameters) {
    return listActionConnectionsWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List all action connections for the organization. This endpoint supports filtering by
   * integration type, tags, environment, and search strings. Pagination is supported using page
   * size and page number parameters.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;ListActionConnectionsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ListActionConnectionsResponse> listActionConnectionsWithHttpInfo(
      ListActionConnectionsOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listActionConnections";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    Long pageSize = parameters.pageSize;
    Long pageNumber = parameters.pageNumber;
    List<String> filterIntegration = parameters.filterIntegration;
    List<String> filterTags = parameters.filterTags;
    String filterEnvironment = parameters.filterEnvironment;
    List<String> filterConnectionIds = parameters.filterConnectionIds;
    List<String> filterCreatorIds = parameters.filterCreatorIds;
    String filterSearch = parameters.filterSearch;
    List<String> sort = parameters.sort;
    // create path and map variables
    String localVarPath = "/api/v2/actions/connections";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("multi", "filter[integration]", filterIntegration));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[tags]", filterTags));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[environment]", filterEnvironment));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("multi", "filter[connection_ids]", filterConnectionIds));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("multi", "filter[creator_ids]", filterCreatorIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[search]", filterSearch));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ActionConnectionApi.listActionConnections",
            localVarPath,
            localVarQueryParams,
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
        new GenericType<ListActionConnectionsResponse>() {});
  }

  /**
   * List action connections.
   *
   * <p>See {@link #listActionConnectionsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;ListActionConnectionsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ListActionConnectionsResponse>>
      listActionConnectionsWithHttpInfoAsync(ListActionConnectionsOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listActionConnections";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ListActionConnectionsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    Long pageSize = parameters.pageSize;
    Long pageNumber = parameters.pageNumber;
    List<String> filterIntegration = parameters.filterIntegration;
    List<String> filterTags = parameters.filterTags;
    String filterEnvironment = parameters.filterEnvironment;
    List<String> filterConnectionIds = parameters.filterConnectionIds;
    List<String> filterCreatorIds = parameters.filterCreatorIds;
    String filterSearch = parameters.filterSearch;
    List<String> sort = parameters.sort;
    // create path and map variables
    String localVarPath = "/api/v2/actions/connections";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("multi", "filter[integration]", filterIntegration));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[tags]", filterTags));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[environment]", filterEnvironment));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("multi", "filter[connection_ids]", filterConnectionIds));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("multi", "filter[creator_ids]", filterCreatorIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[search]", filterSearch));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ActionConnectionApi.listActionConnections",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ListActionConnectionsResponse>> result =
          new CompletableFuture<>();
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
        new GenericType<ListActionConnectionsResponse>() {});
  }

  /** Manage optional parameters to listAppKeyRegistrations. */
  public static class ListAppKeyRegistrationsOptionalParameters {
    private Long pageSize;
    private Long pageNumber;

    /**
     * Set pageSize.
     *
     * @param pageSize The number of App Key Registrations to return per page. (optional)
     * @return ListAppKeyRegistrationsOptionalParameters
     */
    public ListAppKeyRegistrationsOptionalParameters pageSize(Long pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set pageNumber.
     *
     * @param pageNumber The page number to return. (optional)
     * @return ListAppKeyRegistrationsOptionalParameters
     */
    public ListAppKeyRegistrationsOptionalParameters pageNumber(Long pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }
  }

  /**
   * List App Key Registrations.
   *
   * <p>See {@link #listAppKeyRegistrationsWithHttpInfo}.
   *
   * @return ListAppKeyRegistrationsResponse
   * @throws ApiException if fails to make API call
   */
  public ListAppKeyRegistrationsResponse listAppKeyRegistrations() throws ApiException {
    return listAppKeyRegistrationsWithHttpInfo(new ListAppKeyRegistrationsOptionalParameters())
        .getData();
  }

  /**
   * List App Key Registrations.
   *
   * <p>See {@link #listAppKeyRegistrationsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;ListAppKeyRegistrationsResponse&gt;
   */
  public CompletableFuture<ListAppKeyRegistrationsResponse> listAppKeyRegistrationsAsync() {
    return listAppKeyRegistrationsWithHttpInfoAsync(new ListAppKeyRegistrationsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List App Key Registrations.
   *
   * <p>See {@link #listAppKeyRegistrationsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return ListAppKeyRegistrationsResponse
   * @throws ApiException if fails to make API call
   */
  public ListAppKeyRegistrationsResponse listAppKeyRegistrations(
      ListAppKeyRegistrationsOptionalParameters parameters) throws ApiException {
    return listAppKeyRegistrationsWithHttpInfo(parameters).getData();
  }

  /**
   * List App Key Registrations.
   *
   * <p>See {@link #listAppKeyRegistrationsWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ListAppKeyRegistrationsResponse&gt;
   */
  public CompletableFuture<ListAppKeyRegistrationsResponse> listAppKeyRegistrationsAsync(
      ListAppKeyRegistrationsOptionalParameters parameters) {
    return listAppKeyRegistrationsWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List App Key Registrations
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;ListAppKeyRegistrationsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ListAppKeyRegistrationsResponse> listAppKeyRegistrationsWithHttpInfo(
      ListAppKeyRegistrationsOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    Long pageSize = parameters.pageSize;
    Long pageNumber = parameters.pageNumber;
    // create path and map variables
    String localVarPath = "/api/v2/actions/app_key_registrations";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ActionConnectionApi.listAppKeyRegistrations",
            localVarPath,
            localVarQueryParams,
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
        new GenericType<ListAppKeyRegistrationsResponse>() {});
  }

  /**
   * List App Key Registrations.
   *
   * <p>See {@link #listAppKeyRegistrationsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;ListAppKeyRegistrationsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ListAppKeyRegistrationsResponse>>
      listAppKeyRegistrationsWithHttpInfoAsync(
          ListAppKeyRegistrationsOptionalParameters parameters) {
    Object localVarPostBody = null;
    Long pageSize = parameters.pageSize;
    Long pageNumber = parameters.pageNumber;
    // create path and map variables
    String localVarPath = "/api/v2/actions/app_key_registrations";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ActionConnectionApi.listAppKeyRegistrations",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ListAppKeyRegistrationsResponse>> result =
          new CompletableFuture<>();
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
        new GenericType<ListAppKeyRegistrationsResponse>() {});
  }

  /** Manage optional parameters to listConnectionGroups. */
  public static class ListConnectionGroupsOptionalParameters {
    private Long pageSize;
    private Long pageNumber;
    private List<String> filterIntegration;
    private String filterEnvironment;
    private List<String> filterConnectionGroupIds;
    private String filterCreatorId;
    private List<String> filterCreatorIds;
    private String filterSearch;
    private List<String> sort;

    /**
     * Set pageSize.
     *
     * @param pageSize The number of connection groups to return per page. (optional, default to 50)
     * @return ListConnectionGroupsOptionalParameters
     */
    public ListConnectionGroupsOptionalParameters pageSize(Long pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set pageNumber.
     *
     * @param pageNumber The page number to return. (optional, default to 0)
     * @return ListConnectionGroupsOptionalParameters
     */
    public ListConnectionGroupsOptionalParameters pageNumber(Long pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set filterIntegration.
     *
     * @param filterIntegration Filter by integration type. (optional)
     * @return ListConnectionGroupsOptionalParameters
     */
    public ListConnectionGroupsOptionalParameters filterIntegration(
        List<String> filterIntegration) {
      this.filterIntegration = filterIntegration;
      return this;
    }

    /**
     * Set filterEnvironment.
     *
     * @param filterEnvironment Filter by environment. (optional)
     * @return ListConnectionGroupsOptionalParameters
     */
    public ListConnectionGroupsOptionalParameters filterEnvironment(String filterEnvironment) {
      this.filterEnvironment = filterEnvironment;
      return this;
    }

    /**
     * Set filterConnectionGroupIds.
     *
     * @param filterConnectionGroupIds Filter by connection group IDs. (optional)
     * @return ListConnectionGroupsOptionalParameters
     */
    public ListConnectionGroupsOptionalParameters filterConnectionGroupIds(
        List<String> filterConnectionGroupIds) {
      this.filterConnectionGroupIds = filterConnectionGroupIds;
      return this;
    }

    /**
     * Set filterCreatorId.
     *
     * @param filterCreatorId Filter by creator ID. (optional)
     * @return ListConnectionGroupsOptionalParameters
     */
    public ListConnectionGroupsOptionalParameters filterCreatorId(String filterCreatorId) {
      this.filterCreatorId = filterCreatorId;
      return this;
    }

    /**
     * Set filterCreatorIds.
     *
     * @param filterCreatorIds Filter by creator IDs. (optional)
     * @return ListConnectionGroupsOptionalParameters
     */
    public ListConnectionGroupsOptionalParameters filterCreatorIds(List<String> filterCreatorIds) {
      this.filterCreatorIds = filterCreatorIds;
      return this;
    }

    /**
     * Set filterSearch.
     *
     * @param filterSearch Search string to filter connection groups. (optional)
     * @return ListConnectionGroupsOptionalParameters
     */
    public ListConnectionGroupsOptionalParameters filterSearch(String filterSearch) {
      this.filterSearch = filterSearch;
      return this;
    }

    /**
     * Set sort.
     *
     * @param sort Sort parameters. (optional)
     * @return ListConnectionGroupsOptionalParameters
     */
    public ListConnectionGroupsOptionalParameters sort(List<String> sort) {
      this.sort = sort;
      return this;
    }
  }

  /**
   * List connection groups.
   *
   * <p>See {@link #listConnectionGroupsWithHttpInfo}.
   *
   * @return ListConnectionGroupsResponse
   * @throws ApiException if fails to make API call
   */
  public ListConnectionGroupsResponse listConnectionGroups() throws ApiException {
    return listConnectionGroupsWithHttpInfo(new ListConnectionGroupsOptionalParameters()).getData();
  }

  /**
   * List connection groups.
   *
   * <p>See {@link #listConnectionGroupsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;ListConnectionGroupsResponse&gt;
   */
  public CompletableFuture<ListConnectionGroupsResponse> listConnectionGroupsAsync() {
    return listConnectionGroupsWithHttpInfoAsync(new ListConnectionGroupsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List connection groups.
   *
   * <p>See {@link #listConnectionGroupsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return ListConnectionGroupsResponse
   * @throws ApiException if fails to make API call
   */
  public ListConnectionGroupsResponse listConnectionGroups(
      ListConnectionGroupsOptionalParameters parameters) throws ApiException {
    return listConnectionGroupsWithHttpInfo(parameters).getData();
  }

  /**
   * List connection groups.
   *
   * <p>See {@link #listConnectionGroupsWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ListConnectionGroupsResponse&gt;
   */
  public CompletableFuture<ListConnectionGroupsResponse> listConnectionGroupsAsync(
      ListConnectionGroupsOptionalParameters parameters) {
    return listConnectionGroupsWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List all connection groups for the organization. This endpoint supports filtering by
   * integration type, environment, connection group IDs, and search strings. Pagination is
   * supported using page size and page number parameters.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;ListConnectionGroupsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ListConnectionGroupsResponse> listConnectionGroupsWithHttpInfo(
      ListConnectionGroupsOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listConnectionGroups";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    Long pageSize = parameters.pageSize;
    Long pageNumber = parameters.pageNumber;
    List<String> filterIntegration = parameters.filterIntegration;
    String filterEnvironment = parameters.filterEnvironment;
    List<String> filterConnectionGroupIds = parameters.filterConnectionGroupIds;
    String filterCreatorId = parameters.filterCreatorId;
    List<String> filterCreatorIds = parameters.filterCreatorIds;
    String filterSearch = parameters.filterSearch;
    List<String> sort = parameters.sort;
    // create path and map variables
    String localVarPath = "/api/v2/actions/connections/groups";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("multi", "filter[integration]", filterIntegration));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[environment]", filterEnvironment));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs(
            "multi", "filter[connection_group_ids]", filterConnectionGroupIds));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[creator_id]", filterCreatorId));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("multi", "filter[creator_ids]", filterCreatorIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[search]", filterSearch));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ActionConnectionApi.listConnectionGroups",
            localVarPath,
            localVarQueryParams,
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
        new GenericType<ListConnectionGroupsResponse>() {});
  }

  /**
   * List connection groups.
   *
   * <p>See {@link #listConnectionGroupsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;ListConnectionGroupsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ListConnectionGroupsResponse>>
      listConnectionGroupsWithHttpInfoAsync(ListConnectionGroupsOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listConnectionGroups";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ListConnectionGroupsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    Long pageSize = parameters.pageSize;
    Long pageNumber = parameters.pageNumber;
    List<String> filterIntegration = parameters.filterIntegration;
    String filterEnvironment = parameters.filterEnvironment;
    List<String> filterConnectionGroupIds = parameters.filterConnectionGroupIds;
    String filterCreatorId = parameters.filterCreatorId;
    List<String> filterCreatorIds = parameters.filterCreatorIds;
    String filterSearch = parameters.filterSearch;
    List<String> sort = parameters.sort;
    // create path and map variables
    String localVarPath = "/api/v2/actions/connections/groups";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("multi", "filter[integration]", filterIntegration));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[environment]", filterEnvironment));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs(
            "multi", "filter[connection_group_ids]", filterConnectionGroupIds));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[creator_id]", filterCreatorId));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("multi", "filter[creator_ids]", filterCreatorIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[search]", filterSearch));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ActionConnectionApi.listConnectionGroups",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ListConnectionGroupsResponse>> result =
          new CompletableFuture<>();
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
        new GenericType<ListConnectionGroupsResponse>() {});
  }

  /**
   * Register a new App Key.
   *
   * <p>See {@link #registerAppKeyWithHttpInfo}.
   *
   * @param appKeyId The ID of the app key (required)
   * @return RegisterAppKeyResponse
   * @throws ApiException if fails to make API call
   */
  public RegisterAppKeyResponse registerAppKey(String appKeyId) throws ApiException {
    return registerAppKeyWithHttpInfo(appKeyId).getData();
  }

  /**
   * Register a new App Key.
   *
   * <p>See {@link #registerAppKeyWithHttpInfoAsync}.
   *
   * @param appKeyId The ID of the app key (required)
   * @return CompletableFuture&lt;RegisterAppKeyResponse&gt;
   */
  public CompletableFuture<RegisterAppKeyResponse> registerAppKeyAsync(String appKeyId) {
    return registerAppKeyWithHttpInfoAsync(appKeyId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Register a new App Key
   *
   * @param appKeyId The ID of the app key (required)
   * @return ApiResponse&lt;RegisterAppKeyResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<RegisterAppKeyResponse> registerAppKeyWithHttpInfo(String appKeyId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'appKeyId' is set
    if (appKeyId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'appKeyId' when calling registerAppKey");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/actions/app_key_registrations/{app_key_id}"
            .replaceAll("\\{" + "app_key_id" + "\\}", apiClient.escapeString(appKeyId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ActionConnectionApi.registerAppKey",
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
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<RegisterAppKeyResponse>() {});
  }

  /**
   * Register a new App Key.
   *
   * <p>See {@link #registerAppKeyWithHttpInfo}.
   *
   * @param appKeyId The ID of the app key (required)
   * @return CompletableFuture&lt;ApiResponse&lt;RegisterAppKeyResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RegisterAppKeyResponse>> registerAppKeyWithHttpInfoAsync(
      String appKeyId) {
    Object localVarPostBody = null;

    // verify the required parameter 'appKeyId' is set
    if (appKeyId == null) {
      CompletableFuture<ApiResponse<RegisterAppKeyResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'appKeyId' when calling registerAppKey"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/actions/app_key_registrations/{app_key_id}"
            .replaceAll("\\{" + "app_key_id" + "\\}", apiClient.escapeString(appKeyId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ActionConnectionApi.registerAppKey",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RegisterAppKeyResponse>> result = new CompletableFuture<>();
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
        new GenericType<RegisterAppKeyResponse>() {});
  }

  /**
   * Unregister an App Key.
   *
   * <p>See {@link #unregisterAppKeyWithHttpInfo}.
   *
   * @param appKeyId The ID of the app key (required)
   * @throws ApiException if fails to make API call
   */
  public void unregisterAppKey(String appKeyId) throws ApiException {
    unregisterAppKeyWithHttpInfo(appKeyId);
  }

  /**
   * Unregister an App Key.
   *
   * <p>See {@link #unregisterAppKeyWithHttpInfoAsync}.
   *
   * @param appKeyId The ID of the app key (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> unregisterAppKeyAsync(String appKeyId) {
    return unregisterAppKeyWithHttpInfoAsync(appKeyId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Unregister an App Key
   *
   * @param appKeyId The ID of the app key (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> unregisterAppKeyWithHttpInfo(String appKeyId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'appKeyId' is set
    if (appKeyId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'appKeyId' when calling unregisterAppKey");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/actions/app_key_registrations/{app_key_id}"
            .replaceAll("\\{" + "app_key_id" + "\\}", apiClient.escapeString(appKeyId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ActionConnectionApi.unregisterAppKey",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
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
   * Unregister an App Key.
   *
   * <p>See {@link #unregisterAppKeyWithHttpInfo}.
   *
   * @param appKeyId The ID of the app key (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> unregisterAppKeyWithHttpInfoAsync(String appKeyId) {
    Object localVarPostBody = null;

    // verify the required parameter 'appKeyId' is set
    if (appKeyId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'appKeyId' when calling unregisterAppKey"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/actions/app_key_registrations/{app_key_id}"
            .replaceAll("\\{" + "app_key_id" + "\\}", apiClient.escapeString(appKeyId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ActionConnectionApi.unregisterAppKey",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"*/*"},
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
   * Update an existing Action Connection.
   *
   * <p>See {@link #updateActionConnectionWithHttpInfo}.
   *
   * @param connectionId The ID of the action connection (required)
   * @param body Update an existing Action Connection request body (required)
   * @return UpdateActionConnectionResponse
   * @throws ApiException if fails to make API call
   */
  public UpdateActionConnectionResponse updateActionConnection(
      String connectionId, UpdateActionConnectionRequest body) throws ApiException {
    return updateActionConnectionWithHttpInfo(connectionId, body).getData();
  }

  /**
   * Update an existing Action Connection.
   *
   * <p>See {@link #updateActionConnectionWithHttpInfoAsync}.
   *
   * @param connectionId The ID of the action connection (required)
   * @param body Update an existing Action Connection request body (required)
   * @return CompletableFuture&lt;UpdateActionConnectionResponse&gt;
   */
  public CompletableFuture<UpdateActionConnectionResponse> updateActionConnectionAsync(
      String connectionId, UpdateActionConnectionRequest body) {
    return updateActionConnectionWithHttpInfoAsync(connectionId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update an existing Action Connection. This API requires a <a
   * href="https://docs.datadoghq.com/api/latest/action-connection/#register-a-new-app-key">registered
   * application key</a>.
   *
   * @param connectionId The ID of the action connection (required)
   * @param body Update an existing Action Connection request body (required)
   * @return ApiResponse&lt;UpdateActionConnectionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> Successfully updated Action Connection </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too Many Request </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<UpdateActionConnectionResponse> updateActionConnectionWithHttpInfo(
      String connectionId, UpdateActionConnectionRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'connectionId' is set
    if (connectionId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'connectionId' when calling updateActionConnection");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateActionConnection");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/actions/connections/{connection_id}"
            .replaceAll(
                "\\{" + "connection_id" + "\\}", apiClient.escapeString(connectionId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ActionConnectionApi.updateActionConnection",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<UpdateActionConnectionResponse>() {});
  }

  /**
   * Update an existing Action Connection.
   *
   * <p>See {@link #updateActionConnectionWithHttpInfo}.
   *
   * @param connectionId The ID of the action connection (required)
   * @param body Update an existing Action Connection request body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;UpdateActionConnectionResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<UpdateActionConnectionResponse>>
      updateActionConnectionWithHttpInfoAsync(
          String connectionId, UpdateActionConnectionRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'connectionId' is set
    if (connectionId == null) {
      CompletableFuture<ApiResponse<UpdateActionConnectionResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'connectionId' when calling updateActionConnection"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<UpdateActionConnectionResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateActionConnection"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/actions/connections/{connection_id}"
            .replaceAll(
                "\\{" + "connection_id" + "\\}", apiClient.escapeString(connectionId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ActionConnectionApi.updateActionConnection",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<UpdateActionConnectionResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<UpdateActionConnectionResponse>() {});
  }

  /**
   * Update a connection group.
   *
   * <p>See {@link #updateConnectionGroupWithHttpInfo}.
   *
   * @param connectionGroupId The ID of the connection group. (required)
   * @param body (required)
   * @return UpdateConnectionGroupResponse
   * @throws ApiException if fails to make API call
   */
  public UpdateConnectionGroupResponse updateConnectionGroup(
      String connectionGroupId, UpdateConnectionGroupRequest body) throws ApiException {
    return updateConnectionGroupWithHttpInfo(connectionGroupId, body).getData();
  }

  /**
   * Update a connection group.
   *
   * <p>See {@link #updateConnectionGroupWithHttpInfoAsync}.
   *
   * @param connectionGroupId The ID of the connection group. (required)
   * @param body (required)
   * @return CompletableFuture&lt;UpdateConnectionGroupResponse&gt;
   */
  public CompletableFuture<UpdateConnectionGroupResponse> updateConnectionGroupAsync(
      String connectionGroupId, UpdateConnectionGroupRequest body) {
    return updateConnectionGroupWithHttpInfoAsync(connectionGroupId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update an existing connection group by ID. This endpoint allows updating the name, description,
   * tag keys, integration type, connections, and policy attributes of a connection group.
   *
   * @param connectionGroupId The ID of the connection group. (required)
   * @param body (required)
   * @return ApiResponse&lt;UpdateConnectionGroupResponse&gt;
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
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<UpdateConnectionGroupResponse> updateConnectionGroupWithHttpInfo(
      String connectionGroupId, UpdateConnectionGroupRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateConnectionGroup";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'connectionGroupId' is set
    if (connectionGroupId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'connectionGroupId' when calling updateConnectionGroup");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateConnectionGroup");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/actions/connections/groups/{connection_group_id}"
            .replaceAll(
                "\\{" + "connection_group_id" + "\\}",
                apiClient.escapeString(connectionGroupId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ActionConnectionApi.updateConnectionGroup",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<UpdateConnectionGroupResponse>() {});
  }

  /**
   * Update a connection group.
   *
   * <p>See {@link #updateConnectionGroupWithHttpInfo}.
   *
   * @param connectionGroupId The ID of the connection group. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;UpdateConnectionGroupResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<UpdateConnectionGroupResponse>>
      updateConnectionGroupWithHttpInfoAsync(
          String connectionGroupId, UpdateConnectionGroupRequest body) {
    // Check if unstable operation is enabled
    String operationId = "updateConnectionGroup";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<UpdateConnectionGroupResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'connectionGroupId' is set
    if (connectionGroupId == null) {
      CompletableFuture<ApiResponse<UpdateConnectionGroupResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'connectionGroupId' when calling"
                  + " updateConnectionGroup"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<UpdateConnectionGroupResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateConnectionGroup"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/actions/connections/groups/{connection_group_id}"
            .replaceAll(
                "\\{" + "connection_group_id" + "\\}",
                apiClient.escapeString(connectionGroupId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ActionConnectionApi.updateConnectionGroup",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<UpdateConnectionGroupResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<UpdateConnectionGroupResponse>() {});
  }
}
