package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.SlackUserBindingsResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SlackIntegrationApi {
  private ApiClient apiClient;

  public SlackIntegrationApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public SlackIntegrationApi(ApiClient apiClient) {
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
   * List Slack user bindings.
   *
   * <p>See {@link #listSlackUserBindingsWithHttpInfo}.
   *
   * @param userUuid The UUID of the Datadog user to list Slack bindings for. (required)
   * @return SlackUserBindingsResponse
   * @throws ApiException if fails to make API call
   */
  public SlackUserBindingsResponse listSlackUserBindings(UUID userUuid) throws ApiException {
    return listSlackUserBindingsWithHttpInfo(userUuid).getData();
  }

  /**
   * List Slack user bindings.
   *
   * <p>See {@link #listSlackUserBindingsWithHttpInfoAsync}.
   *
   * @param userUuid The UUID of the Datadog user to list Slack bindings for. (required)
   * @return CompletableFuture&lt;SlackUserBindingsResponse&gt;
   */
  public CompletableFuture<SlackUserBindingsResponse> listSlackUserBindingsAsync(UUID userUuid) {
    return listSlackUserBindingsWithHttpInfoAsync(userUuid)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List all Slack user bindings for a given Datadog user from the Datadog Slack integration.
   *
   * @param userUuid The UUID of the Datadog user to list Slack bindings for. (required)
   * @return ApiResponse&lt;SlackUserBindingsResponse&gt;
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
  public ApiResponse<SlackUserBindingsResponse> listSlackUserBindingsWithHttpInfo(UUID userUuid)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'userUuid' is set
    if (userUuid == null) {
      throw new ApiException(
          400, "Missing the required parameter 'userUuid' when calling listSlackUserBindings");
    }
    // create path and map variables
    String localVarPath = "/api/v2/integration/slack/user-bindings";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "user_uuid", userUuid));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SlackIntegrationApi.listSlackUserBindings",
            localVarPath,
            localVarQueryParams,
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
        new GenericType<SlackUserBindingsResponse>() {});
  }

  /**
   * List Slack user bindings.
   *
   * <p>See {@link #listSlackUserBindingsWithHttpInfo}.
   *
   * @param userUuid The UUID of the Datadog user to list Slack bindings for. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SlackUserBindingsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SlackUserBindingsResponse>>
      listSlackUserBindingsWithHttpInfoAsync(UUID userUuid) {
    Object localVarPostBody = null;

    // verify the required parameter 'userUuid' is set
    if (userUuid == null) {
      CompletableFuture<ApiResponse<SlackUserBindingsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'userUuid' when calling listSlackUserBindings"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/integration/slack/user-bindings";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "user_uuid", userUuid));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SlackIntegrationApi.listSlackUserBindings",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SlackUserBindingsResponse>> result = new CompletableFuture<>();
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
        new GenericType<SlackUserBindingsResponse>() {});
  }
}
