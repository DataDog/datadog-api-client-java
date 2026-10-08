package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.AIImpactUserActivityRequest;
import jakarta.ws.rs.client.Invocation;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AiImpactApi {
  private ApiClient apiClient;

  public AiImpactApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public AiImpactApi(ApiClient apiClient) {
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
   * Send AI tool user activity.
   *
   * <p>See {@link #createAIImpactUserActivityWithHttpInfo}.
   *
   * @param body (required)
   * @throws ApiException if fails to make API call
   */
  public void createAIImpactUserActivity(AIImpactUserActivityRequest body) throws ApiException {
    createAIImpactUserActivityWithHttpInfo(body);
  }

  /**
   * Send AI tool user activity.
   *
   * <p>See {@link #createAIImpactUserActivityWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> createAIImpactUserActivityAsync(AIImpactUserActivityRequest body) {
    return createAIImpactUserActivityWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Send daily AI coding tool activity for one or more users. Each entry records whether a user was
   * active on a given day, along with the AI tools and models they used. An entry is stored once
   * per tool, and sending the same user, day, and tool again overwrites the previous value.
   *
   * @param body (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request: the batch is empty, has more than 1,000 entries, or contains an invalid entry. An entry is invalid when &#x60;user_email&#x60;, &#x60;is_active&#x60;, or &#x60;day&#x60; is missing, &#x60;tools&#x60; is missing or an empty array, &#x60;user_email&#x60; is not a valid email address, &#x60;day&#x60; is not in &#x60;YYYY-MM-DD&#x60; format, or a tool name is empty. The error message identifies the index of the first invalid entry. Fix the payload and send the request again. </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> createAIImpactUserActivityWithHttpInfo(AIImpactUserActivityRequest body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createAIImpactUserActivity");
    }
    // create path and map variables
    String localVarPath = "/api/v2/ai_impact/user_activity";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AiImpactApi.createAIImpactUserActivity",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth"});
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
   * Send AI tool user activity.
   *
   * <p>See {@link #createAIImpactUserActivityWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> createAIImpactUserActivityWithHttpInfoAsync(
      AIImpactUserActivityRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling createAIImpactUserActivity"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/ai_impact/user_activity";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AiImpactApi.createAIImpactUserActivity",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"*/*"},
              new String[] {"apiKeyAuth"});
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
