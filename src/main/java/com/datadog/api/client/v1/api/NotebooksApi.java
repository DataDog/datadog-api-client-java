
package com.datadog.api.client.v1.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.PaginationIterable;

import jakarta.ws.rs.core.GenericType;
import jakarta.ws.rs.client.Invocation;

import java.io.File;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.concurrent.CompletableFuture;
import java.time.OffsetDateTime;
import java.util.UUID;
import com.datadog.api.client.v1.model.NotebooksResponse;
import com.datadog.api.client.v1.model.NotebookResponse;
import com.datadog.api.client.v1.model.NotebookCreateRequest;
import com.datadog.api.client.v1.model.NotebookUpdateRequest;
import com.datadog.api.client.v1.model.NotebooksResponseData;


@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class NotebooksApi {
  private ApiClient apiClient;
  public NotebooksApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public NotebooksApi(ApiClient apiClient) {
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
 * Create a notebook.
 *
 * See {@link #createNotebookWithHttpInfo}.
 *
 * @param body The JSON description of the notebook you want to create. (required)
 * @return NotebookResponse
 * @throws ApiException if fails to make API call
 */
  public NotebookResponse  createNotebook(NotebookCreateRequest body) throws ApiException {
    return createNotebookWithHttpInfo(body).getData();
  }

  /**
 * Create a notebook.
 *
 * See {@link #createNotebookWithHttpInfoAsync}.
 *
 * @param body The JSON description of the notebook you want to create. (required)
 * @return CompletableFuture&lt;NotebookResponse&gt;
 */
  public CompletableFuture<NotebookResponse>createNotebookAsync(NotebookCreateRequest body) {
    return createNotebookWithHttpInfoAsync(body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Create a notebook using the specified options.</p>
   *
   * @param body The JSON description of the notebook you want to create. (required)
   * @return ApiResponse&lt;NotebookResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<NotebookResponse> createNotebookWithHttpInfo(NotebookCreateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createNotebook");
    }
    // create path and map variables
    String localVarPath = "/api/v1/notebooks";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v1.NotebooksApi.createNotebook", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<NotebookResponse>() {});
  }

  /**
   * Create a notebook.
   *
   * See {@link #createNotebookWithHttpInfo}.
   *
   * @param body The JSON description of the notebook you want to create. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;NotebookResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<NotebookResponse>> createNotebookWithHttpInfoAsync(NotebookCreateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<NotebookResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling createNotebook"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/notebooks";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v1.NotebooksApi.createNotebook", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<NotebookResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<NotebookResponse>() {});
  }

  /**
 * Delete a notebook.
 *
 * See {@link #deleteNotebookWithHttpInfo}.
 *
 * @param notebookId Unique ID, assigned when you create the notebook. (required)
 * @throws ApiException if fails to make API call
 */
  public  void  deleteNotebook(Long notebookId) throws ApiException {
    deleteNotebookWithHttpInfo(notebookId);
  }

  /**
 * Delete a notebook.
 *
 * See {@link #deleteNotebookWithHttpInfoAsync}.
 *
 * @param notebookId Unique ID, assigned when you create the notebook. (required)
 * @return CompletableFuture
 */
  public CompletableFuture<Void>deleteNotebookAsync(Long notebookId) {
    return deleteNotebookWithHttpInfoAsync(notebookId).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Delete a notebook using the specified ID.</p>
   *
   * @param notebookId Unique ID, assigned when you create the notebook. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteNotebookWithHttpInfo(Long notebookId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'notebookId' is set
    if (notebookId == null) {
      throw new ApiException(400, "Missing the required parameter 'notebookId' when calling deleteNotebook");
    }
    // create path and map variables
    String localVarPath = "/api/v1/notebooks/{notebook_id}"
      .replaceAll("\\{" + "notebook_id" + "\\}", apiClient.escapeString(notebookId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v1.NotebooksApi.deleteNotebook", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("DELETE", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
   * Delete a notebook.
   *
   * See {@link #deleteNotebookWithHttpInfo}.
   *
   * @param notebookId Unique ID, assigned when you create the notebook. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteNotebookWithHttpInfoAsync(Long notebookId) {
    Object localVarPostBody = null;

    // verify the required parameter 'notebookId' is set
    if (notebookId == null) {
        CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'notebookId' when calling deleteNotebook"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/notebooks/{notebook_id}"
      .replaceAll("\\{" + "notebook_id" + "\\}", apiClient.escapeString(notebookId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v1.NotebooksApi.deleteNotebook", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("DELETE", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
 * Get a notebook.
 *
 * See {@link #getNotebookWithHttpInfo}.
 *
 * @param notebookId Unique ID, assigned when you create the notebook. (required)
 * @return NotebookResponse
 * @throws ApiException if fails to make API call
 */
  public NotebookResponse  getNotebook(Long notebookId) throws ApiException {
    return getNotebookWithHttpInfo(notebookId).getData();
  }

  /**
 * Get a notebook.
 *
 * See {@link #getNotebookWithHttpInfoAsync}.
 *
 * @param notebookId Unique ID, assigned when you create the notebook. (required)
 * @return CompletableFuture&lt;NotebookResponse&gt;
 */
  public CompletableFuture<NotebookResponse>getNotebookAsync(Long notebookId) {
    return getNotebookWithHttpInfoAsync(notebookId).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get a notebook using the specified notebook ID.</p>
   *
   * @param notebookId Unique ID, assigned when you create the notebook. (required)
   * @return ApiResponse&lt;NotebookResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<NotebookResponse> getNotebookWithHttpInfo(Long notebookId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'notebookId' is set
    if (notebookId == null) {
      throw new ApiException(400, "Missing the required parameter 'notebookId' when calling getNotebook");
    }
    // create path and map variables
    String localVarPath = "/api/v1/notebooks/{notebook_id}"
      .replaceAll("\\{" + "notebook_id" + "\\}", apiClient.escapeString(notebookId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v1.NotebooksApi.getNotebook", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<NotebookResponse>() {});
  }

  /**
   * Get a notebook.
   *
   * See {@link #getNotebookWithHttpInfo}.
   *
   * @param notebookId Unique ID, assigned when you create the notebook. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;NotebookResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<NotebookResponse>> getNotebookWithHttpInfoAsync(Long notebookId) {
    Object localVarPostBody = null;

    // verify the required parameter 'notebookId' is set
    if (notebookId == null) {
        CompletableFuture<ApiResponse<NotebookResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'notebookId' when calling getNotebook"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/notebooks/{notebook_id}"
      .replaceAll("\\{" + "notebook_id" + "\\}", apiClient.escapeString(notebookId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v1.NotebooksApi.getNotebook", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<NotebookResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<NotebookResponse>() {});
  }

  /**
   * Manage optional parameters to listNotebooks.
   */
  public static class ListNotebooksOptionalParameters {
    private String authorHandle;
    private String excludeAuthorHandle;
    private Long start;
    private Long count;
    private String sortField;
    private String sortDir;
    private String query;
    private Boolean includeCells;
    private Boolean isTemplate;
    private String type;

    /**
     * Set authorHandle.
     * @param authorHandle Return notebooks created by the given <code>author_handle</code>. (optional)
     * @return ListNotebooksOptionalParameters
     */
    public ListNotebooksOptionalParameters authorHandle(String authorHandle) {
      this.authorHandle = authorHandle;
      return this;
    }

    /**
     * Set excludeAuthorHandle.
     * @param excludeAuthorHandle Return notebooks not created by the given <code>author_handle</code>. (optional)
     * @return ListNotebooksOptionalParameters
     */
    public ListNotebooksOptionalParameters excludeAuthorHandle(String excludeAuthorHandle) {
      this.excludeAuthorHandle = excludeAuthorHandle;
      return this;
    }

    /**
     * Set start.
     * @param start The index of the first notebook you want returned. (optional)
     * @return ListNotebooksOptionalParameters
     */
    public ListNotebooksOptionalParameters start(Long start) {
      this.start = start;
      return this;
    }

    /**
     * Set count.
     * @param count The number of notebooks to be returned. (optional, default to 100)
     * @return ListNotebooksOptionalParameters
     */
    public ListNotebooksOptionalParameters count(Long count) {
      this.count = count;
      return this;
    }

    /**
     * Set sortField.
     * @param sortField Sort by field <code>modified</code>, <code>name</code>, or <code>created</code>. (optional, default to "modified")
     * @return ListNotebooksOptionalParameters
     */
    public ListNotebooksOptionalParameters sortField(String sortField) {
      this.sortField = sortField;
      return this;
    }

    /**
     * Set sortDir.
     * @param sortDir Sort by direction <code>asc</code> or <code>desc</code>. (optional, default to "desc")
     * @return ListNotebooksOptionalParameters
     */
    public ListNotebooksOptionalParameters sortDir(String sortDir) {
      this.sortDir = sortDir;
      return this;
    }

    /**
     * Set query.
     * @param query Return only notebooks with <code>query</code> string in notebook name or author handle. (optional)
     * @return ListNotebooksOptionalParameters
     */
    public ListNotebooksOptionalParameters query(String query) {
      this.query = query;
      return this;
    }

    /**
     * Set includeCells.
     * @param includeCells Value of <code>false</code> excludes the <code>cells</code> and global <code>time</code> for each notebook. (optional, default to true)
     * @return ListNotebooksOptionalParameters
     */
    public ListNotebooksOptionalParameters includeCells(Boolean includeCells) {
      this.includeCells = includeCells;
      return this;
    }

    /**
     * Set isTemplate.
     * @param isTemplate True value returns only template notebooks. Default is false (returns only non-template notebooks). (optional, default to false)
     * @return ListNotebooksOptionalParameters
     */
    public ListNotebooksOptionalParameters isTemplate(Boolean isTemplate) {
      this.isTemplate = isTemplate;
      return this;
    }

    /**
     * Set type.
     * @param type If type is provided, returns only notebooks with that metadata type. Default does not have type filtering. (optional)
     * @return ListNotebooksOptionalParameters
     */
    public ListNotebooksOptionalParameters type(String type) {
      this.type = type;
      return this;
    }
  }

  /**
 * Get all notebooks.
 *
 * See {@link #listNotebooksWithHttpInfo}.
 *
 * @return NotebooksResponse
 * @throws ApiException if fails to make API call
 */
  public NotebooksResponse listNotebooks () throws ApiException {
    return listNotebooksWithHttpInfo(new ListNotebooksOptionalParameters()).getData();
  }

  /**
 * Get all notebooks.
 *
 * See {@link #listNotebooksWithHttpInfoAsync}.
 *
 * @return CompletableFuture&lt;NotebooksResponse&gt;
 */
  public CompletableFuture<NotebooksResponse>listNotebooksAsync() {
    return listNotebooksWithHttpInfoAsync(new ListNotebooksOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * Get all notebooks.
 *
 * See {@link #listNotebooksWithHttpInfo}.
 *
 * @param parameters Optional parameters for the request.
 * @return NotebooksResponse
 * @throws ApiException if fails to make API call
 */
  public NotebooksResponse listNotebooks(ListNotebooksOptionalParameters parameters) throws ApiException {
    return listNotebooksWithHttpInfo(parameters).getData();
  }

  /**
 * Get all notebooks.
 *
 * See {@link #listNotebooksWithHttpInfoAsync}.
 *
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;NotebooksResponse&gt;
 */
  public CompletableFuture<NotebooksResponse>listNotebooksAsync(ListNotebooksOptionalParameters parameters) {
    return listNotebooksWithHttpInfoAsync(parameters).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * Get all notebooks.
 *
 * See {@link #listNotebooksWithHttpInfo}.
 *
 * @return PaginationIterable&lt;NotebooksResponseData&gt;
 */
  public PaginationIterable<NotebooksResponseData> listNotebooksWithPagination() {
    ListNotebooksOptionalParameters parameters = new ListNotebooksOptionalParameters();
    return listNotebooksWithPagination(parameters);
  }

  /**
 * Get all notebooks.
 *
 * See {@link #listNotebooksWithHttpInfo}.
 *
 * @return NotebooksResponse
 */
  public PaginationIterable<NotebooksResponseData> listNotebooksWithPagination(ListNotebooksOptionalParameters parameters) {
  String resultsPath = "getData";
  String valueGetterPath = "";
  String valueSetterPath = "start";
  Boolean valueSetterParamOptional = true;
  Long limit;

  
  if (parameters.count == null) {
      limit = 100l;
      parameters.count(limit);
  } else {
      limit = parameters.count;
  }
  

  
  LinkedHashMap<String, Object> args = new LinkedHashMap<String, Object>();
  args.put("optionalParams", parameters);

  PaginationIterable iterator = new PaginationIterable(this, "listNotebooks", resultsPath, valueGetterPath, valueSetterPath, valueSetterParamOptional, true, limit, args);

  return iterator;
  }


  /**
   * <p>Get all notebooks. This can also be used to search for notebooks with a particular <code>query</code> in the notebook
   * <code>name</code> or author <code>handle</code>.</p>
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;NotebooksResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<NotebooksResponse> listNotebooksWithHttpInfo(ListNotebooksOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    String authorHandle = parameters.authorHandle;
    String excludeAuthorHandle = parameters.excludeAuthorHandle;
    Long start = parameters.start;
    Long count = parameters.count;
    String sortField = parameters.sortField;
    String sortDir = parameters.sortDir;
    String query = parameters.query;
    Boolean includeCells = parameters.includeCells;
    Boolean isTemplate = parameters.isTemplate;
    String type = parameters.type;
    // create path and map variables
    String localVarPath = "/api/v1/notebooks";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "author_handle", authorHandle));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "exclude_author_handle", excludeAuthorHandle));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start", start));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "count", count));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort_field", sortField));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort_dir", sortDir));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "query", query));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include_cells", includeCells));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "is_template", isTemplate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "type", type));

    Invocation.Builder builder = apiClient.createBuilder("v1.NotebooksApi.listNotebooks", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<NotebooksResponse>() {});
  }

  /**
   * Get all notebooks.
   *
   * See {@link #listNotebooksWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;NotebooksResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<NotebooksResponse>> listNotebooksWithHttpInfoAsync(ListNotebooksOptionalParameters parameters) {
    Object localVarPostBody = null;
    String authorHandle = parameters.authorHandle;
    String excludeAuthorHandle = parameters.excludeAuthorHandle;
    Long start = parameters.start;
    Long count = parameters.count;
    String sortField = parameters.sortField;
    String sortDir = parameters.sortDir;
    String query = parameters.query;
    Boolean includeCells = parameters.includeCells;
    Boolean isTemplate = parameters.isTemplate;
    String type = parameters.type;
    // create path and map variables
    String localVarPath = "/api/v1/notebooks";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "author_handle", authorHandle));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "exclude_author_handle", excludeAuthorHandle));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start", start));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "count", count));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort_field", sortField));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort_dir", sortDir));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "query", query));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include_cells", includeCells));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "is_template", isTemplate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "type", type));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v1.NotebooksApi.listNotebooks", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<NotebooksResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<NotebooksResponse>() {});
  }

  /**
 * Update a notebook.
 *
 * See {@link #updateNotebookWithHttpInfo}.
 *
 * @param notebookId Unique ID, assigned when you create the notebook. (required)
 * @param body Update notebook request body. (required)
 * @return NotebookResponse
 * @throws ApiException if fails to make API call
 */
  public NotebookResponse  updateNotebook(Long notebookId, NotebookUpdateRequest body) throws ApiException {
    return updateNotebookWithHttpInfo(notebookId, body).getData();
  }

  /**
 * Update a notebook.
 *
 * See {@link #updateNotebookWithHttpInfoAsync}.
 *
 * @param notebookId Unique ID, assigned when you create the notebook. (required)
 * @param body Update notebook request body. (required)
 * @return CompletableFuture&lt;NotebookResponse&gt;
 */
  public CompletableFuture<NotebookResponse>updateNotebookAsync(Long notebookId, NotebookUpdateRequest body) {
    return updateNotebookWithHttpInfoAsync(notebookId, body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Update a notebook using the specified ID.</p>
   *
   * @param notebookId Unique ID, assigned when you create the notebook. (required)
   * @param body Update notebook request body. (required)
   * @return ApiResponse&lt;NotebookResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<NotebookResponse> updateNotebookWithHttpInfo(Long notebookId, NotebookUpdateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'notebookId' is set
    if (notebookId == null) {
      throw new ApiException(400, "Missing the required parameter 'notebookId' when calling updateNotebook");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateNotebook");
    }
    // create path and map variables
    String localVarPath = "/api/v1/notebooks/{notebook_id}"
      .replaceAll("\\{" + "notebook_id" + "\\}", apiClient.escapeString(notebookId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v1.NotebooksApi.updateNotebook", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("PUT", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<NotebookResponse>() {});
  }

  /**
   * Update a notebook.
   *
   * See {@link #updateNotebookWithHttpInfo}.
   *
   * @param notebookId Unique ID, assigned when you create the notebook. (required)
   * @param body Update notebook request body. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;NotebookResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<NotebookResponse>> updateNotebookWithHttpInfoAsync(Long notebookId, NotebookUpdateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'notebookId' is set
    if (notebookId == null) {
        CompletableFuture<ApiResponse<NotebookResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'notebookId' when calling updateNotebook"));
        return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<NotebookResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling updateNotebook"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/notebooks/{notebook_id}"
      .replaceAll("\\{" + "notebook_id" + "\\}", apiClient.escapeString(notebookId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v1.NotebooksApi.updateNotebook", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<NotebookResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("PUT", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<NotebookResponse>() {});
  }
}