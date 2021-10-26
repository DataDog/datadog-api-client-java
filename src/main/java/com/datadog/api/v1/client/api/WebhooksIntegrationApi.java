package com.datadog.api.v1.client.api;

import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.ApiResponse;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.Pair;
import com.datadog.api.v1.client.model.WebhooksIntegration;
import com.datadog.api.v1.client.model.WebhooksIntegrationCustomVariable;
import com.datadog.api.v1.client.model.WebhooksIntegrationCustomVariableResponse;
import com.datadog.api.v1.client.model.WebhooksIntegrationCustomVariableUpdateRequest;
import com.datadog.api.v1.client.model.WebhooksIntegrationUpdateRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WebhooksIntegrationApi {
  private ApiClient apiClient;

  public WebhooksIntegrationApi() {
    this(Configuration.getDefaultApiClient());
  }

  public WebhooksIntegrationApi(ApiClient apiClient) {
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
   * Create a webhooks integration Creates an endpoint with the name
   * &#x60;&lt;WEBHOOK_NAME&gt;&#x60;.
   *
   * @param body Create a webhooks integration request body. (required)
   * @return WebhooksIntegration
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *     </table>
   */
  public WebhooksIntegration createWebhooksIntegration(WebhooksIntegration body)
      throws ApiException {
    return createWebhooksIntegrationWithHttpInfo(body).getData();
  }

  /**
   * Create a webhooks integration Creates an endpoint with the name
   * &#x60;&lt;WEBHOOK_NAME&gt;&#x60;.
   *
   * @param body Create a webhooks integration request body. (required)
   * @return ApiResponse&lt;WebhooksIntegration&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "createWebhooksIntegration");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<WebhooksIntegration> localVarReturnType = new GenericType<WebhooksIntegration>() {};

    return apiClient.invokeAPI(
        "WebhooksIntegrationApi.createWebhooksIntegration",
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
   * Create a custom variable Creates an endpoint with the name
   * &#x60;&lt;CUSTOM_VARIABLE_NAME&gt;&#x60;.
   *
   * @param body Define a custom variable request body. (required)
   * @return WebhooksIntegrationCustomVariableResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *     </table>
   */
  public WebhooksIntegrationCustomVariableResponse createWebhooksIntegrationCustomVariable(
      WebhooksIntegrationCustomVariable body) throws ApiException {
    return createWebhooksIntegrationCustomVariableWithHttpInfo(body).getData();
  }

  /**
   * Create a custom variable Creates an endpoint with the name
   * &#x60;&lt;CUSTOM_VARIABLE_NAME&gt;&#x60;.
   *
   * @param body Define a custom variable request body. (required)
   * @return ApiResponse&lt;WebhooksIntegrationCustomVariableResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "createWebhooksIntegrationCustomVariable");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<WebhooksIntegrationCustomVariableResponse> localVarReturnType =
        new GenericType<WebhooksIntegrationCustomVariableResponse>() {};

    return apiClient.invokeAPI(
        "WebhooksIntegrationApi.createWebhooksIntegrationCustomVariable",
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
   * Delete a webhook Deletes the endpoint with the name &#x60;&lt;WEBHOOK NAME&gt;&#x60;.
   *
   * @param webhookName The name of the webhook. (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Item Not Found </td><td>  -  </td></tr>
   *     </table>
   */
  public void deleteWebhooksIntegration(String webhookName) throws ApiException {
    deleteWebhooksIntegrationWithHttpInfo(webhookName);
  }

  /**
   * Delete a webhook Deletes the endpoint with the name &#x60;&lt;WEBHOOK NAME&gt;&#x60;.
   *
   * @param webhookName The name of the webhook. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Item Not Found </td><td>  -  </td></tr>
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "deleteWebhooksIntegration");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    return apiClient.invokeAPI(
        "WebhooksIntegrationApi.deleteWebhooksIntegration",
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
   * Delete a custom variable Deletes the endpoint with the name
   * &#x60;&lt;CUSTOM_VARIABLE_NAME&gt;&#x60;.
   *
   * @param customVariableName The name of the custom variable. (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Item Not Found </td><td>  -  </td></tr>
   *     </table>
   */
  public void deleteWebhooksIntegrationCustomVariable(String customVariableName)
      throws ApiException {
    deleteWebhooksIntegrationCustomVariableWithHttpInfo(customVariableName);
  }

  /**
   * Delete a custom variable Deletes the endpoint with the name
   * &#x60;&lt;CUSTOM_VARIABLE_NAME&gt;&#x60;.
   *
   * @param customVariableName The name of the custom variable. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Item Not Found </td><td>  -  </td></tr>
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "deleteWebhooksIntegrationCustomVariable");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    return apiClient.invokeAPI(
        "WebhooksIntegrationApi.deleteWebhooksIntegrationCustomVariable",
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
   * Get a webhook integration Gets the content of the webhook with the name
   * &#x60;&lt;WEBHOOK_NAME&gt;&#x60;.
   *
   * @param webhookName The name of the webhook. (required)
   * @return WebhooksIntegration
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Item Not Found </td><td>  -  </td></tr>
   *     </table>
   */
  public WebhooksIntegration getWebhooksIntegration(String webhookName) throws ApiException {
    return getWebhooksIntegrationWithHttpInfo(webhookName).getData();
  }

  /**
   * Get a webhook integration Gets the content of the webhook with the name
   * &#x60;&lt;WEBHOOK_NAME&gt;&#x60;.
   *
   * @param webhookName The name of the webhook. (required)
   * @return ApiResponse&lt;WebhooksIntegration&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Item Not Found </td><td>  -  </td></tr>
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getWebhooksIntegration");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<WebhooksIntegration> localVarReturnType = new GenericType<WebhooksIntegration>() {};

    return apiClient.invokeAPI(
        "WebhooksIntegrationApi.getWebhooksIntegration",
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
   * Get a custom variable Shows the content of the custom variable with the name
   * &#x60;&lt;CUSTOM_VARIABLE_NAME&gt;&#x60;. If the custom variable is secret, the value does not
   * return in the response payload.
   *
   * @param customVariableName The name of the custom variable. (required)
   * @return WebhooksIntegrationCustomVariableResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Item Not Found </td><td>  -  </td></tr>
   *     </table>
   */
  public WebhooksIntegrationCustomVariableResponse getWebhooksIntegrationCustomVariable(
      String customVariableName) throws ApiException {
    return getWebhooksIntegrationCustomVariableWithHttpInfo(customVariableName).getData();
  }

  /**
   * Get a custom variable Shows the content of the custom variable with the name
   * &#x60;&lt;CUSTOM_VARIABLE_NAME&gt;&#x60;. If the custom variable is secret, the value does not
   * return in the response payload.
   *
   * @param customVariableName The name of the custom variable. (required)
   * @return ApiResponse&lt;WebhooksIntegrationCustomVariableResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Item Not Found </td><td>  -  </td></tr>
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getWebhooksIntegrationCustomVariable");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<WebhooksIntegrationCustomVariableResponse> localVarReturnType =
        new GenericType<WebhooksIntegrationCustomVariableResponse>() {};

    return apiClient.invokeAPI(
        "WebhooksIntegrationApi.getWebhooksIntegrationCustomVariable",
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
   * Update a webhook Updates the endpoint with the name &#x60;&lt;WEBHOOK_NAME&gt;&#x60;.
   *
   * @param webhookName The name of the webhook. (required)
   * @param body Update an existing Datadog-Webhooks integration. (required)
   * @return WebhooksIntegration
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Item Not Found </td><td>  -  </td></tr>
   *     </table>
   */
  public WebhooksIntegration updateWebhooksIntegration(
      String webhookName, WebhooksIntegrationUpdateRequest body) throws ApiException {
    return updateWebhooksIntegrationWithHttpInfo(webhookName, body).getData();
  }

  /**
   * Update a webhook Updates the endpoint with the name &#x60;&lt;WEBHOOK_NAME&gt;&#x60;.
   *
   * @param webhookName The name of the webhook. (required)
   * @param body Update an existing Datadog-Webhooks integration. (required)
   * @return ApiResponse&lt;WebhooksIntegration&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Item Not Found </td><td>  -  </td></tr>
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "updateWebhooksIntegration");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<WebhooksIntegration> localVarReturnType = new GenericType<WebhooksIntegration>() {};

    return apiClient.invokeAPI(
        "WebhooksIntegrationApi.updateWebhooksIntegration",
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
   * Update a custom variable Updates the endpoint with the name
   * &#x60;&lt;CUSTOM_VARIABLE_NAME&gt;&#x60;.
   *
   * @param customVariableName The name of the custom variable. (required)
   * @param body Update an existing custom variable request body. (required)
   * @return WebhooksIntegrationCustomVariableResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Item Not Found </td><td>  -  </td></tr>
   *     </table>
   */
  public WebhooksIntegrationCustomVariableResponse updateWebhooksIntegrationCustomVariable(
      String customVariableName, WebhooksIntegrationCustomVariableUpdateRequest body)
      throws ApiException {
    return updateWebhooksIntegrationCustomVariableWithHttpInfo(customVariableName, body).getData();
  }

  /**
   * Update a custom variable Updates the endpoint with the name
   * &#x60;&lt;CUSTOM_VARIABLE_NAME&gt;&#x60;.
   *
   * @param customVariableName The name of the custom variable. (required)
   * @param body Update an existing custom variable request body. (required)
   * @return ApiResponse&lt;WebhooksIntegrationCustomVariableResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Item Not Found </td><td>  -  </td></tr>
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "updateWebhooksIntegrationCustomVariable");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<WebhooksIntegrationCustomVariableResponse> localVarReturnType =
        new GenericType<WebhooksIntegrationCustomVariableResponse>() {};

    return apiClient.invokeAPI(
        "WebhooksIntegrationApi.updateWebhooksIntegrationCustomVariable",
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
