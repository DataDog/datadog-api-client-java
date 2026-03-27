package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.ApplicationSecurityWafCustomRuleCreateRequest;
import com.datadog.api.client.v2.model.ApplicationSecurityWafCustomRuleListResponse;
import com.datadog.api.client.v2.model.ApplicationSecurityWafCustomRuleResponse;
import com.datadog.api.client.v2.model.ApplicationSecurityWafCustomRuleUpdateRequest;
import com.datadog.api.client.v2.model.ApplicationSecurityWafExclusionFilterCreateRequest;
import com.datadog.api.client.v2.model.ApplicationSecurityWafExclusionFilterResponse;
import com.datadog.api.client.v2.model.ApplicationSecurityWafExclusionFilterUpdateRequest;
import com.datadog.api.client.v2.model.ApplicationSecurityWafExclusionFiltersResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ApplicationSecurityApi {
  private ApiClient apiClient;

  public ApplicationSecurityApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public ApplicationSecurityApi(ApiClient apiClient) {
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
   * Create a WAF custom rule.
   *
   * <p>See {@link #createApplicationSecurityWafCustomRuleWithHttpInfo}.
   *
   * @param body The definition of the new WAF Custom Rule. (required)
   * @return ApplicationSecurityWafCustomRuleResponse
   * @throws ApiException if fails to make API call
   */
  public ApplicationSecurityWafCustomRuleResponse createApplicationSecurityWafCustomRule(
      ApplicationSecurityWafCustomRuleCreateRequest body) throws ApiException {
    return createApplicationSecurityWafCustomRuleWithHttpInfo(body).getData();
  }

  /**
   * Create a WAF custom rule.
   *
   * <p>See {@link #createApplicationSecurityWafCustomRuleWithHttpInfoAsync}.
   *
   * @param body The definition of the new WAF Custom Rule. (required)
   * @return CompletableFuture&lt;ApplicationSecurityWafCustomRuleResponse&gt;
   */
  public CompletableFuture<ApplicationSecurityWafCustomRuleResponse>
      createApplicationSecurityWafCustomRuleAsync(
          ApplicationSecurityWafCustomRuleCreateRequest body) {
    return createApplicationSecurityWafCustomRuleWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a new WAF custom rule with the given parameters.
   *
   * @param body The definition of the new WAF Custom Rule. (required)
   * @return ApiResponse&lt;ApplicationSecurityWafCustomRuleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Concurrent Modification </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ApplicationSecurityWafCustomRuleResponse>
      createApplicationSecurityWafCustomRuleWithHttpInfo(
          ApplicationSecurityWafCustomRuleCreateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'body' when calling"
              + " createApplicationSecurityWafCustomRule");
    }
    // create path and map variables
    String localVarPath = "/api/v2/remote_config/products/asm/waf/custom_rules";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ApplicationSecurityApi.createApplicationSecurityWafCustomRule",
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
        new GenericType<ApplicationSecurityWafCustomRuleResponse>() {});
  }

  /**
   * Create a WAF custom rule.
   *
   * <p>See {@link #createApplicationSecurityWafCustomRuleWithHttpInfo}.
   *
   * @param body The definition of the new WAF Custom Rule. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ApplicationSecurityWafCustomRuleResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ApplicationSecurityWafCustomRuleResponse>>
      createApplicationSecurityWafCustomRuleWithHttpInfoAsync(
          ApplicationSecurityWafCustomRuleCreateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<ApplicationSecurityWafCustomRuleResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " createApplicationSecurityWafCustomRule"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/remote_config/products/asm/waf/custom_rules";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ApplicationSecurityApi.createApplicationSecurityWafCustomRule",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ApplicationSecurityWafCustomRuleResponse>> result =
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
        new GenericType<ApplicationSecurityWafCustomRuleResponse>() {});
  }

  /**
   * Create a WAF exclusion filter.
   *
   * <p>See {@link #createApplicationSecurityWafExclusionFilterWithHttpInfo}.
   *
   * @param body The definition of the new WAF exclusion filter. (required)
   * @return ApplicationSecurityWafExclusionFilterResponse
   * @throws ApiException if fails to make API call
   */
  public ApplicationSecurityWafExclusionFilterResponse createApplicationSecurityWafExclusionFilter(
      ApplicationSecurityWafExclusionFilterCreateRequest body) throws ApiException {
    return createApplicationSecurityWafExclusionFilterWithHttpInfo(body).getData();
  }

  /**
   * Create a WAF exclusion filter.
   *
   * <p>See {@link #createApplicationSecurityWafExclusionFilterWithHttpInfoAsync}.
   *
   * @param body The definition of the new WAF exclusion filter. (required)
   * @return CompletableFuture&lt;ApplicationSecurityWafExclusionFilterResponse&gt;
   */
  public CompletableFuture<ApplicationSecurityWafExclusionFilterResponse>
      createApplicationSecurityWafExclusionFilterAsync(
          ApplicationSecurityWafExclusionFilterCreateRequest body) {
    return createApplicationSecurityWafExclusionFilterWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a new WAF exclusion filter with the given parameters.
   *
   * <p>A request matched by an exclusion filter will be ignored by the Application Security WAF
   * product. Go to https://app.datadoghq.com/security/appsec/passlist to review existing exclusion
   * filters (also called passlist entries).
   *
   * @param body The definition of the new WAF exclusion filter. (required)
   * @return ApiResponse&lt;ApplicationSecurityWafExclusionFilterResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Concurrent Modification </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ApplicationSecurityWafExclusionFilterResponse>
      createApplicationSecurityWafExclusionFilterWithHttpInfo(
          ApplicationSecurityWafExclusionFilterCreateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'body' when calling"
              + " createApplicationSecurityWafExclusionFilter");
    }
    // create path and map variables
    String localVarPath = "/api/v2/remote_config/products/asm/waf/exclusion_filters";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ApplicationSecurityApi.createApplicationSecurityWafExclusionFilter",
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
        new GenericType<ApplicationSecurityWafExclusionFilterResponse>() {});
  }

  /**
   * Create a WAF exclusion filter.
   *
   * <p>See {@link #createApplicationSecurityWafExclusionFilterWithHttpInfo}.
   *
   * @param body The definition of the new WAF exclusion filter. (required)
   * @return
   *     CompletableFuture&lt;ApiResponse&lt;ApplicationSecurityWafExclusionFilterResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ApplicationSecurityWafExclusionFilterResponse>>
      createApplicationSecurityWafExclusionFilterWithHttpInfoAsync(
          ApplicationSecurityWafExclusionFilterCreateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<ApplicationSecurityWafExclusionFilterResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " createApplicationSecurityWafExclusionFilter"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/remote_config/products/asm/waf/exclusion_filters";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ApplicationSecurityApi.createApplicationSecurityWafExclusionFilter",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ApplicationSecurityWafExclusionFilterResponse>> result =
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
        new GenericType<ApplicationSecurityWafExclusionFilterResponse>() {});
  }

  /**
   * Delete a WAF Custom Rule.
   *
   * <p>See {@link #deleteApplicationSecurityWafCustomRuleWithHttpInfo}.
   *
   * @param customRuleId The ID of the custom rule. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteApplicationSecurityWafCustomRule(String customRuleId) throws ApiException {
    deleteApplicationSecurityWafCustomRuleWithHttpInfo(customRuleId);
  }

  /**
   * Delete a WAF Custom Rule.
   *
   * <p>See {@link #deleteApplicationSecurityWafCustomRuleWithHttpInfoAsync}.
   *
   * @param customRuleId The ID of the custom rule. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteApplicationSecurityWafCustomRuleAsync(String customRuleId) {
    return deleteApplicationSecurityWafCustomRuleWithHttpInfoAsync(customRuleId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete a specific WAF custom rule.
   *
   * @param customRuleId The ID of the custom rule. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Concurrent Modification </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteApplicationSecurityWafCustomRuleWithHttpInfo(String customRuleId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'customRuleId' is set
    if (customRuleId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'customRuleId' when calling"
              + " deleteApplicationSecurityWafCustomRule");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/remote_config/products/asm/waf/custom_rules/{custom_rule_id}"
            .replaceAll(
                "\\{" + "custom_rule_id" + "\\}", apiClient.escapeString(customRuleId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ApplicationSecurityApi.deleteApplicationSecurityWafCustomRule",
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
   * Delete a WAF Custom Rule.
   *
   * <p>See {@link #deleteApplicationSecurityWafCustomRuleWithHttpInfo}.
   *
   * @param customRuleId The ID of the custom rule. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>>
      deleteApplicationSecurityWafCustomRuleWithHttpInfoAsync(String customRuleId) {
    Object localVarPostBody = null;

    // verify the required parameter 'customRuleId' is set
    if (customRuleId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'customRuleId' when calling"
                  + " deleteApplicationSecurityWafCustomRule"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/remote_config/products/asm/waf/custom_rules/{custom_rule_id}"
            .replaceAll(
                "\\{" + "custom_rule_id" + "\\}", apiClient.escapeString(customRuleId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ApplicationSecurityApi.deleteApplicationSecurityWafCustomRule",
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
   * Delete a WAF exclusion filter.
   *
   * <p>See {@link #deleteApplicationSecurityWafExclusionFilterWithHttpInfo}.
   *
   * @param exclusionFilterId The identifier of the WAF exclusion filter. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteApplicationSecurityWafExclusionFilter(String exclusionFilterId)
      throws ApiException {
    deleteApplicationSecurityWafExclusionFilterWithHttpInfo(exclusionFilterId);
  }

  /**
   * Delete a WAF exclusion filter.
   *
   * <p>See {@link #deleteApplicationSecurityWafExclusionFilterWithHttpInfoAsync}.
   *
   * @param exclusionFilterId The identifier of the WAF exclusion filter. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteApplicationSecurityWafExclusionFilterAsync(
      String exclusionFilterId) {
    return deleteApplicationSecurityWafExclusionFilterWithHttpInfoAsync(exclusionFilterId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete a specific WAF exclusion filter using its identifier.
   *
   * @param exclusionFilterId The identifier of the WAF exclusion filter. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Concurrent Modification </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteApplicationSecurityWafExclusionFilterWithHttpInfo(
      String exclusionFilterId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'exclusionFilterId' is set
    if (exclusionFilterId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'exclusionFilterId' when calling"
              + " deleteApplicationSecurityWafExclusionFilter");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/remote_config/products/asm/waf/exclusion_filters/{exclusion_filter_id}"
            .replaceAll(
                "\\{" + "exclusion_filter_id" + "\\}",
                apiClient.escapeString(exclusionFilterId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ApplicationSecurityApi.deleteApplicationSecurityWafExclusionFilter",
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
   * Delete a WAF exclusion filter.
   *
   * <p>See {@link #deleteApplicationSecurityWafExclusionFilterWithHttpInfo}.
   *
   * @param exclusionFilterId The identifier of the WAF exclusion filter. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>>
      deleteApplicationSecurityWafExclusionFilterWithHttpInfoAsync(String exclusionFilterId) {
    Object localVarPostBody = null;

    // verify the required parameter 'exclusionFilterId' is set
    if (exclusionFilterId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'exclusionFilterId' when calling"
                  + " deleteApplicationSecurityWafExclusionFilter"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/remote_config/products/asm/waf/exclusion_filters/{exclusion_filter_id}"
            .replaceAll(
                "\\{" + "exclusion_filter_id" + "\\}",
                apiClient.escapeString(exclusionFilterId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ApplicationSecurityApi.deleteApplicationSecurityWafExclusionFilter",
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
   * Get a WAF custom rule.
   *
   * <p>See {@link #getApplicationSecurityWafCustomRuleWithHttpInfo}.
   *
   * @param customRuleId The ID of the custom rule. (required)
   * @return ApplicationSecurityWafCustomRuleResponse
   * @throws ApiException if fails to make API call
   */
  public ApplicationSecurityWafCustomRuleResponse getApplicationSecurityWafCustomRule(
      String customRuleId) throws ApiException {
    return getApplicationSecurityWafCustomRuleWithHttpInfo(customRuleId).getData();
  }

  /**
   * Get a WAF custom rule.
   *
   * <p>See {@link #getApplicationSecurityWafCustomRuleWithHttpInfoAsync}.
   *
   * @param customRuleId The ID of the custom rule. (required)
   * @return CompletableFuture&lt;ApplicationSecurityWafCustomRuleResponse&gt;
   */
  public CompletableFuture<ApplicationSecurityWafCustomRuleResponse>
      getApplicationSecurityWafCustomRuleAsync(String customRuleId) {
    return getApplicationSecurityWafCustomRuleWithHttpInfoAsync(customRuleId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Retrieve a WAF custom rule by ID.
   *
   * @param customRuleId The ID of the custom rule. (required)
   * @return ApiResponse&lt;ApplicationSecurityWafCustomRuleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ApplicationSecurityWafCustomRuleResponse>
      getApplicationSecurityWafCustomRuleWithHttpInfo(String customRuleId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'customRuleId' is set
    if (customRuleId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'customRuleId' when calling"
              + " getApplicationSecurityWafCustomRule");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/remote_config/products/asm/waf/custom_rules/{custom_rule_id}"
            .replaceAll(
                "\\{" + "custom_rule_id" + "\\}", apiClient.escapeString(customRuleId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ApplicationSecurityApi.getApplicationSecurityWafCustomRule",
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
        new GenericType<ApplicationSecurityWafCustomRuleResponse>() {});
  }

  /**
   * Get a WAF custom rule.
   *
   * <p>See {@link #getApplicationSecurityWafCustomRuleWithHttpInfo}.
   *
   * @param customRuleId The ID of the custom rule. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ApplicationSecurityWafCustomRuleResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ApplicationSecurityWafCustomRuleResponse>>
      getApplicationSecurityWafCustomRuleWithHttpInfoAsync(String customRuleId) {
    Object localVarPostBody = null;

    // verify the required parameter 'customRuleId' is set
    if (customRuleId == null) {
      CompletableFuture<ApiResponse<ApplicationSecurityWafCustomRuleResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'customRuleId' when calling"
                  + " getApplicationSecurityWafCustomRule"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/remote_config/products/asm/waf/custom_rules/{custom_rule_id}"
            .replaceAll(
                "\\{" + "custom_rule_id" + "\\}", apiClient.escapeString(customRuleId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ApplicationSecurityApi.getApplicationSecurityWafCustomRule",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ApplicationSecurityWafCustomRuleResponse>> result =
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
        new GenericType<ApplicationSecurityWafCustomRuleResponse>() {});
  }

  /**
   * Get a WAF exclusion filter.
   *
   * <p>See {@link #getApplicationSecurityWafExclusionFilterWithHttpInfo}.
   *
   * @param exclusionFilterId The identifier of the WAF exclusion filter. (required)
   * @return ApplicationSecurityWafExclusionFilterResponse
   * @throws ApiException if fails to make API call
   */
  public ApplicationSecurityWafExclusionFilterResponse getApplicationSecurityWafExclusionFilter(
      String exclusionFilterId) throws ApiException {
    return getApplicationSecurityWafExclusionFilterWithHttpInfo(exclusionFilterId).getData();
  }

  /**
   * Get a WAF exclusion filter.
   *
   * <p>See {@link #getApplicationSecurityWafExclusionFilterWithHttpInfoAsync}.
   *
   * @param exclusionFilterId The identifier of the WAF exclusion filter. (required)
   * @return CompletableFuture&lt;ApplicationSecurityWafExclusionFilterResponse&gt;
   */
  public CompletableFuture<ApplicationSecurityWafExclusionFilterResponse>
      getApplicationSecurityWafExclusionFilterAsync(String exclusionFilterId) {
    return getApplicationSecurityWafExclusionFilterWithHttpInfoAsync(exclusionFilterId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Retrieve a specific WAF exclusion filter using its identifier.
   *
   * @param exclusionFilterId The identifier of the WAF exclusion filter. (required)
   * @return ApiResponse&lt;ApplicationSecurityWafExclusionFilterResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ApplicationSecurityWafExclusionFilterResponse>
      getApplicationSecurityWafExclusionFilterWithHttpInfo(String exclusionFilterId)
          throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'exclusionFilterId' is set
    if (exclusionFilterId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'exclusionFilterId' when calling"
              + " getApplicationSecurityWafExclusionFilter");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/remote_config/products/asm/waf/exclusion_filters/{exclusion_filter_id}"
            .replaceAll(
                "\\{" + "exclusion_filter_id" + "\\}",
                apiClient.escapeString(exclusionFilterId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ApplicationSecurityApi.getApplicationSecurityWafExclusionFilter",
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
        new GenericType<ApplicationSecurityWafExclusionFilterResponse>() {});
  }

  /**
   * Get a WAF exclusion filter.
   *
   * <p>See {@link #getApplicationSecurityWafExclusionFilterWithHttpInfo}.
   *
   * @param exclusionFilterId The identifier of the WAF exclusion filter. (required)
   * @return
   *     CompletableFuture&lt;ApiResponse&lt;ApplicationSecurityWafExclusionFilterResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ApplicationSecurityWafExclusionFilterResponse>>
      getApplicationSecurityWafExclusionFilterWithHttpInfoAsync(String exclusionFilterId) {
    Object localVarPostBody = null;

    // verify the required parameter 'exclusionFilterId' is set
    if (exclusionFilterId == null) {
      CompletableFuture<ApiResponse<ApplicationSecurityWafExclusionFilterResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'exclusionFilterId' when calling"
                  + " getApplicationSecurityWafExclusionFilter"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/remote_config/products/asm/waf/exclusion_filters/{exclusion_filter_id}"
            .replaceAll(
                "\\{" + "exclusion_filter_id" + "\\}",
                apiClient.escapeString(exclusionFilterId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ApplicationSecurityApi.getApplicationSecurityWafExclusionFilter",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ApplicationSecurityWafExclusionFilterResponse>> result =
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
        new GenericType<ApplicationSecurityWafExclusionFilterResponse>() {});
  }

  /**
   * List all WAF custom rules.
   *
   * <p>See {@link #listApplicationSecurityWAFCustomRulesWithHttpInfo}.
   *
   * @return ApplicationSecurityWafCustomRuleListResponse
   * @throws ApiException if fails to make API call
   */
  public ApplicationSecurityWafCustomRuleListResponse listApplicationSecurityWAFCustomRules()
      throws ApiException {
    return listApplicationSecurityWAFCustomRulesWithHttpInfo().getData();
  }

  /**
   * List all WAF custom rules.
   *
   * <p>See {@link #listApplicationSecurityWAFCustomRulesWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;ApplicationSecurityWafCustomRuleListResponse&gt;
   */
  public CompletableFuture<ApplicationSecurityWafCustomRuleListResponse>
      listApplicationSecurityWAFCustomRulesAsync() {
    return listApplicationSecurityWAFCustomRulesWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Retrieve a list of WAF custom rule.
   *
   * @return ApiResponse&lt;ApplicationSecurityWafCustomRuleListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ApplicationSecurityWafCustomRuleListResponse>
      listApplicationSecurityWAFCustomRulesWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/remote_config/products/asm/waf/custom_rules";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ApplicationSecurityApi.listApplicationSecurityWAFCustomRules",
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
        new GenericType<ApplicationSecurityWafCustomRuleListResponse>() {});
  }

  /**
   * List all WAF custom rules.
   *
   * <p>See {@link #listApplicationSecurityWAFCustomRulesWithHttpInfo}.
   *
   * @return
   *     CompletableFuture&lt;ApiResponse&lt;ApplicationSecurityWafCustomRuleListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ApplicationSecurityWafCustomRuleListResponse>>
      listApplicationSecurityWAFCustomRulesWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/remote_config/products/asm/waf/custom_rules";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ApplicationSecurityApi.listApplicationSecurityWAFCustomRules",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ApplicationSecurityWafCustomRuleListResponse>> result =
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
        new GenericType<ApplicationSecurityWafCustomRuleListResponse>() {});
  }

  /**
   * List all WAF exclusion filters.
   *
   * <p>See {@link #listApplicationSecurityWafExclusionFiltersWithHttpInfo}.
   *
   * @return ApplicationSecurityWafExclusionFiltersResponse
   * @throws ApiException if fails to make API call
   */
  public ApplicationSecurityWafExclusionFiltersResponse listApplicationSecurityWafExclusionFilters()
      throws ApiException {
    return listApplicationSecurityWafExclusionFiltersWithHttpInfo().getData();
  }

  /**
   * List all WAF exclusion filters.
   *
   * <p>See {@link #listApplicationSecurityWafExclusionFiltersWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;ApplicationSecurityWafExclusionFiltersResponse&gt;
   */
  public CompletableFuture<ApplicationSecurityWafExclusionFiltersResponse>
      listApplicationSecurityWafExclusionFiltersAsync() {
    return listApplicationSecurityWafExclusionFiltersWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Retrieve a list of WAF exclusion filters.
   *
   * @return ApiResponse&lt;ApplicationSecurityWafExclusionFiltersResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ApplicationSecurityWafExclusionFiltersResponse>
      listApplicationSecurityWafExclusionFiltersWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/remote_config/products/asm/waf/exclusion_filters";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ApplicationSecurityApi.listApplicationSecurityWafExclusionFilters",
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
        new GenericType<ApplicationSecurityWafExclusionFiltersResponse>() {});
  }

  /**
   * List all WAF exclusion filters.
   *
   * <p>See {@link #listApplicationSecurityWafExclusionFiltersWithHttpInfo}.
   *
   * @return
   *     CompletableFuture&lt;ApiResponse&lt;ApplicationSecurityWafExclusionFiltersResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ApplicationSecurityWafExclusionFiltersResponse>>
      listApplicationSecurityWafExclusionFiltersWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/remote_config/products/asm/waf/exclusion_filters";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ApplicationSecurityApi.listApplicationSecurityWafExclusionFilters",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ApplicationSecurityWafExclusionFiltersResponse>> result =
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
        new GenericType<ApplicationSecurityWafExclusionFiltersResponse>() {});
  }

  /**
   * Update a WAF Custom Rule.
   *
   * <p>See {@link #updateApplicationSecurityWafCustomRuleWithHttpInfo}.
   *
   * @param customRuleId The ID of the custom rule. (required)
   * @param body New definition of the WAF Custom Rule. (required)
   * @return ApplicationSecurityWafCustomRuleResponse
   * @throws ApiException if fails to make API call
   */
  public ApplicationSecurityWafCustomRuleResponse updateApplicationSecurityWafCustomRule(
      String customRuleId, ApplicationSecurityWafCustomRuleUpdateRequest body) throws ApiException {
    return updateApplicationSecurityWafCustomRuleWithHttpInfo(customRuleId, body).getData();
  }

  /**
   * Update a WAF Custom Rule.
   *
   * <p>See {@link #updateApplicationSecurityWafCustomRuleWithHttpInfoAsync}.
   *
   * @param customRuleId The ID of the custom rule. (required)
   * @param body New definition of the WAF Custom Rule. (required)
   * @return CompletableFuture&lt;ApplicationSecurityWafCustomRuleResponse&gt;
   */
  public CompletableFuture<ApplicationSecurityWafCustomRuleResponse>
      updateApplicationSecurityWafCustomRuleAsync(
          String customRuleId, ApplicationSecurityWafCustomRuleUpdateRequest body) {
    return updateApplicationSecurityWafCustomRuleWithHttpInfoAsync(customRuleId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update a specific WAF custom Rule. Returns the Custom Rule object when the request is
   * successful.
   *
   * @param customRuleId The ID of the custom rule. (required)
   * @param body New definition of the WAF Custom Rule. (required)
   * @return ApiResponse&lt;ApplicationSecurityWafCustomRuleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Concurrent Modification </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ApplicationSecurityWafCustomRuleResponse>
      updateApplicationSecurityWafCustomRuleWithHttpInfo(
          String customRuleId, ApplicationSecurityWafCustomRuleUpdateRequest body)
          throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'customRuleId' is set
    if (customRuleId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'customRuleId' when calling"
              + " updateApplicationSecurityWafCustomRule");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'body' when calling"
              + " updateApplicationSecurityWafCustomRule");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/remote_config/products/asm/waf/custom_rules/{custom_rule_id}"
            .replaceAll(
                "\\{" + "custom_rule_id" + "\\}", apiClient.escapeString(customRuleId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ApplicationSecurityApi.updateApplicationSecurityWafCustomRule",
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
        new GenericType<ApplicationSecurityWafCustomRuleResponse>() {});
  }

  /**
   * Update a WAF Custom Rule.
   *
   * <p>See {@link #updateApplicationSecurityWafCustomRuleWithHttpInfo}.
   *
   * @param customRuleId The ID of the custom rule. (required)
   * @param body New definition of the WAF Custom Rule. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ApplicationSecurityWafCustomRuleResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ApplicationSecurityWafCustomRuleResponse>>
      updateApplicationSecurityWafCustomRuleWithHttpInfoAsync(
          String customRuleId, ApplicationSecurityWafCustomRuleUpdateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'customRuleId' is set
    if (customRuleId == null) {
      CompletableFuture<ApiResponse<ApplicationSecurityWafCustomRuleResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'customRuleId' when calling"
                  + " updateApplicationSecurityWafCustomRule"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<ApplicationSecurityWafCustomRuleResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " updateApplicationSecurityWafCustomRule"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/remote_config/products/asm/waf/custom_rules/{custom_rule_id}"
            .replaceAll(
                "\\{" + "custom_rule_id" + "\\}", apiClient.escapeString(customRuleId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ApplicationSecurityApi.updateApplicationSecurityWafCustomRule",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ApplicationSecurityWafCustomRuleResponse>> result =
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
        new GenericType<ApplicationSecurityWafCustomRuleResponse>() {});
  }

  /**
   * Update a WAF exclusion filter.
   *
   * <p>See {@link #updateApplicationSecurityWafExclusionFilterWithHttpInfo}.
   *
   * @param exclusionFilterId The identifier of the WAF exclusion filter. (required)
   * @param body The exclusion filter to update. (required)
   * @return ApplicationSecurityWafExclusionFilterResponse
   * @throws ApiException if fails to make API call
   */
  public ApplicationSecurityWafExclusionFilterResponse updateApplicationSecurityWafExclusionFilter(
      String exclusionFilterId, ApplicationSecurityWafExclusionFilterUpdateRequest body)
      throws ApiException {
    return updateApplicationSecurityWafExclusionFilterWithHttpInfo(exclusionFilterId, body)
        .getData();
  }

  /**
   * Update a WAF exclusion filter.
   *
   * <p>See {@link #updateApplicationSecurityWafExclusionFilterWithHttpInfoAsync}.
   *
   * @param exclusionFilterId The identifier of the WAF exclusion filter. (required)
   * @param body The exclusion filter to update. (required)
   * @return CompletableFuture&lt;ApplicationSecurityWafExclusionFilterResponse&gt;
   */
  public CompletableFuture<ApplicationSecurityWafExclusionFilterResponse>
      updateApplicationSecurityWafExclusionFilterAsync(
          String exclusionFilterId, ApplicationSecurityWafExclusionFilterUpdateRequest body) {
    return updateApplicationSecurityWafExclusionFilterWithHttpInfoAsync(exclusionFilterId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update a specific WAF exclusion filter using its identifier. Returns the exclusion filter
   * object when the request is successful.
   *
   * @param exclusionFilterId The identifier of the WAF exclusion filter. (required)
   * @param body The exclusion filter to update. (required)
   * @return ApiResponse&lt;ApplicationSecurityWafExclusionFilterResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Concurrent Modification </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ApplicationSecurityWafExclusionFilterResponse>
      updateApplicationSecurityWafExclusionFilterWithHttpInfo(
          String exclusionFilterId, ApplicationSecurityWafExclusionFilterUpdateRequest body)
          throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'exclusionFilterId' is set
    if (exclusionFilterId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'exclusionFilterId' when calling"
              + " updateApplicationSecurityWafExclusionFilter");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'body' when calling"
              + " updateApplicationSecurityWafExclusionFilter");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/remote_config/products/asm/waf/exclusion_filters/{exclusion_filter_id}"
            .replaceAll(
                "\\{" + "exclusion_filter_id" + "\\}",
                apiClient.escapeString(exclusionFilterId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ApplicationSecurityApi.updateApplicationSecurityWafExclusionFilter",
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
        new GenericType<ApplicationSecurityWafExclusionFilterResponse>() {});
  }

  /**
   * Update a WAF exclusion filter.
   *
   * <p>See {@link #updateApplicationSecurityWafExclusionFilterWithHttpInfo}.
   *
   * @param exclusionFilterId The identifier of the WAF exclusion filter. (required)
   * @param body The exclusion filter to update. (required)
   * @return
   *     CompletableFuture&lt;ApiResponse&lt;ApplicationSecurityWafExclusionFilterResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ApplicationSecurityWafExclusionFilterResponse>>
      updateApplicationSecurityWafExclusionFilterWithHttpInfoAsync(
          String exclusionFilterId, ApplicationSecurityWafExclusionFilterUpdateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'exclusionFilterId' is set
    if (exclusionFilterId == null) {
      CompletableFuture<ApiResponse<ApplicationSecurityWafExclusionFilterResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'exclusionFilterId' when calling"
                  + " updateApplicationSecurityWafExclusionFilter"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<ApplicationSecurityWafExclusionFilterResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " updateApplicationSecurityWafExclusionFilter"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/remote_config/products/asm/waf/exclusion_filters/{exclusion_filter_id}"
            .replaceAll(
                "\\{" + "exclusion_filter_id" + "\\}",
                apiClient.escapeString(exclusionFilterId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ApplicationSecurityApi.updateApplicationSecurityWafExclusionFilter",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ApplicationSecurityWafExclusionFilterResponse>> result =
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
        new GenericType<ApplicationSecurityWafExclusionFilterResponse>() {});
  }
}
