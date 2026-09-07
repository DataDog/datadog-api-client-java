package com.datadog.api.client.v1.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v1.model.AWSAccount;
import com.datadog.api.client.v1.model.AWSAccountCreateResponse;
import com.datadog.api.client.v1.model.AWSAccountDeleteRequest;
import com.datadog.api.client.v1.model.AWSAccountListResponse;
import com.datadog.api.client.v1.model.AWSEventBridgeCreateRequest;
import com.datadog.api.client.v1.model.AWSEventBridgeCreateResponse;
import com.datadog.api.client.v1.model.AWSEventBridgeDeleteRequest;
import com.datadog.api.client.v1.model.AWSEventBridgeDeleteResponse;
import com.datadog.api.client.v1.model.AWSEventBridgeListResponse;
import com.datadog.api.client.v1.model.AWSTagFilterCreateRequest;
import com.datadog.api.client.v1.model.AWSTagFilterDeleteRequest;
import com.datadog.api.client.v1.model.AWSTagFilterListResponse;
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
   * @param body AWS Request Object (required)
   * @return AWSAccountCreateResponse
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public AWSAccountCreateResponse createAWSAccount(AWSAccount body) throws ApiException {
    return createAWSAccountWithHttpInfo(body).getData();
  }

  /**
   * Create an AWS integration.
   *
   * <p>See {@link #createAWSAccountWithHttpInfoAsync}.
   *
   * @param body AWS Request Object (required)
   * @return CompletableFuture&lt;AWSAccountCreateResponse&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<AWSAccountCreateResponse> createAWSAccountAsync(AWSAccount body) {
    return createAWSAccountWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * <strong>This endpoint is deprecated - use the V2 endpoints instead.</strong> Create a
   * Datadog-Amazon Web Services integration. Using the <code>POST</code> method updates your
   * integration configuration by adding your new configuration to the existing one in your Datadog
   * organization. A unique AWS Account ID for role based authentication.
   *
   * @param body AWS Request Object (required)
   * @return ApiResponse&lt;AWSAccountCreateResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict Error </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   *
   * @deprecated
   */
  @Deprecated
  public ApiResponse<AWSAccountCreateResponse> createAWSAccountWithHttpInfo(AWSAccount body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createAWSAccount");
    }
    // create path and map variables
    String localVarPath = "/api/v1/integration/aws";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v1.AwsIntegrationApi.createAWSAccount",
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
        new GenericType<AWSAccountCreateResponse>() {});
  }

  /**
   * Create an AWS integration.
   *
   * <p>See {@link #createAWSAccountWithHttpInfo}.
   *
   * @param body AWS Request Object (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AWSAccountCreateResponse&gt;&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<ApiResponse<AWSAccountCreateResponse>> createAWSAccountWithHttpInfoAsync(
      AWSAccount body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<AWSAccountCreateResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createAWSAccount"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/integration/aws";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1.AwsIntegrationApi.createAWSAccount",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AWSAccountCreateResponse>> result = new CompletableFuture<>();
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
        new GenericType<AWSAccountCreateResponse>() {});
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
   * @deprecated
   */
  @Deprecated
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
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<AWSEventBridgeCreateResponse> createAWSEventBridgeSourceAsync(
      AWSEventBridgeCreateRequest body) {
    return createAWSEventBridgeSourceWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * <strong>This endpoint is deprecated - use the V2 endpoints instead.</strong> Create an Amazon
   * EventBridge source.
   *
   * @param body Create an Amazon EventBridge source for an AWS account with a given name and
   *     region. (required)
   * @return ApiResponse&lt;AWSEventBridgeCreateResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   *
   * @deprecated
   */
  @Deprecated
  public ApiResponse<AWSEventBridgeCreateResponse> createAWSEventBridgeSourceWithHttpInfo(
      AWSEventBridgeCreateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createAWSEventBridgeSource");
    }
    // create path and map variables
    String localVarPath = "/api/v1/integration/aws/event_bridge";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v1.AwsIntegrationApi.createAWSEventBridgeSource",
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
   * @deprecated
   */
  @Deprecated
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
    String localVarPath = "/api/v1/integration/aws/event_bridge";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1.AwsIntegrationApi.createAWSEventBridgeSource",
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
   * Set an AWS tag filter.
   *
   * <p>See {@link #createAWSTagFilterWithHttpInfo}.
   *
   * @param body Set an AWS tag filter using an <code>aws_account_identifier</code>, <code>namespace
   *     </code>, and filtering string. Namespace options are <code>application_elb</code>, <code>
   *     elb</code>, <code>lambda</code>, <code>network_elb</code>, <code>rds</code>, <code>sqs
   *     </code>, and <code>custom</code>. (required)
   * @return Object
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public Object createAWSTagFilter(AWSTagFilterCreateRequest body) throws ApiException {
    return createAWSTagFilterWithHttpInfo(body).getData();
  }

  /**
   * Set an AWS tag filter.
   *
   * <p>See {@link #createAWSTagFilterWithHttpInfoAsync}.
   *
   * @param body Set an AWS tag filter using an <code>aws_account_identifier</code>, <code>namespace
   *     </code>, and filtering string. Namespace options are <code>application_elb</code>, <code>
   *     elb</code>, <code>lambda</code>, <code>network_elb</code>, <code>rds</code>, <code>sqs
   *     </code>, and <code>custom</code>. (required)
   * @return CompletableFuture&lt;Object&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<Object> createAWSTagFilterAsync(AWSTagFilterCreateRequest body) {
    return createAWSTagFilterWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Set an AWS tag filter.
   *
   * @param body Set an AWS tag filter using an <code>aws_account_identifier</code>, <code>namespace
   *     </code>, and filtering string. Namespace options are <code>application_elb</code>, <code>
   *     elb</code>, <code>lambda</code>, <code>network_elb</code>, <code>rds</code>, <code>sqs
   *     </code>, and <code>custom</code>. (required)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   *
   * @deprecated
   */
  @Deprecated
  public ApiResponse<Object> createAWSTagFilterWithHttpInfo(AWSTagFilterCreateRequest body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createAWSTagFilter");
    }
    // create path and map variables
    String localVarPath = "/api/v1/integration/aws/filtering";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v1.AwsIntegrationApi.createAWSTagFilter",
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
        new GenericType<Object>() {});
  }

  /**
   * Set an AWS tag filter.
   *
   * <p>See {@link #createAWSTagFilterWithHttpInfo}.
   *
   * @param body Set an AWS tag filter using an <code>aws_account_identifier</code>, <code>namespace
   *     </code>, and filtering string. Namespace options are <code>application_elb</code>, <code>
   *     elb</code>, <code>lambda</code>, <code>network_elb</code>, <code>rds</code>, <code>sqs
   *     </code>, and <code>custom</code>. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Object&gt;&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<ApiResponse<Object>> createAWSTagFilterWithHttpInfoAsync(
      AWSTagFilterCreateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Object>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createAWSTagFilter"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/integration/aws/filtering";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1.AwsIntegrationApi.createAWSTagFilter",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Object>> result = new CompletableFuture<>();
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
        new GenericType<Object>() {});
  }

  /**
   * Generate a new external ID.
   *
   * <p>See {@link #createNewAWSExternalIDWithHttpInfo}.
   *
   * @param body Your Datadog role delegation name. For more information about your AWS account Role
   *     name, see the <a
   *     href="https://docs.datadoghq.com/integrations/amazon_web_services/#setup">Datadog AWS
   *     integration configuration info</a>. (required)
   * @return AWSAccountCreateResponse
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public AWSAccountCreateResponse createNewAWSExternalID(AWSAccount body) throws ApiException {
    return createNewAWSExternalIDWithHttpInfo(body).getData();
  }

  /**
   * Generate a new external ID.
   *
   * <p>See {@link #createNewAWSExternalIDWithHttpInfoAsync}.
   *
   * @param body Your Datadog role delegation name. For more information about your AWS account Role
   *     name, see the <a
   *     href="https://docs.datadoghq.com/integrations/amazon_web_services/#setup">Datadog AWS
   *     integration configuration info</a>. (required)
   * @return CompletableFuture&lt;AWSAccountCreateResponse&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<AWSAccountCreateResponse> createNewAWSExternalIDAsync(AWSAccount body) {
    return createNewAWSExternalIDWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * <strong>This endpoint is deprecated - use the V2 endpoints instead.</strong> Generate a new AWS
   * external ID for a given AWS account ID and role name pair.
   *
   * @param body Your Datadog role delegation name. For more information about your AWS account Role
   *     name, see the <a
   *     href="https://docs.datadoghq.com/integrations/amazon_web_services/#setup">Datadog AWS
   *     integration configuration info</a>. (required)
   * @return ApiResponse&lt;AWSAccountCreateResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   *
   * @deprecated
   */
  @Deprecated
  public ApiResponse<AWSAccountCreateResponse> createNewAWSExternalIDWithHttpInfo(AWSAccount body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createNewAWSExternalID");
    }
    // create path and map variables
    String localVarPath = "/api/v1/integration/aws/generate_new_external_id";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v1.AwsIntegrationApi.createNewAWSExternalID",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "PUT",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<AWSAccountCreateResponse>() {});
  }

  /**
   * Generate a new external ID.
   *
   * <p>See {@link #createNewAWSExternalIDWithHttpInfo}.
   *
   * @param body Your Datadog role delegation name. For more information about your AWS account Role
   *     name, see the <a
   *     href="https://docs.datadoghq.com/integrations/amazon_web_services/#setup">Datadog AWS
   *     integration configuration info</a>. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AWSAccountCreateResponse&gt;&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<ApiResponse<AWSAccountCreateResponse>>
      createNewAWSExternalIDWithHttpInfoAsync(AWSAccount body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<AWSAccountCreateResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createNewAWSExternalID"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/integration/aws/generate_new_external_id";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1.AwsIntegrationApi.createNewAWSExternalID",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AWSAccountCreateResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "PUT",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<AWSAccountCreateResponse>() {});
  }

  /**
   * Delete an AWS integration.
   *
   * <p>See {@link #deleteAWSAccountWithHttpInfo}.
   *
   * @param body AWS request object (required)
   * @return Object
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public Object deleteAWSAccount(AWSAccountDeleteRequest body) throws ApiException {
    return deleteAWSAccountWithHttpInfo(body).getData();
  }

  /**
   * Delete an AWS integration.
   *
   * <p>See {@link #deleteAWSAccountWithHttpInfoAsync}.
   *
   * @param body AWS request object (required)
   * @return CompletableFuture&lt;Object&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<Object> deleteAWSAccountAsync(AWSAccountDeleteRequest body) {
    return deleteAWSAccountWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * <strong>This endpoint is deprecated - use the V2 endpoints instead.</strong> Delete a
   * Datadog-AWS integration matching the specified <code>account_id</code> and <code>
   * role_name parameters</code>.
   *
   * @param body AWS request object (required)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict Error </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   *
   * @deprecated
   */
  @Deprecated
  public ApiResponse<Object> deleteAWSAccountWithHttpInfo(AWSAccountDeleteRequest body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling deleteAWSAccount");
    }
    // create path and map variables
    String localVarPath = "/api/v1/integration/aws";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v1.AwsIntegrationApi.deleteAWSAccount",
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
        new GenericType<Object>() {});
  }

  /**
   * Delete an AWS integration.
   *
   * <p>See {@link #deleteAWSAccountWithHttpInfo}.
   *
   * @param body AWS request object (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Object&gt;&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<ApiResponse<Object>> deleteAWSAccountWithHttpInfoAsync(
      AWSAccountDeleteRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Object>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling deleteAWSAccount"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/integration/aws";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1.AwsIntegrationApi.deleteAWSAccount",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Object>> result = new CompletableFuture<>();
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
        new GenericType<Object>() {});
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
   * @deprecated
   */
  @Deprecated
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
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<AWSEventBridgeDeleteResponse> deleteAWSEventBridgeSourceAsync(
      AWSEventBridgeDeleteRequest body) {
    return deleteAWSEventBridgeSourceWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * <strong>This endpoint is deprecated - use the V2 endpoints instead.</strong> Delete an Amazon
   * EventBridge source.
   *
   * @param body Delete the Amazon EventBridge source with the given name, region, and associated
   *     AWS account. (required)
   * @return ApiResponse&lt;AWSEventBridgeDeleteResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   *
   * @deprecated
   */
  @Deprecated
  public ApiResponse<AWSEventBridgeDeleteResponse> deleteAWSEventBridgeSourceWithHttpInfo(
      AWSEventBridgeDeleteRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling deleteAWSEventBridgeSource");
    }
    // create path and map variables
    String localVarPath = "/api/v1/integration/aws/event_bridge";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v1.AwsIntegrationApi.deleteAWSEventBridgeSource",
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
   * @deprecated
   */
  @Deprecated
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
    String localVarPath = "/api/v1/integration/aws/event_bridge";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1.AwsIntegrationApi.deleteAWSEventBridgeSource",
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
   * Delete a tag filtering entry.
   *
   * <p>See {@link #deleteAWSTagFilterWithHttpInfo}.
   *
   * @param body Delete a tag filtering entry for a given AWS account and <code>dd-aws</code>
   *     namespace. (required)
   * @return Object
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public Object deleteAWSTagFilter(AWSTagFilterDeleteRequest body) throws ApiException {
    return deleteAWSTagFilterWithHttpInfo(body).getData();
  }

  /**
   * Delete a tag filtering entry.
   *
   * <p>See {@link #deleteAWSTagFilterWithHttpInfoAsync}.
   *
   * @param body Delete a tag filtering entry for a given AWS account and <code>dd-aws</code>
   *     namespace. (required)
   * @return CompletableFuture&lt;Object&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<Object> deleteAWSTagFilterAsync(AWSTagFilterDeleteRequest body) {
    return deleteAWSTagFilterWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete a tag filtering entry.
   *
   * @param body Delete a tag filtering entry for a given AWS account and <code>dd-aws</code>
   *     namespace. (required)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   *
   * @deprecated
   */
  @Deprecated
  public ApiResponse<Object> deleteAWSTagFilterWithHttpInfo(AWSTagFilterDeleteRequest body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling deleteAWSTagFilter");
    }
    // create path and map variables
    String localVarPath = "/api/v1/integration/aws/filtering";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v1.AwsIntegrationApi.deleteAWSTagFilter",
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
        new GenericType<Object>() {});
  }

  /**
   * Delete a tag filtering entry.
   *
   * <p>See {@link #deleteAWSTagFilterWithHttpInfo}.
   *
   * @param body Delete a tag filtering entry for a given AWS account and <code>dd-aws</code>
   *     namespace. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Object&gt;&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<ApiResponse<Object>> deleteAWSTagFilterWithHttpInfoAsync(
      AWSTagFilterDeleteRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Object>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling deleteAWSTagFilter"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/integration/aws/filtering";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1.AwsIntegrationApi.deleteAWSTagFilter",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Object>> result = new CompletableFuture<>();
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
        new GenericType<Object>() {});
  }

  /**
   * List namespace rules.
   *
   * <p>See {@link #listAvailableAWSNamespacesWithHttpInfo}.
   *
   * @return List&lt;String&gt;
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public List<String> listAvailableAWSNamespaces() throws ApiException {
    return listAvailableAWSNamespacesWithHttpInfo().getData();
  }

  /**
   * List namespace rules.
   *
   * <p>See {@link #listAvailableAWSNamespacesWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;List&lt;String&gt;&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<List<String>> listAvailableAWSNamespacesAsync() {
    return listAvailableAWSNamespacesWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * <strong>This endpoint is deprecated - use the V2 endpoints instead.</strong> List all namespace
   * rules for a given Datadog-AWS integration. This endpoint takes no arguments.
   *
   * @return ApiResponse&lt;List&lt;String&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   *
   * @deprecated
   */
  @Deprecated
  public ApiResponse<List<String>> listAvailableAWSNamespacesWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v1/integration/aws/available_namespace_rules";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v1.AwsIntegrationApi.listAvailableAWSNamespaces",
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
        new GenericType<List<String>>() {});
  }

  /**
   * List namespace rules.
   *
   * <p>See {@link #listAvailableAWSNamespacesWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;List&lt;String&gt;&gt;&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<ApiResponse<List<String>>>
      listAvailableAWSNamespacesWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v1/integration/aws/available_namespace_rules";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1.AwsIntegrationApi.listAvailableAWSNamespaces",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<List<String>>> result = new CompletableFuture<>();
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
        new GenericType<List<String>>() {});
  }

  /** Manage optional parameters to listAWSAccounts. */
  public static class ListAWSAccountsOptionalParameters {
    private String accountId;
    private String roleName;
    private String accessKeyId;

    /**
     * Set accountId.
     *
     * @param accountId Only return AWS accounts that matches this <code>account_id</code>.
     *     (optional)
     * @return ListAWSAccountsOptionalParameters
     */
    public ListAWSAccountsOptionalParameters accountId(String accountId) {
      this.accountId = accountId;
      return this;
    }

    /**
     * Set roleName.
     *
     * @param roleName Only return AWS accounts that matches this role_name. (optional)
     * @return ListAWSAccountsOptionalParameters
     */
    public ListAWSAccountsOptionalParameters roleName(String roleName) {
      this.roleName = roleName;
      return this;
    }

    /**
     * Set accessKeyId.
     *
     * @param accessKeyId Only return AWS accounts that matches this <code>access_key_id</code>.
     *     (optional)
     * @return ListAWSAccountsOptionalParameters
     */
    public ListAWSAccountsOptionalParameters accessKeyId(String accessKeyId) {
      this.accessKeyId = accessKeyId;
      return this;
    }
  }

  /**
   * List all AWS integrations.
   *
   * <p>See {@link #listAWSAccountsWithHttpInfo}.
   *
   * @return AWSAccountListResponse
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public AWSAccountListResponse listAWSAccounts() throws ApiException {
    return listAWSAccountsWithHttpInfo(new ListAWSAccountsOptionalParameters()).getData();
  }

  /**
   * List all AWS integrations.
   *
   * <p>See {@link #listAWSAccountsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;AWSAccountListResponse&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<AWSAccountListResponse> listAWSAccountsAsync() {
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
   * @return AWSAccountListResponse
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public AWSAccountListResponse listAWSAccounts(ListAWSAccountsOptionalParameters parameters)
      throws ApiException {
    return listAWSAccountsWithHttpInfo(parameters).getData();
  }

  /**
   * List all AWS integrations.
   *
   * <p>See {@link #listAWSAccountsWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;AWSAccountListResponse&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<AWSAccountListResponse> listAWSAccountsAsync(
      ListAWSAccountsOptionalParameters parameters) {
    return listAWSAccountsWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * <strong>This endpoint is deprecated - use the V2 endpoints instead.</strong> List all
   * Datadog-AWS integrations available in your Datadog organization.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;AWSAccountListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   *
   * @deprecated
   */
  @Deprecated
  public ApiResponse<AWSAccountListResponse> listAWSAccountsWithHttpInfo(
      ListAWSAccountsOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    String accountId = parameters.accountId;
    String roleName = parameters.roleName;
    String accessKeyId = parameters.accessKeyId;
    // create path and map variables
    String localVarPath = "/api/v1/integration/aws";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "account_id", accountId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "role_name", roleName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "access_key_id", accessKeyId));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v1.AwsIntegrationApi.listAWSAccounts",
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
        new GenericType<AWSAccountListResponse>() {});
  }

  /**
   * List all AWS integrations.
   *
   * <p>See {@link #listAWSAccountsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;AWSAccountListResponse&gt;&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<ApiResponse<AWSAccountListResponse>> listAWSAccountsWithHttpInfoAsync(
      ListAWSAccountsOptionalParameters parameters) {
    Object localVarPostBody = null;
    String accountId = parameters.accountId;
    String roleName = parameters.roleName;
    String accessKeyId = parameters.accessKeyId;
    // create path and map variables
    String localVarPath = "/api/v1/integration/aws";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "account_id", accountId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "role_name", roleName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "access_key_id", accessKeyId));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1.AwsIntegrationApi.listAWSAccounts",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AWSAccountListResponse>> result = new CompletableFuture<>();
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
        new GenericType<AWSAccountListResponse>() {});
  }

  /**
   * Get all Amazon EventBridge sources.
   *
   * <p>See {@link #listAWSEventBridgeSourcesWithHttpInfo}.
   *
   * @return AWSEventBridgeListResponse
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public AWSEventBridgeListResponse listAWSEventBridgeSources() throws ApiException {
    return listAWSEventBridgeSourcesWithHttpInfo().getData();
  }

  /**
   * Get all Amazon EventBridge sources.
   *
   * <p>See {@link #listAWSEventBridgeSourcesWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;AWSEventBridgeListResponse&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<AWSEventBridgeListResponse> listAWSEventBridgeSourcesAsync() {
    return listAWSEventBridgeSourcesWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * <strong>This endpoint is deprecated - use the V2 endpoints instead.</strong> Get all Amazon
   * EventBridge sources.
   *
   * @return ApiResponse&lt;AWSEventBridgeListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   *
   * @deprecated
   */
  @Deprecated
  public ApiResponse<AWSEventBridgeListResponse> listAWSEventBridgeSourcesWithHttpInfo()
      throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v1/integration/aws/event_bridge";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v1.AwsIntegrationApi.listAWSEventBridgeSources",
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
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<ApiResponse<AWSEventBridgeListResponse>>
      listAWSEventBridgeSourcesWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v1/integration/aws/event_bridge";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1.AwsIntegrationApi.listAWSEventBridgeSources",
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
   * Get all AWS tag filters.
   *
   * <p>See {@link #listAWSTagFiltersWithHttpInfo}.
   *
   * @param accountId Only return AWS filters that matches this <code>account_id</code>. (required)
   * @return AWSTagFilterListResponse
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public AWSTagFilterListResponse listAWSTagFilters(String accountId) throws ApiException {
    return listAWSTagFiltersWithHttpInfo(accountId).getData();
  }

  /**
   * Get all AWS tag filters.
   *
   * <p>See {@link #listAWSTagFiltersWithHttpInfoAsync}.
   *
   * @param accountId Only return AWS filters that matches this <code>account_id</code>. (required)
   * @return CompletableFuture&lt;AWSTagFilterListResponse&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<AWSTagFilterListResponse> listAWSTagFiltersAsync(String accountId) {
    return listAWSTagFiltersWithHttpInfoAsync(accountId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get all AWS tag filters.
   *
   * @param accountId Only return AWS filters that matches this <code>account_id</code>. (required)
   * @return ApiResponse&lt;AWSTagFilterListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   *
   * @deprecated
   */
  @Deprecated
  public ApiResponse<AWSTagFilterListResponse> listAWSTagFiltersWithHttpInfo(String accountId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'accountId' when calling listAWSTagFilters");
    }
    // create path and map variables
    String localVarPath = "/api/v1/integration/aws/filtering";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "account_id", accountId));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v1.AwsIntegrationApi.listAWSTagFilters",
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
        new GenericType<AWSTagFilterListResponse>() {});
  }

  /**
   * Get all AWS tag filters.
   *
   * <p>See {@link #listAWSTagFiltersWithHttpInfo}.
   *
   * @param accountId Only return AWS filters that matches this <code>account_id</code>. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AWSTagFilterListResponse&gt;&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<ApiResponse<AWSTagFilterListResponse>>
      listAWSTagFiltersWithHttpInfoAsync(String accountId) {
    Object localVarPostBody = null;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      CompletableFuture<ApiResponse<AWSTagFilterListResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'accountId' when calling listAWSTagFilters"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/integration/aws/filtering";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "account_id", accountId));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1.AwsIntegrationApi.listAWSTagFilters",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AWSTagFilterListResponse>> result = new CompletableFuture<>();
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
        new GenericType<AWSTagFilterListResponse>() {});
  }

  /** Manage optional parameters to updateAWSAccount. */
  public static class UpdateAWSAccountOptionalParameters {
    private String accountId;
    private String roleName;
    private String accessKeyId;

    /**
     * Set accountId.
     *
     * @param accountId Only return AWS accounts that matches this <code>account_id</code>.
     *     (optional)
     * @return UpdateAWSAccountOptionalParameters
     */
    public UpdateAWSAccountOptionalParameters accountId(String accountId) {
      this.accountId = accountId;
      return this;
    }

    /**
     * Set roleName.
     *
     * @param roleName Only return AWS accounts that match this <code>role_name</code>. Required if
     *     <code>account_id</code> is specified. (optional)
     * @return UpdateAWSAccountOptionalParameters
     */
    public UpdateAWSAccountOptionalParameters roleName(String roleName) {
      this.roleName = roleName;
      return this;
    }

    /**
     * Set accessKeyId.
     *
     * @param accessKeyId Only return AWS accounts that matches this <code>access_key_id</code>.
     *     Required if none of the other two options are specified. (optional)
     * @return UpdateAWSAccountOptionalParameters
     */
    public UpdateAWSAccountOptionalParameters accessKeyId(String accessKeyId) {
      this.accessKeyId = accessKeyId;
      return this;
    }
  }

  /**
   * Update an AWS integration.
   *
   * <p>See {@link #updateAWSAccountWithHttpInfo}.
   *
   * @param body AWS request object (required)
   * @return Object
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public Object updateAWSAccount(AWSAccount body) throws ApiException {
    return updateAWSAccountWithHttpInfo(body, new UpdateAWSAccountOptionalParameters()).getData();
  }

  /**
   * Update an AWS integration.
   *
   * <p>See {@link #updateAWSAccountWithHttpInfoAsync}.
   *
   * @param body AWS request object (required)
   * @return CompletableFuture&lt;Object&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<Object> updateAWSAccountAsync(AWSAccount body) {
    return updateAWSAccountWithHttpInfoAsync(body, new UpdateAWSAccountOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update an AWS integration.
   *
   * <p>See {@link #updateAWSAccountWithHttpInfo}.
   *
   * @param body AWS request object (required)
   * @param parameters Optional parameters for the request.
   * @return Object
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public Object updateAWSAccount(AWSAccount body, UpdateAWSAccountOptionalParameters parameters)
      throws ApiException {
    return updateAWSAccountWithHttpInfo(body, parameters).getData();
  }

  /**
   * Update an AWS integration.
   *
   * <p>See {@link #updateAWSAccountWithHttpInfoAsync}.
   *
   * @param body AWS request object (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;Object&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<Object> updateAWSAccountAsync(
      AWSAccount body, UpdateAWSAccountOptionalParameters parameters) {
    return updateAWSAccountWithHttpInfoAsync(body, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * <strong>This endpoint is deprecated - use the V2 endpoints instead.</strong> Update a
   * Datadog-Amazon Web Services integration.
   *
   * @param body AWS request object (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict Error </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   *
   * @deprecated
   */
  @Deprecated
  public ApiResponse<Object> updateAWSAccountWithHttpInfo(
      AWSAccount body, UpdateAWSAccountOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateAWSAccount");
    }
    String accountId = parameters.accountId;
    String roleName = parameters.roleName;
    String accessKeyId = parameters.accessKeyId;
    // create path and map variables
    String localVarPath = "/api/v1/integration/aws";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "account_id", accountId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "role_name", roleName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "access_key_id", accessKeyId));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v1.AwsIntegrationApi.updateAWSAccount",
            localVarPath,
            localVarQueryParams,
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "PUT",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<Object>() {});
  }

  /**
   * Update an AWS integration.
   *
   * <p>See {@link #updateAWSAccountWithHttpInfo}.
   *
   * @param body AWS request object (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;Object&gt;&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<ApiResponse<Object>> updateAWSAccountWithHttpInfoAsync(
      AWSAccount body, UpdateAWSAccountOptionalParameters parameters) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Object>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateAWSAccount"));
      return result;
    }
    String accountId = parameters.accountId;
    String roleName = parameters.roleName;
    String accessKeyId = parameters.accessKeyId;
    // create path and map variables
    String localVarPath = "/api/v1/integration/aws";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "account_id", accountId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "role_name", roleName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "access_key_id", accessKeyId));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1.AwsIntegrationApi.updateAWSAccount",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Object>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "PUT",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<Object>() {});
  }
}
