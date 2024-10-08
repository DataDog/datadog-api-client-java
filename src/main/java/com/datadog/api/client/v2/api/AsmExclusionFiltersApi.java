package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.ASMExclusionFilterCreateRequest;
import com.datadog.api.client.v2.model.ASMExclusionFilterListResponse;
import com.datadog.api.client.v2.model.ASMExclusionFilterResponse;
import com.datadog.api.client.v2.model.ASMExclusionFilterUpdateRequest;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AsmExclusionFiltersApi {
  private ApiClient apiClient;

  public AsmExclusionFiltersApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public AsmExclusionFiltersApi(ApiClient apiClient) {
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
   * Create a ASM WAF Exclusion filter.
   *
   * <p>See {@link #createASMExclusionFilterWithHttpInfo}.
   *
   * @param body The definition of the new Exclusion filter. (required)
   * @return ASMExclusionFilterResponse
   * @throws ApiException if fails to make API call
   */
  public ASMExclusionFilterResponse createASMExclusionFilter(ASMExclusionFilterCreateRequest body)
      throws ApiException {
    return createASMExclusionFilterWithHttpInfo(body).getData();
  }

  /**
   * Create a ASM WAF Exclusion filter.
   *
   * <p>See {@link #createASMExclusionFilterWithHttpInfoAsync}.
   *
   * @param body The definition of the new Exclusion filter. (required)
   * @return CompletableFuture&lt;ASMExclusionFilterResponse&gt;
   */
  public CompletableFuture<ASMExclusionFilterResponse> createASMExclusionFilterAsync(
      ASMExclusionFilterCreateRequest body) {
    return createASMExclusionFilterWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a new exclusion filter with the given parameters.
   *
   * @param body The definition of the new Exclusion filter. (required)
   * @return ApiResponse&lt;ASMExclusionFilterResponse&gt;
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
  public ApiResponse<ASMExclusionFilterResponse> createASMExclusionFilterWithHttpInfo(
      ASMExclusionFilterCreateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createASMExclusionFilter");
    }
    // create path and map variables
    String localVarPath = "/api/v2/remote_config/products/asm/waf/exclusion_filters";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AsmExclusionFiltersApi.createASMExclusionFilter",
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
        new GenericType<ASMExclusionFilterResponse>() {});
  }

  /**
   * Create a ASM WAF Exclusion filter.
   *
   * <p>See {@link #createASMExclusionFilterWithHttpInfo}.
   *
   * @param body The definition of the new Exclusion filter. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ASMExclusionFilterResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ASMExclusionFilterResponse>>
      createASMExclusionFilterWithHttpInfoAsync(ASMExclusionFilterCreateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<ASMExclusionFilterResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createASMExclusionFilter"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/remote_config/products/asm/waf/exclusion_filters";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AsmExclusionFiltersApi.createASMExclusionFilter",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ASMExclusionFilterResponse>> result = new CompletableFuture<>();
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
        new GenericType<ASMExclusionFilterResponse>() {});
  }

  /**
   * Delete a ASM Exclusion Filter.
   *
   * <p>See {@link #deleteASMExclusionFilterWithHttpInfo}.
   *
   * @param exclusionFilterId The ID of the exclusion filter. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteASMExclusionFilter(String exclusionFilterId) throws ApiException {
    deleteASMExclusionFilterWithHttpInfo(exclusionFilterId);
  }

  /**
   * Delete a ASM Exclusion Filter.
   *
   * <p>See {@link #deleteASMExclusionFilterWithHttpInfoAsync}.
   *
   * @param exclusionFilterId The ID of the exclusion filter. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteASMExclusionFilterAsync(String exclusionFilterId) {
    return deleteASMExclusionFilterWithHttpInfoAsync(exclusionFilterId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete a specific ASM Exclusion filter.
   *
   * @param exclusionFilterId The ID of the exclusion filter. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteASMExclusionFilterWithHttpInfo(String exclusionFilterId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'exclusionFilterId' is set
    if (exclusionFilterId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'exclusionFilterId' when calling"
              + " deleteASMExclusionFilter");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/remote_config/products/asm/waf/exclusion_filters/{exclusion_filter_id}"
            .replaceAll(
                "\\{" + "exclusion_filter_id" + "\\}",
                apiClient.escapeString(exclusionFilterId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AsmExclusionFiltersApi.deleteASMExclusionFilter",
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
   * Delete a ASM Exclusion Filter.
   *
   * <p>See {@link #deleteASMExclusionFilterWithHttpInfo}.
   *
   * @param exclusionFilterId The ID of the exclusion filter. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteASMExclusionFilterWithHttpInfoAsync(
      String exclusionFilterId) {
    Object localVarPostBody = null;

    // verify the required parameter 'exclusionFilterId' is set
    if (exclusionFilterId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'exclusionFilterId' when calling"
                  + " deleteASMExclusionFilter"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/remote_config/products/asm/waf/exclusion_filters/{exclusion_filter_id}"
            .replaceAll(
                "\\{" + "exclusion_filter_id" + "\\}",
                apiClient.escapeString(exclusionFilterId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AsmExclusionFiltersApi.deleteASMExclusionFilter",
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
   * Get a specific ASM Exclusion Filter.
   *
   * <p>See {@link #getASMExclusionFiltersWithHttpInfo}.
   *
   * @param exclusionFilterId The ID of the exclusion filter. (required)
   * @return ASMExclusionFilterResponse
   * @throws ApiException if fails to make API call
   */
  public ASMExclusionFilterResponse getASMExclusionFilters(String exclusionFilterId)
      throws ApiException {
    return getASMExclusionFiltersWithHttpInfo(exclusionFilterId).getData();
  }

  /**
   * Get a specific ASM Exclusion Filter.
   *
   * <p>See {@link #getASMExclusionFiltersWithHttpInfoAsync}.
   *
   * @param exclusionFilterId The ID of the exclusion filter. (required)
   * @return CompletableFuture&lt;ASMExclusionFilterResponse&gt;
   */
  public CompletableFuture<ASMExclusionFilterResponse> getASMExclusionFiltersAsync(
      String exclusionFilterId) {
    return getASMExclusionFiltersWithHttpInfoAsync(exclusionFilterId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Retrieve a specific ASM exclusion filter by ID.
   *
   * @param exclusionFilterId The ID of the exclusion filter. (required)
   * @return ApiResponse&lt;ASMExclusionFilterResponse&gt;
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
  public ApiResponse<ASMExclusionFilterResponse> getASMExclusionFiltersWithHttpInfo(
      String exclusionFilterId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'exclusionFilterId' is set
    if (exclusionFilterId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'exclusionFilterId' when calling getASMExclusionFilters");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/remote_config/products/asm/waf/exclusion_filters/{exclusion_filter_id}"
            .replaceAll(
                "\\{" + "exclusion_filter_id" + "\\}",
                apiClient.escapeString(exclusionFilterId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AsmExclusionFiltersApi.getASMExclusionFilters",
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
        new GenericType<ASMExclusionFilterResponse>() {});
  }

  /**
   * Get a specific ASM Exclusion Filter.
   *
   * <p>See {@link #getASMExclusionFiltersWithHttpInfo}.
   *
   * @param exclusionFilterId The ID of the exclusion filter. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ASMExclusionFilterResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ASMExclusionFilterResponse>>
      getASMExclusionFiltersWithHttpInfoAsync(String exclusionFilterId) {
    Object localVarPostBody = null;

    // verify the required parameter 'exclusionFilterId' is set
    if (exclusionFilterId == null) {
      CompletableFuture<ApiResponse<ASMExclusionFilterResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'exclusionFilterId' when calling"
                  + " getASMExclusionFilters"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/remote_config/products/asm/waf/exclusion_filters/{exclusion_filter_id}"
            .replaceAll(
                "\\{" + "exclusion_filter_id" + "\\}",
                apiClient.escapeString(exclusionFilterId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AsmExclusionFiltersApi.getASMExclusionFilters",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ASMExclusionFilterResponse>> result = new CompletableFuture<>();
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
        new GenericType<ASMExclusionFilterResponse>() {});
  }

  /**
   * List ASM Exclusion Filters.
   *
   * <p>See {@link #listASMExclusionFiltersWithHttpInfo}.
   *
   * @return ASMExclusionFilterListResponse
   * @throws ApiException if fails to make API call
   */
  public ASMExclusionFilterListResponse listASMExclusionFilters() throws ApiException {
    return listASMExclusionFiltersWithHttpInfo().getData();
  }

  /**
   * List ASM Exclusion Filters.
   *
   * <p>See {@link #listASMExclusionFiltersWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;ASMExclusionFilterListResponse&gt;
   */
  public CompletableFuture<ASMExclusionFilterListResponse> listASMExclusionFiltersAsync() {
    return listASMExclusionFiltersWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Retrieve a list of ASM exclusion filters.
   *
   * @return ApiResponse&lt;ASMExclusionFilterListResponse&gt;
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
  public ApiResponse<ASMExclusionFilterListResponse> listASMExclusionFiltersWithHttpInfo()
      throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/remote_config/products/asm/waf/exclusion_filters";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AsmExclusionFiltersApi.listASMExclusionFilters",
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
        new GenericType<ASMExclusionFilterListResponse>() {});
  }

  /**
   * List ASM Exclusion Filters.
   *
   * <p>See {@link #listASMExclusionFiltersWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;ASMExclusionFilterListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ASMExclusionFilterListResponse>>
      listASMExclusionFiltersWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/remote_config/products/asm/waf/exclusion_filters";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AsmExclusionFiltersApi.listASMExclusionFilters",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ASMExclusionFilterListResponse>> result =
          new CompletableFuture<>();
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
        new GenericType<ASMExclusionFilterListResponse>() {});
  }

  /**
   * Update a ASM Exclusion filter.
   *
   * <p>See {@link #updateASMExclusionFilterWithHttpInfo}.
   *
   * @param exclusionFilterId The ID of the exclusion filter. (required)
   * @param body New definition of the Exclusion filter. (required)
   * @return ASMExclusionFilterResponse
   * @throws ApiException if fails to make API call
   */
  public ASMExclusionFilterResponse updateASMExclusionFilter(
      String exclusionFilterId, ASMExclusionFilterUpdateRequest body) throws ApiException {
    return updateASMExclusionFilterWithHttpInfo(exclusionFilterId, body).getData();
  }

  /**
   * Update a ASM Exclusion filter.
   *
   * <p>See {@link #updateASMExclusionFilterWithHttpInfoAsync}.
   *
   * @param exclusionFilterId The ID of the exclusion filter. (required)
   * @param body New definition of the Exclusion filter. (required)
   * @return CompletableFuture&lt;ASMExclusionFilterResponse&gt;
   */
  public CompletableFuture<ASMExclusionFilterResponse> updateASMExclusionFilterAsync(
      String exclusionFilterId, ASMExclusionFilterUpdateRequest body) {
    return updateASMExclusionFilterWithHttpInfoAsync(exclusionFilterId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update a specific Exclusion filter. Returns the Exclusion filter object when the request is
   * successful.
   *
   * @param exclusionFilterId The ID of the exclusion filter. (required)
   * @param body New definition of the Exclusion filter. (required)
   * @return ApiResponse&lt;ASMExclusionFilterResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Concurrent Modification </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ASMExclusionFilterResponse> updateASMExclusionFilterWithHttpInfo(
      String exclusionFilterId, ASMExclusionFilterUpdateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'exclusionFilterId' is set
    if (exclusionFilterId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'exclusionFilterId' when calling"
              + " updateASMExclusionFilter");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateASMExclusionFilter");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/remote_config/products/asm/waf/exclusion_filters/{exclusion_filter_id}"
            .replaceAll(
                "\\{" + "exclusion_filter_id" + "\\}",
                apiClient.escapeString(exclusionFilterId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AsmExclusionFiltersApi.updateASMExclusionFilter",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<ASMExclusionFilterResponse>() {});
  }

  /**
   * Update a ASM Exclusion filter.
   *
   * <p>See {@link #updateASMExclusionFilterWithHttpInfo}.
   *
   * @param exclusionFilterId The ID of the exclusion filter. (required)
   * @param body New definition of the Exclusion filter. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ASMExclusionFilterResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ASMExclusionFilterResponse>>
      updateASMExclusionFilterWithHttpInfoAsync(
          String exclusionFilterId, ASMExclusionFilterUpdateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'exclusionFilterId' is set
    if (exclusionFilterId == null) {
      CompletableFuture<ApiResponse<ASMExclusionFilterResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'exclusionFilterId' when calling"
                  + " updateASMExclusionFilter"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<ASMExclusionFilterResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateASMExclusionFilter"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/remote_config/products/asm/waf/exclusion_filters/{exclusion_filter_id}"
            .replaceAll(
                "\\{" + "exclusion_filter_id" + "\\}",
                apiClient.escapeString(exclusionFilterId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AsmExclusionFiltersApi.updateASMExclusionFilter",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ASMExclusionFilterResponse>> result = new CompletableFuture<>();
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
        new GenericType<ASMExclusionFilterResponse>() {});
  }
}
