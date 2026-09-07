package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.PaginationIterable;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.ListSourcemapsResponse;
import com.datadog.api.client.v2.model.RUMAggregateRequest;
import com.datadog.api.client.v2.model.RUMAnalyticsAggregateResponse;
import com.datadog.api.client.v2.model.RUMApplicationCreateRequest;
import com.datadog.api.client.v2.model.RUMApplicationResponse;
import com.datadog.api.client.v2.model.RUMApplicationUpdateRequest;
import com.datadog.api.client.v2.model.RUMApplicationsResponse;
import com.datadog.api.client.v2.model.RUMEvent;
import com.datadog.api.client.v2.model.RUMEventsResponse;
import com.datadog.api.client.v2.model.RUMQueryPageOptions;
import com.datadog.api.client.v2.model.RUMSearchEventsRequest;
import com.datadog.api.client.v2.model.RUMSort;
import com.datadog.api.client.v2.model.ServiceRepositoryInfoRequest;
import com.datadog.api.client.v2.model.ServiceRepositoryInfoResponse;
import com.datadog.api.client.v2.model.SourcemapFileResponse;
import com.datadog.api.client.v2.model.SourcemapMapKind;
import com.datadog.api.client.v2.model.SourcemapsResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RumApi {
  private ApiClient apiClient;

  public RumApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public RumApi(ApiClient apiClient) {
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
   * Aggregate RUM events.
   *
   * <p>See {@link #aggregateRUMEventsWithHttpInfo}.
   *
   * @param body (required)
   * @return RUMAnalyticsAggregateResponse
   * @throws ApiException if fails to make API call
   */
  public RUMAnalyticsAggregateResponse aggregateRUMEvents(RUMAggregateRequest body)
      throws ApiException {
    return aggregateRUMEventsWithHttpInfo(body).getData();
  }

  /**
   * Aggregate RUM events.
   *
   * <p>See {@link #aggregateRUMEventsWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;RUMAnalyticsAggregateResponse&gt;
   */
  public CompletableFuture<RUMAnalyticsAggregateResponse> aggregateRUMEventsAsync(
      RUMAggregateRequest body) {
    return aggregateRUMEventsWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * The API endpoint to aggregate RUM events into buckets of computed metrics and timeseries.
   *
   * @param body (required)
   * @return ApiResponse&lt;RUMAnalyticsAggregateResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<RUMAnalyticsAggregateResponse> aggregateRUMEventsWithHttpInfo(
      RUMAggregateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling aggregateRUMEvents");
    }
    // create path and map variables
    String localVarPath = "/api/v2/rum/analytics/aggregate";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumApi.aggregateRUMEvents",
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
        new GenericType<RUMAnalyticsAggregateResponse>() {});
  }

  /**
   * Aggregate RUM events.
   *
   * <p>See {@link #aggregateRUMEventsWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;RUMAnalyticsAggregateResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RUMAnalyticsAggregateResponse>>
      aggregateRUMEventsWithHttpInfoAsync(RUMAggregateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<RUMAnalyticsAggregateResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling aggregateRUMEvents"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/rum/analytics/aggregate";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumApi.aggregateRUMEvents",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RUMAnalyticsAggregateResponse>> result =
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
        new GenericType<RUMAnalyticsAggregateResponse>() {});
  }

  /**
   * Create a new RUM application.
   *
   * <p>See {@link #createRUMApplicationWithHttpInfo}.
   *
   * @param body (required)
   * @return RUMApplicationResponse
   * @throws ApiException if fails to make API call
   */
  public RUMApplicationResponse createRUMApplication(RUMApplicationCreateRequest body)
      throws ApiException {
    return createRUMApplicationWithHttpInfo(body).getData();
  }

  /**
   * Create a new RUM application.
   *
   * <p>See {@link #createRUMApplicationWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;RUMApplicationResponse&gt;
   */
  public CompletableFuture<RUMApplicationResponse> createRUMApplicationAsync(
      RUMApplicationCreateRequest body) {
    return createRUMApplicationWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a new RUM application in your organization.
   *
   * @param body (required)
   * @return ApiResponse&lt;RUMApplicationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<RUMApplicationResponse> createRUMApplicationWithHttpInfo(
      RUMApplicationCreateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createRUMApplication");
    }
    // create path and map variables
    String localVarPath = "/api/v2/rum/applications";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumApi.createRUMApplication",
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
        new GenericType<RUMApplicationResponse>() {});
  }

  /**
   * Create a new RUM application.
   *
   * <p>See {@link #createRUMApplicationWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;RUMApplicationResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RUMApplicationResponse>>
      createRUMApplicationWithHttpInfoAsync(RUMApplicationCreateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<RUMApplicationResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createRUMApplication"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/rum/applications";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumApi.createRUMApplication",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RUMApplicationResponse>> result = new CompletableFuture<>();
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
        new GenericType<RUMApplicationResponse>() {});
  }

  /**
   * Delete a RUM application.
   *
   * <p>See {@link #deleteRUMApplicationWithHttpInfo}.
   *
   * @param id RUM application ID. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteRUMApplication(String id) throws ApiException {
    deleteRUMApplicationWithHttpInfo(id);
  }

  /**
   * Delete a RUM application.
   *
   * <p>See {@link #deleteRUMApplicationWithHttpInfoAsync}.
   *
   * @param id RUM application ID. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteRUMApplicationAsync(String id) {
    return deleteRUMApplicationWithHttpInfoAsync(id)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete an existing RUM application in your organization.
   *
   * @param id RUM application ID. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteRUMApplicationWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(
          400, "Missing the required parameter 'id' when calling deleteRUMApplication");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/applications/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumApi.deleteRUMApplication",
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
   * Delete a RUM application.
   *
   * <p>See {@link #deleteRUMApplicationWithHttpInfo}.
   *
   * @param id RUM application ID. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteRUMApplicationWithHttpInfoAsync(String id) {
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'id' when calling deleteRUMApplication"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/applications/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumApi.deleteRUMApplication",
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

  /** Manage optional parameters to deleteSourcemaps. */
  public static class DeleteSourcemapsOptionalParameters {
    private List<String> filterService;
    private List<String> filterVersion;
    private List<String> filterVariant;
    private List<String> filterId;
    private List<String> filterBuildId;
    private List<String> filterUuid;
    private List<String> filterPlatform;
    private List<String> filterBuildNumber;
    private List<String> filterBundleName;
    private List<String> filterArch;
    private List<String> filterSymbolSource;
    private List<String> filterOrigin;
    private List<String> filterOriginVersion;
    private String filterFilename;
    private String filterDebugId;
    private String filterGnuBuildId;
    private String filterGoBuildId;
    private String filterFileHash;

    /**
     * Set filterService.
     *
     * @param filterService Filter by service names (multiple values allowed). Required for <code>js
     *     </code>, <code>jvm</code>, <code>react</code>, and <code>flutter</code> map kinds.
     *     (optional)
     * @return DeleteSourcemapsOptionalParameters
     */
    public DeleteSourcemapsOptionalParameters filterService(List<String> filterService) {
      this.filterService = filterService;
      return this;
    }

    /**
     * Set filterVersion.
     *
     * @param filterVersion Filter by version values (multiple values allowed, maximum 10). Required
     *     for <code>js</code>, <code>jvm</code>, <code>react</code>, and <code>flutter</code> map
     *     kinds. (optional)
     * @return DeleteSourcemapsOptionalParameters
     */
    public DeleteSourcemapsOptionalParameters filterVersion(List<String> filterVersion) {
      this.filterVersion = filterVersion;
      return this;
    }

    /**
     * Set filterVariant.
     *
     * @param filterVariant Filter by variant values (multiple values allowed). Supported for <code>
     *     jvm</code>. (optional)
     * @return DeleteSourcemapsOptionalParameters
     */
    public DeleteSourcemapsOptionalParameters filterVariant(List<String> filterVariant) {
      this.filterVariant = filterVariant;
      return this;
    }

    /**
     * Set filterId.
     *
     * @param filterId Filter by source map ID values (multiple values allowed). Supported for all
     *     map kinds. (optional)
     * @return DeleteSourcemapsOptionalParameters
     */
    public DeleteSourcemapsOptionalParameters filterId(List<String> filterId) {
      this.filterId = filterId;
      return this;
    }

    /**
     * Set filterBuildId.
     *
     * @param filterBuildId Filter by build ID values (multiple values allowed). Supported for
     *     <code>jvm</code>, <code>ndk</code>, and <code>il2cpp</code>. (optional)
     * @return DeleteSourcemapsOptionalParameters
     */
    public DeleteSourcemapsOptionalParameters filterBuildId(List<String> filterBuildId) {
      this.filterBuildId = filterBuildId;
      return this;
    }

    /**
     * Set filterUuid.
     *
     * @param filterUuid Filter by UUID values (multiple values allowed). Supported for <code>ios
     *     </code>. (optional)
     * @return DeleteSourcemapsOptionalParameters
     */
    public DeleteSourcemapsOptionalParameters filterUuid(List<String> filterUuid) {
      this.filterUuid = filterUuid;
      return this;
    }

    /**
     * Set filterPlatform.
     *
     * @param filterPlatform Filter by platform values (multiple values allowed). Supported for
     *     <code>react</code>. (optional)
     * @return DeleteSourcemapsOptionalParameters
     */
    public DeleteSourcemapsOptionalParameters filterPlatform(List<String> filterPlatform) {
      this.filterPlatform = filterPlatform;
      return this;
    }

    /**
     * Set filterBuildNumber.
     *
     * @param filterBuildNumber Filter by build number values (multiple values allowed). Supported
     *     for <code>react</code>. (optional)
     * @return DeleteSourcemapsOptionalParameters
     */
    public DeleteSourcemapsOptionalParameters filterBuildNumber(List<String> filterBuildNumber) {
      this.filterBuildNumber = filterBuildNumber;
      return this;
    }

    /**
     * Set filterBundleName.
     *
     * @param filterBundleName Filter by bundle name values (multiple values allowed). Supported for
     *     <code>react</code>. (optional)
     * @return DeleteSourcemapsOptionalParameters
     */
    public DeleteSourcemapsOptionalParameters filterBundleName(List<String> filterBundleName) {
      this.filterBundleName = filterBundleName;
      return this;
    }

    /**
     * Set filterArch.
     *
     * @param filterArch Filter by architecture values (multiple values allowed). Supported for
     *     <code>flutter</code>, <code>elf</code>, and <code>ndk</code>. (optional)
     * @return DeleteSourcemapsOptionalParameters
     */
    public DeleteSourcemapsOptionalParameters filterArch(List<String> filterArch) {
      this.filterArch = filterArch;
      return this;
    }

    /**
     * Set filterSymbolSource.
     *
     * @param filterSymbolSource Filter by symbol source values (multiple values allowed). Supported
     *     for <code>elf</code>. (optional)
     * @return DeleteSourcemapsOptionalParameters
     */
    public DeleteSourcemapsOptionalParameters filterSymbolSource(List<String> filterSymbolSource) {
      this.filterSymbolSource = filterSymbolSource;
      return this;
    }

    /**
     * Set filterOrigin.
     *
     * @param filterOrigin Filter by origin values (multiple values allowed). Supported for <code>
     *     elf</code>. (optional)
     * @return DeleteSourcemapsOptionalParameters
     */
    public DeleteSourcemapsOptionalParameters filterOrigin(List<String> filterOrigin) {
      this.filterOrigin = filterOrigin;
      return this;
    }

    /**
     * Set filterOriginVersion.
     *
     * @param filterOriginVersion Filter by origin version values (multiple values allowed).
     *     Supported for <code>elf</code>. (optional)
     * @return DeleteSourcemapsOptionalParameters
     */
    public DeleteSourcemapsOptionalParameters filterOriginVersion(
        List<String> filterOriginVersion) {
      this.filterOriginVersion = filterOriginVersion;
      return this;
    }

    /**
     * Set filterFilename.
     *
     * @param filterFilename Filter by filename (single value). Supported for <code>js</code>,
     *     <code>elf</code>, and <code>ndk</code>. (optional)
     * @return DeleteSourcemapsOptionalParameters
     */
    public DeleteSourcemapsOptionalParameters filterFilename(String filterFilename) {
      this.filterFilename = filterFilename;
      return this;
    }

    /**
     * Set filterDebugId.
     *
     * @param filterDebugId Filter by debug ID (single value). Supported for <code>react</code>.
     *     (optional)
     * @return DeleteSourcemapsOptionalParameters
     */
    public DeleteSourcemapsOptionalParameters filterDebugId(String filterDebugId) {
      this.filterDebugId = filterDebugId;
      return this;
    }

    /**
     * Set filterGnuBuildId.
     *
     * @param filterGnuBuildId Filter by GNU build ID (single value). Supported for <code>elf</code>
     *     . (optional)
     * @return DeleteSourcemapsOptionalParameters
     */
    public DeleteSourcemapsOptionalParameters filterGnuBuildId(String filterGnuBuildId) {
      this.filterGnuBuildId = filterGnuBuildId;
      return this;
    }

    /**
     * Set filterGoBuildId.
     *
     * @param filterGoBuildId Filter by Go build ID (single value). Supported for <code>elf</code>.
     *     (optional)
     * @return DeleteSourcemapsOptionalParameters
     */
    public DeleteSourcemapsOptionalParameters filterGoBuildId(String filterGoBuildId) {
      this.filterGoBuildId = filterGoBuildId;
      return this;
    }

    /**
     * Set filterFileHash.
     *
     * @param filterFileHash Filter by file hash (single value). Supported for <code>elf</code>.
     *     (optional)
     * @return DeleteSourcemapsOptionalParameters
     */
    public DeleteSourcemapsOptionalParameters filterFileHash(String filterFileHash) {
      this.filterFileHash = filterFileHash;
      return this;
    }
  }

  /**
   * Delete source maps.
   *
   * <p>See {@link #deleteSourcemapsWithHttpInfo}.
   *
   * @param mapkind The type of source map. Valid values are <code>js</code>, <code>jvm</code>,
   *     <code>ios</code>, <code>react</code>, <code>flutter</code>, <code>elf</code>, <code>ndk
   *     </code>, <code>il2cpp</code>. (required)
   * @param dryRun When set to <code>true</code>, returns the source maps that would be deleted
   *     without performing the actual deletion. When set to <code>false</code>, performs the
   *     deletion. (required)
   * @return SourcemapsResponse
   * @throws ApiException if fails to make API call
   */
  public SourcemapsResponse deleteSourcemaps(SourcemapMapKind mapkind, Boolean dryRun)
      throws ApiException {
    return deleteSourcemapsWithHttpInfo(mapkind, dryRun, new DeleteSourcemapsOptionalParameters())
        .getData();
  }

  /**
   * Delete source maps.
   *
   * <p>See {@link #deleteSourcemapsWithHttpInfoAsync}.
   *
   * @param mapkind The type of source map. Valid values are <code>js</code>, <code>jvm</code>,
   *     <code>ios</code>, <code>react</code>, <code>flutter</code>, <code>elf</code>, <code>ndk
   *     </code>, <code>il2cpp</code>. (required)
   * @param dryRun When set to <code>true</code>, returns the source maps that would be deleted
   *     without performing the actual deletion. When set to <code>false</code>, performs the
   *     deletion. (required)
   * @return CompletableFuture&lt;SourcemapsResponse&gt;
   */
  public CompletableFuture<SourcemapsResponse> deleteSourcemapsAsync(
      SourcemapMapKind mapkind, Boolean dryRun) {
    return deleteSourcemapsWithHttpInfoAsync(
            mapkind, dryRun, new DeleteSourcemapsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete source maps.
   *
   * <p>See {@link #deleteSourcemapsWithHttpInfo}.
   *
   * @param mapkind The type of source map. Valid values are <code>js</code>, <code>jvm</code>,
   *     <code>ios</code>, <code>react</code>, <code>flutter</code>, <code>elf</code>, <code>ndk
   *     </code>, <code>il2cpp</code>. (required)
   * @param dryRun When set to <code>true</code>, returns the source maps that would be deleted
   *     without performing the actual deletion. When set to <code>false</code>, performs the
   *     deletion. (required)
   * @param parameters Optional parameters for the request.
   * @return SourcemapsResponse
   * @throws ApiException if fails to make API call
   */
  public SourcemapsResponse deleteSourcemaps(
      SourcemapMapKind mapkind, Boolean dryRun, DeleteSourcemapsOptionalParameters parameters)
      throws ApiException {
    return deleteSourcemapsWithHttpInfo(mapkind, dryRun, parameters).getData();
  }

  /**
   * Delete source maps.
   *
   * <p>See {@link #deleteSourcemapsWithHttpInfoAsync}.
   *
   * @param mapkind The type of source map. Valid values are <code>js</code>, <code>jvm</code>,
   *     <code>ios</code>, <code>react</code>, <code>flutter</code>, <code>elf</code>, <code>ndk
   *     </code>, <code>il2cpp</code>. (required)
   * @param dryRun When set to <code>true</code>, returns the source maps that would be deleted
   *     without performing the actual deletion. When set to <code>false</code>, performs the
   *     deletion. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;SourcemapsResponse&gt;
   */
  public CompletableFuture<SourcemapsResponse> deleteSourcemapsAsync(
      SourcemapMapKind mapkind, Boolean dryRun, DeleteSourcemapsOptionalParameters parameters) {
    return deleteSourcemapsWithHttpInfoAsync(mapkind, dryRun, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Deletes source maps matching the specified filter criteria. Supports dry-run mode to preview
   * which source maps would be deleted without performing the actual deletion.
   *
   * @param mapkind The type of source map. Valid values are <code>js</code>, <code>jvm</code>,
   *     <code>ios</code>, <code>react</code>, <code>flutter</code>, <code>elf</code>, <code>ndk
   *     </code>, <code>il2cpp</code>. (required)
   * @param dryRun When set to <code>true</code>, returns the source maps that would be deleted
   *     without performing the actual deletion. When set to <code>false</code>, performs the
   *     deletion. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;SourcemapsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SourcemapsResponse> deleteSourcemapsWithHttpInfo(
      SourcemapMapKind mapkind, Boolean dryRun, DeleteSourcemapsOptionalParameters parameters)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteSourcemaps";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'mapkind' is set
    if (mapkind == null) {
      throw new ApiException(
          400, "Missing the required parameter 'mapkind' when calling deleteSourcemaps");
    }

    // verify the required parameter 'dryRun' is set
    if (dryRun == null) {
      throw new ApiException(
          400, "Missing the required parameter 'dryRun' when calling deleteSourcemaps");
    }
    List<String> filterService = parameters.filterService;
    List<String> filterVersion = parameters.filterVersion;
    List<String> filterVariant = parameters.filterVariant;
    List<String> filterId = parameters.filterId;
    List<String> filterBuildId = parameters.filterBuildId;
    List<String> filterUuid = parameters.filterUuid;
    List<String> filterPlatform = parameters.filterPlatform;
    List<String> filterBuildNumber = parameters.filterBuildNumber;
    List<String> filterBundleName = parameters.filterBundleName;
    List<String> filterArch = parameters.filterArch;
    List<String> filterSymbolSource = parameters.filterSymbolSource;
    List<String> filterOrigin = parameters.filterOrigin;
    List<String> filterOriginVersion = parameters.filterOriginVersion;
    String filterFilename = parameters.filterFilename;
    String filterDebugId = parameters.filterDebugId;
    String filterGnuBuildId = parameters.filterGnuBuildId;
    String filterGoBuildId = parameters.filterGoBuildId;
    String filterFileHash = parameters.filterFileHash;
    // create path and map variables
    String localVarPath = "/api/v2/sourcemaps";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "mapkind", mapkind));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "dry_run", dryRun));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("multi", "filter[service]", filterService));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("multi", "filter[version]", filterVersion));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("multi", "filter[variant]", filterVariant));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[id]", filterId));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("multi", "filter[build_id]", filterBuildId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[uuid]", filterUuid));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("multi", "filter[platform]", filterPlatform));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("multi", "filter[build_number]", filterBuildNumber));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("multi", "filter[bundle_name]", filterBundleName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[arch]", filterArch));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("multi", "filter[symbol_source]", filterSymbolSource));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[origin]", filterOrigin));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("multi", "filter[origin_version]", filterOriginVersion));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[filename]", filterFilename));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[debug_id]", filterDebugId));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[gnu_build_id]", filterGnuBuildId));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[go_build_id]", filterGoBuildId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[file_hash]", filterFileHash));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumApi.deleteSourcemaps",
            localVarPath,
            localVarQueryParams,
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
        new GenericType<SourcemapsResponse>() {});
  }

  /**
   * Delete source maps.
   *
   * <p>See {@link #deleteSourcemapsWithHttpInfo}.
   *
   * @param mapkind The type of source map. Valid values are <code>js</code>, <code>jvm</code>,
   *     <code>ios</code>, <code>react</code>, <code>flutter</code>, <code>elf</code>, <code>ndk
   *     </code>, <code>il2cpp</code>. (required)
   * @param dryRun When set to <code>true</code>, returns the source maps that would be deleted
   *     without performing the actual deletion. When set to <code>false</code>, performs the
   *     deletion. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;SourcemapsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SourcemapsResponse>> deleteSourcemapsWithHttpInfoAsync(
      SourcemapMapKind mapkind, Boolean dryRun, DeleteSourcemapsOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "deleteSourcemaps";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<SourcemapsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'mapkind' is set
    if (mapkind == null) {
      CompletableFuture<ApiResponse<SourcemapsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'mapkind' when calling deleteSourcemaps"));
      return result;
    }

    // verify the required parameter 'dryRun' is set
    if (dryRun == null) {
      CompletableFuture<ApiResponse<SourcemapsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'dryRun' when calling deleteSourcemaps"));
      return result;
    }
    List<String> filterService = parameters.filterService;
    List<String> filterVersion = parameters.filterVersion;
    List<String> filterVariant = parameters.filterVariant;
    List<String> filterId = parameters.filterId;
    List<String> filterBuildId = parameters.filterBuildId;
    List<String> filterUuid = parameters.filterUuid;
    List<String> filterPlatform = parameters.filterPlatform;
    List<String> filterBuildNumber = parameters.filterBuildNumber;
    List<String> filterBundleName = parameters.filterBundleName;
    List<String> filterArch = parameters.filterArch;
    List<String> filterSymbolSource = parameters.filterSymbolSource;
    List<String> filterOrigin = parameters.filterOrigin;
    List<String> filterOriginVersion = parameters.filterOriginVersion;
    String filterFilename = parameters.filterFilename;
    String filterDebugId = parameters.filterDebugId;
    String filterGnuBuildId = parameters.filterGnuBuildId;
    String filterGoBuildId = parameters.filterGoBuildId;
    String filterFileHash = parameters.filterFileHash;
    // create path and map variables
    String localVarPath = "/api/v2/sourcemaps";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "mapkind", mapkind));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "dry_run", dryRun));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("multi", "filter[service]", filterService));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("multi", "filter[version]", filterVersion));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("multi", "filter[variant]", filterVariant));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[id]", filterId));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("multi", "filter[build_id]", filterBuildId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[uuid]", filterUuid));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("multi", "filter[platform]", filterPlatform));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("multi", "filter[build_number]", filterBuildNumber));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("multi", "filter[bundle_name]", filterBundleName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[arch]", filterArch));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("multi", "filter[symbol_source]", filterSymbolSource));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[origin]", filterOrigin));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("multi", "filter[origin_version]", filterOriginVersion));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[filename]", filterFilename));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[debug_id]", filterDebugId));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[gnu_build_id]", filterGnuBuildId));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[go_build_id]", filterGoBuildId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[file_hash]", filterFileHash));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumApi.deleteSourcemaps",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SourcemapsResponse>> result = new CompletableFuture<>();
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
        new GenericType<SourcemapsResponse>() {});
  }

  /**
   * Get a RUM application.
   *
   * <p>See {@link #getRUMApplicationWithHttpInfo}.
   *
   * @param id RUM application ID. (required)
   * @return RUMApplicationResponse
   * @throws ApiException if fails to make API call
   */
  public RUMApplicationResponse getRUMApplication(String id) throws ApiException {
    return getRUMApplicationWithHttpInfo(id).getData();
  }

  /**
   * Get a RUM application.
   *
   * <p>See {@link #getRUMApplicationWithHttpInfoAsync}.
   *
   * @param id RUM application ID. (required)
   * @return CompletableFuture&lt;RUMApplicationResponse&gt;
   */
  public CompletableFuture<RUMApplicationResponse> getRUMApplicationAsync(String id) {
    return getRUMApplicationWithHttpInfoAsync(id)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the RUM application with given ID in your organization.
   *
   * @param id RUM application ID. (required)
   * @return ApiResponse&lt;RUMApplicationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<RUMApplicationResponse> getRUMApplicationWithHttpInfo(String id)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(
          400, "Missing the required parameter 'id' when calling getRUMApplication");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/applications/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumApi.getRUMApplication",
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
        new GenericType<RUMApplicationResponse>() {});
  }

  /**
   * Get a RUM application.
   *
   * <p>See {@link #getRUMApplicationWithHttpInfo}.
   *
   * @param id RUM application ID. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;RUMApplicationResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RUMApplicationResponse>> getRUMApplicationWithHttpInfoAsync(
      String id) {
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
      CompletableFuture<ApiResponse<RUMApplicationResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'id' when calling getRUMApplication"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/applications/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumApi.getRUMApplication",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RUMApplicationResponse>> result = new CompletableFuture<>();
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
        new GenericType<RUMApplicationResponse>() {});
  }

  /**
   * List all the RUM applications.
   *
   * <p>See {@link #getRUMApplicationsWithHttpInfo}.
   *
   * @return RUMApplicationsResponse
   * @throws ApiException if fails to make API call
   */
  public RUMApplicationsResponse getRUMApplications() throws ApiException {
    return getRUMApplicationsWithHttpInfo().getData();
  }

  /**
   * List all the RUM applications.
   *
   * <p>See {@link #getRUMApplicationsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;RUMApplicationsResponse&gt;
   */
  public CompletableFuture<RUMApplicationsResponse> getRUMApplicationsAsync() {
    return getRUMApplicationsWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List all the RUM applications in your organization.
   *
   * @return ApiResponse&lt;RUMApplicationsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<RUMApplicationsResponse> getRUMApplicationsWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/rum/applications";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumApi.getRUMApplications",
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
        new GenericType<RUMApplicationsResponse>() {});
  }

  /**
   * List all the RUM applications.
   *
   * <p>See {@link #getRUMApplicationsWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;RUMApplicationsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RUMApplicationsResponse>>
      getRUMApplicationsWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/rum/applications";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumApi.getRUMApplications",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RUMApplicationsResponse>> result = new CompletableFuture<>();
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
        new GenericType<RUMApplicationsResponse>() {});
  }

  /**
   * Get service repository information.
   *
   * <p>See {@link #getServiceRepositoryInfoWithHttpInfo}.
   *
   * @param body (required)
   * @return ServiceRepositoryInfoResponse
   * @throws ApiException if fails to make API call
   */
  public ServiceRepositoryInfoResponse getServiceRepositoryInfo(ServiceRepositoryInfoRequest body)
      throws ApiException {
    return getServiceRepositoryInfoWithHttpInfo(body).getData();
  }

  /**
   * Get service repository information.
   *
   * <p>See {@link #getServiceRepositoryInfoWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ServiceRepositoryInfoResponse&gt;
   */
  public CompletableFuture<ServiceRepositoryInfoResponse> getServiceRepositoryInfoAsync(
      ServiceRepositoryInfoRequest body) {
    return getServiceRepositoryInfoWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Returns the repository URL and commit SHA associated with a given service and version.
   *
   * @param body (required)
   * @return ApiResponse&lt;ServiceRepositoryInfoResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ServiceRepositoryInfoResponse> getServiceRepositoryInfoWithHttpInfo(
      ServiceRepositoryInfoRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getServiceRepositoryInfo";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling getServiceRepositoryInfo");
    }
    // create path and map variables
    String localVarPath = "/api/v2/sourcemaps/service_repository_info";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumApi.getServiceRepositoryInfo",
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
        new GenericType<ServiceRepositoryInfoResponse>() {});
  }

  /**
   * Get service repository information.
   *
   * <p>See {@link #getServiceRepositoryInfoWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ServiceRepositoryInfoResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ServiceRepositoryInfoResponse>>
      getServiceRepositoryInfoWithHttpInfoAsync(ServiceRepositoryInfoRequest body) {
    // Check if unstable operation is enabled
    String operationId = "getServiceRepositoryInfo";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ServiceRepositoryInfoResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<ServiceRepositoryInfoResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling getServiceRepositoryInfo"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/sourcemaps/service_repository_info";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumApi.getServiceRepositoryInfo",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ServiceRepositoryInfoResponse>> result =
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
        new GenericType<ServiceRepositoryInfoResponse>() {});
  }

  /**
   * Get a JavaScript source map.
   *
   * <p>See {@link #getSourcemapsWithHttpInfo}.
   *
   * @param filename The path to the source map file. (required)
   * @param service The service name associated with the source map. (required)
   * @param version The version of the service associated with the source map. (required)
   * @return SourcemapFileResponse
   * @throws ApiException if fails to make API call
   */
  public SourcemapFileResponse getSourcemaps(String filename, String service, String version)
      throws ApiException {
    return getSourcemapsWithHttpInfo(filename, service, version).getData();
  }

  /**
   * Get a JavaScript source map.
   *
   * <p>See {@link #getSourcemapsWithHttpInfoAsync}.
   *
   * @param filename The path to the source map file. (required)
   * @param service The service name associated with the source map. (required)
   * @param version The version of the service associated with the source map. (required)
   * @return CompletableFuture&lt;SourcemapFileResponse&gt;
   */
  public CompletableFuture<SourcemapFileResponse> getSourcemapsAsync(
      String filename, String service, String version) {
    return getSourcemapsWithHttpInfoAsync(filename, service, version)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Retrieves the content of a specific JavaScript source map file by its filename, service name,
   * and version.
   *
   * @param filename The path to the source map file. (required)
   * @param service The service name associated with the source map. (required)
   * @param version The version of the service associated with the source map. (required)
   * @return ApiResponse&lt;SourcemapFileResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SourcemapFileResponse> getSourcemapsWithHttpInfo(
      String filename, String service, String version) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getSourcemaps";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'filename' is set
    if (filename == null) {
      throw new ApiException(
          400, "Missing the required parameter 'filename' when calling getSourcemaps");
    }

    // verify the required parameter 'service' is set
    if (service == null) {
      throw new ApiException(
          400, "Missing the required parameter 'service' when calling getSourcemaps");
    }

    // verify the required parameter 'version' is set
    if (version == null) {
      throw new ApiException(
          400, "Missing the required parameter 'version' when calling getSourcemaps");
    }
    // create path and map variables
    String localVarPath = "/api/v2/sourcemaps";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filename", filename));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "service", service));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "version", version));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumApi.getSourcemaps",
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
        new GenericType<SourcemapFileResponse>() {});
  }

  /**
   * Get a JavaScript source map.
   *
   * <p>See {@link #getSourcemapsWithHttpInfo}.
   *
   * @param filename The path to the source map file. (required)
   * @param service The service name associated with the source map. (required)
   * @param version The version of the service associated with the source map. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SourcemapFileResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SourcemapFileResponse>> getSourcemapsWithHttpInfoAsync(
      String filename, String service, String version) {
    // Check if unstable operation is enabled
    String operationId = "getSourcemaps";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<SourcemapFileResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'filename' is set
    if (filename == null) {
      CompletableFuture<ApiResponse<SourcemapFileResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'filename' when calling getSourcemaps"));
      return result;
    }

    // verify the required parameter 'service' is set
    if (service == null) {
      CompletableFuture<ApiResponse<SourcemapFileResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'service' when calling getSourcemaps"));
      return result;
    }

    // verify the required parameter 'version' is set
    if (version == null) {
      CompletableFuture<ApiResponse<SourcemapFileResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'version' when calling getSourcemaps"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/sourcemaps";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filename", filename));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "service", service));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "version", version));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumApi.getSourcemaps",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SourcemapFileResponse>> result = new CompletableFuture<>();
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
        new GenericType<SourcemapFileResponse>() {});
  }

  /** Manage optional parameters to listRUMEvents. */
  public static class ListRUMEventsOptionalParameters {
    private String filterQuery;
    private OffsetDateTime filterFrom;
    private OffsetDateTime filterTo;
    private RUMSort sort;
    private String pageCursor;
    private Integer pageLimit;

    /**
     * Set filterQuery.
     *
     * @param filterQuery Search query following RUM syntax. (optional)
     * @return ListRUMEventsOptionalParameters
     */
    public ListRUMEventsOptionalParameters filterQuery(String filterQuery) {
      this.filterQuery = filterQuery;
      return this;
    }

    /**
     * Set filterFrom.
     *
     * @param filterFrom Minimum timestamp for requested events. (optional)
     * @return ListRUMEventsOptionalParameters
     */
    public ListRUMEventsOptionalParameters filterFrom(OffsetDateTime filterFrom) {
      this.filterFrom = filterFrom;
      return this;
    }

    /**
     * Set filterTo.
     *
     * @param filterTo Maximum timestamp for requested events. (optional)
     * @return ListRUMEventsOptionalParameters
     */
    public ListRUMEventsOptionalParameters filterTo(OffsetDateTime filterTo) {
      this.filterTo = filterTo;
      return this;
    }

    /**
     * Set sort.
     *
     * @param sort Order of events in results. (optional)
     * @return ListRUMEventsOptionalParameters
     */
    public ListRUMEventsOptionalParameters sort(RUMSort sort) {
      this.sort = sort;
      return this;
    }

    /**
     * Set pageCursor.
     *
     * @param pageCursor List following results with a cursor provided in the previous query.
     *     (optional)
     * @return ListRUMEventsOptionalParameters
     */
    public ListRUMEventsOptionalParameters pageCursor(String pageCursor) {
      this.pageCursor = pageCursor;
      return this;
    }

    /**
     * Set pageLimit.
     *
     * @param pageLimit Maximum number of events in the response. (optional, default to 10)
     * @return ListRUMEventsOptionalParameters
     */
    public ListRUMEventsOptionalParameters pageLimit(Integer pageLimit) {
      this.pageLimit = pageLimit;
      return this;
    }
  }

  /**
   * Get a list of RUM events.
   *
   * <p>See {@link #listRUMEventsWithHttpInfo}.
   *
   * @return RUMEventsResponse
   * @throws ApiException if fails to make API call
   */
  public RUMEventsResponse listRUMEvents() throws ApiException {
    return listRUMEventsWithHttpInfo(new ListRUMEventsOptionalParameters()).getData();
  }

  /**
   * Get a list of RUM events.
   *
   * <p>See {@link #listRUMEventsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;RUMEventsResponse&gt;
   */
  public CompletableFuture<RUMEventsResponse> listRUMEventsAsync() {
    return listRUMEventsWithHttpInfoAsync(new ListRUMEventsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a list of RUM events.
   *
   * <p>See {@link #listRUMEventsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return RUMEventsResponse
   * @throws ApiException if fails to make API call
   */
  public RUMEventsResponse listRUMEvents(ListRUMEventsOptionalParameters parameters)
      throws ApiException {
    return listRUMEventsWithHttpInfo(parameters).getData();
  }

  /**
   * Get a list of RUM events.
   *
   * <p>See {@link #listRUMEventsWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;RUMEventsResponse&gt;
   */
  public CompletableFuture<RUMEventsResponse> listRUMEventsAsync(
      ListRUMEventsOptionalParameters parameters) {
    return listRUMEventsWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a list of RUM events.
   *
   * <p>See {@link #listRUMEventsWithHttpInfo}.
   *
   * @return PaginationIterable&lt;RUMEvent&gt;
   */
  public PaginationIterable<RUMEvent> listRUMEventsWithPagination() {
    ListRUMEventsOptionalParameters parameters = new ListRUMEventsOptionalParameters();
    return listRUMEventsWithPagination(parameters);
  }

  /**
   * Get a list of RUM events.
   *
   * <p>See {@link #listRUMEventsWithHttpInfo}.
   *
   * @return RUMEventsResponse
   */
  public PaginationIterable<RUMEvent> listRUMEventsWithPagination(
      ListRUMEventsOptionalParameters parameters) {
    String resultsPath = "getData";
    String valueGetterPath = "getMeta.getPage.getAfter";
    String valueSetterPath = "pageCursor";
    Boolean valueSetterParamOptional = true;
    Integer limit;

    if (parameters.pageLimit == null) {
      limit = 10;
      parameters.pageLimit(limit);
    } else {
      limit = parameters.pageLimit;
    }

    LinkedHashMap<String, Object> args = new LinkedHashMap<String, Object>();
    args.put("optionalParams", parameters);

    PaginationIterable iterator =
        new PaginationIterable(
            this,
            "listRUMEvents",
            resultsPath,
            valueGetterPath,
            valueSetterPath,
            valueSetterParamOptional,
            true,
            true,
            limit,
            args,
            0);

    return iterator;
  }

  /**
   * List endpoint returns events that match a RUM search query. <a
   * href="https://docs.datadoghq.com/logs/guide/collect-multiple-logs-with-pagination">Results are
   * paginated</a>.
   *
   * <p>Use this endpoint to see your latest RUM events.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;RUMEventsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<RUMEventsResponse> listRUMEventsWithHttpInfo(
      ListRUMEventsOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    String filterQuery = parameters.filterQuery;
    OffsetDateTime filterFrom = parameters.filterFrom;
    OffsetDateTime filterTo = parameters.filterTo;
    RUMSort sort = parameters.sort;
    String pageCursor = parameters.pageCursor;
    Integer pageLimit = parameters.pageLimit;
    // create path and map variables
    String localVarPath = "/api/v2/rum/events";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[query]", filterQuery));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[from]", filterFrom));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[to]", filterTo));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[cursor]", pageCursor));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumApi.listRUMEvents",
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
        new GenericType<RUMEventsResponse>() {});
  }

  /**
   * Get a list of RUM events.
   *
   * <p>See {@link #listRUMEventsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;RUMEventsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RUMEventsResponse>> listRUMEventsWithHttpInfoAsync(
      ListRUMEventsOptionalParameters parameters) {
    Object localVarPostBody = null;
    String filterQuery = parameters.filterQuery;
    OffsetDateTime filterFrom = parameters.filterFrom;
    OffsetDateTime filterTo = parameters.filterTo;
    RUMSort sort = parameters.sort;
    String pageCursor = parameters.pageCursor;
    Integer pageLimit = parameters.pageLimit;
    // create path and map variables
    String localVarPath = "/api/v2/rum/events";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[query]", filterQuery));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[from]", filterFrom));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[to]", filterTo));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[cursor]", pageCursor));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumApi.listRUMEvents",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RUMEventsResponse>> result = new CompletableFuture<>();
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
        new GenericType<RUMEventsResponse>() {});
  }

  /** Manage optional parameters to listSourcemaps. */
  public static class ListSourcemapsOptionalParameters {
    private SourcemapMapKind mapkind;
    private Long pageSize;
    private Long pageNumber;
    private List<String> filterService;
    private List<String> filterVersion;
    private List<String> filterVariant;
    private List<String> filterId;
    private List<String> filterBuildId;
    private List<String> filterUuid;
    private List<String> filterPlatform;
    private List<String> filterBuildNumber;
    private List<String> filterBundleName;
    private List<String> filterArch;
    private List<String> filterSymbolSource;
    private List<String> filterOrigin;
    private List<String> filterOriginVersion;
    private String filterFilename;
    private String filterDebugId;
    private String filterGnuBuildId;
    private String filterGoBuildId;
    private String filterFileHash;

    /**
     * Set mapkind.
     *
     * @param mapkind The type of source map. Defaults to <code>js</code>. (optional)
     * @return ListSourcemapsOptionalParameters
     */
    public ListSourcemapsOptionalParameters mapkind(SourcemapMapKind mapkind) {
      this.mapkind = mapkind;
      return this;
    }

    /**
     * Set pageSize.
     *
     * @param pageSize The number of results to return per page. Must be at least 1. (optional,
     *     default to 20)
     * @return ListSourcemapsOptionalParameters
     */
    public ListSourcemapsOptionalParameters pageSize(Long pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set pageNumber.
     *
     * @param pageNumber The page number to retrieve, starting from 1. (optional, default to 1)
     * @return ListSourcemapsOptionalParameters
     */
    public ListSourcemapsOptionalParameters pageNumber(Long pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set filterService.
     *
     * @param filterService Filter by service names (multiple values allowed). Required for <code>js
     *     </code>, <code>jvm</code>, <code>react</code>, and <code>flutter</code> map kinds.
     *     (optional)
     * @return ListSourcemapsOptionalParameters
     */
    public ListSourcemapsOptionalParameters filterService(List<String> filterService) {
      this.filterService = filterService;
      return this;
    }

    /**
     * Set filterVersion.
     *
     * @param filterVersion Filter by version values (multiple values allowed). Required for <code>
     *     js</code>, <code>jvm</code>, <code>react</code>, and <code>flutter</code> map kinds.
     *     (optional)
     * @return ListSourcemapsOptionalParameters
     */
    public ListSourcemapsOptionalParameters filterVersion(List<String> filterVersion) {
      this.filterVersion = filterVersion;
      return this;
    }

    /**
     * Set filterVariant.
     *
     * @param filterVariant Filter by variant values (multiple values allowed). Supported for <code>
     *     jvm</code>. (optional)
     * @return ListSourcemapsOptionalParameters
     */
    public ListSourcemapsOptionalParameters filterVariant(List<String> filterVariant) {
      this.filterVariant = filterVariant;
      return this;
    }

    /**
     * Set filterId.
     *
     * @param filterId Filter by source map ID values (multiple values allowed). Supported for all
     *     map kinds. (optional)
     * @return ListSourcemapsOptionalParameters
     */
    public ListSourcemapsOptionalParameters filterId(List<String> filterId) {
      this.filterId = filterId;
      return this;
    }

    /**
     * Set filterBuildId.
     *
     * @param filterBuildId Filter by build ID values (multiple values allowed). Supported for
     *     <code>jvm</code>, <code>ndk</code>, and <code>il2cpp</code>. (optional)
     * @return ListSourcemapsOptionalParameters
     */
    public ListSourcemapsOptionalParameters filterBuildId(List<String> filterBuildId) {
      this.filterBuildId = filterBuildId;
      return this;
    }

    /**
     * Set filterUuid.
     *
     * @param filterUuid Filter by UUID values (multiple values allowed). Supported for <code>ios
     *     </code>. (optional)
     * @return ListSourcemapsOptionalParameters
     */
    public ListSourcemapsOptionalParameters filterUuid(List<String> filterUuid) {
      this.filterUuid = filterUuid;
      return this;
    }

    /**
     * Set filterPlatform.
     *
     * @param filterPlatform Filter by platform values (multiple values allowed). Supported for
     *     <code>react</code>. (optional)
     * @return ListSourcemapsOptionalParameters
     */
    public ListSourcemapsOptionalParameters filterPlatform(List<String> filterPlatform) {
      this.filterPlatform = filterPlatform;
      return this;
    }

    /**
     * Set filterBuildNumber.
     *
     * @param filterBuildNumber Filter by build number values (multiple values allowed). Supported
     *     for <code>react</code>. (optional)
     * @return ListSourcemapsOptionalParameters
     */
    public ListSourcemapsOptionalParameters filterBuildNumber(List<String> filterBuildNumber) {
      this.filterBuildNumber = filterBuildNumber;
      return this;
    }

    /**
     * Set filterBundleName.
     *
     * @param filterBundleName Filter by bundle name values (multiple values allowed). Supported for
     *     <code>react</code>. (optional)
     * @return ListSourcemapsOptionalParameters
     */
    public ListSourcemapsOptionalParameters filterBundleName(List<String> filterBundleName) {
      this.filterBundleName = filterBundleName;
      return this;
    }

    /**
     * Set filterArch.
     *
     * @param filterArch Filter by architecture values (multiple values allowed). Supported for
     *     <code>flutter</code>, <code>elf</code>, and <code>ndk</code>. (optional)
     * @return ListSourcemapsOptionalParameters
     */
    public ListSourcemapsOptionalParameters filterArch(List<String> filterArch) {
      this.filterArch = filterArch;
      return this;
    }

    /**
     * Set filterSymbolSource.
     *
     * @param filterSymbolSource Filter by symbol source values (multiple values allowed). Supported
     *     for <code>elf</code>. (optional)
     * @return ListSourcemapsOptionalParameters
     */
    public ListSourcemapsOptionalParameters filterSymbolSource(List<String> filterSymbolSource) {
      this.filterSymbolSource = filterSymbolSource;
      return this;
    }

    /**
     * Set filterOrigin.
     *
     * @param filterOrigin Filter by origin values (multiple values allowed). Supported for <code>
     *     elf</code>. (optional)
     * @return ListSourcemapsOptionalParameters
     */
    public ListSourcemapsOptionalParameters filterOrigin(List<String> filterOrigin) {
      this.filterOrigin = filterOrigin;
      return this;
    }

    /**
     * Set filterOriginVersion.
     *
     * @param filterOriginVersion Filter by origin version values (multiple values allowed).
     *     Supported for <code>elf</code>. (optional)
     * @return ListSourcemapsOptionalParameters
     */
    public ListSourcemapsOptionalParameters filterOriginVersion(List<String> filterOriginVersion) {
      this.filterOriginVersion = filterOriginVersion;
      return this;
    }

    /**
     * Set filterFilename.
     *
     * @param filterFilename Filter by filename (single value). Supported for <code>js</code>,
     *     <code>elf</code>, and <code>ndk</code>. (optional)
     * @return ListSourcemapsOptionalParameters
     */
    public ListSourcemapsOptionalParameters filterFilename(String filterFilename) {
      this.filterFilename = filterFilename;
      return this;
    }

    /**
     * Set filterDebugId.
     *
     * @param filterDebugId Filter by debug ID (single value). Supported for <code>react</code>.
     *     (optional)
     * @return ListSourcemapsOptionalParameters
     */
    public ListSourcemapsOptionalParameters filterDebugId(String filterDebugId) {
      this.filterDebugId = filterDebugId;
      return this;
    }

    /**
     * Set filterGnuBuildId.
     *
     * @param filterGnuBuildId Filter by GNU build ID (single value). Supported for <code>elf</code>
     *     . (optional)
     * @return ListSourcemapsOptionalParameters
     */
    public ListSourcemapsOptionalParameters filterGnuBuildId(String filterGnuBuildId) {
      this.filterGnuBuildId = filterGnuBuildId;
      return this;
    }

    /**
     * Set filterGoBuildId.
     *
     * @param filterGoBuildId Filter by Go build ID (single value). Supported for <code>elf</code>.
     *     (optional)
     * @return ListSourcemapsOptionalParameters
     */
    public ListSourcemapsOptionalParameters filterGoBuildId(String filterGoBuildId) {
      this.filterGoBuildId = filterGoBuildId;
      return this;
    }

    /**
     * Set filterFileHash.
     *
     * @param filterFileHash Filter by file hash (single value). Supported for <code>elf</code>.
     *     (optional)
     * @return ListSourcemapsOptionalParameters
     */
    public ListSourcemapsOptionalParameters filterFileHash(String filterFileHash) {
      this.filterFileHash = filterFileHash;
      return this;
    }
  }

  /**
   * List source maps.
   *
   * <p>See {@link #listSourcemapsWithHttpInfo}.
   *
   * @return ListSourcemapsResponse
   * @throws ApiException if fails to make API call
   */
  public ListSourcemapsResponse listSourcemaps() throws ApiException {
    return listSourcemapsWithHttpInfo(new ListSourcemapsOptionalParameters()).getData();
  }

  /**
   * List source maps.
   *
   * <p>See {@link #listSourcemapsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;ListSourcemapsResponse&gt;
   */
  public CompletableFuture<ListSourcemapsResponse> listSourcemapsAsync() {
    return listSourcemapsWithHttpInfoAsync(new ListSourcemapsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List source maps.
   *
   * <p>See {@link #listSourcemapsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return ListSourcemapsResponse
   * @throws ApiException if fails to make API call
   */
  public ListSourcemapsResponse listSourcemaps(ListSourcemapsOptionalParameters parameters)
      throws ApiException {
    return listSourcemapsWithHttpInfo(parameters).getData();
  }

  /**
   * List source maps.
   *
   * <p>See {@link #listSourcemapsWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ListSourcemapsResponse&gt;
   */
  public CompletableFuture<ListSourcemapsResponse> listSourcemapsAsync(
      ListSourcemapsOptionalParameters parameters) {
    return listSourcemapsWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Retrieves a paginated list of source maps matching the specified filter criteria.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;ListSourcemapsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 413 </td><td> Request Entity Too Large </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ListSourcemapsResponse> listSourcemapsWithHttpInfo(
      ListSourcemapsOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listSourcemaps";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    SourcemapMapKind mapkind = parameters.mapkind;
    Long pageSize = parameters.pageSize;
    Long pageNumber = parameters.pageNumber;
    List<String> filterService = parameters.filterService;
    List<String> filterVersion = parameters.filterVersion;
    List<String> filterVariant = parameters.filterVariant;
    List<String> filterId = parameters.filterId;
    List<String> filterBuildId = parameters.filterBuildId;
    List<String> filterUuid = parameters.filterUuid;
    List<String> filterPlatform = parameters.filterPlatform;
    List<String> filterBuildNumber = parameters.filterBuildNumber;
    List<String> filterBundleName = parameters.filterBundleName;
    List<String> filterArch = parameters.filterArch;
    List<String> filterSymbolSource = parameters.filterSymbolSource;
    List<String> filterOrigin = parameters.filterOrigin;
    List<String> filterOriginVersion = parameters.filterOriginVersion;
    String filterFilename = parameters.filterFilename;
    String filterDebugId = parameters.filterDebugId;
    String filterGnuBuildId = parameters.filterGnuBuildId;
    String filterGoBuildId = parameters.filterGoBuildId;
    String filterFileHash = parameters.filterFileHash;
    // create path and map variables
    String localVarPath = "/api/v2/sourcemaps/list";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "mapkind", mapkind));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("multi", "filter[service]", filterService));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("multi", "filter[version]", filterVersion));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("multi", "filter[variant]", filterVariant));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[id]", filterId));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("multi", "filter[build_id]", filterBuildId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[uuid]", filterUuid));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("multi", "filter[platform]", filterPlatform));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("multi", "filter[build_number]", filterBuildNumber));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("multi", "filter[bundle_name]", filterBundleName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[arch]", filterArch));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("multi", "filter[symbol_source]", filterSymbolSource));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[origin]", filterOrigin));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("multi", "filter[origin_version]", filterOriginVersion));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[filename]", filterFilename));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[debug_id]", filterDebugId));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[gnu_build_id]", filterGnuBuildId));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[go_build_id]", filterGoBuildId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[file_hash]", filterFileHash));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumApi.listSourcemaps",
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
        new GenericType<ListSourcemapsResponse>() {});
  }

  /**
   * List source maps.
   *
   * <p>See {@link #listSourcemapsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;ListSourcemapsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ListSourcemapsResponse>> listSourcemapsWithHttpInfoAsync(
      ListSourcemapsOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listSourcemaps";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ListSourcemapsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    SourcemapMapKind mapkind = parameters.mapkind;
    Long pageSize = parameters.pageSize;
    Long pageNumber = parameters.pageNumber;
    List<String> filterService = parameters.filterService;
    List<String> filterVersion = parameters.filterVersion;
    List<String> filterVariant = parameters.filterVariant;
    List<String> filterId = parameters.filterId;
    List<String> filterBuildId = parameters.filterBuildId;
    List<String> filterUuid = parameters.filterUuid;
    List<String> filterPlatform = parameters.filterPlatform;
    List<String> filterBuildNumber = parameters.filterBuildNumber;
    List<String> filterBundleName = parameters.filterBundleName;
    List<String> filterArch = parameters.filterArch;
    List<String> filterSymbolSource = parameters.filterSymbolSource;
    List<String> filterOrigin = parameters.filterOrigin;
    List<String> filterOriginVersion = parameters.filterOriginVersion;
    String filterFilename = parameters.filterFilename;
    String filterDebugId = parameters.filterDebugId;
    String filterGnuBuildId = parameters.filterGnuBuildId;
    String filterGoBuildId = parameters.filterGoBuildId;
    String filterFileHash = parameters.filterFileHash;
    // create path and map variables
    String localVarPath = "/api/v2/sourcemaps/list";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "mapkind", mapkind));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("multi", "filter[service]", filterService));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("multi", "filter[version]", filterVersion));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("multi", "filter[variant]", filterVariant));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[id]", filterId));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("multi", "filter[build_id]", filterBuildId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[uuid]", filterUuid));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("multi", "filter[platform]", filterPlatform));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("multi", "filter[build_number]", filterBuildNumber));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("multi", "filter[bundle_name]", filterBundleName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[arch]", filterArch));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("multi", "filter[symbol_source]", filterSymbolSource));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[origin]", filterOrigin));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("multi", "filter[origin_version]", filterOriginVersion));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[filename]", filterFilename));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[debug_id]", filterDebugId));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[gnu_build_id]", filterGnuBuildId));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[go_build_id]", filterGoBuildId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[file_hash]", filterFileHash));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumApi.listSourcemaps",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ListSourcemapsResponse>> result = new CompletableFuture<>();
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
        new GenericType<ListSourcemapsResponse>() {});
  }

  /** Manage optional parameters to restoreSourcemaps. */
  public static class RestoreSourcemapsOptionalParameters {
    private List<String> filterService;
    private List<String> filterVersion;
    private List<String> filterVariant;
    private List<String> filterId;
    private List<String> filterBuildId;
    private List<String> filterUuid;
    private List<String> filterPlatform;
    private List<String> filterBuildNumber;
    private List<String> filterBundleName;
    private List<String> filterArch;
    private List<String> filterSymbolSource;
    private List<String> filterOrigin;
    private List<String> filterOriginVersion;
    private String filterFilename;
    private String filterDebugId;
    private String filterGnuBuildId;
    private String filterGoBuildId;
    private String filterFileHash;

    /**
     * Set filterService.
     *
     * @param filterService Filter by service names (multiple values allowed). Required for <code>js
     *     </code>, <code>jvm</code>, <code>react</code>, and <code>flutter</code> map kinds.
     *     (optional)
     * @return RestoreSourcemapsOptionalParameters
     */
    public RestoreSourcemapsOptionalParameters filterService(List<String> filterService) {
      this.filterService = filterService;
      return this;
    }

    /**
     * Set filterVersion.
     *
     * @param filterVersion Filter by version values (multiple values allowed, maximum 10). Required
     *     for <code>js</code>, <code>jvm</code>, <code>react</code>, and <code>flutter</code> map
     *     kinds. (optional)
     * @return RestoreSourcemapsOptionalParameters
     */
    public RestoreSourcemapsOptionalParameters filterVersion(List<String> filterVersion) {
      this.filterVersion = filterVersion;
      return this;
    }

    /**
     * Set filterVariant.
     *
     * @param filterVariant Filter by variant values (multiple values allowed). Supported for <code>
     *     jvm</code>. (optional)
     * @return RestoreSourcemapsOptionalParameters
     */
    public RestoreSourcemapsOptionalParameters filterVariant(List<String> filterVariant) {
      this.filterVariant = filterVariant;
      return this;
    }

    /**
     * Set filterId.
     *
     * @param filterId Filter by source map ID values (multiple values allowed). Supported for all
     *     map kinds. (optional)
     * @return RestoreSourcemapsOptionalParameters
     */
    public RestoreSourcemapsOptionalParameters filterId(List<String> filterId) {
      this.filterId = filterId;
      return this;
    }

    /**
     * Set filterBuildId.
     *
     * @param filterBuildId Filter by build ID values (multiple values allowed). Supported for
     *     <code>jvm</code>, <code>ndk</code>, and <code>il2cpp</code>. (optional)
     * @return RestoreSourcemapsOptionalParameters
     */
    public RestoreSourcemapsOptionalParameters filterBuildId(List<String> filterBuildId) {
      this.filterBuildId = filterBuildId;
      return this;
    }

    /**
     * Set filterUuid.
     *
     * @param filterUuid Filter by UUID values (multiple values allowed). Supported for <code>ios
     *     </code>. (optional)
     * @return RestoreSourcemapsOptionalParameters
     */
    public RestoreSourcemapsOptionalParameters filterUuid(List<String> filterUuid) {
      this.filterUuid = filterUuid;
      return this;
    }

    /**
     * Set filterPlatform.
     *
     * @param filterPlatform Filter by platform values (multiple values allowed). Supported for
     *     <code>react</code>. (optional)
     * @return RestoreSourcemapsOptionalParameters
     */
    public RestoreSourcemapsOptionalParameters filterPlatform(List<String> filterPlatform) {
      this.filterPlatform = filterPlatform;
      return this;
    }

    /**
     * Set filterBuildNumber.
     *
     * @param filterBuildNumber Filter by build number values (multiple values allowed). Supported
     *     for <code>react</code>. (optional)
     * @return RestoreSourcemapsOptionalParameters
     */
    public RestoreSourcemapsOptionalParameters filterBuildNumber(List<String> filterBuildNumber) {
      this.filterBuildNumber = filterBuildNumber;
      return this;
    }

    /**
     * Set filterBundleName.
     *
     * @param filterBundleName Filter by bundle name values (multiple values allowed). Supported for
     *     <code>react</code>. (optional)
     * @return RestoreSourcemapsOptionalParameters
     */
    public RestoreSourcemapsOptionalParameters filterBundleName(List<String> filterBundleName) {
      this.filterBundleName = filterBundleName;
      return this;
    }

    /**
     * Set filterArch.
     *
     * @param filterArch Filter by architecture values (multiple values allowed). Supported for
     *     <code>flutter</code>, <code>elf</code>, and <code>ndk</code>. (optional)
     * @return RestoreSourcemapsOptionalParameters
     */
    public RestoreSourcemapsOptionalParameters filterArch(List<String> filterArch) {
      this.filterArch = filterArch;
      return this;
    }

    /**
     * Set filterSymbolSource.
     *
     * @param filterSymbolSource Filter by symbol source values (multiple values allowed). Supported
     *     for <code>elf</code>. (optional)
     * @return RestoreSourcemapsOptionalParameters
     */
    public RestoreSourcemapsOptionalParameters filterSymbolSource(List<String> filterSymbolSource) {
      this.filterSymbolSource = filterSymbolSource;
      return this;
    }

    /**
     * Set filterOrigin.
     *
     * @param filterOrigin Filter by origin values (multiple values allowed). Supported for <code>
     *     elf</code>. (optional)
     * @return RestoreSourcemapsOptionalParameters
     */
    public RestoreSourcemapsOptionalParameters filterOrigin(List<String> filterOrigin) {
      this.filterOrigin = filterOrigin;
      return this;
    }

    /**
     * Set filterOriginVersion.
     *
     * @param filterOriginVersion Filter by origin version values (multiple values allowed).
     *     Supported for <code>elf</code>. (optional)
     * @return RestoreSourcemapsOptionalParameters
     */
    public RestoreSourcemapsOptionalParameters filterOriginVersion(
        List<String> filterOriginVersion) {
      this.filterOriginVersion = filterOriginVersion;
      return this;
    }

    /**
     * Set filterFilename.
     *
     * @param filterFilename Filter by filename (single value). Supported for <code>js</code>,
     *     <code>elf</code>, and <code>ndk</code>. (optional)
     * @return RestoreSourcemapsOptionalParameters
     */
    public RestoreSourcemapsOptionalParameters filterFilename(String filterFilename) {
      this.filterFilename = filterFilename;
      return this;
    }

    /**
     * Set filterDebugId.
     *
     * @param filterDebugId Filter by debug ID (single value). Supported for <code>react</code>.
     *     (optional)
     * @return RestoreSourcemapsOptionalParameters
     */
    public RestoreSourcemapsOptionalParameters filterDebugId(String filterDebugId) {
      this.filterDebugId = filterDebugId;
      return this;
    }

    /**
     * Set filterGnuBuildId.
     *
     * @param filterGnuBuildId Filter by GNU build ID (single value). Supported for <code>elf</code>
     *     . (optional)
     * @return RestoreSourcemapsOptionalParameters
     */
    public RestoreSourcemapsOptionalParameters filterGnuBuildId(String filterGnuBuildId) {
      this.filterGnuBuildId = filterGnuBuildId;
      return this;
    }

    /**
     * Set filterGoBuildId.
     *
     * @param filterGoBuildId Filter by Go build ID (single value). Supported for <code>elf</code>.
     *     (optional)
     * @return RestoreSourcemapsOptionalParameters
     */
    public RestoreSourcemapsOptionalParameters filterGoBuildId(String filterGoBuildId) {
      this.filterGoBuildId = filterGoBuildId;
      return this;
    }

    /**
     * Set filterFileHash.
     *
     * @param filterFileHash Filter by file hash (single value). Supported for <code>elf</code>.
     *     (optional)
     * @return RestoreSourcemapsOptionalParameters
     */
    public RestoreSourcemapsOptionalParameters filterFileHash(String filterFileHash) {
      this.filterFileHash = filterFileHash;
      return this;
    }
  }

  /**
   * Restore source maps.
   *
   * <p>See {@link #restoreSourcemapsWithHttpInfo}.
   *
   * @param mapkind The type of source map. Valid values are <code>js</code>, <code>jvm</code>,
   *     <code>ios</code>, <code>react</code>, <code>flutter</code>, <code>elf</code>, <code>ndk
   *     </code>, <code>il2cpp</code>. (required)
   * @param dryRun When set to <code>true</code>, returns the source maps that would be restored
   *     without performing the actual restoration. When set to <code>false</code>, performs the
   *     restoration. (required)
   * @return SourcemapsResponse
   * @throws ApiException if fails to make API call
   */
  public SourcemapsResponse restoreSourcemaps(SourcemapMapKind mapkind, Boolean dryRun)
      throws ApiException {
    return restoreSourcemapsWithHttpInfo(mapkind, dryRun, new RestoreSourcemapsOptionalParameters())
        .getData();
  }

  /**
   * Restore source maps.
   *
   * <p>See {@link #restoreSourcemapsWithHttpInfoAsync}.
   *
   * @param mapkind The type of source map. Valid values are <code>js</code>, <code>jvm</code>,
   *     <code>ios</code>, <code>react</code>, <code>flutter</code>, <code>elf</code>, <code>ndk
   *     </code>, <code>il2cpp</code>. (required)
   * @param dryRun When set to <code>true</code>, returns the source maps that would be restored
   *     without performing the actual restoration. When set to <code>false</code>, performs the
   *     restoration. (required)
   * @return CompletableFuture&lt;SourcemapsResponse&gt;
   */
  public CompletableFuture<SourcemapsResponse> restoreSourcemapsAsync(
      SourcemapMapKind mapkind, Boolean dryRun) {
    return restoreSourcemapsWithHttpInfoAsync(
            mapkind, dryRun, new RestoreSourcemapsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Restore source maps.
   *
   * <p>See {@link #restoreSourcemapsWithHttpInfo}.
   *
   * @param mapkind The type of source map. Valid values are <code>js</code>, <code>jvm</code>,
   *     <code>ios</code>, <code>react</code>, <code>flutter</code>, <code>elf</code>, <code>ndk
   *     </code>, <code>il2cpp</code>. (required)
   * @param dryRun When set to <code>true</code>, returns the source maps that would be restored
   *     without performing the actual restoration. When set to <code>false</code>, performs the
   *     restoration. (required)
   * @param parameters Optional parameters for the request.
   * @return SourcemapsResponse
   * @throws ApiException if fails to make API call
   */
  public SourcemapsResponse restoreSourcemaps(
      SourcemapMapKind mapkind, Boolean dryRun, RestoreSourcemapsOptionalParameters parameters)
      throws ApiException {
    return restoreSourcemapsWithHttpInfo(mapkind, dryRun, parameters).getData();
  }

  /**
   * Restore source maps.
   *
   * <p>See {@link #restoreSourcemapsWithHttpInfoAsync}.
   *
   * @param mapkind The type of source map. Valid values are <code>js</code>, <code>jvm</code>,
   *     <code>ios</code>, <code>react</code>, <code>flutter</code>, <code>elf</code>, <code>ndk
   *     </code>, <code>il2cpp</code>. (required)
   * @param dryRun When set to <code>true</code>, returns the source maps that would be restored
   *     without performing the actual restoration. When set to <code>false</code>, performs the
   *     restoration. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;SourcemapsResponse&gt;
   */
  public CompletableFuture<SourcemapsResponse> restoreSourcemapsAsync(
      SourcemapMapKind mapkind, Boolean dryRun, RestoreSourcemapsOptionalParameters parameters) {
    return restoreSourcemapsWithHttpInfoAsync(mapkind, dryRun, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Restores previously deleted source maps matching the specified filter criteria. Supports
   * dry-run mode to preview which source maps would be restored without performing the actual
   * restoration.
   *
   * @param mapkind The type of source map. Valid values are <code>js</code>, <code>jvm</code>,
   *     <code>ios</code>, <code>react</code>, <code>flutter</code>, <code>elf</code>, <code>ndk
   *     </code>, <code>il2cpp</code>. (required)
   * @param dryRun When set to <code>true</code>, returns the source maps that would be restored
   *     without performing the actual restoration. When set to <code>false</code>, performs the
   *     restoration. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;SourcemapsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SourcemapsResponse> restoreSourcemapsWithHttpInfo(
      SourcemapMapKind mapkind, Boolean dryRun, RestoreSourcemapsOptionalParameters parameters)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "restoreSourcemaps";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'mapkind' is set
    if (mapkind == null) {
      throw new ApiException(
          400, "Missing the required parameter 'mapkind' when calling restoreSourcemaps");
    }

    // verify the required parameter 'dryRun' is set
    if (dryRun == null) {
      throw new ApiException(
          400, "Missing the required parameter 'dryRun' when calling restoreSourcemaps");
    }
    List<String> filterService = parameters.filterService;
    List<String> filterVersion = parameters.filterVersion;
    List<String> filterVariant = parameters.filterVariant;
    List<String> filterId = parameters.filterId;
    List<String> filterBuildId = parameters.filterBuildId;
    List<String> filterUuid = parameters.filterUuid;
    List<String> filterPlatform = parameters.filterPlatform;
    List<String> filterBuildNumber = parameters.filterBuildNumber;
    List<String> filterBundleName = parameters.filterBundleName;
    List<String> filterArch = parameters.filterArch;
    List<String> filterSymbolSource = parameters.filterSymbolSource;
    List<String> filterOrigin = parameters.filterOrigin;
    List<String> filterOriginVersion = parameters.filterOriginVersion;
    String filterFilename = parameters.filterFilename;
    String filterDebugId = parameters.filterDebugId;
    String filterGnuBuildId = parameters.filterGnuBuildId;
    String filterGoBuildId = parameters.filterGoBuildId;
    String filterFileHash = parameters.filterFileHash;
    // create path and map variables
    String localVarPath = "/api/v2/sourcemaps/restore";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "mapkind", mapkind));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "dry_run", dryRun));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("multi", "filter[service]", filterService));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("multi", "filter[version]", filterVersion));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("multi", "filter[variant]", filterVariant));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[id]", filterId));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("multi", "filter[build_id]", filterBuildId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[uuid]", filterUuid));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("multi", "filter[platform]", filterPlatform));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("multi", "filter[build_number]", filterBuildNumber));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("multi", "filter[bundle_name]", filterBundleName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[arch]", filterArch));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("multi", "filter[symbol_source]", filterSymbolSource));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[origin]", filterOrigin));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("multi", "filter[origin_version]", filterOriginVersion));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[filename]", filterFilename));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[debug_id]", filterDebugId));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[gnu_build_id]", filterGnuBuildId));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[go_build_id]", filterGoBuildId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[file_hash]", filterFileHash));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumApi.restoreSourcemaps",
            localVarPath,
            localVarQueryParams,
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<SourcemapsResponse>() {});
  }

  /**
   * Restore source maps.
   *
   * <p>See {@link #restoreSourcemapsWithHttpInfo}.
   *
   * @param mapkind The type of source map. Valid values are <code>js</code>, <code>jvm</code>,
   *     <code>ios</code>, <code>react</code>, <code>flutter</code>, <code>elf</code>, <code>ndk
   *     </code>, <code>il2cpp</code>. (required)
   * @param dryRun When set to <code>true</code>, returns the source maps that would be restored
   *     without performing the actual restoration. When set to <code>false</code>, performs the
   *     restoration. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;SourcemapsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SourcemapsResponse>> restoreSourcemapsWithHttpInfoAsync(
      SourcemapMapKind mapkind, Boolean dryRun, RestoreSourcemapsOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "restoreSourcemaps";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<SourcemapsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'mapkind' is set
    if (mapkind == null) {
      CompletableFuture<ApiResponse<SourcemapsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'mapkind' when calling restoreSourcemaps"));
      return result;
    }

    // verify the required parameter 'dryRun' is set
    if (dryRun == null) {
      CompletableFuture<ApiResponse<SourcemapsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'dryRun' when calling restoreSourcemaps"));
      return result;
    }
    List<String> filterService = parameters.filterService;
    List<String> filterVersion = parameters.filterVersion;
    List<String> filterVariant = parameters.filterVariant;
    List<String> filterId = parameters.filterId;
    List<String> filterBuildId = parameters.filterBuildId;
    List<String> filterUuid = parameters.filterUuid;
    List<String> filterPlatform = parameters.filterPlatform;
    List<String> filterBuildNumber = parameters.filterBuildNumber;
    List<String> filterBundleName = parameters.filterBundleName;
    List<String> filterArch = parameters.filterArch;
    List<String> filterSymbolSource = parameters.filterSymbolSource;
    List<String> filterOrigin = parameters.filterOrigin;
    List<String> filterOriginVersion = parameters.filterOriginVersion;
    String filterFilename = parameters.filterFilename;
    String filterDebugId = parameters.filterDebugId;
    String filterGnuBuildId = parameters.filterGnuBuildId;
    String filterGoBuildId = parameters.filterGoBuildId;
    String filterFileHash = parameters.filterFileHash;
    // create path and map variables
    String localVarPath = "/api/v2/sourcemaps/restore";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "mapkind", mapkind));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "dry_run", dryRun));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("multi", "filter[service]", filterService));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("multi", "filter[version]", filterVersion));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("multi", "filter[variant]", filterVariant));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[id]", filterId));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("multi", "filter[build_id]", filterBuildId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[uuid]", filterUuid));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("multi", "filter[platform]", filterPlatform));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("multi", "filter[build_number]", filterBuildNumber));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("multi", "filter[bundle_name]", filterBundleName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[arch]", filterArch));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("multi", "filter[symbol_source]", filterSymbolSource));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[origin]", filterOrigin));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("multi", "filter[origin_version]", filterOriginVersion));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[filename]", filterFilename));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[debug_id]", filterDebugId));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[gnu_build_id]", filterGnuBuildId));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[go_build_id]", filterGoBuildId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[file_hash]", filterFileHash));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumApi.restoreSourcemaps",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SourcemapsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<SourcemapsResponse>() {});
  }

  /**
   * Search RUM events.
   *
   * <p>See {@link #searchRUMEventsWithHttpInfo}.
   *
   * @param body (required)
   * @return RUMEventsResponse
   * @throws ApiException if fails to make API call
   */
  public RUMEventsResponse searchRUMEvents(RUMSearchEventsRequest body) throws ApiException {
    return searchRUMEventsWithHttpInfo(body).getData();
  }

  /**
   * Search RUM events.
   *
   * <p>See {@link #searchRUMEventsWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;RUMEventsResponse&gt;
   */
  public CompletableFuture<RUMEventsResponse> searchRUMEventsAsync(RUMSearchEventsRequest body) {
    return searchRUMEventsWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Search RUM events.
   *
   * <p>See {@link #searchRUMEventsWithHttpInfo}.
   *
   * @param body (required)
   * @return PaginationIterable&lt;RUMEvent&gt;
   */
  public PaginationIterable<RUMEvent> searchRUMEventsWithPagination(RUMSearchEventsRequest body) {
    String resultsPath = "getData";
    String valueGetterPath = "getMeta.getPage.getAfter";
    String valueSetterPath = "body.getPage.setCursor";
    Boolean valueSetterParamOptional = false;
    Integer limit;

    if (body.getPage() == null) {
      body.setPage(new RUMQueryPageOptions());
    }

    if (body.getPage().getLimit() == null) {
      limit = 10;
      body.getPage().setLimit(limit);
    } else {
      limit = body.getPage().getLimit();
    }

    LinkedHashMap<String, Object> args = new LinkedHashMap<String, Object>();
    args.put("body", body);

    PaginationIterable iterator =
        new PaginationIterable(
            this,
            "searchRUMEvents",
            resultsPath,
            valueGetterPath,
            valueSetterPath,
            valueSetterParamOptional,
            true,
            true,
            limit,
            args,
            0);

    return iterator;
  }

  /**
   * List endpoint returns RUM events that match a RUM search query. <a
   * href="https://docs.datadoghq.com/logs/guide/collect-multiple-logs-with-pagination">Results are
   * paginated</a>.
   *
   * <p>Use this endpoint to build complex RUM events filtering and search.
   *
   * @param body (required)
   * @return ApiResponse&lt;RUMEventsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<RUMEventsResponse> searchRUMEventsWithHttpInfo(RUMSearchEventsRequest body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling searchRUMEvents");
    }
    // create path and map variables
    String localVarPath = "/api/v2/rum/events/search";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumApi.searchRUMEvents",
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
        new GenericType<RUMEventsResponse>() {});
  }

  /**
   * Search RUM events.
   *
   * <p>See {@link #searchRUMEventsWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;RUMEventsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RUMEventsResponse>> searchRUMEventsWithHttpInfoAsync(
      RUMSearchEventsRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<RUMEventsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling searchRUMEvents"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/rum/events/search";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumApi.searchRUMEvents",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RUMEventsResponse>> result = new CompletableFuture<>();
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
        new GenericType<RUMEventsResponse>() {});
  }

  /**
   * Update a RUM application.
   *
   * <p>See {@link #updateRUMApplicationWithHttpInfo}.
   *
   * @param id RUM application ID. (required)
   * @param body (required)
   * @return RUMApplicationResponse
   * @throws ApiException if fails to make API call
   */
  public RUMApplicationResponse updateRUMApplication(String id, RUMApplicationUpdateRequest body)
      throws ApiException {
    return updateRUMApplicationWithHttpInfo(id, body).getData();
  }

  /**
   * Update a RUM application.
   *
   * <p>See {@link #updateRUMApplicationWithHttpInfoAsync}.
   *
   * @param id RUM application ID. (required)
   * @param body (required)
   * @return CompletableFuture&lt;RUMApplicationResponse&gt;
   */
  public CompletableFuture<RUMApplicationResponse> updateRUMApplicationAsync(
      String id, RUMApplicationUpdateRequest body) {
    return updateRUMApplicationWithHttpInfoAsync(id, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update the RUM application with given ID in your organization.
   *
   * @param id RUM application ID. (required)
   * @param body (required)
   * @return ApiResponse&lt;RUMApplicationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 422 </td><td> Unprocessable Entity. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<RUMApplicationResponse> updateRUMApplicationWithHttpInfo(
      String id, RUMApplicationUpdateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(
          400, "Missing the required parameter 'id' when calling updateRUMApplication");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateRUMApplication");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/applications/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumApi.updateRUMApplication",
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
        new GenericType<RUMApplicationResponse>() {});
  }

  /**
   * Update a RUM application.
   *
   * <p>See {@link #updateRUMApplicationWithHttpInfo}.
   *
   * @param id RUM application ID. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;RUMApplicationResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RUMApplicationResponse>>
      updateRUMApplicationWithHttpInfoAsync(String id, RUMApplicationUpdateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'id' is set
    if (id == null) {
      CompletableFuture<ApiResponse<RUMApplicationResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'id' when calling updateRUMApplication"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<RUMApplicationResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateRUMApplication"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/applications/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumApi.updateRUMApplication",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RUMApplicationResponse>> result = new CompletableFuture<>();
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
        new GenericType<RUMApplicationResponse>() {});
  }
}
