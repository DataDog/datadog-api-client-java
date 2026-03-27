package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.CreateOrUpdateWidgetRequest;
import com.datadog.api.client.v2.model.WidgetExperienceType;
import com.datadog.api.client.v2.model.WidgetListResponse;
import com.datadog.api.client.v2.model.WidgetResponse;
import com.datadog.api.client.v2.model.WidgetType;
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
public class WidgetsApi {
  private ApiClient apiClient;

  public WidgetsApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public WidgetsApi(ApiClient apiClient) {
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
   * Create a widget.
   *
   * <p>See {@link #createWidgetWithHttpInfo}.
   *
   * @param experienceType The experience type for the widget. (required)
   * @param body Widget request body. (required)
   * @return WidgetResponse
   * @throws ApiException if fails to make API call
   */
  public WidgetResponse createWidget(
      WidgetExperienceType experienceType, CreateOrUpdateWidgetRequest body) throws ApiException {
    return createWidgetWithHttpInfo(experienceType, body).getData();
  }

  /**
   * Create a widget.
   *
   * <p>See {@link #createWidgetWithHttpInfoAsync}.
   *
   * @param experienceType The experience type for the widget. (required)
   * @param body Widget request body. (required)
   * @return CompletableFuture&lt;WidgetResponse&gt;
   */
  public CompletableFuture<WidgetResponse> createWidgetAsync(
      WidgetExperienceType experienceType, CreateOrUpdateWidgetRequest body) {
    return createWidgetWithHttpInfoAsync(experienceType, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a new widget for a given experience type.
   *
   * @param experienceType The experience type for the widget. (required)
   * @param body Widget request body. (required)
   * @return ApiResponse&lt;WidgetResponse&gt;
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
  public ApiResponse<WidgetResponse> createWidgetWithHttpInfo(
      WidgetExperienceType experienceType, CreateOrUpdateWidgetRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'experienceType' is set
    if (experienceType == null) {
      throw new ApiException(
          400, "Missing the required parameter 'experienceType' when calling createWidget");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createWidget");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/widgets/{experience_type}"
            .replaceAll(
                "\\{" + "experience_type" + "\\}",
                apiClient.escapeString(experienceType.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.WidgetsApi.createWidget",
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
        new GenericType<WidgetResponse>() {});
  }

  /**
   * Create a widget.
   *
   * <p>See {@link #createWidgetWithHttpInfo}.
   *
   * @param experienceType The experience type for the widget. (required)
   * @param body Widget request body. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;WidgetResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<WidgetResponse>> createWidgetWithHttpInfoAsync(
      WidgetExperienceType experienceType, CreateOrUpdateWidgetRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'experienceType' is set
    if (experienceType == null) {
      CompletableFuture<ApiResponse<WidgetResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'experienceType' when calling createWidget"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<WidgetResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'body' when calling createWidget"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/widgets/{experience_type}"
            .replaceAll(
                "\\{" + "experience_type" + "\\}",
                apiClient.escapeString(experienceType.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.WidgetsApi.createWidget",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<WidgetResponse>> result = new CompletableFuture<>();
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
        new GenericType<WidgetResponse>() {});
  }

  /**
   * Delete a widget.
   *
   * <p>See {@link #deleteWidgetWithHttpInfo}.
   *
   * @param experienceType The experience type for the widget. (required)
   * @param uuid The UUID of the widget. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteWidget(WidgetExperienceType experienceType, UUID uuid) throws ApiException {
    deleteWidgetWithHttpInfo(experienceType, uuid);
  }

  /**
   * Delete a widget.
   *
   * <p>See {@link #deleteWidgetWithHttpInfoAsync}.
   *
   * @param experienceType The experience type for the widget. (required)
   * @param uuid The UUID of the widget. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteWidgetAsync(WidgetExperienceType experienceType, UUID uuid) {
    return deleteWidgetWithHttpInfoAsync(experienceType, uuid)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Soft-delete a widget by its UUID for a given experience type.
   *
   * @param experienceType The experience type for the widget. (required)
   * @param uuid The UUID of the widget. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteWidgetWithHttpInfo(WidgetExperienceType experienceType, UUID uuid)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'experienceType' is set
    if (experienceType == null) {
      throw new ApiException(
          400, "Missing the required parameter 'experienceType' when calling deleteWidget");
    }

    // verify the required parameter 'uuid' is set
    if (uuid == null) {
      throw new ApiException(
          400, "Missing the required parameter 'uuid' when calling deleteWidget");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/widgets/{experience_type}/{uuid}"
            .replaceAll(
                "\\{" + "experience_type" + "\\}",
                apiClient.escapeString(experienceType.toString()))
            .replaceAll("\\{" + "uuid" + "\\}", apiClient.escapeString(uuid.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.WidgetsApi.deleteWidget",
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
   * Delete a widget.
   *
   * <p>See {@link #deleteWidgetWithHttpInfo}.
   *
   * @param experienceType The experience type for the widget. (required)
   * @param uuid The UUID of the widget. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteWidgetWithHttpInfoAsync(
      WidgetExperienceType experienceType, UUID uuid) {
    Object localVarPostBody = null;

    // verify the required parameter 'experienceType' is set
    if (experienceType == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'experienceType' when calling deleteWidget"));
      return result;
    }

    // verify the required parameter 'uuid' is set
    if (uuid == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'uuid' when calling deleteWidget"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/widgets/{experience_type}/{uuid}"
            .replaceAll(
                "\\{" + "experience_type" + "\\}",
                apiClient.escapeString(experienceType.toString()))
            .replaceAll("\\{" + "uuid" + "\\}", apiClient.escapeString(uuid.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.WidgetsApi.deleteWidget",
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
   * Get a widget.
   *
   * <p>See {@link #getWidgetWithHttpInfo}.
   *
   * @param experienceType The experience type for the widget. (required)
   * @param uuid The UUID of the widget. (required)
   * @return WidgetResponse
   * @throws ApiException if fails to make API call
   */
  public WidgetResponse getWidget(WidgetExperienceType experienceType, UUID uuid)
      throws ApiException {
    return getWidgetWithHttpInfo(experienceType, uuid).getData();
  }

  /**
   * Get a widget.
   *
   * <p>See {@link #getWidgetWithHttpInfoAsync}.
   *
   * @param experienceType The experience type for the widget. (required)
   * @param uuid The UUID of the widget. (required)
   * @return CompletableFuture&lt;WidgetResponse&gt;
   */
  public CompletableFuture<WidgetResponse> getWidgetAsync(
      WidgetExperienceType experienceType, UUID uuid) {
    return getWidgetWithHttpInfoAsync(experienceType, uuid)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Retrieve a widget by its UUID for a given experience type.
   *
   * @param experienceType The experience type for the widget. (required)
   * @param uuid The UUID of the widget. (required)
   * @return ApiResponse&lt;WidgetResponse&gt;
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
  public ApiResponse<WidgetResponse> getWidgetWithHttpInfo(
      WidgetExperienceType experienceType, UUID uuid) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'experienceType' is set
    if (experienceType == null) {
      throw new ApiException(
          400, "Missing the required parameter 'experienceType' when calling getWidget");
    }

    // verify the required parameter 'uuid' is set
    if (uuid == null) {
      throw new ApiException(400, "Missing the required parameter 'uuid' when calling getWidget");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/widgets/{experience_type}/{uuid}"
            .replaceAll(
                "\\{" + "experience_type" + "\\}",
                apiClient.escapeString(experienceType.toString()))
            .replaceAll("\\{" + "uuid" + "\\}", apiClient.escapeString(uuid.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.WidgetsApi.getWidget",
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
        new GenericType<WidgetResponse>() {});
  }

  /**
   * Get a widget.
   *
   * <p>See {@link #getWidgetWithHttpInfo}.
   *
   * @param experienceType The experience type for the widget. (required)
   * @param uuid The UUID of the widget. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;WidgetResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<WidgetResponse>> getWidgetWithHttpInfoAsync(
      WidgetExperienceType experienceType, UUID uuid) {
    Object localVarPostBody = null;

    // verify the required parameter 'experienceType' is set
    if (experienceType == null) {
      CompletableFuture<ApiResponse<WidgetResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'experienceType' when calling getWidget"));
      return result;
    }

    // verify the required parameter 'uuid' is set
    if (uuid == null) {
      CompletableFuture<ApiResponse<WidgetResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'uuid' when calling getWidget"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/widgets/{experience_type}/{uuid}"
            .replaceAll(
                "\\{" + "experience_type" + "\\}",
                apiClient.escapeString(experienceType.toString()))
            .replaceAll("\\{" + "uuid" + "\\}", apiClient.escapeString(uuid.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.WidgetsApi.getWidget",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<WidgetResponse>> result = new CompletableFuture<>();
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
        new GenericType<WidgetResponse>() {});
  }

  /** Manage optional parameters to searchWidgets. */
  public static class SearchWidgetsOptionalParameters {
    private WidgetType filterWidgetType;
    private String filterCreatorHandle;
    private Boolean filterIsFavorited;
    private String filterTitle;
    private String filterTags;
    private String sort;
    private Integer pageNumber;
    private Integer pageSize;

    /**
     * Set filterWidgetType.
     *
     * @param filterWidgetType Filter widgets by widget type. (optional)
     * @return SearchWidgetsOptionalParameters
     */
    public SearchWidgetsOptionalParameters filterWidgetType(WidgetType filterWidgetType) {
      this.filterWidgetType = filterWidgetType;
      return this;
    }

    /**
     * Set filterCreatorHandle.
     *
     * @param filterCreatorHandle Filter widgets by the email handle of the creator. (optional)
     * @return SearchWidgetsOptionalParameters
     */
    public SearchWidgetsOptionalParameters filterCreatorHandle(String filterCreatorHandle) {
      this.filterCreatorHandle = filterCreatorHandle;
      return this;
    }

    /**
     * Set filterIsFavorited.
     *
     * @param filterIsFavorited Filter to only widgets favorited by the current user. (optional)
     * @return SearchWidgetsOptionalParameters
     */
    public SearchWidgetsOptionalParameters filterIsFavorited(Boolean filterIsFavorited) {
      this.filterIsFavorited = filterIsFavorited;
      return this;
    }

    /**
     * Set filterTitle.
     *
     * @param filterTitle Filter widgets by title (substring match). (optional)
     * @return SearchWidgetsOptionalParameters
     */
    public SearchWidgetsOptionalParameters filterTitle(String filterTitle) {
      this.filterTitle = filterTitle;
      return this;
    }

    /**
     * Set filterTags.
     *
     * @param filterTags Filter widgets by tags. Format as bracket-delimited CSV, e.g. <code>
     *     [tag1,tag2]</code>. (optional)
     * @return SearchWidgetsOptionalParameters
     */
    public SearchWidgetsOptionalParameters filterTags(String filterTags) {
      this.filterTags = filterTags;
      return this;
    }

    /**
     * Set sort.
     *
     * @param sort Sort field for the results. Prefix with <code>-</code> for descending order.
     *     Allowed values: <code>title</code>, <code>created_at</code>, <code>modified_at</code>.
     *     (optional, default to "-modified_at")
     * @return SearchWidgetsOptionalParameters
     */
    public SearchWidgetsOptionalParameters sort(String sort) {
      this.sort = sort;
      return this;
    }

    /**
     * Set pageNumber.
     *
     * @param pageNumber Page number for pagination (0-indexed). (optional, default to 0)
     * @return SearchWidgetsOptionalParameters
     */
    public SearchWidgetsOptionalParameters pageNumber(Integer pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set pageSize.
     *
     * @param pageSize Number of widgets per page. (optional, default to 50)
     * @return SearchWidgetsOptionalParameters
     */
    public SearchWidgetsOptionalParameters pageSize(Integer pageSize) {
      this.pageSize = pageSize;
      return this;
    }
  }

  /**
   * Search widgets.
   *
   * <p>See {@link #searchWidgetsWithHttpInfo}.
   *
   * @param experienceType The experience type for the widget. (required)
   * @return WidgetListResponse
   * @throws ApiException if fails to make API call
   */
  public WidgetListResponse searchWidgets(WidgetExperienceType experienceType) throws ApiException {
    return searchWidgetsWithHttpInfo(experienceType, new SearchWidgetsOptionalParameters())
        .getData();
  }

  /**
   * Search widgets.
   *
   * <p>See {@link #searchWidgetsWithHttpInfoAsync}.
   *
   * @param experienceType The experience type for the widget. (required)
   * @return CompletableFuture&lt;WidgetListResponse&gt;
   */
  public CompletableFuture<WidgetListResponse> searchWidgetsAsync(
      WidgetExperienceType experienceType) {
    return searchWidgetsWithHttpInfoAsync(experienceType, new SearchWidgetsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Search widgets.
   *
   * <p>See {@link #searchWidgetsWithHttpInfo}.
   *
   * @param experienceType The experience type for the widget. (required)
   * @param parameters Optional parameters for the request.
   * @return WidgetListResponse
   * @throws ApiException if fails to make API call
   */
  public WidgetListResponse searchWidgets(
      WidgetExperienceType experienceType, SearchWidgetsOptionalParameters parameters)
      throws ApiException {
    return searchWidgetsWithHttpInfo(experienceType, parameters).getData();
  }

  /**
   * Search widgets.
   *
   * <p>See {@link #searchWidgetsWithHttpInfoAsync}.
   *
   * @param experienceType The experience type for the widget. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;WidgetListResponse&gt;
   */
  public CompletableFuture<WidgetListResponse> searchWidgetsAsync(
      WidgetExperienceType experienceType, SearchWidgetsOptionalParameters parameters) {
    return searchWidgetsWithHttpInfoAsync(experienceType, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Search and list widgets for a given experience type. Supports filtering by widget type,
   * creator, title, and tags, as well as sorting and pagination.
   *
   * @param experienceType The experience type for the widget. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;WidgetListResponse&gt;
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
  public ApiResponse<WidgetListResponse> searchWidgetsWithHttpInfo(
      WidgetExperienceType experienceType, SearchWidgetsOptionalParameters parameters)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'experienceType' is set
    if (experienceType == null) {
      throw new ApiException(
          400, "Missing the required parameter 'experienceType' when calling searchWidgets");
    }
    WidgetType filterWidgetType = parameters.filterWidgetType;
    String filterCreatorHandle = parameters.filterCreatorHandle;
    Boolean filterIsFavorited = parameters.filterIsFavorited;
    String filterTitle = parameters.filterTitle;
    String filterTags = parameters.filterTags;
    String sort = parameters.sort;
    Integer pageNumber = parameters.pageNumber;
    Integer pageSize = parameters.pageSize;
    // create path and map variables
    String localVarPath =
        "/api/v2/widgets/{experience_type}"
            .replaceAll(
                "\\{" + "experience_type" + "\\}",
                apiClient.escapeString(experienceType.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[widgetType]", filterWidgetType));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[creatorHandle]", filterCreatorHandle));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[isFavorited]", filterIsFavorited));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[title]", filterTitle));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[tags]", filterTags));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.WidgetsApi.searchWidgets",
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
        new GenericType<WidgetListResponse>() {});
  }

  /**
   * Search widgets.
   *
   * <p>See {@link #searchWidgetsWithHttpInfo}.
   *
   * @param experienceType The experience type for the widget. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;WidgetListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<WidgetListResponse>> searchWidgetsWithHttpInfoAsync(
      WidgetExperienceType experienceType, SearchWidgetsOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'experienceType' is set
    if (experienceType == null) {
      CompletableFuture<ApiResponse<WidgetListResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'experienceType' when calling searchWidgets"));
      return result;
    }
    WidgetType filterWidgetType = parameters.filterWidgetType;
    String filterCreatorHandle = parameters.filterCreatorHandle;
    Boolean filterIsFavorited = parameters.filterIsFavorited;
    String filterTitle = parameters.filterTitle;
    String filterTags = parameters.filterTags;
    String sort = parameters.sort;
    Integer pageNumber = parameters.pageNumber;
    Integer pageSize = parameters.pageSize;
    // create path and map variables
    String localVarPath =
        "/api/v2/widgets/{experience_type}"
            .replaceAll(
                "\\{" + "experience_type" + "\\}",
                apiClient.escapeString(experienceType.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[widgetType]", filterWidgetType));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[creatorHandle]", filterCreatorHandle));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[isFavorited]", filterIsFavorited));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[title]", filterTitle));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[tags]", filterTags));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.WidgetsApi.searchWidgets",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<WidgetListResponse>> result = new CompletableFuture<>();
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
        new GenericType<WidgetListResponse>() {});
  }

  /**
   * Update a widget.
   *
   * <p>See {@link #updateWidgetWithHttpInfo}.
   *
   * @param experienceType The experience type for the widget. (required)
   * @param uuid The UUID of the widget. (required)
   * @param body Widget request body. (required)
   * @return WidgetResponse
   * @throws ApiException if fails to make API call
   */
  public WidgetResponse updateWidget(
      WidgetExperienceType experienceType, UUID uuid, CreateOrUpdateWidgetRequest body)
      throws ApiException {
    return updateWidgetWithHttpInfo(experienceType, uuid, body).getData();
  }

  /**
   * Update a widget.
   *
   * <p>See {@link #updateWidgetWithHttpInfoAsync}.
   *
   * @param experienceType The experience type for the widget. (required)
   * @param uuid The UUID of the widget. (required)
   * @param body Widget request body. (required)
   * @return CompletableFuture&lt;WidgetResponse&gt;
   */
  public CompletableFuture<WidgetResponse> updateWidgetAsync(
      WidgetExperienceType experienceType, UUID uuid, CreateOrUpdateWidgetRequest body) {
    return updateWidgetWithHttpInfoAsync(experienceType, uuid, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update a widget by its UUID for a given experience type. This performs a full replacement of
   * the widget definition.
   *
   * @param experienceType The experience type for the widget. (required)
   * @param uuid The UUID of the widget. (required)
   * @param body Widget request body. (required)
   * @return ApiResponse&lt;WidgetResponse&gt;
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
  public ApiResponse<WidgetResponse> updateWidgetWithHttpInfo(
      WidgetExperienceType experienceType, UUID uuid, CreateOrUpdateWidgetRequest body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'experienceType' is set
    if (experienceType == null) {
      throw new ApiException(
          400, "Missing the required parameter 'experienceType' when calling updateWidget");
    }

    // verify the required parameter 'uuid' is set
    if (uuid == null) {
      throw new ApiException(
          400, "Missing the required parameter 'uuid' when calling updateWidget");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateWidget");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/widgets/{experience_type}/{uuid}"
            .replaceAll(
                "\\{" + "experience_type" + "\\}",
                apiClient.escapeString(experienceType.toString()))
            .replaceAll("\\{" + "uuid" + "\\}", apiClient.escapeString(uuid.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.WidgetsApi.updateWidget",
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
        new GenericType<WidgetResponse>() {});
  }

  /**
   * Update a widget.
   *
   * <p>See {@link #updateWidgetWithHttpInfo}.
   *
   * @param experienceType The experience type for the widget. (required)
   * @param uuid The UUID of the widget. (required)
   * @param body Widget request body. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;WidgetResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<WidgetResponse>> updateWidgetWithHttpInfoAsync(
      WidgetExperienceType experienceType, UUID uuid, CreateOrUpdateWidgetRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'experienceType' is set
    if (experienceType == null) {
      CompletableFuture<ApiResponse<WidgetResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'experienceType' when calling updateWidget"));
      return result;
    }

    // verify the required parameter 'uuid' is set
    if (uuid == null) {
      CompletableFuture<ApiResponse<WidgetResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'uuid' when calling updateWidget"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<WidgetResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'body' when calling updateWidget"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/widgets/{experience_type}/{uuid}"
            .replaceAll(
                "\\{" + "experience_type" + "\\}",
                apiClient.escapeString(experienceType.toString()))
            .replaceAll("\\{" + "uuid" + "\\}", apiClient.escapeString(uuid.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.WidgetsApi.updateWidget",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<WidgetResponse>> result = new CompletableFuture<>();
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
        new GenericType<WidgetResponse>() {});
  }
}
