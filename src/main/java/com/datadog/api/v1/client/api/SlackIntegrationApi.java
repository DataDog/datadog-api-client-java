package com.datadog.api.v1.client.api;

import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.ApiResponse;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.Pair;
import com.datadog.api.v1.client.model.SlackIntegrationChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SlackIntegrationApi {
  private ApiClient apiClient;

  public SlackIntegrationApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SlackIntegrationApi(ApiClient apiClient) {
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

  private ApiResponse<SlackIntegrationChannel> createSlackIntegrationChannelWithHttpInfo(
      String accountName, SlackIntegrationChannel body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'accountName' is set
    if (accountName == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountName' when calling"
              + " createSlackIntegrationChannel");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createSlackIntegrationChannel");
    }

    // create path and map variables
    String localVarPath =
        "/api/v1/integration/slack/configuration/accounts/{account_name}/channels"
            .replaceAll(
                "\\{" + "account_name" + "\\}", apiClient.escapeString(accountName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "createSlackIntegrationChannel");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<SlackIntegrationChannel> localVarReturnType =
        new GenericType<SlackIntegrationChannel>() {};

    return apiClient.invokeAPI(
        "SlackIntegrationApi.createSlackIntegrationChannel",
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

  public class APIcreateSlackIntegrationChannelRequest {
    private String accountName;
    private SlackIntegrationChannel body;

    private APIcreateSlackIntegrationChannelRequest(String accountName) {
      this.accountName = accountName;
    }

    /**
     * Set body
     *
     * @param body Payload describing Slack channel to be created (required)
     * @return APIcreateSlackIntegrationChannelRequest
     */
    public APIcreateSlackIntegrationChannelRequest body(SlackIntegrationChannel body) {
      this.body = body;
      return this;
    }

    /**
     * Execute createSlackIntegrationChannel request
     *
     * @return SlackIntegrationChannel
     * @throws ApiException if fails to make API call
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
     * <tr><td> 404 </td><td> Item Not Found </td><td>  -  </td></tr>
     * </table>
     */
    public SlackIntegrationChannel execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute createSlackIntegrationChannel request with HTTP info returned
     *
     * @return ApiResponse&lt;SlackIntegrationChannel&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
     * <tr><td> 404 </td><td> Item Not Found </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<SlackIntegrationChannel> executeWithHttpInfo() throws ApiException {
      return createSlackIntegrationChannelWithHttpInfo(accountName, body);
    }
  }

  /**
   * Create a Slack integration channel Add a channel to your Datadog-Slack integration.
   *
   * @param accountName Your Slack account name. (required)
   * @return createSlackIntegrationChannelRequest
   * @throws ApiException if fails to make API call
   */
  public APIcreateSlackIntegrationChannelRequest createSlackIntegrationChannel(String accountName)
      throws ApiException {
    return new APIcreateSlackIntegrationChannelRequest(accountName);
  }

  private ApiResponse<SlackIntegrationChannel> getSlackIntegrationChannelWithHttpInfo(
      String accountName, String channelName) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'accountName' is set
    if (accountName == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountName' when calling getSlackIntegrationChannel");
    }

    // verify the required parameter 'channelName' is set
    if (channelName == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'channelName' when calling getSlackIntegrationChannel");
    }

    // create path and map variables
    String localVarPath =
        "/api/v1/integration/slack/configuration/accounts/{account_name}/channels/{channel_name}"
            .replaceAll(
                "\\{" + "account_name" + "\\}", apiClient.escapeString(accountName.toString()))
            .replaceAll(
                "\\{" + "channel_name" + "\\}", apiClient.escapeString(channelName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getSlackIntegrationChannel");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<SlackIntegrationChannel> localVarReturnType =
        new GenericType<SlackIntegrationChannel>() {};

    return apiClient.invokeAPI(
        "SlackIntegrationApi.getSlackIntegrationChannel",
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

  public class APIgetSlackIntegrationChannelRequest {
    private String accountName;
    private String channelName;

    private APIgetSlackIntegrationChannelRequest(String accountName, String channelName) {
      this.accountName = accountName;
      this.channelName = channelName;
    }

    /**
     * Execute getSlackIntegrationChannel request
     *
     * @return SlackIntegrationChannel
     * @throws ApiException if fails to make API call
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
     * <tr><td> 404 </td><td> Item Not Found </td><td>  -  </td></tr>
     * </table>
     */
    public SlackIntegrationChannel execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getSlackIntegrationChannel request with HTTP info returned
     *
     * @return ApiResponse&lt;SlackIntegrationChannel&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
     * <tr><td> 404 </td><td> Item Not Found </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<SlackIntegrationChannel> executeWithHttpInfo() throws ApiException {
      return getSlackIntegrationChannelWithHttpInfo(accountName, channelName);
    }
  }

  /**
   * Get a Slack integration channel Get a channel configured for your Datadog-Slack integration.
   *
   * @param accountName Your Slack account name. (required)
   * @param channelName The name of the Slack channel being operated on. (required)
   * @return getSlackIntegrationChannelRequest
   * @throws ApiException if fails to make API call
   */
  public APIgetSlackIntegrationChannelRequest getSlackIntegrationChannel(
      String accountName, String channelName) throws ApiException {
    return new APIgetSlackIntegrationChannelRequest(accountName, channelName);
  }

  private ApiResponse<List<SlackIntegrationChannel>> getSlackIntegrationChannelsWithHttpInfo(
      String accountName) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'accountName' is set
    if (accountName == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountName' when calling getSlackIntegrationChannels");
    }

    // create path and map variables
    String localVarPath =
        "/api/v1/integration/slack/configuration/accounts/{account_name}/channels"
            .replaceAll(
                "\\{" + "account_name" + "\\}", apiClient.escapeString(accountName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getSlackIntegrationChannels");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<List<SlackIntegrationChannel>> localVarReturnType =
        new GenericType<List<SlackIntegrationChannel>>() {};

    return apiClient.invokeAPI(
        "SlackIntegrationApi.getSlackIntegrationChannels",
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

  public class APIgetSlackIntegrationChannelsRequest {
    private String accountName;

    private APIgetSlackIntegrationChannelsRequest(String accountName) {
      this.accountName = accountName;
    }

    /**
     * Execute getSlackIntegrationChannels request
     *
     * @return List&lt;SlackIntegrationChannel&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
     * <tr><td> 404 </td><td> Item Not Found </td><td>  -  </td></tr>
     * </table>
     */
    public List<SlackIntegrationChannel> execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getSlackIntegrationChannels request with HTTP info returned
     *
     * @return ApiResponse&lt;List&lt;SlackIntegrationChannel&gt;&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
     * <tr><td> 404 </td><td> Item Not Found </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<List<SlackIntegrationChannel>> executeWithHttpInfo() throws ApiException {
      return getSlackIntegrationChannelsWithHttpInfo(accountName);
    }
  }

  /**
   * Get all channels in a Slack integration Get a list of all channels configured for your
   * Datadog-Slack integration.
   *
   * @param accountName Your Slack account name. (required)
   * @return getSlackIntegrationChannelsRequest
   * @throws ApiException if fails to make API call
   */
  public APIgetSlackIntegrationChannelsRequest getSlackIntegrationChannels(String accountName)
      throws ApiException {
    return new APIgetSlackIntegrationChannelsRequest(accountName);
  }

  private ApiResponse<Void> removeSlackIntegrationChannelWithHttpInfo(
      String accountName, String channelName) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'accountName' is set
    if (accountName == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountName' when calling"
              + " removeSlackIntegrationChannel");
    }

    // verify the required parameter 'channelName' is set
    if (channelName == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'channelName' when calling"
              + " removeSlackIntegrationChannel");
    }

    // create path and map variables
    String localVarPath =
        "/api/v1/integration/slack/configuration/accounts/{account_name}/channels/{channel_name}"
            .replaceAll(
                "\\{" + "account_name" + "\\}", apiClient.escapeString(accountName.toString()))
            .replaceAll(
                "\\{" + "channel_name" + "\\}", apiClient.escapeString(channelName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "removeSlackIntegrationChannel");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    return apiClient.invokeAPI(
        "SlackIntegrationApi.removeSlackIntegrationChannel",
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

  public class APIremoveSlackIntegrationChannelRequest {
    private String accountName;
    private String channelName;

    private APIremoveSlackIntegrationChannelRequest(String accountName, String channelName) {
      this.accountName = accountName;
      this.channelName = channelName;
    }

    /**
     * Execute removeSlackIntegrationChannel request
     *
     * @throws ApiException if fails to make API call
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> The channel was removed successfully. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
     * <tr><td> 404 </td><td> Item Not Found </td><td>  -  </td></tr>
     * </table>
     */
    public void execute() throws ApiException {
      this.executeWithHttpInfo().getData();
    }

    /**
     * Execute removeSlackIntegrationChannel request with HTTP info returned
     *
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> The channel was removed successfully. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
     * <tr><td> 404 </td><td> Item Not Found </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
      return removeSlackIntegrationChannelWithHttpInfo(accountName, channelName);
    }
  }

  /**
   * Remove a Slack integration channel Remove a channel from your Datadog-Slack integration.
   *
   * @param accountName Your Slack account name. (required)
   * @param channelName The name of the Slack channel being operated on. (required)
   * @return removeSlackIntegrationChannelRequest
   * @throws ApiException if fails to make API call
   */
  public APIremoveSlackIntegrationChannelRequest removeSlackIntegrationChannel(
      String accountName, String channelName) throws ApiException {
    return new APIremoveSlackIntegrationChannelRequest(accountName, channelName);
  }

  private ApiResponse<SlackIntegrationChannel> updateSlackIntegrationChannelWithHttpInfo(
      String accountName, String channelName, SlackIntegrationChannel body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'accountName' is set
    if (accountName == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountName' when calling"
              + " updateSlackIntegrationChannel");
    }

    // verify the required parameter 'channelName' is set
    if (channelName == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'channelName' when calling"
              + " updateSlackIntegrationChannel");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateSlackIntegrationChannel");
    }

    // create path and map variables
    String localVarPath =
        "/api/v1/integration/slack/configuration/accounts/{account_name}/channels/{channel_name}"
            .replaceAll(
                "\\{" + "account_name" + "\\}", apiClient.escapeString(accountName.toString()))
            .replaceAll(
                "\\{" + "channel_name" + "\\}", apiClient.escapeString(channelName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "updateSlackIntegrationChannel");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<SlackIntegrationChannel> localVarReturnType =
        new GenericType<SlackIntegrationChannel>() {};

    return apiClient.invokeAPI(
        "SlackIntegrationApi.updateSlackIntegrationChannel",
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

  public class APIupdateSlackIntegrationChannelRequest {
    private String accountName;
    private String channelName;
    private SlackIntegrationChannel body;

    private APIupdateSlackIntegrationChannelRequest(String accountName, String channelName) {
      this.accountName = accountName;
      this.channelName = channelName;
    }

    /**
     * Set body
     *
     * @param body Payload describing fields and values to be updated. (required)
     * @return APIupdateSlackIntegrationChannelRequest
     */
    public APIupdateSlackIntegrationChannelRequest body(SlackIntegrationChannel body) {
      this.body = body;
      return this;
    }

    /**
     * Execute updateSlackIntegrationChannel request
     *
     * @return SlackIntegrationChannel
     * @throws ApiException if fails to make API call
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
     * <tr><td> 404 </td><td> Item Not Found </td><td>  -  </td></tr>
     * </table>
     */
    public SlackIntegrationChannel execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute updateSlackIntegrationChannel request with HTTP info returned
     *
     * @return ApiResponse&lt;SlackIntegrationChannel&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
     * <tr><td> 404 </td><td> Item Not Found </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<SlackIntegrationChannel> executeWithHttpInfo() throws ApiException {
      return updateSlackIntegrationChannelWithHttpInfo(accountName, channelName, body);
    }
  }

  /**
   * Update a Slack integration channel Update a channel used in your Datadog-Slack integration.
   *
   * @param accountName Your Slack account name. (required)
   * @param channelName The name of the Slack channel being operated on. (required)
   * @return updateSlackIntegrationChannelRequest
   * @throws ApiException if fails to make API call
   */
  public APIupdateSlackIntegrationChannelRequest updateSlackIntegrationChannel(
      String accountName, String channelName) throws ApiException {
    return new APIupdateSlackIntegrationChannelRequest(accountName, channelName);
  }
}
