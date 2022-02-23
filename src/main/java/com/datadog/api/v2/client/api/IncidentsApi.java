package com.datadog.api.v2.client.api;

import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.ApiResponse;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.Pair;
import com.datadog.api.v2.client.model.IncidentCreateRequest;
import com.datadog.api.v2.client.model.IncidentRelatedObject;
import com.datadog.api.v2.client.model.IncidentResponse;
import com.datadog.api.v2.client.model.IncidentUpdateRequest;
import com.datadog.api.v2.client.model.IncidentsResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.core.GenericType;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IncidentsApi {
  private ApiClient apiClient;

  public IncidentsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public IncidentsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get the API client
   *
   * @return API client
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * Set the API client
   *
   * @param apiClient an instance of API client
   */
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create an incident
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
   * Create an incident
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
   * Create an incident
   *
   * <p>Create an incident.
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
            "IncidentsApi.createIncident",
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
        new GenericType<IncidentResponse>() {});
  }

  /**
   * Create an incident
   *
   * <p>See {@link #createIncidentWithHttpInfo}.
   *
   * @param body Incident payload. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentResponse>> createIncidentWithHttpInfoAsync(
      IncidentCreateRequest body) {
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

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "createIncident");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "IncidentsApi.createIncident",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
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

  /**
   * Delete an existing incident
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
   * Delete an existing incident
   *
   * <p>See {@link #deleteIncidentWithHttpInfoAsync}.
   *
   * @param incidentId The UUID of the incident. (required)
   */
  public CompletableFuture<Void> deleteIncidentAsync(String incidentId) {
    return deleteIncidentWithHttpInfoAsync(incidentId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete an existing incident
   *
   * <p>Deletes an existing incident from the users organization.
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
            "IncidentsApi.deleteIncident",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
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
   * Delete an existing incident
   *
   * <p>See {@link #deleteIncidentWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteIncidentWithHttpInfoAsync(String incidentId) {
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

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "deleteIncident");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "IncidentsApi.deleteIncident",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
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

  /** Manage optional parameters to getIncident. */
  public static class GetIncidentOptionalParameters {
    private List<IncidentRelatedObject> include;

    /**
     * Set include
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
   * Get the details of an incident
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
   * Get the details of an incident
   *
   * <p>See {@link #getIncidentWithHttpInfo}.
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
   * Get the details of an incident
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
   * Get the details of an incident
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
   * Get the details of an incident
   *
   * <p>Get the details of an incident by &#x60;incident_id&#x60;.
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
            "IncidentsApi.getIncident",
            localVarPath,
            localVarQueryParams,
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
        new GenericType<IncidentResponse>() {});
  }

  /**
   * Get the details of an incident
   *
   * <p>See {@link #getIncidentWithHttpInfo}.
   *
   * @param incidentId The UUID of the incident. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentResponse>> getIncidentWithHttpInfoAsync(
      String incidentId, GetIncidentOptionalParameters parameters) {
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

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getIncident");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "IncidentsApi.getIncident",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
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

  /** Manage optional parameters to listIncidents. */
  public static class ListIncidentsOptionalParameters {
    private List<IncidentRelatedObject> include;
    private Long pageSize;
    private Long pageOffset;

    /**
     * Set include
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
     * Set pageSize
     *
     * @param pageSize Size for a given page. (optional, default to 10)
     * @return ListIncidentsOptionalParameters
     */
    public ListIncidentsOptionalParameters pageSize(Long pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set pageOffset
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
   * Get a list of incidents
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
   * Get a list of incidents
   *
   * <p>See {@link #listIncidentsWithHttpInfo}.
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
   * Get a list of incidents
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
   * Get a list of incidents
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
   * Get a list of incidents
   *
   * <p>Get all incidents for the user&#39;s organization.
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
            "IncidentsApi.listIncidents",
            localVarPath,
            localVarQueryParams,
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
        new GenericType<IncidentsResponse>() {});
  }

  /**
   * Get a list of incidents
   *
   * <p>See {@link #listIncidentsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;IncidentsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IncidentsResponse>> listIncidentsWithHttpInfoAsync(
      ListIncidentsOptionalParameters parameters) {
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

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listIncidents");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "IncidentsApi.listIncidents",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
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

  /** Manage optional parameters to updateIncident. */
  public static class UpdateIncidentOptionalParameters {
    private List<IncidentRelatedObject> include;

    /**
     * Set include
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
   * Update an existing incident
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
   * Update an existing incident
   *
   * <p>See {@link #updateIncidentWithHttpInfo}.
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
   * Update an existing incident
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
   * Update an existing incident
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
   * Update an existing incident
   *
   * <p>Updates an incident. Provide only the attributes that should be updated as this request is a
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
            "IncidentsApi.updateIncident",
            localVarPath,
            localVarQueryParams,
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
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
   * Update an existing incident
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

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "updateIncident");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "IncidentsApi.updateIncident",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
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
}
