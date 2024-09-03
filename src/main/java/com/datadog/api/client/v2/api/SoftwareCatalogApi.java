package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.PaginationIterable;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.EntityData;
import com.datadog.api.client.v2.model.IncludeType;
import com.datadog.api.client.v2.model.ListEntityCatalogResponse;
import com.datadog.api.client.v2.model.RelationType;
import com.datadog.api.client.v2.model.UpsertCatalogEntityRequest;
import com.datadog.api.client.v2.model.UpsertCatalogEntityResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SoftwareCatalogApi {
  private ApiClient apiClient;

  public SoftwareCatalogApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public SoftwareCatalogApi(ApiClient apiClient) {
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
   * Delete a single entity.
   *
   * <p>See {@link #deleteCatalogEntityWithHttpInfo}.
   *
   * @param entityId UUID or Entity Ref (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteCatalogEntity(String entityId) throws ApiException {
    deleteCatalogEntityWithHttpInfo(entityId);
  }

  /**
   * Delete a single entity.
   *
   * <p>See {@link #deleteCatalogEntityWithHttpInfoAsync}.
   *
   * @param entityId UUID or Entity Ref (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteCatalogEntityAsync(String entityId) {
    return deleteCatalogEntityWithHttpInfoAsync(entityId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete a single entity in Software Catalog.
   *
   * @param entityId UUID or Entity Ref (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteCatalogEntityWithHttpInfo(String entityId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'entityId' is set
    if (entityId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'entityId' when calling deleteCatalogEntity");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/catalog/entity/{entity_id}"
            .replaceAll("\\{" + "entity_id" + "\\}", apiClient.escapeString(entityId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SoftwareCatalogApi.deleteCatalogEntity",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
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
   * Delete a single entity.
   *
   * <p>See {@link #deleteCatalogEntityWithHttpInfo}.
   *
   * @param entityId UUID or Entity Ref (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteCatalogEntityWithHttpInfoAsync(
      String entityId) {
    Object localVarPostBody = null;

    // verify the required parameter 'entityId' is set
    if (entityId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'entityId' when calling deleteCatalogEntity"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/catalog/entity/{entity_id}"
            .replaceAll("\\{" + "entity_id" + "\\}", apiClient.escapeString(entityId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SoftwareCatalogApi.deleteCatalogEntity",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"*/*"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
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

  /** Manage optional parameters to listCatalogEntity. */
  public static class ListCatalogEntityOptionalParameters {
    private Long pageOffset;
    private Long pageLimit;
    private String fitlerId;
    private String fitlerRef;
    private String fitlerName;
    private String fitlerKind;
    private String fitlerOwner;
    private RelationType fitlerRelationType;
    private String fitlerExcludeSnapshot;
    private IncludeType include;

    /**
     * Set pageOffset.
     *
     * @param pageOffset Specific offset to use as the beginning of the returned page. (optional,
     *     default to 0)
     * @return ListCatalogEntityOptionalParameters
     */
    public ListCatalogEntityOptionalParameters pageOffset(Long pageOffset) {
      this.pageOffset = pageOffset;
      return this;
    }

    /**
     * Set pageLimit.
     *
     * @param pageLimit Maximum number of entities in the response. (optional, default to 100)
     * @return ListCatalogEntityOptionalParameters
     */
    public ListCatalogEntityOptionalParameters pageLimit(Long pageLimit) {
      this.pageLimit = pageLimit;
      return this;
    }

    /**
     * Set fitlerId.
     *
     * @param fitlerId Filter entities by UUID (optional)
     * @return ListCatalogEntityOptionalParameters
     */
    public ListCatalogEntityOptionalParameters fitlerId(String fitlerId) {
      this.fitlerId = fitlerId;
      return this;
    }

    /**
     * Set fitlerRef.
     *
     * @param fitlerRef Filter entities by reference (optional)
     * @return ListCatalogEntityOptionalParameters
     */
    public ListCatalogEntityOptionalParameters fitlerRef(String fitlerRef) {
      this.fitlerRef = fitlerRef;
      return this;
    }

    /**
     * Set fitlerName.
     *
     * @param fitlerName Filter entities by name (optional)
     * @return ListCatalogEntityOptionalParameters
     */
    public ListCatalogEntityOptionalParameters fitlerName(String fitlerName) {
      this.fitlerName = fitlerName;
      return this;
    }

    /**
     * Set fitlerKind.
     *
     * @param fitlerKind Filter entities by kind (optional)
     * @return ListCatalogEntityOptionalParameters
     */
    public ListCatalogEntityOptionalParameters fitlerKind(String fitlerKind) {
      this.fitlerKind = fitlerKind;
      return this;
    }

    /**
     * Set fitlerOwner.
     *
     * @param fitlerOwner Filter entities by owner (optional)
     * @return ListCatalogEntityOptionalParameters
     */
    public ListCatalogEntityOptionalParameters fitlerOwner(String fitlerOwner) {
      this.fitlerOwner = fitlerOwner;
      return this;
    }

    /**
     * Set fitlerRelationType.
     *
     * @param fitlerRelationType Filter entities by relation type (optional)
     * @return ListCatalogEntityOptionalParameters
     */
    public ListCatalogEntityOptionalParameters fitlerRelationType(RelationType fitlerRelationType) {
      this.fitlerRelationType = fitlerRelationType;
      return this;
    }

    /**
     * Set fitlerExcludeSnapshot.
     *
     * @param fitlerExcludeSnapshot Filter entities by excluding snapshotted entities (optional)
     * @return ListCatalogEntityOptionalParameters
     */
    public ListCatalogEntityOptionalParameters fitlerExcludeSnapshot(String fitlerExcludeSnapshot) {
      this.fitlerExcludeSnapshot = fitlerExcludeSnapshot;
      return this;
    }

    /**
     * Set include.
     *
     * @param include include relationship data (optional)
     * @return ListCatalogEntityOptionalParameters
     */
    public ListCatalogEntityOptionalParameters include(IncludeType include) {
      this.include = include;
      return this;
    }
  }

  /**
   * Get a list of entities.
   *
   * <p>See {@link #listCatalogEntityWithHttpInfo}.
   *
   * @return ListEntityCatalogResponse
   * @throws ApiException if fails to make API call
   */
  public ListEntityCatalogResponse listCatalogEntity() throws ApiException {
    return listCatalogEntityWithHttpInfo(new ListCatalogEntityOptionalParameters()).getData();
  }

  /**
   * Get a list of entities.
   *
   * <p>See {@link #listCatalogEntityWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;ListEntityCatalogResponse&gt;
   */
  public CompletableFuture<ListEntityCatalogResponse> listCatalogEntityAsync() {
    return listCatalogEntityWithHttpInfoAsync(new ListCatalogEntityOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a list of entities.
   *
   * <p>See {@link #listCatalogEntityWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return ListEntityCatalogResponse
   * @throws ApiException if fails to make API call
   */
  public ListEntityCatalogResponse listCatalogEntity(ListCatalogEntityOptionalParameters parameters)
      throws ApiException {
    return listCatalogEntityWithHttpInfo(parameters).getData();
  }

  /**
   * Get a list of entities.
   *
   * <p>See {@link #listCatalogEntityWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ListEntityCatalogResponse&gt;
   */
  public CompletableFuture<ListEntityCatalogResponse> listCatalogEntityAsync(
      ListCatalogEntityOptionalParameters parameters) {
    return listCatalogEntityWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a list of entities.
   *
   * <p>See {@link #listCatalogEntityWithHttpInfo}.
   *
   * @return PaginationIterable&lt;EntityData&gt;
   */
  public PaginationIterable<EntityData> listCatalogEntityWithPagination() {
    ListCatalogEntityOptionalParameters parameters = new ListCatalogEntityOptionalParameters();
    return listCatalogEntityWithPagination(parameters);
  }

  /**
   * Get a list of entities.
   *
   * <p>See {@link #listCatalogEntityWithHttpInfo}.
   *
   * @return ListEntityCatalogResponse
   */
  public PaginationIterable<EntityData> listCatalogEntityWithPagination(
      ListCatalogEntityOptionalParameters parameters) {
    String resultsPath = "getData";
    String valueGetterPath = "";
    String valueSetterPath = "pageOffset";
    Boolean valueSetterParamOptional = true;
    parameters.pageOffset(0l);
    Long limit;

    if (parameters.pageLimit == null) {
      limit = 100l;
      parameters.pageLimit(limit);
    } else {
      limit = parameters.pageLimit;
    }

    LinkedHashMap<String, Object> args = new LinkedHashMap<String, Object>();
    args.put("optionalParams", parameters);

    PaginationIterable iterator =
        new PaginationIterable(
            this,
            "listCatalogEntity",
            resultsPath,
            valueGetterPath,
            valueSetterPath,
            valueSetterParamOptional,
            false,
            limit,
            args);

    return iterator;
  }

  /**
   * Get a list of entities from Software Catalog.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;ListEntityCatalogResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ListEntityCatalogResponse> listCatalogEntityWithHttpInfo(
      ListCatalogEntityOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    Long pageOffset = parameters.pageOffset;
    Long pageLimit = parameters.pageLimit;
    String fitlerId = parameters.fitlerId;
    String fitlerRef = parameters.fitlerRef;
    String fitlerName = parameters.fitlerName;
    String fitlerKind = parameters.fitlerKind;
    String fitlerOwner = parameters.fitlerOwner;
    RelationType fitlerRelationType = parameters.fitlerRelationType;
    String fitlerExcludeSnapshot = parameters.fitlerExcludeSnapshot;
    IncludeType include = parameters.include;
    // create path and map variables
    String localVarPath = "/api/v2/catalog/entity";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[offset]", pageOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fitler[id]", fitlerId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fitler[ref]", fitlerRef));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fitler[name]", fitlerName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fitler[kind]", fitlerKind));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fitler[owner]", fitlerOwner));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "fitler[relation][type]", fitlerRelationType));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "fitler[exclude_snapshot]", fitlerExcludeSnapshot));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SoftwareCatalogApi.listCatalogEntity",
            localVarPath,
            localVarQueryParams,
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<ListEntityCatalogResponse>() {});
  }

  /**
   * Get a list of entities.
   *
   * <p>See {@link #listCatalogEntityWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;ListEntityCatalogResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ListEntityCatalogResponse>>
      listCatalogEntityWithHttpInfoAsync(ListCatalogEntityOptionalParameters parameters) {
    Object localVarPostBody = null;
    Long pageOffset = parameters.pageOffset;
    Long pageLimit = parameters.pageLimit;
    String fitlerId = parameters.fitlerId;
    String fitlerRef = parameters.fitlerRef;
    String fitlerName = parameters.fitlerName;
    String fitlerKind = parameters.fitlerKind;
    String fitlerOwner = parameters.fitlerOwner;
    RelationType fitlerRelationType = parameters.fitlerRelationType;
    String fitlerExcludeSnapshot = parameters.fitlerExcludeSnapshot;
    IncludeType include = parameters.include;
    // create path and map variables
    String localVarPath = "/api/v2/catalog/entity";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[offset]", pageOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fitler[id]", fitlerId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fitler[ref]", fitlerRef));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fitler[name]", fitlerName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fitler[kind]", fitlerKind));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fitler[owner]", fitlerOwner));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "fitler[relation][type]", fitlerRelationType));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "fitler[exclude_snapshot]", fitlerExcludeSnapshot));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SoftwareCatalogApi.listCatalogEntity",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ListEntityCatalogResponse>> result = new CompletableFuture<>();
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
        new GenericType<ListEntityCatalogResponse>() {});
  }

  /**
   * Create or update entities.
   *
   * <p>See {@link #upsertCatalogEntityWithHttpInfo}.
   *
   * @param body Entity YAML/JSON. (required)
   * @return UpsertCatalogEntityResponse
   * @throws ApiException if fails to make API call
   */
  public UpsertCatalogEntityResponse upsertCatalogEntity(UpsertCatalogEntityRequest body)
      throws ApiException {
    return upsertCatalogEntityWithHttpInfo(body).getData();
  }

  /**
   * Create or update entities.
   *
   * <p>See {@link #upsertCatalogEntityWithHttpInfoAsync}.
   *
   * @param body Entity YAML/JSON. (required)
   * @return CompletableFuture&lt;UpsertCatalogEntityResponse&gt;
   */
  public CompletableFuture<UpsertCatalogEntityResponse> upsertCatalogEntityAsync(
      UpsertCatalogEntityRequest body) {
    return upsertCatalogEntityWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create or update entities in Software Catalog.
   *
   * @param body Entity YAML/JSON. (required)
   * @return ApiResponse&lt;UpsertCatalogEntityResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 202 </td><td> ACCEPTED </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<UpsertCatalogEntityResponse> upsertCatalogEntityWithHttpInfo(
      UpsertCatalogEntityRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling upsertCatalogEntity");
    }
    // create path and map variables
    String localVarPath = "/api/v2/catalog/entity";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SoftwareCatalogApi.upsertCatalogEntity",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<UpsertCatalogEntityResponse>() {});
  }

  /**
   * Create or update entities.
   *
   * <p>See {@link #upsertCatalogEntityWithHttpInfo}.
   *
   * @param body Entity YAML/JSON. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;UpsertCatalogEntityResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<UpsertCatalogEntityResponse>>
      upsertCatalogEntityWithHttpInfoAsync(UpsertCatalogEntityRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<UpsertCatalogEntityResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling upsertCatalogEntity"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/catalog/entity";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SoftwareCatalogApi.upsertCatalogEntity",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<UpsertCatalogEntityResponse>> result =
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
        new GenericType<UpsertCatalogEntityResponse>() {});
  }
}
