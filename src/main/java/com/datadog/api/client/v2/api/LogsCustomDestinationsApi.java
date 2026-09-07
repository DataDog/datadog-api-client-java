
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
import com.datadog.api.client.v2.model.CustomDestinationsResponse;
import com.datadog.api.client.v2.model.CustomDestinationResponse;
import com.datadog.api.client.v2.model.CustomDestinationCreateRequest;
import com.datadog.api.client.v2.model.CustomDestinationUpdateRequest;


@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogsCustomDestinationsApi {
  private ApiClient apiClient;
  public LogsCustomDestinationsApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public LogsCustomDestinationsApi(ApiClient apiClient) {
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
 * Create a custom destination.
 *
 * See {@link #createLogsCustomDestinationWithHttpInfo}.
 *
 * @param body The definition of the new custom destination. (required)
 * @return CustomDestinationResponse
 * @throws ApiException if fails to make API call
 */
  public CustomDestinationResponse  createLogsCustomDestination(CustomDestinationCreateRequest body) throws ApiException {
    return createLogsCustomDestinationWithHttpInfo(body).getData();
  }

  /**
 * Create a custom destination.
 *
 * See {@link #createLogsCustomDestinationWithHttpInfoAsync}.
 *
 * @param body The definition of the new custom destination. (required)
 * @return CompletableFuture&lt;CustomDestinationResponse&gt;
 */
  public CompletableFuture<CustomDestinationResponse>createLogsCustomDestinationAsync(CustomDestinationCreateRequest body) {
    return createLogsCustomDestinationWithHttpInfoAsync(body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Create a custom destination in your organization.</p>
   *
   * @param body The definition of the new custom destination. (required)
   * @return ApiResponse&lt;CustomDestinationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CustomDestinationResponse> createLogsCustomDestinationWithHttpInfo(CustomDestinationCreateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createLogsCustomDestination");
    }
    // create path and map variables
    String localVarPath = "/api/v2/logs/config/custom-destinations";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.LogsCustomDestinationsApi.createLogsCustomDestination", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<CustomDestinationResponse>() {});
  }

  /**
   * Create a custom destination.
   *
   * See {@link #createLogsCustomDestinationWithHttpInfo}.
   *
   * @param body The definition of the new custom destination. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CustomDestinationResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CustomDestinationResponse>> createLogsCustomDestinationWithHttpInfoAsync(CustomDestinationCreateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<CustomDestinationResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling createLogsCustomDestination"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/logs/config/custom-destinations";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.LogsCustomDestinationsApi.createLogsCustomDestination", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CustomDestinationResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<CustomDestinationResponse>() {});
  }

  /**
 * Delete a custom destination.
 *
 * See {@link #deleteLogsCustomDestinationWithHttpInfo}.
 *
 * @param customDestinationId The ID of the custom destination. (required)
 * @throws ApiException if fails to make API call
 */
  public  void  deleteLogsCustomDestination(String customDestinationId) throws ApiException {
    deleteLogsCustomDestinationWithHttpInfo(customDestinationId);
  }

  /**
 * Delete a custom destination.
 *
 * See {@link #deleteLogsCustomDestinationWithHttpInfoAsync}.
 *
 * @param customDestinationId The ID of the custom destination. (required)
 * @return CompletableFuture
 */
  public CompletableFuture<Void>deleteLogsCustomDestinationAsync(String customDestinationId) {
    return deleteLogsCustomDestinationWithHttpInfoAsync(customDestinationId).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Delete a specific custom destination in your organization.</p>
   *
   * @param customDestinationId The ID of the custom destination. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteLogsCustomDestinationWithHttpInfo(String customDestinationId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'customDestinationId' is set
    if (customDestinationId == null) {
      throw new ApiException(400, "Missing the required parameter 'customDestinationId' when calling deleteLogsCustomDestination");
    }
    // create path and map variables
    String localVarPath = "/api/v2/logs/config/custom-destinations/{custom_destination_id}"
      .replaceAll("\\{" + "custom_destination_id" + "\\}", apiClient.escapeString(customDestinationId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.LogsCustomDestinationsApi.deleteLogsCustomDestination", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("DELETE", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
   * Delete a custom destination.
   *
   * See {@link #deleteLogsCustomDestinationWithHttpInfo}.
   *
   * @param customDestinationId The ID of the custom destination. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteLogsCustomDestinationWithHttpInfoAsync(String customDestinationId) {
    Object localVarPostBody = null;

    // verify the required parameter 'customDestinationId' is set
    if (customDestinationId == null) {
        CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'customDestinationId' when calling deleteLogsCustomDestination"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/logs/config/custom-destinations/{custom_destination_id}"
      .replaceAll("\\{" + "custom_destination_id" + "\\}", apiClient.escapeString(customDestinationId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.LogsCustomDestinationsApi.deleteLogsCustomDestination", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("DELETE", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
 * Get a custom destination.
 *
 * See {@link #getLogsCustomDestinationWithHttpInfo}.
 *
 * @param customDestinationId The ID of the custom destination. (required)
 * @return CustomDestinationResponse
 * @throws ApiException if fails to make API call
 */
  public CustomDestinationResponse  getLogsCustomDestination(String customDestinationId) throws ApiException {
    return getLogsCustomDestinationWithHttpInfo(customDestinationId).getData();
  }

  /**
 * Get a custom destination.
 *
 * See {@link #getLogsCustomDestinationWithHttpInfoAsync}.
 *
 * @param customDestinationId The ID of the custom destination. (required)
 * @return CompletableFuture&lt;CustomDestinationResponse&gt;
 */
  public CompletableFuture<CustomDestinationResponse>getLogsCustomDestinationAsync(String customDestinationId) {
    return getLogsCustomDestinationWithHttpInfoAsync(customDestinationId).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get a specific custom destination in your organization.</p>
   *
   * @param customDestinationId The ID of the custom destination. (required)
   * @return ApiResponse&lt;CustomDestinationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CustomDestinationResponse> getLogsCustomDestinationWithHttpInfo(String customDestinationId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'customDestinationId' is set
    if (customDestinationId == null) {
      throw new ApiException(400, "Missing the required parameter 'customDestinationId' when calling getLogsCustomDestination");
    }
    // create path and map variables
    String localVarPath = "/api/v2/logs/config/custom-destinations/{custom_destination_id}"
      .replaceAll("\\{" + "custom_destination_id" + "\\}", apiClient.escapeString(customDestinationId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.LogsCustomDestinationsApi.getLogsCustomDestination", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<CustomDestinationResponse>() {});
  }

  /**
   * Get a custom destination.
   *
   * See {@link #getLogsCustomDestinationWithHttpInfo}.
   *
   * @param customDestinationId The ID of the custom destination. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CustomDestinationResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CustomDestinationResponse>> getLogsCustomDestinationWithHttpInfoAsync(String customDestinationId) {
    Object localVarPostBody = null;

    // verify the required parameter 'customDestinationId' is set
    if (customDestinationId == null) {
        CompletableFuture<ApiResponse<CustomDestinationResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'customDestinationId' when calling getLogsCustomDestination"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/logs/config/custom-destinations/{custom_destination_id}"
      .replaceAll("\\{" + "custom_destination_id" + "\\}", apiClient.escapeString(customDestinationId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.LogsCustomDestinationsApi.getLogsCustomDestination", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CustomDestinationResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<CustomDestinationResponse>() {});
  }

  /**
 * Get all custom destinations.
 *
 * See {@link #listLogsCustomDestinationsWithHttpInfo}.
 *
 * @return CustomDestinationsResponse
 * @throws ApiException if fails to make API call
 */
  public CustomDestinationsResponse  listLogsCustomDestinations() throws ApiException {
    return listLogsCustomDestinationsWithHttpInfo().getData();
  }

  /**
 * Get all custom destinations.
 *
 * See {@link #listLogsCustomDestinationsWithHttpInfoAsync}.
 *
 * @return CompletableFuture&lt;CustomDestinationsResponse&gt;
 */
  public CompletableFuture<CustomDestinationsResponse>listLogsCustomDestinationsAsync() {
    return listLogsCustomDestinationsWithHttpInfoAsync().thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get the list of configured custom destinations in your organization with their definitions.</p>
   *
   * @return ApiResponse&lt;CustomDestinationsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CustomDestinationsResponse> listLogsCustomDestinationsWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/logs/config/custom-destinations";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.LogsCustomDestinationsApi.listLogsCustomDestinations", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<CustomDestinationsResponse>() {});
  }

  /**
   * Get all custom destinations.
   *
   * See {@link #listLogsCustomDestinationsWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;CustomDestinationsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CustomDestinationsResponse>> listLogsCustomDestinationsWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/logs/config/custom-destinations";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.LogsCustomDestinationsApi.listLogsCustomDestinations", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CustomDestinationsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<CustomDestinationsResponse>() {});
  }

  /**
 * Update a custom destination.
 *
 * See {@link #updateLogsCustomDestinationWithHttpInfo}.
 *
 * @param customDestinationId The ID of the custom destination. (required)
 * @param body New definition of the custom destination's fields. (required)
 * @return CustomDestinationResponse
 * @throws ApiException if fails to make API call
 */
  public CustomDestinationResponse  updateLogsCustomDestination(String customDestinationId, CustomDestinationUpdateRequest body) throws ApiException {
    return updateLogsCustomDestinationWithHttpInfo(customDestinationId, body).getData();
  }

  /**
 * Update a custom destination.
 *
 * See {@link #updateLogsCustomDestinationWithHttpInfoAsync}.
 *
 * @param customDestinationId The ID of the custom destination. (required)
 * @param body New definition of the custom destination's fields. (required)
 * @return CompletableFuture&lt;CustomDestinationResponse&gt;
 */
  public CompletableFuture<CustomDestinationResponse>updateLogsCustomDestinationAsync(String customDestinationId, CustomDestinationUpdateRequest body) {
    return updateLogsCustomDestinationWithHttpInfoAsync(customDestinationId, body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Update the given fields of a specific custom destination in your organization.</p>
   *
   * @param customDestinationId The ID of the custom destination. (required)
   * @param body New definition of the custom destination's fields. (required)
   * @return ApiResponse&lt;CustomDestinationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CustomDestinationResponse> updateLogsCustomDestinationWithHttpInfo(String customDestinationId, CustomDestinationUpdateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'customDestinationId' is set
    if (customDestinationId == null) {
      throw new ApiException(400, "Missing the required parameter 'customDestinationId' when calling updateLogsCustomDestination");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateLogsCustomDestination");
    }
    // create path and map variables
    String localVarPath = "/api/v2/logs/config/custom-destinations/{custom_destination_id}"
      .replaceAll("\\{" + "custom_destination_id" + "\\}", apiClient.escapeString(customDestinationId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.LogsCustomDestinationsApi.updateLogsCustomDestination", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("PATCH", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<CustomDestinationResponse>() {});
  }

  /**
   * Update a custom destination.
   *
   * See {@link #updateLogsCustomDestinationWithHttpInfo}.
   *
   * @param customDestinationId The ID of the custom destination. (required)
   * @param body New definition of the custom destination's fields. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CustomDestinationResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CustomDestinationResponse>> updateLogsCustomDestinationWithHttpInfoAsync(String customDestinationId, CustomDestinationUpdateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'customDestinationId' is set
    if (customDestinationId == null) {
        CompletableFuture<ApiResponse<CustomDestinationResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'customDestinationId' when calling updateLogsCustomDestination"));
        return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<CustomDestinationResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling updateLogsCustomDestination"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/logs/config/custom-destinations/{custom_destination_id}"
      .replaceAll("\\{" + "custom_destination_id" + "\\}", apiClient.escapeString(customDestinationId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.LogsCustomDestinationsApi.updateLogsCustomDestination", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CustomDestinationResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("PATCH", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<CustomDestinationResponse>() {});
  }
}