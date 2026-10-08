package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.AWSCloudAuthPersonaMappingCreateRequest;
import com.datadog.api.client.v2.model.AWSCloudAuthPersonaMappingResponse;
import com.datadog.api.client.v2.model.AWSCloudAuthPersonaMappingsResponse;
import com.datadog.api.client.v2.model.GitHubCloudAuthIntakeMappingCreateRequest;
import com.datadog.api.client.v2.model.GitHubCloudAuthIntakeMappingResponse;
import com.datadog.api.client.v2.model.GitHubCloudAuthIntakeMappingsResponse;
import com.datadog.api.client.v2.model.GitHubCloudAuthPersonaMappingCreateRequest;
import com.datadog.api.client.v2.model.GitHubCloudAuthPersonaMappingResponse;
import com.datadog.api.client.v2.model.GitHubCloudAuthPersonaMappingsResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CloudAuthenticationApi {
  private ApiClient apiClient;

  public CloudAuthenticationApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public CloudAuthenticationApi(ApiClient apiClient) {
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
   * Create an AWS cloud authentication persona mapping.
   *
   * <p>See {@link #createAWSCloudAuthPersonaMappingWithHttpInfo}.
   *
   * @param body (required)
   * @return AWSCloudAuthPersonaMappingResponse
   * @throws ApiException if fails to make API call
   */
  public AWSCloudAuthPersonaMappingResponse createAWSCloudAuthPersonaMapping(
      AWSCloudAuthPersonaMappingCreateRequest body) throws ApiException {
    return createAWSCloudAuthPersonaMappingWithHttpInfo(body).getData();
  }

  /**
   * Create an AWS cloud authentication persona mapping.
   *
   * <p>See {@link #createAWSCloudAuthPersonaMappingWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;AWSCloudAuthPersonaMappingResponse&gt;
   */
  public CompletableFuture<AWSCloudAuthPersonaMappingResponse>
      createAWSCloudAuthPersonaMappingAsync(AWSCloudAuthPersonaMappingCreateRequest body) {
    return createAWSCloudAuthPersonaMappingWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create an AWS cloud authentication persona mapping. This endpoint associates an AWS IAM
   * principal with a Datadog user.
   *
   * @param body (required)
   * @return ApiResponse&lt;AWSCloudAuthPersonaMappingResponse&gt;
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
  public ApiResponse<AWSCloudAuthPersonaMappingResponse>
      createAWSCloudAuthPersonaMappingWithHttpInfo(AWSCloudAuthPersonaMappingCreateRequest body)
          throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createAWSCloudAuthPersonaMapping";
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
          "Missing the required parameter 'body' when calling createAWSCloudAuthPersonaMapping");
    }
    // create path and map variables
    String localVarPath = "/api/v2/cloud_auth/aws/persona_mapping";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CloudAuthenticationApi.createAWSCloudAuthPersonaMapping",
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
        new GenericType<AWSCloudAuthPersonaMappingResponse>() {});
  }

  /**
   * Create an AWS cloud authentication persona mapping.
   *
   * <p>See {@link #createAWSCloudAuthPersonaMappingWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AWSCloudAuthPersonaMappingResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AWSCloudAuthPersonaMappingResponse>>
      createAWSCloudAuthPersonaMappingWithHttpInfoAsync(
          AWSCloudAuthPersonaMappingCreateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createAWSCloudAuthPersonaMapping";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<AWSCloudAuthPersonaMappingResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<AWSCloudAuthPersonaMappingResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " createAWSCloudAuthPersonaMapping"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/cloud_auth/aws/persona_mapping";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CloudAuthenticationApi.createAWSCloudAuthPersonaMapping",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AWSCloudAuthPersonaMappingResponse>> result =
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
        new GenericType<AWSCloudAuthPersonaMappingResponse>() {});
  }

  /**
   * Create a GitHub cloud auth intake mapping.
   *
   * <p>See {@link #createGitHubCloudAuthIntakeMappingWithHttpInfo}.
   *
   * @param body (required)
   * @return GitHubCloudAuthIntakeMappingResponse
   * @throws ApiException if fails to make API call
   */
  public GitHubCloudAuthIntakeMappingResponse createGitHubCloudAuthIntakeMapping(
      GitHubCloudAuthIntakeMappingCreateRequest body) throws ApiException {
    return createGitHubCloudAuthIntakeMappingWithHttpInfo(body).getData();
  }

  /**
   * Create a GitHub cloud auth intake mapping.
   *
   * <p>See {@link #createGitHubCloudAuthIntakeMappingWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;GitHubCloudAuthIntakeMappingResponse&gt;
   */
  public CompletableFuture<GitHubCloudAuthIntakeMappingResponse>
      createGitHubCloudAuthIntakeMappingAsync(GitHubCloudAuthIntakeMappingCreateRequest body) {
    return createGitHubCloudAuthIntakeMappingWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a GitHub cloud authentication intake mapping. This endpoint entitles a matching GitHub
   * Actions OIDC principal to request Datadog API keys.
   *
   * @param body (required)
   * @return ApiResponse&lt;GitHubCloudAuthIntakeMappingResponse&gt;
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
  public ApiResponse<GitHubCloudAuthIntakeMappingResponse>
      createGitHubCloudAuthIntakeMappingWithHttpInfo(GitHubCloudAuthIntakeMappingCreateRequest body)
          throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createGitHubCloudAuthIntakeMapping";
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
          "Missing the required parameter 'body' when calling createGitHubCloudAuthIntakeMapping");
    }
    // create path and map variables
    String localVarPath = "/api/v2/cloud_auth/github/intake_mapping";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CloudAuthenticationApi.createGitHubCloudAuthIntakeMapping",
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
        new GenericType<GitHubCloudAuthIntakeMappingResponse>() {});
  }

  /**
   * Create a GitHub cloud auth intake mapping.
   *
   * <p>See {@link #createGitHubCloudAuthIntakeMappingWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;GitHubCloudAuthIntakeMappingResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<GitHubCloudAuthIntakeMappingResponse>>
      createGitHubCloudAuthIntakeMappingWithHttpInfoAsync(
          GitHubCloudAuthIntakeMappingCreateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createGitHubCloudAuthIntakeMapping";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<GitHubCloudAuthIntakeMappingResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<GitHubCloudAuthIntakeMappingResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " createGitHubCloudAuthIntakeMapping"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/cloud_auth/github/intake_mapping";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CloudAuthenticationApi.createGitHubCloudAuthIntakeMapping",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<GitHubCloudAuthIntakeMappingResponse>> result =
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
        new GenericType<GitHubCloudAuthIntakeMappingResponse>() {});
  }

  /**
   * Create a GitHub cloud auth persona mapping.
   *
   * <p>See {@link #createGitHubCloudAuthPersonaMappingWithHttpInfo}.
   *
   * @param body (required)
   * @return GitHubCloudAuthPersonaMappingResponse
   * @throws ApiException if fails to make API call
   */
  public GitHubCloudAuthPersonaMappingResponse createGitHubCloudAuthPersonaMapping(
      GitHubCloudAuthPersonaMappingCreateRequest body) throws ApiException {
    return createGitHubCloudAuthPersonaMappingWithHttpInfo(body).getData();
  }

  /**
   * Create a GitHub cloud auth persona mapping.
   *
   * <p>See {@link #createGitHubCloudAuthPersonaMappingWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;GitHubCloudAuthPersonaMappingResponse&gt;
   */
  public CompletableFuture<GitHubCloudAuthPersonaMappingResponse>
      createGitHubCloudAuthPersonaMappingAsync(GitHubCloudAuthPersonaMappingCreateRequest body) {
    return createGitHubCloudAuthPersonaMappingWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a GitHub cloud authentication persona mapping. This endpoint associates a GitHub Actions
   * OIDC principal with a Datadog user. The mapped principal can request an impersonation token.
   *
   * @param body (required)
   * @return ApiResponse&lt;GitHubCloudAuthPersonaMappingResponse&gt;
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
  public ApiResponse<GitHubCloudAuthPersonaMappingResponse>
      createGitHubCloudAuthPersonaMappingWithHttpInfo(
          GitHubCloudAuthPersonaMappingCreateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createGitHubCloudAuthPersonaMapping";
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
          "Missing the required parameter 'body' when calling createGitHubCloudAuthPersonaMapping");
    }
    // create path and map variables
    String localVarPath = "/api/v2/cloud_auth/github/persona_mapping";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CloudAuthenticationApi.createGitHubCloudAuthPersonaMapping",
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
        new GenericType<GitHubCloudAuthPersonaMappingResponse>() {});
  }

  /**
   * Create a GitHub cloud auth persona mapping.
   *
   * <p>See {@link #createGitHubCloudAuthPersonaMappingWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;GitHubCloudAuthPersonaMappingResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<GitHubCloudAuthPersonaMappingResponse>>
      createGitHubCloudAuthPersonaMappingWithHttpInfoAsync(
          GitHubCloudAuthPersonaMappingCreateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createGitHubCloudAuthPersonaMapping";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<GitHubCloudAuthPersonaMappingResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<GitHubCloudAuthPersonaMappingResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " createGitHubCloudAuthPersonaMapping"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/cloud_auth/github/persona_mapping";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CloudAuthenticationApi.createGitHubCloudAuthPersonaMapping",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<GitHubCloudAuthPersonaMappingResponse>> result =
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
        new GenericType<GitHubCloudAuthPersonaMappingResponse>() {});
  }

  /**
   * Delete an AWS cloud authentication persona mapping.
   *
   * <p>See {@link #deleteAWSCloudAuthPersonaMappingWithHttpInfo}.
   *
   * @param personaMappingId The ID of the persona mapping (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteAWSCloudAuthPersonaMapping(String personaMappingId) throws ApiException {
    deleteAWSCloudAuthPersonaMappingWithHttpInfo(personaMappingId);
  }

  /**
   * Delete an AWS cloud authentication persona mapping.
   *
   * <p>See {@link #deleteAWSCloudAuthPersonaMappingWithHttpInfoAsync}.
   *
   * @param personaMappingId The ID of the persona mapping (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteAWSCloudAuthPersonaMappingAsync(String personaMappingId) {
    return deleteAWSCloudAuthPersonaMappingWithHttpInfoAsync(personaMappingId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete an AWS cloud authentication persona mapping by ID. This removes the association between
   * an AWS IAM principal and a Datadog user.
   *
   * @param personaMappingId The ID of the persona mapping (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteAWSCloudAuthPersonaMappingWithHttpInfo(String personaMappingId)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteAWSCloudAuthPersonaMapping";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'personaMappingId' is set
    if (personaMappingId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'personaMappingId' when calling"
              + " deleteAWSCloudAuthPersonaMapping");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cloud_auth/aws/persona_mapping/{persona_mapping_id}"
            .replaceAll(
                "\\{" + "persona_mapping_id" + "\\}",
                apiClient.escapeString(personaMappingId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CloudAuthenticationApi.deleteAWSCloudAuthPersonaMapping",
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
   * Delete an AWS cloud authentication persona mapping.
   *
   * <p>See {@link #deleteAWSCloudAuthPersonaMappingWithHttpInfo}.
   *
   * @param personaMappingId The ID of the persona mapping (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteAWSCloudAuthPersonaMappingWithHttpInfoAsync(
      String personaMappingId) {
    // Check if unstable operation is enabled
    String operationId = "deleteAWSCloudAuthPersonaMapping";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'personaMappingId' is set
    if (personaMappingId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'personaMappingId' when calling"
                  + " deleteAWSCloudAuthPersonaMapping"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cloud_auth/aws/persona_mapping/{persona_mapping_id}"
            .replaceAll(
                "\\{" + "persona_mapping_id" + "\\}",
                apiClient.escapeString(personaMappingId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CloudAuthenticationApi.deleteAWSCloudAuthPersonaMapping",
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
   * Delete a GitHub cloud auth intake mapping.
   *
   * <p>See {@link #deleteGitHubCloudAuthIntakeMappingWithHttpInfo}.
   *
   * @param intakeMappingId The ID of the intake mapping (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteGitHubCloudAuthIntakeMapping(String intakeMappingId) throws ApiException {
    deleteGitHubCloudAuthIntakeMappingWithHttpInfo(intakeMappingId);
  }

  /**
   * Delete a GitHub cloud auth intake mapping.
   *
   * <p>See {@link #deleteGitHubCloudAuthIntakeMappingWithHttpInfoAsync}.
   *
   * @param intakeMappingId The ID of the intake mapping (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteGitHubCloudAuthIntakeMappingAsync(String intakeMappingId) {
    return deleteGitHubCloudAuthIntakeMappingWithHttpInfoAsync(intakeMappingId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete a GitHub cloud authentication intake mapping by ID. This removes a GitHub Actions OIDC
   * principal's entitlement to request Datadog API keys.
   *
   * @param intakeMappingId The ID of the intake mapping (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteGitHubCloudAuthIntakeMappingWithHttpInfo(String intakeMappingId)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteGitHubCloudAuthIntakeMapping";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'intakeMappingId' is set
    if (intakeMappingId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'intakeMappingId' when calling"
              + " deleteGitHubCloudAuthIntakeMapping");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cloud_auth/github/intake_mapping/{intake_mapping_id}"
            .replaceAll(
                "\\{" + "intake_mapping_id" + "\\}",
                apiClient.escapeString(intakeMappingId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CloudAuthenticationApi.deleteGitHubCloudAuthIntakeMapping",
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
   * Delete a GitHub cloud auth intake mapping.
   *
   * <p>See {@link #deleteGitHubCloudAuthIntakeMappingWithHttpInfo}.
   *
   * @param intakeMappingId The ID of the intake mapping (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteGitHubCloudAuthIntakeMappingWithHttpInfoAsync(
      String intakeMappingId) {
    // Check if unstable operation is enabled
    String operationId = "deleteGitHubCloudAuthIntakeMapping";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'intakeMappingId' is set
    if (intakeMappingId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'intakeMappingId' when calling"
                  + " deleteGitHubCloudAuthIntakeMapping"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cloud_auth/github/intake_mapping/{intake_mapping_id}"
            .replaceAll(
                "\\{" + "intake_mapping_id" + "\\}",
                apiClient.escapeString(intakeMappingId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CloudAuthenticationApi.deleteGitHubCloudAuthIntakeMapping",
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
   * Delete a GitHub cloud auth persona mapping.
   *
   * <p>See {@link #deleteGitHubCloudAuthPersonaMappingWithHttpInfo}.
   *
   * @param personaMappingId The ID of the persona mapping (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteGitHubCloudAuthPersonaMapping(String personaMappingId) throws ApiException {
    deleteGitHubCloudAuthPersonaMappingWithHttpInfo(personaMappingId);
  }

  /**
   * Delete a GitHub cloud auth persona mapping.
   *
   * <p>See {@link #deleteGitHubCloudAuthPersonaMappingWithHttpInfoAsync}.
   *
   * @param personaMappingId The ID of the persona mapping (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteGitHubCloudAuthPersonaMappingAsync(String personaMappingId) {
    return deleteGitHubCloudAuthPersonaMappingWithHttpInfoAsync(personaMappingId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete a GitHub cloud authentication persona mapping by ID. This removes the association
   * between a GitHub Actions OIDC principal and a Datadog user.
   *
   * @param personaMappingId The ID of the persona mapping (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteGitHubCloudAuthPersonaMappingWithHttpInfo(String personaMappingId)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteGitHubCloudAuthPersonaMapping";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'personaMappingId' is set
    if (personaMappingId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'personaMappingId' when calling"
              + " deleteGitHubCloudAuthPersonaMapping");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cloud_auth/github/persona_mapping/{persona_mapping_id}"
            .replaceAll(
                "\\{" + "persona_mapping_id" + "\\}",
                apiClient.escapeString(personaMappingId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CloudAuthenticationApi.deleteGitHubCloudAuthPersonaMapping",
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
   * Delete a GitHub cloud auth persona mapping.
   *
   * <p>See {@link #deleteGitHubCloudAuthPersonaMappingWithHttpInfo}.
   *
   * @param personaMappingId The ID of the persona mapping (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteGitHubCloudAuthPersonaMappingWithHttpInfoAsync(
      String personaMappingId) {
    // Check if unstable operation is enabled
    String operationId = "deleteGitHubCloudAuthPersonaMapping";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'personaMappingId' is set
    if (personaMappingId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'personaMappingId' when calling"
                  + " deleteGitHubCloudAuthPersonaMapping"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cloud_auth/github/persona_mapping/{persona_mapping_id}"
            .replaceAll(
                "\\{" + "persona_mapping_id" + "\\}",
                apiClient.escapeString(personaMappingId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CloudAuthenticationApi.deleteGitHubCloudAuthPersonaMapping",
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
   * Get an AWS cloud authentication persona mapping.
   *
   * <p>See {@link #getAWSCloudAuthPersonaMappingWithHttpInfo}.
   *
   * @param personaMappingId The ID of the persona mapping (required)
   * @return AWSCloudAuthPersonaMappingResponse
   * @throws ApiException if fails to make API call
   */
  public AWSCloudAuthPersonaMappingResponse getAWSCloudAuthPersonaMapping(String personaMappingId)
      throws ApiException {
    return getAWSCloudAuthPersonaMappingWithHttpInfo(personaMappingId).getData();
  }

  /**
   * Get an AWS cloud authentication persona mapping.
   *
   * <p>See {@link #getAWSCloudAuthPersonaMappingWithHttpInfoAsync}.
   *
   * @param personaMappingId The ID of the persona mapping (required)
   * @return CompletableFuture&lt;AWSCloudAuthPersonaMappingResponse&gt;
   */
  public CompletableFuture<AWSCloudAuthPersonaMappingResponse> getAWSCloudAuthPersonaMappingAsync(
      String personaMappingId) {
    return getAWSCloudAuthPersonaMappingWithHttpInfoAsync(personaMappingId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a specific AWS cloud authentication persona mapping by ID. This endpoint retrieves a single
   * configured persona mapping that associates an AWS IAM principal with a Datadog user.
   *
   * @param personaMappingId The ID of the persona mapping (required)
   * @return ApiResponse&lt;AWSCloudAuthPersonaMappingResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AWSCloudAuthPersonaMappingResponse> getAWSCloudAuthPersonaMappingWithHttpInfo(
      String personaMappingId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getAWSCloudAuthPersonaMapping";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'personaMappingId' is set
    if (personaMappingId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'personaMappingId' when calling"
              + " getAWSCloudAuthPersonaMapping");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cloud_auth/aws/persona_mapping/{persona_mapping_id}"
            .replaceAll(
                "\\{" + "persona_mapping_id" + "\\}",
                apiClient.escapeString(personaMappingId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CloudAuthenticationApi.getAWSCloudAuthPersonaMapping",
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
        new GenericType<AWSCloudAuthPersonaMappingResponse>() {});
  }

  /**
   * Get an AWS cloud authentication persona mapping.
   *
   * <p>See {@link #getAWSCloudAuthPersonaMappingWithHttpInfo}.
   *
   * @param personaMappingId The ID of the persona mapping (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AWSCloudAuthPersonaMappingResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AWSCloudAuthPersonaMappingResponse>>
      getAWSCloudAuthPersonaMappingWithHttpInfoAsync(String personaMappingId) {
    // Check if unstable operation is enabled
    String operationId = "getAWSCloudAuthPersonaMapping";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<AWSCloudAuthPersonaMappingResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'personaMappingId' is set
    if (personaMappingId == null) {
      CompletableFuture<ApiResponse<AWSCloudAuthPersonaMappingResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'personaMappingId' when calling"
                  + " getAWSCloudAuthPersonaMapping"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cloud_auth/aws/persona_mapping/{persona_mapping_id}"
            .replaceAll(
                "\\{" + "persona_mapping_id" + "\\}",
                apiClient.escapeString(personaMappingId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CloudAuthenticationApi.getAWSCloudAuthPersonaMapping",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AWSCloudAuthPersonaMappingResponse>> result =
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
        new GenericType<AWSCloudAuthPersonaMappingResponse>() {});
  }

  /**
   * Get a GitHub cloud authentication intake mapping.
   *
   * <p>See {@link #getGitHubCloudAuthIntakeMappingWithHttpInfo}.
   *
   * @param intakeMappingId The ID of the intake mapping (required)
   * @return GitHubCloudAuthIntakeMappingResponse
   * @throws ApiException if fails to make API call
   */
  public GitHubCloudAuthIntakeMappingResponse getGitHubCloudAuthIntakeMapping(
      String intakeMappingId) throws ApiException {
    return getGitHubCloudAuthIntakeMappingWithHttpInfo(intakeMappingId).getData();
  }

  /**
   * Get a GitHub cloud authentication intake mapping.
   *
   * <p>See {@link #getGitHubCloudAuthIntakeMappingWithHttpInfoAsync}.
   *
   * @param intakeMappingId The ID of the intake mapping (required)
   * @return CompletableFuture&lt;GitHubCloudAuthIntakeMappingResponse&gt;
   */
  public CompletableFuture<GitHubCloudAuthIntakeMappingResponse>
      getGitHubCloudAuthIntakeMappingAsync(String intakeMappingId) {
    return getGitHubCloudAuthIntakeMappingWithHttpInfoAsync(intakeMappingId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a specific GitHub cloud authentication intake mapping by ID. This endpoint retrieves a
   * single configured intake mapping that entitles a matching GitHub Actions OIDC principal to
   * request Datadog API keys.
   *
   * @param intakeMappingId The ID of the intake mapping (required)
   * @return ApiResponse&lt;GitHubCloudAuthIntakeMappingResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<GitHubCloudAuthIntakeMappingResponse>
      getGitHubCloudAuthIntakeMappingWithHttpInfo(String intakeMappingId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getGitHubCloudAuthIntakeMapping";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'intakeMappingId' is set
    if (intakeMappingId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'intakeMappingId' when calling"
              + " getGitHubCloudAuthIntakeMapping");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cloud_auth/github/intake_mapping/{intake_mapping_id}"
            .replaceAll(
                "\\{" + "intake_mapping_id" + "\\}",
                apiClient.escapeString(intakeMappingId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CloudAuthenticationApi.getGitHubCloudAuthIntakeMapping",
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
        new GenericType<GitHubCloudAuthIntakeMappingResponse>() {});
  }

  /**
   * Get a GitHub cloud authentication intake mapping.
   *
   * <p>See {@link #getGitHubCloudAuthIntakeMappingWithHttpInfo}.
   *
   * @param intakeMappingId The ID of the intake mapping (required)
   * @return CompletableFuture&lt;ApiResponse&lt;GitHubCloudAuthIntakeMappingResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<GitHubCloudAuthIntakeMappingResponse>>
      getGitHubCloudAuthIntakeMappingWithHttpInfoAsync(String intakeMappingId) {
    // Check if unstable operation is enabled
    String operationId = "getGitHubCloudAuthIntakeMapping";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<GitHubCloudAuthIntakeMappingResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'intakeMappingId' is set
    if (intakeMappingId == null) {
      CompletableFuture<ApiResponse<GitHubCloudAuthIntakeMappingResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'intakeMappingId' when calling"
                  + " getGitHubCloudAuthIntakeMapping"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cloud_auth/github/intake_mapping/{intake_mapping_id}"
            .replaceAll(
                "\\{" + "intake_mapping_id" + "\\}",
                apiClient.escapeString(intakeMappingId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CloudAuthenticationApi.getGitHubCloudAuthIntakeMapping",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<GitHubCloudAuthIntakeMappingResponse>> result =
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
        new GenericType<GitHubCloudAuthIntakeMappingResponse>() {});
  }

  /**
   * Get a GitHub cloud authentication persona mapping.
   *
   * <p>See {@link #getGitHubCloudAuthPersonaMappingWithHttpInfo}.
   *
   * @param personaMappingId The ID of the persona mapping (required)
   * @return GitHubCloudAuthPersonaMappingResponse
   * @throws ApiException if fails to make API call
   */
  public GitHubCloudAuthPersonaMappingResponse getGitHubCloudAuthPersonaMapping(
      String personaMappingId) throws ApiException {
    return getGitHubCloudAuthPersonaMappingWithHttpInfo(personaMappingId).getData();
  }

  /**
   * Get a GitHub cloud authentication persona mapping.
   *
   * <p>See {@link #getGitHubCloudAuthPersonaMappingWithHttpInfoAsync}.
   *
   * @param personaMappingId The ID of the persona mapping (required)
   * @return CompletableFuture&lt;GitHubCloudAuthPersonaMappingResponse&gt;
   */
  public CompletableFuture<GitHubCloudAuthPersonaMappingResponse>
      getGitHubCloudAuthPersonaMappingAsync(String personaMappingId) {
    return getGitHubCloudAuthPersonaMappingWithHttpInfoAsync(personaMappingId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a specific GitHub cloud authentication persona mapping by ID. This endpoint retrieves a
   * single configured persona mapping that associates a GitHub Actions OIDC principal with a
   * Datadog user. The mapped principal can request an impersonation token.
   *
   * @param personaMappingId The ID of the persona mapping (required)
   * @return ApiResponse&lt;GitHubCloudAuthPersonaMappingResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<GitHubCloudAuthPersonaMappingResponse>
      getGitHubCloudAuthPersonaMappingWithHttpInfo(String personaMappingId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getGitHubCloudAuthPersonaMapping";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'personaMappingId' is set
    if (personaMappingId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'personaMappingId' when calling"
              + " getGitHubCloudAuthPersonaMapping");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cloud_auth/github/persona_mapping/{persona_mapping_id}"
            .replaceAll(
                "\\{" + "persona_mapping_id" + "\\}",
                apiClient.escapeString(personaMappingId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CloudAuthenticationApi.getGitHubCloudAuthPersonaMapping",
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
        new GenericType<GitHubCloudAuthPersonaMappingResponse>() {});
  }

  /**
   * Get a GitHub cloud authentication persona mapping.
   *
   * <p>See {@link #getGitHubCloudAuthPersonaMappingWithHttpInfo}.
   *
   * @param personaMappingId The ID of the persona mapping (required)
   * @return CompletableFuture&lt;ApiResponse&lt;GitHubCloudAuthPersonaMappingResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<GitHubCloudAuthPersonaMappingResponse>>
      getGitHubCloudAuthPersonaMappingWithHttpInfoAsync(String personaMappingId) {
    // Check if unstable operation is enabled
    String operationId = "getGitHubCloudAuthPersonaMapping";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<GitHubCloudAuthPersonaMappingResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'personaMappingId' is set
    if (personaMappingId == null) {
      CompletableFuture<ApiResponse<GitHubCloudAuthPersonaMappingResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'personaMappingId' when calling"
                  + " getGitHubCloudAuthPersonaMapping"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cloud_auth/github/persona_mapping/{persona_mapping_id}"
            .replaceAll(
                "\\{" + "persona_mapping_id" + "\\}",
                apiClient.escapeString(personaMappingId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CloudAuthenticationApi.getGitHubCloudAuthPersonaMapping",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<GitHubCloudAuthPersonaMappingResponse>> result =
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
        new GenericType<GitHubCloudAuthPersonaMappingResponse>() {});
  }

  /**
   * List AWS cloud authentication persona mappings.
   *
   * <p>See {@link #listAWSCloudAuthPersonaMappingsWithHttpInfo}.
   *
   * @return AWSCloudAuthPersonaMappingsResponse
   * @throws ApiException if fails to make API call
   */
  public AWSCloudAuthPersonaMappingsResponse listAWSCloudAuthPersonaMappings() throws ApiException {
    return listAWSCloudAuthPersonaMappingsWithHttpInfo().getData();
  }

  /**
   * List AWS cloud authentication persona mappings.
   *
   * <p>See {@link #listAWSCloudAuthPersonaMappingsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;AWSCloudAuthPersonaMappingsResponse&gt;
   */
  public CompletableFuture<AWSCloudAuthPersonaMappingsResponse>
      listAWSCloudAuthPersonaMappingsAsync() {
    return listAWSCloudAuthPersonaMappingsWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List all AWS cloud authentication persona mappings. This endpoint retrieves all configured
   * persona mappings that associate AWS IAM principals with Datadog users.
   *
   * @return ApiResponse&lt;AWSCloudAuthPersonaMappingsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AWSCloudAuthPersonaMappingsResponse>
      listAWSCloudAuthPersonaMappingsWithHttpInfo() throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listAWSCloudAuthPersonaMappings";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/cloud_auth/aws/persona_mapping";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CloudAuthenticationApi.listAWSCloudAuthPersonaMappings",
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
        new GenericType<AWSCloudAuthPersonaMappingsResponse>() {});
  }

  /**
   * List AWS cloud authentication persona mappings.
   *
   * <p>See {@link #listAWSCloudAuthPersonaMappingsWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;AWSCloudAuthPersonaMappingsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AWSCloudAuthPersonaMappingsResponse>>
      listAWSCloudAuthPersonaMappingsWithHttpInfoAsync() {
    // Check if unstable operation is enabled
    String operationId = "listAWSCloudAuthPersonaMappings";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<AWSCloudAuthPersonaMappingsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/cloud_auth/aws/persona_mapping";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CloudAuthenticationApi.listAWSCloudAuthPersonaMappings",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AWSCloudAuthPersonaMappingsResponse>> result =
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
        new GenericType<AWSCloudAuthPersonaMappingsResponse>() {});
  }

  /**
   * List GitHub cloud authentication intake mappings.
   *
   * <p>See {@link #listGitHubCloudAuthIntakeMappingsWithHttpInfo}.
   *
   * @return GitHubCloudAuthIntakeMappingsResponse
   * @throws ApiException if fails to make API call
   */
  public GitHubCloudAuthIntakeMappingsResponse listGitHubCloudAuthIntakeMappings()
      throws ApiException {
    return listGitHubCloudAuthIntakeMappingsWithHttpInfo().getData();
  }

  /**
   * List GitHub cloud authentication intake mappings.
   *
   * <p>See {@link #listGitHubCloudAuthIntakeMappingsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;GitHubCloudAuthIntakeMappingsResponse&gt;
   */
  public CompletableFuture<GitHubCloudAuthIntakeMappingsResponse>
      listGitHubCloudAuthIntakeMappingsAsync() {
    return listGitHubCloudAuthIntakeMappingsWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List all GitHub cloud authentication intake mappings. This endpoint retrieves all configured
   * intake mappings that entitle matching GitHub Actions OIDC principals to request Datadog API
   * keys.
   *
   * @return ApiResponse&lt;GitHubCloudAuthIntakeMappingsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<GitHubCloudAuthIntakeMappingsResponse>
      listGitHubCloudAuthIntakeMappingsWithHttpInfo() throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listGitHubCloudAuthIntakeMappings";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/cloud_auth/github/intake_mapping";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CloudAuthenticationApi.listGitHubCloudAuthIntakeMappings",
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
        new GenericType<GitHubCloudAuthIntakeMappingsResponse>() {});
  }

  /**
   * List GitHub cloud authentication intake mappings.
   *
   * <p>See {@link #listGitHubCloudAuthIntakeMappingsWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;GitHubCloudAuthIntakeMappingsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<GitHubCloudAuthIntakeMappingsResponse>>
      listGitHubCloudAuthIntakeMappingsWithHttpInfoAsync() {
    // Check if unstable operation is enabled
    String operationId = "listGitHubCloudAuthIntakeMappings";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<GitHubCloudAuthIntakeMappingsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/cloud_auth/github/intake_mapping";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CloudAuthenticationApi.listGitHubCloudAuthIntakeMappings",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<GitHubCloudAuthIntakeMappingsResponse>> result =
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
        new GenericType<GitHubCloudAuthIntakeMappingsResponse>() {});
  }

  /**
   * List GitHub cloud authentication persona mappings.
   *
   * <p>See {@link #listGitHubCloudAuthPersonaMappingsWithHttpInfo}.
   *
   * @return GitHubCloudAuthPersonaMappingsResponse
   * @throws ApiException if fails to make API call
   */
  public GitHubCloudAuthPersonaMappingsResponse listGitHubCloudAuthPersonaMappings()
      throws ApiException {
    return listGitHubCloudAuthPersonaMappingsWithHttpInfo().getData();
  }

  /**
   * List GitHub cloud authentication persona mappings.
   *
   * <p>See {@link #listGitHubCloudAuthPersonaMappingsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;GitHubCloudAuthPersonaMappingsResponse&gt;
   */
  public CompletableFuture<GitHubCloudAuthPersonaMappingsResponse>
      listGitHubCloudAuthPersonaMappingsAsync() {
    return listGitHubCloudAuthPersonaMappingsWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List all GitHub cloud authentication persona mappings. This endpoint retrieves all configured
   * persona mappings that associate GitHub Actions OpenID Connect (OIDC) principals with Datadog
   * users. Mapped principals can request impersonation tokens.
   *
   * @return ApiResponse&lt;GitHubCloudAuthPersonaMappingsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<GitHubCloudAuthPersonaMappingsResponse>
      listGitHubCloudAuthPersonaMappingsWithHttpInfo() throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listGitHubCloudAuthPersonaMappings";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/cloud_auth/github/persona_mapping";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CloudAuthenticationApi.listGitHubCloudAuthPersonaMappings",
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
        new GenericType<GitHubCloudAuthPersonaMappingsResponse>() {});
  }

  /**
   * List GitHub cloud authentication persona mappings.
   *
   * <p>See {@link #listGitHubCloudAuthPersonaMappingsWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;GitHubCloudAuthPersonaMappingsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<GitHubCloudAuthPersonaMappingsResponse>>
      listGitHubCloudAuthPersonaMappingsWithHttpInfoAsync() {
    // Check if unstable operation is enabled
    String operationId = "listGitHubCloudAuthPersonaMappings";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<GitHubCloudAuthPersonaMappingsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/cloud_auth/github/persona_mapping";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CloudAuthenticationApi.listGitHubCloudAuthPersonaMappings",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<GitHubCloudAuthPersonaMappingsResponse>> result =
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
        new GenericType<GitHubCloudAuthPersonaMappingsResponse>() {});
  }
}
