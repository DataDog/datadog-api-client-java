
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
import com.datadog.api.client.v2.model.ListAppKeyRegistrationsResponse;
import com.datadog.api.client.v2.model.GetAppKeyRegistrationResponse;
import com.datadog.api.client.v2.model.RegisterAppKeyResponse;
import com.datadog.api.client.v2.model.CreateActionConnectionResponse;
import com.datadog.api.client.v2.model.CreateActionConnectionRequest;
import com.datadog.api.client.v2.model.GetActionConnectionResponse;
import com.datadog.api.client.v2.model.UpdateActionConnectionResponse;
import com.datadog.api.client.v2.model.UpdateActionConnectionRequest;


@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ActionConnectionApi {
  private ApiClient apiClient;
  public ActionConnectionApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public ActionConnectionApi(ApiClient apiClient) {
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
 * Create a new Action Connection.
 *
 * See {@link #createActionConnectionWithHttpInfo}.
 *
 * @param body  (required)
 * @return CreateActionConnectionResponse
 * @throws ApiException if fails to make API call
 */
  public CreateActionConnectionResponse  createActionConnection(CreateActionConnectionRequest body) throws ApiException {
    return createActionConnectionWithHttpInfo(body).getData();
  }

  /**
 * Create a new Action Connection.
 *
 * See {@link #createActionConnectionWithHttpInfoAsync}.
 *
 * @param body  (required)
 * @return CompletableFuture&lt;CreateActionConnectionResponse&gt;
 */
  public CompletableFuture<CreateActionConnectionResponse>createActionConnectionAsync(CreateActionConnectionRequest body) {
    return createActionConnectionWithHttpInfoAsync(body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Create a new Action Connection. This API requires a <a href="https://docs.datadoghq.com/api/latest/action-connection/#register-a-new-app-key">registered application key</a>.</p>
   *
   * @param body  (required)
   * @return ApiResponse&lt;CreateActionConnectionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Successfully created Action Connection </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too Many Request </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CreateActionConnectionResponse> createActionConnectionWithHttpInfo(CreateActionConnectionRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createActionConnection");
    }
    // create path and map variables
    String localVarPath = "/api/v2/actions/connections";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.ActionConnectionApi.createActionConnection", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<CreateActionConnectionResponse>() {});
  }

  /**
   * Create a new Action Connection.
   *
   * See {@link #createActionConnectionWithHttpInfo}.
   *
   * @param body  (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CreateActionConnectionResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CreateActionConnectionResponse>> createActionConnectionWithHttpInfoAsync(CreateActionConnectionRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<CreateActionConnectionResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling createActionConnection"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/actions/connections";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.ActionConnectionApi.createActionConnection", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CreateActionConnectionResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<CreateActionConnectionResponse>() {});
  }

  /**
 * Delete an existing Action Connection.
 *
 * See {@link #deleteActionConnectionWithHttpInfo}.
 *
 * @param connectionId The ID of the action connection (required)
 * @throws ApiException if fails to make API call
 */
  public  void  deleteActionConnection(String connectionId) throws ApiException {
    deleteActionConnectionWithHttpInfo(connectionId);
  }

  /**
 * Delete an existing Action Connection.
 *
 * See {@link #deleteActionConnectionWithHttpInfoAsync}.
 *
 * @param connectionId The ID of the action connection (required)
 * @return CompletableFuture
 */
  public CompletableFuture<Void>deleteActionConnectionAsync(String connectionId) {
    return deleteActionConnectionWithHttpInfoAsync(connectionId).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Delete an existing Action Connection. This API requires a <a href="https://docs.datadoghq.com/api/latest/action-connection/#register-a-new-app-key">registered application key</a>. Alternatively, you can configure these permissions <a href="https://docs.datadoghq.com/account_management/api-app-keys/#actions-api-access">in the UI</a>.</p>
   *
   * @param connectionId The ID of the action connection (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> The resource was deleted successfully. </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too Many Request </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteActionConnectionWithHttpInfo(String connectionId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'connectionId' is set
    if (connectionId == null) {
      throw new ApiException(400, "Missing the required parameter 'connectionId' when calling deleteActionConnection");
    }
    // create path and map variables
    String localVarPath = "/api/v2/actions/connections/{connection_id}"
      .replaceAll("\\{" + "connection_id" + "\\}", apiClient.escapeString(connectionId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.ActionConnectionApi.deleteActionConnection", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("DELETE", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
   * Delete an existing Action Connection.
   *
   * See {@link #deleteActionConnectionWithHttpInfo}.
   *
   * @param connectionId The ID of the action connection (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteActionConnectionWithHttpInfoAsync(String connectionId) {
    Object localVarPostBody = null;

    // verify the required parameter 'connectionId' is set
    if (connectionId == null) {
        CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'connectionId' when calling deleteActionConnection"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/actions/connections/{connection_id}"
      .replaceAll("\\{" + "connection_id" + "\\}", apiClient.escapeString(connectionId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.ActionConnectionApi.deleteActionConnection", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("DELETE", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
 * Get an existing Action Connection.
 *
 * See {@link #getActionConnectionWithHttpInfo}.
 *
 * @param connectionId The ID of the action connection (required)
 * @return GetActionConnectionResponse
 * @throws ApiException if fails to make API call
 */
  public GetActionConnectionResponse  getActionConnection(String connectionId) throws ApiException {
    return getActionConnectionWithHttpInfo(connectionId).getData();
  }

  /**
 * Get an existing Action Connection.
 *
 * See {@link #getActionConnectionWithHttpInfoAsync}.
 *
 * @param connectionId The ID of the action connection (required)
 * @return CompletableFuture&lt;GetActionConnectionResponse&gt;
 */
  public CompletableFuture<GetActionConnectionResponse>getActionConnectionAsync(String connectionId) {
    return getActionConnectionWithHttpInfoAsync(connectionId).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get an existing Action Connection. This API requires a <a href="https://docs.datadoghq.com/api/latest/action-connection/#register-a-new-app-key">registered application key</a>.</p>
   *
   * @param connectionId The ID of the action connection (required)
   * @return ApiResponse&lt;GetActionConnectionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> Successfully get Action Connection </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too Many Request </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<GetActionConnectionResponse> getActionConnectionWithHttpInfo(String connectionId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'connectionId' is set
    if (connectionId == null) {
      throw new ApiException(400, "Missing the required parameter 'connectionId' when calling getActionConnection");
    }
    // create path and map variables
    String localVarPath = "/api/v2/actions/connections/{connection_id}"
      .replaceAll("\\{" + "connection_id" + "\\}", apiClient.escapeString(connectionId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.ActionConnectionApi.getActionConnection", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<GetActionConnectionResponse>() {});
  }

  /**
   * Get an existing Action Connection.
   *
   * See {@link #getActionConnectionWithHttpInfo}.
   *
   * @param connectionId The ID of the action connection (required)
   * @return CompletableFuture&lt;ApiResponse&lt;GetActionConnectionResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<GetActionConnectionResponse>> getActionConnectionWithHttpInfoAsync(String connectionId) {
    Object localVarPostBody = null;

    // verify the required parameter 'connectionId' is set
    if (connectionId == null) {
        CompletableFuture<ApiResponse<GetActionConnectionResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'connectionId' when calling getActionConnection"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/actions/connections/{connection_id}"
      .replaceAll("\\{" + "connection_id" + "\\}", apiClient.escapeString(connectionId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.ActionConnectionApi.getActionConnection", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<GetActionConnectionResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<GetActionConnectionResponse>() {});
  }

  /**
 * Get an existing App Key Registration.
 *
 * See {@link #getAppKeyRegistrationWithHttpInfo}.
 *
 * @param appKeyId The ID of the app key (required)
 * @return GetAppKeyRegistrationResponse
 * @throws ApiException if fails to make API call
 */
  public GetAppKeyRegistrationResponse  getAppKeyRegistration(String appKeyId) throws ApiException {
    return getAppKeyRegistrationWithHttpInfo(appKeyId).getData();
  }

  /**
 * Get an existing App Key Registration.
 *
 * See {@link #getAppKeyRegistrationWithHttpInfoAsync}.
 *
 * @param appKeyId The ID of the app key (required)
 * @return CompletableFuture&lt;GetAppKeyRegistrationResponse&gt;
 */
  public CompletableFuture<GetAppKeyRegistrationResponse>getAppKeyRegistrationAsync(String appKeyId) {
    return getAppKeyRegistrationWithHttpInfoAsync(appKeyId).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get an existing App Key Registration</p>
   *
   * @param appKeyId The ID of the app key (required)
   * @return ApiResponse&lt;GetAppKeyRegistrationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<GetAppKeyRegistrationResponse> getAppKeyRegistrationWithHttpInfo(String appKeyId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'appKeyId' is set
    if (appKeyId == null) {
      throw new ApiException(400, "Missing the required parameter 'appKeyId' when calling getAppKeyRegistration");
    }
    // create path and map variables
    String localVarPath = "/api/v2/actions/app_key_registrations/{app_key_id}"
      .replaceAll("\\{" + "app_key_id" + "\\}", apiClient.escapeString(appKeyId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.ActionConnectionApi.getAppKeyRegistration", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<GetAppKeyRegistrationResponse>() {});
  }

  /**
   * Get an existing App Key Registration.
   *
   * See {@link #getAppKeyRegistrationWithHttpInfo}.
   *
   * @param appKeyId The ID of the app key (required)
   * @return CompletableFuture&lt;ApiResponse&lt;GetAppKeyRegistrationResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<GetAppKeyRegistrationResponse>> getAppKeyRegistrationWithHttpInfoAsync(String appKeyId) {
    Object localVarPostBody = null;

    // verify the required parameter 'appKeyId' is set
    if (appKeyId == null) {
        CompletableFuture<ApiResponse<GetAppKeyRegistrationResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'appKeyId' when calling getAppKeyRegistration"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/actions/app_key_registrations/{app_key_id}"
      .replaceAll("\\{" + "app_key_id" + "\\}", apiClient.escapeString(appKeyId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.ActionConnectionApi.getAppKeyRegistration", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<GetAppKeyRegistrationResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<GetAppKeyRegistrationResponse>() {});
  }

  /**
   * Manage optional parameters to listAppKeyRegistrations.
   */
  public static class ListAppKeyRegistrationsOptionalParameters {
    private Long pageSize;
    private Long pageNumber;

    /**
     * Set pageSize.
     * @param pageSize The number of App Key Registrations to return per page. (optional)
     * @return ListAppKeyRegistrationsOptionalParameters
     */
    public ListAppKeyRegistrationsOptionalParameters pageSize(Long pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set pageNumber.
     * @param pageNumber The page number to return. (optional)
     * @return ListAppKeyRegistrationsOptionalParameters
     */
    public ListAppKeyRegistrationsOptionalParameters pageNumber(Long pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }
  }

  /**
 * List App Key Registrations.
 *
 * See {@link #listAppKeyRegistrationsWithHttpInfo}.
 *
 * @return ListAppKeyRegistrationsResponse
 * @throws ApiException if fails to make API call
 */
  public ListAppKeyRegistrationsResponse listAppKeyRegistrations () throws ApiException {
    return listAppKeyRegistrationsWithHttpInfo(new ListAppKeyRegistrationsOptionalParameters()).getData();
  }

  /**
 * List App Key Registrations.
 *
 * See {@link #listAppKeyRegistrationsWithHttpInfoAsync}.
 *
 * @return CompletableFuture&lt;ListAppKeyRegistrationsResponse&gt;
 */
  public CompletableFuture<ListAppKeyRegistrationsResponse>listAppKeyRegistrationsAsync() {
    return listAppKeyRegistrationsWithHttpInfoAsync(new ListAppKeyRegistrationsOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * List App Key Registrations.
 *
 * See {@link #listAppKeyRegistrationsWithHttpInfo}.
 *
 * @param parameters Optional parameters for the request.
 * @return ListAppKeyRegistrationsResponse
 * @throws ApiException if fails to make API call
 */
  public ListAppKeyRegistrationsResponse listAppKeyRegistrations(ListAppKeyRegistrationsOptionalParameters parameters) throws ApiException {
    return listAppKeyRegistrationsWithHttpInfo(parameters).getData();
  }

  /**
 * List App Key Registrations.
 *
 * See {@link #listAppKeyRegistrationsWithHttpInfoAsync}.
 *
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;ListAppKeyRegistrationsResponse&gt;
 */
  public CompletableFuture<ListAppKeyRegistrationsResponse>listAppKeyRegistrationsAsync(ListAppKeyRegistrationsOptionalParameters parameters) {
    return listAppKeyRegistrationsWithHttpInfoAsync(parameters).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>List App Key Registrations</p>
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;ListAppKeyRegistrationsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ListAppKeyRegistrationsResponse> listAppKeyRegistrationsWithHttpInfo(ListAppKeyRegistrationsOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    Long pageSize = parameters.pageSize;
    Long pageNumber = parameters.pageNumber;
    // create path and map variables
    String localVarPath = "/api/v2/actions/app_key_registrations";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));

    Invocation.Builder builder = apiClient.createBuilder("v2.ActionConnectionApi.listAppKeyRegistrations", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<ListAppKeyRegistrationsResponse>() {});
  }

  /**
   * List App Key Registrations.
   *
   * See {@link #listAppKeyRegistrationsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;ListAppKeyRegistrationsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ListAppKeyRegistrationsResponse>> listAppKeyRegistrationsWithHttpInfoAsync(ListAppKeyRegistrationsOptionalParameters parameters) {
    Object localVarPostBody = null;
    Long pageSize = parameters.pageSize;
    Long pageNumber = parameters.pageNumber;
    // create path and map variables
    String localVarPath = "/api/v2/actions/app_key_registrations";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.ActionConnectionApi.listAppKeyRegistrations", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ListAppKeyRegistrationsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<ListAppKeyRegistrationsResponse>() {});
  }

  /**
 * Register a new App Key.
 *
 * See {@link #registerAppKeyWithHttpInfo}.
 *
 * @param appKeyId The ID of the app key (required)
 * @return RegisterAppKeyResponse
 * @throws ApiException if fails to make API call
 */
  public RegisterAppKeyResponse  registerAppKey(String appKeyId) throws ApiException {
    return registerAppKeyWithHttpInfo(appKeyId).getData();
  }

  /**
 * Register a new App Key.
 *
 * See {@link #registerAppKeyWithHttpInfoAsync}.
 *
 * @param appKeyId The ID of the app key (required)
 * @return CompletableFuture&lt;RegisterAppKeyResponse&gt;
 */
  public CompletableFuture<RegisterAppKeyResponse>registerAppKeyAsync(String appKeyId) {
    return registerAppKeyWithHttpInfoAsync(appKeyId).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Register a new App Key</p>
   *
   * @param appKeyId The ID of the app key (required)
   * @return ApiResponse&lt;RegisterAppKeyResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<RegisterAppKeyResponse> registerAppKeyWithHttpInfo(String appKeyId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'appKeyId' is set
    if (appKeyId == null) {
      throw new ApiException(400, "Missing the required parameter 'appKeyId' when calling registerAppKey");
    }
    // create path and map variables
    String localVarPath = "/api/v2/actions/app_key_registrations/{app_key_id}"
      .replaceAll("\\{" + "app_key_id" + "\\}", apiClient.escapeString(appKeyId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.ActionConnectionApi.registerAppKey", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("PUT", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<RegisterAppKeyResponse>() {});
  }

  /**
   * Register a new App Key.
   *
   * See {@link #registerAppKeyWithHttpInfo}.
   *
   * @param appKeyId The ID of the app key (required)
   * @return CompletableFuture&lt;ApiResponse&lt;RegisterAppKeyResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RegisterAppKeyResponse>> registerAppKeyWithHttpInfoAsync(String appKeyId) {
    Object localVarPostBody = null;

    // verify the required parameter 'appKeyId' is set
    if (appKeyId == null) {
        CompletableFuture<ApiResponse<RegisterAppKeyResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'appKeyId' when calling registerAppKey"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/actions/app_key_registrations/{app_key_id}"
      .replaceAll("\\{" + "app_key_id" + "\\}", apiClient.escapeString(appKeyId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.ActionConnectionApi.registerAppKey", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RegisterAppKeyResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("PUT", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<RegisterAppKeyResponse>() {});
  }

  /**
 * Unregister an App Key.
 *
 * See {@link #unregisterAppKeyWithHttpInfo}.
 *
 * @param appKeyId The ID of the app key (required)
 * @throws ApiException if fails to make API call
 */
  public  void  unregisterAppKey(String appKeyId) throws ApiException {
    unregisterAppKeyWithHttpInfo(appKeyId);
  }

  /**
 * Unregister an App Key.
 *
 * See {@link #unregisterAppKeyWithHttpInfoAsync}.
 *
 * @param appKeyId The ID of the app key (required)
 * @return CompletableFuture
 */
  public CompletableFuture<Void>unregisterAppKeyAsync(String appKeyId) {
    return unregisterAppKeyWithHttpInfoAsync(appKeyId).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Unregister an App Key</p>
   *
   * @param appKeyId The ID of the app key (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> unregisterAppKeyWithHttpInfo(String appKeyId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'appKeyId' is set
    if (appKeyId == null) {
      throw new ApiException(400, "Missing the required parameter 'appKeyId' when calling unregisterAppKey");
    }
    // create path and map variables
    String localVarPath = "/api/v2/actions/app_key_registrations/{app_key_id}"
      .replaceAll("\\{" + "app_key_id" + "\\}", apiClient.escapeString(appKeyId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.ActionConnectionApi.unregisterAppKey", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("DELETE", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
   * Unregister an App Key.
   *
   * See {@link #unregisterAppKeyWithHttpInfo}.
   *
   * @param appKeyId The ID of the app key (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> unregisterAppKeyWithHttpInfoAsync(String appKeyId) {
    Object localVarPostBody = null;

    // verify the required parameter 'appKeyId' is set
    if (appKeyId == null) {
        CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'appKeyId' when calling unregisterAppKey"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/actions/app_key_registrations/{app_key_id}"
      .replaceAll("\\{" + "app_key_id" + "\\}", apiClient.escapeString(appKeyId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.ActionConnectionApi.unregisterAppKey", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("DELETE", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
 * Update an existing Action Connection.
 *
 * See {@link #updateActionConnectionWithHttpInfo}.
 *
 * @param connectionId The ID of the action connection (required)
 * @param body Update an existing Action Connection request body (required)
 * @return UpdateActionConnectionResponse
 * @throws ApiException if fails to make API call
 */
  public UpdateActionConnectionResponse  updateActionConnection(String connectionId, UpdateActionConnectionRequest body) throws ApiException {
    return updateActionConnectionWithHttpInfo(connectionId, body).getData();
  }

  /**
 * Update an existing Action Connection.
 *
 * See {@link #updateActionConnectionWithHttpInfoAsync}.
 *
 * @param connectionId The ID of the action connection (required)
 * @param body Update an existing Action Connection request body (required)
 * @return CompletableFuture&lt;UpdateActionConnectionResponse&gt;
 */
  public CompletableFuture<UpdateActionConnectionResponse>updateActionConnectionAsync(String connectionId, UpdateActionConnectionRequest body) {
    return updateActionConnectionWithHttpInfoAsync(connectionId, body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Update an existing Action Connection. This API requires a <a href="https://docs.datadoghq.com/api/latest/action-connection/#register-a-new-app-key">registered application key</a>.</p>
   *
   * @param connectionId The ID of the action connection (required)
   * @param body Update an existing Action Connection request body (required)
   * @return ApiResponse&lt;UpdateActionConnectionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> Successfully updated Action Connection </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too Many Request </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<UpdateActionConnectionResponse> updateActionConnectionWithHttpInfo(String connectionId, UpdateActionConnectionRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'connectionId' is set
    if (connectionId == null) {
      throw new ApiException(400, "Missing the required parameter 'connectionId' when calling updateActionConnection");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateActionConnection");
    }
    // create path and map variables
    String localVarPath = "/api/v2/actions/connections/{connection_id}"
      .replaceAll("\\{" + "connection_id" + "\\}", apiClient.escapeString(connectionId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.ActionConnectionApi.updateActionConnection", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("PATCH", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<UpdateActionConnectionResponse>() {});
  }

  /**
   * Update an existing Action Connection.
   *
   * See {@link #updateActionConnectionWithHttpInfo}.
   *
   * @param connectionId The ID of the action connection (required)
   * @param body Update an existing Action Connection request body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;UpdateActionConnectionResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<UpdateActionConnectionResponse>> updateActionConnectionWithHttpInfoAsync(String connectionId, UpdateActionConnectionRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'connectionId' is set
    if (connectionId == null) {
        CompletableFuture<ApiResponse<UpdateActionConnectionResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'connectionId' when calling updateActionConnection"));
        return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<UpdateActionConnectionResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling updateActionConnection"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/actions/connections/{connection_id}"
      .replaceAll("\\{" + "connection_id" + "\\}", apiClient.escapeString(connectionId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.ActionConnectionApi.updateActionConnection", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<UpdateActionConnectionResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("PATCH", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<UpdateActionConnectionResponse>() {});
  }
}