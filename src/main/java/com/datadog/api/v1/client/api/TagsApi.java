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

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

private ApiResponse<HostTags> addToHostTagsWithHttpInfo(String hostName, HostTags body, String source) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'hostName' is set
    if (hostName == null) {
      throw new ApiException(400, "Missing the required parameter 'hostName' when calling addToHostTags");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling addToHostTags");
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
    return apiClient.invokeAPI("TagsApi.addToHostTags", localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIaddToHostTagsRequest {
    private String hostName;
    private HostTags body;
    private String source;

    private APIaddToHostTagsRequest(String hostName) {
      this.hostName = hostName;
    }
    

    /**
     * Set body
     * @param body Add tags to host (required)
     * @return APIaddToHostTagsRequest
     */
    public APIaddToHostTagsRequest body(HostTags body) {
      this.body = body;
      return this;
    }
    

    /**
     * Set source
     * @param source The source of the tags (e.g. chef, puppet). [Complete list of source attribute values](https://docs.datadoghq.com/integrations/faq/list-of-api-source-attribute-value) (optional)
     * @return APIaddToHostTagsRequest
     */
    public APIaddToHostTagsRequest source(String source) {
      this.source = source;
      return this;
    }
    

    /**
     * Execute addToHostTags request
     * @return HostTags
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
         <tr><td> 401 </td><td> Authentication Error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public HostTags execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute addToHostTags request with HTTP info returned
     * @return ApiResponse&lt;HostTags&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
         <tr><td> 401 </td><td> Authentication Error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<HostTags> executeWithHttpInfo() throws ApiException {
      return addToHostTagsWithHttpInfo(hostName, body, source);
    }
  }

  /**
   * Add tags to a host
   * This endpoint allows you to add new tags to a host, optionally specifying where these tags come from.
   * @param hostName This endpoint allows you to add new tags to a host, optionally specifying where the tags came from. (required)
   * @return addToHostTagsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIaddToHostTagsRequest addToHostTags(String hostName) throws ApiException {
    return new APIaddToHostTagsRequest(hostName);
  }

private ApiResponse<TagToHosts> getAllHostTagsWithHttpInfo(String source) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/v1/tags/hosts";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "source", source));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<TagToHosts> localVarReturnType = new GenericType<TagToHosts>() {};
    return apiClient.invokeAPI("TagsApi.getAllHostTags", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIgetAllHostTagsRequest {
    private String source;

    private APIgetAllHostTagsRequest() {
    }
    

    /**
     * Set source
     * @param source When specified, filters host list to those tags with the specified source (optional)
     * @return APIgetAllHostTagsRequest
     */
    public APIgetAllHostTagsRequest source(String source) {
      this.source = source;
      return this;
    }
    

    /**
     * Execute getAllHostTags request
     * @return TagToHosts
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
         <tr><td> 401 </td><td> Authentication Error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public TagToHosts execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getAllHostTags request with HTTP info returned
     * @return ApiResponse&lt;TagToHosts&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
         <tr><td> 401 </td><td> Authentication Error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<TagToHosts> executeWithHttpInfo() throws ApiException {
      return getAllHostTagsWithHttpInfo(source);
    }
  }

  /**
   * Get Tags
   * Return a mapping of tags to hosts for your whole infrastructure.
   * @return getAllHostTagsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIgetAllHostTagsRequest getAllHostTags() throws ApiException {
    return new APIgetAllHostTagsRequest();
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

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<HostTags> localVarReturnType = new GenericType<HostTags>() {};
    return apiClient.invokeAPI("TagsApi.getHostTags", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIgetHostTagsRequest {
    private String hostName;
    private String source;

    private APIgetHostTagsRequest(String hostName) {
      this.hostName = hostName;
    }
    

    /**
     * Set source
     * @param source Source to filter (optional)
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
         <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
         <tr><td> 401 </td><td> Authentication Error </td><td>  -  </td></tr>
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
         <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
         <tr><td> 401 </td><td> Authentication Error </td><td>  -  </td></tr>
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

private ApiResponse<Void> removeHostTagsWithHttpInfo(String hostName, String source) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'hostName' is set
    if (hostName == null) {
      throw new ApiException(400, "Missing the required parameter 'hostName' when calling removeHostTags");
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

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    
    return apiClient.invokeAPI("TagsApi.removeHostTags", localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }

  public class APIremoveHostTagsRequest {
    private String hostName;
    private String source;

    private APIremoveHostTagsRequest(String hostName) {
      this.hostName = hostName;
    }
    

    /**
     * Set source
     * @param source The source of the tags (e.g. chef, puppet). [Complete list of source attribute values](https://docs.datadoghq.com/integrations/faq/list-of-api-source-attribute-value) (optional)
     * @return APIremoveHostTagsRequest
     */
    public APIremoveHostTagsRequest source(String source) {
      this.source = source;
      return this;
    }
    

    /**
     * Execute removeHostTags request
     
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
         <tr><td> 401 </td><td> Authentication Error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public void execute() throws ApiException {
      this.executeWithHttpInfo().getData();
    }

    /**
     * Execute removeHostTags request with HTTP info returned
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
         <tr><td> 401 </td><td> Authentication Error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
      return removeHostTagsWithHttpInfo(hostName, source);
    }
  }

  /**
   * Remove host tags
   * This endpoint allows you to remove all user-assigned tags for a single host.
   * @param hostName This endpoint allows you to remove all user-assigned tags for a single host. (required)
   * @return removeHostTagsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIremoveHostTagsRequest removeHostTags(String hostName) throws ApiException {
    return new APIremoveHostTagsRequest(hostName);
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
    return apiClient.invokeAPI("TagsApi.updateHostTags", localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
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
         <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
         <tr><td> 401 </td><td> Authentication Error </td><td>  -  </td></tr>
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
         <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
         <tr><td> 401 </td><td> Authentication Error </td><td>  -  </td></tr>
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
