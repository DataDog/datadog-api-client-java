package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.PupBumpTestResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class PupBumpTestApi {
  private ApiClient apiClient;

  public PupBumpTestApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public PupBumpTestApi(ApiClient apiClient) {
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
   * Get pup bump test resource.
   *
   * <p>See {@link #getPupBumpTestWithHttpInfo}.
   *
   * @return PupBumpTestResponse
   * @throws ApiException if fails to make API call
   */
  public PupBumpTestResponse getPupBumpTest() throws ApiException {
    return getPupBumpTestWithHttpInfo().getData();
  }

  /**
   * Get pup bump test resource.
   *
   * <p>See {@link #getPupBumpTestWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;PupBumpTestResponse&gt;
   */
  public CompletableFuture<PupBumpTestResponse> getPupBumpTestAsync() {
    return getPupBumpTestWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Temporary test-only endpoint used to exercise the pup dependency-bump generation and merge
   * pipeline. Not a real product feature.
   *
   * @return ApiResponse&lt;PupBumpTestResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<PupBumpTestResponse> getPupBumpTestWithHttpInfo() throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getPupBumpTest";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/pup_bump_test";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.PupBumpTestApi.getPupBumpTest",
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
        new GenericType<PupBumpTestResponse>() {});
  }

  /**
   * Get pup bump test resource.
   *
   * <p>See {@link #getPupBumpTestWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;PupBumpTestResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<PupBumpTestResponse>> getPupBumpTestWithHttpInfoAsync() {
    // Check if unstable operation is enabled
    String operationId = "getPupBumpTest";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<PupBumpTestResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/pup_bump_test";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.PupBumpTestApi.getPupBumpTest",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<PupBumpTestResponse>> result = new CompletableFuture<>();
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
        new GenericType<PupBumpTestResponse>() {});
  }
}
