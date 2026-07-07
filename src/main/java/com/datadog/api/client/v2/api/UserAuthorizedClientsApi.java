package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.PaginationIterable;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.UserAuthorizedClientData;
import com.datadog.api.client.v2.model.UserAuthorizedClientResponse;
import com.datadog.api.client.v2.model.UserAuthorizedClientsResponse;
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
public class UserAuthorizedClientsApi {
  private ApiClient apiClient;

  public UserAuthorizedClientsApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public UserAuthorizedClientsApi(ApiClient apiClient) {
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
   * Delete a user authorized client.
   *
   * <p>See {@link #deleteUserAuthorizedClientWithHttpInfo}.
   *
   * @param userAuthorizedClientId The ID of the user authorized client. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteUserAuthorizedClient(String userAuthorizedClientId) throws ApiException {
    deleteUserAuthorizedClientWithHttpInfo(userAuthorizedClientId);
  }

  /**
   * Delete a user authorized client.
   *
   * <p>See {@link #deleteUserAuthorizedClientWithHttpInfoAsync}.
   *
   * @param userAuthorizedClientId The ID of the user authorized client. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteUserAuthorizedClientAsync(String userAuthorizedClientId) {
    return deleteUserAuthorizedClientWithHttpInfoAsync(userAuthorizedClientId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Disable the current user's authorization for the specified OAuth2 client.
   *
   * @param userAuthorizedClientId The ID of the user authorized client. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteUserAuthorizedClientWithHttpInfo(String userAuthorizedClientId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'userAuthorizedClientId' is set
    if (userAuthorizedClientId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'userAuthorizedClientId' when calling"
              + " deleteUserAuthorizedClient");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/user_authorized_clients/{user_authorized_client_id}"
            .replaceAll(
                "\\{" + "user_authorized_client_id" + "\\}",
                apiClient.escapeString(userAuthorizedClientId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.UserAuthorizedClientsApi.deleteUserAuthorizedClient",
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
   * Delete a user authorized client.
   *
   * <p>See {@link #deleteUserAuthorizedClientWithHttpInfo}.
   *
   * @param userAuthorizedClientId The ID of the user authorized client. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteUserAuthorizedClientWithHttpInfoAsync(
      String userAuthorizedClientId) {
    Object localVarPostBody = null;

    // verify the required parameter 'userAuthorizedClientId' is set
    if (userAuthorizedClientId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'userAuthorizedClientId' when calling"
                  + " deleteUserAuthorizedClient"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/user_authorized_clients/{user_authorized_client_id}"
            .replaceAll(
                "\\{" + "user_authorized_client_id" + "\\}",
                apiClient.escapeString(userAuthorizedClientId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.UserAuthorizedClientsApi.deleteUserAuthorizedClient",
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
   * Delete all user authorized clients for a client.
   *
   * <p>See {@link #deleteUserAuthorizedClientsByClientWithHttpInfo}.
   *
   * @param clientId The ID of the OAuth2 client. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteUserAuthorizedClientsByClient(String clientId) throws ApiException {
    deleteUserAuthorizedClientsByClientWithHttpInfo(clientId);
  }

  /**
   * Delete all user authorized clients for a client.
   *
   * <p>See {@link #deleteUserAuthorizedClientsByClientWithHttpInfoAsync}.
   *
   * @param clientId The ID of the OAuth2 client. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteUserAuthorizedClientsByClientAsync(String clientId) {
    return deleteUserAuthorizedClientsByClientWithHttpInfoAsync(clientId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Disable all authorizations the current user has granted to the specified OAuth2 client.
   *
   * @param clientId The ID of the OAuth2 client. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteUserAuthorizedClientsByClientWithHttpInfo(String clientId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'clientId' is set
    if (clientId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'clientId' when calling"
              + " deleteUserAuthorizedClientsByClient");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/user_authorized_clients/client/{client_id}"
            .replaceAll("\\{" + "client_id" + "\\}", apiClient.escapeString(clientId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.UserAuthorizedClientsApi.deleteUserAuthorizedClientsByClient",
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
   * Delete all user authorized clients for a client.
   *
   * <p>See {@link #deleteUserAuthorizedClientsByClientWithHttpInfo}.
   *
   * @param clientId The ID of the OAuth2 client. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteUserAuthorizedClientsByClientWithHttpInfoAsync(
      String clientId) {
    Object localVarPostBody = null;

    // verify the required parameter 'clientId' is set
    if (clientId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'clientId' when calling"
                  + " deleteUserAuthorizedClientsByClient"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/user_authorized_clients/client/{client_id}"
            .replaceAll("\\{" + "client_id" + "\\}", apiClient.escapeString(clientId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.UserAuthorizedClientsApi.deleteUserAuthorizedClientsByClient",
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
   * Get a user authorized client.
   *
   * <p>See {@link #getUserAuthorizedClientWithHttpInfo}.
   *
   * @param userAuthorizedClientId The ID of the user authorized client. (required)
   * @return UserAuthorizedClientResponse
   * @throws ApiException if fails to make API call
   */
  public UserAuthorizedClientResponse getUserAuthorizedClient(String userAuthorizedClientId)
      throws ApiException {
    return getUserAuthorizedClientWithHttpInfo(userAuthorizedClientId).getData();
  }

  /**
   * Get a user authorized client.
   *
   * <p>See {@link #getUserAuthorizedClientWithHttpInfoAsync}.
   *
   * @param userAuthorizedClientId The ID of the user authorized client. (required)
   * @return CompletableFuture&lt;UserAuthorizedClientResponse&gt;
   */
  public CompletableFuture<UserAuthorizedClientResponse> getUserAuthorizedClientAsync(
      String userAuthorizedClientId) {
    return getUserAuthorizedClientWithHttpInfoAsync(userAuthorizedClientId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a single OAuth2 client authorization for the current user.
   *
   * @param userAuthorizedClientId The ID of the user authorized client. (required)
   * @return ApiResponse&lt;UserAuthorizedClientResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<UserAuthorizedClientResponse> getUserAuthorizedClientWithHttpInfo(
      String userAuthorizedClientId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'userAuthorizedClientId' is set
    if (userAuthorizedClientId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'userAuthorizedClientId' when calling"
              + " getUserAuthorizedClient");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/user_authorized_clients/{user_authorized_client_id}"
            .replaceAll(
                "\\{" + "user_authorized_client_id" + "\\}",
                apiClient.escapeString(userAuthorizedClientId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.UserAuthorizedClientsApi.getUserAuthorizedClient",
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
        new GenericType<UserAuthorizedClientResponse>() {});
  }

  /**
   * Get a user authorized client.
   *
   * <p>See {@link #getUserAuthorizedClientWithHttpInfo}.
   *
   * @param userAuthorizedClientId The ID of the user authorized client. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;UserAuthorizedClientResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<UserAuthorizedClientResponse>>
      getUserAuthorizedClientWithHttpInfoAsync(String userAuthorizedClientId) {
    Object localVarPostBody = null;

    // verify the required parameter 'userAuthorizedClientId' is set
    if (userAuthorizedClientId == null) {
      CompletableFuture<ApiResponse<UserAuthorizedClientResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'userAuthorizedClientId' when calling"
                  + " getUserAuthorizedClient"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/user_authorized_clients/{user_authorized_client_id}"
            .replaceAll(
                "\\{" + "user_authorized_client_id" + "\\}",
                apiClient.escapeString(userAuthorizedClientId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.UserAuthorizedClientsApi.getUserAuthorizedClient",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<UserAuthorizedClientResponse>> result =
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
        new GenericType<UserAuthorizedClientResponse>() {});
  }

  /** Manage optional parameters to listUserAuthorizedClients. */
  public static class ListUserAuthorizedClientsOptionalParameters {
    private Long pageSize;
    private Long pageNumber;
    private String filter;
    private String filterDisabled;
    private String include;

    /**
     * Set pageSize.
     *
     * @param pageSize Size for a given page. The maximum allowed value is 100. (optional, default
     *     to 10)
     * @return ListUserAuthorizedClientsOptionalParameters
     */
    public ListUserAuthorizedClientsOptionalParameters pageSize(Long pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set pageNumber.
     *
     * @param pageNumber Specific page number to return. (optional, default to 0)
     * @return ListUserAuthorizedClientsOptionalParameters
     */
    public ListUserAuthorizedClientsOptionalParameters pageNumber(Long pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set filter.
     *
     * @param filter Filter results by client name, app title, or app description. (optional)
     * @return ListUserAuthorizedClientsOptionalParameters
     */
    public ListUserAuthorizedClientsOptionalParameters filter(String filter) {
      this.filter = filter;
      return this;
    }

    /**
     * Set filterDisabled.
     *
     * @param filterDisabled Filter results by the user-level disabled status. (optional)
     * @return ListUserAuthorizedClientsOptionalParameters
     */
    public ListUserAuthorizedClientsOptionalParameters filterDisabled(String filterDisabled) {
      this.filterDisabled = filterDisabled;
      return this;
    }

    /**
     * Set include.
     *
     * @param include Comma-separated list of related resources to include. Options: <code>
     *     oauth2_client</code>, <code>oauth2_client.app</code>. (optional)
     * @return ListUserAuthorizedClientsOptionalParameters
     */
    public ListUserAuthorizedClientsOptionalParameters include(String include) {
      this.include = include;
      return this;
    }
  }

  /**
   * List user authorized clients.
   *
   * <p>See {@link #listUserAuthorizedClientsWithHttpInfo}.
   *
   * @return UserAuthorizedClientsResponse
   * @throws ApiException if fails to make API call
   */
  public UserAuthorizedClientsResponse listUserAuthorizedClients() throws ApiException {
    return listUserAuthorizedClientsWithHttpInfo(new ListUserAuthorizedClientsOptionalParameters())
        .getData();
  }

  /**
   * List user authorized clients.
   *
   * <p>See {@link #listUserAuthorizedClientsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;UserAuthorizedClientsResponse&gt;
   */
  public CompletableFuture<UserAuthorizedClientsResponse> listUserAuthorizedClientsAsync() {
    return listUserAuthorizedClientsWithHttpInfoAsync(
            new ListUserAuthorizedClientsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List user authorized clients.
   *
   * <p>See {@link #listUserAuthorizedClientsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return UserAuthorizedClientsResponse
   * @throws ApiException if fails to make API call
   */
  public UserAuthorizedClientsResponse listUserAuthorizedClients(
      ListUserAuthorizedClientsOptionalParameters parameters) throws ApiException {
    return listUserAuthorizedClientsWithHttpInfo(parameters).getData();
  }

  /**
   * List user authorized clients.
   *
   * <p>See {@link #listUserAuthorizedClientsWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;UserAuthorizedClientsResponse&gt;
   */
  public CompletableFuture<UserAuthorizedClientsResponse> listUserAuthorizedClientsAsync(
      ListUserAuthorizedClientsOptionalParameters parameters) {
    return listUserAuthorizedClientsWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List user authorized clients.
   *
   * <p>See {@link #listUserAuthorizedClientsWithHttpInfo}.
   *
   * @return PaginationIterable&lt;UserAuthorizedClientData&gt;
   */
  public PaginationIterable<UserAuthorizedClientData> listUserAuthorizedClientsWithPagination() {
    ListUserAuthorizedClientsOptionalParameters parameters =
        new ListUserAuthorizedClientsOptionalParameters();
    return listUserAuthorizedClientsWithPagination(parameters);
  }

  /**
   * List user authorized clients.
   *
   * <p>See {@link #listUserAuthorizedClientsWithHttpInfo}.
   *
   * @return UserAuthorizedClientsResponse
   */
  public PaginationIterable<UserAuthorizedClientData> listUserAuthorizedClientsWithPagination(
      ListUserAuthorizedClientsOptionalParameters parameters) {
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
    args.put("optionalParams", parameters);

    PaginationIterable iterator =
        new PaginationIterable(
            this,
            "listUserAuthorizedClients",
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
   * Get a list of all OAuth2 clients authorized by the current user.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;UserAuthorizedClientsResponse&gt;
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
  public ApiResponse<UserAuthorizedClientsResponse> listUserAuthorizedClientsWithHttpInfo(
      ListUserAuthorizedClientsOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    Long pageSize = parameters.pageSize;
    Long pageNumber = parameters.pageNumber;
    String filter = parameters.filter;
    String filterDisabled = parameters.filterDisabled;
    String include = parameters.include;
    // create path and map variables
    String localVarPath = "/api/v2/user_authorized_clients";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[disabled]", filterDisabled));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.UserAuthorizedClientsApi.listUserAuthorizedClients",
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
        new GenericType<UserAuthorizedClientsResponse>() {});
  }

  /**
   * List user authorized clients.
   *
   * <p>See {@link #listUserAuthorizedClientsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;UserAuthorizedClientsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<UserAuthorizedClientsResponse>>
      listUserAuthorizedClientsWithHttpInfoAsync(
          ListUserAuthorizedClientsOptionalParameters parameters) {
    Object localVarPostBody = null;
    Long pageSize = parameters.pageSize;
    Long pageNumber = parameters.pageNumber;
    String filter = parameters.filter;
    String filterDisabled = parameters.filterDisabled;
    String include = parameters.include;
    // create path and map variables
    String localVarPath = "/api/v2/user_authorized_clients";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[disabled]", filterDisabled));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.UserAuthorizedClientsApi.listUserAuthorizedClients",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<UserAuthorizedClientsResponse>> result =
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
        new GenericType<UserAuthorizedClientsResponse>() {});
  }
}
