package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.PaginationIterable;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.DevicesListData;
import com.datadog.api.client.v2.model.GetDeviceResponse;
import com.datadog.api.client.v2.model.GetInterfacesResponse;
import com.datadog.api.client.v2.model.ListDevicesResponse;
import com.datadog.api.client.v2.model.ListInterfaceTagsResponse;
import com.datadog.api.client.v2.model.ListTagsResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class NetworkDeviceMonitoringApi {
  private ApiClient apiClient;

  public NetworkDeviceMonitoringApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public NetworkDeviceMonitoringApi(ApiClient apiClient) {
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
   * Get the device details.
   *
   * <p>See {@link #getDeviceWithHttpInfo}.
   *
   * @param deviceId The id of the device to fetch. (required)
   * @return GetDeviceResponse
   * @throws ApiException if fails to make API call
   */
  public GetDeviceResponse getDevice(String deviceId) throws ApiException {
    return getDeviceWithHttpInfo(deviceId).getData();
  }

  /**
   * Get the device details.
   *
   * <p>See {@link #getDeviceWithHttpInfoAsync}.
   *
   * @param deviceId The id of the device to fetch. (required)
   * @return CompletableFuture&lt;GetDeviceResponse&gt;
   */
  public CompletableFuture<GetDeviceResponse> getDeviceAsync(String deviceId) {
    return getDeviceWithHttpInfoAsync(deviceId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the device details.
   *
   * @param deviceId The id of the device to fetch. (required)
   * @return ApiResponse&lt;GetDeviceResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<GetDeviceResponse> getDeviceWithHttpInfo(String deviceId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'deviceId' is set
    if (deviceId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'deviceId' when calling getDevice");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/ndm/devices/{device_id}"
            .replaceAll("\\{" + "device_id" + "\\}", apiClient.escapeString(deviceId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.NetworkDeviceMonitoringApi.getDevice",
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
        new GenericType<GetDeviceResponse>() {});
  }

  /**
   * Get the device details.
   *
   * <p>See {@link #getDeviceWithHttpInfo}.
   *
   * @param deviceId The id of the device to fetch. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;GetDeviceResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<GetDeviceResponse>> getDeviceWithHttpInfoAsync(
      String deviceId) {
    Object localVarPostBody = null;

    // verify the required parameter 'deviceId' is set
    if (deviceId == null) {
      CompletableFuture<ApiResponse<GetDeviceResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'deviceId' when calling getDevice"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/ndm/devices/{device_id}"
            .replaceAll("\\{" + "device_id" + "\\}", apiClient.escapeString(deviceId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.NetworkDeviceMonitoringApi.getDevice",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<GetDeviceResponse>> result = new CompletableFuture<>();
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
        new GenericType<GetDeviceResponse>() {});
  }

  /** Manage optional parameters to getInterfaces. */
  public static class GetInterfacesOptionalParameters {
    private Boolean getIpAddresses;

    /**
     * Set getIpAddresses.
     *
     * @param getIpAddresses Whether to get the IP addresses of the interfaces. (optional)
     * @return GetInterfacesOptionalParameters
     */
    public GetInterfacesOptionalParameters getIpAddresses(Boolean getIpAddresses) {
      this.getIpAddresses = getIpAddresses;
      return this;
    }
  }

  /**
   * Get the list of interfaces of the device.
   *
   * <p>See {@link #getInterfacesWithHttpInfo}.
   *
   * @param deviceId The ID of the device to get interfaces from. (required)
   * @return GetInterfacesResponse
   * @throws ApiException if fails to make API call
   */
  public GetInterfacesResponse getInterfaces(String deviceId) throws ApiException {
    return getInterfacesWithHttpInfo(deviceId, new GetInterfacesOptionalParameters()).getData();
  }

  /**
   * Get the list of interfaces of the device.
   *
   * <p>See {@link #getInterfacesWithHttpInfoAsync}.
   *
   * @param deviceId The ID of the device to get interfaces from. (required)
   * @return CompletableFuture&lt;GetInterfacesResponse&gt;
   */
  public CompletableFuture<GetInterfacesResponse> getInterfacesAsync(String deviceId) {
    return getInterfacesWithHttpInfoAsync(deviceId, new GetInterfacesOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the list of interfaces of the device.
   *
   * <p>See {@link #getInterfacesWithHttpInfo}.
   *
   * @param deviceId The ID of the device to get interfaces from. (required)
   * @param parameters Optional parameters for the request.
   * @return GetInterfacesResponse
   * @throws ApiException if fails to make API call
   */
  public GetInterfacesResponse getInterfaces(
      String deviceId, GetInterfacesOptionalParameters parameters) throws ApiException {
    return getInterfacesWithHttpInfo(deviceId, parameters).getData();
  }

  /**
   * Get the list of interfaces of the device.
   *
   * <p>See {@link #getInterfacesWithHttpInfoAsync}.
   *
   * @param deviceId The ID of the device to get interfaces from. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;GetInterfacesResponse&gt;
   */
  public CompletableFuture<GetInterfacesResponse> getInterfacesAsync(
      String deviceId, GetInterfacesOptionalParameters parameters) {
    return getInterfacesWithHttpInfoAsync(deviceId, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the list of interfaces of the device.
   *
   * @param deviceId The ID of the device to get interfaces from. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;GetInterfacesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<GetInterfacesResponse> getInterfacesWithHttpInfo(
      String deviceId, GetInterfacesOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'deviceId' is set
    if (deviceId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'deviceId' when calling getInterfaces");
    }
    Boolean getIpAddresses = parameters.getIpAddresses;
    // create path and map variables
    String localVarPath = "/api/v2/ndm/interfaces";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "device_id", deviceId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "get_ip_addresses", getIpAddresses));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.NetworkDeviceMonitoringApi.getInterfaces",
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
        new GenericType<GetInterfacesResponse>() {});
  }

  /**
   * Get the list of interfaces of the device.
   *
   * <p>See {@link #getInterfacesWithHttpInfo}.
   *
   * @param deviceId The ID of the device to get interfaces from. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;GetInterfacesResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<GetInterfacesResponse>> getInterfacesWithHttpInfoAsync(
      String deviceId, GetInterfacesOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'deviceId' is set
    if (deviceId == null) {
      CompletableFuture<ApiResponse<GetInterfacesResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'deviceId' when calling getInterfaces"));
      return result;
    }
    Boolean getIpAddresses = parameters.getIpAddresses;
    // create path and map variables
    String localVarPath = "/api/v2/ndm/interfaces";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "device_id", deviceId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "get_ip_addresses", getIpAddresses));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.NetworkDeviceMonitoringApi.getInterfaces",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<GetInterfacesResponse>> result = new CompletableFuture<>();
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
        new GenericType<GetInterfacesResponse>() {});
  }

  /** Manage optional parameters to listDevices. */
  public static class ListDevicesOptionalParameters {
    private Long pageSize;
    private Long pageNumber;
    private String sort;
    private String filterTag;

    /**
     * Set pageSize.
     *
     * @param pageSize Size for a given page. The maximum allowed value is 500. Defaults to 50.
     *     (optional, default to 50)
     * @return ListDevicesOptionalParameters
     */
    public ListDevicesOptionalParameters pageSize(Long pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set pageNumber.
     *
     * @param pageNumber Specific page number to return. Defaults to 0. (optional, default to 0)
     * @return ListDevicesOptionalParameters
     */
    public ListDevicesOptionalParameters pageNumber(Long pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set sort.
     *
     * @param sort The field to sort the devices by. Defaults to <code>name</code>. (optional,
     *     default to "name")
     * @return ListDevicesOptionalParameters
     */
    public ListDevicesOptionalParameters sort(String sort) {
      this.sort = sort;
      return this;
    }

    /**
     * Set filterTag.
     *
     * @param filterTag Filter devices by tag. (optional)
     * @return ListDevicesOptionalParameters
     */
    public ListDevicesOptionalParameters filterTag(String filterTag) {
      this.filterTag = filterTag;
      return this;
    }
  }

  /**
   * Get the list of devices.
   *
   * <p>See {@link #listDevicesWithHttpInfo}.
   *
   * @return ListDevicesResponse
   * @throws ApiException if fails to make API call
   */
  public ListDevicesResponse listDevices() throws ApiException {
    return listDevicesWithHttpInfo(new ListDevicesOptionalParameters()).getData();
  }

  /**
   * Get the list of devices.
   *
   * <p>See {@link #listDevicesWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;ListDevicesResponse&gt;
   */
  public CompletableFuture<ListDevicesResponse> listDevicesAsync() {
    return listDevicesWithHttpInfoAsync(new ListDevicesOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the list of devices.
   *
   * <p>See {@link #listDevicesWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return ListDevicesResponse
   * @throws ApiException if fails to make API call
   */
  public ListDevicesResponse listDevices(ListDevicesOptionalParameters parameters)
      throws ApiException {
    return listDevicesWithHttpInfo(parameters).getData();
  }

  /**
   * Get the list of devices.
   *
   * <p>See {@link #listDevicesWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ListDevicesResponse&gt;
   */
  public CompletableFuture<ListDevicesResponse> listDevicesAsync(
      ListDevicesOptionalParameters parameters) {
    return listDevicesWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the list of devices.
   *
   * <p>See {@link #listDevicesWithHttpInfo}.
   *
   * @return PaginationIterable&lt;DevicesListData&gt;
   */
  public PaginationIterable<DevicesListData> listDevicesWithPagination() {
    ListDevicesOptionalParameters parameters = new ListDevicesOptionalParameters();
    return listDevicesWithPagination(parameters);
  }

  /**
   * Get the list of devices.
   *
   * <p>See {@link #listDevicesWithHttpInfo}.
   *
   * @return ListDevicesResponse
   */
  public PaginationIterable<DevicesListData> listDevicesWithPagination(
      ListDevicesOptionalParameters parameters) {
    String resultsPath = "getData";
    String valueGetterPath = "";
    String valueSetterPath = "pageNumber";
    Boolean valueSetterParamOptional = true;
    parameters.pageNumber(0l);
    Long limit;

    if (parameters.pageSize == null) {
      limit = 50l;
      parameters.pageSize(limit);
    } else {
      limit = parameters.pageSize;
    }

    LinkedHashMap<String, Object> args = new LinkedHashMap<String, Object>();
    args.put("optionalParams", parameters);

    PaginationIterable iterator =
        new PaginationIterable(
            this,
            "listDevices",
            resultsPath,
            valueGetterPath,
            valueSetterPath,
            valueSetterParamOptional,
            false,
            limit,
            args);

    return iterator;
  }

  /**
   * Get the list of devices.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;ListDevicesResponse&gt;
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
  public ApiResponse<ListDevicesResponse> listDevicesWithHttpInfo(
      ListDevicesOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    Long pageSize = parameters.pageSize;
    Long pageNumber = parameters.pageNumber;
    String sort = parameters.sort;
    String filterTag = parameters.filterTag;
    // create path and map variables
    String localVarPath = "/api/v2/ndm/devices";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[tag]", filterTag));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.NetworkDeviceMonitoringApi.listDevices",
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
        new GenericType<ListDevicesResponse>() {});
  }

  /**
   * Get the list of devices.
   *
   * <p>See {@link #listDevicesWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;ListDevicesResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ListDevicesResponse>> listDevicesWithHttpInfoAsync(
      ListDevicesOptionalParameters parameters) {
    Object localVarPostBody = null;
    Long pageSize = parameters.pageSize;
    Long pageNumber = parameters.pageNumber;
    String sort = parameters.sort;
    String filterTag = parameters.filterTag;
    // create path and map variables
    String localVarPath = "/api/v2/ndm/devices";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[tag]", filterTag));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.NetworkDeviceMonitoringApi.listDevices",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ListDevicesResponse>> result = new CompletableFuture<>();
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
        new GenericType<ListDevicesResponse>() {});
  }

  /**
   * Get the list of tags for a device.
   *
   * <p>See {@link #listDeviceUserTagsWithHttpInfo}.
   *
   * @param deviceId The id of the device to fetch tags for. (required)
   * @return ListTagsResponse
   * @throws ApiException if fails to make API call
   */
  public ListTagsResponse listDeviceUserTags(String deviceId) throws ApiException {
    return listDeviceUserTagsWithHttpInfo(deviceId).getData();
  }

  /**
   * Get the list of tags for a device.
   *
   * <p>See {@link #listDeviceUserTagsWithHttpInfoAsync}.
   *
   * @param deviceId The id of the device to fetch tags for. (required)
   * @return CompletableFuture&lt;ListTagsResponse&gt;
   */
  public CompletableFuture<ListTagsResponse> listDeviceUserTagsAsync(String deviceId) {
    return listDeviceUserTagsWithHttpInfoAsync(deviceId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the list of tags for a device.
   *
   * @param deviceId The id of the device to fetch tags for. (required)
   * @return ApiResponse&lt;ListTagsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ListTagsResponse> listDeviceUserTagsWithHttpInfo(String deviceId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'deviceId' is set
    if (deviceId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'deviceId' when calling listDeviceUserTags");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/ndm/tags/devices/{device_id}"
            .replaceAll("\\{" + "device_id" + "\\}", apiClient.escapeString(deviceId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.NetworkDeviceMonitoringApi.listDeviceUserTags",
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
        new GenericType<ListTagsResponse>() {});
  }

  /**
   * Get the list of tags for a device.
   *
   * <p>See {@link #listDeviceUserTagsWithHttpInfo}.
   *
   * @param deviceId The id of the device to fetch tags for. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ListTagsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ListTagsResponse>> listDeviceUserTagsWithHttpInfoAsync(
      String deviceId) {
    Object localVarPostBody = null;

    // verify the required parameter 'deviceId' is set
    if (deviceId == null) {
      CompletableFuture<ApiResponse<ListTagsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'deviceId' when calling listDeviceUserTags"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/ndm/tags/devices/{device_id}"
            .replaceAll("\\{" + "device_id" + "\\}", apiClient.escapeString(deviceId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.NetworkDeviceMonitoringApi.listDeviceUserTags",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ListTagsResponse>> result = new CompletableFuture<>();
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
        new GenericType<ListTagsResponse>() {});
  }

  /**
   * List tags for an interface.
   *
   * <p>See {@link #listInterfaceUserTagsWithHttpInfo}.
   *
   * @param interfaceId The ID of the interface for which to retrieve tags. (required)
   * @return ListInterfaceTagsResponse
   * @throws ApiException if fails to make API call
   */
  public ListInterfaceTagsResponse listInterfaceUserTags(String interfaceId) throws ApiException {
    return listInterfaceUserTagsWithHttpInfo(interfaceId).getData();
  }

  /**
   * List tags for an interface.
   *
   * <p>See {@link #listInterfaceUserTagsWithHttpInfoAsync}.
   *
   * @param interfaceId The ID of the interface for which to retrieve tags. (required)
   * @return CompletableFuture&lt;ListInterfaceTagsResponse&gt;
   */
  public CompletableFuture<ListInterfaceTagsResponse> listInterfaceUserTagsAsync(
      String interfaceId) {
    return listInterfaceUserTagsWithHttpInfoAsync(interfaceId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Returns the tags associated with the specified interface.
   *
   * @param interfaceId The ID of the interface for which to retrieve tags. (required)
   * @return ApiResponse&lt;ListInterfaceTagsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ListInterfaceTagsResponse> listInterfaceUserTagsWithHttpInfo(
      String interfaceId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'interfaceId' is set
    if (interfaceId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'interfaceId' when calling listInterfaceUserTags");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/ndm/tags/interfaces/{interface_id}"
            .replaceAll(
                "\\{" + "interface_id" + "\\}", apiClient.escapeString(interfaceId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.NetworkDeviceMonitoringApi.listInterfaceUserTags",
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
        new GenericType<ListInterfaceTagsResponse>() {});
  }

  /**
   * List tags for an interface.
   *
   * <p>See {@link #listInterfaceUserTagsWithHttpInfo}.
   *
   * @param interfaceId The ID of the interface for which to retrieve tags. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ListInterfaceTagsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ListInterfaceTagsResponse>>
      listInterfaceUserTagsWithHttpInfoAsync(String interfaceId) {
    Object localVarPostBody = null;

    // verify the required parameter 'interfaceId' is set
    if (interfaceId == null) {
      CompletableFuture<ApiResponse<ListInterfaceTagsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'interfaceId' when calling listInterfaceUserTags"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/ndm/tags/interfaces/{interface_id}"
            .replaceAll(
                "\\{" + "interface_id" + "\\}", apiClient.escapeString(interfaceId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.NetworkDeviceMonitoringApi.listInterfaceUserTags",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ListInterfaceTagsResponse>> result = new CompletableFuture<>();
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
        new GenericType<ListInterfaceTagsResponse>() {});
  }

  /**
   * Update the tags for a device.
   *
   * <p>See {@link #updateDeviceUserTagsWithHttpInfo}.
   *
   * @param deviceId The id of the device to update tags for. (required)
   * @param body (required)
   * @return ListTagsResponse
   * @throws ApiException if fails to make API call
   */
  public ListTagsResponse updateDeviceUserTags(String deviceId, ListTagsResponse body)
      throws ApiException {
    return updateDeviceUserTagsWithHttpInfo(deviceId, body).getData();
  }

  /**
   * Update the tags for a device.
   *
   * <p>See {@link #updateDeviceUserTagsWithHttpInfoAsync}.
   *
   * @param deviceId The id of the device to update tags for. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ListTagsResponse&gt;
   */
  public CompletableFuture<ListTagsResponse> updateDeviceUserTagsAsync(
      String deviceId, ListTagsResponse body) {
    return updateDeviceUserTagsWithHttpInfoAsync(deviceId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update the tags for a device.
   *
   * @param deviceId The id of the device to update tags for. (required)
   * @param body (required)
   * @return ApiResponse&lt;ListTagsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ListTagsResponse> updateDeviceUserTagsWithHttpInfo(
      String deviceId, ListTagsResponse body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'deviceId' is set
    if (deviceId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'deviceId' when calling updateDeviceUserTags");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateDeviceUserTags");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/ndm/tags/devices/{device_id}"
            .replaceAll("\\{" + "device_id" + "\\}", apiClient.escapeString(deviceId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.NetworkDeviceMonitoringApi.updateDeviceUserTags",
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
        new GenericType<ListTagsResponse>() {});
  }

  /**
   * Update the tags for a device.
   *
   * <p>See {@link #updateDeviceUserTagsWithHttpInfo}.
   *
   * @param deviceId The id of the device to update tags for. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ListTagsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ListTagsResponse>> updateDeviceUserTagsWithHttpInfoAsync(
      String deviceId, ListTagsResponse body) {
    Object localVarPostBody = body;

    // verify the required parameter 'deviceId' is set
    if (deviceId == null) {
      CompletableFuture<ApiResponse<ListTagsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'deviceId' when calling updateDeviceUserTags"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<ListTagsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateDeviceUserTags"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/ndm/tags/devices/{device_id}"
            .replaceAll("\\{" + "device_id" + "\\}", apiClient.escapeString(deviceId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.NetworkDeviceMonitoringApi.updateDeviceUserTags",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ListTagsResponse>> result = new CompletableFuture<>();
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
        new GenericType<ListTagsResponse>() {});
  }

  /**
   * Update the tags for an interface.
   *
   * <p>See {@link #updateInterfaceUserTagsWithHttpInfo}.
   *
   * @param interfaceId The ID of the interface for which to update tags. (required)
   * @param body (required)
   * @return ListInterfaceTagsResponse
   * @throws ApiException if fails to make API call
   */
  public ListInterfaceTagsResponse updateInterfaceUserTags(
      String interfaceId, ListInterfaceTagsResponse body) throws ApiException {
    return updateInterfaceUserTagsWithHttpInfo(interfaceId, body).getData();
  }

  /**
   * Update the tags for an interface.
   *
   * <p>See {@link #updateInterfaceUserTagsWithHttpInfoAsync}.
   *
   * @param interfaceId The ID of the interface for which to update tags. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ListInterfaceTagsResponse&gt;
   */
  public CompletableFuture<ListInterfaceTagsResponse> updateInterfaceUserTagsAsync(
      String interfaceId, ListInterfaceTagsResponse body) {
    return updateInterfaceUserTagsWithHttpInfoAsync(interfaceId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Updates the tags associated with the specified interface.
   *
   * @param interfaceId The ID of the interface for which to update tags. (required)
   * @param body (required)
   * @return ApiResponse&lt;ListInterfaceTagsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ListInterfaceTagsResponse> updateInterfaceUserTagsWithHttpInfo(
      String interfaceId, ListInterfaceTagsResponse body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'interfaceId' is set
    if (interfaceId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'interfaceId' when calling updateInterfaceUserTags");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateInterfaceUserTags");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/ndm/tags/interfaces/{interface_id}"
            .replaceAll(
                "\\{" + "interface_id" + "\\}", apiClient.escapeString(interfaceId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.NetworkDeviceMonitoringApi.updateInterfaceUserTags",
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
        new GenericType<ListInterfaceTagsResponse>() {});
  }

  /**
   * Update the tags for an interface.
   *
   * <p>See {@link #updateInterfaceUserTagsWithHttpInfo}.
   *
   * @param interfaceId The ID of the interface for which to update tags. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ListInterfaceTagsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ListInterfaceTagsResponse>>
      updateInterfaceUserTagsWithHttpInfoAsync(String interfaceId, ListInterfaceTagsResponse body) {
    Object localVarPostBody = body;

    // verify the required parameter 'interfaceId' is set
    if (interfaceId == null) {
      CompletableFuture<ApiResponse<ListInterfaceTagsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'interfaceId' when calling updateInterfaceUserTags"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<ListInterfaceTagsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateInterfaceUserTags"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/ndm/tags/interfaces/{interface_id}"
            .replaceAll(
                "\\{" + "interface_id" + "\\}", apiClient.escapeString(interfaceId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.NetworkDeviceMonitoringApi.updateInterfaceUserTags",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ListInterfaceTagsResponse>> result = new CompletableFuture<>();
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
        new GenericType<ListInterfaceTagsResponse>() {});
  }
}
