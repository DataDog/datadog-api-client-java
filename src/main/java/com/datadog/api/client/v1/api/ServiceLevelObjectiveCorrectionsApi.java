
package com.datadog.api.client.v1.api;

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
import com.datadog.api.client.v1.model.SLOCorrectionListResponse;
import com.datadog.api.client.v1.model.SLOCorrectionResponse;
import com.datadog.api.client.v1.model.SLOCorrectionCreateRequest;
import com.datadog.api.client.v1.model.SLOCorrectionUpdateRequest;
import com.datadog.api.client.v1.model.SLOCorrection;


@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ServiceLevelObjectiveCorrectionsApi {
  private ApiClient apiClient;
  public ServiceLevelObjectiveCorrectionsApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public ServiceLevelObjectiveCorrectionsApi(ApiClient apiClient) {
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
 * Create an SLO correction.
 *
 * See {@link #createSLOCorrectionWithHttpInfo}.
 *
 * @param body Create an SLO Correction (required)
 * @return SLOCorrectionResponse
 * @throws ApiException if fails to make API call
 */
  public SLOCorrectionResponse  createSLOCorrection(SLOCorrectionCreateRequest body) throws ApiException {
    return createSLOCorrectionWithHttpInfo(body).getData();
  }

  /**
 * Create an SLO correction.
 *
 * See {@link #createSLOCorrectionWithHttpInfoAsync}.
 *
 * @param body Create an SLO Correction (required)
 * @return CompletableFuture&lt;SLOCorrectionResponse&gt;
 */
  public CompletableFuture<SLOCorrectionResponse>createSLOCorrectionAsync(SLOCorrectionCreateRequest body) {
    return createSLOCorrectionWithHttpInfoAsync(body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Create an SLO Correction.</p>
   *
   * @param body Create an SLO Correction (required)
   * @return ApiResponse&lt;SLOCorrectionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> SLO Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SLOCorrectionResponse> createSLOCorrectionWithHttpInfo(SLOCorrectionCreateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createSLOCorrection");
    }
    // create path and map variables
    String localVarPath = "/api/v1/slo/correction";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v1.ServiceLevelObjectiveCorrectionsApi.createSLOCorrection", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SLOCorrectionResponse>() {});
  }

  /**
   * Create an SLO correction.
   *
   * See {@link #createSLOCorrectionWithHttpInfo}.
   *
   * @param body Create an SLO Correction (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SLOCorrectionResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SLOCorrectionResponse>> createSLOCorrectionWithHttpInfoAsync(SLOCorrectionCreateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<SLOCorrectionResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling createSLOCorrection"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/slo/correction";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v1.ServiceLevelObjectiveCorrectionsApi.createSLOCorrection", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SLOCorrectionResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SLOCorrectionResponse>() {});
  }

  /**
 * Delete an SLO correction.
 *
 * See {@link #deleteSLOCorrectionWithHttpInfo}.
 *
 * @param sloCorrectionId The ID of the SLO correction object. (required)
 * @throws ApiException if fails to make API call
 */
  public  void  deleteSLOCorrection(String sloCorrectionId) throws ApiException {
    deleteSLOCorrectionWithHttpInfo(sloCorrectionId);
  }

  /**
 * Delete an SLO correction.
 *
 * See {@link #deleteSLOCorrectionWithHttpInfoAsync}.
 *
 * @param sloCorrectionId The ID of the SLO correction object. (required)
 * @return CompletableFuture
 */
  public CompletableFuture<Void>deleteSLOCorrectionAsync(String sloCorrectionId) {
    return deleteSLOCorrectionWithHttpInfoAsync(sloCorrectionId).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Permanently delete the specified SLO correction object.</p>
   *
   * @param sloCorrectionId The ID of the SLO correction object. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteSLOCorrectionWithHttpInfo(String sloCorrectionId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'sloCorrectionId' is set
    if (sloCorrectionId == null) {
      throw new ApiException(400, "Missing the required parameter 'sloCorrectionId' when calling deleteSLOCorrection");
    }
    // create path and map variables
    String localVarPath = "/api/v1/slo/correction/{slo_correction_id}"
      .replaceAll("\\{" + "slo_correction_id" + "\\}", apiClient.escapeString(sloCorrectionId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v1.ServiceLevelObjectiveCorrectionsApi.deleteSLOCorrection", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("DELETE", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
   * Delete an SLO correction.
   *
   * See {@link #deleteSLOCorrectionWithHttpInfo}.
   *
   * @param sloCorrectionId The ID of the SLO correction object. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteSLOCorrectionWithHttpInfoAsync(String sloCorrectionId) {
    Object localVarPostBody = null;

    // verify the required parameter 'sloCorrectionId' is set
    if (sloCorrectionId == null) {
        CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'sloCorrectionId' when calling deleteSLOCorrection"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/slo/correction/{slo_correction_id}"
      .replaceAll("\\{" + "slo_correction_id" + "\\}", apiClient.escapeString(sloCorrectionId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v1.ServiceLevelObjectiveCorrectionsApi.deleteSLOCorrection", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("DELETE", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
 * Get an SLO correction for an SLO.
 *
 * See {@link #getSLOCorrectionWithHttpInfo}.
 *
 * @param sloCorrectionId The ID of the SLO correction object. (required)
 * @return SLOCorrectionResponse
 * @throws ApiException if fails to make API call
 */
  public SLOCorrectionResponse  getSLOCorrection(String sloCorrectionId) throws ApiException {
    return getSLOCorrectionWithHttpInfo(sloCorrectionId).getData();
  }

  /**
 * Get an SLO correction for an SLO.
 *
 * See {@link #getSLOCorrectionWithHttpInfoAsync}.
 *
 * @param sloCorrectionId The ID of the SLO correction object. (required)
 * @return CompletableFuture&lt;SLOCorrectionResponse&gt;
 */
  public CompletableFuture<SLOCorrectionResponse>getSLOCorrectionAsync(String sloCorrectionId) {
    return getSLOCorrectionWithHttpInfoAsync(sloCorrectionId).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get an SLO correction.</p>
   *
   * @param sloCorrectionId The ID of the SLO correction object. (required)
   * @return ApiResponse&lt;SLOCorrectionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SLOCorrectionResponse> getSLOCorrectionWithHttpInfo(String sloCorrectionId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'sloCorrectionId' is set
    if (sloCorrectionId == null) {
      throw new ApiException(400, "Missing the required parameter 'sloCorrectionId' when calling getSLOCorrection");
    }
    // create path and map variables
    String localVarPath = "/api/v1/slo/correction/{slo_correction_id}"
      .replaceAll("\\{" + "slo_correction_id" + "\\}", apiClient.escapeString(sloCorrectionId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v1.ServiceLevelObjectiveCorrectionsApi.getSLOCorrection", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SLOCorrectionResponse>() {});
  }

  /**
   * Get an SLO correction for an SLO.
   *
   * See {@link #getSLOCorrectionWithHttpInfo}.
   *
   * @param sloCorrectionId The ID of the SLO correction object. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SLOCorrectionResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SLOCorrectionResponse>> getSLOCorrectionWithHttpInfoAsync(String sloCorrectionId) {
    Object localVarPostBody = null;

    // verify the required parameter 'sloCorrectionId' is set
    if (sloCorrectionId == null) {
        CompletableFuture<ApiResponse<SLOCorrectionResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'sloCorrectionId' when calling getSLOCorrection"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/slo/correction/{slo_correction_id}"
      .replaceAll("\\{" + "slo_correction_id" + "\\}", apiClient.escapeString(sloCorrectionId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v1.ServiceLevelObjectiveCorrectionsApi.getSLOCorrection", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SLOCorrectionResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SLOCorrectionResponse>() {});
  }

  /**
   * Manage optional parameters to listSLOCorrection.
   */
  public static class ListSLOCorrectionOptionalParameters {
    private Long offset;
    private Long limit;

    /**
     * Set offset.
     * @param offset The specific offset to use as the beginning of the returned response. (optional)
     * @return ListSLOCorrectionOptionalParameters
     */
    public ListSLOCorrectionOptionalParameters offset(Long offset) {
      this.offset = offset;
      return this;
    }

    /**
     * Set limit.
     * @param limit The number of SLO corrections to return in the response. Default is 25. (optional, default to 25)
     * @return ListSLOCorrectionOptionalParameters
     */
    public ListSLOCorrectionOptionalParameters limit(Long limit) {
      this.limit = limit;
      return this;
    }
  }

  /**
 * Get all SLO corrections.
 *
 * See {@link #listSLOCorrectionWithHttpInfo}.
 *
 * @return SLOCorrectionListResponse
 * @throws ApiException if fails to make API call
 */
  public SLOCorrectionListResponse listSLOCorrection () throws ApiException {
    return listSLOCorrectionWithHttpInfo(new ListSLOCorrectionOptionalParameters()).getData();
  }

  /**
 * Get all SLO corrections.
 *
 * See {@link #listSLOCorrectionWithHttpInfoAsync}.
 *
 * @return CompletableFuture&lt;SLOCorrectionListResponse&gt;
 */
  public CompletableFuture<SLOCorrectionListResponse>listSLOCorrectionAsync() {
    return listSLOCorrectionWithHttpInfoAsync(new ListSLOCorrectionOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * Get all SLO corrections.
 *
 * See {@link #listSLOCorrectionWithHttpInfo}.
 *
 * @param parameters Optional parameters for the request.
 * @return SLOCorrectionListResponse
 * @throws ApiException if fails to make API call
 */
  public SLOCorrectionListResponse listSLOCorrection(ListSLOCorrectionOptionalParameters parameters) throws ApiException {
    return listSLOCorrectionWithHttpInfo(parameters).getData();
  }

  /**
 * Get all SLO corrections.
 *
 * See {@link #listSLOCorrectionWithHttpInfoAsync}.
 *
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;SLOCorrectionListResponse&gt;
 */
  public CompletableFuture<SLOCorrectionListResponse>listSLOCorrectionAsync(ListSLOCorrectionOptionalParameters parameters) {
    return listSLOCorrectionWithHttpInfoAsync(parameters).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * Get all SLO corrections.
 *
 * See {@link #listSLOCorrectionWithHttpInfo}.
 *
 * @return PaginationIterable&lt;SLOCorrection&gt;
 */
  public PaginationIterable<SLOCorrection> listSLOCorrectionWithPagination() {
    ListSLOCorrectionOptionalParameters parameters = new ListSLOCorrectionOptionalParameters();
    return listSLOCorrectionWithPagination(parameters);
  }

  /**
 * Get all SLO corrections.
 *
 * See {@link #listSLOCorrectionWithHttpInfo}.
 *
 * @return SLOCorrectionListResponse
 */
  public PaginationIterable<SLOCorrection> listSLOCorrectionWithPagination(ListSLOCorrectionOptionalParameters parameters) {
  String resultsPath = "getData";
  String valueGetterPath = "";
  String valueSetterPath = "offset";
  Boolean valueSetterParamOptional = true;
  Long limit;

  
  if (parameters.limit == null) {
      limit = 25l;
      parameters.limit(limit);
  } else {
      limit = parameters.limit;
  }
  

  
  LinkedHashMap<String, Object> args = new LinkedHashMap<String, Object>();
  args.put("optionalParams", parameters);

  PaginationIterable iterator = new PaginationIterable(this, "listSLOCorrection", resultsPath, valueGetterPath, valueSetterPath, valueSetterParamOptional, true, limit, args);

  return iterator;
  }


  /**
   * <p>Get all Service Level Objective corrections.</p>
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;SLOCorrectionListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SLOCorrectionListResponse> listSLOCorrectionWithHttpInfo(ListSLOCorrectionOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    Long offset = parameters.offset;
    Long limit = parameters.limit;
    // create path and map variables
    String localVarPath = "/api/v1/slo/correction";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

    Invocation.Builder builder = apiClient.createBuilder("v1.ServiceLevelObjectiveCorrectionsApi.listSLOCorrection", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SLOCorrectionListResponse>() {});
  }

  /**
   * Get all SLO corrections.
   *
   * See {@link #listSLOCorrectionWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;SLOCorrectionListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SLOCorrectionListResponse>> listSLOCorrectionWithHttpInfoAsync(ListSLOCorrectionOptionalParameters parameters) {
    Object localVarPostBody = null;
    Long offset = parameters.offset;
    Long limit = parameters.limit;
    // create path and map variables
    String localVarPath = "/api/v1/slo/correction";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v1.ServiceLevelObjectiveCorrectionsApi.listSLOCorrection", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SLOCorrectionListResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SLOCorrectionListResponse>() {});
  }

  /**
 * Update an SLO correction.
 *
 * See {@link #updateSLOCorrectionWithHttpInfo}.
 *
 * @param sloCorrectionId The ID of the SLO correction object. (required)
 * @param body The edited SLO correction object. (required)
 * @return SLOCorrectionResponse
 * @throws ApiException if fails to make API call
 */
  public SLOCorrectionResponse  updateSLOCorrection(String sloCorrectionId, SLOCorrectionUpdateRequest body) throws ApiException {
    return updateSLOCorrectionWithHttpInfo(sloCorrectionId, body).getData();
  }

  /**
 * Update an SLO correction.
 *
 * See {@link #updateSLOCorrectionWithHttpInfoAsync}.
 *
 * @param sloCorrectionId The ID of the SLO correction object. (required)
 * @param body The edited SLO correction object. (required)
 * @return CompletableFuture&lt;SLOCorrectionResponse&gt;
 */
  public CompletableFuture<SLOCorrectionResponse>updateSLOCorrectionAsync(String sloCorrectionId, SLOCorrectionUpdateRequest body) {
    return updateSLOCorrectionWithHttpInfoAsync(sloCorrectionId, body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Update the specified SLO correction object.</p>
   *
   * @param sloCorrectionId The ID of the SLO correction object. (required)
   * @param body The edited SLO correction object. (required)
   * @return ApiResponse&lt;SLOCorrectionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SLOCorrectionResponse> updateSLOCorrectionWithHttpInfo(String sloCorrectionId, SLOCorrectionUpdateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'sloCorrectionId' is set
    if (sloCorrectionId == null) {
      throw new ApiException(400, "Missing the required parameter 'sloCorrectionId' when calling updateSLOCorrection");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateSLOCorrection");
    }
    // create path and map variables
    String localVarPath = "/api/v1/slo/correction/{slo_correction_id}"
      .replaceAll("\\{" + "slo_correction_id" + "\\}", apiClient.escapeString(sloCorrectionId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v1.ServiceLevelObjectiveCorrectionsApi.updateSLOCorrection", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("PATCH", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SLOCorrectionResponse>() {});
  }

  /**
   * Update an SLO correction.
   *
   * See {@link #updateSLOCorrectionWithHttpInfo}.
   *
   * @param sloCorrectionId The ID of the SLO correction object. (required)
   * @param body The edited SLO correction object. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SLOCorrectionResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SLOCorrectionResponse>> updateSLOCorrectionWithHttpInfoAsync(String sloCorrectionId, SLOCorrectionUpdateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'sloCorrectionId' is set
    if (sloCorrectionId == null) {
        CompletableFuture<ApiResponse<SLOCorrectionResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'sloCorrectionId' when calling updateSLOCorrection"));
        return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<SLOCorrectionResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling updateSLOCorrection"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/slo/correction/{slo_correction_id}"
      .replaceAll("\\{" + "slo_correction_id" + "\\}", apiClient.escapeString(sloCorrectionId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v1.ServiceLevelObjectiveCorrectionsApi.updateSLOCorrection", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SLOCorrectionResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("PATCH", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SLOCorrectionResponse>() {});
  }
}