package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.RecommendationDocument;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SpaApi {
  private ApiClient apiClient;

  public SpaApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public SpaApi(ApiClient apiClient) {
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

  /** Manage optional parameters to getSPARecommendations. */
  public static class GetSPARecommendationsOptionalParameters {
    private String bypassCache;

    /**
     * Set bypassCache.
     *
     * @param bypassCache The recommendation service should not use its metrics cache. (optional)
     * @return GetSPARecommendationsOptionalParameters
     */
    public GetSPARecommendationsOptionalParameters bypassCache(String bypassCache) {
      this.bypassCache = bypassCache;
      return this;
    }
  }

  /**
   * Get SPA Recommendations.
   *
   * <p>See {@link #getSPARecommendationsWithHttpInfo}.
   *
   * @param service The service name for a spark job. (required)
   * @return RecommendationDocument
   * @throws ApiException if fails to make API call
   */
  public RecommendationDocument getSPARecommendations(String service) throws ApiException {
    return getSPARecommendationsWithHttpInfo(service, new GetSPARecommendationsOptionalParameters())
        .getData();
  }

  /**
   * Get SPA Recommendations.
   *
   * <p>See {@link #getSPARecommendationsWithHttpInfoAsync}.
   *
   * @param service The service name for a spark job. (required)
   * @return CompletableFuture&lt;RecommendationDocument&gt;
   */
  public CompletableFuture<RecommendationDocument> getSPARecommendationsAsync(String service) {
    return getSPARecommendationsWithHttpInfoAsync(
            service, new GetSPARecommendationsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get SPA Recommendations.
   *
   * <p>See {@link #getSPARecommendationsWithHttpInfo}.
   *
   * @param service The service name for a spark job. (required)
   * @param parameters Optional parameters for the request.
   * @return RecommendationDocument
   * @throws ApiException if fails to make API call
   */
  public RecommendationDocument getSPARecommendations(
      String service, GetSPARecommendationsOptionalParameters parameters) throws ApiException {
    return getSPARecommendationsWithHttpInfo(service, parameters).getData();
  }

  /**
   * Get SPA Recommendations.
   *
   * <p>See {@link #getSPARecommendationsWithHttpInfoAsync}.
   *
   * @param service The service name for a spark job. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;RecommendationDocument&gt;
   */
  public CompletableFuture<RecommendationDocument> getSPARecommendationsAsync(
      String service, GetSPARecommendationsOptionalParameters parameters) {
    return getSPARecommendationsWithHttpInfoAsync(service, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * This endpoint is currently experimental and restricted to Datadog internal use only. Retrieve
   * resource recommendations for a Spark job. The caller (Spark Gateway or DJM UI) provides a
   * service name and SPA returns structured recommendations for driver and executor resources. The
   * version with a shard should be preferred, where possible, as it gives more accurate results.
   *
   * @param service The service name for a spark job. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;RecommendationDocument&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<RecommendationDocument> getSPARecommendationsWithHttpInfo(
      String service, GetSPARecommendationsOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getSPARecommendations";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'service' is set
    if (service == null) {
      throw new ApiException(
          400, "Missing the required parameter 'service' when calling getSPARecommendations");
    }
    String bypassCache = parameters.bypassCache;
    // create path and map variables
    String localVarPath =
        "/api/v2/spa/recommendations/{service}"
            .replaceAll("\\{" + "service" + "\\}", apiClient.escapeString(service.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "bypass_cache", bypassCache));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SpaApi.getSPARecommendations",
            localVarPath,
            localVarQueryParams,
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"AuthZ"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<RecommendationDocument>() {});
  }

  /**
   * Get SPA Recommendations.
   *
   * <p>See {@link #getSPARecommendationsWithHttpInfo}.
   *
   * @param service The service name for a spark job. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;RecommendationDocument&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RecommendationDocument>>
      getSPARecommendationsWithHttpInfoAsync(
          String service, GetSPARecommendationsOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "getSPARecommendations";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<RecommendationDocument>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'service' is set
    if (service == null) {
      CompletableFuture<ApiResponse<RecommendationDocument>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'service' when calling getSPARecommendations"));
      return result;
    }
    String bypassCache = parameters.bypassCache;
    // create path and map variables
    String localVarPath =
        "/api/v2/spa/recommendations/{service}"
            .replaceAll("\\{" + "service" + "\\}", apiClient.escapeString(service.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "bypass_cache", bypassCache));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SpaApi.getSPARecommendations",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RecommendationDocument>> result = new CompletableFuture<>();
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
        new GenericType<RecommendationDocument>() {});
  }

  /** Manage optional parameters to getSPARecommendationsWithShard. */
  public static class GetSPARecommendationsWithShardOptionalParameters {
    private String bypassCache;

    /**
     * Set bypassCache.
     *
     * @param bypassCache The recommendation service should not use its metrics cache. (optional)
     * @return GetSPARecommendationsWithShardOptionalParameters
     */
    public GetSPARecommendationsWithShardOptionalParameters bypassCache(String bypassCache) {
      this.bypassCache = bypassCache;
      return this;
    }
  }

  /**
   * Get SPA Recommendations with a shard parameter.
   *
   * <p>See {@link #getSPARecommendationsWithShardWithHttpInfo}.
   *
   * @param shard The shard tag for a spark job, which differentiates jobs within the same service
   *     that have different resource needs (required)
   * @param service The service name for a spark job (required)
   * @return RecommendationDocument
   * @throws ApiException if fails to make API call
   */
  public RecommendationDocument getSPARecommendationsWithShard(String shard, String service)
      throws ApiException {
    return getSPARecommendationsWithShardWithHttpInfo(
            shard, service, new GetSPARecommendationsWithShardOptionalParameters())
        .getData();
  }

  /**
   * Get SPA Recommendations with a shard parameter.
   *
   * <p>See {@link #getSPARecommendationsWithShardWithHttpInfoAsync}.
   *
   * @param shard The shard tag for a spark job, which differentiates jobs within the same service
   *     that have different resource needs (required)
   * @param service The service name for a spark job (required)
   * @return CompletableFuture&lt;RecommendationDocument&gt;
   */
  public CompletableFuture<RecommendationDocument> getSPARecommendationsWithShardAsync(
      String shard, String service) {
    return getSPARecommendationsWithShardWithHttpInfoAsync(
            shard, service, new GetSPARecommendationsWithShardOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get SPA Recommendations with a shard parameter.
   *
   * <p>See {@link #getSPARecommendationsWithShardWithHttpInfo}.
   *
   * @param shard The shard tag for a spark job, which differentiates jobs within the same service
   *     that have different resource needs (required)
   * @param service The service name for a spark job (required)
   * @param parameters Optional parameters for the request.
   * @return RecommendationDocument
   * @throws ApiException if fails to make API call
   */
  public RecommendationDocument getSPARecommendationsWithShard(
      String shard, String service, GetSPARecommendationsWithShardOptionalParameters parameters)
      throws ApiException {
    return getSPARecommendationsWithShardWithHttpInfo(shard, service, parameters).getData();
  }

  /**
   * Get SPA Recommendations with a shard parameter.
   *
   * <p>See {@link #getSPARecommendationsWithShardWithHttpInfoAsync}.
   *
   * @param shard The shard tag for a spark job, which differentiates jobs within the same service
   *     that have different resource needs (required)
   * @param service The service name for a spark job (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;RecommendationDocument&gt;
   */
  public CompletableFuture<RecommendationDocument> getSPARecommendationsWithShardAsync(
      String shard, String service, GetSPARecommendationsWithShardOptionalParameters parameters) {
    return getSPARecommendationsWithShardWithHttpInfoAsync(shard, service, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * This endpoint is currently experimental and restricted to Datadog internal use only. Retrieve
   * resource recommendations for a Spark job. The caller (Spark Gateway or DJM UI) provides a
   * service name and shard identifier, and SPA returns structured recommendations for driver and
   * executor resources.
   *
   * @param shard The shard tag for a spark job, which differentiates jobs within the same service
   *     that have different resource needs (required)
   * @param service The service name for a spark job (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;RecommendationDocument&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<RecommendationDocument> getSPARecommendationsWithShardWithHttpInfo(
      String shard, String service, GetSPARecommendationsWithShardOptionalParameters parameters)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getSPARecommendationsWithShard";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'shard' is set
    if (shard == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'shard' when calling getSPARecommendationsWithShard");
    }

    // verify the required parameter 'service' is set
    if (service == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'service' when calling getSPARecommendationsWithShard");
    }
    String bypassCache = parameters.bypassCache;
    // create path and map variables
    String localVarPath =
        "/api/v2/spa/recommendations/{service}/{shard}"
            .replaceAll("\\{" + "shard" + "\\}", apiClient.escapeString(shard.toString()))
            .replaceAll("\\{" + "service" + "\\}", apiClient.escapeString(service.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "bypass_cache", bypassCache));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SpaApi.getSPARecommendationsWithShard",
            localVarPath,
            localVarQueryParams,
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"AuthZ"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<RecommendationDocument>() {});
  }

  /**
   * Get SPA Recommendations with a shard parameter.
   *
   * <p>See {@link #getSPARecommendationsWithShardWithHttpInfo}.
   *
   * @param shard The shard tag for a spark job, which differentiates jobs within the same service
   *     that have different resource needs (required)
   * @param service The service name for a spark job (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;RecommendationDocument&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RecommendationDocument>>
      getSPARecommendationsWithShardWithHttpInfoAsync(
          String shard,
          String service,
          GetSPARecommendationsWithShardOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "getSPARecommendationsWithShard";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<RecommendationDocument>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'shard' is set
    if (shard == null) {
      CompletableFuture<ApiResponse<RecommendationDocument>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'shard' when calling"
                  + " getSPARecommendationsWithShard"));
      return result;
    }

    // verify the required parameter 'service' is set
    if (service == null) {
      CompletableFuture<ApiResponse<RecommendationDocument>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'service' when calling"
                  + " getSPARecommendationsWithShard"));
      return result;
    }
    String bypassCache = parameters.bypassCache;
    // create path and map variables
    String localVarPath =
        "/api/v2/spa/recommendations/{service}/{shard}"
            .replaceAll("\\{" + "shard" + "\\}", apiClient.escapeString(shard.toString()))
            .replaceAll("\\{" + "service" + "\\}", apiClient.escapeString(service.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "bypass_cache", bypassCache));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SpaApi.getSPARecommendationsWithShard",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RecommendationDocument>> result = new CompletableFuture<>();
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
        new GenericType<RecommendationDocument>() {});
  }
}
