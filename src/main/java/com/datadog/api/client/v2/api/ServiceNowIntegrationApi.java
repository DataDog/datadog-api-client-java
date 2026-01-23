package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.ServiceNowAssignmentGroupsResponse;
import com.datadog.api.client.v2.model.ServiceNowBusinessServicesResponse;
import com.datadog.api.client.v2.model.ServiceNowInstancesResponse;
import com.datadog.api.client.v2.model.ServiceNowTemplateCreateRequest;
import com.datadog.api.client.v2.model.ServiceNowTemplateResponse;
import com.datadog.api.client.v2.model.ServiceNowTemplateUpdateRequest;
import com.datadog.api.client.v2.model.ServiceNowTemplatesResponse;
import com.datadog.api.client.v2.model.ServiceNowUsersResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ServiceNowIntegrationApi {
  private ApiClient apiClient;

  public ServiceNowIntegrationApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public ServiceNowIntegrationApi(ApiClient apiClient) {
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
   * Create ServiceNow template.
   *
   * <p>See {@link #createServiceNowTemplateWithHttpInfo}.
   *
   * @param body (required)
   * @return ServiceNowTemplateResponse
   * @throws ApiException if fails to make API call
   */
  public ServiceNowTemplateResponse createServiceNowTemplate(ServiceNowTemplateCreateRequest body)
      throws ApiException {
    return createServiceNowTemplateWithHttpInfo(body).getData();
  }

  /**
   * Create ServiceNow template.
   *
   * <p>See {@link #createServiceNowTemplateWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ServiceNowTemplateResponse&gt;
   */
  public CompletableFuture<ServiceNowTemplateResponse> createServiceNowTemplateAsync(
      ServiceNowTemplateCreateRequest body) {
    return createServiceNowTemplateWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a new ServiceNow template.
   *
   * @param body (required)
   * @return ApiResponse&lt;ServiceNowTemplateResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ServiceNowTemplateResponse> createServiceNowTemplateWithHttpInfo(
      ServiceNowTemplateCreateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createServiceNowTemplate";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createServiceNowTemplate");
    }
    // create path and map variables
    String localVarPath = "/api/v2/integration/servicenow/handles";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ServiceNowIntegrationApi.createServiceNowTemplate",
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
        new GenericType<ServiceNowTemplateResponse>() {});
  }

  /**
   * Create ServiceNow template.
   *
   * <p>See {@link #createServiceNowTemplateWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ServiceNowTemplateResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ServiceNowTemplateResponse>>
      createServiceNowTemplateWithHttpInfoAsync(ServiceNowTemplateCreateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createServiceNowTemplate";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ServiceNowTemplateResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<ServiceNowTemplateResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createServiceNowTemplate"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/integration/servicenow/handles";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ServiceNowIntegrationApi.createServiceNowTemplate",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ServiceNowTemplateResponse>> result = new CompletableFuture<>();
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
        new GenericType<ServiceNowTemplateResponse>() {});
  }

  /**
   * Delete ServiceNow template.
   *
   * <p>See {@link #deleteServiceNowTemplateWithHttpInfo}.
   *
   * @param templateId The ID of the ServiceNow template to delete (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteServiceNowTemplate(UUID templateId) throws ApiException {
    deleteServiceNowTemplateWithHttpInfo(templateId);
  }

  /**
   * Delete ServiceNow template.
   *
   * <p>See {@link #deleteServiceNowTemplateWithHttpInfoAsync}.
   *
   * @param templateId The ID of the ServiceNow template to delete (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteServiceNowTemplateAsync(UUID templateId) {
    return deleteServiceNowTemplateWithHttpInfoAsync(templateId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete a ServiceNow template by ID.
   *
   * @param templateId The ID of the ServiceNow template to delete (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteServiceNowTemplateWithHttpInfo(UUID templateId)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteServiceNowTemplate";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'templateId' when calling deleteServiceNowTemplate");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration/servicenow/handles/{template_id}"
            .replaceAll(
                "\\{" + "template_id" + "\\}", apiClient.escapeString(templateId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ServiceNowIntegrationApi.deleteServiceNowTemplate",
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
   * Delete ServiceNow template.
   *
   * <p>See {@link #deleteServiceNowTemplateWithHttpInfo}.
   *
   * @param templateId The ID of the ServiceNow template to delete (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteServiceNowTemplateWithHttpInfoAsync(
      UUID templateId) {
    // Check if unstable operation is enabled
    String operationId = "deleteServiceNowTemplate";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'templateId' when calling deleteServiceNowTemplate"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration/servicenow/handles/{template_id}"
            .replaceAll(
                "\\{" + "template_id" + "\\}", apiClient.escapeString(templateId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ServiceNowIntegrationApi.deleteServiceNowTemplate",
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
   * Get ServiceNow template.
   *
   * <p>See {@link #getServiceNowTemplateWithHttpInfo}.
   *
   * @param templateId The ID of the ServiceNow template to retrieve (required)
   * @return ServiceNowTemplateResponse
   * @throws ApiException if fails to make API call
   */
  public ServiceNowTemplateResponse getServiceNowTemplate(UUID templateId) throws ApiException {
    return getServiceNowTemplateWithHttpInfo(templateId).getData();
  }

  /**
   * Get ServiceNow template.
   *
   * <p>See {@link #getServiceNowTemplateWithHttpInfoAsync}.
   *
   * @param templateId The ID of the ServiceNow template to retrieve (required)
   * @return CompletableFuture&lt;ServiceNowTemplateResponse&gt;
   */
  public CompletableFuture<ServiceNowTemplateResponse> getServiceNowTemplateAsync(UUID templateId) {
    return getServiceNowTemplateWithHttpInfoAsync(templateId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a ServiceNow template by ID.
   *
   * @param templateId The ID of the ServiceNow template to retrieve (required)
   * @return ApiResponse&lt;ServiceNowTemplateResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ServiceNowTemplateResponse> getServiceNowTemplateWithHttpInfo(UUID templateId)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getServiceNowTemplate";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'templateId' when calling getServiceNowTemplate");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration/servicenow/handles/{template_id}"
            .replaceAll(
                "\\{" + "template_id" + "\\}", apiClient.escapeString(templateId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ServiceNowIntegrationApi.getServiceNowTemplate",
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
        new GenericType<ServiceNowTemplateResponse>() {});
  }

  /**
   * Get ServiceNow template.
   *
   * <p>See {@link #getServiceNowTemplateWithHttpInfo}.
   *
   * @param templateId The ID of the ServiceNow template to retrieve (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ServiceNowTemplateResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ServiceNowTemplateResponse>>
      getServiceNowTemplateWithHttpInfoAsync(UUID templateId) {
    // Check if unstable operation is enabled
    String operationId = "getServiceNowTemplate";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ServiceNowTemplateResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      CompletableFuture<ApiResponse<ServiceNowTemplateResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'templateId' when calling getServiceNowTemplate"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration/servicenow/handles/{template_id}"
            .replaceAll(
                "\\{" + "template_id" + "\\}", apiClient.escapeString(templateId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ServiceNowIntegrationApi.getServiceNowTemplate",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ServiceNowTemplateResponse>> result = new CompletableFuture<>();
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
        new GenericType<ServiceNowTemplateResponse>() {});
  }

  /**
   * List ServiceNow assignment groups.
   *
   * <p>See {@link #listServiceNowAssignmentGroupsWithHttpInfo}.
   *
   * @param instanceId The ID of the ServiceNow instance (required)
   * @return ServiceNowAssignmentGroupsResponse
   * @throws ApiException if fails to make API call
   */
  public ServiceNowAssignmentGroupsResponse listServiceNowAssignmentGroups(UUID instanceId)
      throws ApiException {
    return listServiceNowAssignmentGroupsWithHttpInfo(instanceId).getData();
  }

  /**
   * List ServiceNow assignment groups.
   *
   * <p>See {@link #listServiceNowAssignmentGroupsWithHttpInfoAsync}.
   *
   * @param instanceId The ID of the ServiceNow instance (required)
   * @return CompletableFuture&lt;ServiceNowAssignmentGroupsResponse&gt;
   */
  public CompletableFuture<ServiceNowAssignmentGroupsResponse> listServiceNowAssignmentGroupsAsync(
      UUID instanceId) {
    return listServiceNowAssignmentGroupsWithHttpInfoAsync(instanceId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get all assignment groups for a ServiceNow instance.
   *
   * @param instanceId The ID of the ServiceNow instance (required)
   * @return ApiResponse&lt;ServiceNowAssignmentGroupsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ServiceNowAssignmentGroupsResponse> listServiceNowAssignmentGroupsWithHttpInfo(
      UUID instanceId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listServiceNowAssignmentGroups";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'instanceId' is set
    if (instanceId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'instanceId' when calling"
              + " listServiceNowAssignmentGroups");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration/servicenow/assignment_groups/{instance_id}"
            .replaceAll(
                "\\{" + "instance_id" + "\\}", apiClient.escapeString(instanceId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ServiceNowIntegrationApi.listServiceNowAssignmentGroups",
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
        new GenericType<ServiceNowAssignmentGroupsResponse>() {});
  }

  /**
   * List ServiceNow assignment groups.
   *
   * <p>See {@link #listServiceNowAssignmentGroupsWithHttpInfo}.
   *
   * @param instanceId The ID of the ServiceNow instance (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ServiceNowAssignmentGroupsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ServiceNowAssignmentGroupsResponse>>
      listServiceNowAssignmentGroupsWithHttpInfoAsync(UUID instanceId) {
    // Check if unstable operation is enabled
    String operationId = "listServiceNowAssignmentGroups";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ServiceNowAssignmentGroupsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'instanceId' is set
    if (instanceId == null) {
      CompletableFuture<ApiResponse<ServiceNowAssignmentGroupsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'instanceId' when calling"
                  + " listServiceNowAssignmentGroups"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration/servicenow/assignment_groups/{instance_id}"
            .replaceAll(
                "\\{" + "instance_id" + "\\}", apiClient.escapeString(instanceId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ServiceNowIntegrationApi.listServiceNowAssignmentGroups",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ServiceNowAssignmentGroupsResponse>> result =
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
        new GenericType<ServiceNowAssignmentGroupsResponse>() {});
  }

  /**
   * List ServiceNow business services.
   *
   * <p>See {@link #listServiceNowBusinessServicesWithHttpInfo}.
   *
   * @param instanceId The ID of the ServiceNow instance (required)
   * @return ServiceNowBusinessServicesResponse
   * @throws ApiException if fails to make API call
   */
  public ServiceNowBusinessServicesResponse listServiceNowBusinessServices(UUID instanceId)
      throws ApiException {
    return listServiceNowBusinessServicesWithHttpInfo(instanceId).getData();
  }

  /**
   * List ServiceNow business services.
   *
   * <p>See {@link #listServiceNowBusinessServicesWithHttpInfoAsync}.
   *
   * @param instanceId The ID of the ServiceNow instance (required)
   * @return CompletableFuture&lt;ServiceNowBusinessServicesResponse&gt;
   */
  public CompletableFuture<ServiceNowBusinessServicesResponse> listServiceNowBusinessServicesAsync(
      UUID instanceId) {
    return listServiceNowBusinessServicesWithHttpInfoAsync(instanceId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get all business services for a ServiceNow instance.
   *
   * @param instanceId The ID of the ServiceNow instance (required)
   * @return ApiResponse&lt;ServiceNowBusinessServicesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ServiceNowBusinessServicesResponse> listServiceNowBusinessServicesWithHttpInfo(
      UUID instanceId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listServiceNowBusinessServices";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'instanceId' is set
    if (instanceId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'instanceId' when calling"
              + " listServiceNowBusinessServices");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration/servicenow/business_services/{instance_id}"
            .replaceAll(
                "\\{" + "instance_id" + "\\}", apiClient.escapeString(instanceId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ServiceNowIntegrationApi.listServiceNowBusinessServices",
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
        new GenericType<ServiceNowBusinessServicesResponse>() {});
  }

  /**
   * List ServiceNow business services.
   *
   * <p>See {@link #listServiceNowBusinessServicesWithHttpInfo}.
   *
   * @param instanceId The ID of the ServiceNow instance (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ServiceNowBusinessServicesResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ServiceNowBusinessServicesResponse>>
      listServiceNowBusinessServicesWithHttpInfoAsync(UUID instanceId) {
    // Check if unstable operation is enabled
    String operationId = "listServiceNowBusinessServices";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ServiceNowBusinessServicesResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'instanceId' is set
    if (instanceId == null) {
      CompletableFuture<ApiResponse<ServiceNowBusinessServicesResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'instanceId' when calling"
                  + " listServiceNowBusinessServices"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration/servicenow/business_services/{instance_id}"
            .replaceAll(
                "\\{" + "instance_id" + "\\}", apiClient.escapeString(instanceId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ServiceNowIntegrationApi.listServiceNowBusinessServices",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ServiceNowBusinessServicesResponse>> result =
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
        new GenericType<ServiceNowBusinessServicesResponse>() {});
  }

  /**
   * List ServiceNow instances.
   *
   * <p>See {@link #listServiceNowInstancesWithHttpInfo}.
   *
   * @return ServiceNowInstancesResponse
   * @throws ApiException if fails to make API call
   */
  public ServiceNowInstancesResponse listServiceNowInstances() throws ApiException {
    return listServiceNowInstancesWithHttpInfo().getData();
  }

  /**
   * List ServiceNow instances.
   *
   * <p>See {@link #listServiceNowInstancesWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;ServiceNowInstancesResponse&gt;
   */
  public CompletableFuture<ServiceNowInstancesResponse> listServiceNowInstancesAsync() {
    return listServiceNowInstancesWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get all ServiceNow instances for the organization.
   *
   * @return ApiResponse&lt;ServiceNowInstancesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ServiceNowInstancesResponse> listServiceNowInstancesWithHttpInfo()
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listServiceNowInstances";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/integration/servicenow/instances";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ServiceNowIntegrationApi.listServiceNowInstances",
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
        new GenericType<ServiceNowInstancesResponse>() {});
  }

  /**
   * List ServiceNow instances.
   *
   * <p>See {@link #listServiceNowInstancesWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;ServiceNowInstancesResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ServiceNowInstancesResponse>>
      listServiceNowInstancesWithHttpInfoAsync() {
    // Check if unstable operation is enabled
    String operationId = "listServiceNowInstances";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ServiceNowInstancesResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/integration/servicenow/instances";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ServiceNowIntegrationApi.listServiceNowInstances",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ServiceNowInstancesResponse>> result =
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
        new GenericType<ServiceNowInstancesResponse>() {});
  }

  /**
   * List ServiceNow templates.
   *
   * <p>See {@link #listServiceNowTemplatesWithHttpInfo}.
   *
   * @return ServiceNowTemplatesResponse
   * @throws ApiException if fails to make API call
   */
  public ServiceNowTemplatesResponse listServiceNowTemplates() throws ApiException {
    return listServiceNowTemplatesWithHttpInfo().getData();
  }

  /**
   * List ServiceNow templates.
   *
   * <p>See {@link #listServiceNowTemplatesWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;ServiceNowTemplatesResponse&gt;
   */
  public CompletableFuture<ServiceNowTemplatesResponse> listServiceNowTemplatesAsync() {
    return listServiceNowTemplatesWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get all ServiceNow templates for the organization.
   *
   * @return ApiResponse&lt;ServiceNowTemplatesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ServiceNowTemplatesResponse> listServiceNowTemplatesWithHttpInfo()
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listServiceNowTemplates";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/integration/servicenow/handles";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ServiceNowIntegrationApi.listServiceNowTemplates",
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
        new GenericType<ServiceNowTemplatesResponse>() {});
  }

  /**
   * List ServiceNow templates.
   *
   * <p>See {@link #listServiceNowTemplatesWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;ServiceNowTemplatesResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ServiceNowTemplatesResponse>>
      listServiceNowTemplatesWithHttpInfoAsync() {
    // Check if unstable operation is enabled
    String operationId = "listServiceNowTemplates";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ServiceNowTemplatesResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/integration/servicenow/handles";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ServiceNowIntegrationApi.listServiceNowTemplates",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ServiceNowTemplatesResponse>> result =
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
        new GenericType<ServiceNowTemplatesResponse>() {});
  }

  /**
   * List ServiceNow users.
   *
   * <p>See {@link #listServiceNowUsersWithHttpInfo}.
   *
   * @param instanceId The ID of the ServiceNow instance (required)
   * @return ServiceNowUsersResponse
   * @throws ApiException if fails to make API call
   */
  public ServiceNowUsersResponse listServiceNowUsers(UUID instanceId) throws ApiException {
    return listServiceNowUsersWithHttpInfo(instanceId).getData();
  }

  /**
   * List ServiceNow users.
   *
   * <p>See {@link #listServiceNowUsersWithHttpInfoAsync}.
   *
   * @param instanceId The ID of the ServiceNow instance (required)
   * @return CompletableFuture&lt;ServiceNowUsersResponse&gt;
   */
  public CompletableFuture<ServiceNowUsersResponse> listServiceNowUsersAsync(UUID instanceId) {
    return listServiceNowUsersWithHttpInfoAsync(instanceId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get all users for a ServiceNow instance.
   *
   * @param instanceId The ID of the ServiceNow instance (required)
   * @return ApiResponse&lt;ServiceNowUsersResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ServiceNowUsersResponse> listServiceNowUsersWithHttpInfo(UUID instanceId)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listServiceNowUsers";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'instanceId' is set
    if (instanceId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'instanceId' when calling listServiceNowUsers");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration/servicenow/users/{instance_id}"
            .replaceAll(
                "\\{" + "instance_id" + "\\}", apiClient.escapeString(instanceId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ServiceNowIntegrationApi.listServiceNowUsers",
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
        new GenericType<ServiceNowUsersResponse>() {});
  }

  /**
   * List ServiceNow users.
   *
   * <p>See {@link #listServiceNowUsersWithHttpInfo}.
   *
   * @param instanceId The ID of the ServiceNow instance (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ServiceNowUsersResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ServiceNowUsersResponse>>
      listServiceNowUsersWithHttpInfoAsync(UUID instanceId) {
    // Check if unstable operation is enabled
    String operationId = "listServiceNowUsers";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ServiceNowUsersResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'instanceId' is set
    if (instanceId == null) {
      CompletableFuture<ApiResponse<ServiceNowUsersResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'instanceId' when calling listServiceNowUsers"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration/servicenow/users/{instance_id}"
            .replaceAll(
                "\\{" + "instance_id" + "\\}", apiClient.escapeString(instanceId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ServiceNowIntegrationApi.listServiceNowUsers",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ServiceNowUsersResponse>> result = new CompletableFuture<>();
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
        new GenericType<ServiceNowUsersResponse>() {});
  }

  /**
   * Update ServiceNow template.
   *
   * <p>See {@link #updateServiceNowTemplateWithHttpInfo}.
   *
   * @param templateId The ID of the ServiceNow template to update (required)
   * @param body (required)
   * @return ServiceNowTemplateResponse
   * @throws ApiException if fails to make API call
   */
  public ServiceNowTemplateResponse updateServiceNowTemplate(
      UUID templateId, ServiceNowTemplateUpdateRequest body) throws ApiException {
    return updateServiceNowTemplateWithHttpInfo(templateId, body).getData();
  }

  /**
   * Update ServiceNow template.
   *
   * <p>See {@link #updateServiceNowTemplateWithHttpInfoAsync}.
   *
   * @param templateId The ID of the ServiceNow template to update (required)
   * @param body (required)
   * @return CompletableFuture&lt;ServiceNowTemplateResponse&gt;
   */
  public CompletableFuture<ServiceNowTemplateResponse> updateServiceNowTemplateAsync(
      UUID templateId, ServiceNowTemplateUpdateRequest body) {
    return updateServiceNowTemplateWithHttpInfoAsync(templateId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update a ServiceNow template by ID.
   *
   * @param templateId The ID of the ServiceNow template to update (required)
   * @param body (required)
   * @return ApiResponse&lt;ServiceNowTemplateResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ServiceNowTemplateResponse> updateServiceNowTemplateWithHttpInfo(
      UUID templateId, ServiceNowTemplateUpdateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateServiceNowTemplate";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'templateId' when calling updateServiceNowTemplate");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateServiceNowTemplate");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration/servicenow/handles/{template_id}"
            .replaceAll(
                "\\{" + "template_id" + "\\}", apiClient.escapeString(templateId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ServiceNowIntegrationApi.updateServiceNowTemplate",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "PUT",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<ServiceNowTemplateResponse>() {});
  }

  /**
   * Update ServiceNow template.
   *
   * <p>See {@link #updateServiceNowTemplateWithHttpInfo}.
   *
   * @param templateId The ID of the ServiceNow template to update (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ServiceNowTemplateResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ServiceNowTemplateResponse>>
      updateServiceNowTemplateWithHttpInfoAsync(
          UUID templateId, ServiceNowTemplateUpdateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "updateServiceNowTemplate";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ServiceNowTemplateResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      CompletableFuture<ApiResponse<ServiceNowTemplateResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'templateId' when calling updateServiceNowTemplate"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<ServiceNowTemplateResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateServiceNowTemplate"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration/servicenow/handles/{template_id}"
            .replaceAll(
                "\\{" + "template_id" + "\\}", apiClient.escapeString(templateId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ServiceNowIntegrationApi.updateServiceNowTemplate",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ServiceNowTemplateResponse>> result = new CompletableFuture<>();
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
        new GenericType<ServiceNowTemplateResponse>() {});
  }
}
