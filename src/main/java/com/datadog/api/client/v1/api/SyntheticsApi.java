
package com.datadog.api.client.v1.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.PaginationIterable;

import jakarta.ws.rs.core.GenericType;
import jakarta.ws.rs.client.Invocation;

import java.io.File;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.concurrent.CompletableFuture;
import java.time.OffsetDateTime;
import java.util.UUID;
import com.datadog.api.client.v1.model.SyntheticsBatchDetails;
import com.datadog.api.client.v1.model.SyntheticsLocations;
import com.datadog.api.client.v1.model.SyntheticsPrivateLocationCreationResponse;
import com.datadog.api.client.v1.model.SyntheticsPrivateLocation;
import com.datadog.api.client.v1.model.SyntheticsListTestsResponse;
import com.datadog.api.client.v1.model.SyntheticsAPITest;
import com.datadog.api.client.v1.model.SyntheticsBrowserTest;
import com.datadog.api.client.v1.model.SyntheticsGetBrowserTestLatestResultsResponse;
import com.datadog.api.client.v1.model.SyntheticsBrowserTestResultFull;
import com.datadog.api.client.v1.model.SyntheticsDeleteTestsResponse;
import com.datadog.api.client.v1.model.SyntheticsDeleteTestsPayload;
import com.datadog.api.client.v1.model.SyntheticsMobileTest;
import com.datadog.api.client.v1.model.SyntheticsTriggerCITestsResponse;
import com.datadog.api.client.v1.model.SyntheticsTriggerBody;
import com.datadog.api.client.v1.model.SyntheticsCITestBody;
import com.datadog.api.client.v1.model.SyntheticsTestUptime;
import com.datadog.api.client.v1.model.SyntheticsFetchUptimesPayload;
import com.datadog.api.client.v1.model.SyntheticsTestDetailsWithoutSteps;
import com.datadog.api.client.v1.model.SyntheticsTestDetails;
import com.datadog.api.client.v1.model.SyntheticsPatchTestBody;
import com.datadog.api.client.v1.model.SyntheticsGetAPITestLatestResultsResponse;
import com.datadog.api.client.v1.model.SyntheticsAPITestResultFull;
import com.datadog.api.client.v1.model.SyntheticsUpdateTestPauseStatusPayload;
import com.datadog.api.client.v1.model.SyntheticsListGlobalVariablesResponse;
import com.datadog.api.client.v1.model.SyntheticsGlobalVariable;
import com.datadog.api.client.v1.model.SyntheticsGlobalVariableRequest;
import com.datadog.api.client.v1.model.SyntheticsTestDetailsWithoutSteps;


