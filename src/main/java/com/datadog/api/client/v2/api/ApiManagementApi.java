package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.CreateOpenAPIResponse;
import com.datadog.api.client.v2.model.ListAPIsResponse;
import com.datadog.api.client.v2.model.UpdateOpenAPIResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ApiManagementApi {
  private ApiClient apiClient;

  public ApiManagementApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public ApiManagementApi(ApiClient apiClient) {
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

  /** Manage optional parameters to createOpenAPI. */
  public static class CreateOpenAPIOptionalParameters {
    private File openapiSpecFile;

    /**
     * Set openapiSpecFile.
     *
     * @param openapiSpecFile Binary <code>OpenAPI</code> spec file (optional)
     * @return CreateOpenAPIOptionalParameters
     */
    public CreateOpenAPIOptionalParameters openapiSpecFile(File openapiSpecFile) {
      this.openapiSpecFile = openapiSpecFile;
      return this;
    }
  }

  /**
   * Create a new API.
   *
   * <p>See {@link #createOpenAPIWithHttpInfo}.
   *
   * @return CreateOpenAPIResponse
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public CreateOpenAPIResponse createOpenAPI() throws ApiException {
    return createOpenAPIWithHttpInfo(new CreateOpenAPIOptionalParameters()).getData();
  }

  /**
   * Create a new API.
   *
   * <p>See {@link #createOpenAPIWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;CreateOpenAPIResponse&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<CreateOpenAPIResponse> createOpenAPIAsync() {
    return createOpenAPIWithHttpInfoAsync(new CreateOpenAPIOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a new API.
   *
   * <p>See {@link #createOpenAPIWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CreateOpenAPIResponse
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public CreateOpenAPIResponse createOpenAPI(CreateOpenAPIOptionalParameters parameters)
      throws ApiException {
    return createOpenAPIWithHttpInfo(parameters).getData();
  }

  /**
   * Create a new API.
   *
   * <p>See {@link #createOpenAPIWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;CreateOpenAPIResponse&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<CreateOpenAPIResponse> createOpenAPIAsync(
      CreateOpenAPIOptionalParameters parameters) {
    return createOpenAPIWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a new API from the <a href="https://spec.openapis.org/oas/latest.html">OpenAPI</a>
   * specification given. See the <a href="https://docs.datadoghq.com/api_catalog/add_metadata/">API
   * Catalog documentation</a> for additional information about the possible metadata. It returns
   * the created API ID.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;CreateOpenAPIResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> API created successfully </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   *
   * @deprecated
   */
  @Deprecated
  public ApiResponse<CreateOpenAPIResponse> createOpenAPIWithHttpInfo(
      CreateOpenAPIOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createOpenAPI";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    File openapiSpecFile = parameters.openapiSpecFile;
    // create path and map variables
    String localVarPath = "/api/v2/apicatalog/openapi";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    if (openapiSpecFile != null) {
      localVarFormParams.put("openapi_spec_file", openapiSpecFile);
    }

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ApiManagementApi.createOpenAPI",
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
        new String[] {"multipart/form-data"},
        localVarPostBody,
        localVarFormParams,
        false,
        new GenericType<CreateOpenAPIResponse>() {});
  }

  /**
   * Create a new API.
   *
   * <p>See {@link #createOpenAPIWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;CreateOpenAPIResponse&gt;&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<ApiResponse<CreateOpenAPIResponse>> createOpenAPIWithHttpInfoAsync(
      CreateOpenAPIOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "createOpenAPI";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<CreateOpenAPIResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    File openapiSpecFile = parameters.openapiSpecFile;
    // create path and map variables
    String localVarPath = "/api/v2/apicatalog/openapi";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    if (openapiSpecFile != null) {
      localVarFormParams.put("openapi_spec_file", openapiSpecFile);
    }

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ApiManagementApi.createOpenAPI",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CreateOpenAPIResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"multipart/form-data"},
        localVarPostBody,
        localVarFormParams,
        false,
        new GenericType<CreateOpenAPIResponse>() {});
  }

  /**
   * Delete an API.
   *
   * <p>See {@link #deleteOpenAPIWithHttpInfo}.
   *
   * @param id ID of the API to delete (required)
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public void deleteOpenAPI(UUID id) throws ApiException {
    deleteOpenAPIWithHttpInfo(id);
  }

  /**
   * Delete an API.
   *
   * <p>See {@link #deleteOpenAPIWithHttpInfoAsync}.
   *
   * @param id ID of the API to delete (required)
   * @return CompletableFuture
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<Void> deleteOpenAPIAsync(UUID id) {
    return deleteOpenAPIWithHttpInfoAsync(id)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete a specific API by ID.
   *
   * @param id ID of the API to delete (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> API deleted successfully </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> API not found error </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   *
   * @deprecated
   */
  @Deprecated
  public ApiResponse<Void> deleteOpenAPIWithHttpInfo(UUID id) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteOpenAPI";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteOpenAPI");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/apicatalog/api/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ApiManagementApi.deleteOpenAPI",
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
   * Delete an API.
   *
   * <p>See {@link #deleteOpenAPIWithHttpInfo}.
   *
   * @param id ID of the API to delete (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<ApiResponse<Void>> deleteOpenAPIWithHttpInfoAsync(UUID id) {
    // Check if unstable operation is enabled
    String operationId = "deleteOpenAPI";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'id' when calling deleteOpenAPI"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/apicatalog/api/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ApiManagementApi.deleteOpenAPI",
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
   * Get an API.
   *
   * <p>See {@link #getOpenAPIWithHttpInfo}.
   *
   * @param id ID of the API to retrieve (required)
   * @return File
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public File getOpenAPI(UUID id) throws ApiException {
    return getOpenAPIWithHttpInfo(id).getData();
  }

  /**
   * Get an API.
   *
   * <p>See {@link #getOpenAPIWithHttpInfoAsync}.
   *
   * @param id ID of the API to retrieve (required)
   * @return CompletableFuture&lt;File&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<File> getOpenAPIAsync(UUID id) {
    return getOpenAPIWithHttpInfoAsync(id)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Retrieve information about a specific API in <a
   * href="https://spec.openapis.org/oas/latest.html">OpenAPI</a> format file.
   *
   * @param id ID of the API to retrieve (required)
   * @return ApiResponse&lt;File&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> API not found error </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   *
   * @deprecated
   */
  @Deprecated
  public ApiResponse<File> getOpenAPIWithHttpInfo(UUID id) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getOpenAPI";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getOpenAPI");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/apicatalog/api/{id}/openapi"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ApiManagementApi.getOpenAPI",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"multipart/form-data", "application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<File>() {});
  }

  /**
   * Get an API.
   *
   * <p>See {@link #getOpenAPIWithHttpInfo}.
   *
   * @param id ID of the API to retrieve (required)
   * @return CompletableFuture&lt;ApiResponse&lt;File&gt;&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<ApiResponse<File>> getOpenAPIWithHttpInfoAsync(UUID id) {
    // Check if unstable operation is enabled
    String operationId = "getOpenAPI";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<File>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
      CompletableFuture<ApiResponse<File>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'id' when calling getOpenAPI"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/apicatalog/api/{id}/openapi"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ApiManagementApi.getOpenAPI",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"multipart/form-data", "application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<File>> result = new CompletableFuture<>();
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
        new GenericType<File>() {});
  }

  /** Manage optional parameters to listAPIs. */
  public static class ListAPIsOptionalParameters {
    private String query;
    private Long pageLimit;
    private Long pageOffset;

    /**
     * Set query.
     *
     * @param query Filter APIs by name (optional)
     * @return ListAPIsOptionalParameters
     */
    public ListAPIsOptionalParameters query(String query) {
      this.query = query;
      return this;
    }

    /**
     * Set pageLimit.
     *
     * @param pageLimit Number of items per page. (optional, default to 20)
     * @return ListAPIsOptionalParameters
     */
    public ListAPIsOptionalParameters pageLimit(Long pageLimit) {
      this.pageLimit = pageLimit;
      return this;
    }

    /**
     * Set pageOffset.
     *
     * @param pageOffset Offset for pagination. (optional, default to 0)
     * @return ListAPIsOptionalParameters
     */
    public ListAPIsOptionalParameters pageOffset(Long pageOffset) {
      this.pageOffset = pageOffset;
      return this;
    }
  }

  /**
   * List APIs.
   *
   * <p>See {@link #listAPIsWithHttpInfo}.
   *
   * @return ListAPIsResponse
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public ListAPIsResponse listAPIs() throws ApiException {
    return listAPIsWithHttpInfo(new ListAPIsOptionalParameters()).getData();
  }

  /**
   * List APIs.
   *
   * <p>See {@link #listAPIsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;ListAPIsResponse&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<ListAPIsResponse> listAPIsAsync() {
    return listAPIsWithHttpInfoAsync(new ListAPIsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List APIs.
   *
   * <p>See {@link #listAPIsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return ListAPIsResponse
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public ListAPIsResponse listAPIs(ListAPIsOptionalParameters parameters) throws ApiException {
    return listAPIsWithHttpInfo(parameters).getData();
  }

  /**
   * List APIs.
   *
   * <p>See {@link #listAPIsWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ListAPIsResponse&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<ListAPIsResponse> listAPIsAsync(ListAPIsOptionalParameters parameters) {
    return listAPIsWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List APIs and their IDs.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;ListAPIsResponse&gt;
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
   *
   * @deprecated
   */
  @Deprecated
  public ApiResponse<ListAPIsResponse> listAPIsWithHttpInfo(ListAPIsOptionalParameters parameters)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listAPIs";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    String query = parameters.query;
    Long pageLimit = parameters.pageLimit;
    Long pageOffset = parameters.pageOffset;
    // create path and map variables
    String localVarPath = "/api/v2/apicatalog/api";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "query", query));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[offset]", pageOffset));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ApiManagementApi.listAPIs",
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
        new GenericType<ListAPIsResponse>() {});
  }

  /**
   * List APIs.
   *
   * <p>See {@link #listAPIsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;ListAPIsResponse&gt;&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<ApiResponse<ListAPIsResponse>> listAPIsWithHttpInfoAsync(
      ListAPIsOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listAPIs";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ListAPIsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    String query = parameters.query;
    Long pageLimit = parameters.pageLimit;
    Long pageOffset = parameters.pageOffset;
    // create path and map variables
    String localVarPath = "/api/v2/apicatalog/api";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "query", query));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[offset]", pageOffset));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ApiManagementApi.listAPIs",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ListAPIsResponse>> result = new CompletableFuture<>();
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
        new GenericType<ListAPIsResponse>() {});
  }

  /** Manage optional parameters to updateOpenAPI. */
  public static class UpdateOpenAPIOptionalParameters {
    private File openapiSpecFile;

    /**
     * Set openapiSpecFile.
     *
     * @param openapiSpecFile Binary <code>OpenAPI</code> spec file (optional)
     * @return UpdateOpenAPIOptionalParameters
     */
    public UpdateOpenAPIOptionalParameters openapiSpecFile(File openapiSpecFile) {
      this.openapiSpecFile = openapiSpecFile;
      return this;
    }
  }

  /**
   * Update an API.
   *
   * <p>See {@link #updateOpenAPIWithHttpInfo}.
   *
   * @param id ID of the API to modify (required)
   * @return UpdateOpenAPIResponse
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public UpdateOpenAPIResponse updateOpenAPI(UUID id) throws ApiException {
    return updateOpenAPIWithHttpInfo(id, new UpdateOpenAPIOptionalParameters()).getData();
  }

  /**
   * Update an API.
   *
   * <p>See {@link #updateOpenAPIWithHttpInfoAsync}.
   *
   * @param id ID of the API to modify (required)
   * @return CompletableFuture&lt;UpdateOpenAPIResponse&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<UpdateOpenAPIResponse> updateOpenAPIAsync(UUID id) {
    return updateOpenAPIWithHttpInfoAsync(id, new UpdateOpenAPIOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update an API.
   *
   * <p>See {@link #updateOpenAPIWithHttpInfo}.
   *
   * @param id ID of the API to modify (required)
   * @param parameters Optional parameters for the request.
   * @return UpdateOpenAPIResponse
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public UpdateOpenAPIResponse updateOpenAPI(UUID id, UpdateOpenAPIOptionalParameters parameters)
      throws ApiException {
    return updateOpenAPIWithHttpInfo(id, parameters).getData();
  }

  /**
   * Update an API.
   *
   * <p>See {@link #updateOpenAPIWithHttpInfoAsync}.
   *
   * @param id ID of the API to modify (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;UpdateOpenAPIResponse&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<UpdateOpenAPIResponse> updateOpenAPIAsync(
      UUID id, UpdateOpenAPIOptionalParameters parameters) {
    return updateOpenAPIWithHttpInfoAsync(id, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update information about a specific API. The given content will replace all API content of the
   * given ID. The ID is returned by the create API, or can be found in the URL in the API catalog
   * UI.
   *
   * @param id ID of the API to modify (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;UpdateOpenAPIResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> API updated successfully </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> API not found error </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   *
   * @deprecated
   */
  @Deprecated
  public ApiResponse<UpdateOpenAPIResponse> updateOpenAPIWithHttpInfo(
      UUID id, UpdateOpenAPIOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateOpenAPI";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateOpenAPI");
    }
    File openapiSpecFile = parameters.openapiSpecFile;
    // create path and map variables
    String localVarPath =
        "/api/v2/apicatalog/api/{id}/openapi"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    if (openapiSpecFile != null) {
      localVarFormParams.put("openapi_spec_file", openapiSpecFile);
    }

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ApiManagementApi.updateOpenAPI",
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
        new String[] {"multipart/form-data"},
        localVarPostBody,
        localVarFormParams,
        false,
        new GenericType<UpdateOpenAPIResponse>() {});
  }

  /**
   * Update an API.
   *
   * <p>See {@link #updateOpenAPIWithHttpInfo}.
   *
   * @param id ID of the API to modify (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;UpdateOpenAPIResponse&gt;&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<ApiResponse<UpdateOpenAPIResponse>> updateOpenAPIWithHttpInfoAsync(
      UUID id, UpdateOpenAPIOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "updateOpenAPI";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<UpdateOpenAPIResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
      CompletableFuture<ApiResponse<UpdateOpenAPIResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'id' when calling updateOpenAPI"));
      return result;
    }
    File openapiSpecFile = parameters.openapiSpecFile;
    // create path and map variables
    String localVarPath =
        "/api/v2/apicatalog/api/{id}/openapi"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    if (openapiSpecFile != null) {
      localVarFormParams.put("openapi_spec_file", openapiSpecFile);
    }

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ApiManagementApi.updateOpenAPI",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<UpdateOpenAPIResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "PUT",
        builder,
        localVarHeaderParams,
        new String[] {"multipart/form-data"},
        localVarPostBody,
        localVarFormParams,
        false,
        new GenericType<UpdateOpenAPIResponse>() {});
  }
}
