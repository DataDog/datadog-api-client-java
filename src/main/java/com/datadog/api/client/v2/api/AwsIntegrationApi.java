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
   * AWS Integration - Create account config.
   *
   * <p>See {@link #createAWSAccountWithHttpInfo}.
   *
   * @param body (required)
   * @return AWSAccountResponse
   * @throws ApiException if fails to make API call
   */
  public AWSAccountResponse createAWSAccount(AWSAccountCreateRequest body) throws ApiException {
    return createAWSAccountWithHttpInfo(body).getData();
  }

  /**
   * AWS Integration - Create account config.
   *
   * <p>See {@link #createAWSAccountWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;AWSAccountResponse&gt;
   */
  public CompletableFuture<AWSAccountResponse> createAWSAccountAsync(AWSAccountCreateRequest body) {
    return createAWSAccountWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a new AWS Account Integration Config
   *
   * @param body (required)
   * @return ApiResponse&lt;AWSAccountResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> AWS Account object </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AWSAccountResponse> createAWSAccountWithHttpInfo(AWSAccountCreateRequest body)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createAWSAccount";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createAWSAccount");
    }
    // create path and map variables
    String localVarPath = "/api/v2/integration/aws/accounts";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AwsIntegrationApi.createAWSAccount",
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
   * AWS Integration - Create account config.
   *
   * <p>See {@link #createAWSAccountWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AWSAccountResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AWSAccountResponse>> createAWSAccountWithHttpInfoAsync(
      AWSAccountCreateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createAWSAccount";
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
              400, "Missing the required parameter 'body' when calling createAWSAccount"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/integration/aws/accounts";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AwsIntegrationApi.createAWSAccount",
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
   * AWS Integration - Delete account config.
   *
   * <p>See {@link #deleteAWSAccountWithHttpInfo}.
   *
   * @param awsAccountId The ID of the AWS Account Integration Config (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteAWSAccount(String awsAccountId) throws ApiException {
    deleteAWSAccountWithHttpInfo(awsAccountId);
  }

  /**
   * AWS Integration - Delete account config.
   *
   * <p>See {@link #deleteAWSAccountWithHttpInfoAsync}.
   *
   * @param awsAccountId The ID of the AWS Account Integration Config (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteAWSAccountAsync(String awsAccountId) {
    return deleteAWSAccountWithHttpInfoAsync(awsAccountId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete an AWS Account Integration Config
   *
   * @param awsAccountId The ID of the AWS Account Integration Config (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteAWSAccountWithHttpInfo(String awsAccountId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteAWSAccount";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'awsAccountId' is set
    if (awsAccountId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'awsAccountId' when calling deleteAWSAccount");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration/aws/accounts/{aws_account_id}"
            .replaceAll(
                "\\{" + "aws_account_id" + "\\}", apiClient.escapeString(awsAccountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AwsIntegrationApi.deleteAWSAccount",
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
   * AWS Integration - Delete account config.
   *
   * <p>See {@link #deleteAWSAccountWithHttpInfo}.
   *
   * @param awsAccountId The ID of the AWS Account Integration Config (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteAWSAccountWithHttpInfoAsync(
      String awsAccountId) {
    // Check if unstable operation is enabled
    String operationId = "deleteAWSAccount";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'awsAccountId' is set
    if (awsAccountId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'awsAccountId' when calling deleteAWSAccount"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration/aws/accounts/{aws_account_id}"
            .replaceAll(
                "\\{" + "aws_account_id" + "\\}", apiClient.escapeString(awsAccountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AwsIntegrationApi.deleteAWSAccount",
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
   * AWS Integration - Get account config.
   *
   * <p>See {@link #getAWSAccountWithHttpInfo}.
   *
   * @param awsAccountId The ID of the AWS Account Integration Config (required)
   * @return AWSAccountResponse
   * @throws ApiException if fails to make API call
   */
  public AWSAccountResponse getAWSAccount(String awsAccountId) throws ApiException {
    return getAWSAccountWithHttpInfo(awsAccountId).getData();
  }

  /**
   * AWS Integration - Get account config.
   *
   * <p>See {@link #getAWSAccountWithHttpInfoAsync}.
   *
   * @param awsAccountId The ID of the AWS Account Integration Config (required)
   * @return CompletableFuture&lt;AWSAccountResponse&gt;
   */
  public CompletableFuture<AWSAccountResponse> getAWSAccountAsync(String awsAccountId) {
    return getAWSAccountWithHttpInfoAsync(awsAccountId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get an AWS Account Integration Config
   *
   * @param awsAccountId The ID of the AWS Account Integration Config (required)
   * @return ApiResponse&lt;AWSAccountResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> AWS Account object </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AWSAccountResponse> getAWSAccountWithHttpInfo(String awsAccountId)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getAWSAccount";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'awsAccountId' is set
    if (awsAccountId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'awsAccountId' when calling getAWSAccount");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration/aws/accounts/{aws_account_id}"
            .replaceAll(
                "\\{" + "aws_account_id" + "\\}", apiClient.escapeString(awsAccountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AwsIntegrationApi.getAWSAccount",
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
   * AWS Integration - Get account config.
   *
   * <p>See {@link #getAWSAccountWithHttpInfo}.
   *
   * @param awsAccountId The ID of the AWS Account Integration Config (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AWSAccountResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AWSAccountResponse>> getAWSAccountWithHttpInfoAsync(
      String awsAccountId) {
    // Check if unstable operation is enabled
    String operationId = "getAWSAccount";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<AWSAccountResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'awsAccountId' is set
    if (awsAccountId == null) {
      CompletableFuture<ApiResponse<AWSAccountResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'awsAccountId' when calling getAWSAccount"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration/aws/accounts/{aws_account_id}"
            .replaceAll(
                "\\{" + "aws_account_id" + "\\}", apiClient.escapeString(awsAccountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AwsIntegrationApi.getAWSAccount",
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
   * AWS Integration - Get all account configs.
   *
   * <p>See {@link #listAWSAccountsWithHttpInfo}.
   *
   * @return AWSAccountsResponse
   * @throws ApiException if fails to make API call
   */
  public AWSAccountsResponse listAWSAccounts() throws ApiException {
    return listAWSAccountsWithHttpInfo().getData();
  }

  /**
   * AWS Integration - Get all account configs.
   *
   * <p>See {@link #listAWSAccountsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;AWSAccountsResponse&gt;
   */
  public CompletableFuture<AWSAccountsResponse> listAWSAccountsAsync() {
    return listAWSAccountsWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get all AWS Account Integration Configs
   *
   * @return ApiResponse&lt;AWSAccountsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> AWS Accounts List object </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AWSAccountsResponse> listAWSAccountsWithHttpInfo() throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listAWSAccounts";
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
            "v2.AwsIntegrationApi.listAWSAccounts",
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
   * AWS Integration - Get all account configs.
   *
   * <p>See {@link #listAWSAccountsWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;AWSAccountsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AWSAccountsResponse>> listAWSAccountsWithHttpInfoAsync() {
    // Check if unstable operation is enabled
    String operationId = "listAWSAccounts";
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
              "v2.AwsIntegrationApi.listAWSAccounts",
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
   * AWS Integration - Patch account config.
   *
   * <p>See {@link #updateAWSAccountWithHttpInfo}.
   *
   * @param awsAccountId The ID of the AWS Account Integration Config (required)
   * @param body (required)
   * @return AWSAccountResponse
   * @throws ApiException if fails to make API call
   */
  public AWSAccountResponse updateAWSAccount(String awsAccountId, AWSAccountPatchRequest body)
      throws ApiException {
    return updateAWSAccountWithHttpInfo(awsAccountId, body).getData();
  }

  /**
   * AWS Integration - Patch account config.
   *
   * <p>See {@link #updateAWSAccountWithHttpInfoAsync}.
   *
   * @param awsAccountId The ID of the AWS Account Integration Config (required)
   * @param body (required)
   * @return CompletableFuture&lt;AWSAccountResponse&gt;
   */
  public CompletableFuture<AWSAccountResponse> updateAWSAccountAsync(
      String awsAccountId, AWSAccountPatchRequest body) {
    return updateAWSAccountWithHttpInfoAsync(awsAccountId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update an AWS Account Integration Config
   *
   * @param awsAccountId The ID of the AWS Account Integration Config (required)
   * @param body (required)
   * @return ApiResponse&lt;AWSAccountResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> AWS Account object </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AWSAccountResponse> updateAWSAccountWithHttpInfo(
      String awsAccountId, AWSAccountPatchRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateAWSAccount";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'awsAccountId' is set
    if (awsAccountId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'awsAccountId' when calling updateAWSAccount");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateAWSAccount");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration/aws/accounts/{aws_account_id}"
            .replaceAll(
                "\\{" + "aws_account_id" + "\\}", apiClient.escapeString(awsAccountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AwsIntegrationApi.updateAWSAccount",
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
        new GenericType<AWSAccountResponse>() {});
  }

  /**
   * AWS Integration - Patch account config.
   *
   * <p>See {@link #updateAWSAccountWithHttpInfo}.
   *
   * @param awsAccountId The ID of the AWS Account Integration Config (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AWSAccountResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AWSAccountResponse>> updateAWSAccountWithHttpInfoAsync(
      String awsAccountId, AWSAccountPatchRequest body) {
    // Check if unstable operation is enabled
    String operationId = "updateAWSAccount";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<AWSAccountResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'awsAccountId' is set
    if (awsAccountId == null) {
      CompletableFuture<ApiResponse<AWSAccountResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'awsAccountId' when calling updateAWSAccount"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<AWSAccountResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateAWSAccount"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration/aws/accounts/{aws_account_id}"
            .replaceAll(
                "\\{" + "aws_account_id" + "\\}", apiClient.escapeString(awsAccountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AwsIntegrationApi.updateAWSAccount",
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
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<AWSAccountResponse>() {});
  }
}
