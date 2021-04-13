package com.datadog.api.v2.client.api;

import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.ApiResponse;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.Pair;
import com.datadog.api.v2.client.model.IncidentRelatedObject;
import com.datadog.api.v2.client.model.IncidentServiceCreateRequest;
import com.datadog.api.v2.client.model.IncidentServiceResponse;
import com.datadog.api.v2.client.model.IncidentServiceUpdateRequest;
import com.datadog.api.v2.client.model.IncidentServicesResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IncidentServicesApi {
  private ApiClient apiClient;

  public IncidentServicesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public IncidentServicesApi(ApiClient apiClient) {
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
   * Create a new incident service Creates a new incident service.
   *
   * @param body Incident Service Payload. (required)
   * @return IncidentServiceResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> CREATED </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *     </table>
   */
  public IncidentServiceResponse createIncidentService(IncidentServiceCreateRequest body)
      throws ApiException {
    return createIncidentServiceWithHttpInfo(body).getData();
  }

  /**
   * Create a new incident service Creates a new incident service.
   *
   * @param body Incident Service Payload. (required)
   * @return ApiResponse&lt;IncidentServiceResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> CREATED </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<IncidentServiceResponse> createIncidentServiceWithHttpInfo(
      IncidentServiceCreateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createIncidentService");
    }
    // create path and map variables
    String localVarPath = "/api/v2/services";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "createIncidentService");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<IncidentServiceResponse> localVarReturnType =
        new GenericType<IncidentServiceResponse>() {};

    return apiClient.invokeAPI(
        "IncidentServicesApi.createIncidentService",
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

  /**
   * Delete an existing incident service Deletes an existing incident service.
   *
   * @param serviceId The ID of the incident service. (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *     </table>
   */
  public void deleteIncidentService(String serviceId) throws ApiException {
    deleteIncidentServiceWithHttpInfo(serviceId);
  }

  /**
   * Delete an existing incident service Deletes an existing incident service.
   *
   * @param serviceId The ID of the incident service. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteIncidentServiceWithHttpInfo(String serviceId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'serviceId' is set
    if (serviceId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'serviceId' when calling deleteIncidentService");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/services/{service_id}"
            .replaceAll("\\{" + "service_id" + "\\}", apiClient.escapeString(serviceId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "deleteIncidentService");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    return apiClient.invokeAPI(
        "IncidentServicesApi.deleteIncidentService",
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
        null,
        false);
  }

  /** Manage optional parameters to getIncidentService. */
  public static class GetIncidentServiceOptionalParameters {
    private IncidentRelatedObject include;

    /**
     * Set include
     *
     * @param include Specifies which types of related objects should be included in the response.
     *     (optional)
     * @return GetIncidentServiceOptionalParameters
     */
    public GetIncidentServiceOptionalParameters include(IncidentRelatedObject include) {
      this.include = include;
      return this;
    }
  }

  /**
   * Get details of an incident service Get details of an incident service. If the
   * &#x60;include[users]&#x60; query parameter is provided, the included attribute will contain the
   * users related to these incident services.
   *
   * @param serviceId The ID of the incident service. (required)
   * @return IncidentServiceResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *     </table>
   */
  public IncidentServiceResponse getIncidentService(String serviceId) throws ApiException {
    return getIncidentServiceWithHttpInfo(serviceId, new GetIncidentServiceOptionalParameters())
        .getData();
  }

  /**
   * Get details of an incident service Get details of an incident service. If the
   * &#x60;include[users]&#x60; query parameter is provided, the included attribute will contain the
   * users related to these incident services.
   *
   * @param serviceId The ID of the incident service. (required)
   * @param parameters Optional parameters for the request.
   * @return IncidentServiceResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *     </table>
   */
  public IncidentServiceResponse getIncidentService(
      String serviceId, GetIncidentServiceOptionalParameters parameters) throws ApiException {
    return getIncidentServiceWithHttpInfo(serviceId, parameters).getData();
  }

  /**
   * Get details of an incident service Get details of an incident service. If the
   * &#x60;include[users]&#x60; query parameter is provided, the included attribute will contain the
   * users related to these incident services.
   *
   * @param serviceId The ID of the incident service. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;IncidentServiceResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<IncidentServiceResponse> getIncidentServiceWithHttpInfo(
      String serviceId, GetIncidentServiceOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'serviceId' is set
    if (serviceId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'serviceId' when calling getIncidentService");
    }
    IncidentRelatedObject include = parameters.include;
    // create path and map variables
    String localVarPath =
        "/api/v2/services/{service_id}"
            .replaceAll("\\{" + "service_id" + "\\}", apiClient.escapeString(serviceId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getIncidentService");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<IncidentServiceResponse> localVarReturnType =
        new GenericType<IncidentServiceResponse>() {};

    return apiClient.invokeAPI(
        "IncidentServicesApi.getIncidentService",
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

  /** Manage optional parameters to listIncidentServices. */
  public static class ListIncidentServicesOptionalParameters {
    private IncidentRelatedObject include;
    private Long pageSize;
    private Long pageOffset;
    private String filter;

    /**
     * Set include
     *
     * @param include Specifies which types of related objects should be included in the response.
     *     (optional)
     * @return ListIncidentServicesOptionalParameters
     */
    public ListIncidentServicesOptionalParameters include(IncidentRelatedObject include) {
      this.include = include;
      return this;
    }

    /**
     * Set pageSize
     *
     * @param pageSize Size for a given page. (optional, default to 10)
     * @return ListIncidentServicesOptionalParameters
     */
    public ListIncidentServicesOptionalParameters pageSize(Long pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set pageOffset
     *
     * @param pageOffset Specific offset to use as the beginning of the returned page. (optional,
     *     default to 0)
     * @return ListIncidentServicesOptionalParameters
     */
    public ListIncidentServicesOptionalParameters pageOffset(Long pageOffset) {
      this.pageOffset = pageOffset;
      return this;
    }

    /**
     * Set filter
     *
     * @param filter A search query that filters services by name. (optional)
     * @return ListIncidentServicesOptionalParameters
     */
    public ListIncidentServicesOptionalParameters filter(String filter) {
      this.filter = filter;
      return this;
    }
  }

  /**
   * Get a list of all incident services Get all incident services uploaded for the requesting
   * user&#39;s organization. If the &#x60;include[users]&#x60; query parameter is provided, the
   * included attribute will contain the users related to these incident services.
   *
   * @return IncidentServicesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *     </table>
   */
  public IncidentServicesResponse listIncidentServices() throws ApiException {
    return listIncidentServicesWithHttpInfo(new ListIncidentServicesOptionalParameters()).getData();
  }

  /**
   * Get a list of all incident services Get all incident services uploaded for the requesting
   * user&#39;s organization. If the &#x60;include[users]&#x60; query parameter is provided, the
   * included attribute will contain the users related to these incident services.
   *
   * @param parameters Optional parameters for the request.
   * @return IncidentServicesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *     </table>
   */
  public IncidentServicesResponse listIncidentServices(
      ListIncidentServicesOptionalParameters parameters) throws ApiException {
    return listIncidentServicesWithHttpInfo(parameters).getData();
  }

  /**
   * Get a list of all incident services Get all incident services uploaded for the requesting
   * user&#39;s organization. If the &#x60;include[users]&#x60; query parameter is provided, the
   * included attribute will contain the users related to these incident services.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;IncidentServicesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<IncidentServicesResponse> listIncidentServicesWithHttpInfo(
      ListIncidentServicesOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    IncidentRelatedObject include = parameters.include;
    Long pageSize = parameters.pageSize;
    Long pageOffset = parameters.pageOffset;
    String filter = parameters.filter;
    // create path and map variables
    String localVarPath = "/api/v2/services";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[offset]", pageOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listIncidentServices");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<IncidentServicesResponse> localVarReturnType =
        new GenericType<IncidentServicesResponse>() {};

    return apiClient.invokeAPI(
        "IncidentServicesApi.listIncidentServices",
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
   * Update an existing incident service Updates an existing incident service. Only provide the
   * attributes which should be updated as this request is a partial update.
   *
   * @param serviceId The ID of the incident service. (required)
   * @param body Incident Service Payload. (required)
   * @return IncidentServiceResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *     </table>
   */
  public IncidentServiceResponse updateIncidentService(
      String serviceId, IncidentServiceUpdateRequest body) throws ApiException {
    return updateIncidentServiceWithHttpInfo(serviceId, body).getData();
  }

  /**
   * Update an existing incident service Updates an existing incident service. Only provide the
   * attributes which should be updated as this request is a partial update.
   *
   * @param serviceId The ID of the incident service. (required)
   * @param body Incident Service Payload. (required)
   * @return ApiResponse&lt;IncidentServiceResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<IncidentServiceResponse> updateIncidentServiceWithHttpInfo(
      String serviceId, IncidentServiceUpdateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'serviceId' is set
    if (serviceId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'serviceId' when calling updateIncidentService");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateIncidentService");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/services/{service_id}"
            .replaceAll("\\{" + "service_id" + "\\}", apiClient.escapeString(serviceId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "updateIncidentService");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<IncidentServiceResponse> localVarReturnType =
        new GenericType<IncidentServiceResponse>() {};

    return apiClient.invokeAPI(
        "IncidentServicesApi.updateIncidentService",
        localVarPath,
        "PATCH",
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
