package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.OnPremManagementServiceCreateEnrollmentRequest;
import com.datadog.api.client.v2.model.OnPremManagementServiceCreateEnrollmentResponse;
import com.datadog.api.client.v2.model.OnPremManagementServiceGetEnrollmentResponse;
import com.datadog.api.client.v2.model.OnPremManagementServiceRegisterTokenRequest;
import com.datadog.api.client.v2.model.OnPremManagementServiceRegisterTokenResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class OnPremManagementServiceApi {
  private ApiClient apiClient;

  public OnPremManagementServiceApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public OnPremManagementServiceApi(ApiClient apiClient) {
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
   * Create an enrollment.
   *
   * <p>See {@link #createOnPremManagementServiceEnrollmentWithHttpInfo}.
   *
   * @param body (required)
   * @return OnPremManagementServiceCreateEnrollmentResponse
   * @throws ApiException if fails to make API call
   */
  public OnPremManagementServiceCreateEnrollmentResponse createOnPremManagementServiceEnrollment(
      OnPremManagementServiceCreateEnrollmentRequest body) throws ApiException {
    return createOnPremManagementServiceEnrollmentWithHttpInfo(body).getData();
  }

  /**
   * Create an enrollment.
   *
   * <p>See {@link #createOnPremManagementServiceEnrollmentWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;OnPremManagementServiceCreateEnrollmentResponse&gt;
   */
  public CompletableFuture<OnPremManagementServiceCreateEnrollmentResponse>
      createOnPremManagementServiceEnrollmentAsync(
          OnPremManagementServiceCreateEnrollmentRequest body) {
    return createOnPremManagementServiceEnrollmentWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a new enrollment for an on-prem runner. This endpoint initiates the enrollment process
   * and returns a token that the runner will use to complete the enrollment.
   *
   * @param body (required)
   * @return ApiResponse&lt;OnPremManagementServiceCreateEnrollmentResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<OnPremManagementServiceCreateEnrollmentResponse>
      createOnPremManagementServiceEnrollmentWithHttpInfo(
          OnPremManagementServiceCreateEnrollmentRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createOnPremManagementServiceEnrollment";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'body' when calling"
              + " createOnPremManagementServiceEnrollment");
    }
    // create path and map variables
    String localVarPath = "/api/v2/on-prem-management-service/enrollments";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.OnPremManagementServiceApi.createOnPremManagementServiceEnrollment",
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
        new GenericType<OnPremManagementServiceCreateEnrollmentResponse>() {});
  }

  /**
   * Create an enrollment.
   *
   * <p>See {@link #createOnPremManagementServiceEnrollmentWithHttpInfo}.
   *
   * @param body (required)
   * @return
   *     CompletableFuture&lt;ApiResponse&lt;OnPremManagementServiceCreateEnrollmentResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<OnPremManagementServiceCreateEnrollmentResponse>>
      createOnPremManagementServiceEnrollmentWithHttpInfoAsync(
          OnPremManagementServiceCreateEnrollmentRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createOnPremManagementServiceEnrollment";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<OnPremManagementServiceCreateEnrollmentResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<OnPremManagementServiceCreateEnrollmentResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " createOnPremManagementServiceEnrollment"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/on-prem-management-service/enrollments";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.OnPremManagementServiceApi.createOnPremManagementServiceEnrollment",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<OnPremManagementServiceCreateEnrollmentResponse>> result =
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
        new GenericType<OnPremManagementServiceCreateEnrollmentResponse>() {});
  }

  /**
   * Get enrollment status.
   *
   * <p>See {@link #getOnPremManagementServiceEnrollmentWithHttpInfo}.
   *
   * @param tokenHash The enrollment token hash. (required)
   * @return OnPremManagementServiceGetEnrollmentResponse
   * @throws ApiException if fails to make API call
   */
  public OnPremManagementServiceGetEnrollmentResponse getOnPremManagementServiceEnrollment(
      String tokenHash) throws ApiException {
    return getOnPremManagementServiceEnrollmentWithHttpInfo(tokenHash).getData();
  }

  /**
   * Get enrollment status.
   *
   * <p>See {@link #getOnPremManagementServiceEnrollmentWithHttpInfoAsync}.
   *
   * @param tokenHash The enrollment token hash. (required)
   * @return CompletableFuture&lt;OnPremManagementServiceGetEnrollmentResponse&gt;
   */
  public CompletableFuture<OnPremManagementServiceGetEnrollmentResponse>
      getOnPremManagementServiceEnrollmentAsync(String tokenHash) {
    return getOnPremManagementServiceEnrollmentWithHttpInfoAsync(tokenHash)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the status of an enrollment for an on-prem runner using the enrollment token hash.
   *
   * @param tokenHash The enrollment token hash. (required)
   * @return ApiResponse&lt;OnPremManagementServiceGetEnrollmentResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<OnPremManagementServiceGetEnrollmentResponse>
      getOnPremManagementServiceEnrollmentWithHttpInfo(String tokenHash) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getOnPremManagementServiceEnrollment";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'tokenHash' is set
    if (tokenHash == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'tokenHash' when calling"
              + " getOnPremManagementServiceEnrollment");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/on-prem-management-service/enrollments/{token_hash}"
            .replaceAll("\\{" + "token_hash" + "\\}", apiClient.escapeString(tokenHash.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.OnPremManagementServiceApi.getOnPremManagementServiceEnrollment",
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
        new GenericType<OnPremManagementServiceGetEnrollmentResponse>() {});
  }

  /**
   * Get enrollment status.
   *
   * <p>See {@link #getOnPremManagementServiceEnrollmentWithHttpInfo}.
   *
   * @param tokenHash The enrollment token hash. (required)
   * @return
   *     CompletableFuture&lt;ApiResponse&lt;OnPremManagementServiceGetEnrollmentResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<OnPremManagementServiceGetEnrollmentResponse>>
      getOnPremManagementServiceEnrollmentWithHttpInfoAsync(String tokenHash) {
    // Check if unstable operation is enabled
    String operationId = "getOnPremManagementServiceEnrollment";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<OnPremManagementServiceGetEnrollmentResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'tokenHash' is set
    if (tokenHash == null) {
      CompletableFuture<ApiResponse<OnPremManagementServiceGetEnrollmentResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'tokenHash' when calling"
                  + " getOnPremManagementServiceEnrollment"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/on-prem-management-service/enrollments/{token_hash}"
            .replaceAll("\\{" + "token_hash" + "\\}", apiClient.escapeString(tokenHash.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.OnPremManagementServiceApi.getOnPremManagementServiceEnrollment",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<OnPremManagementServiceGetEnrollmentResponse>> result =
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
        new GenericType<OnPremManagementServiceGetEnrollmentResponse>() {});
  }

  /**
   * Register a token.
   *
   * <p>See {@link #registerOnPremManagementServiceTokenWithHttpInfo}.
   *
   * @param body (required)
   * @return OnPremManagementServiceRegisterTokenResponse
   * @throws ApiException if fails to make API call
   */
  public OnPremManagementServiceRegisterTokenResponse registerOnPremManagementServiceToken(
      OnPremManagementServiceRegisterTokenRequest body) throws ApiException {
    return registerOnPremManagementServiceTokenWithHttpInfo(body).getData();
  }

  /**
   * Register a token.
   *
   * <p>See {@link #registerOnPremManagementServiceTokenWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;OnPremManagementServiceRegisterTokenResponse&gt;
   */
  public CompletableFuture<OnPremManagementServiceRegisterTokenResponse>
      registerOnPremManagementServiceTokenAsync(OnPremManagementServiceRegisterTokenRequest body) {
    return registerOnPremManagementServiceTokenWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Register a token for query execution. This endpoint allows an on-prem runner to register a
   * token that will be used to execute queries on a specific connection.
   *
   * @param body (required)
   * @return ApiResponse&lt;OnPremManagementServiceRegisterTokenResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<OnPremManagementServiceRegisterTokenResponse>
      registerOnPremManagementServiceTokenWithHttpInfo(
          OnPremManagementServiceRegisterTokenRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "registerOnPremManagementServiceToken";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'body' when calling"
              + " registerOnPremManagementServiceToken");
    }
    // create path and map variables
    String localVarPath = "/api/v2/on-prem-management-service/tokens/register";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.OnPremManagementServiceApi.registerOnPremManagementServiceToken",
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
        new GenericType<OnPremManagementServiceRegisterTokenResponse>() {});
  }

  /**
   * Register a token.
   *
   * <p>See {@link #registerOnPremManagementServiceTokenWithHttpInfo}.
   *
   * @param body (required)
   * @return
   *     CompletableFuture&lt;ApiResponse&lt;OnPremManagementServiceRegisterTokenResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<OnPremManagementServiceRegisterTokenResponse>>
      registerOnPremManagementServiceTokenWithHttpInfoAsync(
          OnPremManagementServiceRegisterTokenRequest body) {
    // Check if unstable operation is enabled
    String operationId = "registerOnPremManagementServiceToken";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<OnPremManagementServiceRegisterTokenResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<OnPremManagementServiceRegisterTokenResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " registerOnPremManagementServiceToken"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/on-prem-management-service/tokens/register";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.OnPremManagementServiceApi.registerOnPremManagementServiceToken",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<OnPremManagementServiceRegisterTokenResponse>> result =
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
        new GenericType<OnPremManagementServiceRegisterTokenResponse>() {});
  }
}
