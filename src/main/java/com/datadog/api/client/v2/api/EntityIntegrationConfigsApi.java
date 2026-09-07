package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.EntityIntegrationConfigRequest;
import com.datadog.api.client.v2.model.EntityIntegrationConfigResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class EntityIntegrationConfigsApi {
  private ApiClient apiClient;

  public EntityIntegrationConfigsApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public EntityIntegrationConfigsApi(ApiClient apiClient) {
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
   * Delete an entity integration configuration.
   *
   * <p>See {@link #deleteEntityIntegrationConfigWithHttpInfo}.
   *
   * @param integrationId The identifier of the integration whose configuration is being managed.
   *     Supported values are <code>github</code>, <code>jira</code>, and <code>pagerduty</code>.
   *     (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteEntityIntegrationConfig(String integrationId) throws ApiException {
    deleteEntityIntegrationConfigWithHttpInfo(integrationId);
  }

  /**
   * Delete an entity integration configuration.
   *
   * <p>See {@link #deleteEntityIntegrationConfigWithHttpInfoAsync}.
   *
   * @param integrationId The identifier of the integration whose configuration is being managed.
   *     Supported values are <code>github</code>, <code>jira</code>, and <code>pagerduty</code>.
   *     (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteEntityIntegrationConfigAsync(String integrationId) {
    return deleteEntityIntegrationConfigWithHttpInfoAsync(integrationId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete the configuration stored for a given integration in the caller's organization.
   *
   * @param integrationId The identifier of the integration whose configuration is being managed.
   *     Supported values are <code>github</code>, <code>jira</code>, and <code>pagerduty</code>.
   *     (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteEntityIntegrationConfigWithHttpInfo(String integrationId)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteEntityIntegrationConfig";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'integrationId' is set
    if (integrationId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'integrationId' when calling"
              + " deleteEntityIntegrationConfig");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/idp/entity_integrations/{integration_id}"
            .replaceAll(
                "\\{" + "integration_id" + "\\}", apiClient.escapeString(integrationId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.EntityIntegrationConfigsApi.deleteEntityIntegrationConfig",
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
   * Delete an entity integration configuration.
   *
   * <p>See {@link #deleteEntityIntegrationConfigWithHttpInfo}.
   *
   * @param integrationId The identifier of the integration whose configuration is being managed.
   *     Supported values are <code>github</code>, <code>jira</code>, and <code>pagerduty</code>.
   *     (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteEntityIntegrationConfigWithHttpInfoAsync(
      String integrationId) {
    // Check if unstable operation is enabled
    String operationId = "deleteEntityIntegrationConfig";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'integrationId' is set
    if (integrationId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'integrationId' when calling"
                  + " deleteEntityIntegrationConfig"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/idp/entity_integrations/{integration_id}"
            .replaceAll(
                "\\{" + "integration_id" + "\\}", apiClient.escapeString(integrationId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.EntityIntegrationConfigsApi.deleteEntityIntegrationConfig",
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
   * Get an entity integration configuration.
   *
   * <p>See {@link #getEntityIntegrationConfigWithHttpInfo}.
   *
   * @param integrationId The identifier of the integration whose configuration is being managed.
   *     Supported values are <code>github</code>, <code>jira</code>, and <code>pagerduty</code>.
   *     (required)
   * @return EntityIntegrationConfigResponse
   * @throws ApiException if fails to make API call
   */
  public EntityIntegrationConfigResponse getEntityIntegrationConfig(String integrationId)
      throws ApiException {
    return getEntityIntegrationConfigWithHttpInfo(integrationId).getData();
  }

  /**
   * Get an entity integration configuration.
   *
   * <p>See {@link #getEntityIntegrationConfigWithHttpInfoAsync}.
   *
   * @param integrationId The identifier of the integration whose configuration is being managed.
   *     Supported values are <code>github</code>, <code>jira</code>, and <code>pagerduty</code>.
   *     (required)
   * @return CompletableFuture&lt;EntityIntegrationConfigResponse&gt;
   */
  public CompletableFuture<EntityIntegrationConfigResponse> getEntityIntegrationConfigAsync(
      String integrationId) {
    return getEntityIntegrationConfigWithHttpInfoAsync(integrationId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Retrieve the configuration currently stored for a given integration in the caller's
   * organization.
   *
   * @param integrationId The identifier of the integration whose configuration is being managed.
   *     Supported values are <code>github</code>, <code>jira</code>, and <code>pagerduty</code>.
   *     (required)
   * @return ApiResponse&lt;EntityIntegrationConfigResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<EntityIntegrationConfigResponse> getEntityIntegrationConfigWithHttpInfo(
      String integrationId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getEntityIntegrationConfig";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'integrationId' is set
    if (integrationId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'integrationId' when calling getEntityIntegrationConfig");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/idp/entity_integrations/{integration_id}"
            .replaceAll(
                "\\{" + "integration_id" + "\\}", apiClient.escapeString(integrationId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.EntityIntegrationConfigsApi.getEntityIntegrationConfig",
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
        new GenericType<EntityIntegrationConfigResponse>() {});
  }

  /**
   * Get an entity integration configuration.
   *
   * <p>See {@link #getEntityIntegrationConfigWithHttpInfo}.
   *
   * @param integrationId The identifier of the integration whose configuration is being managed.
   *     Supported values are <code>github</code>, <code>jira</code>, and <code>pagerduty</code>.
   *     (required)
   * @return CompletableFuture&lt;ApiResponse&lt;EntityIntegrationConfigResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<EntityIntegrationConfigResponse>>
      getEntityIntegrationConfigWithHttpInfoAsync(String integrationId) {
    // Check if unstable operation is enabled
    String operationId = "getEntityIntegrationConfig";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<EntityIntegrationConfigResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'integrationId' is set
    if (integrationId == null) {
      CompletableFuture<ApiResponse<EntityIntegrationConfigResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'integrationId' when calling"
                  + " getEntityIntegrationConfig"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/idp/entity_integrations/{integration_id}"
            .replaceAll(
                "\\{" + "integration_id" + "\\}", apiClient.escapeString(integrationId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.EntityIntegrationConfigsApi.getEntityIntegrationConfig",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<EntityIntegrationConfigResponse>> result =
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
        new GenericType<EntityIntegrationConfigResponse>() {});
  }

  /**
   * Create or update entity integration configuration.
   *
   * <p>See {@link #updateEntityIntegrationConfigWithHttpInfo}.
   *
   * @param integrationId The identifier of the integration whose configuration is being managed.
   *     Supported values are <code>github</code>, <code>jira</code>, and <code>pagerduty</code>.
   *     (required)
   * @param body (required)
   * @return EntityIntegrationConfigResponse
   * @throws ApiException if fails to make API call
   */
  public EntityIntegrationConfigResponse updateEntityIntegrationConfig(
      String integrationId, EntityIntegrationConfigRequest body) throws ApiException {
    return updateEntityIntegrationConfigWithHttpInfo(integrationId, body).getData();
  }

  /**
   * Create or update entity integration configuration.
   *
   * <p>See {@link #updateEntityIntegrationConfigWithHttpInfoAsync}.
   *
   * @param integrationId The identifier of the integration whose configuration is being managed.
   *     Supported values are <code>github</code>, <code>jira</code>, and <code>pagerduty</code>.
   *     (required)
   * @param body (required)
   * @return CompletableFuture&lt;EntityIntegrationConfigResponse&gt;
   */
  public CompletableFuture<EntityIntegrationConfigResponse> updateEntityIntegrationConfigAsync(
      String integrationId, EntityIntegrationConfigRequest body) {
    return updateEntityIntegrationConfigWithHttpInfoAsync(integrationId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create or replace the configuration for a given integration in the caller's organization. The
   * shape of <code>data.attributes.config</code> depends on the integration:
   *
   * <ul>
   *   <li>For <code>github</code>: <code>config</code> must contain an <code>enabled_repos</code>
   *       array of objects with <code>hostname</code>, <code>github_org_name</code>, and <code>
   *       repo_name</code>.
   *   <li>For <code>jira</code>: <code>config</code> must contain an <code>enabled_projects</code>
   *       array of objects with <code>hostname</code>, <code>account_id</code>, and <code>
   *       project_key</code>.
   *   <li>For <code>pagerduty</code>: <code>config</code> must contain an <code>accounts</code>
   *       array of objects with a required <code>enabled</code> boolean and an optional <code>
   *       subdomain</code> string.
   * </ul>
   *
   * @param integrationId The identifier of the integration whose configuration is being managed.
   *     Supported values are <code>github</code>, <code>jira</code>, and <code>pagerduty</code>.
   *     (required)
   * @param body (required)
   * @return ApiResponse&lt;EntityIntegrationConfigResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<EntityIntegrationConfigResponse> updateEntityIntegrationConfigWithHttpInfo(
      String integrationId, EntityIntegrationConfigRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateEntityIntegrationConfig";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'integrationId' is set
    if (integrationId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'integrationId' when calling"
              + " updateEntityIntegrationConfig");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateEntityIntegrationConfig");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/idp/entity_integrations/{integration_id}"
            .replaceAll(
                "\\{" + "integration_id" + "\\}", apiClient.escapeString(integrationId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.EntityIntegrationConfigsApi.updateEntityIntegrationConfig",
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
        new GenericType<EntityIntegrationConfigResponse>() {});
  }

  /**
   * Create or update entity integration configuration.
   *
   * <p>See {@link #updateEntityIntegrationConfigWithHttpInfo}.
   *
   * @param integrationId The identifier of the integration whose configuration is being managed.
   *     Supported values are <code>github</code>, <code>jira</code>, and <code>pagerduty</code>.
   *     (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;EntityIntegrationConfigResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<EntityIntegrationConfigResponse>>
      updateEntityIntegrationConfigWithHttpInfoAsync(
          String integrationId, EntityIntegrationConfigRequest body) {
    // Check if unstable operation is enabled
    String operationId = "updateEntityIntegrationConfig";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<EntityIntegrationConfigResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'integrationId' is set
    if (integrationId == null) {
      CompletableFuture<ApiResponse<EntityIntegrationConfigResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'integrationId' when calling"
                  + " updateEntityIntegrationConfig"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<EntityIntegrationConfigResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling updateEntityIntegrationConfig"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/idp/entity_integrations/{integration_id}"
            .replaceAll(
                "\\{" + "integration_id" + "\\}", apiClient.escapeString(integrationId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.EntityIntegrationConfigsApi.updateEntityIntegrationConfig",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<EntityIntegrationConfigResponse>> result =
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
        new GenericType<EntityIntegrationConfigResponse>() {});
  }
}
