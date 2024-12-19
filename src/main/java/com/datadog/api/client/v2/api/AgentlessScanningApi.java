package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.AwsScanOptionsResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AgentlessScanningApi {
  private ApiClient apiClient;

  public AgentlessScanningApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public AgentlessScanningApi(ApiClient apiClient) {
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
   * Get AWS Scan Options.
   *
   * <p>See {@link #listAwsScanOptionsWithHttpInfo}.
   *
   * @return AwsScanOptionsResponse
   * @throws ApiException if fails to make API call
   */
  public AwsScanOptionsResponse listAwsScanOptions() throws ApiException {
    return listAwsScanOptionsWithHttpInfo().getData();
  }

  /**
   * Get AWS Scan Options.
   *
   * <p>See {@link #listAwsScanOptionsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;AwsScanOptionsResponse&gt;
   */
  public CompletableFuture<AwsScanOptionsResponse> listAwsScanOptionsAsync() {
    return listAwsScanOptionsWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Fetches the scan options configured for AWS accounts.
   *
   * @return ApiResponse&lt;AwsScanOptionsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AwsScanOptionsResponse> listAwsScanOptionsWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/agentless_scanning/accounts/aws";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AgentlessScanningApi.listAwsScanOptions",
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
        new GenericType<AwsScanOptionsResponse>() {});
  }

  /**
   * Get AWS Scan Options.
   *
   * <p>See {@link #listAwsScanOptionsWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;AwsScanOptionsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AwsScanOptionsResponse>>
      listAwsScanOptionsWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/agentless_scanning/accounts/aws";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AgentlessScanningApi.listAwsScanOptions",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AwsScanOptionsResponse>> result = new CompletableFuture<>();
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
        new GenericType<AwsScanOptionsResponse>() {});
  }
}
