
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
import com.datadog.api.client.v2.model.SLOReportPostResponse;
import com.datadog.api.client.v2.model.SloReportCreateRequest;
import com.datadog.api.client.v2.model.SLOReportStatusGetResponse;
import com.datadog.api.client.v2.model.SloStatusResponse;


@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
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
 * See {@link #createSLOReportJobWithHttpInfo}.
 *
 * @param body Create SLO report job request body. (required)
 * @return SLOReportPostResponse
 * @throws ApiException if fails to make API call
 */
  public SLOReportPostResponse  createSLOReportJob(SloReportCreateRequest body) throws ApiException {
    return createSLOReportJobWithHttpInfo(body).getData();
  }

  /**
 * Create a new SLO report.
 *
 * See {@link #createSLOReportJobWithHttpInfoAsync}.
 *
 * @param body Create SLO report job request body. (required)
 * @return CompletableFuture&lt;SLOReportPostResponse&gt;
 */
  public CompletableFuture<SLOReportPostResponse>createSLOReportJobAsync(SloReportCreateRequest body) {
    return createSLOReportJobWithHttpInfoAsync(body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Create a job to generate an SLO report. The report job is processed asynchronously and eventually results in a CSV report being available for download.</p>
   * <p>Check the status of the job and download the CSV report using the returned <code>report_id</code>.</p>
   *
   * @param body Create SLO report job request body. (required)
   * @return ApiResponse&lt;SLOReportPostResponse&gt;
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
  public ApiResponse<SLOReportPostResponse> createSLOReportJobWithHttpInfo(SloReportCreateRequest body) throws ApiException {
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
      throw new ApiException(400, "Missing the required parameter 'body' when calling createSLOReportJob");
    }
    // create path and map variables
    String localVarPath = "/api/v2/slo/report";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.ServiceLevelObjectivesApi.createSLOReportJob", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SLOReportPostResponse>() {});
  }

  /**
   * Create a new SLO report.
   *
   * See {@link #createSLOReportJobWithHttpInfo}.
   *
   * @param body Create SLO report job request body. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SLOReportPostResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SLOReportPostResponse>> createSLOReportJobWithHttpInfoAsync(SloReportCreateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createSLOReportJob";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<SLOReportPostResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<SLOReportPostResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling createSLOReportJob"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/slo/report";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.ServiceLevelObjectivesApi.createSLOReportJob", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SLOReportPostResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SLOReportPostResponse>() {});
  }

  /**
 * Get SLO report.
 *
 * See {@link #getSLOReportWithHttpInfo}.
 *
 * @param reportId The ID of the report job. (required)
 * @return String
 * @throws ApiException if fails to make API call
 */
  public String  getSLOReport(String reportId) throws ApiException {
    return getSLOReportWithHttpInfo(reportId).getData();
  }

  /**
 * Get SLO report.
 *
 * See {@link #getSLOReportWithHttpInfoAsync}.
 *
 * @param reportId The ID of the report job. (required)
 * @return CompletableFuture&lt;String&gt;
 */
  public CompletableFuture<String>getSLOReportAsync(String reportId) {
    return getSLOReportWithHttpInfoAsync(reportId).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Download an SLO report. This can only be performed after the report job has completed.</p>
   * <p>Reports are not guaranteed to exist indefinitely. Datadog recommends that you download the report as soon as it is available.</p>
   *
   * @param reportId The ID of the report job. (required)
   * @return ApiResponse&lt;String&gt;
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
      throw new ApiException(400, "Missing the required parameter 'reportId' when calling getSLOReport");
    }
    // create path and map variables
    String localVarPath = "/api/v2/slo/report/{report_id}/download"
      .replaceAll("\\{" + "report_id" + "\\}", apiClient.escapeString(reportId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.ServiceLevelObjectivesApi.getSLOReport", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"text/csv", "application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<String>() {});
  }

  /**
   * Get SLO report.
   *
   * See {@link #getSLOReportWithHttpInfo}.
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
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'reportId' is set
    if (reportId == null) {
        CompletableFuture<ApiResponse<String>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'reportId' when calling getSLOReport"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/slo/report/{report_id}/download"
      .replaceAll("\\{" + "report_id" + "\\}", apiClient.escapeString(reportId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.ServiceLevelObjectivesApi.getSLOReport", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"text/csv", "application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<String>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<String>() {});
  }

  /**
 * Get SLO report status.
 *
 * See {@link #getSLOReportJobStatusWithHttpInfo}.
 *
 * @param reportId The ID of the report job. (required)
 * @return SLOReportStatusGetResponse
 * @throws ApiException if fails to make API call
 */
  public SLOReportStatusGetResponse  getSLOReportJobStatus(String reportId) throws ApiException {
    return getSLOReportJobStatusWithHttpInfo(reportId).getData();
  }

  /**
 * Get SLO report status.
 *
 * See {@link #getSLOReportJobStatusWithHttpInfoAsync}.
 *
 * @param reportId The ID of the report job. (required)
 * @return CompletableFuture&lt;SLOReportStatusGetResponse&gt;
 */
  public CompletableFuture<SLOReportStatusGetResponse>getSLOReportJobStatusAsync(String reportId) {
    return getSLOReportJobStatusWithHttpInfoAsync(reportId).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get the status of the SLO report job.</p>
   *
   * @param reportId The ID of the report job. (required)
   * @return ApiResponse&lt;SLOReportStatusGetResponse&gt;
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
  public ApiResponse<SLOReportStatusGetResponse> getSLOReportJobStatusWithHttpInfo(String reportId) throws ApiException {
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
      throw new ApiException(400, "Missing the required parameter 'reportId' when calling getSLOReportJobStatus");
    }
    // create path and map variables
    String localVarPath = "/api/v2/slo/report/{report_id}/status"
      .replaceAll("\\{" + "report_id" + "\\}", apiClient.escapeString(reportId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.ServiceLevelObjectivesApi.getSLOReportJobStatus", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SLOReportStatusGetResponse>() {});
  }

  /**
   * Get SLO report status.
   *
   * See {@link #getSLOReportJobStatusWithHttpInfo}.
   *
   * @param reportId The ID of the report job. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SLOReportStatusGetResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SLOReportStatusGetResponse>> getSLOReportJobStatusWithHttpInfoAsync(String reportId) {
    // Check if unstable operation is enabled
    String operationId = "getSLOReportJobStatus";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<SLOReportStatusGetResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'reportId' is set
    if (reportId == null) {
        CompletableFuture<ApiResponse<SLOReportStatusGetResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'reportId' when calling getSLOReportJobStatus"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/slo/report/{report_id}/status"
      .replaceAll("\\{" + "report_id" + "\\}", apiClient.escapeString(reportId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.ServiceLevelObjectivesApi.getSLOReportJobStatus", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SLOReportStatusGetResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SLOReportStatusGetResponse>() {});
  }

  /**
   * Manage optional parameters to getSloStatus.
   */
  public static class GetSloStatusOptionalParameters {
    private Boolean disableCorrections;

    /**
     * Set disableCorrections.
     * @param disableCorrections Whether to exclude correction windows from the SLO status calculation. Defaults to false. (optional, default to false)
     * @return GetSloStatusOptionalParameters
     */
    public GetSloStatusOptionalParameters disableCorrections(Boolean disableCorrections) {
      this.disableCorrections = disableCorrections;
      return this;
    }
  }

  /**
 * Get SLO status.
 *
 * See {@link #getSloStatusWithHttpInfo}.
 *
 * @param sloId The ID of the SLO. (required)
 * @param fromTs The starting timestamp for the SLO status query in epoch seconds. (required)
 * @param toTs The ending timestamp for the SLO status query in epoch seconds. (required)
 * @return SloStatusResponse
 * @throws ApiException if fails to make API call
 */
  public SloStatusResponse getSloStatus (String sloId, Long fromTs, Long toTs) throws ApiException {
    return getSloStatusWithHttpInfo( sloId,  fromTs,  toTs, new GetSloStatusOptionalParameters()).getData();
  }

  /**
 * Get SLO status.
 *
 * See {@link #getSloStatusWithHttpInfoAsync}.
 *
 * @param sloId The ID of the SLO. (required)
 * @param fromTs The starting timestamp for the SLO status query in epoch seconds. (required)
 * @param toTs The ending timestamp for the SLO status query in epoch seconds. (required)
 * @return CompletableFuture&lt;SloStatusResponse&gt;
 */
  public CompletableFuture<SloStatusResponse>getSloStatusAsync(String sloId, Long fromTs, Long toTs) {
    return getSloStatusWithHttpInfoAsync(sloId, fromTs, toTs, new GetSloStatusOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * Get SLO status.
 *
 * See {@link #getSloStatusWithHttpInfo}.
 *
 * @param sloId The ID of the SLO. (required)
 * @param fromTs The starting timestamp for the SLO status query in epoch seconds. (required)
 * @param toTs The ending timestamp for the SLO status query in epoch seconds. (required)
 * @param parameters Optional parameters for the request.
 * @return SloStatusResponse
 * @throws ApiException if fails to make API call
 */
  public SloStatusResponse getSloStatus(String sloId, Long fromTs, Long toTs, GetSloStatusOptionalParameters parameters) throws ApiException {
    return getSloStatusWithHttpInfo(sloId, fromTs, toTs, parameters).getData();
  }

  /**
 * Get SLO status.
 *
 * See {@link #getSloStatusWithHttpInfoAsync}.
 *
 * @param sloId The ID of the SLO. (required)
 * @param fromTs The starting timestamp for the SLO status query in epoch seconds. (required)
 * @param toTs The ending timestamp for the SLO status query in epoch seconds. (required)
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;SloStatusResponse&gt;
 */
  public CompletableFuture<SloStatusResponse>getSloStatusAsync( String sloId,  Long fromTs,  Long toTs, GetSloStatusOptionalParameters parameters) {
    return getSloStatusWithHttpInfoAsync(sloId, fromTs, toTs, parameters).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get the status of a Service Level Objective (SLO) for a given time period.</p>
   * <p>This endpoint returns the current SLI value, error budget remaining, and other status information for the specified SLO.</p>
   *
   * @param sloId The ID of the SLO. (required)
   * @param fromTs The starting timestamp for the SLO status query in epoch seconds. (required)
   * @param toTs The ending timestamp for the SLO status query in epoch seconds. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;SloStatusResponse&gt;
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
  public ApiResponse<SloStatusResponse> getSloStatusWithHttpInfo(String sloId, Long fromTs, Long toTs, GetSloStatusOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getSloStatus";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'sloId' is set
    if (sloId == null) {
      throw new ApiException(400, "Missing the required parameter 'sloId' when calling getSloStatus");
    }

    // verify the required parameter 'fromTs' is set
    if (fromTs == null) {
      throw new ApiException(400, "Missing the required parameter 'fromTs' when calling getSloStatus");
    }

    // verify the required parameter 'toTs' is set
    if (toTs == null) {
      throw new ApiException(400, "Missing the required parameter 'toTs' when calling getSloStatus");
    }
    Boolean disableCorrections = parameters.disableCorrections;
    // create path and map variables
    String localVarPath = "/api/v2/slo/{slo_id}/status"
      .replaceAll("\\{" + "slo_id" + "\\}", apiClient.escapeString(sloId.toString()));

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "from_ts", fromTs));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "to_ts", toTs));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "disable_corrections", disableCorrections));

    Invocation.Builder builder = apiClient.createBuilder("v2.ServiceLevelObjectivesApi.getSloStatus", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SloStatusResponse>() {});
  }

  /**
   * Get SLO status.
   *
   * See {@link #getSloStatusWithHttpInfo}.
   *
   * @param sloId The ID of the SLO. (required)
   * @param fromTs The starting timestamp for the SLO status query in epoch seconds. (required)
   * @param toTs The ending timestamp for the SLO status query in epoch seconds. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;SloStatusResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SloStatusResponse>> getSloStatusWithHttpInfoAsync(String sloId, Long fromTs, Long toTs, GetSloStatusOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "getSloStatus";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<SloStatusResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'sloId' is set
    if (sloId == null) {
        CompletableFuture<ApiResponse<SloStatusResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'sloId' when calling getSloStatus"));
        return result;
    }

    // verify the required parameter 'fromTs' is set
    if (fromTs == null) {
        CompletableFuture<ApiResponse<SloStatusResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'fromTs' when calling getSloStatus"));
        return result;
    }

    // verify the required parameter 'toTs' is set
    if (toTs == null) {
        CompletableFuture<ApiResponse<SloStatusResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'toTs' when calling getSloStatus"));
        return result;
    }
    Boolean disableCorrections = parameters.disableCorrections;
    // create path and map variables
    String localVarPath = "/api/v2/slo/{slo_id}/status"
      .replaceAll("\\{" + "slo_id" + "\\}", apiClient.escapeString(sloId.toString()));

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "from_ts", fromTs));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "to_ts", toTs));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "disable_corrections", disableCorrections));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.ServiceLevelObjectivesApi.getSloStatus", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SloStatusResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SloStatusResponse>() {});
  }
}