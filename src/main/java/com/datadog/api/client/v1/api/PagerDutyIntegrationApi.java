
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
import com.datadog.api.client.v1.model.PagerDutyServiceName;
import com.datadog.api.client.v1.model.PagerDutyService;
import com.datadog.api.client.v1.model.PagerDutyServiceKey;


@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class PagerDutyIntegrationApi {
  private ApiClient apiClient;
  public PagerDutyIntegrationApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public PagerDutyIntegrationApi(ApiClient apiClient) {
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
 * Create a new service object.
 *
 * See {@link #createPagerDutyIntegrationServiceWithHttpInfo}.
 *
 * @param body Create a new service object request body. (required)
 * @return PagerDutyServiceName
 * @throws ApiException if fails to make API call
 */
  public PagerDutyServiceName  createPagerDutyIntegrationService(PagerDutyService body) throws ApiException {
    return createPagerDutyIntegrationServiceWithHttpInfo(body).getData();
  }

  /**
 * Create a new service object.
 *
 * See {@link #createPagerDutyIntegrationServiceWithHttpInfoAsync}.
 *
 * @param body Create a new service object request body. (required)
 * @return CompletableFuture&lt;PagerDutyServiceName&gt;
 */
  public CompletableFuture<PagerDutyServiceName>createPagerDutyIntegrationServiceAsync(PagerDutyService body) {
    return createPagerDutyIntegrationServiceWithHttpInfoAsync(body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Create a new service object in the PagerDuty integration.</p>
   *
   * @param body Create a new service object request body. (required)
   * @return ApiResponse&lt;PagerDutyServiceName&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<PagerDutyServiceName> createPagerDutyIntegrationServiceWithHttpInfo(PagerDutyService body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createPagerDutyIntegrationService");
    }
    // create path and map variables
    String localVarPath = "/api/v1/integration/pagerduty/configuration/services";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v1.PagerDutyIntegrationApi.createPagerDutyIntegrationService", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<PagerDutyServiceName>() {});
  }

  /**
   * Create a new service object.
   *
   * See {@link #createPagerDutyIntegrationServiceWithHttpInfo}.
   *
   * @param body Create a new service object request body. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;PagerDutyServiceName&gt;&gt;
   */
  public CompletableFuture<ApiResponse<PagerDutyServiceName>> createPagerDutyIntegrationServiceWithHttpInfoAsync(PagerDutyService body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<PagerDutyServiceName>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling createPagerDutyIntegrationService"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/integration/pagerduty/configuration/services";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v1.PagerDutyIntegrationApi.createPagerDutyIntegrationService", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<PagerDutyServiceName>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<PagerDutyServiceName>() {});
  }

  /**
 * Delete a single service object.
 *
 * See {@link #deletePagerDutyIntegrationServiceWithHttpInfo}.
 *
 * @param serviceName The service name (required)
 * @throws ApiException if fails to make API call
 */
  public  void  deletePagerDutyIntegrationService(String serviceName) throws ApiException {
    deletePagerDutyIntegrationServiceWithHttpInfo(serviceName);
  }

  /**
 * Delete a single service object.
 *
 * See {@link #deletePagerDutyIntegrationServiceWithHttpInfoAsync}.
 *
 * @param serviceName The service name (required)
 * @return CompletableFuture
 */
  public CompletableFuture<Void>deletePagerDutyIntegrationServiceAsync(String serviceName) {
    return deletePagerDutyIntegrationServiceWithHttpInfoAsync(serviceName).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Delete a single service object in the Datadog-PagerDuty integration.</p>
   *
   * @param serviceName The service name (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Item Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deletePagerDutyIntegrationServiceWithHttpInfo(String serviceName) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'serviceName' is set
    if (serviceName == null) {
      throw new ApiException(400, "Missing the required parameter 'serviceName' when calling deletePagerDutyIntegrationService");
    }
    // create path and map variables
    String localVarPath = "/api/v1/integration/pagerduty/configuration/services/{service_name}"
      .replaceAll("\\{" + "service_name" + "\\}", apiClient.escapeString(serviceName.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v1.PagerDutyIntegrationApi.deletePagerDutyIntegrationService", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("DELETE", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
   * Delete a single service object.
   *
   * See {@link #deletePagerDutyIntegrationServiceWithHttpInfo}.
   *
   * @param serviceName The service name (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deletePagerDutyIntegrationServiceWithHttpInfoAsync(String serviceName) {
    Object localVarPostBody = null;

    // verify the required parameter 'serviceName' is set
    if (serviceName == null) {
        CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'serviceName' when calling deletePagerDutyIntegrationService"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/integration/pagerduty/configuration/services/{service_name}"
      .replaceAll("\\{" + "service_name" + "\\}", apiClient.escapeString(serviceName.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v1.PagerDutyIntegrationApi.deletePagerDutyIntegrationService", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("DELETE", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
 * Get a single service object.
 *
 * See {@link #getPagerDutyIntegrationServiceWithHttpInfo}.
 *
 * @param serviceName The service name. (required)
 * @return PagerDutyServiceName
 * @throws ApiException if fails to make API call
 */
  public PagerDutyServiceName  getPagerDutyIntegrationService(String serviceName) throws ApiException {
    return getPagerDutyIntegrationServiceWithHttpInfo(serviceName).getData();
  }

  /**
 * Get a single service object.
 *
 * See {@link #getPagerDutyIntegrationServiceWithHttpInfoAsync}.
 *
 * @param serviceName The service name. (required)
 * @return CompletableFuture&lt;PagerDutyServiceName&gt;
 */
  public CompletableFuture<PagerDutyServiceName>getPagerDutyIntegrationServiceAsync(String serviceName) {
    return getPagerDutyIntegrationServiceWithHttpInfoAsync(serviceName).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get service name in the Datadog-PagerDuty integration.</p>
   *
   * @param serviceName The service name. (required)
   * @return ApiResponse&lt;PagerDutyServiceName&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Item Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<PagerDutyServiceName> getPagerDutyIntegrationServiceWithHttpInfo(String serviceName) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'serviceName' is set
    if (serviceName == null) {
      throw new ApiException(400, "Missing the required parameter 'serviceName' when calling getPagerDutyIntegrationService");
    }
    // create path and map variables
    String localVarPath = "/api/v1/integration/pagerduty/configuration/services/{service_name}"
      .replaceAll("\\{" + "service_name" + "\\}", apiClient.escapeString(serviceName.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v1.PagerDutyIntegrationApi.getPagerDutyIntegrationService", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<PagerDutyServiceName>() {});
  }

  /**
   * Get a single service object.
   *
   * See {@link #getPagerDutyIntegrationServiceWithHttpInfo}.
   *
   * @param serviceName The service name. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;PagerDutyServiceName&gt;&gt;
   */
  public CompletableFuture<ApiResponse<PagerDutyServiceName>> getPagerDutyIntegrationServiceWithHttpInfoAsync(String serviceName) {
    Object localVarPostBody = null;

    // verify the required parameter 'serviceName' is set
    if (serviceName == null) {
        CompletableFuture<ApiResponse<PagerDutyServiceName>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'serviceName' when calling getPagerDutyIntegrationService"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/integration/pagerduty/configuration/services/{service_name}"
      .replaceAll("\\{" + "service_name" + "\\}", apiClient.escapeString(serviceName.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v1.PagerDutyIntegrationApi.getPagerDutyIntegrationService", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<PagerDutyServiceName>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<PagerDutyServiceName>() {});
  }

  /**
 * Update a single service object.
 *
 * See {@link #updatePagerDutyIntegrationServiceWithHttpInfo}.
 *
 * @param serviceName The service name (required)
 * @param body Update an existing service object request body. (required)
 * @throws ApiException if fails to make API call
 */
  public  void  updatePagerDutyIntegrationService(String serviceName, PagerDutyServiceKey body) throws ApiException {
    updatePagerDutyIntegrationServiceWithHttpInfo(serviceName, body);
  }

  /**
 * Update a single service object.
 *
 * See {@link #updatePagerDutyIntegrationServiceWithHttpInfoAsync}.
 *
 * @param serviceName The service name (required)
 * @param body Update an existing service object request body. (required)
 * @return CompletableFuture
 */
  public CompletableFuture<Void>updatePagerDutyIntegrationServiceAsync(String serviceName, PagerDutyServiceKey body) {
    return updatePagerDutyIntegrationServiceWithHttpInfoAsync(serviceName, body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Update a single service object in the Datadog-PagerDuty integration.</p>
   *
   * @param serviceName The service name (required)
   * @param body Update an existing service object request body. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Item Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> updatePagerDutyIntegrationServiceWithHttpInfo(String serviceName, PagerDutyServiceKey body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'serviceName' is set
    if (serviceName == null) {
      throw new ApiException(400, "Missing the required parameter 'serviceName' when calling updatePagerDutyIntegrationService");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updatePagerDutyIntegrationService");
    }
    // create path and map variables
    String localVarPath = "/api/v1/integration/pagerduty/configuration/services/{service_name}"
      .replaceAll("\\{" + "service_name" + "\\}", apiClient.escapeString(serviceName.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v1.PagerDutyIntegrationApi.updatePagerDutyIntegrationService", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("PUT", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
   * Update a single service object.
   *
   * See {@link #updatePagerDutyIntegrationServiceWithHttpInfo}.
   *
   * @param serviceName The service name (required)
   * @param body Update an existing service object request body. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> updatePagerDutyIntegrationServiceWithHttpInfoAsync(String serviceName, PagerDutyServiceKey body) {
    Object localVarPostBody = body;

    // verify the required parameter 'serviceName' is set
    if (serviceName == null) {
        CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'serviceName' when calling updatePagerDutyIntegrationService"));
        return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling updatePagerDutyIntegrationService"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/integration/pagerduty/configuration/services/{service_name}"
      .replaceAll("\\{" + "service_name" + "\\}", apiClient.escapeString(serviceName.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v1.PagerDutyIntegrationApi.updatePagerDutyIntegrationService", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("PUT", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }
}