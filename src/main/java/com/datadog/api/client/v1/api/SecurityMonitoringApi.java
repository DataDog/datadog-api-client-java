
package com.datadog.api.client.v1.api;

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
import com.datadog.api.client.v1.model.SuccessfulSignalUpdateResponse;
import com.datadog.api.client.v1.model.AddSignalToIncidentRequest;
import com.datadog.api.client.v1.model.SignalAssigneeUpdateRequest;
import com.datadog.api.client.v1.model.SignalStateUpdateRequest;


@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityMonitoringApi {
  private ApiClient apiClient;
  public SecurityMonitoringApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public SecurityMonitoringApi(ApiClient apiClient) {
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
 * Add a security signal to an incident.
 *
 * See {@link #addSecurityMonitoringSignalToIncidentWithHttpInfo}.
 *
 * @param signalId The ID of the signal. (required)
 * @param body Attributes describing the signal update. (required)
 * @return SuccessfulSignalUpdateResponse
 * @throws ApiException if fails to make API call
 */
  public SuccessfulSignalUpdateResponse  addSecurityMonitoringSignalToIncident(String signalId, AddSignalToIncidentRequest body) throws ApiException {
    return addSecurityMonitoringSignalToIncidentWithHttpInfo(signalId, body).getData();
  }

  /**
 * Add a security signal to an incident.
 *
 * See {@link #addSecurityMonitoringSignalToIncidentWithHttpInfoAsync}.
 *
 * @param signalId The ID of the signal. (required)
 * @param body Attributes describing the signal update. (required)
 * @return CompletableFuture&lt;SuccessfulSignalUpdateResponse&gt;
 */
  public CompletableFuture<SuccessfulSignalUpdateResponse>addSecurityMonitoringSignalToIncidentAsync(String signalId, AddSignalToIncidentRequest body) {
    return addSecurityMonitoringSignalToIncidentWithHttpInfoAsync(signalId, body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Add a security signal to an incident. This makes it possible to search for signals by incident within the signal explorer and to view the signals on the incident timeline.</p>
   *
   * @param signalId The ID of the signal. (required)
   * @param body Attributes describing the signal update. (required)
   * @return ApiResponse&lt;SuccessfulSignalUpdateResponse&gt;
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
  public ApiResponse<SuccessfulSignalUpdateResponse> addSecurityMonitoringSignalToIncidentWithHttpInfo(String signalId, AddSignalToIncidentRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'signalId' is set
    if (signalId == null) {
      throw new ApiException(400, "Missing the required parameter 'signalId' when calling addSecurityMonitoringSignalToIncident");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling addSecurityMonitoringSignalToIncident");
    }
    // create path and map variables
    String localVarPath = "/api/v1/security_analytics/signals/{signal_id}/add_to_incident"
      .replaceAll("\\{" + "signal_id" + "\\}", apiClient.escapeString(signalId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v1.SecurityMonitoringApi.addSecurityMonitoringSignalToIncident", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("PATCH", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SuccessfulSignalUpdateResponse>() {});
  }

  /**
   * Add a security signal to an incident.
   *
   * See {@link #addSecurityMonitoringSignalToIncidentWithHttpInfo}.
   *
   * @param signalId The ID of the signal. (required)
   * @param body Attributes describing the signal update. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SuccessfulSignalUpdateResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SuccessfulSignalUpdateResponse>> addSecurityMonitoringSignalToIncidentWithHttpInfoAsync(String signalId, AddSignalToIncidentRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'signalId' is set
    if (signalId == null) {
        CompletableFuture<ApiResponse<SuccessfulSignalUpdateResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'signalId' when calling addSecurityMonitoringSignalToIncident"));
        return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<SuccessfulSignalUpdateResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling addSecurityMonitoringSignalToIncident"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/security_analytics/signals/{signal_id}/add_to_incident"
      .replaceAll("\\{" + "signal_id" + "\\}", apiClient.escapeString(signalId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v1.SecurityMonitoringApi.addSecurityMonitoringSignalToIncident", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SuccessfulSignalUpdateResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("PATCH", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SuccessfulSignalUpdateResponse>() {});
  }

  /**
 * Modify the triage assignee of a security signal.
 *
 * See {@link #editSecurityMonitoringSignalAssigneeWithHttpInfo}.
 *
 * @param signalId The ID of the signal. (required)
 * @param body Attributes describing the signal update. (required)
 * @return SuccessfulSignalUpdateResponse
 * @throws ApiException if fails to make API call
 * @deprecated
 */
@Deprecated
  public SuccessfulSignalUpdateResponse  editSecurityMonitoringSignalAssignee(String signalId, SignalAssigneeUpdateRequest body) throws ApiException {
    return editSecurityMonitoringSignalAssigneeWithHttpInfo(signalId, body).getData();
  }

  /**
 * Modify the triage assignee of a security signal.
 *
 * See {@link #editSecurityMonitoringSignalAssigneeWithHttpInfoAsync}.
 *
 * @param signalId The ID of the signal. (required)
 * @param body Attributes describing the signal update. (required)
 * @return CompletableFuture&lt;SuccessfulSignalUpdateResponse&gt;
 * @deprecated
 */
@Deprecated
  public CompletableFuture<SuccessfulSignalUpdateResponse>editSecurityMonitoringSignalAssigneeAsync(String signalId, SignalAssigneeUpdateRequest body) {
    return editSecurityMonitoringSignalAssigneeWithHttpInfoAsync(signalId, body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>This endpoint is deprecated - Modify the triage assignee of a security signal.</p>
   *
   * @param signalId The ID of the signal. (required)
   * @param body Attributes describing the signal update. (required)
   * @return ApiResponse&lt;SuccessfulSignalUpdateResponse&gt;
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
   * @deprecated
   */
  @Deprecated
  public ApiResponse<SuccessfulSignalUpdateResponse> editSecurityMonitoringSignalAssigneeWithHttpInfo(String signalId, SignalAssigneeUpdateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'signalId' is set
    if (signalId == null) {
      throw new ApiException(400, "Missing the required parameter 'signalId' when calling editSecurityMonitoringSignalAssignee");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling editSecurityMonitoringSignalAssignee");
    }
    // create path and map variables
    String localVarPath = "/api/v1/security_analytics/signals/{signal_id}/assignee"
      .replaceAll("\\{" + "signal_id" + "\\}", apiClient.escapeString(signalId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v1.SecurityMonitoringApi.editSecurityMonitoringSignalAssignee", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("PATCH", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SuccessfulSignalUpdateResponse>() {});
  }

  /**
   * Modify the triage assignee of a security signal.
   *
   * See {@link #editSecurityMonitoringSignalAssigneeWithHttpInfo}.
   *
   * @param signalId The ID of the signal. (required)
   * @param body Attributes describing the signal update. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SuccessfulSignalUpdateResponse&gt;&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<ApiResponse<SuccessfulSignalUpdateResponse>> editSecurityMonitoringSignalAssigneeWithHttpInfoAsync(String signalId, SignalAssigneeUpdateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'signalId' is set
    if (signalId == null) {
        CompletableFuture<ApiResponse<SuccessfulSignalUpdateResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'signalId' when calling editSecurityMonitoringSignalAssignee"));
        return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<SuccessfulSignalUpdateResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling editSecurityMonitoringSignalAssignee"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/security_analytics/signals/{signal_id}/assignee"
      .replaceAll("\\{" + "signal_id" + "\\}", apiClient.escapeString(signalId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v1.SecurityMonitoringApi.editSecurityMonitoringSignalAssignee", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SuccessfulSignalUpdateResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("PATCH", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SuccessfulSignalUpdateResponse>() {});
  }

  /**
 * Change the triage state of a security signal.
 *
 * See {@link #editSecurityMonitoringSignalStateWithHttpInfo}.
 *
 * @param signalId The ID of the signal. (required)
 * @param body Attributes describing the signal update. (required)
 * @return SuccessfulSignalUpdateResponse
 * @throws ApiException if fails to make API call
 * @deprecated
 */
@Deprecated
  public SuccessfulSignalUpdateResponse  editSecurityMonitoringSignalState(String signalId, SignalStateUpdateRequest body) throws ApiException {
    return editSecurityMonitoringSignalStateWithHttpInfo(signalId, body).getData();
  }

  /**
 * Change the triage state of a security signal.
 *
 * See {@link #editSecurityMonitoringSignalStateWithHttpInfoAsync}.
 *
 * @param signalId The ID of the signal. (required)
 * @param body Attributes describing the signal update. (required)
 * @return CompletableFuture&lt;SuccessfulSignalUpdateResponse&gt;
 * @deprecated
 */
@Deprecated
  public CompletableFuture<SuccessfulSignalUpdateResponse>editSecurityMonitoringSignalStateAsync(String signalId, SignalStateUpdateRequest body) {
    return editSecurityMonitoringSignalStateWithHttpInfoAsync(signalId, body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>This endpoint is deprecated - Change the triage state of a security signal.</p>
   *
   * @param signalId The ID of the signal. (required)
   * @param body Attributes describing the signal update. (required)
   * @return ApiResponse&lt;SuccessfulSignalUpdateResponse&gt;
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
   * @deprecated
   */
  @Deprecated
  public ApiResponse<SuccessfulSignalUpdateResponse> editSecurityMonitoringSignalStateWithHttpInfo(String signalId, SignalStateUpdateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'signalId' is set
    if (signalId == null) {
      throw new ApiException(400, "Missing the required parameter 'signalId' when calling editSecurityMonitoringSignalState");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling editSecurityMonitoringSignalState");
    }
    // create path and map variables
    String localVarPath = "/api/v1/security_analytics/signals/{signal_id}/state"
      .replaceAll("\\{" + "signal_id" + "\\}", apiClient.escapeString(signalId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v1.SecurityMonitoringApi.editSecurityMonitoringSignalState", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("PATCH", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SuccessfulSignalUpdateResponse>() {});
  }

  /**
   * Change the triage state of a security signal.
   *
   * See {@link #editSecurityMonitoringSignalStateWithHttpInfo}.
   *
   * @param signalId The ID of the signal. (required)
   * @param body Attributes describing the signal update. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SuccessfulSignalUpdateResponse&gt;&gt;
   * @deprecated
   */
  @Deprecated
  public CompletableFuture<ApiResponse<SuccessfulSignalUpdateResponse>> editSecurityMonitoringSignalStateWithHttpInfoAsync(String signalId, SignalStateUpdateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'signalId' is set
    if (signalId == null) {
        CompletableFuture<ApiResponse<SuccessfulSignalUpdateResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'signalId' when calling editSecurityMonitoringSignalState"));
        return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<SuccessfulSignalUpdateResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling editSecurityMonitoringSignalState"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/security_analytics/signals/{signal_id}/state"
      .replaceAll("\\{" + "signal_id" + "\\}", apiClient.escapeString(signalId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v1.SecurityMonitoringApi.editSecurityMonitoringSignalState", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SuccessfulSignalUpdateResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("PATCH", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SuccessfulSignalUpdateResponse>() {});
  }
}