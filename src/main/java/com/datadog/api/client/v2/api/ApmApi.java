
package com.datadog.api.client.v2.api;

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
import com.datadog.api.client.v2.model.ServiceList;


@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ApmApi {
  private ApiClient apiClient;
  public ApmApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public ApmApi(ApiClient apiClient) {
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
 * Get service list.
 *
 * See {@link #getServiceListWithHttpInfo}.
 *
 * @param filterEnv Filter services by environment. Can be set to <code>*</code> to return all services across all environments. (required)
 * @return ServiceList
 * @throws ApiException if fails to make API call
 */
  public ServiceList  getServiceList(String filterEnv) throws ApiException {
    return getServiceListWithHttpInfo(filterEnv).getData();
  }

  /**
 * Get service list.
 *
 * See {@link #getServiceListWithHttpInfoAsync}.
 *
 * @param filterEnv Filter services by environment. Can be set to <code>*</code> to return all services across all environments. (required)
 * @return CompletableFuture&lt;ServiceList&gt;
 */
  public CompletableFuture<ServiceList>getServiceListAsync(String filterEnv) {
    return getServiceListWithHttpInfoAsync(filterEnv).thenApply(response -> {
        return response.getData();
    });
  }


  /**

   *
   * @param filterEnv Filter services by environment. Can be set to <code>*</code> to return all services across all environments. (required)
   * @return ApiResponse&lt;ServiceList&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ServiceList> getServiceListWithHttpInfo(String filterEnv) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'filterEnv' is set
    if (filterEnv == null) {
      throw new ApiException(400, "Missing the required parameter 'filterEnv' when calling getServiceList");
    }
    // create path and map variables
    String localVarPath = "/api/v2/apm/services";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[env]", filterEnv));

    Invocation.Builder builder = apiClient.createBuilder("v2.ApmApi.getServiceList", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<ServiceList>() {});
  }

  /**
   * Get service list.
   *
   * See {@link #getServiceListWithHttpInfo}.
   *
   * @param filterEnv Filter services by environment. Can be set to <code>*</code> to return all services across all environments. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ServiceList&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ServiceList>> getServiceListWithHttpInfoAsync(String filterEnv) {
    Object localVarPostBody = null;

    // verify the required parameter 'filterEnv' is set
    if (filterEnv == null) {
        CompletableFuture<ApiResponse<ServiceList>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'filterEnv' when calling getServiceList"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/apm/services";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[env]", filterEnv));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.ApmApi.getServiceList", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ServiceList>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<ServiceList>() {});
  }
}