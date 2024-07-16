package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.PaginationIterable;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.BulkMuteFindingsRequest;
import com.datadog.api.client.v2.model.BulkMuteFindingsResponse;
import com.datadog.api.client.v2.model.Finding;
import com.datadog.api.client.v2.model.FindingEvaluation;
import com.datadog.api.client.v2.model.FindingStatus;
import com.datadog.api.client.v2.model.GetFindingResponse;
import com.datadog.api.client.v2.model.ListFindingsResponse;
import com.datadog.api.client.v2.model.SecurityFilterCreateRequest;
import com.datadog.api.client.v2.model.SecurityFilterResponse;
import com.datadog.api.client.v2.model.SecurityFilterUpdateRequest;
import com.datadog.api.client.v2.model.SecurityFiltersResponse;
import com.datadog.api.client.v2.model.SecurityMonitoringListRulesResponse;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleConvertPayload;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleConvertResponse;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleCreatePayload;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleResponse;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleTestRequest;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleTestResponse;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleUpdatePayload;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleValidatePayload;
import com.datadog.api.client.v2.model.SecurityMonitoringSignal;
import com.datadog.api.client.v2.model.SecurityMonitoringSignalAssigneeUpdateRequest;
import com.datadog.api.client.v2.model.SecurityMonitoringSignalIncidentsUpdateRequest;
import com.datadog.api.client.v2.model.SecurityMonitoringSignalListRequest;
import com.datadog.api.client.v2.model.SecurityMonitoringSignalListRequestPage;
import com.datadog.api.client.v2.model.SecurityMonitoringSignalResponse;
import com.datadog.api.client.v2.model.SecurityMonitoringSignalStateUpdateRequest;
import com.datadog.api.client.v2.model.SecurityMonitoringSignalTriageUpdateResponse;
import com.datadog.api.client.v2.model.SecurityMonitoringSignalsListResponse;
import com.datadog.api.client.v2.model.SecurityMonitoringSignalsSort;
import com.datadog.api.client.v2.model.SecurityMonitoringSuppressionCreateRequest;
import com.datadog.api.client.v2.model.SecurityMonitoringSuppressionResponse;
import com.datadog.api.client.v2.model.SecurityMonitoringSuppressionUpdateRequest;
import com.datadog.api.client.v2.model.SecurityMonitoringSuppressionsResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityMonitoringApi {
  private ApiClient apiClient;

  public SecurityMonitoringApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public SecurityMonitoringApi(ApiClient apiClient) {
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
   * Convert an existing rule from JSON to Terraform.
   *
   * <p>See {@link #convertExistingSecurityMonitoringRuleWithHttpInfo}.
   *
   * @param ruleId The ID of the rule. (required)
   * @return SecurityMonitoringRuleConvertResponse
   * @throws ApiException if fails to make API call
   */
  public SecurityMonitoringRuleConvertResponse convertExistingSecurityMonitoringRule(String ruleId)
      throws ApiException {
    return convertExistingSecurityMonitoringRuleWithHttpInfo(ruleId).getData();
  }

  /**
   * Convert an existing rule from JSON to Terraform.
   *
   * <p>See {@link #convertExistingSecurityMonitoringRuleWithHttpInfoAsync}.
   *
   * @param ruleId The ID of the rule. (required)
   * @return CompletableFuture&lt;SecurityMonitoringRuleConvertResponse&gt;
   */
  public CompletableFuture<SecurityMonitoringRuleConvertResponse>
      convertExistingSecurityMonitoringRuleAsync(String ruleId) {
    return convertExistingSecurityMonitoringRuleWithHttpInfoAsync(ruleId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Convert an existing rule from JSON to Terraform for datadog provider resource
   * datadog_security_monitoring_rule.
   *
   * @param ruleId The ID of the rule. (required)
   * @return ApiResponse&lt;SecurityMonitoringRuleConvertResponse&gt;
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
  public ApiResponse<SecurityMonitoringRuleConvertResponse>
      convertExistingSecurityMonitoringRuleWithHttpInfo(String ruleId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "convertExistingSecurityMonitoringRule";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'ruleId' is set
    if (ruleId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'ruleId' when calling"
              + " convertExistingSecurityMonitoringRule");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/security_monitoring/rules/{rule_id}/convert"
            .replaceAll("\\{" + "rule_id" + "\\}", apiClient.escapeString(ruleId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SecurityMonitoringApi.convertExistingSecurityMonitoringRule",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<SecurityMonitoringRuleConvertResponse>() {});
  }

  /**
   * Convert an existing rule from JSON to Terraform.
   *
   * <p>See {@link #convertExistingSecurityMonitoringRuleWithHttpInfo}.
   *
   * @param ruleId The ID of the rule. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SecurityMonitoringRuleConvertResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SecurityMonitoringRuleConvertResponse>>
      convertExistingSecurityMonitoringRuleWithHttpInfoAsync(String ruleId) {
    // Check if unstable operation is enabled
    String operationId = "convertExistingSecurityMonitoringRule";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<SecurityMonitoringRuleConvertResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'ruleId' is set
    if (ruleId == null) {
      CompletableFuture<ApiResponse<SecurityMonitoringRuleConvertResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'ruleId' when calling"
                  + " convertExistingSecurityMonitoringRule"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/security_monitoring/rules/{rule_id}/convert"
            .replaceAll("\\{" + "rule_id" + "\\}", apiClient.escapeString(ruleId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SecurityMonitoringApi.convertExistingSecurityMonitoringRule",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SecurityMonitoringRuleConvertResponse>> result =
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
        new GenericType<SecurityMonitoringRuleConvertResponse>() {});
  }

  /**
   * Convert a rule from JSON to Terraform.
   *
   * <p>See {@link #convertSecurityMonitoringRuleFromJSONToTerraformWithHttpInfo}.
   *
   * @param body (required)
   * @return SecurityMonitoringRuleConvertResponse
   * @throws ApiException if fails to make API call
   */
  public SecurityMonitoringRuleConvertResponse convertSecurityMonitoringRuleFromJSONToTerraform(
      SecurityMonitoringRuleConvertPayload body) throws ApiException {
    return convertSecurityMonitoringRuleFromJSONToTerraformWithHttpInfo(body).getData();
  }

  /**
   * Convert a rule from JSON to Terraform.
   *
   * <p>See {@link #convertSecurityMonitoringRuleFromJSONToTerraformWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;SecurityMonitoringRuleConvertResponse&gt;
   */
  public CompletableFuture<SecurityMonitoringRuleConvertResponse>
      convertSecurityMonitoringRuleFromJSONToTerraformAsync(
          SecurityMonitoringRuleConvertPayload body) {
    return convertSecurityMonitoringRuleFromJSONToTerraformWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Convert a rule that doesn't (yet) exist from JSON to Terraform for datadog provider resource
   * datadog_security_monitoring_rule.
   *
   * @param body (required)
   * @return ApiResponse&lt;SecurityMonitoringRuleConvertResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Concurrent Modification </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SecurityMonitoringRuleConvertResponse>
      convertSecurityMonitoringRuleFromJSONToTerraformWithHttpInfo(
          SecurityMonitoringRuleConvertPayload body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "convertSecurityMonitoringRuleFromJSONToTerraform";
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
          "Missing the required parameter 'body' when calling"
              + " convertSecurityMonitoringRuleFromJSONToTerraform");
    }
    // create path and map variables
    String localVarPath = "/api/v2/security_monitoring/rules/convert";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SecurityMonitoringApi.convertSecurityMonitoringRuleFromJSONToTerraform",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<SecurityMonitoringRuleConvertResponse>() {});
  }

  /**
   * Convert a rule from JSON to Terraform.
   *
   * <p>See {@link #convertSecurityMonitoringRuleFromJSONToTerraformWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SecurityMonitoringRuleConvertResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SecurityMonitoringRuleConvertResponse>>
      convertSecurityMonitoringRuleFromJSONToTerraformWithHttpInfoAsync(
          SecurityMonitoringRuleConvertPayload body) {
    // Check if unstable operation is enabled
    String operationId = "convertSecurityMonitoringRuleFromJSONToTerraform";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<SecurityMonitoringRuleConvertResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<SecurityMonitoringRuleConvertResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " convertSecurityMonitoringRuleFromJSONToTerraform"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/security_monitoring/rules/convert";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SecurityMonitoringApi.convertSecurityMonitoringRuleFromJSONToTerraform",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SecurityMonitoringRuleConvertResponse>> result =
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
        new GenericType<SecurityMonitoringRuleConvertResponse>() {});
  }

  /**
   * Create a security filter.
   *
   * <p>See {@link #createSecurityFilterWithHttpInfo}.
   *
   * @param body The definition of the new security filter. (required)
   * @return SecurityFilterResponse
   * @throws ApiException if fails to make API call
   */
  public SecurityFilterResponse createSecurityFilter(SecurityFilterCreateRequest body)
      throws ApiException {
    return createSecurityFilterWithHttpInfo(body).getData();
  }

  /**
   * Create a security filter.
   *
   * <p>See {@link #createSecurityFilterWithHttpInfoAsync}.
   *
   * @param body The definition of the new security filter. (required)
   * @return CompletableFuture&lt;SecurityFilterResponse&gt;
   */
  public CompletableFuture<SecurityFilterResponse> createSecurityFilterAsync(
      SecurityFilterCreateRequest body) {
    return createSecurityFilterWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a security filter.
   *
   * <p>See the <a
   * href="https://docs.datadoghq.com/security_platform/guide/how-to-setup-security-filters-using-security-monitoring-api/">security
   * filter guide</a> for more examples.
   *
   * @param body The definition of the new security filter. (required)
   * @return ApiResponse&lt;SecurityFilterResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SecurityFilterResponse> createSecurityFilterWithHttpInfo(
      SecurityFilterCreateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createSecurityFilter");
    }
    // create path and map variables
    String localVarPath = "/api/v2/security_monitoring/configuration/security_filters";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SecurityMonitoringApi.createSecurityFilter",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<SecurityFilterResponse>() {});
  }

  /**
   * Create a security filter.
   *
   * <p>See {@link #createSecurityFilterWithHttpInfo}.
   *
   * @param body The definition of the new security filter. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SecurityFilterResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SecurityFilterResponse>>
      createSecurityFilterWithHttpInfoAsync(SecurityFilterCreateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<SecurityFilterResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createSecurityFilter"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/security_monitoring/configuration/security_filters";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SecurityMonitoringApi.createSecurityFilter",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SecurityFilterResponse>> result = new CompletableFuture<>();
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
        new GenericType<SecurityFilterResponse>() {});
  }

  /**
   * Create a detection rule.
   *
   * <p>See {@link #createSecurityMonitoringRuleWithHttpInfo}.
   *
   * @param body (required)
   * @return SecurityMonitoringRuleResponse
   * @throws ApiException if fails to make API call
   */
  public SecurityMonitoringRuleResponse createSecurityMonitoringRule(
      SecurityMonitoringRuleCreatePayload body) throws ApiException {
    return createSecurityMonitoringRuleWithHttpInfo(body).getData();
  }

  /**
   * Create a detection rule.
   *
   * <p>See {@link #createSecurityMonitoringRuleWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;SecurityMonitoringRuleResponse&gt;
   */
  public CompletableFuture<SecurityMonitoringRuleResponse> createSecurityMonitoringRuleAsync(
      SecurityMonitoringRuleCreatePayload body) {
    return createSecurityMonitoringRuleWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a detection rule.
   *
   * @param body (required)
   * @return ApiResponse&lt;SecurityMonitoringRuleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SecurityMonitoringRuleResponse> createSecurityMonitoringRuleWithHttpInfo(
      SecurityMonitoringRuleCreatePayload body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createSecurityMonitoringRule");
    }
    // create path and map variables
    String localVarPath = "/api/v2/security_monitoring/rules";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SecurityMonitoringApi.createSecurityMonitoringRule",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<SecurityMonitoringRuleResponse>() {});
  }

  /**
   * Create a detection rule.
   *
   * <p>See {@link #createSecurityMonitoringRuleWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SecurityMonitoringRuleResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SecurityMonitoringRuleResponse>>
      createSecurityMonitoringRuleWithHttpInfoAsync(SecurityMonitoringRuleCreatePayload body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<SecurityMonitoringRuleResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling createSecurityMonitoringRule"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/security_monitoring/rules";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SecurityMonitoringApi.createSecurityMonitoringRule",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SecurityMonitoringRuleResponse>> result =
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
        new GenericType<SecurityMonitoringRuleResponse>() {});
  }

  /**
   * Create a suppression rule.
   *
   * <p>See {@link #createSecurityMonitoringSuppressionWithHttpInfo}.
   *
   * @param body The definition of the new suppression rule. (required)
   * @return SecurityMonitoringSuppressionResponse
   * @throws ApiException if fails to make API call
   */
  public SecurityMonitoringSuppressionResponse createSecurityMonitoringSuppression(
      SecurityMonitoringSuppressionCreateRequest body) throws ApiException {
    return createSecurityMonitoringSuppressionWithHttpInfo(body).getData();
  }

  /**
   * Create a suppression rule.
   *
   * <p>See {@link #createSecurityMonitoringSuppressionWithHttpInfoAsync}.
   *
   * @param body The definition of the new suppression rule. (required)
   * @return CompletableFuture&lt;SecurityMonitoringSuppressionResponse&gt;
   */
  public CompletableFuture<SecurityMonitoringSuppressionResponse>
      createSecurityMonitoringSuppressionAsync(SecurityMonitoringSuppressionCreateRequest body) {
    return createSecurityMonitoringSuppressionWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a new suppression rule.
   *
   * @param body The definition of the new suppression rule. (required)
   * @return ApiResponse&lt;SecurityMonitoringSuppressionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SecurityMonitoringSuppressionResponse>
      createSecurityMonitoringSuppressionWithHttpInfo(
          SecurityMonitoringSuppressionCreateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'body' when calling createSecurityMonitoringSuppression");
    }
    // create path and map variables
    String localVarPath = "/api/v2/security_monitoring/configuration/suppressions";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SecurityMonitoringApi.createSecurityMonitoringSuppression",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<SecurityMonitoringSuppressionResponse>() {});
  }

  /**
   * Create a suppression rule.
   *
   * <p>See {@link #createSecurityMonitoringSuppressionWithHttpInfo}.
   *
   * @param body The definition of the new suppression rule. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SecurityMonitoringSuppressionResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SecurityMonitoringSuppressionResponse>>
      createSecurityMonitoringSuppressionWithHttpInfoAsync(
          SecurityMonitoringSuppressionCreateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<SecurityMonitoringSuppressionResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " createSecurityMonitoringSuppression"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/security_monitoring/configuration/suppressions";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SecurityMonitoringApi.createSecurityMonitoringSuppression",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SecurityMonitoringSuppressionResponse>> result =
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
        new GenericType<SecurityMonitoringSuppressionResponse>() {});
  }

  /**
   * Delete a security filter.
   *
   * <p>See {@link #deleteSecurityFilterWithHttpInfo}.
   *
   * @param securityFilterId The ID of the security filter. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteSecurityFilter(String securityFilterId) throws ApiException {
    deleteSecurityFilterWithHttpInfo(securityFilterId);
  }

  /**
   * Delete a security filter.
   *
   * <p>See {@link #deleteSecurityFilterWithHttpInfoAsync}.
   *
   * @param securityFilterId The ID of the security filter. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteSecurityFilterAsync(String securityFilterId) {
    return deleteSecurityFilterWithHttpInfoAsync(securityFilterId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete a specific security filter.
   *
   * @param securityFilterId The ID of the security filter. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteSecurityFilterWithHttpInfo(String securityFilterId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'securityFilterId' is set
    if (securityFilterId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'securityFilterId' when calling deleteSecurityFilter");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/security_monitoring/configuration/security_filters/{security_filter_id}"
            .replaceAll(
                "\\{" + "security_filter_id" + "\\}",
                apiClient.escapeString(securityFilterId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SecurityMonitoringApi.deleteSecurityFilter",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
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
   * Delete a security filter.
   *
   * <p>See {@link #deleteSecurityFilterWithHttpInfo}.
   *
   * @param securityFilterId The ID of the security filter. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteSecurityFilterWithHttpInfoAsync(
      String securityFilterId) {
    Object localVarPostBody = null;

    // verify the required parameter 'securityFilterId' is set
    if (securityFilterId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'securityFilterId' when calling"
                  + " deleteSecurityFilter"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/security_monitoring/configuration/security_filters/{security_filter_id}"
            .replaceAll(
                "\\{" + "security_filter_id" + "\\}",
                apiClient.escapeString(securityFilterId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SecurityMonitoringApi.deleteSecurityFilter",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"*/*"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
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
   * Delete an existing rule.
   *
   * <p>See {@link #deleteSecurityMonitoringRuleWithHttpInfo}.
   *
   * @param ruleId The ID of the rule. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteSecurityMonitoringRule(String ruleId) throws ApiException {
    deleteSecurityMonitoringRuleWithHttpInfo(ruleId);
  }

  /**
   * Delete an existing rule.
   *
   * <p>See {@link #deleteSecurityMonitoringRuleWithHttpInfoAsync}.
   *
   * @param ruleId The ID of the rule. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteSecurityMonitoringRuleAsync(String ruleId) {
    return deleteSecurityMonitoringRuleWithHttpInfoAsync(ruleId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete an existing rule. Default rules cannot be deleted.
   *
   * @param ruleId The ID of the rule. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteSecurityMonitoringRuleWithHttpInfo(String ruleId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'ruleId' is set
    if (ruleId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'ruleId' when calling deleteSecurityMonitoringRule");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/security_monitoring/rules/{rule_id}"
            .replaceAll("\\{" + "rule_id" + "\\}", apiClient.escapeString(ruleId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SecurityMonitoringApi.deleteSecurityMonitoringRule",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
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
   * Delete an existing rule.
   *
   * <p>See {@link #deleteSecurityMonitoringRuleWithHttpInfo}.
   *
   * @param ruleId The ID of the rule. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteSecurityMonitoringRuleWithHttpInfoAsync(
      String ruleId) {
    Object localVarPostBody = null;

    // verify the required parameter 'ruleId' is set
    if (ruleId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'ruleId' when calling deleteSecurityMonitoringRule"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/security_monitoring/rules/{rule_id}"
            .replaceAll("\\{" + "rule_id" + "\\}", apiClient.escapeString(ruleId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SecurityMonitoringApi.deleteSecurityMonitoringRule",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"*/*"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
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
   * Delete a suppression rule.
   *
   * <p>See {@link #deleteSecurityMonitoringSuppressionWithHttpInfo}.
   *
   * @param suppressionId The ID of the suppression rule (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteSecurityMonitoringSuppression(String suppressionId) throws ApiException {
    deleteSecurityMonitoringSuppressionWithHttpInfo(suppressionId);
  }

  /**
   * Delete a suppression rule.
   *
   * <p>See {@link #deleteSecurityMonitoringSuppressionWithHttpInfoAsync}.
   *
   * @param suppressionId The ID of the suppression rule (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteSecurityMonitoringSuppressionAsync(String suppressionId) {
    return deleteSecurityMonitoringSuppressionWithHttpInfoAsync(suppressionId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete a specific suppression rule.
   *
   * @param suppressionId The ID of the suppression rule (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteSecurityMonitoringSuppressionWithHttpInfo(String suppressionId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'suppressionId' is set
    if (suppressionId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'suppressionId' when calling"
              + " deleteSecurityMonitoringSuppression");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/security_monitoring/configuration/suppressions/{suppression_id}"
            .replaceAll(
                "\\{" + "suppression_id" + "\\}", apiClient.escapeString(suppressionId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SecurityMonitoringApi.deleteSecurityMonitoringSuppression",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
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
   * Delete a suppression rule.
   *
   * <p>See {@link #deleteSecurityMonitoringSuppressionWithHttpInfo}.
   *
   * @param suppressionId The ID of the suppression rule (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteSecurityMonitoringSuppressionWithHttpInfoAsync(
      String suppressionId) {
    Object localVarPostBody = null;

    // verify the required parameter 'suppressionId' is set
    if (suppressionId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'suppressionId' when calling"
                  + " deleteSecurityMonitoringSuppression"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/security_monitoring/configuration/suppressions/{suppression_id}"
            .replaceAll(
                "\\{" + "suppression_id" + "\\}", apiClient.escapeString(suppressionId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SecurityMonitoringApi.deleteSecurityMonitoringSuppression",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"*/*"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
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
   * Modify the triage assignee of a security signal.
   *
   * <p>See {@link #editSecurityMonitoringSignalAssigneeWithHttpInfo}.
   *
   * @param signalId The ID of the signal. (required)
   * @param body Attributes describing the signal update. (required)
   * @return SecurityMonitoringSignalTriageUpdateResponse
   * @throws ApiException if fails to make API call
   */
  public SecurityMonitoringSignalTriageUpdateResponse editSecurityMonitoringSignalAssignee(
      String signalId, SecurityMonitoringSignalAssigneeUpdateRequest body) throws ApiException {
    return editSecurityMonitoringSignalAssigneeWithHttpInfo(signalId, body).getData();
  }

  /**
   * Modify the triage assignee of a security signal.
   *
   * <p>See {@link #editSecurityMonitoringSignalAssigneeWithHttpInfoAsync}.
   *
   * @param signalId The ID of the signal. (required)
   * @param body Attributes describing the signal update. (required)
   * @return CompletableFuture&lt;SecurityMonitoringSignalTriageUpdateResponse&gt;
   */
  public CompletableFuture<SecurityMonitoringSignalTriageUpdateResponse>
      editSecurityMonitoringSignalAssigneeAsync(
          String signalId, SecurityMonitoringSignalAssigneeUpdateRequest body) {
    return editSecurityMonitoringSignalAssigneeWithHttpInfoAsync(signalId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Modify the triage assignee of a security signal.
   *
   * @param signalId The ID of the signal. (required)
   * @param body Attributes describing the signal update. (required)
   * @return ApiResponse&lt;SecurityMonitoringSignalTriageUpdateResponse&gt;
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
  public ApiResponse<SecurityMonitoringSignalTriageUpdateResponse>
      editSecurityMonitoringSignalAssigneeWithHttpInfo(
          String signalId, SecurityMonitoringSignalAssigneeUpdateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'signalId' is set
    if (signalId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'signalId' when calling"
              + " editSecurityMonitoringSignalAssignee");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'body' when calling"
              + " editSecurityMonitoringSignalAssignee");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/security_monitoring/signals/{signal_id}/assignee"
            .replaceAll("\\{" + "signal_id" + "\\}", apiClient.escapeString(signalId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SecurityMonitoringApi.editSecurityMonitoringSignalAssignee",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<SecurityMonitoringSignalTriageUpdateResponse>() {});
  }

  /**
   * Modify the triage assignee of a security signal.
   *
   * <p>See {@link #editSecurityMonitoringSignalAssigneeWithHttpInfo}.
   *
   * @param signalId The ID of the signal. (required)
   * @param body Attributes describing the signal update. (required)
   * @return
   *     CompletableFuture&lt;ApiResponse&lt;SecurityMonitoringSignalTriageUpdateResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SecurityMonitoringSignalTriageUpdateResponse>>
      editSecurityMonitoringSignalAssigneeWithHttpInfoAsync(
          String signalId, SecurityMonitoringSignalAssigneeUpdateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'signalId' is set
    if (signalId == null) {
      CompletableFuture<ApiResponse<SecurityMonitoringSignalTriageUpdateResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'signalId' when calling"
                  + " editSecurityMonitoringSignalAssignee"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<SecurityMonitoringSignalTriageUpdateResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " editSecurityMonitoringSignalAssignee"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/security_monitoring/signals/{signal_id}/assignee"
            .replaceAll("\\{" + "signal_id" + "\\}", apiClient.escapeString(signalId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SecurityMonitoringApi.editSecurityMonitoringSignalAssignee",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SecurityMonitoringSignalTriageUpdateResponse>> result =
          new CompletableFuture<>();
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
        new GenericType<SecurityMonitoringSignalTriageUpdateResponse>() {});
  }

  /**
   * Change the related incidents of a security signal.
   *
   * <p>See {@link #editSecurityMonitoringSignalIncidentsWithHttpInfo}.
   *
   * @param signalId The ID of the signal. (required)
   * @param body Attributes describing the signal update. (required)
   * @return SecurityMonitoringSignalTriageUpdateResponse
   * @throws ApiException if fails to make API call
   */
  public SecurityMonitoringSignalTriageUpdateResponse editSecurityMonitoringSignalIncidents(
      String signalId, SecurityMonitoringSignalIncidentsUpdateRequest body) throws ApiException {
    return editSecurityMonitoringSignalIncidentsWithHttpInfo(signalId, body).getData();
  }

  /**
   * Change the related incidents of a security signal.
   *
   * <p>See {@link #editSecurityMonitoringSignalIncidentsWithHttpInfoAsync}.
   *
   * @param signalId The ID of the signal. (required)
   * @param body Attributes describing the signal update. (required)
   * @return CompletableFuture&lt;SecurityMonitoringSignalTriageUpdateResponse&gt;
   */
  public CompletableFuture<SecurityMonitoringSignalTriageUpdateResponse>
      editSecurityMonitoringSignalIncidentsAsync(
          String signalId, SecurityMonitoringSignalIncidentsUpdateRequest body) {
    return editSecurityMonitoringSignalIncidentsWithHttpInfoAsync(signalId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Change the related incidents for a security signal.
   *
   * @param signalId The ID of the signal. (required)
   * @param body Attributes describing the signal update. (required)
   * @return ApiResponse&lt;SecurityMonitoringSignalTriageUpdateResponse&gt;
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
  public ApiResponse<SecurityMonitoringSignalTriageUpdateResponse>
      editSecurityMonitoringSignalIncidentsWithHttpInfo(
          String signalId, SecurityMonitoringSignalIncidentsUpdateRequest body)
          throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'signalId' is set
    if (signalId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'signalId' when calling"
              + " editSecurityMonitoringSignalIncidents");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'body' when calling"
              + " editSecurityMonitoringSignalIncidents");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/security_monitoring/signals/{signal_id}/incidents"
            .replaceAll("\\{" + "signal_id" + "\\}", apiClient.escapeString(signalId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SecurityMonitoringApi.editSecurityMonitoringSignalIncidents",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<SecurityMonitoringSignalTriageUpdateResponse>() {});
  }

  /**
   * Change the related incidents of a security signal.
   *
   * <p>See {@link #editSecurityMonitoringSignalIncidentsWithHttpInfo}.
   *
   * @param signalId The ID of the signal. (required)
   * @param body Attributes describing the signal update. (required)
   * @return
   *     CompletableFuture&lt;ApiResponse&lt;SecurityMonitoringSignalTriageUpdateResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SecurityMonitoringSignalTriageUpdateResponse>>
      editSecurityMonitoringSignalIncidentsWithHttpInfoAsync(
          String signalId, SecurityMonitoringSignalIncidentsUpdateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'signalId' is set
    if (signalId == null) {
      CompletableFuture<ApiResponse<SecurityMonitoringSignalTriageUpdateResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'signalId' when calling"
                  + " editSecurityMonitoringSignalIncidents"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<SecurityMonitoringSignalTriageUpdateResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " editSecurityMonitoringSignalIncidents"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/security_monitoring/signals/{signal_id}/incidents"
            .replaceAll("\\{" + "signal_id" + "\\}", apiClient.escapeString(signalId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SecurityMonitoringApi.editSecurityMonitoringSignalIncidents",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SecurityMonitoringSignalTriageUpdateResponse>> result =
          new CompletableFuture<>();
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
        new GenericType<SecurityMonitoringSignalTriageUpdateResponse>() {});
  }

  /**
   * Change the triage state of a security signal.
   *
   * <p>See {@link #editSecurityMonitoringSignalStateWithHttpInfo}.
   *
   * @param signalId The ID of the signal. (required)
   * @param body Attributes describing the signal update. (required)
   * @return SecurityMonitoringSignalTriageUpdateResponse
   * @throws ApiException if fails to make API call
   */
  public SecurityMonitoringSignalTriageUpdateResponse editSecurityMonitoringSignalState(
      String signalId, SecurityMonitoringSignalStateUpdateRequest body) throws ApiException {
    return editSecurityMonitoringSignalStateWithHttpInfo(signalId, body).getData();
  }

  /**
   * Change the triage state of a security signal.
   *
   * <p>See {@link #editSecurityMonitoringSignalStateWithHttpInfoAsync}.
   *
   * @param signalId The ID of the signal. (required)
   * @param body Attributes describing the signal update. (required)
   * @return CompletableFuture&lt;SecurityMonitoringSignalTriageUpdateResponse&gt;
   */
  public CompletableFuture<SecurityMonitoringSignalTriageUpdateResponse>
      editSecurityMonitoringSignalStateAsync(
          String signalId, SecurityMonitoringSignalStateUpdateRequest body) {
    return editSecurityMonitoringSignalStateWithHttpInfoAsync(signalId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Change the triage state of a security signal.
   *
   * @param signalId The ID of the signal. (required)
   * @param body Attributes describing the signal update. (required)
   * @return ApiResponse&lt;SecurityMonitoringSignalTriageUpdateResponse&gt;
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
  public ApiResponse<SecurityMonitoringSignalTriageUpdateResponse>
      editSecurityMonitoringSignalStateWithHttpInfo(
          String signalId, SecurityMonitoringSignalStateUpdateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'signalId' is set
    if (signalId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'signalId' when calling"
              + " editSecurityMonitoringSignalState");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'body' when calling editSecurityMonitoringSignalState");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/security_monitoring/signals/{signal_id}/state"
            .replaceAll("\\{" + "signal_id" + "\\}", apiClient.escapeString(signalId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SecurityMonitoringApi.editSecurityMonitoringSignalState",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<SecurityMonitoringSignalTriageUpdateResponse>() {});
  }

  /**
   * Change the triage state of a security signal.
   *
   * <p>See {@link #editSecurityMonitoringSignalStateWithHttpInfo}.
   *
   * @param signalId The ID of the signal. (required)
   * @param body Attributes describing the signal update. (required)
   * @return
   *     CompletableFuture&lt;ApiResponse&lt;SecurityMonitoringSignalTriageUpdateResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SecurityMonitoringSignalTriageUpdateResponse>>
      editSecurityMonitoringSignalStateWithHttpInfoAsync(
          String signalId, SecurityMonitoringSignalStateUpdateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'signalId' is set
    if (signalId == null) {
      CompletableFuture<ApiResponse<SecurityMonitoringSignalTriageUpdateResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'signalId' when calling"
                  + " editSecurityMonitoringSignalState"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<SecurityMonitoringSignalTriageUpdateResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " editSecurityMonitoringSignalState"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/security_monitoring/signals/{signal_id}/state"
            .replaceAll("\\{" + "signal_id" + "\\}", apiClient.escapeString(signalId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SecurityMonitoringApi.editSecurityMonitoringSignalState",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SecurityMonitoringSignalTriageUpdateResponse>> result =
          new CompletableFuture<>();
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
        new GenericType<SecurityMonitoringSignalTriageUpdateResponse>() {});
  }

  /** Manage optional parameters to getFinding. */
  public static class GetFindingOptionalParameters {
    private Long snapshotTimestamp;

    /**
     * Set snapshotTimestamp.
     *
     * @param snapshotTimestamp Return the finding for a given snapshot of time (Unix ms).
     *     (optional)
     * @return GetFindingOptionalParameters
     */
    public GetFindingOptionalParameters snapshotTimestamp(Long snapshotTimestamp) {
      this.snapshotTimestamp = snapshotTimestamp;
      return this;
    }
  }

  /**
   * Get a finding.
   *
   * <p>See {@link #getFindingWithHttpInfo}.
   *
   * @param findingId The ID of the finding. (required)
   * @return GetFindingResponse
   * @throws ApiException if fails to make API call
   */
  public GetFindingResponse getFinding(String findingId) throws ApiException {
    return getFindingWithHttpInfo(findingId, new GetFindingOptionalParameters()).getData();
  }

  /**
   * Get a finding.
   *
   * <p>See {@link #getFindingWithHttpInfoAsync}.
   *
   * @param findingId The ID of the finding. (required)
   * @return CompletableFuture&lt;GetFindingResponse&gt;
   */
  public CompletableFuture<GetFindingResponse> getFindingAsync(String findingId) {
    return getFindingWithHttpInfoAsync(findingId, new GetFindingOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a finding.
   *
   * <p>See {@link #getFindingWithHttpInfo}.
   *
   * @param findingId The ID of the finding. (required)
   * @param parameters Optional parameters for the request.
   * @return GetFindingResponse
   * @throws ApiException if fails to make API call
   */
  public GetFindingResponse getFinding(String findingId, GetFindingOptionalParameters parameters)
      throws ApiException {
    return getFindingWithHttpInfo(findingId, parameters).getData();
  }

  /**
   * Get a finding.
   *
   * <p>See {@link #getFindingWithHttpInfoAsync}.
   *
   * @param findingId The ID of the finding. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;GetFindingResponse&gt;
   */
  public CompletableFuture<GetFindingResponse> getFindingAsync(
      String findingId, GetFindingOptionalParameters parameters) {
    return getFindingWithHttpInfoAsync(findingId, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Returns a single finding with message and resource configuration.
   *
   * @param findingId The ID of the finding. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;GetFindingResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request: The server cannot process the request due to invalid syntax in the request. </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden: Access denied </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found: The requested finding cannot be found. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests: The rate limit set by the API has been exceeded. </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<GetFindingResponse> getFindingWithHttpInfo(
      String findingId, GetFindingOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getFinding";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'findingId' is set
    if (findingId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'findingId' when calling getFinding");
    }
    Long snapshotTimestamp = parameters.snapshotTimestamp;
    // create path and map variables
    String localVarPath =
        "/api/v2/posture_management/findings/{finding_id}"
            .replaceAll("\\{" + "finding_id" + "\\}", apiClient.escapeString(findingId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "snapshot_timestamp", snapshotTimestamp));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SecurityMonitoringApi.getFinding",
            localVarPath,
            localVarQueryParams,
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<GetFindingResponse>() {});
  }

  /**
   * Get a finding.
   *
   * <p>See {@link #getFindingWithHttpInfo}.
   *
   * @param findingId The ID of the finding. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;GetFindingResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<GetFindingResponse>> getFindingWithHttpInfoAsync(
      String findingId, GetFindingOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "getFinding";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<GetFindingResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'findingId' is set
    if (findingId == null) {
      CompletableFuture<ApiResponse<GetFindingResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'findingId' when calling getFinding"));
      return result;
    }
    Long snapshotTimestamp = parameters.snapshotTimestamp;
    // create path and map variables
    String localVarPath =
        "/api/v2/posture_management/findings/{finding_id}"
            .replaceAll("\\{" + "finding_id" + "\\}", apiClient.escapeString(findingId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "snapshot_timestamp", snapshotTimestamp));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SecurityMonitoringApi.getFinding",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<GetFindingResponse>> result = new CompletableFuture<>();
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
        new GenericType<GetFindingResponse>() {});
  }

  /**
   * Get a security filter.
   *
   * <p>See {@link #getSecurityFilterWithHttpInfo}.
   *
   * @param securityFilterId The ID of the security filter. (required)
   * @return SecurityFilterResponse
   * @throws ApiException if fails to make API call
   */
  public SecurityFilterResponse getSecurityFilter(String securityFilterId) throws ApiException {
    return getSecurityFilterWithHttpInfo(securityFilterId).getData();
  }

  /**
   * Get a security filter.
   *
   * <p>See {@link #getSecurityFilterWithHttpInfoAsync}.
   *
   * @param securityFilterId The ID of the security filter. (required)
   * @return CompletableFuture&lt;SecurityFilterResponse&gt;
   */
  public CompletableFuture<SecurityFilterResponse> getSecurityFilterAsync(String securityFilterId) {
    return getSecurityFilterWithHttpInfoAsync(securityFilterId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the details of a specific security filter.
   *
   * <p>See the <a
   * href="https://docs.datadoghq.com/security_platform/guide/how-to-setup-security-filters-using-security-monitoring-api/">security
   * filter guide</a> for more examples.
   *
   * @param securityFilterId The ID of the security filter. (required)
   * @return ApiResponse&lt;SecurityFilterResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SecurityFilterResponse> getSecurityFilterWithHttpInfo(String securityFilterId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'securityFilterId' is set
    if (securityFilterId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'securityFilterId' when calling getSecurityFilter");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/security_monitoring/configuration/security_filters/{security_filter_id}"
            .replaceAll(
                "\\{" + "security_filter_id" + "\\}",
                apiClient.escapeString(securityFilterId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SecurityMonitoringApi.getSecurityFilter",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<SecurityFilterResponse>() {});
  }

  /**
   * Get a security filter.
   *
   * <p>See {@link #getSecurityFilterWithHttpInfo}.
   *
   * @param securityFilterId The ID of the security filter. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SecurityFilterResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SecurityFilterResponse>> getSecurityFilterWithHttpInfoAsync(
      String securityFilterId) {
    Object localVarPostBody = null;

    // verify the required parameter 'securityFilterId' is set
    if (securityFilterId == null) {
      CompletableFuture<ApiResponse<SecurityFilterResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'securityFilterId' when calling getSecurityFilter"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/security_monitoring/configuration/security_filters/{security_filter_id}"
            .replaceAll(
                "\\{" + "security_filter_id" + "\\}",
                apiClient.escapeString(securityFilterId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SecurityMonitoringApi.getSecurityFilter",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SecurityFilterResponse>> result = new CompletableFuture<>();
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
        new GenericType<SecurityFilterResponse>() {});
  }

  /**
   * Get a rule&#39;s details.
   *
   * <p>See {@link #getSecurityMonitoringRuleWithHttpInfo}.
   *
   * @param ruleId The ID of the rule. (required)
   * @return SecurityMonitoringRuleResponse
   * @throws ApiException if fails to make API call
   */
  public SecurityMonitoringRuleResponse getSecurityMonitoringRule(String ruleId)
      throws ApiException {
    return getSecurityMonitoringRuleWithHttpInfo(ruleId).getData();
  }

  /**
   * Get a rule&#39;s details.
   *
   * <p>See {@link #getSecurityMonitoringRuleWithHttpInfoAsync}.
   *
   * @param ruleId The ID of the rule. (required)
   * @return CompletableFuture&lt;SecurityMonitoringRuleResponse&gt;
   */
  public CompletableFuture<SecurityMonitoringRuleResponse> getSecurityMonitoringRuleAsync(
      String ruleId) {
    return getSecurityMonitoringRuleWithHttpInfoAsync(ruleId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a rule's details.
   *
   * @param ruleId The ID of the rule. (required)
   * @return ApiResponse&lt;SecurityMonitoringRuleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SecurityMonitoringRuleResponse> getSecurityMonitoringRuleWithHttpInfo(
      String ruleId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'ruleId' is set
    if (ruleId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'ruleId' when calling getSecurityMonitoringRule");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/security_monitoring/rules/{rule_id}"
            .replaceAll("\\{" + "rule_id" + "\\}", apiClient.escapeString(ruleId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SecurityMonitoringApi.getSecurityMonitoringRule",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<SecurityMonitoringRuleResponse>() {});
  }

  /**
   * Get a rule&#39;s details.
   *
   * <p>See {@link #getSecurityMonitoringRuleWithHttpInfo}.
   *
   * @param ruleId The ID of the rule. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SecurityMonitoringRuleResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SecurityMonitoringRuleResponse>>
      getSecurityMonitoringRuleWithHttpInfoAsync(String ruleId) {
    Object localVarPostBody = null;

    // verify the required parameter 'ruleId' is set
    if (ruleId == null) {
      CompletableFuture<ApiResponse<SecurityMonitoringRuleResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'ruleId' when calling getSecurityMonitoringRule"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/security_monitoring/rules/{rule_id}"
            .replaceAll("\\{" + "rule_id" + "\\}", apiClient.escapeString(ruleId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SecurityMonitoringApi.getSecurityMonitoringRule",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SecurityMonitoringRuleResponse>> result =
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
        new GenericType<SecurityMonitoringRuleResponse>() {});
  }

  /**
   * Get a signal&#39;s details.
   *
   * <p>See {@link #getSecurityMonitoringSignalWithHttpInfo}.
   *
   * @param signalId The ID of the signal. (required)
   * @return SecurityMonitoringSignalResponse
   * @throws ApiException if fails to make API call
   */
  public SecurityMonitoringSignalResponse getSecurityMonitoringSignal(String signalId)
      throws ApiException {
    return getSecurityMonitoringSignalWithHttpInfo(signalId).getData();
  }

  /**
   * Get a signal&#39;s details.
   *
   * <p>See {@link #getSecurityMonitoringSignalWithHttpInfoAsync}.
   *
   * @param signalId The ID of the signal. (required)
   * @return CompletableFuture&lt;SecurityMonitoringSignalResponse&gt;
   */
  public CompletableFuture<SecurityMonitoringSignalResponse> getSecurityMonitoringSignalAsync(
      String signalId) {
    return getSecurityMonitoringSignalWithHttpInfoAsync(signalId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a signal's details.
   *
   * @param signalId The ID of the signal. (required)
   * @return ApiResponse&lt;SecurityMonitoringSignalResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SecurityMonitoringSignalResponse> getSecurityMonitoringSignalWithHttpInfo(
      String signalId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'signalId' is set
    if (signalId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'signalId' when calling getSecurityMonitoringSignal");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/security_monitoring/signals/{signal_id}"
            .replaceAll("\\{" + "signal_id" + "\\}", apiClient.escapeString(signalId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SecurityMonitoringApi.getSecurityMonitoringSignal",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<SecurityMonitoringSignalResponse>() {});
  }

  /**
   * Get a signal&#39;s details.
   *
   * <p>See {@link #getSecurityMonitoringSignalWithHttpInfo}.
   *
   * @param signalId The ID of the signal. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SecurityMonitoringSignalResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SecurityMonitoringSignalResponse>>
      getSecurityMonitoringSignalWithHttpInfoAsync(String signalId) {
    Object localVarPostBody = null;

    // verify the required parameter 'signalId' is set
    if (signalId == null) {
      CompletableFuture<ApiResponse<SecurityMonitoringSignalResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'signalId' when calling"
                  + " getSecurityMonitoringSignal"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/security_monitoring/signals/{signal_id}"
            .replaceAll("\\{" + "signal_id" + "\\}", apiClient.escapeString(signalId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SecurityMonitoringApi.getSecurityMonitoringSignal",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SecurityMonitoringSignalResponse>> result =
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
        new GenericType<SecurityMonitoringSignalResponse>() {});
  }

  /**
   * Get a suppression rule.
   *
   * <p>See {@link #getSecurityMonitoringSuppressionWithHttpInfo}.
   *
   * @param suppressionId The ID of the suppression rule (required)
   * @return SecurityMonitoringSuppressionResponse
   * @throws ApiException if fails to make API call
   */
  public SecurityMonitoringSuppressionResponse getSecurityMonitoringSuppression(
      String suppressionId) throws ApiException {
    return getSecurityMonitoringSuppressionWithHttpInfo(suppressionId).getData();
  }

  /**
   * Get a suppression rule.
   *
   * <p>See {@link #getSecurityMonitoringSuppressionWithHttpInfoAsync}.
   *
   * @param suppressionId The ID of the suppression rule (required)
   * @return CompletableFuture&lt;SecurityMonitoringSuppressionResponse&gt;
   */
  public CompletableFuture<SecurityMonitoringSuppressionResponse>
      getSecurityMonitoringSuppressionAsync(String suppressionId) {
    return getSecurityMonitoringSuppressionWithHttpInfoAsync(suppressionId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the details of a specific suppression rule.
   *
   * @param suppressionId The ID of the suppression rule (required)
   * @return ApiResponse&lt;SecurityMonitoringSuppressionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SecurityMonitoringSuppressionResponse>
      getSecurityMonitoringSuppressionWithHttpInfo(String suppressionId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'suppressionId' is set
    if (suppressionId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'suppressionId' when calling"
              + " getSecurityMonitoringSuppression");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/security_monitoring/configuration/suppressions/{suppression_id}"
            .replaceAll(
                "\\{" + "suppression_id" + "\\}", apiClient.escapeString(suppressionId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SecurityMonitoringApi.getSecurityMonitoringSuppression",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<SecurityMonitoringSuppressionResponse>() {});
  }

  /**
   * Get a suppression rule.
   *
   * <p>See {@link #getSecurityMonitoringSuppressionWithHttpInfo}.
   *
   * @param suppressionId The ID of the suppression rule (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SecurityMonitoringSuppressionResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SecurityMonitoringSuppressionResponse>>
      getSecurityMonitoringSuppressionWithHttpInfoAsync(String suppressionId) {
    Object localVarPostBody = null;

    // verify the required parameter 'suppressionId' is set
    if (suppressionId == null) {
      CompletableFuture<ApiResponse<SecurityMonitoringSuppressionResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'suppressionId' when calling"
                  + " getSecurityMonitoringSuppression"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/security_monitoring/configuration/suppressions/{suppression_id}"
            .replaceAll(
                "\\{" + "suppression_id" + "\\}", apiClient.escapeString(suppressionId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SecurityMonitoringApi.getSecurityMonitoringSuppression",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SecurityMonitoringSuppressionResponse>> result =
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
        new GenericType<SecurityMonitoringSuppressionResponse>() {});
  }

  /** Manage optional parameters to listFindings. */
  public static class ListFindingsOptionalParameters {
    private Long pageLimit;
    private Long snapshotTimestamp;
    private String pageCursor;
    private String filterTags;
    private String filterEvaluationChangedAt;
    private Boolean filterMuted;
    private String filterRuleId;
    private String filterRuleName;
    private String filterResourceType;
    private String filterDiscoveryTimestamp;
    private FindingEvaluation filterEvaluation;
    private FindingStatus filterStatus;

    /**
     * Set pageLimit.
     *
     * @param pageLimit Limit the number of findings returned. Must be &lt;= 1000. (optional,
     *     default to 100)
     * @return ListFindingsOptionalParameters
     */
    public ListFindingsOptionalParameters pageLimit(Long pageLimit) {
      this.pageLimit = pageLimit;
      return this;
    }

    /**
     * Set snapshotTimestamp.
     *
     * @param snapshotTimestamp Return findings for a given snapshot of time (Unix ms). (optional)
     * @return ListFindingsOptionalParameters
     */
    public ListFindingsOptionalParameters snapshotTimestamp(Long snapshotTimestamp) {
      this.snapshotTimestamp = snapshotTimestamp;
      return this;
    }

    /**
     * Set pageCursor.
     *
     * @param pageCursor Return the next page of findings pointed to by the cursor. (optional)
     * @return ListFindingsOptionalParameters
     */
    public ListFindingsOptionalParameters pageCursor(String pageCursor) {
      this.pageCursor = pageCursor;
      return this;
    }

    /**
     * Set filterTags.
     *
     * @param filterTags Return findings that have these associated tags (repeatable). (optional)
     * @return ListFindingsOptionalParameters
     */
    public ListFindingsOptionalParameters filterTags(String filterTags) {
      this.filterTags = filterTags;
      return this;
    }

    /**
     * Set filterEvaluationChangedAt.
     *
     * @param filterEvaluationChangedAt Return findings that have changed from pass to fail or vice
     *     versa on a specified date (Unix ms) or date range (using comparison operators).
     *     (optional)
     * @return ListFindingsOptionalParameters
     */
    public ListFindingsOptionalParameters filterEvaluationChangedAt(
        String filterEvaluationChangedAt) {
      this.filterEvaluationChangedAt = filterEvaluationChangedAt;
      return this;
    }

    /**
     * Set filterMuted.
     *
     * @param filterMuted Set to <code>true</code> to return findings that are muted. Set to <code>
     *     false</code> to return unmuted findings. (optional)
     * @return ListFindingsOptionalParameters
     */
    public ListFindingsOptionalParameters filterMuted(Boolean filterMuted) {
      this.filterMuted = filterMuted;
      return this;
    }

    /**
     * Set filterRuleId.
     *
     * @param filterRuleId Return findings for the specified rule ID. (optional)
     * @return ListFindingsOptionalParameters
     */
    public ListFindingsOptionalParameters filterRuleId(String filterRuleId) {
      this.filterRuleId = filterRuleId;
      return this;
    }

    /**
     * Set filterRuleName.
     *
     * @param filterRuleName Return findings for the specified rule. (optional)
     * @return ListFindingsOptionalParameters
     */
    public ListFindingsOptionalParameters filterRuleName(String filterRuleName) {
      this.filterRuleName = filterRuleName;
      return this;
    }

    /**
     * Set filterResourceType.
     *
     * @param filterResourceType Return only findings for the specified resource type. (optional)
     * @return ListFindingsOptionalParameters
     */
    public ListFindingsOptionalParameters filterResourceType(String filterResourceType) {
      this.filterResourceType = filterResourceType;
      return this;
    }

    /**
     * Set filterDiscoveryTimestamp.
     *
     * @param filterDiscoveryTimestamp Return findings that were found on a specified date (Unix ms)
     *     or date range (using comparison operators). (optional)
     * @return ListFindingsOptionalParameters
     */
    public ListFindingsOptionalParameters filterDiscoveryTimestamp(
        String filterDiscoveryTimestamp) {
      this.filterDiscoveryTimestamp = filterDiscoveryTimestamp;
      return this;
    }

    /**
     * Set filterEvaluation.
     *
     * @param filterEvaluation Return only <code>pass</code> or <code>fail</code> findings.
     *     (optional)
     * @return ListFindingsOptionalParameters
     */
    public ListFindingsOptionalParameters filterEvaluation(FindingEvaluation filterEvaluation) {
      this.filterEvaluation = filterEvaluation;
      return this;
    }

    /**
     * Set filterStatus.
     *
     * @param filterStatus Return only findings with the specified status. (optional)
     * @return ListFindingsOptionalParameters
     */
    public ListFindingsOptionalParameters filterStatus(FindingStatus filterStatus) {
      this.filterStatus = filterStatus;
      return this;
    }
  }

  /**
   * List findings.
   *
   * <p>See {@link #listFindingsWithHttpInfo}.
   *
   * @return ListFindingsResponse
   * @throws ApiException if fails to make API call
   */
  public ListFindingsResponse listFindings() throws ApiException {
    return listFindingsWithHttpInfo(new ListFindingsOptionalParameters()).getData();
  }

  /**
   * List findings.
   *
   * <p>See {@link #listFindingsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;ListFindingsResponse&gt;
   */
  public CompletableFuture<ListFindingsResponse> listFindingsAsync() {
    return listFindingsWithHttpInfoAsync(new ListFindingsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List findings.
   *
   * <p>See {@link #listFindingsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return ListFindingsResponse
   * @throws ApiException if fails to make API call
   */
  public ListFindingsResponse listFindings(ListFindingsOptionalParameters parameters)
      throws ApiException {
    return listFindingsWithHttpInfo(parameters).getData();
  }

  /**
   * List findings.
   *
   * <p>See {@link #listFindingsWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ListFindingsResponse&gt;
   */
  public CompletableFuture<ListFindingsResponse> listFindingsAsync(
      ListFindingsOptionalParameters parameters) {
    return listFindingsWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List findings.
   *
   * <p>See {@link #listFindingsWithHttpInfo}.
   *
   * @return PaginationIterable&lt;Finding&gt;
   */
  public PaginationIterable<Finding> listFindingsWithPagination() {
    ListFindingsOptionalParameters parameters = new ListFindingsOptionalParameters();
    return listFindingsWithPagination(parameters);
  }

  /**
   * List findings.
   *
   * <p>See {@link #listFindingsWithHttpInfo}.
   *
   * @return ListFindingsResponse
   */
  public PaginationIterable<Finding> listFindingsWithPagination(
      ListFindingsOptionalParameters parameters) {
    String resultsPath = "getData";
    String valueGetterPath = "getMeta.getPage.getCursor";
    String valueSetterPath = "pageCursor";
    Boolean valueSetterParamOptional = true;
    Long limit;

    if (parameters.pageLimit == null) {
      limit = 100l;
      parameters.pageLimit(limit);
    } else {
      limit = parameters.pageLimit;
    }

    LinkedHashMap<String, Object> args = new LinkedHashMap<String, Object>();
    args.put("optionalParams", parameters);

    PaginationIterable iterator =
        new PaginationIterable(
            this,
            "listFindings",
            resultsPath,
            valueGetterPath,
            valueSetterPath,
            valueSetterParamOptional,
            true,
            limit,
            args);

    return iterator;
  }

  /**
   * Get a list of CSPM findings.
   *
   * <h3>Filtering</h3>
   *
   * <p>Filters can be applied by appending query parameters to the URL.
   *
   * <ul>
   *   <li>Using a single filter: <code>?filter[attribute_key]=attribute_value</code>
   *   <li>Chaining filters: <code>
   *       ?filter[attribute_key]=attribute_value&amp;filter[attribute_key]=attribute_value...
   *       </code>
   *   <li>Filtering on tags: <code>
   *       ?filter[tags]=tag_key:tag_value&amp;filter[tags]=tag_key_2:tag_value_2</code>
   * </ul>
   *
   * <p>Here, <code>attribute_key</code> can be any of the filter keys described further below.
   *
   * <p>Query parameters of type <code>integer</code> support comparison operators (<code>&gt;
   * </code>, <code>&gt;=</code>, <code>&lt;</code>, <code>&lt;=</code>). This is particularly
   * useful when filtering by <code>evaluation_changed_at</code> or <code>
   * resource_discovery_timestamp</code>. For example: <code>
   * ?filter[evaluation_changed_at]=&gt;20123123121</code>.
   *
   * <p>You can also use the negation operator on strings. For example, use <code>
   * filter[resource_type]=-aws*</code> to filter for any non-AWS resources.
   *
   * <p>The operator must come after the equal sign. For example, to filter with the <code>&gt;=
   * </code> operator, add the operator after the equal sign: <code>
   * filter[evaluation_changed_at]=&gt;=1678809373257</code>.
   *
   * <p>Query parameters must be only among the documented ones and with values of correct types.
   * Duplicated query parameters (e.g. <code>filter[status]=low&amp;filter[status]=info</code>) are
   * not allowed.
   *
   * <h3>Response</h3>
   *
   * <p>The response includes an array of finding objects, pagination metadata, and a count of items
   * that match the query.
   *
   * <p>Each finding object contains the following:
   *
   * <ul>
   *   <li>The finding ID that can be used in a <code>GetFinding</code> request to retrieve the full
   *       finding details.
   *   <li>Core attributes, including status, evaluation, high-level resource details, muted state,
   *       and rule details.
   *   <li><code>evaluation_changed_at</code> and <code>resource_discovery_date</code> time stamps.
   *   <li>An array of associated tags.
   * </ul>
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;ListFindingsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request: The server cannot process the request due to invalid syntax in the request. </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden: Access denied </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found: The requested finding cannot be found. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests: The rate limit set by the API has been exceeded. </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ListFindingsResponse> listFindingsWithHttpInfo(
      ListFindingsOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listFindings";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    Long pageLimit = parameters.pageLimit;
    Long snapshotTimestamp = parameters.snapshotTimestamp;
    String pageCursor = parameters.pageCursor;
    String filterTags = parameters.filterTags;
    String filterEvaluationChangedAt = parameters.filterEvaluationChangedAt;
    Boolean filterMuted = parameters.filterMuted;
    String filterRuleId = parameters.filterRuleId;
    String filterRuleName = parameters.filterRuleName;
    String filterResourceType = parameters.filterResourceType;
    String filterDiscoveryTimestamp = parameters.filterDiscoveryTimestamp;
    FindingEvaluation filterEvaluation = parameters.filterEvaluation;
    FindingStatus filterStatus = parameters.filterStatus;
    // create path and map variables
    String localVarPath = "/api/v2/posture_management/findings";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "snapshot_timestamp", snapshotTimestamp));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[cursor]", pageCursor));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[tags]", filterTags));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[evaluation_changed_at]", filterEvaluationChangedAt));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[muted]", filterMuted));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[rule_id]", filterRuleId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[rule_name]", filterRuleName));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[resource_type]", filterResourceType));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[discovery_timestamp]", filterDiscoveryTimestamp));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[evaluation]", filterEvaluation));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[status]", filterStatus));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SecurityMonitoringApi.listFindings",
            localVarPath,
            localVarQueryParams,
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<ListFindingsResponse>() {});
  }

  /**
   * List findings.
   *
   * <p>See {@link #listFindingsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;ListFindingsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ListFindingsResponse>> listFindingsWithHttpInfoAsync(
      ListFindingsOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listFindings";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ListFindingsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    Long pageLimit = parameters.pageLimit;
    Long snapshotTimestamp = parameters.snapshotTimestamp;
    String pageCursor = parameters.pageCursor;
    String filterTags = parameters.filterTags;
    String filterEvaluationChangedAt = parameters.filterEvaluationChangedAt;
    Boolean filterMuted = parameters.filterMuted;
    String filterRuleId = parameters.filterRuleId;
    String filterRuleName = parameters.filterRuleName;
    String filterResourceType = parameters.filterResourceType;
    String filterDiscoveryTimestamp = parameters.filterDiscoveryTimestamp;
    FindingEvaluation filterEvaluation = parameters.filterEvaluation;
    FindingStatus filterStatus = parameters.filterStatus;
    // create path and map variables
    String localVarPath = "/api/v2/posture_management/findings";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "snapshot_timestamp", snapshotTimestamp));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[cursor]", pageCursor));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[tags]", filterTags));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[evaluation_changed_at]", filterEvaluationChangedAt));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[muted]", filterMuted));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[rule_id]", filterRuleId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[rule_name]", filterRuleName));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[resource_type]", filterResourceType));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[discovery_timestamp]", filterDiscoveryTimestamp));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[evaluation]", filterEvaluation));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[status]", filterStatus));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SecurityMonitoringApi.listFindings",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ListFindingsResponse>> result = new CompletableFuture<>();
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
        new GenericType<ListFindingsResponse>() {});
  }

  /**
   * Get all security filters.
   *
   * <p>See {@link #listSecurityFiltersWithHttpInfo}.
   *
   * @return SecurityFiltersResponse
   * @throws ApiException if fails to make API call
   */
  public SecurityFiltersResponse listSecurityFilters() throws ApiException {
    return listSecurityFiltersWithHttpInfo().getData();
  }

  /**
   * Get all security filters.
   *
   * <p>See {@link #listSecurityFiltersWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;SecurityFiltersResponse&gt;
   */
  public CompletableFuture<SecurityFiltersResponse> listSecurityFiltersAsync() {
    return listSecurityFiltersWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the list of configured security filters with their definitions.
   *
   * @return ApiResponse&lt;SecurityFiltersResponse&gt;
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
  public ApiResponse<SecurityFiltersResponse> listSecurityFiltersWithHttpInfo()
      throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/security_monitoring/configuration/security_filters";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SecurityMonitoringApi.listSecurityFilters",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<SecurityFiltersResponse>() {});
  }

  /**
   * Get all security filters.
   *
   * <p>See {@link #listSecurityFiltersWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;SecurityFiltersResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SecurityFiltersResponse>>
      listSecurityFiltersWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/security_monitoring/configuration/security_filters";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SecurityMonitoringApi.listSecurityFilters",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SecurityFiltersResponse>> result = new CompletableFuture<>();
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
        new GenericType<SecurityFiltersResponse>() {});
  }

  /** Manage optional parameters to listSecurityMonitoringRules. */
  public static class ListSecurityMonitoringRulesOptionalParameters {
    private Long pageSize;
    private Long pageNumber;

    /**
     * Set pageSize.
     *
     * @param pageSize Size for a given page. The maximum allowed value is 100. (optional, default
     *     to 10)
     * @return ListSecurityMonitoringRulesOptionalParameters
     */
    public ListSecurityMonitoringRulesOptionalParameters pageSize(Long pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set pageNumber.
     *
     * @param pageNumber Specific page number to return. (optional, default to 0)
     * @return ListSecurityMonitoringRulesOptionalParameters
     */
    public ListSecurityMonitoringRulesOptionalParameters pageNumber(Long pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }
  }

  /**
   * List rules.
   *
   * <p>See {@link #listSecurityMonitoringRulesWithHttpInfo}.
   *
   * @return SecurityMonitoringListRulesResponse
   * @throws ApiException if fails to make API call
   */
  public SecurityMonitoringListRulesResponse listSecurityMonitoringRules() throws ApiException {
    return listSecurityMonitoringRulesWithHttpInfo(
            new ListSecurityMonitoringRulesOptionalParameters())
        .getData();
  }

  /**
   * List rules.
   *
   * <p>See {@link #listSecurityMonitoringRulesWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;SecurityMonitoringListRulesResponse&gt;
   */
  public CompletableFuture<SecurityMonitoringListRulesResponse> listSecurityMonitoringRulesAsync() {
    return listSecurityMonitoringRulesWithHttpInfoAsync(
            new ListSecurityMonitoringRulesOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List rules.
   *
   * <p>See {@link #listSecurityMonitoringRulesWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return SecurityMonitoringListRulesResponse
   * @throws ApiException if fails to make API call
   */
  public SecurityMonitoringListRulesResponse listSecurityMonitoringRules(
      ListSecurityMonitoringRulesOptionalParameters parameters) throws ApiException {
    return listSecurityMonitoringRulesWithHttpInfo(parameters).getData();
  }

  /**
   * List rules.
   *
   * <p>See {@link #listSecurityMonitoringRulesWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;SecurityMonitoringListRulesResponse&gt;
   */
  public CompletableFuture<SecurityMonitoringListRulesResponse> listSecurityMonitoringRulesAsync(
      ListSecurityMonitoringRulesOptionalParameters parameters) {
    return listSecurityMonitoringRulesWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List rules.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;SecurityMonitoringListRulesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SecurityMonitoringListRulesResponse> listSecurityMonitoringRulesWithHttpInfo(
      ListSecurityMonitoringRulesOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    Long pageSize = parameters.pageSize;
    Long pageNumber = parameters.pageNumber;
    // create path and map variables
    String localVarPath = "/api/v2/security_monitoring/rules";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SecurityMonitoringApi.listSecurityMonitoringRules",
            localVarPath,
            localVarQueryParams,
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<SecurityMonitoringListRulesResponse>() {});
  }

  /**
   * List rules.
   *
   * <p>See {@link #listSecurityMonitoringRulesWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;SecurityMonitoringListRulesResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SecurityMonitoringListRulesResponse>>
      listSecurityMonitoringRulesWithHttpInfoAsync(
          ListSecurityMonitoringRulesOptionalParameters parameters) {
    Object localVarPostBody = null;
    Long pageSize = parameters.pageSize;
    Long pageNumber = parameters.pageNumber;
    // create path and map variables
    String localVarPath = "/api/v2/security_monitoring/rules";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SecurityMonitoringApi.listSecurityMonitoringRules",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SecurityMonitoringListRulesResponse>> result =
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
        new GenericType<SecurityMonitoringListRulesResponse>() {});
  }

  /** Manage optional parameters to listSecurityMonitoringSignals. */
  public static class ListSecurityMonitoringSignalsOptionalParameters {
    private String filterQuery;
    private OffsetDateTime filterFrom;
    private OffsetDateTime filterTo;
    private SecurityMonitoringSignalsSort sort;
    private String pageCursor;
    private Integer pageLimit;

    /**
     * Set filterQuery.
     *
     * @param filterQuery The search query for security signals. (optional)
     * @return ListSecurityMonitoringSignalsOptionalParameters
     */
    public ListSecurityMonitoringSignalsOptionalParameters filterQuery(String filterQuery) {
      this.filterQuery = filterQuery;
      return this;
    }

    /**
     * Set filterFrom.
     *
     * @param filterFrom The minimum timestamp for requested security signals. (optional)
     * @return ListSecurityMonitoringSignalsOptionalParameters
     */
    public ListSecurityMonitoringSignalsOptionalParameters filterFrom(OffsetDateTime filterFrom) {
      this.filterFrom = filterFrom;
      return this;
    }

    /**
     * Set filterTo.
     *
     * @param filterTo The maximum timestamp for requested security signals. (optional)
     * @return ListSecurityMonitoringSignalsOptionalParameters
     */
    public ListSecurityMonitoringSignalsOptionalParameters filterTo(OffsetDateTime filterTo) {
      this.filterTo = filterTo;
      return this;
    }

    /**
     * Set sort.
     *
     * @param sort The order of the security signals in results. (optional)
     * @return ListSecurityMonitoringSignalsOptionalParameters
     */
    public ListSecurityMonitoringSignalsOptionalParameters sort(
        SecurityMonitoringSignalsSort sort) {
      this.sort = sort;
      return this;
    }

    /**
     * Set pageCursor.
     *
     * @param pageCursor A list of results using the cursor provided in the previous query.
     *     (optional)
     * @return ListSecurityMonitoringSignalsOptionalParameters
     */
    public ListSecurityMonitoringSignalsOptionalParameters pageCursor(String pageCursor) {
      this.pageCursor = pageCursor;
      return this;
    }

    /**
     * Set pageLimit.
     *
     * @param pageLimit The maximum number of security signals in the response. (optional, default
     *     to 10)
     * @return ListSecurityMonitoringSignalsOptionalParameters
     */
    public ListSecurityMonitoringSignalsOptionalParameters pageLimit(Integer pageLimit) {
      this.pageLimit = pageLimit;
      return this;
    }
  }

  /**
   * Get a quick list of security signals.
   *
   * <p>See {@link #listSecurityMonitoringSignalsWithHttpInfo}.
   *
   * @return SecurityMonitoringSignalsListResponse
   * @throws ApiException if fails to make API call
   */
  public SecurityMonitoringSignalsListResponse listSecurityMonitoringSignals() throws ApiException {
    return listSecurityMonitoringSignalsWithHttpInfo(
            new ListSecurityMonitoringSignalsOptionalParameters())
        .getData();
  }

  /**
   * Get a quick list of security signals.
   *
   * <p>See {@link #listSecurityMonitoringSignalsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;SecurityMonitoringSignalsListResponse&gt;
   */
  public CompletableFuture<SecurityMonitoringSignalsListResponse>
      listSecurityMonitoringSignalsAsync() {
    return listSecurityMonitoringSignalsWithHttpInfoAsync(
            new ListSecurityMonitoringSignalsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a quick list of security signals.
   *
   * <p>See {@link #listSecurityMonitoringSignalsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return SecurityMonitoringSignalsListResponse
   * @throws ApiException if fails to make API call
   */
  public SecurityMonitoringSignalsListResponse listSecurityMonitoringSignals(
      ListSecurityMonitoringSignalsOptionalParameters parameters) throws ApiException {
    return listSecurityMonitoringSignalsWithHttpInfo(parameters).getData();
  }

  /**
   * Get a quick list of security signals.
   *
   * <p>See {@link #listSecurityMonitoringSignalsWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;SecurityMonitoringSignalsListResponse&gt;
   */
  public CompletableFuture<SecurityMonitoringSignalsListResponse>
      listSecurityMonitoringSignalsAsync(
          ListSecurityMonitoringSignalsOptionalParameters parameters) {
    return listSecurityMonitoringSignalsWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a quick list of security signals.
   *
   * <p>See {@link #listSecurityMonitoringSignalsWithHttpInfo}.
   *
   * @return PaginationIterable&lt;SecurityMonitoringSignal&gt;
   */
  public PaginationIterable<SecurityMonitoringSignal>
      listSecurityMonitoringSignalsWithPagination() {
    ListSecurityMonitoringSignalsOptionalParameters parameters =
        new ListSecurityMonitoringSignalsOptionalParameters();
    return listSecurityMonitoringSignalsWithPagination(parameters);
  }

  /**
   * Get a quick list of security signals.
   *
   * <p>See {@link #listSecurityMonitoringSignalsWithHttpInfo}.
   *
   * @return SecurityMonitoringSignalsListResponse
   */
  public PaginationIterable<SecurityMonitoringSignal> listSecurityMonitoringSignalsWithPagination(
      ListSecurityMonitoringSignalsOptionalParameters parameters) {
    String resultsPath = "getData";
    String valueGetterPath = "getMeta.getPage.getAfter";
    String valueSetterPath = "pageCursor";
    Boolean valueSetterParamOptional = true;
    Integer limit;

    if (parameters.pageLimit == null) {
      limit = 10;
      parameters.pageLimit(limit);
    } else {
      limit = parameters.pageLimit;
    }

    LinkedHashMap<String, Object> args = new LinkedHashMap<String, Object>();
    args.put("optionalParams", parameters);

    PaginationIterable iterator =
        new PaginationIterable(
            this,
            "listSecurityMonitoringSignals",
            resultsPath,
            valueGetterPath,
            valueSetterPath,
            valueSetterParamOptional,
            true,
            limit,
            args);

    return iterator;
  }

  /**
   * The list endpoint returns security signals that match a search query. Both this endpoint and
   * the POST endpoint can be used interchangeably when listing security signals.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;SecurityMonitoringSignalsListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SecurityMonitoringSignalsListResponse>
      listSecurityMonitoringSignalsWithHttpInfo(
          ListSecurityMonitoringSignalsOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    String filterQuery = parameters.filterQuery;
    OffsetDateTime filterFrom = parameters.filterFrom;
    OffsetDateTime filterTo = parameters.filterTo;
    SecurityMonitoringSignalsSort sort = parameters.sort;
    String pageCursor = parameters.pageCursor;
    Integer pageLimit = parameters.pageLimit;
    // create path and map variables
    String localVarPath = "/api/v2/security_monitoring/signals";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[query]", filterQuery));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[from]", filterFrom));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[to]", filterTo));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[cursor]", pageCursor));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SecurityMonitoringApi.listSecurityMonitoringSignals",
            localVarPath,
            localVarQueryParams,
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<SecurityMonitoringSignalsListResponse>() {});
  }

  /**
   * Get a quick list of security signals.
   *
   * <p>See {@link #listSecurityMonitoringSignalsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;SecurityMonitoringSignalsListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SecurityMonitoringSignalsListResponse>>
      listSecurityMonitoringSignalsWithHttpInfoAsync(
          ListSecurityMonitoringSignalsOptionalParameters parameters) {
    Object localVarPostBody = null;
    String filterQuery = parameters.filterQuery;
    OffsetDateTime filterFrom = parameters.filterFrom;
    OffsetDateTime filterTo = parameters.filterTo;
    SecurityMonitoringSignalsSort sort = parameters.sort;
    String pageCursor = parameters.pageCursor;
    Integer pageLimit = parameters.pageLimit;
    // create path and map variables
    String localVarPath = "/api/v2/security_monitoring/signals";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[query]", filterQuery));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[from]", filterFrom));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[to]", filterTo));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[cursor]", pageCursor));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SecurityMonitoringApi.listSecurityMonitoringSignals",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SecurityMonitoringSignalsListResponse>> result =
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
        new GenericType<SecurityMonitoringSignalsListResponse>() {});
  }

  /**
   * Get all suppression rules.
   *
   * <p>See {@link #listSecurityMonitoringSuppressionsWithHttpInfo}.
   *
   * @return SecurityMonitoringSuppressionsResponse
   * @throws ApiException if fails to make API call
   */
  public SecurityMonitoringSuppressionsResponse listSecurityMonitoringSuppressions()
      throws ApiException {
    return listSecurityMonitoringSuppressionsWithHttpInfo().getData();
  }

  /**
   * Get all suppression rules.
   *
   * <p>See {@link #listSecurityMonitoringSuppressionsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;SecurityMonitoringSuppressionsResponse&gt;
   */
  public CompletableFuture<SecurityMonitoringSuppressionsResponse>
      listSecurityMonitoringSuppressionsAsync() {
    return listSecurityMonitoringSuppressionsWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the list of all suppression rules.
   *
   * @return ApiResponse&lt;SecurityMonitoringSuppressionsResponse&gt;
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
  public ApiResponse<SecurityMonitoringSuppressionsResponse>
      listSecurityMonitoringSuppressionsWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/security_monitoring/configuration/suppressions";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SecurityMonitoringApi.listSecurityMonitoringSuppressions",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<SecurityMonitoringSuppressionsResponse>() {});
  }

  /**
   * Get all suppression rules.
   *
   * <p>See {@link #listSecurityMonitoringSuppressionsWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;SecurityMonitoringSuppressionsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SecurityMonitoringSuppressionsResponse>>
      listSecurityMonitoringSuppressionsWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/security_monitoring/configuration/suppressions";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SecurityMonitoringApi.listSecurityMonitoringSuppressions",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SecurityMonitoringSuppressionsResponse>> result =
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
        new GenericType<SecurityMonitoringSuppressionsResponse>() {});
  }

  /**
   * Mute or unmute a batch of findings.
   *
   * <p>See {@link #muteFindingsWithHttpInfo}.
   *
   * @param body
   *     <h3>Attributes</h3>
   *     All findings are updated with the same attributes. The request body must include at least
   *     two attributes: <code>muted</code> and <code>reason</code>. The allowed reasons depend on
   *     whether the finding is being muted or unmuted: - To mute a finding: <code>PENDING_FIX
   *     </code>, <code>FALSE_POSITIVE</code>, <code>ACCEPTED_RISK</code>, <code>OTHER</code>. - To
   *     unmute a finding : <code>NO_PENDING_FIX</code>, <code>HUMAN_ERROR</code>, <code>
   *     NO_LONGER_ACCEPTED_RISK</code>, <code>OTHER</code>.
   *     <h3>Meta</h3>
   *     The request body must include a list of the finding IDs to be updated. (required)
   * @return BulkMuteFindingsResponse
   * @throws ApiException if fails to make API call
   */
  public BulkMuteFindingsResponse muteFindings(BulkMuteFindingsRequest body) throws ApiException {
    return muteFindingsWithHttpInfo(body).getData();
  }

  /**
   * Mute or unmute a batch of findings.
   *
   * <p>See {@link #muteFindingsWithHttpInfoAsync}.
   *
   * @param body
   *     <h3>Attributes</h3>
   *     All findings are updated with the same attributes. The request body must include at least
   *     two attributes: <code>muted</code> and <code>reason</code>. The allowed reasons depend on
   *     whether the finding is being muted or unmuted: - To mute a finding: <code>PENDING_FIX
   *     </code>, <code>FALSE_POSITIVE</code>, <code>ACCEPTED_RISK</code>, <code>OTHER</code>. - To
   *     unmute a finding : <code>NO_PENDING_FIX</code>, <code>HUMAN_ERROR</code>, <code>
   *     NO_LONGER_ACCEPTED_RISK</code>, <code>OTHER</code>.
   *     <h3>Meta</h3>
   *     The request body must include a list of the finding IDs to be updated. (required)
   * @return CompletableFuture&lt;BulkMuteFindingsResponse&gt;
   */
  public CompletableFuture<BulkMuteFindingsResponse> muteFindingsAsync(
      BulkMuteFindingsRequest body) {
    return muteFindingsWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Mute or unmute findings.
   *
   * @param body
   *     <h3>Attributes</h3>
   *     All findings are updated with the same attributes. The request body must include at least
   *     two attributes: <code>muted</code> and <code>reason</code>. The allowed reasons depend on
   *     whether the finding is being muted or unmuted: - To mute a finding: <code>PENDING_FIX
   *     </code>, <code>FALSE_POSITIVE</code>, <code>ACCEPTED_RISK</code>, <code>OTHER</code>. - To
   *     unmute a finding : <code>NO_PENDING_FIX</code>, <code>HUMAN_ERROR</code>, <code>
   *     NO_LONGER_ACCEPTED_RISK</code>, <code>OTHER</code>.
   *     <h3>Meta</h3>
   *     The request body must include a list of the finding IDs to be updated. (required)
   * @return ApiResponse&lt;BulkMuteFindingsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request: The server cannot process the request due to invalid syntax in the request. </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden: Access denied </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found: The requested finding cannot be found. </td><td>  -  </td></tr>
   *       <tr><td> 422 </td><td> Invalid Request: The server understands the request syntax but cannot process it due to invalid data. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests: The rate limit set by the API has been exceeded. </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<BulkMuteFindingsResponse> muteFindingsWithHttpInfo(
      BulkMuteFindingsRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "muteFindings";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling muteFindings");
    }
    // create path and map variables
    String localVarPath = "/api/v2/posture_management/findings";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SecurityMonitoringApi.muteFindings",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<BulkMuteFindingsResponse>() {});
  }

  /**
   * Mute or unmute a batch of findings.
   *
   * <p>See {@link #muteFindingsWithHttpInfo}.
   *
   * @param body
   *     <h3>Attributes</h3>
   *     All findings are updated with the same attributes. The request body must include at least
   *     two attributes: <code>muted</code> and <code>reason</code>. The allowed reasons depend on
   *     whether the finding is being muted or unmuted: - To mute a finding: <code>PENDING_FIX
   *     </code>, <code>FALSE_POSITIVE</code>, <code>ACCEPTED_RISK</code>, <code>OTHER</code>. - To
   *     unmute a finding : <code>NO_PENDING_FIX</code>, <code>HUMAN_ERROR</code>, <code>
   *     NO_LONGER_ACCEPTED_RISK</code>, <code>OTHER</code>.
   *     <h3>Meta</h3>
   *     The request body must include a list of the finding IDs to be updated. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;BulkMuteFindingsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<BulkMuteFindingsResponse>> muteFindingsWithHttpInfoAsync(
      BulkMuteFindingsRequest body) {
    // Check if unstable operation is enabled
    String operationId = "muteFindings";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<BulkMuteFindingsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<BulkMuteFindingsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'body' when calling muteFindings"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/posture_management/findings";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SecurityMonitoringApi.muteFindings",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<BulkMuteFindingsResponse>> result = new CompletableFuture<>();
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
        new GenericType<BulkMuteFindingsResponse>() {});
  }

  /** Manage optional parameters to searchSecurityMonitoringSignals. */
  public static class SearchSecurityMonitoringSignalsOptionalParameters {
    private SecurityMonitoringSignalListRequest body;

    /**
     * Set body.
     *
     * @param body (optional)
     * @return SearchSecurityMonitoringSignalsOptionalParameters
     */
    public SearchSecurityMonitoringSignalsOptionalParameters body(
        SecurityMonitoringSignalListRequest body) {
      this.body = body;
      return this;
    }
  }

  /**
   * Get a list of security signals.
   *
   * <p>See {@link #searchSecurityMonitoringSignalsWithHttpInfo}.
   *
   * @return SecurityMonitoringSignalsListResponse
   * @throws ApiException if fails to make API call
   */
  public SecurityMonitoringSignalsListResponse searchSecurityMonitoringSignals()
      throws ApiException {
    return searchSecurityMonitoringSignalsWithHttpInfo(
            new SearchSecurityMonitoringSignalsOptionalParameters())
        .getData();
  }

  /**
   * Get a list of security signals.
   *
   * <p>See {@link #searchSecurityMonitoringSignalsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;SecurityMonitoringSignalsListResponse&gt;
   */
  public CompletableFuture<SecurityMonitoringSignalsListResponse>
      searchSecurityMonitoringSignalsAsync() {
    return searchSecurityMonitoringSignalsWithHttpInfoAsync(
            new SearchSecurityMonitoringSignalsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a list of security signals.
   *
   * <p>See {@link #searchSecurityMonitoringSignalsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return SecurityMonitoringSignalsListResponse
   * @throws ApiException if fails to make API call
   */
  public SecurityMonitoringSignalsListResponse searchSecurityMonitoringSignals(
      SearchSecurityMonitoringSignalsOptionalParameters parameters) throws ApiException {
    return searchSecurityMonitoringSignalsWithHttpInfo(parameters).getData();
  }

  /**
   * Get a list of security signals.
   *
   * <p>See {@link #searchSecurityMonitoringSignalsWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;SecurityMonitoringSignalsListResponse&gt;
   */
  public CompletableFuture<SecurityMonitoringSignalsListResponse>
      searchSecurityMonitoringSignalsAsync(
          SearchSecurityMonitoringSignalsOptionalParameters parameters) {
    return searchSecurityMonitoringSignalsWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a list of security signals.
   *
   * <p>See {@link #searchSecurityMonitoringSignalsWithHttpInfo}.
   *
   * @return PaginationIterable&lt;SecurityMonitoringSignal&gt;
   */
  public PaginationIterable<SecurityMonitoringSignal>
      searchSecurityMonitoringSignalsWithPagination() {
    SearchSecurityMonitoringSignalsOptionalParameters parameters =
        new SearchSecurityMonitoringSignalsOptionalParameters();
    return searchSecurityMonitoringSignalsWithPagination(parameters);
  }

  /**
   * Get a list of security signals.
   *
   * <p>See {@link #searchSecurityMonitoringSignalsWithHttpInfo}.
   *
   * @return SecurityMonitoringSignalsListResponse
   */
  public PaginationIterable<SecurityMonitoringSignal> searchSecurityMonitoringSignalsWithPagination(
      SearchSecurityMonitoringSignalsOptionalParameters parameters) {
    String resultsPath = "getData";
    String valueGetterPath = "getMeta.getPage.getAfter";
    String valueSetterPath = "body.getPage.setCursor";
    Boolean valueSetterParamOptional = true;
    Integer limit;

    if (parameters.body == null) {
      parameters.body(new SecurityMonitoringSignalListRequest());
    }

    if (parameters.body.getPage() == null) {
      parameters.body.setPage(new SecurityMonitoringSignalListRequestPage());
    }

    if (parameters.body.getPage().getLimit() == null) {
      limit = 10;
      parameters.body.getPage().setLimit(limit);
    } else {
      limit = parameters.body.getPage().getLimit();
    }

    LinkedHashMap<String, Object> args = new LinkedHashMap<String, Object>();
    args.put("optionalParams", parameters);

    PaginationIterable iterator =
        new PaginationIterable(
            this,
            "searchSecurityMonitoringSignals",
            resultsPath,
            valueGetterPath,
            valueSetterPath,
            valueSetterParamOptional,
            true,
            limit,
            args);

    return iterator;
  }

  /**
   * Returns security signals that match a search query. Both this endpoint and the GET endpoint can
   * be used interchangeably for listing security signals.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;SecurityMonitoringSignalsListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SecurityMonitoringSignalsListResponse>
      searchSecurityMonitoringSignalsWithHttpInfo(
          SearchSecurityMonitoringSignalsOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = parameters.body;
    // create path and map variables
    String localVarPath = "/api/v2/security_monitoring/signals/search";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SecurityMonitoringApi.searchSecurityMonitoringSignals",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<SecurityMonitoringSignalsListResponse>() {});
  }

  /**
   * Get a list of security signals.
   *
   * <p>See {@link #searchSecurityMonitoringSignalsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;SecurityMonitoringSignalsListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SecurityMonitoringSignalsListResponse>>
      searchSecurityMonitoringSignalsWithHttpInfoAsync(
          SearchSecurityMonitoringSignalsOptionalParameters parameters) {
    Object localVarPostBody = parameters.body;
    // create path and map variables
    String localVarPath = "/api/v2/security_monitoring/signals/search";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SecurityMonitoringApi.searchSecurityMonitoringSignals",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SecurityMonitoringSignalsListResponse>> result =
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
        new GenericType<SecurityMonitoringSignalsListResponse>() {});
  }

  /**
   * Test an existing rule.
   *
   * <p>See {@link #testExistingSecurityMonitoringRuleWithHttpInfo}.
   *
   * @param ruleId The ID of the rule. (required)
   * @param body (required)
   * @return SecurityMonitoringRuleTestResponse
   * @throws ApiException if fails to make API call
   */
  public SecurityMonitoringRuleTestResponse testExistingSecurityMonitoringRule(
      String ruleId, SecurityMonitoringRuleTestRequest body) throws ApiException {
    return testExistingSecurityMonitoringRuleWithHttpInfo(ruleId, body).getData();
  }

  /**
   * Test an existing rule.
   *
   * <p>See {@link #testExistingSecurityMonitoringRuleWithHttpInfoAsync}.
   *
   * @param ruleId The ID of the rule. (required)
   * @param body (required)
   * @return CompletableFuture&lt;SecurityMonitoringRuleTestResponse&gt;
   */
  public CompletableFuture<SecurityMonitoringRuleTestResponse>
      testExistingSecurityMonitoringRuleAsync(
          String ruleId, SecurityMonitoringRuleTestRequest body) {
    return testExistingSecurityMonitoringRuleWithHttpInfoAsync(ruleId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Test an existing rule.
   *
   * @param ruleId The ID of the rule. (required)
   * @param body (required)
   * @return ApiResponse&lt;SecurityMonitoringRuleTestResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Concurrent Modification </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SecurityMonitoringRuleTestResponse>
      testExistingSecurityMonitoringRuleWithHttpInfo(
          String ruleId, SecurityMonitoringRuleTestRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'ruleId' is set
    if (ruleId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'ruleId' when calling"
              + " testExistingSecurityMonitoringRule");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'body' when calling testExistingSecurityMonitoringRule");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/security_monitoring/rules/{rule_id}/test"
            .replaceAll("\\{" + "rule_id" + "\\}", apiClient.escapeString(ruleId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SecurityMonitoringApi.testExistingSecurityMonitoringRule",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<SecurityMonitoringRuleTestResponse>() {});
  }

  /**
   * Test an existing rule.
   *
   * <p>See {@link #testExistingSecurityMonitoringRuleWithHttpInfo}.
   *
   * @param ruleId The ID of the rule. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SecurityMonitoringRuleTestResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SecurityMonitoringRuleTestResponse>>
      testExistingSecurityMonitoringRuleWithHttpInfoAsync(
          String ruleId, SecurityMonitoringRuleTestRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'ruleId' is set
    if (ruleId == null) {
      CompletableFuture<ApiResponse<SecurityMonitoringRuleTestResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'ruleId' when calling"
                  + " testExistingSecurityMonitoringRule"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<SecurityMonitoringRuleTestResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " testExistingSecurityMonitoringRule"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/security_monitoring/rules/{rule_id}/test"
            .replaceAll("\\{" + "rule_id" + "\\}", apiClient.escapeString(ruleId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SecurityMonitoringApi.testExistingSecurityMonitoringRule",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SecurityMonitoringRuleTestResponse>> result =
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
        new GenericType<SecurityMonitoringRuleTestResponse>() {});
  }

  /**
   * Test a rule.
   *
   * <p>See {@link #testSecurityMonitoringRuleWithHttpInfo}.
   *
   * @param body (required)
   * @return SecurityMonitoringRuleTestResponse
   * @throws ApiException if fails to make API call
   */
  public SecurityMonitoringRuleTestResponse testSecurityMonitoringRule(
      SecurityMonitoringRuleTestRequest body) throws ApiException {
    return testSecurityMonitoringRuleWithHttpInfo(body).getData();
  }

  /**
   * Test a rule.
   *
   * <p>See {@link #testSecurityMonitoringRuleWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;SecurityMonitoringRuleTestResponse&gt;
   */
  public CompletableFuture<SecurityMonitoringRuleTestResponse> testSecurityMonitoringRuleAsync(
      SecurityMonitoringRuleTestRequest body) {
    return testSecurityMonitoringRuleWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Test a rule.
   *
   * @param body (required)
   * @return ApiResponse&lt;SecurityMonitoringRuleTestResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Concurrent Modification </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SecurityMonitoringRuleTestResponse> testSecurityMonitoringRuleWithHttpInfo(
      SecurityMonitoringRuleTestRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling testSecurityMonitoringRule");
    }
    // create path and map variables
    String localVarPath = "/api/v2/security_monitoring/rules/test";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SecurityMonitoringApi.testSecurityMonitoringRule",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<SecurityMonitoringRuleTestResponse>() {});
  }

  /**
   * Test a rule.
   *
   * <p>See {@link #testSecurityMonitoringRuleWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SecurityMonitoringRuleTestResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SecurityMonitoringRuleTestResponse>>
      testSecurityMonitoringRuleWithHttpInfoAsync(SecurityMonitoringRuleTestRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<SecurityMonitoringRuleTestResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling testSecurityMonitoringRule"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/security_monitoring/rules/test";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SecurityMonitoringApi.testSecurityMonitoringRule",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SecurityMonitoringRuleTestResponse>> result =
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
        new GenericType<SecurityMonitoringRuleTestResponse>() {});
  }

  /**
   * Update a security filter.
   *
   * <p>See {@link #updateSecurityFilterWithHttpInfo}.
   *
   * @param securityFilterId The ID of the security filter. (required)
   * @param body New definition of the security filter. (required)
   * @return SecurityFilterResponse
   * @throws ApiException if fails to make API call
   */
  public SecurityFilterResponse updateSecurityFilter(
      String securityFilterId, SecurityFilterUpdateRequest body) throws ApiException {
    return updateSecurityFilterWithHttpInfo(securityFilterId, body).getData();
  }

  /**
   * Update a security filter.
   *
   * <p>See {@link #updateSecurityFilterWithHttpInfoAsync}.
   *
   * @param securityFilterId The ID of the security filter. (required)
   * @param body New definition of the security filter. (required)
   * @return CompletableFuture&lt;SecurityFilterResponse&gt;
   */
  public CompletableFuture<SecurityFilterResponse> updateSecurityFilterAsync(
      String securityFilterId, SecurityFilterUpdateRequest body) {
    return updateSecurityFilterWithHttpInfoAsync(securityFilterId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update a specific security filter. Returns the security filter object when the request is
   * successful.
   *
   * @param securityFilterId The ID of the security filter. (required)
   * @param body New definition of the security filter. (required)
   * @return ApiResponse&lt;SecurityFilterResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Concurrent Modification </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SecurityFilterResponse> updateSecurityFilterWithHttpInfo(
      String securityFilterId, SecurityFilterUpdateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'securityFilterId' is set
    if (securityFilterId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'securityFilterId' when calling updateSecurityFilter");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateSecurityFilter");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/security_monitoring/configuration/security_filters/{security_filter_id}"
            .replaceAll(
                "\\{" + "security_filter_id" + "\\}",
                apiClient.escapeString(securityFilterId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SecurityMonitoringApi.updateSecurityFilter",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<SecurityFilterResponse>() {});
  }

  /**
   * Update a security filter.
   *
   * <p>See {@link #updateSecurityFilterWithHttpInfo}.
   *
   * @param securityFilterId The ID of the security filter. (required)
   * @param body New definition of the security filter. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SecurityFilterResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SecurityFilterResponse>>
      updateSecurityFilterWithHttpInfoAsync(
          String securityFilterId, SecurityFilterUpdateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'securityFilterId' is set
    if (securityFilterId == null) {
      CompletableFuture<ApiResponse<SecurityFilterResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'securityFilterId' when calling"
                  + " updateSecurityFilter"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<SecurityFilterResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateSecurityFilter"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/security_monitoring/configuration/security_filters/{security_filter_id}"
            .replaceAll(
                "\\{" + "security_filter_id" + "\\}",
                apiClient.escapeString(securityFilterId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SecurityMonitoringApi.updateSecurityFilter",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SecurityFilterResponse>> result = new CompletableFuture<>();
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
        new GenericType<SecurityFilterResponse>() {});
  }

  /**
   * Update an existing rule.
   *
   * <p>See {@link #updateSecurityMonitoringRuleWithHttpInfo}.
   *
   * @param ruleId The ID of the rule. (required)
   * @param body (required)
   * @return SecurityMonitoringRuleResponse
   * @throws ApiException if fails to make API call
   */
  public SecurityMonitoringRuleResponse updateSecurityMonitoringRule(
      String ruleId, SecurityMonitoringRuleUpdatePayload body) throws ApiException {
    return updateSecurityMonitoringRuleWithHttpInfo(ruleId, body).getData();
  }

  /**
   * Update an existing rule.
   *
   * <p>See {@link #updateSecurityMonitoringRuleWithHttpInfoAsync}.
   *
   * @param ruleId The ID of the rule. (required)
   * @param body (required)
   * @return CompletableFuture&lt;SecurityMonitoringRuleResponse&gt;
   */
  public CompletableFuture<SecurityMonitoringRuleResponse> updateSecurityMonitoringRuleAsync(
      String ruleId, SecurityMonitoringRuleUpdatePayload body) {
    return updateSecurityMonitoringRuleWithHttpInfoAsync(ruleId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update an existing rule. When updating <code>cases</code>, <code>queries</code> or <code>
   * options</code>, the whole field must be included. For example, when modifying a query all
   * queries must be included. Default rules can only be updated to be enabled, to change
   * notifications, or to update the tags (default tags cannot be removed).
   *
   * @param ruleId The ID of the rule. (required)
   * @param body (required)
   * @return ApiResponse&lt;SecurityMonitoringRuleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Concurrent Modification </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SecurityMonitoringRuleResponse> updateSecurityMonitoringRuleWithHttpInfo(
      String ruleId, SecurityMonitoringRuleUpdatePayload body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'ruleId' is set
    if (ruleId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'ruleId' when calling updateSecurityMonitoringRule");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateSecurityMonitoringRule");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/security_monitoring/rules/{rule_id}"
            .replaceAll("\\{" + "rule_id" + "\\}", apiClient.escapeString(ruleId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SecurityMonitoringApi.updateSecurityMonitoringRule",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "PUT",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<SecurityMonitoringRuleResponse>() {});
  }

  /**
   * Update an existing rule.
   *
   * <p>See {@link #updateSecurityMonitoringRuleWithHttpInfo}.
   *
   * @param ruleId The ID of the rule. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SecurityMonitoringRuleResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SecurityMonitoringRuleResponse>>
      updateSecurityMonitoringRuleWithHttpInfoAsync(
          String ruleId, SecurityMonitoringRuleUpdatePayload body) {
    Object localVarPostBody = body;

    // verify the required parameter 'ruleId' is set
    if (ruleId == null) {
      CompletableFuture<ApiResponse<SecurityMonitoringRuleResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'ruleId' when calling updateSecurityMonitoringRule"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<SecurityMonitoringRuleResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling updateSecurityMonitoringRule"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/security_monitoring/rules/{rule_id}"
            .replaceAll("\\{" + "rule_id" + "\\}", apiClient.escapeString(ruleId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SecurityMonitoringApi.updateSecurityMonitoringRule",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SecurityMonitoringRuleResponse>> result =
          new CompletableFuture<>();
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
        new GenericType<SecurityMonitoringRuleResponse>() {});
  }

  /**
   * Update a suppression rule.
   *
   * <p>See {@link #updateSecurityMonitoringSuppressionWithHttpInfo}.
   *
   * @param suppressionId The ID of the suppression rule (required)
   * @param body New definition of the suppression rule. Supports partial updates. (required)
   * @return SecurityMonitoringSuppressionResponse
   * @throws ApiException if fails to make API call
   */
  public SecurityMonitoringSuppressionResponse updateSecurityMonitoringSuppression(
      String suppressionId, SecurityMonitoringSuppressionUpdateRequest body) throws ApiException {
    return updateSecurityMonitoringSuppressionWithHttpInfo(suppressionId, body).getData();
  }

  /**
   * Update a suppression rule.
   *
   * <p>See {@link #updateSecurityMonitoringSuppressionWithHttpInfoAsync}.
   *
   * @param suppressionId The ID of the suppression rule (required)
   * @param body New definition of the suppression rule. Supports partial updates. (required)
   * @return CompletableFuture&lt;SecurityMonitoringSuppressionResponse&gt;
   */
  public CompletableFuture<SecurityMonitoringSuppressionResponse>
      updateSecurityMonitoringSuppressionAsync(
          String suppressionId, SecurityMonitoringSuppressionUpdateRequest body) {
    return updateSecurityMonitoringSuppressionWithHttpInfoAsync(suppressionId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update a specific suppression rule.
   *
   * @param suppressionId The ID of the suppression rule (required)
   * @param body New definition of the suppression rule. Supports partial updates. (required)
   * @return ApiResponse&lt;SecurityMonitoringSuppressionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Concurrent Modification </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SecurityMonitoringSuppressionResponse>
      updateSecurityMonitoringSuppressionWithHttpInfo(
          String suppressionId, SecurityMonitoringSuppressionUpdateRequest body)
          throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'suppressionId' is set
    if (suppressionId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'suppressionId' when calling"
              + " updateSecurityMonitoringSuppression");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'body' when calling updateSecurityMonitoringSuppression");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/security_monitoring/configuration/suppressions/{suppression_id}"
            .replaceAll(
                "\\{" + "suppression_id" + "\\}", apiClient.escapeString(suppressionId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SecurityMonitoringApi.updateSecurityMonitoringSuppression",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<SecurityMonitoringSuppressionResponse>() {});
  }

  /**
   * Update a suppression rule.
   *
   * <p>See {@link #updateSecurityMonitoringSuppressionWithHttpInfo}.
   *
   * @param suppressionId The ID of the suppression rule (required)
   * @param body New definition of the suppression rule. Supports partial updates. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SecurityMonitoringSuppressionResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SecurityMonitoringSuppressionResponse>>
      updateSecurityMonitoringSuppressionWithHttpInfoAsync(
          String suppressionId, SecurityMonitoringSuppressionUpdateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'suppressionId' is set
    if (suppressionId == null) {
      CompletableFuture<ApiResponse<SecurityMonitoringSuppressionResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'suppressionId' when calling"
                  + " updateSecurityMonitoringSuppression"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<SecurityMonitoringSuppressionResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " updateSecurityMonitoringSuppression"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/security_monitoring/configuration/suppressions/{suppression_id}"
            .replaceAll(
                "\\{" + "suppression_id" + "\\}", apiClient.escapeString(suppressionId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SecurityMonitoringApi.updateSecurityMonitoringSuppression",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SecurityMonitoringSuppressionResponse>> result =
          new CompletableFuture<>();
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
        new GenericType<SecurityMonitoringSuppressionResponse>() {});
  }

  /**
   * Validate a detection rule.
   *
   * <p>See {@link #validateSecurityMonitoringRuleWithHttpInfo}.
   *
   * @param body (required)
   * @throws ApiException if fails to make API call
   */
  public void validateSecurityMonitoringRule(SecurityMonitoringRuleValidatePayload body)
      throws ApiException {
    validateSecurityMonitoringRuleWithHttpInfo(body);
  }

  /**
   * Validate a detection rule.
   *
   * <p>See {@link #validateSecurityMonitoringRuleWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> validateSecurityMonitoringRuleAsync(
      SecurityMonitoringRuleValidatePayload body) {
    return validateSecurityMonitoringRuleWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Validate a detection rule.
   *
   * @param body (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> validateSecurityMonitoringRuleWithHttpInfo(
      SecurityMonitoringRuleValidatePayload body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling validateSecurityMonitoringRule");
    }
    // create path and map variables
    String localVarPath = "/api/v2/security_monitoring/rules/validation";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SecurityMonitoringApi.validateSecurityMonitoringRule",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Validate a detection rule.
   *
   * <p>See {@link #validateSecurityMonitoringRuleWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> validateSecurityMonitoringRuleWithHttpInfoAsync(
      SecurityMonitoringRuleValidatePayload body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling validateSecurityMonitoringRule"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/security_monitoring/rules/validation";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SecurityMonitoringApi.validateSecurityMonitoringRule",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"*/*"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
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
        null);
  }
}
