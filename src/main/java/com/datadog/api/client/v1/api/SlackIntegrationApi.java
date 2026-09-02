
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
import com.datadog.api.client.v1.model.SlackIntegrationChannel;


@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SlackIntegrationApi {
  private ApiClient apiClient;
  public SlackIntegrationApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public SlackIntegrationApi(ApiClient apiClient) {
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
 * Create a Slack integration channel.
 *
 * See {@link #createSlackIntegrationChannelWithHttpInfo}.
 *
 * @param accountName Your Slack account name. (required)
 * @param body Payload describing Slack channel to be created (required)
 * @return SlackIntegrationChannel
 * @throws ApiException if fails to make API call
 */
  public SlackIntegrationChannel  createSlackIntegrationChannel(String accountName, SlackIntegrationChannel body) throws ApiException {
    return createSlackIntegrationChannelWithHttpInfo(accountName, body).getData();
  }

  /**
 * Create a Slack integration channel.
 *
 * See {@link #createSlackIntegrationChannelWithHttpInfoAsync}.
 *
 * @param accountName Your Slack account name. (required)
 * @param body Payload describing Slack channel to be created (required)
 * @return CompletableFuture&lt;SlackIntegrationChannel&gt;
 */
  public CompletableFuture<SlackIntegrationChannel>createSlackIntegrationChannelAsync(String accountName, SlackIntegrationChannel body) {
    return createSlackIntegrationChannelWithHttpInfoAsync(accountName, body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Add a channel to your Datadog-Slack integration.</p>
   *
   * @param accountName Your Slack account name. (required)
   * @param body Payload describing Slack channel to be created (required)
   * @return ApiResponse&lt;SlackIntegrationChannel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Item Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SlackIntegrationChannel> createSlackIntegrationChannelWithHttpInfo(String accountName, SlackIntegrationChannel body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'accountName' is set
    if (accountName == null) {
      throw new ApiException(400, "Missing the required parameter 'accountName' when calling createSlackIntegrationChannel");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createSlackIntegrationChannel");
    }
    // create path and map variables
    String localVarPath = "/api/v1/integration/slack/configuration/accounts/{account_name}/channels"
      .replaceAll("\\{" + "account_name" + "\\}", apiClient.escapeString(accountName.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v1.SlackIntegrationApi.createSlackIntegrationChannel", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SlackIntegrationChannel>() {});
  }

  /**
   * Create a Slack integration channel.
   *
   * See {@link #createSlackIntegrationChannelWithHttpInfo}.
   *
   * @param accountName Your Slack account name. (required)
   * @param body Payload describing Slack channel to be created (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SlackIntegrationChannel&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SlackIntegrationChannel>> createSlackIntegrationChannelWithHttpInfoAsync(String accountName, SlackIntegrationChannel body) {
    Object localVarPostBody = body;

    // verify the required parameter 'accountName' is set
    if (accountName == null) {
        CompletableFuture<ApiResponse<SlackIntegrationChannel>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'accountName' when calling createSlackIntegrationChannel"));
        return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<SlackIntegrationChannel>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling createSlackIntegrationChannel"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/integration/slack/configuration/accounts/{account_name}/channels"
      .replaceAll("\\{" + "account_name" + "\\}", apiClient.escapeString(accountName.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v1.SlackIntegrationApi.createSlackIntegrationChannel", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SlackIntegrationChannel>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SlackIntegrationChannel>() {});
  }

  /**
 * Get a Slack integration channel.
 *
 * See {@link #getSlackIntegrationChannelWithHttpInfo}.
 *
 * @param accountName Your Slack account name. (required)
 * @param channelName The name of the Slack channel being operated on. (required)
 * @return SlackIntegrationChannel
 * @throws ApiException if fails to make API call
 */
  public SlackIntegrationChannel  getSlackIntegrationChannel(String accountName, String channelName) throws ApiException {
    return getSlackIntegrationChannelWithHttpInfo(accountName, channelName).getData();
  }

  /**
 * Get a Slack integration channel.
 *
 * See {@link #getSlackIntegrationChannelWithHttpInfoAsync}.
 *
 * @param accountName Your Slack account name. (required)
 * @param channelName The name of the Slack channel being operated on. (required)
 * @return CompletableFuture&lt;SlackIntegrationChannel&gt;
 */
  public CompletableFuture<SlackIntegrationChannel>getSlackIntegrationChannelAsync(String accountName, String channelName) {
    return getSlackIntegrationChannelWithHttpInfoAsync(accountName, channelName).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get a channel configured for your Datadog-Slack integration.</p>
   *
   * @param accountName Your Slack account name. (required)
   * @param channelName The name of the Slack channel being operated on. (required)
   * @return ApiResponse&lt;SlackIntegrationChannel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Item Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SlackIntegrationChannel> getSlackIntegrationChannelWithHttpInfo(String accountName, String channelName) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'accountName' is set
    if (accountName == null) {
      throw new ApiException(400, "Missing the required parameter 'accountName' when calling getSlackIntegrationChannel");
    }

    // verify the required parameter 'channelName' is set
    if (channelName == null) {
      throw new ApiException(400, "Missing the required parameter 'channelName' when calling getSlackIntegrationChannel");
    }
    // create path and map variables
    String localVarPath = "/api/v1/integration/slack/configuration/accounts/{account_name}/channels/{channel_name}"
      .replaceAll("\\{" + "account_name" + "\\}", apiClient.escapeString(accountName.toString()))
      .replaceAll("\\{" + "channel_name" + "\\}", apiClient.escapeString(channelName.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v1.SlackIntegrationApi.getSlackIntegrationChannel", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SlackIntegrationChannel>() {});
  }

  /**
   * Get a Slack integration channel.
   *
   * See {@link #getSlackIntegrationChannelWithHttpInfo}.
   *
   * @param accountName Your Slack account name. (required)
   * @param channelName The name of the Slack channel being operated on. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SlackIntegrationChannel&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SlackIntegrationChannel>> getSlackIntegrationChannelWithHttpInfoAsync(String accountName, String channelName) {
    Object localVarPostBody = null;

    // verify the required parameter 'accountName' is set
    if (accountName == null) {
        CompletableFuture<ApiResponse<SlackIntegrationChannel>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'accountName' when calling getSlackIntegrationChannel"));
        return result;
    }

    // verify the required parameter 'channelName' is set
    if (channelName == null) {
        CompletableFuture<ApiResponse<SlackIntegrationChannel>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'channelName' when calling getSlackIntegrationChannel"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/integration/slack/configuration/accounts/{account_name}/channels/{channel_name}"
      .replaceAll("\\{" + "account_name" + "\\}", apiClient.escapeString(accountName.toString()))
      .replaceAll("\\{" + "channel_name" + "\\}", apiClient.escapeString(channelName.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v1.SlackIntegrationApi.getSlackIntegrationChannel", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SlackIntegrationChannel>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SlackIntegrationChannel>() {});
  }

  /**
 * Get all channels in a Slack integration.
 *
 * See {@link #getSlackIntegrationChannelsWithHttpInfo}.
 *
 * @param accountName Your Slack account name. (required)
 * @return List&lt;SlackIntegrationChannel&gt;
 * @throws ApiException if fails to make API call
 */
  public List<SlackIntegrationChannel>  getSlackIntegrationChannels(String accountName) throws ApiException {
    return getSlackIntegrationChannelsWithHttpInfo(accountName).getData();
  }

  /**
 * Get all channels in a Slack integration.
 *
 * See {@link #getSlackIntegrationChannelsWithHttpInfoAsync}.
 *
 * @param accountName Your Slack account name. (required)
 * @return CompletableFuture&lt;List&lt;SlackIntegrationChannel&gt;&gt;
 */
  public CompletableFuture<List<SlackIntegrationChannel>>getSlackIntegrationChannelsAsync(String accountName) {
    return getSlackIntegrationChannelsWithHttpInfoAsync(accountName).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get a list of all channels configured for your Datadog-Slack integration.</p>
   *
   * @param accountName Your Slack account name. (required)
   * @return ApiResponse&lt;List&lt;SlackIntegrationChannel&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Item Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<List<SlackIntegrationChannel>> getSlackIntegrationChannelsWithHttpInfo(String accountName) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'accountName' is set
    if (accountName == null) {
      throw new ApiException(400, "Missing the required parameter 'accountName' when calling getSlackIntegrationChannels");
    }
    // create path and map variables
    String localVarPath = "/api/v1/integration/slack/configuration/accounts/{account_name}/channels"
      .replaceAll("\\{" + "account_name" + "\\}", apiClient.escapeString(accountName.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v1.SlackIntegrationApi.getSlackIntegrationChannels", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<List<SlackIntegrationChannel>>() {});
  }

  /**
   * Get all channels in a Slack integration.
   *
   * See {@link #getSlackIntegrationChannelsWithHttpInfo}.
   *
   * @param accountName Your Slack account name. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;List&lt;SlackIntegrationChannel&gt;&gt;&gt;
   */
  public CompletableFuture<ApiResponse<List<SlackIntegrationChannel>>> getSlackIntegrationChannelsWithHttpInfoAsync(String accountName) {
    Object localVarPostBody = null;

    // verify the required parameter 'accountName' is set
    if (accountName == null) {
        CompletableFuture<ApiResponse<List<SlackIntegrationChannel>>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'accountName' when calling getSlackIntegrationChannels"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/integration/slack/configuration/accounts/{account_name}/channels"
      .replaceAll("\\{" + "account_name" + "\\}", apiClient.escapeString(accountName.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v1.SlackIntegrationApi.getSlackIntegrationChannels", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<List<SlackIntegrationChannel>>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<List<SlackIntegrationChannel>>() {});
  }

  /**
 * Remove a Slack integration channel.
 *
 * See {@link #removeSlackIntegrationChannelWithHttpInfo}.
 *
 * @param accountName Your Slack account name. (required)
 * @param channelName The name of the Slack channel being operated on. (required)
 * @throws ApiException if fails to make API call
 */
  public  void  removeSlackIntegrationChannel(String accountName, String channelName) throws ApiException {
    removeSlackIntegrationChannelWithHttpInfo(accountName, channelName);
  }

  /**
 * Remove a Slack integration channel.
 *
 * See {@link #removeSlackIntegrationChannelWithHttpInfoAsync}.
 *
 * @param accountName Your Slack account name. (required)
 * @param channelName The name of the Slack channel being operated on. (required)
 * @return CompletableFuture
 */
  public CompletableFuture<Void>removeSlackIntegrationChannelAsync(String accountName, String channelName) {
    return removeSlackIntegrationChannelWithHttpInfoAsync(accountName, channelName).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Remove a channel from your Datadog-Slack integration.</p>
   *
   * @param accountName Your Slack account name. (required)
   * @param channelName The name of the Slack channel being operated on. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> The channel was removed successfully. </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Item Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> removeSlackIntegrationChannelWithHttpInfo(String accountName, String channelName) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'accountName' is set
    if (accountName == null) {
      throw new ApiException(400, "Missing the required parameter 'accountName' when calling removeSlackIntegrationChannel");
    }

    // verify the required parameter 'channelName' is set
    if (channelName == null) {
      throw new ApiException(400, "Missing the required parameter 'channelName' when calling removeSlackIntegrationChannel");
    }
    // create path and map variables
    String localVarPath = "/api/v1/integration/slack/configuration/accounts/{account_name}/channels/{channel_name}"
      .replaceAll("\\{" + "account_name" + "\\}", apiClient.escapeString(accountName.toString()))
      .replaceAll("\\{" + "channel_name" + "\\}", apiClient.escapeString(channelName.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v1.SlackIntegrationApi.removeSlackIntegrationChannel", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("DELETE", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
   * Remove a Slack integration channel.
   *
   * See {@link #removeSlackIntegrationChannelWithHttpInfo}.
   *
   * @param accountName Your Slack account name. (required)
   * @param channelName The name of the Slack channel being operated on. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> removeSlackIntegrationChannelWithHttpInfoAsync(String accountName, String channelName) {
    Object localVarPostBody = null;

    // verify the required parameter 'accountName' is set
    if (accountName == null) {
        CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'accountName' when calling removeSlackIntegrationChannel"));
        return result;
    }

    // verify the required parameter 'channelName' is set
    if (channelName == null) {
        CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'channelName' when calling removeSlackIntegrationChannel"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/integration/slack/configuration/accounts/{account_name}/channels/{channel_name}"
      .replaceAll("\\{" + "account_name" + "\\}", apiClient.escapeString(accountName.toString()))
      .replaceAll("\\{" + "channel_name" + "\\}", apiClient.escapeString(channelName.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v1.SlackIntegrationApi.removeSlackIntegrationChannel", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("DELETE", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
 * Update a Slack integration channel.
 *
 * See {@link #updateSlackIntegrationChannelWithHttpInfo}.
 *
 * @param accountName Your Slack account name. (required)
 * @param channelName The name of the Slack channel being operated on. (required)
 * @param body Payload describing fields and values to be updated. (required)
 * @return SlackIntegrationChannel
 * @throws ApiException if fails to make API call
 */
  public SlackIntegrationChannel  updateSlackIntegrationChannel(String accountName, String channelName, SlackIntegrationChannel body) throws ApiException {
    return updateSlackIntegrationChannelWithHttpInfo(accountName, channelName, body).getData();
  }

  /**
 * Update a Slack integration channel.
 *
 * See {@link #updateSlackIntegrationChannelWithHttpInfoAsync}.
 *
 * @param accountName Your Slack account name. (required)
 * @param channelName The name of the Slack channel being operated on. (required)
 * @param body Payload describing fields and values to be updated. (required)
 * @return CompletableFuture&lt;SlackIntegrationChannel&gt;
 */
  public CompletableFuture<SlackIntegrationChannel>updateSlackIntegrationChannelAsync(String accountName, String channelName, SlackIntegrationChannel body) {
    return updateSlackIntegrationChannelWithHttpInfoAsync(accountName, channelName, body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Update a channel used in your Datadog-Slack integration.</p>
   *
   * @param accountName Your Slack account name. (required)
   * @param channelName The name of the Slack channel being operated on. (required)
   * @param body Payload describing fields and values to be updated. (required)
   * @return ApiResponse&lt;SlackIntegrationChannel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Item Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SlackIntegrationChannel> updateSlackIntegrationChannelWithHttpInfo(String accountName, String channelName, SlackIntegrationChannel body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'accountName' is set
    if (accountName == null) {
      throw new ApiException(400, "Missing the required parameter 'accountName' when calling updateSlackIntegrationChannel");
    }

    // verify the required parameter 'channelName' is set
    if (channelName == null) {
      throw new ApiException(400, "Missing the required parameter 'channelName' when calling updateSlackIntegrationChannel");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateSlackIntegrationChannel");
    }
    // create path and map variables
    String localVarPath = "/api/v1/integration/slack/configuration/accounts/{account_name}/channels/{channel_name}"
      .replaceAll("\\{" + "account_name" + "\\}", apiClient.escapeString(accountName.toString()))
      .replaceAll("\\{" + "channel_name" + "\\}", apiClient.escapeString(channelName.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v1.SlackIntegrationApi.updateSlackIntegrationChannel", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("PATCH", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SlackIntegrationChannel>() {});
  }

  /**
   * Update a Slack integration channel.
   *
   * See {@link #updateSlackIntegrationChannelWithHttpInfo}.
   *
   * @param accountName Your Slack account name. (required)
   * @param channelName The name of the Slack channel being operated on. (required)
   * @param body Payload describing fields and values to be updated. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SlackIntegrationChannel&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SlackIntegrationChannel>> updateSlackIntegrationChannelWithHttpInfoAsync(String accountName, String channelName, SlackIntegrationChannel body) {
    Object localVarPostBody = body;

    // verify the required parameter 'accountName' is set
    if (accountName == null) {
        CompletableFuture<ApiResponse<SlackIntegrationChannel>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'accountName' when calling updateSlackIntegrationChannel"));
        return result;
    }

    // verify the required parameter 'channelName' is set
    if (channelName == null) {
        CompletableFuture<ApiResponse<SlackIntegrationChannel>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'channelName' when calling updateSlackIntegrationChannel"));
        return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<SlackIntegrationChannel>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling updateSlackIntegrationChannel"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/integration/slack/configuration/accounts/{account_name}/channels/{channel_name}"
      .replaceAll("\\{" + "account_name" + "\\}", apiClient.escapeString(accountName.toString()))
      .replaceAll("\\{" + "channel_name" + "\\}", apiClient.escapeString(channelName.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v1.SlackIntegrationApi.updateSlackIntegrationChannel", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SlackIntegrationChannel>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("PATCH", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SlackIntegrationChannel>() {});
  }
}