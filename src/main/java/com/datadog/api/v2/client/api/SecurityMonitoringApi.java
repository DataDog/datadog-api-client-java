package com.datadog.api.v2.client.api;

import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.ApiResponse;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.Pair;
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
public class SecurityMonitoringApi {
  private ApiClient apiClient;

  public SecurityMonitoringApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SecurityMonitoringApi(ApiClient apiClient) {
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

  private ApiResponse<SecurityMonitoringRuleResponse> createSecurityMonitoringRuleWithHttpInfo(
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

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<SecurityMonitoringRuleResponse> localVarReturnType =
        new GenericType<SecurityMonitoringRuleResponse>() {};

    return apiClient.invokeAPI(
        "SecurityMonitoringApi.createSecurityMonitoringRule",
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

  public class APIcreateSecurityMonitoringRuleRequest {
    private SecurityMonitoringRuleCreatePayload body;

    private APIcreateSecurityMonitoringRuleRequest() {}

    /**
     * Set body
     *
     * @param body (required)
     * @return APIcreateSecurityMonitoringRuleRequest
     */
    public APIcreateSecurityMonitoringRuleRequest body(SecurityMonitoringRuleCreatePayload body) {
      this.body = body;
      return this;
    }

    /**
     * Execute createSecurityMonitoringRule request
     *
     * @return SecurityMonitoringRuleResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
     * </table>
     */
    public SecurityMonitoringRuleResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute createSecurityMonitoringRule request with HTTP info returned
     *
     * @return ApiResponse&lt;SecurityMonitoringRuleResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<SecurityMonitoringRuleResponse> executeWithHttpInfo() throws ApiException {
      return createSecurityMonitoringRuleWithHttpInfo(body);
    }
  }

  /**
   * Create a detection rule Create a detection rule.
   *
   * @return createSecurityMonitoringRuleRequest
   * @throws ApiException if fails to make API call
   */
  public APIcreateSecurityMonitoringRuleRequest createSecurityMonitoringRule() throws ApiException {
    return new APIcreateSecurityMonitoringRuleRequest();
  }

  private ApiResponse<Void> deleteSecurityMonitoringRuleWithHttpInfo(String ruleId)
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

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    return apiClient.invokeAPI(
        "SecurityMonitoringApi.deleteSecurityMonitoringRule",
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

  public class APIdeleteSecurityMonitoringRuleRequest {
    private String ruleId;

    private APIdeleteSecurityMonitoringRuleRequest(String ruleId) {
      this.ruleId = ruleId;
    }

    /**
     * Execute deleteSecurityMonitoringRule request
     *
     * @throws ApiException if fails to make API call
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
     * <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     * </table>
     */
    public void execute() throws ApiException {
      this.executeWithHttpInfo().getData();
    }

    /**
     * Execute deleteSecurityMonitoringRule request with HTTP info returned
     *
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
     * <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
      return deleteSecurityMonitoringRuleWithHttpInfo(ruleId);
    }
  }

  /**
   * Delete an existing rule Delete an existing rule. Default rules cannot be deleted.
   *
   * @param ruleId The ID of the rule. (required)
   * @return deleteSecurityMonitoringRuleRequest
   * @throws ApiException if fails to make API call
   */
  public APIdeleteSecurityMonitoringRuleRequest deleteSecurityMonitoringRule(String ruleId)
      throws ApiException {
    return new APIdeleteSecurityMonitoringRuleRequest(ruleId);
  }

  private ApiResponse<SecurityMonitoringRuleResponse> getSecurityMonitoringRuleWithHttpInfo(
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

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<SecurityMonitoringRuleResponse> localVarReturnType =
        new GenericType<SecurityMonitoringRuleResponse>() {};

    return apiClient.invokeAPI(
        "SecurityMonitoringApi.getSecurityMonitoringRule",
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

  public class APIgetSecurityMonitoringRuleRequest {
    private String ruleId;

    private APIgetSecurityMonitoringRuleRequest(String ruleId) {
      this.ruleId = ruleId;
    }

    /**
     * Execute getSecurityMonitoringRule request
     *
     * @return SecurityMonitoringRuleResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     * <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     * </table>
     */
    public SecurityMonitoringRuleResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getSecurityMonitoringRule request with HTTP info returned
     *
     * @return ApiResponse&lt;SecurityMonitoringRuleResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     * <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<SecurityMonitoringRuleResponse> executeWithHttpInfo() throws ApiException {
      return getSecurityMonitoringRuleWithHttpInfo(ruleId);
    }
  }

  /**
   * Get a rule&#39;s details Get a rule&#39;s details.
   *
   * @param ruleId The ID of the rule. (required)
   * @return getSecurityMonitoringRuleRequest
   * @throws ApiException if fails to make API call
   */
  public APIgetSecurityMonitoringRuleRequest getSecurityMonitoringRule(String ruleId)
      throws ApiException {
    return new APIgetSecurityMonitoringRuleRequest(ruleId);
  }

  private ApiResponse<SecurityMonitoringListRulesResponse> listSecurityMonitoringRulesWithHttpInfo(
      Long pageSize, Long pageNumber) throws ApiException {
    Object localVarPostBody = null;

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

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<SecurityMonitoringListRulesResponse> localVarReturnType =
        new GenericType<SecurityMonitoringListRulesResponse>() {};

    return apiClient.invokeAPI(
        "SecurityMonitoringApi.listSecurityMonitoringRules",
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

  public class APIlistSecurityMonitoringRulesRequest {
    private Long pageSize;
    private Long pageNumber;

    private APIlistSecurityMonitoringRulesRequest() {}

    /**
     * Set pageSize
     *
     * @param pageSize Size for a given page. (optional, default to 10l)
     * @return APIlistSecurityMonitoringRulesRequest
     */
    public APIlistSecurityMonitoringRulesRequest pageSize(Long pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set pageNumber
     *
     * @param pageNumber Specific page number to return. (optional, default to 0l)
     * @return APIlistSecurityMonitoringRulesRequest
     */
    public APIlistSecurityMonitoringRulesRequest pageNumber(Long pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Execute listSecurityMonitoringRules request
     *
     * @return SecurityMonitoringListRulesResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     * </table>
     */
    public SecurityMonitoringListRulesResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listSecurityMonitoringRules request with HTTP info returned
     *
     * @return ApiResponse&lt;SecurityMonitoringListRulesResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<SecurityMonitoringListRulesResponse> executeWithHttpInfo()
        throws ApiException {
      return listSecurityMonitoringRulesWithHttpInfo(pageSize, pageNumber);
    }
  }

  /**
   * List rules List rules.
   *
   * @return listSecurityMonitoringRulesRequest
   * @throws ApiException if fails to make API call
   */
  public APIlistSecurityMonitoringRulesRequest listSecurityMonitoringRules() throws ApiException {
    return new APIlistSecurityMonitoringRulesRequest();
  }

  private ApiResponse<SecurityMonitoringSignalsListResponse>
      listSecurityMonitoringSignalsWithHttpInfo(
          String filterQuery,
          OffsetDateTime filterFrom,
          OffsetDateTime filterTo,
          SecurityMonitoringSignalsSort sort,
          String pageCursor,
          Integer pageLimit)
          throws ApiException {
    Object localVarPostBody = null;

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

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<SecurityMonitoringSignalsListResponse> localVarReturnType =
        new GenericType<SecurityMonitoringSignalsListResponse>() {};

    return apiClient.invokeAPI(
        "SecurityMonitoringApi.listSecurityMonitoringSignals",
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

  public class APIlistSecurityMonitoringSignalsRequest {
    private String filterQuery;
    private OffsetDateTime filterFrom;
    private OffsetDateTime filterTo;
    private SecurityMonitoringSignalsSort sort;
    private String pageCursor;
    private Integer pageLimit;

    private APIlistSecurityMonitoringSignalsRequest() {}

    /**
     * Set filterQuery
     *
     * @param filterQuery The search query for security signals. (optional)
     * @return APIlistSecurityMonitoringSignalsRequest
     */
    public APIlistSecurityMonitoringSignalsRequest filterQuery(String filterQuery) {
      this.filterQuery = filterQuery;
      return this;
    }

    /**
     * Set filterFrom
     *
     * @param filterFrom The minimum timestamp for requested security signals. (optional)
     * @return APIlistSecurityMonitoringSignalsRequest
     */
    public APIlistSecurityMonitoringSignalsRequest filterFrom(OffsetDateTime filterFrom) {
      this.filterFrom = filterFrom;
      return this;
    }

    /**
     * Set filterTo
     *
     * @param filterTo The maximum timestamp for requested security signals. (optional)
     * @return APIlistSecurityMonitoringSignalsRequest
     */
    public APIlistSecurityMonitoringSignalsRequest filterTo(OffsetDateTime filterTo) {
      this.filterTo = filterTo;
      return this;
    }

    /**
     * Set sort
     *
     * @param sort The order of the security signals in results. (optional)
     * @return APIlistSecurityMonitoringSignalsRequest
     */
    public APIlistSecurityMonitoringSignalsRequest sort(SecurityMonitoringSignalsSort sort) {
      this.sort = sort;
      return this;
    }

    /**
     * Set pageCursor
     *
     * @param pageCursor A list of results using the cursor provided in the previous query.
     *     (optional)
     * @return APIlistSecurityMonitoringSignalsRequest
     */
    public APIlistSecurityMonitoringSignalsRequest pageCursor(String pageCursor) {
      this.pageCursor = pageCursor;
      return this;
    }

    /**
     * Set pageLimit
     *
     * @param pageLimit The maximum number of security signals in the response. (optional, default
     *     to 10)
     * @return APIlistSecurityMonitoringSignalsRequest
     */
    public APIlistSecurityMonitoringSignalsRequest pageLimit(Integer pageLimit) {
      this.pageLimit = pageLimit;
      return this;
    }

    /**
     * Execute listSecurityMonitoringSignals request
     *
     * @return SecurityMonitoringSignalsListResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
     * </table>
     */
    public SecurityMonitoringSignalsListResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listSecurityMonitoringSignals request with HTTP info returned
     *
     * @return ApiResponse&lt;SecurityMonitoringSignalsListResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<SecurityMonitoringSignalsListResponse> executeWithHttpInfo()
        throws ApiException {
      return listSecurityMonitoringSignalsWithHttpInfo(
          filterQuery, filterFrom, filterTo, sort, pageCursor, pageLimit);
    }
  }

  /**
   * Get a quick list of security signals The list endpoint returns security signals that match a
   * search query. Both this endpoint and the POST endpoint can be used interchangeably when listing
   * security signals.
   *
   * @return listSecurityMonitoringSignalsRequest
   * @throws ApiException if fails to make API call
   */
  public APIlistSecurityMonitoringSignalsRequest listSecurityMonitoringSignals()
      throws ApiException {
    String operationId = "listSecurityMonitoringSignals";
    if (apiClient.isUnstableOperationEnabled(operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    return new APIlistSecurityMonitoringSignalsRequest();
  }

  private ApiResponse<SecurityMonitoringSignalsListResponse>
      searchSecurityMonitoringSignalsWithHttpInfo(SecurityMonitoringSignalListRequest body)
          throws ApiException {
    Object localVarPostBody = body;

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

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<SecurityMonitoringSignalsListResponse> localVarReturnType =
        new GenericType<SecurityMonitoringSignalsListResponse>() {};

    return apiClient.invokeAPI(
        "SecurityMonitoringApi.searchSecurityMonitoringSignals",
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

  public class APIsearchSecurityMonitoringSignalsRequest {
    private SecurityMonitoringSignalListRequest body;

    private APIsearchSecurityMonitoringSignalsRequest() {}

    /**
     * Set body
     *
     * @param body (optional)
     * @return APIsearchSecurityMonitoringSignalsRequest
     */
    public APIsearchSecurityMonitoringSignalsRequest body(
        SecurityMonitoringSignalListRequest body) {
      this.body = body;
      return this;
    }

    /**
     * Execute searchSecurityMonitoringSignals request
     *
     * @return SecurityMonitoringSignalsListResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
     * </table>
     */
    public SecurityMonitoringSignalsListResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute searchSecurityMonitoringSignals request with HTTP info returned
     *
     * @return ApiResponse&lt;SecurityMonitoringSignalsListResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<SecurityMonitoringSignalsListResponse> executeWithHttpInfo()
        throws ApiException {
      return searchSecurityMonitoringSignalsWithHttpInfo(body);
    }
  }

  /**
   * Get a list of security signals Returns security signals that match a search query. Both this
   * endpoint and the GET endpoint can be used interchangeably for listing security signals.
   *
   * @return searchSecurityMonitoringSignalsRequest
   * @throws ApiException if fails to make API call
   */
  public APIsearchSecurityMonitoringSignalsRequest searchSecurityMonitoringSignals()
      throws ApiException {
    String operationId = "searchSecurityMonitoringSignals";
    if (apiClient.isUnstableOperationEnabled(operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    return new APIsearchSecurityMonitoringSignalsRequest();
  }

  private ApiResponse<SecurityMonitoringRuleResponse> updateSecurityMonitoringRuleWithHttpInfo(
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

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<SecurityMonitoringRuleResponse> localVarReturnType =
        new GenericType<SecurityMonitoringRuleResponse>() {};

    return apiClient.invokeAPI(
        "SecurityMonitoringApi.updateSecurityMonitoringRule",
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

  public class APIupdateSecurityMonitoringRuleRequest {
    private String ruleId;
    private SecurityMonitoringRuleUpdatePayload body;

    private APIupdateSecurityMonitoringRuleRequest(String ruleId) {
      this.ruleId = ruleId;
    }

    /**
     * Set body
     *
     * @param body (required)
     * @return APIupdateSecurityMonitoringRuleRequest
     */
    public APIupdateSecurityMonitoringRuleRequest body(SecurityMonitoringRuleUpdatePayload body) {
      this.body = body;
      return this;
    }

    /**
     * Execute updateSecurityMonitoringRule request
     *
     * @return SecurityMonitoringRuleResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Concurrent Modification </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
     * <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     * </table>
     */
    public SecurityMonitoringRuleResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute updateSecurityMonitoringRule request with HTTP info returned
     *
     * @return ApiResponse&lt;SecurityMonitoringRuleResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Concurrent Modification </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
     * <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<SecurityMonitoringRuleResponse> executeWithHttpInfo() throws ApiException {
      return updateSecurityMonitoringRuleWithHttpInfo(ruleId, body);
    }
  }

  /**
   * Update an existing rule Update an existing rule. When updating &#x60;cases&#x60;,
   * &#x60;queries&#x60; or &#x60;options&#x60;, the whole field must be included. For example, when
   * modifying a query all queries must be included. Default rules can only be updated to be enabled
   * and to change notifications.
   *
   * @param ruleId The ID of the rule. (required)
   * @return updateSecurityMonitoringRuleRequest
   * @throws ApiException if fails to make API call
   */
  public APIupdateSecurityMonitoringRuleRequest updateSecurityMonitoringRule(String ruleId)
      throws ApiException {
    return new APIupdateSecurityMonitoringRuleRequest(ruleId);
  }
}
