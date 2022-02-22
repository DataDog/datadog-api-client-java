package com.datadog.api.v1.client.api;

import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.ApiResponse;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.Pair;
import com.datadog.api.v1.client.model.AzureAccount;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.core.GenericType;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AzureIntegrationApi {
  private ApiClient apiClient;

  public AzureIntegrationApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AzureIntegrationApi(ApiClient apiClient) {
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
   * Create an Azure integration
   *
   * <p>See {@link #createAzureIntegrationWithHttpInfo}.
   *
   * @param body Create a Datadog-Azure integration for your Datadog account request body.
   *     (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object createAzureIntegration(AzureAccount body) throws ApiException {
    return createAzureIntegrationWithHttpInfo(body).getData();
  }

  /**
   * Create an Azure integration
   *
   * <p>See {@link #createAzureIntegrationWithHttpInfoAsync}.
   *
   * @param body Create a Datadog-Azure integration for your Datadog account request body.
   *     (required)
   * @return CompletableFuture&lt;Object&gt;
   */
  public CompletableFuture<Object> createAzureIntegrationAsync(AzureAccount body) {
    return createAzureIntegrationWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create an Azure integration
   *
   * <p>Create a Datadog-Azure integration. Using the &#x60;POST&#x60; method updates your
   * integration configuration by adding your new configuration to the existing one in your Datadog
   * organization. Using the &#x60;PUT&#x60; method updates your integration configuration by
   * replacing your current configuration with the new one sent to your Datadog organization.
   *
   * @param body Create a Datadog-Azure integration for your Datadog account request body.
   *     (required)
   * @return ApiResponse&lt;Object&gt;
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
  public ApiResponse<Object> createAzureIntegrationWithHttpInfo(AzureAccount body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createAzureIntegration");
    }
    // create path and map variables
    String localVarPath = "/api/v1/integration/azure";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "AzureIntegrationApi.createAzureIntegration",
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
   * Create an Azure integration
   *
   * <p>See {@link #createAzureIntegrationWithHttpInfo}.
   *
   * @param body Create a Datadog-Azure integration for your Datadog account request body.
   *     (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Object&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Object>> createAzureIntegrationWithHttpInfoAsync(
      AzureAccount body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Object>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createAzureIntegration"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/integration/azure";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "createAzureIntegration");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "AzureIntegrationApi.createAzureIntegration",
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
   * Delete an Azure integration
   *
   * <p>See {@link #deleteAzureIntegrationWithHttpInfo}.
   *
   * @param body Delete a given Datadog-Azure integration request body. (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object deleteAzureIntegration(AzureAccount body) throws ApiException {
    return deleteAzureIntegrationWithHttpInfo(body).getData();
  }

  /**
   * Delete an Azure integration
   *
   * <p>See {@link #deleteAzureIntegrationWithHttpInfoAsync}.
   *
   * @param body Delete a given Datadog-Azure integration request body. (required)
   * @return CompletableFuture&lt;Object&gt;
   */
  public CompletableFuture<Object> deleteAzureIntegrationAsync(AzureAccount body) {
    return deleteAzureIntegrationWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete an Azure integration
   *
   * <p>Delete a given Datadog-Azure integration from your Datadog account.
   *
   * @param body Delete a given Datadog-Azure integration request body. (required)
   * @return ApiResponse&lt;Object&gt;
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
  public ApiResponse<Object> deleteAzureIntegrationWithHttpInfo(AzureAccount body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling deleteAzureIntegration");
    }
    // create path and map variables
    String localVarPath = "/api/v1/integration/azure";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "AzureIntegrationApi.deleteAzureIntegration",
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
   * Delete an Azure integration
   *
   * <p>See {@link #deleteAzureIntegrationWithHttpInfo}.
   *
   * @param body Delete a given Datadog-Azure integration request body. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Object&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Object>> deleteAzureIntegrationWithHttpInfoAsync(
      AzureAccount body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Object>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling deleteAzureIntegration"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/integration/azure";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "deleteAzureIntegration");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "AzureIntegrationApi.deleteAzureIntegration",
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
   * List all Azure integrations
   *
   * <p>See {@link #listAzureIntegrationWithHttpInfo}.
   *
   * @return List&lt;AzureAccount&gt;
   * @throws ApiException if fails to make API call
   */
  public List<AzureAccount> listAzureIntegration() throws ApiException {
    return listAzureIntegrationWithHttpInfo().getData();
  }

  /**
   * List all Azure integrations
   *
   * <p>See {@link #listAzureIntegrationWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;List&lt;AzureAccount&gt;&gt;
   */
  public CompletableFuture<List<AzureAccount>> listAzureIntegrationAsync() {
    return listAzureIntegrationWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List all Azure integrations
   *
   * <p>List all Datadog-Azure integrations configured in your Datadog account.
   *
   * @return ApiResponse&lt;List&lt;AzureAccount&gt;&gt;
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
  public ApiResponse<List<AzureAccount>> listAzureIntegrationWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v1/integration/azure";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "AzureIntegrationApi.listAzureIntegration",
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
        new GenericType<List<AzureAccount>>() {});
  }

  /**
   * List all Azure integrations
   *
   * <p>See {@link #listAzureIntegrationWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;List&lt;AzureAccount&gt;&gt;&gt;
   */
  public CompletableFuture<ApiResponse<List<AzureAccount>>>
      listAzureIntegrationWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v1/integration/azure";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listAzureIntegration");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "AzureIntegrationApi.listAzureIntegration",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<List<AzureAccount>>> result = new CompletableFuture<>();
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
        new GenericType<List<AzureAccount>>() {});
  }

  /**
   * Update Azure integration host filters
   *
   * <p>See {@link #updateAzureHostFiltersWithHttpInfo}.
   *
   * @param body Update a Datadog-Azure integration&#39;s host filters request body. (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object updateAzureHostFilters(AzureAccount body) throws ApiException {
    return updateAzureHostFiltersWithHttpInfo(body).getData();
  }

  /**
   * Update Azure integration host filters
   *
   * <p>See {@link #updateAzureHostFiltersWithHttpInfoAsync}.
   *
   * @param body Update a Datadog-Azure integration&#39;s host filters request body. (required)
   * @return CompletableFuture&lt;Object&gt;
   */
  public CompletableFuture<Object> updateAzureHostFiltersAsync(AzureAccount body) {
    return updateAzureHostFiltersWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update Azure integration host filters
   *
   * <p>Update the defined list of host filters for a given Datadog-Azure integration.
   *
   * @param body Update a Datadog-Azure integration&#39;s host filters request body. (required)
   * @return ApiResponse&lt;Object&gt;
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
  public ApiResponse<Object> updateAzureHostFiltersWithHttpInfo(AzureAccount body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateAzureHostFilters");
    }
    // create path and map variables
    String localVarPath = "/api/v1/integration/azure/host_filters";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "AzureIntegrationApi.updateAzureHostFilters",
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
   * Update Azure integration host filters
   *
   * <p>See {@link #updateAzureHostFiltersWithHttpInfo}.
   *
   * @param body Update a Datadog-Azure integration&#39;s host filters request body. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Object&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Object>> updateAzureHostFiltersWithHttpInfoAsync(
      AzureAccount body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Object>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateAzureHostFilters"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/integration/azure/host_filters";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "updateAzureHostFilters");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "AzureIntegrationApi.updateAzureHostFilters",
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
   * Update an Azure integration
   *
   * <p>See {@link #updateAzureIntegrationWithHttpInfo}.
   *
   * @param body Update a Datadog-Azure integration request body. (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object updateAzureIntegration(AzureAccount body) throws ApiException {
    return updateAzureIntegrationWithHttpInfo(body).getData();
  }

  /**
   * Update an Azure integration
   *
   * <p>See {@link #updateAzureIntegrationWithHttpInfoAsync}.
   *
   * @param body Update a Datadog-Azure integration request body. (required)
   * @return CompletableFuture&lt;Object&gt;
   */
  public CompletableFuture<Object> updateAzureIntegrationAsync(AzureAccount body) {
    return updateAzureIntegrationWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update an Azure integration
   *
   * <p>Update a Datadog-Azure integration. Requires an existing &#x60;tenant_name&#x60; and
   * &#x60;client_id&#x60;. Any other fields supplied will overwrite existing values. To overwrite
   * &#x60;tenant_name&#x60; or &#x60;client_id&#x60;, use &#x60;new_tenant_name&#x60; and
   * &#x60;new_client_id&#x60;. To leave a field unchanged, do not supply that field in the payload.
   *
   * @param body Update a Datadog-Azure integration request body. (required)
   * @return ApiResponse&lt;Object&gt;
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
  public ApiResponse<Object> updateAzureIntegrationWithHttpInfo(AzureAccount body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateAzureIntegration");
    }
    // create path and map variables
    String localVarPath = "/api/v1/integration/azure";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "AzureIntegrationApi.updateAzureIntegration",
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
   * Update an Azure integration
   *
   * <p>See {@link #updateAzureIntegrationWithHttpInfo}.
   *
   * @param body Update a Datadog-Azure integration request body. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Object&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Object>> updateAzureIntegrationWithHttpInfoAsync(
      AzureAccount body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Object>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateAzureIntegration"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/integration/azure";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "updateAzureIntegration");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "AzureIntegrationApi.updateAzureIntegration",
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
