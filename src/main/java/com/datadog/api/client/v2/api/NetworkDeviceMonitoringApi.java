package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
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

  /** Manage optional parameters to listDevices. */
  public static class ListDevicesOptionalParameters {
    private Long pageNumber;
    private Long pageSize;
    private String sort;
    private String filterTag;

    /**
     * Set pageNumber.
     *
     * @param pageNumber The page number to fetch. (optional)
     * @return ListDevicesOptionalParameters
     */
    public ListDevicesOptionalParameters pageNumber(Long pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set pageSize.
     *
     * @param pageSize The number of devices to return per page. (optional)
     * @return ListDevicesOptionalParameters
     */
    public ListDevicesOptionalParameters pageSize(Long pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set sort.
     *
     * @param sort The field to sort the devices by. (optional)
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
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object listDevices() throws ApiException {
    return listDevicesWithHttpInfo(new ListDevicesOptionalParameters()).getData();
  }

  /**
   * Get the list of devices.
   *
   * <p>See {@link #listDevicesWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;Object&gt;
   */
  public CompletableFuture<Object> listDevicesAsync() {
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
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object listDevices(ListDevicesOptionalParameters parameters) throws ApiException {
    return listDevicesWithHttpInfo(parameters).getData();
  }

  /**
   * Get the list of devices.
   *
   * <p>See {@link #listDevicesWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;Object&gt;
   */
  public CompletableFuture<Object> listDevicesAsync(ListDevicesOptionalParameters parameters) {
    return listDevicesWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the list of devices.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;Object&gt;
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
  public ApiResponse<Object> listDevicesWithHttpInfo(ListDevicesOptionalParameters parameters)
      throws ApiException {
    Object localVarPostBody = null;
    Long pageNumber = parameters.pageNumber;
    Long pageSize = parameters.pageSize;
    String sort = parameters.sort;
    String filterTag = parameters.filterTag;
    // create path and map variables
    String localVarPath = "/api/v2/ndm/devices";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
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
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<Object>() {});
  }

  /**
   * Get the list of devices.
   *
   * <p>See {@link #listDevicesWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;Object&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Object>> listDevicesWithHttpInfoAsync(
      ListDevicesOptionalParameters parameters) {
    Object localVarPostBody = null;
    Long pageNumber = parameters.pageNumber;
    Long pageSize = parameters.pageSize;
    String sort = parameters.sort;
    String filterTag = parameters.filterTag;
    // create path and map variables
    String localVarPath = "/api/v2/ndm/devices";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
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
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Object>> result = new CompletableFuture<>();
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
        new GenericType<Object>() {});
  }
}
