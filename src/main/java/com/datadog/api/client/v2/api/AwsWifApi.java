package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.AwsWifIntakeMappingCreateRequest;
import com.datadog.api.client.v2.model.AwsWifIntakeMappingResponse;
import com.datadog.api.client.v2.model.AwsWifIntakeMappingsResponse;
import com.datadog.api.client.v2.model.AwsWifPersonaMappingCreateRequest;
import com.datadog.api.client.v2.model.AwsWifPersonaMappingResponse;
import com.datadog.api.client.v2.model.AwsWifPersonaMappingsResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AwsWifApi {
  private ApiClient apiClient;

  public AwsWifApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public AwsWifApi(ApiClient apiClient) {
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
   * Create an AWS WIF intake mapping.
   *
   * <p>See {@link #createAwsWifIntakeMappingWithHttpInfo}.
   *
   * @param body (required)
   * @return AwsWifIntakeMappingResponse
   * @throws ApiException if fails to make API call
   */
  public AwsWifIntakeMappingResponse createAwsWifIntakeMapping(
      AwsWifIntakeMappingCreateRequest body) throws ApiException {
    return createAwsWifIntakeMappingWithHttpInfo(body).getData();
  }

  /**
   * Create an AWS WIF intake mapping.
   *
   * <p>See {@link #createAwsWifIntakeMappingWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;AwsWifIntakeMappingResponse&gt;
   */
  public CompletableFuture<AwsWifIntakeMappingResponse> createAwsWifIntakeMappingAsync(
      AwsWifIntakeMappingCreateRequest body) {
    return createAwsWifIntakeMappingWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create an AWS WIF intake mapping. The mapping binds an IAM role ARN pattern to a
   * managed-rotation API key, allowing AWS workloads to send telemetry to Datadog without requiring
   * a delegated user token.
   *
   * @param body (required)
   * @return ApiResponse&lt;AwsWifIntakeMappingResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AwsWifIntakeMappingResponse> createAwsWifIntakeMappingWithHttpInfo(
      AwsWifIntakeMappingCreateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createAwsWifIntakeMapping");
    }
    // create path and map variables
    String localVarPath = "/api/v2/wif/aws/intake_mapping";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AwsWifApi.createAwsWifIntakeMapping",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<AwsWifIntakeMappingResponse>() {});
  }

  /**
   * Create an AWS WIF intake mapping.
   *
   * <p>See {@link #createAwsWifIntakeMappingWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AwsWifIntakeMappingResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AwsWifIntakeMappingResponse>>
      createAwsWifIntakeMappingWithHttpInfoAsync(AwsWifIntakeMappingCreateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<AwsWifIntakeMappingResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createAwsWifIntakeMapping"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/wif/aws/intake_mapping";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AwsWifApi.createAwsWifIntakeMapping",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AwsWifIntakeMappingResponse>> result =
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
        new GenericType<AwsWifIntakeMappingResponse>() {});
  }

  /**
   * Create an AWS WIF persona mapping.
   *
   * <p>See {@link #createAwsWifPersonaMappingWithHttpInfo}.
   *
   * @param body (required)
   * @return AwsWifPersonaMappingResponse
   * @throws ApiException if fails to make API call
   */
  public AwsWifPersonaMappingResponse createAwsWifPersonaMapping(
      AwsWifPersonaMappingCreateRequest body) throws ApiException {
    return createAwsWifPersonaMappingWithHttpInfo(body).getData();
  }

  /**
   * Create an AWS WIF persona mapping.
   *
   * <p>See {@link #createAwsWifPersonaMappingWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;AwsWifPersonaMappingResponse&gt;
   */
  public CompletableFuture<AwsWifPersonaMappingResponse> createAwsWifPersonaMappingAsync(
      AwsWifPersonaMappingCreateRequest body) {
    return createAwsWifPersonaMappingWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create an AWS Workload Identity Federation (WIF) persona mapping. The mapping binds an IAM role
   * ARN pattern to a Datadog user handle, which is used to authenticate delegated-token requests
   * from that AWS identity.
   *
   * @param body (required)
   * @return ApiResponse&lt;AwsWifPersonaMappingResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AwsWifPersonaMappingResponse> createAwsWifPersonaMappingWithHttpInfo(
      AwsWifPersonaMappingCreateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createAwsWifPersonaMapping");
    }
    // create path and map variables
    String localVarPath = "/api/v2/wif/aws/persona_mapping";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AwsWifApi.createAwsWifPersonaMapping",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<AwsWifPersonaMappingResponse>() {});
  }

  /**
   * Create an AWS WIF persona mapping.
   *
   * <p>See {@link #createAwsWifPersonaMappingWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AwsWifPersonaMappingResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AwsWifPersonaMappingResponse>>
      createAwsWifPersonaMappingWithHttpInfoAsync(AwsWifPersonaMappingCreateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<AwsWifPersonaMappingResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling createAwsWifPersonaMapping"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/wif/aws/persona_mapping";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AwsWifApi.createAwsWifPersonaMapping",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AwsWifPersonaMappingResponse>> result =
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
        new GenericType<AwsWifPersonaMappingResponse>() {});
  }

  /**
   * Delete an AWS WIF intake mapping.
   *
   * <p>See {@link #deleteAwsWifIntakeMappingWithHttpInfo}.
   *
   * @param configUuid The UUID of the WIF configuration to operate on. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteAwsWifIntakeMapping(UUID configUuid) throws ApiException {
    deleteAwsWifIntakeMappingWithHttpInfo(configUuid);
  }

  /**
   * Delete an AWS WIF intake mapping.
   *
   * <p>See {@link #deleteAwsWifIntakeMappingWithHttpInfoAsync}.
   *
   * @param configUuid The UUID of the WIF configuration to operate on. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteAwsWifIntakeMappingAsync(UUID configUuid) {
    return deleteAwsWifIntakeMappingWithHttpInfoAsync(configUuid)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete an AWS WIF intake mapping by UUID. The associated managed-rotation API key is left
   * intact, but AWS workloads that previously matched this mapping will lose intake access.
   *
   * @param configUuid The UUID of the WIF configuration to operate on. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteAwsWifIntakeMappingWithHttpInfo(UUID configUuid)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'configUuid' is set
    if (configUuid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'configUuid' when calling deleteAwsWifIntakeMapping");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/wif/aws/intake_mapping/{config_uuid}"
            .replaceAll(
                "\\{" + "config_uuid" + "\\}", apiClient.escapeString(configUuid.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AwsWifApi.deleteAwsWifIntakeMapping",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
   * Delete an AWS WIF intake mapping.
   *
   * <p>See {@link #deleteAwsWifIntakeMappingWithHttpInfo}.
   *
   * @param configUuid The UUID of the WIF configuration to operate on. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteAwsWifIntakeMappingWithHttpInfoAsync(
      UUID configUuid) {
    Object localVarPostBody = null;

    // verify the required parameter 'configUuid' is set
    if (configUuid == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'configUuid' when calling"
                  + " deleteAwsWifIntakeMapping"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/wif/aws/intake_mapping/{config_uuid}"
            .replaceAll(
                "\\{" + "config_uuid" + "\\}", apiClient.escapeString(configUuid.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AwsWifApi.deleteAwsWifIntakeMapping",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"*/*"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
   * Delete an AWS WIF persona mapping.
   *
   * <p>See {@link #deleteAwsWifPersonaMappingWithHttpInfo}.
   *
   * @param configUuid The UUID of the WIF configuration to operate on. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteAwsWifPersonaMapping(UUID configUuid) throws ApiException {
    deleteAwsWifPersonaMappingWithHttpInfo(configUuid);
  }

  /**
   * Delete an AWS WIF persona mapping.
   *
   * <p>See {@link #deleteAwsWifPersonaMappingWithHttpInfoAsync}.
   *
   * @param configUuid The UUID of the WIF configuration to operate on. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteAwsWifPersonaMappingAsync(UUID configUuid) {
    return deleteAwsWifPersonaMappingWithHttpInfoAsync(configUuid)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete an AWS WIF persona mapping by UUID. Subsequent delegated-token requests from the
   * previously mapped AWS identity will be denied.
   *
   * @param configUuid The UUID of the WIF configuration to operate on. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteAwsWifPersonaMappingWithHttpInfo(UUID configUuid)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'configUuid' is set
    if (configUuid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'configUuid' when calling deleteAwsWifPersonaMapping");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/wif/aws/persona_mapping/{config_uuid}"
            .replaceAll(
                "\\{" + "config_uuid" + "\\}", apiClient.escapeString(configUuid.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AwsWifApi.deleteAwsWifPersonaMapping",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
   * Delete an AWS WIF persona mapping.
   *
   * <p>See {@link #deleteAwsWifPersonaMappingWithHttpInfo}.
   *
   * @param configUuid The UUID of the WIF configuration to operate on. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteAwsWifPersonaMappingWithHttpInfoAsync(
      UUID configUuid) {
    Object localVarPostBody = null;

    // verify the required parameter 'configUuid' is set
    if (configUuid == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'configUuid' when calling"
                  + " deleteAwsWifPersonaMapping"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/wif/aws/persona_mapping/{config_uuid}"
            .replaceAll(
                "\\{" + "config_uuid" + "\\}", apiClient.escapeString(configUuid.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AwsWifApi.deleteAwsWifPersonaMapping",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"*/*"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
   * Get an AWS WIF intake mapping.
   *
   * <p>See {@link #getAwsWifIntakeMappingWithHttpInfo}.
   *
   * @param configUuid The UUID of the WIF configuration to operate on. (required)
   * @return AwsWifIntakeMappingResponse
   * @throws ApiException if fails to make API call
   */
  public AwsWifIntakeMappingResponse getAwsWifIntakeMapping(UUID configUuid) throws ApiException {
    return getAwsWifIntakeMappingWithHttpInfo(configUuid).getData();
  }

  /**
   * Get an AWS WIF intake mapping.
   *
   * <p>See {@link #getAwsWifIntakeMappingWithHttpInfoAsync}.
   *
   * @param configUuid The UUID of the WIF configuration to operate on. (required)
   * @return CompletableFuture&lt;AwsWifIntakeMappingResponse&gt;
   */
  public CompletableFuture<AwsWifIntakeMappingResponse> getAwsWifIntakeMappingAsync(
      UUID configUuid) {
    return getAwsWifIntakeMappingWithHttpInfoAsync(configUuid)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Retrieve a single AWS WIF intake mapping by UUID.
   *
   * @param configUuid The UUID of the WIF configuration to operate on. (required)
   * @return ApiResponse&lt;AwsWifIntakeMappingResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AwsWifIntakeMappingResponse> getAwsWifIntakeMappingWithHttpInfo(
      UUID configUuid) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'configUuid' is set
    if (configUuid == null) {
      throw new ApiException(
          400, "Missing the required parameter 'configUuid' when calling getAwsWifIntakeMapping");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/wif/aws/intake_mapping/{config_uuid}"
            .replaceAll(
                "\\{" + "config_uuid" + "\\}", apiClient.escapeString(configUuid.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AwsWifApi.getAwsWifIntakeMapping",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<AwsWifIntakeMappingResponse>() {});
  }

  /**
   * Get an AWS WIF intake mapping.
   *
   * <p>See {@link #getAwsWifIntakeMappingWithHttpInfo}.
   *
   * @param configUuid The UUID of the WIF configuration to operate on. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AwsWifIntakeMappingResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AwsWifIntakeMappingResponse>>
      getAwsWifIntakeMappingWithHttpInfoAsync(UUID configUuid) {
    Object localVarPostBody = null;

    // verify the required parameter 'configUuid' is set
    if (configUuid == null) {
      CompletableFuture<ApiResponse<AwsWifIntakeMappingResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'configUuid' when calling getAwsWifIntakeMapping"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/wif/aws/intake_mapping/{config_uuid}"
            .replaceAll(
                "\\{" + "config_uuid" + "\\}", apiClient.escapeString(configUuid.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AwsWifApi.getAwsWifIntakeMapping",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AwsWifIntakeMappingResponse>> result =
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
        new GenericType<AwsWifIntakeMappingResponse>() {});
  }

  /**
   * Get an AWS WIF persona mapping.
   *
   * <p>See {@link #getAwsWifPersonaMappingWithHttpInfo}.
   *
   * @param configUuid The UUID of the WIF configuration to operate on. (required)
   * @return AwsWifPersonaMappingResponse
   * @throws ApiException if fails to make API call
   */
  public AwsWifPersonaMappingResponse getAwsWifPersonaMapping(UUID configUuid) throws ApiException {
    return getAwsWifPersonaMappingWithHttpInfo(configUuid).getData();
  }

  /**
   * Get an AWS WIF persona mapping.
   *
   * <p>See {@link #getAwsWifPersonaMappingWithHttpInfoAsync}.
   *
   * @param configUuid The UUID of the WIF configuration to operate on. (required)
   * @return CompletableFuture&lt;AwsWifPersonaMappingResponse&gt;
   */
  public CompletableFuture<AwsWifPersonaMappingResponse> getAwsWifPersonaMappingAsync(
      UUID configUuid) {
    return getAwsWifPersonaMappingWithHttpInfoAsync(configUuid)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Retrieve a single AWS WIF persona mapping by UUID.
   *
   * @param configUuid The UUID of the WIF configuration to operate on. (required)
   * @return ApiResponse&lt;AwsWifPersonaMappingResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AwsWifPersonaMappingResponse> getAwsWifPersonaMappingWithHttpInfo(
      UUID configUuid) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'configUuid' is set
    if (configUuid == null) {
      throw new ApiException(
          400, "Missing the required parameter 'configUuid' when calling getAwsWifPersonaMapping");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/wif/aws/persona_mapping/{config_uuid}"
            .replaceAll(
                "\\{" + "config_uuid" + "\\}", apiClient.escapeString(configUuid.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AwsWifApi.getAwsWifPersonaMapping",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<AwsWifPersonaMappingResponse>() {});
  }

  /**
   * Get an AWS WIF persona mapping.
   *
   * <p>See {@link #getAwsWifPersonaMappingWithHttpInfo}.
   *
   * @param configUuid The UUID of the WIF configuration to operate on. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AwsWifPersonaMappingResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AwsWifPersonaMappingResponse>>
      getAwsWifPersonaMappingWithHttpInfoAsync(UUID configUuid) {
    Object localVarPostBody = null;

    // verify the required parameter 'configUuid' is set
    if (configUuid == null) {
      CompletableFuture<ApiResponse<AwsWifPersonaMappingResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'configUuid' when calling getAwsWifPersonaMapping"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/wif/aws/persona_mapping/{config_uuid}"
            .replaceAll(
                "\\{" + "config_uuid" + "\\}", apiClient.escapeString(configUuid.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AwsWifApi.getAwsWifPersonaMapping",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AwsWifPersonaMappingResponse>> result =
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
        new GenericType<AwsWifPersonaMappingResponse>() {});
  }

  /**
   * List AWS WIF intake mappings.
   *
   * <p>See {@link #listAwsWifIntakeMappingsWithHttpInfo}.
   *
   * @return AwsWifIntakeMappingsResponse
   * @throws ApiException if fails to make API call
   */
  public AwsWifIntakeMappingsResponse listAwsWifIntakeMappings() throws ApiException {
    return listAwsWifIntakeMappingsWithHttpInfo().getData();
  }

  /**
   * List AWS WIF intake mappings.
   *
   * <p>See {@link #listAwsWifIntakeMappingsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;AwsWifIntakeMappingsResponse&gt;
   */
  public CompletableFuture<AwsWifIntakeMappingsResponse> listAwsWifIntakeMappingsAsync() {
    return listAwsWifIntakeMappingsWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List every AWS WIF intake mapping configured for the caller's organization.
   *
   * @return ApiResponse&lt;AwsWifIntakeMappingsResponse&gt;
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
  public ApiResponse<AwsWifIntakeMappingsResponse> listAwsWifIntakeMappingsWithHttpInfo()
      throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/wif/aws/intake_mapping";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AwsWifApi.listAwsWifIntakeMappings",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<AwsWifIntakeMappingsResponse>() {});
  }

  /**
   * List AWS WIF intake mappings.
   *
   * <p>See {@link #listAwsWifIntakeMappingsWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;AwsWifIntakeMappingsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AwsWifIntakeMappingsResponse>>
      listAwsWifIntakeMappingsWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/wif/aws/intake_mapping";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AwsWifApi.listAwsWifIntakeMappings",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AwsWifIntakeMappingsResponse>> result =
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
        new GenericType<AwsWifIntakeMappingsResponse>() {});
  }

  /**
   * List AWS WIF persona mappings.
   *
   * <p>See {@link #listAwsWifPersonaMappingsWithHttpInfo}.
   *
   * @return AwsWifPersonaMappingsResponse
   * @throws ApiException if fails to make API call
   */
  public AwsWifPersonaMappingsResponse listAwsWifPersonaMappings() throws ApiException {
    return listAwsWifPersonaMappingsWithHttpInfo().getData();
  }

  /**
   * List AWS WIF persona mappings.
   *
   * <p>See {@link #listAwsWifPersonaMappingsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;AwsWifPersonaMappingsResponse&gt;
   */
  public CompletableFuture<AwsWifPersonaMappingsResponse> listAwsWifPersonaMappingsAsync() {
    return listAwsWifPersonaMappingsWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List every AWS WIF persona mapping configured for the caller's organization.
   *
   * @return ApiResponse&lt;AwsWifPersonaMappingsResponse&gt;
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
  public ApiResponse<AwsWifPersonaMappingsResponse> listAwsWifPersonaMappingsWithHttpInfo()
      throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/wif/aws/persona_mapping";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.AwsWifApi.listAwsWifPersonaMappings",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<AwsWifPersonaMappingsResponse>() {});
  }

  /**
   * List AWS WIF persona mappings.
   *
   * <p>See {@link #listAwsWifPersonaMappingsWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;AwsWifPersonaMappingsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AwsWifPersonaMappingsResponse>>
      listAwsWifPersonaMappingsWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/wif/aws/persona_mapping";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.AwsWifApi.listAwsWifPersonaMappings",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AwsWifPersonaMappingsResponse>> result =
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
        new GenericType<AwsWifPersonaMappingsResponse>() {});
  }
}
