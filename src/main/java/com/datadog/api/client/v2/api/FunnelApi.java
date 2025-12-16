package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.FunnelRequest;
import com.datadog.api.client.v2.model.FunnelResponse;
import com.datadog.api.client.v2.model.FunnelSuggestionRequest;
import com.datadog.api.client.v2.model.FunnelSuggestionResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FunnelApi {
  private ApiClient apiClient;

  public FunnelApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public FunnelApi(ApiClient apiClient) {
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
   * Get rum funnel.
   *
   * <p>See {@link #getRumFunnelWithHttpInfo}.
   *
   * @param body (required)
   * @return FunnelResponse
   * @throws ApiException if fails to make API call
   */
  public FunnelResponse getRumFunnel(FunnelRequest body) throws ApiException {
    return getRumFunnelWithHttpInfo(body).getData();
  }

  /**
   * Get rum funnel.
   *
   * <p>See {@link #getRumFunnelWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;FunnelResponse&gt;
   */
  public CompletableFuture<FunnelResponse> getRumFunnelAsync(FunnelRequest body) {
    return getRumFunnelWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Analyze conversion funnels to understand user drop-off patterns
   *
   * @param body (required)
   * @return ApiResponse&lt;FunnelResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> Successful response with funnel analysis data </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<FunnelResponse> getRumFunnelWithHttpInfo(FunnelRequest body)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getRumFunnel";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling getRumFunnel");
    }
    // create path and map variables
    String localVarPath = "/api/v2/rum/funnel";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.FunnelApi.getRumFunnel",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<FunnelResponse>() {});
  }

  /**
   * Get rum funnel.
   *
   * <p>See {@link #getRumFunnelWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;FunnelResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<FunnelResponse>> getRumFunnelWithHttpInfoAsync(
      FunnelRequest body) {
    // Check if unstable operation is enabled
    String operationId = "getRumFunnel";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<FunnelResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<FunnelResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'body' when calling getRumFunnel"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/rum/funnel";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.FunnelApi.getRumFunnel",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<FunnelResponse>> result = new CompletableFuture<>();
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
        new GenericType<FunnelResponse>() {});
  }

  /**
   * Get rum funnel step suggestions.
   *
   * <p>See {@link #getRumFunnelStepSuggestionsWithHttpInfo}.
   *
   * @param body (required)
   * @return FunnelSuggestionResponse
   * @throws ApiException if fails to make API call
   */
  public FunnelSuggestionResponse getRumFunnelStepSuggestions(FunnelSuggestionRequest body)
      throws ApiException {
    return getRumFunnelStepSuggestionsWithHttpInfo(body).getData();
  }

  /**
   * Get rum funnel step suggestions.
   *
   * <p>See {@link #getRumFunnelStepSuggestionsWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;FunnelSuggestionResponse&gt;
   */
  public CompletableFuture<FunnelSuggestionResponse> getRumFunnelStepSuggestionsAsync(
      FunnelSuggestionRequest body) {
    return getRumFunnelStepSuggestionsWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get suggested steps for building conversion funnels
   *
   * @param body (required)
   * @return ApiResponse&lt;FunnelSuggestionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> Successful response with funnel step suggestions </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<FunnelSuggestionResponse> getRumFunnelStepSuggestionsWithHttpInfo(
      FunnelSuggestionRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getRumFunnelStepSuggestions";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling getRumFunnelStepSuggestions");
    }
    // create path and map variables
    String localVarPath = "/api/v2/rum/funnel/new_step_suggestions";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.FunnelApi.getRumFunnelStepSuggestions",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<FunnelSuggestionResponse>() {});
  }

  /**
   * Get rum funnel step suggestions.
   *
   * <p>See {@link #getRumFunnelStepSuggestionsWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;FunnelSuggestionResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<FunnelSuggestionResponse>>
      getRumFunnelStepSuggestionsWithHttpInfoAsync(FunnelSuggestionRequest body) {
    // Check if unstable operation is enabled
    String operationId = "getRumFunnelStepSuggestions";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<FunnelSuggestionResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<FunnelSuggestionResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling getRumFunnelStepSuggestions"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/rum/funnel/new_step_suggestions";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.FunnelApi.getRumFunnelStepSuggestions",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<FunnelSuggestionResponse>> result = new CompletableFuture<>();
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
        new GenericType<FunnelSuggestionResponse>() {});
  }
}
