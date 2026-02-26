package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.GetIssueIncludeQueryParameterItem;
import com.datadog.api.client.v2.model.IssueResponse;
import com.datadog.api.client.v2.model.IssueUpdateAssigneeRequest;
import com.datadog.api.client.v2.model.IssueUpdateStateRequest;
import com.datadog.api.client.v2.model.IssuesSearchRequest;
import com.datadog.api.client.v2.model.IssuesSearchResponse;
import com.datadog.api.client.v2.model.SearchIssuesIncludeQueryParameterItem;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ErrorTrackingApi {
  private ApiClient apiClient;

  public ErrorTrackingApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public ErrorTrackingApi(ApiClient apiClient) {
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
   * Remove the assignee of an issue.
   *
   * <p>See {@link #deleteIssueAssigneeWithHttpInfo}.
   *
   * @param issueId The identifier of the issue. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteIssueAssignee(String issueId) throws ApiException {
    deleteIssueAssigneeWithHttpInfo(issueId);
  }

  /**
   * Remove the assignee of an issue.
   *
   * <p>See {@link #deleteIssueAssigneeWithHttpInfoAsync}.
   *
   * @param issueId The identifier of the issue. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteIssueAssigneeAsync(String issueId) {
    return deleteIssueAssigneeWithHttpInfoAsync(issueId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Remove the assignee of an issue by <code>issue_id</code>.
   *
   * @param issueId The identifier of the issue. (required)
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
  public ApiResponse<Void> deleteIssueAssigneeWithHttpInfo(String issueId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'issueId' is set
    if (issueId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'issueId' when calling deleteIssueAssignee");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/error-tracking/issues/{issue_id}/assignee"
            .replaceAll("\\{" + "issue_id" + "\\}", apiClient.escapeString(issueId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ErrorTrackingApi.deleteIssueAssignee",
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
   * Remove the assignee of an issue.
   *
   * <p>See {@link #deleteIssueAssigneeWithHttpInfo}.
   *
   * @param issueId The identifier of the issue. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteIssueAssigneeWithHttpInfoAsync(String issueId) {
    Object localVarPostBody = null;

    // verify the required parameter 'issueId' is set
    if (issueId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'issueId' when calling deleteIssueAssignee"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/error-tracking/issues/{issue_id}/assignee"
            .replaceAll("\\{" + "issue_id" + "\\}", apiClient.escapeString(issueId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ErrorTrackingApi.deleteIssueAssignee",
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

  /** Manage optional parameters to getIssue. */
  public static class GetIssueOptionalParameters {
    private List<GetIssueIncludeQueryParameterItem> include;

    /**
     * Set include.
     *
     * @param include Comma-separated list of relationship objects that should be included in the
     *     response. Possible values are <code>assignee</code>, <code>case</code>, and <code>
     *     team_owners</code>. (optional)
     * @return GetIssueOptionalParameters
     */
    public GetIssueOptionalParameters include(List<GetIssueIncludeQueryParameterItem> include) {
      this.include = include;
      return this;
    }
  }

  /**
   * Get the details of an error tracking issue.
   *
   * <p>See {@link #getIssueWithHttpInfo}.
   *
   * @param issueId The identifier of the issue. (required)
   * @return IssueResponse
   * @throws ApiException if fails to make API call
   */
  public IssueResponse getIssue(String issueId) throws ApiException {
    return getIssueWithHttpInfo(issueId, new GetIssueOptionalParameters()).getData();
  }

  /**
   * Get the details of an error tracking issue.
   *
   * <p>See {@link #getIssueWithHttpInfoAsync}.
   *
   * @param issueId The identifier of the issue. (required)
   * @return CompletableFuture&lt;IssueResponse&gt;
   */
  public CompletableFuture<IssueResponse> getIssueAsync(String issueId) {
    return getIssueWithHttpInfoAsync(issueId, new GetIssueOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the details of an error tracking issue.
   *
   * <p>See {@link #getIssueWithHttpInfo}.
   *
   * @param issueId The identifier of the issue. (required)
   * @param parameters Optional parameters for the request.
   * @return IssueResponse
   * @throws ApiException if fails to make API call
   */
  public IssueResponse getIssue(String issueId, GetIssueOptionalParameters parameters)
      throws ApiException {
    return getIssueWithHttpInfo(issueId, parameters).getData();
  }

  /**
   * Get the details of an error tracking issue.
   *
   * <p>See {@link #getIssueWithHttpInfoAsync}.
   *
   * @param issueId The identifier of the issue. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;IssueResponse&gt;
   */
  public CompletableFuture<IssueResponse> getIssueAsync(
      String issueId, GetIssueOptionalParameters parameters) {
    return getIssueWithHttpInfoAsync(issueId, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Retrieve the full details for a specific error tracking issue, including attributes and
   * relationships.
   *
   * @param issueId The identifier of the issue. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;IssueResponse&gt;
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
  public ApiResponse<IssueResponse> getIssueWithHttpInfo(
      String issueId, GetIssueOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'issueId' is set
    if (issueId == null) {
      throw new ApiException(400, "Missing the required parameter 'issueId' when calling getIssue");
    }
    List<GetIssueIncludeQueryParameterItem> include = parameters.include;
    // create path and map variables
    String localVarPath =
        "/api/v2/error-tracking/issues/{issue_id}"
            .replaceAll("\\{" + "issue_id" + "\\}", apiClient.escapeString(issueId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ErrorTrackingApi.getIssue",
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
        new GenericType<IssueResponse>() {});
  }

  /**
   * Get the details of an error tracking issue.
   *
   * <p>See {@link #getIssueWithHttpInfo}.
   *
   * @param issueId The identifier of the issue. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;IssueResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IssueResponse>> getIssueWithHttpInfoAsync(
      String issueId, GetIssueOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'issueId' is set
    if (issueId == null) {
      CompletableFuture<ApiResponse<IssueResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'issueId' when calling getIssue"));
      return result;
    }
    List<GetIssueIncludeQueryParameterItem> include = parameters.include;
    // create path and map variables
    String localVarPath =
        "/api/v2/error-tracking/issues/{issue_id}"
            .replaceAll("\\{" + "issue_id" + "\\}", apiClient.escapeString(issueId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ErrorTrackingApi.getIssue",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IssueResponse>> result = new CompletableFuture<>();
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
        new GenericType<IssueResponse>() {});
  }

  /** Manage optional parameters to searchIssues. */
  public static class SearchIssuesOptionalParameters {
    private List<SearchIssuesIncludeQueryParameterItem> include;

    /**
     * Set include.
     *
     * @param include Comma-separated list of relationship objects that should be included in the
     *     response. Possible values are <code>issue</code>, <code>issue.assignee</code>, <code>
     *     issue.case</code>, and <code>issue.team_owners</code>. (optional)
     * @return SearchIssuesOptionalParameters
     */
    public SearchIssuesOptionalParameters include(
        List<SearchIssuesIncludeQueryParameterItem> include) {
      this.include = include;
      return this;
    }
  }

  /**
   * Search error tracking issues.
   *
   * <p>See {@link #searchIssuesWithHttpInfo}.
   *
   * @param body Search issues request payload. (required)
   * @return IssuesSearchResponse
   * @throws ApiException if fails to make API call
   */
  public IssuesSearchResponse searchIssues(IssuesSearchRequest body) throws ApiException {
    return searchIssuesWithHttpInfo(body, new SearchIssuesOptionalParameters()).getData();
  }

  /**
   * Search error tracking issues.
   *
   * <p>See {@link #searchIssuesWithHttpInfoAsync}.
   *
   * @param body Search issues request payload. (required)
   * @return CompletableFuture&lt;IssuesSearchResponse&gt;
   */
  public CompletableFuture<IssuesSearchResponse> searchIssuesAsync(IssuesSearchRequest body) {
    return searchIssuesWithHttpInfoAsync(body, new SearchIssuesOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Search error tracking issues.
   *
   * <p>See {@link #searchIssuesWithHttpInfo}.
   *
   * @param body Search issues request payload. (required)
   * @param parameters Optional parameters for the request.
   * @return IssuesSearchResponse
   * @throws ApiException if fails to make API call
   */
  public IssuesSearchResponse searchIssues(
      IssuesSearchRequest body, SearchIssuesOptionalParameters parameters) throws ApiException {
    return searchIssuesWithHttpInfo(body, parameters).getData();
  }

  /**
   * Search error tracking issues.
   *
   * <p>See {@link #searchIssuesWithHttpInfoAsync}.
   *
   * @param body Search issues request payload. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;IssuesSearchResponse&gt;
   */
  public CompletableFuture<IssuesSearchResponse> searchIssuesAsync(
      IssuesSearchRequest body, SearchIssuesOptionalParameters parameters) {
    return searchIssuesWithHttpInfoAsync(body, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Search issues endpoint allows you to programmatically search for issues within your
   * organization. This endpoint returns a list of issues that match a given search query, following
   * the event search syntax. The search results are limited to a maximum of 100 issues per request.
   *
   * @param body Search issues request payload. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;IssuesSearchResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<IssuesSearchResponse> searchIssuesWithHttpInfo(
      IssuesSearchRequest body, SearchIssuesOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling searchIssues");
    }
    List<SearchIssuesIncludeQueryParameterItem> include = parameters.include;
    // create path and map variables
    String localVarPath = "/api/v2/error-tracking/issues/search";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ErrorTrackingApi.searchIssues",
            localVarPath,
            localVarQueryParams,
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
        new GenericType<IssuesSearchResponse>() {});
  }

  /**
   * Search error tracking issues.
   *
   * <p>See {@link #searchIssuesWithHttpInfo}.
   *
   * @param body Search issues request payload. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;IssuesSearchResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IssuesSearchResponse>> searchIssuesWithHttpInfoAsync(
      IssuesSearchRequest body, SearchIssuesOptionalParameters parameters) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<IssuesSearchResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'body' when calling searchIssues"));
      return result;
    }
    List<SearchIssuesIncludeQueryParameterItem> include = parameters.include;
    // create path and map variables
    String localVarPath = "/api/v2/error-tracking/issues/search";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ErrorTrackingApi.searchIssues",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IssuesSearchResponse>> result = new CompletableFuture<>();
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
        new GenericType<IssuesSearchResponse>() {});
  }

  /**
   * Update the assignee of an issue.
   *
   * <p>See {@link #updateIssueAssigneeWithHttpInfo}.
   *
   * @param issueId The identifier of the issue. (required)
   * @param body Update issue assignee request payload. (required)
   * @return IssueResponse
   * @throws ApiException if fails to make API call
   */
  public IssueResponse updateIssueAssignee(String issueId, IssueUpdateAssigneeRequest body)
      throws ApiException {
    return updateIssueAssigneeWithHttpInfo(issueId, body).getData();
  }

  /**
   * Update the assignee of an issue.
   *
   * <p>See {@link #updateIssueAssigneeWithHttpInfoAsync}.
   *
   * @param issueId The identifier of the issue. (required)
   * @param body Update issue assignee request payload. (required)
   * @return CompletableFuture&lt;IssueResponse&gt;
   */
  public CompletableFuture<IssueResponse> updateIssueAssigneeAsync(
      String issueId, IssueUpdateAssigneeRequest body) {
    return updateIssueAssigneeWithHttpInfoAsync(issueId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update the assignee of an issue by <code>issue_id</code>.
   *
   * @param issueId The identifier of the issue. (required)
   * @param body Update issue assignee request payload. (required)
   * @return ApiResponse&lt;IssueResponse&gt;
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
  public ApiResponse<IssueResponse> updateIssueAssigneeWithHttpInfo(
      String issueId, IssueUpdateAssigneeRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'issueId' is set
    if (issueId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'issueId' when calling updateIssueAssignee");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateIssueAssignee");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/error-tracking/issues/{issue_id}/assignee"
            .replaceAll("\\{" + "issue_id" + "\\}", apiClient.escapeString(issueId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ErrorTrackingApi.updateIssueAssignee",
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
        new GenericType<IssueResponse>() {});
  }

  /**
   * Update the assignee of an issue.
   *
   * <p>See {@link #updateIssueAssigneeWithHttpInfo}.
   *
   * @param issueId The identifier of the issue. (required)
   * @param body Update issue assignee request payload. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;IssueResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IssueResponse>> updateIssueAssigneeWithHttpInfoAsync(
      String issueId, IssueUpdateAssigneeRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'issueId' is set
    if (issueId == null) {
      CompletableFuture<ApiResponse<IssueResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'issueId' when calling updateIssueAssignee"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<IssueResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateIssueAssignee"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/error-tracking/issues/{issue_id}/assignee"
            .replaceAll("\\{" + "issue_id" + "\\}", apiClient.escapeString(issueId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ErrorTrackingApi.updateIssueAssignee",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IssueResponse>> result = new CompletableFuture<>();
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
        new GenericType<IssueResponse>() {});
  }

  /**
   * Update the state of an issue.
   *
   * <p>See {@link #updateIssueStateWithHttpInfo}.
   *
   * @param issueId The identifier of the issue. (required)
   * @param body Update issue state request payload. (required)
   * @return IssueResponse
   * @throws ApiException if fails to make API call
   */
  public IssueResponse updateIssueState(String issueId, IssueUpdateStateRequest body)
      throws ApiException {
    return updateIssueStateWithHttpInfo(issueId, body).getData();
  }

  /**
   * Update the state of an issue.
   *
   * <p>See {@link #updateIssueStateWithHttpInfoAsync}.
   *
   * @param issueId The identifier of the issue. (required)
   * @param body Update issue state request payload. (required)
   * @return CompletableFuture&lt;IssueResponse&gt;
   */
  public CompletableFuture<IssueResponse> updateIssueStateAsync(
      String issueId, IssueUpdateStateRequest body) {
    return updateIssueStateWithHttpInfoAsync(issueId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update the state of an issue by <code>issue_id</code>. Use this endpoint to move an issue
   * between states such as <code>OPEN</code>, <code>RESOLVED</code>, or <code>IGNORED</code>.
   *
   * @param issueId The identifier of the issue. (required)
   * @param body Update issue state request payload. (required)
   * @return ApiResponse&lt;IssueResponse&gt;
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
  public ApiResponse<IssueResponse> updateIssueStateWithHttpInfo(
      String issueId, IssueUpdateStateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'issueId' is set
    if (issueId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'issueId' when calling updateIssueState");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateIssueState");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/error-tracking/issues/{issue_id}/state"
            .replaceAll("\\{" + "issue_id" + "\\}", apiClient.escapeString(issueId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ErrorTrackingApi.updateIssueState",
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
        new GenericType<IssueResponse>() {});
  }

  /**
   * Update the state of an issue.
   *
   * <p>See {@link #updateIssueStateWithHttpInfo}.
   *
   * @param issueId The identifier of the issue. (required)
   * @param body Update issue state request payload. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;IssueResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IssueResponse>> updateIssueStateWithHttpInfoAsync(
      String issueId, IssueUpdateStateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'issueId' is set
    if (issueId == null) {
      CompletableFuture<ApiResponse<IssueResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'issueId' when calling updateIssueState"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<IssueResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateIssueState"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/error-tracking/issues/{issue_id}/state"
            .replaceAll("\\{" + "issue_id" + "\\}", apiClient.escapeString(issueId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ErrorTrackingApi.updateIssueState",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IssueResponse>> result = new CompletableFuture<>();
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
        new GenericType<IssueResponse>() {});
  }
}
