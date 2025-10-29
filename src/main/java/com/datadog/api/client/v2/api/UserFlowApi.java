package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.SankeyRequest;
import com.datadog.api.client.v2.model.SankeyResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UserFlowApi {
  private ApiClient apiClient;

  public UserFlowApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public UserFlowApi(ApiClient apiClient) {
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
   * Get rum sankey.
   *
   * <p>See {@link #getRumSankeyWithHttpInfo}.
   *
   * @param body (required)
   * @return SankeyResponse
   * @throws ApiException if fails to make API call
   */
  public SankeyResponse getRumSankey(SankeyRequest body) throws ApiException {
    return getRumSankeyWithHttpInfo(body).getData();
  }

  /**
   * Get rum sankey.
   *
   * <p>See {@link #getRumSankeyWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;SankeyResponse&gt;
   */
  public CompletableFuture<SankeyResponse> getRumSankeyAsync(SankeyRequest body) {
    return getRumSankeyWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Generate Sankey diagrams to visualize user flow paths and drop-off points
   *
   * @param body (required)
   * @return ApiResponse&lt;SankeyResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> Successful response with Sankey diagram data </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SankeyResponse> getRumSankeyWithHttpInfo(SankeyRequest body)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getRumSankey";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling getRumSankey");
    }
    // create path and map variables
    String localVarPath = "/api/v2/rum/sankey";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.UserFlowApi.getRumSankey",
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
        new GenericType<SankeyResponse>() {});
  }

  /**
   * Get rum sankey.
   *
   * <p>See {@link #getRumSankeyWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SankeyResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SankeyResponse>> getRumSankeyWithHttpInfoAsync(
      SankeyRequest body) {
    // Check if unstable operation is enabled
    String operationId = "getRumSankey";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<SankeyResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<SankeyResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'body' when calling getRumSankey"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/rum/sankey";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.UserFlowApi.getRumSankey",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SankeyResponse>> result = new CompletableFuture<>();
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
        new GenericType<SankeyResponse>() {});
  }
}
