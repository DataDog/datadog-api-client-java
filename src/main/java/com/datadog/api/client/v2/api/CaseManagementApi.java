package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.PaginationIterable;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.AutomationRuleCreateRequest;
import com.datadog.api.client.v2.model.AutomationRuleResponse;
import com.datadog.api.client.v2.model.AutomationRuleUpdateRequest;
import com.datadog.api.client.v2.model.AutomationRulesResponse;
import com.datadog.api.client.v2.model.Case;
import com.datadog.api.client.v2.model.CaseAggregateRequest;
import com.datadog.api.client.v2.model.CaseAggregateResponse;
import com.datadog.api.client.v2.model.CaseAssignRequest;
import com.datadog.api.client.v2.model.CaseBulkUpdateRequest;
import com.datadog.api.client.v2.model.CaseCommentRequest;
import com.datadog.api.client.v2.model.CaseCountResponse;
import com.datadog.api.client.v2.model.CaseCreateRequest;
import com.datadog.api.client.v2.model.CaseEmptyRequest;
import com.datadog.api.client.v2.model.CaseInsightsRequest;
import com.datadog.api.client.v2.model.CaseInvestigationNotebookCreateRequest;
import com.datadog.api.client.v2.model.CaseLinkCreateRequest;
import com.datadog.api.client.v2.model.CaseLinkResponse;
import com.datadog.api.client.v2.model.CaseLinksResponse;
import com.datadog.api.client.v2.model.CaseNotificationRuleCreateRequest;
import com.datadog.api.client.v2.model.CaseNotificationRuleResponse;
import com.datadog.api.client.v2.model.CaseNotificationRuleUpdateRequest;
import com.datadog.api.client.v2.model.CaseNotificationRulesResponse;
import com.datadog.api.client.v2.model.CaseResponse;
import com.datadog.api.client.v2.model.CaseSortableField;
import com.datadog.api.client.v2.model.CaseUpdateAttributesRequest;
import com.datadog.api.client.v2.model.CaseUpdateCommentRequest;
import com.datadog.api.client.v2.model.CaseUpdateCustomAttributeRequest;
import com.datadog.api.client.v2.model.CaseUpdateDescriptionRequest;
import com.datadog.api.client.v2.model.CaseUpdateDueDateRequest;
import com.datadog.api.client.v2.model.CaseUpdatePriorityRequest;
import com.datadog.api.client.v2.model.CaseUpdateResolvedReasonRequest;
import com.datadog.api.client.v2.model.CaseUpdateStatusRequest;
import com.datadog.api.client.v2.model.CaseUpdateTitleRequest;
import com.datadog.api.client.v2.model.CaseViewCreateRequest;
import com.datadog.api.client.v2.model.CaseViewResponse;
import com.datadog.api.client.v2.model.CaseViewUpdateRequest;
import com.datadog.api.client.v2.model.CaseViewsResponse;
import com.datadog.api.client.v2.model.CaseWatchersResponse;
import com.datadog.api.client.v2.model.CasesResponse;
import com.datadog.api.client.v2.model.JiraIssueCreateRequest;
import com.datadog.api.client.v2.model.JiraIssueLinkRequest;
import com.datadog.api.client.v2.model.MaintenanceWindowCreateRequest;
import com.datadog.api.client.v2.model.MaintenanceWindowResponse;
import com.datadog.api.client.v2.model.MaintenanceWindowUpdateRequest;
import com.datadog.api.client.v2.model.MaintenanceWindowsResponse;
import com.datadog.api.client.v2.model.ProjectCreateRequest;
import com.datadog.api.client.v2.model.ProjectFavoritesResponse;
import com.datadog.api.client.v2.model.ProjectRelationship;
import com.datadog.api.client.v2.model.ProjectResponse;
import com.datadog.api.client.v2.model.ProjectUpdateRequest;
import com.datadog.api.client.v2.model.ProjectsResponse;
import com.datadog.api.client.v2.model.RelationshipToIncidentRequest;
import com.datadog.api.client.v2.model.ServiceNowTicketCreateRequest;
import com.datadog.api.client.v2.model.TimelineResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CaseManagementApi {
  private ApiClient apiClient;

  public CaseManagementApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public CaseManagementApi(ApiClient apiClient) {
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

  /**
   * Add insights to a case.
   *
   * <p>See {@link #addCaseInsightsWithHttpInfo}.
   *
   * @param caseId Case's UUID or key (required)
   * @param body Case insights request. (required)
   * @return CaseResponse
   * @throws ApiException if fails to make API call
   */
  public CaseResponse addCaseInsights(String caseId, CaseInsightsRequest body) throws ApiException {
    return addCaseInsightsWithHttpInfo(caseId, body).getData();
  }

  /**
   * Add insights to a case.
   *
   * <p>See {@link #addCaseInsightsWithHttpInfoAsync}.
   *
   * @param caseId Case's UUID or key (required)
   * @param body Case insights request. (required)
   * @return CompletableFuture&lt;CaseResponse&gt;
   */
  public CompletableFuture<CaseResponse> addCaseInsightsAsync(
      String caseId, CaseInsightsRequest body) {
    return addCaseInsightsWithHttpInfoAsync(caseId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Adds one or more insights to a case. Insights are references to related Datadog resources (such
   * as monitors, security signals, incidents, or error tracking issues) that provide investigative
   * context. Up to 100 insights can be added per request. Each insight requires a type (see <code>
   * CaseInsightType</code> for allowed values), a ref (URL path to the resource), and a
   * resource_id.
   *
   * @param caseId Case's UUID or key (required)
   * @param body Case insights request. (required)
   * @return ApiResponse&lt;CaseResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CaseResponse> addCaseInsightsWithHttpInfo(
      String caseId, CaseInsightsRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'caseId' is set
    if (caseId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'caseId' when calling addCaseInsights");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling addCaseInsights");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/{case_id}/insights"
            .replaceAll("\\{" + "case_id" + "\\}", apiClient.escapeString(caseId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CaseManagementApi.addCaseInsights",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "PUT",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<CaseResponse>() {});
  }

  /**
   * Add insights to a case.
   *
   * <p>See {@link #addCaseInsightsWithHttpInfo}.
   *
   * @param caseId Case's UUID or key (required)
   * @param body Case insights request. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CaseResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CaseResponse>> addCaseInsightsWithHttpInfoAsync(
      String caseId, CaseInsightsRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'caseId' is set
    if (caseId == null) {
      CompletableFuture<ApiResponse<CaseResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'caseId' when calling addCaseInsights"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<CaseResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling addCaseInsights"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/{case_id}/insights"
            .replaceAll("\\{" + "case_id" + "\\}", apiClient.escapeString(caseId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CaseManagementApi.addCaseInsights",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CaseResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "PUT",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<CaseResponse>() {});
  }

  /**
   * Aggregate cases.
   *
   * <p>See {@link #aggregateCasesWithHttpInfo}.
   *
   * @param body Case aggregate request payload. (required)
   * @return CaseAggregateResponse
   * @throws ApiException if fails to make API call
   */
  public CaseAggregateResponse aggregateCases(CaseAggregateRequest body) throws ApiException {
    return aggregateCasesWithHttpInfo(body).getData();
  }

  /**
   * Aggregate cases.
   *
   * <p>See {@link #aggregateCasesWithHttpInfoAsync}.
   *
   * @param body Case aggregate request payload. (required)
   * @return CompletableFuture&lt;CaseAggregateResponse&gt;
   */
  public CompletableFuture<CaseAggregateResponse> aggregateCasesAsync(CaseAggregateRequest body) {
    return aggregateCasesWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Performs an aggregation query over cases, grouping results by specified fields and returning
   * counts per group along with a total. Useful for dashboards and analytics.
   *
   * @param body Case aggregate request payload. (required)
   * @return ApiResponse&lt;CaseAggregateResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CaseAggregateResponse> aggregateCasesWithHttpInfo(CaseAggregateRequest body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling aggregateCases");
    }
    // create path and map variables
    String localVarPath = "/api/v2/cases/aggregate";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CaseManagementApi.aggregateCases",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<CaseAggregateResponse>() {});
  }

  /**
   * Aggregate cases.
   *
   * <p>See {@link #aggregateCasesWithHttpInfo}.
   *
   * @param body Case aggregate request payload. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CaseAggregateResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CaseAggregateResponse>> aggregateCasesWithHttpInfoAsync(
      CaseAggregateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<CaseAggregateResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling aggregateCases"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/cases/aggregate";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CaseManagementApi.aggregateCases",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CaseAggregateResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<CaseAggregateResponse>() {});
  }

  /**
   * Archive case.
   *
   * <p>See {@link #archiveCaseWithHttpInfo}.
   *
   * @param caseId Case's UUID or key (required)
   * @param body Archive case payload (required)
   * @return CaseResponse
   * @throws ApiException if fails to make API call
   */
  public CaseResponse archiveCase(String caseId, CaseEmptyRequest body) throws ApiException {
    return archiveCaseWithHttpInfo(caseId, body).getData();
  }

  /**
   * Archive case.
   *
   * <p>See {@link #archiveCaseWithHttpInfoAsync}.
   *
   * @param caseId Case's UUID or key (required)
   * @param body Archive case payload (required)
   * @return CompletableFuture&lt;CaseResponse&gt;
   */
  public CompletableFuture<CaseResponse> archiveCaseAsync(String caseId, CaseEmptyRequest body) {
    return archiveCaseWithHttpInfoAsync(caseId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Archive case
   *
   * @param caseId Case's UUID or key (required)
   * @param body Archive case payload (required)
   * @return ApiResponse&lt;CaseResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CaseResponse> archiveCaseWithHttpInfo(String caseId, CaseEmptyRequest body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'caseId' is set
    if (caseId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'caseId' when calling archiveCase");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling archiveCase");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/{case_id}/archive"
            .replaceAll("\\{" + "case_id" + "\\}", apiClient.escapeString(caseId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CaseManagementApi.archiveCase",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<CaseResponse>() {});
  }

  /**
   * Archive case.
   *
   * <p>See {@link #archiveCaseWithHttpInfo}.
   *
   * @param caseId Case's UUID or key (required)
   * @param body Archive case payload (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CaseResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CaseResponse>> archiveCaseWithHttpInfoAsync(
      String caseId, CaseEmptyRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'caseId' is set
    if (caseId == null) {
      CompletableFuture<ApiResponse<CaseResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'caseId' when calling archiveCase"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<CaseResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'body' when calling archiveCase"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/{case_id}/archive"
            .replaceAll("\\{" + "case_id" + "\\}", apiClient.escapeString(caseId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CaseManagementApi.archiveCase",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CaseResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<CaseResponse>() {});
  }

  /**
   * Assign case.
   *
   * <p>See {@link #assignCaseWithHttpInfo}.
   *
   * @param caseId Case's UUID or key (required)
   * @param body Assign case payload (required)
   * @return CaseResponse
   * @throws ApiException if fails to make API call
   */
  public CaseResponse assignCase(String caseId, CaseAssignRequest body) throws ApiException {
    return assignCaseWithHttpInfo(caseId, body).getData();
  }

  /**
   * Assign case.
   *
   * <p>See {@link #assignCaseWithHttpInfoAsync}.
   *
   * @param caseId Case's UUID or key (required)
   * @param body Assign case payload (required)
   * @return CompletableFuture&lt;CaseResponse&gt;
   */
  public CompletableFuture<CaseResponse> assignCaseAsync(String caseId, CaseAssignRequest body) {
    return assignCaseWithHttpInfoAsync(caseId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Assign case to a user
   *
   * @param caseId Case's UUID or key (required)
   * @param body Assign case payload (required)
   * @return ApiResponse&lt;CaseResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CaseResponse> assignCaseWithHttpInfo(String caseId, CaseAssignRequest body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'caseId' is set
    if (caseId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'caseId' when calling assignCase");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling assignCase");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/{case_id}/assign"
            .replaceAll("\\{" + "case_id" + "\\}", apiClient.escapeString(caseId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CaseManagementApi.assignCase",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<CaseResponse>() {});
  }

  /**
   * Assign case.
   *
   * <p>See {@link #assignCaseWithHttpInfo}.
   *
   * @param caseId Case's UUID or key (required)
   * @param body Assign case payload (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CaseResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CaseResponse>> assignCaseWithHttpInfoAsync(
      String caseId, CaseAssignRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'caseId' is set
    if (caseId == null) {
      CompletableFuture<ApiResponse<CaseResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'caseId' when calling assignCase"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<CaseResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'body' when calling assignCase"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/{case_id}/assign"
            .replaceAll("\\{" + "case_id" + "\\}", apiClient.escapeString(caseId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CaseManagementApi.assignCase",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CaseResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<CaseResponse>() {});
  }

  /**
   * Bulk update cases.
   *
   * <p>See {@link #bulkUpdateCasesWithHttpInfo}.
   *
   * @param body Case bulk update request payload. (required)
   * @throws ApiException if fails to make API call
   */
  public void bulkUpdateCases(CaseBulkUpdateRequest body) throws ApiException {
    bulkUpdateCasesWithHttpInfo(body);
  }

  /**
   * Bulk update cases.
   *
   * <p>See {@link #bulkUpdateCasesWithHttpInfoAsync}.
   *
   * @param body Case bulk update request payload. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> bulkUpdateCasesAsync(CaseBulkUpdateRequest body) {
    return bulkUpdateCasesWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Applies a single action (such as changing priority, status, assignment, or archiving) to
   * multiple cases at once. The list of case IDs and the action type with its payload are specified
   * in the request body.
   *
   * @param body Case bulk update request payload. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> bulkUpdateCasesWithHttpInfo(CaseBulkUpdateRequest body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling bulkUpdateCases");
    }
    // create path and map variables
    String localVarPath = "/api/v2/cases/bulk";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CaseManagementApi.bulkUpdateCases",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Bulk update cases.
   *
   * <p>See {@link #bulkUpdateCasesWithHttpInfo}.
   *
   * @param body Case bulk update request payload. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> bulkUpdateCasesWithHttpInfoAsync(
      CaseBulkUpdateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling bulkUpdateCases"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/cases/bulk";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CaseManagementApi.bulkUpdateCases",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"*/*"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Comment case.
   *
   * <p>See {@link #commentCaseWithHttpInfo}.
   *
   * @param caseId Case's UUID or key (required)
   * @param body Case comment payload (required)
   * @return TimelineResponse
   * @throws ApiException if fails to make API call
   */
  public TimelineResponse commentCase(String caseId, CaseCommentRequest body) throws ApiException {
    return commentCaseWithHttpInfo(caseId, body).getData();
  }

  /**
   * Comment case.
   *
   * <p>See {@link #commentCaseWithHttpInfoAsync}.
   *
   * @param caseId Case's UUID or key (required)
   * @param body Case comment payload (required)
   * @return CompletableFuture&lt;TimelineResponse&gt;
   */
  public CompletableFuture<TimelineResponse> commentCaseAsync(
      String caseId, CaseCommentRequest body) {
    return commentCaseWithHttpInfoAsync(caseId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Comment case
   *
   * @param caseId Case's UUID or key (required)
   * @param body Case comment payload (required)
   * @return ApiResponse&lt;TimelineResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<TimelineResponse> commentCaseWithHttpInfo(
      String caseId, CaseCommentRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'caseId' is set
    if (caseId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'caseId' when calling commentCase");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling commentCase");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/{case_id}/comment"
            .replaceAll("\\{" + "case_id" + "\\}", apiClient.escapeString(caseId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CaseManagementApi.commentCase",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<TimelineResponse>() {});
  }

  /**
   * Comment case.
   *
   * <p>See {@link #commentCaseWithHttpInfo}.
   *
   * @param caseId Case's UUID or key (required)
   * @param body Case comment payload (required)
   * @return CompletableFuture&lt;ApiResponse&lt;TimelineResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<TimelineResponse>> commentCaseWithHttpInfoAsync(
      String caseId, CaseCommentRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'caseId' is set
    if (caseId == null) {
      CompletableFuture<ApiResponse<TimelineResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'caseId' when calling commentCase"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<TimelineResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'body' when calling commentCase"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/{case_id}/comment"
            .replaceAll("\\{" + "case_id" + "\\}", apiClient.escapeString(caseId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CaseManagementApi.commentCase",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<TimelineResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<TimelineResponse>() {});
  }

  /** Manage optional parameters to countCases. */
  public static class CountCasesOptionalParameters {
    private String queryFilter;
    private String groupBys;
    private Long limit;

    /**
     * Set queryFilter.
     *
     * @param queryFilter Filter query for cases. (optional)
     * @return CountCasesOptionalParameters
     */
    public CountCasesOptionalParameters queryFilter(String queryFilter) {
      this.queryFilter = queryFilter;
      return this;
    }

    /**
     * Set groupBys.
     *
     * @param groupBys Comma-separated fields to group by. (optional)
     * @return CountCasesOptionalParameters
     */
    public CountCasesOptionalParameters groupBys(String groupBys) {
      this.groupBys = groupBys;
      return this;
    }

    /**
     * Set limit.
     *
     * @param limit Maximum facet values to return. (optional)
     * @return CountCasesOptionalParameters
     */
    public CountCasesOptionalParameters limit(Long limit) {
      this.limit = limit;
      return this;
    }
  }

  /**
   * Count cases.
   *
   * <p>See {@link #countCasesWithHttpInfo}.
   *
   * @return CaseCountResponse
   * @throws ApiException if fails to make API call
   */
  public CaseCountResponse countCases() throws ApiException {
    return countCasesWithHttpInfo(new CountCasesOptionalParameters()).getData();
  }

  /**
   * Count cases.
   *
   * <p>See {@link #countCasesWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;CaseCountResponse&gt;
   */
  public CompletableFuture<CaseCountResponse> countCasesAsync() {
    return countCasesWithHttpInfoAsync(new CountCasesOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Count cases.
   *
   * <p>See {@link #countCasesWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CaseCountResponse
   * @throws ApiException if fails to make API call
   */
  public CaseCountResponse countCases(CountCasesOptionalParameters parameters) throws ApiException {
    return countCasesWithHttpInfo(parameters).getData();
  }

  /**
   * Count cases.
   *
   * <p>See {@link #countCasesWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;CaseCountResponse&gt;
   */
  public CompletableFuture<CaseCountResponse> countCasesAsync(
      CountCasesOptionalParameters parameters) {
    return countCasesWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Returns case counts, optionally grouped by one or more fields (for example, status, priority).
   * Supports a query filter to narrow the scope.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;CaseCountResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CaseCountResponse> countCasesWithHttpInfo(
      CountCasesOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    String queryFilter = parameters.queryFilter;
    String groupBys = parameters.groupBys;
    Long limit = parameters.limit;
    // create path and map variables
    String localVarPath = "/api/v2/cases/count";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "query_filter", queryFilter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "group_bys", groupBys));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CaseManagementApi.countCases",
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
        new GenericType<CaseCountResponse>() {});
  }

  /**
   * Count cases.
   *
   * <p>See {@link #countCasesWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;CaseCountResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CaseCountResponse>> countCasesWithHttpInfoAsync(
      CountCasesOptionalParameters parameters) {
    Object localVarPostBody = null;
    String queryFilter = parameters.queryFilter;
    String groupBys = parameters.groupBys;
    Long limit = parameters.limit;
    // create path and map variables
    String localVarPath = "/api/v2/cases/count";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "query_filter", queryFilter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "group_bys", groupBys));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CaseManagementApi.countCases",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CaseCountResponse>> result = new CompletableFuture<>();
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
        new GenericType<CaseCountResponse>() {});
  }

  /**
   * Create a case.
   *
   * <p>See {@link #createCaseWithHttpInfo}.
   *
   * @param body Case payload (required)
   * @return CaseResponse
   * @throws ApiException if fails to make API call
   */
  public CaseResponse createCase(CaseCreateRequest body) throws ApiException {
    return createCaseWithHttpInfo(body).getData();
  }

  /**
   * Create a case.
   *
   * <p>See {@link #createCaseWithHttpInfoAsync}.
   *
   * @param body Case payload (required)
   * @return CompletableFuture&lt;CaseResponse&gt;
   */
  public CompletableFuture<CaseResponse> createCaseAsync(CaseCreateRequest body) {
    return createCaseWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a Case
   *
   * @param body Case payload (required)
   * @return ApiResponse&lt;CaseResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> CREATED </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CaseResponse> createCaseWithHttpInfo(CaseCreateRequest body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createCase");
    }
    // create path and map variables
    String localVarPath = "/api/v2/cases";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CaseManagementApi.createCase",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<CaseResponse>() {});
  }

  /**
   * Create a case.
   *
   * <p>See {@link #createCaseWithHttpInfo}.
   *
   * @param body Case payload (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CaseResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CaseResponse>> createCaseWithHttpInfoAsync(
      CaseCreateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<CaseResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'body' when calling createCase"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/cases";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CaseManagementApi.createCase",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CaseResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<CaseResponse>() {});
  }

  /**
   * Create an automation rule.
   *
   * <p>See {@link #createCaseAutomationRuleWithHttpInfo}.
   *
   * @param projectId The UUID of the project that owns the automation rules. (required)
   * @param body Automation rule payload. (required)
   * @return AutomationRuleResponse
   * @throws ApiException if fails to make API call
   */
  public AutomationRuleResponse createCaseAutomationRule(
      String projectId, AutomationRuleCreateRequest body) throws ApiException {
    return createCaseAutomationRuleWithHttpInfo(projectId, body).getData();
  }

  /**
   * Create an automation rule.
   *
   * <p>See {@link #createCaseAutomationRuleWithHttpInfoAsync}.
   *
   * @param projectId The UUID of the project that owns the automation rules. (required)
   * @param body Automation rule payload. (required)
   * @return CompletableFuture&lt;AutomationRuleResponse&gt;
   */
  public CompletableFuture<AutomationRuleResponse> createCaseAutomationRuleAsync(
      String projectId, AutomationRuleCreateRequest body) {
    return createCaseAutomationRuleWithHttpInfoAsync(projectId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Creates an automation rule for a project. The rule defines a trigger event (for example, case
   * created, status transitioned) and an action to execute.
   *
   * @param projectId The UUID of the project that owns the automation rules. (required)
   * @param body Automation rule payload. (required)
   * @return ApiResponse&lt;AutomationRuleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AutomationRuleResponse> createCaseAutomationRuleWithHttpInfo(
      String projectId, AutomationRuleCreateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'projectId' when calling createCaseAutomationRule");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createCaseAutomationRule");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/projects/{project_id}/rules"
            .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CaseManagementApi.createCaseAutomationRule",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<AutomationRuleResponse>() {});
  }

  /**
   * Create an automation rule.
   *
   * <p>See {@link #createCaseAutomationRuleWithHttpInfo}.
   *
   * @param projectId The UUID of the project that owns the automation rules. (required)
   * @param body Automation rule payload. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AutomationRuleResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AutomationRuleResponse>>
      createCaseAutomationRuleWithHttpInfoAsync(
          String projectId, AutomationRuleCreateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      CompletableFuture<ApiResponse<AutomationRuleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'projectId' when calling createCaseAutomationRule"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<AutomationRuleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createCaseAutomationRule"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/projects/{project_id}/rules"
            .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CaseManagementApi.createCaseAutomationRule",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AutomationRuleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<AutomationRuleResponse>() {});
  }

  /**
   * Create Jira issue for case.
   *
   * <p>See {@link #createCaseJiraIssueWithHttpInfo}.
   *
   * @param caseId Case's UUID or key (required)
   * @param body Jira issue creation request (required)
   * @throws ApiException if fails to make API call
   */
  public void createCaseJiraIssue(String caseId, JiraIssueCreateRequest body) throws ApiException {
    createCaseJiraIssueWithHttpInfo(caseId, body);
  }

  /**
   * Create Jira issue for case.
   *
   * <p>See {@link #createCaseJiraIssueWithHttpInfoAsync}.
   *
   * @param caseId Case's UUID or key (required)
   * @param body Jira issue creation request (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> createCaseJiraIssueAsync(
      String caseId, JiraIssueCreateRequest body) {
    return createCaseJiraIssueWithHttpInfoAsync(caseId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a new Jira issue and link it to a case
   *
   * @param caseId Case's UUID or key (required)
   * @param body Jira issue creation request (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> createCaseJiraIssueWithHttpInfo(
      String caseId, JiraIssueCreateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'caseId' is set
    if (caseId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'caseId' when calling createCaseJiraIssue");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createCaseJiraIssue");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/{case_id}/relationships/jira_issues"
            .replaceAll("\\{" + "case_id" + "\\}", apiClient.escapeString(caseId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CaseManagementApi.createCaseJiraIssue",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Create Jira issue for case.
   *
   * <p>See {@link #createCaseJiraIssueWithHttpInfo}.
   *
   * @param caseId Case's UUID or key (required)
   * @param body Jira issue creation request (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> createCaseJiraIssueWithHttpInfoAsync(
      String caseId, JiraIssueCreateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'caseId' is set
    if (caseId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'caseId' when calling createCaseJiraIssue"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createCaseJiraIssue"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/{case_id}/relationships/jira_issues"
            .replaceAll("\\{" + "case_id" + "\\}", apiClient.escapeString(caseId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CaseManagementApi.createCaseJiraIssue",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"*/*"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Create a case link.
   *
   * <p>See {@link #createCaseLinkWithHttpInfo}.
   *
   * @param body Case link create request. (required)
   * @return CaseLinkResponse
   * @throws ApiException if fails to make API call
   */
  public CaseLinkResponse createCaseLink(CaseLinkCreateRequest body) throws ApiException {
    return createCaseLinkWithHttpInfo(body).getData();
  }

  /**
   * Create a case link.
   *
   * <p>See {@link #createCaseLinkWithHttpInfoAsync}.
   *
   * @param body Case link create request. (required)
   * @return CompletableFuture&lt;CaseLinkResponse&gt;
   */
  public CompletableFuture<CaseLinkResponse> createCaseLinkAsync(CaseLinkCreateRequest body) {
    return createCaseLinkWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Creates a directional link between two cases (for example, case A blocks case B). The parent
   * and child cases and their relationship type must be specified.
   *
   * @param body Case link create request. (required)
   * @return ApiResponse&lt;CaseLinkResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CaseLinkResponse> createCaseLinkWithHttpInfo(CaseLinkCreateRequest body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createCaseLink");
    }
    // create path and map variables
    String localVarPath = "/api/v2/cases/link";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CaseManagementApi.createCaseLink",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<CaseLinkResponse>() {});
  }

  /**
   * Create a case link.
   *
   * <p>See {@link #createCaseLinkWithHttpInfo}.
   *
   * @param body Case link create request. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CaseLinkResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CaseLinkResponse>> createCaseLinkWithHttpInfoAsync(
      CaseLinkCreateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<CaseLinkResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createCaseLink"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/cases/link";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CaseManagementApi.createCaseLink",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CaseLinkResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<CaseLinkResponse>() {});
  }

  /**
   * Create investigation notebook for case.
   *
   * <p>See {@link #createCaseNotebookWithHttpInfo}.
   *
   * @param caseId Case's UUID or key (required)
   * @param body Case investigation notebook creation request. (required)
   * @throws ApiException if fails to make API call
   */
  public void createCaseNotebook(String caseId, CaseInvestigationNotebookCreateRequest body)
      throws ApiException {
    createCaseNotebookWithHttpInfo(caseId, body);
  }

  /**
   * Create investigation notebook for case.
   *
   * <p>See {@link #createCaseNotebookWithHttpInfoAsync}.
   *
   * @param caseId Case's UUID or key (required)
   * @param body Case investigation notebook creation request. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> createCaseNotebookAsync(
      String caseId, CaseInvestigationNotebookCreateRequest body) {
    return createCaseNotebookWithHttpInfoAsync(caseId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a new investigation notebook and link it to a case.
   *
   * @param caseId Case's UUID or key (required)
   * @param body Case investigation notebook creation request. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> createCaseNotebookWithHttpInfo(
      String caseId, CaseInvestigationNotebookCreateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'caseId' is set
    if (caseId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'caseId' when calling createCaseNotebook");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createCaseNotebook");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/{case_id}/relationships/notebook"
            .replaceAll("\\{" + "case_id" + "\\}", apiClient.escapeString(caseId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CaseManagementApi.createCaseNotebook",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Create investigation notebook for case.
   *
   * <p>See {@link #createCaseNotebookWithHttpInfo}.
   *
   * @param caseId Case's UUID or key (required)
   * @param body Case investigation notebook creation request. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> createCaseNotebookWithHttpInfoAsync(
      String caseId, CaseInvestigationNotebookCreateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'caseId' is set
    if (caseId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'caseId' when calling createCaseNotebook"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createCaseNotebook"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/{case_id}/relationships/notebook"
            .replaceAll("\\{" + "case_id" + "\\}", apiClient.escapeString(caseId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CaseManagementApi.createCaseNotebook",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"*/*"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Create ServiceNow ticket for case.
   *
   * <p>See {@link #createCaseServiceNowTicketWithHttpInfo}.
   *
   * @param caseId Case's UUID or key (required)
   * @param body ServiceNow ticket creation request (required)
   * @throws ApiException if fails to make API call
   */
  public void createCaseServiceNowTicket(String caseId, ServiceNowTicketCreateRequest body)
      throws ApiException {
    createCaseServiceNowTicketWithHttpInfo(caseId, body);
  }

  /**
   * Create ServiceNow ticket for case.
   *
   * <p>See {@link #createCaseServiceNowTicketWithHttpInfoAsync}.
   *
   * @param caseId Case's UUID or key (required)
   * @param body ServiceNow ticket creation request (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> createCaseServiceNowTicketAsync(
      String caseId, ServiceNowTicketCreateRequest body) {
    return createCaseServiceNowTicketWithHttpInfoAsync(caseId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a new ServiceNow incident ticket and link it to a case
   *
   * @param caseId Case's UUID or key (required)
   * @param body ServiceNow ticket creation request (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> createCaseServiceNowTicketWithHttpInfo(
      String caseId, ServiceNowTicketCreateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'caseId' is set
    if (caseId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'caseId' when calling createCaseServiceNowTicket");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createCaseServiceNowTicket");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/{case_id}/relationships/servicenow_tickets"
            .replaceAll("\\{" + "case_id" + "\\}", apiClient.escapeString(caseId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CaseManagementApi.createCaseServiceNowTicket",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Create ServiceNow ticket for case.
   *
   * <p>See {@link #createCaseServiceNowTicketWithHttpInfo}.
   *
   * @param caseId Case's UUID or key (required)
   * @param body ServiceNow ticket creation request (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> createCaseServiceNowTicketWithHttpInfoAsync(
      String caseId, ServiceNowTicketCreateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'caseId' is set
    if (caseId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'caseId' when calling createCaseServiceNowTicket"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling createCaseServiceNowTicket"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/{case_id}/relationships/servicenow_tickets"
            .replaceAll("\\{" + "case_id" + "\\}", apiClient.escapeString(caseId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CaseManagementApi.createCaseServiceNowTicket",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"*/*"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Create a case view.
   *
   * <p>See {@link #createCaseViewWithHttpInfo}.
   *
   * @param body Case view payload. (required)
   * @return CaseViewResponse
   * @throws ApiException if fails to make API call
   */
  public CaseViewResponse createCaseView(CaseViewCreateRequest body) throws ApiException {
    return createCaseViewWithHttpInfo(body).getData();
  }

  /**
   * Create a case view.
   *
   * <p>See {@link #createCaseViewWithHttpInfoAsync}.
   *
   * @param body Case view payload. (required)
   * @return CompletableFuture&lt;CaseViewResponse&gt;
   */
  public CompletableFuture<CaseViewResponse> createCaseViewAsync(CaseViewCreateRequest body) {
    return createCaseViewWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Creates a new saved case view with a name, filter query, and associated project. Optionally, a
   * notification rule can be linked to the view.
   *
   * @param body Case view payload. (required)
   * @return ApiResponse&lt;CaseViewResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CaseViewResponse> createCaseViewWithHttpInfo(CaseViewCreateRequest body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createCaseView");
    }
    // create path and map variables
    String localVarPath = "/api/v2/cases/views";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CaseManagementApi.createCaseView",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<CaseViewResponse>() {});
  }

  /**
   * Create a case view.
   *
   * <p>See {@link #createCaseViewWithHttpInfo}.
   *
   * @param body Case view payload. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CaseViewResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CaseViewResponse>> createCaseViewWithHttpInfoAsync(
      CaseViewCreateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<CaseViewResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createCaseView"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/cases/views";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CaseManagementApi.createCaseView",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CaseViewResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<CaseViewResponse>() {});
  }

  /**
   * Create a maintenance window.
   *
   * <p>See {@link #createMaintenanceWindowWithHttpInfo}.
   *
   * @param body Maintenance window payload. (required)
   * @return MaintenanceWindowResponse
   * @throws ApiException if fails to make API call
   */
  public MaintenanceWindowResponse createMaintenanceWindow(MaintenanceWindowCreateRequest body)
      throws ApiException {
    return createMaintenanceWindowWithHttpInfo(body).getData();
  }

  /**
   * Create a maintenance window.
   *
   * <p>See {@link #createMaintenanceWindowWithHttpInfoAsync}.
   *
   * @param body Maintenance window payload. (required)
   * @return CompletableFuture&lt;MaintenanceWindowResponse&gt;
   */
  public CompletableFuture<MaintenanceWindowResponse> createMaintenanceWindowAsync(
      MaintenanceWindowCreateRequest body) {
    return createMaintenanceWindowWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Creates a maintenance window for event management cases with a name, case filter query, and
   * time range (start and end).
   *
   * @param body Maintenance window payload. (required)
   * @return ApiResponse&lt;MaintenanceWindowResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<MaintenanceWindowResponse> createMaintenanceWindowWithHttpInfo(
      MaintenanceWindowCreateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createMaintenanceWindow");
    }
    // create path and map variables
    String localVarPath = "/api/v2/maintenance_windows";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CaseManagementApi.createMaintenanceWindow",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<MaintenanceWindowResponse>() {});
  }

  /**
   * Create a maintenance window.
   *
   * <p>See {@link #createMaintenanceWindowWithHttpInfo}.
   *
   * @param body Maintenance window payload. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;MaintenanceWindowResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<MaintenanceWindowResponse>>
      createMaintenanceWindowWithHttpInfoAsync(MaintenanceWindowCreateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<MaintenanceWindowResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createMaintenanceWindow"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/maintenance_windows";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CaseManagementApi.createMaintenanceWindow",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<MaintenanceWindowResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<MaintenanceWindowResponse>() {});
  }

  /**
   * Create a project.
   *
   * <p>See {@link #createProjectWithHttpInfo}.
   *
   * @param body Project payload. (required)
   * @return ProjectResponse
   * @throws ApiException if fails to make API call
   */
  public ProjectResponse createProject(ProjectCreateRequest body) throws ApiException {
    return createProjectWithHttpInfo(body).getData();
  }

  /**
   * Create a project.
   *
   * <p>See {@link #createProjectWithHttpInfoAsync}.
   *
   * @param body Project payload. (required)
   * @return CompletableFuture&lt;ProjectResponse&gt;
   */
  public CompletableFuture<ProjectResponse> createProjectAsync(ProjectCreateRequest body) {
    return createProjectWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a project.
   *
   * @param body Project payload. (required)
   * @return ApiResponse&lt;ProjectResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> CREATED </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ProjectResponse> createProjectWithHttpInfo(ProjectCreateRequest body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createProject");
    }
    // create path and map variables
    String localVarPath = "/api/v2/cases/projects";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CaseManagementApi.createProject",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<ProjectResponse>() {});
  }

  /**
   * Create a project.
   *
   * <p>See {@link #createProjectWithHttpInfo}.
   *
   * @param body Project payload. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ProjectResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ProjectResponse>> createProjectWithHttpInfoAsync(
      ProjectCreateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<ProjectResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createProject"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/cases/projects";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CaseManagementApi.createProject",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ProjectResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<ProjectResponse>() {});
  }

  /**
   * Create a notification rule.
   *
   * <p>See {@link #createProjectNotificationRuleWithHttpInfo}.
   *
   * @param projectId Project UUID (required)
   * @param body Notification rule payload (required)
   * @return CaseNotificationRuleResponse
   * @throws ApiException if fails to make API call
   */
  public CaseNotificationRuleResponse createProjectNotificationRule(
      String projectId, CaseNotificationRuleCreateRequest body) throws ApiException {
    return createProjectNotificationRuleWithHttpInfo(projectId, body).getData();
  }

  /**
   * Create a notification rule.
   *
   * <p>See {@link #createProjectNotificationRuleWithHttpInfoAsync}.
   *
   * @param projectId Project UUID (required)
   * @param body Notification rule payload (required)
   * @return CompletableFuture&lt;CaseNotificationRuleResponse&gt;
   */
  public CompletableFuture<CaseNotificationRuleResponse> createProjectNotificationRuleAsync(
      String projectId, CaseNotificationRuleCreateRequest body) {
    return createProjectNotificationRuleWithHttpInfoAsync(projectId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a notification rule for a project.
   *
   * @param projectId Project UUID (required)
   * @param body Notification rule payload (required)
   * @return ApiResponse&lt;CaseNotificationRuleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> CREATED </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CaseNotificationRuleResponse> createProjectNotificationRuleWithHttpInfo(
      String projectId, CaseNotificationRuleCreateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'projectId' when calling createProjectNotificationRule");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createProjectNotificationRule");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/projects/{project_id}/notification_rules"
            .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CaseManagementApi.createProjectNotificationRule",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<CaseNotificationRuleResponse>() {});
  }

  /**
   * Create a notification rule.
   *
   * <p>See {@link #createProjectNotificationRuleWithHttpInfo}.
   *
   * @param projectId Project UUID (required)
   * @param body Notification rule payload (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CaseNotificationRuleResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CaseNotificationRuleResponse>>
      createProjectNotificationRuleWithHttpInfoAsync(
          String projectId, CaseNotificationRuleCreateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      CompletableFuture<ApiResponse<CaseNotificationRuleResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'projectId' when calling"
                  + " createProjectNotificationRule"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<CaseNotificationRuleResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling createProjectNotificationRule"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/projects/{project_id}/notification_rules"
            .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CaseManagementApi.createProjectNotificationRule",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CaseNotificationRuleResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<CaseNotificationRuleResponse>() {});
  }

  /**
   * Delete an automation rule.
   *
   * <p>See {@link #deleteCaseAutomationRuleWithHttpInfo}.
   *
   * @param projectId The UUID of the project that owns the automation rules. (required)
   * @param ruleId The UUID of the automation rule. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteCaseAutomationRule(String projectId, String ruleId) throws ApiException {
    deleteCaseAutomationRuleWithHttpInfo(projectId, ruleId);
  }

  /**
   * Delete an automation rule.
   *
   * <p>See {@link #deleteCaseAutomationRuleWithHttpInfoAsync}.
   *
   * @param projectId The UUID of the project that owns the automation rules. (required)
   * @param ruleId The UUID of the automation rule. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteCaseAutomationRuleAsync(String projectId, String ruleId) {
    return deleteCaseAutomationRuleWithHttpInfoAsync(projectId, ruleId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Permanently deletes an automation rule from a project.
   *
   * @param projectId The UUID of the project that owns the automation rules. (required)
   * @param ruleId The UUID of the automation rule. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteCaseAutomationRuleWithHttpInfo(String projectId, String ruleId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'projectId' when calling deleteCaseAutomationRule");
    }

    // verify the required parameter 'ruleId' is set
    if (ruleId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'ruleId' when calling deleteCaseAutomationRule");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/projects/{project_id}/rules/{rule_id}"
            .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()))
            .replaceAll("\\{" + "rule_id" + "\\}", apiClient.escapeString(ruleId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CaseManagementApi.deleteCaseAutomationRule",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Delete an automation rule.
   *
   * <p>See {@link #deleteCaseAutomationRuleWithHttpInfo}.
   *
   * @param projectId The UUID of the project that owns the automation rules. (required)
   * @param ruleId The UUID of the automation rule. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteCaseAutomationRuleWithHttpInfoAsync(
      String projectId, String ruleId) {
    Object localVarPostBody = null;

    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'projectId' when calling deleteCaseAutomationRule"));
      return result;
    }

    // verify the required parameter 'ruleId' is set
    if (ruleId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'ruleId' when calling deleteCaseAutomationRule"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/projects/{project_id}/rules/{rule_id}"
            .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()))
            .replaceAll("\\{" + "rule_id" + "\\}", apiClient.escapeString(ruleId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CaseManagementApi.deleteCaseAutomationRule",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"*/*"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Delete case comment.
   *
   * <p>See {@link #deleteCaseCommentWithHttpInfo}.
   *
   * @param caseId Case's UUID or key (required)
   * @param cellId The UUID of the timeline cell (comment) to update. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteCaseComment(String caseId, String cellId) throws ApiException {
    deleteCaseCommentWithHttpInfo(caseId, cellId);
  }

  /**
   * Delete case comment.
   *
   * <p>See {@link #deleteCaseCommentWithHttpInfoAsync}.
   *
   * @param caseId Case's UUID or key (required)
   * @param cellId The UUID of the timeline cell (comment) to update. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteCaseCommentAsync(String caseId, String cellId) {
    return deleteCaseCommentWithHttpInfoAsync(caseId, cellId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete case comment
   *
   * @param caseId Case's UUID or key (required)
   * @param cellId The UUID of the timeline cell (comment) to update. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteCaseCommentWithHttpInfo(String caseId, String cellId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'caseId' is set
    if (caseId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'caseId' when calling deleteCaseComment");
    }

    // verify the required parameter 'cellId' is set
    if (cellId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'cellId' when calling deleteCaseComment");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/{case_id}/comment/{cell_id}"
            .replaceAll("\\{" + "case_id" + "\\}", apiClient.escapeString(caseId.toString()))
            .replaceAll("\\{" + "cell_id" + "\\}", apiClient.escapeString(cellId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CaseManagementApi.deleteCaseComment",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Delete case comment.
   *
   * <p>See {@link #deleteCaseCommentWithHttpInfo}.
   *
   * @param caseId Case's UUID or key (required)
   * @param cellId The UUID of the timeline cell (comment) to update. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteCaseCommentWithHttpInfoAsync(
      String caseId, String cellId) {
    Object localVarPostBody = null;

    // verify the required parameter 'caseId' is set
    if (caseId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'caseId' when calling deleteCaseComment"));
      return result;
    }

    // verify the required parameter 'cellId' is set
    if (cellId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'cellId' when calling deleteCaseComment"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/{case_id}/comment/{cell_id}"
            .replaceAll("\\{" + "case_id" + "\\}", apiClient.escapeString(caseId.toString()))
            .replaceAll("\\{" + "cell_id" + "\\}", apiClient.escapeString(cellId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CaseManagementApi.deleteCaseComment",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"*/*"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Delete custom attribute from case.
   *
   * <p>See {@link #deleteCaseCustomAttributeWithHttpInfo}.
   *
   * @param caseId Case's UUID or key (required)
   * @param customAttributeKey Case Custom attribute's key (required)
   * @return CaseResponse
   * @throws ApiException if fails to make API call
   */
  public CaseResponse deleteCaseCustomAttribute(String caseId, String customAttributeKey)
      throws ApiException {
    return deleteCaseCustomAttributeWithHttpInfo(caseId, customAttributeKey).getData();
  }

  /**
   * Delete custom attribute from case.
   *
   * <p>See {@link #deleteCaseCustomAttributeWithHttpInfoAsync}.
   *
   * @param caseId Case's UUID or key (required)
   * @param customAttributeKey Case Custom attribute's key (required)
   * @return CompletableFuture&lt;CaseResponse&gt;
   */
  public CompletableFuture<CaseResponse> deleteCaseCustomAttributeAsync(
      String caseId, String customAttributeKey) {
    return deleteCaseCustomAttributeWithHttpInfoAsync(caseId, customAttributeKey)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete custom attribute from case
   *
   * @param caseId Case's UUID or key (required)
   * @param customAttributeKey Case Custom attribute's key (required)
   * @return ApiResponse&lt;CaseResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CaseResponse> deleteCaseCustomAttributeWithHttpInfo(
      String caseId, String customAttributeKey) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'caseId' is set
    if (caseId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'caseId' when calling deleteCaseCustomAttribute");
    }

    // verify the required parameter 'customAttributeKey' is set
    if (customAttributeKey == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'customAttributeKey' when calling"
              + " deleteCaseCustomAttribute");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/{case_id}/custom_attributes/{custom_attribute_key}"
            .replaceAll("\\{" + "case_id" + "\\}", apiClient.escapeString(caseId.toString()))
            .replaceAll(
                "\\{" + "custom_attribute_key" + "\\}",
                apiClient.escapeString(customAttributeKey.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CaseManagementApi.deleteCaseCustomAttribute",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<CaseResponse>() {});
  }

  /**
   * Delete custom attribute from case.
   *
   * <p>See {@link #deleteCaseCustomAttributeWithHttpInfo}.
   *
   * @param caseId Case's UUID or key (required)
   * @param customAttributeKey Case Custom attribute's key (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CaseResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CaseResponse>> deleteCaseCustomAttributeWithHttpInfoAsync(
      String caseId, String customAttributeKey) {
    Object localVarPostBody = null;

    // verify the required parameter 'caseId' is set
    if (caseId == null) {
      CompletableFuture<ApiResponse<CaseResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'caseId' when calling deleteCaseCustomAttribute"));
      return result;
    }

    // verify the required parameter 'customAttributeKey' is set
    if (customAttributeKey == null) {
      CompletableFuture<ApiResponse<CaseResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'customAttributeKey' when calling"
                  + " deleteCaseCustomAttribute"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/{case_id}/custom_attributes/{custom_attribute_key}"
            .replaceAll("\\{" + "case_id" + "\\}", apiClient.escapeString(caseId.toString()))
            .replaceAll(
                "\\{" + "custom_attribute_key" + "\\}",
                apiClient.escapeString(customAttributeKey.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CaseManagementApi.deleteCaseCustomAttribute",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CaseResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<CaseResponse>() {});
  }

  /**
   * Delete a case link.
   *
   * <p>See {@link #deleteCaseLinkWithHttpInfo}.
   *
   * @param linkId The UUID of the case link. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteCaseLink(String linkId) throws ApiException {
    deleteCaseLinkWithHttpInfo(linkId);
  }

  /**
   * Delete a case link.
   *
   * <p>See {@link #deleteCaseLinkWithHttpInfoAsync}.
   *
   * @param linkId The UUID of the case link. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteCaseLinkAsync(String linkId) {
    return deleteCaseLinkWithHttpInfoAsync(linkId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Deletes an existing link between cases by link ID.
   *
   * @param linkId The UUID of the case link. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteCaseLinkWithHttpInfo(String linkId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'linkId' is set
    if (linkId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'linkId' when calling deleteCaseLink");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/link/{link_id}"
            .replaceAll("\\{" + "link_id" + "\\}", apiClient.escapeString(linkId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CaseManagementApi.deleteCaseLink",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Delete a case link.
   *
   * <p>See {@link #deleteCaseLinkWithHttpInfo}.
   *
   * @param linkId The UUID of the case link. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteCaseLinkWithHttpInfoAsync(String linkId) {
    Object localVarPostBody = null;

    // verify the required parameter 'linkId' is set
    if (linkId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'linkId' when calling deleteCaseLink"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/link/{link_id}"
            .replaceAll("\\{" + "link_id" + "\\}", apiClient.escapeString(linkId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CaseManagementApi.deleteCaseLink",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"*/*"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Delete a case view.
   *
   * <p>See {@link #deleteCaseViewWithHttpInfo}.
   *
   * @param viewId The UUID of the case view. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteCaseView(String viewId) throws ApiException {
    deleteCaseViewWithHttpInfo(viewId);
  }

  /**
   * Delete a case view.
   *
   * <p>See {@link #deleteCaseViewWithHttpInfoAsync}.
   *
   * @param viewId The UUID of the case view. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteCaseViewAsync(String viewId) {
    return deleteCaseViewWithHttpInfoAsync(viewId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Permanently deletes a saved case view.
   *
   * @param viewId The UUID of the case view. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteCaseViewWithHttpInfo(String viewId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'viewId' is set
    if (viewId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'viewId' when calling deleteCaseView");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/views/{view_id}"
            .replaceAll("\\{" + "view_id" + "\\}", apiClient.escapeString(viewId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CaseManagementApi.deleteCaseView",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Delete a case view.
   *
   * <p>See {@link #deleteCaseViewWithHttpInfo}.
   *
   * @param viewId The UUID of the case view. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteCaseViewWithHttpInfoAsync(String viewId) {
    Object localVarPostBody = null;

    // verify the required parameter 'viewId' is set
    if (viewId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'viewId' when calling deleteCaseView"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/views/{view_id}"
            .replaceAll("\\{" + "view_id" + "\\}", apiClient.escapeString(viewId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CaseManagementApi.deleteCaseView",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"*/*"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Delete a maintenance window.
   *
   * <p>See {@link #deleteMaintenanceWindowWithHttpInfo}.
   *
   * @param maintenanceWindowId The UUID of the maintenance window. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteMaintenanceWindow(String maintenanceWindowId) throws ApiException {
    deleteMaintenanceWindowWithHttpInfo(maintenanceWindowId);
  }

  /**
   * Delete a maintenance window.
   *
   * <p>See {@link #deleteMaintenanceWindowWithHttpInfoAsync}.
   *
   * @param maintenanceWindowId The UUID of the maintenance window. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteMaintenanceWindowAsync(String maintenanceWindowId) {
    return deleteMaintenanceWindowWithHttpInfoAsync(maintenanceWindowId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Permanently deletes a maintenance window.
   *
   * @param maintenanceWindowId The UUID of the maintenance window. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteMaintenanceWindowWithHttpInfo(String maintenanceWindowId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'maintenanceWindowId' is set
    if (maintenanceWindowId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'maintenanceWindowId' when calling"
              + " deleteMaintenanceWindow");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/maintenance_windows/{maintenance_window_id}"
            .replaceAll(
                "\\{" + "maintenance_window_id" + "\\}",
                apiClient.escapeString(maintenanceWindowId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CaseManagementApi.deleteMaintenanceWindow",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Delete a maintenance window.
   *
   * <p>See {@link #deleteMaintenanceWindowWithHttpInfo}.
   *
   * @param maintenanceWindowId The UUID of the maintenance window. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteMaintenanceWindowWithHttpInfoAsync(
      String maintenanceWindowId) {
    Object localVarPostBody = null;

    // verify the required parameter 'maintenanceWindowId' is set
    if (maintenanceWindowId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'maintenanceWindowId' when calling"
                  + " deleteMaintenanceWindow"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/maintenance_windows/{maintenance_window_id}"
            .replaceAll(
                "\\{" + "maintenance_window_id" + "\\}",
                apiClient.escapeString(maintenanceWindowId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CaseManagementApi.deleteMaintenanceWindow",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"*/*"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Remove a project.
   *
   * <p>See {@link #deleteProjectWithHttpInfo}.
   *
   * @param projectId Project UUID. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteProject(String projectId) throws ApiException {
    deleteProjectWithHttpInfo(projectId);
  }

  /**
   * Remove a project.
   *
   * <p>See {@link #deleteProjectWithHttpInfoAsync}.
   *
   * @param projectId Project UUID. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteProjectAsync(String projectId) {
    return deleteProjectWithHttpInfoAsync(projectId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Remove a project using the project's <code>id</code>.
   *
   * @param projectId Project UUID. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> API error response </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteProjectWithHttpInfo(String projectId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'projectId' when calling deleteProject");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/projects/{project_id}"
            .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CaseManagementApi.deleteProject",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Remove a project.
   *
   * <p>See {@link #deleteProjectWithHttpInfo}.
   *
   * @param projectId Project UUID. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteProjectWithHttpInfoAsync(String projectId) {
    Object localVarPostBody = null;

    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'projectId' when calling deleteProject"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/projects/{project_id}"
            .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CaseManagementApi.deleteProject",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"*/*"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Delete a notification rule.
   *
   * <p>See {@link #deleteProjectNotificationRuleWithHttpInfo}.
   *
   * @param projectId Project UUID (required)
   * @param notificationRuleId Notification Rule UUID (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteProjectNotificationRule(String projectId, String notificationRuleId)
      throws ApiException {
    deleteProjectNotificationRuleWithHttpInfo(projectId, notificationRuleId);
  }

  /**
   * Delete a notification rule.
   *
   * <p>See {@link #deleteProjectNotificationRuleWithHttpInfoAsync}.
   *
   * @param projectId Project UUID (required)
   * @param notificationRuleId Notification Rule UUID (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteProjectNotificationRuleAsync(
      String projectId, String notificationRuleId) {
    return deleteProjectNotificationRuleWithHttpInfoAsync(projectId, notificationRuleId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete a notification rule using the notification rule's <code>id</code>.
   *
   * @param projectId Project UUID (required)
   * @param notificationRuleId Notification Rule UUID (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> API error response </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteProjectNotificationRuleWithHttpInfo(
      String projectId, String notificationRuleId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'projectId' when calling deleteProjectNotificationRule");
    }

    // verify the required parameter 'notificationRuleId' is set
    if (notificationRuleId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'notificationRuleId' when calling"
              + " deleteProjectNotificationRule");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/projects/{project_id}/notification_rules/{notification_rule_id}"
            .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()))
            .replaceAll(
                "\\{" + "notification_rule_id" + "\\}",
                apiClient.escapeString(notificationRuleId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CaseManagementApi.deleteProjectNotificationRule",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Delete a notification rule.
   *
   * <p>See {@link #deleteProjectNotificationRuleWithHttpInfo}.
   *
   * @param projectId Project UUID (required)
   * @param notificationRuleId Notification Rule UUID (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteProjectNotificationRuleWithHttpInfoAsync(
      String projectId, String notificationRuleId) {
    Object localVarPostBody = null;

    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'projectId' when calling"
                  + " deleteProjectNotificationRule"));
      return result;
    }

    // verify the required parameter 'notificationRuleId' is set
    if (notificationRuleId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'notificationRuleId' when calling"
                  + " deleteProjectNotificationRule"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/projects/{project_id}/notification_rules/{notification_rule_id}"
            .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()))
            .replaceAll(
                "\\{" + "notification_rule_id" + "\\}",
                apiClient.escapeString(notificationRuleId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CaseManagementApi.deleteProjectNotificationRule",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"*/*"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Disable an automation rule.
   *
   * <p>See {@link #disableCaseAutomationRuleWithHttpInfo}.
   *
   * @param projectId The UUID of the project that owns the automation rules. (required)
   * @param ruleId The UUID of the automation rule. (required)
   * @return AutomationRuleResponse
   * @throws ApiException if fails to make API call
   */
  public AutomationRuleResponse disableCaseAutomationRule(String projectId, String ruleId)
      throws ApiException {
    return disableCaseAutomationRuleWithHttpInfo(projectId, ruleId).getData();
  }

  /**
   * Disable an automation rule.
   *
   * <p>See {@link #disableCaseAutomationRuleWithHttpInfoAsync}.
   *
   * @param projectId The UUID of the project that owns the automation rules. (required)
   * @param ruleId The UUID of the automation rule. (required)
   * @return CompletableFuture&lt;AutomationRuleResponse&gt;
   */
  public CompletableFuture<AutomationRuleResponse> disableCaseAutomationRuleAsync(
      String projectId, String ruleId) {
    return disableCaseAutomationRuleWithHttpInfoAsync(projectId, ruleId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Disables an automation rule so it no longer triggers on case events. The rule configuration is
   * preserved.
   *
   * @param projectId The UUID of the project that owns the automation rules. (required)
   * @param ruleId The UUID of the automation rule. (required)
   * @return ApiResponse&lt;AutomationRuleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AutomationRuleResponse> disableCaseAutomationRuleWithHttpInfo(
      String projectId, String ruleId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'projectId' when calling disableCaseAutomationRule");
    }

    // verify the required parameter 'ruleId' is set
    if (ruleId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'ruleId' when calling disableCaseAutomationRule");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/projects/{project_id}/rules/{rule_id}/disable"
            .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()))
            .replaceAll("\\{" + "rule_id" + "\\}", apiClient.escapeString(ruleId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CaseManagementApi.disableCaseAutomationRule",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<AutomationRuleResponse>() {});
  }

  /**
   * Disable an automation rule.
   *
   * <p>See {@link #disableCaseAutomationRuleWithHttpInfo}.
   *
   * @param projectId The UUID of the project that owns the automation rules. (required)
   * @param ruleId The UUID of the automation rule. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AutomationRuleResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AutomationRuleResponse>>
      disableCaseAutomationRuleWithHttpInfoAsync(String projectId, String ruleId) {
    Object localVarPostBody = null;

    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      CompletableFuture<ApiResponse<AutomationRuleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'projectId' when calling disableCaseAutomationRule"));
      return result;
    }

    // verify the required parameter 'ruleId' is set
    if (ruleId == null) {
      CompletableFuture<ApiResponse<AutomationRuleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'ruleId' when calling disableCaseAutomationRule"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/projects/{project_id}/rules/{rule_id}/disable"
            .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()))
            .replaceAll("\\{" + "rule_id" + "\\}", apiClient.escapeString(ruleId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CaseManagementApi.disableCaseAutomationRule",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AutomationRuleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<AutomationRuleResponse>() {});
  }

  /**
   * Enable an automation rule.
   *
   * <p>See {@link #enableCaseAutomationRuleWithHttpInfo}.
   *
   * @param projectId The UUID of the project that owns the automation rules. (required)
   * @param ruleId The UUID of the automation rule. (required)
   * @return AutomationRuleResponse
   * @throws ApiException if fails to make API call
   */
  public AutomationRuleResponse enableCaseAutomationRule(String projectId, String ruleId)
      throws ApiException {
    return enableCaseAutomationRuleWithHttpInfo(projectId, ruleId).getData();
  }

  /**
   * Enable an automation rule.
   *
   * <p>See {@link #enableCaseAutomationRuleWithHttpInfoAsync}.
   *
   * @param projectId The UUID of the project that owns the automation rules. (required)
   * @param ruleId The UUID of the automation rule. (required)
   * @return CompletableFuture&lt;AutomationRuleResponse&gt;
   */
  public CompletableFuture<AutomationRuleResponse> enableCaseAutomationRuleAsync(
      String projectId, String ruleId) {
    return enableCaseAutomationRuleWithHttpInfoAsync(projectId, ruleId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Enables a previously disabled automation rule so it triggers on matching case events.
   *
   * @param projectId The UUID of the project that owns the automation rules. (required)
   * @param ruleId The UUID of the automation rule. (required)
   * @return ApiResponse&lt;AutomationRuleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AutomationRuleResponse> enableCaseAutomationRuleWithHttpInfo(
      String projectId, String ruleId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'projectId' when calling enableCaseAutomationRule");
    }

    // verify the required parameter 'ruleId' is set
    if (ruleId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'ruleId' when calling enableCaseAutomationRule");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/projects/{project_id}/rules/{rule_id}/enable"
            .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()))
            .replaceAll("\\{" + "rule_id" + "\\}", apiClient.escapeString(ruleId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CaseManagementApi.enableCaseAutomationRule",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<AutomationRuleResponse>() {});
  }

  /**
   * Enable an automation rule.
   *
   * <p>See {@link #enableCaseAutomationRuleWithHttpInfo}.
   *
   * @param projectId The UUID of the project that owns the automation rules. (required)
   * @param ruleId The UUID of the automation rule. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AutomationRuleResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AutomationRuleResponse>>
      enableCaseAutomationRuleWithHttpInfoAsync(String projectId, String ruleId) {
    Object localVarPostBody = null;

    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      CompletableFuture<ApiResponse<AutomationRuleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'projectId' when calling enableCaseAutomationRule"));
      return result;
    }

    // verify the required parameter 'ruleId' is set
    if (ruleId == null) {
      CompletableFuture<ApiResponse<AutomationRuleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'ruleId' when calling enableCaseAutomationRule"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/projects/{project_id}/rules/{rule_id}/enable"
            .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()))
            .replaceAll("\\{" + "rule_id" + "\\}", apiClient.escapeString(ruleId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CaseManagementApi.enableCaseAutomationRule",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AutomationRuleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<AutomationRuleResponse>() {});
  }

  /**
   * Favorite a project.
   *
   * <p>See {@link #favoriteCaseProjectWithHttpInfo}.
   *
   * @param projectId Project UUID. (required)
   * @throws ApiException if fails to make API call
   */
  public void favoriteCaseProject(String projectId) throws ApiException {
    favoriteCaseProjectWithHttpInfo(projectId);
  }

  /**
   * Favorite a project.
   *
   * <p>See {@link #favoriteCaseProjectWithHttpInfoAsync}.
   *
   * @param projectId Project UUID. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> favoriteCaseProjectAsync(String projectId) {
    return favoriteCaseProjectWithHttpInfoAsync(projectId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Marks a case project as a favorite for the current authenticated user.
   *
   * @param projectId Project UUID. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> favoriteCaseProjectWithHttpInfo(String projectId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'projectId' when calling favoriteCaseProject");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/projects/{project_id}/favorites"
            .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CaseManagementApi.favoriteCaseProject",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Favorite a project.
   *
   * <p>See {@link #favoriteCaseProjectWithHttpInfo}.
   *
   * @param projectId Project UUID. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> favoriteCaseProjectWithHttpInfoAsync(
      String projectId) {
    Object localVarPostBody = null;

    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'projectId' when calling favoriteCaseProject"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/projects/{project_id}/favorites"
            .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CaseManagementApi.favoriteCaseProject",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"*/*"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Get the details of a case.
   *
   * <p>See {@link #getCaseWithHttpInfo}.
   *
   * @param caseId Case's UUID or key (required)
   * @return CaseResponse
   * @throws ApiException if fails to make API call
   */
  public CaseResponse getCase(String caseId) throws ApiException {
    return getCaseWithHttpInfo(caseId).getData();
  }

  /**
   * Get the details of a case.
   *
   * <p>See {@link #getCaseWithHttpInfoAsync}.
   *
   * @param caseId Case's UUID or key (required)
   * @return CompletableFuture&lt;CaseResponse&gt;
   */
  public CompletableFuture<CaseResponse> getCaseAsync(String caseId) {
    return getCaseWithHttpInfoAsync(caseId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the details of case by <code>case_id</code>
   *
   * @param caseId Case's UUID or key (required)
   * @return ApiResponse&lt;CaseResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CaseResponse> getCaseWithHttpInfo(String caseId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'caseId' is set
    if (caseId == null) {
      throw new ApiException(400, "Missing the required parameter 'caseId' when calling getCase");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/{case_id}"
            .replaceAll("\\{" + "case_id" + "\\}", apiClient.escapeString(caseId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CaseManagementApi.getCase",
            localVarPath,
            new ArrayList<Pair>(),
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
        new GenericType<CaseResponse>() {});
  }

  /**
   * Get the details of a case.
   *
   * <p>See {@link #getCaseWithHttpInfo}.
   *
   * @param caseId Case's UUID or key (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CaseResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CaseResponse>> getCaseWithHttpInfoAsync(String caseId) {
    Object localVarPostBody = null;

    // verify the required parameter 'caseId' is set
    if (caseId == null) {
      CompletableFuture<ApiResponse<CaseResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'caseId' when calling getCase"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/{case_id}"
            .replaceAll("\\{" + "case_id" + "\\}", apiClient.escapeString(caseId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CaseManagementApi.getCase",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CaseResponse>> result = new CompletableFuture<>();
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
        new GenericType<CaseResponse>() {});
  }

  /**
   * Get an automation rule.
   *
   * <p>See {@link #getCaseAutomationRuleWithHttpInfo}.
   *
   * @param projectId The UUID of the project that owns the automation rules. (required)
   * @param ruleId The UUID of the automation rule. (required)
   * @return AutomationRuleResponse
   * @throws ApiException if fails to make API call
   */
  public AutomationRuleResponse getCaseAutomationRule(String projectId, String ruleId)
      throws ApiException {
    return getCaseAutomationRuleWithHttpInfo(projectId, ruleId).getData();
  }

  /**
   * Get an automation rule.
   *
   * <p>See {@link #getCaseAutomationRuleWithHttpInfoAsync}.
   *
   * @param projectId The UUID of the project that owns the automation rules. (required)
   * @param ruleId The UUID of the automation rule. (required)
   * @return CompletableFuture&lt;AutomationRuleResponse&gt;
   */
  public CompletableFuture<AutomationRuleResponse> getCaseAutomationRuleAsync(
      String projectId, String ruleId) {
    return getCaseAutomationRuleWithHttpInfoAsync(projectId, ruleId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Returns a single automation rule identified by its UUID, including its trigger, action, and
   * current state (enabled/disabled).
   *
   * @param projectId The UUID of the project that owns the automation rules. (required)
   * @param ruleId The UUID of the automation rule. (required)
   * @return ApiResponse&lt;AutomationRuleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AutomationRuleResponse> getCaseAutomationRuleWithHttpInfo(
      String projectId, String ruleId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'projectId' when calling getCaseAutomationRule");
    }

    // verify the required parameter 'ruleId' is set
    if (ruleId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'ruleId' when calling getCaseAutomationRule");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/projects/{project_id}/rules/{rule_id}"
            .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()))
            .replaceAll("\\{" + "rule_id" + "\\}", apiClient.escapeString(ruleId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CaseManagementApi.getCaseAutomationRule",
            localVarPath,
            new ArrayList<Pair>(),
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
        new GenericType<AutomationRuleResponse>() {});
  }

  /**
   * Get an automation rule.
   *
   * <p>See {@link #getCaseAutomationRuleWithHttpInfo}.
   *
   * @param projectId The UUID of the project that owns the automation rules. (required)
   * @param ruleId The UUID of the automation rule. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AutomationRuleResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AutomationRuleResponse>>
      getCaseAutomationRuleWithHttpInfoAsync(String projectId, String ruleId) {
    Object localVarPostBody = null;

    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      CompletableFuture<ApiResponse<AutomationRuleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'projectId' when calling getCaseAutomationRule"));
      return result;
    }

    // verify the required parameter 'ruleId' is set
    if (ruleId == null) {
      CompletableFuture<ApiResponse<AutomationRuleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'ruleId' when calling getCaseAutomationRule"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/projects/{project_id}/rules/{rule_id}"
            .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()))
            .replaceAll("\\{" + "rule_id" + "\\}", apiClient.escapeString(ruleId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CaseManagementApi.getCaseAutomationRule",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AutomationRuleResponse>> result = new CompletableFuture<>();
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
        new GenericType<AutomationRuleResponse>() {});
  }

  /**
   * Get a case view.
   *
   * <p>See {@link #getCaseViewWithHttpInfo}.
   *
   * @param viewId The UUID of the case view. (required)
   * @return CaseViewResponse
   * @throws ApiException if fails to make API call
   */
  public CaseViewResponse getCaseView(String viewId) throws ApiException {
    return getCaseViewWithHttpInfo(viewId).getData();
  }

  /**
   * Get a case view.
   *
   * <p>See {@link #getCaseViewWithHttpInfoAsync}.
   *
   * @param viewId The UUID of the case view. (required)
   * @return CompletableFuture&lt;CaseViewResponse&gt;
   */
  public CompletableFuture<CaseViewResponse> getCaseViewAsync(String viewId) {
    return getCaseViewWithHttpInfoAsync(viewId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Returns a single saved case view identified by its UUID, including its query, associated
   * project, and timestamps.
   *
   * @param viewId The UUID of the case view. (required)
   * @return ApiResponse&lt;CaseViewResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CaseViewResponse> getCaseViewWithHttpInfo(String viewId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'viewId' is set
    if (viewId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'viewId' when calling getCaseView");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/views/{view_id}"
            .replaceAll("\\{" + "view_id" + "\\}", apiClient.escapeString(viewId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CaseManagementApi.getCaseView",
            localVarPath,
            new ArrayList<Pair>(),
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
        new GenericType<CaseViewResponse>() {});
  }

  /**
   * Get a case view.
   *
   * <p>See {@link #getCaseViewWithHttpInfo}.
   *
   * @param viewId The UUID of the case view. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CaseViewResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CaseViewResponse>> getCaseViewWithHttpInfoAsync(
      String viewId) {
    Object localVarPostBody = null;

    // verify the required parameter 'viewId' is set
    if (viewId == null) {
      CompletableFuture<ApiResponse<CaseViewResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'viewId' when calling getCaseView"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/views/{view_id}"
            .replaceAll("\\{" + "view_id" + "\\}", apiClient.escapeString(viewId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CaseManagementApi.getCaseView",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CaseViewResponse>> result = new CompletableFuture<>();
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
        new GenericType<CaseViewResponse>() {});
  }

  /**
   * Get the details of a project.
   *
   * <p>See {@link #getProjectWithHttpInfo}.
   *
   * @param projectId Project UUID. (required)
   * @return ProjectResponse
   * @throws ApiException if fails to make API call
   */
  public ProjectResponse getProject(String projectId) throws ApiException {
    return getProjectWithHttpInfo(projectId).getData();
  }

  /**
   * Get the details of a project.
   *
   * <p>See {@link #getProjectWithHttpInfoAsync}.
   *
   * @param projectId Project UUID. (required)
   * @return CompletableFuture&lt;ProjectResponse&gt;
   */
  public CompletableFuture<ProjectResponse> getProjectAsync(String projectId) {
    return getProjectWithHttpInfoAsync(projectId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the details of a project by <code>project_id</code>.
   *
   * @param projectId Project UUID. (required)
   * @return ApiResponse&lt;ProjectResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ProjectResponse> getProjectWithHttpInfo(String projectId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'projectId' when calling getProject");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/projects/{project_id}"
            .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CaseManagementApi.getProject",
            localVarPath,
            new ArrayList<Pair>(),
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
        new GenericType<ProjectResponse>() {});
  }

  /**
   * Get the details of a project.
   *
   * <p>See {@link #getProjectWithHttpInfo}.
   *
   * @param projectId Project UUID. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ProjectResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ProjectResponse>> getProjectWithHttpInfoAsync(
      String projectId) {
    Object localVarPostBody = null;

    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      CompletableFuture<ApiResponse<ProjectResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'projectId' when calling getProject"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/projects/{project_id}"
            .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CaseManagementApi.getProject",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ProjectResponse>> result = new CompletableFuture<>();
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
        new GenericType<ProjectResponse>() {});
  }

  /**
   * Get notification rules.
   *
   * <p>See {@link #getProjectNotificationRulesWithHttpInfo}.
   *
   * @param projectId Project UUID (required)
   * @return CaseNotificationRulesResponse
   * @throws ApiException if fails to make API call
   */
  public CaseNotificationRulesResponse getProjectNotificationRules(String projectId)
      throws ApiException {
    return getProjectNotificationRulesWithHttpInfo(projectId).getData();
  }

  /**
   * Get notification rules.
   *
   * <p>See {@link #getProjectNotificationRulesWithHttpInfoAsync}.
   *
   * @param projectId Project UUID (required)
   * @return CompletableFuture&lt;CaseNotificationRulesResponse&gt;
   */
  public CompletableFuture<CaseNotificationRulesResponse> getProjectNotificationRulesAsync(
      String projectId) {
    return getProjectNotificationRulesWithHttpInfoAsync(projectId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get all notification rules for a project.
   *
   * @param projectId Project UUID (required)
   * @return ApiResponse&lt;CaseNotificationRulesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CaseNotificationRulesResponse> getProjectNotificationRulesWithHttpInfo(
      String projectId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'projectId' when calling getProjectNotificationRules");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/projects/{project_id}/notification_rules"
            .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CaseManagementApi.getProjectNotificationRules",
            localVarPath,
            new ArrayList<Pair>(),
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
        new GenericType<CaseNotificationRulesResponse>() {});
  }

  /**
   * Get notification rules.
   *
   * <p>See {@link #getProjectNotificationRulesWithHttpInfo}.
   *
   * @param projectId Project UUID (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CaseNotificationRulesResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CaseNotificationRulesResponse>>
      getProjectNotificationRulesWithHttpInfoAsync(String projectId) {
    Object localVarPostBody = null;

    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      CompletableFuture<ApiResponse<CaseNotificationRulesResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'projectId' when calling"
                  + " getProjectNotificationRules"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/projects/{project_id}/notification_rules"
            .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CaseManagementApi.getProjectNotificationRules",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CaseNotificationRulesResponse>> result =
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
        new GenericType<CaseNotificationRulesResponse>() {});
  }

  /**
   * Get all projects.
   *
   * <p>See {@link #getProjectsWithHttpInfo}.
   *
   * @return ProjectsResponse
   * @throws ApiException if fails to make API call
   */
  public ProjectsResponse getProjects() throws ApiException {
    return getProjectsWithHttpInfo().getData();
  }

  /**
   * Get all projects.
   *
   * <p>See {@link #getProjectsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;ProjectsResponse&gt;
   */
  public CompletableFuture<ProjectsResponse> getProjectsAsync() {
    return getProjectsWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get all projects.
   *
   * @return ApiResponse&lt;ProjectsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ProjectsResponse> getProjectsWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/cases/projects";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CaseManagementApi.getProjects",
            localVarPath,
            new ArrayList<Pair>(),
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
        new GenericType<ProjectsResponse>() {});
  }

  /**
   * Get all projects.
   *
   * <p>See {@link #getProjectsWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;ProjectsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ProjectsResponse>> getProjectsWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/cases/projects";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CaseManagementApi.getProjects",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ProjectsResponse>> result = new CompletableFuture<>();
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
        new GenericType<ProjectsResponse>() {});
  }

  /**
   * Link incident to case.
   *
   * <p>See {@link #linkIncidentWithHttpInfo}.
   *
   * @param caseId Case's UUID or key (required)
   * @param body Incident link request (required)
   * @return CaseResponse
   * @throws ApiException if fails to make API call
   */
  public CaseResponse linkIncident(String caseId, RelationshipToIncidentRequest body)
      throws ApiException {
    return linkIncidentWithHttpInfo(caseId, body).getData();
  }

  /**
   * Link incident to case.
   *
   * <p>See {@link #linkIncidentWithHttpInfoAsync}.
   *
   * @param caseId Case's UUID or key (required)
   * @param body Incident link request (required)
   * @return CompletableFuture&lt;CaseResponse&gt;
   */
  public CompletableFuture<CaseResponse> linkIncidentAsync(
      String caseId, RelationshipToIncidentRequest body) {
    return linkIncidentWithHttpInfoAsync(caseId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Link an incident to a case
   *
   * @param caseId Case's UUID or key (required)
   * @param body Incident link request (required)
   * @return ApiResponse&lt;CaseResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CaseResponse> linkIncidentWithHttpInfo(
      String caseId, RelationshipToIncidentRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'caseId' is set
    if (caseId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'caseId' when calling linkIncident");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling linkIncident");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/{case_id}/relationships/incidents"
            .replaceAll("\\{" + "case_id" + "\\}", apiClient.escapeString(caseId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CaseManagementApi.linkIncident",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<CaseResponse>() {});
  }

  /**
   * Link incident to case.
   *
   * <p>See {@link #linkIncidentWithHttpInfo}.
   *
   * @param caseId Case's UUID or key (required)
   * @param body Incident link request (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CaseResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CaseResponse>> linkIncidentWithHttpInfoAsync(
      String caseId, RelationshipToIncidentRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'caseId' is set
    if (caseId == null) {
      CompletableFuture<ApiResponse<CaseResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'caseId' when calling linkIncident"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<CaseResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'body' when calling linkIncident"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/{case_id}/relationships/incidents"
            .replaceAll("\\{" + "case_id" + "\\}", apiClient.escapeString(caseId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CaseManagementApi.linkIncident",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CaseResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<CaseResponse>() {});
  }

  /**
   * Link existing Jira issue to case.
   *
   * <p>See {@link #linkJiraIssueToCaseWithHttpInfo}.
   *
   * @param caseId Case's UUID or key (required)
   * @param body Jira issue link request (required)
   * @throws ApiException if fails to make API call
   */
  public void linkJiraIssueToCase(String caseId, JiraIssueLinkRequest body) throws ApiException {
    linkJiraIssueToCaseWithHttpInfo(caseId, body);
  }

  /**
   * Link existing Jira issue to case.
   *
   * <p>See {@link #linkJiraIssueToCaseWithHttpInfoAsync}.
   *
   * @param caseId Case's UUID or key (required)
   * @param body Jira issue link request (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> linkJiraIssueToCaseAsync(
      String caseId, JiraIssueLinkRequest body) {
    return linkJiraIssueToCaseWithHttpInfoAsync(caseId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Link an existing Jira issue to a case
   *
   * @param caseId Case's UUID or key (required)
   * @param body Jira issue link request (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> linkJiraIssueToCaseWithHttpInfo(String caseId, JiraIssueLinkRequest body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'caseId' is set
    if (caseId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'caseId' when calling linkJiraIssueToCase");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling linkJiraIssueToCase");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/{case_id}/relationships/jira_issues"
            .replaceAll("\\{" + "case_id" + "\\}", apiClient.escapeString(caseId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CaseManagementApi.linkJiraIssueToCase",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Link existing Jira issue to case.
   *
   * <p>See {@link #linkJiraIssueToCaseWithHttpInfo}.
   *
   * @param caseId Case's UUID or key (required)
   * @param body Jira issue link request (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> linkJiraIssueToCaseWithHttpInfoAsync(
      String caseId, JiraIssueLinkRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'caseId' is set
    if (caseId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'caseId' when calling linkJiraIssueToCase"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling linkJiraIssueToCase"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/{case_id}/relationships/jira_issues"
            .replaceAll("\\{" + "case_id" + "\\}", apiClient.escapeString(caseId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CaseManagementApi.linkJiraIssueToCase",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"*/*"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * List automation rules.
   *
   * <p>See {@link #listCaseAutomationRulesWithHttpInfo}.
   *
   * @param projectId The UUID of the project that owns the automation rules. (required)
   * @return AutomationRulesResponse
   * @throws ApiException if fails to make API call
   */
  public AutomationRulesResponse listCaseAutomationRules(String projectId) throws ApiException {
    return listCaseAutomationRulesWithHttpInfo(projectId).getData();
  }

  /**
   * List automation rules.
   *
   * <p>See {@link #listCaseAutomationRulesWithHttpInfoAsync}.
   *
   * @param projectId The UUID of the project that owns the automation rules. (required)
   * @return CompletableFuture&lt;AutomationRulesResponse&gt;
   */
  public CompletableFuture<AutomationRulesResponse> listCaseAutomationRulesAsync(String projectId) {
    return listCaseAutomationRulesWithHttpInfoAsync(projectId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Returns all automation rules configured for a project. Automation rules allow automatic actions
   * to be triggered by case events like creation, status transitions, or attribute changes.
   *
   * @param projectId The UUID of the project that owns the automation rules. (required)
   * @return ApiResponse&lt;AutomationRulesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AutomationRulesResponse> listCaseAutomationRulesWithHttpInfo(String projectId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'projectId' when calling listCaseAutomationRules");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/projects/{project_id}/rules"
            .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CaseManagementApi.listCaseAutomationRules",
            localVarPath,
            new ArrayList<Pair>(),
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
        new GenericType<AutomationRulesResponse>() {});
  }

  /**
   * List automation rules.
   *
   * <p>See {@link #listCaseAutomationRulesWithHttpInfo}.
   *
   * @param projectId The UUID of the project that owns the automation rules. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AutomationRulesResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AutomationRulesResponse>>
      listCaseAutomationRulesWithHttpInfoAsync(String projectId) {
    Object localVarPostBody = null;

    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      CompletableFuture<ApiResponse<AutomationRulesResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'projectId' when calling listCaseAutomationRules"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/projects/{project_id}/rules"
            .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CaseManagementApi.listCaseAutomationRules",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AutomationRulesResponse>> result = new CompletableFuture<>();
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
        new GenericType<AutomationRulesResponse>() {});
  }

  /** Manage optional parameters to listCaseLinks. */
  public static class ListCaseLinksOptionalParameters {
    private String relationship;

    /**
     * Set relationship.
     *
     * @param relationship Optional filter to only return links of a specific relationship type (for
     *     example, <code>BLOCKS</code> or <code>CAUSES</code>). (optional)
     * @return ListCaseLinksOptionalParameters
     */
    public ListCaseLinksOptionalParameters relationship(String relationship) {
      this.relationship = relationship;
      return this;
    }
  }

  /**
   * List case links.
   *
   * <p>See {@link #listCaseLinksWithHttpInfo}.
   *
   * @param entityType The entity type to look up links for. Use <code>CASE</code> to find links for
   *     a specific case. (required)
   * @param entityId The UUID of the entity to look up links for. (required)
   * @return CaseLinksResponse
   * @throws ApiException if fails to make API call
   */
  public CaseLinksResponse listCaseLinks(String entityType, String entityId) throws ApiException {
    return listCaseLinksWithHttpInfo(entityType, entityId, new ListCaseLinksOptionalParameters())
        .getData();
  }

  /**
   * List case links.
   *
   * <p>See {@link #listCaseLinksWithHttpInfoAsync}.
   *
   * @param entityType The entity type to look up links for. Use <code>CASE</code> to find links for
   *     a specific case. (required)
   * @param entityId The UUID of the entity to look up links for. (required)
   * @return CompletableFuture&lt;CaseLinksResponse&gt;
   */
  public CompletableFuture<CaseLinksResponse> listCaseLinksAsync(
      String entityType, String entityId) {
    return listCaseLinksWithHttpInfoAsync(
            entityType, entityId, new ListCaseLinksOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List case links.
   *
   * <p>See {@link #listCaseLinksWithHttpInfo}.
   *
   * @param entityType The entity type to look up links for. Use <code>CASE</code> to find links for
   *     a specific case. (required)
   * @param entityId The UUID of the entity to look up links for. (required)
   * @param parameters Optional parameters for the request.
   * @return CaseLinksResponse
   * @throws ApiException if fails to make API call
   */
  public CaseLinksResponse listCaseLinks(
      String entityType, String entityId, ListCaseLinksOptionalParameters parameters)
      throws ApiException {
    return listCaseLinksWithHttpInfo(entityType, entityId, parameters).getData();
  }

  /**
   * List case links.
   *
   * <p>See {@link #listCaseLinksWithHttpInfoAsync}.
   *
   * @param entityType The entity type to look up links for. Use <code>CASE</code> to find links for
   *     a specific case. (required)
   * @param entityId The UUID of the entity to look up links for. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;CaseLinksResponse&gt;
   */
  public CompletableFuture<CaseLinksResponse> listCaseLinksAsync(
      String entityType, String entityId, ListCaseLinksOptionalParameters parameters) {
    return listCaseLinksWithHttpInfoAsync(entityType, entityId, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Returns all links associated with a case. Links define relationships (for example, BLOCKS)
   * between cases. Requires entity_type and entity_id query parameters.
   *
   * @param entityType The entity type to look up links for. Use <code>CASE</code> to find links for
   *     a specific case. (required)
   * @param entityId The UUID of the entity to look up links for. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;CaseLinksResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CaseLinksResponse> listCaseLinksWithHttpInfo(
      String entityType, String entityId, ListCaseLinksOptionalParameters parameters)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'entityType' is set
    if (entityType == null) {
      throw new ApiException(
          400, "Missing the required parameter 'entityType' when calling listCaseLinks");
    }

    // verify the required parameter 'entityId' is set
    if (entityId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'entityId' when calling listCaseLinks");
    }
    String relationship = parameters.relationship;
    // create path and map variables
    String localVarPath = "/api/v2/cases/link";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "entity_type", entityType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "entity_id", entityId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "relationship", relationship));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CaseManagementApi.listCaseLinks",
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
        new GenericType<CaseLinksResponse>() {});
  }

  /**
   * List case links.
   *
   * <p>See {@link #listCaseLinksWithHttpInfo}.
   *
   * @param entityType The entity type to look up links for. Use <code>CASE</code> to find links for
   *     a specific case. (required)
   * @param entityId The UUID of the entity to look up links for. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;CaseLinksResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CaseLinksResponse>> listCaseLinksWithHttpInfoAsync(
      String entityType, String entityId, ListCaseLinksOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'entityType' is set
    if (entityType == null) {
      CompletableFuture<ApiResponse<CaseLinksResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'entityType' when calling listCaseLinks"));
      return result;
    }

    // verify the required parameter 'entityId' is set
    if (entityId == null) {
      CompletableFuture<ApiResponse<CaseLinksResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'entityId' when calling listCaseLinks"));
      return result;
    }
    String relationship = parameters.relationship;
    // create path and map variables
    String localVarPath = "/api/v2/cases/link";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "entity_type", entityType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "entity_id", entityId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "relationship", relationship));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CaseManagementApi.listCaseLinks",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CaseLinksResponse>> result = new CompletableFuture<>();
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
        new GenericType<CaseLinksResponse>() {});
  }

  /** Manage optional parameters to listCaseTimeline. */
  public static class ListCaseTimelineOptionalParameters {
    private Long pageSize;
    private Long pageNumber;
    private Boolean sortAscending;

    /**
     * Set pageSize.
     *
     * @param pageSize Number of timeline cells to return per page. (optional, default to 100)
     * @return ListCaseTimelineOptionalParameters
     */
    public ListCaseTimelineOptionalParameters pageSize(Long pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set pageNumber.
     *
     * @param pageNumber Zero-based page number for pagination. (optional, default to 0)
     * @return ListCaseTimelineOptionalParameters
     */
    public ListCaseTimelineOptionalParameters pageNumber(Long pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set sortAscending.
     *
     * @param sortAscending If <code>true</code>, returns timeline cells in chronological order
     *     (oldest first). Defaults to <code>false</code> (newest first). (optional, default to
     *     false)
     * @return ListCaseTimelineOptionalParameters
     */
    public ListCaseTimelineOptionalParameters sortAscending(Boolean sortAscending) {
      this.sortAscending = sortAscending;
      return this;
    }
  }

  /**
   * Get case timeline.
   *
   * <p>See {@link #listCaseTimelineWithHttpInfo}.
   *
   * @param caseId Case's UUID or key (required)
   * @return TimelineResponse
   * @throws ApiException if fails to make API call
   */
  public TimelineResponse listCaseTimeline(String caseId) throws ApiException {
    return listCaseTimelineWithHttpInfo(caseId, new ListCaseTimelineOptionalParameters()).getData();
  }

  /**
   * Get case timeline.
   *
   * <p>See {@link #listCaseTimelineWithHttpInfoAsync}.
   *
   * @param caseId Case's UUID or key (required)
   * @return CompletableFuture&lt;TimelineResponse&gt;
   */
  public CompletableFuture<TimelineResponse> listCaseTimelineAsync(String caseId) {
    return listCaseTimelineWithHttpInfoAsync(caseId, new ListCaseTimelineOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get case timeline.
   *
   * <p>See {@link #listCaseTimelineWithHttpInfo}.
   *
   * @param caseId Case's UUID or key (required)
   * @param parameters Optional parameters for the request.
   * @return TimelineResponse
   * @throws ApiException if fails to make API call
   */
  public TimelineResponse listCaseTimeline(
      String caseId, ListCaseTimelineOptionalParameters parameters) throws ApiException {
    return listCaseTimelineWithHttpInfo(caseId, parameters).getData();
  }

  /**
   * Get case timeline.
   *
   * <p>See {@link #listCaseTimelineWithHttpInfoAsync}.
   *
   * @param caseId Case's UUID or key (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;TimelineResponse&gt;
   */
  public CompletableFuture<TimelineResponse> listCaseTimelineAsync(
      String caseId, ListCaseTimelineOptionalParameters parameters) {
    return listCaseTimelineWithHttpInfoAsync(caseId, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Returns the timeline of events for a case, including comments, status changes, and other
   * activity. Supports pagination and sort order.
   *
   * @param caseId Case's UUID or key (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;TimelineResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<TimelineResponse> listCaseTimelineWithHttpInfo(
      String caseId, ListCaseTimelineOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'caseId' is set
    if (caseId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'caseId' when calling listCaseTimeline");
    }
    Long pageSize = parameters.pageSize;
    Long pageNumber = parameters.pageNumber;
    Boolean sortAscending = parameters.sortAscending;
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/{case_id}/timelines"
            .replaceAll("\\{" + "case_id" + "\\}", apiClient.escapeString(caseId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort[ascending]", sortAscending));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CaseManagementApi.listCaseTimeline",
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
        new GenericType<TimelineResponse>() {});
  }

  /**
   * Get case timeline.
   *
   * <p>See {@link #listCaseTimelineWithHttpInfo}.
   *
   * @param caseId Case's UUID or key (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;TimelineResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<TimelineResponse>> listCaseTimelineWithHttpInfoAsync(
      String caseId, ListCaseTimelineOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'caseId' is set
    if (caseId == null) {
      CompletableFuture<ApiResponse<TimelineResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'caseId' when calling listCaseTimeline"));
      return result;
    }
    Long pageSize = parameters.pageSize;
    Long pageNumber = parameters.pageNumber;
    Boolean sortAscending = parameters.sortAscending;
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/{case_id}/timelines"
            .replaceAll("\\{" + "case_id" + "\\}", apiClient.escapeString(caseId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort[ascending]", sortAscending));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CaseManagementApi.listCaseTimeline",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<TimelineResponse>> result = new CompletableFuture<>();
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
        new GenericType<TimelineResponse>() {});
  }

  /**
   * List case views.
   *
   * <p>See {@link #listCaseViewsWithHttpInfo}.
   *
   * @param projectId Filter views by project identifier. (required)
   * @return CaseViewsResponse
   * @throws ApiException if fails to make API call
   */
  public CaseViewsResponse listCaseViews(String projectId) throws ApiException {
    return listCaseViewsWithHttpInfo(projectId).getData();
  }

  /**
   * List case views.
   *
   * <p>See {@link #listCaseViewsWithHttpInfoAsync}.
   *
   * @param projectId Filter views by project identifier. (required)
   * @return CompletableFuture&lt;CaseViewsResponse&gt;
   */
  public CompletableFuture<CaseViewsResponse> listCaseViewsAsync(String projectId) {
    return listCaseViewsWithHttpInfoAsync(projectId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Returns all saved case views for a given project. Views are saved search queries that allow
   * quick access to filtered lists of cases.
   *
   * @param projectId Filter views by project identifier. (required)
   * @return ApiResponse&lt;CaseViewsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CaseViewsResponse> listCaseViewsWithHttpInfo(String projectId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'projectId' when calling listCaseViews");
    }
    // create path and map variables
    String localVarPath = "/api/v2/cases/views";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "project_id", projectId));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CaseManagementApi.listCaseViews",
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
        new GenericType<CaseViewsResponse>() {});
  }

  /**
   * List case views.
   *
   * <p>See {@link #listCaseViewsWithHttpInfo}.
   *
   * @param projectId Filter views by project identifier. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CaseViewsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CaseViewsResponse>> listCaseViewsWithHttpInfoAsync(
      String projectId) {
    Object localVarPostBody = null;

    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      CompletableFuture<ApiResponse<CaseViewsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'projectId' when calling listCaseViews"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/cases/views";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "project_id", projectId));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CaseManagementApi.listCaseViews",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CaseViewsResponse>> result = new CompletableFuture<>();
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
        new GenericType<CaseViewsResponse>() {});
  }

  /**
   * List case watchers.
   *
   * <p>See {@link #listCaseWatchersWithHttpInfo}.
   *
   * @param caseId Case's UUID or key (required)
   * @return CaseWatchersResponse
   * @throws ApiException if fails to make API call
   */
  public CaseWatchersResponse listCaseWatchers(String caseId) throws ApiException {
    return listCaseWatchersWithHttpInfo(caseId).getData();
  }

  /**
   * List case watchers.
   *
   * <p>See {@link #listCaseWatchersWithHttpInfoAsync}.
   *
   * @param caseId Case's UUID or key (required)
   * @return CompletableFuture&lt;CaseWatchersResponse&gt;
   */
  public CompletableFuture<CaseWatchersResponse> listCaseWatchersAsync(String caseId) {
    return listCaseWatchersWithHttpInfoAsync(caseId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Returns the list of users who are watching a case. Watchers receive notifications about updates
   * to the case.
   *
   * @param caseId Case's UUID or key (required)
   * @return ApiResponse&lt;CaseWatchersResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CaseWatchersResponse> listCaseWatchersWithHttpInfo(String caseId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'caseId' is set
    if (caseId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'caseId' when calling listCaseWatchers");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/{case_id}/watchers"
            .replaceAll("\\{" + "case_id" + "\\}", apiClient.escapeString(caseId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CaseManagementApi.listCaseWatchers",
            localVarPath,
            new ArrayList<Pair>(),
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
        new GenericType<CaseWatchersResponse>() {});
  }

  /**
   * List case watchers.
   *
   * <p>See {@link #listCaseWatchersWithHttpInfo}.
   *
   * @param caseId Case's UUID or key (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CaseWatchersResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CaseWatchersResponse>> listCaseWatchersWithHttpInfoAsync(
      String caseId) {
    Object localVarPostBody = null;

    // verify the required parameter 'caseId' is set
    if (caseId == null) {
      CompletableFuture<ApiResponse<CaseWatchersResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'caseId' when calling listCaseWatchers"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/{case_id}/watchers"
            .replaceAll("\\{" + "case_id" + "\\}", apiClient.escapeString(caseId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CaseManagementApi.listCaseWatchers",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CaseWatchersResponse>> result = new CompletableFuture<>();
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
        new GenericType<CaseWatchersResponse>() {});
  }

  /**
   * List maintenance windows.
   *
   * <p>See {@link #listMaintenanceWindowsWithHttpInfo}.
   *
   * @return MaintenanceWindowsResponse
   * @throws ApiException if fails to make API call
   */
  public MaintenanceWindowsResponse listMaintenanceWindows() throws ApiException {
    return listMaintenanceWindowsWithHttpInfo().getData();
  }

  /**
   * List maintenance windows.
   *
   * <p>See {@link #listMaintenanceWindowsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;MaintenanceWindowsResponse&gt;
   */
  public CompletableFuture<MaintenanceWindowsResponse> listMaintenanceWindowsAsync() {
    return listMaintenanceWindowsWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Returns all configured maintenance windows for event management cases. Maintenance windows
   * define time periods during which case notifications and automation rules are suppressed for
   * cases matching a given query.
   *
   * @return ApiResponse&lt;MaintenanceWindowsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<MaintenanceWindowsResponse> listMaintenanceWindowsWithHttpInfo()
      throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/maintenance_windows";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CaseManagementApi.listMaintenanceWindows",
            localVarPath,
            new ArrayList<Pair>(),
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
        new GenericType<MaintenanceWindowsResponse>() {});
  }

  /**
   * List maintenance windows.
   *
   * <p>See {@link #listMaintenanceWindowsWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;MaintenanceWindowsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<MaintenanceWindowsResponse>>
      listMaintenanceWindowsWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/maintenance_windows";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CaseManagementApi.listMaintenanceWindows",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<MaintenanceWindowsResponse>> result = new CompletableFuture<>();
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
        new GenericType<MaintenanceWindowsResponse>() {});
  }

  /**
   * List project favorites.
   *
   * <p>See {@link #listUserCaseProjectFavoritesWithHttpInfo}.
   *
   * @return ProjectFavoritesResponse
   * @throws ApiException if fails to make API call
   */
  public ProjectFavoritesResponse listUserCaseProjectFavorites() throws ApiException {
    return listUserCaseProjectFavoritesWithHttpInfo().getData();
  }

  /**
   * List project favorites.
   *
   * <p>See {@link #listUserCaseProjectFavoritesWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;ProjectFavoritesResponse&gt;
   */
  public CompletableFuture<ProjectFavoritesResponse> listUserCaseProjectFavoritesAsync() {
    return listUserCaseProjectFavoritesWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Returns the list of case projects that the current authenticated user has marked as favorites.
   *
   * @return ApiResponse&lt;ProjectFavoritesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ProjectFavoritesResponse> listUserCaseProjectFavoritesWithHttpInfo()
      throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/cases/projects/favorites";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CaseManagementApi.listUserCaseProjectFavorites",
            localVarPath,
            new ArrayList<Pair>(),
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
        new GenericType<ProjectFavoritesResponse>() {});
  }

  /**
   * List project favorites.
   *
   * <p>See {@link #listUserCaseProjectFavoritesWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;ProjectFavoritesResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ProjectFavoritesResponse>>
      listUserCaseProjectFavoritesWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/cases/projects/favorites";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CaseManagementApi.listUserCaseProjectFavorites",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ProjectFavoritesResponse>> result = new CompletableFuture<>();
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
        new GenericType<ProjectFavoritesResponse>() {});
  }

  /**
   * Update case project.
   *
   * <p>See {@link #moveCaseToProjectWithHttpInfo}.
   *
   * @param caseId Case's UUID or key (required)
   * @param body Project update request (required)
   * @return CaseResponse
   * @throws ApiException if fails to make API call
   */
  public CaseResponse moveCaseToProject(String caseId, ProjectRelationship body)
      throws ApiException {
    return moveCaseToProjectWithHttpInfo(caseId, body).getData();
  }

  /**
   * Update case project.
   *
   * <p>See {@link #moveCaseToProjectWithHttpInfoAsync}.
   *
   * @param caseId Case's UUID or key (required)
   * @param body Project update request (required)
   * @return CompletableFuture&lt;CaseResponse&gt;
   */
  public CompletableFuture<CaseResponse> moveCaseToProjectAsync(
      String caseId, ProjectRelationship body) {
    return moveCaseToProjectWithHttpInfoAsync(caseId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update the project associated with a case
   *
   * @param caseId Case's UUID or key (required)
   * @param body Project update request (required)
   * @return ApiResponse&lt;CaseResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CaseResponse> moveCaseToProjectWithHttpInfo(
      String caseId, ProjectRelationship body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'caseId' is set
    if (caseId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'caseId' when calling moveCaseToProject");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling moveCaseToProject");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/{case_id}/relationships/project"
            .replaceAll("\\{" + "case_id" + "\\}", apiClient.escapeString(caseId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CaseManagementApi.moveCaseToProject",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<CaseResponse>() {});
  }

  /**
   * Update case project.
   *
   * <p>See {@link #moveCaseToProjectWithHttpInfo}.
   *
   * @param caseId Case's UUID or key (required)
   * @param body Project update request (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CaseResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CaseResponse>> moveCaseToProjectWithHttpInfoAsync(
      String caseId, ProjectRelationship body) {
    Object localVarPostBody = body;

    // verify the required parameter 'caseId' is set
    if (caseId == null) {
      CompletableFuture<ApiResponse<CaseResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'caseId' when calling moveCaseToProject"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<CaseResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling moveCaseToProject"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/{case_id}/relationships/project"
            .replaceAll("\\{" + "case_id" + "\\}", apiClient.escapeString(caseId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CaseManagementApi.moveCaseToProject",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CaseResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<CaseResponse>() {});
  }

  /**
   * Remove insights from a case.
   *
   * <p>See {@link #removeCaseInsightsWithHttpInfo}.
   *
   * @param caseId Case's UUID or key (required)
   * @param body Case insights request. (required)
   * @return CaseResponse
   * @throws ApiException if fails to make API call
   */
  public CaseResponse removeCaseInsights(String caseId, CaseInsightsRequest body)
      throws ApiException {
    return removeCaseInsightsWithHttpInfo(caseId, body).getData();
  }

  /**
   * Remove insights from a case.
   *
   * <p>See {@link #removeCaseInsightsWithHttpInfoAsync}.
   *
   * @param caseId Case's UUID or key (required)
   * @param body Case insights request. (required)
   * @return CompletableFuture&lt;CaseResponse&gt;
   */
  public CompletableFuture<CaseResponse> removeCaseInsightsAsync(
      String caseId, CaseInsightsRequest body) {
    return removeCaseInsightsWithHttpInfoAsync(caseId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Removes one or more previously added insights from a case by specifying their type and resource
   * identifier in the request body.
   *
   * @param caseId Case's UUID or key (required)
   * @param body Case insights request. (required)
   * @return ApiResponse&lt;CaseResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CaseResponse> removeCaseInsightsWithHttpInfo(
      String caseId, CaseInsightsRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'caseId' is set
    if (caseId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'caseId' when calling removeCaseInsights");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling removeCaseInsights");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/{case_id}/insights"
            .replaceAll("\\{" + "case_id" + "\\}", apiClient.escapeString(caseId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CaseManagementApi.removeCaseInsights",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<CaseResponse>() {});
  }

  /**
   * Remove insights from a case.
   *
   * <p>See {@link #removeCaseInsightsWithHttpInfo}.
   *
   * @param caseId Case's UUID or key (required)
   * @param body Case insights request. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CaseResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CaseResponse>> removeCaseInsightsWithHttpInfoAsync(
      String caseId, CaseInsightsRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'caseId' is set
    if (caseId == null) {
      CompletableFuture<ApiResponse<CaseResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'caseId' when calling removeCaseInsights"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<CaseResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling removeCaseInsights"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/{case_id}/insights"
            .replaceAll("\\{" + "case_id" + "\\}", apiClient.escapeString(caseId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CaseManagementApi.removeCaseInsights",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CaseResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<CaseResponse>() {});
  }

  /** Manage optional parameters to searchCases. */
  public static class SearchCasesOptionalParameters {
    private Long pageSize;
    private Long pageNumber;
    private CaseSortableField sortField;
    private String filter;
    private Boolean sortAsc;

    /**
     * Set pageSize.
     *
     * @param pageSize Size for a given page. The maximum allowed value is 100. (optional, default
     *     to 10)
     * @return SearchCasesOptionalParameters
     */
    public SearchCasesOptionalParameters pageSize(Long pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set pageNumber.
     *
     * @param pageNumber Specific page number to return. (optional, default to 0)
     * @return SearchCasesOptionalParameters
     */
    public SearchCasesOptionalParameters pageNumber(Long pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set sortField.
     *
     * @param sortField Specify which field to sort (optional)
     * @return SearchCasesOptionalParameters
     */
    public SearchCasesOptionalParameters sortField(CaseSortableField sortField) {
      this.sortField = sortField;
      return this;
    }

    /**
     * Set filter.
     *
     * @param filter Search query (optional)
     * @return SearchCasesOptionalParameters
     */
    public SearchCasesOptionalParameters filter(String filter) {
      this.filter = filter;
      return this;
    }

    /**
     * Set sortAsc.
     *
     * @param sortAsc Specify if order is ascending or not (optional, default to false)
     * @return SearchCasesOptionalParameters
     */
    public SearchCasesOptionalParameters sortAsc(Boolean sortAsc) {
      this.sortAsc = sortAsc;
      return this;
    }
  }

  /**
   * Search cases.
   *
   * <p>See {@link #searchCasesWithHttpInfo}.
   *
   * @return CasesResponse
   * @throws ApiException if fails to make API call
   */
  public CasesResponse searchCases() throws ApiException {
    return searchCasesWithHttpInfo(new SearchCasesOptionalParameters()).getData();
  }

  /**
   * Search cases.
   *
   * <p>See {@link #searchCasesWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;CasesResponse&gt;
   */
  public CompletableFuture<CasesResponse> searchCasesAsync() {
    return searchCasesWithHttpInfoAsync(new SearchCasesOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Search cases.
   *
   * <p>See {@link #searchCasesWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CasesResponse
   * @throws ApiException if fails to make API call
   */
  public CasesResponse searchCases(SearchCasesOptionalParameters parameters) throws ApiException {
    return searchCasesWithHttpInfo(parameters).getData();
  }

  /**
   * Search cases.
   *
   * <p>See {@link #searchCasesWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;CasesResponse&gt;
   */
  public CompletableFuture<CasesResponse> searchCasesAsync(
      SearchCasesOptionalParameters parameters) {
    return searchCasesWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Search cases.
   *
   * <p>See {@link #searchCasesWithHttpInfo}.
   *
   * @return PaginationIterable&lt;Case&gt;
   */
  public PaginationIterable<Case> searchCasesWithPagination() {
    SearchCasesOptionalParameters parameters = new SearchCasesOptionalParameters();
    return searchCasesWithPagination(parameters);
  }

  /**
   * Search cases.
   *
   * <p>See {@link #searchCasesWithHttpInfo}.
   *
   * @return CasesResponse
   */
  public PaginationIterable<Case> searchCasesWithPagination(
      SearchCasesOptionalParameters parameters) {
    String resultsPath = "getData";
    String valueGetterPath = "";
    String valueSetterPath = "pageNumber";
    Boolean valueSetterParamOptional = true;
    parameters.pageNumber(1l);
    Long limit;

    if (parameters.pageSize == null) {
      limit = 10l;
      parameters.pageSize(limit);
    } else {
      limit = parameters.pageSize;
    }

    LinkedHashMap<String, Object> args = new LinkedHashMap<String, Object>();
    args.put("optionalParams", parameters);

    PaginationIterable iterator =
        new PaginationIterable(
            this,
            "searchCases",
            resultsPath,
            valueGetterPath,
            valueSetterPath,
            valueSetterParamOptional,
            false,
            false,
            limit,
            args,
            1);

    return iterator;
  }

  /**
   * Search cases.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;CasesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CasesResponse> searchCasesWithHttpInfo(
      SearchCasesOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    Long pageSize = parameters.pageSize;
    Long pageNumber = parameters.pageNumber;
    CaseSortableField sortField = parameters.sortField;
    String filter = parameters.filter;
    Boolean sortAsc = parameters.sortAsc;
    // create path and map variables
    String localVarPath = "/api/v2/cases";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort[field]", sortField));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort[asc]", sortAsc));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CaseManagementApi.searchCases",
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
        new GenericType<CasesResponse>() {});
  }

  /**
   * Search cases.
   *
   * <p>See {@link #searchCasesWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;CasesResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CasesResponse>> searchCasesWithHttpInfoAsync(
      SearchCasesOptionalParameters parameters) {
    Object localVarPostBody = null;
    Long pageSize = parameters.pageSize;
    Long pageNumber = parameters.pageNumber;
    CaseSortableField sortField = parameters.sortField;
    String filter = parameters.filter;
    Boolean sortAsc = parameters.sortAsc;
    // create path and map variables
    String localVarPath = "/api/v2/cases";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort[field]", sortField));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort[asc]", sortAsc));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CaseManagementApi.searchCases",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CasesResponse>> result = new CompletableFuture<>();
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
        new GenericType<CasesResponse>() {});
  }

  /**
   * Unarchive case.
   *
   * <p>See {@link #unarchiveCaseWithHttpInfo}.
   *
   * @param caseId Case's UUID or key (required)
   * @param body Unarchive case payload (required)
   * @return CaseResponse
   * @throws ApiException if fails to make API call
   */
  public CaseResponse unarchiveCase(String caseId, CaseEmptyRequest body) throws ApiException {
    return unarchiveCaseWithHttpInfo(caseId, body).getData();
  }

  /**
   * Unarchive case.
   *
   * <p>See {@link #unarchiveCaseWithHttpInfoAsync}.
   *
   * @param caseId Case's UUID or key (required)
   * @param body Unarchive case payload (required)
   * @return CompletableFuture&lt;CaseResponse&gt;
   */
  public CompletableFuture<CaseResponse> unarchiveCaseAsync(String caseId, CaseEmptyRequest body) {
    return unarchiveCaseWithHttpInfoAsync(caseId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Unarchive case
   *
   * @param caseId Case's UUID or key (required)
   * @param body Unarchive case payload (required)
   * @return ApiResponse&lt;CaseResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CaseResponse> unarchiveCaseWithHttpInfo(String caseId, CaseEmptyRequest body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'caseId' is set
    if (caseId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'caseId' when calling unarchiveCase");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling unarchiveCase");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/{case_id}/unarchive"
            .replaceAll("\\{" + "case_id" + "\\}", apiClient.escapeString(caseId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CaseManagementApi.unarchiveCase",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<CaseResponse>() {});
  }

  /**
   * Unarchive case.
   *
   * <p>See {@link #unarchiveCaseWithHttpInfo}.
   *
   * @param caseId Case's UUID or key (required)
   * @param body Unarchive case payload (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CaseResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CaseResponse>> unarchiveCaseWithHttpInfoAsync(
      String caseId, CaseEmptyRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'caseId' is set
    if (caseId == null) {
      CompletableFuture<ApiResponse<CaseResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'caseId' when calling unarchiveCase"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<CaseResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling unarchiveCase"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/{case_id}/unarchive"
            .replaceAll("\\{" + "case_id" + "\\}", apiClient.escapeString(caseId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CaseManagementApi.unarchiveCase",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CaseResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<CaseResponse>() {});
  }

  /**
   * Unassign case.
   *
   * <p>See {@link #unassignCaseWithHttpInfo}.
   *
   * @param caseId Case's UUID or key (required)
   * @param body Unassign case payload (required)
   * @return CaseResponse
   * @throws ApiException if fails to make API call
   */
  public CaseResponse unassignCase(String caseId, CaseEmptyRequest body) throws ApiException {
    return unassignCaseWithHttpInfo(caseId, body).getData();
  }

  /**
   * Unassign case.
   *
   * <p>See {@link #unassignCaseWithHttpInfoAsync}.
   *
   * @param caseId Case's UUID or key (required)
   * @param body Unassign case payload (required)
   * @return CompletableFuture&lt;CaseResponse&gt;
   */
  public CompletableFuture<CaseResponse> unassignCaseAsync(String caseId, CaseEmptyRequest body) {
    return unassignCaseWithHttpInfoAsync(caseId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Unassign case
   *
   * @param caseId Case's UUID or key (required)
   * @param body Unassign case payload (required)
   * @return ApiResponse&lt;CaseResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CaseResponse> unassignCaseWithHttpInfo(String caseId, CaseEmptyRequest body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'caseId' is set
    if (caseId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'caseId' when calling unassignCase");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling unassignCase");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/{case_id}/unassign"
            .replaceAll("\\{" + "case_id" + "\\}", apiClient.escapeString(caseId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CaseManagementApi.unassignCase",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<CaseResponse>() {});
  }

  /**
   * Unassign case.
   *
   * <p>See {@link #unassignCaseWithHttpInfo}.
   *
   * @param caseId Case's UUID or key (required)
   * @param body Unassign case payload (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CaseResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CaseResponse>> unassignCaseWithHttpInfoAsync(
      String caseId, CaseEmptyRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'caseId' is set
    if (caseId == null) {
      CompletableFuture<ApiResponse<CaseResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'caseId' when calling unassignCase"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<CaseResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'body' when calling unassignCase"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/{case_id}/unassign"
            .replaceAll("\\{" + "case_id" + "\\}", apiClient.escapeString(caseId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CaseManagementApi.unassignCase",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CaseResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<CaseResponse>() {});
  }

  /**
   * Unfavorite a project.
   *
   * <p>See {@link #unfavoriteCaseProjectWithHttpInfo}.
   *
   * @param projectId Project UUID. (required)
   * @throws ApiException if fails to make API call
   */
  public void unfavoriteCaseProject(String projectId) throws ApiException {
    unfavoriteCaseProjectWithHttpInfo(projectId);
  }

  /**
   * Unfavorite a project.
   *
   * <p>See {@link #unfavoriteCaseProjectWithHttpInfoAsync}.
   *
   * @param projectId Project UUID. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> unfavoriteCaseProjectAsync(String projectId) {
    return unfavoriteCaseProjectWithHttpInfoAsync(projectId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Removes a case project from the current user's favorites list.
   *
   * @param projectId Project UUID. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> unfavoriteCaseProjectWithHttpInfo(String projectId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'projectId' when calling unfavoriteCaseProject");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/projects/{project_id}/favorites"
            .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CaseManagementApi.unfavoriteCaseProject",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Unfavorite a project.
   *
   * <p>See {@link #unfavoriteCaseProjectWithHttpInfo}.
   *
   * @param projectId Project UUID. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> unfavoriteCaseProjectWithHttpInfoAsync(
      String projectId) {
    Object localVarPostBody = null;

    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'projectId' when calling unfavoriteCaseProject"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/projects/{project_id}/favorites"
            .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CaseManagementApi.unfavoriteCaseProject",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"*/*"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Remove Jira issue link from case.
   *
   * <p>See {@link #unlinkJiraIssueWithHttpInfo}.
   *
   * @param caseId Case's UUID or key (required)
   * @throws ApiException if fails to make API call
   */
  public void unlinkJiraIssue(String caseId) throws ApiException {
    unlinkJiraIssueWithHttpInfo(caseId);
  }

  /**
   * Remove Jira issue link from case.
   *
   * <p>See {@link #unlinkJiraIssueWithHttpInfoAsync}.
   *
   * @param caseId Case's UUID or key (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> unlinkJiraIssueAsync(String caseId) {
    return unlinkJiraIssueWithHttpInfoAsync(caseId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Remove the link between a Jira issue and a case
   *
   * @param caseId Case's UUID or key (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> unlinkJiraIssueWithHttpInfo(String caseId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'caseId' is set
    if (caseId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'caseId' when calling unlinkJiraIssue");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/{case_id}/relationships/jira_issues"
            .replaceAll("\\{" + "case_id" + "\\}", apiClient.escapeString(caseId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CaseManagementApi.unlinkJiraIssue",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Remove Jira issue link from case.
   *
   * <p>See {@link #unlinkJiraIssueWithHttpInfo}.
   *
   * @param caseId Case's UUID or key (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> unlinkJiraIssueWithHttpInfoAsync(String caseId) {
    Object localVarPostBody = null;

    // verify the required parameter 'caseId' is set
    if (caseId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'caseId' when calling unlinkJiraIssue"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/{case_id}/relationships/jira_issues"
            .replaceAll("\\{" + "case_id" + "\\}", apiClient.escapeString(caseId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CaseManagementApi.unlinkJiraIssue",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"*/*"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Unwatch a case.
   *
   * <p>See {@link #unwatchCaseWithHttpInfo}.
   *
   * @param caseId Case's UUID or key (required)
   * @param userUuid The UUID of the user to add or remove as a watcher. (required)
   * @throws ApiException if fails to make API call
   */
  public void unwatchCase(String caseId, String userUuid) throws ApiException {
    unwatchCaseWithHttpInfo(caseId, userUuid);
  }

  /**
   * Unwatch a case.
   *
   * <p>See {@link #unwatchCaseWithHttpInfoAsync}.
   *
   * @param caseId Case's UUID or key (required)
   * @param userUuid The UUID of the user to add or remove as a watcher. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> unwatchCaseAsync(String caseId, String userUuid) {
    return unwatchCaseWithHttpInfoAsync(caseId, userUuid)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Removes a user from the watchers list of a case. The user no longer receives notifications
   * about updates to the case.
   *
   * @param caseId Case's UUID or key (required)
   * @param userUuid The UUID of the user to add or remove as a watcher. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> unwatchCaseWithHttpInfo(String caseId, String userUuid)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'caseId' is set
    if (caseId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'caseId' when calling unwatchCase");
    }

    // verify the required parameter 'userUuid' is set
    if (userUuid == null) {
      throw new ApiException(
          400, "Missing the required parameter 'userUuid' when calling unwatchCase");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/{case_id}/watchers/{user_uuid}"
            .replaceAll("\\{" + "case_id" + "\\}", apiClient.escapeString(caseId.toString()))
            .replaceAll("\\{" + "user_uuid" + "\\}", apiClient.escapeString(userUuid.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CaseManagementApi.unwatchCase",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Unwatch a case.
   *
   * <p>See {@link #unwatchCaseWithHttpInfo}.
   *
   * @param caseId Case's UUID or key (required)
   * @param userUuid The UUID of the user to add or remove as a watcher. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> unwatchCaseWithHttpInfoAsync(
      String caseId, String userUuid) {
    Object localVarPostBody = null;

    // verify the required parameter 'caseId' is set
    if (caseId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'caseId' when calling unwatchCase"));
      return result;
    }

    // verify the required parameter 'userUuid' is set
    if (userUuid == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'userUuid' when calling unwatchCase"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/{case_id}/watchers/{user_uuid}"
            .replaceAll("\\{" + "case_id" + "\\}", apiClient.escapeString(caseId.toString()))
            .replaceAll("\\{" + "user_uuid" + "\\}", apiClient.escapeString(userUuid.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CaseManagementApi.unwatchCase",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"*/*"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Update case attributes.
   *
   * <p>See {@link #updateAttributesWithHttpInfo}.
   *
   * @param caseId Case's UUID or key (required)
   * @param body Case attributes update payload (required)
   * @return CaseResponse
   * @throws ApiException if fails to make API call
   */
  public CaseResponse updateAttributes(String caseId, CaseUpdateAttributesRequest body)
      throws ApiException {
    return updateAttributesWithHttpInfo(caseId, body).getData();
  }

  /**
   * Update case attributes.
   *
   * <p>See {@link #updateAttributesWithHttpInfoAsync}.
   *
   * @param caseId Case's UUID or key (required)
   * @param body Case attributes update payload (required)
   * @return CompletableFuture&lt;CaseResponse&gt;
   */
  public CompletableFuture<CaseResponse> updateAttributesAsync(
      String caseId, CaseUpdateAttributesRequest body) {
    return updateAttributesWithHttpInfoAsync(caseId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update case attributes
   *
   * @param caseId Case's UUID or key (required)
   * @param body Case attributes update payload (required)
   * @return ApiResponse&lt;CaseResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CaseResponse> updateAttributesWithHttpInfo(
      String caseId, CaseUpdateAttributesRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'caseId' is set
    if (caseId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'caseId' when calling updateAttributes");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateAttributes");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/{case_id}/attributes"
            .replaceAll("\\{" + "case_id" + "\\}", apiClient.escapeString(caseId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CaseManagementApi.updateAttributes",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<CaseResponse>() {});
  }

  /**
   * Update case attributes.
   *
   * <p>See {@link #updateAttributesWithHttpInfo}.
   *
   * @param caseId Case's UUID or key (required)
   * @param body Case attributes update payload (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CaseResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CaseResponse>> updateAttributesWithHttpInfoAsync(
      String caseId, CaseUpdateAttributesRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'caseId' is set
    if (caseId == null) {
      CompletableFuture<ApiResponse<CaseResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'caseId' when calling updateAttributes"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<CaseResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateAttributes"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/{case_id}/attributes"
            .replaceAll("\\{" + "case_id" + "\\}", apiClient.escapeString(caseId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CaseManagementApi.updateAttributes",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CaseResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<CaseResponse>() {});
  }

  /**
   * Update an automation rule.
   *
   * <p>See {@link #updateCaseAutomationRuleWithHttpInfo}.
   *
   * @param projectId The UUID of the project that owns the automation rules. (required)
   * @param ruleId The UUID of the automation rule. (required)
   * @param body Automation rule payload. (required)
   * @return AutomationRuleResponse
   * @throws ApiException if fails to make API call
   */
  public AutomationRuleResponse updateCaseAutomationRule(
      String projectId, String ruleId, AutomationRuleUpdateRequest body) throws ApiException {
    return updateCaseAutomationRuleWithHttpInfo(projectId, ruleId, body).getData();
  }

  /**
   * Update an automation rule.
   *
   * <p>See {@link #updateCaseAutomationRuleWithHttpInfoAsync}.
   *
   * @param projectId The UUID of the project that owns the automation rules. (required)
   * @param ruleId The UUID of the automation rule. (required)
   * @param body Automation rule payload. (required)
   * @return CompletableFuture&lt;AutomationRuleResponse&gt;
   */
  public CompletableFuture<AutomationRuleResponse> updateCaseAutomationRuleAsync(
      String projectId, String ruleId, AutomationRuleUpdateRequest body) {
    return updateCaseAutomationRuleWithHttpInfoAsync(projectId, ruleId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Updates the trigger, action, name, or state of an existing automation rule.
   *
   * @param projectId The UUID of the project that owns the automation rules. (required)
   * @param ruleId The UUID of the automation rule. (required)
   * @param body Automation rule payload. (required)
   * @return ApiResponse&lt;AutomationRuleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AutomationRuleResponse> updateCaseAutomationRuleWithHttpInfo(
      String projectId, String ruleId, AutomationRuleUpdateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'projectId' when calling updateCaseAutomationRule");
    }

    // verify the required parameter 'ruleId' is set
    if (ruleId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'ruleId' when calling updateCaseAutomationRule");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateCaseAutomationRule");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/projects/{project_id}/rules/{rule_id}"
            .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()))
            .replaceAll("\\{" + "rule_id" + "\\}", apiClient.escapeString(ruleId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CaseManagementApi.updateCaseAutomationRule",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "PUT",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<AutomationRuleResponse>() {});
  }

  /**
   * Update an automation rule.
   *
   * <p>See {@link #updateCaseAutomationRuleWithHttpInfo}.
   *
   * @param projectId The UUID of the project that owns the automation rules. (required)
   * @param ruleId The UUID of the automation rule. (required)
   * @param body Automation rule payload. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AutomationRuleResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AutomationRuleResponse>>
      updateCaseAutomationRuleWithHttpInfoAsync(
          String projectId, String ruleId, AutomationRuleUpdateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      CompletableFuture<ApiResponse<AutomationRuleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'projectId' when calling updateCaseAutomationRule"));
      return result;
    }

    // verify the required parameter 'ruleId' is set
    if (ruleId == null) {
      CompletableFuture<ApiResponse<AutomationRuleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'ruleId' when calling updateCaseAutomationRule"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<AutomationRuleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateCaseAutomationRule"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/projects/{project_id}/rules/{rule_id}"
            .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()))
            .replaceAll("\\{" + "rule_id" + "\\}", apiClient.escapeString(ruleId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CaseManagementApi.updateCaseAutomationRule",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AutomationRuleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "PUT",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<AutomationRuleResponse>() {});
  }

  /**
   * Update case comment.
   *
   * <p>See {@link #updateCaseCommentWithHttpInfo}.
   *
   * @param caseId Case's UUID or key (required)
   * @param cellId The UUID of the timeline cell (comment) to update. (required)
   * @param body Case update comment payload. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateCaseComment(String caseId, String cellId, CaseUpdateCommentRequest body)
      throws ApiException {
    updateCaseCommentWithHttpInfo(caseId, cellId, body);
  }

  /**
   * Update case comment.
   *
   * <p>See {@link #updateCaseCommentWithHttpInfoAsync}.
   *
   * @param caseId Case's UUID or key (required)
   * @param cellId The UUID of the timeline cell (comment) to update. (required)
   * @param body Case update comment payload. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> updateCaseCommentAsync(
      String caseId, String cellId, CaseUpdateCommentRequest body) {
    return updateCaseCommentWithHttpInfoAsync(caseId, cellId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Updates the text content of an existing comment on a case timeline. The comment is identified
   * by its cell ID.
   *
   * @param caseId Case's UUID or key (required)
   * @param cellId The UUID of the timeline cell (comment) to update. (required)
   * @param body Case update comment payload. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> updateCaseCommentWithHttpInfo(
      String caseId, String cellId, CaseUpdateCommentRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'caseId' is set
    if (caseId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'caseId' when calling updateCaseComment");
    }

    // verify the required parameter 'cellId' is set
    if (cellId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'cellId' when calling updateCaseComment");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateCaseComment");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/{case_id}/comment/{cell_id}"
            .replaceAll("\\{" + "case_id" + "\\}", apiClient.escapeString(caseId.toString()))
            .replaceAll("\\{" + "cell_id" + "\\}", apiClient.escapeString(cellId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CaseManagementApi.updateCaseComment",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "PUT",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Update case comment.
   *
   * <p>See {@link #updateCaseCommentWithHttpInfo}.
   *
   * @param caseId Case's UUID or key (required)
   * @param cellId The UUID of the timeline cell (comment) to update. (required)
   * @param body Case update comment payload. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> updateCaseCommentWithHttpInfoAsync(
      String caseId, String cellId, CaseUpdateCommentRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'caseId' is set
    if (caseId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'caseId' when calling updateCaseComment"));
      return result;
    }

    // verify the required parameter 'cellId' is set
    if (cellId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'cellId' when calling updateCaseComment"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateCaseComment"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/{case_id}/comment/{cell_id}"
            .replaceAll("\\{" + "case_id" + "\\}", apiClient.escapeString(caseId.toString()))
            .replaceAll("\\{" + "cell_id" + "\\}", apiClient.escapeString(cellId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CaseManagementApi.updateCaseComment",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"*/*"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "PUT",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Update case custom attribute.
   *
   * <p>See {@link #updateCaseCustomAttributeWithHttpInfo}.
   *
   * @param caseId Case's UUID or key (required)
   * @param customAttributeKey Case Custom attribute's key (required)
   * @param body Update case custom attribute payload (required)
   * @return CaseResponse
   * @throws ApiException if fails to make API call
   */
  public CaseResponse updateCaseCustomAttribute(
      String caseId, String customAttributeKey, CaseUpdateCustomAttributeRequest body)
      throws ApiException {
    return updateCaseCustomAttributeWithHttpInfo(caseId, customAttributeKey, body).getData();
  }

  /**
   * Update case custom attribute.
   *
   * <p>See {@link #updateCaseCustomAttributeWithHttpInfoAsync}.
   *
   * @param caseId Case's UUID or key (required)
   * @param customAttributeKey Case Custom attribute's key (required)
   * @param body Update case custom attribute payload (required)
   * @return CompletableFuture&lt;CaseResponse&gt;
   */
  public CompletableFuture<CaseResponse> updateCaseCustomAttributeAsync(
      String caseId, String customAttributeKey, CaseUpdateCustomAttributeRequest body) {
    return updateCaseCustomAttributeWithHttpInfoAsync(caseId, customAttributeKey, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update case custom attribute
   *
   * @param caseId Case's UUID or key (required)
   * @param customAttributeKey Case Custom attribute's key (required)
   * @param body Update case custom attribute payload (required)
   * @return ApiResponse&lt;CaseResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CaseResponse> updateCaseCustomAttributeWithHttpInfo(
      String caseId, String customAttributeKey, CaseUpdateCustomAttributeRequest body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'caseId' is set
    if (caseId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'caseId' when calling updateCaseCustomAttribute");
    }

    // verify the required parameter 'customAttributeKey' is set
    if (customAttributeKey == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'customAttributeKey' when calling"
              + " updateCaseCustomAttribute");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateCaseCustomAttribute");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/{case_id}/custom_attributes/{custom_attribute_key}"
            .replaceAll("\\{" + "case_id" + "\\}", apiClient.escapeString(caseId.toString()))
            .replaceAll(
                "\\{" + "custom_attribute_key" + "\\}",
                apiClient.escapeString(customAttributeKey.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CaseManagementApi.updateCaseCustomAttribute",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<CaseResponse>() {});
  }

  /**
   * Update case custom attribute.
   *
   * <p>See {@link #updateCaseCustomAttributeWithHttpInfo}.
   *
   * @param caseId Case's UUID or key (required)
   * @param customAttributeKey Case Custom attribute's key (required)
   * @param body Update case custom attribute payload (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CaseResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CaseResponse>> updateCaseCustomAttributeWithHttpInfoAsync(
      String caseId, String customAttributeKey, CaseUpdateCustomAttributeRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'caseId' is set
    if (caseId == null) {
      CompletableFuture<ApiResponse<CaseResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'caseId' when calling updateCaseCustomAttribute"));
      return result;
    }

    // verify the required parameter 'customAttributeKey' is set
    if (customAttributeKey == null) {
      CompletableFuture<ApiResponse<CaseResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'customAttributeKey' when calling"
                  + " updateCaseCustomAttribute"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<CaseResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateCaseCustomAttribute"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/{case_id}/custom_attributes/{custom_attribute_key}"
            .replaceAll("\\{" + "case_id" + "\\}", apiClient.escapeString(caseId.toString()))
            .replaceAll(
                "\\{" + "custom_attribute_key" + "\\}",
                apiClient.escapeString(customAttributeKey.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CaseManagementApi.updateCaseCustomAttribute",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CaseResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<CaseResponse>() {});
  }

  /**
   * Update case description.
   *
   * <p>See {@link #updateCaseDescriptionWithHttpInfo}.
   *
   * @param caseId Case's UUID or key (required)
   * @param body Case description update payload (required)
   * @return CaseResponse
   * @throws ApiException if fails to make API call
   */
  public CaseResponse updateCaseDescription(String caseId, CaseUpdateDescriptionRequest body)
      throws ApiException {
    return updateCaseDescriptionWithHttpInfo(caseId, body).getData();
  }

  /**
   * Update case description.
   *
   * <p>See {@link #updateCaseDescriptionWithHttpInfoAsync}.
   *
   * @param caseId Case's UUID or key (required)
   * @param body Case description update payload (required)
   * @return CompletableFuture&lt;CaseResponse&gt;
   */
  public CompletableFuture<CaseResponse> updateCaseDescriptionAsync(
      String caseId, CaseUpdateDescriptionRequest body) {
    return updateCaseDescriptionWithHttpInfoAsync(caseId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update case description
   *
   * @param caseId Case's UUID or key (required)
   * @param body Case description update payload (required)
   * @return ApiResponse&lt;CaseResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CaseResponse> updateCaseDescriptionWithHttpInfo(
      String caseId, CaseUpdateDescriptionRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'caseId' is set
    if (caseId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'caseId' when calling updateCaseDescription");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateCaseDescription");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/{case_id}/description"
            .replaceAll("\\{" + "case_id" + "\\}", apiClient.escapeString(caseId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CaseManagementApi.updateCaseDescription",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<CaseResponse>() {});
  }

  /**
   * Update case description.
   *
   * <p>See {@link #updateCaseDescriptionWithHttpInfo}.
   *
   * @param caseId Case's UUID or key (required)
   * @param body Case description update payload (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CaseResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CaseResponse>> updateCaseDescriptionWithHttpInfoAsync(
      String caseId, CaseUpdateDescriptionRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'caseId' is set
    if (caseId == null) {
      CompletableFuture<ApiResponse<CaseResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'caseId' when calling updateCaseDescription"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<CaseResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateCaseDescription"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/{case_id}/description"
            .replaceAll("\\{" + "case_id" + "\\}", apiClient.escapeString(caseId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CaseManagementApi.updateCaseDescription",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CaseResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<CaseResponse>() {});
  }

  /**
   * Update case due date.
   *
   * <p>See {@link #updateCaseDueDateWithHttpInfo}.
   *
   * @param caseId Case's UUID or key (required)
   * @param body Case due date update payload. (required)
   * @return CaseResponse
   * @throws ApiException if fails to make API call
   */
  public CaseResponse updateCaseDueDate(String caseId, CaseUpdateDueDateRequest body)
      throws ApiException {
    return updateCaseDueDateWithHttpInfo(caseId, body).getData();
  }

  /**
   * Update case due date.
   *
   * <p>See {@link #updateCaseDueDateWithHttpInfoAsync}.
   *
   * @param caseId Case's UUID or key (required)
   * @param body Case due date update payload. (required)
   * @return CompletableFuture&lt;CaseResponse&gt;
   */
  public CompletableFuture<CaseResponse> updateCaseDueDateAsync(
      String caseId, CaseUpdateDueDateRequest body) {
    return updateCaseDueDateWithHttpInfoAsync(caseId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Sets or updates the due date for a case. The due date is a calendar date (without a time
   * component) indicating when the case should be resolved.
   *
   * @param caseId Case's UUID or key (required)
   * @param body Case due date update payload. (required)
   * @return ApiResponse&lt;CaseResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CaseResponse> updateCaseDueDateWithHttpInfo(
      String caseId, CaseUpdateDueDateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'caseId' is set
    if (caseId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'caseId' when calling updateCaseDueDate");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateCaseDueDate");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/{case_id}/due_date"
            .replaceAll("\\{" + "case_id" + "\\}", apiClient.escapeString(caseId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CaseManagementApi.updateCaseDueDate",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<CaseResponse>() {});
  }

  /**
   * Update case due date.
   *
   * <p>See {@link #updateCaseDueDateWithHttpInfo}.
   *
   * @param caseId Case's UUID or key (required)
   * @param body Case due date update payload. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CaseResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CaseResponse>> updateCaseDueDateWithHttpInfoAsync(
      String caseId, CaseUpdateDueDateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'caseId' is set
    if (caseId == null) {
      CompletableFuture<ApiResponse<CaseResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'caseId' when calling updateCaseDueDate"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<CaseResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateCaseDueDate"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/{case_id}/due_date"
            .replaceAll("\\{" + "case_id" + "\\}", apiClient.escapeString(caseId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CaseManagementApi.updateCaseDueDate",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CaseResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<CaseResponse>() {});
  }

  /**
   * Update case resolved reason.
   *
   * <p>See {@link #updateCaseResolvedReasonWithHttpInfo}.
   *
   * @param caseId Case's UUID or key (required)
   * @param body Case resolved reason update payload. (required)
   * @return CaseResponse
   * @throws ApiException if fails to make API call
   */
  public CaseResponse updateCaseResolvedReason(String caseId, CaseUpdateResolvedReasonRequest body)
      throws ApiException {
    return updateCaseResolvedReasonWithHttpInfo(caseId, body).getData();
  }

  /**
   * Update case resolved reason.
   *
   * <p>See {@link #updateCaseResolvedReasonWithHttpInfoAsync}.
   *
   * @param caseId Case's UUID or key (required)
   * @param body Case resolved reason update payload. (required)
   * @return CompletableFuture&lt;CaseResponse&gt;
   */
  public CompletableFuture<CaseResponse> updateCaseResolvedReasonAsync(
      String caseId, CaseUpdateResolvedReasonRequest body) {
    return updateCaseResolvedReasonWithHttpInfoAsync(caseId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Sets the resolved reason for a security case (for example, FALSE_POSITIVE, TRUE_POSITIVE).
   * Applicable to security-type cases.
   *
   * @param caseId Case's UUID or key (required)
   * @param body Case resolved reason update payload. (required)
   * @return ApiResponse&lt;CaseResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CaseResponse> updateCaseResolvedReasonWithHttpInfo(
      String caseId, CaseUpdateResolvedReasonRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'caseId' is set
    if (caseId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'caseId' when calling updateCaseResolvedReason");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateCaseResolvedReason");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/{case_id}/resolved_reason"
            .replaceAll("\\{" + "case_id" + "\\}", apiClient.escapeString(caseId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CaseManagementApi.updateCaseResolvedReason",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<CaseResponse>() {});
  }

  /**
   * Update case resolved reason.
   *
   * <p>See {@link #updateCaseResolvedReasonWithHttpInfo}.
   *
   * @param caseId Case's UUID or key (required)
   * @param body Case resolved reason update payload. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CaseResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CaseResponse>> updateCaseResolvedReasonWithHttpInfoAsync(
      String caseId, CaseUpdateResolvedReasonRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'caseId' is set
    if (caseId == null) {
      CompletableFuture<ApiResponse<CaseResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'caseId' when calling updateCaseResolvedReason"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<CaseResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateCaseResolvedReason"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/{case_id}/resolved_reason"
            .replaceAll("\\{" + "case_id" + "\\}", apiClient.escapeString(caseId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CaseManagementApi.updateCaseResolvedReason",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CaseResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<CaseResponse>() {});
  }

  /**
   * Update case title.
   *
   * <p>See {@link #updateCaseTitleWithHttpInfo}.
   *
   * @param caseId Case's UUID or key (required)
   * @param body Case title update payload (required)
   * @return CaseResponse
   * @throws ApiException if fails to make API call
   */
  public CaseResponse updateCaseTitle(String caseId, CaseUpdateTitleRequest body)
      throws ApiException {
    return updateCaseTitleWithHttpInfo(caseId, body).getData();
  }

  /**
   * Update case title.
   *
   * <p>See {@link #updateCaseTitleWithHttpInfoAsync}.
   *
   * @param caseId Case's UUID or key (required)
   * @param body Case title update payload (required)
   * @return CompletableFuture&lt;CaseResponse&gt;
   */
  public CompletableFuture<CaseResponse> updateCaseTitleAsync(
      String caseId, CaseUpdateTitleRequest body) {
    return updateCaseTitleWithHttpInfoAsync(caseId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update case title
   *
   * @param caseId Case's UUID or key (required)
   * @param body Case title update payload (required)
   * @return ApiResponse&lt;CaseResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CaseResponse> updateCaseTitleWithHttpInfo(
      String caseId, CaseUpdateTitleRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'caseId' is set
    if (caseId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'caseId' when calling updateCaseTitle");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateCaseTitle");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/{case_id}/title"
            .replaceAll("\\{" + "case_id" + "\\}", apiClient.escapeString(caseId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CaseManagementApi.updateCaseTitle",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<CaseResponse>() {});
  }

  /**
   * Update case title.
   *
   * <p>See {@link #updateCaseTitleWithHttpInfo}.
   *
   * @param caseId Case's UUID or key (required)
   * @param body Case title update payload (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CaseResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CaseResponse>> updateCaseTitleWithHttpInfoAsync(
      String caseId, CaseUpdateTitleRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'caseId' is set
    if (caseId == null) {
      CompletableFuture<ApiResponse<CaseResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'caseId' when calling updateCaseTitle"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<CaseResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateCaseTitle"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/{case_id}/title"
            .replaceAll("\\{" + "case_id" + "\\}", apiClient.escapeString(caseId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CaseManagementApi.updateCaseTitle",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CaseResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<CaseResponse>() {});
  }

  /**
   * Update a case view.
   *
   * <p>See {@link #updateCaseViewWithHttpInfo}.
   *
   * @param viewId The UUID of the case view. (required)
   * @param body Case view payload. (required)
   * @return CaseViewResponse
   * @throws ApiException if fails to make API call
   */
  public CaseViewResponse updateCaseView(String viewId, CaseViewUpdateRequest body)
      throws ApiException {
    return updateCaseViewWithHttpInfo(viewId, body).getData();
  }

  /**
   * Update a case view.
   *
   * <p>See {@link #updateCaseViewWithHttpInfoAsync}.
   *
   * @param viewId The UUID of the case view. (required)
   * @param body Case view payload. (required)
   * @return CompletableFuture&lt;CaseViewResponse&gt;
   */
  public CompletableFuture<CaseViewResponse> updateCaseViewAsync(
      String viewId, CaseViewUpdateRequest body) {
    return updateCaseViewWithHttpInfoAsync(viewId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Updates the name, query, or notification rule of an existing case view.
   *
   * @param viewId The UUID of the case view. (required)
   * @param body Case view payload. (required)
   * @return ApiResponse&lt;CaseViewResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CaseViewResponse> updateCaseViewWithHttpInfo(
      String viewId, CaseViewUpdateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'viewId' is set
    if (viewId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'viewId' when calling updateCaseView");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateCaseView");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/views/{view_id}"
            .replaceAll("\\{" + "view_id" + "\\}", apiClient.escapeString(viewId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CaseManagementApi.updateCaseView",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "PUT",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<CaseViewResponse>() {});
  }

  /**
   * Update a case view.
   *
   * <p>See {@link #updateCaseViewWithHttpInfo}.
   *
   * @param viewId The UUID of the case view. (required)
   * @param body Case view payload. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CaseViewResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CaseViewResponse>> updateCaseViewWithHttpInfoAsync(
      String viewId, CaseViewUpdateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'viewId' is set
    if (viewId == null) {
      CompletableFuture<ApiResponse<CaseViewResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'viewId' when calling updateCaseView"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<CaseViewResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateCaseView"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/views/{view_id}"
            .replaceAll("\\{" + "view_id" + "\\}", apiClient.escapeString(viewId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CaseManagementApi.updateCaseView",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CaseViewResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "PUT",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<CaseViewResponse>() {});
  }

  /**
   * Update a maintenance window.
   *
   * <p>See {@link #updateMaintenanceWindowWithHttpInfo}.
   *
   * @param maintenanceWindowId The UUID of the maintenance window. (required)
   * @param body Maintenance window payload. (required)
   * @return MaintenanceWindowResponse
   * @throws ApiException if fails to make API call
   */
  public MaintenanceWindowResponse updateMaintenanceWindow(
      String maintenanceWindowId, MaintenanceWindowUpdateRequest body) throws ApiException {
    return updateMaintenanceWindowWithHttpInfo(maintenanceWindowId, body).getData();
  }

  /**
   * Update a maintenance window.
   *
   * <p>See {@link #updateMaintenanceWindowWithHttpInfoAsync}.
   *
   * @param maintenanceWindowId The UUID of the maintenance window. (required)
   * @param body Maintenance window payload. (required)
   * @return CompletableFuture&lt;MaintenanceWindowResponse&gt;
   */
  public CompletableFuture<MaintenanceWindowResponse> updateMaintenanceWindowAsync(
      String maintenanceWindowId, MaintenanceWindowUpdateRequest body) {
    return updateMaintenanceWindowWithHttpInfoAsync(maintenanceWindowId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Updates the name, query, start time, or end time of an existing maintenance window.
   *
   * @param maintenanceWindowId The UUID of the maintenance window. (required)
   * @param body Maintenance window payload. (required)
   * @return ApiResponse&lt;MaintenanceWindowResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<MaintenanceWindowResponse> updateMaintenanceWindowWithHttpInfo(
      String maintenanceWindowId, MaintenanceWindowUpdateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'maintenanceWindowId' is set
    if (maintenanceWindowId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'maintenanceWindowId' when calling"
              + " updateMaintenanceWindow");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateMaintenanceWindow");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/maintenance_windows/{maintenance_window_id}"
            .replaceAll(
                "\\{" + "maintenance_window_id" + "\\}",
                apiClient.escapeString(maintenanceWindowId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CaseManagementApi.updateMaintenanceWindow",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "PUT",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<MaintenanceWindowResponse>() {});
  }

  /**
   * Update a maintenance window.
   *
   * <p>See {@link #updateMaintenanceWindowWithHttpInfo}.
   *
   * @param maintenanceWindowId The UUID of the maintenance window. (required)
   * @param body Maintenance window payload. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;MaintenanceWindowResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<MaintenanceWindowResponse>>
      updateMaintenanceWindowWithHttpInfoAsync(
          String maintenanceWindowId, MaintenanceWindowUpdateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'maintenanceWindowId' is set
    if (maintenanceWindowId == null) {
      CompletableFuture<ApiResponse<MaintenanceWindowResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'maintenanceWindowId' when calling"
                  + " updateMaintenanceWindow"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<MaintenanceWindowResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateMaintenanceWindow"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/maintenance_windows/{maintenance_window_id}"
            .replaceAll(
                "\\{" + "maintenance_window_id" + "\\}",
                apiClient.escapeString(maintenanceWindowId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CaseManagementApi.updateMaintenanceWindow",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<MaintenanceWindowResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "PUT",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<MaintenanceWindowResponse>() {});
  }

  /**
   * Update case priority.
   *
   * <p>See {@link #updatePriorityWithHttpInfo}.
   *
   * @param caseId Case's UUID or key (required)
   * @param body Case priority update payload (required)
   * @return CaseResponse
   * @throws ApiException if fails to make API call
   */
  public CaseResponse updatePriority(String caseId, CaseUpdatePriorityRequest body)
      throws ApiException {
    return updatePriorityWithHttpInfo(caseId, body).getData();
  }

  /**
   * Update case priority.
   *
   * <p>See {@link #updatePriorityWithHttpInfoAsync}.
   *
   * @param caseId Case's UUID or key (required)
   * @param body Case priority update payload (required)
   * @return CompletableFuture&lt;CaseResponse&gt;
   */
  public CompletableFuture<CaseResponse> updatePriorityAsync(
      String caseId, CaseUpdatePriorityRequest body) {
    return updatePriorityWithHttpInfoAsync(caseId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update case priority
   *
   * @param caseId Case's UUID or key (required)
   * @param body Case priority update payload (required)
   * @return ApiResponse&lt;CaseResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CaseResponse> updatePriorityWithHttpInfo(
      String caseId, CaseUpdatePriorityRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'caseId' is set
    if (caseId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'caseId' when calling updatePriority");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updatePriority");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/{case_id}/priority"
            .replaceAll("\\{" + "case_id" + "\\}", apiClient.escapeString(caseId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CaseManagementApi.updatePriority",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<CaseResponse>() {});
  }

  /**
   * Update case priority.
   *
   * <p>See {@link #updatePriorityWithHttpInfo}.
   *
   * @param caseId Case's UUID or key (required)
   * @param body Case priority update payload (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CaseResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CaseResponse>> updatePriorityWithHttpInfoAsync(
      String caseId, CaseUpdatePriorityRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'caseId' is set
    if (caseId == null) {
      CompletableFuture<ApiResponse<CaseResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'caseId' when calling updatePriority"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<CaseResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updatePriority"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/{case_id}/priority"
            .replaceAll("\\{" + "case_id" + "\\}", apiClient.escapeString(caseId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CaseManagementApi.updatePriority",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CaseResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<CaseResponse>() {});
  }

  /**
   * Update a project.
   *
   * <p>See {@link #updateProjectWithHttpInfo}.
   *
   * @param projectId Project UUID. (required)
   * @param body Project payload. (required)
   * @return ProjectResponse
   * @throws ApiException if fails to make API call
   */
  public ProjectResponse updateProject(String projectId, ProjectUpdateRequest body)
      throws ApiException {
    return updateProjectWithHttpInfo(projectId, body).getData();
  }

  /**
   * Update a project.
   *
   * <p>See {@link #updateProjectWithHttpInfoAsync}.
   *
   * @param projectId Project UUID. (required)
   * @param body Project payload. (required)
   * @return CompletableFuture&lt;ProjectResponse&gt;
   */
  public CompletableFuture<ProjectResponse> updateProjectAsync(
      String projectId, ProjectUpdateRequest body) {
    return updateProjectWithHttpInfoAsync(projectId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update a project.
   *
   * @param projectId Project UUID. (required)
   * @param body Project payload. (required)
   * @return ApiResponse&lt;ProjectResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ProjectResponse> updateProjectWithHttpInfo(
      String projectId, ProjectUpdateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'projectId' when calling updateProject");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateProject");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/projects/{project_id}"
            .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CaseManagementApi.updateProject",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<ProjectResponse>() {});
  }

  /**
   * Update a project.
   *
   * <p>See {@link #updateProjectWithHttpInfo}.
   *
   * @param projectId Project UUID. (required)
   * @param body Project payload. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ProjectResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ProjectResponse>> updateProjectWithHttpInfoAsync(
      String projectId, ProjectUpdateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      CompletableFuture<ApiResponse<ProjectResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'projectId' when calling updateProject"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<ProjectResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateProject"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/projects/{project_id}"
            .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CaseManagementApi.updateProject",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ProjectResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<ProjectResponse>() {});
  }

  /**
   * Update a notification rule.
   *
   * <p>See {@link #updateProjectNotificationRuleWithHttpInfo}.
   *
   * @param projectId Project UUID (required)
   * @param notificationRuleId Notification Rule UUID (required)
   * @param body Notification rule payload (required)
   * @throws ApiException if fails to make API call
   */
  public void updateProjectNotificationRule(
      String projectId, String notificationRuleId, CaseNotificationRuleUpdateRequest body)
      throws ApiException {
    updateProjectNotificationRuleWithHttpInfo(projectId, notificationRuleId, body);
  }

  /**
   * Update a notification rule.
   *
   * <p>See {@link #updateProjectNotificationRuleWithHttpInfoAsync}.
   *
   * @param projectId Project UUID (required)
   * @param notificationRuleId Notification Rule UUID (required)
   * @param body Notification rule payload (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> updateProjectNotificationRuleAsync(
      String projectId, String notificationRuleId, CaseNotificationRuleUpdateRequest body) {
    return updateProjectNotificationRuleWithHttpInfoAsync(projectId, notificationRuleId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update a notification rule.
   *
   * @param projectId Project UUID (required)
   * @param notificationRuleId Notification Rule UUID (required)
   * @param body Notification rule payload (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> updateProjectNotificationRuleWithHttpInfo(
      String projectId, String notificationRuleId, CaseNotificationRuleUpdateRequest body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'projectId' when calling updateProjectNotificationRule");
    }

    // verify the required parameter 'notificationRuleId' is set
    if (notificationRuleId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'notificationRuleId' when calling"
              + " updateProjectNotificationRule");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateProjectNotificationRule");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/projects/{project_id}/notification_rules/{notification_rule_id}"
            .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()))
            .replaceAll(
                "\\{" + "notification_rule_id" + "\\}",
                apiClient.escapeString(notificationRuleId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CaseManagementApi.updateProjectNotificationRule",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "PUT",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Update a notification rule.
   *
   * <p>See {@link #updateProjectNotificationRuleWithHttpInfo}.
   *
   * @param projectId Project UUID (required)
   * @param notificationRuleId Notification Rule UUID (required)
   * @param body Notification rule payload (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> updateProjectNotificationRuleWithHttpInfoAsync(
      String projectId, String notificationRuleId, CaseNotificationRuleUpdateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'projectId' when calling"
                  + " updateProjectNotificationRule"));
      return result;
    }

    // verify the required parameter 'notificationRuleId' is set
    if (notificationRuleId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'notificationRuleId' when calling"
                  + " updateProjectNotificationRule"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling updateProjectNotificationRule"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/projects/{project_id}/notification_rules/{notification_rule_id}"
            .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()))
            .replaceAll(
                "\\{" + "notification_rule_id" + "\\}",
                apiClient.escapeString(notificationRuleId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CaseManagementApi.updateProjectNotificationRule",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"*/*"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "PUT",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Update case status.
   *
   * <p>See {@link #updateStatusWithHttpInfo}.
   *
   * @param caseId Case's UUID or key (required)
   * @param body Case status update payload (required)
   * @return CaseResponse
   * @throws ApiException if fails to make API call
   */
  public CaseResponse updateStatus(String caseId, CaseUpdateStatusRequest body)
      throws ApiException {
    return updateStatusWithHttpInfo(caseId, body).getData();
  }

  /**
   * Update case status.
   *
   * <p>See {@link #updateStatusWithHttpInfoAsync}.
   *
   * @param caseId Case's UUID or key (required)
   * @param body Case status update payload (required)
   * @return CompletableFuture&lt;CaseResponse&gt;
   */
  public CompletableFuture<CaseResponse> updateStatusAsync(
      String caseId, CaseUpdateStatusRequest body) {
    return updateStatusWithHttpInfoAsync(caseId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update case status
   *
   * @param caseId Case's UUID or key (required)
   * @param body Case status update payload (required)
   * @return ApiResponse&lt;CaseResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CaseResponse> updateStatusWithHttpInfo(
      String caseId, CaseUpdateStatusRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'caseId' is set
    if (caseId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'caseId' when calling updateStatus");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateStatus");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/{case_id}/status"
            .replaceAll("\\{" + "case_id" + "\\}", apiClient.escapeString(caseId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CaseManagementApi.updateStatus",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<CaseResponse>() {});
  }

  /**
   * Update case status.
   *
   * <p>See {@link #updateStatusWithHttpInfo}.
   *
   * @param caseId Case's UUID or key (required)
   * @param body Case status update payload (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CaseResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CaseResponse>> updateStatusWithHttpInfoAsync(
      String caseId, CaseUpdateStatusRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'caseId' is set
    if (caseId == null) {
      CompletableFuture<ApiResponse<CaseResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'caseId' when calling updateStatus"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<CaseResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'body' when calling updateStatus"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/{case_id}/status"
            .replaceAll("\\{" + "case_id" + "\\}", apiClient.escapeString(caseId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CaseManagementApi.updateStatus",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CaseResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<CaseResponse>() {});
  }

  /**
   * Watch a case.
   *
   * <p>See {@link #watchCaseWithHttpInfo}.
   *
   * @param caseId Case's UUID or key (required)
   * @param userUuid The UUID of the user to add or remove as a watcher. (required)
   * @throws ApiException if fails to make API call
   */
  public void watchCase(String caseId, String userUuid) throws ApiException {
    watchCaseWithHttpInfo(caseId, userUuid);
  }

  /**
   * Watch a case.
   *
   * <p>See {@link #watchCaseWithHttpInfoAsync}.
   *
   * @param caseId Case's UUID or key (required)
   * @param userUuid The UUID of the user to add or remove as a watcher. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> watchCaseAsync(String caseId, String userUuid) {
    return watchCaseWithHttpInfoAsync(caseId, userUuid)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Adds a user (identified by their UUID) as a watcher of a case. The user receives notifications
   * about subsequent updates to the case.
   *
   * @param caseId Case's UUID or key (required)
   * @param userUuid The UUID of the user to add or remove as a watcher. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> watchCaseWithHttpInfo(String caseId, String userUuid)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'caseId' is set
    if (caseId == null) {
      throw new ApiException(400, "Missing the required parameter 'caseId' when calling watchCase");
    }

    // verify the required parameter 'userUuid' is set
    if (userUuid == null) {
      throw new ApiException(
          400, "Missing the required parameter 'userUuid' when calling watchCase");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/{case_id}/watchers/{user_uuid}"
            .replaceAll("\\{" + "case_id" + "\\}", apiClient.escapeString(caseId.toString()))
            .replaceAll("\\{" + "user_uuid" + "\\}", apiClient.escapeString(userUuid.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CaseManagementApi.watchCase",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Watch a case.
   *
   * <p>See {@link #watchCaseWithHttpInfo}.
   *
   * @param caseId Case's UUID or key (required)
   * @param userUuid The UUID of the user to add or remove as a watcher. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> watchCaseWithHttpInfoAsync(
      String caseId, String userUuid) {
    Object localVarPostBody = null;

    // verify the required parameter 'caseId' is set
    if (caseId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'caseId' when calling watchCase"));
      return result;
    }

    // verify the required parameter 'userUuid' is set
    if (userUuid == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'userUuid' when calling watchCase"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/{case_id}/watchers/{user_uuid}"
            .replaceAll("\\{" + "case_id" + "\\}", apiClient.escapeString(caseId.toString()))
            .replaceAll("\\{" + "user_uuid" + "\\}", apiClient.escapeString(userUuid.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CaseManagementApi.watchCase",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"*/*"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }
}
