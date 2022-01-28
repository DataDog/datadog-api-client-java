package com.datadog.api.v1.client.api;

import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.ApiResponse;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.Pair;
import com.datadog.api.v1.client.model.SyntheticsAPITest;
import com.datadog.api.v1.client.model.SyntheticsAPITestResultFull;
import com.datadog.api.v1.client.model.SyntheticsBatchDetails;
import com.datadog.api.v1.client.model.SyntheticsBrowserTest;
import com.datadog.api.v1.client.model.SyntheticsBrowserTestResultFull;
import com.datadog.api.v1.client.model.SyntheticsCITestBody;
import com.datadog.api.v1.client.model.SyntheticsDeleteTestsPayload;
import com.datadog.api.v1.client.model.SyntheticsDeleteTestsResponse;
import com.datadog.api.v1.client.model.SyntheticsGetAPITestLatestResultsResponse;
import com.datadog.api.v1.client.model.SyntheticsGetBrowserTestLatestResultsResponse;
import com.datadog.api.v1.client.model.SyntheticsGlobalVariable;
import com.datadog.api.v1.client.model.SyntheticsListGlobalVariablesResponse;
import com.datadog.api.v1.client.model.SyntheticsListTestsResponse;
import com.datadog.api.v1.client.model.SyntheticsLocations;
import com.datadog.api.v1.client.model.SyntheticsPrivateLocation;
import com.datadog.api.v1.client.model.SyntheticsPrivateLocationCreationResponse;
import com.datadog.api.v1.client.model.SyntheticsTestDetails;
import com.datadog.api.v1.client.model.SyntheticsTriggerBody;
import com.datadog.api.v1.client.model.SyntheticsTriggerCITestsResponse;
import com.datadog.api.v1.client.model.SyntheticsUpdateTestPauseStatusPayload;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
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
   * Create a global variable
   *
   * <p>See {@link #createGlobalVariableWithHttpInfo}.
   *
   * @param body Details of the global variable to create. (required)
   * @return SyntheticsGlobalVariable
   * @throws ApiException if fails to make API call
   */
  public SyntheticsGlobalVariable createGlobalVariable(SyntheticsGlobalVariable body)
      throws ApiException {
    return createGlobalVariableWithHttpInfo(body).getData();
  }

  public CompletableFuture<SyntheticsGlobalVariable> createGlobalVariableAsync(
      SyntheticsGlobalVariable body) {
    return createGlobalVariableWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a global variable
   *
   * <p>Create a Synthetics global variable.
   *
   * @param body Details of the global variable to create. (required)
   * @return ApiResponse&lt;SyntheticsGlobalVariable&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Invalid request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
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

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

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
   * Create a global variable
   *
   * <p>See {@link #createGlobalVariableWithHttpInfo}.
   *
   * @param body Details of the global variable to create. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SyntheticsGlobalVariable&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SyntheticsGlobalVariable>>
      createGlobalVariableWithHttpInfoAsync(SyntheticsGlobalVariable body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<SyntheticsGlobalVariable>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createGlobalVariable"));
      return result;
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

    return apiClient.invokeAPIAsync(
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
   * Create a private location
   *
   * <p>See {@link #createPrivateLocationWithHttpInfo}.
   *
   * @param body Details of the private location to create. (required)
   * @return SyntheticsPrivateLocationCreationResponse
   * @throws ApiException if fails to make API call
   */
  public SyntheticsPrivateLocationCreationResponse createPrivateLocation(
      SyntheticsPrivateLocation body) throws ApiException {
    return createPrivateLocationWithHttpInfo(body).getData();
  }

  public CompletableFuture<SyntheticsPrivateLocationCreationResponse> createPrivateLocationAsync(
      SyntheticsPrivateLocation body) {
    return createPrivateLocationWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a private location
   *
   * <p>Create a new Synthetics private location.
   *
   * @param body Details of the private location to create. (required)
   * @return ApiResponse&lt;SyntheticsPrivateLocationCreationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 402 </td><td> Quota reached for private locations </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Private locations are not activated for the user </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
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

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

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
   * Create a private location
   *
   * <p>See {@link #createPrivateLocationWithHttpInfo}.
   *
   * @param body Details of the private location to create. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SyntheticsPrivateLocationCreationResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SyntheticsPrivateLocationCreationResponse>>
      createPrivateLocationWithHttpInfoAsync(SyntheticsPrivateLocation body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<SyntheticsPrivateLocationCreationResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createPrivateLocation"));
      return result;
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

    return apiClient.invokeAPIAsync(
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
   * Create an API test
   *
   * <p>See {@link #createSyntheticsAPITestWithHttpInfo}.
   *
   * @param body Details of the test to create. (required)
   * @return SyntheticsAPITest
   * @throws ApiException if fails to make API call
   */
  public SyntheticsAPITest createSyntheticsAPITest(SyntheticsAPITest body) throws ApiException {
    return createSyntheticsAPITestWithHttpInfo(body).getData();
  }

  public CompletableFuture<SyntheticsAPITest> createSyntheticsAPITestAsync(SyntheticsAPITest body) {
    return createSyntheticsAPITestWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create an API test
   *
   * <p>Create a Synthetic API test.
   *
   * @param body Details of the test to create. (required)
   * @return ApiResponse&lt;SyntheticsAPITest&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK - Returns the created test details. </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> - JSON format is wrong - Creation failed </td><td>  -  </td></tr>
   *       <tr><td> 402 </td><td> Test quota is reached </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
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

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

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
   * Create an API test
   *
   * <p>See {@link #createSyntheticsAPITestWithHttpInfo}.
   *
   * @param body Details of the test to create. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SyntheticsAPITest&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SyntheticsAPITest>> createSyntheticsAPITestWithHttpInfoAsync(
      SyntheticsAPITest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<SyntheticsAPITest>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createSyntheticsAPITest"));
      return result;
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

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<SyntheticsAPITest> localVarReturnType = new GenericType<SyntheticsAPITest>() {};

    return apiClient.invokeAPIAsync(
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
   * Create a browser test
   *
   * <p>See {@link #createSyntheticsBrowserTestWithHttpInfo}.
   *
   * @param body Details of the test to create. (required)
   * @return SyntheticsBrowserTest
   * @throws ApiException if fails to make API call
   */
  public SyntheticsBrowserTest createSyntheticsBrowserTest(SyntheticsBrowserTest body)
      throws ApiException {
    return createSyntheticsBrowserTestWithHttpInfo(body).getData();
  }

  public CompletableFuture<SyntheticsBrowserTest> createSyntheticsBrowserTestAsync(
      SyntheticsBrowserTest body) {
    return createSyntheticsBrowserTestWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a browser test
   *
   * <p>Create a Synthetic browser test.
   *
   * @param body Details of the test to create. (required)
   * @return ApiResponse&lt;SyntheticsBrowserTest&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK - Returns the created test details. </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> - JSON format is wrong - Creation failed </td><td>  -  </td></tr>
   *       <tr><td> 402 </td><td> Test quota is reached </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
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

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

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
   * Create a browser test
   *
   * <p>See {@link #createSyntheticsBrowserTestWithHttpInfo}.
   *
   * @param body Details of the test to create. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SyntheticsBrowserTest&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SyntheticsBrowserTest>>
      createSyntheticsBrowserTestWithHttpInfoAsync(SyntheticsBrowserTest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<SyntheticsBrowserTest>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling createSyntheticsBrowserTest"));
      return result;
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

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<SyntheticsBrowserTest> localVarReturnType =
        new GenericType<SyntheticsBrowserTest>() {};

    return apiClient.invokeAPIAsync(
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
   * Delete a global variable
   *
   * <p>See {@link #deleteGlobalVariableWithHttpInfo}.
   *
   * @param variableId The ID of the global variable. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteGlobalVariable(String variableId) throws ApiException {
    deleteGlobalVariableWithHttpInfo(variableId);
  }

  public CompletableFuture<Void> deleteGlobalVariableAsync(String variableId) {
    return deleteGlobalVariableWithHttpInfoAsync(variableId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete a global variable
   *
   * <p>Delete a Synthetics global variable.
   *
   * @param variableId The ID of the global variable. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> JSON format is wrong </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
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

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

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
   * Delete a global variable
   *
   * <p>See {@link #deleteGlobalVariableWithHttpInfo}.
   *
   * @param variableId The ID of the global variable. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteGlobalVariableWithHttpInfoAsync(
      String variableId) {
    Object localVarPostBody = null;

    // verify the required parameter 'variableId' is set
    if (variableId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'variableId' when calling deleteGlobalVariable"));
      return result;
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

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    return apiClient.invokeAPIAsync(
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
   * Delete a private location
   *
   * <p>See {@link #deletePrivateLocationWithHttpInfo}.
   *
   * @param locationId The ID of the private location. (required)
   * @throws ApiException if fails to make API call
   */
  public void deletePrivateLocation(String locationId) throws ApiException {
    deletePrivateLocationWithHttpInfo(locationId);
  }

  public CompletableFuture<Void> deletePrivateLocationAsync(String locationId) {
    return deletePrivateLocationWithHttpInfoAsync(locationId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete a private location
   *
   * <p>Delete a Synthetics private location.
   *
   * @param locationId The ID of the private location. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> - Private locations are not activated for the user - Private location does not exist </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
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

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

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
   * Delete a private location
   *
   * <p>See {@link #deletePrivateLocationWithHttpInfo}.
   *
   * @param locationId The ID of the private location. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deletePrivateLocationWithHttpInfoAsync(
      String locationId) {
    Object localVarPostBody = null;

    // verify the required parameter 'locationId' is set
    if (locationId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'locationId' when calling deletePrivateLocation"));
      return result;
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

    return apiClient.invokeAPIAsync(
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
   * Delete tests
   *
   * <p>See {@link #deleteTestsWithHttpInfo}.
   *
   * @param body Public ID list of the Synthetic tests to be deleted. (required)
   * @return SyntheticsDeleteTestsResponse
   * @throws ApiException if fails to make API call
   */
  public SyntheticsDeleteTestsResponse deleteTests(SyntheticsDeleteTestsPayload body)
      throws ApiException {
    return deleteTestsWithHttpInfo(body).getData();
  }

  public CompletableFuture<SyntheticsDeleteTestsResponse> deleteTestsAsync(
      SyntheticsDeleteTestsPayload body) {
    return deleteTestsWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete tests
   *
   * <p>Delete multiple Synthetic tests by ID.
   *
   * @param body Public ID list of the Synthetic tests to be deleted. (required)
   * @return ApiResponse&lt;SyntheticsDeleteTestsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK. </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> - JSON format is wrong - Test cannot be deleted as it&#39;s used elsewhere (as a sub-test or in an uptime widget) - Some IDs are not owned by the user </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> - Tests to be deleted can&#39;t be found - Synthetics is not activated for the user </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
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

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

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
   * Delete tests
   *
   * <p>See {@link #deleteTestsWithHttpInfo}.
   *
   * @param body Public ID list of the Synthetic tests to be deleted. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SyntheticsDeleteTestsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SyntheticsDeleteTestsResponse>> deleteTestsWithHttpInfoAsync(
      SyntheticsDeleteTestsPayload body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<SyntheticsDeleteTestsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'body' when calling deleteTests"));
      return result;
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

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<SyntheticsDeleteTestsResponse> localVarReturnType =
        new GenericType<SyntheticsDeleteTestsResponse>() {};

    return apiClient.invokeAPIAsync(
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
   * Edit a global variable
   *
   * <p>See {@link #editGlobalVariableWithHttpInfo}.
   *
   * @param variableId The ID of the global variable. (required)
   * @param body Details of the global variable to update. (required)
   * @return SyntheticsGlobalVariable
   * @throws ApiException if fails to make API call
   */
  public SyntheticsGlobalVariable editGlobalVariable(
      String variableId, SyntheticsGlobalVariable body) throws ApiException {
    return editGlobalVariableWithHttpInfo(variableId, body).getData();
  }

  public CompletableFuture<SyntheticsGlobalVariable> editGlobalVariableAsync(
      String variableId, SyntheticsGlobalVariable body) {
    return editGlobalVariableWithHttpInfoAsync(variableId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Edit a global variable
   *
   * <p>Edit a Synthetics global variable.
   *
   * @param variableId The ID of the global variable. (required)
   * @param body Details of the global variable to update. (required)
   * @return ApiResponse&lt;SyntheticsGlobalVariable&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Invalid request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
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

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

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
   * Edit a global variable
   *
   * <p>See {@link #editGlobalVariableWithHttpInfo}.
   *
   * @param variableId The ID of the global variable. (required)
   * @param body Details of the global variable to update. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SyntheticsGlobalVariable&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SyntheticsGlobalVariable>>
      editGlobalVariableWithHttpInfoAsync(String variableId, SyntheticsGlobalVariable body) {
    Object localVarPostBody = body;

    // verify the required parameter 'variableId' is set
    if (variableId == null) {
      CompletableFuture<ApiResponse<SyntheticsGlobalVariable>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'variableId' when calling editGlobalVariable"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<SyntheticsGlobalVariable>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling editGlobalVariable"));
      return result;
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

    return apiClient.invokeAPIAsync(
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
   * Get an API test
   *
   * <p>See {@link #getAPITestWithHttpInfo}.
   *
   * @param publicId The public ID of the test to get details from. (required)
   * @return SyntheticsAPITest
   * @throws ApiException if fails to make API call
   */
  public SyntheticsAPITest getAPITest(String publicId) throws ApiException {
    return getAPITestWithHttpInfo(publicId).getData();
  }

  public CompletableFuture<SyntheticsAPITest> getAPITestAsync(String publicId) {
    return getAPITestWithHttpInfoAsync(publicId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get an API test
   *
   * <p>Get the detailed configuration associated with a Synthetic API test.
   *
   * @param publicId The public ID of the test to get details from. (required)
   * @return ApiResponse&lt;SyntheticsAPITest&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> - Synthetic Monitoring is not activated for the user - Test is not owned by the user </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
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

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

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

  /**
   * Get an API test
   *
   * <p>See {@link #getAPITestWithHttpInfo}.
   *
   * @param publicId The public ID of the test to get details from. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SyntheticsAPITest&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SyntheticsAPITest>> getAPITestWithHttpInfoAsync(
      String publicId) {
    Object localVarPostBody = null;

    // verify the required parameter 'publicId' is set
    if (publicId == null) {
      CompletableFuture<ApiResponse<SyntheticsAPITest>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'publicId' when calling getAPITest"));
      return result;
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

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<SyntheticsAPITest> localVarReturnType = new GenericType<SyntheticsAPITest>() {};

    return apiClient.invokeAPIAsync(
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
     * @param fromTs Timestamp in milliseconds from which to start querying results. (optional)
     * @return GetAPITestLatestResultsOptionalParameters
     */
    public GetAPITestLatestResultsOptionalParameters fromTs(Long fromTs) {
      this.fromTs = fromTs;
      return this;
    }

    /**
     * Set toTs
     *
     * @param toTs Timestamp in milliseconds up to which to query results. (optional)
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
   * Get an API test&#39;s latest results summaries
   *
   * <p>See {@link #getAPITestLatestResultsWithHttpInfo}.
   *
   * @param publicId The public ID of the test for which to search results for. (required)
   * @return SyntheticsGetAPITestLatestResultsResponse
   * @throws ApiException if fails to make API call
   */
  public SyntheticsGetAPITestLatestResultsResponse getAPITestLatestResults(String publicId)
      throws ApiException {
    return getAPITestLatestResultsWithHttpInfo(
            publicId, new GetAPITestLatestResultsOptionalParameters())
        .getData();
  }

  /**
   * Get an API test&#39;s latest results summaries
   *
   * <p>See {@link #getAPITestLatestResultsWithHttpInfo}.
   *
   * @param publicId The public ID of the test for which to search results for. (required)
   * @return CompletableFuture&lt;SyntheticsGetAPITestLatestResultsResponse&gt;
   */
  public CompletableFuture<SyntheticsGetAPITestLatestResultsResponse> getAPITestLatestResultsAsync(
      String publicId) {
    return getAPITestLatestResultsWithHttpInfoAsync(
            publicId, new GetAPITestLatestResultsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get an API test&#39;s latest results summaries
   *
   * <p>See {@link #getAPITestLatestResultsWithHttpInfo}.
   *
   * @param publicId The public ID of the test for which to search results for. (required)
   * @param parameters Optional parameters for the request.
   * @return SyntheticsGetAPITestLatestResultsResponse
   * @throws ApiException if fails to make API call
   */
  public SyntheticsGetAPITestLatestResultsResponse getAPITestLatestResults(
      String publicId, GetAPITestLatestResultsOptionalParameters parameters) throws ApiException {
    return getAPITestLatestResultsWithHttpInfo(publicId, parameters).getData();
  }

  /**
   * Get an API test&#39;s latest results summaries
   *
   * <p>See {@link #getAPITestLatestResultsWithHttpInfo}.
   *
   * @param publicId The public ID of the test for which to search results for. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;SyntheticsGetAPITestLatestResultsResponse&gt;
   */
  public CompletableFuture<SyntheticsGetAPITestLatestResultsResponse> getAPITestLatestResultsAsync(
      String publicId, GetAPITestLatestResultsOptionalParameters parameters) {
    return getAPITestLatestResultsWithHttpInfoAsync(publicId, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get an API test&#39;s latest results summaries
   *
   * <p>Get the last 50 test results summaries for a given Synthetics API test.
   *
   * @param publicId The public ID of the test for which to search results for. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;SyntheticsGetAPITestLatestResultsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> - Synthetic is not activated for the user - Test is not owned by the user </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
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

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

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
   * Get an API test&#39;s latest results summaries
   *
   * <p>See {@link #getAPITestLatestResultsWithHttpInfo}.
   *
   * @param publicId The public ID of the test for which to search results for. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;SyntheticsGetAPITestLatestResultsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SyntheticsGetAPITestLatestResultsResponse>>
      getAPITestLatestResultsWithHttpInfoAsync(
          String publicId, GetAPITestLatestResultsOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'publicId' is set
    if (publicId == null) {
      CompletableFuture<ApiResponse<SyntheticsGetAPITestLatestResultsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'publicId' when calling getAPITestLatestResults"));
      return result;
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

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<SyntheticsGetAPITestLatestResultsResponse> localVarReturnType =
        new GenericType<SyntheticsGetAPITestLatestResultsResponse>() {};

    return apiClient.invokeAPIAsync(
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
   * Get an API test result
   *
   * <p>See {@link #getAPITestResultWithHttpInfo}.
   *
   * @param publicId The public ID of the API test to which the target result belongs. (required)
   * @param resultId The ID of the result to get. (required)
   * @return SyntheticsAPITestResultFull
   * @throws ApiException if fails to make API call
   */
  public SyntheticsAPITestResultFull getAPITestResult(String publicId, String resultId)
      throws ApiException {
    return getAPITestResultWithHttpInfo(publicId, resultId).getData();
  }

  public CompletableFuture<SyntheticsAPITestResultFull> getAPITestResultAsync(
      String publicId, String resultId) {
    return getAPITestResultWithHttpInfoAsync(publicId, resultId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get an API test result
   *
   * <p>Get a specific full result from a given (API) Synthetic test.
   *
   * @param publicId The public ID of the API test to which the target result belongs. (required)
   * @param resultId The ID of the result to get. (required)
   * @return ApiResponse&lt;SyntheticsAPITestResultFull&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> - Synthetic is not activated for the user - Test or result is not owned by the user </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
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

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

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
   * Get an API test result
   *
   * <p>See {@link #getAPITestResultWithHttpInfo}.
   *
   * @param publicId The public ID of the API test to which the target result belongs. (required)
   * @param resultId The ID of the result to get. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SyntheticsAPITestResultFull&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SyntheticsAPITestResultFull>>
      getAPITestResultWithHttpInfoAsync(String publicId, String resultId) {
    Object localVarPostBody = null;

    // verify the required parameter 'publicId' is set
    if (publicId == null) {
      CompletableFuture<ApiResponse<SyntheticsAPITestResultFull>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'publicId' when calling getAPITestResult"));
      return result;
    }

    // verify the required parameter 'resultId' is set
    if (resultId == null) {
      CompletableFuture<ApiResponse<SyntheticsAPITestResultFull>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'resultId' when calling getAPITestResult"));
      return result;
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

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<SyntheticsAPITestResultFull> localVarReturnType =
        new GenericType<SyntheticsAPITestResultFull>() {};

    return apiClient.invokeAPIAsync(
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
   * Get a browser test
   *
   * <p>See {@link #getBrowserTestWithHttpInfo}.
   *
   * @param publicId The public ID of the test to get details from. (required)
   * @return SyntheticsBrowserTest
   * @throws ApiException if fails to make API call
   */
  public SyntheticsBrowserTest getBrowserTest(String publicId) throws ApiException {
    return getBrowserTestWithHttpInfo(publicId).getData();
  }

  public CompletableFuture<SyntheticsBrowserTest> getBrowserTestAsync(String publicId) {
    return getBrowserTestWithHttpInfoAsync(publicId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a browser test
   *
   * <p>Get the detailed configuration (including steps) associated with a Synthetic browser test.
   *
   * @param publicId The public ID of the test to get details from. (required)
   * @return ApiResponse&lt;SyntheticsBrowserTest&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> - Synthetic is not activated for the user - Test is not owned by the user </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
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

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

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

  /**
   * Get a browser test
   *
   * <p>See {@link #getBrowserTestWithHttpInfo}.
   *
   * @param publicId The public ID of the test to get details from. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SyntheticsBrowserTest&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SyntheticsBrowserTest>> getBrowserTestWithHttpInfoAsync(
      String publicId) {
    Object localVarPostBody = null;

    // verify the required parameter 'publicId' is set
    if (publicId == null) {
      CompletableFuture<ApiResponse<SyntheticsBrowserTest>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'publicId' when calling getBrowserTest"));
      return result;
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

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<SyntheticsBrowserTest> localVarReturnType =
        new GenericType<SyntheticsBrowserTest>() {};

    return apiClient.invokeAPIAsync(
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
     * @param fromTs Timestamp in milliseconds from which to start querying results. (optional)
     * @return GetBrowserTestLatestResultsOptionalParameters
     */
    public GetBrowserTestLatestResultsOptionalParameters fromTs(Long fromTs) {
      this.fromTs = fromTs;
      return this;
    }

    /**
     * Set toTs
     *
     * @param toTs Timestamp in milliseconds up to which to query results. (optional)
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
   * Get a browser test&#39;s latest results summaries
   *
   * <p>See {@link #getBrowserTestLatestResultsWithHttpInfo}.
   *
   * @param publicId The public ID of the browser test for which to search results for. (required)
   * @return SyntheticsGetBrowserTestLatestResultsResponse
   * @throws ApiException if fails to make API call
   */
  public SyntheticsGetBrowserTestLatestResultsResponse getBrowserTestLatestResults(String publicId)
      throws ApiException {
    return getBrowserTestLatestResultsWithHttpInfo(
            publicId, new GetBrowserTestLatestResultsOptionalParameters())
        .getData();
  }

  /**
   * Get a browser test&#39;s latest results summaries
   *
   * <p>See {@link #getBrowserTestLatestResultsWithHttpInfo}.
   *
   * @param publicId The public ID of the browser test for which to search results for. (required)
   * @return CompletableFuture&lt;SyntheticsGetBrowserTestLatestResultsResponse&gt;
   */
  public CompletableFuture<SyntheticsGetBrowserTestLatestResultsResponse>
      getBrowserTestLatestResultsAsync(String publicId) {
    return getBrowserTestLatestResultsWithHttpInfoAsync(
            publicId, new GetBrowserTestLatestResultsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a browser test&#39;s latest results summaries
   *
   * <p>See {@link #getBrowserTestLatestResultsWithHttpInfo}.
   *
   * @param publicId The public ID of the browser test for which to search results for. (required)
   * @param parameters Optional parameters for the request.
   * @return SyntheticsGetBrowserTestLatestResultsResponse
   * @throws ApiException if fails to make API call
   */
  public SyntheticsGetBrowserTestLatestResultsResponse getBrowserTestLatestResults(
      String publicId, GetBrowserTestLatestResultsOptionalParameters parameters)
      throws ApiException {
    return getBrowserTestLatestResultsWithHttpInfo(publicId, parameters).getData();
  }

  /**
   * Get a browser test&#39;s latest results summaries
   *
   * <p>See {@link #getBrowserTestLatestResultsWithHttpInfo}.
   *
   * @param publicId The public ID of the browser test for which to search results for. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;SyntheticsGetBrowserTestLatestResultsResponse&gt;
   */
  public CompletableFuture<SyntheticsGetBrowserTestLatestResultsResponse>
      getBrowserTestLatestResultsAsync(
          String publicId, GetBrowserTestLatestResultsOptionalParameters parameters) {
    return getBrowserTestLatestResultsWithHttpInfoAsync(publicId, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a browser test&#39;s latest results summaries
   *
   * <p>Get the last 50 test results summaries for a given Synthetics Browser test.
   *
   * @param publicId The public ID of the browser test for which to search results for. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;SyntheticsGetBrowserTestLatestResultsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> - Synthetic is not activated for the user - Test is not owned by the user </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
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

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

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
   * Get a browser test&#39;s latest results summaries
   *
   * <p>See {@link #getBrowserTestLatestResultsWithHttpInfo}.
   *
   * @param publicId The public ID of the browser test for which to search results for. (required)
   * @param parameters Optional parameters for the request.
   * @return
   *     CompletableFuture&lt;ApiResponse&lt;SyntheticsGetBrowserTestLatestResultsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SyntheticsGetBrowserTestLatestResultsResponse>>
      getBrowserTestLatestResultsWithHttpInfoAsync(
          String publicId, GetBrowserTestLatestResultsOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'publicId' is set
    if (publicId == null) {
      CompletableFuture<ApiResponse<SyntheticsGetBrowserTestLatestResultsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'publicId' when calling"
                  + " getBrowserTestLatestResults"));
      return result;
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

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<SyntheticsGetBrowserTestLatestResultsResponse> localVarReturnType =
        new GenericType<SyntheticsGetBrowserTestLatestResultsResponse>() {};

    return apiClient.invokeAPIAsync(
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
   * Get a browser test result
   *
   * <p>See {@link #getBrowserTestResultWithHttpInfo}.
   *
   * @param publicId The public ID of the browser test to which the target result belongs.
   *     (required)
   * @param resultId The ID of the result to get. (required)
   * @return SyntheticsBrowserTestResultFull
   * @throws ApiException if fails to make API call
   */
  public SyntheticsBrowserTestResultFull getBrowserTestResult(String publicId, String resultId)
      throws ApiException {
    return getBrowserTestResultWithHttpInfo(publicId, resultId).getData();
  }

  public CompletableFuture<SyntheticsBrowserTestResultFull> getBrowserTestResultAsync(
      String publicId, String resultId) {
    return getBrowserTestResultWithHttpInfoAsync(publicId, resultId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a browser test result
   *
   * <p>Get a specific full result from a given (browser) Synthetic test.
   *
   * @param publicId The public ID of the browser test to which the target result belongs.
   *     (required)
   * @param resultId The ID of the result to get. (required)
   * @return ApiResponse&lt;SyntheticsBrowserTestResultFull&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> - Synthetic is not activated for the user - Test or result is not owned by the user </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
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

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

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
   * Get a browser test result
   *
   * <p>See {@link #getBrowserTestResultWithHttpInfo}.
   *
   * @param publicId The public ID of the browser test to which the target result belongs.
   *     (required)
   * @param resultId The ID of the result to get. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SyntheticsBrowserTestResultFull&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SyntheticsBrowserTestResultFull>>
      getBrowserTestResultWithHttpInfoAsync(String publicId, String resultId) {
    Object localVarPostBody = null;

    // verify the required parameter 'publicId' is set
    if (publicId == null) {
      CompletableFuture<ApiResponse<SyntheticsBrowserTestResultFull>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'publicId' when calling getBrowserTestResult"));
      return result;
    }

    // verify the required parameter 'resultId' is set
    if (resultId == null) {
      CompletableFuture<ApiResponse<SyntheticsBrowserTestResultFull>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'resultId' when calling getBrowserTestResult"));
      return result;
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

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<SyntheticsBrowserTestResultFull> localVarReturnType =
        new GenericType<SyntheticsBrowserTestResultFull>() {};

    return apiClient.invokeAPIAsync(
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
   * Get a global variable
   *
   * <p>See {@link #getGlobalVariableWithHttpInfo}.
   *
   * @param variableId The ID of the global variable. (required)
   * @return SyntheticsGlobalVariable
   * @throws ApiException if fails to make API call
   */
  public SyntheticsGlobalVariable getGlobalVariable(String variableId) throws ApiException {
    return getGlobalVariableWithHttpInfo(variableId).getData();
  }

  public CompletableFuture<SyntheticsGlobalVariable> getGlobalVariableAsync(String variableId) {
    return getGlobalVariableWithHttpInfoAsync(variableId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a global variable
   *
   * <p>Get the detailed configuration of a global variable.
   *
   * @param variableId The ID of the global variable. (required)
   * @return ApiResponse&lt;SyntheticsGlobalVariable&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
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

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

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
   * Get a global variable
   *
   * <p>See {@link #getGlobalVariableWithHttpInfo}.
   *
   * @param variableId The ID of the global variable. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SyntheticsGlobalVariable&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SyntheticsGlobalVariable>>
      getGlobalVariableWithHttpInfoAsync(String variableId) {
    Object localVarPostBody = null;

    // verify the required parameter 'variableId' is set
    if (variableId == null) {
      CompletableFuture<ApiResponse<SyntheticsGlobalVariable>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'variableId' when calling getGlobalVariable"));
      return result;
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

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<SyntheticsGlobalVariable> localVarReturnType =
        new GenericType<SyntheticsGlobalVariable>() {};

    return apiClient.invokeAPIAsync(
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
   * Get a private location
   *
   * <p>See {@link #getPrivateLocationWithHttpInfo}.
   *
   * @param locationId The ID of the private location. (required)
   * @return SyntheticsPrivateLocation
   * @throws ApiException if fails to make API call
   */
  public SyntheticsPrivateLocation getPrivateLocation(String locationId) throws ApiException {
    return getPrivateLocationWithHttpInfo(locationId).getData();
  }

  public CompletableFuture<SyntheticsPrivateLocation> getPrivateLocationAsync(String locationId) {
    return getPrivateLocationWithHttpInfoAsync(locationId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a private location
   *
   * <p>Get a Synthetics private location.
   *
   * @param locationId The ID of the private location. (required)
   * @return ApiResponse&lt;SyntheticsPrivateLocation&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> - Synthetic private locations are not activated for the user - Private location does not exist </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
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

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

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
   * Get a private location
   *
   * <p>See {@link #getPrivateLocationWithHttpInfo}.
   *
   * @param locationId The ID of the private location. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SyntheticsPrivateLocation&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SyntheticsPrivateLocation>>
      getPrivateLocationWithHttpInfoAsync(String locationId) {
    Object localVarPostBody = null;

    // verify the required parameter 'locationId' is set
    if (locationId == null) {
      CompletableFuture<ApiResponse<SyntheticsPrivateLocation>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'locationId' when calling getPrivateLocation"));
      return result;
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

    return apiClient.invokeAPIAsync(
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
   * Get details of batch
   *
   * <p>See {@link #getSyntheticsCIBatchWithHttpInfo}.
   *
   * @param batchId The ID of the batch. (required)
   * @return SyntheticsBatchDetails
   * @throws ApiException if fails to make API call
   */
  public SyntheticsBatchDetails getSyntheticsCIBatch(String batchId) throws ApiException {
    return getSyntheticsCIBatchWithHttpInfo(batchId).getData();
  }

  public CompletableFuture<SyntheticsBatchDetails> getSyntheticsCIBatchAsync(String batchId) {
    return getSyntheticsCIBatchWithHttpInfoAsync(batchId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get details of batch
   *
   * <p>Get a batch&#39;s updated details.
   *
   * @param batchId The ID of the batch. (required)
   * @return ApiResponse&lt;SyntheticsBatchDetails&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Batch does not exist. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SyntheticsBatchDetails> getSyntheticsCIBatchWithHttpInfo(String batchId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'batchId' is set
    if (batchId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'batchId' when calling getSyntheticsCIBatch");
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/synthetics/ci/batch/{batch_id}"
            .replaceAll("\\{" + "batch_id" + "\\}", apiClient.escapeString(batchId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getSyntheticsCIBatch");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<SyntheticsBatchDetails> localVarReturnType =
        new GenericType<SyntheticsBatchDetails>() {};

    return apiClient.invokeAPI(
        "SyntheticsApi.getSyntheticsCIBatch",
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
   * Get details of batch
   *
   * <p>See {@link #getSyntheticsCIBatchWithHttpInfo}.
   *
   * @param batchId The ID of the batch. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SyntheticsBatchDetails&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SyntheticsBatchDetails>>
      getSyntheticsCIBatchWithHttpInfoAsync(String batchId) {
    Object localVarPostBody = null;

    // verify the required parameter 'batchId' is set
    if (batchId == null) {
      CompletableFuture<ApiResponse<SyntheticsBatchDetails>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'batchId' when calling getSyntheticsCIBatch"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/synthetics/ci/batch/{batch_id}"
            .replaceAll("\\{" + "batch_id" + "\\}", apiClient.escapeString(batchId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getSyntheticsCIBatch");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<SyntheticsBatchDetails> localVarReturnType =
        new GenericType<SyntheticsBatchDetails>() {};

    return apiClient.invokeAPIAsync(
        "SyntheticsApi.getSyntheticsCIBatch",
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
   * Get a test configuration
   *
   * <p>See {@link #getTestWithHttpInfo}.
   *
   * @param publicId The public ID of the test to get details from. (required)
   * @return SyntheticsTestDetails
   * @throws ApiException if fails to make API call
   */
  public SyntheticsTestDetails getTest(String publicId) throws ApiException {
    return getTestWithHttpInfo(publicId).getData();
  }

  public CompletableFuture<SyntheticsTestDetails> getTestAsync(String publicId) {
    return getTestWithHttpInfoAsync(publicId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a test configuration
   *
   * <p>Get the detailed configuration associated with a Synthetics test.
   *
   * @param publicId The public ID of the test to get details from. (required)
   * @return ApiResponse&lt;SyntheticsTestDetails&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> - Synthetic is not activated for the user - Test is not owned by the user </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
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

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

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
   * Get a test configuration
   *
   * <p>See {@link #getTestWithHttpInfo}.
   *
   * @param publicId The public ID of the test to get details from. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SyntheticsTestDetails&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SyntheticsTestDetails>> getTestWithHttpInfoAsync(
      String publicId) {
    Object localVarPostBody = null;

    // verify the required parameter 'publicId' is set
    if (publicId == null) {
      CompletableFuture<ApiResponse<SyntheticsTestDetails>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'publicId' when calling getTest"));
      return result;
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

    return apiClient.invokeAPIAsync(
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
   * Get all global variables
   *
   * <p>See {@link #listGlobalVariablesWithHttpInfo}.
   *
   * @return SyntheticsListGlobalVariablesResponse
   * @throws ApiException if fails to make API call
   */
  public SyntheticsListGlobalVariablesResponse listGlobalVariables() throws ApiException {
    return listGlobalVariablesWithHttpInfo().getData();
  }

  public CompletableFuture<SyntheticsListGlobalVariablesResponse> listGlobalVariablesAsync() {
    return listGlobalVariablesWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get all global variables
   *
   * <p>Get the list of all Synthetics global variables.
   *
   * @return ApiResponse&lt;SyntheticsListGlobalVariablesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SyntheticsListGlobalVariablesResponse> listGlobalVariablesWithHttpInfo()
      throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v1/synthetics/variables";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listGlobalVariables");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<SyntheticsListGlobalVariablesResponse> localVarReturnType =
        new GenericType<SyntheticsListGlobalVariablesResponse>() {};

    return apiClient.invokeAPI(
        "SyntheticsApi.listGlobalVariables",
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
   * Get all global variables
   *
   * <p>See {@link #listGlobalVariablesWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;SyntheticsListGlobalVariablesResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SyntheticsListGlobalVariablesResponse>>
      listGlobalVariablesWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v1/synthetics/variables";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listGlobalVariables");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<SyntheticsListGlobalVariablesResponse> localVarReturnType =
        new GenericType<SyntheticsListGlobalVariablesResponse>() {};

    return apiClient.invokeAPIAsync(
        "SyntheticsApi.listGlobalVariables",
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
   * Get all locations (public and private)
   *
   * <p>See {@link #listLocationsWithHttpInfo}.
   *
   * @return SyntheticsLocations
   * @throws ApiException if fails to make API call
   */
  public SyntheticsLocations listLocations() throws ApiException {
    return listLocationsWithHttpInfo().getData();
  }

  public CompletableFuture<SyntheticsLocations> listLocationsAsync() {
    return listLocationsWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get all locations (public and private)
   *
   * <p>Get the list of public and private locations available for Synthetic tests. No arguments
   * required.
   *
   * @return ApiResponse&lt;SyntheticsLocations&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
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

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

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
   * Get all locations (public and private)
   *
   * <p>See {@link #listLocationsWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;SyntheticsLocations&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SyntheticsLocations>> listLocationsWithHttpInfoAsync() {
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

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<SyntheticsLocations> localVarReturnType = new GenericType<SyntheticsLocations>() {};

    return apiClient.invokeAPIAsync(
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
   * Get the list of all tests
   *
   * <p>See {@link #listTestsWithHttpInfo}.
   *
   * @return SyntheticsListTestsResponse
   * @throws ApiException if fails to make API call
   */
  public SyntheticsListTestsResponse listTests() throws ApiException {
    return listTestsWithHttpInfo().getData();
  }

  public CompletableFuture<SyntheticsListTestsResponse> listTestsAsync() {
    return listTestsWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the list of all tests
   *
   * <p>Get the list of all Synthetic tests.
   *
   * @return ApiResponse&lt;SyntheticsListTestsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK - Returns the list of all Synthetic tests. </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Synthetics is not activated for the user. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
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

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

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
   * Get the list of all tests
   *
   * <p>See {@link #listTestsWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;SyntheticsListTestsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SyntheticsListTestsResponse>> listTestsWithHttpInfoAsync() {
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

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<SyntheticsListTestsResponse> localVarReturnType =
        new GenericType<SyntheticsListTestsResponse>() {};

    return apiClient.invokeAPIAsync(
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
   * Trigger tests from CI/CD pipelines
   *
   * <p>See {@link #triggerCITestsWithHttpInfo}.
   *
   * @param body Details of the test to trigger. (required)
   * @return SyntheticsTriggerCITestsResponse
   * @throws ApiException if fails to make API call
   */
  public SyntheticsTriggerCITestsResponse triggerCITests(SyntheticsCITestBody body)
      throws ApiException {
    return triggerCITestsWithHttpInfo(body).getData();
  }

  public CompletableFuture<SyntheticsTriggerCITestsResponse> triggerCITestsAsync(
      SyntheticsCITestBody body) {
    return triggerCITestsWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Trigger tests from CI/CD pipelines
   *
   * <p>Trigger a set of Synthetics tests for continuous integration.
   *
   * @param body Details of the test to trigger. (required)
   * @return ApiResponse&lt;SyntheticsTriggerCITestsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> JSON format is wrong </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
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

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

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
   * Trigger tests from CI/CD pipelines
   *
   * <p>See {@link #triggerCITestsWithHttpInfo}.
   *
   * @param body Details of the test to trigger. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SyntheticsTriggerCITestsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SyntheticsTriggerCITestsResponse>>
      triggerCITestsWithHttpInfoAsync(SyntheticsCITestBody body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<SyntheticsTriggerCITestsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling triggerCITests"));
      return result;
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

    return apiClient.invokeAPIAsync(
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
   * Trigger Synthetics tests
   *
   * <p>See {@link #triggerTestsWithHttpInfo}.
   *
   * @param body The identifiers of the tests to trigger. (required)
   * @return SyntheticsTriggerCITestsResponse
   * @throws ApiException if fails to make API call
   */
  public SyntheticsTriggerCITestsResponse triggerTests(SyntheticsTriggerBody body)
      throws ApiException {
    return triggerTestsWithHttpInfo(body).getData();
  }

  public CompletableFuture<SyntheticsTriggerCITestsResponse> triggerTestsAsync(
      SyntheticsTriggerBody body) {
    return triggerTestsWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Trigger Synthetics tests
   *
   * <p>Trigger a set of Synthetics tests.
   *
   * @param body The identifiers of the tests to trigger. (required)
   * @return ApiResponse&lt;SyntheticsTriggerCITestsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SyntheticsTriggerCITestsResponse> triggerTestsWithHttpInfo(
      SyntheticsTriggerBody body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling triggerTests");
    }
    // create path and map variables
    String localVarPath = "/api/v1/synthetics/tests/trigger";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "triggerTests");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<SyntheticsTriggerCITestsResponse> localVarReturnType =
        new GenericType<SyntheticsTriggerCITestsResponse>() {};

    return apiClient.invokeAPI(
        "SyntheticsApi.triggerTests",
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
   * Trigger Synthetics tests
   *
   * <p>See {@link #triggerTestsWithHttpInfo}.
   *
   * @param body The identifiers of the tests to trigger. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SyntheticsTriggerCITestsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SyntheticsTriggerCITestsResponse>>
      triggerTestsWithHttpInfoAsync(SyntheticsTriggerBody body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<SyntheticsTriggerCITestsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'body' when calling triggerTests"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/synthetics/tests/trigger";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "triggerTests");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<SyntheticsTriggerCITestsResponse> localVarReturnType =
        new GenericType<SyntheticsTriggerCITestsResponse>() {};

    return apiClient.invokeAPIAsync(
        "SyntheticsApi.triggerTests",
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
   * Edit an API test
   *
   * <p>See {@link #updateAPITestWithHttpInfo}.
   *
   * @param publicId The public ID of the test to get details from. (required)
   * @param body New test details to be saved. (required)
   * @return SyntheticsAPITest
   * @throws ApiException if fails to make API call
   */
  public SyntheticsAPITest updateAPITest(String publicId, SyntheticsAPITest body)
      throws ApiException {
    return updateAPITestWithHttpInfo(publicId, body).getData();
  }

  public CompletableFuture<SyntheticsAPITest> updateAPITestAsync(
      String publicId, SyntheticsAPITest body) {
    return updateAPITestWithHttpInfoAsync(publicId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Edit an API test
   *
   * <p>Edit the configuration of a Synthetic API test.
   *
   * @param publicId The public ID of the test to get details from. (required)
   * @param body New test details to be saved. (required)
   * @return ApiResponse&lt;SyntheticsAPITest&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> - JSON format is wrong - Updating sub-type is forbidden </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> - Synthetic Monitoring is not activated for the user - Test is not owned by the user - Test can&#39;t be found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
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

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

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
   * Edit an API test
   *
   * <p>See {@link #updateAPITestWithHttpInfo}.
   *
   * @param publicId The public ID of the test to get details from. (required)
   * @param body New test details to be saved. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SyntheticsAPITest&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SyntheticsAPITest>> updateAPITestWithHttpInfoAsync(
      String publicId, SyntheticsAPITest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'publicId' is set
    if (publicId == null) {
      CompletableFuture<ApiResponse<SyntheticsAPITest>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'publicId' when calling updateAPITest"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<SyntheticsAPITest>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateAPITest"));
      return result;
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

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<SyntheticsAPITest> localVarReturnType = new GenericType<SyntheticsAPITest>() {};

    return apiClient.invokeAPIAsync(
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
   * Edit a browser test
   *
   * <p>See {@link #updateBrowserTestWithHttpInfo}.
   *
   * @param publicId The public ID of the test to get details from. (required)
   * @param body New test details to be saved. (required)
   * @return SyntheticsBrowserTest
   * @throws ApiException if fails to make API call
   */
  public SyntheticsBrowserTest updateBrowserTest(String publicId, SyntheticsBrowserTest body)
      throws ApiException {
    return updateBrowserTestWithHttpInfo(publicId, body).getData();
  }

  public CompletableFuture<SyntheticsBrowserTest> updateBrowserTestAsync(
      String publicId, SyntheticsBrowserTest body) {
    return updateBrowserTestWithHttpInfoAsync(publicId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Edit a browser test
   *
   * <p>Edit the configuration of a Synthetic browser test.
   *
   * @param publicId The public ID of the test to get details from. (required)
   * @param body New test details to be saved. (required)
   * @return ApiResponse&lt;SyntheticsBrowserTest&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> - JSON format is wrong - Updating sub-type is forbidden </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> - Synthetic Monitoring is not activated for the user - Test is not owned by the user - Test can&#39;t be found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
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

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

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
   * Edit a browser test
   *
   * <p>See {@link #updateBrowserTestWithHttpInfo}.
   *
   * @param publicId The public ID of the test to get details from. (required)
   * @param body New test details to be saved. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SyntheticsBrowserTest&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SyntheticsBrowserTest>> updateBrowserTestWithHttpInfoAsync(
      String publicId, SyntheticsBrowserTest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'publicId' is set
    if (publicId == null) {
      CompletableFuture<ApiResponse<SyntheticsBrowserTest>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'publicId' when calling updateBrowserTest"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<SyntheticsBrowserTest>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateBrowserTest"));
      return result;
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

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<SyntheticsBrowserTest> localVarReturnType =
        new GenericType<SyntheticsBrowserTest>() {};

    return apiClient.invokeAPIAsync(
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
   * Edit a private location
   *
   * <p>See {@link #updatePrivateLocationWithHttpInfo}.
   *
   * @param locationId The ID of the private location. (required)
   * @param body Details of the private location to be updated. (required)
   * @return SyntheticsPrivateLocation
   * @throws ApiException if fails to make API call
   */
  public SyntheticsPrivateLocation updatePrivateLocation(
      String locationId, SyntheticsPrivateLocation body) throws ApiException {
    return updatePrivateLocationWithHttpInfo(locationId, body).getData();
  }

  public CompletableFuture<SyntheticsPrivateLocation> updatePrivateLocationAsync(
      String locationId, SyntheticsPrivateLocation body) {
    return updatePrivateLocationWithHttpInfoAsync(locationId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Edit a private location
   *
   * <p>Edit a Synthetics private location.
   *
   * @param locationId The ID of the private location. (required)
   * @param body Details of the private location to be updated. (required)
   * @return ApiResponse&lt;SyntheticsPrivateLocation&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> - Private locations are not activated for the user - Private location does not exist </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
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

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

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
   * Edit a private location
   *
   * <p>See {@link #updatePrivateLocationWithHttpInfo}.
   *
   * @param locationId The ID of the private location. (required)
   * @param body Details of the private location to be updated. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SyntheticsPrivateLocation&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SyntheticsPrivateLocation>>
      updatePrivateLocationWithHttpInfoAsync(String locationId, SyntheticsPrivateLocation body) {
    Object localVarPostBody = body;

    // verify the required parameter 'locationId' is set
    if (locationId == null) {
      CompletableFuture<ApiResponse<SyntheticsPrivateLocation>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'locationId' when calling updatePrivateLocation"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<SyntheticsPrivateLocation>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updatePrivateLocation"));
      return result;
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

    return apiClient.invokeAPIAsync(
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
   * Pause or start a test
   *
   * <p>See {@link #updateTestPauseStatusWithHttpInfo}.
   *
   * @param publicId The public ID of the Synthetic test to update. (required)
   * @param body Status to set the given Synthetic test to. (required)
   * @return Boolean
   * @throws ApiException if fails to make API call
   */
  public Boolean updateTestPauseStatus(String publicId, SyntheticsUpdateTestPauseStatusPayload body)
      throws ApiException {
    return updateTestPauseStatusWithHttpInfo(publicId, body).getData();
  }

  public CompletableFuture<Boolean> updateTestPauseStatusAsync(
      String publicId, SyntheticsUpdateTestPauseStatusPayload body) {
    return updateTestPauseStatusWithHttpInfoAsync(publicId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Pause or start a test
   *
   * <p>Pause or start a Synthetics test by changing the status.
   *
   * @param publicId The public ID of the Synthetic test to update. (required)
   * @param body Status to set the given Synthetic test to. (required)
   * @return ApiResponse&lt;Boolean&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK - Returns a boolean indicating if the update was successful. </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> JSON format is wrong. </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> - Synthetic is not activated for the user - Test is not owned by the user </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
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

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

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

  /**
   * Pause or start a test
   *
   * <p>See {@link #updateTestPauseStatusWithHttpInfo}.
   *
   * @param publicId The public ID of the Synthetic test to update. (required)
   * @param body Status to set the given Synthetic test to. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Boolean&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Boolean>> updateTestPauseStatusWithHttpInfoAsync(
      String publicId, SyntheticsUpdateTestPauseStatusPayload body) {
    Object localVarPostBody = body;

    // verify the required parameter 'publicId' is set
    if (publicId == null) {
      CompletableFuture<ApiResponse<Boolean>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'publicId' when calling updateTestPauseStatus"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Boolean>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateTestPauseStatus"));
      return result;
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

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<Boolean> localVarReturnType = new GenericType<Boolean>() {};

    return apiClient.invokeAPIAsync(
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
