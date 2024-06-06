package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.AWSAccountCreateRequest;
import com.datadog.api.client.v2.model.AWSAccountPatchRequest;
import com.datadog.api.client.v2.model.AWSAccountResponse;
import com.datadog.api.client.v2.model.AWSAccountsResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AwsIntegrationApi {
  private ApiClient apiClient;

  public AwsIntegrationApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public AwsIntegrationApi(ApiClient apiClient) {
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
   * AWS Integration - Create account.
   *
   * <p>See {@link #createAWSAccountv2WithHttpInfo}.
   *
   * @param body (required)
   * @return AWSAccountResponse
   * @throws ApiException if fails to make API call
   */
  public AWSAccountResponse createAWSAccountv2(AWSAccountCreateRequest body) throws ApiException {
    return createAWSAccountv2WithHttpInfo(body).getData();
  }

  /**
   * AWS Integration - Create account.
   *
   * <p>See {@link #createAWSAccountv2WithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;AWSAccountResponse&gt;
   */
  public CompletableFuture<AWSAccountResponse> createAWSAccountv2Async(
      AWSAccountCreateRequest body) {
    return createAWSAccountv2WithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a new AWS account
   *
   * @param body (required)
   * @return ApiResponse&lt;AWSAccountResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> AWS Account object </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> API error response. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AWSAccountResponse> createAWSAccountv2WithHttpInfo(
      AWSAccountCreateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createAWSAccountv2";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createAWSAccountv2");
    }
    // create path and map variables
    String localVarPath = "/api/v2/integration/aws/accounts";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AwsIntegrationApi.createAWSAccountv2",
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
        new GenericType<AWSAccountResponse>() {});
  }

  /**
   * AWS Integration - Create account.
   *
   * <p>See {@link #createAWSAccountv2WithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AWSAccountResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AWSAccountResponse>> createAWSAccountv2WithHttpInfoAsync(
      AWSAccountCreateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createAWSAccountv2";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<AWSAccountResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<AWSAccountResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createAWSAccountv2"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/integration/aws/accounts";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AwsIntegrationApi.createAWSAccountv2",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AWSAccountResponse>> result = new CompletableFuture<>();
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
        new GenericType<AWSAccountResponse>() {});
  }

  /**
   * AWS Integration - Delete account.
   *
   * <p>See {@link #deleteAWSAccountv2WithHttpInfo}.
   *
   * @param awsAccountConfigId None (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteAWSAccountv2(String awsAccountConfigId) throws ApiException {
    deleteAWSAccountv2WithHttpInfo(awsAccountConfigId);
  }

  /**
   * AWS Integration - Delete account.
   *
   * <p>See {@link #deleteAWSAccountv2WithHttpInfoAsync}.
   *
   * @param awsAccountConfigId None (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteAWSAccountv2Async(String awsAccountConfigId) {
    return deleteAWSAccountv2WithHttpInfoAsync(awsAccountConfigId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete an AWS account
   *
   * @param awsAccountConfigId None (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> API error response. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteAWSAccountv2WithHttpInfo(String awsAccountConfigId)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteAWSAccountv2";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'awsAccountConfigId' is set
    if (awsAccountConfigId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'awsAccountConfigId' when calling deleteAWSAccountv2");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration/aws/accounts/{aws_account_config_id}"
            .replaceAll(
                "\\{" + "aws_account_config_id" + "\\}",
                apiClient.escapeString(awsAccountConfigId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AwsIntegrationApi.deleteAWSAccountv2",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * AWS Integration - Delete account.
   *
   * <p>See {@link #deleteAWSAccountv2WithHttpInfo}.
   *
   * @param awsAccountConfigId None (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteAWSAccountv2WithHttpInfoAsync(
      String awsAccountConfigId) {
    // Check if unstable operation is enabled
    String operationId = "deleteAWSAccountv2";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'awsAccountConfigId' is set
    if (awsAccountConfigId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'awsAccountConfigId' when calling"
                  + " deleteAWSAccountv2"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration/aws/accounts/{aws_account_config_id}"
            .replaceAll(
                "\\{" + "aws_account_config_id" + "\\}",
                apiClient.escapeString(awsAccountConfigId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AwsIntegrationApi.deleteAWSAccountv2",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"*/*"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * AWS Integration - Get account.
   *
   * <p>See {@link #getAWSAccountv2WithHttpInfo}.
   *
   * @param awsAccountConfigId None (required)
   * @return AWSAccountResponse
   * @throws ApiException if fails to make API call
   */
  public AWSAccountResponse getAWSAccountv2(String awsAccountConfigId) throws ApiException {
    return getAWSAccountv2WithHttpInfo(awsAccountConfigId).getData();
  }

  /**
   * AWS Integration - Get account.
   *
   * <p>See {@link #getAWSAccountv2WithHttpInfoAsync}.
   *
   * @param awsAccountConfigId None (required)
   * @return CompletableFuture&lt;AWSAccountResponse&gt;
   */
  public CompletableFuture<AWSAccountResponse> getAWSAccountv2Async(String awsAccountConfigId) {
    return getAWSAccountv2WithHttpInfoAsync(awsAccountConfigId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get an AWS account
   *
   * @param awsAccountConfigId None (required)
   * @return ApiResponse&lt;AWSAccountResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> AWS Account object </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> API error response. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AWSAccountResponse> getAWSAccountv2WithHttpInfo(String awsAccountConfigId)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getAWSAccountv2";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'awsAccountConfigId' is set
    if (awsAccountConfigId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'awsAccountConfigId' when calling getAWSAccountv2");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration/aws/accounts/{aws_account_config_id}"
            .replaceAll(
                "\\{" + "aws_account_config_id" + "\\}",
                apiClient.escapeString(awsAccountConfigId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AwsIntegrationApi.getAWSAccountv2",
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
        new GenericType<AWSAccountResponse>() {});
  }

  /**
   * AWS Integration - Get account.
   *
   * <p>See {@link #getAWSAccountv2WithHttpInfo}.
   *
   * @param awsAccountConfigId None (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AWSAccountResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AWSAccountResponse>> getAWSAccountv2WithHttpInfoAsync(
      String awsAccountConfigId) {
    // Check if unstable operation is enabled
    String operationId = "getAWSAccountv2";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<AWSAccountResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'awsAccountConfigId' is set
    if (awsAccountConfigId == null) {
      CompletableFuture<ApiResponse<AWSAccountResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'awsAccountConfigId' when calling getAWSAccountv2"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration/aws/accounts/{aws_account_config_id}"
            .replaceAll(
                "\\{" + "aws_account_config_id" + "\\}",
                apiClient.escapeString(awsAccountConfigId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AwsIntegrationApi.getAWSAccountv2",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AWSAccountResponse>> result = new CompletableFuture<>();
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
        new GenericType<AWSAccountResponse>() {});
  }

  /**
   * AWS Integration - Get all accounts.
   *
   * <p>See {@link #listAWSAccountsv2WithHttpInfo}.
   *
   * @return AWSAccountsResponse
   * @throws ApiException if fails to make API call
   */
  public AWSAccountsResponse listAWSAccountsv2() throws ApiException {
    return listAWSAccountsv2WithHttpInfo().getData();
  }

  /**
   * AWS Integration - Get all accounts.
   *
   * <p>See {@link #listAWSAccountsv2WithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;AWSAccountsResponse&gt;
   */
  public CompletableFuture<AWSAccountsResponse> listAWSAccountsv2Async() {
    return listAWSAccountsv2WithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get all AWS accounts
   *
   * @return ApiResponse&lt;AWSAccountsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> AWS Account object </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AWSAccountsResponse> listAWSAccountsv2WithHttpInfo() throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listAWSAccountsv2";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/integration/aws/accounts";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AwsIntegrationApi.listAWSAccountsv2",
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
        new GenericType<AWSAccountsResponse>() {});
  }

  /**
   * AWS Integration - Get all accounts.
   *
   * <p>See {@link #listAWSAccountsv2WithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;AWSAccountsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AWSAccountsResponse>> listAWSAccountsv2WithHttpInfoAsync() {
    // Check if unstable operation is enabled
    String operationId = "listAWSAccountsv2";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<AWSAccountsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/integration/aws/accounts";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AwsIntegrationApi.listAWSAccountsv2",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AWSAccountsResponse>> result = new CompletableFuture<>();
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
        new GenericType<AWSAccountsResponse>() {});
  }

  /**
   * AWS Integration - Patch account.
   *
   * <p>See {@link #patchAWSAccountv2WithHttpInfo}.
   *
   * @param awsAccountConfigId None (required)
   * @param body (required)
   * @throws ApiException if fails to make API call
   */
  public void patchAWSAccountv2(String awsAccountConfigId, AWSAccountPatchRequest body)
      throws ApiException {
    patchAWSAccountv2WithHttpInfo(awsAccountConfigId, body);
  }

  /**
   * AWS Integration - Patch account.
   *
   * <p>See {@link #patchAWSAccountv2WithHttpInfoAsync}.
   *
   * @param awsAccountConfigId None (required)
   * @param body (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> patchAWSAccountv2Async(
      String awsAccountConfigId, AWSAccountPatchRequest body) {
    return patchAWSAccountv2WithHttpInfoAsync(awsAccountConfigId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Patch an AWS account
   *
   * @param awsAccountConfigId None (required)
   * @param body (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> API error response. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> patchAWSAccountv2WithHttpInfo(
      String awsAccountConfigId, AWSAccountPatchRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "patchAWSAccountv2";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'awsAccountConfigId' is set
    if (awsAccountConfigId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'awsAccountConfigId' when calling patchAWSAccountv2");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling patchAWSAccountv2");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration/aws/accounts/{aws_account_config_id}"
            .replaceAll(
                "\\{" + "aws_account_config_id" + "\\}",
                apiClient.escapeString(awsAccountConfigId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AwsIntegrationApi.patchAWSAccountv2",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * AWS Integration - Patch account.
   *
   * <p>See {@link #patchAWSAccountv2WithHttpInfo}.
   *
   * @param awsAccountConfigId None (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> patchAWSAccountv2WithHttpInfoAsync(
      String awsAccountConfigId, AWSAccountPatchRequest body) {
    // Check if unstable operation is enabled
    String operationId = "patchAWSAccountv2";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'awsAccountConfigId' is set
    if (awsAccountConfigId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'awsAccountConfigId' when calling"
                  + " patchAWSAccountv2"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling patchAWSAccountv2"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration/aws/accounts/{aws_account_config_id}"
            .replaceAll(
                "\\{" + "aws_account_config_id" + "\\}",
                apiClient.escapeString(awsAccountConfigId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AwsIntegrationApi.patchAWSAccountv2",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"*/*"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
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
        null);
  }
}
