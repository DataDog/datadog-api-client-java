package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.GlobalVariableJsonPatchRequest;
import com.datadog.api.client.v2.model.GlobalVariableResponse;
import com.datadog.api.client.v2.model.OnDemandConcurrencyCapAttributes;
import com.datadog.api.client.v2.model.OnDemandConcurrencyCapResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsApi {
  private ApiClient apiClient;

  public SyntheticsApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public SyntheticsApi(ApiClient apiClient) {
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
   * Get the on-demand concurrency cap.
   *
   * <p>See {@link #getOnDemandConcurrencyCapWithHttpInfo}.
   *
   * @return OnDemandConcurrencyCapResponse
   * @throws ApiException if fails to make API call
   */
  public OnDemandConcurrencyCapResponse getOnDemandConcurrencyCap() throws ApiException {
    return getOnDemandConcurrencyCapWithHttpInfo().getData();
  }

  /**
   * Get the on-demand concurrency cap.
   *
   * <p>See {@link #getOnDemandConcurrencyCapWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;OnDemandConcurrencyCapResponse&gt;
   */
  public CompletableFuture<OnDemandConcurrencyCapResponse> getOnDemandConcurrencyCapAsync() {
    return getOnDemandConcurrencyCapWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the on-demand concurrency cap.
   *
   * @return ApiResponse&lt;OnDemandConcurrencyCapResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<OnDemandConcurrencyCapResponse> getOnDemandConcurrencyCapWithHttpInfo()
      throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/synthetics/settings/on_demand_concurrency_cap";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SyntheticsApi.getOnDemandConcurrencyCap",
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
        new GenericType<OnDemandConcurrencyCapResponse>() {});
  }

  /**
   * Get the on-demand concurrency cap.
   *
   * <p>See {@link #getOnDemandConcurrencyCapWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;OnDemandConcurrencyCapResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<OnDemandConcurrencyCapResponse>>
      getOnDemandConcurrencyCapWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/synthetics/settings/on_demand_concurrency_cap";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SyntheticsApi.getOnDemandConcurrencyCap",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<OnDemandConcurrencyCapResponse>> result =
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
        new GenericType<OnDemandConcurrencyCapResponse>() {});
  }

  /**
   * Patch a global variable.
   *
   * <p>See {@link #patchGlobalVariableWithHttpInfo}.
   *
   * @param variableId The ID of the global variable. (required)
   * @param body JSON Patch document with operations to apply. (required)
   * @return GlobalVariableResponse
   * @throws ApiException if fails to make API call
   */
  public GlobalVariableResponse patchGlobalVariable(
      String variableId, GlobalVariableJsonPatchRequest body) throws ApiException {
    return patchGlobalVariableWithHttpInfo(variableId, body).getData();
  }

  /**
   * Patch a global variable.
   *
   * <p>See {@link #patchGlobalVariableWithHttpInfoAsync}.
   *
   * @param variableId The ID of the global variable. (required)
   * @param body JSON Patch document with operations to apply. (required)
   * @return CompletableFuture&lt;GlobalVariableResponse&gt;
   */
  public CompletableFuture<GlobalVariableResponse> patchGlobalVariableAsync(
      String variableId, GlobalVariableJsonPatchRequest body) {
    return patchGlobalVariableWithHttpInfoAsync(variableId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Patch a global variable using JSON Patch (RFC 6902). This endpoint allows partial updates to a
   * global variable by specifying only the fields to modify.
   *
   * <p>Common operations include: - Replace field values: <code>
   * {"op": "replace", "path": "/name", "value": "new_name"}</code> - Update nested values: <code>
   * {"op": "replace", "path": "/value/value", "value": "new_value"}</code> - Add/update tags:
   * <code>{"op": "add", "path": "/tags/-", "value": "new_tag"}</code> - Remove fields: <code>
   * {"op": "remove", "path": "/description"}</code>
   *
   * @param variableId The ID of the global variable. (required)
   * @param body JSON Patch document with operations to apply. (required)
   * @return ApiResponse&lt;GlobalVariableResponse&gt;
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
  public ApiResponse<GlobalVariableResponse> patchGlobalVariableWithHttpInfo(
      String variableId, GlobalVariableJsonPatchRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'variableId' is set
    if (variableId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'variableId' when calling patchGlobalVariable");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling patchGlobalVariable");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/synthetics/variables/{variable_id}/jsonpatch"
            .replaceAll(
                "\\{" + "variable_id" + "\\}", apiClient.escapeString(variableId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SyntheticsApi.patchGlobalVariable",
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
        new GenericType<GlobalVariableResponse>() {});
  }

  /**
   * Patch a global variable.
   *
   * <p>See {@link #patchGlobalVariableWithHttpInfo}.
   *
   * @param variableId The ID of the global variable. (required)
   * @param body JSON Patch document with operations to apply. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;GlobalVariableResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<GlobalVariableResponse>>
      patchGlobalVariableWithHttpInfoAsync(String variableId, GlobalVariableJsonPatchRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'variableId' is set
    if (variableId == null) {
      CompletableFuture<ApiResponse<GlobalVariableResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'variableId' when calling patchGlobalVariable"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<GlobalVariableResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling patchGlobalVariable"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/synthetics/variables/{variable_id}/jsonpatch"
            .replaceAll(
                "\\{" + "variable_id" + "\\}", apiClient.escapeString(variableId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SyntheticsApi.patchGlobalVariable",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<GlobalVariableResponse>> result = new CompletableFuture<>();
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
        new GenericType<GlobalVariableResponse>() {});
  }

  /**
   * Save new value for on-demand concurrency cap.
   *
   * <p>See {@link #setOnDemandConcurrencyCapWithHttpInfo}.
   *
   * @param body . (required)
   * @return OnDemandConcurrencyCapResponse
   * @throws ApiException if fails to make API call
   */
  public OnDemandConcurrencyCapResponse setOnDemandConcurrencyCap(
      OnDemandConcurrencyCapAttributes body) throws ApiException {
    return setOnDemandConcurrencyCapWithHttpInfo(body).getData();
  }

  /**
   * Save new value for on-demand concurrency cap.
   *
   * <p>See {@link #setOnDemandConcurrencyCapWithHttpInfoAsync}.
   *
   * @param body . (required)
   * @return CompletableFuture&lt;OnDemandConcurrencyCapResponse&gt;
   */
  public CompletableFuture<OnDemandConcurrencyCapResponse> setOnDemandConcurrencyCapAsync(
      OnDemandConcurrencyCapAttributes body) {
    return setOnDemandConcurrencyCapWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Save new value for on-demand concurrency cap.
   *
   * @param body . (required)
   * @return ApiResponse&lt;OnDemandConcurrencyCapResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<OnDemandConcurrencyCapResponse> setOnDemandConcurrencyCapWithHttpInfo(
      OnDemandConcurrencyCapAttributes body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling setOnDemandConcurrencyCap");
    }
    // create path and map variables
    String localVarPath = "/api/v2/synthetics/settings/on_demand_concurrency_cap";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SyntheticsApi.setOnDemandConcurrencyCap",
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
        new GenericType<OnDemandConcurrencyCapResponse>() {});
  }

  /**
   * Save new value for on-demand concurrency cap.
   *
   * <p>See {@link #setOnDemandConcurrencyCapWithHttpInfo}.
   *
   * @param body . (required)
   * @return CompletableFuture&lt;ApiResponse&lt;OnDemandConcurrencyCapResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<OnDemandConcurrencyCapResponse>>
      setOnDemandConcurrencyCapWithHttpInfoAsync(OnDemandConcurrencyCapAttributes body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<OnDemandConcurrencyCapResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling setOnDemandConcurrencyCap"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/synthetics/settings/on_demand_concurrency_cap";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SyntheticsApi.setOnDemandConcurrencyCap",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<OnDemandConcurrencyCapResponse>> result =
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
        new GenericType<OnDemandConcurrencyCapResponse>() {});
  }
}
