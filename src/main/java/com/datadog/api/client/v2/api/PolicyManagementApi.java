package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.PolicyResultResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class PolicyManagementApi {
  private ApiClient apiClient;

  public PolicyManagementApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public PolicyManagementApi(ApiClient apiClient) {
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
   * Evaluate policy result.
   *
   * <p>See {@link #evaluatePolicyResultWithHttpInfo}.
   *
   * @param policyType The type of policy to evaluate (e.g., SAML, HIPAA). (required)
   * @return PolicyResultResponse
   * @throws ApiException if fails to make API call
   */
  public PolicyResultResponse evaluatePolicyResult(String policyType) throws ApiException {
    return evaluatePolicyResultWithHttpInfo(policyType).getData();
  }

  /**
   * Evaluate policy result.
   *
   * <p>See {@link #evaluatePolicyResultWithHttpInfoAsync}.
   *
   * @param policyType The type of policy to evaluate (e.g., SAML, HIPAA). (required)
   * @return CompletableFuture&lt;PolicyResultResponse&gt;
   */
  public CompletableFuture<PolicyResultResponse> evaluatePolicyResultAsync(String policyType) {
    return evaluatePolicyResultWithHttpInfoAsync(policyType)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Retrieve the evaluation result for a specific policy type.
   *
   * @param policyType The type of policy to evaluate (e.g., SAML, HIPAA). (required)
   * @return ApiResponse&lt;PolicyResultResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<PolicyResultResponse> evaluatePolicyResultWithHttpInfo(String policyType)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "evaluatePolicyResult";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'policyType' is set
    if (policyType == null) {
      throw new ApiException(
          400, "Missing the required parameter 'policyType' when calling evaluatePolicyResult");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/policy/{policy_type}/result"
            .replaceAll(
                "\\{" + "policy_type" + "\\}", apiClient.escapeString(policyType.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.PolicyManagementApi.evaluatePolicyResult",
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
        new GenericType<PolicyResultResponse>() {});
  }

  /**
   * Evaluate policy result.
   *
   * <p>See {@link #evaluatePolicyResultWithHttpInfo}.
   *
   * @param policyType The type of policy to evaluate (e.g., SAML, HIPAA). (required)
   * @return CompletableFuture&lt;ApiResponse&lt;PolicyResultResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<PolicyResultResponse>> evaluatePolicyResultWithHttpInfoAsync(
      String policyType) {
    // Check if unstable operation is enabled
    String operationId = "evaluatePolicyResult";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<PolicyResultResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'policyType' is set
    if (policyType == null) {
      CompletableFuture<ApiResponse<PolicyResultResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'policyType' when calling evaluatePolicyResult"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/policy/{policy_type}/result"
            .replaceAll(
                "\\{" + "policy_type" + "\\}", apiClient.escapeString(policyType.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.PolicyManagementApi.evaluatePolicyResult",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<PolicyResultResponse>> result = new CompletableFuture<>();
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
        new GenericType<PolicyResultResponse>() {});
  }
}
