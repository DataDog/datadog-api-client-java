package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.RUMOperationCreateRequest;
import com.datadog.api.client.v2.model.RUMOperationResponse;
import com.datadog.api.client.v2.model.RUMOperationStrongLinkCreateRequest;
import com.datadog.api.client.v2.model.RUMOperationStrongLinkResponse;
import com.datadog.api.client.v2.model.RUMOperationStrongLinkUpdateRequest;
import com.datadog.api.client.v2.model.RUMOperationStrongLinksListResponse;
import com.datadog.api.client.v2.model.RUMOperationUpdateRequest;
import com.datadog.api.client.v2.model.RUMOperationsListResponse;
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
public class RumOperationsApi {
  private ApiClient apiClient;

  public RumOperationsApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public RumOperationsApi(ApiClient apiClient) {
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
   * Create a RUM operation.
   *
   * <p>See {@link #createRUMOperationWithHttpInfo}.
   *
   * @param body (required)
   * @return RUMOperationResponse
   * @throws ApiException if fails to make API call
   */
  public RUMOperationResponse createRUMOperation(RUMOperationCreateRequest body)
      throws ApiException {
    return createRUMOperationWithHttpInfo(body).getData();
  }

  /**
   * Create a RUM operation.
   *
   * <p>See {@link #createRUMOperationWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;RUMOperationResponse&gt;
   */
  public CompletableFuture<RUMOperationResponse> createRUMOperationAsync(
      RUMOperationCreateRequest body) {
    return createRUMOperationWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a new RUM operation, defining the journey used to detect it from RUM events.
   *
   * @param body (required)
   * @return ApiResponse&lt;RUMOperationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict. An operation with this name already exists. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<RUMOperationResponse> createRUMOperationWithHttpInfo(
      RUMOperationCreateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createRUMOperation";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createRUMOperation");
    }
    // create path and map variables
    String localVarPath = "/api/v2/rum/operations";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumOperationsApi.createRUMOperation",
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
        new GenericType<RUMOperationResponse>() {});
  }

  /**
   * Create a RUM operation.
   *
   * <p>See {@link #createRUMOperationWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;RUMOperationResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RUMOperationResponse>> createRUMOperationWithHttpInfoAsync(
      RUMOperationCreateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createRUMOperation";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<RUMOperationResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<RUMOperationResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createRUMOperation"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/rum/operations";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumOperationsApi.createRUMOperation",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RUMOperationResponse>> result = new CompletableFuture<>();
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
        new GenericType<RUMOperationResponse>() {});
  }

  /**
   * Create a RUM operation strong link.
   *
   * <p>See {@link #createRUMOperationStrongLinkWithHttpInfo}.
   *
   * @param body (required)
   * @return RUMOperationStrongLinkResponse
   * @throws ApiException if fails to make API call
   */
  public RUMOperationStrongLinkResponse createRUMOperationStrongLink(
      RUMOperationStrongLinkCreateRequest body) throws ApiException {
    return createRUMOperationStrongLinkWithHttpInfo(body).getData();
  }

