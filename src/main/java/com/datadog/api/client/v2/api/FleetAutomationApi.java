
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
import com.datadog.api.client.v2.model.FleetTracersResponse;
import com.datadog.api.client.v2.model.FleetScheduleResponse;
import com.datadog.api.client.v2.model.FleetScheduleCreateRequest;
import com.datadog.api.client.v2.model.FleetSchedulePatchRequest;
import com.datadog.api.client.v2.model.FleetDeploymentResponse;
import com.datadog.api.client.v2.model.FleetAgentVersionsV2Response;
import com.datadog.api.client.v2.model.FleetAgentsV2Response;
import com.datadog.api.client.v2.model.FleetAgentDetailV2Response;
import com.datadog.api.client.v2.model.FleetDeploymentsV2Response;
import com.datadog.api.client.v2.model.FleetDeploymentConfigureV2DryRunResponse;
import com.datadog.api.client.v2.model.FleetDeploymentConfigureV2CreateRequest;
import com.datadog.api.client.v2.model.FleetDeploymentV2CreateResponse;
import com.datadog.api.client.v2.model.FleetDeploymentPackageUpgradeV2CreateRequest;
import com.datadog.api.client.v2.model.FleetDeploymentV2DetailResponse;
import com.datadog.api.client.v2.model.FleetDeploymentV2CancelResponse;
import com.datadog.api.client.v2.model.FleetSchedulesV2Response;
import com.datadog.api.client.v2.model.FleetScheduleV2Response;


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
 * See {@link #cancelFleetDeploymentV2WithHttpInfo}.
 *
 * @param deploymentId The unique identifier of the deployment to cancel. (required)
 * @return FleetDeploymentV2CancelResponse
 * @throws ApiException if fails to make API call
 */
  public FleetDeploymentV2CancelResponse  cancelFleetDeploymentV2(String deploymentId) throws ApiException {
    return cancelFleetDeploymentV2WithHttpInfo(deploymentId).getData();
  }

  /**
 * Cancel a deployment.
 *
 * See {@link #cancelFleetDeploymentV2WithHttpInfoAsync}.
 *
 * @param deploymentId The unique identifier of the deployment to cancel. (required)
 * @return CompletableFuture&lt;FleetDeploymentV2CancelResponse&gt;
 */
  public CompletableFuture<FleetDeploymentV2CancelResponse>cancelFleetDeploymentV2Async(String deploymentId) {
    return cancelFleetDeploymentV2WithHttpInfoAsync(deploymentId).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Cancel an active deployment and stop all pending operations.
   * When you cancel a deployment:
   * - All pending operations on hosts that haven't started yet are stopped.
   * - Operations currently in progress on hosts may complete or be interrupted, depending on their current status.
   * - Configuration changes or package upgrades already applied to hosts are not rolled back.</p>
   * <p>After cancellation, you can view the final state of the deployment using the GET endpoint to see which hosts
   * were successfully updated before the cancellation.</p>
   * <p>Only deployments with a <code>pending</code> or <code>running</code> status can be canceled. Returns a 400 if the deployment is not in a cancelable status. Returns a 404 if no deployment matches the specified ID or if you do not have access to it.</p>
   *
   * @param deploymentId The unique identifier of the deployment to cancel. (required)
   * @return ApiResponse&lt;FleetDeploymentV2CancelResponse&gt;
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
  public ApiResponse<FleetDeploymentV2CancelResponse> cancelFleetDeploymentV2WithHttpInfo(String deploymentId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'deploymentId' is set
    if (deploymentId == null) {
      throw new ApiException(400, "Missing the required parameter 'deploymentId' when calling cancelFleetDeploymentV2");
    }
    // create path and map variables
    String localVarPath = "/api/v2/fleet/deployments/{deployment_id}/cancel"
      .replaceAll("\\{" + "deployment_id" + "\\}", apiClient.escapeString(deploymentId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.FleetAutomationApi.cancelFleetDeploymentV2", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("POST", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<FleetDeploymentV2CancelResponse>() {});
  }

  /**
   * Cancel a deployment.
   *
   * See {@link #cancelFleetDeploymentV2WithHttpInfo}.
   *
   * @param deploymentId The unique identifier of the deployment to cancel. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;FleetDeploymentV2CancelResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<FleetDeploymentV2CancelResponse>> cancelFleetDeploymentV2WithHttpInfoAsync(String deploymentId) {
    Object localVarPostBody = null;

    // verify the required parameter 'deploymentId' is set
    if (deploymentId == null) {
        CompletableFuture<ApiResponse<FleetDeploymentV2CancelResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'deploymentId' when calling cancelFleetDeploymentV2"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/fleet/deployments/{deployment_id}/cancel"
      .replaceAll("\\{" + "deployment_id" + "\\}", apiClient.escapeString(deploymentId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.FleetAutomationApi.cancelFleetDeploymentV2", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<FleetDeploymentV2CancelResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("POST", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<FleetDeploymentV2CancelResponse>() {});
  }

  /**
 * Create a configuration deployment.
 *
 * See {@link #createFleetDeploymentConfigureV2WithHttpInfo}.
 *
 * @param body Request payload containing the deployment details. (required)
 * @return FleetDeploymentConfigureV2DryRunResponse
 * @throws ApiException if fails to make API call
 */
  public FleetDeploymentConfigureV2DryRunResponse  createFleetDeploymentConfigureV2(FleetDeploymentConfigureV2CreateRequest body) throws ApiException {
    return createFleetDeploymentConfigureV2WithHttpInfo(body).getData();
  }

  /**
 * Create a configuration deployment.
 *
 * See {@link #createFleetDeploymentConfigureV2WithHttpInfoAsync}.
 *
 * @param body Request payload containing the deployment details. (required)
 * @return CompletableFuture&lt;FleetDeploymentConfigureV2DryRunResponse&gt;
 */
  public CompletableFuture<FleetDeploymentConfigureV2DryRunResponse>createFleetDeploymentConfigureV2Async(FleetDeploymentConfigureV2CreateRequest body) {
    return createFleetDeploymentConfigureV2WithHttpInfoAsync(body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Create a new deployment to apply configuration changes
   * to a fleet of hosts matching the specified filter query.</p>
   * <p>This endpoint supports two types of configuration operations:
   * - <code>merge-patch</code>: Merges the provided patch data with the existing configuration file,
   *   creating the file if it doesn't exist.
   * - <code>delete</code>: Removes the specified configuration file from the target hosts.</p>
   * <p>You can optionally use <code>target_packages</code> to apply the configuration change only to specific package versions.</p>
   * <p>The deployment is created and started automatically. You can specify multiple configuration
   * operations to execute in order on each target host. Use the filter query to target
   * specific hosts using the Datadog query syntax.</p>
   * <p>Set <code>dry_run</code> to <code>true</code> to validate the configuration and resolve target hosts and packages without deploying anything. A dry run returns a 200 with the validation result instead of creating and starting a deployment.</p>
   * <p>Returns a 400 if <code>filter_query</code> or <code>config_operations</code> is missing, a target package is missing a name or version or cannot be resolved, the configuration fails validation, or the filter query does not match any host eligible for the deployment.</p>
   *
   * @param body Request payload containing the deployment details. (required)
   * @return ApiResponse&lt;FleetDeploymentConfigureV2DryRunResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 201 </td><td> CREATED </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<FleetDeploymentConfigureV2DryRunResponse> createFleetDeploymentConfigureV2WithHttpInfo(FleetDeploymentConfigureV2CreateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createFleetDeploymentConfigureV2");
    }
    // create path and map variables
    String localVarPath = "/api/v2/fleet/deployments/configure";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.FleetAutomationApi.createFleetDeploymentConfigureV2", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<FleetDeploymentConfigureV2DryRunResponse>() {});
  }

  /**
   * Create a configuration deployment.
   *
   * See {@link #createFleetDeploymentConfigureV2WithHttpInfo}.
   *
   * @param body Request payload containing the deployment details. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;FleetDeploymentConfigureV2DryRunResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<FleetDeploymentConfigureV2DryRunResponse>> createFleetDeploymentConfigureV2WithHttpInfoAsync(FleetDeploymentConfigureV2CreateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<FleetDeploymentConfigureV2DryRunResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling createFleetDeploymentConfigureV2"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/fleet/deployments/configure";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.FleetAutomationApi.createFleetDeploymentConfigureV2", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<FleetDeploymentConfigureV2DryRunResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<FleetDeploymentConfigureV2DryRunResponse>() {});
  }

  /**
 * Upgrade hosts.
 *
 * See {@link #createFleetDeploymentUpgradeV2WithHttpInfo}.
 *
 * @param body Request payload containing the package upgrade details. (required)
 * @return FleetDeploymentV2CreateResponse
 * @throws ApiException if fails to make API call
 */
  public FleetDeploymentV2CreateResponse  createFleetDeploymentUpgradeV2(FleetDeploymentPackageUpgradeV2CreateRequest body) throws ApiException {
    return createFleetDeploymentUpgradeV2WithHttpInfo(body).getData();
  }

  /**
 * Upgrade hosts.
 *
 * See {@link #createFleetDeploymentUpgradeV2WithHttpInfoAsync}.
 *
 * @param body Request payload containing the package upgrade details. (required)
 * @return CompletableFuture&lt;FleetDeploymentV2CreateResponse&gt;
 */
  public CompletableFuture<FleetDeploymentV2CreateResponse>createFleetDeploymentUpgradeV2Async(FleetDeploymentPackageUpgradeV2CreateRequest body) {
    return createFleetDeploymentUpgradeV2WithHttpInfoAsync(body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Create and immediately start a new package upgrade
   * on hosts matching the specified filter query.</p>
   * <p>This endpoint allows you to upgrade the Datadog Agent to a specific version
   * on hosts matching the specified filter query.</p>
   * <p>The deployment is created and started automatically. The system:
   * 1. Identifies all hosts matching the filter query.
   * 2. Validates that the specified version is available.
   * 3. Begins rolling out the package upgrade to the target hosts.</p>
   * <p>Returns a 400 if <code>filter_query</code> or <code>target_packages</code> is missing, a target package is missing a name or version, or the filter query does not match any host eligible for the upgrade. Returns a 409 if a conflicting upgrade is already running on one or more target hosts.</p>
   *
   * @param body Request payload containing the package upgrade details. (required)
   * @return ApiResponse&lt;FleetDeploymentV2CreateResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> CREATED </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<FleetDeploymentV2CreateResponse> createFleetDeploymentUpgradeV2WithHttpInfo(FleetDeploymentPackageUpgradeV2CreateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createFleetDeploymentUpgradeV2");
    }
    // create path and map variables
    String localVarPath = "/api/v2/fleet/deployments/upgrade";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.FleetAutomationApi.createFleetDeploymentUpgradeV2", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<FleetDeploymentV2CreateResponse>() {});
  }

  /**
   * Upgrade hosts.
   *
   * See {@link #createFleetDeploymentUpgradeV2WithHttpInfo}.
   *
   * @param body Request payload containing the package upgrade details. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;FleetDeploymentV2CreateResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<FleetDeploymentV2CreateResponse>> createFleetDeploymentUpgradeV2WithHttpInfoAsync(FleetDeploymentPackageUpgradeV2CreateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<FleetDeploymentV2CreateResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling createFleetDeploymentUpgradeV2"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/fleet/deployments/upgrade";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.FleetAutomationApi.createFleetDeploymentUpgradeV2", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<FleetDeploymentV2CreateResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<FleetDeploymentV2CreateResponse>() {});
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
   * Manage optional parameters to getFleetAgentDetailV2.
   */
  public static class GetFleetAgentDetailV2OptionalParameters {
    private String include;

    /**
     * Set include.
     * @param include Comma-separated list of additional fields to include in the response. Valid values are <code>integrations</code> and <code>configuration_files</code>. Omitting this parameter returns only <code>agent_infos</code>. Unrecognized values are silently ignored rather than causing an error. (optional)
     * @return GetFleetAgentDetailV2OptionalParameters
     */
    public GetFleetAgentDetailV2OptionalParameters include(String include) {
      this.include = include;
      return this;
    }
  }

  /**
 * Get detailed information about an agent.
 *
 * See {@link #getFleetAgentDetailV2WithHttpInfo}.
 *
 * @param agentKey The unique identifier (Agent key) for the Datadog Agent. Must be a 32-character lowercase hexadecimal string. (required)
 * @return FleetAgentDetailV2Response
 * @throws ApiException if fails to make API call
 */
  public FleetAgentDetailV2Response getFleetAgentDetailV2 (String agentKey) throws ApiException {
    return getFleetAgentDetailV2WithHttpInfo( agentKey, new GetFleetAgentDetailV2OptionalParameters()).getData();
  }

  /**
 * Get detailed information about an agent.
 *
 * See {@link #getFleetAgentDetailV2WithHttpInfoAsync}.
 *
 * @param agentKey The unique identifier (Agent key) for the Datadog Agent. Must be a 32-character lowercase hexadecimal string. (required)
 * @return CompletableFuture&lt;FleetAgentDetailV2Response&gt;
 */
  public CompletableFuture<FleetAgentDetailV2Response>getFleetAgentDetailV2Async(String agentKey) {
    return getFleetAgentDetailV2WithHttpInfoAsync(agentKey, new GetFleetAgentDetailV2OptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * Get detailed information about an agent.
 *
 * See {@link #getFleetAgentDetailV2WithHttpInfo}.
 *
 * @param agentKey The unique identifier (Agent key) for the Datadog Agent. Must be a 32-character lowercase hexadecimal string. (required)
 * @param parameters Optional parameters for the request.
 * @return FleetAgentDetailV2Response
 * @throws ApiException if fails to make API call
 */
  public FleetAgentDetailV2Response getFleetAgentDetailV2(String agentKey, GetFleetAgentDetailV2OptionalParameters parameters) throws ApiException {
    return getFleetAgentDetailV2WithHttpInfo(agentKey, parameters).getData();
  }

  /**
 * Get detailed information about an agent.
 *
 * See {@link #getFleetAgentDetailV2WithHttpInfoAsync}.
 *
 * @param agentKey The unique identifier (Agent key) for the Datadog Agent. Must be a 32-character lowercase hexadecimal string. (required)
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;FleetAgentDetailV2Response&gt;
 */
  public CompletableFuture<FleetAgentDetailV2Response>getFleetAgentDetailV2Async( String agentKey, GetFleetAgentDetailV2OptionalParameters parameters) {
    return getFleetAgentDetailV2WithHttpInfoAsync(agentKey, parameters).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Retrieve detailed information about a specific Datadog Agent.</p>
   * <p>By default, only <code>agent_infos</code> is returned. Use the <code>include</code> query parameter to
   * request additional data: <code>integrations</code> and/or <code>configuration_files</code>.</p>
   *
   * @param agentKey The unique identifier (Agent key) for the Datadog Agent. Must be a 32-character lowercase hexadecimal string. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;FleetAgentDetailV2Response&gt;
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
  public ApiResponse<FleetAgentDetailV2Response> getFleetAgentDetailV2WithHttpInfo(String agentKey, GetFleetAgentDetailV2OptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'agentKey' is set
    if (agentKey == null) {
      throw new ApiException(400, "Missing the required parameter 'agentKey' when calling getFleetAgentDetailV2");
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath = "/api/v2/fleet/agents/{agent_key}"
      .replaceAll("\\{" + "agent_key" + "\\}", apiClient.escapeString(agentKey.toString()));

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder = apiClient.createBuilder("v2.FleetAutomationApi.getFleetAgentDetailV2", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<FleetAgentDetailV2Response>() {});
  }

  /**
   * Get detailed information about an agent.
   *
   * See {@link #getFleetAgentDetailV2WithHttpInfo}.
   *
   * @param agentKey The unique identifier (Agent key) for the Datadog Agent. Must be a 32-character lowercase hexadecimal string. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;FleetAgentDetailV2Response&gt;&gt;
   */
  public CompletableFuture<ApiResponse<FleetAgentDetailV2Response>> getFleetAgentDetailV2WithHttpInfoAsync(String agentKey, GetFleetAgentDetailV2OptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'agentKey' is set
    if (agentKey == null) {
        CompletableFuture<ApiResponse<FleetAgentDetailV2Response>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'agentKey' when calling getFleetAgentDetailV2"));
        return result;
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath = "/api/v2/fleet/agents/{agent_key}"
      .replaceAll("\\{" + "agent_key" + "\\}", apiClient.escapeString(agentKey.toString()));

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.FleetAutomationApi.getFleetAgentDetailV2", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<FleetAgentDetailV2Response>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<FleetAgentDetailV2Response>() {});
  }

  /**
 * Get a deployment by ID.
 *
 * See {@link #getFleetDeploymentV2WithHttpInfo}.
 *
 * @param deploymentId The unique identifier of the deployment to retrieve. (required)
 * @return FleetDeploymentV2DetailResponse
 * @throws ApiException if fails to make API call
 */
  public FleetDeploymentV2DetailResponse  getFleetDeploymentV2(String deploymentId) throws ApiException {
    return getFleetDeploymentV2WithHttpInfo(deploymentId).getData();
  }

  /**
 * Get a deployment by ID.
 *
 * See {@link #getFleetDeploymentV2WithHttpInfoAsync}.
 *
 * @param deploymentId The unique identifier of the deployment to retrieve. (required)
 * @return CompletableFuture&lt;FleetDeploymentV2DetailResponse&gt;
 */
  public CompletableFuture<FleetDeploymentV2DetailResponse>getFleetDeploymentV2Async(String deploymentId) {
    return getFleetDeploymentV2WithHttpInfoAsync(deploymentId).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Retrieve detailed information about a specific deployment, including its current status,
   * configuration operations, and per-host execution status.</p>
   * <p>Returns a 404 if no deployment matches the given ID or if you do not have access to it.</p>
   *
   * @param deploymentId The unique identifier of the deployment to retrieve. (required)
   * @return ApiResponse&lt;FleetDeploymentV2DetailResponse&gt;
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
  public ApiResponse<FleetDeploymentV2DetailResponse> getFleetDeploymentV2WithHttpInfo(String deploymentId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'deploymentId' is set
    if (deploymentId == null) {
      throw new ApiException(400, "Missing the required parameter 'deploymentId' when calling getFleetDeploymentV2");
    }
    // create path and map variables
    String localVarPath = "/api/v2/fleet/deployments/{deployment_id}"
      .replaceAll("\\{" + "deployment_id" + "\\}", apiClient.escapeString(deploymentId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.FleetAutomationApi.getFleetDeploymentV2", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<FleetDeploymentV2DetailResponse>() {});
  }

  /**
   * Get a deployment by ID.
   *
   * See {@link #getFleetDeploymentV2WithHttpInfo}.
   *
   * @param deploymentId The unique identifier of the deployment to retrieve. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;FleetDeploymentV2DetailResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<FleetDeploymentV2DetailResponse>> getFleetDeploymentV2WithHttpInfoAsync(String deploymentId) {
    Object localVarPostBody = null;

    // verify the required parameter 'deploymentId' is set
    if (deploymentId == null) {
        CompletableFuture<ApiResponse<FleetDeploymentV2DetailResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'deploymentId' when calling getFleetDeploymentV2"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/fleet/deployments/{deployment_id}"
      .replaceAll("\\{" + "deployment_id" + "\\}", apiClient.escapeString(deploymentId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.FleetAutomationApi.getFleetDeploymentV2", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<FleetDeploymentV2DetailResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<FleetDeploymentV2DetailResponse>() {});
  }

  /**
 * Get a schedule by ID.
 *
 * See {@link #getFleetScheduleV2WithHttpInfo}.
 *
 * @param id The unique identifier of the schedule to retrieve. (required)
 * @return FleetScheduleV2Response
 * @throws ApiException if fails to make API call
 */
  public FleetScheduleV2Response  getFleetScheduleV2(String id) throws ApiException {
    return getFleetScheduleV2WithHttpInfo(id).getData();
  }

  /**
 * Get a schedule by ID.
 *
 * See {@link #getFleetScheduleV2WithHttpInfoAsync}.
 *
 * @param id The unique identifier of the schedule to retrieve. (required)
 * @return CompletableFuture&lt;FleetScheduleV2Response&gt;
 */
  public CompletableFuture<FleetScheduleV2Response>getFleetScheduleV2Async(String id) {
    return getFleetScheduleV2WithHttpInfoAsync(id).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Retrieve detailed information about a specific schedule by its unique identifier.</p>
   *
   * @param id The unique identifier of the schedule to retrieve. (required)
   * @return ApiResponse&lt;FleetScheduleV2Response&gt;
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
  public ApiResponse<FleetScheduleV2Response> getFleetScheduleV2WithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getFleetScheduleV2");
    }
    // create path and map variables
    String localVarPath = "/api/v2/fleet/schedules/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.FleetAutomationApi.getFleetScheduleV2", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<FleetScheduleV2Response>() {});
  }

  /**
   * Get a schedule by ID.
   *
   * See {@link #getFleetScheduleV2WithHttpInfo}.
   *
   * @param id The unique identifier of the schedule to retrieve. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;FleetScheduleV2Response&gt;&gt;
   */
  public CompletableFuture<ApiResponse<FleetScheduleV2Response>> getFleetScheduleV2WithHttpInfoAsync(String id) {
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
        CompletableFuture<ApiResponse<FleetScheduleV2Response>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'id' when calling getFleetScheduleV2"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/fleet/schedules/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.FleetAutomationApi.getFleetScheduleV2", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<FleetScheduleV2Response>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<FleetScheduleV2Response>() {});
  }

  /**
   * Manage optional parameters to listFleetAgentsV2.
   */
  public static class ListFleetAgentsV2OptionalParameters {
    private Long pageNumber;
    private Long pageSize;
    private String filter;
    private String tags;
    private String sortAttribute;
    private Boolean sortDescending;

    /**
     * Set pageNumber.
     * @param pageNumber Page number for pagination, starting at 0. (optional, default to 0)
     * @return ListFleetAgentsV2OptionalParameters
     */
    public ListFleetAgentsV2OptionalParameters pageNumber(Long pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set pageSize.
     * @param pageSize Number of agents to return per page. Maximum value is 100. Defaults to 10. (optional, default to 10)
     * @return ListFleetAgentsV2OptionalParameters
     */
    public ListFleetAgentsV2OptionalParameters pageSize(Long pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set filter.
     * @param filter Filter string to narrow down agent results. (optional)
     * @return ListFleetAgentsV2OptionalParameters
     */
    public ListFleetAgentsV2OptionalParameters filter(String filter) {
      this.filter = filter;
      return this;
    }

    /**
     * Set tags.
     * @param tags Comma-separated list of tag keys to select which tags are included in each agent's <code>tags</code> attribute. Does not filter which agents are returned. (optional)
     * @return ListFleetAgentsV2OptionalParameters
     */
    public ListFleetAgentsV2OptionalParameters tags(String tags) {
      this.tags = tags;
      return this;
    }

    /**
     * Set sortAttribute.
     * @param sortAttribute Agent attribute to sort results by. Must be a supported attribute name; unsupported values return a 400 error. (optional)
     * @return ListFleetAgentsV2OptionalParameters
     */
    public ListFleetAgentsV2OptionalParameters sortAttribute(String sortAttribute) {
      this.sortAttribute = sortAttribute;
      return this;
    }

    /**
     * Set sortDescending.
     * @param sortDescending Set to <code>true</code> to sort results in descending order. Defaults to ascending. (optional)
     * @return ListFleetAgentsV2OptionalParameters
     */
    public ListFleetAgentsV2OptionalParameters sortDescending(Boolean sortDescending) {
      this.sortDescending = sortDescending;
      return this;
    }
  }

  /**
 * List all Datadog Agents.
 *
 * See {@link #listFleetAgentsV2WithHttpInfo}.
 *
 * @return FleetAgentsV2Response
 * @throws ApiException if fails to make API call
 */
  public FleetAgentsV2Response listFleetAgentsV2 () throws ApiException {
    return listFleetAgentsV2WithHttpInfo(new ListFleetAgentsV2OptionalParameters()).getData();
  }

  /**
 * List all Datadog Agents.
 *
 * See {@link #listFleetAgentsV2WithHttpInfoAsync}.
 *
 * @return CompletableFuture&lt;FleetAgentsV2Response&gt;
 */
  public CompletableFuture<FleetAgentsV2Response>listFleetAgentsV2Async() {
    return listFleetAgentsV2WithHttpInfoAsync(new ListFleetAgentsV2OptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * List all Datadog Agents.
 *
 * See {@link #listFleetAgentsV2WithHttpInfo}.
 *
 * @param parameters Optional parameters for the request.
 * @return FleetAgentsV2Response
 * @throws ApiException if fails to make API call
 */
  public FleetAgentsV2Response listFleetAgentsV2(ListFleetAgentsV2OptionalParameters parameters) throws ApiException {
    return listFleetAgentsV2WithHttpInfo(parameters).getData();
  }

  /**
 * List all Datadog Agents.
 *
 * See {@link #listFleetAgentsV2WithHttpInfoAsync}.
 *
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;FleetAgentsV2Response&gt;
 */
  public CompletableFuture<FleetAgentsV2Response>listFleetAgentsV2Async(ListFleetAgentsV2OptionalParameters parameters) {
    return listFleetAgentsV2WithHttpInfoAsync(parameters).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Retrieve a paginated list of Datadog Agents.</p>
   * <p>Returns agents with support for pagination, sorting, and filtering.
   * Use <code>page_number</code> and <code>page_size</code> to navigate pages, <code>filter</code> to narrow by field values,
   * and <code>tags</code> to filter by agent tags.</p>
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;FleetAgentsV2Response&gt;
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
  public ApiResponse<FleetAgentsV2Response> listFleetAgentsV2WithHttpInfo(ListFleetAgentsV2OptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    Long pageNumber = parameters.pageNumber;
    Long pageSize = parameters.pageSize;
    String filter = parameters.filter;
    String tags = parameters.tags;
    String sortAttribute = parameters.sortAttribute;
    Boolean sortDescending = parameters.sortDescending;
    // create path and map variables
    String localVarPath = "/api/v2/fleet/agents";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page_number", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page_size", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "tags", tags));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort_attribute", sortAttribute));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort_descending", sortDescending));

    Invocation.Builder builder = apiClient.createBuilder("v2.FleetAutomationApi.listFleetAgentsV2", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<FleetAgentsV2Response>() {});
  }

  /**
   * List all Datadog Agents.
   *
   * See {@link #listFleetAgentsV2WithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;FleetAgentsV2Response&gt;&gt;
   */
  public CompletableFuture<ApiResponse<FleetAgentsV2Response>> listFleetAgentsV2WithHttpInfoAsync(ListFleetAgentsV2OptionalParameters parameters) {
    Object localVarPostBody = null;
    Long pageNumber = parameters.pageNumber;
    Long pageSize = parameters.pageSize;
    String filter = parameters.filter;
    String tags = parameters.tags;
    String sortAttribute = parameters.sortAttribute;
    Boolean sortDescending = parameters.sortDescending;
    // create path and map variables
    String localVarPath = "/api/v2/fleet/agents";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page_number", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page_size", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "tags", tags));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort_attribute", sortAttribute));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort_descending", sortDescending));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.FleetAutomationApi.listFleetAgentsV2", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<FleetAgentsV2Response>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<FleetAgentsV2Response>() {});
  }

  /**
   * Manage optional parameters to listFleetAgentTracers.
   */
  public static class ListFleetAgentTracersOptionalParameters {
    private Long pageNumber;
    private Long pageSize;
    private String sortAttribute;
    private Boolean sortDescending;

    /**
     * Set pageNumber.
     * @param pageNumber Page number for pagination (starts at 0). (optional, default to 0)
     * @return ListFleetAgentTracersOptionalParameters
     */
    public ListFleetAgentTracersOptionalParameters pageNumber(Long pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set pageSize.
     * @param pageSize Number of results per page (must be greater than 0 and less than or equal to 100). (optional, default to 10)
     * @return ListFleetAgentTracersOptionalParameters
     */
    public ListFleetAgentTracersOptionalParameters pageSize(Long pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set sortAttribute.
     * @param sortAttribute Attribute to sort by. (optional)
     * @return ListFleetAgentTracersOptionalParameters
     */
    public ListFleetAgentTracersOptionalParameters sortAttribute(String sortAttribute) {
      this.sortAttribute = sortAttribute;
      return this;
    }

    /**
     * Set sortDescending.
     * @param sortDescending Sort order (true for descending, false for ascending). (optional, default to true)
     * @return ListFleetAgentTracersOptionalParameters
     */
    public ListFleetAgentTracersOptionalParameters sortDescending(Boolean sortDescending) {
      this.sortDescending = sortDescending;
      return this;
    }
  }

  /**
 * List tracers for a specific agent.
 *
 * See {@link #listFleetAgentTracersWithHttpInfo}.
 *
 * @param agentKey The unique identifier (agent key) for the Datadog Agent. (required)
 * @return FleetTracersResponse
 * @throws ApiException if fails to make API call
 */
  public FleetTracersResponse listFleetAgentTracers (String agentKey) throws ApiException {
    return listFleetAgentTracersWithHttpInfo( agentKey, new ListFleetAgentTracersOptionalParameters()).getData();
  }

  /**
 * List tracers for a specific agent.
 *
 * See {@link #listFleetAgentTracersWithHttpInfoAsync}.
 *
 * @param agentKey The unique identifier (agent key) for the Datadog Agent. (required)
 * @return CompletableFuture&lt;FleetTracersResponse&gt;
 */
  public CompletableFuture<FleetTracersResponse>listFleetAgentTracersAsync(String agentKey) {
    return listFleetAgentTracersWithHttpInfoAsync(agentKey, new ListFleetAgentTracersOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * List tracers for a specific agent.
 *
 * See {@link #listFleetAgentTracersWithHttpInfo}.
 *
 * @param agentKey The unique identifier (agent key) for the Datadog Agent. (required)
 * @param parameters Optional parameters for the request.
 * @return FleetTracersResponse
 * @throws ApiException if fails to make API call
 */
  public FleetTracersResponse listFleetAgentTracers(String agentKey, ListFleetAgentTracersOptionalParameters parameters) throws ApiException {
    return listFleetAgentTracersWithHttpInfo(agentKey, parameters).getData();
  }

  /**
 * List tracers for a specific agent.
 *
 * See {@link #listFleetAgentTracersWithHttpInfoAsync}.
 *
 * @param agentKey The unique identifier (agent key) for the Datadog Agent. (required)
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;FleetTracersResponse&gt;
 */
  public CompletableFuture<FleetTracersResponse>listFleetAgentTracersAsync( String agentKey, ListFleetAgentTracersOptionalParameters parameters) {
    return listFleetAgentTracersWithHttpInfoAsync(agentKey, parameters).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Retrieve a paginated list of tracers for a specific agent.</p>
   * <p>This endpoint returns tracers associated with a given agent key, identified by the
   * agent's hostname. Use this to discover telemetry-derived service names for a particular host.</p>
   *
   * @param agentKey The unique identifier (agent key) for the Datadog Agent. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;FleetTracersResponse&gt;
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
  public ApiResponse<FleetTracersResponse> listFleetAgentTracersWithHttpInfo(String agentKey, ListFleetAgentTracersOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listFleetAgentTracers";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'agentKey' is set
    if (agentKey == null) {
      throw new ApiException(400, "Missing the required parameter 'agentKey' when calling listFleetAgentTracers");
    }
    Long pageNumber = parameters.pageNumber;
    Long pageSize = parameters.pageSize;
    String sortAttribute = parameters.sortAttribute;
    Boolean sortDescending = parameters.sortDescending;
    // create path and map variables
    String localVarPath = "/api/unstable/fleet/agents/{agent_key}/tracers"
      .replaceAll("\\{" + "agent_key" + "\\}", apiClient.escapeString(agentKey.toString()));

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page_number", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page_size", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort_attribute", sortAttribute));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort_descending", sortDescending));

    Invocation.Builder builder = apiClient.createBuilder("v2.FleetAutomationApi.listFleetAgentTracers", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<FleetTracersResponse>() {});
  }

  /**
   * List tracers for a specific agent.
   *
   * See {@link #listFleetAgentTracersWithHttpInfo}.
   *
   * @param agentKey The unique identifier (agent key) for the Datadog Agent. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;FleetTracersResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<FleetTracersResponse>> listFleetAgentTracersWithHttpInfoAsync(String agentKey, ListFleetAgentTracersOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listFleetAgentTracers";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<FleetTracersResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'agentKey' is set
    if (agentKey == null) {
        CompletableFuture<ApiResponse<FleetTracersResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'agentKey' when calling listFleetAgentTracers"));
        return result;
    }
    Long pageNumber = parameters.pageNumber;
    Long pageSize = parameters.pageSize;
    String sortAttribute = parameters.sortAttribute;
    Boolean sortDescending = parameters.sortDescending;
    // create path and map variables
    String localVarPath = "/api/unstable/fleet/agents/{agent_key}/tracers"
      .replaceAll("\\{" + "agent_key" + "\\}", apiClient.escapeString(agentKey.toString()));

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page_number", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page_size", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort_attribute", sortAttribute));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort_descending", sortDescending));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.FleetAutomationApi.listFleetAgentTracers", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<FleetTracersResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<FleetTracersResponse>() {});
  }

  /**
 * List available Datadog Agent versions.
 *
 * See {@link #listFleetAgentVersionsV2WithHttpInfo}.
 *
 * @return FleetAgentVersionsV2Response
 * @throws ApiException if fails to make API call
 */
  public FleetAgentVersionsV2Response  listFleetAgentVersionsV2() throws ApiException {
    return listFleetAgentVersionsV2WithHttpInfo().getData();
  }

  /**
 * List available Datadog Agent versions.
 *
 * See {@link #listFleetAgentVersionsV2WithHttpInfoAsync}.
 *
 * @return CompletableFuture&lt;FleetAgentVersionsV2Response&gt;
 */
  public CompletableFuture<FleetAgentVersionsV2Response>listFleetAgentVersionsV2Async() {
    return listFleetAgentVersionsV2WithHttpInfoAsync().thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Retrieve the list of Datadog Agent versions available for deployment.</p>
   * <p>Returns <code>200</code> with an empty <code>data</code> array if the Agent package exists in the catalog
   * but has no available versions, and <code>404</code> only if the Agent package itself is absent
   * from the catalog.</p>
   *
   * @return ApiResponse&lt;FleetAgentVersionsV2Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<FleetAgentVersionsV2Response> listFleetAgentVersionsV2WithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/fleet/agent_versions";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.FleetAutomationApi.listFleetAgentVersionsV2", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<FleetAgentVersionsV2Response>() {});
  }

  /**
   * List available Datadog Agent versions.
   *
   * See {@link #listFleetAgentVersionsV2WithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;FleetAgentVersionsV2Response&gt;&gt;
   */
  public CompletableFuture<ApiResponse<FleetAgentVersionsV2Response>> listFleetAgentVersionsV2WithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/fleet/agent_versions";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.FleetAutomationApi.listFleetAgentVersionsV2", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<FleetAgentVersionsV2Response>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<FleetAgentVersionsV2Response>() {});
  }

  /**
   * Manage optional parameters to listFleetDeploymentsV2.
   */
  public static class ListFleetDeploymentsV2OptionalParameters {
    private Long pageSize;
    private Long pageNumber;
    private String sort;
    private Boolean ascending;
    private String filter;

    /**
     * Set pageSize.
     * @param pageSize Number of deployments to return per page. Maximum value is 100. (optional, default to 10)
     * @return ListFleetDeploymentsV2OptionalParameters
     */
    public ListFleetDeploymentsV2OptionalParameters pageSize(Long pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set pageNumber.
     * @param pageNumber Page number for pagination, starting at 0. (optional, default to 0)
     * @return ListFleetDeploymentsV2OptionalParameters
     */
    public ListFleetDeploymentsV2OptionalParameters pageNumber(Long pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set sort.
     * @param sort Field to sort results by (for example, <code>start_date</code>). Must be a supported field name; unsupported values return a 400 error. (optional)
     * @return ListFleetDeploymentsV2OptionalParameters
     */
    public ListFleetDeploymentsV2OptionalParameters sort(String sort) {
      this.sort = sort;
      return this;
    }

    /**
     * Set ascending.
     * @param ascending Set to <code>true</code> to sort in ascending order. This setting has no effect unless <code>sort</code> is also set. Defaults to descending order. (optional)
     * @return ListFleetDeploymentsV2OptionalParameters
     */
    public ListFleetDeploymentsV2OptionalParameters ascending(Boolean ascending) {
      this.ascending = ascending;
      return this;
    }

    /**
     * Set filter.
     * @param filter Query used to filter deployments. Uses the Datadog query syntax. Filtering on an unsupported field returns a 400 error. For example: - <code>status:failed</code> or <code>status:done_with_errors</code>: deployments that need investigation. - <code>status:running</code>: deployments currently in flight. - <code>update_type:update_package</code> or <code>update_type:update_config_operations</code>: deployments of a given type. (optional)
     * @return ListFleetDeploymentsV2OptionalParameters
     */
    public ListFleetDeploymentsV2OptionalParameters filter(String filter) {
      this.filter = filter;
      return this;
    }
  }

  /**
 * List all deployments.
 *
 * See {@link #listFleetDeploymentsV2WithHttpInfo}.
 *
 * @return FleetDeploymentsV2Response
 * @throws ApiException if fails to make API call
 */
  public FleetDeploymentsV2Response listFleetDeploymentsV2 () throws ApiException {
    return listFleetDeploymentsV2WithHttpInfo(new ListFleetDeploymentsV2OptionalParameters()).getData();
  }

  /**
 * List all deployments.
 *
 * See {@link #listFleetDeploymentsV2WithHttpInfoAsync}.
 *
 * @return CompletableFuture&lt;FleetDeploymentsV2Response&gt;
 */
  public CompletableFuture<FleetDeploymentsV2Response>listFleetDeploymentsV2Async() {
    return listFleetDeploymentsV2WithHttpInfoAsync(new ListFleetDeploymentsV2OptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * List all deployments.
 *
 * See {@link #listFleetDeploymentsV2WithHttpInfo}.
 *
 * @param parameters Optional parameters for the request.
 * @return FleetDeploymentsV2Response
 * @throws ApiException if fails to make API call
 */
  public FleetDeploymentsV2Response listFleetDeploymentsV2(ListFleetDeploymentsV2OptionalParameters parameters) throws ApiException {
    return listFleetDeploymentsV2WithHttpInfo(parameters).getData();
  }

  /**
 * List all deployments.
 *
 * See {@link #listFleetDeploymentsV2WithHttpInfoAsync}.
 *
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;FleetDeploymentsV2Response&gt;
 */
  public CompletableFuture<FleetDeploymentsV2Response>listFleetDeploymentsV2Async(ListFleetDeploymentsV2OptionalParameters parameters) {
    return listFleetDeploymentsV2WithHttpInfoAsync(parameters).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Retrieve a paginated list of all deployments for fleet automation.</p>
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;FleetDeploymentsV2Response&gt;
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
  public ApiResponse<FleetDeploymentsV2Response> listFleetDeploymentsV2WithHttpInfo(ListFleetDeploymentsV2OptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    Long pageSize = parameters.pageSize;
    Long pageNumber = parameters.pageNumber;
    String sort = parameters.sort;
    Boolean ascending = parameters.ascending;
    String filter = parameters.filter;
    // create path and map variables
    String localVarPath = "/api/v2/fleet/deployments";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page_size", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page_number", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ascending", ascending));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));

    Invocation.Builder builder = apiClient.createBuilder("v2.FleetAutomationApi.listFleetDeploymentsV2", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<FleetDeploymentsV2Response>() {});
  }

  /**
   * List all deployments.
   *
   * See {@link #listFleetDeploymentsV2WithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;FleetDeploymentsV2Response&gt;&gt;
   */
  public CompletableFuture<ApiResponse<FleetDeploymentsV2Response>> listFleetDeploymentsV2WithHttpInfoAsync(ListFleetDeploymentsV2OptionalParameters parameters) {
    Object localVarPostBody = null;
    Long pageSize = parameters.pageSize;
    Long pageNumber = parameters.pageNumber;
    String sort = parameters.sort;
    Boolean ascending = parameters.ascending;
    String filter = parameters.filter;
    // create path and map variables
    String localVarPath = "/api/v2/fleet/deployments";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page_size", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page_number", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ascending", ascending));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.FleetAutomationApi.listFleetDeploymentsV2", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<FleetDeploymentsV2Response>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<FleetDeploymentsV2Response>() {});
  }

  /**
 * List all schedules.
 *
 * See {@link #listFleetSchedulesV2WithHttpInfo}.
 *
 * @return FleetSchedulesV2Response
 * @throws ApiException if fails to make API call
 */
  public FleetSchedulesV2Response  listFleetSchedulesV2() throws ApiException {
    return listFleetSchedulesV2WithHttpInfo().getData();
  }

  /**
 * List all schedules.
 *
 * See {@link #listFleetSchedulesV2WithHttpInfoAsync}.
 *
 * @return CompletableFuture&lt;FleetSchedulesV2Response&gt;
 */
  public CompletableFuture<FleetSchedulesV2Response>listFleetSchedulesV2Async() {
    return listFleetSchedulesV2WithHttpInfoAsync().thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Retrieve all upgrade schedules for the organization.</p>
   * <p>Schedules automate package upgrades by defining maintenance windows and recurrence rules.
   * Each schedule automatically creates deployments based on its configuration.</p>
   *
   * @return ApiResponse&lt;FleetSchedulesV2Response&gt;
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
  public ApiResponse<FleetSchedulesV2Response> listFleetSchedulesV2WithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/fleet/schedules";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.FleetAutomationApi.listFleetSchedulesV2", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<FleetSchedulesV2Response>() {});
  }

  /**
   * List all schedules.
   *
   * See {@link #listFleetSchedulesV2WithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;FleetSchedulesV2Response&gt;&gt;
   */
  public CompletableFuture<ApiResponse<FleetSchedulesV2Response>> listFleetSchedulesV2WithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/fleet/schedules";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.FleetAutomationApi.listFleetSchedulesV2", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<FleetSchedulesV2Response>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<FleetSchedulesV2Response>() {});
  }

  /**
   * Manage optional parameters to listFleetTracers.
   */
  public static class ListFleetTracersOptionalParameters {
    private Long pageNumber;
    private Long pageSize;
    private String sortAttribute;
    private Boolean sortDescending;
    private String filter;

    /**
     * Set pageNumber.
     * @param pageNumber Page number for pagination (starts at 0). (optional, default to 0)
     * @return ListFleetTracersOptionalParameters
     */
    public ListFleetTracersOptionalParameters pageNumber(Long pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set pageSize.
     * @param pageSize Number of results per page (must be greater than 0 and less than or equal to 100). (optional, default to 10)
     * @return ListFleetTracersOptionalParameters
     */
    public ListFleetTracersOptionalParameters pageSize(Long pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set sortAttribute.
     * @param sortAttribute Attribute to sort by. (optional)
     * @return ListFleetTracersOptionalParameters
     */
    public ListFleetTracersOptionalParameters sortAttribute(String sortAttribute) {
      this.sortAttribute = sortAttribute;
      return this;
    }

    /**
     * Set sortDescending.
     * @param sortDescending Sort order (true for descending, false for ascending). (optional, default to true)
     * @return ListFleetTracersOptionalParameters
     */
    public ListFleetTracersOptionalParameters sortDescending(Boolean sortDescending) {
      this.sortDescending = sortDescending;
      return this;
    }

    /**
     * Set filter.
     * @param filter Filter string for narrowing down tracer results. (optional)
     * @return ListFleetTracersOptionalParameters
     */
    public ListFleetTracersOptionalParameters filter(String filter) {
      this.filter = filter;
      return this;
    }
  }

  /**
 * List all fleet tracers.
 *
 * See {@link #listFleetTracersWithHttpInfo}.
 *
 * @return FleetTracersResponse
 * @throws ApiException if fails to make API call
 */
  public FleetTracersResponse listFleetTracers () throws ApiException {
    return listFleetTracersWithHttpInfo(new ListFleetTracersOptionalParameters()).getData();
  }

  /**
 * List all fleet tracers.
 *
 * See {@link #listFleetTracersWithHttpInfoAsync}.
 *
 * @return CompletableFuture&lt;FleetTracersResponse&gt;
 */
  public CompletableFuture<FleetTracersResponse>listFleetTracersAsync() {
    return listFleetTracersWithHttpInfoAsync(new ListFleetTracersOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * List all fleet tracers.
 *
 * See {@link #listFleetTracersWithHttpInfo}.
 *
 * @param parameters Optional parameters for the request.
 * @return FleetTracersResponse
 * @throws ApiException if fails to make API call
 */
  public FleetTracersResponse listFleetTracers(ListFleetTracersOptionalParameters parameters) throws ApiException {
    return listFleetTracersWithHttpInfo(parameters).getData();
  }

  /**
 * List all fleet tracers.
 *
 * See {@link #listFleetTracersWithHttpInfoAsync}.
 *
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;FleetTracersResponse&gt;
 */
  public CompletableFuture<FleetTracersResponse>listFleetTracersAsync(ListFleetTracersOptionalParameters parameters) {
    return listFleetTracersWithHttpInfoAsync(parameters).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Retrieve a paginated list of all fleet tracers.</p>
   * <p>This endpoint returns telemetry-derived service names from the SDK telemetry pipeline.
   * These names may differ from span-derived names in APM and are useful for querying
   * service library configurations.
   * Use the <code>page_number</code> and <code>page_size</code> query parameters to paginate through results.</p>
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;FleetTracersResponse&gt;
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
  public ApiResponse<FleetTracersResponse> listFleetTracersWithHttpInfo(ListFleetTracersOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listFleetTracers";
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
    String filter = parameters.filter;
    // create path and map variables
    String localVarPath = "/api/unstable/fleet/tracers";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page_number", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page_size", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort_attribute", sortAttribute));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort_descending", sortDescending));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));

    Invocation.Builder builder = apiClient.createBuilder("v2.FleetAutomationApi.listFleetTracers", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<FleetTracersResponse>() {});
  }

  /**
   * List all fleet tracers.
   *
   * See {@link #listFleetTracersWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;FleetTracersResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<FleetTracersResponse>> listFleetTracersWithHttpInfoAsync(ListFleetTracersOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listFleetTracers";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<FleetTracersResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    Long pageNumber = parameters.pageNumber;
    Long pageSize = parameters.pageSize;
    String sortAttribute = parameters.sortAttribute;
    Boolean sortDescending = parameters.sortDescending;
    String filter = parameters.filter;
    // create path and map variables
    String localVarPath = "/api/unstable/fleet/tracers";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page_number", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page_size", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort_attribute", sortAttribute));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort_descending", sortDescending));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.FleetAutomationApi.listFleetTracers", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<FleetTracersResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<FleetTracersResponse>() {});
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