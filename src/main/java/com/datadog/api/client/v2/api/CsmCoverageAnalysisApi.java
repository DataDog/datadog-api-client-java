package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.CsmCloudAccountsCoverageAnalysisResponse;
import com.datadog.api.client.v2.model.CsmHostsAndContainersCoverageAnalysisResponse;
import com.datadog.api.client.v2.model.CsmServerlessCoverageAnalysisResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CsmCoverageAnalysisApi {
  private ApiClient apiClient;

  public CsmCoverageAnalysisApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public CsmCoverageAnalysisApi(ApiClient apiClient) {
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
   * Get the CSM Cloud Accounts Coverage Analysis.
   *
   * <p>See {@link #getCSMCloudAccountsCoverageAnalysisWithHttpInfo}.
   *
   * @return CsmCloudAccountsCoverageAnalysisResponse
   * @throws ApiException if fails to make API call
   */
  public CsmCloudAccountsCoverageAnalysisResponse getCSMCloudAccountsCoverageAnalysis()
      throws ApiException {
    return getCSMCloudAccountsCoverageAnalysisWithHttpInfo().getData();
  }

  /**
   * Get the CSM Cloud Accounts Coverage Analysis.
   *
   * <p>See {@link #getCSMCloudAccountsCoverageAnalysisWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;CsmCloudAccountsCoverageAnalysisResponse&gt;
   */
  public CompletableFuture<CsmCloudAccountsCoverageAnalysisResponse>
      getCSMCloudAccountsCoverageAnalysisAsync() {
    return getCSMCloudAccountsCoverageAnalysisWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the CSM Coverage Analysis of your Cloud Accounts. This is calculated based on the number of
   * your Cloud Accounts that are scanned for security issues.
   *
   * @return ApiResponse&lt;CsmCloudAccountsCoverageAnalysisResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CsmCloudAccountsCoverageAnalysisResponse>
      getCSMCloudAccountsCoverageAnalysisWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/csm/onboarding/coverage_analysis/cloud_accounts";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CsmCoverageAnalysisApi.getCSMCloudAccountsCoverageAnalysis",
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
        new GenericType<CsmCloudAccountsCoverageAnalysisResponse>() {});
  }

  /**
   * Get the CSM Cloud Accounts Coverage Analysis.
   *
   * <p>See {@link #getCSMCloudAccountsCoverageAnalysisWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;CsmCloudAccountsCoverageAnalysisResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CsmCloudAccountsCoverageAnalysisResponse>>
      getCSMCloudAccountsCoverageAnalysisWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/csm/onboarding/coverage_analysis/cloud_accounts";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CsmCoverageAnalysisApi.getCSMCloudAccountsCoverageAnalysis",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CsmCloudAccountsCoverageAnalysisResponse>> result =
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
        new GenericType<CsmCloudAccountsCoverageAnalysisResponse>() {});
  }

  /**
   * Get the CSM Hosts and Containers Coverage Analysis.
   *
   * <p>See {@link #getCSMHostsAndContainersCoverageAnalysisWithHttpInfo}.
   *
   * @return CsmHostsAndContainersCoverageAnalysisResponse
   * @throws ApiException if fails to make API call
   */
  public CsmHostsAndContainersCoverageAnalysisResponse getCSMHostsAndContainersCoverageAnalysis()
      throws ApiException {
    return getCSMHostsAndContainersCoverageAnalysisWithHttpInfo().getData();
  }

  /**
   * Get the CSM Hosts and Containers Coverage Analysis.
   *
   * <p>See {@link #getCSMHostsAndContainersCoverageAnalysisWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;CsmHostsAndContainersCoverageAnalysisResponse&gt;
   */
  public CompletableFuture<CsmHostsAndContainersCoverageAnalysisResponse>
      getCSMHostsAndContainersCoverageAnalysisAsync() {
    return getCSMHostsAndContainersCoverageAnalysisWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the CSM Coverage Analysis of your Hosts and Containers. This is calculated based on the
   * number of agents running on your Hosts and Containers with CSM feature(s) enabled.
   *
   * @return ApiResponse&lt;CsmHostsAndContainersCoverageAnalysisResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CsmHostsAndContainersCoverageAnalysisResponse>
      getCSMHostsAndContainersCoverageAnalysisWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/csm/onboarding/coverage_analysis/hosts_and_containers";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CsmCoverageAnalysisApi.getCSMHostsAndContainersCoverageAnalysis",
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
        new GenericType<CsmHostsAndContainersCoverageAnalysisResponse>() {});
  }

  /**
   * Get the CSM Hosts and Containers Coverage Analysis.
   *
   * <p>See {@link #getCSMHostsAndContainersCoverageAnalysisWithHttpInfo}.
   *
   * @return
   *     CompletableFuture&lt;ApiResponse&lt;CsmHostsAndContainersCoverageAnalysisResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CsmHostsAndContainersCoverageAnalysisResponse>>
      getCSMHostsAndContainersCoverageAnalysisWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/csm/onboarding/coverage_analysis/hosts_and_containers";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CsmCoverageAnalysisApi.getCSMHostsAndContainersCoverageAnalysis",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CsmHostsAndContainersCoverageAnalysisResponse>> result =
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
        new GenericType<CsmHostsAndContainersCoverageAnalysisResponse>() {});
  }

  /**
   * Get the CSM Serverless Coverage Analysis.
   *
   * <p>See {@link #getCSMServerlessCoverageAnalysisWithHttpInfo}.
   *
   * @return CsmServerlessCoverageAnalysisResponse
   * @throws ApiException if fails to make API call
   */
  public CsmServerlessCoverageAnalysisResponse getCSMServerlessCoverageAnalysis()
      throws ApiException {
    return getCSMServerlessCoverageAnalysisWithHttpInfo().getData();
  }

  /**
   * Get the CSM Serverless Coverage Analysis.
   *
   * <p>See {@link #getCSMServerlessCoverageAnalysisWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;CsmServerlessCoverageAnalysisResponse&gt;
   */
  public CompletableFuture<CsmServerlessCoverageAnalysisResponse>
      getCSMServerlessCoverageAnalysisAsync() {
    return getCSMServerlessCoverageAnalysisWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the CSM Coverage Analysis of your Serverless Resources. This is calculated based on the
   * number of agents running on your Serverless Resources with CSM feature(s) enabled.
   *
   * @return ApiResponse&lt;CsmServerlessCoverageAnalysisResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CsmServerlessCoverageAnalysisResponse>
      getCSMServerlessCoverageAnalysisWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/csm/onboarding/coverage_analysis/serverless";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CsmCoverageAnalysisApi.getCSMServerlessCoverageAnalysis",
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
        new GenericType<CsmServerlessCoverageAnalysisResponse>() {});
  }

  /**
   * Get the CSM Serverless Coverage Analysis.
   *
   * <p>See {@link #getCSMServerlessCoverageAnalysisWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;CsmServerlessCoverageAnalysisResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CsmServerlessCoverageAnalysisResponse>>
      getCSMServerlessCoverageAnalysisWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/csm/onboarding/coverage_analysis/serverless";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CsmCoverageAnalysisApi.getCSMServerlessCoverageAnalysis",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CsmServerlessCoverageAnalysisResponse>> result =
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
        new GenericType<CsmServerlessCoverageAnalysisResponse>() {});
  }
}
