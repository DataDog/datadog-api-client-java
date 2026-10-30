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
   * @param body The conversation to evaluate for security threats. (required)
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
   * @param body The conversation to evaluate for security threats. (required)
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
   * other AI-specific attacks. Returns an action recommendation (<code>ALLOW</code>, <code>DENY
   * </code>, or <code>ABORT</code>) along with the detected threat tags and their confidence
   * scores. AI Guard must be activated for the organization, and the calling user or application
   * key requires the <code>ai_guard_evaluate</code> permission. The action is a recommendation for
   * the caller to enforce: ALLOW permits the interaction, DENY blocks the interaction, and ABORT
   * terminates the workflow. This endpoint is rate limited to <code>700</code> requests per minute
   * per organization. Organization token limits can also result in a 429 response. Malformed
   * messages return a 400 response. Requests exceeding the raw-input limit of 1,000,000 tokens
   * return a 413 response; this limit applies to the input context, not only the size of the HTTP
   * request body.
   *
   * @param body The conversation to evaluate for security threats. (required)
   * @return ApiResponse&lt;AIGuardEvaluateResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 408 </td><td> Request Timeout </td><td>  -  </td></tr>
   *       <tr><td> 413 </td><td> Payload Too Large </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AIGuardEvaluateResponse> evaluateAIGuardRequestWithHttpInfo(
      AIGuardEvaluateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "evaluateAIGuardRequest";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
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
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
   * @param body The conversation to evaluate for security threats. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AIGuardEvaluateResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AIGuardEvaluateResponse>>
      evaluateAIGuardRequestWithHttpInfoAsync(AIGuardEvaluateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "evaluateAIGuardRequest";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<AIGuardEvaluateResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
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
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