  /**
   * Create a RUM operation strong link.
   *
   * <p>See {@link #createRUMOperationStrongLinkWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;RUMOperationStrongLinkResponse&gt;
   */
  public CompletableFuture<RUMOperationStrongLinkResponse> createRUMOperationStrongLinkAsync(
      RUMOperationStrongLinkCreateRequest body) {
    return createRUMOperationStrongLinkWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a strong link between a RUM operation and a feature, confirming that the feature belongs
   * to the operation. The operation can be identified by <code>operation_id</code> or <code>
   * operation_name</code>; if <code>operation_name</code> does not match an existing operation, a
   * stub operation is created.
   *
   * @param body (required)
   * @return ApiResponse&lt;RUMOperationStrongLinkResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found. The referenced &#x60;operation_id&#x60; does not exist. </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict. A strong link between this operation and feature already exists. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<RUMOperationStrongLinkResponse> createRUMOperationStrongLinkWithHttpInfo(
      RUMOperationStrongLinkCreateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createRUMOperationStrongLink";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createRUMOperationStrongLink");
    }
    // create path and map variables
    String localVarPath = "/api/v2/rum/operations/strong_links";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumOperationsApi.createRUMOperationStrongLink",
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
        new GenericType<RUMOperationStrongLinkResponse>() {});
  }

  /**
   * Create a RUM operation strong link.
   *
   * <p>See {@link #createRUMOperationStrongLinkWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;RUMOperationStrongLinkResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RUMOperationStrongLinkResponse>>
      createRUMOperationStrongLinkWithHttpInfoAsync(RUMOperationStrongLinkCreateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createRUMOperationStrongLink";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<RUMOperationStrongLinkResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<RUMOperationStrongLinkResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling createRUMOperationStrongLink"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/rum/operations/strong_links";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumOperationsApi.createRUMOperationStrongLink",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RUMOperationStrongLinkResponse>> result =
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
        new GenericType<RUMOperationStrongLinkResponse>() {});
  }

  /**
   * Delete a RUM operation.
   *
   * <p>See {@link #deleteRUMOperationWithHttpInfo}.
   *
   * @param operationId The unique identifier of the RUM operation to delete. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteRUMOperation(String operationId) throws ApiException {
    deleteRUMOperationWithHttpInfo(operationId);
  }

  /**
   * Delete a RUM operation.
   *
   * <p>See {@link #deleteRUMOperationWithHttpInfoAsync}.
   *
   * @param operationId The unique identifier of the RUM operation to delete. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteRUMOperationAsync(String operationId) {
    return deleteRUMOperationWithHttpInfoAsync(operationId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete a RUM operation.
   *
   * @param operationId The unique identifier of the RUM operation to delete. (required)
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
  public ApiResponse<Void> deleteRUMOperationWithHttpInfo(String operationId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteRUMOperation";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'operationId' is set
    if (operationId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'operationId' when calling deleteRUMOperation");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/operations/{operation_id}"
            .replaceAll(
                "\\{" + "operation_id" + "\\}", apiClient.escapeString(operationId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumOperationsApi.deleteRUMOperation",
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
   * Delete a RUM operation.
   *
   * <p>See {@link #deleteRUMOperationWithHttpInfo}.
   *
   * @param operationId The unique identifier of the RUM operation to delete. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteRUMOperationWithHttpInfoAsync(
      String operationId) {
    // Check if unstable operation is enabled
    String operationId = "deleteRUMOperation";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'operationId' is set
    if (operationId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'operationId' when calling deleteRUMOperation"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/operations/{operation_id}"
            .replaceAll(
                "\\{" + "operation_id" + "\\}", apiClient.escapeString(operationId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumOperationsApi.deleteRUMOperation",
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
   * Delete a RUM operation strong link.
   *
   * <p>See {@link #deleteRUMOperationStrongLinkWithHttpInfo}.
   *
   * @param operationId The unique identifier of the RUM operation. (required)
   * @param featureId The unique identifier of the feature. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteRUMOperationStrongLink(String operationId, String featureId)
      throws ApiException {
    deleteRUMOperationStrongLinkWithHttpInfo(operationId, featureId);
  }

  /**
   * Delete a RUM operation strong link.
   *
   * <p>See {@link #deleteRUMOperationStrongLinkWithHttpInfoAsync}.
   *
   * @param operationId The unique identifier of the RUM operation. (required)
   * @param featureId The unique identifier of the feature. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteRUMOperationStrongLinkAsync(
      String operationId, String featureId) {
    return deleteRUMOperationStrongLinkWithHttpInfoAsync(operationId, featureId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete the strong link between a RUM operation and a feature.
   *
   * @param operationId The unique identifier of the RUM operation. (required)
   * @param featureId The unique identifier of the feature. (required)
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
  public ApiResponse<Void> deleteRUMOperationStrongLinkWithHttpInfo(
      String operationId, String featureId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteRUMOperationStrongLink";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'operationId' is set
    if (operationId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'operationId' when calling deleteRUMOperationStrongLink");
    }

    // verify the required parameter 'featureId' is set
    if (featureId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'featureId' when calling deleteRUMOperationStrongLink");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/operations/strong_links/{operation_id}/{feature_id}"
            .replaceAll(
                "\\{" + "operation_id" + "\\}", apiClient.escapeString(operationId.toString()))
            .replaceAll("\\{" + "feature_id" + "\\}", apiClient.escapeString(featureId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumOperationsApi.deleteRUMOperationStrongLink",
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
   * Delete a RUM operation strong link.
   *
   * <p>See {@link #deleteRUMOperationStrongLinkWithHttpInfo}.
   *
   * @param operationId The unique identifier of the RUM operation. (required)
   * @param featureId The unique identifier of the feature. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteRUMOperationStrongLinkWithHttpInfoAsync(
      String operationId, String featureId) {
    // Check if unstable operation is enabled
    String operationId = "deleteRUMOperationStrongLink";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'operationId' is set
    if (operationId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'operationId' when calling"
                  + " deleteRUMOperationStrongLink"));
      return result;
    }

    // verify the required parameter 'featureId' is set
    if (featureId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'featureId' when calling"
                  + " deleteRUMOperationStrongLink"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/operations/strong_links/{operation_id}/{feature_id}"
            .replaceAll(
                "\\{" + "operation_id" + "\\}", apiClient.escapeString(operationId.toString()))
            .replaceAll("\\{" + "feature_id" + "\\}", apiClient.escapeString(featureId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumOperationsApi.deleteRUMOperationStrongLink",
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
   * Get a RUM operation.
   *
   * <p>See {@link #getRUMOperationWithHttpInfo}.
   *
   * @param operationId The unique identifier of the RUM operation. (required)
   * @return RUMOperationResponse
   * @throws ApiException if fails to make API call
   */
  public RUMOperationResponse getRUMOperation(String operationId) throws ApiException {
    return getRUMOperationWithHttpInfo(operationId).getData();
  }

  /**
   * Get a RUM operation.
   *
   * <p>See {@link #getRUMOperationWithHttpInfoAsync}.
   *
   * @param operationId The unique identifier of the RUM operation. (required)
   * @return CompletableFuture&lt;RUMOperationResponse&gt;
   */
  public CompletableFuture<RUMOperationResponse> getRUMOperationAsync(String operationId) {
    return getRUMOperationWithHttpInfoAsync(operationId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Retrieve a specific RUM operation by its unique identifier.
   *
   * @param operationId The unique identifier of the RUM operation. (required)
   * @return ApiResponse&lt;RUMOperationResponse&gt;
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
  public ApiResponse<RUMOperationResponse> getRUMOperationWithHttpInfo(String operationId)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getRUMOperation";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'operationId' is set
    if (operationId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'operationId' when calling getRUMOperation");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/operations/{operation_id}"
            .replaceAll(
                "\\{" + "operation_id" + "\\}", apiClient.escapeString(operationId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumOperationsApi.getRUMOperation",
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
        new GenericType<RUMOperationResponse>() {});
  }

  /**
   * Get a RUM operation.
   *
   * <p>See {@link #getRUMOperationWithHttpInfo}.
   *
   * @param operationId The unique identifier of the RUM operation. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;RUMOperationResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RUMOperationResponse>> getRUMOperationWithHttpInfoAsync(
      String operationId) {
    // Check if unstable operation is enabled
    String operationId = "getRUMOperation";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<RUMOperationResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'operationId' is set
    if (operationId == null) {
      CompletableFuture<ApiResponse<RUMOperationResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'operationId' when calling getRUMOperation"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/operations/{operation_id}"
            .replaceAll(
                "\\{" + "operation_id" + "\\}", apiClient.escapeString(operationId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumOperationsApi.getRUMOperation",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RUMOperationResponse>> result = new CompletableFuture<>();
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
        new GenericType<RUMOperationResponse>() {});
  }

  /**
   * Get a RUM operation by name.
   *
   * <p>See {@link #getRUMOperationByNameWithHttpInfo}.
   *
   * @param name The unique name of the RUM operation. (required)
   * @return RUMOperationResponse
   * @throws ApiException if fails to make API call
   */
  public RUMOperationResponse getRUMOperationByName(String name) throws ApiException {
    return getRUMOperationByNameWithHttpInfo(name).getData();
  }

  /**
   * Get a RUM operation by name.
   *
   * <p>See {@link #getRUMOperationByNameWithHttpInfoAsync}.
   *
   * @param name The unique name of the RUM operation. (required)
   * @return CompletableFuture&lt;RUMOperationResponse&gt;
   */
  public CompletableFuture<RUMOperationResponse> getRUMOperationByNameAsync(String name) {
    return getRUMOperationByNameWithHttpInfoAsync(name)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Retrieve a specific RUM operation by its unique name.
   *
   * @param name The unique name of the RUM operation. (required)
   * @return ApiResponse&lt;RUMOperationResponse&gt;
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
  public ApiResponse<RUMOperationResponse> getRUMOperationByNameWithHttpInfo(String name)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getRUMOperationByName";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(
          400, "Missing the required parameter 'name' when calling getRUMOperationByName");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/operations/by-name/{name}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumOperationsApi.getRUMOperationByName",
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
        new GenericType<RUMOperationResponse>() {});
  }

  /**
   * Get a RUM operation by name.
   *
   * <p>See {@link #getRUMOperationByNameWithHttpInfo}.
   *
   * @param name The unique name of the RUM operation. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;RUMOperationResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RUMOperationResponse>>
      getRUMOperationByNameWithHttpInfoAsync(String name) {
    // Check if unstable operation is enabled
    String operationId = "getRUMOperationByName";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<RUMOperationResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'name' is set
    if (name == null) {
      CompletableFuture<ApiResponse<RUMOperationResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'name' when calling getRUMOperationByName"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/operations/by-name/{name}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumOperationsApi.getRUMOperationByName",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RUMOperationResponse>> result = new CompletableFuture<>();
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
        new GenericType<RUMOperationResponse>() {});
  }

  /** Manage optional parameters to listRUMOperations. */
  public static class ListRUMOperationsOptionalParameters {
    private String query;
    private Long pageOffset;
    private Long pageLimit;
    private String creator;
    private String team;
    private String featureId;
    private UUID applicationId;

    /**
     * Set query.
     *
     * @param query A search query to filter operations by name. (optional)
     * @return ListRUMOperationsOptionalParameters
     */
    public ListRUMOperationsOptionalParameters query(String query) {
      this.query = query;
      return this;
    }

    /**
     * Set pageOffset.
     *
     * @param pageOffset Offset for pagination. (optional, default to 0)
     * @return ListRUMOperationsOptionalParameters
     */
    public ListRUMOperationsOptionalParameters pageOffset(Long pageOffset) {
      this.pageOffset = pageOffset;
      return this;
    }

    /**
     * Set pageLimit.
     *
     * @param pageLimit Number of items per page. Maximum of 100. (optional, default to 50)
     * @return ListRUMOperationsOptionalParameters
     */
    public ListRUMOperationsOptionalParameters pageLimit(Long pageLimit) {
      this.pageLimit = pageLimit;
      return this;
    }

    /**
     * Set creator.
     *
     * @param creator Filter operations by the email of their creator. (optional)
     * @return ListRUMOperationsOptionalParameters
     */
    public ListRUMOperationsOptionalParameters creator(String creator) {
      this.creator = creator;
      return this;
    }

    /**
     * Set team.
     *
     * @param team Filter operations by team. Accepts a comma-separated list of teams. (optional)
     * @return ListRUMOperationsOptionalParameters
     */
    public ListRUMOperationsOptionalParameters team(String team) {
      this.team = team;
      return this;
    }

    /**
     * Set featureId.
     *
     * @param featureId Filter operations by feature ID. Accepts a comma-separated list of feature
     *     IDs. (optional)
     * @return ListRUMOperationsOptionalParameters
     */
    public ListRUMOperationsOptionalParameters featureId(String featureId) {
      this.featureId = featureId;
      return this;
    }

    /**
     * Set applicationId.
     *
     * @param applicationId Filter operations by RUM application ID. (optional)
     * @return ListRUMOperationsOptionalParameters
     */
    public ListRUMOperationsOptionalParameters applicationId(UUID applicationId) {
      this.applicationId = applicationId;
      return this;
    }
  }

  /**
   * Search RUM operations.
   *
   * <p>See {@link #listRUMOperationsWithHttpInfo}.
   *
   * @return RUMOperationsListResponse
   * @throws ApiException if fails to make API call
   */
  public RUMOperationsListResponse listRUMOperations() throws ApiException {
    return listRUMOperationsWithHttpInfo(new ListRUMOperationsOptionalParameters()).getData();
  }

  /**
   * Search RUM operations.
   *
   * <p>See {@link #listRUMOperationsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;RUMOperationsListResponse&gt;
   */
  public CompletableFuture<RUMOperationsListResponse> listRUMOperationsAsync() {
    return listRUMOperationsWithHttpInfoAsync(new ListRUMOperationsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Search RUM operations.
   *
   * <p>See {@link #listRUMOperationsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return RUMOperationsListResponse
   * @throws ApiException if fails to make API call
   */
  public RUMOperationsListResponse listRUMOperations(ListRUMOperationsOptionalParameters parameters)
      throws ApiException {
    return listRUMOperationsWithHttpInfo(parameters).getData();
  }

  /**
   * Search RUM operations.
   *
   * <p>See {@link #listRUMOperationsWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;RUMOperationsListResponse&gt;
   */
  public CompletableFuture<RUMOperationsListResponse> listRUMOperationsAsync(
      ListRUMOperationsOptionalParameters parameters) {
    return listRUMOperationsWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Search RUM operations for your organization. Supports filtering by query, creator, team,
   * feature, and application.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;RUMOperationsListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<RUMOperationsListResponse> listRUMOperationsWithHttpInfo(
      ListRUMOperationsOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listRUMOperations";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    String query = parameters.query;
    Long pageOffset = parameters.pageOffset;
    Long pageLimit = parameters.pageLimit;
    String creator = parameters.creator;
    String team = parameters.team;
    String featureId = parameters.featureId;
    UUID applicationId = parameters.applicationId;
    // create path and map variables
    String localVarPath = "/api/v2/rum/operations/search";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "query", query));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[offset]", pageOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "creator", creator));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "team", team));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "feature_id", featureId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "application_id", applicationId));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumOperationsApi.listRUMOperations",
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
        new GenericType<RUMOperationsListResponse>() {});
  }

  /**
   * Search RUM operations.
   *
   * <p>See {@link #listRUMOperationsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;RUMOperationsListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RUMOperationsListResponse>>
      listRUMOperationsWithHttpInfoAsync(ListRUMOperationsOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listRUMOperations";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<RUMOperationsListResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    String query = parameters.query;
    Long pageOffset = parameters.pageOffset;
    Long pageLimit = parameters.pageLimit;
    String creator = parameters.creator;
    String team = parameters.team;
    String featureId = parameters.featureId;
    UUID applicationId = parameters.applicationId;
    // create path and map variables
    String localVarPath = "/api/v2/rum/operations/search";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "query", query));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[offset]", pageOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "creator", creator));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "team", team));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "feature_id", featureId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "application_id", applicationId));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumOperationsApi.listRUMOperations",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RUMOperationsListResponse>> result = new CompletableFuture<>();
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
        new GenericType<RUMOperationsListResponse>() {});
  }

  /** Manage optional parameters to listRUMOperationStrongLinks. */
  public static class ListRUMOperationStrongLinksOptionalParameters {
    private String operationId;
    private String featureId;
    private Long pageOffset;
    private Long pageLimit;

    /**
     * Set operationId.
     *
     * @param operationId Filter strong links by RUM operation ID. (optional)
     * @return ListRUMOperationStrongLinksOptionalParameters
     */
    public ListRUMOperationStrongLinksOptionalParameters operationId(String operationId) {
      this.operationId = operationId;
      return this;
    }

    /**
     * Set featureId.
     *
     * @param featureId Filter strong links by feature ID. (optional)
     * @return ListRUMOperationStrongLinksOptionalParameters
     */
    public ListRUMOperationStrongLinksOptionalParameters featureId(String featureId) {
      this.featureId = featureId;
      return this;
    }

    /**
     * Set pageOffset.
     *
     * @param pageOffset Offset for pagination. (optional, default to 0)
     * @return ListRUMOperationStrongLinksOptionalParameters
     */
    public ListRUMOperationStrongLinksOptionalParameters pageOffset(Long pageOffset) {
      this.pageOffset = pageOffset;
      return this;
    }

    /**
     * Set pageLimit.
     *
     * @param pageLimit Number of items per page. Maximum of 200. (optional, default to 50)
     * @return ListRUMOperationStrongLinksOptionalParameters
     */
    public ListRUMOperationStrongLinksOptionalParameters pageLimit(Long pageLimit) {
      this.pageLimit = pageLimit;
      return this;
    }
  }

  /**
   * List RUM operation strong links.
   *
   * <p>See {@link #listRUMOperationStrongLinksWithHttpInfo}.
   *
   * @return RUMOperationStrongLinksListResponse
   * @throws ApiException if fails to make API call
   */
  public RUMOperationStrongLinksListResponse listRUMOperationStrongLinks() throws ApiException {
    return listRUMOperationStrongLinksWithHttpInfo(
            new ListRUMOperationStrongLinksOptionalParameters())
        .getData();
  }

  /**
   * List RUM operation strong links.
   *
   * <p>See {@link #listRUMOperationStrongLinksWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;RUMOperationStrongLinksListResponse&gt;
   */
  public CompletableFuture<RUMOperationStrongLinksListResponse> listRUMOperationStrongLinksAsync() {
    return listRUMOperationStrongLinksWithHttpInfoAsync(
            new ListRUMOperationStrongLinksOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List RUM operation strong links.
   *
   * <p>See {@link #listRUMOperationStrongLinksWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return RUMOperationStrongLinksListResponse
   * @throws ApiException if fails to make API call
   */
  public RUMOperationStrongLinksListResponse listRUMOperationStrongLinks(
      ListRUMOperationStrongLinksOptionalParameters parameters) throws ApiException {
    return listRUMOperationStrongLinksWithHttpInfo(parameters).getData();
  }

  /**
   * List RUM operation strong links.
   *
   * <p>See {@link #listRUMOperationStrongLinksWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;RUMOperationStrongLinksListResponse&gt;
   */
  public CompletableFuture<RUMOperationStrongLinksListResponse> listRUMOperationStrongLinksAsync(
      ListRUMOperationStrongLinksOptionalParameters parameters) {
    return listRUMOperationStrongLinksWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List strong links between RUM operations and features. A strong link confirms that a feature
   * belongs to an operation. Provide <code>operation_id</code>, <code>feature_id</code>, or both to
   * filter results; at least one is required.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;RUMOperationStrongLinksListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<RUMOperationStrongLinksListResponse> listRUMOperationStrongLinksWithHttpInfo(
      ListRUMOperationStrongLinksOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listRUMOperationStrongLinks";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    String operationId = parameters.operationId;
    String featureId = parameters.featureId;
    Long pageOffset = parameters.pageOffset;
    Long pageLimit = parameters.pageLimit;
    // create path and map variables
    String localVarPath = "/api/v2/rum/operations/strong_links";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "operation_id", operationId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "feature_id", featureId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[offset]", pageOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumOperationsApi.listRUMOperationStrongLinks",
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
        new GenericType<RUMOperationStrongLinksListResponse>() {});
  }

  /**
   * List RUM operation strong links.
   *
   * <p>See {@link #listRUMOperationStrongLinksWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;RUMOperationStrongLinksListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RUMOperationStrongLinksListResponse>>
      listRUMOperationStrongLinksWithHttpInfoAsync(
          ListRUMOperationStrongLinksOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listRUMOperationStrongLinks";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<RUMOperationStrongLinksListResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    String operationId = parameters.operationId;
    String featureId = parameters.featureId;
    Long pageOffset = parameters.pageOffset;
    Long pageLimit = parameters.pageLimit;
    // create path and map variables
    String localVarPath = "/api/v2/rum/operations/strong_links";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "operation_id", operationId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "feature_id", featureId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[offset]", pageOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumOperationsApi.listRUMOperationStrongLinks",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RUMOperationStrongLinksListResponse>> result =
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
        new GenericType<RUMOperationStrongLinksListResponse>() {});
  }

  /**
   * Update a RUM operation.
   *
   * <p>See {@link #updateRUMOperationWithHttpInfo}.
   *
   * @param operationId The unique identifier of the RUM operation to update. (required)
   * @param body (required)
   * @return RUMOperationResponse
   * @throws ApiException if fails to make API call
   */
  public RUMOperationResponse updateRUMOperation(String operationId, RUMOperationUpdateRequest body)
      throws ApiException {
    return updateRUMOperationWithHttpInfo(operationId, body).getData();
  }

  /**
   * Update a RUM operation.
   *
   * <p>See {@link #updateRUMOperationWithHttpInfoAsync}.
   *
   * @param operationId The unique identifier of the RUM operation to update. (required)
   * @param body (required)
   * @return CompletableFuture&lt;RUMOperationResponse&gt;
   */
  public CompletableFuture<RUMOperationResponse> updateRUMOperationAsync(
      String operationId, RUMOperationUpdateRequest body) {
    return updateRUMOperationWithHttpInfoAsync(operationId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update an existing RUM operation. Fields omitted from the request body keep their existing
   * value, with the exception of <code>journey_rum</code>, which is required and fully replaced on
   * every update.
   *
   * @param operationId The unique identifier of the RUM operation to update. (required)
   * @param body (required)
   * @return ApiResponse&lt;RUMOperationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict. An operation with this name already exists. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<RUMOperationResponse> updateRUMOperationWithHttpInfo(
      String operationId, RUMOperationUpdateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateRUMOperation";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'operationId' is set
    if (operationId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'operationId' when calling updateRUMOperation");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateRUMOperation");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/operations/{operation_id}"
            .replaceAll(
                "\\{" + "operation_id" + "\\}", apiClient.escapeString(operationId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumOperationsApi.updateRUMOperation",
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
        new GenericType<RUMOperationResponse>() {});
  }

  /**
   * Update a RUM operation.
   *
   * <p>See {@link #updateRUMOperationWithHttpInfo}.
   *
   * @param operationId The unique identifier of the RUM operation to update. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;RUMOperationResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RUMOperationResponse>> updateRUMOperationWithHttpInfoAsync(
      String operationId, RUMOperationUpdateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "updateRUMOperation";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<RUMOperationResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'operationId' is set
    if (operationId == null) {
      CompletableFuture<ApiResponse<RUMOperationResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'operationId' when calling updateRUMOperation"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<RUMOperationResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateRUMOperation"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/operations/{operation_id}"
            .replaceAll(
                "\\{" + "operation_id" + "\\}", apiClient.escapeString(operationId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumOperationsApi.updateRUMOperation",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RUMOperationResponse>> result = new CompletableFuture<>();
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
        new GenericType<RUMOperationResponse>() {});
  }

  /**
   * Update a RUM operation strong link.
   *
   * <p>See {@link #updateRUMOperationStrongLinkWithHttpInfo}.
   *
   * @param operationId The unique identifier of the RUM operation. (required)
   * @param featureId The unique identifier of the feature. (required)
   * @param body (required)
   * @return RUMOperationStrongLinkResponse
   * @throws ApiException if fails to make API call
   */
  public RUMOperationStrongLinkResponse updateRUMOperationStrongLink(
      String operationId, String featureId, RUMOperationStrongLinkUpdateRequest body)
      throws ApiException {
    return updateRUMOperationStrongLinkWithHttpInfo(operationId, featureId, body).getData();
  }

  /**
   * Update a RUM operation strong link.
   *
   * <p>See {@link #updateRUMOperationStrongLinkWithHttpInfoAsync}.
   *
   * @param operationId The unique identifier of the RUM operation. (required)
   * @param featureId The unique identifier of the feature. (required)
   * @param body (required)
   * @return CompletableFuture&lt;RUMOperationStrongLinkResponse&gt;
   */
  public CompletableFuture<RUMOperationStrongLinkResponse> updateRUMOperationStrongLinkAsync(
      String operationId, String featureId, RUMOperationStrongLinkUpdateRequest body) {
    return updateRUMOperationStrongLinkWithHttpInfoAsync(operationId, featureId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update the status of a strong link between a RUM operation and a feature.
   *
   * @param operationId The unique identifier of the RUM operation. (required)
   * @param featureId The unique identifier of the feature. (required)
   * @param body (required)
   * @return ApiResponse&lt;RUMOperationStrongLinkResponse&gt;
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
  public ApiResponse<RUMOperationStrongLinkResponse> updateRUMOperationStrongLinkWithHttpInfo(
      String operationId, String featureId, RUMOperationStrongLinkUpdateRequest body)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateRUMOperationStrongLink";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'operationId' is set
    if (operationId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'operationId' when calling updateRUMOperationStrongLink");
    }

    // verify the required parameter 'featureId' is set
    if (featureId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'featureId' when calling updateRUMOperationStrongLink");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateRUMOperationStrongLink");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/operations/strong_links/{operation_id}/{feature_id}"
            .replaceAll(
                "\\{" + "operation_id" + "\\}", apiClient.escapeString(operationId.toString()))
            .replaceAll("\\{" + "feature_id" + "\\}", apiClient.escapeString(featureId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RumOperationsApi.updateRUMOperationStrongLink",
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
        new GenericType<RUMOperationStrongLinkResponse>() {});
  }

  /**
   * Update a RUM operation strong link.
   *
   * <p>See {@link #updateRUMOperationStrongLinkWithHttpInfo}.
   *
   * @param operationId The unique identifier of the RUM operation. (required)
   * @param featureId The unique identifier of the feature. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;RUMOperationStrongLinkResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<RUMOperationStrongLinkResponse>>
      updateRUMOperationStrongLinkWithHttpInfoAsync(
          String operationId, String featureId, RUMOperationStrongLinkUpdateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "updateRUMOperationStrongLink";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<RUMOperationStrongLinkResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'operationId' is set
    if (operationId == null) {
      CompletableFuture<ApiResponse<RUMOperationStrongLinkResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'operationId' when calling"
                  + " updateRUMOperationStrongLink"));
      return result;
    }

    // verify the required parameter 'featureId' is set
    if (featureId == null) {
      CompletableFuture<ApiResponse<RUMOperationStrongLinkResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'featureId' when calling"
                  + " updateRUMOperationStrongLink"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<RUMOperationStrongLinkResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling updateRUMOperationStrongLink"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/rum/operations/strong_links/{operation_id}/{feature_id}"
            .replaceAll(
                "\\{" + "operation_id" + "\\}", apiClient.escapeString(operationId.toString()))
            .replaceAll("\\{" + "feature_id" + "\\}", apiClient.escapeString(featureId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RumOperationsApi.updateRUMOperationStrongLink",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<RUMOperationStrongLinkResponse>> result =
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
        new GenericType<RUMOperationStrongLinkResponse>() {});
  }
}
