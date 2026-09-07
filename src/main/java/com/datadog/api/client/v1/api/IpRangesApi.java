
package com.datadog.api.client.v1.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.PaginationIterable;

import jakarta.ws.rs.core.GenericType;
import jakarta.ws.rs.client.Invocation;

import java.io.File;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.concurrent.CompletableFuture;
import java.time.OffsetDateTime;
import java.util.UUID;
import com.datadog.api.client.v1.model.IPRanges;


@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IpRangesApi {
  private ApiClient apiClient;
  public IpRangesApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public IpRangesApi(ApiClient apiClient) {
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
 * List IP Ranges.
 *
 * See {@link #getIPRangesWithHttpInfo}.
 *
 * @return IPRanges
 * @throws ApiException if fails to make API call
 */
  public IPRanges  getIPRanges() throws ApiException {
    return getIPRangesWithHttpInfo().getData();
  }

  /**
 * List IP Ranges.
 *
 * See {@link #getIPRangesWithHttpInfoAsync}.
 *
 * @return CompletableFuture&lt;IPRanges&gt;
 */
  public CompletableFuture<IPRanges>getIPRangesAsync() {
    return getIPRangesWithHttpInfoAsync().thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get information about Datadog IP ranges.</p>
   *
   * @return ApiResponse&lt;IPRanges&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
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


    Invocation.Builder builder = apiClient.createBuilder("v1.IpRangesApi.getIPRanges", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] {  });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<IPRanges>() {});
  }

  /**
   * List IP Ranges.
   *
   * See {@link #getIPRangesWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;IPRanges&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IPRanges>> getIPRangesWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v1.IpRangesApi.getIPRanges", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] {  });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IPRanges>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<IPRanges>() {});
  }
}