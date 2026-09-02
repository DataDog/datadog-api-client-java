package com.datadog.api.client.v1.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v1.model.HostListResponse;
import com.datadog.api.client.v1.model.HostMuteResponse;
import com.datadog.api.client.v1.model.HostMuteSettings;
import com.datadog.api.client.v1.model.HostTotals;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class HostsApi {
  private ApiClient apiClient;

  public HostsApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public HostsApi(ApiClient apiClient) {
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

  /** Manage optional parameters to getHostTotals. */
  public static class GetHostTotalsOptionalParameters {
    private Long from;

    /**
     * Set from.
     *
     * @param from Number of seconds from which you want to get total number of active hosts.
     *     (optional)
     * @return GetHostTotalsOptionalParameters
     */
    public GetHostTotalsOptionalParameters from(Long from) {
      this.from = from;
      return this;
    }
  }

  /**
   * Get the total number of active hosts.
   *
   * <p>See {@link #getHostTotalsWithHttpInfo}.
   *
   * @return HostTotals
   * @throws ApiException if fails to make API call
   */
  public HostTotals getHostTotals() throws ApiException {
    return getHostTotalsWithHttpInfo(new GetHostTotalsOptionalParameters()).getData();
  }

  /**
   * Get the total number of active hosts.
   *
   * <p>See {@link #getHostTotalsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;HostTotals&gt;
   */
  public CompletableFuture<HostTotals> getHostTotalsAsync() {
    return getHostTotalsWithHttpInfoAsync(new GetHostTotalsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the total number of active hosts.
   *
   * <p>See {@link #getHostTotalsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return HostTotals
   * @throws ApiException if fails to make API call
   */
  public HostTotals getHostTotals(GetHostTotalsOptionalParameters parameters) throws ApiException {
    return getHostTotalsWithHttpInfo(parameters).getData();
  }

  /**
   * Get the total number of active hosts.
   *
   * <p>See {@link #getHostTotalsWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;HostTotals&gt;
   */
  public CompletableFuture<HostTotals> getHostTotalsAsync(
      GetHostTotalsOptionalParameters parameters) {
    return getHostTotalsWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * This endpoint returns the total number of active and up hosts in your Datadog account. Active
   * means the host has reported in the past hour, and up means it has reported in the past two
   * hours.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;HostTotals&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Invalid Parameter Error </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<HostTotals> getHostTotalsWithHttpInfo(
      GetHostTotalsOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    Long from = parameters.from;
    // create path and map variables
    String localVarPath = "/api/v1/hosts/totals";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "from", from));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v1.HostsApi.getHostTotals",
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
        new GenericType<HostTotals>() {});
  }

  /**
   * Get the total number of active hosts.
   *
   * <p>See {@link #getHostTotalsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;HostTotals&gt;&gt;
   */
  public CompletableFuture<ApiResponse<HostTotals>> getHostTotalsWithHttpInfoAsync(
      GetHostTotalsOptionalParameters parameters) {
    Object localVarPostBody = null;
    Long from = parameters.from;
    // create path and map variables
    String localVarPath = "/api/v1/hosts/totals";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "from", from));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1.HostsApi.getHostTotals",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<HostTotals>> result = new CompletableFuture<>();
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
        new GenericType<HostTotals>() {});
  }

  /** Manage optional parameters to listHosts. */
  public static class ListHostsOptionalParameters {
    private String filter;
    private String sortField;
    private String sortDir;
    private Long start;
    private Long count;
    private Long from;
    private Boolean includeMutedHostsData;
    private Boolean includeHostsMetadata;

    /**
     * Set filter.
     *
     * @param filter String to filter search results. (optional)
     * @return ListHostsOptionalParameters
     */
    public ListHostsOptionalParameters filter(String filter) {
      this.filter = filter;
      return this;
    }

    /**
     * Set sortField.
     *
     * @param sortField Sort hosts by this field. (optional)
     * @return ListHostsOptionalParameters
     */
    public ListHostsOptionalParameters sortField(String sortField) {
      this.sortField = sortField;
      return this;
    }

    /**
     * Set sortDir.
     *
     * @param sortDir Direction of sort. Options include <code>asc</code> and <code>desc</code>.
     *     (optional)
     * @return ListHostsOptionalParameters
     */
    public ListHostsOptionalParameters sortDir(String sortDir) {
      this.sortDir = sortDir;
      return this;
    }

    /**
     * Set start.
     *
     * @param start Specify the starting point for the host search results. For example, if you set
     *     <code>count</code> to 100 and the first 100 results have already been returned, you can
     *     set <code>start</code> to <code>101</code> to get the next 100 results. (optional)
     * @return ListHostsOptionalParameters
     */
    public ListHostsOptionalParameters start(Long start) {
      this.start = start;
      return this;
    }

    /**
     * Set count.
     *
     * @param count Number of hosts to return. Max 1000. (optional)
     * @return ListHostsOptionalParameters
     */
    public ListHostsOptionalParameters count(Long count) {
      this.count = count;
      return this;
    }

    /**
     * Set from.
     *
     * @param from Number of seconds since UNIX epoch from which you want to search your hosts.
     *     (optional)
     * @return ListHostsOptionalParameters
     */
    public ListHostsOptionalParameters from(Long from) {
      this.from = from;
      return this;
    }

    /**
     * Set includeMutedHostsData.
     *
     * @param includeMutedHostsData Include information on the muted status of hosts and when the
     *     mute expires. (optional)
     * @return ListHostsOptionalParameters
     */
    public ListHostsOptionalParameters includeMutedHostsData(Boolean includeMutedHostsData) {
      this.includeMutedHostsData = includeMutedHostsData;
      return this;
    }

    /**
     * Set includeHostsMetadata.
     *
     * @param includeHostsMetadata Include additional metadata about the hosts (agent_version,
     *     machine, platform, processor, etc.). (optional)
     * @return ListHostsOptionalParameters
     */
    public ListHostsOptionalParameters includeHostsMetadata(Boolean includeHostsMetadata) {
      this.includeHostsMetadata = includeHostsMetadata;
      return this;
    }
  }

  /**
   * Get all hosts for your organization.
   *
   * <p>See {@link #listHostsWithHttpInfo}.
   *
   * @return HostListResponse
   * @throws ApiException if fails to make API call
   */
  public HostListResponse listHosts() throws ApiException {
    return listHostsWithHttpInfo(new ListHostsOptionalParameters()).getData();
  }

  /**
   * Get all hosts for your organization.
   *
   * <p>See {@link #listHostsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;HostListResponse&gt;
   */
  public CompletableFuture<HostListResponse> listHostsAsync() {
    return listHostsWithHttpInfoAsync(new ListHostsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get all hosts for your organization.
   *
   * <p>See {@link #listHostsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return HostListResponse
   * @throws ApiException if fails to make API call
   */
  public HostListResponse listHosts(ListHostsOptionalParameters parameters) throws ApiException {
    return listHostsWithHttpInfo(parameters).getData();
  }

  /**
   * Get all hosts for your organization.
   *
   * <p>See {@link #listHostsWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;HostListResponse&gt;
   */
  public CompletableFuture<HostListResponse> listHostsAsync(
      ListHostsOptionalParameters parameters) {
    return listHostsWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * This endpoint allows searching for hosts by name, alias, or tag. Hosts live within the past 3
   * hours are included by default. Retention is 7 days. Results are paginated with a max of 1000
   * results at a time. <strong>Note:</strong> If the host is an Amazon EC2 instance, <code>id
   * </code> is replaced with <code>aws_id</code> in the response. <strong>Note</strong>: To enrich
   * the data returned by this endpoint with security scans, see the new <a
   * href="https://docs.datadoghq.com/api/latest/security-monitoring/#list-scanned-assets-metadata">api/v2/security/scanned-assets-metadata</a>
   * endpoint.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;HostListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Invalid Parameter Error </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<HostListResponse> listHostsWithHttpInfo(ListHostsOptionalParameters parameters)
      throws ApiException {
    Object localVarPostBody = null;
    String filter = parameters.filter;
    String sortField = parameters.sortField;
    String sortDir = parameters.sortDir;
    Long start = parameters.start;
    Long count = parameters.count;
    Long from = parameters.from;
    Boolean includeMutedHostsData = parameters.includeMutedHostsData;
    Boolean includeHostsMetadata = parameters.includeHostsMetadata;
    // create path and map variables
    String localVarPath = "/api/v1/hosts";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort_field", sortField));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort_dir", sortDir));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start", start));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "count", count));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "from", from));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "include_muted_hosts_data", includeMutedHostsData));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "include_hosts_metadata", includeHostsMetadata));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v1.HostsApi.listHosts",
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
        new GenericType<HostListResponse>() {});
  }

  /**
   * Get all hosts for your organization.
   *
   * <p>See {@link #listHostsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;HostListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<HostListResponse>> listHostsWithHttpInfoAsync(
      ListHostsOptionalParameters parameters) {
    Object localVarPostBody = null;
    String filter = parameters.filter;
    String sortField = parameters.sortField;
    String sortDir = parameters.sortDir;
    Long start = parameters.start;
    Long count = parameters.count;
    Long from = parameters.from;
    Boolean includeMutedHostsData = parameters.includeMutedHostsData;
    Boolean includeHostsMetadata = parameters.includeHostsMetadata;
    // create path and map variables
    String localVarPath = "/api/v1/hosts";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort_field", sortField));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort_dir", sortDir));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start", start));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "count", count));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "from", from));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "include_muted_hosts_data", includeMutedHostsData));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "include_hosts_metadata", includeHostsMetadata));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1.HostsApi.listHosts",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<HostListResponse>> result = new CompletableFuture<>();
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
        new GenericType<HostListResponse>() {});
  }

  /**
   * Mute a host.
   *
   * <p>See {@link #muteHostWithHttpInfo}.
   *
   * @param hostName Name of the host to mute. (required)
   * @param body Mute a host request body. (required)
   * @return HostMuteResponse
   * @throws ApiException if fails to make API call
   */
  public HostMuteResponse muteHost(String hostName, HostMuteSettings body) throws ApiException {
    return muteHostWithHttpInfo(hostName, body).getData();
  }

  /**
   * Mute a host.
   *
   * <p>See {@link #muteHostWithHttpInfoAsync}.
   *
   * @param hostName Name of the host to mute. (required)
   * @param body Mute a host request body. (required)
   * @return CompletableFuture&lt;HostMuteResponse&gt;
   */
  public CompletableFuture<HostMuteResponse> muteHostAsync(String hostName, HostMuteSettings body) {
    return muteHostWithHttpInfoAsync(hostName, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Mute a host. <strong>Note:</strong> This creates a <a
   * href="https://docs.datadoghq.com/api/latest/downtimes/#schedule-a-downtime">Downtime V2</a> for
   * the host.
   *
   * @param hostName Name of the host to mute. (required)
   * @param body Mute a host request body. (required)
   * @return ApiResponse&lt;HostMuteResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Invalid Parameter Error </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<HostMuteResponse> muteHostWithHttpInfo(String hostName, HostMuteSettings body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'hostName' is set
    if (hostName == null) {
      throw new ApiException(
          400, "Missing the required parameter 'hostName' when calling muteHost");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling muteHost");
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/host/{host_name}/mute"
            .replaceAll("\\{" + "host_name" + "\\}", apiClient.escapeString(hostName.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v1.HostsApi.muteHost",
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
        new GenericType<HostMuteResponse>() {});
  }

  /**
   * Mute a host.
   *
   * <p>See {@link #muteHostWithHttpInfo}.
   *
   * @param hostName Name of the host to mute. (required)
   * @param body Mute a host request body. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;HostMuteResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<HostMuteResponse>> muteHostWithHttpInfoAsync(
      String hostName, HostMuteSettings body) {
    Object localVarPostBody = body;

    // verify the required parameter 'hostName' is set
    if (hostName == null) {
      CompletableFuture<ApiResponse<HostMuteResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'hostName' when calling muteHost"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<HostMuteResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'body' when calling muteHost"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/host/{host_name}/mute"
            .replaceAll("\\{" + "host_name" + "\\}", apiClient.escapeString(hostName.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1.HostsApi.muteHost",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<HostMuteResponse>> result = new CompletableFuture<>();
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
        new GenericType<HostMuteResponse>() {});
  }

  /**
   * Unmute a host.
   *
   * <p>See {@link #unmuteHostWithHttpInfo}.
   *
   * @param hostName Name of the host to unmute. (required)
   * @return HostMuteResponse
   * @throws ApiException if fails to make API call
   */
  public HostMuteResponse unmuteHost(String hostName) throws ApiException {
    return unmuteHostWithHttpInfo(hostName).getData();
  }

  /**
   * Unmute a host.
   *
   * <p>See {@link #unmuteHostWithHttpInfoAsync}.
   *
   * @param hostName Name of the host to unmute. (required)
   * @return CompletableFuture&lt;HostMuteResponse&gt;
   */
  public CompletableFuture<HostMuteResponse> unmuteHostAsync(String hostName) {
    return unmuteHostWithHttpInfoAsync(hostName)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Unmutes a host. This endpoint takes no JSON arguments.
   *
   * @param hostName Name of the host to unmute. (required)
   * @return ApiResponse&lt;HostMuteResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Invalid Parameter Error </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<HostMuteResponse> unmuteHostWithHttpInfo(String hostName) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'hostName' is set
    if (hostName == null) {
      throw new ApiException(
          400, "Missing the required parameter 'hostName' when calling unmuteHost");
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/host/{host_name}/unmute"
            .replaceAll("\\{" + "host_name" + "\\}", apiClient.escapeString(hostName.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v1.HostsApi.unmuteHost",
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
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<HostMuteResponse>() {});
  }

  /**
   * Unmute a host.
   *
   * <p>See {@link #unmuteHostWithHttpInfo}.
   *
   * @param hostName Name of the host to unmute. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;HostMuteResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<HostMuteResponse>> unmuteHostWithHttpInfoAsync(
      String hostName) {
    Object localVarPostBody = null;

    // verify the required parameter 'hostName' is set
    if (hostName == null) {
      CompletableFuture<ApiResponse<HostMuteResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'hostName' when calling unmuteHost"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/host/{host_name}/unmute"
            .replaceAll("\\{" + "host_name" + "\\}", apiClient.escapeString(hostName.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1.HostsApi.unmuteHost",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<HostMuteResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<HostMuteResponse>() {});
  }
}
