package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.GetCohortRequest;
import com.datadog.api.client.v2.model.GetCohortResponse;
import com.datadog.api.client.v2.model.GetCohortUsersRequest;
import com.datadog.api.client.v2.model.GetCohortUsersResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CohortApi {
  private ApiClient apiClient;

  public CohortApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public CohortApi(ApiClient apiClient) {
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
   * Get rum cohort.
   *
   * <p>See {@link #getRumCohortWithHttpInfo}.
   *
   * @param body (required)
   * @return GetCohortResponse
   * @throws ApiException if fails to make API call
   */
  public GetCohortResponse getRumCohort(GetCohortRequest body) throws ApiException {
    return getRumCohortWithHttpInfo(body).getData();
  }

  /**
   * Get rum cohort.
   *
   * <p>See {@link #getRumCohortWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;GetCohortResponse&gt;
   */
  public CompletableFuture<GetCohortResponse> getRumCohortAsync(GetCohortRequest body) {
    return getRumCohortWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Analyze user cohorts for retention and conversion analysis
   *
   * @param body (required)
   * @return ApiResponse&lt;GetCohortResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> Successful response with cohort analysis data </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<GetCohortResponse> getRumCohortWithHttpInfo(GetCohortRequest body)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getRumCohort";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling getRumCohort");
    }
    // create path and map variables
    String localVarPath = "/api/v2/rum/cohort";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CohortApi.getRumCohort",
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
        new GenericType<GetCohortResponse>() {});
  }

  /**
   * Get rum cohort.
   *
   * <p>See {@link #getRumCohortWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;GetCohortResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<GetCohortResponse>> getRumCohortWithHttpInfoAsync(
      GetCohortRequest body) {
    // Check if unstable operation is enabled
    String operationId = "getRumCohort";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<GetCohortResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<GetCohortResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'body' when calling getRumCohort"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/rum/cohort";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CohortApi.getRumCohort",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<GetCohortResponse>> result = new CompletableFuture<>();
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
        new GenericType<GetCohortResponse>() {});
  }

  /**
   * Get rum cohort users.
   *
   * <p>See {@link #getRumCohortUsersWithHttpInfo}.
   *
   * @param body (required)
   * @return GetCohortUsersResponse
   * @throws ApiException if fails to make API call
   */
  public GetCohortUsersResponse getRumCohortUsers(GetCohortUsersRequest body) throws ApiException {
    return getRumCohortUsersWithHttpInfo(body).getData();
  }

  /**
   * Get rum cohort users.
   *
   * <p>See {@link #getRumCohortUsersWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;GetCohortUsersResponse&gt;
   */
  public CompletableFuture<GetCohortUsersResponse> getRumCohortUsersAsync(
      GetCohortUsersRequest body) {
    return getRumCohortUsersWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get users within a specific cohort for retention analysis
   *
   * @param body (required)
   * @return ApiResponse&lt;GetCohortUsersResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> Successful response with cohort users </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<GetCohortUsersResponse> getRumCohortUsersWithHttpInfo(
      GetCohortUsersRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getRumCohortUsers";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling getRumCohortUsers");
    }
    // create path and map variables
    String localVarPath = "/api/v2/rum/cohort/users";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CohortApi.getRumCohortUsers",
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
        new GenericType<GetCohortUsersResponse>() {});
  }

  /**
   * Get rum cohort users.
   *
   * <p>See {@link #getRumCohortUsersWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;GetCohortUsersResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<GetCohortUsersResponse>> getRumCohortUsersWithHttpInfoAsync(
      GetCohortUsersRequest body) {
    // Check if unstable operation is enabled
    String operationId = "getRumCohortUsers";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<GetCohortUsersResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<GetCohortUsersResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling getRumCohortUsers"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/rum/cohort/users";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CohortApi.getRumCohortUsers",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<GetCohortUsersResponse>> result = new CompletableFuture<>();
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
        new GenericType<GetCohortUsersResponse>() {});
  }
}
