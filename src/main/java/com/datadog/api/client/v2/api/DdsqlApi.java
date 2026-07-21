package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.DdsqlTabularQueryFetchRequest;
import com.datadog.api.client.v2.model.DdsqlTabularQueryRequest;
import com.datadog.api.client.v2.model.DdsqlTabularQueryResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DdsqlApi {
  private ApiClient apiClient;

  public DdsqlApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public DdsqlApi(ApiClient apiClient) {
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
   * Execute a tabular DDSQL query.
   *
   * <p>See {@link #executeDdsqlTabularQueryWithHttpInfo}.
   *
   * @param body (required)
   * @return DdsqlTabularQueryResponse
   * @throws ApiException if fails to make API call
   */
  public DdsqlTabularQueryResponse executeDdsqlTabularQuery(DdsqlTabularQueryRequest body)
      throws ApiException {
    return executeDdsqlTabularQueryWithHttpInfo(body).getData();
  }

  /**
   * Execute a tabular DDSQL query.
   *
   * <p>See {@link #executeDdsqlTabularQueryWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;DdsqlTabularQueryResponse&gt;
   */
  public CompletableFuture<DdsqlTabularQueryResponse> executeDdsqlTabularQueryAsync(
      DdsqlTabularQueryRequest body) {
    return executeDdsqlTabularQueryWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Submit a DDSQL statement and return either a <code>running</code> state with an opaque <code>
   * query_id</code> for the client to poll, or a <code>completed</code> state with the column-major
   * result set inlined when the query finishes quickly enough to be served synchronously.
   *
   * @param body (required)
   * @return ApiResponse&lt;DdsqlTabularQueryResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<DdsqlTabularQueryResponse> executeDdsqlTabularQueryWithHttpInfo(
      DdsqlTabularQueryRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "executeDdsqlTabularQuery";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling executeDdsqlTabularQuery");
    }
    // create path and map variables
    String localVarPath = "/api/v2/ddsql/query/tabular";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.DdsqlApi.executeDdsqlTabularQuery",
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
        new GenericType<DdsqlTabularQueryResponse>() {});
  }

  /**
   * Execute a tabular DDSQL query.
   *
   * <p>See {@link #executeDdsqlTabularQueryWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;DdsqlTabularQueryResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<DdsqlTabularQueryResponse>>
      executeDdsqlTabularQueryWithHttpInfoAsync(DdsqlTabularQueryRequest body) {
    // Check if unstable operation is enabled
    String operationId = "executeDdsqlTabularQuery";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<DdsqlTabularQueryResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<DdsqlTabularQueryResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling executeDdsqlTabularQuery"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/ddsql/query/tabular";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.DdsqlApi.executeDdsqlTabularQuery",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<DdsqlTabularQueryResponse>> result = new CompletableFuture<>();
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
        new GenericType<DdsqlTabularQueryResponse>() {});
  }

  /**
   * Fetch the result of a DDSQL query.
   *
   * <p>See {@link #fetchDdsqlTabularQueryWithHttpInfo}.
   *
   * @param body (required)
   * @return DdsqlTabularQueryResponse
   * @throws ApiException if fails to make API call
   */
  public DdsqlTabularQueryResponse fetchDdsqlTabularQuery(DdsqlTabularQueryFetchRequest body)
      throws ApiException {
    return fetchDdsqlTabularQueryWithHttpInfo(body).getData();
  }

  /**
   * Fetch the result of a DDSQL query.
   *
   * <p>See {@link #fetchDdsqlTabularQueryWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;DdsqlTabularQueryResponse&gt;
   */
  public CompletableFuture<DdsqlTabularQueryResponse> fetchDdsqlTabularQueryAsync(
      DdsqlTabularQueryFetchRequest body) {
    return fetchDdsqlTabularQueryWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Poll a previously submitted DDSQL query for results. Pass the opaque <code>query_id</code>
   * returned by a prior <code>ExecuteDdsqlTabularQuery</code> (or by a prior <code>
   * FetchDdsqlTabularQuery</code> that returned <code>state: running</code>) and the server returns
   * either a <code>running</code> state to poll again or a <code>completed</code> state with the
   * column-major result set inlined.
   *
   * @param body (required)
   * @return ApiResponse&lt;DdsqlTabularQueryResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<DdsqlTabularQueryResponse> fetchDdsqlTabularQueryWithHttpInfo(
      DdsqlTabularQueryFetchRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "fetchDdsqlTabularQuery";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling fetchDdsqlTabularQuery");
    }
    // create path and map variables
    String localVarPath = "/api/v2/ddsql/query/tabular/fetch";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.DdsqlApi.fetchDdsqlTabularQuery",
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
        new GenericType<DdsqlTabularQueryResponse>() {});
  }

  /**
   * Fetch the result of a DDSQL query.
   *
   * <p>See {@link #fetchDdsqlTabularQueryWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;DdsqlTabularQueryResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<DdsqlTabularQueryResponse>>
      fetchDdsqlTabularQueryWithHttpInfoAsync(DdsqlTabularQueryFetchRequest body) {
    // Check if unstable operation is enabled
    String operationId = "fetchDdsqlTabularQuery";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<DdsqlTabularQueryResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<DdsqlTabularQueryResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling fetchDdsqlTabularQuery"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/ddsql/query/tabular/fetch";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.DdsqlApi.fetchDdsqlTabularQuery",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<DdsqlTabularQueryResponse>> result = new CompletableFuture<>();
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
        new GenericType<DdsqlTabularQueryResponse>() {});
  }
}
