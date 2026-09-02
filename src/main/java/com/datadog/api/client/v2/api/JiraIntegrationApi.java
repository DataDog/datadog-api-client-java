
package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.PaginationIterable;

import jakarta.ws.rs.core.GenericType;
import jakarta.ws.rs.client.Invocation;

import java.io.File;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.concurrent.CompletableFuture;
import java.time.OffsetDateTime;
import java.util.UUID;
import com.datadog.api.client.v2.model.JiraAccountsResponse;
import com.datadog.api.client.v2.model.JiraIssueTemplatesResponse;
import com.datadog.api.client.v2.model.JiraIssueTemplateResponse;
import com.datadog.api.client.v2.model.JiraIssueTemplateCreateRequest;
import com.datadog.api.client.v2.model.JiraIssueTemplateUpdateRequest;


@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class JiraIntegrationApi {
  private ApiClient apiClient;
  public JiraIntegrationApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public JiraIntegrationApi(ApiClient apiClient) {
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
 * Create Jira issue template.
 *
 * See {@link #createJiraIssueTemplateWithHttpInfo}.
 *
 * @param body  (required)
 * @return JiraIssueTemplateResponse
 * @throws ApiException if fails to make API call
 */
  public JiraIssueTemplateResponse  createJiraIssueTemplate(JiraIssueTemplateCreateRequest body) throws ApiException {
    return createJiraIssueTemplateWithHttpInfo(body).getData();
  }

  /**
 * Create Jira issue template.
 *
 * See {@link #createJiraIssueTemplateWithHttpInfoAsync}.
 *
 * @param body  (required)
 * @return CompletableFuture&lt;JiraIssueTemplateResponse&gt;
 */
  public CompletableFuture<JiraIssueTemplateResponse>createJiraIssueTemplateAsync(JiraIssueTemplateCreateRequest body) {
    return createJiraIssueTemplateWithHttpInfoAsync(body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Create a new Jira issue template.</p>
   *
   * @param body  (required)
   * @return ApiResponse&lt;JiraIssueTemplateResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<JiraIssueTemplateResponse> createJiraIssueTemplateWithHttpInfo(JiraIssueTemplateCreateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createJiraIssueTemplate";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createJiraIssueTemplate");
    }
    // create path and map variables
    String localVarPath = "/api/v2/integration/jira/issue-templates";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.JiraIntegrationApi.createJiraIssueTemplate", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<JiraIssueTemplateResponse>() {});
  }

  /**
   * Create Jira issue template.
   *
   * See {@link #createJiraIssueTemplateWithHttpInfo}.
   *
   * @param body  (required)
   * @return CompletableFuture&lt;ApiResponse&lt;JiraIssueTemplateResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<JiraIssueTemplateResponse>> createJiraIssueTemplateWithHttpInfoAsync(JiraIssueTemplateCreateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createJiraIssueTemplate";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<JiraIssueTemplateResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<JiraIssueTemplateResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling createJiraIssueTemplate"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/integration/jira/issue-templates";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.JiraIntegrationApi.createJiraIssueTemplate", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<JiraIssueTemplateResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<JiraIssueTemplateResponse>() {});
  }

  /**
 * Delete Jira account.
 *
 * See {@link #deleteJiraAccountWithHttpInfo}.
 *
 * @param accountId The ID of the Jira account to delete (required)
 * @throws ApiException if fails to make API call
 */
  public  void  deleteJiraAccount(UUID accountId) throws ApiException {
    deleteJiraAccountWithHttpInfo(accountId);
  }

  /**
 * Delete Jira account.
 *
 * See {@link #deleteJiraAccountWithHttpInfoAsync}.
 *
 * @param accountId The ID of the Jira account to delete (required)
 * @return CompletableFuture
 */
  public CompletableFuture<Void>deleteJiraAccountAsync(UUID accountId) {
    return deleteJiraAccountWithHttpInfoAsync(accountId).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Delete a Jira account by ID.</p>
   *
   * @param accountId The ID of the Jira account to delete (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteJiraAccountWithHttpInfo(UUID accountId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteJiraAccount";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteJiraAccount");
    }
    // create path and map variables
    String localVarPath = "/api/v2/integration/jira/accounts/{account_id}"
      .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.JiraIntegrationApi.deleteJiraAccount", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("DELETE", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
   * Delete Jira account.
   *
   * See {@link #deleteJiraAccountWithHttpInfo}.
   *
   * @param accountId The ID of the Jira account to delete (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteJiraAccountWithHttpInfoAsync(UUID accountId) {
    // Check if unstable operation is enabled
    String operationId = "deleteJiraAccount";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
        CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'accountId' when calling deleteJiraAccount"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/integration/jira/accounts/{account_id}"
      .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.JiraIntegrationApi.deleteJiraAccount", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("DELETE", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
 * Delete Jira issue template.
 *
 * See {@link #deleteJiraIssueTemplateWithHttpInfo}.
 *
 * @param issueTemplateId The ID of the Jira issue template to delete (required)
 * @throws ApiException if fails to make API call
 */
  public  void  deleteJiraIssueTemplate(UUID issueTemplateId) throws ApiException {
    deleteJiraIssueTemplateWithHttpInfo(issueTemplateId);
  }

  /**
 * Delete Jira issue template.
 *
 * See {@link #deleteJiraIssueTemplateWithHttpInfoAsync}.
 *
 * @param issueTemplateId The ID of the Jira issue template to delete (required)
 * @return CompletableFuture
 */
  public CompletableFuture<Void>deleteJiraIssueTemplateAsync(UUID issueTemplateId) {
    return deleteJiraIssueTemplateWithHttpInfoAsync(issueTemplateId).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Delete a Jira issue template by ID.</p>
   *
   * @param issueTemplateId The ID of the Jira issue template to delete (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteJiraIssueTemplateWithHttpInfo(UUID issueTemplateId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteJiraIssueTemplate";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'issueTemplateId' is set
    if (issueTemplateId == null) {
      throw new ApiException(400, "Missing the required parameter 'issueTemplateId' when calling deleteJiraIssueTemplate");
    }
    // create path and map variables
    String localVarPath = "/api/v2/integration/jira/issue-templates/{issue_template_id}"
      .replaceAll("\\{" + "issue_template_id" + "\\}", apiClient.escapeString(issueTemplateId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.JiraIntegrationApi.deleteJiraIssueTemplate", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("DELETE", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
   * Delete Jira issue template.
   *
   * See {@link #deleteJiraIssueTemplateWithHttpInfo}.
   *
   * @param issueTemplateId The ID of the Jira issue template to delete (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteJiraIssueTemplateWithHttpInfoAsync(UUID issueTemplateId) {
    // Check if unstable operation is enabled
    String operationId = "deleteJiraIssueTemplate";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'issueTemplateId' is set
    if (issueTemplateId == null) {
        CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'issueTemplateId' when calling deleteJiraIssueTemplate"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/integration/jira/issue-templates/{issue_template_id}"
      .replaceAll("\\{" + "issue_template_id" + "\\}", apiClient.escapeString(issueTemplateId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.JiraIntegrationApi.deleteJiraIssueTemplate", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("DELETE", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
 * Get Jira issue template.
 *
 * See {@link #getJiraIssueTemplateWithHttpInfo}.
 *
 * @param issueTemplateId The ID of the Jira issue template to retrieve (required)
 * @return JiraIssueTemplateResponse
 * @throws ApiException if fails to make API call
 */
  public JiraIssueTemplateResponse  getJiraIssueTemplate(UUID issueTemplateId) throws ApiException {
    return getJiraIssueTemplateWithHttpInfo(issueTemplateId).getData();
  }

  /**
 * Get Jira issue template.
 *
 * See {@link #getJiraIssueTemplateWithHttpInfoAsync}.
 *
 * @param issueTemplateId The ID of the Jira issue template to retrieve (required)
 * @return CompletableFuture&lt;JiraIssueTemplateResponse&gt;
 */
  public CompletableFuture<JiraIssueTemplateResponse>getJiraIssueTemplateAsync(UUID issueTemplateId) {
    return getJiraIssueTemplateWithHttpInfoAsync(issueTemplateId).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get a Jira issue template by ID.</p>
   *
   * @param issueTemplateId The ID of the Jira issue template to retrieve (required)
   * @return ApiResponse&lt;JiraIssueTemplateResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<JiraIssueTemplateResponse> getJiraIssueTemplateWithHttpInfo(UUID issueTemplateId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getJiraIssueTemplate";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'issueTemplateId' is set
    if (issueTemplateId == null) {
      throw new ApiException(400, "Missing the required parameter 'issueTemplateId' when calling getJiraIssueTemplate");
    }
    // create path and map variables
    String localVarPath = "/api/v2/integration/jira/issue-templates/{issue_template_id}"
      .replaceAll("\\{" + "issue_template_id" + "\\}", apiClient.escapeString(issueTemplateId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.JiraIntegrationApi.getJiraIssueTemplate", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<JiraIssueTemplateResponse>() {});
  }

  /**
   * Get Jira issue template.
   *
   * See {@link #getJiraIssueTemplateWithHttpInfo}.
   *
   * @param issueTemplateId The ID of the Jira issue template to retrieve (required)
   * @return CompletableFuture&lt;ApiResponse&lt;JiraIssueTemplateResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<JiraIssueTemplateResponse>> getJiraIssueTemplateWithHttpInfoAsync(UUID issueTemplateId) {
    // Check if unstable operation is enabled
    String operationId = "getJiraIssueTemplate";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<JiraIssueTemplateResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'issueTemplateId' is set
    if (issueTemplateId == null) {
        CompletableFuture<ApiResponse<JiraIssueTemplateResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'issueTemplateId' when calling getJiraIssueTemplate"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/integration/jira/issue-templates/{issue_template_id}"
      .replaceAll("\\{" + "issue_template_id" + "\\}", apiClient.escapeString(issueTemplateId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.JiraIntegrationApi.getJiraIssueTemplate", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<JiraIssueTemplateResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<JiraIssueTemplateResponse>() {});
  }

  /**
 * List Jira accounts.
 *
 * See {@link #listJiraAccountsWithHttpInfo}.
 *
 * @return JiraAccountsResponse
 * @throws ApiException if fails to make API call
 */
  public JiraAccountsResponse  listJiraAccounts() throws ApiException {
    return listJiraAccountsWithHttpInfo().getData();
  }

  /**
 * List Jira accounts.
 *
 * See {@link #listJiraAccountsWithHttpInfoAsync}.
 *
 * @return CompletableFuture&lt;JiraAccountsResponse&gt;
 */
  public CompletableFuture<JiraAccountsResponse>listJiraAccountsAsync() {
    return listJiraAccountsWithHttpInfoAsync().thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get all Jira accounts for the organization.</p>
   *
   * @return ApiResponse&lt;JiraAccountsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<JiraAccountsResponse> listJiraAccountsWithHttpInfo() throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listJiraAccounts";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/integration/jira/accounts";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.JiraIntegrationApi.listJiraAccounts", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<JiraAccountsResponse>() {});
  }

  /**
   * List Jira accounts.
   *
   * See {@link #listJiraAccountsWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;JiraAccountsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<JiraAccountsResponse>> listJiraAccountsWithHttpInfoAsync() {
    // Check if unstable operation is enabled
    String operationId = "listJiraAccounts";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<JiraAccountsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/integration/jira/accounts";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.JiraIntegrationApi.listJiraAccounts", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<JiraAccountsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<JiraAccountsResponse>() {});
  }

  /**
 * List Jira issue templates.
 *
 * See {@link #listJiraIssueTemplatesWithHttpInfo}.
 *
 * @return JiraIssueTemplatesResponse
 * @throws ApiException if fails to make API call
 */
  public JiraIssueTemplatesResponse  listJiraIssueTemplates() throws ApiException {
    return listJiraIssueTemplatesWithHttpInfo().getData();
  }

  /**
 * List Jira issue templates.
 *
 * See {@link #listJiraIssueTemplatesWithHttpInfoAsync}.
 *
 * @return CompletableFuture&lt;JiraIssueTemplatesResponse&gt;
 */
  public CompletableFuture<JiraIssueTemplatesResponse>listJiraIssueTemplatesAsync() {
    return listJiraIssueTemplatesWithHttpInfoAsync().thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get all Jira issue templates for the organization.</p>
   *
   * @return ApiResponse&lt;JiraIssueTemplatesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<JiraIssueTemplatesResponse> listJiraIssueTemplatesWithHttpInfo() throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listJiraIssueTemplates";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/integration/jira/issue-templates";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.JiraIntegrationApi.listJiraIssueTemplates", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<JiraIssueTemplatesResponse>() {});
  }

  /**
   * List Jira issue templates.
   *
   * See {@link #listJiraIssueTemplatesWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;JiraIssueTemplatesResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<JiraIssueTemplatesResponse>> listJiraIssueTemplatesWithHttpInfoAsync() {
    // Check if unstable operation is enabled
    String operationId = "listJiraIssueTemplates";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<JiraIssueTemplatesResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/integration/jira/issue-templates";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.JiraIntegrationApi.listJiraIssueTemplates", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<JiraIssueTemplatesResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<JiraIssueTemplatesResponse>() {});
  }

  /**
 * Update Jira issue template.
 *
 * See {@link #updateJiraIssueTemplateWithHttpInfo}.
 *
 * @param issueTemplateId The ID of the Jira issue template to update (required)
 * @param body  (required)
 * @return JiraIssueTemplateResponse
 * @throws ApiException if fails to make API call
 */
  public JiraIssueTemplateResponse  updateJiraIssueTemplate(UUID issueTemplateId, JiraIssueTemplateUpdateRequest body) throws ApiException {
    return updateJiraIssueTemplateWithHttpInfo(issueTemplateId, body).getData();
  }

  /**
 * Update Jira issue template.
 *
 * See {@link #updateJiraIssueTemplateWithHttpInfoAsync}.
 *
 * @param issueTemplateId The ID of the Jira issue template to update (required)
 * @param body  (required)
 * @return CompletableFuture&lt;JiraIssueTemplateResponse&gt;
 */
  public CompletableFuture<JiraIssueTemplateResponse>updateJiraIssueTemplateAsync(UUID issueTemplateId, JiraIssueTemplateUpdateRequest body) {
    return updateJiraIssueTemplateWithHttpInfoAsync(issueTemplateId, body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Update a Jira issue template by ID.</p>
   *
   * @param issueTemplateId The ID of the Jira issue template to update (required)
   * @param body  (required)
   * @return ApiResponse&lt;JiraIssueTemplateResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<JiraIssueTemplateResponse> updateJiraIssueTemplateWithHttpInfo(UUID issueTemplateId, JiraIssueTemplateUpdateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateJiraIssueTemplate";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'issueTemplateId' is set
    if (issueTemplateId == null) {
      throw new ApiException(400, "Missing the required parameter 'issueTemplateId' when calling updateJiraIssueTemplate");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateJiraIssueTemplate");
    }
    // create path and map variables
    String localVarPath = "/api/v2/integration/jira/issue-templates/{issue_template_id}"
      .replaceAll("\\{" + "issue_template_id" + "\\}", apiClient.escapeString(issueTemplateId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.JiraIntegrationApi.updateJiraIssueTemplate", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("PATCH", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<JiraIssueTemplateResponse>() {});
  }

  /**
   * Update Jira issue template.
   *
   * See {@link #updateJiraIssueTemplateWithHttpInfo}.
   *
   * @param issueTemplateId The ID of the Jira issue template to update (required)
   * @param body  (required)
   * @return CompletableFuture&lt;ApiResponse&lt;JiraIssueTemplateResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<JiraIssueTemplateResponse>> updateJiraIssueTemplateWithHttpInfoAsync(UUID issueTemplateId, JiraIssueTemplateUpdateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "updateJiraIssueTemplate";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<JiraIssueTemplateResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'issueTemplateId' is set
    if (issueTemplateId == null) {
        CompletableFuture<ApiResponse<JiraIssueTemplateResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'issueTemplateId' when calling updateJiraIssueTemplate"));
        return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<JiraIssueTemplateResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling updateJiraIssueTemplate"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/integration/jira/issue-templates/{issue_template_id}"
      .replaceAll("\\{" + "issue_template_id" + "\\}", apiClient.escapeString(issueTemplateId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.JiraIntegrationApi.updateJiraIssueTemplate", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<JiraIssueTemplateResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("PATCH", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<JiraIssueTemplateResponse>() {});
  }
}