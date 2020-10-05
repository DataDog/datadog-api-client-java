package com.datadog.api.v2.client.api;

import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiResponse;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.Pair;

import javax.ws.rs.core.GenericType;

import com.datadog.api.v2.client.model.APIErrorResponse;
import com.datadog.api.v2.client.model.LogsArchive;
import com.datadog.api.v2.client.model.LogsArchiveCreateRequest;
import com.datadog.api.v2.client.model.LogsArchiveOrder;
import com.datadog.api.v2.client.model.LogsArchives;
import com.datadog.api.v2.client.model.RelationshipToRole;
import com.datadog.api.v2.client.model.RolesResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class LogsArchivesApi {
  private ApiClient apiClient;

  public LogsArchivesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public LogsArchivesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get the API cilent
   *
   * @return API client
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * Set the API cilent
   *
   * @param apiClient an instance of API client
   */
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }


private ApiResponse<Void> addReadRoleToArchiveWithHttpInfo(String archiveId, RelationshipToRole body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'archiveId' is set
    if (archiveId == null) {
      throw new ApiException(400, "Missing the required parameter 'archiveId' when calling addReadRoleToArchive");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/logs/config/archives/{archive_id}/readers"
      .replaceAll("\\{" + "archive_id" + "\\}", apiClient.escapeString(archiveId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "addReadRoleToArchive");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    return apiClient.invokeAPI("LogsArchivesApi.addReadRoleToArchive", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }

  public class APIaddReadRoleToArchiveRequest {
    private String archiveId;
    private RelationshipToRole body;

    private APIaddReadRoleToArchiveRequest(String archiveId) {
      this.archiveId = archiveId;
    }

    /**
     * Set body
     * @param body  (optional)
     * @return APIaddReadRoleToArchiveRequest
     */
    public APIaddReadRoleToArchiveRequest body(RelationshipToRole body) {
      this.body = body;
      return this;
    }

    /**
     * Execute addReadRoleToArchive request
     
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public void execute() throws ApiException {
      this.executeWithHttpInfo().getData();
    }

    /**
     * Execute addReadRoleToArchive request with HTTP info returned
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
      return addReadRoleToArchiveWithHttpInfo(archiveId, body);
    }
  }

  /**
   * Grant role to an archive
   * Adds a read role to an archive. ([Roles API](https://docs.datadoghq.com/api/v2/roles/))
   * @param archiveId The ID of the archive. (required)
   * @return addReadRoleToArchiveRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIaddReadRoleToArchiveRequest addReadRoleToArchive(String archiveId) throws ApiException {
    String operationId = "addReadRoleToArchive";
    if (apiClient.isUnstableOperationEnabled(operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    return new APIaddReadRoleToArchiveRequest(archiveId);
  }

private ApiResponse<LogsArchive> createLogsArchiveWithHttpInfo(LogsArchiveCreateRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createLogsArchive");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/logs/config/archives";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "createLogsArchive");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<LogsArchive> localVarReturnType = new GenericType<LogsArchive>() {};

    return apiClient.invokeAPI("LogsArchivesApi.createLogsArchive", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIcreateLogsArchiveRequest {
    private LogsArchiveCreateRequest body;

    private APIcreateLogsArchiveRequest() {
    }

    /**
     * Set body
     * @param body The definition of the new archive. (required)
     * @return APIcreateLogsArchiveRequest
     */
    public APIcreateLogsArchiveRequest body(LogsArchiveCreateRequest body) {
      this.body = body;
      return this;
    }

    /**
     * Execute createLogsArchive request
     * @return LogsArchive
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     
     */
    
    public LogsArchive execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute createLogsArchive request with HTTP info returned
     * @return ApiResponse&lt;LogsArchive&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<LogsArchive> executeWithHttpInfo() throws ApiException {
      return createLogsArchiveWithHttpInfo(body);
    }
  }

  /**
   * Create an archive
   * Create an archive in your organization.
   * @return createLogsArchiveRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIcreateLogsArchiveRequest createLogsArchive() throws ApiException {
    return new APIcreateLogsArchiveRequest();
  }

private ApiResponse<Void> deleteLogsArchiveWithHttpInfo(String archiveId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'archiveId' is set
    if (archiveId == null) {
      throw new ApiException(400, "Missing the required parameter 'archiveId' when calling deleteLogsArchive");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/logs/config/archives/{archive_id}"
      .replaceAll("\\{" + "archive_id" + "\\}", apiClient.escapeString(archiveId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "deleteLogsArchive");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    return apiClient.invokeAPI("LogsArchivesApi.deleteLogsArchive", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }

  public class APIdeleteLogsArchiveRequest {
    private String archiveId;

    private APIdeleteLogsArchiveRequest(String archiveId) {
      this.archiveId = archiveId;
    }

    /**
     * Execute deleteLogsArchive request
     
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public void execute() throws ApiException {
      this.executeWithHttpInfo().getData();
    }

    /**
     * Execute deleteLogsArchive request with HTTP info returned
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
      return deleteLogsArchiveWithHttpInfo(archiveId);
    }
  }

  /**
   * Delete an archive
   * Delete a given archive from your organization.
   * @param archiveId The ID of the archive. (required)
   * @return deleteLogsArchiveRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIdeleteLogsArchiveRequest deleteLogsArchive(String archiveId) throws ApiException {
    return new APIdeleteLogsArchiveRequest(archiveId);
  }

private ApiResponse<LogsArchive> getLogsArchiveWithHttpInfo(String archiveId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'archiveId' is set
    if (archiveId == null) {
      throw new ApiException(400, "Missing the required parameter 'archiveId' when calling getLogsArchive");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/logs/config/archives/{archive_id}"
      .replaceAll("\\{" + "archive_id" + "\\}", apiClient.escapeString(archiveId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getLogsArchive");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<LogsArchive> localVarReturnType = new GenericType<LogsArchive>() {};

    return apiClient.invokeAPI("LogsArchivesApi.getLogsArchive", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIgetLogsArchiveRequest {
    private String archiveId;

    private APIgetLogsArchiveRequest(String archiveId) {
      this.archiveId = archiveId;
    }

    /**
     * Execute getLogsArchive request
     * @return LogsArchive
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public LogsArchive execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getLogsArchive request with HTTP info returned
     * @return ApiResponse&lt;LogsArchive&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<LogsArchive> executeWithHttpInfo() throws ApiException {
      return getLogsArchiveWithHttpInfo(archiveId);
    }
  }

  /**
   * Get an archive
   * Get a specific archive from your organization.
   * @param archiveId The ID of the archive. (required)
   * @return getLogsArchiveRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIgetLogsArchiveRequest getLogsArchive(String archiveId) throws ApiException {
    return new APIgetLogsArchiveRequest(archiveId);
  }

private ApiResponse<LogsArchiveOrder> getLogsArchiveOrderWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/v2/logs/config/archive-order";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getLogsArchiveOrder");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<LogsArchiveOrder> localVarReturnType = new GenericType<LogsArchiveOrder>() {};

    return apiClient.invokeAPI("LogsArchivesApi.getLogsArchiveOrder", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIgetLogsArchiveOrderRequest {

    private APIgetLogsArchiveOrderRequest() {
    }

    /**
     * Execute getLogsArchiveOrder request
     * @return LogsArchiveOrder
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     
     */
    
    public LogsArchiveOrder execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getLogsArchiveOrder request with HTTP info returned
     * @return ApiResponse&lt;LogsArchiveOrder&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<LogsArchiveOrder> executeWithHttpInfo() throws ApiException {
      return getLogsArchiveOrderWithHttpInfo();
    }
  }

  /**
   * Get archive order
   * Get the current order of your archives. This endpoint takes no JSON arguments.
   * @return getLogsArchiveOrderRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIgetLogsArchiveOrderRequest getLogsArchiveOrder() throws ApiException {
    return new APIgetLogsArchiveOrderRequest();
  }

private ApiResponse<RolesResponse> listArchiveReadRolesWithHttpInfo(String archiveId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'archiveId' is set
    if (archiveId == null) {
      throw new ApiException(400, "Missing the required parameter 'archiveId' when calling listArchiveReadRoles");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/logs/config/archives/{archive_id}/readers"
      .replaceAll("\\{" + "archive_id" + "\\}", apiClient.escapeString(archiveId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listArchiveReadRoles");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<RolesResponse> localVarReturnType = new GenericType<RolesResponse>() {};

    return apiClient.invokeAPI("LogsArchivesApi.listArchiveReadRoles", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIlistArchiveReadRolesRequest {
    private String archiveId;

    private APIlistArchiveReadRolesRequest(String archiveId) {
      this.archiveId = archiveId;
    }

    /**
     * Execute listArchiveReadRoles request
     * @return RolesResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public RolesResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listArchiveReadRoles request with HTTP info returned
     * @return ApiResponse&lt;RolesResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<RolesResponse> executeWithHttpInfo() throws ApiException {
      return listArchiveReadRolesWithHttpInfo(archiveId);
    }
  }

  /**
   * List read roles for an archive
   * Returns all read roles a given archive is restricted to.
   * @param archiveId The ID of the archive. (required)
   * @return listArchiveReadRolesRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistArchiveReadRolesRequest listArchiveReadRoles(String archiveId) throws ApiException {
    String operationId = "listArchiveReadRoles";
    if (apiClient.isUnstableOperationEnabled(operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    return new APIlistArchiveReadRolesRequest(archiveId);
  }

private ApiResponse<LogsArchives> listLogsArchivesWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/v2/logs/config/archives";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listLogsArchives");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<LogsArchives> localVarReturnType = new GenericType<LogsArchives>() {};

    return apiClient.invokeAPI("LogsArchivesApi.listLogsArchives", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIlistLogsArchivesRequest {

    private APIlistLogsArchivesRequest() {
    }

    /**
     * Execute listLogsArchives request
     * @return LogsArchives
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>
     
     */
    
    public LogsArchives execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listLogsArchives request with HTTP info returned
     * @return ApiResponse&lt;LogsArchives&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<LogsArchives> executeWithHttpInfo() throws ApiException {
      return listLogsArchivesWithHttpInfo();
    }
  }

  /**
   * Get all archives
   * Get the list of configured logs archives with their definitions.
   * @return listLogsArchivesRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistLogsArchivesRequest listLogsArchives() throws ApiException {
    return new APIlistLogsArchivesRequest();
  }

private ApiResponse<Void> removeRoleFromArchiveWithHttpInfo(String archiveId, RelationshipToRole body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'archiveId' is set
    if (archiveId == null) {
      throw new ApiException(400, "Missing the required parameter 'archiveId' when calling removeRoleFromArchive");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/logs/config/archives/{archive_id}/readers"
      .replaceAll("\\{" + "archive_id" + "\\}", apiClient.escapeString(archiveId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "removeRoleFromArchive");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    return apiClient.invokeAPI("LogsArchivesApi.removeRoleFromArchive", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }

  public class APIremoveRoleFromArchiveRequest {
    private String archiveId;
    private RelationshipToRole body;

    private APIremoveRoleFromArchiveRequest(String archiveId) {
      this.archiveId = archiveId;
    }

    /**
     * Set body
     * @param body  (optional)
     * @return APIremoveRoleFromArchiveRequest
     */
    public APIremoveRoleFromArchiveRequest body(RelationshipToRole body) {
      this.body = body;
      return this;
    }

    /**
     * Execute removeRoleFromArchive request
     
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public void execute() throws ApiException {
      this.executeWithHttpInfo().getData();
    }

    /**
     * Execute removeRoleFromArchive request with HTTP info returned
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
      return removeRoleFromArchiveWithHttpInfo(archiveId, body);
    }
  }

  /**
   * Revoke role from an archive
   * Removes a role from an archive. ([Roles API](https://docs.datadoghq.com/api/v2/roles/))
   * @param archiveId The ID of the archive. (required)
   * @return removeRoleFromArchiveRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIremoveRoleFromArchiveRequest removeRoleFromArchive(String archiveId) throws ApiException {
    String operationId = "removeRoleFromArchive";
    if (apiClient.isUnstableOperationEnabled(operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    return new APIremoveRoleFromArchiveRequest(archiveId);
  }

private ApiResponse<LogsArchive> updateLogsArchiveWithHttpInfo(String archiveId, LogsArchiveCreateRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'archiveId' is set
    if (archiveId == null) {
      throw new ApiException(400, "Missing the required parameter 'archiveId' when calling updateLogsArchive");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateLogsArchive");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/logs/config/archives/{archive_id}"
      .replaceAll("\\{" + "archive_id" + "\\}", apiClient.escapeString(archiveId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "updateLogsArchive");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<LogsArchive> localVarReturnType = new GenericType<LogsArchive>() {};

    return apiClient.invokeAPI("LogsArchivesApi.updateLogsArchive", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIupdateLogsArchiveRequest {
    private String archiveId;
    private LogsArchiveCreateRequest body;

    private APIupdateLogsArchiveRequest(String archiveId) {
      this.archiveId = archiveId;
    }

    /**
     * Set body
     * @param body New definition of the archive. (required)
     * @return APIupdateLogsArchiveRequest
     */
    public APIupdateLogsArchiveRequest body(LogsArchiveCreateRequest body) {
      this.body = body;
      return this;
    }

    /**
     * Execute updateLogsArchive request
     * @return LogsArchive
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public LogsArchive execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute updateLogsArchive request with HTTP info returned
     * @return ApiResponse&lt;LogsArchive&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<LogsArchive> executeWithHttpInfo() throws ApiException {
      return updateLogsArchiveWithHttpInfo(archiveId, body);
    }
  }

  /**
   * Update an archive
   * Update a given archive configuration.  **Note**: Using this method updates your archive configuration by **replacing** your current configuration with the new one sent to your Datadog organization.
   * @param archiveId The ID of the archive. (required)
   * @return updateLogsArchiveRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIupdateLogsArchiveRequest updateLogsArchive(String archiveId) throws ApiException {
    return new APIupdateLogsArchiveRequest(archiveId);
  }

private ApiResponse<LogsArchiveOrder> updateLogsArchiveOrderWithHttpInfo(LogsArchiveOrder body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateLogsArchiveOrder");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/logs/config/archive-order";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "updateLogsArchiveOrder");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<LogsArchiveOrder> localVarReturnType = new GenericType<LogsArchiveOrder>() {};

    return apiClient.invokeAPI("LogsArchivesApi.updateLogsArchiveOrder", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIupdateLogsArchiveOrderRequest {
    private LogsArchiveOrder body;

    private APIupdateLogsArchiveOrderRequest() {
    }

    /**
     * Set body
     * @param body An object containing the new ordered list of archive IDs. (required)
     * @return APIupdateLogsArchiveOrderRequest
     */
    public APIupdateLogsArchiveOrderRequest body(LogsArchiveOrder body) {
      this.body = body;
      return this;
    }

    /**
     * Execute updateLogsArchiveOrder request
     * @return LogsArchiveOrder
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
       </table>
     
     */
    
    public LogsArchiveOrder execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute updateLogsArchiveOrder request with HTTP info returned
     * @return ApiResponse&lt;LogsArchiveOrder&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<LogsArchiveOrder> executeWithHttpInfo() throws ApiException {
      return updateLogsArchiveOrderWithHttpInfo(body);
    }
  }

  /**
   * Update archive order
   * Update the order of your archives. Since logs are processed sequentially, reordering an archive may change the structure and content of the data processed by other archives.  **Note**: Using the &#x60;PUT&#x60; method updates your archive&#39;s order by replacing the current order with the new one.
   * @return updateLogsArchiveOrderRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIupdateLogsArchiveOrderRequest updateLogsArchiveOrder() throws ApiException {
    return new APIupdateLogsArchiveOrderRequest();
  }
}
