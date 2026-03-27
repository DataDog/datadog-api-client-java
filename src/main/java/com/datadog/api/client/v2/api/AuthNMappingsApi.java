
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
import com.datadog.api.client.v2.model.AuthNMappingsResponse;
import com.datadog.api.client.v2.model.AuthNMappingsSort;
import com.datadog.api.client.v2.model.AuthNMappingResourceType;
import com.datadog.api.client.v2.model.AuthNMappingResponse;
import com.datadog.api.client.v2.model.AuthNMappingCreateRequest;
import com.datadog.api.client.v2.model.AuthNMappingUpdateRequest;


@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AuthNMappingsApi {
  private ApiClient apiClient;
  public AuthNMappingsApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public AuthNMappingsApi(ApiClient apiClient) {
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
 * Create an AuthN Mapping.
 *
 * See {@link #createAuthNMappingWithHttpInfo}.
 *
 * @param body  (required)
 * @return AuthNMappingResponse
 * @throws ApiException if fails to make API call
 */
  public AuthNMappingResponse  createAuthNMapping(AuthNMappingCreateRequest body) throws ApiException {
    return createAuthNMappingWithHttpInfo(body).getData();
  }

  /**
 * Create an AuthN Mapping.
 *
 * See {@link #createAuthNMappingWithHttpInfoAsync}.
 *
 * @param body  (required)
 * @return CompletableFuture&lt;AuthNMappingResponse&gt;
 */
  public CompletableFuture<AuthNMappingResponse>createAuthNMappingAsync(AuthNMappingCreateRequest body) {
    return createAuthNMappingWithHttpInfoAsync(body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Create an AuthN Mapping.</p>
   *
   * @param body  (required)
   * @return ApiResponse&lt;AuthNMappingResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AuthNMappingResponse> createAuthNMappingWithHttpInfo(AuthNMappingCreateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createAuthNMapping");
    }
    // create path and map variables
    String localVarPath = "/api/v2/authn_mappings";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.AuthNMappingsApi.createAuthNMapping", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<AuthNMappingResponse>() {});
  }

  /**
   * Create an AuthN Mapping.
   *
   * See {@link #createAuthNMappingWithHttpInfo}.
   *
   * @param body  (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AuthNMappingResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AuthNMappingResponse>> createAuthNMappingWithHttpInfoAsync(AuthNMappingCreateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<AuthNMappingResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling createAuthNMapping"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/authn_mappings";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.AuthNMappingsApi.createAuthNMapping", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AuthNMappingResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<AuthNMappingResponse>() {});
  }

  /**
 * Delete an AuthN Mapping.
 *
 * See {@link #deleteAuthNMappingWithHttpInfo}.
 *
 * @param authnMappingId The UUID of the AuthN Mapping. (required)
 * @throws ApiException if fails to make API call
 */
  public  void  deleteAuthNMapping(String authnMappingId) throws ApiException {
    deleteAuthNMappingWithHttpInfo(authnMappingId);
  }

  /**
 * Delete an AuthN Mapping.
 *
 * See {@link #deleteAuthNMappingWithHttpInfoAsync}.
 *
 * @param authnMappingId The UUID of the AuthN Mapping. (required)
 * @return CompletableFuture
 */
  public CompletableFuture<Void>deleteAuthNMappingAsync(String authnMappingId) {
    return deleteAuthNMappingWithHttpInfoAsync(authnMappingId).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Delete an AuthN Mapping specified by AuthN Mapping UUID.</p>
   *
   * @param authnMappingId The UUID of the AuthN Mapping. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteAuthNMappingWithHttpInfo(String authnMappingId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'authnMappingId' is set
    if (authnMappingId == null) {
      throw new ApiException(400, "Missing the required parameter 'authnMappingId' when calling deleteAuthNMapping");
    }
    // create path and map variables
    String localVarPath = "/api/v2/authn_mappings/{authn_mapping_id}"
      .replaceAll("\\{" + "authn_mapping_id" + "\\}", apiClient.escapeString(authnMappingId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.AuthNMappingsApi.deleteAuthNMapping", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("DELETE", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
   * Delete an AuthN Mapping.
   *
   * See {@link #deleteAuthNMappingWithHttpInfo}.
   *
   * @param authnMappingId The UUID of the AuthN Mapping. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteAuthNMappingWithHttpInfoAsync(String authnMappingId) {
    Object localVarPostBody = null;

    // verify the required parameter 'authnMappingId' is set
    if (authnMappingId == null) {
        CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'authnMappingId' when calling deleteAuthNMapping"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/authn_mappings/{authn_mapping_id}"
      .replaceAll("\\{" + "authn_mapping_id" + "\\}", apiClient.escapeString(authnMappingId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.AuthNMappingsApi.deleteAuthNMapping", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("DELETE", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
 * Get an AuthN Mapping by UUID.
 *
 * See {@link #getAuthNMappingWithHttpInfo}.
 *
 * @param authnMappingId The UUID of the AuthN Mapping. (required)
 * @return AuthNMappingResponse
 * @throws ApiException if fails to make API call
 */
  public AuthNMappingResponse  getAuthNMapping(String authnMappingId) throws ApiException {
    return getAuthNMappingWithHttpInfo(authnMappingId).getData();
  }

  /**
 * Get an AuthN Mapping by UUID.
 *
 * See {@link #getAuthNMappingWithHttpInfoAsync}.
 *
 * @param authnMappingId The UUID of the AuthN Mapping. (required)
 * @return CompletableFuture&lt;AuthNMappingResponse&gt;
 */
  public CompletableFuture<AuthNMappingResponse>getAuthNMappingAsync(String authnMappingId) {
    return getAuthNMappingWithHttpInfoAsync(authnMappingId).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get an AuthN Mapping specified by the AuthN Mapping UUID.</p>
   *
   * @param authnMappingId The UUID of the AuthN Mapping. (required)
   * @return ApiResponse&lt;AuthNMappingResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AuthNMappingResponse> getAuthNMappingWithHttpInfo(String authnMappingId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'authnMappingId' is set
    if (authnMappingId == null) {
      throw new ApiException(400, "Missing the required parameter 'authnMappingId' when calling getAuthNMapping");
    }
    // create path and map variables
    String localVarPath = "/api/v2/authn_mappings/{authn_mapping_id}"
      .replaceAll("\\{" + "authn_mapping_id" + "\\}", apiClient.escapeString(authnMappingId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.AuthNMappingsApi.getAuthNMapping", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<AuthNMappingResponse>() {});
  }

  /**
   * Get an AuthN Mapping by UUID.
   *
   * See {@link #getAuthNMappingWithHttpInfo}.
   *
   * @param authnMappingId The UUID of the AuthN Mapping. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AuthNMappingResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AuthNMappingResponse>> getAuthNMappingWithHttpInfoAsync(String authnMappingId) {
    Object localVarPostBody = null;

    // verify the required parameter 'authnMappingId' is set
    if (authnMappingId == null) {
        CompletableFuture<ApiResponse<AuthNMappingResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'authnMappingId' when calling getAuthNMapping"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/authn_mappings/{authn_mapping_id}"
      .replaceAll("\\{" + "authn_mapping_id" + "\\}", apiClient.escapeString(authnMappingId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.AuthNMappingsApi.getAuthNMapping", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AuthNMappingResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<AuthNMappingResponse>() {});
  }

  /**
   * Manage optional parameters to listAuthNMappings.
   */
  public static class ListAuthNMappingsOptionalParameters {
    private Long pageSize;
    private Long pageNumber;
    private AuthNMappingsSort sort;
    private String filter;
    private AuthNMappingResourceType resourceType;

    /**
     * Set pageSize.
     * @param pageSize Size for a given page. The maximum allowed value is 100. (optional, default to 10)
     * @return ListAuthNMappingsOptionalParameters
     */
    public ListAuthNMappingsOptionalParameters pageSize(Long pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set pageNumber.
     * @param pageNumber Specific page number to return. (optional, default to 0)
     * @return ListAuthNMappingsOptionalParameters
     */
    public ListAuthNMappingsOptionalParameters pageNumber(Long pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set sort.
     * @param sort Sort AuthN Mappings depending on the given field. (optional)
     * @return ListAuthNMappingsOptionalParameters
     */
    public ListAuthNMappingsOptionalParameters sort(AuthNMappingsSort sort) {
      this.sort = sort;
      return this;
    }

    /**
     * Set filter.
     * @param filter Filter all mappings by the given string. (optional)
     * @return ListAuthNMappingsOptionalParameters
     */
    public ListAuthNMappingsOptionalParameters filter(String filter) {
      this.filter = filter;
      return this;
    }

    /**
     * Set resourceType.
     * @param resourceType Filter by mapping resource type. Defaults to "role" if not specified. (optional)
     * @return ListAuthNMappingsOptionalParameters
     */
    public ListAuthNMappingsOptionalParameters resourceType(AuthNMappingResourceType resourceType) {
      this.resourceType = resourceType;
      return this;
    }
  }

  /**
 * List all AuthN Mappings.
 *
 * See {@link #listAuthNMappingsWithHttpInfo}.
 *
 * @return AuthNMappingsResponse
 * @throws ApiException if fails to make API call
 */
  public AuthNMappingsResponse listAuthNMappings () throws ApiException {
    return listAuthNMappingsWithHttpInfo(new ListAuthNMappingsOptionalParameters()).getData();
  }

  /**
 * List all AuthN Mappings.
 *
 * See {@link #listAuthNMappingsWithHttpInfoAsync}.
 *
 * @return CompletableFuture&lt;AuthNMappingsResponse&gt;
 */
  public CompletableFuture<AuthNMappingsResponse>listAuthNMappingsAsync() {
    return listAuthNMappingsWithHttpInfoAsync(new ListAuthNMappingsOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * List all AuthN Mappings.
 *
 * See {@link #listAuthNMappingsWithHttpInfo}.
 *
 * @param parameters Optional parameters for the request.
 * @return AuthNMappingsResponse
 * @throws ApiException if fails to make API call
 */
  public AuthNMappingsResponse listAuthNMappings(ListAuthNMappingsOptionalParameters parameters) throws ApiException {
    return listAuthNMappingsWithHttpInfo(parameters).getData();
  }

  /**
 * List all AuthN Mappings.
 *
 * See {@link #listAuthNMappingsWithHttpInfoAsync}.
 *
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;AuthNMappingsResponse&gt;
 */
  public CompletableFuture<AuthNMappingsResponse>listAuthNMappingsAsync(ListAuthNMappingsOptionalParameters parameters) {
    return listAuthNMappingsWithHttpInfoAsync(parameters).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>List all AuthN Mappings in the org.</p>
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;AuthNMappingsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AuthNMappingsResponse> listAuthNMappingsWithHttpInfo(ListAuthNMappingsOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    Long pageSize = parameters.pageSize;
    Long pageNumber = parameters.pageNumber;
    AuthNMappingsSort sort = parameters.sort;
    String filter = parameters.filter;
    AuthNMappingResourceType resourceType = parameters.resourceType;
    // create path and map variables
    String localVarPath = "/api/v2/authn_mappings";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "resource_type", resourceType));

    Invocation.Builder builder = apiClient.createBuilder("v2.AuthNMappingsApi.listAuthNMappings", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<AuthNMappingsResponse>() {});
  }

  /**
   * List all AuthN Mappings.
   *
   * See {@link #listAuthNMappingsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;AuthNMappingsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AuthNMappingsResponse>> listAuthNMappingsWithHttpInfoAsync(ListAuthNMappingsOptionalParameters parameters) {
    Object localVarPostBody = null;
    Long pageSize = parameters.pageSize;
    Long pageNumber = parameters.pageNumber;
    AuthNMappingsSort sort = parameters.sort;
    String filter = parameters.filter;
    AuthNMappingResourceType resourceType = parameters.resourceType;
    // create path and map variables
    String localVarPath = "/api/v2/authn_mappings";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "resource_type", resourceType));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.AuthNMappingsApi.listAuthNMappings", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AuthNMappingsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<AuthNMappingsResponse>() {});
  }

  /**
 * Edit an AuthN Mapping.
 *
 * See {@link #updateAuthNMappingWithHttpInfo}.
 *
 * @param authnMappingId The UUID of the AuthN Mapping. (required)
 * @param body  (required)
 * @return AuthNMappingResponse
 * @throws ApiException if fails to make API call
 */
  public AuthNMappingResponse  updateAuthNMapping(String authnMappingId, AuthNMappingUpdateRequest body) throws ApiException {
    return updateAuthNMappingWithHttpInfo(authnMappingId, body).getData();
  }

  /**
 * Edit an AuthN Mapping.
 *
 * See {@link #updateAuthNMappingWithHttpInfoAsync}.
 *
 * @param authnMappingId The UUID of the AuthN Mapping. (required)
 * @param body  (required)
 * @return CompletableFuture&lt;AuthNMappingResponse&gt;
 */
  public CompletableFuture<AuthNMappingResponse>updateAuthNMappingAsync(String authnMappingId, AuthNMappingUpdateRequest body) {
    return updateAuthNMappingWithHttpInfoAsync(authnMappingId, body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Edit an AuthN Mapping.</p>
   *
   * @param authnMappingId The UUID of the AuthN Mapping. (required)
   * @param body  (required)
   * @return ApiResponse&lt;AuthNMappingResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AuthNMappingResponse> updateAuthNMappingWithHttpInfo(String authnMappingId, AuthNMappingUpdateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'authnMappingId' is set
    if (authnMappingId == null) {
      throw new ApiException(400, "Missing the required parameter 'authnMappingId' when calling updateAuthNMapping");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateAuthNMapping");
    }
    // create path and map variables
    String localVarPath = "/api/v2/authn_mappings/{authn_mapping_id}"
      .replaceAll("\\{" + "authn_mapping_id" + "\\}", apiClient.escapeString(authnMappingId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.AuthNMappingsApi.updateAuthNMapping", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("PATCH", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<AuthNMappingResponse>() {});
  }

  /**
   * Edit an AuthN Mapping.
   *
   * See {@link #updateAuthNMappingWithHttpInfo}.
   *
   * @param authnMappingId The UUID of the AuthN Mapping. (required)
   * @param body  (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AuthNMappingResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AuthNMappingResponse>> updateAuthNMappingWithHttpInfoAsync(String authnMappingId, AuthNMappingUpdateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'authnMappingId' is set
    if (authnMappingId == null) {
        CompletableFuture<ApiResponse<AuthNMappingResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'authnMappingId' when calling updateAuthNMapping"));
        return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<AuthNMappingResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling updateAuthNMapping"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/authn_mappings/{authn_mapping_id}"
      .replaceAll("\\{" + "authn_mapping_id" + "\\}", apiClient.escapeString(authnMappingId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.AuthNMappingsApi.updateAuthNMapping", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AuthNMappingResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("PATCH", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<AuthNMappingResponse>() {});
  }
}