package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.AIGuardEvaluateRequest;
import com.datadog.api.client.v2.model.AIGuardEvaluateResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AiGuardApi {
  private ApiClient apiClient;

  public AiGuardApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public AiGuardApi(ApiClient apiClient) {
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
   * Evaluate an AI Guard request.
   *
   * <p>See {@link #evaluateAIGuardRequestWithHttpInfo}.
   *
   * @param body (required)
   * @return AIGuardEvaluateResponse
   * @throws ApiException if fails to make API call
   */
  public AIGuardEvaluateResponse evaluateAIGuardRequest(AIGuardEvaluateRequest body)
      throws ApiException {
    return evaluateAIGuardRequestWithHttpInfo(body).getData();
  }

  /**
   * Evaluate an AI Guard request.
   *
   * <p>See {@link #evaluateAIGuardRequestWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;AIGuardEvaluateResponse&gt;
   */
  public CompletableFuture<AIGuardEvaluateResponse> evaluateAIGuardRequestAsync(
      AIGuardEvaluateRequest body) {
    return evaluateAIGuardRequestWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Analyzes a conversation for security threats such as prompt injection, jailbreak attempts, and
   * other AI-specific attacks. Returns an action recommendation (ALLOW, DENY, or ABORT) along with
   * the detected threat tags.
   *
   * @param body (required)
   * @return ApiResponse&lt;AIGuardEvaluateResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> Evaluation result with action recommendation </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AIGuardEvaluateResponse> evaluateAIGuardRequestWithHttpInfo(
      AIGuardEvaluateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling evaluateAIGuardRequest");
    }
    // create path and map variables
    String localVarPath = "/api/v2/ai-guard/evaluate";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AiGuardApi.evaluateAIGuardRequest",
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
        new GenericType<AIGuardEvaluateResponse>() {});
  }

  /**
   * Evaluate an AI Guard request.
   *
   * <p>See {@link #evaluateAIGuardRequestWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AIGuardEvaluateResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AIGuardEvaluateResponse>>
      evaluateAIGuardRequestWithHttpInfoAsync(AIGuardEvaluateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<AIGuardEvaluateResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling evaluateAIGuardRequest"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/ai-guard/evaluate";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AiGuardApi.evaluateAIGuardRequest",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AIGuardEvaluateResponse>> result = new CompletableFuture<>();
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
        new GenericType<AIGuardEvaluateResponse>() {});
  }
}
