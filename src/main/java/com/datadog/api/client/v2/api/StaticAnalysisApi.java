package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.ResolveVulnerableSymbolsRequest;
import com.datadog.api.client.v2.model.ResolveVulnerableSymbolsResponse;
import com.datadog.api.client.v2.model.ScaRequest;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class StaticAnalysisApi {
  private ApiClient apiClient;

  public StaticAnalysisApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public StaticAnalysisApi(ApiClient apiClient) {
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
   * Post vulnerable symbols.
   *
   * <p>See {@link #postSCAResolveVulnerableSymbolsWithHttpInfo}.
   *
   * @param body (required)
   * @return ResolveVulnerableSymbolsResponse
   * @throws ApiException if fails to make API call
   */
  public ResolveVulnerableSymbolsResponse postSCAResolveVulnerableSymbols(
      ResolveVulnerableSymbolsRequest body) throws ApiException {
    return postSCAResolveVulnerableSymbolsWithHttpInfo(body).getData();
  }

  /**
   * Post vulnerable symbols.
   *
   * <p>See {@link #postSCAResolveVulnerableSymbolsWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ResolveVulnerableSymbolsResponse&gt;
   */
  public CompletableFuture<ResolveVulnerableSymbolsResponse> postSCAResolveVulnerableSymbolsAsync(
      ResolveVulnerableSymbolsRequest body) {
    return postSCAResolveVulnerableSymbolsWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Post vulnerable symbols
   *
   * @param body (required)
   * @return ApiResponse&lt;ResolveVulnerableSymbolsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ResolveVulnerableSymbolsResponse> postSCAResolveVulnerableSymbolsWithHttpInfo(
      ResolveVulnerableSymbolsRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "postSCAResolveVulnerableSymbols";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'body' when calling postSCAResolveVulnerableSymbols");
    }
    // create path and map variables
    String localVarPath = "/api/v2/static-analysis-sca/vulnerabilities/resolve-vulnerable-symbols";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.StaticAnalysisApi.postSCAResolveVulnerableSymbols",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<ResolveVulnerableSymbolsResponse>() {});
  }

  /**
   * Post vulnerable symbols.
   *
   * <p>See {@link #postSCAResolveVulnerableSymbolsWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ResolveVulnerableSymbolsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ResolveVulnerableSymbolsResponse>>
      postSCAResolveVulnerableSymbolsWithHttpInfoAsync(ResolveVulnerableSymbolsRequest body) {
    // Check if unstable operation is enabled
    String operationId = "postSCAResolveVulnerableSymbols";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ResolveVulnerableSymbolsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<ResolveVulnerableSymbolsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " postSCAResolveVulnerableSymbols"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/static-analysis-sca/vulnerabilities/resolve-vulnerable-symbols";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.StaticAnalysisApi.postSCAResolveVulnerableSymbols",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ResolveVulnerableSymbolsResponse>> result =
          new CompletableFuture<>();
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
        new GenericType<ResolveVulnerableSymbolsResponse>() {});
  }

  /**
   * Post dependencies for analysis.
   *
   * <p>See {@link #postSCAResultWithHttpInfo}.
   *
   * @param body (required)
   * @throws ApiException if fails to make API call
   */
  public void postSCAResult(ScaRequest body) throws ApiException {
    postSCAResultWithHttpInfo(body);
  }

  /**
   * Post dependencies for analysis.
   *
   * <p>See {@link #postSCAResultWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> postSCAResultAsync(ScaRequest body) {
    return postSCAResultWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Post dependencies for analysis
   *
   * @param body (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> postSCAResultWithHttpInfo(ScaRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "postSCAResult";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling postSCAResult");
    }
    // create path and map variables
    String localVarPath = "/api/v2/static-analysis-sca/dependencies";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.StaticAnalysisApi.postSCAResult",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
   * Post dependencies for analysis.
   *
   * <p>See {@link #postSCAResultWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> postSCAResultWithHttpInfoAsync(ScaRequest body) {
    // Check if unstable operation is enabled
    String operationId = "postSCAResult";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling postSCAResult"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/static-analysis-sca/dependencies";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.StaticAnalysisApi.postSCAResult",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"*/*"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
}
