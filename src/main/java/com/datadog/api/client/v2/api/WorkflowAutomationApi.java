
package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.PaginationIterable;

import jakarta.ws.rs.core.GenericType;
import jakarta.ws.rs.client.Invocation;

import java.io.File;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.concurrent.CompletableFuture;
import java.time.OffsetDateTime;
import java.util.UUID;
import com.datadog.api.client.v2.model.CreateWorkflowResponse;
import com.datadog.api.client.v2.model.CreateWorkflowRequest;
import com.datadog.api.client.v2.model.GetWorkflowResponse;
import com.datadog.api.client.v2.model.UpdateWorkflowResponse;
import com.datadog.api.client.v2.model.UpdateWorkflowRequest;
import com.datadog.api.client.v2.model.WorkflowListInstancesResponse;
import com.datadog.api.client.v2.model.WorkflowInstanceCreateResponse;
import com.datadog.api.client.v2.model.WorkflowInstanceCreateRequest;
import com.datadog.api.client.v2.model.WorklflowGetInstanceResponse;
import com.datadog.api.client.v2.model.WorklflowCancelInstanceResponse;


@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class WorkflowAutomationApi {
  private ApiClient apiClient;
  public WorkflowAutomationApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public WorkflowAutomationApi(ApiClient apiClient) {
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
 * Cancel a workflow instance.
 *
 * See {@link #cancelWorkflowInstanceWithHttpInfo}.
 *
 * @param workflowId The ID of the workflow. (required)
 * @param instanceId The ID of the workflow instance. (required)
 * @return WorklflowCancelInstanceResponse
 * @throws ApiException if fails to make API call
 */
  public WorklflowCancelInstanceResponse  cancelWorkflowInstance(String workflowId, String instanceId) throws ApiException {
    return cancelWorkflowInstanceWithHttpInfo(workflowId, instanceId).getData();
  }

  /**
 * Cancel a workflow instance.
 *
 * See {@link #cancelWorkflowInstanceWithHttpInfoAsync}.
 *
 * @param workflowId The ID of the workflow. (required)
 * @param instanceId The ID of the workflow instance. (required)
 * @return CompletableFuture&lt;WorklflowCancelInstanceResponse&gt;
 */
  public CompletableFuture<WorklflowCancelInstanceResponse>cancelWorkflowInstanceAsync(String workflowId, String instanceId) {
    return cancelWorkflowInstanceWithHttpInfoAsync(workflowId, instanceId).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Cancels a specific execution of a given workflow. This API requires a <a href="https://docs.datadoghq.com/api/latest/action-connection/#register-a-new-app-key">registered application key</a>. Alternatively, you can configure these permissions <a href="https://docs.datadoghq.com/account_management/api-app-keys/#actions-api-access">in the UI</a>.</p>
   *
   * @param workflowId The ID of the workflow. (required)
   * @param instanceId The ID of the workflow instance. (required)
   * @return ApiResponse&lt;WorklflowCancelInstanceResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<WorklflowCancelInstanceResponse> cancelWorkflowInstanceWithHttpInfo(String workflowId, String instanceId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'workflowId' is set
    if (workflowId == null) {
      throw new ApiException(400, "Missing the required parameter 'workflowId' when calling cancelWorkflowInstance");
    }

    // verify the required parameter 'instanceId' is set
    if (instanceId == null) {
      throw new ApiException(400, "Missing the required parameter 'instanceId' when calling cancelWorkflowInstance");
    }
    // create path and map variables
    String localVarPath = "/api/v2/workflows/{workflow_id}/instances/{instance_id}/cancel"
      .replaceAll("\\{" + "workflow_id" + "\\}", apiClient.escapeString(workflowId.toString()))
      .replaceAll("\\{" + "instance_id" + "\\}", apiClient.escapeString(instanceId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.WorkflowAutomationApi.cancelWorkflowInstance", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("PUT", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<WorklflowCancelInstanceResponse>() {});
  }

  /**
   * Cancel a workflow instance.
   *
   * See {@link #cancelWorkflowInstanceWithHttpInfo}.
   *
   * @param workflowId The ID of the workflow. (required)
   * @param instanceId The ID of the workflow instance. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;WorklflowCancelInstanceResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<WorklflowCancelInstanceResponse>> cancelWorkflowInstanceWithHttpInfoAsync(String workflowId, String instanceId) {
    Object localVarPostBody = null;

    // verify the required parameter 'workflowId' is set
    if (workflowId == null) {
        CompletableFuture<ApiResponse<WorklflowCancelInstanceResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'workflowId' when calling cancelWorkflowInstance"));
        return result;
    }

    // verify the required parameter 'instanceId' is set
    if (instanceId == null) {
        CompletableFuture<ApiResponse<WorklflowCancelInstanceResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'instanceId' when calling cancelWorkflowInstance"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/workflows/{workflow_id}/instances/{instance_id}/cancel"
      .replaceAll("\\{" + "workflow_id" + "\\}", apiClient.escapeString(workflowId.toString()))
      .replaceAll("\\{" + "instance_id" + "\\}", apiClient.escapeString(instanceId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.WorkflowAutomationApi.cancelWorkflowInstance", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<WorklflowCancelInstanceResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("PUT", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<WorklflowCancelInstanceResponse>() {});
  }

  /**
 * Create a Workflow.
 *
 * See {@link #createWorkflowWithHttpInfo}.
 *
 * @param body  (required)
 * @return CreateWorkflowResponse
 * @throws ApiException if fails to make API call
 */
  public CreateWorkflowResponse  createWorkflow(CreateWorkflowRequest body) throws ApiException {
    return createWorkflowWithHttpInfo(body).getData();
  }

  /**
 * Create a Workflow.
 *
 * See {@link #createWorkflowWithHttpInfoAsync}.
 *
 * @param body  (required)
 * @return CompletableFuture&lt;CreateWorkflowResponse&gt;
 */
  public CompletableFuture<CreateWorkflowResponse>createWorkflowAsync(CreateWorkflowRequest body) {
    return createWorkflowWithHttpInfoAsync(body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Create a new workflow, returning the workflow ID. This API requires a <a href="https://docs.datadoghq.com/api/latest/action-connection/#register-a-new-app-key">registered application key</a>. Alternatively, you can configure these permissions <a href="https://docs.datadoghq.com/account_management/api-app-keys/#actions-api-access">in the UI</a>.</p>
   *
   * @param body  (required)
   * @return ApiResponse&lt;CreateWorkflowResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Successfully created a workflow. </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CreateWorkflowResponse> createWorkflowWithHttpInfo(CreateWorkflowRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createWorkflow");
    }
    // create path and map variables
    String localVarPath = "/api/v2/workflows";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.WorkflowAutomationApi.createWorkflow", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<CreateWorkflowResponse>() {});
  }

  /**
   * Create a Workflow.
   *
   * See {@link #createWorkflowWithHttpInfo}.
   *
   * @param body  (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CreateWorkflowResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CreateWorkflowResponse>> createWorkflowWithHttpInfoAsync(CreateWorkflowRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<CreateWorkflowResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling createWorkflow"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/workflows";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.WorkflowAutomationApi.createWorkflow", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CreateWorkflowResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<CreateWorkflowResponse>() {});
  }

  /**
 * Execute a workflow.
 *
 * See {@link #createWorkflowInstanceWithHttpInfo}.
 *
 * @param workflowId The ID of the workflow. (required)
 * @param body  (required)
 * @return WorkflowInstanceCreateResponse
 * @throws ApiException if fails to make API call
 */
  public WorkflowInstanceCreateResponse  createWorkflowInstance(String workflowId, WorkflowInstanceCreateRequest body) throws ApiException {
    return createWorkflowInstanceWithHttpInfo(workflowId, body).getData();
  }

  /**
 * Execute a workflow.
 *
 * See {@link #createWorkflowInstanceWithHttpInfoAsync}.
 *
 * @param workflowId The ID of the workflow. (required)
 * @param body  (required)
 * @return CompletableFuture&lt;WorkflowInstanceCreateResponse&gt;
 */
  public CompletableFuture<WorkflowInstanceCreateResponse>createWorkflowInstanceAsync(String workflowId, WorkflowInstanceCreateRequest body) {
    return createWorkflowInstanceWithHttpInfoAsync(workflowId, body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Execute the given workflow. This API requires a <a href="https://docs.datadoghq.com/api/latest/action-connection/#register-a-new-app-key">registered application key</a>. Alternatively, you can configure these permissions <a href="https://docs.datadoghq.com/account_management/api-app-keys/#actions-api-access">in the UI</a>.</p>
   *
   * @param workflowId The ID of the workflow. (required)
   * @param body  (required)
   * @return ApiResponse&lt;WorkflowInstanceCreateResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<WorkflowInstanceCreateResponse> createWorkflowInstanceWithHttpInfo(String workflowId, WorkflowInstanceCreateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'workflowId' is set
    if (workflowId == null) {
      throw new ApiException(400, "Missing the required parameter 'workflowId' when calling createWorkflowInstance");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createWorkflowInstance");
    }
    // create path and map variables
    String localVarPath = "/api/v2/workflows/{workflow_id}/instances"
      .replaceAll("\\{" + "workflow_id" + "\\}", apiClient.escapeString(workflowId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.WorkflowAutomationApi.createWorkflowInstance", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<WorkflowInstanceCreateResponse>() {});
  }

  /**
   * Execute a workflow.
   *
   * See {@link #createWorkflowInstanceWithHttpInfo}.
   *
   * @param workflowId The ID of the workflow. (required)
   * @param body  (required)
   * @return CompletableFuture&lt;ApiResponse&lt;WorkflowInstanceCreateResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<WorkflowInstanceCreateResponse>> createWorkflowInstanceWithHttpInfoAsync(String workflowId, WorkflowInstanceCreateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'workflowId' is set
    if (workflowId == null) {
        CompletableFuture<ApiResponse<WorkflowInstanceCreateResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'workflowId' when calling createWorkflowInstance"));
        return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<WorkflowInstanceCreateResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling createWorkflowInstance"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/workflows/{workflow_id}/instances"
      .replaceAll("\\{" + "workflow_id" + "\\}", apiClient.escapeString(workflowId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.WorkflowAutomationApi.createWorkflowInstance", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<WorkflowInstanceCreateResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<WorkflowInstanceCreateResponse>() {});
  }

  /**
 * Delete an existing Workflow.
 *
 * See {@link #deleteWorkflowWithHttpInfo}.
 *
 * @param workflowId The ID of the workflow. (required)
 * @throws ApiException if fails to make API call
 */
  public  void  deleteWorkflow(String workflowId) throws ApiException {
    deleteWorkflowWithHttpInfo(workflowId);
  }

  /**
 * Delete an existing Workflow.
 *
 * See {@link #deleteWorkflowWithHttpInfoAsync}.
 *
 * @param workflowId The ID of the workflow. (required)
 * @return CompletableFuture
 */
  public CompletableFuture<Void>deleteWorkflowAsync(String workflowId) {
    return deleteWorkflowWithHttpInfoAsync(workflowId).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Delete a workflow by ID. This API requires a <a href="https://docs.datadoghq.com/api/latest/action-connection/#register-a-new-app-key">registered application key</a>. Alternatively, you can configure these permissions <a href="https://docs.datadoghq.com/account_management/api-app-keys/#actions-api-access">in the UI</a>.</p>
   *
   * @param workflowId The ID of the workflow. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> Successfully deleted a workflow. </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteWorkflowWithHttpInfo(String workflowId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'workflowId' is set
    if (workflowId == null) {
      throw new ApiException(400, "Missing the required parameter 'workflowId' when calling deleteWorkflow");
    }
    // create path and map variables
    String localVarPath = "/api/v2/workflows/{workflow_id}"
      .replaceAll("\\{" + "workflow_id" + "\\}", apiClient.escapeString(workflowId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.WorkflowAutomationApi.deleteWorkflow", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("DELETE", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
   * Delete an existing Workflow.
   *
   * See {@link #deleteWorkflowWithHttpInfo}.
   *
   * @param workflowId The ID of the workflow. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteWorkflowWithHttpInfoAsync(String workflowId) {
    Object localVarPostBody = null;

    // verify the required parameter 'workflowId' is set
    if (workflowId == null) {
        CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'workflowId' when calling deleteWorkflow"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/workflows/{workflow_id}"
      .replaceAll("\\{" + "workflow_id" + "\\}", apiClient.escapeString(workflowId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.WorkflowAutomationApi.deleteWorkflow", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("DELETE", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
 * Get an existing Workflow.
 *
 * See {@link #getWorkflowWithHttpInfo}.
 *
 * @param workflowId The ID of the workflow. (required)
 * @return GetWorkflowResponse
 * @throws ApiException if fails to make API call
 */
  public GetWorkflowResponse  getWorkflow(String workflowId) throws ApiException {
    return getWorkflowWithHttpInfo(workflowId).getData();
  }

  /**
 * Get an existing Workflow.
 *
 * See {@link #getWorkflowWithHttpInfoAsync}.
 *
 * @param workflowId The ID of the workflow. (required)
 * @return CompletableFuture&lt;GetWorkflowResponse&gt;
 */
  public CompletableFuture<GetWorkflowResponse>getWorkflowAsync(String workflowId) {
    return getWorkflowWithHttpInfoAsync(workflowId).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get a workflow by ID. This API requires a <a href="https://docs.datadoghq.com/api/latest/action-connection/#register-a-new-app-key">registered application key</a>. Alternatively, you can configure these permissions <a href="https://docs.datadoghq.com/account_management/api-app-keys/#actions-api-access">in the UI</a>.</p>
   *
   * @param workflowId The ID of the workflow. (required)
   * @return ApiResponse&lt;GetWorkflowResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> Successfully got a workflow. </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<GetWorkflowResponse> getWorkflowWithHttpInfo(String workflowId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'workflowId' is set
    if (workflowId == null) {
      throw new ApiException(400, "Missing the required parameter 'workflowId' when calling getWorkflow");
    }
    // create path and map variables
    String localVarPath = "/api/v2/workflows/{workflow_id}"
      .replaceAll("\\{" + "workflow_id" + "\\}", apiClient.escapeString(workflowId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.WorkflowAutomationApi.getWorkflow", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<GetWorkflowResponse>() {});
  }

  /**
   * Get an existing Workflow.
   *
   * See {@link #getWorkflowWithHttpInfo}.
   *
   * @param workflowId The ID of the workflow. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;GetWorkflowResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<GetWorkflowResponse>> getWorkflowWithHttpInfoAsync(String workflowId) {
    Object localVarPostBody = null;

    // verify the required parameter 'workflowId' is set
    if (workflowId == null) {
        CompletableFuture<ApiResponse<GetWorkflowResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'workflowId' when calling getWorkflow"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/workflows/{workflow_id}"
      .replaceAll("\\{" + "workflow_id" + "\\}", apiClient.escapeString(workflowId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.WorkflowAutomationApi.getWorkflow", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<GetWorkflowResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<GetWorkflowResponse>() {});
  }

  /**
 * Get a workflow instance.
 *
 * See {@link #getWorkflowInstanceWithHttpInfo}.
 *
 * @param workflowId The ID of the workflow. (required)
 * @param instanceId The ID of the workflow instance. (required)
 * @return WorklflowGetInstanceResponse
 * @throws ApiException if fails to make API call
 */
  public WorklflowGetInstanceResponse  getWorkflowInstance(String workflowId, String instanceId) throws ApiException {
    return getWorkflowInstanceWithHttpInfo(workflowId, instanceId).getData();
  }

  /**
 * Get a workflow instance.
 *
 * See {@link #getWorkflowInstanceWithHttpInfoAsync}.
 *
 * @param workflowId The ID of the workflow. (required)
 * @param instanceId The ID of the workflow instance. (required)
 * @return CompletableFuture&lt;WorklflowGetInstanceResponse&gt;
 */
  public CompletableFuture<WorklflowGetInstanceResponse>getWorkflowInstanceAsync(String workflowId, String instanceId) {
    return getWorkflowInstanceWithHttpInfoAsync(workflowId, instanceId).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get a specific execution of a given workflow. This API requires a <a href="https://docs.datadoghq.com/api/latest/action-connection/#register-a-new-app-key">registered application key</a>. Alternatively, you can configure these permissions <a href="https://docs.datadoghq.com/account_management/api-app-keys/#actions-api-access">in the UI</a>.</p>
   *
   * @param workflowId The ID of the workflow. (required)
   * @param instanceId The ID of the workflow instance. (required)
   * @return ApiResponse&lt;WorklflowGetInstanceResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<WorklflowGetInstanceResponse> getWorkflowInstanceWithHttpInfo(String workflowId, String instanceId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'workflowId' is set
    if (workflowId == null) {
      throw new ApiException(400, "Missing the required parameter 'workflowId' when calling getWorkflowInstance");
    }

    // verify the required parameter 'instanceId' is set
    if (instanceId == null) {
      throw new ApiException(400, "Missing the required parameter 'instanceId' when calling getWorkflowInstance");
    }
    // create path and map variables
    String localVarPath = "/api/v2/workflows/{workflow_id}/instances/{instance_id}"
      .replaceAll("\\{" + "workflow_id" + "\\}", apiClient.escapeString(workflowId.toString()))
      .replaceAll("\\{" + "instance_id" + "\\}", apiClient.escapeString(instanceId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.WorkflowAutomationApi.getWorkflowInstance", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<WorklflowGetInstanceResponse>() {});
  }

  /**
   * Get a workflow instance.
   *
   * See {@link #getWorkflowInstanceWithHttpInfo}.
   *
   * @param workflowId The ID of the workflow. (required)
   * @param instanceId The ID of the workflow instance. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;WorklflowGetInstanceResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<WorklflowGetInstanceResponse>> getWorkflowInstanceWithHttpInfoAsync(String workflowId, String instanceId) {
    Object localVarPostBody = null;

    // verify the required parameter 'workflowId' is set
    if (workflowId == null) {
        CompletableFuture<ApiResponse<WorklflowGetInstanceResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'workflowId' when calling getWorkflowInstance"));
        return result;
    }

    // verify the required parameter 'instanceId' is set
    if (instanceId == null) {
        CompletableFuture<ApiResponse<WorklflowGetInstanceResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'instanceId' when calling getWorkflowInstance"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/workflows/{workflow_id}/instances/{instance_id}"
      .replaceAll("\\{" + "workflow_id" + "\\}", apiClient.escapeString(workflowId.toString()))
      .replaceAll("\\{" + "instance_id" + "\\}", apiClient.escapeString(instanceId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.WorkflowAutomationApi.getWorkflowInstance", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<WorklflowGetInstanceResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<WorklflowGetInstanceResponse>() {});
  }

  /**
   * Manage optional parameters to listWorkflowInstances.
   */
  public static class ListWorkflowInstancesOptionalParameters {
    private Long pageSize;
    private Long pageNumber;

    /**
     * Set pageSize.
     * @param pageSize Size for a given page. The maximum allowed value is 100. (optional, default to 10)
     * @return ListWorkflowInstancesOptionalParameters
     */
    public ListWorkflowInstancesOptionalParameters pageSize(Long pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set pageNumber.
     * @param pageNumber Specific page number to return. (optional, default to 0)
     * @return ListWorkflowInstancesOptionalParameters
     */
    public ListWorkflowInstancesOptionalParameters pageNumber(Long pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }
  }

  /**
 * List workflow instances.
 *
 * See {@link #listWorkflowInstancesWithHttpInfo}.
 *
 * @param workflowId The ID of the workflow. (required)
 * @return WorkflowListInstancesResponse
 * @throws ApiException if fails to make API call
 */
  public WorkflowListInstancesResponse listWorkflowInstances (String workflowId) throws ApiException {
    return listWorkflowInstancesWithHttpInfo( workflowId, new ListWorkflowInstancesOptionalParameters()).getData();
  }

  /**
 * List workflow instances.
 *
 * See {@link #listWorkflowInstancesWithHttpInfoAsync}.
 *
 * @param workflowId The ID of the workflow. (required)
 * @return CompletableFuture&lt;WorkflowListInstancesResponse&gt;
 */
  public CompletableFuture<WorkflowListInstancesResponse>listWorkflowInstancesAsync(String workflowId) {
    return listWorkflowInstancesWithHttpInfoAsync(workflowId, new ListWorkflowInstancesOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * List workflow instances.
 *
 * See {@link #listWorkflowInstancesWithHttpInfo}.
 *
 * @param workflowId The ID of the workflow. (required)
 * @param parameters Optional parameters for the request.
 * @return WorkflowListInstancesResponse
 * @throws ApiException if fails to make API call
 */
  public WorkflowListInstancesResponse listWorkflowInstances(String workflowId, ListWorkflowInstancesOptionalParameters parameters) throws ApiException {
    return listWorkflowInstancesWithHttpInfo(workflowId, parameters).getData();
  }

  /**
 * List workflow instances.
 *
 * See {@link #listWorkflowInstancesWithHttpInfoAsync}.
 *
 * @param workflowId The ID of the workflow. (required)
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;WorkflowListInstancesResponse&gt;
 */
  public CompletableFuture<WorkflowListInstancesResponse>listWorkflowInstancesAsync( String workflowId, ListWorkflowInstancesOptionalParameters parameters) {
    return listWorkflowInstancesWithHttpInfoAsync(workflowId, parameters).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>List all instances of a given workflow. This API requires a <a href="https://docs.datadoghq.com/api/latest/action-connection/#register-a-new-app-key">registered application key</a>. Alternatively, you can configure these permissions <a href="https://docs.datadoghq.com/account_management/api-app-keys/#actions-api-access">in the UI</a>.</p>
   *
   * @param workflowId The ID of the workflow. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;WorkflowListInstancesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<WorkflowListInstancesResponse> listWorkflowInstancesWithHttpInfo(String workflowId, ListWorkflowInstancesOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'workflowId' is set
    if (workflowId == null) {
      throw new ApiException(400, "Missing the required parameter 'workflowId' when calling listWorkflowInstances");
    }
    Long pageSize = parameters.pageSize;
    Long pageNumber = parameters.pageNumber;
    // create path and map variables
    String localVarPath = "/api/v2/workflows/{workflow_id}/instances"
      .replaceAll("\\{" + "workflow_id" + "\\}", apiClient.escapeString(workflowId.toString()));

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));

    Invocation.Builder builder = apiClient.createBuilder("v2.WorkflowAutomationApi.listWorkflowInstances", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<WorkflowListInstancesResponse>() {});
  }

  /**
   * List workflow instances.
   *
   * See {@link #listWorkflowInstancesWithHttpInfo}.
   *
   * @param workflowId The ID of the workflow. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;WorkflowListInstancesResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<WorkflowListInstancesResponse>> listWorkflowInstancesWithHttpInfoAsync(String workflowId, ListWorkflowInstancesOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'workflowId' is set
    if (workflowId == null) {
        CompletableFuture<ApiResponse<WorkflowListInstancesResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'workflowId' when calling listWorkflowInstances"));
        return result;
    }
    Long pageSize = parameters.pageSize;
    Long pageNumber = parameters.pageNumber;
    // create path and map variables
    String localVarPath = "/api/v2/workflows/{workflow_id}/instances"
      .replaceAll("\\{" + "workflow_id" + "\\}", apiClient.escapeString(workflowId.toString()));

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.WorkflowAutomationApi.listWorkflowInstances", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<WorkflowListInstancesResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<WorkflowListInstancesResponse>() {});
  }

  /**
 * Update an existing Workflow.
 *
 * See {@link #updateWorkflowWithHttpInfo}.
 *
 * @param workflowId The ID of the workflow. (required)
 * @param body  (required)
 * @return UpdateWorkflowResponse
 * @throws ApiException if fails to make API call
 */
  public UpdateWorkflowResponse  updateWorkflow(String workflowId, UpdateWorkflowRequest body) throws ApiException {
    return updateWorkflowWithHttpInfo(workflowId, body).getData();
  }

  /**
 * Update an existing Workflow.
 *
 * See {@link #updateWorkflowWithHttpInfoAsync}.
 *
 * @param workflowId The ID of the workflow. (required)
 * @param body  (required)
 * @return CompletableFuture&lt;UpdateWorkflowResponse&gt;
 */
  public CompletableFuture<UpdateWorkflowResponse>updateWorkflowAsync(String workflowId, UpdateWorkflowRequest body) {
    return updateWorkflowWithHttpInfoAsync(workflowId, body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Update a workflow by ID. This API requires a <a href="https://docs.datadoghq.com/api/latest/action-connection/#register-a-new-app-key">registered application key</a>. Alternatively, you can configure these permissions <a href="https://docs.datadoghq.com/account_management/api-app-keys/#actions-api-access">in the UI</a>.</p>
   *
   * @param workflowId The ID of the workflow. (required)
   * @param body  (required)
   * @return ApiResponse&lt;UpdateWorkflowResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> Successfully updated a workflow. </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<UpdateWorkflowResponse> updateWorkflowWithHttpInfo(String workflowId, UpdateWorkflowRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'workflowId' is set
    if (workflowId == null) {
      throw new ApiException(400, "Missing the required parameter 'workflowId' when calling updateWorkflow");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateWorkflow");
    }
    // create path and map variables
    String localVarPath = "/api/v2/workflows/{workflow_id}"
      .replaceAll("\\{" + "workflow_id" + "\\}", apiClient.escapeString(workflowId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.WorkflowAutomationApi.updateWorkflow", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("PATCH", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<UpdateWorkflowResponse>() {});
  }

  /**
   * Update an existing Workflow.
   *
   * See {@link #updateWorkflowWithHttpInfo}.
   *
   * @param workflowId The ID of the workflow. (required)
   * @param body  (required)
   * @return CompletableFuture&lt;ApiResponse&lt;UpdateWorkflowResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<UpdateWorkflowResponse>> updateWorkflowWithHttpInfoAsync(String workflowId, UpdateWorkflowRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'workflowId' is set
    if (workflowId == null) {
        CompletableFuture<ApiResponse<UpdateWorkflowResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'workflowId' when calling updateWorkflow"));
        return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<UpdateWorkflowResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling updateWorkflow"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/workflows/{workflow_id}"
      .replaceAll("\\{" + "workflow_id" + "\\}", apiClient.escapeString(workflowId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.WorkflowAutomationApi.updateWorkflow", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<UpdateWorkflowResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("PATCH", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<UpdateWorkflowResponse>() {});
  }
}