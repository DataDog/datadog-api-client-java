package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.PaginationIterable;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.ServiceDefinitionCreateResponse;
import com.datadog.api.client.v2.model.ServiceDefinitionData;
import com.datadog.api.client.v2.model.ServiceDefinitionGetResponse;
import com.datadog.api.client.v2.model.ServiceDefinitionSchemaVersions;
import com.datadog.api.client.v2.model.ServiceDefinitionsCreateRequest;
import com.datadog.api.client.v2.model.ServiceDefinitionsListResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ServiceDefinitionApi {
  private ApiClient apiClient;

  public ServiceDefinitionApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public ServiceDefinitionApi(ApiClient apiClient) {
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
   * Create or update service definition.
   *
   * <p>See {@link #createOrUpdateServiceDefinitionsWithHttpInfo}.
   *
   * @param body Service Definition YAML/JSON. (required)
   * @return ServiceDefinitionCreateResponse
   * @throws ApiException if fails to make API call
   */
  public ServiceDefinitionCreateResponse createOrUpdateServiceDefinitions(
      ServiceDefinitionsCreateRequest body) throws ApiException {
    return createOrUpdateServiceDefinitionsWithHttpInfo(body).getData();
  }

  /**
   * Create or update service definition.
   *
   * <p>See {@link #createOrUpdateServiceDefinitionsWithHttpInfoAsync}.
   *
   * @param body Service Definition YAML/JSON. (required)
   * @return CompletableFuture&lt;ServiceDefinitionCreateResponse&gt;
   */
  public CompletableFuture<ServiceDefinitionCreateResponse> createOrUpdateServiceDefinitionsAsync(
      ServiceDefinitionsCreateRequest body) {
    return createOrUpdateServiceDefinitionsWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create or update service definition in the Datadog Service Catalog.
   *
   * @param body Service Definition YAML/JSON. (required)
   * @return ApiResponse&lt;ServiceDefinitionCreateResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> CREATED </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ServiceDefinitionCreateResponse> createOrUpdateServiceDefinitionsWithHttpInfo(
      ServiceDefinitionsCreateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'body' when calling createOrUpdateServiceDefinitions");
    }
    // create path and map variables
    String localVarPath = "/api/v2/services/definitions";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ServiceDefinitionApi.createOrUpdateServiceDefinitions",
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
        new GenericType<ServiceDefinitionCreateResponse>() {});
  }

  /**
   * Create or update service definition.
   *
   * <p>See {@link #createOrUpdateServiceDefinitionsWithHttpInfo}.
   *
   * @param body Service Definition YAML/JSON. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ServiceDefinitionCreateResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ServiceDefinitionCreateResponse>>
      createOrUpdateServiceDefinitionsWithHttpInfoAsync(ServiceDefinitionsCreateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<ServiceDefinitionCreateResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " createOrUpdateServiceDefinitions"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/services/definitions";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ServiceDefinitionApi.createOrUpdateServiceDefinitions",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ServiceDefinitionCreateResponse>> result =
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
        new GenericType<ServiceDefinitionCreateResponse>() {});
  }

  /**
   * Delete a single service definition.
   *
   * <p>See {@link #deleteServiceDefinitionWithHttpInfo}.
   *
   * @param serviceName The name of the service. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteServiceDefinition(String serviceName) throws ApiException {
    deleteServiceDefinitionWithHttpInfo(serviceName);
  }

  /**
   * Delete a single service definition.
   *
   * <p>See {@link #deleteServiceDefinitionWithHttpInfoAsync}.
   *
   * @param serviceName The name of the service. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteServiceDefinitionAsync(String serviceName) {
    return deleteServiceDefinitionWithHttpInfoAsync(serviceName)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete a single service definition in the Datadog Service Catalog.
   *
   * @param serviceName The name of the service. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteServiceDefinitionWithHttpInfo(String serviceName)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'serviceName' is set
    if (serviceName == null) {
      throw new ApiException(
          400, "Missing the required parameter 'serviceName' when calling deleteServiceDefinition");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/services/definitions/{service_name}"
            .replaceAll(
                "\\{" + "service_name" + "\\}", apiClient.escapeString(serviceName.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ServiceDefinitionApi.deleteServiceDefinition",
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
   * Delete a single service definition.
   *
   * <p>See {@link #deleteServiceDefinitionWithHttpInfo}.
   *
   * @param serviceName The name of the service. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteServiceDefinitionWithHttpInfoAsync(
      String serviceName) {
    Object localVarPostBody = null;

    // verify the required parameter 'serviceName' is set
    if (serviceName == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'serviceName' when calling deleteServiceDefinition"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/services/definitions/{service_name}"
            .replaceAll(
                "\\{" + "service_name" + "\\}", apiClient.escapeString(serviceName.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ServiceDefinitionApi.deleteServiceDefinition",
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

  /** Manage optional parameters to getServiceDefinition. */
  public static class GetServiceDefinitionOptionalParameters {
    private ServiceDefinitionSchemaVersions schemaVersion;

    /**
     * Set schemaVersion.
     *
     * @param schemaVersion The schema version desired in the response. (optional)
     * @return GetServiceDefinitionOptionalParameters
     */
    public GetServiceDefinitionOptionalParameters schemaVersion(
        ServiceDefinitionSchemaVersions schemaVersion) {
      this.schemaVersion = schemaVersion;
      return this;
    }
  }

  /**
   * Get a single service definition.
   *
   * <p>See {@link #getServiceDefinitionWithHttpInfo}.
   *
   * @param serviceName The name of the service. (required)
   * @return ServiceDefinitionGetResponse
   * @throws ApiException if fails to make API call
   */
  public ServiceDefinitionGetResponse getServiceDefinition(String serviceName) throws ApiException {
    return getServiceDefinitionWithHttpInfo(
            serviceName, new GetServiceDefinitionOptionalParameters())
        .getData();
  }

  /**
   * Get a single service definition.
   *
   * <p>See {@link #getServiceDefinitionWithHttpInfoAsync}.
   *
   * @param serviceName The name of the service. (required)
   * @return CompletableFuture&lt;ServiceDefinitionGetResponse&gt;
   */
  public CompletableFuture<ServiceDefinitionGetResponse> getServiceDefinitionAsync(
      String serviceName) {
    return getServiceDefinitionWithHttpInfoAsync(
            serviceName, new GetServiceDefinitionOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a single service definition.
   *
   * <p>See {@link #getServiceDefinitionWithHttpInfo}.
   *
   * @param serviceName The name of the service. (required)
   * @param parameters Optional parameters for the request.
   * @return ServiceDefinitionGetResponse
   * @throws ApiException if fails to make API call
   */
  public ServiceDefinitionGetResponse getServiceDefinition(
      String serviceName, GetServiceDefinitionOptionalParameters parameters) throws ApiException {
    return getServiceDefinitionWithHttpInfo(serviceName, parameters).getData();
  }

  /**
   * Get a single service definition.
   *
   * <p>See {@link #getServiceDefinitionWithHttpInfoAsync}.
   *
   * @param serviceName The name of the service. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ServiceDefinitionGetResponse&gt;
   */
  public CompletableFuture<ServiceDefinitionGetResponse> getServiceDefinitionAsync(
      String serviceName, GetServiceDefinitionOptionalParameters parameters) {
    return getServiceDefinitionWithHttpInfoAsync(serviceName, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a single service definition from the Datadog Service Catalog.
   *
   * @param serviceName The name of the service. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;ServiceDefinitionGetResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ServiceDefinitionGetResponse> getServiceDefinitionWithHttpInfo(
      String serviceName, GetServiceDefinitionOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'serviceName' is set
    if (serviceName == null) {
      throw new ApiException(
          400, "Missing the required parameter 'serviceName' when calling getServiceDefinition");
    }
    ServiceDefinitionSchemaVersions schemaVersion = parameters.schemaVersion;
    // create path and map variables
    String localVarPath =
        "/api/v2/services/definitions/{service_name}"
            .replaceAll(
                "\\{" + "service_name" + "\\}", apiClient.escapeString(serviceName.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "schema_version", schemaVersion));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ServiceDefinitionApi.getServiceDefinition",
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
        new GenericType<ServiceDefinitionGetResponse>() {});
  }

  /**
   * Get a single service definition.
   *
   * <p>See {@link #getServiceDefinitionWithHttpInfo}.
   *
   * @param serviceName The name of the service. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;ServiceDefinitionGetResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ServiceDefinitionGetResponse>>
      getServiceDefinitionWithHttpInfoAsync(
          String serviceName, GetServiceDefinitionOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'serviceName' is set
    if (serviceName == null) {
      CompletableFuture<ApiResponse<ServiceDefinitionGetResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'serviceName' when calling getServiceDefinition"));
      return result;
    }
    ServiceDefinitionSchemaVersions schemaVersion = parameters.schemaVersion;
    // create path and map variables
    String localVarPath =
        "/api/v2/services/definitions/{service_name}"
            .replaceAll(
                "\\{" + "service_name" + "\\}", apiClient.escapeString(serviceName.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "schema_version", schemaVersion));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ServiceDefinitionApi.getServiceDefinition",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ServiceDefinitionGetResponse>> result =
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
        new GenericType<ServiceDefinitionGetResponse>() {});
  }

  /** Manage optional parameters to listServiceDefinitions. */
  public static class ListServiceDefinitionsOptionalParameters {
    private Long pageSize;
    private Long pageNumber;
    private ServiceDefinitionSchemaVersions schemaVersion;

    /**
     * Set pageSize.
     *
     * @param pageSize Size for a given page. The maximum allowed value is 100. (optional, default
     *     to 10)
     * @return ListServiceDefinitionsOptionalParameters
     */
    public ListServiceDefinitionsOptionalParameters pageSize(Long pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set pageNumber.
     *
     * @param pageNumber Specific page number to return. (optional, default to 0)
     * @return ListServiceDefinitionsOptionalParameters
     */
    public ListServiceDefinitionsOptionalParameters pageNumber(Long pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set schemaVersion.
     *
     * @param schemaVersion The schema version desired in the response. (optional)
     * @return ListServiceDefinitionsOptionalParameters
     */
    public ListServiceDefinitionsOptionalParameters schemaVersion(
        ServiceDefinitionSchemaVersions schemaVersion) {
      this.schemaVersion = schemaVersion;
      return this;
    }
  }

  /**
   * Get all service definitions.
   *
   * <p>See {@link #listServiceDefinitionsWithHttpInfo}.
   *
   * @return ServiceDefinitionsListResponse
   * @throws ApiException if fails to make API call
   */
  public ServiceDefinitionsListResponse listServiceDefinitions() throws ApiException {
    return listServiceDefinitionsWithHttpInfo(new ListServiceDefinitionsOptionalParameters())
        .getData();
  }

  /**
   * Get all service definitions.
   *
   * <p>See {@link #listServiceDefinitionsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;ServiceDefinitionsListResponse&gt;
   */
  public CompletableFuture<ServiceDefinitionsListResponse> listServiceDefinitionsAsync() {
    return listServiceDefinitionsWithHttpInfoAsync(new ListServiceDefinitionsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get all service definitions.
   *
   * <p>See {@link #listServiceDefinitionsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return ServiceDefinitionsListResponse
   * @throws ApiException if fails to make API call
   */
  public ServiceDefinitionsListResponse listServiceDefinitions(
      ListServiceDefinitionsOptionalParameters parameters) throws ApiException {
    return listServiceDefinitionsWithHttpInfo(parameters).getData();
  }

  /**
   * Get all service definitions.
   *
   * <p>See {@link #listServiceDefinitionsWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ServiceDefinitionsListResponse&gt;
   */
  public CompletableFuture<ServiceDefinitionsListResponse> listServiceDefinitionsAsync(
      ListServiceDefinitionsOptionalParameters parameters) {
    return listServiceDefinitionsWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get all service definitions.
   *
   * <p>See {@link #listServiceDefinitionsWithHttpInfo}.
   *
   * @return PaginationIterable&lt;ServiceDefinitionData&gt;
   */
  public PaginationIterable<ServiceDefinitionData> listServiceDefinitionsWithPagination() {
    ListServiceDefinitionsOptionalParameters parameters =
        new ListServiceDefinitionsOptionalParameters();
    return listServiceDefinitionsWithPagination(parameters);
  }

  /**
   * Get all service definitions.
   *
   * <p>See {@link #listServiceDefinitionsWithHttpInfo}.
   *
   * @return ServiceDefinitionsListResponse
   */
  public PaginationIterable<ServiceDefinitionData> listServiceDefinitionsWithPagination(
      ListServiceDefinitionsOptionalParameters parameters) {
    String resultsPath = "getData";
    String valueGetterPath = "";
    String valueSetterPath = "pageNumber";
    Boolean valueSetterParamOptional = true;
    parameters.pageNumber(0l);
    Long limit;

    if (parameters.pageSize == null) {
      limit = 10l;
      parameters.pageSize(limit);
    } else {
      limit = parameters.pageSize;
    }

    LinkedHashMap<String, Object> args = new LinkedHashMap<String, Object>();
    args.put("optionalParams", parameters);

    PaginationIterable iterator =
        new PaginationIterable(
            this,
            "listServiceDefinitions",
            resultsPath,
            valueGetterPath,
            valueSetterPath,
            valueSetterParamOptional,
            false,
            limit,
            args);

    return iterator;
  }

  /**
   * Get a list of all service definitions from the Datadog Service Catalog.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;ServiceDefinitionsListResponse&gt;
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
  public ApiResponse<ServiceDefinitionsListResponse> listServiceDefinitionsWithHttpInfo(
      ListServiceDefinitionsOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    Long pageSize = parameters.pageSize;
    Long pageNumber = parameters.pageNumber;
    ServiceDefinitionSchemaVersions schemaVersion = parameters.schemaVersion;
    // create path and map variables
    String localVarPath = "/api/v2/services/definitions";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "schema_version", schemaVersion));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ServiceDefinitionApi.listServiceDefinitions",
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
        new GenericType<ServiceDefinitionsListResponse>() {});
  }

  /**
   * Get all service definitions.
   *
   * <p>See {@link #listServiceDefinitionsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;ServiceDefinitionsListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ServiceDefinitionsListResponse>>
      listServiceDefinitionsWithHttpInfoAsync(ListServiceDefinitionsOptionalParameters parameters) {
    Object localVarPostBody = null;
    Long pageSize = parameters.pageSize;
    Long pageNumber = parameters.pageNumber;
    ServiceDefinitionSchemaVersions schemaVersion = parameters.schemaVersion;
    // create path and map variables
    String localVarPath = "/api/v2/services/definitions";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "schema_version", schemaVersion));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ServiceDefinitionApi.listServiceDefinitions",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ServiceDefinitionsListResponse>> result =
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
        new GenericType<ServiceDefinitionsListResponse>() {});
  }
}
