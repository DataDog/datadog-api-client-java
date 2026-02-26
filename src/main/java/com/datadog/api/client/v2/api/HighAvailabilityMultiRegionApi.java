package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.HamrOrgConnectionRequest;
import com.datadog.api.client.v2.model.HamrOrgConnectionResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class HighAvailabilityMultiRegionApi {
  private ApiClient apiClient;

  public HighAvailabilityMultiRegionApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public HighAvailabilityMultiRegionApi(ApiClient apiClient) {
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
   * Create or update HAMR organization connection.
   *
   * <p>See {@link #createHamrOrgConnectionWithHttpInfo}.
   *
   * @param body (required)
   * @return HamrOrgConnectionResponse
   * @throws ApiException if fails to make API call
   */
  public HamrOrgConnectionResponse createHamrOrgConnection(HamrOrgConnectionRequest body)
      throws ApiException {
    return createHamrOrgConnectionWithHttpInfo(body).getData();
  }

  /**
   * Create or update HAMR organization connection.
   *
   * <p>See {@link #createHamrOrgConnectionWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;HamrOrgConnectionResponse&gt;
   */
  public CompletableFuture<HamrOrgConnectionResponse> createHamrOrgConnectionAsync(
      HamrOrgConnectionRequest body) {
    return createHamrOrgConnectionWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create or update the High Availability Multi-Region (HAMR) organization connection. This
   * endpoint allows you to configure the HAMR connection between the authenticated organization and
   * a target organization, including setting the connection status (ONBOARDING, PASSIVE, FAILOVER,
   * ACTIVE, RECOVERY)
   *
   * @param body (required)
   * @return ApiResponse&lt;HamrOrgConnectionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<HamrOrgConnectionResponse> createHamrOrgConnectionWithHttpInfo(
      HamrOrgConnectionRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createHamrOrgConnection";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createHamrOrgConnection");
    }
    // create path and map variables
    String localVarPath = "/api/v2/hamr";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.HighAvailabilityMultiRegionApi.createHamrOrgConnection",
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
        new GenericType<HamrOrgConnectionResponse>() {});
  }

  /**
   * Create or update HAMR organization connection.
   *
   * <p>See {@link #createHamrOrgConnectionWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;HamrOrgConnectionResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<HamrOrgConnectionResponse>>
      createHamrOrgConnectionWithHttpInfoAsync(HamrOrgConnectionRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createHamrOrgConnection";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<HamrOrgConnectionResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<HamrOrgConnectionResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createHamrOrgConnection"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/hamr";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.HighAvailabilityMultiRegionApi.createHamrOrgConnection",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<HamrOrgConnectionResponse>> result = new CompletableFuture<>();
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
        new GenericType<HamrOrgConnectionResponse>() {});
  }

  /**
   * Get HAMR organization connection.
   *
   * <p>See {@link #getHamrOrgConnectionWithHttpInfo}.
   *
   * @return HamrOrgConnectionResponse
   * @throws ApiException if fails to make API call
   */
  public HamrOrgConnectionResponse getHamrOrgConnection() throws ApiException {
    return getHamrOrgConnectionWithHttpInfo().getData();
  }

  /**
   * Get HAMR organization connection.
   *
   * <p>See {@link #getHamrOrgConnectionWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;HamrOrgConnectionResponse&gt;
   */
  public CompletableFuture<HamrOrgConnectionResponse> getHamrOrgConnectionAsync() {
    return getHamrOrgConnectionWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Retrieve the High Availability Multi-Region (HAMR) organization connection details for the
   * authenticated organization. This endpoint returns information about the HAMR connection
   * configuration, including the target organization, datacenter, status, and whether this is the
   * primary or secondary organization in the HAMR relationship.
   *
   * @return ApiResponse&lt;HamrOrgConnectionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<HamrOrgConnectionResponse> getHamrOrgConnectionWithHttpInfo()
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getHamrOrgConnection";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/hamr";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.HighAvailabilityMultiRegionApi.getHamrOrgConnection",
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
        new GenericType<HamrOrgConnectionResponse>() {});
  }

  /**
   * Get HAMR organization connection.
   *
   * <p>See {@link #getHamrOrgConnectionWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;HamrOrgConnectionResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<HamrOrgConnectionResponse>>
      getHamrOrgConnectionWithHttpInfoAsync() {
    // Check if unstable operation is enabled
    String operationId = "getHamrOrgConnection";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<HamrOrgConnectionResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/hamr";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.HighAvailabilityMultiRegionApi.getHamrOrgConnection",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<HamrOrgConnectionResponse>> result = new CompletableFuture<>();
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
        new GenericType<HamrOrgConnectionResponse>() {});
  }
}
