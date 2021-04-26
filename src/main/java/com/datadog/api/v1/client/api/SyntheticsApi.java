package com.datadog.api.v1.client.api;

import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.ApiResponse;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.Pair;
import com.datadog.api.v1.client.model.SyntheticsAPITest;
import com.datadog.api.v1.client.model.SyntheticsAPITestResultFull;
import com.datadog.api.v1.client.model.SyntheticsBrowserTest;
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
import javax.ws.rs.core.GenericType;

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

  /**
   * Create a global variable Create a Synthetics global variable.
   *
   * @param body Details of the global variable to create. (required)
   * @return SyntheticsGlobalVariable
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Invalid request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *     </table>
   */
  public SyntheticsGlobalVariable createGlobalVariable(SyntheticsGlobalVariable body)
      throws ApiException {
    return createGlobalVariableWithHttpInfo(body).getData();
  }

  /**
   * Create a global variable Create a Synthetics global variable.
   *
   * @param body Details of the global variable to create. (required)
   * @return ApiResponse&lt;SyntheticsGlobalVariable&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Invalid request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SyntheticsGlobalVariable> createGlobalVariableWithHttpInfo(
      SyntheticsGlobalVariable body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createGlobalVariable");
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

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<SyntheticsGlobalVariable> localVarReturnType =
        new GenericType<SyntheticsGlobalVariable>() {};

    return apiClient.invokeAPI(
        "SyntheticsApi.createGlobalVariable",
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
   * Create a private location Create a new Synthetics private location.
   *
   * @param body Details of the private location to create. (required)
   * @return SyntheticsPrivateLocationCreationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 402 </td><td> Quota reached for private locations </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Private locations are not activated for the user </td><td>  -  </td></tr>
   *     </table>
   */
  public SyntheticsPrivateLocationCreationResponse createPrivateLocation(
      SyntheticsPrivateLocation body) throws ApiException {
    return createPrivateLocationWithHttpInfo(body).getData();
  }

  /**
   * Create a private location Create a new Synthetics private location.
   *
   * @param body Details of the private location to create. (required)
   * @return ApiResponse&lt;SyntheticsPrivateLocationCreationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 402 </td><td> Quota reached for private locations </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Private locations are not activated for the user </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SyntheticsPrivateLocationCreationResponse> createPrivateLocationWithHttpInfo(
      SyntheticsPrivateLocation body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createPrivateLocation");
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

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<SyntheticsPrivateLocationCreationResponse> localVarReturnType =
        new GenericType<SyntheticsPrivateLocationCreationResponse>() {};

    return apiClient.invokeAPI(
        "SyntheticsApi.createPrivateLocation",
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
   * Create an API test Create a Synthetic API test.
   *
   * @param body Details of the test to create. (required)
   * @return SyntheticsAPITest
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK - Returns the created test details. </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> - JSON format is wrong - Creation failed </td><td>  -  </td></tr>
   *       <tr><td> 402 </td><td> Test quota is reached </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *     </table>
   */
  public SyntheticsAPITest createSyntheticsAPITest(SyntheticsAPITest body) throws ApiException {
    return createSyntheticsAPITestWithHttpInfo(body).getData();
  }

  /**
   * Create an API test Create a Synthetic API test.
   *
   * @param body Details of the test to create. (required)
   * @return ApiResponse&lt;SyntheticsAPITest&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK - Returns the created test details. </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> - JSON format is wrong - Creation failed </td><td>  -  </td></tr>
   *       <tr><td> 402 </td><td> Test quota is reached </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SyntheticsAPITest> createSyntheticsAPITestWithHttpInfo(SyntheticsAPITest body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createSyntheticsAPITest");
    }
    // create path and map variables
    String localVarPath = "/api/v1/synthetics/tests/api";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "createSyntheticsAPITest");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<SyntheticsAPITest> localVarReturnType = new GenericType<SyntheticsAPITest>() {};

    return apiClient.invokeAPI(
        "SyntheticsApi.createSyntheticsAPITest",
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
   * Create a browser test Create a Synthetic browser test.
   *
   * @param body Details of the test to create. (required)
   * @return SyntheticsBrowserTest
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK - Returns the created test details. </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> - JSON format is wrong - Creation failed </td><td>  -  </td></tr>
   *       <tr><td> 402 </td><td> Test quota is reached </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *     </table>
   */
  public SyntheticsBrowserTest createSyntheticsBrowserTest(SyntheticsBrowserTest body)
      throws ApiException {
    return createSyntheticsBrowserTestWithHttpInfo(body).getData();
  }

  /**
   * Create a browser test Create a Synthetic browser test.
   *
   * @param body Details of the test to create. (required)
   * @return ApiResponse&lt;SyntheticsBrowserTest&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK - Returns the created test details. </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> - JSON format is wrong - Creation failed </td><td>  -  </td></tr>
   *       <tr><td> 402 </td><td> Test quota is reached </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SyntheticsBrowserTest> createSyntheticsBrowserTestWithHttpInfo(
      SyntheticsBrowserTest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createSyntheticsBrowserTest");
    }
    // create path and map variables
    String localVarPath = "/api/v1/synthetics/tests/browser";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "createSyntheticsBrowserTest");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<SyntheticsBrowserTest> localVarReturnType =
        new GenericType<SyntheticsBrowserTest>() {};

    return apiClient.invokeAPI(
        "SyntheticsApi.createSyntheticsBrowserTest",
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
   * Delete a global variable Delete a Synthetics global variable.
   *
   * @param variableId The ID of the global variable. (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> JSON format is wrong </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
   *     </table>
   */
  public void deleteGlobalVariable(String variableId) throws ApiException {
    deleteGlobalVariableWithHttpInfo(variableId);
  }

  /**
   * Delete a global variable Delete a Synthetics global variable.
   *
   * @param variableId The ID of the global variable. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> JSON format is wrong </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteGlobalVariableWithHttpInfo(String variableId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'variableId' is set
    if (variableId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'variableId' when calling deleteGlobalVariable");
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/synthetics/variables/{variable_id}"
            .replaceAll(
                "\\{" + "variable_id" + "\\}", apiClient.escapeString(variableId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "deleteGlobalVariable");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    return apiClient.invokeAPI(
        "SyntheticsApi.deleteGlobalVariable",
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
        null,
        false);
  }

  /**
   * Delete a private location Delete a Synthetics private location.
   *
   * @param locationId The ID of the private location. (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> - Private locations are not activated for the user - Private location does not exist </td><td>  -  </td></tr>
   *     </table>
   */
  public void deletePrivateLocation(String locationId) throws ApiException {
    deletePrivateLocationWithHttpInfo(locationId);
  }

  /**
   * Delete a private location Delete a Synthetics private location.
   *
   * @param locationId The ID of the private location. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> - Private locations are not activated for the user - Private location does not exist </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deletePrivateLocationWithHttpInfo(String locationId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'locationId' is set
    if (locationId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'locationId' when calling deletePrivateLocation");
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/synthetics/private-locations/{location_id}"
            .replaceAll(
                "\\{" + "location_id" + "\\}", apiClient.escapeString(locationId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "deletePrivateLocation");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    return apiClient.invokeAPI(
        "SyntheticsApi.deletePrivateLocation",
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
        null,
        false);
  }

  /**
   * Delete tests Delete multiple Synthetic tests by ID.
   *
   * @param body Public ID list of the Synthetic tests to be deleted. (required)
   * @return SyntheticsDeleteTestsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK. </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> - JSON format is wrong - Test cannot be deleted as it&#39;s used elsewhere (as a sub-test or in an uptime widget) - Some IDs are not owned by the user </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> - Tests to be deleted can&#39;t be found - Synthetics is not activated for the user </td><td>  -  </td></tr>
   *     </table>
   */
  public SyntheticsDeleteTestsResponse deleteTests(SyntheticsDeleteTestsPayload body)
      throws ApiException {
    return deleteTestsWithHttpInfo(body).getData();
  }

  /**
   * Delete tests Delete multiple Synthetic tests by ID.
   *
   * @param body Public ID list of the Synthetic tests to be deleted. (required)
   * @return ApiResponse&lt;SyntheticsDeleteTestsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK. </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> - JSON format is wrong - Test cannot be deleted as it&#39;s used elsewhere (as a sub-test or in an uptime widget) - Some IDs are not owned by the user </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> - Tests to be deleted can&#39;t be found - Synthetics is not activated for the user </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SyntheticsDeleteTestsResponse> deleteTestsWithHttpInfo(
      SyntheticsDeleteTestsPayload body) throws ApiException {
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

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<SyntheticsDeleteTestsResponse> localVarReturnType =
        new GenericType<SyntheticsDeleteTestsResponse>() {};

    return apiClient.invokeAPI(
        "SyntheticsApi.deleteTests",
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
   * Edit a global variable Edit a Synthetics global variable.
   *
   * @param variableId The ID of the global variable. (required)
   * @param body Details of the global variable to update. (required)
   * @return SyntheticsGlobalVariable
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Invalid request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *     </table>
   */
  public SyntheticsGlobalVariable editGlobalVariable(
      String variableId, SyntheticsGlobalVariable body) throws ApiException {
    return editGlobalVariableWithHttpInfo(variableId, body).getData();
  }

  /**
   * Edit a global variable Edit a Synthetics global variable.
   *
   * @param variableId The ID of the global variable. (required)
   * @param body Details of the global variable to update. (required)
   * @return ApiResponse&lt;SyntheticsGlobalVariable&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Invalid request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SyntheticsGlobalVariable> editGlobalVariableWithHttpInfo(
      String variableId, SyntheticsGlobalVariable body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'variableId' is set
    if (variableId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'variableId' when calling editGlobalVariable");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling editGlobalVariable");
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/synthetics/variables/{variable_id}"
            .replaceAll(
                "\\{" + "variable_id" + "\\}", apiClient.escapeString(variableId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "editGlobalVariable");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<SyntheticsGlobalVariable> localVarReturnType =
        new GenericType<SyntheticsGlobalVariable>() {};

    return apiClient.invokeAPI(
        "SyntheticsApi.editGlobalVariable",
        localVarPath,
        "PUT",
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
   * Get an API test Get the detailed configuration associated with a Synthetic API test.
   *
   * @param publicId The public ID of the test to get details from. (required)
   * @return SyntheticsAPITest
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> - Synthetic Monitoring is not activated for the user - Test is not owned by the user </td><td>  -  </td></tr>
   *     </table>
   */
  public SyntheticsAPITest getAPITest(String publicId) throws ApiException {
    return getAPITestWithHttpInfo(publicId).getData();
  }

  /**
   * Get an API test Get the detailed configuration associated with a Synthetic API test.
   *
   * @param publicId The public ID of the test to get details from. (required)
   * @return ApiResponse&lt;SyntheticsAPITest&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> - Synthetic Monitoring is not activated for the user - Test is not owned by the user </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SyntheticsAPITest> getAPITestWithHttpInfo(String publicId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'publicId' is set
    if (publicId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'publicId' when calling getAPITest");
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/synthetics/tests/api/{public_id}"
            .replaceAll("\\{" + "public_id" + "\\}", apiClient.escapeString(publicId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getAPITest");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<SyntheticsAPITest> localVarReturnType = new GenericType<SyntheticsAPITest>() {};

    return apiClient.invokeAPI(
        "SyntheticsApi.getAPITest",
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

  /** Manage optional parameters to getAPITestLatestResults. */
  public static class GetAPITestLatestResultsOptionalParameters {
    private Long fromTs;
    private Long toTs;
    private List<String> probeDc;

    /**
     * Set fromTs
     *
     * @param fromTs Timestamp from which to start querying results. (optional)
     * @return GetAPITestLatestResultsOptionalParameters
     */
    public GetAPITestLatestResultsOptionalParameters fromTs(Long fromTs) {
      this.fromTs = fromTs;
      return this;
    }

    /**
     * Set toTs
     *
     * @param toTs Timestamp up to which to query results. (optional)
     * @return GetAPITestLatestResultsOptionalParameters
     */
    public GetAPITestLatestResultsOptionalParameters toTs(Long toTs) {
      this.toTs = toTs;
      return this;
    }

    /**
     * Set probeDc
     *
     * @param probeDc Locations for which to query results. (optional)
     * @return GetAPITestLatestResultsOptionalParameters
     */
    public GetAPITestLatestResultsOptionalParameters probeDc(List<String> probeDc) {
      this.probeDc = probeDc;
      return this;
    }
  }

  /**
   * Get an API test&#39;s latest results summaries Get the last 50 test results summaries for a
   * given Synthetics API test.
   *
   * @param publicId The public ID of the test for which to search results for. (required)
   * @return SyntheticsGetAPITestLatestResultsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> - Synthetic is not activated for the user - Test is not owned by the user </td><td>  -  </td></tr>
   *     </table>
   */
  public SyntheticsGetAPITestLatestResultsResponse getAPITestLatestResults(String publicId)
      throws ApiException {
    return getAPITestLatestResultsWithHttpInfo(
            publicId, new GetAPITestLatestResultsOptionalParameters())
        .getData();
  }

  /**
   * Get an API test&#39;s latest results summaries Get the last 50 test results summaries for a
   * given Synthetics API test.
   *
   * @param publicId The public ID of the test for which to search results for. (required)
   * @param parameters Optional parameters for the request.
   * @return SyntheticsGetAPITestLatestResultsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> - Synthetic is not activated for the user - Test is not owned by the user </td><td>  -  </td></tr>
   *     </table>
   */
  public SyntheticsGetAPITestLatestResultsResponse getAPITestLatestResults(
      String publicId, GetAPITestLatestResultsOptionalParameters parameters) throws ApiException {
    return getAPITestLatestResultsWithHttpInfo(publicId, parameters).getData();
  }

  /**
   * Get an API test&#39;s latest results summaries Get the last 50 test results summaries for a
   * given Synthetics API test.
   *
   * @param publicId The public ID of the test for which to search results for. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;SyntheticsGetAPITestLatestResultsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> - Synthetic is not activated for the user - Test is not owned by the user </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SyntheticsGetAPITestLatestResultsResponse> getAPITestLatestResultsWithHttpInfo(
      String publicId, GetAPITestLatestResultsOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'publicId' is set
    if (publicId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'publicId' when calling getAPITestLatestResults");
    }
    Long fromTs = parameters.fromTs;
    Long toTs = parameters.toTs;
    List<String> probeDc = parameters.probeDc;
    // create path and map variables
    String localVarPath =
        "/api/v1/synthetics/tests/{public_id}/results"
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

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<SyntheticsGetAPITestLatestResultsResponse> localVarReturnType =
        new GenericType<SyntheticsGetAPITestLatestResultsResponse>() {};

    return apiClient.invokeAPI(
        "SyntheticsApi.getAPITestLatestResults",
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
   * Get an API test result Get a specific full result from a given (API) Synthetic test.
   *
   * @param publicId The public ID of the API test to which the target result belongs. (required)
   * @param resultId The ID of the result to get. (required)
   * @return SyntheticsAPITestResultFull
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> - Synthetic is not activated for the user - Test or result is not owned by the user </td><td>  -  </td></tr>
   *     </table>
   */
  public SyntheticsAPITestResultFull getAPITestResult(String publicId, String resultId)
      throws ApiException {
    return getAPITestResultWithHttpInfo(publicId, resultId).getData();
  }

  /**
   * Get an API test result Get a specific full result from a given (API) Synthetic test.
   *
   * @param publicId The public ID of the API test to which the target result belongs. (required)
   * @param resultId The ID of the result to get. (required)
   * @return ApiResponse&lt;SyntheticsAPITestResultFull&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> - Synthetic is not activated for the user - Test or result is not owned by the user </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SyntheticsAPITestResultFull> getAPITestResultWithHttpInfo(
      String publicId, String resultId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'publicId' is set
    if (publicId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'publicId' when calling getAPITestResult");
    }

    // verify the required parameter 'resultId' is set
    if (resultId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'resultId' when calling getAPITestResult");
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/synthetics/tests/{public_id}/results/{result_id}"
            .replaceAll("\\{" + "public_id" + "\\}", apiClient.escapeString(publicId.toString()))
            .replaceAll("\\{" + "result_id" + "\\}", apiClient.escapeString(resultId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getAPITestResult");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<SyntheticsAPITestResultFull> localVarReturnType =
        new GenericType<SyntheticsAPITestResultFull>() {};

    return apiClient.invokeAPI(
        "SyntheticsApi.getAPITestResult",
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
   * Get a browser test Get the detailed configuration (including steps) associated with a Synthetic
   * browser test.
   *
   * @param publicId The public ID of the test to get details from. (required)
   * @return SyntheticsBrowserTest
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> - Synthetic is not activated for the user - Test is not owned by the user </td><td>  -  </td></tr>
   *     </table>
   */
  public SyntheticsBrowserTest getBrowserTest(String publicId) throws ApiException {
    return getBrowserTestWithHttpInfo(publicId).getData();
  }

  /**
   * Get a browser test Get the detailed configuration (including steps) associated with a Synthetic
   * browser test.
   *
   * @param publicId The public ID of the test to get details from. (required)
   * @return ApiResponse&lt;SyntheticsBrowserTest&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> - Synthetic is not activated for the user - Test is not owned by the user </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SyntheticsBrowserTest> getBrowserTestWithHttpInfo(String publicId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'publicId' is set
    if (publicId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'publicId' when calling getBrowserTest");
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/synthetics/tests/browser/{public_id}"
            .replaceAll("\\{" + "public_id" + "\\}", apiClient.escapeString(publicId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getBrowserTest");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<SyntheticsBrowserTest> localVarReturnType =
        new GenericType<SyntheticsBrowserTest>() {};

    return apiClient.invokeAPI(
        "SyntheticsApi.getBrowserTest",
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

  /** Manage optional parameters to getBrowserTestLatestResults. */
  public static class GetBrowserTestLatestResultsOptionalParameters {
    private Long fromTs;
    private Long toTs;
    private List<String> probeDc;

    /**
     * Set fromTs
     *
     * @param fromTs Timestamp from which to start querying results. (optional)
     * @return GetBrowserTestLatestResultsOptionalParameters
     */
    public GetBrowserTestLatestResultsOptionalParameters fromTs(Long fromTs) {
      this.fromTs = fromTs;
      return this;
    }

    /**
     * Set toTs
     *
     * @param toTs Timestamp up to which to query results. (optional)
     * @return GetBrowserTestLatestResultsOptionalParameters
     */
    public GetBrowserTestLatestResultsOptionalParameters toTs(Long toTs) {
      this.toTs = toTs;
      return this;
    }

    /**
     * Set probeDc
     *
     * @param probeDc Locations for which to query results. (optional)
     * @return GetBrowserTestLatestResultsOptionalParameters
     */
    public GetBrowserTestLatestResultsOptionalParameters probeDc(List<String> probeDc) {
      this.probeDc = probeDc;
      return this;
    }
  }

  /**
   * Get a browser test&#39;s latest results summaries Get the last 50 test results summaries for a
   * given Synthetics Browser test.
   *
   * @param publicId The public ID of the browser test for which to search results for. (required)
   * @return SyntheticsGetBrowserTestLatestResultsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> - Synthetic is not activated for the user - Test is not owned by the user </td><td>  -  </td></tr>
   *     </table>
   */
  public SyntheticsGetBrowserTestLatestResultsResponse getBrowserTestLatestResults(String publicId)
      throws ApiException {
    return getBrowserTestLatestResultsWithHttpInfo(
            publicId, new GetBrowserTestLatestResultsOptionalParameters())
        .getData();
  }

  /**
   * Get a browser test&#39;s latest results summaries Get the last 50 test results summaries for a
   * given Synthetics Browser test.
   *
   * @param publicId The public ID of the browser test for which to search results for. (required)
   * @param parameters Optional parameters for the request.
   * @return SyntheticsGetBrowserTestLatestResultsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> - Synthetic is not activated for the user - Test is not owned by the user </td><td>  -  </td></tr>
   *     </table>
   */
  public SyntheticsGetBrowserTestLatestResultsResponse getBrowserTestLatestResults(
      String publicId, GetBrowserTestLatestResultsOptionalParameters parameters)
      throws ApiException {
    return getBrowserTestLatestResultsWithHttpInfo(publicId, parameters).getData();
  }

  /**
   * Get a browser test&#39;s latest results summaries Get the last 50 test results summaries for a
   * given Synthetics Browser test.
   *
   * @param publicId The public ID of the browser test for which to search results for. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;SyntheticsGetBrowserTestLatestResultsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> - Synthetic is not activated for the user - Test is not owned by the user </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SyntheticsGetBrowserTestLatestResultsResponse>
      getBrowserTestLatestResultsWithHttpInfo(
          String publicId, GetBrowserTestLatestResultsOptionalParameters parameters)
          throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'publicId' is set
    if (publicId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'publicId' when calling getBrowserTestLatestResults");
    }
    Long fromTs = parameters.fromTs;
    Long toTs = parameters.toTs;
    List<String> probeDc = parameters.probeDc;
    // create path and map variables
    String localVarPath =
        "/api/v1/synthetics/tests/browser/{public_id}/results"
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

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<SyntheticsGetBrowserTestLatestResultsResponse> localVarReturnType =
        new GenericType<SyntheticsGetBrowserTestLatestResultsResponse>() {};

    return apiClient.invokeAPI(
        "SyntheticsApi.getBrowserTestLatestResults",
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
   * Get a browser test result Get a specific full result from a given (browser) Synthetic test.
   *
   * @param publicId The public ID of the browser test to which the target result belongs.
   *     (required)
   * @param resultId The ID of the result to get. (required)
   * @return SyntheticsBrowserTestResultFull
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> - Synthetic is not activated for the user - Test or result is not owned by the user </td><td>  -  </td></tr>
   *     </table>
   */
  public SyntheticsBrowserTestResultFull getBrowserTestResult(String publicId, String resultId)
      throws ApiException {
    return getBrowserTestResultWithHttpInfo(publicId, resultId).getData();
  }

  /**
   * Get a browser test result Get a specific full result from a given (browser) Synthetic test.
   *
   * @param publicId The public ID of the browser test to which the target result belongs.
   *     (required)
   * @param resultId The ID of the result to get. (required)
   * @return ApiResponse&lt;SyntheticsBrowserTestResultFull&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> - Synthetic is not activated for the user - Test or result is not owned by the user </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SyntheticsBrowserTestResultFull> getBrowserTestResultWithHttpInfo(
      String publicId, String resultId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'publicId' is set
    if (publicId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'publicId' when calling getBrowserTestResult");
    }

    // verify the required parameter 'resultId' is set
    if (resultId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'resultId' when calling getBrowserTestResult");
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/synthetics/tests/browser/{public_id}/results/{result_id}"
            .replaceAll("\\{" + "public_id" + "\\}", apiClient.escapeString(publicId.toString()))
            .replaceAll("\\{" + "result_id" + "\\}", apiClient.escapeString(resultId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getBrowserTestResult");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<SyntheticsBrowserTestResultFull> localVarReturnType =
        new GenericType<SyntheticsBrowserTestResultFull>() {};

    return apiClient.invokeAPI(
        "SyntheticsApi.getBrowserTestResult",
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
   * Get a global variable Get the detailed configuration of a global variable.
   *
   * @param variableId The ID of the global variable. (required)
   * @return SyntheticsGlobalVariable
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
   *     </table>
   */
  public SyntheticsGlobalVariable getGlobalVariable(String variableId) throws ApiException {
    return getGlobalVariableWithHttpInfo(variableId).getData();
  }

  /**
   * Get a global variable Get the detailed configuration of a global variable.
   *
   * @param variableId The ID of the global variable. (required)
   * @return ApiResponse&lt;SyntheticsGlobalVariable&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SyntheticsGlobalVariable> getGlobalVariableWithHttpInfo(String variableId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'variableId' is set
    if (variableId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'variableId' when calling getGlobalVariable");
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/synthetics/variables/{variable_id}"
            .replaceAll(
                "\\{" + "variable_id" + "\\}", apiClient.escapeString(variableId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getGlobalVariable");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<SyntheticsGlobalVariable> localVarReturnType =
        new GenericType<SyntheticsGlobalVariable>() {};

    return apiClient.invokeAPI(
        "SyntheticsApi.getGlobalVariable",
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
   * Get a private location Get a Synthetics private location.
   *
   * @param locationId The ID of the private location. (required)
   * @return SyntheticsPrivateLocation
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> - Synthetic private locations are not activated for the user - Private location does not exist </td><td>  -  </td></tr>
   *     </table>
   */
  public SyntheticsPrivateLocation getPrivateLocation(String locationId) throws ApiException {
    return getPrivateLocationWithHttpInfo(locationId).getData();
  }

  /**
   * Get a private location Get a Synthetics private location.
   *
   * @param locationId The ID of the private location. (required)
   * @return ApiResponse&lt;SyntheticsPrivateLocation&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> - Synthetic private locations are not activated for the user - Private location does not exist </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SyntheticsPrivateLocation> getPrivateLocationWithHttpInfo(String locationId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'locationId' is set
    if (locationId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'locationId' when calling getPrivateLocation");
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/synthetics/private-locations/{location_id}"
            .replaceAll(
                "\\{" + "location_id" + "\\}", apiClient.escapeString(locationId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getPrivateLocation");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<SyntheticsPrivateLocation> localVarReturnType =
        new GenericType<SyntheticsPrivateLocation>() {};

    return apiClient.invokeAPI(
        "SyntheticsApi.getPrivateLocation",
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
   * Get a test configuration Get the detailed configuration associated with a Synthetics test.
   *
   * @param publicId The public ID of the test to get details from. (required)
   * @return SyntheticsTestDetails
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> - Synthetic is not activated for the user - Test is not owned by the user </td><td>  -  </td></tr>
   *     </table>
   */
  public SyntheticsTestDetails getTest(String publicId) throws ApiException {
    return getTestWithHttpInfo(publicId).getData();
  }

  /**
   * Get a test configuration Get the detailed configuration associated with a Synthetics test.
   *
   * @param publicId The public ID of the test to get details from. (required)
   * @return ApiResponse&lt;SyntheticsTestDetails&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> - Synthetic is not activated for the user - Test is not owned by the user </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SyntheticsTestDetails> getTestWithHttpInfo(String publicId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'publicId' is set
    if (publicId == null) {
      throw new ApiException(400, "Missing the required parameter 'publicId' when calling getTest");
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/synthetics/tests/{public_id}"
            .replaceAll("\\{" + "public_id" + "\\}", apiClient.escapeString(publicId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getTest");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<SyntheticsTestDetails> localVarReturnType =
        new GenericType<SyntheticsTestDetails>() {};

    return apiClient.invokeAPI(
        "SyntheticsApi.getTest",
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
   * Get all locations (public and private) Get the list of public and private locations available
   * for Synthetic tests. No arguments required.
   *
   * @return SyntheticsLocations
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *     </table>
   */
  public SyntheticsLocations listLocations() throws ApiException {
    return listLocationsWithHttpInfo().getData();
  }

  /**
   * Get all locations (public and private) Get the list of public and private locations available
   * for Synthetic tests. No arguments required.
   *
   * @return ApiResponse&lt;SyntheticsLocations&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SyntheticsLocations> listLocationsWithHttpInfo() throws ApiException {
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

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<SyntheticsLocations> localVarReturnType = new GenericType<SyntheticsLocations>() {};

    return apiClient.invokeAPI(
        "SyntheticsApi.listLocations",
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
   * Get the list of all tests Get the list of all Synthetic tests.
   *
   * @return SyntheticsListTestsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK - Returns the list of all Synthetic tests. </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Synthetics is not activated for the user. </td><td>  -  </td></tr>
   *     </table>
   */
  public SyntheticsListTestsResponse listTests() throws ApiException {
    return listTestsWithHttpInfo().getData();
  }

  /**
   * Get the list of all tests Get the list of all Synthetic tests.
   *
   * @return ApiResponse&lt;SyntheticsListTestsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK - Returns the list of all Synthetic tests. </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Synthetics is not activated for the user. </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SyntheticsListTestsResponse> listTestsWithHttpInfo() throws ApiException {
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

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<SyntheticsListTestsResponse> localVarReturnType =
        new GenericType<SyntheticsListTestsResponse>() {};

    return apiClient.invokeAPI(
        "SyntheticsApi.listTests",
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
   * Trigger tests from CI/CD pipelines Trigger a set of Synthetics tests for continuous
   * integration.
   *
   * @param body Details of the test to trigger. (required)
   * @return SyntheticsTriggerCITestsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> JSON format is wrong </td><td>  -  </td></tr>
   *     </table>
   */
  public SyntheticsTriggerCITestsResponse triggerCITests(SyntheticsCITestBody body)
      throws ApiException {
    return triggerCITestsWithHttpInfo(body).getData();
  }

  /**
   * Trigger tests from CI/CD pipelines Trigger a set of Synthetics tests for continuous
   * integration.
   *
   * @param body Details of the test to trigger. (required)
   * @return ApiResponse&lt;SyntheticsTriggerCITestsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> JSON format is wrong </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SyntheticsTriggerCITestsResponse> triggerCITestsWithHttpInfo(
      SyntheticsCITestBody body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling triggerCITests");
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

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<SyntheticsTriggerCITestsResponse> localVarReturnType =
        new GenericType<SyntheticsTriggerCITestsResponse>() {};

    return apiClient.invokeAPI(
        "SyntheticsApi.triggerCITests",
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
   * Edit an API test Edit the configuration of a Synthetic API test.
   *
   * @param publicId The public ID of the test to get details from. (required)
   * @param body New test details to be saved. (required)
   * @return SyntheticsAPITest
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> - JSON format is wrong - Updating sub-type is forbidden </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> - Synthetic Monitoring is not activated for the user - Test is not owned by the user - Test can&#39;t be found </td><td>  -  </td></tr>
   *     </table>
   */
  public SyntheticsAPITest updateAPITest(String publicId, SyntheticsAPITest body)
      throws ApiException {
    return updateAPITestWithHttpInfo(publicId, body).getData();
  }

  /**
   * Edit an API test Edit the configuration of a Synthetic API test.
   *
   * @param publicId The public ID of the test to get details from. (required)
   * @param body New test details to be saved. (required)
   * @return ApiResponse&lt;SyntheticsAPITest&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> - JSON format is wrong - Updating sub-type is forbidden </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> - Synthetic Monitoring is not activated for the user - Test is not owned by the user - Test can&#39;t be found </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SyntheticsAPITest> updateAPITestWithHttpInfo(
      String publicId, SyntheticsAPITest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'publicId' is set
    if (publicId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'publicId' when calling updateAPITest");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateAPITest");
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/synthetics/tests/api/{public_id}"
            .replaceAll("\\{" + "public_id" + "\\}", apiClient.escapeString(publicId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "updateAPITest");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<SyntheticsAPITest> localVarReturnType = new GenericType<SyntheticsAPITest>() {};

    return apiClient.invokeAPI(
        "SyntheticsApi.updateAPITest",
        localVarPath,
        "PUT",
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
   * Edit a browser test Edit the configuration of a Synthetic browser test.
   *
   * @param publicId The public ID of the test to get details from. (required)
   * @param body New test details to be saved. (required)
   * @return SyntheticsBrowserTest
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> - JSON format is wrong - Updating sub-type is forbidden </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> - Synthetic Monitoring is not activated for the user - Test is not owned by the user - Test can&#39;t be found </td><td>  -  </td></tr>
   *     </table>
   */
  public SyntheticsBrowserTest updateBrowserTest(String publicId, SyntheticsBrowserTest body)
      throws ApiException {
    return updateBrowserTestWithHttpInfo(publicId, body).getData();
  }

  /**
   * Edit a browser test Edit the configuration of a Synthetic browser test.
   *
   * @param publicId The public ID of the test to get details from. (required)
   * @param body New test details to be saved. (required)
   * @return ApiResponse&lt;SyntheticsBrowserTest&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> - JSON format is wrong - Updating sub-type is forbidden </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> - Synthetic Monitoring is not activated for the user - Test is not owned by the user - Test can&#39;t be found </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SyntheticsBrowserTest> updateBrowserTestWithHttpInfo(
      String publicId, SyntheticsBrowserTest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'publicId' is set
    if (publicId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'publicId' when calling updateBrowserTest");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateBrowserTest");
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/synthetics/tests/browser/{public_id}"
            .replaceAll("\\{" + "public_id" + "\\}", apiClient.escapeString(publicId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "updateBrowserTest");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<SyntheticsBrowserTest> localVarReturnType =
        new GenericType<SyntheticsBrowserTest>() {};

    return apiClient.invokeAPI(
        "SyntheticsApi.updateBrowserTest",
        localVarPath,
        "PUT",
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
   * Edit a private location Edit a Synthetics private location.
   *
   * @param locationId The ID of the private location. (required)
   * @param body Details of the private location to be updated. (required)
   * @return SyntheticsPrivateLocation
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> - Private locations are not activated for the user - Private location does not exist </td><td>  -  </td></tr>
   *     </table>
   */
  public SyntheticsPrivateLocation updatePrivateLocation(
      String locationId, SyntheticsPrivateLocation body) throws ApiException {
    return updatePrivateLocationWithHttpInfo(locationId, body).getData();
  }

  /**
   * Edit a private location Edit a Synthetics private location.
   *
   * @param locationId The ID of the private location. (required)
   * @param body Details of the private location to be updated. (required)
   * @return ApiResponse&lt;SyntheticsPrivateLocation&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> - Private locations are not activated for the user - Private location does not exist </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SyntheticsPrivateLocation> updatePrivateLocationWithHttpInfo(
      String locationId, SyntheticsPrivateLocation body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'locationId' is set
    if (locationId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'locationId' when calling updatePrivateLocation");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updatePrivateLocation");
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/synthetics/private-locations/{location_id}"
            .replaceAll(
                "\\{" + "location_id" + "\\}", apiClient.escapeString(locationId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "updatePrivateLocation");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<SyntheticsPrivateLocation> localVarReturnType =
        new GenericType<SyntheticsPrivateLocation>() {};

    return apiClient.invokeAPI(
        "SyntheticsApi.updatePrivateLocation",
        localVarPath,
        "PUT",
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
   * Pause or start a test Pause or start a Synthetics test by changing the status.
   *
   * @param publicId The public ID of the Synthetic test to update. (required)
   * @param body Status to set the given Synthetic test to. (required)
   * @return Boolean
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK - Returns a boolean indicating if the update was successful. </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> JSON format is wrong. </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> - Synthetic is not activated for the user - Test is not owned by the user </td><td>  -  </td></tr>
   *     </table>
   */
  public Boolean updateTestPauseStatus(String publicId, SyntheticsUpdateTestPauseStatusPayload body)
      throws ApiException {
    return updateTestPauseStatusWithHttpInfo(publicId, body).getData();
  }

  /**
   * Pause or start a test Pause or start a Synthetics test by changing the status.
   *
   * @param publicId The public ID of the Synthetic test to update. (required)
   * @param body Status to set the given Synthetic test to. (required)
   * @return ApiResponse&lt;Boolean&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK - Returns a boolean indicating if the update was successful. </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> JSON format is wrong. </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> - Synthetic is not activated for the user - Test is not owned by the user </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Boolean> updateTestPauseStatusWithHttpInfo(
      String publicId, SyntheticsUpdateTestPauseStatusPayload body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'publicId' is set
    if (publicId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'publicId' when calling updateTestPauseStatus");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateTestPauseStatus");
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/synthetics/tests/{public_id}/status"
            .replaceAll("\\{" + "public_id" + "\\}", apiClient.escapeString(publicId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "updateTestPauseStatus");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<Boolean> localVarReturnType = new GenericType<Boolean>() {};

    return apiClient.invokeAPI(
        "SyntheticsApi.updateTestPauseStatus",
        localVarPath,
        "PUT",
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
