package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.AWSAccountCreateRequest;
import com.datadog.api.client.v2.model.AWSAccountResponse;
import com.datadog.api.client.v2.model.AWSAccountUpdateRequest;
import com.datadog.api.client.v2.model.AWSAccountsResponse;
import com.datadog.api.client.v2.model.AWSCcmConfigRequest;
import com.datadog.api.client.v2.model.AWSCcmConfigResponse;
import com.datadog.api.client.v2.model.AWSEventBridgeCreateRequest;
import com.datadog.api.client.v2.model.AWSEventBridgeCreateResponse;
import com.datadog.api.client.v2.model.AWSEventBridgeDeleteRequest;
import com.datadog.api.client.v2.model.AWSEventBridgeDeleteResponse;
import com.datadog.api.client.v2.model.AWSEventBridgeListResponse;
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
   * Create AWS CCM config.
   *
   * <p>See {@link #createAWSAccountCCMConfigWithHttpInfo}.
   *
   * @param awsAccountConfigId Unique Datadog ID of the AWS Account Integration Config. To get the
   *     config ID for an account, use the <a
   *     href="https://docs.datadoghq.com/api/latest/aws-integration/#list-all-aws-integrations">List
   *     all AWS integrations</a> endpoint and query by AWS Account ID. (required)
   * @param body Create a Cloud Cost Management config for an AWS Account Integration Config.
   *     (required)
   * @return AWSCcmConfigResponse
   * @throws ApiException if fails to make API call
   */
  public AWSCcmConfigResponse createAWSAccountCCMConfig(
      String awsAccountConfigId, AWSCcmConfigRequest body) throws ApiException {
    return createAWSAccountCCMConfigWithHttpInfo(awsAccountConfigId, body).getData();
  }

  /**
   * Create AWS CCM config.
   *
   * <p>See {@link #createAWSAccountCCMConfigWithHttpInfoAsync}.
   *
   * @param awsAccountConfigId Unique Datadog ID of the AWS Account Integration Config. To get the
   *     config ID for an account, use the <a
   *     href="https://docs.datadoghq.com/api/latest/aws-integration/#list-all-aws-integrations">List
   *     all AWS integrations</a> endpoint and query by AWS Account ID. (required)
   * @param body Create a Cloud Cost Management config for an AWS Account Integration Config.
   *     (required)
   * @return CompletableFuture&lt;AWSCcmConfigResponse&gt;
   */
  public CompletableFuture<AWSCcmConfigResponse> createAWSAccountCCMConfigAsync(
      String awsAccountConfigId, AWSCcmConfigRequest body) {
    return createAWSAccountCCMConfigWithHttpInfoAsync(awsAccountConfigId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create the Cloud Cost Management config for an AWS Account Integration Config using Cost and
   * Usage Report (CUR) 2.0 by config ID.
   *
   * @param awsAccountConfigId Unique Datadog ID of the AWS Account Integration Config. To get the
   *     config ID for an account, use the <a
   *     href="https://docs.datadoghq.com/api/latest/aws-integration/#list-all-aws-integrations">List
   *     all AWS integrations</a> endpoint and query by AWS Account ID. (required)
   * @param body Create a Cloud Cost Management config for an AWS Account Integration Config.
   *     (required)
   * @return ApiResponse&lt;AWSCcmConfigResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> AWS CCM Config object </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AWSCcmConfigResponse> createAWSAccountCCMConfigWithHttpInfo(
      String awsAccountConfigId, AWSCcmConfigRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createAWSAccountCCMConfig";
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
          "Missing the required parameter 'awsAccountConfigId' when calling"
              + " createAWSAccountCCMConfig");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createAWSAccountCCMConfig");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration/aws/accounts/{aws_account_config_id}/ccm_config"
            .replaceAll(
                "\\{" + "aws_account_config_id" + "\\}",
                apiClient.escapeString(awsAccountConfigId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AwsIntegrationApi.createAWSAccountCCMConfig",
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
        new GenericType<AWSCcmConfigResponse>() {});
  }

  /**
   * Create AWS CCM config.
   *
   * <p>See {@link #createAWSAccountCCMConfigWithHttpInfo}.
   *
   * @param awsAccountConfigId Unique Datadog ID of the AWS Account Integration Config. To get the
   *     config ID for an account, use the <a
   *     href="https://docs.datadoghq.com/api/latest/aws-integration/#list-all-aws-integrations">List
   *     all AWS integrations</a> endpoint and query by AWS Account ID. (required)
   * @param body Create a Cloud Cost Management config for an AWS Account Integration Config.
   *     (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AWSCcmConfigResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AWSCcmConfigResponse>>
      createAWSAccountCCMConfigWithHttpInfoAsync(
          String awsAccountConfigId, AWSCcmConfigRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createAWSAccountCCMConfig";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<AWSCcmConfigResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'awsAccountConfigId' is set
    if (awsAccountConfigId == null) {
      CompletableFuture<ApiResponse<AWSCcmConfigResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'awsAccountConfigId' when calling"
                  + " createAWSAccountCCMConfig"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<AWSCcmConfigResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createAWSAccountCCMConfig"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration/aws/accounts/{aws_account_config_id}/ccm_config"
            .replaceAll(
                "\\{" + "aws_account_config_id" + "\\}",
                apiClient.escapeString(awsAccountConfigId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AwsIntegrationApi.createAWSAccountCCMConfig",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AWSCcmConfigResponse>> result = new CompletableFuture<>();
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
        new GenericType<AWSCcmConfigResponse>() {});
  }

  /**
   * Create an Amazon EventBridge source.
   *
   * <p>See {@link #createAWSEventBridgeSourceWithHttpInfo}.
   *
   * @param body Create an Amazon EventBridge source for an AWS account with a given name and
   *     region. (required)
   * @return AWSEventBridgeCreateResponse
   * @throws ApiException if fails to make API call
   */
  public AWSEventBridgeCreateResponse createAWSEventBridgeSource(AWSEventBridgeCreateRequest body)
      throws ApiException {
    return createAWSEventBridgeSourceWithHttpInfo(body).getData();
  }

  /**
   * Create an Amazon EventBridge source.
   *
   * <p>See {@link #createAWSEventBridgeSourceWithHttpInfoAsync}.
   *
   * @param body Create an Amazon EventBridge source for an AWS account with a given name and
   *     region. (required)
   * @return CompletableFuture&lt;AWSEventBridgeCreateResponse&gt;
   */
  public CompletableFuture<AWSEventBridgeCreateResponse> createAWSEventBridgeSourceAsync(
      AWSEventBridgeCreateRequest body) {
    return createAWSEventBridgeSourceWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create an Amazon EventBridge source.
   *
   * @param body Create an Amazon EventBridge source for an AWS account with a given name and
   *     region. (required)
   * @return ApiResponse&lt;AWSEventBridgeCreateResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> Amazon EventBridge source created. </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AWSEventBridgeCreateResponse> createAWSEventBridgeSourceWithHttpInfo(
      AWSEventBridgeCreateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createAWSEventBridgeSource");
    }
    // create path and map variables
    String localVarPath = "/api/v2/integration/aws/event_bridge";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AwsIntegrationApi.createAWSEventBridgeSource",
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
        new GenericType<AWSEventBridgeCreateResponse>() {});
  }

  /**
   * Create an Amazon EventBridge source.
   *
   * <p>See {@link #createAWSEventBridgeSourceWithHttpInfo}.
   *
   * @param body Create an Amazon EventBridge source for an AWS account with a given name and
   *     region. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AWSEventBridgeCreateResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AWSEventBridgeCreateResponse>>
      createAWSEventBridgeSourceWithHttpInfoAsync(AWSEventBridgeCreateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<AWSEventBridgeCreateResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling createAWSEventBridgeSource"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/integration/aws/event_bridge";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AwsIntegrationApi.createAWSEventBridgeSource",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AWSEventBridgeCreateResponse>> result =
          new CompletableFuture<>();
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
        new GenericType<AWSEventBridgeCreateResponse>() {});
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
   * Delete AWS CCM config.
   *
   * <p>See {@link #deleteAWSAccountCCMConfigWithHttpInfo}.
   *
   * @param awsAccountConfigId Unique Datadog ID of the AWS Account Integration Config. To get the
   *     config ID for an account, use the <a
   *     href="https://docs.datadoghq.com/api/latest/aws-integration/#list-all-aws-integrations">List
   *     all AWS integrations</a> endpoint and query by AWS Account ID. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteAWSAccountCCMConfig(String awsAccountConfigId) throws ApiException {
    deleteAWSAccountCCMConfigWithHttpInfo(awsAccountConfigId);
  }

  /**
   * Delete AWS CCM config.
   *
   * <p>See {@link #deleteAWSAccountCCMConfigWithHttpInfoAsync}.
   *
   * @param awsAccountConfigId Unique Datadog ID of the AWS Account Integration Config. To get the
   *     config ID for an account, use the <a
   *     href="https://docs.datadoghq.com/api/latest/aws-integration/#list-all-aws-integrations">List
   *     all AWS integrations</a> endpoint and query by AWS Account ID. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteAWSAccountCCMConfigAsync(String awsAccountConfigId) {
    return deleteAWSAccountCCMConfigWithHttpInfoAsync(awsAccountConfigId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete the Cloud Cost Management config for an AWS Account Integration Config using Cost and
   * Usage Report (CUR) 2.0 by config ID.
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
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteAWSAccountCCMConfigWithHttpInfo(String awsAccountConfigId)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteAWSAccountCCMConfig";
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
          "Missing the required parameter 'awsAccountConfigId' when calling"
              + " deleteAWSAccountCCMConfig");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration/aws/accounts/{aws_account_config_id}/ccm_config"
            .replaceAll(
                "\\{" + "aws_account_config_id" + "\\}",
                apiClient.escapeString(awsAccountConfigId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AwsIntegrationApi.deleteAWSAccountCCMConfig",
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
   * Delete AWS CCM config.
   *
   * <p>See {@link #deleteAWSAccountCCMConfigWithHttpInfo}.
   *
   * @param awsAccountConfigId Unique Datadog ID of the AWS Account Integration Config. To get the
   *     config ID for an account, use the <a
   *     href="https://docs.datadoghq.com/api/latest/aws-integration/#list-all-aws-integrations">List
   *     all AWS integrations</a> endpoint and query by AWS Account ID. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteAWSAccountCCMConfigWithHttpInfoAsync(
      String awsAccountConfigId) {
    // Check if unstable operation is enabled
    String operationId = "deleteAWSAccountCCMConfig";
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
                  + " deleteAWSAccountCCMConfig"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration/aws/accounts/{aws_account_config_id}/ccm_config"
            .replaceAll(
                "\\{" + "aws_account_config_id" + "\\}",
                apiClient.escapeString(awsAccountConfigId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AwsIntegrationApi.deleteAWSAccountCCMConfig",
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
   * Delete an Amazon EventBridge source.
   *
   * <p>See {@link #deleteAWSEventBridgeSourceWithHttpInfo}.
   *
   * @param body Delete the Amazon EventBridge source with the given name, region, and associated
   *     AWS account. (required)
   * @return AWSEventBridgeDeleteResponse
   * @throws ApiException if fails to make API call
   */
  public AWSEventBridgeDeleteResponse deleteAWSEventBridgeSource(AWSEventBridgeDeleteRequest body)
      throws ApiException {
    return deleteAWSEventBridgeSourceWithHttpInfo(body).getData();
  }

  /**
   * Delete an Amazon EventBridge source.
   *
   * <p>See {@link #deleteAWSEventBridgeSourceWithHttpInfoAsync}.
   *
   * @param body Delete the Amazon EventBridge source with the given name, region, and associated
   *     AWS account. (required)
   * @return CompletableFuture&lt;AWSEventBridgeDeleteResponse&gt;
   */
  public CompletableFuture<AWSEventBridgeDeleteResponse> deleteAWSEventBridgeSourceAsync(
      AWSEventBridgeDeleteRequest body) {
    return deleteAWSEventBridgeSourceWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete an Amazon EventBridge source.
   *
   * @param body Delete the Amazon EventBridge source with the given name, region, and associated
   *     AWS account. (required)
   * @return ApiResponse&lt;AWSEventBridgeDeleteResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> Amazon EventBridge source deleted. </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AWSEventBridgeDeleteResponse> deleteAWSEventBridgeSourceWithHttpInfo(
      AWSEventBridgeDeleteRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling deleteAWSEventBridgeSource");
    }
    // create path and map variables
    String localVarPath = "/api/v2/integration/aws/event_bridge";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AwsIntegrationApi.deleteAWSEventBridgeSource",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<AWSEventBridgeDeleteResponse>() {});
  }

  /**
   * Delete an Amazon EventBridge source.
   *
   * <p>See {@link #deleteAWSEventBridgeSourceWithHttpInfo}.
   *
   * @param body Delete the Amazon EventBridge source with the given name, region, and associated
   *     AWS account. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AWSEventBridgeDeleteResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AWSEventBridgeDeleteResponse>>
      deleteAWSEventBridgeSourceWithHttpInfoAsync(AWSEventBridgeDeleteRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<AWSEventBridgeDeleteResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling deleteAWSEventBridgeSource"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/integration/aws/event_bridge";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AwsIntegrationApi.deleteAWSEventBridgeSource",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AWSEventBridgeDeleteResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<AWSEventBridgeDeleteResponse>() {});
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
   * Get AWS CCM config.
   *
   * <p>See {@link #getAWSAccountCCMConfigWithHttpInfo}.
   *
   * @param awsAccountConfigId Unique Datadog ID of the AWS Account Integration Config. To get the
   *     config ID for an account, use the <a
   *     href="https://docs.datadoghq.com/api/latest/aws-integration/#list-all-aws-integrations">List
   *     all AWS integrations</a> endpoint and query by AWS Account ID. (required)
   * @return AWSCcmConfigResponse
   * @throws ApiException if fails to make API call
   */
  public AWSCcmConfigResponse getAWSAccountCCMConfig(String awsAccountConfigId)
      throws ApiException {
    return getAWSAccountCCMConfigWithHttpInfo(awsAccountConfigId).getData();
  }

  /**
   * Get AWS CCM config.
   *
   * <p>See {@link #getAWSAccountCCMConfigWithHttpInfoAsync}.
   *
   * @param awsAccountConfigId Unique Datadog ID of the AWS Account Integration Config. To get the
   *     config ID for an account, use the <a
   *     href="https://docs.datadoghq.com/api/latest/aws-integration/#list-all-aws-integrations">List
   *     all AWS integrations</a> endpoint and query by AWS Account ID. (required)
   * @return CompletableFuture&lt;AWSCcmConfigResponse&gt;
   */
  public CompletableFuture<AWSCcmConfigResponse> getAWSAccountCCMConfigAsync(
      String awsAccountConfigId) {
    return getAWSAccountCCMConfigWithHttpInfoAsync(awsAccountConfigId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the Cloud Cost Management config for an AWS Account Integration Config using Cost and Usage
   * Report (CUR) 2.0 by config ID.
   *
   * @param awsAccountConfigId Unique Datadog ID of the AWS Account Integration Config. To get the
   *     config ID for an account, use the <a
   *     href="https://docs.datadoghq.com/api/latest/aws-integration/#list-all-aws-integrations">List
   *     all AWS integrations</a> endpoint and query by AWS Account ID. (required)
   * @return ApiResponse&lt;AWSCcmConfigResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> AWS CCM Config object </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AWSCcmConfigResponse> getAWSAccountCCMConfigWithHttpInfo(
      String awsAccountConfigId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getAWSAccountCCMConfig";
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
          "Missing the required parameter 'awsAccountConfigId' when calling"
              + " getAWSAccountCCMConfig");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration/aws/accounts/{aws_account_config_id}/ccm_config"
            .replaceAll(
                "\\{" + "aws_account_config_id" + "\\}",
                apiClient.escapeString(awsAccountConfigId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AwsIntegrationApi.getAWSAccountCCMConfig",
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
        new GenericType<AWSCcmConfigResponse>() {});
  }

  /**
   * Get AWS CCM config.
   *
   * <p>See {@link #getAWSAccountCCMConfigWithHttpInfo}.
   *
   * @param awsAccountConfigId Unique Datadog ID of the AWS Account Integration Config. To get the
   *     config ID for an account, use the <a
   *     href="https://docs.datadoghq.com/api/latest/aws-integration/#list-all-aws-integrations">List
   *     all AWS integrations</a> endpoint and query by AWS Account ID. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AWSCcmConfigResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AWSCcmConfigResponse>>
      getAWSAccountCCMConfigWithHttpInfoAsync(String awsAccountConfigId) {
    // Check if unstable operation is enabled
    String operationId = "getAWSAccountCCMConfig";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<AWSCcmConfigResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'awsAccountConfigId' is set
    if (awsAccountConfigId == null) {
      CompletableFuture<ApiResponse<AWSCcmConfigResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'awsAccountConfigId' when calling"
                  + " getAWSAccountCCMConfig"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration/aws/accounts/{aws_account_config_id}/ccm_config"
            .replaceAll(
                "\\{" + "aws_account_config_id" + "\\}",
                apiClient.escapeString(awsAccountConfigId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AwsIntegrationApi.getAWSAccountCCMConfig",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AWSCcmConfigResponse>> result = new CompletableFuture<>();
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
        new GenericType<AWSCcmConfigResponse>() {});
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

  /**
   * Get resource collection IAM permissions.
   *
   * <p>See {@link #getAWSIntegrationIAMPermissionsResourceCollectionWithHttpInfo}.
   *
   * @return AWSIntegrationIamPermissionsResponse
   * @throws ApiException if fails to make API call
   */
  public AWSIntegrationIamPermissionsResponse getAWSIntegrationIAMPermissionsResourceCollection()
      throws ApiException {
    return getAWSIntegrationIAMPermissionsResourceCollectionWithHttpInfo().getData();
  }

  /**
   * Get resource collection IAM permissions.
   *
   * <p>See {@link #getAWSIntegrationIAMPermissionsResourceCollectionWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;AWSIntegrationIamPermissionsResponse&gt;
   */
  public CompletableFuture<AWSIntegrationIamPermissionsResponse>
      getAWSIntegrationIAMPermissionsResourceCollectionAsync() {
    return getAWSIntegrationIAMPermissionsResourceCollectionWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get all resource collection AWS IAM permissions required for the AWS integration.
   *
   * @return ApiResponse&lt;AWSIntegrationIamPermissionsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> AWS integration resource collection IAM permissions. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AWSIntegrationIamPermissionsResponse>
      getAWSIntegrationIAMPermissionsResourceCollectionWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/integration/aws/iam_permissions/resource_collection";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AwsIntegrationApi.getAWSIntegrationIAMPermissionsResourceCollection",
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
   * Get resource collection IAM permissions.
   *
   * <p>See {@link #getAWSIntegrationIAMPermissionsResourceCollectionWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;AWSIntegrationIamPermissionsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AWSIntegrationIamPermissionsResponse>>
      getAWSIntegrationIAMPermissionsResourceCollectionWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/integration/aws/iam_permissions/resource_collection";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AwsIntegrationApi.getAWSIntegrationIAMPermissionsResourceCollection",
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

  /**
   * Get AWS integration standard IAM permissions.
   *
   * <p>See {@link #getAWSIntegrationIAMPermissionsStandardWithHttpInfo}.
   *
   * @return AWSIntegrationIamPermissionsResponse
   * @throws ApiException if fails to make API call
   */
  public AWSIntegrationIamPermissionsResponse getAWSIntegrationIAMPermissionsStandard()
      throws ApiException {
    return getAWSIntegrationIAMPermissionsStandardWithHttpInfo().getData();
  }

  /**
   * Get AWS integration standard IAM permissions.
   *
   * <p>See {@link #getAWSIntegrationIAMPermissionsStandardWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;AWSIntegrationIamPermissionsResponse&gt;
   */
  public CompletableFuture<AWSIntegrationIamPermissionsResponse>
      getAWSIntegrationIAMPermissionsStandardAsync() {
    return getAWSIntegrationIAMPermissionsStandardWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get all standard AWS IAM permissions required for the AWS integration.
   *
   * @return ApiResponse&lt;AWSIntegrationIamPermissionsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> AWS integration standard IAM permissions. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AWSIntegrationIamPermissionsResponse>
      getAWSIntegrationIAMPermissionsStandardWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/integration/aws/iam_permissions/standard";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AwsIntegrationApi.getAWSIntegrationIAMPermissionsStandard",
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
   * Get AWS integration standard IAM permissions.
   *
   * <p>See {@link #getAWSIntegrationIAMPermissionsStandardWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;AWSIntegrationIamPermissionsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AWSIntegrationIamPermissionsResponse>>
      getAWSIntegrationIAMPermissionsStandardWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/integration/aws/iam_permissions/standard";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AwsIntegrationApi.getAWSIntegrationIAMPermissionsStandard",
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
   * Get all Amazon EventBridge sources.
   *
   * <p>See {@link #listAWSEventBridgeSourcesWithHttpInfo}.
   *
   * @return AWSEventBridgeListResponse
   * @throws ApiException if fails to make API call
   */
  public AWSEventBridgeListResponse listAWSEventBridgeSources() throws ApiException {
    return listAWSEventBridgeSourcesWithHttpInfo().getData();
  }

  /**
   * Get all Amazon EventBridge sources.
   *
   * <p>See {@link #listAWSEventBridgeSourcesWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;AWSEventBridgeListResponse&gt;
   */
  public CompletableFuture<AWSEventBridgeListResponse> listAWSEventBridgeSourcesAsync() {
    return listAWSEventBridgeSourcesWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get all Amazon EventBridge sources.
   *
   * @return ApiResponse&lt;AWSEventBridgeListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> Amazon EventBridge sources list. </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AWSEventBridgeListResponse> listAWSEventBridgeSourcesWithHttpInfo()
      throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/integration/aws/event_bridge";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AwsIntegrationApi.listAWSEventBridgeSources",
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
        new GenericType<AWSEventBridgeListResponse>() {});
  }

  /**
   * Get all Amazon EventBridge sources.
   *
   * <p>See {@link #listAWSEventBridgeSourcesWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;AWSEventBridgeListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AWSEventBridgeListResponse>>
      listAWSEventBridgeSourcesWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/integration/aws/event_bridge";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AwsIntegrationApi.listAWSEventBridgeSources",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AWSEventBridgeListResponse>> result = new CompletableFuture<>();
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
        new GenericType<AWSEventBridgeListResponse>() {});
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

  /**
   * Update AWS CCM config.
   *
   * <p>See {@link #updateAWSAccountCCMConfigWithHttpInfo}.
   *
   * @param awsAccountConfigId Unique Datadog ID of the AWS Account Integration Config. To get the
   *     config ID for an account, use the <a
   *     href="https://docs.datadoghq.com/api/latest/aws-integration/#list-all-aws-integrations">List
   *     all AWS integrations</a> endpoint and query by AWS Account ID. (required)
   * @param body Update a Cloud Cost Management config for an AWS Account Integration Config.
   *     (required)
   * @return AWSCcmConfigResponse
   * @throws ApiException if fails to make API call
   */
  public AWSCcmConfigResponse updateAWSAccountCCMConfig(
      String awsAccountConfigId, AWSCcmConfigRequest body) throws ApiException {
    return updateAWSAccountCCMConfigWithHttpInfo(awsAccountConfigId, body).getData();
  }

  /**
   * Update AWS CCM config.
   *
   * <p>See {@link #updateAWSAccountCCMConfigWithHttpInfoAsync}.
   *
   * @param awsAccountConfigId Unique Datadog ID of the AWS Account Integration Config. To get the
   *     config ID for an account, use the <a
   *     href="https://docs.datadoghq.com/api/latest/aws-integration/#list-all-aws-integrations">List
   *     all AWS integrations</a> endpoint and query by AWS Account ID. (required)
   * @param body Update a Cloud Cost Management config for an AWS Account Integration Config.
   *     (required)
   * @return CompletableFuture&lt;AWSCcmConfigResponse&gt;
   */
  public CompletableFuture<AWSCcmConfigResponse> updateAWSAccountCCMConfigAsync(
      String awsAccountConfigId, AWSCcmConfigRequest body) {
    return updateAWSAccountCCMConfigWithHttpInfoAsync(awsAccountConfigId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update the Cloud Cost Management config for an AWS Account Integration Config using Cost and
   * Usage Report (CUR) 2.0 by config ID.
   *
   * @param awsAccountConfigId Unique Datadog ID of the AWS Account Integration Config. To get the
   *     config ID for an account, use the <a
   *     href="https://docs.datadoghq.com/api/latest/aws-integration/#list-all-aws-integrations">List
   *     all AWS integrations</a> endpoint and query by AWS Account ID. (required)
   * @param body Update a Cloud Cost Management config for an AWS Account Integration Config.
   *     (required)
   * @return ApiResponse&lt;AWSCcmConfigResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> AWS CCM Config object </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AWSCcmConfigResponse> updateAWSAccountCCMConfigWithHttpInfo(
      String awsAccountConfigId, AWSCcmConfigRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateAWSAccountCCMConfig";
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
          "Missing the required parameter 'awsAccountConfigId' when calling"
              + " updateAWSAccountCCMConfig");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateAWSAccountCCMConfig");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration/aws/accounts/{aws_account_config_id}/ccm_config"
            .replaceAll(
                "\\{" + "aws_account_config_id" + "\\}",
                apiClient.escapeString(awsAccountConfigId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AwsIntegrationApi.updateAWSAccountCCMConfig",
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
        new GenericType<AWSCcmConfigResponse>() {});
  }

  /**
   * Update AWS CCM config.
   *
   * <p>See {@link #updateAWSAccountCCMConfigWithHttpInfo}.
   *
   * @param awsAccountConfigId Unique Datadog ID of the AWS Account Integration Config. To get the
   *     config ID for an account, use the <a
   *     href="https://docs.datadoghq.com/api/latest/aws-integration/#list-all-aws-integrations">List
   *     all AWS integrations</a> endpoint and query by AWS Account ID. (required)
   * @param body Update a Cloud Cost Management config for an AWS Account Integration Config.
   *     (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AWSCcmConfigResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AWSCcmConfigResponse>>
      updateAWSAccountCCMConfigWithHttpInfoAsync(
          String awsAccountConfigId, AWSCcmConfigRequest body) {
    // Check if unstable operation is enabled
    String operationId = "updateAWSAccountCCMConfig";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<AWSCcmConfigResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'awsAccountConfigId' is set
    if (awsAccountConfigId == null) {
      CompletableFuture<ApiResponse<AWSCcmConfigResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'awsAccountConfigId' when calling"
                  + " updateAWSAccountCCMConfig"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<AWSCcmConfigResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateAWSAccountCCMConfig"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration/aws/accounts/{aws_account_config_id}/ccm_config"
            .replaceAll(
                "\\{" + "aws_account_config_id" + "\\}",
                apiClient.escapeString(awsAccountConfigId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AwsIntegrationApi.updateAWSAccountCCMConfig",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AWSCcmConfigResponse>> result = new CompletableFuture<>();
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
        new GenericType<AWSCcmConfigResponse>() {});
  }
}
