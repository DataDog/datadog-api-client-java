package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.ProjectCreateRequest;
import com.datadog.api.client.v2.model.ProjectResponse;
import com.datadog.api.client.v2.model.ProjectsResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CasesProjectsApi {
  private ApiClient apiClient;

  public CasesProjectsApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public CasesProjectsApi(ApiClient apiClient) {
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
   * Create a project.
   *
   * <p>See {@link #createProjectWithHttpInfo}.
   *
   * @param body Project payload (required)
   * @return ProjectResponse
   * @throws ApiException if fails to make API call
   */
  public ProjectResponse createProject(ProjectCreateRequest body) throws ApiException {
    return createProjectWithHttpInfo(body).getData();
  }

  /**
   * Create a project.
   *
   * <p>See {@link #createProjectWithHttpInfoAsync}.
   *
   * @param body Project payload (required)
   * @return CompletableFuture&lt;ProjectResponse&gt;
   */
  public CompletableFuture<ProjectResponse> createProjectAsync(ProjectCreateRequest body) {
    return createProjectWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a project.
   *
   * @param body Project payload (required)
   * @return ApiResponse&lt;ProjectResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> CREATED </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ProjectResponse> createProjectWithHttpInfo(ProjectCreateRequest body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createProject");
    }
    // create path and map variables
    String localVarPath = "/api/v2/cases/projects";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CasesProjectsApi.createProject",
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
        new GenericType<ProjectResponse>() {});
  }

  /**
   * Create a project.
   *
   * <p>See {@link #createProjectWithHttpInfo}.
   *
   * @param body Project payload (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ProjectResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ProjectResponse>> createProjectWithHttpInfoAsync(
      ProjectCreateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<ProjectResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createProject"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/cases/projects";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CasesProjectsApi.createProject",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ProjectResponse>> result = new CompletableFuture<>();
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
        new GenericType<ProjectResponse>() {});
  }

  /**
   * Remove a project.
   *
   * <p>See {@link #deleteProjectWithHttpInfo}.
   *
   * @param projectId Project UUID (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteProject(String projectId) throws ApiException {
    deleteProjectWithHttpInfo(projectId);
  }

  /**
   * Remove a project.
   *
   * <p>See {@link #deleteProjectWithHttpInfoAsync}.
   *
   * @param projectId Project UUID (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteProjectAsync(String projectId) {
    return deleteProjectWithHttpInfoAsync(projectId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Remove a project using the project's <code>id</code>.
   *
   * @param projectId Project UUID (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> API error response </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteProjectWithHttpInfo(String projectId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'projectId' when calling deleteProject");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/projects/{project_id}"
            .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CasesProjectsApi.deleteProject",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
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
   * Remove a project.
   *
   * <p>See {@link #deleteProjectWithHttpInfo}.
   *
   * @param projectId Project UUID (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteProjectWithHttpInfoAsync(String projectId) {
    Object localVarPostBody = null;

    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'projectId' when calling deleteProject"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/projects/{project_id}"
            .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CasesProjectsApi.deleteProject",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"*/*"},
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
   * Get the details of a project.
   *
   * <p>See {@link #getProjectWithHttpInfo}.
   *
   * @param projectId Project UUID (required)
   * @return ProjectResponse
   * @throws ApiException if fails to make API call
   */
  public ProjectResponse getProject(String projectId) throws ApiException {
    return getProjectWithHttpInfo(projectId).getData();
  }

  /**
   * Get the details of a project.
   *
   * <p>See {@link #getProjectWithHttpInfoAsync}.
   *
   * @param projectId Project UUID (required)
   * @return CompletableFuture&lt;ProjectResponse&gt;
   */
  public CompletableFuture<ProjectResponse> getProjectAsync(String projectId) {
    return getProjectWithHttpInfoAsync(projectId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the details of a project by <code>project_id</code>.
   *
   * @param projectId Project UUID (required)
   * @return ApiResponse&lt;ProjectResponse&gt;
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
   *     </table>
   */
  public ApiResponse<ProjectResponse> getProjectWithHttpInfo(String projectId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'projectId' when calling getProject");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/projects/{project_id}"
            .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CasesProjectsApi.getProject",
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
        new GenericType<ProjectResponse>() {});
  }

  /**
   * Get the details of a project.
   *
   * <p>See {@link #getProjectWithHttpInfo}.
   *
   * @param projectId Project UUID (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ProjectResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ProjectResponse>> getProjectWithHttpInfoAsync(
      String projectId) {
    Object localVarPostBody = null;

    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      CompletableFuture<ApiResponse<ProjectResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'projectId' when calling getProject"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/projects/{project_id}"
            .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CasesProjectsApi.getProject",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ProjectResponse>> result = new CompletableFuture<>();
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
        new GenericType<ProjectResponse>() {});
  }

  /**
   * Get all projects.
   *
   * <p>See {@link #getProjectsWithHttpInfo}.
   *
   * @return ProjectsResponse
   * @throws ApiException if fails to make API call
   */
  public ProjectsResponse getProjects() throws ApiException {
    return getProjectsWithHttpInfo().getData();
  }

  /**
   * Get all projects.
   *
   * <p>See {@link #getProjectsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;ProjectsResponse&gt;
   */
  public CompletableFuture<ProjectsResponse> getProjectsAsync() {
    return getProjectsWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get all projects.
   *
   * @return ApiResponse&lt;ProjectsResponse&gt;
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
   *     </table>
   */
  public ApiResponse<ProjectsResponse> getProjectsWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/cases/projects";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CasesProjectsApi.getProjects",
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
        new GenericType<ProjectsResponse>() {});
  }

  /**
   * Get all projects.
   *
   * <p>See {@link #getProjectsWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;ProjectsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ProjectsResponse>> getProjectsWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/cases/projects";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CasesProjectsApi.getProjects",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ProjectsResponse>> result = new CompletableFuture<>();
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
        new GenericType<ProjectsResponse>() {});
  }
}
