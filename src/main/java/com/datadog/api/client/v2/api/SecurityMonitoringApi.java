package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.PaginationIterable;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.AssetType;
import com.datadog.api.client.v2.model.BulkMuteFindingsRequest;
import com.datadog.api.client.v2.model.BulkMuteFindingsResponse;
import com.datadog.api.client.v2.model.ConvertJobResultsToSignalsRequest;
import com.datadog.api.client.v2.model.CreateCustomFrameworkRequest;
import com.datadog.api.client.v2.model.CreateCustomFrameworkResponse;
import com.datadog.api.client.v2.model.CreateNotificationRuleParameters;
import com.datadog.api.client.v2.model.DeleteCustomFrameworkResponse;
import com.datadog.api.client.v2.model.Finding;
import com.datadog.api.client.v2.model.FindingEvaluation;
import com.datadog.api.client.v2.model.FindingStatus;
import com.datadog.api.client.v2.model.FindingVulnerabilityType;
import com.datadog.api.client.v2.model.GetCustomFrameworkResponse;
import com.datadog.api.client.v2.model.GetFindingResponse;
import com.datadog.api.client.v2.model.GetResourceEvaluationFiltersResponse;
import com.datadog.api.client.v2.model.GetRuleVersionHistoryResponse;
import com.datadog.api.client.v2.model.GetSBOMResponse;
import com.datadog.api.client.v2.model.HistoricalJobResponse;
import com.datadog.api.client.v2.model.JobCreateResponse;
import com.datadog.api.client.v2.model.ListAssetsSBOMsResponse;
import com.datadog.api.client.v2.model.ListFindingsResponse;
import com.datadog.api.client.v2.model.ListHistoricalJobsResponse;
import com.datadog.api.client.v2.model.ListVulnerabilitiesResponse;
import com.datadog.api.client.v2.model.ListVulnerableAssetsResponse;
import com.datadog.api.client.v2.model.NotificationRuleResponse;
import com.datadog.api.client.v2.model.PatchNotificationRuleParameters;
import com.datadog.api.client.v2.model.RunHistoricalJobRequest;
import com.datadog.api.client.v2.model.SBOMComponentLicenseType;
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
import com.datadog.api.client.v2.model.UpdateCustomFrameworkRequest;
import com.datadog.api.client.v2.model.UpdateCustomFrameworkResponse;
import com.datadog.api.client.v2.model.UpdateResourceEvaluationFiltersRequest;
import com.datadog.api.client.v2.model.UpdateResourceEvaluationFiltersResponse;
import com.datadog.api.client.v2.model.VulnerabilityEcosystem;
import com.datadog.api.client.v2.model.VulnerabilitySeverity;
import com.datadog.api.client.v2.model.VulnerabilityStatus;
import com.datadog.api.client.v2.model.VulnerabilityTool;
import com.datadog.api.client.v2.model.VulnerabilityType;
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
   * Cancel a historical job.
   *
   * <p>See {@link #cancelHistoricalJobWithHttpInfo}.
   *
   * @param jobId The ID of the job. (required)
   * @throws ApiException if fails to make API call
   */
  public void cancelHistoricalJob(String jobId) throws ApiException {
    cancelHistoricalJobWithHttpInfo(jobId);
  }

  /**
   * Cancel a historical job.
   *
   * <p>See {@link #cancelHistoricalJobWithHttpInfoAsync}.
   *
   * @param jobId The ID of the job. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> cancelHistoricalJobAsync(String jobId) {
    return cancelHistoricalJobWithHttpInfoAsync(jobId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Cancel a historical job.
   *
   * @param jobId The ID of the job. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Concurrent Modification </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> cancelHistoricalJobWithHttpInfo(String jobId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "cancelHistoricalJob";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'jobId' is set
    if (jobId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'jobId' when calling cancelHistoricalJob");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/siem-historical-detections/jobs/{job_id}/cancel"
            .replaceAll("\\{" + "job_id" + "\\}", apiClient.escapeString(jobId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SecurityMonitoringApi.cancelHistoricalJob",
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
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Cancel a historical job.
   *
   * <p>See {@link #cancelHistoricalJobWithHttpInfo}.
   *
   * @param jobId The ID of the job. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> cancelHistoricalJobWithHttpInfoAsync(String jobId) {
    // Check if unstable operation is enabled
    String operationId = "cancelHistoricalJob";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'jobId' is set
    if (jobId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'jobId' when calling cancelHistoricalJob"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/siem-historical-detections/jobs/{job_id}/cancel"
            .replaceAll("\\{" + "job_id" + "\\}", apiClient.escapeString(jobId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SecurityMonitoringApi.cancelHistoricalJob",
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
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
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
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
   * Convert a job result to a signal.
   *
   * <p>See {@link #convertJobResultToSignalWithHttpInfo}.
   *
   * @param body (required)
   * @throws ApiException if fails to make API call
   */
  public void convertJobResultToSignal(ConvertJobResultsToSignalsRequest body) throws ApiException {
    convertJobResultToSignalWithHttpInfo(body);
  }

  /**
   * Convert a job result to a signal.
   *
   * <p>See {@link #convertJobResultToSignalWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> convertJobResultToSignalAsync(
      ConvertJobResultsToSignalsRequest body) {
    return convertJobResultToSignalWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Convert a job result to a signal.
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
   *       <tr><td> 401 </td><td> Concurrent Modification </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> convertJobResultToSignalWithHttpInfo(
      ConvertJobResultsToSignalsRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "convertJobResultToSignal";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling convertJobResultToSignal");
    }
    // create path and map variables
    String localVarPath = "/api/v2/siem-historical-detections/jobs/signal_convert";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SecurityMonitoringApi.convertJobResultToSignal",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
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
   * Convert a job result to a signal.
   *
   * <p>See {@link #convertJobResultToSignalWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> convertJobResultToSignalWithHttpInfoAsync(
      ConvertJobResultsToSignalsRequest body) {
    // Check if unstable operation is enabled
    String operationId = "convertJobResultToSignal";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling convertJobResultToSignal"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/siem-historical-detections/jobs/signal_convert";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SecurityMonitoringApi.convertJobResultToSignal",
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
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
   * Create a custom framework.
   *
   * <p>See {@link #createCustomFrameworkWithHttpInfo}.
   *
   * @param body (required)
   * @return CreateCustomFrameworkResponse
   * @throws ApiException if fails to make API call
   */
  public CreateCustomFrameworkResponse createCustomFramework(CreateCustomFrameworkRequest body)
      throws ApiException {
    return createCustomFrameworkWithHttpInfo(body).getData();
  }

  /**
   * Create a custom framework.
   *
   * <p>See {@link #createCustomFrameworkWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;CreateCustomFrameworkResponse&gt;
   */
  public CompletableFuture<CreateCustomFrameworkResponse> createCustomFrameworkAsync(
      CreateCustomFrameworkRequest body) {
    return createCustomFrameworkWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a custom framework.
   *
   * @param body (required)
   * @return ApiResponse&lt;CreateCustomFrameworkResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *       <tr><td> 500 </td><td> Bad Request </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CreateCustomFrameworkResponse> createCustomFrameworkWithHttpInfo(
      CreateCustomFrameworkRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createCustomFramework");
    }
    // create path and map variables
    String localVarPath = "/api/v2/cloud_security_management/custom_frameworks";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SecurityMonitoringApi.createCustomFramework",
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
        new GenericType<CreateCustomFrameworkResponse>() {});
  }

  /**
   * Create a custom framework.
   *
   * <p>See {@link #createCustomFrameworkWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CreateCustomFrameworkResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CreateCustomFrameworkResponse>>
      createCustomFrameworkWithHttpInfoAsync(CreateCustomFrameworkRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<CreateCustomFrameworkResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createCustomFramework"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/cloud_security_management/custom_frameworks";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SecurityMonitoringApi.createCustomFramework",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CreateCustomFrameworkResponse>> result =
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
        new GenericType<CreateCustomFrameworkResponse>() {});
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
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
   * Create a new signal-based notification rule.
   *
   * <p>See {@link #createSignalNotificationRuleWithHttpInfo}.
   *
   * @param body The body of the create notification rule request is composed of the rule type and
   *     the rule attributes: the rule name, the selectors, the notification targets, and the rule
   *     enabled status. (required)
   * @return NotificationRuleResponse
   * @throws ApiException if fails to make API call
   */
  public NotificationRuleResponse createSignalNotificationRule(
      CreateNotificationRuleParameters body) throws ApiException {
    return createSignalNotificationRuleWithHttpInfo(body).getData();
  }

  /**
   * Create a new signal-based notification rule.
   *
   * <p>See {@link #createSignalNotificationRuleWithHttpInfoAsync}.
   *
   * @param body The body of the create notification rule request is composed of the rule type and
   *     the rule attributes: the rule name, the selectors, the notification targets, and the rule
   *     enabled status. (required)
   * @return CompletableFuture&lt;NotificationRuleResponse&gt;
   */
  public CompletableFuture<NotificationRuleResponse> createSignalNotificationRuleAsync(
      CreateNotificationRuleParameters body) {
    return createSignalNotificationRuleWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a new notification rule for security signals and return the created rule.
   *
   * @param body The body of the create notification rule request is composed of the rule type and
   *     the rule attributes: the rule name, the selectors, the notification targets, and the rule
   *     enabled status. (required)
   * @return ApiResponse&lt;NotificationRuleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Successfully created the notification rule. </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<NotificationRuleResponse> createSignalNotificationRuleWithHttpInfo(
      CreateNotificationRuleParameters body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createSignalNotificationRule");
    }
    // create path and map variables
    String localVarPath = "/api/v2/security/signals/notification_rules";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SecurityMonitoringApi.createSignalNotificationRule",
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
        new GenericType<NotificationRuleResponse>() {});
  }

  /**
   * Create a new signal-based notification rule.
   *
   * <p>See {@link #createSignalNotificationRuleWithHttpInfo}.
   *
   * @param body The body of the create notification rule request is composed of the rule type and
   *     the rule attributes: the rule name, the selectors, the notification targets, and the rule
   *     enabled status. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;NotificationRuleResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<NotificationRuleResponse>>
      createSignalNotificationRuleWithHttpInfoAsync(CreateNotificationRuleParameters body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<NotificationRuleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling createSignalNotificationRule"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/security/signals/notification_rules";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SecurityMonitoringApi.createSignalNotificationRule",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<NotificationRuleResponse>> result = new CompletableFuture<>();
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
        new GenericType<NotificationRuleResponse>() {});
  }

  /**
   * Create a new vulnerability-based notification rule.
   *
   * <p>See {@link #createVulnerabilityNotificationRuleWithHttpInfo}.
   *
   * @param body The body of the create notification rule request is composed of the rule type and
   *     the rule attributes: the rule name, the selectors, the notification targets, and the rule
   *     enabled status. (required)
   * @return NotificationRuleResponse
   * @throws ApiException if fails to make API call
   */
  public NotificationRuleResponse createVulnerabilityNotificationRule(
      CreateNotificationRuleParameters body) throws ApiException {
    return createVulnerabilityNotificationRuleWithHttpInfo(body).getData();
  }

  /**
   * Create a new vulnerability-based notification rule.
   *
   * <p>See {@link #createVulnerabilityNotificationRuleWithHttpInfoAsync}.
   *
   * @param body The body of the create notification rule request is composed of the rule type and
   *     the rule attributes: the rule name, the selectors, the notification targets, and the rule
   *     enabled status. (required)
   * @return CompletableFuture&lt;NotificationRuleResponse&gt;
   */
  public CompletableFuture<NotificationRuleResponse> createVulnerabilityNotificationRuleAsync(
      CreateNotificationRuleParameters body) {
    return createVulnerabilityNotificationRuleWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a new notification rule for security vulnerabilities and return the created rule.
   *
   * @param body The body of the create notification rule request is composed of the rule type and
   *     the rule attributes: the rule name, the selectors, the notification targets, and the rule
   *     enabled status. (required)
   * @return ApiResponse&lt;NotificationRuleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Successfully created the notification rule. </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<NotificationRuleResponse> createVulnerabilityNotificationRuleWithHttpInfo(
      CreateNotificationRuleParameters body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'body' when calling createVulnerabilityNotificationRule");
    }
    // create path and map variables
    String localVarPath = "/api/v2/security/vulnerabilities/notification_rules";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SecurityMonitoringApi.createVulnerabilityNotificationRule",
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
        new GenericType<NotificationRuleResponse>() {});
  }

  /**
   * Create a new vulnerability-based notification rule.
   *
   * <p>See {@link #createVulnerabilityNotificationRuleWithHttpInfo}.
   *
   * @param body The body of the create notification rule request is composed of the rule type and
   *     the rule attributes: the rule name, the selectors, the notification targets, and the rule
   *     enabled status. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;NotificationRuleResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<NotificationRuleResponse>>
      createVulnerabilityNotificationRuleWithHttpInfoAsync(CreateNotificationRuleParameters body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<NotificationRuleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " createVulnerabilityNotificationRule"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/security/vulnerabilities/notification_rules";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SecurityMonitoringApi.createVulnerabilityNotificationRule",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<NotificationRuleResponse>> result = new CompletableFuture<>();
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
        new GenericType<NotificationRuleResponse>() {});
  }

  /**
   * Delete a custom framework.
   *
   * <p>See {@link #deleteCustomFrameworkWithHttpInfo}.
   *
   * @param handle The framework handle (required)
   * @param version The framework version (required)
   * @return DeleteCustomFrameworkResponse
   * @throws ApiException if fails to make API call
   */
  public DeleteCustomFrameworkResponse deleteCustomFramework(String handle, String version)
      throws ApiException {
    return deleteCustomFrameworkWithHttpInfo(handle, version).getData();
  }

  /**
   * Delete a custom framework.
   *
   * <p>See {@link #deleteCustomFrameworkWithHttpInfoAsync}.
   *
   * @param handle The framework handle (required)
   * @param version The framework version (required)
   * @return CompletableFuture&lt;DeleteCustomFrameworkResponse&gt;
   */
  public CompletableFuture<DeleteCustomFrameworkResponse> deleteCustomFrameworkAsync(
      String handle, String version) {
    return deleteCustomFrameworkWithHttpInfoAsync(handle, version)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete a custom framework.
   *
   * @param handle The framework handle (required)
   * @param version The framework version (required)
   * @return ApiResponse&lt;DeleteCustomFrameworkResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *       <tr><td> 500 </td><td> Bad Request </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<DeleteCustomFrameworkResponse> deleteCustomFrameworkWithHttpInfo(
      String handle, String version) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'handle' is set
    if (handle == null) {
      throw new ApiException(
          400, "Missing the required parameter 'handle' when calling deleteCustomFramework");
    }

    // verify the required parameter 'version' is set
    if (version == null) {
      throw new ApiException(
          400, "Missing the required parameter 'version' when calling deleteCustomFramework");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cloud_security_management/custom_frameworks/{handle}/{version}"
            .replaceAll("\\{" + "handle" + "\\}", apiClient.escapeString(handle.toString()))
            .replaceAll("\\{" + "version" + "\\}", apiClient.escapeString(version.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SecurityMonitoringApi.deleteCustomFramework",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<DeleteCustomFrameworkResponse>() {});
  }

  /**
   * Delete a custom framework.
   *
   * <p>See {@link #deleteCustomFrameworkWithHttpInfo}.
   *
   * @param handle The framework handle (required)
   * @param version The framework version (required)
   * @return CompletableFuture&lt;ApiResponse&lt;DeleteCustomFrameworkResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<DeleteCustomFrameworkResponse>>
      deleteCustomFrameworkWithHttpInfoAsync(String handle, String version) {
    Object localVarPostBody = null;

    // verify the required parameter 'handle' is set
    if (handle == null) {
      CompletableFuture<ApiResponse<DeleteCustomFrameworkResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'handle' when calling deleteCustomFramework"));
      return result;
    }

    // verify the required parameter 'version' is set
    if (version == null) {
      CompletableFuture<ApiResponse<DeleteCustomFrameworkResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'version' when calling deleteCustomFramework"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cloud_security_management/custom_frameworks/{handle}/{version}"
            .replaceAll("\\{" + "handle" + "\\}", apiClient.escapeString(handle.toString()))
            .replaceAll("\\{" + "version" + "\\}", apiClient.escapeString(version.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SecurityMonitoringApi.deleteCustomFramework",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<DeleteCustomFrameworkResponse>> result =
          new CompletableFuture<>();
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
        new GenericType<DeleteCustomFrameworkResponse>() {});
  }

  /**
   * Delete an existing job.
   *
   * <p>See {@link #deleteHistoricalJobWithHttpInfo}.
   *
   * @param jobId The ID of the job. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteHistoricalJob(String jobId) throws ApiException {
    deleteHistoricalJobWithHttpInfo(jobId);
  }

  /**
   * Delete an existing job.
   *
   * <p>See {@link #deleteHistoricalJobWithHttpInfoAsync}.
   *
   * @param jobId The ID of the job. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteHistoricalJobAsync(String jobId) {
    return deleteHistoricalJobWithHttpInfoAsync(jobId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete an existing job.
   *
   * @param jobId The ID of the job. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Concurrent Modification </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteHistoricalJobWithHttpInfo(String jobId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteHistoricalJob";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'jobId' is set
    if (jobId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'jobId' when calling deleteHistoricalJob");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/siem-historical-detections/jobs/{job_id}"
            .replaceAll("\\{" + "job_id" + "\\}", apiClient.escapeString(jobId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SecurityMonitoringApi.deleteHistoricalJob",
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
   * Delete an existing job.
   *
   * <p>See {@link #deleteHistoricalJobWithHttpInfo}.
   *
   * @param jobId The ID of the job. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteHistoricalJobWithHttpInfoAsync(String jobId) {
    // Check if unstable operation is enabled
    String operationId = "deleteHistoricalJob";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'jobId' is set
    if (jobId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'jobId' when calling deleteHistoricalJob"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/siem-historical-detections/jobs/{job_id}"
            .replaceAll("\\{" + "job_id" + "\\}", apiClient.escapeString(jobId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SecurityMonitoringApi.deleteHistoricalJob",
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
   * Delete a signal-based notification rule.
   *
   * <p>See {@link #deleteSignalNotificationRuleWithHttpInfo}.
   *
   * @param id ID of the notification rule. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteSignalNotificationRule(String id) throws ApiException {
    deleteSignalNotificationRuleWithHttpInfo(id);
  }

  /**
   * Delete a signal-based notification rule.
   *
   * <p>See {@link #deleteSignalNotificationRuleWithHttpInfoAsync}.
   *
   * @param id ID of the notification rule. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteSignalNotificationRuleAsync(String id) {
    return deleteSignalNotificationRuleWithHttpInfoAsync(id)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete a notification rule for security signals.
   *
   * @param id ID of the notification rule. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> Rule successfully deleted. </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteSignalNotificationRuleWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(
          400, "Missing the required parameter 'id' when calling deleteSignalNotificationRule");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/security/signals/notification_rules/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SecurityMonitoringApi.deleteSignalNotificationRule",
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
   * Delete a signal-based notification rule.
   *
   * <p>See {@link #deleteSignalNotificationRuleWithHttpInfo}.
   *
   * @param id ID of the notification rule. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteSignalNotificationRuleWithHttpInfoAsync(
      String id) {
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'id' when calling deleteSignalNotificationRule"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/security/signals/notification_rules/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SecurityMonitoringApi.deleteSignalNotificationRule",
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
   * Delete a vulnerability-based notification rule.
   *
   * <p>See {@link #deleteVulnerabilityNotificationRuleWithHttpInfo}.
   *
   * @param id ID of the notification rule. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteVulnerabilityNotificationRule(String id) throws ApiException {
    deleteVulnerabilityNotificationRuleWithHttpInfo(id);
  }

  /**
   * Delete a vulnerability-based notification rule.
   *
   * <p>See {@link #deleteVulnerabilityNotificationRuleWithHttpInfoAsync}.
   *
   * @param id ID of the notification rule. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteVulnerabilityNotificationRuleAsync(String id) {
    return deleteVulnerabilityNotificationRuleWithHttpInfoAsync(id)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete a notification rule for security vulnerabilities.
   *
   * @param id ID of the notification rule. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> Rule successfully deleted. </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteVulnerabilityNotificationRuleWithHttpInfo(String id)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'id' when calling deleteVulnerabilityNotificationRule");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/security/vulnerabilities/notification_rules/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SecurityMonitoringApi.deleteVulnerabilityNotificationRule",
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
   * Delete a vulnerability-based notification rule.
   *
   * <p>See {@link #deleteVulnerabilityNotificationRuleWithHttpInfo}.
   *
   * @param id ID of the notification rule. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteVulnerabilityNotificationRuleWithHttpInfoAsync(
      String id) {
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'id' when calling"
                  + " deleteVulnerabilityNotificationRule"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/security/vulnerabilities/notification_rules/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SecurityMonitoringApi.deleteVulnerabilityNotificationRule",
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

  /**
   * Get a custom framework.
   *
   * <p>See {@link #getCustomFrameworkWithHttpInfo}.
   *
   * @param handle The framework handle (required)
   * @param version The framework version (required)
   * @return GetCustomFrameworkResponse
   * @throws ApiException if fails to make API call
   */
  public GetCustomFrameworkResponse getCustomFramework(String handle, String version)
      throws ApiException {
    return getCustomFrameworkWithHttpInfo(handle, version).getData();
  }

  /**
   * Get a custom framework.
   *
   * <p>See {@link #getCustomFrameworkWithHttpInfoAsync}.
   *
   * @param handle The framework handle (required)
   * @param version The framework version (required)
   * @return CompletableFuture&lt;GetCustomFrameworkResponse&gt;
   */
  public CompletableFuture<GetCustomFrameworkResponse> getCustomFrameworkAsync(
      String handle, String version) {
    return getCustomFrameworkWithHttpInfoAsync(handle, version)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a custom framework.
   *
   * @param handle The framework handle (required)
   * @param version The framework version (required)
   * @return ApiResponse&lt;GetCustomFrameworkResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *       <tr><td> 500 </td><td> Bad Request </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<GetCustomFrameworkResponse> getCustomFrameworkWithHttpInfo(
      String handle, String version) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'handle' is set
    if (handle == null) {
      throw new ApiException(
          400, "Missing the required parameter 'handle' when calling getCustomFramework");
    }

    // verify the required parameter 'version' is set
    if (version == null) {
      throw new ApiException(
          400, "Missing the required parameter 'version' when calling getCustomFramework");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cloud_security_management/custom_frameworks/{handle}/{version}"
            .replaceAll("\\{" + "handle" + "\\}", apiClient.escapeString(handle.toString()))
            .replaceAll("\\{" + "version" + "\\}", apiClient.escapeString(version.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SecurityMonitoringApi.getCustomFramework",
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
        new GenericType<GetCustomFrameworkResponse>() {});
  }

  /**
   * Get a custom framework.
   *
   * <p>See {@link #getCustomFrameworkWithHttpInfo}.
   *
   * @param handle The framework handle (required)
   * @param version The framework version (required)
   * @return CompletableFuture&lt;ApiResponse&lt;GetCustomFrameworkResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<GetCustomFrameworkResponse>>
      getCustomFrameworkWithHttpInfoAsync(String handle, String version) {
    Object localVarPostBody = null;

    // verify the required parameter 'handle' is set
    if (handle == null) {
      CompletableFuture<ApiResponse<GetCustomFrameworkResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'handle' when calling getCustomFramework"));
      return result;
    }

    // verify the required parameter 'version' is set
    if (version == null) {
      CompletableFuture<ApiResponse<GetCustomFrameworkResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'version' when calling getCustomFramework"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cloud_security_management/custom_frameworks/{handle}/{version}"
            .replaceAll("\\{" + "handle" + "\\}", apiClient.escapeString(handle.toString()))
            .replaceAll("\\{" + "version" + "\\}", apiClient.escapeString(version.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SecurityMonitoringApi.getCustomFramework",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<GetCustomFrameworkResponse>> result = new CompletableFuture<>();
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
        new GenericType<GetCustomFrameworkResponse>() {});
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
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
   * Get a job&#39;s details.
   *
   * <p>See {@link #getHistoricalJobWithHttpInfo}.
   *
   * @param jobId The ID of the job. (required)
   * @return HistoricalJobResponse
   * @throws ApiException if fails to make API call
   */
  public HistoricalJobResponse getHistoricalJob(String jobId) throws ApiException {
    return getHistoricalJobWithHttpInfo(jobId).getData();
  }

  /**
   * Get a job&#39;s details.
   *
   * <p>See {@link #getHistoricalJobWithHttpInfoAsync}.
   *
   * @param jobId The ID of the job. (required)
   * @return CompletableFuture&lt;HistoricalJobResponse&gt;
   */
  public CompletableFuture<HistoricalJobResponse> getHistoricalJobAsync(String jobId) {
    return getHistoricalJobWithHttpInfoAsync(jobId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a job's details.
   *
   * @param jobId The ID of the job. (required)
   * @return ApiResponse&lt;HistoricalJobResponse&gt;
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
  public ApiResponse<HistoricalJobResponse> getHistoricalJobWithHttpInfo(String jobId)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getHistoricalJob";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'jobId' is set
    if (jobId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'jobId' when calling getHistoricalJob");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/siem-historical-detections/jobs/{job_id}"
            .replaceAll("\\{" + "job_id" + "\\}", apiClient.escapeString(jobId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SecurityMonitoringApi.getHistoricalJob",
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
        new GenericType<HistoricalJobResponse>() {});
  }

  /**
   * Get a job&#39;s details.
   *
   * <p>See {@link #getHistoricalJobWithHttpInfo}.
   *
   * @param jobId The ID of the job. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;HistoricalJobResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<HistoricalJobResponse>> getHistoricalJobWithHttpInfoAsync(
      String jobId) {
    // Check if unstable operation is enabled
    String operationId = "getHistoricalJob";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<HistoricalJobResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'jobId' is set
    if (jobId == null) {
      CompletableFuture<ApiResponse<HistoricalJobResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'jobId' when calling getHistoricalJob"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/siem-historical-detections/jobs/{job_id}"
            .replaceAll("\\{" + "job_id" + "\\}", apiClient.escapeString(jobId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SecurityMonitoringApi.getHistoricalJob",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<HistoricalJobResponse>> result = new CompletableFuture<>();
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
        new GenericType<HistoricalJobResponse>() {});
  }

  /** Manage optional parameters to getResourceEvaluationFilters. */
  public static class GetResourceEvaluationFiltersOptionalParameters {
    private String cloudProvider;
    private String accountId;
    private Boolean skipCache;

    /**
     * Set cloudProvider.
     *
     * @param cloudProvider Filter resource filters by cloud provider (e.g. aws, gcp, azure).
     *     (optional)
     * @return GetResourceEvaluationFiltersOptionalParameters
     */
    public GetResourceEvaluationFiltersOptionalParameters cloudProvider(String cloudProvider) {
      this.cloudProvider = cloudProvider;
      return this;
    }

    /**
     * Set accountId.
     *
     * @param accountId Filter resource filters by cloud provider account ID. This parameter is only
     *     valid when provider is specified. (optional)
     * @return GetResourceEvaluationFiltersOptionalParameters
     */
    public GetResourceEvaluationFiltersOptionalParameters accountId(String accountId) {
      this.accountId = accountId;
      return this;
    }

    /**
     * Set skipCache.
     *
     * @param skipCache Skip cache for resource filters. (optional)
     * @return GetResourceEvaluationFiltersOptionalParameters
     */
    public GetResourceEvaluationFiltersOptionalParameters skipCache(Boolean skipCache) {
      this.skipCache = skipCache;
      return this;
    }
  }

  /**
   * List resource filters.
   *
   * <p>See {@link #getResourceEvaluationFiltersWithHttpInfo}.
   *
   * @return GetResourceEvaluationFiltersResponse
   * @throws ApiException if fails to make API call
   */
  public GetResourceEvaluationFiltersResponse getResourceEvaluationFilters() throws ApiException {
    return getResourceEvaluationFiltersWithHttpInfo(
            new GetResourceEvaluationFiltersOptionalParameters())
        .getData();
  }

  /**
   * List resource filters.
   *
   * <p>See {@link #getResourceEvaluationFiltersWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;GetResourceEvaluationFiltersResponse&gt;
   */
  public CompletableFuture<GetResourceEvaluationFiltersResponse>
      getResourceEvaluationFiltersAsync() {
    return getResourceEvaluationFiltersWithHttpInfoAsync(
            new GetResourceEvaluationFiltersOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List resource filters.
   *
   * <p>See {@link #getResourceEvaluationFiltersWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return GetResourceEvaluationFiltersResponse
   * @throws ApiException if fails to make API call
   */
  public GetResourceEvaluationFiltersResponse getResourceEvaluationFilters(
      GetResourceEvaluationFiltersOptionalParameters parameters) throws ApiException {
    return getResourceEvaluationFiltersWithHttpInfo(parameters).getData();
  }

  /**
   * List resource filters.
   *
   * <p>See {@link #getResourceEvaluationFiltersWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;GetResourceEvaluationFiltersResponse&gt;
   */
  public CompletableFuture<GetResourceEvaluationFiltersResponse> getResourceEvaluationFiltersAsync(
      GetResourceEvaluationFiltersOptionalParameters parameters) {
    return getResourceEvaluationFiltersWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List resource filters.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;GetResourceEvaluationFiltersResponse&gt;
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
  public ApiResponse<GetResourceEvaluationFiltersResponse> getResourceEvaluationFiltersWithHttpInfo(
      GetResourceEvaluationFiltersOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    String cloudProvider = parameters.cloudProvider;
    String accountId = parameters.accountId;
    Boolean skipCache = parameters.skipCache;
    // create path and map variables
    String localVarPath = "/api/v2/cloud_security_management/resource_filters";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "cloud_provider", cloudProvider));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "account_id", accountId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "skip_cache", skipCache));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SecurityMonitoringApi.getResourceEvaluationFilters",
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
        new GenericType<GetResourceEvaluationFiltersResponse>() {});
  }

  /**
   * List resource filters.
   *
   * <p>See {@link #getResourceEvaluationFiltersWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;GetResourceEvaluationFiltersResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<GetResourceEvaluationFiltersResponse>>
      getResourceEvaluationFiltersWithHttpInfoAsync(
          GetResourceEvaluationFiltersOptionalParameters parameters) {
    Object localVarPostBody = null;
    String cloudProvider = parameters.cloudProvider;
    String accountId = parameters.accountId;
    Boolean skipCache = parameters.skipCache;
    // create path and map variables
    String localVarPath = "/api/v2/cloud_security_management/resource_filters";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "cloud_provider", cloudProvider));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "account_id", accountId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "skip_cache", skipCache));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SecurityMonitoringApi.getResourceEvaluationFilters",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<GetResourceEvaluationFiltersResponse>> result =
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
        new GenericType<GetResourceEvaluationFiltersResponse>() {});
  }

  /** Manage optional parameters to getRuleVersionHistory. */
  public static class GetRuleVersionHistoryOptionalParameters {
    private Long pageSize;
    private Long pageNumber;

    /**
     * Set pageSize.
     *
     * @param pageSize Size for a given page. The maximum allowed value is 100. (optional, default
     *     to 10)
     * @return GetRuleVersionHistoryOptionalParameters
     */
    public GetRuleVersionHistoryOptionalParameters pageSize(Long pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set pageNumber.
     *
     * @param pageNumber Specific page number to return. (optional, default to 0)
     * @return GetRuleVersionHistoryOptionalParameters
     */
    public GetRuleVersionHistoryOptionalParameters pageNumber(Long pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }
  }

  /**
   * Get a rule&#39;s version history.
   *
   * <p>See {@link #getRuleVersionHistoryWithHttpInfo}.
   *
   * @param ruleId The ID of the rule. (required)
   * @return GetRuleVersionHistoryResponse
   * @throws ApiException if fails to make API call
   */
  public GetRuleVersionHistoryResponse getRuleVersionHistory(String ruleId) throws ApiException {
    return getRuleVersionHistoryWithHttpInfo(ruleId, new GetRuleVersionHistoryOptionalParameters())
        .getData();
  }

  /**
   * Get a rule&#39;s version history.
   *
   * <p>See {@link #getRuleVersionHistoryWithHttpInfoAsync}.
   *
   * @param ruleId The ID of the rule. (required)
   * @return CompletableFuture&lt;GetRuleVersionHistoryResponse&gt;
   */
  public CompletableFuture<GetRuleVersionHistoryResponse> getRuleVersionHistoryAsync(
      String ruleId) {
    return getRuleVersionHistoryWithHttpInfoAsync(
            ruleId, new GetRuleVersionHistoryOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a rule&#39;s version history.
   *
   * <p>See {@link #getRuleVersionHistoryWithHttpInfo}.
   *
   * @param ruleId The ID of the rule. (required)
   * @param parameters Optional parameters for the request.
   * @return GetRuleVersionHistoryResponse
   * @throws ApiException if fails to make API call
   */
  public GetRuleVersionHistoryResponse getRuleVersionHistory(
      String ruleId, GetRuleVersionHistoryOptionalParameters parameters) throws ApiException {
    return getRuleVersionHistoryWithHttpInfo(ruleId, parameters).getData();
  }

  /**
   * Get a rule&#39;s version history.
   *
   * <p>See {@link #getRuleVersionHistoryWithHttpInfoAsync}.
   *
   * @param ruleId The ID of the rule. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;GetRuleVersionHistoryResponse&gt;
   */
  public CompletableFuture<GetRuleVersionHistoryResponse> getRuleVersionHistoryAsync(
      String ruleId, GetRuleVersionHistoryOptionalParameters parameters) {
    return getRuleVersionHistoryWithHttpInfoAsync(ruleId, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a rule's version history.
   *
   * @param ruleId The ID of the rule. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;GetRuleVersionHistoryResponse&gt;
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
  public ApiResponse<GetRuleVersionHistoryResponse> getRuleVersionHistoryWithHttpInfo(
      String ruleId, GetRuleVersionHistoryOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getRuleVersionHistory";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'ruleId' is set
    if (ruleId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'ruleId' when calling getRuleVersionHistory");
    }
    Long pageSize = parameters.pageSize;
    Long pageNumber = parameters.pageNumber;
    // create path and map variables
    String localVarPath =
        "/api/v2/security_monitoring/rules/{rule_id}/version_history"
            .replaceAll("\\{" + "rule_id" + "\\}", apiClient.escapeString(ruleId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SecurityMonitoringApi.getRuleVersionHistory",
            localVarPath,
            localVarQueryParams,
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
        new GenericType<GetRuleVersionHistoryResponse>() {});
  }

  /**
   * Get a rule&#39;s version history.
   *
   * <p>See {@link #getRuleVersionHistoryWithHttpInfo}.
   *
   * @param ruleId The ID of the rule. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;GetRuleVersionHistoryResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<GetRuleVersionHistoryResponse>>
      getRuleVersionHistoryWithHttpInfoAsync(
          String ruleId, GetRuleVersionHistoryOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "getRuleVersionHistory";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<GetRuleVersionHistoryResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'ruleId' is set
    if (ruleId == null) {
      CompletableFuture<ApiResponse<GetRuleVersionHistoryResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'ruleId' when calling getRuleVersionHistory"));
      return result;
    }
    Long pageSize = parameters.pageSize;
    Long pageNumber = parameters.pageNumber;
    // create path and map variables
    String localVarPath =
        "/api/v2/security_monitoring/rules/{rule_id}/version_history"
            .replaceAll("\\{" + "rule_id" + "\\}", apiClient.escapeString(ruleId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SecurityMonitoringApi.getRuleVersionHistory",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<GetRuleVersionHistoryResponse>> result =
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
        new GenericType<GetRuleVersionHistoryResponse>() {});
  }

  /** Manage optional parameters to getSBOM. */
  public static class GetSBOMOptionalParameters {
    private String filterRepoDigest;

    /**
     * Set filterRepoDigest.
     *
     * @param filterRepoDigest The container image <code>repo_digest</code> for the SBOM request.
     *     When the requested asset type is 'Image', this filter is mandatory. (optional)
     * @return GetSBOMOptionalParameters
     */
    public GetSBOMOptionalParameters filterRepoDigest(String filterRepoDigest) {
      this.filterRepoDigest = filterRepoDigest;
      return this;
    }
  }

  /**
   * Get SBOM.
   *
   * <p>See {@link #getSBOMWithHttpInfo}.
   *
   * @param assetType The type of the asset for the SBOM request. (required)
   * @param filterAssetName The name of the asset for the SBOM request. (required)
   * @return GetSBOMResponse
   * @throws ApiException if fails to make API call
   */
  public GetSBOMResponse getSBOM(AssetType assetType, String filterAssetName) throws ApiException {
    return getSBOMWithHttpInfo(assetType, filterAssetName, new GetSBOMOptionalParameters())
        .getData();
  }

  /**
   * Get SBOM.
   *
   * <p>See {@link #getSBOMWithHttpInfoAsync}.
   *
   * @param assetType The type of the asset for the SBOM request. (required)
   * @param filterAssetName The name of the asset for the SBOM request. (required)
   * @return CompletableFuture&lt;GetSBOMResponse&gt;
   */
  public CompletableFuture<GetSBOMResponse> getSBOMAsync(
      AssetType assetType, String filterAssetName) {
    return getSBOMWithHttpInfoAsync(assetType, filterAssetName, new GetSBOMOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get SBOM.
   *
   * <p>See {@link #getSBOMWithHttpInfo}.
   *
   * @param assetType The type of the asset for the SBOM request. (required)
   * @param filterAssetName The name of the asset for the SBOM request. (required)
   * @param parameters Optional parameters for the request.
   * @return GetSBOMResponse
   * @throws ApiException if fails to make API call
   */
  public GetSBOMResponse getSBOM(
      AssetType assetType, String filterAssetName, GetSBOMOptionalParameters parameters)
      throws ApiException {
    return getSBOMWithHttpInfo(assetType, filterAssetName, parameters).getData();
  }

  /**
   * Get SBOM.
   *
   * <p>See {@link #getSBOMWithHttpInfoAsync}.
   *
   * @param assetType The type of the asset for the SBOM request. (required)
   * @param filterAssetName The name of the asset for the SBOM request. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;GetSBOMResponse&gt;
   */
  public CompletableFuture<GetSBOMResponse> getSBOMAsync(
      AssetType assetType, String filterAssetName, GetSBOMOptionalParameters parameters) {
    return getSBOMWithHttpInfoAsync(assetType, filterAssetName, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a single SBOM related to an asset by its type and name.
   *
   * @param assetType The type of the asset for the SBOM request. (required)
   * @param filterAssetName The name of the asset for the SBOM request. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;GetSBOMResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad request: The server cannot process the request due to invalid syntax in the request. </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden: Access denied </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not found: asset not found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<GetSBOMResponse> getSBOMWithHttpInfo(
      AssetType assetType, String filterAssetName, GetSBOMOptionalParameters parameters)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getSBOM";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'assetType' is set
    if (assetType == null) {
      throw new ApiException(
          400, "Missing the required parameter 'assetType' when calling getSBOM");
    }

    // verify the required parameter 'filterAssetName' is set
    if (filterAssetName == null) {
      throw new ApiException(
          400, "Missing the required parameter 'filterAssetName' when calling getSBOM");
    }
    String filterRepoDigest = parameters.filterRepoDigest;
    // create path and map variables
    String localVarPath =
        "/api/v2/security/sboms/{asset_type}"
            .replaceAll("\\{" + "asset_type" + "\\}", apiClient.escapeString(assetType.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[asset_name]", filterAssetName));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[repo_digest]", filterRepoDigest));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SecurityMonitoringApi.getSBOM",
            localVarPath,
            localVarQueryParams,
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
        new GenericType<GetSBOMResponse>() {});
  }

  /**
   * Get SBOM.
   *
   * <p>See {@link #getSBOMWithHttpInfo}.
   *
   * @param assetType The type of the asset for the SBOM request. (required)
   * @param filterAssetName The name of the asset for the SBOM request. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;GetSBOMResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<GetSBOMResponse>> getSBOMWithHttpInfoAsync(
      AssetType assetType, String filterAssetName, GetSBOMOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "getSBOM";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<GetSBOMResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'assetType' is set
    if (assetType == null) {
      CompletableFuture<ApiResponse<GetSBOMResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'assetType' when calling getSBOM"));
      return result;
    }

    // verify the required parameter 'filterAssetName' is set
    if (filterAssetName == null) {
      CompletableFuture<ApiResponse<GetSBOMResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'filterAssetName' when calling getSBOM"));
      return result;
    }
    String filterRepoDigest = parameters.filterRepoDigest;
    // create path and map variables
    String localVarPath =
        "/api/v2/security/sboms/{asset_type}"
            .replaceAll("\\{" + "asset_type" + "\\}", apiClient.escapeString(assetType.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[asset_name]", filterAssetName));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[repo_digest]", filterRepoDigest));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SecurityMonitoringApi.getSBOM",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<GetSBOMResponse>> result = new CompletableFuture<>();
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
        new GenericType<GetSBOMResponse>() {});
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
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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

  /**
   * Get details of a signal-based notification rule.
   *
   * <p>See {@link #getSignalNotificationRuleWithHttpInfo}.
   *
   * @param id ID of the notification rule. (required)
   * @return NotificationRuleResponse
   * @throws ApiException if fails to make API call
   */
  public NotificationRuleResponse getSignalNotificationRule(String id) throws ApiException {
    return getSignalNotificationRuleWithHttpInfo(id).getData();
  }

  /**
   * Get details of a signal-based notification rule.
   *
   * <p>See {@link #getSignalNotificationRuleWithHttpInfoAsync}.
   *
   * @param id ID of the notification rule. (required)
   * @return CompletableFuture&lt;NotificationRuleResponse&gt;
   */
  public CompletableFuture<NotificationRuleResponse> getSignalNotificationRuleAsync(String id) {
    return getSignalNotificationRuleWithHttpInfoAsync(id)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the details of a notification rule for security signals.
   *
   * @param id ID of the notification rule. (required)
   * @return ApiResponse&lt;NotificationRuleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> Notification rule details. </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<NotificationRuleResponse> getSignalNotificationRuleWithHttpInfo(String id)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(
          400, "Missing the required parameter 'id' when calling getSignalNotificationRule");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/security/signals/notification_rules/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SecurityMonitoringApi.getSignalNotificationRule",
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
        new GenericType<NotificationRuleResponse>() {});
  }

  /**
   * Get details of a signal-based notification rule.
   *
   * <p>See {@link #getSignalNotificationRuleWithHttpInfo}.
   *
   * @param id ID of the notification rule. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;NotificationRuleResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<NotificationRuleResponse>>
      getSignalNotificationRuleWithHttpInfoAsync(String id) {
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
      CompletableFuture<ApiResponse<NotificationRuleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'id' when calling getSignalNotificationRule"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/security/signals/notification_rules/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SecurityMonitoringApi.getSignalNotificationRule",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<NotificationRuleResponse>> result = new CompletableFuture<>();
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
        new GenericType<NotificationRuleResponse>() {});
  }

  /**
   * Get the list of signal-based notification rules.
   *
   * <p>See {@link #getSignalNotificationRulesWithHttpInfo}.
   *
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object getSignalNotificationRules() throws ApiException {
    return getSignalNotificationRulesWithHttpInfo().getData();
  }

  /**
   * Get the list of signal-based notification rules.
   *
   * <p>See {@link #getSignalNotificationRulesWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;Object&gt;
   */
  public CompletableFuture<Object> getSignalNotificationRulesAsync() {
    return getSignalNotificationRulesWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Returns the list of notification rules for security signals.
   *
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> The list of notification rules. </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Object> getSignalNotificationRulesWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/security/signals/notification_rules";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SecurityMonitoringApi.getSignalNotificationRules",
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
        new GenericType<Object>() {});
  }

  /**
   * Get the list of signal-based notification rules.
   *
   * <p>See {@link #getSignalNotificationRulesWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;Object&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Object>> getSignalNotificationRulesWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/security/signals/notification_rules";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SecurityMonitoringApi.getSignalNotificationRules",
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
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<Object>() {});
  }

  /**
   * Get details of a vulnerability notification rule.
   *
   * <p>See {@link #getVulnerabilityNotificationRuleWithHttpInfo}.
   *
   * @param id ID of the notification rule. (required)
   * @return NotificationRuleResponse
   * @throws ApiException if fails to make API call
   */
  public NotificationRuleResponse getVulnerabilityNotificationRule(String id) throws ApiException {
    return getVulnerabilityNotificationRuleWithHttpInfo(id).getData();
  }

  /**
   * Get details of a vulnerability notification rule.
   *
   * <p>See {@link #getVulnerabilityNotificationRuleWithHttpInfoAsync}.
   *
   * @param id ID of the notification rule. (required)
   * @return CompletableFuture&lt;NotificationRuleResponse&gt;
   */
  public CompletableFuture<NotificationRuleResponse> getVulnerabilityNotificationRuleAsync(
      String id) {
    return getVulnerabilityNotificationRuleWithHttpInfoAsync(id)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the details of a notification rule for security vulnerabilities.
   *
   * @param id ID of the notification rule. (required)
   * @return ApiResponse&lt;NotificationRuleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> Notification rule details. </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<NotificationRuleResponse> getVulnerabilityNotificationRuleWithHttpInfo(
      String id) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(
          400, "Missing the required parameter 'id' when calling getVulnerabilityNotificationRule");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/security/vulnerabilities/notification_rules/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SecurityMonitoringApi.getVulnerabilityNotificationRule",
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
        new GenericType<NotificationRuleResponse>() {});
  }

  /**
   * Get details of a vulnerability notification rule.
   *
   * <p>See {@link #getVulnerabilityNotificationRuleWithHttpInfo}.
   *
   * @param id ID of the notification rule. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;NotificationRuleResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<NotificationRuleResponse>>
      getVulnerabilityNotificationRuleWithHttpInfoAsync(String id) {
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
      CompletableFuture<ApiResponse<NotificationRuleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'id' when calling getVulnerabilityNotificationRule"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/security/vulnerabilities/notification_rules/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SecurityMonitoringApi.getVulnerabilityNotificationRule",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<NotificationRuleResponse>> result = new CompletableFuture<>();
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
        new GenericType<NotificationRuleResponse>() {});
  }

  /**
   * Get the list of vulnerability notification rules.
   *
   * <p>See {@link #getVulnerabilityNotificationRulesWithHttpInfo}.
   *
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object getVulnerabilityNotificationRules() throws ApiException {
    return getVulnerabilityNotificationRulesWithHttpInfo().getData();
  }

  /**
   * Get the list of vulnerability notification rules.
   *
   * <p>See {@link #getVulnerabilityNotificationRulesWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;Object&gt;
   */
  public CompletableFuture<Object> getVulnerabilityNotificationRulesAsync() {
    return getVulnerabilityNotificationRulesWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Returns the list of notification rules for security vulnerabilities.
   *
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> The list of notification rules. </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Object> getVulnerabilityNotificationRulesWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/security/vulnerabilities/notification_rules";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SecurityMonitoringApi.getVulnerabilityNotificationRules",
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
        new GenericType<Object>() {});
  }

  /**
   * Get the list of vulnerability notification rules.
   *
   * <p>See {@link #getVulnerabilityNotificationRulesWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;Object&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Object>>
      getVulnerabilityNotificationRulesWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/security/vulnerabilities/notification_rules";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SecurityMonitoringApi.getVulnerabilityNotificationRules",
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
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<Object>() {});
  }

  /** Manage optional parameters to listAssetsSBOMs. */
  public static class ListAssetsSBOMsOptionalParameters {
    private String pageToken;
    private Long pageNumber;
    private AssetType filterAssetType;
    private String filterAssetName;
    private String filterPackageName;
    private String filterPackageVersion;
    private String filterLicenseName;
    private SBOMComponentLicenseType filterLicenseType;

    /**
     * Set pageToken.
     *
     * @param pageToken Its value must come from the <code>links</code> section of the response of
     *     the first request. Do not manually edit it. (optional)
     * @return ListAssetsSBOMsOptionalParameters
     */
    public ListAssetsSBOMsOptionalParameters pageToken(String pageToken) {
      this.pageToken = pageToken;
      return this;
    }

    /**
     * Set pageNumber.
     *
     * @param pageNumber The page number to be retrieved. It should be equal to or greater than 1.
     *     (optional)
     * @return ListAssetsSBOMsOptionalParameters
     */
    public ListAssetsSBOMsOptionalParameters pageNumber(Long pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set filterAssetType.
     *
     * @param filterAssetType The type of the assets for the SBOM request. (optional)
     * @return ListAssetsSBOMsOptionalParameters
     */
    public ListAssetsSBOMsOptionalParameters filterAssetType(AssetType filterAssetType) {
      this.filterAssetType = filterAssetType;
      return this;
    }

    /**
     * Set filterAssetName.
     *
     * @param filterAssetName The name of the asset for the SBOM request. (optional)
     * @return ListAssetsSBOMsOptionalParameters
     */
    public ListAssetsSBOMsOptionalParameters filterAssetName(String filterAssetName) {
      this.filterAssetName = filterAssetName;
      return this;
    }

    /**
     * Set filterPackageName.
     *
     * @param filterPackageName The name of the component that is a dependency of an asset.
     *     (optional)
     * @return ListAssetsSBOMsOptionalParameters
     */
    public ListAssetsSBOMsOptionalParameters filterPackageName(String filterPackageName) {
      this.filterPackageName = filterPackageName;
      return this;
    }

    /**
     * Set filterPackageVersion.
     *
     * @param filterPackageVersion The version of the component that is a dependency of an asset.
     *     (optional)
     * @return ListAssetsSBOMsOptionalParameters
     */
    public ListAssetsSBOMsOptionalParameters filterPackageVersion(String filterPackageVersion) {
      this.filterPackageVersion = filterPackageVersion;
      return this;
    }

    /**
     * Set filterLicenseName.
     *
     * @param filterLicenseName The software license name of the component that is a dependency of
     *     an asset. (optional)
     * @return ListAssetsSBOMsOptionalParameters
     */
    public ListAssetsSBOMsOptionalParameters filterLicenseName(String filterLicenseName) {
      this.filterLicenseName = filterLicenseName;
      return this;
    }

    /**
     * Set filterLicenseType.
     *
     * @param filterLicenseType The software license type of the component that is a dependency of
     *     an asset. (optional)
     * @return ListAssetsSBOMsOptionalParameters
     */
    public ListAssetsSBOMsOptionalParameters filterLicenseType(
        SBOMComponentLicenseType filterLicenseType) {
      this.filterLicenseType = filterLicenseType;
      return this;
    }
  }

  /**
   * List assets SBOMs.
   *
   * <p>See {@link #listAssetsSBOMsWithHttpInfo}.
   *
   * @return ListAssetsSBOMsResponse
   * @throws ApiException if fails to make API call
   */
  public ListAssetsSBOMsResponse listAssetsSBOMs() throws ApiException {
    return listAssetsSBOMsWithHttpInfo(new ListAssetsSBOMsOptionalParameters()).getData();
  }

  /**
   * List assets SBOMs.
   *
   * <p>See {@link #listAssetsSBOMsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;ListAssetsSBOMsResponse&gt;
   */
  public CompletableFuture<ListAssetsSBOMsResponse> listAssetsSBOMsAsync() {
    return listAssetsSBOMsWithHttpInfoAsync(new ListAssetsSBOMsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List assets SBOMs.
   *
   * <p>See {@link #listAssetsSBOMsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return ListAssetsSBOMsResponse
   * @throws ApiException if fails to make API call
   */
  public ListAssetsSBOMsResponse listAssetsSBOMs(ListAssetsSBOMsOptionalParameters parameters)
      throws ApiException {
    return listAssetsSBOMsWithHttpInfo(parameters).getData();
  }

  /**
   * List assets SBOMs.
   *
   * <p>See {@link #listAssetsSBOMsWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ListAssetsSBOMsResponse&gt;
   */
  public CompletableFuture<ListAssetsSBOMsResponse> listAssetsSBOMsAsync(
      ListAssetsSBOMsOptionalParameters parameters) {
    return listAssetsSBOMsWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a list of assets SBOMs for an organization.
   *
   * <h3>Pagination</h3>
   *
   * <p>Please review the <a href="#pagination">Pagination section</a> for the "List
   * Vulnerabilities" endpoint.
   *
   * <h3>Filtering</h3>
   *
   * <p>Please review the <a href="#filtering">Filtering section</a> for the "List Vulnerabilities"
   * endpoint.
   *
   * <h3>Metadata</h3>
   *
   * <p>Please review the <a href="#metadata">Metadata section</a> for the "List Vulnerabilities"
   * endpoint.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;ListAssetsSBOMsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad request: The server cannot process the request due to invalid syntax in the request. </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden: Access denied </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not found: asset not found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ListAssetsSBOMsResponse> listAssetsSBOMsWithHttpInfo(
      ListAssetsSBOMsOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listAssetsSBOMs";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    String pageToken = parameters.pageToken;
    Long pageNumber = parameters.pageNumber;
    AssetType filterAssetType = parameters.filterAssetType;
    String filterAssetName = parameters.filterAssetName;
    String filterPackageName = parameters.filterPackageName;
    String filterPackageVersion = parameters.filterPackageVersion;
    String filterLicenseName = parameters.filterLicenseName;
    SBOMComponentLicenseType filterLicenseType = parameters.filterLicenseType;
    // create path and map variables
    String localVarPath = "/api/v2/security/sboms";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[token]", pageToken));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[asset_type]", filterAssetType));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[asset_name]", filterAssetName));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[package_name]", filterPackageName));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[package_version]", filterPackageVersion));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[license_name]", filterLicenseName));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[license_type]", filterLicenseType));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SecurityMonitoringApi.listAssetsSBOMs",
            localVarPath,
            localVarQueryParams,
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
        new GenericType<ListAssetsSBOMsResponse>() {});
  }

  /**
   * List assets SBOMs.
   *
   * <p>See {@link #listAssetsSBOMsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;ListAssetsSBOMsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ListAssetsSBOMsResponse>> listAssetsSBOMsWithHttpInfoAsync(
      ListAssetsSBOMsOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listAssetsSBOMs";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ListAssetsSBOMsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    String pageToken = parameters.pageToken;
    Long pageNumber = parameters.pageNumber;
    AssetType filterAssetType = parameters.filterAssetType;
    String filterAssetName = parameters.filterAssetName;
    String filterPackageName = parameters.filterPackageName;
    String filterPackageVersion = parameters.filterPackageVersion;
    String filterLicenseName = parameters.filterLicenseName;
    SBOMComponentLicenseType filterLicenseType = parameters.filterLicenseType;
    // create path and map variables
    String localVarPath = "/api/v2/security/sboms";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[token]", pageToken));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[asset_type]", filterAssetType));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[asset_name]", filterAssetName));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[package_name]", filterPackageName));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[package_version]", filterPackageVersion));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[license_name]", filterLicenseName));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[license_type]", filterLicenseType));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SecurityMonitoringApi.listAssetsSBOMs",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ListAssetsSBOMsResponse>> result = new CompletableFuture<>();
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
        new GenericType<ListAssetsSBOMsResponse>() {});
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
    private String filterResourceId;
    private String filterDiscoveryTimestamp;
    private FindingEvaluation filterEvaluation;
    private FindingStatus filterStatus;
    private List<FindingVulnerabilityType> filterVulnerabilityType;
    private Boolean detailedFindings;

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
     * Set filterResourceId.
     *
     * @param filterResourceId Return only findings for the specified resource id. (optional)
     * @return ListFindingsOptionalParameters
     */
    public ListFindingsOptionalParameters filterResourceId(String filterResourceId) {
      this.filterResourceId = filterResourceId;
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

    /**
     * Set filterVulnerabilityType.
     *
     * @param filterVulnerabilityType Return findings that match the selected vulnerability types
     *     (repeatable). (optional)
     * @return ListFindingsOptionalParameters
     */
    public ListFindingsOptionalParameters filterVulnerabilityType(
        List<FindingVulnerabilityType> filterVulnerabilityType) {
      this.filterVulnerabilityType = filterVulnerabilityType;
      return this;
    }

    /**
     * Set detailedFindings.
     *
     * @param detailedFindings Return additional fields for some findings. (optional)
     * @return ListFindingsOptionalParameters
     */
    public ListFindingsOptionalParameters detailedFindings(Boolean detailedFindings) {
      this.detailedFindings = detailedFindings;
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
   * Get a list of findings. These include both misconfigurations and identity risks.
   *
   * <p><strong>Note</strong>: To filter and return only identity risks, add the following query
   * parameter: <code>?filter[tags]=dd_rule_type:ciem</code>
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
   * <h3>Additional extension fields</h3>
   *
   * <p>Additional extension fields are available for some findings.
   *
   * <p>The data is available when you include the query parameter <code>?detailed_findings=true
   * </code> in the request.
   *
   * <p>The following fields are available for findings: - <code>external_id</code>: The resource
   * external ID related to the finding. - <code>description</code>: The description and remediation
   * steps for the finding. - <code>datadog_link</code>: The Datadog relative link for the finding.
   * - <code>ip_addresses</code>: The list of private IP addresses for the resource related to the
   * finding.
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
    String filterResourceId = parameters.filterResourceId;
    String filterDiscoveryTimestamp = parameters.filterDiscoveryTimestamp;
    FindingEvaluation filterEvaluation = parameters.filterEvaluation;
    FindingStatus filterStatus = parameters.filterStatus;
    List<FindingVulnerabilityType> filterVulnerabilityType = parameters.filterVulnerabilityType;
    Boolean detailedFindings = parameters.detailedFindings;
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
        apiClient.parameterToPairs("", "filter[@resource_id]", filterResourceId));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[discovery_timestamp]", filterDiscoveryTimestamp));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[evaluation]", filterEvaluation));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[status]", filterStatus));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("multi", "filter[vulnerability_type]", filterVulnerabilityType));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "detailed_findings", detailedFindings));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SecurityMonitoringApi.listFindings",
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
    String filterResourceId = parameters.filterResourceId;
    String filterDiscoveryTimestamp = parameters.filterDiscoveryTimestamp;
    FindingEvaluation filterEvaluation = parameters.filterEvaluation;
    FindingStatus filterStatus = parameters.filterStatus;
    List<FindingVulnerabilityType> filterVulnerabilityType = parameters.filterVulnerabilityType;
    Boolean detailedFindings = parameters.detailedFindings;
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
        apiClient.parameterToPairs("", "filter[@resource_id]", filterResourceId));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[discovery_timestamp]", filterDiscoveryTimestamp));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[evaluation]", filterEvaluation));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[status]", filterStatus));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("multi", "filter[vulnerability_type]", filterVulnerabilityType));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "detailed_findings", detailedFindings));

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
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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

  /** Manage optional parameters to listHistoricalJobs. */
  public static class ListHistoricalJobsOptionalParameters {
    private Long pageSize;
    private Long pageNumber;
    private String sort;
    private String filterQuery;

    /**
     * Set pageSize.
     *
     * @param pageSize Size for a given page. The maximum allowed value is 100. (optional, default
     *     to 10)
     * @return ListHistoricalJobsOptionalParameters
     */
    public ListHistoricalJobsOptionalParameters pageSize(Long pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set pageNumber.
     *
     * @param pageNumber Specific page number to return. (optional, default to 0)
     * @return ListHistoricalJobsOptionalParameters
     */
    public ListHistoricalJobsOptionalParameters pageNumber(Long pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set sort.
     *
     * @param sort The order of the jobs in results. (optional)
     * @return ListHistoricalJobsOptionalParameters
     */
    public ListHistoricalJobsOptionalParameters sort(String sort) {
      this.sort = sort;
      return this;
    }

    /**
     * Set filterQuery.
     *
     * @param filterQuery Query used to filter items from the fetched list. (optional)
     * @return ListHistoricalJobsOptionalParameters
     */
    public ListHistoricalJobsOptionalParameters filterQuery(String filterQuery) {
      this.filterQuery = filterQuery;
      return this;
    }
  }

  /**
   * List historical jobs.
   *
   * <p>See {@link #listHistoricalJobsWithHttpInfo}.
   *
   * @return ListHistoricalJobsResponse
   * @throws ApiException if fails to make API call
   */
  public ListHistoricalJobsResponse listHistoricalJobs() throws ApiException {
    return listHistoricalJobsWithHttpInfo(new ListHistoricalJobsOptionalParameters()).getData();
  }

  /**
   * List historical jobs.
   *
   * <p>See {@link #listHistoricalJobsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;ListHistoricalJobsResponse&gt;
   */
  public CompletableFuture<ListHistoricalJobsResponse> listHistoricalJobsAsync() {
    return listHistoricalJobsWithHttpInfoAsync(new ListHistoricalJobsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List historical jobs.
   *
   * <p>See {@link #listHistoricalJobsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return ListHistoricalJobsResponse
   * @throws ApiException if fails to make API call
   */
  public ListHistoricalJobsResponse listHistoricalJobs(
      ListHistoricalJobsOptionalParameters parameters) throws ApiException {
    return listHistoricalJobsWithHttpInfo(parameters).getData();
  }

  /**
   * List historical jobs.
   *
   * <p>See {@link #listHistoricalJobsWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ListHistoricalJobsResponse&gt;
   */
  public CompletableFuture<ListHistoricalJobsResponse> listHistoricalJobsAsync(
      ListHistoricalJobsOptionalParameters parameters) {
    return listHistoricalJobsWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List historical jobs.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;ListHistoricalJobsResponse&gt;
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
  public ApiResponse<ListHistoricalJobsResponse> listHistoricalJobsWithHttpInfo(
      ListHistoricalJobsOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listHistoricalJobs";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    Long pageSize = parameters.pageSize;
    Long pageNumber = parameters.pageNumber;
    String sort = parameters.sort;
    String filterQuery = parameters.filterQuery;
    // create path and map variables
    String localVarPath = "/api/v2/siem-historical-detections/jobs";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[query]", filterQuery));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SecurityMonitoringApi.listHistoricalJobs",
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
        new GenericType<ListHistoricalJobsResponse>() {});
  }

  /**
   * List historical jobs.
   *
   * <p>See {@link #listHistoricalJobsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;ListHistoricalJobsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ListHistoricalJobsResponse>>
      listHistoricalJobsWithHttpInfoAsync(ListHistoricalJobsOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listHistoricalJobs";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ListHistoricalJobsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    Long pageSize = parameters.pageSize;
    Long pageNumber = parameters.pageNumber;
    String sort = parameters.sort;
    String filterQuery = parameters.filterQuery;
    // create path and map variables
    String localVarPath = "/api/v2/siem-historical-detections/jobs";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[query]", filterQuery));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SecurityMonitoringApi.listHistoricalJobs",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ListHistoricalJobsResponse>> result = new CompletableFuture<>();
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
        new GenericType<ListHistoricalJobsResponse>() {});
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
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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

  /** Manage optional parameters to listVulnerabilities. */
  public static class ListVulnerabilitiesOptionalParameters {
    private String pageToken;
    private Long pageNumber;
    private VulnerabilityType filterType;
    private Double filterCvssBaseScoreOp;
    private VulnerabilitySeverity filterCvssBaseSeverity;
    private String filterCvssBaseVector;
    private Double filterCvssDatadogScoreOp;
    private VulnerabilitySeverity filterCvssDatadogSeverity;
    private String filterCvssDatadogVector;
    private VulnerabilityStatus filterStatus;
    private VulnerabilityTool filterTool;
    private String filterLibraryName;
    private String filterLibraryVersion;
    private String filterAdvisoryId;
    private Boolean filterRisksExploitationProbability;
    private Boolean filterRisksPocExploitAvailable;
    private Boolean filterRisksExploitAvailable;
    private Double filterRisksEpssScoreOp;
    private VulnerabilitySeverity filterRisksEpssSeverity;
    private String filterLanguage;
    private VulnerabilityEcosystem filterEcosystem;
    private String filterCodeLocationLocation;
    private String filterCodeLocationFilePath;
    private String filterCodeLocationMethod;
    private Boolean filterFixAvailable;
    private String filterRepoDigests;
    private String filterOrigin;
    private String filterAssetName;
    private AssetType filterAssetType;
    private String filterAssetVersionFirst;
    private String filterAssetVersionLast;
    private String filterAssetRepositoryUrl;
    private Boolean filterAssetRisksInProduction;
    private Boolean filterAssetRisksUnderAttack;
    private Boolean filterAssetRisksIsPubliclyAccessible;
    private Boolean filterAssetRisksHasPrivilegedAccess;
    private Boolean filterAssetRisksHasAccessToSensitiveData;
    private String filterAssetEnvironments;
    private String filterAssetTeams;
    private String filterAssetArch;
    private String filterAssetOperatingSystemName;
    private String filterAssetOperatingSystemVersion;

    /**
     * Set pageToken.
     *
     * @param pageToken Its value must come from the <code>links</code> section of the response of
     *     the first request. Do not manually edit it. (optional)
     * @return ListVulnerabilitiesOptionalParameters
     */
    public ListVulnerabilitiesOptionalParameters pageToken(String pageToken) {
      this.pageToken = pageToken;
      return this;
    }

    /**
     * Set pageNumber.
     *
     * @param pageNumber The page number to be retrieved. It should be equal or greater than <code>1
     *     </code> (optional)
     * @return ListVulnerabilitiesOptionalParameters
     */
    public ListVulnerabilitiesOptionalParameters pageNumber(Long pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set filterType.
     *
     * @param filterType Filter by vulnerability type. (optional)
     * @return ListVulnerabilitiesOptionalParameters
     */
    public ListVulnerabilitiesOptionalParameters filterType(VulnerabilityType filterType) {
      this.filterType = filterType;
      return this;
    }

    /**
     * Set filterCvssBaseScoreOp.
     *
     * @param filterCvssBaseScoreOp Filter by vulnerability base (i.e. from the original advisory)
     *     severity score. (optional)
     * @return ListVulnerabilitiesOptionalParameters
     */
    public ListVulnerabilitiesOptionalParameters filterCvssBaseScoreOp(
        Double filterCvssBaseScoreOp) {
      this.filterCvssBaseScoreOp = filterCvssBaseScoreOp;
      return this;
    }

    /**
     * Set filterCvssBaseSeverity.
     *
     * @param filterCvssBaseSeverity Filter by vulnerability base severity. (optional)
     * @return ListVulnerabilitiesOptionalParameters
     */
    public ListVulnerabilitiesOptionalParameters filterCvssBaseSeverity(
        VulnerabilitySeverity filterCvssBaseSeverity) {
      this.filterCvssBaseSeverity = filterCvssBaseSeverity;
      return this;
    }

    /**
     * Set filterCvssBaseVector.
     *
     * @param filterCvssBaseVector Filter by vulnerability base CVSS vector. (optional)
     * @return ListVulnerabilitiesOptionalParameters
     */
    public ListVulnerabilitiesOptionalParameters filterCvssBaseVector(String filterCvssBaseVector) {
      this.filterCvssBaseVector = filterCvssBaseVector;
      return this;
    }

    /**
     * Set filterCvssDatadogScoreOp.
     *
     * @param filterCvssDatadogScoreOp Filter by vulnerability Datadog severity score. (optional)
     * @return ListVulnerabilitiesOptionalParameters
     */
    public ListVulnerabilitiesOptionalParameters filterCvssDatadogScoreOp(
        Double filterCvssDatadogScoreOp) {
      this.filterCvssDatadogScoreOp = filterCvssDatadogScoreOp;
      return this;
    }

    /**
     * Set filterCvssDatadogSeverity.
     *
     * @param filterCvssDatadogSeverity Filter by vulnerability Datadog severity. (optional)
     * @return ListVulnerabilitiesOptionalParameters
     */
    public ListVulnerabilitiesOptionalParameters filterCvssDatadogSeverity(
        VulnerabilitySeverity filterCvssDatadogSeverity) {
      this.filterCvssDatadogSeverity = filterCvssDatadogSeverity;
      return this;
    }

    /**
     * Set filterCvssDatadogVector.
     *
     * @param filterCvssDatadogVector Filter by vulnerability Datadog CVSS vector. (optional)
     * @return ListVulnerabilitiesOptionalParameters
     */
    public ListVulnerabilitiesOptionalParameters filterCvssDatadogVector(
        String filterCvssDatadogVector) {
      this.filterCvssDatadogVector = filterCvssDatadogVector;
      return this;
    }

    /**
     * Set filterStatus.
     *
     * @param filterStatus Filter by the status of the vulnerability. (optional)
     * @return ListVulnerabilitiesOptionalParameters
     */
    public ListVulnerabilitiesOptionalParameters filterStatus(VulnerabilityStatus filterStatus) {
      this.filterStatus = filterStatus;
      return this;
    }

    /**
     * Set filterTool.
     *
     * @param filterTool Filter by the tool of the vulnerability. (optional)
     * @return ListVulnerabilitiesOptionalParameters
     */
    public ListVulnerabilitiesOptionalParameters filterTool(VulnerabilityTool filterTool) {
      this.filterTool = filterTool;
      return this;
    }

    /**
     * Set filterLibraryName.
     *
     * @param filterLibraryName Filter by library name. (optional)
     * @return ListVulnerabilitiesOptionalParameters
     */
    public ListVulnerabilitiesOptionalParameters filterLibraryName(String filterLibraryName) {
      this.filterLibraryName = filterLibraryName;
      return this;
    }

    /**
     * Set filterLibraryVersion.
     *
     * @param filterLibraryVersion Filter by library version. (optional)
     * @return ListVulnerabilitiesOptionalParameters
     */
    public ListVulnerabilitiesOptionalParameters filterLibraryVersion(String filterLibraryVersion) {
      this.filterLibraryVersion = filterLibraryVersion;
      return this;
    }

    /**
     * Set filterAdvisoryId.
     *
     * @param filterAdvisoryId Filter by advisory ID. (optional)
     * @return ListVulnerabilitiesOptionalParameters
     */
    public ListVulnerabilitiesOptionalParameters filterAdvisoryId(String filterAdvisoryId) {
      this.filterAdvisoryId = filterAdvisoryId;
      return this;
    }

    /**
     * Set filterRisksExploitationProbability.
     *
     * @param filterRisksExploitationProbability Filter by exploitation probability. (optional)
     * @return ListVulnerabilitiesOptionalParameters
     */
    public ListVulnerabilitiesOptionalParameters filterRisksExploitationProbability(
        Boolean filterRisksExploitationProbability) {
      this.filterRisksExploitationProbability = filterRisksExploitationProbability;
      return this;
    }

    /**
     * Set filterRisksPocExploitAvailable.
     *
     * @param filterRisksPocExploitAvailable Filter by POC exploit availability. (optional)
     * @return ListVulnerabilitiesOptionalParameters
     */
    public ListVulnerabilitiesOptionalParameters filterRisksPocExploitAvailable(
        Boolean filterRisksPocExploitAvailable) {
      this.filterRisksPocExploitAvailable = filterRisksPocExploitAvailable;
      return this;
    }

    /**
     * Set filterRisksExploitAvailable.
     *
     * @param filterRisksExploitAvailable Filter by public exploit availability. (optional)
     * @return ListVulnerabilitiesOptionalParameters
     */
    public ListVulnerabilitiesOptionalParameters filterRisksExploitAvailable(
        Boolean filterRisksExploitAvailable) {
      this.filterRisksExploitAvailable = filterRisksExploitAvailable;
      return this;
    }

    /**
     * Set filterRisksEpssScoreOp.
     *
     * @param filterRisksEpssScoreOp Filter by vulnerability <a
     *     href="https://www.first.org/epss/">EPSS</a> severity score. (optional)
     * @return ListVulnerabilitiesOptionalParameters
     */
    public ListVulnerabilitiesOptionalParameters filterRisksEpssScoreOp(
        Double filterRisksEpssScoreOp) {
      this.filterRisksEpssScoreOp = filterRisksEpssScoreOp;
      return this;
    }

    /**
     * Set filterRisksEpssSeverity.
     *
     * @param filterRisksEpssSeverity Filter by vulnerability <a
     *     href="https://www.first.org/epss/">EPSS</a> severity. (optional)
     * @return ListVulnerabilitiesOptionalParameters
     */
    public ListVulnerabilitiesOptionalParameters filterRisksEpssSeverity(
        VulnerabilitySeverity filterRisksEpssSeverity) {
      this.filterRisksEpssSeverity = filterRisksEpssSeverity;
      return this;
    }

    /**
     * Set filterLanguage.
     *
     * @param filterLanguage Filter by language. (optional)
     * @return ListVulnerabilitiesOptionalParameters
     */
    public ListVulnerabilitiesOptionalParameters filterLanguage(String filterLanguage) {
      this.filterLanguage = filterLanguage;
      return this;
    }

    /**
     * Set filterEcosystem.
     *
     * @param filterEcosystem Filter by ecosystem. (optional)
     * @return ListVulnerabilitiesOptionalParameters
     */
    public ListVulnerabilitiesOptionalParameters filterEcosystem(
        VulnerabilityEcosystem filterEcosystem) {
      this.filterEcosystem = filterEcosystem;
      return this;
    }

    /**
     * Set filterCodeLocationLocation.
     *
     * @param filterCodeLocationLocation Filter by vulnerability location. (optional)
     * @return ListVulnerabilitiesOptionalParameters
     */
    public ListVulnerabilitiesOptionalParameters filterCodeLocationLocation(
        String filterCodeLocationLocation) {
      this.filterCodeLocationLocation = filterCodeLocationLocation;
      return this;
    }

    /**
     * Set filterCodeLocationFilePath.
     *
     * @param filterCodeLocationFilePath Filter by vulnerability file path. (optional)
     * @return ListVulnerabilitiesOptionalParameters
     */
    public ListVulnerabilitiesOptionalParameters filterCodeLocationFilePath(
        String filterCodeLocationFilePath) {
      this.filterCodeLocationFilePath = filterCodeLocationFilePath;
      return this;
    }

    /**
     * Set filterCodeLocationMethod.
     *
     * @param filterCodeLocationMethod Filter by method. (optional)
     * @return ListVulnerabilitiesOptionalParameters
     */
    public ListVulnerabilitiesOptionalParameters filterCodeLocationMethod(
        String filterCodeLocationMethod) {
      this.filterCodeLocationMethod = filterCodeLocationMethod;
      return this;
    }

    /**
     * Set filterFixAvailable.
     *
     * @param filterFixAvailable Filter by fix availability. (optional)
     * @return ListVulnerabilitiesOptionalParameters
     */
    public ListVulnerabilitiesOptionalParameters filterFixAvailable(Boolean filterFixAvailable) {
      this.filterFixAvailable = filterFixAvailable;
      return this;
    }

    /**
     * Set filterRepoDigests.
     *
     * @param filterRepoDigests Filter by vulnerability <code>repo_digest</code> (when the
     *     vulnerability is related to <code>Image</code> asset). (optional)
     * @return ListVulnerabilitiesOptionalParameters
     */
    public ListVulnerabilitiesOptionalParameters filterRepoDigests(String filterRepoDigests) {
      this.filterRepoDigests = filterRepoDigests;
      return this;
    }

    /**
     * Set filterOrigin.
     *
     * @param filterOrigin Filter by origin. (optional)
     * @return ListVulnerabilitiesOptionalParameters
     */
    public ListVulnerabilitiesOptionalParameters filterOrigin(String filterOrigin) {
      this.filterOrigin = filterOrigin;
      return this;
    }

    /**
     * Set filterAssetName.
     *
     * @param filterAssetName Filter by asset name. (optional)
     * @return ListVulnerabilitiesOptionalParameters
     */
    public ListVulnerabilitiesOptionalParameters filterAssetName(String filterAssetName) {
      this.filterAssetName = filterAssetName;
      return this;
    }

    /**
     * Set filterAssetType.
     *
     * @param filterAssetType Filter by asset type. (optional)
     * @return ListVulnerabilitiesOptionalParameters
     */
    public ListVulnerabilitiesOptionalParameters filterAssetType(AssetType filterAssetType) {
      this.filterAssetType = filterAssetType;
      return this;
    }

    /**
     * Set filterAssetVersionFirst.
     *
     * @param filterAssetVersionFirst Filter by the first version of the asset this vulnerability
     *     has been detected on. (optional)
     * @return ListVulnerabilitiesOptionalParameters
     */
    public ListVulnerabilitiesOptionalParameters filterAssetVersionFirst(
        String filterAssetVersionFirst) {
      this.filterAssetVersionFirst = filterAssetVersionFirst;
      return this;
    }

    /**
     * Set filterAssetVersionLast.
     *
     * @param filterAssetVersionLast Filter by the last version of the asset this vulnerability has
     *     been detected on. (optional)
     * @return ListVulnerabilitiesOptionalParameters
     */
    public ListVulnerabilitiesOptionalParameters filterAssetVersionLast(
        String filterAssetVersionLast) {
      this.filterAssetVersionLast = filterAssetVersionLast;
      return this;
    }

    /**
     * Set filterAssetRepositoryUrl.
     *
     * @param filterAssetRepositoryUrl Filter by the repository url associated to the asset.
     *     (optional)
     * @return ListVulnerabilitiesOptionalParameters
     */
    public ListVulnerabilitiesOptionalParameters filterAssetRepositoryUrl(
        String filterAssetRepositoryUrl) {
      this.filterAssetRepositoryUrl = filterAssetRepositoryUrl;
      return this;
    }

    /**
     * Set filterAssetRisksInProduction.
     *
     * @param filterAssetRisksInProduction Filter whether the asset is in production or not.
     *     (optional)
     * @return ListVulnerabilitiesOptionalParameters
     */
    public ListVulnerabilitiesOptionalParameters filterAssetRisksInProduction(
        Boolean filterAssetRisksInProduction) {
      this.filterAssetRisksInProduction = filterAssetRisksInProduction;
      return this;
    }

    /**
     * Set filterAssetRisksUnderAttack.
     *
     * @param filterAssetRisksUnderAttack Filter whether the asset is under attack or not.
     *     (optional)
     * @return ListVulnerabilitiesOptionalParameters
     */
    public ListVulnerabilitiesOptionalParameters filterAssetRisksUnderAttack(
        Boolean filterAssetRisksUnderAttack) {
      this.filterAssetRisksUnderAttack = filterAssetRisksUnderAttack;
      return this;
    }

    /**
     * Set filterAssetRisksIsPubliclyAccessible.
     *
     * @param filterAssetRisksIsPubliclyAccessible Filter whether the asset is publicly accessible
     *     or not. (optional)
     * @return ListVulnerabilitiesOptionalParameters
     */
    public ListVulnerabilitiesOptionalParameters filterAssetRisksIsPubliclyAccessible(
        Boolean filterAssetRisksIsPubliclyAccessible) {
      this.filterAssetRisksIsPubliclyAccessible = filterAssetRisksIsPubliclyAccessible;
      return this;
    }

    /**
     * Set filterAssetRisksHasPrivilegedAccess.
     *
     * @param filterAssetRisksHasPrivilegedAccess Filter whether the asset is publicly accessible or
     *     not. (optional)
     * @return ListVulnerabilitiesOptionalParameters
     */
    public ListVulnerabilitiesOptionalParameters filterAssetRisksHasPrivilegedAccess(
        Boolean filterAssetRisksHasPrivilegedAccess) {
      this.filterAssetRisksHasPrivilegedAccess = filterAssetRisksHasPrivilegedAccess;
      return this;
    }

    /**
     * Set filterAssetRisksHasAccessToSensitiveData.
     *
     * @param filterAssetRisksHasAccessToSensitiveData Filter whether the asset has access to
     *     sensitive data or not. (optional)
     * @return ListVulnerabilitiesOptionalParameters
     */
    public ListVulnerabilitiesOptionalParameters filterAssetRisksHasAccessToSensitiveData(
        Boolean filterAssetRisksHasAccessToSensitiveData) {
      this.filterAssetRisksHasAccessToSensitiveData = filterAssetRisksHasAccessToSensitiveData;
      return this;
    }

    /**
     * Set filterAssetEnvironments.
     *
     * @param filterAssetEnvironments Filter by asset environments. (optional)
     * @return ListVulnerabilitiesOptionalParameters
     */
    public ListVulnerabilitiesOptionalParameters filterAssetEnvironments(
        String filterAssetEnvironments) {
      this.filterAssetEnvironments = filterAssetEnvironments;
      return this;
    }

    /**
     * Set filterAssetTeams.
     *
     * @param filterAssetTeams Filter by asset teams. (optional)
     * @return ListVulnerabilitiesOptionalParameters
     */
    public ListVulnerabilitiesOptionalParameters filterAssetTeams(String filterAssetTeams) {
      this.filterAssetTeams = filterAssetTeams;
      return this;
    }

    /**
     * Set filterAssetArch.
     *
     * @param filterAssetArch Filter by asset architecture. (optional)
     * @return ListVulnerabilitiesOptionalParameters
     */
    public ListVulnerabilitiesOptionalParameters filterAssetArch(String filterAssetArch) {
      this.filterAssetArch = filterAssetArch;
      return this;
    }

    /**
     * Set filterAssetOperatingSystemName.
     *
     * @param filterAssetOperatingSystemName Filter by asset operating system name. (optional)
     * @return ListVulnerabilitiesOptionalParameters
     */
    public ListVulnerabilitiesOptionalParameters filterAssetOperatingSystemName(
        String filterAssetOperatingSystemName) {
      this.filterAssetOperatingSystemName = filterAssetOperatingSystemName;
      return this;
    }

    /**
     * Set filterAssetOperatingSystemVersion.
     *
     * @param filterAssetOperatingSystemVersion Filter by asset operating system version. (optional)
     * @return ListVulnerabilitiesOptionalParameters
     */
    public ListVulnerabilitiesOptionalParameters filterAssetOperatingSystemVersion(
        String filterAssetOperatingSystemVersion) {
      this.filterAssetOperatingSystemVersion = filterAssetOperatingSystemVersion;
      return this;
    }
  }

  /**
   * List vulnerabilities.
   *
   * <p>See {@link #listVulnerabilitiesWithHttpInfo}.
   *
   * @return ListVulnerabilitiesResponse
   * @throws ApiException if fails to make API call
   */
  public ListVulnerabilitiesResponse listVulnerabilities() throws ApiException {
    return listVulnerabilitiesWithHttpInfo(new ListVulnerabilitiesOptionalParameters()).getData();
  }

  /**
   * List vulnerabilities.
   *
   * <p>See {@link #listVulnerabilitiesWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;ListVulnerabilitiesResponse&gt;
   */
  public CompletableFuture<ListVulnerabilitiesResponse> listVulnerabilitiesAsync() {
    return listVulnerabilitiesWithHttpInfoAsync(new ListVulnerabilitiesOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List vulnerabilities.
   *
   * <p>See {@link #listVulnerabilitiesWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return ListVulnerabilitiesResponse
   * @throws ApiException if fails to make API call
   */
  public ListVulnerabilitiesResponse listVulnerabilities(
      ListVulnerabilitiesOptionalParameters parameters) throws ApiException {
    return listVulnerabilitiesWithHttpInfo(parameters).getData();
  }

  /**
   * List vulnerabilities.
   *
   * <p>See {@link #listVulnerabilitiesWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ListVulnerabilitiesResponse&gt;
   */
  public CompletableFuture<ListVulnerabilitiesResponse> listVulnerabilitiesAsync(
      ListVulnerabilitiesOptionalParameters parameters) {
    return listVulnerabilitiesWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a list of vulnerabilities.
   *
   * <h3>Pagination</h3>
   *
   * <p>Pagination is enabled by default in both <code>vulnerabilities</code> and <code>assets
   * </code>. The size of the page varies depending on the endpoint and cannot be modified. To
   * automate the request of the next page, you can use the links section in the response.
   *
   * <p>This endpoint will return paginated responses. The pages are stored in the links section of
   * the response:
   *
   * <p><code>JSON
   * {
   *   "data": [...],
   *   "meta": {...},
   *   "links": {
   *     "self": "https://.../api/v2/security/vulnerabilities",
   *     "first": "https://.../api/v2/security/vulnerabilities?page[number]=1&amp;page[token]=abc",
   *     "last": "https://.../api/v2/security/vulnerabilities?page[number]=43&amp;page[token]=abc",
   *     "next": "https://.../api/v2/security/vulnerabilities?page[number]=2&amp;page[token]=abc"
   *   }
   * }</code>
   *
   * <ul>
   *   <li><code>links.previous</code> is empty if the first page is requested.
   *   <li><code>links.next</code> is empty if the last page is requested.
   * </ul>
   *
   * <h3>Token</h3>
   *
   * <p>Vulnerabilities can be created, updated or deleted at any point in time.
   *
   * <p>Upon the first request, a token is created to ensure consistency across subsequent paginated
   * requests.
   *
   * <p>A token is valid only for 24 hours.
   *
   * <h3>First request</h3>
   *
   * <p>We consider a request to be the first request when there is no <code>page[token]</code>
   * parameter.
   *
   * <p>The response of this first request contains the newly created token in the <code>links
   * </code> section.
   *
   * <p>This token can then be used in the subsequent paginated requests.
   *
   * <h3>Subsequent requests</h3>
   *
   * <p>Any request containing valid <code>page[token]</code> and <code>page[number]</code>
   * parameters will be considered a subsequent request.
   *
   * <p>If the <code>token</code> is invalid, a <code>404</code> response will be returned.
   *
   * <p>If the page <code>number</code> is invalid, a <code>400</code> response will be returned.
   *
   * <h3>Filtering</h3>
   *
   * <p>The request can include some filter parameters to filter the data to be retrieved. The
   * format of the filter parameters follows the <a
   * href="https://jsonapi.org/format/#fetching-filtering">JSON:API format</a>: <code>
   * filter[$prop_name]</code>, where <code>prop_name</code> is the property name in the entity
   * being filtered by.
   *
   * <p>All filters can include multiple values, where data will be filtered with an OR clause:
   * <code>filter[title]=Title1,Title2</code> will filter all vulnerabilities where title is equal
   * to <code>Title1</code> OR <code>Title2</code>.
   *
   * <p>String filters are case sensitive.
   *
   * <p>Boolean filters accept <code>true</code> or <code>false</code> as values.
   *
   * <p>Number filters must include an operator as a second filter input: <code>
   * filter[$prop_name][$operator]</code>. For example, for the vulnerabilities endpoint: <code>
   * filter[cvss.base.score][lte]=8</code>.
   *
   * <p>Available operators are: <code>eq</code> (==), <code>lt</code> (&lt;), <code>lte</code>
   * (&lt;=), <code>gt</code> (&gt;) and <code>gte</code> (&gt;=).
   *
   * <h3>Metadata</h3>
   *
   * <p>Following <a href="https://jsonapi.org/format/#document-meta">JSON:API format</a>, object
   * including non-standard meta-information.
   *
   * <p>This endpoint includes the meta member in the response. For more details on each of the
   * properties included in this section, check the endpoints response tables.
   *
   * <p><code>JSON
   * {
   *   "data": [...],
   *   "meta": {
   *     "total": 1500,
   *     "count": 18732,
   *     "token": "some_token"
   *   },
   *   "links": {...}
   * }</code>
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;ListVulnerabilitiesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad request: The server cannot process the request due to invalid syntax in the request. </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden: Access denied </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not found: There is no request associated with the provided token. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ListVulnerabilitiesResponse> listVulnerabilitiesWithHttpInfo(
      ListVulnerabilitiesOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listVulnerabilities";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    String pageToken = parameters.pageToken;
    Long pageNumber = parameters.pageNumber;
    VulnerabilityType filterType = parameters.filterType;
    Double filterCvssBaseScoreOp = parameters.filterCvssBaseScoreOp;
    VulnerabilitySeverity filterCvssBaseSeverity = parameters.filterCvssBaseSeverity;
    String filterCvssBaseVector = parameters.filterCvssBaseVector;
    Double filterCvssDatadogScoreOp = parameters.filterCvssDatadogScoreOp;
    VulnerabilitySeverity filterCvssDatadogSeverity = parameters.filterCvssDatadogSeverity;
    String filterCvssDatadogVector = parameters.filterCvssDatadogVector;
    VulnerabilityStatus filterStatus = parameters.filterStatus;
    VulnerabilityTool filterTool = parameters.filterTool;
    String filterLibraryName = parameters.filterLibraryName;
    String filterLibraryVersion = parameters.filterLibraryVersion;
    String filterAdvisoryId = parameters.filterAdvisoryId;
    Boolean filterRisksExploitationProbability = parameters.filterRisksExploitationProbability;
    Boolean filterRisksPocExploitAvailable = parameters.filterRisksPocExploitAvailable;
    Boolean filterRisksExploitAvailable = parameters.filterRisksExploitAvailable;
    Double filterRisksEpssScoreOp = parameters.filterRisksEpssScoreOp;
    VulnerabilitySeverity filterRisksEpssSeverity = parameters.filterRisksEpssSeverity;
    String filterLanguage = parameters.filterLanguage;
    VulnerabilityEcosystem filterEcosystem = parameters.filterEcosystem;
    String filterCodeLocationLocation = parameters.filterCodeLocationLocation;
    String filterCodeLocationFilePath = parameters.filterCodeLocationFilePath;
    String filterCodeLocationMethod = parameters.filterCodeLocationMethod;
    Boolean filterFixAvailable = parameters.filterFixAvailable;
    String filterRepoDigests = parameters.filterRepoDigests;
    String filterOrigin = parameters.filterOrigin;
    String filterAssetName = parameters.filterAssetName;
    AssetType filterAssetType = parameters.filterAssetType;
    String filterAssetVersionFirst = parameters.filterAssetVersionFirst;
    String filterAssetVersionLast = parameters.filterAssetVersionLast;
    String filterAssetRepositoryUrl = parameters.filterAssetRepositoryUrl;
    Boolean filterAssetRisksInProduction = parameters.filterAssetRisksInProduction;
    Boolean filterAssetRisksUnderAttack = parameters.filterAssetRisksUnderAttack;
    Boolean filterAssetRisksIsPubliclyAccessible = parameters.filterAssetRisksIsPubliclyAccessible;
    Boolean filterAssetRisksHasPrivilegedAccess = parameters.filterAssetRisksHasPrivilegedAccess;
    Boolean filterAssetRisksHasAccessToSensitiveData =
        parameters.filterAssetRisksHasAccessToSensitiveData;
    String filterAssetEnvironments = parameters.filterAssetEnvironments;
    String filterAssetTeams = parameters.filterAssetTeams;
    String filterAssetArch = parameters.filterAssetArch;
    String filterAssetOperatingSystemName = parameters.filterAssetOperatingSystemName;
    String filterAssetOperatingSystemVersion = parameters.filterAssetOperatingSystemVersion;
    // create path and map variables
    String localVarPath = "/api/v2/security/vulnerabilities";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[token]", pageToken));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[type]", filterType));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[cvss.base.score][`$op`]", filterCvssBaseScoreOp));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[cvss.base.severity]", filterCvssBaseSeverity));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[cvss.base.vector]", filterCvssBaseVector));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs(
            "", "filter[cvss.datadog.score][`$op`]", filterCvssDatadogScoreOp));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[cvss.datadog.severity]", filterCvssDatadogSeverity));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[cvss.datadog.vector]", filterCvssDatadogVector));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[status]", filterStatus));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[tool]", filterTool));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[library.name]", filterLibraryName));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[library.version]", filterLibraryVersion));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[advisory_id]", filterAdvisoryId));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs(
            "", "filter[risks.exploitation_probability]", filterRisksExploitationProbability));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs(
            "", "filter[risks.poc_exploit_available]", filterRisksPocExploitAvailable));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs(
            "", "filter[risks.exploit_available]", filterRisksExploitAvailable));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[risks.epss.score][`$op`]", filterRisksEpssScoreOp));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[risks.epss.severity]", filterRisksEpssSeverity));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[language]", filterLanguage));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[ecosystem]", filterEcosystem));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs(
            "", "filter[code_location.location]", filterCodeLocationLocation));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs(
            "", "filter[code_location.file_path]", filterCodeLocationFilePath));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[code_location.method]", filterCodeLocationMethod));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[fix_available]", filterFixAvailable));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[repo_digests]", filterRepoDigests));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[origin]", filterOrigin));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[asset.name]", filterAssetName));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[asset.type]", filterAssetType));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[asset.version.first]", filterAssetVersionFirst));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[asset.version.last]", filterAssetVersionLast));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[asset.repository_url]", filterAssetRepositoryUrl));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs(
            "", "filter[asset.risks.in_production]", filterAssetRisksInProduction));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs(
            "", "filter[asset.risks.under_attack]", filterAssetRisksUnderAttack));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs(
            "",
            "filter[asset.risks.is_publicly_accessible]",
            filterAssetRisksIsPubliclyAccessible));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs(
            "", "filter[asset.risks.has_privileged_access]", filterAssetRisksHasPrivilegedAccess));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs(
            "",
            "filter[asset.risks.has_access_to_sensitive_data]",
            filterAssetRisksHasAccessToSensitiveData));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[asset.environments]", filterAssetEnvironments));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[asset.teams]", filterAssetTeams));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[asset.arch]", filterAssetArch));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs(
            "", "filter[asset.operating_system.name]", filterAssetOperatingSystemName));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs(
            "", "filter[asset.operating_system.version]", filterAssetOperatingSystemVersion));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SecurityMonitoringApi.listVulnerabilities",
            localVarPath,
            localVarQueryParams,
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
        new GenericType<ListVulnerabilitiesResponse>() {});
  }

  /**
   * List vulnerabilities.
   *
   * <p>See {@link #listVulnerabilitiesWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;ListVulnerabilitiesResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ListVulnerabilitiesResponse>>
      listVulnerabilitiesWithHttpInfoAsync(ListVulnerabilitiesOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listVulnerabilities";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ListVulnerabilitiesResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    String pageToken = parameters.pageToken;
    Long pageNumber = parameters.pageNumber;
    VulnerabilityType filterType = parameters.filterType;
    Double filterCvssBaseScoreOp = parameters.filterCvssBaseScoreOp;
    VulnerabilitySeverity filterCvssBaseSeverity = parameters.filterCvssBaseSeverity;
    String filterCvssBaseVector = parameters.filterCvssBaseVector;
    Double filterCvssDatadogScoreOp = parameters.filterCvssDatadogScoreOp;
    VulnerabilitySeverity filterCvssDatadogSeverity = parameters.filterCvssDatadogSeverity;
    String filterCvssDatadogVector = parameters.filterCvssDatadogVector;
    VulnerabilityStatus filterStatus = parameters.filterStatus;
    VulnerabilityTool filterTool = parameters.filterTool;
    String filterLibraryName = parameters.filterLibraryName;
    String filterLibraryVersion = parameters.filterLibraryVersion;
    String filterAdvisoryId = parameters.filterAdvisoryId;
    Boolean filterRisksExploitationProbability = parameters.filterRisksExploitationProbability;
    Boolean filterRisksPocExploitAvailable = parameters.filterRisksPocExploitAvailable;
    Boolean filterRisksExploitAvailable = parameters.filterRisksExploitAvailable;
    Double filterRisksEpssScoreOp = parameters.filterRisksEpssScoreOp;
    VulnerabilitySeverity filterRisksEpssSeverity = parameters.filterRisksEpssSeverity;
    String filterLanguage = parameters.filterLanguage;
    VulnerabilityEcosystem filterEcosystem = parameters.filterEcosystem;
    String filterCodeLocationLocation = parameters.filterCodeLocationLocation;
    String filterCodeLocationFilePath = parameters.filterCodeLocationFilePath;
    String filterCodeLocationMethod = parameters.filterCodeLocationMethod;
    Boolean filterFixAvailable = parameters.filterFixAvailable;
    String filterRepoDigests = parameters.filterRepoDigests;
    String filterOrigin = parameters.filterOrigin;
    String filterAssetName = parameters.filterAssetName;
    AssetType filterAssetType = parameters.filterAssetType;
    String filterAssetVersionFirst = parameters.filterAssetVersionFirst;
    String filterAssetVersionLast = parameters.filterAssetVersionLast;
    String filterAssetRepositoryUrl = parameters.filterAssetRepositoryUrl;
    Boolean filterAssetRisksInProduction = parameters.filterAssetRisksInProduction;
    Boolean filterAssetRisksUnderAttack = parameters.filterAssetRisksUnderAttack;
    Boolean filterAssetRisksIsPubliclyAccessible = parameters.filterAssetRisksIsPubliclyAccessible;
    Boolean filterAssetRisksHasPrivilegedAccess = parameters.filterAssetRisksHasPrivilegedAccess;
    Boolean filterAssetRisksHasAccessToSensitiveData =
        parameters.filterAssetRisksHasAccessToSensitiveData;
    String filterAssetEnvironments = parameters.filterAssetEnvironments;
    String filterAssetTeams = parameters.filterAssetTeams;
    String filterAssetArch = parameters.filterAssetArch;
    String filterAssetOperatingSystemName = parameters.filterAssetOperatingSystemName;
    String filterAssetOperatingSystemVersion = parameters.filterAssetOperatingSystemVersion;
    // create path and map variables
    String localVarPath = "/api/v2/security/vulnerabilities";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[token]", pageToken));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[type]", filterType));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[cvss.base.score][`$op`]", filterCvssBaseScoreOp));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[cvss.base.severity]", filterCvssBaseSeverity));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[cvss.base.vector]", filterCvssBaseVector));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs(
            "", "filter[cvss.datadog.score][`$op`]", filterCvssDatadogScoreOp));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[cvss.datadog.severity]", filterCvssDatadogSeverity));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[cvss.datadog.vector]", filterCvssDatadogVector));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[status]", filterStatus));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[tool]", filterTool));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[library.name]", filterLibraryName));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[library.version]", filterLibraryVersion));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[advisory_id]", filterAdvisoryId));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs(
            "", "filter[risks.exploitation_probability]", filterRisksExploitationProbability));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs(
            "", "filter[risks.poc_exploit_available]", filterRisksPocExploitAvailable));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs(
            "", "filter[risks.exploit_available]", filterRisksExploitAvailable));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[risks.epss.score][`$op`]", filterRisksEpssScoreOp));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[risks.epss.severity]", filterRisksEpssSeverity));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[language]", filterLanguage));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[ecosystem]", filterEcosystem));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs(
            "", "filter[code_location.location]", filterCodeLocationLocation));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs(
            "", "filter[code_location.file_path]", filterCodeLocationFilePath));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[code_location.method]", filterCodeLocationMethod));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[fix_available]", filterFixAvailable));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[repo_digests]", filterRepoDigests));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[origin]", filterOrigin));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[asset.name]", filterAssetName));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[asset.type]", filterAssetType));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[asset.version.first]", filterAssetVersionFirst));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[asset.version.last]", filterAssetVersionLast));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[asset.repository_url]", filterAssetRepositoryUrl));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs(
            "", "filter[asset.risks.in_production]", filterAssetRisksInProduction));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs(
            "", "filter[asset.risks.under_attack]", filterAssetRisksUnderAttack));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs(
            "",
            "filter[asset.risks.is_publicly_accessible]",
            filterAssetRisksIsPubliclyAccessible));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs(
            "", "filter[asset.risks.has_privileged_access]", filterAssetRisksHasPrivilegedAccess));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs(
            "",
            "filter[asset.risks.has_access_to_sensitive_data]",
            filterAssetRisksHasAccessToSensitiveData));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[asset.environments]", filterAssetEnvironments));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[asset.teams]", filterAssetTeams));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[asset.arch]", filterAssetArch));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs(
            "", "filter[asset.operating_system.name]", filterAssetOperatingSystemName));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs(
            "", "filter[asset.operating_system.version]", filterAssetOperatingSystemVersion));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SecurityMonitoringApi.listVulnerabilities",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ListVulnerabilitiesResponse>> result =
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
        new GenericType<ListVulnerabilitiesResponse>() {});
  }

  /** Manage optional parameters to listVulnerableAssets. */
  public static class ListVulnerableAssetsOptionalParameters {
    private String pageToken;
    private Long pageNumber;
    private String filterName;
    private AssetType filterType;
    private String filterVersionFirst;
    private String filterVersionLast;
    private String filterRepositoryUrl;
    private Boolean filterRisksInProduction;
    private Boolean filterRisksUnderAttack;
    private Boolean filterRisksIsPubliclyAccessible;
    private Boolean filterRisksHasPrivilegedAccess;
    private Boolean filterRisksHasAccessToSensitiveData;
    private String filterEnvironments;
    private String filterTeams;
    private String filterArch;
    private String filterOperatingSystemName;
    private String filterOperatingSystemVersion;

    /**
     * Set pageToken.
     *
     * @param pageToken Its value must come from the <code>links</code> section of the response of
     *     the first request. Do not manually edit it. (optional)
     * @return ListVulnerableAssetsOptionalParameters
     */
    public ListVulnerableAssetsOptionalParameters pageToken(String pageToken) {
      this.pageToken = pageToken;
      return this;
    }

    /**
     * Set pageNumber.
     *
     * @param pageNumber The page number to be retrieved. It should be equal or greater than <code>1
     *     </code> (optional)
     * @return ListVulnerableAssetsOptionalParameters
     */
    public ListVulnerableAssetsOptionalParameters pageNumber(Long pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set filterName.
     *
     * @param filterName Filter by name. (optional)
     * @return ListVulnerableAssetsOptionalParameters
     */
    public ListVulnerableAssetsOptionalParameters filterName(String filterName) {
      this.filterName = filterName;
      return this;
    }

    /**
     * Set filterType.
     *
     * @param filterType Filter by type. (optional)
     * @return ListVulnerableAssetsOptionalParameters
     */
    public ListVulnerableAssetsOptionalParameters filterType(AssetType filterType) {
      this.filterType = filterType;
      return this;
    }

    /**
     * Set filterVersionFirst.
     *
     * @param filterVersionFirst Filter by the first version of the asset since it has been
     *     vulnerable. (optional)
     * @return ListVulnerableAssetsOptionalParameters
     */
    public ListVulnerableAssetsOptionalParameters filterVersionFirst(String filterVersionFirst) {
      this.filterVersionFirst = filterVersionFirst;
      return this;
    }

    /**
     * Set filterVersionLast.
     *
     * @param filterVersionLast Filter by the last detected version of the asset. (optional)
     * @return ListVulnerableAssetsOptionalParameters
     */
    public ListVulnerableAssetsOptionalParameters filterVersionLast(String filterVersionLast) {
      this.filterVersionLast = filterVersionLast;
      return this;
    }

    /**
     * Set filterRepositoryUrl.
     *
     * @param filterRepositoryUrl Filter by the repository url associated to the asset. (optional)
     * @return ListVulnerableAssetsOptionalParameters
     */
    public ListVulnerableAssetsOptionalParameters filterRepositoryUrl(String filterRepositoryUrl) {
      this.filterRepositoryUrl = filterRepositoryUrl;
      return this;
    }

    /**
     * Set filterRisksInProduction.
     *
     * @param filterRisksInProduction Filter whether the asset is in production or not. (optional)
     * @return ListVulnerableAssetsOptionalParameters
     */
    public ListVulnerableAssetsOptionalParameters filterRisksInProduction(
        Boolean filterRisksInProduction) {
      this.filterRisksInProduction = filterRisksInProduction;
      return this;
    }

    /**
     * Set filterRisksUnderAttack.
     *
     * @param filterRisksUnderAttack Filter whether the asset (Service) is under attack or not.
     *     (optional)
     * @return ListVulnerableAssetsOptionalParameters
     */
    public ListVulnerableAssetsOptionalParameters filterRisksUnderAttack(
        Boolean filterRisksUnderAttack) {
      this.filterRisksUnderAttack = filterRisksUnderAttack;
      return this;
    }

    /**
     * Set filterRisksIsPubliclyAccessible.
     *
     * @param filterRisksIsPubliclyAccessible Filter whether the asset (Host) is publicly accessible
     *     or not. (optional)
     * @return ListVulnerableAssetsOptionalParameters
     */
    public ListVulnerableAssetsOptionalParameters filterRisksIsPubliclyAccessible(
        Boolean filterRisksIsPubliclyAccessible) {
      this.filterRisksIsPubliclyAccessible = filterRisksIsPubliclyAccessible;
      return this;
    }

    /**
     * Set filterRisksHasPrivilegedAccess.
     *
     * @param filterRisksHasPrivilegedAccess Filter whether the asset (Host) has privileged access
     *     or not. (optional)
     * @return ListVulnerableAssetsOptionalParameters
     */
    public ListVulnerableAssetsOptionalParameters filterRisksHasPrivilegedAccess(
        Boolean filterRisksHasPrivilegedAccess) {
      this.filterRisksHasPrivilegedAccess = filterRisksHasPrivilegedAccess;
      return this;
    }

    /**
     * Set filterRisksHasAccessToSensitiveData.
     *
     * @param filterRisksHasAccessToSensitiveData Filter whether the asset (Host) has access to
     *     sensitive data or not. (optional)
     * @return ListVulnerableAssetsOptionalParameters
     */
    public ListVulnerableAssetsOptionalParameters filterRisksHasAccessToSensitiveData(
        Boolean filterRisksHasAccessToSensitiveData) {
      this.filterRisksHasAccessToSensitiveData = filterRisksHasAccessToSensitiveData;
      return this;
    }

    /**
     * Set filterEnvironments.
     *
     * @param filterEnvironments Filter by environment. (optional)
     * @return ListVulnerableAssetsOptionalParameters
     */
    public ListVulnerableAssetsOptionalParameters filterEnvironments(String filterEnvironments) {
      this.filterEnvironments = filterEnvironments;
      return this;
    }

    /**
     * Set filterTeams.
     *
     * @param filterTeams Filter by teams. (optional)
     * @return ListVulnerableAssetsOptionalParameters
     */
    public ListVulnerableAssetsOptionalParameters filterTeams(String filterTeams) {
      this.filterTeams = filterTeams;
      return this;
    }

    /**
     * Set filterArch.
     *
     * @param filterArch Filter by architecture. (optional)
     * @return ListVulnerableAssetsOptionalParameters
     */
    public ListVulnerableAssetsOptionalParameters filterArch(String filterArch) {
      this.filterArch = filterArch;
      return this;
    }

    /**
     * Set filterOperatingSystemName.
     *
     * @param filterOperatingSystemName Filter by operating system name. (optional)
     * @return ListVulnerableAssetsOptionalParameters
     */
    public ListVulnerableAssetsOptionalParameters filterOperatingSystemName(
        String filterOperatingSystemName) {
      this.filterOperatingSystemName = filterOperatingSystemName;
      return this;
    }

    /**
     * Set filterOperatingSystemVersion.
     *
     * @param filterOperatingSystemVersion Filter by operating system version. (optional)
     * @return ListVulnerableAssetsOptionalParameters
     */
    public ListVulnerableAssetsOptionalParameters filterOperatingSystemVersion(
        String filterOperatingSystemVersion) {
      this.filterOperatingSystemVersion = filterOperatingSystemVersion;
      return this;
    }
  }

  /**
   * List vulnerable assets.
   *
   * <p>See {@link #listVulnerableAssetsWithHttpInfo}.
   *
   * @return ListVulnerableAssetsResponse
   * @throws ApiException if fails to make API call
   */
  public ListVulnerableAssetsResponse listVulnerableAssets() throws ApiException {
    return listVulnerableAssetsWithHttpInfo(new ListVulnerableAssetsOptionalParameters()).getData();
  }

  /**
   * List vulnerable assets.
   *
   * <p>See {@link #listVulnerableAssetsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;ListVulnerableAssetsResponse&gt;
   */
  public CompletableFuture<ListVulnerableAssetsResponse> listVulnerableAssetsAsync() {
    return listVulnerableAssetsWithHttpInfoAsync(new ListVulnerableAssetsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List vulnerable assets.
   *
   * <p>See {@link #listVulnerableAssetsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return ListVulnerableAssetsResponse
   * @throws ApiException if fails to make API call
   */
  public ListVulnerableAssetsResponse listVulnerableAssets(
      ListVulnerableAssetsOptionalParameters parameters) throws ApiException {
    return listVulnerableAssetsWithHttpInfo(parameters).getData();
  }

  /**
   * List vulnerable assets.
   *
   * <p>See {@link #listVulnerableAssetsWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ListVulnerableAssetsResponse&gt;
   */
  public CompletableFuture<ListVulnerableAssetsResponse> listVulnerableAssetsAsync(
      ListVulnerableAssetsOptionalParameters parameters) {
    return listVulnerableAssetsWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a list of vulnerable assets.
   *
   * <h3>Pagination</h3>
   *
   * <p>Please review the <a href="#pagination">Pagination section for the "List
   * Vulnerabilities"</a> endpoint.
   *
   * <h3>Filtering</h3>
   *
   * <p>Please review the <a href="#filtering">Filtering section for the "List Vulnerabilities"</a>
   * endpoint.
   *
   * <h3>Metadata</h3>
   *
   * <p>Please review the <a href="#metadata">Metadata section for the "List Vulnerabilities"</a>
   * endpoint.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;ListVulnerableAssetsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad request: The server cannot process the request due to invalid syntax in the request. </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden: Access denied </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not found: There is no request associated with the provided token. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ListVulnerableAssetsResponse> listVulnerableAssetsWithHttpInfo(
      ListVulnerableAssetsOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listVulnerableAssets";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    String pageToken = parameters.pageToken;
    Long pageNumber = parameters.pageNumber;
    String filterName = parameters.filterName;
    AssetType filterType = parameters.filterType;
    String filterVersionFirst = parameters.filterVersionFirst;
    String filterVersionLast = parameters.filterVersionLast;
    String filterRepositoryUrl = parameters.filterRepositoryUrl;
    Boolean filterRisksInProduction = parameters.filterRisksInProduction;
    Boolean filterRisksUnderAttack = parameters.filterRisksUnderAttack;
    Boolean filterRisksIsPubliclyAccessible = parameters.filterRisksIsPubliclyAccessible;
    Boolean filterRisksHasPrivilegedAccess = parameters.filterRisksHasPrivilegedAccess;
    Boolean filterRisksHasAccessToSensitiveData = parameters.filterRisksHasAccessToSensitiveData;
    String filterEnvironments = parameters.filterEnvironments;
    String filterTeams = parameters.filterTeams;
    String filterArch = parameters.filterArch;
    String filterOperatingSystemName = parameters.filterOperatingSystemName;
    String filterOperatingSystemVersion = parameters.filterOperatingSystemVersion;
    // create path and map variables
    String localVarPath = "/api/v2/security/assets";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[token]", pageToken));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[name]", filterName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[type]", filterType));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[version.first]", filterVersionFirst));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[version.last]", filterVersionLast));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[repository_url]", filterRepositoryUrl));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[risks.in_production]", filterRisksInProduction));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[risks.under_attack]", filterRisksUnderAttack));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs(
            "", "filter[risks.is_publicly_accessible]", filterRisksIsPubliclyAccessible));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs(
            "", "filter[risks.has_privileged_access]", filterRisksHasPrivilegedAccess));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs(
            "", "filter[risks.has_access_to_sensitive_data]", filterRisksHasAccessToSensitiveData));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[environments]", filterEnvironments));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[teams]", filterTeams));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[arch]", filterArch));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[operating_system.name]", filterOperatingSystemName));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs(
            "", "filter[operating_system.version]", filterOperatingSystemVersion));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SecurityMonitoringApi.listVulnerableAssets",
            localVarPath,
            localVarQueryParams,
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
        new GenericType<ListVulnerableAssetsResponse>() {});
  }

  /**
   * List vulnerable assets.
   *
   * <p>See {@link #listVulnerableAssetsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;ListVulnerableAssetsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ListVulnerableAssetsResponse>>
      listVulnerableAssetsWithHttpInfoAsync(ListVulnerableAssetsOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listVulnerableAssets";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ListVulnerableAssetsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    String pageToken = parameters.pageToken;
    Long pageNumber = parameters.pageNumber;
    String filterName = parameters.filterName;
    AssetType filterType = parameters.filterType;
    String filterVersionFirst = parameters.filterVersionFirst;
    String filterVersionLast = parameters.filterVersionLast;
    String filterRepositoryUrl = parameters.filterRepositoryUrl;
    Boolean filterRisksInProduction = parameters.filterRisksInProduction;
    Boolean filterRisksUnderAttack = parameters.filterRisksUnderAttack;
    Boolean filterRisksIsPubliclyAccessible = parameters.filterRisksIsPubliclyAccessible;
    Boolean filterRisksHasPrivilegedAccess = parameters.filterRisksHasPrivilegedAccess;
    Boolean filterRisksHasAccessToSensitiveData = parameters.filterRisksHasAccessToSensitiveData;
    String filterEnvironments = parameters.filterEnvironments;
    String filterTeams = parameters.filterTeams;
    String filterArch = parameters.filterArch;
    String filterOperatingSystemName = parameters.filterOperatingSystemName;
    String filterOperatingSystemVersion = parameters.filterOperatingSystemVersion;
    // create path and map variables
    String localVarPath = "/api/v2/security/assets";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[token]", pageToken));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[name]", filterName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[type]", filterType));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[version.first]", filterVersionFirst));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[version.last]", filterVersionLast));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[repository_url]", filterRepositoryUrl));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[risks.in_production]", filterRisksInProduction));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[risks.under_attack]", filterRisksUnderAttack));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs(
            "", "filter[risks.is_publicly_accessible]", filterRisksIsPubliclyAccessible));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs(
            "", "filter[risks.has_privileged_access]", filterRisksHasPrivilegedAccess));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs(
            "", "filter[risks.has_access_to_sensitive_data]", filterRisksHasAccessToSensitiveData));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[environments]", filterEnvironments));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[teams]", filterTeams));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[arch]", filterArch));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[operating_system.name]", filterOperatingSystemName));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs(
            "", "filter[operating_system.version]", filterOperatingSystemVersion));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SecurityMonitoringApi.listVulnerableAssets",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ListVulnerableAssetsResponse>> result =
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
        new GenericType<ListVulnerableAssetsResponse>() {});
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

  /**
   * Patch a signal-based notification rule.
   *
   * <p>See {@link #patchSignalNotificationRuleWithHttpInfo}.
   *
   * @param id ID of the notification rule. (required)
   * @param body (required)
   * @return NotificationRuleResponse
   * @throws ApiException if fails to make API call
   */
  public NotificationRuleResponse patchSignalNotificationRule(
      String id, PatchNotificationRuleParameters body) throws ApiException {
    return patchSignalNotificationRuleWithHttpInfo(id, body).getData();
  }

  /**
   * Patch a signal-based notification rule.
   *
   * <p>See {@link #patchSignalNotificationRuleWithHttpInfoAsync}.
   *
   * @param id ID of the notification rule. (required)
   * @param body (required)
   * @return CompletableFuture&lt;NotificationRuleResponse&gt;
   */
  public CompletableFuture<NotificationRuleResponse> patchSignalNotificationRuleAsync(
      String id, PatchNotificationRuleParameters body) {
    return patchSignalNotificationRuleWithHttpInfoAsync(id, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Partially update the notification rule. All fields are optional; if a field is not provided, it
   * is not updated.
   *
   * @param id ID of the notification rule. (required)
   * @param body (required)
   * @return ApiResponse&lt;NotificationRuleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> Notification rule successfully patched. </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 422 </td><td> The server cannot process the request because it contains invalid data. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<NotificationRuleResponse> patchSignalNotificationRuleWithHttpInfo(
      String id, PatchNotificationRuleParameters body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(
          400, "Missing the required parameter 'id' when calling patchSignalNotificationRule");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling patchSignalNotificationRule");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/security/signals/notification_rules/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SecurityMonitoringApi.patchSignalNotificationRule",
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
        new GenericType<NotificationRuleResponse>() {});
  }

  /**
   * Patch a signal-based notification rule.
   *
   * <p>See {@link #patchSignalNotificationRuleWithHttpInfo}.
   *
   * @param id ID of the notification rule. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;NotificationRuleResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<NotificationRuleResponse>>
      patchSignalNotificationRuleWithHttpInfoAsync(
          String id, PatchNotificationRuleParameters body) {
    Object localVarPostBody = body;

    // verify the required parameter 'id' is set
    if (id == null) {
      CompletableFuture<ApiResponse<NotificationRuleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'id' when calling patchSignalNotificationRule"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<NotificationRuleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling patchSignalNotificationRule"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/security/signals/notification_rules/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SecurityMonitoringApi.patchSignalNotificationRule",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<NotificationRuleResponse>> result = new CompletableFuture<>();
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
        new GenericType<NotificationRuleResponse>() {});
  }

  /**
   * Patch a vulnerability-based notification rule.
   *
   * <p>See {@link #patchVulnerabilityNotificationRuleWithHttpInfo}.
   *
   * @param id ID of the notification rule. (required)
   * @param body (required)
   * @return NotificationRuleResponse
   * @throws ApiException if fails to make API call
   */
  public NotificationRuleResponse patchVulnerabilityNotificationRule(
      String id, PatchNotificationRuleParameters body) throws ApiException {
    return patchVulnerabilityNotificationRuleWithHttpInfo(id, body).getData();
  }

  /**
   * Patch a vulnerability-based notification rule.
   *
   * <p>See {@link #patchVulnerabilityNotificationRuleWithHttpInfoAsync}.
   *
   * @param id ID of the notification rule. (required)
   * @param body (required)
   * @return CompletableFuture&lt;NotificationRuleResponse&gt;
   */
  public CompletableFuture<NotificationRuleResponse> patchVulnerabilityNotificationRuleAsync(
      String id, PatchNotificationRuleParameters body) {
    return patchVulnerabilityNotificationRuleWithHttpInfoAsync(id, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Partially update the notification rule. All fields are optional; if a field is not provided, it
   * is not updated.
   *
   * @param id ID of the notification rule. (required)
   * @param body (required)
   * @return ApiResponse&lt;NotificationRuleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> Notification rule successfully patched. </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 422 </td><td> The server cannot process the request because it contains invalid data. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<NotificationRuleResponse> patchVulnerabilityNotificationRuleWithHttpInfo(
      String id, PatchNotificationRuleParameters body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'id' when calling patchVulnerabilityNotificationRule");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'body' when calling patchVulnerabilityNotificationRule");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/security/vulnerabilities/notification_rules/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SecurityMonitoringApi.patchVulnerabilityNotificationRule",
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
        new GenericType<NotificationRuleResponse>() {});
  }

  /**
   * Patch a vulnerability-based notification rule.
   *
   * <p>See {@link #patchVulnerabilityNotificationRuleWithHttpInfo}.
   *
   * @param id ID of the notification rule. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;NotificationRuleResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<NotificationRuleResponse>>
      patchVulnerabilityNotificationRuleWithHttpInfoAsync(
          String id, PatchNotificationRuleParameters body) {
    Object localVarPostBody = body;

    // verify the required parameter 'id' is set
    if (id == null) {
      CompletableFuture<ApiResponse<NotificationRuleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'id' when calling"
                  + " patchVulnerabilityNotificationRule"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<NotificationRuleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " patchVulnerabilityNotificationRule"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/security/vulnerabilities/notification_rules/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SecurityMonitoringApi.patchVulnerabilityNotificationRule",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<NotificationRuleResponse>> result = new CompletableFuture<>();
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
        new GenericType<NotificationRuleResponse>() {});
  }

  /**
   * Run a historical job.
   *
   * <p>See {@link #runHistoricalJobWithHttpInfo}.
   *
   * @param body (required)
   * @return JobCreateResponse
   * @throws ApiException if fails to make API call
   */
  public JobCreateResponse runHistoricalJob(RunHistoricalJobRequest body) throws ApiException {
    return runHistoricalJobWithHttpInfo(body).getData();
  }

  /**
   * Run a historical job.
   *
   * <p>See {@link #runHistoricalJobWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;JobCreateResponse&gt;
   */
  public CompletableFuture<JobCreateResponse> runHistoricalJobAsync(RunHistoricalJobRequest body) {
    return runHistoricalJobWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Run a historical job.
   *
   * @param body (required)
   * @return ApiResponse&lt;JobCreateResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Status created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Concurrent Modification </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<JobCreateResponse> runHistoricalJobWithHttpInfo(RunHistoricalJobRequest body)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "runHistoricalJob";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling runHistoricalJob");
    }
    // create path and map variables
    String localVarPath = "/api/v2/siem-historical-detections/jobs";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SecurityMonitoringApi.runHistoricalJob",
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
        new GenericType<JobCreateResponse>() {});
  }

  /**
   * Run a historical job.
   *
   * <p>See {@link #runHistoricalJobWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;JobCreateResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<JobCreateResponse>> runHistoricalJobWithHttpInfoAsync(
      RunHistoricalJobRequest body) {
    // Check if unstable operation is enabled
    String operationId = "runHistoricalJob";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<JobCreateResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<JobCreateResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling runHistoricalJob"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/siem-historical-detections/jobs";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SecurityMonitoringApi.runHistoricalJob",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<JobCreateResponse>> result = new CompletableFuture<>();
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
        new GenericType<JobCreateResponse>() {});
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
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
   * Update a custom framework.
   *
   * <p>See {@link #updateCustomFrameworkWithHttpInfo}.
   *
   * @param handle The framework handle (required)
   * @param version The framework version (required)
   * @param body (required)
   * @return UpdateCustomFrameworkResponse
   * @throws ApiException if fails to make API call
   */
  public UpdateCustomFrameworkResponse updateCustomFramework(
      String handle, String version, UpdateCustomFrameworkRequest body) throws ApiException {
    return updateCustomFrameworkWithHttpInfo(handle, version, body).getData();
  }

  /**
   * Update a custom framework.
   *
   * <p>See {@link #updateCustomFrameworkWithHttpInfoAsync}.
   *
   * @param handle The framework handle (required)
   * @param version The framework version (required)
   * @param body (required)
   * @return CompletableFuture&lt;UpdateCustomFrameworkResponse&gt;
   */
  public CompletableFuture<UpdateCustomFrameworkResponse> updateCustomFrameworkAsync(
      String handle, String version, UpdateCustomFrameworkRequest body) {
    return updateCustomFrameworkWithHttpInfoAsync(handle, version, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update a custom framework.
   *
   * @param handle The framework handle (required)
   * @param version The framework version (required)
   * @param body (required)
   * @return ApiResponse&lt;UpdateCustomFrameworkResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *       <tr><td> 500 </td><td> Bad Request </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<UpdateCustomFrameworkResponse> updateCustomFrameworkWithHttpInfo(
      String handle, String version, UpdateCustomFrameworkRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'handle' is set
    if (handle == null) {
      throw new ApiException(
          400, "Missing the required parameter 'handle' when calling updateCustomFramework");
    }

    // verify the required parameter 'version' is set
    if (version == null) {
      throw new ApiException(
          400, "Missing the required parameter 'version' when calling updateCustomFramework");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateCustomFramework");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cloud_security_management/custom_frameworks/{handle}/{version}"
            .replaceAll("\\{" + "handle" + "\\}", apiClient.escapeString(handle.toString()))
            .replaceAll("\\{" + "version" + "\\}", apiClient.escapeString(version.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SecurityMonitoringApi.updateCustomFramework",
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
        new GenericType<UpdateCustomFrameworkResponse>() {});
  }

  /**
   * Update a custom framework.
   *
   * <p>See {@link #updateCustomFrameworkWithHttpInfo}.
   *
   * @param handle The framework handle (required)
   * @param version The framework version (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;UpdateCustomFrameworkResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<UpdateCustomFrameworkResponse>>
      updateCustomFrameworkWithHttpInfoAsync(
          String handle, String version, UpdateCustomFrameworkRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'handle' is set
    if (handle == null) {
      CompletableFuture<ApiResponse<UpdateCustomFrameworkResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'handle' when calling updateCustomFramework"));
      return result;
    }

    // verify the required parameter 'version' is set
    if (version == null) {
      CompletableFuture<ApiResponse<UpdateCustomFrameworkResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'version' when calling updateCustomFramework"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<UpdateCustomFrameworkResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateCustomFramework"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cloud_security_management/custom_frameworks/{handle}/{version}"
            .replaceAll("\\{" + "handle" + "\\}", apiClient.escapeString(handle.toString()))
            .replaceAll("\\{" + "version" + "\\}", apiClient.escapeString(version.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SecurityMonitoringApi.updateCustomFramework",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<UpdateCustomFrameworkResponse>> result =
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
        new GenericType<UpdateCustomFrameworkResponse>() {});
  }

  /**
   * Update resource filters.
   *
   * <p>See {@link #updateResourceEvaluationFiltersWithHttpInfo}.
   *
   * @param body (required)
   * @return UpdateResourceEvaluationFiltersResponse
   * @throws ApiException if fails to make API call
   */
  public UpdateResourceEvaluationFiltersResponse updateResourceEvaluationFilters(
      UpdateResourceEvaluationFiltersRequest body) throws ApiException {
    return updateResourceEvaluationFiltersWithHttpInfo(body).getData();
  }

  /**
   * Update resource filters.
   *
   * <p>See {@link #updateResourceEvaluationFiltersWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;UpdateResourceEvaluationFiltersResponse&gt;
   */
  public CompletableFuture<UpdateResourceEvaluationFiltersResponse>
      updateResourceEvaluationFiltersAsync(UpdateResourceEvaluationFiltersRequest body) {
    return updateResourceEvaluationFiltersWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update resource filters.
   *
   * @param body (required)
   * @return ApiResponse&lt;UpdateResourceEvaluationFiltersResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<UpdateResourceEvaluationFiltersResponse>
      updateResourceEvaluationFiltersWithHttpInfo(UpdateResourceEvaluationFiltersRequest body)
          throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'body' when calling updateResourceEvaluationFilters");
    }
    // create path and map variables
    String localVarPath = "/api/v2/cloud_security_management/resource_filters";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SecurityMonitoringApi.updateResourceEvaluationFilters",
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
        new GenericType<UpdateResourceEvaluationFiltersResponse>() {});
  }

  /**
   * Update resource filters.
   *
   * <p>See {@link #updateResourceEvaluationFiltersWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;UpdateResourceEvaluationFiltersResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<UpdateResourceEvaluationFiltersResponse>>
      updateResourceEvaluationFiltersWithHttpInfoAsync(
          UpdateResourceEvaluationFiltersRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<UpdateResourceEvaluationFiltersResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " updateResourceEvaluationFilters"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/cloud_security_management/resource_filters";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SecurityMonitoringApi.updateResourceEvaluationFilters",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<UpdateResourceEvaluationFiltersResponse>> result =
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
        new GenericType<UpdateResourceEvaluationFiltersResponse>() {});
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
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
