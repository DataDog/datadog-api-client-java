package com.datadog.api.v2.client.api;

import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.ApiResponse;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.Pair;
import com.datadog.api.v2.client.model.UsageObservabilityPipelinesResponse;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.core.GenericType;

@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UsageMeteringApi {
  private ApiClient apiClient;

  public UsageMeteringApi() {
    this(Configuration.getDefaultApiClient());
  }

  public UsageMeteringApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get the API client
   *
   * @return API client
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * Set the API client
   *
   * @param apiClient an instance of API client
   */
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /** Manage optional parameters to getUsageObservabilityPipelines. */
  public static class GetUsageObservabilityPipelinesOptionalParameters {
    private OffsetDateTime endHr;

    /**
     * Set endHr
     *
     * @param endHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
     *     for usage ending **before** this hour. (optional)
     * @return GetUsageObservabilityPipelinesOptionalParameters
     */
    public GetUsageObservabilityPipelinesOptionalParameters endHr(OffsetDateTime endHr) {
      this.endHr = endHr;
      return this;
    }
  }

  /**
   * Get hourly usage for Observability Pipelines
   *
   * <p>See {@link #getUsageObservabilityPipelinesWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @return UsageObservabilityPipelinesResponse
   * @throws ApiException if fails to make API call
   */
  public UsageObservabilityPipelinesResponse getUsageObservabilityPipelines(OffsetDateTime startHr)
      throws ApiException {
    return getUsageObservabilityPipelinesWithHttpInfo(
            startHr, new GetUsageObservabilityPipelinesOptionalParameters())
        .getData();
  }

  /**
   * Get hourly usage for Observability Pipelines
   *
   * <p>See {@link #getUsageObservabilityPipelinesWithHttpInfoAsync}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @return CompletableFuture&lt;UsageObservabilityPipelinesResponse&gt;
   */
  public CompletableFuture<UsageObservabilityPipelinesResponse> getUsageObservabilityPipelinesAsync(
      OffsetDateTime startHr) {
    return getUsageObservabilityPipelinesWithHttpInfoAsync(
            startHr, new GetUsageObservabilityPipelinesOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get hourly usage for Observability Pipelines
   *
   * <p>See {@link #getUsageObservabilityPipelinesWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return UsageObservabilityPipelinesResponse
   * @throws ApiException if fails to make API call
   */
  public UsageObservabilityPipelinesResponse getUsageObservabilityPipelines(
      OffsetDateTime startHr, GetUsageObservabilityPipelinesOptionalParameters parameters)
      throws ApiException {
    return getUsageObservabilityPipelinesWithHttpInfo(startHr, parameters).getData();
  }

  /**
   * Get hourly usage for Observability Pipelines
   *
   * <p>See {@link #getUsageObservabilityPipelinesWithHttpInfoAsync}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;UsageObservabilityPipelinesResponse&gt;
   */
  public CompletableFuture<UsageObservabilityPipelinesResponse> getUsageObservabilityPipelinesAsync(
      OffsetDateTime startHr, GetUsageObservabilityPipelinesOptionalParameters parameters) {
    return getUsageObservabilityPipelinesWithHttpInfoAsync(startHr, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get hourly usage for Observability Pipelines
   *
   * <p>Get hourly usage for Observability Pipelines.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;UsageObservabilityPipelinesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<UsageObservabilityPipelinesResponse>
      getUsageObservabilityPipelinesWithHttpInfo(
          OffsetDateTime startHr, GetUsageObservabilityPipelinesOptionalParameters parameters)
          throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'startHr' when calling getUsageObservabilityPipelines");
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v2/usage/observability_pipelines";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "UsageMeteringApi.getUsageObservabilityPipelines",
            localVarPath,
            localVarQueryParams,
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json;datetime-format=rfc3339"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<UsageObservabilityPipelinesResponse>() {});
  }

  /**
   * Get hourly usage for Observability Pipelines
   *
   * <p>See {@link #getUsageObservabilityPipelinesWithHttpInfo}.
   *
   * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60;
   *     for usage beginning at this hour. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;UsageObservabilityPipelinesResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<UsageObservabilityPipelinesResponse>>
      getUsageObservabilityPipelinesWithHttpInfoAsync(
          OffsetDateTime startHr, GetUsageObservabilityPipelinesOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      CompletableFuture<ApiResponse<UsageObservabilityPipelinesResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'startHr' when calling"
                  + " getUsageObservabilityPipelines"));
      return result;
    }
    OffsetDateTime endHr = parameters.endHr;
    // create path and map variables
    String localVarPath = "/api/v2/usage/observability_pipelines";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "UsageMeteringApi.getUsageObservabilityPipelines",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json;datetime-format=rfc3339"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<UsageObservabilityPipelinesResponse>> result =
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
        new GenericType<UsageObservabilityPipelinesResponse>() {});
  }
}
