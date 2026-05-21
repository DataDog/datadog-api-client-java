package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.ReplaySummaryRequest;
import com.datadog.api.client.v2.model.ReplaySummaryResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RumReplayApi {
  private ApiClient apiClient;

  public RumReplayApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public RumReplayApi(ApiClient apiClient) {
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

  /** Manage optional parameters to generateReplaySummary. */
  public static class GenerateReplaySummaryOptionalParameters {
    private Long ts;

    /**
     * Set ts.
     *
     * @param ts Server-side timestamp in milliseconds. (optional)
     * @return GenerateReplaySummaryOptionalParameters
     */
    public GenerateReplaySummaryOptionalParameters ts(Long ts) {
      this.ts = ts;
      return this;
    }
  }

  /**
   * Generate replay summary.
   *
   * <p>See {@link #generateReplaySummaryWithHttpInfo}.
   *
   * @param sessionId Unique identifier of the session. (required)
   * @param dataSource Data source for the session. Valid values are <code>rum</code>, <code>
   *     product_analytics</code>, and <code>replay</code>. (required)
   * @param body (required)
   * @return ReplaySummaryResponse
   * @throws ApiException if fails to make API call
   */
  public ReplaySummaryResponse generateReplaySummary(
      String sessionId, String dataSource, ReplaySummaryRequest body) throws ApiException {
    return generateReplaySummaryWithHttpInfo(
            sessionId, dataSource, body, new GenerateReplaySummaryOptionalParameters())
        .getData();
  }

  /**
   * Generate replay summary.
   *
   * <p>See {@link #generateReplaySummaryWithHttpInfoAsync}.
   *
   * @param sessionId Unique identifier of the session. (required)
   * @param dataSource Data source for the session. Valid values are <code>rum</code>, <code>
   *     product_analytics</code>, and <code>replay</code>. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ReplaySummaryResponse&gt;
   */
  public CompletableFuture<ReplaySummaryResponse> generateReplaySummaryAsync(
      String sessionId, String dataSource, ReplaySummaryRequest body) {
    return generateReplaySummaryWithHttpInfoAsync(
            sessionId, dataSource, body, new GenerateReplaySummaryOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Generate replay summary.
   *
   * <p>See {@link #generateReplaySummaryWithHttpInfo}.
   *
   * @param sessionId Unique identifier of the session. (required)
   * @param dataSource Data source for the session. Valid values are <code>rum</code>, <code>
   *     product_analytics</code>, and <code>replay</code>. (required)
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return ReplaySummaryResponse
   * @throws ApiException if fails to make API call
   */
  public ReplaySummaryResponse generateReplaySummary(
      String sessionId,
      String dataSource,
      ReplaySummaryRequest body,
      GenerateReplaySummaryOptionalParameters parameters)
      throws ApiException {
    return generateReplaySummaryWithHttpInfo(sessionId, dataSource, body, parameters).getData();
  }

  /**
   * Generate replay summary.
   *
   * <p>See {@link #generateReplaySummaryWithHttpInfoAsync}.
   *
   * @param sessionId Unique identifier of the session. (required)
   * @param dataSource Data source for the session. Valid values are <code>rum</code>, <code>
   *     product_analytics</code>, and <code>replay</code>. (required)
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ReplaySummaryResponse&gt;
   */
  public CompletableFuture<ReplaySummaryResponse> generateReplaySummaryAsync(
      String sessionId,
      String dataSource,
      ReplaySummaryRequest body,
      GenerateReplaySummaryOptionalParameters parameters) {
    return generateReplaySummaryWithHttpInfoAsync(sessionId, dataSource, body, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Generate an AI-powered summary for a RUM replay session, including chapter breakdowns and
   * behavioral analysis.
   *
   * @param sessionId Unique identifier of the session. (required)
   * @param dataSource Data source for the session. Valid values are <code>rum</code>, <code>
   *     product_analytics</code>, and <code>replay</code>. (required)
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;ReplaySummaryResponse&gt;
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
  public ApiResponse<ReplaySummaryResponse> generateReplaySummaryWithHttpInfo(
      String sessionId,
      String dataSource,
      ReplaySummaryRequest body,
      GenerateReplaySummaryOptionalParameters parameters)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "generateReplaySummary";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'sessionId' is set
    if (sessionId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'sessionId' when calling generateReplaySummary");
    }

    // verify the required parameter 'dataSource' is set
    if (dataSource == null) {
      throw new ApiException(
          400, "Missing the required parameter 'dataSource' when calling generateReplaySummary");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling generateReplaySummary");
    }
    Long ts = parameters.ts;
    // create path and map variables
    String localVarPath =
        "/api/v2/replay/summary/{session_id}"
            .replaceAll("\\{" + "session_id" + "\\}", apiClient.escapeString(sessionId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "data_source", dataSource));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ts", ts));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumReplayApi.generateReplaySummary",
            localVarPath,
            localVarQueryParams,
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
        new GenericType<ReplaySummaryResponse>() {});
  }

  /**
   * Generate replay summary.
   *
   * <p>See {@link #generateReplaySummaryWithHttpInfo}.
   *
   * @param sessionId Unique identifier of the session. (required)
   * @param dataSource Data source for the session. Valid values are <code>rum</code>, <code>
   *     product_analytics</code>, and <code>replay</code>. (required)
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;ReplaySummaryResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ReplaySummaryResponse>>
      generateReplaySummaryWithHttpInfoAsync(
          String sessionId,
          String dataSource,
          ReplaySummaryRequest body,
          GenerateReplaySummaryOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "generateReplaySummary";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ReplaySummaryResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'sessionId' is set
    if (sessionId == null) {
      CompletableFuture<ApiResponse<ReplaySummaryResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'sessionId' when calling generateReplaySummary"));
      return result;
    }

    // verify the required parameter 'dataSource' is set
    if (dataSource == null) {
      CompletableFuture<ApiResponse<ReplaySummaryResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'dataSource' when calling generateReplaySummary"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<ReplaySummaryResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling generateReplaySummary"));
      return result;
    }
    Long ts = parameters.ts;
    // create path and map variables
    String localVarPath =
        "/api/v2/replay/summary/{session_id}"
            .replaceAll("\\{" + "session_id" + "\\}", apiClient.escapeString(sessionId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "data_source", dataSource));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ts", ts));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumReplayApi.generateReplaySummary",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ReplaySummaryResponse>> result = new CompletableFuture<>();
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
        new GenericType<ReplaySummaryResponse>() {});
  }
}
