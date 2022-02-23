package com.datadog.api.v1.client.api;

import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.ApiResponse;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.Pair;
import com.datadog.api.v1.client.model.AWSAccountAndLambdaRequest;
import com.datadog.api.v1.client.model.AWSLogsAsyncResponse;
import com.datadog.api.v1.client.model.AWSLogsListResponse;
import com.datadog.api.v1.client.model.AWSLogsListServicesResponse;
import com.datadog.api.v1.client.model.AWSLogsServicesRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.core.GenericType;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AwsLogsIntegrationApi {
  private ApiClient apiClient;

  public AwsLogsIntegrationApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AwsLogsIntegrationApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get the API client
   *
   * @return API client
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * Set the API client
   *
   * @param apiClient an instance of API client
   */
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Check that an AWS Lambda Function exists
   *
   * <p>See {@link #checkAWSLogsLambdaAsyncWithHttpInfo}.
   *
   * @param body Check AWS Log Lambda Async request body. (required)
   * @return AWSLogsAsyncResponse
   * @throws ApiException if fails to make API call
   */
  public AWSLogsAsyncResponse checkAWSLogsLambdaAsync(AWSAccountAndLambdaRequest body)
      throws ApiException {
    return checkAWSLogsLambdaAsyncWithHttpInfo(body).getData();
  }

  /**
   * Check that an AWS Lambda Function exists
   *
   * <p>See {@link #checkAWSLogsLambdaAsyncWithHttpInfoAsync}.
   *
   * @param body Check AWS Log Lambda Async request body. (required)
   * @return CompletableFuture&lt;AWSLogsAsyncResponse&gt;
   */
  public CompletableFuture<AWSLogsAsyncResponse> checkAWSLogsLambdaAsyncAsync(
      AWSAccountAndLambdaRequest body) {
    return checkAWSLogsLambdaAsyncWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Check that an AWS Lambda Function exists
   *
   * <p>Test if permissions are present to add a log-forwarding triggers for the given services and
   * AWS account. The input is the same as for Enable an AWS service log collection. Subsequent
   * requests will always repeat the above, so this endpoint can be polled intermittently instead of
   * blocking. - Returns a status of &#39;created&#39; when it&#39;s checking if the Lambda exists
   * in the account. - Returns a status of &#39;waiting&#39; while checking. - Returns a status of
   * &#39;checked and ok&#39; if the Lambda exists. - Returns a status of &#39;error&#39; if the
   * Lambda does not exist.
   *
   * @param body Check AWS Log Lambda Async request body. (required)
   * @return ApiResponse&lt;AWSLogsAsyncResponse&gt;
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
   */
  public ApiResponse<AWSLogsAsyncResponse> checkAWSLogsLambdaAsyncWithHttpInfo(
      AWSAccountAndLambdaRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling checkAWSLogsLambdaAsync");
    }
    // create path and map variables
    String localVarPath = "/api/v1/integration/aws/logs/check_async";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "AwsLogsIntegrationApi.checkAWSLogsLambdaAsync",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<AWSLogsAsyncResponse>() {});
  }

  /**
   * Check that an AWS Lambda Function exists
   *
   * <p>See {@link #checkAWSLogsLambdaAsyncWithHttpInfo}.
   *
   * @param body Check AWS Log Lambda Async request body. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AWSLogsAsyncResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AWSLogsAsyncResponse>>
      checkAWSLogsLambdaAsyncWithHttpInfoAsync(AWSAccountAndLambdaRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<AWSLogsAsyncResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling checkAWSLogsLambdaAsync"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/integration/aws/logs/check_async";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "checkAWSLogsLambdaAsync");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "AwsLogsIntegrationApi.checkAWSLogsLambdaAsync",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AWSLogsAsyncResponse>> result = new CompletableFuture<>();
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
        new GenericType<AWSLogsAsyncResponse>() {});
  }

  /**
   * Check permissions for log services
   *
   * <p>See {@link #checkAWSLogsServicesAsyncWithHttpInfo}.
   *
   * @param body Check AWS Logs Async Services request body. (required)
   * @return AWSLogsAsyncResponse
   * @throws ApiException if fails to make API call
   */
  public AWSLogsAsyncResponse checkAWSLogsServicesAsync(AWSLogsServicesRequest body)
      throws ApiException {
    return checkAWSLogsServicesAsyncWithHttpInfo(body).getData();
  }

  /**
   * Check permissions for log services
   *
   * <p>See {@link #checkAWSLogsServicesAsyncWithHttpInfoAsync}.
   *
   * @param body Check AWS Logs Async Services request body. (required)
   * @return CompletableFuture&lt;AWSLogsAsyncResponse&gt;
   */
  public CompletableFuture<AWSLogsAsyncResponse> checkAWSLogsServicesAsyncAsync(
      AWSLogsServicesRequest body) {
    return checkAWSLogsServicesAsyncWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Check permissions for log services
   *
   * <p>Test if permissions are present to add log-forwarding triggers for the given services and
   * AWS account. Input is the same as for &#x60;EnableAWSLogServices&#x60;. Done async, so can be
   * repeatedly polled in a non-blocking fashion until the async request completes. - Returns a
   * status of &#x60;created&#x60; when it&#39;s checking if the permissions exists in the AWS
   * account. - Returns a status of &#x60;waiting&#x60; while checking. - Returns a status of
   * &#x60;checked and ok&#x60; if the Lambda exists. - Returns a status of &#x60;error&#x60; if the
   * Lambda does not exist.
   *
   * @param body Check AWS Logs Async Services request body. (required)
   * @return ApiResponse&lt;AWSLogsAsyncResponse&gt;
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
   */
  public ApiResponse<AWSLogsAsyncResponse> checkAWSLogsServicesAsyncWithHttpInfo(
      AWSLogsServicesRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling checkAWSLogsServicesAsync");
    }
    // create path and map variables
    String localVarPath = "/api/v1/integration/aws/logs/services_async";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "AwsLogsIntegrationApi.checkAWSLogsServicesAsync",
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
        new GenericType<AWSLogsAsyncResponse>() {});
  }

  /**
   * Check permissions for log services
   *
   * <p>See {@link #checkAWSLogsServicesAsyncWithHttpInfo}.
   *
   * @param body Check AWS Logs Async Services request body. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AWSLogsAsyncResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AWSLogsAsyncResponse>>
      checkAWSLogsServicesAsyncWithHttpInfoAsync(AWSLogsServicesRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<AWSLogsAsyncResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling checkAWSLogsServicesAsync"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/integration/aws/logs/services_async";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "checkAWSLogsServicesAsync");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "AwsLogsIntegrationApi.checkAWSLogsServicesAsync",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AWSLogsAsyncResponse>> result = new CompletableFuture<>();
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
        new GenericType<AWSLogsAsyncResponse>() {});
  }

  /**
   * Add AWS Log Lambda ARN
   *
   * <p>See {@link #createAWSLambdaARNWithHttpInfo}.
   *
   * @param body AWS Log Lambda Async request body. (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object createAWSLambdaARN(AWSAccountAndLambdaRequest body) throws ApiException {
    return createAWSLambdaARNWithHttpInfo(body).getData();
  }

  /**
   * Add AWS Log Lambda ARN
   *
   * <p>See {@link #createAWSLambdaARNWithHttpInfoAsync}.
   *
   * @param body AWS Log Lambda Async request body. (required)
   * @return CompletableFuture&lt;Object&gt;
   */
  public CompletableFuture<Object> createAWSLambdaARNAsync(AWSAccountAndLambdaRequest body) {
    return createAWSLambdaARNWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Add AWS Log Lambda ARN
   *
   * <p>Attach the Lambda ARN of the Lambda created for the Datadog-AWS log collection to your AWS
   * account ID to enable log collection.
   *
   * @param body AWS Log Lambda Async request body. (required)
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
   */
  public ApiResponse<Object> createAWSLambdaARNWithHttpInfo(AWSAccountAndLambdaRequest body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createAWSLambdaARN");
    }
    // create path and map variables
    String localVarPath = "/api/v1/integration/aws/logs";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "AwsLogsIntegrationApi.createAWSLambdaARN",
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
   * Add AWS Log Lambda ARN
   *
   * <p>See {@link #createAWSLambdaARNWithHttpInfo}.
   *
   * @param body AWS Log Lambda Async request body. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Object&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Object>> createAWSLambdaARNWithHttpInfoAsync(
      AWSAccountAndLambdaRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Object>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createAWSLambdaARN"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/integration/aws/logs";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "createAWSLambdaARN");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "AwsLogsIntegrationApi.createAWSLambdaARN",
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
   * Delete an AWS Logs integration
   *
   * <p>See {@link #deleteAWSLambdaARNWithHttpInfo}.
   *
   * @param body Delete AWS Lambda ARN request body. (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object deleteAWSLambdaARN(AWSAccountAndLambdaRequest body) throws ApiException {
    return deleteAWSLambdaARNWithHttpInfo(body).getData();
  }

  /**
   * Delete an AWS Logs integration
   *
   * <p>See {@link #deleteAWSLambdaARNWithHttpInfoAsync}.
   *
   * @param body Delete AWS Lambda ARN request body. (required)
   * @return CompletableFuture&lt;Object&gt;
   */
  public CompletableFuture<Object> deleteAWSLambdaARNAsync(AWSAccountAndLambdaRequest body) {
    return deleteAWSLambdaARNWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete an AWS Logs integration
   *
   * <p>Delete a Datadog-AWS logs configuration by removing the specific Lambda ARN associated with
   * a given AWS account.
   *
   * @param body Delete AWS Lambda ARN request body. (required)
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
   */
  public ApiResponse<Object> deleteAWSLambdaARNWithHttpInfo(AWSAccountAndLambdaRequest body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling deleteAWSLambdaARN");
    }
    // create path and map variables
    String localVarPath = "/api/v1/integration/aws/logs";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "AwsLogsIntegrationApi.deleteAWSLambdaARN",
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
   * Delete an AWS Logs integration
   *
   * <p>See {@link #deleteAWSLambdaARNWithHttpInfo}.
   *
   * @param body Delete AWS Lambda ARN request body. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Object&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Object>> deleteAWSLambdaARNWithHttpInfoAsync(
      AWSAccountAndLambdaRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Object>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling deleteAWSLambdaARN"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/integration/aws/logs";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "deleteAWSLambdaARN");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "AwsLogsIntegrationApi.deleteAWSLambdaARN",
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
   * Enable an AWS Logs integration
   *
   * <p>See {@link #enableAWSLogServicesWithHttpInfo}.
   *
   * @param body Enable AWS Log Services request body. (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object enableAWSLogServices(AWSLogsServicesRequest body) throws ApiException {
    return enableAWSLogServicesWithHttpInfo(body).getData();
  }

  /**
   * Enable an AWS Logs integration
   *
   * <p>See {@link #enableAWSLogServicesWithHttpInfoAsync}.
   *
   * @param body Enable AWS Log Services request body. (required)
   * @return CompletableFuture&lt;Object&gt;
   */
  public CompletableFuture<Object> enableAWSLogServicesAsync(AWSLogsServicesRequest body) {
    return enableAWSLogServicesWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Enable an AWS Logs integration
   *
   * <p>Enable automatic log collection for a list of services. This should be run after running
   * &#x60;CreateAWSLambdaARN&#x60; to save the configuration.
   *
   * @param body Enable AWS Log Services request body. (required)
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
   */
  public ApiResponse<Object> enableAWSLogServicesWithHttpInfo(AWSLogsServicesRequest body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling enableAWSLogServices");
    }
    // create path and map variables
    String localVarPath = "/api/v1/integration/aws/logs/services";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "AwsLogsIntegrationApi.enableAWSLogServices",
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
   * Enable an AWS Logs integration
   *
   * <p>See {@link #enableAWSLogServicesWithHttpInfo}.
   *
   * @param body Enable AWS Log Services request body. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Object&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Object>> enableAWSLogServicesWithHttpInfoAsync(
      AWSLogsServicesRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Object>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling enableAWSLogServices"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/integration/aws/logs/services";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "enableAWSLogServices");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "AwsLogsIntegrationApi.enableAWSLogServices",
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
   * List all AWS Logs integrations
   *
   * <p>See {@link #listAWSLogsIntegrationsWithHttpInfo}.
   *
   * @return List&lt;AWSLogsListResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public List<AWSLogsListResponse> listAWSLogsIntegrations() throws ApiException {
    return listAWSLogsIntegrationsWithHttpInfo().getData();
  }

  /**
   * List all AWS Logs integrations
   *
   * <p>See {@link #listAWSLogsIntegrationsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;List&lt;AWSLogsListResponse&gt;&gt;
   */
  public CompletableFuture<List<AWSLogsListResponse>> listAWSLogsIntegrationsAsync() {
    return listAWSLogsIntegrationsWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List all AWS Logs integrations
   *
   * <p>List all Datadog-AWS Logs integrations configured in your Datadog account.
   *
   * @return ApiResponse&lt;List&lt;AWSLogsListResponse&gt;&gt;
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
   */
  public ApiResponse<List<AWSLogsListResponse>> listAWSLogsIntegrationsWithHttpInfo()
      throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v1/integration/aws/logs";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "AwsLogsIntegrationApi.listAWSLogsIntegrations",
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
        new GenericType<List<AWSLogsListResponse>>() {});
  }

  /**
   * List all AWS Logs integrations
   *
   * <p>See {@link #listAWSLogsIntegrationsWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;List&lt;AWSLogsListResponse&gt;&gt;&gt;
   */
  public CompletableFuture<ApiResponse<List<AWSLogsListResponse>>>
      listAWSLogsIntegrationsWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v1/integration/aws/logs";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listAWSLogsIntegrations");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "AwsLogsIntegrationApi.listAWSLogsIntegrations",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<List<AWSLogsListResponse>>> result = new CompletableFuture<>();
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
        new GenericType<List<AWSLogsListResponse>>() {});
  }

  /**
   * Get list of AWS log ready services
   *
   * <p>See {@link #listAWSLogsServicesWithHttpInfo}.
   *
   * @return List&lt;AWSLogsListServicesResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public List<AWSLogsListServicesResponse> listAWSLogsServices() throws ApiException {
    return listAWSLogsServicesWithHttpInfo().getData();
  }

  /**
   * Get list of AWS log ready services
   *
   * <p>See {@link #listAWSLogsServicesWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;List&lt;AWSLogsListServicesResponse&gt;&gt;
   */
  public CompletableFuture<List<AWSLogsListServicesResponse>> listAWSLogsServicesAsync() {
    return listAWSLogsServicesWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get list of AWS log ready services
   *
   * <p>Get the list of current AWS services that Datadog offers automatic log collection. Use
   * returned service IDs with the services parameter for the Enable an AWS service log collection
   * API endpoint.
   *
   * @return ApiResponse&lt;List&lt;AWSLogsListServicesResponse&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<List<AWSLogsListServicesResponse>> listAWSLogsServicesWithHttpInfo()
      throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v1/integration/aws/logs/services";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "AwsLogsIntegrationApi.listAWSLogsServices",
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
        new GenericType<List<AWSLogsListServicesResponse>>() {});
  }

  /**
   * Get list of AWS log ready services
   *
   * <p>See {@link #listAWSLogsServicesWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;List&lt;AWSLogsListServicesResponse&gt;&gt;&gt;
   */
  public CompletableFuture<ApiResponse<List<AWSLogsListServicesResponse>>>
      listAWSLogsServicesWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v1/integration/aws/logs/services";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listAWSLogsServices");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "AwsLogsIntegrationApi.listAWSLogsServices",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<List<AWSLogsListServicesResponse>>> result =
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
        new GenericType<List<AWSLogsListServicesResponse>>() {});
  }
}
