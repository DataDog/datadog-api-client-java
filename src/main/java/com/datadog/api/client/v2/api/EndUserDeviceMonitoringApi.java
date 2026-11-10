package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.DeviceBaseArray;
import com.datadog.api.client.v2.model.DeviceDetails;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class EndUserDeviceMonitoringApi {
  private ApiClient apiClient;

  public EndUserDeviceMonitoringApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public EndUserDeviceMonitoringApi(ApiClient apiClient) {
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
   * Get a device.
   *
   * <p>See {@link #getEUDMDeviceWithHttpInfo}.
   *
   * @param deviceId Unique identifier of the device to fetch. Matches the Datadog host identifier.
   *     (required)
   * @return DeviceDetails
   * @throws ApiException if fails to make API call
   */
  public DeviceDetails getEUDMDevice(String deviceId) throws ApiException {
    return getEUDMDeviceWithHttpInfo(deviceId).getData();
  }

  /**
   * Get a device.
   *
   * <p>See {@link #getEUDMDeviceWithHttpInfoAsync}.
   *
   * @param deviceId Unique identifier of the device to fetch. Matches the Datadog host identifier.
   *     (required)
   * @return CompletableFuture&lt;DeviceDetails&gt;
   */
  public CompletableFuture<DeviceDetails> getEUDMDeviceAsync(String deviceId) {
    return getEUDMDeviceWithHttpInfoAsync(deviceId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * @param deviceId Unique identifier of the device to fetch. Matches the Datadog host identifier.
   *     (required)
   * @return ApiResponse&lt;DeviceDetails&gt;
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
  public ApiResponse<DeviceDetails> getEUDMDeviceWithHttpInfo(String deviceId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getEUDMDevice";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'deviceId' is set
    if (deviceId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'deviceId' when calling getEUDMDevice");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/eudm/devices/{device_id}"
            .replaceAll("\\{" + "device_id" + "\\}", apiClient.escapeString(deviceId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.EndUserDeviceMonitoringApi.getEUDMDevice",
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
        new GenericType<DeviceDetails>() {});
  }

  /**
   * Get a device.
   *
   * <p>See {@link #getEUDMDeviceWithHttpInfo}.
   *
   * @param deviceId Unique identifier of the device to fetch. Matches the Datadog host identifier.
   *     (required)
   * @return CompletableFuture&lt;ApiResponse&lt;DeviceDetails&gt;&gt;
   */
  public CompletableFuture<ApiResponse<DeviceDetails>> getEUDMDeviceWithHttpInfoAsync(
      String deviceId) {
    // Check if unstable operation is enabled
    String operationId = "getEUDMDevice";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<DeviceDetails>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'deviceId' is set
    if (deviceId == null) {
      CompletableFuture<ApiResponse<DeviceDetails>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'deviceId' when calling getEUDMDevice"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/eudm/devices/{device_id}"
            .replaceAll("\\{" + "device_id" + "\\}", apiClient.escapeString(deviceId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.EndUserDeviceMonitoringApi.getEUDMDevice",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<DeviceDetails>> result = new CompletableFuture<>();
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
        new GenericType<DeviceDetails>() {});
  }

  /** Manage optional parameters to getEUDMDevices. */
  public static class GetEUDMDevicesOptionalParameters {
    private List<String> bssid;
    private Long pageLimit;
    private String pageCursor;

    /**
     * Set bssid.
     *
     * @param bssid Filter devices to those currently associated with any of the given BSSID values.
     *     Each value must be a MAC-48 address; repeat the parameter to pass several values.
     *     (optional)
     * @return GetEUDMDevicesOptionalParameters
     */
    public GetEUDMDevicesOptionalParameters bssid(List<String> bssid) {
      this.bssid = bssid;
      return this;
    }

    /**
     * Set pageLimit.
     *
     * @param pageLimit Maximum number of devices to return in one page. Must be a positive integer.
     *     If not set, the response contains all matching devices. (optional)
     * @return GetEUDMDevicesOptionalParameters
     */
    public GetEUDMDevicesOptionalParameters pageLimit(Long pageLimit) {
      this.pageLimit = pageLimit;
      return this;
    }

    /**
     * Set pageCursor.
     *
     * @param pageCursor Opaque cursor that selects the next page. Use the <code>meta.page.after
     *     </code> value of the previous response. Devices are ordered by ID. (optional)
     * @return GetEUDMDevicesOptionalParameters
     */
    public GetEUDMDevicesOptionalParameters pageCursor(String pageCursor) {
      this.pageCursor = pageCursor;
      return this;
    }
  }

  /**
   * Get all devices.
   *
   * <p>See {@link #getEUDMDevicesWithHttpInfo}.
   *
   * @return DeviceBaseArray
   * @throws ApiException if fails to make API call
   */
  public DeviceBaseArray getEUDMDevices() throws ApiException {
    return getEUDMDevicesWithHttpInfo(new GetEUDMDevicesOptionalParameters()).getData();
  }

  /**
   * Get all devices.
   *
   * <p>See {@link #getEUDMDevicesWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;DeviceBaseArray&gt;
   */
  public CompletableFuture<DeviceBaseArray> getEUDMDevicesAsync() {
    return getEUDMDevicesWithHttpInfoAsync(new GetEUDMDevicesOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get all devices.
   *
   * <p>See {@link #getEUDMDevicesWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return DeviceBaseArray
   * @throws ApiException if fails to make API call
   */
  public DeviceBaseArray getEUDMDevices(GetEUDMDevicesOptionalParameters parameters)
      throws ApiException {
    return getEUDMDevicesWithHttpInfo(parameters).getData();
  }

  /**
   * Get all devices.
   *
   * <p>See {@link #getEUDMDevicesWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;DeviceBaseArray&gt;
   */
  public CompletableFuture<DeviceBaseArray> getEUDMDevicesAsync(
      GetEUDMDevicesOptionalParameters parameters) {
    return getEUDMDevicesWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;DeviceBaseArray&gt;
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
  public ApiResponse<DeviceBaseArray> getEUDMDevicesWithHttpInfo(
      GetEUDMDevicesOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getEUDMDevices";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    List<String> bssid = parameters.bssid;
    Long pageLimit = parameters.pageLimit;
    String pageCursor = parameters.pageCursor;
    // create path and map variables
    String localVarPath = "/api/v2/eudm/devices";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "bssid", bssid));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[cursor]", pageCursor));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.EndUserDeviceMonitoringApi.getEUDMDevices",
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
        new GenericType<DeviceBaseArray>() {});
  }

  /**
   * Get all devices.
   *
   * <p>See {@link #getEUDMDevicesWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;DeviceBaseArray&gt;&gt;
   */
  public CompletableFuture<ApiResponse<DeviceBaseArray>> getEUDMDevicesWithHttpInfoAsync(
      GetEUDMDevicesOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "getEUDMDevices";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<DeviceBaseArray>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    List<String> bssid = parameters.bssid;
    Long pageLimit = parameters.pageLimit;
    String pageCursor = parameters.pageCursor;
    // create path and map variables
    String localVarPath = "/api/v2/eudm/devices";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "bssid", bssid));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[cursor]", pageCursor));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.EndUserDeviceMonitoringApi.getEUDMDevices",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<DeviceBaseArray>> result = new CompletableFuture<>();
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
        new GenericType<DeviceBaseArray>() {});
  }
}
