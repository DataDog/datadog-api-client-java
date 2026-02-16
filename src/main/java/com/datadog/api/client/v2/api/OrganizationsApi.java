package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.MaxSessionDurationUpdateRequest;
import com.datadog.api.client.v2.model.OrgConfigGetResponse;
import com.datadog.api.client.v2.model.OrgConfigListResponse;
import com.datadog.api.client.v2.model.OrgConfigWriteRequest;
import com.datadog.api.client.v2.model.SamlConfigurationsUpdateRequest;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class OrganizationsApi {
  private ApiClient apiClient;

  public OrganizationsApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public OrganizationsApi(ApiClient apiClient) {
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
   * Get a specific Org Config value.
   *
   * <p>See {@link #getOrgConfigWithHttpInfo}.
   *
   * @param orgConfigName The name of an Org Config. (required)
   * @return OrgConfigGetResponse
   * @throws ApiException if fails to make API call
   */
  public OrgConfigGetResponse getOrgConfig(String orgConfigName) throws ApiException {
    return getOrgConfigWithHttpInfo(orgConfigName).getData();
  }

  /**
   * Get a specific Org Config value.
   *
   * <p>See {@link #getOrgConfigWithHttpInfoAsync}.
   *
   * @param orgConfigName The name of an Org Config. (required)
   * @return CompletableFuture&lt;OrgConfigGetResponse&gt;
   */
  public CompletableFuture<OrgConfigGetResponse> getOrgConfigAsync(String orgConfigName) {
    return getOrgConfigWithHttpInfoAsync(orgConfigName)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Return the name, description, and value of a specific Org Config.
   *
   * @param orgConfigName The name of an Org Config. (required)
   * @return ApiResponse&lt;OrgConfigGetResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<OrgConfigGetResponse> getOrgConfigWithHttpInfo(String orgConfigName)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'orgConfigName' is set
    if (orgConfigName == null) {
      throw new ApiException(
          400, "Missing the required parameter 'orgConfigName' when calling getOrgConfig");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/org_configs/{org_config_name}"
            .replaceAll(
                "\\{" + "org_config_name" + "\\}",
                apiClient.escapeString(orgConfigName.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.OrganizationsApi.getOrgConfig",
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
        new GenericType<OrgConfigGetResponse>() {});
  }

  /**
   * Get a specific Org Config value.
   *
   * <p>See {@link #getOrgConfigWithHttpInfo}.
   *
   * @param orgConfigName The name of an Org Config. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;OrgConfigGetResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<OrgConfigGetResponse>> getOrgConfigWithHttpInfoAsync(
      String orgConfigName) {
    Object localVarPostBody = null;

    // verify the required parameter 'orgConfigName' is set
    if (orgConfigName == null) {
      CompletableFuture<ApiResponse<OrgConfigGetResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'orgConfigName' when calling getOrgConfig"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/org_configs/{org_config_name}"
            .replaceAll(
                "\\{" + "org_config_name" + "\\}",
                apiClient.escapeString(orgConfigName.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.OrganizationsApi.getOrgConfig",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<OrgConfigGetResponse>> result = new CompletableFuture<>();
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
        new GenericType<OrgConfigGetResponse>() {});
  }

  /**
   * List Org Configs.
   *
   * <p>See {@link #listOrgConfigsWithHttpInfo}.
   *
   * @return OrgConfigListResponse
   * @throws ApiException if fails to make API call
   */
  public OrgConfigListResponse listOrgConfigs() throws ApiException {
    return listOrgConfigsWithHttpInfo().getData();
  }

  /**
   * List Org Configs.
   *
   * <p>See {@link #listOrgConfigsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;OrgConfigListResponse&gt;
   */
  public CompletableFuture<OrgConfigListResponse> listOrgConfigsAsync() {
    return listOrgConfigsWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Returns all Org Configs (name, description, and value).
   *
   * @return ApiResponse&lt;OrgConfigListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<OrgConfigListResponse> listOrgConfigsWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/org_configs";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.OrganizationsApi.listOrgConfigs",
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
        new GenericType<OrgConfigListResponse>() {});
  }

  /**
   * List Org Configs.
   *
   * <p>See {@link #listOrgConfigsWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;OrgConfigListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<OrgConfigListResponse>> listOrgConfigsWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/org_configs";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.OrganizationsApi.listOrgConfigs",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<OrgConfigListResponse>> result = new CompletableFuture<>();
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
        new GenericType<OrgConfigListResponse>() {});
  }

  /**
   * Update maximum session duration.
   *
   * <p>See {@link #updateLoginOrgConfigMaxSessionDurationWithHttpInfo}.
   *
   * @param body (required)
   * @throws ApiException if fails to make API call
   */
  public void updateLoginOrgConfigMaxSessionDuration(MaxSessionDurationUpdateRequest body)
      throws ApiException {
    updateLoginOrgConfigMaxSessionDurationWithHttpInfo(body);
  }

  /**
   * Update maximum session duration.
   *
   * <p>See {@link #updateLoginOrgConfigMaxSessionDurationWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> updateLoginOrgConfigMaxSessionDurationAsync(
      MaxSessionDurationUpdateRequest body) {
    return updateLoginOrgConfigMaxSessionDurationWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Updates the maximum session duration for an organization. This controls how long user sessions
   * can remain active before requiring re-authentication. The value must not exceed 30 days
   * (2592000 seconds). Note: Government cloud environments are limited to 24 hours (86400 seconds).
   *
   * <p>Requires <code>org_management</code> permission and a session that has been active within
   * the last 12 hours.
   *
   * @param body (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content - The maximum session duration was successfully updated. </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> updateLoginOrgConfigMaxSessionDurationWithHttpInfo(
      MaxSessionDurationUpdateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateLoginOrgConfigMaxSessionDuration";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'body' when calling"
              + " updateLoginOrgConfigMaxSessionDuration");
    }
    // create path and map variables
    String localVarPath = "/api/v2/login/org_configs/max_session_duration";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.OrganizationsApi.updateLoginOrgConfigMaxSessionDuration",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "PUT",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Update maximum session duration.
   *
   * <p>See {@link #updateLoginOrgConfigMaxSessionDurationWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>>
      updateLoginOrgConfigMaxSessionDurationWithHttpInfoAsync(
          MaxSessionDurationUpdateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "updateLoginOrgConfigMaxSessionDuration";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " updateLoginOrgConfigMaxSessionDuration"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/login/org_configs/max_session_duration";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.OrganizationsApi.updateLoginOrgConfigMaxSessionDuration",
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
        "PUT",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Update a specific Org Config.
   *
   * <p>See {@link #updateOrgConfigWithHttpInfo}.
   *
   * @param orgConfigName The name of an Org Config. (required)
   * @param body (required)
   * @return OrgConfigGetResponse
   * @throws ApiException if fails to make API call
   */
  public OrgConfigGetResponse updateOrgConfig(String orgConfigName, OrgConfigWriteRequest body)
      throws ApiException {
    return updateOrgConfigWithHttpInfo(orgConfigName, body).getData();
  }

  /**
   * Update a specific Org Config.
   *
   * <p>See {@link #updateOrgConfigWithHttpInfoAsync}.
   *
   * @param orgConfigName The name of an Org Config. (required)
   * @param body (required)
   * @return CompletableFuture&lt;OrgConfigGetResponse&gt;
   */
  public CompletableFuture<OrgConfigGetResponse> updateOrgConfigAsync(
      String orgConfigName, OrgConfigWriteRequest body) {
    return updateOrgConfigWithHttpInfoAsync(orgConfigName, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update the value of a specific Org Config.
   *
   * @param orgConfigName The name of an Org Config. (required)
   * @param body (required)
   * @return ApiResponse&lt;OrgConfigGetResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<OrgConfigGetResponse> updateOrgConfigWithHttpInfo(
      String orgConfigName, OrgConfigWriteRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'orgConfigName' is set
    if (orgConfigName == null) {
      throw new ApiException(
          400, "Missing the required parameter 'orgConfigName' when calling updateOrgConfig");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateOrgConfig");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/org_configs/{org_config_name}"
            .replaceAll(
                "\\{" + "org_config_name" + "\\}",
                apiClient.escapeString(orgConfigName.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.OrganizationsApi.updateOrgConfig",
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
        new GenericType<OrgConfigGetResponse>() {});
  }

  /**
   * Update a specific Org Config.
   *
   * <p>See {@link #updateOrgConfigWithHttpInfo}.
   *
   * @param orgConfigName The name of an Org Config. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;OrgConfigGetResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<OrgConfigGetResponse>> updateOrgConfigWithHttpInfoAsync(
      String orgConfigName, OrgConfigWriteRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'orgConfigName' is set
    if (orgConfigName == null) {
      CompletableFuture<ApiResponse<OrgConfigGetResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'orgConfigName' when calling updateOrgConfig"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<OrgConfigGetResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateOrgConfig"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/org_configs/{org_config_name}"
            .replaceAll(
                "\\{" + "org_config_name" + "\\}",
                apiClient.escapeString(orgConfigName.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.OrganizationsApi.updateOrgConfig",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<OrgConfigGetResponse>> result = new CompletableFuture<>();
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
        new GenericType<OrgConfigGetResponse>() {});
  }

  /**
   * Update organization SAML preferences.
   *
   * <p>See {@link #updateOrgSamlConfigurationsWithHttpInfo}.
   *
   * @param body (required)
   * @throws ApiException if fails to make API call
   */
  public void updateOrgSamlConfigurations(SamlConfigurationsUpdateRequest body)
      throws ApiException {
    updateOrgSamlConfigurationsWithHttpInfo(body);
  }

  /**
   * Update organization SAML preferences.
   *
   * <p>See {@link #updateOrgSamlConfigurationsWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> updateOrgSamlConfigurationsAsync(
      SamlConfigurationsUpdateRequest body) {
    return updateOrgSamlConfigurationsWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Updates SAML preferences for an organization, including JIT provisioning domains and default
   * role assignments.
   *
   * <p>This endpoint allows you to configure: - <code>jit_domains</code>: List of domains for
   * Just-In-Time user provisioning (up to 50 domains, 1-256 characters each) - <code>
   * default_role_uuids</code>: List of role UUIDs to assign to JIT-provisioned users (exactly 1
   * role required)
   *
   * <p>Requires <code>org_management</code> permission. This endpoint is gated by the <code>
   * org-saml-preferences-api-gate</code> experiment.
   *
   * @param body (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content - The SAML preferences were successfully updated. </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> updateOrgSamlConfigurationsWithHttpInfo(
      SamlConfigurationsUpdateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateOrgSamlConfigurations";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateOrgSamlConfigurations");
    }
    // create path and map variables
    String localVarPath = "/api/v2/org/saml_configurations";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.OrganizationsApi.updateOrgSamlConfigurations",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
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
   * Update organization SAML preferences.
   *
   * <p>See {@link #updateOrgSamlConfigurationsWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> updateOrgSamlConfigurationsWithHttpInfoAsync(
      SamlConfigurationsUpdateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "updateOrgSamlConfigurations";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling updateOrgSamlConfigurations"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/org/saml_configurations";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.OrganizationsApi.updateOrgSamlConfigurations",
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
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /** Manage optional parameters to uploadIdPMetadata. */
  public static class UploadIdPMetadataOptionalParameters {
    private File idpFile;

    /**
     * Set idpFile.
     *
     * @param idpFile The IdP metadata XML file (optional)
     * @return UploadIdPMetadataOptionalParameters
     */
    public UploadIdPMetadataOptionalParameters idpFile(File idpFile) {
      this.idpFile = idpFile;
      return this;
    }
  }

  /**
   * Upload IdP metadata.
   *
   * <p>See {@link #uploadIdPMetadataWithHttpInfo}.
   *
   * @throws ApiException if fails to make API call
   */
  public void uploadIdPMetadata() throws ApiException {
    uploadIdPMetadataWithHttpInfo(new UploadIdPMetadataOptionalParameters());
  }

  /**
   * Upload IdP metadata.
   *
   * <p>See {@link #uploadIdPMetadataWithHttpInfoAsync}.
   *
   * @return CompletableFuture
   */
  public CompletableFuture<Void> uploadIdPMetadataAsync() {
    return uploadIdPMetadataWithHttpInfoAsync(new UploadIdPMetadataOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Upload IdP metadata.
   *
   * <p>See {@link #uploadIdPMetadataWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @throws ApiException if fails to make API call
   */
  public void uploadIdPMetadata(UploadIdPMetadataOptionalParameters parameters)
      throws ApiException {
    uploadIdPMetadataWithHttpInfo(parameters);
  }

  /**
   * Upload IdP metadata.
   *
   * <p>See {@link #uploadIdPMetadataWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture
   */
  public CompletableFuture<Void> uploadIdPMetadataAsync(
      UploadIdPMetadataOptionalParameters parameters) {
    return uploadIdPMetadataWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Endpoint for uploading IdP metadata for SAML setup.
   *
   * <p>Use this endpoint to upload or replace IdP metadata for SAML login configuration.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> uploadIdPMetadataWithHttpInfo(
      UploadIdPMetadataOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    File idpFile = parameters.idpFile;
    // create path and map variables
    String localVarPath = "/api/v2/saml_configurations/idp_metadata";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    if (idpFile != null) {
      localVarFormParams.put("idp_file", idpFile);
    }

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.OrganizationsApi.uploadIdPMetadata",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"multipart/form-data"},
        localVarPostBody,
        localVarFormParams,
        false,
        null);
  }

  /**
   * Upload IdP metadata.
   *
   * <p>See {@link #uploadIdPMetadataWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> uploadIdPMetadataWithHttpInfoAsync(
      UploadIdPMetadataOptionalParameters parameters) {
    Object localVarPostBody = null;
    File idpFile = parameters.idpFile;
    // create path and map variables
    String localVarPath = "/api/v2/saml_configurations/idp_metadata";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    if (idpFile != null) {
      localVarFormParams.put("idp_file", idpFile);
    }

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.OrganizationsApi.uploadIdPMetadata",
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
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"multipart/form-data"},
        localVarPostBody,
        localVarFormParams,
        false,
        null);
  }
}
