package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.TerraformBackendCreateRequest;
import com.datadog.api.client.v2.model.TerraformBackendListResponse;
import com.datadog.api.client.v2.model.TerraformBackendResponse;
import com.datadog.api.client.v2.model.TerraformBackendUpdateRequest;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TerraformStateFilesApi {
  private ApiClient apiClient;

  public TerraformStateFilesApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public TerraformStateFilesApi(ApiClient apiClient) {
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
   * Create a Terraform backend sync configuration.
   *
   * <p>See {@link #createTerraformBackendSyncConfigWithHttpInfo}.
   *
   * @param body (required)
   * @return TerraformBackendResponse
   * @throws ApiException if fails to make API call
   */
  public TerraformBackendResponse createTerraformBackendSyncConfig(
      TerraformBackendCreateRequest body) throws ApiException {
    return createTerraformBackendSyncConfigWithHttpInfo(body).getData();
  }

  /**
   * Create a Terraform backend sync configuration.
   *
   * <p>See {@link #createTerraformBackendSyncConfigWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;TerraformBackendResponse&gt;
   */
  public CompletableFuture<TerraformBackendResponse> createTerraformBackendSyncConfigAsync(
      TerraformBackendCreateRequest body) {
    return createTerraformBackendSyncConfigWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a Terraform backend sync configuration for an AWS account, region, and set of S3
   * buckets.
   *
   * @param body (required)
   * @return ApiResponse&lt;TerraformBackendResponse&gt;
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
  public ApiResponse<TerraformBackendResponse> createTerraformBackendSyncConfigWithHttpInfo(
      TerraformBackendCreateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'body' when calling createTerraformBackendSyncConfig");
    }
    // create path and map variables
    String localVarPath = "/api/v2/iac-api/terraform/backends";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.TerraformStateFilesApi.createTerraformBackendSyncConfig",
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
        new GenericType<TerraformBackendResponse>() {});
  }

  /**
   * Create a Terraform backend sync configuration.
   *
   * <p>See {@link #createTerraformBackendSyncConfigWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;TerraformBackendResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<TerraformBackendResponse>>
      createTerraformBackendSyncConfigWithHttpInfoAsync(TerraformBackendCreateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<TerraformBackendResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " createTerraformBackendSyncConfig"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/iac-api/terraform/backends";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.TerraformStateFilesApi.createTerraformBackendSyncConfig",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<TerraformBackendResponse>> result = new CompletableFuture<>();
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
        new GenericType<TerraformBackendResponse>() {});
  }

  /**
   * Delete a Terraform backend sync configuration.
   *
   * <p>See {@link #deleteTerraformBackendSyncConfigWithHttpInfo}.
   *
   * @param id Terraform backend sync configuration ID. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteTerraformBackendSyncConfig(String id) throws ApiException {
    deleteTerraformBackendSyncConfigWithHttpInfo(id);
  }

  /**
   * Delete a Terraform backend sync configuration.
   *
   * <p>See {@link #deleteTerraformBackendSyncConfigWithHttpInfoAsync}.
   *
   * @param id Terraform backend sync configuration ID. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteTerraformBackendSyncConfigAsync(String id) {
    return deleteTerraformBackendSyncConfigWithHttpInfoAsync(id)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete a Terraform backend sync configuration and its synchronized state files.
   *
   * @param id Terraform backend sync configuration ID. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteTerraformBackendSyncConfigWithHttpInfo(String id)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(
          400, "Missing the required parameter 'id' when calling deleteTerraformBackendSyncConfig");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/iac-api/terraform/backends/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.TerraformStateFilesApi.deleteTerraformBackendSyncConfig",
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
   * Delete a Terraform backend sync configuration.
   *
   * <p>See {@link #deleteTerraformBackendSyncConfigWithHttpInfo}.
   *
   * @param id Terraform backend sync configuration ID. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteTerraformBackendSyncConfigWithHttpInfoAsync(
      String id) {
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'id' when calling deleteTerraformBackendSyncConfig"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/iac-api/terraform/backends/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.TerraformStateFilesApi.deleteTerraformBackendSyncConfig",
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

  /** Manage optional parameters to listTerraformBackendSyncConfigs. */
  public static class ListTerraformBackendSyncConfigsOptionalParameters {
    private String accountId;

    /**
     * Set accountId.
     *
     * @param accountId AWS account ID used to filter configurations. Omit to list all
     *     configurations for the organization. (optional)
     * @return ListTerraformBackendSyncConfigsOptionalParameters
     */
    public ListTerraformBackendSyncConfigsOptionalParameters accountId(String accountId) {
      this.accountId = accountId;
      return this;
    }
  }

  /**
   * List Terraform backend sync configurations.
   *
   * <p>See {@link #listTerraformBackendSyncConfigsWithHttpInfo}.
   *
   * @return TerraformBackendListResponse
   * @throws ApiException if fails to make API call
   */
  public TerraformBackendListResponse listTerraformBackendSyncConfigs() throws ApiException {
    return listTerraformBackendSyncConfigsWithHttpInfo(
            new ListTerraformBackendSyncConfigsOptionalParameters())
        .getData();
  }

  /**
   * List Terraform backend sync configurations.
   *
   * <p>See {@link #listTerraformBackendSyncConfigsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;TerraformBackendListResponse&gt;
   */
  public CompletableFuture<TerraformBackendListResponse> listTerraformBackendSyncConfigsAsync() {
    return listTerraformBackendSyncConfigsWithHttpInfoAsync(
            new ListTerraformBackendSyncConfigsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List Terraform backend sync configurations.
   *
   * <p>See {@link #listTerraformBackendSyncConfigsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return TerraformBackendListResponse
   * @throws ApiException if fails to make API call
   */
  public TerraformBackendListResponse listTerraformBackendSyncConfigs(
      ListTerraformBackendSyncConfigsOptionalParameters parameters) throws ApiException {
    return listTerraformBackendSyncConfigsWithHttpInfo(parameters).getData();
  }

  /**
   * List Terraform backend sync configurations.
   *
   * <p>See {@link #listTerraformBackendSyncConfigsWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;TerraformBackendListResponse&gt;
   */
  public CompletableFuture<TerraformBackendListResponse> listTerraformBackendSyncConfigsAsync(
      ListTerraformBackendSyncConfigsOptionalParameters parameters) {
    return listTerraformBackendSyncConfigsWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List Terraform backend sync configurations, optionally filtered by AWS account ID.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;TerraformBackendListResponse&gt;
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
  public ApiResponse<TerraformBackendListResponse> listTerraformBackendSyncConfigsWithHttpInfo(
      ListTerraformBackendSyncConfigsOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    String accountId = parameters.accountId;
    // create path and map variables
    String localVarPath = "/api/v2/iac-api/terraform/backends";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "account_id", accountId));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.TerraformStateFilesApi.listTerraformBackendSyncConfigs",
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
        new GenericType<TerraformBackendListResponse>() {});
  }

  /**
   * List Terraform backend sync configurations.
   *
   * <p>See {@link #listTerraformBackendSyncConfigsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;TerraformBackendListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<TerraformBackendListResponse>>
      listTerraformBackendSyncConfigsWithHttpInfoAsync(
          ListTerraformBackendSyncConfigsOptionalParameters parameters) {
    Object localVarPostBody = null;
    String accountId = parameters.accountId;
    // create path and map variables
    String localVarPath = "/api/v2/iac-api/terraform/backends";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "account_id", accountId));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.TerraformStateFilesApi.listTerraformBackendSyncConfigs",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<TerraformBackendListResponse>> result =
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
        new GenericType<TerraformBackendListResponse>() {});
  }

  /**
   * Update a Terraform backend sync configuration.
   *
   * <p>See {@link #updateTerraformBackendSyncConfigWithHttpInfo}.
   *
   * @param id Terraform backend sync configuration ID. (required)
   * @param body (required)
   * @return TerraformBackendResponse
   * @throws ApiException if fails to make API call
   */
  public TerraformBackendResponse updateTerraformBackendSyncConfig(
      String id, TerraformBackendUpdateRequest body) throws ApiException {
    return updateTerraformBackendSyncConfigWithHttpInfo(id, body).getData();
  }

  /**
   * Update a Terraform backend sync configuration.
   *
   * <p>See {@link #updateTerraformBackendSyncConfigWithHttpInfoAsync}.
   *
   * @param id Terraform backend sync configuration ID. (required)
   * @param body (required)
   * @return CompletableFuture&lt;TerraformBackendResponse&gt;
   */
  public CompletableFuture<TerraformBackendResponse> updateTerraformBackendSyncConfigAsync(
      String id, TerraformBackendUpdateRequest body) {
    return updateTerraformBackendSyncConfigWithHttpInfoAsync(id, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Replace the complete set of buckets in a Terraform backend sync configuration. The account and
   * region cannot be changed. The resource ID in the request body must match the path ID; a
   * mismatch returns 409 Conflict.
   *
   * @param id Terraform backend sync configuration ID. (required)
   * @param body (required)
   * @return ApiResponse&lt;TerraformBackendResponse&gt;
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
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<TerraformBackendResponse> updateTerraformBackendSyncConfigWithHttpInfo(
      String id, TerraformBackendUpdateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(
          400, "Missing the required parameter 'id' when calling updateTerraformBackendSyncConfig");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'body' when calling updateTerraformBackendSyncConfig");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/iac-api/terraform/backends/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.TerraformStateFilesApi.updateTerraformBackendSyncConfig",
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
        new GenericType<TerraformBackendResponse>() {});
  }

  /**
   * Update a Terraform backend sync configuration.
   *
   * <p>See {@link #updateTerraformBackendSyncConfigWithHttpInfo}.
   *
   * @param id Terraform backend sync configuration ID. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;TerraformBackendResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<TerraformBackendResponse>>
      updateTerraformBackendSyncConfigWithHttpInfoAsync(
          String id, TerraformBackendUpdateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'id' is set
    if (id == null) {
      CompletableFuture<ApiResponse<TerraformBackendResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'id' when calling updateTerraformBackendSyncConfig"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<TerraformBackendResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " updateTerraformBackendSyncConfig"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/iac-api/terraform/backends/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.TerraformStateFilesApi.updateTerraformBackendSyncConfig",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<TerraformBackendResponse>> result = new CompletableFuture<>();
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
        new GenericType<TerraformBackendResponse>() {});
  }
}
