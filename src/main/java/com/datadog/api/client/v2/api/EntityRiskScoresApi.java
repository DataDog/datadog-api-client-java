
package com.datadog.api.client.v2.api;

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
import com.datadog.api.client.v2.model.SecurityEntityRiskScoresResponse;


@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class EntityRiskScoresApi {
  private ApiClient apiClient;
  public EntityRiskScoresApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public EntityRiskScoresApi(ApiClient apiClient) {
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
   * Manage optional parameters to listEntityRiskScores.
   */
  public static class ListEntityRiskScoresOptionalParameters {
    private Long from;
    private Long to;
    private Integer pageSize;
    private Integer pageNumber;
    private String pageQueryId;
    private String filterSort;
    private String filterQuery;
    private List<String> entityType;

    /**
     * Set from.
     * @param from Start time for the query in Unix timestamp (milliseconds). Defaults to 2 weeks ago. (optional)
     * @return ListEntityRiskScoresOptionalParameters
     */
    public ListEntityRiskScoresOptionalParameters from(Long from) {
      this.from = from;
      return this;
    }

    /**
     * Set to.
     * @param to End time for the query in Unix timestamp (milliseconds). Defaults to now. (optional)
     * @return ListEntityRiskScoresOptionalParameters
     */
    public ListEntityRiskScoresOptionalParameters to(Long to) {
      this.to = to;
      return this;
    }

    /**
     * Set pageSize.
     * @param pageSize Size of the page to return. Maximum is 1000. (optional, default to 10)
     * @return ListEntityRiskScoresOptionalParameters
     */
    public ListEntityRiskScoresOptionalParameters pageSize(Integer pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set pageNumber.
     * @param pageNumber Page number to return (1-indexed). (optional, default to 1)
     * @return ListEntityRiskScoresOptionalParameters
     */
    public ListEntityRiskScoresOptionalParameters pageNumber(Integer pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set pageQueryId.
     * @param pageQueryId Query ID for pagination consistency. (optional)
     * @return ListEntityRiskScoresOptionalParameters
     */
    public ListEntityRiskScoresOptionalParameters pageQueryId(String pageQueryId) {
      this.pageQueryId = pageQueryId;
      return this;
    }

    /**
     * Set filterSort.
     * @param filterSort Sort order for results. Format: <code>field:direction</code> where direction is <code>asc</code> or <code>desc</code>. Supported fields: <code>riskScore</code>, <code>lastDetected</code>, <code>firstDetected</code>, <code>entityName</code>, <code>signalsDetected</code>. (optional)
     * @return ListEntityRiskScoresOptionalParameters
     */
    public ListEntityRiskScoresOptionalParameters filterSort(String filterSort) {
      this.filterSort = filterSort;
      return this;
    }

    /**
     * Set filterQuery.
     * @param filterQuery Supports filtering by entity attributes, risk scores, severity, and more. Example: <code>severity:critical AND entityType:aws_iam_user</code> (optional)
     * @return ListEntityRiskScoresOptionalParameters
     */
    public ListEntityRiskScoresOptionalParameters filterQuery(String filterQuery) {
      this.filterQuery = filterQuery;
      return this;
    }

    /**
     * Set entityType.
     * @param entityType Filter by entity type(s). Can specify multiple values. (optional)
     * @return ListEntityRiskScoresOptionalParameters
     */
    public ListEntityRiskScoresOptionalParameters entityType(List<String> entityType) {
      this.entityType = entityType;
      return this;
    }
  }

  /**
 * List Entity Risk Scores.
 *
 * See {@link #listEntityRiskScoresWithHttpInfo}.
 *
 * @return SecurityEntityRiskScoresResponse
 * @throws ApiException if fails to make API call
 */
  public SecurityEntityRiskScoresResponse listEntityRiskScores () throws ApiException {
    return listEntityRiskScoresWithHttpInfo(new ListEntityRiskScoresOptionalParameters()).getData();
  }

  /**
 * List Entity Risk Scores.
 *
 * See {@link #listEntityRiskScoresWithHttpInfoAsync}.
 *
 * @return CompletableFuture&lt;SecurityEntityRiskScoresResponse&gt;
 */
  public CompletableFuture<SecurityEntityRiskScoresResponse>listEntityRiskScoresAsync() {
    return listEntityRiskScoresWithHttpInfoAsync(new ListEntityRiskScoresOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * List Entity Risk Scores.
 *
 * See {@link #listEntityRiskScoresWithHttpInfo}.
 *
 * @param parameters Optional parameters for the request.
 * @return SecurityEntityRiskScoresResponse
 * @throws ApiException if fails to make API call
 */
  public SecurityEntityRiskScoresResponse listEntityRiskScores(ListEntityRiskScoresOptionalParameters parameters) throws ApiException {
    return listEntityRiskScoresWithHttpInfo(parameters).getData();
  }

  /**
 * List Entity Risk Scores.
 *
 * See {@link #listEntityRiskScoresWithHttpInfoAsync}.
 *
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;SecurityEntityRiskScoresResponse&gt;
 */
  public CompletableFuture<SecurityEntityRiskScoresResponse>listEntityRiskScoresAsync(ListEntityRiskScoresOptionalParameters parameters) {
    return listEntityRiskScoresWithHttpInfoAsync(parameters).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get a list of entity risk scores for your organization. Entity risk scores provide security risk assessment for entities like cloud resources, identities, or services based on detected signals, misconfigurations, and identity risks.</p>
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;SecurityEntityRiskScoresResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SecurityEntityRiskScoresResponse> listEntityRiskScoresWithHttpInfo(ListEntityRiskScoresOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listEntityRiskScores";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    Long from = parameters.from;
    Long to = parameters.to;
    Integer pageSize = parameters.pageSize;
    Integer pageNumber = parameters.pageNumber;
    String pageQueryId = parameters.pageQueryId;
    String filterSort = parameters.filterSort;
    String filterQuery = parameters.filterQuery;
    List<String> entityType = parameters.entityType;
    // create path and map variables
    String localVarPath = "/api/v2/security-entities/risk-scores";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "from", from));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "to", to));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[queryId]", pageQueryId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[sort]", filterSort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[query]", filterQuery));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "entityType", entityType));

    Invocation.Builder builder = apiClient.createBuilder("v2.EntityRiskScoresApi.listEntityRiskScores", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SecurityEntityRiskScoresResponse>() {});
  }

  /**
   * List Entity Risk Scores.
   *
   * See {@link #listEntityRiskScoresWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;SecurityEntityRiskScoresResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SecurityEntityRiskScoresResponse>> listEntityRiskScoresWithHttpInfoAsync(ListEntityRiskScoresOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listEntityRiskScores";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<SecurityEntityRiskScoresResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    Long from = parameters.from;
    Long to = parameters.to;
    Integer pageSize = parameters.pageSize;
    Integer pageNumber = parameters.pageNumber;
    String pageQueryId = parameters.pageQueryId;
    String filterSort = parameters.filterSort;
    String filterQuery = parameters.filterQuery;
    List<String> entityType = parameters.entityType;
    // create path and map variables
    String localVarPath = "/api/v2/security-entities/risk-scores";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "from", from));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "to", to));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[queryId]", pageQueryId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[sort]", filterSort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[query]", filterQuery));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "entityType", entityType));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.EntityRiskScoresApi.listEntityRiskScores", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SecurityEntityRiskScoresResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<SecurityEntityRiskScoresResponse>() {});
  }
}