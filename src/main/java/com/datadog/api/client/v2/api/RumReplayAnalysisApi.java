package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.ReplayAnalysisIssueResponse;
import com.datadog.api.client.v2.model.ReplayAnalysisIssueSessionsResponse;
import com.datadog.api.client.v2.model.ReplayAnalysisIssuesResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RumReplayAnalysisApi {
  private ApiClient apiClient;

  public RumReplayAnalysisApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public RumReplayAnalysisApi(ApiClient apiClient) {
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
   * Get replay analysis issue.
   *
   * <p>See {@link #getReplayAnalysisIssueWithHttpInfo}.
   *
   * @param issueId Unique identifier of the issue. (required)
   * @return ReplayAnalysisIssueResponse
   * @throws ApiException if fails to make API call
   */
  public ReplayAnalysisIssueResponse getReplayAnalysisIssue(String issueId) throws ApiException {
    return getReplayAnalysisIssueWithHttpInfo(issueId).getData();
  }

  /**
   * Get replay analysis issue.
   *
   * <p>See {@link #getReplayAnalysisIssueWithHttpInfoAsync}.
   *
   * @param issueId Unique identifier of the issue. (required)
   * @return CompletableFuture&lt;ReplayAnalysisIssueResponse&gt;
   */
  public CompletableFuture<ReplayAnalysisIssueResponse> getReplayAnalysisIssueAsync(
      String issueId) {
    return getReplayAnalysisIssueWithHttpInfoAsync(issueId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Retrieve details of a specific RUM replay analysis issue by its identifier.
   *
   * @param issueId Unique identifier of the issue. (required)
   * @return ApiResponse&lt;ReplayAnalysisIssueResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ReplayAnalysisIssueResponse> getReplayAnalysisIssueWithHttpInfo(String issueId)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getReplayAnalysisIssue";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'issueId' is set
    if (issueId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'issueId' when calling getReplayAnalysisIssue");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/replay/analysis/issues/{issue_id}"
            .replaceAll("\\{" + "issue_id" + "\\}", apiClient.escapeString(issueId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumReplayAnalysisApi.getReplayAnalysisIssue",
            localVarPath,
            new ArrayList<Pair>(),
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
        new GenericType<ReplayAnalysisIssueResponse>() {});
  }

  /**
   * Get replay analysis issue.
   *
   * <p>See {@link #getReplayAnalysisIssueWithHttpInfo}.
   *
   * @param issueId Unique identifier of the issue. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ReplayAnalysisIssueResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ReplayAnalysisIssueResponse>>
      getReplayAnalysisIssueWithHttpInfoAsync(String issueId) {
    // Check if unstable operation is enabled
    String operationId = "getReplayAnalysisIssue";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ReplayAnalysisIssueResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'issueId' is set
    if (issueId == null) {
      CompletableFuture<ApiResponse<ReplayAnalysisIssueResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'issueId' when calling getReplayAnalysisIssue"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/replay/analysis/issues/{issue_id}"
            .replaceAll("\\{" + "issue_id" + "\\}", apiClient.escapeString(issueId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumReplayAnalysisApi.getReplayAnalysisIssue",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ReplayAnalysisIssueResponse>> result =
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
        new GenericType<ReplayAnalysisIssueResponse>() {});
  }

  /** Manage optional parameters to listReplayAnalysisIssues. */
  public static class ListReplayAnalysisIssuesOptionalParameters {
    private String filterApplicationId;
    private String filterSeverity;
    private String filterViewName;
    private String filterIssueCategory;
    private String sort;
    private Integer pageNumber;
    private Integer pageSize;

    /**
     * Set filterApplicationId.
     *
     * @param filterApplicationId Filter issues by application UUID. (optional)
     * @return ListReplayAnalysisIssuesOptionalParameters
     */
    public ListReplayAnalysisIssuesOptionalParameters filterApplicationId(
        String filterApplicationId) {
      this.filterApplicationId = filterApplicationId;
      return this;
    }

    /**
     * Set filterSeverity.
     *
     * @param filterSeverity Filter issues by comma-separated severity values. Valid values are
     *     <code>high</code>, <code>medium</code>, and <code>low</code>. (optional)
     * @return ListReplayAnalysisIssuesOptionalParameters
     */
    public ListReplayAnalysisIssuesOptionalParameters filterSeverity(String filterSeverity) {
      this.filterSeverity = filterSeverity;
      return this;
    }

    /**
     * Set filterViewName.
     *
     * @param filterViewName Filter issues by comma-separated view names. (optional)
     * @return ListReplayAnalysisIssuesOptionalParameters
     */
    public ListReplayAnalysisIssuesOptionalParameters filterViewName(String filterViewName) {
      this.filterViewName = filterViewName;
      return this;
    }

    /**
     * Set filterIssueCategory.
     *
     * @param filterIssueCategory Filter issues by comma-separated issue categories. (optional)
     * @return ListReplayAnalysisIssuesOptionalParameters
     */
    public ListReplayAnalysisIssuesOptionalParameters filterIssueCategory(
        String filterIssueCategory) {
      this.filterIssueCategory = filterIssueCategory;
      return this;
    }

    /**
     * Set sort.
     *
     * @param sort Sort order for the results. Valid values are <code>created_at</code>, <code>
     *     -created_at</code>, <code>severity</code>, <code>-severity</code>, <code>session_count
     *     </code>, and <code>-session_count</code>. Defaults to <code>-created_at</code>.
     *     (optional, default to "-created_at")
     * @return ListReplayAnalysisIssuesOptionalParameters
     */
    public ListReplayAnalysisIssuesOptionalParameters sort(String sort) {
      this.sort = sort;
      return this;
    }

    /**
     * Set pageNumber.
     *
     * @param pageNumber Page number for pagination (0-indexed). (optional, default to 0)
     * @return ListReplayAnalysisIssuesOptionalParameters
     */
    public ListReplayAnalysisIssuesOptionalParameters pageNumber(Integer pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set pageSize.
     *
     * @param pageSize Number of items per page. Must be between 1 and 100. (optional, default to
     *     15)
     * @return ListReplayAnalysisIssuesOptionalParameters
     */
    public ListReplayAnalysisIssuesOptionalParameters pageSize(Integer pageSize) {
      this.pageSize = pageSize;
      return this;
    }
  }

  /**
   * List replay analysis issues.
   *
   * <p>See {@link #listReplayAnalysisIssuesWithHttpInfo}.
   *
   * @return ReplayAnalysisIssuesResponse
   * @throws ApiException if fails to make API call
   */
  public ReplayAnalysisIssuesResponse listReplayAnalysisIssues() throws ApiException {
    return listReplayAnalysisIssuesWithHttpInfo(new ListReplayAnalysisIssuesOptionalParameters())
        .getData();
  }

  /**
   * List replay analysis issues.
   *
   * <p>See {@link #listReplayAnalysisIssuesWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;ReplayAnalysisIssuesResponse&gt;
   */
  public CompletableFuture<ReplayAnalysisIssuesResponse> listReplayAnalysisIssuesAsync() {
    return listReplayAnalysisIssuesWithHttpInfoAsync(
            new ListReplayAnalysisIssuesOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List replay analysis issues.
   *
   * <p>See {@link #listReplayAnalysisIssuesWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return ReplayAnalysisIssuesResponse
   * @throws ApiException if fails to make API call
   */
  public ReplayAnalysisIssuesResponse listReplayAnalysisIssues(
      ListReplayAnalysisIssuesOptionalParameters parameters) throws ApiException {
    return listReplayAnalysisIssuesWithHttpInfo(parameters).getData();
  }

  /**
   * List replay analysis issues.
   *
   * <p>See {@link #listReplayAnalysisIssuesWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ReplayAnalysisIssuesResponse&gt;
   */
  public CompletableFuture<ReplayAnalysisIssuesResponse> listReplayAnalysisIssuesAsync(
      ListReplayAnalysisIssuesOptionalParameters parameters) {
    return listReplayAnalysisIssuesWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Retrieve a paginated list of RUM replay analysis issues, optionally filtered by application,
   * severity, view name, or issue category.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;ReplayAnalysisIssuesResponse&gt;
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
  public ApiResponse<ReplayAnalysisIssuesResponse> listReplayAnalysisIssuesWithHttpInfo(
      ListReplayAnalysisIssuesOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listReplayAnalysisIssues";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    String filterApplicationId = parameters.filterApplicationId;
    String filterSeverity = parameters.filterSeverity;
    String filterViewName = parameters.filterViewName;
    String filterIssueCategory = parameters.filterIssueCategory;
    String sort = parameters.sort;
    Integer pageNumber = parameters.pageNumber;
    Integer pageSize = parameters.pageSize;
    // create path and map variables
    String localVarPath = "/api/v2/replay/analysis/issues";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[application_id]", filterApplicationId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[severity]", filterSeverity));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[view_name]", filterViewName));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[issue_category]", filterIssueCategory));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumReplayAnalysisApi.listReplayAnalysisIssues",
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
        new GenericType<ReplayAnalysisIssuesResponse>() {});
  }

  /**
   * List replay analysis issues.
   *
   * <p>See {@link #listReplayAnalysisIssuesWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;ReplayAnalysisIssuesResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ReplayAnalysisIssuesResponse>>
      listReplayAnalysisIssuesWithHttpInfoAsync(
          ListReplayAnalysisIssuesOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listReplayAnalysisIssues";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ReplayAnalysisIssuesResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    String filterApplicationId = parameters.filterApplicationId;
    String filterSeverity = parameters.filterSeverity;
    String filterViewName = parameters.filterViewName;
    String filterIssueCategory = parameters.filterIssueCategory;
    String sort = parameters.sort;
    Integer pageNumber = parameters.pageNumber;
    Integer pageSize = parameters.pageSize;
    // create path and map variables
    String localVarPath = "/api/v2/replay/analysis/issues";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[application_id]", filterApplicationId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[severity]", filterSeverity));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[view_name]", filterViewName));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[issue_category]", filterIssueCategory));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumReplayAnalysisApi.listReplayAnalysisIssues",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ReplayAnalysisIssuesResponse>> result =
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
        new GenericType<ReplayAnalysisIssuesResponse>() {});
  }

  /** Manage optional parameters to listReplayAnalysisIssueSessions. */
  public static class ListReplayAnalysisIssueSessionsOptionalParameters {
    private String sort;
    private Integer pageNumber;
    private Integer pageSize;

    /**
     * Set sort.
     *
     * @param sort Sort order for the results. Valid values are <code>last_seen_at</code>, <code>
     *     -last_seen_at</code>, <code>proximity</code>, and <code>-proximity</code>. Defaults to
     *     <code>-last_seen_at</code>. (optional, default to "-last_seen_at")
     * @return ListReplayAnalysisIssueSessionsOptionalParameters
     */
    public ListReplayAnalysisIssueSessionsOptionalParameters sort(String sort) {
      this.sort = sort;
      return this;
    }

    /**
     * Set pageNumber.
     *
     * @param pageNumber Page number for pagination (0-indexed). (optional, default to 0)
     * @return ListReplayAnalysisIssueSessionsOptionalParameters
     */
    public ListReplayAnalysisIssueSessionsOptionalParameters pageNumber(Integer pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set pageSize.
     *
     * @param pageSize Number of items per page. Must be between 1 and 100. (optional, default to
     *     15)
     * @return ListReplayAnalysisIssueSessionsOptionalParameters
     */
    public ListReplayAnalysisIssueSessionsOptionalParameters pageSize(Integer pageSize) {
      this.pageSize = pageSize;
      return this;
    }
  }

  /**
   * List replay analysis issue sessions.
   *
   * <p>See {@link #listReplayAnalysisIssueSessionsWithHttpInfo}.
   *
   * @param issueId Unique identifier of the issue. (required)
   * @return ReplayAnalysisIssueSessionsResponse
   * @throws ApiException if fails to make API call
   */
  public ReplayAnalysisIssueSessionsResponse listReplayAnalysisIssueSessions(String issueId)
      throws ApiException {
    return listReplayAnalysisIssueSessionsWithHttpInfo(
            issueId, new ListReplayAnalysisIssueSessionsOptionalParameters())
        .getData();
  }

  /**
   * List replay analysis issue sessions.
   *
   * <p>See {@link #listReplayAnalysisIssueSessionsWithHttpInfoAsync}.
   *
   * @param issueId Unique identifier of the issue. (required)
   * @return CompletableFuture&lt;ReplayAnalysisIssueSessionsResponse&gt;
   */
  public CompletableFuture<ReplayAnalysisIssueSessionsResponse>
      listReplayAnalysisIssueSessionsAsync(String issueId) {
    return listReplayAnalysisIssueSessionsWithHttpInfoAsync(
            issueId, new ListReplayAnalysisIssueSessionsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List replay analysis issue sessions.
   *
   * <p>See {@link #listReplayAnalysisIssueSessionsWithHttpInfo}.
   *
   * @param issueId Unique identifier of the issue. (required)
   * @param parameters Optional parameters for the request.
   * @return ReplayAnalysisIssueSessionsResponse
   * @throws ApiException if fails to make API call
   */
  public ReplayAnalysisIssueSessionsResponse listReplayAnalysisIssueSessions(
      String issueId, ListReplayAnalysisIssueSessionsOptionalParameters parameters)
      throws ApiException {
    return listReplayAnalysisIssueSessionsWithHttpInfo(issueId, parameters).getData();
  }

  /**
   * List replay analysis issue sessions.
   *
   * <p>See {@link #listReplayAnalysisIssueSessionsWithHttpInfoAsync}.
   *
   * @param issueId Unique identifier of the issue. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ReplayAnalysisIssueSessionsResponse&gt;
   */
  public CompletableFuture<ReplayAnalysisIssueSessionsResponse>
      listReplayAnalysisIssueSessionsAsync(
          String issueId, ListReplayAnalysisIssueSessionsOptionalParameters parameters) {
    return listReplayAnalysisIssueSessionsWithHttpInfoAsync(issueId, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Retrieve a paginated list of sessions related to a specific RUM replay analysis issue.
   *
   * @param issueId Unique identifier of the issue. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;ReplayAnalysisIssueSessionsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ReplayAnalysisIssueSessionsResponse>
      listReplayAnalysisIssueSessionsWithHttpInfo(
          String issueId, ListReplayAnalysisIssueSessionsOptionalParameters parameters)
          throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listReplayAnalysisIssueSessions";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'issueId' is set
    if (issueId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'issueId' when calling listReplayAnalysisIssueSessions");
    }
    String sort = parameters.sort;
    Integer pageNumber = parameters.pageNumber;
    Integer pageSize = parameters.pageSize;
    // create path and map variables
    String localVarPath =
        "/api/v2/replay/analysis/issues/{issue_id}/sessions"
            .replaceAll("\\{" + "issue_id" + "\\}", apiClient.escapeString(issueId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumReplayAnalysisApi.listReplayAnalysisIssueSessions",
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
        new GenericType<ReplayAnalysisIssueSessionsResponse>() {});
  }

  /**
   * List replay analysis issue sessions.
   *
   * <p>See {@link #listReplayAnalysisIssueSessionsWithHttpInfo}.
   *
   * @param issueId Unique identifier of the issue. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;ReplayAnalysisIssueSessionsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ReplayAnalysisIssueSessionsResponse>>
      listReplayAnalysisIssueSessionsWithHttpInfoAsync(
          String issueId, ListReplayAnalysisIssueSessionsOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listReplayAnalysisIssueSessions";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ReplayAnalysisIssueSessionsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'issueId' is set
    if (issueId == null) {
      CompletableFuture<ApiResponse<ReplayAnalysisIssueSessionsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'issueId' when calling"
                  + " listReplayAnalysisIssueSessions"));
      return result;
    }
    String sort = parameters.sort;
    Integer pageNumber = parameters.pageNumber;
    Integer pageSize = parameters.pageSize;
    // create path and map variables
    String localVarPath =
        "/api/v2/replay/analysis/issues/{issue_id}/sessions"
            .replaceAll("\\{" + "issue_id" + "\\}", apiClient.escapeString(issueId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumReplayAnalysisApi.listReplayAnalysisIssueSessions",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ReplayAnalysisIssueSessionsResponse>> result =
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
        new GenericType<ReplayAnalysisIssueSessionsResponse>() {});
  }
}
