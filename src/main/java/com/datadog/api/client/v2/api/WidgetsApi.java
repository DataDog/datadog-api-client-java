package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.CreateOrUpdateWidgetRequestJSONAPIRequestDocument;
import com.datadog.api.client.v2.model.WidgetExperienceType;
import com.datadog.api.client.v2.model.WidgetSchemaJSONAPIDocument;
import com.datadog.api.client.v2.model.WidgetSchemaJSONAPIListDocument;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class WidgetsApi {
  private ApiClient apiClient;

  public WidgetsApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public WidgetsApi(ApiClient apiClient) {
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
   * Create a widget.
   *
   * <p>See {@link #createWidgetApiV2WidgetsExperienceTypePostWithHttpInfo}.
   *
   * @param experienceType The experience type for the widget. (required)
   * @param body (required)
   * @return WidgetSchemaJSONAPIDocument
   * @throws ApiException if fails to make API call
   */
  public WidgetSchemaJSONAPIDocument createWidgetApiV2WidgetsExperienceTypePost(
      WidgetExperienceType experienceType, CreateOrUpdateWidgetRequestJSONAPIRequestDocument body)
      throws ApiException {
    return createWidgetApiV2WidgetsExperienceTypePostWithHttpInfo(experienceType, body).getData();
  }

  /**
   * Create a widget.
   *
   * <p>See {@link #createWidgetApiV2WidgetsExperienceTypePostWithHttpInfoAsync}.
   *
   * @param experienceType The experience type for the widget. (required)
   * @param body (required)
   * @return CompletableFuture&lt;WidgetSchemaJSONAPIDocument&gt;
   */
  public CompletableFuture<WidgetSchemaJSONAPIDocument>
      createWidgetApiV2WidgetsExperienceTypePostAsync(
          WidgetExperienceType experienceType,
          CreateOrUpdateWidgetRequestJSONAPIRequestDocument body) {
    return createWidgetApiV2WidgetsExperienceTypePostWithHttpInfoAsync(experienceType, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a new widget for a given experience type.
   *
   * @param experienceType The experience type for the widget. (required)
   * @param body (required)
   * @return ApiResponse&lt;WidgetSchemaJSONAPIDocument&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<WidgetSchemaJSONAPIDocument>
      createWidgetApiV2WidgetsExperienceTypePostWithHttpInfo(
          WidgetExperienceType experienceType,
          CreateOrUpdateWidgetRequestJSONAPIRequestDocument body)
          throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'experienceType' is set
    if (experienceType == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'experienceType' when calling"
              + " createWidgetApiV2WidgetsExperienceTypePost");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'body' when calling"
              + " createWidgetApiV2WidgetsExperienceTypePost");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/widgets/{experience_type}"
            .replaceAll(
                "\\{" + "experience_type" + "\\}",
                apiClient.escapeString(experienceType.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.WidgetsApi.createWidgetApiV2WidgetsExperienceTypePost",
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
        new GenericType<WidgetSchemaJSONAPIDocument>() {});
  }

  /**
   * Create a widget.
   *
   * <p>See {@link #createWidgetApiV2WidgetsExperienceTypePostWithHttpInfo}.
   *
   * @param experienceType The experience type for the widget. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;WidgetSchemaJSONAPIDocument&gt;&gt;
   */
  public CompletableFuture<ApiResponse<WidgetSchemaJSONAPIDocument>>
      createWidgetApiV2WidgetsExperienceTypePostWithHttpInfoAsync(
          WidgetExperienceType experienceType,
          CreateOrUpdateWidgetRequestJSONAPIRequestDocument body) {
    Object localVarPostBody = body;

    // verify the required parameter 'experienceType' is set
    if (experienceType == null) {
      CompletableFuture<ApiResponse<WidgetSchemaJSONAPIDocument>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'experienceType' when calling"
                  + " createWidgetApiV2WidgetsExperienceTypePost"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<WidgetSchemaJSONAPIDocument>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " createWidgetApiV2WidgetsExperienceTypePost"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/widgets/{experience_type}"
            .replaceAll(
                "\\{" + "experience_type" + "\\}",
                apiClient.escapeString(experienceType.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.WidgetsApi.createWidgetApiV2WidgetsExperienceTypePost",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<WidgetSchemaJSONAPIDocument>> result =
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
        new GenericType<WidgetSchemaJSONAPIDocument>() {});
  }

  /**
   * Delete a widget.
   *
   * <p>See {@link #deleteWidgetApiV2WidgetsExperienceTypeUuidDeleteWithHttpInfo}.
   *
   * @param uuid The UUID of the widget. (required)
   * @param experienceType The experience type for the widget. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteWidgetApiV2WidgetsExperienceTypeUuidDelete(
      UUID uuid, WidgetExperienceType experienceType) throws ApiException {
    deleteWidgetApiV2WidgetsExperienceTypeUuidDeleteWithHttpInfo(uuid, experienceType);
  }

  /**
   * Delete a widget.
   *
   * <p>See {@link #deleteWidgetApiV2WidgetsExperienceTypeUuidDeleteWithHttpInfoAsync}.
   *
   * @param uuid The UUID of the widget. (required)
   * @param experienceType The experience type for the widget. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteWidgetApiV2WidgetsExperienceTypeUuidDeleteAsync(
      UUID uuid, WidgetExperienceType experienceType) {
    return deleteWidgetApiV2WidgetsExperienceTypeUuidDeleteWithHttpInfoAsync(uuid, experienceType)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Soft-delete a widget by its UUID for a given experience type.
   *
   * @param uuid The UUID of the widget. (required)
   * @param experienceType The experience type for the widget. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> Successful Response </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteWidgetApiV2WidgetsExperienceTypeUuidDeleteWithHttpInfo(
      UUID uuid, WidgetExperienceType experienceType) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'uuid' is set
    if (uuid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'uuid' when calling"
              + " deleteWidgetApiV2WidgetsExperienceTypeUuidDelete");
    }

    // verify the required parameter 'experienceType' is set
    if (experienceType == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'experienceType' when calling"
              + " deleteWidgetApiV2WidgetsExperienceTypeUuidDelete");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/widgets/{experience_type}/{uuid}"
            .replaceAll("\\{" + "uuid" + "\\}", apiClient.escapeString(uuid.toString()))
            .replaceAll(
                "\\{" + "experience_type" + "\\}",
                apiClient.escapeString(experienceType.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.WidgetsApi.deleteWidgetApiV2WidgetsExperienceTypeUuidDelete",
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
   * Delete a widget.
   *
   * <p>See {@link #deleteWidgetApiV2WidgetsExperienceTypeUuidDeleteWithHttpInfo}.
   *
   * @param uuid The UUID of the widget. (required)
   * @param experienceType The experience type for the widget. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>>
      deleteWidgetApiV2WidgetsExperienceTypeUuidDeleteWithHttpInfoAsync(
          UUID uuid, WidgetExperienceType experienceType) {
    Object localVarPostBody = null;

    // verify the required parameter 'uuid' is set
    if (uuid == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'uuid' when calling"
                  + " deleteWidgetApiV2WidgetsExperienceTypeUuidDelete"));
      return result;
    }

    // verify the required parameter 'experienceType' is set
    if (experienceType == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'experienceType' when calling"
                  + " deleteWidgetApiV2WidgetsExperienceTypeUuidDelete"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/widgets/{experience_type}/{uuid}"
            .replaceAll("\\{" + "uuid" + "\\}", apiClient.escapeString(uuid.toString()))
            .replaceAll(
                "\\{" + "experience_type" + "\\}",
                apiClient.escapeString(experienceType.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.WidgetsApi.deleteWidgetApiV2WidgetsExperienceTypeUuidDelete",
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
   * Get a widget.
   *
   * <p>See {@link #getWidgetApiV2WidgetsExperienceTypeUuidGetWithHttpInfo}.
   *
   * @param uuid The UUID of the widget. (required)
   * @param experienceType The experience type for the widget. (required)
   * @return WidgetSchemaJSONAPIDocument
   * @throws ApiException if fails to make API call
   */
  public WidgetSchemaJSONAPIDocument getWidgetApiV2WidgetsExperienceTypeUuidGet(
      UUID uuid, WidgetExperienceType experienceType) throws ApiException {
    return getWidgetApiV2WidgetsExperienceTypeUuidGetWithHttpInfo(uuid, experienceType).getData();
  }

  /**
   * Get a widget.
   *
   * <p>See {@link #getWidgetApiV2WidgetsExperienceTypeUuidGetWithHttpInfoAsync}.
   *
   * @param uuid The UUID of the widget. (required)
   * @param experienceType The experience type for the widget. (required)
   * @return CompletableFuture&lt;WidgetSchemaJSONAPIDocument&gt;
   */
  public CompletableFuture<WidgetSchemaJSONAPIDocument>
      getWidgetApiV2WidgetsExperienceTypeUuidGetAsync(
          UUID uuid, WidgetExperienceType experienceType) {
    return getWidgetApiV2WidgetsExperienceTypeUuidGetWithHttpInfoAsync(uuid, experienceType)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Retrieve a widget by its UUID for a given experience type.
   *
   * @param uuid The UUID of the widget. (required)
   * @param experienceType The experience type for the widget. (required)
   * @return ApiResponse&lt;WidgetSchemaJSONAPIDocument&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<WidgetSchemaJSONAPIDocument>
      getWidgetApiV2WidgetsExperienceTypeUuidGetWithHttpInfo(
          UUID uuid, WidgetExperienceType experienceType) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'uuid' is set
    if (uuid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'uuid' when calling"
              + " getWidgetApiV2WidgetsExperienceTypeUuidGet");
    }

    // verify the required parameter 'experienceType' is set
    if (experienceType == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'experienceType' when calling"
              + " getWidgetApiV2WidgetsExperienceTypeUuidGet");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/widgets/{experience_type}/{uuid}"
            .replaceAll("\\{" + "uuid" + "\\}", apiClient.escapeString(uuid.toString()))
            .replaceAll(
                "\\{" + "experience_type" + "\\}",
                apiClient.escapeString(experienceType.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.WidgetsApi.getWidgetApiV2WidgetsExperienceTypeUuidGet",
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
        new GenericType<WidgetSchemaJSONAPIDocument>() {});
  }

  /**
   * Get a widget.
   *
   * <p>See {@link #getWidgetApiV2WidgetsExperienceTypeUuidGetWithHttpInfo}.
   *
   * @param uuid The UUID of the widget. (required)
   * @param experienceType The experience type for the widget. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;WidgetSchemaJSONAPIDocument&gt;&gt;
   */
  public CompletableFuture<ApiResponse<WidgetSchemaJSONAPIDocument>>
      getWidgetApiV2WidgetsExperienceTypeUuidGetWithHttpInfoAsync(
          UUID uuid, WidgetExperienceType experienceType) {
    Object localVarPostBody = null;

    // verify the required parameter 'uuid' is set
    if (uuid == null) {
      CompletableFuture<ApiResponse<WidgetSchemaJSONAPIDocument>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'uuid' when calling"
                  + " getWidgetApiV2WidgetsExperienceTypeUuidGet"));
      return result;
    }

    // verify the required parameter 'experienceType' is set
    if (experienceType == null) {
      CompletableFuture<ApiResponse<WidgetSchemaJSONAPIDocument>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'experienceType' when calling"
                  + " getWidgetApiV2WidgetsExperienceTypeUuidGet"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/widgets/{experience_type}/{uuid}"
            .replaceAll("\\{" + "uuid" + "\\}", apiClient.escapeString(uuid.toString()))
            .replaceAll(
                "\\{" + "experience_type" + "\\}",
                apiClient.escapeString(experienceType.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.WidgetsApi.getWidgetApiV2WidgetsExperienceTypeUuidGet",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<WidgetSchemaJSONAPIDocument>> result =
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
        new GenericType<WidgetSchemaJSONAPIDocument>() {});
  }

  /**
   * Search widgets.
   *
   * <p>See {@link #searchWidgetsApiV2WidgetsExperienceTypeGetWithHttpInfo}.
   *
   * @param experienceType The experience type for the widget. (required)
   * @return WidgetSchemaJSONAPIListDocument
   * @throws ApiException if fails to make API call
   */
  public WidgetSchemaJSONAPIListDocument searchWidgetsApiV2WidgetsExperienceTypeGet(
      WidgetExperienceType experienceType) throws ApiException {
    return searchWidgetsApiV2WidgetsExperienceTypeGetWithHttpInfo(experienceType).getData();
  }

  /**
   * Search widgets.
   *
   * <p>See {@link #searchWidgetsApiV2WidgetsExperienceTypeGetWithHttpInfoAsync}.
   *
   * @param experienceType The experience type for the widget. (required)
   * @return CompletableFuture&lt;WidgetSchemaJSONAPIListDocument&gt;
   */
  public CompletableFuture<WidgetSchemaJSONAPIListDocument>
      searchWidgetsApiV2WidgetsExperienceTypeGetAsync(WidgetExperienceType experienceType) {
    return searchWidgetsApiV2WidgetsExperienceTypeGetWithHttpInfoAsync(experienceType)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Search and list widgets for a given experience type. Supports filtering by widget type,
   * creator, title, and tags, as well as sorting and pagination.
   *
   * @param experienceType The experience type for the widget. (required)
   * @return ApiResponse&lt;WidgetSchemaJSONAPIListDocument&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<WidgetSchemaJSONAPIListDocument>
      searchWidgetsApiV2WidgetsExperienceTypeGetWithHttpInfo(WidgetExperienceType experienceType)
          throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'experienceType' is set
    if (experienceType == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'experienceType' when calling"
              + " searchWidgetsApiV2WidgetsExperienceTypeGet");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/widgets/{experience_type}"
            .replaceAll(
                "\\{" + "experience_type" + "\\}",
                apiClient.escapeString(experienceType.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.WidgetsApi.searchWidgetsApiV2WidgetsExperienceTypeGet",
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
        new GenericType<WidgetSchemaJSONAPIListDocument>() {});
  }

  /**
   * Search widgets.
   *
   * <p>See {@link #searchWidgetsApiV2WidgetsExperienceTypeGetWithHttpInfo}.
   *
   * @param experienceType The experience type for the widget. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;WidgetSchemaJSONAPIListDocument&gt;&gt;
   */
  public CompletableFuture<ApiResponse<WidgetSchemaJSONAPIListDocument>>
      searchWidgetsApiV2WidgetsExperienceTypeGetWithHttpInfoAsync(
          WidgetExperienceType experienceType) {
    Object localVarPostBody = null;

    // verify the required parameter 'experienceType' is set
    if (experienceType == null) {
      CompletableFuture<ApiResponse<WidgetSchemaJSONAPIListDocument>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'experienceType' when calling"
                  + " searchWidgetsApiV2WidgetsExperienceTypeGet"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/widgets/{experience_type}"
            .replaceAll(
                "\\{" + "experience_type" + "\\}",
                apiClient.escapeString(experienceType.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.WidgetsApi.searchWidgetsApiV2WidgetsExperienceTypeGet",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<WidgetSchemaJSONAPIListDocument>> result =
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
        new GenericType<WidgetSchemaJSONAPIListDocument>() {});
  }

  /**
   * Update a widget.
   *
   * <p>See {@link #updateWidgetApiV2WidgetsExperienceTypeUuidPutWithHttpInfo}.
   *
   * @param uuid The UUID of the widget. (required)
   * @param experienceType The experience type for the widget. (required)
   * @param body (required)
   * @return WidgetSchemaJSONAPIDocument
   * @throws ApiException if fails to make API call
   */
  public WidgetSchemaJSONAPIDocument updateWidgetApiV2WidgetsExperienceTypeUuidPut(
      UUID uuid,
      WidgetExperienceType experienceType,
      CreateOrUpdateWidgetRequestJSONAPIRequestDocument body)
      throws ApiException {
    return updateWidgetApiV2WidgetsExperienceTypeUuidPutWithHttpInfo(uuid, experienceType, body)
        .getData();
  }

  /**
   * Update a widget.
   *
   * <p>See {@link #updateWidgetApiV2WidgetsExperienceTypeUuidPutWithHttpInfoAsync}.
   *
   * @param uuid The UUID of the widget. (required)
   * @param experienceType The experience type for the widget. (required)
   * @param body (required)
   * @return CompletableFuture&lt;WidgetSchemaJSONAPIDocument&gt;
   */
  public CompletableFuture<WidgetSchemaJSONAPIDocument>
      updateWidgetApiV2WidgetsExperienceTypeUuidPutAsync(
          UUID uuid,
          WidgetExperienceType experienceType,
          CreateOrUpdateWidgetRequestJSONAPIRequestDocument body) {
    return updateWidgetApiV2WidgetsExperienceTypeUuidPutWithHttpInfoAsync(
            uuid, experienceType, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update a widget by its UUID for a given experience type. This performs a full replacement of
   * the widget definition.
   *
   * @param uuid The UUID of the widget. (required)
   * @param experienceType The experience type for the widget. (required)
   * @param body (required)
   * @return ApiResponse&lt;WidgetSchemaJSONAPIDocument&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<WidgetSchemaJSONAPIDocument>
      updateWidgetApiV2WidgetsExperienceTypeUuidPutWithHttpInfo(
          UUID uuid,
          WidgetExperienceType experienceType,
          CreateOrUpdateWidgetRequestJSONAPIRequestDocument body)
          throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'uuid' is set
    if (uuid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'uuid' when calling"
              + " updateWidgetApiV2WidgetsExperienceTypeUuidPut");
    }

    // verify the required parameter 'experienceType' is set
    if (experienceType == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'experienceType' when calling"
              + " updateWidgetApiV2WidgetsExperienceTypeUuidPut");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'body' when calling"
              + " updateWidgetApiV2WidgetsExperienceTypeUuidPut");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/widgets/{experience_type}/{uuid}"
            .replaceAll("\\{" + "uuid" + "\\}", apiClient.escapeString(uuid.toString()))
            .replaceAll(
                "\\{" + "experience_type" + "\\}",
                apiClient.escapeString(experienceType.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.WidgetsApi.updateWidgetApiV2WidgetsExperienceTypeUuidPut",
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
        new GenericType<WidgetSchemaJSONAPIDocument>() {});
  }

  /**
   * Update a widget.
   *
   * <p>See {@link #updateWidgetApiV2WidgetsExperienceTypeUuidPutWithHttpInfo}.
   *
   * @param uuid The UUID of the widget. (required)
   * @param experienceType The experience type for the widget. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;WidgetSchemaJSONAPIDocument&gt;&gt;
   */
  public CompletableFuture<ApiResponse<WidgetSchemaJSONAPIDocument>>
      updateWidgetApiV2WidgetsExperienceTypeUuidPutWithHttpInfoAsync(
          UUID uuid,
          WidgetExperienceType experienceType,
          CreateOrUpdateWidgetRequestJSONAPIRequestDocument body) {
    Object localVarPostBody = body;

    // verify the required parameter 'uuid' is set
    if (uuid == null) {
      CompletableFuture<ApiResponse<WidgetSchemaJSONAPIDocument>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'uuid' when calling"
                  + " updateWidgetApiV2WidgetsExperienceTypeUuidPut"));
      return result;
    }

    // verify the required parameter 'experienceType' is set
    if (experienceType == null) {
      CompletableFuture<ApiResponse<WidgetSchemaJSONAPIDocument>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'experienceType' when calling"
                  + " updateWidgetApiV2WidgetsExperienceTypeUuidPut"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<WidgetSchemaJSONAPIDocument>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " updateWidgetApiV2WidgetsExperienceTypeUuidPut"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/widgets/{experience_type}/{uuid}"
            .replaceAll("\\{" + "uuid" + "\\}", apiClient.escapeString(uuid.toString()))
            .replaceAll(
                "\\{" + "experience_type" + "\\}",
                apiClient.escapeString(experienceType.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.WidgetsApi.updateWidgetApiV2WidgetsExperienceTypeUuidPut",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<WidgetSchemaJSONAPIDocument>> result =
          new CompletableFuture<>();
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
        new GenericType<WidgetSchemaJSONAPIDocument>() {});
  }
}
