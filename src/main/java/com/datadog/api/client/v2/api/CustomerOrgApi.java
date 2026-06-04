package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.CustomerOrgDisableRequest;
import com.datadog.api.client.v2.model.CustomerOrgDisableResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CustomerOrgApi {
  private ApiClient apiClient;

  public CustomerOrgApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public CustomerOrgApi(ApiClient apiClient) {
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
   * Disable the authenticated customer organization.
   *
   * <p>See {@link #disableCustomerOrgWithHttpInfo}.
   *
   * @param body (required)
   * @return CustomerOrgDisableResponse
   * @throws ApiException if fails to make API call
   */
  public CustomerOrgDisableResponse disableCustomerOrg(CustomerOrgDisableRequest body)
      throws ApiException {
    return disableCustomerOrgWithHttpInfo(body).getData();
  }

  /**
   * Disable the authenticated customer organization.
   *
   * <p>See {@link #disableCustomerOrgWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;CustomerOrgDisableResponse&gt;
   */
  public CompletableFuture<CustomerOrgDisableResponse> disableCustomerOrgAsync(
      CustomerOrgDisableRequest body) {
    return disableCustomerOrgWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Disable the Datadog organization associated with the authenticated user or API key. The request
   * body uses JSON:API format. If <code>org_uuid</code> is supplied, it must match the
   * authenticated org or the request is rejected. Successful calls disable the org and return the
   * resulting state from the downstream service. Requires the <code>org_management</code>
   * permission.
   *
   * @param body (required)
   * @return ApiResponse&lt;CustomerOrgDisableResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CustomerOrgDisableResponse> disableCustomerOrgWithHttpInfo(
      CustomerOrgDisableRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "disableCustomerOrg";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling disableCustomerOrg");
    }
    // create path and map variables
    String localVarPath = "/api/v2/org/disable";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CustomerOrgApi.disableCustomerOrg",
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
        new GenericType<CustomerOrgDisableResponse>() {});
  }

  /**
   * Disable the authenticated customer organization.
   *
   * <p>See {@link #disableCustomerOrgWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CustomerOrgDisableResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CustomerOrgDisableResponse>>
      disableCustomerOrgWithHttpInfoAsync(CustomerOrgDisableRequest body) {
    // Check if unstable operation is enabled
    String operationId = "disableCustomerOrg";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<CustomerOrgDisableResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<CustomerOrgDisableResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling disableCustomerOrg"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/org/disable";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CustomerOrgApi.disableCustomerOrg",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CustomerOrgDisableResponse>> result = new CompletableFuture<>();
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
        new GenericType<CustomerOrgDisableResponse>() {});
  }
}
