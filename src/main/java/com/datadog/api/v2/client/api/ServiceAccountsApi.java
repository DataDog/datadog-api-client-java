package com.datadog.api.v2.client.api;

import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.ApiResponse;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.Pair;
import com.datadog.api.v2.client.model.ApplicationKeyCreateRequest;
import com.datadog.api.v2.client.model.ApplicationKeyResponse;
import com.datadog.api.v2.client.model.ApplicationKeyUpdateRequest;
import com.datadog.api.v2.client.model.ApplicationKeysSort;
import com.datadog.api.v2.client.model.ListApplicationKeysResponse;
import com.datadog.api.v2.client.model.PartialApplicationKeyResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ServiceAccountsApi {
  private ApiClient apiClient;

  public ServiceAccountsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ServiceAccountsApi(ApiClient apiClient) {
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
   * Create an application key for this service account Create an application key for this service
   * account.
   *
   * @param serviceAccountId The ID of the service account. (required)
   * @param body (required)
   * @return ApplicationKeyResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *     </table>
   */
  public ApplicationKeyResponse createServiceAccountApplicationKey(
      String serviceAccountId, ApplicationKeyCreateRequest body) throws ApiException {
    return createServiceAccountApplicationKeyWithHttpInfo(serviceAccountId, body).getData();
  }

  /**
   * Create an application key for this service account Create an application key for this service
   * account.
   *
   * @param serviceAccountId The ID of the service account. (required)
   * @param body (required)
   * @return ApiResponse&lt;ApplicationKeyResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ApplicationKeyResponse> createServiceAccountApplicationKeyWithHttpInfo(
      String serviceAccountId, ApplicationKeyCreateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'serviceAccountId' is set
    if (serviceAccountId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'serviceAccountId' when calling"
              + " createServiceAccountApplicationKey");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'body' when calling createServiceAccountApplicationKey");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/service_accounts/{service_account_id}/application_keys"
            .replaceAll(
                "\\{" + "service_account_id" + "\\}",
                apiClient.escapeString(serviceAccountId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "createServiceAccountApplicationKey");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<ApplicationKeyResponse> localVarReturnType =
        new GenericType<ApplicationKeyResponse>() {};

    return apiClient.invokeAPI(
        "ServiceAccountsApi.createServiceAccountApplicationKey",
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

  /**
   * Delete an application key for this service account Delete an application key owned by this
   * service account.
   *
   * @param serviceAccountId The ID of the service account. (required)
   * @param appKeyId The ID of the application key. (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *     </table>
   */
  public void deleteServiceAccountApplicationKey(String serviceAccountId, String appKeyId)
      throws ApiException {
    deleteServiceAccountApplicationKeyWithHttpInfo(serviceAccountId, appKeyId);
  }

  /**
   * Delete an application key for this service account Delete an application key owned by this
   * service account.
   *
   * @param serviceAccountId The ID of the service account. (required)
   * @param appKeyId The ID of the application key. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteServiceAccountApplicationKeyWithHttpInfo(
      String serviceAccountId, String appKeyId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'serviceAccountId' is set
    if (serviceAccountId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'serviceAccountId' when calling"
              + " deleteServiceAccountApplicationKey");
    }

    // verify the required parameter 'appKeyId' is set
    if (appKeyId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'appKeyId' when calling"
              + " deleteServiceAccountApplicationKey");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/service_accounts/{service_account_id}/application_keys/{app_key_id}"
            .replaceAll(
                "\\{" + "service_account_id" + "\\}",
                apiClient.escapeString(serviceAccountId.toString()))
            .replaceAll("\\{" + "app_key_id" + "\\}", apiClient.escapeString(appKeyId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "deleteServiceAccountApplicationKey");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    return apiClient.invokeAPI(
        "ServiceAccountsApi.deleteServiceAccountApplicationKey",
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

  /**
   * Get one application key for this service account Get an application key owned by this service
   * account.
   *
   * @param serviceAccountId The ID of the service account. (required)
   * @param appKeyId The ID of the application key. (required)
   * @return PartialApplicationKeyResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *     </table>
   */
  public PartialApplicationKeyResponse getServiceAccountApplicationKey(
      String serviceAccountId, String appKeyId) throws ApiException {
    return getServiceAccountApplicationKeyWithHttpInfo(serviceAccountId, appKeyId).getData();
  }

  /**
   * Get one application key for this service account Get an application key owned by this service
   * account.
   *
   * @param serviceAccountId The ID of the service account. (required)
   * @param appKeyId The ID of the application key. (required)
   * @return ApiResponse&lt;PartialApplicationKeyResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<PartialApplicationKeyResponse> getServiceAccountApplicationKeyWithHttpInfo(
      String serviceAccountId, String appKeyId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'serviceAccountId' is set
    if (serviceAccountId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'serviceAccountId' when calling"
              + " getServiceAccountApplicationKey");
    }

    // verify the required parameter 'appKeyId' is set
    if (appKeyId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'appKeyId' when calling getServiceAccountApplicationKey");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/service_accounts/{service_account_id}/application_keys/{app_key_id}"
            .replaceAll(
                "\\{" + "service_account_id" + "\\}",
                apiClient.escapeString(serviceAccountId.toString()))
            .replaceAll("\\{" + "app_key_id" + "\\}", apiClient.escapeString(appKeyId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getServiceAccountApplicationKey");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<PartialApplicationKeyResponse> localVarReturnType =
        new GenericType<PartialApplicationKeyResponse>() {};

    return apiClient.invokeAPI(
        "ServiceAccountsApi.getServiceAccountApplicationKey",
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

  /** Manage optional parameters to listServiceAccountApplicationKeys. */
  public static class ListServiceAccountApplicationKeysOptionalParameters {
    private Long pageSize;
    private Long pageNumber;
    private ApplicationKeysSort sort;
    private String filter;
    private String filterCreatedAtStart;
    private String filterCreatedAtEnd;

    /**
     * Set pageSize
     *
     * @param pageSize Size for a given page. (optional, default to 10)
     * @return ListServiceAccountApplicationKeysOptionalParameters
     */
    public ListServiceAccountApplicationKeysOptionalParameters pageSize(Long pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set pageNumber
     *
     * @param pageNumber Specific page number to return. (optional, default to 0)
     * @return ListServiceAccountApplicationKeysOptionalParameters
     */
    public ListServiceAccountApplicationKeysOptionalParameters pageNumber(Long pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set sort
     *
     * @param sort Application key attribute used to sort results. Sort order is ascending by
     *     default. In order to specify a descending sort, prefix the attribute with a minus sign.
     *     (optional)
     * @return ListServiceAccountApplicationKeysOptionalParameters
     */
    public ListServiceAccountApplicationKeysOptionalParameters sort(ApplicationKeysSort sort) {
      this.sort = sort;
      return this;
    }

    /**
     * Set filter
     *
     * @param filter Filter application keys by the specified string. (optional)
     * @return ListServiceAccountApplicationKeysOptionalParameters
     */
    public ListServiceAccountApplicationKeysOptionalParameters filter(String filter) {
      this.filter = filter;
      return this;
    }

    /**
     * Set filterCreatedAtStart
     *
     * @param filterCreatedAtStart Only include application keys created on or after the specified
     *     date. (optional)
     * @return ListServiceAccountApplicationKeysOptionalParameters
     */
    public ListServiceAccountApplicationKeysOptionalParameters filterCreatedAtStart(
        String filterCreatedAtStart) {
      this.filterCreatedAtStart = filterCreatedAtStart;
      return this;
    }

    /**
     * Set filterCreatedAtEnd
     *
     * @param filterCreatedAtEnd Only include application keys created on or before the specified
     *     date. (optional)
     * @return ListServiceAccountApplicationKeysOptionalParameters
     */
    public ListServiceAccountApplicationKeysOptionalParameters filterCreatedAtEnd(
        String filterCreatedAtEnd) {
      this.filterCreatedAtEnd = filterCreatedAtEnd;
      return this;
    }
  }

  /**
   * List application keys for this service account List all application keys available for this
   * service account.
   *
   * @param serviceAccountId The ID of the service account. (required)
   * @return ListApplicationKeysResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *     </table>
   */
  public ListApplicationKeysResponse listServiceAccountApplicationKeys(String serviceAccountId)
      throws ApiException {
    return listServiceAccountApplicationKeysWithHttpInfo(
            serviceAccountId, new ListServiceAccountApplicationKeysOptionalParameters())
        .getData();
  }

  /**
   * List application keys for this service account List all application keys available for this
   * service account.
   *
   * @param serviceAccountId The ID of the service account. (required)
   * @param parameters Optional parameters for the request.
   * @return ListApplicationKeysResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><th> Status Code </th><th> Description </th><th> Response Headers </th></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *     </table>
   */
  public ListApplicationKeysResponse listServiceAccountApplicationKeys(
      String serviceAccountId, ListServiceAccountApplicationKeysOptionalParameters parameters)
      throws ApiException {
    return listServiceAccountApplicationKeysWithHttpInfo(serviceAccountId, parameters).getData();
  }

  /**
   * List application keys for this service account List all application keys available for this
   * service account.
   *
   * @param serviceAccountId The ID of the service account. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;ListApplicationKeysResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ListApplicationKeysResponse> listServiceAccountApplicationKeysWithHttpInfo(
      String serviceAccountId, ListServiceAccountApplicationKeysOptionalParameters parameters)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'serviceAccountId' is set
    if (serviceAccountId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'serviceAccountId' when calling"
              + " listServiceAccountApplicationKeys");
    }
    Long pageSize = parameters.pageSize;
    Long pageNumber = parameters.pageNumber;
    ApplicationKeysSort sort = parameters.sort;
    String filter = parameters.filter;
    String filterCreatedAtStart = parameters.filterCreatedAtStart;
    String filterCreatedAtEnd = parameters.filterCreatedAtEnd;
    // create path and map variables
    String localVarPath =
        "/api/v2/service_accounts/{service_account_id}/application_keys"
            .replaceAll(
                "\\{" + "service_account_id" + "\\}",
                apiClient.escapeString(serviceAccountId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[created_at][start]", filterCreatedAtStart));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[created_at][end]", filterCreatedAtEnd));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listServiceAccountApplicationKeys");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<ListApplicationKeysResponse> localVarReturnType =
        new GenericType<ListApplicationKeysResponse>() {};

    return apiClient.invokeAPI(
        "ServiceAccountsApi.listServiceAccountApplicationKeys",
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

  /**
   * Edit an application key for this service account Edit an application key owned by this service
   * account.
   *
   * @param serviceAccountId The ID of the service account. (required)
   * @param appKeyId The ID of the application key. (required)
   * @param body (required)
   * @return PartialApplicationKeyResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *     </table>
   */
  public PartialApplicationKeyResponse updateServiceAccountApplicationKey(
      String serviceAccountId, String appKeyId, ApplicationKeyUpdateRequest body)
      throws ApiException {
    return updateServiceAccountApplicationKeyWithHttpInfo(serviceAccountId, appKeyId, body)
        .getData();
  }

  /**
   * Edit an application key for this service account Edit an application key owned by this service
   * account.
   *
   * @param serviceAccountId The ID of the service account. (required)
   * @param appKeyId The ID of the application key. (required)
   * @param body (required)
   * @return ApiResponse&lt;PartialApplicationKeyResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<PartialApplicationKeyResponse> updateServiceAccountApplicationKeyWithHttpInfo(
      String serviceAccountId, String appKeyId, ApplicationKeyUpdateRequest body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'serviceAccountId' is set
    if (serviceAccountId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'serviceAccountId' when calling"
              + " updateServiceAccountApplicationKey");
    }

    // verify the required parameter 'appKeyId' is set
    if (appKeyId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'appKeyId' when calling"
              + " updateServiceAccountApplicationKey");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'body' when calling updateServiceAccountApplicationKey");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/service_accounts/{service_account_id}/application_keys/{app_key_id}"
            .replaceAll(
                "\\{" + "service_account_id" + "\\}",
                apiClient.escapeString(serviceAccountId.toString()))
            .replaceAll("\\{" + "app_key_id" + "\\}", apiClient.escapeString(appKeyId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "updateServiceAccountApplicationKey");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<PartialApplicationKeyResponse> localVarReturnType =
        new GenericType<PartialApplicationKeyResponse>() {};

    return apiClient.invokeAPI(
        "ServiceAccountsApi.updateServiceAccountApplicationKey",
        localVarPath,
        "PATCH",
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
