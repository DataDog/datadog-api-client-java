package com.datadog.api.client.v1.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v1.model.WebhooksIntegration;
import com.datadog.api.client.v1.model.WebhooksIntegrationCustomVariable;
import com.datadog.api.client.v1.model.WebhooksIntegrationCustomVariableResponse;
import com.datadog.api.client.v1.model.WebhooksIntegrationCustomVariableUpdateRequest;
import com.datadog.api.client.v1.model.WebhooksIntegrationUpdateRequest;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class WebhooksIntegrationApi {
  private ApiClient apiClient;

  public WebhooksIntegrationApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public WebhooksIntegrationApi(ApiClient apiClient) {
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
   * Create a webhooks integration.
   *
   * <p>See {@link #createWebhooksIntegrationWithHttpInfo}.
   *
   * @param body Create a webhooks integration request body. (required)
   * @return WebhooksIntegration
   * @throws ApiException if fails to make API call
   */
  public WebhooksIntegration createWebhooksIntegration(WebhooksIntegration body)
      throws ApiException {
    return createWebhooksIntegrationWithHttpInfo(body).getData();
  }

  /**
   * Create a webhooks integration.
   *
   * <p>See {@link #createWebhooksIntegrationWithHttpInfoAsync}.
   *
   * @param body Create a webhooks integration request body. (required)
   * @return CompletableFuture&lt;WebhooksIntegration&gt;
   */
  public CompletableFuture<WebhooksIntegration> createWebhooksIntegrationAsync(
      WebhooksIntegration body) {
    return createWebhooksIntegrationWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Creates an endpoint with the name <code>&lt;WEBHOOK_NAME&gt;</code>.
   *
   * @param body Create a webhooks integration request body. (required)
   * @return ApiResponse&lt;WebhooksIntegration&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<WebhooksIntegration> createWebhooksIntegrationWithHttpInfo(
      WebhooksIntegration body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createWebhooksIntegration");
    }
    // create path and map variables
    String localVarPath = "/api/v1/integration/webhooks/configuration/webhooks";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v1.WebhooksIntegrationApi.createWebhooksIntegration",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<WebhooksIntegration>() {});
  }

  /**
   * Create a webhooks integration.
   *
   * <p>See {@link #createWebhooksIntegrationWithHttpInfo}.
   *
   * @param body Create a webhooks integration request body. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;WebhooksIntegration&gt;&gt;
   */
  public CompletableFuture<ApiResponse<WebhooksIntegration>>
      createWebhooksIntegrationWithHttpInfoAsync(WebhooksIntegration body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<WebhooksIntegration>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createWebhooksIntegration"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/integration/webhooks/configuration/webhooks";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1.WebhooksIntegrationApi.createWebhooksIntegration",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<WebhooksIntegration>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<WebhooksIntegration>() {});
  }

  /**
   * Create a custom variable.
   *
   * <p>See {@link #createWebhooksIntegrationCustomVariableWithHttpInfo}.
   *
   * @param body Define a custom variable request body. (required)
   * @return WebhooksIntegrationCustomVariableResponse
   * @throws ApiException if fails to make API call
   */
  public WebhooksIntegrationCustomVariableResponse createWebhooksIntegrationCustomVariable(
      WebhooksIntegrationCustomVariable body) throws ApiException {
    return createWebhooksIntegrationCustomVariableWithHttpInfo(body).getData();
  }

  /**
   * Create a custom variable.
   *
   * <p>See {@link #createWebhooksIntegrationCustomVariableWithHttpInfoAsync}.
   *
   * @param body Define a custom variable request body. (required)
   * @return CompletableFuture&lt;WebhooksIntegrationCustomVariableResponse&gt;
   */
  public CompletableFuture<WebhooksIntegrationCustomVariableResponse>
      createWebhooksIntegrationCustomVariableAsync(WebhooksIntegrationCustomVariable body) {
    return createWebhooksIntegrationCustomVariableWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Creates an endpoint with the name <code>&lt;CUSTOM_VARIABLE_NAME&gt;</code>.
   *
   * @param body Define a custom variable request body. (required)
   * @return ApiResponse&lt;WebhooksIntegrationCustomVariableResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<WebhooksIntegrationCustomVariableResponse>
      createWebhooksIntegrationCustomVariableWithHttpInfo(WebhooksIntegrationCustomVariable body)
          throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'body' when calling"
              + " createWebhooksIntegrationCustomVariable");
    }
    // create path and map variables
    String localVarPath = "/api/v1/integration/webhooks/configuration/custom-variables";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v1.WebhooksIntegrationApi.createWebhooksIntegrationCustomVariable",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<WebhooksIntegrationCustomVariableResponse>() {});
  }

  /**
   * Create a custom variable.
   *
   * <p>See {@link #createWebhooksIntegrationCustomVariableWithHttpInfo}.
   *
   * @param body Define a custom variable request body. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;WebhooksIntegrationCustomVariableResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<WebhooksIntegrationCustomVariableResponse>>
      createWebhooksIntegrationCustomVariableWithHttpInfoAsync(
          WebhooksIntegrationCustomVariable body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<WebhooksIntegrationCustomVariableResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " createWebhooksIntegrationCustomVariable"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/integration/webhooks/configuration/custom-variables";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1.WebhooksIntegrationApi.createWebhooksIntegrationCustomVariable",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<WebhooksIntegrationCustomVariableResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<WebhooksIntegrationCustomVariableResponse>() {});
  }

  /**
   * Delete a webhook.
   *
   * <p>See {@link #deleteWebhooksIntegrationWithHttpInfo}.
   *
   * @param webhookName The name of the webhook. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteWebhooksIntegration(String webhookName) throws ApiException {
    deleteWebhooksIntegrationWithHttpInfo(webhookName);
  }

  /**
   * Delete a webhook.
   *
   * <p>See {@link #deleteWebhooksIntegrationWithHttpInfoAsync}.
   *
   * @param webhookName The name of the webhook. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteWebhooksIntegrationAsync(String webhookName) {
    return deleteWebhooksIntegrationWithHttpInfoAsync(webhookName)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Deletes the endpoint with the name <code>&lt;WEBHOOK NAME&gt;</code>.
   *
   * @param webhookName The name of the webhook. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Item Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteWebhooksIntegrationWithHttpInfo(String webhookName)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'webhookName' is set
    if (webhookName == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'webhookName' when calling deleteWebhooksIntegration");
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/integration/webhooks/configuration/webhooks/{webhook_name}"
            .replaceAll(
                "\\{" + "webhook_name" + "\\}", apiClient.escapeString(webhookName.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v1.WebhooksIntegrationApi.deleteWebhooksIntegration",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Delete a webhook.
   *
   * <p>See {@link #deleteWebhooksIntegrationWithHttpInfo}.
   *
   * @param webhookName The name of the webhook. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteWebhooksIntegrationWithHttpInfoAsync(
      String webhookName) {
    Object localVarPostBody = null;

    // verify the required parameter 'webhookName' is set
    if (webhookName == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'webhookName' when calling"
                  + " deleteWebhooksIntegration"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/integration/webhooks/configuration/webhooks/{webhook_name}"
            .replaceAll(
                "\\{" + "webhook_name" + "\\}", apiClient.escapeString(webhookName.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1.WebhooksIntegrationApi.deleteWebhooksIntegration",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"*/*"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Delete a custom variable.
   *
   * <p>See {@link #deleteWebhooksIntegrationCustomVariableWithHttpInfo}.
   *
   * @param customVariableName The name of the custom variable. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteWebhooksIntegrationCustomVariable(String customVariableName)
      throws ApiException {
    deleteWebhooksIntegrationCustomVariableWithHttpInfo(customVariableName);
  }

  /**
   * Delete a custom variable.
   *
   * <p>See {@link #deleteWebhooksIntegrationCustomVariableWithHttpInfoAsync}.
   *
   * @param customVariableName The name of the custom variable. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteWebhooksIntegrationCustomVariableAsync(
      String customVariableName) {
    return deleteWebhooksIntegrationCustomVariableWithHttpInfoAsync(customVariableName)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Deletes the endpoint with the name <code>&lt;CUSTOM_VARIABLE_NAME&gt;</code>.
   *
   * @param customVariableName The name of the custom variable. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Item Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteWebhooksIntegrationCustomVariableWithHttpInfo(
      String customVariableName) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'customVariableName' is set
    if (customVariableName == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'customVariableName' when calling"
              + " deleteWebhooksIntegrationCustomVariable");
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/integration/webhooks/configuration/custom-variables/{custom_variable_name}"
            .replaceAll(
                "\\{" + "custom_variable_name" + "\\}",
                apiClient.escapeString(customVariableName.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v1.WebhooksIntegrationApi.deleteWebhooksIntegrationCustomVariable",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Delete a custom variable.
   *
   * <p>See {@link #deleteWebhooksIntegrationCustomVariableWithHttpInfo}.
   *
   * @param customVariableName The name of the custom variable. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>>
      deleteWebhooksIntegrationCustomVariableWithHttpInfoAsync(String customVariableName) {
    Object localVarPostBody = null;

    // verify the required parameter 'customVariableName' is set
    if (customVariableName == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'customVariableName' when calling"
                  + " deleteWebhooksIntegrationCustomVariable"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/integration/webhooks/configuration/custom-variables/{custom_variable_name}"
            .replaceAll(
                "\\{" + "custom_variable_name" + "\\}",
                apiClient.escapeString(customVariableName.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1.WebhooksIntegrationApi.deleteWebhooksIntegrationCustomVariable",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"*/*"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Get a webhook integration.
   *
   * <p>See {@link #getWebhooksIntegrationWithHttpInfo}.
   *
   * @param webhookName The name of the webhook. (required)
   * @return WebhooksIntegration
   * @throws ApiException if fails to make API call
   */
  public WebhooksIntegration getWebhooksIntegration(String webhookName) throws ApiException {
    return getWebhooksIntegrationWithHttpInfo(webhookName).getData();
  }

  /**
   * Get a webhook integration.
   *
   * <p>See {@link #getWebhooksIntegrationWithHttpInfoAsync}.
   *
   * @param webhookName The name of the webhook. (required)
   * @return CompletableFuture&lt;WebhooksIntegration&gt;
   */
  public CompletableFuture<WebhooksIntegration> getWebhooksIntegrationAsync(String webhookName) {
    return getWebhooksIntegrationWithHttpInfoAsync(webhookName)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Gets the content of the webhook with the name <code>&lt;WEBHOOK_NAME&gt;</code>.
   *
   * @param webhookName The name of the webhook. (required)
   * @return ApiResponse&lt;WebhooksIntegration&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Item Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<WebhooksIntegration> getWebhooksIntegrationWithHttpInfo(String webhookName)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'webhookName' is set
    if (webhookName == null) {
      throw new ApiException(
          400, "Missing the required parameter 'webhookName' when calling getWebhooksIntegration");
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/integration/webhooks/configuration/webhooks/{webhook_name}"
            .replaceAll(
                "\\{" + "webhook_name" + "\\}", apiClient.escapeString(webhookName.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v1.WebhooksIntegrationApi.getWebhooksIntegration",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<WebhooksIntegration>() {});
  }

  /**
   * Get a webhook integration.
   *
   * <p>See {@link #getWebhooksIntegrationWithHttpInfo}.
   *
   * @param webhookName The name of the webhook. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;WebhooksIntegration&gt;&gt;
   */
  public CompletableFuture<ApiResponse<WebhooksIntegration>>
      getWebhooksIntegrationWithHttpInfoAsync(String webhookName) {
    Object localVarPostBody = null;

    // verify the required parameter 'webhookName' is set
    if (webhookName == null) {
      CompletableFuture<ApiResponse<WebhooksIntegration>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'webhookName' when calling getWebhooksIntegration"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/integration/webhooks/configuration/webhooks/{webhook_name}"
            .replaceAll(
                "\\{" + "webhook_name" + "\\}", apiClient.escapeString(webhookName.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1.WebhooksIntegrationApi.getWebhooksIntegration",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<WebhooksIntegration>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<WebhooksIntegration>() {});
  }

  /**
   * Get a custom variable.
   *
   * <p>See {@link #getWebhooksIntegrationCustomVariableWithHttpInfo}.
   *
   * @param customVariableName The name of the custom variable. (required)
   * @return WebhooksIntegrationCustomVariableResponse
   * @throws ApiException if fails to make API call
   */
  public WebhooksIntegrationCustomVariableResponse getWebhooksIntegrationCustomVariable(
      String customVariableName) throws ApiException {
    return getWebhooksIntegrationCustomVariableWithHttpInfo(customVariableName).getData();
  }

  /**
   * Get a custom variable.
   *
   * <p>See {@link #getWebhooksIntegrationCustomVariableWithHttpInfoAsync}.
   *
   * @param customVariableName The name of the custom variable. (required)
   * @return CompletableFuture&lt;WebhooksIntegrationCustomVariableResponse&gt;
   */
  public CompletableFuture<WebhooksIntegrationCustomVariableResponse>
      getWebhooksIntegrationCustomVariableAsync(String customVariableName) {
    return getWebhooksIntegrationCustomVariableWithHttpInfoAsync(customVariableName)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Shows the content of the custom variable with the name <code>&lt;CUSTOM_VARIABLE_NAME&gt;
   * </code>.
   *
   * <p>If the custom variable is secret, the value does not return in the response payload.
   *
   * @param customVariableName The name of the custom variable. (required)
   * @return ApiResponse&lt;WebhooksIntegrationCustomVariableResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Item Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<WebhooksIntegrationCustomVariableResponse>
      getWebhooksIntegrationCustomVariableWithHttpInfo(String customVariableName)
          throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'customVariableName' is set
    if (customVariableName == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'customVariableName' when calling"
              + " getWebhooksIntegrationCustomVariable");
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/integration/webhooks/configuration/custom-variables/{custom_variable_name}"
            .replaceAll(
                "\\{" + "custom_variable_name" + "\\}",
                apiClient.escapeString(customVariableName.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v1.WebhooksIntegrationApi.getWebhooksIntegrationCustomVariable",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<WebhooksIntegrationCustomVariableResponse>() {});
  }

  /**
   * Get a custom variable.
   *
   * <p>See {@link #getWebhooksIntegrationCustomVariableWithHttpInfo}.
   *
   * @param customVariableName The name of the custom variable. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;WebhooksIntegrationCustomVariableResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<WebhooksIntegrationCustomVariableResponse>>
      getWebhooksIntegrationCustomVariableWithHttpInfoAsync(String customVariableName) {
    Object localVarPostBody = null;

    // verify the required parameter 'customVariableName' is set
    if (customVariableName == null) {
      CompletableFuture<ApiResponse<WebhooksIntegrationCustomVariableResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'customVariableName' when calling"
                  + " getWebhooksIntegrationCustomVariable"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/integration/webhooks/configuration/custom-variables/{custom_variable_name}"
            .replaceAll(
                "\\{" + "custom_variable_name" + "\\}",
                apiClient.escapeString(customVariableName.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1.WebhooksIntegrationApi.getWebhooksIntegrationCustomVariable",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<WebhooksIntegrationCustomVariableResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<WebhooksIntegrationCustomVariableResponse>() {});
  }

  /**
   * Update a webhook.
   *
   * <p>See {@link #updateWebhooksIntegrationWithHttpInfo}.
   *
   * @param webhookName The name of the webhook. (required)
   * @param body Update an existing Datadog-Webhooks integration. (required)
   * @return WebhooksIntegration
   * @throws ApiException if fails to make API call
   */
  public WebhooksIntegration updateWebhooksIntegration(
      String webhookName, WebhooksIntegrationUpdateRequest body) throws ApiException {
    return updateWebhooksIntegrationWithHttpInfo(webhookName, body).getData();
  }

  /**
   * Update a webhook.
   *
   * <p>See {@link #updateWebhooksIntegrationWithHttpInfoAsync}.
   *
   * @param webhookName The name of the webhook. (required)
   * @param body Update an existing Datadog-Webhooks integration. (required)
   * @return CompletableFuture&lt;WebhooksIntegration&gt;
   */
  public CompletableFuture<WebhooksIntegration> updateWebhooksIntegrationAsync(
      String webhookName, WebhooksIntegrationUpdateRequest body) {
    return updateWebhooksIntegrationWithHttpInfoAsync(webhookName, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Updates the endpoint with the name <code>&lt;WEBHOOK_NAME&gt;</code>.
   *
   * @param webhookName The name of the webhook. (required)
   * @param body Update an existing Datadog-Webhooks integration. (required)
   * @return ApiResponse&lt;WebhooksIntegration&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Item Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<WebhooksIntegration> updateWebhooksIntegrationWithHttpInfo(
      String webhookName, WebhooksIntegrationUpdateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'webhookName' is set
    if (webhookName == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'webhookName' when calling updateWebhooksIntegration");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateWebhooksIntegration");
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/integration/webhooks/configuration/webhooks/{webhook_name}"
            .replaceAll(
                "\\{" + "webhook_name" + "\\}", apiClient.escapeString(webhookName.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v1.WebhooksIntegrationApi.updateWebhooksIntegration",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "PUT",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<WebhooksIntegration>() {});
  }

  /**
   * Update a webhook.
   *
   * <p>See {@link #updateWebhooksIntegrationWithHttpInfo}.
   *
   * @param webhookName The name of the webhook. (required)
   * @param body Update an existing Datadog-Webhooks integration. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;WebhooksIntegration&gt;&gt;
   */
  public CompletableFuture<ApiResponse<WebhooksIntegration>>
      updateWebhooksIntegrationWithHttpInfoAsync(
          String webhookName, WebhooksIntegrationUpdateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'webhookName' is set
    if (webhookName == null) {
      CompletableFuture<ApiResponse<WebhooksIntegration>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'webhookName' when calling"
                  + " updateWebhooksIntegration"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<WebhooksIntegration>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateWebhooksIntegration"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/integration/webhooks/configuration/webhooks/{webhook_name}"
            .replaceAll(
                "\\{" + "webhook_name" + "\\}", apiClient.escapeString(webhookName.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1.WebhooksIntegrationApi.updateWebhooksIntegration",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<WebhooksIntegration>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "PUT",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<WebhooksIntegration>() {});
  }

  /**
   * Update a custom variable.
   *
   * <p>See {@link #updateWebhooksIntegrationCustomVariableWithHttpInfo}.
   *
   * @param customVariableName The name of the custom variable. (required)
   * @param body Update an existing custom variable request body. (required)
   * @return WebhooksIntegrationCustomVariableResponse
   * @throws ApiException if fails to make API call
   */
  public WebhooksIntegrationCustomVariableResponse updateWebhooksIntegrationCustomVariable(
      String customVariableName, WebhooksIntegrationCustomVariableUpdateRequest body)
      throws ApiException {
    return updateWebhooksIntegrationCustomVariableWithHttpInfo(customVariableName, body).getData();
  }

  /**
   * Update a custom variable.
   *
   * <p>See {@link #updateWebhooksIntegrationCustomVariableWithHttpInfoAsync}.
   *
   * @param customVariableName The name of the custom variable. (required)
   * @param body Update an existing custom variable request body. (required)
   * @return CompletableFuture&lt;WebhooksIntegrationCustomVariableResponse&gt;
   */
  public CompletableFuture<WebhooksIntegrationCustomVariableResponse>
      updateWebhooksIntegrationCustomVariableAsync(
          String customVariableName, WebhooksIntegrationCustomVariableUpdateRequest body) {
    return updateWebhooksIntegrationCustomVariableWithHttpInfoAsync(customVariableName, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Updates the endpoint with the name <code>&lt;CUSTOM_VARIABLE_NAME&gt;</code>.
   *
   * @param customVariableName The name of the custom variable. (required)
   * @param body Update an existing custom variable request body. (required)
   * @return ApiResponse&lt;WebhooksIntegrationCustomVariableResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Item Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<WebhooksIntegrationCustomVariableResponse>
      updateWebhooksIntegrationCustomVariableWithHttpInfo(
          String customVariableName, WebhooksIntegrationCustomVariableUpdateRequest body)
          throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'customVariableName' is set
    if (customVariableName == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'customVariableName' when calling"
              + " updateWebhooksIntegrationCustomVariable");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'body' when calling"
              + " updateWebhooksIntegrationCustomVariable");
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/integration/webhooks/configuration/custom-variables/{custom_variable_name}"
            .replaceAll(
                "\\{" + "custom_variable_name" + "\\}",
                apiClient.escapeString(customVariableName.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v1.WebhooksIntegrationApi.updateWebhooksIntegrationCustomVariable",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "PUT",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<WebhooksIntegrationCustomVariableResponse>() {});
  }

  /**
   * Update a custom variable.
   *
   * <p>See {@link #updateWebhooksIntegrationCustomVariableWithHttpInfo}.
   *
   * @param customVariableName The name of the custom variable. (required)
   * @param body Update an existing custom variable request body. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;WebhooksIntegrationCustomVariableResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<WebhooksIntegrationCustomVariableResponse>>
      updateWebhooksIntegrationCustomVariableWithHttpInfoAsync(
          String customVariableName, WebhooksIntegrationCustomVariableUpdateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'customVariableName' is set
    if (customVariableName == null) {
      CompletableFuture<ApiResponse<WebhooksIntegrationCustomVariableResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'customVariableName' when calling"
                  + " updateWebhooksIntegrationCustomVariable"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<WebhooksIntegrationCustomVariableResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " updateWebhooksIntegrationCustomVariable"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/integration/webhooks/configuration/custom-variables/{custom_variable_name}"
            .replaceAll(
                "\\{" + "custom_variable_name" + "\\}",
                apiClient.escapeString(customVariableName.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1.WebhooksIntegrationApi.updateWebhooksIntegrationCustomVariable",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<WebhooksIntegrationCustomVariableResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "PUT",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<WebhooksIntegrationCustomVariableResponse>() {});
  }
}
