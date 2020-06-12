package com.datadog.api.v1.client.api;

import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiResponse;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.Pair;

import javax.ws.rs.core.GenericType;

import com.datadog.api.v1.client.model.APIErrorResponse;
import com.datadog.api.v1.client.model.AWSAccountAndLambdaRequest;
import com.datadog.api.v1.client.model.AWSLogsAsyncResponse;
import com.datadog.api.v1.client.model.AWSLogsListResponse;
import com.datadog.api.v1.client.model.AWSLogsListServicesResponse;
import com.datadog.api.v1.client.model.AWSLogsServicesRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class AwsLogsIntegrationApi {
  private ApiClient apiClient;

  public AwsLogsIntegrationApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AwsLogsIntegrationApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get the API cilent
   *
   * @return API client
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * Set the API cilent
   *
   * @param apiClient an instance of API client
   */
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }


private ApiResponse<AWSLogsAsyncResponse> checkAWSLogsLambdaAsyncWithHttpInfo(AWSAccountAndLambdaRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling checkAWSLogsLambdaAsync");
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

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<AWSLogsAsyncResponse> localVarReturnType = new GenericType<AWSLogsAsyncResponse>() {};

    return apiClient.invokeAPI("AwsLogsIntegrationApi.checkAWSLogsLambdaAsync", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType);
  }

  public class APIcheckAWSLogsLambdaAsyncRequest {
    private AWSAccountAndLambdaRequest body;

    private APIcheckAWSLogsLambdaAsyncRequest() {
    }

    /**
     * Set body
     * @param body Check AWS Log Lambda Async request body. (required)
     * @return APIcheckAWSLogsLambdaAsyncRequest
     */
    public APIcheckAWSLogsLambdaAsyncRequest body(AWSAccountAndLambdaRequest body) {
      this.body = body;
      return this;
    }

    /**
     * Execute checkAWSLogsLambdaAsync request
     * @return AWSLogsAsyncResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public AWSLogsAsyncResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute checkAWSLogsLambdaAsync request with HTTP info returned
     * @return ApiResponse&lt;AWSLogsAsyncResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<AWSLogsAsyncResponse> executeWithHttpInfo() throws ApiException {
      return checkAWSLogsLambdaAsyncWithHttpInfo(body);
    }
  }

  /**
   * Check that an AWS Lambda Function exists
   * Test if permissions are present to add a log-forwarding triggers for the given services and AWS account. The input is the same as for Enable an AWS service log collection. Subsequent requests will always repeat the above, so this endpoint can be polled intermittently instead of blocking.  - Returns a status of &#39;created&#39; when it&#39;s checking if the Lambda exists in the account. - Returns a status of &#39;waiting&#39; while checking. - Returns a status of &#39;checked and ok&#39; if the Lambda exists. - Returns a status of &#39;error&#39; if the Lambda does not exist.
   * @return checkAWSLogsLambdaAsyncRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIcheckAWSLogsLambdaAsyncRequest checkAWSLogsLambdaAsync() throws ApiException {
    return new APIcheckAWSLogsLambdaAsyncRequest();
  }

private ApiResponse<AWSLogsAsyncResponse> checkAWSLogsServicesAsyncWithHttpInfo(AWSLogsServicesRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling checkAWSLogsServicesAsync");
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

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<AWSLogsAsyncResponse> localVarReturnType = new GenericType<AWSLogsAsyncResponse>() {};

    return apiClient.invokeAPI("AwsLogsIntegrationApi.checkAWSLogsServicesAsync", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType);
  }

  public class APIcheckAWSLogsServicesAsyncRequest {
    private AWSLogsServicesRequest body;

    private APIcheckAWSLogsServicesAsyncRequest() {
    }

    /**
     * Set body
     * @param body Check AWS Logs Async Services request body. (required)
     * @return APIcheckAWSLogsServicesAsyncRequest
     */
    public APIcheckAWSLogsServicesAsyncRequest body(AWSLogsServicesRequest body) {
      this.body = body;
      return this;
    }

    /**
     * Execute checkAWSLogsServicesAsync request
     * @return AWSLogsAsyncResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public AWSLogsAsyncResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute checkAWSLogsServicesAsync request with HTTP info returned
     * @return ApiResponse&lt;AWSLogsAsyncResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<AWSLogsAsyncResponse> executeWithHttpInfo() throws ApiException {
      return checkAWSLogsServicesAsyncWithHttpInfo(body);
    }
  }

  /**
   * Check permissions for log services
   * Test if permissions are present to add log-forwarding triggers for the given services and AWS account. Input is the same as for &#x60;EnableAWSLogServices&#x60;. Done async, so can be repeatedly polled in a non-blocking fashion until the async request completes.  - Returns a status of &#x60;created&#x60; when it&#39;s checking if the permissions exists   in the AWS account. - Returns a status of &#x60;waiting&#x60; while checking. - Returns a status of &#x60;checked and ok&#x60; if the Lambda exists. - Returns a status of &#x60;error&#x60; if the Lambda does not exist.
   * @return checkAWSLogsServicesAsyncRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIcheckAWSLogsServicesAsyncRequest checkAWSLogsServicesAsync() throws ApiException {
    return new APIcheckAWSLogsServicesAsyncRequest();
  }

private ApiResponse<Object> createAWSLambdaARNWithHttpInfo(AWSAccountAndLambdaRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createAWSLambdaARN");
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

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};

    return apiClient.invokeAPI("AwsLogsIntegrationApi.createAWSLambdaARN", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType);
  }

  public class APIcreateAWSLambdaARNRequest {
    private AWSAccountAndLambdaRequest body;

    private APIcreateAWSLambdaARNRequest() {
    }

    /**
     * Set body
     * @param body AWS Log Lambda Async request body. (required)
     * @return APIcreateAWSLambdaARNRequest
     */
    public APIcreateAWSLambdaARNRequest body(AWSAccountAndLambdaRequest body) {
      this.body = body;
      return this;
    }

    /**
     * Execute createAWSLambdaARN request
     * @return Object
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public Object execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute createAWSLambdaARN request with HTTP info returned
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
      return createAWSLambdaARNWithHttpInfo(body);
    }
  }

  /**
   * Add AWS Log Lambda ARN
   * Attach the Lambda ARN of the Lambda created for the Datadog-AWS log collection to your AWS account ID to enable log collection.
   * @return createAWSLambdaARNRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIcreateAWSLambdaARNRequest createAWSLambdaARN() throws ApiException {
    return new APIcreateAWSLambdaARNRequest();
  }

private ApiResponse<Object> deleteAWSLambdaARNWithHttpInfo(AWSAccountAndLambdaRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling deleteAWSLambdaARN");
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

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};

    return apiClient.invokeAPI("AwsLogsIntegrationApi.deleteAWSLambdaARN", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType);
  }

  public class APIdeleteAWSLambdaARNRequest {
    private AWSAccountAndLambdaRequest body;

    private APIdeleteAWSLambdaARNRequest() {
    }

    /**
     * Set body
     * @param body Delete AWS Lambda ARN request body. (required)
     * @return APIdeleteAWSLambdaARNRequest
     */
    public APIdeleteAWSLambdaARNRequest body(AWSAccountAndLambdaRequest body) {
      this.body = body;
      return this;
    }

    /**
     * Execute deleteAWSLambdaARN request
     * @return Object
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public Object execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute deleteAWSLambdaARN request with HTTP info returned
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
      return deleteAWSLambdaARNWithHttpInfo(body);
    }
  }

  /**
   * Delete an AWS Logs integration
   * Delete a Datadog-AWS logs configuration by removing the specific Lambda ARN associated with a given AWS account.
   * @return deleteAWSLambdaARNRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIdeleteAWSLambdaARNRequest deleteAWSLambdaARN() throws ApiException {
    return new APIdeleteAWSLambdaARNRequest();
  }

private ApiResponse<Object> enableAWSLogServicesWithHttpInfo(AWSLogsServicesRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling enableAWSLogServices");
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

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};

    return apiClient.invokeAPI("AwsLogsIntegrationApi.enableAWSLogServices", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType);
  }

  public class APIenableAWSLogServicesRequest {
    private AWSLogsServicesRequest body;

    private APIenableAWSLogServicesRequest() {
    }

    /**
     * Set body
     * @param body Enable AWS Log Services request body. (required)
     * @return APIenableAWSLogServicesRequest
     */
    public APIenableAWSLogServicesRequest body(AWSLogsServicesRequest body) {
      this.body = body;
      return this;
    }

    /**
     * Execute enableAWSLogServices request
     * @return Object
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public Object execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute enableAWSLogServices request with HTTP info returned
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
      return enableAWSLogServicesWithHttpInfo(body);
    }
  }

  /**
   * Enable an AWS Logs integration
   * Enable automatic log collection for a list of services. This should be run after running &#x60;CreateAWSLambdaARN&#x60; to save the configuration.
   * @return enableAWSLogServicesRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIenableAWSLogServicesRequest enableAWSLogServices() throws ApiException {
    return new APIenableAWSLogServicesRequest();
  }

private ApiResponse<List<AWSLogsListResponse>> listAWSLogsIntegrationsWithHttpInfo() throws ApiException {
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

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<List<AWSLogsListResponse>> localVarReturnType = new GenericType<List<AWSLogsListResponse>>() {};

    return apiClient.invokeAPI("AwsLogsIntegrationApi.listAWSLogsIntegrations", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType);
  }

  public class APIlistAWSLogsIntegrationsRequest {

    private APIlistAWSLogsIntegrationsRequest() {
    }

    /**
     * Execute listAWSLogsIntegrations request
     * @return List&lt;AWSLogsListResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public List<AWSLogsListResponse> execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listAWSLogsIntegrations request with HTTP info returned
     * @return ApiResponse&lt;List&lt;AWSLogsListResponse&gt;&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<List<AWSLogsListResponse>> executeWithHttpInfo() throws ApiException {
      return listAWSLogsIntegrationsWithHttpInfo();
    }
  }

  /**
   * List all AWS Logs integrations
   * List all Datadog-AWS Logs integrations configured in your Datadog account.
   * @return listAWSLogsIntegrationsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistAWSLogsIntegrationsRequest listAWSLogsIntegrations() throws ApiException {
    return new APIlistAWSLogsIntegrationsRequest();
  }

private ApiResponse<List<AWSLogsListServicesResponse>> listAWSLogsServicesWithHttpInfo() throws ApiException {
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

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<List<AWSLogsListServicesResponse>> localVarReturnType = new GenericType<List<AWSLogsListServicesResponse>>() {};

    return apiClient.invokeAPI("AwsLogsIntegrationApi.listAWSLogsServices", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType);
  }

  public class APIlistAWSLogsServicesRequest {

    private APIlistAWSLogsServicesRequest() {
    }

    /**
     * Execute listAWSLogsServices request
     * @return List&lt;AWSLogsListServicesResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public List<AWSLogsListServicesResponse> execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listAWSLogsServices request with HTTP info returned
     * @return ApiResponse&lt;List&lt;AWSLogsListServicesResponse&gt;&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<List<AWSLogsListServicesResponse>> executeWithHttpInfo() throws ApiException {
      return listAWSLogsServicesWithHttpInfo();
    }
  }

  /**
   * Get list of AWS log ready services
   * Get the list of current AWS services that Datadog offers automatic log collection. Use returned service IDs with the services parameter for the Enable an AWS service log collection API endpoint.
   * @return listAWSLogsServicesRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistAWSLogsServicesRequest listAWSLogsServices() throws ApiException {
    return new APIlistAWSLogsServicesRequest();
  }
}
