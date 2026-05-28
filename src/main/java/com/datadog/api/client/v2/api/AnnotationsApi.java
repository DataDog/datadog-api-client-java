package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.AnnotationCreateRequest;
import com.datadog.api.client.v2.model.AnnotationResponse;
import com.datadog.api.client.v2.model.AnnotationUpdateRequest;
import com.datadog.api.client.v2.model.AnnotationsResponse;
import com.datadog.api.client.v2.model.PageAnnotationsResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AnnotationsApi {
  private ApiClient apiClient;

  public AnnotationsApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public AnnotationsApi(ApiClient apiClient) {
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
   * Create an annotation.
   *
   * <p>See {@link #createAnnotationWithHttpInfo}.
   *
   * @param body Annotation to create. (required)
   * @return AnnotationResponse
   * @throws ApiException if fails to make API call
   */
  public AnnotationResponse createAnnotation(AnnotationCreateRequest body) throws ApiException {
    return createAnnotationWithHttpInfo(body).getData();
  }

  /**
   * Create an annotation.
   *
   * <p>See {@link #createAnnotationWithHttpInfoAsync}.
   *
   * @param body Annotation to create. (required)
   * @return CompletableFuture&lt;AnnotationResponse&gt;
   */
  public CompletableFuture<AnnotationResponse> createAnnotationAsync(AnnotationCreateRequest body) {
    return createAnnotationWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Creates a new annotation on a dashboard or notebook page. Valid <code>color</code> values:
   * <code>gray</code>, <code>blue</code>, <code>purple</code>, <code>green</code>, <code>yellow
   * </code>, <code>red</code>. Valid <code>type</code> values: <code>pointInTime</code> (marks a
   * single moment) or <code>timeRegion</code> (spans a range and requires <code>end_time</code>).
   *
   * @param body Annotation to create. (required)
   * @return ApiResponse&lt;AnnotationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AnnotationResponse> createAnnotationWithHttpInfo(AnnotationCreateRequest body)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createAnnotation";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createAnnotation");
    }
    // create path and map variables
    String localVarPath = "/api/v2/annotation";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AnnotationsApi.createAnnotation",
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
        new GenericType<AnnotationResponse>() {});
  }

  /**
   * Create an annotation.
   *
   * <p>See {@link #createAnnotationWithHttpInfo}.
   *
   * @param body Annotation to create. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AnnotationResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AnnotationResponse>> createAnnotationWithHttpInfoAsync(
      AnnotationCreateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createAnnotation";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<AnnotationResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<AnnotationResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createAnnotation"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/annotation";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AnnotationsApi.createAnnotation",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AnnotationResponse>> result = new CompletableFuture<>();
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
        new GenericType<AnnotationResponse>() {});
  }

  /**
   * Delete an annotation.
   *
   * <p>See {@link #deleteAnnotationWithHttpInfo}.
   *
   * @param annotationId The ID of the annotation. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteAnnotation(UUID annotationId) throws ApiException {
    deleteAnnotationWithHttpInfo(annotationId);
  }

  /**
   * Delete an annotation.
   *
   * <p>See {@link #deleteAnnotationWithHttpInfoAsync}.
   *
   * @param annotationId The ID of the annotation. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteAnnotationAsync(UUID annotationId) {
    return deleteAnnotationWithHttpInfoAsync(annotationId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Deletes an existing annotation by ID. Returns <code>204 No Content</code> if the annotation
   * does not exist (idempotent).
   *
   * @param annotationId The ID of the annotation. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteAnnotationWithHttpInfo(UUID annotationId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteAnnotation";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'annotationId' is set
    if (annotationId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'annotationId' when calling deleteAnnotation");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/annotation/{annotation_id}"
            .replaceAll(
                "\\{" + "annotation_id" + "\\}", apiClient.escapeString(annotationId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AnnotationsApi.deleteAnnotation",
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
   * Delete an annotation.
   *
   * <p>See {@link #deleteAnnotationWithHttpInfo}.
   *
   * @param annotationId The ID of the annotation. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteAnnotationWithHttpInfoAsync(UUID annotationId) {
    // Check if unstable operation is enabled
    String operationId = "deleteAnnotation";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'annotationId' is set
    if (annotationId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'annotationId' when calling deleteAnnotation"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/annotation/{annotation_id}"
            .replaceAll(
                "\\{" + "annotation_id" + "\\}", apiClient.escapeString(annotationId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AnnotationsApi.deleteAnnotation",
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
   * Get annotations for a page.
   *
   * <p>See {@link #getPageAnnotationsWithHttpInfo}.
   *
   * @param pageId The ID of the page, prefixed with the page type and joined by a colon (for
   *     example, <code>dashboard:abc-def-xyz</code> or <code>notebook:1234567890</code>).
   *     (required)
   * @param startTime Start of the time window in milliseconds since the Unix epoch. (required)
   * @param endTime End of the time window in milliseconds since the Unix epoch. (required)
   * @return PageAnnotationsResponse
   * @throws ApiException if fails to make API call
   */
  public PageAnnotationsResponse getPageAnnotations(String pageId, Long startTime, Long endTime)
      throws ApiException {
    return getPageAnnotationsWithHttpInfo(pageId, startTime, endTime).getData();
  }

  /**
   * Get annotations for a page.
   *
   * <p>See {@link #getPageAnnotationsWithHttpInfoAsync}.
   *
   * @param pageId The ID of the page, prefixed with the page type and joined by a colon (for
   *     example, <code>dashboard:abc-def-xyz</code> or <code>notebook:1234567890</code>).
   *     (required)
   * @param startTime Start of the time window in milliseconds since the Unix epoch. (required)
   * @param endTime End of the time window in milliseconds since the Unix epoch. (required)
   * @return CompletableFuture&lt;PageAnnotationsResponse&gt;
   */
  public CompletableFuture<PageAnnotationsResponse> getPageAnnotationsAsync(
      String pageId, Long startTime, Long endTime) {
    return getPageAnnotationsWithHttpInfoAsync(pageId, startTime, endTime)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Returns all annotations on a specific page for a given time window, grouped by widget. Unlike
   * <code>ListAnnotations</code>, this endpoint returns a single structured object with annotations
   * indexed by their ID and a widget-to-annotation mapping for easy UI rendering.
   *
   * @param pageId The ID of the page, prefixed with the page type and joined by a colon (for
   *     example, <code>dashboard:abc-def-xyz</code> or <code>notebook:1234567890</code>).
   *     (required)
   * @param startTime Start of the time window in milliseconds since the Unix epoch. (required)
   * @param endTime End of the time window in milliseconds since the Unix epoch. (required)
   * @return ApiResponse&lt;PageAnnotationsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<PageAnnotationsResponse> getPageAnnotationsWithHttpInfo(
      String pageId, Long startTime, Long endTime) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getPageAnnotations";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'pageId' is set
    if (pageId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'pageId' when calling getPageAnnotations");
    }

    // verify the required parameter 'startTime' is set
    if (startTime == null) {
      throw new ApiException(
          400, "Missing the required parameter 'startTime' when calling getPageAnnotations");
    }

    // verify the required parameter 'endTime' is set
    if (endTime == null) {
      throw new ApiException(
          400, "Missing the required parameter 'endTime' when calling getPageAnnotations");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/annotation/page/{page_id}"
            .replaceAll("\\{" + "page_id" + "\\}", apiClient.escapeString(pageId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_time", startTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_time", endTime));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AnnotationsApi.getPageAnnotations",
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
        new GenericType<PageAnnotationsResponse>() {});
  }

  /**
   * Get annotations for a page.
   *
   * <p>See {@link #getPageAnnotationsWithHttpInfo}.
   *
   * @param pageId The ID of the page, prefixed with the page type and joined by a colon (for
   *     example, <code>dashboard:abc-def-xyz</code> or <code>notebook:1234567890</code>).
   *     (required)
   * @param startTime Start of the time window in milliseconds since the Unix epoch. (required)
   * @param endTime End of the time window in milliseconds since the Unix epoch. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;PageAnnotationsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<PageAnnotationsResponse>>
      getPageAnnotationsWithHttpInfoAsync(String pageId, Long startTime, Long endTime) {
    // Check if unstable operation is enabled
    String operationId = "getPageAnnotations";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<PageAnnotationsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'pageId' is set
    if (pageId == null) {
      CompletableFuture<ApiResponse<PageAnnotationsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'pageId' when calling getPageAnnotations"));
      return result;
    }

    // verify the required parameter 'startTime' is set
    if (startTime == null) {
      CompletableFuture<ApiResponse<PageAnnotationsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'startTime' when calling getPageAnnotations"));
      return result;
    }

    // verify the required parameter 'endTime' is set
    if (endTime == null) {
      CompletableFuture<ApiResponse<PageAnnotationsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'endTime' when calling getPageAnnotations"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/annotation/page/{page_id}"
            .replaceAll("\\{" + "page_id" + "\\}", apiClient.escapeString(pageId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_time", startTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_time", endTime));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AnnotationsApi.getPageAnnotations",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<PageAnnotationsResponse>> result = new CompletableFuture<>();
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
        new GenericType<PageAnnotationsResponse>() {});
  }

  /** Manage optional parameters to listAnnotations. */
  public static class ListAnnotationsOptionalParameters {
    private String widgetId;

    /**
     * Set widgetId.
     *
     * @param widgetId Optional widget ID to restrict results to annotations on a specific widget.
     *     (optional)
     * @return ListAnnotationsOptionalParameters
     */
    public ListAnnotationsOptionalParameters widgetId(String widgetId) {
      this.widgetId = widgetId;
      return this;
    }
  }

  /**
   * List annotations.
   *
   * <p>See {@link #listAnnotationsWithHttpInfo}.
   *
   * @param pageId ID of the page to list annotations for, prefixed with the page type and joined by
   *     a colon (for example, <code>dashboard:abc-def-xyz</code> or <code>notebook:1234567890
   *     </code>). (required)
   * @param startTime Start of the time window in milliseconds since the Unix epoch. (required)
   * @param endTime End of the time window in milliseconds since the Unix epoch. (required)
   * @return AnnotationsResponse
   * @throws ApiException if fails to make API call
   */
  public AnnotationsResponse listAnnotations(String pageId, Long startTime, Long endTime)
      throws ApiException {
    return listAnnotationsWithHttpInfo(
            pageId, startTime, endTime, new ListAnnotationsOptionalParameters())
        .getData();
  }

  /**
   * List annotations.
   *
   * <p>See {@link #listAnnotationsWithHttpInfoAsync}.
   *
   * @param pageId ID of the page to list annotations for, prefixed with the page type and joined by
   *     a colon (for example, <code>dashboard:abc-def-xyz</code> or <code>notebook:1234567890
   *     </code>). (required)
   * @param startTime Start of the time window in milliseconds since the Unix epoch. (required)
   * @param endTime End of the time window in milliseconds since the Unix epoch. (required)
   * @return CompletableFuture&lt;AnnotationsResponse&gt;
   */
  public CompletableFuture<AnnotationsResponse> listAnnotationsAsync(
      String pageId, Long startTime, Long endTime) {
    return listAnnotationsWithHttpInfoAsync(
            pageId, startTime, endTime, new ListAnnotationsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List annotations.
   *
   * <p>See {@link #listAnnotationsWithHttpInfo}.
   *
   * @param pageId ID of the page to list annotations for, prefixed with the page type and joined by
   *     a colon (for example, <code>dashboard:abc-def-xyz</code> or <code>notebook:1234567890
   *     </code>). (required)
   * @param startTime Start of the time window in milliseconds since the Unix epoch. (required)
   * @param endTime End of the time window in milliseconds since the Unix epoch. (required)
   * @param parameters Optional parameters for the request.
   * @return AnnotationsResponse
   * @throws ApiException if fails to make API call
   */
  public AnnotationsResponse listAnnotations(
      String pageId, Long startTime, Long endTime, ListAnnotationsOptionalParameters parameters)
      throws ApiException {
    return listAnnotationsWithHttpInfo(pageId, startTime, endTime, parameters).getData();
  }

  /**
   * List annotations.
   *
   * <p>See {@link #listAnnotationsWithHttpInfoAsync}.
   *
   * @param pageId ID of the page to list annotations for, prefixed with the page type and joined by
   *     a colon (for example, <code>dashboard:abc-def-xyz</code> or <code>notebook:1234567890
   *     </code>). (required)
   * @param startTime Start of the time window in milliseconds since the Unix epoch. (required)
   * @param endTime End of the time window in milliseconds since the Unix epoch. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;AnnotationsResponse&gt;
   */
  public CompletableFuture<AnnotationsResponse> listAnnotationsAsync(
      String pageId, Long startTime, Long endTime, ListAnnotationsOptionalParameters parameters) {
    return listAnnotationsWithHttpInfoAsync(pageId, startTime, endTime, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Returns a flat list of annotations matching the given page, time window, and optional widget
   * filter.
   *
   * @param pageId ID of the page to list annotations for, prefixed with the page type and joined by
   *     a colon (for example, <code>dashboard:abc-def-xyz</code> or <code>notebook:1234567890
   *     </code>). (required)
   * @param startTime Start of the time window in milliseconds since the Unix epoch. (required)
   * @param endTime End of the time window in milliseconds since the Unix epoch. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;AnnotationsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AnnotationsResponse> listAnnotationsWithHttpInfo(
      String pageId, Long startTime, Long endTime, ListAnnotationsOptionalParameters parameters)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listAnnotations";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'pageId' is set
    if (pageId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'pageId' when calling listAnnotations");
    }

    // verify the required parameter 'startTime' is set
    if (startTime == null) {
      throw new ApiException(
          400, "Missing the required parameter 'startTime' when calling listAnnotations");
    }

    // verify the required parameter 'endTime' is set
    if (endTime == null) {
      throw new ApiException(
          400, "Missing the required parameter 'endTime' when calling listAnnotations");
    }
    String widgetId = parameters.widgetId;
    // create path and map variables
    String localVarPath = "/api/v2/annotation";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page_id", pageId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_time", startTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_time", endTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "widget_id", widgetId));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AnnotationsApi.listAnnotations",
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
        new GenericType<AnnotationsResponse>() {});
  }

  /**
   * List annotations.
   *
   * <p>See {@link #listAnnotationsWithHttpInfo}.
   *
   * @param pageId ID of the page to list annotations for, prefixed with the page type and joined by
   *     a colon (for example, <code>dashboard:abc-def-xyz</code> or <code>notebook:1234567890
   *     </code>). (required)
   * @param startTime Start of the time window in milliseconds since the Unix epoch. (required)
   * @param endTime End of the time window in milliseconds since the Unix epoch. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;AnnotationsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AnnotationsResponse>> listAnnotationsWithHttpInfoAsync(
      String pageId, Long startTime, Long endTime, ListAnnotationsOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listAnnotations";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<AnnotationsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'pageId' is set
    if (pageId == null) {
      CompletableFuture<ApiResponse<AnnotationsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'pageId' when calling listAnnotations"));
      return result;
    }

    // verify the required parameter 'startTime' is set
    if (startTime == null) {
      CompletableFuture<ApiResponse<AnnotationsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'startTime' when calling listAnnotations"));
      return result;
    }

    // verify the required parameter 'endTime' is set
    if (endTime == null) {
      CompletableFuture<ApiResponse<AnnotationsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'endTime' when calling listAnnotations"));
      return result;
    }
    String widgetId = parameters.widgetId;
    // create path and map variables
    String localVarPath = "/api/v2/annotation";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page_id", pageId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_time", startTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_time", endTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "widget_id", widgetId));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AnnotationsApi.listAnnotations",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AnnotationsResponse>> result = new CompletableFuture<>();
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
        new GenericType<AnnotationsResponse>() {});
  }

  /**
   * Update an annotation.
   *
   * <p>See {@link #updateAnnotationWithHttpInfo}.
   *
   * @param annotationId The ID of the annotation. (required)
   * @param body Updated annotation payload. (required)
   * @return AnnotationResponse
   * @throws ApiException if fails to make API call
   */
  public AnnotationResponse updateAnnotation(UUID annotationId, AnnotationUpdateRequest body)
      throws ApiException {
    return updateAnnotationWithHttpInfo(annotationId, body).getData();
  }

  /**
   * Update an annotation.
   *
   * <p>See {@link #updateAnnotationWithHttpInfoAsync}.
   *
   * @param annotationId The ID of the annotation. (required)
   * @param body Updated annotation payload. (required)
   * @return CompletableFuture&lt;AnnotationResponse&gt;
   */
  public CompletableFuture<AnnotationResponse> updateAnnotationAsync(
      UUID annotationId, AnnotationUpdateRequest body) {
    return updateAnnotationWithHttpInfoAsync(annotationId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Updates an existing annotation. Valid <code>color</code> values: <code>gray</code>, <code>blue
   * </code>, <code>purple</code>, <code>green</code>, <code>yellow</code>, <code>red</code>. Valid
   * <code>type</code> values: <code>pointInTime</code> (marks a single moment) or <code>timeRegion
   * </code> (spans a range and requires <code>end_time</code>).
   *
   * @param annotationId The ID of the annotation. (required)
   * @param body Updated annotation payload. (required)
   * @return ApiResponse&lt;AnnotationResponse&gt;
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
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AnnotationResponse> updateAnnotationWithHttpInfo(
      UUID annotationId, AnnotationUpdateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateAnnotation";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'annotationId' is set
    if (annotationId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'annotationId' when calling updateAnnotation");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateAnnotation");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/annotation/{annotation_id}"
            .replaceAll(
                "\\{" + "annotation_id" + "\\}", apiClient.escapeString(annotationId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AnnotationsApi.updateAnnotation",
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
        new GenericType<AnnotationResponse>() {});
  }

  /**
   * Update an annotation.
   *
   * <p>See {@link #updateAnnotationWithHttpInfo}.
   *
   * @param annotationId The ID of the annotation. (required)
   * @param body Updated annotation payload. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AnnotationResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AnnotationResponse>> updateAnnotationWithHttpInfoAsync(
      UUID annotationId, AnnotationUpdateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "updateAnnotation";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<AnnotationResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'annotationId' is set
    if (annotationId == null) {
      CompletableFuture<ApiResponse<AnnotationResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'annotationId' when calling updateAnnotation"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<AnnotationResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateAnnotation"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/annotation/{annotation_id}"
            .replaceAll(
                "\\{" + "annotation_id" + "\\}", apiClient.escapeString(annotationId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AnnotationsApi.updateAnnotation",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AnnotationResponse>> result = new CompletableFuture<>();
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
        new GenericType<AnnotationResponse>() {});
  }
}
