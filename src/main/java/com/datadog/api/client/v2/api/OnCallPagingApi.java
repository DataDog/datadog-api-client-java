package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.CreatePageRequest;
import com.datadog.api.client.v2.model.CreatePageResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class OnCallPagingApi {
  private ApiClient apiClient;

  public OnCallPagingApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public OnCallPagingApi(ApiClient apiClient) {
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
   * Acknowledge On-Call Page.
   *
   * <p>See {@link #acknowledgeOnCallPageWithHttpInfo}.
   *
   * @param pageId The page ID. (required)
   * @throws ApiException if fails to make API call
   */
  public void acknowledgeOnCallPage(UUID pageId) throws ApiException {
    acknowledgeOnCallPageWithHttpInfo(pageId);
  }

  /**
   * Acknowledge On-Call Page.
   *
   * <p>See {@link #acknowledgeOnCallPageWithHttpInfoAsync}.
   *
   * @param pageId The page ID. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> acknowledgeOnCallPageAsync(UUID pageId) {
    return acknowledgeOnCallPageWithHttpInfoAsync(pageId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Acknowledges an On-Call Page.
   *
   * @param pageId The page ID. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 202 </td><td> Accepted. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> acknowledgeOnCallPageWithHttpInfo(UUID pageId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'pageId' is set
    if (pageId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'pageId' when calling acknowledgeOnCallPage");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/on-call/pages/{page_id}/acknowledge"
            .replaceAll("\\{" + "page_id" + "\\}", apiClient.escapeString(pageId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.OnCallPagingApi.acknowledgeOnCallPage",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Acknowledge On-Call Page.
   *
   * <p>See {@link #acknowledgeOnCallPageWithHttpInfo}.
   *
   * @param pageId The page ID. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> acknowledgeOnCallPageWithHttpInfoAsync(UUID pageId) {
    Object localVarPostBody = null;

    // verify the required parameter 'pageId' is set
    if (pageId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'pageId' when calling acknowledgeOnCallPage"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/on-call/pages/{page_id}/acknowledge"
            .replaceAll("\\{" + "page_id" + "\\}", apiClient.escapeString(pageId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.OnCallPagingApi.acknowledgeOnCallPage",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"*/*"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Create On-Call Page.
   *
   * <p>See {@link #createOnCallPageWithHttpInfo}.
   *
   * @param body (required)
   * @return CreatePageResponse
   * @throws ApiException if fails to make API call
   */
  public CreatePageResponse createOnCallPage(CreatePageRequest body) throws ApiException {
    return createOnCallPageWithHttpInfo(body).getData();
  }

  /**
   * Create On-Call Page.
   *
   * <p>See {@link #createOnCallPageWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;CreatePageResponse&gt;
   */
  public CompletableFuture<CreatePageResponse> createOnCallPageAsync(CreatePageRequest body) {
    return createOnCallPageWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Trigger a new On-Call Page.
   *
   * @param body (required)
   * @return ApiResponse&lt;CreatePageResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CreatePageResponse> createOnCallPageWithHttpInfo(CreatePageRequest body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createOnCallPage");
    }
    // create path and map variables
    String localVarPath = "/api/v2/on-call/pages";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.OnCallPagingApi.createOnCallPage",
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
        new GenericType<CreatePageResponse>() {});
  }

  /**
   * Create On-Call Page.
   *
   * <p>See {@link #createOnCallPageWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CreatePageResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CreatePageResponse>> createOnCallPageWithHttpInfoAsync(
      CreatePageRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<CreatePageResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createOnCallPage"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/on-call/pages";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.OnCallPagingApi.createOnCallPage",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CreatePageResponse>> result = new CompletableFuture<>();
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
        new GenericType<CreatePageResponse>() {});
  }

  /**
   * Escalate On-Call Page.
   *
   * <p>See {@link #escalateOnCallPageWithHttpInfo}.
   *
   * @param pageId The page ID. (required)
   * @throws ApiException if fails to make API call
   */
  public void escalateOnCallPage(UUID pageId) throws ApiException {
    escalateOnCallPageWithHttpInfo(pageId);
  }

  /**
   * Escalate On-Call Page.
   *
   * <p>See {@link #escalateOnCallPageWithHttpInfoAsync}.
   *
   * @param pageId The page ID. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> escalateOnCallPageAsync(UUID pageId) {
    return escalateOnCallPageWithHttpInfoAsync(pageId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Escalates an On-Call Page.
   *
   * @param pageId The page ID. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 202 </td><td> Accepted. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> escalateOnCallPageWithHttpInfo(UUID pageId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'pageId' is set
    if (pageId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'pageId' when calling escalateOnCallPage");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/on-call/pages/{page_id}/escalate"
            .replaceAll("\\{" + "page_id" + "\\}", apiClient.escapeString(pageId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.OnCallPagingApi.escalateOnCallPage",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Escalate On-Call Page.
   *
   * <p>See {@link #escalateOnCallPageWithHttpInfo}.
   *
   * @param pageId The page ID. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> escalateOnCallPageWithHttpInfoAsync(UUID pageId) {
    Object localVarPostBody = null;

    // verify the required parameter 'pageId' is set
    if (pageId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'pageId' when calling escalateOnCallPage"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/on-call/pages/{page_id}/escalate"
            .replaceAll("\\{" + "page_id" + "\\}", apiClient.escapeString(pageId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.OnCallPagingApi.escalateOnCallPage",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"*/*"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Resolve On-Call Page.
   *
   * <p>See {@link #resolveOnCallPageWithHttpInfo}.
   *
   * @param pageId The page ID. (required)
   * @throws ApiException if fails to make API call
   */
  public void resolveOnCallPage(UUID pageId) throws ApiException {
    resolveOnCallPageWithHttpInfo(pageId);
  }

  /**
   * Resolve On-Call Page.
   *
   * <p>See {@link #resolveOnCallPageWithHttpInfoAsync}.
   *
   * @param pageId The page ID. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> resolveOnCallPageAsync(UUID pageId) {
    return resolveOnCallPageWithHttpInfoAsync(pageId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Resolves an On-Call Page.
   *
   * @param pageId The page ID. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 202 </td><td> Accepted. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> resolveOnCallPageWithHttpInfo(UUID pageId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'pageId' is set
    if (pageId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'pageId' when calling resolveOnCallPage");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/on-call/pages/{page_id}/resolve"
            .replaceAll("\\{" + "page_id" + "\\}", apiClient.escapeString(pageId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.OnCallPagingApi.resolveOnCallPage",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Resolve On-Call Page.
   *
   * <p>See {@link #resolveOnCallPageWithHttpInfo}.
   *
   * @param pageId The page ID. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> resolveOnCallPageWithHttpInfoAsync(UUID pageId) {
    Object localVarPostBody = null;

    // verify the required parameter 'pageId' is set
    if (pageId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'pageId' when calling resolveOnCallPage"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/on-call/pages/{page_id}/resolve"
            .replaceAll("\\{" + "page_id" + "\\}", apiClient.escapeString(pageId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.OnCallPagingApi.resolveOnCallPage",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"*/*"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }
}
