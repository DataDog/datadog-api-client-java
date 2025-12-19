package com.datadog.api.client.v1.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v1.model.HostTags;
import com.datadog.api.client.v1.model.TagToHosts;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TagsApi {
  private ApiClient apiClient;

  public TagsApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public TagsApi(ApiClient apiClient) {
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

  /** Manage optional parameters to createHostTags. */
  public static class CreateHostTagsOptionalParameters {
    private String source;

    /**
     * Set source.
     *
     * @param source Source to filter. <a
     *     href="https://docs.datadoghq.com/integrations/faq/list-of-api-source-attribute-value">Complete
     *     list of source attribute values</a>. Use "user" source for custom-defined tags.
     *     (optional)
     * @return CreateHostTagsOptionalParameters
     */
    public CreateHostTagsOptionalParameters source(String source) {
      this.source = source;
      return this;
    }
  }

  /**
   * Add tags to a host.
   *
   * <p>See {@link #createHostTagsWithHttpInfo}.
   *
   * @param hostName Specified host name to add new tags (required)
   * @param body Update host tags request body. (required)
   * @return HostTags
   * @throws ApiException if fails to make API call
   */
  public HostTags createHostTags(String hostName, HostTags body) throws ApiException {
    return createHostTagsWithHttpInfo(hostName, body, new CreateHostTagsOptionalParameters())
        .getData();
  }

  /**
   * Add tags to a host.
   *
   * <p>See {@link #createHostTagsWithHttpInfoAsync}.
   *
   * @param hostName Specified host name to add new tags (required)
   * @param body Update host tags request body. (required)
   * @return CompletableFuture&lt;HostTags&gt;
   */
  public CompletableFuture<HostTags> createHostTagsAsync(String hostName, HostTags body) {
    return createHostTagsWithHttpInfoAsync(hostName, body, new CreateHostTagsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Add tags to a host.
   *
   * <p>See {@link #createHostTagsWithHttpInfo}.
   *
   * @param hostName Specified host name to add new tags (required)
   * @param body Update host tags request body. (required)
   * @param parameters Optional parameters for the request.
   * @return HostTags
   * @throws ApiException if fails to make API call
   */
  public HostTags createHostTags(
      String hostName, HostTags body, CreateHostTagsOptionalParameters parameters)
      throws ApiException {
    return createHostTagsWithHttpInfo(hostName, body, parameters).getData();
  }

  /**
   * Add tags to a host.
   *
   * <p>See {@link #createHostTagsWithHttpInfoAsync}.
   *
   * @param hostName Specified host name to add new tags (required)
   * @param body Update host tags request body. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;HostTags&gt;
   */
  public CompletableFuture<HostTags> createHostTagsAsync(
      String hostName, HostTags body, CreateHostTagsOptionalParameters parameters) {
    return createHostTagsWithHttpInfoAsync(hostName, body, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * This endpoint allows you to add new tags to a host, optionally specifying what source these
   * tags come from.
   *
   * @param hostName Specified host name to add new tags (required)
   * @param body Update host tags request body. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;HostTags&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<HostTags> createHostTagsWithHttpInfo(
      String hostName, HostTags body, CreateHostTagsOptionalParameters parameters)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'hostName' is set
    if (hostName == null) {
      throw new ApiException(
          400, "Missing the required parameter 'hostName' when calling createHostTags");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createHostTags");
    }
    String source = parameters.source;
    // create path and map variables
    String localVarPath =
        "/api/v1/tags/hosts/{host_name}"
            .replaceAll("\\{" + "host_name" + "\\}", apiClient.escapeString(hostName.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "source", source));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v1.TagsApi.createHostTags",
            localVarPath,
            localVarQueryParams,
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
        new GenericType<HostTags>() {});
  }

  /**
   * Add tags to a host.
   *
   * <p>See {@link #createHostTagsWithHttpInfo}.
   *
   * @param hostName Specified host name to add new tags (required)
   * @param body Update host tags request body. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;HostTags&gt;&gt;
   */
  public CompletableFuture<ApiResponse<HostTags>> createHostTagsWithHttpInfoAsync(
      String hostName, HostTags body, CreateHostTagsOptionalParameters parameters) {
    Object localVarPostBody = body;

    // verify the required parameter 'hostName' is set
    if (hostName == null) {
      CompletableFuture<ApiResponse<HostTags>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'hostName' when calling createHostTags"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<HostTags>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createHostTags"));
      return result;
    }
    String source = parameters.source;
    // create path and map variables
    String localVarPath =
        "/api/v1/tags/hosts/{host_name}"
            .replaceAll("\\{" + "host_name" + "\\}", apiClient.escapeString(hostName.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "source", source));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1.TagsApi.createHostTags",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<HostTags>> result = new CompletableFuture<>();
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
        new GenericType<HostTags>() {});
  }

  /** Manage optional parameters to deleteHostTags. */
  public static class DeleteHostTagsOptionalParameters {
    private String source;

    /**
     * Set source.
     *
     * @param source Source of the tags to be deleted. <a
     *     href="https://docs.datadoghq.com/integrations/faq/list-of-api-source-attribute-value">Complete
     *     list of source attribute values</a>. Use "user" source for custom-defined tags.
     *     (optional)
     * @return DeleteHostTagsOptionalParameters
     */
    public DeleteHostTagsOptionalParameters source(String source) {
      this.source = source;
      return this;
    }
  }

  /**
   * Remove host tags.
   *
   * <p>See {@link #deleteHostTagsWithHttpInfo}.
   *
   * @param hostName Specified host name to delete tags (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteHostTags(String hostName) throws ApiException {
    deleteHostTagsWithHttpInfo(hostName, new DeleteHostTagsOptionalParameters());
  }

  /**
   * Remove host tags.
   *
   * <p>See {@link #deleteHostTagsWithHttpInfoAsync}.
   *
   * @param hostName Specified host name to delete tags (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteHostTagsAsync(String hostName) {
    return deleteHostTagsWithHttpInfoAsync(hostName, new DeleteHostTagsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Remove host tags.
   *
   * <p>See {@link #deleteHostTagsWithHttpInfo}.
   *
   * @param hostName Specified host name to delete tags (required)
   * @param parameters Optional parameters for the request.
   * @throws ApiException if fails to make API call
   */
  public void deleteHostTags(String hostName, DeleteHostTagsOptionalParameters parameters)
      throws ApiException {
    deleteHostTagsWithHttpInfo(hostName, parameters);
  }

  /**
   * Remove host tags.
   *
   * <p>See {@link #deleteHostTagsWithHttpInfoAsync}.
   *
   * @param hostName Specified host name to delete tags (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteHostTagsAsync(
      String hostName, DeleteHostTagsOptionalParameters parameters) {
    return deleteHostTagsWithHttpInfoAsync(hostName, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * This endpoint allows you to remove all tags for a single host. If no source is specified, only
   * deletes tags with no source.
   *
   * @param hostName Specified host name to delete tags (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteHostTagsWithHttpInfo(
      String hostName, DeleteHostTagsOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'hostName' is set
    if (hostName == null) {
      throw new ApiException(
          400, "Missing the required parameter 'hostName' when calling deleteHostTags");
    }
    String source = parameters.source;
    // create path and map variables
    String localVarPath =
        "/api/v1/tags/hosts/{host_name}"
            .replaceAll("\\{" + "host_name" + "\\}", apiClient.escapeString(hostName.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "source", source));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v1.TagsApi.deleteHostTags",
            localVarPath,
            localVarQueryParams,
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
   * Remove host tags.
   *
   * <p>See {@link #deleteHostTagsWithHttpInfo}.
   *
   * @param hostName Specified host name to delete tags (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteHostTagsWithHttpInfoAsync(
      String hostName, DeleteHostTagsOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'hostName' is set
    if (hostName == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'hostName' when calling deleteHostTags"));
      return result;
    }
    String source = parameters.source;
    // create path and map variables
    String localVarPath =
        "/api/v1/tags/hosts/{host_name}"
            .replaceAll("\\{" + "host_name" + "\\}", apiClient.escapeString(hostName.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "source", source));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1.TagsApi.deleteHostTags",
              localVarPath,
              localVarQueryParams,
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

  /** Manage optional parameters to getHostTags. */
  public static class GetHostTagsOptionalParameters {
    private String source;

    /**
     * Set source.
     *
     * @param source Source to filter. <a
     *     href="https://docs.datadoghq.com/integrations/faq/list-of-api-source-attribute-value">Complete
     *     list of source attribute values</a>. Use "user" source for custom-defined tags.
     *     (optional)
     * @return GetHostTagsOptionalParameters
     */
    public GetHostTagsOptionalParameters source(String source) {
      this.source = source;
      return this;
    }
  }

  /**
   * Get Host Tags.
   *
   * <p>See {@link #getHostTagsWithHttpInfo}.
   *
   * @param hostName Name of the host to retrieve tags for (required)
   * @return HostTags
   * @throws ApiException if fails to make API call
   */
  public HostTags getHostTags(String hostName) throws ApiException {
    return getHostTagsWithHttpInfo(hostName, new GetHostTagsOptionalParameters()).getData();
  }

  /**
   * Get Host Tags.
   *
   * <p>See {@link #getHostTagsWithHttpInfoAsync}.
   *
   * @param hostName Name of the host to retrieve tags for (required)
   * @return CompletableFuture&lt;HostTags&gt;
   */
  public CompletableFuture<HostTags> getHostTagsAsync(String hostName) {
    return getHostTagsWithHttpInfoAsync(hostName, new GetHostTagsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get Host Tags.
   *
   * <p>See {@link #getHostTagsWithHttpInfo}.
   *
   * @param hostName Name of the host to retrieve tags for (required)
   * @param parameters Optional parameters for the request.
   * @return HostTags
   * @throws ApiException if fails to make API call
   */
  public HostTags getHostTags(String hostName, GetHostTagsOptionalParameters parameters)
      throws ApiException {
    return getHostTagsWithHttpInfo(hostName, parameters).getData();
  }

  /**
   * Get Host Tags.
   *
   * <p>See {@link #getHostTagsWithHttpInfoAsync}.
   *
   * @param hostName Name of the host to retrieve tags for (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;HostTags&gt;
   */
  public CompletableFuture<HostTags> getHostTagsAsync(
      String hostName, GetHostTagsOptionalParameters parameters) {
    return getHostTagsWithHttpInfoAsync(hostName, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Return the list of tags that apply to a given host.
   *
   * @param hostName Name of the host to retrieve tags for (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;HostTags&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<HostTags> getHostTagsWithHttpInfo(
      String hostName, GetHostTagsOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'hostName' is set
    if (hostName == null) {
      throw new ApiException(
          400, "Missing the required parameter 'hostName' when calling getHostTags");
    }
    String source = parameters.source;
    // create path and map variables
    String localVarPath =
        "/api/v1/tags/hosts/{host_name}"
            .replaceAll("\\{" + "host_name" + "\\}", apiClient.escapeString(hostName.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "source", source));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v1.TagsApi.getHostTags",
            localVarPath,
            localVarQueryParams,
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
        new GenericType<HostTags>() {});
  }

  /**
   * Get Host Tags.
   *
   * <p>See {@link #getHostTagsWithHttpInfo}.
   *
   * @param hostName Name of the host to retrieve tags for (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;HostTags&gt;&gt;
   */
  public CompletableFuture<ApiResponse<HostTags>> getHostTagsWithHttpInfoAsync(
      String hostName, GetHostTagsOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'hostName' is set
    if (hostName == null) {
      CompletableFuture<ApiResponse<HostTags>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'hostName' when calling getHostTags"));
      return result;
    }
    String source = parameters.source;
    // create path and map variables
    String localVarPath =
        "/api/v1/tags/hosts/{host_name}"
            .replaceAll("\\{" + "host_name" + "\\}", apiClient.escapeString(hostName.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "source", source));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1.TagsApi.getHostTags",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<HostTags>> result = new CompletableFuture<>();
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
        new GenericType<HostTags>() {});
  }

  /** Manage optional parameters to listHostTags. */
  public static class ListHostTagsOptionalParameters {
    private String source;

    /**
     * Set source.
     *
     * @param source Source to filter. <a
     *     href="https://docs.datadoghq.com/integrations/faq/list-of-api-source-attribute-value">Complete
     *     list of source attribute values</a>. Use "user" source for custom-defined tags.
     *     (optional)
     * @return ListHostTagsOptionalParameters
     */
    public ListHostTagsOptionalParameters source(String source) {
      this.source = source;
      return this;
    }
  }

  /**
   * Get All Host Tags.
   *
   * <p>See {@link #listHostTagsWithHttpInfo}.
   *
   * @return TagToHosts
   * @throws ApiException if fails to make API call
   */
  public TagToHosts listHostTags() throws ApiException {
    return listHostTagsWithHttpInfo(new ListHostTagsOptionalParameters()).getData();
  }

  /**
   * Get All Host Tags.
   *
   * <p>See {@link #listHostTagsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;TagToHosts&gt;
   */
  public CompletableFuture<TagToHosts> listHostTagsAsync() {
    return listHostTagsWithHttpInfoAsync(new ListHostTagsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get All Host Tags.
   *
   * <p>See {@link #listHostTagsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return TagToHosts
   * @throws ApiException if fails to make API call
   */
  public TagToHosts listHostTags(ListHostTagsOptionalParameters parameters) throws ApiException {
    return listHostTagsWithHttpInfo(parameters).getData();
  }

  /**
   * Get All Host Tags.
   *
   * <p>See {@link #listHostTagsWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;TagToHosts&gt;
   */
  public CompletableFuture<TagToHosts> listHostTagsAsync(
      ListHostTagsOptionalParameters parameters) {
    return listHostTagsWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Returns a mapping of tags to hosts. For each tag, the response returns a list of host names
   * that contain this tag. There is a restriction of 10k total host names from the org that can be
   * attached to tags and returned.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;TagToHosts&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<TagToHosts> listHostTagsWithHttpInfo(ListHostTagsOptionalParameters parameters)
      throws ApiException {
    Object localVarPostBody = null;
    String source = parameters.source;
    // create path and map variables
    String localVarPath = "/api/v1/tags/hosts";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "source", source));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v1.TagsApi.listHostTags",
            localVarPath,
            localVarQueryParams,
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<TagToHosts>() {});
  }

  /**
   * Get All Host Tags.
   *
   * <p>See {@link #listHostTagsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;TagToHosts&gt;&gt;
   */
  public CompletableFuture<ApiResponse<TagToHosts>> listHostTagsWithHttpInfoAsync(
      ListHostTagsOptionalParameters parameters) {
    Object localVarPostBody = null;
    String source = parameters.source;
    // create path and map variables
    String localVarPath = "/api/v1/tags/hosts";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "source", source));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1.TagsApi.listHostTags",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<TagToHosts>> result = new CompletableFuture<>();
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
        new GenericType<TagToHosts>() {});
  }

  /** Manage optional parameters to updateHostTags. */
  public static class UpdateHostTagsOptionalParameters {
    private String source;

    /**
     * Set source.
     *
     * @param source Source to filter. <a
     *     href="https://docs.datadoghq.com/integrations/faq/list-of-api-source-attribute-value">Complete
     *     list of source attribute values</a>. Use "user" source for custom-defined tags.
     *     (optional)
     * @return UpdateHostTagsOptionalParameters
     */
    public UpdateHostTagsOptionalParameters source(String source) {
      this.source = source;
      return this;
    }
  }

  /**
   * Update host tags.
   *
   * <p>See {@link #updateHostTagsWithHttpInfo}.
   *
   * @param hostName Specified host name to change tags (required)
   * @param body Add tags to host (required)
   * @return HostTags
   * @throws ApiException if fails to make API call
   */
  public HostTags updateHostTags(String hostName, HostTags body) throws ApiException {
    return updateHostTagsWithHttpInfo(hostName, body, new UpdateHostTagsOptionalParameters())
        .getData();
  }

  /**
   * Update host tags.
   *
   * <p>See {@link #updateHostTagsWithHttpInfoAsync}.
   *
   * @param hostName Specified host name to change tags (required)
   * @param body Add tags to host (required)
   * @return CompletableFuture&lt;HostTags&gt;
   */
  public CompletableFuture<HostTags> updateHostTagsAsync(String hostName, HostTags body) {
    return updateHostTagsWithHttpInfoAsync(hostName, body, new UpdateHostTagsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update host tags.
   *
   * <p>See {@link #updateHostTagsWithHttpInfo}.
   *
   * @param hostName Specified host name to change tags (required)
   * @param body Add tags to host (required)
   * @param parameters Optional parameters for the request.
   * @return HostTags
   * @throws ApiException if fails to make API call
   */
  public HostTags updateHostTags(
      String hostName, HostTags body, UpdateHostTagsOptionalParameters parameters)
      throws ApiException {
    return updateHostTagsWithHttpInfo(hostName, body, parameters).getData();
  }

  /**
   * Update host tags.
   *
   * <p>See {@link #updateHostTagsWithHttpInfoAsync}.
   *
   * @param hostName Specified host name to change tags (required)
   * @param body Add tags to host (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;HostTags&gt;
   */
  public CompletableFuture<HostTags> updateHostTagsAsync(
      String hostName, HostTags body, UpdateHostTagsOptionalParameters parameters) {
    return updateHostTagsWithHttpInfoAsync(hostName, body, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * This endpoint allows you to update/replace all tags in an integration source with those
   * supplied in the request.
   *
   * @param hostName Specified host name to change tags (required)
   * @param body Add tags to host (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;HostTags&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<HostTags> updateHostTagsWithHttpInfo(
      String hostName, HostTags body, UpdateHostTagsOptionalParameters parameters)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'hostName' is set
    if (hostName == null) {
      throw new ApiException(
          400, "Missing the required parameter 'hostName' when calling updateHostTags");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateHostTags");
    }
    String source = parameters.source;
    // create path and map variables
    String localVarPath =
        "/api/v1/tags/hosts/{host_name}"
            .replaceAll("\\{" + "host_name" + "\\}", apiClient.escapeString(hostName.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "source", source));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v1.TagsApi.updateHostTags",
            localVarPath,
            localVarQueryParams,
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
        new GenericType<HostTags>() {});
  }

  /**
   * Update host tags.
   *
   * <p>See {@link #updateHostTagsWithHttpInfo}.
   *
   * @param hostName Specified host name to change tags (required)
   * @param body Add tags to host (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;HostTags&gt;&gt;
   */
  public CompletableFuture<ApiResponse<HostTags>> updateHostTagsWithHttpInfoAsync(
      String hostName, HostTags body, UpdateHostTagsOptionalParameters parameters) {
    Object localVarPostBody = body;

    // verify the required parameter 'hostName' is set
    if (hostName == null) {
      CompletableFuture<ApiResponse<HostTags>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'hostName' when calling updateHostTags"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<HostTags>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateHostTags"));
      return result;
    }
    String source = parameters.source;
    // create path and map variables
    String localVarPath =
        "/api/v1/tags/hosts/{host_name}"
            .replaceAll("\\{" + "host_name" + "\\}", apiClient.escapeString(hostName.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "source", source));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1.TagsApi.updateHostTags",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<HostTags>> result = new CompletableFuture<>();
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
        new GenericType<HostTags>() {});
  }
}
