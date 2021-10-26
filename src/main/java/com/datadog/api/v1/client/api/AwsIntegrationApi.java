package com.datadog.api.v1.client.api;

import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.ApiResponse;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.Pair;
import com.datadog.api.v1.client.model.AWSAccount;
import com.datadog.api.v1.client.model.AWSAccountCreateResponse;
import com.datadog.api.v1.client.model.AWSAccountDeleteRequest;
import com.datadog.api.v1.client.model.AWSAccountListResponse;
import com.datadog.api.v1.client.model.AWSTagFilterCreateRequest;
import com.datadog.api.v1.client.model.AWSTagFilterDeleteRequest;
import com.datadog.api.v1.client.model.AWSTagFilterListResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AwsIntegrationApi {
  private ApiClient apiClient;

  public AwsIntegrationApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AwsIntegrationApi(ApiClient apiClient) {
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
   * Create an AWS integration Create a Datadog-Amazon Web Services integration. Using the
   * &#x60;POST&#x60; method updates your integration configuration by adding your new configuration
   * to the existing one in your Datadog organization. A unique AWS Account ID for role based
   * authentication.
   *
   * @param body AWS Request Object (required)
   * @return AWSAccountCreateResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict Error </td><td>  -  </td></tr>
   *     </table>
   */
  public AWSAccountCreateResponse createAWSAccount(AWSAccount body) throws ApiException {
    return createAWSAccountWithHttpInfo(body).getData();
  }

  /**
   * Create an AWS integration Create a Datadog-Amazon Web Services integration. Using the
   * &#x60;POST&#x60; method updates your integration configuration by adding your new configuration
   * to the existing one in your Datadog organization. A unique AWS Account ID for role based
   * authentication.
   *
   * @param body AWS Request Object (required)
   * @return ApiResponse&lt;AWSAccountCreateResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict Error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AWSAccountCreateResponse> createAWSAccountWithHttpInfo(AWSAccount body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createAWSAccount");
    }
    // create path and map variables
    String localVarPath = "/api/v1/integration/aws";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "createAWSAccount");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<AWSAccountCreateResponse> localVarReturnType =
        new GenericType<AWSAccountCreateResponse>() {};

    return apiClient.invokeAPI(
        "AwsIntegrationApi.createAWSAccount",
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
   * Set an AWS tag filter Set an AWS tag filter.
   *
   * @param body Set an AWS tag filter using an &#x60;aws_account_identifier&#x60;,
   *     &#x60;namespace&#x60;, and filtering string. Namespace options are
   *     &#x60;application_elb&#x60;, &#x60;elb&#x60;, &#x60;lambda&#x60;, &#x60;network_elb&#x60;,
   *     &#x60;rds&#x60;, &#x60;sqs&#x60;, and &#x60;custom&#x60;. (required)
   * @return Object
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *     </table>
   */
  public Object createAWSTagFilter(AWSTagFilterCreateRequest body) throws ApiException {
    return createAWSTagFilterWithHttpInfo(body).getData();
  }

  /**
   * Set an AWS tag filter Set an AWS tag filter.
   *
   * @param body Set an AWS tag filter using an &#x60;aws_account_identifier&#x60;,
   *     &#x60;namespace&#x60;, and filtering string. Namespace options are
   *     &#x60;application_elb&#x60;, &#x60;elb&#x60;, &#x60;lambda&#x60;, &#x60;network_elb&#x60;,
   *     &#x60;rds&#x60;, &#x60;sqs&#x60;, and &#x60;custom&#x60;. (required)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Object> createAWSTagFilterWithHttpInfo(AWSTagFilterCreateRequest body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createAWSTagFilter");
    }
    // create path and map variables
    String localVarPath = "/api/v1/integration/aws/filtering";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "createAWSTagFilter");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};

    return apiClient.invokeAPI(
        "AwsIntegrationApi.createAWSTagFilter",
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
   * Generate a new external ID Generate a new AWS external ID for a given AWS account ID and role
   * name pair.
   *
   * @param body Your Datadog role delegation name. For more information about your AWS account Role
   *     name, see the [Datadog AWS integration configuration
   *     info](https://docs.datadoghq.com/integrations/amazon_web_services/#setup). (required)
   * @return AWSAccountCreateResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *     </table>
   */
  public AWSAccountCreateResponse createNewAWSExternalID(AWSAccount body) throws ApiException {
    return createNewAWSExternalIDWithHttpInfo(body).getData();
  }

  /**
   * Generate a new external ID Generate a new AWS external ID for a given AWS account ID and role
   * name pair.
   *
   * @param body Your Datadog role delegation name. For more information about your AWS account Role
   *     name, see the [Datadog AWS integration configuration
   *     info](https://docs.datadoghq.com/integrations/amazon_web_services/#setup). (required)
   * @return ApiResponse&lt;AWSAccountCreateResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AWSAccountCreateResponse> createNewAWSExternalIDWithHttpInfo(AWSAccount body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createNewAWSExternalID");
    }
    // create path and map variables
    String localVarPath = "/api/v1/integration/aws/generate_new_external_id";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "createNewAWSExternalID");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<AWSAccountCreateResponse> localVarReturnType =
        new GenericType<AWSAccountCreateResponse>() {};

    return apiClient.invokeAPI(
        "AwsIntegrationApi.createNewAWSExternalID",
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

  /**
   * Delete an AWS integration Delete a Datadog-AWS integration matching the specified
   * &#x60;account_id&#x60; and &#x60;role_name parameters&#x60;.
   *
   * @param body AWS request object (required)
   * @return Object
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict Error </td><td>  -  </td></tr>
   *     </table>
   */
  public Object deleteAWSAccount(AWSAccountDeleteRequest body) throws ApiException {
    return deleteAWSAccountWithHttpInfo(body).getData();
  }

  /**
   * Delete an AWS integration Delete a Datadog-AWS integration matching the specified
   * &#x60;account_id&#x60; and &#x60;role_name parameters&#x60;.
   *
   * @param body AWS request object (required)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict Error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Object> deleteAWSAccountWithHttpInfo(AWSAccountDeleteRequest body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling deleteAWSAccount");
    }
    // create path and map variables
    String localVarPath = "/api/v1/integration/aws";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "deleteAWSAccount");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};

    return apiClient.invokeAPI(
        "AwsIntegrationApi.deleteAWSAccount",
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
        localVarReturnType,
        false);
  }

  /**
   * Delete a tag filtering entry Delete a tag filtering entry.
   *
   * @param body Delete a tag filtering entry for a given AWS account and &#x60;dd-aws&#x60;
   *     namespace. (required)
   * @return Object
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *     </table>
   */
  public Object deleteAWSTagFilter(AWSTagFilterDeleteRequest body) throws ApiException {
    return deleteAWSTagFilterWithHttpInfo(body).getData();
  }

  /**
   * Delete a tag filtering entry Delete a tag filtering entry.
   *
   * @param body Delete a tag filtering entry for a given AWS account and &#x60;dd-aws&#x60;
   *     namespace. (required)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Object> deleteAWSTagFilterWithHttpInfo(AWSTagFilterDeleteRequest body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling deleteAWSTagFilter");
    }
    // create path and map variables
    String localVarPath = "/api/v1/integration/aws/filtering";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "deleteAWSTagFilter");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};

    return apiClient.invokeAPI(
        "AwsIntegrationApi.deleteAWSTagFilter",
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
        localVarReturnType,
        false);
  }

  /** Manage optional parameters to listAWSAccounts. */
  public static class ListAWSAccountsOptionalParameters {
    private String accountId;
    private String roleName;
    private String accessKeyId;

    /**
     * Set accountId
     *
     * @param accountId Only return AWS accounts that matches this &#x60;account_id&#x60;.
     *     (optional)
     * @return ListAWSAccountsOptionalParameters
     */
    public ListAWSAccountsOptionalParameters accountId(String accountId) {
      this.accountId = accountId;
      return this;
    }

    /**
     * Set roleName
     *
     * @param roleName Only return AWS accounts that matches this role_name. (optional)
     * @return ListAWSAccountsOptionalParameters
     */
    public ListAWSAccountsOptionalParameters roleName(String roleName) {
      this.roleName = roleName;
      return this;
    }

    /**
     * Set accessKeyId
     *
     * @param accessKeyId Only return AWS accounts that matches this &#x60;access_key_id&#x60;.
     *     (optional)
     * @return ListAWSAccountsOptionalParameters
     */
    public ListAWSAccountsOptionalParameters accessKeyId(String accessKeyId) {
      this.accessKeyId = accessKeyId;
      return this;
    }
  }

  /**
   * List all AWS integrations List all Datadog-AWS integrations available in your Datadog
   * organization.
   *
   * @return AWSAccountListResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *     </table>
   */
  public AWSAccountListResponse listAWSAccounts() throws ApiException {
    return listAWSAccountsWithHttpInfo(new ListAWSAccountsOptionalParameters()).getData();
  }

  /**
   * List all AWS integrations List all Datadog-AWS integrations available in your Datadog
   * organization.
   *
   * @param parameters Optional parameters for the request.
   * @return AWSAccountListResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><th> Status Code </th><th> Description </th><th> Response Headers </th></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *     </table>
   */
  public AWSAccountListResponse listAWSAccounts(ListAWSAccountsOptionalParameters parameters)
      throws ApiException {
    return listAWSAccountsWithHttpInfo(parameters).getData();
  }

  /**
   * List all AWS integrations List all Datadog-AWS integrations available in your Datadog
   * organization.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;AWSAccountListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AWSAccountListResponse> listAWSAccountsWithHttpInfo(
      ListAWSAccountsOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    String accountId = parameters.accountId;
    String roleName = parameters.roleName;
    String accessKeyId = parameters.accessKeyId;
    // create path and map variables
    String localVarPath = "/api/v1/integration/aws";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "account_id", accountId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "role_name", roleName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "access_key_id", accessKeyId));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listAWSAccounts");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<AWSAccountListResponse> localVarReturnType =
        new GenericType<AWSAccountListResponse>() {};

    return apiClient.invokeAPI(
        "AwsIntegrationApi.listAWSAccounts",
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
   * Get all AWS tag filters Get all AWS tag filters.
   *
   * @param accountId Only return AWS filters that matches this &#x60;account_id&#x60;. (required)
   * @return AWSTagFilterListResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *     </table>
   */
  public AWSTagFilterListResponse listAWSTagFilters(String accountId) throws ApiException {
    return listAWSTagFiltersWithHttpInfo(accountId).getData();
  }

  /**
   * Get all AWS tag filters Get all AWS tag filters.
   *
   * @param accountId Only return AWS filters that matches this &#x60;account_id&#x60;. (required)
   * @return ApiResponse&lt;AWSTagFilterListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AWSTagFilterListResponse> listAWSTagFiltersWithHttpInfo(String accountId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'accountId' when calling listAWSTagFilters");
    }
    // create path and map variables
    String localVarPath = "/api/v1/integration/aws/filtering";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "account_id", accountId));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listAWSTagFilters");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<AWSTagFilterListResponse> localVarReturnType =
        new GenericType<AWSTagFilterListResponse>() {};

    return apiClient.invokeAPI(
        "AwsIntegrationApi.listAWSTagFilters",
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
   * List namespace rules List all namespace rules for a given Datadog-AWS integration. This
   * endpoint takes no arguments.
   *
   * @return List&lt;String&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *     </table>
   */
  public List<String> listAvailableAWSNamespaces() throws ApiException {
    return listAvailableAWSNamespacesWithHttpInfo().getData();
  }

  /**
   * List namespace rules List all namespace rules for a given Datadog-AWS integration. This
   * endpoint takes no arguments.
   *
   * @return ApiResponse&lt;List&lt;String&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<List<String>> listAvailableAWSNamespacesWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v1/integration/aws/available_namespace_rules";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listAvailableAWSNamespaces");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<List<String>> localVarReturnType = new GenericType<List<String>>() {};

    return apiClient.invokeAPI(
        "AwsIntegrationApi.listAvailableAWSNamespaces",
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

  /** Manage optional parameters to updateAWSAccount. */
  public static class UpdateAWSAccountOptionalParameters {
    private String accountId;
    private String roleName;
    private String accessKeyId;

    /**
     * Set accountId
     *
     * @param accountId Only return AWS accounts that matches this &#x60;account_id&#x60;.
     *     (optional)
     * @return UpdateAWSAccountOptionalParameters
     */
    public UpdateAWSAccountOptionalParameters accountId(String accountId) {
      this.accountId = accountId;
      return this;
    }

    /**
     * Set roleName
     *
     * @param roleName Only return AWS accounts that match this &#x60;role_name&#x60;. Required if
     *     &#x60;account_id&#x60; is specified. (optional)
     * @return UpdateAWSAccountOptionalParameters
     */
    public UpdateAWSAccountOptionalParameters roleName(String roleName) {
      this.roleName = roleName;
      return this;
    }

    /**
     * Set accessKeyId
     *
     * @param accessKeyId Only return AWS accounts that matches this &#x60;access_key_id&#x60;.
     *     Required if none of the other two options are specified. (optional)
     * @return UpdateAWSAccountOptionalParameters
     */
    public UpdateAWSAccountOptionalParameters accessKeyId(String accessKeyId) {
      this.accessKeyId = accessKeyId;
      return this;
    }
  }

  /**
   * Update an AWS integration Update a Datadog-Amazon Web Services integration.
   *
   * @param body AWS request object (required)
   * @return Object
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict Error </td><td>  -  </td></tr>
   *     </table>
   */
  public Object updateAWSAccount(AWSAccount body) throws ApiException {
    return updateAWSAccountWithHttpInfo(body, new UpdateAWSAccountOptionalParameters()).getData();
  }

  /**
   * Update an AWS integration Update a Datadog-Amazon Web Services integration.
   *
   * @param body AWS request object (required)
   * @param parameters Optional parameters for the request.
   * @return Object
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><th> Status Code </th><th> Description </th><th> Response Headers </th></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict Error </td><td>  -  </td></tr>
   *     </table>
   */
  public Object updateAWSAccount(AWSAccount body, UpdateAWSAccountOptionalParameters parameters)
      throws ApiException {
    return updateAWSAccountWithHttpInfo(body, parameters).getData();
  }

  /**
   * Update an AWS integration Update a Datadog-Amazon Web Services integration.
   *
   * @param body AWS request object (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict Error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Object> updateAWSAccountWithHttpInfo(
      AWSAccount body, UpdateAWSAccountOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateAWSAccount");
    }
    String accountId = parameters.accountId;
    String roleName = parameters.roleName;
    String accessKeyId = parameters.accessKeyId;
    // create path and map variables
    String localVarPath = "/api/v1/integration/aws";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "account_id", accountId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "role_name", roleName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "access_key_id", accessKeyId));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "updateAWSAccount");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};

    return apiClient.invokeAPI(
        "AwsIntegrationApi.updateAWSAccount",
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
