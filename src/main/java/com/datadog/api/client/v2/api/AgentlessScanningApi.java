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
   * Post an AWS on demand task.
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
   * Post an AWS on demand task.
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
            new String[] {"apiKeyAuth", "appKeyAuth"});
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
   * Post an AWS on demand task.
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
              new String[] {"apiKeyAuth", "appKeyAuth"});
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
   * Post AWS Scan Options.
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
   * Post AWS Scan Options.
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
            new String[] {"apiKeyAuth", "appKeyAuth"});
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
   * Post AWS Scan Options.
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
              new String[] {"apiKeyAuth", "appKeyAuth"});
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
   * Delete AWS Scan Options.
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
   * Delete AWS Scan Options.
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
   * Delete AWS Scan Options.
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
   * Get AWS On Demand task by id.
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
   * Get AWS On Demand task by id.
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
            new String[] {"apiKeyAuth", "appKeyAuth"});
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
   * Get AWS On Demand task by id.
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
              new String[] {"apiKeyAuth", "appKeyAuth"});
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
   * Get AWS On Demand tasks.
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
   * Get AWS On Demand tasks.
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
            new String[] {"apiKeyAuth", "appKeyAuth"});
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
   * Get AWS On Demand tasks.
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
              new String[] {"apiKeyAuth", "appKeyAuth"});
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
   * Get AWS Scan Options.
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
   * Get AWS Scan Options.
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
            new String[] {"apiKeyAuth", "appKeyAuth"});
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
   * Get AWS Scan Options.
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
              new String[] {"apiKeyAuth", "appKeyAuth"});
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
   * Patch AWS Scan Options.
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
   * Patch AWS Scan Options.
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
   * Patch AWS Scan Options.
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
}
