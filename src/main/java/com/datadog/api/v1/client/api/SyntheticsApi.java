package com.datadog.api.v1.client.api;

import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiResponse;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.Pair;

import javax.ws.rs.core.GenericType;

import com.datadog.api.v1.client.model.Error400;
import com.datadog.api.v1.client.model.Error402;
import com.datadog.api.v1.client.model.Error404;
import com.datadog.api.v1.client.model.SyntheticsAPITestResultFull;
import com.datadog.api.v1.client.model.SyntheticsBrowserTestResultFull;
import com.datadog.api.v1.client.model.SyntheticsDeleteTestsPayload;
import com.datadog.api.v1.client.model.SyntheticsDeleteTestsResponse;
import com.datadog.api.v1.client.model.SyntheticsDevices;
import com.datadog.api.v1.client.model.SyntheticsGetAPITestLatestResultsResponse;
import com.datadog.api.v1.client.model.SyntheticsGetAllTestsResponse;
import com.datadog.api.v1.client.model.SyntheticsGetBrowserTestLatestResultsResponse;
import com.datadog.api.v1.client.model.SyntheticsGetTestLatestResultsPayload;
import com.datadog.api.v1.client.model.SyntheticsLocations;
import com.datadog.api.v1.client.model.SyntheticsSetTestPauseStatusPayload;
import com.datadog.api.v1.client.model.SyntheticsTestDetails;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class SyntheticsApi {
  private ApiClient apiClient;

  public SyntheticsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SyntheticsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

private ApiResponse<SyntheticsTestDetails> createTestWithHttpInfo(SyntheticsTestDetails body, String fromTestId) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createTest");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/synthetics/tests";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "from_test_id", fromTestId));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<SyntheticsTestDetails> localVarReturnType = new GenericType<SyntheticsTestDetails>() {};
    return apiClient.invokeAPI("SyntheticsApi.createTest", localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIcreateTestRequest {
    private SyntheticsTestDetails body;
    private String fromTestId;

    private APIcreateTestRequest() {
    }
    

    /**
     * Set body
     * @param body Details of the test to create (required)
     * @return APIcreateTestRequest
     */
    public APIcreateTestRequest body(SyntheticsTestDetails body) {
      this.body = body;
      return this;
    }
    

    /**
     * Set fromTestId
     * @param fromTestId Public id of the test to clone, undefined if the test is created ex nihilo (optional)
     * @return APIcreateTestRequest
     */
    public APIcreateTestRequest fromTestId(String fromTestId) {
      this.fromTestId = fromTestId;
      return this;
    }
    

    /**
     * Execute createTest request
     * @return SyntheticsTestDetails
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK - Returns the created/cloned test details </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> JSON format is wrong, creation/cloning failed </td><td>  -  </td></tr>
         <tr><td> 402 </td><td> test quota is reached </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Synthetics is not activated for the user, test is not owned by the user, the test to clone can&#39;t be found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public SyntheticsTestDetails execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute createTest request with HTTP info returned
     * @return ApiResponse&lt;SyntheticsTestDetails&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK - Returns the created/cloned test details </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> JSON format is wrong, creation/cloning failed </td><td>  -  </td></tr>
         <tr><td> 402 </td><td> test quota is reached </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Synthetics is not activated for the user, test is not owned by the user, the test to clone can&#39;t be found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<SyntheticsTestDetails> executeWithHttpInfo() throws ApiException {
      return createTestWithHttpInfo(body, fromTestId);
    }
  }

  /**
   * Create or clone test
   * ### Overview Create (or clone) a Synthetics test ### Arguments * **&#x60;from_test_id&#x60;** The public id of the test to clone, undefined if the test is created ex nihilo * **&#x60;test&#x60;** [*required*] The details of the test to create
   * @return createTestRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIcreateTestRequest createTest() throws ApiException {
    return new APIcreateTestRequest();
  }

private ApiResponse<SyntheticsDeleteTestsResponse> deleteTestsWithHttpInfo(SyntheticsDeleteTestsPayload body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling deleteTests");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/synthetics/tests/delete";

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

    GenericType<SyntheticsDeleteTestsResponse> localVarReturnType = new GenericType<SyntheticsDeleteTestsResponse>() {};
    return apiClient.invokeAPI("SyntheticsApi.deleteTests", localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIdeleteTestsRequest {
    private SyntheticsDeleteTestsPayload body;

    private APIdeleteTestsRequest() {
    }
    

    /**
     * Set body
     * @param body Public id list of the Synthetics tests to be deleted (required)
     * @return APIdeleteTestsRequest
     */
    public APIdeleteTestsRequest body(SyntheticsDeleteTestsPayload body) {
      this.body = body;
      return this;
    }
    

    /**
     * Execute deleteTests request
     * @return SyntheticsDeleteTestsResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> JSON format is wrong, test cannot be deleted as it&#39;s used elsewhere (as a subtest or in an uptime widget), some ids are not owned by the user </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> tests to be deleted can&#39;t be found or Synthetics is not activated for the user </td><td>  -  </td></tr>
       </table>
     
     */
    
    public SyntheticsDeleteTestsResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute deleteTests request with HTTP info returned
     * @return ApiResponse&lt;SyntheticsDeleteTestsResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> JSON format is wrong, test cannot be deleted as it&#39;s used elsewhere (as a subtest or in an uptime widget), some ids are not owned by the user </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> tests to be deleted can&#39;t be found or Synthetics is not activated for the user </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<SyntheticsDeleteTestsResponse> executeWithHttpInfo() throws ApiException {
      return deleteTestsWithHttpInfo(body);
    }
  }

  /**
   * Delete multiple tests
   * ### Overview Delete multiple Synthetics tests by id ### Arguments * **&#x60;public_ids&#x60;** [*required*] The public id list of the Synthetics tests to delete
   * @return deleteTestsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIdeleteTestsRequest deleteTests() throws ApiException {
    return new APIdeleteTestsRequest();
  }

private ApiResponse<SyntheticsGetAPITestLatestResultsResponse> getAPITestLatestResultsWithHttpInfo(String publicId, SyntheticsGetTestLatestResultsPayload body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'publicId' is set
    if (publicId == null) {
      throw new ApiException(400, "Missing the required parameter 'publicId' when calling getAPITestLatestResults");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling getAPITestLatestResults");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/synthetics/tests/{public_id}/results"
      .replaceAll("\\{" + "public_id" + "\\}", apiClient.escapeString(publicId.toString()));

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

    GenericType<SyntheticsGetAPITestLatestResultsResponse> localVarReturnType = new GenericType<SyntheticsGetAPITestLatestResultsResponse>() {};
    return apiClient.invokeAPI("SyntheticsApi.getAPITestLatestResults", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIgetAPITestLatestResultsRequest {
    private String publicId;
    private SyntheticsGetTestLatestResultsPayload body;

    private APIgetAPITestLatestResultsRequest(String publicId) {
      this.publicId = publicId;
    }
    

    /**
     * Set body
     * @param body Pause/live status to set the given Synthetics test to (required)
     * @return APIgetAPITestLatestResultsRequest
     */
    public APIgetAPITestLatestResultsRequest body(SyntheticsGetTestLatestResultsPayload body) {
      this.body = body;
      return this;
    }
    

    /**
     * Execute getAPITestLatestResults request
     * @return SyntheticsGetAPITestLatestResultsResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Synthetics is not activated for the user, test is not owned by the user </td><td>  -  </td></tr>
       </table>
     
     */
    
    public SyntheticsGetAPITestLatestResultsResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getAPITestLatestResults request with HTTP info returned
     * @return ApiResponse&lt;SyntheticsGetAPITestLatestResultsResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Synthetics is not activated for the user, test is not owned by the user </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<SyntheticsGetAPITestLatestResultsResponse> executeWithHttpInfo() throws ApiException {
      return getAPITestLatestResultsWithHttpInfo(publicId, body);
    }
  }

  /**
   * Get test latest results (as summaries)
   * ### Overview Get the latest results (as summaries) from a given API Synthetics test ### Arguments * **&#x60;public_id&#x60;** [*required*] The public id of the test to get results from * **&#x60;from_ts&#x60;** [*required*] The timestamp for the start of the time frame in which to search for results * **&#x60;to_ts&#x60;** [*required*] The timestamp for the end of the time frame in which to search for results * **&#x60;probe_dc&#x60;** [*required*] The list of locations for which to search for results
   * @param publicId The public id of the test for which to search results for (required)
   * @return getAPITestLatestResultsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIgetAPITestLatestResultsRequest getAPITestLatestResults(String publicId) throws ApiException {
    return new APIgetAPITestLatestResultsRequest(publicId);
  }

private ApiResponse<SyntheticsAPITestResultFull> getAPITestResultWithHttpInfo(String publicId, String resultId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'publicId' is set
    if (publicId == null) {
      throw new ApiException(400, "Missing the required parameter 'publicId' when calling getAPITestResult");
    }
    
    // verify the required parameter 'resultId' is set
    if (resultId == null) {
      throw new ApiException(400, "Missing the required parameter 'resultId' when calling getAPITestResult");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/synthetics/tests/{public_id}/results/{result_id}"
      .replaceAll("\\{" + "public_id" + "\\}", apiClient.escapeString(publicId.toString()))
      .replaceAll("\\{" + "result_id" + "\\}", apiClient.escapeString(resultId.toString()));

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

    GenericType<SyntheticsAPITestResultFull> localVarReturnType = new GenericType<SyntheticsAPITestResultFull>() {};
    return apiClient.invokeAPI("SyntheticsApi.getAPITestResult", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIgetAPITestResultRequest {
    private String publicId;
    private String resultId;

    private APIgetAPITestResultRequest(String publicId, String resultId) {
      this.publicId = publicId;
      this.resultId = resultId;
    }
    

    /**
     * Execute getAPITestResult request
     * @return SyntheticsAPITestResultFull
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Synthetics is not activated for the user, test or result is not owned by the user </td><td>  -  </td></tr>
       </table>
     
     */
    
    public SyntheticsAPITestResultFull execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getAPITestResult request with HTTP info returned
     * @return ApiResponse&lt;SyntheticsAPITestResultFull&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Synthetics is not activated for the user, test or result is not owned by the user </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<SyntheticsAPITestResultFull> executeWithHttpInfo() throws ApiException {
      return getAPITestResultWithHttpInfo(publicId, resultId);
    }
  }

  /**
   * Get test result (API)
   * ### Overview Get a specific full result from a given (API) Synthetics test ### Arguments * **&#x60;public_id&#x60;** [*required*] The public id of the API test to get the result from * **&#x60;result_id&#x60;** [*required*] The id of the result to get
   * @param publicId The public id of the API test to which the target result belongs (required)
   * @param resultId The id of the result to get (required)
   * @return getAPITestResultRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIgetAPITestResultRequest getAPITestResult(String publicId, String resultId) throws ApiException {
    return new APIgetAPITestResultRequest(publicId, resultId);
  }

private ApiResponse<SyntheticsDevices> getAllDevicesWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/v1/synthetics/browser/devices";

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

    GenericType<SyntheticsDevices> localVarReturnType = new GenericType<SyntheticsDevices>() {};
    return apiClient.invokeAPI("SyntheticsApi.getAllDevices", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIgetAllDevicesRequest {

    private APIgetAllDevicesRequest() {
    }
    

    /**
     * Execute getAllDevices request
     * @return SyntheticsDevices
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       </table>
     
     */
    
    public SyntheticsDevices execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getAllDevices request with HTTP info returned
     * @return ApiResponse&lt;SyntheticsDevices&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<SyntheticsDevices> executeWithHttpInfo() throws ApiException {
      return getAllDevicesWithHttpInfo();
    }
  }

  /**
   * Get all devices
   * ### Overview Get the list of devices available for Synthetics browser tests ### Arguments No arguments required
   * @return getAllDevicesRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIgetAllDevicesRequest getAllDevices() throws ApiException {
    return new APIgetAllDevicesRequest();
  }

private ApiResponse<SyntheticsLocations> getAllLocationsWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/v1/synthetics/locations";

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

    GenericType<SyntheticsLocations> localVarReturnType = new GenericType<SyntheticsLocations>() {};
    return apiClient.invokeAPI("SyntheticsApi.getAllLocations", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIgetAllLocationsRequest {

    private APIgetAllLocationsRequest() {
    }
    

    /**
     * Execute getAllLocations request
     * @return SyntheticsLocations
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       </table>
     
     */
    
    public SyntheticsLocations execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getAllLocations request with HTTP info returned
     * @return ApiResponse&lt;SyntheticsLocations&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<SyntheticsLocations> executeWithHttpInfo() throws ApiException {
      return getAllLocationsWithHttpInfo();
    }
  }

  /**
   * Get all locations (public and private)
   * ### Overview Get the list of public and private locations available for Synthetics tests ### Arguments No arguments required
   * @return getAllLocationsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIgetAllLocationsRequest getAllLocations() throws ApiException {
    return new APIgetAllLocationsRequest();
  }

private ApiResponse<SyntheticsGetAllTestsResponse> getAllTestsWithHttpInfo(String checkType) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/v1/synthetics/tests";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "check_type", checkType));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<SyntheticsGetAllTestsResponse> localVarReturnType = new GenericType<SyntheticsGetAllTestsResponse>() {};
    return apiClient.invokeAPI("SyntheticsApi.getAllTests", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIgetAllTestsRequest {
    private String checkType;

    private APIgetAllTestsRequest() {
    }
    

    /**
     * Set checkType
     * @param checkType api or browser to filter the list by type, undefined to get the unfiltered list (optional)
     * @return APIgetAllTestsRequest
     */
    public APIgetAllTestsRequest checkType(String checkType) {
      this.checkType = checkType;
      return this;
    }
    

    /**
     * Execute getAllTests request
     * @return SyntheticsGetAllTestsResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK - Returns the list of all Synthetics test (properly filtered by type) </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Synthetics is not activated for the user </td><td>  -  </td></tr>
       </table>
     
     */
    
    public SyntheticsGetAllTestsResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getAllTests request with HTTP info returned
     * @return ApiResponse&lt;SyntheticsGetAllTestsResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK - Returns the list of all Synthetics test (properly filtered by type) </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Synthetics is not activated for the user </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<SyntheticsGetAllTestsResponse> executeWithHttpInfo() throws ApiException {
      return getAllTestsWithHttpInfo(checkType);
    }
  }

  /**
   * Get all test
   * ### Overview Get the list of all Synthetics tests (can be filtered by type) ### Arguments * **&#x60;check_type&#x60;** The type to filter on (api or browser to filter the list by type, undefined to get the unfiltered list)
   * @return getAllTestsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIgetAllTestsRequest getAllTests() throws ApiException {
    return new APIgetAllTestsRequest();
  }

private ApiResponse<SyntheticsGetBrowserTestLatestResultsResponse> getBrowserTestLatestResultsWithHttpInfo(String publicId, SyntheticsGetTestLatestResultsPayload body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'publicId' is set
    if (publicId == null) {
      throw new ApiException(400, "Missing the required parameter 'publicId' when calling getBrowserTestLatestResults");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling getBrowserTestLatestResults");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/synthetics/tests/browser/{public_id}/results"
      .replaceAll("\\{" + "public_id" + "\\}", apiClient.escapeString(publicId.toString()));

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

    GenericType<SyntheticsGetBrowserTestLatestResultsResponse> localVarReturnType = new GenericType<SyntheticsGetBrowserTestLatestResultsResponse>() {};
    return apiClient.invokeAPI("SyntheticsApi.getBrowserTestLatestResults", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIgetBrowserTestLatestResultsRequest {
    private String publicId;
    private SyntheticsGetTestLatestResultsPayload body;

    private APIgetBrowserTestLatestResultsRequest(String publicId) {
      this.publicId = publicId;
    }
    

    /**
     * Set body
     * @param body Pause/live status to set the given Synthetics test to (required)
     * @return APIgetBrowserTestLatestResultsRequest
     */
    public APIgetBrowserTestLatestResultsRequest body(SyntheticsGetTestLatestResultsPayload body) {
      this.body = body;
      return this;
    }
    

    /**
     * Execute getBrowserTestLatestResults request
     * @return SyntheticsGetBrowserTestLatestResultsResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Synthetics is not activated for the user, test is not owned by the user </td><td>  -  </td></tr>
       </table>
     
     */
    
    public SyntheticsGetBrowserTestLatestResultsResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getBrowserTestLatestResults request with HTTP info returned
     * @return ApiResponse&lt;SyntheticsGetBrowserTestLatestResultsResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Synthetics is not activated for the user, test is not owned by the user </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<SyntheticsGetBrowserTestLatestResultsResponse> executeWithHttpInfo() throws ApiException {
      return getBrowserTestLatestResultsWithHttpInfo(publicId, body);
    }
  }

  /**
   * Get test latest results (as summaries)
   * ### Overview Get the latest results (as summaries) from a given browser Synthetics test ### Arguments * **&#x60;public_id&#x60;** [*required*] The public id of the test to get results from * **&#x60;from_ts&#x60;** [*required*] The timestamp for the start of the time frame in which to search for results * **&#x60;to_ts&#x60;** [*required*] The timestamp for the end of the time frame in which to search for results * **&#x60;probe_dc&#x60;** [*required*] The list of locations for which to search for results
   * @param publicId The public id of the browser test for which to search results for (required)
   * @return getBrowserTestLatestResultsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIgetBrowserTestLatestResultsRequest getBrowserTestLatestResults(String publicId) throws ApiException {
    return new APIgetBrowserTestLatestResultsRequest(publicId);
  }

private ApiResponse<SyntheticsBrowserTestResultFull> getBrowserTestResultWithHttpInfo(String publicId, String resultId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'publicId' is set
    if (publicId == null) {
      throw new ApiException(400, "Missing the required parameter 'publicId' when calling getBrowserTestResult");
    }
    
    // verify the required parameter 'resultId' is set
    if (resultId == null) {
      throw new ApiException(400, "Missing the required parameter 'resultId' when calling getBrowserTestResult");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/synthetics/tests/browser/{public_id}/results/{result_id}"
      .replaceAll("\\{" + "public_id" + "\\}", apiClient.escapeString(publicId.toString()))
      .replaceAll("\\{" + "result_id" + "\\}", apiClient.escapeString(resultId.toString()));

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

    GenericType<SyntheticsBrowserTestResultFull> localVarReturnType = new GenericType<SyntheticsBrowserTestResultFull>() {};
    return apiClient.invokeAPI("SyntheticsApi.getBrowserTestResult", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIgetBrowserTestResultRequest {
    private String publicId;
    private String resultId;

    private APIgetBrowserTestResultRequest(String publicId, String resultId) {
      this.publicId = publicId;
      this.resultId = resultId;
    }
    

    /**
     * Execute getBrowserTestResult request
     * @return SyntheticsBrowserTestResultFull
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Synthetics is not activated for the user, test or result is not owned by the user </td><td>  -  </td></tr>
       </table>
     
     */
    
    public SyntheticsBrowserTestResultFull execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getBrowserTestResult request with HTTP info returned
     * @return ApiResponse&lt;SyntheticsBrowserTestResultFull&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Synthetics is not activated for the user, test or result is not owned by the user </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<SyntheticsBrowserTestResultFull> executeWithHttpInfo() throws ApiException {
      return getBrowserTestResultWithHttpInfo(publicId, resultId);
    }
  }

  /**
   * Get test result (browser)
   * ### Overview Get a specific full result from a given (browser) Synthetics test ### Arguments * **&#x60;public_id&#x60;** [*required*] The public id of the browser test to get the result from * **&#x60;result_id&#x60;** [*required*] The id of the result to get
   * @param publicId The public id of the browser test to which the target result belongs (required)
   * @param resultId The id of the result to get (required)
   * @return getBrowserTestResultRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIgetBrowserTestResultRequest getBrowserTestResult(String publicId, String resultId) throws ApiException {
    return new APIgetBrowserTestResultRequest(publicId, resultId);
  }

private ApiResponse<SyntheticsTestDetails> getTestWithHttpInfo(String publicId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'publicId' is set
    if (publicId == null) {
      throw new ApiException(400, "Missing the required parameter 'publicId' when calling getTest");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/synthetics/tests/{public_id}"
      .replaceAll("\\{" + "public_id" + "\\}", apiClient.escapeString(publicId.toString()));

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

    GenericType<SyntheticsTestDetails> localVarReturnType = new GenericType<SyntheticsTestDetails>() {};
    return apiClient.invokeAPI("SyntheticsApi.getTest", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIgetTestRequest {
    private String publicId;

    private APIgetTestRequest(String publicId) {
      this.publicId = publicId;
    }
    

    /**
     * Execute getTest request
     * @return SyntheticsTestDetails
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Synthetics is not activated for the user, test is not owned by the user </td><td>  -  </td></tr>
       </table>
     
     */
    
    public SyntheticsTestDetails execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getTest request with HTTP info returned
     * @return ApiResponse&lt;SyntheticsTestDetails&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Synthetics is not activated for the user, test is not owned by the user </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<SyntheticsTestDetails> executeWithHttpInfo() throws ApiException {
      return getTestWithHttpInfo(publicId);
    }
  }

  /**
   * Get test
   * ### Overview Get the details of a specific Synthetics test ### Arguments * **&#x60;public_id&#x60;** [*required*] The public id of the test to get details from
   * @param publicId The public id of the test to get details from (required)
   * @return getTestRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIgetTestRequest getTest(String publicId) throws ApiException {
    return new APIgetTestRequest(publicId);
  }

private ApiResponse<Boolean> setTestPauseStatusWithHttpInfo(String publicId, SyntheticsSetTestPauseStatusPayload body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'publicId' is set
    if (publicId == null) {
      throw new ApiException(400, "Missing the required parameter 'publicId' when calling setTestPauseStatus");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling setTestPauseStatus");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/synthetics/tests/{public_id}/status"
      .replaceAll("\\{" + "public_id" + "\\}", apiClient.escapeString(publicId.toString()));

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

    GenericType<Boolean> localVarReturnType = new GenericType<Boolean>() {};
    return apiClient.invokeAPI("SyntheticsApi.setTestPauseStatus", localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIsetTestPauseStatusRequest {
    private String publicId;
    private SyntheticsSetTestPauseStatusPayload body;

    private APIsetTestPauseStatusRequest(String publicId) {
      this.publicId = publicId;
    }
    

    /**
     * Set body
     * @param body Pause/live status to set the given Synthetics test to (required)
     * @return APIsetTestPauseStatusRequest
     */
    public APIsetTestPauseStatusRequest body(SyntheticsSetTestPauseStatusPayload body) {
      this.body = body;
      return this;
    }
    

    /**
     * Execute setTestPauseStatus request
     * @return Boolean
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK - Returns a boolean indicating if the update was successful </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> JSON format is wrong </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Synthetics is not activated for the user, test is not owned by the user </td><td>  -  </td></tr>
       </table>
     
     */
    
    public Boolean execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute setTestPauseStatus request with HTTP info returned
     * @return ApiResponse&lt;Boolean&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK - Returns a boolean indicating if the update was successful </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> JSON format is wrong </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Synthetics is not activated for the user, test is not owned by the user </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<Boolean> executeWithHttpInfo() throws ApiException {
      return setTestPauseStatusWithHttpInfo(publicId, body);
    }
  }

  /**
   * Change test pause/live status
   * ### Overview Change pause/live status of a given Synthetics test ### Arguments * **&#x60;public_id&#x60;** [*required*] The public id of the Synthetics test to update * **&#x60;new_status&#x60;** [*required*] The pause/live status to set the given Synthetics test to
   * @param publicId The public id of the Synthetics test to update (required)
   * @return setTestPauseStatusRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIsetTestPauseStatusRequest setTestPauseStatus(String publicId) throws ApiException {
    return new APIsetTestPauseStatusRequest(publicId);
  }

private ApiResponse<SyntheticsTestDetails> updateTestWithHttpInfo(String publicId, SyntheticsTestDetails body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'publicId' is set
    if (publicId == null) {
      throw new ApiException(400, "Missing the required parameter 'publicId' when calling updateTest");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateTest");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/synthetics/tests/{public_id}"
      .replaceAll("\\{" + "public_id" + "\\}", apiClient.escapeString(publicId.toString()));

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

    GenericType<SyntheticsTestDetails> localVarReturnType = new GenericType<SyntheticsTestDetails>() {};
    return apiClient.invokeAPI("SyntheticsApi.updateTest", localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIupdateTestRequest {
    private String publicId;
    private SyntheticsTestDetails body;

    private APIupdateTestRequest(String publicId) {
      this.publicId = publicId;
    }
    

    /**
     * Set body
     * @param body New test details to be saved (required)
     * @return APIupdateTestRequest
     */
    public APIupdateTestRequest body(SyntheticsTestDetails body) {
      this.body = body;
      return this;
    }
    

    /**
     * Execute updateTest request
     * @return SyntheticsTestDetails
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> JSON format is wrong, updating subtype is forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Synthetics is not activated for the user, test is not owned by the user, test can&#39;t be found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public SyntheticsTestDetails execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute updateTest request with HTTP info returned
     * @return ApiResponse&lt;SyntheticsTestDetails&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> JSON format is wrong, updating subtype is forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Synthetics is not activated for the user, test is not owned by the user, test can&#39;t be found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<SyntheticsTestDetails> executeWithHttpInfo() throws ApiException {
      return updateTestWithHttpInfo(publicId, body);
    }
  }

  /**
   * Update test
   * ### Overview Update the details of a specific Synthetics test ### Arguments * **&#x60;public_id&#x60;** [*required*] The public id of the test to update * **&#x60;test&#x60;** [*required*] The new test details to be saved
   * @param publicId The public id of the test to get details from (required)
   * @return updateTestRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIupdateTestRequest updateTest(String publicId) throws ApiException {
    return new APIupdateTestRequest(publicId);
  }
}
