package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.TimeseriesAnomalyInvestigationRequest;
import com.datadog.api.client.v2.model.TimeseriesAnomalyInvestigationResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TimeseriesAnomalyInvestigationsApi {
  private ApiClient apiClient;

  public TimeseriesAnomalyInvestigationsApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public TimeseriesAnomalyInvestigationsApi(ApiClient apiClient) {
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
   * Investigate a timeseries anomaly.
   *
   * <p>See {@link #createTimeseriesAnomalyInvestigationWithHttpInfo}.
   *
   * @param body Metrics timeseries request to investigate. (required)
   * @return TimeseriesAnomalyInvestigationResponse
   * @throws ApiException if fails to make API call
   */
  public TimeseriesAnomalyInvestigationResponse createTimeseriesAnomalyInvestigation(
      TimeseriesAnomalyInvestigationRequest body) throws ApiException {
    return createTimeseriesAnomalyInvestigationWithHttpInfo(body).getData();
  }

  /**
   * Investigate a timeseries anomaly.
   *
   * <p>See {@link #createTimeseriesAnomalyInvestigationWithHttpInfoAsync}.
   *
   * @param body Metrics timeseries request to investigate. (required)
   * @return CompletableFuture&lt;TimeseriesAnomalyInvestigationResponse&gt;
   */
  public CompletableFuture<TimeseriesAnomalyInvestigationResponse>
      createTimeseriesAnomalyInvestigationAsync(TimeseriesAnomalyInvestigationRequest body) {
    return createTimeseriesAnomalyInvestigationWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Investigates a metrics timeseries request for its most significant anomaly and returns
   * deterministic findings. Metrics queries with or without grouping are supported. This API
   * version accepts exactly one request and returns at most one anomaly.
   *
   * @param body Metrics timeseries request to investigate. (required)
   * @return ApiResponse&lt;TimeseriesAnomalyInvestigationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<TimeseriesAnomalyInvestigationResponse>
      createTimeseriesAnomalyInvestigationWithHttpInfo(TimeseriesAnomalyInvestigationRequest body)
          throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createTimeseriesAnomalyInvestigation";
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
              + " createTimeseriesAnomalyInvestigation");
    }
    // create path and map variables
    String localVarPath = "/api/v2/timeseries-anomaly-investigations";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.TimeseriesAnomalyInvestigationsApi.createTimeseriesAnomalyInvestigation",
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
        new GenericType<TimeseriesAnomalyInvestigationResponse>() {});
  }

  /**
   * Investigate a timeseries anomaly.
   *
   * <p>See {@link #createTimeseriesAnomalyInvestigationWithHttpInfo}.
   *
   * @param body Metrics timeseries request to investigate. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;TimeseriesAnomalyInvestigationResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<TimeseriesAnomalyInvestigationResponse>>
      createTimeseriesAnomalyInvestigationWithHttpInfoAsync(
          TimeseriesAnomalyInvestigationRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createTimeseriesAnomalyInvestigation";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<TimeseriesAnomalyInvestigationResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<TimeseriesAnomalyInvestigationResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " createTimeseriesAnomalyInvestigation"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/timeseries-anomaly-investigations";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.TimeseriesAnomalyInvestigationsApi.createTimeseriesAnomalyInvestigation",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<TimeseriesAnomalyInvestigationResponse>> result =
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
        new GenericType<TimeseriesAnomalyInvestigationResponse>() {});
  }
}
