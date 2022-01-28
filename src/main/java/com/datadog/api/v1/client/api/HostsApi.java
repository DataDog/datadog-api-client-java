package com.datadog.api.v1.client.api;

import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.ApiResponse;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.Pair;
import com.datadog.api.v1.client.model.HostListResponse;
import com.datadog.api.v1.client.model.HostMuteResponse;
import com.datadog.api.v1.client.model.HostMuteSettings;
import com.datadog.api.v1.client.model.HostTotals;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import javax.ws.rs.core.GenericType;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class HostsApi {
  private ApiClient apiClient;

  public HostsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public HostsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get the API client
   *
   * @return API client
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * Set the API client
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
     * Set from
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
   * Get the total number of active hosts
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
   * Get the total number of active hosts
   *
   * <p>See {@link #getHostTotalsWithHttpInfo}.
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
   * Get the total number of active hosts
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
   * Get the total number of active hosts
   *
   * <p>See {@link #getHostTotalsWithHttpInfo}.
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
   * Get the total number of active hosts
   *
   * <p>This endpoint returns the total number of active and up hosts in your Datadog account.
   * Active means the host has reported in the past hour, and up means it has reported in the past
   * two hours.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;HostTotals&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "from", from));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getHostTotals");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<HostTotals> localVarReturnType = new GenericType<HostTotals>() {};

    return apiClient.invokeAPI(
        "HostsApi.getHostTotals",
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false);
  }

  /**
   * Get the total number of active hosts
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "from", from));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getHostTotals");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<HostTotals> localVarReturnType = new GenericType<HostTotals>() {};

    return apiClient.invokeAPIAsync(
        "HostsApi.getHostTotals",
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false);
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
     * Set filter
     *
     * @param filter String to filter search results. (optional)
     * @return ListHostsOptionalParameters
     */
    public ListHostsOptionalParameters filter(String filter) {
      this.filter = filter;
      return this;
    }

    /**
     * Set sortField
     *
     * @param sortField Sort hosts by this field. (optional)
     * @return ListHostsOptionalParameters
     */
    public ListHostsOptionalParameters sortField(String sortField) {
      this.sortField = sortField;
      return this;
    }

    /**
     * Set sortDir
     *
     * @param sortDir Direction of sort. Options include &#x60;asc&#x60; and &#x60;desc&#x60;.
     *     (optional)
     * @return ListHostsOptionalParameters
     */
    public ListHostsOptionalParameters sortDir(String sortDir) {
      this.sortDir = sortDir;
      return this;
    }

    /**
     * Set start
     *
     * @param start Host result to start search from. (optional)
     * @return ListHostsOptionalParameters
     */
    public ListHostsOptionalParameters start(Long start) {
      this.start = start;
      return this;
    }

    /**
     * Set count
     *
     * @param count Number of hosts to return. Max 1000. (optional)
     * @return ListHostsOptionalParameters
     */
    public ListHostsOptionalParameters count(Long count) {
      this.count = count;
      return this;
    }

    /**
     * Set from
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
     * Set includeMutedHostsData
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
     * Set includeHostsMetadata
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
   * Get all hosts for your organization
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
   * Get all hosts for your organization
   *
   * <p>See {@link #listHostsWithHttpInfo}.
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
   * Get all hosts for your organization
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
   * Get all hosts for your organization
   *
   * <p>See {@link #listHostsWithHttpInfo}.
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
   * Get all hosts for your organization
   *
   * <p>This endpoint allows searching for hosts by name, alias, or tag. Hosts live within the past
   * 3 hours are included by default. Retention is 7 days. Results are paginated with a max of 1000
   * results at a time.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;HostListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listHosts");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<HostListResponse> localVarReturnType = new GenericType<HostListResponse>() {};

    return apiClient.invokeAPI(
        "HostsApi.listHosts",
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false);
  }

  /**
   * Get all hosts for your organization
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listHosts");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<HostListResponse> localVarReturnType = new GenericType<HostListResponse>() {};

    return apiClient.invokeAPIAsync(
        "HostsApi.listHosts",
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false);
  }

  /**
   * Mute a host
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

  public CompletableFuture<HostMuteResponse> muteHostAsync(String hostName, HostMuteSettings body) {
    return muteHostWithHttpInfoAsync(hostName, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Mute a host
   *
   * <p>Mute a host.
   *
   * @param hostName Name of the host to mute. (required)
   * @param body Mute a host request body. (required)
   * @return ApiResponse&lt;HostMuteResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "muteHost");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<HostMuteResponse> localVarReturnType = new GenericType<HostMuteResponse>() {};

    return apiClient.invokeAPI(
        "HostsApi.muteHost",
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false);
  }

  /**
   * Mute a host
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "muteHost");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<HostMuteResponse> localVarReturnType = new GenericType<HostMuteResponse>() {};

    return apiClient.invokeAPIAsync(
        "HostsApi.muteHost",
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false);
  }

  /**
   * Unmute a host
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

  public CompletableFuture<HostMuteResponse> unmuteHostAsync(String hostName) {
    return unmuteHostWithHttpInfoAsync(hostName)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Unmute a host
   *
   * <p>Unmutes a host. This endpoint takes no JSON arguments.
   *
   * @param hostName Name of the host to unmute. (required)
   * @return ApiResponse&lt;HostMuteResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "unmuteHost");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<HostMuteResponse> localVarReturnType = new GenericType<HostMuteResponse>() {};

    return apiClient.invokeAPI(
        "HostsApi.unmuteHost",
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false);
  }

  /**
   * Unmute a host
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "unmuteHost");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<HostMuteResponse> localVarReturnType = new GenericType<HostMuteResponse>() {};

    return apiClient.invokeAPIAsync(
        "HostsApi.unmuteHost",
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false);
  }
}
