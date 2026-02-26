package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.PaginationIterable;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.ListPowerpacksResponse;
import com.datadog.api.client.v2.model.Powerpack;
import com.datadog.api.client.v2.model.PowerpackData;
import com.datadog.api.client.v2.model.PowerpackResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class PowerpackApi {
  private ApiClient apiClient;

  public PowerpackApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public PowerpackApi(ApiClient apiClient) {
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
   * Create a new powerpack.
   *
   * <p>See {@link #createPowerpackWithHttpInfo}.
   *
   * @param body Create a powerpack request body. (required)
   * @return PowerpackResponse
   * @throws ApiException if fails to make API call
   */
  public PowerpackResponse createPowerpack(Powerpack body) throws ApiException {
    return createPowerpackWithHttpInfo(body).getData();
  }

  /**
   * Create a new powerpack.
   *
   * <p>See {@link #createPowerpackWithHttpInfoAsync}.
   *
   * @param body Create a powerpack request body. (required)
   * @return CompletableFuture&lt;PowerpackResponse&gt;
   */
  public CompletableFuture<PowerpackResponse> createPowerpackAsync(Powerpack body) {
    return createPowerpackWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a powerpack.
   *
   * @param body Create a powerpack request body. (required)
   * @return ApiResponse&lt;PowerpackResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<PowerpackResponse> createPowerpackWithHttpInfo(Powerpack body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createPowerpack");
    }
    // create path and map variables
    String localVarPath = "/api/v2/powerpacks";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.PowerpackApi.createPowerpack",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<PowerpackResponse>() {});
  }

  /**
   * Create a new powerpack.
   *
   * <p>See {@link #createPowerpackWithHttpInfo}.
   *
   * @param body Create a powerpack request body. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;PowerpackResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<PowerpackResponse>> createPowerpackWithHttpInfoAsync(
      Powerpack body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<PowerpackResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createPowerpack"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/powerpacks";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.PowerpackApi.createPowerpack",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<PowerpackResponse>> result = new CompletableFuture<>();
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
        new GenericType<PowerpackResponse>() {});
  }

  /**
   * Delete a powerpack.
   *
   * <p>See {@link #deletePowerpackWithHttpInfo}.
   *
   * @param powerpackId Powerpack id (required)
   * @throws ApiException if fails to make API call
   */
  public void deletePowerpack(String powerpackId) throws ApiException {
    deletePowerpackWithHttpInfo(powerpackId);
  }

  /**
   * Delete a powerpack.
   *
   * <p>See {@link #deletePowerpackWithHttpInfoAsync}.
   *
   * @param powerpackId Powerpack id (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deletePowerpackAsync(String powerpackId) {
    return deletePowerpackWithHttpInfoAsync(powerpackId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete a powerpack.
   *
   * @param powerpackId Powerpack id (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Powerpack Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deletePowerpackWithHttpInfo(String powerpackId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'powerpackId' is set
    if (powerpackId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'powerpackId' when calling deletePowerpack");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/powerpacks/{powerpack_id}"
            .replaceAll(
                "\\{" + "powerpack_id" + "\\}", apiClient.escapeString(powerpackId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.PowerpackApi.deletePowerpack",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Delete a powerpack.
   *
   * <p>See {@link #deletePowerpackWithHttpInfo}.
   *
   * @param powerpackId Powerpack id (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deletePowerpackWithHttpInfoAsync(String powerpackId) {
    Object localVarPostBody = null;

    // verify the required parameter 'powerpackId' is set
    if (powerpackId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'powerpackId' when calling deletePowerpack"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/powerpacks/{powerpack_id}"
            .replaceAll(
                "\\{" + "powerpack_id" + "\\}", apiClient.escapeString(powerpackId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.PowerpackApi.deletePowerpack",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"*/*"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Get a Powerpack.
   *
   * <p>See {@link #getPowerpackWithHttpInfo}.
   *
   * @param powerpackId ID of the powerpack. (required)
   * @return PowerpackResponse
   * @throws ApiException if fails to make API call
   */
  public PowerpackResponse getPowerpack(String powerpackId) throws ApiException {
    return getPowerpackWithHttpInfo(powerpackId).getData();
  }

  /**
   * Get a Powerpack.
   *
   * <p>See {@link #getPowerpackWithHttpInfoAsync}.
   *
   * @param powerpackId ID of the powerpack. (required)
   * @return CompletableFuture&lt;PowerpackResponse&gt;
   */
  public CompletableFuture<PowerpackResponse> getPowerpackAsync(String powerpackId) {
    return getPowerpackWithHttpInfoAsync(powerpackId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a powerpack.
   *
   * @param powerpackId ID of the powerpack. (required)
   * @return ApiResponse&lt;PowerpackResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Powerpack Not Found. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<PowerpackResponse> getPowerpackWithHttpInfo(String powerpackId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'powerpackId' is set
    if (powerpackId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'powerpackId' when calling getPowerpack");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/powerpacks/{powerpack_id}"
            .replaceAll(
                "\\{" + "powerpack_id" + "\\}", apiClient.escapeString(powerpackId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.PowerpackApi.getPowerpack",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<PowerpackResponse>() {});
  }

  /**
   * Get a Powerpack.
   *
   * <p>See {@link #getPowerpackWithHttpInfo}.
   *
   * @param powerpackId ID of the powerpack. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;PowerpackResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<PowerpackResponse>> getPowerpackWithHttpInfoAsync(
      String powerpackId) {
    Object localVarPostBody = null;

    // verify the required parameter 'powerpackId' is set
    if (powerpackId == null) {
      CompletableFuture<ApiResponse<PowerpackResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'powerpackId' when calling getPowerpack"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/powerpacks/{powerpack_id}"
            .replaceAll(
                "\\{" + "powerpack_id" + "\\}", apiClient.escapeString(powerpackId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.PowerpackApi.getPowerpack",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<PowerpackResponse>> result = new CompletableFuture<>();
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
        new GenericType<PowerpackResponse>() {});
  }

  /** Manage optional parameters to listPowerpacks. */
  public static class ListPowerpacksOptionalParameters {
    private Long pageLimit;
    private Long pageOffset;

    /**
     * Set pageLimit.
     *
     * @param pageLimit Maximum number of powerpacks in the response. (optional, default to 25)
     * @return ListPowerpacksOptionalParameters
     */
    public ListPowerpacksOptionalParameters pageLimit(Long pageLimit) {
      this.pageLimit = pageLimit;
      return this;
    }

    /**
     * Set pageOffset.
     *
     * @param pageOffset Specific offset to use as the beginning of the returned page. (optional,
     *     default to 0)
     * @return ListPowerpacksOptionalParameters
     */
    public ListPowerpacksOptionalParameters pageOffset(Long pageOffset) {
      this.pageOffset = pageOffset;
      return this;
    }
  }

  /**
   * Get all powerpacks.
   *
   * <p>See {@link #listPowerpacksWithHttpInfo}.
   *
   * @return ListPowerpacksResponse
   * @throws ApiException if fails to make API call
   */
  public ListPowerpacksResponse listPowerpacks() throws ApiException {
    return listPowerpacksWithHttpInfo(new ListPowerpacksOptionalParameters()).getData();
  }

  /**
   * Get all powerpacks.
   *
   * <p>See {@link #listPowerpacksWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;ListPowerpacksResponse&gt;
   */
  public CompletableFuture<ListPowerpacksResponse> listPowerpacksAsync() {
    return listPowerpacksWithHttpInfoAsync(new ListPowerpacksOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get all powerpacks.
   *
   * <p>See {@link #listPowerpacksWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return ListPowerpacksResponse
   * @throws ApiException if fails to make API call
   */
  public ListPowerpacksResponse listPowerpacks(ListPowerpacksOptionalParameters parameters)
      throws ApiException {
    return listPowerpacksWithHttpInfo(parameters).getData();
  }

  /**
   * Get all powerpacks.
   *
   * <p>See {@link #listPowerpacksWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ListPowerpacksResponse&gt;
   */
  public CompletableFuture<ListPowerpacksResponse> listPowerpacksAsync(
      ListPowerpacksOptionalParameters parameters) {
    return listPowerpacksWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get all powerpacks.
   *
   * <p>See {@link #listPowerpacksWithHttpInfo}.
   *
   * @return PaginationIterable&lt;PowerpackData&gt;
   */
  public PaginationIterable<PowerpackData> listPowerpacksWithPagination() {
    ListPowerpacksOptionalParameters parameters = new ListPowerpacksOptionalParameters();
    return listPowerpacksWithPagination(parameters);
  }

  /**
   * Get all powerpacks.
   *
   * <p>See {@link #listPowerpacksWithHttpInfo}.
   *
   * @return ListPowerpacksResponse
   */
  public PaginationIterable<PowerpackData> listPowerpacksWithPagination(
      ListPowerpacksOptionalParameters parameters) {
    String resultsPath = "getData";
    String valueGetterPath = "";
    String valueSetterPath = "pageOffset";
    Boolean valueSetterParamOptional = true;
    Long limit;

    if (parameters.pageLimit == null) {
      limit = 25l;
      parameters.pageLimit(limit);
    } else {
      limit = parameters.pageLimit;
    }

    LinkedHashMap<String, Object> args = new LinkedHashMap<String, Object>();
    args.put("optionalParams", parameters);

    PaginationIterable iterator =
        new PaginationIterable(
            this,
            "listPowerpacks",
            resultsPath,
            valueGetterPath,
            valueSetterPath,
            valueSetterParamOptional,
            true,
            limit,
            args);

    return iterator;
  }

  /**
   * Get a list of all powerpacks.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;ListPowerpacksResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ListPowerpacksResponse> listPowerpacksWithHttpInfo(
      ListPowerpacksOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    Long pageLimit = parameters.pageLimit;
    Long pageOffset = parameters.pageOffset;
    // create path and map variables
    String localVarPath = "/api/v2/powerpacks";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[offset]", pageOffset));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.PowerpackApi.listPowerpacks",
            localVarPath,
            localVarQueryParams,
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<ListPowerpacksResponse>() {});
  }

  /**
   * Get all powerpacks.
   *
   * <p>See {@link #listPowerpacksWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;ListPowerpacksResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ListPowerpacksResponse>> listPowerpacksWithHttpInfoAsync(
      ListPowerpacksOptionalParameters parameters) {
    Object localVarPostBody = null;
    Long pageLimit = parameters.pageLimit;
    Long pageOffset = parameters.pageOffset;
    // create path and map variables
    String localVarPath = "/api/v2/powerpacks";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[offset]", pageOffset));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.PowerpackApi.listPowerpacks",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ListPowerpacksResponse>> result = new CompletableFuture<>();
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
        new GenericType<ListPowerpacksResponse>() {});
  }

  /**
   * Update a powerpack.
   *
   * <p>See {@link #updatePowerpackWithHttpInfo}.
   *
   * @param powerpackId ID of the powerpack. (required)
   * @param body Update a powerpack request body. (required)
   * @return PowerpackResponse
   * @throws ApiException if fails to make API call
   */
  public PowerpackResponse updatePowerpack(String powerpackId, Powerpack body) throws ApiException {
    return updatePowerpackWithHttpInfo(powerpackId, body).getData();
  }

  /**
   * Update a powerpack.
   *
   * <p>See {@link #updatePowerpackWithHttpInfoAsync}.
   *
   * @param powerpackId ID of the powerpack. (required)
   * @param body Update a powerpack request body. (required)
   * @return CompletableFuture&lt;PowerpackResponse&gt;
   */
  public CompletableFuture<PowerpackResponse> updatePowerpackAsync(
      String powerpackId, Powerpack body) {
    return updatePowerpackWithHttpInfoAsync(powerpackId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update a powerpack.
   *
   * @param powerpackId ID of the powerpack. (required)
   * @param body Update a powerpack request body. (required)
   * @return ApiResponse&lt;PowerpackResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Powerpack Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<PowerpackResponse> updatePowerpackWithHttpInfo(
      String powerpackId, Powerpack body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'powerpackId' is set
    if (powerpackId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'powerpackId' when calling updatePowerpack");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updatePowerpack");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/powerpacks/{powerpack_id}"
            .replaceAll(
                "\\{" + "powerpack_id" + "\\}", apiClient.escapeString(powerpackId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.PowerpackApi.updatePowerpack",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<PowerpackResponse>() {});
  }

  /**
   * Update a powerpack.
   *
   * <p>See {@link #updatePowerpackWithHttpInfo}.
   *
   * @param powerpackId ID of the powerpack. (required)
   * @param body Update a powerpack request body. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;PowerpackResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<PowerpackResponse>> updatePowerpackWithHttpInfoAsync(
      String powerpackId, Powerpack body) {
    Object localVarPostBody = body;

    // verify the required parameter 'powerpackId' is set
    if (powerpackId == null) {
      CompletableFuture<ApiResponse<PowerpackResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'powerpackId' when calling updatePowerpack"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<PowerpackResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updatePowerpack"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/powerpacks/{powerpack_id}"
            .replaceAll(
                "\\{" + "powerpack_id" + "\\}", apiClient.escapeString(powerpackId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.PowerpackApi.updatePowerpack",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<PowerpackResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<PowerpackResponse>() {});
  }
}
