
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
import com.datadog.api.client.v2.model.ListEntityCatalogResponse;
import com.datadog.api.client.v2.model.RelationType;
import com.datadog.api.client.v2.model.IncludeType;
import com.datadog.api.client.v2.model.UpsertCatalogEntityResponse;
import com.datadog.api.client.v2.model.UpsertCatalogEntityRequest;
import com.datadog.api.client.v2.model.ConvertCatalogEntityResponse;
import com.datadog.api.client.v2.model.EntitySchemaVersion;
import com.datadog.api.client.v2.model.EntityResponseArray;
import com.datadog.api.client.v2.model.ListKindCatalogResponse;
import com.datadog.api.client.v2.model.UpsertCatalogKindResponse;
import com.datadog.api.client.v2.model.UpsertCatalogKindRequest;
import com.datadog.api.client.v2.model.RecommendedEntityWithSchema;
import com.datadog.api.client.v2.model.RecommendedEntityID;
import com.datadog.api.client.v2.model.ListRelationCatalogResponse;
import com.datadog.api.client.v2.model.RelationIncludeType;
import com.datadog.api.client.v2.model.IDPConfigResponse;
import com.datadog.api.client.v2.model.IDPConfigRequest;
import com.datadog.api.client.v2.model.EntityData;
import com.datadog.api.client.v2.model.KindData;
import com.datadog.api.client.v2.model.RelationResponse;


