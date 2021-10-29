package com.datadog.api.v1.client.api;

import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiResponse;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.Pair;

import javax.ws.rs.core.GenericType;

import com.datadog.api.v1.client.model.APIErrorResponse;
import com.datadog.api.v1.client.model.IntakePayloadAccepted;
import com.datadog.api.v1.client.model.MetricContentEncoding;
import com.datadog.api.v1.client.model.MetricMetadata;
import com.datadog.api.v1.client.model.MetricSearchResponse;
import com.datadog.api.v1.client.model.MetricsListResponse;
import com.datadog.api.v1.client.model.MetricsPayload;
import com.datadog.api.v1.client.model.MetricsQueryResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MetricsApi {
  private ApiClient apiClient;

  public MetricsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public MetricsApi(ApiClient apiClient) {
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



  /**
   * Get metric metadata
   * Get metadata about a specific metric.
   * @param metricName Name of the metric for which to get metadata. (required)
   * @return MetricMetadata
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *     </table>
   */
  public MetricMetadata getMetricMetadata(String metricName) throws ApiException {
    return getMetricMetadataWithHttpInfo(metricName).getData();
  }

  /**
   * Get metric metadata
   * Get metadata about a specific metric.
   * @param metricName Name of the metric for which to get metadata. (required)
   * @return ApiResponse&lt;MetricMetadata&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<MetricMetadata> getMetricMetadataWithHttpInfo(String metricName) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'metricName' is set
    if (metricName == null) {
      throw new ApiException(400, "Missing the required parameter 'metricName' when calling getMetricMetadata");
    }
    // create path and map variables
    String localVarPath = "/api/v1/metrics/{metric_name}"
      .replaceAll("\\{" + "metric_name" + "\\}", apiClient.escapeString(metricName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getMetricMetadata");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "AuthZ", "apiKeyAuth", "appKeyAuth" };

    GenericType<MetricMetadata> localVarReturnType = new GenericType<MetricMetadata>() {};

    return apiClient.invokeAPI("MetricsApi.getMetricMetadata", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  /**
   * Manage optional parameters to listActiveMetrics.
   */
  public static class ListActiveMetricsOptionalParameters {
    private String host;
    private String tagFilter;


    /**
     * Set host
     * @param host Hostname for filtering the list of metrics returned. If set, metrics retrieved are those with the corresponding hostname tag. (optional)
     * @return ListActiveMetricsOptionalParameters
     */
    public ListActiveMetricsOptionalParameters host(String host) {
      this.host = host;
      return this;
    }

    /**
     * Set tagFilter
     * @param tagFilter Filter metrics that have been submitted with the given tags. Supports boolean and wildcard expressions. Cannot be combined with other filters. (optional)
     * @return ListActiveMetricsOptionalParameters
     */
    public ListActiveMetricsOptionalParameters tagFilter(String tagFilter) {
      this.tagFilter = tagFilter;
      return this;
    }
  }

  /**
   * Get active metrics list
   * Get the list of actively reporting metrics from a given time until now.
   * @param from Seconds since the Unix epoch. (required)
   * @return MetricsListResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *     </table>
   */
  public MetricsListResponse listActiveMetrics(Long from) throws ApiException {
    return listActiveMetricsWithHttpInfo(from, new ListActiveMetricsOptionalParameters()).getData();
  }

  /**
   * Get active metrics list
   * Get the list of actively reporting metrics from a given time until now.
   * @param from Seconds since the Unix epoch. (required)
   * @param parameters Optional parameters for the request.
   * @return MetricsListResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><th> Status Code </th><th> Description </th><th> Response Headers </th></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *     </table>
   */
  public MetricsListResponse listActiveMetrics(Long from, ListActiveMetricsOptionalParameters parameters) throws ApiException {
    return listActiveMetricsWithHttpInfo(from, parameters).getData();
  }

  /**
   * Get active metrics list
   * Get the list of actively reporting metrics from a given time until now.
   * @param from Seconds since the Unix epoch. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;MetricsListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<MetricsListResponse> listActiveMetricsWithHttpInfo(Long from, ListActiveMetricsOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'from' is set
    if (from == null) {
      throw new ApiException(400, "Missing the required parameter 'from' when calling listActiveMetrics");
    }
    String host = parameters.host;
    String tagFilter = parameters.tagFilter;
    // create path and map variables
    String localVarPath = "/api/v1/metrics";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "from", from));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "host", host));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "tag_filter", tagFilter));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listActiveMetrics");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "AuthZ", "apiKeyAuth", "appKeyAuth" };

    GenericType<MetricsListResponse> localVarReturnType = new GenericType<MetricsListResponse>() {};

    return apiClient.invokeAPI("MetricsApi.listActiveMetrics", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }


  /**
   * Search metrics
   * Search for metrics from the last 24 hours in Datadog.
   * @param q Query string to search metrics upon. Must be prefixed with &#x60;metrics:&#x60;. (required)
   * @return MetricSearchResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *     </table>
   */
  public MetricSearchResponse listMetrics(String q) throws ApiException {
    return listMetricsWithHttpInfo(q).getData();
  }

  /**
   * Search metrics
   * Search for metrics from the last 24 hours in Datadog.
   * @param q Query string to search metrics upon. Must be prefixed with &#x60;metrics:&#x60;. (required)
   * @return ApiResponse&lt;MetricSearchResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<MetricSearchResponse> listMetricsWithHttpInfo(String q) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'q' is set
    if (q == null) {
      throw new ApiException(400, "Missing the required parameter 'q' when calling listMetrics");
    }
    // create path and map variables
    String localVarPath = "/api/v1/search";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "q", q));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listMetrics");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "AuthZ", "apiKeyAuth", "appKeyAuth" };

    GenericType<MetricSearchResponse> localVarReturnType = new GenericType<MetricSearchResponse>() {};

    return apiClient.invokeAPI("MetricsApi.listMetrics", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }


  /**
   * Query timeseries points
   * Query timeseries points.
   * @param from Start of the queried time period, seconds since the Unix epoch. (required)
   * @param to End of the queried time period, seconds since the Unix epoch. (required)
   * @param query Query string. (required)
   * @return MetricsQueryResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *     </table>
   */
  public MetricsQueryResponse queryMetrics(Long from, Long to, String query) throws ApiException {
    return queryMetricsWithHttpInfo(from, to, query).getData();
  }

  /**
   * Query timeseries points
   * Query timeseries points.
   * @param from Start of the queried time period, seconds since the Unix epoch. (required)
   * @param to End of the queried time period, seconds since the Unix epoch. (required)
   * @param query Query string. (required)
   * @return ApiResponse&lt;MetricsQueryResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<MetricsQueryResponse> queryMetricsWithHttpInfo(Long from, Long to, String query) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'from' is set
    if (from == null) {
      throw new ApiException(400, "Missing the required parameter 'from' when calling queryMetrics");
    }

    // verify the required parameter 'to' is set
    if (to == null) {
      throw new ApiException(400, "Missing the required parameter 'to' when calling queryMetrics");
    }

    // verify the required parameter 'query' is set
    if (query == null) {
      throw new ApiException(400, "Missing the required parameter 'query' when calling queryMetrics");
    }
    // create path and map variables
    String localVarPath = "/api/v1/query";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "from", from));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "to", to));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "query", query));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "queryMetrics");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "AuthZ", "apiKeyAuth", "appKeyAuth" };

    GenericType<MetricsQueryResponse> localVarReturnType = new GenericType<MetricsQueryResponse>() {};

    return apiClient.invokeAPI("MetricsApi.queryMetrics", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  /**
   * Manage optional parameters to submitMetrics.
   */
  public static class SubmitMetricsOptionalParameters {
    private MetricContentEncoding contentEncoding;


    /**
     * Set contentEncoding
     * @param contentEncoding HTTP header used to compress the media-type. (optional)
     * @return SubmitMetricsOptionalParameters
     */
    public SubmitMetricsOptionalParameters contentEncoding(MetricContentEncoding contentEncoding) {
      this.contentEncoding = contentEncoding;
      return this;
    }
  }

  /**
   * Submit metrics
   * The metrics end-point allows you to post time-series data that can be graphed on Datadog’s dashboards. The maximum payload size is 3.2 megabytes (3200000 bytes). Compressed payloads must have a decompressed size of less than 62 megabytes (62914560 bytes).  If you’re submitting metrics directly to the Datadog API without using DogStatsD, expect:  - 64 bits for the timestamp - 32 bits for the value - 20 bytes for the metric names - 50 bytes for the timeseries - The full payload is approximately 100 bytes. However, with the DogStatsD API, compression is applied, which reduces the payload size.
   * @param body  (required)
   * @return IntakePayloadAccepted
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 202 </td><td> Payload accepted </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 408 </td><td> Request timeout </td><td>  -  </td></tr>
   *       <tr><td> 413 </td><td> Payload too large </td><td>  -  </td></tr>
   *     </table>
   */
  public IntakePayloadAccepted submitMetrics(MetricsPayload body) throws ApiException {
    return submitMetricsWithHttpInfo(body, new SubmitMetricsOptionalParameters()).getData();
  }

  /**
   * Submit metrics
   * The metrics end-point allows you to post time-series data that can be graphed on Datadog’s dashboards. The maximum payload size is 3.2 megabytes (3200000 bytes). Compressed payloads must have a decompressed size of less than 62 megabytes (62914560 bytes).  If you’re submitting metrics directly to the Datadog API without using DogStatsD, expect:  - 64 bits for the timestamp - 32 bits for the value - 20 bytes for the metric names - 50 bytes for the timeseries - The full payload is approximately 100 bytes. However, with the DogStatsD API, compression is applied, which reduces the payload size.
   * @param body  (required)
   * @param parameters Optional parameters for the request.
   * @return IntakePayloadAccepted
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><th> Status Code </th><th> Description </th><th> Response Headers </th></tr>
   *       <tr><td> 202 </td><td> Payload accepted </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 408 </td><td> Request timeout </td><td>  -  </td></tr>
   *       <tr><td> 413 </td><td> Payload too large </td><td>  -  </td></tr>
   *     </table>
   */
  public IntakePayloadAccepted submitMetrics(MetricsPayload body, SubmitMetricsOptionalParameters parameters) throws ApiException {
    return submitMetricsWithHttpInfo(body, parameters).getData();
  }

  /**
   * Submit metrics
   * The metrics end-point allows you to post time-series data that can be graphed on Datadog’s dashboards. The maximum payload size is 3.2 megabytes (3200000 bytes). Compressed payloads must have a decompressed size of less than 62 megabytes (62914560 bytes).  If you’re submitting metrics directly to the Datadog API without using DogStatsD, expect:  - 64 bits for the timestamp - 32 bits for the value - 20 bytes for the metric names - 50 bytes for the timeseries - The full payload is approximately 100 bytes. However, with the DogStatsD API, compression is applied, which reduces the payload size.
   * @param body  (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;IntakePayloadAccepted&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 202 </td><td> Payload accepted </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 408 </td><td> Request timeout </td><td>  -  </td></tr>
   *       <tr><td> 413 </td><td> Payload too large </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<IntakePayloadAccepted> submitMetricsWithHttpInfo(MetricsPayload body, SubmitMetricsOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling submitMetrics");
    }
    MetricContentEncoding contentEncoding = parameters.contentEncoding;
    // create path and map variables
    String localVarPath = "/api/v1/series";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "submitMetrics");

    if (contentEncoding != null)
      localVarHeaderParams.put("Content-Encoding", apiClient.parameterToString(contentEncoding));

    
    
    final String[] localVarAccepts = {
      "text/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "text/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth" };

    GenericType<IntakePayloadAccepted> localVarReturnType = new GenericType<IntakePayloadAccepted>() {};

    return apiClient.invokeAPI("MetricsApi.submitMetrics", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }


  /**
   * Edit metric metadata
   * Edit metadata of a specific metric. Find out more about [supported types](https://docs.datadoghq.com/developers/metrics).
   * @param metricName Name of the metric for which to edit metadata. (required)
   * @param body New metadata. (required)
   * @return MetricMetadata
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *     </table>
   */
  public MetricMetadata updateMetricMetadata(String metricName, MetricMetadata body) throws ApiException {
    return updateMetricMetadataWithHttpInfo(metricName, body).getData();
  }

  /**
   * Edit metric metadata
   * Edit metadata of a specific metric. Find out more about [supported types](https://docs.datadoghq.com/developers/metrics).
   * @param metricName Name of the metric for which to edit metadata. (required)
   * @param body New metadata. (required)
   * @return ApiResponse&lt;MetricMetadata&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<MetricMetadata> updateMetricMetadataWithHttpInfo(String metricName, MetricMetadata body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'metricName' is set
    if (metricName == null) {
      throw new ApiException(400, "Missing the required parameter 'metricName' when calling updateMetricMetadata");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateMetricMetadata");
    }
    // create path and map variables
    String localVarPath = "/api/v1/metrics/{metric_name}"
      .replaceAll("\\{" + "metric_name" + "\\}", apiClient.escapeString(metricName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "updateMetricMetadata");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<MetricMetadata> localVarReturnType = new GenericType<MetricMetadata>() {};

    return apiClient.invokeAPI("MetricsApi.updateMetricMetadata", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
