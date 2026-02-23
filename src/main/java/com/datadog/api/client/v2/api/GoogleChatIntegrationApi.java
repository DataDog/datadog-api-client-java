package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.GoogleChatAppNamedSpaceResponse;
import com.datadog.api.client.v2.model.GoogleChatCreateOrganizationHandleRequest;
import com.datadog.api.client.v2.model.GoogleChatOrganizationHandleResponse;
import com.datadog.api.client.v2.model.GoogleChatOrganizationHandlesResponse;
import com.datadog.api.client.v2.model.GoogleChatUpdateOrganizationHandleRequest;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GoogleChatIntegrationApi {
  private ApiClient apiClient;

  public GoogleChatIntegrationApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public GoogleChatIntegrationApi(ApiClient apiClient) {
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
   * Create organization handle.
   *
   * <p>See {@link #createOrganizationHandleWithHttpInfo}.
   *
   * @param organizationBindingId Your organization binding ID. (required)
   * @param body Organization handle payload. (required)
   * @return GoogleChatOrganizationHandleResponse
   * @throws ApiException if fails to make API call
   */
  public GoogleChatOrganizationHandleResponse createOrganizationHandle(
      String organizationBindingId, GoogleChatCreateOrganizationHandleRequest body)
      throws ApiException {
    return createOrganizationHandleWithHttpInfo(organizationBindingId, body).getData();
  }

  /**
   * Create organization handle.
   *
   * <p>See {@link #createOrganizationHandleWithHttpInfoAsync}.
   *
   * @param organizationBindingId Your organization binding ID. (required)
   * @param body Organization handle payload. (required)
   * @return CompletableFuture&lt;GoogleChatOrganizationHandleResponse&gt;
   */
  public CompletableFuture<GoogleChatOrganizationHandleResponse> createOrganizationHandleAsync(
      String organizationBindingId, GoogleChatCreateOrganizationHandleRequest body) {
    return createOrganizationHandleWithHttpInfoAsync(organizationBindingId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create an organization handle in the Datadog Google Chat integration.
   *
   * @param organizationBindingId Your organization binding ID. (required)
   * @param body Organization handle payload. (required)
   * @return ApiResponse&lt;GoogleChatOrganizationHandleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> CREATED </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<GoogleChatOrganizationHandleResponse> createOrganizationHandleWithHttpInfo(
      String organizationBindingId, GoogleChatCreateOrganizationHandleRequest body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'organizationBindingId' is set
    if (organizationBindingId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'organizationBindingId' when calling"
              + " createOrganizationHandle");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createOrganizationHandle");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration/google-chat/organizations/{organization_binding_id}/organization-handles"
            .replaceAll(
                "\\{" + "organization_binding_id" + "\\}",
                apiClient.escapeString(organizationBindingId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.GoogleChatIntegrationApi.createOrganizationHandle",
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
        new GenericType<GoogleChatOrganizationHandleResponse>() {});
  }

  /**
   * Create organization handle.
   *
   * <p>See {@link #createOrganizationHandleWithHttpInfo}.
   *
   * @param organizationBindingId Your organization binding ID. (required)
   * @param body Organization handle payload. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;GoogleChatOrganizationHandleResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<GoogleChatOrganizationHandleResponse>>
      createOrganizationHandleWithHttpInfoAsync(
          String organizationBindingId, GoogleChatCreateOrganizationHandleRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'organizationBindingId' is set
    if (organizationBindingId == null) {
      CompletableFuture<ApiResponse<GoogleChatOrganizationHandleResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'organizationBindingId' when calling"
                  + " createOrganizationHandle"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<GoogleChatOrganizationHandleResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createOrganizationHandle"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration/google-chat/organizations/{organization_binding_id}/organization-handles"
            .replaceAll(
                "\\{" + "organization_binding_id" + "\\}",
                apiClient.escapeString(organizationBindingId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.GoogleChatIntegrationApi.createOrganizationHandle",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<GoogleChatOrganizationHandleResponse>> result =
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
        new GenericType<GoogleChatOrganizationHandleResponse>() {});
  }

  /**
   * Delete organization handle.
   *
   * <p>See {@link #deleteOrganizationHandleWithHttpInfo}.
   *
   * @param organizationBindingId Your organization binding ID. (required)
   * @param handleId Your organization handle ID. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteOrganizationHandle(String organizationBindingId, String handleId)
      throws ApiException {
    deleteOrganizationHandleWithHttpInfo(organizationBindingId, handleId);
  }

  /**
   * Delete organization handle.
   *
   * <p>See {@link #deleteOrganizationHandleWithHttpInfoAsync}.
   *
   * @param organizationBindingId Your organization binding ID. (required)
   * @param handleId Your organization handle ID. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteOrganizationHandleAsync(
      String organizationBindingId, String handleId) {
    return deleteOrganizationHandleWithHttpInfoAsync(organizationBindingId, handleId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete an organization handle from the Datadog Google Chat integration.
   *
   * @param organizationBindingId Your organization binding ID. (required)
   * @param handleId Your organization handle ID. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteOrganizationHandleWithHttpInfo(
      String organizationBindingId, String handleId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'organizationBindingId' is set
    if (organizationBindingId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'organizationBindingId' when calling"
              + " deleteOrganizationHandle");
    }

    // verify the required parameter 'handleId' is set
    if (handleId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'handleId' when calling deleteOrganizationHandle");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration/google-chat/organizations/{organization_binding_id}/organization-handles/{handle_id}"
            .replaceAll(
                "\\{" + "organization_binding_id" + "\\}",
                apiClient.escapeString(organizationBindingId.toString()))
            .replaceAll("\\{" + "handle_id" + "\\}", apiClient.escapeString(handleId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.GoogleChatIntegrationApi.deleteOrganizationHandle",
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
   * Delete organization handle.
   *
   * <p>See {@link #deleteOrganizationHandleWithHttpInfo}.
   *
   * @param organizationBindingId Your organization binding ID. (required)
   * @param handleId Your organization handle ID. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteOrganizationHandleWithHttpInfoAsync(
      String organizationBindingId, String handleId) {
    Object localVarPostBody = null;

    // verify the required parameter 'organizationBindingId' is set
    if (organizationBindingId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'organizationBindingId' when calling"
                  + " deleteOrganizationHandle"));
      return result;
    }

    // verify the required parameter 'handleId' is set
    if (handleId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'handleId' when calling deleteOrganizationHandle"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration/google-chat/organizations/{organization_binding_id}/organization-handles/{handle_id}"
            .replaceAll(
                "\\{" + "organization_binding_id" + "\\}",
                apiClient.escapeString(organizationBindingId.toString()))
            .replaceAll("\\{" + "handle_id" + "\\}", apiClient.escapeString(handleId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.GoogleChatIntegrationApi.deleteOrganizationHandle",
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
   * Get organization handle.
   *
   * <p>See {@link #getOrganizationHandleWithHttpInfo}.
   *
   * @param organizationBindingId Your organization binding ID. (required)
   * @param handleId Your organization handle ID. (required)
   * @return GoogleChatOrganizationHandleResponse
   * @throws ApiException if fails to make API call
   */
  public GoogleChatOrganizationHandleResponse getOrganizationHandle(
      String organizationBindingId, String handleId) throws ApiException {
    return getOrganizationHandleWithHttpInfo(organizationBindingId, handleId).getData();
  }

  /**
   * Get organization handle.
   *
   * <p>See {@link #getOrganizationHandleWithHttpInfoAsync}.
   *
   * @param organizationBindingId Your organization binding ID. (required)
   * @param handleId Your organization handle ID. (required)
   * @return CompletableFuture&lt;GoogleChatOrganizationHandleResponse&gt;
   */
  public CompletableFuture<GoogleChatOrganizationHandleResponse> getOrganizationHandleAsync(
      String organizationBindingId, String handleId) {
    return getOrganizationHandleWithHttpInfoAsync(organizationBindingId, handleId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get an organization handle from the Datadog Google Chat integration.
   *
   * @param organizationBindingId Your organization binding ID. (required)
   * @param handleId Your organization handle ID. (required)
   * @return ApiResponse&lt;GoogleChatOrganizationHandleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<GoogleChatOrganizationHandleResponse> getOrganizationHandleWithHttpInfo(
      String organizationBindingId, String handleId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'organizationBindingId' is set
    if (organizationBindingId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'organizationBindingId' when calling"
              + " getOrganizationHandle");
    }

    // verify the required parameter 'handleId' is set
    if (handleId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'handleId' when calling getOrganizationHandle");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration/google-chat/organizations/{organization_binding_id}/organization-handles/{handle_id}"
            .replaceAll(
                "\\{" + "organization_binding_id" + "\\}",
                apiClient.escapeString(organizationBindingId.toString()))
            .replaceAll("\\{" + "handle_id" + "\\}", apiClient.escapeString(handleId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.GoogleChatIntegrationApi.getOrganizationHandle",
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
        new GenericType<GoogleChatOrganizationHandleResponse>() {});
  }

  /**
   * Get organization handle.
   *
   * <p>See {@link #getOrganizationHandleWithHttpInfo}.
   *
   * @param organizationBindingId Your organization binding ID. (required)
   * @param handleId Your organization handle ID. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;GoogleChatOrganizationHandleResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<GoogleChatOrganizationHandleResponse>>
      getOrganizationHandleWithHttpInfoAsync(String organizationBindingId, String handleId) {
    Object localVarPostBody = null;

    // verify the required parameter 'organizationBindingId' is set
    if (organizationBindingId == null) {
      CompletableFuture<ApiResponse<GoogleChatOrganizationHandleResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'organizationBindingId' when calling"
                  + " getOrganizationHandle"));
      return result;
    }

    // verify the required parameter 'handleId' is set
    if (handleId == null) {
      CompletableFuture<ApiResponse<GoogleChatOrganizationHandleResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'handleId' when calling getOrganizationHandle"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration/google-chat/organizations/{organization_binding_id}/organization-handles/{handle_id}"
            .replaceAll(
                "\\{" + "organization_binding_id" + "\\}",
                apiClient.escapeString(organizationBindingId.toString()))
            .replaceAll("\\{" + "handle_id" + "\\}", apiClient.escapeString(handleId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.GoogleChatIntegrationApi.getOrganizationHandle",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<GoogleChatOrganizationHandleResponse>> result =
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
        new GenericType<GoogleChatOrganizationHandleResponse>() {});
  }

  /**
   * Get space information by display name.
   *
   * <p>See {@link #getSpaceByDisplayNameWithHttpInfo}.
   *
   * @param domainName The Google Chat domain name. (required)
   * @param spaceDisplayName The Google Chat space display name. (required)
   * @return GoogleChatAppNamedSpaceResponse
   * @throws ApiException if fails to make API call
   */
  public GoogleChatAppNamedSpaceResponse getSpaceByDisplayName(
      String domainName, String spaceDisplayName) throws ApiException {
    return getSpaceByDisplayNameWithHttpInfo(domainName, spaceDisplayName).getData();
  }

  /**
   * Get space information by display name.
   *
   * <p>See {@link #getSpaceByDisplayNameWithHttpInfoAsync}.
   *
   * @param domainName The Google Chat domain name. (required)
   * @param spaceDisplayName The Google Chat space display name. (required)
   * @return CompletableFuture&lt;GoogleChatAppNamedSpaceResponse&gt;
   */
  public CompletableFuture<GoogleChatAppNamedSpaceResponse> getSpaceByDisplayNameAsync(
      String domainName, String spaceDisplayName) {
    return getSpaceByDisplayNameWithHttpInfoAsync(domainName, spaceDisplayName)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the resource name and organization binding ID of a space in the Datadog Google Chat
   * integration.
   *
   * @param domainName The Google Chat domain name. (required)
   * @param spaceDisplayName The Google Chat space display name. (required)
   * @return ApiResponse&lt;GoogleChatAppNamedSpaceResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<GoogleChatAppNamedSpaceResponse> getSpaceByDisplayNameWithHttpInfo(
      String domainName, String spaceDisplayName) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'domainName' is set
    if (domainName == null) {
      throw new ApiException(
          400, "Missing the required parameter 'domainName' when calling getSpaceByDisplayName");
    }

    // verify the required parameter 'spaceDisplayName' is set
    if (spaceDisplayName == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'spaceDisplayName' when calling getSpaceByDisplayName");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration/google-chat/organizations/app/named-spaces/{domain_name}/{space_display_name}"
            .replaceAll(
                "\\{" + "domain_name" + "\\}", apiClient.escapeString(domainName.toString()))
            .replaceAll(
                "\\{" + "space_display_name" + "\\}",
                apiClient.escapeString(spaceDisplayName.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.GoogleChatIntegrationApi.getSpaceByDisplayName",
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
        new GenericType<GoogleChatAppNamedSpaceResponse>() {});
  }

  /**
   * Get space information by display name.
   *
   * <p>See {@link #getSpaceByDisplayNameWithHttpInfo}.
   *
   * @param domainName The Google Chat domain name. (required)
   * @param spaceDisplayName The Google Chat space display name. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;GoogleChatAppNamedSpaceResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<GoogleChatAppNamedSpaceResponse>>
      getSpaceByDisplayNameWithHttpInfoAsync(String domainName, String spaceDisplayName) {
    Object localVarPostBody = null;

    // verify the required parameter 'domainName' is set
    if (domainName == null) {
      CompletableFuture<ApiResponse<GoogleChatAppNamedSpaceResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'domainName' when calling getSpaceByDisplayName"));
      return result;
    }

    // verify the required parameter 'spaceDisplayName' is set
    if (spaceDisplayName == null) {
      CompletableFuture<ApiResponse<GoogleChatAppNamedSpaceResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'spaceDisplayName' when calling"
                  + " getSpaceByDisplayName"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration/google-chat/organizations/app/named-spaces/{domain_name}/{space_display_name}"
            .replaceAll(
                "\\{" + "domain_name" + "\\}", apiClient.escapeString(domainName.toString()))
            .replaceAll(
                "\\{" + "space_display_name" + "\\}",
                apiClient.escapeString(spaceDisplayName.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.GoogleChatIntegrationApi.getSpaceByDisplayName",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<GoogleChatAppNamedSpaceResponse>> result =
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
        new GenericType<GoogleChatAppNamedSpaceResponse>() {});
  }

  /**
   * Get all organization handles.
   *
   * <p>See {@link #listOrganizationHandlesWithHttpInfo}.
   *
   * @param organizationBindingId Your organization binding ID. (required)
   * @return GoogleChatOrganizationHandlesResponse
   * @throws ApiException if fails to make API call
   */
  public GoogleChatOrganizationHandlesResponse listOrganizationHandles(String organizationBindingId)
      throws ApiException {
    return listOrganizationHandlesWithHttpInfo(organizationBindingId).getData();
  }

  /**
   * Get all organization handles.
   *
   * <p>See {@link #listOrganizationHandlesWithHttpInfoAsync}.
   *
   * @param organizationBindingId Your organization binding ID. (required)
   * @return CompletableFuture&lt;GoogleChatOrganizationHandlesResponse&gt;
   */
  public CompletableFuture<GoogleChatOrganizationHandlesResponse> listOrganizationHandlesAsync(
      String organizationBindingId) {
    return listOrganizationHandlesWithHttpInfoAsync(organizationBindingId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a list of all organization handles from the Datadog Google Chat integration.
   *
   * @param organizationBindingId Your organization binding ID. (required)
   * @return ApiResponse&lt;GoogleChatOrganizationHandlesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<GoogleChatOrganizationHandlesResponse> listOrganizationHandlesWithHttpInfo(
      String organizationBindingId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'organizationBindingId' is set
    if (organizationBindingId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'organizationBindingId' when calling"
              + " listOrganizationHandles");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration/google-chat/organizations/{organization_binding_id}/organization-handles"
            .replaceAll(
                "\\{" + "organization_binding_id" + "\\}",
                apiClient.escapeString(organizationBindingId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.GoogleChatIntegrationApi.listOrganizationHandles",
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
        new GenericType<GoogleChatOrganizationHandlesResponse>() {});
  }

  /**
   * Get all organization handles.
   *
   * <p>See {@link #listOrganizationHandlesWithHttpInfo}.
   *
   * @param organizationBindingId Your organization binding ID. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;GoogleChatOrganizationHandlesResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<GoogleChatOrganizationHandlesResponse>>
      listOrganizationHandlesWithHttpInfoAsync(String organizationBindingId) {
    Object localVarPostBody = null;

    // verify the required parameter 'organizationBindingId' is set
    if (organizationBindingId == null) {
      CompletableFuture<ApiResponse<GoogleChatOrganizationHandlesResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'organizationBindingId' when calling"
                  + " listOrganizationHandles"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration/google-chat/organizations/{organization_binding_id}/organization-handles"
            .replaceAll(
                "\\{" + "organization_binding_id" + "\\}",
                apiClient.escapeString(organizationBindingId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.GoogleChatIntegrationApi.listOrganizationHandles",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<GoogleChatOrganizationHandlesResponse>> result =
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
        new GenericType<GoogleChatOrganizationHandlesResponse>() {});
  }

  /**
   * Update organization handle.
   *
   * <p>See {@link #updateOrganizationHandleWithHttpInfo}.
   *
   * @param organizationBindingId Your organization binding ID. (required)
   * @param handleId Your organization handle ID. (required)
   * @param body Organization handle payload. (required)
   * @return GoogleChatOrganizationHandleResponse
   * @throws ApiException if fails to make API call
   */
  public GoogleChatOrganizationHandleResponse updateOrganizationHandle(
      String organizationBindingId, String handleId, GoogleChatUpdateOrganizationHandleRequest body)
      throws ApiException {
    return updateOrganizationHandleWithHttpInfo(organizationBindingId, handleId, body).getData();
  }

  /**
   * Update organization handle.
   *
   * <p>See {@link #updateOrganizationHandleWithHttpInfoAsync}.
   *
   * @param organizationBindingId Your organization binding ID. (required)
   * @param handleId Your organization handle ID. (required)
   * @param body Organization handle payload. (required)
   * @return CompletableFuture&lt;GoogleChatOrganizationHandleResponse&gt;
   */
  public CompletableFuture<GoogleChatOrganizationHandleResponse> updateOrganizationHandleAsync(
      String organizationBindingId,
      String handleId,
      GoogleChatUpdateOrganizationHandleRequest body) {
    return updateOrganizationHandleWithHttpInfoAsync(organizationBindingId, handleId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update an organization handle from the Datadog Google Chat integration.
   *
   * @param organizationBindingId Your organization binding ID. (required)
   * @param handleId Your organization handle ID. (required)
   * @param body Organization handle payload. (required)
   * @return ApiResponse&lt;GoogleChatOrganizationHandleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<GoogleChatOrganizationHandleResponse> updateOrganizationHandleWithHttpInfo(
      String organizationBindingId, String handleId, GoogleChatUpdateOrganizationHandleRequest body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'organizationBindingId' is set
    if (organizationBindingId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'organizationBindingId' when calling"
              + " updateOrganizationHandle");
    }

    // verify the required parameter 'handleId' is set
    if (handleId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'handleId' when calling updateOrganizationHandle");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateOrganizationHandle");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration/google-chat/organizations/{organization_binding_id}/organization-handles/{handle_id}"
            .replaceAll(
                "\\{" + "organization_binding_id" + "\\}",
                apiClient.escapeString(organizationBindingId.toString()))
            .replaceAll("\\{" + "handle_id" + "\\}", apiClient.escapeString(handleId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.GoogleChatIntegrationApi.updateOrganizationHandle",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<GoogleChatOrganizationHandleResponse>() {});
  }

  /**
   * Update organization handle.
   *
   * <p>See {@link #updateOrganizationHandleWithHttpInfo}.
   *
   * @param organizationBindingId Your organization binding ID. (required)
   * @param handleId Your organization handle ID. (required)
   * @param body Organization handle payload. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;GoogleChatOrganizationHandleResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<GoogleChatOrganizationHandleResponse>>
      updateOrganizationHandleWithHttpInfoAsync(
          String organizationBindingId,
          String handleId,
          GoogleChatUpdateOrganizationHandleRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'organizationBindingId' is set
    if (organizationBindingId == null) {
      CompletableFuture<ApiResponse<GoogleChatOrganizationHandleResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'organizationBindingId' when calling"
                  + " updateOrganizationHandle"));
      return result;
    }

    // verify the required parameter 'handleId' is set
    if (handleId == null) {
      CompletableFuture<ApiResponse<GoogleChatOrganizationHandleResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'handleId' when calling updateOrganizationHandle"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<GoogleChatOrganizationHandleResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateOrganizationHandle"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration/google-chat/organizations/{organization_binding_id}/organization-handles/{handle_id}"
            .replaceAll(
                "\\{" + "organization_binding_id" + "\\}",
                apiClient.escapeString(organizationBindingId.toString()))
            .replaceAll("\\{" + "handle_id" + "\\}", apiClient.escapeString(handleId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.GoogleChatIntegrationApi.updateOrganizationHandle",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<GoogleChatOrganizationHandleResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<GoogleChatOrganizationHandleResponse>() {});
  }
}
