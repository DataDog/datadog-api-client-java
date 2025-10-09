package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.CreateTableRequest;
import com.datadog.api.client.v2.model.CreateUploadRequest;
import com.datadog.api.client.v2.model.CreateUploadResponse;
import com.datadog.api.client.v2.model.PatchTableRequest;
import com.datadog.api.client.v2.model.ReferenceTableSortType;
import com.datadog.api.client.v2.model.TableResultV2;
import com.datadog.api.client.v2.model.TableResultV2Array;
import com.datadog.api.client.v2.model.TableRowResourceArray;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ReferenceTablesApi {
  private ApiClient apiClient;

  public ReferenceTablesApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public ReferenceTablesApi(ApiClient apiClient) {
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
   * Create reference table.
   *
   * <p>See {@link #createReferenceTableWithHttpInfo}.
   *
   * @param body (required)
   * @return TableResultV2
   * @throws ApiException if fails to make API call
   */
  public TableResultV2 createReferenceTable(CreateTableRequest body) throws ApiException {
    return createReferenceTableWithHttpInfo(body).getData();
  }

  /**
   * Create reference table.
   *
   * <p>See {@link #createReferenceTableWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;TableResultV2&gt;
   */
  public CompletableFuture<TableResultV2> createReferenceTableAsync(CreateTableRequest body) {
    return createReferenceTableWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a new reference table. You can provide data in two ways: 1) Call POST
   * api/v2/reference-tables/upload first to get an upload ID, then PUT chunks of CSV data to each
   * provided URL, and finally call this POST endpoint with the upload_id in file_metadata, OR 2)
   * Provide access_details in file_metadata pointing to a CSV file in cloud storage (Amazon S3,
   * Azure Blob Storage, or GCP Cloud Storage).
   *
   * @param body (required)
   * @return ApiResponse&lt;TableResultV2&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<TableResultV2> createReferenceTableWithHttpInfo(CreateTableRequest body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createReferenceTable");
    }
    // create path and map variables
    String localVarPath = "/api/v2/reference-tables/tables";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ReferenceTablesApi.createReferenceTable",
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
        new GenericType<TableResultV2>() {});
  }

  /**
   * Create reference table.
   *
   * <p>See {@link #createReferenceTableWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;TableResultV2&gt;&gt;
   */
  public CompletableFuture<ApiResponse<TableResultV2>> createReferenceTableWithHttpInfoAsync(
      CreateTableRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<TableResultV2>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createReferenceTable"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/reference-tables/tables";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ReferenceTablesApi.createReferenceTable",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<TableResultV2>> result = new CompletableFuture<>();
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
        new GenericType<TableResultV2>() {});
  }

  /**
   * Create reference table upload.
   *
   * <p>See {@link #createReferenceTableUploadWithHttpInfo}.
   *
   * @param body (required)
   * @return CreateUploadResponse
   * @throws ApiException if fails to make API call
   */
  public CreateUploadResponse createReferenceTableUpload(CreateUploadRequest body)
      throws ApiException {
    return createReferenceTableUploadWithHttpInfo(body).getData();
  }

  /**
   * Create reference table upload.
   *
   * <p>See {@link #createReferenceTableUploadWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;CreateUploadResponse&gt;
   */
  public CompletableFuture<CreateUploadResponse> createReferenceTableUploadAsync(
      CreateUploadRequest body) {
    return createReferenceTableUploadWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a reference table upload for bulk data ingestion
   *
   * @param body (required)
   * @return ApiResponse&lt;CreateUploadResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CreateUploadResponse> createReferenceTableUploadWithHttpInfo(
      CreateUploadRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createReferenceTableUpload");
    }
    // create path and map variables
    String localVarPath = "/api/v2/reference-tables/uploads";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ReferenceTablesApi.createReferenceTableUpload",
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
        new GenericType<CreateUploadResponse>() {});
  }

  /**
   * Create reference table upload.
   *
   * <p>See {@link #createReferenceTableUploadWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CreateUploadResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CreateUploadResponse>>
      createReferenceTableUploadWithHttpInfoAsync(CreateUploadRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<CreateUploadResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling createReferenceTableUpload"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/reference-tables/uploads";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ReferenceTablesApi.createReferenceTableUpload",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CreateUploadResponse>> result = new CompletableFuture<>();
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
        new GenericType<CreateUploadResponse>() {});
  }

  /**
   * Delete table.
   *
   * <p>See {@link #deleteTableWithHttpInfo}.
   *
   * @param id The ID of the reference table to delete (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteTable(String id) throws ApiException {
    deleteTableWithHttpInfo(id);
  }

  /**
   * Delete table.
   *
   * <p>See {@link #deleteTableWithHttpInfoAsync}.
   *
   * @param id The ID of the reference table to delete (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteTableAsync(String id) {
    return deleteTableWithHttpInfoAsync(id)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete a reference table by ID
   *
   * @param id The ID of the reference table to delete (required)
   * @return ApiResponse&lt;Void&gt;
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
  public ApiResponse<Void> deleteTableWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteTable");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/reference-tables/tables/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ReferenceTablesApi.deleteTable",
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
   * Delete table.
   *
   * <p>See {@link #deleteTableWithHttpInfo}.
   *
   * @param id The ID of the reference table to delete (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteTableWithHttpInfoAsync(String id) {
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'id' when calling deleteTable"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/reference-tables/tables/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ReferenceTablesApi.deleteTable",
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
   * Get rows by id.
   *
   * <p>See {@link #getRowsByIDWithHttpInfo}.
   *
   * @param id The ID of the reference table (required)
   * @param rowId List of row IDs (primary key values) to retrieve from the reference table.
   *     (required)
   * @return TableRowResourceArray
   * @throws ApiException if fails to make API call
   */
  public TableRowResourceArray getRowsByID(String id, List<String> rowId) throws ApiException {
    return getRowsByIDWithHttpInfo(id, rowId).getData();
  }

  /**
   * Get rows by id.
   *
   * <p>See {@link #getRowsByIDWithHttpInfoAsync}.
   *
   * @param id The ID of the reference table (required)
   * @param rowId List of row IDs (primary key values) to retrieve from the reference table.
   *     (required)
   * @return CompletableFuture&lt;TableRowResourceArray&gt;
   */
  public CompletableFuture<TableRowResourceArray> getRowsByIDAsync(String id, List<String> rowId) {
    return getRowsByIDWithHttpInfoAsync(id, rowId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get reference table rows by their primary key values.
   *
   * @param id The ID of the reference table (required)
   * @param rowId List of row IDs (primary key values) to retrieve from the reference table.
   *     (required)
   * @return ApiResponse&lt;TableRowResourceArray&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> Some or all requested rows were found. </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<TableRowResourceArray> getRowsByIDWithHttpInfo(String id, List<String> rowId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getRowsByID");
    }

    // verify the required parameter 'rowId' is set
    if (rowId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'rowId' when calling getRowsByID");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/reference-tables/tables/{id}/rows"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "row_id", rowId));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ReferenceTablesApi.getRowsByID",
            localVarPath,
            localVarQueryParams,
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
        new GenericType<TableRowResourceArray>() {});
  }

  /**
   * Get rows by id.
   *
   * <p>See {@link #getRowsByIDWithHttpInfo}.
   *
   * @param id The ID of the reference table (required)
   * @param rowId List of row IDs (primary key values) to retrieve from the reference table.
   *     (required)
   * @return CompletableFuture&lt;ApiResponse&lt;TableRowResourceArray&gt;&gt;
   */
  public CompletableFuture<ApiResponse<TableRowResourceArray>> getRowsByIDWithHttpInfoAsync(
      String id, List<String> rowId) {
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
      CompletableFuture<ApiResponse<TableRowResourceArray>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'id' when calling getRowsByID"));
      return result;
    }

    // verify the required parameter 'rowId' is set
    if (rowId == null) {
      CompletableFuture<ApiResponse<TableRowResourceArray>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'rowId' when calling getRowsByID"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/reference-tables/tables/{id}/rows"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "row_id", rowId));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ReferenceTablesApi.getRowsByID",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<TableRowResourceArray>> result = new CompletableFuture<>();
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
        new GenericType<TableRowResourceArray>() {});
  }

  /**
   * Get table.
   *
   * <p>See {@link #getTableWithHttpInfo}.
   *
   * @param id The ID of the reference table to retrieve (required)
   * @return TableResultV2
   * @throws ApiException if fails to make API call
   */
  public TableResultV2 getTable(String id) throws ApiException {
    return getTableWithHttpInfo(id).getData();
  }

  /**
   * Get table.
   *
   * <p>See {@link #getTableWithHttpInfoAsync}.
   *
   * @param id The ID of the reference table to retrieve (required)
   * @return CompletableFuture&lt;TableResultV2&gt;
   */
  public CompletableFuture<TableResultV2> getTableAsync(String id) {
    return getTableWithHttpInfoAsync(id)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a reference table by ID
   *
   * @param id The ID of the reference table to retrieve (required)
   * @return ApiResponse&lt;TableResultV2&gt;
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
  public ApiResponse<TableResultV2> getTableWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getTable");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/reference-tables/tables/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ReferenceTablesApi.getTable",
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
        new GenericType<TableResultV2>() {});
  }

  /**
   * Get table.
   *
   * <p>See {@link #getTableWithHttpInfo}.
   *
   * @param id The ID of the reference table to retrieve (required)
   * @return CompletableFuture&lt;ApiResponse&lt;TableResultV2&gt;&gt;
   */
  public CompletableFuture<ApiResponse<TableResultV2>> getTableWithHttpInfoAsync(String id) {
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
      CompletableFuture<ApiResponse<TableResultV2>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'id' when calling getTable"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/reference-tables/tables/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ReferenceTablesApi.getTable",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<TableResultV2>> result = new CompletableFuture<>();
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
        new GenericType<TableResultV2>() {});
  }

  /** Manage optional parameters to listTables. */
  public static class ListTablesOptionalParameters {
    private Long limit;
    private Long offset;
    private ReferenceTableSortType sort;
    private String filterStatus;
    private String filterTableNameExact;
    private String filterTableNameContains;

    /**
     * Set limit.
     *
     * @param limit Number of tables to return. (optional, default to 15)
     * @return ListTablesOptionalParameters
     */
    public ListTablesOptionalParameters limit(Long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set offset.
     *
     * @param offset Number of tables to skip for pagination. (optional, default to 0)
     * @return ListTablesOptionalParameters
     */
    public ListTablesOptionalParameters offset(Long offset) {
      this.offset = offset;
      return this;
    }

    /**
     * Set sort.
     *
     * @param sort Sort field and direction. Use field name for ascending, prefix with "-" for
     *     descending. (optional, default to "-updated_at")
     * @return ListTablesOptionalParameters
     */
    public ListTablesOptionalParameters sort(ReferenceTableSortType sort) {
      this.sort = sort;
      return this;
    }

    /**
     * Set filterStatus.
     *
     * @param filterStatus Filter by table status. (optional)
     * @return ListTablesOptionalParameters
     */
    public ListTablesOptionalParameters filterStatus(String filterStatus) {
      this.filterStatus = filterStatus;
      return this;
    }

    /**
     * Set filterTableNameExact.
     *
     * @param filterTableNameExact Filter by exact table name match. (optional)
     * @return ListTablesOptionalParameters
     */
    public ListTablesOptionalParameters filterTableNameExact(String filterTableNameExact) {
      this.filterTableNameExact = filterTableNameExact;
      return this;
    }

    /**
     * Set filterTableNameContains.
     *
     * @param filterTableNameContains Filter by table name containing substring. (optional)
     * @return ListTablesOptionalParameters
     */
    public ListTablesOptionalParameters filterTableNameContains(String filterTableNameContains) {
      this.filterTableNameContains = filterTableNameContains;
      return this;
    }
  }

  /**
   * List tables.
   *
   * <p>See {@link #listTablesWithHttpInfo}.
   *
   * @return TableResultV2Array
   * @throws ApiException if fails to make API call
   */
  public TableResultV2Array listTables() throws ApiException {
    return listTablesWithHttpInfo(new ListTablesOptionalParameters()).getData();
  }

  /**
   * List tables.
   *
   * <p>See {@link #listTablesWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;TableResultV2Array&gt;
   */
  public CompletableFuture<TableResultV2Array> listTablesAsync() {
    return listTablesWithHttpInfoAsync(new ListTablesOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List tables.
   *
   * <p>See {@link #listTablesWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return TableResultV2Array
   * @throws ApiException if fails to make API call
   */
  public TableResultV2Array listTables(ListTablesOptionalParameters parameters)
      throws ApiException {
    return listTablesWithHttpInfo(parameters).getData();
  }

  /**
   * List tables.
   *
   * <p>See {@link #listTablesWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;TableResultV2Array&gt;
   */
  public CompletableFuture<TableResultV2Array> listTablesAsync(
      ListTablesOptionalParameters parameters) {
    return listTablesWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List all reference tables in this organization.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;TableResultV2Array&gt;
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
  public ApiResponse<TableResultV2Array> listTablesWithHttpInfo(
      ListTablesOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    Long limit = parameters.limit;
    Long offset = parameters.offset;
    ReferenceTableSortType sort = parameters.sort;
    String filterStatus = parameters.filterStatus;
    String filterTableNameExact = parameters.filterTableNameExact;
    String filterTableNameContains = parameters.filterTableNameContains;
    // create path and map variables
    String localVarPath = "/api/v2/reference-tables/tables";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[status]", filterStatus));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[table_name][exact]", filterTableNameExact));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[table_name][contains]", filterTableNameContains));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ReferenceTablesApi.listTables",
            localVarPath,
            localVarQueryParams,
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
        new GenericType<TableResultV2Array>() {});
  }

  /**
   * List tables.
   *
   * <p>See {@link #listTablesWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;TableResultV2Array&gt;&gt;
   */
  public CompletableFuture<ApiResponse<TableResultV2Array>> listTablesWithHttpInfoAsync(
      ListTablesOptionalParameters parameters) {
    Object localVarPostBody = null;
    Long limit = parameters.limit;
    Long offset = parameters.offset;
    ReferenceTableSortType sort = parameters.sort;
    String filterStatus = parameters.filterStatus;
    String filterTableNameExact = parameters.filterTableNameExact;
    String filterTableNameContains = parameters.filterTableNameContains;
    // create path and map variables
    String localVarPath = "/api/v2/reference-tables/tables";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[status]", filterStatus));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[table_name][exact]", filterTableNameExact));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[table_name][contains]", filterTableNameContains));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ReferenceTablesApi.listTables",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<TableResultV2Array>> result = new CompletableFuture<>();
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
        new GenericType<TableResultV2Array>() {});
  }

  /**
   * Update reference table.
   *
   * <p>See {@link #updateReferenceTableWithHttpInfo}.
   *
   * @param id The ID of the reference table to update (required)
   * @param body (required)
   * @throws ApiException if fails to make API call
   */
  public void updateReferenceTable(String id, PatchTableRequest body) throws ApiException {
    updateReferenceTableWithHttpInfo(id, body);
  }

  /**
   * Update reference table.
   *
   * <p>See {@link #updateReferenceTableWithHttpInfoAsync}.
   *
   * @param id The ID of the reference table to update (required)
   * @param body (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> updateReferenceTableAsync(String id, PatchTableRequest body) {
    return updateReferenceTableWithHttpInfoAsync(id, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update a reference table by ID. You can update the table's data, description, and tags. Note:
   * The source type cannot be changed after table creation. For data updates: For existing tables
   * of type <code>source:LOCAL_FILE</code>, call POST api/v2/reference-tables/uploads first to get
   * an upload ID, then PUT chunks of CSV data to each provided URL, and finally call this PATCH
   * endpoint with the upload_id in file_metadata. For existing tables with <code>source:</code>
   * types of <code>S3</code>, <code>GCS</code>, or <code>AZURE</code>, provide updated
   * access_details in file_metadata pointing to a CSV file in the same type of cloud storage.
   *
   * @param id The ID of the reference table to update (required)
   * @param body (required)
   * @return ApiResponse&lt;Void&gt;
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
  public ApiResponse<Void> updateReferenceTableWithHttpInfo(String id, PatchTableRequest body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(
          400, "Missing the required parameter 'id' when calling updateReferenceTable");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateReferenceTable");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/reference-tables/tables/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ReferenceTablesApi.updateReferenceTable",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Update reference table.
   *
   * <p>See {@link #updateReferenceTableWithHttpInfo}.
   *
   * @param id The ID of the reference table to update (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> updateReferenceTableWithHttpInfoAsync(
      String id, PatchTableRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'id' is set
    if (id == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'id' when calling updateReferenceTable"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateReferenceTable"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/reference-tables/tables/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ReferenceTablesApi.updateReferenceTable",
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
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }
}
