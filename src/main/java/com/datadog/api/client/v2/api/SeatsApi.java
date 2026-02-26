
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
import com.datadog.api.client.v2.model.UnassignSeatsUserRequest;
import com.datadog.api.client.v2.model.SeatUserDataArray;
import com.datadog.api.client.v2.model.AssignSeatsUserResponse;
import com.datadog.api.client.v2.model.AssignSeatsUserRequest;


@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SeatsApi {
  private ApiClient apiClient;
  public SeatsApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public SeatsApi(ApiClient apiClient) {
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
 * Assign seats to users.
 *
 * See {@link #assignSeatsUserWithHttpInfo}.
 *
 * @param body  (required)
 * @return AssignSeatsUserResponse
 * @throws ApiException if fails to make API call
 */
  public AssignSeatsUserResponse  assignSeatsUser(AssignSeatsUserRequest body) throws ApiException {
    return assignSeatsUserWithHttpInfo(body).getData();
  }

  /**
 * Assign seats to users.
 *
 * See {@link #assignSeatsUserWithHttpInfoAsync}.
 *
 * @param body  (required)
 * @return CompletableFuture&lt;AssignSeatsUserResponse&gt;
 */
  public CompletableFuture<AssignSeatsUserResponse>assignSeatsUserAsync(AssignSeatsUserRequest body) {
    return assignSeatsUserWithHttpInfoAsync(body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Assign seats to users for a product code.</p>
   *
   * @param body  (required)
   * @return ApiResponse&lt;AssignSeatsUserResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AssignSeatsUserResponse> assignSeatsUserWithHttpInfo(AssignSeatsUserRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling assignSeatsUser");
    }
    // create path and map variables
    String localVarPath = "/api/v2/seats/users";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.SeatsApi.assignSeatsUser", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<AssignSeatsUserResponse>() {});
  }

  /**
   * Assign seats to users.
   *
   * See {@link #assignSeatsUserWithHttpInfo}.
   *
   * @param body  (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AssignSeatsUserResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AssignSeatsUserResponse>> assignSeatsUserWithHttpInfoAsync(AssignSeatsUserRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<AssignSeatsUserResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling assignSeatsUser"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/seats/users";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.SeatsApi.assignSeatsUser", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AssignSeatsUserResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<AssignSeatsUserResponse>() {});
  }

  /**
   * Manage optional parameters to getSeatsUsers.
   */
  public static class GetSeatsUsersOptionalParameters {
    private Integer pageLimit;
    private String pageCursor;

    /**
     * Set pageLimit.
     * @param pageLimit Maximum number of results to return. (optional)
     * @return GetSeatsUsersOptionalParameters
     */
    public GetSeatsUsersOptionalParameters pageLimit(Integer pageLimit) {
      this.pageLimit = pageLimit;
      return this;
    }

    /**
     * Set pageCursor.
     * @param pageCursor Cursor for pagination. (optional)
     * @return GetSeatsUsersOptionalParameters
     */
    public GetSeatsUsersOptionalParameters pageCursor(String pageCursor) {
      this.pageCursor = pageCursor;
      return this;
    }
  }

  /**
 * Get users with seats.
 *
 * See {@link #getSeatsUsersWithHttpInfo}.
 *
 * @param productCode The product code for which to retrieve seat users. (required)
 * @return SeatUserDataArray
 * @throws ApiException if fails to make API call
 */
  public SeatUserDataArray getSeatsUsers (String productCode) throws ApiException {
    return getSeatsUsersWithHttpInfo( productCode, new GetSeatsUsersOptionalParameters()).getData();
  }

  /**
 * Get users with seats.
 *
 * See {@link #getSeatsUsersWithHttpInfoAsync}.
 *
 * @param productCode The product code for which to retrieve seat users. (required)
 * @return CompletableFuture&lt;SeatUserDataArray&gt;
 */
  public CompletableFuture<SeatUserDataArray>getSeatsUsersAsync(String productCode) {
    return getSeatsUsersWithHttpInfoAsync(productCode, new GetSeatsUsersOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * Get users with seats.
 *
 * See {@link #getSeatsUsersWithHttpInfo}.
 *
 * @param productCode The product code for which to retrieve seat users. (required)
 * @param parameters Optional parameters for the request.
 * @return SeatUserDataArray
 * @throws ApiException if fails to make API call
 */
  public SeatUserDataArray getSeatsUsers(String productCode, GetSeatsUsersOptionalParameters parameters) throws ApiException {
    return getSeatsUsersWithHttpInfo(productCode, parameters).getData();
  }

  /**
 * Get users with seats.
 *
 * See {@link #getSeatsUsersWithHttpInfoAsync}.
 *
 * @param productCode The product code for which to retrieve seat users. (required)
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;SeatUserDataArray&gt;
 */
  public CompletableFuture<SeatUserDataArray>getSeatsUsersAsync( String productCode, GetSeatsUsersOptionalParameters parameters) {
    return getSeatsUsersWithHttpInfoAsync(productCode, parameters).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get the list of users assigned seats for a product code.</p>
   *
   * @param productCode The product code for which to retrieve seat users. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;SeatUserDataArray&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SeatUserDataArray> getSeatsUsersWithHttpInfo(String productCode, GetSeatsUsersOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'productCode' is set
    if (productCode == null) {
      throw new ApiException(400, "Missing the required parameter 'productCode' when calling getSeatsUsers");
    }
    Integer pageLimit = parameters.pageLimit;
    String pageCursor = parameters.pageCursor;
    // create path and map variables
    String localVarPath = "/api/v2/seats/users";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "product_code", productCode));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[cursor]", pageCursor));

    Invocation.Builder builder = apiClient.createBuilder("v2.SeatsApi.getSeatsUsers", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SeatUserDataArray>() {});
  }

  /**
   * Get users with seats.
   *
   * See {@link #getSeatsUsersWithHttpInfo}.
   *
   * @param productCode The product code for which to retrieve seat users. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;SeatUserDataArray&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SeatUserDataArray>> getSeatsUsersWithHttpInfoAsync(String productCode, GetSeatsUsersOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'productCode' is set
    if (productCode == null) {
        CompletableFuture<ApiResponse<SeatUserDataArray>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'productCode' when calling getSeatsUsers"));
        return result;
    }
    Integer pageLimit = parameters.pageLimit;
    String pageCursor = parameters.pageCursor;
    // create path and map variables
    String localVarPath = "/api/v2/seats/users";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "product_code", productCode));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[cursor]", pageCursor));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.SeatsApi.getSeatsUsers", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SeatUserDataArray>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SeatUserDataArray>() {});
  }

  /**
 * Unassign seats from users.
 *
 * See {@link #unassignSeatsUserWithHttpInfo}.
 *
 * @param body  (required)
 * @throws ApiException if fails to make API call
 */
  public  void  unassignSeatsUser(UnassignSeatsUserRequest body) throws ApiException {
    unassignSeatsUserWithHttpInfo(body);
  }

  /**
 * Unassign seats from users.
 *
 * See {@link #unassignSeatsUserWithHttpInfoAsync}.
 *
 * @param body  (required)
 * @return CompletableFuture
 */
  public CompletableFuture<Void>unassignSeatsUserAsync(UnassignSeatsUserRequest body) {
    return unassignSeatsUserWithHttpInfoAsync(body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Unassign seats from users for a product code.</p>
   *
   * @param body  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> unassignSeatsUserWithHttpInfo(UnassignSeatsUserRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling unassignSeatsUser");
    }
    // create path and map variables
    String localVarPath = "/api/v2/seats/users";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.SeatsApi.unassignSeatsUser", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("DELETE", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
   * Unassign seats from users.
   *
   * See {@link #unassignSeatsUserWithHttpInfo}.
   *
   * @param body  (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> unassignSeatsUserWithHttpInfoAsync(UnassignSeatsUserRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling unassignSeatsUser"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/seats/users";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.SeatsApi.unassignSeatsUser", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("DELETE", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }
}