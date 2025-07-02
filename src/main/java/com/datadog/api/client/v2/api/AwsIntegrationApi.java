package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.AWSAccountCreateRequest;
import com.datadog.api.client.v2.model.AWSAccountResponse;
import com.datadog.api.client.v2.model.AWSAccountUpdateRequest;
import com.datadog.api.client.v2.model.AWSAccountsResponse;
import com.datadog.api.client.v2.model.AWSIntegrationIamPermissionsResponse;
import com.datadog.api.client.v2.model.AWSNamespacesResponse;
import com.datadog.api.client.v2.model.AWSNewExternalIDResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
   * Create an AWS integration.
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
   * Create an AWS integration.
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
   * Create a new AWS Account Integration Config.
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
   * Create an AWS integration.
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
   * Generate a new external ID.
   *
   * <p>See {@link #createNewAWSExternalIDWithHttpInfo}.
   *
   * @return AWSNewExternalIDResponse
   * @throws ApiException if fails to make API call
   */
  public AWSNewExternalIDResponse createNewAWSExternalID() throws ApiException {
    return createNewAWSExternalIDWithHttpInfo().getData();
  }

  /**
   * Generate a new external ID.
   *
   * <p>See {@link #createNewAWSExternalIDWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;AWSNewExternalIDResponse&gt;
   */
  public CompletableFuture<AWSNewExternalIDResponse> createNewAWSExternalIDAsync() {
    return createNewAWSExternalIDWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Generate a new external ID for AWS role-based authentication.
   *
   * @return ApiResponse&lt;AWSNewExternalIDResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> AWS External ID object </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AWSNewExternalIDResponse> createNewAWSExternalIDWithHttpInfo()
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createNewAWSExternalID";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/integration/aws/generate_new_external_id";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AwsIntegrationApi.createNewAWSExternalID",
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
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<AWSNewExternalIDResponse>() {});
  }

  /**
   * Generate a new external ID.
   *
   * <p>See {@link #createNewAWSExternalIDWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;AWSNewExternalIDResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AWSNewExternalIDResponse>>
      createNewAWSExternalIDWithHttpInfoAsync() {
    // Check if unstable operation is enabled
    String operationId = "createNewAWSExternalID";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<AWSNewExternalIDResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/integration/aws/generate_new_external_id";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AwsIntegrationApi.createNewAWSExternalID",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AWSNewExternalIDResponse>> result = new CompletableFuture<>();
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
        new GenericType<AWSNewExternalIDResponse>() {});
  }

  /**
   * Delete an AWS integration.
   *
   * <p>See {@link #deleteAWSAccountWithHttpInfo}.
   *
   * @param awsAccountConfigId Unique Datadog ID of the AWS Account Integration Config. To get the
   *     config ID for an account, use the <a
   *     href="https://docs.datadoghq.com/api/latest/aws-integration/#list-all-aws-integrations">List
   *     all AWS integrations</a> endpoint and query by AWS Account ID. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteAWSAccount(String awsAccountConfigId) throws ApiException {
    deleteAWSAccountWithHttpInfo(awsAccountConfigId);
  }

  /**
   * Delete an AWS integration.
   *
   * <p>See {@link #deleteAWSAccountWithHttpInfoAsync}.
   *
   * @param awsAccountConfigId Unique Datadog ID of the AWS Account Integration Config. To get the
   *     config ID for an account, use the <a
   *     href="https://docs.datadoghq.com/api/latest/aws-integration/#list-all-aws-integrations">List
   *     all AWS integrations</a> endpoint and query by AWS Account ID. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteAWSAccountAsync(String awsAccountConfigId) {
    return deleteAWSAccountWithHttpInfoAsync(awsAccountConfigId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete an AWS Account Integration Config by config ID.
   *
   * @param awsAccountConfigId Unique Datadog ID of the AWS Account Integration Config. To get the
   *     config ID for an account, use the <a
   *     href="https://docs.datadoghq.com/api/latest/aws-integration/#list-all-aws-integrations">List
   *     all AWS integrations</a> endpoint and query by AWS Account ID. (required)
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
  public ApiResponse<Void> deleteAWSAccountWithHttpInfo(String awsAccountConfigId)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteAWSAccount";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'awsAccountConfigId' is set
    if (awsAccountConfigId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'awsAccountConfigId' when calling deleteAWSAccount");
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
   * Delete an AWS integration.
   *
   * <p>See {@link #deleteAWSAccountWithHttpInfo}.
   *
   * @param awsAccountConfigId Unique Datadog ID of the AWS Account Integration Config. To get the
   *     config ID for an account, use the <a
   *     href="https://docs.datadoghq.com/api/latest/aws-integration/#list-all-aws-integrations">List
   *     all AWS integrations</a> endpoint and query by AWS Account ID. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteAWSAccountWithHttpInfoAsync(
      String awsAccountConfigId) {
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

    // verify the required parameter 'awsAccountConfigId' is set
    if (awsAccountConfigId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'awsAccountConfigId' when calling deleteAWSAccount"));
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
   * Get an AWS integration by config ID.
   *
   * <p>See {@link #getAWSAccountWithHttpInfo}.
   *
   * @param awsAccountConfigId Unique Datadog ID of the AWS Account Integration Config. To get the
   *     config ID for an account, use the <a
   *     href="https://docs.datadoghq.com/api/latest/aws-integration/#list-all-aws-integrations">List
   *     all AWS integrations</a> endpoint and query by AWS Account ID. (required)
   * @return AWSAccountResponse
   * @throws ApiException if fails to make API call
   */
  public AWSAccountResponse getAWSAccount(String awsAccountConfigId) throws ApiException {
    return getAWSAccountWithHttpInfo(awsAccountConfigId).getData();
  }

  /**
   * Get an AWS integration by config ID.
   *
   * <p>See {@link #getAWSAccountWithHttpInfoAsync}.
   *
   * @param awsAccountConfigId Unique Datadog ID of the AWS Account Integration Config. To get the
   *     config ID for an account, use the <a
   *     href="https://docs.datadoghq.com/api/latest/aws-integration/#list-all-aws-integrations">List
   *     all AWS integrations</a> endpoint and query by AWS Account ID. (required)
   * @return CompletableFuture&lt;AWSAccountResponse&gt;
   */
  public CompletableFuture<AWSAccountResponse> getAWSAccountAsync(String awsAccountConfigId) {
    return getAWSAccountWithHttpInfoAsync(awsAccountConfigId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get an AWS Account Integration Config by config ID.
   *
   * @param awsAccountConfigId Unique Datadog ID of the AWS Account Integration Config. To get the
   *     config ID for an account, use the <a
   *     href="https://docs.datadoghq.com/api/latest/aws-integration/#list-all-aws-integrations">List
   *     all AWS integrations</a> endpoint and query by AWS Account ID. (required)
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
  public ApiResponse<AWSAccountResponse> getAWSAccountWithHttpInfo(String awsAccountConfigId)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getAWSAccount";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'awsAccountConfigId' is set
    if (awsAccountConfigId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'awsAccountConfigId' when calling getAWSAccount");
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
   * Get an AWS integration by config ID.
   *
   * <p>See {@link #getAWSAccountWithHttpInfo}.
   *
   * @param awsAccountConfigId Unique Datadog ID of the AWS Account Integration Config. To get the
   *     config ID for an account, use the <a
   *     href="https://docs.datadoghq.com/api/latest/aws-integration/#list-all-aws-integrations">List
   *     all AWS integrations</a> endpoint and query by AWS Account ID. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AWSAccountResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AWSAccountResponse>> getAWSAccountWithHttpInfoAsync(
      String awsAccountConfigId) {
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

    // verify the required parameter 'awsAccountConfigId' is set
    if (awsAccountConfigId == null) {
      CompletableFuture<ApiResponse<AWSAccountResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'awsAccountConfigId' when calling getAWSAccount"));
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
   * Get AWS integration IAM permissions.
   *
   * <p>See {@link #getAWSIntegrationIAMPermissionsWithHttpInfo}.
   *
   * @return AWSIntegrationIamPermissionsResponse
   * @throws ApiException if fails to make API call
   */
  public AWSIntegrationIamPermissionsResponse getAWSIntegrationIAMPermissions()
      throws ApiException {
    return getAWSIntegrationIAMPermissionsWithHttpInfo().getData();
  }

  /**
   * Get AWS integration IAM permissions.
   *
   * <p>See {@link #getAWSIntegrationIAMPermissionsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;AWSIntegrationIamPermissionsResponse&gt;
   */
  public CompletableFuture<AWSIntegrationIamPermissionsResponse>
      getAWSIntegrationIAMPermissionsAsync() {
    return getAWSIntegrationIAMPermissionsWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get all AWS IAM permissions required for the AWS integration.
   *
   * @return ApiResponse&lt;AWSIntegrationIamPermissionsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> AWS IAM Permissions object </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AWSIntegrationIamPermissionsResponse>
      getAWSIntegrationIAMPermissionsWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/integration/aws/iam_permissions";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AwsIntegrationApi.getAWSIntegrationIAMPermissions",
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
        new GenericType<AWSIntegrationIamPermissionsResponse>() {});
  }

  /**
   * Get AWS integration IAM permissions.
   *
   * <p>See {@link #getAWSIntegrationIAMPermissionsWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;AWSIntegrationIamPermissionsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AWSIntegrationIamPermissionsResponse>>
      getAWSIntegrationIAMPermissionsWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/integration/aws/iam_permissions";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AwsIntegrationApi.getAWSIntegrationIAMPermissions",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AWSIntegrationIamPermissionsResponse>> result =
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
        new GenericType<AWSIntegrationIamPermissionsResponse>() {});
  }

  /** Manage optional parameters to listAWSAccounts. */
  public static class ListAWSAccountsOptionalParameters {
    private String awsAccountId;

    /**
     * Set awsAccountId.
     *
     * @param awsAccountId Optional query parameter to filter accounts by AWS Account ID. If not
     *     provided, all accounts are returned. (optional)
     * @return ListAWSAccountsOptionalParameters
     */
    public ListAWSAccountsOptionalParameters awsAccountId(String awsAccountId) {
      this.awsAccountId = awsAccountId;
      return this;
    }
  }

  /**
   * List all AWS integrations.
   *
   * <p>See {@link #listAWSAccountsWithHttpInfo}.
   *
   * @return AWSAccountsResponse
   * @throws ApiException if fails to make API call
   */
  public AWSAccountsResponse listAWSAccounts() throws ApiException {
    return listAWSAccountsWithHttpInfo(new ListAWSAccountsOptionalParameters()).getData();
  }

  /**
   * List all AWS integrations.
   *
   * <p>See {@link #listAWSAccountsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;AWSAccountsResponse&gt;
   */
  public CompletableFuture<AWSAccountsResponse> listAWSAccountsAsync() {
    return listAWSAccountsWithHttpInfoAsync(new ListAWSAccountsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List all AWS integrations.
   *
   * <p>See {@link #listAWSAccountsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return AWSAccountsResponse
   * @throws ApiException if fails to make API call
   */
  public AWSAccountsResponse listAWSAccounts(ListAWSAccountsOptionalParameters parameters)
      throws ApiException {
    return listAWSAccountsWithHttpInfo(parameters).getData();
  }

  /**
   * List all AWS integrations.
   *
   * <p>See {@link #listAWSAccountsWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;AWSAccountsResponse&gt;
   */
  public CompletableFuture<AWSAccountsResponse> listAWSAccountsAsync(
      ListAWSAccountsOptionalParameters parameters) {
    return listAWSAccountsWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a list of AWS Account Integration Configs.
   *
   * @param parameters Optional parameters for the request.
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
  public ApiResponse<AWSAccountsResponse> listAWSAccountsWithHttpInfo(
      ListAWSAccountsOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listAWSAccounts";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    String awsAccountId = parameters.awsAccountId;
    // create path and map variables
    String localVarPath = "/api/v2/integration/aws/accounts";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "aws_account_id", awsAccountId));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AwsIntegrationApi.listAWSAccounts",
            localVarPath,
            localVarQueryParams,
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
   * List all AWS integrations.
   *
   * <p>See {@link #listAWSAccountsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;AWSAccountsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AWSAccountsResponse>> listAWSAccountsWithHttpInfoAsync(
      ListAWSAccountsOptionalParameters parameters) {
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
    String awsAccountId = parameters.awsAccountId;
    // create path and map variables
    String localVarPath = "/api/v2/integration/aws/accounts";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "aws_account_id", awsAccountId));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AwsIntegrationApi.listAWSAccounts",
              localVarPath,
              localVarQueryParams,
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
   * List available namespaces.
   *
   * <p>See {@link #listAWSNamespacesWithHttpInfo}.
   *
   * @return AWSNamespacesResponse
   * @throws ApiException if fails to make API call
   */
  public AWSNamespacesResponse listAWSNamespaces() throws ApiException {
    return listAWSNamespacesWithHttpInfo().getData();
  }

  /**
   * List available namespaces.
   *
   * <p>See {@link #listAWSNamespacesWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;AWSNamespacesResponse&gt;
   */
  public CompletableFuture<AWSNamespacesResponse> listAWSNamespacesAsync() {
    return listAWSNamespacesWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a list of available AWS CloudWatch namespaces that can send metrics to Datadog.
   *
   * @return ApiResponse&lt;AWSNamespacesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> AWS Namespaces List object </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AWSNamespacesResponse> listAWSNamespacesWithHttpInfo() throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listAWSNamespaces";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/integration/aws/available_namespaces";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AwsIntegrationApi.listAWSNamespaces",
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
        new GenericType<AWSNamespacesResponse>() {});
  }

  /**
   * List available namespaces.
   *
   * <p>See {@link #listAWSNamespacesWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;AWSNamespacesResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AWSNamespacesResponse>>
      listAWSNamespacesWithHttpInfoAsync() {
    // Check if unstable operation is enabled
    String operationId = "listAWSNamespaces";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<AWSNamespacesResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/integration/aws/available_namespaces";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AwsIntegrationApi.listAWSNamespaces",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AWSNamespacesResponse>> result = new CompletableFuture<>();
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
        new GenericType<AWSNamespacesResponse>() {});
  }

  /**
   * Update an AWS integration.
   *
   * <p>See {@link #updateAWSAccountWithHttpInfo}.
   *
   * @param awsAccountConfigId Unique Datadog ID of the AWS Account Integration Config. To get the
   *     config ID for an account, use the <a
   *     href="https://docs.datadoghq.com/api/latest/aws-integration/#list-all-aws-integrations">List
   *     all AWS integrations</a> endpoint and query by AWS Account ID. (required)
   * @param body (required)
   * @return AWSAccountResponse
   * @throws ApiException if fails to make API call
   */
  public AWSAccountResponse updateAWSAccount(
      String awsAccountConfigId, AWSAccountUpdateRequest body) throws ApiException {
    return updateAWSAccountWithHttpInfo(awsAccountConfigId, body).getData();
  }

  /**
   * Update an AWS integration.
   *
   * <p>See {@link #updateAWSAccountWithHttpInfoAsync}.
   *
   * @param awsAccountConfigId Unique Datadog ID of the AWS Account Integration Config. To get the
   *     config ID for an account, use the <a
   *     href="https://docs.datadoghq.com/api/latest/aws-integration/#list-all-aws-integrations">List
   *     all AWS integrations</a> endpoint and query by AWS Account ID. (required)
   * @param body (required)
   * @return CompletableFuture&lt;AWSAccountResponse&gt;
   */
  public CompletableFuture<AWSAccountResponse> updateAWSAccountAsync(
      String awsAccountConfigId, AWSAccountUpdateRequest body) {
    return updateAWSAccountWithHttpInfoAsync(awsAccountConfigId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update an AWS Account Integration Config by config ID.
   *
   * @param awsAccountConfigId Unique Datadog ID of the AWS Account Integration Config. To get the
   *     config ID for an account, use the <a
   *     href="https://docs.datadoghq.com/api/latest/aws-integration/#list-all-aws-integrations">List
   *     all AWS integrations</a> endpoint and query by AWS Account ID. (required)
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
      String awsAccountConfigId, AWSAccountUpdateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateAWSAccount";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'awsAccountConfigId' is set
    if (awsAccountConfigId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'awsAccountConfigId' when calling updateAWSAccount");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateAWSAccount");
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
   * Update an AWS integration.
   *
   * <p>See {@link #updateAWSAccountWithHttpInfo}.
   *
   * @param awsAccountConfigId Unique Datadog ID of the AWS Account Integration Config. To get the
   *     config ID for an account, use the <a
   *     href="https://docs.datadoghq.com/api/latest/aws-integration/#list-all-aws-integrations">List
   *     all AWS integrations</a> endpoint and query by AWS Account ID. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AWSAccountResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AWSAccountResponse>> updateAWSAccountWithHttpInfoAsync(
      String awsAccountConfigId, AWSAccountUpdateRequest body) {
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

    // verify the required parameter 'awsAccountConfigId' is set
    if (awsAccountConfigId == null) {
      CompletableFuture<ApiResponse<AWSAccountResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'awsAccountConfigId' when calling updateAWSAccount"));
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
        "/api/v2/integration/aws/accounts/{aws_account_config_id}"
            .replaceAll(
                "\\{" + "aws_account_config_id" + "\\}",
                apiClient.escapeString(awsAccountConfigId.toString()));

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
