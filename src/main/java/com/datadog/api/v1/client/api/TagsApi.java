package com.datadog.api.v1.client.api;

import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiResponse;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.Pair;

import javax.ws.rs.core.GenericType;

import com.datadog.api.v1.client.model.APIErrorResponse;
import com.datadog.api.v1.client.model.HostTags;
import com.datadog.api.v1.client.model.TagToHosts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class TagsApi {
  private ApiClient apiClient;

  public TagsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TagsApi(ApiClient apiClient) {
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


private ApiResponse<HostTags> createHostTagsWithHttpInfo(String hostName, HostTags body, String source) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'hostName' is set
    if (hostName == null) {
      throw new ApiException(400, "Missing the required parameter 'hostName' when calling createHostTags");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createHostTags");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/tags/hosts/{host_name}"
      .replaceAll("\\{" + "host_name" + "\\}", apiClient.escapeString(hostName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "source", source));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "createHostTags");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<HostTags> localVarReturnType = new GenericType<HostTags>() {};

    return apiClient.invokeAPI("TagsApi.createHostTags", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType);
  }

  public class APIcreateHostTagsRequest {
    private String hostName;
    private HostTags body;
    private String source;

    private APIcreateHostTagsRequest(String hostName) {
      this.hostName = hostName;
    }

    /**
     * Set body
     * @param body Update host tags request body. (required)
     * @return APIcreateHostTagsRequest
     */
    public APIcreateHostTagsRequest body(HostTags body) {
      this.body = body;
      return this;
    }

    /**
     * Set source
     * @param source The source of the tags. [Complete list of source attribute values](https://docs.datadoghq.com/integrations/faq/list-of-api-source-attribute-value). (optional)
     * @return APIcreateHostTagsRequest
     */
    public APIcreateHostTagsRequest source(String source) {
      this.source = source;
      return this;
    }

    /**
     * Execute createHostTags request
     * @return HostTags
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public HostTags execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute createHostTags request with HTTP info returned
     * @return ApiResponse&lt;HostTags&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<HostTags> executeWithHttpInfo() throws ApiException {
      return createHostTagsWithHttpInfo(hostName, body, source);
    }
  }

  /**
   * Add tags to a host
   * This endpoint allows you to add new tags to a host, optionally specifying where these tags come from.
   * @param hostName This endpoint allows you to add new tags to a host, optionally specifying where the tags came from. (required)
   * @return createHostTagsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIcreateHostTagsRequest createHostTags(String hostName) throws ApiException {
    return new APIcreateHostTagsRequest(hostName);
  }

private ApiResponse<Void> deleteHostTagsWithHttpInfo(String hostName, String source) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'hostName' is set
    if (hostName == null) {
      throw new ApiException(400, "Missing the required parameter 'hostName' when calling deleteHostTags");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/tags/hosts/{host_name}"
      .replaceAll("\\{" + "host_name" + "\\}", apiClient.escapeString(hostName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "source", source));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "deleteHostTags");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    return apiClient.invokeAPI("TagsApi.deleteHostTags", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null);
  }

  public class APIdeleteHostTagsRequest {
    private String hostName;
    private String source;

    private APIdeleteHostTagsRequest(String hostName) {
      this.hostName = hostName;
    }

    /**
     * Set source
     * @param source The source of the tags (e.g. chef, puppet). [Complete list of source attribute values](https://docs.datadoghq.com/integrations/faq/list-of-api-source-attribute-value). (optional)
     * @return APIdeleteHostTagsRequest
     */
    public APIdeleteHostTagsRequest source(String source) {
      this.source = source;
      return this;
    }

    /**
     * Execute deleteHostTags request
     
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public void execute() throws ApiException {
      this.executeWithHttpInfo().getData();
    }

    /**
     * Execute deleteHostTags request with HTTP info returned
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
      return deleteHostTagsWithHttpInfo(hostName, source);
    }
  }

  /**
   * Remove host tags
   * This endpoint allows you to remove all user-assigned tags for a single host.
   * @param hostName This endpoint allows you to remove all user-assigned tags for a single host. (required)
   * @return deleteHostTagsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIdeleteHostTagsRequest deleteHostTags(String hostName) throws ApiException {
    return new APIdeleteHostTagsRequest(hostName);
  }

private ApiResponse<HostTags> getHostTagsWithHttpInfo(String hostName, String source) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'hostName' is set
    if (hostName == null) {
      throw new ApiException(400, "Missing the required parameter 'hostName' when calling getHostTags");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/tags/hosts/{host_name}"
      .replaceAll("\\{" + "host_name" + "\\}", apiClient.escapeString(hostName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "source", source));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getHostTags");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<HostTags> localVarReturnType = new GenericType<HostTags>() {};

    return apiClient.invokeAPI("TagsApi.getHostTags", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType);
  }

  public class APIgetHostTagsRequest {
    private String hostName;
    private String source;

    private APIgetHostTagsRequest(String hostName) {
      this.hostName = hostName;
    }

    /**
     * Set source
     * @param source Source to filter. (optional)
     * @return APIgetHostTagsRequest
     */
    public APIgetHostTagsRequest source(String source) {
      this.source = source;
      return this;
    }

    /**
     * Execute getHostTags request
     * @return HostTags
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public HostTags execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getHostTags request with HTTP info returned
     * @return ApiResponse&lt;HostTags&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<HostTags> executeWithHttpInfo() throws ApiException {
      return getHostTagsWithHttpInfo(hostName, source);
    }
  }

  /**
   * Get host tags
   * Return the list of tags that apply to a given host.
   * @param hostName When specified, filters list of tags to those tags with the specified source. (required)
   * @return getHostTagsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIgetHostTagsRequest getHostTags(String hostName) throws ApiException {
    return new APIgetHostTagsRequest(hostName);
  }

private ApiResponse<TagToHosts> listHostTagsWithHttpInfo(String source) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/v1/tags/hosts";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "source", source));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listHostTags");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<TagToHosts> localVarReturnType = new GenericType<TagToHosts>() {};

    return apiClient.invokeAPI("TagsApi.listHostTags", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType);
  }

  public class APIlistHostTagsRequest {
    private String source;

    private APIlistHostTagsRequest() {
    }

    /**
     * Set source
     * @param source When specified, filters host list to those tags with the specified source. (optional)
     * @return APIlistHostTagsRequest
     */
    public APIlistHostTagsRequest source(String source) {
      this.source = source;
      return this;
    }

    /**
     * Execute listHostTags request
     * @return TagToHosts
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public TagToHosts execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listHostTags request with HTTP info returned
     * @return ApiResponse&lt;TagToHosts&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<TagToHosts> executeWithHttpInfo() throws ApiException {
      return listHostTagsWithHttpInfo(source);
    }
  }

  /**
   * Get Tags
   * Return a mapping of tags to hosts for your whole infrastructure.
   * @return listHostTagsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistHostTagsRequest listHostTags() throws ApiException {
    return new APIlistHostTagsRequest();
  }

private ApiResponse<HostTags> updateHostTagsWithHttpInfo(String hostName, HostTags body, String source) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'hostName' is set
    if (hostName == null) {
      throw new ApiException(400, "Missing the required parameter 'hostName' when calling updateHostTags");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateHostTags");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/tags/hosts/{host_name}"
      .replaceAll("\\{" + "host_name" + "\\}", apiClient.escapeString(hostName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "source", source));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "updateHostTags");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<HostTags> localVarReturnType = new GenericType<HostTags>() {};

    return apiClient.invokeAPI("TagsApi.updateHostTags", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType);
  }

  public class APIupdateHostTagsRequest {
    private String hostName;
    private HostTags body;
    private String source;

    private APIupdateHostTagsRequest(String hostName) {
      this.hostName = hostName;
    }

    /**
     * Set body
     * @param body Add tags to host (required)
     * @return APIupdateHostTagsRequest
     */
    public APIupdateHostTagsRequest body(HostTags body) {
      this.body = body;
      return this;
    }

    /**
     * Set source
     * @param source The source of the tags (e.g. chef, puppet). [Complete list of source attribute values](https://docs.datadoghq.com/integrations/faq/list-of-api-source-attribute-value) (optional)
     * @return APIupdateHostTagsRequest
     */
    public APIupdateHostTagsRequest source(String source) {
      this.source = source;
      return this;
    }

    /**
     * Execute updateHostTags request
     * @return HostTags
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 201 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public HostTags execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute updateHostTags request with HTTP info returned
     * @return ApiResponse&lt;HostTags&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 201 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<HostTags> executeWithHttpInfo() throws ApiException {
      return updateHostTagsWithHttpInfo(hostName, body, source);
    }
  }

  /**
   * Update host tags
   * This endpoint allows you to update/replace all tags in an integration source with those supplied in the request.
   * @param hostName This endpoint allows you to update/replace all in an integration source with those supplied in the request. (required)
   * @return updateHostTagsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIupdateHostTagsRequest updateHostTags(String hostName) throws ApiException {
    return new APIupdateHostTagsRequest(hostName);
  }
}
