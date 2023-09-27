package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.ReorderRetentionFiltersRequest;
import com.datadog.api.client.v2.model.RetentionFilterCreateRequest;
import com.datadog.api.client.v2.model.RetentionFilterResponse;
import com.datadog.api.client.v2.model.RetentionFilterUpdateRequest;
import com.datadog.api.client.v2.model.RetentionFiltersResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ApmRetentionFiltersApi {
  private ApiClient apiClient;

  public ApmRetentionFiltersApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public ApmRetentionFiltersApi(ApiClient apiClient) {
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
   * Create a retention filter.
   *
   * <p>See {@link #createApmRetentionFilterWithHttpInfo}.
   *
   * @param body The definition of the new retention filter. (required)
   * @return RetentionFilterResponse
   * @throws ApiException if fails to make API call
   */
  public RetentionFilterResponse createApmRetentionFilter(RetentionFilterCreateRequest body)
      throws ApiException {
    return createApmRetentionFilterWithHttpInfo(body).getData();
  }

  /**
   * Create a retention filter.
   *
   * <p>See {@link #createApmRetentionFilterWithHttpInfoAsync}.
   *
   * @param body The definition of the new retention filter. (required)
   * @return CompletableFuture&lt;RetentionFilterResponse&gt;
   */
  public CompletableFuture<RetentionFilterResponse> createApmRetentionFilterAsync(
      RetentionFilterCreateRequest body) {
    return createApmRetentionFilterWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a retention filter to index spans in your organization. Returns the retention filter
   * definition when the request is successful.
   *
   * @param body The definition of the new retention filter. (required)
   * @return ApiResponse&lt;RetentionFilterResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<RetentionFilterResponse> createApmRetentionFilterWithHttpInfo(
      RetentionFilterCreateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createApmRetentionFilter");
    }
    // create path and map variables
    String localVarPath = "/api/v2/apm/config/retention-filters";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ApmRetentionFiltersApi.createApmRetentionFilter",
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
        new GenericType<RetentionFilterResponse>() {});
  }

  /**
   * Create a retention filter.
   *
   * <p>See {@link #createApmRetentionFilterWithHttpInfo}.
   *
   * @param body The definition of the new retention filter. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;RetentionFilterResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RetentionFilterResponse>>
      createApmRetentionFilterWithHttpInfoAsync(RetentionFilterCreateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<RetentionFilterResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createApmRetentionFilter"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/apm/config/retention-filters";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ApmRetentionFiltersApi.createApmRetentionFilter",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RetentionFilterResponse>> result = new CompletableFuture<>();
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
        new GenericType<RetentionFilterResponse>() {});
  }

  /**
   * Delete a retention filter.
   *
   * <p>See {@link #deleteApmRetentionFilterWithHttpInfo}.
   *
   * @param filterId The ID of the retention filter. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteApmRetentionFilter(String filterId) throws ApiException {
    deleteApmRetentionFilterWithHttpInfo(filterId);
  }

  /**
   * Delete a retention filter.
   *
   * <p>See {@link #deleteApmRetentionFilterWithHttpInfoAsync}.
   *
   * @param filterId The ID of the retention filter. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteApmRetentionFilterAsync(String filterId) {
    return deleteApmRetentionFilterWithHttpInfoAsync(filterId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete a specific retention filter from your organization.
   *
   * @param filterId The ID of the retention filter. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteApmRetentionFilterWithHttpInfo(String filterId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'filterId' is set
    if (filterId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'filterId' when calling deleteApmRetentionFilter");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/apm/config/retention-filters/{filter_id}"
            .replaceAll("\\{" + "filter_id" + "\\}", apiClient.escapeString(filterId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ApmRetentionFiltersApi.deleteApmRetentionFilter",
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
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Delete a retention filter.
   *
   * <p>See {@link #deleteApmRetentionFilterWithHttpInfo}.
   *
   * @param filterId The ID of the retention filter. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteApmRetentionFilterWithHttpInfoAsync(
      String filterId) {
    Object localVarPostBody = null;

    // verify the required parameter 'filterId' is set
    if (filterId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'filterId' when calling deleteApmRetentionFilter"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/apm/config/retention-filters/{filter_id}"
            .replaceAll("\\{" + "filter_id" + "\\}", apiClient.escapeString(filterId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ApmRetentionFiltersApi.deleteApmRetentionFilter",
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
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * List all APM retention filters.
   *
   * <p>See {@link #listApmRetentionFiltersWithHttpInfo}.
   *
   * @return RetentionFiltersResponse
   * @throws ApiException if fails to make API call
   */
  public RetentionFiltersResponse listApmRetentionFilters() throws ApiException {
    return listApmRetentionFiltersWithHttpInfo().getData();
  }

  /**
   * List all APM retention filters.
   *
   * <p>See {@link #listApmRetentionFiltersWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;RetentionFiltersResponse&gt;
   */
  public CompletableFuture<RetentionFiltersResponse> listApmRetentionFiltersAsync() {
    return listApmRetentionFiltersWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the list of APM retention filters.
   *
   * @return ApiResponse&lt;RetentionFiltersResponse&gt;
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
  public ApiResponse<RetentionFiltersResponse> listApmRetentionFiltersWithHttpInfo()
      throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/apm/config/retention-filters";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ApmRetentionFiltersApi.listApmRetentionFilters",
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
        new GenericType<RetentionFiltersResponse>() {});
  }

  /**
   * List all APM retention filters.
   *
   * <p>See {@link #listApmRetentionFiltersWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;RetentionFiltersResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RetentionFiltersResponse>>
      listApmRetentionFiltersWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/apm/config/retention-filters";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ApmRetentionFiltersApi.listApmRetentionFilters",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RetentionFiltersResponse>> result = new CompletableFuture<>();
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
        new GenericType<RetentionFiltersResponse>() {});
  }

  /**
   * Re-order retention filters.
   *
   * <p>See {@link #reorderApmRetentionFiltersWithHttpInfo}.
   *
   * @param body The list of retention filters in the new order. (required)
   * @throws ApiException if fails to make API call
   */
  public void reorderApmRetentionFilters(ReorderRetentionFiltersRequest body) throws ApiException {
    reorderApmRetentionFiltersWithHttpInfo(body);
  }

  /**
   * Re-order retention filters.
   *
   * <p>See {@link #reorderApmRetentionFiltersWithHttpInfoAsync}.
   *
   * @param body The list of retention filters in the new order. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> reorderApmRetentionFiltersAsync(
      ReorderRetentionFiltersRequest body) {
    return reorderApmRetentionFiltersWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Re-order the execution order of retention filters.
   *
   * @param body The list of retention filters in the new order. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> reorderApmRetentionFiltersWithHttpInfo(
      ReorderRetentionFiltersRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling reorderApmRetentionFilters");
    }
    // create path and map variables
    String localVarPath = "/api/v2/apm/config/retention-filters-execution-order";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ApmRetentionFiltersApi.reorderApmRetentionFilters",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "PUT",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Re-order retention filters.
   *
   * <p>See {@link #reorderApmRetentionFiltersWithHttpInfo}.
   *
   * @param body The list of retention filters in the new order. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> reorderApmRetentionFiltersWithHttpInfoAsync(
      ReorderRetentionFiltersRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling reorderApmRetentionFilters"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/apm/config/retention-filters-execution-order";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ApmRetentionFiltersApi.reorderApmRetentionFilters",
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
        "PUT",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Update a retention filter.
   *
   * <p>See {@link #updateApmRetentionFilterWithHttpInfo}.
   *
   * @param filterId The ID of the retention filter. (required)
   * @param body The updated definition of the retention filter. (required)
   * @return RetentionFilterResponse
   * @throws ApiException if fails to make API call
   */
  public RetentionFilterResponse updateApmRetentionFilter(
      String filterId, RetentionFilterUpdateRequest body) throws ApiException {
    return updateApmRetentionFilterWithHttpInfo(filterId, body).getData();
  }

  /**
   * Update a retention filter.
   *
   * <p>See {@link #updateApmRetentionFilterWithHttpInfoAsync}.
   *
   * @param filterId The ID of the retention filter. (required)
   * @param body The updated definition of the retention filter. (required)
   * @return CompletableFuture&lt;RetentionFilterResponse&gt;
   */
  public CompletableFuture<RetentionFilterResponse> updateApmRetentionFilterAsync(
      String filterId, RetentionFilterUpdateRequest body) {
    return updateApmRetentionFilterWithHttpInfoAsync(filterId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update a retention filter from your organization.
   *
   * @param filterId The ID of the retention filter. (required)
   * @param body The updated definition of the retention filter. (required)
   * @return ApiResponse&lt;RetentionFilterResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<RetentionFilterResponse> updateApmRetentionFilterWithHttpInfo(
      String filterId, RetentionFilterUpdateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'filterId' is set
    if (filterId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'filterId' when calling updateApmRetentionFilter");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateApmRetentionFilter");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/apm/config/retention-filters/{filter_id}"
            .replaceAll("\\{" + "filter_id" + "\\}", apiClient.escapeString(filterId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ApmRetentionFiltersApi.updateApmRetentionFilter",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "PUT",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<RetentionFilterResponse>() {});
  }

  /**
   * Update a retention filter.
   *
   * <p>See {@link #updateApmRetentionFilterWithHttpInfo}.
   *
   * @param filterId The ID of the retention filter. (required)
   * @param body The updated definition of the retention filter. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;RetentionFilterResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RetentionFilterResponse>>
      updateApmRetentionFilterWithHttpInfoAsync(
          String filterId, RetentionFilterUpdateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'filterId' is set
    if (filterId == null) {
      CompletableFuture<ApiResponse<RetentionFilterResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'filterId' when calling updateApmRetentionFilter"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<RetentionFilterResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateApmRetentionFilter"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/apm/config/retention-filters/{filter_id}"
            .replaceAll("\\{" + "filter_id" + "\\}", apiClient.escapeString(filterId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ApmRetentionFiltersApi.updateApmRetentionFilter",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RetentionFilterResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "PUT",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<RetentionFilterResponse>() {});
  }
}
