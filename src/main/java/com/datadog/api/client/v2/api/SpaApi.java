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

  /**
   * Get SPA Recommendations.
   *
   * <p>See {@link #getSPARecommendationsWithHttpInfo}.
   *
   * @param shard The shard tag for a spark job, which differentiates jobs within the same service
   *     that have different resource needs (required)
   * @param service The service name for a spark job (required)
   * @return RecommendationDocument
   * @throws ApiException if fails to make API call
   */
  public RecommendationDocument getSPARecommendations(String shard, String service)
      throws ApiException {
    return getSPARecommendationsWithHttpInfo(shard, service).getData();
  }

  /**
   * Get SPA Recommendations.
   *
   * <p>See {@link #getSPARecommendationsWithHttpInfoAsync}.
   *
   * @param shard The shard tag for a spark job, which differentiates jobs within the same service
   *     that have different resource needs (required)
   * @param service The service name for a spark job (required)
   * @return CompletableFuture&lt;RecommendationDocument&gt;
   */
  public CompletableFuture<RecommendationDocument> getSPARecommendationsAsync(
      String shard, String service) {
    return getSPARecommendationsWithHttpInfoAsync(shard, service)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Retrieve resource recommendations for a Spark job. The caller (Spark Gateway or DJM UI)
   * provides a service name and shard identifier, and SPA returns structured recommendations for
   * driver and executor resources.
   *
   * @param shard The shard tag for a spark job, which differentiates jobs within the same service
   *     that have different resource needs (required)
   * @param service The service name for a spark job (required)
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
      String shard, String service) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getSPARecommendations";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'shard' is set
    if (shard == null) {
      throw new ApiException(
          400, "Missing the required parameter 'shard' when calling getSPARecommendations");
    }

    // verify the required parameter 'service' is set
    if (service == null) {
      throw new ApiException(
          400, "Missing the required parameter 'service' when calling getSPARecommendations");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/spa/recommendations/{service}/{shard}"
            .replaceAll("\\{" + "shard" + "\\}", apiClient.escapeString(shard.toString()))
            .replaceAll("\\{" + "service" + "\\}", apiClient.escapeString(service.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SpaApi.getSPARecommendations",
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
        new GenericType<RecommendationDocument>() {});
  }

  /**
   * Get SPA Recommendations.
   *
   * <p>See {@link #getSPARecommendationsWithHttpInfo}.
   *
   * @param shard The shard tag for a spark job, which differentiates jobs within the same service
   *     that have different resource needs (required)
   * @param service The service name for a spark job (required)
   * @return CompletableFuture&lt;ApiResponse&lt;RecommendationDocument&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RecommendationDocument>>
      getSPARecommendationsWithHttpInfoAsync(String shard, String service) {
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

    // verify the required parameter 'shard' is set
    if (shard == null) {
      CompletableFuture<ApiResponse<RecommendationDocument>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'shard' when calling getSPARecommendations"));
      return result;
    }

    // verify the required parameter 'service' is set
    if (service == null) {
      CompletableFuture<ApiResponse<RecommendationDocument>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'service' when calling getSPARecommendations"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/spa/recommendations/{service}/{shard}"
            .replaceAll("\\{" + "shard" + "\\}", apiClient.escapeString(shard.toString()))
            .replaceAll("\\{" + "service" + "\\}", apiClient.escapeString(service.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SpaApi.getSPARecommendations",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
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
