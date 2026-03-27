
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
import com.datadog.api.client.v2.model.CustomAttributeConfigsResponse;
import com.datadog.api.client.v2.model.CustomAttributeConfigResponse;
import com.datadog.api.client.v2.model.CustomAttributeConfigCreateRequest;


@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CaseManagementAttributeApi {
  private ApiClient apiClient;
  public CaseManagementAttributeApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public CaseManagementAttributeApi(ApiClient apiClient) {
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
 * Create custom attribute config for a case type.
 *
 * See {@link #createCustomAttributeConfigWithHttpInfo}.
 *
 * @param caseTypeId Case type's UUID (required)
 * @param body Custom attribute config payload (required)
 * @return CustomAttributeConfigResponse
 * @throws ApiException if fails to make API call
 */
  public CustomAttributeConfigResponse  createCustomAttributeConfig(String caseTypeId, CustomAttributeConfigCreateRequest body) throws ApiException {
    return createCustomAttributeConfigWithHttpInfo(caseTypeId, body).getData();
  }

  /**
 * Create custom attribute config for a case type.
 *
 * See {@link #createCustomAttributeConfigWithHttpInfoAsync}.
 *
 * @param caseTypeId Case type's UUID (required)
 * @param body Custom attribute config payload (required)
 * @return CompletableFuture&lt;CustomAttributeConfigResponse&gt;
 */
  public CompletableFuture<CustomAttributeConfigResponse>createCustomAttributeConfigAsync(String caseTypeId, CustomAttributeConfigCreateRequest body) {
    return createCustomAttributeConfigWithHttpInfoAsync(caseTypeId, body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Create custom attribute config for a case type</p>
   *
   * @param caseTypeId Case type's UUID (required)
   * @param body Custom attribute config payload (required)
   * @return ApiResponse&lt;CustomAttributeConfigResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
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
  public ApiResponse<CustomAttributeConfigResponse> createCustomAttributeConfigWithHttpInfo(String caseTypeId, CustomAttributeConfigCreateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'caseTypeId' is set
    if (caseTypeId == null) {
      throw new ApiException(400, "Missing the required parameter 'caseTypeId' when calling createCustomAttributeConfig");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createCustomAttributeConfig");
    }
    // create path and map variables
    String localVarPath = "/api/v2/cases/types/{case_type_id}/custom_attributes"
      .replaceAll("\\{" + "case_type_id" + "\\}", apiClient.escapeString(caseTypeId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.CaseManagementAttributeApi.createCustomAttributeConfig", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<CustomAttributeConfigResponse>() {});
  }

  /**
   * Create custom attribute config for a case type.
   *
   * See {@link #createCustomAttributeConfigWithHttpInfo}.
   *
   * @param caseTypeId Case type's UUID (required)
   * @param body Custom attribute config payload (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CustomAttributeConfigResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CustomAttributeConfigResponse>> createCustomAttributeConfigWithHttpInfoAsync(String caseTypeId, CustomAttributeConfigCreateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'caseTypeId' is set
    if (caseTypeId == null) {
        CompletableFuture<ApiResponse<CustomAttributeConfigResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'caseTypeId' when calling createCustomAttributeConfig"));
        return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<CustomAttributeConfigResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling createCustomAttributeConfig"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/cases/types/{case_type_id}/custom_attributes"
      .replaceAll("\\{" + "case_type_id" + "\\}", apiClient.escapeString(caseTypeId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.CaseManagementAttributeApi.createCustomAttributeConfig", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CustomAttributeConfigResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<CustomAttributeConfigResponse>() {});
  }

  /**
 * Delete custom attributes config.
 *
 * See {@link #deleteCustomAttributeConfigWithHttpInfo}.
 *
 * @param caseTypeId Case type's UUID (required)
 * @param customAttributeId Case Custom attribute's UUID (required)
 * @throws ApiException if fails to make API call
 */
  public  void  deleteCustomAttributeConfig(String caseTypeId, String customAttributeId) throws ApiException {
    deleteCustomAttributeConfigWithHttpInfo(caseTypeId, customAttributeId);
  }

  /**
 * Delete custom attributes config.
 *
 * See {@link #deleteCustomAttributeConfigWithHttpInfoAsync}.
 *
 * @param caseTypeId Case type's UUID (required)
 * @param customAttributeId Case Custom attribute's UUID (required)
 * @return CompletableFuture
 */
  public CompletableFuture<Void>deleteCustomAttributeConfigAsync(String caseTypeId, String customAttributeId) {
    return deleteCustomAttributeConfigWithHttpInfoAsync(caseTypeId, customAttributeId).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Delete custom attribute config</p>
   *
   * @param caseTypeId Case type's UUID (required)
   * @param customAttributeId Case Custom attribute's UUID (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteCustomAttributeConfigWithHttpInfo(String caseTypeId, String customAttributeId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'caseTypeId' is set
    if (caseTypeId == null) {
      throw new ApiException(400, "Missing the required parameter 'caseTypeId' when calling deleteCustomAttributeConfig");
    }

    // verify the required parameter 'customAttributeId' is set
    if (customAttributeId == null) {
      throw new ApiException(400, "Missing the required parameter 'customAttributeId' when calling deleteCustomAttributeConfig");
    }
    // create path and map variables
    String localVarPath = "/api/v2/cases/types/{case_type_id}/custom_attributes/{custom_attribute_id}"
      .replaceAll("\\{" + "case_type_id" + "\\}", apiClient.escapeString(caseTypeId.toString()))
      .replaceAll("\\{" + "custom_attribute_id" + "\\}", apiClient.escapeString(customAttributeId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.CaseManagementAttributeApi.deleteCustomAttributeConfig", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("DELETE", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
   * Delete custom attributes config.
   *
   * See {@link #deleteCustomAttributeConfigWithHttpInfo}.
   *
   * @param caseTypeId Case type's UUID (required)
   * @param customAttributeId Case Custom attribute's UUID (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteCustomAttributeConfigWithHttpInfoAsync(String caseTypeId, String customAttributeId) {
    Object localVarPostBody = null;

    // verify the required parameter 'caseTypeId' is set
    if (caseTypeId == null) {
        CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'caseTypeId' when calling deleteCustomAttributeConfig"));
        return result;
    }

    // verify the required parameter 'customAttributeId' is set
    if (customAttributeId == null) {
        CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'customAttributeId' when calling deleteCustomAttributeConfig"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/cases/types/{case_type_id}/custom_attributes/{custom_attribute_id}"
      .replaceAll("\\{" + "case_type_id" + "\\}", apiClient.escapeString(caseTypeId.toString()))
      .replaceAll("\\{" + "custom_attribute_id" + "\\}", apiClient.escapeString(customAttributeId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.CaseManagementAttributeApi.deleteCustomAttributeConfig", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("DELETE", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
 * Get all custom attributes config of case type.
 *
 * See {@link #getAllCustomAttributeConfigsByCaseTypeWithHttpInfo}.
 *
 * @param caseTypeId Case type's UUID (required)
 * @return CustomAttributeConfigsResponse
 * @throws ApiException if fails to make API call
 */
  public CustomAttributeConfigsResponse  getAllCustomAttributeConfigsByCaseType(String caseTypeId) throws ApiException {
    return getAllCustomAttributeConfigsByCaseTypeWithHttpInfo(caseTypeId).getData();
  }

  /**
 * Get all custom attributes config of case type.
 *
 * See {@link #getAllCustomAttributeConfigsByCaseTypeWithHttpInfoAsync}.
 *
 * @param caseTypeId Case type's UUID (required)
 * @return CompletableFuture&lt;CustomAttributeConfigsResponse&gt;
 */
  public CompletableFuture<CustomAttributeConfigsResponse>getAllCustomAttributeConfigsByCaseTypeAsync(String caseTypeId) {
    return getAllCustomAttributeConfigsByCaseTypeWithHttpInfoAsync(caseTypeId).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get all custom attribute config of case type</p>
   *
   * @param caseTypeId Case type's UUID (required)
   * @return ApiResponse&lt;CustomAttributeConfigsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CustomAttributeConfigsResponse> getAllCustomAttributeConfigsByCaseTypeWithHttpInfo(String caseTypeId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'caseTypeId' is set
    if (caseTypeId == null) {
      throw new ApiException(400, "Missing the required parameter 'caseTypeId' when calling getAllCustomAttributeConfigsByCaseType");
    }
    // create path and map variables
    String localVarPath = "/api/v2/cases/types/{case_type_id}/custom_attributes"
      .replaceAll("\\{" + "case_type_id" + "\\}", apiClient.escapeString(caseTypeId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.CaseManagementAttributeApi.getAllCustomAttributeConfigsByCaseType", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<CustomAttributeConfigsResponse>() {});
  }

  /**
   * Get all custom attributes config of case type.
   *
   * See {@link #getAllCustomAttributeConfigsByCaseTypeWithHttpInfo}.
   *
   * @param caseTypeId Case type's UUID (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CustomAttributeConfigsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CustomAttributeConfigsResponse>> getAllCustomAttributeConfigsByCaseTypeWithHttpInfoAsync(String caseTypeId) {
    Object localVarPostBody = null;

    // verify the required parameter 'caseTypeId' is set
    if (caseTypeId == null) {
        CompletableFuture<ApiResponse<CustomAttributeConfigsResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'caseTypeId' when calling getAllCustomAttributeConfigsByCaseType"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/cases/types/{case_type_id}/custom_attributes"
      .replaceAll("\\{" + "case_type_id" + "\\}", apiClient.escapeString(caseTypeId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.CaseManagementAttributeApi.getAllCustomAttributeConfigsByCaseType", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CustomAttributeConfigsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<CustomAttributeConfigsResponse>() {});
  }

  /**
 * Get all custom attributes.
 *
 * See {@link #getAllCustomAttributesWithHttpInfo}.
 *
 * @return CustomAttributeConfigsResponse
 * @throws ApiException if fails to make API call
 */
  public CustomAttributeConfigsResponse  getAllCustomAttributes() throws ApiException {
    return getAllCustomAttributesWithHttpInfo().getData();
  }

  /**
 * Get all custom attributes.
 *
 * See {@link #getAllCustomAttributesWithHttpInfoAsync}.
 *
 * @return CompletableFuture&lt;CustomAttributeConfigsResponse&gt;
 */
  public CompletableFuture<CustomAttributeConfigsResponse>getAllCustomAttributesAsync() {
    return getAllCustomAttributesWithHttpInfoAsync().thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get all custom attributes</p>
   *
   * @return ApiResponse&lt;CustomAttributeConfigsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CustomAttributeConfigsResponse> getAllCustomAttributesWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/cases/types/custom_attributes";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.CaseManagementAttributeApi.getAllCustomAttributes", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<CustomAttributeConfigsResponse>() {});
  }

  /**
   * Get all custom attributes.
   *
   * See {@link #getAllCustomAttributesWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;CustomAttributeConfigsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CustomAttributeConfigsResponse>> getAllCustomAttributesWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/cases/types/custom_attributes";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.CaseManagementAttributeApi.getAllCustomAttributes", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CustomAttributeConfigsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<CustomAttributeConfigsResponse>() {});
  }
}