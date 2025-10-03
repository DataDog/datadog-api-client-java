package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.BulkDeleteAppsDatastoreItemsRequest;
import com.datadog.api.client.v2.model.BulkPutAppsDatastoreItemsRequest;
import com.datadog.api.client.v2.model.CreateAppsDatastoreRequest;
import com.datadog.api.client.v2.model.CreateAppsDatastoreResponse;
import com.datadog.api.client.v2.model.Datastore;
import com.datadog.api.client.v2.model.DatastoreArray;
import com.datadog.api.client.v2.model.DeleteAppsDatastoreItemRequest;
import com.datadog.api.client.v2.model.DeleteAppsDatastoreItemResponse;
import com.datadog.api.client.v2.model.DeleteAppsDatastoreItemResponseArray;
import com.datadog.api.client.v2.model.ItemApiPayload;
import com.datadog.api.client.v2.model.ItemApiPayloadArray;
import com.datadog.api.client.v2.model.PutAppsDatastoreItemResponseArray;
import com.datadog.api.client.v2.model.UpdateAppsDatastoreItemRequest;
import com.datadog.api.client.v2.model.UpdateAppsDatastoreRequest;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ActionsDatastoresApi {
  private ApiClient apiClient;

  public ActionsDatastoresApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public ActionsDatastoresApi(ApiClient apiClient) {
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
   * Bulk delete datastore items.
   *
   * <p>See {@link #bulkDeleteDatastoreItemsWithHttpInfo}.
   *
   * @param datastoreId The ID of the datastore. (required)
   * @param body (required)
   * @return DeleteAppsDatastoreItemResponseArray
   * @throws ApiException if fails to make API call
   */
  public DeleteAppsDatastoreItemResponseArray bulkDeleteDatastoreItems(
      String datastoreId, BulkDeleteAppsDatastoreItemsRequest body) throws ApiException {
    return bulkDeleteDatastoreItemsWithHttpInfo(datastoreId, body).getData();
  }

  /**
   * Bulk delete datastore items.
   *
   * <p>See {@link #bulkDeleteDatastoreItemsWithHttpInfoAsync}.
   *
   * @param datastoreId The ID of the datastore. (required)
   * @param body (required)
   * @return CompletableFuture&lt;DeleteAppsDatastoreItemResponseArray&gt;
   */
  public CompletableFuture<DeleteAppsDatastoreItemResponseArray> bulkDeleteDatastoreItemsAsync(
      String datastoreId, BulkDeleteAppsDatastoreItemsRequest body) {
    return bulkDeleteDatastoreItemsWithHttpInfoAsync(datastoreId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Deletes multiple items from a datastore by their keys in a single operation.
   *
   * @param datastoreId The ID of the datastore. (required)
   * @param body (required)
   * @return ApiResponse&lt;DeleteAppsDatastoreItemResponseArray&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<DeleteAppsDatastoreItemResponseArray> bulkDeleteDatastoreItemsWithHttpInfo(
      String datastoreId, BulkDeleteAppsDatastoreItemsRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'datastoreId' is set
    if (datastoreId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'datastoreId' when calling bulkDeleteDatastoreItems");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling bulkDeleteDatastoreItems");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/actions-datastores/{datastore_id}/items/bulk"
            .replaceAll(
                "\\{" + "datastore_id" + "\\}", apiClient.escapeString(datastoreId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ActionsDatastoresApi.bulkDeleteDatastoreItems",
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
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<DeleteAppsDatastoreItemResponseArray>() {});
  }

  /**
   * Bulk delete datastore items.
   *
   * <p>See {@link #bulkDeleteDatastoreItemsWithHttpInfo}.
   *
   * @param datastoreId The ID of the datastore. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;DeleteAppsDatastoreItemResponseArray&gt;&gt;
   */
  public CompletableFuture<ApiResponse<DeleteAppsDatastoreItemResponseArray>>
      bulkDeleteDatastoreItemsWithHttpInfoAsync(
          String datastoreId, BulkDeleteAppsDatastoreItemsRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'datastoreId' is set
    if (datastoreId == null) {
      CompletableFuture<ApiResponse<DeleteAppsDatastoreItemResponseArray>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'datastoreId' when calling"
                  + " bulkDeleteDatastoreItems"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<DeleteAppsDatastoreItemResponseArray>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling bulkDeleteDatastoreItems"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/actions-datastores/{datastore_id}/items/bulk"
            .replaceAll(
                "\\{" + "datastore_id" + "\\}", apiClient.escapeString(datastoreId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ActionsDatastoresApi.bulkDeleteDatastoreItems",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<DeleteAppsDatastoreItemResponseArray>> result =
          new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<DeleteAppsDatastoreItemResponseArray>() {});
  }

  /**
   * Bulk write datastore items.
   *
   * <p>See {@link #bulkWriteDatastoreItemsWithHttpInfo}.
   *
   * @param datastoreId The unique identifier of the datastore to retrieve. (required)
   * @param body (required)
   * @return PutAppsDatastoreItemResponseArray
   * @throws ApiException if fails to make API call
   */
  public PutAppsDatastoreItemResponseArray bulkWriteDatastoreItems(
      String datastoreId, BulkPutAppsDatastoreItemsRequest body) throws ApiException {
    return bulkWriteDatastoreItemsWithHttpInfo(datastoreId, body).getData();
  }

  /**
   * Bulk write datastore items.
   *
   * <p>See {@link #bulkWriteDatastoreItemsWithHttpInfoAsync}.
   *
   * @param datastoreId The unique identifier of the datastore to retrieve. (required)
   * @param body (required)
   * @return CompletableFuture&lt;PutAppsDatastoreItemResponseArray&gt;
   */
  public CompletableFuture<PutAppsDatastoreItemResponseArray> bulkWriteDatastoreItemsAsync(
      String datastoreId, BulkPutAppsDatastoreItemsRequest body) {
    return bulkWriteDatastoreItemsWithHttpInfoAsync(datastoreId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Creates or replaces multiple items in a datastore by their keys in a single operation.
   *
   * @param datastoreId The unique identifier of the datastore to retrieve. (required)
   * @param body (required)
   * @return ApiResponse&lt;PutAppsDatastoreItemResponseArray&gt;
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
  public ApiResponse<PutAppsDatastoreItemResponseArray> bulkWriteDatastoreItemsWithHttpInfo(
      String datastoreId, BulkPutAppsDatastoreItemsRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'datastoreId' is set
    if (datastoreId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'datastoreId' when calling bulkWriteDatastoreItems");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling bulkWriteDatastoreItems");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/actions-datastores/{datastore_id}/items/bulk"
            .replaceAll(
                "\\{" + "datastore_id" + "\\}", apiClient.escapeString(datastoreId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ActionsDatastoresApi.bulkWriteDatastoreItems",
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
        new GenericType<PutAppsDatastoreItemResponseArray>() {});
  }

  /**
   * Bulk write datastore items.
   *
   * <p>See {@link #bulkWriteDatastoreItemsWithHttpInfo}.
   *
   * @param datastoreId The unique identifier of the datastore to retrieve. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;PutAppsDatastoreItemResponseArray&gt;&gt;
   */
  public CompletableFuture<ApiResponse<PutAppsDatastoreItemResponseArray>>
      bulkWriteDatastoreItemsWithHttpInfoAsync(
          String datastoreId, BulkPutAppsDatastoreItemsRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'datastoreId' is set
    if (datastoreId == null) {
      CompletableFuture<ApiResponse<PutAppsDatastoreItemResponseArray>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'datastoreId' when calling bulkWriteDatastoreItems"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<PutAppsDatastoreItemResponseArray>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling bulkWriteDatastoreItems"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/actions-datastores/{datastore_id}/items/bulk"
            .replaceAll(
                "\\{" + "datastore_id" + "\\}", apiClient.escapeString(datastoreId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ActionsDatastoresApi.bulkWriteDatastoreItems",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<PutAppsDatastoreItemResponseArray>> result =
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
        new GenericType<PutAppsDatastoreItemResponseArray>() {});
  }

  /**
   * Create datastore.
   *
   * <p>See {@link #createDatastoreWithHttpInfo}.
   *
   * @param body (required)
   * @return CreateAppsDatastoreResponse
   * @throws ApiException if fails to make API call
   */
  public CreateAppsDatastoreResponse createDatastore(CreateAppsDatastoreRequest body)
      throws ApiException {
    return createDatastoreWithHttpInfo(body).getData();
  }

  /**
   * Create datastore.
   *
   * <p>See {@link #createDatastoreWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;CreateAppsDatastoreResponse&gt;
   */
  public CompletableFuture<CreateAppsDatastoreResponse> createDatastoreAsync(
      CreateAppsDatastoreRequest body) {
    return createDatastoreWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Creates a new datastore.
   *
   * @param body (required)
   * @return ApiResponse&lt;CreateAppsDatastoreResponse&gt;
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
  public ApiResponse<CreateAppsDatastoreResponse> createDatastoreWithHttpInfo(
      CreateAppsDatastoreRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createDatastore");
    }
    // create path and map variables
    String localVarPath = "/api/v2/actions-datastores";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ActionsDatastoresApi.createDatastore",
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
        new GenericType<CreateAppsDatastoreResponse>() {});
  }

  /**
   * Create datastore.
   *
   * <p>See {@link #createDatastoreWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CreateAppsDatastoreResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CreateAppsDatastoreResponse>>
      createDatastoreWithHttpInfoAsync(CreateAppsDatastoreRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<CreateAppsDatastoreResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createDatastore"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/actions-datastores";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ActionsDatastoresApi.createDatastore",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CreateAppsDatastoreResponse>> result =
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
        new GenericType<CreateAppsDatastoreResponse>() {});
  }

  /**
   * Delete datastore.
   *
   * <p>See {@link #deleteDatastoreWithHttpInfo}.
   *
   * @param datastoreId The unique identifier of the datastore to retrieve. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteDatastore(String datastoreId) throws ApiException {
    deleteDatastoreWithHttpInfo(datastoreId);
  }

  /**
   * Delete datastore.
   *
   * <p>See {@link #deleteDatastoreWithHttpInfoAsync}.
   *
   * @param datastoreId The unique identifier of the datastore to retrieve. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteDatastoreAsync(String datastoreId) {
    return deleteDatastoreWithHttpInfoAsync(datastoreId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Deletes a datastore by its unique identifier.
   *
   * @param datastoreId The unique identifier of the datastore to retrieve. (required)
   * @return ApiResponse&lt;Void&gt;
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
  public ApiResponse<Void> deleteDatastoreWithHttpInfo(String datastoreId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'datastoreId' is set
    if (datastoreId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'datastoreId' when calling deleteDatastore");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/actions-datastores/{datastore_id}"
            .replaceAll(
                "\\{" + "datastore_id" + "\\}", apiClient.escapeString(datastoreId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ActionsDatastoresApi.deleteDatastore",
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
   * Delete datastore.
   *
   * <p>See {@link #deleteDatastoreWithHttpInfo}.
   *
   * @param datastoreId The unique identifier of the datastore to retrieve. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteDatastoreWithHttpInfoAsync(String datastoreId) {
    Object localVarPostBody = null;

    // verify the required parameter 'datastoreId' is set
    if (datastoreId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'datastoreId' when calling deleteDatastore"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/actions-datastores/{datastore_id}"
            .replaceAll(
                "\\{" + "datastore_id" + "\\}", apiClient.escapeString(datastoreId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ActionsDatastoresApi.deleteDatastore",
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
   * Delete datastore item.
   *
   * <p>See {@link #deleteDatastoreItemWithHttpInfo}.
   *
   * @param datastoreId The unique identifier of the datastore to retrieve. (required)
   * @param body (required)
   * @return DeleteAppsDatastoreItemResponse
   * @throws ApiException if fails to make API call
   */
  public DeleteAppsDatastoreItemResponse deleteDatastoreItem(
      String datastoreId, DeleteAppsDatastoreItemRequest body) throws ApiException {
    return deleteDatastoreItemWithHttpInfo(datastoreId, body).getData();
  }

  /**
   * Delete datastore item.
   *
   * <p>See {@link #deleteDatastoreItemWithHttpInfoAsync}.
   *
   * @param datastoreId The unique identifier of the datastore to retrieve. (required)
   * @param body (required)
   * @return CompletableFuture&lt;DeleteAppsDatastoreItemResponse&gt;
   */
  public CompletableFuture<DeleteAppsDatastoreItemResponse> deleteDatastoreItemAsync(
      String datastoreId, DeleteAppsDatastoreItemRequest body) {
    return deleteDatastoreItemWithHttpInfoAsync(datastoreId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Deletes an item from a datastore by its key.
   *
   * @param datastoreId The unique identifier of the datastore to retrieve. (required)
   * @param body (required)
   * @return ApiResponse&lt;DeleteAppsDatastoreItemResponse&gt;
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
  public ApiResponse<DeleteAppsDatastoreItemResponse> deleteDatastoreItemWithHttpInfo(
      String datastoreId, DeleteAppsDatastoreItemRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'datastoreId' is set
    if (datastoreId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'datastoreId' when calling deleteDatastoreItem");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling deleteDatastoreItem");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/actions-datastores/{datastore_id}/items"
            .replaceAll(
                "\\{" + "datastore_id" + "\\}", apiClient.escapeString(datastoreId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ActionsDatastoresApi.deleteDatastoreItem",
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
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<DeleteAppsDatastoreItemResponse>() {});
  }

  /**
   * Delete datastore item.
   *
   * <p>See {@link #deleteDatastoreItemWithHttpInfo}.
   *
   * @param datastoreId The unique identifier of the datastore to retrieve. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;DeleteAppsDatastoreItemResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<DeleteAppsDatastoreItemResponse>>
      deleteDatastoreItemWithHttpInfoAsync(
          String datastoreId, DeleteAppsDatastoreItemRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'datastoreId' is set
    if (datastoreId == null) {
      CompletableFuture<ApiResponse<DeleteAppsDatastoreItemResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'datastoreId' when calling deleteDatastoreItem"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<DeleteAppsDatastoreItemResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling deleteDatastoreItem"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/actions-datastores/{datastore_id}/items"
            .replaceAll(
                "\\{" + "datastore_id" + "\\}", apiClient.escapeString(datastoreId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ActionsDatastoresApi.deleteDatastoreItem",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<DeleteAppsDatastoreItemResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<DeleteAppsDatastoreItemResponse>() {});
  }

  /**
   * Get datastore.
   *
   * <p>See {@link #getDatastoreWithHttpInfo}.
   *
   * @param datastoreId The unique identifier of the datastore to retrieve. (required)
   * @return Datastore
   * @throws ApiException if fails to make API call
   */
  public Datastore getDatastore(String datastoreId) throws ApiException {
    return getDatastoreWithHttpInfo(datastoreId).getData();
  }

  /**
   * Get datastore.
   *
   * <p>See {@link #getDatastoreWithHttpInfoAsync}.
   *
   * @param datastoreId The unique identifier of the datastore to retrieve. (required)
   * @return CompletableFuture&lt;Datastore&gt;
   */
  public CompletableFuture<Datastore> getDatastoreAsync(String datastoreId) {
    return getDatastoreWithHttpInfoAsync(datastoreId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Retrieves a specific datastore by its ID.
   *
   * @param datastoreId The unique identifier of the datastore to retrieve. (required)
   * @return ApiResponse&lt;Datastore&gt;
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
  public ApiResponse<Datastore> getDatastoreWithHttpInfo(String datastoreId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'datastoreId' is set
    if (datastoreId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'datastoreId' when calling getDatastore");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/actions-datastores/{datastore_id}"
            .replaceAll(
                "\\{" + "datastore_id" + "\\}", apiClient.escapeString(datastoreId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ActionsDatastoresApi.getDatastore",
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
        new GenericType<Datastore>() {});
  }

  /**
   * Get datastore.
   *
   * <p>See {@link #getDatastoreWithHttpInfo}.
   *
   * @param datastoreId The unique identifier of the datastore to retrieve. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Datastore&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Datastore>> getDatastoreWithHttpInfoAsync(
      String datastoreId) {
    Object localVarPostBody = null;

    // verify the required parameter 'datastoreId' is set
    if (datastoreId == null) {
      CompletableFuture<ApiResponse<Datastore>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'datastoreId' when calling getDatastore"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/actions-datastores/{datastore_id}"
            .replaceAll(
                "\\{" + "datastore_id" + "\\}", apiClient.escapeString(datastoreId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ActionsDatastoresApi.getDatastore",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Datastore>> result = new CompletableFuture<>();
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
        new GenericType<Datastore>() {});
  }

  /** Manage optional parameters to listDatastoreItems. */
  public static class ListDatastoreItemsOptionalParameters {
    private String filter;
    private String itemKey;
    private Long pageLimit;
    private Long pageOffset;
    private String sort;

    /**
     * Set filter.
     *
     * @param filter Optional query filter to search items using the <a
     *     href="https://docs.datadoghq.com/logs/explorer/search_syntax/">logs search syntax</a>.
     *     (optional)
     * @return ListDatastoreItemsOptionalParameters
     */
    public ListDatastoreItemsOptionalParameters filter(String filter) {
      this.filter = filter;
      return this;
    }

    /**
     * Set itemKey.
     *
     * @param itemKey Optional primary key value to retrieve a specific item. Cannot be used
     *     together with the filter parameter. (optional)
     * @return ListDatastoreItemsOptionalParameters
     */
    public ListDatastoreItemsOptionalParameters itemKey(String itemKey) {
      this.itemKey = itemKey;
      return this;
    }

    /**
     * Set pageLimit.
     *
     * @param pageLimit Optional field to limit the number of items to return per page for
     *     pagination. Up to 100 items can be returned per page. (optional)
     * @return ListDatastoreItemsOptionalParameters
     */
    public ListDatastoreItemsOptionalParameters pageLimit(Long pageLimit) {
      this.pageLimit = pageLimit;
      return this;
    }

    /**
     * Set pageOffset.
     *
     * @param pageOffset Optional field to offset the number of items to skip from the beginning of
     *     the result set for pagination. (optional)
     * @return ListDatastoreItemsOptionalParameters
     */
    public ListDatastoreItemsOptionalParameters pageOffset(Long pageOffset) {
      this.pageOffset = pageOffset;
      return this;
    }

    /**
     * Set sort.
     *
     * @param sort Optional field to sort results by. Prefix with '-' for descending order (e.g.,
     *     '-created_at'). (optional)
     * @return ListDatastoreItemsOptionalParameters
     */
    public ListDatastoreItemsOptionalParameters sort(String sort) {
      this.sort = sort;
      return this;
    }
  }

  /**
   * List datastore items.
   *
   * <p>See {@link #listDatastoreItemsWithHttpInfo}.
   *
   * @param datastoreId The unique identifier of the datastore to retrieve. (required)
   * @return ItemApiPayloadArray
   * @throws ApiException if fails to make API call
   */
  public ItemApiPayloadArray listDatastoreItems(String datastoreId) throws ApiException {
    return listDatastoreItemsWithHttpInfo(datastoreId, new ListDatastoreItemsOptionalParameters())
        .getData();
  }

  /**
   * List datastore items.
   *
   * <p>See {@link #listDatastoreItemsWithHttpInfoAsync}.
   *
   * @param datastoreId The unique identifier of the datastore to retrieve. (required)
   * @return CompletableFuture&lt;ItemApiPayloadArray&gt;
   */
  public CompletableFuture<ItemApiPayloadArray> listDatastoreItemsAsync(String datastoreId) {
    return listDatastoreItemsWithHttpInfoAsync(
            datastoreId, new ListDatastoreItemsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List datastore items.
   *
   * <p>See {@link #listDatastoreItemsWithHttpInfo}.
   *
   * @param datastoreId The unique identifier of the datastore to retrieve. (required)
   * @param parameters Optional parameters for the request.
   * @return ItemApiPayloadArray
   * @throws ApiException if fails to make API call
   */
  public ItemApiPayloadArray listDatastoreItems(
      String datastoreId, ListDatastoreItemsOptionalParameters parameters) throws ApiException {
    return listDatastoreItemsWithHttpInfo(datastoreId, parameters).getData();
  }

  /**
   * List datastore items.
   *
   * <p>See {@link #listDatastoreItemsWithHttpInfoAsync}.
   *
   * @param datastoreId The unique identifier of the datastore to retrieve. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ItemApiPayloadArray&gt;
   */
  public CompletableFuture<ItemApiPayloadArray> listDatastoreItemsAsync(
      String datastoreId, ListDatastoreItemsOptionalParameters parameters) {
    return listDatastoreItemsWithHttpInfoAsync(datastoreId, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Lists items from a datastore. You can filter the results by specifying either an item key or a
   * filter query parameter, but not both at the same time. Supports server-side pagination for
   * large datasets.
   *
   * @param datastoreId The unique identifier of the datastore to retrieve. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;ItemApiPayloadArray&gt;
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
  public ApiResponse<ItemApiPayloadArray> listDatastoreItemsWithHttpInfo(
      String datastoreId, ListDatastoreItemsOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'datastoreId' is set
    if (datastoreId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'datastoreId' when calling listDatastoreItems");
    }
    String filter = parameters.filter;
    String itemKey = parameters.itemKey;
    Long pageLimit = parameters.pageLimit;
    Long pageOffset = parameters.pageOffset;
    String sort = parameters.sort;
    // create path and map variables
    String localVarPath =
        "/api/v2/actions-datastores/{datastore_id}/items"
            .replaceAll(
                "\\{" + "datastore_id" + "\\}", apiClient.escapeString(datastoreId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "item_key", itemKey));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[offset]", pageOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ActionsDatastoresApi.listDatastoreItems",
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
        new GenericType<ItemApiPayloadArray>() {});
  }

  /**
   * List datastore items.
   *
   * <p>See {@link #listDatastoreItemsWithHttpInfo}.
   *
   * @param datastoreId The unique identifier of the datastore to retrieve. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;ItemApiPayloadArray&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ItemApiPayloadArray>> listDatastoreItemsWithHttpInfoAsync(
      String datastoreId, ListDatastoreItemsOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'datastoreId' is set
    if (datastoreId == null) {
      CompletableFuture<ApiResponse<ItemApiPayloadArray>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'datastoreId' when calling listDatastoreItems"));
      return result;
    }
    String filter = parameters.filter;
    String itemKey = parameters.itemKey;
    Long pageLimit = parameters.pageLimit;
    Long pageOffset = parameters.pageOffset;
    String sort = parameters.sort;
    // create path and map variables
    String localVarPath =
        "/api/v2/actions-datastores/{datastore_id}/items"
            .replaceAll(
                "\\{" + "datastore_id" + "\\}", apiClient.escapeString(datastoreId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "item_key", itemKey));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[offset]", pageOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ActionsDatastoresApi.listDatastoreItems",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ItemApiPayloadArray>> result = new CompletableFuture<>();
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
        new GenericType<ItemApiPayloadArray>() {});
  }

  /**
   * List datastores.
   *
   * <p>See {@link #listDatastoresWithHttpInfo}.
   *
   * @return DatastoreArray
   * @throws ApiException if fails to make API call
   */
  public DatastoreArray listDatastores() throws ApiException {
    return listDatastoresWithHttpInfo().getData();
  }

  /**
   * List datastores.
   *
   * <p>See {@link #listDatastoresWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;DatastoreArray&gt;
   */
  public CompletableFuture<DatastoreArray> listDatastoresAsync() {
    return listDatastoresWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Lists all datastores for the organization.
   *
   * @return ApiResponse&lt;DatastoreArray&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<DatastoreArray> listDatastoresWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/actions-datastores";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ActionsDatastoresApi.listDatastores",
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
        new GenericType<DatastoreArray>() {});
  }

  /**
   * List datastores.
   *
   * <p>See {@link #listDatastoresWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;DatastoreArray&gt;&gt;
   */
  public CompletableFuture<ApiResponse<DatastoreArray>> listDatastoresWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/actions-datastores";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ActionsDatastoresApi.listDatastores",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<DatastoreArray>> result = new CompletableFuture<>();
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
        new GenericType<DatastoreArray>() {});
  }

  /**
   * Update datastore.
   *
   * <p>See {@link #updateDatastoreWithHttpInfo}.
   *
   * @param datastoreId The unique identifier of the datastore to retrieve. (required)
   * @param body (required)
   * @return Datastore
   * @throws ApiException if fails to make API call
   */
  public Datastore updateDatastore(String datastoreId, UpdateAppsDatastoreRequest body)
      throws ApiException {
    return updateDatastoreWithHttpInfo(datastoreId, body).getData();
  }

  /**
   * Update datastore.
   *
   * <p>See {@link #updateDatastoreWithHttpInfoAsync}.
   *
   * @param datastoreId The unique identifier of the datastore to retrieve. (required)
   * @param body (required)
   * @return CompletableFuture&lt;Datastore&gt;
   */
  public CompletableFuture<Datastore> updateDatastoreAsync(
      String datastoreId, UpdateAppsDatastoreRequest body) {
    return updateDatastoreWithHttpInfoAsync(datastoreId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Updates an existing datastore's attributes.
   *
   * @param datastoreId The unique identifier of the datastore to retrieve. (required)
   * @param body (required)
   * @return ApiResponse&lt;Datastore&gt;
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
  public ApiResponse<Datastore> updateDatastoreWithHttpInfo(
      String datastoreId, UpdateAppsDatastoreRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'datastoreId' is set
    if (datastoreId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'datastoreId' when calling updateDatastore");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateDatastore");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/actions-datastores/{datastore_id}"
            .replaceAll(
                "\\{" + "datastore_id" + "\\}", apiClient.escapeString(datastoreId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ActionsDatastoresApi.updateDatastore",
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
        new GenericType<Datastore>() {});
  }

  /**
   * Update datastore.
   *
   * <p>See {@link #updateDatastoreWithHttpInfo}.
   *
   * @param datastoreId The unique identifier of the datastore to retrieve. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Datastore&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Datastore>> updateDatastoreWithHttpInfoAsync(
      String datastoreId, UpdateAppsDatastoreRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'datastoreId' is set
    if (datastoreId == null) {
      CompletableFuture<ApiResponse<Datastore>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'datastoreId' when calling updateDatastore"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Datastore>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateDatastore"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/actions-datastores/{datastore_id}"
            .replaceAll(
                "\\{" + "datastore_id" + "\\}", apiClient.escapeString(datastoreId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ActionsDatastoresApi.updateDatastore",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Datastore>> result = new CompletableFuture<>();
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
        new GenericType<Datastore>() {});
  }

  /**
   * Update datastore item.
   *
   * <p>See {@link #updateDatastoreItemWithHttpInfo}.
   *
   * @param datastoreId The unique identifier of the datastore to retrieve. (required)
   * @param body (required)
   * @return ItemApiPayload
   * @throws ApiException if fails to make API call
   */
  public ItemApiPayload updateDatastoreItem(String datastoreId, UpdateAppsDatastoreItemRequest body)
      throws ApiException {
    return updateDatastoreItemWithHttpInfo(datastoreId, body).getData();
  }

  /**
   * Update datastore item.
   *
   * <p>See {@link #updateDatastoreItemWithHttpInfoAsync}.
   *
   * @param datastoreId The unique identifier of the datastore to retrieve. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ItemApiPayload&gt;
   */
  public CompletableFuture<ItemApiPayload> updateDatastoreItemAsync(
      String datastoreId, UpdateAppsDatastoreItemRequest body) {
    return updateDatastoreItemWithHttpInfoAsync(datastoreId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Partially updates an item in a datastore by its key.
   *
   * @param datastoreId The unique identifier of the datastore to retrieve. (required)
   * @param body (required)
   * @return ApiResponse&lt;ItemApiPayload&gt;
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
  public ApiResponse<ItemApiPayload> updateDatastoreItemWithHttpInfo(
      String datastoreId, UpdateAppsDatastoreItemRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'datastoreId' is set
    if (datastoreId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'datastoreId' when calling updateDatastoreItem");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateDatastoreItem");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/actions-datastores/{datastore_id}/items"
            .replaceAll(
                "\\{" + "datastore_id" + "\\}", apiClient.escapeString(datastoreId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ActionsDatastoresApi.updateDatastoreItem",
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
        new GenericType<ItemApiPayload>() {});
  }

  /**
   * Update datastore item.
   *
   * <p>See {@link #updateDatastoreItemWithHttpInfo}.
   *
   * @param datastoreId The unique identifier of the datastore to retrieve. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ItemApiPayload&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ItemApiPayload>> updateDatastoreItemWithHttpInfoAsync(
      String datastoreId, UpdateAppsDatastoreItemRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'datastoreId' is set
    if (datastoreId == null) {
      CompletableFuture<ApiResponse<ItemApiPayload>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'datastoreId' when calling updateDatastoreItem"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<ItemApiPayload>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateDatastoreItem"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/actions-datastores/{datastore_id}/items"
            .replaceAll(
                "\\{" + "datastore_id" + "\\}", apiClient.escapeString(datastoreId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ActionsDatastoresApi.updateDatastoreItem",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ItemApiPayload>> result = new CompletableFuture<>();
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
        new GenericType<ItemApiPayload>() {});
  }
}
