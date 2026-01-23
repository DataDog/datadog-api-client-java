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
import com.datadog.api.client.v2.model.IncidentCreateRequest;
import com.datadog.api.client.v2.model.IncidentHandleRequest;
import com.datadog.api.client.v2.model.IncidentHandleResponse;
import com.datadog.api.client.v2.model.IncidentHandlesResponse;
import com.datadog.api.client.v2.model.IncidentImpactCreateRequest;
import com.datadog.api.client.v2.model.IncidentImpactRelatedObject;
import com.datadog.api.client.v2.model.IncidentImpactResponse;
import com.datadog.api.client.v2.model.IncidentImpactsResponse;
import com.datadog.api.client.v2.model.IncidentIntegrationMetadataCreateRequest;
import com.datadog.api.client.v2.model.IncidentIntegrationMetadataListResponse;
import com.datadog.api.client.v2.model.IncidentIntegrationMetadataPatchRequest;
import com.datadog.api.client.v2.model.IncidentIntegrationMetadataResponse;
import com.datadog.api.client.v2.model.IncidentNotificationRule;
import com.datadog.api.client.v2.model.IncidentNotificationRuleArray;
import com.datadog.api.client.v2.model.IncidentNotificationTemplate;
import com.datadog.api.client.v2.model.IncidentNotificationTemplateArray;
import com.datadog.api.client.v2.model.IncidentRelatedObject;
import com.datadog.api.client.v2.model.IncidentResponse;
import com.datadog.api.client.v2.model.IncidentResponseData;
import com.datadog.api.client.v2.model.IncidentSearchResponse;
import com.datadog.api.client.v2.model.IncidentSearchResponseIncidentsData;
import com.datadog.api.client.v2.model.IncidentSearchSortOrder;
import com.datadog.api.client.v2.model.IncidentTodoCreateRequest;
import com.datadog.api.client.v2.model.IncidentTodoListResponse;
import com.datadog.api.client.v2.model.IncidentTodoPatchRequest;
import com.datadog.api.client.v2.model.IncidentTodoResponse;
import com.datadog.api.client.v2.model.IncidentTypeCreateRequest;
import com.datadog.api.client.v2.model.IncidentTypeListResponse;
import com.datadog.api.client.v2.model.IncidentTypePatchRequest;
import com.datadog.api.client.v2.model.IncidentTypeResponse;
import com.datadog.api.client.v2.model.IncidentUpdateRequest;
import com.datadog.api.client.v2.model.IncidentsResponse;
import com.datadog.api.client.v2.model.PatchAttachmentRequest;
import com.datadog.api.client.v2.model.PatchIncidentNotificationTemplateRequest;
import com.datadog.api.client.v2.model.PostmortemAttachmentRequest;
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
            limit,
            args);

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
            limit,
            args);

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
}
