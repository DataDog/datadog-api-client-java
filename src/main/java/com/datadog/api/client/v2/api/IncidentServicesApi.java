package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.IncidentRelatedObject;
import com.datadog.api.client.v2.model.IncidentServiceCreateRequest;
import com.datadog.api.client.v2.model.IncidentServiceResponse;
import com.datadog.api.client.v2.model.IncidentServiceUpdateRequest;
import com.datadog.api.client.v2.model.IncidentServicesResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentServicesApi {
  private ApiClient apiClient;

  public IncidentServicesApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public IncidentServicesApi(ApiClient apiClient) {
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
   * Create a new incident service.
   *
   * <p>See {@link #createIncidentServiceWithHttpInfo}.
   *
   * @param body Incident Service Payload. (required)
   * @return IncidentServiceResponse
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public IncidentServiceResponse createIncidentService(IncidentServiceCreateRequest body)
      throws ApiException {
    return createIncidentServiceWithHttpInfo(body).getData();
  }

  /**
   * Create a new incident service.
   *
   * <p>See {@link #createIncidentServiceWithHttpInfoAsync}.
   *
   * @param body Incident Service Payload. (required)
   * @return CompletableFuture&lt;IncidentServiceResponse&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<IncidentServiceResponse> createIncidentServiceAsync(
      IncidentServiceCreateRequest body) {
    return createIncidentServiceWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Creates a new incident service.
   *
   * @param body Incident Service Payload. (required)
   * @return ApiResponse&lt;IncidentServiceResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> CREATED </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   *
   * @deprecated
   */
  @Deprecated
  public ApiResponse<IncidentServiceResponse> createIncidentServiceWithHttpInfo(
      IncidentServiceCreateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createIncidentService";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createIncidentService");
    }
    // create path and map variables
    String localVarPath = "/api/v2/services";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentServicesApi.createIncidentService",
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
        new GenericType<IncidentServiceResponse>() {});
  }

  /**
   * Create a new incident service.
   *
   * <p>See {@link #createIncidentServiceWithHttpInfo}.
   *
   * @param body Incident Service Payload. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentServiceResponse&gt;&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<ApiResponse<IncidentServiceResponse>>
      createIncidentServiceWithHttpInfoAsync(IncidentServiceCreateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createIncidentService";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentServiceResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<IncidentServiceResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createIncidentService"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/services";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentServicesApi.createIncidentService",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentServiceResponse>> result = new CompletableFuture<>();
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
        new GenericType<IncidentServiceResponse>() {});
  }

  /**
   * Delete an existing incident service.
   *
   * <p>See {@link #deleteIncidentServiceWithHttpInfo}.
   *
   * @param serviceId The ID of the incident service. (required)
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public void deleteIncidentService(String serviceId) throws ApiException {
    deleteIncidentServiceWithHttpInfo(serviceId);
  }

  /**
   * Delete an existing incident service.
   *
   * <p>See {@link #deleteIncidentServiceWithHttpInfoAsync}.
   *
   * @param serviceId The ID of the incident service. (required)
   * @return CompletableFuture
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<Void> deleteIncidentServiceAsync(String serviceId) {
    return deleteIncidentServiceWithHttpInfoAsync(serviceId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Deletes an existing incident service.
   *
   * @param serviceId The ID of the incident service. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   *
   * @deprecated
   */
  @Deprecated
  public ApiResponse<Void> deleteIncidentServiceWithHttpInfo(String serviceId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteIncidentService";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'serviceId' is set
    if (serviceId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'serviceId' when calling deleteIncidentService");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/services/{service_id}"
            .replaceAll("\\{" + "service_id" + "\\}", apiClient.escapeString(serviceId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentServicesApi.deleteIncidentService",
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
   * Delete an existing incident service.
   *
   * <p>See {@link #deleteIncidentServiceWithHttpInfo}.
   *
   * @param serviceId The ID of the incident service. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<ApiResponse<Void>> deleteIncidentServiceWithHttpInfoAsync(
      String serviceId) {
    // Check if unstable operation is enabled
    String operationId = "deleteIncidentService";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'serviceId' is set
    if (serviceId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'serviceId' when calling deleteIncidentService"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/services/{service_id}"
            .replaceAll("\\{" + "service_id" + "\\}", apiClient.escapeString(serviceId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentServicesApi.deleteIncidentService",
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

  /** Manage optional parameters to getIncidentService. */
  public static class GetIncidentServiceOptionalParameters {
    private IncidentRelatedObject include;

    /**
     * Set include.
     *
     * @param include Specifies which types of related objects should be included in the response.
     *     (optional)
     * @return GetIncidentServiceOptionalParameters
     */
    public GetIncidentServiceOptionalParameters include(IncidentRelatedObject include) {
      this.include = include;
      return this;
    }
  }

  /**
   * Get details of an incident service.
   *
   * <p>See {@link #getIncidentServiceWithHttpInfo}.
   *
   * @param serviceId The ID of the incident service. (required)
   * @return IncidentServiceResponse
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public IncidentServiceResponse getIncidentService(String serviceId) throws ApiException {
    return getIncidentServiceWithHttpInfo(serviceId, new GetIncidentServiceOptionalParameters())
        .getData();
  }

  /**
   * Get details of an incident service.
   *
   * <p>See {@link #getIncidentServiceWithHttpInfoAsync}.
   *
   * @param serviceId The ID of the incident service. (required)
   * @return CompletableFuture&lt;IncidentServiceResponse&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<IncidentServiceResponse> getIncidentServiceAsync(String serviceId) {
    return getIncidentServiceWithHttpInfoAsync(
            serviceId, new GetIncidentServiceOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get details of an incident service.
   *
   * <p>See {@link #getIncidentServiceWithHttpInfo}.
   *
   * @param serviceId The ID of the incident service. (required)
   * @param parameters Optional parameters for the request.
   * @return IncidentServiceResponse
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public IncidentServiceResponse getIncidentService(
      String serviceId, GetIncidentServiceOptionalParameters parameters) throws ApiException {
    return getIncidentServiceWithHttpInfo(serviceId, parameters).getData();
  }

  /**
   * Get details of an incident service.
   *
   * <p>See {@link #getIncidentServiceWithHttpInfoAsync}.
   *
   * @param serviceId The ID of the incident service. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;IncidentServiceResponse&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<IncidentServiceResponse> getIncidentServiceAsync(
      String serviceId, GetIncidentServiceOptionalParameters parameters) {
    return getIncidentServiceWithHttpInfoAsync(serviceId, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get details of an incident service. If the <code>include[users]</code> query parameter is
   * provided, the included attribute will contain the users related to these incident services.
   *
   * @param serviceId The ID of the incident service. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;IncidentServiceResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   *
   * @deprecated
   */
  @Deprecated
  public ApiResponse<IncidentServiceResponse> getIncidentServiceWithHttpInfo(
      String serviceId, GetIncidentServiceOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getIncidentService";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'serviceId' is set
    if (serviceId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'serviceId' when calling getIncidentService");
    }
    IncidentRelatedObject include = parameters.include;
    // create path and map variables
    String localVarPath =
        "/api/v2/services/{service_id}"
            .replaceAll("\\{" + "service_id" + "\\}", apiClient.escapeString(serviceId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentServicesApi.getIncidentService",
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
        new GenericType<IncidentServiceResponse>() {});
  }

  /**
   * Get details of an incident service.
   *
   * <p>See {@link #getIncidentServiceWithHttpInfo}.
   *
   * @param serviceId The ID of the incident service. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentServiceResponse&gt;&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<ApiResponse<IncidentServiceResponse>>
      getIncidentServiceWithHttpInfoAsync(
          String serviceId, GetIncidentServiceOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "getIncidentService";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentServiceResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'serviceId' is set
    if (serviceId == null) {
      CompletableFuture<ApiResponse<IncidentServiceResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'serviceId' when calling getIncidentService"));
      return result;
    }
    IncidentRelatedObject include = parameters.include;
    // create path and map variables
    String localVarPath =
        "/api/v2/services/{service_id}"
            .replaceAll("\\{" + "service_id" + "\\}", apiClient.escapeString(serviceId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentServicesApi.getIncidentService",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentServiceResponse>> result = new CompletableFuture<>();
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
        new GenericType<IncidentServiceResponse>() {});
  }

  /** Manage optional parameters to listIncidentServices. */
  public static class ListIncidentServicesOptionalParameters {
    private IncidentRelatedObject include;
    private Long pageSize;
    private Long pageOffset;
    private String filter;

    /**
     * Set include.
     *
     * @param include Specifies which types of related objects should be included in the response.
     *     (optional)
     * @return ListIncidentServicesOptionalParameters
     */
    public ListIncidentServicesOptionalParameters include(IncidentRelatedObject include) {
      this.include = include;
      return this;
    }

    /**
     * Set pageSize.
     *
     * @param pageSize Size for a given page. The maximum allowed value is 100. (optional, default
     *     to 10)
     * @return ListIncidentServicesOptionalParameters
     */
    public ListIncidentServicesOptionalParameters pageSize(Long pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set pageOffset.
     *
     * @param pageOffset Specific offset to use as the beginning of the returned page. (optional,
     *     default to 0)
     * @return ListIncidentServicesOptionalParameters
     */
    public ListIncidentServicesOptionalParameters pageOffset(Long pageOffset) {
      this.pageOffset = pageOffset;
      return this;
    }

    /**
     * Set filter.
     *
     * @param filter A search query that filters services by name. (optional)
     * @return ListIncidentServicesOptionalParameters
     */
    public ListIncidentServicesOptionalParameters filter(String filter) {
      this.filter = filter;
      return this;
    }
  }

  /**
   * Get a list of all incident services.
   *
   * <p>See {@link #listIncidentServicesWithHttpInfo}.
   *
   * @return IncidentServicesResponse
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public IncidentServicesResponse listIncidentServices() throws ApiException {
    return listIncidentServicesWithHttpInfo(new ListIncidentServicesOptionalParameters()).getData();
  }

  /**
   * Get a list of all incident services.
   *
   * <p>See {@link #listIncidentServicesWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;IncidentServicesResponse&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<IncidentServicesResponse> listIncidentServicesAsync() {
    return listIncidentServicesWithHttpInfoAsync(new ListIncidentServicesOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a list of all incident services.
   *
   * <p>See {@link #listIncidentServicesWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return IncidentServicesResponse
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public IncidentServicesResponse listIncidentServices(
      ListIncidentServicesOptionalParameters parameters) throws ApiException {
    return listIncidentServicesWithHttpInfo(parameters).getData();
  }

  /**
   * Get a list of all incident services.
   *
   * <p>See {@link #listIncidentServicesWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;IncidentServicesResponse&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<IncidentServicesResponse> listIncidentServicesAsync(
      ListIncidentServicesOptionalParameters parameters) {
    return listIncidentServicesWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get all incident services uploaded for the requesting user's organization. If the <code>
   * include[users]</code> query parameter is provided, the included attribute will contain the
   * users related to these incident services.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;IncidentServicesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   *
   * @deprecated
   */
  @Deprecated
  public ApiResponse<IncidentServicesResponse> listIncidentServicesWithHttpInfo(
      ListIncidentServicesOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listIncidentServices";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    IncidentRelatedObject include = parameters.include;
    Long pageSize = parameters.pageSize;
    Long pageOffset = parameters.pageOffset;
    String filter = parameters.filter;
    // create path and map variables
    String localVarPath = "/api/v2/services";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[offset]", pageOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentServicesApi.listIncidentServices",
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
        new GenericType<IncidentServicesResponse>() {});
  }

  /**
   * Get a list of all incident services.
   *
   * <p>See {@link #listIncidentServicesWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentServicesResponse&gt;&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<ApiResponse<IncidentServicesResponse>>
      listIncidentServicesWithHttpInfoAsync(ListIncidentServicesOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listIncidentServices";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentServicesResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    IncidentRelatedObject include = parameters.include;
    Long pageSize = parameters.pageSize;
    Long pageOffset = parameters.pageOffset;
    String filter = parameters.filter;
    // create path and map variables
    String localVarPath = "/api/v2/services";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[offset]", pageOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentServicesApi.listIncidentServices",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentServicesResponse>> result = new CompletableFuture<>();
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
        new GenericType<IncidentServicesResponse>() {});
  }

  /**
   * Update an existing incident service.
   *
   * <p>See {@link #updateIncidentServiceWithHttpInfo}.
   *
   * @param serviceId The ID of the incident service. (required)
   * @param body Incident Service Payload. (required)
   * @return IncidentServiceResponse
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public IncidentServiceResponse updateIncidentService(
      String serviceId, IncidentServiceUpdateRequest body) throws ApiException {
    return updateIncidentServiceWithHttpInfo(serviceId, body).getData();
  }

  /**
   * Update an existing incident service.
   *
   * <p>See {@link #updateIncidentServiceWithHttpInfoAsync}.
   *
   * @param serviceId The ID of the incident service. (required)
   * @param body Incident Service Payload. (required)
   * @return CompletableFuture&lt;IncidentServiceResponse&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<IncidentServiceResponse> updateIncidentServiceAsync(
      String serviceId, IncidentServiceUpdateRequest body) {
    return updateIncidentServiceWithHttpInfoAsync(serviceId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Updates an existing incident service. Only provide the attributes which should be updated as
   * this request is a partial update.
   *
   * @param serviceId The ID of the incident service. (required)
   * @param body Incident Service Payload. (required)
   * @return ApiResponse&lt;IncidentServiceResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   *
   * @deprecated
   */
  @Deprecated
  public ApiResponse<IncidentServiceResponse> updateIncidentServiceWithHttpInfo(
      String serviceId, IncidentServiceUpdateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateIncidentService";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'serviceId' is set
    if (serviceId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'serviceId' when calling updateIncidentService");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateIncidentService");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/services/{service_id}"
            .replaceAll("\\{" + "service_id" + "\\}", apiClient.escapeString(serviceId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentServicesApi.updateIncidentService",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<IncidentServiceResponse>() {});
  }

  /**
   * Update an existing incident service.
   *
   * <p>See {@link #updateIncidentServiceWithHttpInfo}.
   *
   * @param serviceId The ID of the incident service. (required)
   * @param body Incident Service Payload. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentServiceResponse&gt;&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<ApiResponse<IncidentServiceResponse>>
      updateIncidentServiceWithHttpInfoAsync(String serviceId, IncidentServiceUpdateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "updateIncidentService";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentServiceResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'serviceId' is set
    if (serviceId == null) {
      CompletableFuture<ApiResponse<IncidentServiceResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'serviceId' when calling updateIncidentService"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<IncidentServiceResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateIncidentService"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/services/{service_id}"
            .replaceAll("\\{" + "service_id" + "\\}", apiClient.escapeString(serviceId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentServicesApi.updateIncidentService",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentServiceResponse>> result = new CompletableFuture<>();
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
        new GenericType<IncidentServiceResponse>() {});
  }
}
