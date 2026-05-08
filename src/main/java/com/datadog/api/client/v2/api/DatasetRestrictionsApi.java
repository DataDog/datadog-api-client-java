package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.DatasetRestrictionResponse;
import com.datadog.api.client.v2.model.DatasetRestrictionUpdateRequest;
import com.datadog.api.client.v2.model.DatasetRestrictionsListResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DatasetRestrictionsApi {
  private ApiClient apiClient;

  public DatasetRestrictionsApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public DatasetRestrictionsApi(ApiClient apiClient) {
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
   * List dataset restrictions.
   *
   * <p>See {@link #listDatasetRestrictionsWithHttpInfo}.
   *
   * @return DatasetRestrictionsListResponse
   * @throws ApiException if fails to make API call
   */
  public DatasetRestrictionsListResponse listDatasetRestrictions() throws ApiException {
    return listDatasetRestrictionsWithHttpInfo().getData();
  }

  /**
   * List dataset restrictions.
   *
   * <p>See {@link #listDatasetRestrictionsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;DatasetRestrictionsListResponse&gt;
   */
  public CompletableFuture<DatasetRestrictionsListResponse> listDatasetRestrictionsAsync() {
    return listDatasetRestrictionsWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Retrieve all dataset restriction configurations for the organization. Returns one restriction
   * object per configured product type (for example, RUM, APM, or Logs), including the current
   * restriction mode, ownership mode, and any unrestricted principals. Requires the <code>
   * user_access_read</code> permission.
   *
   * @return ApiResponse&lt;DatasetRestrictionsListResponse&gt;
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
  public ApiResponse<DatasetRestrictionsListResponse> listDatasetRestrictionsWithHttpInfo()
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listDatasetRestrictions";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/dataset_restrictions";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.DatasetRestrictionsApi.listDatasetRestrictions",
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
        new GenericType<DatasetRestrictionsListResponse>() {});
  }

  /**
   * List dataset restrictions.
   *
   * <p>See {@link #listDatasetRestrictionsWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;DatasetRestrictionsListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<DatasetRestrictionsListResponse>>
      listDatasetRestrictionsWithHttpInfoAsync() {
    // Check if unstable operation is enabled
    String operationId = "listDatasetRestrictions";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<DatasetRestrictionsListResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/dataset_restrictions";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.DatasetRestrictionsApi.listDatasetRestrictions",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<DatasetRestrictionsListResponse>> result =
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
        new GenericType<DatasetRestrictionsListResponse>() {});
  }

  /**
   * Update a dataset restriction.
   *
   * <p>See {@link #updateDatasetRestrictionWithHttpInfo}.
   *
   * @param productType The Datadog product type to configure restrictions for (for example, <code>
   *     rum</code>, <code>apm</code>, or <code>logs</code>). (required)
   * @param body (required)
   * @return DatasetRestrictionResponse
   * @throws ApiException if fails to make API call
   */
  public DatasetRestrictionResponse updateDatasetRestriction(
      String productType, DatasetRestrictionUpdateRequest body) throws ApiException {
    return updateDatasetRestrictionWithHttpInfo(productType, body).getData();
  }

  /**
   * Update a dataset restriction.
   *
   * <p>See {@link #updateDatasetRestrictionWithHttpInfoAsync}.
   *
   * @param productType The Datadog product type to configure restrictions for (for example, <code>
   *     rum</code>, <code>apm</code>, or <code>logs</code>). (required)
   * @param body (required)
   * @return CompletableFuture&lt;DatasetRestrictionResponse&gt;
   */
  public CompletableFuture<DatasetRestrictionResponse> updateDatasetRestrictionAsync(
      String productType, DatasetRestrictionUpdateRequest body) {
    return updateDatasetRestrictionWithHttpInfoAsync(productType, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update the dataset restriction configuration for a specific product type. Sets the restriction
   * mode, optional ownership mode, and the list of principals that are exempt from restrictions.
   * Requires the <code>user_access_manage</code> permission. Changes are audited and take effect
   * immediately.
   *
   * @param productType The Datadog product type to configure restrictions for (for example, <code>
   *     rum</code>, <code>apm</code>, or <code>logs</code>). (required)
   * @param body (required)
   * @return ApiResponse&lt;DatasetRestrictionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<DatasetRestrictionResponse> updateDatasetRestrictionWithHttpInfo(
      String productType, DatasetRestrictionUpdateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateDatasetRestriction";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'productType' is set
    if (productType == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'productType' when calling updateDatasetRestriction");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateDatasetRestriction");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/dataset_restrictions/{product_type}"
            .replaceAll(
                "\\{" + "product_type" + "\\}", apiClient.escapeString(productType.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.DatasetRestrictionsApi.updateDatasetRestriction",
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
        new GenericType<DatasetRestrictionResponse>() {});
  }

  /**
   * Update a dataset restriction.
   *
   * <p>See {@link #updateDatasetRestrictionWithHttpInfo}.
   *
   * @param productType The Datadog product type to configure restrictions for (for example, <code>
   *     rum</code>, <code>apm</code>, or <code>logs</code>). (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;DatasetRestrictionResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<DatasetRestrictionResponse>>
      updateDatasetRestrictionWithHttpInfoAsync(
          String productType, DatasetRestrictionUpdateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "updateDatasetRestriction";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<DatasetRestrictionResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'productType' is set
    if (productType == null) {
      CompletableFuture<ApiResponse<DatasetRestrictionResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'productType' when calling"
                  + " updateDatasetRestriction"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<DatasetRestrictionResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateDatasetRestriction"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/dataset_restrictions/{product_type}"
            .replaceAll(
                "\\{" + "product_type" + "\\}", apiClient.escapeString(productType.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.DatasetRestrictionsApi.updateDatasetRestriction",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<DatasetRestrictionResponse>> result = new CompletableFuture<>();
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
        new GenericType<DatasetRestrictionResponse>() {});
  }
}
