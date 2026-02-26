package com.datadog.api.client.v1.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.PaginationIterable;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v1.model.Dashboard;
import com.datadog.api.client.v1.model.DashboardBulkDeleteRequest;
import com.datadog.api.client.v1.model.DashboardDeleteResponse;
import com.datadog.api.client.v1.model.DashboardRestoreRequest;
import com.datadog.api.client.v1.model.DashboardSummary;
import com.datadog.api.client.v1.model.DashboardSummaryDefinition;
import com.datadog.api.client.v1.model.DeleteSharedDashboardResponse;
import com.datadog.api.client.v1.model.SharedDashboard;
import com.datadog.api.client.v1.model.SharedDashboardInvites;
import com.datadog.api.client.v1.model.SharedDashboardUpdateRequest;
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
public class DashboardsApi {
  private ApiClient apiClient;

  public DashboardsApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public DashboardsApi(ApiClient apiClient) {
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
   * Create a new dashboard.
   *
   * <p>See {@link #createDashboardWithHttpInfo}.
   *
   * @param body Create a dashboard request body. (required)
   * @return Dashboard
   * @throws ApiException if fails to make API call
   */
  public Dashboard createDashboard(Dashboard body) throws ApiException {
    return createDashboardWithHttpInfo(body).getData();
  }

  /**
   * Create a new dashboard.
   *
   * <p>See {@link #createDashboardWithHttpInfoAsync}.
   *
   * @param body Create a dashboard request body. (required)
   * @return CompletableFuture&lt;Dashboard&gt;
   */
  public CompletableFuture<Dashboard> createDashboardAsync(Dashboard body) {
    return createDashboardWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a dashboard using the specified options. When defining queries in your widgets, take
   * note of which queries should have the <code>as_count()</code> or <code>as_rate()</code>
   * modifiers appended. Refer to the following <a
   * href="https://docs.datadoghq.com/developers/metrics/type_modifiers/?tab=count#in-application-modifiers">documentation</a>
   * for more information on these modifiers.
   *
   * @param body Create a dashboard request body. (required)
   * @return ApiResponse&lt;Dashboard&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Dashboard> createDashboardWithHttpInfo(Dashboard body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createDashboard");
    }
    // create path and map variables
    String localVarPath = "/api/v1/dashboard";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v1.DashboardsApi.createDashboard",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<Dashboard>() {});
  }

  /**
   * Create a new dashboard.
   *
   * <p>See {@link #createDashboardWithHttpInfo}.
   *
   * @param body Create a dashboard request body. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Dashboard&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Dashboard>> createDashboardWithHttpInfoAsync(
      Dashboard body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Dashboard>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createDashboard"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/dashboard";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1.DashboardsApi.createDashboard",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Dashboard>> result = new CompletableFuture<>();
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
        new GenericType<Dashboard>() {});
  }

  /**
   * Create a shared dashboard.
   *
   * <p>See {@link #createPublicDashboardWithHttpInfo}.
   *
   * @param body Create a shared dashboard request body. (required)
   * @return SharedDashboard
   * @throws ApiException if fails to make API call
   */
  public SharedDashboard createPublicDashboard(SharedDashboard body) throws ApiException {
    return createPublicDashboardWithHttpInfo(body).getData();
  }

  /**
   * Create a shared dashboard.
   *
   * <p>See {@link #createPublicDashboardWithHttpInfoAsync}.
   *
   * @param body Create a shared dashboard request body. (required)
   * @return CompletableFuture&lt;SharedDashboard&gt;
   */
  public CompletableFuture<SharedDashboard> createPublicDashboardAsync(SharedDashboard body) {
    return createPublicDashboardWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Share a specified private dashboard, generating a URL at which it can be publicly viewed.
   *
   * @param body Create a shared dashboard request body. (required)
   * @return ApiResponse&lt;SharedDashboard&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Dashboard Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SharedDashboard> createPublicDashboardWithHttpInfo(SharedDashboard body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createPublicDashboard");
    }
    // create path and map variables
    String localVarPath = "/api/v1/dashboard/public";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v1.DashboardsApi.createPublicDashboard",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<SharedDashboard>() {});
  }

  /**
   * Create a shared dashboard.
   *
   * <p>See {@link #createPublicDashboardWithHttpInfo}.
   *
   * @param body Create a shared dashboard request body. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SharedDashboard&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SharedDashboard>> createPublicDashboardWithHttpInfoAsync(
      SharedDashboard body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<SharedDashboard>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createPublicDashboard"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/dashboard/public";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1.DashboardsApi.createPublicDashboard",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SharedDashboard>> result = new CompletableFuture<>();
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
        new GenericType<SharedDashboard>() {});
  }

  /**
   * Delete a dashboard.
   *
   * <p>See {@link #deleteDashboardWithHttpInfo}.
   *
   * @param dashboardId The ID of the dashboard. (required)
   * @return DashboardDeleteResponse
   * @throws ApiException if fails to make API call
   */
  public DashboardDeleteResponse deleteDashboard(String dashboardId) throws ApiException {
    return deleteDashboardWithHttpInfo(dashboardId).getData();
  }

  /**
   * Delete a dashboard.
   *
   * <p>See {@link #deleteDashboardWithHttpInfoAsync}.
   *
   * @param dashboardId The ID of the dashboard. (required)
   * @return CompletableFuture&lt;DashboardDeleteResponse&gt;
   */
  public CompletableFuture<DashboardDeleteResponse> deleteDashboardAsync(String dashboardId) {
    return deleteDashboardWithHttpInfoAsync(dashboardId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete a dashboard using the specified ID.
   *
   * @param dashboardId The ID of the dashboard. (required)
   * @return ApiResponse&lt;DashboardDeleteResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Dashboards Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<DashboardDeleteResponse> deleteDashboardWithHttpInfo(String dashboardId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'dashboardId' is set
    if (dashboardId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'dashboardId' when calling deleteDashboard");
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/dashboard/{dashboard_id}"
            .replaceAll(
                "\\{" + "dashboard_id" + "\\}", apiClient.escapeString(dashboardId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v1.DashboardsApi.deleteDashboard",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<DashboardDeleteResponse>() {});
  }

  /**
   * Delete a dashboard.
   *
   * <p>See {@link #deleteDashboardWithHttpInfo}.
   *
   * @param dashboardId The ID of the dashboard. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;DashboardDeleteResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<DashboardDeleteResponse>> deleteDashboardWithHttpInfoAsync(
      String dashboardId) {
    Object localVarPostBody = null;

    // verify the required parameter 'dashboardId' is set
    if (dashboardId == null) {
      CompletableFuture<ApiResponse<DashboardDeleteResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'dashboardId' when calling deleteDashboard"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/dashboard/{dashboard_id}"
            .replaceAll(
                "\\{" + "dashboard_id" + "\\}", apiClient.escapeString(dashboardId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1.DashboardsApi.deleteDashboard",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<DashboardDeleteResponse>> result = new CompletableFuture<>();
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
        new GenericType<DashboardDeleteResponse>() {});
  }

  /**
   * Delete dashboards.
   *
   * <p>See {@link #deleteDashboardsWithHttpInfo}.
   *
   * @param body Delete dashboards request body. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteDashboards(DashboardBulkDeleteRequest body) throws ApiException {
    deleteDashboardsWithHttpInfo(body);
  }

  /**
   * Delete dashboards.
   *
   * <p>See {@link #deleteDashboardsWithHttpInfoAsync}.
   *
   * @param body Delete dashboards request body. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteDashboardsAsync(DashboardBulkDeleteRequest body) {
    return deleteDashboardsWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete dashboards using the specified IDs. If there are any failures, no dashboards will be
   * deleted (partial success is not allowed).
   *
   * @param body Delete dashboards request body. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Dashboards Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteDashboardsWithHttpInfo(DashboardBulkDeleteRequest body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling deleteDashboards");
    }
    // create path and map variables
    String localVarPath = "/api/v1/dashboard";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v1.DashboardsApi.deleteDashboards",
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
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Delete dashboards.
   *
   * <p>See {@link #deleteDashboardsWithHttpInfo}.
   *
   * @param body Delete dashboards request body. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteDashboardsWithHttpInfoAsync(
      DashboardBulkDeleteRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling deleteDashboards"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/dashboard";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1.DashboardsApi.deleteDashboards",
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
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Revoke a shared dashboard URL.
   *
   * <p>See {@link #deletePublicDashboardWithHttpInfo}.
   *
   * @param token The token of the shared dashboard. (required)
   * @return DeleteSharedDashboardResponse
   * @throws ApiException if fails to make API call
   */
  public DeleteSharedDashboardResponse deletePublicDashboard(String token) throws ApiException {
    return deletePublicDashboardWithHttpInfo(token).getData();
  }

  /**
   * Revoke a shared dashboard URL.
   *
   * <p>See {@link #deletePublicDashboardWithHttpInfoAsync}.
   *
   * @param token The token of the shared dashboard. (required)
   * @return CompletableFuture&lt;DeleteSharedDashboardResponse&gt;
   */
  public CompletableFuture<DeleteSharedDashboardResponse> deletePublicDashboardAsync(String token) {
    return deletePublicDashboardWithHttpInfoAsync(token)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Revoke the public URL for a dashboard (rendering it private) associated with the specified
   * token.
   *
   * @param token The token of the shared dashboard. (required)
   * @return ApiResponse&lt;DeleteSharedDashboardResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Shared Dashboard Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<DeleteSharedDashboardResponse> deletePublicDashboardWithHttpInfo(String token)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'token' is set
    if (token == null) {
      throw new ApiException(
          400, "Missing the required parameter 'token' when calling deletePublicDashboard");
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/dashboard/public/{token}"
            .replaceAll("\\{" + "token" + "\\}", apiClient.escapeString(token.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v1.DashboardsApi.deletePublicDashboard",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<DeleteSharedDashboardResponse>() {});
  }

  /**
   * Revoke a shared dashboard URL.
   *
   * <p>See {@link #deletePublicDashboardWithHttpInfo}.
   *
   * @param token The token of the shared dashboard. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;DeleteSharedDashboardResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<DeleteSharedDashboardResponse>>
      deletePublicDashboardWithHttpInfoAsync(String token) {
    Object localVarPostBody = null;

    // verify the required parameter 'token' is set
    if (token == null) {
      CompletableFuture<ApiResponse<DeleteSharedDashboardResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'token' when calling deletePublicDashboard"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/dashboard/public/{token}"
            .replaceAll("\\{" + "token" + "\\}", apiClient.escapeString(token.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1.DashboardsApi.deletePublicDashboard",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<DeleteSharedDashboardResponse>> result =
          new CompletableFuture<>();
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
        new GenericType<DeleteSharedDashboardResponse>() {});
  }

  /**
   * Revoke shared dashboard invitations.
   *
   * <p>See {@link #deletePublicDashboardInvitationWithHttpInfo}.
   *
   * @param token The token of the shared dashboard. (required)
   * @param body Shared Dashboard Invitation deletion request body. (required)
   * @throws ApiException if fails to make API call
   */
  public void deletePublicDashboardInvitation(String token, SharedDashboardInvites body)
      throws ApiException {
    deletePublicDashboardInvitationWithHttpInfo(token, body);
  }

  /**
   * Revoke shared dashboard invitations.
   *
   * <p>See {@link #deletePublicDashboardInvitationWithHttpInfoAsync}.
   *
   * @param token The token of the shared dashboard. (required)
   * @param body Shared Dashboard Invitation deletion request body. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deletePublicDashboardInvitationAsync(
      String token, SharedDashboardInvites body) {
    return deletePublicDashboardInvitationWithHttpInfoAsync(token, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Revoke previously sent invitation emails and active sessions used to access a given shared
   * dashboard for specific email addresses.
   *
   * @param token The token of the shared dashboard. (required)
   * @param body Shared Dashboard Invitation deletion request body. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deletePublicDashboardInvitationWithHttpInfo(
      String token, SharedDashboardInvites body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'token' is set
    if (token == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'token' when calling deletePublicDashboardInvitation");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'body' when calling deletePublicDashboardInvitation");
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/dashboard/public/{token}/invitation"
            .replaceAll("\\{" + "token" + "\\}", apiClient.escapeString(token.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v1.DashboardsApi.deletePublicDashboardInvitation",
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
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Revoke shared dashboard invitations.
   *
   * <p>See {@link #deletePublicDashboardInvitationWithHttpInfo}.
   *
   * @param token The token of the shared dashboard. (required)
   * @param body Shared Dashboard Invitation deletion request body. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deletePublicDashboardInvitationWithHttpInfoAsync(
      String token, SharedDashboardInvites body) {
    Object localVarPostBody = body;

    // verify the required parameter 'token' is set
    if (token == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'token' when calling"
                  + " deletePublicDashboardInvitation"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " deletePublicDashboardInvitation"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/dashboard/public/{token}/invitation"
            .replaceAll("\\{" + "token" + "\\}", apiClient.escapeString(token.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1.DashboardsApi.deletePublicDashboardInvitation",
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
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Get a dashboard.
   *
   * <p>See {@link #getDashboardWithHttpInfo}.
   *
   * @param dashboardId The ID of the dashboard. (required)
   * @return Dashboard
   * @throws ApiException if fails to make API call
   */
  public Dashboard getDashboard(String dashboardId) throws ApiException {
    return getDashboardWithHttpInfo(dashboardId).getData();
  }

  /**
   * Get a dashboard.
   *
   * <p>See {@link #getDashboardWithHttpInfoAsync}.
   *
   * @param dashboardId The ID of the dashboard. (required)
   * @return CompletableFuture&lt;Dashboard&gt;
   */
  public CompletableFuture<Dashboard> getDashboardAsync(String dashboardId) {
    return getDashboardWithHttpInfoAsync(dashboardId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a dashboard using the specified ID.
   *
   * @param dashboardId The ID of the dashboard. (required)
   * @return ApiResponse&lt;Dashboard&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Item Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Dashboard> getDashboardWithHttpInfo(String dashboardId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'dashboardId' is set
    if (dashboardId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'dashboardId' when calling getDashboard");
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/dashboard/{dashboard_id}"
            .replaceAll(
                "\\{" + "dashboard_id" + "\\}", apiClient.escapeString(dashboardId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v1.DashboardsApi.getDashboard",
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
        new GenericType<Dashboard>() {});
  }

  /**
   * Get a dashboard.
   *
   * <p>See {@link #getDashboardWithHttpInfo}.
   *
   * @param dashboardId The ID of the dashboard. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Dashboard&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Dashboard>> getDashboardWithHttpInfoAsync(
      String dashboardId) {
    Object localVarPostBody = null;

    // verify the required parameter 'dashboardId' is set
    if (dashboardId == null) {
      CompletableFuture<ApiResponse<Dashboard>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'dashboardId' when calling getDashboard"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/dashboard/{dashboard_id}"
            .replaceAll(
                "\\{" + "dashboard_id" + "\\}", apiClient.escapeString(dashboardId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1.DashboardsApi.getDashboard",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Dashboard>> result = new CompletableFuture<>();
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
        new GenericType<Dashboard>() {});
  }

  /**
   * Get a shared dashboard.
   *
   * <p>See {@link #getPublicDashboardWithHttpInfo}.
   *
   * @param token The token of the shared dashboard. Generated when a dashboard is shared.
   *     (required)
   * @return SharedDashboard
   * @throws ApiException if fails to make API call
   */
  public SharedDashboard getPublicDashboard(String token) throws ApiException {
    return getPublicDashboardWithHttpInfo(token).getData();
  }

  /**
   * Get a shared dashboard.
   *
   * <p>See {@link #getPublicDashboardWithHttpInfoAsync}.
   *
   * @param token The token of the shared dashboard. Generated when a dashboard is shared.
   *     (required)
   * @return CompletableFuture&lt;SharedDashboard&gt;
   */
  public CompletableFuture<SharedDashboard> getPublicDashboardAsync(String token) {
    return getPublicDashboardWithHttpInfoAsync(token)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Fetch an existing shared dashboard's sharing metadata associated with the specified token.
   *
   * @param token The token of the shared dashboard. Generated when a dashboard is shared.
   *     (required)
   * @return ApiResponse&lt;SharedDashboard&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Shared Dashboard Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SharedDashboard> getPublicDashboardWithHttpInfo(String token)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'token' is set
    if (token == null) {
      throw new ApiException(
          400, "Missing the required parameter 'token' when calling getPublicDashboard");
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/dashboard/public/{token}"
            .replaceAll("\\{" + "token" + "\\}", apiClient.escapeString(token.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v1.DashboardsApi.getPublicDashboard",
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
        new GenericType<SharedDashboard>() {});
  }

  /**
   * Get a shared dashboard.
   *
   * <p>See {@link #getPublicDashboardWithHttpInfo}.
   *
   * @param token The token of the shared dashboard. Generated when a dashboard is shared.
   *     (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SharedDashboard&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SharedDashboard>> getPublicDashboardWithHttpInfoAsync(
      String token) {
    Object localVarPostBody = null;

    // verify the required parameter 'token' is set
    if (token == null) {
      CompletableFuture<ApiResponse<SharedDashboard>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'token' when calling getPublicDashboard"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/dashboard/public/{token}"
            .replaceAll("\\{" + "token" + "\\}", apiClient.escapeString(token.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1.DashboardsApi.getPublicDashboard",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SharedDashboard>> result = new CompletableFuture<>();
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
        new GenericType<SharedDashboard>() {});
  }

  /** Manage optional parameters to getPublicDashboardInvitations. */
  public static class GetPublicDashboardInvitationsOptionalParameters {
    private Long pageSize;
    private Long pageNumber;

    /**
     * Set pageSize.
     *
     * @param pageSize The number of records to return in a single request. (optional)
     * @return GetPublicDashboardInvitationsOptionalParameters
     */
    public GetPublicDashboardInvitationsOptionalParameters pageSize(Long pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set pageNumber.
     *
     * @param pageNumber The page to access (base 0). (optional)
     * @return GetPublicDashboardInvitationsOptionalParameters
     */
    public GetPublicDashboardInvitationsOptionalParameters pageNumber(Long pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }
  }

  /**
   * Get all invitations for a shared dashboard.
   *
   * <p>See {@link #getPublicDashboardInvitationsWithHttpInfo}.
   *
   * @param token Token of the shared dashboard for which to fetch invitations. (required)
   * @return SharedDashboardInvites
   * @throws ApiException if fails to make API call
   */
  public SharedDashboardInvites getPublicDashboardInvitations(String token) throws ApiException {
    return getPublicDashboardInvitationsWithHttpInfo(
            token, new GetPublicDashboardInvitationsOptionalParameters())
        .getData();
  }

  /**
   * Get all invitations for a shared dashboard.
   *
   * <p>See {@link #getPublicDashboardInvitationsWithHttpInfoAsync}.
   *
   * @param token Token of the shared dashboard for which to fetch invitations. (required)
   * @return CompletableFuture&lt;SharedDashboardInvites&gt;
   */
  public CompletableFuture<SharedDashboardInvites> getPublicDashboardInvitationsAsync(
      String token) {
    return getPublicDashboardInvitationsWithHttpInfoAsync(
            token, new GetPublicDashboardInvitationsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get all invitations for a shared dashboard.
   *
   * <p>See {@link #getPublicDashboardInvitationsWithHttpInfo}.
   *
   * @param token Token of the shared dashboard for which to fetch invitations. (required)
   * @param parameters Optional parameters for the request.
   * @return SharedDashboardInvites
   * @throws ApiException if fails to make API call
   */
  public SharedDashboardInvites getPublicDashboardInvitations(
      String token, GetPublicDashboardInvitationsOptionalParameters parameters)
      throws ApiException {
    return getPublicDashboardInvitationsWithHttpInfo(token, parameters).getData();
  }

  /**
   * Get all invitations for a shared dashboard.
   *
   * <p>See {@link #getPublicDashboardInvitationsWithHttpInfoAsync}.
   *
   * @param token Token of the shared dashboard for which to fetch invitations. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;SharedDashboardInvites&gt;
   */
  public CompletableFuture<SharedDashboardInvites> getPublicDashboardInvitationsAsync(
      String token, GetPublicDashboardInvitationsOptionalParameters parameters) {
    return getPublicDashboardInvitationsWithHttpInfoAsync(token, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Describe the invitations that exist for the given shared dashboard (paginated).
   *
   * @param token Token of the shared dashboard for which to fetch invitations. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;SharedDashboardInvites&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SharedDashboardInvites> getPublicDashboardInvitationsWithHttpInfo(
      String token, GetPublicDashboardInvitationsOptionalParameters parameters)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'token' is set
    if (token == null) {
      throw new ApiException(
          400, "Missing the required parameter 'token' when calling getPublicDashboardInvitations");
    }
    Long pageSize = parameters.pageSize;
    Long pageNumber = parameters.pageNumber;
    // create path and map variables
    String localVarPath =
        "/api/v1/dashboard/public/{token}/invitation"
            .replaceAll("\\{" + "token" + "\\}", apiClient.escapeString(token.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page_size", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page_number", pageNumber));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v1.DashboardsApi.getPublicDashboardInvitations",
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
        new GenericType<SharedDashboardInvites>() {});
  }

  /**
   * Get all invitations for a shared dashboard.
   *
   * <p>See {@link #getPublicDashboardInvitationsWithHttpInfo}.
   *
   * @param token Token of the shared dashboard for which to fetch invitations. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;SharedDashboardInvites&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SharedDashboardInvites>>
      getPublicDashboardInvitationsWithHttpInfoAsync(
          String token, GetPublicDashboardInvitationsOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'token' is set
    if (token == null) {
      CompletableFuture<ApiResponse<SharedDashboardInvites>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'token' when calling getPublicDashboardInvitations"));
      return result;
    }
    Long pageSize = parameters.pageSize;
    Long pageNumber = parameters.pageNumber;
    // create path and map variables
    String localVarPath =
        "/api/v1/dashboard/public/{token}/invitation"
            .replaceAll("\\{" + "token" + "\\}", apiClient.escapeString(token.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page_size", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page_number", pageNumber));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1.DashboardsApi.getPublicDashboardInvitations",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SharedDashboardInvites>> result = new CompletableFuture<>();
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
        new GenericType<SharedDashboardInvites>() {});
  }

  /** Manage optional parameters to listDashboards. */
  public static class ListDashboardsOptionalParameters {
    private Boolean filterShared;
    private Boolean filterDeleted;
    private Long count;
    private Long start;

    /**
     * Set filterShared.
     *
     * @param filterShared When <code>true</code>, this query only returns shared custom created or
     *     cloned dashboards. (optional)
     * @return ListDashboardsOptionalParameters
     */
    public ListDashboardsOptionalParameters filterShared(Boolean filterShared) {
      this.filterShared = filterShared;
      return this;
    }

    /**
     * Set filterDeleted.
     *
     * @param filterDeleted When <code>true</code>, this query returns only deleted custom-created
     *     or cloned dashboards. This parameter is incompatible with <code>filter[shared]</code>.
     *     (optional)
     * @return ListDashboardsOptionalParameters
     */
    public ListDashboardsOptionalParameters filterDeleted(Boolean filterDeleted) {
      this.filterDeleted = filterDeleted;
      return this;
    }

    /**
     * Set count.
     *
     * @param count The maximum number of dashboards returned in the list. (optional, default to
     *     100)
     * @return ListDashboardsOptionalParameters
     */
    public ListDashboardsOptionalParameters count(Long count) {
      this.count = count;
      return this;
    }

    /**
     * Set start.
     *
     * @param start The specific offset to use as the beginning of the returned response. (optional)
     * @return ListDashboardsOptionalParameters
     */
    public ListDashboardsOptionalParameters start(Long start) {
      this.start = start;
      return this;
    }
  }

  /**
   * Get all dashboards.
   *
   * <p>See {@link #listDashboardsWithHttpInfo}.
   *
   * @return DashboardSummary
   * @throws ApiException if fails to make API call
   */
  public DashboardSummary listDashboards() throws ApiException {
    return listDashboardsWithHttpInfo(new ListDashboardsOptionalParameters()).getData();
  }

  /**
   * Get all dashboards.
   *
   * <p>See {@link #listDashboardsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;DashboardSummary&gt;
   */
  public CompletableFuture<DashboardSummary> listDashboardsAsync() {
    return listDashboardsWithHttpInfoAsync(new ListDashboardsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get all dashboards.
   *
   * <p>See {@link #listDashboardsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return DashboardSummary
   * @throws ApiException if fails to make API call
   */
  public DashboardSummary listDashboards(ListDashboardsOptionalParameters parameters)
      throws ApiException {
    return listDashboardsWithHttpInfo(parameters).getData();
  }

  /**
   * Get all dashboards.
   *
   * <p>See {@link #listDashboardsWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;DashboardSummary&gt;
   */
  public CompletableFuture<DashboardSummary> listDashboardsAsync(
      ListDashboardsOptionalParameters parameters) {
    return listDashboardsWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get all dashboards.
   *
   * <p>See {@link #listDashboardsWithHttpInfo}.
   *
   * @return PaginationIterable&lt;DashboardSummaryDefinition&gt;
   */
  public PaginationIterable<DashboardSummaryDefinition> listDashboardsWithPagination() {
    ListDashboardsOptionalParameters parameters = new ListDashboardsOptionalParameters();
    return listDashboardsWithPagination(parameters);
  }

  /**
   * Get all dashboards.
   *
   * <p>See {@link #listDashboardsWithHttpInfo}.
   *
   * @return DashboardSummary
   */
  public PaginationIterable<DashboardSummaryDefinition> listDashboardsWithPagination(
      ListDashboardsOptionalParameters parameters) {
    String resultsPath = "getDashboards";
    String valueGetterPath = "";
    String valueSetterPath = "start";
    Boolean valueSetterParamOptional = true;
    Long limit;

    if (parameters.count == null) {
      limit = 100l;
      parameters.count(limit);
    } else {
      limit = parameters.count;
    }

    LinkedHashMap<String, Object> args = new LinkedHashMap<String, Object>();
    args.put("optionalParams", parameters);

    PaginationIterable iterator =
        new PaginationIterable(
            this,
            "listDashboards",
            resultsPath,
            valueGetterPath,
            valueSetterPath,
            valueSetterParamOptional,
            true,
            limit,
            args);

    return iterator;
  }

  /**
   * Get all dashboards.
   *
   * <p><strong>Note</strong>: This query will only return custom created or cloned dashboards. This
   * query will not return preset dashboards.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;DashboardSummary&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<DashboardSummary> listDashboardsWithHttpInfo(
      ListDashboardsOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    Boolean filterShared = parameters.filterShared;
    Boolean filterDeleted = parameters.filterDeleted;
    Long count = parameters.count;
    Long start = parameters.start;
    // create path and map variables
    String localVarPath = "/api/v1/dashboard";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[shared]", filterShared));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[deleted]", filterDeleted));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "count", count));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start", start));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v1.DashboardsApi.listDashboards",
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
        new GenericType<DashboardSummary>() {});
  }

  /**
   * Get all dashboards.
   *
   * <p>See {@link #listDashboardsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;DashboardSummary&gt;&gt;
   */
  public CompletableFuture<ApiResponse<DashboardSummary>> listDashboardsWithHttpInfoAsync(
      ListDashboardsOptionalParameters parameters) {
    Object localVarPostBody = null;
    Boolean filterShared = parameters.filterShared;
    Boolean filterDeleted = parameters.filterDeleted;
    Long count = parameters.count;
    Long start = parameters.start;
    // create path and map variables
    String localVarPath = "/api/v1/dashboard";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[shared]", filterShared));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[deleted]", filterDeleted));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "count", count));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start", start));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1.DashboardsApi.listDashboards",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<DashboardSummary>> result = new CompletableFuture<>();
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
        new GenericType<DashboardSummary>() {});
  }

  /**
   * Restore deleted dashboards.
   *
   * <p>See {@link #restoreDashboardsWithHttpInfo}.
   *
   * @param body Restore dashboards request body. (required)
   * @throws ApiException if fails to make API call
   */
  public void restoreDashboards(DashboardRestoreRequest body) throws ApiException {
    restoreDashboardsWithHttpInfo(body);
  }

  /**
   * Restore deleted dashboards.
   *
   * <p>See {@link #restoreDashboardsWithHttpInfoAsync}.
   *
   * @param body Restore dashboards request body. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> restoreDashboardsAsync(DashboardRestoreRequest body) {
    return restoreDashboardsWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Restore dashboards using the specified IDs. If there are any failures, no dashboards will be
   * restored (partial success is not allowed).
   *
   * @param body Restore dashboards request body. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Dashboards Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> restoreDashboardsWithHttpInfo(DashboardRestoreRequest body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling restoreDashboards");
    }
    // create path and map variables
    String localVarPath = "/api/v1/dashboard";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v1.DashboardsApi.restoreDashboards",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Restore deleted dashboards.
   *
   * <p>See {@link #restoreDashboardsWithHttpInfo}.
   *
   * @param body Restore dashboards request body. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> restoreDashboardsWithHttpInfoAsync(
      DashboardRestoreRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling restoreDashboards"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/dashboard";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1.DashboardsApi.restoreDashboards",
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
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Send shared dashboard invitation email.
   *
   * <p>See {@link #sendPublicDashboardInvitationWithHttpInfo}.
   *
   * @param token The token of the shared dashboard. (required)
   * @param body Shared Dashboard Invitation request body. (required)
   * @return SharedDashboardInvites
   * @throws ApiException if fails to make API call
   */
  public SharedDashboardInvites sendPublicDashboardInvitation(
      String token, SharedDashboardInvites body) throws ApiException {
    return sendPublicDashboardInvitationWithHttpInfo(token, body).getData();
  }

  /**
   * Send shared dashboard invitation email.
   *
   * <p>See {@link #sendPublicDashboardInvitationWithHttpInfoAsync}.
   *
   * @param token The token of the shared dashboard. (required)
   * @param body Shared Dashboard Invitation request body. (required)
   * @return CompletableFuture&lt;SharedDashboardInvites&gt;
   */
  public CompletableFuture<SharedDashboardInvites> sendPublicDashboardInvitationAsync(
      String token, SharedDashboardInvites body) {
    return sendPublicDashboardInvitationWithHttpInfoAsync(token, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Send emails to specified email addresses containing links to access a given authenticated
   * shared dashboard. Email addresses must already belong to the authenticated shared dashboard's
   * share_list.
   *
   * @param token The token of the shared dashboard. (required)
   * @param body Shared Dashboard Invitation request body. (required)
   * @return ApiResponse&lt;SharedDashboardInvites&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SharedDashboardInvites> sendPublicDashboardInvitationWithHttpInfo(
      String token, SharedDashboardInvites body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'token' is set
    if (token == null) {
      throw new ApiException(
          400, "Missing the required parameter 'token' when calling sendPublicDashboardInvitation");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling sendPublicDashboardInvitation");
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/dashboard/public/{token}/invitation"
            .replaceAll("\\{" + "token" + "\\}", apiClient.escapeString(token.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v1.DashboardsApi.sendPublicDashboardInvitation",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<SharedDashboardInvites>() {});
  }

  /**
   * Send shared dashboard invitation email.
   *
   * <p>See {@link #sendPublicDashboardInvitationWithHttpInfo}.
   *
   * @param token The token of the shared dashboard. (required)
   * @param body Shared Dashboard Invitation request body. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SharedDashboardInvites&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SharedDashboardInvites>>
      sendPublicDashboardInvitationWithHttpInfoAsync(String token, SharedDashboardInvites body) {
    Object localVarPostBody = body;

    // verify the required parameter 'token' is set
    if (token == null) {
      CompletableFuture<ApiResponse<SharedDashboardInvites>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'token' when calling sendPublicDashboardInvitation"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<SharedDashboardInvites>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling sendPublicDashboardInvitation"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/dashboard/public/{token}/invitation"
            .replaceAll("\\{" + "token" + "\\}", apiClient.escapeString(token.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1.DashboardsApi.sendPublicDashboardInvitation",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SharedDashboardInvites>> result = new CompletableFuture<>();
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
        new GenericType<SharedDashboardInvites>() {});
  }

  /**
   * Update a dashboard.
   *
   * <p>See {@link #updateDashboardWithHttpInfo}.
   *
   * @param dashboardId The ID of the dashboard. (required)
   * @param body Update Dashboard request body. (required)
   * @return Dashboard
   * @throws ApiException if fails to make API call
   */
  public Dashboard updateDashboard(String dashboardId, Dashboard body) throws ApiException {
    return updateDashboardWithHttpInfo(dashboardId, body).getData();
  }

  /**
   * Update a dashboard.
   *
   * <p>See {@link #updateDashboardWithHttpInfoAsync}.
   *
   * @param dashboardId The ID of the dashboard. (required)
   * @param body Update Dashboard request body. (required)
   * @return CompletableFuture&lt;Dashboard&gt;
   */
  public CompletableFuture<Dashboard> updateDashboardAsync(String dashboardId, Dashboard body) {
    return updateDashboardWithHttpInfoAsync(dashboardId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update a dashboard using the specified ID.
   *
   * @param dashboardId The ID of the dashboard. (required)
   * @param body Update Dashboard request body. (required)
   * @return ApiResponse&lt;Dashboard&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Item Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Dashboard> updateDashboardWithHttpInfo(String dashboardId, Dashboard body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'dashboardId' is set
    if (dashboardId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'dashboardId' when calling updateDashboard");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateDashboard");
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/dashboard/{dashboard_id}"
            .replaceAll(
                "\\{" + "dashboard_id" + "\\}", apiClient.escapeString(dashboardId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v1.DashboardsApi.updateDashboard",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "PUT",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<Dashboard>() {});
  }

  /**
   * Update a dashboard.
   *
   * <p>See {@link #updateDashboardWithHttpInfo}.
   *
   * @param dashboardId The ID of the dashboard. (required)
   * @param body Update Dashboard request body. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Dashboard&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Dashboard>> updateDashboardWithHttpInfoAsync(
      String dashboardId, Dashboard body) {
    Object localVarPostBody = body;

    // verify the required parameter 'dashboardId' is set
    if (dashboardId == null) {
      CompletableFuture<ApiResponse<Dashboard>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'dashboardId' when calling updateDashboard"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Dashboard>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateDashboard"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/dashboard/{dashboard_id}"
            .replaceAll(
                "\\{" + "dashboard_id" + "\\}", apiClient.escapeString(dashboardId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1.DashboardsApi.updateDashboard",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Dashboard>> result = new CompletableFuture<>();
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
        new GenericType<Dashboard>() {});
  }

  /**
   * Update a shared dashboard.
   *
   * <p>See {@link #updatePublicDashboardWithHttpInfo}.
   *
   * @param token The token of the shared dashboard. (required)
   * @param body Update Dashboard request body. (required)
   * @return SharedDashboard
   * @throws ApiException if fails to make API call
   */
  public SharedDashboard updatePublicDashboard(String token, SharedDashboardUpdateRequest body)
      throws ApiException {
    return updatePublicDashboardWithHttpInfo(token, body).getData();
  }

  /**
   * Update a shared dashboard.
   *
   * <p>See {@link #updatePublicDashboardWithHttpInfoAsync}.
   *
   * @param token The token of the shared dashboard. (required)
   * @param body Update Dashboard request body. (required)
   * @return CompletableFuture&lt;SharedDashboard&gt;
   */
  public CompletableFuture<SharedDashboard> updatePublicDashboardAsync(
      String token, SharedDashboardUpdateRequest body) {
    return updatePublicDashboardWithHttpInfoAsync(token, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update a shared dashboard associated with the specified token.
   *
   * @param token The token of the shared dashboard. (required)
   * @param body Update Dashboard request body. (required)
   * @return ApiResponse&lt;SharedDashboard&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Item Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SharedDashboard> updatePublicDashboardWithHttpInfo(
      String token, SharedDashboardUpdateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'token' is set
    if (token == null) {
      throw new ApiException(
          400, "Missing the required parameter 'token' when calling updatePublicDashboard");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updatePublicDashboard");
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/dashboard/public/{token}"
            .replaceAll("\\{" + "token" + "\\}", apiClient.escapeString(token.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v1.DashboardsApi.updatePublicDashboard",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "PUT",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<SharedDashboard>() {});
  }

  /**
   * Update a shared dashboard.
   *
   * <p>See {@link #updatePublicDashboardWithHttpInfo}.
   *
   * @param token The token of the shared dashboard. (required)
   * @param body Update Dashboard request body. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SharedDashboard&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SharedDashboard>> updatePublicDashboardWithHttpInfoAsync(
      String token, SharedDashboardUpdateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'token' is set
    if (token == null) {
      CompletableFuture<ApiResponse<SharedDashboard>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'token' when calling updatePublicDashboard"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<SharedDashboard>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updatePublicDashboard"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/dashboard/public/{token}"
            .replaceAll("\\{" + "token" + "\\}", apiClient.escapeString(token.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1.DashboardsApi.updatePublicDashboard",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SharedDashboard>> result = new CompletableFuture<>();
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
        new GenericType<SharedDashboard>() {});
  }
}
