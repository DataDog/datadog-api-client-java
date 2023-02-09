package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.GetRestrictionPolicyResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RestrictionPoliciesApi {
  private ApiClient apiClient;

  public RestrictionPoliciesApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public RestrictionPoliciesApi(ApiClient apiClient) {
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
   * Get a restriction policy.
   *
   * <p>See {@link #getRestrictionPolicyWithHttpInfo}.
   *
   * @param resourceId Identifier, formatted as <code>type:id</code>. (required)
   * @return GetRestrictionPolicyResponse
   * @throws ApiException if fails to make API call
   */
  public GetRestrictionPolicyResponse getRestrictionPolicy(String resourceId) throws ApiException {
    return getRestrictionPolicyWithHttpInfo(resourceId).getData();
  }

  /**
   * Get a restriction policy.
   *
   * <p>See {@link #getRestrictionPolicyWithHttpInfoAsync}.
   *
   * @param resourceId Identifier, formatted as <code>type:id</code>. (required)
   * @return CompletableFuture&lt;GetRestrictionPolicyResponse&gt;
   */
  public CompletableFuture<GetRestrictionPolicyResponse> getRestrictionPolicyAsync(
      String resourceId) {
    return getRestrictionPolicyWithHttpInfoAsync(resourceId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Retrieves the restriction policy associated with a specified resource.
   *
   * @param resourceId Identifier, formatted as <code>type:id</code>. (required)
   * @return ApiResponse&lt;GetRestrictionPolicyResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<GetRestrictionPolicyResponse> getRestrictionPolicyWithHttpInfo(
      String resourceId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'resourceId' is set
    if (resourceId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'resourceId' when calling getRestrictionPolicy");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/restriction_policy/{resource_id}"
            .replaceAll(
                "\\{" + "resource_id" + "\\}", apiClient.escapeString(resourceId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.RestrictionPoliciesApi.getRestrictionPolicy",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<GetRestrictionPolicyResponse>() {});
  }

  /**
   * Get a restriction policy.
   *
   * <p>See {@link #getRestrictionPolicyWithHttpInfo}.
   *
   * @param resourceId Identifier, formatted as <code>type:id</code>. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;GetRestrictionPolicyResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<GetRestrictionPolicyResponse>>
      getRestrictionPolicyWithHttpInfoAsync(String resourceId) {
    Object localVarPostBody = null;

    // verify the required parameter 'resourceId' is set
    if (resourceId == null) {
      CompletableFuture<ApiResponse<GetRestrictionPolicyResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'resourceId' when calling getRestrictionPolicy"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/restriction_policy/{resource_id}"
            .replaceAll(
                "\\{" + "resource_id" + "\\}", apiClient.escapeString(resourceId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.RestrictionPoliciesApi.getRestrictionPolicy",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<GetRestrictionPolicyResponse>> result =
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
        new GenericType<GetRestrictionPolicyResponse>() {});
  }
}
