package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.RemediationExecuteRequest;
import com.datadog.api.client.v2.model.RemediationExecuteResponse;
import com.datadog.api.client.v2.model.RemediationGetInvestigationResponse;
import com.datadog.api.client.v2.model.RemediationListInvestigationsResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class EcsRemediationApi {
  private ApiClient apiClient;

  public EcsRemediationApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public EcsRemediationApi(ApiClient apiClient) {
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
   * Execute an ECS remediation.
   *
   * <p>See {@link #executeRemediationWithHttpInfo}.
   *
   * @param body The investigation to remediate and the AWS connection to use. (required)
   * @return RemediationExecuteResponse
   * @throws ApiException if fails to make API call
   */
  public RemediationExecuteResponse executeRemediation(RemediationExecuteRequest body)
      throws ApiException {
    return executeRemediationWithHttpInfo(body).getData();
  }

  /**
   * Execute an ECS remediation.
   *
   * <p>See {@link #executeRemediationWithHttpInfoAsync}.
   *
   * @param body The investigation to remediate and the AWS connection to use. (required)
   * @return CompletableFuture&lt;RemediationExecuteResponse&gt;
   */
  public CompletableFuture<RemediationExecuteResponse> executeRemediationAsync(
      RemediationExecuteRequest body) {
    return executeRemediationWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Trigger execution of the proposed remediation for an investigation through the configured AWS
   * connection. The investigation must belong to the caller's organization.
   *
   * @param body The investigation to remediate and the AWS connection to use. (required)
   * @return ApiResponse&lt;RemediationExecuteResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<RemediationExecuteResponse> executeRemediationWithHttpInfo(
      RemediationExecuteRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling executeRemediation");
    }
    // create path and map variables
    String localVarPath = "/api/ui/orchestration/ecs_remediation/execute";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.EcsRemediationApi.executeRemediation",
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
        new GenericType<RemediationExecuteResponse>() {});
  }

  /**
   * Execute an ECS remediation.
   *
   * <p>See {@link #executeRemediationWithHttpInfo}.
   *
   * @param body The investigation to remediate and the AWS connection to use. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;RemediationExecuteResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RemediationExecuteResponse>>
      executeRemediationWithHttpInfoAsync(RemediationExecuteRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<RemediationExecuteResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling executeRemediation"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/ui/orchestration/ecs_remediation/execute";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.EcsRemediationApi.executeRemediation",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RemediationExecuteResponse>> result = new CompletableFuture<>();
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
        new GenericType<RemediationExecuteResponse>() {});
  }

  /**
   * Get an ECS remediation investigation.
   *
   * <p>See {@link #getEcsRemediationInvestigationWithHttpInfo}.
   *
   * @param id The investigation ID. (required)
   * @return RemediationGetInvestigationResponse
   * @throws ApiException if fails to make API call
   */
  public RemediationGetInvestigationResponse getEcsRemediationInvestigation(String id)
      throws ApiException {
    return getEcsRemediationInvestigationWithHttpInfo(id).getData();
  }

  /**
   * Get an ECS remediation investigation.
   *
   * <p>See {@link #getEcsRemediationInvestigationWithHttpInfoAsync}.
   *
   * @param id The investigation ID. (required)
   * @return CompletableFuture&lt;RemediationGetInvestigationResponse&gt;
   */
  public CompletableFuture<RemediationGetInvestigationResponse> getEcsRemediationInvestigationAsync(
      String id) {
    return getEcsRemediationInvestigationWithHttpInfoAsync(id)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a single ECS remediation investigation by ID, including its proposed plan, history, and ECS
   * workload metadata.
   *
   * @param id The investigation ID. (required)
   * @return ApiResponse&lt;RemediationGetInvestigationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<RemediationGetInvestigationResponse>
      getEcsRemediationInvestigationWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(
          400, "Missing the required parameter 'id' when calling getEcsRemediationInvestigation");
    }
    // create path and map variables
    String localVarPath = "/api/ui/orchestration/ecs_remediation/investigation";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.EcsRemediationApi.getEcsRemediationInvestigation",
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
        new GenericType<RemediationGetInvestigationResponse>() {});
  }

  /**
   * Get an ECS remediation investigation.
   *
   * <p>See {@link #getEcsRemediationInvestigationWithHttpInfo}.
   *
   * @param id The investigation ID. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;RemediationGetInvestigationResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RemediationGetInvestigationResponse>>
      getEcsRemediationInvestigationWithHttpInfoAsync(String id) {
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
      CompletableFuture<ApiResponse<RemediationGetInvestigationResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'id' when calling getEcsRemediationInvestigation"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/ui/orchestration/ecs_remediation/investigation";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.EcsRemediationApi.getEcsRemediationInvestigation",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RemediationGetInvestigationResponse>> result =
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
        new GenericType<RemediationGetInvestigationResponse>() {});
  }

  /** Manage optional parameters to listEcsRemediationInvestigations. */
  public static class ListEcsRemediationInvestigationsOptionalParameters {
    private String clusterArn;
    private String clusterName;
    private String serviceArn;
    private String taskArn;
    private String resourceArn;
    private List<String> status;
    private String issueType;
    private Long sinceMs;
    private Long untilMs;
    private Integer pageSize;
    private String pageToken;

    /**
     * Set clusterArn.
     *
     * @param clusterArn Filter by ECS cluster ARN. (optional)
     * @return ListEcsRemediationInvestigationsOptionalParameters
     */
    public ListEcsRemediationInvestigationsOptionalParameters clusterArn(String clusterArn) {
      this.clusterArn = clusterArn;
      return this;
    }

    /**
     * Set clusterName.
     *
     * @param clusterName Filter by ECS cluster name. (optional)
     * @return ListEcsRemediationInvestigationsOptionalParameters
     */
    public ListEcsRemediationInvestigationsOptionalParameters clusterName(String clusterName) {
      this.clusterName = clusterName;
      return this;
    }

    /**
     * Set serviceArn.
     *
     * @param serviceArn Filter by ECS service ARN. (optional)
     * @return ListEcsRemediationInvestigationsOptionalParameters
     */
    public ListEcsRemediationInvestigationsOptionalParameters serviceArn(String serviceArn) {
      this.serviceArn = serviceArn;
      return this;
    }

    /**
     * Set taskArn.
     *
     * @param taskArn Filter by ECS task ARN. (optional)
     * @return ListEcsRemediationInvestigationsOptionalParameters
     */
    public ListEcsRemediationInvestigationsOptionalParameters taskArn(String taskArn) {
      this.taskArn = taskArn;
      return this;
    }

    /**
     * Set resourceArn.
     *
     * @param resourceArn Filter by resource ARN. Matches services, daemons, and standalone tasks.
     *     (optional)
     * @return ListEcsRemediationInvestigationsOptionalParameters
     */
    public ListEcsRemediationInvestigationsOptionalParameters resourceArn(String resourceArn) {
      this.resourceArn = resourceArn;
      return this;
    }

    /**
     * Set status.
     *
     * @param status Filter by investigation status. Repeatable. Accepted values: open,
     *     approval_required, executing, succeeded, failed. Unknown values are ignored. (optional)
     * @return ListEcsRemediationInvestigationsOptionalParameters
     */
    public ListEcsRemediationInvestigationsOptionalParameters status(List<String> status) {
      this.status = status;
      return this;
    }

    /**
     * Set issueType.
     *
     * @param issueType Filter by issue type. (optional)
     * @return ListEcsRemediationInvestigationsOptionalParameters
     */
    public ListEcsRemediationInvestigationsOptionalParameters issueType(String issueType) {
      this.issueType = issueType;
      return this;
    }

    /**
     * Set sinceMs.
     *
     * @param sinceMs Start of the created-at time range, in epoch milliseconds. (optional)
     * @return ListEcsRemediationInvestigationsOptionalParameters
     */
    public ListEcsRemediationInvestigationsOptionalParameters sinceMs(Long sinceMs) {
      this.sinceMs = sinceMs;
      return this;
    }

    /**
     * Set untilMs.
     *
     * @param untilMs End of the created-at time range, in epoch milliseconds. (optional)
     * @return ListEcsRemediationInvestigationsOptionalParameters
     */
    public ListEcsRemediationInvestigationsOptionalParameters untilMs(Long untilMs) {
      this.untilMs = untilMs;
      return this;
    }

    /**
     * Set pageSize.
     *
     * @param pageSize Maximum number of investigations to return. Clamped to 200. (optional)
     * @return ListEcsRemediationInvestigationsOptionalParameters
     */
    public ListEcsRemediationInvestigationsOptionalParameters pageSize(Integer pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set pageToken.
     *
     * @param pageToken Pagination token returned by a previous call. (optional)
     * @return ListEcsRemediationInvestigationsOptionalParameters
     */
    public ListEcsRemediationInvestigationsOptionalParameters pageToken(String pageToken) {
      this.pageToken = pageToken;
      return this;
    }
  }

  /**
   * List ECS remediation investigations.
   *
   * <p>See {@link #listEcsRemediationInvestigationsWithHttpInfo}.
   *
   * @return RemediationListInvestigationsResponse
   * @throws ApiException if fails to make API call
   */
  public RemediationListInvestigationsResponse listEcsRemediationInvestigations()
      throws ApiException {
    return listEcsRemediationInvestigationsWithHttpInfo(
            new ListEcsRemediationInvestigationsOptionalParameters())
        .getData();
  }

  /**
   * List ECS remediation investigations.
   *
   * <p>See {@link #listEcsRemediationInvestigationsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;RemediationListInvestigationsResponse&gt;
   */
  public CompletableFuture<RemediationListInvestigationsResponse>
      listEcsRemediationInvestigationsAsync() {
    return listEcsRemediationInvestigationsWithHttpInfoAsync(
            new ListEcsRemediationInvestigationsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List ECS remediation investigations.
   *
   * <p>See {@link #listEcsRemediationInvestigationsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return RemediationListInvestigationsResponse
   * @throws ApiException if fails to make API call
   */
  public RemediationListInvestigationsResponse listEcsRemediationInvestigations(
      ListEcsRemediationInvestigationsOptionalParameters parameters) throws ApiException {
    return listEcsRemediationInvestigationsWithHttpInfo(parameters).getData();
  }

  /**
   * List ECS remediation investigations.
   *
   * <p>See {@link #listEcsRemediationInvestigationsWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;RemediationListInvestigationsResponse&gt;
   */
  public CompletableFuture<RemediationListInvestigationsResponse>
      listEcsRemediationInvestigationsAsync(
          ListEcsRemediationInvestigationsOptionalParameters parameters) {
    return listEcsRemediationInvestigationsWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List ECS remediation investigations for the caller's organization. All filters are optional and
   * applied together. Results are returned in pages.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;RemediationListInvestigationsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<RemediationListInvestigationsResponse>
      listEcsRemediationInvestigationsWithHttpInfo(
          ListEcsRemediationInvestigationsOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    String clusterArn = parameters.clusterArn;
    String clusterName = parameters.clusterName;
    String serviceArn = parameters.serviceArn;
    String taskArn = parameters.taskArn;
    String resourceArn = parameters.resourceArn;
    List<String> status = parameters.status;
    String issueType = parameters.issueType;
    Long sinceMs = parameters.sinceMs;
    Long untilMs = parameters.untilMs;
    Integer pageSize = parameters.pageSize;
    String pageToken = parameters.pageToken;
    // create path and map variables
    String localVarPath = "/api/ui/orchestration/ecs_remediation/investigations";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "cluster_arn", clusterArn));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "cluster_name", clusterName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "service_arn", serviceArn));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "task_arn", taskArn));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "resource_arn", resourceArn));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "status", status));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "issue_type", issueType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "since_ms", sinceMs));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "until_ms", untilMs));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page_size", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page_token", pageToken));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.EcsRemediationApi.listEcsRemediationInvestigations",
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
        new GenericType<RemediationListInvestigationsResponse>() {});
  }

  /**
   * List ECS remediation investigations.
   *
   * <p>See {@link #listEcsRemediationInvestigationsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;RemediationListInvestigationsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RemediationListInvestigationsResponse>>
      listEcsRemediationInvestigationsWithHttpInfoAsync(
          ListEcsRemediationInvestigationsOptionalParameters parameters) {
    Object localVarPostBody = null;
    String clusterArn = parameters.clusterArn;
    String clusterName = parameters.clusterName;
    String serviceArn = parameters.serviceArn;
    String taskArn = parameters.taskArn;
    String resourceArn = parameters.resourceArn;
    List<String> status = parameters.status;
    String issueType = parameters.issueType;
    Long sinceMs = parameters.sinceMs;
    Long untilMs = parameters.untilMs;
    Integer pageSize = parameters.pageSize;
    String pageToken = parameters.pageToken;
    // create path and map variables
    String localVarPath = "/api/ui/orchestration/ecs_remediation/investigations";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "cluster_arn", clusterArn));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "cluster_name", clusterName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "service_arn", serviceArn));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "task_arn", taskArn));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "resource_arn", resourceArn));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "status", status));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "issue_type", issueType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "since_ms", sinceMs));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "until_ms", untilMs));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page_size", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page_token", pageToken));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.EcsRemediationApi.listEcsRemediationInvestigations",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RemediationListInvestigationsResponse>> result =
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
        new GenericType<RemediationListInvestigationsResponse>() {});
  }
}
