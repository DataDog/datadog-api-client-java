package com.datadog.api.v1.client.api;

import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiResponse;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.Pair;

import javax.ws.rs.core.GenericType;

import com.datadog.api.v1.client.model.APIErrorResponse;
import com.datadog.api.v1.client.model.CancelDowntimesByScopeRequest;
import com.datadog.api.v1.client.model.CanceledDowntimesIds;
import com.datadog.api.v1.client.model.Downtime;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DowntimesApi {
  private ApiClient apiClient;

  public DowntimesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DowntimesApi(ApiClient apiClient) {
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
   * Cancel a downtime
   * Cancel a downtime.
   * @param downtimeId ID of the downtime to cancel. (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Downtime not found </td><td>  -  </td></tr>
   *     </table>
   */
  public void cancelDowntime(Long downtimeId) throws ApiException {
    cancelDowntimeWithHttpInfo(downtimeId);
  }

  /**
   * Cancel a downtime
   * Cancel a downtime.
   * @param downtimeId ID of the downtime to cancel. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Downtime not found </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> cancelDowntimeWithHttpInfo(Long downtimeId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'downtimeId' is set
    if (downtimeId == null) {
      throw new ApiException(400, "Missing the required parameter 'downtimeId' when calling cancelDowntime");
    }
    // create path and map variables
    String localVarPath = "/api/v1/downtime/{downtime_id}"
      .replaceAll("\\{" + "downtime_id" + "\\}", apiClient.escapeString(downtimeId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "cancelDowntime");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "AuthZ", "apiKeyAuth", "appKeyAuth" };

    return apiClient.invokeAPI("DowntimesApi.cancelDowntime", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }


  /**
   * Cancel downtimes by scope
   * Delete all downtimes that match the scope of &#x60;X&#x60;.
   * @param body Scope to cancel downtimes for. (required)
   * @return CanceledDowntimesIds
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Downtimes not found </td><td>  -  </td></tr>
   *     </table>
   */
  public CanceledDowntimesIds cancelDowntimesByScope(CancelDowntimesByScopeRequest body) throws ApiException {
    return cancelDowntimesByScopeWithHttpInfo(body).getData();
  }

  /**
   * Cancel downtimes by scope
   * Delete all downtimes that match the scope of &#x60;X&#x60;.
   * @param body Scope to cancel downtimes for. (required)
   * @return ApiResponse&lt;CanceledDowntimesIds&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Downtimes not found </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CanceledDowntimesIds> cancelDowntimesByScopeWithHttpInfo(CancelDowntimesByScopeRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling cancelDowntimesByScope");
    }
    // create path and map variables
    String localVarPath = "/api/v1/downtime/cancel/by_scope";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "cancelDowntimesByScope");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "AuthZ", "apiKeyAuth", "appKeyAuth" };

    GenericType<CanceledDowntimesIds> localVarReturnType = new GenericType<CanceledDowntimesIds>() {};

    return apiClient.invokeAPI("DowntimesApi.cancelDowntimesByScope", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }


  /**
   * Schedule a downtime
   * Schedule a downtime.
   * @param body Schedule a downtime request body. (required)
   * @return Downtime
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *     </table>
   */
  public Downtime createDowntime(Downtime body) throws ApiException {
    return createDowntimeWithHttpInfo(body).getData();
  }

  /**
   * Schedule a downtime
   * Schedule a downtime.
   * @param body Schedule a downtime request body. (required)
   * @return ApiResponse&lt;Downtime&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Downtime> createDowntimeWithHttpInfo(Downtime body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createDowntime");
    }
    // create path and map variables
    String localVarPath = "/api/v1/downtime";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "createDowntime");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "AuthZ", "apiKeyAuth", "appKeyAuth" };

    GenericType<Downtime> localVarReturnType = new GenericType<Downtime>() {};

    return apiClient.invokeAPI("DowntimesApi.createDowntime", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }


  /**
   * Get a downtime
   * Get downtime detail by &#x60;downtime_id&#x60;.
   * @param downtimeId ID of the downtime to fetch. (required)
   * @return Downtime
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Downtime not found </td><td>  -  </td></tr>
   *     </table>
   */
  public Downtime getDowntime(Long downtimeId) throws ApiException {
    return getDowntimeWithHttpInfo(downtimeId).getData();
  }

  /**
   * Get a downtime
   * Get downtime detail by &#x60;downtime_id&#x60;.
   * @param downtimeId ID of the downtime to fetch. (required)
   * @return ApiResponse&lt;Downtime&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Downtime not found </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Downtime> getDowntimeWithHttpInfo(Long downtimeId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'downtimeId' is set
    if (downtimeId == null) {
      throw new ApiException(400, "Missing the required parameter 'downtimeId' when calling getDowntime");
    }
    // create path and map variables
    String localVarPath = "/api/v1/downtime/{downtime_id}"
      .replaceAll("\\{" + "downtime_id" + "\\}", apiClient.escapeString(downtimeId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getDowntime");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "AuthZ", "apiKeyAuth", "appKeyAuth" };

    GenericType<Downtime> localVarReturnType = new GenericType<Downtime>() {};

    return apiClient.invokeAPI("DowntimesApi.getDowntime", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  /**
   * Manage optional parameters to listDowntimes.
   */
  public static class ListDowntimesOptionalParameters {
    private Boolean currentOnly;


    /**
     * Set currentOnly
     * @param currentOnly Only return downtimes that are active when the request is made. (optional)
     * @return ListDowntimesOptionalParameters
     */
    public ListDowntimesOptionalParameters currentOnly(Boolean currentOnly) {
      this.currentOnly = currentOnly;
      return this;
    }
  }

  /**
   * Get all downtimes
   * Get all scheduled downtimes.
   * @return List&lt;Downtime&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *     </table>
   */
  public List<Downtime> listDowntimes() throws ApiException {
    return listDowntimesWithHttpInfo(new ListDowntimesOptionalParameters()).getData();
  }

  /**
   * Get all downtimes
   * Get all scheduled downtimes.
   * @param parameters Optional parameters for the request.
   * @return List&lt;Downtime&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><th> Status Code </th><th> Description </th><th> Response Headers </th></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *     </table>
   */
  public List<Downtime> listDowntimes(ListDowntimesOptionalParameters parameters) throws ApiException {
    return listDowntimesWithHttpInfo(parameters).getData();
  }

  /**
   * Get all downtimes
   * Get all scheduled downtimes.
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;List&lt;Downtime&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<List<Downtime>> listDowntimesWithHttpInfo(ListDowntimesOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
        Boolean currentOnly = parameters.currentOnly;
    // create path and map variables
    String localVarPath = "/api/v1/downtime";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "current_only", currentOnly));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listDowntimes");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "AuthZ", "apiKeyAuth", "appKeyAuth" };

    GenericType<List<Downtime>> localVarReturnType = new GenericType<List<Downtime>>() {};

    return apiClient.invokeAPI("DowntimesApi.listDowntimes", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }


  /**
   * Get all downtimes for a monitor
   * Get all downtimes for the specified monitor
   * @param monitorId The id of the monitor (required)
   * @return List&lt;Downtime&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Monitor Not Found error </td><td>  -  </td></tr>
   *     </table>
   */
  public List<Downtime> listMonitorDowntimes(Long monitorId) throws ApiException {
    return listMonitorDowntimesWithHttpInfo(monitorId).getData();
  }

  /**
   * Get all downtimes for a monitor
   * Get all downtimes for the specified monitor
   * @param monitorId The id of the monitor (required)
   * @return ApiResponse&lt;List&lt;Downtime&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Monitor Not Found error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<List<Downtime>> listMonitorDowntimesWithHttpInfo(Long monitorId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'monitorId' is set
    if (monitorId == null) {
      throw new ApiException(400, "Missing the required parameter 'monitorId' when calling listMonitorDowntimes");
    }
    // create path and map variables
    String localVarPath = "/api/v1/monitor/{monitor_id}/downtimes"
      .replaceAll("\\{" + "monitor_id" + "\\}", apiClient.escapeString(monitorId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listMonitorDowntimes");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<List<Downtime>> localVarReturnType = new GenericType<List<Downtime>>() {};

    return apiClient.invokeAPI("DowntimesApi.listMonitorDowntimes", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }


  /**
   * Update a downtime
   * Update a single downtime by &#x60;downtime_id&#x60;.
   * @param downtimeId ID of the downtime to update. (required)
   * @param body Update a downtime request body. (required)
   * @return Downtime
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Downtime not found </td><td>  -  </td></tr>
   *     </table>
   */
  public Downtime updateDowntime(Long downtimeId, Downtime body) throws ApiException {
    return updateDowntimeWithHttpInfo(downtimeId, body).getData();
  }

  /**
   * Update a downtime
   * Update a single downtime by &#x60;downtime_id&#x60;.
   * @param downtimeId ID of the downtime to update. (required)
   * @param body Update a downtime request body. (required)
   * @return ApiResponse&lt;Downtime&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Downtime not found </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Downtime> updateDowntimeWithHttpInfo(Long downtimeId, Downtime body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'downtimeId' is set
    if (downtimeId == null) {
      throw new ApiException(400, "Missing the required parameter 'downtimeId' when calling updateDowntime");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateDowntime");
    }
    // create path and map variables
    String localVarPath = "/api/v1/downtime/{downtime_id}"
      .replaceAll("\\{" + "downtime_id" + "\\}", apiClient.escapeString(downtimeId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "updateDowntime");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "AuthZ", "apiKeyAuth", "appKeyAuth" };

    GenericType<Downtime> localVarReturnType = new GenericType<Downtime>() {};

    return apiClient.invokeAPI("DowntimesApi.updateDowntime", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
