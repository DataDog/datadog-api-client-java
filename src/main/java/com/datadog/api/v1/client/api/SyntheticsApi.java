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
import javax.ws.rs.client.Invocation;
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

  /**
   * Create a global variable
   *
   * <p>See {@link #createGlobalVariableWithHttpInfoAsync}.
   *
   * @param body Details of the global variable to create. (required)
   * @return CompletableFuture&lt;SyntheticsGlobalVariable&gt;
   */
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "SyntheticsApi.createGlobalVariable",
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
        new GenericType<SyntheticsGlobalVariable>() {});
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "createGlobalVariable");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "SyntheticsApi.createGlobalVariable",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SyntheticsGlobalVariable>> result = new CompletableFuture<>();
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
        new GenericType<SyntheticsGlobalVariable>() {});
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

  /**
   * Create a private location
   *
   * <p>See {@link #createPrivateLocationWithHttpInfoAsync}.
   *
   * @param body Details of the private location to create. (required)
   * @return CompletableFuture&lt;SyntheticsPrivateLocationCreationResponse&gt;
   */
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "SyntheticsApi.createPrivateLocation",
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
        new GenericType<SyntheticsPrivateLocationCreationResponse>() {});
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "createPrivateLocation");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "SyntheticsApi.createPrivateLocation",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SyntheticsPrivateLocationCreationResponse>> result =
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
        new GenericType<SyntheticsPrivateLocationCreationResponse>() {});
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

  /**
   * Create an API test
   *
   * <p>See {@link #createSyntheticsAPITestWithHttpInfoAsync}.
   *
   * @param body Details of the test to create. (required)
   * @return CompletableFuture&lt;SyntheticsAPITest&gt;
   */
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "SyntheticsApi.createSyntheticsAPITest",
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
        new GenericType<SyntheticsAPITest>() {});
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "createSyntheticsAPITest");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "SyntheticsApi.createSyntheticsAPITest",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SyntheticsAPITest>> result = new CompletableFuture<>();
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
        new GenericType<SyntheticsAPITest>() {});
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

  /**
   * Create a browser test
   *
   * <p>See {@link #createSyntheticsBrowserTestWithHttpInfoAsync}.
   *
   * @param body Details of the test to create. (required)
   * @return CompletableFuture&lt;SyntheticsBrowserTest&gt;
   */
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "SyntheticsApi.createSyntheticsBrowserTest",
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
        new GenericType<SyntheticsBrowserTest>() {});
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "createSyntheticsBrowserTest");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "SyntheticsApi.createSyntheticsBrowserTest",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SyntheticsBrowserTest>> result = new CompletableFuture<>();
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
        new GenericType<SyntheticsBrowserTest>() {});
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

  /**
   * Delete a global variable
   *
   * <p>See {@link #deleteGlobalVariableWithHttpInfoAsync}.
   *
   * @param variableId The ID of the global variable. (required)
   */
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "SyntheticsApi.deleteGlobalVariable",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "deleteGlobalVariable");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "SyntheticsApi.deleteGlobalVariable",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
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

  /**
   * Delete a private location
   *
   * <p>See {@link #deletePrivateLocationWithHttpInfoAsync}.
   *
   * @param locationId The ID of the private location. (required)
   */
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "SyntheticsApi.deletePrivateLocation",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "deletePrivateLocation");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "SyntheticsApi.deletePrivateLocation",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
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

  /**
   * Delete tests
   *
   * <p>See {@link #deleteTestsWithHttpInfoAsync}.
   *
   * @param body Public ID list of the Synthetic tests to be deleted. (required)
   * @return CompletableFuture&lt;SyntheticsDeleteTestsResponse&gt;
   */
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "SyntheticsApi.deleteTests",
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
        new GenericType<SyntheticsDeleteTestsResponse>() {});
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "deleteTests");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "SyntheticsApi.deleteTests",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SyntheticsDeleteTestsResponse>> result =
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
        new GenericType<SyntheticsDeleteTestsResponse>() {});
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

  /**
   * Edit a global variable
   *
   * <p>See {@link #editGlobalVariableWithHttpInfoAsync}.
   *
   * @param variableId The ID of the global variable. (required)
   * @param body Details of the global variable to update. (required)
   * @return CompletableFuture&lt;SyntheticsGlobalVariable&gt;
   */
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "SyntheticsApi.editGlobalVariable",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "PUT",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<SyntheticsGlobalVariable>() {});
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "editGlobalVariable");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "SyntheticsApi.editGlobalVariable",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SyntheticsGlobalVariable>> result = new CompletableFuture<>();
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
        new GenericType<SyntheticsGlobalVariable>() {});
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

  /**
   * Get an API test
   *
   * <p>See {@link #getAPITestWithHttpInfoAsync}.
   *
   * @param publicId The public ID of the test to get details from. (required)
   * @return CompletableFuture&lt;SyntheticsAPITest&gt;
   */
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "SyntheticsApi.getAPITest",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<SyntheticsAPITest>() {});
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getAPITest");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "SyntheticsApi.getAPITest",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SyntheticsAPITest>> result = new CompletableFuture<>();
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
        new GenericType<SyntheticsAPITest>() {});
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
   * <p>See {@link #getAPITestLatestResultsWithHttpInfoAsync}.
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

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "from_ts", fromTs));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "to_ts", toTs));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "probe_dc", probeDc));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "SyntheticsApi.getAPITestLatestResults",
            localVarPath,
            localVarQueryParams,
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<SyntheticsGetAPITestLatestResultsResponse>() {});
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

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "from_ts", fromTs));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "to_ts", toTs));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "probe_dc", probeDc));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getAPITestLatestResults");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "SyntheticsApi.getAPITestLatestResults",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SyntheticsGetAPITestLatestResultsResponse>> result =
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
        new GenericType<SyntheticsGetAPITestLatestResultsResponse>() {});
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

  /**
   * Get an API test result
   *
   * <p>See {@link #getAPITestResultWithHttpInfoAsync}.
   *
   * @param publicId The public ID of the API test to which the target result belongs. (required)
   * @param resultId The ID of the result to get. (required)
   * @return CompletableFuture&lt;SyntheticsAPITestResultFull&gt;
   */
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "SyntheticsApi.getAPITestResult",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<SyntheticsAPITestResultFull>() {});
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getAPITestResult");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "SyntheticsApi.getAPITestResult",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SyntheticsAPITestResultFull>> result =
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
        new GenericType<SyntheticsAPITestResultFull>() {});
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

  /**
   * Get a browser test
   *
   * <p>See {@link #getBrowserTestWithHttpInfoAsync}.
   *
   * @param publicId The public ID of the test to get details from. (required)
   * @return CompletableFuture&lt;SyntheticsBrowserTest&gt;
   */
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "SyntheticsApi.getBrowserTest",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<SyntheticsBrowserTest>() {});
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getBrowserTest");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "SyntheticsApi.getBrowserTest",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SyntheticsBrowserTest>> result = new CompletableFuture<>();
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
        new GenericType<SyntheticsBrowserTest>() {});
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
   * <p>See {@link #getBrowserTestLatestResultsWithHttpInfoAsync}.
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

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "from_ts", fromTs));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "to_ts", toTs));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "probe_dc", probeDc));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "SyntheticsApi.getBrowserTestLatestResults",
            localVarPath,
            localVarQueryParams,
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<SyntheticsGetBrowserTestLatestResultsResponse>() {});
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

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "from_ts", fromTs));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "to_ts", toTs));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "probe_dc", probeDc));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getBrowserTestLatestResults");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "SyntheticsApi.getBrowserTestLatestResults",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SyntheticsGetBrowserTestLatestResultsResponse>> result =
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
        new GenericType<SyntheticsGetBrowserTestLatestResultsResponse>() {});
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

  /**
   * Get a browser test result
   *
   * <p>See {@link #getBrowserTestResultWithHttpInfoAsync}.
   *
   * @param publicId The public ID of the browser test to which the target result belongs.
   *     (required)
   * @param resultId The ID of the result to get. (required)
   * @return CompletableFuture&lt;SyntheticsBrowserTestResultFull&gt;
   */
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "SyntheticsApi.getBrowserTestResult",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<SyntheticsBrowserTestResultFull>() {});
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getBrowserTestResult");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "SyntheticsApi.getBrowserTestResult",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SyntheticsBrowserTestResultFull>> result =
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
        new GenericType<SyntheticsBrowserTestResultFull>() {});
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

  /**
   * Get a global variable
   *
   * <p>See {@link #getGlobalVariableWithHttpInfoAsync}.
   *
   * @param variableId The ID of the global variable. (required)
   * @return CompletableFuture&lt;SyntheticsGlobalVariable&gt;
   */
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "SyntheticsApi.getGlobalVariable",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<SyntheticsGlobalVariable>() {});
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getGlobalVariable");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "SyntheticsApi.getGlobalVariable",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SyntheticsGlobalVariable>> result = new CompletableFuture<>();
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
        new GenericType<SyntheticsGlobalVariable>() {});
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

  /**
   * Get a private location
   *
   * <p>See {@link #getPrivateLocationWithHttpInfoAsync}.
   *
   * @param locationId The ID of the private location. (required)
   * @return CompletableFuture&lt;SyntheticsPrivateLocation&gt;
   */
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "SyntheticsApi.getPrivateLocation",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<SyntheticsPrivateLocation>() {});
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getPrivateLocation");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "SyntheticsApi.getPrivateLocation",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SyntheticsPrivateLocation>> result = new CompletableFuture<>();
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
        new GenericType<SyntheticsPrivateLocation>() {});
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

  /**
   * Get details of batch
   *
   * <p>See {@link #getSyntheticsCIBatchWithHttpInfoAsync}.
   *
   * @param batchId The ID of the batch. (required)
   * @return CompletableFuture&lt;SyntheticsBatchDetails&gt;
   */
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "SyntheticsApi.getSyntheticsCIBatch",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<SyntheticsBatchDetails>() {});
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getSyntheticsCIBatch");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "SyntheticsApi.getSyntheticsCIBatch",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SyntheticsBatchDetails>> result = new CompletableFuture<>();
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
        new GenericType<SyntheticsBatchDetails>() {});
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

  /**
   * Get a test configuration
   *
   * <p>See {@link #getTestWithHttpInfoAsync}.
   *
   * @param publicId The public ID of the test to get details from. (required)
   * @return CompletableFuture&lt;SyntheticsTestDetails&gt;
   */
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "SyntheticsApi.getTest",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<SyntheticsTestDetails>() {});
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getTest");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "SyntheticsApi.getTest",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SyntheticsTestDetails>> result = new CompletableFuture<>();
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
        new GenericType<SyntheticsTestDetails>() {});
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

  /**
   * Get all global variables
   *
   * <p>See {@link #listGlobalVariablesWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;SyntheticsListGlobalVariablesResponse&gt;
   */
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "SyntheticsApi.listGlobalVariables",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<SyntheticsListGlobalVariablesResponse>() {});
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listGlobalVariables");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "SyntheticsApi.listGlobalVariables",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SyntheticsListGlobalVariablesResponse>> result =
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
        new GenericType<SyntheticsListGlobalVariablesResponse>() {});
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

  /**
   * Get all locations (public and private)
   *
   * <p>See {@link #listLocationsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;SyntheticsLocations&gt;
   */
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "SyntheticsApi.listLocations",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<SyntheticsLocations>() {});
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listLocations");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "SyntheticsApi.listLocations",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SyntheticsLocations>> result = new CompletableFuture<>();
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
        new GenericType<SyntheticsLocations>() {});
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

  /**
   * Get the list of all tests
   *
   * <p>See {@link #listTestsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;SyntheticsListTestsResponse&gt;
   */
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "SyntheticsApi.listTests",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<SyntheticsListTestsResponse>() {});
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listTests");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "SyntheticsApi.listTests",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SyntheticsListTestsResponse>> result =
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
        new GenericType<SyntheticsListTestsResponse>() {});
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

  /**
   * Trigger tests from CI/CD pipelines
   *
   * <p>See {@link #triggerCITestsWithHttpInfoAsync}.
   *
   * @param body Details of the test to trigger. (required)
   * @return CompletableFuture&lt;SyntheticsTriggerCITestsResponse&gt;
   */
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "SyntheticsApi.triggerCITests",
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
        new GenericType<SyntheticsTriggerCITestsResponse>() {});
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "triggerCITests");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "SyntheticsApi.triggerCITests",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SyntheticsTriggerCITestsResponse>> result =
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
        new GenericType<SyntheticsTriggerCITestsResponse>() {});
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

  /**
   * Trigger Synthetics tests
   *
   * <p>See {@link #triggerTestsWithHttpInfoAsync}.
   *
   * @param body The identifiers of the tests to trigger. (required)
   * @return CompletableFuture&lt;SyntheticsTriggerCITestsResponse&gt;
   */
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "SyntheticsApi.triggerTests",
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
        new GenericType<SyntheticsTriggerCITestsResponse>() {});
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "triggerTests");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "SyntheticsApi.triggerTests",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SyntheticsTriggerCITestsResponse>> result =
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
        new GenericType<SyntheticsTriggerCITestsResponse>() {});
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

  /**
   * Edit an API test
   *
   * <p>See {@link #updateAPITestWithHttpInfoAsync}.
   *
   * @param publicId The public ID of the test to get details from. (required)
   * @param body New test details to be saved. (required)
   * @return CompletableFuture&lt;SyntheticsAPITest&gt;
   */
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "SyntheticsApi.updateAPITest",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "PUT",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<SyntheticsAPITest>() {});
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "updateAPITest");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "SyntheticsApi.updateAPITest",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SyntheticsAPITest>> result = new CompletableFuture<>();
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
        new GenericType<SyntheticsAPITest>() {});
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

  /**
   * Edit a browser test
   *
   * <p>See {@link #updateBrowserTestWithHttpInfoAsync}.
   *
   * @param publicId The public ID of the test to get details from. (required)
   * @param body New test details to be saved. (required)
   * @return CompletableFuture&lt;SyntheticsBrowserTest&gt;
   */
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "SyntheticsApi.updateBrowserTest",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "PUT",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<SyntheticsBrowserTest>() {});
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "updateBrowserTest");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "SyntheticsApi.updateBrowserTest",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SyntheticsBrowserTest>> result = new CompletableFuture<>();
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
        new GenericType<SyntheticsBrowserTest>() {});
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

  /**
   * Edit a private location
   *
   * <p>See {@link #updatePrivateLocationWithHttpInfoAsync}.
   *
   * @param locationId The ID of the private location. (required)
   * @param body Details of the private location to be updated. (required)
   * @return CompletableFuture&lt;SyntheticsPrivateLocation&gt;
   */
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "SyntheticsApi.updatePrivateLocation",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "PUT",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<SyntheticsPrivateLocation>() {});
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "updatePrivateLocation");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "SyntheticsApi.updatePrivateLocation",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SyntheticsPrivateLocation>> result = new CompletableFuture<>();
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
        new GenericType<SyntheticsPrivateLocation>() {});
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

  /**
   * Pause or start a test
   *
   * <p>See {@link #updateTestPauseStatusWithHttpInfoAsync}.
   *
   * @param publicId The public ID of the Synthetic test to update. (required)
   * @param body Status to set the given Synthetic test to. (required)
   * @return CompletableFuture&lt;Boolean&gt;
   */
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "SyntheticsApi.updateTestPauseStatus",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "PUT",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<Boolean>() {});
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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "updateTestPauseStatus");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "SyntheticsApi.updateTestPauseStatus",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Boolean>> result = new CompletableFuture<>();
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
        new GenericType<Boolean>() {});
  }
}
