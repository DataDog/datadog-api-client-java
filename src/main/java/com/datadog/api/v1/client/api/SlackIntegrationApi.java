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
import java.util.concurrent.CompletableFuture;
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
   * Create a Slack integration channel
   *
   * <p>See {@link #createSlackIntegrationChannelWithHttpInfo}.
   *
   * @param accountName Your Slack account name. (required)
   * @param body Payload describing Slack channel to be created (required)
   * @return SlackIntegrationChannel
   * @throws ApiException if fails to make API call
   */
  public SlackIntegrationChannel createSlackIntegrationChannel(
      String accountName, SlackIntegrationChannel body) throws ApiException {
    return createSlackIntegrationChannelWithHttpInfo(accountName, body).getData();
  }

  public CompletableFuture<SlackIntegrationChannel> createSlackIntegrationChannelAsync(
      String accountName, SlackIntegrationChannel body) {
    return createSlackIntegrationChannelWithHttpInfoAsync(accountName, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a Slack integration channel
   *
   * <p>Add a channel to your Datadog-Slack integration.
   *
   * @param accountName Your Slack account name. (required)
   * @param body Payload describing Slack channel to be created (required)
   * @return ApiResponse&lt;SlackIntegrationChannel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Item Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SlackIntegrationChannel> createSlackIntegrationChannelWithHttpInfo(
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

  /**
   * Create a Slack integration channel
   *
   * <p>See {@link #createSlackIntegrationChannelWithHttpInfo}.
   *
   * @param accountName Your Slack account name. (required)
   * @param body Payload describing Slack channel to be created (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SlackIntegrationChannel&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SlackIntegrationChannel>>
      createSlackIntegrationChannelWithHttpInfoAsync(
          String accountName, SlackIntegrationChannel body) {
    Object localVarPostBody = body;

    // verify the required parameter 'accountName' is set
    if (accountName == null) {
      CompletableFuture<ApiResponse<SlackIntegrationChannel>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'accountName' when calling"
                  + " createSlackIntegrationChannel"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<SlackIntegrationChannel>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling createSlackIntegrationChannel"));
      return result;
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

    return apiClient.invokeAPIAsync(
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

  /**
   * Get a Slack integration channel
   *
   * <p>See {@link #getSlackIntegrationChannelWithHttpInfo}.
   *
   * @param accountName Your Slack account name. (required)
   * @param channelName The name of the Slack channel being operated on. (required)
   * @return SlackIntegrationChannel
   * @throws ApiException if fails to make API call
   */
  public SlackIntegrationChannel getSlackIntegrationChannel(String accountName, String channelName)
      throws ApiException {
    return getSlackIntegrationChannelWithHttpInfo(accountName, channelName).getData();
  }

  public CompletableFuture<SlackIntegrationChannel> getSlackIntegrationChannelAsync(
      String accountName, String channelName) {
    return getSlackIntegrationChannelWithHttpInfoAsync(accountName, channelName)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a Slack integration channel
   *
   * <p>Get a channel configured for your Datadog-Slack integration.
   *
   * @param accountName Your Slack account name. (required)
   * @param channelName The name of the Slack channel being operated on. (required)
   * @return ApiResponse&lt;SlackIntegrationChannel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Item Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SlackIntegrationChannel> getSlackIntegrationChannelWithHttpInfo(
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

  /**
   * Get a Slack integration channel
   *
   * <p>See {@link #getSlackIntegrationChannelWithHttpInfo}.
   *
   * @param accountName Your Slack account name. (required)
   * @param channelName The name of the Slack channel being operated on. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SlackIntegrationChannel&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SlackIntegrationChannel>>
      getSlackIntegrationChannelWithHttpInfoAsync(String accountName, String channelName) {
    Object localVarPostBody = null;

    // verify the required parameter 'accountName' is set
    if (accountName == null) {
      CompletableFuture<ApiResponse<SlackIntegrationChannel>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'accountName' when calling"
                  + " getSlackIntegrationChannel"));
      return result;
    }

    // verify the required parameter 'channelName' is set
    if (channelName == null) {
      CompletableFuture<ApiResponse<SlackIntegrationChannel>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'channelName' when calling"
                  + " getSlackIntegrationChannel"));
      return result;
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

    return apiClient.invokeAPIAsync(
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

  /**
   * Get all channels in a Slack integration
   *
   * <p>See {@link #getSlackIntegrationChannelsWithHttpInfo}.
   *
   * @param accountName Your Slack account name. (required)
   * @return List&lt;SlackIntegrationChannel&gt;
   * @throws ApiException if fails to make API call
   */
  public List<SlackIntegrationChannel> getSlackIntegrationChannels(String accountName)
      throws ApiException {
    return getSlackIntegrationChannelsWithHttpInfo(accountName).getData();
  }

  public CompletableFuture<List<SlackIntegrationChannel>> getSlackIntegrationChannelsAsync(
      String accountName) {
    return getSlackIntegrationChannelsWithHttpInfoAsync(accountName)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get all channels in a Slack integration
   *
   * <p>Get a list of all channels configured for your Datadog-Slack integration.
   *
   * @param accountName Your Slack account name. (required)
   * @return ApiResponse&lt;List&lt;SlackIntegrationChannel&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Item Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<List<SlackIntegrationChannel>> getSlackIntegrationChannelsWithHttpInfo(
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

  /**
   * Get all channels in a Slack integration
   *
   * <p>See {@link #getSlackIntegrationChannelsWithHttpInfo}.
   *
   * @param accountName Your Slack account name. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;List&lt;SlackIntegrationChannel&gt;&gt;&gt;
   */
  public CompletableFuture<ApiResponse<List<SlackIntegrationChannel>>>
      getSlackIntegrationChannelsWithHttpInfoAsync(String accountName) {
    Object localVarPostBody = null;

    // verify the required parameter 'accountName' is set
    if (accountName == null) {
      CompletableFuture<ApiResponse<List<SlackIntegrationChannel>>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'accountName' when calling"
                  + " getSlackIntegrationChannels"));
      return result;
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

    return apiClient.invokeAPIAsync(
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

  /**
   * Remove a Slack integration channel
   *
   * <p>See {@link #removeSlackIntegrationChannelWithHttpInfo}.
   *
   * @param accountName Your Slack account name. (required)
   * @param channelName The name of the Slack channel being operated on. (required)
   * @throws ApiException if fails to make API call
   */
  public void removeSlackIntegrationChannel(String accountName, String channelName)
      throws ApiException {
    removeSlackIntegrationChannelWithHttpInfo(accountName, channelName);
  }

  public CompletableFuture<Void> removeSlackIntegrationChannelAsync(
      String accountName, String channelName) {
    return removeSlackIntegrationChannelWithHttpInfoAsync(accountName, channelName)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Remove a Slack integration channel
   *
   * <p>Remove a channel from your Datadog-Slack integration.
   *
   * @param accountName Your Slack account name. (required)
   * @param channelName The name of the Slack channel being operated on. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> The channel was removed successfully. </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Item Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> removeSlackIntegrationChannelWithHttpInfo(
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

  /**
   * Remove a Slack integration channel
   *
   * <p>See {@link #removeSlackIntegrationChannelWithHttpInfo}.
   *
   * @param accountName Your Slack account name. (required)
   * @param channelName The name of the Slack channel being operated on. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> removeSlackIntegrationChannelWithHttpInfoAsync(
      String accountName, String channelName) {
    Object localVarPostBody = null;

    // verify the required parameter 'accountName' is set
    if (accountName == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'accountName' when calling"
                  + " removeSlackIntegrationChannel"));
      return result;
    }

    // verify the required parameter 'channelName' is set
    if (channelName == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'channelName' when calling"
                  + " removeSlackIntegrationChannel"));
      return result;
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

    return apiClient.invokeAPIAsync(
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

  /**
   * Update a Slack integration channel
   *
   * <p>See {@link #updateSlackIntegrationChannelWithHttpInfo}.
   *
   * @param accountName Your Slack account name. (required)
   * @param channelName The name of the Slack channel being operated on. (required)
   * @param body Payload describing fields and values to be updated. (required)
   * @return SlackIntegrationChannel
   * @throws ApiException if fails to make API call
   */
  public SlackIntegrationChannel updateSlackIntegrationChannel(
      String accountName, String channelName, SlackIntegrationChannel body) throws ApiException {
    return updateSlackIntegrationChannelWithHttpInfo(accountName, channelName, body).getData();
  }

  public CompletableFuture<SlackIntegrationChannel> updateSlackIntegrationChannelAsync(
      String accountName, String channelName, SlackIntegrationChannel body) {
    return updateSlackIntegrationChannelWithHttpInfoAsync(accountName, channelName, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update a Slack integration channel
   *
   * <p>Update a channel used in your Datadog-Slack integration.
   *
   * @param accountName Your Slack account name. (required)
   * @param channelName The name of the Slack channel being operated on. (required)
   * @param body Payload describing fields and values to be updated. (required)
   * @return ApiResponse&lt;SlackIntegrationChannel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Item Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SlackIntegrationChannel> updateSlackIntegrationChannelWithHttpInfo(
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

  /**
   * Update a Slack integration channel
   *
   * <p>See {@link #updateSlackIntegrationChannelWithHttpInfo}.
   *
   * @param accountName Your Slack account name. (required)
   * @param channelName The name of the Slack channel being operated on. (required)
   * @param body Payload describing fields and values to be updated. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SlackIntegrationChannel&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SlackIntegrationChannel>>
      updateSlackIntegrationChannelWithHttpInfoAsync(
          String accountName, String channelName, SlackIntegrationChannel body) {
    Object localVarPostBody = body;

    // verify the required parameter 'accountName' is set
    if (accountName == null) {
      CompletableFuture<ApiResponse<SlackIntegrationChannel>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'accountName' when calling"
                  + " updateSlackIntegrationChannel"));
      return result;
    }

    // verify the required parameter 'channelName' is set
    if (channelName == null) {
      CompletableFuture<ApiResponse<SlackIntegrationChannel>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'channelName' when calling"
                  + " updateSlackIntegrationChannel"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<SlackIntegrationChannel>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling updateSlackIntegrationChannel"));
      return result;
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

    return apiClient.invokeAPIAsync(
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
}
