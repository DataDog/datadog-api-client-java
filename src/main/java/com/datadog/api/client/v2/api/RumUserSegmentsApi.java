package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.RumSegmentCreateRequest;
import com.datadog.api.client.v2.model.RumSegmentDeleteResponse;
import com.datadog.api.client.v2.model.RumSegmentListResponse;
import com.datadog.api.client.v2.model.RumSegmentResponse;
import com.datadog.api.client.v2.model.RumSegmentTemplateListResponse;
import com.datadog.api.client.v2.model.RumSegmentUpdateRequest;
import com.datadog.api.client.v2.model.RumStaticSegmentCreateRequest;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RumUserSegmentsApi {
  private ApiClient apiClient;

  public RumUserSegmentsApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public RumUserSegmentsApi(ApiClient apiClient) {
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
   * Create a RUM segment.
   *
   * <p>See {@link #createRumSegmentWithHttpInfo}.
   *
   * @param body (required)
   * @return RumSegmentResponse
   * @throws ApiException if fails to make API call
   */
  public RumSegmentResponse createRumSegment(RumSegmentCreateRequest body) throws ApiException {
    return createRumSegmentWithHttpInfo(body).getData();
  }

  /**
   * Create a RUM segment.
   *
   * <p>See {@link #createRumSegmentWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;RumSegmentResponse&gt;
   */
  public CompletableFuture<RumSegmentResponse> createRumSegmentAsync(RumSegmentCreateRequest body) {
    return createRumSegmentWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a new user segment for the current organization.
   *
   * @param body (required)
   * @return ApiResponse&lt;RumSegmentResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<RumSegmentResponse> createRumSegmentWithHttpInfo(RumSegmentCreateRequest body)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createRumSegment";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createRumSegment");
    }
    // create path and map variables
    String localVarPath = "/api/v2/rum/segment";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumUserSegmentsApi.createRumSegment",
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
        new GenericType<RumSegmentResponse>() {});
  }

  /**
   * Create a RUM segment.
   *
   * <p>See {@link #createRumSegmentWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;RumSegmentResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RumSegmentResponse>> createRumSegmentWithHttpInfoAsync(
      RumSegmentCreateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createRumSegment";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<RumSegmentResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<RumSegmentResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createRumSegment"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/rum/segment";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumUserSegmentsApi.createRumSegment",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RumSegmentResponse>> result = new CompletableFuture<>();
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
        new GenericType<RumSegmentResponse>() {});
  }

  /**
   * Create a static RUM segment.
   *
   * <p>See {@link #createRumStaticSegmentWithHttpInfo}.
   *
   * @param body (required)
   * @return RumSegmentResponse
   * @throws ApiException if fails to make API call
   */
  public RumSegmentResponse createRumStaticSegment(RumStaticSegmentCreateRequest body)
      throws ApiException {
    return createRumStaticSegmentWithHttpInfo(body).getData();
  }

  /**
   * Create a static RUM segment.
   *
   * <p>See {@link #createRumStaticSegmentWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;RumSegmentResponse&gt;
   */
  public CompletableFuture<RumSegmentResponse> createRumStaticSegmentAsync(
      RumStaticSegmentCreateRequest body) {
    return createRumStaticSegmentWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a new static user segment from a journey query. Static segments contain a fixed list of
   * users computed from the query at creation time.
   *
   * @param body (required)
   * @return ApiResponse&lt;RumSegmentResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<RumSegmentResponse> createRumStaticSegmentWithHttpInfo(
      RumStaticSegmentCreateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createRumStaticSegment";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createRumStaticSegment");
    }
    // create path and map variables
    String localVarPath = "/api/v2/rum/segment/static";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumUserSegmentsApi.createRumStaticSegment",
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
        new GenericType<RumSegmentResponse>() {});
  }

  /**
   * Create a static RUM segment.
   *
   * <p>See {@link #createRumStaticSegmentWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;RumSegmentResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RumSegmentResponse>> createRumStaticSegmentWithHttpInfoAsync(
      RumStaticSegmentCreateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createRumStaticSegment";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<RumSegmentResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<RumSegmentResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createRumStaticSegment"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/rum/segment/static";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumUserSegmentsApi.createRumStaticSegment",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RumSegmentResponse>> result = new CompletableFuture<>();
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
        new GenericType<RumSegmentResponse>() {});
  }

  /**
   * Delete a RUM segment.
   *
   * <p>See {@link #deleteRumSegmentWithHttpInfo}.
   *
   * @param segmentId The identifier of the segment. (required)
   * @return RumSegmentDeleteResponse
   * @throws ApiException if fails to make API call
   */
  public RumSegmentDeleteResponse deleteRumSegment(String segmentId) throws ApiException {
    return deleteRumSegmentWithHttpInfo(segmentId).getData();
  }

  /**
   * Delete a RUM segment.
   *
   * <p>See {@link #deleteRumSegmentWithHttpInfoAsync}.
   *
   * @param segmentId The identifier of the segment. (required)
   * @return CompletableFuture&lt;RumSegmentDeleteResponse&gt;
   */
  public CompletableFuture<RumSegmentDeleteResponse> deleteRumSegmentAsync(String segmentId) {
    return deleteRumSegmentWithHttpInfoAsync(segmentId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete a user segment by its identifier.
   *
   * @param segmentId The identifier of the segment. (required)
   * @return ApiResponse&lt;RumSegmentDeleteResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<RumSegmentDeleteResponse> deleteRumSegmentWithHttpInfo(String segmentId)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteRumSegment";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'segmentId' is set
    if (segmentId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'segmentId' when calling deleteRumSegment");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/segment/{segment_id}"
            .replaceAll("\\{" + "segment_id" + "\\}", apiClient.escapeString(segmentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumUserSegmentsApi.deleteRumSegment",
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
        new GenericType<RumSegmentDeleteResponse>() {});
  }

  /**
   * Delete a RUM segment.
   *
   * <p>See {@link #deleteRumSegmentWithHttpInfo}.
   *
   * @param segmentId The identifier of the segment. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;RumSegmentDeleteResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RumSegmentDeleteResponse>> deleteRumSegmentWithHttpInfoAsync(
      String segmentId) {
    // Check if unstable operation is enabled
    String operationId = "deleteRumSegment";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<RumSegmentDeleteResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'segmentId' is set
    if (segmentId == null) {
      CompletableFuture<ApiResponse<RumSegmentDeleteResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'segmentId' when calling deleteRumSegment"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/segment/{segment_id}"
            .replaceAll("\\{" + "segment_id" + "\\}", apiClient.escapeString(segmentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumUserSegmentsApi.deleteRumSegment",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RumSegmentDeleteResponse>> result = new CompletableFuture<>();
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
        new GenericType<RumSegmentDeleteResponse>() {});
  }

  /**
   * Get a RUM segment.
   *
   * <p>See {@link #getRumSegmentWithHttpInfo}.
   *
   * @param segmentId The identifier of the segment. (required)
   * @return RumSegmentResponse
   * @throws ApiException if fails to make API call
   */
  public RumSegmentResponse getRumSegment(String segmentId) throws ApiException {
    return getRumSegmentWithHttpInfo(segmentId).getData();
  }

  /**
   * Get a RUM segment.
   *
   * <p>See {@link #getRumSegmentWithHttpInfoAsync}.
   *
   * @param segmentId The identifier of the segment. (required)
   * @return CompletableFuture&lt;RumSegmentResponse&gt;
   */
  public CompletableFuture<RumSegmentResponse> getRumSegmentAsync(String segmentId) {
    return getRumSegmentWithHttpInfoAsync(segmentId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a specific user segment by its identifier.
   *
   * @param segmentId The identifier of the segment. (required)
   * @return ApiResponse&lt;RumSegmentResponse&gt;
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
  public ApiResponse<RumSegmentResponse> getRumSegmentWithHttpInfo(String segmentId)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getRumSegment";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'segmentId' is set
    if (segmentId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'segmentId' when calling getRumSegment");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/segment/{segment_id}"
            .replaceAll("\\{" + "segment_id" + "\\}", apiClient.escapeString(segmentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumUserSegmentsApi.getRumSegment",
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
        new GenericType<RumSegmentResponse>() {});
  }

  /**
   * Get a RUM segment.
   *
   * <p>See {@link #getRumSegmentWithHttpInfo}.
   *
   * @param segmentId The identifier of the segment. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;RumSegmentResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RumSegmentResponse>> getRumSegmentWithHttpInfoAsync(
      String segmentId) {
    // Check if unstable operation is enabled
    String operationId = "getRumSegment";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<RumSegmentResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'segmentId' is set
    if (segmentId == null) {
      CompletableFuture<ApiResponse<RumSegmentResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'segmentId' when calling getRumSegment"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/segment/{segment_id}"
            .replaceAll("\\{" + "segment_id" + "\\}", apiClient.escapeString(segmentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumUserSegmentsApi.getRumSegment",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RumSegmentResponse>> result = new CompletableFuture<>();
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
        new GenericType<RumSegmentResponse>() {});
  }

  /**
   * Initialize RUM segments.
   *
   * <p>See {@link #initializeRumSegmentsWithHttpInfo}.
   *
   * @throws ApiException if fails to make API call
   */
  public void initializeRumSegments() throws ApiException {
    initializeRumSegmentsWithHttpInfo();
  }

  /**
   * Initialize RUM segments.
   *
   * <p>See {@link #initializeRumSegmentsWithHttpInfoAsync}.
   *
   * @return CompletableFuture
   */
  public CompletableFuture<Void> initializeRumSegmentsAsync() {
    return initializeRumSegmentsWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Initialize default segments for the current organization. This creates a set of predefined
   * segments if they do not already exist.
   *
   * @return ApiResponse&lt;Void&gt;
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
  public ApiResponse<Void> initializeRumSegmentsWithHttpInfo() throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "initializeRumSegments";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/rum/segment/initialize";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumUserSegmentsApi.initializeRumSegments",
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
   * Initialize RUM segments.
   *
   * <p>See {@link #initializeRumSegmentsWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> initializeRumSegmentsWithHttpInfoAsync() {
    // Check if unstable operation is enabled
    String operationId = "initializeRumSegments";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/rum/segment/initialize";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumUserSegmentsApi.initializeRumSegments",
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

  /** Manage optional parameters to listRumSegments. */
  public static class ListRumSegmentsOptionalParameters {
    private String sort;
    private Integer limit;

    /**
     * Set sort.
     *
     * @param sort Sort order for the segments list. (optional)
     * @return ListRumSegmentsOptionalParameters
     */
    public ListRumSegmentsOptionalParameters sort(String sort) {
      this.sort = sort;
      return this;
    }

    /**
     * Set limit.
     *
     * @param limit Maximum number of segments to return. (optional)
     * @return ListRumSegmentsOptionalParameters
     */
    public ListRumSegmentsOptionalParameters limit(Integer limit) {
      this.limit = limit;
      return this;
    }
  }

  /**
   * List all RUM segments.
   *
   * <p>See {@link #listRumSegmentsWithHttpInfo}.
   *
   * @return RumSegmentListResponse
   * @throws ApiException if fails to make API call
   */
  public RumSegmentListResponse listRumSegments() throws ApiException {
    return listRumSegmentsWithHttpInfo(new ListRumSegmentsOptionalParameters()).getData();
  }

  /**
   * List all RUM segments.
   *
   * <p>See {@link #listRumSegmentsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;RumSegmentListResponse&gt;
   */
  public CompletableFuture<RumSegmentListResponse> listRumSegmentsAsync() {
    return listRumSegmentsWithHttpInfoAsync(new ListRumSegmentsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List all RUM segments.
   *
   * <p>See {@link #listRumSegmentsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return RumSegmentListResponse
   * @throws ApiException if fails to make API call
   */
  public RumSegmentListResponse listRumSegments(ListRumSegmentsOptionalParameters parameters)
      throws ApiException {
    return listRumSegmentsWithHttpInfo(parameters).getData();
  }

  /**
   * List all RUM segments.
   *
   * <p>See {@link #listRumSegmentsWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;RumSegmentListResponse&gt;
   */
  public CompletableFuture<RumSegmentListResponse> listRumSegmentsAsync(
      ListRumSegmentsOptionalParameters parameters) {
    return listRumSegmentsWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List all user segments for the current organization. Supports sorting and pagination.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;RumSegmentListResponse&gt;
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
  public ApiResponse<RumSegmentListResponse> listRumSegmentsWithHttpInfo(
      ListRumSegmentsOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listRumSegments";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    String sort = parameters.sort;
    Integer limit = parameters.limit;
    // create path and map variables
    String localVarPath = "/api/v2/rum/segment";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumUserSegmentsApi.listRumSegments",
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
        new GenericType<RumSegmentListResponse>() {});
  }

  /**
   * List all RUM segments.
   *
   * <p>See {@link #listRumSegmentsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;RumSegmentListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RumSegmentListResponse>> listRumSegmentsWithHttpInfoAsync(
      ListRumSegmentsOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listRumSegments";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<RumSegmentListResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    String sort = parameters.sort;
    Integer limit = parameters.limit;
    // create path and map variables
    String localVarPath = "/api/v2/rum/segment";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumUserSegmentsApi.listRumSegments",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RumSegmentListResponse>> result = new CompletableFuture<>();
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
        new GenericType<RumSegmentListResponse>() {});
  }

  /**
   * List RUM segment templates.
   *
   * <p>See {@link #listRumSegmentTemplatesWithHttpInfo}.
   *
   * @return RumSegmentTemplateListResponse
   * @throws ApiException if fails to make API call
   */
  public RumSegmentTemplateListResponse listRumSegmentTemplates() throws ApiException {
    return listRumSegmentTemplatesWithHttpInfo().getData();
  }

  /**
   * List RUM segment templates.
   *
   * <p>See {@link #listRumSegmentTemplatesWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;RumSegmentTemplateListResponse&gt;
   */
  public CompletableFuture<RumSegmentTemplateListResponse> listRumSegmentTemplatesAsync() {
    return listRumSegmentTemplatesWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List all available segment templates. Templates provide predefined segment configurations that
   * can be customized with parameters.
   *
   * @return ApiResponse&lt;RumSegmentTemplateListResponse&gt;
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
  public ApiResponse<RumSegmentTemplateListResponse> listRumSegmentTemplatesWithHttpInfo()
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listRumSegmentTemplates";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/rum/segment/templates";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumUserSegmentsApi.listRumSegmentTemplates",
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
        new GenericType<RumSegmentTemplateListResponse>() {});
  }

  /**
   * List RUM segment templates.
   *
   * <p>See {@link #listRumSegmentTemplatesWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;RumSegmentTemplateListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RumSegmentTemplateListResponse>>
      listRumSegmentTemplatesWithHttpInfoAsync() {
    // Check if unstable operation is enabled
    String operationId = "listRumSegmentTemplates";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<RumSegmentTemplateListResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/rum/segment/templates";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumUserSegmentsApi.listRumSegmentTemplates",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RumSegmentTemplateListResponse>> result =
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
        new GenericType<RumSegmentTemplateListResponse>() {});
  }

  /**
   * Update a RUM segment.
   *
   * <p>See {@link #updateRumSegmentWithHttpInfo}.
   *
   * @param segmentId The identifier of the segment. (required)
   * @param body (required)
   * @throws ApiException if fails to make API call
   */
  public void updateRumSegment(String segmentId, RumSegmentUpdateRequest body) throws ApiException {
    updateRumSegmentWithHttpInfo(segmentId, body);
  }

  /**
   * Update a RUM segment.
   *
   * <p>See {@link #updateRumSegmentWithHttpInfoAsync}.
   *
   * @param segmentId The identifier of the segment. (required)
   * @param body (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> updateRumSegmentAsync(
      String segmentId, RumSegmentUpdateRequest body) {
    return updateRumSegmentWithHttpInfoAsync(segmentId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update an existing user segment. All fields in the request body are optional.
   *
   * @param segmentId The identifier of the segment. (required)
   * @param body (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> updateRumSegmentWithHttpInfo(
      String segmentId, RumSegmentUpdateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateRumSegment";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'segmentId' is set
    if (segmentId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'segmentId' when calling updateRumSegment");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateRumSegment");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/segment/{segment_id}"
            .replaceAll("\\{" + "segment_id" + "\\}", apiClient.escapeString(segmentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumUserSegmentsApi.updateRumSegment",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
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
   * Update a RUM segment.
   *
   * <p>See {@link #updateRumSegmentWithHttpInfo}.
   *
   * @param segmentId The identifier of the segment. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> updateRumSegmentWithHttpInfoAsync(
      String segmentId, RumSegmentUpdateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "updateRumSegment";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'segmentId' is set
    if (segmentId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'segmentId' when calling updateRumSegment"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateRumSegment"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/segment/{segment_id}"
            .replaceAll("\\{" + "segment_id" + "\\}", apiClient.escapeString(segmentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumUserSegmentsApi.updateRumSegment",
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
        "PUT",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }
}
