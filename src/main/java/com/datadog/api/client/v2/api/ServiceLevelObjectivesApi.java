package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.SLOReportPostResponse;
import com.datadog.api.client.v2.model.SLOReportStatusGetResponse;
import com.datadog.api.client.v2.model.SloReportCreateRequest;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ServiceLevelObjectivesApi {
  private ApiClient apiClient;

  public ServiceLevelObjectivesApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public ServiceLevelObjectivesApi(ApiClient apiClient) {
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
   * Create a new SLO report.
   *
   * <p>See {@link #createSLOReportJobWithHttpInfo}.
   *
   * @param body Create SLO report job request body. (required)
   * @return SLOReportPostResponse
   * @throws ApiException if fails to make API call
   */
  public SLOReportPostResponse createSLOReportJob(SloReportCreateRequest body) throws ApiException {
    return createSLOReportJobWithHttpInfo(body).getData();
  }

  /**
   * Create a new SLO report.
   *
   * <p>See {@link #createSLOReportJobWithHttpInfoAsync}.
   *
   * @param body Create SLO report job request body. (required)
   * @return CompletableFuture&lt;SLOReportPostResponse&gt;
   */
  public CompletableFuture<SLOReportPostResponse> createSLOReportJobAsync(
      SloReportCreateRequest body) {
    return createSLOReportJobWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a job to generate an SLO report. The report job is processed asynchronously and
   * eventually results in a CSV report being available for download.
   *
   * <p>Check the status of the job and download the CSV report using the returned <code>report_id
   * </code>.
   *
   * @param body Create SLO report job request body. (required)
   * @return ApiResponse&lt;SLOReportPostResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SLOReportPostResponse> createSLOReportJobWithHttpInfo(
      SloReportCreateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createSLOReportJob";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createSLOReportJob");
    }
    // create path and map variables
    String localVarPath = "/api/v2/slo/report";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ServiceLevelObjectivesApi.createSLOReportJob",
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
        new GenericType<SLOReportPostResponse>() {});
  }

  /**
   * Create a new SLO report.
   *
   * <p>See {@link #createSLOReportJobWithHttpInfo}.
   *
   * @param body Create SLO report job request body. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SLOReportPostResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SLOReportPostResponse>> createSLOReportJobWithHttpInfoAsync(
      SloReportCreateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createSLOReportJob";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<SLOReportPostResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<SLOReportPostResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createSLOReportJob"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/slo/report";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ServiceLevelObjectivesApi.createSLOReportJob",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SLOReportPostResponse>> result = new CompletableFuture<>();
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
        new GenericType<SLOReportPostResponse>() {});
  }

  /**
   * Get SLO report.
   *
   * <p>See {@link #getSLOReportWithHttpInfo}.
   *
   * @param reportId The ID of the report job. (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String getSLOReport(String reportId) throws ApiException {
    return getSLOReportWithHttpInfo(reportId).getData();
  }

  /**
   * Get SLO report.
   *
   * <p>See {@link #getSLOReportWithHttpInfoAsync}.
   *
   * @param reportId The ID of the report job. (required)
   * @return CompletableFuture&lt;String&gt;
   */
  public CompletableFuture<String> getSLOReportAsync(String reportId) {
    return getSLOReportWithHttpInfoAsync(reportId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Download an SLO report. This can only be performed after the report job has completed.
   *
   * <p>Reports are not guaranteed to exist indefinitely. Datadog recommends that you download the
   * report as soon as it is available.
   *
   * @param reportId The ID of the report job. (required)
   * @return ApiResponse&lt;String&gt;
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
  public ApiResponse<String> getSLOReportWithHttpInfo(String reportId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getSLOReport";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'reportId' is set
    if (reportId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'reportId' when calling getSLOReport");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/slo/report/{report_id}/download"
            .replaceAll("\\{" + "report_id" + "\\}", apiClient.escapeString(reportId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ServiceLevelObjectivesApi.getSLOReport",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"text/csv", "application/json"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<String>() {});
  }

  /**
   * Get SLO report.
   *
   * <p>See {@link #getSLOReportWithHttpInfo}.
   *
   * @param reportId The ID of the report job. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;String&gt;&gt;
   */
  public CompletableFuture<ApiResponse<String>> getSLOReportWithHttpInfoAsync(String reportId) {
    // Check if unstable operation is enabled
    String operationId = "getSLOReport";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<String>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'reportId' is set
    if (reportId == null) {
      CompletableFuture<ApiResponse<String>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'reportId' when calling getSLOReport"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/slo/report/{report_id}/download"
            .replaceAll("\\{" + "report_id" + "\\}", apiClient.escapeString(reportId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ServiceLevelObjectivesApi.getSLOReport",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"text/csv", "application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<String>> result = new CompletableFuture<>();
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
        new GenericType<String>() {});
  }

  /**
   * Get SLO report status.
   *
   * <p>See {@link #getSLOReportJobStatusWithHttpInfo}.
   *
   * @param reportId The ID of the report job. (required)
   * @return SLOReportStatusGetResponse
   * @throws ApiException if fails to make API call
   */
  public SLOReportStatusGetResponse getSLOReportJobStatus(String reportId) throws ApiException {
    return getSLOReportJobStatusWithHttpInfo(reportId).getData();
  }

  /**
   * Get SLO report status.
   *
   * <p>See {@link #getSLOReportJobStatusWithHttpInfoAsync}.
   *
   * @param reportId The ID of the report job. (required)
   * @return CompletableFuture&lt;SLOReportStatusGetResponse&gt;
   */
  public CompletableFuture<SLOReportStatusGetResponse> getSLOReportJobStatusAsync(String reportId) {
    return getSLOReportJobStatusWithHttpInfoAsync(reportId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the status of the SLO report job.
   *
   * @param reportId The ID of the report job. (required)
   * @return ApiResponse&lt;SLOReportStatusGetResponse&gt;
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
  public ApiResponse<SLOReportStatusGetResponse> getSLOReportJobStatusWithHttpInfo(String reportId)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getSLOReportJobStatus";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'reportId' is set
    if (reportId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'reportId' when calling getSLOReportJobStatus");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/slo/report/{report_id}/status"
            .replaceAll("\\{" + "report_id" + "\\}", apiClient.escapeString(reportId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ServiceLevelObjectivesApi.getSLOReportJobStatus",
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
        new GenericType<SLOReportStatusGetResponse>() {});
  }

  /**
   * Get SLO report status.
   *
   * <p>See {@link #getSLOReportJobStatusWithHttpInfo}.
   *
   * @param reportId The ID of the report job. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SLOReportStatusGetResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SLOReportStatusGetResponse>>
      getSLOReportJobStatusWithHttpInfoAsync(String reportId) {
    // Check if unstable operation is enabled
    String operationId = "getSLOReportJobStatus";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<SLOReportStatusGetResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'reportId' is set
    if (reportId == null) {
      CompletableFuture<ApiResponse<SLOReportStatusGetResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'reportId' when calling getSLOReportJobStatus"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/slo/report/{report_id}/status"
            .replaceAll("\\{" + "report_id" + "\\}", apiClient.escapeString(reportId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ServiceLevelObjectivesApi.getSLOReportJobStatus",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SLOReportStatusGetResponse>> result = new CompletableFuture<>();
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
        new GenericType<SLOReportStatusGetResponse>() {});
  }
}
