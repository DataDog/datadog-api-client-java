package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.CsmAgentlessHostFacetsResponse;
import com.datadog.api.client.v2.model.CsmAgentlessHostsResponse;
import com.datadog.api.client.v2.model.CsmHostFacetInfoResponse;
import com.datadog.api.client.v2.model.CsmUnifiedHostFacetsResponse;
import com.datadog.api.client.v2.model.CsmUnifiedHostsResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CsmSettingsApi {
  private ApiClient apiClient;

  public CsmSettingsApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public CsmSettingsApi(ApiClient apiClient) {
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

  /** Manage optional parameters to getCSMAgentlessHostFacetInfo. */
  public static class GetCSMAgentlessHostFacetInfoOptionalParameters {
    private String search;
    private String query;

    /**
     * Set search.
     *
     * @param search A search string to filter the facet values. (optional)
     * @return GetCSMAgentlessHostFacetInfoOptionalParameters
     */
    public GetCSMAgentlessHostFacetInfoOptionalParameters search(String search) {
      this.search = search;
      return this;
    }

    /**
     * Set query.
     *
     * @param query A filter query to scope the facet value counts. (optional)
     * @return GetCSMAgentlessHostFacetInfoOptionalParameters
     */
    public GetCSMAgentlessHostFacetInfoOptionalParameters query(String query) {
      this.query = query;
      return this;
    }
  }

  /**
   * Get agentless host facet info.
   *
   * <p>See {@link #getCSMAgentlessHostFacetInfoWithHttpInfo}.
   *
   * @param facet The facet identifier to retrieve value distribution for. Valid values are <code>
   *     resource_name</code>, <code>account_id</code>, <code>resource_type</code>, <code>
   *     cloud_provider</code>, <code>has_vulnerability_scanning</code>, and <code>
   *     has_posture_management</code>. (required)
   * @return CsmHostFacetInfoResponse
   * @throws ApiException if fails to make API call
   */
  public CsmHostFacetInfoResponse getCSMAgentlessHostFacetInfo(String facet) throws ApiException {
    return getCSMAgentlessHostFacetInfoWithHttpInfo(
            facet, new GetCSMAgentlessHostFacetInfoOptionalParameters())
        .getData();
  }

  /**
   * Get agentless host facet info.
   *
   * <p>See {@link #getCSMAgentlessHostFacetInfoWithHttpInfoAsync}.
   *
   * @param facet The facet identifier to retrieve value distribution for. Valid values are <code>
   *     resource_name</code>, <code>account_id</code>, <code>resource_type</code>, <code>
   *     cloud_provider</code>, <code>has_vulnerability_scanning</code>, and <code>
   *     has_posture_management</code>. (required)
   * @return CompletableFuture&lt;CsmHostFacetInfoResponse&gt;
   */
  public CompletableFuture<CsmHostFacetInfoResponse> getCSMAgentlessHostFacetInfoAsync(
      String facet) {
    return getCSMAgentlessHostFacetInfoWithHttpInfoAsync(
            facet, new GetCSMAgentlessHostFacetInfoOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get agentless host facet info.
   *
   * <p>See {@link #getCSMAgentlessHostFacetInfoWithHttpInfo}.
   *
   * @param facet The facet identifier to retrieve value distribution for. Valid values are <code>
   *     resource_name</code>, <code>account_id</code>, <code>resource_type</code>, <code>
   *     cloud_provider</code>, <code>has_vulnerability_scanning</code>, and <code>
   *     has_posture_management</code>. (required)
   * @param parameters Optional parameters for the request.
   * @return CsmHostFacetInfoResponse
   * @throws ApiException if fails to make API call
   */
  public CsmHostFacetInfoResponse getCSMAgentlessHostFacetInfo(
      String facet, GetCSMAgentlessHostFacetInfoOptionalParameters parameters) throws ApiException {
    return getCSMAgentlessHostFacetInfoWithHttpInfo(facet, parameters).getData();
  }

  /**
   * Get agentless host facet info.
   *
   * <p>See {@link #getCSMAgentlessHostFacetInfoWithHttpInfoAsync}.
   *
   * @param facet The facet identifier to retrieve value distribution for. Valid values are <code>
   *     resource_name</code>, <code>account_id</code>, <code>resource_type</code>, <code>
   *     cloud_provider</code>, <code>has_vulnerability_scanning</code>, and <code>
   *     has_posture_management</code>. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;CsmHostFacetInfoResponse&gt;
   */
  public CompletableFuture<CsmHostFacetInfoResponse> getCSMAgentlessHostFacetInfoAsync(
      String facet, GetCSMAgentlessHostFacetInfoOptionalParameters parameters) {
    return getCSMAgentlessHostFacetInfoWithHttpInfoAsync(facet, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the value distribution for a specific agentless host facet, with optional search and
   * filtering.
   *
   * @param facet The facet identifier to retrieve value distribution for. Valid values are <code>
   *     resource_name</code>, <code>account_id</code>, <code>resource_type</code>, <code>
   *     cloud_provider</code>, <code>has_vulnerability_scanning</code>, and <code>
   *     has_posture_management</code>. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;CsmHostFacetInfoResponse&gt;
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
  public ApiResponse<CsmHostFacetInfoResponse> getCSMAgentlessHostFacetInfoWithHttpInfo(
      String facet, GetCSMAgentlessHostFacetInfoOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getCSMAgentlessHostFacetInfo";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'facet' is set
    if (facet == null) {
      throw new ApiException(
          400, "Missing the required parameter 'facet' when calling getCSMAgentlessHostFacetInfo");
    }
    String search = parameters.search;
    String query = parameters.query;
    // create path and map variables
    String localVarPath = "/api/v2/csm/settings/agentless_hosts/facet_info";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "facet", facet));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "search", search));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "query", query));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CsmSettingsApi.getCSMAgentlessHostFacetInfo",
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
        new GenericType<CsmHostFacetInfoResponse>() {});
  }

  /**
   * Get agentless host facet info.
   *
   * <p>See {@link #getCSMAgentlessHostFacetInfoWithHttpInfo}.
   *
   * @param facet The facet identifier to retrieve value distribution for. Valid values are <code>
   *     resource_name</code>, <code>account_id</code>, <code>resource_type</code>, <code>
   *     cloud_provider</code>, <code>has_vulnerability_scanning</code>, and <code>
   *     has_posture_management</code>. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;CsmHostFacetInfoResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CsmHostFacetInfoResponse>>
      getCSMAgentlessHostFacetInfoWithHttpInfoAsync(
          String facet, GetCSMAgentlessHostFacetInfoOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "getCSMAgentlessHostFacetInfo";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<CsmHostFacetInfoResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'facet' is set
    if (facet == null) {
      CompletableFuture<ApiResponse<CsmHostFacetInfoResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'facet' when calling getCSMAgentlessHostFacetInfo"));
      return result;
    }
    String search = parameters.search;
    String query = parameters.query;
    // create path and map variables
    String localVarPath = "/api/v2/csm/settings/agentless_hosts/facet_info";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "facet", facet));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "search", search));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "query", query));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CsmSettingsApi.getCSMAgentlessHostFacetInfo",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CsmHostFacetInfoResponse>> result = new CompletableFuture<>();
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
        new GenericType<CsmHostFacetInfoResponse>() {});
  }

  /** Manage optional parameters to getCSMUnifiedHostFacetInfo. */
  public static class GetCSMUnifiedHostFacetInfoOptionalParameters {
    private String search;
    private String query;

    /**
     * Set search.
     *
     * @param search A search string to filter the facet values. (optional)
     * @return GetCSMUnifiedHostFacetInfoOptionalParameters
     */
    public GetCSMUnifiedHostFacetInfoOptionalParameters search(String search) {
      this.search = search;
      return this;
    }

    /**
     * Set query.
     *
     * @param query A filter query to scope the facet value counts. (optional)
     * @return GetCSMUnifiedHostFacetInfoOptionalParameters
     */
    public GetCSMUnifiedHostFacetInfoOptionalParameters query(String query) {
      this.query = query;
      return this;
    }
  }

  /**
   * Get unified host facet info.
   *
   * <p>See {@link #getCSMUnifiedHostFacetInfoWithHttpInfo}.
   *
   * @param facet The facet identifier to retrieve value distribution for. Valid values include
   *     <code>resource_name</code>, <code>account_id</code>, <code>resource_type</code>, <code>
   *     cloud_provider</code>, <code>agentless_vulnerability_scanning</code>, <code>
   *     agentless_posture_management</code>, <code>hostname</code>, <code>agent_version</code>,
   *     <code>os</code>, <code>cluster_name</code>, <code>agent_posture_management</code>, <code>
   *     agent_cws_enabled</code>, <code>agent_csm_vm_hosts_enabled</code>, and <code>
   *     agent_csm_vm_containers_enabled</code>. (required)
   * @return CsmHostFacetInfoResponse
   * @throws ApiException if fails to make API call
   */
  public CsmHostFacetInfoResponse getCSMUnifiedHostFacetInfo(String facet) throws ApiException {
    return getCSMUnifiedHostFacetInfoWithHttpInfo(
            facet, new GetCSMUnifiedHostFacetInfoOptionalParameters())
        .getData();
  }

  /**
   * Get unified host facet info.
   *
   * <p>See {@link #getCSMUnifiedHostFacetInfoWithHttpInfoAsync}.
   *
   * @param facet The facet identifier to retrieve value distribution for. Valid values include
   *     <code>resource_name</code>, <code>account_id</code>, <code>resource_type</code>, <code>
   *     cloud_provider</code>, <code>agentless_vulnerability_scanning</code>, <code>
   *     agentless_posture_management</code>, <code>hostname</code>, <code>agent_version</code>,
   *     <code>os</code>, <code>cluster_name</code>, <code>agent_posture_management</code>, <code>
   *     agent_cws_enabled</code>, <code>agent_csm_vm_hosts_enabled</code>, and <code>
   *     agent_csm_vm_containers_enabled</code>. (required)
   * @return CompletableFuture&lt;CsmHostFacetInfoResponse&gt;
   */
  public CompletableFuture<CsmHostFacetInfoResponse> getCSMUnifiedHostFacetInfoAsync(String facet) {
    return getCSMUnifiedHostFacetInfoWithHttpInfoAsync(
            facet, new GetCSMUnifiedHostFacetInfoOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get unified host facet info.
   *
   * <p>See {@link #getCSMUnifiedHostFacetInfoWithHttpInfo}.
   *
   * @param facet The facet identifier to retrieve value distribution for. Valid values include
   *     <code>resource_name</code>, <code>account_id</code>, <code>resource_type</code>, <code>
   *     cloud_provider</code>, <code>agentless_vulnerability_scanning</code>, <code>
   *     agentless_posture_management</code>, <code>hostname</code>, <code>agent_version</code>,
   *     <code>os</code>, <code>cluster_name</code>, <code>agent_posture_management</code>, <code>
   *     agent_cws_enabled</code>, <code>agent_csm_vm_hosts_enabled</code>, and <code>
   *     agent_csm_vm_containers_enabled</code>. (required)
   * @param parameters Optional parameters for the request.
   * @return CsmHostFacetInfoResponse
   * @throws ApiException if fails to make API call
   */
  public CsmHostFacetInfoResponse getCSMUnifiedHostFacetInfo(
      String facet, GetCSMUnifiedHostFacetInfoOptionalParameters parameters) throws ApiException {
    return getCSMUnifiedHostFacetInfoWithHttpInfo(facet, parameters).getData();
  }

  /**
   * Get unified host facet info.
   *
   * <p>See {@link #getCSMUnifiedHostFacetInfoWithHttpInfoAsync}.
   *
   * @param facet The facet identifier to retrieve value distribution for. Valid values include
   *     <code>resource_name</code>, <code>account_id</code>, <code>resource_type</code>, <code>
   *     cloud_provider</code>, <code>agentless_vulnerability_scanning</code>, <code>
   *     agentless_posture_management</code>, <code>hostname</code>, <code>agent_version</code>,
   *     <code>os</code>, <code>cluster_name</code>, <code>agent_posture_management</code>, <code>
   *     agent_cws_enabled</code>, <code>agent_csm_vm_hosts_enabled</code>, and <code>
   *     agent_csm_vm_containers_enabled</code>. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;CsmHostFacetInfoResponse&gt;
   */
  public CompletableFuture<CsmHostFacetInfoResponse> getCSMUnifiedHostFacetInfoAsync(
      String facet, GetCSMUnifiedHostFacetInfoOptionalParameters parameters) {
    return getCSMUnifiedHostFacetInfoWithHttpInfoAsync(facet, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the value distribution for a specific unified host facet, with optional search and
   * filtering.
   *
   * @param facet The facet identifier to retrieve value distribution for. Valid values include
   *     <code>resource_name</code>, <code>account_id</code>, <code>resource_type</code>, <code>
   *     cloud_provider</code>, <code>agentless_vulnerability_scanning</code>, <code>
   *     agentless_posture_management</code>, <code>hostname</code>, <code>agent_version</code>,
   *     <code>os</code>, <code>cluster_name</code>, <code>agent_posture_management</code>, <code>
   *     agent_cws_enabled</code>, <code>agent_csm_vm_hosts_enabled</code>, and <code>
   *     agent_csm_vm_containers_enabled</code>. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;CsmHostFacetInfoResponse&gt;
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
  public ApiResponse<CsmHostFacetInfoResponse> getCSMUnifiedHostFacetInfoWithHttpInfo(
      String facet, GetCSMUnifiedHostFacetInfoOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getCSMUnifiedHostFacetInfo";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'facet' is set
    if (facet == null) {
      throw new ApiException(
          400, "Missing the required parameter 'facet' when calling getCSMUnifiedHostFacetInfo");
    }
    String search = parameters.search;
    String query = parameters.query;
    // create path and map variables
    String localVarPath = "/api/v2/csm/settings/hosts/facet_info";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "facet", facet));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "search", search));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "query", query));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CsmSettingsApi.getCSMUnifiedHostFacetInfo",
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
        new GenericType<CsmHostFacetInfoResponse>() {});
  }

  /**
   * Get unified host facet info.
   *
   * <p>See {@link #getCSMUnifiedHostFacetInfoWithHttpInfo}.
   *
   * @param facet The facet identifier to retrieve value distribution for. Valid values include
   *     <code>resource_name</code>, <code>account_id</code>, <code>resource_type</code>, <code>
   *     cloud_provider</code>, <code>agentless_vulnerability_scanning</code>, <code>
   *     agentless_posture_management</code>, <code>hostname</code>, <code>agent_version</code>,
   *     <code>os</code>, <code>cluster_name</code>, <code>agent_posture_management</code>, <code>
   *     agent_cws_enabled</code>, <code>agent_csm_vm_hosts_enabled</code>, and <code>
   *     agent_csm_vm_containers_enabled</code>. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;CsmHostFacetInfoResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CsmHostFacetInfoResponse>>
      getCSMUnifiedHostFacetInfoWithHttpInfoAsync(
          String facet, GetCSMUnifiedHostFacetInfoOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "getCSMUnifiedHostFacetInfo";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<CsmHostFacetInfoResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'facet' is set
    if (facet == null) {
      CompletableFuture<ApiResponse<CsmHostFacetInfoResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'facet' when calling getCSMUnifiedHostFacetInfo"));
      return result;
    }
    String search = parameters.search;
    String query = parameters.query;
    // create path and map variables
    String localVarPath = "/api/v2/csm/settings/hosts/facet_info";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "facet", facet));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "search", search));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "query", query));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CsmSettingsApi.getCSMUnifiedHostFacetInfo",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CsmHostFacetInfoResponse>> result = new CompletableFuture<>();
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
        new GenericType<CsmHostFacetInfoResponse>() {});
  }

  /**
   * List agentless host facets.
   *
   * <p>See {@link #listCSMAgentlessHostFacetsWithHttpInfo}.
   *
   * @return CsmAgentlessHostFacetsResponse
   * @throws ApiException if fails to make API call
   */
  public CsmAgentlessHostFacetsResponse listCSMAgentlessHostFacets() throws ApiException {
    return listCSMAgentlessHostFacetsWithHttpInfo().getData();
  }

  /**
   * List agentless host facets.
   *
   * <p>See {@link #listCSMAgentlessHostFacetsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;CsmAgentlessHostFacetsResponse&gt;
   */
  public CompletableFuture<CsmAgentlessHostFacetsResponse> listCSMAgentlessHostFacetsAsync() {
    return listCSMAgentlessHostFacetsWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the list of available facets for filtering agentless hosts.
   *
   * @return ApiResponse&lt;CsmAgentlessHostFacetsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CsmAgentlessHostFacetsResponse> listCSMAgentlessHostFacetsWithHttpInfo()
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listCSMAgentlessHostFacets";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/csm/settings/agentless_hosts/facets";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CsmSettingsApi.listCSMAgentlessHostFacets",
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
        new GenericType<CsmAgentlessHostFacetsResponse>() {});
  }

  /**
   * List agentless host facets.
   *
   * <p>See {@link #listCSMAgentlessHostFacetsWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;CsmAgentlessHostFacetsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CsmAgentlessHostFacetsResponse>>
      listCSMAgentlessHostFacetsWithHttpInfoAsync() {
    // Check if unstable operation is enabled
    String operationId = "listCSMAgentlessHostFacets";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<CsmAgentlessHostFacetsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/csm/settings/agentless_hosts/facets";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CsmSettingsApi.listCSMAgentlessHostFacets",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CsmAgentlessHostFacetsResponse>> result =
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
        new GenericType<CsmAgentlessHostFacetsResponse>() {});
  }

  /** Manage optional parameters to listCSMAgentlessHosts. */
  public static class ListCSMAgentlessHostsOptionalParameters {
    private Integer page;
    private Integer size;
    private String query;

    /**
     * Set page.
     *
     * @param page The page index for pagination (zero-based). (optional, default to 0)
     * @return ListCSMAgentlessHostsOptionalParameters
     */
    public ListCSMAgentlessHostsOptionalParameters page(Integer page) {
      this.page = page;
      return this;
    }

    /**
     * Set size.
     *
     * @param size The number of agentless hosts to return per page. (optional, default to 10)
     * @return ListCSMAgentlessHostsOptionalParameters
     */
    public ListCSMAgentlessHostsOptionalParameters size(Integer size) {
      this.size = size;
      return this;
    }

    /**
     * Set query.
     *
     * @param query A search query string to filter agentless hosts. (optional)
     * @return ListCSMAgentlessHostsOptionalParameters
     */
    public ListCSMAgentlessHostsOptionalParameters query(String query) {
      this.query = query;
      return this;
    }
  }

  /**
   * List agentless hosts.
   *
   * <p>See {@link #listCSMAgentlessHostsWithHttpInfo}.
   *
   * @return CsmAgentlessHostsResponse
   * @throws ApiException if fails to make API call
   */
  public CsmAgentlessHostsResponse listCSMAgentlessHosts() throws ApiException {
    return listCSMAgentlessHostsWithHttpInfo(new ListCSMAgentlessHostsOptionalParameters())
        .getData();
  }

  /**
   * List agentless hosts.
   *
   * <p>See {@link #listCSMAgentlessHostsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;CsmAgentlessHostsResponse&gt;
   */
  public CompletableFuture<CsmAgentlessHostsResponse> listCSMAgentlessHostsAsync() {
    return listCSMAgentlessHostsWithHttpInfoAsync(new ListCSMAgentlessHostsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List agentless hosts.
   *
   * <p>See {@link #listCSMAgentlessHostsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CsmAgentlessHostsResponse
   * @throws ApiException if fails to make API call
   */
  public CsmAgentlessHostsResponse listCSMAgentlessHosts(
      ListCSMAgentlessHostsOptionalParameters parameters) throws ApiException {
    return listCSMAgentlessHostsWithHttpInfo(parameters).getData();
  }

  /**
   * List agentless hosts.
   *
   * <p>See {@link #listCSMAgentlessHostsWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;CsmAgentlessHostsResponse&gt;
   */
  public CompletableFuture<CsmAgentlessHostsResponse> listCSMAgentlessHostsAsync(
      ListCSMAgentlessHostsOptionalParameters parameters) {
    return listCSMAgentlessHostsWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the list of agentless hosts for CSM, with optional pagination and filtering.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;CsmAgentlessHostsResponse&gt;
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
  public ApiResponse<CsmAgentlessHostsResponse> listCSMAgentlessHostsWithHttpInfo(
      ListCSMAgentlessHostsOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listCSMAgentlessHosts";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    Integer page = parameters.page;
    Integer size = parameters.size;
    String query = parameters.query;
    // create path and map variables
    String localVarPath = "/api/v2/csm/settings/agentless_hosts";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "size", size));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "query", query));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CsmSettingsApi.listCSMAgentlessHosts",
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
        new GenericType<CsmAgentlessHostsResponse>() {});
  }

  /**
   * List agentless hosts.
   *
   * <p>See {@link #listCSMAgentlessHostsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;CsmAgentlessHostsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CsmAgentlessHostsResponse>>
      listCSMAgentlessHostsWithHttpInfoAsync(ListCSMAgentlessHostsOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listCSMAgentlessHosts";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<CsmAgentlessHostsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    Integer page = parameters.page;
    Integer size = parameters.size;
    String query = parameters.query;
    // create path and map variables
    String localVarPath = "/api/v2/csm/settings/agentless_hosts";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "size", size));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "query", query));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CsmSettingsApi.listCSMAgentlessHosts",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CsmAgentlessHostsResponse>> result = new CompletableFuture<>();
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
        new GenericType<CsmAgentlessHostsResponse>() {});
  }

  /**
   * List unified host facets.
   *
   * <p>See {@link #listCSMUnifiedHostFacetsWithHttpInfo}.
   *
   * @return CsmUnifiedHostFacetsResponse
   * @throws ApiException if fails to make API call
   */
  public CsmUnifiedHostFacetsResponse listCSMUnifiedHostFacets() throws ApiException {
    return listCSMUnifiedHostFacetsWithHttpInfo().getData();
  }

  /**
   * List unified host facets.
   *
   * <p>See {@link #listCSMUnifiedHostFacetsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;CsmUnifiedHostFacetsResponse&gt;
   */
  public CompletableFuture<CsmUnifiedHostFacetsResponse> listCSMUnifiedHostFacetsAsync() {
    return listCSMUnifiedHostFacetsWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the list of available facets for filtering unified hosts.
   *
   * @return ApiResponse&lt;CsmUnifiedHostFacetsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CsmUnifiedHostFacetsResponse> listCSMUnifiedHostFacetsWithHttpInfo()
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listCSMUnifiedHostFacets";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/csm/settings/hosts/facets";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CsmSettingsApi.listCSMUnifiedHostFacets",
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
        new GenericType<CsmUnifiedHostFacetsResponse>() {});
  }

  /**
   * List unified host facets.
   *
   * <p>See {@link #listCSMUnifiedHostFacetsWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;CsmUnifiedHostFacetsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CsmUnifiedHostFacetsResponse>>
      listCSMUnifiedHostFacetsWithHttpInfoAsync() {
    // Check if unstable operation is enabled
    String operationId = "listCSMUnifiedHostFacets";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<CsmUnifiedHostFacetsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/csm/settings/hosts/facets";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CsmSettingsApi.listCSMUnifiedHostFacets",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CsmUnifiedHostFacetsResponse>> result =
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
        new GenericType<CsmUnifiedHostFacetsResponse>() {});
  }

  /** Manage optional parameters to listCSMUnifiedHosts. */
  public static class ListCSMUnifiedHostsOptionalParameters {
    private Integer page;
    private Integer size;
    private String query;

    /**
     * Set page.
     *
     * @param page The page index for pagination (zero-based). (optional, default to 0)
     * @return ListCSMUnifiedHostsOptionalParameters
     */
    public ListCSMUnifiedHostsOptionalParameters page(Integer page) {
      this.page = page;
      return this;
    }

    /**
     * Set size.
     *
     * @param size The number of hosts to return per page. (optional, default to 10)
     * @return ListCSMUnifiedHostsOptionalParameters
     */
    public ListCSMUnifiedHostsOptionalParameters size(Integer size) {
      this.size = size;
      return this;
    }

    /**
     * Set query.
     *
     * @param query A search query string to filter unified hosts. (optional)
     * @return ListCSMUnifiedHostsOptionalParameters
     */
    public ListCSMUnifiedHostsOptionalParameters query(String query) {
      this.query = query;
      return this;
    }
  }

  /**
   * List unified hosts.
   *
   * <p>See {@link #listCSMUnifiedHostsWithHttpInfo}.
   *
   * @return CsmUnifiedHostsResponse
   * @throws ApiException if fails to make API call
   */
  public CsmUnifiedHostsResponse listCSMUnifiedHosts() throws ApiException {
    return listCSMUnifiedHostsWithHttpInfo(new ListCSMUnifiedHostsOptionalParameters()).getData();
  }

  /**
   * List unified hosts.
   *
   * <p>See {@link #listCSMUnifiedHostsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;CsmUnifiedHostsResponse&gt;
   */
  public CompletableFuture<CsmUnifiedHostsResponse> listCSMUnifiedHostsAsync() {
    return listCSMUnifiedHostsWithHttpInfoAsync(new ListCSMUnifiedHostsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List unified hosts.
   *
   * <p>See {@link #listCSMUnifiedHostsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CsmUnifiedHostsResponse
   * @throws ApiException if fails to make API call
   */
  public CsmUnifiedHostsResponse listCSMUnifiedHosts(
      ListCSMUnifiedHostsOptionalParameters parameters) throws ApiException {
    return listCSMUnifiedHostsWithHttpInfo(parameters).getData();
  }

  /**
   * List unified hosts.
   *
   * <p>See {@link #listCSMUnifiedHostsWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;CsmUnifiedHostsResponse&gt;
   */
  public CompletableFuture<CsmUnifiedHostsResponse> listCSMUnifiedHostsAsync(
      ListCSMUnifiedHostsOptionalParameters parameters) {
    return listCSMUnifiedHostsWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the list of unified hosts for CSM, combining agent and agentless host data, with optional
   * pagination and filtering.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;CsmUnifiedHostsResponse&gt;
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
  public ApiResponse<CsmUnifiedHostsResponse> listCSMUnifiedHostsWithHttpInfo(
      ListCSMUnifiedHostsOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listCSMUnifiedHosts";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    Integer page = parameters.page;
    Integer size = parameters.size;
    String query = parameters.query;
    // create path and map variables
    String localVarPath = "/api/v2/csm/settings/hosts";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "size", size));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "query", query));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CsmSettingsApi.listCSMUnifiedHosts",
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
        new GenericType<CsmUnifiedHostsResponse>() {});
  }

  /**
   * List unified hosts.
   *
   * <p>See {@link #listCSMUnifiedHostsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;CsmUnifiedHostsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CsmUnifiedHostsResponse>>
      listCSMUnifiedHostsWithHttpInfoAsync(ListCSMUnifiedHostsOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listCSMUnifiedHosts";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<CsmUnifiedHostsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    Integer page = parameters.page;
    Integer size = parameters.size;
    String query = parameters.query;
    // create path and map variables
    String localVarPath = "/api/v2/csm/settings/hosts";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "size", size));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "query", query));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CsmSettingsApi.listCSMUnifiedHosts",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CsmUnifiedHostsResponse>> result = new CompletableFuture<>();
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
        new GenericType<CsmUnifiedHostsResponse>() {});
  }
}
