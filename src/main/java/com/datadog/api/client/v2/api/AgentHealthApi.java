package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.AgentHealthAgentType;
import com.datadog.api.client.v2.model.AgentHealthHostIssuesResponse;
import com.datadog.api.client.v2.model.AgentHealthIssueResponse;
import com.datadog.api.client.v2.model.AgentHealthIssuesResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AgentHealthApi {
  private ApiClient apiClient;

  public AgentHealthApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public AgentHealthApi(ApiClient apiClient) {
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
   * Get an Agent Health issue.
   *
   * <p>See {@link #getAgentHealthIssueWithHttpInfo}.
   *
   * @param issueId The unique identifier of the issue. It can contain <code>:</code> and must be
   *     percent-encoded by clients when included in the path. (required)
   * @return AgentHealthIssueResponse
   * @throws ApiException if fails to make API call
   */
  public AgentHealthIssueResponse getAgentHealthIssue(String issueId) throws ApiException {
    return getAgentHealthIssueWithHttpInfo(issueId).getData();
  }

  /**
   * Get an Agent Health issue.
   *
   * <p>See {@link #getAgentHealthIssueWithHttpInfoAsync}.
   *
   * @param issueId The unique identifier of the issue. It can contain <code>:</code> and must be
   *     percent-encoded by clients when included in the path. (required)
   * @return CompletableFuture&lt;AgentHealthIssueResponse&gt;
   */
  public CompletableFuture<AgentHealthIssueResponse> getAgentHealthIssueAsync(String issueId) {
    return getAgentHealthIssueWithHttpInfoAsync(issueId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get an Agent Health issue and its available remediation in your organization. Only open issues
   * are returned. The <code>remediation</code> attribute is omitted when the issue has no
   * remediation.
   *
   * <p>Returns <code>404</code> if the issue does not exist, is not open, belongs to another
   * organization, or you do not have access to its data. This response does not reveal whether the
   * issue exists. Returns <code>403</code> if you lack the <code>hosts_read</code> permission.
   *
   * @param issueId The unique identifier of the issue. It can contain <code>:</code> and must be
   *     percent-encoded by clients when included in the path. (required)
   * @return ApiResponse&lt;AgentHealthIssueResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AgentHealthIssueResponse> getAgentHealthIssueWithHttpInfo(String issueId)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getAgentHealthIssue";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'issueId' is set
    if (issueId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'issueId' when calling getAgentHealthIssue");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/agenthealth/issues/{issue_id}"
            .replaceAll("\\{" + "issue_id" + "\\}", apiClient.escapeString(issueId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AgentHealthApi.getAgentHealthIssue",
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
        new GenericType<AgentHealthIssueResponse>() {});
  }

  /**
   * Get an Agent Health issue.
   *
   * <p>See {@link #getAgentHealthIssueWithHttpInfo}.
   *
   * @param issueId The unique identifier of the issue. It can contain <code>:</code> and must be
   *     percent-encoded by clients when included in the path. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AgentHealthIssueResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AgentHealthIssueResponse>>
      getAgentHealthIssueWithHttpInfoAsync(String issueId) {
    // Check if unstable operation is enabled
    String operationId = "getAgentHealthIssue";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<AgentHealthIssueResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'issueId' is set
    if (issueId == null) {
      CompletableFuture<ApiResponse<AgentHealthIssueResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'issueId' when calling getAgentHealthIssue"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/agenthealth/issues/{issue_id}"
            .replaceAll("\\{" + "issue_id" + "\\}", apiClient.escapeString(issueId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AgentHealthApi.getAgentHealthIssue",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AgentHealthIssueResponse>> result = new CompletableFuture<>();
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
        new GenericType<AgentHealthIssueResponse>() {});
  }

  /** Manage optional parameters to listAgentHealthHostIssues. */
  public static class ListAgentHealthHostIssuesOptionalParameters {
    private AgentHealthAgentType agentType;

    /**
     * Set agentType.
     *
     * @param agentType Agent type associated with the resource. Defaults to <code>node</code> when
     *     omitted. (optional, default to "node")
     * @return ListAgentHealthHostIssuesOptionalParameters
     */
    public ListAgentHealthHostIssuesOptionalParameters agentType(AgentHealthAgentType agentType) {
      this.agentType = agentType;
      return this;
    }
  }

  /**
   * List active Agent Health issues.
   *
   * <p>See {@link #listAgentHealthHostIssuesWithHttpInfo}.
   *
   * @param resourceId Resource identifier whose active Agent Health issues should be returned: a
   *     DaemonSet UID for a node Agent or a cluster UUID for a Cluster Agent. (required)
   * @return AgentHealthHostIssuesResponse
   * @throws ApiException if fails to make API call
   */
  public AgentHealthHostIssuesResponse listAgentHealthHostIssues(String resourceId)
      throws ApiException {
    return listAgentHealthHostIssuesWithHttpInfo(
            resourceId, new ListAgentHealthHostIssuesOptionalParameters())
        .getData();
  }

  /**
   * List active Agent Health issues.
   *
   * <p>See {@link #listAgentHealthHostIssuesWithHttpInfoAsync}.
   *
   * @param resourceId Resource identifier whose active Agent Health issues should be returned: a
   *     DaemonSet UID for a node Agent or a cluster UUID for a Cluster Agent. (required)
   * @return CompletableFuture&lt;AgentHealthHostIssuesResponse&gt;
   */
  public CompletableFuture<AgentHealthHostIssuesResponse> listAgentHealthHostIssuesAsync(
      String resourceId) {
    return listAgentHealthHostIssuesWithHttpInfoAsync(
            resourceId, new ListAgentHealthHostIssuesOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List active Agent Health issues.
   *
   * <p>See {@link #listAgentHealthHostIssuesWithHttpInfo}.
   *
   * @param resourceId Resource identifier whose active Agent Health issues should be returned: a
   *     DaemonSet UID for a node Agent or a cluster UUID for a Cluster Agent. (required)
   * @param parameters Optional parameters for the request.
   * @return AgentHealthHostIssuesResponse
   * @throws ApiException if fails to make API call
   */
  public AgentHealthHostIssuesResponse listAgentHealthHostIssues(
      String resourceId, ListAgentHealthHostIssuesOptionalParameters parameters)
      throws ApiException {
    return listAgentHealthHostIssuesWithHttpInfo(resourceId, parameters).getData();
  }

  /**
   * List active Agent Health issues.
   *
   * <p>See {@link #listAgentHealthHostIssuesWithHttpInfoAsync}.
   *
   * @param resourceId Resource identifier whose active Agent Health issues should be returned: a
   *     DaemonSet UID for a node Agent or a cluster UUID for a Cluster Agent. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;AgentHealthHostIssuesResponse&gt;
   */
  public CompletableFuture<AgentHealthHostIssuesResponse> listAgentHealthHostIssuesAsync(
      String resourceId, ListAgentHealthHostIssuesOptionalParameters parameters) {
    return listAgentHealthHostIssuesWithHttpInfoAsync(resourceId, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Returns the active Agent Health issues for a node Agent or Cluster Agent resource.
   *
   * @param resourceId Resource identifier whose active Agent Health issues should be returned: a
   *     DaemonSet UID for a node Agent or a cluster UUID for a Cluster Agent. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;AgentHealthHostIssuesResponse&gt;
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
  public ApiResponse<AgentHealthHostIssuesResponse> listAgentHealthHostIssuesWithHttpInfo(
      String resourceId, ListAgentHealthHostIssuesOptionalParameters parameters)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'resourceId' is set
    if (resourceId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'resourceId' when calling listAgentHealthHostIssues");
    }
    AgentHealthAgentType agentType = parameters.agentType;
    // create path and map variables
    String localVarPath =
        "/api/v2/agenthealth/hosts/{resource_id}/issues"
            .replaceAll(
                "\\{" + "resource_id" + "\\}", apiClient.escapeString(resourceId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "agent_type", agentType));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AgentHealthApi.listAgentHealthHostIssues",
            localVarPath,
            localVarQueryParams,
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<AgentHealthHostIssuesResponse>() {});
  }

  /**
   * List active Agent Health issues.
   *
   * <p>See {@link #listAgentHealthHostIssuesWithHttpInfo}.
   *
   * @param resourceId Resource identifier whose active Agent Health issues should be returned: a
   *     DaemonSet UID for a node Agent or a cluster UUID for a Cluster Agent. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;AgentHealthHostIssuesResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AgentHealthHostIssuesResponse>>
      listAgentHealthHostIssuesWithHttpInfoAsync(
          String resourceId, ListAgentHealthHostIssuesOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'resourceId' is set
    if (resourceId == null) {
      CompletableFuture<ApiResponse<AgentHealthHostIssuesResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'resourceId' when calling"
                  + " listAgentHealthHostIssues"));
      return result;
    }
    AgentHealthAgentType agentType = parameters.agentType;
    // create path and map variables
    String localVarPath =
        "/api/v2/agenthealth/hosts/{resource_id}/issues"
            .replaceAll(
                "\\{" + "resource_id" + "\\}", apiClient.escapeString(resourceId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "agent_type", agentType));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AgentHealthApi.listAgentHealthHostIssues",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AgentHealthHostIssuesResponse>> result =
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
        new GenericType<AgentHealthHostIssuesResponse>() {});
  }

  /** Manage optional parameters to listAgentHealthIssues. */
  public static class ListAgentHealthIssuesOptionalParameters {
    private Long pageSize;
    private Long pageNumber;
    private String filterSeverity;
    private String filterCategory;
    private String filterIssueType;
    private String filterResourceKind;
    private String filterResourceId;

    /**
     * Set pageSize.
     *
     * @param pageSize The number of issues to return per page, from 1 to 100. Defaults to 25.
     *     (optional, default to 25)
     * @return ListAgentHealthIssuesOptionalParameters
     */
    public ListAgentHealthIssuesOptionalParameters pageSize(Long pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set pageNumber.
     *
     * @param pageNumber The zero-based page number, from 0 to 1000000. Defaults to 0. (optional,
     *     default to 0)
     * @return ListAgentHealthIssuesOptionalParameters
     */
    public ListAgentHealthIssuesOptionalParameters pageNumber(Long pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set filterSeverity.
     *
     * @param filterSeverity Filter by a comma-separated list of exact <code>severity</code> values,
     *     up to 50 values of at most 256 characters each. Values are combined with OR within this
     *     filter and AND across filters. Blank entries are ignored; an all-blank filter is treated
     *     as absent. (optional)
     * @return ListAgentHealthIssuesOptionalParameters
     */
    public ListAgentHealthIssuesOptionalParameters filterSeverity(String filterSeverity) {
      this.filterSeverity = filterSeverity;
      return this;
    }

    /**
     * Set filterCategory.
     *
     * @param filterCategory Filter by a comma-separated list of exact <code>category</code> values,
     *     up to 50 values of at most 256 characters each. Values are combined with OR within this
     *     filter and AND across filters. Blank entries are ignored; an all-blank filter is treated
     *     as absent. (optional)
     * @return ListAgentHealthIssuesOptionalParameters
     */
    public ListAgentHealthIssuesOptionalParameters filterCategory(String filterCategory) {
      this.filterCategory = filterCategory;
      return this;
    }

    /**
     * Set filterIssueType.
     *
     * @param filterIssueType Filter by a comma-separated list of exact <code>issue_type</code>
     *     values, up to 50 values of at most 256 characters each. Values are combined with OR
     *     within this filter and AND across filters. Blank entries are ignored; an all-blank filter
     *     is treated as absent. (optional)
     * @return ListAgentHealthIssuesOptionalParameters
     */
    public ListAgentHealthIssuesOptionalParameters filterIssueType(String filterIssueType) {
      this.filterIssueType = filterIssueType;
      return this;
    }

    /**
     * Set filterResourceKind.
     *
     * @param filterResourceKind Filter by a comma-separated list of exact <code>resource_kind
     *     </code> values, up to 50 values of at most 256 characters each. Values are combined with
     *     OR within this filter and AND across filters. Blank entries are ignored; an all-blank
     *     filter is treated as absent. (optional)
     * @return ListAgentHealthIssuesOptionalParameters
     */
    public ListAgentHealthIssuesOptionalParameters filterResourceKind(String filterResourceKind) {
      this.filterResourceKind = filterResourceKind;
      return this;
    }

    /**
     * Set filterResourceId.
     *
     * @param filterResourceId Filter by a comma-separated list of exact <code>resource_id</code>
     *     values, up to 50 values of at most 256 characters each. Values are combined with OR
     *     within this filter and AND across filters. Blank entries are ignored; an all-blank filter
     *     is treated as absent. (optional)
     * @return ListAgentHealthIssuesOptionalParameters
     */
    public ListAgentHealthIssuesOptionalParameters filterResourceId(String filterResourceId) {
      this.filterResourceId = filterResourceId;
      return this;
    }
  }

  /**
   * List Agent Health issues.
   *
   * <p>See {@link #listAgentHealthIssuesWithHttpInfo}.
   *
   * @return AgentHealthIssuesResponse
   * @throws ApiException if fails to make API call
   */
  public AgentHealthIssuesResponse listAgentHealthIssues() throws ApiException {
    return listAgentHealthIssuesWithHttpInfo(new ListAgentHealthIssuesOptionalParameters())
        .getData();
  }

  /**
   * List Agent Health issues.
   *
   * <p>See {@link #listAgentHealthIssuesWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;AgentHealthIssuesResponse&gt;
   */
  public CompletableFuture<AgentHealthIssuesResponse> listAgentHealthIssuesAsync() {
    return listAgentHealthIssuesWithHttpInfoAsync(new ListAgentHealthIssuesOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List Agent Health issues.
   *
   * <p>See {@link #listAgentHealthIssuesWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return AgentHealthIssuesResponse
   * @throws ApiException if fails to make API call
   */
  public AgentHealthIssuesResponse listAgentHealthIssues(
      ListAgentHealthIssuesOptionalParameters parameters) throws ApiException {
    return listAgentHealthIssuesWithHttpInfo(parameters).getData();
  }

  /**
   * List Agent Health issues.
   *
   * <p>See {@link #listAgentHealthIssuesWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;AgentHealthIssuesResponse&gt;
   */
  public CompletableFuture<AgentHealthIssuesResponse> listAgentHealthIssuesAsync(
      ListAgentHealthIssuesOptionalParameters parameters) {
    return listAgentHealthIssuesWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List Agent Health issues across your organization. Only open issues are returned. Returns
   * <code>403</code> if you lack the <code>hosts_read</code> permission.
   *
   * <p>Results use a stable order: severity rank (<code>high</code>, <code>medium</code>, <code>low
   * </code>, then other values), then <code>first_seen_at</code> descending with missing timestamps
   * last, then issue ID ascending. Use <code>page[size]</code> and the zero-based <code>
   * page[number]</code> to paginate. Invalid page values return a <code>400</code> JSON:API error
   * response. <code>meta.page.total_filtered_count</code> is the number of issues matching the
   * filters, and <code>meta.page.total_count</code> the number of open issues in the organization.
   *
   * <p>Each filter accepts up to 50 comma-separated exact values of at most 256 characters each,
   * combined with OR within a filter and AND across filters. Blank entries are ignored; an
   * all-blank filter is treated as absent.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;AgentHealthIssuesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AgentHealthIssuesResponse> listAgentHealthIssuesWithHttpInfo(
      ListAgentHealthIssuesOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listAgentHealthIssues";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    Long pageSize = parameters.pageSize;
    Long pageNumber = parameters.pageNumber;
    String filterSeverity = parameters.filterSeverity;
    String filterCategory = parameters.filterCategory;
    String filterIssueType = parameters.filterIssueType;
    String filterResourceKind = parameters.filterResourceKind;
    String filterResourceId = parameters.filterResourceId;
    // create path and map variables
    String localVarPath = "/api/v2/agenthealth/issues";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[severity]", filterSeverity));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[category]", filterCategory));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[issue_type]", filterIssueType));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[resource_kind]", filterResourceKind));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[resource_id]", filterResourceId));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AgentHealthApi.listAgentHealthIssues",
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
        new GenericType<AgentHealthIssuesResponse>() {});
  }

  /**
   * List Agent Health issues.
   *
   * <p>See {@link #listAgentHealthIssuesWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;AgentHealthIssuesResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AgentHealthIssuesResponse>>
      listAgentHealthIssuesWithHttpInfoAsync(ListAgentHealthIssuesOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listAgentHealthIssues";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<AgentHealthIssuesResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    Long pageSize = parameters.pageSize;
    Long pageNumber = parameters.pageNumber;
    String filterSeverity = parameters.filterSeverity;
    String filterCategory = parameters.filterCategory;
    String filterIssueType = parameters.filterIssueType;
    String filterResourceKind = parameters.filterResourceKind;
    String filterResourceId = parameters.filterResourceId;
    // create path and map variables
    String localVarPath = "/api/v2/agenthealth/issues";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[severity]", filterSeverity));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[category]", filterCategory));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[issue_type]", filterIssueType));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[resource_kind]", filterResourceKind));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[resource_id]", filterResourceId));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AgentHealthApi.listAgentHealthIssues",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AgentHealthIssuesResponse>> result = new CompletableFuture<>();
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
        new GenericType<AgentHealthIssuesResponse>() {});
  }
}
