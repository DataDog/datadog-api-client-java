package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.PaginationIterable;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.GetInvestigationResponse;
import com.datadog.api.client.v2.model.ListInvestigationsResponse;
import com.datadog.api.client.v2.model.ListInvestigationsResponseData;
import com.datadog.api.client.v2.model.TriggerInvestigationRequest;
import com.datadog.api.client.v2.model.TriggerInvestigationResponse;
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
public class BitsAiApi {
  private ApiClient apiClient;

  public BitsAiApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public BitsAiApi(ApiClient apiClient) {
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
   * Get a Bits AI investigation.
   *
   * <p>See {@link #getInvestigationWithHttpInfo}.
   *
   * @param id The ID of the investigation. (required)
   * @return GetInvestigationResponse
   * @throws ApiException if fails to make API call
   */
  public GetInvestigationResponse getInvestigation(String id) throws ApiException {
    return getInvestigationWithHttpInfo(id).getData();
  }

  /**
   * Get a Bits AI investigation.
   *
   * <p>See {@link #getInvestigationWithHttpInfoAsync}.
   *
   * @param id The ID of the investigation. (required)
   * @return CompletableFuture&lt;GetInvestigationResponse&gt;
   */
  public CompletableFuture<GetInvestigationResponse> getInvestigationAsync(String id) {
    return getInvestigationWithHttpInfoAsync(id)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a specific Bits AI investigation by ID.
   *
   * @param id The ID of the investigation. (required)
   * @return ApiResponse&lt;GetInvestigationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<GetInvestigationResponse> getInvestigationWithHttpInfo(String id)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getInvestigation";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(
          400, "Missing the required parameter 'id' when calling getInvestigation");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/bits-ai/investigations/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.BitsAiApi.getInvestigation",
            localVarPath,
            new ArrayList<Pair>(),
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
        new GenericType<GetInvestigationResponse>() {});
  }

  /**
   * Get a Bits AI investigation.
   *
   * <p>See {@link #getInvestigationWithHttpInfo}.
   *
   * @param id The ID of the investigation. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;GetInvestigationResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<GetInvestigationResponse>> getInvestigationWithHttpInfoAsync(
      String id) {
    // Check if unstable operation is enabled
    String operationId = "getInvestigation";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<GetInvestigationResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
      CompletableFuture<ApiResponse<GetInvestigationResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'id' when calling getInvestigation"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/bits-ai/investigations/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.BitsAiApi.getInvestigation",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<GetInvestigationResponse>> result = new CompletableFuture<>();
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
        new GenericType<GetInvestigationResponse>() {});
  }

  /** Manage optional parameters to listInvestigations. */
  public static class ListInvestigationsOptionalParameters {
    private Long pageOffset;
    private Long pageLimit;
    private Long filterMonitorId;

    /**
     * Set pageOffset.
     *
     * @param pageOffset Offset for pagination. (optional)
     * @return ListInvestigationsOptionalParameters
     */
    public ListInvestigationsOptionalParameters pageOffset(Long pageOffset) {
      this.pageOffset = pageOffset;
      return this;
    }

    /**
     * Set pageLimit.
     *
     * @param pageLimit Maximum number of investigations to return. (optional, default to 25)
     * @return ListInvestigationsOptionalParameters
     */
    public ListInvestigationsOptionalParameters pageLimit(Long pageLimit) {
      this.pageLimit = pageLimit;
      return this;
    }

    /**
     * Set filterMonitorId.
     *
     * @param filterMonitorId Filter investigations by monitor ID. (optional)
     * @return ListInvestigationsOptionalParameters
     */
    public ListInvestigationsOptionalParameters filterMonitorId(Long filterMonitorId) {
      this.filterMonitorId = filterMonitorId;
      return this;
    }
  }

  /**
   * List Bits AI investigations.
   *
   * <p>See {@link #listInvestigationsWithHttpInfo}.
   *
   * @return ListInvestigationsResponse
   * @throws ApiException if fails to make API call
   */
  public ListInvestigationsResponse listInvestigations() throws ApiException {
    return listInvestigationsWithHttpInfo(new ListInvestigationsOptionalParameters()).getData();
  }

