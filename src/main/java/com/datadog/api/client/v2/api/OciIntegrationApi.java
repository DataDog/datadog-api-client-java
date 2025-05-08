package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.CreateTenancyConfig;
import com.datadog.api.client.v2.model.TenancyConfig;
import com.datadog.api.client.v2.model.TenancyConfigList;
import com.datadog.api.client.v2.model.UpdateTenancyConfig;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class OciIntegrationApi {
  private ApiClient apiClient;

  public OciIntegrationApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public OciIntegrationApi(ApiClient apiClient) {
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
   * Create tenancy config.
   *
   * <p>See {@link #createTenancyConfigWithHttpInfo}.
   *
   * @param body (required)
   * @return TenancyConfig
   * @throws ApiException if fails to make API call
   */
  public TenancyConfig createTenancyConfig(CreateTenancyConfig body) throws ApiException {
    return createTenancyConfigWithHttpInfo(body).getData();
  }

  /**
   * Create tenancy config.
   *
   * <p>See {@link #createTenancyConfigWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;TenancyConfig&gt;
   */
  public CompletableFuture<TenancyConfig> createTenancyConfigAsync(CreateTenancyConfig body) {
    return createTenancyConfigWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a new tenancy config.
   *
   * @param body (required)
   * @return ApiResponse&lt;TenancyConfig&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<TenancyConfig> createTenancyConfigWithHttpInfo(CreateTenancyConfig body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createTenancyConfig");
    }
    // create path and map variables
    String localVarPath = "/api/v2/integration/oci/tenancies";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.OciIntegrationApi.createTenancyConfig",
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
        new GenericType<TenancyConfig>() {});
  }

  /**
   * Create tenancy config.
   *
   * <p>See {@link #createTenancyConfigWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;TenancyConfig&gt;&gt;
   */
  public CompletableFuture<ApiResponse<TenancyConfig>> createTenancyConfigWithHttpInfoAsync(
      CreateTenancyConfig body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<TenancyConfig>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createTenancyConfig"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/integration/oci/tenancies";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.OciIntegrationApi.createTenancyConfig",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<TenancyConfig>> result = new CompletableFuture<>();
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
        new GenericType<TenancyConfig>() {});
  }

  /**
   * Delete tenancy config.
   *
   * <p>See {@link #deleteTenancyConfigWithHttpInfo}.
   *
   * @param tenancyOcid Unique tenancy OCID of the OCI integration config. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteTenancyConfig(String tenancyOcid) throws ApiException {
    deleteTenancyConfigWithHttpInfo(tenancyOcid);
  }

  /**
   * Delete tenancy config.
   *
   * <p>See {@link #deleteTenancyConfigWithHttpInfoAsync}.
   *
   * @param tenancyOcid Unique tenancy OCID of the OCI integration config. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteTenancyConfigAsync(String tenancyOcid) {
    return deleteTenancyConfigWithHttpInfoAsync(tenancyOcid)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete an existing tenancy config.
   *
   * @param tenancyOcid Unique tenancy OCID of the OCI integration config. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteTenancyConfigWithHttpInfo(String tenancyOcid) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'tenancyOcid' is set
    if (tenancyOcid == null) {
      throw new ApiException(
          400, "Missing the required parameter 'tenancyOcid' when calling deleteTenancyConfig");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration/oci/tenancies/{tenancy_ocid}"
            .replaceAll(
                "\\{" + "tenancy_ocid" + "\\}", apiClient.escapeString(tenancyOcid.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.OciIntegrationApi.deleteTenancyConfig",
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
   * Delete tenancy config.
   *
   * <p>See {@link #deleteTenancyConfigWithHttpInfo}.
   *
   * @param tenancyOcid Unique tenancy OCID of the OCI integration config. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteTenancyConfigWithHttpInfoAsync(
      String tenancyOcid) {
    Object localVarPostBody = null;

    // verify the required parameter 'tenancyOcid' is set
    if (tenancyOcid == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'tenancyOcid' when calling deleteTenancyConfig"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration/oci/tenancies/{tenancy_ocid}"
            .replaceAll(
                "\\{" + "tenancy_ocid" + "\\}", apiClient.escapeString(tenancyOcid.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.OciIntegrationApi.deleteTenancyConfig",
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
   * Get tenancy config.
   *
   * <p>See {@link #getTenancyConfigWithHttpInfo}.
   *
   * @param tenancyOcid Unique tenancy OCID of the OCI integration config. (required)
   * @return TenancyConfig
   * @throws ApiException if fails to make API call
   */
  public TenancyConfig getTenancyConfig(String tenancyOcid) throws ApiException {
    return getTenancyConfigWithHttpInfo(tenancyOcid).getData();
  }

  /**
   * Get tenancy config.
   *
   * <p>See {@link #getTenancyConfigWithHttpInfoAsync}.
   *
   * @param tenancyOcid Unique tenancy OCID of the OCI integration config. (required)
   * @return CompletableFuture&lt;TenancyConfig&gt;
   */
  public CompletableFuture<TenancyConfig> getTenancyConfigAsync(String tenancyOcid) {
    return getTenancyConfigWithHttpInfoAsync(tenancyOcid)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a single tenancy config object.
   *
   * @param tenancyOcid Unique tenancy OCID of the OCI integration config. (required)
   * @return ApiResponse&lt;TenancyConfig&gt;
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
  public ApiResponse<TenancyConfig> getTenancyConfigWithHttpInfo(String tenancyOcid)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'tenancyOcid' is set
    if (tenancyOcid == null) {
      throw new ApiException(
          400, "Missing the required parameter 'tenancyOcid' when calling getTenancyConfig");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration/oci/tenancies/{tenancy_ocid}"
            .replaceAll(
                "\\{" + "tenancy_ocid" + "\\}", apiClient.escapeString(tenancyOcid.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.OciIntegrationApi.getTenancyConfig",
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
        new GenericType<TenancyConfig>() {});
  }

  /**
   * Get tenancy config.
   *
   * <p>See {@link #getTenancyConfigWithHttpInfo}.
   *
   * @param tenancyOcid Unique tenancy OCID of the OCI integration config. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;TenancyConfig&gt;&gt;
   */
  public CompletableFuture<ApiResponse<TenancyConfig>> getTenancyConfigWithHttpInfoAsync(
      String tenancyOcid) {
    Object localVarPostBody = null;

    // verify the required parameter 'tenancyOcid' is set
    if (tenancyOcid == null) {
      CompletableFuture<ApiResponse<TenancyConfig>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'tenancyOcid' when calling getTenancyConfig"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration/oci/tenancies/{tenancy_ocid}"
            .replaceAll(
                "\\{" + "tenancy_ocid" + "\\}", apiClient.escapeString(tenancyOcid.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.OciIntegrationApi.getTenancyConfig",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<TenancyConfig>> result = new CompletableFuture<>();
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
        new GenericType<TenancyConfig>() {});
  }

  /**
   * Get tenancy configs.
   *
   * <p>See {@link #getTenancyConfigsWithHttpInfo}.
   *
   * @return TenancyConfigList
   * @throws ApiException if fails to make API call
   */
  public TenancyConfigList getTenancyConfigs() throws ApiException {
    return getTenancyConfigsWithHttpInfo().getData();
  }

  /**
   * Get tenancy configs.
   *
   * <p>See {@link #getTenancyConfigsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;TenancyConfigList&gt;
   */
  public CompletableFuture<TenancyConfigList> getTenancyConfigsAsync() {
    return getTenancyConfigsWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List all tenancy integrations.
   *
   * @return ApiResponse&lt;TenancyConfigList&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<TenancyConfigList> getTenancyConfigsWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/integration/oci/tenancies";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.OciIntegrationApi.getTenancyConfigs",
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
        new GenericType<TenancyConfigList>() {});
  }

  /**
   * Get tenancy configs.
   *
   * <p>See {@link #getTenancyConfigsWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;TenancyConfigList&gt;&gt;
   */
  public CompletableFuture<ApiResponse<TenancyConfigList>> getTenancyConfigsWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/integration/oci/tenancies";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.OciIntegrationApi.getTenancyConfigs",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<TenancyConfigList>> result = new CompletableFuture<>();
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
        new GenericType<TenancyConfigList>() {});
  }

  /**
   * Update tenancy config.
   *
   * <p>See {@link #updateTenancyConfigWithHttpInfo}.
   *
   * @param tenancyOcid Unique tenancy OCID of the OCI integration config. (required)
   * @param body (required)
   * @return TenancyConfig
   * @throws ApiException if fails to make API call
   */
  public TenancyConfig updateTenancyConfig(String tenancyOcid, UpdateTenancyConfig body)
      throws ApiException {
    return updateTenancyConfigWithHttpInfo(tenancyOcid, body).getData();
  }

  /**
   * Update tenancy config.
   *
   * <p>See {@link #updateTenancyConfigWithHttpInfoAsync}.
   *
   * @param tenancyOcid Unique tenancy OCID of the OCI integration config. (required)
   * @param body (required)
   * @return CompletableFuture&lt;TenancyConfig&gt;
   */
  public CompletableFuture<TenancyConfig> updateTenancyConfigAsync(
      String tenancyOcid, UpdateTenancyConfig body) {
    return updateTenancyConfigWithHttpInfoAsync(tenancyOcid, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update an existing tenancy config.
   *
   * @param tenancyOcid Unique tenancy OCID of the OCI integration config. (required)
   * @param body (required)
   * @return ApiResponse&lt;TenancyConfig&gt;
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
  public ApiResponse<TenancyConfig> updateTenancyConfigWithHttpInfo(
      String tenancyOcid, UpdateTenancyConfig body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'tenancyOcid' is set
    if (tenancyOcid == null) {
      throw new ApiException(
          400, "Missing the required parameter 'tenancyOcid' when calling updateTenancyConfig");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateTenancyConfig");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration/oci/tenancies/{tenancy_ocid}"
            .replaceAll(
                "\\{" + "tenancy_ocid" + "\\}", apiClient.escapeString(tenancyOcid.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.OciIntegrationApi.updateTenancyConfig",
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
        new GenericType<TenancyConfig>() {});
  }

  /**
   * Update tenancy config.
   *
   * <p>See {@link #updateTenancyConfigWithHttpInfo}.
   *
   * @param tenancyOcid Unique tenancy OCID of the OCI integration config. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;TenancyConfig&gt;&gt;
   */
  public CompletableFuture<ApiResponse<TenancyConfig>> updateTenancyConfigWithHttpInfoAsync(
      String tenancyOcid, UpdateTenancyConfig body) {
    Object localVarPostBody = body;

    // verify the required parameter 'tenancyOcid' is set
    if (tenancyOcid == null) {
      CompletableFuture<ApiResponse<TenancyConfig>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'tenancyOcid' when calling updateTenancyConfig"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<TenancyConfig>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateTenancyConfig"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration/oci/tenancies/{tenancy_ocid}"
            .replaceAll(
                "\\{" + "tenancy_ocid" + "\\}", apiClient.escapeString(tenancyOcid.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.OciIntegrationApi.updateTenancyConfig",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<TenancyConfig>> result = new CompletableFuture<>();
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
        new GenericType<TenancyConfig>() {});
  }
}
