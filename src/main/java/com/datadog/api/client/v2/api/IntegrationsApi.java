package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.ListIntegrationsResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IntegrationsApi {
  private ApiClient apiClient;

  public IntegrationsApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public IntegrationsApi(ApiClient apiClient) {
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
   * List Integrations.
   *
   * <p>See {@link #listIntegrationsWithHttpInfo}.
   *
   * @return ListIntegrationsResponse
   * @throws ApiException if fails to make API call
   */
  public ListIntegrationsResponse listIntegrations() throws ApiException {
    return listIntegrationsWithHttpInfo().getData();
  }

  /**
   * List Integrations.
   *
   * <p>See {@link #listIntegrationsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;ListIntegrationsResponse&gt;
   */
  public CompletableFuture<ListIntegrationsResponse> listIntegrationsAsync() {
    return listIntegrationsWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * @return ApiResponse&lt;ListIntegrationsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> Successful Response. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ListIntegrationsResponse> listIntegrationsWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/integrations";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IntegrationsApi.listIntegrations",
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
        new GenericType<ListIntegrationsResponse>() {});
  }

  /**
   * List Integrations.
   *
   * <p>See {@link #listIntegrationsWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;ListIntegrationsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ListIntegrationsResponse>>
      listIntegrationsWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/integrations";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IntegrationsApi.listIntegrations",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ListIntegrationsResponse>> result = new CompletableFuture<>();
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
        new GenericType<ListIntegrationsResponse>() {});
  }
}
