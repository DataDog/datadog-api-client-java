package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.DemBatchGetJourneysRequest;
import com.datadog.api.client.v2.model.DemCreateJourneyTestSuiteRequest;
import com.datadog.api.client.v2.model.DemInferredJourneyStatus;
import com.datadog.api.client.v2.model.DemJourneyCreateRequest;
import com.datadog.api.client.v2.model.DemJourneyResponse;
import com.datadog.api.client.v2.model.DemJourneyTestSuiteResponse;
import com.datadog.api.client.v2.model.DemJourneysListResponse;
import com.datadog.api.client.v2.model.DemRecommendedTestsResponse;
import com.datadog.api.client.v2.model.DemSearchInferredJourneysResponse;
import com.datadog.api.client.v2.model.DemVariantRequest;
import com.datadog.api.client.v2.model.DemVariantResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DemApi {
  private ApiClient apiClient;

  public DemApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public DemApi(ApiClient apiClient) {
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
   * Batch get DEM journeys by test suite IDs.
   *
   * <p>See {@link #batchGetJourneysByTestSuiteIDsWithHttpInfo}.
   *
   * @param body (required)
   * @return DemJourneysListResponse
   * @throws ApiException if fails to make API call
   */
  public DemJourneysListResponse batchGetJourneysByTestSuiteIDs(DemBatchGetJourneysRequest body)
      throws ApiException {
    return batchGetJourneysByTestSuiteIDsWithHttpInfo(body).getData();
  }

  /**
   * Batch get DEM journeys by test suite IDs.
   *
   * <p>See {@link #batchGetJourneysByTestSuiteIDsWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;DemJourneysListResponse&gt;
   */
  public CompletableFuture<DemJourneysListResponse> batchGetJourneysByTestSuiteIDsAsync(
      DemBatchGetJourneysRequest body) {
    return batchGetJourneysByTestSuiteIDsWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Return DEM journeys associated with multiple given test suite IDs.
   *
   * @param body (required)
   * @return ApiResponse&lt;DemJourneysListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<DemJourneysListResponse> batchGetJourneysByTestSuiteIDsWithHttpInfo(
      DemBatchGetJourneysRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling batchGetJourneysByTestSuiteIDs");
    }
    // create path and map variables
    String localVarPath = "/api/v2/dem/journeys/suites/batch";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.DemApi.batchGetJourneysByTestSuiteIDs",
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
        new GenericType<DemJourneysListResponse>() {});
  }

  /**
   * Batch get DEM journeys by test suite IDs.
   *
   * <p>See {@link #batchGetJourneysByTestSuiteIDsWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;DemJourneysListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<DemJourneysListResponse>>
      batchGetJourneysByTestSuiteIDsWithHttpInfoAsync(DemBatchGetJourneysRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<DemJourneysListResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling batchGetJourneysByTestSuiteIDs"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/dem/journeys/suites/batch";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.DemApi.batchGetJourneysByTestSuiteIDs",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<DemJourneysListResponse>> result = new CompletableFuture<>();
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
        new GenericType<DemJourneysListResponse>() {});
  }

  /**
   * Create a DEM journey.
   *
   * <p>See {@link #createJourneyWithHttpInfo}.
   *
   * @param body (required)
   * @return DemJourneyResponse
   * @throws ApiException if fails to make API call
   */
  public DemJourneyResponse createJourney(DemJourneyCreateRequest body) throws ApiException {
    return createJourneyWithHttpInfo(body).getData();
  }

  /**
   * Create a DEM journey.
   *
   * <p>See {@link #createJourneyWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;DemJourneyResponse&gt;
   */
  public CompletableFuture<DemJourneyResponse> createJourneyAsync(DemJourneyCreateRequest body) {
    return createJourneyWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a DEM journey.
   *
   * @param body (required)
   * @return ApiResponse&lt;DemJourneyResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<DemJourneyResponse> createJourneyWithHttpInfo(DemJourneyCreateRequest body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createJourney");
    }
    // create path and map variables
    String localVarPath = "/api/v2/dem/journeys";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.DemApi.createJourney",
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
        new GenericType<DemJourneyResponse>() {});
  }

  /**
   * Create a DEM journey.
   *
   * <p>See {@link #createJourneyWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;DemJourneyResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<DemJourneyResponse>> createJourneyWithHttpInfoAsync(
      DemJourneyCreateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<DemJourneyResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createJourney"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/dem/journeys";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.DemApi.createJourney",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<DemJourneyResponse>> result = new CompletableFuture<>();
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
        new GenericType<DemJourneyResponse>() {});
  }

  /**
   * Create a DEM journey variant.
   *
   * <p>See {@link #createJourneyVariantWithHttpInfo}.
   *
   * @param journeyId The unique identifier of the journey that owns the variant. (required)
   * @param body (required)
   * @return DemVariantResponse
   * @throws ApiException if fails to make API call
   */
  public DemVariantResponse createJourneyVariant(String journeyId, DemVariantRequest body)
      throws ApiException {
    return createJourneyVariantWithHttpInfo(journeyId, body).getData();
  }

  /**
   * Create a DEM journey variant.
   *
   * <p>See {@link #createJourneyVariantWithHttpInfoAsync}.
   *
   * @param journeyId The unique identifier of the journey that owns the variant. (required)
   * @param body (required)
   * @return CompletableFuture&lt;DemVariantResponse&gt;
   */
  public CompletableFuture<DemVariantResponse> createJourneyVariantAsync(
      String journeyId, DemVariantRequest body) {
    return createJourneyVariantWithHttpInfoAsync(journeyId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a variant for a DEM journey.
   *
   * @param journeyId The unique identifier of the journey that owns the variant. (required)
   * @param body (required)
   * @return ApiResponse&lt;DemVariantResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<DemVariantResponse> createJourneyVariantWithHttpInfo(
      String journeyId, DemVariantRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'journeyId' is set
    if (journeyId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'journeyId' when calling createJourneyVariant");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createJourneyVariant");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/dem/journeys/{journey_id}/variants"
            .replaceAll("\\{" + "journey_id" + "\\}", apiClient.escapeString(journeyId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.DemApi.createJourneyVariant",
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
        new GenericType<DemVariantResponse>() {});
  }

  /**
   * Create a DEM journey variant.
   *
   * <p>See {@link #createJourneyVariantWithHttpInfo}.
   *
   * @param journeyId The unique identifier of the journey that owns the variant. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;DemVariantResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<DemVariantResponse>> createJourneyVariantWithHttpInfoAsync(
      String journeyId, DemVariantRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'journeyId' is set
    if (journeyId == null) {
      CompletableFuture<ApiResponse<DemVariantResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'journeyId' when calling createJourneyVariant"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<DemVariantResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createJourneyVariant"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/dem/journeys/{journey_id}/variants"
            .replaceAll("\\{" + "journey_id" + "\\}", apiClient.escapeString(journeyId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.DemApi.createJourneyVariant",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<DemVariantResponse>> result = new CompletableFuture<>();
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
        new GenericType<DemVariantResponse>() {});
  }

  /**
   * Create a test suite for a DEM journey.
   *
   * <p>See {@link #createTestSuiteForJourneyWithHttpInfo}.
   *
   * @param publicJourneyId The public identifier of the DEM journey for which to create a test
   *     suite. (required)
   * @param body (required)
   * @return DemJourneyTestSuiteResponse
   * @throws ApiException if fails to make API call
   */
  public DemJourneyTestSuiteResponse createTestSuiteForJourney(
      String publicJourneyId, DemCreateJourneyTestSuiteRequest body) throws ApiException {
    return createTestSuiteForJourneyWithHttpInfo(publicJourneyId, body).getData();
  }

  /**
   * Create a test suite for a DEM journey.
   *
   * <p>See {@link #createTestSuiteForJourneyWithHttpInfoAsync}.
   *
   * @param publicJourneyId The public identifier of the DEM journey for which to create a test
   *     suite. (required)
   * @param body (required)
   * @return CompletableFuture&lt;DemJourneyTestSuiteResponse&gt;
   */
  public CompletableFuture<DemJourneyTestSuiteResponse> createTestSuiteForJourneyAsync(
      String publicJourneyId, DemCreateJourneyTestSuiteRequest body) {
    return createTestSuiteForJourneyWithHttpInfoAsync(publicJourneyId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Trigger test suite creation for a given DEM journey.
   *
   * @param publicJourneyId The public identifier of the DEM journey for which to create a test
   *     suite. (required)
   * @param body (required)
   * @return ApiResponse&lt;DemJourneyTestSuiteResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<DemJourneyTestSuiteResponse> createTestSuiteForJourneyWithHttpInfo(
      String publicJourneyId, DemCreateJourneyTestSuiteRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'publicJourneyId' is set
    if (publicJourneyId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'publicJourneyId' when calling"
              + " createTestSuiteForJourney");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createTestSuiteForJourney");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/dem/journeys/{public_journey_id}/suite"
            .replaceAll(
                "\\{" + "public_journey_id" + "\\}",
                apiClient.escapeString(publicJourneyId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.DemApi.createTestSuiteForJourney",
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
        new GenericType<DemJourneyTestSuiteResponse>() {});
  }

  /**
   * Create a test suite for a DEM journey.
   *
   * <p>See {@link #createTestSuiteForJourneyWithHttpInfo}.
   *
   * @param publicJourneyId The public identifier of the DEM journey for which to create a test
   *     suite. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;DemJourneyTestSuiteResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<DemJourneyTestSuiteResponse>>
      createTestSuiteForJourneyWithHttpInfoAsync(
          String publicJourneyId, DemCreateJourneyTestSuiteRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'publicJourneyId' is set
    if (publicJourneyId == null) {
      CompletableFuture<ApiResponse<DemJourneyTestSuiteResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'publicJourneyId' when calling"
                  + " createTestSuiteForJourney"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<DemJourneyTestSuiteResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createTestSuiteForJourney"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/dem/journeys/{public_journey_id}/suite"
            .replaceAll(
                "\\{" + "public_journey_id" + "\\}",
                apiClient.escapeString(publicJourneyId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.DemApi.createTestSuiteForJourney",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<DemJourneyTestSuiteResponse>> result =
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
        new GenericType<DemJourneyTestSuiteResponse>() {});
  }

  /**
   * Delete an ignored inferred DEM journey.
   *
   * <p>See {@link #deleteIgnoredInferredJourneyWithHttpInfo}.
   *
   * @param journeyId The unique identifier of the ignored inferred journey to delete. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteIgnoredInferredJourney(String journeyId) throws ApiException {
    deleteIgnoredInferredJourneyWithHttpInfo(journeyId);
  }

  /**
   * Delete an ignored inferred DEM journey.
   *
   * <p>See {@link #deleteIgnoredInferredJourneyWithHttpInfoAsync}.
   *
   * @param journeyId The unique identifier of the ignored inferred journey to delete. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteIgnoredInferredJourneyAsync(String journeyId) {
    return deleteIgnoredInferredJourneyWithHttpInfoAsync(journeyId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Remove an ignored inferred DEM journey, making it eligible to appear as a candidate again.
   *
   * @param journeyId The unique identifier of the ignored inferred journey to delete. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteIgnoredInferredJourneyWithHttpInfo(String journeyId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'journeyId' is set
    if (journeyId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'journeyId' when calling deleteIgnoredInferredJourney");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/dem/journeys/inferred/ignored/{journey_id}"
            .replaceAll("\\{" + "journey_id" + "\\}", apiClient.escapeString(journeyId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.DemApi.deleteIgnoredInferredJourney",
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
   * Delete an ignored inferred DEM journey.
   *
   * <p>See {@link #deleteIgnoredInferredJourneyWithHttpInfo}.
   *
   * @param journeyId The unique identifier of the ignored inferred journey to delete. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteIgnoredInferredJourneyWithHttpInfoAsync(
      String journeyId) {
    Object localVarPostBody = null;

    // verify the required parameter 'journeyId' is set
    if (journeyId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'journeyId' when calling"
                  + " deleteIgnoredInferredJourney"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/dem/journeys/inferred/ignored/{journey_id}"
            .replaceAll("\\{" + "journey_id" + "\\}", apiClient.escapeString(journeyId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.DemApi.deleteIgnoredInferredJourney",
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
   * Delete a DEM journey.
   *
   * <p>See {@link #deleteJourneyWithHttpInfo}.
   *
   * @param journeyId The unique identifier of the DEM journey to delete. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteJourney(String journeyId) throws ApiException {
    deleteJourneyWithHttpInfo(journeyId);
  }

  /**
   * Delete a DEM journey.
   *
   * <p>See {@link #deleteJourneyWithHttpInfoAsync}.
   *
   * @param journeyId The unique identifier of the DEM journey to delete. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteJourneyAsync(String journeyId) {
    return deleteJourneyWithHttpInfoAsync(journeyId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete a DEM journey by its ID.
   *
   * @param journeyId The unique identifier of the DEM journey to delete. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteJourneyWithHttpInfo(String journeyId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'journeyId' is set
    if (journeyId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'journeyId' when calling deleteJourney");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/dem/journeys/{journey_id}"
            .replaceAll("\\{" + "journey_id" + "\\}", apiClient.escapeString(journeyId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.DemApi.deleteJourney",
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
   * Delete a DEM journey.
   *
   * <p>See {@link #deleteJourneyWithHttpInfo}.
   *
   * @param journeyId The unique identifier of the DEM journey to delete. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteJourneyWithHttpInfoAsync(String journeyId) {
    Object localVarPostBody = null;

    // verify the required parameter 'journeyId' is set
    if (journeyId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'journeyId' when calling deleteJourney"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/dem/journeys/{journey_id}"
            .replaceAll("\\{" + "journey_id" + "\\}", apiClient.escapeString(journeyId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.DemApi.deleteJourney",
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
   * Delete a DEM journey variant.
   *
   * <p>See {@link #deleteJourneyVariantWithHttpInfo}.
   *
   * @param variantId The unique identifier of the variant to delete. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteJourneyVariant(String variantId) throws ApiException {
    deleteJourneyVariantWithHttpInfo(variantId);
  }

  /**
   * Delete a DEM journey variant.
   *
   * <p>See {@link #deleteJourneyVariantWithHttpInfoAsync}.
   *
   * @param variantId The unique identifier of the variant to delete. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteJourneyVariantAsync(String variantId) {
    return deleteJourneyVariantWithHttpInfoAsync(variantId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete a variant from a DEM journey.
   *
   * @param variantId The unique identifier of the variant to delete. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteJourneyVariantWithHttpInfo(String variantId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'variantId' is set
    if (variantId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'variantId' when calling deleteJourneyVariant");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/dem/journeys/variants/{variant_id}"
            .replaceAll("\\{" + "variant_id" + "\\}", apiClient.escapeString(variantId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.DemApi.deleteJourneyVariant",
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
   * Delete a DEM journey variant.
   *
   * <p>See {@link #deleteJourneyVariantWithHttpInfo}.
   *
   * @param variantId The unique identifier of the variant to delete. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteJourneyVariantWithHttpInfoAsync(
      String variantId) {
    Object localVarPostBody = null;

    // verify the required parameter 'variantId' is set
    if (variantId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'variantId' when calling deleteJourneyVariant"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/dem/journeys/variants/{variant_id}"
            .replaceAll("\\{" + "variant_id" + "\\}", apiClient.escapeString(variantId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.DemApi.deleteJourneyVariant",
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
   * Get a DEM journey.
   *
   * <p>See {@link #getJourneyWithHttpInfo}.
   *
   * @param journeyId The unique identifier of the DEM journey. (required)
   * @return DemJourneyResponse
   * @throws ApiException if fails to make API call
   */
  public DemJourneyResponse getJourney(String journeyId) throws ApiException {
    return getJourneyWithHttpInfo(journeyId).getData();
  }

  /**
   * Get a DEM journey.
   *
   * <p>See {@link #getJourneyWithHttpInfoAsync}.
   *
   * @param journeyId The unique identifier of the DEM journey. (required)
   * @return CompletableFuture&lt;DemJourneyResponse&gt;
   */
  public CompletableFuture<DemJourneyResponse> getJourneyAsync(String journeyId) {
    return getJourneyWithHttpInfoAsync(journeyId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Retrieve a single DEM journey by its ID.
   *
   * @param journeyId The unique identifier of the DEM journey. (required)
   * @return ApiResponse&lt;DemJourneyResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<DemJourneyResponse> getJourneyWithHttpInfo(String journeyId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'journeyId' is set
    if (journeyId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'journeyId' when calling getJourney");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/dem/journeys/{journey_id}"
            .replaceAll("\\{" + "journey_id" + "\\}", apiClient.escapeString(journeyId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.DemApi.getJourney",
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
        new GenericType<DemJourneyResponse>() {});
  }

  /**
   * Get a DEM journey.
   *
   * <p>See {@link #getJourneyWithHttpInfo}.
   *
   * @param journeyId The unique identifier of the DEM journey. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;DemJourneyResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<DemJourneyResponse>> getJourneyWithHttpInfoAsync(
      String journeyId) {
    Object localVarPostBody = null;

    // verify the required parameter 'journeyId' is set
    if (journeyId == null) {
      CompletableFuture<ApiResponse<DemJourneyResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'journeyId' when calling getJourney"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/dem/journeys/{journey_id}"
            .replaceAll("\\{" + "journey_id" + "\\}", apiClient.escapeString(journeyId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.DemApi.getJourney",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<DemJourneyResponse>> result = new CompletableFuture<>();
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
        new GenericType<DemJourneyResponse>() {});
  }

  /**
   * Get recommended tests for a DEM journey.
   *
   * <p>See {@link #getJourneyRecommendedTestsWithHttpInfo}.
   *
   * @param journeyId The unique identifier of the journey. (required)
   * @return DemRecommendedTestsResponse
   * @throws ApiException if fails to make API call
   */
  public DemRecommendedTestsResponse getJourneyRecommendedTests(String journeyId)
      throws ApiException {
    return getJourneyRecommendedTestsWithHttpInfo(journeyId).getData();
  }

  /**
   * Get recommended tests for a DEM journey.
   *
   * <p>See {@link #getJourneyRecommendedTestsWithHttpInfoAsync}.
   *
   * @param journeyId The unique identifier of the journey. (required)
   * @return CompletableFuture&lt;DemRecommendedTestsResponse&gt;
   */
  public CompletableFuture<DemRecommendedTestsResponse> getJourneyRecommendedTestsAsync(
      String journeyId) {
    return getJourneyRecommendedTestsWithHttpInfoAsync(journeyId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Retrieve AI-recommended synthetic tests for a DEM journey. Returns an empty list when no
   * recommendation is available.
   *
   * @param journeyId The unique identifier of the journey. (required)
   * @return ApiResponse&lt;DemRecommendedTestsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<DemRecommendedTestsResponse> getJourneyRecommendedTestsWithHttpInfo(
      String journeyId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'journeyId' is set
    if (journeyId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'journeyId' when calling getJourneyRecommendedTests");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/dem/journeys/{journey_id}/recommended-tests"
            .replaceAll("\\{" + "journey_id" + "\\}", apiClient.escapeString(journeyId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.DemApi.getJourneyRecommendedTests",
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
        new GenericType<DemRecommendedTestsResponse>() {});
  }

  /**
   * Get recommended tests for a DEM journey.
   *
   * <p>See {@link #getJourneyRecommendedTestsWithHttpInfo}.
   *
   * @param journeyId The unique identifier of the journey. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;DemRecommendedTestsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<DemRecommendedTestsResponse>>
      getJourneyRecommendedTestsWithHttpInfoAsync(String journeyId) {
    Object localVarPostBody = null;

    // verify the required parameter 'journeyId' is set
    if (journeyId == null) {
      CompletableFuture<ApiResponse<DemRecommendedTestsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'journeyId' when calling"
                  + " getJourneyRecommendedTests"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/dem/journeys/{journey_id}/recommended-tests"
            .replaceAll("\\{" + "journey_id" + "\\}", apiClient.escapeString(journeyId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.DemApi.getJourneyRecommendedTests",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<DemRecommendedTestsResponse>> result =
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
        new GenericType<DemRecommendedTestsResponse>() {});
  }

  /**
   * Ignore an inferred DEM journey.
   *
   * <p>See {@link #ignoreInferredJourneyWithHttpInfo}.
   *
   * @param journeyId The unique identifier of the inferred journey to ignore. (required)
   * @throws ApiException if fails to make API call
   */
  public void ignoreInferredJourney(String journeyId) throws ApiException {
    ignoreInferredJourneyWithHttpInfo(journeyId);
  }

  /**
   * Ignore an inferred DEM journey.
   *
   * <p>See {@link #ignoreInferredJourneyWithHttpInfoAsync}.
   *
   * @param journeyId The unique identifier of the inferred journey to ignore. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> ignoreInferredJourneyAsync(String journeyId) {
    return ignoreInferredJourneyWithHttpInfoAsync(journeyId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Mark an inferred DEM journey as ignored so it no longer appears in the candidate list.
   *
   * @param journeyId The unique identifier of the inferred journey to ignore. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> ignoreInferredJourneyWithHttpInfo(String journeyId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'journeyId' is set
    if (journeyId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'journeyId' when calling ignoreInferredJourney");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/dem/journeys/inferred/{journey_id}/ignore"
            .replaceAll("\\{" + "journey_id" + "\\}", apiClient.escapeString(journeyId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.DemApi.ignoreInferredJourney",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
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
   * Ignore an inferred DEM journey.
   *
   * <p>See {@link #ignoreInferredJourneyWithHttpInfo}.
   *
   * @param journeyId The unique identifier of the inferred journey to ignore. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> ignoreInferredJourneyWithHttpInfoAsync(
      String journeyId) {
    Object localVarPostBody = null;

    // verify the required parameter 'journeyId' is set
    if (journeyId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'journeyId' when calling ignoreInferredJourney"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/dem/journeys/inferred/{journey_id}/ignore"
            .replaceAll("\\{" + "journey_id" + "\\}", apiClient.escapeString(journeyId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.DemApi.ignoreInferredJourney",
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
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /** Manage optional parameters to searchInferredJourneys. */
  public static class SearchInferredJourneysOptionalParameters {
    private DemInferredJourneyStatus status;
    private String q;
    private String appId;

    /**
     * Set status.
     *
     * @param status Filter by inferred journey status. Use <code>candidate</code> (default) to
     *     retrieve journeys suggested for promotion, or <code>ignored</code> to retrieve journeys
     *     that have been dismissed. (optional, default to "candidate")
     * @return SearchInferredJourneysOptionalParameters
     */
    public SearchInferredJourneysOptionalParameters status(DemInferredJourneyStatus status) {
      this.status = status;
      return this;
    }

    /**
     * Set q.
     *
     * @param q Fuzzy search query to filter inferred journeys by name. (optional)
     * @return SearchInferredJourneysOptionalParameters
     */
    public SearchInferredJourneysOptionalParameters q(String q) {
      this.q = q;
      return this;
    }

    /**
     * Set appId.
     *
     * @param appId Filter inferred journeys by application ID. (optional)
     * @return SearchInferredJourneysOptionalParameters
     */
    public SearchInferredJourneysOptionalParameters appId(String appId) {
      this.appId = appId;
      return this;
    }
  }

  /**
   * Search inferred DEM journeys.
   *
   * <p>See {@link #searchInferredJourneysWithHttpInfo}.
   *
   * @return DemSearchInferredJourneysResponse
   * @throws ApiException if fails to make API call
   */
  public DemSearchInferredJourneysResponse searchInferredJourneys() throws ApiException {
    return searchInferredJourneysWithHttpInfo(new SearchInferredJourneysOptionalParameters())
        .getData();
  }

  /**
   * Search inferred DEM journeys.
   *
   * <p>See {@link #searchInferredJourneysWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;DemSearchInferredJourneysResponse&gt;
   */
  public CompletableFuture<DemSearchInferredJourneysResponse> searchInferredJourneysAsync() {
    return searchInferredJourneysWithHttpInfoAsync(new SearchInferredJourneysOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Search inferred DEM journeys.
   *
   * <p>See {@link #searchInferredJourneysWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return DemSearchInferredJourneysResponse
   * @throws ApiException if fails to make API call
   */
  public DemSearchInferredJourneysResponse searchInferredJourneys(
      SearchInferredJourneysOptionalParameters parameters) throws ApiException {
    return searchInferredJourneysWithHttpInfo(parameters).getData();
  }

  /**
   * Search inferred DEM journeys.
   *
   * <p>See {@link #searchInferredJourneysWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;DemSearchInferredJourneysResponse&gt;
   */
  public CompletableFuture<DemSearchInferredJourneysResponse> searchInferredJourneysAsync(
      SearchInferredJourneysOptionalParameters parameters) {
    return searchInferredJourneysWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Search for inferred DEM journeys by status. Returns candidates (status=candidate, the default)
   * or ignored journeys (status=ignored). Supports optional fuzzy name filtering and app ID
   * filtering.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;DemSearchInferredJourneysResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<DemSearchInferredJourneysResponse> searchInferredJourneysWithHttpInfo(
      SearchInferredJourneysOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    DemInferredJourneyStatus status = parameters.status;
    String q = parameters.q;
    String appId = parameters.appId;
    // create path and map variables
    String localVarPath = "/api/v2/dem/journeys/inferred/search";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "status", status));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "q", q));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "app_id", appId));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.DemApi.searchInferredJourneys",
            localVarPath,
            localVarQueryParams,
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
        new GenericType<DemSearchInferredJourneysResponse>() {});
  }

  /**
   * Search inferred DEM journeys.
   *
   * <p>See {@link #searchInferredJourneysWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;DemSearchInferredJourneysResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<DemSearchInferredJourneysResponse>>
      searchInferredJourneysWithHttpInfoAsync(SearchInferredJourneysOptionalParameters parameters) {
    Object localVarPostBody = null;
    DemInferredJourneyStatus status = parameters.status;
    String q = parameters.q;
    String appId = parameters.appId;
    // create path and map variables
    String localVarPath = "/api/v2/dem/journeys/inferred/search";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "status", status));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "q", q));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "app_id", appId));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.DemApi.searchInferredJourneys",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<DemSearchInferredJourneysResponse>> result =
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
        new GenericType<DemSearchInferredJourneysResponse>() {});
  }

  /** Manage optional parameters to searchJourneys. */
  public static class SearchJourneysOptionalParameters {
    private String query;
    private Long pageOffset;
    private Long pageLimit;
    private String creator;
    private String team;
    private String appId;

    /**
     * Set query.
     *
     * @param query A search query string to filter journeys by name. (optional)
     * @return SearchJourneysOptionalParameters
     */
    public SearchJourneysOptionalParameters query(String query) {
      this.query = query;
      return this;
    }

    /**
     * Set pageOffset.
     *
     * @param pageOffset The offset for pagination. (optional)
     * @return SearchJourneysOptionalParameters
     */
    public SearchJourneysOptionalParameters pageOffset(Long pageOffset) {
      this.pageOffset = pageOffset;
      return this;
    }

    /**
     * Set pageLimit.
     *
     * @param pageLimit The maximum number of results to return. (optional)
     * @return SearchJourneysOptionalParameters
     */
    public SearchJourneysOptionalParameters pageLimit(Long pageLimit) {
      this.pageLimit = pageLimit;
      return this;
    }

    /**
     * Set creator.
     *
     * @param creator Filter journeys by creator handle. (optional)
     * @return SearchJourneysOptionalParameters
     */
    public SearchJourneysOptionalParameters creator(String creator) {
      this.creator = creator;
      return this;
    }

    /**
     * Set team.
     *
     * @param team Filter journeys by team tag. (optional)
     * @return SearchJourneysOptionalParameters
     */
    public SearchJourneysOptionalParameters team(String team) {
      this.team = team;
      return this;
    }

    /**
     * Set appId.
     *
     * @param appId Filter journeys by application ID. (optional)
     * @return SearchJourneysOptionalParameters
     */
    public SearchJourneysOptionalParameters appId(String appId) {
      this.appId = appId;
      return this;
    }
  }

  /**
   * Search DEM journeys.
   *
   * <p>See {@link #searchJourneysWithHttpInfo}.
   *
   * @return DemJourneysListResponse
   * @throws ApiException if fails to make API call
   */
  public DemJourneysListResponse searchJourneys() throws ApiException {
    return searchJourneysWithHttpInfo(new SearchJourneysOptionalParameters()).getData();
  }

  /**
   * Search DEM journeys.
   *
   * <p>See {@link #searchJourneysWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;DemJourneysListResponse&gt;
   */
  public CompletableFuture<DemJourneysListResponse> searchJourneysAsync() {
    return searchJourneysWithHttpInfoAsync(new SearchJourneysOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Search DEM journeys.
   *
   * <p>See {@link #searchJourneysWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return DemJourneysListResponse
   * @throws ApiException if fails to make API call
   */
  public DemJourneysListResponse searchJourneys(SearchJourneysOptionalParameters parameters)
      throws ApiException {
    return searchJourneysWithHttpInfo(parameters).getData();
  }

  /**
   * Search DEM journeys.
   *
   * <p>See {@link #searchJourneysWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;DemJourneysListResponse&gt;
   */
  public CompletableFuture<DemJourneysListResponse> searchJourneysAsync(
      SearchJourneysOptionalParameters parameters) {
    return searchJourneysWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Search for DEM journeys with optional filtering by query, creator, team, and app.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;DemJourneysListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<DemJourneysListResponse> searchJourneysWithHttpInfo(
      SearchJourneysOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    String query = parameters.query;
    Long pageOffset = parameters.pageOffset;
    Long pageLimit = parameters.pageLimit;
    String creator = parameters.creator;
    String team = parameters.team;
    String appId = parameters.appId;
    // create path and map variables
    String localVarPath = "/api/v2/dem/journeys/search";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "query", query));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[offset]", pageOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "creator", creator));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "team", team));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "app_id", appId));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.DemApi.searchJourneys",
            localVarPath,
            localVarQueryParams,
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
        new GenericType<DemJourneysListResponse>() {});
  }

  /**
   * Search DEM journeys.
   *
   * <p>See {@link #searchJourneysWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;DemJourneysListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<DemJourneysListResponse>> searchJourneysWithHttpInfoAsync(
      SearchJourneysOptionalParameters parameters) {
    Object localVarPostBody = null;
    String query = parameters.query;
    Long pageOffset = parameters.pageOffset;
    Long pageLimit = parameters.pageLimit;
    String creator = parameters.creator;
    String team = parameters.team;
    String appId = parameters.appId;
    // create path and map variables
    String localVarPath = "/api/v2/dem/journeys/search";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "query", query));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[offset]", pageOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "creator", creator));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "team", team));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "app_id", appId));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.DemApi.searchJourneys",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<DemJourneysListResponse>> result = new CompletableFuture<>();
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
        new GenericType<DemJourneysListResponse>() {});
  }

  /**
   * Update a DEM journey.
   *
   * <p>See {@link #updateJourneyWithHttpInfo}.
   *
   * @param journeyId The unique identifier of the DEM journey to update. (required)
   * @param body (required)
   * @return DemJourneyResponse
   * @throws ApiException if fails to make API call
   */
  public DemJourneyResponse updateJourney(String journeyId, DemJourneyCreateRequest body)
      throws ApiException {
    return updateJourneyWithHttpInfo(journeyId, body).getData();
  }

  /**
   * Update a DEM journey.
   *
   * <p>See {@link #updateJourneyWithHttpInfoAsync}.
   *
   * @param journeyId The unique identifier of the DEM journey to update. (required)
   * @param body (required)
   * @return CompletableFuture&lt;DemJourneyResponse&gt;
   */
  public CompletableFuture<DemJourneyResponse> updateJourneyAsync(
      String journeyId, DemJourneyCreateRequest body) {
    return updateJourneyWithHttpInfoAsync(journeyId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update an existing DEM journey by its ID.
   *
   * @param journeyId The unique identifier of the DEM journey to update. (required)
   * @param body (required)
   * @return ApiResponse&lt;DemJourneyResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<DemJourneyResponse> updateJourneyWithHttpInfo(
      String journeyId, DemJourneyCreateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'journeyId' is set
    if (journeyId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'journeyId' when calling updateJourney");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateJourney");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/dem/journeys/{journey_id}"
            .replaceAll("\\{" + "journey_id" + "\\}", apiClient.escapeString(journeyId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.DemApi.updateJourney",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "PUT",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<DemJourneyResponse>() {});
  }

  /**
   * Update a DEM journey.
   *
   * <p>See {@link #updateJourneyWithHttpInfo}.
   *
   * @param journeyId The unique identifier of the DEM journey to update. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;DemJourneyResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<DemJourneyResponse>> updateJourneyWithHttpInfoAsync(
      String journeyId, DemJourneyCreateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'journeyId' is set
    if (journeyId == null) {
      CompletableFuture<ApiResponse<DemJourneyResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'journeyId' when calling updateJourney"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<DemJourneyResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateJourney"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/dem/journeys/{journey_id}"
            .replaceAll("\\{" + "journey_id" + "\\}", apiClient.escapeString(journeyId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.DemApi.updateJourney",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<DemJourneyResponse>> result = new CompletableFuture<>();
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
        new GenericType<DemJourneyResponse>() {});
  }

  /**
   * Update a DEM journey variant.
   *
   * <p>See {@link #updateJourneyVariantWithHttpInfo}.
   *
   * @param variantId The unique identifier of the variant to update. (required)
   * @param body (required)
   * @return DemVariantResponse
   * @throws ApiException if fails to make API call
   */
  public DemVariantResponse updateJourneyVariant(String variantId, DemVariantRequest body)
      throws ApiException {
    return updateJourneyVariantWithHttpInfo(variantId, body).getData();
  }

  /**
   * Update a DEM journey variant.
   *
   * <p>See {@link #updateJourneyVariantWithHttpInfoAsync}.
   *
   * @param variantId The unique identifier of the variant to update. (required)
   * @param body (required)
   * @return CompletableFuture&lt;DemVariantResponse&gt;
   */
  public CompletableFuture<DemVariantResponse> updateJourneyVariantAsync(
      String variantId, DemVariantRequest body) {
    return updateJourneyVariantWithHttpInfoAsync(variantId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update an existing variant of a DEM journey.
   *
   * @param variantId The unique identifier of the variant to update. (required)
   * @param body (required)
   * @return ApiResponse&lt;DemVariantResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<DemVariantResponse> updateJourneyVariantWithHttpInfo(
      String variantId, DemVariantRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'variantId' is set
    if (variantId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'variantId' when calling updateJourneyVariant");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateJourneyVariant");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/dem/journeys/variants/{variant_id}"
            .replaceAll("\\{" + "variant_id" + "\\}", apiClient.escapeString(variantId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.DemApi.updateJourneyVariant",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "PUT",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<DemVariantResponse>() {});
  }

  /**
   * Update a DEM journey variant.
   *
   * <p>See {@link #updateJourneyVariantWithHttpInfo}.
   *
   * @param variantId The unique identifier of the variant to update. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;DemVariantResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<DemVariantResponse>> updateJourneyVariantWithHttpInfoAsync(
      String variantId, DemVariantRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'variantId' is set
    if (variantId == null) {
      CompletableFuture<ApiResponse<DemVariantResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'variantId' when calling updateJourneyVariant"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<DemVariantResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateJourneyVariant"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/dem/journeys/variants/{variant_id}"
            .replaceAll("\\{" + "variant_id" + "\\}", apiClient.escapeString(variantId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.DemApi.updateJourneyVariant",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<DemVariantResponse>> result = new CompletableFuture<>();
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
        new GenericType<DemVariantResponse>() {});
  }
}
