package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.BulkPutAppsDatastoreItemsRequest;
import com.datadog.api.client.v2.model.CreateAppsDatastoreFromImportRequest;
import com.datadog.api.client.v2.model.CreateAppsDatastoreFromImportResponse;
import com.datadog.api.client.v2.model.CreateAppsDatastoreRequest;
import com.datadog.api.client.v2.model.CreateAppsDatastoreResponse;
import com.datadog.api.client.v2.model.Datastore;
import com.datadog.api.client.v2.model.DatastoreArray;
import com.datadog.api.client.v2.model.DeleteAppsDatastoreItemRequest;
import com.datadog.api.client.v2.model.DeleteAppsDatastoreItemResponse;
import com.datadog.api.client.v2.model.ItemApiPayloadArray;
import com.datadog.api.client.v2.model.PutAppsDatastoreItemRequest;
import com.datadog.api.client.v2.model.PutAppsDatastoreItemResponse;
import com.datadog.api.client.v2.model.PutAppsDatastoreItemResponseArray;
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
   * Bulk put datastore items.
   *
   * <p>See {@link #bulkPutDatastoreItemsWithHttpInfo}.
   *
   * @param datastoreId The ID of the datastore. (required)
   * @param body (required)
   * @return PutAppsDatastoreItemResponseArray
   * @throws ApiException if fails to make API call
   */
  public PutAppsDatastoreItemResponseArray bulkPutDatastoreItems(
      String datastoreId, BulkPutAppsDatastoreItemsRequest body) throws ApiException {
    return bulkPutDatastoreItemsWithHttpInfo(datastoreId, body).getData();
  }

  /**
   * Bulk put datastore items.
   *
   * <p>See {@link #bulkPutDatastoreItemsWithHttpInfoAsync}.
   *
   * @param datastoreId The ID of the datastore. (required)
   * @param body (required)
   * @return CompletableFuture&lt;PutAppsDatastoreItemResponseArray&gt;
   */
  public CompletableFuture<PutAppsDatastoreItemResponseArray> bulkPutDatastoreItemsAsync(
      String datastoreId, BulkPutAppsDatastoreItemsRequest body) {
    return bulkPutDatastoreItemsWithHttpInfoAsync(datastoreId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Creates or replaces multiple items in a datastore by their keys in a single operation.
   *
   * @param datastoreId The ID of the datastore. (required)
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
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<PutAppsDatastoreItemResponseArray> bulkPutDatastoreItemsWithHttpInfo(
      String datastoreId, BulkPutAppsDatastoreItemsRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'datastoreId' is set
    if (datastoreId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'datastoreId' when calling bulkPutDatastoreItems");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling bulkPutDatastoreItems");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/actions-datastores/{datastore_id}/items/bulk"
            .replaceAll(
                "\\{" + "datastore_id" + "\\}", apiClient.escapeString(datastoreId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ActionsDatastoresApi.bulkPutDatastoreItems",
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
   * Bulk put datastore items.
   *
   * <p>See {@link #bulkPutDatastoreItemsWithHttpInfo}.
   *
   * @param datastoreId The ID of the datastore. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;PutAppsDatastoreItemResponseArray&gt;&gt;
   */
  public CompletableFuture<ApiResponse<PutAppsDatastoreItemResponseArray>>
      bulkPutDatastoreItemsWithHttpInfoAsync(
          String datastoreId, BulkPutAppsDatastoreItemsRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'datastoreId' is set
    if (datastoreId == null) {
      CompletableFuture<ApiResponse<PutAppsDatastoreItemResponseArray>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'datastoreId' when calling bulkPutDatastoreItems"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<PutAppsDatastoreItemResponseArray>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling bulkPutDatastoreItems"));
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
              "v2.ActionsDatastoresApi.bulkPutDatastoreItems",
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
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
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
   * Create datastore from import.
   *
   * <p>See {@link #createDatastoreFromImportWithHttpInfo}.
   *
   * @param body (required)
   * @return CreateAppsDatastoreFromImportResponse
   * @throws ApiException if fails to make API call
   */
  public CreateAppsDatastoreFromImportResponse createDatastoreFromImport(
      CreateAppsDatastoreFromImportRequest body) throws ApiException {
    return createDatastoreFromImportWithHttpInfo(body).getData();
  }

  /**
   * Create datastore from import.
   *
   * <p>See {@link #createDatastoreFromImportWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;CreateAppsDatastoreFromImportResponse&gt;
   */
  public CompletableFuture<CreateAppsDatastoreFromImportResponse> createDatastoreFromImportAsync(
      CreateAppsDatastoreFromImportRequest body) {
    return createDatastoreFromImportWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Creates a new datastore and populates it with items from the provided data.
   *
   * @param body (required)
   * @return ApiResponse&lt;CreateAppsDatastoreFromImportResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CreateAppsDatastoreFromImportResponse> createDatastoreFromImportWithHttpInfo(
      CreateAppsDatastoreFromImportRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createDatastoreFromImport");
    }
    // create path and map variables
    String localVarPath = "/api/v2/actions-datastores/import";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ActionsDatastoresApi.createDatastoreFromImport",
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
        new GenericType<CreateAppsDatastoreFromImportResponse>() {});
  }

  /**
   * Create datastore from import.
   *
   * <p>See {@link #createDatastoreFromImportWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CreateAppsDatastoreFromImportResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CreateAppsDatastoreFromImportResponse>>
      createDatastoreFromImportWithHttpInfoAsync(CreateAppsDatastoreFromImportRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<CreateAppsDatastoreFromImportResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createDatastoreFromImport"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/actions-datastores/import";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ActionsDatastoresApi.createDatastoreFromImport",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CreateAppsDatastoreFromImportResponse>> result =
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
        new GenericType<CreateAppsDatastoreFromImportResponse>() {});
  }

  /**
   * Delete datastore.
   *
   * <p>See {@link #deleteDatastoreWithHttpInfo}.
   *
   * @param datastoreId The ID of the datastore. (required)
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
   * @param datastoreId The ID of the datastore. (required)
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
   * Deletes a datastore by its ID.
   *
   * @param datastoreId The ID of the datastore. (required)
   * @return ApiResponse&lt;Void&gt;
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
   * @param datastoreId The ID of the datastore. (required)
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
   * @param datastoreId The ID of the datastore. (required)
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
   * @param datastoreId The ID of the datastore. (required)
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
   * @param datastoreId The ID of the datastore. (required)
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
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
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
   * @param datastoreId The ID of the datastore. (required)
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
   * @param datastoreId The ID of the datastore. (required)
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
   * @param datastoreId The ID of the datastore. (required)
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
   * @param datastoreId The ID of the datastore. (required)
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
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
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
   * @param datastoreId The ID of the datastore. (required)
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
     * @param filter Optional filter to filter the list of items. (optional)
     * @return ListDatastoreItemsOptionalParameters
     */
    public ListDatastoreItemsOptionalParameters filter(String filter) {
      this.filter = filter;
      return this;
    }

    /**
     * Set itemKey.
     *
     * @param itemKey Optional item key to filter the list of items. (optional)
     * @return ListDatastoreItemsOptionalParameters
     */
    public ListDatastoreItemsOptionalParameters itemKey(String itemKey) {
      this.itemKey = itemKey;
      return this;
    }

    /**
     * Set pageLimit.
     *
     * @param pageLimit Optional limit to limit the number of items in the list. (optional)
     * @return ListDatastoreItemsOptionalParameters
     */
    public ListDatastoreItemsOptionalParameters pageLimit(Long pageLimit) {
      this.pageLimit = pageLimit;
      return this;
    }

    /**
     * Set pageOffset.
     *
     * @param pageOffset Optional offset to offset the list of items. (optional)
     * @return ListDatastoreItemsOptionalParameters
     */
    public ListDatastoreItemsOptionalParameters pageOffset(Long pageOffset) {
      this.pageOffset = pageOffset;
      return this;
    }

    /**
     * Set sort.
     *
     * @param sort Optional sort to sort the list of items. (optional)
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
   * @param datastoreId The ID of the datastore. (required)
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
   * @param datastoreId The ID of the datastore. (required)
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
   * @param datastoreId The ID of the datastore. (required)
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
   * @param datastoreId The ID of the datastore. (required)
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
   * filter query parameter, but not both at the same time.
   *
   * @param datastoreId The ID of the datastore. (required)
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
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
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
   * @param datastoreId The ID of the datastore. (required)
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
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
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
   * Put datastore item.
   *
   * <p>See {@link #putDatastoreItemWithHttpInfo}.
   *
   * @param datastoreId The ID of the datastore. (required)
   * @param body (required)
   * @return PutAppsDatastoreItemResponse
   * @throws ApiException if fails to make API call
   */
  public PutAppsDatastoreItemResponse putDatastoreItem(
      String datastoreId, PutAppsDatastoreItemRequest body) throws ApiException {
    return putDatastoreItemWithHttpInfo(datastoreId, body).getData();
  }

  /**
   * Put datastore item.
   *
   * <p>See {@link #putDatastoreItemWithHttpInfoAsync}.
   *
   * @param datastoreId The ID of the datastore. (required)
   * @param body (required)
   * @return CompletableFuture&lt;PutAppsDatastoreItemResponse&gt;
   */
  public CompletableFuture<PutAppsDatastoreItemResponse> putDatastoreItemAsync(
      String datastoreId, PutAppsDatastoreItemRequest body) {
    return putDatastoreItemWithHttpInfoAsync(datastoreId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Creates or replaces an item in a datastore by its key.
   *
   * @param datastoreId The ID of the datastore. (required)
   * @param body (required)
   * @return ApiResponse&lt;PutAppsDatastoreItemResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<PutAppsDatastoreItemResponse> putDatastoreItemWithHttpInfo(
      String datastoreId, PutAppsDatastoreItemRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'datastoreId' is set
    if (datastoreId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'datastoreId' when calling putDatastoreItem");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling putDatastoreItem");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/actions-datastores/{datastore_id}/items"
            .replaceAll(
                "\\{" + "datastore_id" + "\\}", apiClient.escapeString(datastoreId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ActionsDatastoresApi.putDatastoreItem",
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
        new GenericType<PutAppsDatastoreItemResponse>() {});
  }

  /**
   * Put datastore item.
   *
   * <p>See {@link #putDatastoreItemWithHttpInfo}.
   *
   * @param datastoreId The ID of the datastore. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;PutAppsDatastoreItemResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<PutAppsDatastoreItemResponse>>
      putDatastoreItemWithHttpInfoAsync(String datastoreId, PutAppsDatastoreItemRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'datastoreId' is set
    if (datastoreId == null) {
      CompletableFuture<ApiResponse<PutAppsDatastoreItemResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'datastoreId' when calling putDatastoreItem"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<PutAppsDatastoreItemResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling putDatastoreItem"));
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
              "v2.ActionsDatastoresApi.putDatastoreItem",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<PutAppsDatastoreItemResponse>> result =
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
        new GenericType<PutAppsDatastoreItemResponse>() {});
  }

  /**
   * Update datastore.
   *
   * <p>See {@link #updateDatastoreWithHttpInfo}.
   *
   * @param datastoreId The ID of the datastore. (required)
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
   * @param datastoreId The ID of the datastore. (required)
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
   * @param datastoreId The ID of the datastore. (required)
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
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
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
   * @param datastoreId The ID of the datastore. (required)
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
}
