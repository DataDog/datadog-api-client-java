package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.PaginationIterable;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.Attachment;
import com.datadog.api.client.v2.model.AttachmentArray;
import com.datadog.api.client.v2.model.CreateAttachmentRequest;
import com.datadog.api.client.v2.model.CreateIncidentNotificationRuleRequest;
import com.datadog.api.client.v2.model.CreateIncidentNotificationTemplateRequest;
import com.datadog.api.client.v2.model.GlobalIncidentSettingsRequest;
import com.datadog.api.client.v2.model.GlobalIncidentSettingsResponse;
import com.datadog.api.client.v2.model.IncidentAIPostmortemResponse;
import com.datadog.api.client.v2.model.IncidentConfigurationPatchRequest;
import com.datadog.api.client.v2.model.IncidentConfigurationRequest;
import com.datadog.api.client.v2.model.IncidentConfigurationResponse;
import com.datadog.api.client.v2.model.IncidentCreateOnCallPageRequest;
import com.datadog.api.client.v2.model.IncidentCreatePageFromIncidentRequest;
import com.datadog.api.client.v2.model.IncidentCreateRequest;
import com.datadog.api.client.v2.model.IncidentGoogleChatConfigurationPatchRequest;
import com.datadog.api.client.v2.model.IncidentGoogleChatConfigurationRequest;
import com.datadog.api.client.v2.model.IncidentGoogleChatConfigurationResponse;
import com.datadog.api.client.v2.model.IncidentGoogleMeetConfigurationPatchRequest;
import com.datadog.api.client.v2.model.IncidentGoogleMeetConfigurationRequest;
import com.datadog.api.client.v2.model.IncidentGoogleMeetConfigurationResponse;
import com.datadog.api.client.v2.model.IncidentHandleRequest;
import com.datadog.api.client.v2.model.IncidentHandleResponse;
import com.datadog.api.client.v2.model.IncidentHandlesResponse;
import com.datadog.api.client.v2.model.IncidentImpactCreateRequest;
import com.datadog.api.client.v2.model.IncidentImpactFieldRequest;
import com.datadog.api.client.v2.model.IncidentImpactFieldResponse;
import com.datadog.api.client.v2.model.IncidentImpactFieldsResponse;
import com.datadog.api.client.v2.model.IncidentImpactRelatedObject;
import com.datadog.api.client.v2.model.IncidentImpactResponse;
import com.datadog.api.client.v2.model.IncidentImpactsResponse;
import com.datadog.api.client.v2.model.IncidentImportRelatedObject;
import com.datadog.api.client.v2.model.IncidentImportRequest;
import com.datadog.api.client.v2.model.IncidentImportResponse;
import com.datadog.api.client.v2.model.IncidentIntegrationMetadataCreateRequest;
import com.datadog.api.client.v2.model.IncidentIntegrationMetadataListResponse;
import com.datadog.api.client.v2.model.IncidentIntegrationMetadataPatchRequest;
import com.datadog.api.client.v2.model.IncidentIntegrationMetadataResponse;
import com.datadog.api.client.v2.model.IncidentNotificationRule;
import com.datadog.api.client.v2.model.IncidentNotificationRuleArray;
import com.datadog.api.client.v2.model.IncidentNotificationTemplate;
import com.datadog.api.client.v2.model.IncidentNotificationTemplateArray;
import com.datadog.api.client.v2.model.IncidentOnCallPageLinkRequest;
import com.datadog.api.client.v2.model.IncidentOrgSettingsListResponse;
import com.datadog.api.client.v2.model.IncidentOrgSettingsResponse;
import com.datadog.api.client.v2.model.IncidentPageUUIDResponse;
import com.datadog.api.client.v2.model.IncidentRelatedObject;
import com.datadog.api.client.v2.model.IncidentResponderRequest;
import com.datadog.api.client.v2.model.IncidentResponderResponse;
import com.datadog.api.client.v2.model.IncidentRespondersResponse;
import com.datadog.api.client.v2.model.IncidentResponse;
import com.datadog.api.client.v2.model.IncidentResponseData;
import com.datadog.api.client.v2.model.IncidentRulePatchRequest;
import com.datadog.api.client.v2.model.IncidentRuleRequest;
import com.datadog.api.client.v2.model.IncidentRuleResponse;
import com.datadog.api.client.v2.model.IncidentRulesResponse;
import com.datadog.api.client.v2.model.IncidentSearchResponse;
import com.datadog.api.client.v2.model.IncidentSearchResponseIncidentsData;
import com.datadog.api.client.v2.model.IncidentSearchSortOrder;
import com.datadog.api.client.v2.model.IncidentServiceNowRecordRequest;
import com.datadog.api.client.v2.model.IncidentTimestampOverridePatchRequest;
import com.datadog.api.client.v2.model.IncidentTimestampOverrideRequest;
import com.datadog.api.client.v2.model.IncidentTimestampOverrideResponse;
import com.datadog.api.client.v2.model.IncidentTimestampOverridesResponse;
import com.datadog.api.client.v2.model.IncidentTodoCreateRequest;
import com.datadog.api.client.v2.model.IncidentTodoListResponse;
import com.datadog.api.client.v2.model.IncidentTodoPatchRequest;
import com.datadog.api.client.v2.model.IncidentTodoResponse;
import com.datadog.api.client.v2.model.IncidentTypeCreateRequest;
import com.datadog.api.client.v2.model.IncidentTypeListResponse;
import com.datadog.api.client.v2.model.IncidentTypePatchRequest;
import com.datadog.api.client.v2.model.IncidentTypeResponse;
import com.datadog.api.client.v2.model.IncidentUpdateRequest;
import com.datadog.api.client.v2.model.IncidentUserDefinedFieldCreateRequest;
import com.datadog.api.client.v2.model.IncidentUserDefinedFieldListResponse;
import com.datadog.api.client.v2.model.IncidentUserDefinedFieldResponse;
import com.datadog.api.client.v2.model.IncidentUserDefinedFieldUpdateRequest;
import com.datadog.api.client.v2.model.IncidentUserDefinedRolePatchRequest;
import com.datadog.api.client.v2.model.IncidentUserDefinedRoleRequest;
import com.datadog.api.client.v2.model.IncidentUserDefinedRoleResponse;
import com.datadog.api.client.v2.model.IncidentUserDefinedRolesResponse;
import com.datadog.api.client.v2.model.IncidentsResponse;
import com.datadog.api.client.v2.model.PatchAttachmentRequest;
import com.datadog.api.client.v2.model.PatchIncidentNotificationTemplateRequest;
import com.datadog.api.client.v2.model.PostmortemAttachmentRequest;
import com.datadog.api.client.v2.model.PostmortemTemplateRequest;
import com.datadog.api.client.v2.model.PostmortemTemplateResponse;
import com.datadog.api.client.v2.model.PostmortemTemplatesResponse;
import com.datadog.api.client.v2.model.PutIncidentNotificationRuleRequest;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentsApi {
  private ApiClient apiClient;

  public IncidentsApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public IncidentsApi(ApiClient apiClient) {
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

  /** Manage optional parameters to createGlobalIncidentHandle. */
  public static class CreateGlobalIncidentHandleOptionalParameters {
    private String include;

    /**
     * Set include.
     *
     * @param include Comma-separated list of related resources to include in the response
     *     (optional)
     * @return CreateGlobalIncidentHandleOptionalParameters
     */
    public CreateGlobalIncidentHandleOptionalParameters include(String include) {
      this.include = include;
      return this;
    }
  }

  /**
   * Create global incident handle.
   *
   * <p>See {@link #createGlobalIncidentHandleWithHttpInfo}.
   *
   * @param body (required)
   * @return IncidentHandleResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentHandleResponse createGlobalIncidentHandle(IncidentHandleRequest body)
      throws ApiException {
    return createGlobalIncidentHandleWithHttpInfo(
            body, new CreateGlobalIncidentHandleOptionalParameters())
        .getData();
  }

  /**
   * Create global incident handle.
   *
   * <p>See {@link #createGlobalIncidentHandleWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;IncidentHandleResponse&gt;
   */
  public CompletableFuture<IncidentHandleResponse> createGlobalIncidentHandleAsync(
      IncidentHandleRequest body) {
    return createGlobalIncidentHandleWithHttpInfoAsync(
            body, new CreateGlobalIncidentHandleOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create global incident handle.
   *
   * <p>See {@link #createGlobalIncidentHandleWithHttpInfo}.
   *
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return IncidentHandleResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentHandleResponse createGlobalIncidentHandle(
      IncidentHandleRequest body, CreateGlobalIncidentHandleOptionalParameters parameters)
      throws ApiException {
    return createGlobalIncidentHandleWithHttpInfo(body, parameters).getData();
  }

  /**
   * Create global incident handle.
   *
   * <p>See {@link #createGlobalIncidentHandleWithHttpInfoAsync}.
   *
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;IncidentHandleResponse&gt;
   */
  public CompletableFuture<IncidentHandleResponse> createGlobalIncidentHandleAsync(
      IncidentHandleRequest body, CreateGlobalIncidentHandleOptionalParameters parameters) {
    return createGlobalIncidentHandleWithHttpInfoAsync(body, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a new global incident handle.
   *
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;IncidentHandleResponse&gt;
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
  public ApiResponse<IncidentHandleResponse> createGlobalIncidentHandleWithHttpInfo(
      IncidentHandleRequest body, CreateGlobalIncidentHandleOptionalParameters parameters)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createGlobalIncidentHandle";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createGlobalIncidentHandle");
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath = "/api/v2/incidents/config/global/incident-handles";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.createGlobalIncidentHandle",
            localVarPath,
            localVarQueryParams,
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
        new GenericType<IncidentHandleResponse>() {});
  }

  /**
   * Create global incident handle.
   *
   * <p>See {@link #createGlobalIncidentHandleWithHttpInfo}.
   *
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentHandleResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentHandleResponse>>
      createGlobalIncidentHandleWithHttpInfoAsync(
          IncidentHandleRequest body, CreateGlobalIncidentHandleOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "createGlobalIncidentHandle";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentHandleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<IncidentHandleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling createGlobalIncidentHandle"));
      return result;
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath = "/api/v2/incidents/config/global/incident-handles";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.createGlobalIncidentHandle",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentHandleResponse>> result = new CompletableFuture<>();
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
        new GenericType<IncidentHandleResponse>() {});
  }

  /**
   * Create an incident.
   *
   * <p>See {@link #createIncidentWithHttpInfo}.
   *
   * @param body Incident payload. (required)
   * @return IncidentResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentResponse createIncident(IncidentCreateRequest body) throws ApiException {
    return createIncidentWithHttpInfo(body).getData();
  }

  /**
   * Create an incident.
   *
   * <p>See {@link #createIncidentWithHttpInfoAsync}.
   *
   * @param body Incident payload. (required)
   * @return CompletableFuture&lt;IncidentResponse&gt;
   */
  public CompletableFuture<IncidentResponse> createIncidentAsync(IncidentCreateRequest body) {
    return createIncidentWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create an incident.
   *
   * @param body Incident payload. (required)
   * @return ApiResponse&lt;IncidentResponse&gt;
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
  public ApiResponse<IncidentResponse> createIncidentWithHttpInfo(IncidentCreateRequest body)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createIncident";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createIncident");
    }
    // create path and map variables
    String localVarPath = "/api/v2/incidents";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.createIncident",
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
        new GenericType<IncidentResponse>() {});
  }

  /**
   * Create an incident.
   *
   * <p>See {@link #createIncidentWithHttpInfo}.
   *
   * @param body Incident payload. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentResponse>> createIncidentWithHttpInfoAsync(
      IncidentCreateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createIncident";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<IncidentResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createIncident"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/incidents";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.createIncident",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentResponse>> result = new CompletableFuture<>();
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
        new GenericType<IncidentResponse>() {});
  }

  /** Manage optional parameters to createIncidentAttachment. */
  public static class CreateIncidentAttachmentOptionalParameters {
    private String include;

    /**
     * Set include.
     *
     * @param include Resource to include in the response. Supported value: <code>
     *     last_modified_by_user</code>. (optional)
     * @return CreateIncidentAttachmentOptionalParameters
     */
    public CreateIncidentAttachmentOptionalParameters include(String include) {
      this.include = include;
      return this;
    }
  }

  /**
   * Create incident attachment.
   *
   * <p>See {@link #createIncidentAttachmentWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param body (required)
   * @return Attachment
   * @throws ApiException if fails to make API call
   */
  public Attachment createIncidentAttachment(String incidentId, CreateAttachmentRequest body)
      throws ApiException {
    return createIncidentAttachmentWithHttpInfo(
            incidentId, body, new CreateIncidentAttachmentOptionalParameters())
        .getData();
  }

  /**
   * Create incident attachment.
   *
   * <p>See {@link #createIncidentAttachmentWithHttpInfoAsync}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param body (required)
   * @return CompletableFuture&lt;Attachment&gt;
   */
  public CompletableFuture<Attachment> createIncidentAttachmentAsync(
      String incidentId, CreateAttachmentRequest body) {
    return createIncidentAttachmentWithHttpInfoAsync(
            incidentId, body, new CreateIncidentAttachmentOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create incident attachment.
   *
   * <p>See {@link #createIncidentAttachmentWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return Attachment
   * @throws ApiException if fails to make API call
   */
  public Attachment createIncidentAttachment(
      String incidentId,
      CreateAttachmentRequest body,
      CreateIncidentAttachmentOptionalParameters parameters)
      throws ApiException {
    return createIncidentAttachmentWithHttpInfo(incidentId, body, parameters).getData();
  }

  /**
   * Create incident attachment.
   *
   * <p>See {@link #createIncidentAttachmentWithHttpInfoAsync}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;Attachment&gt;
   */
  public CompletableFuture<Attachment> createIncidentAttachmentAsync(
      String incidentId,
      CreateAttachmentRequest body,
      CreateIncidentAttachmentOptionalParameters parameters) {
    return createIncidentAttachmentWithHttpInfoAsync(incidentId, body, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create an incident attachment.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;Attachment&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Attachment> createIncidentAttachmentWithHttpInfo(
      String incidentId,
      CreateAttachmentRequest body,
      CreateIncidentAttachmentOptionalParameters parameters)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createIncidentAttachment";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'incidentId' when calling createIncidentAttachment");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createIncidentAttachment");
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/attachments"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.createIncidentAttachment",
            localVarPath,
            localVarQueryParams,
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
        new GenericType<Attachment>() {});
  }

  /**
   * Create incident attachment.
   *
   * <p>See {@link #createIncidentAttachmentWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;Attachment&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Attachment>> createIncidentAttachmentWithHttpInfoAsync(
      String incidentId,
      CreateAttachmentRequest body,
      CreateIncidentAttachmentOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "createIncidentAttachment";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Attachment>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      CompletableFuture<ApiResponse<Attachment>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'incidentId' when calling createIncidentAttachment"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Attachment>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createIncidentAttachment"));
      return result;
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/attachments"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.createIncidentAttachment",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Attachment>> result = new CompletableFuture<>();
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
        new GenericType<Attachment>() {});
  }

  /**
   * Create an incident configuration.
   *
   * <p>See {@link #createIncidentConfigurationWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param body Incident configuration payload. (required)
   * @return IncidentConfigurationResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentConfigurationResponse createIncidentConfiguration(
      String incidentId, IncidentConfigurationRequest body) throws ApiException {
    return createIncidentConfigurationWithHttpInfo(incidentId, body).getData();
  }

  /**
   * Create an incident configuration.
   *
   * <p>See {@link #createIncidentConfigurationWithHttpInfoAsync}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param body Incident configuration payload. (required)
   * @return CompletableFuture&lt;IncidentConfigurationResponse&gt;
   */
  public CompletableFuture<IncidentConfigurationResponse> createIncidentConfigurationAsync(
      String incidentId, IncidentConfigurationRequest body) {
    return createIncidentConfigurationWithHttpInfoAsync(incidentId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a configuration for an incident.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param body Incident configuration payload. (required)
   * @return ApiResponse&lt;IncidentConfigurationResponse&gt;
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
  public ApiResponse<IncidentConfigurationResponse> createIncidentConfigurationWithHttpInfo(
      String incidentId, IncidentConfigurationRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createIncidentConfiguration";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'incidentId' when calling createIncidentConfiguration");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createIncidentConfiguration");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/configurations"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.createIncidentConfiguration",
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
        new GenericType<IncidentConfigurationResponse>() {});
  }

  /**
   * Create an incident configuration.
   *
   * <p>See {@link #createIncidentConfigurationWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param body Incident configuration payload. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentConfigurationResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentConfigurationResponse>>
      createIncidentConfigurationWithHttpInfoAsync(
          String incidentId, IncidentConfigurationRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createIncidentConfiguration";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentConfigurationResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      CompletableFuture<ApiResponse<IncidentConfigurationResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'incidentId' when calling"
                  + " createIncidentConfiguration"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<IncidentConfigurationResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling createIncidentConfiguration"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/configurations"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.createIncidentConfiguration",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentConfigurationResponse>> result =
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
        new GenericType<IncidentConfigurationResponse>() {});
  }

  /**
   * Create an incident Google Chat configuration.
   *
   * <p>See {@link #createIncidentGoogleChatConfigurationWithHttpInfo}.
   *
   * @param body Google Chat configuration payload. (required)
   * @return IncidentGoogleChatConfigurationResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentGoogleChatConfigurationResponse createIncidentGoogleChatConfiguration(
      IncidentGoogleChatConfigurationRequest body) throws ApiException {
    return createIncidentGoogleChatConfigurationWithHttpInfo(body).getData();
  }

  /**
   * Create an incident Google Chat configuration.
   *
   * <p>See {@link #createIncidentGoogleChatConfigurationWithHttpInfoAsync}.
   *
   * @param body Google Chat configuration payload. (required)
   * @return CompletableFuture&lt;IncidentGoogleChatConfigurationResponse&gt;
   */
  public CompletableFuture<IncidentGoogleChatConfigurationResponse>
      createIncidentGoogleChatConfigurationAsync(IncidentGoogleChatConfigurationRequest body) {
    return createIncidentGoogleChatConfigurationWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a Google Chat configuration for incidents.
   *
   * @param body Google Chat configuration payload. (required)
   * @return ApiResponse&lt;IncidentGoogleChatConfigurationResponse&gt;
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
   *     </table>
   */
  public ApiResponse<IncidentGoogleChatConfigurationResponse>
      createIncidentGoogleChatConfigurationWithHttpInfo(IncidentGoogleChatConfigurationRequest body)
          throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createIncidentGoogleChatConfiguration";
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
              + " createIncidentGoogleChatConfiguration");
    }
    // create path and map variables
    String localVarPath = "/api/v2/incidents/config/google-chat-configurations";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.createIncidentGoogleChatConfiguration",
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
        new GenericType<IncidentGoogleChatConfigurationResponse>() {});
  }

  /**
   * Create an incident Google Chat configuration.
   *
   * <p>See {@link #createIncidentGoogleChatConfigurationWithHttpInfo}.
   *
   * @param body Google Chat configuration payload. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentGoogleChatConfigurationResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentGoogleChatConfigurationResponse>>
      createIncidentGoogleChatConfigurationWithHttpInfoAsync(
          IncidentGoogleChatConfigurationRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createIncidentGoogleChatConfiguration";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentGoogleChatConfigurationResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<IncidentGoogleChatConfigurationResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " createIncidentGoogleChatConfiguration"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/incidents/config/google-chat-configurations";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.createIncidentGoogleChatConfiguration",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentGoogleChatConfigurationResponse>> result =
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
        new GenericType<IncidentGoogleChatConfigurationResponse>() {});
  }

  /**
   * Create an incident Google Meet configuration.
   *
   * <p>See {@link #createIncidentGoogleMeetConfigurationWithHttpInfo}.
   *
   * @param body Google Meet configuration payload. (required)
   * @return IncidentGoogleMeetConfigurationResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentGoogleMeetConfigurationResponse createIncidentGoogleMeetConfiguration(
      IncidentGoogleMeetConfigurationRequest body) throws ApiException {
    return createIncidentGoogleMeetConfigurationWithHttpInfo(body).getData();
  }

  /**
   * Create an incident Google Meet configuration.
   *
   * <p>See {@link #createIncidentGoogleMeetConfigurationWithHttpInfoAsync}.
   *
   * @param body Google Meet configuration payload. (required)
   * @return CompletableFuture&lt;IncidentGoogleMeetConfigurationResponse&gt;
   */
  public CompletableFuture<IncidentGoogleMeetConfigurationResponse>
      createIncidentGoogleMeetConfigurationAsync(IncidentGoogleMeetConfigurationRequest body) {
    return createIncidentGoogleMeetConfigurationWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a Google Meet configuration for incidents.
   *
   * @param body Google Meet configuration payload. (required)
   * @return ApiResponse&lt;IncidentGoogleMeetConfigurationResponse&gt;
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
   *     </table>
   */
  public ApiResponse<IncidentGoogleMeetConfigurationResponse>
      createIncidentGoogleMeetConfigurationWithHttpInfo(IncidentGoogleMeetConfigurationRequest body)
          throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createIncidentGoogleMeetConfiguration";
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
              + " createIncidentGoogleMeetConfiguration");
    }
    // create path and map variables
    String localVarPath = "/api/v2/incidents/config/google-meet-configurations";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.createIncidentGoogleMeetConfiguration",
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
        new GenericType<IncidentGoogleMeetConfigurationResponse>() {});
  }

  /**
   * Create an incident Google Meet configuration.
   *
   * <p>See {@link #createIncidentGoogleMeetConfigurationWithHttpInfo}.
   *
   * @param body Google Meet configuration payload. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentGoogleMeetConfigurationResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentGoogleMeetConfigurationResponse>>
      createIncidentGoogleMeetConfigurationWithHttpInfoAsync(
          IncidentGoogleMeetConfigurationRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createIncidentGoogleMeetConfiguration";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentGoogleMeetConfigurationResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<IncidentGoogleMeetConfigurationResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " createIncidentGoogleMeetConfiguration"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/incidents/config/google-meet-configurations";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.createIncidentGoogleMeetConfiguration",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentGoogleMeetConfigurationResponse>> result =
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
        new GenericType<IncidentGoogleMeetConfigurationResponse>() {});
  }

  /** Manage optional parameters to createIncidentImpact. */
  public static class CreateIncidentImpactOptionalParameters {
    private List<IncidentImpactRelatedObject> include;

    /**
     * Set include.
     *
     * @param include Specifies which related resources should be included in the response.
     *     (optional)
     * @return CreateIncidentImpactOptionalParameters
     */
    public CreateIncidentImpactOptionalParameters include(
        List<IncidentImpactRelatedObject> include) {
      this.include = include;
      return this;
    }
  }

  /**
   * Create an incident impact.
   *
   * <p>See {@link #createIncidentImpactWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param body Incident impact payload. (required)
   * @return IncidentImpactResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentImpactResponse createIncidentImpact(
      String incidentId, IncidentImpactCreateRequest body) throws ApiException {
    return createIncidentImpactWithHttpInfo(
            incidentId, body, new CreateIncidentImpactOptionalParameters())
        .getData();
  }

  /**
   * Create an incident impact.
   *
   * <p>See {@link #createIncidentImpactWithHttpInfoAsync}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param body Incident impact payload. (required)
   * @return CompletableFuture&lt;IncidentImpactResponse&gt;
   */
  public CompletableFuture<IncidentImpactResponse> createIncidentImpactAsync(
      String incidentId, IncidentImpactCreateRequest body) {
    return createIncidentImpactWithHttpInfoAsync(
            incidentId, body, new CreateIncidentImpactOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create an incident impact.
   *
   * <p>See {@link #createIncidentImpactWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param body Incident impact payload. (required)
   * @param parameters Optional parameters for the request.
   * @return IncidentImpactResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentImpactResponse createIncidentImpact(
      String incidentId,
      IncidentImpactCreateRequest body,
      CreateIncidentImpactOptionalParameters parameters)
      throws ApiException {
    return createIncidentImpactWithHttpInfo(incidentId, body, parameters).getData();
  }

  /**
   * Create an incident impact.
   *
   * <p>See {@link #createIncidentImpactWithHttpInfoAsync}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param body Incident impact payload. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;IncidentImpactResponse&gt;
   */
  public CompletableFuture<IncidentImpactResponse> createIncidentImpactAsync(
      String incidentId,
      IncidentImpactCreateRequest body,
      CreateIncidentImpactOptionalParameters parameters) {
    return createIncidentImpactWithHttpInfoAsync(incidentId, body, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create an impact for an incident.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param body Incident impact payload. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;IncidentImpactResponse&gt;
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
  public ApiResponse<IncidentImpactResponse> createIncidentImpactWithHttpInfo(
      String incidentId,
      IncidentImpactCreateRequest body,
      CreateIncidentImpactOptionalParameters parameters)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'incidentId' when calling createIncidentImpact");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createIncidentImpact");
    }
    List<IncidentImpactRelatedObject> include = parameters.include;
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/impacts"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.createIncidentImpact",
            localVarPath,
            localVarQueryParams,
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
        new GenericType<IncidentImpactResponse>() {});
  }

  /**
   * Create an incident impact.
   *
   * <p>See {@link #createIncidentImpactWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param body Incident impact payload. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentImpactResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentImpactResponse>>
      createIncidentImpactWithHttpInfoAsync(
          String incidentId,
          IncidentImpactCreateRequest body,
          CreateIncidentImpactOptionalParameters parameters) {
    Object localVarPostBody = body;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      CompletableFuture<ApiResponse<IncidentImpactResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'incidentId' when calling createIncidentImpact"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<IncidentImpactResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createIncidentImpact"));
      return result;
    }
    List<IncidentImpactRelatedObject> include = parameters.include;
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/impacts"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.createIncidentImpact",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentImpactResponse>> result = new CompletableFuture<>();
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
        new GenericType<IncidentImpactResponse>() {});
  }

  /**
   * Create an incident impact field.
   *
   * <p>See {@link #createIncidentImpactFieldWithHttpInfo}.
   *
   * @param body Impact field payload. (required)
   * @return IncidentImpactFieldResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentImpactFieldResponse createIncidentImpactField(IncidentImpactFieldRequest body)
      throws ApiException {
    return createIncidentImpactFieldWithHttpInfo(body).getData();
  }

  /**
   * Create an incident impact field.
   *
   * <p>See {@link #createIncidentImpactFieldWithHttpInfoAsync}.
   *
   * @param body Impact field payload. (required)
   * @return CompletableFuture&lt;IncidentImpactFieldResponse&gt;
   */
  public CompletableFuture<IncidentImpactFieldResponse> createIncidentImpactFieldAsync(
      IncidentImpactFieldRequest body) {
    return createIncidentImpactFieldWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create an impact field for incidents.
   *
   * @param body Impact field payload. (required)
   * @return ApiResponse&lt;IncidentImpactFieldResponse&gt;
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
   *     </table>
   */
  public ApiResponse<IncidentImpactFieldResponse> createIncidentImpactFieldWithHttpInfo(
      IncidentImpactFieldRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createIncidentImpactField";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createIncidentImpactField");
    }
    // create path and map variables
    String localVarPath = "/api/v2/incidents/config/impact-fields";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.createIncidentImpactField",
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
        new GenericType<IncidentImpactFieldResponse>() {});
  }

  /**
   * Create an incident impact field.
   *
   * <p>See {@link #createIncidentImpactFieldWithHttpInfo}.
   *
   * @param body Impact field payload. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentImpactFieldResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentImpactFieldResponse>>
      createIncidentImpactFieldWithHttpInfoAsync(IncidentImpactFieldRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createIncidentImpactField";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentImpactFieldResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<IncidentImpactFieldResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createIncidentImpactField"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/incidents/config/impact-fields";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.createIncidentImpactField",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentImpactFieldResponse>> result =
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
        new GenericType<IncidentImpactFieldResponse>() {});
  }

  /**
   * Create an incident integration metadata.
   *
   * <p>See {@link #createIncidentIntegrationWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param body Incident integration metadata payload. (required)
   * @return IncidentIntegrationMetadataResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentIntegrationMetadataResponse createIncidentIntegration(
      String incidentId, IncidentIntegrationMetadataCreateRequest body) throws ApiException {
    return createIncidentIntegrationWithHttpInfo(incidentId, body).getData();
  }

  /**
   * Create an incident integration metadata.
   *
   * <p>See {@link #createIncidentIntegrationWithHttpInfoAsync}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param body Incident integration metadata payload. (required)
   * @return CompletableFuture&lt;IncidentIntegrationMetadataResponse&gt;
   */
  public CompletableFuture<IncidentIntegrationMetadataResponse> createIncidentIntegrationAsync(
      String incidentId, IncidentIntegrationMetadataCreateRequest body) {
    return createIncidentIntegrationWithHttpInfoAsync(incidentId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create an incident integration metadata.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param body Incident integration metadata payload. (required)
   * @return ApiResponse&lt;IncidentIntegrationMetadataResponse&gt;
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
  public ApiResponse<IncidentIntegrationMetadataResponse> createIncidentIntegrationWithHttpInfo(
      String incidentId, IncidentIntegrationMetadataCreateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createIncidentIntegration";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'incidentId' when calling createIncidentIntegration");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createIncidentIntegration");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/relationships/integrations"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.createIncidentIntegration",
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
        new GenericType<IncidentIntegrationMetadataResponse>() {});
  }

  /**
   * Create an incident integration metadata.
   *
   * <p>See {@link #createIncidentIntegrationWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param body Incident integration metadata payload. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentIntegrationMetadataResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentIntegrationMetadataResponse>>
      createIncidentIntegrationWithHttpInfoAsync(
          String incidentId, IncidentIntegrationMetadataCreateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createIncidentIntegration";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentIntegrationMetadataResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      CompletableFuture<ApiResponse<IncidentIntegrationMetadataResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'incidentId' when calling"
                  + " createIncidentIntegration"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<IncidentIntegrationMetadataResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createIncidentIntegration"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/relationships/integrations"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.createIncidentIntegration",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentIntegrationMetadataResponse>> result =
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
        new GenericType<IncidentIntegrationMetadataResponse>() {});
  }

  /**
   * Create an incident notification rule.
   *
   * <p>See {@link #createIncidentNotificationRuleWithHttpInfo}.
   *
   * @param body (required)
   * @return IncidentNotificationRule
   * @throws ApiException if fails to make API call
   */
  public IncidentNotificationRule createIncidentNotificationRule(
      CreateIncidentNotificationRuleRequest body) throws ApiException {
    return createIncidentNotificationRuleWithHttpInfo(body).getData();
  }

  /**
   * Create an incident notification rule.
   *
   * <p>See {@link #createIncidentNotificationRuleWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;IncidentNotificationRule&gt;
   */
  public CompletableFuture<IncidentNotificationRule> createIncidentNotificationRuleAsync(
      CreateIncidentNotificationRuleRequest body) {
    return createIncidentNotificationRuleWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Creates a new notification rule.
   *
   * @param body (required)
   * @return ApiResponse&lt;IncidentNotificationRule&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<IncidentNotificationRule> createIncidentNotificationRuleWithHttpInfo(
      CreateIncidentNotificationRuleRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createIncidentNotificationRule";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createIncidentNotificationRule");
    }
    // create path and map variables
    String localVarPath = "/api/v2/incidents/config/notification-rules";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.createIncidentNotificationRule",
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
        new GenericType<IncidentNotificationRule>() {});
  }

  /**
   * Create an incident notification rule.
   *
   * <p>See {@link #createIncidentNotificationRuleWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentNotificationRule&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentNotificationRule>>
      createIncidentNotificationRuleWithHttpInfoAsync(CreateIncidentNotificationRuleRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createIncidentNotificationRule";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentNotificationRule>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<IncidentNotificationRule>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling createIncidentNotificationRule"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/incidents/config/notification-rules";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.createIncidentNotificationRule",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentNotificationRule>> result = new CompletableFuture<>();
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
        new GenericType<IncidentNotificationRule>() {});
  }

  /**
   * Create incident notification template.
   *
   * <p>See {@link #createIncidentNotificationTemplateWithHttpInfo}.
   *
   * @param body (required)
   * @return IncidentNotificationTemplate
   * @throws ApiException if fails to make API call
   */
  public IncidentNotificationTemplate createIncidentNotificationTemplate(
      CreateIncidentNotificationTemplateRequest body) throws ApiException {
    return createIncidentNotificationTemplateWithHttpInfo(body).getData();
  }

  /**
   * Create incident notification template.
   *
   * <p>See {@link #createIncidentNotificationTemplateWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;IncidentNotificationTemplate&gt;
   */
  public CompletableFuture<IncidentNotificationTemplate> createIncidentNotificationTemplateAsync(
      CreateIncidentNotificationTemplateRequest body) {
    return createIncidentNotificationTemplateWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Creates a new notification template.
   *
   * @param body (required)
   * @return ApiResponse&lt;IncidentNotificationTemplate&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<IncidentNotificationTemplate> createIncidentNotificationTemplateWithHttpInfo(
      CreateIncidentNotificationTemplateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createIncidentNotificationTemplate";
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
          "Missing the required parameter 'body' when calling createIncidentNotificationTemplate");
    }
    // create path and map variables
    String localVarPath = "/api/v2/incidents/config/notification-templates";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.createIncidentNotificationTemplate",
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
        new GenericType<IncidentNotificationTemplate>() {});
  }

  /**
   * Create incident notification template.
   *
   * <p>See {@link #createIncidentNotificationTemplateWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentNotificationTemplate&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentNotificationTemplate>>
      createIncidentNotificationTemplateWithHttpInfoAsync(
          CreateIncidentNotificationTemplateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createIncidentNotificationTemplate";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentNotificationTemplate>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<IncidentNotificationTemplate>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " createIncidentNotificationTemplate"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/incidents/config/notification-templates";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.createIncidentNotificationTemplate",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentNotificationTemplate>> result =
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
        new GenericType<IncidentNotificationTemplate>() {});
  }

  /**
   * Create postmortem attachment.
   *
   * <p>See {@link #createIncidentPostmortemAttachmentWithHttpInfo}.
   *
   * @param incidentId The ID of the incident (required)
   * @param body (required)
   * @return Attachment
   * @throws ApiException if fails to make API call
   */
  public Attachment createIncidentPostmortemAttachment(
      String incidentId, PostmortemAttachmentRequest body) throws ApiException {
    return createIncidentPostmortemAttachmentWithHttpInfo(incidentId, body).getData();
  }

  /**
   * Create postmortem attachment.
   *
   * <p>See {@link #createIncidentPostmortemAttachmentWithHttpInfoAsync}.
   *
   * @param incidentId The ID of the incident (required)
   * @param body (required)
   * @return CompletableFuture&lt;Attachment&gt;
   */
  public CompletableFuture<Attachment> createIncidentPostmortemAttachmentAsync(
      String incidentId, PostmortemAttachmentRequest body) {
    return createIncidentPostmortemAttachmentWithHttpInfoAsync(incidentId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a postmortem attachment for an incident.
   *
   * <p>The endpoint accepts markdown for notebooks created in Confluence or Google Docs.
   * Postmortems created from notebooks need to be formatted using frontend notebook cells, in
   * addition to markdown format.
   *
   * @param incidentId The ID of the incident (required)
   * @param body (required)
   * @return ApiResponse&lt;Attachment&gt;
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
  public ApiResponse<Attachment> createIncidentPostmortemAttachmentWithHttpInfo(
      String incidentId, PostmortemAttachmentRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createIncidentPostmortemAttachment";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'incidentId' when calling"
              + " createIncidentPostmortemAttachment");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'body' when calling createIncidentPostmortemAttachment");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/attachments/postmortems"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.createIncidentPostmortemAttachment",
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
        new GenericType<Attachment>() {});
  }

  /**
   * Create postmortem attachment.
   *
   * <p>See {@link #createIncidentPostmortemAttachmentWithHttpInfo}.
   *
   * @param incidentId The ID of the incident (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Attachment&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Attachment>>
      createIncidentPostmortemAttachmentWithHttpInfoAsync(
          String incidentId, PostmortemAttachmentRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createIncidentPostmortemAttachment";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Attachment>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      CompletableFuture<ApiResponse<Attachment>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'incidentId' when calling"
                  + " createIncidentPostmortemAttachment"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Attachment>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " createIncidentPostmortemAttachment"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/attachments/postmortems"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.createIncidentPostmortemAttachment",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Attachment>> result = new CompletableFuture<>();
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
        new GenericType<Attachment>() {});
  }

  /**
   * Create postmortem template.
   *
   * <p>See {@link #createIncidentPostmortemTemplateWithHttpInfo}.
   *
   * @param body (required)
   * @return PostmortemTemplateResponse
   * @throws ApiException if fails to make API call
   */
  public PostmortemTemplateResponse createIncidentPostmortemTemplate(PostmortemTemplateRequest body)
      throws ApiException {
    return createIncidentPostmortemTemplateWithHttpInfo(body).getData();
  }

  /**
   * Create postmortem template.
   *
   * <p>See {@link #createIncidentPostmortemTemplateWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;PostmortemTemplateResponse&gt;
   */
  public CompletableFuture<PostmortemTemplateResponse> createIncidentPostmortemTemplateAsync(
      PostmortemTemplateRequest body) {
    return createIncidentPostmortemTemplateWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a new postmortem template for incidents.
   *
   * @param body (required)
   * @return ApiResponse&lt;PostmortemTemplateResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<PostmortemTemplateResponse> createIncidentPostmortemTemplateWithHttpInfo(
      PostmortemTemplateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createIncidentPostmortemTemplate";
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
          "Missing the required parameter 'body' when calling createIncidentPostmortemTemplate");
    }
    // create path and map variables
    String localVarPath = "/api/v2/incidents/config/postmortem-templates";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.createIncidentPostmortemTemplate",
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
        new GenericType<PostmortemTemplateResponse>() {});
  }

  /**
   * Create postmortem template.
   *
   * <p>See {@link #createIncidentPostmortemTemplateWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;PostmortemTemplateResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<PostmortemTemplateResponse>>
      createIncidentPostmortemTemplateWithHttpInfoAsync(PostmortemTemplateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createIncidentPostmortemTemplate";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<PostmortemTemplateResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<PostmortemTemplateResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " createIncidentPostmortemTemplate"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/incidents/config/postmortem-templates";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.createIncidentPostmortemTemplate",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<PostmortemTemplateResponse>> result = new CompletableFuture<>();
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
        new GenericType<PostmortemTemplateResponse>() {});
  }

  /**
   * Create an incident responder.
   *
   * <p>See {@link #createIncidentResponderWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param body Incident responder payload. (required)
   * @return IncidentResponderResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentResponderResponse createIncidentResponder(
      String incidentId, IncidentResponderRequest body) throws ApiException {
    return createIncidentResponderWithHttpInfo(incidentId, body).getData();
  }

  /**
   * Create an incident responder.
   *
   * <p>See {@link #createIncidentResponderWithHttpInfoAsync}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param body Incident responder payload. (required)
   * @return CompletableFuture&lt;IncidentResponderResponse&gt;
   */
  public CompletableFuture<IncidentResponderResponse> createIncidentResponderAsync(
      String incidentId, IncidentResponderRequest body) {
    return createIncidentResponderWithHttpInfoAsync(incidentId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Add a responder to an incident.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param body Incident responder payload. (required)
   * @return ApiResponse&lt;IncidentResponderResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<IncidentResponderResponse> createIncidentResponderWithHttpInfo(
      String incidentId, IncidentResponderRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createIncidentResponder";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'incidentId' when calling createIncidentResponder");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createIncidentResponder");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/responders"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.createIncidentResponder",
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
        new GenericType<IncidentResponderResponse>() {});
  }

  /**
   * Create an incident responder.
   *
   * <p>See {@link #createIncidentResponderWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param body Incident responder payload. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentResponderResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentResponderResponse>>
      createIncidentResponderWithHttpInfoAsync(String incidentId, IncidentResponderRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createIncidentResponder";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentResponderResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      CompletableFuture<ApiResponse<IncidentResponderResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'incidentId' when calling createIncidentResponder"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<IncidentResponderResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createIncidentResponder"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/responders"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.createIncidentResponder",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentResponderResponse>> result = new CompletableFuture<>();
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
        new GenericType<IncidentResponderResponse>() {});
  }

  /**
   * Create an incident rule.
   *
   * <p>See {@link #createIncidentRuleWithHttpInfo}.
   *
   * @param body Incident rule payload. (required)
   * @return IncidentRuleResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentRuleResponse createIncidentRule(IncidentRuleRequest body) throws ApiException {
    return createIncidentRuleWithHttpInfo(body).getData();
  }

  /**
   * Create an incident rule.
   *
   * <p>See {@link #createIncidentRuleWithHttpInfoAsync}.
   *
   * @param body Incident rule payload. (required)
   * @return CompletableFuture&lt;IncidentRuleResponse&gt;
   */
  public CompletableFuture<IncidentRuleResponse> createIncidentRuleAsync(IncidentRuleRequest body) {
    return createIncidentRuleWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create an incident rule.
   *
   * @param body Incident rule payload. (required)
   * @return ApiResponse&lt;IncidentRuleResponse&gt;
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
   *     </table>
   */
  public ApiResponse<IncidentRuleResponse> createIncidentRuleWithHttpInfo(IncidentRuleRequest body)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createIncidentRule";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createIncidentRule");
    }
    // create path and map variables
    String localVarPath = "/api/v2/incidents/config/rules";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.createIncidentRule",
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
        new GenericType<IncidentRuleResponse>() {});
  }

  /**
   * Create an incident rule.
   *
   * <p>See {@link #createIncidentRuleWithHttpInfo}.
   *
   * @param body Incident rule payload. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentRuleResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentRuleResponse>> createIncidentRuleWithHttpInfoAsync(
      IncidentRuleRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createIncidentRule";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentRuleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<IncidentRuleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createIncidentRule"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/incidents/config/rules";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.createIncidentRule",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentRuleResponse>> result = new CompletableFuture<>();
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
        new GenericType<IncidentRuleResponse>() {});
  }

  /**
   * Create an incident ServiceNow record.
   *
   * <p>See {@link #createIncidentServiceNowRecordWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param body ServiceNow record payload. (required)
   * @return IncidentIntegrationMetadataResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentIntegrationMetadataResponse createIncidentServiceNowRecord(
      String incidentId, IncidentServiceNowRecordRequest body) throws ApiException {
    return createIncidentServiceNowRecordWithHttpInfo(incidentId, body).getData();
  }

  /**
   * Create an incident ServiceNow record.
   *
   * <p>See {@link #createIncidentServiceNowRecordWithHttpInfoAsync}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param body ServiceNow record payload. (required)
   * @return CompletableFuture&lt;IncidentIntegrationMetadataResponse&gt;
   */
  public CompletableFuture<IncidentIntegrationMetadataResponse> createIncidentServiceNowRecordAsync(
      String incidentId, IncidentServiceNowRecordRequest body) {
    return createIncidentServiceNowRecordWithHttpInfoAsync(incidentId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a ServiceNow record for an incident.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param body ServiceNow record payload. (required)
   * @return ApiResponse&lt;IncidentIntegrationMetadataResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<IncidentIntegrationMetadataResponse>
      createIncidentServiceNowRecordWithHttpInfo(
          String incidentId, IncidentServiceNowRecordRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createIncidentServiceNowRecord";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'incidentId' when calling"
              + " createIncidentServiceNowRecord");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createIncidentServiceNowRecord");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/servicenow-records"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.createIncidentServiceNowRecord",
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
        new GenericType<IncidentIntegrationMetadataResponse>() {});
  }

  /**
   * Create an incident ServiceNow record.
   *
   * <p>See {@link #createIncidentServiceNowRecordWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param body ServiceNow record payload. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentIntegrationMetadataResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentIntegrationMetadataResponse>>
      createIncidentServiceNowRecordWithHttpInfoAsync(
          String incidentId, IncidentServiceNowRecordRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createIncidentServiceNowRecord";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentIntegrationMetadataResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      CompletableFuture<ApiResponse<IncidentIntegrationMetadataResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'incidentId' when calling"
                  + " createIncidentServiceNowRecord"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<IncidentIntegrationMetadataResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling createIncidentServiceNowRecord"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/servicenow-records"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.createIncidentServiceNowRecord",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentIntegrationMetadataResponse>> result =
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
        new GenericType<IncidentIntegrationMetadataResponse>() {});
  }

  /**
   * Create an incident todo.
   *
   * <p>See {@link #createIncidentTodoWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param body Incident todo payload. (required)
   * @return IncidentTodoResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentTodoResponse createIncidentTodo(String incidentId, IncidentTodoCreateRequest body)
      throws ApiException {
    return createIncidentTodoWithHttpInfo(incidentId, body).getData();
  }

  /**
   * Create an incident todo.
   *
   * <p>See {@link #createIncidentTodoWithHttpInfoAsync}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param body Incident todo payload. (required)
   * @return CompletableFuture&lt;IncidentTodoResponse&gt;
   */
  public CompletableFuture<IncidentTodoResponse> createIncidentTodoAsync(
      String incidentId, IncidentTodoCreateRequest body) {
    return createIncidentTodoWithHttpInfoAsync(incidentId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create an incident todo.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param body Incident todo payload. (required)
   * @return ApiResponse&lt;IncidentTodoResponse&gt;
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
  public ApiResponse<IncidentTodoResponse> createIncidentTodoWithHttpInfo(
      String incidentId, IncidentTodoCreateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createIncidentTodo";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'incidentId' when calling createIncidentTodo");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createIncidentTodo");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/relationships/todos"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.createIncidentTodo",
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
        new GenericType<IncidentTodoResponse>() {});
  }

  /**
   * Create an incident todo.
   *
   * <p>See {@link #createIncidentTodoWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param body Incident todo payload. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentTodoResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentTodoResponse>> createIncidentTodoWithHttpInfoAsync(
      String incidentId, IncidentTodoCreateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createIncidentTodo";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentTodoResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      CompletableFuture<ApiResponse<IncidentTodoResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'incidentId' when calling createIncidentTodo"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<IncidentTodoResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createIncidentTodo"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/relationships/todos"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.createIncidentTodo",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentTodoResponse>> result = new CompletableFuture<>();
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
        new GenericType<IncidentTodoResponse>() {});
  }

  /**
   * Create an incident type.
   *
   * <p>See {@link #createIncidentTypeWithHttpInfo}.
   *
   * @param body Incident type payload. (required)
   * @return IncidentTypeResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentTypeResponse createIncidentType(IncidentTypeCreateRequest body)
      throws ApiException {
    return createIncidentTypeWithHttpInfo(body).getData();
  }

  /**
   * Create an incident type.
   *
   * <p>See {@link #createIncidentTypeWithHttpInfoAsync}.
   *
   * @param body Incident type payload. (required)
   * @return CompletableFuture&lt;IncidentTypeResponse&gt;
   */
  public CompletableFuture<IncidentTypeResponse> createIncidentTypeAsync(
      IncidentTypeCreateRequest body) {
    return createIncidentTypeWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create an incident type.
   *
   * @param body Incident type payload. (required)
   * @return ApiResponse&lt;IncidentTypeResponse&gt;
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
  public ApiResponse<IncidentTypeResponse> createIncidentTypeWithHttpInfo(
      IncidentTypeCreateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createIncidentType";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createIncidentType");
    }
    // create path and map variables
    String localVarPath = "/api/v2/incidents/config/types";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.createIncidentType",
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
        new GenericType<IncidentTypeResponse>() {});
  }

  /**
   * Create an incident type.
   *
   * <p>See {@link #createIncidentTypeWithHttpInfo}.
   *
   * @param body Incident type payload. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentTypeResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentTypeResponse>> createIncidentTypeWithHttpInfoAsync(
      IncidentTypeCreateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createIncidentType";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentTypeResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<IncidentTypeResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createIncidentType"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/incidents/config/types";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.createIncidentType",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentTypeResponse>> result = new CompletableFuture<>();
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
        new GenericType<IncidentTypeResponse>() {});
  }

  /** Manage optional parameters to createIncidentUserDefinedField. */
  public static class CreateIncidentUserDefinedFieldOptionalParameters {
    private String include;

    /**
     * Set include.
     *
     * @param include Comma-separated list of related resources to include. Supported values are
     *     "last_modified_by_user", "created_by_user", and "incident_type". (optional)
     * @return CreateIncidentUserDefinedFieldOptionalParameters
     */
    public CreateIncidentUserDefinedFieldOptionalParameters include(String include) {
      this.include = include;
      return this;
    }
  }

  /**
   * Create an incident user-defined field.
   *
   * <p>See {@link #createIncidentUserDefinedFieldWithHttpInfo}.
   *
   * @param body Incident user-defined field payload. (required)
   * @return IncidentUserDefinedFieldResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentUserDefinedFieldResponse createIncidentUserDefinedField(
      IncidentUserDefinedFieldCreateRequest body) throws ApiException {
    return createIncidentUserDefinedFieldWithHttpInfo(
            body, new CreateIncidentUserDefinedFieldOptionalParameters())
        .getData();
  }

  /**
   * Create an incident user-defined field.
   *
   * <p>See {@link #createIncidentUserDefinedFieldWithHttpInfoAsync}.
   *
   * @param body Incident user-defined field payload. (required)
   * @return CompletableFuture&lt;IncidentUserDefinedFieldResponse&gt;
   */
  public CompletableFuture<IncidentUserDefinedFieldResponse> createIncidentUserDefinedFieldAsync(
      IncidentUserDefinedFieldCreateRequest body) {
    return createIncidentUserDefinedFieldWithHttpInfoAsync(
            body, new CreateIncidentUserDefinedFieldOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create an incident user-defined field.
   *
   * <p>See {@link #createIncidentUserDefinedFieldWithHttpInfo}.
   *
   * @param body Incident user-defined field payload. (required)
   * @param parameters Optional parameters for the request.
   * @return IncidentUserDefinedFieldResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentUserDefinedFieldResponse createIncidentUserDefinedField(
      IncidentUserDefinedFieldCreateRequest body,
      CreateIncidentUserDefinedFieldOptionalParameters parameters)
      throws ApiException {
    return createIncidentUserDefinedFieldWithHttpInfo(body, parameters).getData();
  }

  /**
   * Create an incident user-defined field.
   *
   * <p>See {@link #createIncidentUserDefinedFieldWithHttpInfoAsync}.
   *
   * @param body Incident user-defined field payload. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;IncidentUserDefinedFieldResponse&gt;
   */
  public CompletableFuture<IncidentUserDefinedFieldResponse> createIncidentUserDefinedFieldAsync(
      IncidentUserDefinedFieldCreateRequest body,
      CreateIncidentUserDefinedFieldOptionalParameters parameters) {
    return createIncidentUserDefinedFieldWithHttpInfoAsync(body, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create an incident user-defined field.
   *
   * @param body Incident user-defined field payload. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;IncidentUserDefinedFieldResponse&gt;
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
  public ApiResponse<IncidentUserDefinedFieldResponse> createIncidentUserDefinedFieldWithHttpInfo(
      IncidentUserDefinedFieldCreateRequest body,
      CreateIncidentUserDefinedFieldOptionalParameters parameters)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createIncidentUserDefinedField";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createIncidentUserDefinedField");
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath = "/api/v2/incidents/config/user-defined-fields";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.createIncidentUserDefinedField",
            localVarPath,
            localVarQueryParams,
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
        new GenericType<IncidentUserDefinedFieldResponse>() {});
  }

  /**
   * Create an incident user-defined field.
   *
   * <p>See {@link #createIncidentUserDefinedFieldWithHttpInfo}.
   *
   * @param body Incident user-defined field payload. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentUserDefinedFieldResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentUserDefinedFieldResponse>>
      createIncidentUserDefinedFieldWithHttpInfoAsync(
          IncidentUserDefinedFieldCreateRequest body,
          CreateIncidentUserDefinedFieldOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "createIncidentUserDefinedField";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentUserDefinedFieldResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<IncidentUserDefinedFieldResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling createIncidentUserDefinedField"));
      return result;
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath = "/api/v2/incidents/config/user-defined-fields";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.createIncidentUserDefinedField",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentUserDefinedFieldResponse>> result =
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
        new GenericType<IncidentUserDefinedFieldResponse>() {});
  }

  /** Manage optional parameters to createIncidentUserDefinedRole. */
  public static class CreateIncidentUserDefinedRoleOptionalParameters {
    private String include;

    /**
     * Set include.
     *
     * @param include Comma-separated list of related resources to include in the response.
     *     (optional)
     * @return CreateIncidentUserDefinedRoleOptionalParameters
     */
    public CreateIncidentUserDefinedRoleOptionalParameters include(String include) {
      this.include = include;
      return this;
    }
  }

  /**
   * Create an incident user-defined role.
   *
   * <p>See {@link #createIncidentUserDefinedRoleWithHttpInfo}.
   *
   * @param body (required)
   * @return IncidentUserDefinedRoleResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentUserDefinedRoleResponse createIncidentUserDefinedRole(
      IncidentUserDefinedRoleRequest body) throws ApiException {
    return createIncidentUserDefinedRoleWithHttpInfo(
            body, new CreateIncidentUserDefinedRoleOptionalParameters())
        .getData();
  }

  /**
   * Create an incident user-defined role.
   *
   * <p>See {@link #createIncidentUserDefinedRoleWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;IncidentUserDefinedRoleResponse&gt;
   */
  public CompletableFuture<IncidentUserDefinedRoleResponse> createIncidentUserDefinedRoleAsync(
      IncidentUserDefinedRoleRequest body) {
    return createIncidentUserDefinedRoleWithHttpInfoAsync(
            body, new CreateIncidentUserDefinedRoleOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create an incident user-defined role.
   *
   * <p>See {@link #createIncidentUserDefinedRoleWithHttpInfo}.
   *
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return IncidentUserDefinedRoleResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentUserDefinedRoleResponse createIncidentUserDefinedRole(
      IncidentUserDefinedRoleRequest body,
      CreateIncidentUserDefinedRoleOptionalParameters parameters)
      throws ApiException {
    return createIncidentUserDefinedRoleWithHttpInfo(body, parameters).getData();
  }

  /**
   * Create an incident user-defined role.
   *
   * <p>See {@link #createIncidentUserDefinedRoleWithHttpInfoAsync}.
   *
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;IncidentUserDefinedRoleResponse&gt;
   */
  public CompletableFuture<IncidentUserDefinedRoleResponse> createIncidentUserDefinedRoleAsync(
      IncidentUserDefinedRoleRequest body,
      CreateIncidentUserDefinedRoleOptionalParameters parameters) {
    return createIncidentUserDefinedRoleWithHttpInfoAsync(body, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a new user-defined role for incidents.
   *
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;IncidentUserDefinedRoleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<IncidentUserDefinedRoleResponse> createIncidentUserDefinedRoleWithHttpInfo(
      IncidentUserDefinedRoleRequest body,
      CreateIncidentUserDefinedRoleOptionalParameters parameters)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createIncidentUserDefinedRole";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createIncidentUserDefinedRole");
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath = "/api/v2/incidents/config/user-defined-roles";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.createIncidentUserDefinedRole",
            localVarPath,
            localVarQueryParams,
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
        new GenericType<IncidentUserDefinedRoleResponse>() {});
  }

  /**
   * Create an incident user-defined role.
   *
   * <p>See {@link #createIncidentUserDefinedRoleWithHttpInfo}.
   *
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentUserDefinedRoleResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentUserDefinedRoleResponse>>
      createIncidentUserDefinedRoleWithHttpInfoAsync(
          IncidentUserDefinedRoleRequest body,
          CreateIncidentUserDefinedRoleOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "createIncidentUserDefinedRole";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentUserDefinedRoleResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<IncidentUserDefinedRoleResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling createIncidentUserDefinedRole"));
      return result;
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath = "/api/v2/incidents/config/user-defined-roles";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.createIncidentUserDefinedRole",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentUserDefinedRoleResponse>> result =
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
        new GenericType<IncidentUserDefinedRoleResponse>() {});
  }

  /**
   * Create an on-call page from an incident.
   *
   * <p>See {@link #createOnCallPageFromIncidentWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param body On-call page creation payload. (required)
   * @return IncidentPageUUIDResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentPageUUIDResponse createOnCallPageFromIncident(
      String incidentId, IncidentCreateOnCallPageRequest body) throws ApiException {
    return createOnCallPageFromIncidentWithHttpInfo(incidentId, body).getData();
  }

  /**
   * Create an on-call page from an incident.
   *
   * <p>See {@link #createOnCallPageFromIncidentWithHttpInfoAsync}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param body On-call page creation payload. (required)
   * @return CompletableFuture&lt;IncidentPageUUIDResponse&gt;
   */
  public CompletableFuture<IncidentPageUUIDResponse> createOnCallPageFromIncidentAsync(
      String incidentId, IncidentCreateOnCallPageRequest body) {
    return createOnCallPageFromIncidentWithHttpInfoAsync(incidentId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create an on-call page directly from an incident.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param body On-call page creation payload. (required)
   * @return ApiResponse&lt;IncidentPageUUIDResponse&gt;
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
  public ApiResponse<IncidentPageUUIDResponse> createOnCallPageFromIncidentWithHttpInfo(
      String incidentId, IncidentCreateOnCallPageRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createOnCallPageFromIncident";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'incidentId' when calling createOnCallPageFromIncident");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createOnCallPageFromIncident");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/page"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.createOnCallPageFromIncident",
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
        new GenericType<IncidentPageUUIDResponse>() {});
  }

  /**
   * Create an on-call page from an incident.
   *
   * <p>See {@link #createOnCallPageFromIncidentWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param body On-call page creation payload. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentPageUUIDResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentPageUUIDResponse>>
      createOnCallPageFromIncidentWithHttpInfoAsync(
          String incidentId, IncidentCreateOnCallPageRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createOnCallPageFromIncident";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentPageUUIDResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      CompletableFuture<ApiResponse<IncidentPageUUIDResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'incidentId' when calling"
                  + " createOnCallPageFromIncident"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<IncidentPageUUIDResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling createOnCallPageFromIncident"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/page"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.createOnCallPageFromIncident",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentPageUUIDResponse>> result = new CompletableFuture<>();
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
        new GenericType<IncidentPageUUIDResponse>() {});
  }

  /**
   * Create a page from an incident.
   *
   * <p>See {@link #createPageFromIncidentWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param body Page creation payload. (required)
   * @return IncidentPageUUIDResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentPageUUIDResponse createPageFromIncident(
      String incidentId, IncidentCreatePageFromIncidentRequest body) throws ApiException {
    return createPageFromIncidentWithHttpInfo(incidentId, body).getData();
  }

  /**
   * Create a page from an incident.
   *
   * <p>See {@link #createPageFromIncidentWithHttpInfoAsync}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param body Page creation payload. (required)
   * @return CompletableFuture&lt;IncidentPageUUIDResponse&gt;
   */
  public CompletableFuture<IncidentPageUUIDResponse> createPageFromIncidentAsync(
      String incidentId, IncidentCreatePageFromIncidentRequest body) {
    return createPageFromIncidentWithHttpInfoAsync(incidentId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a page from an incident using the Cases service.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param body Page creation payload. (required)
   * @return ApiResponse&lt;IncidentPageUUIDResponse&gt;
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
  public ApiResponse<IncidentPageUUIDResponse> createPageFromIncidentWithHttpInfo(
      String incidentId, IncidentCreatePageFromIncidentRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createPageFromIncident";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'incidentId' when calling createPageFromIncident");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createPageFromIncident");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/cases/page"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.createPageFromIncident",
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
        new GenericType<IncidentPageUUIDResponse>() {});
  }

  /**
   * Create a page from an incident.
   *
   * <p>See {@link #createPageFromIncidentWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param body Page creation payload. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentPageUUIDResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentPageUUIDResponse>>
      createPageFromIncidentWithHttpInfoAsync(
          String incidentId, IncidentCreatePageFromIncidentRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createPageFromIncident";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentPageUUIDResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      CompletableFuture<ApiResponse<IncidentPageUUIDResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'incidentId' when calling createPageFromIncident"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<IncidentPageUUIDResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createPageFromIncident"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/cases/page"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.createPageFromIncident",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentPageUUIDResponse>> result = new CompletableFuture<>();
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
        new GenericType<IncidentPageUUIDResponse>() {});
  }

  /**
   * Create an incident timestamp override.
   *
   * <p>See {@link #createTimestampOverrideWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param body Timestamp override payload. (required)
   * @return IncidentTimestampOverrideResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentTimestampOverrideResponse createTimestampOverride(
      String incidentId, IncidentTimestampOverrideRequest body) throws ApiException {
    return createTimestampOverrideWithHttpInfo(incidentId, body).getData();
  }

  /**
   * Create an incident timestamp override.
   *
   * <p>See {@link #createTimestampOverrideWithHttpInfoAsync}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param body Timestamp override payload. (required)
   * @return CompletableFuture&lt;IncidentTimestampOverrideResponse&gt;
   */
  public CompletableFuture<IncidentTimestampOverrideResponse> createTimestampOverrideAsync(
      String incidentId, IncidentTimestampOverrideRequest body) {
    return createTimestampOverrideWithHttpInfoAsync(incidentId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a timestamp override for an incident.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param body Timestamp override payload. (required)
   * @return ApiResponse&lt;IncidentTimestampOverrideResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<IncidentTimestampOverrideResponse> createTimestampOverrideWithHttpInfo(
      String incidentId, IncidentTimestampOverrideRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createTimestampOverride";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'incidentId' when calling createTimestampOverride");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createTimestampOverride");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/timestamp-overrides"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.createTimestampOverride",
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
        new GenericType<IncidentTimestampOverrideResponse>() {});
  }

  /**
   * Create an incident timestamp override.
   *
   * <p>See {@link #createTimestampOverrideWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param body Timestamp override payload. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentTimestampOverrideResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentTimestampOverrideResponse>>
      createTimestampOverrideWithHttpInfoAsync(
          String incidentId, IncidentTimestampOverrideRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createTimestampOverride";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentTimestampOverrideResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      CompletableFuture<ApiResponse<IncidentTimestampOverrideResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'incidentId' when calling createTimestampOverride"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<IncidentTimestampOverrideResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createTimestampOverride"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/timestamp-overrides"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.createTimestampOverride",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentTimestampOverrideResponse>> result =
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
        new GenericType<IncidentTimestampOverrideResponse>() {});
  }

  /**
   * Delete global incident handle.
   *
   * <p>See {@link #deleteGlobalIncidentHandleWithHttpInfo}.
   *
   * @throws ApiException if fails to make API call
   */
  public void deleteGlobalIncidentHandle() throws ApiException {
    deleteGlobalIncidentHandleWithHttpInfo();
  }

  /**
   * Delete global incident handle.
   *
   * <p>See {@link #deleteGlobalIncidentHandleWithHttpInfoAsync}.
   *
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteGlobalIncidentHandleAsync() {
    return deleteGlobalIncidentHandleWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete a global incident handle.
   *
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteGlobalIncidentHandleWithHttpInfo() throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteGlobalIncidentHandle";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/incidents/config/global/incident-handles";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.deleteGlobalIncidentHandle",
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
   * Delete global incident handle.
   *
   * <p>See {@link #deleteGlobalIncidentHandleWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteGlobalIncidentHandleWithHttpInfoAsync() {
    // Check if unstable operation is enabled
    String operationId = "deleteGlobalIncidentHandle";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/incidents/config/global/incident-handles";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.deleteGlobalIncidentHandle",
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
   * Delete an existing incident.
   *
   * <p>See {@link #deleteIncidentWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteIncident(String incidentId) throws ApiException {
    deleteIncidentWithHttpInfo(incidentId);
  }

  /**
   * Delete an existing incident.
   *
   * <p>See {@link #deleteIncidentWithHttpInfoAsync}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteIncidentAsync(String incidentId) {
    return deleteIncidentWithHttpInfoAsync(incidentId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Deletes an existing incident from the users organization.
   *
   * @param incidentId The UUID of the incident. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteIncidentWithHttpInfo(String incidentId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteIncident";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'incidentId' when calling deleteIncident");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.deleteIncident",
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
   * Delete an existing incident.
   *
   * <p>See {@link #deleteIncidentWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteIncidentWithHttpInfoAsync(String incidentId) {
    // Check if unstable operation is enabled
    String operationId = "deleteIncident";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'incidentId' when calling deleteIncident"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.deleteIncident",
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
   * Delete incident attachment.
   *
   * <p>See {@link #deleteIncidentAttachmentWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param attachmentId The ID of the attachment. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteIncidentAttachment(String incidentId, String attachmentId) throws ApiException {
    deleteIncidentAttachmentWithHttpInfo(incidentId, attachmentId);
  }

  /**
   * Delete incident attachment.
   *
   * <p>See {@link #deleteIncidentAttachmentWithHttpInfoAsync}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param attachmentId The ID of the attachment. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteIncidentAttachmentAsync(
      String incidentId, String attachmentId) {
    return deleteIncidentAttachmentWithHttpInfoAsync(incidentId, attachmentId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * @param incidentId The UUID of the incident. (required)
   * @param attachmentId The ID of the attachment. (required)
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
  public ApiResponse<Void> deleteIncidentAttachmentWithHttpInfo(
      String incidentId, String attachmentId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteIncidentAttachment";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'incidentId' when calling deleteIncidentAttachment");
    }

    // verify the required parameter 'attachmentId' is set
    if (attachmentId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'attachmentId' when calling deleteIncidentAttachment");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/attachments/{attachment_id}"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()))
            .replaceAll(
                "\\{" + "attachment_id" + "\\}", apiClient.escapeString(attachmentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.deleteIncidentAttachment",
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
   * Delete incident attachment.
   *
   * <p>See {@link #deleteIncidentAttachmentWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param attachmentId The ID of the attachment. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteIncidentAttachmentWithHttpInfoAsync(
      String incidentId, String attachmentId) {
    // Check if unstable operation is enabled
    String operationId = "deleteIncidentAttachment";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'incidentId' when calling deleteIncidentAttachment"));
      return result;
    }

    // verify the required parameter 'attachmentId' is set
    if (attachmentId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'attachmentId' when calling"
                  + " deleteIncidentAttachment"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/attachments/{attachment_id}"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()))
            .replaceAll(
                "\\{" + "attachment_id" + "\\}", apiClient.escapeString(attachmentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.deleteIncidentAttachment",
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
   * Delete an incident impact.
   *
   * <p>See {@link #deleteIncidentImpactWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param impactId The UUID of the incident impact. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteIncidentImpact(String incidentId, String impactId) throws ApiException {
    deleteIncidentImpactWithHttpInfo(incidentId, impactId);
  }

  /**
   * Delete an incident impact.
   *
   * <p>See {@link #deleteIncidentImpactWithHttpInfoAsync}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param impactId The UUID of the incident impact. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteIncidentImpactAsync(String incidentId, String impactId) {
    return deleteIncidentImpactWithHttpInfoAsync(incidentId, impactId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete an incident impact.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param impactId The UUID of the incident impact. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteIncidentImpactWithHttpInfo(String incidentId, String impactId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'incidentId' when calling deleteIncidentImpact");
    }

    // verify the required parameter 'impactId' is set
    if (impactId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'impactId' when calling deleteIncidentImpact");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/impacts/{impact_id}"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()))
            .replaceAll("\\{" + "impact_id" + "\\}", apiClient.escapeString(impactId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.deleteIncidentImpact",
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
   * Delete an incident impact.
   *
   * <p>See {@link #deleteIncidentImpactWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param impactId The UUID of the incident impact. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteIncidentImpactWithHttpInfoAsync(
      String incidentId, String impactId) {
    Object localVarPostBody = null;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'incidentId' when calling deleteIncidentImpact"));
      return result;
    }

    // verify the required parameter 'impactId' is set
    if (impactId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'impactId' when calling deleteIncidentImpact"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/impacts/{impact_id}"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()))
            .replaceAll("\\{" + "impact_id" + "\\}", apiClient.escapeString(impactId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.deleteIncidentImpact",
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
   * Delete an incident impact field.
   *
   * <p>See {@link #deleteIncidentImpactFieldWithHttpInfo}.
   *
   * @param fieldId The UUID of the impact field. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteIncidentImpactField(UUID fieldId) throws ApiException {
    deleteIncidentImpactFieldWithHttpInfo(fieldId);
  }

  /**
   * Delete an incident impact field.
   *
   * <p>See {@link #deleteIncidentImpactFieldWithHttpInfoAsync}.
   *
   * @param fieldId The UUID of the impact field. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteIncidentImpactFieldAsync(UUID fieldId) {
    return deleteIncidentImpactFieldWithHttpInfoAsync(fieldId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete an impact field for incidents.
   *
   * @param fieldId The UUID of the impact field. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteIncidentImpactFieldWithHttpInfo(UUID fieldId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteIncidentImpactField";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'fieldId' is set
    if (fieldId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'fieldId' when calling deleteIncidentImpactField");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/config/impact-fields/{field_id}"
            .replaceAll("\\{" + "field_id" + "\\}", apiClient.escapeString(fieldId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.deleteIncidentImpactField",
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
   * Delete an incident impact field.
   *
   * <p>See {@link #deleteIncidentImpactFieldWithHttpInfo}.
   *
   * @param fieldId The UUID of the impact field. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteIncidentImpactFieldWithHttpInfoAsync(
      UUID fieldId) {
    // Check if unstable operation is enabled
    String operationId = "deleteIncidentImpactField";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'fieldId' is set
    if (fieldId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'fieldId' when calling deleteIncidentImpactField"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/config/impact-fields/{field_id}"
            .replaceAll("\\{" + "field_id" + "\\}", apiClient.escapeString(fieldId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.deleteIncidentImpactField",
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
   * Delete an incident integration metadata.
   *
   * <p>See {@link #deleteIncidentIntegrationWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param integrationMetadataId The UUID of the incident integration metadata. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteIncidentIntegration(String incidentId, String integrationMetadataId)
      throws ApiException {
    deleteIncidentIntegrationWithHttpInfo(incidentId, integrationMetadataId);
  }

  /**
   * Delete an incident integration metadata.
   *
   * <p>See {@link #deleteIncidentIntegrationWithHttpInfoAsync}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param integrationMetadataId The UUID of the incident integration metadata. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteIncidentIntegrationAsync(
      String incidentId, String integrationMetadataId) {
    return deleteIncidentIntegrationWithHttpInfoAsync(incidentId, integrationMetadataId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete an incident integration metadata.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param integrationMetadataId The UUID of the incident integration metadata. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteIncidentIntegrationWithHttpInfo(
      String incidentId, String integrationMetadataId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteIncidentIntegration";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'incidentId' when calling deleteIncidentIntegration");
    }

    // verify the required parameter 'integrationMetadataId' is set
    if (integrationMetadataId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'integrationMetadataId' when calling"
              + " deleteIncidentIntegration");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/relationships/integrations/{integration_metadata_id}"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()))
            .replaceAll(
                "\\{" + "integration_metadata_id" + "\\}",
                apiClient.escapeString(integrationMetadataId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.deleteIncidentIntegration",
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
   * Delete an incident integration metadata.
   *
   * <p>See {@link #deleteIncidentIntegrationWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param integrationMetadataId The UUID of the incident integration metadata. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteIncidentIntegrationWithHttpInfoAsync(
      String incidentId, String integrationMetadataId) {
    // Check if unstable operation is enabled
    String operationId = "deleteIncidentIntegration";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'incidentId' when calling"
                  + " deleteIncidentIntegration"));
      return result;
    }

    // verify the required parameter 'integrationMetadataId' is set
    if (integrationMetadataId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'integrationMetadataId' when calling"
                  + " deleteIncidentIntegration"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/relationships/integrations/{integration_metadata_id}"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()))
            .replaceAll(
                "\\{" + "integration_metadata_id" + "\\}",
                apiClient.escapeString(integrationMetadataId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.deleteIncidentIntegration",
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

  /** Manage optional parameters to deleteIncidentNotificationRule. */
  public static class DeleteIncidentNotificationRuleOptionalParameters {
    private String include;

    /**
     * Set include.
     *
     * @param include Comma-separated list of resources to include. Supported values: <code>
     *     created_by_user</code>, <code>last_modified_by_user</code>, <code>incident_type</code>,
     *     <code>notification_template</code> (optional)
     * @return DeleteIncidentNotificationRuleOptionalParameters
     */
    public DeleteIncidentNotificationRuleOptionalParameters include(String include) {
      this.include = include;
      return this;
    }
  }

  /**
   * Delete an incident notification rule.
   *
   * <p>See {@link #deleteIncidentNotificationRuleWithHttpInfo}.
   *
   * @param id The ID of the notification rule. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteIncidentNotificationRule(UUID id) throws ApiException {
    deleteIncidentNotificationRuleWithHttpInfo(
        id, new DeleteIncidentNotificationRuleOptionalParameters());
  }

  /**
   * Delete an incident notification rule.
   *
   * <p>See {@link #deleteIncidentNotificationRuleWithHttpInfoAsync}.
   *
   * @param id The ID of the notification rule. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteIncidentNotificationRuleAsync(UUID id) {
    return deleteIncidentNotificationRuleWithHttpInfoAsync(
            id, new DeleteIncidentNotificationRuleOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete an incident notification rule.
   *
   * <p>See {@link #deleteIncidentNotificationRuleWithHttpInfo}.
   *
   * @param id The ID of the notification rule. (required)
   * @param parameters Optional parameters for the request.
   * @throws ApiException if fails to make API call
   */
  public void deleteIncidentNotificationRule(
      UUID id, DeleteIncidentNotificationRuleOptionalParameters parameters) throws ApiException {
    deleteIncidentNotificationRuleWithHttpInfo(id, parameters);
  }

  /**
   * Delete an incident notification rule.
   *
   * <p>See {@link #deleteIncidentNotificationRuleWithHttpInfoAsync}.
   *
   * @param id The ID of the notification rule. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteIncidentNotificationRuleAsync(
      UUID id, DeleteIncidentNotificationRuleOptionalParameters parameters) {
    return deleteIncidentNotificationRuleWithHttpInfoAsync(id, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Deletes a notification rule by its ID.
   *
   * @param id The ID of the notification rule. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteIncidentNotificationRuleWithHttpInfo(
      UUID id, DeleteIncidentNotificationRuleOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteIncidentNotificationRule";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(
          400, "Missing the required parameter 'id' when calling deleteIncidentNotificationRule");
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/config/notification-rules/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.deleteIncidentNotificationRule",
            localVarPath,
            localVarQueryParams,
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
   * Delete an incident notification rule.
   *
   * <p>See {@link #deleteIncidentNotificationRuleWithHttpInfo}.
   *
   * @param id The ID of the notification rule. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteIncidentNotificationRuleWithHttpInfoAsync(
      UUID id, DeleteIncidentNotificationRuleOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "deleteIncidentNotificationRule";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'id' when calling deleteIncidentNotificationRule"));
      return result;
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/config/notification-rules/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.deleteIncidentNotificationRule",
              localVarPath,
              localVarQueryParams,
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

  /** Manage optional parameters to deleteIncidentNotificationTemplate. */
  public static class DeleteIncidentNotificationTemplateOptionalParameters {
    private String include;

    /**
     * Set include.
     *
     * @param include Comma-separated list of relationships to include. Supported values: <code>
     *     created_by_user</code>, <code>last_modified_by_user</code>, <code>incident_type</code>
     *     (optional)
     * @return DeleteIncidentNotificationTemplateOptionalParameters
     */
    public DeleteIncidentNotificationTemplateOptionalParameters include(String include) {
      this.include = include;
      return this;
    }
  }

  /**
   * Delete a notification template.
   *
   * <p>See {@link #deleteIncidentNotificationTemplateWithHttpInfo}.
   *
   * @param id The ID of the notification template. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteIncidentNotificationTemplate(UUID id) throws ApiException {
    deleteIncidentNotificationTemplateWithHttpInfo(
        id, new DeleteIncidentNotificationTemplateOptionalParameters());
  }

  /**
   * Delete a notification template.
   *
   * <p>See {@link #deleteIncidentNotificationTemplateWithHttpInfoAsync}.
   *
   * @param id The ID of the notification template. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteIncidentNotificationTemplateAsync(UUID id) {
    return deleteIncidentNotificationTemplateWithHttpInfoAsync(
            id, new DeleteIncidentNotificationTemplateOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete a notification template.
   *
   * <p>See {@link #deleteIncidentNotificationTemplateWithHttpInfo}.
   *
   * @param id The ID of the notification template. (required)
   * @param parameters Optional parameters for the request.
   * @throws ApiException if fails to make API call
   */
  public void deleteIncidentNotificationTemplate(
      UUID id, DeleteIncidentNotificationTemplateOptionalParameters parameters)
      throws ApiException {
    deleteIncidentNotificationTemplateWithHttpInfo(id, parameters);
  }

  /**
   * Delete a notification template.
   *
   * <p>See {@link #deleteIncidentNotificationTemplateWithHttpInfoAsync}.
   *
   * @param id The ID of the notification template. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteIncidentNotificationTemplateAsync(
      UUID id, DeleteIncidentNotificationTemplateOptionalParameters parameters) {
    return deleteIncidentNotificationTemplateWithHttpInfoAsync(id, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Deletes a notification template by its ID.
   *
   * @param id The ID of the notification template. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteIncidentNotificationTemplateWithHttpInfo(
      UUID id, DeleteIncidentNotificationTemplateOptionalParameters parameters)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteIncidentNotificationTemplate";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'id' when calling deleteIncidentNotificationTemplate");
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/config/notification-templates/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.deleteIncidentNotificationTemplate",
            localVarPath,
            localVarQueryParams,
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
   * Delete a notification template.
   *
   * <p>See {@link #deleteIncidentNotificationTemplateWithHttpInfo}.
   *
   * @param id The ID of the notification template. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteIncidentNotificationTemplateWithHttpInfoAsync(
      UUID id, DeleteIncidentNotificationTemplateOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "deleteIncidentNotificationTemplate";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'id' when calling"
                  + " deleteIncidentNotificationTemplate"));
      return result;
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/config/notification-templates/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.deleteIncidentNotificationTemplate",
              localVarPath,
              localVarQueryParams,
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
   * Delete postmortem template.
   *
   * <p>See {@link #deleteIncidentPostmortemTemplateWithHttpInfo}.
   *
   * @param templateId The ID of the postmortem template (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteIncidentPostmortemTemplate(String templateId) throws ApiException {
    deleteIncidentPostmortemTemplateWithHttpInfo(templateId);
  }

  /**
   * Delete postmortem template.
   *
   * <p>See {@link #deleteIncidentPostmortemTemplateWithHttpInfoAsync}.
   *
   * @param templateId The ID of the postmortem template (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteIncidentPostmortemTemplateAsync(String templateId) {
    return deleteIncidentPostmortemTemplateWithHttpInfoAsync(templateId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete a postmortem template.
   *
   * @param templateId The ID of the postmortem template (required)
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
   *     </table>
   */
  public ApiResponse<Void> deleteIncidentPostmortemTemplateWithHttpInfo(String templateId)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteIncidentPostmortemTemplate";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'templateId' when calling"
              + " deleteIncidentPostmortemTemplate");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/config/postmortem-templates/{template_id}"
            .replaceAll(
                "\\{" + "template_id" + "\\}", apiClient.escapeString(templateId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.deleteIncidentPostmortemTemplate",
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
   * Delete postmortem template.
   *
   * <p>See {@link #deleteIncidentPostmortemTemplateWithHttpInfo}.
   *
   * @param templateId The ID of the postmortem template (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteIncidentPostmortemTemplateWithHttpInfoAsync(
      String templateId) {
    // Check if unstable operation is enabled
    String operationId = "deleteIncidentPostmortemTemplate";
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
              "Missing the required parameter 'templateId' when calling"
                  + " deleteIncidentPostmortemTemplate"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/config/postmortem-templates/{template_id}"
            .replaceAll(
                "\\{" + "template_id" + "\\}", apiClient.escapeString(templateId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.deleteIncidentPostmortemTemplate",
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
   * Delete an incident responder.
   *
   * <p>See {@link #deleteIncidentResponderWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param responderId The UUID of the incident responder. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteIncidentResponder(String incidentId, UUID responderId) throws ApiException {
    deleteIncidentResponderWithHttpInfo(incidentId, responderId);
  }

  /**
   * Delete an incident responder.
   *
   * <p>See {@link #deleteIncidentResponderWithHttpInfoAsync}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param responderId The UUID of the incident responder. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteIncidentResponderAsync(String incidentId, UUID responderId) {
    return deleteIncidentResponderWithHttpInfoAsync(incidentId, responderId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Remove a responder from an incident.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param responderId The UUID of the incident responder. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteIncidentResponderWithHttpInfo(String incidentId, UUID responderId)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteIncidentResponder";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'incidentId' when calling deleteIncidentResponder");
    }

    // verify the required parameter 'responderId' is set
    if (responderId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'responderId' when calling deleteIncidentResponder");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/responders/{responder_id}"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()))
            .replaceAll(
                "\\{" + "responder_id" + "\\}", apiClient.escapeString(responderId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.deleteIncidentResponder",
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
   * Delete an incident responder.
   *
   * <p>See {@link #deleteIncidentResponderWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param responderId The UUID of the incident responder. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteIncidentResponderWithHttpInfoAsync(
      String incidentId, UUID responderId) {
    // Check if unstable operation is enabled
    String operationId = "deleteIncidentResponder";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'incidentId' when calling deleteIncidentResponder"));
      return result;
    }

    // verify the required parameter 'responderId' is set
    if (responderId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'responderId' when calling deleteIncidentResponder"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/responders/{responder_id}"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()))
            .replaceAll(
                "\\{" + "responder_id" + "\\}", apiClient.escapeString(responderId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.deleteIncidentResponder",
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
   * Delete an incident rule.
   *
   * <p>See {@link #deleteIncidentRuleWithHttpInfo}.
   *
   * @param ruleId The UUID of the incident rule. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteIncidentRule(UUID ruleId) throws ApiException {
    deleteIncidentRuleWithHttpInfo(ruleId);
  }

  /**
   * Delete an incident rule.
   *
   * <p>See {@link #deleteIncidentRuleWithHttpInfoAsync}.
   *
   * @param ruleId The UUID of the incident rule. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteIncidentRuleAsync(UUID ruleId) {
    return deleteIncidentRuleWithHttpInfoAsync(ruleId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete an incident rule.
   *
   * @param ruleId The UUID of the incident rule. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteIncidentRuleWithHttpInfo(UUID ruleId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteIncidentRule";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'ruleId' is set
    if (ruleId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'ruleId' when calling deleteIncidentRule");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/config/rules/{rule_id}"
            .replaceAll("\\{" + "rule_id" + "\\}", apiClient.escapeString(ruleId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.deleteIncidentRule",
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
   * Delete an incident rule.
   *
   * <p>See {@link #deleteIncidentRuleWithHttpInfo}.
   *
   * @param ruleId The UUID of the incident rule. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteIncidentRuleWithHttpInfoAsync(UUID ruleId) {
    // Check if unstable operation is enabled
    String operationId = "deleteIncidentRule";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'ruleId' is set
    if (ruleId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'ruleId' when calling deleteIncidentRule"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/config/rules/{rule_id}"
            .replaceAll("\\{" + "rule_id" + "\\}", apiClient.escapeString(ruleId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.deleteIncidentRule",
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
   * Delete an incident todo.
   *
   * <p>See {@link #deleteIncidentTodoWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param todoId The UUID of the incident todo. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteIncidentTodo(String incidentId, String todoId) throws ApiException {
    deleteIncidentTodoWithHttpInfo(incidentId, todoId);
  }

  /**
   * Delete an incident todo.
   *
   * <p>See {@link #deleteIncidentTodoWithHttpInfoAsync}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param todoId The UUID of the incident todo. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteIncidentTodoAsync(String incidentId, String todoId) {
    return deleteIncidentTodoWithHttpInfoAsync(incidentId, todoId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete an incident todo.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param todoId The UUID of the incident todo. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteIncidentTodoWithHttpInfo(String incidentId, String todoId)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteIncidentTodo";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'incidentId' when calling deleteIncidentTodo");
    }

    // verify the required parameter 'todoId' is set
    if (todoId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'todoId' when calling deleteIncidentTodo");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/relationships/todos/{todo_id}"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()))
            .replaceAll("\\{" + "todo_id" + "\\}", apiClient.escapeString(todoId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.deleteIncidentTodo",
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
   * Delete an incident todo.
   *
   * <p>See {@link #deleteIncidentTodoWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param todoId The UUID of the incident todo. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteIncidentTodoWithHttpInfoAsync(
      String incidentId, String todoId) {
    // Check if unstable operation is enabled
    String operationId = "deleteIncidentTodo";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'incidentId' when calling deleteIncidentTodo"));
      return result;
    }

    // verify the required parameter 'todoId' is set
    if (todoId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'todoId' when calling deleteIncidentTodo"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/relationships/todos/{todo_id}"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()))
            .replaceAll("\\{" + "todo_id" + "\\}", apiClient.escapeString(todoId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.deleteIncidentTodo",
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
   * Delete an incident type.
   *
   * <p>See {@link #deleteIncidentTypeWithHttpInfo}.
   *
   * @param incidentTypeId The UUID of the incident type. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteIncidentType(String incidentTypeId) throws ApiException {
    deleteIncidentTypeWithHttpInfo(incidentTypeId);
  }

  /**
   * Delete an incident type.
   *
   * <p>See {@link #deleteIncidentTypeWithHttpInfoAsync}.
   *
   * @param incidentTypeId The UUID of the incident type. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteIncidentTypeAsync(String incidentTypeId) {
    return deleteIncidentTypeWithHttpInfoAsync(incidentTypeId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete an incident type.
   *
   * @param incidentTypeId The UUID of the incident type. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteIncidentTypeWithHttpInfo(String incidentTypeId)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteIncidentType";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'incidentTypeId' is set
    if (incidentTypeId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'incidentTypeId' when calling deleteIncidentType");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/config/types/{incident_type_id}"
            .replaceAll(
                "\\{" + "incident_type_id" + "\\}",
                apiClient.escapeString(incidentTypeId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.deleteIncidentType",
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
   * Delete an incident type.
   *
   * <p>See {@link #deleteIncidentTypeWithHttpInfo}.
   *
   * @param incidentTypeId The UUID of the incident type. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteIncidentTypeWithHttpInfoAsync(
      String incidentTypeId) {
    // Check if unstable operation is enabled
    String operationId = "deleteIncidentType";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'incidentTypeId' is set
    if (incidentTypeId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'incidentTypeId' when calling deleteIncidentType"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/config/types/{incident_type_id}"
            .replaceAll(
                "\\{" + "incident_type_id" + "\\}",
                apiClient.escapeString(incidentTypeId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.deleteIncidentType",
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
   * Delete an incident user-defined field.
   *
   * <p>See {@link #deleteIncidentUserDefinedFieldWithHttpInfo}.
   *
   * @param fieldId The ID of the incident user-defined field. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteIncidentUserDefinedField(String fieldId) throws ApiException {
    deleteIncidentUserDefinedFieldWithHttpInfo(fieldId);
  }

  /**
   * Delete an incident user-defined field.
   *
   * <p>See {@link #deleteIncidentUserDefinedFieldWithHttpInfoAsync}.
   *
   * @param fieldId The ID of the incident user-defined field. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteIncidentUserDefinedFieldAsync(String fieldId) {
    return deleteIncidentUserDefinedFieldWithHttpInfoAsync(fieldId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete an incident user-defined field.
   *
   * @param fieldId The ID of the incident user-defined field. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteIncidentUserDefinedFieldWithHttpInfo(String fieldId)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteIncidentUserDefinedField";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'fieldId' is set
    if (fieldId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'fieldId' when calling deleteIncidentUserDefinedField");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/config/user-defined-fields/{field_id}"
            .replaceAll("\\{" + "field_id" + "\\}", apiClient.escapeString(fieldId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.deleteIncidentUserDefinedField",
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
   * Delete an incident user-defined field.
   *
   * <p>See {@link #deleteIncidentUserDefinedFieldWithHttpInfo}.
   *
   * @param fieldId The ID of the incident user-defined field. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteIncidentUserDefinedFieldWithHttpInfoAsync(
      String fieldId) {
    // Check if unstable operation is enabled
    String operationId = "deleteIncidentUserDefinedField";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'fieldId' is set
    if (fieldId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'fieldId' when calling"
                  + " deleteIncidentUserDefinedField"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/config/user-defined-fields/{field_id}"
            .replaceAll("\\{" + "field_id" + "\\}", apiClient.escapeString(fieldId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.deleteIncidentUserDefinedField",
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
   * Delete an incident user-defined role.
   *
   * <p>See {@link #deleteIncidentUserDefinedRoleWithHttpInfo}.
   *
   * @param roleId The UUID of the incident user-defined role. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteIncidentUserDefinedRole(UUID roleId) throws ApiException {
    deleteIncidentUserDefinedRoleWithHttpInfo(roleId);
  }

  /**
   * Delete an incident user-defined role.
   *
   * <p>See {@link #deleteIncidentUserDefinedRoleWithHttpInfoAsync}.
   *
   * @param roleId The UUID of the incident user-defined role. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteIncidentUserDefinedRoleAsync(UUID roleId) {
    return deleteIncidentUserDefinedRoleWithHttpInfoAsync(roleId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete an existing user-defined role for incidents.
   *
   * @param roleId The UUID of the incident user-defined role. (required)
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
   *     </table>
   */
  public ApiResponse<Void> deleteIncidentUserDefinedRoleWithHttpInfo(UUID roleId)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteIncidentUserDefinedRole";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'roleId' is set
    if (roleId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'roleId' when calling deleteIncidentUserDefinedRole");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/config/user-defined-roles/{role_id}"
            .replaceAll("\\{" + "role_id" + "\\}", apiClient.escapeString(roleId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.deleteIncidentUserDefinedRole",
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
   * Delete an incident user-defined role.
   *
   * <p>See {@link #deleteIncidentUserDefinedRoleWithHttpInfo}.
   *
   * @param roleId The UUID of the incident user-defined role. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteIncidentUserDefinedRoleWithHttpInfoAsync(
      UUID roleId) {
    // Check if unstable operation is enabled
    String operationId = "deleteIncidentUserDefinedRole";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'roleId' is set
    if (roleId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'roleId' when calling"
                  + " deleteIncidentUserDefinedRole"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/config/user-defined-roles/{role_id}"
            .replaceAll("\\{" + "role_id" + "\\}", apiClient.escapeString(roleId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.deleteIncidentUserDefinedRole",
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
   * Delete an incident timestamp override.
   *
   * <p>See {@link #deleteTimestampOverrideWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param id The UUID of the timestamp override. (required)
   * @return IncidentTimestampOverrideResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentTimestampOverrideResponse deleteTimestampOverride(String incidentId, UUID id)
      throws ApiException {
    return deleteTimestampOverrideWithHttpInfo(incidentId, id).getData();
  }

  /**
   * Delete an incident timestamp override.
   *
   * <p>See {@link #deleteTimestampOverrideWithHttpInfoAsync}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param id The UUID of the timestamp override. (required)
   * @return CompletableFuture&lt;IncidentTimestampOverrideResponse&gt;
   */
  public CompletableFuture<IncidentTimestampOverrideResponse> deleteTimestampOverrideAsync(
      String incidentId, UUID id) {
    return deleteTimestampOverrideWithHttpInfoAsync(incidentId, id)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete a timestamp override for an incident.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param id The UUID of the timestamp override. (required)
   * @return ApiResponse&lt;IncidentTimestampOverrideResponse&gt;
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
  public ApiResponse<IncidentTimestampOverrideResponse> deleteTimestampOverrideWithHttpInfo(
      String incidentId, UUID id) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteTimestampOverride";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'incidentId' when calling deleteTimestampOverride");
    }

    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(
          400, "Missing the required parameter 'id' when calling deleteTimestampOverride");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/timestamp-overrides/{id}"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()))
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.deleteTimestampOverride",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<IncidentTimestampOverrideResponse>() {});
  }

  /**
   * Delete an incident timestamp override.
   *
   * <p>See {@link #deleteTimestampOverrideWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param id The UUID of the timestamp override. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentTimestampOverrideResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentTimestampOverrideResponse>>
      deleteTimestampOverrideWithHttpInfoAsync(String incidentId, UUID id) {
    // Check if unstable operation is enabled
    String operationId = "deleteTimestampOverride";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentTimestampOverrideResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      CompletableFuture<ApiResponse<IncidentTimestampOverrideResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'incidentId' when calling deleteTimestampOverride"));
      return result;
    }

    // verify the required parameter 'id' is set
    if (id == null) {
      CompletableFuture<ApiResponse<IncidentTimestampOverrideResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'id' when calling deleteTimestampOverride"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/timestamp-overrides/{id}"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()))
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.deleteTimestampOverride",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentTimestampOverrideResponse>> result =
          new CompletableFuture<>();
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
        new GenericType<IncidentTimestampOverrideResponse>() {});
  }

  /**
   * Get global incident settings.
   *
   * <p>See {@link #getGlobalIncidentSettingsWithHttpInfo}.
   *
   * @return GlobalIncidentSettingsResponse
   * @throws ApiException if fails to make API call
   */
  public GlobalIncidentSettingsResponse getGlobalIncidentSettings() throws ApiException {
    return getGlobalIncidentSettingsWithHttpInfo().getData();
  }

  /**
   * Get global incident settings.
   *
   * <p>See {@link #getGlobalIncidentSettingsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;GlobalIncidentSettingsResponse&gt;
   */
  public CompletableFuture<GlobalIncidentSettingsResponse> getGlobalIncidentSettingsAsync() {
    return getGlobalIncidentSettingsWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Retrieve global incident settings for the organization.
   *
   * @return ApiResponse&lt;GlobalIncidentSettingsResponse&gt;
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
  public ApiResponse<GlobalIncidentSettingsResponse> getGlobalIncidentSettingsWithHttpInfo()
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getGlobalIncidentSettings";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/incidents/config/global/settings";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.getGlobalIncidentSettings",
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
        new GenericType<GlobalIncidentSettingsResponse>() {});
  }

  /**
   * Get global incident settings.
   *
   * <p>See {@link #getGlobalIncidentSettingsWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;GlobalIncidentSettingsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<GlobalIncidentSettingsResponse>>
      getGlobalIncidentSettingsWithHttpInfoAsync() {
    // Check if unstable operation is enabled
    String operationId = "getGlobalIncidentSettings";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<GlobalIncidentSettingsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/incidents/config/global/settings";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.getGlobalIncidentSettings",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<GlobalIncidentSettingsResponse>> result =
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
        new GenericType<GlobalIncidentSettingsResponse>() {});
  }

  /** Manage optional parameters to getIncident. */
  public static class GetIncidentOptionalParameters {
    private List<IncidentRelatedObject> include;

    /**
     * Set include.
     *
     * @param include Specifies which types of related objects should be included in the response.
     *     (optional)
     * @return GetIncidentOptionalParameters
     */
    public GetIncidentOptionalParameters include(List<IncidentRelatedObject> include) {
      this.include = include;
      return this;
    }
  }

  /**
   * Get the details of an incident.
   *
   * <p>See {@link #getIncidentWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @return IncidentResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentResponse getIncident(String incidentId) throws ApiException {
    return getIncidentWithHttpInfo(incidentId, new GetIncidentOptionalParameters()).getData();
  }

  /**
   * Get the details of an incident.
   *
   * <p>See {@link #getIncidentWithHttpInfoAsync}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @return CompletableFuture&lt;IncidentResponse&gt;
   */
  public CompletableFuture<IncidentResponse> getIncidentAsync(String incidentId) {
    return getIncidentWithHttpInfoAsync(incidentId, new GetIncidentOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the details of an incident.
   *
   * <p>See {@link #getIncidentWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param parameters Optional parameters for the request.
   * @return IncidentResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentResponse getIncident(String incidentId, GetIncidentOptionalParameters parameters)
      throws ApiException {
    return getIncidentWithHttpInfo(incidentId, parameters).getData();
  }

  /**
   * Get the details of an incident.
   *
   * <p>See {@link #getIncidentWithHttpInfoAsync}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;IncidentResponse&gt;
   */
  public CompletableFuture<IncidentResponse> getIncidentAsync(
      String incidentId, GetIncidentOptionalParameters parameters) {
    return getIncidentWithHttpInfoAsync(incidentId, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the details of an incident by <code>incident_id</code>.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;IncidentResponse&gt;
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
  public ApiResponse<IncidentResponse> getIncidentWithHttpInfo(
      String incidentId, GetIncidentOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getIncident";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'incidentId' when calling getIncident");
    }
    List<IncidentRelatedObject> include = parameters.include;
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.getIncident",
            localVarPath,
            localVarQueryParams,
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
        new GenericType<IncidentResponse>() {});
  }

  /**
   * Get the details of an incident.
   *
   * <p>See {@link #getIncidentWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentResponse>> getIncidentWithHttpInfoAsync(
      String incidentId, GetIncidentOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "getIncident";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      CompletableFuture<ApiResponse<IncidentResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'incidentId' when calling getIncident"));
      return result;
    }
    List<IncidentRelatedObject> include = parameters.include;
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.getIncident",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentResponse>> result = new CompletableFuture<>();
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
        new GenericType<IncidentResponse>() {});
  }

  /**
   * Get an AI-generated incident postmortem.
   *
   * <p>See {@link #getIncidentAIPostmortemWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @return IncidentAIPostmortemResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentAIPostmortemResponse getIncidentAIPostmortem(String incidentId)
      throws ApiException {
    return getIncidentAIPostmortemWithHttpInfo(incidentId).getData();
  }

  /**
   * Get an AI-generated incident postmortem.
   *
   * <p>See {@link #getIncidentAIPostmortemWithHttpInfoAsync}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @return CompletableFuture&lt;IncidentAIPostmortemResponse&gt;
   */
  public CompletableFuture<IncidentAIPostmortemResponse> getIncidentAIPostmortemAsync(
      String incidentId) {
    return getIncidentAIPostmortemWithHttpInfoAsync(incidentId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Generate an AI postmortem for an incident.
   *
   * @param incidentId The UUID of the incident. (required)
   * @return ApiResponse&lt;IncidentAIPostmortemResponse&gt;
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
  public ApiResponse<IncidentAIPostmortemResponse> getIncidentAIPostmortemWithHttpInfo(
      String incidentId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getIncidentAIPostmortem";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'incidentId' when calling getIncidentAIPostmortem");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/ai/postmortem"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.getIncidentAIPostmortem",
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
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<IncidentAIPostmortemResponse>() {});
  }

  /**
   * Get an AI-generated incident postmortem.
   *
   * <p>See {@link #getIncidentAIPostmortemWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentAIPostmortemResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentAIPostmortemResponse>>
      getIncidentAIPostmortemWithHttpInfoAsync(String incidentId) {
    // Check if unstable operation is enabled
    String operationId = "getIncidentAIPostmortem";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentAIPostmortemResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      CompletableFuture<ApiResponse<IncidentAIPostmortemResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'incidentId' when calling getIncidentAIPostmortem"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/ai/postmortem"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.getIncidentAIPostmortem",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentAIPostmortemResponse>> result =
          new CompletableFuture<>();
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
        new GenericType<IncidentAIPostmortemResponse>() {});
  }

  /**
   * Get incident integration metadata details.
   *
   * <p>See {@link #getIncidentIntegrationWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param integrationMetadataId The UUID of the incident integration metadata. (required)
   * @return IncidentIntegrationMetadataResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentIntegrationMetadataResponse getIncidentIntegration(
      String incidentId, String integrationMetadataId) throws ApiException {
    return getIncidentIntegrationWithHttpInfo(incidentId, integrationMetadataId).getData();
  }

  /**
   * Get incident integration metadata details.
   *
   * <p>See {@link #getIncidentIntegrationWithHttpInfoAsync}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param integrationMetadataId The UUID of the incident integration metadata. (required)
   * @return CompletableFuture&lt;IncidentIntegrationMetadataResponse&gt;
   */
  public CompletableFuture<IncidentIntegrationMetadataResponse> getIncidentIntegrationAsync(
      String incidentId, String integrationMetadataId) {
    return getIncidentIntegrationWithHttpInfoAsync(incidentId, integrationMetadataId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get incident integration metadata details.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param integrationMetadataId The UUID of the incident integration metadata. (required)
   * @return ApiResponse&lt;IncidentIntegrationMetadataResponse&gt;
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
  public ApiResponse<IncidentIntegrationMetadataResponse> getIncidentIntegrationWithHttpInfo(
      String incidentId, String integrationMetadataId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getIncidentIntegration";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'incidentId' when calling getIncidentIntegration");
    }

    // verify the required parameter 'integrationMetadataId' is set
    if (integrationMetadataId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'integrationMetadataId' when calling"
              + " getIncidentIntegration");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/relationships/integrations/{integration_metadata_id}"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()))
            .replaceAll(
                "\\{" + "integration_metadata_id" + "\\}",
                apiClient.escapeString(integrationMetadataId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.getIncidentIntegration",
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
        new GenericType<IncidentIntegrationMetadataResponse>() {});
  }

  /**
   * Get incident integration metadata details.
   *
   * <p>See {@link #getIncidentIntegrationWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param integrationMetadataId The UUID of the incident integration metadata. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentIntegrationMetadataResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentIntegrationMetadataResponse>>
      getIncidentIntegrationWithHttpInfoAsync(String incidentId, String integrationMetadataId) {
    // Check if unstable operation is enabled
    String operationId = "getIncidentIntegration";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentIntegrationMetadataResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      CompletableFuture<ApiResponse<IncidentIntegrationMetadataResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'incidentId' when calling getIncidentIntegration"));
      return result;
    }

    // verify the required parameter 'integrationMetadataId' is set
    if (integrationMetadataId == null) {
      CompletableFuture<ApiResponse<IncidentIntegrationMetadataResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'integrationMetadataId' when calling"
                  + " getIncidentIntegration"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/relationships/integrations/{integration_metadata_id}"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()))
            .replaceAll(
                "\\{" + "integration_metadata_id" + "\\}",
                apiClient.escapeString(integrationMetadataId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.getIncidentIntegration",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentIntegrationMetadataResponse>> result =
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
        new GenericType<IncidentIntegrationMetadataResponse>() {});
  }

  /** Manage optional parameters to getIncidentNotificationRule. */
  public static class GetIncidentNotificationRuleOptionalParameters {
    private String include;

    /**
     * Set include.
     *
     * @param include Comma-separated list of resources to include. Supported values: <code>
     *     created_by_user</code>, <code>last_modified_by_user</code>, <code>incident_type</code>,
     *     <code>notification_template</code> (optional)
     * @return GetIncidentNotificationRuleOptionalParameters
     */
    public GetIncidentNotificationRuleOptionalParameters include(String include) {
      this.include = include;
      return this;
    }
  }

  /**
   * Get an incident notification rule.
   *
   * <p>See {@link #getIncidentNotificationRuleWithHttpInfo}.
   *
   * @param id The ID of the notification rule. (required)
   * @return IncidentNotificationRule
   * @throws ApiException if fails to make API call
   */
  public IncidentNotificationRule getIncidentNotificationRule(UUID id) throws ApiException {
    return getIncidentNotificationRuleWithHttpInfo(
            id, new GetIncidentNotificationRuleOptionalParameters())
        .getData();
  }

  /**
   * Get an incident notification rule.
   *
   * <p>See {@link #getIncidentNotificationRuleWithHttpInfoAsync}.
   *
   * @param id The ID of the notification rule. (required)
   * @return CompletableFuture&lt;IncidentNotificationRule&gt;
   */
  public CompletableFuture<IncidentNotificationRule> getIncidentNotificationRuleAsync(UUID id) {
    return getIncidentNotificationRuleWithHttpInfoAsync(
            id, new GetIncidentNotificationRuleOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get an incident notification rule.
   *
   * <p>See {@link #getIncidentNotificationRuleWithHttpInfo}.
   *
   * @param id The ID of the notification rule. (required)
   * @param parameters Optional parameters for the request.
   * @return IncidentNotificationRule
   * @throws ApiException if fails to make API call
   */
  public IncidentNotificationRule getIncidentNotificationRule(
      UUID id, GetIncidentNotificationRuleOptionalParameters parameters) throws ApiException {
    return getIncidentNotificationRuleWithHttpInfo(id, parameters).getData();
  }

  /**
   * Get an incident notification rule.
   *
   * <p>See {@link #getIncidentNotificationRuleWithHttpInfoAsync}.
   *
   * @param id The ID of the notification rule. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;IncidentNotificationRule&gt;
   */
  public CompletableFuture<IncidentNotificationRule> getIncidentNotificationRuleAsync(
      UUID id, GetIncidentNotificationRuleOptionalParameters parameters) {
    return getIncidentNotificationRuleWithHttpInfoAsync(id, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Retrieves a specific notification rule by its ID.
   *
   * @param id The ID of the notification rule. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;IncidentNotificationRule&gt;
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
  public ApiResponse<IncidentNotificationRule> getIncidentNotificationRuleWithHttpInfo(
      UUID id, GetIncidentNotificationRuleOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getIncidentNotificationRule";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(
          400, "Missing the required parameter 'id' when calling getIncidentNotificationRule");
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/config/notification-rules/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.getIncidentNotificationRule",
            localVarPath,
            localVarQueryParams,
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
        new GenericType<IncidentNotificationRule>() {});
  }

  /**
   * Get an incident notification rule.
   *
   * <p>See {@link #getIncidentNotificationRuleWithHttpInfo}.
   *
   * @param id The ID of the notification rule. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentNotificationRule&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentNotificationRule>>
      getIncidentNotificationRuleWithHttpInfoAsync(
          UUID id, GetIncidentNotificationRuleOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "getIncidentNotificationRule";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentNotificationRule>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
      CompletableFuture<ApiResponse<IncidentNotificationRule>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'id' when calling getIncidentNotificationRule"));
      return result;
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/config/notification-rules/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.getIncidentNotificationRule",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentNotificationRule>> result = new CompletableFuture<>();
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
        new GenericType<IncidentNotificationRule>() {});
  }

  /** Manage optional parameters to getIncidentNotificationTemplate. */
  public static class GetIncidentNotificationTemplateOptionalParameters {
    private String include;

    /**
     * Set include.
     *
     * @param include Comma-separated list of relationships to include. Supported values: <code>
     *     created_by_user</code>, <code>last_modified_by_user</code>, <code>incident_type</code>
     *     (optional)
     * @return GetIncidentNotificationTemplateOptionalParameters
     */
    public GetIncidentNotificationTemplateOptionalParameters include(String include) {
      this.include = include;
      return this;
    }
  }

  /**
   * Get incident notification template.
   *
   * <p>See {@link #getIncidentNotificationTemplateWithHttpInfo}.
   *
   * @param id The ID of the notification template. (required)
   * @return IncidentNotificationTemplate
   * @throws ApiException if fails to make API call
   */
  public IncidentNotificationTemplate getIncidentNotificationTemplate(UUID id) throws ApiException {
    return getIncidentNotificationTemplateWithHttpInfo(
            id, new GetIncidentNotificationTemplateOptionalParameters())
        .getData();
  }

  /**
   * Get incident notification template.
   *
   * <p>See {@link #getIncidentNotificationTemplateWithHttpInfoAsync}.
   *
   * @param id The ID of the notification template. (required)
   * @return CompletableFuture&lt;IncidentNotificationTemplate&gt;
   */
  public CompletableFuture<IncidentNotificationTemplate> getIncidentNotificationTemplateAsync(
      UUID id) {
    return getIncidentNotificationTemplateWithHttpInfoAsync(
            id, new GetIncidentNotificationTemplateOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get incident notification template.
   *
   * <p>See {@link #getIncidentNotificationTemplateWithHttpInfo}.
   *
   * @param id The ID of the notification template. (required)
   * @param parameters Optional parameters for the request.
   * @return IncidentNotificationTemplate
   * @throws ApiException if fails to make API call
   */
  public IncidentNotificationTemplate getIncidentNotificationTemplate(
      UUID id, GetIncidentNotificationTemplateOptionalParameters parameters) throws ApiException {
    return getIncidentNotificationTemplateWithHttpInfo(id, parameters).getData();
  }

  /**
   * Get incident notification template.
   *
   * <p>See {@link #getIncidentNotificationTemplateWithHttpInfoAsync}.
   *
   * @param id The ID of the notification template. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;IncidentNotificationTemplate&gt;
   */
  public CompletableFuture<IncidentNotificationTemplate> getIncidentNotificationTemplateAsync(
      UUID id, GetIncidentNotificationTemplateOptionalParameters parameters) {
    return getIncidentNotificationTemplateWithHttpInfoAsync(id, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Retrieves a specific notification template by its ID.
   *
   * @param id The ID of the notification template. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;IncidentNotificationTemplate&gt;
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
  public ApiResponse<IncidentNotificationTemplate> getIncidentNotificationTemplateWithHttpInfo(
      UUID id, GetIncidentNotificationTemplateOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getIncidentNotificationTemplate";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(
          400, "Missing the required parameter 'id' when calling getIncidentNotificationTemplate");
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/config/notification-templates/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.getIncidentNotificationTemplate",
            localVarPath,
            localVarQueryParams,
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
        new GenericType<IncidentNotificationTemplate>() {});
  }

  /**
   * Get incident notification template.
   *
   * <p>See {@link #getIncidentNotificationTemplateWithHttpInfo}.
   *
   * @param id The ID of the notification template. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentNotificationTemplate&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentNotificationTemplate>>
      getIncidentNotificationTemplateWithHttpInfoAsync(
          UUID id, GetIncidentNotificationTemplateOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "getIncidentNotificationTemplate";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentNotificationTemplate>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
      CompletableFuture<ApiResponse<IncidentNotificationTemplate>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'id' when calling getIncidentNotificationTemplate"));
      return result;
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/config/notification-templates/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.getIncidentNotificationTemplate",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentNotificationTemplate>> result =
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
        new GenericType<IncidentNotificationTemplate>() {});
  }

  /**
   * Get postmortem template.
   *
   * <p>See {@link #getIncidentPostmortemTemplateWithHttpInfo}.
   *
   * @param templateId The ID of the postmortem template (required)
   * @return PostmortemTemplateResponse
   * @throws ApiException if fails to make API call
   */
  public PostmortemTemplateResponse getIncidentPostmortemTemplate(String templateId)
      throws ApiException {
    return getIncidentPostmortemTemplateWithHttpInfo(templateId).getData();
  }

  /**
   * Get postmortem template.
   *
   * <p>See {@link #getIncidentPostmortemTemplateWithHttpInfoAsync}.
   *
   * @param templateId The ID of the postmortem template (required)
   * @return CompletableFuture&lt;PostmortemTemplateResponse&gt;
   */
  public CompletableFuture<PostmortemTemplateResponse> getIncidentPostmortemTemplateAsync(
      String templateId) {
    return getIncidentPostmortemTemplateWithHttpInfoAsync(templateId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Retrieve details of a specific postmortem template.
   *
   * @param templateId The ID of the postmortem template (required)
   * @return ApiResponse&lt;PostmortemTemplateResponse&gt;
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
  public ApiResponse<PostmortemTemplateResponse> getIncidentPostmortemTemplateWithHttpInfo(
      String templateId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getIncidentPostmortemTemplate";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'templateId' when calling getIncidentPostmortemTemplate");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/config/postmortem-templates/{template_id}"
            .replaceAll(
                "\\{" + "template_id" + "\\}", apiClient.escapeString(templateId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.getIncidentPostmortemTemplate",
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
        new GenericType<PostmortemTemplateResponse>() {});
  }

  /**
   * Get postmortem template.
   *
   * <p>See {@link #getIncidentPostmortemTemplateWithHttpInfo}.
   *
   * @param templateId The ID of the postmortem template (required)
   * @return CompletableFuture&lt;ApiResponse&lt;PostmortemTemplateResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<PostmortemTemplateResponse>>
      getIncidentPostmortemTemplateWithHttpInfoAsync(String templateId) {
    // Check if unstable operation is enabled
    String operationId = "getIncidentPostmortemTemplate";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<PostmortemTemplateResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      CompletableFuture<ApiResponse<PostmortemTemplateResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'templateId' when calling"
                  + " getIncidentPostmortemTemplate"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/config/postmortem-templates/{template_id}"
            .replaceAll(
                "\\{" + "template_id" + "\\}", apiClient.escapeString(templateId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.getIncidentPostmortemTemplate",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<PostmortemTemplateResponse>> result = new CompletableFuture<>();
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
        new GenericType<PostmortemTemplateResponse>() {});
  }

  /**
   * Get an incident responder.
   *
   * <p>See {@link #getIncidentResponderWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param responderId The UUID of the incident responder. (required)
   * @return IncidentResponderResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentResponderResponse getIncidentResponder(String incidentId, UUID responderId)
      throws ApiException {
    return getIncidentResponderWithHttpInfo(incidentId, responderId).getData();
  }

  /**
   * Get an incident responder.
   *
   * <p>See {@link #getIncidentResponderWithHttpInfoAsync}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param responderId The UUID of the incident responder. (required)
   * @return CompletableFuture&lt;IncidentResponderResponse&gt;
   */
  public CompletableFuture<IncidentResponderResponse> getIncidentResponderAsync(
      String incidentId, UUID responderId) {
    return getIncidentResponderWithHttpInfoAsync(incidentId, responderId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a single responder for an incident.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param responderId The UUID of the incident responder. (required)
   * @return ApiResponse&lt;IncidentResponderResponse&gt;
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
  public ApiResponse<IncidentResponderResponse> getIncidentResponderWithHttpInfo(
      String incidentId, UUID responderId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getIncidentResponder";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'incidentId' when calling getIncidentResponder");
    }

    // verify the required parameter 'responderId' is set
    if (responderId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'responderId' when calling getIncidentResponder");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/responders/{responder_id}"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()))
            .replaceAll(
                "\\{" + "responder_id" + "\\}", apiClient.escapeString(responderId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.getIncidentResponder",
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
        new GenericType<IncidentResponderResponse>() {});
  }

  /**
   * Get an incident responder.
   *
   * <p>See {@link #getIncidentResponderWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param responderId The UUID of the incident responder. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentResponderResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentResponderResponse>>
      getIncidentResponderWithHttpInfoAsync(String incidentId, UUID responderId) {
    // Check if unstable operation is enabled
    String operationId = "getIncidentResponder";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentResponderResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      CompletableFuture<ApiResponse<IncidentResponderResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'incidentId' when calling getIncidentResponder"));
      return result;
    }

    // verify the required parameter 'responderId' is set
    if (responderId == null) {
      CompletableFuture<ApiResponse<IncidentResponderResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'responderId' when calling getIncidentResponder"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/responders/{responder_id}"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()))
            .replaceAll(
                "\\{" + "responder_id" + "\\}", apiClient.escapeString(responderId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.getIncidentResponder",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentResponderResponse>> result = new CompletableFuture<>();
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
        new GenericType<IncidentResponderResponse>() {});
  }

  /**
   * Get an incident rule.
   *
   * <p>See {@link #getIncidentRuleWithHttpInfo}.
   *
   * @param ruleId The UUID of the incident rule. (required)
   * @return IncidentRuleResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentRuleResponse getIncidentRule(UUID ruleId) throws ApiException {
    return getIncidentRuleWithHttpInfo(ruleId).getData();
  }

  /**
   * Get an incident rule.
   *
   * <p>See {@link #getIncidentRuleWithHttpInfoAsync}.
   *
   * @param ruleId The UUID of the incident rule. (required)
   * @return CompletableFuture&lt;IncidentRuleResponse&gt;
   */
  public CompletableFuture<IncidentRuleResponse> getIncidentRuleAsync(UUID ruleId) {
    return getIncidentRuleWithHttpInfoAsync(ruleId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a single incident rule by ID.
   *
   * @param ruleId The UUID of the incident rule. (required)
   * @return ApiResponse&lt;IncidentRuleResponse&gt;
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
  public ApiResponse<IncidentRuleResponse> getIncidentRuleWithHttpInfo(UUID ruleId)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getIncidentRule";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'ruleId' is set
    if (ruleId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'ruleId' when calling getIncidentRule");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/config/rules/{rule_id}"
            .replaceAll("\\{" + "rule_id" + "\\}", apiClient.escapeString(ruleId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.getIncidentRule",
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
        new GenericType<IncidentRuleResponse>() {});
  }

  /**
   * Get an incident rule.
   *
   * <p>See {@link #getIncidentRuleWithHttpInfo}.
   *
   * @param ruleId The UUID of the incident rule. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentRuleResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentRuleResponse>> getIncidentRuleWithHttpInfoAsync(
      UUID ruleId) {
    // Check if unstable operation is enabled
    String operationId = "getIncidentRule";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentRuleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'ruleId' is set
    if (ruleId == null) {
      CompletableFuture<ApiResponse<IncidentRuleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'ruleId' when calling getIncidentRule"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/config/rules/{rule_id}"
            .replaceAll("\\{" + "rule_id" + "\\}", apiClient.escapeString(ruleId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.getIncidentRule",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentRuleResponse>> result = new CompletableFuture<>();
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
        new GenericType<IncidentRuleResponse>() {});
  }

  /**
   * Get incident todo details.
   *
   * <p>See {@link #getIncidentTodoWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param todoId The UUID of the incident todo. (required)
   * @return IncidentTodoResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentTodoResponse getIncidentTodo(String incidentId, String todoId)
      throws ApiException {
    return getIncidentTodoWithHttpInfo(incidentId, todoId).getData();
  }

  /**
   * Get incident todo details.
   *
   * <p>See {@link #getIncidentTodoWithHttpInfoAsync}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param todoId The UUID of the incident todo. (required)
   * @return CompletableFuture&lt;IncidentTodoResponse&gt;
   */
  public CompletableFuture<IncidentTodoResponse> getIncidentTodoAsync(
      String incidentId, String todoId) {
    return getIncidentTodoWithHttpInfoAsync(incidentId, todoId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get incident todo details.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param todoId The UUID of the incident todo. (required)
   * @return ApiResponse&lt;IncidentTodoResponse&gt;
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
  public ApiResponse<IncidentTodoResponse> getIncidentTodoWithHttpInfo(
      String incidentId, String todoId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getIncidentTodo";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'incidentId' when calling getIncidentTodo");
    }

    // verify the required parameter 'todoId' is set
    if (todoId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'todoId' when calling getIncidentTodo");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/relationships/todos/{todo_id}"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()))
            .replaceAll("\\{" + "todo_id" + "\\}", apiClient.escapeString(todoId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.getIncidentTodo",
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
        new GenericType<IncidentTodoResponse>() {});
  }

  /**
   * Get incident todo details.
   *
   * <p>See {@link #getIncidentTodoWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param todoId The UUID of the incident todo. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentTodoResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentTodoResponse>> getIncidentTodoWithHttpInfoAsync(
      String incidentId, String todoId) {
    // Check if unstable operation is enabled
    String operationId = "getIncidentTodo";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentTodoResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      CompletableFuture<ApiResponse<IncidentTodoResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'incidentId' when calling getIncidentTodo"));
      return result;
    }

    // verify the required parameter 'todoId' is set
    if (todoId == null) {
      CompletableFuture<ApiResponse<IncidentTodoResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'todoId' when calling getIncidentTodo"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/relationships/todos/{todo_id}"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()))
            .replaceAll("\\{" + "todo_id" + "\\}", apiClient.escapeString(todoId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.getIncidentTodo",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentTodoResponse>> result = new CompletableFuture<>();
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
        new GenericType<IncidentTodoResponse>() {});
  }

  /**
   * Get incident type details.
   *
   * <p>See {@link #getIncidentTypeWithHttpInfo}.
   *
   * @param incidentTypeId The UUID of the incident type. (required)
   * @return IncidentTypeResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentTypeResponse getIncidentType(String incidentTypeId) throws ApiException {
    return getIncidentTypeWithHttpInfo(incidentTypeId).getData();
  }

  /**
   * Get incident type details.
   *
   * <p>See {@link #getIncidentTypeWithHttpInfoAsync}.
   *
   * @param incidentTypeId The UUID of the incident type. (required)
   * @return CompletableFuture&lt;IncidentTypeResponse&gt;
   */
  public CompletableFuture<IncidentTypeResponse> getIncidentTypeAsync(String incidentTypeId) {
    return getIncidentTypeWithHttpInfoAsync(incidentTypeId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get incident type details.
   *
   * @param incidentTypeId The UUID of the incident type. (required)
   * @return ApiResponse&lt;IncidentTypeResponse&gt;
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
  public ApiResponse<IncidentTypeResponse> getIncidentTypeWithHttpInfo(String incidentTypeId)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getIncidentType";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'incidentTypeId' is set
    if (incidentTypeId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'incidentTypeId' when calling getIncidentType");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/config/types/{incident_type_id}"
            .replaceAll(
                "\\{" + "incident_type_id" + "\\}",
                apiClient.escapeString(incidentTypeId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.getIncidentType",
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
        new GenericType<IncidentTypeResponse>() {});
  }

  /**
   * Get incident type details.
   *
   * <p>See {@link #getIncidentTypeWithHttpInfo}.
   *
   * @param incidentTypeId The UUID of the incident type. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentTypeResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentTypeResponse>> getIncidentTypeWithHttpInfoAsync(
      String incidentTypeId) {
    // Check if unstable operation is enabled
    String operationId = "getIncidentType";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentTypeResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'incidentTypeId' is set
    if (incidentTypeId == null) {
      CompletableFuture<ApiResponse<IncidentTypeResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'incidentTypeId' when calling getIncidentType"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/config/types/{incident_type_id}"
            .replaceAll(
                "\\{" + "incident_type_id" + "\\}",
                apiClient.escapeString(incidentTypeId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.getIncidentType",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentTypeResponse>> result = new CompletableFuture<>();
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
        new GenericType<IncidentTypeResponse>() {});
  }

  /** Manage optional parameters to getIncidentUserDefinedField. */
  public static class GetIncidentUserDefinedFieldOptionalParameters {
    private String include;

    /**
     * Set include.
     *
     * @param include Comma-separated list of related resources to include. Supported values are
     *     "last_modified_by_user", "created_by_user", and "incident_type". (optional)
     * @return GetIncidentUserDefinedFieldOptionalParameters
     */
    public GetIncidentUserDefinedFieldOptionalParameters include(String include) {
      this.include = include;
      return this;
    }
  }

  /**
   * Get an incident user-defined field.
   *
   * <p>See {@link #getIncidentUserDefinedFieldWithHttpInfo}.
   *
   * @param fieldId The ID of the incident user-defined field. (required)
   * @return IncidentUserDefinedFieldResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentUserDefinedFieldResponse getIncidentUserDefinedField(String fieldId)
      throws ApiException {
    return getIncidentUserDefinedFieldWithHttpInfo(
            fieldId, new GetIncidentUserDefinedFieldOptionalParameters())
        .getData();
  }

  /**
   * Get an incident user-defined field.
   *
   * <p>See {@link #getIncidentUserDefinedFieldWithHttpInfoAsync}.
   *
   * @param fieldId The ID of the incident user-defined field. (required)
   * @return CompletableFuture&lt;IncidentUserDefinedFieldResponse&gt;
   */
  public CompletableFuture<IncidentUserDefinedFieldResponse> getIncidentUserDefinedFieldAsync(
      String fieldId) {
    return getIncidentUserDefinedFieldWithHttpInfoAsync(
            fieldId, new GetIncidentUserDefinedFieldOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get an incident user-defined field.
   *
   * <p>See {@link #getIncidentUserDefinedFieldWithHttpInfo}.
   *
   * @param fieldId The ID of the incident user-defined field. (required)
   * @param parameters Optional parameters for the request.
   * @return IncidentUserDefinedFieldResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentUserDefinedFieldResponse getIncidentUserDefinedField(
      String fieldId, GetIncidentUserDefinedFieldOptionalParameters parameters)
      throws ApiException {
    return getIncidentUserDefinedFieldWithHttpInfo(fieldId, parameters).getData();
  }

  /**
   * Get an incident user-defined field.
   *
   * <p>See {@link #getIncidentUserDefinedFieldWithHttpInfoAsync}.
   *
   * @param fieldId The ID of the incident user-defined field. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;IncidentUserDefinedFieldResponse&gt;
   */
  public CompletableFuture<IncidentUserDefinedFieldResponse> getIncidentUserDefinedFieldAsync(
      String fieldId, GetIncidentUserDefinedFieldOptionalParameters parameters) {
    return getIncidentUserDefinedFieldWithHttpInfoAsync(fieldId, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get details of an incident user-defined field.
   *
   * @param fieldId The ID of the incident user-defined field. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;IncidentUserDefinedFieldResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<IncidentUserDefinedFieldResponse> getIncidentUserDefinedFieldWithHttpInfo(
      String fieldId, GetIncidentUserDefinedFieldOptionalParameters parameters)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getIncidentUserDefinedField";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'fieldId' is set
    if (fieldId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'fieldId' when calling getIncidentUserDefinedField");
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/config/user-defined-fields/{field_id}"
            .replaceAll("\\{" + "field_id" + "\\}", apiClient.escapeString(fieldId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.getIncidentUserDefinedField",
            localVarPath,
            localVarQueryParams,
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
        new GenericType<IncidentUserDefinedFieldResponse>() {});
  }

  /**
   * Get an incident user-defined field.
   *
   * <p>See {@link #getIncidentUserDefinedFieldWithHttpInfo}.
   *
   * @param fieldId The ID of the incident user-defined field. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentUserDefinedFieldResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentUserDefinedFieldResponse>>
      getIncidentUserDefinedFieldWithHttpInfoAsync(
          String fieldId, GetIncidentUserDefinedFieldOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "getIncidentUserDefinedField";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentUserDefinedFieldResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'fieldId' is set
    if (fieldId == null) {
      CompletableFuture<ApiResponse<IncidentUserDefinedFieldResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'fieldId' when calling getIncidentUserDefinedField"));
      return result;
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/config/user-defined-fields/{field_id}"
            .replaceAll("\\{" + "field_id" + "\\}", apiClient.escapeString(fieldId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.getIncidentUserDefinedField",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentUserDefinedFieldResponse>> result =
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
        new GenericType<IncidentUserDefinedFieldResponse>() {});
  }

  /** Manage optional parameters to getIncidentUserDefinedRole. */
  public static class GetIncidentUserDefinedRoleOptionalParameters {
    private String include;

    /**
     * Set include.
     *
     * @param include Comma-separated list of related resources to include in the response.
     *     (optional)
     * @return GetIncidentUserDefinedRoleOptionalParameters
     */
    public GetIncidentUserDefinedRoleOptionalParameters include(String include) {
      this.include = include;
      return this;
    }
  }

  /**
   * Get an incident user-defined role.
   *
   * <p>See {@link #getIncidentUserDefinedRoleWithHttpInfo}.
   *
   * @param roleId The UUID of the incident user-defined role. (required)
   * @return IncidentUserDefinedRoleResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentUserDefinedRoleResponse getIncidentUserDefinedRole(UUID roleId)
      throws ApiException {
    return getIncidentUserDefinedRoleWithHttpInfo(
            roleId, new GetIncidentUserDefinedRoleOptionalParameters())
        .getData();
  }

  /**
   * Get an incident user-defined role.
   *
   * <p>See {@link #getIncidentUserDefinedRoleWithHttpInfoAsync}.
   *
   * @param roleId The UUID of the incident user-defined role. (required)
   * @return CompletableFuture&lt;IncidentUserDefinedRoleResponse&gt;
   */
  public CompletableFuture<IncidentUserDefinedRoleResponse> getIncidentUserDefinedRoleAsync(
      UUID roleId) {
    return getIncidentUserDefinedRoleWithHttpInfoAsync(
            roleId, new GetIncidentUserDefinedRoleOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get an incident user-defined role.
   *
   * <p>See {@link #getIncidentUserDefinedRoleWithHttpInfo}.
   *
   * @param roleId The UUID of the incident user-defined role. (required)
   * @param parameters Optional parameters for the request.
   * @return IncidentUserDefinedRoleResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentUserDefinedRoleResponse getIncidentUserDefinedRole(
      UUID roleId, GetIncidentUserDefinedRoleOptionalParameters parameters) throws ApiException {
    return getIncidentUserDefinedRoleWithHttpInfo(roleId, parameters).getData();
  }

  /**
   * Get an incident user-defined role.
   *
   * <p>See {@link #getIncidentUserDefinedRoleWithHttpInfoAsync}.
   *
   * @param roleId The UUID of the incident user-defined role. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;IncidentUserDefinedRoleResponse&gt;
   */
  public CompletableFuture<IncidentUserDefinedRoleResponse> getIncidentUserDefinedRoleAsync(
      UUID roleId, GetIncidentUserDefinedRoleOptionalParameters parameters) {
    return getIncidentUserDefinedRoleWithHttpInfoAsync(roleId, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Retrieve a single user-defined role for incidents.
   *
   * @param roleId The UUID of the incident user-defined role. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;IncidentUserDefinedRoleResponse&gt;
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
  public ApiResponse<IncidentUserDefinedRoleResponse> getIncidentUserDefinedRoleWithHttpInfo(
      UUID roleId, GetIncidentUserDefinedRoleOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getIncidentUserDefinedRole";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'roleId' is set
    if (roleId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'roleId' when calling getIncidentUserDefinedRole");
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/config/user-defined-roles/{role_id}"
            .replaceAll("\\{" + "role_id" + "\\}", apiClient.escapeString(roleId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.getIncidentUserDefinedRole",
            localVarPath,
            localVarQueryParams,
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
        new GenericType<IncidentUserDefinedRoleResponse>() {});
  }

  /**
   * Get an incident user-defined role.
   *
   * <p>See {@link #getIncidentUserDefinedRoleWithHttpInfo}.
   *
   * @param roleId The UUID of the incident user-defined role. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentUserDefinedRoleResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentUserDefinedRoleResponse>>
      getIncidentUserDefinedRoleWithHttpInfoAsync(
          UUID roleId, GetIncidentUserDefinedRoleOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "getIncidentUserDefinedRole";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentUserDefinedRoleResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'roleId' is set
    if (roleId == null) {
      CompletableFuture<ApiResponse<IncidentUserDefinedRoleResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'roleId' when calling getIncidentUserDefinedRole"));
      return result;
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/config/user-defined-roles/{role_id}"
            .replaceAll("\\{" + "role_id" + "\\}", apiClient.escapeString(roleId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.getIncidentUserDefinedRole",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentUserDefinedRoleResponse>> result =
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
        new GenericType<IncidentUserDefinedRoleResponse>() {});
  }

  /** Manage optional parameters to getOrgSettingsByIncidentType. */
  public static class GetOrgSettingsByIncidentTypeOptionalParameters {
    private String include;

    /**
     * Set include.
     *
     * @param include Comma-separated list of related resources to include in the response.
     *     (optional)
     * @return GetOrgSettingsByIncidentTypeOptionalParameters
     */
    public GetOrgSettingsByIncidentTypeOptionalParameters include(String include) {
      this.include = include;
      return this;
    }
  }

  /**
   * Get org settings by incident type.
   *
   * <p>See {@link #getOrgSettingsByIncidentTypeWithHttpInfo}.
   *
   * @param incidentTypeId The UUID of the incident type. (required)
   * @return IncidentOrgSettingsResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentOrgSettingsResponse getOrgSettingsByIncidentType(UUID incidentTypeId)
      throws ApiException {
    return getOrgSettingsByIncidentTypeWithHttpInfo(
            incidentTypeId, new GetOrgSettingsByIncidentTypeOptionalParameters())
        .getData();
  }

  /**
   * Get org settings by incident type.
   *
   * <p>See {@link #getOrgSettingsByIncidentTypeWithHttpInfoAsync}.
   *
   * @param incidentTypeId The UUID of the incident type. (required)
   * @return CompletableFuture&lt;IncidentOrgSettingsResponse&gt;
   */
  public CompletableFuture<IncidentOrgSettingsResponse> getOrgSettingsByIncidentTypeAsync(
      UUID incidentTypeId) {
    return getOrgSettingsByIncidentTypeWithHttpInfoAsync(
            incidentTypeId, new GetOrgSettingsByIncidentTypeOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get org settings by incident type.
   *
   * <p>See {@link #getOrgSettingsByIncidentTypeWithHttpInfo}.
   *
   * @param incidentTypeId The UUID of the incident type. (required)
   * @param parameters Optional parameters for the request.
   * @return IncidentOrgSettingsResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentOrgSettingsResponse getOrgSettingsByIncidentType(
      UUID incidentTypeId, GetOrgSettingsByIncidentTypeOptionalParameters parameters)
      throws ApiException {
    return getOrgSettingsByIncidentTypeWithHttpInfo(incidentTypeId, parameters).getData();
  }

  /**
   * Get org settings by incident type.
   *
   * <p>See {@link #getOrgSettingsByIncidentTypeWithHttpInfoAsync}.
   *
   * @param incidentTypeId The UUID of the incident type. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;IncidentOrgSettingsResponse&gt;
   */
  public CompletableFuture<IncidentOrgSettingsResponse> getOrgSettingsByIncidentTypeAsync(
      UUID incidentTypeId, GetOrgSettingsByIncidentTypeOptionalParameters parameters) {
    return getOrgSettingsByIncidentTypeWithHttpInfoAsync(incidentTypeId, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the org settings for a specific incident type.
   *
   * @param incidentTypeId The UUID of the incident type. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;IncidentOrgSettingsResponse&gt;
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
  public ApiResponse<IncidentOrgSettingsResponse> getOrgSettingsByIncidentTypeWithHttpInfo(
      UUID incidentTypeId, GetOrgSettingsByIncidentTypeOptionalParameters parameters)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getOrgSettingsByIncidentType";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'incidentTypeId' is set
    if (incidentTypeId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'incidentTypeId' when calling"
              + " getOrgSettingsByIncidentType");
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/config/types/{incident_type_id}/org-settings"
            .replaceAll(
                "\\{" + "incident_type_id" + "\\}",
                apiClient.escapeString(incidentTypeId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.getOrgSettingsByIncidentType",
            localVarPath,
            localVarQueryParams,
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
        new GenericType<IncidentOrgSettingsResponse>() {});
  }

  /**
   * Get org settings by incident type.
   *
   * <p>See {@link #getOrgSettingsByIncidentTypeWithHttpInfo}.
   *
   * @param incidentTypeId The UUID of the incident type. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentOrgSettingsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentOrgSettingsResponse>>
      getOrgSettingsByIncidentTypeWithHttpInfoAsync(
          UUID incidentTypeId, GetOrgSettingsByIncidentTypeOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "getOrgSettingsByIncidentType";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentOrgSettingsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'incidentTypeId' is set
    if (incidentTypeId == null) {
      CompletableFuture<ApiResponse<IncidentOrgSettingsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'incidentTypeId' when calling"
                  + " getOrgSettingsByIncidentType"));
      return result;
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/config/types/{incident_type_id}/org-settings"
            .replaceAll(
                "\\{" + "incident_type_id" + "\\}",
                apiClient.escapeString(incidentTypeId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.getOrgSettingsByIncidentType",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentOrgSettingsResponse>> result =
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
        new GenericType<IncidentOrgSettingsResponse>() {});
  }

  /** Manage optional parameters to importIncident. */
  public static class ImportIncidentOptionalParameters {
    private List<IncidentImportRelatedObject> include;

    /**
     * Set include.
     *
     * @param include Specifies which related object types to include in the response when importing
     *     an incident. (optional)
     * @return ImportIncidentOptionalParameters
     */
    public ImportIncidentOptionalParameters include(List<IncidentImportRelatedObject> include) {
      this.include = include;
      return this;
    }
  }

  /**
   * Import an incident.
   *
   * <p>See {@link #importIncidentWithHttpInfo}.
   *
   * @param body Incident import payload. (required)
   * @return IncidentImportResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentImportResponse importIncident(IncidentImportRequest body) throws ApiException {
    return importIncidentWithHttpInfo(body, new ImportIncidentOptionalParameters()).getData();
  }

  /**
   * Import an incident.
   *
   * <p>See {@link #importIncidentWithHttpInfoAsync}.
   *
   * @param body Incident import payload. (required)
   * @return CompletableFuture&lt;IncidentImportResponse&gt;
   */
  public CompletableFuture<IncidentImportResponse> importIncidentAsync(IncidentImportRequest body) {
    return importIncidentWithHttpInfoAsync(body, new ImportIncidentOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Import an incident.
   *
   * <p>See {@link #importIncidentWithHttpInfo}.
   *
   * @param body Incident import payload. (required)
   * @param parameters Optional parameters for the request.
   * @return IncidentImportResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentImportResponse importIncident(
      IncidentImportRequest body, ImportIncidentOptionalParameters parameters) throws ApiException {
    return importIncidentWithHttpInfo(body, parameters).getData();
  }

  /**
   * Import an incident.
   *
   * <p>See {@link #importIncidentWithHttpInfoAsync}.
   *
   * @param body Incident import payload. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;IncidentImportResponse&gt;
   */
  public CompletableFuture<IncidentImportResponse> importIncidentAsync(
      IncidentImportRequest body, ImportIncidentOptionalParameters parameters) {
    return importIncidentWithHttpInfoAsync(body, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Import an incident from an external system. This endpoint allows you to create incidents with
   * historical data such as custom timestamps for detection, declaration, and resolution. Imported
   * incidents do not execute integrations or notification rules.
   *
   * @param body Incident import payload. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;IncidentImportResponse&gt;
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
  public ApiResponse<IncidentImportResponse> importIncidentWithHttpInfo(
      IncidentImportRequest body, ImportIncidentOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "importIncident";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling importIncident");
    }
    List<IncidentImportRelatedObject> include = parameters.include;
    // create path and map variables
    String localVarPath = "/api/v2/incidents/import";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.importIncident",
            localVarPath,
            localVarQueryParams,
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
        new GenericType<IncidentImportResponse>() {});
  }

  /**
   * Import an incident.
   *
   * <p>See {@link #importIncidentWithHttpInfo}.
   *
   * @param body Incident import payload. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentImportResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentImportResponse>> importIncidentWithHttpInfoAsync(
      IncidentImportRequest body, ImportIncidentOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "importIncident";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentImportResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<IncidentImportResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling importIncident"));
      return result;
    }
    List<IncidentImportRelatedObject> include = parameters.include;
    // create path and map variables
    String localVarPath = "/api/v2/incidents/import";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.importIncident",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentImportResponse>> result = new CompletableFuture<>();
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
        new GenericType<IncidentImportResponse>() {});
  }

  /**
   * Link a page to an incident.
   *
   * <p>See {@link #linkPageToIncidentWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param body On-call page link payload. (required)
   * @return IncidentIntegrationMetadataResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentIntegrationMetadataResponse linkPageToIncident(
      String incidentId, IncidentOnCallPageLinkRequest body) throws ApiException {
    return linkPageToIncidentWithHttpInfo(incidentId, body).getData();
  }

  /**
   * Link a page to an incident.
   *
   * <p>See {@link #linkPageToIncidentWithHttpInfoAsync}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param body On-call page link payload. (required)
   * @return CompletableFuture&lt;IncidentIntegrationMetadataResponse&gt;
   */
  public CompletableFuture<IncidentIntegrationMetadataResponse> linkPageToIncidentAsync(
      String incidentId, IncidentOnCallPageLinkRequest body) {
    return linkPageToIncidentWithHttpInfoAsync(incidentId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Link an existing on-call page to an incident.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param body On-call page link payload. (required)
   * @return ApiResponse&lt;IncidentIntegrationMetadataResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict - page already linked to incident </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<IncidentIntegrationMetadataResponse> linkPageToIncidentWithHttpInfo(
      String incidentId, IncidentOnCallPageLinkRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "linkPageToIncident";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'incidentId' when calling linkPageToIncident");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling linkPageToIncident");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/pages/link"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.linkPageToIncident",
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
        new GenericType<IncidentIntegrationMetadataResponse>() {});
  }

  /**
   * Link a page to an incident.
   *
   * <p>See {@link #linkPageToIncidentWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param body On-call page link payload. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentIntegrationMetadataResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentIntegrationMetadataResponse>>
      linkPageToIncidentWithHttpInfoAsync(String incidentId, IncidentOnCallPageLinkRequest body) {
    // Check if unstable operation is enabled
    String operationId = "linkPageToIncident";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentIntegrationMetadataResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      CompletableFuture<ApiResponse<IncidentIntegrationMetadataResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'incidentId' when calling linkPageToIncident"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<IncidentIntegrationMetadataResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling linkPageToIncident"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/pages/link"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.linkPageToIncident",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentIntegrationMetadataResponse>> result =
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
        new GenericType<IncidentIntegrationMetadataResponse>() {});
  }

  /** Manage optional parameters to listGlobalIncidentHandles. */
  public static class ListGlobalIncidentHandlesOptionalParameters {
    private String include;

    /**
     * Set include.
     *
     * @param include Comma-separated list of related resources to include in the response
     *     (optional)
     * @return ListGlobalIncidentHandlesOptionalParameters
     */
    public ListGlobalIncidentHandlesOptionalParameters include(String include) {
      this.include = include;
      return this;
    }
  }

  /**
   * List global incident handles.
   *
   * <p>See {@link #listGlobalIncidentHandlesWithHttpInfo}.
   *
   * @return IncidentHandlesResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentHandlesResponse listGlobalIncidentHandles() throws ApiException {
    return listGlobalIncidentHandlesWithHttpInfo(new ListGlobalIncidentHandlesOptionalParameters())
        .getData();
  }

  /**
   * List global incident handles.
   *
   * <p>See {@link #listGlobalIncidentHandlesWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;IncidentHandlesResponse&gt;
   */
  public CompletableFuture<IncidentHandlesResponse> listGlobalIncidentHandlesAsync() {
    return listGlobalIncidentHandlesWithHttpInfoAsync(
            new ListGlobalIncidentHandlesOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List global incident handles.
   *
   * <p>See {@link #listGlobalIncidentHandlesWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return IncidentHandlesResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentHandlesResponse listGlobalIncidentHandles(
      ListGlobalIncidentHandlesOptionalParameters parameters) throws ApiException {
    return listGlobalIncidentHandlesWithHttpInfo(parameters).getData();
  }

  /**
   * List global incident handles.
   *
   * <p>See {@link #listGlobalIncidentHandlesWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;IncidentHandlesResponse&gt;
   */
  public CompletableFuture<IncidentHandlesResponse> listGlobalIncidentHandlesAsync(
      ListGlobalIncidentHandlesOptionalParameters parameters) {
    return listGlobalIncidentHandlesWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Retrieve a list of global incident handles.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;IncidentHandlesResponse&gt;
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
  public ApiResponse<IncidentHandlesResponse> listGlobalIncidentHandlesWithHttpInfo(
      ListGlobalIncidentHandlesOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listGlobalIncidentHandles";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    String include = parameters.include;
    // create path and map variables
    String localVarPath = "/api/v2/incidents/config/global/incident-handles";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.listGlobalIncidentHandles",
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
        new GenericType<IncidentHandlesResponse>() {});
  }

  /**
   * List global incident handles.
   *
   * <p>See {@link #listGlobalIncidentHandlesWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentHandlesResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentHandlesResponse>>
      listGlobalIncidentHandlesWithHttpInfoAsync(
          ListGlobalIncidentHandlesOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listGlobalIncidentHandles";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentHandlesResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    String include = parameters.include;
    // create path and map variables
    String localVarPath = "/api/v2/incidents/config/global/incident-handles";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.listGlobalIncidentHandles",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentHandlesResponse>> result = new CompletableFuture<>();
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
        new GenericType<IncidentHandlesResponse>() {});
  }

  /** Manage optional parameters to listIncidentAttachments. */
  public static class ListIncidentAttachmentsOptionalParameters {
    private String filterAttachmentType;
    private String include;

    /**
     * Set filterAttachmentType.
     *
     * @param filterAttachmentType Filter attachments by type. Supported values are <code>1</code> (
     *     <code>postmortem</code>) and <code>2</code> (<code>link</code>). (optional)
     * @return ListIncidentAttachmentsOptionalParameters
     */
    public ListIncidentAttachmentsOptionalParameters filterAttachmentType(
        String filterAttachmentType) {
      this.filterAttachmentType = filterAttachmentType;
      return this;
    }

    /**
     * Set include.
     *
     * @param include Resource to include in the response. Supported value: <code>
     *     last_modified_by_user</code>. (optional)
     * @return ListIncidentAttachmentsOptionalParameters
     */
    public ListIncidentAttachmentsOptionalParameters include(String include) {
      this.include = include;
      return this;
    }
  }

  /**
   * List incident attachments.
   *
   * <p>See {@link #listIncidentAttachmentsWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @return AttachmentArray
   * @throws ApiException if fails to make API call
   */
  public AttachmentArray listIncidentAttachments(String incidentId) throws ApiException {
    return listIncidentAttachmentsWithHttpInfo(
            incidentId, new ListIncidentAttachmentsOptionalParameters())
        .getData();
  }

  /**
   * List incident attachments.
   *
   * <p>See {@link #listIncidentAttachmentsWithHttpInfoAsync}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @return CompletableFuture&lt;AttachmentArray&gt;
   */
  public CompletableFuture<AttachmentArray> listIncidentAttachmentsAsync(String incidentId) {
    return listIncidentAttachmentsWithHttpInfoAsync(
            incidentId, new ListIncidentAttachmentsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List incident attachments.
   *
   * <p>See {@link #listIncidentAttachmentsWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param parameters Optional parameters for the request.
   * @return AttachmentArray
   * @throws ApiException if fails to make API call
   */
  public AttachmentArray listIncidentAttachments(
      String incidentId, ListIncidentAttachmentsOptionalParameters parameters) throws ApiException {
    return listIncidentAttachmentsWithHttpInfo(incidentId, parameters).getData();
  }

  /**
   * List incident attachments.
   *
   * <p>See {@link #listIncidentAttachmentsWithHttpInfoAsync}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;AttachmentArray&gt;
   */
  public CompletableFuture<AttachmentArray> listIncidentAttachmentsAsync(
      String incidentId, ListIncidentAttachmentsOptionalParameters parameters) {
    return listIncidentAttachmentsWithHttpInfoAsync(incidentId, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List incident attachments.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;AttachmentArray&gt;
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
  public ApiResponse<AttachmentArray> listIncidentAttachmentsWithHttpInfo(
      String incidentId, ListIncidentAttachmentsOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listIncidentAttachments";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'incidentId' when calling listIncidentAttachments");
    }
    String filterAttachmentType = parameters.filterAttachmentType;
    String include = parameters.include;
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/attachments"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[attachment_type]", filterAttachmentType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.listIncidentAttachments",
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
        new GenericType<AttachmentArray>() {});
  }

  /**
   * List incident attachments.
   *
   * <p>See {@link #listIncidentAttachmentsWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;AttachmentArray&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AttachmentArray>> listIncidentAttachmentsWithHttpInfoAsync(
      String incidentId, ListIncidentAttachmentsOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listIncidentAttachments";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<AttachmentArray>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      CompletableFuture<ApiResponse<AttachmentArray>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'incidentId' when calling listIncidentAttachments"));
      return result;
    }
    String filterAttachmentType = parameters.filterAttachmentType;
    String include = parameters.include;
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/attachments"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[attachment_type]", filterAttachmentType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.listIncidentAttachments",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AttachmentArray>> result = new CompletableFuture<>();
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
        new GenericType<AttachmentArray>() {});
  }

  /**
   * List incident impact fields.
   *
   * <p>See {@link #listIncidentImpactFieldsWithHttpInfo}.
   *
   * @return IncidentImpactFieldsResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentImpactFieldsResponse listIncidentImpactFields() throws ApiException {
    return listIncidentImpactFieldsWithHttpInfo().getData();
  }

  /**
   * List incident impact fields.
   *
   * <p>See {@link #listIncidentImpactFieldsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;IncidentImpactFieldsResponse&gt;
   */
  public CompletableFuture<IncidentImpactFieldsResponse> listIncidentImpactFieldsAsync() {
    return listIncidentImpactFieldsWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List all impact fields for incidents.
   *
   * @return ApiResponse&lt;IncidentImpactFieldsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<IncidentImpactFieldsResponse> listIncidentImpactFieldsWithHttpInfo()
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listIncidentImpactFields";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/incidents/config/impact-fields";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.listIncidentImpactFields",
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
        new GenericType<IncidentImpactFieldsResponse>() {});
  }

  /**
   * List incident impact fields.
   *
   * <p>See {@link #listIncidentImpactFieldsWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentImpactFieldsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentImpactFieldsResponse>>
      listIncidentImpactFieldsWithHttpInfoAsync() {
    // Check if unstable operation is enabled
    String operationId = "listIncidentImpactFields";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentImpactFieldsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/incidents/config/impact-fields";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.listIncidentImpactFields",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentImpactFieldsResponse>> result =
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
        new GenericType<IncidentImpactFieldsResponse>() {});
  }

  /** Manage optional parameters to listIncidentImpacts. */
  public static class ListIncidentImpactsOptionalParameters {
    private List<IncidentImpactRelatedObject> include;

    /**
     * Set include.
     *
     * @param include Specifies which related resources should be included in the response.
     *     (optional)
     * @return ListIncidentImpactsOptionalParameters
     */
    public ListIncidentImpactsOptionalParameters include(
        List<IncidentImpactRelatedObject> include) {
      this.include = include;
      return this;
    }
  }

  /**
   * List an incident&#39;s impacts.
   *
   * <p>See {@link #listIncidentImpactsWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @return IncidentImpactsResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentImpactsResponse listIncidentImpacts(String incidentId) throws ApiException {
    return listIncidentImpactsWithHttpInfo(incidentId, new ListIncidentImpactsOptionalParameters())
        .getData();
  }

  /**
   * List an incident&#39;s impacts.
   *
   * <p>See {@link #listIncidentImpactsWithHttpInfoAsync}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @return CompletableFuture&lt;IncidentImpactsResponse&gt;
   */
  public CompletableFuture<IncidentImpactsResponse> listIncidentImpactsAsync(String incidentId) {
    return listIncidentImpactsWithHttpInfoAsync(
            incidentId, new ListIncidentImpactsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List an incident&#39;s impacts.
   *
   * <p>See {@link #listIncidentImpactsWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param parameters Optional parameters for the request.
   * @return IncidentImpactsResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentImpactsResponse listIncidentImpacts(
      String incidentId, ListIncidentImpactsOptionalParameters parameters) throws ApiException {
    return listIncidentImpactsWithHttpInfo(incidentId, parameters).getData();
  }

  /**
   * List an incident&#39;s impacts.
   *
   * <p>See {@link #listIncidentImpactsWithHttpInfoAsync}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;IncidentImpactsResponse&gt;
   */
  public CompletableFuture<IncidentImpactsResponse> listIncidentImpactsAsync(
      String incidentId, ListIncidentImpactsOptionalParameters parameters) {
    return listIncidentImpactsWithHttpInfoAsync(incidentId, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get all impacts for an incident.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;IncidentImpactsResponse&gt;
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
  public ApiResponse<IncidentImpactsResponse> listIncidentImpactsWithHttpInfo(
      String incidentId, ListIncidentImpactsOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'incidentId' when calling listIncidentImpacts");
    }
    List<IncidentImpactRelatedObject> include = parameters.include;
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/impacts"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.listIncidentImpacts",
            localVarPath,
            localVarQueryParams,
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
        new GenericType<IncidentImpactsResponse>() {});
  }

  /**
   * List an incident&#39;s impacts.
   *
   * <p>See {@link #listIncidentImpactsWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentImpactsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentImpactsResponse>>
      listIncidentImpactsWithHttpInfoAsync(
          String incidentId, ListIncidentImpactsOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      CompletableFuture<ApiResponse<IncidentImpactsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'incidentId' when calling listIncidentImpacts"));
      return result;
    }
    List<IncidentImpactRelatedObject> include = parameters.include;
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/impacts"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.listIncidentImpacts",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentImpactsResponse>> result = new CompletableFuture<>();
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
        new GenericType<IncidentImpactsResponse>() {});
  }

  /**
   * Get a list of an incident&#39;s integration metadata.
   *
   * <p>See {@link #listIncidentIntegrationsWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @return IncidentIntegrationMetadataListResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentIntegrationMetadataListResponse listIncidentIntegrations(String incidentId)
      throws ApiException {
    return listIncidentIntegrationsWithHttpInfo(incidentId).getData();
  }

  /**
   * Get a list of an incident&#39;s integration metadata.
   *
   * <p>See {@link #listIncidentIntegrationsWithHttpInfoAsync}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @return CompletableFuture&lt;IncidentIntegrationMetadataListResponse&gt;
   */
  public CompletableFuture<IncidentIntegrationMetadataListResponse> listIncidentIntegrationsAsync(
      String incidentId) {
    return listIncidentIntegrationsWithHttpInfoAsync(incidentId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get all integration metadata for an incident.
   *
   * @param incidentId The UUID of the incident. (required)
   * @return ApiResponse&lt;IncidentIntegrationMetadataListResponse&gt;
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
  public ApiResponse<IncidentIntegrationMetadataListResponse> listIncidentIntegrationsWithHttpInfo(
      String incidentId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listIncidentIntegrations";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'incidentId' when calling listIncidentIntegrations");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/relationships/integrations"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.listIncidentIntegrations",
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
        new GenericType<IncidentIntegrationMetadataListResponse>() {});
  }

  /**
   * Get a list of an incident&#39;s integration metadata.
   *
   * <p>See {@link #listIncidentIntegrationsWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentIntegrationMetadataListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentIntegrationMetadataListResponse>>
      listIncidentIntegrationsWithHttpInfoAsync(String incidentId) {
    // Check if unstable operation is enabled
    String operationId = "listIncidentIntegrations";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentIntegrationMetadataListResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      CompletableFuture<ApiResponse<IncidentIntegrationMetadataListResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'incidentId' when calling listIncidentIntegrations"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/relationships/integrations"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.listIncidentIntegrations",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentIntegrationMetadataListResponse>> result =
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
        new GenericType<IncidentIntegrationMetadataListResponse>() {});
  }

  /** Manage optional parameters to listIncidentNotificationRules. */
  public static class ListIncidentNotificationRulesOptionalParameters {
    private String include;

    /**
     * Set include.
     *
     * @param include Comma-separated list of resources to include. Supported values: <code>
     *     created_by_user</code>, <code>last_modified_by_user</code>, <code>incident_type</code>,
     *     <code>notification_template</code> (optional)
     * @return ListIncidentNotificationRulesOptionalParameters
     */
    public ListIncidentNotificationRulesOptionalParameters include(String include) {
      this.include = include;
      return this;
    }
  }

  /**
   * List incident notification rules.
   *
   * <p>See {@link #listIncidentNotificationRulesWithHttpInfo}.
   *
   * @return IncidentNotificationRuleArray
   * @throws ApiException if fails to make API call
   */
  public IncidentNotificationRuleArray listIncidentNotificationRules() throws ApiException {
    return listIncidentNotificationRulesWithHttpInfo(
            new ListIncidentNotificationRulesOptionalParameters())
        .getData();
  }

  /**
   * List incident notification rules.
   *
   * <p>See {@link #listIncidentNotificationRulesWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;IncidentNotificationRuleArray&gt;
   */
  public CompletableFuture<IncidentNotificationRuleArray> listIncidentNotificationRulesAsync() {
    return listIncidentNotificationRulesWithHttpInfoAsync(
            new ListIncidentNotificationRulesOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List incident notification rules.
   *
   * <p>See {@link #listIncidentNotificationRulesWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return IncidentNotificationRuleArray
   * @throws ApiException if fails to make API call
   */
  public IncidentNotificationRuleArray listIncidentNotificationRules(
      ListIncidentNotificationRulesOptionalParameters parameters) throws ApiException {
    return listIncidentNotificationRulesWithHttpInfo(parameters).getData();
  }

  /**
   * List incident notification rules.
   *
   * <p>See {@link #listIncidentNotificationRulesWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;IncidentNotificationRuleArray&gt;
   */
  public CompletableFuture<IncidentNotificationRuleArray> listIncidentNotificationRulesAsync(
      ListIncidentNotificationRulesOptionalParameters parameters) {
    return listIncidentNotificationRulesWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Lists all notification rules for the organization. Optionally filter by incident type.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;IncidentNotificationRuleArray&gt;
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
  public ApiResponse<IncidentNotificationRuleArray> listIncidentNotificationRulesWithHttpInfo(
      ListIncidentNotificationRulesOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listIncidentNotificationRules";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    String include = parameters.include;
    // create path and map variables
    String localVarPath = "/api/v2/incidents/config/notification-rules";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.listIncidentNotificationRules",
            localVarPath,
            localVarQueryParams,
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
        new GenericType<IncidentNotificationRuleArray>() {});
  }

  /**
   * List incident notification rules.
   *
   * <p>See {@link #listIncidentNotificationRulesWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentNotificationRuleArray&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentNotificationRuleArray>>
      listIncidentNotificationRulesWithHttpInfoAsync(
          ListIncidentNotificationRulesOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listIncidentNotificationRules";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentNotificationRuleArray>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    String include = parameters.include;
    // create path and map variables
    String localVarPath = "/api/v2/incidents/config/notification-rules";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.listIncidentNotificationRules",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentNotificationRuleArray>> result =
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
        new GenericType<IncidentNotificationRuleArray>() {});
  }

  /** Manage optional parameters to listIncidentNotificationTemplates. */
  public static class ListIncidentNotificationTemplatesOptionalParameters {
    private UUID filterIncidentType;
    private String include;

    /**
     * Set filterIncidentType.
     *
     * @param filterIncidentType Optional incident type ID filter. (optional)
     * @return ListIncidentNotificationTemplatesOptionalParameters
     */
    public ListIncidentNotificationTemplatesOptionalParameters filterIncidentType(
        UUID filterIncidentType) {
      this.filterIncidentType = filterIncidentType;
      return this;
    }

    /**
     * Set include.
     *
     * @param include Comma-separated list of relationships to include. Supported values: <code>
     *     created_by_user</code>, <code>last_modified_by_user</code>, <code>incident_type</code>
     *     (optional)
     * @return ListIncidentNotificationTemplatesOptionalParameters
     */
    public ListIncidentNotificationTemplatesOptionalParameters include(String include) {
      this.include = include;
      return this;
    }
  }

  /**
   * List incident notification templates.
   *
   * <p>See {@link #listIncidentNotificationTemplatesWithHttpInfo}.
   *
   * @return IncidentNotificationTemplateArray
   * @throws ApiException if fails to make API call
   */
  public IncidentNotificationTemplateArray listIncidentNotificationTemplates() throws ApiException {
    return listIncidentNotificationTemplatesWithHttpInfo(
            new ListIncidentNotificationTemplatesOptionalParameters())
        .getData();
  }

  /**
   * List incident notification templates.
   *
   * <p>See {@link #listIncidentNotificationTemplatesWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;IncidentNotificationTemplateArray&gt;
   */
  public CompletableFuture<IncidentNotificationTemplateArray>
      listIncidentNotificationTemplatesAsync() {
    return listIncidentNotificationTemplatesWithHttpInfoAsync(
            new ListIncidentNotificationTemplatesOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List incident notification templates.
   *
   * <p>See {@link #listIncidentNotificationTemplatesWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return IncidentNotificationTemplateArray
   * @throws ApiException if fails to make API call
   */
  public IncidentNotificationTemplateArray listIncidentNotificationTemplates(
      ListIncidentNotificationTemplatesOptionalParameters parameters) throws ApiException {
    return listIncidentNotificationTemplatesWithHttpInfo(parameters).getData();
  }

  /**
   * List incident notification templates.
   *
   * <p>See {@link #listIncidentNotificationTemplatesWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;IncidentNotificationTemplateArray&gt;
   */
  public CompletableFuture<IncidentNotificationTemplateArray>
      listIncidentNotificationTemplatesAsync(
          ListIncidentNotificationTemplatesOptionalParameters parameters) {
    return listIncidentNotificationTemplatesWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Lists all notification templates. Optionally filter by incident type.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;IncidentNotificationTemplateArray&gt;
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
  public ApiResponse<IncidentNotificationTemplateArray>
      listIncidentNotificationTemplatesWithHttpInfo(
          ListIncidentNotificationTemplatesOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listIncidentNotificationTemplates";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    UUID filterIncidentType = parameters.filterIncidentType;
    String include = parameters.include;
    // create path and map variables
    String localVarPath = "/api/v2/incidents/config/notification-templates";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[incident-type]", filterIncidentType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.listIncidentNotificationTemplates",
            localVarPath,
            localVarQueryParams,
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
        new GenericType<IncidentNotificationTemplateArray>() {});
  }

  /**
   * List incident notification templates.
   *
   * <p>See {@link #listIncidentNotificationTemplatesWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentNotificationTemplateArray&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentNotificationTemplateArray>>
      listIncidentNotificationTemplatesWithHttpInfoAsync(
          ListIncidentNotificationTemplatesOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listIncidentNotificationTemplates";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentNotificationTemplateArray>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    UUID filterIncidentType = parameters.filterIncidentType;
    String include = parameters.include;
    // create path and map variables
    String localVarPath = "/api/v2/incidents/config/notification-templates";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[incident-type]", filterIncidentType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.listIncidentNotificationTemplates",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentNotificationTemplateArray>> result =
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
        new GenericType<IncidentNotificationTemplateArray>() {});
  }

  /**
   * List postmortem templates.
   *
   * <p>See {@link #listIncidentPostmortemTemplatesWithHttpInfo}.
   *
   * @return PostmortemTemplatesResponse
   * @throws ApiException if fails to make API call
   */
  public PostmortemTemplatesResponse listIncidentPostmortemTemplates() throws ApiException {
    return listIncidentPostmortemTemplatesWithHttpInfo().getData();
  }

  /**
   * List postmortem templates.
   *
   * <p>See {@link #listIncidentPostmortemTemplatesWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;PostmortemTemplatesResponse&gt;
   */
  public CompletableFuture<PostmortemTemplatesResponse> listIncidentPostmortemTemplatesAsync() {
    return listIncidentPostmortemTemplatesWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Retrieve a list of all postmortem templates for incidents.
   *
   * @return ApiResponse&lt;PostmortemTemplatesResponse&gt;
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
  public ApiResponse<PostmortemTemplatesResponse> listIncidentPostmortemTemplatesWithHttpInfo()
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listIncidentPostmortemTemplates";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/incidents/config/postmortem-templates";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.listIncidentPostmortemTemplates",
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
        new GenericType<PostmortemTemplatesResponse>() {});
  }

  /**
   * List postmortem templates.
   *
   * <p>See {@link #listIncidentPostmortemTemplatesWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;PostmortemTemplatesResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<PostmortemTemplatesResponse>>
      listIncidentPostmortemTemplatesWithHttpInfoAsync() {
    // Check if unstable operation is enabled
    String operationId = "listIncidentPostmortemTemplates";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<PostmortemTemplatesResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/incidents/config/postmortem-templates";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.listIncidentPostmortemTemplates",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<PostmortemTemplatesResponse>> result =
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
        new GenericType<PostmortemTemplatesResponse>() {});
  }

  /**
   * List incident responders.
   *
   * <p>See {@link #listIncidentRespondersWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @return IncidentRespondersResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentRespondersResponse listIncidentResponders(String incidentId) throws ApiException {
    return listIncidentRespondersWithHttpInfo(incidentId).getData();
  }

  /**
   * List incident responders.
   *
   * <p>See {@link #listIncidentRespondersWithHttpInfoAsync}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @return CompletableFuture&lt;IncidentRespondersResponse&gt;
   */
  public CompletableFuture<IncidentRespondersResponse> listIncidentRespondersAsync(
      String incidentId) {
    return listIncidentRespondersWithHttpInfoAsync(incidentId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List all responders for an incident.
   *
   * @param incidentId The UUID of the incident. (required)
   * @return ApiResponse&lt;IncidentRespondersResponse&gt;
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
  public ApiResponse<IncidentRespondersResponse> listIncidentRespondersWithHttpInfo(
      String incidentId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listIncidentResponders";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'incidentId' when calling listIncidentResponders");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/responders"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.listIncidentResponders",
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
        new GenericType<IncidentRespondersResponse>() {});
  }

  /**
   * List incident responders.
   *
   * <p>See {@link #listIncidentRespondersWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentRespondersResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentRespondersResponse>>
      listIncidentRespondersWithHttpInfoAsync(String incidentId) {
    // Check if unstable operation is enabled
    String operationId = "listIncidentResponders";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentRespondersResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      CompletableFuture<ApiResponse<IncidentRespondersResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'incidentId' when calling listIncidentResponders"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/responders"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.listIncidentResponders",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentRespondersResponse>> result = new CompletableFuture<>();
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
        new GenericType<IncidentRespondersResponse>() {});
  }

  /** Manage optional parameters to listIncidentRules. */
  public static class ListIncidentRulesOptionalParameters {
    private String filterTaskId;
    private String filterTrigger;
    private UUID incidentTypeUuid;

    /**
     * Set filterTaskId.
     *
     * @param filterTaskId Filter rules by task ID. (optional)
     * @return ListIncidentRulesOptionalParameters
     */
    public ListIncidentRulesOptionalParameters filterTaskId(String filterTaskId) {
      this.filterTaskId = filterTaskId;
      return this;
    }

    /**
     * Set filterTrigger.
     *
     * @param filterTrigger Filter rules by trigger. (optional)
     * @return ListIncidentRulesOptionalParameters
     */
    public ListIncidentRulesOptionalParameters filterTrigger(String filterTrigger) {
      this.filterTrigger = filterTrigger;
      return this;
    }

    /**
     * Set incidentTypeUuid.
     *
     * @param incidentTypeUuid Filter rules by incident type UUID. (optional)
     * @return ListIncidentRulesOptionalParameters
     */
    public ListIncidentRulesOptionalParameters incidentTypeUuid(UUID incidentTypeUuid) {
      this.incidentTypeUuid = incidentTypeUuid;
      return this;
    }
  }

  /**
   * List incident rules.
   *
   * <p>See {@link #listIncidentRulesWithHttpInfo}.
   *
   * @return IncidentRulesResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentRulesResponse listIncidentRules() throws ApiException {
    return listIncidentRulesWithHttpInfo(new ListIncidentRulesOptionalParameters()).getData();
  }

  /**
   * List incident rules.
   *
   * <p>See {@link #listIncidentRulesWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;IncidentRulesResponse&gt;
   */
  public CompletableFuture<IncidentRulesResponse> listIncidentRulesAsync() {
    return listIncidentRulesWithHttpInfoAsync(new ListIncidentRulesOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List incident rules.
   *
   * <p>See {@link #listIncidentRulesWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return IncidentRulesResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentRulesResponse listIncidentRules(ListIncidentRulesOptionalParameters parameters)
      throws ApiException {
    return listIncidentRulesWithHttpInfo(parameters).getData();
  }

  /**
   * List incident rules.
   *
   * <p>See {@link #listIncidentRulesWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;IncidentRulesResponse&gt;
   */
  public CompletableFuture<IncidentRulesResponse> listIncidentRulesAsync(
      ListIncidentRulesOptionalParameters parameters) {
    return listIncidentRulesWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List all incident rules.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;IncidentRulesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<IncidentRulesResponse> listIncidentRulesWithHttpInfo(
      ListIncidentRulesOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listIncidentRules";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    String filterTaskId = parameters.filterTaskId;
    String filterTrigger = parameters.filterTrigger;
    UUID incidentTypeUuid = parameters.incidentTypeUuid;
    // create path and map variables
    String localVarPath = "/api/v2/incidents/config/rules";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[task_id]", filterTaskId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[trigger]", filterTrigger));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "incidentTypeUUID", incidentTypeUuid));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.listIncidentRules",
            localVarPath,
            localVarQueryParams,
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
        new GenericType<IncidentRulesResponse>() {});
  }

  /**
   * List incident rules.
   *
   * <p>See {@link #listIncidentRulesWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentRulesResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentRulesResponse>> listIncidentRulesWithHttpInfoAsync(
      ListIncidentRulesOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listIncidentRules";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentRulesResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    String filterTaskId = parameters.filterTaskId;
    String filterTrigger = parameters.filterTrigger;
    UUID incidentTypeUuid = parameters.incidentTypeUuid;
    // create path and map variables
    String localVarPath = "/api/v2/incidents/config/rules";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[task_id]", filterTaskId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[trigger]", filterTrigger));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "incidentTypeUUID", incidentTypeUuid));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.listIncidentRules",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentRulesResponse>> result = new CompletableFuture<>();
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
        new GenericType<IncidentRulesResponse>() {});
  }

  /** Manage optional parameters to listIncidents. */
  public static class ListIncidentsOptionalParameters {
    private List<IncidentRelatedObject> include;
    private Long pageSize;
    private Long pageOffset;

    /**
     * Set include.
     *
     * @param include Specifies which types of related objects should be included in the response.
     *     (optional)
     * @return ListIncidentsOptionalParameters
     */
    public ListIncidentsOptionalParameters include(List<IncidentRelatedObject> include) {
      this.include = include;
      return this;
    }

    /**
     * Set pageSize.
     *
     * @param pageSize Size for a given page. The maximum allowed value is 100. (optional, default
     *     to 10)
     * @return ListIncidentsOptionalParameters
     */
    public ListIncidentsOptionalParameters pageSize(Long pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set pageOffset.
     *
     * @param pageOffset Specific offset to use as the beginning of the returned page. (optional,
     *     default to 0)
     * @return ListIncidentsOptionalParameters
     */
    public ListIncidentsOptionalParameters pageOffset(Long pageOffset) {
      this.pageOffset = pageOffset;
      return this;
    }
  }

  /**
   * Get a list of incidents.
   *
   * <p>See {@link #listIncidentsWithHttpInfo}.
   *
   * @return IncidentsResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentsResponse listIncidents() throws ApiException {
    return listIncidentsWithHttpInfo(new ListIncidentsOptionalParameters()).getData();
  }

  /**
   * Get a list of incidents.
   *
   * <p>See {@link #listIncidentsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;IncidentsResponse&gt;
   */
  public CompletableFuture<IncidentsResponse> listIncidentsAsync() {
    return listIncidentsWithHttpInfoAsync(new ListIncidentsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a list of incidents.
   *
   * <p>See {@link #listIncidentsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return IncidentsResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentsResponse listIncidents(ListIncidentsOptionalParameters parameters)
      throws ApiException {
    return listIncidentsWithHttpInfo(parameters).getData();
  }

  /**
   * Get a list of incidents.
   *
   * <p>See {@link #listIncidentsWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;IncidentsResponse&gt;
   */
  public CompletableFuture<IncidentsResponse> listIncidentsAsync(
      ListIncidentsOptionalParameters parameters) {
    return listIncidentsWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a list of incidents.
   *
   * <p>See {@link #listIncidentsWithHttpInfo}.
   *
   * @return PaginationIterable&lt;IncidentResponseData&gt;
   */
  public PaginationIterable<IncidentResponseData> listIncidentsWithPagination() {
    ListIncidentsOptionalParameters parameters = new ListIncidentsOptionalParameters();
    return listIncidentsWithPagination(parameters);
  }

  /**
   * Get a list of incidents.
   *
   * <p>See {@link #listIncidentsWithHttpInfo}.
   *
   * @return IncidentsResponse
   */
  public PaginationIterable<IncidentResponseData> listIncidentsWithPagination(
      ListIncidentsOptionalParameters parameters) {
    String resultsPath = "getData";
    String valueGetterPath = "";
    String valueSetterPath = "pageOffset";
    Boolean valueSetterParamOptional = true;
    Long limit;

    if (parameters.pageSize == null) {
      limit = 10l;
      parameters.pageSize(limit);
    } else {
      limit = parameters.pageSize;
    }

    LinkedHashMap<String, Object> args = new LinkedHashMap<String, Object>();
    args.put("optionalParams", parameters);

    PaginationIterable iterator =
        new PaginationIterable(
            this,
            "listIncidents",
            resultsPath,
            valueGetterPath,
            valueSetterPath,
            valueSetterParamOptional,
            true,
            false,
            limit,
            args,
            0);

    return iterator;
  }

  /**
   * Get all incidents for the user's organization.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;IncidentsResponse&gt;
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
  public ApiResponse<IncidentsResponse> listIncidentsWithHttpInfo(
      ListIncidentsOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listIncidents";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    List<IncidentRelatedObject> include = parameters.include;
    Long pageSize = parameters.pageSize;
    Long pageOffset = parameters.pageOffset;
    // create path and map variables
    String localVarPath = "/api/v2/incidents";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[offset]", pageOffset));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.listIncidents",
            localVarPath,
            localVarQueryParams,
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
        new GenericType<IncidentsResponse>() {});
  }

  /**
   * Get a list of incidents.
   *
   * <p>See {@link #listIncidentsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentsResponse>> listIncidentsWithHttpInfoAsync(
      ListIncidentsOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listIncidents";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    List<IncidentRelatedObject> include = parameters.include;
    Long pageSize = parameters.pageSize;
    Long pageOffset = parameters.pageOffset;
    // create path and map variables
    String localVarPath = "/api/v2/incidents";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[offset]", pageOffset));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.listIncidents",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentsResponse>> result = new CompletableFuture<>();
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
        new GenericType<IncidentsResponse>() {});
  }

  /**
   * Get a list of an incident&#39;s todos.
   *
   * <p>See {@link #listIncidentTodosWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @return IncidentTodoListResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentTodoListResponse listIncidentTodos(String incidentId) throws ApiException {
    return listIncidentTodosWithHttpInfo(incidentId).getData();
  }

  /**
   * Get a list of an incident&#39;s todos.
   *
   * <p>See {@link #listIncidentTodosWithHttpInfoAsync}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @return CompletableFuture&lt;IncidentTodoListResponse&gt;
   */
  public CompletableFuture<IncidentTodoListResponse> listIncidentTodosAsync(String incidentId) {
    return listIncidentTodosWithHttpInfoAsync(incidentId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get all todos for an incident.
   *
   * @param incidentId The UUID of the incident. (required)
   * @return ApiResponse&lt;IncidentTodoListResponse&gt;
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
  public ApiResponse<IncidentTodoListResponse> listIncidentTodosWithHttpInfo(String incidentId)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listIncidentTodos";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'incidentId' when calling listIncidentTodos");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/relationships/todos"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.listIncidentTodos",
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
        new GenericType<IncidentTodoListResponse>() {});
  }

  /**
   * Get a list of an incident&#39;s todos.
   *
   * <p>See {@link #listIncidentTodosWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentTodoListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentTodoListResponse>>
      listIncidentTodosWithHttpInfoAsync(String incidentId) {
    // Check if unstable operation is enabled
    String operationId = "listIncidentTodos";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentTodoListResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      CompletableFuture<ApiResponse<IncidentTodoListResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'incidentId' when calling listIncidentTodos"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/relationships/todos"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.listIncidentTodos",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentTodoListResponse>> result = new CompletableFuture<>();
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
        new GenericType<IncidentTodoListResponse>() {});
  }

  /** Manage optional parameters to listIncidentTypes. */
  public static class ListIncidentTypesOptionalParameters {
    private Boolean includeDeleted;

    /**
     * Set includeDeleted.
     *
     * @param includeDeleted Include deleted incident types in the response. (optional, default to
     *     false)
     * @return ListIncidentTypesOptionalParameters
     */
    public ListIncidentTypesOptionalParameters includeDeleted(Boolean includeDeleted) {
      this.includeDeleted = includeDeleted;
      return this;
    }
  }

  /**
   * Get a list of incident types.
   *
   * <p>See {@link #listIncidentTypesWithHttpInfo}.
   *
   * @return IncidentTypeListResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentTypeListResponse listIncidentTypes() throws ApiException {
    return listIncidentTypesWithHttpInfo(new ListIncidentTypesOptionalParameters()).getData();
  }

  /**
   * Get a list of incident types.
   *
   * <p>See {@link #listIncidentTypesWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;IncidentTypeListResponse&gt;
   */
  public CompletableFuture<IncidentTypeListResponse> listIncidentTypesAsync() {
    return listIncidentTypesWithHttpInfoAsync(new ListIncidentTypesOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a list of incident types.
   *
   * <p>See {@link #listIncidentTypesWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return IncidentTypeListResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentTypeListResponse listIncidentTypes(ListIncidentTypesOptionalParameters parameters)
      throws ApiException {
    return listIncidentTypesWithHttpInfo(parameters).getData();
  }

  /**
   * Get a list of incident types.
   *
   * <p>See {@link #listIncidentTypesWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;IncidentTypeListResponse&gt;
   */
  public CompletableFuture<IncidentTypeListResponse> listIncidentTypesAsync(
      ListIncidentTypesOptionalParameters parameters) {
    return listIncidentTypesWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get all incident types.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;IncidentTypeListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<IncidentTypeListResponse> listIncidentTypesWithHttpInfo(
      ListIncidentTypesOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listIncidentTypes";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    Boolean includeDeleted = parameters.includeDeleted;
    // create path and map variables
    String localVarPath = "/api/v2/incidents/config/types";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include_deleted", includeDeleted));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.listIncidentTypes",
            localVarPath,
            localVarQueryParams,
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
        new GenericType<IncidentTypeListResponse>() {});
  }

  /**
   * Get a list of incident types.
   *
   * <p>See {@link #listIncidentTypesWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentTypeListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentTypeListResponse>>
      listIncidentTypesWithHttpInfoAsync(ListIncidentTypesOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listIncidentTypes";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentTypeListResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    Boolean includeDeleted = parameters.includeDeleted;
    // create path and map variables
    String localVarPath = "/api/v2/incidents/config/types";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include_deleted", includeDeleted));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.listIncidentTypes",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentTypeListResponse>> result = new CompletableFuture<>();
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
        new GenericType<IncidentTypeListResponse>() {});
  }

  /** Manage optional parameters to listIncidentUserDefinedFields. */
  public static class ListIncidentUserDefinedFieldsOptionalParameters {
    private Long pageSize;
    private Long pageNumber;
    private Boolean includeDeleted;
    private String filterIncidentType;
    private String include;

    /**
     * Set pageSize.
     *
     * @param pageSize The number of results to return per page. Must be between 0 and 1000.
     *     (optional, default to 1000)
     * @return ListIncidentUserDefinedFieldsOptionalParameters
     */
    public ListIncidentUserDefinedFieldsOptionalParameters pageSize(Long pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set pageNumber.
     *
     * @param pageNumber The page number to retrieve, starting at 0. (optional, default to 0)
     * @return ListIncidentUserDefinedFieldsOptionalParameters
     */
    public ListIncidentUserDefinedFieldsOptionalParameters pageNumber(Long pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set includeDeleted.
     *
     * @param includeDeleted When true, include soft-deleted fields in the response. (optional,
     *     default to false)
     * @return ListIncidentUserDefinedFieldsOptionalParameters
     */
    public ListIncidentUserDefinedFieldsOptionalParameters includeDeleted(Boolean includeDeleted) {
      this.includeDeleted = includeDeleted;
      return this;
    }

    /**
     * Set filterIncidentType.
     *
     * @param filterIncidentType Filter results to fields associated with the given incident type
     *     UUID. (optional)
     * @return ListIncidentUserDefinedFieldsOptionalParameters
     */
    public ListIncidentUserDefinedFieldsOptionalParameters filterIncidentType(
        String filterIncidentType) {
      this.filterIncidentType = filterIncidentType;
      return this;
    }

    /**
     * Set include.
     *
     * @param include Comma-separated list of related resources to include. Supported values are
     *     "last_modified_by_user", "created_by_user", and "incident_type". (optional)
     * @return ListIncidentUserDefinedFieldsOptionalParameters
     */
    public ListIncidentUserDefinedFieldsOptionalParameters include(String include) {
      this.include = include;
      return this;
    }
  }

  /**
   * Get a list of incident user-defined fields.
   *
   * <p>See {@link #listIncidentUserDefinedFieldsWithHttpInfo}.
   *
   * @return IncidentUserDefinedFieldListResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentUserDefinedFieldListResponse listIncidentUserDefinedFields() throws ApiException {
    return listIncidentUserDefinedFieldsWithHttpInfo(
            new ListIncidentUserDefinedFieldsOptionalParameters())
        .getData();
  }

  /**
   * Get a list of incident user-defined fields.
   *
   * <p>See {@link #listIncidentUserDefinedFieldsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;IncidentUserDefinedFieldListResponse&gt;
   */
  public CompletableFuture<IncidentUserDefinedFieldListResponse>
      listIncidentUserDefinedFieldsAsync() {
    return listIncidentUserDefinedFieldsWithHttpInfoAsync(
            new ListIncidentUserDefinedFieldsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a list of incident user-defined fields.
   *
   * <p>See {@link #listIncidentUserDefinedFieldsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return IncidentUserDefinedFieldListResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentUserDefinedFieldListResponse listIncidentUserDefinedFields(
      ListIncidentUserDefinedFieldsOptionalParameters parameters) throws ApiException {
    return listIncidentUserDefinedFieldsWithHttpInfo(parameters).getData();
  }

  /**
   * Get a list of incident user-defined fields.
   *
   * <p>See {@link #listIncidentUserDefinedFieldsWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;IncidentUserDefinedFieldListResponse&gt;
   */
  public CompletableFuture<IncidentUserDefinedFieldListResponse> listIncidentUserDefinedFieldsAsync(
      ListIncidentUserDefinedFieldsOptionalParameters parameters) {
    return listIncidentUserDefinedFieldsWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a list of all incident user-defined fields.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;IncidentUserDefinedFieldListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<IncidentUserDefinedFieldListResponse>
      listIncidentUserDefinedFieldsWithHttpInfo(
          ListIncidentUserDefinedFieldsOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listIncidentUserDefinedFields";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    Long pageSize = parameters.pageSize;
    Long pageNumber = parameters.pageNumber;
    Boolean includeDeleted = parameters.includeDeleted;
    String filterIncidentType = parameters.filterIncidentType;
    String include = parameters.include;
    // create path and map variables
    String localVarPath = "/api/v2/incidents/config/user-defined-fields";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include-deleted", includeDeleted));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[incident-type]", filterIncidentType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.listIncidentUserDefinedFields",
            localVarPath,
            localVarQueryParams,
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
        new GenericType<IncidentUserDefinedFieldListResponse>() {});
  }

  /**
   * Get a list of incident user-defined fields.
   *
   * <p>See {@link #listIncidentUserDefinedFieldsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentUserDefinedFieldListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentUserDefinedFieldListResponse>>
      listIncidentUserDefinedFieldsWithHttpInfoAsync(
          ListIncidentUserDefinedFieldsOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listIncidentUserDefinedFields";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentUserDefinedFieldListResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    Long pageSize = parameters.pageSize;
    Long pageNumber = parameters.pageNumber;
    Boolean includeDeleted = parameters.includeDeleted;
    String filterIncidentType = parameters.filterIncidentType;
    String include = parameters.include;
    // create path and map variables
    String localVarPath = "/api/v2/incidents/config/user-defined-fields";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include-deleted", includeDeleted));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[incident-type]", filterIncidentType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.listIncidentUserDefinedFields",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentUserDefinedFieldListResponse>> result =
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
        new GenericType<IncidentUserDefinedFieldListResponse>() {});
  }

  /** Manage optional parameters to listIncidentUserDefinedRoles. */
  public static class ListIncidentUserDefinedRolesOptionalParameters {
    private UUID filterIncidentType;
    private String include;

    /**
     * Set filterIncidentType.
     *
     * @param filterIncidentType Filter roles by incident type UUID. (optional)
     * @return ListIncidentUserDefinedRolesOptionalParameters
     */
    public ListIncidentUserDefinedRolesOptionalParameters filterIncidentType(
        UUID filterIncidentType) {
      this.filterIncidentType = filterIncidentType;
      return this;
    }

    /**
     * Set include.
     *
     * @param include Comma-separated list of related resources to include in the response.
     *     (optional)
     * @return ListIncidentUserDefinedRolesOptionalParameters
     */
    public ListIncidentUserDefinedRolesOptionalParameters include(String include) {
      this.include = include;
      return this;
    }
  }

  /**
   * List incident user-defined roles.
   *
   * <p>See {@link #listIncidentUserDefinedRolesWithHttpInfo}.
   *
   * @return IncidentUserDefinedRolesResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentUserDefinedRolesResponse listIncidentUserDefinedRoles() throws ApiException {
    return listIncidentUserDefinedRolesWithHttpInfo(
            new ListIncidentUserDefinedRolesOptionalParameters())
        .getData();
  }

  /**
   * List incident user-defined roles.
   *
   * <p>See {@link #listIncidentUserDefinedRolesWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;IncidentUserDefinedRolesResponse&gt;
   */
  public CompletableFuture<IncidentUserDefinedRolesResponse> listIncidentUserDefinedRolesAsync() {
    return listIncidentUserDefinedRolesWithHttpInfoAsync(
            new ListIncidentUserDefinedRolesOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List incident user-defined roles.
   *
   * <p>See {@link #listIncidentUserDefinedRolesWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return IncidentUserDefinedRolesResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentUserDefinedRolesResponse listIncidentUserDefinedRoles(
      ListIncidentUserDefinedRolesOptionalParameters parameters) throws ApiException {
    return listIncidentUserDefinedRolesWithHttpInfo(parameters).getData();
  }

  /**
   * List incident user-defined roles.
   *
   * <p>See {@link #listIncidentUserDefinedRolesWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;IncidentUserDefinedRolesResponse&gt;
   */
  public CompletableFuture<IncidentUserDefinedRolesResponse> listIncidentUserDefinedRolesAsync(
      ListIncidentUserDefinedRolesOptionalParameters parameters) {
    return listIncidentUserDefinedRolesWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List all user-defined roles for incidents.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;IncidentUserDefinedRolesResponse&gt;
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
  public ApiResponse<IncidentUserDefinedRolesResponse> listIncidentUserDefinedRolesWithHttpInfo(
      ListIncidentUserDefinedRolesOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listIncidentUserDefinedRoles";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    UUID filterIncidentType = parameters.filterIncidentType;
    String include = parameters.include;
    // create path and map variables
    String localVarPath = "/api/v2/incidents/config/user-defined-roles";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[incident-type]", filterIncidentType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.listIncidentUserDefinedRoles",
            localVarPath,
            localVarQueryParams,
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
        new GenericType<IncidentUserDefinedRolesResponse>() {});
  }

  /**
   * List incident user-defined roles.
   *
   * <p>See {@link #listIncidentUserDefinedRolesWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentUserDefinedRolesResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentUserDefinedRolesResponse>>
      listIncidentUserDefinedRolesWithHttpInfoAsync(
          ListIncidentUserDefinedRolesOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listIncidentUserDefinedRoles";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentUserDefinedRolesResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    UUID filterIncidentType = parameters.filterIncidentType;
    String include = parameters.include;
    // create path and map variables
    String localVarPath = "/api/v2/incidents/config/user-defined-roles";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[incident-type]", filterIncidentType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.listIncidentUserDefinedRoles",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentUserDefinedRolesResponse>> result =
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
        new GenericType<IncidentUserDefinedRolesResponse>() {});
  }

  /** Manage optional parameters to listOrgSettings. */
  public static class ListOrgSettingsOptionalParameters {
    private Integer pageSize;
    private Integer pageOffset;
    private Boolean includeDeleted;
    private String include;

    /**
     * Set pageSize.
     *
     * @param pageSize Maximum number of results to return. (optional)
     * @return ListOrgSettingsOptionalParameters
     */
    public ListOrgSettingsOptionalParameters pageSize(Integer pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set pageOffset.
     *
     * @param pageOffset The offset for pagination. (optional)
     * @return ListOrgSettingsOptionalParameters
     */
    public ListOrgSettingsOptionalParameters pageOffset(Integer pageOffset) {
      this.pageOffset = pageOffset;
      return this;
    }

    /**
     * Set includeDeleted.
     *
     * @param includeDeleted Whether to include deleted records. (optional)
     * @return ListOrgSettingsOptionalParameters
     */
    public ListOrgSettingsOptionalParameters includeDeleted(Boolean includeDeleted) {
      this.includeDeleted = includeDeleted;
      return this;
    }

    /**
     * Set include.
     *
     * @param include Comma-separated list of related resources to include in the response.
     *     (optional)
     * @return ListOrgSettingsOptionalParameters
     */
    public ListOrgSettingsOptionalParameters include(String include) {
      this.include = include;
      return this;
    }
  }

  /**
   * List incident type org settings.
   *
   * <p>See {@link #listOrgSettingsWithHttpInfo}.
   *
   * @return IncidentOrgSettingsListResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentOrgSettingsListResponse listOrgSettings() throws ApiException {
    return listOrgSettingsWithHttpInfo(new ListOrgSettingsOptionalParameters()).getData();
  }

  /**
   * List incident type org settings.
   *
   * <p>See {@link #listOrgSettingsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;IncidentOrgSettingsListResponse&gt;
   */
  public CompletableFuture<IncidentOrgSettingsListResponse> listOrgSettingsAsync() {
    return listOrgSettingsWithHttpInfoAsync(new ListOrgSettingsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List incident type org settings.
   *
   * <p>See {@link #listOrgSettingsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return IncidentOrgSettingsListResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentOrgSettingsListResponse listOrgSettings(
      ListOrgSettingsOptionalParameters parameters) throws ApiException {
    return listOrgSettingsWithHttpInfo(parameters).getData();
  }

  /**
   * List incident type org settings.
   *
   * <p>See {@link #listOrgSettingsWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;IncidentOrgSettingsListResponse&gt;
   */
  public CompletableFuture<IncidentOrgSettingsListResponse> listOrgSettingsAsync(
      ListOrgSettingsOptionalParameters parameters) {
    return listOrgSettingsWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List org settings for all incident types.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;IncidentOrgSettingsListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<IncidentOrgSettingsListResponse> listOrgSettingsWithHttpInfo(
      ListOrgSettingsOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listOrgSettings";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    Integer pageSize = parameters.pageSize;
    Integer pageOffset = parameters.pageOffset;
    Boolean includeDeleted = parameters.includeDeleted;
    String include = parameters.include;
    // create path and map variables
    String localVarPath = "/api/v2/incidents/config/types/org-settings";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[offset]", pageOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include-deleted", includeDeleted));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.listOrgSettings",
            localVarPath,
            localVarQueryParams,
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
        new GenericType<IncidentOrgSettingsListResponse>() {});
  }

  /**
   * List incident type org settings.
   *
   * <p>See {@link #listOrgSettingsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentOrgSettingsListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentOrgSettingsListResponse>>
      listOrgSettingsWithHttpInfoAsync(ListOrgSettingsOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listOrgSettings";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentOrgSettingsListResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    Integer pageSize = parameters.pageSize;
    Integer pageOffset = parameters.pageOffset;
    Boolean includeDeleted = parameters.includeDeleted;
    String include = parameters.include;
    // create path and map variables
    String localVarPath = "/api/v2/incidents/config/types/org-settings";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[offset]", pageOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include-deleted", includeDeleted));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.listOrgSettings",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentOrgSettingsListResponse>> result =
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
        new GenericType<IncidentOrgSettingsListResponse>() {});
  }

  /**
   * List incident timestamp overrides.
   *
   * <p>See {@link #listTimestampOverridesWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @return IncidentTimestampOverridesResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentTimestampOverridesResponse listTimestampOverrides(String incidentId)
      throws ApiException {
    return listTimestampOverridesWithHttpInfo(incidentId).getData();
  }

  /**
   * List incident timestamp overrides.
   *
   * <p>See {@link #listTimestampOverridesWithHttpInfoAsync}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @return CompletableFuture&lt;IncidentTimestampOverridesResponse&gt;
   */
  public CompletableFuture<IncidentTimestampOverridesResponse> listTimestampOverridesAsync(
      String incidentId) {
    return listTimestampOverridesWithHttpInfoAsync(incidentId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List all timestamp overrides for an incident.
   *
   * @param incidentId The UUID of the incident. (required)
   * @return ApiResponse&lt;IncidentTimestampOverridesResponse&gt;
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
  public ApiResponse<IncidentTimestampOverridesResponse> listTimestampOverridesWithHttpInfo(
      String incidentId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listTimestampOverrides";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'incidentId' when calling listTimestampOverrides");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/timestamp-overrides"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.listTimestampOverrides",
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
        new GenericType<IncidentTimestampOverridesResponse>() {});
  }

  /**
   * List incident timestamp overrides.
   *
   * <p>See {@link #listTimestampOverridesWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentTimestampOverridesResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentTimestampOverridesResponse>>
      listTimestampOverridesWithHttpInfoAsync(String incidentId) {
    // Check if unstable operation is enabled
    String operationId = "listTimestampOverrides";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentTimestampOverridesResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      CompletableFuture<ApiResponse<IncidentTimestampOverridesResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'incidentId' when calling listTimestampOverrides"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/timestamp-overrides"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.listTimestampOverrides",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentTimestampOverridesResponse>> result =
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
        new GenericType<IncidentTimestampOverridesResponse>() {});
  }

  /** Manage optional parameters to patchIncidentImpact. */
  public static class PatchIncidentImpactOptionalParameters {
    private List<IncidentImpactRelatedObject> include;

    /**
     * Set include.
     *
     * @param include Specifies which related resources should be included in the response.
     *     (optional)
     * @return PatchIncidentImpactOptionalParameters
     */
    public PatchIncidentImpactOptionalParameters include(
        List<IncidentImpactRelatedObject> include) {
      this.include = include;
      return this;
    }
  }

  /**
   * Patch an incident impact.
   *
   * <p>See {@link #patchIncidentImpactWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param impactId The UUID of the incident impact. (required)
   * @param body Incident impact patch payload. (required)
   * @return IncidentImpactResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentImpactResponse patchIncidentImpact(
      String incidentId, String impactId, IncidentImpactCreateRequest body) throws ApiException {
    return patchIncidentImpactWithHttpInfo(
            incidentId, impactId, body, new PatchIncidentImpactOptionalParameters())
        .getData();
  }

  /**
   * Patch an incident impact.
   *
   * <p>See {@link #patchIncidentImpactWithHttpInfoAsync}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param impactId The UUID of the incident impact. (required)
   * @param body Incident impact patch payload. (required)
   * @return CompletableFuture&lt;IncidentImpactResponse&gt;
   */
  public CompletableFuture<IncidentImpactResponse> patchIncidentImpactAsync(
      String incidentId, String impactId, IncidentImpactCreateRequest body) {
    return patchIncidentImpactWithHttpInfoAsync(
            incidentId, impactId, body, new PatchIncidentImpactOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Patch an incident impact.
   *
   * <p>See {@link #patchIncidentImpactWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param impactId The UUID of the incident impact. (required)
   * @param body Incident impact patch payload. (required)
   * @param parameters Optional parameters for the request.
   * @return IncidentImpactResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentImpactResponse patchIncidentImpact(
      String incidentId,
      String impactId,
      IncidentImpactCreateRequest body,
      PatchIncidentImpactOptionalParameters parameters)
      throws ApiException {
    return patchIncidentImpactWithHttpInfo(incidentId, impactId, body, parameters).getData();
  }

  /**
   * Patch an incident impact.
   *
   * <p>See {@link #patchIncidentImpactWithHttpInfoAsync}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param impactId The UUID of the incident impact. (required)
   * @param body Incident impact patch payload. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;IncidentImpactResponse&gt;
   */
  public CompletableFuture<IncidentImpactResponse> patchIncidentImpactAsync(
      String incidentId,
      String impactId,
      IncidentImpactCreateRequest body,
      PatchIncidentImpactOptionalParameters parameters) {
    return patchIncidentImpactWithHttpInfoAsync(incidentId, impactId, body, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Partially update an incident impact.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param impactId The UUID of the incident impact. (required)
   * @param body Incident impact patch payload. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;IncidentImpactResponse&gt;
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
  public ApiResponse<IncidentImpactResponse> patchIncidentImpactWithHttpInfo(
      String incidentId,
      String impactId,
      IncidentImpactCreateRequest body,
      PatchIncidentImpactOptionalParameters parameters)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "patchIncidentImpact";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'incidentId' when calling patchIncidentImpact");
    }

    // verify the required parameter 'impactId' is set
    if (impactId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'impactId' when calling patchIncidentImpact");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling patchIncidentImpact");
    }
    List<IncidentImpactRelatedObject> include = parameters.include;
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/impacts/{impact_id}"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()))
            .replaceAll("\\{" + "impact_id" + "\\}", apiClient.escapeString(impactId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.patchIncidentImpact",
            localVarPath,
            localVarQueryParams,
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<IncidentImpactResponse>() {});
  }

  /**
   * Patch an incident impact.
   *
   * <p>See {@link #patchIncidentImpactWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param impactId The UUID of the incident impact. (required)
   * @param body Incident impact patch payload. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentImpactResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentImpactResponse>>
      patchIncidentImpactWithHttpInfoAsync(
          String incidentId,
          String impactId,
          IncidentImpactCreateRequest body,
          PatchIncidentImpactOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "patchIncidentImpact";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentImpactResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      CompletableFuture<ApiResponse<IncidentImpactResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'incidentId' when calling patchIncidentImpact"));
      return result;
    }

    // verify the required parameter 'impactId' is set
    if (impactId == null) {
      CompletableFuture<ApiResponse<IncidentImpactResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'impactId' when calling patchIncidentImpact"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<IncidentImpactResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling patchIncidentImpact"));
      return result;
    }
    List<IncidentImpactRelatedObject> include = parameters.include;
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/impacts/{impact_id}"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()))
            .replaceAll("\\{" + "impact_id" + "\\}", apiClient.escapeString(impactId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.patchIncidentImpact",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentImpactResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<IncidentImpactResponse>() {});
  }

  /** Manage optional parameters to searchIncidents. */
  public static class SearchIncidentsOptionalParameters {
    private IncidentRelatedObject include;
    private IncidentSearchSortOrder sort;
    private Long pageSize;
    private Long pageOffset;

    /**
     * Set include.
     *
     * @param include Specifies which types of related objects should be included in the response.
     *     (optional)
     * @return SearchIncidentsOptionalParameters
     */
    public SearchIncidentsOptionalParameters include(IncidentRelatedObject include) {
      this.include = include;
      return this;
    }

    /**
     * Set sort.
     *
     * @param sort Specifies the order of returned incidents. (optional)
     * @return SearchIncidentsOptionalParameters
     */
    public SearchIncidentsOptionalParameters sort(IncidentSearchSortOrder sort) {
      this.sort = sort;
      return this;
    }

    /**
     * Set pageSize.
     *
     * @param pageSize Size for a given page. The maximum allowed value is 100. (optional, default
     *     to 10)
     * @return SearchIncidentsOptionalParameters
     */
    public SearchIncidentsOptionalParameters pageSize(Long pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set pageOffset.
     *
     * @param pageOffset Specific offset to use as the beginning of the returned page. (optional,
     *     default to 0)
     * @return SearchIncidentsOptionalParameters
     */
    public SearchIncidentsOptionalParameters pageOffset(Long pageOffset) {
      this.pageOffset = pageOffset;
      return this;
    }
  }

  /**
   * Search for incidents.
   *
   * <p>See {@link #searchIncidentsWithHttpInfo}.
   *
   * @param query Specifies which incidents should be returned. The query can contain any number of
   *     incident facets joined by <code>ANDs</code>, along with multiple values for each of those
   *     facets joined by <code>OR</code>s. For example: <code>
   *     state:active AND severity:(SEV-2 OR SEV-1)</code>. (required)
   * @return IncidentSearchResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentSearchResponse searchIncidents(String query) throws ApiException {
    return searchIncidentsWithHttpInfo(query, new SearchIncidentsOptionalParameters()).getData();
  }

  /**
   * Search for incidents.
   *
   * <p>See {@link #searchIncidentsWithHttpInfoAsync}.
   *
   * @param query Specifies which incidents should be returned. The query can contain any number of
   *     incident facets joined by <code>ANDs</code>, along with multiple values for each of those
   *     facets joined by <code>OR</code>s. For example: <code>
   *     state:active AND severity:(SEV-2 OR SEV-1)</code>. (required)
   * @return CompletableFuture&lt;IncidentSearchResponse&gt;
   */
  public CompletableFuture<IncidentSearchResponse> searchIncidentsAsync(String query) {
    return searchIncidentsWithHttpInfoAsync(query, new SearchIncidentsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Search for incidents.
   *
   * <p>See {@link #searchIncidentsWithHttpInfo}.
   *
   * @param query Specifies which incidents should be returned. The query can contain any number of
   *     incident facets joined by <code>ANDs</code>, along with multiple values for each of those
   *     facets joined by <code>OR</code>s. For example: <code>
   *     state:active AND severity:(SEV-2 OR SEV-1)</code>. (required)
   * @param parameters Optional parameters for the request.
   * @return IncidentSearchResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentSearchResponse searchIncidents(
      String query, SearchIncidentsOptionalParameters parameters) throws ApiException {
    return searchIncidentsWithHttpInfo(query, parameters).getData();
  }

  /**
   * Search for incidents.
   *
   * <p>See {@link #searchIncidentsWithHttpInfoAsync}.
   *
   * @param query Specifies which incidents should be returned. The query can contain any number of
   *     incident facets joined by <code>ANDs</code>, along with multiple values for each of those
   *     facets joined by <code>OR</code>s. For example: <code>
   *     state:active AND severity:(SEV-2 OR SEV-1)</code>. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;IncidentSearchResponse&gt;
   */
  public CompletableFuture<IncidentSearchResponse> searchIncidentsAsync(
      String query, SearchIncidentsOptionalParameters parameters) {
    return searchIncidentsWithHttpInfoAsync(query, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Search for incidents.
   *
   * <p>See {@link #searchIncidentsWithHttpInfo}.
   *
   * @param query Specifies which incidents should be returned. The query can contain any number of
   *     incident facets joined by <code>ANDs</code>, along with multiple values for each of those
   *     facets joined by <code>OR</code>s. For example: <code>
   *     state:active AND severity:(SEV-2 OR SEV-1)</code>. (required)
   * @return PaginationIterable&lt;IncidentSearchResponseIncidentsData&gt;
   */
  public PaginationIterable<IncidentSearchResponseIncidentsData> searchIncidentsWithPagination(
      String query) {
    SearchIncidentsOptionalParameters parameters = new SearchIncidentsOptionalParameters();
    return searchIncidentsWithPagination(query, parameters);
  }

  /**
   * Search for incidents.
   *
   * <p>See {@link #searchIncidentsWithHttpInfo}.
   *
   * @param query Specifies which incidents should be returned. The query can contain any number of
   *     incident facets joined by <code>ANDs</code>, along with multiple values for each of those
   *     facets joined by <code>OR</code>s. For example: <code>
   *     state:active AND severity:(SEV-2 OR SEV-1)</code>. (required)
   * @return IncidentSearchResponse
   */
  public PaginationIterable<IncidentSearchResponseIncidentsData> searchIncidentsWithPagination(
      String query, SearchIncidentsOptionalParameters parameters) {
    String resultsPath = "getData.getAttributes.getIncidents";
    String valueGetterPath = "";
    String valueSetterPath = "pageOffset";
    Boolean valueSetterParamOptional = true;
    Long limit;

    if (parameters.pageSize == null) {
      limit = 10l;
      parameters.pageSize(limit);
    } else {
      limit = parameters.pageSize;
    }

    LinkedHashMap<String, Object> args = new LinkedHashMap<String, Object>();
    args.put("query", query);
    args.put("optionalParams", parameters);

    PaginationIterable iterator =
        new PaginationIterable(
            this,
            "searchIncidents",
            resultsPath,
            valueGetterPath,
            valueSetterPath,
            valueSetterParamOptional,
            true,
            false,
            limit,
            args,
            0);

    return iterator;
  }

  /**
   * Search for incidents matching a certain query.
   *
   * @param query Specifies which incidents should be returned. The query can contain any number of
   *     incident facets joined by <code>ANDs</code>, along with multiple values for each of those
   *     facets joined by <code>OR</code>s. For example: <code>
   *     state:active AND severity:(SEV-2 OR SEV-1)</code>. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;IncidentSearchResponse&gt;
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
  public ApiResponse<IncidentSearchResponse> searchIncidentsWithHttpInfo(
      String query, SearchIncidentsOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "searchIncidents";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'query' is set
    if (query == null) {
      throw new ApiException(
          400, "Missing the required parameter 'query' when calling searchIncidents");
    }
    IncidentRelatedObject include = parameters.include;
    IncidentSearchSortOrder sort = parameters.sort;
    Long pageSize = parameters.pageSize;
    Long pageOffset = parameters.pageOffset;
    // create path and map variables
    String localVarPath = "/api/v2/incidents/search";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "query", query));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[offset]", pageOffset));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.searchIncidents",
            localVarPath,
            localVarQueryParams,
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
        new GenericType<IncidentSearchResponse>() {});
  }

  /**
   * Search for incidents.
   *
   * <p>See {@link #searchIncidentsWithHttpInfo}.
   *
   * @param query Specifies which incidents should be returned. The query can contain any number of
   *     incident facets joined by <code>ANDs</code>, along with multiple values for each of those
   *     facets joined by <code>OR</code>s. For example: <code>
   *     state:active AND severity:(SEV-2 OR SEV-1)</code>. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentSearchResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentSearchResponse>> searchIncidentsWithHttpInfoAsync(
      String query, SearchIncidentsOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "searchIncidents";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentSearchResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'query' is set
    if (query == null) {
      CompletableFuture<ApiResponse<IncidentSearchResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'query' when calling searchIncidents"));
      return result;
    }
    IncidentRelatedObject include = parameters.include;
    IncidentSearchSortOrder sort = parameters.sort;
    Long pageSize = parameters.pageSize;
    Long pageOffset = parameters.pageOffset;
    // create path and map variables
    String localVarPath = "/api/v2/incidents/search";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "query", query));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[offset]", pageOffset));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.searchIncidents",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentSearchResponse>> result = new CompletableFuture<>();
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
        new GenericType<IncidentSearchResponse>() {});
  }

  /** Manage optional parameters to updateGlobalIncidentHandle. */
  public static class UpdateGlobalIncidentHandleOptionalParameters {
    private String include;

    /**
     * Set include.
     *
     * @param include Comma-separated list of related resources to include in the response
     *     (optional)
     * @return UpdateGlobalIncidentHandleOptionalParameters
     */
    public UpdateGlobalIncidentHandleOptionalParameters include(String include) {
      this.include = include;
      return this;
    }
  }

  /**
   * Update global incident handle.
   *
   * <p>See {@link #updateGlobalIncidentHandleWithHttpInfo}.
   *
   * @param body (required)
   * @return IncidentHandleResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentHandleResponse updateGlobalIncidentHandle(IncidentHandleRequest body)
      throws ApiException {
    return updateGlobalIncidentHandleWithHttpInfo(
            body, new UpdateGlobalIncidentHandleOptionalParameters())
        .getData();
  }

  /**
   * Update global incident handle.
   *
   * <p>See {@link #updateGlobalIncidentHandleWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;IncidentHandleResponse&gt;
   */
  public CompletableFuture<IncidentHandleResponse> updateGlobalIncidentHandleAsync(
      IncidentHandleRequest body) {
    return updateGlobalIncidentHandleWithHttpInfoAsync(
            body, new UpdateGlobalIncidentHandleOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update global incident handle.
   *
   * <p>See {@link #updateGlobalIncidentHandleWithHttpInfo}.
   *
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return IncidentHandleResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentHandleResponse updateGlobalIncidentHandle(
      IncidentHandleRequest body, UpdateGlobalIncidentHandleOptionalParameters parameters)
      throws ApiException {
    return updateGlobalIncidentHandleWithHttpInfo(body, parameters).getData();
  }

  /**
   * Update global incident handle.
   *
   * <p>See {@link #updateGlobalIncidentHandleWithHttpInfoAsync}.
   *
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;IncidentHandleResponse&gt;
   */
  public CompletableFuture<IncidentHandleResponse> updateGlobalIncidentHandleAsync(
      IncidentHandleRequest body, UpdateGlobalIncidentHandleOptionalParameters parameters) {
    return updateGlobalIncidentHandleWithHttpInfoAsync(body, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update an existing global incident handle.
   *
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;IncidentHandleResponse&gt;
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
  public ApiResponse<IncidentHandleResponse> updateGlobalIncidentHandleWithHttpInfo(
      IncidentHandleRequest body, UpdateGlobalIncidentHandleOptionalParameters parameters)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateGlobalIncidentHandle";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateGlobalIncidentHandle");
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath = "/api/v2/incidents/config/global/incident-handles";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.updateGlobalIncidentHandle",
            localVarPath,
            localVarQueryParams,
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
        new GenericType<IncidentHandleResponse>() {});
  }

  /**
   * Update global incident handle.
   *
   * <p>See {@link #updateGlobalIncidentHandleWithHttpInfo}.
   *
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentHandleResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentHandleResponse>>
      updateGlobalIncidentHandleWithHttpInfoAsync(
          IncidentHandleRequest body, UpdateGlobalIncidentHandleOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "updateGlobalIncidentHandle";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentHandleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<IncidentHandleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling updateGlobalIncidentHandle"));
      return result;
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath = "/api/v2/incidents/config/global/incident-handles";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.updateGlobalIncidentHandle",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentHandleResponse>> result = new CompletableFuture<>();
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
        new GenericType<IncidentHandleResponse>() {});
  }

  /**
   * Update global incident settings.
   *
   * <p>See {@link #updateGlobalIncidentSettingsWithHttpInfo}.
   *
   * @param body (required)
   * @return GlobalIncidentSettingsResponse
   * @throws ApiException if fails to make API call
   */
  public GlobalIncidentSettingsResponse updateGlobalIncidentSettings(
      GlobalIncidentSettingsRequest body) throws ApiException {
    return updateGlobalIncidentSettingsWithHttpInfo(body).getData();
  }

  /**
   * Update global incident settings.
   *
   * <p>See {@link #updateGlobalIncidentSettingsWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;GlobalIncidentSettingsResponse&gt;
   */
  public CompletableFuture<GlobalIncidentSettingsResponse> updateGlobalIncidentSettingsAsync(
      GlobalIncidentSettingsRequest body) {
    return updateGlobalIncidentSettingsWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update global incident settings for the organization.
   *
   * @param body (required)
   * @return ApiResponse&lt;GlobalIncidentSettingsResponse&gt;
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
  public ApiResponse<GlobalIncidentSettingsResponse> updateGlobalIncidentSettingsWithHttpInfo(
      GlobalIncidentSettingsRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateGlobalIncidentSettings";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateGlobalIncidentSettings");
    }
    // create path and map variables
    String localVarPath = "/api/v2/incidents/config/global/settings";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.updateGlobalIncidentSettings",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<GlobalIncidentSettingsResponse>() {});
  }

  /**
   * Update global incident settings.
   *
   * <p>See {@link #updateGlobalIncidentSettingsWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;GlobalIncidentSettingsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<GlobalIncidentSettingsResponse>>
      updateGlobalIncidentSettingsWithHttpInfoAsync(GlobalIncidentSettingsRequest body) {
    // Check if unstable operation is enabled
    String operationId = "updateGlobalIncidentSettings";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<GlobalIncidentSettingsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<GlobalIncidentSettingsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling updateGlobalIncidentSettings"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/incidents/config/global/settings";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.updateGlobalIncidentSettings",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<GlobalIncidentSettingsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<GlobalIncidentSettingsResponse>() {});
  }

  /** Manage optional parameters to updateIncident. */
  public static class UpdateIncidentOptionalParameters {
    private List<IncidentRelatedObject> include;

    /**
     * Set include.
     *
     * @param include Specifies which types of related objects should be included in the response.
     *     (optional)
     * @return UpdateIncidentOptionalParameters
     */
    public UpdateIncidentOptionalParameters include(List<IncidentRelatedObject> include) {
      this.include = include;
      return this;
    }
  }

  /**
   * Update an existing incident.
   *
   * <p>See {@link #updateIncidentWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param body Incident Payload. (required)
   * @return IncidentResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentResponse updateIncident(String incidentId, IncidentUpdateRequest body)
      throws ApiException {
    return updateIncidentWithHttpInfo(incidentId, body, new UpdateIncidentOptionalParameters())
        .getData();
  }

  /**
   * Update an existing incident.
   *
   * <p>See {@link #updateIncidentWithHttpInfoAsync}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param body Incident Payload. (required)
   * @return CompletableFuture&lt;IncidentResponse&gt;
   */
  public CompletableFuture<IncidentResponse> updateIncidentAsync(
      String incidentId, IncidentUpdateRequest body) {
    return updateIncidentWithHttpInfoAsync(incidentId, body, new UpdateIncidentOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update an existing incident.
   *
   * <p>See {@link #updateIncidentWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param body Incident Payload. (required)
   * @param parameters Optional parameters for the request.
   * @return IncidentResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentResponse updateIncident(
      String incidentId, IncidentUpdateRequest body, UpdateIncidentOptionalParameters parameters)
      throws ApiException {
    return updateIncidentWithHttpInfo(incidentId, body, parameters).getData();
  }

  /**
   * Update an existing incident.
   *
   * <p>See {@link #updateIncidentWithHttpInfoAsync}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param body Incident Payload. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;IncidentResponse&gt;
   */
  public CompletableFuture<IncidentResponse> updateIncidentAsync(
      String incidentId, IncidentUpdateRequest body, UpdateIncidentOptionalParameters parameters) {
    return updateIncidentWithHttpInfoAsync(incidentId, body, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Updates an incident. Provide only the attributes that should be updated as this request is a
   * partial update.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param body Incident Payload. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;IncidentResponse&gt;
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
  public ApiResponse<IncidentResponse> updateIncidentWithHttpInfo(
      String incidentId, IncidentUpdateRequest body, UpdateIncidentOptionalParameters parameters)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateIncident";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'incidentId' when calling updateIncident");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateIncident");
    }
    List<IncidentRelatedObject> include = parameters.include;
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.updateIncident",
            localVarPath,
            localVarQueryParams,
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<IncidentResponse>() {});
  }

  /**
   * Update an existing incident.
   *
   * <p>See {@link #updateIncidentWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param body Incident Payload. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentResponse>> updateIncidentWithHttpInfoAsync(
      String incidentId, IncidentUpdateRequest body, UpdateIncidentOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "updateIncident";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      CompletableFuture<ApiResponse<IncidentResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'incidentId' when calling updateIncident"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<IncidentResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateIncident"));
      return result;
    }
    List<IncidentRelatedObject> include = parameters.include;
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.updateIncident",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<IncidentResponse>() {});
  }

  /** Manage optional parameters to updateIncidentAttachment. */
  public static class UpdateIncidentAttachmentOptionalParameters {
    private String include;

    /**
     * Set include.
     *
     * @param include Resource to include in the response. Supported value: <code>
     *     last_modified_by_user</code>. (optional)
     * @return UpdateIncidentAttachmentOptionalParameters
     */
    public UpdateIncidentAttachmentOptionalParameters include(String include) {
      this.include = include;
      return this;
    }
  }

  /**
   * Update incident attachment.
   *
   * <p>See {@link #updateIncidentAttachmentWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param attachmentId The ID of the attachment. (required)
   * @param body (required)
   * @return Attachment
   * @throws ApiException if fails to make API call
   */
  public Attachment updateIncidentAttachment(
      String incidentId, String attachmentId, PatchAttachmentRequest body) throws ApiException {
    return updateIncidentAttachmentWithHttpInfo(
            incidentId, attachmentId, body, new UpdateIncidentAttachmentOptionalParameters())
        .getData();
  }

  /**
   * Update incident attachment.
   *
   * <p>See {@link #updateIncidentAttachmentWithHttpInfoAsync}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param attachmentId The ID of the attachment. (required)
   * @param body (required)
   * @return CompletableFuture&lt;Attachment&gt;
   */
  public CompletableFuture<Attachment> updateIncidentAttachmentAsync(
      String incidentId, String attachmentId, PatchAttachmentRequest body) {
    return updateIncidentAttachmentWithHttpInfoAsync(
            incidentId, attachmentId, body, new UpdateIncidentAttachmentOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update incident attachment.
   *
   * <p>See {@link #updateIncidentAttachmentWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param attachmentId The ID of the attachment. (required)
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return Attachment
   * @throws ApiException if fails to make API call
   */
  public Attachment updateIncidentAttachment(
      String incidentId,
      String attachmentId,
      PatchAttachmentRequest body,
      UpdateIncidentAttachmentOptionalParameters parameters)
      throws ApiException {
    return updateIncidentAttachmentWithHttpInfo(incidentId, attachmentId, body, parameters)
        .getData();
  }

  /**
   * Update incident attachment.
   *
   * <p>See {@link #updateIncidentAttachmentWithHttpInfoAsync}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param attachmentId The ID of the attachment. (required)
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;Attachment&gt;
   */
  public CompletableFuture<Attachment> updateIncidentAttachmentAsync(
      String incidentId,
      String attachmentId,
      PatchAttachmentRequest body,
      UpdateIncidentAttachmentOptionalParameters parameters) {
    return updateIncidentAttachmentWithHttpInfoAsync(incidentId, attachmentId, body, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * @param incidentId The UUID of the incident. (required)
   * @param attachmentId The ID of the attachment. (required)
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;Attachment&gt;
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
  public ApiResponse<Attachment> updateIncidentAttachmentWithHttpInfo(
      String incidentId,
      String attachmentId,
      PatchAttachmentRequest body,
      UpdateIncidentAttachmentOptionalParameters parameters)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateIncidentAttachment";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'incidentId' when calling updateIncidentAttachment");
    }

    // verify the required parameter 'attachmentId' is set
    if (attachmentId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'attachmentId' when calling updateIncidentAttachment");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateIncidentAttachment");
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/attachments/{attachment_id}"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()))
            .replaceAll(
                "\\{" + "attachment_id" + "\\}", apiClient.escapeString(attachmentId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.updateIncidentAttachment",
            localVarPath,
            localVarQueryParams,
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<Attachment>() {});
  }

  /**
   * Update incident attachment.
   *
   * <p>See {@link #updateIncidentAttachmentWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param attachmentId The ID of the attachment. (required)
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;Attachment&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Attachment>> updateIncidentAttachmentWithHttpInfoAsync(
      String incidentId,
      String attachmentId,
      PatchAttachmentRequest body,
      UpdateIncidentAttachmentOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "updateIncidentAttachment";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Attachment>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      CompletableFuture<ApiResponse<Attachment>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'incidentId' when calling updateIncidentAttachment"));
      return result;
    }

    // verify the required parameter 'attachmentId' is set
    if (attachmentId == null) {
      CompletableFuture<ApiResponse<Attachment>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'attachmentId' when calling"
                  + " updateIncidentAttachment"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Attachment>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateIncidentAttachment"));
      return result;
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/attachments/{attachment_id}"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()))
            .replaceAll(
                "\\{" + "attachment_id" + "\\}", apiClient.escapeString(attachmentId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.updateIncidentAttachment",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Attachment>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<Attachment>() {});
  }

  /**
   * Update an incident configuration.
   *
   * <p>See {@link #updateIncidentConfigurationWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param body Incident configuration patch payload. (required)
   * @return IncidentConfigurationResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentConfigurationResponse updateIncidentConfiguration(
      String incidentId, IncidentConfigurationPatchRequest body) throws ApiException {
    return updateIncidentConfigurationWithHttpInfo(incidentId, body).getData();
  }

  /**
   * Update an incident configuration.
   *
   * <p>See {@link #updateIncidentConfigurationWithHttpInfoAsync}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param body Incident configuration patch payload. (required)
   * @return CompletableFuture&lt;IncidentConfigurationResponse&gt;
   */
  public CompletableFuture<IncidentConfigurationResponse> updateIncidentConfigurationAsync(
      String incidentId, IncidentConfigurationPatchRequest body) {
    return updateIncidentConfigurationWithHttpInfoAsync(incidentId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update a configuration for an incident.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param body Incident configuration patch payload. (required)
   * @return ApiResponse&lt;IncidentConfigurationResponse&gt;
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
  public ApiResponse<IncidentConfigurationResponse> updateIncidentConfigurationWithHttpInfo(
      String incidentId, IncidentConfigurationPatchRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateIncidentConfiguration";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'incidentId' when calling updateIncidentConfiguration");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateIncidentConfiguration");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/configurations"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.updateIncidentConfiguration",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<IncidentConfigurationResponse>() {});
  }

  /**
   * Update an incident configuration.
   *
   * <p>See {@link #updateIncidentConfigurationWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param body Incident configuration patch payload. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentConfigurationResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentConfigurationResponse>>
      updateIncidentConfigurationWithHttpInfoAsync(
          String incidentId, IncidentConfigurationPatchRequest body) {
    // Check if unstable operation is enabled
    String operationId = "updateIncidentConfiguration";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentConfigurationResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      CompletableFuture<ApiResponse<IncidentConfigurationResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'incidentId' when calling"
                  + " updateIncidentConfiguration"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<IncidentConfigurationResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling updateIncidentConfiguration"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/configurations"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.updateIncidentConfiguration",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentConfigurationResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<IncidentConfigurationResponse>() {});
  }

  /**
   * Update an incident Google Chat configuration.
   *
   * <p>See {@link #updateIncidentGoogleChatConfigurationWithHttpInfo}.
   *
   * @param id The UUID of the Google Chat configuration. (required)
   * @param body Google Chat configuration patch payload. (required)
   * @return IncidentGoogleChatConfigurationResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentGoogleChatConfigurationResponse updateIncidentGoogleChatConfiguration(
      UUID id, IncidentGoogleChatConfigurationPatchRequest body) throws ApiException {
    return updateIncidentGoogleChatConfigurationWithHttpInfo(id, body).getData();
  }

  /**
   * Update an incident Google Chat configuration.
   *
   * <p>See {@link #updateIncidentGoogleChatConfigurationWithHttpInfoAsync}.
   *
   * @param id The UUID of the Google Chat configuration. (required)
   * @param body Google Chat configuration patch payload. (required)
   * @return CompletableFuture&lt;IncidentGoogleChatConfigurationResponse&gt;
   */
  public CompletableFuture<IncidentGoogleChatConfigurationResponse>
      updateIncidentGoogleChatConfigurationAsync(
          UUID id, IncidentGoogleChatConfigurationPatchRequest body) {
    return updateIncidentGoogleChatConfigurationWithHttpInfoAsync(id, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update a Google Chat configuration for incidents.
   *
   * @param id The UUID of the Google Chat configuration. (required)
   * @param body Google Chat configuration patch payload. (required)
   * @return ApiResponse&lt;IncidentGoogleChatConfigurationResponse&gt;
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
  public ApiResponse<IncidentGoogleChatConfigurationResponse>
      updateIncidentGoogleChatConfigurationWithHttpInfo(
          UUID id, IncidentGoogleChatConfigurationPatchRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateIncidentGoogleChatConfiguration";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'id' when calling updateIncidentGoogleChatConfiguration");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'body' when calling"
              + " updateIncidentGoogleChatConfiguration");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/config/google-chat-configurations/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.updateIncidentGoogleChatConfiguration",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<IncidentGoogleChatConfigurationResponse>() {});
  }

  /**
   * Update an incident Google Chat configuration.
   *
   * <p>See {@link #updateIncidentGoogleChatConfigurationWithHttpInfo}.
   *
   * @param id The UUID of the Google Chat configuration. (required)
   * @param body Google Chat configuration patch payload. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentGoogleChatConfigurationResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentGoogleChatConfigurationResponse>>
      updateIncidentGoogleChatConfigurationWithHttpInfoAsync(
          UUID id, IncidentGoogleChatConfigurationPatchRequest body) {
    // Check if unstable operation is enabled
    String operationId = "updateIncidentGoogleChatConfiguration";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentGoogleChatConfigurationResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'id' is set
    if (id == null) {
      CompletableFuture<ApiResponse<IncidentGoogleChatConfigurationResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'id' when calling"
                  + " updateIncidentGoogleChatConfiguration"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<IncidentGoogleChatConfigurationResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " updateIncidentGoogleChatConfiguration"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/config/google-chat-configurations/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.updateIncidentGoogleChatConfiguration",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentGoogleChatConfigurationResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<IncidentGoogleChatConfigurationResponse>() {});
  }

  /**
   * Update an incident Google Meet configuration.
   *
   * <p>See {@link #updateIncidentGoogleMeetConfigurationWithHttpInfo}.
   *
   * @param id The UUID of the Google Meet configuration. (required)
   * @param body Google Meet configuration patch payload. (required)
   * @return IncidentGoogleMeetConfigurationResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentGoogleMeetConfigurationResponse updateIncidentGoogleMeetConfiguration(
      UUID id, IncidentGoogleMeetConfigurationPatchRequest body) throws ApiException {
    return updateIncidentGoogleMeetConfigurationWithHttpInfo(id, body).getData();
  }

  /**
   * Update an incident Google Meet configuration.
   *
   * <p>See {@link #updateIncidentGoogleMeetConfigurationWithHttpInfoAsync}.
   *
   * @param id The UUID of the Google Meet configuration. (required)
   * @param body Google Meet configuration patch payload. (required)
   * @return CompletableFuture&lt;IncidentGoogleMeetConfigurationResponse&gt;
   */
  public CompletableFuture<IncidentGoogleMeetConfigurationResponse>
      updateIncidentGoogleMeetConfigurationAsync(
          UUID id, IncidentGoogleMeetConfigurationPatchRequest body) {
    return updateIncidentGoogleMeetConfigurationWithHttpInfoAsync(id, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update a Google Meet configuration for incidents.
   *
   * @param id The UUID of the Google Meet configuration. (required)
   * @param body Google Meet configuration patch payload. (required)
   * @return ApiResponse&lt;IncidentGoogleMeetConfigurationResponse&gt;
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
  public ApiResponse<IncidentGoogleMeetConfigurationResponse>
      updateIncidentGoogleMeetConfigurationWithHttpInfo(
          UUID id, IncidentGoogleMeetConfigurationPatchRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateIncidentGoogleMeetConfiguration";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'id' when calling updateIncidentGoogleMeetConfiguration");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'body' when calling"
              + " updateIncidentGoogleMeetConfiguration");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/config/google-meet-configurations/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.updateIncidentGoogleMeetConfiguration",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<IncidentGoogleMeetConfigurationResponse>() {});
  }

  /**
   * Update an incident Google Meet configuration.
   *
   * <p>See {@link #updateIncidentGoogleMeetConfigurationWithHttpInfo}.
   *
   * @param id The UUID of the Google Meet configuration. (required)
   * @param body Google Meet configuration patch payload. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentGoogleMeetConfigurationResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentGoogleMeetConfigurationResponse>>
      updateIncidentGoogleMeetConfigurationWithHttpInfoAsync(
          UUID id, IncidentGoogleMeetConfigurationPatchRequest body) {
    // Check if unstable operation is enabled
    String operationId = "updateIncidentGoogleMeetConfiguration";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentGoogleMeetConfigurationResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'id' is set
    if (id == null) {
      CompletableFuture<ApiResponse<IncidentGoogleMeetConfigurationResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'id' when calling"
                  + " updateIncidentGoogleMeetConfiguration"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<IncidentGoogleMeetConfigurationResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " updateIncidentGoogleMeetConfiguration"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/config/google-meet-configurations/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.updateIncidentGoogleMeetConfiguration",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentGoogleMeetConfigurationResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<IncidentGoogleMeetConfigurationResponse>() {});
  }

  /** Manage optional parameters to updateIncidentImpact. */
  public static class UpdateIncidentImpactOptionalParameters {
    private List<IncidentImpactRelatedObject> include;

    /**
     * Set include.
     *
     * @param include Specifies which related resources should be included in the response.
     *     (optional)
     * @return UpdateIncidentImpactOptionalParameters
     */
    public UpdateIncidentImpactOptionalParameters include(
        List<IncidentImpactRelatedObject> include) {
      this.include = include;
      return this;
    }
  }

  /**
   * Update an incident impact.
   *
   * <p>See {@link #updateIncidentImpactWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param impactId The UUID of the incident impact. (required)
   * @param body Incident impact payload. (required)
   * @return IncidentImpactResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentImpactResponse updateIncidentImpact(
      String incidentId, String impactId, IncidentImpactCreateRequest body) throws ApiException {
    return updateIncidentImpactWithHttpInfo(
            incidentId, impactId, body, new UpdateIncidentImpactOptionalParameters())
        .getData();
  }

  /**
   * Update an incident impact.
   *
   * <p>See {@link #updateIncidentImpactWithHttpInfoAsync}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param impactId The UUID of the incident impact. (required)
   * @param body Incident impact payload. (required)
   * @return CompletableFuture&lt;IncidentImpactResponse&gt;
   */
  public CompletableFuture<IncidentImpactResponse> updateIncidentImpactAsync(
      String incidentId, String impactId, IncidentImpactCreateRequest body) {
    return updateIncidentImpactWithHttpInfoAsync(
            incidentId, impactId, body, new UpdateIncidentImpactOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update an incident impact.
   *
   * <p>See {@link #updateIncidentImpactWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param impactId The UUID of the incident impact. (required)
   * @param body Incident impact payload. (required)
   * @param parameters Optional parameters for the request.
   * @return IncidentImpactResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentImpactResponse updateIncidentImpact(
      String incidentId,
      String impactId,
      IncidentImpactCreateRequest body,
      UpdateIncidentImpactOptionalParameters parameters)
      throws ApiException {
    return updateIncidentImpactWithHttpInfo(incidentId, impactId, body, parameters).getData();
  }

  /**
   * Update an incident impact.
   *
   * <p>See {@link #updateIncidentImpactWithHttpInfoAsync}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param impactId The UUID of the incident impact. (required)
   * @param body Incident impact payload. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;IncidentImpactResponse&gt;
   */
  public CompletableFuture<IncidentImpactResponse> updateIncidentImpactAsync(
      String incidentId,
      String impactId,
      IncidentImpactCreateRequest body,
      UpdateIncidentImpactOptionalParameters parameters) {
    return updateIncidentImpactWithHttpInfoAsync(incidentId, impactId, body, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update an incident impact.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param impactId The UUID of the incident impact. (required)
   * @param body Incident impact payload. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;IncidentImpactResponse&gt;
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
  public ApiResponse<IncidentImpactResponse> updateIncidentImpactWithHttpInfo(
      String incidentId,
      String impactId,
      IncidentImpactCreateRequest body,
      UpdateIncidentImpactOptionalParameters parameters)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateIncidentImpact";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'incidentId' when calling updateIncidentImpact");
    }

    // verify the required parameter 'impactId' is set
    if (impactId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'impactId' when calling updateIncidentImpact");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateIncidentImpact");
    }
    List<IncidentImpactRelatedObject> include = parameters.include;
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/impacts/{impact_id}"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()))
            .replaceAll("\\{" + "impact_id" + "\\}", apiClient.escapeString(impactId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.updateIncidentImpact",
            localVarPath,
            localVarQueryParams,
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "PUT",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<IncidentImpactResponse>() {});
  }

  /**
   * Update an incident impact.
   *
   * <p>See {@link #updateIncidentImpactWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param impactId The UUID of the incident impact. (required)
   * @param body Incident impact payload. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentImpactResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentImpactResponse>>
      updateIncidentImpactWithHttpInfoAsync(
          String incidentId,
          String impactId,
          IncidentImpactCreateRequest body,
          UpdateIncidentImpactOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "updateIncidentImpact";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentImpactResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      CompletableFuture<ApiResponse<IncidentImpactResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'incidentId' when calling updateIncidentImpact"));
      return result;
    }

    // verify the required parameter 'impactId' is set
    if (impactId == null) {
      CompletableFuture<ApiResponse<IncidentImpactResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'impactId' when calling updateIncidentImpact"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<IncidentImpactResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateIncidentImpact"));
      return result;
    }
    List<IncidentImpactRelatedObject> include = parameters.include;
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/impacts/{impact_id}"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()))
            .replaceAll("\\{" + "impact_id" + "\\}", apiClient.escapeString(impactId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.updateIncidentImpact",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentImpactResponse>> result = new CompletableFuture<>();
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
        new GenericType<IncidentImpactResponse>() {});
  }

  /**
   * Update an incident impact field.
   *
   * <p>See {@link #updateIncidentImpactFieldWithHttpInfo}.
   *
   * @param fieldId The UUID of the impact field. (required)
   * @param body Impact field update payload. (required)
   * @return IncidentImpactFieldResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentImpactFieldResponse updateIncidentImpactField(
      UUID fieldId, IncidentImpactFieldRequest body) throws ApiException {
    return updateIncidentImpactFieldWithHttpInfo(fieldId, body).getData();
  }

  /**
   * Update an incident impact field.
   *
   * <p>See {@link #updateIncidentImpactFieldWithHttpInfoAsync}.
   *
   * @param fieldId The UUID of the impact field. (required)
   * @param body Impact field update payload. (required)
   * @return CompletableFuture&lt;IncidentImpactFieldResponse&gt;
   */
  public CompletableFuture<IncidentImpactFieldResponse> updateIncidentImpactFieldAsync(
      UUID fieldId, IncidentImpactFieldRequest body) {
    return updateIncidentImpactFieldWithHttpInfoAsync(fieldId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update an impact field for incidents.
   *
   * @param fieldId The UUID of the impact field. (required)
   * @param body Impact field update payload. (required)
   * @return ApiResponse&lt;IncidentImpactFieldResponse&gt;
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
  public ApiResponse<IncidentImpactFieldResponse> updateIncidentImpactFieldWithHttpInfo(
      UUID fieldId, IncidentImpactFieldRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateIncidentImpactField";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'fieldId' is set
    if (fieldId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'fieldId' when calling updateIncidentImpactField");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateIncidentImpactField");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/config/impact-fields/{field_id}"
            .replaceAll("\\{" + "field_id" + "\\}", apiClient.escapeString(fieldId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.updateIncidentImpactField",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "PUT",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<IncidentImpactFieldResponse>() {});
  }

  /**
   * Update an incident impact field.
   *
   * <p>See {@link #updateIncidentImpactFieldWithHttpInfo}.
   *
   * @param fieldId The UUID of the impact field. (required)
   * @param body Impact field update payload. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentImpactFieldResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentImpactFieldResponse>>
      updateIncidentImpactFieldWithHttpInfoAsync(UUID fieldId, IncidentImpactFieldRequest body) {
    // Check if unstable operation is enabled
    String operationId = "updateIncidentImpactField";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentImpactFieldResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'fieldId' is set
    if (fieldId == null) {
      CompletableFuture<ApiResponse<IncidentImpactFieldResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'fieldId' when calling updateIncidentImpactField"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<IncidentImpactFieldResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateIncidentImpactField"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/config/impact-fields/{field_id}"
            .replaceAll("\\{" + "field_id" + "\\}", apiClient.escapeString(fieldId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.updateIncidentImpactField",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentImpactFieldResponse>> result =
          new CompletableFuture<>();
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
        new GenericType<IncidentImpactFieldResponse>() {});
  }

  /**
   * Update an existing incident integration metadata.
   *
   * <p>See {@link #updateIncidentIntegrationWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param integrationMetadataId The UUID of the incident integration metadata. (required)
   * @param body Incident integration metadata payload. (required)
   * @return IncidentIntegrationMetadataResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentIntegrationMetadataResponse updateIncidentIntegration(
      String incidentId, String integrationMetadataId, IncidentIntegrationMetadataPatchRequest body)
      throws ApiException {
    return updateIncidentIntegrationWithHttpInfo(incidentId, integrationMetadataId, body).getData();
  }

  /**
   * Update an existing incident integration metadata.
   *
   * <p>See {@link #updateIncidentIntegrationWithHttpInfoAsync}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param integrationMetadataId The UUID of the incident integration metadata. (required)
   * @param body Incident integration metadata payload. (required)
   * @return CompletableFuture&lt;IncidentIntegrationMetadataResponse&gt;
   */
  public CompletableFuture<IncidentIntegrationMetadataResponse> updateIncidentIntegrationAsync(
      String incidentId,
      String integrationMetadataId,
      IncidentIntegrationMetadataPatchRequest body) {
    return updateIncidentIntegrationWithHttpInfoAsync(incidentId, integrationMetadataId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update an existing incident integration metadata.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param integrationMetadataId The UUID of the incident integration metadata. (required)
   * @param body Incident integration metadata payload. (required)
   * @return ApiResponse&lt;IncidentIntegrationMetadataResponse&gt;
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
  public ApiResponse<IncidentIntegrationMetadataResponse> updateIncidentIntegrationWithHttpInfo(
      String incidentId, String integrationMetadataId, IncidentIntegrationMetadataPatchRequest body)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateIncidentIntegration";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'incidentId' when calling updateIncidentIntegration");
    }

    // verify the required parameter 'integrationMetadataId' is set
    if (integrationMetadataId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'integrationMetadataId' when calling"
              + " updateIncidentIntegration");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateIncidentIntegration");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/relationships/integrations/{integration_metadata_id}"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()))
            .replaceAll(
                "\\{" + "integration_metadata_id" + "\\}",
                apiClient.escapeString(integrationMetadataId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.updateIncidentIntegration",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<IncidentIntegrationMetadataResponse>() {});
  }

  /**
   * Update an existing incident integration metadata.
   *
   * <p>See {@link #updateIncidentIntegrationWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param integrationMetadataId The UUID of the incident integration metadata. (required)
   * @param body Incident integration metadata payload. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentIntegrationMetadataResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentIntegrationMetadataResponse>>
      updateIncidentIntegrationWithHttpInfoAsync(
          String incidentId,
          String integrationMetadataId,
          IncidentIntegrationMetadataPatchRequest body) {
    // Check if unstable operation is enabled
    String operationId = "updateIncidentIntegration";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentIntegrationMetadataResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      CompletableFuture<ApiResponse<IncidentIntegrationMetadataResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'incidentId' when calling"
                  + " updateIncidentIntegration"));
      return result;
    }

    // verify the required parameter 'integrationMetadataId' is set
    if (integrationMetadataId == null) {
      CompletableFuture<ApiResponse<IncidentIntegrationMetadataResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'integrationMetadataId' when calling"
                  + " updateIncidentIntegration"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<IncidentIntegrationMetadataResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateIncidentIntegration"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/relationships/integrations/{integration_metadata_id}"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()))
            .replaceAll(
                "\\{" + "integration_metadata_id" + "\\}",
                apiClient.escapeString(integrationMetadataId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.updateIncidentIntegration",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentIntegrationMetadataResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<IncidentIntegrationMetadataResponse>() {});
  }

  /** Manage optional parameters to updateIncidentNotificationRule. */
  public static class UpdateIncidentNotificationRuleOptionalParameters {
    private String include;

    /**
     * Set include.
     *
     * @param include Comma-separated list of resources to include. Supported values: <code>
     *     created_by_user</code>, <code>last_modified_by_user</code>, <code>incident_type</code>,
     *     <code>notification_template</code> (optional)
     * @return UpdateIncidentNotificationRuleOptionalParameters
     */
    public UpdateIncidentNotificationRuleOptionalParameters include(String include) {
      this.include = include;
      return this;
    }
  }

  /**
   * Update an incident notification rule.
   *
   * <p>See {@link #updateIncidentNotificationRuleWithHttpInfo}.
   *
   * @param id The ID of the notification rule. (required)
   * @param body (required)
   * @return IncidentNotificationRule
   * @throws ApiException if fails to make API call
   */
  public IncidentNotificationRule updateIncidentNotificationRule(
      UUID id, PutIncidentNotificationRuleRequest body) throws ApiException {
    return updateIncidentNotificationRuleWithHttpInfo(
            id, body, new UpdateIncidentNotificationRuleOptionalParameters())
        .getData();
  }

  /**
   * Update an incident notification rule.
   *
   * <p>See {@link #updateIncidentNotificationRuleWithHttpInfoAsync}.
   *
   * @param id The ID of the notification rule. (required)
   * @param body (required)
   * @return CompletableFuture&lt;IncidentNotificationRule&gt;
   */
  public CompletableFuture<IncidentNotificationRule> updateIncidentNotificationRuleAsync(
      UUID id, PutIncidentNotificationRuleRequest body) {
    return updateIncidentNotificationRuleWithHttpInfoAsync(
            id, body, new UpdateIncidentNotificationRuleOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update an incident notification rule.
   *
   * <p>See {@link #updateIncidentNotificationRuleWithHttpInfo}.
   *
   * @param id The ID of the notification rule. (required)
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return IncidentNotificationRule
   * @throws ApiException if fails to make API call
   */
  public IncidentNotificationRule updateIncidentNotificationRule(
      UUID id,
      PutIncidentNotificationRuleRequest body,
      UpdateIncidentNotificationRuleOptionalParameters parameters)
      throws ApiException {
    return updateIncidentNotificationRuleWithHttpInfo(id, body, parameters).getData();
  }

  /**
   * Update an incident notification rule.
   *
   * <p>See {@link #updateIncidentNotificationRuleWithHttpInfoAsync}.
   *
   * @param id The ID of the notification rule. (required)
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;IncidentNotificationRule&gt;
   */
  public CompletableFuture<IncidentNotificationRule> updateIncidentNotificationRuleAsync(
      UUID id,
      PutIncidentNotificationRuleRequest body,
      UpdateIncidentNotificationRuleOptionalParameters parameters) {
    return updateIncidentNotificationRuleWithHttpInfoAsync(id, body, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Updates an existing notification rule with a complete replacement.
   *
   * @param id The ID of the notification rule. (required)
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;IncidentNotificationRule&gt;
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
  public ApiResponse<IncidentNotificationRule> updateIncidentNotificationRuleWithHttpInfo(
      UUID id,
      PutIncidentNotificationRuleRequest body,
      UpdateIncidentNotificationRuleOptionalParameters parameters)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateIncidentNotificationRule";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(
          400, "Missing the required parameter 'id' when calling updateIncidentNotificationRule");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateIncidentNotificationRule");
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/config/notification-rules/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.updateIncidentNotificationRule",
            localVarPath,
            localVarQueryParams,
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "PUT",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<IncidentNotificationRule>() {});
  }

  /**
   * Update an incident notification rule.
   *
   * <p>See {@link #updateIncidentNotificationRuleWithHttpInfo}.
   *
   * @param id The ID of the notification rule. (required)
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentNotificationRule&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentNotificationRule>>
      updateIncidentNotificationRuleWithHttpInfoAsync(
          UUID id,
          PutIncidentNotificationRuleRequest body,
          UpdateIncidentNotificationRuleOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "updateIncidentNotificationRule";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentNotificationRule>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'id' is set
    if (id == null) {
      CompletableFuture<ApiResponse<IncidentNotificationRule>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'id' when calling updateIncidentNotificationRule"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<IncidentNotificationRule>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling updateIncidentNotificationRule"));
      return result;
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/config/notification-rules/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.updateIncidentNotificationRule",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentNotificationRule>> result = new CompletableFuture<>();
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
        new GenericType<IncidentNotificationRule>() {});
  }

  /** Manage optional parameters to updateIncidentNotificationTemplate. */
  public static class UpdateIncidentNotificationTemplateOptionalParameters {
    private String include;

    /**
     * Set include.
     *
     * @param include Comma-separated list of relationships to include. Supported values: <code>
     *     created_by_user</code>, <code>last_modified_by_user</code>, <code>incident_type</code>
     *     (optional)
     * @return UpdateIncidentNotificationTemplateOptionalParameters
     */
    public UpdateIncidentNotificationTemplateOptionalParameters include(String include) {
      this.include = include;
      return this;
    }
  }

  /**
   * Update incident notification template.
   *
   * <p>See {@link #updateIncidentNotificationTemplateWithHttpInfo}.
   *
   * @param id The ID of the notification template. (required)
   * @param body (required)
   * @return IncidentNotificationTemplate
   * @throws ApiException if fails to make API call
   */
  public IncidentNotificationTemplate updateIncidentNotificationTemplate(
      UUID id, PatchIncidentNotificationTemplateRequest body) throws ApiException {
    return updateIncidentNotificationTemplateWithHttpInfo(
            id, body, new UpdateIncidentNotificationTemplateOptionalParameters())
        .getData();
  }

  /**
   * Update incident notification template.
   *
   * <p>See {@link #updateIncidentNotificationTemplateWithHttpInfoAsync}.
   *
   * @param id The ID of the notification template. (required)
   * @param body (required)
   * @return CompletableFuture&lt;IncidentNotificationTemplate&gt;
   */
  public CompletableFuture<IncidentNotificationTemplate> updateIncidentNotificationTemplateAsync(
      UUID id, PatchIncidentNotificationTemplateRequest body) {
    return updateIncidentNotificationTemplateWithHttpInfoAsync(
            id, body, new UpdateIncidentNotificationTemplateOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update incident notification template.
   *
   * <p>See {@link #updateIncidentNotificationTemplateWithHttpInfo}.
   *
   * @param id The ID of the notification template. (required)
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return IncidentNotificationTemplate
   * @throws ApiException if fails to make API call
   */
  public IncidentNotificationTemplate updateIncidentNotificationTemplate(
      UUID id,
      PatchIncidentNotificationTemplateRequest body,
      UpdateIncidentNotificationTemplateOptionalParameters parameters)
      throws ApiException {
    return updateIncidentNotificationTemplateWithHttpInfo(id, body, parameters).getData();
  }

  /**
   * Update incident notification template.
   *
   * <p>See {@link #updateIncidentNotificationTemplateWithHttpInfoAsync}.
   *
   * @param id The ID of the notification template. (required)
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;IncidentNotificationTemplate&gt;
   */
  public CompletableFuture<IncidentNotificationTemplate> updateIncidentNotificationTemplateAsync(
      UUID id,
      PatchIncidentNotificationTemplateRequest body,
      UpdateIncidentNotificationTemplateOptionalParameters parameters) {
    return updateIncidentNotificationTemplateWithHttpInfoAsync(id, body, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Updates an existing notification template's attributes.
   *
   * @param id The ID of the notification template. (required)
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;IncidentNotificationTemplate&gt;
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
  public ApiResponse<IncidentNotificationTemplate> updateIncidentNotificationTemplateWithHttpInfo(
      UUID id,
      PatchIncidentNotificationTemplateRequest body,
      UpdateIncidentNotificationTemplateOptionalParameters parameters)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateIncidentNotificationTemplate";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'id' when calling updateIncidentNotificationTemplate");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'body' when calling updateIncidentNotificationTemplate");
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/config/notification-templates/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.updateIncidentNotificationTemplate",
            localVarPath,
            localVarQueryParams,
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<IncidentNotificationTemplate>() {});
  }

  /**
   * Update incident notification template.
   *
   * <p>See {@link #updateIncidentNotificationTemplateWithHttpInfo}.
   *
   * @param id The ID of the notification template. (required)
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentNotificationTemplate&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentNotificationTemplate>>
      updateIncidentNotificationTemplateWithHttpInfoAsync(
          UUID id,
          PatchIncidentNotificationTemplateRequest body,
          UpdateIncidentNotificationTemplateOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "updateIncidentNotificationTemplate";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentNotificationTemplate>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'id' is set
    if (id == null) {
      CompletableFuture<ApiResponse<IncidentNotificationTemplate>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'id' when calling"
                  + " updateIncidentNotificationTemplate"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<IncidentNotificationTemplate>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " updateIncidentNotificationTemplate"));
      return result;
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/config/notification-templates/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.updateIncidentNotificationTemplate",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentNotificationTemplate>> result =
          new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<IncidentNotificationTemplate>() {});
  }

  /**
   * Update postmortem template.
   *
   * <p>See {@link #updateIncidentPostmortemTemplateWithHttpInfo}.
   *
   * @param templateId The ID of the postmortem template (required)
   * @param body (required)
   * @return PostmortemTemplateResponse
   * @throws ApiException if fails to make API call
   */
  public PostmortemTemplateResponse updateIncidentPostmortemTemplate(
      String templateId, PostmortemTemplateRequest body) throws ApiException {
    return updateIncidentPostmortemTemplateWithHttpInfo(templateId, body).getData();
  }

  /**
   * Update postmortem template.
   *
   * <p>See {@link #updateIncidentPostmortemTemplateWithHttpInfoAsync}.
   *
   * @param templateId The ID of the postmortem template (required)
   * @param body (required)
   * @return CompletableFuture&lt;PostmortemTemplateResponse&gt;
   */
  public CompletableFuture<PostmortemTemplateResponse> updateIncidentPostmortemTemplateAsync(
      String templateId, PostmortemTemplateRequest body) {
    return updateIncidentPostmortemTemplateWithHttpInfoAsync(templateId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update an existing postmortem template.
   *
   * @param templateId The ID of the postmortem template (required)
   * @param body (required)
   * @return ApiResponse&lt;PostmortemTemplateResponse&gt;
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
  public ApiResponse<PostmortemTemplateResponse> updateIncidentPostmortemTemplateWithHttpInfo(
      String templateId, PostmortemTemplateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateIncidentPostmortemTemplate";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'templateId' when calling"
              + " updateIncidentPostmortemTemplate");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'body' when calling updateIncidentPostmortemTemplate");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/config/postmortem-templates/{template_id}"
            .replaceAll(
                "\\{" + "template_id" + "\\}", apiClient.escapeString(templateId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.updateIncidentPostmortemTemplate",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<PostmortemTemplateResponse>() {});
  }

  /**
   * Update postmortem template.
   *
   * <p>See {@link #updateIncidentPostmortemTemplateWithHttpInfo}.
   *
   * @param templateId The ID of the postmortem template (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;PostmortemTemplateResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<PostmortemTemplateResponse>>
      updateIncidentPostmortemTemplateWithHttpInfoAsync(
          String templateId, PostmortemTemplateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "updateIncidentPostmortemTemplate";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<PostmortemTemplateResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      CompletableFuture<ApiResponse<PostmortemTemplateResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'templateId' when calling"
                  + " updateIncidentPostmortemTemplate"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<PostmortemTemplateResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " updateIncidentPostmortemTemplate"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/config/postmortem-templates/{template_id}"
            .replaceAll(
                "\\{" + "template_id" + "\\}", apiClient.escapeString(templateId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.updateIncidentPostmortemTemplate",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<PostmortemTemplateResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<PostmortemTemplateResponse>() {});
  }

  /**
   * Update an incident rule.
   *
   * <p>See {@link #updateIncidentRuleWithHttpInfo}.
   *
   * @param ruleId The UUID of the incident rule. (required)
   * @param body Incident rule patch payload. (required)
   * @return IncidentRuleResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentRuleResponse updateIncidentRule(UUID ruleId, IncidentRulePatchRequest body)
      throws ApiException {
    return updateIncidentRuleWithHttpInfo(ruleId, body).getData();
  }

  /**
   * Update an incident rule.
   *
   * <p>See {@link #updateIncidentRuleWithHttpInfoAsync}.
   *
   * @param ruleId The UUID of the incident rule. (required)
   * @param body Incident rule patch payload. (required)
   * @return CompletableFuture&lt;IncidentRuleResponse&gt;
   */
  public CompletableFuture<IncidentRuleResponse> updateIncidentRuleAsync(
      UUID ruleId, IncidentRulePatchRequest body) {
    return updateIncidentRuleWithHttpInfoAsync(ruleId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update an incident rule.
   *
   * @param ruleId The UUID of the incident rule. (required)
   * @param body Incident rule patch payload. (required)
   * @return ApiResponse&lt;IncidentRuleResponse&gt;
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
  public ApiResponse<IncidentRuleResponse> updateIncidentRuleWithHttpInfo(
      UUID ruleId, IncidentRulePatchRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateIncidentRule";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'ruleId' is set
    if (ruleId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'ruleId' when calling updateIncidentRule");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateIncidentRule");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/config/rules/{rule_id}"
            .replaceAll("\\{" + "rule_id" + "\\}", apiClient.escapeString(ruleId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.updateIncidentRule",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<IncidentRuleResponse>() {});
  }

  /**
   * Update an incident rule.
   *
   * <p>See {@link #updateIncidentRuleWithHttpInfo}.
   *
   * @param ruleId The UUID of the incident rule. (required)
   * @param body Incident rule patch payload. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentRuleResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentRuleResponse>> updateIncidentRuleWithHttpInfoAsync(
      UUID ruleId, IncidentRulePatchRequest body) {
    // Check if unstable operation is enabled
    String operationId = "updateIncidentRule";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentRuleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'ruleId' is set
    if (ruleId == null) {
      CompletableFuture<ApiResponse<IncidentRuleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'ruleId' when calling updateIncidentRule"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<IncidentRuleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateIncidentRule"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/config/rules/{rule_id}"
            .replaceAll("\\{" + "rule_id" + "\\}", apiClient.escapeString(ruleId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.updateIncidentRule",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentRuleResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<IncidentRuleResponse>() {});
  }

  /**
   * Update an incident todo.
   *
   * <p>See {@link #updateIncidentTodoWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param todoId The UUID of the incident todo. (required)
   * @param body Incident todo payload. (required)
   * @return IncidentTodoResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentTodoResponse updateIncidentTodo(
      String incidentId, String todoId, IncidentTodoPatchRequest body) throws ApiException {
    return updateIncidentTodoWithHttpInfo(incidentId, todoId, body).getData();
  }

  /**
   * Update an incident todo.
   *
   * <p>See {@link #updateIncidentTodoWithHttpInfoAsync}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param todoId The UUID of the incident todo. (required)
   * @param body Incident todo payload. (required)
   * @return CompletableFuture&lt;IncidentTodoResponse&gt;
   */
  public CompletableFuture<IncidentTodoResponse> updateIncidentTodoAsync(
      String incidentId, String todoId, IncidentTodoPatchRequest body) {
    return updateIncidentTodoWithHttpInfoAsync(incidentId, todoId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update an incident todo.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param todoId The UUID of the incident todo. (required)
   * @param body Incident todo payload. (required)
   * @return ApiResponse&lt;IncidentTodoResponse&gt;
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
  public ApiResponse<IncidentTodoResponse> updateIncidentTodoWithHttpInfo(
      String incidentId, String todoId, IncidentTodoPatchRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateIncidentTodo";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'incidentId' when calling updateIncidentTodo");
    }

    // verify the required parameter 'todoId' is set
    if (todoId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'todoId' when calling updateIncidentTodo");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateIncidentTodo");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/relationships/todos/{todo_id}"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()))
            .replaceAll("\\{" + "todo_id" + "\\}", apiClient.escapeString(todoId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.updateIncidentTodo",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<IncidentTodoResponse>() {});
  }

  /**
   * Update an incident todo.
   *
   * <p>See {@link #updateIncidentTodoWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param todoId The UUID of the incident todo. (required)
   * @param body Incident todo payload. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentTodoResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentTodoResponse>> updateIncidentTodoWithHttpInfoAsync(
      String incidentId, String todoId, IncidentTodoPatchRequest body) {
    // Check if unstable operation is enabled
    String operationId = "updateIncidentTodo";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentTodoResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      CompletableFuture<ApiResponse<IncidentTodoResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'incidentId' when calling updateIncidentTodo"));
      return result;
    }

    // verify the required parameter 'todoId' is set
    if (todoId == null) {
      CompletableFuture<ApiResponse<IncidentTodoResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'todoId' when calling updateIncidentTodo"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<IncidentTodoResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateIncidentTodo"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/relationships/todos/{todo_id}"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()))
            .replaceAll("\\{" + "todo_id" + "\\}", apiClient.escapeString(todoId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.updateIncidentTodo",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentTodoResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<IncidentTodoResponse>() {});
  }

  /**
   * Update an incident type.
   *
   * <p>See {@link #updateIncidentTypeWithHttpInfo}.
   *
   * @param incidentTypeId The UUID of the incident type. (required)
   * @param body Incident type payload. (required)
   * @return IncidentTypeResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentTypeResponse updateIncidentType(
      String incidentTypeId, IncidentTypePatchRequest body) throws ApiException {
    return updateIncidentTypeWithHttpInfo(incidentTypeId, body).getData();
  }

  /**
   * Update an incident type.
   *
   * <p>See {@link #updateIncidentTypeWithHttpInfoAsync}.
   *
   * @param incidentTypeId The UUID of the incident type. (required)
   * @param body Incident type payload. (required)
   * @return CompletableFuture&lt;IncidentTypeResponse&gt;
   */
  public CompletableFuture<IncidentTypeResponse> updateIncidentTypeAsync(
      String incidentTypeId, IncidentTypePatchRequest body) {
    return updateIncidentTypeWithHttpInfoAsync(incidentTypeId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update an incident type.
   *
   * @param incidentTypeId The UUID of the incident type. (required)
   * @param body Incident type payload. (required)
   * @return ApiResponse&lt;IncidentTypeResponse&gt;
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
  public ApiResponse<IncidentTypeResponse> updateIncidentTypeWithHttpInfo(
      String incidentTypeId, IncidentTypePatchRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateIncidentType";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'incidentTypeId' is set
    if (incidentTypeId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'incidentTypeId' when calling updateIncidentType");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateIncidentType");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/config/types/{incident_type_id}"
            .replaceAll(
                "\\{" + "incident_type_id" + "\\}",
                apiClient.escapeString(incidentTypeId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.updateIncidentType",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<IncidentTypeResponse>() {});
  }

  /**
   * Update an incident type.
   *
   * <p>See {@link #updateIncidentTypeWithHttpInfo}.
   *
   * @param incidentTypeId The UUID of the incident type. (required)
   * @param body Incident type payload. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentTypeResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentTypeResponse>> updateIncidentTypeWithHttpInfoAsync(
      String incidentTypeId, IncidentTypePatchRequest body) {
    // Check if unstable operation is enabled
    String operationId = "updateIncidentType";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentTypeResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'incidentTypeId' is set
    if (incidentTypeId == null) {
      CompletableFuture<ApiResponse<IncidentTypeResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'incidentTypeId' when calling updateIncidentType"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<IncidentTypeResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateIncidentType"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/config/types/{incident_type_id}"
            .replaceAll(
                "\\{" + "incident_type_id" + "\\}",
                apiClient.escapeString(incidentTypeId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.updateIncidentType",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentTypeResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<IncidentTypeResponse>() {});
  }

  /** Manage optional parameters to updateIncidentUserDefinedField. */
  public static class UpdateIncidentUserDefinedFieldOptionalParameters {
    private String include;

    /**
     * Set include.
     *
     * @param include Comma-separated list of related resources to include. Supported values are
     *     "last_modified_by_user", "created_by_user", and "incident_type". (optional)
     * @return UpdateIncidentUserDefinedFieldOptionalParameters
     */
    public UpdateIncidentUserDefinedFieldOptionalParameters include(String include) {
      this.include = include;
      return this;
    }
  }

  /**
   * Update an incident user-defined field.
   *
   * <p>See {@link #updateIncidentUserDefinedFieldWithHttpInfo}.
   *
   * @param fieldId The ID of the incident user-defined field. (required)
   * @param body Incident user-defined field update payload. (required)
   * @return IncidentUserDefinedFieldResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentUserDefinedFieldResponse updateIncidentUserDefinedField(
      String fieldId, IncidentUserDefinedFieldUpdateRequest body) throws ApiException {
    return updateIncidentUserDefinedFieldWithHttpInfo(
            fieldId, body, new UpdateIncidentUserDefinedFieldOptionalParameters())
        .getData();
  }

  /**
   * Update an incident user-defined field.
   *
   * <p>See {@link #updateIncidentUserDefinedFieldWithHttpInfoAsync}.
   *
   * @param fieldId The ID of the incident user-defined field. (required)
   * @param body Incident user-defined field update payload. (required)
   * @return CompletableFuture&lt;IncidentUserDefinedFieldResponse&gt;
   */
  public CompletableFuture<IncidentUserDefinedFieldResponse> updateIncidentUserDefinedFieldAsync(
      String fieldId, IncidentUserDefinedFieldUpdateRequest body) {
    return updateIncidentUserDefinedFieldWithHttpInfoAsync(
            fieldId, body, new UpdateIncidentUserDefinedFieldOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update an incident user-defined field.
   *
   * <p>See {@link #updateIncidentUserDefinedFieldWithHttpInfo}.
   *
   * @param fieldId The ID of the incident user-defined field. (required)
   * @param body Incident user-defined field update payload. (required)
   * @param parameters Optional parameters for the request.
   * @return IncidentUserDefinedFieldResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentUserDefinedFieldResponse updateIncidentUserDefinedField(
      String fieldId,
      IncidentUserDefinedFieldUpdateRequest body,
      UpdateIncidentUserDefinedFieldOptionalParameters parameters)
      throws ApiException {
    return updateIncidentUserDefinedFieldWithHttpInfo(fieldId, body, parameters).getData();
  }

  /**
   * Update an incident user-defined field.
   *
   * <p>See {@link #updateIncidentUserDefinedFieldWithHttpInfoAsync}.
   *
   * @param fieldId The ID of the incident user-defined field. (required)
   * @param body Incident user-defined field update payload. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;IncidentUserDefinedFieldResponse&gt;
   */
  public CompletableFuture<IncidentUserDefinedFieldResponse> updateIncidentUserDefinedFieldAsync(
      String fieldId,
      IncidentUserDefinedFieldUpdateRequest body,
      UpdateIncidentUserDefinedFieldOptionalParameters parameters) {
    return updateIncidentUserDefinedFieldWithHttpInfoAsync(fieldId, body, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update an incident user-defined field.
   *
   * @param fieldId The ID of the incident user-defined field. (required)
   * @param body Incident user-defined field update payload. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;IncidentUserDefinedFieldResponse&gt;
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
  public ApiResponse<IncidentUserDefinedFieldResponse> updateIncidentUserDefinedFieldWithHttpInfo(
      String fieldId,
      IncidentUserDefinedFieldUpdateRequest body,
      UpdateIncidentUserDefinedFieldOptionalParameters parameters)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateIncidentUserDefinedField";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'fieldId' is set
    if (fieldId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'fieldId' when calling updateIncidentUserDefinedField");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateIncidentUserDefinedField");
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/config/user-defined-fields/{field_id}"
            .replaceAll("\\{" + "field_id" + "\\}", apiClient.escapeString(fieldId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.updateIncidentUserDefinedField",
            localVarPath,
            localVarQueryParams,
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<IncidentUserDefinedFieldResponse>() {});
  }

  /**
   * Update an incident user-defined field.
   *
   * <p>See {@link #updateIncidentUserDefinedFieldWithHttpInfo}.
   *
   * @param fieldId The ID of the incident user-defined field. (required)
   * @param body Incident user-defined field update payload. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentUserDefinedFieldResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentUserDefinedFieldResponse>>
      updateIncidentUserDefinedFieldWithHttpInfoAsync(
          String fieldId,
          IncidentUserDefinedFieldUpdateRequest body,
          UpdateIncidentUserDefinedFieldOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "updateIncidentUserDefinedField";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentUserDefinedFieldResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'fieldId' is set
    if (fieldId == null) {
      CompletableFuture<ApiResponse<IncidentUserDefinedFieldResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'fieldId' when calling"
                  + " updateIncidentUserDefinedField"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<IncidentUserDefinedFieldResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling updateIncidentUserDefinedField"));
      return result;
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/config/user-defined-fields/{field_id}"
            .replaceAll("\\{" + "field_id" + "\\}", apiClient.escapeString(fieldId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.updateIncidentUserDefinedField",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentUserDefinedFieldResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<IncidentUserDefinedFieldResponse>() {});
  }

  /** Manage optional parameters to updateIncidentUserDefinedRole. */
  public static class UpdateIncidentUserDefinedRoleOptionalParameters {
    private String include;

    /**
     * Set include.
     *
     * @param include Comma-separated list of related resources to include in the response.
     *     (optional)
     * @return UpdateIncidentUserDefinedRoleOptionalParameters
     */
    public UpdateIncidentUserDefinedRoleOptionalParameters include(String include) {
      this.include = include;
      return this;
    }
  }

  /**
   * Update an incident user-defined role.
   *
   * <p>See {@link #updateIncidentUserDefinedRoleWithHttpInfo}.
   *
   * @param roleId The UUID of the incident user-defined role. (required)
   * @param body (required)
   * @return IncidentUserDefinedRoleResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentUserDefinedRoleResponse updateIncidentUserDefinedRole(
      UUID roleId, IncidentUserDefinedRolePatchRequest body) throws ApiException {
    return updateIncidentUserDefinedRoleWithHttpInfo(
            roleId, body, new UpdateIncidentUserDefinedRoleOptionalParameters())
        .getData();
  }

  /**
   * Update an incident user-defined role.
   *
   * <p>See {@link #updateIncidentUserDefinedRoleWithHttpInfoAsync}.
   *
   * @param roleId The UUID of the incident user-defined role. (required)
   * @param body (required)
   * @return CompletableFuture&lt;IncidentUserDefinedRoleResponse&gt;
   */
  public CompletableFuture<IncidentUserDefinedRoleResponse> updateIncidentUserDefinedRoleAsync(
      UUID roleId, IncidentUserDefinedRolePatchRequest body) {
    return updateIncidentUserDefinedRoleWithHttpInfoAsync(
            roleId, body, new UpdateIncidentUserDefinedRoleOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update an incident user-defined role.
   *
   * <p>See {@link #updateIncidentUserDefinedRoleWithHttpInfo}.
   *
   * @param roleId The UUID of the incident user-defined role. (required)
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return IncidentUserDefinedRoleResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentUserDefinedRoleResponse updateIncidentUserDefinedRole(
      UUID roleId,
      IncidentUserDefinedRolePatchRequest body,
      UpdateIncidentUserDefinedRoleOptionalParameters parameters)
      throws ApiException {
    return updateIncidentUserDefinedRoleWithHttpInfo(roleId, body, parameters).getData();
  }

  /**
   * Update an incident user-defined role.
   *
   * <p>See {@link #updateIncidentUserDefinedRoleWithHttpInfoAsync}.
   *
   * @param roleId The UUID of the incident user-defined role. (required)
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;IncidentUserDefinedRoleResponse&gt;
   */
  public CompletableFuture<IncidentUserDefinedRoleResponse> updateIncidentUserDefinedRoleAsync(
      UUID roleId,
      IncidentUserDefinedRolePatchRequest body,
      UpdateIncidentUserDefinedRoleOptionalParameters parameters) {
    return updateIncidentUserDefinedRoleWithHttpInfoAsync(roleId, body, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update an existing user-defined role for incidents.
   *
   * @param roleId The UUID of the incident user-defined role. (required)
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;IncidentUserDefinedRoleResponse&gt;
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
  public ApiResponse<IncidentUserDefinedRoleResponse> updateIncidentUserDefinedRoleWithHttpInfo(
      UUID roleId,
      IncidentUserDefinedRolePatchRequest body,
      UpdateIncidentUserDefinedRoleOptionalParameters parameters)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateIncidentUserDefinedRole";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'roleId' is set
    if (roleId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'roleId' when calling updateIncidentUserDefinedRole");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateIncidentUserDefinedRole");
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/config/user-defined-roles/{role_id}"
            .replaceAll("\\{" + "role_id" + "\\}", apiClient.escapeString(roleId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.updateIncidentUserDefinedRole",
            localVarPath,
            localVarQueryParams,
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<IncidentUserDefinedRoleResponse>() {});
  }

  /**
   * Update an incident user-defined role.
   *
   * <p>See {@link #updateIncidentUserDefinedRoleWithHttpInfo}.
   *
   * @param roleId The UUID of the incident user-defined role. (required)
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentUserDefinedRoleResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentUserDefinedRoleResponse>>
      updateIncidentUserDefinedRoleWithHttpInfoAsync(
          UUID roleId,
          IncidentUserDefinedRolePatchRequest body,
          UpdateIncidentUserDefinedRoleOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "updateIncidentUserDefinedRole";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentUserDefinedRoleResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'roleId' is set
    if (roleId == null) {
      CompletableFuture<ApiResponse<IncidentUserDefinedRoleResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'roleId' when calling"
                  + " updateIncidentUserDefinedRole"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<IncidentUserDefinedRoleResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling updateIncidentUserDefinedRole"));
      return result;
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/config/user-defined-roles/{role_id}"
            .replaceAll("\\{" + "role_id" + "\\}", apiClient.escapeString(roleId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.updateIncidentUserDefinedRole",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentUserDefinedRoleResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<IncidentUserDefinedRoleResponse>() {});
  }

  /**
   * Update an incident timestamp override.
   *
   * <p>See {@link #updateTimestampOverrideWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param id The UUID of the timestamp override. (required)
   * @param body Timestamp override patch payload. (required)
   * @return IncidentTimestampOverrideResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentTimestampOverrideResponse updateTimestampOverride(
      String incidentId, UUID id, IncidentTimestampOverridePatchRequest body) throws ApiException {
    return updateTimestampOverrideWithHttpInfo(incidentId, id, body).getData();
  }

  /**
   * Update an incident timestamp override.
   *
   * <p>See {@link #updateTimestampOverrideWithHttpInfoAsync}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param id The UUID of the timestamp override. (required)
   * @param body Timestamp override patch payload. (required)
   * @return CompletableFuture&lt;IncidentTimestampOverrideResponse&gt;
   */
  public CompletableFuture<IncidentTimestampOverrideResponse> updateTimestampOverrideAsync(
      String incidentId, UUID id, IncidentTimestampOverridePatchRequest body) {
    return updateTimestampOverrideWithHttpInfoAsync(incidentId, id, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update a timestamp override for an incident.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param id The UUID of the timestamp override. (required)
   * @param body Timestamp override patch payload. (required)
   * @return ApiResponse&lt;IncidentTimestampOverrideResponse&gt;
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
  public ApiResponse<IncidentTimestampOverrideResponse> updateTimestampOverrideWithHttpInfo(
      String incidentId, UUID id, IncidentTimestampOverridePatchRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateTimestampOverride";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'incidentId' when calling updateTimestampOverride");
    }

    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(
          400, "Missing the required parameter 'id' when calling updateTimestampOverride");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateTimestampOverride");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/timestamp-overrides/{id}"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()))
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.updateTimestampOverride",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<IncidentTimestampOverrideResponse>() {});
  }

  /**
   * Update an incident timestamp override.
   *
   * <p>See {@link #updateTimestampOverrideWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param id The UUID of the timestamp override. (required)
   * @param body Timestamp override patch payload. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentTimestampOverrideResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentTimestampOverrideResponse>>
      updateTimestampOverrideWithHttpInfoAsync(
          String incidentId, UUID id, IncidentTimestampOverridePatchRequest body) {
    // Check if unstable operation is enabled
    String operationId = "updateTimestampOverride";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentTimestampOverrideResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      CompletableFuture<ApiResponse<IncidentTimestampOverrideResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'incidentId' when calling updateTimestampOverride"));
      return result;
    }

    // verify the required parameter 'id' is set
    if (id == null) {
      CompletableFuture<ApiResponse<IncidentTimestampOverrideResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'id' when calling updateTimestampOverride"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<IncidentTimestampOverrideResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateTimestampOverride"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/timestamp-overrides/{id}"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()))
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.updateTimestampOverride",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentTimestampOverrideResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<IncidentTimestampOverrideResponse>() {});
  }
}
