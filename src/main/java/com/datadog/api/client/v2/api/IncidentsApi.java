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
import com.datadog.api.client.v2.model.IncidentAutomationDataRequest;
import com.datadog.api.client.v2.model.IncidentAutomationDataResponse;
import com.datadog.api.client.v2.model.IncidentBatchCreateRuleExecutionStatesRequest;
import com.datadog.api.client.v2.model.IncidentBatchUpdateRuleExecutionStatesRequest;
import com.datadog.api.client.v2.model.IncidentCaseLinkResponse;
import com.datadog.api.client.v2.model.IncidentCommunicationRequest;
import com.datadog.api.client.v2.model.IncidentCommunicationResponse;
import com.datadog.api.client.v2.model.IncidentCommunicationsResponse;
import com.datadog.api.client.v2.model.IncidentCreateRequest;
import com.datadog.api.client.v2.model.IncidentCreateZoomMeetingRequest;
import com.datadog.api.client.v2.model.IncidentGoogleMeetIntegrationResponse;
import com.datadog.api.client.v2.model.IncidentHandleRequest;
import com.datadog.api.client.v2.model.IncidentHandleResponse;
import com.datadog.api.client.v2.model.IncidentHandlesResponse;
import com.datadog.api.client.v2.model.IncidentImpactCreateRequest;
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
import com.datadog.api.client.v2.model.IncidentJiraIssueIntegrationResponse;
import com.datadog.api.client.v2.model.IncidentJiraIssueRequest;
import com.datadog.api.client.v2.model.IncidentJiraTemplateRequest;
import com.datadog.api.client.v2.model.IncidentJiraTemplateResponse;
import com.datadog.api.client.v2.model.IncidentJiraTemplatesResponse;
import com.datadog.api.client.v2.model.IncidentMSTeamsIntegrationResponse;
import com.datadog.api.client.v2.model.IncidentMicrosoftTeamsConfigurationRequest;
import com.datadog.api.client.v2.model.IncidentMicrosoftTeamsConfigurationResponse;
import com.datadog.api.client.v2.model.IncidentNotificationRule;
import com.datadog.api.client.v2.model.IncidentNotificationRuleArray;
import com.datadog.api.client.v2.model.IncidentNotificationTemplate;
import com.datadog.api.client.v2.model.IncidentNotificationTemplateArray;
import com.datadog.api.client.v2.model.IncidentPagerdutyRelatedIncidentsResponse;
import com.datadog.api.client.v2.model.IncidentPagerdutyServicesResponse;
import com.datadog.api.client.v2.model.IncidentRelatedObject;
import com.datadog.api.client.v2.model.IncidentRenderTemplateRequest;
import com.datadog.api.client.v2.model.IncidentRenderedTemplateResponse;
import com.datadog.api.client.v2.model.IncidentReservedRoleResponse;
import com.datadog.api.client.v2.model.IncidentReservedRolesResponse;
import com.datadog.api.client.v2.model.IncidentResponse;
import com.datadog.api.client.v2.model.IncidentResponseData;
import com.datadog.api.client.v2.model.IncidentRoleAssignmentRequest;
import com.datadog.api.client.v2.model.IncidentRoleAssignmentResponse;
import com.datadog.api.client.v2.model.IncidentRuleExecutionStatesResponse;
import com.datadog.api.client.v2.model.IncidentSearchIncidentsExportRequest;
import com.datadog.api.client.v2.model.IncidentSearchIncidentsIncludeType;
import com.datadog.api.client.v2.model.IncidentSearchIncidentsSortOrder;
import com.datadog.api.client.v2.model.IncidentSearchResponse;
import com.datadog.api.client.v2.model.IncidentSearchResponseIncidentsData;
import com.datadog.api.client.v2.model.IncidentSearchSortOrder;
import com.datadog.api.client.v2.model.IncidentStatusPageNoticeCreateRequest;
import com.datadog.api.client.v2.model.IncidentStatusPageNoticeIntegrationResponse;
import com.datadog.api.client.v2.model.IncidentStatusPageNoticeUpdateRequest;
import com.datadog.api.client.v2.model.IncidentStatusPagesSuggestionResponse;
import com.datadog.api.client.v2.model.IncidentStatuspageIncidentRequest;
import com.datadog.api.client.v2.model.IncidentStatuspageIncidentResponse;
import com.datadog.api.client.v2.model.IncidentStatuspagePreferencesResponse;
import com.datadog.api.client.v2.model.IncidentStatuspageSubscriptionRequest;
import com.datadog.api.client.v2.model.IncidentStatuspageSubscriptionResponse;
import com.datadog.api.client.v2.model.IncidentStatuspageSubscriptionsResponse;
import com.datadog.api.client.v2.model.IncidentTemplateVariablesResponse;
import com.datadog.api.client.v2.model.IncidentTimelineEntriesResponse;
import com.datadog.api.client.v2.model.IncidentTimelineEntryRequest;
import com.datadog.api.client.v2.model.IncidentTimelineEntryResponse;
import com.datadog.api.client.v2.model.IncidentTimelineThreadResponse;
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
import com.datadog.api.client.v2.model.IncidentZoomConfigurationRequest;
import com.datadog.api.client.v2.model.IncidentZoomConfigurationResponse;
import com.datadog.api.client.v2.model.IncidentZoomIntegrationResponse;
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
import java.io.File;
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

  /**
   * Batch create incident rule execution states.
   *
   * <p>See {@link #batchCreateIncidentRuleExecutionStatesWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param body (required)
   * @return IncidentRuleExecutionStatesResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentRuleExecutionStatesResponse batchCreateIncidentRuleExecutionStates(
      String incidentId, IncidentBatchCreateRuleExecutionStatesRequest body) throws ApiException {
    return batchCreateIncidentRuleExecutionStatesWithHttpInfo(incidentId, body).getData();
  }

  /**
   * Batch create incident rule execution states.
   *
   * <p>See {@link #batchCreateIncidentRuleExecutionStatesWithHttpInfoAsync}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param body (required)
   * @return CompletableFuture&lt;IncidentRuleExecutionStatesResponse&gt;
   */
  public CompletableFuture<IncidentRuleExecutionStatesResponse>
      batchCreateIncidentRuleExecutionStatesAsync(
          String incidentId, IncidentBatchCreateRuleExecutionStatesRequest body) {
    return batchCreateIncidentRuleExecutionStatesWithHttpInfoAsync(incidentId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Batch create rule execution states for a given incident.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param body (required)
   * @return ApiResponse&lt;IncidentRuleExecutionStatesResponse&gt;
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
  public ApiResponse<IncidentRuleExecutionStatesResponse>
      batchCreateIncidentRuleExecutionStatesWithHttpInfo(
          String incidentId, IncidentBatchCreateRuleExecutionStatesRequest body)
          throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "batchCreateIncidentRuleExecutionStates";
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
              + " batchCreateIncidentRuleExecutionStates");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'body' when calling"
              + " batchCreateIncidentRuleExecutionStates");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/rule-execution-states/batch"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.batchCreateIncidentRuleExecutionStates",
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
        new GenericType<IncidentRuleExecutionStatesResponse>() {});
  }

  /**
   * Batch create incident rule execution states.
   *
   * <p>See {@link #batchCreateIncidentRuleExecutionStatesWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentRuleExecutionStatesResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentRuleExecutionStatesResponse>>
      batchCreateIncidentRuleExecutionStatesWithHttpInfoAsync(
          String incidentId, IncidentBatchCreateRuleExecutionStatesRequest body) {
    // Check if unstable operation is enabled
    String operationId = "batchCreateIncidentRuleExecutionStates";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentRuleExecutionStatesResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      CompletableFuture<ApiResponse<IncidentRuleExecutionStatesResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'incidentId' when calling"
                  + " batchCreateIncidentRuleExecutionStates"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<IncidentRuleExecutionStatesResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " batchCreateIncidentRuleExecutionStates"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/rule-execution-states/batch"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.batchCreateIncidentRuleExecutionStates",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentRuleExecutionStatesResponse>> result =
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
        new GenericType<IncidentRuleExecutionStatesResponse>() {});
  }

  /**
   * Batch update incident rule execution states.
   *
   * <p>See {@link #batchUpdateIncidentRuleExecutionStatesWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param body (required)
   * @return IncidentRuleExecutionStatesResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentRuleExecutionStatesResponse batchUpdateIncidentRuleExecutionStates(
      String incidentId, IncidentBatchUpdateRuleExecutionStatesRequest body) throws ApiException {
    return batchUpdateIncidentRuleExecutionStatesWithHttpInfo(incidentId, body).getData();
  }

  /**
   * Batch update incident rule execution states.
   *
   * <p>See {@link #batchUpdateIncidentRuleExecutionStatesWithHttpInfoAsync}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param body (required)
   * @return CompletableFuture&lt;IncidentRuleExecutionStatesResponse&gt;
   */
  public CompletableFuture<IncidentRuleExecutionStatesResponse>
      batchUpdateIncidentRuleExecutionStatesAsync(
          String incidentId, IncidentBatchUpdateRuleExecutionStatesRequest body) {
    return batchUpdateIncidentRuleExecutionStatesWithHttpInfoAsync(incidentId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Batch update rule execution states for a given incident.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param body (required)
   * @return ApiResponse&lt;IncidentRuleExecutionStatesResponse&gt;
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
  public ApiResponse<IncidentRuleExecutionStatesResponse>
      batchUpdateIncidentRuleExecutionStatesWithHttpInfo(
          String incidentId, IncidentBatchUpdateRuleExecutionStatesRequest body)
          throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "batchUpdateIncidentRuleExecutionStates";
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
              + " batchUpdateIncidentRuleExecutionStates");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'body' when calling"
              + " batchUpdateIncidentRuleExecutionStates");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/rule-execution-states/batch"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.batchUpdateIncidentRuleExecutionStates",
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
        new GenericType<IncidentRuleExecutionStatesResponse>() {});
  }

  /**
   * Batch update incident rule execution states.
   *
   * <p>See {@link #batchUpdateIncidentRuleExecutionStatesWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentRuleExecutionStatesResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentRuleExecutionStatesResponse>>
      batchUpdateIncidentRuleExecutionStatesWithHttpInfoAsync(
          String incidentId, IncidentBatchUpdateRuleExecutionStatesRequest body) {
    // Check if unstable operation is enabled
    String operationId = "batchUpdateIncidentRuleExecutionStates";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentRuleExecutionStatesResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      CompletableFuture<ApiResponse<IncidentRuleExecutionStatesResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'incidentId' when calling"
                  + " batchUpdateIncidentRuleExecutionStates"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<IncidentRuleExecutionStatesResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " batchUpdateIncidentRuleExecutionStates"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/rule-execution-states/batch"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.batchUpdateIncidentRuleExecutionStates",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentRuleExecutionStatesResponse>> result =
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
        new GenericType<IncidentRuleExecutionStatesResponse>() {});
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
   * Create an incident communication.
   *
   * <p>See {@link #createIncidentCommunicationWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param body (required)
   * @return IncidentCommunicationResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentCommunicationResponse createIncidentCommunication(
      String incidentId, IncidentCommunicationRequest body) throws ApiException {
    return createIncidentCommunicationWithHttpInfo(incidentId, body).getData();
  }

  /**
   * Create an incident communication.
   *
   * <p>See {@link #createIncidentCommunicationWithHttpInfoAsync}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param body (required)
   * @return CompletableFuture&lt;IncidentCommunicationResponse&gt;
   */
  public CompletableFuture<IncidentCommunicationResponse> createIncidentCommunicationAsync(
      String incidentId, IncidentCommunicationRequest body) {
    return createIncidentCommunicationWithHttpInfoAsync(incidentId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a new communication for a given incident.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param body (required)
   * @return ApiResponse&lt;IncidentCommunicationResponse&gt;
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
  public ApiResponse<IncidentCommunicationResponse> createIncidentCommunicationWithHttpInfo(
      String incidentId, IncidentCommunicationRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createIncidentCommunication";
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
          "Missing the required parameter 'incidentId' when calling createIncidentCommunication");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createIncidentCommunication");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/communications"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.createIncidentCommunication",
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
        new GenericType<IncidentCommunicationResponse>() {});
  }

  /**
   * Create an incident communication.
   *
   * <p>See {@link #createIncidentCommunicationWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentCommunicationResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentCommunicationResponse>>
      createIncidentCommunicationWithHttpInfoAsync(
          String incidentId, IncidentCommunicationRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createIncidentCommunication";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentCommunicationResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      CompletableFuture<ApiResponse<IncidentCommunicationResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'incidentId' when calling"
                  + " createIncidentCommunication"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<IncidentCommunicationResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling createIncidentCommunication"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/communications"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.createIncidentCommunication",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentCommunicationResponse>> result =
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
        new GenericType<IncidentCommunicationResponse>() {});
  }

  /**
   * Create an incident Google Meet space.
   *
   * <p>See {@link #createIncidentGoogleMeetSpaceWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @return IncidentGoogleMeetIntegrationResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentGoogleMeetIntegrationResponse createIncidentGoogleMeetSpace(String incidentId)
      throws ApiException {
    return createIncidentGoogleMeetSpaceWithHttpInfo(incidentId).getData();
  }

  /**
   * Create an incident Google Meet space.
   *
   * <p>See {@link #createIncidentGoogleMeetSpaceWithHttpInfoAsync}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @return CompletableFuture&lt;IncidentGoogleMeetIntegrationResponse&gt;
   */
  public CompletableFuture<IncidentGoogleMeetIntegrationResponse>
      createIncidentGoogleMeetSpaceAsync(String incidentId) {
    return createIncidentGoogleMeetSpaceWithHttpInfoAsync(incidentId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a Google Meet space for a given incident.
   *
   * @param incidentId The UUID of the incident. (required)
   * @return ApiResponse&lt;IncidentGoogleMeetIntegrationResponse&gt;
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
  public ApiResponse<IncidentGoogleMeetIntegrationResponse>
      createIncidentGoogleMeetSpaceWithHttpInfo(String incidentId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createIncidentGoogleMeetSpace";
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
          "Missing the required parameter 'incidentId' when calling createIncidentGoogleMeetSpace");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/google-meet/space"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.createIncidentGoogleMeetSpace",
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
        new GenericType<IncidentGoogleMeetIntegrationResponse>() {});
  }

  /**
   * Create an incident Google Meet space.
   *
   * <p>See {@link #createIncidentGoogleMeetSpaceWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentGoogleMeetIntegrationResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentGoogleMeetIntegrationResponse>>
      createIncidentGoogleMeetSpaceWithHttpInfoAsync(String incidentId) {
    // Check if unstable operation is enabled
    String operationId = "createIncidentGoogleMeetSpace";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentGoogleMeetIntegrationResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      CompletableFuture<ApiResponse<IncidentGoogleMeetIntegrationResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'incidentId' when calling"
                  + " createIncidentGoogleMeetSpace"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/google-meet/space"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.createIncidentGoogleMeetSpace",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentGoogleMeetIntegrationResponse>> result =
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
        new GenericType<IncidentGoogleMeetIntegrationResponse>() {});
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
   * Create an incident Jira issue.
   *
   * <p>See {@link #createIncidentJiraIssueWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param body (required)
   * @return IncidentJiraIssueIntegrationResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentJiraIssueIntegrationResponse createIncidentJiraIssue(
      String incidentId, IncidentJiraIssueRequest body) throws ApiException {
    return createIncidentJiraIssueWithHttpInfo(incidentId, body).getData();
  }

  /**
   * Create an incident Jira issue.
   *
   * <p>See {@link #createIncidentJiraIssueWithHttpInfoAsync}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param body (required)
   * @return CompletableFuture&lt;IncidentJiraIssueIntegrationResponse&gt;
   */
  public CompletableFuture<IncidentJiraIssueIntegrationResponse> createIncidentJiraIssueAsync(
      String incidentId, IncidentJiraIssueRequest body) {
    return createIncidentJiraIssueWithHttpInfoAsync(incidentId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a Jira issue linked to a given incident.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param body (required)
   * @return ApiResponse&lt;IncidentJiraIssueIntegrationResponse&gt;
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
  public ApiResponse<IncidentJiraIssueIntegrationResponse> createIncidentJiraIssueWithHttpInfo(
      String incidentId, IncidentJiraIssueRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createIncidentJiraIssue";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'incidentId' when calling createIncidentJiraIssue");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createIncidentJiraIssue");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/jira-issues"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.createIncidentJiraIssue",
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
        new GenericType<IncidentJiraIssueIntegrationResponse>() {});
  }

  /**
   * Create an incident Jira issue.
   *
   * <p>See {@link #createIncidentJiraIssueWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentJiraIssueIntegrationResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentJiraIssueIntegrationResponse>>
      createIncidentJiraIssueWithHttpInfoAsync(String incidentId, IncidentJiraIssueRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createIncidentJiraIssue";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentJiraIssueIntegrationResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      CompletableFuture<ApiResponse<IncidentJiraIssueIntegrationResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'incidentId' when calling createIncidentJiraIssue"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<IncidentJiraIssueIntegrationResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createIncidentJiraIssue"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/jira-issues"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.createIncidentJiraIssue",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentJiraIssueIntegrationResponse>> result =
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
        new GenericType<IncidentJiraIssueIntegrationResponse>() {});
  }

  /**
   * Create an incident Jira template.
   *
   * <p>See {@link #createIncidentJiraTemplateWithHttpInfo}.
   *
   * @param body (required)
   * @return IncidentJiraTemplateResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentJiraTemplateResponse createIncidentJiraTemplate(IncidentJiraTemplateRequest body)
      throws ApiException {
    return createIncidentJiraTemplateWithHttpInfo(body).getData();
  }

  /**
   * Create an incident Jira template.
   *
   * <p>See {@link #createIncidentJiraTemplateWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;IncidentJiraTemplateResponse&gt;
   */
  public CompletableFuture<IncidentJiraTemplateResponse> createIncidentJiraTemplateAsync(
      IncidentJiraTemplateRequest body) {
    return createIncidentJiraTemplateWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a new incident Jira template for the organization.
   *
   * @param body (required)
   * @return ApiResponse&lt;IncidentJiraTemplateResponse&gt;
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
  public ApiResponse<IncidentJiraTemplateResponse> createIncidentJiraTemplateWithHttpInfo(
      IncidentJiraTemplateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createIncidentJiraTemplate";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createIncidentJiraTemplate");
    }
    // create path and map variables
    String localVarPath = "/api/v2/incidents/config/jira-templates";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.createIncidentJiraTemplate",
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
        new GenericType<IncidentJiraTemplateResponse>() {});
  }

  /**
   * Create an incident Jira template.
   *
   * <p>See {@link #createIncidentJiraTemplateWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentJiraTemplateResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentJiraTemplateResponse>>
      createIncidentJiraTemplateWithHttpInfoAsync(IncidentJiraTemplateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createIncidentJiraTemplate";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentJiraTemplateResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<IncidentJiraTemplateResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling createIncidentJiraTemplate"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/incidents/config/jira-templates";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.createIncidentJiraTemplate",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentJiraTemplateResponse>> result =
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
        new GenericType<IncidentJiraTemplateResponse>() {});
  }

  /** Manage optional parameters to createIncidentMicrosoftTeamsConfiguration. */
  public static class CreateIncidentMicrosoftTeamsConfigurationOptionalParameters {
    private String include;

    /**
     * Set include.
     *
     * @param include Specifies which related objects to include in the response. (optional)
     * @return CreateIncidentMicrosoftTeamsConfigurationOptionalParameters
     */
    public CreateIncidentMicrosoftTeamsConfigurationOptionalParameters include(String include) {
      this.include = include;
      return this;
    }
  }

  /**
   * Create an incident Microsoft Teams configuration.
   *
   * <p>See {@link #createIncidentMicrosoftTeamsConfigurationWithHttpInfo}.
   *
   * @param body (required)
   * @return IncidentMicrosoftTeamsConfigurationResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentMicrosoftTeamsConfigurationResponse createIncidentMicrosoftTeamsConfiguration(
      IncidentMicrosoftTeamsConfigurationRequest body) throws ApiException {
    return createIncidentMicrosoftTeamsConfigurationWithHttpInfo(
            body, new CreateIncidentMicrosoftTeamsConfigurationOptionalParameters())
        .getData();
  }

  /**
   * Create an incident Microsoft Teams configuration.
   *
   * <p>See {@link #createIncidentMicrosoftTeamsConfigurationWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;IncidentMicrosoftTeamsConfigurationResponse&gt;
   */
  public CompletableFuture<IncidentMicrosoftTeamsConfigurationResponse>
      createIncidentMicrosoftTeamsConfigurationAsync(
          IncidentMicrosoftTeamsConfigurationRequest body) {
    return createIncidentMicrosoftTeamsConfigurationWithHttpInfoAsync(
            body, new CreateIncidentMicrosoftTeamsConfigurationOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create an incident Microsoft Teams configuration.
   *
   * <p>See {@link #createIncidentMicrosoftTeamsConfigurationWithHttpInfo}.
   *
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return IncidentMicrosoftTeamsConfigurationResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentMicrosoftTeamsConfigurationResponse createIncidentMicrosoftTeamsConfiguration(
      IncidentMicrosoftTeamsConfigurationRequest body,
      CreateIncidentMicrosoftTeamsConfigurationOptionalParameters parameters)
      throws ApiException {
    return createIncidentMicrosoftTeamsConfigurationWithHttpInfo(body, parameters).getData();
  }

  /**
   * Create an incident Microsoft Teams configuration.
   *
   * <p>See {@link #createIncidentMicrosoftTeamsConfigurationWithHttpInfoAsync}.
   *
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;IncidentMicrosoftTeamsConfigurationResponse&gt;
   */
  public CompletableFuture<IncidentMicrosoftTeamsConfigurationResponse>
      createIncidentMicrosoftTeamsConfigurationAsync(
          IncidentMicrosoftTeamsConfigurationRequest body,
          CreateIncidentMicrosoftTeamsConfigurationOptionalParameters parameters) {
    return createIncidentMicrosoftTeamsConfigurationWithHttpInfoAsync(body, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a Microsoft Teams configuration for incidents.
   *
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;IncidentMicrosoftTeamsConfigurationResponse&gt;
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
  public ApiResponse<IncidentMicrosoftTeamsConfigurationResponse>
      createIncidentMicrosoftTeamsConfigurationWithHttpInfo(
          IncidentMicrosoftTeamsConfigurationRequest body,
          CreateIncidentMicrosoftTeamsConfigurationOptionalParameters parameters)
          throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createIncidentMicrosoftTeamsConfiguration";
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
              + " createIncidentMicrosoftTeamsConfiguration");
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath = "/api/v2/incidents/config/microsoft-teams-configurations";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.createIncidentMicrosoftTeamsConfiguration",
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
        new GenericType<IncidentMicrosoftTeamsConfigurationResponse>() {});
  }

  /**
   * Create an incident Microsoft Teams configuration.
   *
   * <p>See {@link #createIncidentMicrosoftTeamsConfigurationWithHttpInfo}.
   *
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentMicrosoftTeamsConfigurationResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentMicrosoftTeamsConfigurationResponse>>
      createIncidentMicrosoftTeamsConfigurationWithHttpInfoAsync(
          IncidentMicrosoftTeamsConfigurationRequest body,
          CreateIncidentMicrosoftTeamsConfigurationOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "createIncidentMicrosoftTeamsConfiguration";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentMicrosoftTeamsConfigurationResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<IncidentMicrosoftTeamsConfigurationResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " createIncidentMicrosoftTeamsConfiguration"));
      return result;
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath = "/api/v2/incidents/config/microsoft-teams-configurations";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.createIncidentMicrosoftTeamsConfiguration",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentMicrosoftTeamsConfigurationResponse>> result =
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
        new GenericType<IncidentMicrosoftTeamsConfigurationResponse>() {});
  }

  /**
   * Create an incident Microsoft Teams online meeting.
   *
   * <p>See {@link #createIncidentMSTeamsOnlineMeetingWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @return IncidentMSTeamsIntegrationResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentMSTeamsIntegrationResponse createIncidentMSTeamsOnlineMeeting(String incidentId)
      throws ApiException {
    return createIncidentMSTeamsOnlineMeetingWithHttpInfo(incidentId).getData();
  }

  /**
   * Create an incident Microsoft Teams online meeting.
   *
   * <p>See {@link #createIncidentMSTeamsOnlineMeetingWithHttpInfoAsync}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @return CompletableFuture&lt;IncidentMSTeamsIntegrationResponse&gt;
   */
  public CompletableFuture<IncidentMSTeamsIntegrationResponse>
      createIncidentMSTeamsOnlineMeetingAsync(String incidentId) {
    return createIncidentMSTeamsOnlineMeetingWithHttpInfoAsync(incidentId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a Microsoft Teams online meeting for a given incident.
   *
   * @param incidentId The UUID of the incident. (required)
   * @return ApiResponse&lt;IncidentMSTeamsIntegrationResponse&gt;
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
  public ApiResponse<IncidentMSTeamsIntegrationResponse>
      createIncidentMSTeamsOnlineMeetingWithHttpInfo(String incidentId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createIncidentMSTeamsOnlineMeeting";
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
          "Missing the required parameter 'incidentId' when calling"
              + " createIncidentMSTeamsOnlineMeeting");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/microsoft-teams-integration/online-meeting"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.createIncidentMSTeamsOnlineMeeting",
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
        new GenericType<IncidentMSTeamsIntegrationResponse>() {});
  }

  /**
   * Create an incident Microsoft Teams online meeting.
   *
   * <p>See {@link #createIncidentMSTeamsOnlineMeetingWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentMSTeamsIntegrationResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentMSTeamsIntegrationResponse>>
      createIncidentMSTeamsOnlineMeetingWithHttpInfoAsync(String incidentId) {
    // Check if unstable operation is enabled
    String operationId = "createIncidentMSTeamsOnlineMeeting";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentMSTeamsIntegrationResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      CompletableFuture<ApiResponse<IncidentMSTeamsIntegrationResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'incidentId' when calling"
                  + " createIncidentMSTeamsOnlineMeeting"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/microsoft-teams-integration/online-meeting"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.createIncidentMSTeamsOnlineMeeting",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentMSTeamsIntegrationResponse>> result =
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
        new GenericType<IncidentMSTeamsIntegrationResponse>() {});
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
   * Create an incident role assignment.
   *
   * <p>See {@link #createIncidentRoleAssignmentWithHttpInfo}.
   *
   * @param body (required)
   * @return IncidentRoleAssignmentResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentRoleAssignmentResponse createIncidentRoleAssignment(
      IncidentRoleAssignmentRequest body) throws ApiException {
    return createIncidentRoleAssignmentWithHttpInfo(body).getData();
  }

  /**
   * Create an incident role assignment.
   *
   * <p>See {@link #createIncidentRoleAssignmentWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;IncidentRoleAssignmentResponse&gt;
   */
  public CompletableFuture<IncidentRoleAssignmentResponse> createIncidentRoleAssignmentAsync(
      IncidentRoleAssignmentRequest body) {
    return createIncidentRoleAssignmentWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a new role assignment for an incident.
   *
   * @param body (required)
   * @return ApiResponse&lt;IncidentRoleAssignmentResponse&gt;
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
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<IncidentRoleAssignmentResponse> createIncidentRoleAssignmentWithHttpInfo(
      IncidentRoleAssignmentRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createIncidentRoleAssignment";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createIncidentRoleAssignment");
    }
    // create path and map variables
    String localVarPath = "/api/v2/incidents/role_assignments";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.createIncidentRoleAssignment",
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
        new GenericType<IncidentRoleAssignmentResponse>() {});
  }

  /**
   * Create an incident role assignment.
   *
   * <p>See {@link #createIncidentRoleAssignmentWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentRoleAssignmentResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentRoleAssignmentResponse>>
      createIncidentRoleAssignmentWithHttpInfoAsync(IncidentRoleAssignmentRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createIncidentRoleAssignment";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentRoleAssignmentResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<IncidentRoleAssignmentResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling createIncidentRoleAssignment"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/incidents/role_assignments";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.createIncidentRoleAssignment",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentRoleAssignmentResponse>> result =
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
        new GenericType<IncidentRoleAssignmentResponse>() {});
  }

  /**
   * Create a Statuspage incident for an incident.
   *
   * <p>See {@link #createIncidentStatuspageIncidentWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param body (required)
   * @return IncidentStatuspageIncidentResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentStatuspageIncidentResponse createIncidentStatuspageIncident(
      String incidentId, IncidentStatuspageIncidentRequest body) throws ApiException {
    return createIncidentStatuspageIncidentWithHttpInfo(incidentId, body).getData();
  }

  /**
   * Create a Statuspage incident for an incident.
   *
   * <p>See {@link #createIncidentStatuspageIncidentWithHttpInfoAsync}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param body (required)
   * @return CompletableFuture&lt;IncidentStatuspageIncidentResponse&gt;
   */
  public CompletableFuture<IncidentStatuspageIncidentResponse>
      createIncidentStatuspageIncidentAsync(
          String incidentId, IncidentStatuspageIncidentRequest body) {
    return createIncidentStatuspageIncidentWithHttpInfoAsync(incidentId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a Statuspage incident linked to a Datadog incident.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param body (required)
   * @return ApiResponse&lt;IncidentStatuspageIncidentResponse&gt;
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
  public ApiResponse<IncidentStatuspageIncidentResponse>
      createIncidentStatuspageIncidentWithHttpInfo(
          String incidentId, IncidentStatuspageIncidentRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createIncidentStatuspageIncident";
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
              + " createIncidentStatuspageIncident");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'body' when calling createIncidentStatuspageIncident");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/statuspage/{incident_id}/statuspage-incidents"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.createIncidentStatuspageIncident",
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
        new GenericType<IncidentStatuspageIncidentResponse>() {});
  }

  /**
   * Create a Statuspage incident for an incident.
   *
   * <p>See {@link #createIncidentStatuspageIncidentWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentStatuspageIncidentResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentStatuspageIncidentResponse>>
      createIncidentStatuspageIncidentWithHttpInfoAsync(
          String incidentId, IncidentStatuspageIncidentRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createIncidentStatuspageIncident";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentStatuspageIncidentResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      CompletableFuture<ApiResponse<IncidentStatuspageIncidentResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'incidentId' when calling"
                  + " createIncidentStatuspageIncident"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<IncidentStatuspageIncidentResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " createIncidentStatuspageIncident"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/statuspage/{incident_id}/statuspage-incidents"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.createIncidentStatuspageIncident",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentStatuspageIncidentResponse>> result =
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
        new GenericType<IncidentStatuspageIncidentResponse>() {});
  }

  /** Manage optional parameters to createIncidentStatusPageNotice. */
  public static class CreateIncidentStatusPageNoticeOptionalParameters {
    private Boolean notifySubscribers;

    /**
     * Set notifySubscribers.
     *
     * @param notifySubscribers Whether to notify subscribers about this notice. (optional)
     * @return CreateIncidentStatusPageNoticeOptionalParameters
     */
    public CreateIncidentStatusPageNoticeOptionalParameters notifySubscribers(
        Boolean notifySubscribers) {
      this.notifySubscribers = notifySubscribers;
      return this;
    }
  }

  /**
   * Publish an incident status page notice.
   *
   * <p>See {@link #createIncidentStatusPageNoticeWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param statuspageId The ID of the status page. (required)
   * @param body (required)
   * @return IncidentStatusPageNoticeIntegrationResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentStatusPageNoticeIntegrationResponse createIncidentStatusPageNotice(
      String incidentId, UUID statuspageId, IncidentStatusPageNoticeCreateRequest body)
      throws ApiException {
    return createIncidentStatusPageNoticeWithHttpInfo(
            incidentId, statuspageId, body, new CreateIncidentStatusPageNoticeOptionalParameters())
        .getData();
  }

  /**
   * Publish an incident status page notice.
   *
   * <p>See {@link #createIncidentStatusPageNoticeWithHttpInfoAsync}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param statuspageId The ID of the status page. (required)
   * @param body (required)
   * @return CompletableFuture&lt;IncidentStatusPageNoticeIntegrationResponse&gt;
   */
  public CompletableFuture<IncidentStatusPageNoticeIntegrationResponse>
      createIncidentStatusPageNoticeAsync(
          String incidentId, UUID statuspageId, IncidentStatusPageNoticeCreateRequest body) {
    return createIncidentStatusPageNoticeWithHttpInfoAsync(
            incidentId, statuspageId, body, new CreateIncidentStatusPageNoticeOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Publish an incident status page notice.
   *
   * <p>See {@link #createIncidentStatusPageNoticeWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param statuspageId The ID of the status page. (required)
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return IncidentStatusPageNoticeIntegrationResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentStatusPageNoticeIntegrationResponse createIncidentStatusPageNotice(
      String incidentId,
      UUID statuspageId,
      IncidentStatusPageNoticeCreateRequest body,
      CreateIncidentStatusPageNoticeOptionalParameters parameters)
      throws ApiException {
    return createIncidentStatusPageNoticeWithHttpInfo(incidentId, statuspageId, body, parameters)
        .getData();
  }

  /**
   * Publish an incident status page notice.
   *
   * <p>See {@link #createIncidentStatusPageNoticeWithHttpInfoAsync}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param statuspageId The ID of the status page. (required)
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;IncidentStatusPageNoticeIntegrationResponse&gt;
   */
  public CompletableFuture<IncidentStatusPageNoticeIntegrationResponse>
      createIncidentStatusPageNoticeAsync(
          String incidentId,
          UUID statuspageId,
          IncidentStatusPageNoticeCreateRequest body,
          CreateIncidentStatusPageNoticeOptionalParameters parameters) {
    return createIncidentStatusPageNoticeWithHttpInfoAsync(
            incidentId, statuspageId, body, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Publish a status page notice for a given incident.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param statuspageId The ID of the status page. (required)
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;IncidentStatusPageNoticeIntegrationResponse&gt;
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
  public ApiResponse<IncidentStatusPageNoticeIntegrationResponse>
      createIncidentStatusPageNoticeWithHttpInfo(
          String incidentId,
          UUID statuspageId,
          IncidentStatusPageNoticeCreateRequest body,
          CreateIncidentStatusPageNoticeOptionalParameters parameters)
          throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createIncidentStatusPageNotice";
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
              + " createIncidentStatusPageNotice");
    }

    // verify the required parameter 'statuspageId' is set
    if (statuspageId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'statuspageId' when calling"
              + " createIncidentStatusPageNotice");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createIncidentStatusPageNotice");
    }
    Boolean notifySubscribers = parameters.notifySubscribers;
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/statuspages/{statuspage_id}/notices"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()))
            .replaceAll(
                "\\{" + "statuspage_id" + "\\}", apiClient.escapeString(statuspageId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "notify_subscribers", notifySubscribers));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.createIncidentStatusPageNotice",
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
        new GenericType<IncidentStatusPageNoticeIntegrationResponse>() {});
  }

  /**
   * Publish an incident status page notice.
   *
   * <p>See {@link #createIncidentStatusPageNoticeWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param statuspageId The ID of the status page. (required)
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentStatusPageNoticeIntegrationResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentStatusPageNoticeIntegrationResponse>>
      createIncidentStatusPageNoticeWithHttpInfoAsync(
          String incidentId,
          UUID statuspageId,
          IncidentStatusPageNoticeCreateRequest body,
          CreateIncidentStatusPageNoticeOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "createIncidentStatusPageNotice";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentStatusPageNoticeIntegrationResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      CompletableFuture<ApiResponse<IncidentStatusPageNoticeIntegrationResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'incidentId' when calling"
                  + " createIncidentStatusPageNotice"));
      return result;
    }

    // verify the required parameter 'statuspageId' is set
    if (statuspageId == null) {
      CompletableFuture<ApiResponse<IncidentStatusPageNoticeIntegrationResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'statuspageId' when calling"
                  + " createIncidentStatusPageNotice"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<IncidentStatusPageNoticeIntegrationResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling createIncidentStatusPageNotice"));
      return result;
    }
    Boolean notifySubscribers = parameters.notifySubscribers;
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/statuspages/{statuspage_id}/notices"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()))
            .replaceAll(
                "\\{" + "statuspage_id" + "\\}", apiClient.escapeString(statuspageId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "notify_subscribers", notifySubscribers));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.createIncidentStatusPageNotice",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentStatusPageNoticeIntegrationResponse>> result =
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
        new GenericType<IncidentStatusPageNoticeIntegrationResponse>() {});
  }

  /**
   * Create an incident timeline entry.
   *
   * <p>See {@link #createIncidentTimelineEntryWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param body (required)
   * @return IncidentTimelineEntryResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentTimelineEntryResponse createIncidentTimelineEntry(
      String incidentId, IncidentTimelineEntryRequest body) throws ApiException {
    return createIncidentTimelineEntryWithHttpInfo(incidentId, body).getData();
  }

  /**
   * Create an incident timeline entry.
   *
   * <p>See {@link #createIncidentTimelineEntryWithHttpInfoAsync}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param body (required)
   * @return CompletableFuture&lt;IncidentTimelineEntryResponse&gt;
   */
  public CompletableFuture<IncidentTimelineEntryResponse> createIncidentTimelineEntryAsync(
      String incidentId, IncidentTimelineEntryRequest body) {
    return createIncidentTimelineEntryWithHttpInfoAsync(incidentId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a new timeline entry for a given incident.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param body (required)
   * @return ApiResponse&lt;IncidentTimelineEntryResponse&gt;
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
  public ApiResponse<IncidentTimelineEntryResponse> createIncidentTimelineEntryWithHttpInfo(
      String incidentId, IncidentTimelineEntryRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createIncidentTimelineEntry";
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
          "Missing the required parameter 'incidentId' when calling createIncidentTimelineEntry");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createIncidentTimelineEntry");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/timeline"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.createIncidentTimelineEntry",
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
        new GenericType<IncidentTimelineEntryResponse>() {});
  }

  /**
   * Create an incident timeline entry.
   *
   * <p>See {@link #createIncidentTimelineEntryWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentTimelineEntryResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentTimelineEntryResponse>>
      createIncidentTimelineEntryWithHttpInfoAsync(
          String incidentId, IncidentTimelineEntryRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createIncidentTimelineEntry";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentTimelineEntryResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      CompletableFuture<ApiResponse<IncidentTimelineEntryResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'incidentId' when calling"
                  + " createIncidentTimelineEntry"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<IncidentTimelineEntryResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling createIncidentTimelineEntry"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/timeline"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.createIncidentTimelineEntry",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentTimelineEntryResponse>> result =
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
        new GenericType<IncidentTimelineEntryResponse>() {});
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

  /** Manage optional parameters to createIncidentZoomConfiguration. */
  public static class CreateIncidentZoomConfigurationOptionalParameters {
    private String include;

    /**
     * Set include.
     *
     * @param include Specifies which related objects to include in the response. (optional)
     * @return CreateIncidentZoomConfigurationOptionalParameters
     */
    public CreateIncidentZoomConfigurationOptionalParameters include(String include) {
      this.include = include;
      return this;
    }
  }

  /**
   * Create an incident Zoom configuration.
   *
   * <p>See {@link #createIncidentZoomConfigurationWithHttpInfo}.
   *
   * @param body (required)
   * @return IncidentZoomConfigurationResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentZoomConfigurationResponse createIncidentZoomConfiguration(
      IncidentZoomConfigurationRequest body) throws ApiException {
    return createIncidentZoomConfigurationWithHttpInfo(
            body, new CreateIncidentZoomConfigurationOptionalParameters())
        .getData();
  }

  /**
   * Create an incident Zoom configuration.
   *
   * <p>See {@link #createIncidentZoomConfigurationWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;IncidentZoomConfigurationResponse&gt;
   */
  public CompletableFuture<IncidentZoomConfigurationResponse> createIncidentZoomConfigurationAsync(
      IncidentZoomConfigurationRequest body) {
    return createIncidentZoomConfigurationWithHttpInfoAsync(
            body, new CreateIncidentZoomConfigurationOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create an incident Zoom configuration.
   *
   * <p>See {@link #createIncidentZoomConfigurationWithHttpInfo}.
   *
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return IncidentZoomConfigurationResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentZoomConfigurationResponse createIncidentZoomConfiguration(
      IncidentZoomConfigurationRequest body,
      CreateIncidentZoomConfigurationOptionalParameters parameters)
      throws ApiException {
    return createIncidentZoomConfigurationWithHttpInfo(body, parameters).getData();
  }

  /**
   * Create an incident Zoom configuration.
   *
   * <p>See {@link #createIncidentZoomConfigurationWithHttpInfoAsync}.
   *
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;IncidentZoomConfigurationResponse&gt;
   */
  public CompletableFuture<IncidentZoomConfigurationResponse> createIncidentZoomConfigurationAsync(
      IncidentZoomConfigurationRequest body,
      CreateIncidentZoomConfigurationOptionalParameters parameters) {
    return createIncidentZoomConfigurationWithHttpInfoAsync(body, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a Zoom configuration for incidents.
   *
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;IncidentZoomConfigurationResponse&gt;
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
  public ApiResponse<IncidentZoomConfigurationResponse> createIncidentZoomConfigurationWithHttpInfo(
      IncidentZoomConfigurationRequest body,
      CreateIncidentZoomConfigurationOptionalParameters parameters)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createIncidentZoomConfiguration";
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
          "Missing the required parameter 'body' when calling createIncidentZoomConfiguration");
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath = "/api/v2/incidents/config/zoom-configurations";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.createIncidentZoomConfiguration",
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
        new GenericType<IncidentZoomConfigurationResponse>() {});
  }

  /**
   * Create an incident Zoom configuration.
   *
   * <p>See {@link #createIncidentZoomConfigurationWithHttpInfo}.
   *
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentZoomConfigurationResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentZoomConfigurationResponse>>
      createIncidentZoomConfigurationWithHttpInfoAsync(
          IncidentZoomConfigurationRequest body,
          CreateIncidentZoomConfigurationOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "createIncidentZoomConfiguration";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentZoomConfigurationResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<IncidentZoomConfigurationResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " createIncidentZoomConfiguration"));
      return result;
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath = "/api/v2/incidents/config/zoom-configurations";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.createIncidentZoomConfiguration",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentZoomConfigurationResponse>> result =
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
        new GenericType<IncidentZoomConfigurationResponse>() {});
  }

  /**
   * Create an incident Zoom meeting.
   *
   * <p>See {@link #createIncidentZoomMeetingWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param body (required)
   * @return IncidentZoomIntegrationResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentZoomIntegrationResponse createIncidentZoomMeeting(
      String incidentId, IncidentCreateZoomMeetingRequest body) throws ApiException {
    return createIncidentZoomMeetingWithHttpInfo(incidentId, body).getData();
  }

  /**
   * Create an incident Zoom meeting.
   *
   * <p>See {@link #createIncidentZoomMeetingWithHttpInfoAsync}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param body (required)
   * @return CompletableFuture&lt;IncidentZoomIntegrationResponse&gt;
   */
  public CompletableFuture<IncidentZoomIntegrationResponse> createIncidentZoomMeetingAsync(
      String incidentId, IncidentCreateZoomMeetingRequest body) {
    return createIncidentZoomMeetingWithHttpInfoAsync(incidentId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a Zoom meeting for a given incident.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param body (required)
   * @return ApiResponse&lt;IncidentZoomIntegrationResponse&gt;
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
  public ApiResponse<IncidentZoomIntegrationResponse> createIncidentZoomMeetingWithHttpInfo(
      String incidentId, IncidentCreateZoomMeetingRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createIncidentZoomMeeting";
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
          "Missing the required parameter 'incidentId' when calling createIncidentZoomMeeting");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createIncidentZoomMeeting");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/zoom/meeting"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.createIncidentZoomMeeting",
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
        new GenericType<IncidentZoomIntegrationResponse>() {});
  }

  /**
   * Create an incident Zoom meeting.
   *
   * <p>See {@link #createIncidentZoomMeetingWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentZoomIntegrationResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentZoomIntegrationResponse>>
      createIncidentZoomMeetingWithHttpInfoAsync(
          String incidentId, IncidentCreateZoomMeetingRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createIncidentZoomMeeting";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentZoomIntegrationResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      CompletableFuture<ApiResponse<IncidentZoomIntegrationResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'incidentId' when calling"
                  + " createIncidentZoomMeeting"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<IncidentZoomIntegrationResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createIncidentZoomMeeting"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/zoom/meeting"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.createIncidentZoomMeeting",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentZoomIntegrationResponse>> result =
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
        new GenericType<IncidentZoomIntegrationResponse>() {});
  }

  /**
   * Create a status page email subscription.
   *
   * <p>See {@link #createStatuspageEmailSubscriptionWithHttpInfo}.
   *
   * @param pageId The ID of the status page. (required)
   * @param body (required)
   * @return IncidentStatuspageSubscriptionResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentStatuspageSubscriptionResponse createStatuspageEmailSubscription(
      String pageId, IncidentStatuspageSubscriptionRequest body) throws ApiException {
    return createStatuspageEmailSubscriptionWithHttpInfo(pageId, body).getData();
  }

  /**
   * Create a status page email subscription.
   *
   * <p>See {@link #createStatuspageEmailSubscriptionWithHttpInfoAsync}.
   *
   * @param pageId The ID of the status page. (required)
   * @param body (required)
   * @return CompletableFuture&lt;IncidentStatuspageSubscriptionResponse&gt;
   */
  public CompletableFuture<IncidentStatuspageSubscriptionResponse>
      createStatuspageEmailSubscriptionAsync(
          String pageId, IncidentStatuspageSubscriptionRequest body) {
    return createStatuspageEmailSubscriptionWithHttpInfoAsync(pageId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create an email subscription for a status page.
   *
   * @param pageId The ID of the status page. (required)
   * @param body (required)
   * @return ApiResponse&lt;IncidentStatuspageSubscriptionResponse&gt;
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
  public ApiResponse<IncidentStatuspageSubscriptionResponse>
      createStatuspageEmailSubscriptionWithHttpInfo(
          String pageId, IncidentStatuspageSubscriptionRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createStatuspageEmailSubscription";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'pageId' is set
    if (pageId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'pageId' when calling createStatuspageEmailSubscription");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'body' when calling createStatuspageEmailSubscription");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/statuspages/{page_id}/subscriptions/email"
            .replaceAll("\\{" + "page_id" + "\\}", apiClient.escapeString(pageId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.createStatuspageEmailSubscription",
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
        new GenericType<IncidentStatuspageSubscriptionResponse>() {});
  }

  /**
   * Create a status page email subscription.
   *
   * <p>See {@link #createStatuspageEmailSubscriptionWithHttpInfo}.
   *
   * @param pageId The ID of the status page. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentStatuspageSubscriptionResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentStatuspageSubscriptionResponse>>
      createStatuspageEmailSubscriptionWithHttpInfoAsync(
          String pageId, IncidentStatuspageSubscriptionRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createStatuspageEmailSubscription";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentStatuspageSubscriptionResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'pageId' is set
    if (pageId == null) {
      CompletableFuture<ApiResponse<IncidentStatuspageSubscriptionResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'pageId' when calling"
                  + " createStatuspageEmailSubscription"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<IncidentStatuspageSubscriptionResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " createStatuspageEmailSubscription"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/statuspages/{page_id}/subscriptions/email"
            .replaceAll("\\{" + "page_id" + "\\}", apiClient.escapeString(pageId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.createStatuspageEmailSubscription",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentStatuspageSubscriptionResponse>> result =
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
        new GenericType<IncidentStatuspageSubscriptionResponse>() {});
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
   * Delete an incident communication.
   *
   * <p>See {@link #deleteIncidentCommunicationWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param communicationId The ID of the communication. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteIncidentCommunication(String incidentId, UUID communicationId)
      throws ApiException {
    deleteIncidentCommunicationWithHttpInfo(incidentId, communicationId);
  }

  /**
   * Delete an incident communication.
   *
   * <p>See {@link #deleteIncidentCommunicationWithHttpInfoAsync}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param communicationId The ID of the communication. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteIncidentCommunicationAsync(
      String incidentId, UUID communicationId) {
    return deleteIncidentCommunicationWithHttpInfoAsync(incidentId, communicationId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete a communication for a given incident.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param communicationId The ID of the communication. (required)
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
  public ApiResponse<Void> deleteIncidentCommunicationWithHttpInfo(
      String incidentId, UUID communicationId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteIncidentCommunication";
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
          "Missing the required parameter 'incidentId' when calling deleteIncidentCommunication");
    }

    // verify the required parameter 'communicationId' is set
    if (communicationId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'communicationId' when calling"
              + " deleteIncidentCommunication");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/communications/{communication_id}"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()))
            .replaceAll(
                "\\{" + "communication_id" + "\\}",
                apiClient.escapeString(communicationId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.deleteIncidentCommunication",
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
   * Delete an incident communication.
   *
   * <p>See {@link #deleteIncidentCommunicationWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param communicationId The ID of the communication. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteIncidentCommunicationWithHttpInfoAsync(
      String incidentId, UUID communicationId) {
    // Check if unstable operation is enabled
    String operationId = "deleteIncidentCommunication";
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
                  + " deleteIncidentCommunication"));
      return result;
    }

    // verify the required parameter 'communicationId' is set
    if (communicationId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'communicationId' when calling"
                  + " deleteIncidentCommunication"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/communications/{communication_id}"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()))
            .replaceAll(
                "\\{" + "communication_id" + "\\}",
                apiClient.escapeString(communicationId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.deleteIncidentCommunication",
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

  /**
   * Delete an incident Jira template.
   *
   * <p>See {@link #deleteIncidentJiraTemplateWithHttpInfo}.
   *
   * @param templateId The ID of the Jira template. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteIncidentJiraTemplate(UUID templateId) throws ApiException {
    deleteIncidentJiraTemplateWithHttpInfo(templateId);
  }

  /**
   * Delete an incident Jira template.
   *
   * <p>See {@link #deleteIncidentJiraTemplateWithHttpInfoAsync}.
   *
   * @param templateId The ID of the Jira template. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteIncidentJiraTemplateAsync(UUID templateId) {
    return deleteIncidentJiraTemplateWithHttpInfoAsync(templateId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete an incident Jira template by its identifier.
   *
   * @param templateId The ID of the Jira template. (required)
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
  public ApiResponse<Void> deleteIncidentJiraTemplateWithHttpInfo(UUID templateId)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteIncidentJiraTemplate";
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
          "Missing the required parameter 'templateId' when calling deleteIncidentJiraTemplate");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/config/jira-templates/{template_id}"
            .replaceAll(
                "\\{" + "template_id" + "\\}", apiClient.escapeString(templateId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.deleteIncidentJiraTemplate",
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
   * Delete an incident Jira template.
   *
   * <p>See {@link #deleteIncidentJiraTemplateWithHttpInfo}.
   *
   * @param templateId The ID of the Jira template. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteIncidentJiraTemplateWithHttpInfoAsync(
      UUID templateId) {
    // Check if unstable operation is enabled
    String operationId = "deleteIncidentJiraTemplate";
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
                  + " deleteIncidentJiraTemplate"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/config/jira-templates/{template_id}"
            .replaceAll(
                "\\{" + "template_id" + "\\}", apiClient.escapeString(templateId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.deleteIncidentJiraTemplate",
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
   * Delete an incident role assignment.
   *
   * <p>See {@link #deleteIncidentRoleAssignmentWithHttpInfo}.
   *
   * @param roleAssignmentId The ID of the role assignment. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteIncidentRoleAssignment(UUID roleAssignmentId) throws ApiException {
    deleteIncidentRoleAssignmentWithHttpInfo(roleAssignmentId);
  }

  /**
   * Delete an incident role assignment.
   *
   * <p>See {@link #deleteIncidentRoleAssignmentWithHttpInfoAsync}.
   *
   * @param roleAssignmentId The ID of the role assignment. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteIncidentRoleAssignmentAsync(UUID roleAssignmentId) {
    return deleteIncidentRoleAssignmentWithHttpInfoAsync(roleAssignmentId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete a role assignment by its identifier.
   *
   * @param roleAssignmentId The ID of the role assignment. (required)
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
  public ApiResponse<Void> deleteIncidentRoleAssignmentWithHttpInfo(UUID roleAssignmentId)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteIncidentRoleAssignment";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'roleAssignmentId' is set
    if (roleAssignmentId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'roleAssignmentId' when calling"
              + " deleteIncidentRoleAssignment");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/role_assignments/{role_assignment_id}"
            .replaceAll(
                "\\{" + "role_assignment_id" + "\\}",
                apiClient.escapeString(roleAssignmentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.deleteIncidentRoleAssignment",
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
   * Delete an incident role assignment.
   *
   * <p>See {@link #deleteIncidentRoleAssignmentWithHttpInfo}.
   *
   * @param roleAssignmentId The ID of the role assignment. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteIncidentRoleAssignmentWithHttpInfoAsync(
      UUID roleAssignmentId) {
    // Check if unstable operation is enabled
    String operationId = "deleteIncidentRoleAssignment";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'roleAssignmentId' is set
    if (roleAssignmentId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'roleAssignmentId' when calling"
                  + " deleteIncidentRoleAssignment"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/role_assignments/{role_assignment_id}"
            .replaceAll(
                "\\{" + "role_assignment_id" + "\\}",
                apiClient.escapeString(roleAssignmentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.deleteIncidentRoleAssignment",
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
   * Delete an incident timeline entry.
   *
   * <p>See {@link #deleteIncidentTimelineEntryWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param timelineEntryId The ID of the timeline entry. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteIncidentTimelineEntry(String incidentId, UUID timelineEntryId)
      throws ApiException {
    deleteIncidentTimelineEntryWithHttpInfo(incidentId, timelineEntryId);
  }

  /**
   * Delete an incident timeline entry.
   *
   * <p>See {@link #deleteIncidentTimelineEntryWithHttpInfoAsync}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param timelineEntryId The ID of the timeline entry. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteIncidentTimelineEntryAsync(
      String incidentId, UUID timelineEntryId) {
    return deleteIncidentTimelineEntryWithHttpInfoAsync(incidentId, timelineEntryId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete a timeline entry for a given incident.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param timelineEntryId The ID of the timeline entry. (required)
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
  public ApiResponse<Void> deleteIncidentTimelineEntryWithHttpInfo(
      String incidentId, UUID timelineEntryId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteIncidentTimelineEntry";
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
          "Missing the required parameter 'incidentId' when calling deleteIncidentTimelineEntry");
    }

    // verify the required parameter 'timelineEntryId' is set
    if (timelineEntryId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'timelineEntryId' when calling"
              + " deleteIncidentTimelineEntry");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/timeline/{timeline_entry_id}"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()))
            .replaceAll(
                "\\{" + "timeline_entry_id" + "\\}",
                apiClient.escapeString(timelineEntryId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.deleteIncidentTimelineEntry",
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
   * Delete an incident timeline entry.
   *
   * <p>See {@link #deleteIncidentTimelineEntryWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param timelineEntryId The ID of the timeline entry. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteIncidentTimelineEntryWithHttpInfoAsync(
      String incidentId, UUID timelineEntryId) {
    // Check if unstable operation is enabled
    String operationId = "deleteIncidentTimelineEntry";
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
                  + " deleteIncidentTimelineEntry"));
      return result;
    }

    // verify the required parameter 'timelineEntryId' is set
    if (timelineEntryId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'timelineEntryId' when calling"
                  + " deleteIncidentTimelineEntry"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/timeline/{timeline_entry_id}"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()))
            .replaceAll(
                "\\{" + "timeline_entry_id" + "\\}",
                apiClient.escapeString(timelineEntryId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.deleteIncidentTimelineEntry",
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
   * Export incidents.
   *
   * <p>See {@link #exportIncidentsWithHttpInfo}.
   *
   * @param body (required)
   * @return File
   * @throws ApiException if fails to make API call
   */
  public File exportIncidents(IncidentSearchIncidentsExportRequest body) throws ApiException {
    return exportIncidentsWithHttpInfo(body).getData();
  }

  /**
   * Export incidents.
   *
   * <p>See {@link #exportIncidentsWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;File&gt;
   */
  public CompletableFuture<File> exportIncidentsAsync(IncidentSearchIncidentsExportRequest body) {
    return exportIncidentsWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Export incidents matching a search query as a CSV file.
   *
   * @param body (required)
   * @return ApiResponse&lt;File&gt;
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
  public ApiResponse<File> exportIncidentsWithHttpInfo(IncidentSearchIncidentsExportRequest body)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "exportIncidents";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling exportIncidents");
    }
    // create path and map variables
    String localVarPath = "/api/v2/incidents/search-incidents/export";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.exportIncidents",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"text/csv", "application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<File>() {});
  }

  /**
   * Export incidents.
   *
   * <p>See {@link #exportIncidentsWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;File&gt;&gt;
   */
  public CompletableFuture<ApiResponse<File>> exportIncidentsWithHttpInfoAsync(
      IncidentSearchIncidentsExportRequest body) {
    // Check if unstable operation is enabled
    String operationId = "exportIncidents";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<File>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<File>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling exportIncidents"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/incidents/search-incidents/export";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.exportIncidents",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"text/csv", "application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<File>> result = new CompletableFuture<>();
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
        new GenericType<File>() {});
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

  /** Manage optional parameters to getIncidentAutomationData. */
  public static class GetIncidentAutomationDataOptionalParameters {
    private String include;

    /**
     * Set include.
     *
     * @param include Specifies which related objects to include in the response. (optional)
     * @return GetIncidentAutomationDataOptionalParameters
     */
    public GetIncidentAutomationDataOptionalParameters include(String include) {
      this.include = include;
      return this;
    }
  }

  /**
   * Get incident automation data.
   *
   * <p>See {@link #getIncidentAutomationDataWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param key The automation data key. (required)
   * @return IncidentAutomationDataResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentAutomationDataResponse getIncidentAutomationData(String incidentId, String key)
      throws ApiException {
    return getIncidentAutomationDataWithHttpInfo(
            incidentId, key, new GetIncidentAutomationDataOptionalParameters())
        .getData();
  }

  /**
   * Get incident automation data.
   *
   * <p>See {@link #getIncidentAutomationDataWithHttpInfoAsync}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param key The automation data key. (required)
   * @return CompletableFuture&lt;IncidentAutomationDataResponse&gt;
   */
  public CompletableFuture<IncidentAutomationDataResponse> getIncidentAutomationDataAsync(
      String incidentId, String key) {
    return getIncidentAutomationDataWithHttpInfoAsync(
            incidentId, key, new GetIncidentAutomationDataOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get incident automation data.
   *
   * <p>See {@link #getIncidentAutomationDataWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param key The automation data key. (required)
   * @param parameters Optional parameters for the request.
   * @return IncidentAutomationDataResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentAutomationDataResponse getIncidentAutomationData(
      String incidentId, String key, GetIncidentAutomationDataOptionalParameters parameters)
      throws ApiException {
    return getIncidentAutomationDataWithHttpInfo(incidentId, key, parameters).getData();
  }

  /**
   * Get incident automation data.
   *
   * <p>See {@link #getIncidentAutomationDataWithHttpInfoAsync}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param key The automation data key. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;IncidentAutomationDataResponse&gt;
   */
  public CompletableFuture<IncidentAutomationDataResponse> getIncidentAutomationDataAsync(
      String incidentId, String key, GetIncidentAutomationDataOptionalParameters parameters) {
    return getIncidentAutomationDataWithHttpInfoAsync(incidentId, key, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get automation data for a given incident and key.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param key The automation data key. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;IncidentAutomationDataResponse&gt;
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
  public ApiResponse<IncidentAutomationDataResponse> getIncidentAutomationDataWithHttpInfo(
      String incidentId, String key, GetIncidentAutomationDataOptionalParameters parameters)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getIncidentAutomationData";
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
          "Missing the required parameter 'incidentId' when calling getIncidentAutomationData");
    }

    // verify the required parameter 'key' is set
    if (key == null) {
      throw new ApiException(
          400, "Missing the required parameter 'key' when calling getIncidentAutomationData");
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/automation-data/{key}"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()))
            .replaceAll("\\{" + "key" + "\\}", apiClient.escapeString(key.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.getIncidentAutomationData",
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
        new GenericType<IncidentAutomationDataResponse>() {});
  }

  /**
   * Get incident automation data.
   *
   * <p>See {@link #getIncidentAutomationDataWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param key The automation data key. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentAutomationDataResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentAutomationDataResponse>>
      getIncidentAutomationDataWithHttpInfoAsync(
          String incidentId, String key, GetIncidentAutomationDataOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "getIncidentAutomationData";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentAutomationDataResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      CompletableFuture<ApiResponse<IncidentAutomationDataResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'incidentId' when calling"
                  + " getIncidentAutomationData"));
      return result;
    }

    // verify the required parameter 'key' is set
    if (key == null) {
      CompletableFuture<ApiResponse<IncidentAutomationDataResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'key' when calling getIncidentAutomationData"));
      return result;
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/automation-data/{key}"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()))
            .replaceAll("\\{" + "key" + "\\}", apiClient.escapeString(key.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.getIncidentAutomationData",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentAutomationDataResponse>> result =
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
        new GenericType<IncidentAutomationDataResponse>() {});
  }

  /**
   * Get incident case source link.
   *
   * <p>See {@link #getIncidentCaseSourceLinkWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @return IncidentCaseLinkResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentCaseLinkResponse getIncidentCaseSourceLink(String incidentId) throws ApiException {
    return getIncidentCaseSourceLinkWithHttpInfo(incidentId).getData();
  }

  /**
   * Get incident case source link.
   *
   * <p>See {@link #getIncidentCaseSourceLinkWithHttpInfoAsync}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @return CompletableFuture&lt;IncidentCaseLinkResponse&gt;
   */
  public CompletableFuture<IncidentCaseLinkResponse> getIncidentCaseSourceLinkAsync(
      String incidentId) {
    return getIncidentCaseSourceLinkWithHttpInfoAsync(incidentId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the source link for a case associated with an incident.
   *
   * @param incidentId The UUID of the incident. (required)
   * @return ApiResponse&lt;IncidentCaseLinkResponse&gt;
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
  public ApiResponse<IncidentCaseLinkResponse> getIncidentCaseSourceLinkWithHttpInfo(
      String incidentId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getIncidentCaseSourceLink";
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
          "Missing the required parameter 'incidentId' when calling getIncidentCaseSourceLink");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/cases/source-link"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.getIncidentCaseSourceLink",
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
        new GenericType<IncidentCaseLinkResponse>() {});
  }

  /**
   * Get incident case source link.
   *
   * <p>See {@link #getIncidentCaseSourceLinkWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentCaseLinkResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentCaseLinkResponse>>
      getIncidentCaseSourceLinkWithHttpInfoAsync(String incidentId) {
    // Check if unstable operation is enabled
    String operationId = "getIncidentCaseSourceLink";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentCaseLinkResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      CompletableFuture<ApiResponse<IncidentCaseLinkResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'incidentId' when calling"
                  + " getIncidentCaseSourceLink"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/cases/source-link"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.getIncidentCaseSourceLink",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentCaseLinkResponse>> result = new CompletableFuture<>();
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
        new GenericType<IncidentCaseLinkResponse>() {});
  }

  /**
   * Get an incident communication.
   *
   * <p>See {@link #getIncidentCommunicationWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param communicationId The ID of the communication. (required)
   * @return IncidentCommunicationResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentCommunicationResponse getIncidentCommunication(
      String incidentId, UUID communicationId) throws ApiException {
    return getIncidentCommunicationWithHttpInfo(incidentId, communicationId).getData();
  }

  /**
   * Get an incident communication.
   *
   * <p>See {@link #getIncidentCommunicationWithHttpInfoAsync}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param communicationId The ID of the communication. (required)
   * @return CompletableFuture&lt;IncidentCommunicationResponse&gt;
   */
  public CompletableFuture<IncidentCommunicationResponse> getIncidentCommunicationAsync(
      String incidentId, UUID communicationId) {
    return getIncidentCommunicationWithHttpInfoAsync(incidentId, communicationId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the details of a communication for a given incident.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param communicationId The ID of the communication. (required)
   * @return ApiResponse&lt;IncidentCommunicationResponse&gt;
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
  public ApiResponse<IncidentCommunicationResponse> getIncidentCommunicationWithHttpInfo(
      String incidentId, UUID communicationId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getIncidentCommunication";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'incidentId' when calling getIncidentCommunication");
    }

    // verify the required parameter 'communicationId' is set
    if (communicationId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'communicationId' when calling getIncidentCommunication");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/communications/{communication_id}"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()))
            .replaceAll(
                "\\{" + "communication_id" + "\\}",
                apiClient.escapeString(communicationId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.getIncidentCommunication",
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
        new GenericType<IncidentCommunicationResponse>() {});
  }

  /**
   * Get an incident communication.
   *
   * <p>See {@link #getIncidentCommunicationWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param communicationId The ID of the communication. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentCommunicationResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentCommunicationResponse>>
      getIncidentCommunicationWithHttpInfoAsync(String incidentId, UUID communicationId) {
    // Check if unstable operation is enabled
    String operationId = "getIncidentCommunication";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentCommunicationResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      CompletableFuture<ApiResponse<IncidentCommunicationResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'incidentId' when calling getIncidentCommunication"));
      return result;
    }

    // verify the required parameter 'communicationId' is set
    if (communicationId == null) {
      CompletableFuture<ApiResponse<IncidentCommunicationResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'communicationId' when calling"
                  + " getIncidentCommunication"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/communications/{communication_id}"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()))
            .replaceAll(
                "\\{" + "communication_id" + "\\}",
                apiClient.escapeString(communicationId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.getIncidentCommunication",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentCommunicationResponse>> result =
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
        new GenericType<IncidentCommunicationResponse>() {});
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

  /**
   * Get an incident Jira template.
   *
   * <p>See {@link #getIncidentJiraTemplateWithHttpInfo}.
   *
   * @param templateId The ID of the Jira template. (required)
   * @return IncidentJiraTemplateResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentJiraTemplateResponse getIncidentJiraTemplate(UUID templateId) throws ApiException {
    return getIncidentJiraTemplateWithHttpInfo(templateId).getData();
  }

  /**
   * Get an incident Jira template.
   *
   * <p>See {@link #getIncidentJiraTemplateWithHttpInfoAsync}.
   *
   * @param templateId The ID of the Jira template. (required)
   * @return CompletableFuture&lt;IncidentJiraTemplateResponse&gt;
   */
  public CompletableFuture<IncidentJiraTemplateResponse> getIncidentJiraTemplateAsync(
      UUID templateId) {
    return getIncidentJiraTemplateWithHttpInfoAsync(templateId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the details of an incident Jira template by its identifier.
   *
   * @param templateId The ID of the Jira template. (required)
   * @return ApiResponse&lt;IncidentJiraTemplateResponse&gt;
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
  public ApiResponse<IncidentJiraTemplateResponse> getIncidentJiraTemplateWithHttpInfo(
      UUID templateId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getIncidentJiraTemplate";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'templateId' when calling getIncidentJiraTemplate");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/config/jira-templates/{template_id}"
            .replaceAll(
                "\\{" + "template_id" + "\\}", apiClient.escapeString(templateId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.getIncidentJiraTemplate",
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
        new GenericType<IncidentJiraTemplateResponse>() {});
  }

  /**
   * Get an incident Jira template.
   *
   * <p>See {@link #getIncidentJiraTemplateWithHttpInfo}.
   *
   * @param templateId The ID of the Jira template. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentJiraTemplateResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentJiraTemplateResponse>>
      getIncidentJiraTemplateWithHttpInfoAsync(UUID templateId) {
    // Check if unstable operation is enabled
    String operationId = "getIncidentJiraTemplate";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentJiraTemplateResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      CompletableFuture<ApiResponse<IncidentJiraTemplateResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'templateId' when calling getIncidentJiraTemplate"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/config/jira-templates/{template_id}"
            .replaceAll(
                "\\{" + "template_id" + "\\}", apiClient.escapeString(templateId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.getIncidentJiraTemplate",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentJiraTemplateResponse>> result =
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
        new GenericType<IncidentJiraTemplateResponse>() {});
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
   * Get PagerDuty related incidents.
   *
   * <p>See {@link #getIncidentPagerdutyRelatedIncidentsWithHttpInfo}.
   *
   * @param pagerdutyIncidentId The PagerDuty incident identifier. (required)
   * @return IncidentPagerdutyRelatedIncidentsResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentPagerdutyRelatedIncidentsResponse getIncidentPagerdutyRelatedIncidents(
      String pagerdutyIncidentId) throws ApiException {
    return getIncidentPagerdutyRelatedIncidentsWithHttpInfo(pagerdutyIncidentId).getData();
  }

  /**
   * Get PagerDuty related incidents.
   *
   * <p>See {@link #getIncidentPagerdutyRelatedIncidentsWithHttpInfoAsync}.
   *
   * @param pagerdutyIncidentId The PagerDuty incident identifier. (required)
   * @return CompletableFuture&lt;IncidentPagerdutyRelatedIncidentsResponse&gt;
   */
  public CompletableFuture<IncidentPagerdutyRelatedIncidentsResponse>
      getIncidentPagerdutyRelatedIncidentsAsync(String pagerdutyIncidentId) {
    return getIncidentPagerdutyRelatedIncidentsWithHttpInfoAsync(pagerdutyIncidentId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the list of Datadog incidents attached to a PagerDuty incident.
   *
   * @param pagerdutyIncidentId The PagerDuty incident identifier. (required)
   * @return ApiResponse&lt;IncidentPagerdutyRelatedIncidentsResponse&gt;
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
  public ApiResponse<IncidentPagerdutyRelatedIncidentsResponse>
      getIncidentPagerdutyRelatedIncidentsWithHttpInfo(String pagerdutyIncidentId)
          throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getIncidentPagerdutyRelatedIncidents";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'pagerdutyIncidentId' is set
    if (pagerdutyIncidentId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'pagerdutyIncidentId' when calling"
              + " getIncidentPagerdutyRelatedIncidents");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/pagerduty/{pagerduty_incident_id}/relationships/incidents"
            .replaceAll(
                "\\{" + "pagerduty_incident_id" + "\\}",
                apiClient.escapeString(pagerdutyIncidentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.getIncidentPagerdutyRelatedIncidents",
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
        new GenericType<IncidentPagerdutyRelatedIncidentsResponse>() {});
  }

  /**
   * Get PagerDuty related incidents.
   *
   * <p>See {@link #getIncidentPagerdutyRelatedIncidentsWithHttpInfo}.
   *
   * @param pagerdutyIncidentId The PagerDuty incident identifier. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentPagerdutyRelatedIncidentsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentPagerdutyRelatedIncidentsResponse>>
      getIncidentPagerdutyRelatedIncidentsWithHttpInfoAsync(String pagerdutyIncidentId) {
    // Check if unstable operation is enabled
    String operationId = "getIncidentPagerdutyRelatedIncidents";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentPagerdutyRelatedIncidentsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'pagerdutyIncidentId' is set
    if (pagerdutyIncidentId == null) {
      CompletableFuture<ApiResponse<IncidentPagerdutyRelatedIncidentsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'pagerdutyIncidentId' when calling"
                  + " getIncidentPagerdutyRelatedIncidents"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/pagerduty/{pagerduty_incident_id}/relationships/incidents"
            .replaceAll(
                "\\{" + "pagerduty_incident_id" + "\\}",
                apiClient.escapeString(pagerdutyIncidentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.getIncidentPagerdutyRelatedIncidents",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentPagerdutyRelatedIncidentsResponse>> result =
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
        new GenericType<IncidentPagerdutyRelatedIncidentsResponse>() {});
  }

  /**
   * Get incident page source link.
   *
   * <p>See {@link #getIncidentPageSourceLinkWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @return IncidentCaseLinkResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentCaseLinkResponse getIncidentPageSourceLink(String incidentId) throws ApiException {
    return getIncidentPageSourceLinkWithHttpInfo(incidentId).getData();
  }

  /**
   * Get incident page source link.
   *
   * <p>See {@link #getIncidentPageSourceLinkWithHttpInfoAsync}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @return CompletableFuture&lt;IncidentCaseLinkResponse&gt;
   */
  public CompletableFuture<IncidentCaseLinkResponse> getIncidentPageSourceLinkAsync(
      String incidentId) {
    return getIncidentPageSourceLinkWithHttpInfoAsync(incidentId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the source link for a page associated with an incident.
   *
   * @param incidentId The UUID of the incident. (required)
   * @return ApiResponse&lt;IncidentCaseLinkResponse&gt;
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
  public ApiResponse<IncidentCaseLinkResponse> getIncidentPageSourceLinkWithHttpInfo(
      String incidentId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getIncidentPageSourceLink";
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
          "Missing the required parameter 'incidentId' when calling getIncidentPageSourceLink");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/pages/source-link"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.getIncidentPageSourceLink",
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
        new GenericType<IncidentCaseLinkResponse>() {});
  }

  /**
   * Get incident page source link.
   *
   * <p>See {@link #getIncidentPageSourceLinkWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentCaseLinkResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentCaseLinkResponse>>
      getIncidentPageSourceLinkWithHttpInfoAsync(String incidentId) {
    // Check if unstable operation is enabled
    String operationId = "getIncidentPageSourceLink";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentCaseLinkResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      CompletableFuture<ApiResponse<IncidentCaseLinkResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'incidentId' when calling"
                  + " getIncidentPageSourceLink"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/pages/source-link"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.getIncidentPageSourceLink",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentCaseLinkResponse>> result = new CompletableFuture<>();
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
        new GenericType<IncidentCaseLinkResponse>() {});
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
   * Get an incident reserved role.
   *
   * <p>See {@link #getIncidentReservedRoleWithHttpInfo}.
   *
   * @param roleId The ID of the reserved role. (required)
   * @return IncidentReservedRoleResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentReservedRoleResponse getIncidentReservedRole(UUID roleId) throws ApiException {
    return getIncidentReservedRoleWithHttpInfo(roleId).getData();
  }

  /**
   * Get an incident reserved role.
   *
   * <p>See {@link #getIncidentReservedRoleWithHttpInfoAsync}.
   *
   * @param roleId The ID of the reserved role. (required)
   * @return CompletableFuture&lt;IncidentReservedRoleResponse&gt;
   */
  public CompletableFuture<IncidentReservedRoleResponse> getIncidentReservedRoleAsync(UUID roleId) {
    return getIncidentReservedRoleWithHttpInfoAsync(roleId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the details of a reserved role by its identifier.
   *
   * @param roleId The ID of the reserved role. (required)
   * @return ApiResponse&lt;IncidentReservedRoleResponse&gt;
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
  public ApiResponse<IncidentReservedRoleResponse> getIncidentReservedRoleWithHttpInfo(UUID roleId)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getIncidentReservedRole";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'roleId' is set
    if (roleId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'roleId' when calling getIncidentReservedRole");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/config/reserved-roles/{role_id}"
            .replaceAll("\\{" + "role_id" + "\\}", apiClient.escapeString(roleId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.getIncidentReservedRole",
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
        new GenericType<IncidentReservedRoleResponse>() {});
  }

  /**
   * Get an incident reserved role.
   *
   * <p>See {@link #getIncidentReservedRoleWithHttpInfo}.
   *
   * @param roleId The ID of the reserved role. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentReservedRoleResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentReservedRoleResponse>>
      getIncidentReservedRoleWithHttpInfoAsync(UUID roleId) {
    // Check if unstable operation is enabled
    String operationId = "getIncidentReservedRole";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentReservedRoleResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'roleId' is set
    if (roleId == null) {
      CompletableFuture<ApiResponse<IncidentReservedRoleResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'roleId' when calling getIncidentReservedRole"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/config/reserved-roles/{role_id}"
            .replaceAll("\\{" + "role_id" + "\\}", apiClient.escapeString(roleId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.getIncidentReservedRole",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentReservedRoleResponse>> result =
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
        new GenericType<IncidentReservedRoleResponse>() {});
  }

  /**
   * Get an incident role assignment.
   *
   * <p>See {@link #getIncidentRoleAssignmentWithHttpInfo}.
   *
   * @param roleAssignmentId The ID of the role assignment. (required)
   * @return IncidentRoleAssignmentResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentRoleAssignmentResponse getIncidentRoleAssignment(UUID roleAssignmentId)
      throws ApiException {
    return getIncidentRoleAssignmentWithHttpInfo(roleAssignmentId).getData();
  }

  /**
   * Get an incident role assignment.
   *
   * <p>See {@link #getIncidentRoleAssignmentWithHttpInfoAsync}.
   *
   * @param roleAssignmentId The ID of the role assignment. (required)
   * @return CompletableFuture&lt;IncidentRoleAssignmentResponse&gt;
   */
  public CompletableFuture<IncidentRoleAssignmentResponse> getIncidentRoleAssignmentAsync(
      UUID roleAssignmentId) {
    return getIncidentRoleAssignmentWithHttpInfoAsync(roleAssignmentId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the details of a role assignment by its identifier.
   *
   * @param roleAssignmentId The ID of the role assignment. (required)
   * @return ApiResponse&lt;IncidentRoleAssignmentResponse&gt;
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
  public ApiResponse<IncidentRoleAssignmentResponse> getIncidentRoleAssignmentWithHttpInfo(
      UUID roleAssignmentId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getIncidentRoleAssignment";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'roleAssignmentId' is set
    if (roleAssignmentId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'roleAssignmentId' when calling"
              + " getIncidentRoleAssignment");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/role_assignments/{role_assignment_id}"
            .replaceAll(
                "\\{" + "role_assignment_id" + "\\}",
                apiClient.escapeString(roleAssignmentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.getIncidentRoleAssignment",
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
        new GenericType<IncidentRoleAssignmentResponse>() {});
  }

  /**
   * Get an incident role assignment.
   *
   * <p>See {@link #getIncidentRoleAssignmentWithHttpInfo}.
   *
   * @param roleAssignmentId The ID of the role assignment. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentRoleAssignmentResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentRoleAssignmentResponse>>
      getIncidentRoleAssignmentWithHttpInfoAsync(UUID roleAssignmentId) {
    // Check if unstable operation is enabled
    String operationId = "getIncidentRoleAssignment";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentRoleAssignmentResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'roleAssignmentId' is set
    if (roleAssignmentId == null) {
      CompletableFuture<ApiResponse<IncidentRoleAssignmentResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'roleAssignmentId' when calling"
                  + " getIncidentRoleAssignment"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/role_assignments/{role_assignment_id}"
            .replaceAll(
                "\\{" + "role_assignment_id" + "\\}",
                apiClient.escapeString(roleAssignmentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.getIncidentRoleAssignment",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentRoleAssignmentResponse>> result =
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
        new GenericType<IncidentRoleAssignmentResponse>() {});
  }

  /**
   * Get incident status page suggestion.
   *
   * <p>See {@link #getIncidentStatusPagesSuggestionWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @return IncidentStatusPagesSuggestionResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentStatusPagesSuggestionResponse getIncidentStatusPagesSuggestion(String incidentId)
      throws ApiException {
    return getIncidentStatusPagesSuggestionWithHttpInfo(incidentId).getData();
  }

  /**
   * Get incident status page suggestion.
   *
   * <p>See {@link #getIncidentStatusPagesSuggestionWithHttpInfoAsync}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @return CompletableFuture&lt;IncidentStatusPagesSuggestionResponse&gt;
   */
  public CompletableFuture<IncidentStatusPagesSuggestionResponse>
      getIncidentStatusPagesSuggestionAsync(String incidentId) {
    return getIncidentStatusPagesSuggestionWithHttpInfoAsync(incidentId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get an AI-generated suggestion for a status page notice for a given incident.
   *
   * @param incidentId The UUID of the incident. (required)
   * @return ApiResponse&lt;IncidentStatusPagesSuggestionResponse&gt;
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
  public ApiResponse<IncidentStatusPagesSuggestionResponse>
      getIncidentStatusPagesSuggestionWithHttpInfo(String incidentId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getIncidentStatusPagesSuggestion";
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
          "Missing the required parameter 'incidentId' when calling"
              + " getIncidentStatusPagesSuggestion");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/statuspages-suggestion"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.getIncidentStatusPagesSuggestion",
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
        new GenericType<IncidentStatusPagesSuggestionResponse>() {});
  }

  /**
   * Get incident status page suggestion.
   *
   * <p>See {@link #getIncidentStatusPagesSuggestionWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentStatusPagesSuggestionResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentStatusPagesSuggestionResponse>>
      getIncidentStatusPagesSuggestionWithHttpInfoAsync(String incidentId) {
    // Check if unstable operation is enabled
    String operationId = "getIncidentStatusPagesSuggestion";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentStatusPagesSuggestionResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      CompletableFuture<ApiResponse<IncidentStatusPagesSuggestionResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'incidentId' when calling"
                  + " getIncidentStatusPagesSuggestion"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/statuspages-suggestion"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.getIncidentStatusPagesSuggestion",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentStatusPagesSuggestionResponse>> result =
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
        new GenericType<IncidentStatusPagesSuggestionResponse>() {});
  }

  /**
   * Get incident timeline entry thread.
   *
   * <p>See {@link #getIncidentTimelineEntryThreadWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param timelineEntryId The ID of the timeline entry. (required)
   * @return IncidentTimelineThreadResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentTimelineThreadResponse getIncidentTimelineEntryThread(
      String incidentId, UUID timelineEntryId) throws ApiException {
    return getIncidentTimelineEntryThreadWithHttpInfo(incidentId, timelineEntryId).getData();
  }

  /**
   * Get incident timeline entry thread.
   *
   * <p>See {@link #getIncidentTimelineEntryThreadWithHttpInfoAsync}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param timelineEntryId The ID of the timeline entry. (required)
   * @return CompletableFuture&lt;IncidentTimelineThreadResponse&gt;
   */
  public CompletableFuture<IncidentTimelineThreadResponse> getIncidentTimelineEntryThreadAsync(
      String incidentId, UUID timelineEntryId) {
    return getIncidentTimelineEntryThreadWithHttpInfoAsync(incidentId, timelineEntryId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the thread entries for a given timeline entry.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param timelineEntryId The ID of the timeline entry. (required)
   * @return ApiResponse&lt;IncidentTimelineThreadResponse&gt;
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
  public ApiResponse<IncidentTimelineThreadResponse> getIncidentTimelineEntryThreadWithHttpInfo(
      String incidentId, UUID timelineEntryId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getIncidentTimelineEntryThread";
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
          "Missing the required parameter 'incidentId' when calling"
              + " getIncidentTimelineEntryThread");
    }

    // verify the required parameter 'timelineEntryId' is set
    if (timelineEntryId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'timelineEntryId' when calling"
              + " getIncidentTimelineEntryThread");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/timeline/{timeline_entry_id}/thread"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()))
            .replaceAll(
                "\\{" + "timeline_entry_id" + "\\}",
                apiClient.escapeString(timelineEntryId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.getIncidentTimelineEntryThread",
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
        new GenericType<IncidentTimelineThreadResponse>() {});
  }

  /**
   * Get incident timeline entry thread.
   *
   * <p>See {@link #getIncidentTimelineEntryThreadWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param timelineEntryId The ID of the timeline entry. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentTimelineThreadResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentTimelineThreadResponse>>
      getIncidentTimelineEntryThreadWithHttpInfoAsync(String incidentId, UUID timelineEntryId) {
    // Check if unstable operation is enabled
    String operationId = "getIncidentTimelineEntryThread";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentTimelineThreadResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      CompletableFuture<ApiResponse<IncidentTimelineThreadResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'incidentId' when calling"
                  + " getIncidentTimelineEntryThread"));
      return result;
    }

    // verify the required parameter 'timelineEntryId' is set
    if (timelineEntryId == null) {
      CompletableFuture<ApiResponse<IncidentTimelineThreadResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'timelineEntryId' when calling"
                  + " getIncidentTimelineEntryThread"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/timeline/{timeline_entry_id}/thread"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()))
            .replaceAll(
                "\\{" + "timeline_entry_id" + "\\}",
                apiClient.escapeString(timelineEntryId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.getIncidentTimelineEntryThread",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentTimelineThreadResponse>> result =
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
        new GenericType<IncidentTimelineThreadResponse>() {});
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

  /**
   * Get status page subscription preferences.
   *
   * <p>See {@link #getStatuspageSubscriptionPreferencesWithHttpInfo}.
   *
   * @return IncidentStatuspagePreferencesResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentStatuspagePreferencesResponse getStatuspageSubscriptionPreferences()
      throws ApiException {
    return getStatuspageSubscriptionPreferencesWithHttpInfo().getData();
  }

  /**
   * Get status page subscription preferences.
   *
   * <p>See {@link #getStatuspageSubscriptionPreferencesWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;IncidentStatuspagePreferencesResponse&gt;
   */
  public CompletableFuture<IncidentStatuspagePreferencesResponse>
      getStatuspageSubscriptionPreferencesAsync() {
    return getStatuspageSubscriptionPreferencesWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the subscription preferences for the current user.
   *
   * @return ApiResponse&lt;IncidentStatuspagePreferencesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<IncidentStatuspagePreferencesResponse>
      getStatuspageSubscriptionPreferencesWithHttpInfo() throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getStatuspageSubscriptionPreferences";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/statuspages/subscription/preferences";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.getStatuspageSubscriptionPreferences",
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
        new GenericType<IncidentStatuspagePreferencesResponse>() {});
  }

  /**
   * Get status page subscription preferences.
   *
   * <p>See {@link #getStatuspageSubscriptionPreferencesWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentStatuspagePreferencesResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentStatuspagePreferencesResponse>>
      getStatuspageSubscriptionPreferencesWithHttpInfoAsync() {
    // Check if unstable operation is enabled
    String operationId = "getStatuspageSubscriptionPreferences";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentStatuspagePreferencesResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/statuspages/subscription/preferences";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.getStatuspageSubscriptionPreferences",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentStatuspagePreferencesResponse>> result =
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
        new GenericType<IncidentStatuspagePreferencesResponse>() {});
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

  /** Manage optional parameters to listIncidentCommunications. */
  public static class ListIncidentCommunicationsOptionalParameters {
    private String filterCommunicationType;

    /**
     * Set filterCommunicationType.
     *
     * @param filterCommunicationType Filter by communication type. (optional)
     * @return ListIncidentCommunicationsOptionalParameters
     */
    public ListIncidentCommunicationsOptionalParameters filterCommunicationType(
        String filterCommunicationType) {
      this.filterCommunicationType = filterCommunicationType;
      return this;
    }
  }

  /**
   * List incident communications.
   *
   * <p>See {@link #listIncidentCommunicationsWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @return IncidentCommunicationsResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentCommunicationsResponse listIncidentCommunications(String incidentId)
      throws ApiException {
    return listIncidentCommunicationsWithHttpInfo(
            incidentId, new ListIncidentCommunicationsOptionalParameters())
        .getData();
  }

  /**
   * List incident communications.
   *
   * <p>See {@link #listIncidentCommunicationsWithHttpInfoAsync}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @return CompletableFuture&lt;IncidentCommunicationsResponse&gt;
   */
  public CompletableFuture<IncidentCommunicationsResponse> listIncidentCommunicationsAsync(
      String incidentId) {
    return listIncidentCommunicationsWithHttpInfoAsync(
            incidentId, new ListIncidentCommunicationsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List incident communications.
   *
   * <p>See {@link #listIncidentCommunicationsWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param parameters Optional parameters for the request.
   * @return IncidentCommunicationsResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentCommunicationsResponse listIncidentCommunications(
      String incidentId, ListIncidentCommunicationsOptionalParameters parameters)
      throws ApiException {
    return listIncidentCommunicationsWithHttpInfo(incidentId, parameters).getData();
  }

  /**
   * List incident communications.
   *
   * <p>See {@link #listIncidentCommunicationsWithHttpInfoAsync}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;IncidentCommunicationsResponse&gt;
   */
  public CompletableFuture<IncidentCommunicationsResponse> listIncidentCommunicationsAsync(
      String incidentId, ListIncidentCommunicationsOptionalParameters parameters) {
    return listIncidentCommunicationsWithHttpInfoAsync(incidentId, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List all communications for a given incident.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;IncidentCommunicationsResponse&gt;
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
  public ApiResponse<IncidentCommunicationsResponse> listIncidentCommunicationsWithHttpInfo(
      String incidentId, ListIncidentCommunicationsOptionalParameters parameters)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listIncidentCommunications";
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
          "Missing the required parameter 'incidentId' when calling listIncidentCommunications");
    }
    String filterCommunicationType = parameters.filterCommunicationType;
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/communications"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[communication_type]", filterCommunicationType));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.listIncidentCommunications",
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
        new GenericType<IncidentCommunicationsResponse>() {});
  }

  /**
   * List incident communications.
   *
   * <p>See {@link #listIncidentCommunicationsWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentCommunicationsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentCommunicationsResponse>>
      listIncidentCommunicationsWithHttpInfoAsync(
          String incidentId, ListIncidentCommunicationsOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listIncidentCommunications";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentCommunicationsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      CompletableFuture<ApiResponse<IncidentCommunicationsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'incidentId' when calling"
                  + " listIncidentCommunications"));
      return result;
    }
    String filterCommunicationType = parameters.filterCommunicationType;
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/communications"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[communication_type]", filterCommunicationType));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.listIncidentCommunications",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentCommunicationsResponse>> result =
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
        new GenericType<IncidentCommunicationsResponse>() {});
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

  /** Manage optional parameters to listIncidentJiraTemplates. */
  public static class ListIncidentJiraTemplatesOptionalParameters {
    private Boolean isDefault;
    private UUID incidentTypeId;
    private String templateType;

    /**
     * Set isDefault.
     *
     * @param isDefault Filter templates by default status. (optional)
     * @return ListIncidentJiraTemplatesOptionalParameters
     */
    public ListIncidentJiraTemplatesOptionalParameters isDefault(Boolean isDefault) {
      this.isDefault = isDefault;
      return this;
    }

    /**
     * Set incidentTypeId.
     *
     * @param incidentTypeId Filter templates by incident type identifier. (optional)
     * @return ListIncidentJiraTemplatesOptionalParameters
     */
    public ListIncidentJiraTemplatesOptionalParameters incidentTypeId(UUID incidentTypeId) {
      this.incidentTypeId = incidentTypeId;
      return this;
    }

    /**
     * Set templateType.
     *
     * @param templateType Filter templates by type. (optional)
     * @return ListIncidentJiraTemplatesOptionalParameters
     */
    public ListIncidentJiraTemplatesOptionalParameters templateType(String templateType) {
      this.templateType = templateType;
      return this;
    }
  }

  /**
   * List incident Jira templates.
   *
   * <p>See {@link #listIncidentJiraTemplatesWithHttpInfo}.
   *
   * @return IncidentJiraTemplatesResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentJiraTemplatesResponse listIncidentJiraTemplates() throws ApiException {
    return listIncidentJiraTemplatesWithHttpInfo(new ListIncidentJiraTemplatesOptionalParameters())
        .getData();
  }

  /**
   * List incident Jira templates.
   *
   * <p>See {@link #listIncidentJiraTemplatesWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;IncidentJiraTemplatesResponse&gt;
   */
  public CompletableFuture<IncidentJiraTemplatesResponse> listIncidentJiraTemplatesAsync() {
    return listIncidentJiraTemplatesWithHttpInfoAsync(
            new ListIncidentJiraTemplatesOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List incident Jira templates.
   *
   * <p>See {@link #listIncidentJiraTemplatesWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return IncidentJiraTemplatesResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentJiraTemplatesResponse listIncidentJiraTemplates(
      ListIncidentJiraTemplatesOptionalParameters parameters) throws ApiException {
    return listIncidentJiraTemplatesWithHttpInfo(parameters).getData();
  }

  /**
   * List incident Jira templates.
   *
   * <p>See {@link #listIncidentJiraTemplatesWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;IncidentJiraTemplatesResponse&gt;
   */
  public CompletableFuture<IncidentJiraTemplatesResponse> listIncidentJiraTemplatesAsync(
      ListIncidentJiraTemplatesOptionalParameters parameters) {
    return listIncidentJiraTemplatesWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List all incident Jira templates for the organization.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;IncidentJiraTemplatesResponse&gt;
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
  public ApiResponse<IncidentJiraTemplatesResponse> listIncidentJiraTemplatesWithHttpInfo(
      ListIncidentJiraTemplatesOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listIncidentJiraTemplates";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    Boolean isDefault = parameters.isDefault;
    UUID incidentTypeId = parameters.incidentTypeId;
    String templateType = parameters.templateType;
    // create path and map variables
    String localVarPath = "/api/v2/incidents/config/jira-templates";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isDefault", isDefault));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "incidentTypeId", incidentTypeId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "templateType", templateType));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.listIncidentJiraTemplates",
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
        new GenericType<IncidentJiraTemplatesResponse>() {});
  }

  /**
   * List incident Jira templates.
   *
   * <p>See {@link #listIncidentJiraTemplatesWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentJiraTemplatesResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentJiraTemplatesResponse>>
      listIncidentJiraTemplatesWithHttpInfoAsync(
          ListIncidentJiraTemplatesOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listIncidentJiraTemplates";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentJiraTemplatesResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    Boolean isDefault = parameters.isDefault;
    UUID incidentTypeId = parameters.incidentTypeId;
    String templateType = parameters.templateType;
    // create path and map variables
    String localVarPath = "/api/v2/incidents/config/jira-templates";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isDefault", isDefault));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "incidentTypeId", incidentTypeId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "templateType", templateType));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.listIncidentJiraTemplates",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentJiraTemplatesResponse>> result =
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
        new GenericType<IncidentJiraTemplatesResponse>() {});
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

  /** Manage optional parameters to listIncidentPagerdutyServices. */
  public static class ListIncidentPagerdutyServicesOptionalParameters {
    private Boolean includeUnresolved;

    /**
     * Set includeUnresolved.
     *
     * @param includeUnresolved Whether to include unresolved PagerDuty services. (optional, default
     *     to false)
     * @return ListIncidentPagerdutyServicesOptionalParameters
     */
    public ListIncidentPagerdutyServicesOptionalParameters includeUnresolved(
        Boolean includeUnresolved) {
      this.includeUnresolved = includeUnresolved;
      return this;
    }
  }

  /**
   * List PagerDuty services.
   *
   * <p>See {@link #listIncidentPagerdutyServicesWithHttpInfo}.
   *
   * @return IncidentPagerdutyServicesResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentPagerdutyServicesResponse listIncidentPagerdutyServices() throws ApiException {
    return listIncidentPagerdutyServicesWithHttpInfo(
            new ListIncidentPagerdutyServicesOptionalParameters())
        .getData();
  }

  /**
   * List PagerDuty services.
   *
   * <p>See {@link #listIncidentPagerdutyServicesWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;IncidentPagerdutyServicesResponse&gt;
   */
  public CompletableFuture<IncidentPagerdutyServicesResponse> listIncidentPagerdutyServicesAsync() {
    return listIncidentPagerdutyServicesWithHttpInfoAsync(
            new ListIncidentPagerdutyServicesOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List PagerDuty services.
   *
   * <p>See {@link #listIncidentPagerdutyServicesWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return IncidentPagerdutyServicesResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentPagerdutyServicesResponse listIncidentPagerdutyServices(
      ListIncidentPagerdutyServicesOptionalParameters parameters) throws ApiException {
    return listIncidentPagerdutyServicesWithHttpInfo(parameters).getData();
  }

  /**
   * List PagerDuty services.
   *
   * <p>See {@link #listIncidentPagerdutyServicesWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;IncidentPagerdutyServicesResponse&gt;
   */
  public CompletableFuture<IncidentPagerdutyServicesResponse> listIncidentPagerdutyServicesAsync(
      ListIncidentPagerdutyServicesOptionalParameters parameters) {
    return listIncidentPagerdutyServicesWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List all PagerDuty services configured for the organization.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;IncidentPagerdutyServicesResponse&gt;
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
  public ApiResponse<IncidentPagerdutyServicesResponse> listIncidentPagerdutyServicesWithHttpInfo(
      ListIncidentPagerdutyServicesOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listIncidentPagerdutyServices";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    Boolean includeUnresolved = parameters.includeUnresolved;
    // create path and map variables
    String localVarPath = "/api/v2/incidents/pagerduty/services";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "include_unresolved", includeUnresolved));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.listIncidentPagerdutyServices",
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
        new GenericType<IncidentPagerdutyServicesResponse>() {});
  }

  /**
   * List PagerDuty services.
   *
   * <p>See {@link #listIncidentPagerdutyServicesWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentPagerdutyServicesResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentPagerdutyServicesResponse>>
      listIncidentPagerdutyServicesWithHttpInfoAsync(
          ListIncidentPagerdutyServicesOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listIncidentPagerdutyServices";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentPagerdutyServicesResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    Boolean includeUnresolved = parameters.includeUnresolved;
    // create path and map variables
    String localVarPath = "/api/v2/incidents/pagerduty/services";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "include_unresolved", includeUnresolved));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.listIncidentPagerdutyServices",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentPagerdutyServicesResponse>> result =
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
        new GenericType<IncidentPagerdutyServicesResponse>() {});
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
   * List incident reserved roles.
   *
   * <p>See {@link #listIncidentReservedRolesWithHttpInfo}.
   *
   * @return IncidentReservedRolesResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentReservedRolesResponse listIncidentReservedRoles() throws ApiException {
    return listIncidentReservedRolesWithHttpInfo().getData();
  }

  /**
   * List incident reserved roles.
   *
   * <p>See {@link #listIncidentReservedRolesWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;IncidentReservedRolesResponse&gt;
   */
  public CompletableFuture<IncidentReservedRolesResponse> listIncidentReservedRolesAsync() {
    return listIncidentReservedRolesWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List all reserved roles for incidents.
   *
   * @return ApiResponse&lt;IncidentReservedRolesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<IncidentReservedRolesResponse> listIncidentReservedRolesWithHttpInfo()
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listIncidentReservedRoles";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/incidents/config/reserved-roles";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.listIncidentReservedRoles",
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
        new GenericType<IncidentReservedRolesResponse>() {});
  }

  /**
   * List incident reserved roles.
   *
   * <p>See {@link #listIncidentReservedRolesWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentReservedRolesResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentReservedRolesResponse>>
      listIncidentReservedRolesWithHttpInfoAsync() {
    // Check if unstable operation is enabled
    String operationId = "listIncidentReservedRoles";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentReservedRolesResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/incidents/config/reserved-roles";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.listIncidentReservedRoles",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentReservedRolesResponse>> result =
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
        new GenericType<IncidentReservedRolesResponse>() {});
  }

  /**
   * List incident rule execution states.
   *
   * <p>See {@link #listIncidentRuleExecutionStatesWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @return IncidentRuleExecutionStatesResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentRuleExecutionStatesResponse listIncidentRuleExecutionStates(String incidentId)
      throws ApiException {
    return listIncidentRuleExecutionStatesWithHttpInfo(incidentId).getData();
  }

  /**
   * List incident rule execution states.
   *
   * <p>See {@link #listIncidentRuleExecutionStatesWithHttpInfoAsync}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @return CompletableFuture&lt;IncidentRuleExecutionStatesResponse&gt;
   */
  public CompletableFuture<IncidentRuleExecutionStatesResponse>
      listIncidentRuleExecutionStatesAsync(String incidentId) {
    return listIncidentRuleExecutionStatesWithHttpInfoAsync(incidentId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List all rule execution states for a given incident.
   *
   * @param incidentId The UUID of the incident. (required)
   * @return ApiResponse&lt;IncidentRuleExecutionStatesResponse&gt;
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
  public ApiResponse<IncidentRuleExecutionStatesResponse>
      listIncidentRuleExecutionStatesWithHttpInfo(String incidentId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listIncidentRuleExecutionStates";
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
          "Missing the required parameter 'incidentId' when calling"
              + " listIncidentRuleExecutionStates");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/rule-execution-states"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.listIncidentRuleExecutionStates",
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
        new GenericType<IncidentRuleExecutionStatesResponse>() {});
  }

  /**
   * List incident rule execution states.
   *
   * <p>See {@link #listIncidentRuleExecutionStatesWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentRuleExecutionStatesResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentRuleExecutionStatesResponse>>
      listIncidentRuleExecutionStatesWithHttpInfoAsync(String incidentId) {
    // Check if unstable operation is enabled
    String operationId = "listIncidentRuleExecutionStates";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentRuleExecutionStatesResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      CompletableFuture<ApiResponse<IncidentRuleExecutionStatesResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'incidentId' when calling"
                  + " listIncidentRuleExecutionStates"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/rule-execution-states"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.listIncidentRuleExecutionStates",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentRuleExecutionStatesResponse>> result =
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
        new GenericType<IncidentRuleExecutionStatesResponse>() {});
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

  /** Manage optional parameters to listIncidentTemplateVariables. */
  public static class ListIncidentTemplateVariablesOptionalParameters {
    private UUID filterIncidentType;
    private Boolean includeFollowUps;

    /**
     * Set filterIncidentType.
     *
     * @param filterIncidentType Filter template variables by incident type. (optional)
     * @return ListIncidentTemplateVariablesOptionalParameters
     */
    public ListIncidentTemplateVariablesOptionalParameters filterIncidentType(
        UUID filterIncidentType) {
      this.filterIncidentType = filterIncidentType;
      return this;
    }

    /**
     * Set includeFollowUps.
     *
     * @param includeFollowUps Whether to include follow-up template variables. (optional)
     * @return ListIncidentTemplateVariablesOptionalParameters
     */
    public ListIncidentTemplateVariablesOptionalParameters includeFollowUps(
        Boolean includeFollowUps) {
      this.includeFollowUps = includeFollowUps;
      return this;
    }
  }

  /**
   * List incident template variables.
   *
   * <p>See {@link #listIncidentTemplateVariablesWithHttpInfo}.
   *
   * @return IncidentTemplateVariablesResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentTemplateVariablesResponse listIncidentTemplateVariables() throws ApiException {
    return listIncidentTemplateVariablesWithHttpInfo(
            new ListIncidentTemplateVariablesOptionalParameters())
        .getData();
  }

  /**
   * List incident template variables.
   *
   * <p>See {@link #listIncidentTemplateVariablesWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;IncidentTemplateVariablesResponse&gt;
   */
  public CompletableFuture<IncidentTemplateVariablesResponse> listIncidentTemplateVariablesAsync() {
    return listIncidentTemplateVariablesWithHttpInfoAsync(
            new ListIncidentTemplateVariablesOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List incident template variables.
   *
   * <p>See {@link #listIncidentTemplateVariablesWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return IncidentTemplateVariablesResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentTemplateVariablesResponse listIncidentTemplateVariables(
      ListIncidentTemplateVariablesOptionalParameters parameters) throws ApiException {
    return listIncidentTemplateVariablesWithHttpInfo(parameters).getData();
  }

  /**
   * List incident template variables.
   *
   * <p>See {@link #listIncidentTemplateVariablesWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;IncidentTemplateVariablesResponse&gt;
   */
  public CompletableFuture<IncidentTemplateVariablesResponse> listIncidentTemplateVariablesAsync(
      ListIncidentTemplateVariablesOptionalParameters parameters) {
    return listIncidentTemplateVariablesWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List all available template variables for incident templates.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;IncidentTemplateVariablesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<IncidentTemplateVariablesResponse> listIncidentTemplateVariablesWithHttpInfo(
      ListIncidentTemplateVariablesOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listIncidentTemplateVariables";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    UUID filterIncidentType = parameters.filterIncidentType;
    Boolean includeFollowUps = parameters.includeFollowUps;
    // create path and map variables
    String localVarPath = "/api/v2/incidents/config/template-variables";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[incident-type]", filterIncidentType));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "includeFollowUps", includeFollowUps));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.listIncidentTemplateVariables",
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
        new GenericType<IncidentTemplateVariablesResponse>() {});
  }

  /**
   * List incident template variables.
   *
   * <p>See {@link #listIncidentTemplateVariablesWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentTemplateVariablesResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentTemplateVariablesResponse>>
      listIncidentTemplateVariablesWithHttpInfoAsync(
          ListIncidentTemplateVariablesOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listIncidentTemplateVariables";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentTemplateVariablesResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    UUID filterIncidentType = parameters.filterIncidentType;
    Boolean includeFollowUps = parameters.includeFollowUps;
    // create path and map variables
    String localVarPath = "/api/v2/incidents/config/template-variables";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[incident-type]", filterIncidentType));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "includeFollowUps", includeFollowUps));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.listIncidentTemplateVariables",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentTemplateVariablesResponse>> result =
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
        new GenericType<IncidentTemplateVariablesResponse>() {});
  }

  /**
   * List incident timeline entries.
   *
   * <p>See {@link #listIncidentTimelineEntriesWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @return IncidentTimelineEntriesResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentTimelineEntriesResponse listIncidentTimelineEntries(String incidentId)
      throws ApiException {
    return listIncidentTimelineEntriesWithHttpInfo(incidentId).getData();
  }

  /**
   * List incident timeline entries.
   *
   * <p>See {@link #listIncidentTimelineEntriesWithHttpInfoAsync}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @return CompletableFuture&lt;IncidentTimelineEntriesResponse&gt;
   */
  public CompletableFuture<IncidentTimelineEntriesResponse> listIncidentTimelineEntriesAsync(
      String incidentId) {
    return listIncidentTimelineEntriesWithHttpInfoAsync(incidentId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the timeline for a given incident.
   *
   * @param incidentId The UUID of the incident. (required)
   * @return ApiResponse&lt;IncidentTimelineEntriesResponse&gt;
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
  public ApiResponse<IncidentTimelineEntriesResponse> listIncidentTimelineEntriesWithHttpInfo(
      String incidentId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listIncidentTimelineEntries";
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
          "Missing the required parameter 'incidentId' when calling listIncidentTimelineEntries");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/timeline"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.listIncidentTimelineEntries",
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
        new GenericType<IncidentTimelineEntriesResponse>() {});
  }

  /**
   * List incident timeline entries.
   *
   * <p>See {@link #listIncidentTimelineEntriesWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentTimelineEntriesResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentTimelineEntriesResponse>>
      listIncidentTimelineEntriesWithHttpInfoAsync(String incidentId) {
    // Check if unstable operation is enabled
    String operationId = "listIncidentTimelineEntries";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentTimelineEntriesResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      CompletableFuture<ApiResponse<IncidentTimelineEntriesResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'incidentId' when calling"
                  + " listIncidentTimelineEntries"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/timeline"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.listIncidentTimelineEntries",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentTimelineEntriesResponse>> result =
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
        new GenericType<IncidentTimelineEntriesResponse>() {});
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

  /**
   * List status page email subscriptions.
   *
   * <p>See {@link #listStatuspageEmailSubscriptionsWithHttpInfo}.
   *
   * @param pageId The ID of the status page. (required)
   * @return IncidentStatuspageSubscriptionsResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentStatuspageSubscriptionsResponse listStatuspageEmailSubscriptions(String pageId)
      throws ApiException {
    return listStatuspageEmailSubscriptionsWithHttpInfo(pageId).getData();
  }

  /**
   * List status page email subscriptions.
   *
   * <p>See {@link #listStatuspageEmailSubscriptionsWithHttpInfoAsync}.
   *
   * @param pageId The ID of the status page. (required)
   * @return CompletableFuture&lt;IncidentStatuspageSubscriptionsResponse&gt;
   */
  public CompletableFuture<IncidentStatuspageSubscriptionsResponse>
      listStatuspageEmailSubscriptionsAsync(String pageId) {
    return listStatuspageEmailSubscriptionsWithHttpInfoAsync(pageId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List all email subscriptions for a status page.
   *
   * @param pageId The ID of the status page. (required)
   * @return ApiResponse&lt;IncidentStatuspageSubscriptionsResponse&gt;
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
  public ApiResponse<IncidentStatuspageSubscriptionsResponse>
      listStatuspageEmailSubscriptionsWithHttpInfo(String pageId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listStatuspageEmailSubscriptions";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'pageId' is set
    if (pageId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'pageId' when calling listStatuspageEmailSubscriptions");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/statuspages/{page_id}/subscriptions/email"
            .replaceAll("\\{" + "page_id" + "\\}", apiClient.escapeString(pageId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.listStatuspageEmailSubscriptions",
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
        new GenericType<IncidentStatuspageSubscriptionsResponse>() {});
  }

  /**
   * List status page email subscriptions.
   *
   * <p>See {@link #listStatuspageEmailSubscriptionsWithHttpInfo}.
   *
   * @param pageId The ID of the status page. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentStatuspageSubscriptionsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentStatuspageSubscriptionsResponse>>
      listStatuspageEmailSubscriptionsWithHttpInfoAsync(String pageId) {
    // Check if unstable operation is enabled
    String operationId = "listStatuspageEmailSubscriptions";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentStatuspageSubscriptionsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'pageId' is set
    if (pageId == null) {
      CompletableFuture<ApiResponse<IncidentStatuspageSubscriptionsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'pageId' when calling"
                  + " listStatuspageEmailSubscriptions"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/statuspages/{page_id}/subscriptions/email"
            .replaceAll("\\{" + "page_id" + "\\}", apiClient.escapeString(pageId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.listStatuspageEmailSubscriptions",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentStatuspageSubscriptionsResponse>> result =
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
        new GenericType<IncidentStatuspageSubscriptionsResponse>() {});
  }

  /** Manage optional parameters to patchIncidentNotificationRule. */
  public static class PatchIncidentNotificationRuleOptionalParameters {
    private String include;

    /**
     * Set include.
     *
     * @param include Comma-separated list of resources to include. Supported values: <code>
     *     created_by_user</code>, <code>last_modified_by_user</code>, <code>incident_type</code>,
     *     <code>notification_template</code> (optional)
     * @return PatchIncidentNotificationRuleOptionalParameters
     */
    public PatchIncidentNotificationRuleOptionalParameters include(String include) {
      this.include = include;
      return this;
    }
  }

  /**
   * Partially update an incident notification rule.
   *
   * <p>See {@link #patchIncidentNotificationRuleWithHttpInfo}.
   *
   * @param id The ID of the notification rule. (required)
   * @param body (required)
   * @return IncidentNotificationRule
   * @throws ApiException if fails to make API call
   */
  public IncidentNotificationRule patchIncidentNotificationRule(
      UUID id, PutIncidentNotificationRuleRequest body) throws ApiException {
    return patchIncidentNotificationRuleWithHttpInfo(
            id, body, new PatchIncidentNotificationRuleOptionalParameters())
        .getData();
  }

  /**
   * Partially update an incident notification rule.
   *
   * <p>See {@link #patchIncidentNotificationRuleWithHttpInfoAsync}.
   *
   * @param id The ID of the notification rule. (required)
   * @param body (required)
   * @return CompletableFuture&lt;IncidentNotificationRule&gt;
   */
  public CompletableFuture<IncidentNotificationRule> patchIncidentNotificationRuleAsync(
      UUID id, PutIncidentNotificationRuleRequest body) {
    return patchIncidentNotificationRuleWithHttpInfoAsync(
            id, body, new PatchIncidentNotificationRuleOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Partially update an incident notification rule.
   *
   * <p>See {@link #patchIncidentNotificationRuleWithHttpInfo}.
   *
   * @param id The ID of the notification rule. (required)
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return IncidentNotificationRule
   * @throws ApiException if fails to make API call
   */
  public IncidentNotificationRule patchIncidentNotificationRule(
      UUID id,
      PutIncidentNotificationRuleRequest body,
      PatchIncidentNotificationRuleOptionalParameters parameters)
      throws ApiException {
    return patchIncidentNotificationRuleWithHttpInfo(id, body, parameters).getData();
  }

  /**
   * Partially update an incident notification rule.
   *
   * <p>See {@link #patchIncidentNotificationRuleWithHttpInfoAsync}.
   *
   * @param id The ID of the notification rule. (required)
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;IncidentNotificationRule&gt;
   */
  public CompletableFuture<IncidentNotificationRule> patchIncidentNotificationRuleAsync(
      UUID id,
      PutIncidentNotificationRuleRequest body,
      PatchIncidentNotificationRuleOptionalParameters parameters) {
    return patchIncidentNotificationRuleWithHttpInfoAsync(id, body, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Partially updates an existing notification rule.
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
  public ApiResponse<IncidentNotificationRule> patchIncidentNotificationRuleWithHttpInfo(
      UUID id,
      PutIncidentNotificationRuleRequest body,
      PatchIncidentNotificationRuleOptionalParameters parameters)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "patchIncidentNotificationRule";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(
          400, "Missing the required parameter 'id' when calling patchIncidentNotificationRule");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling patchIncidentNotificationRule");
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
            "v2.IncidentsApi.patchIncidentNotificationRule",
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
        new GenericType<IncidentNotificationRule>() {});
  }

  /**
   * Partially update an incident notification rule.
   *
   * <p>See {@link #patchIncidentNotificationRuleWithHttpInfo}.
   *
   * @param id The ID of the notification rule. (required)
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentNotificationRule&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentNotificationRule>>
      patchIncidentNotificationRuleWithHttpInfoAsync(
          UUID id,
          PutIncidentNotificationRuleRequest body,
          PatchIncidentNotificationRuleOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "patchIncidentNotificationRule";
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
              "Missing the required parameter 'id' when calling patchIncidentNotificationRule"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<IncidentNotificationRule>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling patchIncidentNotificationRule"));
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
              "v2.IncidentsApi.patchIncidentNotificationRule",
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
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<IncidentNotificationRule>() {});
  }

  /**
   * Render an incident template.
   *
   * <p>See {@link #renderIncidentTemplateWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param body (required)
   * @return IncidentRenderedTemplateResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentRenderedTemplateResponse renderIncidentTemplate(
      String incidentId, IncidentRenderTemplateRequest body) throws ApiException {
    return renderIncidentTemplateWithHttpInfo(incidentId, body).getData();
  }

  /**
   * Render an incident template.
   *
   * <p>See {@link #renderIncidentTemplateWithHttpInfoAsync}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param body (required)
   * @return CompletableFuture&lt;IncidentRenderedTemplateResponse&gt;
   */
  public CompletableFuture<IncidentRenderedTemplateResponse> renderIncidentTemplateAsync(
      String incidentId, IncidentRenderTemplateRequest body) {
    return renderIncidentTemplateWithHttpInfoAsync(incidentId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Render a template with incident-specific data.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param body (required)
   * @return ApiResponse&lt;IncidentRenderedTemplateResponse&gt;
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
  public ApiResponse<IncidentRenderedTemplateResponse> renderIncidentTemplateWithHttpInfo(
      String incidentId, IncidentRenderTemplateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "renderIncidentTemplate";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'incidentId' when calling renderIncidentTemplate");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling renderIncidentTemplate");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/render-template"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.renderIncidentTemplate",
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
        new GenericType<IncidentRenderedTemplateResponse>() {});
  }

  /**
   * Render an incident template.
   *
   * <p>See {@link #renderIncidentTemplateWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentRenderedTemplateResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentRenderedTemplateResponse>>
      renderIncidentTemplateWithHttpInfoAsync(
          String incidentId, IncidentRenderTemplateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "renderIncidentTemplate";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentRenderedTemplateResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      CompletableFuture<ApiResponse<IncidentRenderedTemplateResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'incidentId' when calling renderIncidentTemplate"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<IncidentRenderedTemplateResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling renderIncidentTemplate"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/render-template"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.renderIncidentTemplate",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentRenderedTemplateResponse>> result =
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
        new GenericType<IncidentRenderedTemplateResponse>() {});
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

  /** Manage optional parameters to searchIncidentsV2. */
  public static class SearchIncidentsV2OptionalParameters {
    private String query;
    private IncidentSearchIncidentsSortOrder sort;
    private Boolean withFacets;
    private Boolean filterWithDeleted;
    private String semanticQuery;
    private String timeZone;
    private List<IncidentSearchIncidentsIncludeType> include;
    private Long pageSize;
    private Long pageOffset;

    /**
     * Set query.
     *
     * @param query Specifies which incidents should be returned by the search. (optional)
     * @return SearchIncidentsV2OptionalParameters
     */
    public SearchIncidentsV2OptionalParameters query(String query) {
      this.query = query;
      return this;
    }

    /**
     * Set sort.
     *
     * @param sort Specifies the order of returned incidents. (optional)
     * @return SearchIncidentsV2OptionalParameters
     */
    public SearchIncidentsV2OptionalParameters sort(IncidentSearchIncidentsSortOrder sort) {
      this.sort = sort;
      return this;
    }

    /**
     * Set withFacets.
     *
     * @param withFacets Whether to include facet data in the response. (optional, default to true)
     * @return SearchIncidentsV2OptionalParameters
     */
    public SearchIncidentsV2OptionalParameters withFacets(Boolean withFacets) {
      this.withFacets = withFacets;
      return this;
    }

    /**
     * Set filterWithDeleted.
     *
     * @param filterWithDeleted Whether to include deleted incidents in the response. (optional,
     *     default to false)
     * @return SearchIncidentsV2OptionalParameters
     */
    public SearchIncidentsV2OptionalParameters filterWithDeleted(Boolean filterWithDeleted) {
      this.filterWithDeleted = filterWithDeleted;
      return this;
    }

    /**
     * Set semanticQuery.
     *
     * @param semanticQuery A semantic search query. (optional)
     * @return SearchIncidentsV2OptionalParameters
     */
    public SearchIncidentsV2OptionalParameters semanticQuery(String semanticQuery) {
      this.semanticQuery = semanticQuery;
      return this;
    }

    /**
     * Set timeZone.
     *
     * @param timeZone The timezone for date-based operations. (optional)
     * @return SearchIncidentsV2OptionalParameters
     */
    public SearchIncidentsV2OptionalParameters timeZone(String timeZone) {
      this.timeZone = timeZone;
      return this;
    }

    /**
     * Set include.
     *
     * @param include Specifies which types of related objects to include. (optional)
     * @return SearchIncidentsV2OptionalParameters
     */
    public SearchIncidentsV2OptionalParameters include(
        List<IncidentSearchIncidentsIncludeType> include) {
      this.include = include;
      return this;
    }

    /**
     * Set pageSize.
     *
     * @param pageSize Size for a given page. The maximum allowed value is 100. (optional, default
     *     to 10)
     * @return SearchIncidentsV2OptionalParameters
     */
    public SearchIncidentsV2OptionalParameters pageSize(Long pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set pageOffset.
     *
     * @param pageOffset Specific offset to use as the beginning of the returned page. (optional,
     *     default to 0)
     * @return SearchIncidentsV2OptionalParameters
     */
    public SearchIncidentsV2OptionalParameters pageOffset(Long pageOffset) {
      this.pageOffset = pageOffset;
      return this;
    }
  }

  /**
   * Search incidents.
   *
   * <p>See {@link #searchIncidentsV2WithHttpInfo}.
   *
   * @return IncidentSearchResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentSearchResponse searchIncidentsV2() throws ApiException {
    return searchIncidentsV2WithHttpInfo(new SearchIncidentsV2OptionalParameters()).getData();
  }

  /**
   * Search incidents.
   *
   * <p>See {@link #searchIncidentsV2WithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;IncidentSearchResponse&gt;
   */
  public CompletableFuture<IncidentSearchResponse> searchIncidentsV2Async() {
    return searchIncidentsV2WithHttpInfoAsync(new SearchIncidentsV2OptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Search incidents.
   *
   * <p>See {@link #searchIncidentsV2WithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return IncidentSearchResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentSearchResponse searchIncidentsV2(SearchIncidentsV2OptionalParameters parameters)
      throws ApiException {
    return searchIncidentsV2WithHttpInfo(parameters).getData();
  }

  /**
   * Search incidents.
   *
   * <p>See {@link #searchIncidentsV2WithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;IncidentSearchResponse&gt;
   */
  public CompletableFuture<IncidentSearchResponse> searchIncidentsV2Async(
      SearchIncidentsV2OptionalParameters parameters) {
    return searchIncidentsV2WithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Search for incidents using advanced filtering and pagination.
   *
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
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<IncidentSearchResponse> searchIncidentsV2WithHttpInfo(
      SearchIncidentsV2OptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "searchIncidentsV2";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    String query = parameters.query;
    IncidentSearchIncidentsSortOrder sort = parameters.sort;
    Boolean withFacets = parameters.withFacets;
    Boolean filterWithDeleted = parameters.filterWithDeleted;
    String semanticQuery = parameters.semanticQuery;
    String timeZone = parameters.timeZone;
    List<IncidentSearchIncidentsIncludeType> include = parameters.include;
    Long pageSize = parameters.pageSize;
    Long pageOffset = parameters.pageOffset;
    // create path and map variables
    String localVarPath = "/api/v2/incidents/search-incidents";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "query", query));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "with_facets", withFacets));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[with_deleted]", filterWithDeleted));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "semantic_query", semanticQuery));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "timeZone", timeZone));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[offset]", pageOffset));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.searchIncidentsV2",
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
   * Search incidents.
   *
   * <p>See {@link #searchIncidentsV2WithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentSearchResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentSearchResponse>> searchIncidentsV2WithHttpInfoAsync(
      SearchIncidentsV2OptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "searchIncidentsV2";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentSearchResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    String query = parameters.query;
    IncidentSearchIncidentsSortOrder sort = parameters.sort;
    Boolean withFacets = parameters.withFacets;
    Boolean filterWithDeleted = parameters.filterWithDeleted;
    String semanticQuery = parameters.semanticQuery;
    String timeZone = parameters.timeZone;
    List<IncidentSearchIncidentsIncludeType> include = parameters.include;
    Long pageSize = parameters.pageSize;
    Long pageOffset = parameters.pageOffset;
    // create path and map variables
    String localVarPath = "/api/v2/incidents/search-incidents";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "query", query));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "with_facets", withFacets));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[with_deleted]", filterWithDeleted));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "semantic_query", semanticQuery));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "timeZone", timeZone));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[offset]", pageOffset));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.searchIncidentsV2",
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
   * Update an incident communication.
   *
   * <p>See {@link #updateIncidentCommunicationWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param communicationId The ID of the communication. (required)
   * @param body (required)
   * @return IncidentCommunicationResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentCommunicationResponse updateIncidentCommunication(
      String incidentId, UUID communicationId, IncidentCommunicationRequest body)
      throws ApiException {
    return updateIncidentCommunicationWithHttpInfo(incidentId, communicationId, body).getData();
  }

  /**
   * Update an incident communication.
   *
   * <p>See {@link #updateIncidentCommunicationWithHttpInfoAsync}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param communicationId The ID of the communication. (required)
   * @param body (required)
   * @return CompletableFuture&lt;IncidentCommunicationResponse&gt;
   */
  public CompletableFuture<IncidentCommunicationResponse> updateIncidentCommunicationAsync(
      String incidentId, UUID communicationId, IncidentCommunicationRequest body) {
    return updateIncidentCommunicationWithHttpInfoAsync(incidentId, communicationId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update a communication for a given incident.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param communicationId The ID of the communication. (required)
   * @param body (required)
   * @return ApiResponse&lt;IncidentCommunicationResponse&gt;
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
  public ApiResponse<IncidentCommunicationResponse> updateIncidentCommunicationWithHttpInfo(
      String incidentId, UUID communicationId, IncidentCommunicationRequest body)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateIncidentCommunication";
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
          "Missing the required parameter 'incidentId' when calling updateIncidentCommunication");
    }

    // verify the required parameter 'communicationId' is set
    if (communicationId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'communicationId' when calling"
              + " updateIncidentCommunication");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateIncidentCommunication");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/communications/{communication_id}"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()))
            .replaceAll(
                "\\{" + "communication_id" + "\\}",
                apiClient.escapeString(communicationId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.updateIncidentCommunication",
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
        new GenericType<IncidentCommunicationResponse>() {});
  }

  /**
   * Update an incident communication.
   *
   * <p>See {@link #updateIncidentCommunicationWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param communicationId The ID of the communication. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentCommunicationResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentCommunicationResponse>>
      updateIncidentCommunicationWithHttpInfoAsync(
          String incidentId, UUID communicationId, IncidentCommunicationRequest body) {
    // Check if unstable operation is enabled
    String operationId = "updateIncidentCommunication";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentCommunicationResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      CompletableFuture<ApiResponse<IncidentCommunicationResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'incidentId' when calling"
                  + " updateIncidentCommunication"));
      return result;
    }

    // verify the required parameter 'communicationId' is set
    if (communicationId == null) {
      CompletableFuture<ApiResponse<IncidentCommunicationResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'communicationId' when calling"
                  + " updateIncidentCommunication"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<IncidentCommunicationResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling updateIncidentCommunication"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/communications/{communication_id}"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()))
            .replaceAll(
                "\\{" + "communication_id" + "\\}",
                apiClient.escapeString(communicationId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.updateIncidentCommunication",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentCommunicationResponse>> result =
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
        new GenericType<IncidentCommunicationResponse>() {});
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

  /**
   * Update an incident Jira template.
   *
   * <p>See {@link #updateIncidentJiraTemplateWithHttpInfo}.
   *
   * @param templateId The ID of the Jira template. (required)
   * @param body (required)
   * @return IncidentJiraTemplateResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentJiraTemplateResponse updateIncidentJiraTemplate(
      UUID templateId, IncidentJiraTemplateRequest body) throws ApiException {
    return updateIncidentJiraTemplateWithHttpInfo(templateId, body).getData();
  }

  /**
   * Update an incident Jira template.
   *
   * <p>See {@link #updateIncidentJiraTemplateWithHttpInfoAsync}.
   *
   * @param templateId The ID of the Jira template. (required)
   * @param body (required)
   * @return CompletableFuture&lt;IncidentJiraTemplateResponse&gt;
   */
  public CompletableFuture<IncidentJiraTemplateResponse> updateIncidentJiraTemplateAsync(
      UUID templateId, IncidentJiraTemplateRequest body) {
    return updateIncidentJiraTemplateWithHttpInfoAsync(templateId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update an existing incident Jira template.
   *
   * @param templateId The ID of the Jira template. (required)
   * @param body (required)
   * @return ApiResponse&lt;IncidentJiraTemplateResponse&gt;
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
  public ApiResponse<IncidentJiraTemplateResponse> updateIncidentJiraTemplateWithHttpInfo(
      UUID templateId, IncidentJiraTemplateRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateIncidentJiraTemplate";
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
          "Missing the required parameter 'templateId' when calling updateIncidentJiraTemplate");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateIncidentJiraTemplate");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/config/jira-templates/{template_id}"
            .replaceAll(
                "\\{" + "template_id" + "\\}", apiClient.escapeString(templateId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.updateIncidentJiraTemplate",
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
        new GenericType<IncidentJiraTemplateResponse>() {});
  }

  /**
   * Update an incident Jira template.
   *
   * <p>See {@link #updateIncidentJiraTemplateWithHttpInfo}.
   *
   * @param templateId The ID of the Jira template. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentJiraTemplateResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentJiraTemplateResponse>>
      updateIncidentJiraTemplateWithHttpInfoAsync(
          UUID templateId, IncidentJiraTemplateRequest body) {
    // Check if unstable operation is enabled
    String operationId = "updateIncidentJiraTemplate";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentJiraTemplateResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      CompletableFuture<ApiResponse<IncidentJiraTemplateResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'templateId' when calling"
                  + " updateIncidentJiraTemplate"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<IncidentJiraTemplateResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling updateIncidentJiraTemplate"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/config/jira-templates/{template_id}"
            .replaceAll(
                "\\{" + "template_id" + "\\}", apiClient.escapeString(templateId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.updateIncidentJiraTemplate",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentJiraTemplateResponse>> result =
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
        new GenericType<IncidentJiraTemplateResponse>() {});
  }

  /** Manage optional parameters to updateIncidentMicrosoftTeamsConfiguration. */
  public static class UpdateIncidentMicrosoftTeamsConfigurationOptionalParameters {
    private String include;

    /**
     * Set include.
     *
     * @param include Specifies which related objects to include in the response. (optional)
     * @return UpdateIncidentMicrosoftTeamsConfigurationOptionalParameters
     */
    public UpdateIncidentMicrosoftTeamsConfigurationOptionalParameters include(String include) {
      this.include = include;
      return this;
    }
  }

  /**
   * Update an incident Microsoft Teams configuration.
   *
   * <p>See {@link #updateIncidentMicrosoftTeamsConfigurationWithHttpInfo}.
   *
   * @param configurationId The ID of the Microsoft Teams configuration. (required)
   * @param body (required)
   * @return IncidentMicrosoftTeamsConfigurationResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentMicrosoftTeamsConfigurationResponse updateIncidentMicrosoftTeamsConfiguration(
      UUID configurationId, IncidentMicrosoftTeamsConfigurationRequest body) throws ApiException {
    return updateIncidentMicrosoftTeamsConfigurationWithHttpInfo(
            configurationId,
            body,
            new UpdateIncidentMicrosoftTeamsConfigurationOptionalParameters())
        .getData();
  }

  /**
   * Update an incident Microsoft Teams configuration.
   *
   * <p>See {@link #updateIncidentMicrosoftTeamsConfigurationWithHttpInfoAsync}.
   *
   * @param configurationId The ID of the Microsoft Teams configuration. (required)
   * @param body (required)
   * @return CompletableFuture&lt;IncidentMicrosoftTeamsConfigurationResponse&gt;
   */
  public CompletableFuture<IncidentMicrosoftTeamsConfigurationResponse>
      updateIncidentMicrosoftTeamsConfigurationAsync(
          UUID configurationId, IncidentMicrosoftTeamsConfigurationRequest body) {
    return updateIncidentMicrosoftTeamsConfigurationWithHttpInfoAsync(
            configurationId,
            body,
            new UpdateIncidentMicrosoftTeamsConfigurationOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update an incident Microsoft Teams configuration.
   *
   * <p>See {@link #updateIncidentMicrosoftTeamsConfigurationWithHttpInfo}.
   *
   * @param configurationId The ID of the Microsoft Teams configuration. (required)
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return IncidentMicrosoftTeamsConfigurationResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentMicrosoftTeamsConfigurationResponse updateIncidentMicrosoftTeamsConfiguration(
      UUID configurationId,
      IncidentMicrosoftTeamsConfigurationRequest body,
      UpdateIncidentMicrosoftTeamsConfigurationOptionalParameters parameters)
      throws ApiException {
    return updateIncidentMicrosoftTeamsConfigurationWithHttpInfo(configurationId, body, parameters)
        .getData();
  }

  /**
   * Update an incident Microsoft Teams configuration.
   *
   * <p>See {@link #updateIncidentMicrosoftTeamsConfigurationWithHttpInfoAsync}.
   *
   * @param configurationId The ID of the Microsoft Teams configuration. (required)
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;IncidentMicrosoftTeamsConfigurationResponse&gt;
   */
  public CompletableFuture<IncidentMicrosoftTeamsConfigurationResponse>
      updateIncidentMicrosoftTeamsConfigurationAsync(
          UUID configurationId,
          IncidentMicrosoftTeamsConfigurationRequest body,
          UpdateIncidentMicrosoftTeamsConfigurationOptionalParameters parameters) {
    return updateIncidentMicrosoftTeamsConfigurationWithHttpInfoAsync(
            configurationId, body, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update a Microsoft Teams configuration for incidents.
   *
   * @param configurationId The ID of the Microsoft Teams configuration. (required)
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;IncidentMicrosoftTeamsConfigurationResponse&gt;
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
  public ApiResponse<IncidentMicrosoftTeamsConfigurationResponse>
      updateIncidentMicrosoftTeamsConfigurationWithHttpInfo(
          UUID configurationId,
          IncidentMicrosoftTeamsConfigurationRequest body,
          UpdateIncidentMicrosoftTeamsConfigurationOptionalParameters parameters)
          throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateIncidentMicrosoftTeamsConfiguration";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'configurationId' is set
    if (configurationId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'configurationId' when calling"
              + " updateIncidentMicrosoftTeamsConfiguration");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'body' when calling"
              + " updateIncidentMicrosoftTeamsConfiguration");
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/config/microsoft-teams-configurations/{configuration_id}"
            .replaceAll(
                "\\{" + "configuration_id" + "\\}",
                apiClient.escapeString(configurationId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.updateIncidentMicrosoftTeamsConfiguration",
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
        new GenericType<IncidentMicrosoftTeamsConfigurationResponse>() {});
  }

  /**
   * Update an incident Microsoft Teams configuration.
   *
   * <p>See {@link #updateIncidentMicrosoftTeamsConfigurationWithHttpInfo}.
   *
   * @param configurationId The ID of the Microsoft Teams configuration. (required)
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentMicrosoftTeamsConfigurationResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentMicrosoftTeamsConfigurationResponse>>
      updateIncidentMicrosoftTeamsConfigurationWithHttpInfoAsync(
          UUID configurationId,
          IncidentMicrosoftTeamsConfigurationRequest body,
          UpdateIncidentMicrosoftTeamsConfigurationOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "updateIncidentMicrosoftTeamsConfiguration";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentMicrosoftTeamsConfigurationResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'configurationId' is set
    if (configurationId == null) {
      CompletableFuture<ApiResponse<IncidentMicrosoftTeamsConfigurationResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'configurationId' when calling"
                  + " updateIncidentMicrosoftTeamsConfiguration"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<IncidentMicrosoftTeamsConfigurationResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " updateIncidentMicrosoftTeamsConfiguration"));
      return result;
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/config/microsoft-teams-configurations/{configuration_id}"
            .replaceAll(
                "\\{" + "configuration_id" + "\\}",
                apiClient.escapeString(configurationId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.updateIncidentMicrosoftTeamsConfiguration",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentMicrosoftTeamsConfigurationResponse>> result =
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
        new GenericType<IncidentMicrosoftTeamsConfigurationResponse>() {});
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
   * Update a Statuspage incident for an incident.
   *
   * <p>See {@link #updateIncidentStatuspageIncidentWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param pageId The ID of the Statuspage page. (required)
   * @param statuspageIncidentId The ID of the Statuspage incident. (required)
   * @param body (required)
   * @return IncidentStatuspageIncidentResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentStatuspageIncidentResponse updateIncidentStatuspageIncident(
      String incidentId,
      String pageId,
      String statuspageIncidentId,
      IncidentStatuspageIncidentRequest body)
      throws ApiException {
    return updateIncidentStatuspageIncidentWithHttpInfo(
            incidentId, pageId, statuspageIncidentId, body)
        .getData();
  }

  /**
   * Update a Statuspage incident for an incident.
   *
   * <p>See {@link #updateIncidentStatuspageIncidentWithHttpInfoAsync}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param pageId The ID of the Statuspage page. (required)
   * @param statuspageIncidentId The ID of the Statuspage incident. (required)
   * @param body (required)
   * @return CompletableFuture&lt;IncidentStatuspageIncidentResponse&gt;
   */
  public CompletableFuture<IncidentStatuspageIncidentResponse>
      updateIncidentStatuspageIncidentAsync(
          String incidentId,
          String pageId,
          String statuspageIncidentId,
          IncidentStatuspageIncidentRequest body) {
    return updateIncidentStatuspageIncidentWithHttpInfoAsync(
            incidentId, pageId, statuspageIncidentId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update a Statuspage incident linked to a Datadog incident.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param pageId The ID of the Statuspage page. (required)
   * @param statuspageIncidentId The ID of the Statuspage incident. (required)
   * @param body (required)
   * @return ApiResponse&lt;IncidentStatuspageIncidentResponse&gt;
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
  public ApiResponse<IncidentStatuspageIncidentResponse>
      updateIncidentStatuspageIncidentWithHttpInfo(
          String incidentId,
          String pageId,
          String statuspageIncidentId,
          IncidentStatuspageIncidentRequest body)
          throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateIncidentStatuspageIncident";
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
              + " updateIncidentStatuspageIncident");
    }

    // verify the required parameter 'pageId' is set
    if (pageId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'pageId' when calling updateIncidentStatuspageIncident");
    }

    // verify the required parameter 'statuspageIncidentId' is set
    if (statuspageIncidentId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'statuspageIncidentId' when calling"
              + " updateIncidentStatuspageIncident");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'body' when calling updateIncidentStatuspageIncident");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/statuspage/{incident_id}/statuspage-incidents/pages/{page_id}/incidents/{statuspage_incident_id}"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()))
            .replaceAll("\\{" + "page_id" + "\\}", apiClient.escapeString(pageId.toString()))
            .replaceAll(
                "\\{" + "statuspage_incident_id" + "\\}",
                apiClient.escapeString(statuspageIncidentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.updateIncidentStatuspageIncident",
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
        new GenericType<IncidentStatuspageIncidentResponse>() {});
  }

  /**
   * Update a Statuspage incident for an incident.
   *
   * <p>See {@link #updateIncidentStatuspageIncidentWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param pageId The ID of the Statuspage page. (required)
   * @param statuspageIncidentId The ID of the Statuspage incident. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentStatuspageIncidentResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentStatuspageIncidentResponse>>
      updateIncidentStatuspageIncidentWithHttpInfoAsync(
          String incidentId,
          String pageId,
          String statuspageIncidentId,
          IncidentStatuspageIncidentRequest body) {
    // Check if unstable operation is enabled
    String operationId = "updateIncidentStatuspageIncident";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentStatuspageIncidentResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      CompletableFuture<ApiResponse<IncidentStatuspageIncidentResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'incidentId' when calling"
                  + " updateIncidentStatuspageIncident"));
      return result;
    }

    // verify the required parameter 'pageId' is set
    if (pageId == null) {
      CompletableFuture<ApiResponse<IncidentStatuspageIncidentResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'pageId' when calling"
                  + " updateIncidentStatuspageIncident"));
      return result;
    }

    // verify the required parameter 'statuspageIncidentId' is set
    if (statuspageIncidentId == null) {
      CompletableFuture<ApiResponse<IncidentStatuspageIncidentResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'statuspageIncidentId' when calling"
                  + " updateIncidentStatuspageIncident"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<IncidentStatuspageIncidentResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " updateIncidentStatuspageIncident"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/statuspage/{incident_id}/statuspage-incidents/pages/{page_id}/incidents/{statuspage_incident_id}"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()))
            .replaceAll("\\{" + "page_id" + "\\}", apiClient.escapeString(pageId.toString()))
            .replaceAll(
                "\\{" + "statuspage_incident_id" + "\\}",
                apiClient.escapeString(statuspageIncidentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.updateIncidentStatuspageIncident",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentStatuspageIncidentResponse>> result =
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
        new GenericType<IncidentStatuspageIncidentResponse>() {});
  }

  /** Manage optional parameters to updateIncidentStatusPageNotice. */
  public static class UpdateIncidentStatusPageNoticeOptionalParameters {
    private Boolean notifySubscribers;

    /**
     * Set notifySubscribers.
     *
     * @param notifySubscribers Whether to notify subscribers about this notice. (optional)
     * @return UpdateIncidentStatusPageNoticeOptionalParameters
     */
    public UpdateIncidentStatusPageNoticeOptionalParameters notifySubscribers(
        Boolean notifySubscribers) {
      this.notifySubscribers = notifySubscribers;
      return this;
    }
  }

  /**
   * Update an incident status page notice.
   *
   * <p>See {@link #updateIncidentStatusPageNoticeWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param statuspageId The ID of the status page. (required)
   * @param noticeId The ID of the status page notice. (required)
   * @param body (required)
   * @return IncidentStatusPageNoticeIntegrationResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentStatusPageNoticeIntegrationResponse updateIncidentStatusPageNotice(
      String incidentId,
      UUID statuspageId,
      UUID noticeId,
      IncidentStatusPageNoticeUpdateRequest body)
      throws ApiException {
    return updateIncidentStatusPageNoticeWithHttpInfo(
            incidentId,
            statuspageId,
            noticeId,
            body,
            new UpdateIncidentStatusPageNoticeOptionalParameters())
        .getData();
  }

  /**
   * Update an incident status page notice.
   *
   * <p>See {@link #updateIncidentStatusPageNoticeWithHttpInfoAsync}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param statuspageId The ID of the status page. (required)
   * @param noticeId The ID of the status page notice. (required)
   * @param body (required)
   * @return CompletableFuture&lt;IncidentStatusPageNoticeIntegrationResponse&gt;
   */
  public CompletableFuture<IncidentStatusPageNoticeIntegrationResponse>
      updateIncidentStatusPageNoticeAsync(
          String incidentId,
          UUID statuspageId,
          UUID noticeId,
          IncidentStatusPageNoticeUpdateRequest body) {
    return updateIncidentStatusPageNoticeWithHttpInfoAsync(
            incidentId,
            statuspageId,
            noticeId,
            body,
            new UpdateIncidentStatusPageNoticeOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update an incident status page notice.
   *
   * <p>See {@link #updateIncidentStatusPageNoticeWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param statuspageId The ID of the status page. (required)
   * @param noticeId The ID of the status page notice. (required)
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return IncidentStatusPageNoticeIntegrationResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentStatusPageNoticeIntegrationResponse updateIncidentStatusPageNotice(
      String incidentId,
      UUID statuspageId,
      UUID noticeId,
      IncidentStatusPageNoticeUpdateRequest body,
      UpdateIncidentStatusPageNoticeOptionalParameters parameters)
      throws ApiException {
    return updateIncidentStatusPageNoticeWithHttpInfo(
            incidentId, statuspageId, noticeId, body, parameters)
        .getData();
  }

  /**
   * Update an incident status page notice.
   *
   * <p>See {@link #updateIncidentStatusPageNoticeWithHttpInfoAsync}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param statuspageId The ID of the status page. (required)
   * @param noticeId The ID of the status page notice. (required)
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;IncidentStatusPageNoticeIntegrationResponse&gt;
   */
  public CompletableFuture<IncidentStatusPageNoticeIntegrationResponse>
      updateIncidentStatusPageNoticeAsync(
          String incidentId,
          UUID statuspageId,
          UUID noticeId,
          IncidentStatusPageNoticeUpdateRequest body,
          UpdateIncidentStatusPageNoticeOptionalParameters parameters) {
    return updateIncidentStatusPageNoticeWithHttpInfoAsync(
            incidentId, statuspageId, noticeId, body, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update a status page notice for a given incident.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param statuspageId The ID of the status page. (required)
   * @param noticeId The ID of the status page notice. (required)
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;IncidentStatusPageNoticeIntegrationResponse&gt;
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
  public ApiResponse<IncidentStatusPageNoticeIntegrationResponse>
      updateIncidentStatusPageNoticeWithHttpInfo(
          String incidentId,
          UUID statuspageId,
          UUID noticeId,
          IncidentStatusPageNoticeUpdateRequest body,
          UpdateIncidentStatusPageNoticeOptionalParameters parameters)
          throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateIncidentStatusPageNotice";
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
              + " updateIncidentStatusPageNotice");
    }

    // verify the required parameter 'statuspageId' is set
    if (statuspageId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'statuspageId' when calling"
              + " updateIncidentStatusPageNotice");
    }

    // verify the required parameter 'noticeId' is set
    if (noticeId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'noticeId' when calling updateIncidentStatusPageNotice");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateIncidentStatusPageNotice");
    }
    Boolean notifySubscribers = parameters.notifySubscribers;
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/statuspages/{statuspage_id}/notices/{notice_id}"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()))
            .replaceAll(
                "\\{" + "statuspage_id" + "\\}", apiClient.escapeString(statuspageId.toString()))
            .replaceAll("\\{" + "notice_id" + "\\}", apiClient.escapeString(noticeId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "notify_subscribers", notifySubscribers));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.updateIncidentStatusPageNotice",
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
        new GenericType<IncidentStatusPageNoticeIntegrationResponse>() {});
  }

  /**
   * Update an incident status page notice.
   *
   * <p>See {@link #updateIncidentStatusPageNoticeWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param statuspageId The ID of the status page. (required)
   * @param noticeId The ID of the status page notice. (required)
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentStatusPageNoticeIntegrationResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentStatusPageNoticeIntegrationResponse>>
      updateIncidentStatusPageNoticeWithHttpInfoAsync(
          String incidentId,
          UUID statuspageId,
          UUID noticeId,
          IncidentStatusPageNoticeUpdateRequest body,
          UpdateIncidentStatusPageNoticeOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "updateIncidentStatusPageNotice";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentStatusPageNoticeIntegrationResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      CompletableFuture<ApiResponse<IncidentStatusPageNoticeIntegrationResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'incidentId' when calling"
                  + " updateIncidentStatusPageNotice"));
      return result;
    }

    // verify the required parameter 'statuspageId' is set
    if (statuspageId == null) {
      CompletableFuture<ApiResponse<IncidentStatusPageNoticeIntegrationResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'statuspageId' when calling"
                  + " updateIncidentStatusPageNotice"));
      return result;
    }

    // verify the required parameter 'noticeId' is set
    if (noticeId == null) {
      CompletableFuture<ApiResponse<IncidentStatusPageNoticeIntegrationResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'noticeId' when calling"
                  + " updateIncidentStatusPageNotice"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<IncidentStatusPageNoticeIntegrationResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling updateIncidentStatusPageNotice"));
      return result;
    }
    Boolean notifySubscribers = parameters.notifySubscribers;
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/statuspages/{statuspage_id}/notices/{notice_id}"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()))
            .replaceAll(
                "\\{" + "statuspage_id" + "\\}", apiClient.escapeString(statuspageId.toString()))
            .replaceAll("\\{" + "notice_id" + "\\}", apiClient.escapeString(noticeId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "notify_subscribers", notifySubscribers));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.updateIncidentStatusPageNotice",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentStatusPageNoticeIntegrationResponse>> result =
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
        new GenericType<IncidentStatusPageNoticeIntegrationResponse>() {});
  }

  /**
   * Update an incident timeline entry.
   *
   * <p>See {@link #updateIncidentTimelineEntryWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param timelineEntryId The ID of the timeline entry. (required)
   * @param body (required)
   * @return IncidentTimelineEntryResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentTimelineEntryResponse updateIncidentTimelineEntry(
      String incidentId, UUID timelineEntryId, IncidentTimelineEntryRequest body)
      throws ApiException {
    return updateIncidentTimelineEntryWithHttpInfo(incidentId, timelineEntryId, body).getData();
  }

  /**
   * Update an incident timeline entry.
   *
   * <p>See {@link #updateIncidentTimelineEntryWithHttpInfoAsync}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param timelineEntryId The ID of the timeline entry. (required)
   * @param body (required)
   * @return CompletableFuture&lt;IncidentTimelineEntryResponse&gt;
   */
  public CompletableFuture<IncidentTimelineEntryResponse> updateIncidentTimelineEntryAsync(
      String incidentId, UUID timelineEntryId, IncidentTimelineEntryRequest body) {
    return updateIncidentTimelineEntryWithHttpInfoAsync(incidentId, timelineEntryId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update a timeline entry for a given incident.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param timelineEntryId The ID of the timeline entry. (required)
   * @param body (required)
   * @return ApiResponse&lt;IncidentTimelineEntryResponse&gt;
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
  public ApiResponse<IncidentTimelineEntryResponse> updateIncidentTimelineEntryWithHttpInfo(
      String incidentId, UUID timelineEntryId, IncidentTimelineEntryRequest body)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateIncidentTimelineEntry";
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
          "Missing the required parameter 'incidentId' when calling updateIncidentTimelineEntry");
    }

    // verify the required parameter 'timelineEntryId' is set
    if (timelineEntryId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'timelineEntryId' when calling"
              + " updateIncidentTimelineEntry");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateIncidentTimelineEntry");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/timeline/{timeline_entry_id}"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()))
            .replaceAll(
                "\\{" + "timeline_entry_id" + "\\}",
                apiClient.escapeString(timelineEntryId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.updateIncidentTimelineEntry",
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
        new GenericType<IncidentTimelineEntryResponse>() {});
  }

  /**
   * Update an incident timeline entry.
   *
   * <p>See {@link #updateIncidentTimelineEntryWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param timelineEntryId The ID of the timeline entry. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentTimelineEntryResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentTimelineEntryResponse>>
      updateIncidentTimelineEntryWithHttpInfoAsync(
          String incidentId, UUID timelineEntryId, IncidentTimelineEntryRequest body) {
    // Check if unstable operation is enabled
    String operationId = "updateIncidentTimelineEntry";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentTimelineEntryResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      CompletableFuture<ApiResponse<IncidentTimelineEntryResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'incidentId' when calling"
                  + " updateIncidentTimelineEntry"));
      return result;
    }

    // verify the required parameter 'timelineEntryId' is set
    if (timelineEntryId == null) {
      CompletableFuture<ApiResponse<IncidentTimelineEntryResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'timelineEntryId' when calling"
                  + " updateIncidentTimelineEntry"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<IncidentTimelineEntryResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling updateIncidentTimelineEntry"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/timeline/{timeline_entry_id}"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()))
            .replaceAll(
                "\\{" + "timeline_entry_id" + "\\}",
                apiClient.escapeString(timelineEntryId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.updateIncidentTimelineEntry",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentTimelineEntryResponse>> result =
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
        new GenericType<IncidentTimelineEntryResponse>() {});
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

  /** Manage optional parameters to updateIncidentZoomConfiguration. */
  public static class UpdateIncidentZoomConfigurationOptionalParameters {
    private String include;

    /**
     * Set include.
     *
     * @param include Specifies which related objects to include in the response. (optional)
     * @return UpdateIncidentZoomConfigurationOptionalParameters
     */
    public UpdateIncidentZoomConfigurationOptionalParameters include(String include) {
      this.include = include;
      return this;
    }
  }

  /**
   * Update an incident Zoom configuration.
   *
   * <p>See {@link #updateIncidentZoomConfigurationWithHttpInfo}.
   *
   * @param configurationId The ID of the Zoom configuration. (required)
   * @param body (required)
   * @return IncidentZoomConfigurationResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentZoomConfigurationResponse updateIncidentZoomConfiguration(
      UUID configurationId, IncidentZoomConfigurationRequest body) throws ApiException {
    return updateIncidentZoomConfigurationWithHttpInfo(
            configurationId, body, new UpdateIncidentZoomConfigurationOptionalParameters())
        .getData();
  }

  /**
   * Update an incident Zoom configuration.
   *
   * <p>See {@link #updateIncidentZoomConfigurationWithHttpInfoAsync}.
   *
   * @param configurationId The ID of the Zoom configuration. (required)
   * @param body (required)
   * @return CompletableFuture&lt;IncidentZoomConfigurationResponse&gt;
   */
  public CompletableFuture<IncidentZoomConfigurationResponse> updateIncidentZoomConfigurationAsync(
      UUID configurationId, IncidentZoomConfigurationRequest body) {
    return updateIncidentZoomConfigurationWithHttpInfoAsync(
            configurationId, body, new UpdateIncidentZoomConfigurationOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update an incident Zoom configuration.
   *
   * <p>See {@link #updateIncidentZoomConfigurationWithHttpInfo}.
   *
   * @param configurationId The ID of the Zoom configuration. (required)
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return IncidentZoomConfigurationResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentZoomConfigurationResponse updateIncidentZoomConfiguration(
      UUID configurationId,
      IncidentZoomConfigurationRequest body,
      UpdateIncidentZoomConfigurationOptionalParameters parameters)
      throws ApiException {
    return updateIncidentZoomConfigurationWithHttpInfo(configurationId, body, parameters).getData();
  }

  /**
   * Update an incident Zoom configuration.
   *
   * <p>See {@link #updateIncidentZoomConfigurationWithHttpInfoAsync}.
   *
   * @param configurationId The ID of the Zoom configuration. (required)
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;IncidentZoomConfigurationResponse&gt;
   */
  public CompletableFuture<IncidentZoomConfigurationResponse> updateIncidentZoomConfigurationAsync(
      UUID configurationId,
      IncidentZoomConfigurationRequest body,
      UpdateIncidentZoomConfigurationOptionalParameters parameters) {
    return updateIncidentZoomConfigurationWithHttpInfoAsync(configurationId, body, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update a Zoom configuration for incidents.
   *
   * @param configurationId The ID of the Zoom configuration. (required)
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;IncidentZoomConfigurationResponse&gt;
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
  public ApiResponse<IncidentZoomConfigurationResponse> updateIncidentZoomConfigurationWithHttpInfo(
      UUID configurationId,
      IncidentZoomConfigurationRequest body,
      UpdateIncidentZoomConfigurationOptionalParameters parameters)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateIncidentZoomConfiguration";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'configurationId' is set
    if (configurationId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'configurationId' when calling"
              + " updateIncidentZoomConfiguration");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'body' when calling updateIncidentZoomConfiguration");
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/config/zoom-configurations/{configuration_id}"
            .replaceAll(
                "\\{" + "configuration_id" + "\\}",
                apiClient.escapeString(configurationId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.updateIncidentZoomConfiguration",
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
        new GenericType<IncidentZoomConfigurationResponse>() {});
  }

  /**
   * Update an incident Zoom configuration.
   *
   * <p>See {@link #updateIncidentZoomConfigurationWithHttpInfo}.
   *
   * @param configurationId The ID of the Zoom configuration. (required)
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentZoomConfigurationResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentZoomConfigurationResponse>>
      updateIncidentZoomConfigurationWithHttpInfoAsync(
          UUID configurationId,
          IncidentZoomConfigurationRequest body,
          UpdateIncidentZoomConfigurationOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "updateIncidentZoomConfiguration";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentZoomConfigurationResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'configurationId' is set
    if (configurationId == null) {
      CompletableFuture<ApiResponse<IncidentZoomConfigurationResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'configurationId' when calling"
                  + " updateIncidentZoomConfiguration"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<IncidentZoomConfigurationResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " updateIncidentZoomConfiguration"));
      return result;
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/config/zoom-configurations/{configuration_id}"
            .replaceAll(
                "\\{" + "configuration_id" + "\\}",
                apiClient.escapeString(configurationId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.updateIncidentZoomConfiguration",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentZoomConfigurationResponse>> result =
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
        new GenericType<IncidentZoomConfigurationResponse>() {});
  }

  /** Manage optional parameters to upsertIncidentAutomationData. */
  public static class UpsertIncidentAutomationDataOptionalParameters {
    private String include;

    /**
     * Set include.
     *
     * @param include Specifies which related objects to include in the response. (optional)
     * @return UpsertIncidentAutomationDataOptionalParameters
     */
    public UpsertIncidentAutomationDataOptionalParameters include(String include) {
      this.include = include;
      return this;
    }
  }

  /**
   * Create or update incident automation data.
   *
   * <p>See {@link #upsertIncidentAutomationDataWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param key The automation data key. (required)
   * @param body (required)
   * @return IncidentAutomationDataResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentAutomationDataResponse upsertIncidentAutomationData(
      String incidentId, String key, IncidentAutomationDataRequest body) throws ApiException {
    return upsertIncidentAutomationDataWithHttpInfo(
            incidentId, key, body, new UpsertIncidentAutomationDataOptionalParameters())
        .getData();
  }

  /**
   * Create or update incident automation data.
   *
   * <p>See {@link #upsertIncidentAutomationDataWithHttpInfoAsync}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param key The automation data key. (required)
   * @param body (required)
   * @return CompletableFuture&lt;IncidentAutomationDataResponse&gt;
   */
  public CompletableFuture<IncidentAutomationDataResponse> upsertIncidentAutomationDataAsync(
      String incidentId, String key, IncidentAutomationDataRequest body) {
    return upsertIncidentAutomationDataWithHttpInfoAsync(
            incidentId, key, body, new UpsertIncidentAutomationDataOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create or update incident automation data.
   *
   * <p>See {@link #upsertIncidentAutomationDataWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param key The automation data key. (required)
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return IncidentAutomationDataResponse
   * @throws ApiException if fails to make API call
   */
  public IncidentAutomationDataResponse upsertIncidentAutomationData(
      String incidentId,
      String key,
      IncidentAutomationDataRequest body,
      UpsertIncidentAutomationDataOptionalParameters parameters)
      throws ApiException {
    return upsertIncidentAutomationDataWithHttpInfo(incidentId, key, body, parameters).getData();
  }

  /**
   * Create or update incident automation data.
   *
   * <p>See {@link #upsertIncidentAutomationDataWithHttpInfoAsync}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param key The automation data key. (required)
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;IncidentAutomationDataResponse&gt;
   */
  public CompletableFuture<IncidentAutomationDataResponse> upsertIncidentAutomationDataAsync(
      String incidentId,
      String key,
      IncidentAutomationDataRequest body,
      UpsertIncidentAutomationDataOptionalParameters parameters) {
    return upsertIncidentAutomationDataWithHttpInfoAsync(incidentId, key, body, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create or update automation data for a given incident and key.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param key The automation data key. (required)
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;IncidentAutomationDataResponse&gt;
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
  public ApiResponse<IncidentAutomationDataResponse> upsertIncidentAutomationDataWithHttpInfo(
      String incidentId,
      String key,
      IncidentAutomationDataRequest body,
      UpsertIncidentAutomationDataOptionalParameters parameters)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "upsertIncidentAutomationData";
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
          "Missing the required parameter 'incidentId' when calling upsertIncidentAutomationData");
    }

    // verify the required parameter 'key' is set
    if (key == null) {
      throw new ApiException(
          400, "Missing the required parameter 'key' when calling upsertIncidentAutomationData");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling upsertIncidentAutomationData");
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/automation-data/{key}"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()))
            .replaceAll("\\{" + "key" + "\\}", apiClient.escapeString(key.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.IncidentsApi.upsertIncidentAutomationData",
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
        new GenericType<IncidentAutomationDataResponse>() {});
  }

  /**
   * Create or update incident automation data.
   *
   * <p>See {@link #upsertIncidentAutomationDataWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param key The automation data key. (required)
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentAutomationDataResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentAutomationDataResponse>>
      upsertIncidentAutomationDataWithHttpInfoAsync(
          String incidentId,
          String key,
          IncidentAutomationDataRequest body,
          UpsertIncidentAutomationDataOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "upsertIncidentAutomationData";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IncidentAutomationDataResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'incidentId' is set
    if (incidentId == null) {
      CompletableFuture<ApiResponse<IncidentAutomationDataResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'incidentId' when calling"
                  + " upsertIncidentAutomationData"));
      return result;
    }

    // verify the required parameter 'key' is set
    if (key == null) {
      CompletableFuture<ApiResponse<IncidentAutomationDataResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'key' when calling upsertIncidentAutomationData"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<IncidentAutomationDataResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling upsertIncidentAutomationData"));
      return result;
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath =
        "/api/v2/incidents/{incident_id}/automation-data/{key}"
            .replaceAll(
                "\\{" + "incident_id" + "\\}", apiClient.escapeString(incidentId.toString()))
            .replaceAll("\\{" + "key" + "\\}", apiClient.escapeString(key.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.IncidentsApi.upsertIncidentAutomationData",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IncidentAutomationDataResponse>> result =
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
        new GenericType<IncidentAutomationDataResponse>() {});
  }
}
