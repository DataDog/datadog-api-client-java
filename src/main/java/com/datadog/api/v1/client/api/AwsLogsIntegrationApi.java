package com.datadog.api.v1.client.api;

import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiResponse;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.Pair;

import javax.ws.rs.core.GenericType;

import com.datadog.api.v1.client.model.AWSAccountAndLambdaRequest;
import com.datadog.api.v1.client.model.AWSLogsAsyncResponse;
import com.datadog.api.v1.client.model.AWSLogsListResponse;
import com.datadog.api.v1.client.model.AWSLogsListServicesResponse;
import com.datadog.api.v1.client.model.AWSLogsServicesRequest;
import com.datadog.api.v1.client.model.Error400;
import com.datadog.api.v1.client.model.Error403;

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

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

private ApiResponse<AWSLogsAsyncResponse> aWSLogsCheckLambdaAsyncWithHttpInfo(AWSAccountAndLambdaRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling aWSLogsCheckLambdaAsync");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/integration/aws/logs/check_async";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
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
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIaWSLogsCheckLambdaAsyncRequest {
    private AWSAccountAndLambdaRequest body;

    private APIaWSLogsCheckLambdaAsyncRequest() {
    }
    

    /**
     * Set body
     * @param body Check AWS Log Lambda Async request body. (required)
     * @return APIaWSLogsCheckLambdaAsyncRequest
     */
    public APIaWSLogsCheckLambdaAsyncRequest body(AWSAccountAndLambdaRequest body) {
      this.body = body;
      return this;
    }
    

    /**
     * Execute aWSLogsCheckLambdaAsync request
     * @return AWSLogsAsyncResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public AWSLogsAsyncResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute aWSLogsCheckLambdaAsync request with HTTP info returned
     * @return ApiResponse&lt;AWSLogsAsyncResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<AWSLogsAsyncResponse> executeWithHttpInfo() throws ApiException {
      return aWSLogsCheckLambdaAsyncWithHttpInfo(body);
    }
  }

  /**
   * Check function to see if a lambda_arn exists within an account.
   * ### Overview Check function to see if a lambda_arn exists within an account. This sends a job on our side if it does not exist, then immediately returns the status of that job. Subsequent requests will always repeat the above, so this endpoint can be polled intermittently instead of blocking. - Returns a status of &#39;created&#39; when it&#39;s checking if the Lambda exists in the account. - Returns a status of &#39;waiting&#39; while checking. - Returns a status of &#39;checked and ok&#39; if the Lambda exists. - Returns a status of &#39;error&#39; if the Lambda does not exist. ### Arguments * **&#x60;account_id&#x60;** [*required*, *default* &#x3D; **None**]: Your AWS Account ID without dashes. * **&#x60;lambda_arn&#x60;** [*required*, *default* &#x3D; **None**]: ARN of the Lambda to be checked.
   * @return aWSLogsCheckLambdaAsyncRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIaWSLogsCheckLambdaAsyncRequest aWSLogsCheckLambdaAsync() throws ApiException {
    return new APIaWSLogsCheckLambdaAsyncRequest();
  }

private ApiResponse<AWSLogsAsyncResponse> aWSLogsCheckServicesAsyncWithHttpInfo(AWSLogsServicesRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling aWSLogsCheckServicesAsync");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/integration/aws/logs/services_async";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
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
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIaWSLogsCheckServicesAsyncRequest {
    private AWSLogsServicesRequest body;

    private APIaWSLogsCheckServicesAsyncRequest() {
    }
    

    /**
     * Set body
     * @param body AWS Logs Async Services check request body (required)
     * @return APIaWSLogsCheckServicesAsyncRequest
     */
    public APIaWSLogsCheckServicesAsyncRequest body(AWSLogsServicesRequest body) {
      this.body = body;
      return this;
    }
    

    /**
     * Execute aWSLogsCheckServicesAsync request
     * @return AWSLogsAsyncResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public AWSLogsAsyncResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute aWSLogsCheckServicesAsync request with HTTP info returned
     * @return ApiResponse&lt;AWSLogsAsyncResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<AWSLogsAsyncResponse> executeWithHttpInfo() throws ApiException {
      return aWSLogsCheckServicesAsyncWithHttpInfo(body);
    }
  }

  /**
   * Asynchronous check for permissions for AWS log lambda config.
   * ### Overview Test if permissions are present to add log-forwarding triggers for the given services + AWS account. Input is the same as for EnableAWSLogServices. Done async, so can be repeatedly polled in a non-blocking fashion until the async request completes - Returns a status of &#39;created&#39; when it&#39;s checking if the permissions exists in the AWS account. - Returns a status of &#39;waiting&#39; while checking. - Returns a status of &#39;checked and ok&#39; if the Lambda exists. - Returns a status of &#39;error&#39; if the Lambda does not exist. ### Arguments * **&#x60;account_id&#x60;** [*required*, *default* &#x3D; **None**]: Your AWS Account ID without dashes. * **&#x60;services&#x60;** [*required*, *default* &#x3D; **None**]: Array of services IDs set to enable automatic log collection. Discover the list of available services with the Get list of AWS log ready services API endpoint
   * @return aWSLogsCheckServicesAsyncRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIaWSLogsCheckServicesAsyncRequest aWSLogsCheckServicesAsync() throws ApiException {
    return new APIaWSLogsCheckServicesAsyncRequest();
  }

private ApiResponse<List<AWSLogsListResponse>> aWSLogsListWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/v1/integration/aws/logs";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<List<AWSLogsListResponse>> localVarReturnType = new GenericType<List<AWSLogsListResponse>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIaWSLogsListRequest {

    private APIaWSLogsListRequest() {
    }
    

    /**
     * Execute aWSLogsList request
     * @return List&lt;AWSLogsListResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public List<AWSLogsListResponse> execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute aWSLogsList request with HTTP info returned
     * @return ApiResponse&lt;List&lt;AWSLogsListResponse&gt;&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<List<AWSLogsListResponse>> executeWithHttpInfo() throws ApiException {
      return aWSLogsListWithHttpInfo();
    }
  }

  /**
   * List configured AWS log integrations.
   * ### Overview List all Datadog-AWS Logs integrations configured in your Datadog account.
   * @return aWSLogsListRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIaWSLogsListRequest aWSLogsList() throws ApiException {
    return new APIaWSLogsListRequest();
  }

private ApiResponse<List<AWSLogsListServicesResponse>> aWSLogsServicesListWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/v1/integration/aws/logs/services";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<List<AWSLogsListServicesResponse>> localVarReturnType = new GenericType<List<AWSLogsListServicesResponse>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIaWSLogsServicesListRequest {

    private APIaWSLogsServicesListRequest() {
    }
    

    /**
     * Execute aWSLogsServicesList request
     * @return List&lt;AWSLogsListServicesResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public List<AWSLogsListServicesResponse> execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute aWSLogsServicesList request with HTTP info returned
     * @return ApiResponse&lt;List&lt;AWSLogsListServicesResponse&gt;&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<List<AWSLogsListServicesResponse>> executeWithHttpInfo() throws ApiException {
      return aWSLogsServicesListWithHttpInfo();
    }
  }

  /**
   * Get list of AWS log ready services.
   * ### Overview Get the list of current AWS services that Datadog offers automatic log collection. Use returned service IDs with the services parameter for the Enable an AWS service log collection API endpoint.
   * @return aWSLogsServicesListRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIaWSLogsServicesListRequest aWSLogsServicesList() throws ApiException {
    return new APIaWSLogsServicesListRequest();
  }

private ApiResponse<Object> addAWSLambdaARNWithHttpInfo(AWSAccountAndLambdaRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling addAWSLambdaARN");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/integration/aws/logs";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
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
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIaddAWSLambdaARNRequest {
    private AWSAccountAndLambdaRequest body;

    private APIaddAWSLambdaARNRequest() {
    }
    

    /**
     * Set body
     * @param body Check AWS Log Lambda Async request body. (required)
     * @return APIaddAWSLambdaARNRequest
     */
    public APIaddAWSLambdaARNRequest body(AWSAccountAndLambdaRequest body) {
      this.body = body;
      return this;
    }
    

    /**
     * Execute addAWSLambdaARN request
     * @return Object
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public Object execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute addAWSLambdaARN request with HTTP info returned
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
      return addAWSLambdaARNWithHttpInfo(body);
    }
  }

  /**
   * Add a AWS Lambda ARN to your Datadog account.
   * ### Overview Attach the Lambda ARN of the Lambda created for the Datadog-AWS log collection to your AWS account ID to enable log collection. ### Arguments * **&#x60;account_id&#x60;** [*required*, *default* &#x3D; **None**]: Your AWS Account ID without dashes. * **&#x60;lambda_arn&#x60;** [*required*, *default* &#x3D; **None**]: ARN of the Datadog Lambda created during the Datadog-Amazon Web services Log collection setup.
   * @return addAWSLambdaARNRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIaddAWSLambdaARNRequest addAWSLambdaARN() throws ApiException {
    return new APIaddAWSLambdaARNRequest();
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
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIdeleteAWSLambdaARNRequest {
    private AWSAccountAndLambdaRequest body;

    private APIdeleteAWSLambdaARNRequest() {
    }
    

    /**
     * Set body
     * @param body Check AWS Log Lambda Async request body. (required)
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
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
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
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
      return deleteAWSLambdaARNWithHttpInfo(body);
    }
  }

  /**
   * Delete a AWS Lambda ARN from your Datadog account.
   * ### Overview Delete a Lambda ARN of a Lambda created for the Datadog-AWS log collection in your Datadog account. ### Arguments * **&#x60;account_id&#x60;** [*required*, *default* &#x3D; **None**]: Your AWS Account ID without dashes. * **&#x60;lambda_arn&#x60;** [*required*, *default* &#x3D; **None**]: ARN of the Lambda to be deleted.
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
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIenableAWSLogServicesRequest {
    private AWSLogsServicesRequest body;

    private APIenableAWSLogServicesRequest() {
    }
    

    /**
     * Set body
     * @param body Enable AWS Log Services request object (required)
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
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
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
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
      return enableAWSLogServicesWithHttpInfo(body);
    }
  }

  /**
   * Enable Automatic Log collection for your AWS services.
   * ### Overview Enable automatic log collection for a list of services. This should be run after running &#39;AddAWSLambdaARN&#39; to save the config. ### Arguments * **&#x60;account_id&#x60;** [*required*, *default* &#x3D; **None**]: Your AWS Account ID without dashes. * **&#x60;services&#x60;** [*required*, *default* &#x3D; **None**]: Array of services IDs set to enable automatic log collection. Discover the list of available services with the Get list of AWS log ready services API endpoint
   * @return enableAWSLogServicesRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIenableAWSLogServicesRequest enableAWSLogServices() throws ApiException {
    return new APIenableAWSLogServicesRequest();
  }
}
