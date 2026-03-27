
package com.datadog.api.client.v2.api;

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
import com.datadog.api.client.v2.model.ListFeatureFlagsResponse;
import com.datadog.api.client.v2.model.FeatureFlagResponse;
import com.datadog.api.client.v2.model.CreateFeatureFlagRequest;
import com.datadog.api.client.v2.model.ListEnvironmentsResponse;
import com.datadog.api.client.v2.model.EnvironmentResponse;
import com.datadog.api.client.v2.model.CreateEnvironmentRequest;
import com.datadog.api.client.v2.model.UpdateEnvironmentRequest;
import com.datadog.api.client.v2.model.UpdateFeatureFlagRequest;


@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FeatureFlagsApi {
  private ApiClient apiClient;
  public FeatureFlagsApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public FeatureFlagsApi(ApiClient apiClient) {
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
 * Archive a feature flag.
 *
 * See {@link #archiveFeatureFlagWithHttpInfo}.
 *
 * @param featureFlagId The ID of the feature flag. (required)
 * @return FeatureFlagResponse
 * @throws ApiException if fails to make API call
 */
  public FeatureFlagResponse  archiveFeatureFlag(UUID featureFlagId) throws ApiException {
    return archiveFeatureFlagWithHttpInfo(featureFlagId).getData();
  }

  /**
 * Archive a feature flag.
 *
 * See {@link #archiveFeatureFlagWithHttpInfoAsync}.
 *
 * @param featureFlagId The ID of the feature flag. (required)
 * @return CompletableFuture&lt;FeatureFlagResponse&gt;
 */
  public CompletableFuture<FeatureFlagResponse>archiveFeatureFlagAsync(UUID featureFlagId) {
    return archiveFeatureFlagWithHttpInfoAsync(featureFlagId).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Archives a feature flag. Archived flags are
   * hidden from the main list but remain accessible and can be unarchived.</p>
   *
   * @param featureFlagId The ID of the feature flag. (required)
   * @return ApiResponse&lt;FeatureFlagResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<FeatureFlagResponse> archiveFeatureFlagWithHttpInfo(UUID featureFlagId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'featureFlagId' is set
    if (featureFlagId == null) {
      throw new ApiException(400, "Missing the required parameter 'featureFlagId' when calling archiveFeatureFlag");
    }
    // create path and map variables
    String localVarPath = "/api/v2/feature-flags/{feature_flag_id}/archive"
      .replaceAll("\\{" + "feature_flag_id" + "\\}", apiClient.escapeString(featureFlagId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.FeatureFlagsApi.archiveFeatureFlag", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("POST", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<FeatureFlagResponse>() {});
  }

  /**
   * Archive a feature flag.
   *
   * See {@link #archiveFeatureFlagWithHttpInfo}.
   *
   * @param featureFlagId The ID of the feature flag. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;FeatureFlagResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<FeatureFlagResponse>> archiveFeatureFlagWithHttpInfoAsync(UUID featureFlagId) {
    Object localVarPostBody = null;

    // verify the required parameter 'featureFlagId' is set
    if (featureFlagId == null) {
        CompletableFuture<ApiResponse<FeatureFlagResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'featureFlagId' when calling archiveFeatureFlag"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/feature-flags/{feature_flag_id}/archive"
      .replaceAll("\\{" + "feature_flag_id" + "\\}", apiClient.escapeString(featureFlagId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.FeatureFlagsApi.archiveFeatureFlag", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<FeatureFlagResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("POST", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<FeatureFlagResponse>() {});
  }

  /**
 * Create a feature flag.
 *
 * See {@link #createFeatureFlagWithHttpInfo}.
 *
 * @param body  (required)
 * @return FeatureFlagResponse
 * @throws ApiException if fails to make API call
 */
  public FeatureFlagResponse  createFeatureFlag(CreateFeatureFlagRequest body) throws ApiException {
    return createFeatureFlagWithHttpInfo(body).getData();
  }

  /**
 * Create a feature flag.
 *
 * See {@link #createFeatureFlagWithHttpInfoAsync}.
 *
 * @param body  (required)
 * @return CompletableFuture&lt;FeatureFlagResponse&gt;
 */
  public CompletableFuture<FeatureFlagResponse>createFeatureFlagAsync(CreateFeatureFlagRequest body) {
    return createFeatureFlagWithHttpInfoAsync(body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Creates a new feature flag with variants.</p>
   *
   * @param body  (required)
   * @return ApiResponse&lt;FeatureFlagResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<FeatureFlagResponse> createFeatureFlagWithHttpInfo(CreateFeatureFlagRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createFeatureFlag");
    }
    // create path and map variables
    String localVarPath = "/api/v2/feature-flags";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.FeatureFlagsApi.createFeatureFlag", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<FeatureFlagResponse>() {});
  }

  /**
   * Create a feature flag.
   *
   * See {@link #createFeatureFlagWithHttpInfo}.
   *
   * @param body  (required)
   * @return CompletableFuture&lt;ApiResponse&lt;FeatureFlagResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<FeatureFlagResponse>> createFeatureFlagWithHttpInfoAsync(CreateFeatureFlagRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<FeatureFlagResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling createFeatureFlag"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/feature-flags";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.FeatureFlagsApi.createFeatureFlag", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<FeatureFlagResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<FeatureFlagResponse>() {});
  }

  /**
 * Create an environment.
 *
 * See {@link #createFeatureFlagsEnvironmentWithHttpInfo}.
 *
 * @param body  (required)
 * @return EnvironmentResponse
 * @throws ApiException if fails to make API call
 */
  public EnvironmentResponse  createFeatureFlagsEnvironment(CreateEnvironmentRequest body) throws ApiException {
    return createFeatureFlagsEnvironmentWithHttpInfo(body).getData();
  }

  /**
 * Create an environment.
 *
 * See {@link #createFeatureFlagsEnvironmentWithHttpInfoAsync}.
 *
 * @param body  (required)
 * @return CompletableFuture&lt;EnvironmentResponse&gt;
 */
  public CompletableFuture<EnvironmentResponse>createFeatureFlagsEnvironmentAsync(CreateEnvironmentRequest body) {
    return createFeatureFlagsEnvironmentWithHttpInfoAsync(body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Creates a new environment for organizing feature flags.</p>
   *
   * @param body  (required)
   * @return ApiResponse&lt;EnvironmentResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<EnvironmentResponse> createFeatureFlagsEnvironmentWithHttpInfo(CreateEnvironmentRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createFeatureFlagsEnvironment");
    }
    // create path and map variables
    String localVarPath = "/api/v2/feature-flags/environments";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.FeatureFlagsApi.createFeatureFlagsEnvironment", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<EnvironmentResponse>() {});
  }

  /**
   * Create an environment.
   *
   * See {@link #createFeatureFlagsEnvironmentWithHttpInfo}.
   *
   * @param body  (required)
   * @return CompletableFuture&lt;ApiResponse&lt;EnvironmentResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<EnvironmentResponse>> createFeatureFlagsEnvironmentWithHttpInfoAsync(CreateEnvironmentRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<EnvironmentResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling createFeatureFlagsEnvironment"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/feature-flags/environments";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.FeatureFlagsApi.createFeatureFlagsEnvironment", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<EnvironmentResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<EnvironmentResponse>() {});
  }

  /**
 * Delete an environment.
 *
 * See {@link #deleteFeatureFlagsEnvironmentWithHttpInfo}.
 *
 * @param environmentId The ID of the environment. (required)
 * @throws ApiException if fails to make API call
 */
  public  void  deleteFeatureFlagsEnvironment(UUID environmentId) throws ApiException {
    deleteFeatureFlagsEnvironmentWithHttpInfo(environmentId);
  }

  /**
 * Delete an environment.
 *
 * See {@link #deleteFeatureFlagsEnvironmentWithHttpInfoAsync}.
 *
 * @param environmentId The ID of the environment. (required)
 * @return CompletableFuture
 */
  public CompletableFuture<Void>deleteFeatureFlagsEnvironmentAsync(UUID environmentId) {
    return deleteFeatureFlagsEnvironmentWithHttpInfoAsync(environmentId).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Deletes an environment. This operation cannot be undone.</p>
   *
   * @param environmentId The ID of the environment. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteFeatureFlagsEnvironmentWithHttpInfo(UUID environmentId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'environmentId' is set
    if (environmentId == null) {
      throw new ApiException(400, "Missing the required parameter 'environmentId' when calling deleteFeatureFlagsEnvironment");
    }
    // create path and map variables
    String localVarPath = "/api/v2/feature-flags/environments/{environment_id}"
      .replaceAll("\\{" + "environment_id" + "\\}", apiClient.escapeString(environmentId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.FeatureFlagsApi.deleteFeatureFlagsEnvironment", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("DELETE", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
   * Delete an environment.
   *
   * See {@link #deleteFeatureFlagsEnvironmentWithHttpInfo}.
   *
   * @param environmentId The ID of the environment. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteFeatureFlagsEnvironmentWithHttpInfoAsync(UUID environmentId) {
    Object localVarPostBody = null;

    // verify the required parameter 'environmentId' is set
    if (environmentId == null) {
        CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'environmentId' when calling deleteFeatureFlagsEnvironment"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/feature-flags/environments/{environment_id}"
      .replaceAll("\\{" + "environment_id" + "\\}", apiClient.escapeString(environmentId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.FeatureFlagsApi.deleteFeatureFlagsEnvironment", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("DELETE", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
 * Disable a feature flag in an environment.
 *
 * See {@link #disableFeatureFlagEnvironmentWithHttpInfo}.
 *
 * @param featureFlagId The ID of the feature flag. (required)
 * @param environmentId The ID of the environment. (required)
 * @throws ApiException if fails to make API call
 */
  public  void  disableFeatureFlagEnvironment(UUID featureFlagId, UUID environmentId) throws ApiException {
    disableFeatureFlagEnvironmentWithHttpInfo(featureFlagId, environmentId);
  }

  /**
 * Disable a feature flag in an environment.
 *
 * See {@link #disableFeatureFlagEnvironmentWithHttpInfoAsync}.
 *
 * @param featureFlagId The ID of the feature flag. (required)
 * @param environmentId The ID of the environment. (required)
 * @return CompletableFuture
 */
  public CompletableFuture<Void>disableFeatureFlagEnvironmentAsync(UUID featureFlagId, UUID environmentId) {
    return disableFeatureFlagEnvironmentWithHttpInfoAsync(featureFlagId, environmentId).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Disable a feature flag in a specific environment.</p>
   *
   * @param featureFlagId The ID of the feature flag. (required)
   * @param environmentId The ID of the environment. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 202 </td><td> Accepted - Approval required for this change </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> disableFeatureFlagEnvironmentWithHttpInfo(UUID featureFlagId, UUID environmentId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'featureFlagId' is set
    if (featureFlagId == null) {
      throw new ApiException(400, "Missing the required parameter 'featureFlagId' when calling disableFeatureFlagEnvironment");
    }

    // verify the required parameter 'environmentId' is set
    if (environmentId == null) {
      throw new ApiException(400, "Missing the required parameter 'environmentId' when calling disableFeatureFlagEnvironment");
    }
    // create path and map variables
    String localVarPath = "/api/v2/feature-flags/{feature_flag_id}/environments/{environment_id}/disable"
      .replaceAll("\\{" + "feature_flag_id" + "\\}", apiClient.escapeString(featureFlagId.toString()))
      .replaceAll("\\{" + "environment_id" + "\\}", apiClient.escapeString(environmentId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.FeatureFlagsApi.disableFeatureFlagEnvironment", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("POST", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
   * Disable a feature flag in an environment.
   *
   * See {@link #disableFeatureFlagEnvironmentWithHttpInfo}.
   *
   * @param featureFlagId The ID of the feature flag. (required)
   * @param environmentId The ID of the environment. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> disableFeatureFlagEnvironmentWithHttpInfoAsync(UUID featureFlagId, UUID environmentId) {
    Object localVarPostBody = null;

    // verify the required parameter 'featureFlagId' is set
    if (featureFlagId == null) {
        CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'featureFlagId' when calling disableFeatureFlagEnvironment"));
        return result;
    }

    // verify the required parameter 'environmentId' is set
    if (environmentId == null) {
        CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'environmentId' when calling disableFeatureFlagEnvironment"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/feature-flags/{feature_flag_id}/environments/{environment_id}/disable"
      .replaceAll("\\{" + "feature_flag_id" + "\\}", apiClient.escapeString(featureFlagId.toString()))
      .replaceAll("\\{" + "environment_id" + "\\}", apiClient.escapeString(environmentId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.FeatureFlagsApi.disableFeatureFlagEnvironment", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("POST", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
 * Enable a feature flag in an environment.
 *
 * See {@link #enableFeatureFlagEnvironmentWithHttpInfo}.
 *
 * @param featureFlagId The ID of the feature flag. (required)
 * @param environmentId The ID of the environment. (required)
 * @throws ApiException if fails to make API call
 */
  public  void  enableFeatureFlagEnvironment(UUID featureFlagId, UUID environmentId) throws ApiException {
    enableFeatureFlagEnvironmentWithHttpInfo(featureFlagId, environmentId);
  }

  /**
 * Enable a feature flag in an environment.
 *
 * See {@link #enableFeatureFlagEnvironmentWithHttpInfoAsync}.
 *
 * @param featureFlagId The ID of the feature flag. (required)
 * @param environmentId The ID of the environment. (required)
 * @return CompletableFuture
 */
  public CompletableFuture<Void>enableFeatureFlagEnvironmentAsync(UUID featureFlagId, UUID environmentId) {
    return enableFeatureFlagEnvironmentWithHttpInfoAsync(featureFlagId, environmentId).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Enable a feature flag in a specific environment.</p>
   *
   * @param featureFlagId The ID of the feature flag. (required)
   * @param environmentId The ID of the environment. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 202 </td><td> Accepted - Approval required for this change </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> enableFeatureFlagEnvironmentWithHttpInfo(UUID featureFlagId, UUID environmentId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'featureFlagId' is set
    if (featureFlagId == null) {
      throw new ApiException(400, "Missing the required parameter 'featureFlagId' when calling enableFeatureFlagEnvironment");
    }

    // verify the required parameter 'environmentId' is set
    if (environmentId == null) {
      throw new ApiException(400, "Missing the required parameter 'environmentId' when calling enableFeatureFlagEnvironment");
    }
    // create path and map variables
    String localVarPath = "/api/v2/feature-flags/{feature_flag_id}/environments/{environment_id}/enable"
      .replaceAll("\\{" + "feature_flag_id" + "\\}", apiClient.escapeString(featureFlagId.toString()))
      .replaceAll("\\{" + "environment_id" + "\\}", apiClient.escapeString(environmentId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.FeatureFlagsApi.enableFeatureFlagEnvironment", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("POST", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
   * Enable a feature flag in an environment.
   *
   * See {@link #enableFeatureFlagEnvironmentWithHttpInfo}.
   *
   * @param featureFlagId The ID of the feature flag. (required)
   * @param environmentId The ID of the environment. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> enableFeatureFlagEnvironmentWithHttpInfoAsync(UUID featureFlagId, UUID environmentId) {
    Object localVarPostBody = null;

    // verify the required parameter 'featureFlagId' is set
    if (featureFlagId == null) {
        CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'featureFlagId' when calling enableFeatureFlagEnvironment"));
        return result;
    }

    // verify the required parameter 'environmentId' is set
    if (environmentId == null) {
        CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'environmentId' when calling enableFeatureFlagEnvironment"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/feature-flags/{feature_flag_id}/environments/{environment_id}/enable"
      .replaceAll("\\{" + "feature_flag_id" + "\\}", apiClient.escapeString(featureFlagId.toString()))
      .replaceAll("\\{" + "environment_id" + "\\}", apiClient.escapeString(environmentId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.FeatureFlagsApi.enableFeatureFlagEnvironment", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("POST", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
 * Get a feature flag.
 *
 * See {@link #getFeatureFlagWithHttpInfo}.
 *
 * @param featureFlagId The ID of the feature flag. (required)
 * @return FeatureFlagResponse
 * @throws ApiException if fails to make API call
 */
  public FeatureFlagResponse  getFeatureFlag(UUID featureFlagId) throws ApiException {
    return getFeatureFlagWithHttpInfo(featureFlagId).getData();
  }

  /**
 * Get a feature flag.
 *
 * See {@link #getFeatureFlagWithHttpInfoAsync}.
 *
 * @param featureFlagId The ID of the feature flag. (required)
 * @return CompletableFuture&lt;FeatureFlagResponse&gt;
 */
  public CompletableFuture<FeatureFlagResponse>getFeatureFlagAsync(UUID featureFlagId) {
    return getFeatureFlagWithHttpInfoAsync(featureFlagId).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Returns the details of a specific feature flag
   * including variants and environment status.</p>
   *
   * @param featureFlagId The ID of the feature flag. (required)
   * @return ApiResponse&lt;FeatureFlagResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<FeatureFlagResponse> getFeatureFlagWithHttpInfo(UUID featureFlagId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'featureFlagId' is set
    if (featureFlagId == null) {
      throw new ApiException(400, "Missing the required parameter 'featureFlagId' when calling getFeatureFlag");
    }
    // create path and map variables
    String localVarPath = "/api/v2/feature-flags/{feature_flag_id}"
      .replaceAll("\\{" + "feature_flag_id" + "\\}", apiClient.escapeString(featureFlagId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.FeatureFlagsApi.getFeatureFlag", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<FeatureFlagResponse>() {});
  }

  /**
   * Get a feature flag.
   *
   * See {@link #getFeatureFlagWithHttpInfo}.
   *
   * @param featureFlagId The ID of the feature flag. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;FeatureFlagResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<FeatureFlagResponse>> getFeatureFlagWithHttpInfoAsync(UUID featureFlagId) {
    Object localVarPostBody = null;

    // verify the required parameter 'featureFlagId' is set
    if (featureFlagId == null) {
        CompletableFuture<ApiResponse<FeatureFlagResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'featureFlagId' when calling getFeatureFlag"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/feature-flags/{feature_flag_id}"
      .replaceAll("\\{" + "feature_flag_id" + "\\}", apiClient.escapeString(featureFlagId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.FeatureFlagsApi.getFeatureFlag", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<FeatureFlagResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<FeatureFlagResponse>() {});
  }

  /**
 * Get an environment.
 *
 * See {@link #getFeatureFlagsEnvironmentWithHttpInfo}.
 *
 * @param environmentId The ID of the environment. (required)
 * @return EnvironmentResponse
 * @throws ApiException if fails to make API call
 */
  public EnvironmentResponse  getFeatureFlagsEnvironment(UUID environmentId) throws ApiException {
    return getFeatureFlagsEnvironmentWithHttpInfo(environmentId).getData();
  }

  /**
 * Get an environment.
 *
 * See {@link #getFeatureFlagsEnvironmentWithHttpInfoAsync}.
 *
 * @param environmentId The ID of the environment. (required)
 * @return CompletableFuture&lt;EnvironmentResponse&gt;
 */
  public CompletableFuture<EnvironmentResponse>getFeatureFlagsEnvironmentAsync(UUID environmentId) {
    return getFeatureFlagsEnvironmentWithHttpInfoAsync(environmentId).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Returns the details of a specific environment.</p>
   *
   * @param environmentId The ID of the environment. (required)
   * @return ApiResponse&lt;EnvironmentResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<EnvironmentResponse> getFeatureFlagsEnvironmentWithHttpInfo(UUID environmentId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'environmentId' is set
    if (environmentId == null) {
      throw new ApiException(400, "Missing the required parameter 'environmentId' when calling getFeatureFlagsEnvironment");
    }
    // create path and map variables
    String localVarPath = "/api/v2/feature-flags/environments/{environment_id}"
      .replaceAll("\\{" + "environment_id" + "\\}", apiClient.escapeString(environmentId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.FeatureFlagsApi.getFeatureFlagsEnvironment", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<EnvironmentResponse>() {});
  }

  /**
   * Get an environment.
   *
   * See {@link #getFeatureFlagsEnvironmentWithHttpInfo}.
   *
   * @param environmentId The ID of the environment. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;EnvironmentResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<EnvironmentResponse>> getFeatureFlagsEnvironmentWithHttpInfoAsync(UUID environmentId) {
    Object localVarPostBody = null;

    // verify the required parameter 'environmentId' is set
    if (environmentId == null) {
        CompletableFuture<ApiResponse<EnvironmentResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'environmentId' when calling getFeatureFlagsEnvironment"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/feature-flags/environments/{environment_id}"
      .replaceAll("\\{" + "environment_id" + "\\}", apiClient.escapeString(environmentId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.FeatureFlagsApi.getFeatureFlagsEnvironment", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<EnvironmentResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<EnvironmentResponse>() {});
  }

  /**
   * Manage optional parameters to listFeatureFlags.
   */
  public static class ListFeatureFlagsOptionalParameters {
    private String key;
    private Boolean isArchived;
    private Integer limit;
    private Integer offset;

    /**
     * Set key.
     * @param key Filter feature flags by key (partial matching). (optional)
     * @return ListFeatureFlagsOptionalParameters
     */
    public ListFeatureFlagsOptionalParameters key(String key) {
      this.key = key;
      return this;
    }

    /**
     * Set isArchived.
     * @param isArchived Filter by archived status. (optional)
     * @return ListFeatureFlagsOptionalParameters
     */
    public ListFeatureFlagsOptionalParameters isArchived(Boolean isArchived) {
      this.isArchived = isArchived;
      return this;
    }

    /**
     * Set limit.
     * @param limit Maximum number of results to return. (optional, default to 100)
     * @return ListFeatureFlagsOptionalParameters
     */
    public ListFeatureFlagsOptionalParameters limit(Integer limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set offset.
     * @param offset Number of results to skip. (optional, default to 0)
     * @return ListFeatureFlagsOptionalParameters
     */
    public ListFeatureFlagsOptionalParameters offset(Integer offset) {
      this.offset = offset;
      return this;
    }
  }

  /**
 * List feature flags.
 *
 * See {@link #listFeatureFlagsWithHttpInfo}.
 *
 * @return ListFeatureFlagsResponse
 * @throws ApiException if fails to make API call
 */
  public ListFeatureFlagsResponse listFeatureFlags () throws ApiException {
    return listFeatureFlagsWithHttpInfo(new ListFeatureFlagsOptionalParameters()).getData();
  }

  /**
 * List feature flags.
 *
 * See {@link #listFeatureFlagsWithHttpInfoAsync}.
 *
 * @return CompletableFuture&lt;ListFeatureFlagsResponse&gt;
 */
  public CompletableFuture<ListFeatureFlagsResponse>listFeatureFlagsAsync() {
    return listFeatureFlagsWithHttpInfoAsync(new ListFeatureFlagsOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * List feature flags.
 *
 * See {@link #listFeatureFlagsWithHttpInfo}.
 *
 * @param parameters Optional parameters for the request.
 * @return ListFeatureFlagsResponse
 * @throws ApiException if fails to make API call
 */
  public ListFeatureFlagsResponse listFeatureFlags(ListFeatureFlagsOptionalParameters parameters) throws ApiException {
    return listFeatureFlagsWithHttpInfo(parameters).getData();
  }

  /**
 * List feature flags.
 *
 * See {@link #listFeatureFlagsWithHttpInfoAsync}.
 *
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;ListFeatureFlagsResponse&gt;
 */
  public CompletableFuture<ListFeatureFlagsResponse>listFeatureFlagsAsync(ListFeatureFlagsOptionalParameters parameters) {
    return listFeatureFlagsWithHttpInfoAsync(parameters).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Returns a list of feature flags for the organization.
   * Supports filtering by key and archived status.</p>
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;ListFeatureFlagsResponse&gt;
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
  public ApiResponse<ListFeatureFlagsResponse> listFeatureFlagsWithHttpInfo(ListFeatureFlagsOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    String key = parameters.key;
    Boolean isArchived = parameters.isArchived;
    Integer limit = parameters.limit;
    Integer offset = parameters.offset;
    // create path and map variables
    String localVarPath = "/api/v2/feature-flags";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "key", key));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "is_archived", isArchived));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));

    Invocation.Builder builder = apiClient.createBuilder("v2.FeatureFlagsApi.listFeatureFlags", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<ListFeatureFlagsResponse>() {});
  }

  /**
   * List feature flags.
   *
   * See {@link #listFeatureFlagsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;ListFeatureFlagsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ListFeatureFlagsResponse>> listFeatureFlagsWithHttpInfoAsync(ListFeatureFlagsOptionalParameters parameters) {
    Object localVarPostBody = null;
    String key = parameters.key;
    Boolean isArchived = parameters.isArchived;
    Integer limit = parameters.limit;
    Integer offset = parameters.offset;
    // create path and map variables
    String localVarPath = "/api/v2/feature-flags";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "key", key));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "is_archived", isArchived));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.FeatureFlagsApi.listFeatureFlags", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ListFeatureFlagsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<ListFeatureFlagsResponse>() {});
  }

  /**
   * Manage optional parameters to listFeatureFlagsEnvironments.
   */
  public static class ListFeatureFlagsEnvironmentsOptionalParameters {
    private String name;
    private String key;
    private Integer limit;
    private Integer offset;

    /**
     * Set name.
     * @param name Filter environments by name (partial matching). (optional)
     * @return ListFeatureFlagsEnvironmentsOptionalParameters
     */
    public ListFeatureFlagsEnvironmentsOptionalParameters name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set key.
     * @param key Filter environments by key (partial matching). (optional)
     * @return ListFeatureFlagsEnvironmentsOptionalParameters
     */
    public ListFeatureFlagsEnvironmentsOptionalParameters key(String key) {
      this.key = key;
      return this;
    }

    /**
     * Set limit.
     * @param limit Maximum number of results to return. (optional, default to 100)
     * @return ListFeatureFlagsEnvironmentsOptionalParameters
     */
    public ListFeatureFlagsEnvironmentsOptionalParameters limit(Integer limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set offset.
     * @param offset Number of results to skip. (optional, default to 0)
     * @return ListFeatureFlagsEnvironmentsOptionalParameters
     */
    public ListFeatureFlagsEnvironmentsOptionalParameters offset(Integer offset) {
      this.offset = offset;
      return this;
    }
  }

  /**
 * List environments.
 *
 * See {@link #listFeatureFlagsEnvironmentsWithHttpInfo}.
 *
 * @return ListEnvironmentsResponse
 * @throws ApiException if fails to make API call
 */
  public ListEnvironmentsResponse listFeatureFlagsEnvironments () throws ApiException {
    return listFeatureFlagsEnvironmentsWithHttpInfo(new ListFeatureFlagsEnvironmentsOptionalParameters()).getData();
  }

  /**
 * List environments.
 *
 * See {@link #listFeatureFlagsEnvironmentsWithHttpInfoAsync}.
 *
 * @return CompletableFuture&lt;ListEnvironmentsResponse&gt;
 */
  public CompletableFuture<ListEnvironmentsResponse>listFeatureFlagsEnvironmentsAsync() {
    return listFeatureFlagsEnvironmentsWithHttpInfoAsync(new ListFeatureFlagsEnvironmentsOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * List environments.
 *
 * See {@link #listFeatureFlagsEnvironmentsWithHttpInfo}.
 *
 * @param parameters Optional parameters for the request.
 * @return ListEnvironmentsResponse
 * @throws ApiException if fails to make API call
 */
  public ListEnvironmentsResponse listFeatureFlagsEnvironments(ListFeatureFlagsEnvironmentsOptionalParameters parameters) throws ApiException {
    return listFeatureFlagsEnvironmentsWithHttpInfo(parameters).getData();
  }

  /**
 * List environments.
 *
 * See {@link #listFeatureFlagsEnvironmentsWithHttpInfoAsync}.
 *
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;ListEnvironmentsResponse&gt;
 */
  public CompletableFuture<ListEnvironmentsResponse>listFeatureFlagsEnvironmentsAsync(ListFeatureFlagsEnvironmentsOptionalParameters parameters) {
    return listFeatureFlagsEnvironmentsWithHttpInfoAsync(parameters).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Returns a list of environments for the organization.
   * Supports filtering by name and key.</p>
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;ListEnvironmentsResponse&gt;
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
  public ApiResponse<ListEnvironmentsResponse> listFeatureFlagsEnvironmentsWithHttpInfo(ListFeatureFlagsEnvironmentsOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    String name = parameters.name;
    String key = parameters.key;
    Integer limit = parameters.limit;
    Integer offset = parameters.offset;
    // create path and map variables
    String localVarPath = "/api/v2/feature-flags/environments";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "name", name));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "key", key));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));

    Invocation.Builder builder = apiClient.createBuilder("v2.FeatureFlagsApi.listFeatureFlagsEnvironments", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<ListEnvironmentsResponse>() {});
  }

  /**
   * List environments.
   *
   * See {@link #listFeatureFlagsEnvironmentsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;ListEnvironmentsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ListEnvironmentsResponse>> listFeatureFlagsEnvironmentsWithHttpInfoAsync(ListFeatureFlagsEnvironmentsOptionalParameters parameters) {
    Object localVarPostBody = null;
    String name = parameters.name;
    String key = parameters.key;
    Integer limit = parameters.limit;
    Integer offset = parameters.offset;
    // create path and map variables
    String localVarPath = "/api/v2/feature-flags/environments";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "name", name));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "key", key));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.FeatureFlagsApi.listFeatureFlagsEnvironments", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ListEnvironmentsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<ListEnvironmentsResponse>() {});
  }

  /**
 * Unarchive a feature flag.
 *
 * See {@link #unarchiveFeatureFlagWithHttpInfo}.
 *
 * @param featureFlagId The ID of the feature flag. (required)
 * @return FeatureFlagResponse
 * @throws ApiException if fails to make API call
 */
  public FeatureFlagResponse  unarchiveFeatureFlag(UUID featureFlagId) throws ApiException {
    return unarchiveFeatureFlagWithHttpInfo(featureFlagId).getData();
  }

  /**
 * Unarchive a feature flag.
 *
 * See {@link #unarchiveFeatureFlagWithHttpInfoAsync}.
 *
 * @param featureFlagId The ID of the feature flag. (required)
 * @return CompletableFuture&lt;FeatureFlagResponse&gt;
 */
  public CompletableFuture<FeatureFlagResponse>unarchiveFeatureFlagAsync(UUID featureFlagId) {
    return unarchiveFeatureFlagWithHttpInfoAsync(featureFlagId).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Unarchives a previously archived feature flag,
   * making it visible in the main list again.</p>
   *
   * @param featureFlagId The ID of the feature flag. (required)
   * @return ApiResponse&lt;FeatureFlagResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<FeatureFlagResponse> unarchiveFeatureFlagWithHttpInfo(UUID featureFlagId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'featureFlagId' is set
    if (featureFlagId == null) {
      throw new ApiException(400, "Missing the required parameter 'featureFlagId' when calling unarchiveFeatureFlag");
    }
    // create path and map variables
    String localVarPath = "/api/v2/feature-flags/{feature_flag_id}/unarchive"
      .replaceAll("\\{" + "feature_flag_id" + "\\}", apiClient.escapeString(featureFlagId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.FeatureFlagsApi.unarchiveFeatureFlag", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("POST", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<FeatureFlagResponse>() {});
  }

  /**
   * Unarchive a feature flag.
   *
   * See {@link #unarchiveFeatureFlagWithHttpInfo}.
   *
   * @param featureFlagId The ID of the feature flag. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;FeatureFlagResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<FeatureFlagResponse>> unarchiveFeatureFlagWithHttpInfoAsync(UUID featureFlagId) {
    Object localVarPostBody = null;

    // verify the required parameter 'featureFlagId' is set
    if (featureFlagId == null) {
        CompletableFuture<ApiResponse<FeatureFlagResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'featureFlagId' when calling unarchiveFeatureFlag"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/feature-flags/{feature_flag_id}/unarchive"
      .replaceAll("\\{" + "feature_flag_id" + "\\}", apiClient.escapeString(featureFlagId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.FeatureFlagsApi.unarchiveFeatureFlag", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<FeatureFlagResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("POST", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<FeatureFlagResponse>() {});
  }

  /**
 * Update a feature flag.
 *
 * See {@link #updateFeatureFlagWithHttpInfo}.
 *
 * @param featureFlagId The ID of the feature flag. (required)
 * @param body  (required)
 * @return FeatureFlagResponse
 * @throws ApiException if fails to make API call
 */
  public FeatureFlagResponse  updateFeatureFlag(UUID featureFlagId, UpdateFeatureFlagRequest body) throws ApiException {
    return updateFeatureFlagWithHttpInfo(featureFlagId, body).getData();
  }

  /**
 * Update a feature flag.
 *
 * See {@link #updateFeatureFlagWithHttpInfoAsync}.
 *
 * @param featureFlagId The ID of the feature flag. (required)
 * @param body  (required)
 * @return CompletableFuture&lt;FeatureFlagResponse&gt;
 */
  public CompletableFuture<FeatureFlagResponse>updateFeatureFlagAsync(UUID featureFlagId, UpdateFeatureFlagRequest body) {
    return updateFeatureFlagWithHttpInfoAsync(featureFlagId, body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Updates an existing feature flag's metadata such as
   *  name and description. Does not modify targeting rules or allocations.</p>
   *
   * @param featureFlagId The ID of the feature flag. (required)
   * @param body  (required)
   * @return ApiResponse&lt;FeatureFlagResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<FeatureFlagResponse> updateFeatureFlagWithHttpInfo(UUID featureFlagId, UpdateFeatureFlagRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'featureFlagId' is set
    if (featureFlagId == null) {
      throw new ApiException(400, "Missing the required parameter 'featureFlagId' when calling updateFeatureFlag");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateFeatureFlag");
    }
    // create path and map variables
    String localVarPath = "/api/v2/feature-flags/{feature_flag_id}"
      .replaceAll("\\{" + "feature_flag_id" + "\\}", apiClient.escapeString(featureFlagId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.FeatureFlagsApi.updateFeatureFlag", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("PUT", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<FeatureFlagResponse>() {});
  }

  /**
   * Update a feature flag.
   *
   * See {@link #updateFeatureFlagWithHttpInfo}.
   *
   * @param featureFlagId The ID of the feature flag. (required)
   * @param body  (required)
   * @return CompletableFuture&lt;ApiResponse&lt;FeatureFlagResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<FeatureFlagResponse>> updateFeatureFlagWithHttpInfoAsync(UUID featureFlagId, UpdateFeatureFlagRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'featureFlagId' is set
    if (featureFlagId == null) {
        CompletableFuture<ApiResponse<FeatureFlagResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'featureFlagId' when calling updateFeatureFlag"));
        return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<FeatureFlagResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling updateFeatureFlag"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/feature-flags/{feature_flag_id}"
      .replaceAll("\\{" + "feature_flag_id" + "\\}", apiClient.escapeString(featureFlagId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.FeatureFlagsApi.updateFeatureFlag", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<FeatureFlagResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("PUT", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<FeatureFlagResponse>() {});
  }

  /**
 * Update an environment.
 *
 * See {@link #updateFeatureFlagsEnvironmentWithHttpInfo}.
 *
 * @param environmentId The ID of the environment. (required)
 * @param body  (required)
 * @return EnvironmentResponse
 * @throws ApiException if fails to make API call
 */
  public EnvironmentResponse  updateFeatureFlagsEnvironment(UUID environmentId, UpdateEnvironmentRequest body) throws ApiException {
    return updateFeatureFlagsEnvironmentWithHttpInfo(environmentId, body).getData();
  }

  /**
 * Update an environment.
 *
 * See {@link #updateFeatureFlagsEnvironmentWithHttpInfoAsync}.
 *
 * @param environmentId The ID of the environment. (required)
 * @param body  (required)
 * @return CompletableFuture&lt;EnvironmentResponse&gt;
 */
  public CompletableFuture<EnvironmentResponse>updateFeatureFlagsEnvironmentAsync(UUID environmentId, UpdateEnvironmentRequest body) {
    return updateFeatureFlagsEnvironmentWithHttpInfoAsync(environmentId, body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Updates an existing environment's metadata such as
   *  name and description.</p>
   *
   * @param environmentId The ID of the environment. (required)
   * @param body  (required)
   * @return ApiResponse&lt;EnvironmentResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<EnvironmentResponse> updateFeatureFlagsEnvironmentWithHttpInfo(UUID environmentId, UpdateEnvironmentRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'environmentId' is set
    if (environmentId == null) {
      throw new ApiException(400, "Missing the required parameter 'environmentId' when calling updateFeatureFlagsEnvironment");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateFeatureFlagsEnvironment");
    }
    // create path and map variables
    String localVarPath = "/api/v2/feature-flags/environments/{environment_id}"
      .replaceAll("\\{" + "environment_id" + "\\}", apiClient.escapeString(environmentId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.FeatureFlagsApi.updateFeatureFlagsEnvironment", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("PUT", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<EnvironmentResponse>() {});
  }

  /**
   * Update an environment.
   *
   * See {@link #updateFeatureFlagsEnvironmentWithHttpInfo}.
   *
   * @param environmentId The ID of the environment. (required)
   * @param body  (required)
   * @return CompletableFuture&lt;ApiResponse&lt;EnvironmentResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<EnvironmentResponse>> updateFeatureFlagsEnvironmentWithHttpInfoAsync(UUID environmentId, UpdateEnvironmentRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'environmentId' is set
    if (environmentId == null) {
        CompletableFuture<ApiResponse<EnvironmentResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'environmentId' when calling updateFeatureFlagsEnvironment"));
        return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<EnvironmentResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling updateFeatureFlagsEnvironment"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/feature-flags/environments/{environment_id}"
      .replaceAll("\\{" + "environment_id" + "\\}", apiClient.escapeString(environmentId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.FeatureFlagsApi.updateFeatureFlagsEnvironment", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<EnvironmentResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("PUT", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<EnvironmentResponse>() {});
  }
}