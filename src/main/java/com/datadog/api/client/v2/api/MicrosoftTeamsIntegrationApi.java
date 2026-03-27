
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
import com.datadog.api.client.v2.model.MicrosoftTeamsGetChannelByNameResponse;
import com.datadog.api.client.v2.model.MicrosoftTeamsTenantBasedHandlesResponse;
import com.datadog.api.client.v2.model.MicrosoftTeamsTenantBasedHandleResponse;
import com.datadog.api.client.v2.model.MicrosoftTeamsCreateTenantBasedHandleRequest;
import com.datadog.api.client.v2.model.MicrosoftTeamsUpdateTenantBasedHandleRequest;
import com.datadog.api.client.v2.model.MicrosoftTeamsWorkflowsWebhookHandlesResponse;
import com.datadog.api.client.v2.model.MicrosoftTeamsWorkflowsWebhookHandleResponse;
import com.datadog.api.client.v2.model.MicrosoftTeamsCreateWorkflowsWebhookHandleRequest;
import com.datadog.api.client.v2.model.MicrosoftTeamsUpdateWorkflowsWebhookHandleRequest;


@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
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
 * Create tenant-based handle.
 *
 * See {@link #createTenantBasedHandleWithHttpInfo}.
 *
 * @param body Tenant-based handle payload. (required)
 * @return MicrosoftTeamsTenantBasedHandleResponse
 * @throws ApiException if fails to make API call
 */
  public MicrosoftTeamsTenantBasedHandleResponse  createTenantBasedHandle(MicrosoftTeamsCreateTenantBasedHandleRequest body) throws ApiException {
    return createTenantBasedHandleWithHttpInfo(body).getData();
  }

  /**
 * Create tenant-based handle.
 *
 * See {@link #createTenantBasedHandleWithHttpInfoAsync}.
 *
 * @param body Tenant-based handle payload. (required)
 * @return CompletableFuture&lt;MicrosoftTeamsTenantBasedHandleResponse&gt;
 */
  public CompletableFuture<MicrosoftTeamsTenantBasedHandleResponse>createTenantBasedHandleAsync(MicrosoftTeamsCreateTenantBasedHandleRequest body) {
    return createTenantBasedHandleWithHttpInfoAsync(body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Create a tenant-based handle in the Datadog Microsoft Teams integration.</p>
   *
   * @param body Tenant-based handle payload. (required)
   * @return ApiResponse&lt;MicrosoftTeamsTenantBasedHandleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
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
  public ApiResponse<MicrosoftTeamsTenantBasedHandleResponse> createTenantBasedHandleWithHttpInfo(MicrosoftTeamsCreateTenantBasedHandleRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createTenantBasedHandle");
    }
    // create path and map variables
    String localVarPath = "/api/v2/integration/ms-teams/configuration/tenant-based-handles";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.MicrosoftTeamsIntegrationApi.createTenantBasedHandle", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<MicrosoftTeamsTenantBasedHandleResponse>() {});
  }

  /**
   * Create tenant-based handle.
   *
   * See {@link #createTenantBasedHandleWithHttpInfo}.
   *
   * @param body Tenant-based handle payload. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;MicrosoftTeamsTenantBasedHandleResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<MicrosoftTeamsTenantBasedHandleResponse>> createTenantBasedHandleWithHttpInfoAsync(MicrosoftTeamsCreateTenantBasedHandleRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<MicrosoftTeamsTenantBasedHandleResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling createTenantBasedHandle"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/integration/ms-teams/configuration/tenant-based-handles";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.MicrosoftTeamsIntegrationApi.createTenantBasedHandle", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<MicrosoftTeamsTenantBasedHandleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<MicrosoftTeamsTenantBasedHandleResponse>() {});
  }

  /**
 * Create Workflows webhook handle.
 *
 * See {@link #createWorkflowsWebhookHandleWithHttpInfo}.
 *
 * @param body Workflows Webhook handle payload. (required)
 * @return MicrosoftTeamsWorkflowsWebhookHandleResponse
 * @throws ApiException if fails to make API call
 */
  public MicrosoftTeamsWorkflowsWebhookHandleResponse  createWorkflowsWebhookHandle(MicrosoftTeamsCreateWorkflowsWebhookHandleRequest body) throws ApiException {
    return createWorkflowsWebhookHandleWithHttpInfo(body).getData();
  }

  /**
 * Create Workflows webhook handle.
 *
 * See {@link #createWorkflowsWebhookHandleWithHttpInfoAsync}.
 *
 * @param body Workflows Webhook handle payload. (required)
 * @return CompletableFuture&lt;MicrosoftTeamsWorkflowsWebhookHandleResponse&gt;
 */
  public CompletableFuture<MicrosoftTeamsWorkflowsWebhookHandleResponse>createWorkflowsWebhookHandleAsync(MicrosoftTeamsCreateWorkflowsWebhookHandleRequest body) {
    return createWorkflowsWebhookHandleWithHttpInfoAsync(body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Create a Workflows webhook handle in the Datadog Microsoft Teams integration.</p>
   *
   * @param body Workflows Webhook handle payload. (required)
   * @return ApiResponse&lt;MicrosoftTeamsWorkflowsWebhookHandleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
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
  public ApiResponse<MicrosoftTeamsWorkflowsWebhookHandleResponse> createWorkflowsWebhookHandleWithHttpInfo(MicrosoftTeamsCreateWorkflowsWebhookHandleRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createWorkflowsWebhookHandle");
    }
    // create path and map variables
    String localVarPath = "/api/v2/integration/ms-teams/configuration/workflows-webhook-handles";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.MicrosoftTeamsIntegrationApi.createWorkflowsWebhookHandle", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<MicrosoftTeamsWorkflowsWebhookHandleResponse>() {});
  }

  /**
   * Create Workflows webhook handle.
   *
   * See {@link #createWorkflowsWebhookHandleWithHttpInfo}.
   *
   * @param body Workflows Webhook handle payload. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;MicrosoftTeamsWorkflowsWebhookHandleResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<MicrosoftTeamsWorkflowsWebhookHandleResponse>> createWorkflowsWebhookHandleWithHttpInfoAsync(MicrosoftTeamsCreateWorkflowsWebhookHandleRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<MicrosoftTeamsWorkflowsWebhookHandleResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling createWorkflowsWebhookHandle"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/integration/ms-teams/configuration/workflows-webhook-handles";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.MicrosoftTeamsIntegrationApi.createWorkflowsWebhookHandle", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<MicrosoftTeamsWorkflowsWebhookHandleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<MicrosoftTeamsWorkflowsWebhookHandleResponse>() {});
  }

  /**
 * Delete tenant-based handle.
 *
 * See {@link #deleteTenantBasedHandleWithHttpInfo}.
 *
 * @param handleId Your tenant-based handle id. (required)
 * @throws ApiException if fails to make API call
 */
  public  void  deleteTenantBasedHandle(String handleId) throws ApiException {
    deleteTenantBasedHandleWithHttpInfo(handleId);
  }

  /**
 * Delete tenant-based handle.
 *
 * See {@link #deleteTenantBasedHandleWithHttpInfoAsync}.
 *
 * @param handleId Your tenant-based handle id. (required)
 * @return CompletableFuture
 */
  public CompletableFuture<Void>deleteTenantBasedHandleAsync(String handleId) {
    return deleteTenantBasedHandleWithHttpInfoAsync(handleId).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Delete a tenant-based handle from the Datadog Microsoft Teams integration.</p>
   *
   * @param handleId Your tenant-based handle id. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 412 </td><td> Failed Precondition </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteTenantBasedHandleWithHttpInfo(String handleId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'handleId' is set
    if (handleId == null) {
      throw new ApiException(400, "Missing the required parameter 'handleId' when calling deleteTenantBasedHandle");
    }
    // create path and map variables
    String localVarPath = "/api/v2/integration/ms-teams/configuration/tenant-based-handles/{handle_id}"
      .replaceAll("\\{" + "handle_id" + "\\}", apiClient.escapeString(handleId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.MicrosoftTeamsIntegrationApi.deleteTenantBasedHandle", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("DELETE", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
   * Delete tenant-based handle.
   *
   * See {@link #deleteTenantBasedHandleWithHttpInfo}.
   *
   * @param handleId Your tenant-based handle id. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteTenantBasedHandleWithHttpInfoAsync(String handleId) {
    Object localVarPostBody = null;

    // verify the required parameter 'handleId' is set
    if (handleId == null) {
        CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'handleId' when calling deleteTenantBasedHandle"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/integration/ms-teams/configuration/tenant-based-handles/{handle_id}"
      .replaceAll("\\{" + "handle_id" + "\\}", apiClient.escapeString(handleId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.MicrosoftTeamsIntegrationApi.deleteTenantBasedHandle", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("DELETE", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
 * Delete Workflows webhook handle.
 *
 * See {@link #deleteWorkflowsWebhookHandleWithHttpInfo}.
 *
 * @param handleId Your Workflows webhook handle id. (required)
 * @throws ApiException if fails to make API call
 */
  public  void  deleteWorkflowsWebhookHandle(String handleId) throws ApiException {
    deleteWorkflowsWebhookHandleWithHttpInfo(handleId);
  }

  /**
 * Delete Workflows webhook handle.
 *
 * See {@link #deleteWorkflowsWebhookHandleWithHttpInfoAsync}.
 *
 * @param handleId Your Workflows webhook handle id. (required)
 * @return CompletableFuture
 */
  public CompletableFuture<Void>deleteWorkflowsWebhookHandleAsync(String handleId) {
    return deleteWorkflowsWebhookHandleWithHttpInfoAsync(handleId).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Delete a Workflows webhook handle from the Datadog Microsoft Teams integration.</p>
   *
   * @param handleId Your Workflows webhook handle id. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 412 </td><td> Failed Precondition </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteWorkflowsWebhookHandleWithHttpInfo(String handleId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'handleId' is set
    if (handleId == null) {
      throw new ApiException(400, "Missing the required parameter 'handleId' when calling deleteWorkflowsWebhookHandle");
    }
    // create path and map variables
    String localVarPath = "/api/v2/integration/ms-teams/configuration/workflows-webhook-handles/{handle_id}"
      .replaceAll("\\{" + "handle_id" + "\\}", apiClient.escapeString(handleId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.MicrosoftTeamsIntegrationApi.deleteWorkflowsWebhookHandle", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("DELETE", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
   * Delete Workflows webhook handle.
   *
   * See {@link #deleteWorkflowsWebhookHandleWithHttpInfo}.
   *
   * @param handleId Your Workflows webhook handle id. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteWorkflowsWebhookHandleWithHttpInfoAsync(String handleId) {
    Object localVarPostBody = null;

    // verify the required parameter 'handleId' is set
    if (handleId == null) {
        CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'handleId' when calling deleteWorkflowsWebhookHandle"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/integration/ms-teams/configuration/workflows-webhook-handles/{handle_id}"
      .replaceAll("\\{" + "handle_id" + "\\}", apiClient.escapeString(handleId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.MicrosoftTeamsIntegrationApi.deleteWorkflowsWebhookHandle", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("DELETE", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
 * Get channel information by name.
 *
 * See {@link #getChannelByNameWithHttpInfo}.
 *
 * @param tenantName Your tenant name. (required)
 * @param teamName Your team name. (required)
 * @param channelName Your channel name. (required)
 * @return MicrosoftTeamsGetChannelByNameResponse
 * @throws ApiException if fails to make API call
 */
  public MicrosoftTeamsGetChannelByNameResponse  getChannelByName(String tenantName, String teamName, String channelName) throws ApiException {
    return getChannelByNameWithHttpInfo(tenantName, teamName, channelName).getData();
  }

  /**
 * Get channel information by name.
 *
 * See {@link #getChannelByNameWithHttpInfoAsync}.
 *
 * @param tenantName Your tenant name. (required)
 * @param teamName Your team name. (required)
 * @param channelName Your channel name. (required)
 * @return CompletableFuture&lt;MicrosoftTeamsGetChannelByNameResponse&gt;
 */
  public CompletableFuture<MicrosoftTeamsGetChannelByNameResponse>getChannelByNameAsync(String tenantName, String teamName, String channelName) {
    return getChannelByNameWithHttpInfoAsync(tenantName, teamName, channelName).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get the tenant, team, and channel ID of a channel in the Datadog Microsoft Teams integration.</p>
   *
   * @param tenantName Your tenant name. (required)
   * @param teamName Your team name. (required)
   * @param channelName Your channel name. (required)
   * @return ApiResponse&lt;MicrosoftTeamsGetChannelByNameResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<MicrosoftTeamsGetChannelByNameResponse> getChannelByNameWithHttpInfo(String tenantName, String teamName, String channelName) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'tenantName' is set
    if (tenantName == null) {
      throw new ApiException(400, "Missing the required parameter 'tenantName' when calling getChannelByName");
    }

    // verify the required parameter 'teamName' is set
    if (teamName == null) {
      throw new ApiException(400, "Missing the required parameter 'teamName' when calling getChannelByName");
    }

    // verify the required parameter 'channelName' is set
    if (channelName == null) {
      throw new ApiException(400, "Missing the required parameter 'channelName' when calling getChannelByName");
    }
    // create path and map variables
    String localVarPath = "/api/v2/integration/ms-teams/configuration/channel/{tenant_name}/{team_name}/{channel_name}"
      .replaceAll("\\{" + "tenant_name" + "\\}", apiClient.escapeString(tenantName.toString()))
      .replaceAll("\\{" + "team_name" + "\\}", apiClient.escapeString(teamName.toString()))
      .replaceAll("\\{" + "channel_name" + "\\}", apiClient.escapeString(channelName.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.MicrosoftTeamsIntegrationApi.getChannelByName", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<MicrosoftTeamsGetChannelByNameResponse>() {});
  }

  /**
   * Get channel information by name.
   *
   * See {@link #getChannelByNameWithHttpInfo}.
   *
   * @param tenantName Your tenant name. (required)
   * @param teamName Your team name. (required)
   * @param channelName Your channel name. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;MicrosoftTeamsGetChannelByNameResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<MicrosoftTeamsGetChannelByNameResponse>> getChannelByNameWithHttpInfoAsync(String tenantName, String teamName, String channelName) {
    Object localVarPostBody = null;

    // verify the required parameter 'tenantName' is set
    if (tenantName == null) {
        CompletableFuture<ApiResponse<MicrosoftTeamsGetChannelByNameResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'tenantName' when calling getChannelByName"));
        return result;
    }

    // verify the required parameter 'teamName' is set
    if (teamName == null) {
        CompletableFuture<ApiResponse<MicrosoftTeamsGetChannelByNameResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'teamName' when calling getChannelByName"));
        return result;
    }

    // verify the required parameter 'channelName' is set
    if (channelName == null) {
        CompletableFuture<ApiResponse<MicrosoftTeamsGetChannelByNameResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'channelName' when calling getChannelByName"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/integration/ms-teams/configuration/channel/{tenant_name}/{team_name}/{channel_name}"
      .replaceAll("\\{" + "tenant_name" + "\\}", apiClient.escapeString(tenantName.toString()))
      .replaceAll("\\{" + "team_name" + "\\}", apiClient.escapeString(teamName.toString()))
      .replaceAll("\\{" + "channel_name" + "\\}", apiClient.escapeString(channelName.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.MicrosoftTeamsIntegrationApi.getChannelByName", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<MicrosoftTeamsGetChannelByNameResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<MicrosoftTeamsGetChannelByNameResponse>() {});
  }

  /**
 * Get tenant-based handle information.
 *
 * See {@link #getTenantBasedHandleWithHttpInfo}.
 *
 * @param handleId Your tenant-based handle id. (required)
 * @return MicrosoftTeamsTenantBasedHandleResponse
 * @throws ApiException if fails to make API call
 */
  public MicrosoftTeamsTenantBasedHandleResponse  getTenantBasedHandle(String handleId) throws ApiException {
    return getTenantBasedHandleWithHttpInfo(handleId).getData();
  }

  /**
 * Get tenant-based handle information.
 *
 * See {@link #getTenantBasedHandleWithHttpInfoAsync}.
 *
 * @param handleId Your tenant-based handle id. (required)
 * @return CompletableFuture&lt;MicrosoftTeamsTenantBasedHandleResponse&gt;
 */
  public CompletableFuture<MicrosoftTeamsTenantBasedHandleResponse>getTenantBasedHandleAsync(String handleId) {
    return getTenantBasedHandleWithHttpInfoAsync(handleId).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get the tenant, team, and channel information of a tenant-based handle from the Datadog Microsoft Teams integration.</p>
   *
   * @param handleId Your tenant-based handle id. (required)
   * @return ApiResponse&lt;MicrosoftTeamsTenantBasedHandleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
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
  public ApiResponse<MicrosoftTeamsTenantBasedHandleResponse> getTenantBasedHandleWithHttpInfo(String handleId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'handleId' is set
    if (handleId == null) {
      throw new ApiException(400, "Missing the required parameter 'handleId' when calling getTenantBasedHandle");
    }
    // create path and map variables
    String localVarPath = "/api/v2/integration/ms-teams/configuration/tenant-based-handles/{handle_id}"
      .replaceAll("\\{" + "handle_id" + "\\}", apiClient.escapeString(handleId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.MicrosoftTeamsIntegrationApi.getTenantBasedHandle", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<MicrosoftTeamsTenantBasedHandleResponse>() {});
  }

  /**
   * Get tenant-based handle information.
   *
   * See {@link #getTenantBasedHandleWithHttpInfo}.
   *
   * @param handleId Your tenant-based handle id. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;MicrosoftTeamsTenantBasedHandleResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<MicrosoftTeamsTenantBasedHandleResponse>> getTenantBasedHandleWithHttpInfoAsync(String handleId) {
    Object localVarPostBody = null;

    // verify the required parameter 'handleId' is set
    if (handleId == null) {
        CompletableFuture<ApiResponse<MicrosoftTeamsTenantBasedHandleResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'handleId' when calling getTenantBasedHandle"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/integration/ms-teams/configuration/tenant-based-handles/{handle_id}"
      .replaceAll("\\{" + "handle_id" + "\\}", apiClient.escapeString(handleId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.MicrosoftTeamsIntegrationApi.getTenantBasedHandle", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<MicrosoftTeamsTenantBasedHandleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<MicrosoftTeamsTenantBasedHandleResponse>() {});
  }

  /**
 * Get Workflows webhook handle information.
 *
 * See {@link #getWorkflowsWebhookHandleWithHttpInfo}.
 *
 * @param handleId Your Workflows webhook handle id. (required)
 * @return MicrosoftTeamsWorkflowsWebhookHandleResponse
 * @throws ApiException if fails to make API call
 */
  public MicrosoftTeamsWorkflowsWebhookHandleResponse  getWorkflowsWebhookHandle(String handleId) throws ApiException {
    return getWorkflowsWebhookHandleWithHttpInfo(handleId).getData();
  }

  /**
 * Get Workflows webhook handle information.
 *
 * See {@link #getWorkflowsWebhookHandleWithHttpInfoAsync}.
 *
 * @param handleId Your Workflows webhook handle id. (required)
 * @return CompletableFuture&lt;MicrosoftTeamsWorkflowsWebhookHandleResponse&gt;
 */
  public CompletableFuture<MicrosoftTeamsWorkflowsWebhookHandleResponse>getWorkflowsWebhookHandleAsync(String handleId) {
    return getWorkflowsWebhookHandleWithHttpInfoAsync(handleId).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get the name of a Workflows webhook handle from the Datadog Microsoft Teams integration.</p>
   *
   * @param handleId Your Workflows webhook handle id. (required)
   * @return ApiResponse&lt;MicrosoftTeamsWorkflowsWebhookHandleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
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
  public ApiResponse<MicrosoftTeamsWorkflowsWebhookHandleResponse> getWorkflowsWebhookHandleWithHttpInfo(String handleId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'handleId' is set
    if (handleId == null) {
      throw new ApiException(400, "Missing the required parameter 'handleId' when calling getWorkflowsWebhookHandle");
    }
    // create path and map variables
    String localVarPath = "/api/v2/integration/ms-teams/configuration/workflows-webhook-handles/{handle_id}"
      .replaceAll("\\{" + "handle_id" + "\\}", apiClient.escapeString(handleId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.MicrosoftTeamsIntegrationApi.getWorkflowsWebhookHandle", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<MicrosoftTeamsWorkflowsWebhookHandleResponse>() {});
  }

  /**
   * Get Workflows webhook handle information.
   *
   * See {@link #getWorkflowsWebhookHandleWithHttpInfo}.
   *
   * @param handleId Your Workflows webhook handle id. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;MicrosoftTeamsWorkflowsWebhookHandleResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<MicrosoftTeamsWorkflowsWebhookHandleResponse>> getWorkflowsWebhookHandleWithHttpInfoAsync(String handleId) {
    Object localVarPostBody = null;

    // verify the required parameter 'handleId' is set
    if (handleId == null) {
        CompletableFuture<ApiResponse<MicrosoftTeamsWorkflowsWebhookHandleResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'handleId' when calling getWorkflowsWebhookHandle"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/integration/ms-teams/configuration/workflows-webhook-handles/{handle_id}"
      .replaceAll("\\{" + "handle_id" + "\\}", apiClient.escapeString(handleId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.MicrosoftTeamsIntegrationApi.getWorkflowsWebhookHandle", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<MicrosoftTeamsWorkflowsWebhookHandleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<MicrosoftTeamsWorkflowsWebhookHandleResponse>() {});
  }

  /**
   * Manage optional parameters to listTenantBasedHandles.
   */
  public static class ListTenantBasedHandlesOptionalParameters {
    private String tenantId;
    private String name;

    /**
     * Set tenantId.
     * @param tenantId Your tenant id. (optional)
     * @return ListTenantBasedHandlesOptionalParameters
     */
    public ListTenantBasedHandlesOptionalParameters tenantId(String tenantId) {
      this.tenantId = tenantId;
      return this;
    }

    /**
     * Set name.
     * @param name Your tenant-based handle name. (optional)
     * @return ListTenantBasedHandlesOptionalParameters
     */
    public ListTenantBasedHandlesOptionalParameters name(String name) {
      this.name = name;
      return this;
    }
  }

  /**
 * Get all tenant-based handles.
 *
 * See {@link #listTenantBasedHandlesWithHttpInfo}.
 *
 * @return MicrosoftTeamsTenantBasedHandlesResponse
 * @throws ApiException if fails to make API call
 */
  public MicrosoftTeamsTenantBasedHandlesResponse listTenantBasedHandles () throws ApiException {
    return listTenantBasedHandlesWithHttpInfo(new ListTenantBasedHandlesOptionalParameters()).getData();
  }

  /**
 * Get all tenant-based handles.
 *
 * See {@link #listTenantBasedHandlesWithHttpInfoAsync}.
 *
 * @return CompletableFuture&lt;MicrosoftTeamsTenantBasedHandlesResponse&gt;
 */
  public CompletableFuture<MicrosoftTeamsTenantBasedHandlesResponse>listTenantBasedHandlesAsync() {
    return listTenantBasedHandlesWithHttpInfoAsync(new ListTenantBasedHandlesOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * Get all tenant-based handles.
 *
 * See {@link #listTenantBasedHandlesWithHttpInfo}.
 *
 * @param parameters Optional parameters for the request.
 * @return MicrosoftTeamsTenantBasedHandlesResponse
 * @throws ApiException if fails to make API call
 */
  public MicrosoftTeamsTenantBasedHandlesResponse listTenantBasedHandles(ListTenantBasedHandlesOptionalParameters parameters) throws ApiException {
    return listTenantBasedHandlesWithHttpInfo(parameters).getData();
  }

  /**
 * Get all tenant-based handles.
 *
 * See {@link #listTenantBasedHandlesWithHttpInfoAsync}.
 *
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;MicrosoftTeamsTenantBasedHandlesResponse&gt;
 */
  public CompletableFuture<MicrosoftTeamsTenantBasedHandlesResponse>listTenantBasedHandlesAsync(ListTenantBasedHandlesOptionalParameters parameters) {
    return listTenantBasedHandlesWithHttpInfoAsync(parameters).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get a list of all tenant-based handles from the Datadog Microsoft Teams integration.</p>
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;MicrosoftTeamsTenantBasedHandlesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
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
  public ApiResponse<MicrosoftTeamsTenantBasedHandlesResponse> listTenantBasedHandlesWithHttpInfo(ListTenantBasedHandlesOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    String tenantId = parameters.tenantId;
    String name = parameters.name;
    // create path and map variables
    String localVarPath = "/api/v2/integration/ms-teams/configuration/tenant-based-handles";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "tenant_id", tenantId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "name", name));

    Invocation.Builder builder = apiClient.createBuilder("v2.MicrosoftTeamsIntegrationApi.listTenantBasedHandles", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<MicrosoftTeamsTenantBasedHandlesResponse>() {});
  }

  /**
   * Get all tenant-based handles.
   *
   * See {@link #listTenantBasedHandlesWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;MicrosoftTeamsTenantBasedHandlesResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<MicrosoftTeamsTenantBasedHandlesResponse>> listTenantBasedHandlesWithHttpInfoAsync(ListTenantBasedHandlesOptionalParameters parameters) {
    Object localVarPostBody = null;
    String tenantId = parameters.tenantId;
    String name = parameters.name;
    // create path and map variables
    String localVarPath = "/api/v2/integration/ms-teams/configuration/tenant-based-handles";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "tenant_id", tenantId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "name", name));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.MicrosoftTeamsIntegrationApi.listTenantBasedHandles", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<MicrosoftTeamsTenantBasedHandlesResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<MicrosoftTeamsTenantBasedHandlesResponse>() {});
  }

  /**
   * Manage optional parameters to listWorkflowsWebhookHandles.
   */
  public static class ListWorkflowsWebhookHandlesOptionalParameters {
    private String name;

    /**
     * Set name.
     * @param name Your Workflows webhook handle name. (optional)
     * @return ListWorkflowsWebhookHandlesOptionalParameters
     */
    public ListWorkflowsWebhookHandlesOptionalParameters name(String name) {
      this.name = name;
      return this;
    }
  }

  /**
 * Get all Workflows webhook handles.
 *
 * See {@link #listWorkflowsWebhookHandlesWithHttpInfo}.
 *
 * @return MicrosoftTeamsWorkflowsWebhookHandlesResponse
 * @throws ApiException if fails to make API call
 */
  public MicrosoftTeamsWorkflowsWebhookHandlesResponse listWorkflowsWebhookHandles () throws ApiException {
    return listWorkflowsWebhookHandlesWithHttpInfo(new ListWorkflowsWebhookHandlesOptionalParameters()).getData();
  }

  /**
 * Get all Workflows webhook handles.
 *
 * See {@link #listWorkflowsWebhookHandlesWithHttpInfoAsync}.
 *
 * @return CompletableFuture&lt;MicrosoftTeamsWorkflowsWebhookHandlesResponse&gt;
 */
  public CompletableFuture<MicrosoftTeamsWorkflowsWebhookHandlesResponse>listWorkflowsWebhookHandlesAsync() {
    return listWorkflowsWebhookHandlesWithHttpInfoAsync(new ListWorkflowsWebhookHandlesOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * Get all Workflows webhook handles.
 *
 * See {@link #listWorkflowsWebhookHandlesWithHttpInfo}.
 *
 * @param parameters Optional parameters for the request.
 * @return MicrosoftTeamsWorkflowsWebhookHandlesResponse
 * @throws ApiException if fails to make API call
 */
  public MicrosoftTeamsWorkflowsWebhookHandlesResponse listWorkflowsWebhookHandles(ListWorkflowsWebhookHandlesOptionalParameters parameters) throws ApiException {
    return listWorkflowsWebhookHandlesWithHttpInfo(parameters).getData();
  }

  /**
 * Get all Workflows webhook handles.
 *
 * See {@link #listWorkflowsWebhookHandlesWithHttpInfoAsync}.
 *
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;MicrosoftTeamsWorkflowsWebhookHandlesResponse&gt;
 */
  public CompletableFuture<MicrosoftTeamsWorkflowsWebhookHandlesResponse>listWorkflowsWebhookHandlesAsync(ListWorkflowsWebhookHandlesOptionalParameters parameters) {
    return listWorkflowsWebhookHandlesWithHttpInfoAsync(parameters).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get a list of all Workflows webhook handles from the Datadog Microsoft Teams integration.</p>
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;MicrosoftTeamsWorkflowsWebhookHandlesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
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
  public ApiResponse<MicrosoftTeamsWorkflowsWebhookHandlesResponse> listWorkflowsWebhookHandlesWithHttpInfo(ListWorkflowsWebhookHandlesOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    String name = parameters.name;
    // create path and map variables
    String localVarPath = "/api/v2/integration/ms-teams/configuration/workflows-webhook-handles";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "name", name));

    Invocation.Builder builder = apiClient.createBuilder("v2.MicrosoftTeamsIntegrationApi.listWorkflowsWebhookHandles", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<MicrosoftTeamsWorkflowsWebhookHandlesResponse>() {});
  }

  /**
   * Get all Workflows webhook handles.
   *
   * See {@link #listWorkflowsWebhookHandlesWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;MicrosoftTeamsWorkflowsWebhookHandlesResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<MicrosoftTeamsWorkflowsWebhookHandlesResponse>> listWorkflowsWebhookHandlesWithHttpInfoAsync(ListWorkflowsWebhookHandlesOptionalParameters parameters) {
    Object localVarPostBody = null;
    String name = parameters.name;
    // create path and map variables
    String localVarPath = "/api/v2/integration/ms-teams/configuration/workflows-webhook-handles";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "name", name));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.MicrosoftTeamsIntegrationApi.listWorkflowsWebhookHandles", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<MicrosoftTeamsWorkflowsWebhookHandlesResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<MicrosoftTeamsWorkflowsWebhookHandlesResponse>() {});
  }

  /**
 * Update tenant-based handle.
 *
 * See {@link #updateTenantBasedHandleWithHttpInfo}.
 *
 * @param handleId Your tenant-based handle id. (required)
 * @param body Tenant-based handle payload. (required)
 * @return MicrosoftTeamsTenantBasedHandleResponse
 * @throws ApiException if fails to make API call
 */
  public MicrosoftTeamsTenantBasedHandleResponse  updateTenantBasedHandle(String handleId, MicrosoftTeamsUpdateTenantBasedHandleRequest body) throws ApiException {
    return updateTenantBasedHandleWithHttpInfo(handleId, body).getData();
  }

  /**
 * Update tenant-based handle.
 *
 * See {@link #updateTenantBasedHandleWithHttpInfoAsync}.
 *
 * @param handleId Your tenant-based handle id. (required)
 * @param body Tenant-based handle payload. (required)
 * @return CompletableFuture&lt;MicrosoftTeamsTenantBasedHandleResponse&gt;
 */
  public CompletableFuture<MicrosoftTeamsTenantBasedHandleResponse>updateTenantBasedHandleAsync(String handleId, MicrosoftTeamsUpdateTenantBasedHandleRequest body) {
    return updateTenantBasedHandleWithHttpInfoAsync(handleId, body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Update a tenant-based handle from the Datadog Microsoft Teams integration.</p>
   *
   * @param handleId Your tenant-based handle id. (required)
   * @param body Tenant-based handle payload. (required)
   * @return ApiResponse&lt;MicrosoftTeamsTenantBasedHandleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
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
  public ApiResponse<MicrosoftTeamsTenantBasedHandleResponse> updateTenantBasedHandleWithHttpInfo(String handleId, MicrosoftTeamsUpdateTenantBasedHandleRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'handleId' is set
    if (handleId == null) {
      throw new ApiException(400, "Missing the required parameter 'handleId' when calling updateTenantBasedHandle");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateTenantBasedHandle");
    }
    // create path and map variables
    String localVarPath = "/api/v2/integration/ms-teams/configuration/tenant-based-handles/{handle_id}"
      .replaceAll("\\{" + "handle_id" + "\\}", apiClient.escapeString(handleId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.MicrosoftTeamsIntegrationApi.updateTenantBasedHandle", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("PATCH", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<MicrosoftTeamsTenantBasedHandleResponse>() {});
  }

  /**
   * Update tenant-based handle.
   *
   * See {@link #updateTenantBasedHandleWithHttpInfo}.
   *
   * @param handleId Your tenant-based handle id. (required)
   * @param body Tenant-based handle payload. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;MicrosoftTeamsTenantBasedHandleResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<MicrosoftTeamsTenantBasedHandleResponse>> updateTenantBasedHandleWithHttpInfoAsync(String handleId, MicrosoftTeamsUpdateTenantBasedHandleRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'handleId' is set
    if (handleId == null) {
        CompletableFuture<ApiResponse<MicrosoftTeamsTenantBasedHandleResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'handleId' when calling updateTenantBasedHandle"));
        return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<MicrosoftTeamsTenantBasedHandleResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling updateTenantBasedHandle"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/integration/ms-teams/configuration/tenant-based-handles/{handle_id}"
      .replaceAll("\\{" + "handle_id" + "\\}", apiClient.escapeString(handleId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.MicrosoftTeamsIntegrationApi.updateTenantBasedHandle", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<MicrosoftTeamsTenantBasedHandleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("PATCH", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<MicrosoftTeamsTenantBasedHandleResponse>() {});
  }

  /**
 * Update Workflows webhook handle.
 *
 * See {@link #updateWorkflowsWebhookHandleWithHttpInfo}.
 *
 * @param handleId Your Workflows webhook handle id. (required)
 * @param body Workflows Webhook handle payload. (required)
 * @return MicrosoftTeamsWorkflowsWebhookHandleResponse
 * @throws ApiException if fails to make API call
 */
  public MicrosoftTeamsWorkflowsWebhookHandleResponse  updateWorkflowsWebhookHandle(String handleId, MicrosoftTeamsUpdateWorkflowsWebhookHandleRequest body) throws ApiException {
    return updateWorkflowsWebhookHandleWithHttpInfo(handleId, body).getData();
  }

  /**
 * Update Workflows webhook handle.
 *
 * See {@link #updateWorkflowsWebhookHandleWithHttpInfoAsync}.
 *
 * @param handleId Your Workflows webhook handle id. (required)
 * @param body Workflows Webhook handle payload. (required)
 * @return CompletableFuture&lt;MicrosoftTeamsWorkflowsWebhookHandleResponse&gt;
 */
  public CompletableFuture<MicrosoftTeamsWorkflowsWebhookHandleResponse>updateWorkflowsWebhookHandleAsync(String handleId, MicrosoftTeamsUpdateWorkflowsWebhookHandleRequest body) {
    return updateWorkflowsWebhookHandleWithHttpInfoAsync(handleId, body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Update a Workflows webhook handle from the Datadog Microsoft Teams integration.</p>
   *
   * @param handleId Your Workflows webhook handle id. (required)
   * @param body Workflows Webhook handle payload. (required)
   * @return ApiResponse&lt;MicrosoftTeamsWorkflowsWebhookHandleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
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
  public ApiResponse<MicrosoftTeamsWorkflowsWebhookHandleResponse> updateWorkflowsWebhookHandleWithHttpInfo(String handleId, MicrosoftTeamsUpdateWorkflowsWebhookHandleRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'handleId' is set
    if (handleId == null) {
      throw new ApiException(400, "Missing the required parameter 'handleId' when calling updateWorkflowsWebhookHandle");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateWorkflowsWebhookHandle");
    }
    // create path and map variables
    String localVarPath = "/api/v2/integration/ms-teams/configuration/workflows-webhook-handles/{handle_id}"
      .replaceAll("\\{" + "handle_id" + "\\}", apiClient.escapeString(handleId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.MicrosoftTeamsIntegrationApi.updateWorkflowsWebhookHandle", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("PATCH", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<MicrosoftTeamsWorkflowsWebhookHandleResponse>() {});
  }

  /**
   * Update Workflows webhook handle.
   *
   * See {@link #updateWorkflowsWebhookHandleWithHttpInfo}.
   *
   * @param handleId Your Workflows webhook handle id. (required)
   * @param body Workflows Webhook handle payload. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;MicrosoftTeamsWorkflowsWebhookHandleResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<MicrosoftTeamsWorkflowsWebhookHandleResponse>> updateWorkflowsWebhookHandleWithHttpInfoAsync(String handleId, MicrosoftTeamsUpdateWorkflowsWebhookHandleRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'handleId' is set
    if (handleId == null) {
        CompletableFuture<ApiResponse<MicrosoftTeamsWorkflowsWebhookHandleResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'handleId' when calling updateWorkflowsWebhookHandle"));
        return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<MicrosoftTeamsWorkflowsWebhookHandleResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling updateWorkflowsWebhookHandle"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/integration/ms-teams/configuration/workflows-webhook-handles/{handle_id}"
      .replaceAll("\\{" + "handle_id" + "\\}", apiClient.escapeString(handleId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.MicrosoftTeamsIntegrationApi.updateWorkflowsWebhookHandle", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<MicrosoftTeamsWorkflowsWebhookHandleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("PATCH", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<MicrosoftTeamsWorkflowsWebhookHandleResponse>() {});
  }
}