package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.DatasetCreateRequest;
import com.datadog.api.client.v2.model.DatasetResponseMulti;
import com.datadog.api.client.v2.model.DatasetResponseSingle;
import com.datadog.api.client.v2.model.DatasetUpdateRequest;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DatasetsApi {
  private ApiClient apiClient;

  public DatasetsApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public DatasetsApi(ApiClient apiClient) {
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
   * Create a dataset.
   *
   * <p>See {@link #createDatasetWithHttpInfo}.
   *
   * @param body Dataset payload (required)
   * @return DatasetResponseSingle
   * @throws ApiException if fails to make API call
   */
  public DatasetResponseSingle createDataset(DatasetCreateRequest body) throws ApiException {
    return createDatasetWithHttpInfo(body).getData();
  }

  /**
   * Create a dataset.
   *
   * <p>See {@link #createDatasetWithHttpInfoAsync}.
   *
   * @param body Dataset payload (required)
   * @return CompletableFuture&lt;DatasetResponseSingle&gt;
   */
  public CompletableFuture<DatasetResponseSingle> createDatasetAsync(DatasetCreateRequest body) {
    return createDatasetWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a dataset with the configurations in the request.
   *
   * @param body Dataset payload (required)
   * @return ApiResponse&lt;DatasetResponseSingle&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<DatasetResponseSingle> createDatasetWithHttpInfo(DatasetCreateRequest body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createDataset");
    }
    // create path and map variables
    String localVarPath = "/api/v2/datasets";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.DatasetsApi.createDataset",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<DatasetResponseSingle>() {});
  }

  /**
   * Create a dataset.
   *
   * <p>See {@link #createDatasetWithHttpInfo}.
   *
   * @param body Dataset payload (required)
   * @return CompletableFuture&lt;ApiResponse&lt;DatasetResponseSingle&gt;&gt;
   */
  public CompletableFuture<ApiResponse<DatasetResponseSingle>> createDatasetWithHttpInfoAsync(
      DatasetCreateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<DatasetResponseSingle>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createDataset"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/datasets";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.DatasetsApi.createDataset",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<DatasetResponseSingle>> result = new CompletableFuture<>();
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
        new GenericType<DatasetResponseSingle>() {});
  }

  /**
   * Delete a dataset.
   *
   * <p>See {@link #deleteDatasetWithHttpInfo}.
   *
   * @param datasetId The ID of a defined dataset. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteDataset(String datasetId) throws ApiException {
    deleteDatasetWithHttpInfo(datasetId);
  }

  /**
   * Delete a dataset.
   *
   * <p>See {@link #deleteDatasetWithHttpInfoAsync}.
   *
   * @param datasetId The ID of a defined dataset. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteDatasetAsync(String datasetId) {
    return deleteDatasetWithHttpInfoAsync(datasetId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Deletes the dataset associated with the ID.
   *
   * @param datasetId The ID of a defined dataset. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteDatasetWithHttpInfo(String datasetId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'datasetId' is set
    if (datasetId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'datasetId' when calling deleteDataset");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/datasets/{dataset_id}"
            .replaceAll("\\{" + "dataset_id" + "\\}", apiClient.escapeString(datasetId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.DatasetsApi.deleteDataset",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
   * Delete a dataset.
   *
   * <p>See {@link #deleteDatasetWithHttpInfo}.
   *
   * @param datasetId The ID of a defined dataset. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteDatasetWithHttpInfoAsync(String datasetId) {
    Object localVarPostBody = null;

    // verify the required parameter 'datasetId' is set
    if (datasetId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'datasetId' when calling deleteDataset"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/datasets/{dataset_id}"
            .replaceAll("\\{" + "dataset_id" + "\\}", apiClient.escapeString(datasetId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.DatasetsApi.deleteDataset",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"*/*"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
   * Get all datasets.
   *
   * <p>See {@link #getAllDatasetsWithHttpInfo}.
   *
   * @return DatasetResponseMulti
   * @throws ApiException if fails to make API call
   */
  public DatasetResponseMulti getAllDatasets() throws ApiException {
    return getAllDatasetsWithHttpInfo().getData();
  }

  /**
   * Get all datasets.
   *
   * <p>See {@link #getAllDatasetsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;DatasetResponseMulti&gt;
   */
  public CompletableFuture<DatasetResponseMulti> getAllDatasetsAsync() {
    return getAllDatasetsWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get all datasets that have been configured for an organization.
   *
   * @return ApiResponse&lt;DatasetResponseMulti&gt;
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
  public ApiResponse<DatasetResponseMulti> getAllDatasetsWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/datasets";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.DatasetsApi.getAllDatasets",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<DatasetResponseMulti>() {});
  }

  /**
   * Get all datasets.
   *
   * <p>See {@link #getAllDatasetsWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;DatasetResponseMulti&gt;&gt;
   */
  public CompletableFuture<ApiResponse<DatasetResponseMulti>> getAllDatasetsWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/datasets";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.DatasetsApi.getAllDatasets",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<DatasetResponseMulti>> result = new CompletableFuture<>();
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
        new GenericType<DatasetResponseMulti>() {});
  }

  /**
   * Get a single dataset by ID.
   *
   * <p>See {@link #getDatasetWithHttpInfo}.
   *
   * @param datasetId The ID of a defined dataset. (required)
   * @return DatasetResponseSingle
   * @throws ApiException if fails to make API call
   */
  public DatasetResponseSingle getDataset(String datasetId) throws ApiException {
    return getDatasetWithHttpInfo(datasetId).getData();
  }

  /**
   * Get a single dataset by ID.
   *
   * <p>See {@link #getDatasetWithHttpInfoAsync}.
   *
   * @param datasetId The ID of a defined dataset. (required)
   * @return CompletableFuture&lt;DatasetResponseSingle&gt;
   */
  public CompletableFuture<DatasetResponseSingle> getDatasetAsync(String datasetId) {
    return getDatasetWithHttpInfoAsync(datasetId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Retrieves the dataset associated with the ID.
   *
   * @param datasetId The ID of a defined dataset. (required)
   * @return ApiResponse&lt;DatasetResponseSingle&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<DatasetResponseSingle> getDatasetWithHttpInfo(String datasetId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'datasetId' is set
    if (datasetId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'datasetId' when calling getDataset");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/datasets/{dataset_id}"
            .replaceAll("\\{" + "dataset_id" + "\\}", apiClient.escapeString(datasetId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.DatasetsApi.getDataset",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<DatasetResponseSingle>() {});
  }

  /**
   * Get a single dataset by ID.
   *
   * <p>See {@link #getDatasetWithHttpInfo}.
   *
   * @param datasetId The ID of a defined dataset. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;DatasetResponseSingle&gt;&gt;
   */
  public CompletableFuture<ApiResponse<DatasetResponseSingle>> getDatasetWithHttpInfoAsync(
      String datasetId) {
    Object localVarPostBody = null;

    // verify the required parameter 'datasetId' is set
    if (datasetId == null) {
      CompletableFuture<ApiResponse<DatasetResponseSingle>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'datasetId' when calling getDataset"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/datasets/{dataset_id}"
            .replaceAll("\\{" + "dataset_id" + "\\}", apiClient.escapeString(datasetId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.DatasetsApi.getDataset",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<DatasetResponseSingle>> result = new CompletableFuture<>();
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
        new GenericType<DatasetResponseSingle>() {});
  }

  /**
   * Edit a dataset.
   *
   * <p>See {@link #updateDatasetWithHttpInfo}.
   *
   * @param datasetId The ID of a defined dataset. (required)
   * @param body Dataset payload (required)
   * @return DatasetResponseSingle
   * @throws ApiException if fails to make API call
   */
  public DatasetResponseSingle updateDataset(String datasetId, DatasetUpdateRequest body)
      throws ApiException {
    return updateDatasetWithHttpInfo(datasetId, body).getData();
  }

  /**
   * Edit a dataset.
   *
   * <p>See {@link #updateDatasetWithHttpInfoAsync}.
   *
   * @param datasetId The ID of a defined dataset. (required)
   * @param body Dataset payload (required)
   * @return CompletableFuture&lt;DatasetResponseSingle&gt;
   */
  public CompletableFuture<DatasetResponseSingle> updateDatasetAsync(
      String datasetId, DatasetUpdateRequest body) {
    return updateDatasetWithHttpInfoAsync(datasetId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Edits the dataset associated with the ID.
   *
   * @param datasetId The ID of a defined dataset. (required)
   * @param body Dataset payload (required)
   * @return ApiResponse&lt;DatasetResponseSingle&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<DatasetResponseSingle> updateDatasetWithHttpInfo(
      String datasetId, DatasetUpdateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'datasetId' is set
    if (datasetId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'datasetId' when calling updateDataset");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateDataset");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/datasets/{dataset_id}"
            .replaceAll("\\{" + "dataset_id" + "\\}", apiClient.escapeString(datasetId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.DatasetsApi.updateDataset",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "PUT",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<DatasetResponseSingle>() {});
  }

  /**
   * Edit a dataset.
   *
   * <p>See {@link #updateDatasetWithHttpInfo}.
   *
   * @param datasetId The ID of a defined dataset. (required)
   * @param body Dataset payload (required)
   * @return CompletableFuture&lt;ApiResponse&lt;DatasetResponseSingle&gt;&gt;
   */
  public CompletableFuture<ApiResponse<DatasetResponseSingle>> updateDatasetWithHttpInfoAsync(
      String datasetId, DatasetUpdateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'datasetId' is set
    if (datasetId == null) {
      CompletableFuture<ApiResponse<DatasetResponseSingle>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'datasetId' when calling updateDataset"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<DatasetResponseSingle>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateDataset"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/datasets/{dataset_id}"
            .replaceAll("\\{" + "dataset_id" + "\\}", apiClient.escapeString(datasetId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.DatasetsApi.updateDataset",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<DatasetResponseSingle>> result = new CompletableFuture<>();
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
        new GenericType<DatasetResponseSingle>() {});
  }
}
