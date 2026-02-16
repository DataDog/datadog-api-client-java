package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.PaginationIterable;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.Case;
import com.datadog.api.client.v2.model.CaseAssignRequest;
import com.datadog.api.client.v2.model.CaseCommentRequest;
import com.datadog.api.client.v2.model.CaseCreateRequest;
import com.datadog.api.client.v2.model.CaseEmptyRequest;
import com.datadog.api.client.v2.model.CaseNotificationRuleCreateRequest;
import com.datadog.api.client.v2.model.CaseNotificationRuleResponse;
import com.datadog.api.client.v2.model.CaseNotificationRuleUpdateRequest;
import com.datadog.api.client.v2.model.CaseNotificationRulesResponse;
import com.datadog.api.client.v2.model.CaseResponse;
import com.datadog.api.client.v2.model.CaseSortableField;
import com.datadog.api.client.v2.model.CaseUpdateAttributesRequest;
import com.datadog.api.client.v2.model.CaseUpdateCustomAttributeRequest;
import com.datadog.api.client.v2.model.CaseUpdateDescriptionRequest;
import com.datadog.api.client.v2.model.CaseUpdatePriorityRequest;
import com.datadog.api.client.v2.model.CaseUpdateStatusRequest;
import com.datadog.api.client.v2.model.CaseUpdateTitleRequest;
import com.datadog.api.client.v2.model.CasesResponse;
import com.datadog.api.client.v2.model.ProjectCreateRequest;
import com.datadog.api.client.v2.model.ProjectResponse;
import com.datadog.api.client.v2.model.ProjectUpdateRequest;
import com.datadog.api.client.v2.model.ProjectsResponse;
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
   * Create a project.
   *
   * <p>See {@link #createProjectWithHttpInfo}.
   *
   * @param body Project payload (required)
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
   * @param body Project payload (required)
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
   * @param body Project payload (required)
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
   * @param body Project payload (required)
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
   * Delete case comment.
   *
   * <p>See {@link #deleteCaseCommentWithHttpInfo}.
   *
   * @param caseId Case's UUID or key (required)
   * @param cellId Timeline cell's UUID (required)
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
   * @param cellId Timeline cell's UUID (required)
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
   * @param cellId Timeline cell's UUID (required)
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
   * @param cellId Timeline cell's UUID (required)
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
   * Remove a project.
   *
   * <p>See {@link #deleteProjectWithHttpInfo}.
   *
   * @param projectId Project UUID (required)
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
   * @param projectId Project UUID (required)
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
   * @param projectId Project UUID (required)
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
   * @param projectId Project UUID (required)
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
   * Get the details of a project.
   *
   * <p>See {@link #getProjectWithHttpInfo}.
   *
   * @param projectId Project UUID (required)
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
   * @param projectId Project UUID (required)
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
   * @param projectId Project UUID (required)
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
   * @param projectId Project UUID (required)
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
    parameters.pageNumber(0l);
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
            limit,
            args);

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
   * @param projectId Project UUID (required)
   * @param body Project payload (required)
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
   * @param projectId Project UUID (required)
   * @param body Project payload (required)
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
   * @param projectId Project UUID (required)
   * @param body Project payload (required)
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
   * @param projectId Project UUID (required)
   * @param body Project payload (required)
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
}
