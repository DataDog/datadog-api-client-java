package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.ModelLabFacetKeysResponse;
import com.datadog.api.client.v2.model.ModelLabFacetType;
import com.datadog.api.client.v2.model.ModelLabFacetValuesResponse;
import com.datadog.api.client.v2.model.ModelLabProjectArtifactsResponse;
import com.datadog.api.client.v2.model.ModelLabProjectFacetType;
import com.datadog.api.client.v2.model.ModelLabProjectResponse;
import com.datadog.api.client.v2.model.ModelLabProjectsResponse;
import com.datadog.api.client.v2.model.ModelLabRunArtifactsResponse;
import com.datadog.api.client.v2.model.ModelLabRunResponse;
import com.datadog.api.client.v2.model.ModelLabRunStatus;
import com.datadog.api.client.v2.model.ModelLabRunsResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ModelLabApiApi {
  private ApiClient apiClient;

  public ModelLabApiApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public ModelLabApiApi(ApiClient apiClient) {
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
   * Delete a Model Lab run.
   *
   * <p>See {@link #deleteModelLabRunWithHttpInfo}.
   *
   * @param runId The ID of the Model Lab run. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteModelLabRun(Long runId) throws ApiException {
    deleteModelLabRunWithHttpInfo(runId);
  }

  /**
   * Delete a Model Lab run.
   *
   * <p>See {@link #deleteModelLabRunWithHttpInfoAsync}.
   *
   * @param runId The ID of the Model Lab run. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteModelLabRunAsync(Long runId) {
    return deleteModelLabRunWithHttpInfoAsync(runId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete a Model Lab run by its ID.
   *
   * @param runId The ID of the Model Lab run. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteModelLabRunWithHttpInfo(Long runId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteModelLabRun";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'runId' is set
    if (runId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'runId' when calling deleteModelLabRun");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/model-lab-api/runs/{run_id}"
            .replaceAll("\\{" + "run_id" + "\\}", apiClient.escapeString(runId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ModelLabApiApi.deleteModelLabRun",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
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
   * Delete a Model Lab run.
   *
   * <p>See {@link #deleteModelLabRunWithHttpInfo}.
   *
   * @param runId The ID of the Model Lab run. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteModelLabRunWithHttpInfoAsync(Long runId) {
    // Check if unstable operation is enabled
    String operationId = "deleteModelLabRun";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'runId' is set
    if (runId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'runId' when calling deleteModelLabRun"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/model-lab-api/runs/{run_id}"
            .replaceAll("\\{" + "run_id" + "\\}", apiClient.escapeString(runId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ModelLabApiApi.deleteModelLabRun",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"*/*"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
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
   * Get Model Lab artifact content.
   *
   * <p>See {@link #getModelLabArtifactContentWithHttpInfo}.
   *
   * @param projectId ID of the project. (required)
   * @param artifactPath Path to the artifact relative to the project directory. (required)
   * @return File
   * @throws ApiException if fails to make API call
   */
  public File getModelLabArtifactContent(String projectId, String artifactPath)
      throws ApiException {
    return getModelLabArtifactContentWithHttpInfo(projectId, artifactPath).getData();
  }

  /**
   * Get Model Lab artifact content.
   *
   * <p>See {@link #getModelLabArtifactContentWithHttpInfoAsync}.
   *
   * @param projectId ID of the project. (required)
   * @param artifactPath Path to the artifact relative to the project directory. (required)
   * @return CompletableFuture&lt;File&gt;
   */
  public CompletableFuture<File> getModelLabArtifactContentAsync(
      String projectId, String artifactPath) {
    return getModelLabArtifactContentWithHttpInfoAsync(projectId, artifactPath)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Download the raw content of a Model Lab artifact file.
   *
   * @param projectId ID of the project. (required)
   * @param artifactPath Path to the artifact relative to the project directory. (required)
   * @return ApiResponse&lt;File&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<File> getModelLabArtifactContentWithHttpInfo(
      String projectId, String artifactPath) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getModelLabArtifactContent";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'projectId' when calling getModelLabArtifactContent");
    }

    // verify the required parameter 'artifactPath' is set
    if (artifactPath == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'artifactPath' when calling getModelLabArtifactContent");
    }
    // create path and map variables
    String localVarPath = "/api/v2/model-lab-api/artifacts/content";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "project_id", projectId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "artifact_path", artifactPath));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ModelLabApiApi.getModelLabArtifactContent",
            localVarPath,
            localVarQueryParams,
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/octet-stream", "application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<File>() {});
  }

  /**
   * Get Model Lab artifact content.
   *
   * <p>See {@link #getModelLabArtifactContentWithHttpInfo}.
   *
   * @param projectId ID of the project. (required)
   * @param artifactPath Path to the artifact relative to the project directory. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;File&gt;&gt;
   */
  public CompletableFuture<ApiResponse<File>> getModelLabArtifactContentWithHttpInfoAsync(
      String projectId, String artifactPath) {
    // Check if unstable operation is enabled
    String operationId = "getModelLabArtifactContent";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<File>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      CompletableFuture<ApiResponse<File>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'projectId' when calling"
                  + " getModelLabArtifactContent"));
      return result;
    }

    // verify the required parameter 'artifactPath' is set
    if (artifactPath == null) {
      CompletableFuture<ApiResponse<File>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'artifactPath' when calling"
                  + " getModelLabArtifactContent"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/model-lab-api/artifacts/content";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "project_id", projectId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "artifact_path", artifactPath));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ModelLabApiApi.getModelLabArtifactContent",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/octet-stream", "application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<File>> result = new CompletableFuture<>();
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
        new GenericType<File>() {});
  }

  /**
   * Get a Model Lab project.
   *
   * <p>See {@link #getModelLabProjectWithHttpInfo}.
   *
   * @param projectId The ID of the Model Lab project. (required)
   * @return ModelLabProjectResponse
   * @throws ApiException if fails to make API call
   */
  public ModelLabProjectResponse getModelLabProject(Long projectId) throws ApiException {
    return getModelLabProjectWithHttpInfo(projectId).getData();
  }

  /**
   * Get a Model Lab project.
   *
   * <p>See {@link #getModelLabProjectWithHttpInfoAsync}.
   *
   * @param projectId The ID of the Model Lab project. (required)
   * @return CompletableFuture&lt;ModelLabProjectResponse&gt;
   */
  public CompletableFuture<ModelLabProjectResponse> getModelLabProjectAsync(Long projectId) {
    return getModelLabProjectWithHttpInfoAsync(projectId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a single Model Lab project by its ID.
   *
   * @param projectId The ID of the Model Lab project. (required)
   * @return ApiResponse&lt;ModelLabProjectResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ModelLabProjectResponse> getModelLabProjectWithHttpInfo(Long projectId)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getModelLabProject";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'projectId' when calling getModelLabProject");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/model-lab-api/projects/{project_id}"
            .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ModelLabApiApi.getModelLabProject",
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
        new GenericType<ModelLabProjectResponse>() {});
  }

  /**
   * Get a Model Lab project.
   *
   * <p>See {@link #getModelLabProjectWithHttpInfo}.
   *
   * @param projectId The ID of the Model Lab project. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ModelLabProjectResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ModelLabProjectResponse>>
      getModelLabProjectWithHttpInfoAsync(Long projectId) {
    // Check if unstable operation is enabled
    String operationId = "getModelLabProject";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ModelLabProjectResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      CompletableFuture<ApiResponse<ModelLabProjectResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'projectId' when calling getModelLabProject"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/model-lab-api/projects/{project_id}"
            .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ModelLabApiApi.getModelLabProject",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ModelLabProjectResponse>> result = new CompletableFuture<>();
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
        new GenericType<ModelLabProjectResponse>() {});
  }

  /**
   * Get a Model Lab run.
   *
   * <p>See {@link #getModelLabRunWithHttpInfo}.
   *
   * @param runId The ID of the Model Lab run. (required)
   * @return ModelLabRunResponse
   * @throws ApiException if fails to make API call
   */
  public ModelLabRunResponse getModelLabRun(Long runId) throws ApiException {
    return getModelLabRunWithHttpInfo(runId).getData();
  }

  /**
   * Get a Model Lab run.
   *
   * <p>See {@link #getModelLabRunWithHttpInfoAsync}.
   *
   * @param runId The ID of the Model Lab run. (required)
   * @return CompletableFuture&lt;ModelLabRunResponse&gt;
   */
  public CompletableFuture<ModelLabRunResponse> getModelLabRunAsync(Long runId) {
    return getModelLabRunWithHttpInfoAsync(runId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a single Model Lab run by its ID.
   *
   * @param runId The ID of the Model Lab run. (required)
   * @return ApiResponse&lt;ModelLabRunResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ModelLabRunResponse> getModelLabRunWithHttpInfo(Long runId)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getModelLabRun";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'runId' is set
    if (runId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'runId' when calling getModelLabRun");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/model-lab-api/runs/{run_id}"
            .replaceAll("\\{" + "run_id" + "\\}", apiClient.escapeString(runId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ModelLabApiApi.getModelLabRun",
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
        new GenericType<ModelLabRunResponse>() {});
  }

  /**
   * Get a Model Lab run.
   *
   * <p>See {@link #getModelLabRunWithHttpInfo}.
   *
   * @param runId The ID of the Model Lab run. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ModelLabRunResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ModelLabRunResponse>> getModelLabRunWithHttpInfoAsync(
      Long runId) {
    // Check if unstable operation is enabled
    String operationId = "getModelLabRun";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ModelLabRunResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'runId' is set
    if (runId == null) {
      CompletableFuture<ApiResponse<ModelLabRunResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'runId' when calling getModelLabRun"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/model-lab-api/runs/{run_id}"
            .replaceAll("\\{" + "run_id" + "\\}", apiClient.escapeString(runId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ModelLabApiApi.getModelLabRun",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ModelLabRunResponse>> result = new CompletableFuture<>();
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
        new GenericType<ModelLabRunResponse>() {});
  }

  /**
   * List Model Lab project artifacts.
   *
   * <p>See {@link #listModelLabProjectArtifactsWithHttpInfo}.
   *
   * @param projectId The ID of the Model Lab project. (required)
   * @return ModelLabProjectArtifactsResponse
   * @throws ApiException if fails to make API call
   */
  public ModelLabProjectArtifactsResponse listModelLabProjectArtifacts(Long projectId)
      throws ApiException {
    return listModelLabProjectArtifactsWithHttpInfo(projectId).getData();
  }

  /**
   * List Model Lab project artifacts.
   *
   * <p>See {@link #listModelLabProjectArtifactsWithHttpInfoAsync}.
   *
   * @param projectId The ID of the Model Lab project. (required)
   * @return CompletableFuture&lt;ModelLabProjectArtifactsResponse&gt;
   */
  public CompletableFuture<ModelLabProjectArtifactsResponse> listModelLabProjectArtifactsAsync(
      Long projectId) {
    return listModelLabProjectArtifactsWithHttpInfoAsync(projectId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List all artifact files for a specific Model Lab project.
   *
   * @param projectId The ID of the Model Lab project. (required)
   * @return ApiResponse&lt;ModelLabProjectArtifactsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ModelLabProjectArtifactsResponse> listModelLabProjectArtifactsWithHttpInfo(
      Long projectId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listModelLabProjectArtifacts";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'projectId' when calling listModelLabProjectArtifacts");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/model-lab-api/projects/{project_id}/artifacts"
            .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ModelLabApiApi.listModelLabProjectArtifacts",
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
        new GenericType<ModelLabProjectArtifactsResponse>() {});
  }

  /**
   * List Model Lab project artifacts.
   *
   * <p>See {@link #listModelLabProjectArtifactsWithHttpInfo}.
   *
   * @param projectId The ID of the Model Lab project. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ModelLabProjectArtifactsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ModelLabProjectArtifactsResponse>>
      listModelLabProjectArtifactsWithHttpInfoAsync(Long projectId) {
    // Check if unstable operation is enabled
    String operationId = "listModelLabProjectArtifacts";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ModelLabProjectArtifactsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      CompletableFuture<ApiResponse<ModelLabProjectArtifactsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'projectId' when calling"
                  + " listModelLabProjectArtifacts"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/model-lab-api/projects/{project_id}/artifacts"
            .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ModelLabApiApi.listModelLabProjectArtifacts",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ModelLabProjectArtifactsResponse>> result =
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
        new GenericType<ModelLabProjectArtifactsResponse>() {});
  }

  /**
   * List Model Lab project facet keys.
   *
   * <p>See {@link #listModelLabProjectFacetKeysWithHttpInfo}.
   *
   * @return ModelLabFacetKeysResponse
   * @throws ApiException if fails to make API call
   */
  public ModelLabFacetKeysResponse listModelLabProjectFacetKeys() throws ApiException {
    return listModelLabProjectFacetKeysWithHttpInfo().getData();
  }

  /**
   * List Model Lab project facet keys.
   *
   * <p>See {@link #listModelLabProjectFacetKeysWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;ModelLabFacetKeysResponse&gt;
   */
  public CompletableFuture<ModelLabFacetKeysResponse> listModelLabProjectFacetKeysAsync() {
    return listModelLabProjectFacetKeysWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List all available facet keys for filtering Model Lab projects.
   *
   * @return ApiResponse&lt;ModelLabFacetKeysResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ModelLabFacetKeysResponse> listModelLabProjectFacetKeysWithHttpInfo()
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listModelLabProjectFacetKeys";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/model-lab-api/project-facet-keys";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ModelLabApiApi.listModelLabProjectFacetKeys",
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
        new GenericType<ModelLabFacetKeysResponse>() {});
  }

  /**
   * List Model Lab project facet keys.
   *
   * <p>See {@link #listModelLabProjectFacetKeysWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;ModelLabFacetKeysResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ModelLabFacetKeysResponse>>
      listModelLabProjectFacetKeysWithHttpInfoAsync() {
    // Check if unstable operation is enabled
    String operationId = "listModelLabProjectFacetKeys";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ModelLabFacetKeysResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/model-lab-api/project-facet-keys";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ModelLabApiApi.listModelLabProjectFacetKeys",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ModelLabFacetKeysResponse>> result = new CompletableFuture<>();
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
        new GenericType<ModelLabFacetKeysResponse>() {});
  }

  /**
   * List Model Lab project facet values.
   *
   * <p>See {@link #listModelLabProjectFacetValuesWithHttpInfo}.
   *
   * @param facetType Facet type. Valid values: tag. (required)
   * @param facetName Facet name. (required)
   * @return ModelLabFacetValuesResponse
   * @throws ApiException if fails to make API call
   */
  public ModelLabFacetValuesResponse listModelLabProjectFacetValues(
      ModelLabProjectFacetType facetType, String facetName) throws ApiException {
    return listModelLabProjectFacetValuesWithHttpInfo(facetType, facetName).getData();
  }

  /**
   * List Model Lab project facet values.
   *
   * <p>See {@link #listModelLabProjectFacetValuesWithHttpInfoAsync}.
   *
   * @param facetType Facet type. Valid values: tag. (required)
   * @param facetName Facet name. (required)
   * @return CompletableFuture&lt;ModelLabFacetValuesResponse&gt;
   */
  public CompletableFuture<ModelLabFacetValuesResponse> listModelLabProjectFacetValuesAsync(
      ModelLabProjectFacetType facetType, String facetName) {
    return listModelLabProjectFacetValuesWithHttpInfoAsync(facetType, facetName)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List available facet values for a specific project facet key.
   *
   * @param facetType Facet type. Valid values: tag. (required)
   * @param facetName Facet name. (required)
   * @return ApiResponse&lt;ModelLabFacetValuesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ModelLabFacetValuesResponse> listModelLabProjectFacetValuesWithHttpInfo(
      ModelLabProjectFacetType facetType, String facetName) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listModelLabProjectFacetValues";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'facetType' is set
    if (facetType == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'facetType' when calling listModelLabProjectFacetValues");
    }

    // verify the required parameter 'facetName' is set
    if (facetName == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'facetName' when calling listModelLabProjectFacetValues");
    }
    // create path and map variables
    String localVarPath = "/api/v2/model-lab-api/project-facet-values";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "facet_type", facetType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "facet_name", facetName));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ModelLabApiApi.listModelLabProjectFacetValues",
            localVarPath,
            localVarQueryParams,
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
        new GenericType<ModelLabFacetValuesResponse>() {});
  }

  /**
   * List Model Lab project facet values.
   *
   * <p>See {@link #listModelLabProjectFacetValuesWithHttpInfo}.
   *
   * @param facetType Facet type. Valid values: tag. (required)
   * @param facetName Facet name. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ModelLabFacetValuesResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ModelLabFacetValuesResponse>>
      listModelLabProjectFacetValuesWithHttpInfoAsync(
          ModelLabProjectFacetType facetType, String facetName) {
    // Check if unstable operation is enabled
    String operationId = "listModelLabProjectFacetValues";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ModelLabFacetValuesResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'facetType' is set
    if (facetType == null) {
      CompletableFuture<ApiResponse<ModelLabFacetValuesResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'facetType' when calling"
                  + " listModelLabProjectFacetValues"));
      return result;
    }

    // verify the required parameter 'facetName' is set
    if (facetName == null) {
      CompletableFuture<ApiResponse<ModelLabFacetValuesResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'facetName' when calling"
                  + " listModelLabProjectFacetValues"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/model-lab-api/project-facet-values";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "facet_type", facetType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "facet_name", facetName));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ModelLabApiApi.listModelLabProjectFacetValues",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ModelLabFacetValuesResponse>> result =
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
        new GenericType<ModelLabFacetValuesResponse>() {});
  }

  /** Manage optional parameters to listModelLabProjects. */
  public static class ListModelLabProjectsOptionalParameters {
    private String filter;
    private UUID filterOwnerId;
    private String filterTags;
    private String sort;
    private Integer pageSize;
    private Integer pageNumber;

    /**
     * Set filter.
     *
     * @param filter Text search filter for project name or description. (optional)
     * @return ListModelLabProjectsOptionalParameters
     */
    public ListModelLabProjectsOptionalParameters filter(String filter) {
      this.filter = filter;
      return this;
    }

    /**
     * Set filterOwnerId.
     *
     * @param filterOwnerId Filter by owner UUID. (optional)
     * @return ListModelLabProjectsOptionalParameters
     */
    public ListModelLabProjectsOptionalParameters filterOwnerId(UUID filterOwnerId) {
      this.filterOwnerId = filterOwnerId;
      return this;
    }

    /**
     * Set filterTags.
     *
     * @param filterTags Filter by tags. Format: key:value,key2:value2. (optional)
     * @return ListModelLabProjectsOptionalParameters
     */
    public ListModelLabProjectsOptionalParameters filterTags(String filterTags) {
      this.filterTags = filterTags;
      return this;
    }

    /**
     * Set sort.
     *
     * @param sort Sort field. Valid values: name, created_at, updated_at. Prefix with '-' for
     *     descending order (e.g., -updated_at). (optional, default to "-updated_at")
     * @return ListModelLabProjectsOptionalParameters
     */
    public ListModelLabProjectsOptionalParameters sort(String sort) {
      this.sort = sort;
      return this;
    }

    /**
     * Set pageSize.
     *
     * @param pageSize Number of items per page. Maximum is 100. (optional, default to 25)
     * @return ListModelLabProjectsOptionalParameters
     */
    public ListModelLabProjectsOptionalParameters pageSize(Integer pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set pageNumber.
     *
     * @param pageNumber Page number (1-indexed). (optional, default to 1)
     * @return ListModelLabProjectsOptionalParameters
     */
    public ListModelLabProjectsOptionalParameters pageNumber(Integer pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }
  }

  /**
   * List Model Lab projects.
   *
   * <p>See {@link #listModelLabProjectsWithHttpInfo}.
   *
   * @return ModelLabProjectsResponse
   * @throws ApiException if fails to make API call
   */
  public ModelLabProjectsResponse listModelLabProjects() throws ApiException {
    return listModelLabProjectsWithHttpInfo(new ListModelLabProjectsOptionalParameters()).getData();
  }

  /**
   * List Model Lab projects.
   *
   * <p>See {@link #listModelLabProjectsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;ModelLabProjectsResponse&gt;
   */
  public CompletableFuture<ModelLabProjectsResponse> listModelLabProjectsAsync() {
    return listModelLabProjectsWithHttpInfoAsync(new ListModelLabProjectsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List Model Lab projects.
   *
   * <p>See {@link #listModelLabProjectsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return ModelLabProjectsResponse
   * @throws ApiException if fails to make API call
   */
  public ModelLabProjectsResponse listModelLabProjects(
      ListModelLabProjectsOptionalParameters parameters) throws ApiException {
    return listModelLabProjectsWithHttpInfo(parameters).getData();
  }

  /**
   * List Model Lab projects.
   *
   * <p>See {@link #listModelLabProjectsWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ModelLabProjectsResponse&gt;
   */
  public CompletableFuture<ModelLabProjectsResponse> listModelLabProjectsAsync(
      ListModelLabProjectsOptionalParameters parameters) {
    return listModelLabProjectsWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List all Model Lab projects for the current organization.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;ModelLabProjectsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ModelLabProjectsResponse> listModelLabProjectsWithHttpInfo(
      ListModelLabProjectsOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listModelLabProjects";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    String filter = parameters.filter;
    UUID filterOwnerId = parameters.filterOwnerId;
    String filterTags = parameters.filterTags;
    String sort = parameters.sort;
    Integer pageSize = parameters.pageSize;
    Integer pageNumber = parameters.pageNumber;
    // create path and map variables
    String localVarPath = "/api/v2/model-lab-api/projects";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[owner_id]", filterOwnerId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[tags]", filterTags));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ModelLabApiApi.listModelLabProjects",
            localVarPath,
            localVarQueryParams,
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
        new GenericType<ModelLabProjectsResponse>() {});
  }

  /**
   * List Model Lab projects.
   *
   * <p>See {@link #listModelLabProjectsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;ModelLabProjectsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ModelLabProjectsResponse>>
      listModelLabProjectsWithHttpInfoAsync(ListModelLabProjectsOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listModelLabProjects";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ModelLabProjectsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    String filter = parameters.filter;
    UUID filterOwnerId = parameters.filterOwnerId;
    String filterTags = parameters.filterTags;
    String sort = parameters.sort;
    Integer pageSize = parameters.pageSize;
    Integer pageNumber = parameters.pageNumber;
    // create path and map variables
    String localVarPath = "/api/v2/model-lab-api/projects";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[owner_id]", filterOwnerId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[tags]", filterTags));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ModelLabApiApi.listModelLabProjects",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ModelLabProjectsResponse>> result = new CompletableFuture<>();
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
        new GenericType<ModelLabProjectsResponse>() {});
  }

  /** Manage optional parameters to listModelLabRunArtifacts. */
  public static class ListModelLabRunArtifactsOptionalParameters {
    private String path;

    /**
     * Set path.
     *
     * @param path Optional subdirectory path within the run's artifacts. (optional)
     * @return ListModelLabRunArtifactsOptionalParameters
     */
    public ListModelLabRunArtifactsOptionalParameters path(String path) {
      this.path = path;
      return this;
    }
  }

  /**
   * List Model Lab run artifacts.
   *
   * <p>See {@link #listModelLabRunArtifactsWithHttpInfo}.
   *
   * @param runId The ID of the Model Lab run. (required)
   * @return ModelLabRunArtifactsResponse
   * @throws ApiException if fails to make API call
   */
  public ModelLabRunArtifactsResponse listModelLabRunArtifacts(Long runId) throws ApiException {
    return listModelLabRunArtifactsWithHttpInfo(
            runId, new ListModelLabRunArtifactsOptionalParameters())
        .getData();
  }

  /**
   * List Model Lab run artifacts.
   *
   * <p>See {@link #listModelLabRunArtifactsWithHttpInfoAsync}.
   *
   * @param runId The ID of the Model Lab run. (required)
   * @return CompletableFuture&lt;ModelLabRunArtifactsResponse&gt;
   */
  public CompletableFuture<ModelLabRunArtifactsResponse> listModelLabRunArtifactsAsync(Long runId) {
    return listModelLabRunArtifactsWithHttpInfoAsync(
            runId, new ListModelLabRunArtifactsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List Model Lab run artifacts.
   *
   * <p>See {@link #listModelLabRunArtifactsWithHttpInfo}.
   *
   * @param runId The ID of the Model Lab run. (required)
   * @param parameters Optional parameters for the request.
   * @return ModelLabRunArtifactsResponse
   * @throws ApiException if fails to make API call
   */
  public ModelLabRunArtifactsResponse listModelLabRunArtifacts(
      Long runId, ListModelLabRunArtifactsOptionalParameters parameters) throws ApiException {
    return listModelLabRunArtifactsWithHttpInfo(runId, parameters).getData();
  }

  /**
   * List Model Lab run artifacts.
   *
   * <p>See {@link #listModelLabRunArtifactsWithHttpInfoAsync}.
   *
   * @param runId The ID of the Model Lab run. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ModelLabRunArtifactsResponse&gt;
   */
  public CompletableFuture<ModelLabRunArtifactsResponse> listModelLabRunArtifactsAsync(
      Long runId, ListModelLabRunArtifactsOptionalParameters parameters) {
    return listModelLabRunArtifactsWithHttpInfoAsync(runId, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List artifact files for a specific Model Lab run.
   *
   * @param runId The ID of the Model Lab run. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;ModelLabRunArtifactsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ModelLabRunArtifactsResponse> listModelLabRunArtifactsWithHttpInfo(
      Long runId, ListModelLabRunArtifactsOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listModelLabRunArtifacts";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'runId' is set
    if (runId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'runId' when calling listModelLabRunArtifacts");
    }
    String path = parameters.path;
    // create path and map variables
    String localVarPath =
        "/api/v2/model-lab-api/runs/{run_id}/artifacts"
            .replaceAll("\\{" + "run_id" + "\\}", apiClient.escapeString(runId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "path", path));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ModelLabApiApi.listModelLabRunArtifacts",
            localVarPath,
            localVarQueryParams,
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
        new GenericType<ModelLabRunArtifactsResponse>() {});
  }

  /**
   * List Model Lab run artifacts.
   *
   * <p>See {@link #listModelLabRunArtifactsWithHttpInfo}.
   *
   * @param runId The ID of the Model Lab run. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;ModelLabRunArtifactsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ModelLabRunArtifactsResponse>>
      listModelLabRunArtifactsWithHttpInfoAsync(
          Long runId, ListModelLabRunArtifactsOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listModelLabRunArtifacts";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ModelLabRunArtifactsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'runId' is set
    if (runId == null) {
      CompletableFuture<ApiResponse<ModelLabRunArtifactsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'runId' when calling listModelLabRunArtifacts"));
      return result;
    }
    String path = parameters.path;
    // create path and map variables
    String localVarPath =
        "/api/v2/model-lab-api/runs/{run_id}/artifacts"
            .replaceAll("\\{" + "run_id" + "\\}", apiClient.escapeString(runId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "path", path));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ModelLabApiApi.listModelLabRunArtifacts",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ModelLabRunArtifactsResponse>> result =
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
        new GenericType<ModelLabRunArtifactsResponse>() {});
  }

  /**
   * List Model Lab run facet keys.
   *
   * <p>See {@link #listModelLabRunFacetKeysWithHttpInfo}.
   *
   * @param filterProjectId Filter by project ID. (required)
   * @return ModelLabFacetKeysResponse
   * @throws ApiException if fails to make API call
   */
  public ModelLabFacetKeysResponse listModelLabRunFacetKeys(Long filterProjectId)
      throws ApiException {
    return listModelLabRunFacetKeysWithHttpInfo(filterProjectId).getData();
  }

  /**
   * List Model Lab run facet keys.
   *
   * <p>See {@link #listModelLabRunFacetKeysWithHttpInfoAsync}.
   *
   * @param filterProjectId Filter by project ID. (required)
   * @return CompletableFuture&lt;ModelLabFacetKeysResponse&gt;
   */
  public CompletableFuture<ModelLabFacetKeysResponse> listModelLabRunFacetKeysAsync(
      Long filterProjectId) {
    return listModelLabRunFacetKeysWithHttpInfoAsync(filterProjectId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List all available facet keys for filtering Model Lab runs.
   *
   * @param filterProjectId Filter by project ID. (required)
   * @return ApiResponse&lt;ModelLabFacetKeysResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ModelLabFacetKeysResponse> listModelLabRunFacetKeysWithHttpInfo(
      Long filterProjectId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listModelLabRunFacetKeys";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'filterProjectId' is set
    if (filterProjectId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'filterProjectId' when calling listModelLabRunFacetKeys");
    }
    // create path and map variables
    String localVarPath = "/api/v2/model-lab-api/facet-keys";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[project_id]", filterProjectId));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ModelLabApiApi.listModelLabRunFacetKeys",
            localVarPath,
            localVarQueryParams,
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
        new GenericType<ModelLabFacetKeysResponse>() {});
  }

  /**
   * List Model Lab run facet keys.
   *
   * <p>See {@link #listModelLabRunFacetKeysWithHttpInfo}.
   *
   * @param filterProjectId Filter by project ID. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ModelLabFacetKeysResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ModelLabFacetKeysResponse>>
      listModelLabRunFacetKeysWithHttpInfoAsync(Long filterProjectId) {
    // Check if unstable operation is enabled
    String operationId = "listModelLabRunFacetKeys";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ModelLabFacetKeysResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'filterProjectId' is set
    if (filterProjectId == null) {
      CompletableFuture<ApiResponse<ModelLabFacetKeysResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'filterProjectId' when calling"
                  + " listModelLabRunFacetKeys"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/model-lab-api/facet-keys";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[project_id]", filterProjectId));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ModelLabApiApi.listModelLabRunFacetKeys",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ModelLabFacetKeysResponse>> result = new CompletableFuture<>();
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
        new GenericType<ModelLabFacetKeysResponse>() {});
  }

  /**
   * List Model Lab run facet values.
   *
   * <p>See {@link #listModelLabRunFacetValuesWithHttpInfo}.
   *
   * @param filterProjectId Filter by project ID. (required)
   * @param facetType Facet type. Valid values: parameter, attribute, tag, metric. (required)
   * @param facetName Facet name. (required)
   * @return ModelLabFacetValuesResponse
   * @throws ApiException if fails to make API call
   */
  public ModelLabFacetValuesResponse listModelLabRunFacetValues(
      Long filterProjectId, ModelLabFacetType facetType, String facetName) throws ApiException {
    return listModelLabRunFacetValuesWithHttpInfo(filterProjectId, facetType, facetName).getData();
  }

  /**
   * List Model Lab run facet values.
   *
   * <p>See {@link #listModelLabRunFacetValuesWithHttpInfoAsync}.
   *
   * @param filterProjectId Filter by project ID. (required)
   * @param facetType Facet type. Valid values: parameter, attribute, tag, metric. (required)
   * @param facetName Facet name. (required)
   * @return CompletableFuture&lt;ModelLabFacetValuesResponse&gt;
   */
  public CompletableFuture<ModelLabFacetValuesResponse> listModelLabRunFacetValuesAsync(
      Long filterProjectId, ModelLabFacetType facetType, String facetName) {
    return listModelLabRunFacetValuesWithHttpInfoAsync(filterProjectId, facetType, facetName)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List available facet values for a specific run facet key.
   *
   * @param filterProjectId Filter by project ID. (required)
   * @param facetType Facet type. Valid values: parameter, attribute, tag, metric. (required)
   * @param facetName Facet name. (required)
   * @return ApiResponse&lt;ModelLabFacetValuesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ModelLabFacetValuesResponse> listModelLabRunFacetValuesWithHttpInfo(
      Long filterProjectId, ModelLabFacetType facetType, String facetName) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listModelLabRunFacetValues";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'filterProjectId' is set
    if (filterProjectId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'filterProjectId' when calling"
              + " listModelLabRunFacetValues");
    }

    // verify the required parameter 'facetType' is set
    if (facetType == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'facetType' when calling listModelLabRunFacetValues");
    }

    // verify the required parameter 'facetName' is set
    if (facetName == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'facetName' when calling listModelLabRunFacetValues");
    }
    // create path and map variables
    String localVarPath = "/api/v2/model-lab-api/facet-values";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[project_id]", filterProjectId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "facet_type", facetType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "facet_name", facetName));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ModelLabApiApi.listModelLabRunFacetValues",
            localVarPath,
            localVarQueryParams,
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
        new GenericType<ModelLabFacetValuesResponse>() {});
  }

  /**
   * List Model Lab run facet values.
   *
   * <p>See {@link #listModelLabRunFacetValuesWithHttpInfo}.
   *
   * @param filterProjectId Filter by project ID. (required)
   * @param facetType Facet type. Valid values: parameter, attribute, tag, metric. (required)
   * @param facetName Facet name. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ModelLabFacetValuesResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ModelLabFacetValuesResponse>>
      listModelLabRunFacetValuesWithHttpInfoAsync(
          Long filterProjectId, ModelLabFacetType facetType, String facetName) {
    // Check if unstable operation is enabled
    String operationId = "listModelLabRunFacetValues";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ModelLabFacetValuesResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'filterProjectId' is set
    if (filterProjectId == null) {
      CompletableFuture<ApiResponse<ModelLabFacetValuesResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'filterProjectId' when calling"
                  + " listModelLabRunFacetValues"));
      return result;
    }

    // verify the required parameter 'facetType' is set
    if (facetType == null) {
      CompletableFuture<ApiResponse<ModelLabFacetValuesResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'facetType' when calling"
                  + " listModelLabRunFacetValues"));
      return result;
    }

    // verify the required parameter 'facetName' is set
    if (facetName == null) {
      CompletableFuture<ApiResponse<ModelLabFacetValuesResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'facetName' when calling"
                  + " listModelLabRunFacetValues"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/model-lab-api/facet-values";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[project_id]", filterProjectId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "facet_type", facetType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "facet_name", facetName));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ModelLabApiApi.listModelLabRunFacetValues",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ModelLabFacetValuesResponse>> result =
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
        new GenericType<ModelLabFacetValuesResponse>() {});
  }

  /** Manage optional parameters to listModelLabRuns. */
  public static class ListModelLabRunsOptionalParameters {
    private String filterId;
    private String filter;
    private String filterOwnerId;
    private ModelLabRunStatus filterStatus;
    private Long filterProjectId;
    private String filterTags;
    private String filterParams;
    private String filterParentRunId;
    private Boolean pinnedFirst;
    private Boolean includePinned;
    private Boolean includeDescendantMatches;
    private String sort;
    private Integer pageSize;
    private Integer pageNumber;

    /**
     * Set filterId.
     *
     * @param filterId Filter by run ID(s). Comma-separated list for multiple IDs. (optional)
     * @return ListModelLabRunsOptionalParameters
     */
    public ListModelLabRunsOptionalParameters filterId(String filterId) {
      this.filterId = filterId;
      return this;
    }

    /**
     * Set filter.
     *
     * @param filter Text search filter for run name or description. (optional)
     * @return ListModelLabRunsOptionalParameters
     */
    public ListModelLabRunsOptionalParameters filter(String filter) {
      this.filter = filter;
      return this;
    }

    /**
     * Set filterOwnerId.
     *
     * @param filterOwnerId Filter by owner UUID. (optional)
     * @return ListModelLabRunsOptionalParameters
     */
    public ListModelLabRunsOptionalParameters filterOwnerId(String filterOwnerId) {
      this.filterOwnerId = filterOwnerId;
      return this;
    }

    /**
     * Set filterStatus.
     *
     * @param filterStatus Filter by run status. Valid values: pending, running, completed, failed,
     *     killed, unresponsive, paused. (optional)
     * @return ListModelLabRunsOptionalParameters
     */
    public ListModelLabRunsOptionalParameters filterStatus(ModelLabRunStatus filterStatus) {
      this.filterStatus = filterStatus;
      return this;
    }

    /**
     * Set filterProjectId.
     *
     * @param filterProjectId Filter by project ID. (optional)
     * @return ListModelLabRunsOptionalParameters
     */
    public ListModelLabRunsOptionalParameters filterProjectId(Long filterProjectId) {
      this.filterProjectId = filterProjectId;
      return this;
    }

    /**
     * Set filterTags.
     *
     * @param filterTags Filter by tags. Format: key:value,key2:value2. (optional)
     * @return ListModelLabRunsOptionalParameters
     */
    public ListModelLabRunsOptionalParameters filterTags(String filterTags) {
      this.filterTags = filterTags;
      return this;
    }

    /**
     * Set filterParams.
     *
     * @param filterParams Filter by params. Format: key:value,key2:&gt;0.5,key3:true. (optional)
     * @return ListModelLabRunsOptionalParameters
     */
    public ListModelLabRunsOptionalParameters filterParams(String filterParams) {
      this.filterParams = filterParams;
      return this;
    }

    /**
     * Set filterParentRunId.
     *
     * @param filterParentRunId Filter by parent run ID. Use 'null' to return only root runs (runs
     *     with no parent). (optional)
     * @return ListModelLabRunsOptionalParameters
     */
    public ListModelLabRunsOptionalParameters filterParentRunId(String filterParentRunId) {
      this.filterParentRunId = filterParentRunId;
      return this;
    }

    /**
     * Set pinnedFirst.
     *
     * @param pinnedFirst Sort pinned runs before non-pinned runs. Pinned runs are ordered by pin
     *     time descending. (optional)
     * @return ListModelLabRunsOptionalParameters
     */
    public ListModelLabRunsOptionalParameters pinnedFirst(Boolean pinnedFirst) {
      this.pinnedFirst = pinnedFirst;
      return this;
    }

    /**
     * Set includePinned.
     *
     * @param includePinned Include all runs pinned by the current user, regardless of other
     *     filters. (optional)
     * @return ListModelLabRunsOptionalParameters
     */
    public ListModelLabRunsOptionalParameters includePinned(Boolean includePinned) {
      this.includePinned = includePinned;
      return this;
    }

    /**
     * Set includeDescendantMatches.
     *
     * @param includeDescendantMatches When true, also return runs whose descendants match the
     *     active filters. The descendant_match field in each result indicates whether the run was
     *     included via a descendant match. (optional)
     * @return ListModelLabRunsOptionalParameters
     */
    public ListModelLabRunsOptionalParameters includeDescendantMatches(
        Boolean includeDescendantMatches) {
      this.includeDescendantMatches = includeDescendantMatches;
      return this;
    }

    /**
     * Set sort.
     *
     * @param sort Sort field. Valid values: name, created_at, updated_at, duration. Prefix with '-'
     *     for descending order (e.g., -updated_at). (optional, default to "-updated_at")
     * @return ListModelLabRunsOptionalParameters
     */
    public ListModelLabRunsOptionalParameters sort(String sort) {
      this.sort = sort;
      return this;
    }

    /**
     * Set pageSize.
     *
     * @param pageSize Number of items per page. Maximum is 100. (optional, default to 25)
     * @return ListModelLabRunsOptionalParameters
     */
    public ListModelLabRunsOptionalParameters pageSize(Integer pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set pageNumber.
     *
     * @param pageNumber Page number (1-indexed). (optional, default to 1)
     * @return ListModelLabRunsOptionalParameters
     */
    public ListModelLabRunsOptionalParameters pageNumber(Integer pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }
  }

  /**
   * List Model Lab runs.
   *
   * <p>See {@link #listModelLabRunsWithHttpInfo}.
   *
   * @return ModelLabRunsResponse
   * @throws ApiException if fails to make API call
   */
  public ModelLabRunsResponse listModelLabRuns() throws ApiException {
    return listModelLabRunsWithHttpInfo(new ListModelLabRunsOptionalParameters()).getData();
  }

  /**
   * List Model Lab runs.
   *
   * <p>See {@link #listModelLabRunsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;ModelLabRunsResponse&gt;
   */
  public CompletableFuture<ModelLabRunsResponse> listModelLabRunsAsync() {
    return listModelLabRunsWithHttpInfoAsync(new ListModelLabRunsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List Model Lab runs.
   *
   * <p>See {@link #listModelLabRunsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return ModelLabRunsResponse
   * @throws ApiException if fails to make API call
   */
  public ModelLabRunsResponse listModelLabRuns(ListModelLabRunsOptionalParameters parameters)
      throws ApiException {
    return listModelLabRunsWithHttpInfo(parameters).getData();
  }

  /**
   * List Model Lab runs.
   *
   * <p>See {@link #listModelLabRunsWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ModelLabRunsResponse&gt;
   */
  public CompletableFuture<ModelLabRunsResponse> listModelLabRunsAsync(
      ListModelLabRunsOptionalParameters parameters) {
    return listModelLabRunsWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List all Model Lab runs for the current organization.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;ModelLabRunsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ModelLabRunsResponse> listModelLabRunsWithHttpInfo(
      ListModelLabRunsOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listModelLabRuns";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    String filterId = parameters.filterId;
    String filter = parameters.filter;
    String filterOwnerId = parameters.filterOwnerId;
    ModelLabRunStatus filterStatus = parameters.filterStatus;
    Long filterProjectId = parameters.filterProjectId;
    String filterTags = parameters.filterTags;
    String filterParams = parameters.filterParams;
    String filterParentRunId = parameters.filterParentRunId;
    Boolean pinnedFirst = parameters.pinnedFirst;
    Boolean includePinned = parameters.includePinned;
    Boolean includeDescendantMatches = parameters.includeDescendantMatches;
    String sort = parameters.sort;
    Integer pageSize = parameters.pageSize;
    Integer pageNumber = parameters.pageNumber;
    // create path and map variables
    String localVarPath = "/api/v2/model-lab-api/runs";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[id]", filterId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[owner_id]", filterOwnerId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[status]", filterStatus));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[project_id]", filterProjectId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[tags]", filterTags));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[params]", filterParams));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[parent_run_id]", filterParentRunId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pinned_first", pinnedFirst));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include_pinned", includePinned));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "include_descendant_matches", includeDescendantMatches));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ModelLabApiApi.listModelLabRuns",
            localVarPath,
            localVarQueryParams,
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
        new GenericType<ModelLabRunsResponse>() {});
  }

  /**
   * List Model Lab runs.
   *
   * <p>See {@link #listModelLabRunsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;ModelLabRunsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ModelLabRunsResponse>> listModelLabRunsWithHttpInfoAsync(
      ListModelLabRunsOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listModelLabRuns";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ModelLabRunsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    String filterId = parameters.filterId;
    String filter = parameters.filter;
    String filterOwnerId = parameters.filterOwnerId;
    ModelLabRunStatus filterStatus = parameters.filterStatus;
    Long filterProjectId = parameters.filterProjectId;
    String filterTags = parameters.filterTags;
    String filterParams = parameters.filterParams;
    String filterParentRunId = parameters.filterParentRunId;
    Boolean pinnedFirst = parameters.pinnedFirst;
    Boolean includePinned = parameters.includePinned;
    Boolean includeDescendantMatches = parameters.includeDescendantMatches;
    String sort = parameters.sort;
    Integer pageSize = parameters.pageSize;
    Integer pageNumber = parameters.pageNumber;
    // create path and map variables
    String localVarPath = "/api/v2/model-lab-api/runs";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[id]", filterId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[owner_id]", filterOwnerId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[status]", filterStatus));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[project_id]", filterProjectId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[tags]", filterTags));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[params]", filterParams));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[parent_run_id]", filterParentRunId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pinned_first", pinnedFirst));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include_pinned", includePinned));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "include_descendant_matches", includeDescendantMatches));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ModelLabApiApi.listModelLabRuns",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ModelLabRunsResponse>> result = new CompletableFuture<>();
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
        new GenericType<ModelLabRunsResponse>() {});
  }

  /**
   * Pin a Model Lab run.
   *
   * <p>See {@link #pinModelLabRunWithHttpInfo}.
   *
   * @param runId The ID of the Model Lab run. (required)
   * @throws ApiException if fails to make API call
   */
  public void pinModelLabRun(Long runId) throws ApiException {
    pinModelLabRunWithHttpInfo(runId);
  }

  /**
   * Pin a Model Lab run.
   *
   * <p>See {@link #pinModelLabRunWithHttpInfoAsync}.
   *
   * @param runId The ID of the Model Lab run. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> pinModelLabRunAsync(Long runId) {
    return pinModelLabRunWithHttpInfoAsync(runId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Pin a Model Lab run for the current user.
   *
   * @param runId The ID of the Model Lab run. (required)
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
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> pinModelLabRunWithHttpInfo(Long runId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "pinModelLabRun";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'runId' is set
    if (runId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'runId' when calling pinModelLabRun");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/model-lab-api/runs/{run_id}/pin"
            .replaceAll("\\{" + "run_id" + "\\}", apiClient.escapeString(runId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ModelLabApiApi.pinModelLabRun",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Pin a Model Lab run.
   *
   * <p>See {@link #pinModelLabRunWithHttpInfo}.
   *
   * @param runId The ID of the Model Lab run. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> pinModelLabRunWithHttpInfoAsync(Long runId) {
    // Check if unstable operation is enabled
    String operationId = "pinModelLabRun";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'runId' is set
    if (runId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'runId' when calling pinModelLabRun"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/model-lab-api/runs/{run_id}/pin"
            .replaceAll("\\{" + "run_id" + "\\}", apiClient.escapeString(runId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ModelLabApiApi.pinModelLabRun",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"*/*"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Star a Model Lab project.
   *
   * <p>See {@link #starModelLabProjectWithHttpInfo}.
   *
   * @param projectId The ID of the Model Lab project. (required)
   * @throws ApiException if fails to make API call
   */
  public void starModelLabProject(Long projectId) throws ApiException {
    starModelLabProjectWithHttpInfo(projectId);
  }

  /**
   * Star a Model Lab project.
   *
   * <p>See {@link #starModelLabProjectWithHttpInfoAsync}.
   *
   * @param projectId The ID of the Model Lab project. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> starModelLabProjectAsync(Long projectId) {
    return starModelLabProjectWithHttpInfoAsync(projectId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Star a Model Lab project for the current user.
   *
   * @param projectId The ID of the Model Lab project. (required)
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
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> starModelLabProjectWithHttpInfo(Long projectId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "starModelLabProject";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'projectId' when calling starModelLabProject");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/model-lab-api/projects/{project_id}/star"
            .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ModelLabApiApi.starModelLabProject",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Star a Model Lab project.
   *
   * <p>See {@link #starModelLabProjectWithHttpInfo}.
   *
   * @param projectId The ID of the Model Lab project. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> starModelLabProjectWithHttpInfoAsync(Long projectId) {
    // Check if unstable operation is enabled
    String operationId = "starModelLabProject";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'projectId' when calling starModelLabProject"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/model-lab-api/projects/{project_id}/star"
            .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ModelLabApiApi.starModelLabProject",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"*/*"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Unpin a Model Lab run.
   *
   * <p>See {@link #unpinModelLabRunWithHttpInfo}.
   *
   * @param runId The ID of the Model Lab run. (required)
   * @throws ApiException if fails to make API call
   */
  public void unpinModelLabRun(Long runId) throws ApiException {
    unpinModelLabRunWithHttpInfo(runId);
  }

  /**
   * Unpin a Model Lab run.
   *
   * <p>See {@link #unpinModelLabRunWithHttpInfoAsync}.
   *
   * @param runId The ID of the Model Lab run. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> unpinModelLabRunAsync(Long runId) {
    return unpinModelLabRunWithHttpInfoAsync(runId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Remove the pin from a Model Lab run for the current user.
   *
   * @param runId The ID of the Model Lab run. (required)
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
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> unpinModelLabRunWithHttpInfo(Long runId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "unpinModelLabRun";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'runId' is set
    if (runId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'runId' when calling unpinModelLabRun");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/model-lab-api/runs/{run_id}/pin"
            .replaceAll("\\{" + "run_id" + "\\}", apiClient.escapeString(runId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ModelLabApiApi.unpinModelLabRun",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
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
   * Unpin a Model Lab run.
   *
   * <p>See {@link #unpinModelLabRunWithHttpInfo}.
   *
   * @param runId The ID of the Model Lab run. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> unpinModelLabRunWithHttpInfoAsync(Long runId) {
    // Check if unstable operation is enabled
    String operationId = "unpinModelLabRun";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'runId' is set
    if (runId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'runId' when calling unpinModelLabRun"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/model-lab-api/runs/{run_id}/pin"
            .replaceAll("\\{" + "run_id" + "\\}", apiClient.escapeString(runId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ModelLabApiApi.unpinModelLabRun",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"*/*"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
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
   * Remove star from a Model Lab project.
   *
   * <p>See {@link #unstarModelLabProjectWithHttpInfo}.
   *
   * @param projectId The ID of the Model Lab project. (required)
   * @throws ApiException if fails to make API call
   */
  public void unstarModelLabProject(Long projectId) throws ApiException {
    unstarModelLabProjectWithHttpInfo(projectId);
  }

  /**
   * Remove star from a Model Lab project.
   *
   * <p>See {@link #unstarModelLabProjectWithHttpInfoAsync}.
   *
   * @param projectId The ID of the Model Lab project. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> unstarModelLabProjectAsync(Long projectId) {
    return unstarModelLabProjectWithHttpInfoAsync(projectId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Remove the star from a Model Lab project for the current user.
   *
   * @param projectId The ID of the Model Lab project. (required)
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
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> unstarModelLabProjectWithHttpInfo(Long projectId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "unstarModelLabProject";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'projectId' when calling unstarModelLabProject");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/model-lab-api/projects/{project_id}/star"
            .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ModelLabApiApi.unstarModelLabProject",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
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
   * Remove star from a Model Lab project.
   *
   * <p>See {@link #unstarModelLabProjectWithHttpInfo}.
   *
   * @param projectId The ID of the Model Lab project. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> unstarModelLabProjectWithHttpInfoAsync(
      Long projectId) {
    // Check if unstable operation is enabled
    String operationId = "unstarModelLabProject";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'projectId' when calling unstarModelLabProject"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/model-lab-api/projects/{project_id}/star"
            .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ModelLabApiApi.unstarModelLabProject",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"*/*"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
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
}
