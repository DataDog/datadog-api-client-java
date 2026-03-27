
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
import com.datadog.api.client.v2.model.SensitiveDataScannerGetConfigResponse;
import com.datadog.api.client.v2.model.SensitiveDataScannerReorderGroupsResponse;
import com.datadog.api.client.v2.model.SensitiveDataScannerConfigRequest;
import com.datadog.api.client.v2.model.SensitiveDataScannerCreateGroupResponse;
import com.datadog.api.client.v2.model.SensitiveDataScannerGroupCreateRequest;
import com.datadog.api.client.v2.model.SensitiveDataScannerGroupDeleteResponse;
import com.datadog.api.client.v2.model.SensitiveDataScannerGroupDeleteRequest;
import com.datadog.api.client.v2.model.SensitiveDataScannerGroupUpdateResponse;
import com.datadog.api.client.v2.model.SensitiveDataScannerGroupUpdateRequest;
import com.datadog.api.client.v2.model.SensitiveDataScannerCreateRuleResponse;
import com.datadog.api.client.v2.model.SensitiveDataScannerRuleCreateRequest;
import com.datadog.api.client.v2.model.SensitiveDataScannerRuleDeleteResponse;
import com.datadog.api.client.v2.model.SensitiveDataScannerRuleDeleteRequest;
import com.datadog.api.client.v2.model.SensitiveDataScannerRuleUpdateResponse;
import com.datadog.api.client.v2.model.SensitiveDataScannerRuleUpdateRequest;
import com.datadog.api.client.v2.model.SensitiveDataScannerStandardPatternsResponseData;