  /**
   * List Bits AI investigations.
   *
   * <p>See {@link #listInvestigationsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;ListInvestigationsResponse&gt;
   */
  public CompletableFuture<ListInvestigationsResponse> listInvestigationsAsync() {
    return listInvestigationsWithHttpInfoAsync(new ListInvestigationsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List Bits AI investigations.
   *
   * <p>See {@link #listInvestigationsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return ListInvestigationsResponse
   * @throws ApiException if fails to make API call
   */
  public ListInvestigationsResponse listInvestigations(
      ListInvestigationsOptionalParameters parameters) throws ApiException {
    return listInvestigationsWithHttpInfo(parameters).getData();
  }

  /**
   * List Bits AI investigations.
   *
   * <p>See {@link #listInvestigationsWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ListInvestigationsResponse&gt;
   */
  public CompletableFuture<ListInvestigationsResponse> listInvestigationsAsync(
      ListInvestigationsOptionalParameters parameters) {
    return listInvestigationsWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List Bits AI investigations.
   *
   * <p>See {@link #listInvestigationsWithHttpInfo}.
   *
   * @return PaginationIterable&lt;ListInvestigationsResponseData&gt;
   */
  public PaginationIterable<ListInvestigationsResponseData> listInvestigationsWithPagination() {
    ListInvestigationsOptionalParameters parameters = new ListInvestigationsOptionalParameters();
    return listInvestigationsWithPagination(parameters);
  }

  /**
   * List Bits AI investigations.
   *
   * <p>See {@link #listInvestigationsWithHttpInfo}.
   *
   * @return ListInvestigationsResponse
   */
  public PaginationIterable<ListInvestigationsResponseData> listInvestigationsWithPagination(
      ListInvestigationsOptionalParameters parameters) {
    String resultsPath = "getData";
    String valueGetterPath = "";
    String valueSetterPath = "pageOffset";
    Boolean valueSetterParamOptional = true;
    Long limit;

    if (parameters.pageLimit == null) {
      limit = 25l;
      parameters.pageLimit(limit);
    } else {
      limit = parameters.pageLimit;
    }

    LinkedHashMap<String, Object> args = new LinkedHashMap<String, Object>();
    args.put("optionalParams", parameters);

    PaginationIterable iterator =
        new PaginationIterable(
            this,
            "listInvestigations",
            resultsPath,
            valueGetterPath,
            valueSetterPath,
            valueSetterParamOptional,
            true,
            false,
            limit,
            args,
            0);

    return iterator;
  }

  /**
   * List all Bits AI investigations for the organization.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;ListInvestigationsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ListInvestigationsResponse> listInvestigationsWithHttpInfo(
      ListInvestigationsOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listInvestigations";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    Long pageOffset = parameters.pageOffset;
    Long pageLimit = parameters.pageLimit;
    Long filterMonitorId = parameters.filterMonitorId;
    // create path and map variables
    String localVarPath = "/api/v2/bits-ai/investigations";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[offset]", pageOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[monitor_id]", filterMonitorId));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.BitsAiApi.listInvestigations",
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
        new GenericType<ListInvestigationsResponse>() {});
  }

  /**
   * List Bits AI investigations.
   *
   * <p>See {@link #listInvestigationsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;ListInvestigationsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ListInvestigationsResponse>>
      listInvestigationsWithHttpInfoAsync(ListInvestigationsOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listInvestigations";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ListInvestigationsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    Long pageOffset = parameters.pageOffset;
    Long pageLimit = parameters.pageLimit;
    Long filterMonitorId = parameters.filterMonitorId;
    // create path and map variables
    String localVarPath = "/api/v2/bits-ai/investigations";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[offset]", pageOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[monitor_id]", filterMonitorId));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.BitsAiApi.listInvestigations",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ListInvestigationsResponse>> result = new CompletableFuture<>();
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
        new GenericType<ListInvestigationsResponse>() {});
  }

  /**
   * Trigger a Bits AI investigation.
   *
   * <p>See {@link #triggerInvestigationWithHttpInfo}.
   *
   * @param body Trigger investigation request body. (required)
   * @return TriggerInvestigationResponse
   * @throws ApiException if fails to make API call
   */
  public TriggerInvestigationResponse triggerInvestigation(TriggerInvestigationRequest body)
      throws ApiException {
    return triggerInvestigationWithHttpInfo(body).getData();
  }

  /**
   * Trigger a Bits AI investigation.
   *
   * <p>See {@link #triggerInvestigationWithHttpInfoAsync}.
   *
   * @param body Trigger investigation request body. (required)
   * @return CompletableFuture&lt;TriggerInvestigationResponse&gt;
   */
  public CompletableFuture<TriggerInvestigationResponse> triggerInvestigationAsync(
      TriggerInvestigationRequest body) {
    return triggerInvestigationWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Trigger a new Bits AI investigation based on a monitor alert.
   *
   * @param body Trigger investigation request body. (required)
   * @return ApiResponse&lt;TriggerInvestigationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<TriggerInvestigationResponse> triggerInvestigationWithHttpInfo(
      TriggerInvestigationRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "triggerInvestigation";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling triggerInvestigation");
    }
    // create path and map variables
    String localVarPath = "/api/v2/bits-ai/investigations";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.BitsAiApi.triggerInvestigation",
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
        new GenericType<TriggerInvestigationResponse>() {});
  }

  /**
   * Trigger a Bits AI investigation.
   *
   * <p>See {@link #triggerInvestigationWithHttpInfo}.
   *
   * @param body Trigger investigation request body. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;TriggerInvestigationResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<TriggerInvestigationResponse>>
      triggerInvestigationWithHttpInfoAsync(TriggerInvestigationRequest body) {
    // Check if unstable operation is enabled
    String operationId = "triggerInvestigation";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<TriggerInvestigationResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<TriggerInvestigationResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling triggerInvestigation"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/bits-ai/investigations";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.BitsAiApi.triggerInvestigation",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<TriggerInvestigationResponse>> result =
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
        new GenericType<TriggerInvestigationResponse>() {});
  }
}
