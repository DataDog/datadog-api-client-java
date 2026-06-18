package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.IntakeAPIKeyResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IntakeKeyApi {
  private ApiClient apiClient;

  public IntakeKeyApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public IntakeKeyApi(ApiClient apiClient) {
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
   * Get an intake API key.
   *
   * <p>See {@link #getIntakeKeyWithHttpInfo}.
   *
   * @return IntakeAPIKeyResponse
   * @throws ApiException if fails to make API call
   */
  public IntakeAPIKeyResponse getIntakeKey() throws ApiException {
    return getIntakeKeyWithHttpInfo().getData();
  }

  /**
   * Get an intake API key.
   *
   * <p>See {@link #getIntakeKeyWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;IntakeAPIKeyResponse&gt;
   */
  public CompletableFuture<IntakeAPIKeyResponse> getIntakeKeyAsync() {
    return getIntakeKeyWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Exchanges a Workload Identity Federation (WIF) identity proof for a Datadog API key associated
   * with the matching WIF intake mapping.
   *
   * <p>Pass a cloud-provider token in the <code>Authorization</code> header using the <code>Bearer
   * </code> or <code>Delegated</code> scheme. The token is validated against the WIF intake
   * mappings configured for the caller's organization. On success, a managed-rotation API key is
   * returned that the workload can use to send telemetry to Datadog.
   *
   * <p>Unlike the delegated-token endpoint (<code>POST /api/v2/delegated-token</code>), this
   * endpoint authenticates the cloud workload at the organization level rather than mapping it to a
   * specific Datadog user.
   *
   * <p>Standard Datadog API and application key authentication is not accepted. Authenticate using
   * a cloud-provider token in the <code>Authorization: Bearer</code> header.
   *
   * @return ApiResponse&lt;IntakeAPIKeyResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized — missing or invalid authorization proof. </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden — the cloud identity is not matched by any intake mapping for this organization. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<IntakeAPIKeyResponse> getIntakeKeyWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/intake-key";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IntakeKeyApi.getIntakeKey",
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
        new GenericType<IntakeAPIKeyResponse>() {});
  }

  /**
   * Get an intake API key.
   *
   * <p>See {@link #getIntakeKeyWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;IntakeAPIKeyResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IntakeAPIKeyResponse>> getIntakeKeyWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/intake-key";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IntakeKeyApi.getIntakeKey",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IntakeAPIKeyResponse>> result = new CompletableFuture<>();
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
        new GenericType<IntakeAPIKeyResponse>() {});
  }
}