@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SensitiveDataScannerApi {
  private ApiClient apiClient;
  public SensitiveDataScannerApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public SensitiveDataScannerApi(ApiClient apiClient) {
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
 * Create Scanning Group.
 *
 * See {@link #createScanningGroupWithHttpInfo}.
 *
 * @param body  (required)
 * @return SensitiveDataScannerCreateGroupResponse
 * @throws ApiException if fails to make API call
 */
  public SensitiveDataScannerCreateGroupResponse  createScanningGroup(SensitiveDataScannerGroupCreateRequest body) throws ApiException {
    return createScanningGroupWithHttpInfo(body).getData();
  }

  /**
 * Create Scanning Group.
 *
 * See {@link #createScanningGroupWithHttpInfoAsync}.
 *
 * @param body  (required)
 * @return CompletableFuture&lt;SensitiveDataScannerCreateGroupResponse&gt;
 */
  public CompletableFuture<SensitiveDataScannerCreateGroupResponse>createScanningGroupAsync(SensitiveDataScannerGroupCreateRequest body) {
    return createScanningGroupWithHttpInfoAsync(body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Create a scanning group.
   * The request MAY include a configuration relationship.
   * A rules relationship can be omitted entirely, but if it is included it MUST be
   * null or an empty array (rules cannot be created at the same time).
   * The new group will be ordered last within the configuration.</p>
   *
   * @param body  (required)
   * @return ApiResponse&lt;SensitiveDataScannerCreateGroupResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SensitiveDataScannerCreateGroupResponse> createScanningGroupWithHttpInfo(SensitiveDataScannerGroupCreateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createScanningGroup");
    }
    // create path and map variables
    String localVarPath = "/api/v2/sensitive-data-scanner/config/groups";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.SensitiveDataScannerApi.createScanningGroup", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SensitiveDataScannerCreateGroupResponse>() {});
  }

  /**
   * Create Scanning Group.
   *
   * See {@link #createScanningGroupWithHttpInfo}.
   *
   * @param body  (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SensitiveDataScannerCreateGroupResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SensitiveDataScannerCreateGroupResponse>> createScanningGroupWithHttpInfoAsync(SensitiveDataScannerGroupCreateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<SensitiveDataScannerCreateGroupResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling createScanningGroup"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/sensitive-data-scanner/config/groups";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.SensitiveDataScannerApi.createScanningGroup", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SensitiveDataScannerCreateGroupResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SensitiveDataScannerCreateGroupResponse>() {});
  }

  /**
 * Create Scanning Rule.
 *
 * See {@link #createScanningRuleWithHttpInfo}.
 *
 * @param body  (required)
 * @return SensitiveDataScannerCreateRuleResponse
 * @throws ApiException if fails to make API call
 */
  public SensitiveDataScannerCreateRuleResponse  createScanningRule(SensitiveDataScannerRuleCreateRequest body) throws ApiException {
    return createScanningRuleWithHttpInfo(body).getData();
  }

  /**
 * Create Scanning Rule.
 *
 * See {@link #createScanningRuleWithHttpInfoAsync}.
 *
 * @param body  (required)
 * @return CompletableFuture&lt;SensitiveDataScannerCreateRuleResponse&gt;
 */
  public CompletableFuture<SensitiveDataScannerCreateRuleResponse>createScanningRuleAsync(SensitiveDataScannerRuleCreateRequest body) {
    return createScanningRuleWithHttpInfoAsync(body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Create a scanning rule in a sensitive data scanner group, ordered last.
   * The posted rule MUST include a group relationship.
   * It MUST include either a standard_pattern relationship or a regex attribute, but not both.
   * If included_attributes is empty or missing, we will scan all attributes except
   * excluded_attributes. If both are missing, we will scan the whole event.</p>
   *
   * @param body  (required)
   * @return ApiResponse&lt;SensitiveDataScannerCreateRuleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SensitiveDataScannerCreateRuleResponse> createScanningRuleWithHttpInfo(SensitiveDataScannerRuleCreateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createScanningRule");
    }
    // create path and map variables
    String localVarPath = "/api/v2/sensitive-data-scanner/config/rules";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.SensitiveDataScannerApi.createScanningRule", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SensitiveDataScannerCreateRuleResponse>() {});
  }

  /**
   * Create Scanning Rule.
   *
   * See {@link #createScanningRuleWithHttpInfo}.
   *
   * @param body  (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SensitiveDataScannerCreateRuleResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SensitiveDataScannerCreateRuleResponse>> createScanningRuleWithHttpInfoAsync(SensitiveDataScannerRuleCreateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<SensitiveDataScannerCreateRuleResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling createScanningRule"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/sensitive-data-scanner/config/rules";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.SensitiveDataScannerApi.createScanningRule", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SensitiveDataScannerCreateRuleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SensitiveDataScannerCreateRuleResponse>() {});
  }

  /**
 * Delete Scanning Group.
 *
 * See {@link #deleteScanningGroupWithHttpInfo}.
 *
 * @param groupId The ID of a group of rules. (required)
 * @param body  (required)
 * @return SensitiveDataScannerGroupDeleteResponse
 * @throws ApiException if fails to make API call
 */
  public SensitiveDataScannerGroupDeleteResponse  deleteScanningGroup(String groupId, SensitiveDataScannerGroupDeleteRequest body) throws ApiException {
    return deleteScanningGroupWithHttpInfo(groupId, body).getData();
  }

  /**
 * Delete Scanning Group.
 *
 * See {@link #deleteScanningGroupWithHttpInfoAsync}.
 *
 * @param groupId The ID of a group of rules. (required)
 * @param body  (required)
 * @return CompletableFuture&lt;SensitiveDataScannerGroupDeleteResponse&gt;
 */
  public CompletableFuture<SensitiveDataScannerGroupDeleteResponse>deleteScanningGroupAsync(String groupId, SensitiveDataScannerGroupDeleteRequest body) {
    return deleteScanningGroupWithHttpInfoAsync(groupId, body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Delete a given group.</p>
   *
   * @param groupId The ID of a group of rules. (required)
   * @param body  (required)
   * @return ApiResponse&lt;SensitiveDataScannerGroupDeleteResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SensitiveDataScannerGroupDeleteResponse> deleteScanningGroupWithHttpInfo(String groupId, SensitiveDataScannerGroupDeleteRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'groupId' is set
    if (groupId == null) {
      throw new ApiException(400, "Missing the required parameter 'groupId' when calling deleteScanningGroup");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling deleteScanningGroup");
    }
    // create path and map variables
    String localVarPath = "/api/v2/sensitive-data-scanner/config/groups/{group_id}"
      .replaceAll("\\{" + "group_id" + "\\}", apiClient.escapeString(groupId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.SensitiveDataScannerApi.deleteScanningGroup", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("DELETE", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SensitiveDataScannerGroupDeleteResponse>() {});
  }

  /**
   * Delete Scanning Group.
   *
   * See {@link #deleteScanningGroupWithHttpInfo}.
   *
   * @param groupId The ID of a group of rules. (required)
   * @param body  (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SensitiveDataScannerGroupDeleteResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SensitiveDataScannerGroupDeleteResponse>> deleteScanningGroupWithHttpInfoAsync(String groupId, SensitiveDataScannerGroupDeleteRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'groupId' is set
    if (groupId == null) {
        CompletableFuture<ApiResponse<SensitiveDataScannerGroupDeleteResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'groupId' when calling deleteScanningGroup"));
        return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<SensitiveDataScannerGroupDeleteResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling deleteScanningGroup"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/sensitive-data-scanner/config/groups/{group_id}"
      .replaceAll("\\{" + "group_id" + "\\}", apiClient.escapeString(groupId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.SensitiveDataScannerApi.deleteScanningGroup", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SensitiveDataScannerGroupDeleteResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("DELETE", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SensitiveDataScannerGroupDeleteResponse>() {});
  }

  /**
 * Delete Scanning Rule.
 *
 * See {@link #deleteScanningRuleWithHttpInfo}.
 *
 * @param ruleId The ID of the rule. (required)
 * @param body  (required)
 * @return SensitiveDataScannerRuleDeleteResponse
 * @throws ApiException if fails to make API call
 */
  public SensitiveDataScannerRuleDeleteResponse  deleteScanningRule(String ruleId, SensitiveDataScannerRuleDeleteRequest body) throws ApiException {
    return deleteScanningRuleWithHttpInfo(ruleId, body).getData();
  }

  /**
 * Delete Scanning Rule.
 *
 * See {@link #deleteScanningRuleWithHttpInfoAsync}.
 *
 * @param ruleId The ID of the rule. (required)
 * @param body  (required)
 * @return CompletableFuture&lt;SensitiveDataScannerRuleDeleteResponse&gt;
 */
  public CompletableFuture<SensitiveDataScannerRuleDeleteResponse>deleteScanningRuleAsync(String ruleId, SensitiveDataScannerRuleDeleteRequest body) {
    return deleteScanningRuleWithHttpInfoAsync(ruleId, body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Delete a given rule.</p>
   *
   * @param ruleId The ID of the rule. (required)
   * @param body  (required)
   * @return ApiResponse&lt;SensitiveDataScannerRuleDeleteResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SensitiveDataScannerRuleDeleteResponse> deleteScanningRuleWithHttpInfo(String ruleId, SensitiveDataScannerRuleDeleteRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'ruleId' is set
    if (ruleId == null) {
      throw new ApiException(400, "Missing the required parameter 'ruleId' when calling deleteScanningRule");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling deleteScanningRule");
    }
    // create path and map variables
    String localVarPath = "/api/v2/sensitive-data-scanner/config/rules/{rule_id}"
      .replaceAll("\\{" + "rule_id" + "\\}", apiClient.escapeString(ruleId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.SensitiveDataScannerApi.deleteScanningRule", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("DELETE", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SensitiveDataScannerRuleDeleteResponse>() {});
  }

  /**
   * Delete Scanning Rule.
   *
   * See {@link #deleteScanningRuleWithHttpInfo}.
   *
   * @param ruleId The ID of the rule. (required)
   * @param body  (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SensitiveDataScannerRuleDeleteResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SensitiveDataScannerRuleDeleteResponse>> deleteScanningRuleWithHttpInfoAsync(String ruleId, SensitiveDataScannerRuleDeleteRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'ruleId' is set
    if (ruleId == null) {
        CompletableFuture<ApiResponse<SensitiveDataScannerRuleDeleteResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'ruleId' when calling deleteScanningRule"));
        return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<SensitiveDataScannerRuleDeleteResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling deleteScanningRule"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/sensitive-data-scanner/config/rules/{rule_id}"
      .replaceAll("\\{" + "rule_id" + "\\}", apiClient.escapeString(ruleId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.SensitiveDataScannerApi.deleteScanningRule", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SensitiveDataScannerRuleDeleteResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("DELETE", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SensitiveDataScannerRuleDeleteResponse>() {});
  }

  /**
 * List Scanning Groups.
 *
 * See {@link #listScanningGroupsWithHttpInfo}.
 *
 * @return SensitiveDataScannerGetConfigResponse
 * @throws ApiException if fails to make API call
 */
  public SensitiveDataScannerGetConfigResponse  listScanningGroups() throws ApiException {
    return listScanningGroupsWithHttpInfo().getData();
  }

  /**
 * List Scanning Groups.
 *
 * See {@link #listScanningGroupsWithHttpInfoAsync}.
 *
 * @return CompletableFuture&lt;SensitiveDataScannerGetConfigResponse&gt;
 */
  public CompletableFuture<SensitiveDataScannerGetConfigResponse>listScanningGroupsAsync() {
    return listScanningGroupsWithHttpInfoAsync().thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>List all the Scanning groups in your organization.</p>
   *
   * @return ApiResponse&lt;SensitiveDataScannerGetConfigResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SensitiveDataScannerGetConfigResponse> listScanningGroupsWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/sensitive-data-scanner/config";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.SensitiveDataScannerApi.listScanningGroups", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SensitiveDataScannerGetConfigResponse>() {});
  }

  /**
   * List Scanning Groups.
   *
   * See {@link #listScanningGroupsWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;SensitiveDataScannerGetConfigResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SensitiveDataScannerGetConfigResponse>> listScanningGroupsWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/sensitive-data-scanner/config";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.SensitiveDataScannerApi.listScanningGroups", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SensitiveDataScannerGetConfigResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SensitiveDataScannerGetConfigResponse>() {});
  }

  /**
 * List standard patterns.
 *
 * See {@link #listStandardPatternsWithHttpInfo}.
 *
 * @return SensitiveDataScannerStandardPatternsResponseData
 * @throws ApiException if fails to make API call
 */
  public SensitiveDataScannerStandardPatternsResponseData  listStandardPatterns() throws ApiException {
    return listStandardPatternsWithHttpInfo().getData();
  }

  /**
 * List standard patterns.
 *
 * See {@link #listStandardPatternsWithHttpInfoAsync}.
 *
 * @return CompletableFuture&lt;SensitiveDataScannerStandardPatternsResponseData&gt;
 */
  public CompletableFuture<SensitiveDataScannerStandardPatternsResponseData>listStandardPatternsAsync() {
    return listStandardPatternsWithHttpInfoAsync().thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Returns all standard patterns.</p>
   *
   * @return ApiResponse&lt;SensitiveDataScannerStandardPatternsResponseData&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SensitiveDataScannerStandardPatternsResponseData> listStandardPatternsWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/sensitive-data-scanner/config/standard-patterns";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.SensitiveDataScannerApi.listStandardPatterns", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SensitiveDataScannerStandardPatternsResponseData>() {});
  }

  /**
   * List standard patterns.
   *
   * See {@link #listStandardPatternsWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;SensitiveDataScannerStandardPatternsResponseData&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SensitiveDataScannerStandardPatternsResponseData>> listStandardPatternsWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/sensitive-data-scanner/config/standard-patterns";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.SensitiveDataScannerApi.listStandardPatterns", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SensitiveDataScannerStandardPatternsResponseData>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SensitiveDataScannerStandardPatternsResponseData>() {});
  }

  /**
 * Reorder Groups.
 *
 * See {@link #reorderScanningGroupsWithHttpInfo}.
 *
 * @param body  (required)
 * @return SensitiveDataScannerReorderGroupsResponse
 * @throws ApiException if fails to make API call
 */
  public SensitiveDataScannerReorderGroupsResponse  reorderScanningGroups(SensitiveDataScannerConfigRequest body) throws ApiException {
    return reorderScanningGroupsWithHttpInfo(body).getData();
  }

  /**
 * Reorder Groups.
 *
 * See {@link #reorderScanningGroupsWithHttpInfoAsync}.
 *
 * @param body  (required)
 * @return CompletableFuture&lt;SensitiveDataScannerReorderGroupsResponse&gt;
 */
  public CompletableFuture<SensitiveDataScannerReorderGroupsResponse>reorderScanningGroupsAsync(SensitiveDataScannerConfigRequest body) {
    return reorderScanningGroupsWithHttpInfoAsync(body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Reorder the list of groups.</p>
   *
   * @param body  (required)
   * @return ApiResponse&lt;SensitiveDataScannerReorderGroupsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SensitiveDataScannerReorderGroupsResponse> reorderScanningGroupsWithHttpInfo(SensitiveDataScannerConfigRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling reorderScanningGroups");
    }
    // create path and map variables
    String localVarPath = "/api/v2/sensitive-data-scanner/config";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.SensitiveDataScannerApi.reorderScanningGroups", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("PATCH", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SensitiveDataScannerReorderGroupsResponse>() {});
  }

  /**
   * Reorder Groups.
   *
   * See {@link #reorderScanningGroupsWithHttpInfo}.
   *
   * @param body  (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SensitiveDataScannerReorderGroupsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SensitiveDataScannerReorderGroupsResponse>> reorderScanningGroupsWithHttpInfoAsync(SensitiveDataScannerConfigRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<SensitiveDataScannerReorderGroupsResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling reorderScanningGroups"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/sensitive-data-scanner/config";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.SensitiveDataScannerApi.reorderScanningGroups", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SensitiveDataScannerReorderGroupsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("PATCH", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SensitiveDataScannerReorderGroupsResponse>() {});
  }

  /**
 * Update Scanning Group.
 *
 * See {@link #updateScanningGroupWithHttpInfo}.
 *
 * @param groupId The ID of a group of rules. (required)
 * @param body  (required)
 * @return SensitiveDataScannerGroupUpdateResponse
 * @throws ApiException if fails to make API call
 */
  public SensitiveDataScannerGroupUpdateResponse  updateScanningGroup(String groupId, SensitiveDataScannerGroupUpdateRequest body) throws ApiException {
    return updateScanningGroupWithHttpInfo(groupId, body).getData();
  }

  /**
 * Update Scanning Group.
 *
 * See {@link #updateScanningGroupWithHttpInfoAsync}.
 *
 * @param groupId The ID of a group of rules. (required)
 * @param body  (required)
 * @return CompletableFuture&lt;SensitiveDataScannerGroupUpdateResponse&gt;
 */
  public CompletableFuture<SensitiveDataScannerGroupUpdateResponse>updateScanningGroupAsync(String groupId, SensitiveDataScannerGroupUpdateRequest body) {
    return updateScanningGroupWithHttpInfoAsync(groupId, body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Update a group, including the order of the rules.
   * Rules within the group are reordered by including a rules relationship. If the rules
   * relationship is present, its data section MUST contain linkages for all of the rules
   * currently in the group, and MUST NOT contain any others.</p>
   *
   * @param groupId The ID of a group of rules. (required)
   * @param body  (required)
   * @return ApiResponse&lt;SensitiveDataScannerGroupUpdateResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SensitiveDataScannerGroupUpdateResponse> updateScanningGroupWithHttpInfo(String groupId, SensitiveDataScannerGroupUpdateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'groupId' is set
    if (groupId == null) {
      throw new ApiException(400, "Missing the required parameter 'groupId' when calling updateScanningGroup");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateScanningGroup");
    }
    // create path and map variables
    String localVarPath = "/api/v2/sensitive-data-scanner/config/groups/{group_id}"
      .replaceAll("\\{" + "group_id" + "\\}", apiClient.escapeString(groupId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.SensitiveDataScannerApi.updateScanningGroup", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("PATCH", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SensitiveDataScannerGroupUpdateResponse>() {});
  }

  /**
   * Update Scanning Group.
   *
   * See {@link #updateScanningGroupWithHttpInfo}.
   *
   * @param groupId The ID of a group of rules. (required)
   * @param body  (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SensitiveDataScannerGroupUpdateResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SensitiveDataScannerGroupUpdateResponse>> updateScanningGroupWithHttpInfoAsync(String groupId, SensitiveDataScannerGroupUpdateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'groupId' is set
    if (groupId == null) {
        CompletableFuture<ApiResponse<SensitiveDataScannerGroupUpdateResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'groupId' when calling updateScanningGroup"));
        return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<SensitiveDataScannerGroupUpdateResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling updateScanningGroup"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/sensitive-data-scanner/config/groups/{group_id}"
      .replaceAll("\\{" + "group_id" + "\\}", apiClient.escapeString(groupId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.SensitiveDataScannerApi.updateScanningGroup", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SensitiveDataScannerGroupUpdateResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("PATCH", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SensitiveDataScannerGroupUpdateResponse>() {});
  }

  /**
 * Update Scanning Rule.
 *
 * See {@link #updateScanningRuleWithHttpInfo}.
 *
 * @param ruleId The ID of the rule. (required)
 * @param body  (required)
 * @return SensitiveDataScannerRuleUpdateResponse
 * @throws ApiException if fails to make API call
 */
  public SensitiveDataScannerRuleUpdateResponse  updateScanningRule(String ruleId, SensitiveDataScannerRuleUpdateRequest body) throws ApiException {
    return updateScanningRuleWithHttpInfo(ruleId, body).getData();
  }

  /**
 * Update Scanning Rule.
 *
 * See {@link #updateScanningRuleWithHttpInfoAsync}.
 *
 * @param ruleId The ID of the rule. (required)
 * @param body  (required)
 * @return CompletableFuture&lt;SensitiveDataScannerRuleUpdateResponse&gt;
 */
  public CompletableFuture<SensitiveDataScannerRuleUpdateResponse>updateScanningRuleAsync(String ruleId, SensitiveDataScannerRuleUpdateRequest body) {
    return updateScanningRuleWithHttpInfoAsync(ruleId, body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Update a scanning rule.
   * The request body MUST NOT include a standard_pattern relationship, as that relationship
   * is non-editable. Trying to edit the regex attribute of a rule with a standard_pattern
   * relationship will also result in an error.</p>
   *
   * @param ruleId The ID of the rule. (required)
   * @param body  (required)
   * @return ApiResponse&lt;SensitiveDataScannerRuleUpdateResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SensitiveDataScannerRuleUpdateResponse> updateScanningRuleWithHttpInfo(String ruleId, SensitiveDataScannerRuleUpdateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'ruleId' is set
    if (ruleId == null) {
      throw new ApiException(400, "Missing the required parameter 'ruleId' when calling updateScanningRule");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateScanningRule");
    }
    // create path and map variables
    String localVarPath = "/api/v2/sensitive-data-scanner/config/rules/{rule_id}"
      .replaceAll("\\{" + "rule_id" + "\\}", apiClient.escapeString(ruleId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.SensitiveDataScannerApi.updateScanningRule", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("PATCH", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SensitiveDataScannerRuleUpdateResponse>() {});
  }

  /**
   * Update Scanning Rule.
   *
   * See {@link #updateScanningRuleWithHttpInfo}.
   *
   * @param ruleId The ID of the rule. (required)
   * @param body  (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SensitiveDataScannerRuleUpdateResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SensitiveDataScannerRuleUpdateResponse>> updateScanningRuleWithHttpInfoAsync(String ruleId, SensitiveDataScannerRuleUpdateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'ruleId' is set
    if (ruleId == null) {
        CompletableFuture<ApiResponse<SensitiveDataScannerRuleUpdateResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'ruleId' when calling updateScanningRule"));
        return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<SensitiveDataScannerRuleUpdateResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling updateScanningRule"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/sensitive-data-scanner/config/rules/{rule_id}"
      .replaceAll("\\{" + "rule_id" + "\\}", apiClient.escapeString(ruleId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.SensitiveDataScannerApi.updateScanningRule", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SensitiveDataScannerRuleUpdateResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("PATCH", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SensitiveDataScannerRuleUpdateResponse>() {});
  }
}