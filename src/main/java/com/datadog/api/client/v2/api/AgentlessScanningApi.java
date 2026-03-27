package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.AwsOnDemandCreateRequest;
import com.datadog.api.client.v2.model.AwsOnDemandListResponse;
import com.datadog.api.client.v2.model.AwsOnDemandResponse;
import com.datadog.api.client.v2.model.AwsScanOptionsCreateRequest;
import com.datadog.api.client.v2.model.AwsScanOptionsListResponse;
import com.datadog.api.client.v2.model.AwsScanOptionsResponse;
import com.datadog.api.client.v2.model.AwsScanOptionsUpdateRequest;
import com.datadog.api.client.v2.model.AzureScanOptions;
import com.datadog.api.client.v2.model.AzureScanOptionsArray;
import com.datadog.api.client.v2.model.AzureScanOptionsInputUpdate;
import com.datadog.api.client.v2.model.GcpScanOptions;
import com.datadog.api.client.v2.model.GcpScanOptionsArray;
import com.datadog.api.client.v2.model.GcpScanOptionsInputUpdate;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AgentlessScanningApi {
  private ApiClient apiClient;

  public AgentlessScanningApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public AgentlessScanningApi(ApiClient apiClient) {
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
   * Create AWS on demand task.
   *
   * <p>See {@link #createAwsOnDemandTaskWithHttpInfo}.
   *
   * @param body The definition of the on demand task. (required)
   * @return AwsOnDemandResponse
   * @throws ApiException if fails to make API call
   */
  public AwsOnDemandResponse createAwsOnDemandTask(AwsOnDemandCreateRequest body)
      throws ApiException {
    return createAwsOnDemandTaskWithHttpInfo(body).getData();
  }

  /**
   * Create AWS on demand task.
   *
   * <p>See {@link #createAwsOnDemandTaskWithHttpInfoAsync}.
   *
   * @param body The definition of the on demand task. (required)
   * @return CompletableFuture&lt;AwsOnDemandResponse&gt;
   */
  public CompletableFuture<AwsOnDemandResponse> createAwsOnDemandTaskAsync(
      AwsOnDemandCreateRequest body) {
    return createAwsOnDemandTaskWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Trigger the scan of an AWS resource with a high priority. Agentless scanning must be activated
   * for the AWS account containing the resource to scan.
   *
   * @param body The definition of the on demand task. (required)
   * @return ApiResponse&lt;AwsOnDemandResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> AWS on demand task created successfully. </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AwsOnDemandResponse> createAwsOnDemandTaskWithHttpInfo(
      AwsOnDemandCreateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createAwsOnDemandTask");
    }
    // create path and map variables
    String localVarPath = "/api/v2/agentless_scanning/ondemand/aws";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AgentlessScanningApi.createAwsOnDemandTask",
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
        new GenericType<AwsOnDemandResponse>() {});
  }

  /**
   * Create AWS on demand task.
   *
   * <p>See {@link #createAwsOnDemandTaskWithHttpInfo}.
   *
   * @param body The definition of the on demand task. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AwsOnDemandResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AwsOnDemandResponse>> createAwsOnDemandTaskWithHttpInfoAsync(
      AwsOnDemandCreateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<AwsOnDemandResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createAwsOnDemandTask"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/agentless_scanning/ondemand/aws";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AgentlessScanningApi.createAwsOnDemandTask",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AwsOnDemandResponse>> result = new CompletableFuture<>();
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
        new GenericType<AwsOnDemandResponse>() {});
  }

  /**
   * Create AWS scan options.
   *
   * <p>See {@link #createAwsScanOptionsWithHttpInfo}.
   *
   * @param body The definition of the new scan options. (required)
   * @return AwsScanOptionsResponse
   * @throws ApiException if fails to make API call
   */
  public AwsScanOptionsResponse createAwsScanOptions(AwsScanOptionsCreateRequest body)
      throws ApiException {
    return createAwsScanOptionsWithHttpInfo(body).getData();
  }

  /**
   * Create AWS scan options.
   *
   * <p>See {@link #createAwsScanOptionsWithHttpInfoAsync}.
   *
   * @param body The definition of the new scan options. (required)
   * @return CompletableFuture&lt;AwsScanOptionsResponse&gt;
   */
  public CompletableFuture<AwsScanOptionsResponse> createAwsScanOptionsAsync(
      AwsScanOptionsCreateRequest body) {
    return createAwsScanOptionsWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Activate Agentless scan options for an AWS account.
   *
   * @param body The definition of the new scan options. (required)
   * @return ApiResponse&lt;AwsScanOptionsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Agentless scan options enabled successfully. </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AwsScanOptionsResponse> createAwsScanOptionsWithHttpInfo(
      AwsScanOptionsCreateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createAwsScanOptions");
    }
    // create path and map variables
    String localVarPath = "/api/v2/agentless_scanning/accounts/aws";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AgentlessScanningApi.createAwsScanOptions",
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
        new GenericType<AwsScanOptionsResponse>() {});
  }

  /**
   * Create AWS scan options.
   *
   * <p>See {@link #createAwsScanOptionsWithHttpInfo}.
   *
   * @param body The definition of the new scan options. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AwsScanOptionsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AwsScanOptionsResponse>>
      createAwsScanOptionsWithHttpInfoAsync(AwsScanOptionsCreateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<AwsScanOptionsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createAwsScanOptions"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/agentless_scanning/accounts/aws";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AgentlessScanningApi.createAwsScanOptions",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AwsScanOptionsResponse>> result = new CompletableFuture<>();
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
        new GenericType<AwsScanOptionsResponse>() {});
  }

  /**
   * Create Azure scan options.
   *
   * <p>See {@link #createAzureScanOptionsWithHttpInfo}.
   *
   * @param body (required)
   * @return AzureScanOptions
   * @throws ApiException if fails to make API call
   */
  public AzureScanOptions createAzureScanOptions(AzureScanOptions body) throws ApiException {
    return createAzureScanOptionsWithHttpInfo(body).getData();
  }

  /**
   * Create Azure scan options.
   *
   * <p>See {@link #createAzureScanOptionsWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;AzureScanOptions&gt;
   */
  public CompletableFuture<AzureScanOptions> createAzureScanOptionsAsync(AzureScanOptions body) {
    return createAzureScanOptionsWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Activate Agentless scan options for an Azure subscription.
   *
   * @param body (required)
   * @return ApiResponse&lt;AzureScanOptions&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AzureScanOptions> createAzureScanOptionsWithHttpInfo(AzureScanOptions body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createAzureScanOptions");
    }
    // create path and map variables
    String localVarPath = "/api/v2/agentless_scanning/accounts/azure";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AgentlessScanningApi.createAzureScanOptions",
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
        new GenericType<AzureScanOptions>() {});
  }

  /**
   * Create Azure scan options.
   *
   * <p>See {@link #createAzureScanOptionsWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AzureScanOptions&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AzureScanOptions>> createAzureScanOptionsWithHttpInfoAsync(
      AzureScanOptions body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<AzureScanOptions>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createAzureScanOptions"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/agentless_scanning/accounts/azure";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AgentlessScanningApi.createAzureScanOptions",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AzureScanOptions>> result = new CompletableFuture<>();
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
        new GenericType<AzureScanOptions>() {});
  }

  /**
   * Create GCP scan options.
   *
   * <p>See {@link #createGcpScanOptionsWithHttpInfo}.
   *
   * @param body The definition of the new scan options. (required)
   * @return GcpScanOptions
   * @throws ApiException if fails to make API call
   */
  public GcpScanOptions createGcpScanOptions(GcpScanOptions body) throws ApiException {
    return createGcpScanOptionsWithHttpInfo(body).getData();
  }

  /**
   * Create GCP scan options.
   *
   * <p>See {@link #createGcpScanOptionsWithHttpInfoAsync}.
   *
   * @param body The definition of the new scan options. (required)
   * @return CompletableFuture&lt;GcpScanOptions&gt;
   */
  public CompletableFuture<GcpScanOptions> createGcpScanOptionsAsync(GcpScanOptions body) {
    return createGcpScanOptionsWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Activate Agentless scan options for a GCP project.
   *
   * @param body The definition of the new scan options. (required)
   * @return ApiResponse&lt;GcpScanOptions&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Agentless scan options enabled successfully. </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<GcpScanOptions> createGcpScanOptionsWithHttpInfo(GcpScanOptions body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createGcpScanOptions");
    }
    // create path and map variables
    String localVarPath = "/api/v2/agentless_scanning/accounts/gcp";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AgentlessScanningApi.createGcpScanOptions",
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
        new GenericType<GcpScanOptions>() {});
  }

  /**
   * Create GCP scan options.
   *
   * <p>See {@link #createGcpScanOptionsWithHttpInfo}.
   *
   * @param body The definition of the new scan options. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;GcpScanOptions&gt;&gt;
   */
  public CompletableFuture<ApiResponse<GcpScanOptions>> createGcpScanOptionsWithHttpInfoAsync(
      GcpScanOptions body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<GcpScanOptions>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createGcpScanOptions"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/agentless_scanning/accounts/gcp";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AgentlessScanningApi.createGcpScanOptions",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<GcpScanOptions>> result = new CompletableFuture<>();
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
        new GenericType<GcpScanOptions>() {});
  }

  /**
   * Delete AWS scan options.
   *
   * <p>See {@link #deleteAwsScanOptionsWithHttpInfo}.
   *
   * @param accountId The ID of an AWS account. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteAwsScanOptions(String accountId) throws ApiException {
    deleteAwsScanOptionsWithHttpInfo(accountId);
  }

  /**
   * Delete AWS scan options.
   *
   * <p>See {@link #deleteAwsScanOptionsWithHttpInfoAsync}.
   *
   * @param accountId The ID of an AWS account. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteAwsScanOptionsAsync(String accountId) {
    return deleteAwsScanOptionsWithHttpInfoAsync(accountId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete Agentless scan options for an AWS account.
   *
   * @param accountId The ID of an AWS account. (required)
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
  public ApiResponse<Void> deleteAwsScanOptionsWithHttpInfo(String accountId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'accountId' when calling deleteAwsScanOptions");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/agentless_scanning/accounts/aws/{account_id}"
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AgentlessScanningApi.deleteAwsScanOptions",
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
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Delete AWS scan options.
   *
   * <p>See {@link #deleteAwsScanOptionsWithHttpInfo}.
   *
   * @param accountId The ID of an AWS account. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteAwsScanOptionsWithHttpInfoAsync(
      String accountId) {
    Object localVarPostBody = null;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'accountId' when calling deleteAwsScanOptions"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/agentless_scanning/accounts/aws/{account_id}"
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AgentlessScanningApi.deleteAwsScanOptions",
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
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Delete Azure scan options.
   *
   * <p>See {@link #deleteAzureScanOptionsWithHttpInfo}.
   *
   * @param subscriptionId The Azure subscription ID. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteAzureScanOptions(String subscriptionId) throws ApiException {
    deleteAzureScanOptionsWithHttpInfo(subscriptionId);
  }

  /**
   * Delete Azure scan options.
   *
   * <p>See {@link #deleteAzureScanOptionsWithHttpInfoAsync}.
   *
   * @param subscriptionId The Azure subscription ID. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteAzureScanOptionsAsync(String subscriptionId) {
    return deleteAzureScanOptionsWithHttpInfoAsync(subscriptionId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete Agentless scan options for an Azure subscription.
   *
   * @param subscriptionId The Azure subscription ID. (required)
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
  public ApiResponse<Void> deleteAzureScanOptionsWithHttpInfo(String subscriptionId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'subscriptionId' is set
    if (subscriptionId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'subscriptionId' when calling deleteAzureScanOptions");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/agentless_scanning/accounts/azure/{subscription_id}"
            .replaceAll(
                "\\{" + "subscription_id" + "\\}",
                apiClient.escapeString(subscriptionId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AgentlessScanningApi.deleteAzureScanOptions",
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
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Delete Azure scan options.
   *
   * <p>See {@link #deleteAzureScanOptionsWithHttpInfo}.
   *
   * @param subscriptionId The Azure subscription ID. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteAzureScanOptionsWithHttpInfoAsync(
      String subscriptionId) {
    Object localVarPostBody = null;

    // verify the required parameter 'subscriptionId' is set
    if (subscriptionId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'subscriptionId' when calling"
                  + " deleteAzureScanOptions"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/agentless_scanning/accounts/azure/{subscription_id}"
            .replaceAll(
                "\\{" + "subscription_id" + "\\}",
                apiClient.escapeString(subscriptionId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AgentlessScanningApi.deleteAzureScanOptions",
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
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Delete GCP scan options.
   *
   * <p>See {@link #deleteGcpScanOptionsWithHttpInfo}.
   *
   * @param projectId The GCP project ID. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteGcpScanOptions(String projectId) throws ApiException {
    deleteGcpScanOptionsWithHttpInfo(projectId);
  }

  /**
   * Delete GCP scan options.
   *
   * <p>See {@link #deleteGcpScanOptionsWithHttpInfoAsync}.
   *
   * @param projectId The GCP project ID. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteGcpScanOptionsAsync(String projectId) {
    return deleteGcpScanOptionsWithHttpInfoAsync(projectId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete Agentless scan options for a GCP project.
   *
   * @param projectId The GCP project ID. (required)
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
  public ApiResponse<Void> deleteGcpScanOptionsWithHttpInfo(String projectId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'projectId' when calling deleteGcpScanOptions");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/agentless_scanning/accounts/gcp/{project_id}"
            .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AgentlessScanningApi.deleteGcpScanOptions",
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
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Delete GCP scan options.
   *
   * <p>See {@link #deleteGcpScanOptionsWithHttpInfo}.
   *
   * @param projectId The GCP project ID. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteGcpScanOptionsWithHttpInfoAsync(
      String projectId) {
    Object localVarPostBody = null;

    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'projectId' when calling deleteGcpScanOptions"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/agentless_scanning/accounts/gcp/{project_id}"
            .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AgentlessScanningApi.deleteGcpScanOptions",
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
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Get AWS on demand task.
   *
   * <p>See {@link #getAwsOnDemandTaskWithHttpInfo}.
   *
   * @param taskId The UUID of the task. (required)
   * @return AwsOnDemandResponse
   * @throws ApiException if fails to make API call
   */
  public AwsOnDemandResponse getAwsOnDemandTask(String taskId) throws ApiException {
    return getAwsOnDemandTaskWithHttpInfo(taskId).getData();
  }

  /**
   * Get AWS on demand task.
   *
   * <p>See {@link #getAwsOnDemandTaskWithHttpInfoAsync}.
   *
   * @param taskId The UUID of the task. (required)
   * @return CompletableFuture&lt;AwsOnDemandResponse&gt;
   */
  public CompletableFuture<AwsOnDemandResponse> getAwsOnDemandTaskAsync(String taskId) {
    return getAwsOnDemandTaskWithHttpInfoAsync(taskId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Fetch the data of a specific on demand task.
   *
   * @param taskId The UUID of the task. (required)
   * @return ApiResponse&lt;AwsOnDemandResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK. </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AwsOnDemandResponse> getAwsOnDemandTaskWithHttpInfo(String taskId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'taskId' is set
    if (taskId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'taskId' when calling getAwsOnDemandTask");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/agentless_scanning/ondemand/aws/{task_id}"
            .replaceAll("\\{" + "task_id" + "\\}", apiClient.escapeString(taskId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AgentlessScanningApi.getAwsOnDemandTask",
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
        new GenericType<AwsOnDemandResponse>() {});
  }

  /**
   * Get AWS on demand task.
   *
   * <p>See {@link #getAwsOnDemandTaskWithHttpInfo}.
   *
   * @param taskId The UUID of the task. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AwsOnDemandResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AwsOnDemandResponse>> getAwsOnDemandTaskWithHttpInfoAsync(
      String taskId) {
    Object localVarPostBody = null;

    // verify the required parameter 'taskId' is set
    if (taskId == null) {
      CompletableFuture<ApiResponse<AwsOnDemandResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'taskId' when calling getAwsOnDemandTask"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/agentless_scanning/ondemand/aws/{task_id}"
            .replaceAll("\\{" + "task_id" + "\\}", apiClient.escapeString(taskId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AgentlessScanningApi.getAwsOnDemandTask",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AwsOnDemandResponse>> result = new CompletableFuture<>();
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
        new GenericType<AwsOnDemandResponse>() {});
  }

  /**
   * Get AWS scan options.
   *
   * <p>See {@link #getAwsScanOptionsWithHttpInfo}.
   *
   * @param accountId The ID of an AWS account. (required)
   * @return AwsScanOptionsResponse
   * @throws ApiException if fails to make API call
   */
  public AwsScanOptionsResponse getAwsScanOptions(String accountId) throws ApiException {
    return getAwsScanOptionsWithHttpInfo(accountId).getData();
  }

  /**
   * Get AWS scan options.
   *
   * <p>See {@link #getAwsScanOptionsWithHttpInfoAsync}.
   *
   * @param accountId The ID of an AWS account. (required)
   * @return CompletableFuture&lt;AwsScanOptionsResponse&gt;
   */
  public CompletableFuture<AwsScanOptionsResponse> getAwsScanOptionsAsync(String accountId) {
    return getAwsScanOptionsWithHttpInfoAsync(accountId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Fetches the Agentless scan options for an activated account.
   *
   * @param accountId The ID of an AWS account. (required)
   * @return ApiResponse&lt;AwsScanOptionsResponse&gt;
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
  public ApiResponse<AwsScanOptionsResponse> getAwsScanOptionsWithHttpInfo(String accountId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'accountId' when calling getAwsScanOptions");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/agentless_scanning/accounts/aws/{account_id}"
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AgentlessScanningApi.getAwsScanOptions",
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
        new GenericType<AwsScanOptionsResponse>() {});
  }

  /**
   * Get AWS scan options.
   *
   * <p>See {@link #getAwsScanOptionsWithHttpInfo}.
   *
   * @param accountId The ID of an AWS account. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AwsScanOptionsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AwsScanOptionsResponse>> getAwsScanOptionsWithHttpInfoAsync(
      String accountId) {
    Object localVarPostBody = null;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      CompletableFuture<ApiResponse<AwsScanOptionsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'accountId' when calling getAwsScanOptions"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/agentless_scanning/accounts/aws/{account_id}"
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AgentlessScanningApi.getAwsScanOptions",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AwsScanOptionsResponse>> result = new CompletableFuture<>();
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
        new GenericType<AwsScanOptionsResponse>() {});
  }

  /**
   * Get Azure scan options.
   *
   * <p>See {@link #getAzureScanOptionsWithHttpInfo}.
   *
   * @param subscriptionId The Azure subscription ID. (required)
   * @return AzureScanOptions
   * @throws ApiException if fails to make API call
   */
  public AzureScanOptions getAzureScanOptions(String subscriptionId) throws ApiException {
    return getAzureScanOptionsWithHttpInfo(subscriptionId).getData();
  }

  /**
   * Get Azure scan options.
   *
   * <p>See {@link #getAzureScanOptionsWithHttpInfoAsync}.
   *
   * @param subscriptionId The Azure subscription ID. (required)
   * @return CompletableFuture&lt;AzureScanOptions&gt;
   */
  public CompletableFuture<AzureScanOptions> getAzureScanOptionsAsync(String subscriptionId) {
    return getAzureScanOptionsWithHttpInfoAsync(subscriptionId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Fetches the Agentless scan options for an activated subscription.
   *
   * @param subscriptionId The Azure subscription ID. (required)
   * @return ApiResponse&lt;AzureScanOptions&gt;
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
  public ApiResponse<AzureScanOptions> getAzureScanOptionsWithHttpInfo(String subscriptionId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'subscriptionId' is set
    if (subscriptionId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'subscriptionId' when calling getAzureScanOptions");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/agentless_scanning/accounts/azure/{subscription_id}"
            .replaceAll(
                "\\{" + "subscription_id" + "\\}",
                apiClient.escapeString(subscriptionId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AgentlessScanningApi.getAzureScanOptions",
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
        new GenericType<AzureScanOptions>() {});
  }

  /**
   * Get Azure scan options.
   *
   * <p>See {@link #getAzureScanOptionsWithHttpInfo}.
   *
   * @param subscriptionId The Azure subscription ID. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AzureScanOptions&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AzureScanOptions>> getAzureScanOptionsWithHttpInfoAsync(
      String subscriptionId) {
    Object localVarPostBody = null;

    // verify the required parameter 'subscriptionId' is set
    if (subscriptionId == null) {
      CompletableFuture<ApiResponse<AzureScanOptions>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'subscriptionId' when calling getAzureScanOptions"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/agentless_scanning/accounts/azure/{subscription_id}"
            .replaceAll(
                "\\{" + "subscription_id" + "\\}",
                apiClient.escapeString(subscriptionId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AgentlessScanningApi.getAzureScanOptions",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AzureScanOptions>> result = new CompletableFuture<>();
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
        new GenericType<AzureScanOptions>() {});
  }

  /**
   * Get GCP scan options.
   *
   * <p>See {@link #getGcpScanOptionsWithHttpInfo}.
   *
   * @param projectId The GCP project ID. (required)
   * @return GcpScanOptions
   * @throws ApiException if fails to make API call
   */
  public GcpScanOptions getGcpScanOptions(String projectId) throws ApiException {
    return getGcpScanOptionsWithHttpInfo(projectId).getData();
  }

  /**
   * Get GCP scan options.
   *
   * <p>See {@link #getGcpScanOptionsWithHttpInfoAsync}.
   *
   * @param projectId The GCP project ID. (required)
   * @return CompletableFuture&lt;GcpScanOptions&gt;
   */
  public CompletableFuture<GcpScanOptions> getGcpScanOptionsAsync(String projectId) {
    return getGcpScanOptionsWithHttpInfoAsync(projectId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Fetches the Agentless scan options for an activated GCP project.
   *
   * @param projectId The GCP project ID. (required)
   * @return ApiResponse&lt;GcpScanOptions&gt;
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
  public ApiResponse<GcpScanOptions> getGcpScanOptionsWithHttpInfo(String projectId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'projectId' when calling getGcpScanOptions");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/agentless_scanning/accounts/gcp/{project_id}"
            .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AgentlessScanningApi.getGcpScanOptions",
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
        new GenericType<GcpScanOptions>() {});
  }

  /**
   * Get GCP scan options.
   *
   * <p>See {@link #getGcpScanOptionsWithHttpInfo}.
   *
   * @param projectId The GCP project ID. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;GcpScanOptions&gt;&gt;
   */
  public CompletableFuture<ApiResponse<GcpScanOptions>> getGcpScanOptionsWithHttpInfoAsync(
      String projectId) {
    Object localVarPostBody = null;

    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      CompletableFuture<ApiResponse<GcpScanOptions>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'projectId' when calling getGcpScanOptions"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/agentless_scanning/accounts/gcp/{project_id}"
            .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AgentlessScanningApi.getGcpScanOptions",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<GcpScanOptions>> result = new CompletableFuture<>();
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
        new GenericType<GcpScanOptions>() {});
  }

  /**
   * List AWS on demand tasks.
   *
   * <p>See {@link #listAwsOnDemandTasksWithHttpInfo}.
   *
   * @return AwsOnDemandListResponse
   * @throws ApiException if fails to make API call
   */
  public AwsOnDemandListResponse listAwsOnDemandTasks() throws ApiException {
    return listAwsOnDemandTasksWithHttpInfo().getData();
  }

  /**
   * List AWS on demand tasks.
   *
   * <p>See {@link #listAwsOnDemandTasksWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;AwsOnDemandListResponse&gt;
   */
  public CompletableFuture<AwsOnDemandListResponse> listAwsOnDemandTasksAsync() {
    return listAwsOnDemandTasksWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Fetches the most recent 1000 AWS on demand tasks.
   *
   * @return ApiResponse&lt;AwsOnDemandListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AwsOnDemandListResponse> listAwsOnDemandTasksWithHttpInfo()
      throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/agentless_scanning/ondemand/aws";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AgentlessScanningApi.listAwsOnDemandTasks",
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
        new GenericType<AwsOnDemandListResponse>() {});
  }

  /**
   * List AWS on demand tasks.
   *
   * <p>See {@link #listAwsOnDemandTasksWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;AwsOnDemandListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AwsOnDemandListResponse>>
      listAwsOnDemandTasksWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/agentless_scanning/ondemand/aws";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AgentlessScanningApi.listAwsOnDemandTasks",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AwsOnDemandListResponse>> result = new CompletableFuture<>();
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
        new GenericType<AwsOnDemandListResponse>() {});
  }

  /**
   * List AWS scan options.
   *
   * <p>See {@link #listAwsScanOptionsWithHttpInfo}.
   *
   * @return AwsScanOptionsListResponse
   * @throws ApiException if fails to make API call
   */
  public AwsScanOptionsListResponse listAwsScanOptions() throws ApiException {
    return listAwsScanOptionsWithHttpInfo().getData();
  }

  /**
   * List AWS scan options.
   *
   * <p>See {@link #listAwsScanOptionsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;AwsScanOptionsListResponse&gt;
   */
  public CompletableFuture<AwsScanOptionsListResponse> listAwsScanOptionsAsync() {
    return listAwsScanOptionsWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Fetches the scan options configured for AWS accounts.
   *
   * @return ApiResponse&lt;AwsScanOptionsListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AwsScanOptionsListResponse> listAwsScanOptionsWithHttpInfo()
      throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/agentless_scanning/accounts/aws";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AgentlessScanningApi.listAwsScanOptions",
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
        new GenericType<AwsScanOptionsListResponse>() {});
  }

  /**
   * List AWS scan options.
   *
   * <p>See {@link #listAwsScanOptionsWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;AwsScanOptionsListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AwsScanOptionsListResponse>>
      listAwsScanOptionsWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/agentless_scanning/accounts/aws";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AgentlessScanningApi.listAwsScanOptions",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AwsScanOptionsListResponse>> result = new CompletableFuture<>();
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
        new GenericType<AwsScanOptionsListResponse>() {});
  }

  /**
   * List Azure scan options.
   *
   * <p>See {@link #listAzureScanOptionsWithHttpInfo}.
   *
   * @return AzureScanOptionsArray
   * @throws ApiException if fails to make API call
   */
  public AzureScanOptionsArray listAzureScanOptions() throws ApiException {
    return listAzureScanOptionsWithHttpInfo().getData();
  }

  /**
   * List Azure scan options.
   *
   * <p>See {@link #listAzureScanOptionsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;AzureScanOptionsArray&gt;
   */
  public CompletableFuture<AzureScanOptionsArray> listAzureScanOptionsAsync() {
    return listAzureScanOptionsWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Fetches the scan options configured for Azure accounts.
   *
   * @return ApiResponse&lt;AzureScanOptionsArray&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AzureScanOptionsArray> listAzureScanOptionsWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/agentless_scanning/accounts/azure";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AgentlessScanningApi.listAzureScanOptions",
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
        new GenericType<AzureScanOptionsArray>() {});
  }

  /**
   * List Azure scan options.
   *
   * <p>See {@link #listAzureScanOptionsWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;AzureScanOptionsArray&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AzureScanOptionsArray>>
      listAzureScanOptionsWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/agentless_scanning/accounts/azure";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AgentlessScanningApi.listAzureScanOptions",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AzureScanOptionsArray>> result = new CompletableFuture<>();
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
        new GenericType<AzureScanOptionsArray>() {});
  }

  /**
   * List GCP scan options.
   *
   * <p>See {@link #listGcpScanOptionsWithHttpInfo}.
   *
   * @return GcpScanOptionsArray
   * @throws ApiException if fails to make API call
   */
  public GcpScanOptionsArray listGcpScanOptions() throws ApiException {
    return listGcpScanOptionsWithHttpInfo().getData();
  }

  /**
   * List GCP scan options.
   *
   * <p>See {@link #listGcpScanOptionsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;GcpScanOptionsArray&gt;
   */
  public CompletableFuture<GcpScanOptionsArray> listGcpScanOptionsAsync() {
    return listGcpScanOptionsWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Fetches the scan options configured for all GCP projects.
   *
   * @return ApiResponse&lt;GcpScanOptionsArray&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<GcpScanOptionsArray> listGcpScanOptionsWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/agentless_scanning/accounts/gcp";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AgentlessScanningApi.listGcpScanOptions",
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
        new GenericType<GcpScanOptionsArray>() {});
  }

  /**
   * List GCP scan options.
   *
   * <p>See {@link #listGcpScanOptionsWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;GcpScanOptionsArray&gt;&gt;
   */
  public CompletableFuture<ApiResponse<GcpScanOptionsArray>> listGcpScanOptionsWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/agentless_scanning/accounts/gcp";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AgentlessScanningApi.listGcpScanOptions",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<GcpScanOptionsArray>> result = new CompletableFuture<>();
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
        new GenericType<GcpScanOptionsArray>() {});
  }

  /**
   * Update AWS scan options.
   *
   * <p>See {@link #updateAwsScanOptionsWithHttpInfo}.
   *
   * @param accountId The ID of an AWS account. (required)
   * @param body New definition of the scan options. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateAwsScanOptions(String accountId, AwsScanOptionsUpdateRequest body)
      throws ApiException {
    updateAwsScanOptionsWithHttpInfo(accountId, body);
  }

  /**
   * Update AWS scan options.
   *
   * <p>See {@link #updateAwsScanOptionsWithHttpInfoAsync}.
   *
   * @param accountId The ID of an AWS account. (required)
   * @param body New definition of the scan options. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> updateAwsScanOptionsAsync(
      String accountId, AwsScanOptionsUpdateRequest body) {
    return updateAwsScanOptionsWithHttpInfoAsync(accountId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update the Agentless scan options for an activated account.
   *
   * @param accountId The ID of an AWS account. (required)
   * @param body New definition of the scan options. (required)
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
  public ApiResponse<Void> updateAwsScanOptionsWithHttpInfo(
      String accountId, AwsScanOptionsUpdateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'accountId' when calling updateAwsScanOptions");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateAwsScanOptions");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/agentless_scanning/accounts/aws/{account_id}"
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AgentlessScanningApi.updateAwsScanOptions",
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
   * Update AWS scan options.
   *
   * <p>See {@link #updateAwsScanOptionsWithHttpInfo}.
   *
   * @param accountId The ID of an AWS account. (required)
   * @param body New definition of the scan options. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> updateAwsScanOptionsWithHttpInfoAsync(
      String accountId, AwsScanOptionsUpdateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'accountId' when calling updateAwsScanOptions"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateAwsScanOptions"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/agentless_scanning/accounts/aws/{account_id}"
            .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AgentlessScanningApi.updateAwsScanOptions",
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
   * Update Azure scan options.
   *
   * <p>See {@link #updateAzureScanOptionsWithHttpInfo}.
   *
   * @param subscriptionId The Azure subscription ID. (required)
   * @param body (required)
   * @return AzureScanOptions
   * @throws ApiException if fails to make API call
   */
  public AzureScanOptions updateAzureScanOptions(
      String subscriptionId, AzureScanOptionsInputUpdate body) throws ApiException {
    return updateAzureScanOptionsWithHttpInfo(subscriptionId, body).getData();
  }

  /**
   * Update Azure scan options.
   *
   * <p>See {@link #updateAzureScanOptionsWithHttpInfoAsync}.
   *
   * @param subscriptionId The Azure subscription ID. (required)
   * @param body (required)
   * @return CompletableFuture&lt;AzureScanOptions&gt;
   */
  public CompletableFuture<AzureScanOptions> updateAzureScanOptionsAsync(
      String subscriptionId, AzureScanOptionsInputUpdate body) {
    return updateAzureScanOptionsWithHttpInfoAsync(subscriptionId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update the Agentless scan options for an activated subscription.
   *
   * @param subscriptionId The Azure subscription ID. (required)
   * @param body (required)
   * @return ApiResponse&lt;AzureScanOptions&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AzureScanOptions> updateAzureScanOptionsWithHttpInfo(
      String subscriptionId, AzureScanOptionsInputUpdate body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'subscriptionId' is set
    if (subscriptionId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'subscriptionId' when calling updateAzureScanOptions");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateAzureScanOptions");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/agentless_scanning/accounts/azure/{subscription_id}"
            .replaceAll(
                "\\{" + "subscription_id" + "\\}",
                apiClient.escapeString(subscriptionId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AgentlessScanningApi.updateAzureScanOptions",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<AzureScanOptions>() {});
  }

  /**
   * Update Azure scan options.
   *
   * <p>See {@link #updateAzureScanOptionsWithHttpInfo}.
   *
   * @param subscriptionId The Azure subscription ID. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AzureScanOptions&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AzureScanOptions>> updateAzureScanOptionsWithHttpInfoAsync(
      String subscriptionId, AzureScanOptionsInputUpdate body) {
    Object localVarPostBody = body;

    // verify the required parameter 'subscriptionId' is set
    if (subscriptionId == null) {
      CompletableFuture<ApiResponse<AzureScanOptions>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'subscriptionId' when calling"
                  + " updateAzureScanOptions"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<AzureScanOptions>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateAzureScanOptions"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/agentless_scanning/accounts/azure/{subscription_id}"
            .replaceAll(
                "\\{" + "subscription_id" + "\\}",
                apiClient.escapeString(subscriptionId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AgentlessScanningApi.updateAzureScanOptions",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AzureScanOptions>> result = new CompletableFuture<>();
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
        new GenericType<AzureScanOptions>() {});
  }

  /**
   * Update GCP scan options.
   *
   * <p>See {@link #updateGcpScanOptionsWithHttpInfo}.
   *
   * @param projectId The GCP project ID. (required)
   * @param body New definition of the scan options. (required)
   * @return GcpScanOptions
   * @throws ApiException if fails to make API call
   */
  public GcpScanOptions updateGcpScanOptions(String projectId, GcpScanOptionsInputUpdate body)
      throws ApiException {
    return updateGcpScanOptionsWithHttpInfo(projectId, body).getData();
  }

  /**
   * Update GCP scan options.
   *
   * <p>See {@link #updateGcpScanOptionsWithHttpInfoAsync}.
   *
   * @param projectId The GCP project ID. (required)
   * @param body New definition of the scan options. (required)
   * @return CompletableFuture&lt;GcpScanOptions&gt;
   */
  public CompletableFuture<GcpScanOptions> updateGcpScanOptionsAsync(
      String projectId, GcpScanOptionsInputUpdate body) {
    return updateGcpScanOptionsWithHttpInfoAsync(projectId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update the Agentless scan options for an activated GCP project.
   *
   * @param projectId The GCP project ID. (required)
   * @param body New definition of the scan options. (required)
   * @return ApiResponse&lt;GcpScanOptions&gt;
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
  public ApiResponse<GcpScanOptions> updateGcpScanOptionsWithHttpInfo(
      String projectId, GcpScanOptionsInputUpdate body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'projectId' when calling updateGcpScanOptions");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateGcpScanOptions");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/agentless_scanning/accounts/gcp/{project_id}"
            .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AgentlessScanningApi.updateGcpScanOptions",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<GcpScanOptions>() {});
  }

  /**
   * Update GCP scan options.
   *
   * <p>See {@link #updateGcpScanOptionsWithHttpInfo}.
   *
   * @param projectId The GCP project ID. (required)
   * @param body New definition of the scan options. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;GcpScanOptions&gt;&gt;
   */
  public CompletableFuture<ApiResponse<GcpScanOptions>> updateGcpScanOptionsWithHttpInfoAsync(
      String projectId, GcpScanOptionsInputUpdate body) {
    Object localVarPostBody = body;

    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      CompletableFuture<ApiResponse<GcpScanOptions>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'projectId' when calling updateGcpScanOptions"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<GcpScanOptions>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateGcpScanOptions"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/agentless_scanning/accounts/gcp/{project_id}"
            .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AgentlessScanningApi.updateGcpScanOptions",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<GcpScanOptions>> result = new CompletableFuture<>();
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
        new GenericType<GcpScanOptions>() {});
  }
}
