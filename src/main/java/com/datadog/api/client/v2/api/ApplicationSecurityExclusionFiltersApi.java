package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.ApplicationSecurityExclusionFilterCreateRequest;
import com.datadog.api.client.v2.model.ApplicationSecurityExclusionFilterListResponse;
import com.datadog.api.client.v2.model.ApplicationSecurityExclusionFilterResponse;
import com.datadog.api.client.v2.model.ApplicationSecurityExclusionFilterUpdateRequest;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ApplicationSecurityExclusionFiltersApi {
  private ApiClient apiClient;

  public ApplicationSecurityExclusionFiltersApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public ApplicationSecurityExclusionFiltersApi(ApiClient apiClient) {
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
   * Create an ASM Exclusion filter.
   *
   * <p>See {@link #createApplicationSecurityExclusionFilterWithHttpInfo}.
   *
   * @param body The definition of the new Exclusion filter. (required)
   * @return ApplicationSecurityExclusionFilterResponse
   * @throws ApiException if fails to make API call
   */
  public ApplicationSecurityExclusionFilterResponse createApplicationSecurityExclusionFilter(
      ApplicationSecurityExclusionFilterCreateRequest body) throws ApiException {
    return createApplicationSecurityExclusionFilterWithHttpInfo(body).getData();
  }

  /**
   * Create an ASM Exclusion filter.
   *
   * <p>See {@link #createApplicationSecurityExclusionFilterWithHttpInfoAsync}.
   *
   * @param body The definition of the new Exclusion filter. (required)
   * @return CompletableFuture&lt;ApplicationSecurityExclusionFilterResponse&gt;
   */
  public CompletableFuture<ApplicationSecurityExclusionFilterResponse>
      createApplicationSecurityExclusionFilterAsync(
          ApplicationSecurityExclusionFilterCreateRequest body) {
    return createApplicationSecurityExclusionFilterWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a new exclusion filter with the given parameters.
   *
   * @param body The definition of the new Exclusion filter. (required)
   * @return ApiResponse&lt;ApplicationSecurityExclusionFilterResponse&gt;
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
  public ApiResponse<ApplicationSecurityExclusionFilterResponse>
      createApplicationSecurityExclusionFilterWithHttpInfo(
          ApplicationSecurityExclusionFilterCreateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'body' when calling"
              + " createApplicationSecurityExclusionFilter");
    }
    // create path and map variables
    String localVarPath = "/api/v2/remote_config/products/asm/waf/exclusion_filters";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ApplicationSecurityExclusionFiltersApi.createApplicationSecurityExclusionFilter",
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
        new GenericType<ApplicationSecurityExclusionFilterResponse>() {});
  }

  /**
   * Create an ASM Exclusion filter.
   *
   * <p>See {@link #createApplicationSecurityExclusionFilterWithHttpInfo}.
   *
   * @param body The definition of the new Exclusion filter. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ApplicationSecurityExclusionFilterResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ApplicationSecurityExclusionFilterResponse>>
      createApplicationSecurityExclusionFilterWithHttpInfoAsync(
          ApplicationSecurityExclusionFilterCreateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<ApplicationSecurityExclusionFilterResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " createApplicationSecurityExclusionFilter"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/remote_config/products/asm/waf/exclusion_filters";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ApplicationSecurityExclusionFiltersApi.createApplicationSecurityExclusionFilter",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ApplicationSecurityExclusionFilterResponse>> result =
          new CompletableFuture<>();
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
        new GenericType<ApplicationSecurityExclusionFilterResponse>() {});
  }

  /**
   * Delete an ASM Exclusion Filter.
   *
   * <p>See {@link #deleteApplicationSecurityExclusionFilterWithHttpInfo}.
   *
   * @param exclusionFilterId The ID of the exclusion filter. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteApplicationSecurityExclusionFilter(String exclusionFilterId)
      throws ApiException {
    deleteApplicationSecurityExclusionFilterWithHttpInfo(exclusionFilterId);
  }

  /**
   * Delete an ASM Exclusion Filter.
   *
   * <p>See {@link #deleteApplicationSecurityExclusionFilterWithHttpInfoAsync}.
   *
   * @param exclusionFilterId The ID of the exclusion filter. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteApplicationSecurityExclusionFilterAsync(
      String exclusionFilterId) {
    return deleteApplicationSecurityExclusionFilterWithHttpInfoAsync(exclusionFilterId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete a specific Application Security Exclusion filter.
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
  public ApiResponse<Void> deleteApplicationSecurityExclusionFilterWithHttpInfo(
      String exclusionFilterId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'exclusionFilterId' is set
    if (exclusionFilterId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'exclusionFilterId' when calling"
              + " deleteApplicationSecurityExclusionFilter");
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
            "v2.ApplicationSecurityExclusionFiltersApi.deleteApplicationSecurityExclusionFilter",
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
   * Delete an ASM Exclusion Filter.
   *
   * <p>See {@link #deleteApplicationSecurityExclusionFilterWithHttpInfo}.
   *
   * @param exclusionFilterId The ID of the exclusion filter. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>>
      deleteApplicationSecurityExclusionFilterWithHttpInfoAsync(String exclusionFilterId) {
    Object localVarPostBody = null;

    // verify the required parameter 'exclusionFilterId' is set
    if (exclusionFilterId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'exclusionFilterId' when calling"
                  + " deleteApplicationSecurityExclusionFilter"));
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
              "v2.ApplicationSecurityExclusionFiltersApi.deleteApplicationSecurityExclusionFilter",
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
   * <p>See {@link #getApplicationSecurityExclusionFiltersWithHttpInfo}.
   *
   * @param exclusionFilterId The ID of the exclusion filter. (required)
   * @return ApplicationSecurityExclusionFilterResponse
   * @throws ApiException if fails to make API call
   */
  public ApplicationSecurityExclusionFilterResponse getApplicationSecurityExclusionFilters(
      String exclusionFilterId) throws ApiException {
    return getApplicationSecurityExclusionFiltersWithHttpInfo(exclusionFilterId).getData();
  }

  /**
   * Get a specific ASM Exclusion Filter.
   *
   * <p>See {@link #getApplicationSecurityExclusionFiltersWithHttpInfoAsync}.
   *
   * @param exclusionFilterId The ID of the exclusion filter. (required)
   * @return CompletableFuture&lt;ApplicationSecurityExclusionFilterResponse&gt;
   */
  public CompletableFuture<ApplicationSecurityExclusionFilterResponse>
      getApplicationSecurityExclusionFiltersAsync(String exclusionFilterId) {
    return getApplicationSecurityExclusionFiltersWithHttpInfoAsync(exclusionFilterId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Retrieve a specific Application Security exclusion filter by ID.
   *
   * @param exclusionFilterId The ID of the exclusion filter. (required)
   * @return ApiResponse&lt;ApplicationSecurityExclusionFilterResponse&gt;
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
  public ApiResponse<ApplicationSecurityExclusionFilterResponse>
      getApplicationSecurityExclusionFiltersWithHttpInfo(String exclusionFilterId)
          throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'exclusionFilterId' is set
    if (exclusionFilterId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'exclusionFilterId' when calling"
              + " getApplicationSecurityExclusionFilters");
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
            "v2.ApplicationSecurityExclusionFiltersApi.getApplicationSecurityExclusionFilters",
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
        new GenericType<ApplicationSecurityExclusionFilterResponse>() {});
  }

  /**
   * Get a specific ASM Exclusion Filter.
   *
   * <p>See {@link #getApplicationSecurityExclusionFiltersWithHttpInfo}.
   *
   * @param exclusionFilterId The ID of the exclusion filter. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ApplicationSecurityExclusionFilterResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ApplicationSecurityExclusionFilterResponse>>
      getApplicationSecurityExclusionFiltersWithHttpInfoAsync(String exclusionFilterId) {
    Object localVarPostBody = null;

    // verify the required parameter 'exclusionFilterId' is set
    if (exclusionFilterId == null) {
      CompletableFuture<ApiResponse<ApplicationSecurityExclusionFilterResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'exclusionFilterId' when calling"
                  + " getApplicationSecurityExclusionFilters"));
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
              "v2.ApplicationSecurityExclusionFiltersApi.getApplicationSecurityExclusionFilters",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ApplicationSecurityExclusionFilterResponse>> result =
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
        new GenericType<ApplicationSecurityExclusionFilterResponse>() {});
  }

  /**
   * List all ASM Exclusion Filters.
   *
   * <p>See {@link #listApplicationSecurityExclusionFiltersWithHttpInfo}.
   *
   * @return ApplicationSecurityExclusionFilterListResponse
   * @throws ApiException if fails to make API call
   */
  public ApplicationSecurityExclusionFilterListResponse listApplicationSecurityExclusionFilters()
      throws ApiException {
    return listApplicationSecurityExclusionFiltersWithHttpInfo().getData();
  }

  /**
   * List all ASM Exclusion Filters.
   *
   * <p>See {@link #listApplicationSecurityExclusionFiltersWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;ApplicationSecurityExclusionFilterListResponse&gt;
   */
  public CompletableFuture<ApplicationSecurityExclusionFilterListResponse>
      listApplicationSecurityExclusionFiltersAsync() {
    return listApplicationSecurityExclusionFiltersWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Retrieve a list of Application Security exclusion filters.
   *
   * @return ApiResponse&lt;ApplicationSecurityExclusionFilterListResponse&gt;
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
  public ApiResponse<ApplicationSecurityExclusionFilterListResponse>
      listApplicationSecurityExclusionFiltersWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/remote_config/products/asm/waf/exclusion_filters";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ApplicationSecurityExclusionFiltersApi.listApplicationSecurityExclusionFilters",
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
        new GenericType<ApplicationSecurityExclusionFilterListResponse>() {});
  }

  /**
   * List all ASM Exclusion Filters.
   *
   * <p>See {@link #listApplicationSecurityExclusionFiltersWithHttpInfo}.
   *
   * @return
   *     CompletableFuture&lt;ApiResponse&lt;ApplicationSecurityExclusionFilterListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ApplicationSecurityExclusionFilterListResponse>>
      listApplicationSecurityExclusionFiltersWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/remote_config/products/asm/waf/exclusion_filters";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ApplicationSecurityExclusionFiltersApi.listApplicationSecurityExclusionFilters",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ApplicationSecurityExclusionFilterListResponse>> result =
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
        new GenericType<ApplicationSecurityExclusionFilterListResponse>() {});
  }

  /**
   * Update an ASM Exclusion filter.
   *
   * <p>See {@link #updateApplicationSecurityExclusionFilterWithHttpInfo}.
   *
   * @param exclusionFilterId The ID of the exclusion filter. (required)
   * @param body New definition of the Exclusion filter. (required)
   * @return ApplicationSecurityExclusionFilterResponse
   * @throws ApiException if fails to make API call
   */
  public ApplicationSecurityExclusionFilterResponse updateApplicationSecurityExclusionFilter(
      String exclusionFilterId, ApplicationSecurityExclusionFilterUpdateRequest body)
      throws ApiException {
    return updateApplicationSecurityExclusionFilterWithHttpInfo(exclusionFilterId, body).getData();
  }

  /**
   * Update an ASM Exclusion filter.
   *
   * <p>See {@link #updateApplicationSecurityExclusionFilterWithHttpInfoAsync}.
   *
   * @param exclusionFilterId The ID of the exclusion filter. (required)
   * @param body New definition of the Exclusion filter. (required)
   * @return CompletableFuture&lt;ApplicationSecurityExclusionFilterResponse&gt;
   */
  public CompletableFuture<ApplicationSecurityExclusionFilterResponse>
      updateApplicationSecurityExclusionFilterAsync(
          String exclusionFilterId, ApplicationSecurityExclusionFilterUpdateRequest body) {
    return updateApplicationSecurityExclusionFilterWithHttpInfoAsync(exclusionFilterId, body)
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
   * @return ApiResponse&lt;ApplicationSecurityExclusionFilterResponse&gt;
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
  public ApiResponse<ApplicationSecurityExclusionFilterResponse>
      updateApplicationSecurityExclusionFilterWithHttpInfo(
          String exclusionFilterId, ApplicationSecurityExclusionFilterUpdateRequest body)
          throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'exclusionFilterId' is set
    if (exclusionFilterId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'exclusionFilterId' when calling"
              + " updateApplicationSecurityExclusionFilter");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'body' when calling"
              + " updateApplicationSecurityExclusionFilter");
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
            "v2.ApplicationSecurityExclusionFiltersApi.updateApplicationSecurityExclusionFilter",
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
        new GenericType<ApplicationSecurityExclusionFilterResponse>() {});
  }

  /**
   * Update an ASM Exclusion filter.
   *
   * <p>See {@link #updateApplicationSecurityExclusionFilterWithHttpInfo}.
   *
   * @param exclusionFilterId The ID of the exclusion filter. (required)
   * @param body New definition of the Exclusion filter. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ApplicationSecurityExclusionFilterResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ApplicationSecurityExclusionFilterResponse>>
      updateApplicationSecurityExclusionFilterWithHttpInfoAsync(
          String exclusionFilterId, ApplicationSecurityExclusionFilterUpdateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'exclusionFilterId' is set
    if (exclusionFilterId == null) {
      CompletableFuture<ApiResponse<ApplicationSecurityExclusionFilterResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'exclusionFilterId' when calling"
                  + " updateApplicationSecurityExclusionFilter"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<ApplicationSecurityExclusionFilterResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " updateApplicationSecurityExclusionFilter"));
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
              "v2.ApplicationSecurityExclusionFiltersApi.updateApplicationSecurityExclusionFilter",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ApplicationSecurityExclusionFilterResponse>> result =
          new CompletableFuture<>();
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
        new GenericType<ApplicationSecurityExclusionFilterResponse>() {});
  }
}
