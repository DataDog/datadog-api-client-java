package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.AWSCloudAuthPersonaMappingsResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CloudAuthenticationApi {
  private ApiClient apiClient;

  public CloudAuthenticationApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public CloudAuthenticationApi(ApiClient apiClient) {
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
   * List AWS cloud authentication persona mappings.
   *
   * <p>See {@link #listAWSCloudAuthPersonaMappingsWithHttpInfo}.
   *
   * @return AWSCloudAuthPersonaMappingsResponse
   * @throws ApiException if fails to make API call
   */
  public AWSCloudAuthPersonaMappingsResponse listAWSCloudAuthPersonaMappings() throws ApiException {
    return listAWSCloudAuthPersonaMappingsWithHttpInfo().getData();
  }

  /**
   * List AWS cloud authentication persona mappings.
   *
   * <p>See {@link #listAWSCloudAuthPersonaMappingsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;AWSCloudAuthPersonaMappingsResponse&gt;
   */
  public CompletableFuture<AWSCloudAuthPersonaMappingsResponse>
      listAWSCloudAuthPersonaMappingsAsync() {
    return listAWSCloudAuthPersonaMappingsWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List all AWS cloud authentication persona mappings. This endpoint retrieves all configured
   * persona mappings that associate AWS IAM principals with Datadog users.
   *
   * @return ApiResponse&lt;AWSCloudAuthPersonaMappingsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AWSCloudAuthPersonaMappingsResponse>
      listAWSCloudAuthPersonaMappingsWithHttpInfo() throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listAWSCloudAuthPersonaMappings";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/cloud_auth/aws/persona_mapping";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CloudAuthenticationApi.listAWSCloudAuthPersonaMappings",
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
        new GenericType<AWSCloudAuthPersonaMappingsResponse>() {});
  }

  /**
   * List AWS cloud authentication persona mappings.
   *
   * <p>See {@link #listAWSCloudAuthPersonaMappingsWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;AWSCloudAuthPersonaMappingsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AWSCloudAuthPersonaMappingsResponse>>
      listAWSCloudAuthPersonaMappingsWithHttpInfoAsync() {
    // Check if unstable operation is enabled
    String operationId = "listAWSCloudAuthPersonaMappings";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<AWSCloudAuthPersonaMappingsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/cloud_auth/aws/persona_mapping";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CloudAuthenticationApi.listAWSCloudAuthPersonaMappings",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AWSCloudAuthPersonaMappingsResponse>> result =
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
        new GenericType<AWSCloudAuthPersonaMappingsResponse>() {});
  }
}
