package com.datadog.api.client.v1.api;

import com.datadog.api.client.v1.ApiException;
import com.datadog.api.client.v1.ApiClient;
import com.datadog.api.client.v1.ApiResponse;
import com.datadog.api.client.v1.Configuration;
import com.datadog.api.client.v1.Pair;

import javax.ws.rs.core.GenericType;

import com.datadog.api.client.v1.model.Error400;
import com.datadog.api.client.v1.model.Error401;
import com.datadog.api.client.v1.model.Error403;
import com.datadog.api.client.v1.model.Error404;
import com.datadog.api.client.v1.model.ServiceLevelObjective;
import com.datadog.api.client.v1.model.ServiceLevelObjectiveDeleted;
import com.datadog.api.client.v1.model.ServiceLevelObjectiveResponse;
import com.datadog.api.client.v1.model.ServiceLevelObjectivesBulkDeleted;
import com.datadog.api.client.v1.model.SloTimeframe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class SloApi {
  private ApiClient apiClient;

  public SloApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SloApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Delete (or partially delete) multiple service level objective objects.
   * ### Overview Delete (or partially delete) multiple service level objective objects. This endpoint facilitates deletion of one or more thresholds for one or more service level objective objects. If all thresholds are deleted, the service level objective object is deleted as well.
   * @param requestBody Thresholds by service level objective object ID (required)
   * @return ServiceLevelObjectivesBulkDeleted
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
   */
  public ServiceLevelObjectivesBulkDeleted bulkPartialDeleteSlo(Map<String, List<SloTimeframe>> requestBody) throws ApiException {
    return bulkPartialDeleteSloWithHttpInfo(requestBody).getData();
      }

  /**
   * Delete (or partially delete) multiple service level objective objects.
   * ### Overview Delete (or partially delete) multiple service level objective objects. This endpoint facilitates deletion of one or more thresholds for one or more service level objective objects. If all thresholds are deleted, the service level objective object is deleted as well.
   * @param requestBody Thresholds by service level objective object ID (required)
   * @return ApiResponse&lt;ServiceLevelObjectivesBulkDeleted&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ServiceLevelObjectivesBulkDeleted> bulkPartialDeleteSloWithHttpInfo(Map<String, List<SloTimeframe>> requestBody) throws ApiException {
    Object localVarPostBody = requestBody;
    
    // verify the required parameter 'requestBody' is set
    if (requestBody == null) {
      throw new ApiException(400, "Missing the required parameter 'requestBody' when calling bulkPartialDeleteSlo");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/slo/bulk_delete";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<ServiceLevelObjectivesBulkDeleted> localVarReturnType = new GenericType<ServiceLevelObjectivesBulkDeleted>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Create a service level objective object.
   * ### Overview Create a service level objective object.
   * @param serviceLevelObjective Service level objective request object (required)
   * @return ServiceLevelObjectiveResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
   */
  public ServiceLevelObjectiveResponse createSlo(ServiceLevelObjective serviceLevelObjective) throws ApiException {
    return createSloWithHttpInfo(serviceLevelObjective).getData();
      }

  /**
   * Create a service level objective object.
   * ### Overview Create a service level objective object.
   * @param serviceLevelObjective Service level objective request object (required)
   * @return ApiResponse&lt;ServiceLevelObjectiveResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ServiceLevelObjectiveResponse> createSloWithHttpInfo(ServiceLevelObjective serviceLevelObjective) throws ApiException {
    Object localVarPostBody = serviceLevelObjective;
    
    // verify the required parameter 'serviceLevelObjective' is set
    if (serviceLevelObjective == null) {
      throw new ApiException(400, "Missing the required parameter 'serviceLevelObjective' when calling createSlo");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/slo";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<ServiceLevelObjectiveResponse> localVarReturnType = new GenericType<ServiceLevelObjectiveResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Delete the specified service level objective object.
   * ### Overview Delete the specified service level objective object. ### Arguments * **&#x60;slo_id&#x60;** [*required*]: The ID of the service level objective object
   * @param sloId The id of the service level objective (required)
   * @return ServiceLevelObjectiveDeleted
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
     </table>
   */
  public ServiceLevelObjectiveDeleted deleteSlo(Long sloId) throws ApiException {
    return deleteSloWithHttpInfo(sloId).getData();
      }

  /**
   * Delete the specified service level objective object.
   * ### Overview Delete the specified service level objective object. ### Arguments * **&#x60;slo_id&#x60;** [*required*]: The ID of the service level objective object
   * @param sloId The id of the service level objective (required)
   * @return ApiResponse&lt;ServiceLevelObjectiveDeleted&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ServiceLevelObjectiveDeleted> deleteSloWithHttpInfo(Long sloId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'sloId' is set
    if (sloId == null) {
      throw new ApiException(400, "Missing the required parameter 'sloId' when calling deleteSlo");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/slo/{slo_id}"
      .replaceAll("\\{" + "slo_id" + "\\}", apiClient.escapeString(sloId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<ServiceLevelObjectiveDeleted> localVarReturnType = new GenericType<ServiceLevelObjectiveDeleted>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Edit the specified service level objective
   * ### Overview Edit the specified service level objective object. ### Arguments * **&#x60;slo_id&#x60;** [*required*]: The ID of the service level objective object
   * @param sloId The ID of the service level objective object (required)
   * @param serviceLevelObjective The edited service level objective request object. (required)
   * @return ServiceLevelObjectiveResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ServiceLevelObjectiveResponse editSlo(Long sloId, ServiceLevelObjective serviceLevelObjective) throws ApiException {
    return editSloWithHttpInfo(sloId, serviceLevelObjective).getData();
      }

  /**
   * Edit the specified service level objective
   * ### Overview Edit the specified service level objective object. ### Arguments * **&#x60;slo_id&#x60;** [*required*]: The ID of the service level objective object
   * @param sloId The ID of the service level objective object (required)
   * @param serviceLevelObjective The edited service level objective request object. (required)
   * @return ApiResponse&lt;ServiceLevelObjectiveResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ServiceLevelObjectiveResponse> editSloWithHttpInfo(Long sloId, ServiceLevelObjective serviceLevelObjective) throws ApiException {
    Object localVarPostBody = serviceLevelObjective;
    
    // verify the required parameter 'sloId' is set
    if (sloId == null) {
      throw new ApiException(400, "Missing the required parameter 'sloId' when calling editSlo");
    }
    
    // verify the required parameter 'serviceLevelObjective' is set
    if (serviceLevelObjective == null) {
      throw new ApiException(400, "Missing the required parameter 'serviceLevelObjective' when calling editSlo");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/slo/{slo_id}"
      .replaceAll("\\{" + "slo_id" + "\\}", apiClient.escapeString(sloId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<ServiceLevelObjectiveResponse> localVarReturnType = new GenericType<ServiceLevelObjectiveResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get a service level objective object
   * ### Overview Get a service level objective object. ### Arguments * **&#x60;slo_id&#x60;** [*required*]: The ID of the service level objective object
   * @param sloId The ID of the service level objective object (required)
   * @return ServiceLevelObjectiveResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
     </table>
   */
  public ServiceLevelObjectiveResponse getSlo(String sloId) throws ApiException {
    return getSloWithHttpInfo(sloId).getData();
      }

  /**
   * Get a service level objective object
   * ### Overview Get a service level objective object. ### Arguments * **&#x60;slo_id&#x60;** [*required*]: The ID of the service level objective object
   * @param sloId The ID of the service level objective object (required)
   * @return ApiResponse&lt;ServiceLevelObjectiveResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ServiceLevelObjectiveResponse> getSloWithHttpInfo(String sloId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'sloId' is set
    if (sloId == null) {
      throw new ApiException(400, "Missing the required parameter 'sloId' when calling getSlo");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/slo/{slo_id}"
      .replaceAll("\\{" + "slo_id" + "\\}", apiClient.escapeString(sloId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<ServiceLevelObjectiveResponse> localVarReturnType = new GenericType<ServiceLevelObjectiveResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get multiple service level objective objects by their IDs.
   * ### Overview Get multiple service level objective objects by their IDs. ### Arguments * **&#x60;ids&#x60;** [*required*]: A comma separated list of the IDs of the service level   objectives objects (e.g. \&quot;id1,id2,id3\&quot;).
   * @param ids A comma separated list of the IDs of the service level objectives objects (e.g. \&quot;id1,id2,id3\&quot;). (required)
   * @return ServiceLevelObjectiveResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
   */
  public ServiceLevelObjectiveResponse getSlos(String ids) throws ApiException {
    return getSlosWithHttpInfo(ids).getData();
      }

  /**
   * Get multiple service level objective objects by their IDs.
   * ### Overview Get multiple service level objective objects by their IDs. ### Arguments * **&#x60;ids&#x60;** [*required*]: A comma separated list of the IDs of the service level   objectives objects (e.g. \&quot;id1,id2,id3\&quot;).
   * @param ids A comma separated list of the IDs of the service level objectives objects (e.g. \&quot;id1,id2,id3\&quot;). (required)
   * @return ApiResponse&lt;ServiceLevelObjectiveResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ServiceLevelObjectiveResponse> getSlosWithHttpInfo(String ids) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getSlos");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/slo";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ids", ids));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<ServiceLevelObjectiveResponse> localVarReturnType = new GenericType<ServiceLevelObjectiveResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
