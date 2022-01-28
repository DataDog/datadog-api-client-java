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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "checkAWSLogsLambdaAsync");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<AWSLogsAsyncResponse> localVarReturnType =
        new GenericType<AWSLogsAsyncResponse>() {};

    return apiClient.invokeAPI(
        "AwsLogsIntegrationApi.checkAWSLogsLambdaAsync",
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false);
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "checkAWSLogsLambdaAsync");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<AWSLogsAsyncResponse> localVarReturnType =
        new GenericType<AWSLogsAsyncResponse>() {};

    return apiClient.invokeAPIAsync(
        "AwsLogsIntegrationApi.checkAWSLogsLambdaAsync",
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false);
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "checkAWSLogsServicesAsync");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<AWSLogsAsyncResponse> localVarReturnType =
        new GenericType<AWSLogsAsyncResponse>() {};

    return apiClient.invokeAPI(
        "AwsLogsIntegrationApi.checkAWSLogsServicesAsync",
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false);
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "checkAWSLogsServicesAsync");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<AWSLogsAsyncResponse> localVarReturnType =
        new GenericType<AWSLogsAsyncResponse>() {};

    return apiClient.invokeAPIAsync(
        "AwsLogsIntegrationApi.checkAWSLogsServicesAsync",
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false);
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "createAWSLambdaARN");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};

    return apiClient.invokeAPI(
        "AwsLogsIntegrationApi.createAWSLambdaARN",
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false);
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "createAWSLambdaARN");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};

    return apiClient.invokeAPIAsync(
        "AwsLogsIntegrationApi.createAWSLambdaARN",
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false);
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "deleteAWSLambdaARN");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};

    return apiClient.invokeAPI(
        "AwsLogsIntegrationApi.deleteAWSLambdaARN",
        localVarPath,
        "DELETE",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false);
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "deleteAWSLambdaARN");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};

    return apiClient.invokeAPIAsync(
        "AwsLogsIntegrationApi.deleteAWSLambdaARN",
        localVarPath,
        "DELETE",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false);
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "enableAWSLogServices");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};

    return apiClient.invokeAPI(
        "AwsLogsIntegrationApi.enableAWSLogServices",
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false);
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "enableAWSLogServices");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};

    return apiClient.invokeAPIAsync(
        "AwsLogsIntegrationApi.enableAWSLogServices",
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false);
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listAWSLogsIntegrations");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<List<AWSLogsListResponse>> localVarReturnType =
        new GenericType<List<AWSLogsListResponse>>() {};

    return apiClient.invokeAPI(
        "AwsLogsIntegrationApi.listAWSLogsIntegrations",
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false);
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listAWSLogsIntegrations");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<List<AWSLogsListResponse>> localVarReturnType =
        new GenericType<List<AWSLogsListResponse>>() {};

    return apiClient.invokeAPIAsync(
        "AwsLogsIntegrationApi.listAWSLogsIntegrations",
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false);
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listAWSLogsServices");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<List<AWSLogsListServicesResponse>> localVarReturnType =
        new GenericType<List<AWSLogsListServicesResponse>>() {};

    return apiClient.invokeAPI(
        "AwsLogsIntegrationApi.listAWSLogsServices",
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false);
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listAWSLogsServices");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<List<AWSLogsListServicesResponse>> localVarReturnType =
        new GenericType<List<AWSLogsListServicesResponse>>() {};

    return apiClient.invokeAPIAsync(
        "AwsLogsIntegrationApi.listAWSLogsServices",
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false);
  }
}
