package com.datadog.api.v1.client.api;

import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.ApiResponse;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.Pair;
import com.datadog.api.v1.client.model.CheckCanDeleteSLOResponse;
import com.datadog.api.v1.client.model.SLOBulkDeleteResponse;
import com.datadog.api.v1.client.model.SLODeleteResponse;
import com.datadog.api.v1.client.model.SLOHistoryResponse;
import com.datadog.api.v1.client.model.SLOListResponse;
import com.datadog.api.v1.client.model.SLOResponse;
import com.datadog.api.v1.client.model.SLOTimeframe;
import com.datadog.api.v1.client.model.ServiceLevelObjective;
import com.datadog.api.v1.client.model.ServiceLevelObjectiveRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ServiceLevelObjectivesApi {
  private ApiClient apiClient;

  public ServiceLevelObjectivesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ServiceLevelObjectivesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get the API cilent
   *
   * @return API client
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * Set the API cilent
   *
   * @param apiClient an instance of API client
   */
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Check if SLOs can be safely deleted Check if an SLO can be safely deleted. For example, assure
   * an SLO can be deleted without disrupting a dashboard.
   *
   * @param ids A comma separated list of the IDs of the service level objectives objects.
   *     (required)
   * @return CheckCanDeleteSLOResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *     </table>
   */
  public CheckCanDeleteSLOResponse checkCanDeleteSLO(String ids) throws ApiException {
    return checkCanDeleteSLOWithHttpInfo(ids).getData();
  }

  /**
   * Check if SLOs can be safely deleted Check if an SLO can be safely deleted. For example, assure
   * an SLO can be deleted without disrupting a dashboard.
   *
   * @param ids A comma separated list of the IDs of the service level objectives objects.
   *     (required)
   * @return ApiResponse&lt;CheckCanDeleteSLOResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CheckCanDeleteSLOResponse> checkCanDeleteSLOWithHttpInfo(String ids)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(
          400, "Missing the required parameter 'ids' when calling checkCanDeleteSLO");
    }
    // create path and map variables
    String localVarPath = "/api/v1/slo/can_delete";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ids", ids));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "checkCanDeleteSLO");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<CheckCanDeleteSLOResponse> localVarReturnType =
        new GenericType<CheckCanDeleteSLOResponse>() {};

    return apiClient.invokeAPI(
        "ServiceLevelObjectivesApi.checkCanDeleteSLO",
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false);
  }

  /**
   * Create an SLO object Create a service level objective object.
   *
   * @param body Service level objective request object. (required)
   * @return SLOListResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *     </table>
   */
  public SLOListResponse createSLO(ServiceLevelObjectiveRequest body) throws ApiException {
    return createSLOWithHttpInfo(body).getData();
  }

  /**
   * Create an SLO object Create a service level objective object.
   *
   * @param body Service level objective request object. (required)
   * @return ApiResponse&lt;SLOListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SLOListResponse> createSLOWithHttpInfo(ServiceLevelObjectiveRequest body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createSLO");
    }
    // create path and map variables
    String localVarPath = "/api/v1/slo";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "createSLO");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<SLOListResponse> localVarReturnType = new GenericType<SLOListResponse>() {};

    return apiClient.invokeAPI(
        "ServiceLevelObjectivesApi.createSLO",
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false);
  }

  /** Manage optional parameters to deleteSLO. */
  public static class DeleteSLOOptionalParameters {
    private String force;

    /**
     * Set force
     *
     * @param force Delete the monitor even if it&#39;s referenced by other resources (e.g. SLO,
     *     composite monitor). (optional)
     * @return DeleteSLOOptionalParameters
     */
    public DeleteSLOOptionalParameters force(String force) {
      this.force = force;
      return this;
    }
  }

  /**
   * Delete an SLO Permanently delete the specified service level objective object. If an SLO is
   * used in a dashboard, the &#x60;DELETE /v1/slo/&#x60; endpoint returns a 409 conflict error
   * because the SLO is referenced in a dashboard.
   *
   * @param sloId The ID of the service level objective. (required)
   * @return SLODeleteResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *     </table>
   */
  public SLODeleteResponse deleteSLO(String sloId) throws ApiException {
    return deleteSLOWithHttpInfo(sloId, new DeleteSLOOptionalParameters()).getData();
  }

  /**
   * Delete an SLO Permanently delete the specified service level objective object. If an SLO is
   * used in a dashboard, the &#x60;DELETE /v1/slo/&#x60; endpoint returns a 409 conflict error
   * because the SLO is referenced in a dashboard.
   *
   * @param sloId The ID of the service level objective. (required)
   * @param parameters Optional parameters for the request.
   * @return SLODeleteResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *     </table>
   */
  public SLODeleteResponse deleteSLO(String sloId, DeleteSLOOptionalParameters parameters)
      throws ApiException {
    return deleteSLOWithHttpInfo(sloId, parameters).getData();
  }

  /**
   * Delete an SLO Permanently delete the specified service level objective object. If an SLO is
   * used in a dashboard, the &#x60;DELETE /v1/slo/&#x60; endpoint returns a 409 conflict error
   * because the SLO is referenced in a dashboard.
   *
   * @param sloId The ID of the service level objective. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;SLODeleteResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SLODeleteResponse> deleteSLOWithHttpInfo(
      String sloId, DeleteSLOOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'sloId' is set
    if (sloId == null) {
      throw new ApiException(400, "Missing the required parameter 'sloId' when calling deleteSLO");
    }
    String force = parameters.force;
    // create path and map variables
    String localVarPath =
        "/api/v1/slo/{slo_id}"
            .replaceAll("\\{" + "slo_id" + "\\}", apiClient.escapeString(sloId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "force", force));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "deleteSLO");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<SLODeleteResponse> localVarReturnType = new GenericType<SLODeleteResponse>() {};

    return apiClient.invokeAPI(
        "ServiceLevelObjectivesApi.deleteSLO",
        localVarPath,
        "DELETE",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false);
  }

  /**
   * Bulk Delete SLO Timeframes Delete (or partially delete) multiple service level objective
   * objects. This endpoint facilitates deletion of one or more thresholds for one or more service
   * level objective objects. If all thresholds are deleted, the service level objective object is
   * deleted as well.
   *
   * @param body Delete multiple service level objective objects request body. (required)
   * @return SLOBulkDeleteResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *     </table>
   */
  public SLOBulkDeleteResponse deleteSLOTimeframeInBulk(Map<String, List<SLOTimeframe>> body)
      throws ApiException {
    return deleteSLOTimeframeInBulkWithHttpInfo(body).getData();
  }

  /**
   * Bulk Delete SLO Timeframes Delete (or partially delete) multiple service level objective
   * objects. This endpoint facilitates deletion of one or more thresholds for one or more service
   * level objective objects. If all thresholds are deleted, the service level objective object is
   * deleted as well.
   *
   * @param body Delete multiple service level objective objects request body. (required)
   * @return ApiResponse&lt;SLOBulkDeleteResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SLOBulkDeleteResponse> deleteSLOTimeframeInBulkWithHttpInfo(
      Map<String, List<SLOTimeframe>> body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling deleteSLOTimeframeInBulk");
    }
    // create path and map variables
    String localVarPath = "/api/v1/slo/bulk_delete";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "deleteSLOTimeframeInBulk");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<SLOBulkDeleteResponse> localVarReturnType =
        new GenericType<SLOBulkDeleteResponse>() {};

    return apiClient.invokeAPI(
        "ServiceLevelObjectivesApi.deleteSLOTimeframeInBulk",
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false);
  }

  /** Manage optional parameters to getSLO. */
  public static class GetSLOOptionalParameters {
    private Boolean withConfiguredAlertIds;

    /**
     * Set withConfiguredAlertIds
     *
     * @param withConfiguredAlertIds Get the IDs of SLO monitors that reference this SLO. (optional)
     * @return GetSLOOptionalParameters
     */
    public GetSLOOptionalParameters withConfiguredAlertIds(Boolean withConfiguredAlertIds) {
      this.withConfiguredAlertIds = withConfiguredAlertIds;
      return this;
    }
  }

  /**
   * Get an SLO&#39;s details Get a service level objective object.
   *
   * @param sloId The ID of the service level objective object. (required)
   * @return SLOResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
   *     </table>
   */
  public SLOResponse getSLO(String sloId) throws ApiException {
    return getSLOWithHttpInfo(sloId, new GetSLOOptionalParameters()).getData();
  }

  /**
   * Get an SLO&#39;s details Get a service level objective object.
   *
   * @param sloId The ID of the service level objective object. (required)
   * @param parameters Optional parameters for the request.
   * @return SLOResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
   *     </table>
   */
  public SLOResponse getSLO(String sloId, GetSLOOptionalParameters parameters) throws ApiException {
    return getSLOWithHttpInfo(sloId, parameters).getData();
  }

  /**
   * Get an SLO&#39;s details Get a service level objective object.
   *
   * @param sloId The ID of the service level objective object. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;SLOResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SLOResponse> getSLOWithHttpInfo(
      String sloId, GetSLOOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'sloId' is set
    if (sloId == null) {
      throw new ApiException(400, "Missing the required parameter 'sloId' when calling getSLO");
    }
    Boolean withConfiguredAlertIds = parameters.withConfiguredAlertIds;
    // create path and map variables
    String localVarPath =
        "/api/v1/slo/{slo_id}"
            .replaceAll("\\{" + "slo_id" + "\\}", apiClient.escapeString(sloId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "with_configured_alert_ids", withConfiguredAlertIds));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getSLO");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<SLOResponse> localVarReturnType = new GenericType<SLOResponse>() {};

    return apiClient.invokeAPI(
        "ServiceLevelObjectivesApi.getSLO",
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false);
  }

  /** Manage optional parameters to getSLOHistory. */
  public static class GetSLOHistoryOptionalParameters {
    private Double target;

    /**
     * Set target
     *
     * @param target The SLO target. If &#x60;target&#x60; is passed in, the response will include
     *     the remaining error budget and a timeframe value of &#x60;custom&#x60;. (optional)
     * @return GetSLOHistoryOptionalParameters
     */
    public GetSLOHistoryOptionalParameters target(Double target) {
      this.target = target;
      return this;
    }
  }

  /**
   * Get an SLO&#39;s history Get a specific SLO’s history, regardless of its SLO type. The detailed
   * history data is structured according to the source data type. For example, metric data is
   * included for event SLOs that use the metric source, and monitor SLO types include the monitor
   * transition history. **Note:** There are different response formats for event based and time
   * based SLOs. Examples of both are shown.
   *
   * @param sloId The ID of the service level objective object. (required)
   * @param fromTs The &#x60;from&#x60; timestamp for the query window in epoch seconds. (required)
   * @param toTs The &#x60;to&#x60; timestamp for the query window in epoch seconds. (required)
   * @return SLOHistoryResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *     </table>
   */
  public SLOHistoryResponse getSLOHistory(String sloId, Long fromTs, Long toTs)
      throws ApiException {
    return getSLOHistoryWithHttpInfo(sloId, fromTs, toTs, new GetSLOHistoryOptionalParameters())
        .getData();
  }

  /**
   * Get an SLO&#39;s history Get a specific SLO’s history, regardless of its SLO type. The detailed
   * history data is structured according to the source data type. For example, metric data is
   * included for event SLOs that use the metric source, and monitor SLO types include the monitor
   * transition history. **Note:** There are different response formats for event based and time
   * based SLOs. Examples of both are shown.
   *
   * @param sloId The ID of the service level objective object. (required)
   * @param fromTs The &#x60;from&#x60; timestamp for the query window in epoch seconds. (required)
   * @param toTs The &#x60;to&#x60; timestamp for the query window in epoch seconds. (required)
   * @param parameters Optional parameters for the request.
   * @return SLOHistoryResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *     </table>
   */
  public SLOHistoryResponse getSLOHistory(
      String sloId, Long fromTs, Long toTs, GetSLOHistoryOptionalParameters parameters)
      throws ApiException {
    return getSLOHistoryWithHttpInfo(sloId, fromTs, toTs, parameters).getData();
  }

  /**
   * Get an SLO&#39;s history Get a specific SLO’s history, regardless of its SLO type. The detailed
   * history data is structured according to the source data type. For example, metric data is
   * included for event SLOs that use the metric source, and monitor SLO types include the monitor
   * transition history. **Note:** There are different response formats for event based and time
   * based SLOs. Examples of both are shown.
   *
   * @param sloId The ID of the service level objective object. (required)
   * @param fromTs The &#x60;from&#x60; timestamp for the query window in epoch seconds. (required)
   * @param toTs The &#x60;to&#x60; timestamp for the query window in epoch seconds. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;SLOHistoryResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SLOHistoryResponse> getSLOHistoryWithHttpInfo(
      String sloId, Long fromTs, Long toTs, GetSLOHistoryOptionalParameters parameters)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'sloId' is set
    if (sloId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'sloId' when calling getSLOHistory");
    }

    // verify the required parameter 'fromTs' is set
    if (fromTs == null) {
      throw new ApiException(
          400, "Missing the required parameter 'fromTs' when calling getSLOHistory");
    }

    // verify the required parameter 'toTs' is set
    if (toTs == null) {
      throw new ApiException(
          400, "Missing the required parameter 'toTs' when calling getSLOHistory");
    }
    Double target = parameters.target;
    // create path and map variables
    String localVarPath =
        "/api/v1/slo/{slo_id}/history"
            .replaceAll("\\{" + "slo_id" + "\\}", apiClient.escapeString(sloId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "from_ts", fromTs));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "to_ts", toTs));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "target", target));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getSLOHistory");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<SLOHistoryResponse> localVarReturnType = new GenericType<SLOHistoryResponse>() {};

    return apiClient.invokeAPI(
        "ServiceLevelObjectivesApi.getSLOHistory",
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false);
  }

  /** Manage optional parameters to listSLOs. */
  public static class ListSLOsOptionalParameters {
    private String ids;
    private String query;
    private String tagsQuery;
    private String metricsQuery;
    private Long limit;
    private Long offset;

    /**
     * Set ids
     *
     * @param ids A comma separated list of the IDs of the service level objectives objects.
     *     (optional)
     * @return ListSLOsOptionalParameters
     */
    public ListSLOsOptionalParameters ids(String ids) {
      this.ids = ids;
      return this;
    }

    /**
     * Set query
     *
     * @param query The query string to filter results based on SLO names. (optional)
     * @return ListSLOsOptionalParameters
     */
    public ListSLOsOptionalParameters query(String query) {
      this.query = query;
      return this;
    }

    /**
     * Set tagsQuery
     *
     * @param tagsQuery The query string to filter results based on a single SLO tag. (optional)
     * @return ListSLOsOptionalParameters
     */
    public ListSLOsOptionalParameters tagsQuery(String tagsQuery) {
      this.tagsQuery = tagsQuery;
      return this;
    }

    /**
     * Set metricsQuery
     *
     * @param metricsQuery The query string to filter results based on SLO numerator and
     *     denominator. (optional)
     * @return ListSLOsOptionalParameters
     */
    public ListSLOsOptionalParameters metricsQuery(String metricsQuery) {
      this.metricsQuery = metricsQuery;
      return this;
    }

    /**
     * Set limit
     *
     * @param limit The number of SLOs to return in the response. (optional)
     * @return ListSLOsOptionalParameters
     */
    public ListSLOsOptionalParameters limit(Long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set offset
     *
     * @param offset The specific offset to use as the beginning of the returned response.
     *     (optional)
     * @return ListSLOsOptionalParameters
     */
    public ListSLOsOptionalParameters offset(Long offset) {
      this.offset = offset;
      return this;
    }
  }

  /**
   * Get all SLOs Get a list of service level objective objects for your organization.
   *
   * @return SLOListResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *     </table>
   */
  public SLOListResponse listSLOs() throws ApiException {
    return listSLOsWithHttpInfo(new ListSLOsOptionalParameters()).getData();
  }

  /**
   * Get all SLOs Get a list of service level objective objects for your organization.
   *
   * @param parameters Optional parameters for the request.
   * @return SLOListResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *     </table>
   */
  public SLOListResponse listSLOs(ListSLOsOptionalParameters parameters) throws ApiException {
    return listSLOsWithHttpInfo(parameters).getData();
  }

  /**
   * Get all SLOs Get a list of service level objective objects for your organization.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;SLOListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SLOListResponse> listSLOsWithHttpInfo(ListSLOsOptionalParameters parameters)
      throws ApiException {
    Object localVarPostBody = null;
    String ids = parameters.ids;
    String query = parameters.query;
    String tagsQuery = parameters.tagsQuery;
    String metricsQuery = parameters.metricsQuery;
    Long limit = parameters.limit;
    Long offset = parameters.offset;
    // create path and map variables
    String localVarPath = "/api/v1/slo";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ids", ids));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "query", query));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "tags_query", tagsQuery));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "metrics_query", metricsQuery));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listSLOs");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<SLOListResponse> localVarReturnType = new GenericType<SLOListResponse>() {};

    return apiClient.invokeAPI(
        "ServiceLevelObjectivesApi.listSLOs",
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false);
  }

  /**
   * Update an SLO Update the specified service level objective object.
   *
   * @param sloId The ID of the service level objective object. (required)
   * @param body The edited service level objective request object. (required)
   * @return SLOListResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *     </table>
   */
  public SLOListResponse updateSLO(String sloId, ServiceLevelObjective body) throws ApiException {
    return updateSLOWithHttpInfo(sloId, body).getData();
  }

  /**
   * Update an SLO Update the specified service level objective object.
   *
   * @param sloId The ID of the service level objective object. (required)
   * @param body The edited service level objective request object. (required)
   * @return ApiResponse&lt;SLOListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SLOListResponse> updateSLOWithHttpInfo(
      String sloId, ServiceLevelObjective body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'sloId' is set
    if (sloId == null) {
      throw new ApiException(400, "Missing the required parameter 'sloId' when calling updateSLO");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateSLO");
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/slo/{slo_id}"
            .replaceAll("\\{" + "slo_id" + "\\}", apiClient.escapeString(sloId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "updateSLO");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<SLOListResponse> localVarReturnType = new GenericType<SLOListResponse>() {};

    return apiClient.invokeAPI(
        "ServiceLevelObjectivesApi.updateSLO",
        localVarPath,
        "PUT",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false);
  }
}
