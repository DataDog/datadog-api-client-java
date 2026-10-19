package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.AgentHealthAgentType;
import com.datadog.api.client.v2.model.AgentHealthHostIssuesResponse;
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
}
