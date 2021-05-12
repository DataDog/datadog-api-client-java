package com.datadog.api.v1.client.api;

import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.ApiResponse;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.Pair;
import com.datadog.api.v1.client.model.NotebookCreateRequest;
import com.datadog.api.v1.client.model.NotebookResponse;
import com.datadog.api.v1.client.model.NotebookUpdateRequest;
import com.datadog.api.v1.client.model.NotebooksResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class NotebooksApi {
  private ApiClient apiClient;

  public NotebooksApi() {
    this(Configuration.getDefaultApiClient());
  }

  public NotebooksApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get the API cilent
   *
   * @return API client
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * Set the API cilent
   *
   * @param apiClient an instance of API client
   */
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create a notebook Create a notebook using the specified options.
   *
   * @param body The JSON description of the notebook you want to create. (required)
   * @return NotebookResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *     </table>
   */
  public NotebookResponse createNotebook(NotebookCreateRequest body) throws ApiException {
    return createNotebookWithHttpInfo(body).getData();
  }

  /**
   * Create a notebook Create a notebook using the specified options.
   *
   * @param body The JSON description of the notebook you want to create. (required)
   * @return ApiResponse&lt;NotebookResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<NotebookResponse> createNotebookWithHttpInfo(NotebookCreateRequest body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createNotebook");
    }
    // create path and map variables
    String localVarPath = "/api/v1/notebooks";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "createNotebook");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<NotebookResponse> localVarReturnType = new GenericType<NotebookResponse>() {};

    return apiClient.invokeAPI(
        "NotebooksApi.createNotebook",
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false);
  }

  /**
   * Delete a notebook Delete a notebook using the specified ID.
   *
   * @param notebookId Unique ID, assigned when you create the notebook. (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *     </table>
   */
  public void deleteNotebook(Long notebookId) throws ApiException {
    deleteNotebookWithHttpInfo(notebookId);
  }

  /**
   * Delete a notebook Delete a notebook using the specified ID.
   *
   * @param notebookId Unique ID, assigned when you create the notebook. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteNotebookWithHttpInfo(Long notebookId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'notebookId' is set
    if (notebookId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'notebookId' when calling deleteNotebook");
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/notebooks/{notebook_id}"
            .replaceAll(
                "\\{" + "notebook_id" + "\\}", apiClient.escapeString(notebookId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "deleteNotebook");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    return apiClient.invokeAPI(
        "NotebooksApi.deleteNotebook",
        localVarPath,
        "DELETE",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        null,
        false);
  }

  /**
   * Get a notebook Get a notebook using the specified notebook ID.
   *
   * @param notebookId Unique ID, assigned when you create the notebook. (required)
   * @return NotebookResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *     </table>
   */
  public NotebookResponse getNotebook(Long notebookId) throws ApiException {
    return getNotebookWithHttpInfo(notebookId).getData();
  }

  /**
   * Get a notebook Get a notebook using the specified notebook ID.
   *
   * @param notebookId Unique ID, assigned when you create the notebook. (required)
   * @return ApiResponse&lt;NotebookResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<NotebookResponse> getNotebookWithHttpInfo(Long notebookId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'notebookId' is set
    if (notebookId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'notebookId' when calling getNotebook");
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/notebooks/{notebook_id}"
            .replaceAll(
                "\\{" + "notebook_id" + "\\}", apiClient.escapeString(notebookId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getNotebook");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<NotebookResponse> localVarReturnType = new GenericType<NotebookResponse>() {};

    return apiClient.invokeAPI(
        "NotebooksApi.getNotebook",
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false);
  }

  /** Manage optional parameters to listNotebooks. */
  public static class ListNotebooksOptionalParameters {
    private String authorHandle;
    private String excludeAuthorHandle;
    private Long start;
    private Long count;
    private String sortField;
    private String sortDir;
    private String query;
    private Boolean includeCells;

    /**
     * Set authorHandle
     *
     * @param authorHandle Return notebooks created by the given &#x60;author_handle&#x60;.
     *     (optional)
     * @return ListNotebooksOptionalParameters
     */
    public ListNotebooksOptionalParameters authorHandle(String authorHandle) {
      this.authorHandle = authorHandle;
      return this;
    }

    /**
     * Set excludeAuthorHandle
     *
     * @param excludeAuthorHandle Return notebooks not created by the given
     *     &#x60;author_handle&#x60;. (optional)
     * @return ListNotebooksOptionalParameters
     */
    public ListNotebooksOptionalParameters excludeAuthorHandle(String excludeAuthorHandle) {
      this.excludeAuthorHandle = excludeAuthorHandle;
      return this;
    }

    /**
     * Set start
     *
     * @param start The index of the first notebook you want returned. (optional)
     * @return ListNotebooksOptionalParameters
     */
    public ListNotebooksOptionalParameters start(Long start) {
      this.start = start;
      return this;
    }

    /**
     * Set count
     *
     * @param count The number of notebooks to be returned. (optional)
     * @return ListNotebooksOptionalParameters
     */
    public ListNotebooksOptionalParameters count(Long count) {
      this.count = count;
      return this;
    }

    /**
     * Set sortField
     *
     * @param sortField Sort by field &#x60;modified&#x60; or &#x60;name&#x60;. (optional, default
     *     to modified)
     * @return ListNotebooksOptionalParameters
     */
    public ListNotebooksOptionalParameters sortField(String sortField) {
      this.sortField = sortField;
      return this;
    }

    /**
     * Set sortDir
     *
     * @param sortDir Sort by direction &#x60;asc&#x60; or &#x60;desc&#x60;. (optional, default to
     *     desc)
     * @return ListNotebooksOptionalParameters
     */
    public ListNotebooksOptionalParameters sortDir(String sortDir) {
      this.sortDir = sortDir;
      return this;
    }

    /**
     * Set query
     *
     * @param query Return only notebooks with &#x60;query&#x60; string in notebook name or author
     *     handle. (optional)
     * @return ListNotebooksOptionalParameters
     */
    public ListNotebooksOptionalParameters query(String query) {
      this.query = query;
      return this;
    }

    /**
     * Set includeCells
     *
     * @param includeCells Value of &#x60;false&#x60; excludes the &#x60;cells&#x60; and global
     *     &#x60;time&#x60; for each notebook. (optional, default to true)
     * @return ListNotebooksOptionalParameters
     */
    public ListNotebooksOptionalParameters includeCells(Boolean includeCells) {
      this.includeCells = includeCells;
      return this;
    }
  }

  /**
   * Get all notebooks Get all notebooks. This can also be used to search for notebooks with a
   * particular &#x60;query&#x60; in the notebook &#x60;name&#x60; or author &#x60;handle&#x60;.
   *
   * @return NotebooksResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *     </table>
   */
  public NotebooksResponse listNotebooks() throws ApiException {
    return listNotebooksWithHttpInfo(new ListNotebooksOptionalParameters()).getData();
  }

  /**
   * Get all notebooks Get all notebooks. This can also be used to search for notebooks with a
   * particular &#x60;query&#x60; in the notebook &#x60;name&#x60; or author &#x60;handle&#x60;.
   *
   * @param parameters Optional parameters for the request.
   * @return NotebooksResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *     </table>
   */
  public NotebooksResponse listNotebooks(ListNotebooksOptionalParameters parameters)
      throws ApiException {
    return listNotebooksWithHttpInfo(parameters).getData();
  }

  /**
   * Get all notebooks Get all notebooks. This can also be used to search for notebooks with a
   * particular &#x60;query&#x60; in the notebook &#x60;name&#x60; or author &#x60;handle&#x60;.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;NotebooksResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<NotebooksResponse> listNotebooksWithHttpInfo(
      ListNotebooksOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    String authorHandle = parameters.authorHandle;
    String excludeAuthorHandle = parameters.excludeAuthorHandle;
    Long start = parameters.start;
    Long count = parameters.count;
    String sortField = parameters.sortField;
    String sortDir = parameters.sortDir;
    String query = parameters.query;
    Boolean includeCells = parameters.includeCells;
    // create path and map variables
    String localVarPath = "/api/v1/notebooks";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "author_handle", authorHandle));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "exclude_author_handle", excludeAuthorHandle));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start", start));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "count", count));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort_field", sortField));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort_dir", sortDir));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "query", query));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include_cells", includeCells));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listNotebooks");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<NotebooksResponse> localVarReturnType = new GenericType<NotebooksResponse>() {};

    return apiClient.invokeAPI(
        "NotebooksApi.listNotebooks",
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false);
  }

  /**
   * Update a notebook Update a notebook using the specified ID.
   *
   * @param notebookId Unique ID, assigned when you create the notebook. (required)
   * @param body Update notebook request body. (required)
   * @return NotebookResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *     </table>
   */
  public NotebookResponse updateNotebook(Long notebookId, NotebookUpdateRequest body)
      throws ApiException {
    return updateNotebookWithHttpInfo(notebookId, body).getData();
  }

  /**
   * Update a notebook Update a notebook using the specified ID.
   *
   * @param notebookId Unique ID, assigned when you create the notebook. (required)
   * @param body Update notebook request body. (required)
   * @return ApiResponse&lt;NotebookResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<NotebookResponse> updateNotebookWithHttpInfo(
      Long notebookId, NotebookUpdateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'notebookId' is set
    if (notebookId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'notebookId' when calling updateNotebook");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateNotebook");
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/notebooks/{notebook_id}"
            .replaceAll(
                "\\{" + "notebook_id" + "\\}", apiClient.escapeString(notebookId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "updateNotebook");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<NotebookResponse> localVarReturnType = new GenericType<NotebookResponse>() {};

    return apiClient.invokeAPI(
        "NotebooksApi.updateNotebook",
        localVarPath,
        "PUT",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false);
  }
}
