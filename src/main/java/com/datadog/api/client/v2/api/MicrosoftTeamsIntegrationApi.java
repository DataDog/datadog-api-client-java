package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.MicrosoftTeamsApiHandleInfoResponse;
import com.datadog.api.client.v2.model.MicrosoftTeamsApiHandlesResponse;
import com.datadog.api.client.v2.model.MicrosoftTeamsCreateApiHandleRequest;
import com.datadog.api.client.v2.model.MicrosoftTeamsCreateApiHandleResponse;
import com.datadog.api.client.v2.model.MicrosoftTeamsGetChannelByNameResponse;
import com.datadog.api.client.v2.model.MicrosoftTeamsUpdateApiHandleRequest;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MicrosoftTeamsIntegrationApi {
  private ApiClient apiClient;

  public MicrosoftTeamsIntegrationApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public MicrosoftTeamsIntegrationApi(ApiClient apiClient) {
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
   * Create handle.
   *
   * <p>See {@link #createApiHandleWithHttpInfo}.
   *
   * @param body Handle payload. (required)
   * @return MicrosoftTeamsCreateApiHandleResponse
   * @throws ApiException if fails to make API call
   */
  public MicrosoftTeamsCreateApiHandleResponse createApiHandle(
      MicrosoftTeamsCreateApiHandleRequest body) throws ApiException {
    return createApiHandleWithHttpInfo(body).getData();
  }

  /**
   * Create handle.
   *
   * <p>See {@link #createApiHandleWithHttpInfoAsync}.
   *
   * @param body Handle payload. (required)
   * @return CompletableFuture&lt;MicrosoftTeamsCreateApiHandleResponse&gt;
   */
  public CompletableFuture<MicrosoftTeamsCreateApiHandleResponse> createApiHandleAsync(
      MicrosoftTeamsCreateApiHandleRequest body) {
    return createApiHandleWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a handle in the Datadog Microsoft Teams integration.
   *
   * @param body Handle payload. (required)
   * @return ApiResponse&lt;MicrosoftTeamsCreateApiHandleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> CREATED </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 412 </td><td> Failed Precondition </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<MicrosoftTeamsCreateApiHandleResponse> createApiHandleWithHttpInfo(
      MicrosoftTeamsCreateApiHandleRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createApiHandle");
    }
    // create path and map variables
    String localVarPath = "/api/v2/integration/ms-teams/configuration/tenant-based-handles";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.MicrosoftTeamsIntegrationApi.createApiHandle",
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
        new GenericType<MicrosoftTeamsCreateApiHandleResponse>() {});
  }

  /**
   * Create handle.
   *
   * <p>See {@link #createApiHandleWithHttpInfo}.
   *
   * @param body Handle payload. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;MicrosoftTeamsCreateApiHandleResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<MicrosoftTeamsCreateApiHandleResponse>>
      createApiHandleWithHttpInfoAsync(MicrosoftTeamsCreateApiHandleRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<MicrosoftTeamsCreateApiHandleResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createApiHandle"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/integration/ms-teams/configuration/tenant-based-handles";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.MicrosoftTeamsIntegrationApi.createApiHandle",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<MicrosoftTeamsCreateApiHandleResponse>> result =
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
        new GenericType<MicrosoftTeamsCreateApiHandleResponse>() {});
  }

  /**
   * Delete handle.
   *
   * <p>See {@link #deleteApiHandleWithHttpInfo}.
   *
   * @param handleId Your handle id. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteApiHandle(String handleId) throws ApiException {
    deleteApiHandleWithHttpInfo(handleId);
  }

  /**
   * Delete handle.
   *
   * <p>See {@link #deleteApiHandleWithHttpInfoAsync}.
   *
   * @param handleId Your handle id. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteApiHandleAsync(String handleId) {
    return deleteApiHandleWithHttpInfoAsync(handleId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete a handle from the Datadog Microsoft Teams integration.
   *
   * @param handleId Your handle id. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 412 </td><td> Failed Precondition </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteApiHandleWithHttpInfo(String handleId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'handleId' is set
    if (handleId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'handleId' when calling deleteApiHandle");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration/ms-teams/configuration/tenant-based-handles/{handle_id}"
            .replaceAll("\\{" + "handle_id" + "\\}", apiClient.escapeString(handleId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.MicrosoftTeamsIntegrationApi.deleteApiHandle",
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
   * Delete handle.
   *
   * <p>See {@link #deleteApiHandleWithHttpInfo}.
   *
   * @param handleId Your handle id. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteApiHandleWithHttpInfoAsync(String handleId) {
    Object localVarPostBody = null;

    // verify the required parameter 'handleId' is set
    if (handleId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'handleId' when calling deleteApiHandle"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration/ms-teams/configuration/tenant-based-handles/{handle_id}"
            .replaceAll("\\{" + "handle_id" + "\\}", apiClient.escapeString(handleId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.MicrosoftTeamsIntegrationApi.deleteApiHandle",
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
   * Get handle information.
   *
   * <p>See {@link #getApiHandleWithHttpInfo}.
   *
   * @param handleId Your handle id. (required)
   * @return MicrosoftTeamsApiHandleInfoResponse
   * @throws ApiException if fails to make API call
   */
  public MicrosoftTeamsApiHandleInfoResponse getApiHandle(String handleId) throws ApiException {
    return getApiHandleWithHttpInfo(handleId).getData();
  }

  /**
   * Get handle information.
   *
   * <p>See {@link #getApiHandleWithHttpInfoAsync}.
   *
   * @param handleId Your handle id. (required)
   * @return CompletableFuture&lt;MicrosoftTeamsApiHandleInfoResponse&gt;
   */
  public CompletableFuture<MicrosoftTeamsApiHandleInfoResponse> getApiHandleAsync(String handleId) {
    return getApiHandleWithHttpInfoAsync(handleId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the tenant, team, and channel information of a handle from the Datadog Microsoft Teams
   * integration.
   *
   * @param handleId Your handle id. (required)
   * @return ApiResponse&lt;MicrosoftTeamsApiHandleInfoResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 412 </td><td> Failed Precondition </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<MicrosoftTeamsApiHandleInfoResponse> getApiHandleWithHttpInfo(String handleId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'handleId' is set
    if (handleId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'handleId' when calling getApiHandle");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration/ms-teams/configuration/tenant-based-handles/{handle_id}"
            .replaceAll("\\{" + "handle_id" + "\\}", apiClient.escapeString(handleId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.MicrosoftTeamsIntegrationApi.getApiHandle",
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
        new GenericType<MicrosoftTeamsApiHandleInfoResponse>() {});
  }

  /**
   * Get handle information.
   *
   * <p>See {@link #getApiHandleWithHttpInfo}.
   *
   * @param handleId Your handle id. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;MicrosoftTeamsApiHandleInfoResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<MicrosoftTeamsApiHandleInfoResponse>>
      getApiHandleWithHttpInfoAsync(String handleId) {
    Object localVarPostBody = null;

    // verify the required parameter 'handleId' is set
    if (handleId == null) {
      CompletableFuture<ApiResponse<MicrosoftTeamsApiHandleInfoResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'handleId' when calling getApiHandle"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration/ms-teams/configuration/tenant-based-handles/{handle_id}"
            .replaceAll("\\{" + "handle_id" + "\\}", apiClient.escapeString(handleId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.MicrosoftTeamsIntegrationApi.getApiHandle",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<MicrosoftTeamsApiHandleInfoResponse>> result =
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
        new GenericType<MicrosoftTeamsApiHandleInfoResponse>() {});
  }

  /**
   * Get handle information by name.
   *
   * <p>See {@link #getApiHandleByNameWithHttpInfo}.
   *
   * @param handleName Your handle name. (required)
   * @return MicrosoftTeamsApiHandleInfoResponse
   * @throws ApiException if fails to make API call
   */
  public MicrosoftTeamsApiHandleInfoResponse getApiHandleByName(String handleName)
      throws ApiException {
    return getApiHandleByNameWithHttpInfo(handleName).getData();
  }

  /**
   * Get handle information by name.
   *
   * <p>See {@link #getApiHandleByNameWithHttpInfoAsync}.
   *
   * @param handleName Your handle name. (required)
   * @return CompletableFuture&lt;MicrosoftTeamsApiHandleInfoResponse&gt;
   */
  public CompletableFuture<MicrosoftTeamsApiHandleInfoResponse> getApiHandleByNameAsync(
      String handleName) {
    return getApiHandleByNameWithHttpInfoAsync(handleName)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the tenant, team, and channel information of a handle by name from the Datadog Microsoft
   * Teams integration.
   *
   * @param handleName Your handle name. (required)
   * @return ApiResponse&lt;MicrosoftTeamsApiHandleInfoResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 412 </td><td> Failed Precondition </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<MicrosoftTeamsApiHandleInfoResponse> getApiHandleByNameWithHttpInfo(
      String handleName) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'handleName' is set
    if (handleName == null) {
      throw new ApiException(
          400, "Missing the required parameter 'handleName' when calling getApiHandleByName");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration/ms-teams/configuration/tenant-based-handles/name/{handle_name}"
            .replaceAll(
                "\\{" + "handle_name" + "\\}", apiClient.escapeString(handleName.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.MicrosoftTeamsIntegrationApi.getApiHandleByName",
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
        new GenericType<MicrosoftTeamsApiHandleInfoResponse>() {});
  }

  /**
   * Get handle information by name.
   *
   * <p>See {@link #getApiHandleByNameWithHttpInfo}.
   *
   * @param handleName Your handle name. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;MicrosoftTeamsApiHandleInfoResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<MicrosoftTeamsApiHandleInfoResponse>>
      getApiHandleByNameWithHttpInfoAsync(String handleName) {
    Object localVarPostBody = null;

    // verify the required parameter 'handleName' is set
    if (handleName == null) {
      CompletableFuture<ApiResponse<MicrosoftTeamsApiHandleInfoResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'handleName' when calling getApiHandleByName"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration/ms-teams/configuration/tenant-based-handles/name/{handle_name}"
            .replaceAll(
                "\\{" + "handle_name" + "\\}", apiClient.escapeString(handleName.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.MicrosoftTeamsIntegrationApi.getApiHandleByName",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<MicrosoftTeamsApiHandleInfoResponse>> result =
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
        new GenericType<MicrosoftTeamsApiHandleInfoResponse>() {});
  }

  /**
   * Get channel information by name.
   *
   * <p>See {@link #getChannelByNameWithHttpInfo}.
   *
   * @param tenantName Your tenant name. (required)
   * @param teamName Your team name. (required)
   * @param channelName Your channel name. (required)
   * @return MicrosoftTeamsGetChannelByNameResponse
   * @throws ApiException if fails to make API call
   */
  public MicrosoftTeamsGetChannelByNameResponse getChannelByName(
      String tenantName, String teamName, String channelName) throws ApiException {
    return getChannelByNameWithHttpInfo(tenantName, teamName, channelName).getData();
  }

  /**
   * Get channel information by name.
   *
   * <p>See {@link #getChannelByNameWithHttpInfoAsync}.
   *
   * @param tenantName Your tenant name. (required)
   * @param teamName Your team name. (required)
   * @param channelName Your channel name. (required)
   * @return CompletableFuture&lt;MicrosoftTeamsGetChannelByNameResponse&gt;
   */
  public CompletableFuture<MicrosoftTeamsGetChannelByNameResponse> getChannelByNameAsync(
      String tenantName, String teamName, String channelName) {
    return getChannelByNameWithHttpInfoAsync(tenantName, teamName, channelName)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the tenant, team, and channel ID of a channel in the Datadog Microsoft Teams integration.
   *
   * @param tenantName Your tenant name. (required)
   * @param teamName Your team name. (required)
   * @param channelName Your channel name. (required)
   * @return ApiResponse&lt;MicrosoftTeamsGetChannelByNameResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<MicrosoftTeamsGetChannelByNameResponse> getChannelByNameWithHttpInfo(
      String tenantName, String teamName, String channelName) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'tenantName' is set
    if (tenantName == null) {
      throw new ApiException(
          400, "Missing the required parameter 'tenantName' when calling getChannelByName");
    }

    // verify the required parameter 'teamName' is set
    if (teamName == null) {
      throw new ApiException(
          400, "Missing the required parameter 'teamName' when calling getChannelByName");
    }

    // verify the required parameter 'channelName' is set
    if (channelName == null) {
      throw new ApiException(
          400, "Missing the required parameter 'channelName' when calling getChannelByName");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration/ms-teams/configuration/channel/{tenant_name}/{team_name}/{channel_name}"
            .replaceAll(
                "\\{" + "tenant_name" + "\\}", apiClient.escapeString(tenantName.toString()))
            .replaceAll("\\{" + "team_name" + "\\}", apiClient.escapeString(teamName.toString()))
            .replaceAll(
                "\\{" + "channel_name" + "\\}", apiClient.escapeString(channelName.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.MicrosoftTeamsIntegrationApi.getChannelByName",
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
        new GenericType<MicrosoftTeamsGetChannelByNameResponse>() {});
  }

  /**
   * Get channel information by name.
   *
   * <p>See {@link #getChannelByNameWithHttpInfo}.
   *
   * @param tenantName Your tenant name. (required)
   * @param teamName Your team name. (required)
   * @param channelName Your channel name. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;MicrosoftTeamsGetChannelByNameResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<MicrosoftTeamsGetChannelByNameResponse>>
      getChannelByNameWithHttpInfoAsync(String tenantName, String teamName, String channelName) {
    Object localVarPostBody = null;

    // verify the required parameter 'tenantName' is set
    if (tenantName == null) {
      CompletableFuture<ApiResponse<MicrosoftTeamsGetChannelByNameResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'tenantName' when calling getChannelByName"));
      return result;
    }

    // verify the required parameter 'teamName' is set
    if (teamName == null) {
      CompletableFuture<ApiResponse<MicrosoftTeamsGetChannelByNameResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'teamName' when calling getChannelByName"));
      return result;
    }

    // verify the required parameter 'channelName' is set
    if (channelName == null) {
      CompletableFuture<ApiResponse<MicrosoftTeamsGetChannelByNameResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'channelName' when calling getChannelByName"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration/ms-teams/configuration/channel/{tenant_name}/{team_name}/{channel_name}"
            .replaceAll(
                "\\{" + "tenant_name" + "\\}", apiClient.escapeString(tenantName.toString()))
            .replaceAll("\\{" + "team_name" + "\\}", apiClient.escapeString(teamName.toString()))
            .replaceAll(
                "\\{" + "channel_name" + "\\}", apiClient.escapeString(channelName.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.MicrosoftTeamsIntegrationApi.getChannelByName",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<MicrosoftTeamsGetChannelByNameResponse>> result =
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
        new GenericType<MicrosoftTeamsGetChannelByNameResponse>() {});
  }

  /** Manage optional parameters to listApiHandles. */
  public static class ListApiHandlesOptionalParameters {
    private String tenantId;

    /**
     * Set tenantId.
     *
     * @param tenantId Your tenant id. (optional)
     * @return ListApiHandlesOptionalParameters
     */
    public ListApiHandlesOptionalParameters tenantId(String tenantId) {
      this.tenantId = tenantId;
      return this;
    }
  }

  /**
   * Get all handles.
   *
   * <p>See {@link #listApiHandlesWithHttpInfo}.
   *
   * @return MicrosoftTeamsApiHandlesResponse
   * @throws ApiException if fails to make API call
   */
  public MicrosoftTeamsApiHandlesResponse listApiHandles() throws ApiException {
    return listApiHandlesWithHttpInfo(new ListApiHandlesOptionalParameters()).getData();
  }

  /**
   * Get all handles.
   *
   * <p>See {@link #listApiHandlesWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;MicrosoftTeamsApiHandlesResponse&gt;
   */
  public CompletableFuture<MicrosoftTeamsApiHandlesResponse> listApiHandlesAsync() {
    return listApiHandlesWithHttpInfoAsync(new ListApiHandlesOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get all handles.
   *
   * <p>See {@link #listApiHandlesWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return MicrosoftTeamsApiHandlesResponse
   * @throws ApiException if fails to make API call
   */
  public MicrosoftTeamsApiHandlesResponse listApiHandles(
      ListApiHandlesOptionalParameters parameters) throws ApiException {
    return listApiHandlesWithHttpInfo(parameters).getData();
  }

  /**
   * Get all handles.
   *
   * <p>See {@link #listApiHandlesWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;MicrosoftTeamsApiHandlesResponse&gt;
   */
  public CompletableFuture<MicrosoftTeamsApiHandlesResponse> listApiHandlesAsync(
      ListApiHandlesOptionalParameters parameters) {
    return listApiHandlesWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a list of all handles from the Datadog Microsoft Teams integration.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;MicrosoftTeamsApiHandlesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 412 </td><td> Failed Precondition </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<MicrosoftTeamsApiHandlesResponse> listApiHandlesWithHttpInfo(
      ListApiHandlesOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    String tenantId = parameters.tenantId;
    // create path and map variables
    String localVarPath = "/api/v2/integration/ms-teams/configuration/tenant-based-handles";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "tenant_id", tenantId));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.MicrosoftTeamsIntegrationApi.listApiHandles",
            localVarPath,
            localVarQueryParams,
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
        new GenericType<MicrosoftTeamsApiHandlesResponse>() {});
  }

  /**
   * Get all handles.
   *
   * <p>See {@link #listApiHandlesWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;MicrosoftTeamsApiHandlesResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<MicrosoftTeamsApiHandlesResponse>>
      listApiHandlesWithHttpInfoAsync(ListApiHandlesOptionalParameters parameters) {
    Object localVarPostBody = null;
    String tenantId = parameters.tenantId;
    // create path and map variables
    String localVarPath = "/api/v2/integration/ms-teams/configuration/tenant-based-handles";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "tenant_id", tenantId));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.MicrosoftTeamsIntegrationApi.listApiHandles",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<MicrosoftTeamsApiHandlesResponse>> result =
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
        new GenericType<MicrosoftTeamsApiHandlesResponse>() {});
  }

  /**
   * Update handle.
   *
   * <p>See {@link #updateApiHandleWithHttpInfo}.
   *
   * @param handleId Your handle id. (required)
   * @param body Opsgenie service payload. (required)
   * @return MicrosoftTeamsApiHandleInfoResponse
   * @throws ApiException if fails to make API call
   */
  public MicrosoftTeamsApiHandleInfoResponse updateApiHandle(
      String handleId, MicrosoftTeamsUpdateApiHandleRequest body) throws ApiException {
    return updateApiHandleWithHttpInfo(handleId, body).getData();
  }

  /**
   * Update handle.
   *
   * <p>See {@link #updateApiHandleWithHttpInfoAsync}.
   *
   * @param handleId Your handle id. (required)
   * @param body Opsgenie service payload. (required)
   * @return CompletableFuture&lt;MicrosoftTeamsApiHandleInfoResponse&gt;
   */
  public CompletableFuture<MicrosoftTeamsApiHandleInfoResponse> updateApiHandleAsync(
      String handleId, MicrosoftTeamsUpdateApiHandleRequest body) {
    return updateApiHandleWithHttpInfoAsync(handleId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update a handle from the Datadog Microsoft Teams integration.
   *
   * @param handleId Your handle id. (required)
   * @param body Opsgenie service payload. (required)
   * @return ApiResponse&lt;MicrosoftTeamsApiHandleInfoResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 412 </td><td> Failed Precondition </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<MicrosoftTeamsApiHandleInfoResponse> updateApiHandleWithHttpInfo(
      String handleId, MicrosoftTeamsUpdateApiHandleRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'handleId' is set
    if (handleId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'handleId' when calling updateApiHandle");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateApiHandle");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration/ms-teams/configuration/tenant-based-handles/{handle_id}"
            .replaceAll("\\{" + "handle_id" + "\\}", apiClient.escapeString(handleId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.MicrosoftTeamsIntegrationApi.updateApiHandle",
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
        new GenericType<MicrosoftTeamsApiHandleInfoResponse>() {});
  }

  /**
   * Update handle.
   *
   * <p>See {@link #updateApiHandleWithHttpInfo}.
   *
   * @param handleId Your handle id. (required)
   * @param body Opsgenie service payload. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;MicrosoftTeamsApiHandleInfoResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<MicrosoftTeamsApiHandleInfoResponse>>
      updateApiHandleWithHttpInfoAsync(String handleId, MicrosoftTeamsUpdateApiHandleRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'handleId' is set
    if (handleId == null) {
      CompletableFuture<ApiResponse<MicrosoftTeamsApiHandleInfoResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'handleId' when calling updateApiHandle"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<MicrosoftTeamsApiHandleInfoResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateApiHandle"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration/ms-teams/configuration/tenant-based-handles/{handle_id}"
            .replaceAll("\\{" + "handle_id" + "\\}", apiClient.escapeString(handleId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.MicrosoftTeamsIntegrationApi.updateApiHandle",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<MicrosoftTeamsApiHandleInfoResponse>> result =
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
        new GenericType<MicrosoftTeamsApiHandleInfoResponse>() {});
  }
}
