package com.datadog.api.v1.client.api;

import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiResponse;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.Pair;

import javax.ws.rs.core.GenericType;

import com.datadog.api.v1.client.model.APIErrorResponse;
import com.datadog.api.v1.client.model.SyntheticsAPITestResultFull;
import com.datadog.api.v1.client.model.SyntheticsBrowserTestResultFull;
import com.datadog.api.v1.client.model.SyntheticsCITestBody;
import com.datadog.api.v1.client.model.SyntheticsDeleteTestsPayload;
import com.datadog.api.v1.client.model.SyntheticsDeleteTestsResponse;
import com.datadog.api.v1.client.model.SyntheticsGetAPITestLatestResultsResponse;
import com.datadog.api.v1.client.model.SyntheticsGetBrowserTestLatestResultsResponse;
import com.datadog.api.v1.client.model.SyntheticsGlobalVariable;
import com.datadog.api.v1.client.model.SyntheticsListTestsResponse;
import com.datadog.api.v1.client.model.SyntheticsLocations;
import com.datadog.api.v1.client.model.SyntheticsPrivateLocation;
import com.datadog.api.v1.client.model.SyntheticsPrivateLocationCreationResponse;
import com.datadog.api.v1.client.model.SyntheticsTestDetails;
import com.datadog.api.v1.client.model.SyntheticsTriggerCITestsResponse;
import com.datadog.api.v1.client.model.SyntheticsUpdateTestPauseStatusPayload;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SyntheticsApi {
  private ApiClient apiClient;

  public SyntheticsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SyntheticsApi(ApiClient apiClient) {
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


private ApiResponse<SyntheticsGlobalVariable> createGlobalVariableWithHttpInfo(SyntheticsGlobalVariable body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createGlobalVariable");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/synthetics/variables";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "createGlobalVariable");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<SyntheticsGlobalVariable> localVarReturnType = new GenericType<SyntheticsGlobalVariable>() {};

    return apiClient.invokeAPI("SyntheticsApi.createGlobalVariable", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIcreateGlobalVariableRequest {
    private SyntheticsGlobalVariable body;

    private APIcreateGlobalVariableRequest() {
    }

    /**
     * Set body
     * @param body Details of the global variable to create. (required)
     * @return APIcreateGlobalVariableRequest
     */
    public APIcreateGlobalVariableRequest body(SyntheticsGlobalVariable body) {
      this.body = body;
      return this;
    }

    /**
     * Execute createGlobalVariable request
     * @return SyntheticsGlobalVariable
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Invalid request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     
     */
    
    public SyntheticsGlobalVariable execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute createGlobalVariable request with HTTP info returned
     * @return ApiResponse&lt;SyntheticsGlobalVariable&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Invalid request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<SyntheticsGlobalVariable> executeWithHttpInfo() throws ApiException {
      return createGlobalVariableWithHttpInfo(body);
    }
  }

  /**
   * Create a global variable
   * Create a Synthetics global variable.
   * @return createGlobalVariableRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIcreateGlobalVariableRequest createGlobalVariable() throws ApiException {
    return new APIcreateGlobalVariableRequest();
  }

private ApiResponse<SyntheticsPrivateLocationCreationResponse> createPrivateLocationWithHttpInfo(SyntheticsPrivateLocation body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createPrivateLocation");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/synthetics/private-locations";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "createPrivateLocation");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<SyntheticsPrivateLocationCreationResponse> localVarReturnType = new GenericType<SyntheticsPrivateLocationCreationResponse>() {};

    return apiClient.invokeAPI("SyntheticsApi.createPrivateLocation", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIcreatePrivateLocationRequest {
    private SyntheticsPrivateLocation body;

    private APIcreatePrivateLocationRequest() {
    }

    /**
     * Set body
     * @param body Details of the private location to create. (required)
     * @return APIcreatePrivateLocationRequest
     */
    public APIcreatePrivateLocationRequest body(SyntheticsPrivateLocation body) {
      this.body = body;
      return this;
    }

    /**
     * Execute createPrivateLocation request
     * @return SyntheticsPrivateLocationCreationResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 402 </td><td> Quota reached for private locations </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Private locations are not activated for the user </td><td>  -  </td></tr>
       </table>
     
     */
    
    public SyntheticsPrivateLocationCreationResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute createPrivateLocation request with HTTP info returned
     * @return ApiResponse&lt;SyntheticsPrivateLocationCreationResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 402 </td><td> Quota reached for private locations </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Private locations are not activated for the user </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<SyntheticsPrivateLocationCreationResponse> executeWithHttpInfo() throws ApiException {
      return createPrivateLocationWithHttpInfo(body);
    }
  }

  /**
   * Create a private location
   * Create a new Synthetics private location.
   * @return createPrivateLocationRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIcreatePrivateLocationRequest createPrivateLocation() throws ApiException {
    return new APIcreatePrivateLocationRequest();
  }

private ApiResponse<SyntheticsTestDetails> createTestWithHttpInfo(SyntheticsTestDetails body) throws ApiException {
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


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "createTest");

    
    
    
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

    return apiClient.invokeAPI("SyntheticsApi.createTest", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIcreateTestRequest {
    private SyntheticsTestDetails body;

    private APIcreateTestRequest() {
    }

    /**
     * Set body
     * @param body Details of the test to create. (required)
     * @return APIcreateTestRequest
     */
    public APIcreateTestRequest body(SyntheticsTestDetails body) {
      this.body = body;
      return this;
    }

    /**
     * Execute createTest request
     * @return SyntheticsTestDetails
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK - Returns the created test details. </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> - JSON format is wrong - Creation failed </td><td>  -  </td></tr>
         <tr><td> 402 </td><td> Test quota is reached </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
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
         <tr><td> 200 </td><td> OK - Returns the created test details. </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> - JSON format is wrong - Creation failed </td><td>  -  </td></tr>
         <tr><td> 402 </td><td> Test quota is reached </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<SyntheticsTestDetails> executeWithHttpInfo() throws ApiException {
      return createTestWithHttpInfo(body);
    }
  }

  /**
   * Create a test
   * Create a Synthetic test.
   * @return createTestRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIcreateTestRequest createTest() throws ApiException {
    return new APIcreateTestRequest();
  }

private ApiResponse<Void> deleteGlobalVariableWithHttpInfo(String variableId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'variableId' is set
    if (variableId == null) {
      throw new ApiException(400, "Missing the required parameter 'variableId' when calling deleteGlobalVariable");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/synthetics/variables/{variable_id}"
      .replaceAll("\\{" + "variable_id" + "\\}", apiClient.escapeString(variableId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "deleteGlobalVariable");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    return apiClient.invokeAPI("SyntheticsApi.deleteGlobalVariable", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }

  public class APIdeleteGlobalVariableRequest {
    private String variableId;

    private APIdeleteGlobalVariableRequest(String variableId) {
      this.variableId = variableId;
    }

    /**
     * Execute deleteGlobalVariable request
     
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> JSON format is wrong </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public void execute() throws ApiException {
      this.executeWithHttpInfo().getData();
    }

    /**
     * Execute deleteGlobalVariable request with HTTP info returned
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> JSON format is wrong </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
      return deleteGlobalVariableWithHttpInfo(variableId);
    }
  }

  /**
   * Delete a global variable
   * Delete a Synthetics global variable.
   * @param variableId The ID of the global variable. (required)
   * @return deleteGlobalVariableRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIdeleteGlobalVariableRequest deleteGlobalVariable(String variableId) throws ApiException {
    return new APIdeleteGlobalVariableRequest(variableId);
  }

private ApiResponse<Void> deletePrivateLocationWithHttpInfo(String locationId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'locationId' is set
    if (locationId == null) {
      throw new ApiException(400, "Missing the required parameter 'locationId' when calling deletePrivateLocation");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/synthetics/private-locations/{location_id}"
      .replaceAll("\\{" + "location_id" + "\\}", apiClient.escapeString(locationId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "deletePrivateLocation");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    return apiClient.invokeAPI("SyntheticsApi.deletePrivateLocation", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }

  public class APIdeletePrivateLocationRequest {
    private String locationId;

    private APIdeletePrivateLocationRequest(String locationId) {
      this.locationId = locationId;
    }

    /**
     * Execute deletePrivateLocation request
     
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> - Private locations are not activated for the user - Private location does not exist </td><td>  -  </td></tr>
       </table>
     
     */
    
    public void execute() throws ApiException {
      this.executeWithHttpInfo().getData();
    }

    /**
     * Execute deletePrivateLocation request with HTTP info returned
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> - Private locations are not activated for the user - Private location does not exist </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
      return deletePrivateLocationWithHttpInfo(locationId);
    }
  }

  /**
   * Delete a private location
   * Delete a Synthetics private location.
   * @param locationId The ID of the private location. (required)
   * @return deletePrivateLocationRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIdeletePrivateLocationRequest deletePrivateLocation(String locationId) throws ApiException {
    return new APIdeletePrivateLocationRequest(locationId);
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


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "deleteTests");

    
    
    
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

    return apiClient.invokeAPI("SyntheticsApi.deleteTests", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIdeleteTestsRequest {
    private SyntheticsDeleteTestsPayload body;

    private APIdeleteTestsRequest() {
    }

    /**
     * Set body
     * @param body Public ID list of the Synthetic tests to be deleted. (required)
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
         <tr><td> 200 </td><td> OK. </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> - JSON format is wrong - Test cannot be deleted as it&#39;s used elsewhere (as a sub-test or in an uptime widget) - Some IDs are not owned by the user </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> - Tests to be deleted can&#39;t be found - Synthetics is not activated for the user </td><td>  -  </td></tr>
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
         <tr><td> 200 </td><td> OK. </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> - JSON format is wrong - Test cannot be deleted as it&#39;s used elsewhere (as a sub-test or in an uptime widget) - Some IDs are not owned by the user </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> - Tests to be deleted can&#39;t be found - Synthetics is not activated for the user </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<SyntheticsDeleteTestsResponse> executeWithHttpInfo() throws ApiException {
      return deleteTestsWithHttpInfo(body);
    }
  }

  /**
   * Delete tests
   * Delete multiple Synthetic tests by ID.
   * @return deleteTestsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIdeleteTestsRequest deleteTests() throws ApiException {
    return new APIdeleteTestsRequest();
  }

private ApiResponse<SyntheticsGlobalVariable> editGlobalVariableWithHttpInfo(String variableId, SyntheticsGlobalVariable body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'variableId' is set
    if (variableId == null) {
      throw new ApiException(400, "Missing the required parameter 'variableId' when calling editGlobalVariable");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling editGlobalVariable");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/synthetics/variables/{variable_id}"
      .replaceAll("\\{" + "variable_id" + "\\}", apiClient.escapeString(variableId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "editGlobalVariable");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<SyntheticsGlobalVariable> localVarReturnType = new GenericType<SyntheticsGlobalVariable>() {};

    return apiClient.invokeAPI("SyntheticsApi.editGlobalVariable", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIeditGlobalVariableRequest {
    private String variableId;
    private SyntheticsGlobalVariable body;

    private APIeditGlobalVariableRequest(String variableId) {
      this.variableId = variableId;
    }

    /**
     * Set body
     * @param body Details of the global variable to update. (required)
     * @return APIeditGlobalVariableRequest
     */
    public APIeditGlobalVariableRequest body(SyntheticsGlobalVariable body) {
      this.body = body;
      return this;
    }

    /**
     * Execute editGlobalVariable request
     * @return SyntheticsGlobalVariable
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Invalid request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     
     */
    
    public SyntheticsGlobalVariable execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute editGlobalVariable request with HTTP info returned
     * @return ApiResponse&lt;SyntheticsGlobalVariable&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Invalid request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<SyntheticsGlobalVariable> executeWithHttpInfo() throws ApiException {
      return editGlobalVariableWithHttpInfo(variableId, body);
    }
  }

  /**
   * Edit a global variable
   * Edit a Synthetics global variable.
   * @param variableId The ID of the global variable. (required)
   * @return editGlobalVariableRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIeditGlobalVariableRequest editGlobalVariable(String variableId) throws ApiException {
    return new APIeditGlobalVariableRequest(variableId);
  }

private ApiResponse<SyntheticsGetAPITestLatestResultsResponse> getAPITestLatestResultsWithHttpInfo(String publicId, Long fromTs, Long toTs, List<String> probeDc) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'publicId' is set
    if (publicId == null) {
      throw new ApiException(400, "Missing the required parameter 'publicId' when calling getAPITestLatestResults");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/synthetics/tests/{public_id}/results"
      .replaceAll("\\{" + "public_id" + "\\}", apiClient.escapeString(publicId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "from_ts", fromTs));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "to_ts", toTs));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "probe_dc", probeDc));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getAPITestLatestResults");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<SyntheticsGetAPITestLatestResultsResponse> localVarReturnType = new GenericType<SyntheticsGetAPITestLatestResultsResponse>() {};

    return apiClient.invokeAPI("SyntheticsApi.getAPITestLatestResults", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIgetAPITestLatestResultsRequest {
    private String publicId;
    private Long fromTs;
    private Long toTs;
    private List<String> probeDc;

    private APIgetAPITestLatestResultsRequest(String publicId) {
      this.publicId = publicId;
    }

    /**
     * Set fromTs
     * @param fromTs Timestamp from which to start querying results. (optional)
     * @return APIgetAPITestLatestResultsRequest
     */
    public APIgetAPITestLatestResultsRequest fromTs(Long fromTs) {
      this.fromTs = fromTs;
      return this;
    }

    /**
     * Set toTs
     * @param toTs Timestamp up to which to query results. (optional)
     * @return APIgetAPITestLatestResultsRequest
     */
    public APIgetAPITestLatestResultsRequest toTs(Long toTs) {
      this.toTs = toTs;
      return this;
    }

    /**
     * Set probeDc
     * @param probeDc Locations for which to query results. (optional)
     * @return APIgetAPITestLatestResultsRequest
     */
    public APIgetAPITestLatestResultsRequest probeDc(List<String> probeDc) {
      this.probeDc = probeDc;
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
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> - Synthetic is not activated for the user - Test is not owned by the user </td><td>  -  </td></tr>
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
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> - Synthetic is not activated for the user - Test is not owned by the user </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<SyntheticsGetAPITestLatestResultsResponse> executeWithHttpInfo() throws ApiException {
      return getAPITestLatestResultsWithHttpInfo(publicId, fromTs, toTs, probeDc);
    }
  }

  /**
   * Get the test&#39;s latest results summaries (API)
   * Get the last 50 test results summaries for a given Synthetics API test.
   * @param publicId The public ID of the test for which to search results for. (required)
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


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getAPITestResult");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<SyntheticsAPITestResultFull> localVarReturnType = new GenericType<SyntheticsAPITestResultFull>() {};

    return apiClient.invokeAPI("SyntheticsApi.getAPITestResult", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
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
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> - Synthetic is not activated for the user - Test or result is not owned by the user </td><td>  -  </td></tr>
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
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> - Synthetic is not activated for the user - Test or result is not owned by the user </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<SyntheticsAPITestResultFull> executeWithHttpInfo() throws ApiException {
      return getAPITestResultWithHttpInfo(publicId, resultId);
    }
  }

  /**
   * Get a test result (API)
   * Get a specific full result from a given (API) Synthetic test.
   * @param publicId The public ID of the API test to which the target result belongs. (required)
   * @param resultId The ID of the result to get. (required)
   * @return getAPITestResultRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIgetAPITestResultRequest getAPITestResult(String publicId, String resultId) throws ApiException {
    return new APIgetAPITestResultRequest(publicId, resultId);
  }

private ApiResponse<SyntheticsTestDetails> getBrowserTestWithHttpInfo(String publicId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'publicId' is set
    if (publicId == null) {
      throw new ApiException(400, "Missing the required parameter 'publicId' when calling getBrowserTest");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/synthetics/tests/browser/{public_id}"
      .replaceAll("\\{" + "public_id" + "\\}", apiClient.escapeString(publicId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getBrowserTest");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<SyntheticsTestDetails> localVarReturnType = new GenericType<SyntheticsTestDetails>() {};

    return apiClient.invokeAPI("SyntheticsApi.getBrowserTest", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIgetBrowserTestRequest {
    private String publicId;

    private APIgetBrowserTestRequest(String publicId) {
      this.publicId = publicId;
    }

    /**
     * Execute getBrowserTest request
     * @return SyntheticsTestDetails
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> - Synthetic is not activated for the user - Test is not owned by the user </td><td>  -  </td></tr>
       </table>
     
     */
    
    public SyntheticsTestDetails execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getBrowserTest request with HTTP info returned
     * @return ApiResponse&lt;SyntheticsTestDetails&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> - Synthetic is not activated for the user - Test is not owned by the user </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<SyntheticsTestDetails> executeWithHttpInfo() throws ApiException {
      return getBrowserTestWithHttpInfo(publicId);
    }
  }

  /**
   * Get a test configuration (browser)
   * Get the detailed configuration (including steps) associated with a Synthetic browser test.
   * @param publicId The public ID of the test to get details from. (required)
   * @return getBrowserTestRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIgetBrowserTestRequest getBrowserTest(String publicId) throws ApiException {
    return new APIgetBrowserTestRequest(publicId);
  }

private ApiResponse<SyntheticsGetBrowserTestLatestResultsResponse> getBrowserTestLatestResultsWithHttpInfo(String publicId, Long fromTs, Long toTs, List<String> probeDc) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'publicId' is set
    if (publicId == null) {
      throw new ApiException(400, "Missing the required parameter 'publicId' when calling getBrowserTestLatestResults");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/synthetics/tests/browser/{public_id}/results"
      .replaceAll("\\{" + "public_id" + "\\}", apiClient.escapeString(publicId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "from_ts", fromTs));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "to_ts", toTs));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "probe_dc", probeDc));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getBrowserTestLatestResults");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<SyntheticsGetBrowserTestLatestResultsResponse> localVarReturnType = new GenericType<SyntheticsGetBrowserTestLatestResultsResponse>() {};

    return apiClient.invokeAPI("SyntheticsApi.getBrowserTestLatestResults", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIgetBrowserTestLatestResultsRequest {
    private String publicId;
    private Long fromTs;
    private Long toTs;
    private List<String> probeDc;

    private APIgetBrowserTestLatestResultsRequest(String publicId) {
      this.publicId = publicId;
    }

    /**
     * Set fromTs
     * @param fromTs Timestamp from which to start querying results. (optional)
     * @return APIgetBrowserTestLatestResultsRequest
     */
    public APIgetBrowserTestLatestResultsRequest fromTs(Long fromTs) {
      this.fromTs = fromTs;
      return this;
    }

    /**
     * Set toTs
     * @param toTs Timestamp up to which to query results. (optional)
     * @return APIgetBrowserTestLatestResultsRequest
     */
    public APIgetBrowserTestLatestResultsRequest toTs(Long toTs) {
      this.toTs = toTs;
      return this;
    }

    /**
     * Set probeDc
     * @param probeDc Locations for which to query results. (optional)
     * @return APIgetBrowserTestLatestResultsRequest
     */
    public APIgetBrowserTestLatestResultsRequest probeDc(List<String> probeDc) {
      this.probeDc = probeDc;
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
         <tr><td> 403 </td><td> forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> - Synthetic is not activated for the user - Test is not owned by the user </td><td>  -  </td></tr>
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
         <tr><td> 403 </td><td> forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> - Synthetic is not activated for the user - Test is not owned by the user </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<SyntheticsGetBrowserTestLatestResultsResponse> executeWithHttpInfo() throws ApiException {
      return getBrowserTestLatestResultsWithHttpInfo(publicId, fromTs, toTs, probeDc);
    }
  }

  /**
   * Get the test&#39;s latest results summaries (browser)
   * Get the last 50 test results summaries for a given Synthetics Browser test.
   * @param publicId The public ID of the browser test for which to search results for. (required)
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


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getBrowserTestResult");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<SyntheticsBrowserTestResultFull> localVarReturnType = new GenericType<SyntheticsBrowserTestResultFull>() {};

    return apiClient.invokeAPI("SyntheticsApi.getBrowserTestResult", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
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
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> - Synthetic is not activated for the user - Test or result is not owned by the user </td><td>  -  </td></tr>
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
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> - Synthetic is not activated for the user - Test or result is not owned by the user </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<SyntheticsBrowserTestResultFull> executeWithHttpInfo() throws ApiException {
      return getBrowserTestResultWithHttpInfo(publicId, resultId);
    }
  }

  /**
   * Get a test result (browser)
   * Get a specific full result from a given (browser) Synthetic test.
   * @param publicId The public ID of the browser test to which the target result belongs. (required)
   * @param resultId The ID of the result to get. (required)
   * @return getBrowserTestResultRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIgetBrowserTestResultRequest getBrowserTestResult(String publicId, String resultId) throws ApiException {
    return new APIgetBrowserTestResultRequest(publicId, resultId);
  }

private ApiResponse<SyntheticsGlobalVariable> getGlobalVariableWithHttpInfo(String variableId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'variableId' is set
    if (variableId == null) {
      throw new ApiException(400, "Missing the required parameter 'variableId' when calling getGlobalVariable");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/synthetics/variables/{variable_id}"
      .replaceAll("\\{" + "variable_id" + "\\}", apiClient.escapeString(variableId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getGlobalVariable");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<SyntheticsGlobalVariable> localVarReturnType = new GenericType<SyntheticsGlobalVariable>() {};

    return apiClient.invokeAPI("SyntheticsApi.getGlobalVariable", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIgetGlobalVariableRequest {
    private String variableId;

    private APIgetGlobalVariableRequest(String variableId) {
      this.variableId = variableId;
    }

    /**
     * Execute getGlobalVariable request
     * @return SyntheticsGlobalVariable
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public SyntheticsGlobalVariable execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getGlobalVariable request with HTTP info returned
     * @return ApiResponse&lt;SyntheticsGlobalVariable&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<SyntheticsGlobalVariable> executeWithHttpInfo() throws ApiException {
      return getGlobalVariableWithHttpInfo(variableId);
    }
  }

  /**
   * Get a global variable
   * Get the detailed configuration of a global variable.
   * @param variableId The ID of the global variable. (required)
   * @return getGlobalVariableRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIgetGlobalVariableRequest getGlobalVariable(String variableId) throws ApiException {
    return new APIgetGlobalVariableRequest(variableId);
  }

private ApiResponse<SyntheticsPrivateLocation> getPrivateLocationWithHttpInfo(String locationId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'locationId' is set
    if (locationId == null) {
      throw new ApiException(400, "Missing the required parameter 'locationId' when calling getPrivateLocation");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/synthetics/private-locations/{location_id}"
      .replaceAll("\\{" + "location_id" + "\\}", apiClient.escapeString(locationId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getPrivateLocation");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<SyntheticsPrivateLocation> localVarReturnType = new GenericType<SyntheticsPrivateLocation>() {};

    return apiClient.invokeAPI("SyntheticsApi.getPrivateLocation", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIgetPrivateLocationRequest {
    private String locationId;

    private APIgetPrivateLocationRequest(String locationId) {
      this.locationId = locationId;
    }

    /**
     * Execute getPrivateLocation request
     * @return SyntheticsPrivateLocation
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> - Synthetic private locations are not activated for the user - Private location does not exist </td><td>  -  </td></tr>
       </table>
     
     */
    
    public SyntheticsPrivateLocation execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getPrivateLocation request with HTTP info returned
     * @return ApiResponse&lt;SyntheticsPrivateLocation&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> - Synthetic private locations are not activated for the user - Private location does not exist </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<SyntheticsPrivateLocation> executeWithHttpInfo() throws ApiException {
      return getPrivateLocationWithHttpInfo(locationId);
    }
  }

  /**
   * Get a private location
   * Get a Synthetics private location.
   * @param locationId The ID of the private location. (required)
   * @return getPrivateLocationRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIgetPrivateLocationRequest getPrivateLocation(String locationId) throws ApiException {
    return new APIgetPrivateLocationRequest(locationId);
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


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getTest");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<SyntheticsTestDetails> localVarReturnType = new GenericType<SyntheticsTestDetails>() {};

    return apiClient.invokeAPI("SyntheticsApi.getTest", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
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
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> - Synthetic is not activated for the user - Test is not owned by the user </td><td>  -  </td></tr>
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
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> - Synthetic is not activated for the user - Test is not owned by the user </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<SyntheticsTestDetails> executeWithHttpInfo() throws ApiException {
      return getTestWithHttpInfo(publicId);
    }
  }

  /**
   * Get a test configuration (API)
   * Get the detailed configuration associated with a Synthetics test.
   * @param publicId The public ID of the test to get details from. (required)
   * @return getTestRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIgetTestRequest getTest(String publicId) throws ApiException {
    return new APIgetTestRequest(publicId);
  }

private ApiResponse<SyntheticsLocations> listLocationsWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/v1/synthetics/locations";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listLocations");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<SyntheticsLocations> localVarReturnType = new GenericType<SyntheticsLocations>() {};

    return apiClient.invokeAPI("SyntheticsApi.listLocations", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIlistLocationsRequest {

    private APIlistLocationsRequest() {
    }

    /**
     * Execute listLocations request
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
     * Execute listLocations request with HTTP info returned
     * @return ApiResponse&lt;SyntheticsLocations&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<SyntheticsLocations> executeWithHttpInfo() throws ApiException {
      return listLocationsWithHttpInfo();
    }
  }

  /**
   * Get all locations (public and private)
   * Get the list of public and private locations available for Synthetic tests. No arguments required.
   * @return listLocationsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistLocationsRequest listLocations() throws ApiException {
    return new APIlistLocationsRequest();
  }

private ApiResponse<SyntheticsListTestsResponse> listTestsWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/v1/synthetics/tests";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listTests");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<SyntheticsListTestsResponse> localVarReturnType = new GenericType<SyntheticsListTestsResponse>() {};

    return apiClient.invokeAPI("SyntheticsApi.listTests", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIlistTestsRequest {

    private APIlistTestsRequest() {
    }

    /**
     * Execute listTests request
     * @return SyntheticsListTestsResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK - Returns the list of all Synthetic tests. </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Synthetics is not activated for the user. </td><td>  -  </td></tr>
       </table>
     
     */
    
    public SyntheticsListTestsResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listTests request with HTTP info returned
     * @return ApiResponse&lt;SyntheticsListTestsResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK - Returns the list of all Synthetic tests. </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Synthetics is not activated for the user. </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<SyntheticsListTestsResponse> executeWithHttpInfo() throws ApiException {
      return listTestsWithHttpInfo();
    }
  }

  /**
   * Get the list of all tests
   * Get the list of all Synthetic tests.
   * @return listTestsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistTestsRequest listTests() throws ApiException {
    return new APIlistTestsRequest();
  }

private ApiResponse<SyntheticsTriggerCITestsResponse> triggerCITestsWithHttpInfo(SyntheticsCITestBody body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling triggerCITests");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/synthetics/tests/trigger/ci";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "triggerCITests");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<SyntheticsTriggerCITestsResponse> localVarReturnType = new GenericType<SyntheticsTriggerCITestsResponse>() {};

    return apiClient.invokeAPI("SyntheticsApi.triggerCITests", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APItriggerCITestsRequest {
    private SyntheticsCITestBody body;

    private APItriggerCITestsRequest() {
    }

    /**
     * Set body
     * @param body Details of the test to trigger. (required)
     * @return APItriggerCITestsRequest
     */
    public APItriggerCITestsRequest body(SyntheticsCITestBody body) {
      this.body = body;
      return this;
    }

    /**
     * Execute triggerCITests request
     * @return SyntheticsTriggerCITestsResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> JSON format is wrong </td><td>  -  </td></tr>
       </table>
     
     */
    
    public SyntheticsTriggerCITestsResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute triggerCITests request with HTTP info returned
     * @return ApiResponse&lt;SyntheticsTriggerCITestsResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> JSON format is wrong </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<SyntheticsTriggerCITestsResponse> executeWithHttpInfo() throws ApiException {
      return triggerCITestsWithHttpInfo(body);
    }
  }

  /**
   * Trigger some Synthetics tests for CI
   * Trigger a set of Synthetics tests for continuous integration.
   * @return triggerCITestsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APItriggerCITestsRequest triggerCITests() throws ApiException {
    return new APItriggerCITestsRequest();
  }

private ApiResponse<SyntheticsPrivateLocation> updatePrivateLocationWithHttpInfo(String locationId, SyntheticsPrivateLocation body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'locationId' is set
    if (locationId == null) {
      throw new ApiException(400, "Missing the required parameter 'locationId' when calling updatePrivateLocation");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updatePrivateLocation");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/synthetics/private-locations/{location_id}"
      .replaceAll("\\{" + "location_id" + "\\}", apiClient.escapeString(locationId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "updatePrivateLocation");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<SyntheticsPrivateLocation> localVarReturnType = new GenericType<SyntheticsPrivateLocation>() {};

    return apiClient.invokeAPI("SyntheticsApi.updatePrivateLocation", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIupdatePrivateLocationRequest {
    private String locationId;
    private SyntheticsPrivateLocation body;

    private APIupdatePrivateLocationRequest(String locationId) {
      this.locationId = locationId;
    }

    /**
     * Set body
     * @param body Details of the private location to be updated. (required)
     * @return APIupdatePrivateLocationRequest
     */
    public APIupdatePrivateLocationRequest body(SyntheticsPrivateLocation body) {
      this.body = body;
      return this;
    }

    /**
     * Execute updatePrivateLocation request
     * @return SyntheticsPrivateLocation
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> - Private locations are not activated for the user - Private location does not exist </td><td>  -  </td></tr>
       </table>
     
     */
    
    public SyntheticsPrivateLocation execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute updatePrivateLocation request with HTTP info returned
     * @return ApiResponse&lt;SyntheticsPrivateLocation&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> - Private locations are not activated for the user - Private location does not exist </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<SyntheticsPrivateLocation> executeWithHttpInfo() throws ApiException {
      return updatePrivateLocationWithHttpInfo(locationId, body);
    }
  }

  /**
   * Edit a private location
   * Edit a Synthetics private location.
   * @param locationId The ID of the private location. (required)
   * @return updatePrivateLocationRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIupdatePrivateLocationRequest updatePrivateLocation(String locationId) throws ApiException {
    return new APIupdatePrivateLocationRequest(locationId);
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


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "updateTest");

    
    
    
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

    return apiClient.invokeAPI("SyntheticsApi.updateTest", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIupdateTestRequest {
    private String publicId;
    private SyntheticsTestDetails body;

    private APIupdateTestRequest(String publicId) {
      this.publicId = publicId;
    }

    /**
     * Set body
     * @param body New test details to be saved. (required)
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
         <tr><td> 400 </td><td> - JSON format is wrong - Updating sub-type is forbidden </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> - Synthetic is not activated for the user - Test is not owned by the user - Test can&#39;t be found </td><td>  -  </td></tr>
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
         <tr><td> 400 </td><td> - JSON format is wrong - Updating sub-type is forbidden </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> - Synthetic is not activated for the user - Test is not owned by the user - Test can&#39;t be found </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<SyntheticsTestDetails> executeWithHttpInfo() throws ApiException {
      return updateTestWithHttpInfo(publicId, body);
    }
  }

  /**
   * Edit a test
   * Edit the configuration of a Synthetic test.
   * @param publicId The public ID of the test to get details from. (required)
   * @return updateTestRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIupdateTestRequest updateTest(String publicId) throws ApiException {
    return new APIupdateTestRequest(publicId);
  }

private ApiResponse<Boolean> updateTestPauseStatusWithHttpInfo(String publicId, SyntheticsUpdateTestPauseStatusPayload body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'publicId' is set
    if (publicId == null) {
      throw new ApiException(400, "Missing the required parameter 'publicId' when calling updateTestPauseStatus");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateTestPauseStatus");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/synthetics/tests/{public_id}/status"
      .replaceAll("\\{" + "public_id" + "\\}", apiClient.escapeString(publicId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "updateTestPauseStatus");

    
    
    
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

    return apiClient.invokeAPI("SyntheticsApi.updateTestPauseStatus", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIupdateTestPauseStatusRequest {
    private String publicId;
    private SyntheticsUpdateTestPauseStatusPayload body;

    private APIupdateTestPauseStatusRequest(String publicId) {
      this.publicId = publicId;
    }

    /**
     * Set body
     * @param body Status to set the given Synthetic test to. (required)
     * @return APIupdateTestPauseStatusRequest
     */
    public APIupdateTestPauseStatusRequest body(SyntheticsUpdateTestPauseStatusPayload body) {
      this.body = body;
      return this;
    }

    /**
     * Execute updateTestPauseStatus request
     * @return Boolean
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK - Returns a boolean indicating if the update was successful. </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> JSON format is wrong. </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> - Synthetic is not activated for the user - Test is not owned by the user </td><td>  -  </td></tr>
       </table>
     
     */
    
    public Boolean execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute updateTestPauseStatus request with HTTP info returned
     * @return ApiResponse&lt;Boolean&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK - Returns a boolean indicating if the update was successful. </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> JSON format is wrong. </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> - Synthetic is not activated for the user - Test is not owned by the user </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<Boolean> executeWithHttpInfo() throws ApiException {
      return updateTestPauseStatusWithHttpInfo(publicId, body);
    }
  }

  /**
   * Pause or start a test
   * Pause or start a Synthetics test by changing the status.
   * @param publicId The public ID of the Synthetic test to update. (required)
   * @return updateTestPauseStatusRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIupdateTestPauseStatusRequest updateTestPauseStatus(String publicId) throws ApiException {
    return new APIupdateTestPauseStatusRequest(publicId);
  }
}
