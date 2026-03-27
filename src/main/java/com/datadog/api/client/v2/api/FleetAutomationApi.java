
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
import com.datadog.api.client.v2.model.FleetAgentVersionsResponse;
import com.datadog.api.client.v2.model.FleetAgentsResponse;
import com.datadog.api.client.v2.model.FleetAgentInfoResponse;
import com.datadog.api.client.v2.model.FleetDeploymentsResponse;
import com.datadog.api.client.v2.model.FleetDeploymentResponse;
import com.datadog.api.client.v2.model.FleetDeploymentConfigureCreateRequest;
import com.datadog.api.client.v2.model.FleetDeploymentPackageUpgradeCreateRequest;
import com.datadog.api.client.v2.model.FleetSchedulesResponse;
import com.datadog.api.client.v2.model.FleetScheduleResponse;
import com.datadog.api.client.v2.model.FleetScheduleCreateRequest;
import com.datadog.api.client.v2.model.FleetSchedulePatchRequest;


@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FleetAutomationApi {
  private ApiClient apiClient;
  public FleetAutomationApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public FleetAutomationApi(ApiClient apiClient) {
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
 * Cancel a deployment.
 *
 * See {@link #cancelFleetDeploymentWithHttpInfo}.
 *
 * @param deploymentId The unique identifier of the deployment to cancel. (required)
 * @throws ApiException if fails to make API call
 */
  public  void  cancelFleetDeployment(String deploymentId) throws ApiException {
    cancelFleetDeploymentWithHttpInfo(deploymentId);
  }

  /**
 * Cancel a deployment.
 *
 * See {@link #cancelFleetDeploymentWithHttpInfoAsync}.
 *
 * @param deploymentId The unique identifier of the deployment to cancel. (required)
 * @return CompletableFuture
 */
  public CompletableFuture<Void>cancelFleetDeploymentAsync(String deploymentId) {
    return cancelFleetDeploymentWithHttpInfoAsync(deploymentId).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Cancel an active deployment and stop all pending operations.
   * When you cancel a deployment:
   * - All pending operations on hosts that haven't started yet are stopped
   * - Operations currently in progress on hosts may complete or be interrupted, depending on their current state
   * - Configuration changes or package upgrades already applied to hosts are not rolled back</p>
   * <p>After cancellation, you can view the final state of the deployment using the GET endpoint to see which hosts
   * were successfully updated before the cancellation.</p>
   *
   * @param deploymentId The unique identifier of the deployment to cancel. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> Deployment successfully canceled. </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> cancelFleetDeploymentWithHttpInfo(String deploymentId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "cancelFleetDeployment";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'deploymentId' is set
    if (deploymentId == null) {
      throw new ApiException(400, "Missing the required parameter 'deploymentId' when calling cancelFleetDeployment");
    }
    // create path and map variables
    String localVarPath = "/api/unstable/fleet/deployments/{deployment_id}/cancel"
      .replaceAll("\\{" + "deployment_id" + "\\}", apiClient.escapeString(deploymentId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.FleetAutomationApi.cancelFleetDeployment", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("POST", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
   * Cancel a deployment.
   *
   * See {@link #cancelFleetDeploymentWithHttpInfo}.
   *
   * @param deploymentId The unique identifier of the deployment to cancel. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> cancelFleetDeploymentWithHttpInfoAsync(String deploymentId) {
    // Check if unstable operation is enabled
    String operationId = "cancelFleetDeployment";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'deploymentId' is set
    if (deploymentId == null) {
        CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'deploymentId' when calling cancelFleetDeployment"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/unstable/fleet/deployments/{deployment_id}/cancel"
      .replaceAll("\\{" + "deployment_id" + "\\}", apiClient.escapeString(deploymentId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.FleetAutomationApi.cancelFleetDeployment", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("POST", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
 * Create a configuration deployment.
 *
 * See {@link #createFleetDeploymentConfigureWithHttpInfo}.
 *
 * @param body Request payload containing the deployment details. (required)
 * @return FleetDeploymentResponse
 * @throws ApiException if fails to make API call
 */
  public FleetDeploymentResponse  createFleetDeploymentConfigure(FleetDeploymentConfigureCreateRequest body) throws ApiException {
    return createFleetDeploymentConfigureWithHttpInfo(body).getData();
  }

  /**
 * Create a configuration deployment.
 *
 * See {@link #createFleetDeploymentConfigureWithHttpInfoAsync}.
 *
 * @param body Request payload containing the deployment details. (required)
 * @return CompletableFuture&lt;FleetDeploymentResponse&gt;
 */
  public CompletableFuture<FleetDeploymentResponse>createFleetDeploymentConfigureAsync(FleetDeploymentConfigureCreateRequest body) {
    return createFleetDeploymentConfigureWithHttpInfoAsync(body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Create a new deployment to apply configuration changes
   * to a fleet of hosts matching the specified filter query.</p>
   * <p>This endpoint supports two types of configuration operations:
   * - <code>merge-patch</code>: Merges the provided patch data with the existing configuration file,
   *   creating the file if it doesn't exist
   * - <code>delete</code>: Removes the specified configuration file from the target hosts</p>
   * <p>The deployment is created and started automatically. You can specify multiple configuration
   * operations that will be executed in order on each target host. Use the filter query to target
   * specific hosts using the Datadog query syntax.</p>
   *
   * @param body Request payload containing the deployment details. (required)
   * @return ApiResponse&lt;FleetDeploymentResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> CREATED </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<FleetDeploymentResponse> createFleetDeploymentConfigureWithHttpInfo(FleetDeploymentConfigureCreateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createFleetDeploymentConfigure";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createFleetDeploymentConfigure");
    }
    // create path and map variables
    String localVarPath = "/api/unstable/fleet/deployments/configure";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.FleetAutomationApi.createFleetDeploymentConfigure", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<FleetDeploymentResponse>() {});
  }

  /**
   * Create a configuration deployment.
   *
   * See {@link #createFleetDeploymentConfigureWithHttpInfo}.
   *
   * @param body Request payload containing the deployment details. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;FleetDeploymentResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<FleetDeploymentResponse>> createFleetDeploymentConfigureWithHttpInfoAsync(FleetDeploymentConfigureCreateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createFleetDeploymentConfigure";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<FleetDeploymentResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<FleetDeploymentResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling createFleetDeploymentConfigure"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/unstable/fleet/deployments/configure";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.FleetAutomationApi.createFleetDeploymentConfigure", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<FleetDeploymentResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<FleetDeploymentResponse>() {});
  }

  /**
 * Upgrade hosts.
 *
 * See {@link #createFleetDeploymentUpgradeWithHttpInfo}.
 *
 * @param body Request payload containing the package upgrade details. (required)
 * @return FleetDeploymentResponse
 * @throws ApiException if fails to make API call
 */
  public FleetDeploymentResponse  createFleetDeploymentUpgrade(FleetDeploymentPackageUpgradeCreateRequest body) throws ApiException {
    return createFleetDeploymentUpgradeWithHttpInfo(body).getData();
  }

  /**
 * Upgrade hosts.
 *
 * See {@link #createFleetDeploymentUpgradeWithHttpInfoAsync}.
 *
 * @param body Request payload containing the package upgrade details. (required)
 * @return CompletableFuture&lt;FleetDeploymentResponse&gt;
 */
  public CompletableFuture<FleetDeploymentResponse>createFleetDeploymentUpgradeAsync(FleetDeploymentPackageUpgradeCreateRequest body) {
    return createFleetDeploymentUpgradeWithHttpInfoAsync(body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Create and immediately start a new package upgrade
   * on hosts matching the specified filter query.</p>
   * <p>This endpoint allows you to upgrade the Datadog Agent to a specific version
   * on hosts matching the specified filter query.</p>
   * <p>The deployment is created and started automatically. The system will:
   * 1. Identify all hosts matching the filter query
   * 2. Validate that the specified version is available
   * 3. Begin rolling out the package upgrade to the target hosts</p>
   *
   * @param body Request payload containing the package upgrade details. (required)
   * @return ApiResponse&lt;FleetDeploymentResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> CREATED </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<FleetDeploymentResponse> createFleetDeploymentUpgradeWithHttpInfo(FleetDeploymentPackageUpgradeCreateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createFleetDeploymentUpgrade";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createFleetDeploymentUpgrade");
    }
    // create path and map variables
    String localVarPath = "/api/unstable/fleet/deployments/upgrade";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.FleetAutomationApi.createFleetDeploymentUpgrade", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<FleetDeploymentResponse>() {});
  }

  /**
   * Upgrade hosts.
   *
   * See {@link #createFleetDeploymentUpgradeWithHttpInfo}.
   *
   * @param body Request payload containing the package upgrade details. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;FleetDeploymentResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<FleetDeploymentResponse>> createFleetDeploymentUpgradeWithHttpInfoAsync(FleetDeploymentPackageUpgradeCreateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createFleetDeploymentUpgrade";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<FleetDeploymentResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<FleetDeploymentResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling createFleetDeploymentUpgrade"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/unstable/fleet/deployments/upgrade";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.FleetAutomationApi.createFleetDeploymentUpgrade", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<FleetDeploymentResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<FleetDeploymentResponse>() {});
  }

  /**
 * Create a schedule.
 *
 * See {@link #createFleetScheduleWithHttpInfo}.
 *
 * @param body Request payload containing the schedule details. (required)
 * @return FleetScheduleResponse
 * @throws ApiException if fails to make API call
 */
  public FleetScheduleResponse  createFleetSchedule(FleetScheduleCreateRequest body) throws ApiException {
    return createFleetScheduleWithHttpInfo(body).getData();
  }

  /**
 * Create a schedule.
 *
 * See {@link #createFleetScheduleWithHttpInfoAsync}.
 *
 * @param body Request payload containing the schedule details. (required)
 * @return CompletableFuture&lt;FleetScheduleResponse&gt;
 */
  public CompletableFuture<FleetScheduleResponse>createFleetScheduleAsync(FleetScheduleCreateRequest body) {
    return createFleetScheduleWithHttpInfoAsync(body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Create a new schedule for automated package upgrades.</p>
   * <p>Schedules define when and how often to automatically deploy package upgrades to a fleet
   * of hosts. Each schedule includes:
   * - A filter query to select target hosts
   * - A recurrence rule defining maintenance windows
   * - A version strategy (e.g., always latest, or N versions behind latest)</p>
   * <p>When the schedule triggers during a maintenance window, it automatically creates a
   * deployment that upgrades the Datadog Agent to the specified version on all matching hosts.</p>
   *
   * @param body Request payload containing the schedule details. (required)
   * @return ApiResponse&lt;FleetScheduleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> CREATED </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<FleetScheduleResponse> createFleetScheduleWithHttpInfo(FleetScheduleCreateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createFleetSchedule";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createFleetSchedule");
    }
    // create path and map variables
    String localVarPath = "/api/unstable/fleet/schedules";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.FleetAutomationApi.createFleetSchedule", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<FleetScheduleResponse>() {});
  }

  /**
   * Create a schedule.
   *
   * See {@link #createFleetScheduleWithHttpInfo}.
   *
   * @param body Request payload containing the schedule details. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;FleetScheduleResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<FleetScheduleResponse>> createFleetScheduleWithHttpInfoAsync(FleetScheduleCreateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createFleetSchedule";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<FleetScheduleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<FleetScheduleResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling createFleetSchedule"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/unstable/fleet/schedules";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.FleetAutomationApi.createFleetSchedule", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<FleetScheduleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<FleetScheduleResponse>() {});
  }

  /**
 * Delete a schedule.
 *
 * See {@link #deleteFleetScheduleWithHttpInfo}.
 *
 * @param id The unique identifier of the schedule to delete. (required)
 * @throws ApiException if fails to make API call
 */
  public  void  deleteFleetSchedule(String id) throws ApiException {
    deleteFleetScheduleWithHttpInfo(id);
  }

  /**
 * Delete a schedule.
 *
 * See {@link #deleteFleetScheduleWithHttpInfoAsync}.
 *
 * @param id The unique identifier of the schedule to delete. (required)
 * @return CompletableFuture
 */
  public CompletableFuture<Void>deleteFleetScheduleAsync(String id) {
    return deleteFleetScheduleWithHttpInfoAsync(id).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Delete a schedule permanently.</p>
   * <p>When you delete a schedule:
   * - The schedule is permanently removed and will no longer create deployments
   * - Any deployments already created by this schedule are not affected
   * - This action cannot be undone</p>
   * <p>If you want to temporarily stop a schedule from creating deployments, consider
   * updating its status to "inactive" instead of deleting it.</p>
   *
   * @param id The unique identifier of the schedule to delete. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> Schedule successfully deleted. </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteFleetScheduleWithHttpInfo(String id) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteFleetSchedule";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteFleetSchedule");
    }
    // create path and map variables
    String localVarPath = "/api/unstable/fleet/schedules/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.FleetAutomationApi.deleteFleetSchedule", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("DELETE", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
   * Delete a schedule.
   *
   * See {@link #deleteFleetScheduleWithHttpInfo}.
   *
   * @param id The unique identifier of the schedule to delete. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteFleetScheduleWithHttpInfoAsync(String id) {
    // Check if unstable operation is enabled
    String operationId = "deleteFleetSchedule";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
        CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'id' when calling deleteFleetSchedule"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/unstable/fleet/schedules/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.FleetAutomationApi.deleteFleetSchedule", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("DELETE", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
 * Get detailed information about an agent.
 *
 * See {@link #getFleetAgentInfoWithHttpInfo}.
 *
 * @param agentKey The unique identifier (agent key) for the Datadog Agent. (required)
 * @return FleetAgentInfoResponse
 * @throws ApiException if fails to make API call
 */
  public FleetAgentInfoResponse  getFleetAgentInfo(String agentKey) throws ApiException {
    return getFleetAgentInfoWithHttpInfo(agentKey).getData();
  }

  /**
 * Get detailed information about an agent.
 *
 * See {@link #getFleetAgentInfoWithHttpInfoAsync}.
 *
 * @param agentKey The unique identifier (agent key) for the Datadog Agent. (required)
 * @return CompletableFuture&lt;FleetAgentInfoResponse&gt;
 */
  public CompletableFuture<FleetAgentInfoResponse>getFleetAgentInfoAsync(String agentKey) {
    return getFleetAgentInfoWithHttpInfoAsync(agentKey).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Retrieve detailed information about a specific Datadog Agent.
   * This endpoint returns comprehensive information about an agent including:
   * - Agent details and metadata
   * - Configured integrations organized by status (working, warning, error, missing)
   * - Detected integrations
   * - Configuration files and layers</p>
   *
   * @param agentKey The unique identifier (agent key) for the Datadog Agent. (required)
   * @return ApiResponse&lt;FleetAgentInfoResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
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
  public ApiResponse<FleetAgentInfoResponse> getFleetAgentInfoWithHttpInfo(String agentKey) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getFleetAgentInfo";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'agentKey' is set
    if (agentKey == null) {
      throw new ApiException(400, "Missing the required parameter 'agentKey' when calling getFleetAgentInfo");
    }
    // create path and map variables
    String localVarPath = "/api/unstable/fleet/agents/{agent_key}"
      .replaceAll("\\{" + "agent_key" + "\\}", apiClient.escapeString(agentKey.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.FleetAutomationApi.getFleetAgentInfo", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<FleetAgentInfoResponse>() {});
  }

  /**
   * Get detailed information about an agent.
   *
   * See {@link #getFleetAgentInfoWithHttpInfo}.
   *
   * @param agentKey The unique identifier (agent key) for the Datadog Agent. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;FleetAgentInfoResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<FleetAgentInfoResponse>> getFleetAgentInfoWithHttpInfoAsync(String agentKey) {
    // Check if unstable operation is enabled
    String operationId = "getFleetAgentInfo";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<FleetAgentInfoResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'agentKey' is set
    if (agentKey == null) {
        CompletableFuture<ApiResponse<FleetAgentInfoResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'agentKey' when calling getFleetAgentInfo"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/unstable/fleet/agents/{agent_key}"
      .replaceAll("\\{" + "agent_key" + "\\}", apiClient.escapeString(agentKey.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.FleetAutomationApi.getFleetAgentInfo", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<FleetAgentInfoResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<FleetAgentInfoResponse>() {});
  }

  /**
   * Manage optional parameters to getFleetDeployment.
   */
  public static class GetFleetDeploymentOptionalParameters {
    private Long limit;
    private Long page;

    /**
     * Set limit.
     * @param limit Maximum number of hosts to return per page. Default is 50, maximum is 100. (optional, default to 50)
     * @return GetFleetDeploymentOptionalParameters
     */
    public GetFleetDeploymentOptionalParameters limit(Long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set page.
     * @param page Page index for pagination (zero-based). Use this to retrieve subsequent pages of hosts. (optional, default to 0)
     * @return GetFleetDeploymentOptionalParameters
     */
    public GetFleetDeploymentOptionalParameters page(Long page) {
      this.page = page;
      return this;
    }
  }

  /**
 * Get a configuration deployment by ID.
 *
 * See {@link #getFleetDeploymentWithHttpInfo}.
 *
 * @param deploymentId The unique identifier of the deployment to retrieve. (required)
 * @return FleetDeploymentResponse
 * @throws ApiException if fails to make API call
 */
  public FleetDeploymentResponse getFleetDeployment (String deploymentId) throws ApiException {
    return getFleetDeploymentWithHttpInfo( deploymentId, new GetFleetDeploymentOptionalParameters()).getData();
  }

  /**
 * Get a configuration deployment by ID.
 *
 * See {@link #getFleetDeploymentWithHttpInfoAsync}.
 *
 * @param deploymentId The unique identifier of the deployment to retrieve. (required)
 * @return CompletableFuture&lt;FleetDeploymentResponse&gt;
 */
  public CompletableFuture<FleetDeploymentResponse>getFleetDeploymentAsync(String deploymentId) {
    return getFleetDeploymentWithHttpInfoAsync(deploymentId, new GetFleetDeploymentOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * Get a configuration deployment by ID.
 *
 * See {@link #getFleetDeploymentWithHttpInfo}.
 *
 * @param deploymentId The unique identifier of the deployment to retrieve. (required)
 * @param parameters Optional parameters for the request.
 * @return FleetDeploymentResponse
 * @throws ApiException if fails to make API call
 */
  public FleetDeploymentResponse getFleetDeployment(String deploymentId, GetFleetDeploymentOptionalParameters parameters) throws ApiException {
    return getFleetDeploymentWithHttpInfo(deploymentId, parameters).getData();
  }

  /**
 * Get a configuration deployment by ID.
 *
 * See {@link #getFleetDeploymentWithHttpInfoAsync}.
 *
 * @param deploymentId The unique identifier of the deployment to retrieve. (required)
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;FleetDeploymentResponse&gt;
 */
  public CompletableFuture<FleetDeploymentResponse>getFleetDeploymentAsync( String deploymentId, GetFleetDeploymentOptionalParameters parameters) {
    return getFleetDeploymentWithHttpInfoAsync(deploymentId, parameters).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Retrieve detailed information about a specific deployment using its unique identifier.
   * This endpoint returns comprehensive information about a deployment, including:
   * - Deployment metadata (ID, type, filter query)
   * - Total number of target hosts
   * - Current high-level status (pending, running, succeeded, failed)
   * - Estimated completion time
   * - Configuration operations that were or are being applied
   * - Detailed host list: A paginated array of hosts included in this deployment with individual
   *   host status, current package versions, and any errors</p>
   * <p>The host list provides visibility into the per-host execution status, allowing you to:
   * - Monitor which hosts have completed successfully
   * - Identify hosts that are still in progress
   * - Investigate failures on specific hosts
   * - View current package versions installed on each host (including initial, target, and current
   *   versions for each package)</p>
   * <p>Pagination: Use the <code>limit</code> and <code>page</code> query parameters to paginate through hosts. The response
   * includes pagination metadata in the <code>meta.hosts</code> field with information about the current page,
   * total pages, and total host count. The default page size is 50 hosts, with a maximum of 100.</p>
   *
   * @param deploymentId The unique identifier of the deployment to retrieve. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;FleetDeploymentResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
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
  public ApiResponse<FleetDeploymentResponse> getFleetDeploymentWithHttpInfo(String deploymentId, GetFleetDeploymentOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getFleetDeployment";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'deploymentId' is set
    if (deploymentId == null) {
      throw new ApiException(400, "Missing the required parameter 'deploymentId' when calling getFleetDeployment");
    }
    Long limit = parameters.limit;
    Long page = parameters.page;
    // create path and map variables
    String localVarPath = "/api/unstable/fleet/deployments/{deployment_id}"
      .replaceAll("\\{" + "deployment_id" + "\\}", apiClient.escapeString(deploymentId.toString()));

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));

    Invocation.Builder builder = apiClient.createBuilder("v2.FleetAutomationApi.getFleetDeployment", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<FleetDeploymentResponse>() {});
  }

  /**
   * Get a configuration deployment by ID.
   *
   * See {@link #getFleetDeploymentWithHttpInfo}.
   *
   * @param deploymentId The unique identifier of the deployment to retrieve. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;FleetDeploymentResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<FleetDeploymentResponse>> getFleetDeploymentWithHttpInfoAsync(String deploymentId, GetFleetDeploymentOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "getFleetDeployment";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<FleetDeploymentResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'deploymentId' is set
    if (deploymentId == null) {
        CompletableFuture<ApiResponse<FleetDeploymentResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'deploymentId' when calling getFleetDeployment"));
        return result;
    }
    Long limit = parameters.limit;
    Long page = parameters.page;
    // create path and map variables
    String localVarPath = "/api/unstable/fleet/deployments/{deployment_id}"
      .replaceAll("\\{" + "deployment_id" + "\\}", apiClient.escapeString(deploymentId.toString()));

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.FleetAutomationApi.getFleetDeployment", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<FleetDeploymentResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<FleetDeploymentResponse>() {});
  }

  /**
 * Get a schedule by ID.
 *
 * See {@link #getFleetScheduleWithHttpInfo}.
 *
 * @param id The unique identifier of the schedule to retrieve. (required)
 * @return FleetScheduleResponse
 * @throws ApiException if fails to make API call
 */
  public FleetScheduleResponse  getFleetSchedule(String id) throws ApiException {
    return getFleetScheduleWithHttpInfo(id).getData();
  }

  /**
 * Get a schedule by ID.
 *
 * See {@link #getFleetScheduleWithHttpInfoAsync}.
 *
 * @param id The unique identifier of the schedule to retrieve. (required)
 * @return CompletableFuture&lt;FleetScheduleResponse&gt;
 */
  public CompletableFuture<FleetScheduleResponse>getFleetScheduleAsync(String id) {
    return getFleetScheduleWithHttpInfoAsync(id).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Retrieve detailed information about a specific schedule using its unique identifier.</p>
   * <p>This endpoint returns comprehensive information about a schedule, including:
   * - Schedule metadata (ID, name, creation/update timestamps)
   * - Filter query for selecting target hosts
   * - Recurrence rule defining when deployments are triggered
   * - Version strategy for package upgrades
   * - Current status (active or inactive)</p>
   *
   * @param id The unique identifier of the schedule to retrieve. (required)
   * @return ApiResponse&lt;FleetScheduleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
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
  public ApiResponse<FleetScheduleResponse> getFleetScheduleWithHttpInfo(String id) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getFleetSchedule";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getFleetSchedule");
    }
    // create path and map variables
    String localVarPath = "/api/unstable/fleet/schedules/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.FleetAutomationApi.getFleetSchedule", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<FleetScheduleResponse>() {});
  }

  /**
   * Get a schedule by ID.
   *
   * See {@link #getFleetScheduleWithHttpInfo}.
   *
   * @param id The unique identifier of the schedule to retrieve. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;FleetScheduleResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<FleetScheduleResponse>> getFleetScheduleWithHttpInfoAsync(String id) {
    // Check if unstable operation is enabled
    String operationId = "getFleetSchedule";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<FleetScheduleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
        CompletableFuture<ApiResponse<FleetScheduleResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'id' when calling getFleetSchedule"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/unstable/fleet/schedules/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.FleetAutomationApi.getFleetSchedule", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<FleetScheduleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<FleetScheduleResponse>() {});
  }

  /**
   * Manage optional parameters to listFleetAgents.
   */
  public static class ListFleetAgentsOptionalParameters {
    private Long pageNumber;
    private Long pageSize;
    private String sortAttribute;
    private Boolean sortDescending;
    private String tags;
    private String filter;

    /**
     * Set pageNumber.
     * @param pageNumber Page number for pagination (starts at 0). (optional, default to 0)
     * @return ListFleetAgentsOptionalParameters
     */
    public ListFleetAgentsOptionalParameters pageNumber(Long pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set pageSize.
     * @param pageSize Number of results per page (must be greater than 0 and less than or equal to 100). (optional, default to 10)
     * @return ListFleetAgentsOptionalParameters
     */
    public ListFleetAgentsOptionalParameters pageSize(Long pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set sortAttribute.
     * @param sortAttribute Attribute to sort by. (optional)
     * @return ListFleetAgentsOptionalParameters
     */
    public ListFleetAgentsOptionalParameters sortAttribute(String sortAttribute) {
      this.sortAttribute = sortAttribute;
      return this;
    }

    /**
     * Set sortDescending.
     * @param sortDescending Sort order (true for descending, false for ascending). (optional)
     * @return ListFleetAgentsOptionalParameters
     */
    public ListFleetAgentsOptionalParameters sortDescending(Boolean sortDescending) {
      this.sortDescending = sortDescending;
      return this;
    }

    /**
     * Set tags.
     * @param tags Comma-separated list of tags to filter agents. (optional)
     * @return ListFleetAgentsOptionalParameters
     */
    public ListFleetAgentsOptionalParameters tags(String tags) {
      this.tags = tags;
      return this;
    }

    /**
     * Set filter.
     * @param filter Filter string for narrowing down agent results. (optional)
     * @return ListFleetAgentsOptionalParameters
     */
    public ListFleetAgentsOptionalParameters filter(String filter) {
      this.filter = filter;
      return this;
    }
  }

  /**
 * List all Datadog Agents.
 *
 * See {@link #listFleetAgentsWithHttpInfo}.
 *
 * @return FleetAgentsResponse
 * @throws ApiException if fails to make API call
 */
  public FleetAgentsResponse listFleetAgents () throws ApiException {
    return listFleetAgentsWithHttpInfo(new ListFleetAgentsOptionalParameters()).getData();
  }

  /**
 * List all Datadog Agents.
 *
 * See {@link #listFleetAgentsWithHttpInfoAsync}.
 *
 * @return CompletableFuture&lt;FleetAgentsResponse&gt;
 */
  public CompletableFuture<FleetAgentsResponse>listFleetAgentsAsync() {
    return listFleetAgentsWithHttpInfoAsync(new ListFleetAgentsOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * List all Datadog Agents.
 *
 * See {@link #listFleetAgentsWithHttpInfo}.
 *
 * @param parameters Optional parameters for the request.
 * @return FleetAgentsResponse
 * @throws ApiException if fails to make API call
 */
  public FleetAgentsResponse listFleetAgents(ListFleetAgentsOptionalParameters parameters) throws ApiException {
    return listFleetAgentsWithHttpInfo(parameters).getData();
  }

  /**
 * List all Datadog Agents.
 *
 * See {@link #listFleetAgentsWithHttpInfoAsync}.
 *
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;FleetAgentsResponse&gt;
 */
  public CompletableFuture<FleetAgentsResponse>listFleetAgentsAsync(ListFleetAgentsOptionalParameters parameters) {
    return listFleetAgentsWithHttpInfoAsync(parameters).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Retrieve a paginated list of all Datadog Agents.
   * This endpoint returns a paginated list of all Datadog Agents with support for pagination, sorting, and filtering.
   * Use the <code>page_number</code> and <code>page_size</code> query parameters to paginate through results.</p>
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;FleetAgentsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
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
  public ApiResponse<FleetAgentsResponse> listFleetAgentsWithHttpInfo(ListFleetAgentsOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listFleetAgents";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    Long pageNumber = parameters.pageNumber;
    Long pageSize = parameters.pageSize;
    String sortAttribute = parameters.sortAttribute;
    Boolean sortDescending = parameters.sortDescending;
    String tags = parameters.tags;
    String filter = parameters.filter;
    // create path and map variables
    String localVarPath = "/api/unstable/fleet/agents";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page_number", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page_size", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort_attribute", sortAttribute));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort_descending", sortDescending));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "tags", tags));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));

    Invocation.Builder builder = apiClient.createBuilder("v2.FleetAutomationApi.listFleetAgents", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<FleetAgentsResponse>() {});
  }

  /**
   * List all Datadog Agents.
   *
   * See {@link #listFleetAgentsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;FleetAgentsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<FleetAgentsResponse>> listFleetAgentsWithHttpInfoAsync(ListFleetAgentsOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listFleetAgents";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<FleetAgentsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    Long pageNumber = parameters.pageNumber;
    Long pageSize = parameters.pageSize;
    String sortAttribute = parameters.sortAttribute;
    Boolean sortDescending = parameters.sortDescending;
    String tags = parameters.tags;
    String filter = parameters.filter;
    // create path and map variables
    String localVarPath = "/api/unstable/fleet/agents";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page_number", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page_size", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort_attribute", sortAttribute));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort_descending", sortDescending));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "tags", tags));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.FleetAutomationApi.listFleetAgents", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<FleetAgentsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<FleetAgentsResponse>() {});
  }

  /**
 * List all available Agent versions.
 *
 * See {@link #listFleetAgentVersionsWithHttpInfo}.
 *
 * @return FleetAgentVersionsResponse
 * @throws ApiException if fails to make API call
 */
  public FleetAgentVersionsResponse  listFleetAgentVersions() throws ApiException {
    return listFleetAgentVersionsWithHttpInfo().getData();
  }

  /**
 * List all available Agent versions.
 *
 * See {@link #listFleetAgentVersionsWithHttpInfoAsync}.
 *
 * @return CompletableFuture&lt;FleetAgentVersionsResponse&gt;
 */
  public CompletableFuture<FleetAgentVersionsResponse>listFleetAgentVersionsAsync() {
    return listFleetAgentVersionsWithHttpInfoAsync().thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Retrieve a list of all available Datadog Agent versions.</p>
   * <p>This endpoint returns the available Agent versions that can be deployed to your fleet.
   * These versions are used when creating deployments or configuring schedules for
   * automated Agent upgrades.</p>
   *
   * @return ApiResponse&lt;FleetAgentVersionsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
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
  public ApiResponse<FleetAgentVersionsResponse> listFleetAgentVersionsWithHttpInfo() throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listFleetAgentVersions";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/unstable/fleet/agent_versions";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.FleetAutomationApi.listFleetAgentVersions", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<FleetAgentVersionsResponse>() {});
  }

  /**
   * List all available Agent versions.
   *
   * See {@link #listFleetAgentVersionsWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;FleetAgentVersionsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<FleetAgentVersionsResponse>> listFleetAgentVersionsWithHttpInfoAsync() {
    // Check if unstable operation is enabled
    String operationId = "listFleetAgentVersions";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<FleetAgentVersionsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/unstable/fleet/agent_versions";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.FleetAutomationApi.listFleetAgentVersions", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<FleetAgentVersionsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<FleetAgentVersionsResponse>() {});
  }

  /**
   * Manage optional parameters to listFleetDeployments.
   */
  public static class ListFleetDeploymentsOptionalParameters {
    private Long pageSize;
    private Long pageOffset;

    /**
     * Set pageSize.
     * @param pageSize Number of deployments to return per page. Maximum value is 100. (optional, default to 10)
     * @return ListFleetDeploymentsOptionalParameters
     */
    public ListFleetDeploymentsOptionalParameters pageSize(Long pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set pageOffset.
     * @param pageOffset Index of the first deployment to return. Use this with <code>page_size</code> to paginate through results. (optional, default to 0)
     * @return ListFleetDeploymentsOptionalParameters
     */
    public ListFleetDeploymentsOptionalParameters pageOffset(Long pageOffset) {
      this.pageOffset = pageOffset;
      return this;
    }
  }

  /**
 * List all deployments.
 *
 * See {@link #listFleetDeploymentsWithHttpInfo}.
 *
 * @return FleetDeploymentsResponse
 * @throws ApiException if fails to make API call
 */
  public FleetDeploymentsResponse listFleetDeployments () throws ApiException {
    return listFleetDeploymentsWithHttpInfo(new ListFleetDeploymentsOptionalParameters()).getData();
  }

  /**
 * List all deployments.
 *
 * See {@link #listFleetDeploymentsWithHttpInfoAsync}.
 *
 * @return CompletableFuture&lt;FleetDeploymentsResponse&gt;
 */
  public CompletableFuture<FleetDeploymentsResponse>listFleetDeploymentsAsync() {
    return listFleetDeploymentsWithHttpInfoAsync(new ListFleetDeploymentsOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * List all deployments.
 *
 * See {@link #listFleetDeploymentsWithHttpInfo}.
 *
 * @param parameters Optional parameters for the request.
 * @return FleetDeploymentsResponse
 * @throws ApiException if fails to make API call
 */
  public FleetDeploymentsResponse listFleetDeployments(ListFleetDeploymentsOptionalParameters parameters) throws ApiException {
    return listFleetDeploymentsWithHttpInfo(parameters).getData();
  }

  /**
 * List all deployments.
 *
 * See {@link #listFleetDeploymentsWithHttpInfoAsync}.
 *
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;FleetDeploymentsResponse&gt;
 */
  public CompletableFuture<FleetDeploymentsResponse>listFleetDeploymentsAsync(ListFleetDeploymentsOptionalParameters parameters) {
    return listFleetDeploymentsWithHttpInfoAsync(parameters).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Retrieve a list of all deployments for fleet automation.
   * Use the <code>page_size</code> and <code>page_offset</code> parameters to paginate results.</p>
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;FleetDeploymentsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<FleetDeploymentsResponse> listFleetDeploymentsWithHttpInfo(ListFleetDeploymentsOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listFleetDeployments";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    Long pageSize = parameters.pageSize;
    Long pageOffset = parameters.pageOffset;
    // create path and map variables
    String localVarPath = "/api/unstable/fleet/deployments";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page_size", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page_offset", pageOffset));

    Invocation.Builder builder = apiClient.createBuilder("v2.FleetAutomationApi.listFleetDeployments", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<FleetDeploymentsResponse>() {});
  }

  /**
   * List all deployments.
   *
   * See {@link #listFleetDeploymentsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;FleetDeploymentsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<FleetDeploymentsResponse>> listFleetDeploymentsWithHttpInfoAsync(ListFleetDeploymentsOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listFleetDeployments";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<FleetDeploymentsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    Long pageSize = parameters.pageSize;
    Long pageOffset = parameters.pageOffset;
    // create path and map variables
    String localVarPath = "/api/unstable/fleet/deployments";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page_size", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page_offset", pageOffset));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.FleetAutomationApi.listFleetDeployments", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<FleetDeploymentsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<FleetDeploymentsResponse>() {});
  }

  /**
 * List all schedules.
 *
 * See {@link #listFleetSchedulesWithHttpInfo}.
 *
 * @return FleetSchedulesResponse
 * @throws ApiException if fails to make API call
 */
  public FleetSchedulesResponse  listFleetSchedules() throws ApiException {
    return listFleetSchedulesWithHttpInfo().getData();
  }

  /**
 * List all schedules.
 *
 * See {@link #listFleetSchedulesWithHttpInfoAsync}.
 *
 * @return CompletableFuture&lt;FleetSchedulesResponse&gt;
 */
  public CompletableFuture<FleetSchedulesResponse>listFleetSchedulesAsync() {
    return listFleetSchedulesWithHttpInfoAsync().thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Retrieve a list of all schedules for automated fleet deployments.</p>
   * <p>Schedules allow you to automate package upgrades by defining maintenance windows
   * and recurrence rules. Each schedule automatically creates deployments based on its
   * configuration.</p>
   *
   * @return ApiResponse&lt;FleetSchedulesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<FleetSchedulesResponse> listFleetSchedulesWithHttpInfo() throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listFleetSchedules";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/unstable/fleet/schedules";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.FleetAutomationApi.listFleetSchedules", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<FleetSchedulesResponse>() {});
  }

  /**
   * List all schedules.
   *
   * See {@link #listFleetSchedulesWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;FleetSchedulesResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<FleetSchedulesResponse>> listFleetSchedulesWithHttpInfoAsync() {
    // Check if unstable operation is enabled
    String operationId = "listFleetSchedules";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<FleetSchedulesResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/unstable/fleet/schedules";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.FleetAutomationApi.listFleetSchedules", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<FleetSchedulesResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<FleetSchedulesResponse>() {});
  }

  /**
 * Trigger a schedule deployment.
 *
 * See {@link #triggerFleetScheduleWithHttpInfo}.
 *
 * @param id The unique identifier of the schedule to trigger. (required)
 * @return FleetDeploymentResponse
 * @throws ApiException if fails to make API call
 */
  public FleetDeploymentResponse  triggerFleetSchedule(String id) throws ApiException {
    return triggerFleetScheduleWithHttpInfo(id).getData();
  }

  /**
 * Trigger a schedule deployment.
 *
 * See {@link #triggerFleetScheduleWithHttpInfoAsync}.
 *
 * @param id The unique identifier of the schedule to trigger. (required)
 * @return CompletableFuture&lt;FleetDeploymentResponse&gt;
 */
  public CompletableFuture<FleetDeploymentResponse>triggerFleetScheduleAsync(String id) {
    return triggerFleetScheduleWithHttpInfoAsync(id).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Manually trigger a schedule to immediately create and start a deployment.</p>
   * <p>This endpoint allows you to manually initiate a deployment using the schedule's
   * configuration, without waiting for the next scheduled maintenance window. This is
   * useful for:
   * - Testing a schedule before it runs automatically
   * - Performing an emergency update outside the regular maintenance window
   * - Creating an ad-hoc deployment with the same settings as a schedule</p>
   * <p>The deployment is created immediately with:
   * - The same filter query as the schedule
   * - The package version determined by the schedule's version strategy
   * - All matching hosts as targets</p>
   * <p>The manually triggered deployment is independent of the schedule and does not
   * affect the schedule's normal recurrence pattern.</p>
   *
   * @param id The unique identifier of the schedule to trigger. (required)
   * @return ApiResponse&lt;FleetDeploymentResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> CREATED - Deployment successfully created and started. </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<FleetDeploymentResponse> triggerFleetScheduleWithHttpInfo(String id) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "triggerFleetSchedule";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling triggerFleetSchedule");
    }
    // create path and map variables
    String localVarPath = "/api/unstable/fleet/schedules/{id}/trigger"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.FleetAutomationApi.triggerFleetSchedule", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("POST", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<FleetDeploymentResponse>() {});
  }

  /**
   * Trigger a schedule deployment.
   *
   * See {@link #triggerFleetScheduleWithHttpInfo}.
   *
   * @param id The unique identifier of the schedule to trigger. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;FleetDeploymentResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<FleetDeploymentResponse>> triggerFleetScheduleWithHttpInfoAsync(String id) {
    // Check if unstable operation is enabled
    String operationId = "triggerFleetSchedule";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<FleetDeploymentResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
        CompletableFuture<ApiResponse<FleetDeploymentResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'id' when calling triggerFleetSchedule"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/unstable/fleet/schedules/{id}/trigger"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.FleetAutomationApi.triggerFleetSchedule", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<FleetDeploymentResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("POST", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<FleetDeploymentResponse>() {});
  }

  /**
 * Update a schedule.
 *
 * See {@link #updateFleetScheduleWithHttpInfo}.
 *
 * @param id The unique identifier of the schedule to update. (required)
 * @param body Request payload containing the fields to update. (required)
 * @return FleetScheduleResponse
 * @throws ApiException if fails to make API call
 */
  public FleetScheduleResponse  updateFleetSchedule(String id, FleetSchedulePatchRequest body) throws ApiException {
    return updateFleetScheduleWithHttpInfo(id, body).getData();
  }

  /**
 * Update a schedule.
 *
 * See {@link #updateFleetScheduleWithHttpInfoAsync}.
 *
 * @param id The unique identifier of the schedule to update. (required)
 * @param body Request payload containing the fields to update. (required)
 * @return CompletableFuture&lt;FleetScheduleResponse&gt;
 */
  public CompletableFuture<FleetScheduleResponse>updateFleetScheduleAsync(String id, FleetSchedulePatchRequest body) {
    return updateFleetScheduleWithHttpInfoAsync(id, body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Partially update a schedule by providing only the fields you want to change.</p>
   * <p>This endpoint allows you to modify specific attributes of a schedule without
   * affecting other fields. Common use cases include:
   * - Changing the schedule status between active and inactive
   * - Updating the maintenance window times
   * - Modifying the filter query to target different hosts
   * - Adjusting the version strategy</p>
   * <p>Only include the fields you want to update in the request body. All fields
   * are optional in a PATCH request.</p>
   *
   * @param id The unique identifier of the schedule to update. (required)
   * @param body Request payload containing the fields to update. (required)
   * @return ApiResponse&lt;FleetScheduleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
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
  public ApiResponse<FleetScheduleResponse> updateFleetScheduleWithHttpInfo(String id, FleetSchedulePatchRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateFleetSchedule";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateFleetSchedule");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateFleetSchedule");
    }
    // create path and map variables
    String localVarPath = "/api/unstable/fleet/schedules/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.FleetAutomationApi.updateFleetSchedule", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("PATCH", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<FleetScheduleResponse>() {});
  }

  /**
   * Update a schedule.
   *
   * See {@link #updateFleetScheduleWithHttpInfo}.
   *
   * @param id The unique identifier of the schedule to update. (required)
   * @param body Request payload containing the fields to update. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;FleetScheduleResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<FleetScheduleResponse>> updateFleetScheduleWithHttpInfoAsync(String id, FleetSchedulePatchRequest body) {
    // Check if unstable operation is enabled
    String operationId = "updateFleetSchedule";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<FleetScheduleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'id' is set
    if (id == null) {
        CompletableFuture<ApiResponse<FleetScheduleResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'id' when calling updateFleetSchedule"));
        return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<FleetScheduleResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling updateFleetSchedule"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/unstable/fleet/schedules/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.FleetAutomationApi.updateFleetSchedule", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<FleetScheduleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("PATCH", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<FleetScheduleResponse>() {});
  }
}