@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
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
 * Accept recommended entities in bulk.
 *
 * See {@link #acceptRecommendedEntitiesWithHttpInfo}.
 *
 * @param body List of recommended entities to accept with their schemas. (required)
 * @throws ApiException if fails to make API call
 */
  public  void  acceptRecommendedEntities(List<RecommendedEntityWithSchema> body) throws ApiException {
    acceptRecommendedEntitiesWithHttpInfo(body);
  }

  /**
 * Accept recommended entities in bulk.
 *
 * See {@link #acceptRecommendedEntitiesWithHttpInfoAsync}.
 *
 * @param body List of recommended entities to accept with their schemas. (required)
 * @return CompletableFuture
 */
  public CompletableFuture<Void>acceptRecommendedEntitiesAsync(List<RecommendedEntityWithSchema> body) {
    return acceptRecommendedEntitiesWithHttpInfoAsync(body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Accept multiple recommended entities in Software Catalog in a single request.</p>
   *
   * @param body List of recommended entities to accept with their schemas. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> acceptRecommendedEntitiesWithHttpInfo(List<RecommendedEntityWithSchema> body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "acceptRecommendedEntities";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling acceptRecommendedEntities");
    }
    // create path and map variables
    String localVarPath = "/api/v2/catalog/recommended_entity/bulk_accept";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.SoftwareCatalogApi.acceptRecommendedEntities", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
   * Accept recommended entities in bulk.
   *
   * See {@link #acceptRecommendedEntitiesWithHttpInfo}.
   *
   * @param body List of recommended entities to accept with their schemas. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> acceptRecommendedEntitiesWithHttpInfoAsync(List<RecommendedEntityWithSchema> body) {
    // Check if unstable operation is enabled
    String operationId = "acceptRecommendedEntities";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling acceptRecommendedEntities"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/catalog/recommended_entity/bulk_accept";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.SoftwareCatalogApi.acceptRecommendedEntities", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
 * Convert entities between schema versions.
 *
 * See {@link #convertCatalogEntitiesWithHttpInfo}.
 *
 * @param targetVersion The target schema version to convert entities to. (required)
 * @param body Entity YAML or JSON to convert. (required)
 * @return String
 * @throws ApiException if fails to make API call
 */
  public String  convertCatalogEntities(EntitySchemaVersion targetVersion, UpsertCatalogEntityRequest body) throws ApiException {
    return convertCatalogEntitiesWithHttpInfo(targetVersion, body).getData();
  }

  /**
 * Convert entities between schema versions.
 *
 * See {@link #convertCatalogEntitiesWithHttpInfoAsync}.
 *
 * @param targetVersion The target schema version to convert entities to. (required)
 * @param body Entity YAML or JSON to convert. (required)
 * @return CompletableFuture&lt;String&gt;
 */
  public CompletableFuture<String>convertCatalogEntitiesAsync(EntitySchemaVersion targetVersion, UpsertCatalogEntityRequest body) {
    return convertCatalogEntitiesWithHttpInfoAsync(targetVersion, body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Convert entities from one schema version to another in Software Catalog.</p>
   *
   * @param targetVersion The target schema version to convert entities to. (required)
   * @param body Entity YAML or JSON to convert. (required)
   * @return ApiResponse&lt;String&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<String> convertCatalogEntitiesWithHttpInfo(EntitySchemaVersion targetVersion, UpsertCatalogEntityRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "convertCatalogEntities";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'targetVersion' is set
    if (targetVersion == null) {
      throw new ApiException(400, "Missing the required parameter 'targetVersion' when calling convertCatalogEntities");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling convertCatalogEntities");
    }
    // create path and map variables
    String localVarPath = "/api/v2/catalog/entity/convert";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "target_version", targetVersion));

    Invocation.Builder builder = apiClient.createBuilder("v2.SoftwareCatalogApi.convertCatalogEntities", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<String>() {});
  }

  /**
   * Convert entities between schema versions.
   *
   * See {@link #convertCatalogEntitiesWithHttpInfo}.
   *
   * @param targetVersion The target schema version to convert entities to. (required)
   * @param body Entity YAML or JSON to convert. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;String&gt;&gt;
   */
  public CompletableFuture<ApiResponse<String>> convertCatalogEntitiesWithHttpInfoAsync(EntitySchemaVersion targetVersion, UpsertCatalogEntityRequest body) {
    // Check if unstable operation is enabled
    String operationId = "convertCatalogEntities";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<String>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'targetVersion' is set
    if (targetVersion == null) {
        CompletableFuture<ApiResponse<String>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'targetVersion' when calling convertCatalogEntities"));
        return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<String>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling convertCatalogEntities"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/catalog/entity/convert";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "target_version", targetVersion));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.SoftwareCatalogApi.convertCatalogEntities", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<String>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<String>() {});
  }

  /**
 * Decline recommended entities in bulk.
 *
 * See {@link #declineRecommendedEntitiesWithHttpInfo}.
 *
 * @param body List of recommended entity IDs to decline. (required)
 * @throws ApiException if fails to make API call
 */
  public  void  declineRecommendedEntities(List<RecommendedEntityID> body) throws ApiException {
    declineRecommendedEntitiesWithHttpInfo(body);
  }

  /**
 * Decline recommended entities in bulk.
 *
 * See {@link #declineRecommendedEntitiesWithHttpInfoAsync}.
 *
 * @param body List of recommended entity IDs to decline. (required)
 * @return CompletableFuture
 */
  public CompletableFuture<Void>declineRecommendedEntitiesAsync(List<RecommendedEntityID> body) {
    return declineRecommendedEntitiesWithHttpInfoAsync(body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Decline multiple recommended entities in Software Catalog in a single request.</p>
   *
   * @param body List of recommended entity IDs to decline. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> declineRecommendedEntitiesWithHttpInfo(List<RecommendedEntityID> body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "declineRecommendedEntities";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling declineRecommendedEntities");
    }
    // create path and map variables
    String localVarPath = "/api/v2/catalog/recommended_entity/bulk_decline";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.SoftwareCatalogApi.declineRecommendedEntities", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
   * Decline recommended entities in bulk.
   *
   * See {@link #declineRecommendedEntitiesWithHttpInfo}.
   *
   * @param body List of recommended entity IDs to decline. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> declineRecommendedEntitiesWithHttpInfoAsync(List<RecommendedEntityID> body) {
    // Check if unstable operation is enabled
    String operationId = "declineRecommendedEntities";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling declineRecommendedEntities"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/catalog/recommended_entity/bulk_decline";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.SoftwareCatalogApi.declineRecommendedEntities", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
 * Delete a single entity.
 *
 * See {@link #deleteCatalogEntityWithHttpInfo}.
 *
 * @param entityId UUID or Entity Ref. (required)
 * @throws ApiException if fails to make API call
 */
  public  void  deleteCatalogEntity(String entityId) throws ApiException {
    deleteCatalogEntityWithHttpInfo(entityId);
  }

  /**
 * Delete a single entity.
 *
 * See {@link #deleteCatalogEntityWithHttpInfoAsync}.
 *
 * @param entityId UUID or Entity Ref. (required)
 * @return CompletableFuture
 */
  public CompletableFuture<Void>deleteCatalogEntityAsync(String entityId) {
    return deleteCatalogEntityWithHttpInfoAsync(entityId).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Delete a single entity in Software Catalog.</p>
   *
   * @param entityId UUID or Entity Ref. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
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
      throw new ApiException(400, "Missing the required parameter 'entityId' when calling deleteCatalogEntity");
    }
    // create path and map variables
    String localVarPath = "/api/v2/catalog/entity/{entity_id}"
      .replaceAll("\\{" + "entity_id" + "\\}", apiClient.escapeString(entityId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.SoftwareCatalogApi.deleteCatalogEntity", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("DELETE", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
   * Delete a single entity.
   *
   * See {@link #deleteCatalogEntityWithHttpInfo}.
   *
   * @param entityId UUID or Entity Ref. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteCatalogEntityWithHttpInfoAsync(String entityId) {
    Object localVarPostBody = null;

    // verify the required parameter 'entityId' is set
    if (entityId == null) {
        CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'entityId' when calling deleteCatalogEntity"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/catalog/entity/{entity_id}"
      .replaceAll("\\{" + "entity_id" + "\\}", apiClient.escapeString(entityId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.SoftwareCatalogApi.deleteCatalogEntity", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("DELETE", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
 * Delete a single kind.
 *
 * See {@link #deleteCatalogKindWithHttpInfo}.
 *
 * @param kindId Entity kind. (required)
 * @throws ApiException if fails to make API call
 */
  public  void  deleteCatalogKind(String kindId) throws ApiException {
    deleteCatalogKindWithHttpInfo(kindId);
  }

  /**
 * Delete a single kind.
 *
 * See {@link #deleteCatalogKindWithHttpInfoAsync}.
 *
 * @param kindId Entity kind. (required)
 * @return CompletableFuture
 */
  public CompletableFuture<Void>deleteCatalogKindAsync(String kindId) {
    return deleteCatalogKindWithHttpInfoAsync(kindId).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Delete a single kind in Software Catalog.</p>
   *
   * @param kindId Entity kind. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteCatalogKindWithHttpInfo(String kindId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'kindId' is set
    if (kindId == null) {
      throw new ApiException(400, "Missing the required parameter 'kindId' when calling deleteCatalogKind");
    }
    // create path and map variables
    String localVarPath = "/api/v2/catalog/kind/{kind_id}"
      .replaceAll("\\{" + "kind_id" + "\\}", apiClient.escapeString(kindId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.SoftwareCatalogApi.deleteCatalogKind", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("DELETE", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
   * Delete a single kind.
   *
   * See {@link #deleteCatalogKindWithHttpInfo}.
   *
   * @param kindId Entity kind. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteCatalogKindWithHttpInfoAsync(String kindId) {
    Object localVarPostBody = null;

    // verify the required parameter 'kindId' is set
    if (kindId == null) {
        CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'kindId' when calling deleteCatalogKind"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/catalog/kind/{kind_id}"
      .replaceAll("\\{" + "kind_id" + "\\}", apiClient.escapeString(kindId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.SoftwareCatalogApi.deleteCatalogKind", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("DELETE", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
 * Get Internal Developer Portal configuration.
 *
 * See {@link #getIDPConfigValueWithHttpInfo}.
 *
 * @param configName The configuration key to retrieve. (required)
 * @return IDPConfigResponse
 * @throws ApiException if fails to make API call
 */
  public IDPConfigResponse  getIDPConfigValue(String configName) throws ApiException {
    return getIDPConfigValueWithHttpInfo(configName).getData();
  }

  /**
 * Get Internal Developer Portal configuration.
 *
 * See {@link #getIDPConfigValueWithHttpInfoAsync}.
 *
 * @param configName The configuration key to retrieve. (required)
 * @return CompletableFuture&lt;IDPConfigResponse&gt;
 */
  public CompletableFuture<IDPConfigResponse>getIDPConfigValueAsync(String configName) {
    return getIDPConfigValueWithHttpInfoAsync(configName).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get a configuration value for the Internal Developer Portal (IDP).</p>
   *
   * @param configName The configuration key to retrieve. (required)
   * @return ApiResponse&lt;IDPConfigResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<IDPConfigResponse> getIDPConfigValueWithHttpInfo(String configName) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getIDPConfigValue";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'configName' is set
    if (configName == null) {
      throw new ApiException(400, "Missing the required parameter 'configName' when calling getIDPConfigValue");
    }
    // create path and map variables
    String localVarPath = "/api/v2/idp/config/{config_name}"
      .replaceAll("\\{" + "config_name" + "\\}", apiClient.escapeString(configName.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.SoftwareCatalogApi.getIDPConfigValue", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<IDPConfigResponse>() {});
  }

  /**
   * Get Internal Developer Portal configuration.
   *
   * See {@link #getIDPConfigValueWithHttpInfo}.
   *
   * @param configName The configuration key to retrieve. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;IDPConfigResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IDPConfigResponse>> getIDPConfigValueWithHttpInfoAsync(String configName) {
    // Check if unstable operation is enabled
    String operationId = "getIDPConfigValue";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<IDPConfigResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'configName' is set
    if (configName == null) {
        CompletableFuture<ApiResponse<IDPConfigResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'configName' when calling getIDPConfigValue"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/idp/config/{config_name}"
      .replaceAll("\\{" + "config_name" + "\\}", apiClient.escapeString(configName.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.SoftwareCatalogApi.getIDPConfigValue", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<IDPConfigResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<IDPConfigResponse>() {});
  }

  /**
   * Manage optional parameters to listCatalogEntity.
   */
  public static class ListCatalogEntityOptionalParameters {
    private Long pageOffset;
    private Long pageLimit;
    private String filterId;
    private String filterRef;
    private String filterName;
    private String filterKind;
    private String filterOwner;
    private RelationType filterRelationType;
    private String filterExcludeSnapshot;
    private IncludeType include;
    private Boolean includeDiscovered;

    /**
     * Set pageOffset.
     * @param pageOffset Specific offset to use as the beginning of the returned page. (optional, default to 0)
     * @return ListCatalogEntityOptionalParameters
     */
    public ListCatalogEntityOptionalParameters pageOffset(Long pageOffset) {
      this.pageOffset = pageOffset;
      return this;
    }

    /**
     * Set pageLimit.
     * @param pageLimit Maximum number of entities in the response. (optional, default to 100)
     * @return ListCatalogEntityOptionalParameters
     */
    public ListCatalogEntityOptionalParameters pageLimit(Long pageLimit) {
      this.pageLimit = pageLimit;
      return this;
    }

    /**
     * Set filterId.
     * @param filterId Filter entities by UUID. (optional)
     * @return ListCatalogEntityOptionalParameters
     */
    public ListCatalogEntityOptionalParameters filterId(String filterId) {
      this.filterId = filterId;
      return this;
    }

    /**
     * Set filterRef.
     * @param filterRef Filter entities by reference (optional)
     * @return ListCatalogEntityOptionalParameters
     */
    public ListCatalogEntityOptionalParameters filterRef(String filterRef) {
      this.filterRef = filterRef;
      return this;
    }

    /**
     * Set filterName.
     * @param filterName Filter entities by name. (optional)
     * @return ListCatalogEntityOptionalParameters
     */
    public ListCatalogEntityOptionalParameters filterName(String filterName) {
      this.filterName = filterName;
      return this;
    }

    /**
     * Set filterKind.
     * @param filterKind Filter entities by kind. (optional)
     * @return ListCatalogEntityOptionalParameters
     */
    public ListCatalogEntityOptionalParameters filterKind(String filterKind) {
      this.filterKind = filterKind;
      return this;
    }

    /**
     * Set filterOwner.
     * @param filterOwner Filter entities by owner. (optional)
     * @return ListCatalogEntityOptionalParameters
     */
    public ListCatalogEntityOptionalParameters filterOwner(String filterOwner) {
      this.filterOwner = filterOwner;
      return this;
    }

    /**
     * Set filterRelationType.
     * @param filterRelationType Filter entities by relation type. (optional)
     * @return ListCatalogEntityOptionalParameters
     */
    public ListCatalogEntityOptionalParameters filterRelationType(RelationType filterRelationType) {
      this.filterRelationType = filterRelationType;
      return this;
    }

    /**
     * Set filterExcludeSnapshot.
     * @param filterExcludeSnapshot Filter entities by excluding snapshotted entities. (optional)
     * @return ListCatalogEntityOptionalParameters
     */
    public ListCatalogEntityOptionalParameters filterExcludeSnapshot(String filterExcludeSnapshot) {
      this.filterExcludeSnapshot = filterExcludeSnapshot;
      return this;
    }

    /**
     * Set include.
     * @param include Include relationship data. (optional)
     * @return ListCatalogEntityOptionalParameters
     */
    public ListCatalogEntityOptionalParameters include(IncludeType include) {
      this.include = include;
      return this;
    }

    /**
     * Set includeDiscovered.
     * @param includeDiscovered If true, includes discovered services from APM and USM that do not have entity definitions. (optional, default to false)
     * @return ListCatalogEntityOptionalParameters
     */
    public ListCatalogEntityOptionalParameters includeDiscovered(Boolean includeDiscovered) {
      this.includeDiscovered = includeDiscovered;
      return this;
    }
  }

  /**
 * Get a list of entities.
 *
 * See {@link #listCatalogEntityWithHttpInfo}.
 *
 * @return ListEntityCatalogResponse
 * @throws ApiException if fails to make API call
 */
  public ListEntityCatalogResponse listCatalogEntity () throws ApiException {
    return listCatalogEntityWithHttpInfo(new ListCatalogEntityOptionalParameters()).getData();
  }

  /**
 * Get a list of entities.
 *
 * See {@link #listCatalogEntityWithHttpInfoAsync}.
 *
 * @return CompletableFuture&lt;ListEntityCatalogResponse&gt;
 */
  public CompletableFuture<ListEntityCatalogResponse>listCatalogEntityAsync() {
    return listCatalogEntityWithHttpInfoAsync(new ListCatalogEntityOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * Get a list of entities.
 *
 * See {@link #listCatalogEntityWithHttpInfo}.
 *
 * @param parameters Optional parameters for the request.
 * @return ListEntityCatalogResponse
 * @throws ApiException if fails to make API call
 */
  public ListEntityCatalogResponse listCatalogEntity(ListCatalogEntityOptionalParameters parameters) throws ApiException {
    return listCatalogEntityWithHttpInfo(parameters).getData();
  }

  /**
 * Get a list of entities.
 *
 * See {@link #listCatalogEntityWithHttpInfoAsync}.
 *
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;ListEntityCatalogResponse&gt;
 */
  public CompletableFuture<ListEntityCatalogResponse>listCatalogEntityAsync(ListCatalogEntityOptionalParameters parameters) {
    return listCatalogEntityWithHttpInfoAsync(parameters).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * Get a list of entities.
 *
 * See {@link #listCatalogEntityWithHttpInfo}.
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
 * See {@link #listCatalogEntityWithHttpInfo}.
 *
 * @return ListEntityCatalogResponse
 */
  public PaginationIterable<EntityData> listCatalogEntityWithPagination(ListCatalogEntityOptionalParameters parameters) {
  String resultsPath = "getData";
  String valueGetterPath = "";
  String valueSetterPath = "pageOffset";
  Boolean valueSetterParamOptional = true;
  Long limit;

  
  if (parameters.pageLimit == null) {
      limit = 100l;
      parameters.pageLimit(limit);
  } else {
      limit = parameters.pageLimit;
  }
  

  
  LinkedHashMap<String, Object> args = new LinkedHashMap<String, Object>();
  args.put("optionalParams", parameters);

  PaginationIterable iterator = new PaginationIterable(this, "listCatalogEntity", resultsPath, valueGetterPath, valueSetterPath, valueSetterParamOptional, true, limit, args);

  return iterator;
  }


  /**
   * <p>Get a list of entities from Software Catalog.</p>
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;ListEntityCatalogResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ListEntityCatalogResponse> listCatalogEntityWithHttpInfo(ListCatalogEntityOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    Long pageOffset = parameters.pageOffset;
    Long pageLimit = parameters.pageLimit;
    String filterId = parameters.filterId;
    String filterRef = parameters.filterRef;
    String filterName = parameters.filterName;
    String filterKind = parameters.filterKind;
    String filterOwner = parameters.filterOwner;
    RelationType filterRelationType = parameters.filterRelationType;
    String filterExcludeSnapshot = parameters.filterExcludeSnapshot;
    IncludeType include = parameters.include;
    Boolean includeDiscovered = parameters.includeDiscovered;
    // create path and map variables
    String localVarPath = "/api/v2/catalog/entity";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[offset]", pageOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[id]", filterId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[ref]", filterRef));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[name]", filterName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[kind]", filterKind));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[owner]", filterOwner));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[relation][type]", filterRelationType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[exclude_snapshot]", filterExcludeSnapshot));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeDiscovered", includeDiscovered));

    Invocation.Builder builder = apiClient.createBuilder("v2.SoftwareCatalogApi.listCatalogEntity", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<ListEntityCatalogResponse>() {});
  }

  /**
   * Get a list of entities.
   *
   * See {@link #listCatalogEntityWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;ListEntityCatalogResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ListEntityCatalogResponse>> listCatalogEntityWithHttpInfoAsync(ListCatalogEntityOptionalParameters parameters) {
    Object localVarPostBody = null;
    Long pageOffset = parameters.pageOffset;
    Long pageLimit = parameters.pageLimit;
    String filterId = parameters.filterId;
    String filterRef = parameters.filterRef;
    String filterName = parameters.filterName;
    String filterKind = parameters.filterKind;
    String filterOwner = parameters.filterOwner;
    RelationType filterRelationType = parameters.filterRelationType;
    String filterExcludeSnapshot = parameters.filterExcludeSnapshot;
    IncludeType include = parameters.include;
    Boolean includeDiscovered = parameters.includeDiscovered;
    // create path and map variables
    String localVarPath = "/api/v2/catalog/entity";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[offset]", pageOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[id]", filterId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[ref]", filterRef));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[name]", filterName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[kind]", filterKind));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[owner]", filterOwner));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[relation][type]", filterRelationType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[exclude_snapshot]", filterExcludeSnapshot));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeDiscovered", includeDiscovered));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.SoftwareCatalogApi.listCatalogEntity", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ListEntityCatalogResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<ListEntityCatalogResponse>() {});
  }

  /**
   * Manage optional parameters to listCatalogKind.
   */
  public static class ListCatalogKindOptionalParameters {
    private Long pageOffset;
    private Long pageLimit;
    private String filterId;
    private String filterName;

    /**
     * Set pageOffset.
     * @param pageOffset Specific offset to use as the beginning of the returned page. (optional, default to 0)
     * @return ListCatalogKindOptionalParameters
     */
    public ListCatalogKindOptionalParameters pageOffset(Long pageOffset) {
      this.pageOffset = pageOffset;
      return this;
    }

    /**
     * Set pageLimit.
     * @param pageLimit Maximum number of kinds in the response. (optional, default to 100)
     * @return ListCatalogKindOptionalParameters
     */
    public ListCatalogKindOptionalParameters pageLimit(Long pageLimit) {
      this.pageLimit = pageLimit;
      return this;
    }

    /**
     * Set filterId.
     * @param filterId Filter entities by UUID. (optional)
     * @return ListCatalogKindOptionalParameters
     */
    public ListCatalogKindOptionalParameters filterId(String filterId) {
      this.filterId = filterId;
      return this;
    }

    /**
     * Set filterName.
     * @param filterName Filter entities by name. (optional)
     * @return ListCatalogKindOptionalParameters
     */
    public ListCatalogKindOptionalParameters filterName(String filterName) {
      this.filterName = filterName;
      return this;
    }
  }

  /**
 * Get a list of entity kinds.
 *
 * See {@link #listCatalogKindWithHttpInfo}.
 *
 * @return ListKindCatalogResponse
 * @throws ApiException if fails to make API call
 */
  public ListKindCatalogResponse listCatalogKind () throws ApiException {
    return listCatalogKindWithHttpInfo(new ListCatalogKindOptionalParameters()).getData();
  }

  /**
 * Get a list of entity kinds.
 *
 * See {@link #listCatalogKindWithHttpInfoAsync}.
 *
 * @return CompletableFuture&lt;ListKindCatalogResponse&gt;
 */
  public CompletableFuture<ListKindCatalogResponse>listCatalogKindAsync() {
    return listCatalogKindWithHttpInfoAsync(new ListCatalogKindOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * Get a list of entity kinds.
 *
 * See {@link #listCatalogKindWithHttpInfo}.
 *
 * @param parameters Optional parameters for the request.
 * @return ListKindCatalogResponse
 * @throws ApiException if fails to make API call
 */
  public ListKindCatalogResponse listCatalogKind(ListCatalogKindOptionalParameters parameters) throws ApiException {
    return listCatalogKindWithHttpInfo(parameters).getData();
  }

  /**
 * Get a list of entity kinds.
 *
 * See {@link #listCatalogKindWithHttpInfoAsync}.
 *
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;ListKindCatalogResponse&gt;
 */
  public CompletableFuture<ListKindCatalogResponse>listCatalogKindAsync(ListCatalogKindOptionalParameters parameters) {
    return listCatalogKindWithHttpInfoAsync(parameters).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * Get a list of entity kinds.
 *
 * See {@link #listCatalogKindWithHttpInfo}.
 *
 * @return PaginationIterable&lt;KindData&gt;
 */
  public PaginationIterable<KindData> listCatalogKindWithPagination() {
    ListCatalogKindOptionalParameters parameters = new ListCatalogKindOptionalParameters();
    return listCatalogKindWithPagination(parameters);
  }

  /**
 * Get a list of entity kinds.
 *
 * See {@link #listCatalogKindWithHttpInfo}.
 *
 * @return ListKindCatalogResponse
 */
  public PaginationIterable<KindData> listCatalogKindWithPagination(ListCatalogKindOptionalParameters parameters) {
  String resultsPath = "getData";
  String valueGetterPath = "";
  String valueSetterPath = "pageOffset";
  Boolean valueSetterParamOptional = true;
  Long limit;

  
  if (parameters.pageLimit == null) {
      limit = 100l;
      parameters.pageLimit(limit);
  } else {
      limit = parameters.pageLimit;
  }
  

  
  LinkedHashMap<String, Object> args = new LinkedHashMap<String, Object>();
  args.put("optionalParams", parameters);

  PaginationIterable iterator = new PaginationIterable(this, "listCatalogKind", resultsPath, valueGetterPath, valueSetterPath, valueSetterParamOptional, true, limit, args);

  return iterator;
  }


  /**
   * <p>Get a list of entity kinds from Software Catalog.</p>
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;ListKindCatalogResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ListKindCatalogResponse> listCatalogKindWithHttpInfo(ListCatalogKindOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    Long pageOffset = parameters.pageOffset;
    Long pageLimit = parameters.pageLimit;
    String filterId = parameters.filterId;
    String filterName = parameters.filterName;
    // create path and map variables
    String localVarPath = "/api/v2/catalog/kind";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[offset]", pageOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[id]", filterId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[name]", filterName));

    Invocation.Builder builder = apiClient.createBuilder("v2.SoftwareCatalogApi.listCatalogKind", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<ListKindCatalogResponse>() {});
  }

  /**
   * Get a list of entity kinds.
   *
   * See {@link #listCatalogKindWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;ListKindCatalogResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ListKindCatalogResponse>> listCatalogKindWithHttpInfoAsync(ListCatalogKindOptionalParameters parameters) {
    Object localVarPostBody = null;
    Long pageOffset = parameters.pageOffset;
    Long pageLimit = parameters.pageLimit;
    String filterId = parameters.filterId;
    String filterName = parameters.filterName;
    // create path and map variables
    String localVarPath = "/api/v2/catalog/kind";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[offset]", pageOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[id]", filterId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[name]", filterName));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.SoftwareCatalogApi.listCatalogKind", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ListKindCatalogResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<ListKindCatalogResponse>() {});
  }

  /**
   * Manage optional parameters to listCatalogRelation.
   */
  public static class ListCatalogRelationOptionalParameters {
    private Long pageOffset;
    private Long pageLimit;
    private RelationType filterType;
    private String filterFromRef;
    private String filterToRef;
    private RelationIncludeType include;
    private Boolean includeDiscovered;

    /**
     * Set pageOffset.
     * @param pageOffset Specific offset to use as the beginning of the returned page. (optional, default to 0)
     * @return ListCatalogRelationOptionalParameters
     */
    public ListCatalogRelationOptionalParameters pageOffset(Long pageOffset) {
      this.pageOffset = pageOffset;
      return this;
    }

    /**
     * Set pageLimit.
     * @param pageLimit Maximum number of relations in the response. (optional, default to 100)
     * @return ListCatalogRelationOptionalParameters
     */
    public ListCatalogRelationOptionalParameters pageLimit(Long pageLimit) {
      this.pageLimit = pageLimit;
      return this;
    }

    /**
     * Set filterType.
     * @param filterType Filter relations by type. (optional)
     * @return ListCatalogRelationOptionalParameters
     */
    public ListCatalogRelationOptionalParameters filterType(RelationType filterType) {
      this.filterType = filterType;
      return this;
    }

    /**
     * Set filterFromRef.
     * @param filterFromRef Filter relations by the reference of the first entity in the relation. (optional)
     * @return ListCatalogRelationOptionalParameters
     */
    public ListCatalogRelationOptionalParameters filterFromRef(String filterFromRef) {
      this.filterFromRef = filterFromRef;
      return this;
    }

    /**
     * Set filterToRef.
     * @param filterToRef Filter relations by the reference of the second entity in the relation. (optional)
     * @return ListCatalogRelationOptionalParameters
     */
    public ListCatalogRelationOptionalParameters filterToRef(String filterToRef) {
      this.filterToRef = filterToRef;
      return this;
    }

    /**
     * Set include.
     * @param include Include relationship data. (optional)
     * @return ListCatalogRelationOptionalParameters
     */
    public ListCatalogRelationOptionalParameters include(RelationIncludeType include) {
      this.include = include;
      return this;
    }

    /**
     * Set includeDiscovered.
     * @param includeDiscovered If true, includes relationships discovered by APM and USM. (optional, default to false)
     * @return ListCatalogRelationOptionalParameters
     */
    public ListCatalogRelationOptionalParameters includeDiscovered(Boolean includeDiscovered) {
      this.includeDiscovered = includeDiscovered;
      return this;
    }
  }

  /**
 * Get a list of entity relations.
 *
 * See {@link #listCatalogRelationWithHttpInfo}.
 *
 * @return ListRelationCatalogResponse
 * @throws ApiException if fails to make API call
 */
  public ListRelationCatalogResponse listCatalogRelation () throws ApiException {
    return listCatalogRelationWithHttpInfo(new ListCatalogRelationOptionalParameters()).getData();
  }

  /**
 * Get a list of entity relations.
 *
 * See {@link #listCatalogRelationWithHttpInfoAsync}.
 *
 * @return CompletableFuture&lt;ListRelationCatalogResponse&gt;
 */
  public CompletableFuture<ListRelationCatalogResponse>listCatalogRelationAsync() {
    return listCatalogRelationWithHttpInfoAsync(new ListCatalogRelationOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * Get a list of entity relations.
 *
 * See {@link #listCatalogRelationWithHttpInfo}.
 *
 * @param parameters Optional parameters for the request.
 * @return ListRelationCatalogResponse
 * @throws ApiException if fails to make API call
 */
  public ListRelationCatalogResponse listCatalogRelation(ListCatalogRelationOptionalParameters parameters) throws ApiException {
    return listCatalogRelationWithHttpInfo(parameters).getData();
  }

  /**
 * Get a list of entity relations.
 *
 * See {@link #listCatalogRelationWithHttpInfoAsync}.
 *
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;ListRelationCatalogResponse&gt;
 */
  public CompletableFuture<ListRelationCatalogResponse>listCatalogRelationAsync(ListCatalogRelationOptionalParameters parameters) {
    return listCatalogRelationWithHttpInfoAsync(parameters).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * Get a list of entity relations.
 *
 * See {@link #listCatalogRelationWithHttpInfo}.
 *
 * @return PaginationIterable&lt;RelationResponse&gt;
 */
  public PaginationIterable<RelationResponse> listCatalogRelationWithPagination() {
    ListCatalogRelationOptionalParameters parameters = new ListCatalogRelationOptionalParameters();
    return listCatalogRelationWithPagination(parameters);
  }

  /**
 * Get a list of entity relations.
 *
 * See {@link #listCatalogRelationWithHttpInfo}.
 *
 * @return ListRelationCatalogResponse
 */
  public PaginationIterable<RelationResponse> listCatalogRelationWithPagination(ListCatalogRelationOptionalParameters parameters) {
  String resultsPath = "getData";
  String valueGetterPath = "";
  String valueSetterPath = "pageOffset";
  Boolean valueSetterParamOptional = true;
  Long limit;

  
  if (parameters.pageLimit == null) {
      limit = 100l;
      parameters.pageLimit(limit);
  } else {
      limit = parameters.pageLimit;
  }
  

  
  LinkedHashMap<String, Object> args = new LinkedHashMap<String, Object>();
  args.put("optionalParams", parameters);

  PaginationIterable iterator = new PaginationIterable(this, "listCatalogRelation", resultsPath, valueGetterPath, valueSetterPath, valueSetterParamOptional, true, limit, args);

  return iterator;
  }


  /**
   * <p>Get a list of entity relations from Software Catalog.</p>
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;ListRelationCatalogResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ListRelationCatalogResponse> listCatalogRelationWithHttpInfo(ListCatalogRelationOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    Long pageOffset = parameters.pageOffset;
    Long pageLimit = parameters.pageLimit;
    RelationType filterType = parameters.filterType;
    String filterFromRef = parameters.filterFromRef;
    String filterToRef = parameters.filterToRef;
    RelationIncludeType include = parameters.include;
    Boolean includeDiscovered = parameters.includeDiscovered;
    // create path and map variables
    String localVarPath = "/api/v2/catalog/relation";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[offset]", pageOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[type]", filterType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[from_ref]", filterFromRef));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[to_ref]", filterToRef));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeDiscovered", includeDiscovered));

    Invocation.Builder builder = apiClient.createBuilder("v2.SoftwareCatalogApi.listCatalogRelation", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<ListRelationCatalogResponse>() {});
  }

  /**
   * Get a list of entity relations.
   *
   * See {@link #listCatalogRelationWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;ListRelationCatalogResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ListRelationCatalogResponse>> listCatalogRelationWithHttpInfoAsync(ListCatalogRelationOptionalParameters parameters) {
    Object localVarPostBody = null;
    Long pageOffset = parameters.pageOffset;
    Long pageLimit = parameters.pageLimit;
    RelationType filterType = parameters.filterType;
    String filterFromRef = parameters.filterFromRef;
    String filterToRef = parameters.filterToRef;
    RelationIncludeType include = parameters.include;
    Boolean includeDiscovered = parameters.includeDiscovered;
    // create path and map variables
    String localVarPath = "/api/v2/catalog/relation";

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[offset]", pageOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[type]", filterType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[from_ref]", filterFromRef));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[to_ref]", filterToRef));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeDiscovered", includeDiscovered));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.SoftwareCatalogApi.listCatalogRelation", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ListRelationCatalogResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<ListRelationCatalogResponse>() {});
  }

  /**
 * Preview catalog entities.
 *
 * See {@link #previewCatalogEntitiesWithHttpInfo}.
 *
 * @return EntityResponseArray
 * @throws ApiException if fails to make API call
 */
  public EntityResponseArray  previewCatalogEntities() throws ApiException {
    return previewCatalogEntitiesWithHttpInfo().getData();
  }

  /**
 * Preview catalog entities.
 *
 * See {@link #previewCatalogEntitiesWithHttpInfoAsync}.
 *
 * @return CompletableFuture&lt;EntityResponseArray&gt;
 */
  public CompletableFuture<EntityResponseArray>previewCatalogEntitiesAsync() {
    return previewCatalogEntitiesWithHttpInfoAsync().thenApply(response -> {
        return response.getData();
    });
  }


  /**

   *
   * @return ApiResponse&lt;EntityResponseArray&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<EntityResponseArray> previewCatalogEntitiesWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/catalog/entity/preview";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.SoftwareCatalogApi.previewCatalogEntities", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("POST", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<EntityResponseArray>() {});
  }

  /**
   * Preview catalog entities.
   *
   * See {@link #previewCatalogEntitiesWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;EntityResponseArray&gt;&gt;
   */
  public CompletableFuture<ApiResponse<EntityResponseArray>> previewCatalogEntitiesWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/catalog/entity/preview";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.SoftwareCatalogApi.previewCatalogEntities", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<EntityResponseArray>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("POST", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<EntityResponseArray>() {});
  }

  /**
   * Manage optional parameters to triggerRecommendedEntities.
   */
  public static class TriggerRecommendedEntitiesOptionalParameters {
    private Object body;

    /**
     * Set body.
     * @param body Optional request body for triggering recommended entity discovery. (optional)
     * @return TriggerRecommendedEntitiesOptionalParameters
     */
    public TriggerRecommendedEntitiesOptionalParameters body(Object body) {
      this.body = body;
      return this;
    }
  }

  /**
 * Trigger recommended entity discovery.
 *
 * See {@link #triggerRecommendedEntitiesWithHttpInfo}.
 *
 * @return Object
 * @throws ApiException if fails to make API call
 */
  public Object triggerRecommendedEntities () throws ApiException {
    return triggerRecommendedEntitiesWithHttpInfo(new TriggerRecommendedEntitiesOptionalParameters()).getData();
  }

  /**
 * Trigger recommended entity discovery.
 *
 * See {@link #triggerRecommendedEntitiesWithHttpInfoAsync}.
 *
 * @return CompletableFuture&lt;Object&gt;
 */
  public CompletableFuture<Object>triggerRecommendedEntitiesAsync() {
    return triggerRecommendedEntitiesWithHttpInfoAsync(new TriggerRecommendedEntitiesOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * Trigger recommended entity discovery.
 *
 * See {@link #triggerRecommendedEntitiesWithHttpInfo}.
 *
 * @param parameters Optional parameters for the request.
 * @return Object
 * @throws ApiException if fails to make API call
 */
  public Object triggerRecommendedEntities(TriggerRecommendedEntitiesOptionalParameters parameters) throws ApiException {
    return triggerRecommendedEntitiesWithHttpInfo(parameters).getData();
  }

  /**
 * Trigger recommended entity discovery.
 *
 * See {@link #triggerRecommendedEntitiesWithHttpInfoAsync}.
 *
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;Object&gt;
 */
  public CompletableFuture<Object>triggerRecommendedEntitiesAsync(TriggerRecommendedEntitiesOptionalParameters parameters) {
    return triggerRecommendedEntitiesWithHttpInfoAsync(parameters).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Trigger the discovery of recommended entities in Software Catalog.</p>
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Object> triggerRecommendedEntitiesWithHttpInfo(TriggerRecommendedEntitiesOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "triggerRecommendedEntities";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = parameters.body;
    // create path and map variables
    String localVarPath = "/api/v2/catalog/recommended_entity/trigger";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.SoftwareCatalogApi.triggerRecommendedEntities", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<Object>() {});
  }

  /**
   * Trigger recommended entity discovery.
   *
   * See {@link #triggerRecommendedEntitiesWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;Object&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Object>> triggerRecommendedEntitiesWithHttpInfoAsync(TriggerRecommendedEntitiesOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "triggerRecommendedEntities";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Object>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = parameters.body;
    // create path and map variables
    String localVarPath = "/api/v2/catalog/recommended_entity/trigger";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.SoftwareCatalogApi.triggerRecommendedEntities", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Object>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<Object>() {});
  }

  /**
 * Create or update entities.
 *
 * See {@link #upsertCatalogEntityWithHttpInfo}.
 *
 * @param body Entity YAML or JSON. (required)
 * @return UpsertCatalogEntityResponse
 * @throws ApiException if fails to make API call
 */
  public UpsertCatalogEntityResponse  upsertCatalogEntity(UpsertCatalogEntityRequest body) throws ApiException {
    return upsertCatalogEntityWithHttpInfo(body).getData();
  }

  /**
 * Create or update entities.
 *
 * See {@link #upsertCatalogEntityWithHttpInfoAsync}.
 *
 * @param body Entity YAML or JSON. (required)
 * @return CompletableFuture&lt;UpsertCatalogEntityResponse&gt;
 */
  public CompletableFuture<UpsertCatalogEntityResponse>upsertCatalogEntityAsync(UpsertCatalogEntityRequest body) {
    return upsertCatalogEntityWithHttpInfoAsync(body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Create or update entities in Software Catalog.</p>
   *
   * @param body Entity YAML or JSON. (required)
   * @return ApiResponse&lt;UpsertCatalogEntityResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 202 </td><td> ACCEPTED </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<UpsertCatalogEntityResponse> upsertCatalogEntityWithHttpInfo(UpsertCatalogEntityRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling upsertCatalogEntity");
    }
    // create path and map variables
    String localVarPath = "/api/v2/catalog/entity";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.SoftwareCatalogApi.upsertCatalogEntity", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<UpsertCatalogEntityResponse>() {});
  }

  /**
   * Create or update entities.
   *
   * See {@link #upsertCatalogEntityWithHttpInfo}.
   *
   * @param body Entity YAML or JSON. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;UpsertCatalogEntityResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<UpsertCatalogEntityResponse>> upsertCatalogEntityWithHttpInfoAsync(UpsertCatalogEntityRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<UpsertCatalogEntityResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling upsertCatalogEntity"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/catalog/entity";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.SoftwareCatalogApi.upsertCatalogEntity", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<UpsertCatalogEntityResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<UpsertCatalogEntityResponse>() {});
  }

  /**
 * Create or update kinds.
 *
 * See {@link #upsertCatalogKindWithHttpInfo}.
 *
 * @param body Kind YAML or JSON. (required)
 * @return UpsertCatalogKindResponse
 * @throws ApiException if fails to make API call
 */
  public UpsertCatalogKindResponse  upsertCatalogKind(UpsertCatalogKindRequest body) throws ApiException {
    return upsertCatalogKindWithHttpInfo(body).getData();
  }

  /**
 * Create or update kinds.
 *
 * See {@link #upsertCatalogKindWithHttpInfoAsync}.
 *
 * @param body Kind YAML or JSON. (required)
 * @return CompletableFuture&lt;UpsertCatalogKindResponse&gt;
 */
  public CompletableFuture<UpsertCatalogKindResponse>upsertCatalogKindAsync(UpsertCatalogKindRequest body) {
    return upsertCatalogKindWithHttpInfoAsync(body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Create or update kinds in Software Catalog.</p>
   *
   * @param body Kind YAML or JSON. (required)
   * @return ApiResponse&lt;UpsertCatalogKindResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 202 </td><td> ACCEPTED </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<UpsertCatalogKindResponse> upsertCatalogKindWithHttpInfo(UpsertCatalogKindRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling upsertCatalogKind");
    }
    // create path and map variables
    String localVarPath = "/api/v2/catalog/kind";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.SoftwareCatalogApi.upsertCatalogKind", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<UpsertCatalogKindResponse>() {});
  }

  /**
   * Create or update kinds.
   *
   * See {@link #upsertCatalogKindWithHttpInfo}.
   *
   * @param body Kind YAML or JSON. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;UpsertCatalogKindResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<UpsertCatalogKindResponse>> upsertCatalogKindWithHttpInfoAsync(UpsertCatalogKindRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<UpsertCatalogKindResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling upsertCatalogKind"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/catalog/kind";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.SoftwareCatalogApi.upsertCatalogKind", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<UpsertCatalogKindResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<UpsertCatalogKindResponse>() {});
  }

  /**
 * Create or update IDP configuration.
 *
 * See {@link #upsertIDPConfigValueWithHttpInfo}.
 *
 * @param configName The configuration key to create or update. (required)
 * @param body Configuration value to set. (required)
 * @throws ApiException if fails to make API call
 */
  public  void  upsertIDPConfigValue(String configName, IDPConfigRequest body) throws ApiException {
    upsertIDPConfigValueWithHttpInfo(configName, body);
  }

  /**
 * Create or update IDP configuration.
 *
 * See {@link #upsertIDPConfigValueWithHttpInfoAsync}.
 *
 * @param configName The configuration key to create or update. (required)
 * @param body Configuration value to set. (required)
 * @return CompletableFuture
 */
  public CompletableFuture<Void>upsertIDPConfigValueAsync(String configName, IDPConfigRequest body) {
    return upsertIDPConfigValueWithHttpInfoAsync(configName, body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Create or update a configuration value for the Internal Developer Portal (IDP).</p>
   *
   * @param configName The configuration key to create or update. (required)
   * @param body Configuration value to set. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> upsertIDPConfigValueWithHttpInfo(String configName, IDPConfigRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "upsertIDPConfigValue";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'configName' is set
    if (configName == null) {
      throw new ApiException(400, "Missing the required parameter 'configName' when calling upsertIDPConfigValue");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling upsertIDPConfigValue");
    }
    // create path and map variables
    String localVarPath = "/api/v2/idp/config/{config_name}"
      .replaceAll("\\{" + "config_name" + "\\}", apiClient.escapeString(configName.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.SoftwareCatalogApi.upsertIDPConfigValue", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    return apiClient.invokeAPI("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }

  /**
   * Create or update IDP configuration.
   *
   * See {@link #upsertIDPConfigValueWithHttpInfo}.
   *
   * @param configName The configuration key to create or update. (required)
   * @param body Configuration value to set. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> upsertIDPConfigValueWithHttpInfoAsync(String configName, IDPConfigRequest body) {
    // Check if unstable operation is enabled
    String operationId = "upsertIDPConfigValue";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'configName' is set
    if (configName == null) {
        CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'configName' when calling upsertIDPConfigValue"));
        return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling upsertIDPConfigValue"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/idp/config/{config_name}"
      .replaceAll("\\{" + "config_name" + "\\}", apiClient.escapeString(configName.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.SoftwareCatalogApi.upsertIDPConfigValue", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"*/*" }, new String[] { "apiKeyAuth", "appKeyAuth", "AuthZ" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, null);
  }
}