package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.ApplicationSecurityExclusionFilterRequest;
import com.datadog.api.client.v2.model.ApplicationSecurityExclusionFilterResponse;
import com.datadog.api.client.v2.model.ApplicationSecurityExclusionFiltersResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ApplicationSecurityApi {
  private ApiClient apiClient;

  public ApplicationSecurityApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public ApplicationSecurityApi(ApiClient apiClient) {
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
   * Create an Application Security exclusion filter.
   *
   * <p>See {@link #createApplicationSecurityExclusionFilterWithHttpInfo}.
   *
   * @param body The definition of the new exclusion filter. (required)
   * @return ApplicationSecurityExclusionFilterResponse
   * @throws ApiException if fails to make API call
   */
  public ApplicationSecurityExclusionFilterResponse createApplicationSecurityExclusionFilter(
      ApplicationSecurityExclusionFilterRequest body) throws ApiException {
    return createApplicationSecurityExclusionFilterWithHttpInfo(body).getData();
  }

  /**
   * Create an Application Security exclusion filter.
   *
   * <p>See {@link #createApplicationSecurityExclusionFilterWithHttpInfoAsync}.
   *
   * @param body The definition of the new exclusion filter. (required)
   * @return CompletableFuture&lt;ApplicationSecurityExclusionFilterResponse&gt;
   */
  public CompletableFuture<ApplicationSecurityExclusionFilterResponse>
      createApplicationSecurityExclusionFilterAsync(
          ApplicationSecurityExclusionFilterRequest body) {
    return createApplicationSecurityExclusionFilterWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a new Application Security exclusion filter with the given parameters.
   *
   * <p>A request matched by an exclusion filter will be ignored by the Application Security
   * product. Go to https://app.datadoghq.com/security/appsec/passlist to review existing exclusion
   * filters (also called passlist entries).
   *
   * @param body The definition of the new exclusion filter. (required)
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
          ApplicationSecurityExclusionFilterRequest body) throws ApiException {
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
            "v2.ApplicationSecurityApi.createApplicationSecurityExclusionFilter",
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
   * Create an Application Security exclusion filter.
   *
   * <p>See {@link #createApplicationSecurityExclusionFilterWithHttpInfo}.
   *
   * @param body The definition of the new exclusion filter. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ApplicationSecurityExclusionFilterResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ApplicationSecurityExclusionFilterResponse>>
      createApplicationSecurityExclusionFilterWithHttpInfoAsync(
          ApplicationSecurityExclusionFilterRequest body) {
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
              "v2.ApplicationSecurityApi.createApplicationSecurityExclusionFilter",
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
   * Delete an Application Security exclusion filter.
   *
   * <p>See {@link #deleteApplicationSecurityExclusionFilterWithHttpInfo}.
   *
   * @param exclusionFilterId The identifier of the exclusion filter. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteApplicationSecurityExclusionFilter(String exclusionFilterId)
      throws ApiException {
    deleteApplicationSecurityExclusionFilterWithHttpInfo(exclusionFilterId);
  }

  /**
   * Delete an Application Security exclusion filter.
   *
   * <p>See {@link #deleteApplicationSecurityExclusionFilterWithHttpInfoAsync}.
   *
   * @param exclusionFilterId The identifier of the exclusion filter. (required)
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
   * Delete a specific Application Security exclusion filter using its identifier.
   *
   * @param exclusionFilterId The identifier of the exclusion filter. (required)
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
            "v2.ApplicationSecurityApi.deleteApplicationSecurityExclusionFilter",
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
   * Delete an Application Security exclusion filter.
   *
   * <p>See {@link #deleteApplicationSecurityExclusionFilterWithHttpInfo}.
   *
   * @param exclusionFilterId The identifier of the exclusion filter. (required)
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
              "v2.ApplicationSecurityApi.deleteApplicationSecurityExclusionFilter",
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
   * Get an Application Security exclusion filter.
   *
   * <p>See {@link #getApplicationSecurityExclusionFilterWithHttpInfo}.
   *
   * @param exclusionFilterId The identifier of the exclusion filter. (required)
   * @return ApplicationSecurityExclusionFilterResponse
   * @throws ApiException if fails to make API call
   */
  public ApplicationSecurityExclusionFilterResponse getApplicationSecurityExclusionFilter(
      String exclusionFilterId) throws ApiException {
    return getApplicationSecurityExclusionFilterWithHttpInfo(exclusionFilterId).getData();
  }

  /**
   * Get an Application Security exclusion filter.
   *
   * <p>See {@link #getApplicationSecurityExclusionFilterWithHttpInfoAsync}.
   *
   * @param exclusionFilterId The identifier of the exclusion filter. (required)
   * @return CompletableFuture&lt;ApplicationSecurityExclusionFilterResponse&gt;
   */
  public CompletableFuture<ApplicationSecurityExclusionFilterResponse>
      getApplicationSecurityExclusionFilterAsync(String exclusionFilterId) {
    return getApplicationSecurityExclusionFilterWithHttpInfoAsync(exclusionFilterId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Retrieve a specific Application Security exclusion filter using its identifier.
   *
   * @param exclusionFilterId The identifier of the exclusion filter. (required)
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
      getApplicationSecurityExclusionFilterWithHttpInfo(String exclusionFilterId)
          throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'exclusionFilterId' is set
    if (exclusionFilterId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'exclusionFilterId' when calling"
              + " getApplicationSecurityExclusionFilter");
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
            "v2.ApplicationSecurityApi.getApplicationSecurityExclusionFilter",
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
   * Get an Application Security exclusion filter.
   *
   * <p>See {@link #getApplicationSecurityExclusionFilterWithHttpInfo}.
   *
   * @param exclusionFilterId The identifier of the exclusion filter. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ApplicationSecurityExclusionFilterResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ApplicationSecurityExclusionFilterResponse>>
      getApplicationSecurityExclusionFilterWithHttpInfoAsync(String exclusionFilterId) {
    Object localVarPostBody = null;

    // verify the required parameter 'exclusionFilterId' is set
    if (exclusionFilterId == null) {
      CompletableFuture<ApiResponse<ApplicationSecurityExclusionFilterResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'exclusionFilterId' when calling"
                  + " getApplicationSecurityExclusionFilter"));
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
              "v2.ApplicationSecurityApi.getApplicationSecurityExclusionFilter",
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
   * List all Application Security exclusion filters.
   *
   * <p>See {@link #listApplicationSecurityExclusionFiltersWithHttpInfo}.
   *
   * @return ApplicationSecurityExclusionFiltersResponse
   * @throws ApiException if fails to make API call
   */
  public ApplicationSecurityExclusionFiltersResponse listApplicationSecurityExclusionFilters()
      throws ApiException {
    return listApplicationSecurityExclusionFiltersWithHttpInfo().getData();
  }

  /**
   * List all Application Security exclusion filters.
   *
   * <p>See {@link #listApplicationSecurityExclusionFiltersWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;ApplicationSecurityExclusionFiltersResponse&gt;
   */
  public CompletableFuture<ApplicationSecurityExclusionFiltersResponse>
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
   * @return ApiResponse&lt;ApplicationSecurityExclusionFiltersResponse&gt;
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
  public ApiResponse<ApplicationSecurityExclusionFiltersResponse>
      listApplicationSecurityExclusionFiltersWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/remote_config/products/asm/waf/exclusion_filters";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ApplicationSecurityApi.listApplicationSecurityExclusionFilters",
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
        new GenericType<ApplicationSecurityExclusionFiltersResponse>() {});
  }

  /**
   * List all Application Security exclusion filters.
   *
   * <p>See {@link #listApplicationSecurityExclusionFiltersWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;ApplicationSecurityExclusionFiltersResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ApplicationSecurityExclusionFiltersResponse>>
      listApplicationSecurityExclusionFiltersWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/remote_config/products/asm/waf/exclusion_filters";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ApplicationSecurityApi.listApplicationSecurityExclusionFilters",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ApplicationSecurityExclusionFiltersResponse>> result =
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
        new GenericType<ApplicationSecurityExclusionFiltersResponse>() {});
  }

  /**
   * Update an Application Security exclusion filter.
   *
   * <p>See {@link #updateApplicationSecurityExclusionFilterWithHttpInfo}.
   *
   * @param exclusionFilterId The identifier of the exclusion filter. (required)
   * @param body The exclusion filter to update. (required)
   * @return ApplicationSecurityExclusionFilterResponse
   * @throws ApiException if fails to make API call
   */
  public ApplicationSecurityExclusionFilterResponse updateApplicationSecurityExclusionFilter(
      String exclusionFilterId, ApplicationSecurityExclusionFilterRequest body)
      throws ApiException {
    return updateApplicationSecurityExclusionFilterWithHttpInfo(exclusionFilterId, body).getData();
  }

  /**
   * Update an Application Security exclusion filter.
   *
   * <p>See {@link #updateApplicationSecurityExclusionFilterWithHttpInfoAsync}.
   *
   * @param exclusionFilterId The identifier of the exclusion filter. (required)
   * @param body The exclusion filter to update. (required)
   * @return CompletableFuture&lt;ApplicationSecurityExclusionFilterResponse&gt;
   */
  public CompletableFuture<ApplicationSecurityExclusionFilterResponse>
      updateApplicationSecurityExclusionFilterAsync(
          String exclusionFilterId, ApplicationSecurityExclusionFilterRequest body) {
    return updateApplicationSecurityExclusionFilterWithHttpInfoAsync(exclusionFilterId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update a specific Application Security exclusion filter using its identifier. Returns the
   * exclusion filter object when the request is successful.
   *
   * @param exclusionFilterId The identifier of the exclusion filter. (required)
   * @param body The exclusion filter to update. (required)
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
          String exclusionFilterId, ApplicationSecurityExclusionFilterRequest body)
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
            "v2.ApplicationSecurityApi.updateApplicationSecurityExclusionFilter",
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
        new GenericType<ApplicationSecurityExclusionFilterResponse>() {});
  }

  /**
   * Update an Application Security exclusion filter.
   *
   * <p>See {@link #updateApplicationSecurityExclusionFilterWithHttpInfo}.
   *
   * @param exclusionFilterId The identifier of the exclusion filter. (required)
   * @param body The exclusion filter to update. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ApplicationSecurityExclusionFilterResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ApplicationSecurityExclusionFilterResponse>>
      updateApplicationSecurityExclusionFilterWithHttpInfoAsync(
          String exclusionFilterId, ApplicationSecurityExclusionFilterRequest body) {
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
              "v2.ApplicationSecurityApi.updateApplicationSecurityExclusionFilter",
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
        "PUT",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<ApplicationSecurityExclusionFilterResponse>() {});
  }
}
