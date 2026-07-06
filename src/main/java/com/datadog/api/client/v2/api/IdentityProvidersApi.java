package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.PaginationIterable;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.IdentityProviderResponse;
import com.datadog.api.client.v2.model.IdentityProviderUpdateRequest;
import com.datadog.api.client.v2.model.IdentityProvidersResponse;
import com.datadog.api.client.v2.model.QuerySortOrder;
import com.datadog.api.client.v2.model.User;
import com.datadog.api.client.v2.model.UsersResponse;
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
public class IdentityProvidersApi {
  private ApiClient apiClient;

  public IdentityProvidersApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public IdentityProvidersApi(ApiClient apiClient) {
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
   * List identity providers.
   *
   * <p>See {@link #listIdentityProvidersWithHttpInfo}.
   *
   * @return IdentityProvidersResponse
   * @throws ApiException if fails to make API call
   */
  public IdentityProvidersResponse listIdentityProviders() throws ApiException {
    return listIdentityProvidersWithHttpInfo().getData();
  }

  /**
   * List identity providers.
   *
   * <p>See {@link #listIdentityProvidersWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;IdentityProvidersResponse&gt;
   */
  public CompletableFuture<IdentityProvidersResponse> listIdentityProvidersAsync() {
    return listIdentityProvidersWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get all identity providers available for the current organization.
   *
   * @return ApiResponse&lt;IdentityProvidersResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<IdentityProvidersResponse> listIdentityProvidersWithHttpInfo()
      throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/identity_providers";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IdentityProvidersApi.listIdentityProviders",
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
        new GenericType<IdentityProvidersResponse>() {});
  }

  /**
   * List identity providers.
   *
   * <p>See {@link #listIdentityProvidersWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;IdentityProvidersResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IdentityProvidersResponse>>
      listIdentityProvidersWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/identity_providers";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IdentityProvidersApi.listIdentityProviders",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IdentityProvidersResponse>> result = new CompletableFuture<>();
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
        new GenericType<IdentityProvidersResponse>() {});
  }

  /** Manage optional parameters to listIdentityProviderUsers. */
  public static class ListIdentityProviderUsersOptionalParameters {
    private Long pageSize;
    private Long pageNumber;
    private String sort;
    private QuerySortOrder sortDir;
    private String filter;
    private String filterStatus;

    /**
     * Set pageSize.
     *
     * @param pageSize Size for a given page. The maximum allowed value is 100. (optional, default
     *     to 10)
     * @return ListIdentityProviderUsersOptionalParameters
     */
    public ListIdentityProviderUsersOptionalParameters pageSize(Long pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set pageNumber.
     *
     * @param pageNumber Specific page number to return. (optional, default to 0)
     * @return ListIdentityProviderUsersOptionalParameters
     */
    public ListIdentityProviderUsersOptionalParameters pageNumber(Long pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set sort.
     *
     * @param sort User attribute to order results by. Options include <code>email</code> and <code>
     *     name</code>. (optional, default to "email")
     * @return ListIdentityProviderUsersOptionalParameters
     */
    public ListIdentityProviderUsersOptionalParameters sort(String sort) {
      this.sort = sort;
      return this;
    }

    /**
     * Set sortDir.
     *
     * @param sortDir Direction of sort. Options: <code>asc</code>, <code>desc</code>. (optional,
     *     default to "desc")
     * @return ListIdentityProviderUsersOptionalParameters
     */
    public ListIdentityProviderUsersOptionalParameters sortDir(QuerySortOrder sortDir) {
      this.sortDir = sortDir;
      return this;
    }

    /**
     * Set filter.
     *
     * @param filter Filter users by the given string. Defaults to no filtering. (optional)
     * @return ListIdentityProviderUsersOptionalParameters
     */
    public ListIdentityProviderUsersOptionalParameters filter(String filter) {
      this.filter = filter;
      return this;
    }

    /**
     * Set filterStatus.
     *
     * @param filterStatus Filter on status attribute. Comma-separated list, with possible values
     *     <code>Active</code>, <code>Pending</code>, and <code>Disabled</code>. Defaults to no
     *     filtering. (optional)
     * @return ListIdentityProviderUsersOptionalParameters
     */
    public ListIdentityProviderUsersOptionalParameters filterStatus(String filterStatus) {
      this.filterStatus = filterStatus;
      return this;
    }
  }

  /**
   * List users with an identity provider override.
   *
   * <p>See {@link #listIdentityProviderUsersWithHttpInfo}.
   *
   * @param idpId The ID of the identity provider. (required)
   * @return UsersResponse
   * @throws ApiException if fails to make API call
   */
  public UsersResponse listIdentityProviderUsers(String idpId) throws ApiException {
    return listIdentityProviderUsersWithHttpInfo(
            idpId, new ListIdentityProviderUsersOptionalParameters())
        .getData();
  }

  /**
   * List users with an identity provider override.
   *
   * <p>See {@link #listIdentityProviderUsersWithHttpInfoAsync}.
   *
   * @param idpId The ID of the identity provider. (required)
   * @return CompletableFuture&lt;UsersResponse&gt;
   */
  public CompletableFuture<UsersResponse> listIdentityProviderUsersAsync(String idpId) {
    return listIdentityProviderUsersWithHttpInfoAsync(
            idpId, new ListIdentityProviderUsersOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List users with an identity provider override.
   *
   * <p>See {@link #listIdentityProviderUsersWithHttpInfo}.
   *
   * @param idpId The ID of the identity provider. (required)
   * @param parameters Optional parameters for the request.
   * @return UsersResponse
   * @throws ApiException if fails to make API call
   */
  public UsersResponse listIdentityProviderUsers(
      String idpId, ListIdentityProviderUsersOptionalParameters parameters) throws ApiException {
    return listIdentityProviderUsersWithHttpInfo(idpId, parameters).getData();
  }

  /**
   * List users with an identity provider override.
   *
   * <p>See {@link #listIdentityProviderUsersWithHttpInfoAsync}.
   *
   * @param idpId The ID of the identity provider. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;UsersResponse&gt;
   */
  public CompletableFuture<UsersResponse> listIdentityProviderUsersAsync(
      String idpId, ListIdentityProviderUsersOptionalParameters parameters) {
    return listIdentityProviderUsersWithHttpInfoAsync(idpId, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List users with an identity provider override.
   *
   * <p>See {@link #listIdentityProviderUsersWithHttpInfo}.
   *
   * @param idpId The ID of the identity provider. (required)
   * @return PaginationIterable&lt;User&gt;
   */
  public PaginationIterable<User> listIdentityProviderUsersWithPagination(String idpId) {
    ListIdentityProviderUsersOptionalParameters parameters =
        new ListIdentityProviderUsersOptionalParameters();
    return listIdentityProviderUsersWithPagination(idpId, parameters);
  }

  /**
   * List users with an identity provider override.
   *
   * <p>See {@link #listIdentityProviderUsersWithHttpInfo}.
   *
   * @param idpId The ID of the identity provider. (required)
   * @return UsersResponse
   */
  public PaginationIterable<User> listIdentityProviderUsersWithPagination(
      String idpId, ListIdentityProviderUsersOptionalParameters parameters) {
    String resultsPath = "getData";
    String valueGetterPath = "";
    String valueSetterPath = "pageNumber";
    Boolean valueSetterParamOptional = true;
    parameters.pageNumber(0l);
    Long limit;

    if (parameters.pageSize == null) {
      limit = 10l;
      parameters.pageSize(limit);
    } else {
      limit = parameters.pageSize;
    }

    LinkedHashMap<String, Object> args = new LinkedHashMap<String, Object>();
    args.put("idpId", idpId);
    args.put("optionalParams", parameters);

    PaginationIterable iterator =
        new PaginationIterable(
            this,
            "listIdentityProviderUsers",
            resultsPath,
            valueGetterPath,
            valueSetterPath,
            valueSetterParamOptional,
            false,
            false,
            limit,
            args,
            0);

    return iterator;
  }

  /**
   * Get all users in the organization whose login method has been overridden to use the specified
   * identity provider.
   *
   * @param idpId The ID of the identity provider. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;UsersResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<UsersResponse> listIdentityProviderUsersWithHttpInfo(
      String idpId, ListIdentityProviderUsersOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'idpId' is set
    if (idpId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'idpId' when calling listIdentityProviderUsers");
    }
    Long pageSize = parameters.pageSize;
    Long pageNumber = parameters.pageNumber;
    String sort = parameters.sort;
    QuerySortOrder sortDir = parameters.sortDir;
    String filter = parameters.filter;
    String filterStatus = parameters.filterStatus;
    // create path and map variables
    String localVarPath =
        "/api/v2/identity_providers/{idp_id}/users"
            .replaceAll("\\{" + "idp_id" + "\\}", apiClient.escapeString(idpId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort_dir", sortDir));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[status]", filterStatus));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IdentityProvidersApi.listIdentityProviderUsers",
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
        new GenericType<UsersResponse>() {});
  }

  /**
   * List users with an identity provider override.
   *
   * <p>See {@link #listIdentityProviderUsersWithHttpInfo}.
   *
   * @param idpId The ID of the identity provider. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;UsersResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<UsersResponse>> listIdentityProviderUsersWithHttpInfoAsync(
      String idpId, ListIdentityProviderUsersOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'idpId' is set
    if (idpId == null) {
      CompletableFuture<ApiResponse<UsersResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'idpId' when calling listIdentityProviderUsers"));
      return result;
    }
    Long pageSize = parameters.pageSize;
    Long pageNumber = parameters.pageNumber;
    String sort = parameters.sort;
    QuerySortOrder sortDir = parameters.sortDir;
    String filter = parameters.filter;
    String filterStatus = parameters.filterStatus;
    // create path and map variables
    String localVarPath =
        "/api/v2/identity_providers/{idp_id}/users"
            .replaceAll("\\{" + "idp_id" + "\\}", apiClient.escapeString(idpId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort_dir", sortDir));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[status]", filterStatus));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IdentityProvidersApi.listIdentityProviderUsers",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<UsersResponse>> result = new CompletableFuture<>();
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
        new GenericType<UsersResponse>() {});
  }

  /**
   * Update an identity provider.
   *
   * <p>See {@link #updateIdentityProviderWithHttpInfo}.
   *
   * @param idpId The ID of the identity provider. (required)
   * @param body (required)
   * @return IdentityProviderResponse
   * @throws ApiException if fails to make API call
   */
  public IdentityProviderResponse updateIdentityProvider(
      String idpId, IdentityProviderUpdateRequest body) throws ApiException {
    return updateIdentityProviderWithHttpInfo(idpId, body).getData();
  }

  /**
   * Update an identity provider.
   *
   * <p>See {@link #updateIdentityProviderWithHttpInfoAsync}.
   *
   * @param idpId The ID of the identity provider. (required)
   * @param body (required)
   * @return CompletableFuture&lt;IdentityProviderResponse&gt;
   */
  public CompletableFuture<IdentityProviderResponse> updateIdentityProviderAsync(
      String idpId, IdentityProviderUpdateRequest body) {
    return updateIdentityProviderWithHttpInfoAsync(idpId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Enable or disable an identity provider for the current organization.
   *
   * @param idpId The ID of the identity provider. (required)
   * @param body (required)
   * @return ApiResponse&lt;IdentityProviderResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<IdentityProviderResponse> updateIdentityProviderWithHttpInfo(
      String idpId, IdentityProviderUpdateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'idpId' is set
    if (idpId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'idpId' when calling updateIdentityProvider");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateIdentityProvider");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/identity_providers/{idp_id}"
            .replaceAll("\\{" + "idp_id" + "\\}", apiClient.escapeString(idpId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IdentityProvidersApi.updateIdentityProvider",
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
        new GenericType<IdentityProviderResponse>() {});
  }

  /**
   * Update an identity provider.
   *
   * <p>See {@link #updateIdentityProviderWithHttpInfo}.
   *
   * @param idpId The ID of the identity provider. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;IdentityProviderResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IdentityProviderResponse>>
      updateIdentityProviderWithHttpInfoAsync(String idpId, IdentityProviderUpdateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'idpId' is set
    if (idpId == null) {
      CompletableFuture<ApiResponse<IdentityProviderResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'idpId' when calling updateIdentityProvider"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<IdentityProviderResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateIdentityProvider"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/identity_providers/{idp_id}"
            .replaceAll("\\{" + "idp_id" + "\\}", apiClient.escapeString(idpId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IdentityProvidersApi.updateIdentityProvider",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IdentityProviderResponse>> result = new CompletableFuture<>();
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
        new GenericType<IdentityProviderResponse>() {});
  }
}
