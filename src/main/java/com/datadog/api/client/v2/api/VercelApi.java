package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.VercelConfigAttributes;
import com.datadog.api.client.v2.model.VercelConfigResponse;
import com.datadog.api.client.v2.model.VercelTokenCreateRequest;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class VercelApi {
  private ApiClient apiClient;

  public VercelApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public VercelApi(ApiClient apiClient) {
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
   * Create Vercel access token.
   *
   * <p>See {@link #createVercelTokenWithHttpInfo}.
   *
   * @param body (required)
   * @throws ApiException if fails to make API call
   */
  public void createVercelToken(VercelTokenCreateRequest body) throws ApiException {
    createVercelTokenWithHttpInfo(body);
  }

  /**
   * Create Vercel access token.
   *
   * <p>See {@link #createVercelTokenWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> createVercelTokenAsync(VercelTokenCreateRequest body) {
    return createVercelTokenWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Exchange a Vercel marketplace authorization code for an access token and store it in Datadog so
   * that the integration can call Vercel APIs on behalf of the customer. This endpoint is invoked
   * once when a customer installs the Datadog integration from the Vercel marketplace.
   *
   * @param body (required)
   * @return ApiResponse&lt;Void&gt;
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
  public ApiResponse<Void> createVercelTokenWithHttpInfo(VercelTokenCreateRequest body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createVercelToken");
    }
    // create path and map variables
    String localVarPath = "/api/v2/vercel/token";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.VercelApi.createVercelToken",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Create Vercel access token.
   *
   * <p>See {@link #createVercelTokenWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> createVercelTokenWithHttpInfoAsync(
      VercelTokenCreateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createVercelToken"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/vercel/token";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.VercelApi.createVercelToken",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"*/*"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
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
        null);
  }

  /**
   * Get Vercel configuration.
   *
   * <p>See {@link #getVercelConfigWithHttpInfo}.
   *
   * @param configurationId The Vercel configuration ID. (required)
   * @return VercelConfigResponse
   * @throws ApiException if fails to make API call
   */
  public VercelConfigResponse getVercelConfig(String configurationId) throws ApiException {
    return getVercelConfigWithHttpInfo(configurationId).getData();
  }

  /**
   * Get Vercel configuration.
   *
   * <p>See {@link #getVercelConfigWithHttpInfoAsync}.
   *
   * @param configurationId The Vercel configuration ID. (required)
   * @return CompletableFuture&lt;VercelConfigResponse&gt;
   */
  public CompletableFuture<VercelConfigResponse> getVercelConfigAsync(String configurationId) {
    return getVercelConfigWithHttpInfoAsync(configurationId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Retrieve the Datadog Vercel integration configuration for a given Vercel configuration. The
   * response contains the API key reference, logs forwarding settings, and tracing settings stored
   * in Datadog for this configuration.
   *
   * @param configurationId The Vercel configuration ID. (required)
   * @return ApiResponse&lt;VercelConfigResponse&gt;
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
  public ApiResponse<VercelConfigResponse> getVercelConfigWithHttpInfo(String configurationId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'configurationId' is set
    if (configurationId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'configurationId' when calling getVercelConfig");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/vercel/config/{configuration_id}"
            .replaceAll(
                "\\{" + "configuration_id" + "\\}",
                apiClient.escapeString(configurationId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.VercelApi.getVercelConfig",
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
        new GenericType<VercelConfigResponse>() {});
  }

  /**
   * Get Vercel configuration.
   *
   * <p>See {@link #getVercelConfigWithHttpInfo}.
   *
   * @param configurationId The Vercel configuration ID. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;VercelConfigResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<VercelConfigResponse>> getVercelConfigWithHttpInfoAsync(
      String configurationId) {
    Object localVarPostBody = null;

    // verify the required parameter 'configurationId' is set
    if (configurationId == null) {
      CompletableFuture<ApiResponse<VercelConfigResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'configurationId' when calling getVercelConfig"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/vercel/config/{configuration_id}"
            .replaceAll(
                "\\{" + "configuration_id" + "\\}",
                apiClient.escapeString(configurationId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.VercelApi.getVercelConfig",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<VercelConfigResponse>> result = new CompletableFuture<>();
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
        new GenericType<VercelConfigResponse>() {});
  }

  /**
   * Update Vercel configuration.
   *
   * <p>See {@link #updateVercelConfigWithHttpInfo}.
   *
   * @param configurationId The Vercel configuration ID. (required)
   * @param body (required)
   * @throws ApiException if fails to make API call
   */
  public void updateVercelConfig(String configurationId, VercelConfigAttributes body)
      throws ApiException {
    updateVercelConfigWithHttpInfo(configurationId, body);
  }

  /**
   * Update Vercel configuration.
   *
   * <p>See {@link #updateVercelConfigWithHttpInfoAsync}.
   *
   * @param configurationId The Vercel configuration ID. (required)
   * @param body (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> updateVercelConfigAsync(
      String configurationId, VercelConfigAttributes body) {
    return updateVercelConfigWithHttpInfoAsync(configurationId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update the Datadog Vercel integration configuration for a given Vercel configuration. The
   * provided payload replaces the existing API key reference, logs forwarding settings, and tracing
   * settings stored in Datadog for this configuration.
   *
   * @param configurationId The Vercel configuration ID. (required)
   * @param body (required)
   * @return ApiResponse&lt;Void&gt;
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
  public ApiResponse<Void> updateVercelConfigWithHttpInfo(
      String configurationId, VercelConfigAttributes body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'configurationId' is set
    if (configurationId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'configurationId' when calling updateVercelConfig");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateVercelConfig");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/vercel/config/{configuration_id}"
            .replaceAll(
                "\\{" + "configuration_id" + "\\}",
                apiClient.escapeString(configurationId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.VercelApi.updateVercelConfig",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "PUT",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Update Vercel configuration.
   *
   * <p>See {@link #updateVercelConfigWithHttpInfo}.
   *
   * @param configurationId The Vercel configuration ID. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> updateVercelConfigWithHttpInfoAsync(
      String configurationId, VercelConfigAttributes body) {
    Object localVarPostBody = body;

    // verify the required parameter 'configurationId' is set
    if (configurationId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'configurationId' when calling updateVercelConfig"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateVercelConfig"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/vercel/config/{configuration_id}"
            .replaceAll(
                "\\{" + "configuration_id" + "\\}",
                apiClient.escapeString(configurationId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.VercelApi.updateVercelConfig",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"*/*"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "PUT",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }
}
