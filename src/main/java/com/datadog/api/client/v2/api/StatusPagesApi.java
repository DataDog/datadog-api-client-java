package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.CreateComponentRequest;
import com.datadog.api.client.v2.model.CreateDegradationRequest;
import com.datadog.api.client.v2.model.CreateStatusPageRequest;
import com.datadog.api.client.v2.model.Degradation;
import com.datadog.api.client.v2.model.DegradationArray;
import com.datadog.api.client.v2.model.PatchComponentRequest;
import com.datadog.api.client.v2.model.PatchDegradationRequest;
import com.datadog.api.client.v2.model.PatchStatusPageRequest;
import com.datadog.api.client.v2.model.StatusPage;
import com.datadog.api.client.v2.model.StatusPageArray;
import com.datadog.api.client.v2.model.StatusPagesComponent;
import com.datadog.api.client.v2.model.StatusPagesComponentArray;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class StatusPagesApi {
  private ApiClient apiClient;

  public StatusPagesApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public StatusPagesApi(ApiClient apiClient) {
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

  /** Manage optional parameters to createComponent. */
  public static class CreateComponentOptionalParameters {
    private String include;

    /**
     * Set include.
     *
     * @param include Comma-separated list of resources to include. Supported values:
     *     created_by_user, last_modified_by_user, status_page, group. (optional)
     * @return CreateComponentOptionalParameters
     */
    public CreateComponentOptionalParameters include(String include) {
      this.include = include;
      return this;
    }
  }

  /**
   * Create component.
   *
   * <p>See {@link #createComponentWithHttpInfo}.
   *
   * @param pageId The ID of the status page. (required)
   * @param body (required)
   * @return StatusPagesComponent
   * @throws ApiException if fails to make API call
   */
  public StatusPagesComponent createComponent(UUID pageId, CreateComponentRequest body)
      throws ApiException {
    return createComponentWithHttpInfo(pageId, body, new CreateComponentOptionalParameters())
        .getData();
  }

  /**
   * Create component.
   *
   * <p>See {@link #createComponentWithHttpInfoAsync}.
   *
   * @param pageId The ID of the status page. (required)
   * @param body (required)
   * @return CompletableFuture&lt;StatusPagesComponent&gt;
   */
  public CompletableFuture<StatusPagesComponent> createComponentAsync(
      UUID pageId, CreateComponentRequest body) {
    return createComponentWithHttpInfoAsync(pageId, body, new CreateComponentOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create component.
   *
   * <p>See {@link #createComponentWithHttpInfo}.
   *
   * @param pageId The ID of the status page. (required)
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return StatusPagesComponent
   * @throws ApiException if fails to make API call
   */
  public StatusPagesComponent createComponent(
      UUID pageId, CreateComponentRequest body, CreateComponentOptionalParameters parameters)
      throws ApiException {
    return createComponentWithHttpInfo(pageId, body, parameters).getData();
  }

  /**
   * Create component.
   *
   * <p>See {@link #createComponentWithHttpInfoAsync}.
   *
   * @param pageId The ID of the status page. (required)
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;StatusPagesComponent&gt;
   */
  public CompletableFuture<StatusPagesComponent> createComponentAsync(
      UUID pageId, CreateComponentRequest body, CreateComponentOptionalParameters parameters) {
    return createComponentWithHttpInfoAsync(pageId, body, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Creates a new component.
   *
   * @param pageId The ID of the status page. (required)
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;StatusPagesComponent&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<StatusPagesComponent> createComponentWithHttpInfo(
      UUID pageId, CreateComponentRequest body, CreateComponentOptionalParameters parameters)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'pageId' is set
    if (pageId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'pageId' when calling createComponent");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createComponent");
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath =
        "/api/v2/statuspages/{page_id}/components"
            .replaceAll("\\{" + "page_id" + "\\}", apiClient.escapeString(pageId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.StatusPagesApi.createComponent",
            localVarPath,
            localVarQueryParams,
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
        new GenericType<StatusPagesComponent>() {});
  }

  /**
   * Create component.
   *
   * <p>See {@link #createComponentWithHttpInfo}.
   *
   * @param pageId The ID of the status page. (required)
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;StatusPagesComponent&gt;&gt;
   */
  public CompletableFuture<ApiResponse<StatusPagesComponent>> createComponentWithHttpInfoAsync(
      UUID pageId, CreateComponentRequest body, CreateComponentOptionalParameters parameters) {
    Object localVarPostBody = body;

    // verify the required parameter 'pageId' is set
    if (pageId == null) {
      CompletableFuture<ApiResponse<StatusPagesComponent>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'pageId' when calling createComponent"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<StatusPagesComponent>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createComponent"));
      return result;
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath =
        "/api/v2/statuspages/{page_id}/components"
            .replaceAll("\\{" + "page_id" + "\\}", apiClient.escapeString(pageId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.StatusPagesApi.createComponent",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<StatusPagesComponent>> result = new CompletableFuture<>();
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
        new GenericType<StatusPagesComponent>() {});
  }

  /** Manage optional parameters to createDegradation. */
  public static class CreateDegradationOptionalParameters {
    private Boolean notifySubscribers;
    private String include;

    /**
     * Set notifySubscribers.
     *
     * @param notifySubscribers Whether to notify page subscribers of the degradation or
     *     maintenance. (optional, default to true)
     * @return CreateDegradationOptionalParameters
     */
    public CreateDegradationOptionalParameters notifySubscribers(Boolean notifySubscribers) {
      this.notifySubscribers = notifySubscribers;
      return this;
    }

    /**
     * Set include.
     *
     * @param include Comma-separated list of resources to include. Supported values:
     *     created_by_user, last_modified_by_user, status_page. (optional)
     * @return CreateDegradationOptionalParameters
     */
    public CreateDegradationOptionalParameters include(String include) {
      this.include = include;
      return this;
    }
  }

  /**
   * Create degradation.
   *
   * <p>See {@link #createDegradationWithHttpInfo}.
   *
   * @param pageId The ID of the status page. (required)
   * @param body (required)
   * @return Degradation
   * @throws ApiException if fails to make API call
   */
  public Degradation createDegradation(UUID pageId, CreateDegradationRequest body)
      throws ApiException {
    return createDegradationWithHttpInfo(pageId, body, new CreateDegradationOptionalParameters())
        .getData();
  }

  /**
   * Create degradation.
   *
   * <p>See {@link #createDegradationWithHttpInfoAsync}.
   *
   * @param pageId The ID of the status page. (required)
   * @param body (required)
   * @return CompletableFuture&lt;Degradation&gt;
   */
  public CompletableFuture<Degradation> createDegradationAsync(
      UUID pageId, CreateDegradationRequest body) {
    return createDegradationWithHttpInfoAsync(
            pageId, body, new CreateDegradationOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create degradation.
   *
   * <p>See {@link #createDegradationWithHttpInfo}.
   *
   * @param pageId The ID of the status page. (required)
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return Degradation
   * @throws ApiException if fails to make API call
   */
  public Degradation createDegradation(
      UUID pageId, CreateDegradationRequest body, CreateDegradationOptionalParameters parameters)
      throws ApiException {
    return createDegradationWithHttpInfo(pageId, body, parameters).getData();
  }

  /**
   * Create degradation.
   *
   * <p>See {@link #createDegradationWithHttpInfoAsync}.
   *
   * @param pageId The ID of the status page. (required)
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;Degradation&gt;
   */
  public CompletableFuture<Degradation> createDegradationAsync(
      UUID pageId, CreateDegradationRequest body, CreateDegradationOptionalParameters parameters) {
    return createDegradationWithHttpInfoAsync(pageId, body, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Creates a new degradation.
   *
   * @param pageId The ID of the status page. (required)
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;Degradation&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Degradation> createDegradationWithHttpInfo(
      UUID pageId, CreateDegradationRequest body, CreateDegradationOptionalParameters parameters)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'pageId' is set
    if (pageId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'pageId' when calling createDegradation");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createDegradation");
    }
    Boolean notifySubscribers = parameters.notifySubscribers;
    String include = parameters.include;
    // create path and map variables
    String localVarPath =
        "/api/v2/statuspages/{page_id}/degradations"
            .replaceAll("\\{" + "page_id" + "\\}", apiClient.escapeString(pageId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "notify_subscribers", notifySubscribers));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.StatusPagesApi.createDegradation",
            localVarPath,
            localVarQueryParams,
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
        new GenericType<Degradation>() {});
  }

  /**
   * Create degradation.
   *
   * <p>See {@link #createDegradationWithHttpInfo}.
   *
   * @param pageId The ID of the status page. (required)
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;Degradation&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Degradation>> createDegradationWithHttpInfoAsync(
      UUID pageId, CreateDegradationRequest body, CreateDegradationOptionalParameters parameters) {
    Object localVarPostBody = body;

    // verify the required parameter 'pageId' is set
    if (pageId == null) {
      CompletableFuture<ApiResponse<Degradation>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'pageId' when calling createDegradation"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Degradation>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createDegradation"));
      return result;
    }
    Boolean notifySubscribers = parameters.notifySubscribers;
    String include = parameters.include;
    // create path and map variables
    String localVarPath =
        "/api/v2/statuspages/{page_id}/degradations"
            .replaceAll("\\{" + "page_id" + "\\}", apiClient.escapeString(pageId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "notify_subscribers", notifySubscribers));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.StatusPagesApi.createDegradation",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Degradation>> result = new CompletableFuture<>();
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
        new GenericType<Degradation>() {});
  }

  /** Manage optional parameters to createStatusPage. */
  public static class CreateStatusPageOptionalParameters {
    private String include;

    /**
     * Set include.
     *
     * @param include Comma-separated list of resources to include. Supported values:
     *     created_by_user, last_modified_by_user. (optional)
     * @return CreateStatusPageOptionalParameters
     */
    public CreateStatusPageOptionalParameters include(String include) {
      this.include = include;
      return this;
    }
  }

  /**
   * Create status page.
   *
   * <p>See {@link #createStatusPageWithHttpInfo}.
   *
   * @param body (required)
   * @return StatusPage
   * @throws ApiException if fails to make API call
   */
  public StatusPage createStatusPage(CreateStatusPageRequest body) throws ApiException {
    return createStatusPageWithHttpInfo(body, new CreateStatusPageOptionalParameters()).getData();
  }

  /**
   * Create status page.
   *
   * <p>See {@link #createStatusPageWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;StatusPage&gt;
   */
  public CompletableFuture<StatusPage> createStatusPageAsync(CreateStatusPageRequest body) {
    return createStatusPageWithHttpInfoAsync(body, new CreateStatusPageOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create status page.
   *
   * <p>See {@link #createStatusPageWithHttpInfo}.
   *
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return StatusPage
   * @throws ApiException if fails to make API call
   */
  public StatusPage createStatusPage(
      CreateStatusPageRequest body, CreateStatusPageOptionalParameters parameters)
      throws ApiException {
    return createStatusPageWithHttpInfo(body, parameters).getData();
  }

  /**
   * Create status page.
   *
   * <p>See {@link #createStatusPageWithHttpInfoAsync}.
   *
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;StatusPage&gt;
   */
  public CompletableFuture<StatusPage> createStatusPageAsync(
      CreateStatusPageRequest body, CreateStatusPageOptionalParameters parameters) {
    return createStatusPageWithHttpInfoAsync(body, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Creates a new status page.
   *
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;StatusPage&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<StatusPage> createStatusPageWithHttpInfo(
      CreateStatusPageRequest body, CreateStatusPageOptionalParameters parameters)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createStatusPage");
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath = "/api/v2/statuspages";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.StatusPagesApi.createStatusPage",
            localVarPath,
            localVarQueryParams,
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
        new GenericType<StatusPage>() {});
  }

  /**
   * Create status page.
   *
   * <p>See {@link #createStatusPageWithHttpInfo}.
   *
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;StatusPage&gt;&gt;
   */
  public CompletableFuture<ApiResponse<StatusPage>> createStatusPageWithHttpInfoAsync(
      CreateStatusPageRequest body, CreateStatusPageOptionalParameters parameters) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<StatusPage>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createStatusPage"));
      return result;
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath = "/api/v2/statuspages";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.StatusPagesApi.createStatusPage",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<StatusPage>> result = new CompletableFuture<>();
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
        new GenericType<StatusPage>() {});
  }

  /**
   * Delete component.
   *
   * <p>See {@link #deleteComponentWithHttpInfo}.
   *
   * @param pageId The ID of the status page. (required)
   * @param componentId The ID of the component. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteComponent(UUID pageId, UUID componentId) throws ApiException {
    deleteComponentWithHttpInfo(pageId, componentId);
  }

  /**
   * Delete component.
   *
   * <p>See {@link #deleteComponentWithHttpInfoAsync}.
   *
   * @param pageId The ID of the status page. (required)
   * @param componentId The ID of the component. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteComponentAsync(UUID pageId, UUID componentId) {
    return deleteComponentWithHttpInfoAsync(pageId, componentId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Deletes a component by its ID.
   *
   * @param pageId The ID of the status page. (required)
   * @param componentId The ID of the component. (required)
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
  public ApiResponse<Void> deleteComponentWithHttpInfo(UUID pageId, UUID componentId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'pageId' is set
    if (pageId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'pageId' when calling deleteComponent");
    }

    // verify the required parameter 'componentId' is set
    if (componentId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'componentId' when calling deleteComponent");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/statuspages/{page_id}/components/{component_id}"
            .replaceAll("\\{" + "page_id" + "\\}", apiClient.escapeString(pageId.toString()))
            .replaceAll(
                "\\{" + "component_id" + "\\}", apiClient.escapeString(componentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.StatusPagesApi.deleteComponent",
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
   * Delete component.
   *
   * <p>See {@link #deleteComponentWithHttpInfo}.
   *
   * @param pageId The ID of the status page. (required)
   * @param componentId The ID of the component. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteComponentWithHttpInfoAsync(
      UUID pageId, UUID componentId) {
    Object localVarPostBody = null;

    // verify the required parameter 'pageId' is set
    if (pageId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'pageId' when calling deleteComponent"));
      return result;
    }

    // verify the required parameter 'componentId' is set
    if (componentId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'componentId' when calling deleteComponent"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/statuspages/{page_id}/components/{component_id}"
            .replaceAll("\\{" + "page_id" + "\\}", apiClient.escapeString(pageId.toString()))
            .replaceAll(
                "\\{" + "component_id" + "\\}", apiClient.escapeString(componentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.StatusPagesApi.deleteComponent",
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
   * Delete degradation.
   *
   * <p>See {@link #deleteDegradationWithHttpInfo}.
   *
   * @param pageId The ID of the status page. (required)
   * @param degradationId The ID of the degradation. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteDegradation(UUID pageId, UUID degradationId) throws ApiException {
    deleteDegradationWithHttpInfo(pageId, degradationId);
  }

  /**
   * Delete degradation.
   *
   * <p>See {@link #deleteDegradationWithHttpInfoAsync}.
   *
   * @param pageId The ID of the status page. (required)
   * @param degradationId The ID of the degradation. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteDegradationAsync(UUID pageId, UUID degradationId) {
    return deleteDegradationWithHttpInfoAsync(pageId, degradationId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Deletes a degradation by its ID.
   *
   * @param pageId The ID of the status page. (required)
   * @param degradationId The ID of the degradation. (required)
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
  public ApiResponse<Void> deleteDegradationWithHttpInfo(UUID pageId, UUID degradationId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'pageId' is set
    if (pageId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'pageId' when calling deleteDegradation");
    }

    // verify the required parameter 'degradationId' is set
    if (degradationId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'degradationId' when calling deleteDegradation");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/statuspages/{page_id}/degradations/{degradation_id}"
            .replaceAll("\\{" + "page_id" + "\\}", apiClient.escapeString(pageId.toString()))
            .replaceAll(
                "\\{" + "degradation_id" + "\\}", apiClient.escapeString(degradationId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.StatusPagesApi.deleteDegradation",
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
   * Delete degradation.
   *
   * <p>See {@link #deleteDegradationWithHttpInfo}.
   *
   * @param pageId The ID of the status page. (required)
   * @param degradationId The ID of the degradation. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteDegradationWithHttpInfoAsync(
      UUID pageId, UUID degradationId) {
    Object localVarPostBody = null;

    // verify the required parameter 'pageId' is set
    if (pageId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'pageId' when calling deleteDegradation"));
      return result;
    }

    // verify the required parameter 'degradationId' is set
    if (degradationId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'degradationId' when calling deleteDegradation"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/statuspages/{page_id}/degradations/{degradation_id}"
            .replaceAll("\\{" + "page_id" + "\\}", apiClient.escapeString(pageId.toString()))
            .replaceAll(
                "\\{" + "degradation_id" + "\\}", apiClient.escapeString(degradationId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.StatusPagesApi.deleteDegradation",
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
   * Delete status page.
   *
   * <p>See {@link #deleteStatusPageWithHttpInfo}.
   *
   * @param pageId The ID of the status page. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteStatusPage(UUID pageId) throws ApiException {
    deleteStatusPageWithHttpInfo(pageId);
  }

  /**
   * Delete status page.
   *
   * <p>See {@link #deleteStatusPageWithHttpInfoAsync}.
   *
   * @param pageId The ID of the status page. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteStatusPageAsync(UUID pageId) {
    return deleteStatusPageWithHttpInfoAsync(pageId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Deletes a status page by its ID.
   *
   * @param pageId The ID of the status page. (required)
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
  public ApiResponse<Void> deleteStatusPageWithHttpInfo(UUID pageId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'pageId' is set
    if (pageId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'pageId' when calling deleteStatusPage");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/statuspages/{page_id}"
            .replaceAll("\\{" + "page_id" + "\\}", apiClient.escapeString(pageId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.StatusPagesApi.deleteStatusPage",
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
   * Delete status page.
   *
   * <p>See {@link #deleteStatusPageWithHttpInfo}.
   *
   * @param pageId The ID of the status page. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteStatusPageWithHttpInfoAsync(UUID pageId) {
    Object localVarPostBody = null;

    // verify the required parameter 'pageId' is set
    if (pageId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'pageId' when calling deleteStatusPage"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/statuspages/{page_id}"
            .replaceAll("\\{" + "page_id" + "\\}", apiClient.escapeString(pageId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.StatusPagesApi.deleteStatusPage",
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

  /** Manage optional parameters to getComponent. */
  public static class GetComponentOptionalParameters {
    private String include;

    /**
     * Set include.
     *
     * @param include Comma-separated list of resources to include. Supported values:
     *     created_by_user, last_modified_by_user, status_page, group. (optional)
     * @return GetComponentOptionalParameters
     */
    public GetComponentOptionalParameters include(String include) {
      this.include = include;
      return this;
    }
  }

  /**
   * Get component.
   *
   * <p>See {@link #getComponentWithHttpInfo}.
   *
   * @param pageId The ID of the status page. (required)
   * @param componentId The ID of the component. (required)
   * @return StatusPagesComponent
   * @throws ApiException if fails to make API call
   */
  public StatusPagesComponent getComponent(UUID pageId, UUID componentId) throws ApiException {
    return getComponentWithHttpInfo(pageId, componentId, new GetComponentOptionalParameters())
        .getData();
  }

  /**
   * Get component.
   *
   * <p>See {@link #getComponentWithHttpInfoAsync}.
   *
   * @param pageId The ID of the status page. (required)
   * @param componentId The ID of the component. (required)
   * @return CompletableFuture&lt;StatusPagesComponent&gt;
   */
  public CompletableFuture<StatusPagesComponent> getComponentAsync(UUID pageId, UUID componentId) {
    return getComponentWithHttpInfoAsync(pageId, componentId, new GetComponentOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get component.
   *
   * <p>See {@link #getComponentWithHttpInfo}.
   *
   * @param pageId The ID of the status page. (required)
   * @param componentId The ID of the component. (required)
   * @param parameters Optional parameters for the request.
   * @return StatusPagesComponent
   * @throws ApiException if fails to make API call
   */
  public StatusPagesComponent getComponent(
      UUID pageId, UUID componentId, GetComponentOptionalParameters parameters)
      throws ApiException {
    return getComponentWithHttpInfo(pageId, componentId, parameters).getData();
  }

  /**
   * Get component.
   *
   * <p>See {@link #getComponentWithHttpInfoAsync}.
   *
   * @param pageId The ID of the status page. (required)
   * @param componentId The ID of the component. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;StatusPagesComponent&gt;
   */
  public CompletableFuture<StatusPagesComponent> getComponentAsync(
      UUID pageId, UUID componentId, GetComponentOptionalParameters parameters) {
    return getComponentWithHttpInfoAsync(pageId, componentId, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Retrieves a specific component by its ID.
   *
   * @param pageId The ID of the status page. (required)
   * @param componentId The ID of the component. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;StatusPagesComponent&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<StatusPagesComponent> getComponentWithHttpInfo(
      UUID pageId, UUID componentId, GetComponentOptionalParameters parameters)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'pageId' is set
    if (pageId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'pageId' when calling getComponent");
    }

    // verify the required parameter 'componentId' is set
    if (componentId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'componentId' when calling getComponent");
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath =
        "/api/v2/statuspages/{page_id}/components/{component_id}"
            .replaceAll("\\{" + "page_id" + "\\}", apiClient.escapeString(pageId.toString()))
            .replaceAll(
                "\\{" + "component_id" + "\\}", apiClient.escapeString(componentId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.StatusPagesApi.getComponent",
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
        new GenericType<StatusPagesComponent>() {});
  }

  /**
   * Get component.
   *
   * <p>See {@link #getComponentWithHttpInfo}.
   *
   * @param pageId The ID of the status page. (required)
   * @param componentId The ID of the component. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;StatusPagesComponent&gt;&gt;
   */
  public CompletableFuture<ApiResponse<StatusPagesComponent>> getComponentWithHttpInfoAsync(
      UUID pageId, UUID componentId, GetComponentOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'pageId' is set
    if (pageId == null) {
      CompletableFuture<ApiResponse<StatusPagesComponent>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'pageId' when calling getComponent"));
      return result;
    }

    // verify the required parameter 'componentId' is set
    if (componentId == null) {
      CompletableFuture<ApiResponse<StatusPagesComponent>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'componentId' when calling getComponent"));
      return result;
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath =
        "/api/v2/statuspages/{page_id}/components/{component_id}"
            .replaceAll("\\{" + "page_id" + "\\}", apiClient.escapeString(pageId.toString()))
            .replaceAll(
                "\\{" + "component_id" + "\\}", apiClient.escapeString(componentId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.StatusPagesApi.getComponent",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<StatusPagesComponent>> result = new CompletableFuture<>();
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
        new GenericType<StatusPagesComponent>() {});
  }

  /** Manage optional parameters to getDegradation. */
  public static class GetDegradationOptionalParameters {
    private String include;

    /**
     * Set include.
     *
     * @param include Comma-separated list of resources to include. Supported values:
     *     created_by_user, last_modified_by_user, status_page. (optional)
     * @return GetDegradationOptionalParameters
     */
    public GetDegradationOptionalParameters include(String include) {
      this.include = include;
      return this;
    }
  }

  /**
   * Get degradation.
   *
   * <p>See {@link #getDegradationWithHttpInfo}.
   *
   * @param pageId The ID of the status page. (required)
   * @param degradationId The ID of the degradation. (required)
   * @return Degradation
   * @throws ApiException if fails to make API call
   */
  public Degradation getDegradation(UUID pageId, UUID degradationId) throws ApiException {
    return getDegradationWithHttpInfo(pageId, degradationId, new GetDegradationOptionalParameters())
        .getData();
  }

  /**
   * Get degradation.
   *
   * <p>See {@link #getDegradationWithHttpInfoAsync}.
   *
   * @param pageId The ID of the status page. (required)
   * @param degradationId The ID of the degradation. (required)
   * @return CompletableFuture&lt;Degradation&gt;
   */
  public CompletableFuture<Degradation> getDegradationAsync(UUID pageId, UUID degradationId) {
    return getDegradationWithHttpInfoAsync(
            pageId, degradationId, new GetDegradationOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get degradation.
   *
   * <p>See {@link #getDegradationWithHttpInfo}.
   *
   * @param pageId The ID of the status page. (required)
   * @param degradationId The ID of the degradation. (required)
   * @param parameters Optional parameters for the request.
   * @return Degradation
   * @throws ApiException if fails to make API call
   */
  public Degradation getDegradation(
      UUID pageId, UUID degradationId, GetDegradationOptionalParameters parameters)
      throws ApiException {
    return getDegradationWithHttpInfo(pageId, degradationId, parameters).getData();
  }

  /**
   * Get degradation.
   *
   * <p>See {@link #getDegradationWithHttpInfoAsync}.
   *
   * @param pageId The ID of the status page. (required)
   * @param degradationId The ID of the degradation. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;Degradation&gt;
   */
  public CompletableFuture<Degradation> getDegradationAsync(
      UUID pageId, UUID degradationId, GetDegradationOptionalParameters parameters) {
    return getDegradationWithHttpInfoAsync(pageId, degradationId, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Retrieves a specific degradation by its ID.
   *
   * @param pageId The ID of the status page. (required)
   * @param degradationId The ID of the degradation. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;Degradation&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Degradation> getDegradationWithHttpInfo(
      UUID pageId, UUID degradationId, GetDegradationOptionalParameters parameters)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'pageId' is set
    if (pageId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'pageId' when calling getDegradation");
    }

    // verify the required parameter 'degradationId' is set
    if (degradationId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'degradationId' when calling getDegradation");
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath =
        "/api/v2/statuspages/{page_id}/degradations/{degradation_id}"
            .replaceAll("\\{" + "page_id" + "\\}", apiClient.escapeString(pageId.toString()))
            .replaceAll(
                "\\{" + "degradation_id" + "\\}", apiClient.escapeString(degradationId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.StatusPagesApi.getDegradation",
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
        new GenericType<Degradation>() {});
  }

  /**
   * Get degradation.
   *
   * <p>See {@link #getDegradationWithHttpInfo}.
   *
   * @param pageId The ID of the status page. (required)
   * @param degradationId The ID of the degradation. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;Degradation&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Degradation>> getDegradationWithHttpInfoAsync(
      UUID pageId, UUID degradationId, GetDegradationOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'pageId' is set
    if (pageId == null) {
      CompletableFuture<ApiResponse<Degradation>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'pageId' when calling getDegradation"));
      return result;
    }

    // verify the required parameter 'degradationId' is set
    if (degradationId == null) {
      CompletableFuture<ApiResponse<Degradation>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'degradationId' when calling getDegradation"));
      return result;
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath =
        "/api/v2/statuspages/{page_id}/degradations/{degradation_id}"
            .replaceAll("\\{" + "page_id" + "\\}", apiClient.escapeString(pageId.toString()))
            .replaceAll(
                "\\{" + "degradation_id" + "\\}", apiClient.escapeString(degradationId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.StatusPagesApi.getDegradation",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Degradation>> result = new CompletableFuture<>();
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
        new GenericType<Degradation>() {});
  }

  /** Manage optional parameters to getStatusPage. */
  public static class GetStatusPageOptionalParameters {
    private String include;

    /**
     * Set include.
     *
     * @param include Comma-separated list of resources to include. Supported values:
     *     created_by_user, last_modified_by_user. (optional)
     * @return GetStatusPageOptionalParameters
     */
    public GetStatusPageOptionalParameters include(String include) {
      this.include = include;
      return this;
    }
  }

  /**
   * Get status page.
   *
   * <p>See {@link #getStatusPageWithHttpInfo}.
   *
   * @param pageId The ID of the status page. (required)
   * @return StatusPage
   * @throws ApiException if fails to make API call
   */
  public StatusPage getStatusPage(UUID pageId) throws ApiException {
    return getStatusPageWithHttpInfo(pageId, new GetStatusPageOptionalParameters()).getData();
  }

  /**
   * Get status page.
   *
   * <p>See {@link #getStatusPageWithHttpInfoAsync}.
   *
   * @param pageId The ID of the status page. (required)
   * @return CompletableFuture&lt;StatusPage&gt;
   */
  public CompletableFuture<StatusPage> getStatusPageAsync(UUID pageId) {
    return getStatusPageWithHttpInfoAsync(pageId, new GetStatusPageOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get status page.
   *
   * <p>See {@link #getStatusPageWithHttpInfo}.
   *
   * @param pageId The ID of the status page. (required)
   * @param parameters Optional parameters for the request.
   * @return StatusPage
   * @throws ApiException if fails to make API call
   */
  public StatusPage getStatusPage(UUID pageId, GetStatusPageOptionalParameters parameters)
      throws ApiException {
    return getStatusPageWithHttpInfo(pageId, parameters).getData();
  }

  /**
   * Get status page.
   *
   * <p>See {@link #getStatusPageWithHttpInfoAsync}.
   *
   * @param pageId The ID of the status page. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;StatusPage&gt;
   */
  public CompletableFuture<StatusPage> getStatusPageAsync(
      UUID pageId, GetStatusPageOptionalParameters parameters) {
    return getStatusPageWithHttpInfoAsync(pageId, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Retrieves a specific status page by its ID.
   *
   * @param pageId The ID of the status page. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;StatusPage&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<StatusPage> getStatusPageWithHttpInfo(
      UUID pageId, GetStatusPageOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'pageId' is set
    if (pageId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'pageId' when calling getStatusPage");
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath =
        "/api/v2/statuspages/{page_id}"
            .replaceAll("\\{" + "page_id" + "\\}", apiClient.escapeString(pageId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.StatusPagesApi.getStatusPage",
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
        new GenericType<StatusPage>() {});
  }

  /**
   * Get status page.
   *
   * <p>See {@link #getStatusPageWithHttpInfo}.
   *
   * @param pageId The ID of the status page. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;StatusPage&gt;&gt;
   */
  public CompletableFuture<ApiResponse<StatusPage>> getStatusPageWithHttpInfoAsync(
      UUID pageId, GetStatusPageOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'pageId' is set
    if (pageId == null) {
      CompletableFuture<ApiResponse<StatusPage>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'pageId' when calling getStatusPage"));
      return result;
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath =
        "/api/v2/statuspages/{page_id}"
            .replaceAll("\\{" + "page_id" + "\\}", apiClient.escapeString(pageId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.StatusPagesApi.getStatusPage",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<StatusPage>> result = new CompletableFuture<>();
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
        new GenericType<StatusPage>() {});
  }

  /** Manage optional parameters to listComponents. */
  public static class ListComponentsOptionalParameters {
    private String include;

    /**
     * Set include.
     *
     * @param include Comma-separated list of resources to include. Supported values:
     *     created_by_user, last_modified_by_user, status_page, group. (optional)
     * @return ListComponentsOptionalParameters
     */
    public ListComponentsOptionalParameters include(String include) {
      this.include = include;
      return this;
    }
  }

  /**
   * List components.
   *
   * <p>See {@link #listComponentsWithHttpInfo}.
   *
   * @param pageId The ID of the status page. (required)
   * @return StatusPagesComponentArray
   * @throws ApiException if fails to make API call
   */
  public StatusPagesComponentArray listComponents(UUID pageId) throws ApiException {
    return listComponentsWithHttpInfo(pageId, new ListComponentsOptionalParameters()).getData();
  }

  /**
   * List components.
   *
   * <p>See {@link #listComponentsWithHttpInfoAsync}.
   *
   * @param pageId The ID of the status page. (required)
   * @return CompletableFuture&lt;StatusPagesComponentArray&gt;
   */
  public CompletableFuture<StatusPagesComponentArray> listComponentsAsync(UUID pageId) {
    return listComponentsWithHttpInfoAsync(pageId, new ListComponentsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List components.
   *
   * <p>See {@link #listComponentsWithHttpInfo}.
   *
   * @param pageId The ID of the status page. (required)
   * @param parameters Optional parameters for the request.
   * @return StatusPagesComponentArray
   * @throws ApiException if fails to make API call
   */
  public StatusPagesComponentArray listComponents(
      UUID pageId, ListComponentsOptionalParameters parameters) throws ApiException {
    return listComponentsWithHttpInfo(pageId, parameters).getData();
  }

  /**
   * List components.
   *
   * <p>See {@link #listComponentsWithHttpInfoAsync}.
   *
   * @param pageId The ID of the status page. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;StatusPagesComponentArray&gt;
   */
  public CompletableFuture<StatusPagesComponentArray> listComponentsAsync(
      UUID pageId, ListComponentsOptionalParameters parameters) {
    return listComponentsWithHttpInfoAsync(pageId, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Lists all components for a status page.
   *
   * @param pageId The ID of the status page. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;StatusPagesComponentArray&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<StatusPagesComponentArray> listComponentsWithHttpInfo(
      UUID pageId, ListComponentsOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'pageId' is set
    if (pageId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'pageId' when calling listComponents");
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath =
        "/api/v2/statuspages/{page_id}/components"
            .replaceAll("\\{" + "page_id" + "\\}", apiClient.escapeString(pageId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.StatusPagesApi.listComponents",
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
        new GenericType<StatusPagesComponentArray>() {});
  }

  /**
   * List components.
   *
   * <p>See {@link #listComponentsWithHttpInfo}.
   *
   * @param pageId The ID of the status page. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;StatusPagesComponentArray&gt;&gt;
   */
  public CompletableFuture<ApiResponse<StatusPagesComponentArray>> listComponentsWithHttpInfoAsync(
      UUID pageId, ListComponentsOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'pageId' is set
    if (pageId == null) {
      CompletableFuture<ApiResponse<StatusPagesComponentArray>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'pageId' when calling listComponents"));
      return result;
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath =
        "/api/v2/statuspages/{page_id}/components"
            .replaceAll("\\{" + "page_id" + "\\}", apiClient.escapeString(pageId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.StatusPagesApi.listComponents",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<StatusPagesComponentArray>> result = new CompletableFuture<>();
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
        new GenericType<StatusPagesComponentArray>() {});
  }

  /** Manage optional parameters to listDegradations. */
  public static class ListDegradationsOptionalParameters {
    private String filterPageId;
    private Integer pageOffset;
    private Integer pageLimit;
    private String include;
    private String filterStatus;

    /**
     * Set filterPageId.
     *
     * @param filterPageId Optional page id filter. (optional)
     * @return ListDegradationsOptionalParameters
     */
    public ListDegradationsOptionalParameters filterPageId(String filterPageId) {
      this.filterPageId = filterPageId;
      return this;
    }

    /**
     * Set pageOffset.
     *
     * @param pageOffset Offset to use as the start of the page. (optional, default to 0)
     * @return ListDegradationsOptionalParameters
     */
    public ListDegradationsOptionalParameters pageOffset(Integer pageOffset) {
      this.pageOffset = pageOffset;
      return this;
    }

    /**
     * Set pageLimit.
     *
     * @param pageLimit The number of degradations to return per page. (optional, default to 50)
     * @return ListDegradationsOptionalParameters
     */
    public ListDegradationsOptionalParameters pageLimit(Integer pageLimit) {
      this.pageLimit = pageLimit;
      return this;
    }

    /**
     * Set include.
     *
     * @param include Comma-separated list of resources to include. Supported values:
     *     created_by_user, last_modified_by_user, status_page. (optional)
     * @return ListDegradationsOptionalParameters
     */
    public ListDegradationsOptionalParameters include(String include) {
      this.include = include;
      return this;
    }

    /**
     * Set filterStatus.
     *
     * @param filterStatus Optional degradation status filter. Supported values: investigating,
     *     identified, monitoring, resolved. (optional)
     * @return ListDegradationsOptionalParameters
     */
    public ListDegradationsOptionalParameters filterStatus(String filterStatus) {
      this.filterStatus = filterStatus;
      return this;
    }
  }

  /**
   * List degradations.
   *
   * <p>See {@link #listDegradationsWithHttpInfo}.
   *
   * @return DegradationArray
   * @throws ApiException if fails to make API call
   */
  public DegradationArray listDegradations() throws ApiException {
    return listDegradationsWithHttpInfo(new ListDegradationsOptionalParameters()).getData();
  }

  /**
   * List degradations.
   *
   * <p>See {@link #listDegradationsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;DegradationArray&gt;
   */
  public CompletableFuture<DegradationArray> listDegradationsAsync() {
    return listDegradationsWithHttpInfoAsync(new ListDegradationsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List degradations.
   *
   * <p>See {@link #listDegradationsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return DegradationArray
   * @throws ApiException if fails to make API call
   */
  public DegradationArray listDegradations(ListDegradationsOptionalParameters parameters)
      throws ApiException {
    return listDegradationsWithHttpInfo(parameters).getData();
  }

  /**
   * List degradations.
   *
   * <p>See {@link #listDegradationsWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;DegradationArray&gt;
   */
  public CompletableFuture<DegradationArray> listDegradationsAsync(
      ListDegradationsOptionalParameters parameters) {
    return listDegradationsWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Lists all degradations for the organization. Optionally filter by status and page.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;DegradationArray&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<DegradationArray> listDegradationsWithHttpInfo(
      ListDegradationsOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    String filterPageId = parameters.filterPageId;
    Integer pageOffset = parameters.pageOffset;
    Integer pageLimit = parameters.pageLimit;
    String include = parameters.include;
    String filterStatus = parameters.filterStatus;
    // create path and map variables
    String localVarPath = "/api/v2/statuspages/degradations";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[page_id]", filterPageId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[offset]", pageOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[status]", filterStatus));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.StatusPagesApi.listDegradations",
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
        new GenericType<DegradationArray>() {});
  }

  /**
   * List degradations.
   *
   * <p>See {@link #listDegradationsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;DegradationArray&gt;&gt;
   */
  public CompletableFuture<ApiResponse<DegradationArray>> listDegradationsWithHttpInfoAsync(
      ListDegradationsOptionalParameters parameters) {
    Object localVarPostBody = null;
    String filterPageId = parameters.filterPageId;
    Integer pageOffset = parameters.pageOffset;
    Integer pageLimit = parameters.pageLimit;
    String include = parameters.include;
    String filterStatus = parameters.filterStatus;
    // create path and map variables
    String localVarPath = "/api/v2/statuspages/degradations";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[page_id]", filterPageId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[offset]", pageOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[status]", filterStatus));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.StatusPagesApi.listDegradations",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<DegradationArray>> result = new CompletableFuture<>();
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
        new GenericType<DegradationArray>() {});
  }

  /** Manage optional parameters to listStatusPages. */
  public static class ListStatusPagesOptionalParameters {
    private Integer pageOffset;
    private Integer pageLimit;
    private String include;

    /**
     * Set pageOffset.
     *
     * @param pageOffset Offset to use as the start of the page. (optional, default to 0)
     * @return ListStatusPagesOptionalParameters
     */
    public ListStatusPagesOptionalParameters pageOffset(Integer pageOffset) {
      this.pageOffset = pageOffset;
      return this;
    }

    /**
     * Set pageLimit.
     *
     * @param pageLimit The number of status pages to return per page. (optional, default to 50)
     * @return ListStatusPagesOptionalParameters
     */
    public ListStatusPagesOptionalParameters pageLimit(Integer pageLimit) {
      this.pageLimit = pageLimit;
      return this;
    }

    /**
     * Set include.
     *
     * @param include Comma-separated list of resources to include. Supported values:
     *     created_by_user, last_modified_by_user. (optional)
     * @return ListStatusPagesOptionalParameters
     */
    public ListStatusPagesOptionalParameters include(String include) {
      this.include = include;
      return this;
    }
  }

  /**
   * List status pages.
   *
   * <p>See {@link #listStatusPagesWithHttpInfo}.
   *
   * @return StatusPageArray
   * @throws ApiException if fails to make API call
   */
  public StatusPageArray listStatusPages() throws ApiException {
    return listStatusPagesWithHttpInfo(new ListStatusPagesOptionalParameters()).getData();
  }

  /**
   * List status pages.
   *
   * <p>See {@link #listStatusPagesWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;StatusPageArray&gt;
   */
  public CompletableFuture<StatusPageArray> listStatusPagesAsync() {
    return listStatusPagesWithHttpInfoAsync(new ListStatusPagesOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List status pages.
   *
   * <p>See {@link #listStatusPagesWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return StatusPageArray
   * @throws ApiException if fails to make API call
   */
  public StatusPageArray listStatusPages(ListStatusPagesOptionalParameters parameters)
      throws ApiException {
    return listStatusPagesWithHttpInfo(parameters).getData();
  }

  /**
   * List status pages.
   *
   * <p>See {@link #listStatusPagesWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;StatusPageArray&gt;
   */
  public CompletableFuture<StatusPageArray> listStatusPagesAsync(
      ListStatusPagesOptionalParameters parameters) {
    return listStatusPagesWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Lists all status pages for the organization.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;StatusPageArray&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<StatusPageArray> listStatusPagesWithHttpInfo(
      ListStatusPagesOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    Integer pageOffset = parameters.pageOffset;
    Integer pageLimit = parameters.pageLimit;
    String include = parameters.include;
    // create path and map variables
    String localVarPath = "/api/v2/statuspages";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[offset]", pageOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.StatusPagesApi.listStatusPages",
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
        new GenericType<StatusPageArray>() {});
  }

  /**
   * List status pages.
   *
   * <p>See {@link #listStatusPagesWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;StatusPageArray&gt;&gt;
   */
  public CompletableFuture<ApiResponse<StatusPageArray>> listStatusPagesWithHttpInfoAsync(
      ListStatusPagesOptionalParameters parameters) {
    Object localVarPostBody = null;
    Integer pageOffset = parameters.pageOffset;
    Integer pageLimit = parameters.pageLimit;
    String include = parameters.include;
    // create path and map variables
    String localVarPath = "/api/v2/statuspages";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[offset]", pageOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.StatusPagesApi.listStatusPages",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<StatusPageArray>> result = new CompletableFuture<>();
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
        new GenericType<StatusPageArray>() {});
  }

  /** Manage optional parameters to updateComponent. */
  public static class UpdateComponentOptionalParameters {
    private String include;

    /**
     * Set include.
     *
     * @param include Comma-separated list of resources to include. Supported values:
     *     created_by_user, last_modified_by_user, status_page, group. (optional)
     * @return UpdateComponentOptionalParameters
     */
    public UpdateComponentOptionalParameters include(String include) {
      this.include = include;
      return this;
    }
  }

  /**
   * Update component.
   *
   * <p>See {@link #updateComponentWithHttpInfo}.
   *
   * @param pageId The ID of the status page. (required)
   * @param componentId The ID of the component. (required)
   * @param body (required)
   * @return StatusPagesComponent
   * @throws ApiException if fails to make API call
   */
  public StatusPagesComponent updateComponent(
      UUID pageId, UUID componentId, PatchComponentRequest body) throws ApiException {
    return updateComponentWithHttpInfo(
            pageId, componentId, body, new UpdateComponentOptionalParameters())
        .getData();
  }

  /**
   * Update component.
   *
   * <p>See {@link #updateComponentWithHttpInfoAsync}.
   *
   * @param pageId The ID of the status page. (required)
   * @param componentId The ID of the component. (required)
   * @param body (required)
   * @return CompletableFuture&lt;StatusPagesComponent&gt;
   */
  public CompletableFuture<StatusPagesComponent> updateComponentAsync(
      UUID pageId, UUID componentId, PatchComponentRequest body) {
    return updateComponentWithHttpInfoAsync(
            pageId, componentId, body, new UpdateComponentOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update component.
   *
   * <p>See {@link #updateComponentWithHttpInfo}.
   *
   * @param pageId The ID of the status page. (required)
   * @param componentId The ID of the component. (required)
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return StatusPagesComponent
   * @throws ApiException if fails to make API call
   */
  public StatusPagesComponent updateComponent(
      UUID pageId,
      UUID componentId,
      PatchComponentRequest body,
      UpdateComponentOptionalParameters parameters)
      throws ApiException {
    return updateComponentWithHttpInfo(pageId, componentId, body, parameters).getData();
  }

  /**
   * Update component.
   *
   * <p>See {@link #updateComponentWithHttpInfoAsync}.
   *
   * @param pageId The ID of the status page. (required)
   * @param componentId The ID of the component. (required)
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;StatusPagesComponent&gt;
   */
  public CompletableFuture<StatusPagesComponent> updateComponentAsync(
      UUID pageId,
      UUID componentId,
      PatchComponentRequest body,
      UpdateComponentOptionalParameters parameters) {
    return updateComponentWithHttpInfoAsync(pageId, componentId, body, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Updates an existing component's attributes.
   *
   * @param pageId The ID of the status page. (required)
   * @param componentId The ID of the component. (required)
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;StatusPagesComponent&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<StatusPagesComponent> updateComponentWithHttpInfo(
      UUID pageId,
      UUID componentId,
      PatchComponentRequest body,
      UpdateComponentOptionalParameters parameters)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'pageId' is set
    if (pageId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'pageId' when calling updateComponent");
    }

    // verify the required parameter 'componentId' is set
    if (componentId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'componentId' when calling updateComponent");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateComponent");
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath =
        "/api/v2/statuspages/{page_id}/components/{component_id}"
            .replaceAll("\\{" + "page_id" + "\\}", apiClient.escapeString(pageId.toString()))
            .replaceAll(
                "\\{" + "component_id" + "\\}", apiClient.escapeString(componentId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.StatusPagesApi.updateComponent",
            localVarPath,
            localVarQueryParams,
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
        new GenericType<StatusPagesComponent>() {});
  }

  /**
   * Update component.
   *
   * <p>See {@link #updateComponentWithHttpInfo}.
   *
   * @param pageId The ID of the status page. (required)
   * @param componentId The ID of the component. (required)
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;StatusPagesComponent&gt;&gt;
   */
  public CompletableFuture<ApiResponse<StatusPagesComponent>> updateComponentWithHttpInfoAsync(
      UUID pageId,
      UUID componentId,
      PatchComponentRequest body,
      UpdateComponentOptionalParameters parameters) {
    Object localVarPostBody = body;

    // verify the required parameter 'pageId' is set
    if (pageId == null) {
      CompletableFuture<ApiResponse<StatusPagesComponent>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'pageId' when calling updateComponent"));
      return result;
    }

    // verify the required parameter 'componentId' is set
    if (componentId == null) {
      CompletableFuture<ApiResponse<StatusPagesComponent>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'componentId' when calling updateComponent"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<StatusPagesComponent>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateComponent"));
      return result;
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath =
        "/api/v2/statuspages/{page_id}/components/{component_id}"
            .replaceAll("\\{" + "page_id" + "\\}", apiClient.escapeString(pageId.toString()))
            .replaceAll(
                "\\{" + "component_id" + "\\}", apiClient.escapeString(componentId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.StatusPagesApi.updateComponent",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<StatusPagesComponent>> result = new CompletableFuture<>();
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
        new GenericType<StatusPagesComponent>() {});
  }

  /** Manage optional parameters to updateDegradation. */
  public static class UpdateDegradationOptionalParameters {
    private Boolean notifySubscribers;
    private String include;

    /**
     * Set notifySubscribers.
     *
     * @param notifySubscribers Whether to notify page subscribers of the degradation or
     *     maintenance. (optional, default to true)
     * @return UpdateDegradationOptionalParameters
     */
    public UpdateDegradationOptionalParameters notifySubscribers(Boolean notifySubscribers) {
      this.notifySubscribers = notifySubscribers;
      return this;
    }

    /**
     * Set include.
     *
     * @param include Comma-separated list of resources to include. Supported values:
     *     created_by_user, last_modified_by_user, status_page. (optional)
     * @return UpdateDegradationOptionalParameters
     */
    public UpdateDegradationOptionalParameters include(String include) {
      this.include = include;
      return this;
    }
  }

  /**
   * Update degradation.
   *
   * <p>See {@link #updateDegradationWithHttpInfo}.
   *
   * @param pageId The ID of the status page. (required)
   * @param degradationId The ID of the degradation. (required)
   * @param body (required)
   * @return Degradation
   * @throws ApiException if fails to make API call
   */
  public Degradation updateDegradation(
      UUID pageId, UUID degradationId, PatchDegradationRequest body) throws ApiException {
    return updateDegradationWithHttpInfo(
            pageId, degradationId, body, new UpdateDegradationOptionalParameters())
        .getData();
  }

  /**
   * Update degradation.
   *
   * <p>See {@link #updateDegradationWithHttpInfoAsync}.
   *
   * @param pageId The ID of the status page. (required)
   * @param degradationId The ID of the degradation. (required)
   * @param body (required)
   * @return CompletableFuture&lt;Degradation&gt;
   */
  public CompletableFuture<Degradation> updateDegradationAsync(
      UUID pageId, UUID degradationId, PatchDegradationRequest body) {
    return updateDegradationWithHttpInfoAsync(
            pageId, degradationId, body, new UpdateDegradationOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update degradation.
   *
   * <p>See {@link #updateDegradationWithHttpInfo}.
   *
   * @param pageId The ID of the status page. (required)
   * @param degradationId The ID of the degradation. (required)
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return Degradation
   * @throws ApiException if fails to make API call
   */
  public Degradation updateDegradation(
      UUID pageId,
      UUID degradationId,
      PatchDegradationRequest body,
      UpdateDegradationOptionalParameters parameters)
      throws ApiException {
    return updateDegradationWithHttpInfo(pageId, degradationId, body, parameters).getData();
  }

  /**
   * Update degradation.
   *
   * <p>See {@link #updateDegradationWithHttpInfoAsync}.
   *
   * @param pageId The ID of the status page. (required)
   * @param degradationId The ID of the degradation. (required)
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;Degradation&gt;
   */
  public CompletableFuture<Degradation> updateDegradationAsync(
      UUID pageId,
      UUID degradationId,
      PatchDegradationRequest body,
      UpdateDegradationOptionalParameters parameters) {
    return updateDegradationWithHttpInfoAsync(pageId, degradationId, body, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Updates an existing degradation's attributes.
   *
   * @param pageId The ID of the status page. (required)
   * @param degradationId The ID of the degradation. (required)
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;Degradation&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Degradation> updateDegradationWithHttpInfo(
      UUID pageId,
      UUID degradationId,
      PatchDegradationRequest body,
      UpdateDegradationOptionalParameters parameters)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'pageId' is set
    if (pageId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'pageId' when calling updateDegradation");
    }

    // verify the required parameter 'degradationId' is set
    if (degradationId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'degradationId' when calling updateDegradation");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateDegradation");
    }
    Boolean notifySubscribers = parameters.notifySubscribers;
    String include = parameters.include;
    // create path and map variables
    String localVarPath =
        "/api/v2/statuspages/{page_id}/degradations/{degradation_id}"
            .replaceAll("\\{" + "page_id" + "\\}", apiClient.escapeString(pageId.toString()))
            .replaceAll(
                "\\{" + "degradation_id" + "\\}", apiClient.escapeString(degradationId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "notify_subscribers", notifySubscribers));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.StatusPagesApi.updateDegradation",
            localVarPath,
            localVarQueryParams,
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
        new GenericType<Degradation>() {});
  }

  /**
   * Update degradation.
   *
   * <p>See {@link #updateDegradationWithHttpInfo}.
   *
   * @param pageId The ID of the status page. (required)
   * @param degradationId The ID of the degradation. (required)
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;Degradation&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Degradation>> updateDegradationWithHttpInfoAsync(
      UUID pageId,
      UUID degradationId,
      PatchDegradationRequest body,
      UpdateDegradationOptionalParameters parameters) {
    Object localVarPostBody = body;

    // verify the required parameter 'pageId' is set
    if (pageId == null) {
      CompletableFuture<ApiResponse<Degradation>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'pageId' when calling updateDegradation"));
      return result;
    }

    // verify the required parameter 'degradationId' is set
    if (degradationId == null) {
      CompletableFuture<ApiResponse<Degradation>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'degradationId' when calling updateDegradation"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Degradation>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateDegradation"));
      return result;
    }
    Boolean notifySubscribers = parameters.notifySubscribers;
    String include = parameters.include;
    // create path and map variables
    String localVarPath =
        "/api/v2/statuspages/{page_id}/degradations/{degradation_id}"
            .replaceAll("\\{" + "page_id" + "\\}", apiClient.escapeString(pageId.toString()))
            .replaceAll(
                "\\{" + "degradation_id" + "\\}", apiClient.escapeString(degradationId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "notify_subscribers", notifySubscribers));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.StatusPagesApi.updateDegradation",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Degradation>> result = new CompletableFuture<>();
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
        new GenericType<Degradation>() {});
  }

  /** Manage optional parameters to updateStatusPage. */
  public static class UpdateStatusPageOptionalParameters {
    private Boolean deleteSubscribers;
    private String include;

    /**
     * Set deleteSubscribers.
     *
     * @param deleteSubscribers Whether to delete existing subscribers when updating a status page's
     *     type. (optional, default to false)
     * @return UpdateStatusPageOptionalParameters
     */
    public UpdateStatusPageOptionalParameters deleteSubscribers(Boolean deleteSubscribers) {
      this.deleteSubscribers = deleteSubscribers;
      return this;
    }

    /**
     * Set include.
     *
     * @param include Comma-separated list of resources to include. Supported values:
     *     created_by_user, last_modified_by_user. (optional)
     * @return UpdateStatusPageOptionalParameters
     */
    public UpdateStatusPageOptionalParameters include(String include) {
      this.include = include;
      return this;
    }
  }

  /**
   * Update status page.
   *
   * <p>See {@link #updateStatusPageWithHttpInfo}.
   *
   * @param pageId The ID of the status page. (required)
   * @param body (required)
   * @return StatusPage
   * @throws ApiException if fails to make API call
   */
  public StatusPage updateStatusPage(UUID pageId, PatchStatusPageRequest body) throws ApiException {
    return updateStatusPageWithHttpInfo(pageId, body, new UpdateStatusPageOptionalParameters())
        .getData();
  }

  /**
   * Update status page.
   *
   * <p>See {@link #updateStatusPageWithHttpInfoAsync}.
   *
   * @param pageId The ID of the status page. (required)
   * @param body (required)
   * @return CompletableFuture&lt;StatusPage&gt;
   */
  public CompletableFuture<StatusPage> updateStatusPageAsync(
      UUID pageId, PatchStatusPageRequest body) {
    return updateStatusPageWithHttpInfoAsync(pageId, body, new UpdateStatusPageOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update status page.
   *
   * <p>See {@link #updateStatusPageWithHttpInfo}.
   *
   * @param pageId The ID of the status page. (required)
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return StatusPage
   * @throws ApiException if fails to make API call
   */
  public StatusPage updateStatusPage(
      UUID pageId, PatchStatusPageRequest body, UpdateStatusPageOptionalParameters parameters)
      throws ApiException {
    return updateStatusPageWithHttpInfo(pageId, body, parameters).getData();
  }

  /**
   * Update status page.
   *
   * <p>See {@link #updateStatusPageWithHttpInfoAsync}.
   *
   * @param pageId The ID of the status page. (required)
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;StatusPage&gt;
   */
  public CompletableFuture<StatusPage> updateStatusPageAsync(
      UUID pageId, PatchStatusPageRequest body, UpdateStatusPageOptionalParameters parameters) {
    return updateStatusPageWithHttpInfoAsync(pageId, body, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Updates an existing status page's attributes.
   *
   * @param pageId The ID of the status page. (required)
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;StatusPage&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<StatusPage> updateStatusPageWithHttpInfo(
      UUID pageId, PatchStatusPageRequest body, UpdateStatusPageOptionalParameters parameters)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'pageId' is set
    if (pageId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'pageId' when calling updateStatusPage");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateStatusPage");
    }
    Boolean deleteSubscribers = parameters.deleteSubscribers;
    String include = parameters.include;
    // create path and map variables
    String localVarPath =
        "/api/v2/statuspages/{page_id}"
            .replaceAll("\\{" + "page_id" + "\\}", apiClient.escapeString(pageId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "delete_subscribers", deleteSubscribers));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.StatusPagesApi.updateStatusPage",
            localVarPath,
            localVarQueryParams,
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
        new GenericType<StatusPage>() {});
  }

  /**
   * Update status page.
   *
   * <p>See {@link #updateStatusPageWithHttpInfo}.
   *
   * @param pageId The ID of the status page. (required)
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;StatusPage&gt;&gt;
   */
  public CompletableFuture<ApiResponse<StatusPage>> updateStatusPageWithHttpInfoAsync(
      UUID pageId, PatchStatusPageRequest body, UpdateStatusPageOptionalParameters parameters) {
    Object localVarPostBody = body;

    // verify the required parameter 'pageId' is set
    if (pageId == null) {
      CompletableFuture<ApiResponse<StatusPage>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'pageId' when calling updateStatusPage"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<StatusPage>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateStatusPage"));
      return result;
    }
    Boolean deleteSubscribers = parameters.deleteSubscribers;
    String include = parameters.include;
    // create path and map variables
    String localVarPath =
        "/api/v2/statuspages/{page_id}"
            .replaceAll("\\{" + "page_id" + "\\}", apiClient.escapeString(pageId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "delete_subscribers", deleteSubscribers));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.StatusPagesApi.updateStatusPage",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<StatusPage>> result = new CompletableFuture<>();
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
        new GenericType<StatusPage>() {});
  }
}
