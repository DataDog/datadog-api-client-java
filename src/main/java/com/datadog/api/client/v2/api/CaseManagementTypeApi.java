package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.CaseTypeCreateRequest;
import com.datadog.api.client.v2.model.CaseTypeResponse;
import com.datadog.api.client.v2.model.CaseTypesResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CaseManagementTypeApi {
  private ApiClient apiClient;

  public CaseManagementTypeApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public CaseManagementTypeApi(ApiClient apiClient) {
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
   * Create a case type.
   *
   * <p>See {@link #createCaseTypeWithHttpInfo}.
   *
   * @param body Case type payload (required)
   * @return CaseTypeResponse
   * @throws ApiException if fails to make API call
   */
  public CaseTypeResponse createCaseType(CaseTypeCreateRequest body) throws ApiException {
    return createCaseTypeWithHttpInfo(body).getData();
  }

  /**
   * Create a case type.
   *
   * <p>See {@link #createCaseTypeWithHttpInfoAsync}.
   *
   * @param body Case type payload (required)
   * @return CompletableFuture&lt;CaseTypeResponse&gt;
   */
  public CompletableFuture<CaseTypeResponse> createCaseTypeAsync(CaseTypeCreateRequest body) {
    return createCaseTypeWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a Case Type
   *
   * @param body Case type payload (required)
   * @return ApiResponse&lt;CaseTypeResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> CREATED </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CaseTypeResponse> createCaseTypeWithHttpInfo(CaseTypeCreateRequest body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createCaseType");
    }
    // create path and map variables
    String localVarPath = "/api/v2/cases/types";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CaseManagementTypeApi.createCaseType",
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
        new GenericType<CaseTypeResponse>() {});
  }

  /**
   * Create a case type.
   *
   * <p>See {@link #createCaseTypeWithHttpInfo}.
   *
   * @param body Case type payload (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CaseTypeResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CaseTypeResponse>> createCaseTypeWithHttpInfoAsync(
      CaseTypeCreateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<CaseTypeResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createCaseType"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/cases/types";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CaseManagementTypeApi.createCaseType",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CaseTypeResponse>> result = new CompletableFuture<>();
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
        new GenericType<CaseTypeResponse>() {});
  }

  /**
   * Delete a case type.
   *
   * <p>See {@link #deleteCaseTypeWithHttpInfo}.
   *
   * @param caseTypeId Case type's UUID (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteCaseType(String caseTypeId) throws ApiException {
    deleteCaseTypeWithHttpInfo(caseTypeId);
  }

  /**
   * Delete a case type.
   *
   * <p>See {@link #deleteCaseTypeWithHttpInfoAsync}.
   *
   * @param caseTypeId Case type's UUID (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteCaseTypeAsync(String caseTypeId) {
    return deleteCaseTypeWithHttpInfoAsync(caseTypeId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete a case type
   *
   * @param caseTypeId Case type's UUID (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteCaseTypeWithHttpInfo(String caseTypeId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'caseTypeId' is set
    if (caseTypeId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'caseTypeId' when calling deleteCaseType");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/types/{case_type_id}"
            .replaceAll(
                "\\{" + "case_type_id" + "\\}", apiClient.escapeString(caseTypeId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CaseManagementTypeApi.deleteCaseType",
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
   * Delete a case type.
   *
   * <p>See {@link #deleteCaseTypeWithHttpInfo}.
   *
   * @param caseTypeId Case type's UUID (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteCaseTypeWithHttpInfoAsync(String caseTypeId) {
    Object localVarPostBody = null;

    // verify the required parameter 'caseTypeId' is set
    if (caseTypeId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'caseTypeId' when calling deleteCaseType"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/types/{case_type_id}"
            .replaceAll(
                "\\{" + "case_type_id" + "\\}", apiClient.escapeString(caseTypeId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CaseManagementTypeApi.deleteCaseType",
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
   * Get all case types.
   *
   * <p>See {@link #getAllCaseTypesWithHttpInfo}.
   *
   * @return CaseTypesResponse
   * @throws ApiException if fails to make API call
   */
  public CaseTypesResponse getAllCaseTypes() throws ApiException {
    return getAllCaseTypesWithHttpInfo().getData();
  }

  /**
   * Get all case types.
   *
   * <p>See {@link #getAllCaseTypesWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;CaseTypesResponse&gt;
   */
  public CompletableFuture<CaseTypesResponse> getAllCaseTypesAsync() {
    return getAllCaseTypesWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get all case types
   *
   * @return ApiResponse&lt;CaseTypesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CaseTypesResponse> getAllCaseTypesWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/cases/types";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CaseManagementTypeApi.getAllCaseTypes",
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
        new GenericType<CaseTypesResponse>() {});
  }

  /**
   * Get all case types.
   *
   * <p>See {@link #getAllCaseTypesWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;CaseTypesResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CaseTypesResponse>> getAllCaseTypesWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/cases/types";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CaseManagementTypeApi.getAllCaseTypes",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CaseTypesResponse>> result = new CompletableFuture<>();
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
        new GenericType<CaseTypesResponse>() {});
  }
}
