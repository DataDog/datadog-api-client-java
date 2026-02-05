package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.AssignSeatsUserRequest;
import com.datadog.api.client.v2.model.AssignSeatsUserResponse;
import com.datadog.api.client.v2.model.SeatUserDataArray;
import com.datadog.api.client.v2.model.UnassignSeatsUserRequest;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
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
   * Assign seats to users for a product code.
   *
   * <p>See {@link #assignSeatsUserV2WithHttpInfo}.
   *
   * @param body (required)
   * @return AssignSeatsUserResponse
   * @throws ApiException if fails to make API call
   */
  public AssignSeatsUserResponse assignSeatsUserV2(AssignSeatsUserRequest body)
      throws ApiException {
    return assignSeatsUserV2WithHttpInfo(body).getData();
  }

  /**
   * Assign seats to users for a product code.
   *
   * <p>See {@link #assignSeatsUserV2WithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;AssignSeatsUserResponse&gt;
   */
  public CompletableFuture<AssignSeatsUserResponse> assignSeatsUserV2Async(
      AssignSeatsUserRequest body) {
    return assignSeatsUserV2WithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Assign seats to users for a product code.
   *
   * @param body (required)
   * @return ApiResponse&lt;AssignSeatsUserResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AssignSeatsUserResponse> assignSeatsUserV2WithHttpInfo(
      AssignSeatsUserRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling assignSeatsUserV2");
    }
    // create path and map variables
    String localVarPath = "/api/v2/seats/users";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SeatsApi.assignSeatsUserV2",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<AssignSeatsUserResponse>() {});
  }

  /**
   * Assign seats to users for a product code.
   *
   * <p>See {@link #assignSeatsUserV2WithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AssignSeatsUserResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AssignSeatsUserResponse>> assignSeatsUserV2WithHttpInfoAsync(
      AssignSeatsUserRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<AssignSeatsUserResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling assignSeatsUserV2"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/seats/users";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SeatsApi.assignSeatsUserV2",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AssignSeatsUserResponse>> result = new CompletableFuture<>();
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
        new GenericType<AssignSeatsUserResponse>() {});
  }

  /** Manage optional parameters to getSeatsUsersV2. */
  public static class GetSeatsUsersV2OptionalParameters {
    private Integer pageLimit;
    private String pageCursor;

    /**
     * Set pageLimit.
     *
     * @param pageLimit Maximum number of results to return. (optional)
     * @return GetSeatsUsersV2OptionalParameters
     */
    public GetSeatsUsersV2OptionalParameters pageLimit(Integer pageLimit) {
      this.pageLimit = pageLimit;
      return this;
    }

    /**
     * Set pageCursor.
     *
     * @param pageCursor Cursor for pagination. (optional)
     * @return GetSeatsUsersV2OptionalParameters
     */
    public GetSeatsUsersV2OptionalParameters pageCursor(String pageCursor) {
      this.pageCursor = pageCursor;
      return this;
    }
  }

  /**
   * Get seats users for a product code.
   *
   * <p>See {@link #getSeatsUsersV2WithHttpInfo}.
   *
   * @param productCode The product code for which to retrieve seat users. (required)
   * @return SeatUserDataArray
   * @throws ApiException if fails to make API call
   */
  public SeatUserDataArray getSeatsUsersV2(String productCode) throws ApiException {
    return getSeatsUsersV2WithHttpInfo(productCode, new GetSeatsUsersV2OptionalParameters())
        .getData();
  }

  /**
   * Get seats users for a product code.
   *
   * <p>See {@link #getSeatsUsersV2WithHttpInfoAsync}.
   *
   * @param productCode The product code for which to retrieve seat users. (required)
   * @return CompletableFuture&lt;SeatUserDataArray&gt;
   */
  public CompletableFuture<SeatUserDataArray> getSeatsUsersV2Async(String productCode) {
    return getSeatsUsersV2WithHttpInfoAsync(productCode, new GetSeatsUsersV2OptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get seats users for a product code.
   *
   * <p>See {@link #getSeatsUsersV2WithHttpInfo}.
   *
   * @param productCode The product code for which to retrieve seat users. (required)
   * @param parameters Optional parameters for the request.
   * @return SeatUserDataArray
   * @throws ApiException if fails to make API call
   */
  public SeatUserDataArray getSeatsUsersV2(
      String productCode, GetSeatsUsersV2OptionalParameters parameters) throws ApiException {
    return getSeatsUsersV2WithHttpInfo(productCode, parameters).getData();
  }

  /**
   * Get seats users for a product code.
   *
   * <p>See {@link #getSeatsUsersV2WithHttpInfoAsync}.
   *
   * @param productCode The product code for which to retrieve seat users. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;SeatUserDataArray&gt;
   */
  public CompletableFuture<SeatUserDataArray> getSeatsUsersV2Async(
      String productCode, GetSeatsUsersV2OptionalParameters parameters) {
    return getSeatsUsersV2WithHttpInfoAsync(productCode, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the list of seats users assigned to a product code.
   *
   * @param productCode The product code for which to retrieve seat users. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;SeatUserDataArray&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SeatUserDataArray> getSeatsUsersV2WithHttpInfo(
      String productCode, GetSeatsUsersV2OptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'productCode' is set
    if (productCode == null) {
      throw new ApiException(
          400, "Missing the required parameter 'productCode' when calling getSeatsUsersV2");
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

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SeatsApi.getSeatsUsersV2",
            localVarPath,
            localVarQueryParams,
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
        new GenericType<SeatUserDataArray>() {});
  }

  /**
   * Get seats users for a product code.
   *
   * <p>See {@link #getSeatsUsersV2WithHttpInfo}.
   *
   * @param productCode The product code for which to retrieve seat users. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;SeatUserDataArray&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SeatUserDataArray>> getSeatsUsersV2WithHttpInfoAsync(
      String productCode, GetSeatsUsersV2OptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'productCode' is set
    if (productCode == null) {
      CompletableFuture<ApiResponse<SeatUserDataArray>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'productCode' when calling getSeatsUsersV2"));
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
      builder =
          apiClient.createBuilder(
              "v2.SeatsApi.getSeatsUsersV2",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SeatUserDataArray>> result = new CompletableFuture<>();
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
        new GenericType<SeatUserDataArray>() {});
  }

  /**
   * Unassign seats from users for a product code.
   *
   * <p>See {@link #unassignSeatsUserV2WithHttpInfo}.
   *
   * @param body (required)
   * @throws ApiException if fails to make API call
   */
  public void unassignSeatsUserV2(UnassignSeatsUserRequest body) throws ApiException {
    unassignSeatsUserV2WithHttpInfo(body);
  }

  /**
   * Unassign seats from users for a product code.
   *
   * <p>See {@link #unassignSeatsUserV2WithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> unassignSeatsUserV2Async(UnassignSeatsUserRequest body) {
    return unassignSeatsUserV2WithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Unassign seats from users for a product code.
   *
   * @param body (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> unassignSeatsUserV2WithHttpInfo(UnassignSeatsUserRequest body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling unassignSeatsUserV2");
    }
    // create path and map variables
    String localVarPath = "/api/v2/seats/users";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SeatsApi.unassignSeatsUserV2",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Unassign seats from users for a product code.
   *
   * <p>See {@link #unassignSeatsUserV2WithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> unassignSeatsUserV2WithHttpInfoAsync(
      UnassignSeatsUserRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling unassignSeatsUserV2"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/seats/users";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SeatsApi.unassignSeatsUserV2",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"*/*"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }
}
