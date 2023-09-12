package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.CustomDestinationCreatePayload;
import com.datadog.api.client.v2.model.CustomDestinationDeleteResponse;
import com.datadog.api.client.v2.model.CustomDestinationListResponse;
import com.datadog.api.client.v2.model.CustomDestinationResponse;
import com.datadog.api.client.v2.model.CustomDestinationUpdatePayload;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogsCustomDestinationsApi {
  private ApiClient apiClient;

  public LogsCustomDestinationsApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public LogsCustomDestinationsApi(ApiClient apiClient) {
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
   * Create a custom destination.
   *
   * <p>See {@link #createLogsCustomDestinationWithHttpInfo}.
   *
   * @param body (required)
   * @return CustomDestinationResponse
   * @throws ApiException if fails to make API call
   */
  public CustomDestinationResponse createLogsCustomDestination(CustomDestinationCreatePayload body)
      throws ApiException {
    return createLogsCustomDestinationWithHttpInfo(body).getData();
  }

  /**
   * Create a custom destination.
   *
   * <p>See {@link #createLogsCustomDestinationWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;CustomDestinationResponse&gt;
   */
  public CompletableFuture<CustomDestinationResponse> createLogsCustomDestinationAsync(
      CustomDestinationCreatePayload body) {
    return createLogsCustomDestinationWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a new custom destination for your organization.
   *
   * @param body (required)
   * @return ApiResponse&lt;CustomDestinationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CustomDestinationResponse> createLogsCustomDestinationWithHttpInfo(
      CustomDestinationCreatePayload body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createLogsCustomDestination";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createLogsCustomDestination");
    }
    // create path and map variables
    String localVarPath = "/api/v2/logs/config/custom_destinations";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.LogsCustomDestinationsApi.createLogsCustomDestination",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<CustomDestinationResponse>() {});
  }

  /**
   * Create a custom destination.
   *
   * <p>See {@link #createLogsCustomDestinationWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CustomDestinationResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CustomDestinationResponse>>
      createLogsCustomDestinationWithHttpInfoAsync(CustomDestinationCreatePayload body) {
    // Check if unstable operation is enabled
    String operationId = "createLogsCustomDestination";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<CustomDestinationResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<CustomDestinationResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling createLogsCustomDestination"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/logs/config/custom_destinations";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.LogsCustomDestinationsApi.createLogsCustomDestination",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CustomDestinationResponse>> result = new CompletableFuture<>();
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
        new GenericType<CustomDestinationResponse>() {});
  }

  /**
   * Delete a custom destination.
   *
   * <p>See {@link #deleteLogsCustomDestinationWithHttpInfo}.
   *
   * @param customDestinationId The ID of the custom destination. (required)
   * @return CustomDestinationDeleteResponse
   * @throws ApiException if fails to make API call
   */
  public CustomDestinationDeleteResponse deleteLogsCustomDestination(String customDestinationId)
      throws ApiException {
    return deleteLogsCustomDestinationWithHttpInfo(customDestinationId).getData();
  }

  /**
   * Delete a custom destination.
   *
   * <p>See {@link #deleteLogsCustomDestinationWithHttpInfoAsync}.
   *
   * @param customDestinationId The ID of the custom destination. (required)
   * @return CompletableFuture&lt;CustomDestinationDeleteResponse&gt;
   */
  public CompletableFuture<CustomDestinationDeleteResponse> deleteLogsCustomDestinationAsync(
      String customDestinationId) {
    return deleteLogsCustomDestinationWithHttpInfoAsync(customDestinationId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Deletes a custom destination.
   *
   * @param customDestinationId The ID of the custom destination. (required)
   * @return ApiResponse&lt;CustomDestinationDeleteResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CustomDestinationDeleteResponse> deleteLogsCustomDestinationWithHttpInfo(
      String customDestinationId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteLogsCustomDestination";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'customDestinationId' is set
    if (customDestinationId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'customDestinationId' when calling"
              + " deleteLogsCustomDestination");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/logs/config/custom_destinations/{custom_destination_id}"
            .replaceAll(
                "\\{" + "custom_destination_id" + "\\}",
                apiClient.escapeString(customDestinationId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.LogsCustomDestinationsApi.deleteLogsCustomDestination",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<CustomDestinationDeleteResponse>() {});
  }

  /**
   * Delete a custom destination.
   *
   * <p>See {@link #deleteLogsCustomDestinationWithHttpInfo}.
   *
   * @param customDestinationId The ID of the custom destination. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CustomDestinationDeleteResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CustomDestinationDeleteResponse>>
      deleteLogsCustomDestinationWithHttpInfoAsync(String customDestinationId) {
    // Check if unstable operation is enabled
    String operationId = "deleteLogsCustomDestination";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<CustomDestinationDeleteResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'customDestinationId' is set
    if (customDestinationId == null) {
      CompletableFuture<ApiResponse<CustomDestinationDeleteResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'customDestinationId' when calling"
                  + " deleteLogsCustomDestination"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/logs/config/custom_destinations/{custom_destination_id}"
            .replaceAll(
                "\\{" + "custom_destination_id" + "\\}",
                apiClient.escapeString(customDestinationId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.LogsCustomDestinationsApi.deleteLogsCustomDestination",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CustomDestinationDeleteResponse>> result =
          new CompletableFuture<>();
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
        new GenericType<CustomDestinationDeleteResponse>() {});
  }

  /**
   * Get a custom destination.
   *
   * <p>See {@link #getLogsCustomDestinationWithHttpInfo}.
   *
   * @param customDestinationId The ID of the custom destination. (required)
   * @return CustomDestinationResponse
   * @throws ApiException if fails to make API call
   */
  public CustomDestinationResponse getLogsCustomDestination(String customDestinationId)
      throws ApiException {
    return getLogsCustomDestinationWithHttpInfo(customDestinationId).getData();
  }

  /**
   * Get a custom destination.
   *
   * <p>See {@link #getLogsCustomDestinationWithHttpInfoAsync}.
   *
   * @param customDestinationId The ID of the custom destination. (required)
   * @return CompletableFuture&lt;CustomDestinationResponse&gt;
   */
  public CompletableFuture<CustomDestinationResponse> getLogsCustomDestinationAsync(
      String customDestinationId) {
    return getLogsCustomDestinationWithHttpInfoAsync(customDestinationId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a custom destination in the organization specified by the custom destination's <code>
   * custom_destination_id</code>.
   *
   * @param customDestinationId The ID of the custom destination. (required)
   * @return ApiResponse&lt;CustomDestinationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CustomDestinationResponse> getLogsCustomDestinationWithHttpInfo(
      String customDestinationId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getLogsCustomDestination";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'customDestinationId' is set
    if (customDestinationId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'customDestinationId' when calling"
              + " getLogsCustomDestination");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/logs/config/custom_destinations/{custom_destination_id}"
            .replaceAll(
                "\\{" + "custom_destination_id" + "\\}",
                apiClient.escapeString(customDestinationId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.LogsCustomDestinationsApi.getLogsCustomDestination",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<CustomDestinationResponse>() {});
  }

  /**
   * Get a custom destination.
   *
   * <p>See {@link #getLogsCustomDestinationWithHttpInfo}.
   *
   * @param customDestinationId The ID of the custom destination. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CustomDestinationResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CustomDestinationResponse>>
      getLogsCustomDestinationWithHttpInfoAsync(String customDestinationId) {
    // Check if unstable operation is enabled
    String operationId = "getLogsCustomDestination";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<CustomDestinationResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'customDestinationId' is set
    if (customDestinationId == null) {
      CompletableFuture<ApiResponse<CustomDestinationResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'customDestinationId' when calling"
                  + " getLogsCustomDestination"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/logs/config/custom_destinations/{custom_destination_id}"
            .replaceAll(
                "\\{" + "custom_destination_id" + "\\}",
                apiClient.escapeString(customDestinationId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.LogsCustomDestinationsApi.getLogsCustomDestination",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CustomDestinationResponse>> result = new CompletableFuture<>();
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
        new GenericType<CustomDestinationResponse>() {});
  }

  /**
   * List custom destinations.
   *
   * <p>See {@link #listLogsCustomDestinationsWithHttpInfo}.
   *
   * @return CustomDestinationListResponse
   * @throws ApiException if fails to make API call
   */
  public CustomDestinationListResponse listLogsCustomDestinations() throws ApiException {
    return listLogsCustomDestinationsWithHttpInfo().getData();
  }

  /**
   * List custom destinations.
   *
   * <p>See {@link #listLogsCustomDestinationsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;CustomDestinationListResponse&gt;
   */
  public CompletableFuture<CustomDestinationListResponse> listLogsCustomDestinationsAsync() {
    return listLogsCustomDestinationsWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Returns all custom destinations, including their attributes and IDs.
   *
   * @return ApiResponse&lt;CustomDestinationListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CustomDestinationListResponse> listLogsCustomDestinationsWithHttpInfo()
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listLogsCustomDestinations";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/logs/config/custom_destinations";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.LogsCustomDestinationsApi.listLogsCustomDestinations",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<CustomDestinationListResponse>() {});
  }

  /**
   * List custom destinations.
   *
   * <p>See {@link #listLogsCustomDestinationsWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;CustomDestinationListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CustomDestinationListResponse>>
      listLogsCustomDestinationsWithHttpInfoAsync() {
    // Check if unstable operation is enabled
    String operationId = "listLogsCustomDestinations";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<CustomDestinationListResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/logs/config/custom_destinations";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.LogsCustomDestinationsApi.listLogsCustomDestinations",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CustomDestinationListResponse>> result =
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
        new GenericType<CustomDestinationListResponse>() {});
  }

  /**
   * Update a custom destination.
   *
   * <p>See {@link #updateLogsCustomDestinationWithHttpInfo}.
   *
   * @param customDestinationId The ID of the custom destination. (required)
   * @param body (required)
   * @return CustomDestinationResponse
   * @throws ApiException if fails to make API call
   */
  public CustomDestinationResponse updateLogsCustomDestination(
      String customDestinationId, CustomDestinationUpdatePayload body) throws ApiException {
    return updateLogsCustomDestinationWithHttpInfo(customDestinationId, body).getData();
  }

  /**
   * Update a custom destination.
   *
   * <p>See {@link #updateLogsCustomDestinationWithHttpInfoAsync}.
   *
   * @param customDestinationId The ID of the custom destination. (required)
   * @param body (required)
   * @return CompletableFuture&lt;CustomDestinationResponse&gt;
   */
  public CompletableFuture<CustomDestinationResponse> updateLogsCustomDestinationAsync(
      String customDestinationId, CustomDestinationUpdatePayload body) {
    return updateLogsCustomDestinationWithHttpInfoAsync(customDestinationId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Edit a custom destination.
   *
   * @param customDestinationId The ID of the custom destination. (required)
   * @param body (required)
   * @return ApiResponse&lt;CustomDestinationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CustomDestinationResponse> updateLogsCustomDestinationWithHttpInfo(
      String customDestinationId, CustomDestinationUpdatePayload body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateLogsCustomDestination";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'customDestinationId' is set
    if (customDestinationId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'customDestinationId' when calling"
              + " updateLogsCustomDestination");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateLogsCustomDestination");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/logs/config/custom_destinations/{custom_destination_id}"
            .replaceAll(
                "\\{" + "custom_destination_id" + "\\}",
                apiClient.escapeString(customDestinationId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.LogsCustomDestinationsApi.updateLogsCustomDestination",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "PUT",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<CustomDestinationResponse>() {});
  }

  /**
   * Update a custom destination.
   *
   * <p>See {@link #updateLogsCustomDestinationWithHttpInfo}.
   *
   * @param customDestinationId The ID of the custom destination. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CustomDestinationResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CustomDestinationResponse>>
      updateLogsCustomDestinationWithHttpInfoAsync(
          String customDestinationId, CustomDestinationUpdatePayload body) {
    // Check if unstable operation is enabled
    String operationId = "updateLogsCustomDestination";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<CustomDestinationResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'customDestinationId' is set
    if (customDestinationId == null) {
      CompletableFuture<ApiResponse<CustomDestinationResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'customDestinationId' when calling"
                  + " updateLogsCustomDestination"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<CustomDestinationResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling updateLogsCustomDestination"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/logs/config/custom_destinations/{custom_destination_id}"
            .replaceAll(
                "\\{" + "custom_destination_id" + "\\}",
                apiClient.escapeString(customDestinationId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.LogsCustomDestinationsApi.updateLogsCustomDestination",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CustomDestinationResponse>> result = new CompletableFuture<>();
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
        new GenericType<CustomDestinationResponse>() {});
  }
}
