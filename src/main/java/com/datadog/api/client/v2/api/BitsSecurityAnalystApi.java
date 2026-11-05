package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.SecurityAgentInvestigationCountField;
import com.datadog.api.client.v2.model.SecurityAgentInvestigationCountsResponse;
import com.datadog.api.client.v2.model.SecurityAgentInvestigationField;
import com.datadog.api.client.v2.model.SecurityAgentInvestigationResponse;
import com.datadog.api.client.v2.model.SecurityAgentInvestigationsListResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class BitsSecurityAnalystApi {
  private ApiClient apiClient;

  public BitsSecurityAnalystApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public BitsSecurityAnalystApi(ApiClient apiClient) {
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

  /** Manage optional parameters to countSecurityAgentInvestigations. */
  public static class CountSecurityAgentInvestigationsOptionalParameters {
    private String filterTitle;
    private String filterFrom;
    private String filterTo;
    private String filterVerdict;
    private String filterRuleId;
    private String filterRuleType;
    private String filterSignalSeverity;
    private String filterSignalSource;
    private String filterTags;
    private String filterEntity;

    /**
     * Set filterTitle.
     *
     * @param filterTitle Only investigations whose signal title contains this text,
     *     case-insensitive. (optional)
     * @return CountSecurityAgentInvestigationsOptionalParameters
     */
    public CountSecurityAgentInvestigationsOptionalParameters filterTitle(String filterTitle) {
      this.filterTitle = filterTitle;
      return this;
    }

    /**
     * Set filterFrom.
     *
     * @param filterFrom Only investigations last updated at or after this time, as RFC 3339 or
     *     milliseconds since the epoch. (optional)
     * @return CountSecurityAgentInvestigationsOptionalParameters
     */
    public CountSecurityAgentInvestigationsOptionalParameters filterFrom(String filterFrom) {
      this.filterFrom = filterFrom;
      return this;
    }

    /**
     * Set filterTo.
     *
     * @param filterTo Only investigations last updated at or before this time, as RFC 3339 or
     *     milliseconds since the epoch. (optional)
     * @return CountSecurityAgentInvestigationsOptionalParameters
     */
    public CountSecurityAgentInvestigationsOptionalParameters filterTo(String filterTo) {
      this.filterTo = filterTo;
      return this;
    }

    /**
     * Set filterVerdict.
     *
     * @param filterVerdict Only investigations with one of these verdicts: <code>benign</code>,
     *     <code>suspicious</code>, or <code>malicious</code>. Comma-separated values; an
     *     investigation matches any of them. (optional)
     * @return CountSecurityAgentInvestigationsOptionalParameters
     */
    public CountSecurityAgentInvestigationsOptionalParameters filterVerdict(String filterVerdict) {
      this.filterVerdict = filterVerdict;
      return this;
    }

    /**
     * Set filterRuleId.
     *
     * @param filterRuleId Only investigations of signals from one of these detection rule IDs.
     *     Comma-separated values; an investigation matches any of them. (optional)
     * @return CountSecurityAgentInvestigationsOptionalParameters
     */
    public CountSecurityAgentInvestigationsOptionalParameters filterRuleId(String filterRuleId) {
      this.filterRuleId = filterRuleId;
      return this;
    }

    /**
     * Set filterRuleType.
     *
     * @param filterRuleType Only investigations of signals from detection rules of one of these
     *     types, as returned by the count with <code>field=rule_type</code>. Comma-separated
     *     values; an investigation matches any of them. (optional)
     * @return CountSecurityAgentInvestigationsOptionalParameters
     */
    public CountSecurityAgentInvestigationsOptionalParameters filterRuleType(
        String filterRuleType) {
      this.filterRuleType = filterRuleType;
      return this;
    }

    /**
     * Set filterSignalSeverity.
     *
     * @param filterSignalSeverity Only investigations of signals with one of these severities:
     *     <code>info</code>, <code>low</code>, <code>medium</code>, <code>high</code>, or <code>
     *     critical</code>. Comma-separated values; an investigation matches any of them. (optional)
     * @return CountSecurityAgentInvestigationsOptionalParameters
     */
    public CountSecurityAgentInvestigationsOptionalParameters filterSignalSeverity(
        String filterSignalSeverity) {
      this.filterSignalSeverity = filterSignalSeverity;
      return this;
    }

    /**
     * Set filterSignalSource.
     *
     * @param filterSignalSource Only investigations of signals from one of these sources, as
     *     returned by the count with <code>field=signal_source</code>. Comma-separated values; an
     *     investigation matches any of them. (optional)
     * @return CountSecurityAgentInvestigationsOptionalParameters
     */
    public CountSecurityAgentInvestigationsOptionalParameters filterSignalSource(
        String filterSignalSource) {
      this.filterSignalSource = filterSignalSource;
      return this;
    }

    /**
     * Set filterTags.
     *
     * @param filterTags Only investigations whose signal has all of these tags, written <code>
     *     key:value</code>. Comma-separated values; an investigation must have every one of them.
     *     (optional)
     * @return CountSecurityAgentInvestigationsOptionalParameters
     */
    public CountSecurityAgentInvestigationsOptionalParameters filterTags(String filterTags) {
      this.filterTags = filterTags;
      return this;
    }

    /**
     * Set filterEntity.
     *
     * @param filterEntity Only investigations whose signal has all of these entities. Write each
     *     entity as <code>attribute:value</code>, matching the values returned by the count
     *     endpoint with <code>field=entity</code>. Comma-separated values; an investigation must
     *     have every one of them. (optional)
     * @return CountSecurityAgentInvestigationsOptionalParameters
     */
    public CountSecurityAgentInvestigationsOptionalParameters filterEntity(String filterEntity) {
      this.filterEntity = filterEntity;
      return this;
    }
  }

  /**
   * Count Bits Security Analyst investigations.
   *
   * <p>See {@link #countSecurityAgentInvestigationsWithHttpInfo}.
   *
   * @param field Field to count completed investigations by. (required)
   * @return SecurityAgentInvestigationCountsResponse
   * @throws ApiException if fails to make API call
   */
  public SecurityAgentInvestigationCountsResponse countSecurityAgentInvestigations(
      SecurityAgentInvestigationCountField field) throws ApiException {
    return countSecurityAgentInvestigationsWithHttpInfo(
            field, new CountSecurityAgentInvestigationsOptionalParameters())
        .getData();
  }

  /**
   * Count Bits Security Analyst investigations.
   *
   * <p>See {@link #countSecurityAgentInvestigationsWithHttpInfoAsync}.
   *
   * @param field Field to count completed investigations by. (required)
   * @return CompletableFuture&lt;SecurityAgentInvestigationCountsResponse&gt;
   */
  public CompletableFuture<SecurityAgentInvestigationCountsResponse>
      countSecurityAgentInvestigationsAsync(SecurityAgentInvestigationCountField field) {
    return countSecurityAgentInvestigationsWithHttpInfoAsync(
            field, new CountSecurityAgentInvestigationsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Count Bits Security Analyst investigations.
   *
   * <p>See {@link #countSecurityAgentInvestigationsWithHttpInfo}.
   *
   * @param field Field to count completed investigations by. (required)
   * @param parameters Optional parameters for the request.
   * @return SecurityAgentInvestigationCountsResponse
   * @throws ApiException if fails to make API call
   */
  public SecurityAgentInvestigationCountsResponse countSecurityAgentInvestigations(
      SecurityAgentInvestigationCountField field,
      CountSecurityAgentInvestigationsOptionalParameters parameters)
      throws ApiException {
    return countSecurityAgentInvestigationsWithHttpInfo(field, parameters).getData();
  }

  /**
   * Count Bits Security Analyst investigations.
   *
   * <p>See {@link #countSecurityAgentInvestigationsWithHttpInfoAsync}.
   *
   * @param field Field to count completed investigations by. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;SecurityAgentInvestigationCountsResponse&gt;
   */
  public CompletableFuture<SecurityAgentInvestigationCountsResponse>
      countSecurityAgentInvestigationsAsync(
          SecurityAgentInvestigationCountField field,
          CountSecurityAgentInvestigationsOptionalParameters parameters) {
    return countSecurityAgentInvestigationsWithHttpInfoAsync(field, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Count completed Bits Security Analyst investigations by the values of one field. Buckets are
   * sorted by ascending count. With <code>field=entity</code> or <code>field=signal_source</code>,
   * an investigation counts in the bucket of each of its entities or sources.
   *
   * @param field Field to count completed investigations by. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;SecurityAgentInvestigationCountsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SecurityAgentInvestigationCountsResponse>
      countSecurityAgentInvestigationsWithHttpInfo(
          SecurityAgentInvestigationCountField field,
          CountSecurityAgentInvestigationsOptionalParameters parameters)
          throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "countSecurityAgentInvestigations";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'field' is set
    if (field == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'field' when calling countSecurityAgentInvestigations");
    }
    String filterTitle = parameters.filterTitle;
    String filterFrom = parameters.filterFrom;
    String filterTo = parameters.filterTo;
    String filterVerdict = parameters.filterVerdict;
    String filterRuleId = parameters.filterRuleId;
    String filterRuleType = parameters.filterRuleType;
    String filterSignalSeverity = parameters.filterSignalSeverity;
    String filterSignalSource = parameters.filterSignalSource;
    String filterTags = parameters.filterTags;
    String filterEntity = parameters.filterEntity;
    // create path and map variables
    String localVarPath = "/api/v2/security_monitoring/security_agent/investigations/count";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "field", field));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[title]", filterTitle));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[from]", filterFrom));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[to]", filterTo));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[verdict]", filterVerdict));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[rule_id]", filterRuleId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[rule_type]", filterRuleType));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[signal_severity]", filterSignalSeverity));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[signal_source]", filterSignalSource));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[tags]", filterTags));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[entity]", filterEntity));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.BitsSecurityAnalystApi.countSecurityAgentInvestigations",
            localVarPath,
            localVarQueryParams,
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<SecurityAgentInvestigationCountsResponse>() {});
  }

  /**
   * Count Bits Security Analyst investigations.
   *
   * <p>See {@link #countSecurityAgentInvestigationsWithHttpInfo}.
   *
   * @param field Field to count completed investigations by. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;SecurityAgentInvestigationCountsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SecurityAgentInvestigationCountsResponse>>
      countSecurityAgentInvestigationsWithHttpInfoAsync(
          SecurityAgentInvestigationCountField field,
          CountSecurityAgentInvestigationsOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "countSecurityAgentInvestigations";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<SecurityAgentInvestigationCountsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'field' is set
    if (field == null) {
      CompletableFuture<ApiResponse<SecurityAgentInvestigationCountsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'field' when calling"
                  + " countSecurityAgentInvestigations"));
      return result;
    }
    String filterTitle = parameters.filterTitle;
    String filterFrom = parameters.filterFrom;
    String filterTo = parameters.filterTo;
    String filterVerdict = parameters.filterVerdict;
    String filterRuleId = parameters.filterRuleId;
    String filterRuleType = parameters.filterRuleType;
    String filterSignalSeverity = parameters.filterSignalSeverity;
    String filterSignalSource = parameters.filterSignalSource;
    String filterTags = parameters.filterTags;
    String filterEntity = parameters.filterEntity;
    // create path and map variables
    String localVarPath = "/api/v2/security_monitoring/security_agent/investigations/count";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "field", field));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[title]", filterTitle));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[from]", filterFrom));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[to]", filterTo));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[verdict]", filterVerdict));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[rule_id]", filterRuleId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[rule_type]", filterRuleType));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[signal_severity]", filterSignalSeverity));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[signal_source]", filterSignalSource));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[tags]", filterTags));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[entity]", filterEntity));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.BitsSecurityAnalystApi.countSecurityAgentInvestigations",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SecurityAgentInvestigationCountsResponse>> result =
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
        new GenericType<SecurityAgentInvestigationCountsResponse>() {});
  }

  /** Manage optional parameters to getSecurityAgentInvestigation. */
  public static class GetSecurityAgentInvestigationOptionalParameters {
    private List<SecurityAgentInvestigationField> fieldsInvestigations;

    /**
     * Set fieldsInvestigations.
     *
     * @param fieldsInvestigations Attributes to return, comma-separated. Defaults to all
     *     attributes. (optional)
     * @return GetSecurityAgentInvestigationOptionalParameters
     */
    public GetSecurityAgentInvestigationOptionalParameters fieldsInvestigations(
        List<SecurityAgentInvestigationField> fieldsInvestigations) {
      this.fieldsInvestigations = fieldsInvestigations;
      return this;
    }
  }

  /**
   * Get a Bits Security Analyst investigation.
   *
   * <p>See {@link #getSecurityAgentInvestigationWithHttpInfo}.
   *
   * @param investigationId The ID of the investigation, as returned by the list. (required)
   * @return SecurityAgentInvestigationResponse
   * @throws ApiException if fails to make API call
   */
  public SecurityAgentInvestigationResponse getSecurityAgentInvestigation(String investigationId)
      throws ApiException {
    return getSecurityAgentInvestigationWithHttpInfo(
            investigationId, new GetSecurityAgentInvestigationOptionalParameters())
        .getData();
  }

  /**
   * Get a Bits Security Analyst investigation.
   *
   * <p>See {@link #getSecurityAgentInvestigationWithHttpInfoAsync}.
   *
   * @param investigationId The ID of the investigation, as returned by the list. (required)
   * @return CompletableFuture&lt;SecurityAgentInvestigationResponse&gt;
   */
  public CompletableFuture<SecurityAgentInvestigationResponse> getSecurityAgentInvestigationAsync(
      String investigationId) {
    return getSecurityAgentInvestigationWithHttpInfoAsync(
            investigationId, new GetSecurityAgentInvestigationOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a Bits Security Analyst investigation.
   *
   * <p>See {@link #getSecurityAgentInvestigationWithHttpInfo}.
   *
   * @param investigationId The ID of the investigation, as returned by the list. (required)
   * @param parameters Optional parameters for the request.
   * @return SecurityAgentInvestigationResponse
   * @throws ApiException if fails to make API call
   */
  public SecurityAgentInvestigationResponse getSecurityAgentInvestigation(
      String investigationId, GetSecurityAgentInvestigationOptionalParameters parameters)
      throws ApiException {
    return getSecurityAgentInvestigationWithHttpInfo(investigationId, parameters).getData();
  }

  /**
   * Get a Bits Security Analyst investigation.
   *
   * <p>See {@link #getSecurityAgentInvestigationWithHttpInfoAsync}.
   *
   * @param investigationId The ID of the investigation, as returned by the list. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;SecurityAgentInvestigationResponse&gt;
   */
  public CompletableFuture<SecurityAgentInvestigationResponse> getSecurityAgentInvestigationAsync(
      String investigationId, GetSecurityAgentInvestigationOptionalParameters parameters) {
    return getSecurityAgentInvestigationWithHttpInfoAsync(investigationId, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a Bits Security Analyst investigation by its ID, with its verdict, conclusion, evidence,
   * steps, and response suggestions. While the investigation is running, the response has a <code>
   * Retry-After</code> header.
   *
   * @param investigationId The ID of the investigation, as returned by the list. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;SecurityAgentInvestigationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SecurityAgentInvestigationResponse> getSecurityAgentInvestigationWithHttpInfo(
      String investigationId, GetSecurityAgentInvestigationOptionalParameters parameters)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getSecurityAgentInvestigation";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'investigationId' is set
    if (investigationId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'investigationId' when calling"
              + " getSecurityAgentInvestigation");
    }
    List<SecurityAgentInvestigationField> fieldsInvestigations = parameters.fieldsInvestigations;
    // create path and map variables
    String localVarPath =
        "/api/v2/security_monitoring/security_agent/investigations/{investigation_id}"
            .replaceAll(
                "\\{" + "investigation_id" + "\\}",
                apiClient.escapeString(investigationId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(
        apiClient.parameterToPairs("csv", "fields[investigations]", fieldsInvestigations));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.BitsSecurityAnalystApi.getSecurityAgentInvestigation",
            localVarPath,
            localVarQueryParams,
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<SecurityAgentInvestigationResponse>() {});
  }

  /**
   * Get a Bits Security Analyst investigation.
   *
   * <p>See {@link #getSecurityAgentInvestigationWithHttpInfo}.
   *
   * @param investigationId The ID of the investigation, as returned by the list. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;SecurityAgentInvestigationResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SecurityAgentInvestigationResponse>>
      getSecurityAgentInvestigationWithHttpInfoAsync(
          String investigationId, GetSecurityAgentInvestigationOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "getSecurityAgentInvestigation";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<SecurityAgentInvestigationResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'investigationId' is set
    if (investigationId == null) {
      CompletableFuture<ApiResponse<SecurityAgentInvestigationResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'investigationId' when calling"
                  + " getSecurityAgentInvestigation"));
      return result;
    }
    List<SecurityAgentInvestigationField> fieldsInvestigations = parameters.fieldsInvestigations;
    // create path and map variables
    String localVarPath =
        "/api/v2/security_monitoring/security_agent/investigations/{investigation_id}"
            .replaceAll(
                "\\{" + "investigation_id" + "\\}",
                apiClient.escapeString(investigationId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(
        apiClient.parameterToPairs("csv", "fields[investigations]", fieldsInvestigations));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.BitsSecurityAnalystApi.getSecurityAgentInvestigation",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SecurityAgentInvestigationResponse>> result =
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
        new GenericType<SecurityAgentInvestigationResponse>() {});
  }

  /** Manage optional parameters to listSecurityAgentInvestigations. */
  public static class ListSecurityAgentInvestigationsOptionalParameters {
    private String filterSignalId;
    private String filterTitle;
    private String filterFrom;
    private String filterTo;
    private String filterVerdict;
    private String filterState;
    private String filterRuleId;
    private String filterRuleType;
    private String filterSignalSeverity;
    private String filterSignalSource;
    private String filterTags;
    private String filterEntity;
    private String sort;
    private Long pageNumber;
    private Long pageSize;

    /**
     * Set filterSignalId.
     *
     * @param filterSignalId List every investigation of this signal, newest first. Accepts the
     *     signal ID in its V1 form, which starts with <code>AQ</code>, or in its longer V3 form,
     *     which starts with <code>Aw</code>. Investigations carry the V1 form, so their <code>
     *     signal_id</code> can differ from the ID you pass. Can't be combined with other filters or
     *     with <code>sort</code>. (optional)
     * @return ListSecurityAgentInvestigationsOptionalParameters
     */
    public ListSecurityAgentInvestigationsOptionalParameters filterSignalId(String filterSignalId) {
      this.filterSignalId = filterSignalId;
      return this;
    }

    /**
     * Set filterTitle.
     *
     * @param filterTitle Only investigations whose signal title contains this text,
     *     case-insensitive. (optional)
     * @return ListSecurityAgentInvestigationsOptionalParameters
     */
    public ListSecurityAgentInvestigationsOptionalParameters filterTitle(String filterTitle) {
      this.filterTitle = filterTitle;
      return this;
    }

    /**
     * Set filterFrom.
     *
     * @param filterFrom Only investigations last updated at or after this time, as RFC 3339 or
     *     milliseconds since the epoch. (optional)
     * @return ListSecurityAgentInvestigationsOptionalParameters
     */
    public ListSecurityAgentInvestigationsOptionalParameters filterFrom(String filterFrom) {
      this.filterFrom = filterFrom;
      return this;
    }

    /**
     * Set filterTo.
     *
     * @param filterTo Only investigations last updated at or before this time, as RFC 3339 or
     *     milliseconds since the epoch. (optional)
     * @return ListSecurityAgentInvestigationsOptionalParameters
     */
    public ListSecurityAgentInvestigationsOptionalParameters filterTo(String filterTo) {
      this.filterTo = filterTo;
      return this;
    }

    /**
     * Set filterVerdict.
     *
     * @param filterVerdict Only investigations with one of these verdicts: <code>benign</code>,
     *     <code>suspicious</code>, or <code>malicious</code>. Comma-separated values; an
     *     investigation matches any of them. (optional)
     * @return ListSecurityAgentInvestigationsOptionalParameters
     */
    public ListSecurityAgentInvestigationsOptionalParameters filterVerdict(String filterVerdict) {
      this.filterVerdict = filterVerdict;
      return this;
    }

    /**
     * Set filterState.
     *
     * @param filterState Only investigations in one of these states: <code>investigating</code> or
     *     <code>completed</code>. Investigations reported as <code>failed</code> match <code>
     *     investigating</code>. Comma-separated values; an investigation matches any of them.
     *     (optional)
     * @return ListSecurityAgentInvestigationsOptionalParameters
     */
    public ListSecurityAgentInvestigationsOptionalParameters filterState(String filterState) {
      this.filterState = filterState;
      return this;
    }

    /**
     * Set filterRuleId.
     *
     * @param filterRuleId Only investigations of signals from one of these detection rule IDs.
     *     Comma-separated values; an investigation matches any of them. (optional)
     * @return ListSecurityAgentInvestigationsOptionalParameters
     */
    public ListSecurityAgentInvestigationsOptionalParameters filterRuleId(String filterRuleId) {
      this.filterRuleId = filterRuleId;
      return this;
    }

    /**
     * Set filterRuleType.
     *
     * @param filterRuleType Only investigations of signals from detection rules of one of these
     *     types, as returned by the count with <code>field=rule_type</code>. Comma-separated
     *     values; an investigation matches any of them. (optional)
     * @return ListSecurityAgentInvestigationsOptionalParameters
     */
    public ListSecurityAgentInvestigationsOptionalParameters filterRuleType(String filterRuleType) {
      this.filterRuleType = filterRuleType;
      return this;
    }

    /**
     * Set filterSignalSeverity.
     *
     * @param filterSignalSeverity Only investigations of signals with one of these severities:
     *     <code>info</code>, <code>low</code>, <code>medium</code>, <code>high</code>, or <code>
     *     critical</code>. Comma-separated values; an investigation matches any of them. (optional)
     * @return ListSecurityAgentInvestigationsOptionalParameters
     */
    public ListSecurityAgentInvestigationsOptionalParameters filterSignalSeverity(
        String filterSignalSeverity) {
      this.filterSignalSeverity = filterSignalSeverity;
      return this;
    }

    /**
     * Set filterSignalSource.
     *
     * @param filterSignalSource Only investigations of signals from one of these sources, as
     *     returned by the count with <code>field=signal_source</code>. Comma-separated values; an
     *     investigation matches any of them. (optional)
     * @return ListSecurityAgentInvestigationsOptionalParameters
     */
    public ListSecurityAgentInvestigationsOptionalParameters filterSignalSource(
        String filterSignalSource) {
      this.filterSignalSource = filterSignalSource;
      return this;
    }

    /**
     * Set filterTags.
     *
     * @param filterTags Only investigations whose signal has all of these tags, written <code>
     *     key:value</code>. Comma-separated values; an investigation must have every one of them.
     *     (optional)
     * @return ListSecurityAgentInvestigationsOptionalParameters
     */
    public ListSecurityAgentInvestigationsOptionalParameters filterTags(String filterTags) {
      this.filterTags = filterTags;
      return this;
    }

    /**
     * Set filterEntity.
     *
     * @param filterEntity Only investigations whose signal has all of these entities. Write each
     *     entity as <code>attribute:value</code>, matching the values returned by the count
     *     endpoint with <code>field=entity</code>. Comma-separated values; an investigation must
     *     have every one of them. (optional)
     * @return ListSecurityAgentInvestigationsOptionalParameters
     */
    public ListSecurityAgentInvestigationsOptionalParameters filterEntity(String filterEntity) {
      this.filterEntity = filterEntity;
      return this;
    }

    /**
     * Set sort.
     *
     * @param sort Sort field, prefixed with <code>-</code> for descending: <code>updated_at</code>,
     *     <code>severity</code>, <code>verdict</code>, <code>rule_id</code>, or <code>signal_title
     *     </code>. Defaults to <code>-updated_at</code>. <code>verdict</code> sorts by severity (
     *     <code>benign</code>, <code>suspicious</code>, <code>malicious</code>), so <code>-verdict
     *     </code> puts <code>malicious</code> first. (optional)
     * @return ListSecurityAgentInvestigationsOptionalParameters
     */
    public ListSecurityAgentInvestigationsOptionalParameters sort(String sort) {
      this.sort = sort;
      return this;
    }

    /**
     * Set pageNumber.
     *
     * @param pageNumber Page number, starting at 1. (optional, default to 1)
     * @return ListSecurityAgentInvestigationsOptionalParameters
     */
    public ListSecurityAgentInvestigationsOptionalParameters pageNumber(Long pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set pageSize.
     *
     * @param pageSize Number of investigations per page. (optional, default to 25)
     * @return ListSecurityAgentInvestigationsOptionalParameters
     */
    public ListSecurityAgentInvestigationsOptionalParameters pageSize(Long pageSize) {
      this.pageSize = pageSize;
      return this;
    }
  }

  /**
   * List Bits Security Analyst investigations.
   *
   * <p>See {@link #listSecurityAgentInvestigationsWithHttpInfo}.
   *
   * @return SecurityAgentInvestigationsListResponse
   * @throws ApiException if fails to make API call
   */
  public SecurityAgentInvestigationsListResponse listSecurityAgentInvestigations()
      throws ApiException {
    return listSecurityAgentInvestigationsWithHttpInfo(
            new ListSecurityAgentInvestigationsOptionalParameters())
        .getData();
  }

  /**
   * List Bits Security Analyst investigations.
   *
   * <p>See {@link #listSecurityAgentInvestigationsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;SecurityAgentInvestigationsListResponse&gt;
   */
  public CompletableFuture<SecurityAgentInvestigationsListResponse>
      listSecurityAgentInvestigationsAsync() {
    return listSecurityAgentInvestigationsWithHttpInfoAsync(
            new ListSecurityAgentInvestigationsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List Bits Security Analyst investigations.
   *
   * <p>See {@link #listSecurityAgentInvestigationsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return SecurityAgentInvestigationsListResponse
   * @throws ApiException if fails to make API call
   */
  public SecurityAgentInvestigationsListResponse listSecurityAgentInvestigations(
      ListSecurityAgentInvestigationsOptionalParameters parameters) throws ApiException {
    return listSecurityAgentInvestigationsWithHttpInfo(parameters).getData();
  }

  /**
   * List Bits Security Analyst investigations.
   *
   * <p>See {@link #listSecurityAgentInvestigationsWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;SecurityAgentInvestigationsListResponse&gt;
   */
  public CompletableFuture<SecurityAgentInvestigationsListResponse>
      listSecurityAgentInvestigationsAsync(
          ListSecurityAgentInvestigationsOptionalParameters parameters) {
    return listSecurityAgentInvestigationsWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List Bits Security Analyst investigations.
   *
   * <p>Without <code>filter[signal_id]</code>, returns the latest investigation of each signal,
   * filtered, sorted, and paginated. With <code>filter[signal_id]</code>, returns every
   * investigation of that signal, newest first. When the signal has no investigation, the first
   * page carries <code>meta.reason</code>, which says why.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;SecurityAgentInvestigationsListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SecurityAgentInvestigationsListResponse>
      listSecurityAgentInvestigationsWithHttpInfo(
          ListSecurityAgentInvestigationsOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listSecurityAgentInvestigations";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    String filterSignalId = parameters.filterSignalId;
    String filterTitle = parameters.filterTitle;
    String filterFrom = parameters.filterFrom;
    String filterTo = parameters.filterTo;
    String filterVerdict = parameters.filterVerdict;
    String filterState = parameters.filterState;
    String filterRuleId = parameters.filterRuleId;
    String filterRuleType = parameters.filterRuleType;
    String filterSignalSeverity = parameters.filterSignalSeverity;
    String filterSignalSource = parameters.filterSignalSource;
    String filterTags = parameters.filterTags;
    String filterEntity = parameters.filterEntity;
    String sort = parameters.sort;
    Long pageNumber = parameters.pageNumber;
    Long pageSize = parameters.pageSize;
    // create path and map variables
    String localVarPath = "/api/v2/security_monitoring/security_agent/investigations";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[signal_id]", filterSignalId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[title]", filterTitle));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[from]", filterFrom));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[to]", filterTo));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[verdict]", filterVerdict));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[state]", filterState));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[rule_id]", filterRuleId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[rule_type]", filterRuleType));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[signal_severity]", filterSignalSeverity));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[signal_source]", filterSignalSource));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[tags]", filterTags));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[entity]", filterEntity));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.BitsSecurityAnalystApi.listSecurityAgentInvestigations",
            localVarPath,
            localVarQueryParams,
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<SecurityAgentInvestigationsListResponse>() {});
  }

  /**
   * List Bits Security Analyst investigations.
   *
   * <p>See {@link #listSecurityAgentInvestigationsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;SecurityAgentInvestigationsListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SecurityAgentInvestigationsListResponse>>
      listSecurityAgentInvestigationsWithHttpInfoAsync(
          ListSecurityAgentInvestigationsOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listSecurityAgentInvestigations";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<SecurityAgentInvestigationsListResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    String filterSignalId = parameters.filterSignalId;
    String filterTitle = parameters.filterTitle;
    String filterFrom = parameters.filterFrom;
    String filterTo = parameters.filterTo;
    String filterVerdict = parameters.filterVerdict;
    String filterState = parameters.filterState;
    String filterRuleId = parameters.filterRuleId;
    String filterRuleType = parameters.filterRuleType;
    String filterSignalSeverity = parameters.filterSignalSeverity;
    String filterSignalSource = parameters.filterSignalSource;
    String filterTags = parameters.filterTags;
    String filterEntity = parameters.filterEntity;
    String sort = parameters.sort;
    Long pageNumber = parameters.pageNumber;
    Long pageSize = parameters.pageSize;
    // create path and map variables
    String localVarPath = "/api/v2/security_monitoring/security_agent/investigations";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[signal_id]", filterSignalId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[title]", filterTitle));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[from]", filterFrom));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[to]", filterTo));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[verdict]", filterVerdict));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[state]", filterState));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[rule_id]", filterRuleId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[rule_type]", filterRuleType));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[signal_severity]", filterSignalSeverity));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[signal_source]", filterSignalSource));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[tags]", filterTags));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[entity]", filterEntity));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.BitsSecurityAnalystApi.listSecurityAgentInvestigations",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SecurityAgentInvestigationsListResponse>> result =
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
        new GenericType<SecurityAgentInvestigationsListResponse>() {});
  }
}
