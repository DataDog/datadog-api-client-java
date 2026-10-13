package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.PaginationIterable;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.CreateDeploymentGateParams;
import com.datadog.api.client.v2.model.CreateDeploymentRuleParams;
import com.datadog.api.client.v2.model.DeploymentGateEvaluationData;
import com.datadog.api.client.v2.model.DeploymentGateEvaluationsResponse;
import com.datadog.api.client.v2.model.DeploymentGateResponse;
import com.datadog.api.client.v2.model.DeploymentGateRuleEvaluationData;
import com.datadog.api.client.v2.model.DeploymentGateRuleEvaluationType;
import com.datadog.api.client.v2.model.DeploymentGateRuleEvaluationsResponse;
import com.datadog.api.client.v2.model.DeploymentGateRulesResponse;
import com.datadog.api.client.v2.model.DeploymentGatesEvaluationRequest;
import com.datadog.api.client.v2.model.DeploymentGatesEvaluationResponse;
import com.datadog.api.client.v2.model.DeploymentGatesEvaluationResultResponse;
import com.datadog.api.client.v2.model.DeploymentGatesEvaluationResultResponseAttributesGateStatus;
import com.datadog.api.client.v2.model.DeploymentGatesListResponse;
import com.datadog.api.client.v2.model.DeploymentRuleResponse;
import com.datadog.api.client.v2.model.UpdateDeploymentGateParams;
import com.datadog.api.client.v2.model.UpdateDeploymentRuleParams;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
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
   * <p>See {@link #createDeploymentGateWithHttpInfo}.
   *
   * @param body (required)
   * @return DeploymentGateResponse
   * @throws ApiException if fails to make API call
   */
  public DeploymentGateResponse createDeploymentGate(CreateDeploymentGateParams body)
      throws ApiException {
    return createDeploymentGateWithHttpInfo(body).getData();
  }

  /**
   * Create deployment gate.
   *
   * <p>See {@link #createDeploymentGateWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;DeploymentGateResponse&gt;
   */
  public CompletableFuture<DeploymentGateResponse> createDeploymentGateAsync(
      CreateDeploymentGateParams body) {
    return createDeploymentGateWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Endpoint to create a deployment gate.
   *
   * @param body (required)
   * @return ApiResponse&lt;DeploymentGateResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
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
  public ApiResponse<DeploymentGateResponse> createDeploymentGateWithHttpInfo(
      CreateDeploymentGateParams body) throws ApiException {
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
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createDeploymentGate");
    }
    // create path and map variables
    String localVarPath = "/api/v2/deployment_gates";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.DeploymentGatesApi.createDeploymentGate",
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
        new GenericType<DeploymentGateResponse>() {});
  }

  /**
   * Create deployment gate.
   *
   * <p>See {@link #createDeploymentGateWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;DeploymentGateResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<DeploymentGateResponse>>
      createDeploymentGateWithHttpInfoAsync(CreateDeploymentGateParams body) {
    // Check if unstable operation is enabled
    String operationId = "createDeploymentGate";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<DeploymentGateResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<DeploymentGateResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createDeploymentGate"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/deployment_gates";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.DeploymentGatesApi.createDeploymentGate",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<DeploymentGateResponse>> result = new CompletableFuture<>();
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
        new GenericType<DeploymentGateResponse>() {});
  }

  /**
   * Create deployment rule.
   *
   * <p>See {@link #createDeploymentRuleWithHttpInfo}.
   *
   * @param gateId The ID of the deployment gate. (required)
   * @param body (required)
   * @return DeploymentRuleResponse
   * @throws ApiException if fails to make API call
   */
  public DeploymentRuleResponse createDeploymentRule(String gateId, CreateDeploymentRuleParams body)
      throws ApiException {
    return createDeploymentRuleWithHttpInfo(gateId, body).getData();
  }

  /**
   * Create deployment rule.
   *
   * <p>See {@link #createDeploymentRuleWithHttpInfoAsync}.
   *
   * @param gateId The ID of the deployment gate. (required)
   * @param body (required)
   * @return CompletableFuture&lt;DeploymentRuleResponse&gt;
   */
  public CompletableFuture<DeploymentRuleResponse> createDeploymentRuleAsync(
      String gateId, CreateDeploymentRuleParams body) {
    return createDeploymentRuleWithHttpInfoAsync(gateId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Endpoint to create a deployment rule. A gate for the rule must already exist.
   *
   * @param gateId The ID of the deployment gate. (required)
   * @param body (required)
   * @return ApiResponse&lt;DeploymentRuleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
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
  public ApiResponse<DeploymentRuleResponse> createDeploymentRuleWithHttpInfo(
      String gateId, CreateDeploymentRuleParams body) throws ApiException {
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
      throw new ApiException(
          400, "Missing the required parameter 'gateId' when calling createDeploymentRule");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createDeploymentRule");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/deployment_gates/{gate_id}/rules"
            .replaceAll("\\{" + "gate_id" + "\\}", apiClient.escapeString(gateId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.DeploymentGatesApi.createDeploymentRule",
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
        new GenericType<DeploymentRuleResponse>() {});
  }

  /**
   * Create deployment rule.
   *
   * <p>See {@link #createDeploymentRuleWithHttpInfo}.
   *
   * @param gateId The ID of the deployment gate. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;DeploymentRuleResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<DeploymentRuleResponse>>
      createDeploymentRuleWithHttpInfoAsync(String gateId, CreateDeploymentRuleParams body) {
    // Check if unstable operation is enabled
    String operationId = "createDeploymentRule";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<DeploymentRuleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'gateId' is set
    if (gateId == null) {
      CompletableFuture<ApiResponse<DeploymentRuleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'gateId' when calling createDeploymentRule"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<DeploymentRuleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createDeploymentRule"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/deployment_gates/{gate_id}/rules"
            .replaceAll("\\{" + "gate_id" + "\\}", apiClient.escapeString(gateId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.DeploymentGatesApi.createDeploymentRule",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<DeploymentRuleResponse>> result = new CompletableFuture<>();
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
        new GenericType<DeploymentRuleResponse>() {});
  }

  /**
   * Delete deployment gate.
   *
   * <p>See {@link #deleteDeploymentGateWithHttpInfo}.
   *
   * @param id The ID of the deployment gate. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteDeploymentGate(String id) throws ApiException {
    deleteDeploymentGateWithHttpInfo(id);
  }

  /**
   * Delete deployment gate.
   *
   * <p>See {@link #deleteDeploymentGateWithHttpInfoAsync}.
   *
   * @param id The ID of the deployment gate. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteDeploymentGateAsync(String id) {
    return deleteDeploymentGateWithHttpInfoAsync(id)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Endpoint to delete a deployment gate. Rules associated with the gate are also deleted.
   *
   * @param id The ID of the deployment gate. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
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
      throw new ApiException(
          400, "Missing the required parameter 'id' when calling deleteDeploymentGate");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/deployment_gates/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.DeploymentGatesApi.deleteDeploymentGate",
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
   * Delete deployment gate.
   *
   * <p>See {@link #deleteDeploymentGateWithHttpInfo}.
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
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'id' when calling deleteDeploymentGate"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/deployment_gates/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.DeploymentGatesApi.deleteDeploymentGate",
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
   * Delete deployment rule.
   *
   * <p>See {@link #deleteDeploymentRuleWithHttpInfo}.
   *
   * @param gateId The ID of the deployment gate. (required)
   * @param id The ID of the deployment rule. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteDeploymentRule(String gateId, String id) throws ApiException {
    deleteDeploymentRuleWithHttpInfo(gateId, id);
  }

  /**
   * Delete deployment rule.
   *
   * <p>See {@link #deleteDeploymentRuleWithHttpInfoAsync}.
   *
   * @param gateId The ID of the deployment gate. (required)
   * @param id The ID of the deployment rule. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteDeploymentRuleAsync(String gateId, String id) {
    return deleteDeploymentRuleWithHttpInfoAsync(gateId, id)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Endpoint to delete a deployment rule.
   *
   * @param gateId The ID of the deployment gate. (required)
   * @param id The ID of the deployment rule. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
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
  public ApiResponse<Void> deleteDeploymentRuleWithHttpInfo(String gateId, String id)
      throws ApiException {
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
      throw new ApiException(
          400, "Missing the required parameter 'gateId' when calling deleteDeploymentRule");
    }

    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(
          400, "Missing the required parameter 'id' when calling deleteDeploymentRule");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/deployment_gates/{gate_id}/rules/{id}"
            .replaceAll("\\{" + "gate_id" + "\\}", apiClient.escapeString(gateId.toString()))
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.DeploymentGatesApi.deleteDeploymentRule",
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
   * Delete deployment rule.
   *
   * <p>See {@link #deleteDeploymentRuleWithHttpInfo}.
   *
   * @param gateId The ID of the deployment gate. (required)
   * @param id The ID of the deployment rule. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteDeploymentRuleWithHttpInfoAsync(
      String gateId, String id) {
    // Check if unstable operation is enabled
    String operationId = "deleteDeploymentRule";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'gateId' is set
    if (gateId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'gateId' when calling deleteDeploymentRule"));
      return result;
    }

    // verify the required parameter 'id' is set
    if (id == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'id' when calling deleteDeploymentRule"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/deployment_gates/{gate_id}/rules/{id}"
            .replaceAll("\\{" + "gate_id" + "\\}", apiClient.escapeString(gateId.toString()))
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.DeploymentGatesApi.deleteDeploymentRule",
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
   * Get deployment gate.
   *
   * <p>See {@link #getDeploymentGateWithHttpInfo}.
   *
   * @param id The ID of the deployment gate. (required)
   * @return DeploymentGateResponse
   * @throws ApiException if fails to make API call
   */
  public DeploymentGateResponse getDeploymentGate(String id) throws ApiException {
    return getDeploymentGateWithHttpInfo(id).getData();
  }

  /**
   * Get deployment gate.
   *
   * <p>See {@link #getDeploymentGateWithHttpInfoAsync}.
   *
   * @param id The ID of the deployment gate. (required)
   * @return CompletableFuture&lt;DeploymentGateResponse&gt;
   */
  public CompletableFuture<DeploymentGateResponse> getDeploymentGateAsync(String id) {
    return getDeploymentGateWithHttpInfoAsync(id)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Endpoint to get a deployment gate.
   *
   * @param id The ID of the deployment gate. (required)
   * @return ApiResponse&lt;DeploymentGateResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
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
  public ApiResponse<DeploymentGateResponse> getDeploymentGateWithHttpInfo(String id)
      throws ApiException {
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
      throw new ApiException(
          400, "Missing the required parameter 'id' when calling getDeploymentGate");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/deployment_gates/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.DeploymentGatesApi.getDeploymentGate",
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
        new GenericType<DeploymentGateResponse>() {});
  }

  /**
   * Get deployment gate.
   *
   * <p>See {@link #getDeploymentGateWithHttpInfo}.
   *
   * @param id The ID of the deployment gate. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;DeploymentGateResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<DeploymentGateResponse>> getDeploymentGateWithHttpInfoAsync(
      String id) {
    // Check if unstable operation is enabled
    String operationId = "getDeploymentGate";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<DeploymentGateResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
      CompletableFuture<ApiResponse<DeploymentGateResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'id' when calling getDeploymentGate"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/deployment_gates/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.DeploymentGatesApi.getDeploymentGate",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<DeploymentGateResponse>> result = new CompletableFuture<>();
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
        new GenericType<DeploymentGateResponse>() {});
  }

  /**
   * Get rules for a deployment gate.
   *
   * <p>See {@link #getDeploymentGateRulesWithHttpInfo}.
   *
   * @param gateId The ID of the deployment gate. (required)
   * @return DeploymentGateRulesResponse
   * @throws ApiException if fails to make API call
   */
  public DeploymentGateRulesResponse getDeploymentGateRules(String gateId) throws ApiException {
    return getDeploymentGateRulesWithHttpInfo(gateId).getData();
  }

  /**
   * Get rules for a deployment gate.
   *
   * <p>See {@link #getDeploymentGateRulesWithHttpInfoAsync}.
   *
   * @param gateId The ID of the deployment gate. (required)
   * @return CompletableFuture&lt;DeploymentGateRulesResponse&gt;
   */
  public CompletableFuture<DeploymentGateRulesResponse> getDeploymentGateRulesAsync(String gateId) {
    return getDeploymentGateRulesWithHttpInfoAsync(gateId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Endpoint to get rules for a deployment gate.
   *
   * @param gateId The ID of the deployment gate. (required)
   * @return ApiResponse&lt;DeploymentGateRulesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
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
  public ApiResponse<DeploymentGateRulesResponse> getDeploymentGateRulesWithHttpInfo(String gateId)
      throws ApiException {
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
      throw new ApiException(
          400, "Missing the required parameter 'gateId' when calling getDeploymentGateRules");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/deployment_gates/{gate_id}/rules"
            .replaceAll("\\{" + "gate_id" + "\\}", apiClient.escapeString(gateId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.DeploymentGatesApi.getDeploymentGateRules",
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
        new GenericType<DeploymentGateRulesResponse>() {});
  }

  /**
   * Get rules for a deployment gate.
   *
   * <p>See {@link #getDeploymentGateRulesWithHttpInfo}.
   *
   * @param gateId The ID of the deployment gate. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;DeploymentGateRulesResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<DeploymentGateRulesResponse>>
      getDeploymentGateRulesWithHttpInfoAsync(String gateId) {
    // Check if unstable operation is enabled
    String operationId = "getDeploymentGateRules";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<DeploymentGateRulesResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'gateId' is set
    if (gateId == null) {
      CompletableFuture<ApiResponse<DeploymentGateRulesResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'gateId' when calling getDeploymentGateRules"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/deployment_gates/{gate_id}/rules"
            .replaceAll("\\{" + "gate_id" + "\\}", apiClient.escapeString(gateId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.DeploymentGatesApi.getDeploymentGateRules",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<DeploymentGateRulesResponse>> result =
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
        new GenericType<DeploymentGateRulesResponse>() {});
  }

  /**
   * Get a deployment gate evaluation result.
   *
   * <p>See {@link #getDeploymentGatesEvaluationResultWithHttpInfo}.
   *
   * @param id The evaluation ID returned by the trigger endpoint. (required)
   * @return DeploymentGatesEvaluationResultResponse
   * @throws ApiException if fails to make API call
   */
  public DeploymentGatesEvaluationResultResponse getDeploymentGatesEvaluationResult(UUID id)
      throws ApiException {
    return getDeploymentGatesEvaluationResultWithHttpInfo(id).getData();
  }

  /**
   * Get a deployment gate evaluation result.
   *
   * <p>See {@link #getDeploymentGatesEvaluationResultWithHttpInfoAsync}.
   *
   * @param id The evaluation ID returned by the trigger endpoint. (required)
   * @return CompletableFuture&lt;DeploymentGatesEvaluationResultResponse&gt;
   */
  public CompletableFuture<DeploymentGatesEvaluationResultResponse>
      getDeploymentGatesEvaluationResultAsync(UUID id) {
    return getDeploymentGatesEvaluationResultWithHttpInfoAsync(id)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Retrieves the result of a deployment gate evaluation by its evaluation ID. If the evaluation is
   * still in progress, <code>data.attributes.gate_status</code> will be <code>in_progress</code>;
   * continue polling until it returns <code>pass</code> or <code>fail</code>. Polling every 10-20
   * seconds is recommended. The endpoint may return a 404 if called too soon after triggering;
   * retry after a few seconds.
   *
   * @param id The evaluation ID returned by the trigger endpoint. (required)
   * @return ApiResponse&lt;DeploymentGatesEvaluationResultResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
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
  public ApiResponse<DeploymentGatesEvaluationResultResponse>
      getDeploymentGatesEvaluationResultWithHttpInfo(UUID id) throws ApiException {
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
      throw new ApiException(
          400,
          "Missing the required parameter 'id' when calling getDeploymentGatesEvaluationResult");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/deployments/gates/evaluation/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.DeploymentGatesApi.getDeploymentGatesEvaluationResult",
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
        new GenericType<DeploymentGatesEvaluationResultResponse>() {});
  }

  /**
   * Get a deployment gate evaluation result.
   *
   * <p>See {@link #getDeploymentGatesEvaluationResultWithHttpInfo}.
   *
   * @param id The evaluation ID returned by the trigger endpoint. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;DeploymentGatesEvaluationResultResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<DeploymentGatesEvaluationResultResponse>>
      getDeploymentGatesEvaluationResultWithHttpInfoAsync(UUID id) {
    // Check if unstable operation is enabled
    String operationId = "getDeploymentGatesEvaluationResult";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<DeploymentGatesEvaluationResultResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
      CompletableFuture<ApiResponse<DeploymentGatesEvaluationResultResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'id' when calling"
                  + " getDeploymentGatesEvaluationResult"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/deployments/gates/evaluation/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.DeploymentGatesApi.getDeploymentGatesEvaluationResult",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<DeploymentGatesEvaluationResultResponse>> result =
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
        new GenericType<DeploymentGatesEvaluationResultResponse>() {});
  }

  /**
   * Get deployment rule.
   *
   * <p>See {@link #getDeploymentRuleWithHttpInfo}.
   *
   * @param gateId The ID of the deployment gate. (required)
   * @param id The ID of the deployment rule. (required)
   * @return DeploymentRuleResponse
   * @throws ApiException if fails to make API call
   */
  public DeploymentRuleResponse getDeploymentRule(String gateId, String id) throws ApiException {
    return getDeploymentRuleWithHttpInfo(gateId, id).getData();
  }

  /**
   * Get deployment rule.
   *
   * <p>See {@link #getDeploymentRuleWithHttpInfoAsync}.
   *
   * @param gateId The ID of the deployment gate. (required)
   * @param id The ID of the deployment rule. (required)
   * @return CompletableFuture&lt;DeploymentRuleResponse&gt;
   */
  public CompletableFuture<DeploymentRuleResponse> getDeploymentRuleAsync(
      String gateId, String id) {
    return getDeploymentRuleWithHttpInfoAsync(gateId, id)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Endpoint to get a deployment rule.
   *
   * @param gateId The ID of the deployment gate. (required)
   * @param id The ID of the deployment rule. (required)
   * @return ApiResponse&lt;DeploymentRuleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
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
  public ApiResponse<DeploymentRuleResponse> getDeploymentRuleWithHttpInfo(String gateId, String id)
      throws ApiException {
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
      throw new ApiException(
          400, "Missing the required parameter 'gateId' when calling getDeploymentRule");
    }

    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(
          400, "Missing the required parameter 'id' when calling getDeploymentRule");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/deployment_gates/{gate_id}/rules/{id}"
            .replaceAll("\\{" + "gate_id" + "\\}", apiClient.escapeString(gateId.toString()))
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.DeploymentGatesApi.getDeploymentRule",
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
        new GenericType<DeploymentRuleResponse>() {});
  }

  /**
   * Get deployment rule.
   *
   * <p>See {@link #getDeploymentRuleWithHttpInfo}.
   *
   * @param gateId The ID of the deployment gate. (required)
   * @param id The ID of the deployment rule. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;DeploymentRuleResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<DeploymentRuleResponse>> getDeploymentRuleWithHttpInfoAsync(
      String gateId, String id) {
    // Check if unstable operation is enabled
    String operationId = "getDeploymentRule";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<DeploymentRuleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'gateId' is set
    if (gateId == null) {
      CompletableFuture<ApiResponse<DeploymentRuleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'gateId' when calling getDeploymentRule"));
      return result;
    }

    // verify the required parameter 'id' is set
    if (id == null) {
      CompletableFuture<ApiResponse<DeploymentRuleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'id' when calling getDeploymentRule"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/deployment_gates/{gate_id}/rules/{id}"
            .replaceAll("\\{" + "gate_id" + "\\}", apiClient.escapeString(gateId.toString()))
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.DeploymentGatesApi.getDeploymentRule",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<DeploymentRuleResponse>> result = new CompletableFuture<>();
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
        new GenericType<DeploymentRuleResponse>() {});
  }

  /** Manage optional parameters to listDeploymentGateEvaluations. */
  public static class ListDeploymentGateEvaluationsOptionalParameters {
    private OffsetDateTime filterFrom;
    private OffsetDateTime filterTo;
    private List<String> filterService;
    private List<String> filterEnv;
    private List<String> filterIdentifier;
    private List<DeploymentGatesEvaluationResultResponseAttributesGateStatus> filterStatus;
    private Boolean filterDryRun;
    private UUID filterEvaluationId;
    private UUID filterGateId;
    private List<String> filterVersion;
    private Long pageSize;
    private String pageCursor;

    /**
     * Set filterFrom.
     *
     * @param filterFrom Inclusive evaluation start time. Defaults to 24 hours before the request.
     *     Together with <code>filter[to]</code>, the window may span no more than 30 days.
     *     (optional)
     * @return ListDeploymentGateEvaluationsOptionalParameters
     */
    public ListDeploymentGateEvaluationsOptionalParameters filterFrom(OffsetDateTime filterFrom) {
      this.filterFrom = filterFrom;
      return this;
    }

    /**
     * Set filterTo.
     *
     * @param filterTo Exclusive evaluation start time. Defaults to the request time. Must be after
     *     <code>filter[from]</code>; the window may span no more than 30 days. (optional)
     * @return ListDeploymentGateEvaluationsOptionalParameters
     */
    public ListDeploymentGateEvaluationsOptionalParameters filterTo(OffsetDateTime filterTo) {
      this.filterTo = filterTo;
      return this;
    }

    /**
     * Set filterService.
     *
     * @param filterService Service values. Repeated or comma-separated values are combined with OR.
     *     (optional)
     * @return ListDeploymentGateEvaluationsOptionalParameters
     */
    public ListDeploymentGateEvaluationsOptionalParameters filterService(
        List<String> filterService) {
      this.filterService = filterService;
      return this;
    }

    /**
     * Set filterEnv.
     *
     * @param filterEnv Environment values. Repeated or comma-separated values are combined with OR.
     *     (optional)
     * @return ListDeploymentGateEvaluationsOptionalParameters
     */
    public ListDeploymentGateEvaluationsOptionalParameters filterEnv(List<String> filterEnv) {
      this.filterEnv = filterEnv;
      return this;
    }

    /**
     * Set filterIdentifier.
     *
     * @param filterIdentifier Gate identifier values. Repeated or comma-separated values are
     *     combined with OR. (optional)
     * @return ListDeploymentGateEvaluationsOptionalParameters
     */
    public ListDeploymentGateEvaluationsOptionalParameters filterIdentifier(
        List<String> filterIdentifier) {
      this.filterIdentifier = filterIdentifier;
      return this;
    }

    /**
     * Set filterStatus.
     *
     * @param filterStatus Gate outcomes. Repeated or comma-separated values are combined with OR.
     *     (optional)
     * @return ListDeploymentGateEvaluationsOptionalParameters
     */
    public ListDeploymentGateEvaluationsOptionalParameters filterStatus(
        List<DeploymentGatesEvaluationResultResponseAttributesGateStatus> filterStatus) {
      this.filterStatus = filterStatus;
      return this;
    }

    /**
     * Set filterDryRun.
     *
     * @param filterDryRun Gate-level dry-run state. (optional)
     * @return ListDeploymentGateEvaluationsOptionalParameters
     */
    public ListDeploymentGateEvaluationsOptionalParameters filterDryRun(Boolean filterDryRun) {
      this.filterDryRun = filterDryRun;
      return this;
    }

    /**
     * Set filterEvaluationId.
     *
     * @param filterEvaluationId Gate evaluation UUID. No match returns an empty list. (optional)
     * @return ListDeploymentGateEvaluationsOptionalParameters
     */
    public ListDeploymentGateEvaluationsOptionalParameters filterEvaluationId(
        UUID filterEvaluationId) {
      this.filterEvaluationId = filterEvaluationId;
      return this;
    }

    /**
     * Set filterGateId.
     *
     * @param filterGateId Configured gate UUID. Just-in-time evaluations have no gate ID.
     *     (optional)
     * @return ListDeploymentGateEvaluationsOptionalParameters
     */
    public ListDeploymentGateEvaluationsOptionalParameters filterGateId(UUID filterGateId) {
      this.filterGateId = filterGateId;
      return this;
    }

    /**
     * Set filterVersion.
     *
     * @param filterVersion Deployment version values. Repeated or comma-separated values are
     *     combined with OR. (optional)
     * @return ListDeploymentGateEvaluationsOptionalParameters
     */
    public ListDeploymentGateEvaluationsOptionalParameters filterVersion(
        List<String> filterVersion) {
      this.filterVersion = filterVersion;
      return this;
    }

    /**
     * Set pageSize.
     *
     * @param pageSize Maximum evaluations returned. (optional, default to 20)
     * @return ListDeploymentGateEvaluationsOptionalParameters
     */
    public ListDeploymentGateEvaluationsOptionalParameters pageSize(Long pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set pageCursor.
     *
     * @param pageCursor Opaque cursor returned in <code>meta.page.next_cursor</code> by the
     *     previous page. Invalid cursors return 400. (optional)
     * @return ListDeploymentGateEvaluationsOptionalParameters
     */
    public ListDeploymentGateEvaluationsOptionalParameters pageCursor(String pageCursor) {
      this.pageCursor = pageCursor;
      return this;
    }
  }

  /**
   * List deployment gate evaluations.
   *
   * <p>See {@link #listDeploymentGateEvaluationsWithHttpInfo}.
   *
   * @return DeploymentGateEvaluationsResponse
   * @throws ApiException if fails to make API call
   */
  public DeploymentGateEvaluationsResponse listDeploymentGateEvaluations() throws ApiException {
    return listDeploymentGateEvaluationsWithHttpInfo(
            new ListDeploymentGateEvaluationsOptionalParameters())
        .getData();
  }

  /**
   * List deployment gate evaluations.
   *
   * <p>See {@link #listDeploymentGateEvaluationsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;DeploymentGateEvaluationsResponse&gt;
   */
  public CompletableFuture<DeploymentGateEvaluationsResponse> listDeploymentGateEvaluationsAsync() {
    return listDeploymentGateEvaluationsWithHttpInfoAsync(
            new ListDeploymentGateEvaluationsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List deployment gate evaluations.
   *
   * <p>See {@link #listDeploymentGateEvaluationsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return DeploymentGateEvaluationsResponse
   * @throws ApiException if fails to make API call
   */
  public DeploymentGateEvaluationsResponse listDeploymentGateEvaluations(
      ListDeploymentGateEvaluationsOptionalParameters parameters) throws ApiException {
    return listDeploymentGateEvaluationsWithHttpInfo(parameters).getData();
  }

  /**
   * List deployment gate evaluations.
   *
   * <p>See {@link #listDeploymentGateEvaluationsWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;DeploymentGateEvaluationsResponse&gt;
   */
  public CompletableFuture<DeploymentGateEvaluationsResponse> listDeploymentGateEvaluationsAsync(
      ListDeploymentGateEvaluationsOptionalParameters parameters) {
    return listDeploymentGateEvaluationsWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List deployment gate evaluations.
   *
   * <p>See {@link #listDeploymentGateEvaluationsWithHttpInfo}.
   *
   * @return PaginationIterable&lt;DeploymentGateEvaluationData&gt;
   */
  public PaginationIterable<DeploymentGateEvaluationData>
      listDeploymentGateEvaluationsWithPagination() {
    ListDeploymentGateEvaluationsOptionalParameters parameters =
        new ListDeploymentGateEvaluationsOptionalParameters();
    return listDeploymentGateEvaluationsWithPagination(parameters);
  }

  /**
   * List deployment gate evaluations.
   *
   * <p>See {@link #listDeploymentGateEvaluationsWithHttpInfo}.
   *
   * @return DeploymentGateEvaluationsResponse
   */
  public PaginationIterable<DeploymentGateEvaluationData>
      listDeploymentGateEvaluationsWithPagination(
          ListDeploymentGateEvaluationsOptionalParameters parameters) {
    String resultsPath = "getData";
    String valueGetterPath = "getMeta.getPage.getNextCursor";
    String valueSetterPath = "pageCursor";
    Boolean valueSetterParamOptional = true;
    Long limit;

    if (parameters.pageSize == null) {
      limit = 20l;
      parameters.pageSize(limit);
    } else {
      limit = parameters.pageSize;
    }

    LinkedHashMap<String, Object> args = new LinkedHashMap<String, Object>();
    args.put("optionalParams", parameters);

    PaginationIterable iterator =
        new PaginationIterable(
            this,
            "listDeploymentGateEvaluations",
            resultsPath,
            valueGetterPath,
            valueSetterPath,
            valueSetterParamOptional,
            true,
            true,
            limit,
            args,
            0);

    return iterator;
  }

  /**
   * Returns deployment gate evaluations started in a maximum 30-day window (the default is the
   * previous 24 hours). Results are ordered by start time, newest first. In-progress state is
   * near-real-time and mutable. Finished state is eventually consistent.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;DeploymentGateEvaluationsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad request. </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<DeploymentGateEvaluationsResponse> listDeploymentGateEvaluationsWithHttpInfo(
      ListDeploymentGateEvaluationsOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listDeploymentGateEvaluations";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    OffsetDateTime filterFrom = parameters.filterFrom;
    OffsetDateTime filterTo = parameters.filterTo;
    List<String> filterService = parameters.filterService;
    List<String> filterEnv = parameters.filterEnv;
    List<String> filterIdentifier = parameters.filterIdentifier;
    List<DeploymentGatesEvaluationResultResponseAttributesGateStatus> filterStatus =
        parameters.filterStatus;
    Boolean filterDryRun = parameters.filterDryRun;
    UUID filterEvaluationId = parameters.filterEvaluationId;
    UUID filterGateId = parameters.filterGateId;
    List<String> filterVersion = parameters.filterVersion;
    Long pageSize = parameters.pageSize;
    String pageCursor = parameters.pageCursor;
    // create path and map variables
    String localVarPath = "/api/v2/deployment_gates/evaluations";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[from]", filterFrom));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[to]", filterTo));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("multi", "filter[service]", filterService));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[env]", filterEnv));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("multi", "filter[identifier]", filterIdentifier));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[status]", filterStatus));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[dry_run]", filterDryRun));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[evaluation_id]", filterEvaluationId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[gate_id]", filterGateId));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("multi", "filter[version]", filterVersion));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[cursor]", pageCursor));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.DeploymentGatesApi.listDeploymentGateEvaluations",
            localVarPath,
            localVarQueryParams,
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
        new GenericType<DeploymentGateEvaluationsResponse>() {});
  }

  /**
   * List deployment gate evaluations.
   *
   * <p>See {@link #listDeploymentGateEvaluationsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;DeploymentGateEvaluationsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<DeploymentGateEvaluationsResponse>>
      listDeploymentGateEvaluationsWithHttpInfoAsync(
          ListDeploymentGateEvaluationsOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listDeploymentGateEvaluations";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<DeploymentGateEvaluationsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    OffsetDateTime filterFrom = parameters.filterFrom;
    OffsetDateTime filterTo = parameters.filterTo;
    List<String> filterService = parameters.filterService;
    List<String> filterEnv = parameters.filterEnv;
    List<String> filterIdentifier = parameters.filterIdentifier;
    List<DeploymentGatesEvaluationResultResponseAttributesGateStatus> filterStatus =
        parameters.filterStatus;
    Boolean filterDryRun = parameters.filterDryRun;
    UUID filterEvaluationId = parameters.filterEvaluationId;
    UUID filterGateId = parameters.filterGateId;
    List<String> filterVersion = parameters.filterVersion;
    Long pageSize = parameters.pageSize;
    String pageCursor = parameters.pageCursor;
    // create path and map variables
    String localVarPath = "/api/v2/deployment_gates/evaluations";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[from]", filterFrom));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[to]", filterTo));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("multi", "filter[service]", filterService));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[env]", filterEnv));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("multi", "filter[identifier]", filterIdentifier));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[status]", filterStatus));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[dry_run]", filterDryRun));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[evaluation_id]", filterEvaluationId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[gate_id]", filterGateId));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("multi", "filter[version]", filterVersion));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[cursor]", pageCursor));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.DeploymentGatesApi.listDeploymentGateEvaluations",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<DeploymentGateEvaluationsResponse>> result =
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
        new GenericType<DeploymentGateEvaluationsResponse>() {});
  }

  /** Manage optional parameters to listDeploymentGates. */
  public static class ListDeploymentGatesOptionalParameters {
    private String filterService;
    private String filterEnv;
    private String filterIdentifier;
    private Boolean filterDryRun;
    private String pageCursor;
    private Long pageSize;

    /**
     * Set filterService.
     *
     * @param filterService Service name. (optional)
     * @return ListDeploymentGatesOptionalParameters
     */
    public ListDeploymentGatesOptionalParameters filterService(String filterService) {
      this.filterService = filterService;
      return this;
    }

    /**
     * Set filterEnv.
     *
     * @param filterEnv Environment name. (optional)
     * @return ListDeploymentGatesOptionalParameters
     */
    public ListDeploymentGatesOptionalParameters filterEnv(String filterEnv) {
      this.filterEnv = filterEnv;
      return this;
    }

    /**
     * Set filterIdentifier.
     *
     * @param filterIdentifier Gate identifier. (optional)
     * @return ListDeploymentGatesOptionalParameters
     */
    public ListDeploymentGatesOptionalParameters filterIdentifier(String filterIdentifier) {
      this.filterIdentifier = filterIdentifier;
      return this;
    }

    /**
     * Set filterDryRun.
     *
     * @param filterDryRun Dry-run state. (optional)
     * @return ListDeploymentGatesOptionalParameters
     */
    public ListDeploymentGatesOptionalParameters filterDryRun(Boolean filterDryRun) {
      this.filterDryRun = filterDryRun;
      return this;
    }

    /**
     * Set pageCursor.
     *
     * @param pageCursor Cursor for pagination. Use the <code>meta.page.next_cursor</code> value
     *     from the previous response. Invalid cursors return 400. (optional)
     * @return ListDeploymentGatesOptionalParameters
     */
    public ListDeploymentGatesOptionalParameters pageCursor(String pageCursor) {
      this.pageCursor = pageCursor;
      return this;
    }

    /**
     * Set pageSize.
     *
     * @param pageSize Number of results per page. Defaults to 50. Must be between 1 and 1000.
     *     (optional, default to 50)
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
   * <p>See {@link #listDeploymentGatesWithHttpInfo}.
   *
   * @return DeploymentGatesListResponse
   * @throws ApiException if fails to make API call
   */
  public DeploymentGatesListResponse listDeploymentGates() throws ApiException {
    return listDeploymentGatesWithHttpInfo(new ListDeploymentGatesOptionalParameters()).getData();
  }

  /**
   * Get all deployment gates.
   *
   * <p>See {@link #listDeploymentGatesWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;DeploymentGatesListResponse&gt;
   */
  public CompletableFuture<DeploymentGatesListResponse> listDeploymentGatesAsync() {
    return listDeploymentGatesWithHttpInfoAsync(new ListDeploymentGatesOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get all deployment gates.
   *
   * <p>See {@link #listDeploymentGatesWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return DeploymentGatesListResponse
   * @throws ApiException if fails to make API call
   */
  public DeploymentGatesListResponse listDeploymentGates(
      ListDeploymentGatesOptionalParameters parameters) throws ApiException {
    return listDeploymentGatesWithHttpInfo(parameters).getData();
  }

  /**
   * Get all deployment gates.
   *
   * <p>See {@link #listDeploymentGatesWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;DeploymentGatesListResponse&gt;
   */
  public CompletableFuture<DeploymentGatesListResponse> listDeploymentGatesAsync(
      ListDeploymentGatesOptionalParameters parameters) {
    return listDeploymentGatesWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Returns a paginated list of all deployment gates for the organization. Use <code>page[cursor]
   * </code> and <code>page[size]</code> query parameters to paginate through results.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;DeploymentGatesListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
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
  public ApiResponse<DeploymentGatesListResponse> listDeploymentGatesWithHttpInfo(
      ListDeploymentGatesOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listDeploymentGates";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    String filterService = parameters.filterService;
    String filterEnv = parameters.filterEnv;
    String filterIdentifier = parameters.filterIdentifier;
    Boolean filterDryRun = parameters.filterDryRun;
    String pageCursor = parameters.pageCursor;
    Long pageSize = parameters.pageSize;
    // create path and map variables
    String localVarPath = "/api/v2/deployment_gates";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[service]", filterService));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[env]", filterEnv));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[identifier]", filterIdentifier));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[dry_run]", filterDryRun));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[cursor]", pageCursor));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.DeploymentGatesApi.listDeploymentGates",
            localVarPath,
            localVarQueryParams,
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
        new GenericType<DeploymentGatesListResponse>() {});
  }

  /**
   * Get all deployment gates.
   *
   * <p>See {@link #listDeploymentGatesWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;DeploymentGatesListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<DeploymentGatesListResponse>>
      listDeploymentGatesWithHttpInfoAsync(ListDeploymentGatesOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listDeploymentGates";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<DeploymentGatesListResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    String filterService = parameters.filterService;
    String filterEnv = parameters.filterEnv;
    String filterIdentifier = parameters.filterIdentifier;
    Boolean filterDryRun = parameters.filterDryRun;
    String pageCursor = parameters.pageCursor;
    Long pageSize = parameters.pageSize;
    // create path and map variables
    String localVarPath = "/api/v2/deployment_gates";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[service]", filterService));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[env]", filterEnv));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[identifier]", filterIdentifier));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[dry_run]", filterDryRun));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[cursor]", pageCursor));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.DeploymentGatesApi.listDeploymentGates",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<DeploymentGatesListResponse>> result =
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
        new GenericType<DeploymentGatesListResponse>() {});
  }

  /** Manage optional parameters to listDeploymentRuleEvaluations. */
  public static class ListDeploymentRuleEvaluationsOptionalParameters {
    private OffsetDateTime filterFrom;
    private OffsetDateTime filterTo;
    private UUID filterGateEvaluationId;
    private UUID filterEvaluationId;
    private UUID filterGateId;
    private UUID filterRuleId;
    private List<String> filterService;
    private List<String> filterEnv;
    private List<String> filterIdentifier;
    private List<String> filterVersion;
    private List<DeploymentGatesEvaluationResultResponseAttributesGateStatus> filterStatus;
    private List<DeploymentGateRuleEvaluationType> filterType;
    private Boolean filterDryRun;
    private Boolean filterGateDryRun;
    private List<String> filterName;
    private Long pageSize;
    private String pageCursor;

    /**
     * Set filterFrom.
     *
     * @param filterFrom Inclusive gate evaluation start time. Defaults to 24 hours before the
     *     request. Together with <code>filter[to]</code>, the window may span no more than 30 days.
     *     (optional)
     * @return ListDeploymentRuleEvaluationsOptionalParameters
     */
    public ListDeploymentRuleEvaluationsOptionalParameters filterFrom(OffsetDateTime filterFrom) {
      this.filterFrom = filterFrom;
      return this;
    }

    /**
     * Set filterTo.
     *
     * @param filterTo Exclusive gate evaluation start time. Defaults to the request time. Must be
     *     after <code>filter[from]</code>; the window may span no more than 30 days. (optional)
     * @return ListDeploymentRuleEvaluationsOptionalParameters
     */
    public ListDeploymentRuleEvaluationsOptionalParameters filterTo(OffsetDateTime filterTo) {
      this.filterTo = filterTo;
      return this;
    }

    /**
     * Set filterGateEvaluationId.
     *
     * @param filterGateEvaluationId Gate evaluation UUID. No match returns an empty list.
     *     (optional)
     * @return ListDeploymentRuleEvaluationsOptionalParameters
     */
    public ListDeploymentRuleEvaluationsOptionalParameters filterGateEvaluationId(
        UUID filterGateEvaluationId) {
      this.filterGateEvaluationId = filterGateEvaluationId;
      return this;
    }

    /**
     * Set filterEvaluationId.
     *
     * @param filterEvaluationId Rule evaluation UUID. No match returns an empty list. (optional)
     * @return ListDeploymentRuleEvaluationsOptionalParameters
     */
    public ListDeploymentRuleEvaluationsOptionalParameters filterEvaluationId(
        UUID filterEvaluationId) {
      this.filterEvaluationId = filterEvaluationId;
      return this;
    }

    /**
     * Set filterGateId.
     *
     * @param filterGateId Configured gate UUID. Just-in-time evaluations have no gate ID.
     *     (optional)
     * @return ListDeploymentRuleEvaluationsOptionalParameters
     */
    public ListDeploymentRuleEvaluationsOptionalParameters filterGateId(UUID filterGateId) {
      this.filterGateId = filterGateId;
      return this;
    }

    /**
     * Set filterRuleId.
     *
     * @param filterRuleId Configured rule UUID. Just-in-time rules have no rule ID. (optional)
     * @return ListDeploymentRuleEvaluationsOptionalParameters
     */
    public ListDeploymentRuleEvaluationsOptionalParameters filterRuleId(UUID filterRuleId) {
      this.filterRuleId = filterRuleId;
      return this;
    }

    /**
     * Set filterService.
     *
     * @param filterService Evaluated service values. Repeated or comma-separated values are
     *     combined with OR. (optional)
     * @return ListDeploymentRuleEvaluationsOptionalParameters
     */
    public ListDeploymentRuleEvaluationsOptionalParameters filterService(
        List<String> filterService) {
      this.filterService = filterService;
      return this;
    }

    /**
     * Set filterEnv.
     *
     * @param filterEnv Evaluated environment values. Repeated or comma-separated values are
     *     combined with OR. (optional)
     * @return ListDeploymentRuleEvaluationsOptionalParameters
     */
    public ListDeploymentRuleEvaluationsOptionalParameters filterEnv(List<String> filterEnv) {
      this.filterEnv = filterEnv;
      return this;
    }

    /**
     * Set filterIdentifier.
     *
     * @param filterIdentifier Gate identifier values. Repeated or comma-separated values are
     *     combined with OR. (optional)
     * @return ListDeploymentRuleEvaluationsOptionalParameters
     */
    public ListDeploymentRuleEvaluationsOptionalParameters filterIdentifier(
        List<String> filterIdentifier) {
      this.filterIdentifier = filterIdentifier;
      return this;
    }

    /**
     * Set filterVersion.
     *
     * @param filterVersion Evaluated deployment version values. Repeated or comma-separated values
     *     are combined with OR. (optional)
     * @return ListDeploymentRuleEvaluationsOptionalParameters
     */
    public ListDeploymentRuleEvaluationsOptionalParameters filterVersion(
        List<String> filterVersion) {
      this.filterVersion = filterVersion;
      return this;
    }

    /**
     * Set filterStatus.
     *
     * @param filterStatus Rule statuses. Repeated or comma-separated values are combined with OR.
     *     (optional)
     * @return ListDeploymentRuleEvaluationsOptionalParameters
     */
    public ListDeploymentRuleEvaluationsOptionalParameters filterStatus(
        List<DeploymentGatesEvaluationResultResponseAttributesGateStatus> filterStatus) {
      this.filterStatus = filterStatus;
      return this;
    }

    /**
     * Set filterType.
     *
     * @param filterType Rule types. Repeated or comma-separated values are combined with OR.
     *     Defaults to all rule types. (optional)
     * @return ListDeploymentRuleEvaluationsOptionalParameters
     */
    public ListDeploymentRuleEvaluationsOptionalParameters filterType(
        List<DeploymentGateRuleEvaluationType> filterType) {
      this.filterType = filterType;
      return this;
    }

    /**
     * Set filterDryRun.
     *
     * @param filterDryRun Rule-level dry-run state. A failed dry-run rule is ignored when computing
     *     the gate outcome. (optional)
     * @return ListDeploymentRuleEvaluationsOptionalParameters
     */
    public ListDeploymentRuleEvaluationsOptionalParameters filterDryRun(Boolean filterDryRun) {
      this.filterDryRun = filterDryRun;
      return this;
    }

    /**
     * Set filterGateDryRun.
     *
     * @param filterGateDryRun Gate-level dry-run state. A failed dry-run gate blocks but does not
     *     stop deployment. (optional)
     * @return ListDeploymentRuleEvaluationsOptionalParameters
     */
    public ListDeploymentRuleEvaluationsOptionalParameters filterGateDryRun(
        Boolean filterGateDryRun) {
      this.filterGateDryRun = filterGateDryRun;
      return this;
    }

    /**
     * Set filterName.
     *
     * @param filterName Rule names. Repeated or comma-separated values are combined with OR.
     *     (optional)
     * @return ListDeploymentRuleEvaluationsOptionalParameters
     */
    public ListDeploymentRuleEvaluationsOptionalParameters filterName(List<String> filterName) {
      this.filterName = filterName;
      return this;
    }

    /**
     * Set pageSize.
     *
     * @param pageSize Maximum rule evaluations returned. (optional, default to 50)
     * @return ListDeploymentRuleEvaluationsOptionalParameters
     */
    public ListDeploymentRuleEvaluationsOptionalParameters pageSize(Long pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set pageCursor.
     *
     * @param pageCursor Opaque cursor returned in <code>meta.page.next_cursor</code> by the
     *     previous page. Invalid cursors return 400. (optional)
     * @return ListDeploymentRuleEvaluationsOptionalParameters
     */
    public ListDeploymentRuleEvaluationsOptionalParameters pageCursor(String pageCursor) {
      this.pageCursor = pageCursor;
      return this;
    }
  }

  /**
   * List deployment gate rule evaluations.
   *
   * <p>See {@link #listDeploymentRuleEvaluationsWithHttpInfo}.
   *
   * @return DeploymentGateRuleEvaluationsResponse
   * @throws ApiException if fails to make API call
   */
  public DeploymentGateRuleEvaluationsResponse listDeploymentRuleEvaluations() throws ApiException {
    return listDeploymentRuleEvaluationsWithHttpInfo(
            new ListDeploymentRuleEvaluationsOptionalParameters())
        .getData();
  }

  /**
   * List deployment gate rule evaluations.
   *
   * <p>See {@link #listDeploymentRuleEvaluationsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;DeploymentGateRuleEvaluationsResponse&gt;
   */
  public CompletableFuture<DeploymentGateRuleEvaluationsResponse>
      listDeploymentRuleEvaluationsAsync() {
    return listDeploymentRuleEvaluationsWithHttpInfoAsync(
            new ListDeploymentRuleEvaluationsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List deployment gate rule evaluations.
   *
   * <p>See {@link #listDeploymentRuleEvaluationsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return DeploymentGateRuleEvaluationsResponse
   * @throws ApiException if fails to make API call
   */
  public DeploymentGateRuleEvaluationsResponse listDeploymentRuleEvaluations(
      ListDeploymentRuleEvaluationsOptionalParameters parameters) throws ApiException {
    return listDeploymentRuleEvaluationsWithHttpInfo(parameters).getData();
  }

  /**
   * List deployment gate rule evaluations.
   *
   * <p>See {@link #listDeploymentRuleEvaluationsWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;DeploymentGateRuleEvaluationsResponse&gt;
   */
  public CompletableFuture<DeploymentGateRuleEvaluationsResponse>
      listDeploymentRuleEvaluationsAsync(
          ListDeploymentRuleEvaluationsOptionalParameters parameters) {
    return listDeploymentRuleEvaluationsWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List deployment gate rule evaluations.
   *
   * <p>See {@link #listDeploymentRuleEvaluationsWithHttpInfo}.
   *
   * @return PaginationIterable&lt;DeploymentGateRuleEvaluationData&gt;
   */
  public PaginationIterable<DeploymentGateRuleEvaluationData>
      listDeploymentRuleEvaluationsWithPagination() {
    ListDeploymentRuleEvaluationsOptionalParameters parameters =
        new ListDeploymentRuleEvaluationsOptionalParameters();
    return listDeploymentRuleEvaluationsWithPagination(parameters);
  }

  /**
   * List deployment gate rule evaluations.
   *
   * <p>See {@link #listDeploymentRuleEvaluationsWithHttpInfo}.
   *
   * @return DeploymentGateRuleEvaluationsResponse
   */
  public PaginationIterable<DeploymentGateRuleEvaluationData>
      listDeploymentRuleEvaluationsWithPagination(
          ListDeploymentRuleEvaluationsOptionalParameters parameters) {
    String resultsPath = "getData";
    String valueGetterPath = "getMeta.getPage.getNextCursor";
    String valueSetterPath = "pageCursor";
    Boolean valueSetterParamOptional = true;
    Long limit;

    if (parameters.pageSize == null) {
      limit = 50l;
      parameters.pageSize(limit);
    } else {
      limit = parameters.pageSize;
    }

    LinkedHashMap<String, Object> args = new LinkedHashMap<String, Object>();
    args.put("optionalParams", parameters);

    PaginationIterable iterator =
        new PaginationIterable(
            this,
            "listDeploymentRuleEvaluations",
            resultsPath,
            valueGetterPath,
            valueSetterPath,
            valueSetterParamOptional,
            true,
            true,
            limit,
            args,
            0);

    return iterator;
  }

  /**
   * Returns rule evaluations whose gate evaluation started in a maximum 30-day window (the default
   * is the previous 24 hours). Filter by gate, rule, gate evaluation, or rule evaluation ID; omit
   * IDs for cross-evaluation searches. Results are ordered by start time, newest first. In-progress
   * state is near-real-time and mutable. Finished state is eventually consistent. Gate-level and
   * rule-level dry-run states are independent. Pagination is deterministic but not snapshot
   * isolated; clients should deduplicate by rule evaluation ID.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;DeploymentGateRuleEvaluationsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad request. </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<DeploymentGateRuleEvaluationsResponse>
      listDeploymentRuleEvaluationsWithHttpInfo(
          ListDeploymentRuleEvaluationsOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listDeploymentRuleEvaluations";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    OffsetDateTime filterFrom = parameters.filterFrom;
    OffsetDateTime filterTo = parameters.filterTo;
    UUID filterGateEvaluationId = parameters.filterGateEvaluationId;
    UUID filterEvaluationId = parameters.filterEvaluationId;
    UUID filterGateId = parameters.filterGateId;
    UUID filterRuleId = parameters.filterRuleId;
    List<String> filterService = parameters.filterService;
    List<String> filterEnv = parameters.filterEnv;
    List<String> filterIdentifier = parameters.filterIdentifier;
    List<String> filterVersion = parameters.filterVersion;
    List<DeploymentGatesEvaluationResultResponseAttributesGateStatus> filterStatus =
        parameters.filterStatus;
    List<DeploymentGateRuleEvaluationType> filterType = parameters.filterType;
    Boolean filterDryRun = parameters.filterDryRun;
    Boolean filterGateDryRun = parameters.filterGateDryRun;
    List<String> filterName = parameters.filterName;
    Long pageSize = parameters.pageSize;
    String pageCursor = parameters.pageCursor;
    // create path and map variables
    String localVarPath = "/api/v2/deployment_gates/evaluations/rules";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[from]", filterFrom));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[to]", filterTo));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[gate_evaluation_id]", filterGateEvaluationId));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[evaluation_id]", filterEvaluationId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[gate_id]", filterGateId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[rule_id]", filterRuleId));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("multi", "filter[service]", filterService));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[env]", filterEnv));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("multi", "filter[identifier]", filterIdentifier));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("multi", "filter[version]", filterVersion));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[status]", filterStatus));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[type]", filterType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[dry_run]", filterDryRun));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[gate_dry_run]", filterGateDryRun));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[name]", filterName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[cursor]", pageCursor));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.DeploymentGatesApi.listDeploymentRuleEvaluations",
            localVarPath,
            localVarQueryParams,
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
        new GenericType<DeploymentGateRuleEvaluationsResponse>() {});
  }

  /**
   * List deployment gate rule evaluations.
   *
   * <p>See {@link #listDeploymentRuleEvaluationsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;DeploymentGateRuleEvaluationsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<DeploymentGateRuleEvaluationsResponse>>
      listDeploymentRuleEvaluationsWithHttpInfoAsync(
          ListDeploymentRuleEvaluationsOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listDeploymentRuleEvaluations";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<DeploymentGateRuleEvaluationsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    OffsetDateTime filterFrom = parameters.filterFrom;
    OffsetDateTime filterTo = parameters.filterTo;
    UUID filterGateEvaluationId = parameters.filterGateEvaluationId;
    UUID filterEvaluationId = parameters.filterEvaluationId;
    UUID filterGateId = parameters.filterGateId;
    UUID filterRuleId = parameters.filterRuleId;
    List<String> filterService = parameters.filterService;
    List<String> filterEnv = parameters.filterEnv;
    List<String> filterIdentifier = parameters.filterIdentifier;
    List<String> filterVersion = parameters.filterVersion;
    List<DeploymentGatesEvaluationResultResponseAttributesGateStatus> filterStatus =
        parameters.filterStatus;
    List<DeploymentGateRuleEvaluationType> filterType = parameters.filterType;
    Boolean filterDryRun = parameters.filterDryRun;
    Boolean filterGateDryRun = parameters.filterGateDryRun;
    List<String> filterName = parameters.filterName;
    Long pageSize = parameters.pageSize;
    String pageCursor = parameters.pageCursor;
    // create path and map variables
    String localVarPath = "/api/v2/deployment_gates/evaluations/rules";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[from]", filterFrom));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[to]", filterTo));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[gate_evaluation_id]", filterGateEvaluationId));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[evaluation_id]", filterEvaluationId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[gate_id]", filterGateId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[rule_id]", filterRuleId));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("multi", "filter[service]", filterService));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[env]", filterEnv));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("multi", "filter[identifier]", filterIdentifier));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("multi", "filter[version]", filterVersion));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[status]", filterStatus));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[type]", filterType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[dry_run]", filterDryRun));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[gate_dry_run]", filterGateDryRun));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[name]", filterName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[cursor]", pageCursor));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.DeploymentGatesApi.listDeploymentRuleEvaluations",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<DeploymentGateRuleEvaluationsResponse>> result =
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
        new GenericType<DeploymentGateRuleEvaluationsResponse>() {});
  }

  /**
   * Trigger a deployment gate evaluation.
   *
   * <p>See {@link #triggerDeploymentGatesEvaluationWithHttpInfo}.
   *
   * @param body (required)
   * @return DeploymentGatesEvaluationResponse
   * @throws ApiException if fails to make API call
   */
  public DeploymentGatesEvaluationResponse triggerDeploymentGatesEvaluation(
      DeploymentGatesEvaluationRequest body) throws ApiException {
    return triggerDeploymentGatesEvaluationWithHttpInfo(body).getData();
  }

  /**
   * Trigger a deployment gate evaluation.
   *
   * <p>See {@link #triggerDeploymentGatesEvaluationWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;DeploymentGatesEvaluationResponse&gt;
   */
  public CompletableFuture<DeploymentGatesEvaluationResponse> triggerDeploymentGatesEvaluationAsync(
      DeploymentGatesEvaluationRequest body) {
    return triggerDeploymentGatesEvaluationWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Triggers an asynchronous deployment gate evaluation for the given service and environment.
   * Returns an evaluation ID that can be used to poll for the result via the <code>
   * GET /api/v2/deployments/gates/evaluation/{id}</code> endpoint.
   *
   * <p>When the <code>configuration</code> attribute is provided, rules are evaluated inline from
   * that configuration and no pre-configured gate is required. When <code>configuration</code> is
   * omitted, rules are resolved from the gate pre-configured for the given service and environment
   * through the Datadog UI, API, or Terraform.
   *
   * @param body (required)
   * @return ApiResponse&lt;DeploymentGatesEvaluationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
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
  public ApiResponse<DeploymentGatesEvaluationResponse>
      triggerDeploymentGatesEvaluationWithHttpInfo(DeploymentGatesEvaluationRequest body)
          throws ApiException {
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
      throw new ApiException(
          400,
          "Missing the required parameter 'body' when calling triggerDeploymentGatesEvaluation");
    }
    // create path and map variables
    String localVarPath = "/api/v2/deployments/gates/evaluation";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.DeploymentGatesApi.triggerDeploymentGatesEvaluation",
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
        new GenericType<DeploymentGatesEvaluationResponse>() {});
  }

  /**
   * Trigger a deployment gate evaluation.
   *
   * <p>See {@link #triggerDeploymentGatesEvaluationWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;DeploymentGatesEvaluationResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<DeploymentGatesEvaluationResponse>>
      triggerDeploymentGatesEvaluationWithHttpInfoAsync(DeploymentGatesEvaluationRequest body) {
    // Check if unstable operation is enabled
    String operationId = "triggerDeploymentGatesEvaluation";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<DeploymentGatesEvaluationResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<DeploymentGatesEvaluationResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " triggerDeploymentGatesEvaluation"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/deployments/gates/evaluation";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.DeploymentGatesApi.triggerDeploymentGatesEvaluation",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<DeploymentGatesEvaluationResponse>> result =
          new CompletableFuture<>();
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
        new GenericType<DeploymentGatesEvaluationResponse>() {});
  }

  /**
   * Update deployment gate.
   *
   * <p>See {@link #updateDeploymentGateWithHttpInfo}.
   *
   * @param id The ID of the deployment gate. (required)
   * @param body (required)
   * @return DeploymentGateResponse
   * @throws ApiException if fails to make API call
   */
  public DeploymentGateResponse updateDeploymentGate(String id, UpdateDeploymentGateParams body)
      throws ApiException {
    return updateDeploymentGateWithHttpInfo(id, body).getData();
  }

  /**
   * Update deployment gate.
   *
   * <p>See {@link #updateDeploymentGateWithHttpInfoAsync}.
   *
   * @param id The ID of the deployment gate. (required)
   * @param body (required)
   * @return CompletableFuture&lt;DeploymentGateResponse&gt;
   */
  public CompletableFuture<DeploymentGateResponse> updateDeploymentGateAsync(
      String id, UpdateDeploymentGateParams body) {
    return updateDeploymentGateWithHttpInfoAsync(id, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Endpoint to update a deployment gate.
   *
   * @param id The ID of the deployment gate. (required)
   * @param body (required)
   * @return ApiResponse&lt;DeploymentGateResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
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
  public ApiResponse<DeploymentGateResponse> updateDeploymentGateWithHttpInfo(
      String id, UpdateDeploymentGateParams body) throws ApiException {
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
      throw new ApiException(
          400, "Missing the required parameter 'id' when calling updateDeploymentGate");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateDeploymentGate");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/deployment_gates/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.DeploymentGatesApi.updateDeploymentGate",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "PUT",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<DeploymentGateResponse>() {});
  }

  /**
   * Update deployment gate.
   *
   * <p>See {@link #updateDeploymentGateWithHttpInfo}.
   *
   * @param id The ID of the deployment gate. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;DeploymentGateResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<DeploymentGateResponse>>
      updateDeploymentGateWithHttpInfoAsync(String id, UpdateDeploymentGateParams body) {
    // Check if unstable operation is enabled
    String operationId = "updateDeploymentGate";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<DeploymentGateResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'id' is set
    if (id == null) {
      CompletableFuture<ApiResponse<DeploymentGateResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'id' when calling updateDeploymentGate"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<DeploymentGateResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateDeploymentGate"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/deployment_gates/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.DeploymentGatesApi.updateDeploymentGate",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<DeploymentGateResponse>> result = new CompletableFuture<>();
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
        new GenericType<DeploymentGateResponse>() {});
  }

  /**
   * Update deployment rule.
   *
   * <p>See {@link #updateDeploymentRuleWithHttpInfo}.
   *
   * @param gateId The ID of the deployment gate. (required)
   * @param id The ID of the deployment rule. (required)
   * @param body (required)
   * @return DeploymentRuleResponse
   * @throws ApiException if fails to make API call
   */
  public DeploymentRuleResponse updateDeploymentRule(
      String gateId, String id, UpdateDeploymentRuleParams body) throws ApiException {
    return updateDeploymentRuleWithHttpInfo(gateId, id, body).getData();
  }

  /**
   * Update deployment rule.
   *
   * <p>See {@link #updateDeploymentRuleWithHttpInfoAsync}.
   *
   * @param gateId The ID of the deployment gate. (required)
   * @param id The ID of the deployment rule. (required)
   * @param body (required)
   * @return CompletableFuture&lt;DeploymentRuleResponse&gt;
   */
  public CompletableFuture<DeploymentRuleResponse> updateDeploymentRuleAsync(
      String gateId, String id, UpdateDeploymentRuleParams body) {
    return updateDeploymentRuleWithHttpInfoAsync(gateId, id, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Endpoint to update a deployment rule.
   *
   * @param gateId The ID of the deployment gate. (required)
   * @param id The ID of the deployment rule. (required)
   * @param body (required)
   * @return ApiResponse&lt;DeploymentRuleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
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
  public ApiResponse<DeploymentRuleResponse> updateDeploymentRuleWithHttpInfo(
      String gateId, String id, UpdateDeploymentRuleParams body) throws ApiException {
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
      throw new ApiException(
          400, "Missing the required parameter 'gateId' when calling updateDeploymentRule");
    }

    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(
          400, "Missing the required parameter 'id' when calling updateDeploymentRule");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateDeploymentRule");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/deployment_gates/{gate_id}/rules/{id}"
            .replaceAll("\\{" + "gate_id" + "\\}", apiClient.escapeString(gateId.toString()))
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.DeploymentGatesApi.updateDeploymentRule",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "PUT",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<DeploymentRuleResponse>() {});
  }

  /**
   * Update deployment rule.
   *
   * <p>See {@link #updateDeploymentRuleWithHttpInfo}.
   *
   * @param gateId The ID of the deployment gate. (required)
   * @param id The ID of the deployment rule. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;DeploymentRuleResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<DeploymentRuleResponse>>
      updateDeploymentRuleWithHttpInfoAsync(
          String gateId, String id, UpdateDeploymentRuleParams body) {
    // Check if unstable operation is enabled
    String operationId = "updateDeploymentRule";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<DeploymentRuleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'gateId' is set
    if (gateId == null) {
      CompletableFuture<ApiResponse<DeploymentRuleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'gateId' when calling updateDeploymentRule"));
      return result;
    }

    // verify the required parameter 'id' is set
    if (id == null) {
      CompletableFuture<ApiResponse<DeploymentRuleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'id' when calling updateDeploymentRule"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<DeploymentRuleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateDeploymentRule"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/deployment_gates/{gate_id}/rules/{id}"
            .replaceAll("\\{" + "gate_id" + "\\}", apiClient.escapeString(gateId.toString()))
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.DeploymentGatesApi.updateDeploymentRule",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<DeploymentRuleResponse>> result = new CompletableFuture<>();
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
        new GenericType<DeploymentRuleResponse>() {});
  }
}
