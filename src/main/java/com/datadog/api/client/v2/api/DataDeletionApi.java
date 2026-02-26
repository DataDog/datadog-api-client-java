
package com.datadog.api.client.v2.api;

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
import com.datadog.api.client.v2.model.CreateDataDeletionResponseBody;
import com.datadog.api.client.v2.model.CreateDataDeletionRequestBody;
import com.datadog.api.client.v2.model.GetDataDeletionsResponseBody;
import com.datadog.api.client.v2.model.CancelDataDeletionResponseBody;


@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DataDeletionApi {
  private ApiClient apiClient;
  public DataDeletionApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public DataDeletionApi(ApiClient apiClient) {
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
 * Cancels a data deletion request.
 *
 * See {@link #cancelDataDeletionRequestWithHttpInfo}.
 *
 * @param id ID of the deletion request. (required)
 * @return CancelDataDeletionResponseBody
 * @throws ApiException if fails to make API call
 */
  public CancelDataDeletionResponseBody  cancelDataDeletionRequest(String id) throws ApiException {
    return cancelDataDeletionRequestWithHttpInfo(id).getData();
  }

  /**
 * Cancels a data deletion request.
 *
 * See {@link #cancelDataDeletionRequestWithHttpInfoAsync}.
 *
 * @param id ID of the deletion request. (required)
 * @return CompletableFuture&lt;CancelDataDeletionResponseBody&gt;
 */
  public CompletableFuture<CancelDataDeletionResponseBody>cancelDataDeletionRequestAsync(String id) {
    return cancelDataDeletionRequestWithHttpInfoAsync(id).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Cancels a data deletion request by providing its ID.</p>
   *
   * @param id ID of the deletion request. (required)
   * @return ApiResponse&lt;CancelDataDeletionResponseBody&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 412 </td><td> Precondition failed error </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *       <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CancelDataDeletionResponseBody> cancelDataDeletionRequestWithHttpInfo(String id) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "cancelDataDeletionRequest";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling cancelDataDeletionRequest");
    }
    // create path and map variables
    String localVarPath = "/api/v2/deletion/requests/{id}/cancel"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.DataDeletionApi.cancelDataDeletionRequest", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("PUT", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<CancelDataDeletionResponseBody>() {});
  }

  /**
   * Cancels a data deletion request.
   *
   * See {@link #cancelDataDeletionRequestWithHttpInfo}.
   *
   * @param id ID of the deletion request. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CancelDataDeletionResponseBody&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CancelDataDeletionResponseBody>> cancelDataDeletionRequestWithHttpInfoAsync(String id) {
    // Check if unstable operation is enabled
    String operationId = "cancelDataDeletionRequest";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<CancelDataDeletionResponseBody>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
        CompletableFuture<ApiResponse<CancelDataDeletionResponseBody>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'id' when calling cancelDataDeletionRequest"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/deletion/requests/{id}/cancel"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.DataDeletionApi.cancelDataDeletionRequest", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CancelDataDeletionResponseBody>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("PUT", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<CancelDataDeletionResponseBody>() {});
  }

  /**
 * Creates a data deletion request.
 *
 * See {@link #createDataDeletionRequestWithHttpInfo}.
 *
 * @param product Name of the product to be deleted, either <code>logs</code> or <code>rum</code>. (required)
 * @param body  (required)
 * @return CreateDataDeletionResponseBody
 * @throws ApiException if fails to make API call
 */
  public CreateDataDeletionResponseBody  createDataDeletionRequest(String product, CreateDataDeletionRequestBody body) throws ApiException {
    return createDataDeletionRequestWithHttpInfo(product, body).getData();
  }

  /**
 * Creates a data deletion request.
 *
 * See {@link #createDataDeletionRequestWithHttpInfoAsync}.
 *
 * @param product Name of the product to be deleted, either <code>logs</code> or <code>rum</code>. (required)
 * @param body  (required)
 * @return CompletableFuture&lt;CreateDataDeletionResponseBody&gt;
 */
  public CompletableFuture<CreateDataDeletionResponseBody>createDataDeletionRequestAsync(String product, CreateDataDeletionRequestBody body) {
    return createDataDeletionRequestWithHttpInfoAsync(product, body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Creates a data deletion request by providing a query and a timeframe targeting the proper data.</p>
   *
   * @param product Name of the product to be deleted, either <code>logs</code> or <code>rum</code>. (required)
   * @param body  (required)
   * @return ApiResponse&lt;CreateDataDeletionResponseBody&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 412 </td><td> Precondition failed error </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *       <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CreateDataDeletionResponseBody> createDataDeletionRequestWithHttpInfo(String product, CreateDataDeletionRequestBody body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createDataDeletionRequest";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'product' is set
    if (product == null) {
      throw new ApiException(400, "Missing the required parameter 'product' when calling createDataDeletionRequest");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createDataDeletionRequest");
    }
    // create path and map variables
    String localVarPath = "/api/v2/deletion/data/{product}"
      .replaceAll("\\{" + "product" + "\\}", apiClient.escapeString(product.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.DataDeletionApi.createDataDeletionRequest", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<CreateDataDeletionResponseBody>() {});
  }

  /**
   * Creates a data deletion request.
   *
   * See {@link #createDataDeletionRequestWithHttpInfo}.
   *
   * @param product Name of the product to be deleted, either <code>logs</code> or <code>rum</code>. (required)
   * @param body  (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CreateDataDeletionResponseBody&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CreateDataDeletionResponseBody>> createDataDeletionRequestWithHttpInfoAsync(String product, CreateDataDeletionRequestBody body) {
    // Check if unstable operation is enabled
    String operationId = "createDataDeletionRequest";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<CreateDataDeletionResponseBody>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'product' is set
    if (product == null) {
        CompletableFuture<ApiResponse<CreateDataDeletionResponseBody>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'product' when calling createDataDeletionRequest"));
        return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<CreateDataDeletionResponseBody>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling createDataDeletionRequest"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/deletion/data/{product}"
      .replaceAll("\\{" + "product" + "\\}", apiClient.escapeString(product.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.DataDeletionApi.createDataDeletionRequest", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CreateDataDeletionResponseBody>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<CreateDataDeletionResponseBody>() {});
  }

  /**
   * Manage optional parameters to getDataDeletionRequests.
   */
  public static class GetDataDeletionRequestsOptionalParameters {
    private String nextPage;
    private String product;
    private String query;
    private String status;
    private Long pageSize;

    /**
     * Set nextPage.
     * @param nextPage The next page of the previous search. If the next_page parameter is included, the rest of the query elements are ignored. (optional)
     * @return GetDataDeletionRequestsOptionalParameters
     */
    public GetDataDeletionRequestsOptionalParameters nextPage(String nextPage) {
      this.nextPage = nextPage;
      return this;
    }

    /**
     * Set product.
     * @param product Retrieve only the requests related to the given product. (optional)
     * @return GetDataDeletionRequestsOptionalParameters
     */
    public GetDataDeletionRequestsOptionalParameters product(String product) {
      this.product = product;
      return this;
    }

    /**
     * Set query.
     * @param query Retrieve only the requests that matches the given query. (optional)
     * @return GetDataDeletionRequestsOptionalParameters
     */
    public GetDataDeletionRequestsOptionalParameters query(String query) {
      this.query = query;
      return this;
    }

    /**
     * Set status.
     * @param status Retrieve only the requests with the given status. (optional)
     * @return GetDataDeletionRequestsOptionalParameters
     */
    public GetDataDeletionRequestsOptionalParameters status(String status) {
      this.status = status;
      return this;
    }

    /**
     * Set pageSize.
     * @param pageSize Sets the page size of the search. (optional, default to 50)
     * @return GetDataDeletionRequestsOptionalParameters
     */
    public GetDataDeletionRequestsOptionalParameters pageSize(Long pageSize) {
      this.pageSize = pageSize;
      return this;
    }
  }

  /**
 * Gets a list of data deletion requests.
 *
 * See {@link #getDataDeletionRequestsWithHttpInfo}.
 *
 * @return GetDataDeletionsResponseBody
 * @throws ApiException if fails to make API call
 */
  public GetDataDeletionsResponseBody getDataDeletionRequests () throws ApiException {
    return getDataDeletionRequestsWithHttpInfo(new GetDataDeletionRequestsOptionalParameters()).getData();
  }

  /**
 * Gets a list of data deletion requests.
 *
 * See {@link #getDataDeletionRequestsWithHttpInfoAsync}.
 *
 * @return CompletableFuture&lt;GetDataDeletionsResponseBody&gt;
 */
  public CompletableFuture<GetDataDeletionsResponseBody>getDataDeletionRequestsAsync() {
    return getDataDeletionRequestsWithHttpInfoAsync(new GetDataDeletionRequestsOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * Gets a list of data deletion requests.
 *
 * See {@link #getDataDeletionRequestsWithHttpInfo}.
 *
 * @param parameters Optional parameters for the request.
 * @return GetDataDeletionsResponseBody
 * @throws ApiException if fails to make API call
 */
  public GetDataDeletionsResponseBody getDataDeletionRequests(GetDataDeletionRequestsOptionalParameters parameters) throws ApiException {
    return getDataDeletionRequestsWithHttpInfo(parameters).getData();
  }

  /**
 * Gets a list of data deletion requests.
 *
 * See {@link #getDataDeletionRequestsWithHttpInfoAsync}.
 *
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;GetDataDeletionsResponseBody&gt;
 */
  public CompletableFuture<GetDataDeletionsResponseBody>getDataDeletionRequestsAsync(GetDataDeletionRequestsOptionalParameters parameters) {
    return getDataDeletionRequestsWithHttpInfoAsync(parameters).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Gets a list of data deletion requests based on several filter parameters.</p>
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;GetDataDeletionsResponseBody&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *       <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<GetDataDeletionsResponseBody> getDataDeletionRequestsWithHttpInfo(GetDataDeletionRequestsOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getDataDeletionRequests";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    String nextPage = parameters.nextPage;
    String product = parameters.product;
    String query = parameters.query;
    String status = parameters.status;
    Long pageSize = parameters.pageSize;
    // create path and map variables
    String localVarPath = "/api/v2/deletion/requests";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "next_page", nextPage));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "product", product));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "query", query));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "status", status));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page_size", pageSize));

    Invocation.Builder builder = apiClient.createBuilder("v2.DataDeletionApi.getDataDeletionRequests", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<GetDataDeletionsResponseBody>() {});
  }

  /**
   * Gets a list of data deletion requests.
   *
   * See {@link #getDataDeletionRequestsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;GetDataDeletionsResponseBody&gt;&gt;
   */
  public CompletableFuture<ApiResponse<GetDataDeletionsResponseBody>> getDataDeletionRequestsWithHttpInfoAsync(GetDataDeletionRequestsOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "getDataDeletionRequests";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<GetDataDeletionsResponseBody>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    String nextPage = parameters.nextPage;
    String product = parameters.product;
    String query = parameters.query;
    String status = parameters.status;
    Long pageSize = parameters.pageSize;
    // create path and map variables
    String localVarPath = "/api/v2/deletion/requests";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "next_page", nextPage));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "product", product));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "query", query));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "status", status));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page_size", pageSize));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.DataDeletionApi.getDataDeletionRequests", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<GetDataDeletionsResponseBody>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<GetDataDeletionsResponseBody>() {});
  }
}