package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.DeployAppResponse;
import com.datadog.api.client.v2.model.DisableAppResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AppDeploymentApi {
  private ApiClient apiClient;

  public AppDeploymentApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public AppDeploymentApi(ApiClient apiClient) {
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
   * Deploy App.
   *
   * <p>See {@link #deployAppWithHttpInfo}.
   *
   * @param appId (required)
   * @return DeployAppResponse
   * @throws ApiException if fails to make API call
   */
  public DeployAppResponse deployApp(String appId) throws ApiException {
    return deployAppWithHttpInfo(appId).getData();
  }

  /**
   * Deploy App.
   *
   * <p>See {@link #deployAppWithHttpInfoAsync}.
   *
   * @param appId (required)
   * @return CompletableFuture&lt;DeployAppResponse&gt;
   */
  public CompletableFuture<DeployAppResponse> deployAppAsync(String appId) {
    return deployAppWithHttpInfoAsync(appId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Deploy (publish) an app by ID
   *
   * @param appId (required)
   * @return ApiResponse&lt;DeployAppResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<DeployAppResponse> deployAppWithHttpInfo(String appId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deployApp";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling deployApp");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/app-builder/apps/{app_id}/deployment"
            .replaceAll("\\{" + "app_id" + "\\}", apiClient.escapeString(appId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AppDeploymentApi.deployApp",
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
        new GenericType<DeployAppResponse>() {});
  }

  /**
   * Deploy App.
   *
   * <p>See {@link #deployAppWithHttpInfo}.
   *
   * @param appId (required)
   * @return CompletableFuture&lt;ApiResponse&lt;DeployAppResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<DeployAppResponse>> deployAppWithHttpInfoAsync(
      String appId) {
    // Check if unstable operation is enabled
    String operationId = "deployApp";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<DeployAppResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'appId' is set
    if (appId == null) {
      CompletableFuture<ApiResponse<DeployAppResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'appId' when calling deployApp"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/app-builder/apps/{app_id}/deployment"
            .replaceAll("\\{" + "app_id" + "\\}", apiClient.escapeString(appId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AppDeploymentApi.deployApp",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<DeployAppResponse>> result = new CompletableFuture<>();
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
        new GenericType<DeployAppResponse>() {});
  }

  /**
   * Disable App.
   *
   * <p>See {@link #disableAppWithHttpInfo}.
   *
   * @param appId (required)
   * @return DisableAppResponse
   * @throws ApiException if fails to make API call
   */
  public DisableAppResponse disableApp(String appId) throws ApiException {
    return disableAppWithHttpInfo(appId).getData();
  }

  /**
   * Disable App.
   *
   * <p>See {@link #disableAppWithHttpInfoAsync}.
   *
   * @param appId (required)
   * @return CompletableFuture&lt;DisableAppResponse&gt;
   */
  public CompletableFuture<DisableAppResponse> disableAppAsync(String appId) {
    return disableAppWithHttpInfoAsync(appId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Disable an app by ID
   *
   * @param appId (required)
   * @return ApiResponse&lt;DisableAppResponse&gt;
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
  public ApiResponse<DisableAppResponse> disableAppWithHttpInfo(String appId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "disableApp";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling disableApp");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/app-builder/apps/{app_id}/deployment"
            .replaceAll("\\{" + "app_id" + "\\}", apiClient.escapeString(appId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AppDeploymentApi.disableApp",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<DisableAppResponse>() {});
  }

  /**
   * Disable App.
   *
   * <p>See {@link #disableAppWithHttpInfo}.
   *
   * @param appId (required)
   * @return CompletableFuture&lt;ApiResponse&lt;DisableAppResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<DisableAppResponse>> disableAppWithHttpInfoAsync(
      String appId) {
    // Check if unstable operation is enabled
    String operationId = "disableApp";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<DisableAppResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'appId' is set
    if (appId == null) {
      CompletableFuture<ApiResponse<DisableAppResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'appId' when calling disableApp"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/app-builder/apps/{app_id}/deployment"
            .replaceAll("\\{" + "app_id" + "\\}", apiClient.escapeString(appId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AppDeploymentApi.disableApp",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<DisableAppResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<DisableAppResponse>() {});
  }
}