@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsApi {
  private ApiClient apiClient;
  public SyntheticsApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public SyntheticsApi(ApiClient apiClient) {
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
 * Create a global variable.
 *
 * See {@link #createGlobalVariableWithHttpInfo}.
 *
 * @param body Details of the global variable to create. (required)
 * @return SyntheticsGlobalVariable
 * @throws ApiException if fails to make API call
 */
  public SyntheticsGlobalVariable  createGlobalVariable(SyntheticsGlobalVariableRequest body) throws ApiException {
    return createGlobalVariableWithHttpInfo(body).getData();
  }

  /**
 * Create a global variable.
 *
 * See {@link #createGlobalVariableWithHttpInfoAsync}.
 *
 * @param body Details of the global variable to create. (required)
 * @return CompletableFuture&lt;SyntheticsGlobalVariable&gt;
 */
  public CompletableFuture<SyntheticsGlobalVariable>createGlobalVariableAsync(SyntheticsGlobalVariableRequest body) {
    return createGlobalVariableWithHttpInfoAsync(body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Create a Synthetic global variable.</p>
   *
   * @param body Details of the global variable to create. (required)
   * @return ApiResponse&lt;SyntheticsGlobalVariable&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Invalid request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SyntheticsGlobalVariable> createGlobalVariableWithHttpInfo(SyntheticsGlobalVariableRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createGlobalVariable");
    }
    // create path and map variables
    String localVarPath = "/api/v1/synthetics/variables";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v1.SyntheticsApi.createGlobalVariable", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SyntheticsGlobalVariable>() {});
  }

  /**
   * Create a global variable.
   *
   * See {@link #createGlobalVariableWithHttpInfo}.
   *
   * @param body Details of the global variable to create. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SyntheticsGlobalVariable&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SyntheticsGlobalVariable>> createGlobalVariableWithHttpInfoAsync(SyntheticsGlobalVariableRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<SyntheticsGlobalVariable>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling createGlobalVariable"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/synthetics/variables";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v1.SyntheticsApi.createGlobalVariable", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SyntheticsGlobalVariable>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SyntheticsGlobalVariable>() {});
  }

  /**
 * Create a private location.
 *
 * See {@link #createPrivateLocationWithHttpInfo}.
 *
 * @param body Details of the private location to create. (required)
 * @return SyntheticsPrivateLocationCreationResponse
 * @throws ApiException if fails to make API call
 */
  public SyntheticsPrivateLocationCreationResponse  createPrivateLocation(SyntheticsPrivateLocation body) throws ApiException {
    return createPrivateLocationWithHttpInfo(body).getData();
  }

  /**
 * Create a private location.
 *
 * See {@link #createPrivateLocationWithHttpInfoAsync}.
 *
 * @param body Details of the private location to create. (required)
 * @return CompletableFuture&lt;SyntheticsPrivateLocationCreationResponse&gt;
 */
  public CompletableFuture<SyntheticsPrivateLocationCreationResponse>createPrivateLocationAsync(SyntheticsPrivateLocation body) {
    return createPrivateLocationWithHttpInfoAsync(body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Create a new Synthetic private location.</p>
   *
   * @param body Details of the private location to create. (required)
   * @return ApiResponse&lt;SyntheticsPrivateLocationCreationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 402 </td><td> Quota reached for private locations </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Private locations are not activated for the user </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SyntheticsPrivateLocationCreationResponse> createPrivateLocationWithHttpInfo(SyntheticsPrivateLocation body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createPrivateLocation");
    }
    // create path and map variables
    String localVarPath = "/api/v1/synthetics/private-locations";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v1.SyntheticsApi.createPrivateLocation", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SyntheticsPrivateLocationCreationResponse>() {});
  }

  /**
   * Create a private location.
   *
   * See {@link #createPrivateLocationWithHttpInfo}.
   *
   * @param body Details of the private location to create. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SyntheticsPrivateLocationCreationResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SyntheticsPrivateLocationCreationResponse>> createPrivateLocationWithHttpInfoAsync(SyntheticsPrivateLocation body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<SyntheticsPrivateLocationCreationResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling createPrivateLocation"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/synthetics/private-locations";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v1.SyntheticsApi.createPrivateLocation", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SyntheticsPrivateLocationCreationResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SyntheticsPrivateLocationCreationResponse>() {});
  }

  /**
 * Create an API test.
 *
 * See {@link #createSyntheticsAPITestWithHttpInfo}.
 *
 * @param body Details of the test to create. (required)
 * @return SyntheticsAPITest
 * @throws ApiException if fails to make API call
 */
  public SyntheticsAPITest  createSyntheticsAPITest(SyntheticsAPITest body) throws ApiException {
    return createSyntheticsAPITestWithHttpInfo(body).getData();
  }

  /**
 * Create an API test.
 *
 * See {@link #createSyntheticsAPITestWithHttpInfoAsync}.
 *
 * @param body Details of the test to create. (required)
 * @return CompletableFuture&lt;SyntheticsAPITest&gt;
 */
  public CompletableFuture<SyntheticsAPITest>createSyntheticsAPITestAsync(SyntheticsAPITest body) {
    return createSyntheticsAPITestWithHttpInfoAsync(body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Create a Synthetic API test.</p>
   *
   * @param body Details of the test to create. (required)
   * @return ApiResponse&lt;SyntheticsAPITest&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK - Returns the created test details. </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> - JSON format is wrong - Creation failed </td><td>  -  </td></tr>
   *       <tr><td> 402 </td><td> Test quota is reached </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SyntheticsAPITest> createSyntheticsAPITestWithHttpInfo(SyntheticsAPITest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createSyntheticsAPITest");
    }
    // create path and map variables
    String localVarPath = "/api/v1/synthetics/tests/api";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v1.SyntheticsApi.createSyntheticsAPITest", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SyntheticsAPITest>() {});
  }

  /**
   * Create an API test.
   *
   * See {@link #createSyntheticsAPITestWithHttpInfo}.
   *
   * @param body Details of the test to create. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SyntheticsAPITest&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SyntheticsAPITest>> createSyntheticsAPITestWithHttpInfoAsync(SyntheticsAPITest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<SyntheticsAPITest>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling createSyntheticsAPITest"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/synthetics/tests/api";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v1.SyntheticsApi.createSyntheticsAPITest", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SyntheticsAPITest>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SyntheticsAPITest>() {});
  }

  /**
 * Create a browser test.
 *
 * See {@link #createSyntheticsBrowserTestWithHttpInfo}.
 *
 * @param body Details of the test to create. (required)
 * @return SyntheticsBrowserTest
 * @throws ApiException if fails to make API call
 */
  public SyntheticsBrowserTest  createSyntheticsBrowserTest(SyntheticsBrowserTest body) throws ApiException {
    return createSyntheticsBrowserTestWithHttpInfo(body).getData();
  }

  /**
 * Create a browser test.
 *
 * See {@link #createSyntheticsBrowserTestWithHttpInfoAsync}.
 *
 * @param body Details of the test to create. (required)
 * @return CompletableFuture&lt;SyntheticsBrowserTest&gt;
 */
  public CompletableFuture<SyntheticsBrowserTest>createSyntheticsBrowserTestAsync(SyntheticsBrowserTest body) {
    return createSyntheticsBrowserTestWithHttpInfoAsync(body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Create a Synthetic browser test.</p>
   *
   * @param body Details of the test to create. (required)
   * @return ApiResponse&lt;SyntheticsBrowserTest&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK - Returns the created test details. </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> - JSON format is wrong - Creation failed </td><td>  -  </td></tr>
   *       <tr><td> 402 </td><td> Test quota is reached </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SyntheticsBrowserTest> createSyntheticsBrowserTestWithHttpInfo(SyntheticsBrowserTest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createSyntheticsBrowserTest");
    }
    // create path and map variables
    String localVarPath = "/api/v1/synthetics/tests/browser";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v1.SyntheticsApi.createSyntheticsBrowserTest", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SyntheticsBrowserTest>() {});
  }

  /**
   * Create a browser test.
   *
   * See {@link #createSyntheticsBrowserTestWithHttpInfo}.
   *
   * @param body Details of the test to create. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SyntheticsBrowserTest&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SyntheticsBrowserTest>> createSyntheticsBrowserTestWithHttpInfoAsync(SyntheticsBrowserTest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<SyntheticsBrowserTest>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling createSyntheticsBrowserTest"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/synthetics/tests/browser";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v1.SyntheticsApi.createSyntheticsBrowserTest", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SyntheticsBrowserTest>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SyntheticsBrowserTest>() {});
  }

  /**
 * Create a mobile test.
 *
 * See {@link #createSyntheticsMobileTestWithHttpInfo}.
 *
 * @param body Details of the test to create. (required)
 * @return SyntheticsMobileTest
 * @throws ApiException if fails to make API call
 */
  public SyntheticsMobileTest  createSyntheticsMobileTest(SyntheticsMobileTest body) throws ApiException {
    return createSyntheticsMobileTestWithHttpInfo(body).getData();
  }

  /**
 * Create a mobile test.
 *
 * See {@link #createSyntheticsMobileTestWithHttpInfoAsync}.
 *
 * @param body Details of the test to create. (required)
 * @return CompletableFuture&lt;SyntheticsMobileTest&gt;
 */
  public CompletableFuture<SyntheticsMobileTest>createSyntheticsMobileTestAsync(SyntheticsMobileTest body) {
    return createSyntheticsMobileTestWithHttpInfoAsync(body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Create a Synthetic mobile test.</p>
   *
   * @param body Details of the test to create. (required)
   * @return ApiResponse&lt;SyntheticsMobileTest&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK - Returns the created test details. </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> - JSON format is wrong - Creation failed </td><td>  -  </td></tr>
   *       <tr><td> 402 </td><td> Test quota is reached </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SyntheticsMobileTest> createSyntheticsMobileTestWithHttpInfo(SyntheticsMobileTest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createSyntheticsMobileTest");
    }
    // create path and map variables
    String localVarPath = "/api/v1/synthetics/tests/mobile";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v1.SyntheticsApi.createSyntheticsMobileTest", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SyntheticsMobileTest>() {});
  }

  /**
   * Create a mobile test.
   *
   * See {@link #createSyntheticsMobileTestWithHttpInfo}.
   *
   * @param body Details of the test to create. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SyntheticsMobileTest&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SyntheticsMobileTest>> createSyntheticsMobileTestWithHttpInfoAsync(SyntheticsMobileTest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<SyntheticsMobileTest>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling createSyntheticsMobileTest"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/synthetics/tests/mobile";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v1.SyntheticsApi.createSyntheticsMobileTest", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SyntheticsMobileTest>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SyntheticsMobileTest>() {});
  }

  /**
 * Delete a global variable.
 *
 * See {@link #deleteGlobalVariableWithHttpInfo}.
 *
 * @param variableId The ID of the global variable. (required)
 * @throws ApiException if fails to make API call
 */
  public  void  deleteGlobalVariable(String variableId) throws ApiException {
    deleteGlobalVariableWithHttpInfo(variableId);
  }

  /**
 * Delete a global variable.
 *
 * See {@link #deleteGlobalVariableWithHttpInfoAsync}.
 *
 * @param variableId The ID of the global variable. (required)
 * @return CompletableFuture
 */
  public CompletableFuture<Void>deleteGlobalVariableAsync(String variableId) {
    return deleteGlobalVariableWithHttpInfoAsync(variableId).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Delete a Synthetic global variable.</p>
   *
   * @param variableId The ID of the global variable. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
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
      throw new ApiException(400, "Missing the required parameter 'variableId' when calling deleteGlobalVariable");
    }
    // create path and map variables
    String localVarPath = "/api/v1/synthetics/variables/{variable_id}"
      .replaceAll("\\{" + "variable_id" + "\\}", apiClient.escapeString(variableId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v1.SyntheticsApi.deleteGlobalVariable", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("DELETE", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
   * Delete a global variable.
   *
   * See {@link #deleteGlobalVariableWithHttpInfo}.
   *
   * @param variableId The ID of the global variable. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteGlobalVariableWithHttpInfoAsync(String variableId) {
    Object localVarPostBody = null;

    // verify the required parameter 'variableId' is set
    if (variableId == null) {
        CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'variableId' when calling deleteGlobalVariable"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/synthetics/variables/{variable_id}"
      .replaceAll("\\{" + "variable_id" + "\\}", apiClient.escapeString(variableId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v1.SyntheticsApi.deleteGlobalVariable", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("DELETE", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
 * Delete a private location.
 *
 * See {@link #deletePrivateLocationWithHttpInfo}.
 *
 * @param locationId The ID of the private location. (required)
 * @throws ApiException if fails to make API call
 */
  public  void  deletePrivateLocation(String locationId) throws ApiException {
    deletePrivateLocationWithHttpInfo(locationId);
  }

  /**
 * Delete a private location.
 *
 * See {@link #deletePrivateLocationWithHttpInfoAsync}.
 *
 * @param locationId The ID of the private location. (required)
 * @return CompletableFuture
 */
  public CompletableFuture<Void>deletePrivateLocationAsync(String locationId) {
    return deletePrivateLocationWithHttpInfoAsync(locationId).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Delete a Synthetic private location.</p>
   *
   * @param locationId The ID of the private location. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> - Private locations are not activated for the user - Private location does not exist </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deletePrivateLocationWithHttpInfo(String locationId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'locationId' is set
    if (locationId == null) {
      throw new ApiException(400, "Missing the required parameter 'locationId' when calling deletePrivateLocation");
    }
    // create path and map variables
    String localVarPath = "/api/v1/synthetics/private-locations/{location_id}"
      .replaceAll("\\{" + "location_id" + "\\}", apiClient.escapeString(locationId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v1.SyntheticsApi.deletePrivateLocation", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("DELETE", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
   * Delete a private location.
   *
   * See {@link #deletePrivateLocationWithHttpInfo}.
   *
   * @param locationId The ID of the private location. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deletePrivateLocationWithHttpInfoAsync(String locationId) {
    Object localVarPostBody = null;

    // verify the required parameter 'locationId' is set
    if (locationId == null) {
        CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'locationId' when calling deletePrivateLocation"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/synthetics/private-locations/{location_id}"
      .replaceAll("\\{" + "location_id" + "\\}", apiClient.escapeString(locationId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v1.SyntheticsApi.deletePrivateLocation", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("DELETE", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
 * Delete tests.
 *
 * See {@link #deleteTestsWithHttpInfo}.
 *
 * @param body Public ID list of the Synthetic tests to be deleted. (required)
 * @return SyntheticsDeleteTestsResponse
 * @throws ApiException if fails to make API call
 */
  public SyntheticsDeleteTestsResponse  deleteTests(SyntheticsDeleteTestsPayload body) throws ApiException {
    return deleteTestsWithHttpInfo(body).getData();
  }

  /**
 * Delete tests.
 *
 * See {@link #deleteTestsWithHttpInfoAsync}.
 *
 * @param body Public ID list of the Synthetic tests to be deleted. (required)
 * @return CompletableFuture&lt;SyntheticsDeleteTestsResponse&gt;
 */
  public CompletableFuture<SyntheticsDeleteTestsResponse>deleteTestsAsync(SyntheticsDeleteTestsPayload body) {
    return deleteTestsWithHttpInfoAsync(body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Delete multiple Synthetic tests by ID.</p>
   *
   * @param body Public ID list of the Synthetic tests to be deleted. (required)
   * @return ApiResponse&lt;SyntheticsDeleteTestsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK. </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> - JSON format is wrong - Test cannot be deleted as it&#39;s used elsewhere (as a sub-test or in an uptime widget) - Some IDs are not owned by the user </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> - Tests to be deleted can&#39;t be found - Synthetic is not activated for the user </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SyntheticsDeleteTestsResponse> deleteTestsWithHttpInfo(SyntheticsDeleteTestsPayload body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling deleteTests");
    }
    // create path and map variables
    String localVarPath = "/api/v1/synthetics/tests/delete";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v1.SyntheticsApi.deleteTests", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SyntheticsDeleteTestsResponse>() {});
  }

  /**
   * Delete tests.
   *
   * See {@link #deleteTestsWithHttpInfo}.
   *
   * @param body Public ID list of the Synthetic tests to be deleted. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SyntheticsDeleteTestsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SyntheticsDeleteTestsResponse>> deleteTestsWithHttpInfoAsync(SyntheticsDeleteTestsPayload body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<SyntheticsDeleteTestsResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling deleteTests"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/synthetics/tests/delete";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v1.SyntheticsApi.deleteTests", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SyntheticsDeleteTestsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SyntheticsDeleteTestsResponse>() {});
  }

  /**
 * Edit a global variable.
 *
 * See {@link #editGlobalVariableWithHttpInfo}.
 *
 * @param variableId The ID of the global variable. (required)
 * @param body Details of the global variable to update. (required)
 * @return SyntheticsGlobalVariable
 * @throws ApiException if fails to make API call
 */
  public SyntheticsGlobalVariable  editGlobalVariable(String variableId, SyntheticsGlobalVariableRequest body) throws ApiException {
    return editGlobalVariableWithHttpInfo(variableId, body).getData();
  }

  /**
 * Edit a global variable.
 *
 * See {@link #editGlobalVariableWithHttpInfoAsync}.
 *
 * @param variableId The ID of the global variable. (required)
 * @param body Details of the global variable to update. (required)
 * @return CompletableFuture&lt;SyntheticsGlobalVariable&gt;
 */
  public CompletableFuture<SyntheticsGlobalVariable>editGlobalVariableAsync(String variableId, SyntheticsGlobalVariableRequest body) {
    return editGlobalVariableWithHttpInfoAsync(variableId, body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Edit a Synthetic global variable.</p>
   *
   * @param variableId The ID of the global variable. (required)
   * @param body Details of the global variable to update. (required)
   * @return ApiResponse&lt;SyntheticsGlobalVariable&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Invalid request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SyntheticsGlobalVariable> editGlobalVariableWithHttpInfo(String variableId, SyntheticsGlobalVariableRequest body) throws ApiException {
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

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v1.SyntheticsApi.editGlobalVariable", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("PUT", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SyntheticsGlobalVariable>() {});
  }

  /**
   * Edit a global variable.
   *
   * See {@link #editGlobalVariableWithHttpInfo}.
   *
   * @param variableId The ID of the global variable. (required)
   * @param body Details of the global variable to update. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SyntheticsGlobalVariable&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SyntheticsGlobalVariable>> editGlobalVariableWithHttpInfoAsync(String variableId, SyntheticsGlobalVariableRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'variableId' is set
    if (variableId == null) {
        CompletableFuture<ApiResponse<SyntheticsGlobalVariable>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'variableId' when calling editGlobalVariable"));
        return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<SyntheticsGlobalVariable>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling editGlobalVariable"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/synthetics/variables/{variable_id}"
      .replaceAll("\\{" + "variable_id" + "\\}", apiClient.escapeString(variableId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v1.SyntheticsApi.editGlobalVariable", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SyntheticsGlobalVariable>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("PUT", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SyntheticsGlobalVariable>() {});
  }

  /**
 * Fetch uptime for multiple tests.
 *
 * See {@link #fetchUptimesWithHttpInfo}.
 *
 * @param body Public ID list of the Synthetic tests and timeframe. (required)
 * @return List&lt;SyntheticsTestUptime&gt;
 * @throws ApiException if fails to make API call
 */
  public List<SyntheticsTestUptime>  fetchUptimes(SyntheticsFetchUptimesPayload body) throws ApiException {
    return fetchUptimesWithHttpInfo(body).getData();
  }

  /**
 * Fetch uptime for multiple tests.
 *
 * See {@link #fetchUptimesWithHttpInfoAsync}.
 *
 * @param body Public ID list of the Synthetic tests and timeframe. (required)
 * @return CompletableFuture&lt;List&lt;SyntheticsTestUptime&gt;&gt;
 */
  public CompletableFuture<List<SyntheticsTestUptime>>fetchUptimesAsync(SyntheticsFetchUptimesPayload body) {
    return fetchUptimesWithHttpInfoAsync(body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Fetch uptime for multiple Synthetic tests by ID.</p>
   *
   * @param body Public ID list of the Synthetic tests and timeframe. (required)
   * @return ApiResponse&lt;List&lt;SyntheticsTestUptime&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK. </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> - JSON format is wrong </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<List<SyntheticsTestUptime>> fetchUptimesWithHttpInfo(SyntheticsFetchUptimesPayload body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling fetchUptimes");
    }
    // create path and map variables
    String localVarPath = "/api/v1/synthetics/tests/uptimes";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v1.SyntheticsApi.fetchUptimes", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<List<SyntheticsTestUptime>>() {});
  }

  /**
   * Fetch uptime for multiple tests.
   *
   * See {@link #fetchUptimesWithHttpInfo}.
   *
   * @param body Public ID list of the Synthetic tests and timeframe. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;List&lt;SyntheticsTestUptime&gt;&gt;&gt;
   */
  public CompletableFuture<ApiResponse<List<SyntheticsTestUptime>>> fetchUptimesWithHttpInfoAsync(SyntheticsFetchUptimesPayload body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<List<SyntheticsTestUptime>>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling fetchUptimes"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/synthetics/tests/uptimes";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v1.SyntheticsApi.fetchUptimes", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<List<SyntheticsTestUptime>>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<List<SyntheticsTestUptime>>() {});
  }

  /**
 * Get an API test.
 *
 * See {@link #getAPITestWithHttpInfo}.
 *
 * @param publicId The public ID of the test to get details from. (required)
 * @return SyntheticsAPITest
 * @throws ApiException if fails to make API call
 */
  public SyntheticsAPITest  getAPITest(String publicId) throws ApiException {
    return getAPITestWithHttpInfo(publicId).getData();
  }

  /**
 * Get an API test.
 *
 * See {@link #getAPITestWithHttpInfoAsync}.
 *
 * @param publicId The public ID of the test to get details from. (required)
 * @return CompletableFuture&lt;SyntheticsAPITest&gt;
 */
  public CompletableFuture<SyntheticsAPITest>getAPITestAsync(String publicId) {
    return getAPITestWithHttpInfoAsync(publicId).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get the detailed configuration associated with
   * a Synthetic API test.</p>
   *
   * @param publicId The public ID of the test to get details from. (required)
   * @return ApiResponse&lt;SyntheticsAPITest&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> - Synthetic Monitoring is not activated for the user - Test is not owned by the user </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SyntheticsAPITest> getAPITestWithHttpInfo(String publicId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'publicId' is set
    if (publicId == null) {
      throw new ApiException(400, "Missing the required parameter 'publicId' when calling getAPITest");
    }
    // create path and map variables
    String localVarPath = "/api/v1/synthetics/tests/api/{public_id}"
      .replaceAll("\\{" + "public_id" + "\\}", apiClient.escapeString(publicId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v1.SyntheticsApi.getAPITest", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SyntheticsAPITest>() {});
  }

  /**
   * Get an API test.
   *
   * See {@link #getAPITestWithHttpInfo}.
   *
   * @param publicId The public ID of the test to get details from. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SyntheticsAPITest&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SyntheticsAPITest>> getAPITestWithHttpInfoAsync(String publicId) {
    Object localVarPostBody = null;

    // verify the required parameter 'publicId' is set
    if (publicId == null) {
        CompletableFuture<ApiResponse<SyntheticsAPITest>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'publicId' when calling getAPITest"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/synthetics/tests/api/{public_id}"
      .replaceAll("\\{" + "public_id" + "\\}", apiClient.escapeString(publicId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v1.SyntheticsApi.getAPITest", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SyntheticsAPITest>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SyntheticsAPITest>() {});
  }

  /**
   * Manage optional parameters to getAPITestLatestResults.
   */
  public static class GetAPITestLatestResultsOptionalParameters {
    private Long fromTs;
    private Long toTs;
    private List<String> probeDc;

    /**
     * Set fromTs.
     * @param fromTs Timestamp in milliseconds from which to start querying results. (optional)
     * @return GetAPITestLatestResultsOptionalParameters
     */
    public GetAPITestLatestResultsOptionalParameters fromTs(Long fromTs) {
      this.fromTs = fromTs;
      return this;
    }

    /**
     * Set toTs.
     * @param toTs Timestamp in milliseconds up to which to query results. (optional)
     * @return GetAPITestLatestResultsOptionalParameters
     */
    public GetAPITestLatestResultsOptionalParameters toTs(Long toTs) {
      this.toTs = toTs;
      return this;
    }

    /**
     * Set probeDc.
     * @param probeDc Locations for which to query results. (optional)
     * @return GetAPITestLatestResultsOptionalParameters
     */
    public GetAPITestLatestResultsOptionalParameters probeDc(List<String> probeDc) {
      this.probeDc = probeDc;
      return this;
    }
  }

  /**
 * Get an API test&#39;s latest results summaries.
 *
 * See {@link #getAPITestLatestResultsWithHttpInfo}.
 *
 * @param publicId The public ID of the test for which to search results for. (required)
 * @return SyntheticsGetAPITestLatestResultsResponse
 * @throws ApiException if fails to make API call
 */
  public SyntheticsGetAPITestLatestResultsResponse getAPITestLatestResults (String publicId) throws ApiException {
    return getAPITestLatestResultsWithHttpInfo( publicId, new GetAPITestLatestResultsOptionalParameters()).getData();
  }

  /**
 * Get an API test&#39;s latest results summaries.
 *
 * See {@link #getAPITestLatestResultsWithHttpInfoAsync}.
 *
 * @param publicId The public ID of the test for which to search results for. (required)
 * @return CompletableFuture&lt;SyntheticsGetAPITestLatestResultsResponse&gt;
 */
  public CompletableFuture<SyntheticsGetAPITestLatestResultsResponse>getAPITestLatestResultsAsync(String publicId) {
    return getAPITestLatestResultsWithHttpInfoAsync(publicId, new GetAPITestLatestResultsOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * Get an API test&#39;s latest results summaries.
 *
 * See {@link #getAPITestLatestResultsWithHttpInfo}.
 *
 * @param publicId The public ID of the test for which to search results for. (required)
 * @param parameters Optional parameters for the request.
 * @return SyntheticsGetAPITestLatestResultsResponse
 * @throws ApiException if fails to make API call
 */
  public SyntheticsGetAPITestLatestResultsResponse getAPITestLatestResults(String publicId, GetAPITestLatestResultsOptionalParameters parameters) throws ApiException {
    return getAPITestLatestResultsWithHttpInfo(publicId, parameters).getData();
  }

  /**
 * Get an API test&#39;s latest results summaries.
 *
 * See {@link #getAPITestLatestResultsWithHttpInfoAsync}.
 *
 * @param publicId The public ID of the test for which to search results for. (required)
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;SyntheticsGetAPITestLatestResultsResponse&gt;
 */
  public CompletableFuture<SyntheticsGetAPITestLatestResultsResponse>getAPITestLatestResultsAsync( String publicId, GetAPITestLatestResultsOptionalParameters parameters) {
    return getAPITestLatestResultsWithHttpInfoAsync(publicId, parameters).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get the last 150 test results summaries for a given Synthetic API test.</p>
   *
   * @param publicId The public ID of the test for which to search results for. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;SyntheticsGetAPITestLatestResultsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> - Synthetic is not activated for the user - Test is not owned by the user </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SyntheticsGetAPITestLatestResultsResponse> getAPITestLatestResultsWithHttpInfo(String publicId, GetAPITestLatestResultsOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'publicId' is set
    if (publicId == null) {
      throw new ApiException(400, "Missing the required parameter 'publicId' when calling getAPITestLatestResults");
    }
    Long fromTs = parameters.fromTs;
    Long toTs = parameters.toTs;
    List<String> probeDc = parameters.probeDc;
    // create path and map variables
    String localVarPath = "/api/v1/synthetics/tests/{public_id}/results"
      .replaceAll("\\{" + "public_id" + "\\}", apiClient.escapeString(publicId.toString()));

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "from_ts", fromTs));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "to_ts", toTs));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "probe_dc", probeDc));

    Invocation.Builder builder = apiClient.createBuilder("v1.SyntheticsApi.getAPITestLatestResults", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SyntheticsGetAPITestLatestResultsResponse>() {});
  }

  /**
   * Get an API test&#39;s latest results summaries.
   *
   * See {@link #getAPITestLatestResultsWithHttpInfo}.
   *
   * @param publicId The public ID of the test for which to search results for. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;SyntheticsGetAPITestLatestResultsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SyntheticsGetAPITestLatestResultsResponse>> getAPITestLatestResultsWithHttpInfoAsync(String publicId, GetAPITestLatestResultsOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'publicId' is set
    if (publicId == null) {
        CompletableFuture<ApiResponse<SyntheticsGetAPITestLatestResultsResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'publicId' when calling getAPITestLatestResults"));
        return result;
    }
    Long fromTs = parameters.fromTs;
    Long toTs = parameters.toTs;
    List<String> probeDc = parameters.probeDc;
    // create path and map variables
    String localVarPath = "/api/v1/synthetics/tests/{public_id}/results"
      .replaceAll("\\{" + "public_id" + "\\}", apiClient.escapeString(publicId.toString()));

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "from_ts", fromTs));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "to_ts", toTs));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "probe_dc", probeDc));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v1.SyntheticsApi.getAPITestLatestResults", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SyntheticsGetAPITestLatestResultsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SyntheticsGetAPITestLatestResultsResponse>() {});
  }

  /**
 * Get an API test result.
 *
 * See {@link #getAPITestResultWithHttpInfo}.
 *
 * @param publicId The public ID of the API test to which the target result belongs. (required)
 * @param resultId The ID of the result to get. (required)
 * @return SyntheticsAPITestResultFull
 * @throws ApiException if fails to make API call
 */
  public SyntheticsAPITestResultFull  getAPITestResult(String publicId, String resultId) throws ApiException {
    return getAPITestResultWithHttpInfo(publicId, resultId).getData();
  }

  /**
 * Get an API test result.
 *
 * See {@link #getAPITestResultWithHttpInfoAsync}.
 *
 * @param publicId The public ID of the API test to which the target result belongs. (required)
 * @param resultId The ID of the result to get. (required)
 * @return CompletableFuture&lt;SyntheticsAPITestResultFull&gt;
 */
  public CompletableFuture<SyntheticsAPITestResultFull>getAPITestResultAsync(String publicId, String resultId) {
    return getAPITestResultWithHttpInfoAsync(publicId, resultId).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get a specific full result from a given Synthetic API test.</p>
   *
   * @param publicId The public ID of the API test to which the target result belongs. (required)
   * @param resultId The ID of the result to get. (required)
   * @return ApiResponse&lt;SyntheticsAPITestResultFull&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> - Synthetic Monitoring is not activated for the user - Test or result is not owned by the user </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SyntheticsAPITestResultFull> getAPITestResultWithHttpInfo(String publicId, String resultId) throws ApiException {
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

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v1.SyntheticsApi.getAPITestResult", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SyntheticsAPITestResultFull>() {});
  }

  /**
   * Get an API test result.
   *
   * See {@link #getAPITestResultWithHttpInfo}.
   *
   * @param publicId The public ID of the API test to which the target result belongs. (required)
   * @param resultId The ID of the result to get. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SyntheticsAPITestResultFull&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SyntheticsAPITestResultFull>> getAPITestResultWithHttpInfoAsync(String publicId, String resultId) {
    Object localVarPostBody = null;

    // verify the required parameter 'publicId' is set
    if (publicId == null) {
        CompletableFuture<ApiResponse<SyntheticsAPITestResultFull>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'publicId' when calling getAPITestResult"));
        return result;
    }

    // verify the required parameter 'resultId' is set
    if (resultId == null) {
        CompletableFuture<ApiResponse<SyntheticsAPITestResultFull>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'resultId' when calling getAPITestResult"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/synthetics/tests/{public_id}/results/{result_id}"
      .replaceAll("\\{" + "public_id" + "\\}", apiClient.escapeString(publicId.toString()))
      .replaceAll("\\{" + "result_id" + "\\}", apiClient.escapeString(resultId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v1.SyntheticsApi.getAPITestResult", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SyntheticsAPITestResultFull>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SyntheticsAPITestResultFull>() {});
  }

  /**
 * Get a browser test.
 *
 * See {@link #getBrowserTestWithHttpInfo}.
 *
 * @param publicId The public ID of the test to get details from. (required)
 * @return SyntheticsBrowserTest
 * @throws ApiException if fails to make API call
 */
  public SyntheticsBrowserTest  getBrowserTest(String publicId) throws ApiException {
    return getBrowserTestWithHttpInfo(publicId).getData();
  }

  /**
 * Get a browser test.
 *
 * See {@link #getBrowserTestWithHttpInfoAsync}.
 *
 * @param publicId The public ID of the test to get details from. (required)
 * @return CompletableFuture&lt;SyntheticsBrowserTest&gt;
 */
  public CompletableFuture<SyntheticsBrowserTest>getBrowserTestAsync(String publicId) {
    return getBrowserTestWithHttpInfoAsync(publicId).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get the detailed configuration (including steps) associated with
   * a Synthetic browser test.</p>
   *
   * @param publicId The public ID of the test to get details from. (required)
   * @return ApiResponse&lt;SyntheticsBrowserTest&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> - Synthetic Monitoring is not activated for the user - Test is not owned by the user </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SyntheticsBrowserTest> getBrowserTestWithHttpInfo(String publicId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'publicId' is set
    if (publicId == null) {
      throw new ApiException(400, "Missing the required parameter 'publicId' when calling getBrowserTest");
    }
    // create path and map variables
    String localVarPath = "/api/v1/synthetics/tests/browser/{public_id}"
      .replaceAll("\\{" + "public_id" + "\\}", apiClient.escapeString(publicId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v1.SyntheticsApi.getBrowserTest", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SyntheticsBrowserTest>() {});
  }

  /**
   * Get a browser test.
   *
   * See {@link #getBrowserTestWithHttpInfo}.
   *
   * @param publicId The public ID of the test to get details from. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SyntheticsBrowserTest&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SyntheticsBrowserTest>> getBrowserTestWithHttpInfoAsync(String publicId) {
    Object localVarPostBody = null;

    // verify the required parameter 'publicId' is set
    if (publicId == null) {
        CompletableFuture<ApiResponse<SyntheticsBrowserTest>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'publicId' when calling getBrowserTest"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/synthetics/tests/browser/{public_id}"
      .replaceAll("\\{" + "public_id" + "\\}", apiClient.escapeString(publicId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v1.SyntheticsApi.getBrowserTest", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SyntheticsBrowserTest>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SyntheticsBrowserTest>() {});
  }

  /**
   * Manage optional parameters to getBrowserTestLatestResults.
   */
  public static class GetBrowserTestLatestResultsOptionalParameters {
    private Long fromTs;
    private Long toTs;
    private List<String> probeDc;

    /**
     * Set fromTs.
     * @param fromTs Timestamp in milliseconds from which to start querying results. (optional)
     * @return GetBrowserTestLatestResultsOptionalParameters
     */
    public GetBrowserTestLatestResultsOptionalParameters fromTs(Long fromTs) {
      this.fromTs = fromTs;
      return this;
    }

    /**
     * Set toTs.
     * @param toTs Timestamp in milliseconds up to which to query results. (optional)
     * @return GetBrowserTestLatestResultsOptionalParameters
     */
    public GetBrowserTestLatestResultsOptionalParameters toTs(Long toTs) {
      this.toTs = toTs;
      return this;
    }

    /**
     * Set probeDc.
     * @param probeDc Locations for which to query results. (optional)
     * @return GetBrowserTestLatestResultsOptionalParameters
     */
    public GetBrowserTestLatestResultsOptionalParameters probeDc(List<String> probeDc) {
      this.probeDc = probeDc;
      return this;
    }
  }

  /**
 * Get a browser test&#39;s latest results summaries.
 *
 * See {@link #getBrowserTestLatestResultsWithHttpInfo}.
 *
 * @param publicId The public ID of the browser test for which to search results for. (required)
 * @return SyntheticsGetBrowserTestLatestResultsResponse
 * @throws ApiException if fails to make API call
 */
  public SyntheticsGetBrowserTestLatestResultsResponse getBrowserTestLatestResults (String publicId) throws ApiException {
    return getBrowserTestLatestResultsWithHttpInfo( publicId, new GetBrowserTestLatestResultsOptionalParameters()).getData();
  }

  /**
 * Get a browser test&#39;s latest results summaries.
 *
 * See {@link #getBrowserTestLatestResultsWithHttpInfoAsync}.
 *
 * @param publicId The public ID of the browser test for which to search results for. (required)
 * @return CompletableFuture&lt;SyntheticsGetBrowserTestLatestResultsResponse&gt;
 */
  public CompletableFuture<SyntheticsGetBrowserTestLatestResultsResponse>getBrowserTestLatestResultsAsync(String publicId) {
    return getBrowserTestLatestResultsWithHttpInfoAsync(publicId, new GetBrowserTestLatestResultsOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * Get a browser test&#39;s latest results summaries.
 *
 * See {@link #getBrowserTestLatestResultsWithHttpInfo}.
 *
 * @param publicId The public ID of the browser test for which to search results for. (required)
 * @param parameters Optional parameters for the request.
 * @return SyntheticsGetBrowserTestLatestResultsResponse
 * @throws ApiException if fails to make API call
 */
  public SyntheticsGetBrowserTestLatestResultsResponse getBrowserTestLatestResults(String publicId, GetBrowserTestLatestResultsOptionalParameters parameters) throws ApiException {
    return getBrowserTestLatestResultsWithHttpInfo(publicId, parameters).getData();
  }

  /**
 * Get a browser test&#39;s latest results summaries.
 *
 * See {@link #getBrowserTestLatestResultsWithHttpInfoAsync}.
 *
 * @param publicId The public ID of the browser test for which to search results for. (required)
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;SyntheticsGetBrowserTestLatestResultsResponse&gt;
 */
  public CompletableFuture<SyntheticsGetBrowserTestLatestResultsResponse>getBrowserTestLatestResultsAsync( String publicId, GetBrowserTestLatestResultsOptionalParameters parameters) {
    return getBrowserTestLatestResultsWithHttpInfoAsync(publicId, parameters).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get the last 150 test results summaries for a given Synthetic browser test.</p>
   *
   * @param publicId The public ID of the browser test for which to search results for. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;SyntheticsGetBrowserTestLatestResultsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> - Synthetic Monitoring is not activated for the user - Test is not owned by the user </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SyntheticsGetBrowserTestLatestResultsResponse> getBrowserTestLatestResultsWithHttpInfo(String publicId, GetBrowserTestLatestResultsOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'publicId' is set
    if (publicId == null) {
      throw new ApiException(400, "Missing the required parameter 'publicId' when calling getBrowserTestLatestResults");
    }
    Long fromTs = parameters.fromTs;
    Long toTs = parameters.toTs;
    List<String> probeDc = parameters.probeDc;
    // create path and map variables
    String localVarPath = "/api/v1/synthetics/tests/browser/{public_id}/results"
      .replaceAll("\\{" + "public_id" + "\\}", apiClient.escapeString(publicId.toString()));

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "from_ts", fromTs));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "to_ts", toTs));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "probe_dc", probeDc));

    Invocation.Builder builder = apiClient.createBuilder("v1.SyntheticsApi.getBrowserTestLatestResults", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SyntheticsGetBrowserTestLatestResultsResponse>() {});
  }

  /**
   * Get a browser test&#39;s latest results summaries.
   *
   * See {@link #getBrowserTestLatestResultsWithHttpInfo}.
   *
   * @param publicId The public ID of the browser test for which to search results for. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;SyntheticsGetBrowserTestLatestResultsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SyntheticsGetBrowserTestLatestResultsResponse>> getBrowserTestLatestResultsWithHttpInfoAsync(String publicId, GetBrowserTestLatestResultsOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'publicId' is set
    if (publicId == null) {
        CompletableFuture<ApiResponse<SyntheticsGetBrowserTestLatestResultsResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'publicId' when calling getBrowserTestLatestResults"));
        return result;
    }
    Long fromTs = parameters.fromTs;
    Long toTs = parameters.toTs;
    List<String> probeDc = parameters.probeDc;
    // create path and map variables
    String localVarPath = "/api/v1/synthetics/tests/browser/{public_id}/results"
      .replaceAll("\\{" + "public_id" + "\\}", apiClient.escapeString(publicId.toString()));

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "from_ts", fromTs));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "to_ts", toTs));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "probe_dc", probeDc));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v1.SyntheticsApi.getBrowserTestLatestResults", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SyntheticsGetBrowserTestLatestResultsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SyntheticsGetBrowserTestLatestResultsResponse>() {});
  }

  /**
 * Get a browser test result.
 *
 * See {@link #getBrowserTestResultWithHttpInfo}.
 *
 * @param publicId The public ID of the browser test to which the target result belongs. (required)
 * @param resultId The ID of the result to get. (required)
 * @return SyntheticsBrowserTestResultFull
 * @throws ApiException if fails to make API call
 */
  public SyntheticsBrowserTestResultFull  getBrowserTestResult(String publicId, String resultId) throws ApiException {
    return getBrowserTestResultWithHttpInfo(publicId, resultId).getData();
  }

  /**
 * Get a browser test result.
 *
 * See {@link #getBrowserTestResultWithHttpInfoAsync}.
 *
 * @param publicId The public ID of the browser test to which the target result belongs. (required)
 * @param resultId The ID of the result to get. (required)
 * @return CompletableFuture&lt;SyntheticsBrowserTestResultFull&gt;
 */
  public CompletableFuture<SyntheticsBrowserTestResultFull>getBrowserTestResultAsync(String publicId, String resultId) {
    return getBrowserTestResultWithHttpInfoAsync(publicId, resultId).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get a specific full result from a given Synthetic browser test.</p>
   *
   * @param publicId The public ID of the browser test to which the target result belongs. (required)
   * @param resultId The ID of the result to get. (required)
   * @return ApiResponse&lt;SyntheticsBrowserTestResultFull&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> - Synthetic Monitoring is not activated for the user - Test or result is not owned by the user </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SyntheticsBrowserTestResultFull> getBrowserTestResultWithHttpInfo(String publicId, String resultId) throws ApiException {
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

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v1.SyntheticsApi.getBrowserTestResult", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SyntheticsBrowserTestResultFull>() {});
  }

  /**
   * Get a browser test result.
   *
   * See {@link #getBrowserTestResultWithHttpInfo}.
   *
   * @param publicId The public ID of the browser test to which the target result belongs. (required)
   * @param resultId The ID of the result to get. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SyntheticsBrowserTestResultFull&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SyntheticsBrowserTestResultFull>> getBrowserTestResultWithHttpInfoAsync(String publicId, String resultId) {
    Object localVarPostBody = null;

    // verify the required parameter 'publicId' is set
    if (publicId == null) {
        CompletableFuture<ApiResponse<SyntheticsBrowserTestResultFull>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'publicId' when calling getBrowserTestResult"));
        return result;
    }

    // verify the required parameter 'resultId' is set
    if (resultId == null) {
        CompletableFuture<ApiResponse<SyntheticsBrowserTestResultFull>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'resultId' when calling getBrowserTestResult"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/synthetics/tests/browser/{public_id}/results/{result_id}"
      .replaceAll("\\{" + "public_id" + "\\}", apiClient.escapeString(publicId.toString()))
      .replaceAll("\\{" + "result_id" + "\\}", apiClient.escapeString(resultId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v1.SyntheticsApi.getBrowserTestResult", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SyntheticsBrowserTestResultFull>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SyntheticsBrowserTestResultFull>() {});
  }

  /**
 * Get a global variable.
 *
 * See {@link #getGlobalVariableWithHttpInfo}.
 *
 * @param variableId The ID of the global variable. (required)
 * @return SyntheticsGlobalVariable
 * @throws ApiException if fails to make API call
 */
  public SyntheticsGlobalVariable  getGlobalVariable(String variableId) throws ApiException {
    return getGlobalVariableWithHttpInfo(variableId).getData();
  }

  /**
 * Get a global variable.
 *
 * See {@link #getGlobalVariableWithHttpInfoAsync}.
 *
 * @param variableId The ID of the global variable. (required)
 * @return CompletableFuture&lt;SyntheticsGlobalVariable&gt;
 */
  public CompletableFuture<SyntheticsGlobalVariable>getGlobalVariableAsync(String variableId) {
    return getGlobalVariableWithHttpInfoAsync(variableId).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get the detailed configuration of a global variable.</p>
   *
   * @param variableId The ID of the global variable. (required)
   * @return ApiResponse&lt;SyntheticsGlobalVariable&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SyntheticsGlobalVariable> getGlobalVariableWithHttpInfo(String variableId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'variableId' is set
    if (variableId == null) {
      throw new ApiException(400, "Missing the required parameter 'variableId' when calling getGlobalVariable");
    }
    // create path and map variables
    String localVarPath = "/api/v1/synthetics/variables/{variable_id}"
      .replaceAll("\\{" + "variable_id" + "\\}", apiClient.escapeString(variableId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v1.SyntheticsApi.getGlobalVariable", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SyntheticsGlobalVariable>() {});
  }

  /**
   * Get a global variable.
   *
   * See {@link #getGlobalVariableWithHttpInfo}.
   *
   * @param variableId The ID of the global variable. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SyntheticsGlobalVariable&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SyntheticsGlobalVariable>> getGlobalVariableWithHttpInfoAsync(String variableId) {
    Object localVarPostBody = null;

    // verify the required parameter 'variableId' is set
    if (variableId == null) {
        CompletableFuture<ApiResponse<SyntheticsGlobalVariable>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'variableId' when calling getGlobalVariable"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/synthetics/variables/{variable_id}"
      .replaceAll("\\{" + "variable_id" + "\\}", apiClient.escapeString(variableId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v1.SyntheticsApi.getGlobalVariable", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SyntheticsGlobalVariable>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SyntheticsGlobalVariable>() {});
  }

  /**
 * Get a mobile test.
 *
 * See {@link #getMobileTestWithHttpInfo}.
 *
 * @param publicId The public ID of the test to get details from. (required)
 * @return SyntheticsMobileTest
 * @throws ApiException if fails to make API call
 */
  public SyntheticsMobileTest  getMobileTest(String publicId) throws ApiException {
    return getMobileTestWithHttpInfo(publicId).getData();
  }

  /**
 * Get a mobile test.
 *
 * See {@link #getMobileTestWithHttpInfoAsync}.
 *
 * @param publicId The public ID of the test to get details from. (required)
 * @return CompletableFuture&lt;SyntheticsMobileTest&gt;
 */
  public CompletableFuture<SyntheticsMobileTest>getMobileTestAsync(String publicId) {
    return getMobileTestWithHttpInfoAsync(publicId).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get the detailed configuration associated with
   * a Synthetic mobile test.</p>
   *
   * @param publicId The public ID of the test to get details from. (required)
   * @return ApiResponse&lt;SyntheticsMobileTest&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> - Synthetic Monitoring is not activated for the user - Test is not owned by the user </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SyntheticsMobileTest> getMobileTestWithHttpInfo(String publicId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'publicId' is set
    if (publicId == null) {
      throw new ApiException(400, "Missing the required parameter 'publicId' when calling getMobileTest");
    }
    // create path and map variables
    String localVarPath = "/api/v1/synthetics/tests/mobile/{public_id}"
      .replaceAll("\\{" + "public_id" + "\\}", apiClient.escapeString(publicId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v1.SyntheticsApi.getMobileTest", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SyntheticsMobileTest>() {});
  }

  /**
   * Get a mobile test.
   *
   * See {@link #getMobileTestWithHttpInfo}.
   *
   * @param publicId The public ID of the test to get details from. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SyntheticsMobileTest&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SyntheticsMobileTest>> getMobileTestWithHttpInfoAsync(String publicId) {
    Object localVarPostBody = null;

    // verify the required parameter 'publicId' is set
    if (publicId == null) {
        CompletableFuture<ApiResponse<SyntheticsMobileTest>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'publicId' when calling getMobileTest"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/synthetics/tests/mobile/{public_id}"
      .replaceAll("\\{" + "public_id" + "\\}", apiClient.escapeString(publicId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v1.SyntheticsApi.getMobileTest", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SyntheticsMobileTest>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SyntheticsMobileTest>() {});
  }

  /**
 * Get a private location.
 *
 * See {@link #getPrivateLocationWithHttpInfo}.
 *
 * @param locationId The ID of the private location. (required)
 * @return SyntheticsPrivateLocation
 * @throws ApiException if fails to make API call
 */
  public SyntheticsPrivateLocation  getPrivateLocation(String locationId) throws ApiException {
    return getPrivateLocationWithHttpInfo(locationId).getData();
  }

  /**
 * Get a private location.
 *
 * See {@link #getPrivateLocationWithHttpInfoAsync}.
 *
 * @param locationId The ID of the private location. (required)
 * @return CompletableFuture&lt;SyntheticsPrivateLocation&gt;
 */
  public CompletableFuture<SyntheticsPrivateLocation>getPrivateLocationAsync(String locationId) {
    return getPrivateLocationWithHttpInfoAsync(locationId).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get a Synthetic private location.</p>
   *
   * @param locationId The ID of the private location. (required)
   * @return ApiResponse&lt;SyntheticsPrivateLocation&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> - Synthetic private locations are not activated for the user - Private location does not exist </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SyntheticsPrivateLocation> getPrivateLocationWithHttpInfo(String locationId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'locationId' is set
    if (locationId == null) {
      throw new ApiException(400, "Missing the required parameter 'locationId' when calling getPrivateLocation");
    }
    // create path and map variables
    String localVarPath = "/api/v1/synthetics/private-locations/{location_id}"
      .replaceAll("\\{" + "location_id" + "\\}", apiClient.escapeString(locationId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v1.SyntheticsApi.getPrivateLocation", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SyntheticsPrivateLocation>() {});
  }

  /**
   * Get a private location.
   *
   * See {@link #getPrivateLocationWithHttpInfo}.
   *
   * @param locationId The ID of the private location. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SyntheticsPrivateLocation&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SyntheticsPrivateLocation>> getPrivateLocationWithHttpInfoAsync(String locationId) {
    Object localVarPostBody = null;

    // verify the required parameter 'locationId' is set
    if (locationId == null) {
        CompletableFuture<ApiResponse<SyntheticsPrivateLocation>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'locationId' when calling getPrivateLocation"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/synthetics/private-locations/{location_id}"
      .replaceAll("\\{" + "location_id" + "\\}", apiClient.escapeString(locationId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v1.SyntheticsApi.getPrivateLocation", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SyntheticsPrivateLocation>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SyntheticsPrivateLocation>() {});
  }

  /**
 * Get details of batch.
 *
 * See {@link #getSyntheticsCIBatchWithHttpInfo}.
 *
 * @param batchId The ID of the batch. (required)
 * @return SyntheticsBatchDetails
 * @throws ApiException if fails to make API call
 */
  public SyntheticsBatchDetails  getSyntheticsCIBatch(String batchId) throws ApiException {
    return getSyntheticsCIBatchWithHttpInfo(batchId).getData();
  }

  /**
 * Get details of batch.
 *
 * See {@link #getSyntheticsCIBatchWithHttpInfoAsync}.
 *
 * @param batchId The ID of the batch. (required)
 * @return CompletableFuture&lt;SyntheticsBatchDetails&gt;
 */
  public CompletableFuture<SyntheticsBatchDetails>getSyntheticsCIBatchAsync(String batchId) {
    return getSyntheticsCIBatchWithHttpInfoAsync(batchId).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get a batch's updated details.</p>
   *
   * @param batchId The ID of the batch. (required)
   * @return ApiResponse&lt;SyntheticsBatchDetails&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Batch does not exist. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SyntheticsBatchDetails> getSyntheticsCIBatchWithHttpInfo(String batchId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'batchId' is set
    if (batchId == null) {
      throw new ApiException(400, "Missing the required parameter 'batchId' when calling getSyntheticsCIBatch");
    }
    // create path and map variables
    String localVarPath = "/api/v1/synthetics/ci/batch/{batch_id}"
      .replaceAll("\\{" + "batch_id" + "\\}", apiClient.escapeString(batchId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v1.SyntheticsApi.getSyntheticsCIBatch", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SyntheticsBatchDetails>() {});
  }

  /**
   * Get details of batch.
   *
   * See {@link #getSyntheticsCIBatchWithHttpInfo}.
   *
   * @param batchId The ID of the batch. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SyntheticsBatchDetails&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SyntheticsBatchDetails>> getSyntheticsCIBatchWithHttpInfoAsync(String batchId) {
    Object localVarPostBody = null;

    // verify the required parameter 'batchId' is set
    if (batchId == null) {
        CompletableFuture<ApiResponse<SyntheticsBatchDetails>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'batchId' when calling getSyntheticsCIBatch"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/synthetics/ci/batch/{batch_id}"
      .replaceAll("\\{" + "batch_id" + "\\}", apiClient.escapeString(batchId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v1.SyntheticsApi.getSyntheticsCIBatch", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SyntheticsBatchDetails>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SyntheticsBatchDetails>() {});
  }

  /**
 * Get the default locations.
 *
 * See {@link #getSyntheticsDefaultLocationsWithHttpInfo}.
 *
 * @return List&lt;String&gt;
 * @throws ApiException if fails to make API call
 */
  public List<String>  getSyntheticsDefaultLocations() throws ApiException {
    return getSyntheticsDefaultLocationsWithHttpInfo().getData();
  }

  /**
 * Get the default locations.
 *
 * See {@link #getSyntheticsDefaultLocationsWithHttpInfoAsync}.
 *
 * @return CompletableFuture&lt;List&lt;String&gt;&gt;
 */
  public CompletableFuture<List<String>>getSyntheticsDefaultLocationsAsync() {
    return getSyntheticsDefaultLocationsWithHttpInfoAsync().thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get the default locations settings.</p>
   *
   * @return ApiResponse&lt;List&lt;String&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<List<String>> getSyntheticsDefaultLocationsWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v1/synthetics/settings/default_locations";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v1.SyntheticsApi.getSyntheticsDefaultLocations", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<List<String>>() {});
  }

  /**
   * Get the default locations.
   *
   * See {@link #getSyntheticsDefaultLocationsWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;List&lt;String&gt;&gt;&gt;
   */
  public CompletableFuture<ApiResponse<List<String>>> getSyntheticsDefaultLocationsWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v1/synthetics/settings/default_locations";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v1.SyntheticsApi.getSyntheticsDefaultLocations", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<List<String>>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<List<String>>() {});
  }

  /**
 * Get a test configuration.
 *
 * See {@link #getTestWithHttpInfo}.
 *
 * @param publicId The public ID of the test to get details from. (required)
 * @return SyntheticsTestDetailsWithoutSteps
 * @throws ApiException if fails to make API call
 */
  public SyntheticsTestDetailsWithoutSteps  getTest(String publicId) throws ApiException {
    return getTestWithHttpInfo(publicId).getData();
  }

  /**
 * Get a test configuration.
 *
 * See {@link #getTestWithHttpInfoAsync}.
 *
 * @param publicId The public ID of the test to get details from. (required)
 * @return CompletableFuture&lt;SyntheticsTestDetailsWithoutSteps&gt;
 */
  public CompletableFuture<SyntheticsTestDetailsWithoutSteps>getTestAsync(String publicId) {
    return getTestWithHttpInfoAsync(publicId).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get the detailed configuration associated with a Synthetic test.</p>
   *
   * @param publicId The public ID of the test to get details from. (required)
   * @return ApiResponse&lt;SyntheticsTestDetailsWithoutSteps&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> - Synthetic is not activated for the user - Test is not owned by the user </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SyntheticsTestDetailsWithoutSteps> getTestWithHttpInfo(String publicId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'publicId' is set
    if (publicId == null) {
      throw new ApiException(400, "Missing the required parameter 'publicId' when calling getTest");
    }
    // create path and map variables
    String localVarPath = "/api/v1/synthetics/tests/{public_id}"
      .replaceAll("\\{" + "public_id" + "\\}", apiClient.escapeString(publicId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v1.SyntheticsApi.getTest", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SyntheticsTestDetailsWithoutSteps>() {});
  }

  /**
   * Get a test configuration.
   *
   * See {@link #getTestWithHttpInfo}.
   *
   * @param publicId The public ID of the test to get details from. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SyntheticsTestDetailsWithoutSteps&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SyntheticsTestDetailsWithoutSteps>> getTestWithHttpInfoAsync(String publicId) {
    Object localVarPostBody = null;

    // verify the required parameter 'publicId' is set
    if (publicId == null) {
        CompletableFuture<ApiResponse<SyntheticsTestDetailsWithoutSteps>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'publicId' when calling getTest"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/synthetics/tests/{public_id}"
      .replaceAll("\\{" + "public_id" + "\\}", apiClient.escapeString(publicId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v1.SyntheticsApi.getTest", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SyntheticsTestDetailsWithoutSteps>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SyntheticsTestDetailsWithoutSteps>() {});
  }

  /**
 * Get all global variables.
 *
 * See {@link #listGlobalVariablesWithHttpInfo}.
 *
 * @return SyntheticsListGlobalVariablesResponse
 * @throws ApiException if fails to make API call
 */
  public SyntheticsListGlobalVariablesResponse  listGlobalVariables() throws ApiException {
    return listGlobalVariablesWithHttpInfo().getData();
  }

  /**
 * Get all global variables.
 *
 * See {@link #listGlobalVariablesWithHttpInfoAsync}.
 *
 * @return CompletableFuture&lt;SyntheticsListGlobalVariablesResponse&gt;
 */
  public CompletableFuture<SyntheticsListGlobalVariablesResponse>listGlobalVariablesAsync() {
    return listGlobalVariablesWithHttpInfoAsync().thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get the list of all Synthetic global variables.</p>
   *
   * @return ApiResponse&lt;SyntheticsListGlobalVariablesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SyntheticsListGlobalVariablesResponse> listGlobalVariablesWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v1/synthetics/variables";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v1.SyntheticsApi.listGlobalVariables", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SyntheticsListGlobalVariablesResponse>() {});
  }

  /**
   * Get all global variables.
   *
   * See {@link #listGlobalVariablesWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;SyntheticsListGlobalVariablesResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SyntheticsListGlobalVariablesResponse>> listGlobalVariablesWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v1/synthetics/variables";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v1.SyntheticsApi.listGlobalVariables", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SyntheticsListGlobalVariablesResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SyntheticsListGlobalVariablesResponse>() {});
  }

  /**
 * Get all locations (public and private).
 *
 * See {@link #listLocationsWithHttpInfo}.
 *
 * @return SyntheticsLocations
 * @throws ApiException if fails to make API call
 */
  public SyntheticsLocations  listLocations() throws ApiException {
    return listLocationsWithHttpInfo().getData();
  }

  /**
 * Get all locations (public and private).
 *
 * See {@link #listLocationsWithHttpInfoAsync}.
 *
 * @return CompletableFuture&lt;SyntheticsLocations&gt;
 */
  public CompletableFuture<SyntheticsLocations>listLocationsAsync() {
    return listLocationsWithHttpInfoAsync().thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get the list of public and private locations available for Synthetic
   * tests. No arguments required.</p>
   *
   * @return ApiResponse&lt;SyntheticsLocations&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
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

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v1.SyntheticsApi.listLocations", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SyntheticsLocations>() {});
  }

  /**
   * Get all locations (public and private).
   *
   * See {@link #listLocationsWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;SyntheticsLocations&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SyntheticsLocations>> listLocationsWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v1/synthetics/locations";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v1.SyntheticsApi.listLocations", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SyntheticsLocations>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SyntheticsLocations>() {});
  }

  /**
   * Manage optional parameters to listTests.
   */
  public static class ListTestsOptionalParameters {
    private Long pageSize;
    private Long pageNumber;

    /**
     * Set pageSize.
     * @param pageSize Used for pagination. The number of tests returned in the page. (optional, default to 100)
     * @return ListTestsOptionalParameters
     */
    public ListTestsOptionalParameters pageSize(Long pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set pageNumber.
     * @param pageNumber Used for pagination. Which page you want to retrieve. Starts at zero. (optional)
     * @return ListTestsOptionalParameters
     */
    public ListTestsOptionalParameters pageNumber(Long pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }
  }

  /**
 * Get the list of all Synthetic tests.
 *
 * See {@link #listTestsWithHttpInfo}.
 *
 * @return SyntheticsListTestsResponse
 * @throws ApiException if fails to make API call
 */
  public SyntheticsListTestsResponse listTests () throws ApiException {
    return listTestsWithHttpInfo(new ListTestsOptionalParameters()).getData();
  }

  /**
 * Get the list of all Synthetic tests.
 *
 * See {@link #listTestsWithHttpInfoAsync}.
 *
 * @return CompletableFuture&lt;SyntheticsListTestsResponse&gt;
 */
  public CompletableFuture<SyntheticsListTestsResponse>listTestsAsync() {
    return listTestsWithHttpInfoAsync(new ListTestsOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * Get the list of all Synthetic tests.
 *
 * See {@link #listTestsWithHttpInfo}.
 *
 * @param parameters Optional parameters for the request.
 * @return SyntheticsListTestsResponse
 * @throws ApiException if fails to make API call
 */
  public SyntheticsListTestsResponse listTests(ListTestsOptionalParameters parameters) throws ApiException {
    return listTestsWithHttpInfo(parameters).getData();
  }

  /**
 * Get the list of all Synthetic tests.
 *
 * See {@link #listTestsWithHttpInfoAsync}.
 *
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;SyntheticsListTestsResponse&gt;
 */
  public CompletableFuture<SyntheticsListTestsResponse>listTestsAsync(ListTestsOptionalParameters parameters) {
    return listTestsWithHttpInfoAsync(parameters).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * Get the list of all Synthetic tests.
 *
 * See {@link #listTestsWithHttpInfo}.
 *
 * @return PaginationIterable&lt;SyntheticsTestDetailsWithoutSteps&gt;
 */
  public PaginationIterable<SyntheticsTestDetailsWithoutSteps> listTestsWithPagination() {
    ListTestsOptionalParameters parameters = new ListTestsOptionalParameters();
    return listTestsWithPagination(parameters);
  }

  /**
 * Get the list of all Synthetic tests.
 *
 * See {@link #listTestsWithHttpInfo}.
 *
 * @return SyntheticsListTestsResponse
 */
  public PaginationIterable<SyntheticsTestDetailsWithoutSteps> listTestsWithPagination(ListTestsOptionalParameters parameters) {
  String resultsPath = "getTests";
  String valueGetterPath = "";
  String valueSetterPath = "pageNumber";
  Boolean valueSetterParamOptional = true;
  parameters.pageNumber(0l);
  Long limit;

  
  if (parameters.pageSize == null) {
      limit = 100l;
      parameters.pageSize(limit);
  } else {
      limit = parameters.pageSize;
  }
  

  
  LinkedHashMap<String, Object> args = new LinkedHashMap<String, Object>();
  args.put("optionalParams", parameters);

  PaginationIterable iterator = new PaginationIterable(this, "listTests", resultsPath, valueGetterPath, valueSetterPath, valueSetterParamOptional, false, limit, args);

  return iterator;
  }


  /**
   * <p>Get the list of all Synthetic tests.</p>
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;SyntheticsListTestsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK - Returns the list of all Synthetic tests. </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Synthetic Monitoring is not activated for the user. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SyntheticsListTestsResponse> listTestsWithHttpInfo(ListTestsOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    Long pageSize = parameters.pageSize;
    Long pageNumber = parameters.pageNumber;
    // create path and map variables
    String localVarPath = "/api/v1/synthetics/tests";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page_size", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page_number", pageNumber));

    Invocation.Builder builder = apiClient.createBuilder("v1.SyntheticsApi.listTests", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SyntheticsListTestsResponse>() {});
  }

  /**
   * Get the list of all Synthetic tests.
   *
   * See {@link #listTestsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;SyntheticsListTestsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SyntheticsListTestsResponse>> listTestsWithHttpInfoAsync(ListTestsOptionalParameters parameters) {
    Object localVarPostBody = null;
    Long pageSize = parameters.pageSize;
    Long pageNumber = parameters.pageNumber;
    // create path and map variables
    String localVarPath = "/api/v1/synthetics/tests";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page_size", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page_number", pageNumber));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v1.SyntheticsApi.listTests", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SyntheticsListTestsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SyntheticsListTestsResponse>() {});
  }

  /**
 * Patch a Synthetic test.
 *
 * See {@link #patchTestWithHttpInfo}.
 *
 * @param publicId The public ID of the test to patch. (required)
 * @param body <a href="https://jsonpatch.com/">JSON Patch</a> compliant list of operations (required)
 * @return SyntheticsTestDetails
 * @throws ApiException if fails to make API call
 */
  public SyntheticsTestDetails  patchTest(String publicId, SyntheticsPatchTestBody body) throws ApiException {
    return patchTestWithHttpInfo(publicId, body).getData();
  }

  /**
 * Patch a Synthetic test.
 *
 * See {@link #patchTestWithHttpInfoAsync}.
 *
 * @param publicId The public ID of the test to patch. (required)
 * @param body <a href="https://jsonpatch.com/">JSON Patch</a> compliant list of operations (required)
 * @return CompletableFuture&lt;SyntheticsTestDetails&gt;
 */
  public CompletableFuture<SyntheticsTestDetails>patchTestAsync(String publicId, SyntheticsPatchTestBody body) {
    return patchTestWithHttpInfoAsync(publicId, body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Patch the configuration of a Synthetic test with partial data.</p>
   *
   * @param publicId The public ID of the test to patch. (required)
   * @param body <a href="https://jsonpatch.com/">JSON Patch</a> compliant list of operations (required)
   * @return ApiResponse&lt;SyntheticsTestDetails&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> - JSON format is wrong - Updating sub-type is forbidden </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> - Synthetic Monitoring is not activated for the user - Test is not owned by the user - Test can&#39;t be found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SyntheticsTestDetails> patchTestWithHttpInfo(String publicId, SyntheticsPatchTestBody body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'publicId' is set
    if (publicId == null) {
      throw new ApiException(400, "Missing the required parameter 'publicId' when calling patchTest");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling patchTest");
    }
    // create path and map variables
    String localVarPath = "/api/v1/synthetics/tests/{public_id}"
      .replaceAll("\\{" + "public_id" + "\\}", apiClient.escapeString(publicId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v1.SyntheticsApi.patchTest", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("PATCH", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SyntheticsTestDetails>() {});
  }

  /**
   * Patch a Synthetic test.
   *
   * See {@link #patchTestWithHttpInfo}.
   *
   * @param publicId The public ID of the test to patch. (required)
   * @param body <a href="https://jsonpatch.com/">JSON Patch</a> compliant list of operations (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SyntheticsTestDetails&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SyntheticsTestDetails>> patchTestWithHttpInfoAsync(String publicId, SyntheticsPatchTestBody body) {
    Object localVarPostBody = body;

    // verify the required parameter 'publicId' is set
    if (publicId == null) {
        CompletableFuture<ApiResponse<SyntheticsTestDetails>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'publicId' when calling patchTest"));
        return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<SyntheticsTestDetails>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling patchTest"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/synthetics/tests/{public_id}"
      .replaceAll("\\{" + "public_id" + "\\}", apiClient.escapeString(publicId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v1.SyntheticsApi.patchTest", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SyntheticsTestDetails>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("PATCH", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SyntheticsTestDetails>() {});
  }

  /**
   * Manage optional parameters to searchTests.
   */
  public static class SearchTestsOptionalParameters {
    private String text;
    private Boolean includeFullConfig;
    private Boolean facetsOnly;
    private Long start;
    private Long count;
    private String sort;

    /**
     * Set text.
     * @param text The search query. (optional)
     * @return SearchTestsOptionalParameters
     */
    public SearchTestsOptionalParameters text(String text) {
      this.text = text;
      return this;
    }

    /**
     * Set includeFullConfig.
     * @param includeFullConfig If true, include the full configuration for each test in the response. (optional)
     * @return SearchTestsOptionalParameters
     */
    public SearchTestsOptionalParameters includeFullConfig(Boolean includeFullConfig) {
      this.includeFullConfig = includeFullConfig;
      return this;
    }

    /**
     * Set facetsOnly.
     * @param facetsOnly If true, return only facets instead of full test details. (optional)
     * @return SearchTestsOptionalParameters
     */
    public SearchTestsOptionalParameters facetsOnly(Boolean facetsOnly) {
      this.facetsOnly = facetsOnly;
      return this;
    }

    /**
     * Set start.
     * @param start The offset from which to start returning results. (optional, default to 0)
     * @return SearchTestsOptionalParameters
     */
    public SearchTestsOptionalParameters start(Long start) {
      this.start = start;
      return this;
    }

    /**
     * Set count.
     * @param count The maximum number of results to return. (optional, default to 50)
     * @return SearchTestsOptionalParameters
     */
    public SearchTestsOptionalParameters count(Long count) {
      this.count = count;
      return this;
    }

    /**
     * Set sort.
     * @param sort The sort order for the results (e.g., <code>name,asc</code> or <code>name,desc</code>). (optional, default to "name,asc")
     * @return SearchTestsOptionalParameters
     */
    public SearchTestsOptionalParameters sort(String sort) {
      this.sort = sort;
      return this;
    }
  }

  /**
 * Search Synthetic tests.
 *
 * See {@link #searchTestsWithHttpInfo}.
 *
 * @return SyntheticsListTestsResponse
 * @throws ApiException if fails to make API call
 */
  public SyntheticsListTestsResponse searchTests () throws ApiException {
    return searchTestsWithHttpInfo(new SearchTestsOptionalParameters()).getData();
  }

  /**
 * Search Synthetic tests.
 *
 * See {@link #searchTestsWithHttpInfoAsync}.
 *
 * @return CompletableFuture&lt;SyntheticsListTestsResponse&gt;
 */
  public CompletableFuture<SyntheticsListTestsResponse>searchTestsAsync() {
    return searchTestsWithHttpInfoAsync(new SearchTestsOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * Search Synthetic tests.
 *
 * See {@link #searchTestsWithHttpInfo}.
 *
 * @param parameters Optional parameters for the request.
 * @return SyntheticsListTestsResponse
 * @throws ApiException if fails to make API call
 */
  public SyntheticsListTestsResponse searchTests(SearchTestsOptionalParameters parameters) throws ApiException {
    return searchTestsWithHttpInfo(parameters).getData();
  }

  /**
 * Search Synthetic tests.
 *
 * See {@link #searchTestsWithHttpInfoAsync}.
 *
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;SyntheticsListTestsResponse&gt;
 */
  public CompletableFuture<SyntheticsListTestsResponse>searchTestsAsync(SearchTestsOptionalParameters parameters) {
    return searchTestsWithHttpInfoAsync(parameters).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Search for Synthetic tests.</p>
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;SyntheticsListTestsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK - Returns the list of Synthetic tests matching the search. </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SyntheticsListTestsResponse> searchTestsWithHttpInfo(SearchTestsOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    String text = parameters.text;
    Boolean includeFullConfig = parameters.includeFullConfig;
    Boolean facetsOnly = parameters.facetsOnly;
    Long start = parameters.start;
    Long count = parameters.count;
    String sort = parameters.sort;
    // create path and map variables
    String localVarPath = "/api/v1/synthetics/tests/search";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "text", text));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include_full_config", includeFullConfig));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "facets_only", facetsOnly));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start", start));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "count", count));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));

    Invocation.Builder builder = apiClient.createBuilder("v1.SyntheticsApi.searchTests", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SyntheticsListTestsResponse>() {});
  }

  /**
   * Search Synthetic tests.
   *
   * See {@link #searchTestsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;SyntheticsListTestsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SyntheticsListTestsResponse>> searchTestsWithHttpInfoAsync(SearchTestsOptionalParameters parameters) {
    Object localVarPostBody = null;
    String text = parameters.text;
    Boolean includeFullConfig = parameters.includeFullConfig;
    Boolean facetsOnly = parameters.facetsOnly;
    Long start = parameters.start;
    Long count = parameters.count;
    String sort = parameters.sort;
    // create path and map variables
    String localVarPath = "/api/v1/synthetics/tests/search";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "text", text));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include_full_config", includeFullConfig));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "facets_only", facetsOnly));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start", start));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "count", count));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v1.SyntheticsApi.searchTests", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SyntheticsListTestsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SyntheticsListTestsResponse>() {});
  }

  /**
 * Trigger tests from CI/CD pipelines.
 *
 * See {@link #triggerCITestsWithHttpInfo}.
 *
 * @param body Details of the test to trigger. (required)
 * @return SyntheticsTriggerCITestsResponse
 * @throws ApiException if fails to make API call
 */
  public SyntheticsTriggerCITestsResponse  triggerCITests(SyntheticsCITestBody body) throws ApiException {
    return triggerCITestsWithHttpInfo(body).getData();
  }

  /**
 * Trigger tests from CI/CD pipelines.
 *
 * See {@link #triggerCITestsWithHttpInfoAsync}.
 *
 * @param body Details of the test to trigger. (required)
 * @return CompletableFuture&lt;SyntheticsTriggerCITestsResponse&gt;
 */
  public CompletableFuture<SyntheticsTriggerCITestsResponse>triggerCITestsAsync(SyntheticsCITestBody body) {
    return triggerCITestsWithHttpInfoAsync(body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Trigger a set of Synthetic tests for continuous integration.</p>
   *
   * @param body Details of the test to trigger. (required)
   * @return ApiResponse&lt;SyntheticsTriggerCITestsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> JSON format is wrong </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SyntheticsTriggerCITestsResponse> triggerCITestsWithHttpInfo(SyntheticsCITestBody body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling triggerCITests");
    }
    // create path and map variables
    String localVarPath = "/api/v1/synthetics/tests/trigger/ci";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v1.SyntheticsApi.triggerCITests", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SyntheticsTriggerCITestsResponse>() {});
  }

  /**
   * Trigger tests from CI/CD pipelines.
   *
   * See {@link #triggerCITestsWithHttpInfo}.
   *
   * @param body Details of the test to trigger. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SyntheticsTriggerCITestsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SyntheticsTriggerCITestsResponse>> triggerCITestsWithHttpInfoAsync(SyntheticsCITestBody body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<SyntheticsTriggerCITestsResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling triggerCITests"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/synthetics/tests/trigger/ci";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v1.SyntheticsApi.triggerCITests", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SyntheticsTriggerCITestsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SyntheticsTriggerCITestsResponse>() {});
  }

  /**
 * Trigger Synthetic tests.
 *
 * See {@link #triggerTestsWithHttpInfo}.
 *
 * @param body The identifiers of the tests to trigger. (required)
 * @return SyntheticsTriggerCITestsResponse
 * @throws ApiException if fails to make API call
 */
  public SyntheticsTriggerCITestsResponse  triggerTests(SyntheticsTriggerBody body) throws ApiException {
    return triggerTestsWithHttpInfo(body).getData();
  }

  /**
 * Trigger Synthetic tests.
 *
 * See {@link #triggerTestsWithHttpInfoAsync}.
 *
 * @param body The identifiers of the tests to trigger. (required)
 * @return CompletableFuture&lt;SyntheticsTriggerCITestsResponse&gt;
 */
  public CompletableFuture<SyntheticsTriggerCITestsResponse>triggerTestsAsync(SyntheticsTriggerBody body) {
    return triggerTestsWithHttpInfoAsync(body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Trigger a set of Synthetic tests.</p>
   *
   * @param body The identifiers of the tests to trigger. (required)
   * @return ApiResponse&lt;SyntheticsTriggerCITestsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SyntheticsTriggerCITestsResponse> triggerTestsWithHttpInfo(SyntheticsTriggerBody body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling triggerTests");
    }
    // create path and map variables
    String localVarPath = "/api/v1/synthetics/tests/trigger";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v1.SyntheticsApi.triggerTests", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SyntheticsTriggerCITestsResponse>() {});
  }

  /**
   * Trigger Synthetic tests.
   *
   * See {@link #triggerTestsWithHttpInfo}.
   *
   * @param body The identifiers of the tests to trigger. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SyntheticsTriggerCITestsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SyntheticsTriggerCITestsResponse>> triggerTestsWithHttpInfoAsync(SyntheticsTriggerBody body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<SyntheticsTriggerCITestsResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling triggerTests"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/synthetics/tests/trigger";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v1.SyntheticsApi.triggerTests", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SyntheticsTriggerCITestsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SyntheticsTriggerCITestsResponse>() {});
  }

  /**
 * Edit an API test.
 *
 * See {@link #updateAPITestWithHttpInfo}.
 *
 * @param publicId The public ID of the test to get details from. (required)
 * @param body New test details to be saved. (required)
 * @return SyntheticsAPITest
 * @throws ApiException if fails to make API call
 */
  public SyntheticsAPITest  updateAPITest(String publicId, SyntheticsAPITest body) throws ApiException {
    return updateAPITestWithHttpInfo(publicId, body).getData();
  }

  /**
 * Edit an API test.
 *
 * See {@link #updateAPITestWithHttpInfoAsync}.
 *
 * @param publicId The public ID of the test to get details from. (required)
 * @param body New test details to be saved. (required)
 * @return CompletableFuture&lt;SyntheticsAPITest&gt;
 */
  public CompletableFuture<SyntheticsAPITest>updateAPITestAsync(String publicId, SyntheticsAPITest body) {
    return updateAPITestWithHttpInfoAsync(publicId, body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Edit the configuration of a Synthetic API test.</p>
   *
   * @param publicId The public ID of the test to get details from. (required)
   * @param body New test details to be saved. (required)
   * @return ApiResponse&lt;SyntheticsAPITest&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> - JSON format is wrong - Updating sub-type is forbidden </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> - Synthetic Monitoring is not activated for the user - Test is not owned by the user - Test can&#39;t be found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SyntheticsAPITest> updateAPITestWithHttpInfo(String publicId, SyntheticsAPITest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'publicId' is set
    if (publicId == null) {
      throw new ApiException(400, "Missing the required parameter 'publicId' when calling updateAPITest");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateAPITest");
    }
    // create path and map variables
    String localVarPath = "/api/v1/synthetics/tests/api/{public_id}"
      .replaceAll("\\{" + "public_id" + "\\}", apiClient.escapeString(publicId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v1.SyntheticsApi.updateAPITest", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("PUT", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SyntheticsAPITest>() {});
  }

  /**
   * Edit an API test.
   *
   * See {@link #updateAPITestWithHttpInfo}.
   *
   * @param publicId The public ID of the test to get details from. (required)
   * @param body New test details to be saved. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SyntheticsAPITest&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SyntheticsAPITest>> updateAPITestWithHttpInfoAsync(String publicId, SyntheticsAPITest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'publicId' is set
    if (publicId == null) {
        CompletableFuture<ApiResponse<SyntheticsAPITest>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'publicId' when calling updateAPITest"));
        return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<SyntheticsAPITest>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling updateAPITest"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/synthetics/tests/api/{public_id}"
      .replaceAll("\\{" + "public_id" + "\\}", apiClient.escapeString(publicId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v1.SyntheticsApi.updateAPITest", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SyntheticsAPITest>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("PUT", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SyntheticsAPITest>() {});
  }

  /**
 * Edit a browser test.
 *
 * See {@link #updateBrowserTestWithHttpInfo}.
 *
 * @param publicId The public ID of the test to edit. (required)
 * @param body New test details to be saved. (required)
 * @return SyntheticsBrowserTest
 * @throws ApiException if fails to make API call
 */
  public SyntheticsBrowserTest  updateBrowserTest(String publicId, SyntheticsBrowserTest body) throws ApiException {
    return updateBrowserTestWithHttpInfo(publicId, body).getData();
  }

  /**
 * Edit a browser test.
 *
 * See {@link #updateBrowserTestWithHttpInfoAsync}.
 *
 * @param publicId The public ID of the test to edit. (required)
 * @param body New test details to be saved. (required)
 * @return CompletableFuture&lt;SyntheticsBrowserTest&gt;
 */
  public CompletableFuture<SyntheticsBrowserTest>updateBrowserTestAsync(String publicId, SyntheticsBrowserTest body) {
    return updateBrowserTestWithHttpInfoAsync(publicId, body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Edit the configuration of a Synthetic browser test.</p>
   *
   * @param publicId The public ID of the test to edit. (required)
   * @param body New test details to be saved. (required)
   * @return ApiResponse&lt;SyntheticsBrowserTest&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> - JSON format is wrong - Updating sub-type is forbidden </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> - Synthetic Monitoring is not activated for the user - Test is not owned by the user - Test can&#39;t be found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SyntheticsBrowserTest> updateBrowserTestWithHttpInfo(String publicId, SyntheticsBrowserTest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'publicId' is set
    if (publicId == null) {
      throw new ApiException(400, "Missing the required parameter 'publicId' when calling updateBrowserTest");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateBrowserTest");
    }
    // create path and map variables
    String localVarPath = "/api/v1/synthetics/tests/browser/{public_id}"
      .replaceAll("\\{" + "public_id" + "\\}", apiClient.escapeString(publicId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v1.SyntheticsApi.updateBrowserTest", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("PUT", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SyntheticsBrowserTest>() {});
  }

  /**
   * Edit a browser test.
   *
   * See {@link #updateBrowserTestWithHttpInfo}.
   *
   * @param publicId The public ID of the test to edit. (required)
   * @param body New test details to be saved. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SyntheticsBrowserTest&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SyntheticsBrowserTest>> updateBrowserTestWithHttpInfoAsync(String publicId, SyntheticsBrowserTest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'publicId' is set
    if (publicId == null) {
        CompletableFuture<ApiResponse<SyntheticsBrowserTest>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'publicId' when calling updateBrowserTest"));
        return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<SyntheticsBrowserTest>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling updateBrowserTest"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/synthetics/tests/browser/{public_id}"
      .replaceAll("\\{" + "public_id" + "\\}", apiClient.escapeString(publicId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v1.SyntheticsApi.updateBrowserTest", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SyntheticsBrowserTest>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("PUT", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SyntheticsBrowserTest>() {});
  }

  /**
 * Edit a mobile test.
 *
 * See {@link #updateMobileTestWithHttpInfo}.
 *
 * @param publicId The public ID of the test to get details from. (required)
 * @param body New test details to be saved. (required)
 * @return SyntheticsMobileTest
 * @throws ApiException if fails to make API call
 */
  public SyntheticsMobileTest  updateMobileTest(String publicId, SyntheticsMobileTest body) throws ApiException {
    return updateMobileTestWithHttpInfo(publicId, body).getData();
  }

  /**
 * Edit a mobile test.
 *
 * See {@link #updateMobileTestWithHttpInfoAsync}.
 *
 * @param publicId The public ID of the test to get details from. (required)
 * @param body New test details to be saved. (required)
 * @return CompletableFuture&lt;SyntheticsMobileTest&gt;
 */
  public CompletableFuture<SyntheticsMobileTest>updateMobileTestAsync(String publicId, SyntheticsMobileTest body) {
    return updateMobileTestWithHttpInfoAsync(publicId, body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Edit the configuration of a Synthetic mobile test.</p>
   *
   * @param publicId The public ID of the test to get details from. (required)
   * @param body New test details to be saved. (required)
   * @return ApiResponse&lt;SyntheticsMobileTest&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> - JSON format is wrong - Updating sub-type is forbidden </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> - Synthetic Monitoring is not activated for the user - Test is not owned by the user - Test can&#39;t be found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SyntheticsMobileTest> updateMobileTestWithHttpInfo(String publicId, SyntheticsMobileTest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'publicId' is set
    if (publicId == null) {
      throw new ApiException(400, "Missing the required parameter 'publicId' when calling updateMobileTest");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateMobileTest");
    }
    // create path and map variables
    String localVarPath = "/api/v1/synthetics/tests/mobile/{public_id}"
      .replaceAll("\\{" + "public_id" + "\\}", apiClient.escapeString(publicId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v1.SyntheticsApi.updateMobileTest", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("PUT", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SyntheticsMobileTest>() {});
  }

  /**
   * Edit a mobile test.
   *
   * See {@link #updateMobileTestWithHttpInfo}.
   *
   * @param publicId The public ID of the test to get details from. (required)
   * @param body New test details to be saved. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SyntheticsMobileTest&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SyntheticsMobileTest>> updateMobileTestWithHttpInfoAsync(String publicId, SyntheticsMobileTest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'publicId' is set
    if (publicId == null) {
        CompletableFuture<ApiResponse<SyntheticsMobileTest>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'publicId' when calling updateMobileTest"));
        return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<SyntheticsMobileTest>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling updateMobileTest"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/synthetics/tests/mobile/{public_id}"
      .replaceAll("\\{" + "public_id" + "\\}", apiClient.escapeString(publicId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v1.SyntheticsApi.updateMobileTest", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SyntheticsMobileTest>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("PUT", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SyntheticsMobileTest>() {});
  }

  /**
 * Edit a private location.
 *
 * See {@link #updatePrivateLocationWithHttpInfo}.
 *
 * @param locationId The ID of the private location. (required)
 * @param body Details of the private location to be updated. (required)
 * @return SyntheticsPrivateLocation
 * @throws ApiException if fails to make API call
 */
  public SyntheticsPrivateLocation  updatePrivateLocation(String locationId, SyntheticsPrivateLocation body) throws ApiException {
    return updatePrivateLocationWithHttpInfo(locationId, body).getData();
  }

  /**
 * Edit a private location.
 *
 * See {@link #updatePrivateLocationWithHttpInfoAsync}.
 *
 * @param locationId The ID of the private location. (required)
 * @param body Details of the private location to be updated. (required)
 * @return CompletableFuture&lt;SyntheticsPrivateLocation&gt;
 */
  public CompletableFuture<SyntheticsPrivateLocation>updatePrivateLocationAsync(String locationId, SyntheticsPrivateLocation body) {
    return updatePrivateLocationWithHttpInfoAsync(locationId, body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Edit a Synthetic private location.</p>
   *
   * @param locationId The ID of the private location. (required)
   * @param body Details of the private location to be updated. (required)
   * @return ApiResponse&lt;SyntheticsPrivateLocation&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> - Private locations are not activated for the user - Private location does not exist </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SyntheticsPrivateLocation> updatePrivateLocationWithHttpInfo(String locationId, SyntheticsPrivateLocation body) throws ApiException {
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

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v1.SyntheticsApi.updatePrivateLocation", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("PUT", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SyntheticsPrivateLocation>() {});
  }

  /**
   * Edit a private location.
   *
   * See {@link #updatePrivateLocationWithHttpInfo}.
   *
   * @param locationId The ID of the private location. (required)
   * @param body Details of the private location to be updated. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SyntheticsPrivateLocation&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SyntheticsPrivateLocation>> updatePrivateLocationWithHttpInfoAsync(String locationId, SyntheticsPrivateLocation body) {
    Object localVarPostBody = body;

    // verify the required parameter 'locationId' is set
    if (locationId == null) {
        CompletableFuture<ApiResponse<SyntheticsPrivateLocation>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'locationId' when calling updatePrivateLocation"));
        return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<SyntheticsPrivateLocation>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling updatePrivateLocation"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/synthetics/private-locations/{location_id}"
      .replaceAll("\\{" + "location_id" + "\\}", apiClient.escapeString(locationId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v1.SyntheticsApi.updatePrivateLocation", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SyntheticsPrivateLocation>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("PUT", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SyntheticsPrivateLocation>() {});
  }

  /**
 * Pause or start a test.
 *
 * See {@link #updateTestPauseStatusWithHttpInfo}.
 *
 * @param publicId The public ID of the Synthetic test to update. (required)
 * @param body Status to set the given Synthetic test to. (required)
 * @return Boolean
 * @throws ApiException if fails to make API call
 */
  public Boolean  updateTestPauseStatus(String publicId, SyntheticsUpdateTestPauseStatusPayload body) throws ApiException {
    return updateTestPauseStatusWithHttpInfo(publicId, body).getData();
  }

  /**
 * Pause or start a test.
 *
 * See {@link #updateTestPauseStatusWithHttpInfoAsync}.
 *
 * @param publicId The public ID of the Synthetic test to update. (required)
 * @param body Status to set the given Synthetic test to. (required)
 * @return CompletableFuture&lt;Boolean&gt;
 */
  public CompletableFuture<Boolean>updateTestPauseStatusAsync(String publicId, SyntheticsUpdateTestPauseStatusPayload body) {
    return updateTestPauseStatusWithHttpInfoAsync(publicId, body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Pause or start a Synthetic test by changing the status.</p>
   *
   * @param publicId The public ID of the Synthetic test to update. (required)
   * @param body Status to set the given Synthetic test to. (required)
   * @return ApiResponse&lt;Boolean&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK - Returns a boolean indicating if the update was successful. </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> JSON format is wrong. </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> - Synthetic Monitoring is not activated for the user - Test is not owned by the user </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Boolean> updateTestPauseStatusWithHttpInfo(String publicId, SyntheticsUpdateTestPauseStatusPayload body) throws ApiException {
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

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v1.SyntheticsApi.updateTestPauseStatus", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("PUT", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<Boolean>() {});
  }

  /**
   * Pause or start a test.
   *
   * See {@link #updateTestPauseStatusWithHttpInfo}.
   *
   * @param publicId The public ID of the Synthetic test to update. (required)
   * @param body Status to set the given Synthetic test to. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Boolean&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Boolean>> updateTestPauseStatusWithHttpInfoAsync(String publicId, SyntheticsUpdateTestPauseStatusPayload body) {
    Object localVarPostBody = body;

    // verify the required parameter 'publicId' is set
    if (publicId == null) {
        CompletableFuture<ApiResponse<Boolean>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'publicId' when calling updateTestPauseStatus"));
        return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<Boolean>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling updateTestPauseStatus"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/synthetics/tests/{public_id}/status"
      .replaceAll("\\{" + "public_id" + "\\}", apiClient.escapeString(publicId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v1.SyntheticsApi.updateTestPauseStatus", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Boolean>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("PUT", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<Boolean>() {});
  }
}