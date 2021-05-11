package com.datadog.api.v1.client.api;

import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.ApiResponse;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.Pair;
import com.datadog.api.v1.client.model.SLOCorrectionCreateRequest;
import com.datadog.api.v1.client.model.SLOCorrectionListResponse;
import com.datadog.api.v1.client.model.SLOCorrectionResponse;
import com.datadog.api.v1.client.model.SLOCorrectionUpdateRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ServiceLevelObjectiveCorrectionsApi {
  private ApiClient apiClient;

  public ServiceLevelObjectiveCorrectionsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ServiceLevelObjectiveCorrectionsApi(ApiClient apiClient) {
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
   * Create an SLO correction Create an SLO Correction
   *
   * @param body Create an SLO Correction (required)
   * @return SLOCorrectionResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> SLO Not Found </td><td>  -  </td></tr>
   *     </table>
   */
  public SLOCorrectionResponse createSLOCorrection(SLOCorrectionCreateRequest body)
      throws ApiException {
    return createSLOCorrectionWithHttpInfo(body).getData();
  }

  /**
   * Create an SLO correction Create an SLO Correction
   *
   * @param body Create an SLO Correction (required)
   * @return ApiResponse&lt;SLOCorrectionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> SLO Not Found </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SLOCorrectionResponse> createSLOCorrectionWithHttpInfo(
      SLOCorrectionCreateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createSLOCorrection");
    }
    // create path and map variables
    String localVarPath = "/api/v1/slo/correction";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "createSLOCorrection");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<SLOCorrectionResponse> localVarReturnType =
        new GenericType<SLOCorrectionResponse>() {};

    return apiClient.invokeAPI(
        "ServiceLevelObjectiveCorrectionsApi.createSLOCorrection",
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
   * Delete an SLO correction Permanently delete the specified SLO correction object
   *
   * @param sloCorrectionId The ID of the SLO correction object (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
   *     </table>
   */
  public void deleteSLOCorrection(String sloCorrectionId) throws ApiException {
    deleteSLOCorrectionWithHttpInfo(sloCorrectionId);
  }

  /**
   * Delete an SLO correction Permanently delete the specified SLO correction object
   *
   * @param sloCorrectionId The ID of the SLO correction object (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteSLOCorrectionWithHttpInfo(String sloCorrectionId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'sloCorrectionId' is set
    if (sloCorrectionId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'sloCorrectionId' when calling deleteSLOCorrection");
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/slo/correction/{slo_correction_id}"
            .replaceAll(
                "\\{" + "slo_correction_id" + "\\}",
                apiClient.escapeString(sloCorrectionId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "deleteSLOCorrection");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    return apiClient.invokeAPI(
        "ServiceLevelObjectiveCorrectionsApi.deleteSLOCorrection",
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

  /**
   * Get an SLO correction for an SLO Get an SLO correction
   *
   * @param sloCorrectionId The ID of the SLO correction object (required)
   * @return SLOCorrectionResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *     </table>
   */
  public SLOCorrectionResponse getSLOCorrection(String sloCorrectionId) throws ApiException {
    return getSLOCorrectionWithHttpInfo(sloCorrectionId).getData();
  }

  /**
   * Get an SLO correction for an SLO Get an SLO correction
   *
   * @param sloCorrectionId The ID of the SLO correction object (required)
   * @return ApiResponse&lt;SLOCorrectionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SLOCorrectionResponse> getSLOCorrectionWithHttpInfo(String sloCorrectionId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'sloCorrectionId' is set
    if (sloCorrectionId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'sloCorrectionId' when calling getSLOCorrection");
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/slo/correction/{slo_correction_id}"
            .replaceAll(
                "\\{" + "slo_correction_id" + "\\}",
                apiClient.escapeString(sloCorrectionId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getSLOCorrection");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<SLOCorrectionResponse> localVarReturnType =
        new GenericType<SLOCorrectionResponse>() {};

    return apiClient.invokeAPI(
        "ServiceLevelObjectiveCorrectionsApi.getSLOCorrection",
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
   * Get all SLO corrections Get all Service Level Objective corrections
   *
   * @return SLOCorrectionListResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *     </table>
   */
  public SLOCorrectionListResponse listSLOCorrection() throws ApiException {
    return listSLOCorrectionWithHttpInfo().getData();
  }

  /**
   * Get all SLO corrections Get all Service Level Objective corrections
   *
   * @return ApiResponse&lt;SLOCorrectionListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SLOCorrectionListResponse> listSLOCorrectionWithHttpInfo()
      throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v1/slo/correction";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listSLOCorrection");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<SLOCorrectionListResponse> localVarReturnType =
        new GenericType<SLOCorrectionListResponse>() {};

    return apiClient.invokeAPI(
        "ServiceLevelObjectiveCorrectionsApi.listSLOCorrection",
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
   * Update an SLO correction Update the specified SLO correction object object
   *
   * @param sloCorrectionId The ID of the SLO correction object (required)
   * @param body The edited SLO correction object. (required)
   * @return SLOCorrectionResponse
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
  public SLOCorrectionResponse updateSLOCorrection(
      String sloCorrectionId, SLOCorrectionUpdateRequest body) throws ApiException {
    return updateSLOCorrectionWithHttpInfo(sloCorrectionId, body).getData();
  }

  /**
   * Update an SLO correction Update the specified SLO correction object object
   *
   * @param sloCorrectionId The ID of the SLO correction object (required)
   * @param body The edited SLO correction object. (required)
   * @return ApiResponse&lt;SLOCorrectionResponse&gt;
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
  public ApiResponse<SLOCorrectionResponse> updateSLOCorrectionWithHttpInfo(
      String sloCorrectionId, SLOCorrectionUpdateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'sloCorrectionId' is set
    if (sloCorrectionId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'sloCorrectionId' when calling updateSLOCorrection");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateSLOCorrection");
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/slo/correction/{slo_correction_id}"
            .replaceAll(
                "\\{" + "slo_correction_id" + "\\}",
                apiClient.escapeString(sloCorrectionId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "updateSLOCorrection");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<SLOCorrectionResponse> localVarReturnType =
        new GenericType<SLOCorrectionResponse>() {};

    return apiClient.invokeAPI(
        "ServiceLevelObjectiveCorrectionsApi.updateSLOCorrection",
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
