package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.DeviceBaseArray;
import com.datadog.api.client.v2.model.DeviceDetails;
import com.datadog.api.client.v2.model.GraphItemArray;
import com.datadog.api.client.v2.model.IssueDefinitionArray;
import com.datadog.api.client.v2.model.OverviewItemArray;
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
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<DeviceDetails> getEUDMDeviceWithHttpInfo(String deviceId) throws ApiException {
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
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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

  /**
   * Get all devices.
   *
   * <p>See {@link #getEUDMDevicesWithHttpInfo}.
   *
   * @return DeviceBaseArray
   * @throws ApiException if fails to make API call
   */
  public DeviceBaseArray getEUDMDevices() throws ApiException {
    return getEUDMDevicesWithHttpInfo().getData();
  }

  /**
   * Get all devices.
   *
   * <p>See {@link #getEUDMDevicesWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;DeviceBaseArray&gt;
   */
  public CompletableFuture<DeviceBaseArray> getEUDMDevicesAsync() {
    return getEUDMDevicesWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * @return ApiResponse&lt;DeviceBaseArray&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<DeviceBaseArray> getEUDMDevicesWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/eudm/devices";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.EndUserDeviceMonitoringApi.getEUDMDevices",
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
        new GenericType<DeviceBaseArray>() {});
  }

  /**
   * Get all devices.
   *
   * <p>See {@link #getEUDMDevicesWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;DeviceBaseArray&gt;&gt;
   */
  public CompletableFuture<ApiResponse<DeviceBaseArray>> getEUDMDevicesWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/eudm/devices";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.EndUserDeviceMonitoringApi.getEUDMDevices",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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

  /**
   * Get device counts grouped by attribute.
   *
   * <p>See {@link #getEUDMGraphWithHttpInfo}.
   *
   * @param by Device attribute to group by (for example, <code>os</code> or <code>type</code>).
   *     Determines which column the response counts are bucketed against. (required)
   * @return GraphItemArray
   * @throws ApiException if fails to make API call
   */
  public GraphItemArray getEUDMGraph(String by) throws ApiException {
    return getEUDMGraphWithHttpInfo(by).getData();
  }

  /**
   * Get device counts grouped by attribute.
   *
   * <p>See {@link #getEUDMGraphWithHttpInfoAsync}.
   *
   * @param by Device attribute to group by (for example, <code>os</code> or <code>type</code>).
   *     Determines which column the response counts are bucketed against. (required)
   * @return CompletableFuture&lt;GraphItemArray&gt;
   */
  public CompletableFuture<GraphItemArray> getEUDMGraphAsync(String by) {
    return getEUDMGraphWithHttpInfoAsync(by)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * @param by Device attribute to group by (for example, <code>os</code> or <code>type</code>).
   *     Determines which column the response counts are bucketed against. (required)
   * @return ApiResponse&lt;GraphItemArray&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<GraphItemArray> getEUDMGraphWithHttpInfo(String by) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'by' is set
    if (by == null) {
      throw new ApiException(400, "Missing the required parameter 'by' when calling getEUDMGraph");
    }
    // create path and map variables
    String localVarPath = "/api/v2/eudm/graph";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "by", by));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.EndUserDeviceMonitoringApi.getEUDMGraph",
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
        new GenericType<GraphItemArray>() {});
  }

  /**
   * Get device counts grouped by attribute.
   *
   * <p>See {@link #getEUDMGraphWithHttpInfo}.
   *
   * @param by Device attribute to group by (for example, <code>os</code> or <code>type</code>).
   *     Determines which column the response counts are bucketed against. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;GraphItemArray&gt;&gt;
   */
  public CompletableFuture<ApiResponse<GraphItemArray>> getEUDMGraphWithHttpInfoAsync(String by) {
    Object localVarPostBody = null;

    // verify the required parameter 'by' is set
    if (by == null) {
      CompletableFuture<ApiResponse<GraphItemArray>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'by' when calling getEUDMGraph"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/eudm/graph";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "by", by));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.EndUserDeviceMonitoringApi.getEUDMGraph",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<GraphItemArray>> result = new CompletableFuture<>();
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
        new GenericType<GraphItemArray>() {});
  }

  /**
   * Get all device issue definitions.
   *
   * <p>See {@link #getEUDMIssuesWithHttpInfo}.
   *
   * @return IssueDefinitionArray
   * @throws ApiException if fails to make API call
   */
  public IssueDefinitionArray getEUDMIssues() throws ApiException {
    return getEUDMIssuesWithHttpInfo().getData();
  }

  /**
   * Get all device issue definitions.
   *
   * <p>See {@link #getEUDMIssuesWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;IssueDefinitionArray&gt;
   */
  public CompletableFuture<IssueDefinitionArray> getEUDMIssuesAsync() {
    return getEUDMIssuesWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * @return ApiResponse&lt;IssueDefinitionArray&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<IssueDefinitionArray> getEUDMIssuesWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/eudm/issues";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.EndUserDeviceMonitoringApi.getEUDMIssues",
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
        new GenericType<IssueDefinitionArray>() {});
  }

  /**
   * Get all device issue definitions.
   *
   * <p>See {@link #getEUDMIssuesWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;IssueDefinitionArray&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IssueDefinitionArray>> getEUDMIssuesWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/eudm/issues";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.EndUserDeviceMonitoringApi.getEUDMIssues",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IssueDefinitionArray>> result = new CompletableFuture<>();
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
        new GenericType<IssueDefinitionArray>() {});
  }

  /**
   * Get overview tiles.
   *
   * <p>See {@link #getEUDMOverviewWithHttpInfo}.
   *
   * @return OverviewItemArray
   * @throws ApiException if fails to make API call
   */
  public OverviewItemArray getEUDMOverview() throws ApiException {
    return getEUDMOverviewWithHttpInfo().getData();
  }

  /**
   * Get overview tiles.
   *
   * <p>See {@link #getEUDMOverviewWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;OverviewItemArray&gt;
   */
  public CompletableFuture<OverviewItemArray> getEUDMOverviewAsync() {
    return getEUDMOverviewWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * @return ApiResponse&lt;OverviewItemArray&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<OverviewItemArray> getEUDMOverviewWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/eudm/overview";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.EndUserDeviceMonitoringApi.getEUDMOverview",
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
        new GenericType<OverviewItemArray>() {});
  }

  /**
   * Get overview tiles.
   *
   * <p>See {@link #getEUDMOverviewWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;OverviewItemArray&gt;&gt;
   */
  public CompletableFuture<ApiResponse<OverviewItemArray>> getEUDMOverviewWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/eudm/overview";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.EndUserDeviceMonitoringApi.getEUDMOverview",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<OverviewItemArray>> result = new CompletableFuture<>();
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
        new GenericType<OverviewItemArray>() {});
  }
}
