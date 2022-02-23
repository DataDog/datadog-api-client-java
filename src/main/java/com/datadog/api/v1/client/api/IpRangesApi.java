package com.datadog.api.v1.client.api;

import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.ApiResponse;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.Pair;
import com.datadog.api.v1.client.model.IPRanges;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.core.GenericType;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IpRangesApi {
  private ApiClient apiClient;

  public IpRangesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public IpRangesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get the API client
   *
   * @return API client
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * Set the API client
   *
   * @param apiClient an instance of API client
   */
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * List IP Ranges
   *
   * <p>See {@link #getIPRangesWithHttpInfo}.
   *
   * @return IPRanges
   * @throws ApiException if fails to make API call
   */
  public IPRanges getIPRanges() throws ApiException {
    return getIPRangesWithHttpInfo().getData();
  }

  /**
   * List IP Ranges
   *
   * <p>See {@link #getIPRangesWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;IPRanges&gt;
   */
  public CompletableFuture<IPRanges> getIPRangesAsync() {
    return getIPRangesWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List IP Ranges
   *
   * <p>Get information about Datadog IP ranges.
   *
   * @return ApiResponse&lt;IPRanges&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<IPRanges> getIPRangesWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "IpRangesApi.getIPRanges",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<IPRanges>() {});
  }

  /**
   * List IP Ranges
   *
   * <p>See {@link #getIPRangesWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;IPRanges&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IPRanges>> getIPRangesWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getIPRanges");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "IpRangesApi.getIPRanges",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IPRanges>> result = new CompletableFuture<>();
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
        new GenericType<IPRanges>() {});
  }
}
