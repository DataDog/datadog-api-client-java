package com.datadog.api.v2.client.api;

import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.ApiResponse;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.Pair;
import com.datadog.api.v2.client.model.SecurityFilterCreateRequest;
import com.datadog.api.v2.client.model.SecurityFilterResponse;
import com.datadog.api.v2.client.model.SecurityFilterUpdateRequest;
import com.datadog.api.v2.client.model.SecurityFiltersResponse;
import com.datadog.api.v2.client.model.SecurityMonitoringListRulesResponse;
import com.datadog.api.v2.client.model.SecurityMonitoringRuleCreatePayload;
import com.datadog.api.v2.client.model.SecurityMonitoringRuleResponse;
import com.datadog.api.v2.client.model.SecurityMonitoringRuleUpdatePayload;
import com.datadog.api.v2.client.model.SecurityMonitoringSignalListRequest;
import com.datadog.api.v2.client.model.SecurityMonitoringSignalsListResponse;
import com.datadog.api.v2.client.model.SecurityMonitoringSignalsSort;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CloudSiemApi {
  private ApiClient apiClient;

  public CloudSiemApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CloudSiemApi(ApiClient apiClient) {
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
   * Create a security filter Create a security filter. See the [security filter
   * guide](https://docs.datadoghq.com/security_platform/guide/how-to-setup-security-filters-using-security-monitoring-api/)
   * for more examples.
   *
   * @param body The definition of the new security filter. (required)
   * @return SecurityFilterResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public SecurityFilterResponse createSecurityFilter(SecurityFilterCreateRequest body)
      throws ApiException {
    return createSecurityFilterWithHttpInfo(body).getData();
  }

  /**
   * Create a security filter Create a security filter. See the [security filter
   * guide](https://docs.datadoghq.com/security_platform/guide/how-to-setup-security-filters-using-security-monitoring-api/)
   * for more examples.
   *
   * @param body The definition of the new security filter. (required)
   * @return ApiResponse&lt;SecurityFilterResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SecurityFilterResponse> createSecurityFilterWithHttpInfo(
      SecurityFilterCreateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createSecurityFilter");
    }
    // create path and map variables
    String localVarPath = "/api/v2/security_monitoring/configuration/security_filters";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "createSecurityFilter");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<SecurityFilterResponse> localVarReturnType =
        new GenericType<SecurityFilterResponse>() {};

    return apiClient.invokeAPI(
        "CloudSiemApi.createSecurityFilter",
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
   * Create a detection rule Create a detection rule.
   *
   * @param body (required)
   * @return SecurityMonitoringRuleResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public SecurityMonitoringRuleResponse createSecurityMonitoringRule(
      SecurityMonitoringRuleCreatePayload body) throws ApiException {
    return createSecurityMonitoringRuleWithHttpInfo(body).getData();
  }

  /**
   * Create a detection rule Create a detection rule.
   *
   * @param body (required)
   * @return ApiResponse&lt;SecurityMonitoringRuleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SecurityMonitoringRuleResponse> createSecurityMonitoringRuleWithHttpInfo(
      SecurityMonitoringRuleCreatePayload body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createSecurityMonitoringRule");
    }
    // create path and map variables
    String localVarPath = "/api/v2/security_monitoring/rules";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "createSecurityMonitoringRule");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<SecurityMonitoringRuleResponse> localVarReturnType =
        new GenericType<SecurityMonitoringRuleResponse>() {};

    return apiClient.invokeAPI(
        "CloudSiemApi.createSecurityMonitoringRule",
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
   * Delete a security filter Delete a specific security filter.
   *
   * @param securityFilterId The ID of the security filter. (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public void deleteSecurityFilter(String securityFilterId) throws ApiException {
    deleteSecurityFilterWithHttpInfo(securityFilterId);
  }

  /**
   * Delete a security filter Delete a specific security filter.
   *
   * @param securityFilterId The ID of the security filter. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteSecurityFilterWithHttpInfo(String securityFilterId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'securityFilterId' is set
    if (securityFilterId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'securityFilterId' when calling deleteSecurityFilter");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/security_monitoring/configuration/security_filters/{security_filter_id}"
            .replaceAll(
                "\\{" + "security_filter_id" + "\\}",
                apiClient.escapeString(securityFilterId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "deleteSecurityFilter");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    return apiClient.invokeAPI(
        "CloudSiemApi.deleteSecurityFilter",
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
   * Delete an existing rule Delete an existing rule. Default rules cannot be deleted.
   *
   * @param ruleId The ID of the rule. (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public void deleteSecurityMonitoringRule(String ruleId) throws ApiException {
    deleteSecurityMonitoringRuleWithHttpInfo(ruleId);
  }

  /**
   * Delete an existing rule Delete an existing rule. Default rules cannot be deleted.
   *
   * @param ruleId The ID of the rule. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteSecurityMonitoringRuleWithHttpInfo(String ruleId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'ruleId' is set
    if (ruleId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'ruleId' when calling deleteSecurityMonitoringRule");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/security_monitoring/rules/{rule_id}"
            .replaceAll("\\{" + "rule_id" + "\\}", apiClient.escapeString(ruleId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "deleteSecurityMonitoringRule");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    return apiClient.invokeAPI(
        "CloudSiemApi.deleteSecurityMonitoringRule",
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
   * Get a security filter Get the details of a specific security filter. See the [security filter
   * guide](https://docs.datadoghq.com/security_platform/guide/how-to-setup-security-filters-using-security-monitoring-api/)
   * for more examples.
   *
   * @param securityFilterId The ID of the security filter. (required)
   * @return SecurityFilterResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public SecurityFilterResponse getSecurityFilter(String securityFilterId) throws ApiException {
    return getSecurityFilterWithHttpInfo(securityFilterId).getData();
  }

  /**
   * Get a security filter Get the details of a specific security filter. See the [security filter
   * guide](https://docs.datadoghq.com/security_platform/guide/how-to-setup-security-filters-using-security-monitoring-api/)
   * for more examples.
   *
   * @param securityFilterId The ID of the security filter. (required)
   * @return ApiResponse&lt;SecurityFilterResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SecurityFilterResponse> getSecurityFilterWithHttpInfo(String securityFilterId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'securityFilterId' is set
    if (securityFilterId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'securityFilterId' when calling getSecurityFilter");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/security_monitoring/configuration/security_filters/{security_filter_id}"
            .replaceAll(
                "\\{" + "security_filter_id" + "\\}",
                apiClient.escapeString(securityFilterId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getSecurityFilter");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<SecurityFilterResponse> localVarReturnType =
        new GenericType<SecurityFilterResponse>() {};

    return apiClient.invokeAPI(
        "CloudSiemApi.getSecurityFilter",
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
   * Get a rule&#39;s details Get a rule&#39;s details.
   *
   * @param ruleId The ID of the rule. (required)
   * @return SecurityMonitoringRuleResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public SecurityMonitoringRuleResponse getSecurityMonitoringRule(String ruleId)
      throws ApiException {
    return getSecurityMonitoringRuleWithHttpInfo(ruleId).getData();
  }

  /**
   * Get a rule&#39;s details Get a rule&#39;s details.
   *
   * @param ruleId The ID of the rule. (required)
   * @return ApiResponse&lt;SecurityMonitoringRuleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SecurityMonitoringRuleResponse> getSecurityMonitoringRuleWithHttpInfo(
      String ruleId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'ruleId' is set
    if (ruleId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'ruleId' when calling getSecurityMonitoringRule");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/security_monitoring/rules/{rule_id}"
            .replaceAll("\\{" + "rule_id" + "\\}", apiClient.escapeString(ruleId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getSecurityMonitoringRule");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<SecurityMonitoringRuleResponse> localVarReturnType =
        new GenericType<SecurityMonitoringRuleResponse>() {};

    return apiClient.invokeAPI(
        "CloudSiemApi.getSecurityMonitoringRule",
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
   * Get all security filters Get the list of configured security filters with their definitions.
   *
   * @return SecurityFiltersResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public SecurityFiltersResponse listSecurityFilters() throws ApiException {
    return listSecurityFiltersWithHttpInfo().getData();
  }

  /**
   * Get all security filters Get the list of configured security filters with their definitions.
   *
   * @return ApiResponse&lt;SecurityFiltersResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SecurityFiltersResponse> listSecurityFiltersWithHttpInfo()
      throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/security_monitoring/configuration/security_filters";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listSecurityFilters");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<SecurityFiltersResponse> localVarReturnType =
        new GenericType<SecurityFiltersResponse>() {};

    return apiClient.invokeAPI(
        "CloudSiemApi.listSecurityFilters",
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

  /** Manage optional parameters to listSecurityMonitoringRules. */
  public static class ListSecurityMonitoringRulesOptionalParameters {
    private Long pageSize;
    private Long pageNumber;

    /**
     * Set pageSize
     *
     * @param pageSize Size for a given page. (optional, default to 10)
     * @return ListSecurityMonitoringRulesOptionalParameters
     */
    public ListSecurityMonitoringRulesOptionalParameters pageSize(Long pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set pageNumber
     *
     * @param pageNumber Specific page number to return. (optional, default to 0)
     * @return ListSecurityMonitoringRulesOptionalParameters
     */
    public ListSecurityMonitoringRulesOptionalParameters pageNumber(Long pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }
  }

  /**
   * List rules List rules.
   *
   * @return SecurityMonitoringListRulesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public SecurityMonitoringListRulesResponse listSecurityMonitoringRules() throws ApiException {
    return listSecurityMonitoringRulesWithHttpInfo(
            new ListSecurityMonitoringRulesOptionalParameters())
        .getData();
  }

  /**
   * List rules List rules.
   *
   * @param parameters Optional parameters for the request.
   * @return SecurityMonitoringListRulesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><th> Status Code </th><th> Description </th><th> Response Headers </th></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public SecurityMonitoringListRulesResponse listSecurityMonitoringRules(
      ListSecurityMonitoringRulesOptionalParameters parameters) throws ApiException {
    return listSecurityMonitoringRulesWithHttpInfo(parameters).getData();
  }

  /**
   * List rules List rules.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;SecurityMonitoringListRulesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SecurityMonitoringListRulesResponse> listSecurityMonitoringRulesWithHttpInfo(
      ListSecurityMonitoringRulesOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    Long pageSize = parameters.pageSize;
    Long pageNumber = parameters.pageNumber;
    // create path and map variables
    String localVarPath = "/api/v2/security_monitoring/rules";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listSecurityMonitoringRules");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<SecurityMonitoringListRulesResponse> localVarReturnType =
        new GenericType<SecurityMonitoringListRulesResponse>() {};

    return apiClient.invokeAPI(
        "CloudSiemApi.listSecurityMonitoringRules",
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

  /** Manage optional parameters to listSecurityMonitoringSignals. */
  public static class ListSecurityMonitoringSignalsOptionalParameters {
    private String filterQuery;
    private OffsetDateTime filterFrom;
    private OffsetDateTime filterTo;
    private SecurityMonitoringSignalsSort sort;
    private String pageCursor;
    private Integer pageLimit;

    /**
     * Set filterQuery
     *
     * @param filterQuery The search query for security signals. (optional)
     * @return ListSecurityMonitoringSignalsOptionalParameters
     */
    public ListSecurityMonitoringSignalsOptionalParameters filterQuery(String filterQuery) {
      this.filterQuery = filterQuery;
      return this;
    }

    /**
     * Set filterFrom
     *
     * @param filterFrom The minimum timestamp for requested security signals. (optional)
     * @return ListSecurityMonitoringSignalsOptionalParameters
     */
    public ListSecurityMonitoringSignalsOptionalParameters filterFrom(OffsetDateTime filterFrom) {
      this.filterFrom = filterFrom;
      return this;
    }

    /**
     * Set filterTo
     *
     * @param filterTo The maximum timestamp for requested security signals. (optional)
     * @return ListSecurityMonitoringSignalsOptionalParameters
     */
    public ListSecurityMonitoringSignalsOptionalParameters filterTo(OffsetDateTime filterTo) {
      this.filterTo = filterTo;
      return this;
    }

    /**
     * Set sort
     *
     * @param sort The order of the security signals in results. (optional)
     * @return ListSecurityMonitoringSignalsOptionalParameters
     */
    public ListSecurityMonitoringSignalsOptionalParameters sort(
        SecurityMonitoringSignalsSort sort) {
      this.sort = sort;
      return this;
    }

    /**
     * Set pageCursor
     *
     * @param pageCursor A list of results using the cursor provided in the previous query.
     *     (optional)
     * @return ListSecurityMonitoringSignalsOptionalParameters
     */
    public ListSecurityMonitoringSignalsOptionalParameters pageCursor(String pageCursor) {
      this.pageCursor = pageCursor;
      return this;
    }

    /**
     * Set pageLimit
     *
     * @param pageLimit The maximum number of security signals in the response. (optional, default
     *     to 10)
     * @return ListSecurityMonitoringSignalsOptionalParameters
     */
    public ListSecurityMonitoringSignalsOptionalParameters pageLimit(Integer pageLimit) {
      this.pageLimit = pageLimit;
      return this;
    }
  }

  /**
   * Get a quick list of security signals The list endpoint returns security signals that match a
   * search query. Both this endpoint and the POST endpoint can be used interchangeably when listing
   * security signals.
   *
   * @return SecurityMonitoringSignalsListResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public SecurityMonitoringSignalsListResponse listSecurityMonitoringSignals() throws ApiException {
    return listSecurityMonitoringSignalsWithHttpInfo(
            new ListSecurityMonitoringSignalsOptionalParameters())
        .getData();
  }

  /**
   * Get a quick list of security signals The list endpoint returns security signals that match a
   * search query. Both this endpoint and the POST endpoint can be used interchangeably when listing
   * security signals.
   *
   * @param parameters Optional parameters for the request.
   * @return SecurityMonitoringSignalsListResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><th> Status Code </th><th> Description </th><th> Response Headers </th></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public SecurityMonitoringSignalsListResponse listSecurityMonitoringSignals(
      ListSecurityMonitoringSignalsOptionalParameters parameters) throws ApiException {
    return listSecurityMonitoringSignalsWithHttpInfo(parameters).getData();
  }

  /**
   * Get a quick list of security signals The list endpoint returns security signals that match a
   * search query. Both this endpoint and the POST endpoint can be used interchangeably when listing
   * security signals.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;SecurityMonitoringSignalsListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SecurityMonitoringSignalsListResponse>
      listSecurityMonitoringSignalsWithHttpInfo(
          ListSecurityMonitoringSignalsOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    String filterQuery = parameters.filterQuery;
    OffsetDateTime filterFrom = parameters.filterFrom;
    OffsetDateTime filterTo = parameters.filterTo;
    SecurityMonitoringSignalsSort sort = parameters.sort;
    String pageCursor = parameters.pageCursor;
    Integer pageLimit = parameters.pageLimit;
    // create path and map variables
    String localVarPath = "/api/v2/security_monitoring/signals";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[query]", filterQuery));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[from]", filterFrom));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[to]", filterTo));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[cursor]", pageCursor));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listSecurityMonitoringSignals");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<SecurityMonitoringSignalsListResponse> localVarReturnType =
        new GenericType<SecurityMonitoringSignalsListResponse>() {};

    return apiClient.invokeAPI(
        "CloudSiemApi.listSecurityMonitoringSignals",
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

  /** Manage optional parameters to searchSecurityMonitoringSignals. */
  public static class SearchSecurityMonitoringSignalsOptionalParameters {
    private SecurityMonitoringSignalListRequest body;

    /**
     * Set body
     *
     * @param body (optional)
     * @return SearchSecurityMonitoringSignalsOptionalParameters
     */
    public SearchSecurityMonitoringSignalsOptionalParameters body(
        SecurityMonitoringSignalListRequest body) {
      this.body = body;
      return this;
    }
  }

  /**
   * Get a list of security signals Returns security signals that match a search query. Both this
   * endpoint and the GET endpoint can be used interchangeably for listing security signals.
   *
   * @return SecurityMonitoringSignalsListResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public SecurityMonitoringSignalsListResponse searchSecurityMonitoringSignals()
      throws ApiException {
    return searchSecurityMonitoringSignalsWithHttpInfo(
            new SearchSecurityMonitoringSignalsOptionalParameters())
        .getData();
  }

  /**
   * Get a list of security signals Returns security signals that match a search query. Both this
   * endpoint and the GET endpoint can be used interchangeably for listing security signals.
   *
   * @param parameters Optional parameters for the request.
   * @return SecurityMonitoringSignalsListResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><th> Status Code </th><th> Description </th><th> Response Headers </th></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public SecurityMonitoringSignalsListResponse searchSecurityMonitoringSignals(
      SearchSecurityMonitoringSignalsOptionalParameters parameters) throws ApiException {
    return searchSecurityMonitoringSignalsWithHttpInfo(parameters).getData();
  }

  /**
   * Get a list of security signals Returns security signals that match a search query. Both this
   * endpoint and the GET endpoint can be used interchangeably for listing security signals.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;SecurityMonitoringSignalsListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SecurityMonitoringSignalsListResponse>
      searchSecurityMonitoringSignalsWithHttpInfo(
          SearchSecurityMonitoringSignalsOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = parameters.body;
    // create path and map variables
    String localVarPath = "/api/v2/security_monitoring/signals/search";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "searchSecurityMonitoringSignals");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<SecurityMonitoringSignalsListResponse> localVarReturnType =
        new GenericType<SecurityMonitoringSignalsListResponse>() {};

    return apiClient.invokeAPI(
        "CloudSiemApi.searchSecurityMonitoringSignals",
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
   * Update a security filter Update a specific security filter. Returns the security filter object
   * when the request is successful.
   *
   * @param securityFilterId The ID of the security filter. (required)
   * @param body New definition of the security filter. (required)
   * @return SecurityFilterResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Concurrent Modification </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public SecurityFilterResponse updateSecurityFilter(
      String securityFilterId, SecurityFilterUpdateRequest body) throws ApiException {
    return updateSecurityFilterWithHttpInfo(securityFilterId, body).getData();
  }

  /**
   * Update a security filter Update a specific security filter. Returns the security filter object
   * when the request is successful.
   *
   * @param securityFilterId The ID of the security filter. (required)
   * @param body New definition of the security filter. (required)
   * @return ApiResponse&lt;SecurityFilterResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Concurrent Modification </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SecurityFilterResponse> updateSecurityFilterWithHttpInfo(
      String securityFilterId, SecurityFilterUpdateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'securityFilterId' is set
    if (securityFilterId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'securityFilterId' when calling updateSecurityFilter");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateSecurityFilter");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/security_monitoring/configuration/security_filters/{security_filter_id}"
            .replaceAll(
                "\\{" + "security_filter_id" + "\\}",
                apiClient.escapeString(securityFilterId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "updateSecurityFilter");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<SecurityFilterResponse> localVarReturnType =
        new GenericType<SecurityFilterResponse>() {};

    return apiClient.invokeAPI(
        "CloudSiemApi.updateSecurityFilter",
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

  /**
   * Update an existing rule Update an existing rule. When updating &#x60;cases&#x60;,
   * &#x60;queries&#x60; or &#x60;options&#x60;, the whole field must be included. For example, when
   * modifying a query all queries must be included. Default rules can only be updated to be enabled
   * and to change notifications.
   *
   * @param ruleId The ID of the rule. (required)
   * @param body (required)
   * @return SecurityMonitoringRuleResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Concurrent Modification </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public SecurityMonitoringRuleResponse updateSecurityMonitoringRule(
      String ruleId, SecurityMonitoringRuleUpdatePayload body) throws ApiException {
    return updateSecurityMonitoringRuleWithHttpInfo(ruleId, body).getData();
  }

  /**
   * Update an existing rule Update an existing rule. When updating &#x60;cases&#x60;,
   * &#x60;queries&#x60; or &#x60;options&#x60;, the whole field must be included. For example, when
   * modifying a query all queries must be included. Default rules can only be updated to be enabled
   * and to change notifications.
   *
   * @param ruleId The ID of the rule. (required)
   * @param body (required)
   * @return ApiResponse&lt;SecurityMonitoringRuleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Concurrent Modification </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SecurityMonitoringRuleResponse> updateSecurityMonitoringRuleWithHttpInfo(
      String ruleId, SecurityMonitoringRuleUpdatePayload body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'ruleId' is set
    if (ruleId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'ruleId' when calling updateSecurityMonitoringRule");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateSecurityMonitoringRule");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/security_monitoring/rules/{rule_id}"
            .replaceAll("\\{" + "rule_id" + "\\}", apiClient.escapeString(ruleId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "updateSecurityMonitoringRule");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<SecurityMonitoringRuleResponse> localVarReturnType =
        new GenericType<SecurityMonitoringRuleResponse>() {};

    return apiClient.invokeAPI(
        "CloudSiemApi.updateSecurityMonitoringRule",
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
