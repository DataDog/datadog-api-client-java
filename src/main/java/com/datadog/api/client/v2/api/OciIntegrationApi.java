package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.CreateTenancyConfigRequest;
import com.datadog.api.client.v2.model.TenancyConfig;
import com.datadog.api.client.v2.model.TenancyConfigList;
import com.datadog.api.client.v2.model.TenancyProductsList;
import com.datadog.api.client.v2.model.UpdateTenancyConfigRequest;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
  public TenancyConfig createTenancyConfig(CreateTenancyConfigRequest body) throws ApiException {
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
  public CompletableFuture<TenancyConfig> createTenancyConfigAsync(
      CreateTenancyConfigRequest body) {
    return createTenancyConfigWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a new tenancy config to establish monitoring and data collection from your OCI
   * environment. Requires OCI authentication credentials and tenancy details. Warning: Datadog
   * recommends interacting with this endpoint only through the Datadog web UI to ensure all
   * necessary OCI resources have been created and configured properly.
   *
   * @param body (required)
   * @return ApiResponse&lt;TenancyConfig&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<TenancyConfig> createTenancyConfigWithHttpInfo(CreateTenancyConfigRequest body)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createTenancyConfig";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
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
      CreateTenancyConfigRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createTenancyConfig";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<TenancyConfig>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
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
   * @param tenancyOcid The OCID of the tenancy config to delete. (required)
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
   * @param tenancyOcid The OCID of the tenancy config to delete. (required)
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
   * Delete an existing tenancy config. This will stop all data collection from the specified OCI
   * tenancy and remove the stored configuration. This operation cannot be undone.
   *
   * @param tenancyOcid The OCID of the tenancy config to delete. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
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
   * @param tenancyOcid The OCID of the tenancy config to delete. (required)
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
   * @param tenancyOcid The OCID of the tenancy config to retrieve. (required)
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
   * @param tenancyOcid The OCID of the tenancy config to retrieve. (required)
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
   * Get a single tenancy config object by its OCID. Returns detailed configuration including
   * authentication credentials, enabled services, region settings, and collection preferences.
   *
   * @param tenancyOcid The OCID of the tenancy config to retrieve. (required)
   * @return ApiResponse&lt;TenancyConfig&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
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
   * @param tenancyOcid The OCID of the tenancy config to retrieve. (required)
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
   * Get a list of all configured OCI tenancy integrations. Returns basic information about each
   * tenancy including authentication credentials, region settings, and collection preferences for
   * metrics, logs, and resources.
   *
   * @return ApiResponse&lt;TenancyConfigList&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<TenancyConfigList> getTenancyConfigsWithHttpInfo() throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getTenancyConfigs";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
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
    // Check if unstable operation is enabled
    String operationId = "getTenancyConfigs";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<TenancyConfigList>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
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
   * List tenancy products.
   *
   * <p>See {@link #listTenancyProductsWithHttpInfo}.
   *
   * @param productKeys Comma-separated list of product keys to filter by. (required)
   * @return TenancyProductsList
   * @throws ApiException if fails to make API call
   */
  public TenancyProductsList listTenancyProducts(String productKeys) throws ApiException {
    return listTenancyProductsWithHttpInfo(productKeys).getData();
  }

  /**
   * List tenancy products.
   *
   * <p>See {@link #listTenancyProductsWithHttpInfoAsync}.
   *
   * @param productKeys Comma-separated list of product keys to filter by. (required)
   * @return CompletableFuture&lt;TenancyProductsList&gt;
   */
  public CompletableFuture<TenancyProductsList> listTenancyProductsAsync(String productKeys) {
    return listTenancyProductsWithHttpInfoAsync(productKeys)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Lists the products for a given tenancy. Returns the enabled/disabled status of Datadog products
   * (such as Cloud Security Posture Management) for specific OCI tenancies.
   *
   * @param productKeys Comma-separated list of product keys to filter by. (required)
   * @return ApiResponse&lt;TenancyProductsList&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<TenancyProductsList> listTenancyProductsWithHttpInfo(String productKeys)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'productKeys' is set
    if (productKeys == null) {
      throw new ApiException(
          400, "Missing the required parameter 'productKeys' when calling listTenancyProducts");
    }
    // create path and map variables
    String localVarPath = "/api/v2/integration/oci/products";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "productKeys", productKeys));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.OciIntegrationApi.listTenancyProducts",
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
        new GenericType<TenancyProductsList>() {});
  }

  /**
   * List tenancy products.
   *
   * <p>See {@link #listTenancyProductsWithHttpInfo}.
   *
   * @param productKeys Comma-separated list of product keys to filter by. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;TenancyProductsList&gt;&gt;
   */
  public CompletableFuture<ApiResponse<TenancyProductsList>> listTenancyProductsWithHttpInfoAsync(
      String productKeys) {
    Object localVarPostBody = null;

    // verify the required parameter 'productKeys' is set
    if (productKeys == null) {
      CompletableFuture<ApiResponse<TenancyProductsList>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'productKeys' when calling listTenancyProducts"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/integration/oci/products";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "productKeys", productKeys));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.OciIntegrationApi.listTenancyProducts",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<TenancyProductsList>> result = new CompletableFuture<>();
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
        new GenericType<TenancyProductsList>() {});
  }

  /**
   * Update tenancy config.
   *
   * <p>See {@link #updateTenancyConfigWithHttpInfo}.
   *
   * @param tenancyOcid The OCID of the tenancy config to update. (required)
   * @param body (required)
   * @return TenancyConfig
   * @throws ApiException if fails to make API call
   */
  public TenancyConfig updateTenancyConfig(String tenancyOcid, UpdateTenancyConfigRequest body)
      throws ApiException {
    return updateTenancyConfigWithHttpInfo(tenancyOcid, body).getData();
  }

  /**
   * Update tenancy config.
   *
   * <p>See {@link #updateTenancyConfigWithHttpInfoAsync}.
   *
   * @param tenancyOcid The OCID of the tenancy config to update. (required)
   * @param body (required)
   * @return CompletableFuture&lt;TenancyConfig&gt;
   */
  public CompletableFuture<TenancyConfig> updateTenancyConfigAsync(
      String tenancyOcid, UpdateTenancyConfigRequest body) {
    return updateTenancyConfigWithHttpInfoAsync(tenancyOcid, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update an existing tenancy config. You can modify authentication credentials, enable/disable
   * collection types, update service filters, and change region settings. Warning: We recommend
   * using the Datadog web UI to avoid unintended update effects.
   *
   * @param tenancyOcid The OCID of the tenancy config to update. (required)
   * @param body (required)
   * @return ApiResponse&lt;TenancyConfig&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<TenancyConfig> updateTenancyConfigWithHttpInfo(
      String tenancyOcid, UpdateTenancyConfigRequest body) throws ApiException {
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
   * @param tenancyOcid The OCID of the tenancy config to update. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;TenancyConfig&gt;&gt;
   */
  public CompletableFuture<ApiResponse<TenancyConfig>> updateTenancyConfigWithHttpInfoAsync(
      String tenancyOcid, UpdateTenancyConfigRequest body) {
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
