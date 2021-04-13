package com.datadog.api.v1.client.api;

import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.ApiResponse;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.Pair;
import com.datadog.api.v1.client.model.HostTags;
import com.datadog.api.v1.client.model.TagToHosts;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
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

  /** Manage optional parameters to createHostTags. */
  public static class CreateHostTagsOptionalParameters {
    private String source;

    /**
     * Set source
     *
     * @param source The source of the tags. [Complete list of source attribute
     *     values](https://docs.datadoghq.com/integrations/faq/list-of-api-source-attribute-value).
     *     (optional)
     * @return CreateHostTagsOptionalParameters
     */
    public CreateHostTagsOptionalParameters source(String source) {
      this.source = source;
      return this;
    }
  }

  /**
   * Add tags to a host This endpoint allows you to add new tags to a host, optionally specifying
   * where these tags come from.
   *
   * @param hostName This endpoint allows you to add new tags to a host, optionally specifying where
   *     the tags came from. (required)
   * @param body Update host tags request body. (required)
   * @return HostTags
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *     </table>
   */
  public HostTags createHostTags(String hostName, HostTags body) throws ApiException {
    return createHostTagsWithHttpInfo(hostName, body, new CreateHostTagsOptionalParameters())
        .getData();
  }

  /**
   * Add tags to a host This endpoint allows you to add new tags to a host, optionally specifying
   * where these tags come from.
   *
   * @param hostName This endpoint allows you to add new tags to a host, optionally specifying where
   *     the tags came from. (required)
   * @param body Update host tags request body. (required)
   * @param parameters Optional parameters for the request.
   * @return HostTags
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *     </table>
   */
  public HostTags createHostTags(
      String hostName, HostTags body, CreateHostTagsOptionalParameters parameters)
      throws ApiException {
    return createHostTagsWithHttpInfo(hostName, body, parameters).getData();
  }

  /**
   * Add tags to a host This endpoint allows you to add new tags to a host, optionally specifying
   * where these tags come from.
   *
   * @param hostName This endpoint allows you to add new tags to a host, optionally specifying where
   *     the tags came from. (required)
   * @param body Update host tags request body. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;HostTags&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<HostTags> createHostTagsWithHttpInfo(
      String hostName, HostTags body, CreateHostTagsOptionalParameters parameters)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'hostName' is set
    if (hostName == null) {
      throw new ApiException(
          400, "Missing the required parameter 'hostName' when calling createHostTags");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createHostTags");
    }
    String source = parameters.source;
    // create path and map variables
    String localVarPath =
        "/api/v1/tags/hosts/{host_name}"
            .replaceAll("\\{" + "host_name" + "\\}", apiClient.escapeString(hostName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "source", source));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "createHostTags");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<HostTags> localVarReturnType = new GenericType<HostTags>() {};

    return apiClient.invokeAPI(
        "TagsApi.createHostTags",
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false);
  }

  /** Manage optional parameters to deleteHostTags. */
  public static class DeleteHostTagsOptionalParameters {
    private String source;

    /**
     * Set source
     *
     * @param source The source of the tags (e.g. chef, puppet). [Complete list of source attribute
     *     values](https://docs.datadoghq.com/integrations/faq/list-of-api-source-attribute-value).
     *     (optional)
     * @return DeleteHostTagsOptionalParameters
     */
    public DeleteHostTagsOptionalParameters source(String source) {
      this.source = source;
      return this;
    }
  }

  /**
   * Remove host tags This endpoint allows you to remove all user-assigned tags for a single host.
   *
   * @param hostName This endpoint allows you to remove all user-assigned tags for a single host.
   *     (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *     </table>
   */
  public void deleteHostTags(String hostName) throws ApiException {
    deleteHostTagsWithHttpInfo(hostName, new DeleteHostTagsOptionalParameters());
  }

  /**
   * Remove host tags This endpoint allows you to remove all user-assigned tags for a single host.
   *
   * @param hostName This endpoint allows you to remove all user-assigned tags for a single host.
   *     (required)
   * @param parameters Optional parameters for the request.
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *     </table>
   */
  public void deleteHostTags(String hostName, DeleteHostTagsOptionalParameters parameters)
      throws ApiException {
    deleteHostTagsWithHttpInfo(hostName, parameters);
  }

  /**
   * Remove host tags This endpoint allows you to remove all user-assigned tags for a single host.
   *
   * @param hostName This endpoint allows you to remove all user-assigned tags for a single host.
   *     (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteHostTagsWithHttpInfo(
      String hostName, DeleteHostTagsOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'hostName' is set
    if (hostName == null) {
      throw new ApiException(
          400, "Missing the required parameter 'hostName' when calling deleteHostTags");
    }
    String source = parameters.source;
    // create path and map variables
    String localVarPath =
        "/api/v1/tags/hosts/{host_name}"
            .replaceAll("\\{" + "host_name" + "\\}", apiClient.escapeString(hostName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "source", source));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "deleteHostTags");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    return apiClient.invokeAPI(
        "TagsApi.deleteHostTags",
        localVarPath,
        "DELETE",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        null,
        false);
  }

  /** Manage optional parameters to getHostTags. */
  public static class GetHostTagsOptionalParameters {
    private String source;

    /**
     * Set source
     *
     * @param source Source to filter. (optional)
     * @return GetHostTagsOptionalParameters
     */
    public GetHostTagsOptionalParameters source(String source) {
      this.source = source;
      return this;
    }
  }

  /**
   * Get host tags Return the list of tags that apply to a given host.
   *
   * @param hostName When specified, filters list of tags to those tags with the specified source.
   *     (required)
   * @return HostTags
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *     </table>
   */
  public HostTags getHostTags(String hostName) throws ApiException {
    return getHostTagsWithHttpInfo(hostName, new GetHostTagsOptionalParameters()).getData();
  }

  /**
   * Get host tags Return the list of tags that apply to a given host.
   *
   * @param hostName When specified, filters list of tags to those tags with the specified source.
   *     (required)
   * @param parameters Optional parameters for the request.
   * @return HostTags
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *     </table>
   */
  public HostTags getHostTags(String hostName, GetHostTagsOptionalParameters parameters)
      throws ApiException {
    return getHostTagsWithHttpInfo(hostName, parameters).getData();
  }

  /**
   * Get host tags Return the list of tags that apply to a given host.
   *
   * @param hostName When specified, filters list of tags to those tags with the specified source.
   *     (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;HostTags&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<HostTags> getHostTagsWithHttpInfo(
      String hostName, GetHostTagsOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'hostName' is set
    if (hostName == null) {
      throw new ApiException(
          400, "Missing the required parameter 'hostName' when calling getHostTags");
    }
    String source = parameters.source;
    // create path and map variables
    String localVarPath =
        "/api/v1/tags/hosts/{host_name}"
            .replaceAll("\\{" + "host_name" + "\\}", apiClient.escapeString(hostName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "source", source));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getHostTags");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<HostTags> localVarReturnType = new GenericType<HostTags>() {};

    return apiClient.invokeAPI(
        "TagsApi.getHostTags",
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false);
  }

  /** Manage optional parameters to listHostTags. */
  public static class ListHostTagsOptionalParameters {
    private String source;

    /**
     * Set source
     *
     * @param source When specified, filters host list to those tags with the specified source.
     *     (optional)
     * @return ListHostTagsOptionalParameters
     */
    public ListHostTagsOptionalParameters source(String source) {
      this.source = source;
      return this;
    }
  }

  /**
   * Get Tags Return a mapping of tags to hosts for your whole infrastructure.
   *
   * @return TagToHosts
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *     </table>
   */
  public TagToHosts listHostTags() throws ApiException {
    return listHostTagsWithHttpInfo(new ListHostTagsOptionalParameters()).getData();
  }

  /**
   * Get Tags Return a mapping of tags to hosts for your whole infrastructure.
   *
   * @param parameters Optional parameters for the request.
   * @return TagToHosts
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *     </table>
   */
  public TagToHosts listHostTags(ListHostTagsOptionalParameters parameters) throws ApiException {
    return listHostTagsWithHttpInfo(parameters).getData();
  }

  /**
   * Get Tags Return a mapping of tags to hosts for your whole infrastructure.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;TagToHosts&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<TagToHosts> listHostTagsWithHttpInfo(ListHostTagsOptionalParameters parameters)
      throws ApiException {
    Object localVarPostBody = null;
    String source = parameters.source;
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

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<TagToHosts> localVarReturnType = new GenericType<TagToHosts>() {};

    return apiClient.invokeAPI(
        "TagsApi.listHostTags",
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false);
  }

  /** Manage optional parameters to updateHostTags. */
  public static class UpdateHostTagsOptionalParameters {
    private String source;

    /**
     * Set source
     *
     * @param source The source of the tags (e.g. chef, puppet). [Complete list of source attribute
     *     values](https://docs.datadoghq.com/integrations/faq/list-of-api-source-attribute-value)
     *     (optional)
     * @return UpdateHostTagsOptionalParameters
     */
    public UpdateHostTagsOptionalParameters source(String source) {
      this.source = source;
      return this;
    }
  }

  /**
   * Update host tags This endpoint allows you to update/replace all tags in an integration source
   * with those supplied in the request.
   *
   * @param hostName This endpoint allows you to update/replace all in an integration source with
   *     those supplied in the request. (required)
   * @param body Add tags to host (required)
   * @return HostTags
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *     </table>
   */
  public HostTags updateHostTags(String hostName, HostTags body) throws ApiException {
    return updateHostTagsWithHttpInfo(hostName, body, new UpdateHostTagsOptionalParameters())
        .getData();
  }

  /**
   * Update host tags This endpoint allows you to update/replace all tags in an integration source
   * with those supplied in the request.
   *
   * @param hostName This endpoint allows you to update/replace all in an integration source with
   *     those supplied in the request. (required)
   * @param body Add tags to host (required)
   * @param parameters Optional parameters for the request.
   * @return HostTags
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *     </table>
   */
  public HostTags updateHostTags(
      String hostName, HostTags body, UpdateHostTagsOptionalParameters parameters)
      throws ApiException {
    return updateHostTagsWithHttpInfo(hostName, body, parameters).getData();
  }

  /**
   * Update host tags This endpoint allows you to update/replace all tags in an integration source
   * with those supplied in the request.
   *
   * @param hostName This endpoint allows you to update/replace all in an integration source with
   *     those supplied in the request. (required)
   * @param body Add tags to host (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;HostTags&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<HostTags> updateHostTagsWithHttpInfo(
      String hostName, HostTags body, UpdateHostTagsOptionalParameters parameters)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'hostName' is set
    if (hostName == null) {
      throw new ApiException(
          400, "Missing the required parameter 'hostName' when calling updateHostTags");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateHostTags");
    }
    String source = parameters.source;
    // create path and map variables
    String localVarPath =
        "/api/v1/tags/hosts/{host_name}"
            .replaceAll("\\{" + "host_name" + "\\}", apiClient.escapeString(hostName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "source", source));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "updateHostTags");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<HostTags> localVarReturnType = new GenericType<HostTags>() {};

    return apiClient.invokeAPI(
        "TagsApi.updateHostTags",
        localVarPath,
        "PUT",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false);
  }
}
