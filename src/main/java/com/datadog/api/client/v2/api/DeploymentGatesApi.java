
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
import com.datadog.api.client.v2.model.DeploymentGatesListResponse;
import com.datadog.api.client.v2.model.DeploymentGateResponse;
import com.datadog.api.client.v2.model.CreateDeploymentGateParams;
import com.datadog.api.client.v2.model.DeploymentGateRulesResponse;
import com.datadog.api.client.v2.model.DeploymentRuleResponse;
import com.datadog.api.client.v2.model.CreateDeploymentRuleParams;
import com.datadog.api.client.v2.model.UpdateDeploymentRuleParams;
import com.datadog.api.client.v2.model.UpdateDeploymentGateParams;
import com.datadog.api.client.v2.model.DeploymentGatesEvaluationResponse;
import com.datadog.api.client.v2.model.DeploymentGatesEvaluationRequest;
import com.datadog.api.client.v2.model.DeploymentGatesEvaluationResultResponse;


@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DeploymentGatesApi {
  private ApiClient apiClient;
  public DeploymentGatesApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public DeploymentGatesApi(ApiClient apiClient) {
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
 * Create deployment gate.
 *
 * See {@link #createDeploymentGateWithHttpInfo}.
 *
 * @param body  (required)
 * @return DeploymentGateResponse
 * @throws ApiException if fails to make API call
 */
  public DeploymentGateResponse  createDeploymentGate(CreateDeploymentGateParams body) throws ApiException {
    return createDeploymentGateWithHttpInfo(body).getData();
  }

  /**
 * Create deployment gate.
 *
 * See {@link #createDeploymentGateWithHttpInfoAsync}.
 *
 * @param body  (required)
 * @return CompletableFuture&lt;DeploymentGateResponse&gt;
 */
  public CompletableFuture<DeploymentGateResponse>createDeploymentGateAsync(CreateDeploymentGateParams body) {
    return createDeploymentGateWithHttpInfoAsync(body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Endpoint to create a deployment gate.</p>
   *
   * @param body  (required)
   * @return ApiResponse&lt;DeploymentGateResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad request. </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<DeploymentGateResponse> createDeploymentGateWithHttpInfo(CreateDeploymentGateParams body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createDeploymentGate";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createDeploymentGate");
    }
    // create path and map variables
    String localVarPath = "/api/v2/deployment_gates";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.DeploymentGatesApi.createDeploymentGate", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<DeploymentGateResponse>() {});
  }

  /**
   * Create deployment gate.
   *
   * See {@link #createDeploymentGateWithHttpInfo}.
   *
   * @param body  (required)
   * @return CompletableFuture&lt;ApiResponse&lt;DeploymentGateResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<DeploymentGateResponse>> createDeploymentGateWithHttpInfoAsync(CreateDeploymentGateParams body) {
    // Check if unstable operation is enabled
    String operationId = "createDeploymentGate";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<DeploymentGateResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<DeploymentGateResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling createDeploymentGate"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/deployment_gates";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.DeploymentGatesApi.createDeploymentGate", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<DeploymentGateResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<DeploymentGateResponse>() {});
  }

  /**
 * Create deployment rule.
 *
 * See {@link #createDeploymentRuleWithHttpInfo}.
 *
 * @param gateId The ID of the deployment gate. (required)
 * @param body  (required)
 * @return DeploymentRuleResponse
 * @throws ApiException if fails to make API call
 */
  public DeploymentRuleResponse  createDeploymentRule(String gateId, CreateDeploymentRuleParams body) throws ApiException {
    return createDeploymentRuleWithHttpInfo(gateId, body).getData();
  }

  /**
 * Create deployment rule.
 *
 * See {@link #createDeploymentRuleWithHttpInfoAsync}.
 *
 * @param gateId The ID of the deployment gate. (required)
 * @param body  (required)
 * @return CompletableFuture&lt;DeploymentRuleResponse&gt;
 */
  public CompletableFuture<DeploymentRuleResponse>createDeploymentRuleAsync(String gateId, CreateDeploymentRuleParams body) {
    return createDeploymentRuleWithHttpInfoAsync(gateId, body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Endpoint to create a deployment rule. A gate for the rule must already exist.</p>
   *
   * @param gateId The ID of the deployment gate. (required)
   * @param body  (required)
   * @return ApiResponse&lt;DeploymentRuleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad request. </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<DeploymentRuleResponse> createDeploymentRuleWithHttpInfo(String gateId, CreateDeploymentRuleParams body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createDeploymentRule";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'gateId' is set
    if (gateId == null) {
      throw new ApiException(400, "Missing the required parameter 'gateId' when calling createDeploymentRule");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createDeploymentRule");
    }
    // create path and map variables
    String localVarPath = "/api/v2/deployment_gates/{gate_id}/rules"
      .replaceAll("\\{" + "gate_id" + "\\}", apiClient.escapeString(gateId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.DeploymentGatesApi.createDeploymentRule", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<DeploymentRuleResponse>() {});
  }

  /**
   * Create deployment rule.
   *
   * See {@link #createDeploymentRuleWithHttpInfo}.
   *
   * @param gateId The ID of the deployment gate. (required)
   * @param body  (required)
   * @return CompletableFuture&lt;ApiResponse&lt;DeploymentRuleResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<DeploymentRuleResponse>> createDeploymentRuleWithHttpInfoAsync(String gateId, CreateDeploymentRuleParams body) {
    // Check if unstable operation is enabled
    String operationId = "createDeploymentRule";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<DeploymentRuleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'gateId' is set
    if (gateId == null) {
        CompletableFuture<ApiResponse<DeploymentRuleResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'gateId' when calling createDeploymentRule"));
        return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<DeploymentRuleResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling createDeploymentRule"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/deployment_gates/{gate_id}/rules"
      .replaceAll("\\{" + "gate_id" + "\\}", apiClient.escapeString(gateId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.DeploymentGatesApi.createDeploymentRule", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<DeploymentRuleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<DeploymentRuleResponse>() {});
  }

  /**
 * Delete deployment gate.
 *
 * See {@link #deleteDeploymentGateWithHttpInfo}.
 *
 * @param id The ID of the deployment gate. (required)
 * @throws ApiException if fails to make API call
 */
  public  void  deleteDeploymentGate(String id) throws ApiException {
    deleteDeploymentGateWithHttpInfo(id);
  }

  /**
 * Delete deployment gate.
 *
 * See {@link #deleteDeploymentGateWithHttpInfoAsync}.
 *
 * @param id The ID of the deployment gate. (required)
 * @return CompletableFuture
 */
  public CompletableFuture<Void>deleteDeploymentGateAsync(String id) {
    return deleteDeploymentGateWithHttpInfoAsync(id).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Endpoint to delete a deployment gate. Rules associated with the gate are also deleted.</p>
   *
   * @param id The ID of the deployment gate. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad request. </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Deployment gate not found. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteDeploymentGateWithHttpInfo(String id) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteDeploymentGate";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteDeploymentGate");
    }
    // create path and map variables
    String localVarPath = "/api/v2/deployment_gates/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.DeploymentGatesApi.deleteDeploymentGate", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("DELETE", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
   * Delete deployment gate.
   *
   * See {@link #deleteDeploymentGateWithHttpInfo}.
   *
   * @param id The ID of the deployment gate. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteDeploymentGateWithHttpInfoAsync(String id) {
    // Check if unstable operation is enabled
    String operationId = "deleteDeploymentGate";
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
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'id' when calling deleteDeploymentGate"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/deployment_gates/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.DeploymentGatesApi.deleteDeploymentGate", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("DELETE", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
 * Delete deployment rule.
 *
 * See {@link #deleteDeploymentRuleWithHttpInfo}.
 *
 * @param gateId The ID of the deployment gate. (required)
 * @param id The ID of the deployment rule. (required)
 * @throws ApiException if fails to make API call
 */
  public  void  deleteDeploymentRule(String gateId, String id) throws ApiException {
    deleteDeploymentRuleWithHttpInfo(gateId, id);
  }

  /**
 * Delete deployment rule.
 *
 * See {@link #deleteDeploymentRuleWithHttpInfoAsync}.
 *
 * @param gateId The ID of the deployment gate. (required)
 * @param id The ID of the deployment rule. (required)
 * @return CompletableFuture
 */
  public CompletableFuture<Void>deleteDeploymentRuleAsync(String gateId, String id) {
    return deleteDeploymentRuleWithHttpInfoAsync(gateId, id).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Endpoint to delete a deployment rule.</p>
   *
   * @param gateId The ID of the deployment gate. (required)
   * @param id The ID of the deployment rule. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad request. </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Deployment gate not found. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteDeploymentRuleWithHttpInfo(String gateId, String id) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteDeploymentRule";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'gateId' is set
    if (gateId == null) {
      throw new ApiException(400, "Missing the required parameter 'gateId' when calling deleteDeploymentRule");
    }

    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteDeploymentRule");
    }
    // create path and map variables
    String localVarPath = "/api/v2/deployment_gates/{gate_id}/rules/{id}"
      .replaceAll("\\{" + "gate_id" + "\\}", apiClient.escapeString(gateId.toString()))
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.DeploymentGatesApi.deleteDeploymentRule", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("DELETE", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
   * Delete deployment rule.
   *
   * See {@link #deleteDeploymentRuleWithHttpInfo}.
   *
   * @param gateId The ID of the deployment gate. (required)
   * @param id The ID of the deployment rule. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteDeploymentRuleWithHttpInfoAsync(String gateId, String id) {
    // Check if unstable operation is enabled
    String operationId = "deleteDeploymentRule";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'gateId' is set
    if (gateId == null) {
        CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'gateId' when calling deleteDeploymentRule"));
        return result;
    }

    // verify the required parameter 'id' is set
    if (id == null) {
        CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'id' when calling deleteDeploymentRule"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/deployment_gates/{gate_id}/rules/{id}"
      .replaceAll("\\{" + "gate_id" + "\\}", apiClient.escapeString(gateId.toString()))
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.DeploymentGatesApi.deleteDeploymentRule", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("DELETE", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
 * Get deployment gate.
 *
 * See {@link #getDeploymentGateWithHttpInfo}.
 *
 * @param id The ID of the deployment gate. (required)
 * @return DeploymentGateResponse
 * @throws ApiException if fails to make API call
 */
  public DeploymentGateResponse  getDeploymentGate(String id) throws ApiException {
    return getDeploymentGateWithHttpInfo(id).getData();
  }

  /**
 * Get deployment gate.
 *
 * See {@link #getDeploymentGateWithHttpInfoAsync}.
 *
 * @param id The ID of the deployment gate. (required)
 * @return CompletableFuture&lt;DeploymentGateResponse&gt;
 */
  public CompletableFuture<DeploymentGateResponse>getDeploymentGateAsync(String id) {
    return getDeploymentGateWithHttpInfoAsync(id).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Endpoint to get a deployment gate.</p>
   *
   * @param id The ID of the deployment gate. (required)
   * @return ApiResponse&lt;DeploymentGateResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad request. </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Deployment gate not found. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<DeploymentGateResponse> getDeploymentGateWithHttpInfo(String id) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getDeploymentGate";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getDeploymentGate");
    }
    // create path and map variables
    String localVarPath = "/api/v2/deployment_gates/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.DeploymentGatesApi.getDeploymentGate", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<DeploymentGateResponse>() {});
  }

  /**
   * Get deployment gate.
   *
   * See {@link #getDeploymentGateWithHttpInfo}.
   *
   * @param id The ID of the deployment gate. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;DeploymentGateResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<DeploymentGateResponse>> getDeploymentGateWithHttpInfoAsync(String id) {
    // Check if unstable operation is enabled
    String operationId = "getDeploymentGate";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<DeploymentGateResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
        CompletableFuture<ApiResponse<DeploymentGateResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'id' when calling getDeploymentGate"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/deployment_gates/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.DeploymentGatesApi.getDeploymentGate", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<DeploymentGateResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<DeploymentGateResponse>() {});
  }

  /**
 * Get rules for a deployment gate.
 *
 * See {@link #getDeploymentGateRulesWithHttpInfo}.
 *
 * @param gateId The ID of the deployment gate. (required)
 * @return DeploymentGateRulesResponse
 * @throws ApiException if fails to make API call
 */
  public DeploymentGateRulesResponse  getDeploymentGateRules(String gateId) throws ApiException {
    return getDeploymentGateRulesWithHttpInfo(gateId).getData();
  }

  /**
 * Get rules for a deployment gate.
 *
 * See {@link #getDeploymentGateRulesWithHttpInfoAsync}.
 *
 * @param gateId The ID of the deployment gate. (required)
 * @return CompletableFuture&lt;DeploymentGateRulesResponse&gt;
 */
  public CompletableFuture<DeploymentGateRulesResponse>getDeploymentGateRulesAsync(String gateId) {
    return getDeploymentGateRulesWithHttpInfoAsync(gateId).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Endpoint to get rules for a deployment gate.</p>
   *
   * @param gateId The ID of the deployment gate. (required)
   * @return ApiResponse&lt;DeploymentGateRulesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad request. </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<DeploymentGateRulesResponse> getDeploymentGateRulesWithHttpInfo(String gateId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getDeploymentGateRules";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'gateId' is set
    if (gateId == null) {
      throw new ApiException(400, "Missing the required parameter 'gateId' when calling getDeploymentGateRules");
    }
    // create path and map variables
    String localVarPath = "/api/v2/deployment_gates/{gate_id}/rules"
      .replaceAll("\\{" + "gate_id" + "\\}", apiClient.escapeString(gateId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.DeploymentGatesApi.getDeploymentGateRules", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<DeploymentGateRulesResponse>() {});
  }

  /**
   * Get rules for a deployment gate.
   *
   * See {@link #getDeploymentGateRulesWithHttpInfo}.
   *
   * @param gateId The ID of the deployment gate. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;DeploymentGateRulesResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<DeploymentGateRulesResponse>> getDeploymentGateRulesWithHttpInfoAsync(String gateId) {
    // Check if unstable operation is enabled
    String operationId = "getDeploymentGateRules";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<DeploymentGateRulesResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'gateId' is set
    if (gateId == null) {
        CompletableFuture<ApiResponse<DeploymentGateRulesResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'gateId' when calling getDeploymentGateRules"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/deployment_gates/{gate_id}/rules"
      .replaceAll("\\{" + "gate_id" + "\\}", apiClient.escapeString(gateId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.DeploymentGatesApi.getDeploymentGateRules", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<DeploymentGateRulesResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<DeploymentGateRulesResponse>() {});
  }

  /**
 * Get a deployment gate evaluation result.
 *
 * See {@link #getDeploymentGatesEvaluationResultWithHttpInfo}.
 *
 * @param id The evaluation ID returned by the trigger endpoint. (required)
 * @return DeploymentGatesEvaluationResultResponse
 * @throws ApiException if fails to make API call
 */
  public DeploymentGatesEvaluationResultResponse  getDeploymentGatesEvaluationResult(UUID id) throws ApiException {
    return getDeploymentGatesEvaluationResultWithHttpInfo(id).getData();
  }

  /**
 * Get a deployment gate evaluation result.
 *
 * See {@link #getDeploymentGatesEvaluationResultWithHttpInfoAsync}.
 *
 * @param id The evaluation ID returned by the trigger endpoint. (required)
 * @return CompletableFuture&lt;DeploymentGatesEvaluationResultResponse&gt;
 */
  public CompletableFuture<DeploymentGatesEvaluationResultResponse>getDeploymentGatesEvaluationResultAsync(UUID id) {
    return getDeploymentGatesEvaluationResultWithHttpInfoAsync(id).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Retrieves the result of a deployment gate evaluation by its evaluation ID.
   * If the evaluation is still in progress, <code>data.attributes.gate_status</code> will be <code>in_progress</code>;
   * continue polling until it returns <code>pass</code> or <code>fail</code>.
   * Polling every 10-20 seconds is recommended.
   * The endpoint may return a 404 if called too soon after triggering; retry after a few seconds.</p>
   *
   * @param id The evaluation ID returned by the trigger endpoint. (required)
   * @return ApiResponse&lt;DeploymentGatesEvaluationResultResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad request. </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Deployment gate not found. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<DeploymentGatesEvaluationResultResponse> getDeploymentGatesEvaluationResultWithHttpInfo(UUID id) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getDeploymentGatesEvaluationResult";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getDeploymentGatesEvaluationResult");
    }
    // create path and map variables
    String localVarPath = "/api/v2/deployments/gates/evaluation/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.DeploymentGatesApi.getDeploymentGatesEvaluationResult", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<DeploymentGatesEvaluationResultResponse>() {});
  }

  /**
   * Get a deployment gate evaluation result.
   *
   * See {@link #getDeploymentGatesEvaluationResultWithHttpInfo}.
   *
   * @param id The evaluation ID returned by the trigger endpoint. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;DeploymentGatesEvaluationResultResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<DeploymentGatesEvaluationResultResponse>> getDeploymentGatesEvaluationResultWithHttpInfoAsync(UUID id) {
    // Check if unstable operation is enabled
    String operationId = "getDeploymentGatesEvaluationResult";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<DeploymentGatesEvaluationResultResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
        CompletableFuture<ApiResponse<DeploymentGatesEvaluationResultResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'id' when calling getDeploymentGatesEvaluationResult"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/deployments/gates/evaluation/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.DeploymentGatesApi.getDeploymentGatesEvaluationResult", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<DeploymentGatesEvaluationResultResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<DeploymentGatesEvaluationResultResponse>() {});
  }

  /**
 * Get deployment rule.
 *
 * See {@link #getDeploymentRuleWithHttpInfo}.
 *
 * @param gateId The ID of the deployment gate. (required)
 * @param id The ID of the deployment rule. (required)
 * @return DeploymentRuleResponse
 * @throws ApiException if fails to make API call
 */
  public DeploymentRuleResponse  getDeploymentRule(String gateId, String id) throws ApiException {
    return getDeploymentRuleWithHttpInfo(gateId, id).getData();
  }

  /**
 * Get deployment rule.
 *
 * See {@link #getDeploymentRuleWithHttpInfoAsync}.
 *
 * @param gateId The ID of the deployment gate. (required)
 * @param id The ID of the deployment rule. (required)
 * @return CompletableFuture&lt;DeploymentRuleResponse&gt;
 */
  public CompletableFuture<DeploymentRuleResponse>getDeploymentRuleAsync(String gateId, String id) {
    return getDeploymentRuleWithHttpInfoAsync(gateId, id).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Endpoint to get a deployment rule.</p>
   *
   * @param gateId The ID of the deployment gate. (required)
   * @param id The ID of the deployment rule. (required)
   * @return ApiResponse&lt;DeploymentRuleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad request. </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Deployment rule not found. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<DeploymentRuleResponse> getDeploymentRuleWithHttpInfo(String gateId, String id) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getDeploymentRule";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'gateId' is set
    if (gateId == null) {
      throw new ApiException(400, "Missing the required parameter 'gateId' when calling getDeploymentRule");
    }

    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getDeploymentRule");
    }
    // create path and map variables
    String localVarPath = "/api/v2/deployment_gates/{gate_id}/rules/{id}"
      .replaceAll("\\{" + "gate_id" + "\\}", apiClient.escapeString(gateId.toString()))
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.DeploymentGatesApi.getDeploymentRule", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<DeploymentRuleResponse>() {});
  }

  /**
   * Get deployment rule.
   *
   * See {@link #getDeploymentRuleWithHttpInfo}.
   *
   * @param gateId The ID of the deployment gate. (required)
   * @param id The ID of the deployment rule. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;DeploymentRuleResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<DeploymentRuleResponse>> getDeploymentRuleWithHttpInfoAsync(String gateId, String id) {
    // Check if unstable operation is enabled
    String operationId = "getDeploymentRule";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<DeploymentRuleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'gateId' is set
    if (gateId == null) {
        CompletableFuture<ApiResponse<DeploymentRuleResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'gateId' when calling getDeploymentRule"));
        return result;
    }

    // verify the required parameter 'id' is set
    if (id == null) {
        CompletableFuture<ApiResponse<DeploymentRuleResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'id' when calling getDeploymentRule"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/deployment_gates/{gate_id}/rules/{id}"
      .replaceAll("\\{" + "gate_id" + "\\}", apiClient.escapeString(gateId.toString()))
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.DeploymentGatesApi.getDeploymentRule", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<DeploymentRuleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<DeploymentRuleResponse>() {});
  }

  /**
   * Manage optional parameters to listDeploymentGates.
   */
  public static class ListDeploymentGatesOptionalParameters {
    private String pageCursor;
    private Long pageSize;

    /**
     * Set pageCursor.
     * @param pageCursor Cursor for pagination. Use the <code>meta.page.next_cursor</code> value from the previous response. (optional)
     * @return ListDeploymentGatesOptionalParameters
     */
    public ListDeploymentGatesOptionalParameters pageCursor(String pageCursor) {
      this.pageCursor = pageCursor;
      return this;
    }

    /**
     * Set pageSize.
     * @param pageSize Number of results per page. Defaults to 50. Must be between 1 and 1000. (optional, default to 50)
     * @return ListDeploymentGatesOptionalParameters
     */
    public ListDeploymentGatesOptionalParameters pageSize(Long pageSize) {
      this.pageSize = pageSize;
      return this;
    }
  }

  /**
 * Get all deployment gates.
 *
 * See {@link #listDeploymentGatesWithHttpInfo}.
 *
 * @return DeploymentGatesListResponse
 * @throws ApiException if fails to make API call
 */
  public DeploymentGatesListResponse listDeploymentGates () throws ApiException {
    return listDeploymentGatesWithHttpInfo(new ListDeploymentGatesOptionalParameters()).getData();
  }

  /**
 * Get all deployment gates.
 *
 * See {@link #listDeploymentGatesWithHttpInfoAsync}.
 *
 * @return CompletableFuture&lt;DeploymentGatesListResponse&gt;
 */
  public CompletableFuture<DeploymentGatesListResponse>listDeploymentGatesAsync() {
    return listDeploymentGatesWithHttpInfoAsync(new ListDeploymentGatesOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * Get all deployment gates.
 *
 * See {@link #listDeploymentGatesWithHttpInfo}.
 *
 * @param parameters Optional parameters for the request.
 * @return DeploymentGatesListResponse
 * @throws ApiException if fails to make API call
 */
  public DeploymentGatesListResponse listDeploymentGates(ListDeploymentGatesOptionalParameters parameters) throws ApiException {
    return listDeploymentGatesWithHttpInfo(parameters).getData();
  }

  /**
 * Get all deployment gates.
 *
 * See {@link #listDeploymentGatesWithHttpInfoAsync}.
 *
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;DeploymentGatesListResponse&gt;
 */
  public CompletableFuture<DeploymentGatesListResponse>listDeploymentGatesAsync(ListDeploymentGatesOptionalParameters parameters) {
    return listDeploymentGatesWithHttpInfoAsync(parameters).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Returns a paginated list of all deployment gates for the organization.
   * Use <code>page[cursor]</code> and <code>page[size]</code> query parameters to paginate through results.</p>
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;DeploymentGatesListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad request. </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<DeploymentGatesListResponse> listDeploymentGatesWithHttpInfo(ListDeploymentGatesOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listDeploymentGates";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    String pageCursor = parameters.pageCursor;
    Long pageSize = parameters.pageSize;
    // create path and map variables
    String localVarPath = "/api/v2/deployment_gates";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[cursor]", pageCursor));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));

    Invocation.Builder builder = apiClient.createBuilder("v2.DeploymentGatesApi.listDeploymentGates", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<DeploymentGatesListResponse>() {});
  }

  /**
   * Get all deployment gates.
   *
   * See {@link #listDeploymentGatesWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;DeploymentGatesListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<DeploymentGatesListResponse>> listDeploymentGatesWithHttpInfoAsync(ListDeploymentGatesOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listDeploymentGates";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<DeploymentGatesListResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    String pageCursor = parameters.pageCursor;
    Long pageSize = parameters.pageSize;
    // create path and map variables
    String localVarPath = "/api/v2/deployment_gates";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[cursor]", pageCursor));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.DeploymentGatesApi.listDeploymentGates", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<DeploymentGatesListResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<DeploymentGatesListResponse>() {});
  }

  /**
 * Trigger a deployment gate evaluation.
 *
 * See {@link #triggerDeploymentGatesEvaluationWithHttpInfo}.
 *
 * @param body  (required)
 * @return DeploymentGatesEvaluationResponse
 * @throws ApiException if fails to make API call
 */
  public DeploymentGatesEvaluationResponse  triggerDeploymentGatesEvaluation(DeploymentGatesEvaluationRequest body) throws ApiException {
    return triggerDeploymentGatesEvaluationWithHttpInfo(body).getData();
  }

  /**
 * Trigger a deployment gate evaluation.
 *
 * See {@link #triggerDeploymentGatesEvaluationWithHttpInfoAsync}.
 *
 * @param body  (required)
 * @return CompletableFuture&lt;DeploymentGatesEvaluationResponse&gt;
 */
  public CompletableFuture<DeploymentGatesEvaluationResponse>triggerDeploymentGatesEvaluationAsync(DeploymentGatesEvaluationRequest body) {
    return triggerDeploymentGatesEvaluationWithHttpInfoAsync(body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Triggers an asynchronous deployment gate evaluation for the given service and environment.
   * Returns an evaluation ID that can be used to poll for the result via the
   * <code>GET /api/v2/deployments/gates/evaluation/{id}</code> endpoint.</p>
   *
   * @param body  (required)
   * @return ApiResponse&lt;DeploymentGatesEvaluationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad request. </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Deployment gate not found. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<DeploymentGatesEvaluationResponse> triggerDeploymentGatesEvaluationWithHttpInfo(DeploymentGatesEvaluationRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "triggerDeploymentGatesEvaluation";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling triggerDeploymentGatesEvaluation");
    }
    // create path and map variables
    String localVarPath = "/api/v2/deployments/gates/evaluation";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.DeploymentGatesApi.triggerDeploymentGatesEvaluation", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<DeploymentGatesEvaluationResponse>() {});
  }

  /**
   * Trigger a deployment gate evaluation.
   *
   * See {@link #triggerDeploymentGatesEvaluationWithHttpInfo}.
   *
   * @param body  (required)
   * @return CompletableFuture&lt;ApiResponse&lt;DeploymentGatesEvaluationResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<DeploymentGatesEvaluationResponse>> triggerDeploymentGatesEvaluationWithHttpInfoAsync(DeploymentGatesEvaluationRequest body) {
    // Check if unstable operation is enabled
    String operationId = "triggerDeploymentGatesEvaluation";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<DeploymentGatesEvaluationResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<DeploymentGatesEvaluationResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling triggerDeploymentGatesEvaluation"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/deployments/gates/evaluation";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.DeploymentGatesApi.triggerDeploymentGatesEvaluation", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<DeploymentGatesEvaluationResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<DeploymentGatesEvaluationResponse>() {});
  }

  /**
 * Update deployment gate.
 *
 * See {@link #updateDeploymentGateWithHttpInfo}.
 *
 * @param id The ID of the deployment gate. (required)
 * @param body  (required)
 * @return DeploymentGateResponse
 * @throws ApiException if fails to make API call
 */
  public DeploymentGateResponse  updateDeploymentGate(String id, UpdateDeploymentGateParams body) throws ApiException {
    return updateDeploymentGateWithHttpInfo(id, body).getData();
  }

  /**
 * Update deployment gate.
 *
 * See {@link #updateDeploymentGateWithHttpInfoAsync}.
 *
 * @param id The ID of the deployment gate. (required)
 * @param body  (required)
 * @return CompletableFuture&lt;DeploymentGateResponse&gt;
 */
  public CompletableFuture<DeploymentGateResponse>updateDeploymentGateAsync(String id, UpdateDeploymentGateParams body) {
    return updateDeploymentGateWithHttpInfoAsync(id, body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Endpoint to update a deployment gate.</p>
   *
   * @param id The ID of the deployment gate. (required)
   * @param body  (required)
   * @return ApiResponse&lt;DeploymentGateResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad request. </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Deployment gate not found. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<DeploymentGateResponse> updateDeploymentGateWithHttpInfo(String id, UpdateDeploymentGateParams body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateDeploymentGate";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateDeploymentGate");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateDeploymentGate");
    }
    // create path and map variables
    String localVarPath = "/api/v2/deployment_gates/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.DeploymentGatesApi.updateDeploymentGate", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("PUT", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<DeploymentGateResponse>() {});
  }

  /**
   * Update deployment gate.
   *
   * See {@link #updateDeploymentGateWithHttpInfo}.
   *
   * @param id The ID of the deployment gate. (required)
   * @param body  (required)
   * @return CompletableFuture&lt;ApiResponse&lt;DeploymentGateResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<DeploymentGateResponse>> updateDeploymentGateWithHttpInfoAsync(String id, UpdateDeploymentGateParams body) {
    // Check if unstable operation is enabled
    String operationId = "updateDeploymentGate";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<DeploymentGateResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'id' is set
    if (id == null) {
        CompletableFuture<ApiResponse<DeploymentGateResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'id' when calling updateDeploymentGate"));
        return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<DeploymentGateResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling updateDeploymentGate"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/deployment_gates/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.DeploymentGatesApi.updateDeploymentGate", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<DeploymentGateResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("PUT", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<DeploymentGateResponse>() {});
  }

  /**
 * Update deployment rule.
 *
 * See {@link #updateDeploymentRuleWithHttpInfo}.
 *
 * @param gateId The ID of the deployment gate. (required)
 * @param id The ID of the deployment rule. (required)
 * @param body  (required)
 * @return DeploymentRuleResponse
 * @throws ApiException if fails to make API call
 */
  public DeploymentRuleResponse  updateDeploymentRule(String gateId, String id, UpdateDeploymentRuleParams body) throws ApiException {
    return updateDeploymentRuleWithHttpInfo(gateId, id, body).getData();
  }

  /**
 * Update deployment rule.
 *
 * See {@link #updateDeploymentRuleWithHttpInfoAsync}.
 *
 * @param gateId The ID of the deployment gate. (required)
 * @param id The ID of the deployment rule. (required)
 * @param body  (required)
 * @return CompletableFuture&lt;DeploymentRuleResponse&gt;
 */
  public CompletableFuture<DeploymentRuleResponse>updateDeploymentRuleAsync(String gateId, String id, UpdateDeploymentRuleParams body) {
    return updateDeploymentRuleWithHttpInfoAsync(gateId, id, body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Endpoint to update a deployment rule.</p>
   *
   * @param gateId The ID of the deployment gate. (required)
   * @param id The ID of the deployment rule. (required)
   * @param body  (required)
   * @return ApiResponse&lt;DeploymentRuleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad request. </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Deployment rule not found. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<DeploymentRuleResponse> updateDeploymentRuleWithHttpInfo(String gateId, String id, UpdateDeploymentRuleParams body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateDeploymentRule";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'gateId' is set
    if (gateId == null) {
      throw new ApiException(400, "Missing the required parameter 'gateId' when calling updateDeploymentRule");
    }

    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateDeploymentRule");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateDeploymentRule");
    }
    // create path and map variables
    String localVarPath = "/api/v2/deployment_gates/{gate_id}/rules/{id}"
      .replaceAll("\\{" + "gate_id" + "\\}", apiClient.escapeString(gateId.toString()))
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.DeploymentGatesApi.updateDeploymentRule", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("PUT", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<DeploymentRuleResponse>() {});
  }

  /**
   * Update deployment rule.
   *
   * See {@link #updateDeploymentRuleWithHttpInfo}.
   *
   * @param gateId The ID of the deployment gate. (required)
   * @param id The ID of the deployment rule. (required)
   * @param body  (required)
   * @return CompletableFuture&lt;ApiResponse&lt;DeploymentRuleResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<DeploymentRuleResponse>> updateDeploymentRuleWithHttpInfoAsync(String gateId, String id, UpdateDeploymentRuleParams body) {
    // Check if unstable operation is enabled
    String operationId = "updateDeploymentRule";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<DeploymentRuleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'gateId' is set
    if (gateId == null) {
        CompletableFuture<ApiResponse<DeploymentRuleResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'gateId' when calling updateDeploymentRule"));
        return result;
    }

    // verify the required parameter 'id' is set
    if (id == null) {
        CompletableFuture<ApiResponse<DeploymentRuleResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'id' when calling updateDeploymentRule"));
        return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<DeploymentRuleResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling updateDeploymentRule"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/deployment_gates/{gate_id}/rules/{id}"
      .replaceAll("\\{" + "gate_id" + "\\}", apiClient.escapeString(gateId.toString()))
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.DeploymentGatesApi.updateDeploymentRule", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<DeploymentRuleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("PUT", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<DeploymentRuleResponse>() {});
  }
}