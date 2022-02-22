package com.datadog.api.v1.client.api;

import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.ApiResponse;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.Pair;
import com.datadog.api.v1.client.model.GCPAccount;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.core.GenericType;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GcpIntegrationApi {
  private ApiClient apiClient;

  public GcpIntegrationApi() {
    this(Configuration.getDefaultApiClient());
  }

  public GcpIntegrationApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get the API client
   *
   * @return API client
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * Set the API client
   *
   * @param apiClient an instance of API client
   */
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create a GCP integration
   *
   * <p>See {@link #createGCPIntegrationWithHttpInfo}.
   *
   * @param body Create a Datadog-GCP integration. (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object createGCPIntegration(GCPAccount body) throws ApiException {
    return createGCPIntegrationWithHttpInfo(body).getData();
  }

  /**
   * Create a GCP integration
   *
   * <p>See {@link #createGCPIntegrationWithHttpInfoAsync}.
   *
   * @param body Create a Datadog-GCP integration. (required)
   * @return CompletableFuture&lt;Object&gt;
   */
  public CompletableFuture<Object> createGCPIntegrationAsync(GCPAccount body) {
    return createGCPIntegrationWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a GCP integration
   *
   * <p>Create a Datadog-GCP integration.
   *
   * @param body Create a Datadog-GCP integration. (required)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Object> createGCPIntegrationWithHttpInfo(GCPAccount body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createGCPIntegration");
    }
    // create path and map variables
    String localVarPath = "/api/v1/integration/gcp";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "GcpIntegrationApi.createGCPIntegration",
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
        new GenericType<Object>() {});
  }

  /**
   * Create a GCP integration
   *
   * <p>See {@link #createGCPIntegrationWithHttpInfo}.
   *
   * @param body Create a Datadog-GCP integration. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Object&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Object>> createGCPIntegrationWithHttpInfoAsync(
      GCPAccount body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Object>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createGCPIntegration"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/integration/gcp";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "createGCPIntegration");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "GcpIntegrationApi.createGCPIntegration",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Object>> result = new CompletableFuture<>();
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
        new GenericType<Object>() {});
  }

  /**
   * Delete a GCP integration
   *
   * <p>See {@link #deleteGCPIntegrationWithHttpInfo}.
   *
   * @param body Delete a given Datadog-GCP integration. (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object deleteGCPIntegration(GCPAccount body) throws ApiException {
    return deleteGCPIntegrationWithHttpInfo(body).getData();
  }

  /**
   * Delete a GCP integration
   *
   * <p>See {@link #deleteGCPIntegrationWithHttpInfoAsync}.
   *
   * @param body Delete a given Datadog-GCP integration. (required)
   * @return CompletableFuture&lt;Object&gt;
   */
  public CompletableFuture<Object> deleteGCPIntegrationAsync(GCPAccount body) {
    return deleteGCPIntegrationWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete a GCP integration
   *
   * <p>Delete a given Datadog-GCP integration.
   *
   * @param body Delete a given Datadog-GCP integration. (required)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Object> deleteGCPIntegrationWithHttpInfo(GCPAccount body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling deleteGCPIntegration");
    }
    // create path and map variables
    String localVarPath = "/api/v1/integration/gcp";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "GcpIntegrationApi.deleteGCPIntegration",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<Object>() {});
  }

  /**
   * Delete a GCP integration
   *
   * <p>See {@link #deleteGCPIntegrationWithHttpInfo}.
   *
   * @param body Delete a given Datadog-GCP integration. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Object&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Object>> deleteGCPIntegrationWithHttpInfoAsync(
      GCPAccount body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Object>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling deleteGCPIntegration"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/integration/gcp";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "deleteGCPIntegration");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "GcpIntegrationApi.deleteGCPIntegration",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Object>> result = new CompletableFuture<>();
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
        new GenericType<Object>() {});
  }

  /**
   * List all GCP integrations
   *
   * <p>See {@link #listGCPIntegrationWithHttpInfo}.
   *
   * @return List&lt;GCPAccount&gt;
   * @throws ApiException if fails to make API call
   */
  public List<GCPAccount> listGCPIntegration() throws ApiException {
    return listGCPIntegrationWithHttpInfo().getData();
  }

  /**
   * List all GCP integrations
   *
   * <p>See {@link #listGCPIntegrationWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;List&lt;GCPAccount&gt;&gt;
   */
  public CompletableFuture<List<GCPAccount>> listGCPIntegrationAsync() {
    return listGCPIntegrationWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List all GCP integrations
   *
   * <p>List all Datadog-GCP integrations configured in your Datadog account.
   *
   * @return ApiResponse&lt;List&lt;GCPAccount&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<List<GCPAccount>> listGCPIntegrationWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v1/integration/gcp";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "GcpIntegrationApi.listGCPIntegration",
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
        new GenericType<List<GCPAccount>>() {});
  }

  /**
   * List all GCP integrations
   *
   * <p>See {@link #listGCPIntegrationWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;List&lt;GCPAccount&gt;&gt;&gt;
   */
  public CompletableFuture<ApiResponse<List<GCPAccount>>> listGCPIntegrationWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v1/integration/gcp";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listGCPIntegration");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "GcpIntegrationApi.listGCPIntegration",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<List<GCPAccount>>> result = new CompletableFuture<>();
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
        new GenericType<List<GCPAccount>>() {});
  }

  /**
   * Update a GCP integration
   *
   * <p>See {@link #updateGCPIntegrationWithHttpInfo}.
   *
   * @param body Update a Datadog-GCP integration. (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object updateGCPIntegration(GCPAccount body) throws ApiException {
    return updateGCPIntegrationWithHttpInfo(body).getData();
  }

  /**
   * Update a GCP integration
   *
   * <p>See {@link #updateGCPIntegrationWithHttpInfoAsync}.
   *
   * @param body Update a Datadog-GCP integration. (required)
   * @return CompletableFuture&lt;Object&gt;
   */
  public CompletableFuture<Object> updateGCPIntegrationAsync(GCPAccount body) {
    return updateGCPIntegrationWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update a GCP integration
   *
   * <p>Update a Datadog-GCP integrations host_filters and/or auto-mute. Requires a
   * &#x60;project_id&#x60; and &#x60;client_email&#x60;, however these fields cannot be updated. If
   * you need to update these fields, delete and use the create (&#x60;POST&#x60;) endpoint. The
   * unspecified fields will keep their original values.
   *
   * @param body Update a Datadog-GCP integration. (required)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Object> updateGCPIntegrationWithHttpInfo(GCPAccount body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateGCPIntegration");
    }
    // create path and map variables
    String localVarPath = "/api/v1/integration/gcp";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "GcpIntegrationApi.updateGCPIntegration",
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
        new GenericType<Object>() {});
  }

  /**
   * Update a GCP integration
   *
   * <p>See {@link #updateGCPIntegrationWithHttpInfo}.
   *
   * @param body Update a Datadog-GCP integration. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Object&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Object>> updateGCPIntegrationWithHttpInfoAsync(
      GCPAccount body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Object>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateGCPIntegration"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/integration/gcp";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "updateGCPIntegration");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "GcpIntegrationApi.updateGCPIntegration",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Object>> result = new CompletableFuture<>();
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
        new GenericType<Object>() {});
  }
}
