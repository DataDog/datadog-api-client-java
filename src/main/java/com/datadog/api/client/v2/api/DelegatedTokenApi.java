package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.DelegatedTokenResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DelegatedTokenApi {
  private ApiClient apiClient;

  public DelegatedTokenApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public DelegatedTokenApi(ApiClient apiClient) {
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
   * Get a delegated token.
   *
   * <p>See {@link #getDelegatedTokenWithHttpInfo}.
   *
   * @return DelegatedTokenResponse
   * @throws ApiException if fails to make API call
   */
  public DelegatedTokenResponse getDelegatedToken() throws ApiException {
    return getDelegatedTokenWithHttpInfo().getData();
  }

  /**
   * Get a delegated token.
   *
   * <p>See {@link #getDelegatedTokenWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;DelegatedTokenResponse&gt;
   */
  public CompletableFuture<DelegatedTokenResponse> getDelegatedTokenAsync() {
    return getDelegatedTokenWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Exchange a Workload Identity Federation (WIF) proof or Datadog credentials for a short-lived
   * access token scoped to a Datadog user.
   *
   * <p>To authenticate with a WIF identity, pass the cloud-provider token in the <code>
   * Authorization</code> header using the <code>Bearer</code> or <code>Delegated</code> scheme.
   * Datadog resolves the Datadog user from the persona mapping configured for that cloud identity.
   *
   * <p>To obtain a token for the calling user directly, authenticate with standard Datadog API and
   * application keys.
   *
   * <p>Use the returned <code>access_token</code> as a bearer token in subsequent API calls.
   *
   * @return ApiResponse&lt;DelegatedTokenResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized — missing or invalid authorization proof. </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden — the cloud identity is not mapped to any Datadog user, or the authenticated user does not have access. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<DelegatedTokenResponse> getDelegatedTokenWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/delegated-token";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.DelegatedTokenApi.getDelegatedToken",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<DelegatedTokenResponse>() {});
  }

  /**
   * Get a delegated token.
   *
   * <p>See {@link #getDelegatedTokenWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;DelegatedTokenResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<DelegatedTokenResponse>>
      getDelegatedTokenWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/delegated-token";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.DelegatedTokenApi.getDelegatedToken",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<DelegatedTokenResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<DelegatedTokenResponse>() {});
  }
}
