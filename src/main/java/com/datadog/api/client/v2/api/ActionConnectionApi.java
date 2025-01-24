package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.CreateActionConnectionRequest;
import com.datadog.api.client.v2.model.CreateActionConnectionResponse;
import com.datadog.api.client.v2.model.GetActionConnectionResponse;
import com.datadog.api.client.v2.model.UpdateActionConnectionRequest;
import com.datadog.api.client.v2.model.UpdateActionConnectionResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
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
   * <p>See {@link #createActionConnectionWithHttpInfo}.
   *
   * @param body (required)
   * @return CreateActionConnectionResponse
   * @throws ApiException if fails to make API call
   */
  public CreateActionConnectionResponse createActionConnection(CreateActionConnectionRequest body)
      throws ApiException {
    return createActionConnectionWithHttpInfo(body).getData();
  }

  /**
   * Create a new Action Connection.
   *
   * <p>See {@link #createActionConnectionWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;CreateActionConnectionResponse&gt;
   */
  public CompletableFuture<CreateActionConnectionResponse> createActionConnectionAsync(
      CreateActionConnectionRequest body) {
    return createActionConnectionWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a new Action Connection.
   *
   * @param body (required)
   * @return ApiResponse&lt;CreateActionConnectionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Successfully created an Action Connection. </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too Many Request </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CreateActionConnectionResponse> createActionConnectionWithHttpInfo(
      CreateActionConnectionRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createActionConnection");
    }
    // create path and map variables
    String localVarPath = "/api/v2/actions/connections";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ActionConnectionApi.createActionConnection",
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
        new GenericType<CreateActionConnectionResponse>() {});
  }

  /**
   * Create a new Action Connection.
   *
   * <p>See {@link #createActionConnectionWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CreateActionConnectionResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CreateActionConnectionResponse>>
      createActionConnectionWithHttpInfoAsync(CreateActionConnectionRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<CreateActionConnectionResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createActionConnection"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/actions/connections";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ActionConnectionApi.createActionConnection",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CreateActionConnectionResponse>> result =
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
        new GenericType<CreateActionConnectionResponse>() {});
  }

  /**
   * Delete an existing Action Connection.
   *
   * <p>See {@link #deleteActionConnectionWithHttpInfo}.
   *
   * @param connectionId The ID of the Action Connection. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteActionConnection(String connectionId) throws ApiException {
    deleteActionConnectionWithHttpInfo(connectionId);
  }

  /**
   * Delete an existing Action Connection.
   *
   * <p>See {@link #deleteActionConnectionWithHttpInfoAsync}.
   *
   * @param connectionId The ID of the Action Connection. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteActionConnectionAsync(String connectionId) {
    return deleteActionConnectionWithHttpInfoAsync(connectionId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete an existing Action Connection.
   *
   * @param connectionId The ID of the Action Connection. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> The resource was deleted successfully. </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too Many Request </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteActionConnectionWithHttpInfo(String connectionId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'connectionId' is set
    if (connectionId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'connectionId' when calling deleteActionConnection");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/actions/connections/{connection_id}"
            .replaceAll(
                "\\{" + "connection_id" + "\\}", apiClient.escapeString(connectionId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ActionConnectionApi.deleteActionConnection",
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
   * Delete an existing Action Connection.
   *
   * <p>See {@link #deleteActionConnectionWithHttpInfo}.
   *
   * @param connectionId The ID of the Action Connection. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteActionConnectionWithHttpInfoAsync(
      String connectionId) {
    Object localVarPostBody = null;

    // verify the required parameter 'connectionId' is set
    if (connectionId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'connectionId' when calling deleteActionConnection"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/actions/connections/{connection_id}"
            .replaceAll(
                "\\{" + "connection_id" + "\\}", apiClient.escapeString(connectionId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ActionConnectionApi.deleteActionConnection",
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
   * Get an existing Action Connection.
   *
   * <p>See {@link #getActionConnectionWithHttpInfo}.
   *
   * @param connectionId The ID of the Action Connection. (required)
   * @return GetActionConnectionResponse
   * @throws ApiException if fails to make API call
   */
  public GetActionConnectionResponse getActionConnection(String connectionId) throws ApiException {
    return getActionConnectionWithHttpInfo(connectionId).getData();
  }

  /**
   * Get an existing Action Connection.
   *
   * <p>See {@link #getActionConnectionWithHttpInfoAsync}.
   *
   * @param connectionId The ID of the Action Connection. (required)
   * @return CompletableFuture&lt;GetActionConnectionResponse&gt;
   */
  public CompletableFuture<GetActionConnectionResponse> getActionConnectionAsync(
      String connectionId) {
    return getActionConnectionWithHttpInfoAsync(connectionId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get an existing Action Connection.
   *
   * @param connectionId The ID of the Action Connection. (required)
   * @return ApiResponse&lt;GetActionConnectionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> Successfully got an Action Connection. </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too Many Request </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<GetActionConnectionResponse> getActionConnectionWithHttpInfo(
      String connectionId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'connectionId' is set
    if (connectionId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'connectionId' when calling getActionConnection");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/actions/connections/{connection_id}"
            .replaceAll(
                "\\{" + "connection_id" + "\\}", apiClient.escapeString(connectionId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ActionConnectionApi.getActionConnection",
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
        new GenericType<GetActionConnectionResponse>() {});
  }

  /**
   * Get an existing Action Connection.
   *
   * <p>See {@link #getActionConnectionWithHttpInfo}.
   *
   * @param connectionId The ID of the Action Connection. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;GetActionConnectionResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<GetActionConnectionResponse>>
      getActionConnectionWithHttpInfoAsync(String connectionId) {
    Object localVarPostBody = null;

    // verify the required parameter 'connectionId' is set
    if (connectionId == null) {
      CompletableFuture<ApiResponse<GetActionConnectionResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'connectionId' when calling getActionConnection"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/actions/connections/{connection_id}"
            .replaceAll(
                "\\{" + "connection_id" + "\\}", apiClient.escapeString(connectionId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ActionConnectionApi.getActionConnection",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<GetActionConnectionResponse>> result =
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
        new GenericType<GetActionConnectionResponse>() {});
  }

  /**
   * Update an existing Action Connection.
   *
   * <p>See {@link #updateActionConnectionWithHttpInfo}.
   *
   * @param connectionId The ID of the Action Connection. (required)
   * @param body Update an existing Action Connection request body. (required)
   * @return UpdateActionConnectionResponse
   * @throws ApiException if fails to make API call
   */
  public UpdateActionConnectionResponse updateActionConnection(
      String connectionId, UpdateActionConnectionRequest body) throws ApiException {
    return updateActionConnectionWithHttpInfo(connectionId, body).getData();
  }

  /**
   * Update an existing Action Connection.
   *
   * <p>See {@link #updateActionConnectionWithHttpInfoAsync}.
   *
   * @param connectionId The ID of the Action Connection. (required)
   * @param body Update an existing Action Connection request body. (required)
   * @return CompletableFuture&lt;UpdateActionConnectionResponse&gt;
   */
  public CompletableFuture<UpdateActionConnectionResponse> updateActionConnectionAsync(
      String connectionId, UpdateActionConnectionRequest body) {
    return updateActionConnectionWithHttpInfoAsync(connectionId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update an existing Action Connection
   *
   * @param connectionId The ID of the Action Connection. (required)
   * @param body Update an existing Action Connection request body. (required)
   * @return ApiResponse&lt;UpdateActionConnectionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> Successfully updated an Action Connection. </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too Many Request </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<UpdateActionConnectionResponse> updateActionConnectionWithHttpInfo(
      String connectionId, UpdateActionConnectionRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'connectionId' is set
    if (connectionId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'connectionId' when calling updateActionConnection");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateActionConnection");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/actions/connections/{connection_id}"
            .replaceAll(
                "\\{" + "connection_id" + "\\}", apiClient.escapeString(connectionId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ActionConnectionApi.updateActionConnection",
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
        new GenericType<UpdateActionConnectionResponse>() {});
  }

  /**
   * Update an existing Action Connection.
   *
   * <p>See {@link #updateActionConnectionWithHttpInfo}.
   *
   * @param connectionId The ID of the Action Connection. (required)
   * @param body Update an existing Action Connection request body. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;UpdateActionConnectionResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<UpdateActionConnectionResponse>>
      updateActionConnectionWithHttpInfoAsync(
          String connectionId, UpdateActionConnectionRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'connectionId' is set
    if (connectionId == null) {
      CompletableFuture<ApiResponse<UpdateActionConnectionResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'connectionId' when calling updateActionConnection"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<UpdateActionConnectionResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateActionConnection"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/actions/connections/{connection_id}"
            .replaceAll(
                "\\{" + "connection_id" + "\\}", apiClient.escapeString(connectionId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ActionConnectionApi.updateActionConnection",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<UpdateActionConnectionResponse>> result =
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
        new GenericType<UpdateActionConnectionResponse>() {});
  }
}
