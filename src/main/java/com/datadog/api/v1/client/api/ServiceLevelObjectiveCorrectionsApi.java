package com.datadog.api.v1.client.api;

import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.ApiResponse;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.Pair;
import com.datadog.api.v1.client.model.SLOCorrectionCreateRequest;
import com.datadog.api.v1.client.model.SLOCorrectionListResponse;
import com.datadog.api.v1.client.model.SLOCorrectionResponse;
import com.datadog.api.v1.client.model.SLOCorrectionUpdateRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.core.GenericType;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ServiceLevelObjectiveCorrectionsApi {
  private ApiClient apiClient;

  public ServiceLevelObjectiveCorrectionsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ServiceLevelObjectiveCorrectionsApi(ApiClient apiClient) {
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
   * Create an SLO correction
   *
   * <p>See {@link #createSLOCorrectionWithHttpInfo}.
   *
   * @param body Create an SLO Correction (required)
   * @return SLOCorrectionResponse
   * @throws ApiException if fails to make API call
   */
  public SLOCorrectionResponse createSLOCorrection(SLOCorrectionCreateRequest body)
      throws ApiException {
    return createSLOCorrectionWithHttpInfo(body).getData();
  }

  /**
   * Create an SLO correction
   *
   * <p>See {@link #createSLOCorrectionWithHttpInfoAsync}.
   *
   * @param body Create an SLO Correction (required)
   * @return CompletableFuture&lt;SLOCorrectionResponse&gt;
   */
  public CompletableFuture<SLOCorrectionResponse> createSLOCorrectionAsync(
      SLOCorrectionCreateRequest body) {
    return createSLOCorrectionWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create an SLO correction
   *
   * <p>Create an SLO Correction.
   *
   * @param body Create an SLO Correction (required)
   * @return ApiResponse&lt;SLOCorrectionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> SLO Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SLOCorrectionResponse> createSLOCorrectionWithHttpInfo(
      SLOCorrectionCreateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createSLOCorrection");
    }
    // create path and map variables
    String localVarPath = "/api/v1/slo/correction";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "ServiceLevelObjectiveCorrectionsApi.createSLOCorrection",
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
        new GenericType<SLOCorrectionResponse>() {});
  }

  /**
   * Create an SLO correction
   *
   * <p>See {@link #createSLOCorrectionWithHttpInfo}.
   *
   * @param body Create an SLO Correction (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SLOCorrectionResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SLOCorrectionResponse>> createSLOCorrectionWithHttpInfoAsync(
      SLOCorrectionCreateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<SLOCorrectionResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createSLOCorrection"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/slo/correction";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "createSLOCorrection");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "ServiceLevelObjectiveCorrectionsApi.createSLOCorrection",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SLOCorrectionResponse>> result = new CompletableFuture<>();
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
        new GenericType<SLOCorrectionResponse>() {});
  }

  /**
   * Delete an SLO correction
   *
   * <p>See {@link #deleteSLOCorrectionWithHttpInfo}.
   *
   * @param sloCorrectionId The ID of the SLO correction object. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteSLOCorrection(String sloCorrectionId) throws ApiException {
    deleteSLOCorrectionWithHttpInfo(sloCorrectionId);
  }

  /**
   * Delete an SLO correction
   *
   * <p>See {@link #deleteSLOCorrectionWithHttpInfoAsync}.
   *
   * @param sloCorrectionId The ID of the SLO correction object. (required)
   */
  public CompletableFuture<Void> deleteSLOCorrectionAsync(String sloCorrectionId) {
    return deleteSLOCorrectionWithHttpInfoAsync(sloCorrectionId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete an SLO correction
   *
   * <p>Permanently delete the specified SLO correction object.
   *
   * @param sloCorrectionId The ID of the SLO correction object. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteSLOCorrectionWithHttpInfo(String sloCorrectionId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'sloCorrectionId' is set
    if (sloCorrectionId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'sloCorrectionId' when calling deleteSLOCorrection");
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/slo/correction/{slo_correction_id}"
            .replaceAll(
                "\\{" + "slo_correction_id" + "\\}",
                apiClient.escapeString(sloCorrectionId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "ServiceLevelObjectiveCorrectionsApi.deleteSLOCorrection",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
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
   * Delete an SLO correction
   *
   * <p>See {@link #deleteSLOCorrectionWithHttpInfo}.
   *
   * @param sloCorrectionId The ID of the SLO correction object. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteSLOCorrectionWithHttpInfoAsync(
      String sloCorrectionId) {
    Object localVarPostBody = null;

    // verify the required parameter 'sloCorrectionId' is set
    if (sloCorrectionId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'sloCorrectionId' when calling deleteSLOCorrection"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/slo/correction/{slo_correction_id}"
            .replaceAll(
                "\\{" + "slo_correction_id" + "\\}",
                apiClient.escapeString(sloCorrectionId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "deleteSLOCorrection");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "ServiceLevelObjectiveCorrectionsApi.deleteSLOCorrection",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
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
   * Get an SLO correction for an SLO
   *
   * <p>See {@link #getSLOCorrectionWithHttpInfo}.
   *
   * @param sloCorrectionId The ID of the SLO correction object. (required)
   * @return SLOCorrectionResponse
   * @throws ApiException if fails to make API call
   */
  public SLOCorrectionResponse getSLOCorrection(String sloCorrectionId) throws ApiException {
    return getSLOCorrectionWithHttpInfo(sloCorrectionId).getData();
  }

  /**
   * Get an SLO correction for an SLO
   *
   * <p>See {@link #getSLOCorrectionWithHttpInfoAsync}.
   *
   * @param sloCorrectionId The ID of the SLO correction object. (required)
   * @return CompletableFuture&lt;SLOCorrectionResponse&gt;
   */
  public CompletableFuture<SLOCorrectionResponse> getSLOCorrectionAsync(String sloCorrectionId) {
    return getSLOCorrectionWithHttpInfoAsync(sloCorrectionId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get an SLO correction for an SLO
   *
   * <p>Get an SLO correction.
   *
   * @param sloCorrectionId The ID of the SLO correction object. (required)
   * @return ApiResponse&lt;SLOCorrectionResponse&gt;
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
  public ApiResponse<SLOCorrectionResponse> getSLOCorrectionWithHttpInfo(String sloCorrectionId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'sloCorrectionId' is set
    if (sloCorrectionId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'sloCorrectionId' when calling getSLOCorrection");
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/slo/correction/{slo_correction_id}"
            .replaceAll(
                "\\{" + "slo_correction_id" + "\\}",
                apiClient.escapeString(sloCorrectionId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "ServiceLevelObjectiveCorrectionsApi.getSLOCorrection",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<SLOCorrectionResponse>() {});
  }

  /**
   * Get an SLO correction for an SLO
   *
   * <p>See {@link #getSLOCorrectionWithHttpInfo}.
   *
   * @param sloCorrectionId The ID of the SLO correction object. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SLOCorrectionResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SLOCorrectionResponse>> getSLOCorrectionWithHttpInfoAsync(
      String sloCorrectionId) {
    Object localVarPostBody = null;

    // verify the required parameter 'sloCorrectionId' is set
    if (sloCorrectionId == null) {
      CompletableFuture<ApiResponse<SLOCorrectionResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'sloCorrectionId' when calling getSLOCorrection"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/slo/correction/{slo_correction_id}"
            .replaceAll(
                "\\{" + "slo_correction_id" + "\\}",
                apiClient.escapeString(sloCorrectionId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getSLOCorrection");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "ServiceLevelObjectiveCorrectionsApi.getSLOCorrection",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SLOCorrectionResponse>> result = new CompletableFuture<>();
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
        new GenericType<SLOCorrectionResponse>() {});
  }

  /**
   * Get all SLO corrections
   *
   * <p>See {@link #listSLOCorrectionWithHttpInfo}.
   *
   * @return SLOCorrectionListResponse
   * @throws ApiException if fails to make API call
   */
  public SLOCorrectionListResponse listSLOCorrection() throws ApiException {
    return listSLOCorrectionWithHttpInfo().getData();
  }

  /**
   * Get all SLO corrections
   *
   * <p>See {@link #listSLOCorrectionWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;SLOCorrectionListResponse&gt;
   */
  public CompletableFuture<SLOCorrectionListResponse> listSLOCorrectionAsync() {
    return listSLOCorrectionWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get all SLO corrections
   *
   * <p>Get all Service Level Objective corrections.
   *
   * @return ApiResponse&lt;SLOCorrectionListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SLOCorrectionListResponse> listSLOCorrectionWithHttpInfo()
      throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v1/slo/correction";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "ServiceLevelObjectiveCorrectionsApi.listSLOCorrection",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<SLOCorrectionListResponse>() {});
  }

  /**
   * Get all SLO corrections
   *
   * <p>See {@link #listSLOCorrectionWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;SLOCorrectionListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SLOCorrectionListResponse>>
      listSLOCorrectionWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v1/slo/correction";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listSLOCorrection");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "ServiceLevelObjectiveCorrectionsApi.listSLOCorrection",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SLOCorrectionListResponse>> result = new CompletableFuture<>();
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
        new GenericType<SLOCorrectionListResponse>() {});
  }

  /**
   * Update an SLO correction
   *
   * <p>See {@link #updateSLOCorrectionWithHttpInfo}.
   *
   * @param sloCorrectionId The ID of the SLO correction object. (required)
   * @param body The edited SLO correction object. (required)
   * @return SLOCorrectionResponse
   * @throws ApiException if fails to make API call
   */
  public SLOCorrectionResponse updateSLOCorrection(
      String sloCorrectionId, SLOCorrectionUpdateRequest body) throws ApiException {
    return updateSLOCorrectionWithHttpInfo(sloCorrectionId, body).getData();
  }

  /**
   * Update an SLO correction
   *
   * <p>See {@link #updateSLOCorrectionWithHttpInfoAsync}.
   *
   * @param sloCorrectionId The ID of the SLO correction object. (required)
   * @param body The edited SLO correction object. (required)
   * @return CompletableFuture&lt;SLOCorrectionResponse&gt;
   */
  public CompletableFuture<SLOCorrectionResponse> updateSLOCorrectionAsync(
      String sloCorrectionId, SLOCorrectionUpdateRequest body) {
    return updateSLOCorrectionWithHttpInfoAsync(sloCorrectionId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update an SLO correction
   *
   * <p>Update the specified SLO correction object object.
   *
   * @param sloCorrectionId The ID of the SLO correction object. (required)
   * @param body The edited SLO correction object. (required)
   * @return ApiResponse&lt;SLOCorrectionResponse&gt;
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
  public ApiResponse<SLOCorrectionResponse> updateSLOCorrectionWithHttpInfo(
      String sloCorrectionId, SLOCorrectionUpdateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'sloCorrectionId' is set
    if (sloCorrectionId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'sloCorrectionId' when calling updateSLOCorrection");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateSLOCorrection");
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/slo/correction/{slo_correction_id}"
            .replaceAll(
                "\\{" + "slo_correction_id" + "\\}",
                apiClient.escapeString(sloCorrectionId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "ServiceLevelObjectiveCorrectionsApi.updateSLOCorrection",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<SLOCorrectionResponse>() {});
  }

  /**
   * Update an SLO correction
   *
   * <p>See {@link #updateSLOCorrectionWithHttpInfo}.
   *
   * @param sloCorrectionId The ID of the SLO correction object. (required)
   * @param body The edited SLO correction object. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SLOCorrectionResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SLOCorrectionResponse>> updateSLOCorrectionWithHttpInfoAsync(
      String sloCorrectionId, SLOCorrectionUpdateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'sloCorrectionId' is set
    if (sloCorrectionId == null) {
      CompletableFuture<ApiResponse<SLOCorrectionResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'sloCorrectionId' when calling updateSLOCorrection"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<SLOCorrectionResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateSLOCorrection"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/slo/correction/{slo_correction_id}"
            .replaceAll(
                "\\{" + "slo_correction_id" + "\\}",
                apiClient.escapeString(sloCorrectionId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "updateSLOCorrection");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "ServiceLevelObjectiveCorrectionsApi.updateSLOCorrection",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SLOCorrectionResponse>> result = new CompletableFuture<>();
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
        new GenericType<SLOCorrectionResponse>() {});
  }
}
