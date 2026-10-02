package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.ExperimentsAnalysisPlanV2DTO;
import com.datadog.api.client.v2.model.ExperimentsAnalysisPlanV2MutationResponse;
import com.datadog.api.client.v2.model.ExperimentsAnalysisPlanWriteV2Request;
import com.datadog.api.client.v2.model.ExperimentsCancelExperimentV2Request;
import com.datadog.api.client.v2.model.ExperimentsConcludeExperimentV2Request;
import com.datadog.api.client.v2.model.ExperimentsCreateExperimentMetricGroupV2Request;
import com.datadog.api.client.v2.model.ExperimentsCreateExperimentV2Request;
import com.datadog.api.client.v2.model.ExperimentsCreateExposureSQLModelV2Request;
import com.datadog.api.client.v2.model.ExperimentsCreateMetricCollectionV2Request;
import com.datadog.api.client.v2.model.ExperimentsCreateMetricSQLModelV2Request;
import com.datadog.api.client.v2.model.ExperimentsCreateMetricV2Request;
import com.datadog.api.client.v2.model.ExperimentsCreateSubjectTypeV2Request;
import com.datadog.api.client.v2.model.ExperimentsExperimentDiagnosticsV2DTO;
import com.datadog.api.client.v2.model.ExperimentsExperimentMetricGroupMutationV2;
import com.datadog.api.client.v2.model.ExperimentsExperimentMetricGroupV2DTOArray;
import com.datadog.api.client.v2.model.ExperimentsExperimentV2DTO;
import com.datadog.api.client.v2.model.ExperimentsExperimentV2ListDTOArray;
import com.datadog.api.client.v2.model.ExperimentsExposureSQLModelV2DTO;
import com.datadog.api.client.v2.model.ExperimentsExposureSQLModelV2DTOArray;
import com.datadog.api.client.v2.model.ExperimentsMetricCollectionV2DTO;
import com.datadog.api.client.v2.model.ExperimentsMetricCollectionV2DTOArray;
import com.datadog.api.client.v2.model.ExperimentsMetricSQLModelV2DTO;
import com.datadog.api.client.v2.model.ExperimentsMetricSQLModelV2DTOArray;
import com.datadog.api.client.v2.model.ExperimentsMetricV2DTO;
import com.datadog.api.client.v2.model.ExperimentsMetricV2DTOArray;
import com.datadog.api.client.v2.model.ExperimentsPatchExperimentMetricGroupV2Request;
import com.datadog.api.client.v2.model.ExperimentsPatchExperimentV2Request;
import com.datadog.api.client.v2.model.ExperimentsPatchExperimentV2Response;
import com.datadog.api.client.v2.model.ExperimentsPatchMetricCollectionV2Request;
import com.datadog.api.client.v2.model.ExperimentsPatchSubjectTypeV2Request;
import com.datadog.api.client.v2.model.ExperimentsPublicProtocolListResponseArray;
import com.datadog.api.client.v2.model.ExperimentsPublicProtocolResponse;
import com.datadog.api.client.v2.model.ExperimentsPublicProtocolResponseDataAttributesStatus;
import com.datadog.api.client.v2.model.ExperimentsRefreshExperimentResultsV2DTO;
import com.datadog.api.client.v2.model.ExperimentsRefreshExperimentResultsV2DTOArray;
import com.datadog.api.client.v2.model.ExperimentsStartExperimentV2Request;
import com.datadog.api.client.v2.model.ExperimentsSubjectTypeV2DTO;
import com.datadog.api.client.v2.model.ExperimentsSubjectTypeV2DTOArray;
import com.datadog.api.client.v2.model.ExperimentsTrafficSummaryV2DTO;
import com.datadog.api.client.v2.model.ExperimentsUpdateExposureSQLModelV2Response;
import com.datadog.api.client.v2.model.ExperimentsUpdateMetricSQLModelV2Response;
import com.datadog.api.client.v2.model.ExperimentsUpdateMetricV2Request;
import com.datadog.api.client.v2.model.ExperimentsVariantResultsV2DTOArray;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsApi {
  private ApiClient apiClient;

  public ExperimentsApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public ExperimentsApi(ApiClient apiClient) {
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
   * Archive exposure SQL model.
   *
   * <p>See {@link #archiveExposureSQLModelWithHttpInfo}.
   *
   * @param exposureSqlModelId The UUID of the exposure SQL model. (required)
   * @throws ApiException if fails to make API call
   */
  public void archiveExposureSQLModel(UUID exposureSqlModelId) throws ApiException {
    archiveExposureSQLModelWithHttpInfo(exposureSqlModelId);
  }

  /**
   * Archive exposure SQL model.
   *
   * <p>See {@link #archiveExposureSQLModelWithHttpInfoAsync}.
   *
   * @param exposureSqlModelId The UUID of the exposure SQL model. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> archiveExposureSQLModelAsync(UUID exposureSqlModelId) {
    return archiveExposureSQLModelWithHttpInfoAsync(exposureSqlModelId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Archive an exposure SQL model. Archived models are hidden from the default list and are no
   * longer refreshed for new feature flags. Experiments already reading from the model keep
   * working. Archiving is how a model that is in use by an experiment, and therefore cannot be
   * deleted, is retired.
   *
   * @param exposureSqlModelId The UUID of the exposure SQL model. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> The exposure SQL model was archived. Archiving an already-archived model succeeds and leaves the original archive time in place. </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Malformed exposure SQL model ID (not a valid UUID). </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Missing or invalid authentication. </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authenticated caller lacks the product_analytics_warehouse_model_write permission. </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> No exposure SQL model with this ID exists for the organization. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> archiveExposureSQLModelWithHttpInfo(UUID exposureSqlModelId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'exposureSqlModelId' is set
    if (exposureSqlModelId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'exposureSqlModelId' when calling"
              + " archiveExposureSQLModel");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/experiments/exposure-sql-models/{exposure_sql_model_id}/archive"
            .replaceAll(
                "\\{" + "exposure_sql_model_id" + "\\}",
                apiClient.escapeString(exposureSqlModelId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ExperimentsApi.archiveExposureSQLModel",
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
   * Archive exposure SQL model.
   *
   * <p>See {@link #archiveExposureSQLModelWithHttpInfo}.
   *
   * @param exposureSqlModelId The UUID of the exposure SQL model. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> archiveExposureSQLModelWithHttpInfoAsync(
      UUID exposureSqlModelId) {
    Object localVarPostBody = null;

    // verify the required parameter 'exposureSqlModelId' is set
    if (exposureSqlModelId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'exposureSqlModelId' when calling"
                  + " archiveExposureSQLModel"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/experiments/exposure-sql-models/{exposure_sql_model_id}/archive"
            .replaceAll(
                "\\{" + "exposure_sql_model_id" + "\\}",
                apiClient.escapeString(exposureSqlModelId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ExperimentsApi.archiveExposureSQLModel",
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
   * Cancel experiment.
   *
   * <p>See {@link #cancelExperimentWithHttpInfo}.
   *
   * @param experimentId The UUID of the experiment. (required)
   * @param body (required)
   * @throws ApiException if fails to make API call
   */
  public void cancelExperiment(UUID experimentId, ExperimentsCancelExperimentV2Request body)
      throws ApiException {
    cancelExperimentWithHttpInfo(experimentId, body);
  }

  /**
   * Cancel experiment.
   *
   * <p>See {@link #cancelExperimentWithHttpInfoAsync}.
   *
   * @param experimentId The UUID of the experiment. (required)
   * @param body (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> cancelExperimentAsync(
      UUID experimentId, ExperimentsCancelExperimentV2Request body) {
    return cancelExperimentWithHttpInfoAsync(experimentId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Cancel an experiment, ending it without a winning variant. The experiment moves to CANCELLED
   * status, the supplied reason is recorded in its conclusion as the decision reason, and the
   * experiment is unlinked from the feature flag allocations that exposed it, which stops its
   * exposure. An experiment that has already completed its rollout, had its code removed, or been
   * canceled cannot be canceled again. Canceling is not reversible: an experiment cannot be
   * returned to a running state afterward. It is also not idempotent: canceling an already-canceled
   * experiment returns 409, so a retry after a timeout cannot be distinguished from a cancellation
   * made by someone else.
   *
   * @param experimentId The UUID of the experiment. (required)
   * @param body (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> The experiment was canceled and unlinked from its feature flag allocations. </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Malformed experiment ID, malformed request body, or a missing/blank reason. </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Missing or invalid authentication (dd-api-key + dd-application-key headers, or a valid user session). </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authenticated caller lacks the product_analytics_experiments_write permission, lacks permission to edit this experiment, or lacks contribute permission on the feature flag owning its allocation. </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> No experiment with this ID exists for the organization. </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> The experiment cannot be canceled in its current state. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> cancelExperimentWithHttpInfo(
      UUID experimentId, ExperimentsCancelExperimentV2Request body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'experimentId' is set
    if (experimentId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'experimentId' when calling cancelExperiment");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling cancelExperiment");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/experiments/{experiment_id}/cancel"
            .replaceAll(
                "\\{" + "experiment_id" + "\\}", apiClient.escapeString(experimentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ExperimentsApi.cancelExperiment",
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
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Cancel experiment.
   *
   * <p>See {@link #cancelExperimentWithHttpInfo}.
   *
   * @param experimentId The UUID of the experiment. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> cancelExperimentWithHttpInfoAsync(
      UUID experimentId, ExperimentsCancelExperimentV2Request body) {
    Object localVarPostBody = body;

    // verify the required parameter 'experimentId' is set
    if (experimentId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'experimentId' when calling cancelExperiment"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling cancelExperiment"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/experiments/{experiment_id}/cancel"
            .replaceAll(
                "\\{" + "experiment_id" + "\\}", apiClient.escapeString(experimentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ExperimentsApi.cancelExperiment",
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
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Conclude experiment.
   *
   * <p>See {@link #concludeExperimentWithHttpInfo}.
   *
   * @param experimentId The UUID of the experiment. (required)
   * @param body (required)
   * @throws ApiException if fails to make API call
   */
  public void concludeExperiment(UUID experimentId, ExperimentsConcludeExperimentV2Request body)
      throws ApiException {
    concludeExperimentWithHttpInfo(experimentId, body);
  }

  /**
   * Conclude experiment.
   *
   * <p>See {@link #concludeExperimentWithHttpInfoAsync}.
   *
   * @param experimentId The UUID of the experiment. (required)
   * @param body (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> concludeExperimentAsync(
      UUID experimentId, ExperimentsConcludeExperimentV2Request body) {
    return concludeExperimentWithHttpInfoAsync(experimentId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Conclude an experiment on a winning variant. The experiment moves to DECISION_MADE status, the
   * outcome is recorded in its conclusion, and for a flag-backed experiment the winning variant is
   * rolled out to 100% of the linked feature flag allocation. <code>decision_variant_key</code>
   * must match a variant in the experiment. Only an experiment that is currently running or ready
   * for a decision can be concluded. Concluding is not reversible and is not idempotent: concluding
   * an already-concluded experiment returns 409.
   *
   * @param experimentId The UUID of the experiment. (required)
   * @param body (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> The experiment was concluded and the winning variant was rolled out to its linked feature flag allocation. </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Malformed experiment ID, malformed request body, or a missing decision_variant_key. </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Missing or invalid authentication (dd-api-key + dd-application-key headers, or a valid user session). </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authenticated caller lacks the product_analytics_experiments_write permission, lacks permission to edit this experiment, or lacks contribute permission on the feature flag owning its allocation. </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> No experiment with this ID exists for the organization. </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> The experiment is not running or ready for a decision, its linked feature flag environment requires an approval for the rollout this would perform, or that flag has a pending suggestion for its allocations. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> concludeExperimentWithHttpInfo(
      UUID experimentId, ExperimentsConcludeExperimentV2Request body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'experimentId' is set
    if (experimentId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'experimentId' when calling concludeExperiment");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling concludeExperiment");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/experiments/{experiment_id}/conclude"
            .replaceAll(
                "\\{" + "experiment_id" + "\\}", apiClient.escapeString(experimentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ExperimentsApi.concludeExperiment",
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
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Conclude experiment.
   *
   * <p>See {@link #concludeExperimentWithHttpInfo}.
   *
   * @param experimentId The UUID of the experiment. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> concludeExperimentWithHttpInfoAsync(
      UUID experimentId, ExperimentsConcludeExperimentV2Request body) {
    Object localVarPostBody = body;

    // verify the required parameter 'experimentId' is set
    if (experimentId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'experimentId' when calling concludeExperiment"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling concludeExperiment"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/experiments/{experiment_id}/conclude"
            .replaceAll(
                "\\{" + "experiment_id" + "\\}", apiClient.escapeString(experimentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ExperimentsApi.concludeExperiment",
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
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Create experiment.
   *
   * <p>See {@link #createExperimentWithHttpInfo}.
   *
   * @param body (required)
   * @return ExperimentsExperimentV2DTO
   * @throws ApiException if fails to make API call
   */
  public ExperimentsExperimentV2DTO createExperiment(ExperimentsCreateExperimentV2Request body)
      throws ApiException {
    return createExperimentWithHttpInfo(body).getData();
  }

  /**
   * Create experiment.
   *
   * <p>See {@link #createExperimentWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ExperimentsExperimentV2DTO&gt;
   */
  public CompletableFuture<ExperimentsExperimentV2DTO> createExperimentAsync(
      ExperimentsCreateExperimentV2Request body) {
    return createExperimentWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a draft experiment. <code>name</code> is required. <code>structured_metadata</code>
   * identifies each metadata field by <code>field_key</code>; use <code>freetext_value</code> for
   * free-text fields and <code>enum_values</code> for enum fields. When this attribute is present,
   * the request must include a value for every required metadata field. When <code>protocol_id
   * </code> is present, the published protocol supplies the subject type, decision metrics,
   * analysis-plan defaults, and configuration and enforcement baselines. The request may also
   * include hypothesis, tags, teams, related links, and assignment or event date overrides that
   * satisfy the protocol's duration rules; omit subject_type_id, decision_metrics, variants,
   * warehouse_exposure_configuration, datadog_flag_configuration, traffic_exposure,
   * split_by_properties, and structured_metadata. The protocol association cannot be changed after
   * creation. Without <code>protocol_id</code>, a complete Warehouse or Datadog configuration saves
   * the experiment and its configuration in one transaction. For Datadog flag configuration, send
   * <code>name</code>, <code>subject_type_id</code>, <code>decision_metrics</code>, <code>variants
   * </code>, <code>traffic_exposure</code>, <code>assignments_start_date</code>, <code>
   * assignments_end_date</code>, <code>events_start_date</code>, and <code>events_end_date</code>.
   * The four date fields can be null. Inside <code>datadog_flag_configuration</code>, send <code>
   * feature_flag_id</code>, <code>environment_id</code>, <code>targeting_rules</code>, and <code>
   * entry_point</code>. Use <code>targeting_rules: []</code> and <code>entry_point: null</code>
   * when unused. This creates one saved draft allocation that does not serve traffic. Omit all
   * configuration fields to create an experiment without an allocation. This endpoint is not
   * idempotent.
   *
   * @param body (required)
   * @return ApiResponse&lt;ExperimentsExperimentV2DTO&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Invalid request body: missing required field, malformed variants or decision_metrics, or an unresolvable analysis configuration. </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Missing or invalid authentication (dd-api-key + dd-application-key headers, or a valid user session). </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authenticated caller lacks the product_analytics_experiments_write permission. </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> The supplied protocol_id does not identify a protocol in this organization. </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> The requested configuration is incompatible with the experiment (code: unsupported_configuration). </td><td>  -  </td></tr>
   *       <tr><td> 415 </td><td> Request body sent with a media type other than application/json or application/vnd.api+json. </td><td>  -  </td></tr>
   *       <tr><td> 422 </td><td> The supplied protocol is a draft or archived protocol and cannot be applied to a new experiment. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ExperimentsExperimentV2DTO> createExperimentWithHttpInfo(
      ExperimentsCreateExperimentV2Request body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createExperiment");
    }
    // create path and map variables
    String localVarPath = "/api/v2/experiments";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ExperimentsApi.createExperiment",
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
        new GenericType<ExperimentsExperimentV2DTO>() {});
  }

  /**
   * Create experiment.
   *
   * <p>See {@link #createExperimentWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ExperimentsExperimentV2DTO&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ExperimentsExperimentV2DTO>>
      createExperimentWithHttpInfoAsync(ExperimentsCreateExperimentV2Request body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<ExperimentsExperimentV2DTO>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createExperiment"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/experiments";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ExperimentsApi.createExperiment",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ExperimentsExperimentV2DTO>> result = new CompletableFuture<>();
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
        new GenericType<ExperimentsExperimentV2DTO>() {});
  }

  /**
   * Create experiment metric group.
   *
   * <p>See {@link #createExperimentMetricGroupWithHttpInfo}.
   *
   * @param experimentId The UUID of the experiment. (required)
   * @param body (required)
   * @return ExperimentsExperimentMetricGroupMutationV2
   * @throws ApiException if fails to make API call
   */
  public ExperimentsExperimentMetricGroupMutationV2 createExperimentMetricGroup(
      UUID experimentId, ExperimentsCreateExperimentMetricGroupV2Request body) throws ApiException {
    return createExperimentMetricGroupWithHttpInfo(experimentId, body).getData();
  }

  /**
   * Create experiment metric group.
   *
   * <p>See {@link #createExperimentMetricGroupWithHttpInfoAsync}.
   *
   * @param experimentId The UUID of the experiment. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ExperimentsExperimentMetricGroupMutationV2&gt;
   */
  public CompletableFuture<ExperimentsExperimentMetricGroupMutationV2>
      createExperimentMetricGroupAsync(
          UUID experimentId, ExperimentsCreateExperimentMetricGroupV2Request body) {
    return createExperimentMetricGroupWithHttpInfoAsync(experimentId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a non-decision metric group. The optional metrics array is ordered. Decision groups
   * remain managed through decision_metrics on the experiment resource. This operation does not
   * synchronously recompute results.
   *
   * @param experimentId The UUID of the experiment. (required)
   * @param body (required)
   * @return ApiResponse&lt;ExperimentsExperimentMetricGroupMutationV2&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 415 </td><td> Request body sent with a media type other than application/json or application/vnd.api+json. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ExperimentsExperimentMetricGroupMutationV2>
      createExperimentMetricGroupWithHttpInfo(
          UUID experimentId, ExperimentsCreateExperimentMetricGroupV2Request body)
          throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'experimentId' is set
    if (experimentId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'experimentId' when calling createExperimentMetricGroup");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createExperimentMetricGroup");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/experiments/{experiment_id}/metric-groups"
            .replaceAll(
                "\\{" + "experiment_id" + "\\}", apiClient.escapeString(experimentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ExperimentsApi.createExperimentMetricGroup",
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
        new GenericType<ExperimentsExperimentMetricGroupMutationV2>() {});
  }

  /**
   * Create experiment metric group.
   *
   * <p>See {@link #createExperimentMetricGroupWithHttpInfo}.
   *
   * @param experimentId The UUID of the experiment. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ExperimentsExperimentMetricGroupMutationV2&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ExperimentsExperimentMetricGroupMutationV2>>
      createExperimentMetricGroupWithHttpInfoAsync(
          UUID experimentId, ExperimentsCreateExperimentMetricGroupV2Request body) {
    Object localVarPostBody = body;

    // verify the required parameter 'experimentId' is set
    if (experimentId == null) {
      CompletableFuture<ApiResponse<ExperimentsExperimentMetricGroupMutationV2>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'experimentId' when calling"
                  + " createExperimentMetricGroup"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<ExperimentsExperimentMetricGroupMutationV2>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling createExperimentMetricGroup"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/experiments/{experiment_id}/metric-groups"
            .replaceAll(
                "\\{" + "experiment_id" + "\\}", apiClient.escapeString(experimentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ExperimentsApi.createExperimentMetricGroup",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ExperimentsExperimentMetricGroupMutationV2>> result =
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
        new GenericType<ExperimentsExperimentMetricGroupMutationV2>() {});
  }

  /**
   * Create experiment metric group from collection.
   *
   * <p>See {@link #createExperimentMetricGroupFromCollectionWithHttpInfo}.
   *
   * @param experimentId The UUID of the experiment. (required)
   * @param metricCollectionId The UUID of the metric collection. (required)
   * @return ExperimentsExperimentMetricGroupMutationV2
   * @throws ApiException if fails to make API call
   */
  public ExperimentsExperimentMetricGroupMutationV2 createExperimentMetricGroupFromCollection(
      UUID experimentId, UUID metricCollectionId) throws ApiException {
    return createExperimentMetricGroupFromCollectionWithHttpInfo(experimentId, metricCollectionId)
        .getData();
  }

  /**
   * Create experiment metric group from collection.
   *
   * <p>See {@link #createExperimentMetricGroupFromCollectionWithHttpInfoAsync}.
   *
   * @param experimentId The UUID of the experiment. (required)
   * @param metricCollectionId The UUID of the metric collection. (required)
   * @return CompletableFuture&lt;ExperimentsExperimentMetricGroupMutationV2&gt;
   */
  public CompletableFuture<ExperimentsExperimentMetricGroupMutationV2>
      createExperimentMetricGroupFromCollectionAsync(UUID experimentId, UUID metricCollectionId) {
    return createExperimentMetricGroupFromCollectionWithHttpInfoAsync(
            experimentId, metricCollectionId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Copy a metric collection into a new non-decision metric group. The group is a request-time
   * snapshot: later changes to the collection do not affect the experiment. Metric order is
   * preserved. The operation is not idempotent, and incompatible or empty collections are rejected
   * without creating a group.
   *
   * @param experimentId The UUID of the experiment. (required)
   * @param metricCollectionId The UUID of the metric collection. (required)
   * @return ApiResponse&lt;ExperimentsExperimentMetricGroupMutationV2&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ExperimentsExperimentMetricGroupMutationV2>
      createExperimentMetricGroupFromCollectionWithHttpInfo(
          UUID experimentId, UUID metricCollectionId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'experimentId' is set
    if (experimentId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'experimentId' when calling"
              + " createExperimentMetricGroupFromCollection");
    }

    // verify the required parameter 'metricCollectionId' is set
    if (metricCollectionId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'metricCollectionId' when calling"
              + " createExperimentMetricGroupFromCollection");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/experiments/{experiment_id}/metric-groups/from-collection/{metric_collection_id}"
            .replaceAll(
                "\\{" + "experiment_id" + "\\}", apiClient.escapeString(experimentId.toString()))
            .replaceAll(
                "\\{" + "metric_collection_id" + "\\}",
                apiClient.escapeString(metricCollectionId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ExperimentsApi.createExperimentMetricGroupFromCollection",
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
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<ExperimentsExperimentMetricGroupMutationV2>() {});
  }

  /**
   * Create experiment metric group from collection.
   *
   * <p>See {@link #createExperimentMetricGroupFromCollectionWithHttpInfo}.
   *
   * @param experimentId The UUID of the experiment. (required)
   * @param metricCollectionId The UUID of the metric collection. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ExperimentsExperimentMetricGroupMutationV2&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ExperimentsExperimentMetricGroupMutationV2>>
      createExperimentMetricGroupFromCollectionWithHttpInfoAsync(
          UUID experimentId, UUID metricCollectionId) {
    Object localVarPostBody = null;

    // verify the required parameter 'experimentId' is set
    if (experimentId == null) {
      CompletableFuture<ApiResponse<ExperimentsExperimentMetricGroupMutationV2>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'experimentId' when calling"
                  + " createExperimentMetricGroupFromCollection"));
      return result;
    }

    // verify the required parameter 'metricCollectionId' is set
    if (metricCollectionId == null) {
      CompletableFuture<ApiResponse<ExperimentsExperimentMetricGroupMutationV2>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'metricCollectionId' when calling"
                  + " createExperimentMetricGroupFromCollection"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/experiments/{experiment_id}/metric-groups/from-collection/{metric_collection_id}"
            .replaceAll(
                "\\{" + "experiment_id" + "\\}", apiClient.escapeString(experimentId.toString()))
            .replaceAll(
                "\\{" + "metric_collection_id" + "\\}",
                apiClient.escapeString(metricCollectionId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ExperimentsApi.createExperimentMetricGroupFromCollection",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ExperimentsExperimentMetricGroupMutationV2>> result =
          new CompletableFuture<>();
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
        new GenericType<ExperimentsExperimentMetricGroupMutationV2>() {});
  }

  /**
   * Create exposure SQL model.
   *
   * <p>See {@link #createExposureSQLModelWithHttpInfo}.
   *
   * @param body (required)
   * @return ExperimentsExposureSQLModelV2DTO
   * @throws ApiException if fails to make API call
   */
  public ExperimentsExposureSQLModelV2DTO createExposureSQLModel(
      ExperimentsCreateExposureSQLModelV2Request body) throws ApiException {
    return createExposureSQLModelWithHttpInfo(body).getData();
  }

  /**
   * Create exposure SQL model.
   *
   * <p>See {@link #createExposureSQLModelWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ExperimentsExposureSQLModelV2DTO&gt;
   */
  public CompletableFuture<ExperimentsExposureSQLModelV2DTO> createExposureSQLModelAsync(
      ExperimentsCreateExposureSQLModelV2Request body) {
    return createExposureSQLModelWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create an exposure SQL model. Requires at least one subject type. The warehouse connection is
   * resolved from the organization, which has exactly one.
   *
   * @param body (required)
   * @return ApiResponse&lt;ExperimentsExposureSQLModelV2DTO&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Malformed body, validation failure, or the SQL was rejected by the warehouse validator. </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Missing or invalid authentication. </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authenticated caller lacks the product_analytics_warehouse_model_write permission. </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> The write collided with an existing record for the organization. </td><td>  -  </td></tr>
   *       <tr><td> 415 </td><td> Request body sent with a media type other than application/json or application/vnd.api+json. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ExperimentsExposureSQLModelV2DTO> createExposureSQLModelWithHttpInfo(
      ExperimentsCreateExposureSQLModelV2Request body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createExposureSQLModel");
    }
    // create path and map variables
    String localVarPath = "/api/v2/experiments/exposure-sql-models";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ExperimentsApi.createExposureSQLModel",
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
        new GenericType<ExperimentsExposureSQLModelV2DTO>() {});
  }

  /**
   * Create exposure SQL model.
   *
   * <p>See {@link #createExposureSQLModelWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ExperimentsExposureSQLModelV2DTO&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ExperimentsExposureSQLModelV2DTO>>
      createExposureSQLModelWithHttpInfoAsync(ExperimentsCreateExposureSQLModelV2Request body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<ExperimentsExposureSQLModelV2DTO>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createExposureSQLModel"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/experiments/exposure-sql-models";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ExperimentsApi.createExposureSQLModel",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ExperimentsExposureSQLModelV2DTO>> result =
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
        new GenericType<ExperimentsExposureSQLModelV2DTO>() {});
  }

  /**
   * Create metric.
   *
   * <p>See {@link #createMetricWithHttpInfo}.
   *
   * @param body (required)
   * @return ExperimentsMetricV2DTO
   * @throws ApiException if fails to make API call
   */
  public ExperimentsMetricV2DTO createMetric(ExperimentsCreateMetricV2Request body)
      throws ApiException {
    return createMetricWithHttpInfo(body).getData();
  }

  /**
   * Create metric.
   *
   * <p>See {@link #createMetricWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ExperimentsMetricV2DTO&gt;
   */
  public CompletableFuture<ExperimentsMetricV2DTO> createMetricAsync(
      ExperimentsCreateMetricV2Request body) {
    return createMetricWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a metric. The metric's type is derived from the aggregation shape: a numerator alone is
   * SIMPLE, a numerator with a denominator is RATIO, and a percentile aggregation is PERCENTILE.
   * Warehouse aggregations reference measures by UUID. Property filters use property_id or
   * measure_id UUIDs returned by the same metric SQL model; every reference must belong to the
   * aggregation's data source. The is_certified attribute is rejected. Certification cannot be
   * changed through this endpoint.
   *
   * @param body (required)
   * @return ApiResponse&lt;ExperimentsMetricV2DTO&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Malformed body, validation failure, or an aggregation that does not match metric_type. </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Missing or invalid authentication. </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Caller lacks product_analytics_metrics_write. </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Another metric in this organization already uses one of these values. </td><td>  -  </td></tr>
   *       <tr><td> 415 </td><td> Request body sent with a media type other than application/json or application/vnd.api+json. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ExperimentsMetricV2DTO> createMetricWithHttpInfo(
      ExperimentsCreateMetricV2Request body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createMetric");
    }
    // create path and map variables
    String localVarPath = "/api/v2/experiments/metrics";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ExperimentsApi.createMetric",
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
        new GenericType<ExperimentsMetricV2DTO>() {});
  }

  /**
   * Create metric.
   *
   * <p>See {@link #createMetricWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ExperimentsMetricV2DTO&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ExperimentsMetricV2DTO>> createMetricWithHttpInfoAsync(
      ExperimentsCreateMetricV2Request body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<ExperimentsMetricV2DTO>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'body' when calling createMetric"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/experiments/metrics";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ExperimentsApi.createMetric",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ExperimentsMetricV2DTO>> result = new CompletableFuture<>();
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
        new GenericType<ExperimentsMetricV2DTO>() {});
  }

  /**
   * Create metric collection.
   *
   * <p>See {@link #createMetricCollectionWithHttpInfo}.
   *
   * @param body (required)
   * @return ExperimentsMetricCollectionV2DTO
   * @throws ApiException if fails to make API call
   */
  public ExperimentsMetricCollectionV2DTO createMetricCollection(
      ExperimentsCreateMetricCollectionV2Request body) throws ApiException {
    return createMetricCollectionWithHttpInfo(body).getData();
  }

  /**
   * Create metric collection.
   *
   * <p>See {@link #createMetricCollectionWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ExperimentsMetricCollectionV2DTO&gt;
   */
  public CompletableFuture<ExperimentsMetricCollectionV2DTO> createMetricCollectionAsync(
      ExperimentsCreateMetricCollectionV2Request body) {
    return createMetricCollectionWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create metric collection.
   *
   * @param body (required)
   * @return ApiResponse&lt;ExperimentsMetricCollectionV2DTO&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 415 </td><td> Request body sent with a media type other than application/json or application/vnd.api+json. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ExperimentsMetricCollectionV2DTO> createMetricCollectionWithHttpInfo(
      ExperimentsCreateMetricCollectionV2Request body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createMetricCollection");
    }
    // create path and map variables
    String localVarPath = "/api/v2/experiments/metric-collections";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ExperimentsApi.createMetricCollection",
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
        new GenericType<ExperimentsMetricCollectionV2DTO>() {});
  }

  /**
   * Create metric collection.
   *
   * <p>See {@link #createMetricCollectionWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ExperimentsMetricCollectionV2DTO&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ExperimentsMetricCollectionV2DTO>>
      createMetricCollectionWithHttpInfoAsync(ExperimentsCreateMetricCollectionV2Request body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<ExperimentsMetricCollectionV2DTO>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createMetricCollection"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/experiments/metric-collections";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ExperimentsApi.createMetricCollection",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ExperimentsMetricCollectionV2DTO>> result =
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
        new GenericType<ExperimentsMetricCollectionV2DTO>() {});
  }

  /**
   * Create metric SQL model.
   *
   * <p>See {@link #createMetricSQLModelWithHttpInfo}.
   *
   * @param body (required)
   * @return ExperimentsMetricSQLModelV2DTO
   * @throws ApiException if fails to make API call
   */
  public ExperimentsMetricSQLModelV2DTO createMetricSQLModel(
      ExperimentsCreateMetricSQLModelV2Request body) throws ApiException {
    return createMetricSQLModelWithHttpInfo(body).getData();
  }

  /**
   * Create metric SQL model.
   *
   * <p>See {@link #createMetricSQLModelWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ExperimentsMetricSQLModelV2DTO&gt;
   */
  public CompletableFuture<ExperimentsMetricSQLModelV2DTO> createMetricSQLModelAsync(
      ExperimentsCreateMetricSQLModelV2Request body) {
    return createMetricSQLModelWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a metric SQL model. Requires at least one subject type, whose subject_type_id must
   * already exist for the organization (list them with GET /api/v2/experiments/subject-types). The
   * model is created against the organization's warehouse connection, which is resolved
   * server-side. Only customer-defined measures belong in measures. The response provides
   * unique_subject_count_measure_id for each subject type and event_count_measure_id for use in
   * metric aggregations. column_type is required for every measure and property. Certification is
   * read-only and cannot be changed through this endpoint.
   *
   * @param body (required)
   * @return ApiResponse&lt;ExperimentsMetricSQLModelV2DTO&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Malformed body, validation failure, the SQL was rejected by the warehouse validator, or the organization has no warehouse connection. </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Missing or invalid authentication. </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authenticated caller lacks the product_analytics_warehouse_model_write permission. </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Another metric SQL model in this organization already uses one of these values. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ExperimentsMetricSQLModelV2DTO> createMetricSQLModelWithHttpInfo(
      ExperimentsCreateMetricSQLModelV2Request body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createMetricSQLModel");
    }
    // create path and map variables
    String localVarPath = "/api/v2/experiments/metric-sql-models";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ExperimentsApi.createMetricSQLModel",
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
        new GenericType<ExperimentsMetricSQLModelV2DTO>() {});
  }

  /**
   * Create metric SQL model.
   *
   * <p>See {@link #createMetricSQLModelWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ExperimentsMetricSQLModelV2DTO&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ExperimentsMetricSQLModelV2DTO>>
      createMetricSQLModelWithHttpInfoAsync(ExperimentsCreateMetricSQLModelV2Request body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<ExperimentsMetricSQLModelV2DTO>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createMetricSQLModel"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/experiments/metric-sql-models";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ExperimentsApi.createMetricSQLModel",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ExperimentsMetricSQLModelV2DTO>> result =
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
        new GenericType<ExperimentsMetricSQLModelV2DTO>() {});
  }

  /**
   * Create subject type.
   *
   * <p>See {@link #createSubjectTypeWithHttpInfo}.
   *
   * @param body (required)
   * @return ExperimentsSubjectTypeV2DTO
   * @throws ApiException if fails to make API call
   */
  public ExperimentsSubjectTypeV2DTO createSubjectType(ExperimentsCreateSubjectTypeV2Request body)
      throws ApiException {
    return createSubjectTypeWithHttpInfo(body).getData();
  }

  /**
   * Create subject type.
   *
   * <p>See {@link #createSubjectTypeWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ExperimentsSubjectTypeV2DTO&gt;
   */
  public CompletableFuture<ExperimentsSubjectTypeV2DTO> createSubjectTypeAsync(
      ExperimentsCreateSubjectTypeV2Request body) {
    return createSubjectTypeWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a subject type for the organization.
   *
   * @param body (required)
   * @return ApiResponse&lt;ExperimentsSubjectTypeV2DTO&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Malformed body, or validation failure on name, product_analytics_attribute, or warehouse_column_names. </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Missing or invalid authentication. </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authenticated caller lacks the product_analytics_settings_write permission. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ExperimentsSubjectTypeV2DTO> createSubjectTypeWithHttpInfo(
      ExperimentsCreateSubjectTypeV2Request body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createSubjectType");
    }
    // create path and map variables
    String localVarPath = "/api/v2/experiments/subject-types";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ExperimentsApi.createSubjectType",
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
        new GenericType<ExperimentsSubjectTypeV2DTO>() {});
  }

  /**
   * Create subject type.
   *
   * <p>See {@link #createSubjectTypeWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ExperimentsSubjectTypeV2DTO&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ExperimentsSubjectTypeV2DTO>>
      createSubjectTypeWithHttpInfoAsync(ExperimentsCreateSubjectTypeV2Request body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<ExperimentsSubjectTypeV2DTO>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createSubjectType"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/experiments/subject-types";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ExperimentsApi.createSubjectType",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ExperimentsSubjectTypeV2DTO>> result =
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
        new GenericType<ExperimentsSubjectTypeV2DTO>() {});
  }

  /**
   * Delete experiment.
   *
   * <p>See {@link #deleteExperimentWithHttpInfo}.
   *
   * @param experimentId The UUID of the experiment. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteExperiment(UUID experimentId) throws ApiException {
    deleteExperimentWithHttpInfo(experimentId);
  }

  /**
   * Delete experiment.
   *
   * <p>See {@link #deleteExperimentWithHttpInfoAsync}.
   *
   * @param experimentId The UUID of the experiment. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteExperimentAsync(UUID experimentId) {
    return deleteExperimentWithHttpInfoAsync(experimentId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete an experiment and its linked feature flag allocations in one database transaction. After
   * deletion, the experiment is no longer returned by the API. If the transaction fails, neither
   * the experiment nor its allocations are deleted. Deleting an experiment cannot be undone.
   *
   * @param experimentId The UUID of the experiment. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> The experiment was deleted. </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Malformed experiment ID (not a valid UUID). </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Missing or invalid authentication (dd-api-key + dd-application-key headers, or a valid user session). </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authenticated caller lacks the product_analytics_experiments_write permission, lacks permission to edit this experiment, or lacks contribute permission on a feature flag owning one of its allocations. </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> No experiment with this ID exists for the organization. </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> The experiment has a published allocation on an archived flag, must be retained for selective holdout analysis, or its linked allocations changed during authorization. Nothing was deleted. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteExperimentWithHttpInfo(UUID experimentId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'experimentId' is set
    if (experimentId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'experimentId' when calling deleteExperiment");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/experiments/{experiment_id}"
            .replaceAll(
                "\\{" + "experiment_id" + "\\}", apiClient.escapeString(experimentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ExperimentsApi.deleteExperiment",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
   * Delete experiment.
   *
   * <p>See {@link #deleteExperimentWithHttpInfo}.
   *
   * @param experimentId The UUID of the experiment. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteExperimentWithHttpInfoAsync(UUID experimentId) {
    Object localVarPostBody = null;

    // verify the required parameter 'experimentId' is set
    if (experimentId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'experimentId' when calling deleteExperiment"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/experiments/{experiment_id}"
            .replaceAll(
                "\\{" + "experiment_id" + "\\}", apiClient.escapeString(experimentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ExperimentsApi.deleteExperiment",
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
   * Delete experiment metric group.
   *
   * <p>See {@link #deleteExperimentMetricGroupWithHttpInfo}.
   *
   * @param experimentId The UUID of the experiment. (required)
   * @param metricGroupId The UUID of the metric group. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteExperimentMetricGroup(UUID experimentId, UUID metricGroupId)
      throws ApiException {
    deleteExperimentMetricGroupWithHttpInfo(experimentId, metricGroupId);
  }

  /**
   * Delete experiment metric group.
   *
   * <p>See {@link #deleteExperimentMetricGroupWithHttpInfoAsync}.
   *
   * @param experimentId The UUID of the experiment. (required)
   * @param metricGroupId The UUID of the metric group. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteExperimentMetricGroupAsync(
      UUID experimentId, UUID metricGroupId) {
    return deleteExperimentMetricGroupWithHttpInfoAsync(experimentId, metricGroupId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete a non-decision metric group and its memberships. Decision groups remain managed through
   * the experiment resource. This operation does not start a pipeline. Read experiment results
   * after deletion to check stale metadata, then explicitly refresh results when required.
   *
   * @param experimentId The UUID of the experiment. (required)
   * @param metricGroupId The UUID of the metric group. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteExperimentMetricGroupWithHttpInfo(
      UUID experimentId, UUID metricGroupId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'experimentId' is set
    if (experimentId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'experimentId' when calling deleteExperimentMetricGroup");
    }

    // verify the required parameter 'metricGroupId' is set
    if (metricGroupId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'metricGroupId' when calling"
              + " deleteExperimentMetricGroup");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/experiments/{experiment_id}/metric-groups/{metric_group_id}"
            .replaceAll(
                "\\{" + "experiment_id" + "\\}", apiClient.escapeString(experimentId.toString()))
            .replaceAll(
                "\\{" + "metric_group_id" + "\\}",
                apiClient.escapeString(metricGroupId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ExperimentsApi.deleteExperimentMetricGroup",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
   * Delete experiment metric group.
   *
   * <p>See {@link #deleteExperimentMetricGroupWithHttpInfo}.
   *
   * @param experimentId The UUID of the experiment. (required)
   * @param metricGroupId The UUID of the metric group. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteExperimentMetricGroupWithHttpInfoAsync(
      UUID experimentId, UUID metricGroupId) {
    Object localVarPostBody = null;

    // verify the required parameter 'experimentId' is set
    if (experimentId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'experimentId' when calling"
                  + " deleteExperimentMetricGroup"));
      return result;
    }

    // verify the required parameter 'metricGroupId' is set
    if (metricGroupId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'metricGroupId' when calling"
                  + " deleteExperimentMetricGroup"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/experiments/{experiment_id}/metric-groups/{metric_group_id}"
            .replaceAll(
                "\\{" + "experiment_id" + "\\}", apiClient.escapeString(experimentId.toString()))
            .replaceAll(
                "\\{" + "metric_group_id" + "\\}",
                apiClient.escapeString(metricGroupId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ExperimentsApi.deleteExperimentMetricGroup",
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
   * Delete metric.
   *
   * <p>See {@link #deleteMetricWithHttpInfo}.
   *
   * @param metricId The UUID of the metric. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteMetric(UUID metricId) throws ApiException {
    deleteMetricWithHttpInfo(metricId);
  }

  /**
   * Delete metric.
   *
   * <p>See {@link #deleteMetricWithHttpInfoAsync}.
   *
   * @param metricId The UUID of the metric. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteMetricAsync(UUID metricId) {
    return deleteMetricWithHttpInfoAsync(metricId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete a metric. Certified metrics are read-only through this endpoint. The record is
   * soft-deleted and stops appearing in reads. A metric still referenced by an experiment cannot be
   * deleted; detach it from those experiments first.
   *
   * @param metricId The UUID of the metric. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> The metric was deleted. </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Malformed metric ID (not a valid UUID). </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Missing or invalid authentication. </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Caller lacks product_analytics_metrics_write or edit access to this specific metric. </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> No metric with this ID exists for the organization. </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> The metric is imported, certified, managed by metric sync, or still referenced by one or more experiments and cannot be deleted. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteMetricWithHttpInfo(UUID metricId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'metricId' is set
    if (metricId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'metricId' when calling deleteMetric");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/experiments/metrics/{metric_id}"
            .replaceAll("\\{" + "metric_id" + "\\}", apiClient.escapeString(metricId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ExperimentsApi.deleteMetric",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
   * Delete metric.
   *
   * <p>See {@link #deleteMetricWithHttpInfo}.
   *
   * @param metricId The UUID of the metric. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteMetricWithHttpInfoAsync(UUID metricId) {
    Object localVarPostBody = null;

    // verify the required parameter 'metricId' is set
    if (metricId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'metricId' when calling deleteMetric"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/experiments/metrics/{metric_id}"
            .replaceAll("\\{" + "metric_id" + "\\}", apiClient.escapeString(metricId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ExperimentsApi.deleteMetric",
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
   * Delete metric collection.
   *
   * <p>See {@link #deleteMetricCollectionWithHttpInfo}.
   *
   * @param metricCollectionId The UUID of the metric collection. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteMetricCollection(UUID metricCollectionId) throws ApiException {
    deleteMetricCollectionWithHttpInfo(metricCollectionId);
  }

  /**
   * Delete metric collection.
   *
   * <p>See {@link #deleteMetricCollectionWithHttpInfoAsync}.
   *
   * @param metricCollectionId The UUID of the metric collection. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteMetricCollectionAsync(UUID metricCollectionId) {
    return deleteMetricCollectionWithHttpInfoAsync(metricCollectionId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete metric collection.
   *
   * @param metricCollectionId The UUID of the metric collection. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteMetricCollectionWithHttpInfo(UUID metricCollectionId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'metricCollectionId' is set
    if (metricCollectionId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'metricCollectionId' when calling"
              + " deleteMetricCollection");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/experiments/metric-collections/{metric_collection_id}"
            .replaceAll(
                "\\{" + "metric_collection_id" + "\\}",
                apiClient.escapeString(metricCollectionId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ExperimentsApi.deleteMetricCollection",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
   * Delete metric collection.
   *
   * <p>See {@link #deleteMetricCollectionWithHttpInfo}.
   *
   * @param metricCollectionId The UUID of the metric collection. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteMetricCollectionWithHttpInfoAsync(
      UUID metricCollectionId) {
    Object localVarPostBody = null;

    // verify the required parameter 'metricCollectionId' is set
    if (metricCollectionId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'metricCollectionId' when calling"
                  + " deleteMetricCollection"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/experiments/metric-collections/{metric_collection_id}"
            .replaceAll(
                "\\{" + "metric_collection_id" + "\\}",
                apiClient.escapeString(metricCollectionId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ExperimentsApi.deleteMetricCollection",
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
   * Delete subject type.
   *
   * <p>See {@link #deleteSubjectTypeWithHttpInfo}.
   *
   * @param subjectTypeId The UUID of the subject type. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteSubjectType(UUID subjectTypeId) throws ApiException {
    deleteSubjectTypeWithHttpInfo(subjectTypeId);
  }

  /**
   * Delete subject type.
   *
   * <p>See {@link #deleteSubjectTypeWithHttpInfoAsync}.
   *
   * @param subjectTypeId The UUID of the subject type. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteSubjectTypeAsync(UUID subjectTypeId) {
    return deleteSubjectTypeWithHttpInfoAsync(subjectTypeId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete a subject type. The record is soft-deleted and stops appearing in reads. The call is
   * idempotent: deleting the same subject type again also returns 204. The organization's default
   * subject type cannot be deleted; make another one the default first. A subject type that
   * experiments, exposure SQL models, metric SQL models or protocols still reference cannot be
   * deleted either; the refusal names the blockers.
   *
   * @param subjectTypeId The UUID of the subject type. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> The subject type was deleted. </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Malformed subject type ID (not a valid UUID). </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Missing or invalid authentication. </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authenticated caller lacks the product_analytics_settings_write permission. </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> No subject type with this ID exists for the organization. </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Either this subject type is the organization&#39;s default, or experiments, exposure SQL models, metric SQL models or protocols still reference it. When something references it, meta.blockers names them (capped per kind, with truncated set when more exist). </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteSubjectTypeWithHttpInfo(UUID subjectTypeId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'subjectTypeId' is set
    if (subjectTypeId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'subjectTypeId' when calling deleteSubjectType");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/experiments/subject-types/{subject_type_id}"
            .replaceAll(
                "\\{" + "subject_type_id" + "\\}",
                apiClient.escapeString(subjectTypeId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ExperimentsApi.deleteSubjectType",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
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
   * Delete subject type.
   *
   * <p>See {@link #deleteSubjectTypeWithHttpInfo}.
   *
   * @param subjectTypeId The UUID of the subject type. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteSubjectTypeWithHttpInfoAsync(
      UUID subjectTypeId) {
    Object localVarPostBody = null;

    // verify the required parameter 'subjectTypeId' is set
    if (subjectTypeId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'subjectTypeId' when calling deleteSubjectType"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/experiments/subject-types/{subject_type_id}"
            .replaceAll(
                "\\{" + "subject_type_id" + "\\}",
                apiClient.escapeString(subjectTypeId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ExperimentsApi.deleteSubjectType",
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
   * Get experiment.
   *
   * <p>See {@link #getExperimentWithHttpInfo}.
   *
   * @param experimentId The UUID of the experiment. (required)
   * @return ExperimentsExperimentV2DTO
   * @throws ApiException if fails to make API call
   */
  public ExperimentsExperimentV2DTO getExperiment(UUID experimentId) throws ApiException {
    return getExperimentWithHttpInfo(experimentId).getData();
  }

  /**
   * Get experiment.
   *
   * <p>See {@link #getExperimentWithHttpInfoAsync}.
   *
   * @param experimentId The UUID of the experiment. (required)
   * @return CompletableFuture&lt;ExperimentsExperimentV2DTO&gt;
   */
  public CompletableFuture<ExperimentsExperimentV2DTO> getExperimentAsync(UUID experimentId) {
    return getExperimentWithHttpInfoAsync(experimentId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a complete experiment by ID. The response includes structured metadata, related links, and,
   * when a complete setup exists, decision metrics, variants, <code>
   * warehouse_exposure_configuration</code>, <code>datadog_flag_configuration</code>, STATIC or
   * STEPS traffic exposure, and assignment and event dates. STEPS describes the configured plan
   * rather than wall-clock history; Datadog step durations exclude pauses. The list endpoint omits
   * these setup details.
   *
   * @param experimentId The UUID of the experiment. (required)
   * @return ApiResponse&lt;ExperimentsExperimentV2DTO&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Malformed experiment ID (not a valid UUID). </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Missing or invalid authentication (dd-api-key + dd-application-key headers, or a valid user session). </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authenticated caller lacks the product_analytics_experiments_read permission, or lacks feature-flag and environment read permissions for a Datadog-backed configuration. </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> No experiment with this ID exists for the organization. </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> The stored assignment configuration cannot be represented losslessly by this API (unsupported_configuration). </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ExperimentsExperimentV2DTO> getExperimentWithHttpInfo(UUID experimentId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'experimentId' is set
    if (experimentId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'experimentId' when calling getExperiment");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/experiments/{experiment_id}"
            .replaceAll(
                "\\{" + "experiment_id" + "\\}", apiClient.escapeString(experimentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ExperimentsApi.getExperiment",
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
        new GenericType<ExperimentsExperimentV2DTO>() {});
  }

  /**
   * Get experiment.
   *
   * <p>See {@link #getExperimentWithHttpInfo}.
   *
   * @param experimentId The UUID of the experiment. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ExperimentsExperimentV2DTO&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ExperimentsExperimentV2DTO>> getExperimentWithHttpInfoAsync(
      UUID experimentId) {
    Object localVarPostBody = null;

    // verify the required parameter 'experimentId' is set
    if (experimentId == null) {
      CompletableFuture<ApiResponse<ExperimentsExperimentV2DTO>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'experimentId' when calling getExperiment"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/experiments/{experiment_id}"
            .replaceAll(
                "\\{" + "experiment_id" + "\\}", apiClient.escapeString(experimentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ExperimentsApi.getExperiment",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ExperimentsExperimentV2DTO>> result = new CompletableFuture<>();
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
        new GenericType<ExperimentsExperimentV2DTO>() {});
  }

  /**
   * Get experiment analysis plan.
   *
   * <p>See {@link #getExperimentAnalysisPlanWithHttpInfo}.
   *
   * @param experimentId The UUID of the experiment. (required)
   * @return ExperimentsAnalysisPlanV2DTO
   * @throws ApiException if fails to make API call
   */
  public ExperimentsAnalysisPlanV2DTO getExperimentAnalysisPlan(UUID experimentId)
      throws ApiException {
    return getExperimentAnalysisPlanWithHttpInfo(experimentId).getData();
  }

  /**
   * Get experiment analysis plan.
   *
   * <p>See {@link #getExperimentAnalysisPlanWithHttpInfoAsync}.
   *
   * @param experimentId The UUID of the experiment. (required)
   * @return CompletableFuture&lt;ExperimentsAnalysisPlanV2DTO&gt;
   */
  public CompletableFuture<ExperimentsAnalysisPlanV2DTO> getExperimentAnalysisPlanAsync(
      UUID experimentId) {
    return getExperimentAnalysisPlanWithHttpInfoAsync(experimentId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the effective public statistical analysis settings for an experiment.
   * has_custom_analysis_settings compares only settings the caller can edit; protocol-required
   * differences from company defaults do not make the plan custom.
   *
   * @param experimentId The UUID of the experiment. (required)
   * @return ApiResponse&lt;ExperimentsAnalysisPlanV2DTO&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Malformed experiment ID. </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ExperimentsAnalysisPlanV2DTO> getExperimentAnalysisPlanWithHttpInfo(
      UUID experimentId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'experimentId' is set
    if (experimentId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'experimentId' when calling getExperimentAnalysisPlan");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/experiments/{experiment_id}/analysis-plan"
            .replaceAll(
                "\\{" + "experiment_id" + "\\}", apiClient.escapeString(experimentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ExperimentsApi.getExperimentAnalysisPlan",
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
        new GenericType<ExperimentsAnalysisPlanV2DTO>() {});
  }

  /**
   * Get experiment analysis plan.
   *
   * <p>See {@link #getExperimentAnalysisPlanWithHttpInfo}.
   *
   * @param experimentId The UUID of the experiment. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ExperimentsAnalysisPlanV2DTO&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ExperimentsAnalysisPlanV2DTO>>
      getExperimentAnalysisPlanWithHttpInfoAsync(UUID experimentId) {
    Object localVarPostBody = null;

    // verify the required parameter 'experimentId' is set
    if (experimentId == null) {
      CompletableFuture<ApiResponse<ExperimentsAnalysisPlanV2DTO>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'experimentId' when calling"
                  + " getExperimentAnalysisPlan"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/experiments/{experiment_id}/analysis-plan"
            .replaceAll(
                "\\{" + "experiment_id" + "\\}", apiClient.escapeString(experimentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ExperimentsApi.getExperimentAnalysisPlan",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ExperimentsAnalysisPlanV2DTO>> result =
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
        new GenericType<ExperimentsAnalysisPlanV2DTO>() {});
  }

  /**
   * Get experiment diagnostics.
   *
   * <p>See {@link #getExperimentDiagnosticsWithHttpInfo}.
   *
   * @param experimentId The UUID of the experiment. (required)
   * @return ExperimentsExperimentDiagnosticsV2DTO
   * @throws ApiException if fails to make API call
   */
  public ExperimentsExperimentDiagnosticsV2DTO getExperimentDiagnostics(UUID experimentId)
      throws ApiException {
    return getExperimentDiagnosticsWithHttpInfo(experimentId).getData();
  }

  /**
   * Get experiment diagnostics.
   *
   * <p>See {@link #getExperimentDiagnosticsWithHttpInfoAsync}.
   *
   * @param experimentId The UUID of the experiment. (required)
   * @return CompletableFuture&lt;ExperimentsExperimentDiagnosticsV2DTO&gt;
   */
  public CompletableFuture<ExperimentsExperimentDiagnosticsV2DTO> getExperimentDiagnosticsAsync(
      UUID experimentId) {
    return getExperimentDiagnosticsWithHttpInfoAsync(experimentId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the diagnostics produced by an experiment's latest analysis run. Each diagnostic includes
   * its category, and the response includes an overall diagnostic or pipeline lifecycle status.
   *
   * @param experimentId The UUID of the experiment. (required)
   * @return ApiResponse&lt;ExperimentsExperimentDiagnosticsV2DTO&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Malformed experiment ID (not a valid UUID). </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Missing or invalid authentication. </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authenticated caller lacks the product_analytics_experiments_read permission. </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> No experiment with this ID exists for the organization. Lifecycle statuses in a successful response explain whether analysis has started, is running, or completed without diagnostics. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ExperimentsExperimentDiagnosticsV2DTO> getExperimentDiagnosticsWithHttpInfo(
      UUID experimentId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'experimentId' is set
    if (experimentId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'experimentId' when calling getExperimentDiagnostics");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/experiments/{experiment_id}/diagnostics"
            .replaceAll(
                "\\{" + "experiment_id" + "\\}", apiClient.escapeString(experimentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ExperimentsApi.getExperimentDiagnostics",
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
        new GenericType<ExperimentsExperimentDiagnosticsV2DTO>() {});
  }

  /**
   * Get experiment diagnostics.
   *
   * <p>See {@link #getExperimentDiagnosticsWithHttpInfo}.
   *
   * @param experimentId The UUID of the experiment. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ExperimentsExperimentDiagnosticsV2DTO&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ExperimentsExperimentDiagnosticsV2DTO>>
      getExperimentDiagnosticsWithHttpInfoAsync(UUID experimentId) {
    Object localVarPostBody = null;

    // verify the required parameter 'experimentId' is set
    if (experimentId == null) {
      CompletableFuture<ApiResponse<ExperimentsExperimentDiagnosticsV2DTO>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'experimentId' when calling"
                  + " getExperimentDiagnostics"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/experiments/{experiment_id}/diagnostics"
            .replaceAll(
                "\\{" + "experiment_id" + "\\}", apiClient.escapeString(experimentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ExperimentsApi.getExperimentDiagnostics",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ExperimentsExperimentDiagnosticsV2DTO>> result =
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
        new GenericType<ExperimentsExperimentDiagnosticsV2DTO>() {});
  }

  /**
   * Get experiment protocol.
   *
   * <p>See {@link #getExperimentProtocolWithHttpInfo}.
   *
   * @param protocolId The UUID of the protocol. (required)
   * @return ExperimentsPublicProtocolResponse
   * @throws ApiException if fails to make API call
   */
  public ExperimentsPublicProtocolResponse getExperimentProtocol(UUID protocolId)
      throws ApiException {
    return getExperimentProtocolWithHttpInfo(protocolId).getData();
  }

  /**
   * Get experiment protocol.
   *
   * <p>See {@link #getExperimentProtocolWithHttpInfoAsync}.
   *
   * @param protocolId The UUID of the protocol. (required)
   * @return CompletableFuture&lt;ExperimentsPublicProtocolResponse&gt;
   */
  public CompletableFuture<ExperimentsPublicProtocolResponse> getExperimentProtocolAsync(
      UUID protocolId) {
    return getExperimentProtocolWithHttpInfoAsync(protocolId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a draft, published, or archived experiment protocol by ID.
   *
   * @param protocolId The UUID of the protocol. (required)
   * @return ApiResponse&lt;ExperimentsPublicProtocolResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ExperimentsPublicProtocolResponse> getExperimentProtocolWithHttpInfo(
      UUID protocolId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'protocolId' is set
    if (protocolId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'protocolId' when calling getExperimentProtocol");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/experiments/protocols/{protocol_id}"
            .replaceAll(
                "\\{" + "protocol_id" + "\\}", apiClient.escapeString(protocolId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ExperimentsApi.getExperimentProtocol",
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
        new GenericType<ExperimentsPublicProtocolResponse>() {});
  }

  /**
   * Get experiment protocol.
   *
   * <p>See {@link #getExperimentProtocolWithHttpInfo}.
   *
   * @param protocolId The UUID of the protocol. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ExperimentsPublicProtocolResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ExperimentsPublicProtocolResponse>>
      getExperimentProtocolWithHttpInfoAsync(UUID protocolId) {
    Object localVarPostBody = null;

    // verify the required parameter 'protocolId' is set
    if (protocolId == null) {
      CompletableFuture<ApiResponse<ExperimentsPublicProtocolResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'protocolId' when calling getExperimentProtocol"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/experiments/protocols/{protocol_id}"
            .replaceAll(
                "\\{" + "protocol_id" + "\\}", apiClient.escapeString(protocolId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ExperimentsApi.getExperimentProtocol",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ExperimentsPublicProtocolResponse>> result =
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
        new GenericType<ExperimentsPublicProtocolResponse>() {});
  }

  /**
   * Get experiment results.
   *
   * <p>See {@link #getExperimentResultsWithHttpInfo}.
   *
   * @param experimentId The UUID of the experiment. (required)
   * @return ExperimentsVariantResultsV2DTOArray
   * @throws ApiException if fails to make API call
   */
  public ExperimentsVariantResultsV2DTOArray getExperimentResults(UUID experimentId)
      throws ApiException {
    return getExperimentResultsWithHttpInfo(experimentId).getData();
  }

  /**
   * Get experiment results.
   *
   * <p>See {@link #getExperimentResultsWithHttpInfoAsync}.
   *
   * @param experimentId The UUID of the experiment. (required)
   * @return CompletableFuture&lt;ExperimentsVariantResultsV2DTOArray&gt;
   */
  public CompletableFuture<ExperimentsVariantResultsV2DTOArray> getExperimentResultsAsync(
      UUID experimentId) {
    return getExperimentResultsWithHttpInfoAsync(experimentId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get an experiment's computed results: per-variant statistical analysis for the latest
   * successful run. A historical run cannot be selected. Unavailable analysis statistics, including
   * <code>p_value</code> and <code>confidence_interval</code>, are omitted. The <code>numerator
   * </code>, <code>denominator</code>, and <code>variant_metric_value</code> fields can be null
   * when their values are unavailable. Do not treat an omitted or null value as zero.
   *
   * @param experimentId The UUID of the experiment. (required)
   * @return ApiResponse&lt;ExperimentsVariantResultsV2DTOArray&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Malformed experiment ID (not a valid UUID), or the experiment is not configured for analysis. </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Missing or invalid authentication. </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authenticated caller lacks the product_analytics_experiments_read permission. </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> No experiment with this ID exists, or results are not available for it yet. </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> The experiment&#39;s metrics are incompatible with analysis. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ExperimentsVariantResultsV2DTOArray> getExperimentResultsWithHttpInfo(
      UUID experimentId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'experimentId' is set
    if (experimentId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'experimentId' when calling getExperimentResults");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/experiments/{experiment_id}/results"
            .replaceAll(
                "\\{" + "experiment_id" + "\\}", apiClient.escapeString(experimentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ExperimentsApi.getExperimentResults",
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
        new GenericType<ExperimentsVariantResultsV2DTOArray>() {});
  }

  /**
   * Get experiment results.
   *
   * <p>See {@link #getExperimentResultsWithHttpInfo}.
   *
   * @param experimentId The UUID of the experiment. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ExperimentsVariantResultsV2DTOArray&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ExperimentsVariantResultsV2DTOArray>>
      getExperimentResultsWithHttpInfoAsync(UUID experimentId) {
    Object localVarPostBody = null;

    // verify the required parameter 'experimentId' is set
    if (experimentId == null) {
      CompletableFuture<ApiResponse<ExperimentsVariantResultsV2DTOArray>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'experimentId' when calling getExperimentResults"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/experiments/{experiment_id}/results"
            .replaceAll(
                "\\{" + "experiment_id" + "\\}", apiClient.escapeString(experimentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ExperimentsApi.getExperimentResults",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ExperimentsVariantResultsV2DTOArray>> result =
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
        new GenericType<ExperimentsVariantResultsV2DTOArray>() {});
  }

  /**
   * Get experiment traffic summary.
   *
   * <p>See {@link #getExperimentTrafficSummaryWithHttpInfo}.
   *
   * @param experimentId The UUID of the experiment. (required)
   * @return ExperimentsTrafficSummaryV2DTO
   * @throws ApiException if fails to make API call
   */
  public ExperimentsTrafficSummaryV2DTO getExperimentTrafficSummary(UUID experimentId)
      throws ApiException {
    return getExperimentTrafficSummaryWithHttpInfo(experimentId).getData();
  }

  /**
   * Get experiment traffic summary.
   *
   * <p>See {@link #getExperimentTrafficSummaryWithHttpInfoAsync}.
   *
   * @param experimentId The UUID of the experiment. (required)
   * @return CompletableFuture&lt;ExperimentsTrafficSummaryV2DTO&gt;
   */
  public CompletableFuture<ExperimentsTrafficSummaryV2DTO> getExperimentTrafficSummaryAsync(
      UUID experimentId) {
    return getExperimentTrafficSummaryWithHttpInfoAsync(experimentId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get an experiment's traffic summary: per-variant exposure counts and a sample-ratio-mismatch
   * flag (is_traffic_imbalanced). SRM statistics live on the diagnostics endpoint.
   *
   * @param experimentId The UUID of the experiment. (required)
   * @return ApiResponse&lt;ExperimentsTrafficSummaryV2DTO&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Malformed experiment ID (not a valid UUID), or the experiment is not configured for analysis. </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Missing or invalid authentication. </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authenticated caller lacks the product_analytics_experiments_read permission. </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> No experiment with this ID exists for the organization. </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> The experiment&#39;s metrics are incompatible with analysis. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ExperimentsTrafficSummaryV2DTO> getExperimentTrafficSummaryWithHttpInfo(
      UUID experimentId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'experimentId' is set
    if (experimentId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'experimentId' when calling getExperimentTrafficSummary");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/experiments/{experiment_id}/traffic-summary"
            .replaceAll(
                "\\{" + "experiment_id" + "\\}", apiClient.escapeString(experimentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ExperimentsApi.getExperimentTrafficSummary",
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
        new GenericType<ExperimentsTrafficSummaryV2DTO>() {});
  }

  /**
   * Get experiment traffic summary.
   *
   * <p>See {@link #getExperimentTrafficSummaryWithHttpInfo}.
   *
   * @param experimentId The UUID of the experiment. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ExperimentsTrafficSummaryV2DTO&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ExperimentsTrafficSummaryV2DTO>>
      getExperimentTrafficSummaryWithHttpInfoAsync(UUID experimentId) {
    Object localVarPostBody = null;

    // verify the required parameter 'experimentId' is set
    if (experimentId == null) {
      CompletableFuture<ApiResponse<ExperimentsTrafficSummaryV2DTO>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'experimentId' when calling"
                  + " getExperimentTrafficSummary"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/experiments/{experiment_id}/traffic-summary"
            .replaceAll(
                "\\{" + "experiment_id" + "\\}", apiClient.escapeString(experimentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ExperimentsApi.getExperimentTrafficSummary",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ExperimentsTrafficSummaryV2DTO>> result =
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
        new GenericType<ExperimentsTrafficSummaryV2DTO>() {});
  }

  /** Manage optional parameters to getExposureSQLModel. */
  public static class GetExposureSQLModelOptionalParameters {
    private List<String> include;

    /**
     * Set include.
     *
     * @param include Optional fields to include. Repeat this parameter to request several fields.
     *     <code>counts</code> adds experiment_count. (optional)
     * @return GetExposureSQLModelOptionalParameters
     */
    public GetExposureSQLModelOptionalParameters include(List<String> include) {
      this.include = include;
      return this;
    }
  }

  /**
   * Get exposure SQL model.
   *
   * <p>See {@link #getExposureSQLModelWithHttpInfo}.
   *
   * @param exposureSqlModelId The UUID of the exposure SQL model. (required)
   * @return ExperimentsExposureSQLModelV2DTO
   * @throws ApiException if fails to make API call
   */
  public ExperimentsExposureSQLModelV2DTO getExposureSQLModel(UUID exposureSqlModelId)
      throws ApiException {
    return getExposureSQLModelWithHttpInfo(
            exposureSqlModelId, new GetExposureSQLModelOptionalParameters())
        .getData();
  }

  /**
   * Get exposure SQL model.
   *
   * <p>See {@link #getExposureSQLModelWithHttpInfoAsync}.
   *
   * @param exposureSqlModelId The UUID of the exposure SQL model. (required)
   * @return CompletableFuture&lt;ExperimentsExposureSQLModelV2DTO&gt;
   */
  public CompletableFuture<ExperimentsExposureSQLModelV2DTO> getExposureSQLModelAsync(
      UUID exposureSqlModelId) {
    return getExposureSQLModelWithHttpInfoAsync(
            exposureSqlModelId, new GetExposureSQLModelOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get exposure SQL model.
   *
   * <p>See {@link #getExposureSQLModelWithHttpInfo}.
   *
   * @param exposureSqlModelId The UUID of the exposure SQL model. (required)
   * @param parameters Optional parameters for the request.
   * @return ExperimentsExposureSQLModelV2DTO
   * @throws ApiException if fails to make API call
   */
  public ExperimentsExposureSQLModelV2DTO getExposureSQLModel(
      UUID exposureSqlModelId, GetExposureSQLModelOptionalParameters parameters)
      throws ApiException {
    return getExposureSQLModelWithHttpInfo(exposureSqlModelId, parameters).getData();
  }

  /**
   * Get exposure SQL model.
   *
   * <p>See {@link #getExposureSQLModelWithHttpInfoAsync}.
   *
   * @param exposureSqlModelId The UUID of the exposure SQL model. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ExperimentsExposureSQLModelV2DTO&gt;
   */
  public CompletableFuture<ExperimentsExposureSQLModelV2DTO> getExposureSQLModelAsync(
      UUID exposureSqlModelId, GetExposureSQLModelOptionalParameters parameters) {
    return getExposureSQLModelWithHttpInfoAsync(exposureSqlModelId, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get an exposure SQL model. Returns a single model by its ID for the organization, including its
   * subject types and properties.
   *
   * @param exposureSqlModelId The UUID of the exposure SQL model. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;ExperimentsExposureSQLModelV2DTO&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Malformed exposure SQL model ID (not a valid UUID), or unknown include value. </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Missing or invalid authentication. </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authenticated caller lacks the product_analytics_metrics_read permission. </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> No exposure SQL model with this ID exists for the organization. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ExperimentsExposureSQLModelV2DTO> getExposureSQLModelWithHttpInfo(
      UUID exposureSqlModelId, GetExposureSQLModelOptionalParameters parameters)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'exposureSqlModelId' is set
    if (exposureSqlModelId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'exposureSqlModelId' when calling getExposureSQLModel");
    }
    List<String> include = parameters.include;
    // create path and map variables
    String localVarPath =
        "/api/v2/experiments/exposure-sql-models/{exposure_sql_model_id}"
            .replaceAll(
                "\\{" + "exposure_sql_model_id" + "\\}",
                apiClient.escapeString(exposureSqlModelId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "include", include));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ExperimentsApi.getExposureSQLModel",
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
        new GenericType<ExperimentsExposureSQLModelV2DTO>() {});
  }

  /**
   * Get exposure SQL model.
   *
   * <p>See {@link #getExposureSQLModelWithHttpInfo}.
   *
   * @param exposureSqlModelId The UUID of the exposure SQL model. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;ExperimentsExposureSQLModelV2DTO&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ExperimentsExposureSQLModelV2DTO>>
      getExposureSQLModelWithHttpInfoAsync(
          UUID exposureSqlModelId, GetExposureSQLModelOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'exposureSqlModelId' is set
    if (exposureSqlModelId == null) {
      CompletableFuture<ApiResponse<ExperimentsExposureSQLModelV2DTO>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'exposureSqlModelId' when calling"
                  + " getExposureSQLModel"));
      return result;
    }
    List<String> include = parameters.include;
    // create path and map variables
    String localVarPath =
        "/api/v2/experiments/exposure-sql-models/{exposure_sql_model_id}"
            .replaceAll(
                "\\{" + "exposure_sql_model_id" + "\\}",
                apiClient.escapeString(exposureSqlModelId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "include", include));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ExperimentsApi.getExposureSQLModel",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ExperimentsExposureSQLModelV2DTO>> result =
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
        new GenericType<ExperimentsExposureSQLModelV2DTO>() {});
  }

  /** Manage optional parameters to getMetric. */
  public static class GetMetricOptionalParameters {
    private List<String> include;

    /**
     * Set include.
     *
     * @param include Optional fields to include. Repeat this parameter to request several fields.
     *     <code>counts</code> adds experiment_count: how many experiments currently reference this
     *     metric. (optional)
     * @return GetMetricOptionalParameters
     */
    public GetMetricOptionalParameters include(List<String> include) {
      this.include = include;
      return this;
    }
  }

  /**
   * Get metric.
   *
   * <p>See {@link #getMetricWithHttpInfo}.
   *
   * @param metricId The UUID of the metric. (required)
   * @return ExperimentsMetricV2DTO
   * @throws ApiException if fails to make API call
   */
  public ExperimentsMetricV2DTO getMetric(UUID metricId) throws ApiException {
    return getMetricWithHttpInfo(metricId, new GetMetricOptionalParameters()).getData();
  }

  /**
   * Get metric.
   *
   * <p>See {@link #getMetricWithHttpInfoAsync}.
   *
   * @param metricId The UUID of the metric. (required)
   * @return CompletableFuture&lt;ExperimentsMetricV2DTO&gt;
   */
  public CompletableFuture<ExperimentsMetricV2DTO> getMetricAsync(UUID metricId) {
    return getMetricWithHttpInfoAsync(metricId, new GetMetricOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get metric.
   *
   * <p>See {@link #getMetricWithHttpInfo}.
   *
   * @param metricId The UUID of the metric. (required)
   * @param parameters Optional parameters for the request.
   * @return ExperimentsMetricV2DTO
   * @throws ApiException if fails to make API call
   */
  public ExperimentsMetricV2DTO getMetric(UUID metricId, GetMetricOptionalParameters parameters)
      throws ApiException {
    return getMetricWithHttpInfo(metricId, parameters).getData();
  }

  /**
   * Get metric.
   *
   * <p>See {@link #getMetricWithHttpInfoAsync}.
   *
   * @param metricId The UUID of the metric. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ExperimentsMetricV2DTO&gt;
   */
  public CompletableFuture<ExperimentsMetricV2DTO> getMetricAsync(
      UUID metricId, GetMetricOptionalParameters parameters) {
    return getMetricWithHttpInfoAsync(metricId, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a metric. Returns a single experiment metric by its ID for the organization.
   *
   * @param metricId The UUID of the metric. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;ExperimentsMetricV2DTO&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Malformed metric ID (not a valid UUID). </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Missing or invalid authentication. </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authenticated caller lacks the product_analytics_metrics_read permission. </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> No metric with this ID exists for the organization. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ExperimentsMetricV2DTO> getMetricWithHttpInfo(
      UUID metricId, GetMetricOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'metricId' is set
    if (metricId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'metricId' when calling getMetric");
    }
    List<String> include = parameters.include;
    // create path and map variables
    String localVarPath =
        "/api/v2/experiments/metrics/{metric_id}"
            .replaceAll("\\{" + "metric_id" + "\\}", apiClient.escapeString(metricId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "include", include));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ExperimentsApi.getMetric",
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
        new GenericType<ExperimentsMetricV2DTO>() {});
  }

  /**
   * Get metric.
   *
   * <p>See {@link #getMetricWithHttpInfo}.
   *
   * @param metricId The UUID of the metric. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;ExperimentsMetricV2DTO&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ExperimentsMetricV2DTO>> getMetricWithHttpInfoAsync(
      UUID metricId, GetMetricOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'metricId' is set
    if (metricId == null) {
      CompletableFuture<ApiResponse<ExperimentsMetricV2DTO>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'metricId' when calling getMetric"));
      return result;
    }
    List<String> include = parameters.include;
    // create path and map variables
    String localVarPath =
        "/api/v2/experiments/metrics/{metric_id}"
            .replaceAll("\\{" + "metric_id" + "\\}", apiClient.escapeString(metricId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "include", include));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ExperimentsApi.getMetric",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ExperimentsMetricV2DTO>> result = new CompletableFuture<>();
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
        new GenericType<ExperimentsMetricV2DTO>() {});
  }

  /**
   * Get metric collection.
   *
   * <p>See {@link #getMetricCollectionWithHttpInfo}.
   *
   * @param metricCollectionId The UUID of the metric collection. (required)
   * @return ExperimentsMetricCollectionV2DTO
   * @throws ApiException if fails to make API call
   */
  public ExperimentsMetricCollectionV2DTO getMetricCollection(UUID metricCollectionId)
      throws ApiException {
    return getMetricCollectionWithHttpInfo(metricCollectionId).getData();
  }

  /**
   * Get metric collection.
   *
   * <p>See {@link #getMetricCollectionWithHttpInfoAsync}.
   *
   * @param metricCollectionId The UUID of the metric collection. (required)
   * @return CompletableFuture&lt;ExperimentsMetricCollectionV2DTO&gt;
   */
  public CompletableFuture<ExperimentsMetricCollectionV2DTO> getMetricCollectionAsync(
      UUID metricCollectionId) {
    return getMetricCollectionWithHttpInfoAsync(metricCollectionId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get metric collection.
   *
   * @param metricCollectionId The UUID of the metric collection. (required)
   * @return ApiResponse&lt;ExperimentsMetricCollectionV2DTO&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ExperimentsMetricCollectionV2DTO> getMetricCollectionWithHttpInfo(
      UUID metricCollectionId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'metricCollectionId' is set
    if (metricCollectionId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'metricCollectionId' when calling getMetricCollection");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/experiments/metric-collections/{metric_collection_id}"
            .replaceAll(
                "\\{" + "metric_collection_id" + "\\}",
                apiClient.escapeString(metricCollectionId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ExperimentsApi.getMetricCollection",
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
        new GenericType<ExperimentsMetricCollectionV2DTO>() {});
  }

  /**
   * Get metric collection.
   *
   * <p>See {@link #getMetricCollectionWithHttpInfo}.
   *
   * @param metricCollectionId The UUID of the metric collection. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ExperimentsMetricCollectionV2DTO&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ExperimentsMetricCollectionV2DTO>>
      getMetricCollectionWithHttpInfoAsync(UUID metricCollectionId) {
    Object localVarPostBody = null;

    // verify the required parameter 'metricCollectionId' is set
    if (metricCollectionId == null) {
      CompletableFuture<ApiResponse<ExperimentsMetricCollectionV2DTO>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'metricCollectionId' when calling"
                  + " getMetricCollection"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/experiments/metric-collections/{metric_collection_id}"
            .replaceAll(
                "\\{" + "metric_collection_id" + "\\}",
                apiClient.escapeString(metricCollectionId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ExperimentsApi.getMetricCollection",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ExperimentsMetricCollectionV2DTO>> result =
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
        new GenericType<ExperimentsMetricCollectionV2DTO>() {});
  }

  /** Manage optional parameters to getMetricSQLModel. */
  public static class GetMetricSQLModelOptionalParameters {
    private List<String> include;

    /**
     * Set include.
     *
     * @param include Optional fields to include. Repeat this parameter to request several fields.
     *     <code>counts</code> adds metric_count and experiment_count. (optional)
     * @return GetMetricSQLModelOptionalParameters
     */
    public GetMetricSQLModelOptionalParameters include(List<String> include) {
      this.include = include;
      return this;
    }
  }

  /**
   * Get metric SQL model.
   *
   * <p>See {@link #getMetricSQLModelWithHttpInfo}.
   *
   * @param metricSqlModelId The UUID of the metric SQL model. (required)
   * @return ExperimentsMetricSQLModelV2DTO
   * @throws ApiException if fails to make API call
   */
  public ExperimentsMetricSQLModelV2DTO getMetricSQLModel(UUID metricSqlModelId)
      throws ApiException {
    return getMetricSQLModelWithHttpInfo(
            metricSqlModelId, new GetMetricSQLModelOptionalParameters())
        .getData();
  }

  /**
   * Get metric SQL model.
   *
   * <p>See {@link #getMetricSQLModelWithHttpInfoAsync}.
   *
   * @param metricSqlModelId The UUID of the metric SQL model. (required)
   * @return CompletableFuture&lt;ExperimentsMetricSQLModelV2DTO&gt;
   */
  public CompletableFuture<ExperimentsMetricSQLModelV2DTO> getMetricSQLModelAsync(
      UUID metricSqlModelId) {
    return getMetricSQLModelWithHttpInfoAsync(
            metricSqlModelId, new GetMetricSQLModelOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get metric SQL model.
   *
   * <p>See {@link #getMetricSQLModelWithHttpInfo}.
   *
   * @param metricSqlModelId The UUID of the metric SQL model. (required)
   * @param parameters Optional parameters for the request.
   * @return ExperimentsMetricSQLModelV2DTO
   * @throws ApiException if fails to make API call
   */
  public ExperimentsMetricSQLModelV2DTO getMetricSQLModel(
      UUID metricSqlModelId, GetMetricSQLModelOptionalParameters parameters) throws ApiException {
    return getMetricSQLModelWithHttpInfo(metricSqlModelId, parameters).getData();
  }

  /**
   * Get metric SQL model.
   *
   * <p>See {@link #getMetricSQLModelWithHttpInfoAsync}.
   *
   * @param metricSqlModelId The UUID of the metric SQL model. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ExperimentsMetricSQLModelV2DTO&gt;
   */
  public CompletableFuture<ExperimentsMetricSQLModelV2DTO> getMetricSQLModelAsync(
      UUID metricSqlModelId, GetMetricSQLModelOptionalParameters parameters) {
    return getMetricSQLModelWithHttpInfoAsync(metricSqlModelId, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a metric SQL model. Returns a single model by its ID for the organization, including its
   * subject types, measures and properties.
   *
   * @param metricSqlModelId The UUID of the metric SQL model. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;ExperimentsMetricSQLModelV2DTO&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Malformed metric SQL model ID (not a valid UUID), or unknown include value. </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Missing or invalid authentication. </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authenticated caller lacks the product_analytics_metrics_read permission. </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> No metric SQL model with this ID exists for the organization. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ExperimentsMetricSQLModelV2DTO> getMetricSQLModelWithHttpInfo(
      UUID metricSqlModelId, GetMetricSQLModelOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'metricSqlModelId' is set
    if (metricSqlModelId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'metricSqlModelId' when calling getMetricSQLModel");
    }
    List<String> include = parameters.include;
    // create path and map variables
    String localVarPath =
        "/api/v2/experiments/metric-sql-models/{metric_sql_model_id}"
            .replaceAll(
                "\\{" + "metric_sql_model_id" + "\\}",
                apiClient.escapeString(metricSqlModelId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "include", include));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ExperimentsApi.getMetricSQLModel",
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
        new GenericType<ExperimentsMetricSQLModelV2DTO>() {});
  }

  /**
   * Get metric SQL model.
   *
   * <p>See {@link #getMetricSQLModelWithHttpInfo}.
   *
   * @param metricSqlModelId The UUID of the metric SQL model. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;ExperimentsMetricSQLModelV2DTO&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ExperimentsMetricSQLModelV2DTO>>
      getMetricSQLModelWithHttpInfoAsync(
          UUID metricSqlModelId, GetMetricSQLModelOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'metricSqlModelId' is set
    if (metricSqlModelId == null) {
      CompletableFuture<ApiResponse<ExperimentsMetricSQLModelV2DTO>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'metricSqlModelId' when calling getMetricSQLModel"));
      return result;
    }
    List<String> include = parameters.include;
    // create path and map variables
    String localVarPath =
        "/api/v2/experiments/metric-sql-models/{metric_sql_model_id}"
            .replaceAll(
                "\\{" + "metric_sql_model_id" + "\\}",
                apiClient.escapeString(metricSqlModelId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "include", include));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ExperimentsApi.getMetricSQLModel",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ExperimentsMetricSQLModelV2DTO>> result =
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
        new GenericType<ExperimentsMetricSQLModelV2DTO>() {});
  }

  /** Manage optional parameters to getSubjectType. */
  public static class GetSubjectTypeOptionalParameters {
    private String include;

    /**
     * Set include.
     *
     * @param include Set to <code>counts</code> to add experiment_count, exposure_source_count,
     *     metric_sql_model_count and protocol_count. (optional)
     * @return GetSubjectTypeOptionalParameters
     */
    public GetSubjectTypeOptionalParameters include(String include) {
      this.include = include;
      return this;
    }
  }

  /**
   * Get subject type.
   *
   * <p>See {@link #getSubjectTypeWithHttpInfo}.
   *
   * @param subjectTypeId The UUID of the subject type. (required)
   * @return ExperimentsSubjectTypeV2DTO
   * @throws ApiException if fails to make API call
   */
  public ExperimentsSubjectTypeV2DTO getSubjectType(UUID subjectTypeId) throws ApiException {
    return getSubjectTypeWithHttpInfo(subjectTypeId, new GetSubjectTypeOptionalParameters())
        .getData();
  }

  /**
   * Get subject type.
   *
   * <p>See {@link #getSubjectTypeWithHttpInfoAsync}.
   *
   * @param subjectTypeId The UUID of the subject type. (required)
   * @return CompletableFuture&lt;ExperimentsSubjectTypeV2DTO&gt;
   */
  public CompletableFuture<ExperimentsSubjectTypeV2DTO> getSubjectTypeAsync(UUID subjectTypeId) {
    return getSubjectTypeWithHttpInfoAsync(subjectTypeId, new GetSubjectTypeOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get subject type.
   *
   * <p>See {@link #getSubjectTypeWithHttpInfo}.
   *
   * @param subjectTypeId The UUID of the subject type. (required)
   * @param parameters Optional parameters for the request.
   * @return ExperimentsSubjectTypeV2DTO
   * @throws ApiException if fails to make API call
   */
  public ExperimentsSubjectTypeV2DTO getSubjectType(
      UUID subjectTypeId, GetSubjectTypeOptionalParameters parameters) throws ApiException {
    return getSubjectTypeWithHttpInfo(subjectTypeId, parameters).getData();
  }

  /**
   * Get subject type.
   *
   * <p>See {@link #getSubjectTypeWithHttpInfoAsync}.
   *
   * @param subjectTypeId The UUID of the subject type. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ExperimentsSubjectTypeV2DTO&gt;
   */
  public CompletableFuture<ExperimentsSubjectTypeV2DTO> getSubjectTypeAsync(
      UUID subjectTypeId, GetSubjectTypeOptionalParameters parameters) {
    return getSubjectTypeWithHttpInfoAsync(subjectTypeId, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a subject type. Returns a single subject type by its ID for the organization.
   *
   * @param subjectTypeId The UUID of the subject type. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;ExperimentsSubjectTypeV2DTO&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Malformed subject type ID (not a valid UUID), or an unsupported include value. </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Missing or invalid authentication. </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authenticated caller lacks the product_analytics_settings_read permission. </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> No subject type with this ID exists for the organization. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ExperimentsSubjectTypeV2DTO> getSubjectTypeWithHttpInfo(
      UUID subjectTypeId, GetSubjectTypeOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'subjectTypeId' is set
    if (subjectTypeId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'subjectTypeId' when calling getSubjectType");
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath =
        "/api/v2/experiments/subject-types/{subject_type_id}"
            .replaceAll(
                "\\{" + "subject_type_id" + "\\}",
                apiClient.escapeString(subjectTypeId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ExperimentsApi.getSubjectType",
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
        new GenericType<ExperimentsSubjectTypeV2DTO>() {});
  }

  /**
   * Get subject type.
   *
   * <p>See {@link #getSubjectTypeWithHttpInfo}.
   *
   * @param subjectTypeId The UUID of the subject type. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;ExperimentsSubjectTypeV2DTO&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ExperimentsSubjectTypeV2DTO>>
      getSubjectTypeWithHttpInfoAsync(
          UUID subjectTypeId, GetSubjectTypeOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'subjectTypeId' is set
    if (subjectTypeId == null) {
      CompletableFuture<ApiResponse<ExperimentsSubjectTypeV2DTO>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'subjectTypeId' when calling getSubjectType"));
      return result;
    }
    String include = parameters.include;
    // create path and map variables
    String localVarPath =
        "/api/v2/experiments/subject-types/{subject_type_id}"
            .replaceAll(
                "\\{" + "subject_type_id" + "\\}",
                apiClient.escapeString(subjectTypeId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ExperimentsApi.getSubjectType",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ExperimentsSubjectTypeV2DTO>> result =
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
        new GenericType<ExperimentsSubjectTypeV2DTO>() {});
  }

  /**
   * List experiment metric groups.
   *
   * <p>See {@link #listExperimentMetricGroupsWithHttpInfo}.
   *
   * @param experimentId The UUID of the experiment. (required)
   * @return ExperimentsExperimentMetricGroupV2DTOArray
   * @throws ApiException if fails to make API call
   */
  public ExperimentsExperimentMetricGroupV2DTOArray listExperimentMetricGroups(UUID experimentId)
      throws ApiException {
    return listExperimentMetricGroupsWithHttpInfo(experimentId).getData();
  }

  /**
   * List experiment metric groups.
   *
   * <p>See {@link #listExperimentMetricGroupsWithHttpInfoAsync}.
   *
   * @param experimentId The UUID of the experiment. (required)
   * @return CompletableFuture&lt;ExperimentsExperimentMetricGroupV2DTOArray&gt;
   */
  public CompletableFuture<ExperimentsExperimentMetricGroupV2DTOArray>
      listExperimentMetricGroupsAsync(UUID experimentId) {
    return listExperimentMetricGroupsWithHttpInfoAsync(experimentId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List every decision and non-decision metric group attached to an experiment. Metric references
   * are returned in their stored order. An incomplete draft can have no decision group and returns
   * only the groups that exist.
   *
   * @param experimentId The UUID of the experiment. (required)
   * @return ApiResponse&lt;ExperimentsExperimentMetricGroupV2DTOArray&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Malformed experiment ID. </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Missing or invalid authentication. </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> The caller lacks the experiments read permission. </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> No experiment with this ID exists for the organization. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ExperimentsExperimentMetricGroupV2DTOArray>
      listExperimentMetricGroupsWithHttpInfo(UUID experimentId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'experimentId' is set
    if (experimentId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'experimentId' when calling listExperimentMetricGroups");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/experiments/{experiment_id}/metric-groups"
            .replaceAll(
                "\\{" + "experiment_id" + "\\}", apiClient.escapeString(experimentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ExperimentsApi.listExperimentMetricGroups",
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
        new GenericType<ExperimentsExperimentMetricGroupV2DTOArray>() {});
  }

  /**
   * List experiment metric groups.
   *
   * <p>See {@link #listExperimentMetricGroupsWithHttpInfo}.
   *
   * @param experimentId The UUID of the experiment. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ExperimentsExperimentMetricGroupV2DTOArray&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ExperimentsExperimentMetricGroupV2DTOArray>>
      listExperimentMetricGroupsWithHttpInfoAsync(UUID experimentId) {
    Object localVarPostBody = null;

    // verify the required parameter 'experimentId' is set
    if (experimentId == null) {
      CompletableFuture<ApiResponse<ExperimentsExperimentMetricGroupV2DTOArray>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'experimentId' when calling"
                  + " listExperimentMetricGroups"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/experiments/{experiment_id}/metric-groups"
            .replaceAll(
                "\\{" + "experiment_id" + "\\}", apiClient.escapeString(experimentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ExperimentsApi.listExperimentMetricGroups",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ExperimentsExperimentMetricGroupV2DTOArray>> result =
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
        new GenericType<ExperimentsExperimentMetricGroupV2DTOArray>() {});
  }

  /** Manage optional parameters to listExperimentProtocols. */
  public static class ListExperimentProtocolsOptionalParameters {
    private List<ExperimentsPublicProtocolResponseDataAttributesStatus> filterStatus;
    private UUID filterPrimaryMetricId;
    private String filterQuery;
    private UUID filterSubjectTypeId;
    private Long pageLimit;
    private Long pageOffset;
    private String sort;

    /**
     * Set filterStatus.
     *
     * @param filterStatus Filter by protocol status. Repeat this parameter to select more than one
     *     status. (optional)
     * @return ListExperimentProtocolsOptionalParameters
     */
    public ListExperimentProtocolsOptionalParameters filterStatus(
        List<ExperimentsPublicProtocolResponseDataAttributesStatus> filterStatus) {
      this.filterStatus = filterStatus;
      return this;
    }

    /**
     * Set filterPrimaryMetricId.
     *
     * @param filterPrimaryMetricId Filter by the UUID of the primary metric in the protocol
     *     template. (optional)
     * @return ListExperimentProtocolsOptionalParameters
     */
    public ListExperimentProtocolsOptionalParameters filterPrimaryMetricId(
        UUID filterPrimaryMetricId) {
      this.filterPrimaryMetricId = filterPrimaryMetricId;
      return this;
    }

    /**
     * Set filterQuery.
     *
     * @param filterQuery Find protocols whose names contain the search text, regardless of case.
     *     Leading and trailing spaces are ignored. Blank values apply no filter. The maximum length
     *     is 1024 UTF-8 bytes. (optional)
     * @return ListExperimentProtocolsOptionalParameters
     */
    public ListExperimentProtocolsOptionalParameters filterQuery(String filterQuery) {
      this.filterQuery = filterQuery;
      return this;
    }

    /**
     * Set filterSubjectTypeId.
     *
     * @param filterSubjectTypeId Filter by the UUID of the subject type in the protocol template.
     *     (optional)
     * @return ListExperimentProtocolsOptionalParameters
     */
    public ListExperimentProtocolsOptionalParameters filterSubjectTypeId(UUID filterSubjectTypeId) {
      this.filterSubjectTypeId = filterSubjectTypeId;
      return this;
    }

    /**
     * Set pageLimit.
     *
     * @param pageLimit Number of results per page. The default is 25. Values above 50 are reduced
     *     to 50. (optional)
     * @return ListExperimentProtocolsOptionalParameters
     */
    public ListExperimentProtocolsOptionalParameters pageLimit(Long pageLimit) {
      this.pageLimit = pageLimit;
      return this;
    }

    /**
     * Set pageOffset.
     *
     * @param pageOffset Number of results to skip before returning this page. (optional)
     * @return ListExperimentProtocolsOptionalParameters
     */
    public ListExperimentProtocolsOptionalParameters pageOffset(Long pageOffset) {
      this.pageOffset = pageOffset;
      return this;
    }

    /**
     * Set sort.
     *
     * @param sort Sort by <code>name</code>, <code>subject_type_name</code>, <code>
     *     primary_metric_name</code>, or <code>updated_at</code>. Prefix with <code>-</code> for
     *     descending order. The default is <code>-updated_at</code>. (optional)
     * @return ListExperimentProtocolsOptionalParameters
     */
    public ListExperimentProtocolsOptionalParameters sort(String sort) {
      this.sort = sort;
      return this;
    }
  }

  /**
   * List experiment protocols.
   *
   * <p>See {@link #listExperimentProtocolsWithHttpInfo}.
   *
   * @return ExperimentsPublicProtocolListResponseArray
   * @throws ApiException if fails to make API call
   */
  public ExperimentsPublicProtocolListResponseArray listExperimentProtocols() throws ApiException {
    return listExperimentProtocolsWithHttpInfo(new ListExperimentProtocolsOptionalParameters())
        .getData();
  }

  /**
   * List experiment protocols.
   *
   * <p>See {@link #listExperimentProtocolsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;ExperimentsPublicProtocolListResponseArray&gt;
   */
  public CompletableFuture<ExperimentsPublicProtocolListResponseArray>
      listExperimentProtocolsAsync() {
    return listExperimentProtocolsWithHttpInfoAsync(new ListExperimentProtocolsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List experiment protocols.
   *
   * <p>See {@link #listExperimentProtocolsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return ExperimentsPublicProtocolListResponseArray
   * @throws ApiException if fails to make API call
   */
  public ExperimentsPublicProtocolListResponseArray listExperimentProtocols(
      ListExperimentProtocolsOptionalParameters parameters) throws ApiException {
    return listExperimentProtocolsWithHttpInfo(parameters).getData();
  }

  /**
   * List experiment protocols.
   *
   * <p>See {@link #listExperimentProtocolsWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ExperimentsPublicProtocolListResponseArray&gt;
   */
  public CompletableFuture<ExperimentsPublicProtocolListResponseArray> listExperimentProtocolsAsync(
      ListExperimentProtocolsOptionalParameters parameters) {
    return listExperimentProtocolsWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List draft, published, and archived experiment protocols. Omit filter[status] to return all
   * statuses. Only published protocols can be used to create experiments.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;ExperimentsPublicProtocolListResponseArray&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ExperimentsPublicProtocolListResponseArray>
      listExperimentProtocolsWithHttpInfo(ListExperimentProtocolsOptionalParameters parameters)
          throws ApiException {
    Object localVarPostBody = null;
    List<ExperimentsPublicProtocolResponseDataAttributesStatus> filterStatus =
        parameters.filterStatus;
    UUID filterPrimaryMetricId = parameters.filterPrimaryMetricId;
    String filterQuery = parameters.filterQuery;
    UUID filterSubjectTypeId = parameters.filterSubjectTypeId;
    Long pageLimit = parameters.pageLimit;
    Long pageOffset = parameters.pageOffset;
    String sort = parameters.sort;
    // create path and map variables
    String localVarPath = "/api/v2/experiments/protocols";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[status]", filterStatus));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[primary_metric_id]", filterPrimaryMetricId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[query]", filterQuery));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[subject_type_id]", filterSubjectTypeId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[offset]", pageOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ExperimentsApi.listExperimentProtocols",
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
        new GenericType<ExperimentsPublicProtocolListResponseArray>() {});
  }

  /**
   * List experiment protocols.
   *
   * <p>See {@link #listExperimentProtocolsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;ExperimentsPublicProtocolListResponseArray&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ExperimentsPublicProtocolListResponseArray>>
      listExperimentProtocolsWithHttpInfoAsync(
          ListExperimentProtocolsOptionalParameters parameters) {
    Object localVarPostBody = null;
    List<ExperimentsPublicProtocolResponseDataAttributesStatus> filterStatus =
        parameters.filterStatus;
    UUID filterPrimaryMetricId = parameters.filterPrimaryMetricId;
    String filterQuery = parameters.filterQuery;
    UUID filterSubjectTypeId = parameters.filterSubjectTypeId;
    Long pageLimit = parameters.pageLimit;
    Long pageOffset = parameters.pageOffset;
    String sort = parameters.sort;
    // create path and map variables
    String localVarPath = "/api/v2/experiments/protocols";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[status]", filterStatus));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[primary_metric_id]", filterPrimaryMetricId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[query]", filterQuery));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "filter[subject_type_id]", filterSubjectTypeId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[offset]", pageOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ExperimentsApi.listExperimentProtocols",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ExperimentsPublicProtocolListResponseArray>> result =
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
        new GenericType<ExperimentsPublicProtocolListResponseArray>() {});
  }

  /** Manage optional parameters to listExperiments. */
  public static class ListExperimentsOptionalParameters {
    private OffsetDateTime concludedSince;
    private OffsetDateTime createdSince;
    private Long pageLimit;
    private Long pageOffset;
    private List<UUID> protocolId;
    private OffsetDateTime resultsUpdatedBefore;
    private OffsetDateTime resultsUpdatedSince;
    private String search;
    private String sort;
    private List<String> status;
    private List<String> tags;

    /**
     * Set concludedSince.
     *
     * @param concludedSince Return only experiments concluded at or after this RFC3339 timestamp.
     *     Inclusive, and excludes experiments that have not concluded. (optional)
     * @return ListExperimentsOptionalParameters
     */
    public ListExperimentsOptionalParameters concludedSince(OffsetDateTime concludedSince) {
      this.concludedSince = concludedSince;
      return this;
    }

    /**
     * Set createdSince.
     *
     * @param createdSince Return only experiments created at or after this RFC3339 timestamp.
     *     Inclusive. (optional)
     * @return ListExperimentsOptionalParameters
     */
    public ListExperimentsOptionalParameters createdSince(OffsetDateTime createdSince) {
      this.createdSince = createdSince;
      return this;
    }

    /**
     * Set pageLimit.
     *
     * @param pageLimit Maximum number of results to return. Defaults to 25 when omitted, and is
     *     capped at 50 (larger values are clamped to 50). The response includes meta.page (with
     *     total) and pagination links. (optional)
     * @return ListExperimentsOptionalParameters
     */
    public ListExperimentsOptionalParameters pageLimit(Long pageLimit) {
      this.pageLimit = pageLimit;
      return this;
    }

    /**
     * Set pageOffset.
     *
     * @param pageOffset Number of results to skip for pagination. Defaults to 0 when omitted.
     *     (optional)
     * @return ListExperimentsOptionalParameters
     */
    public ListExperimentsOptionalParameters pageOffset(Long pageOffset) {
      this.pageOffset = pageOffset;
      return this;
    }

    /**
     * Set protocolId.
     *
     * @param protocolId Filter by protocol UUID. Repeat this parameter to supply several IDs. An
     *     experiment matches if it uses any listed protocol. (optional)
     * @return ListExperimentsOptionalParameters
     */
    public ListExperimentsOptionalParameters protocolId(List<UUID> protocolId) {
      this.protocolId = protocolId;
      return this;
    }

    /**
     * Set resultsUpdatedBefore.
     *
     * @param resultsUpdatedBefore Return only experiments whose results_last_updated is before this
     *     RFC3339 timestamp. results_last_updated is the later of the latest successful run
     *     completion and the latest stored result refresh. Exclusive, and excludes experiments
     *     without successful results. (optional)
     * @return ListExperimentsOptionalParameters
     */
    public ListExperimentsOptionalParameters resultsUpdatedBefore(
        OffsetDateTime resultsUpdatedBefore) {
      this.resultsUpdatedBefore = resultsUpdatedBefore;
      return this;
    }

    /**
     * Set resultsUpdatedSince.
     *
     * @param resultsUpdatedSince Return only experiments whose results_last_updated is at or after
     *     this RFC3339 timestamp. results_last_updated is the later of the latest successful run
     *     completion and the latest stored result refresh. Inclusive, and excludes experiments
     *     without successful results. This filter does not include all metadata edits or deletions.
     *     (optional)
     * @return ListExperimentsOptionalParameters
     */
    public ListExperimentsOptionalParameters resultsUpdatedSince(
        OffsetDateTime resultsUpdatedSince) {
      this.resultsUpdatedSince = resultsUpdatedSince;
      return this;
    }

    /**
     * Set search.
     *
     * @param search Find experiments whose names contain the search text, regardless of case.
     *     (optional)
     * @return ListExperimentsOptionalParameters
     */
    public ListExperimentsOptionalParameters search(String search) {
      this.search = search;
      return this;
    }

    /**
     * Set sort.
     *
     * @param sort Sort fields: name, created_at, or updated_at. Use a comma-separated list in
     *     priority order, for example name,-created_at. Prefix each field with <code>-</code> for
     *     descending. Defaults to created_at descending. (optional)
     * @return ListExperimentsOptionalParameters
     */
    public ListExperimentsOptionalParameters sort(String sort) {
      this.sort = sort;
      return this;
    }

    /**
     * Set status.
     *
     * @param status Filter by experiment status. Accepted values are DRAFT, SCHEDULED, IN_PROGRESS,
     *     READY_FOR_DECISION, DECISION_MADE, and CANCELLED. Repeat this parameter to select several
     *     statuses, for example <code>status=IN_PROGRESS&amp;status=READY_FOR_DECISION</code>.
     *     (optional)
     * @return ListExperimentsOptionalParameters
     */
    public ListExperimentsOptionalParameters status(List<String> status) {
      this.status = status;
      return this;
    }

    /**
     * Set tags.
     *
     * @param tags Filter by tag name. Repeat this parameter to supply several tags. An experiment
     *     matches if it has at least one listed tag. (optional)
     * @return ListExperimentsOptionalParameters
     */
    public ListExperimentsOptionalParameters tags(List<String> tags) {
      this.tags = tags;
      return this;
    }
  }

  /**
   * List experiments.
   *
   * <p>See {@link #listExperimentsWithHttpInfo}.
   *
   * @return ExperimentsExperimentV2ListDTOArray
   * @throws ApiException if fails to make API call
   */
  public ExperimentsExperimentV2ListDTOArray listExperiments() throws ApiException {
    return listExperimentsWithHttpInfo(new ListExperimentsOptionalParameters()).getData();
  }

  /**
   * List experiments.
   *
   * <p>See {@link #listExperimentsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;ExperimentsExperimentV2ListDTOArray&gt;
   */
  public CompletableFuture<ExperimentsExperimentV2ListDTOArray> listExperimentsAsync() {
    return listExperimentsWithHttpInfoAsync(new ListExperimentsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List experiments.
   *
   * <p>See {@link #listExperimentsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return ExperimentsExperimentV2ListDTOArray
   * @throws ApiException if fails to make API call
   */
  public ExperimentsExperimentV2ListDTOArray listExperiments(
      ListExperimentsOptionalParameters parameters) throws ApiException {
    return listExperimentsWithHttpInfo(parameters).getData();
  }

  /**
   * List experiments.
   *
   * <p>See {@link #listExperimentsWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ExperimentsExperimentV2ListDTOArray&gt;
   */
  public CompletableFuture<ExperimentsExperimentV2ListDTOArray> listExperimentsAsync(
      ListExperimentsOptionalParameters parameters) {
    return listExperimentsWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List experiments. Returns a paginated list of experiments and their structured metadata for the
   * organization. Supports filtering and pagination. Use Get experiment for variants, decision
   * metrics, traffic exposure, and assignment configuration.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;ExperimentsExperimentV2ListDTOArray&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Invalid query parameter: bad page[offset]/page[limit], unknown sort field, invalid status, malformed protocol_id UUID, invalid result timestamp range, or a timestamp filter that is not RFC3339. </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Missing or invalid authentication (dd-api-key + dd-application-key headers, or a valid user session). </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authenticated caller lacks the product_analytics_experiments_read permission. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ExperimentsExperimentV2ListDTOArray> listExperimentsWithHttpInfo(
      ListExperimentsOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    OffsetDateTime concludedSince = parameters.concludedSince;
    OffsetDateTime createdSince = parameters.createdSince;
    Long pageLimit = parameters.pageLimit;
    Long pageOffset = parameters.pageOffset;
    List<UUID> protocolId = parameters.protocolId;
    OffsetDateTime resultsUpdatedBefore = parameters.resultsUpdatedBefore;
    OffsetDateTime resultsUpdatedSince = parameters.resultsUpdatedSince;
    String search = parameters.search;
    String sort = parameters.sort;
    List<String> status = parameters.status;
    List<String> tags = parameters.tags;
    // create path and map variables
    String localVarPath = "/api/v2/experiments";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "concluded_since", concludedSince));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "created_since", createdSince));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[offset]", pageOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "protocol_id", protocolId));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "results_updated_before", resultsUpdatedBefore));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "results_updated_since", resultsUpdatedSince));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "search", search));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "status", status));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "tags", tags));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ExperimentsApi.listExperiments",
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
        new GenericType<ExperimentsExperimentV2ListDTOArray>() {});
  }

  /**
   * List experiments.
   *
   * <p>See {@link #listExperimentsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;ExperimentsExperimentV2ListDTOArray&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ExperimentsExperimentV2ListDTOArray>>
      listExperimentsWithHttpInfoAsync(ListExperimentsOptionalParameters parameters) {
    Object localVarPostBody = null;
    OffsetDateTime concludedSince = parameters.concludedSince;
    OffsetDateTime createdSince = parameters.createdSince;
    Long pageLimit = parameters.pageLimit;
    Long pageOffset = parameters.pageOffset;
    List<UUID> protocolId = parameters.protocolId;
    OffsetDateTime resultsUpdatedBefore = parameters.resultsUpdatedBefore;
    OffsetDateTime resultsUpdatedSince = parameters.resultsUpdatedSince;
    String search = parameters.search;
    String sort = parameters.sort;
    List<String> status = parameters.status;
    List<String> tags = parameters.tags;
    // create path and map variables
    String localVarPath = "/api/v2/experiments";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "concluded_since", concludedSince));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "created_since", createdSince));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[offset]", pageOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "protocol_id", protocolId));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "results_updated_before", resultsUpdatedBefore));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "results_updated_since", resultsUpdatedSince));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "search", search));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "status", status));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "tags", tags));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ExperimentsApi.listExperiments",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ExperimentsExperimentV2ListDTOArray>> result =
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
        new GenericType<ExperimentsExperimentV2ListDTOArray>() {});
  }

  /** Manage optional parameters to listExposureSQLModels. */
  public static class ListExposureSQLModelsOptionalParameters {
    private List<String> include;
    private Boolean includeArchived;
    private Long pageLimit;
    private Long pageOffset;
    private String search;
    private String sort;

    /**
     * Set include.
     *
     * @param include Optional fields to include. Repeat this parameter to request several fields.
     *     <code>counts</code> adds experiment_count, which costs an extra aggregate query.
     *     (optional)
     * @return ListExposureSQLModelsOptionalParameters
     */
    public ListExposureSQLModelsOptionalParameters include(List<String> include) {
      this.include = include;
      return this;
    }

    /**
     * Set includeArchived.
     *
     * @param includeArchived When true, archived models are included in the result. Defaults to
     *     false, so archived models are hidden. (optional)
     * @return ListExposureSQLModelsOptionalParameters
     */
    public ListExposureSQLModelsOptionalParameters includeArchived(Boolean includeArchived) {
      this.includeArchived = includeArchived;
      return this;
    }

    /**
     * Set pageLimit.
     *
     * @param pageLimit Maximum number of results to return. Defaults to 25 when omitted, and is
     *     capped at 50 (larger values are clamped to 50). The response includes meta.page (with
     *     total) and pagination links. (optional)
     * @return ListExposureSQLModelsOptionalParameters
     */
    public ListExposureSQLModelsOptionalParameters pageLimit(Long pageLimit) {
      this.pageLimit = pageLimit;
      return this;
    }

    /**
     * Set pageOffset.
     *
     * @param pageOffset Number of results to skip for pagination. Defaults to 0 when omitted.
     *     (optional)
     * @return ListExposureSQLModelsOptionalParameters
     */
    public ListExposureSQLModelsOptionalParameters pageOffset(Long pageOffset) {
      this.pageOffset = pageOffset;
      return this;
    }

    /**
     * Set search.
     *
     * @param search Find exposure SQL models whose names contain the search text, regardless of
     *     case. (optional)
     * @return ListExposureSQLModelsOptionalParameters
     */
    public ListExposureSQLModelsOptionalParameters search(String search) {
      this.search = search;
      return this;
    }

    /**
     * Set sort.
     *
     * @param sort Sort field: name, created_at, or updated_at. Prefix with <code>-</code> for
     *     descending (for example, <code>-created_at</code>). Defaults to created_at descending.
     *     (optional)
     * @return ListExposureSQLModelsOptionalParameters
     */
    public ListExposureSQLModelsOptionalParameters sort(String sort) {
      this.sort = sort;
      return this;
    }
  }

  /**
   * List exposure SQL models.
   *
   * <p>See {@link #listExposureSQLModelsWithHttpInfo}.
   *
   * @return ExperimentsExposureSQLModelV2DTOArray
   * @throws ApiException if fails to make API call
   */
  public ExperimentsExposureSQLModelV2DTOArray listExposureSQLModels() throws ApiException {
    return listExposureSQLModelsWithHttpInfo(new ListExposureSQLModelsOptionalParameters())
        .getData();
  }

  /**
   * List exposure SQL models.
   *
   * <p>See {@link #listExposureSQLModelsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;ExperimentsExposureSQLModelV2DTOArray&gt;
   */
  public CompletableFuture<ExperimentsExposureSQLModelV2DTOArray> listExposureSQLModelsAsync() {
    return listExposureSQLModelsWithHttpInfoAsync(new ListExposureSQLModelsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List exposure SQL models.
   *
   * <p>See {@link #listExposureSQLModelsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return ExperimentsExposureSQLModelV2DTOArray
   * @throws ApiException if fails to make API call
   */
  public ExperimentsExposureSQLModelV2DTOArray listExposureSQLModels(
      ListExposureSQLModelsOptionalParameters parameters) throws ApiException {
    return listExposureSQLModelsWithHttpInfo(parameters).getData();
  }

  /**
   * List exposure SQL models.
   *
   * <p>See {@link #listExposureSQLModelsWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ExperimentsExposureSQLModelV2DTOArray&gt;
   */
  public CompletableFuture<ExperimentsExposureSQLModelV2DTOArray> listExposureSQLModelsAsync(
      ListExposureSQLModelsOptionalParameters parameters) {
    return listExposureSQLModelsWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List exposure SQL models. Returns a paginated list of the SQL models that experiment exposures
   * are read from for the organization. Models maintained by Datadog are not included: they cannot
   * be modified and cannot be used as an experiment's assignment source.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;ExperimentsExposureSQLModelV2DTOArray&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Invalid query parameter: bad page[offset]/page[limit], search longer than 1024 bytes, unknown sort field, non-boolean include_archived, or unknown include value. </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Missing or invalid authentication (dd-api-key + dd-application-key headers, or a valid user session). </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authenticated caller lacks the product_analytics_metrics_read permission. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ExperimentsExposureSQLModelV2DTOArray> listExposureSQLModelsWithHttpInfo(
      ListExposureSQLModelsOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    List<String> include = parameters.include;
    Boolean includeArchived = parameters.includeArchived;
    Long pageLimit = parameters.pageLimit;
    Long pageOffset = parameters.pageOffset;
    String search = parameters.search;
    String sort = parameters.sort;
    // create path and map variables
    String localVarPath = "/api/v2/experiments/exposure-sql-models";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include_archived", includeArchived));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[offset]", pageOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "search", search));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ExperimentsApi.listExposureSQLModels",
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
        new GenericType<ExperimentsExposureSQLModelV2DTOArray>() {});
  }

  /**
   * List exposure SQL models.
   *
   * <p>See {@link #listExposureSQLModelsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;ExperimentsExposureSQLModelV2DTOArray&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ExperimentsExposureSQLModelV2DTOArray>>
      listExposureSQLModelsWithHttpInfoAsync(ListExposureSQLModelsOptionalParameters parameters) {
    Object localVarPostBody = null;
    List<String> include = parameters.include;
    Boolean includeArchived = parameters.includeArchived;
    Long pageLimit = parameters.pageLimit;
    Long pageOffset = parameters.pageOffset;
    String search = parameters.search;
    String sort = parameters.sort;
    // create path and map variables
    String localVarPath = "/api/v2/experiments/exposure-sql-models";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include_archived", includeArchived));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[offset]", pageOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "search", search));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ExperimentsApi.listExposureSQLModels",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ExperimentsExposureSQLModelV2DTOArray>> result =
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
        new GenericType<ExperimentsExposureSQLModelV2DTOArray>() {});
  }

  /** Manage optional parameters to listMetricCollections. */
  public static class ListMetricCollectionsOptionalParameters {
    private List<String> include;
    private Long pageLimit;
    private Long pageOffset;
    private String search;
    private String sort;

    /**
     * Set include.
     *
     * @param include Optional fields to include. Repeat this parameter to request several fields.
     *     <code>counts</code> adds metric_count. (optional)
     * @return ListMetricCollectionsOptionalParameters
     */
    public ListMetricCollectionsOptionalParameters include(List<String> include) {
      this.include = include;
      return this;
    }

    /**
     * Set pageLimit.
     *
     * @param pageLimit Number of results per page. The default is 25. Values above 50 are reduced
     *     to 50. (optional)
     * @return ListMetricCollectionsOptionalParameters
     */
    public ListMetricCollectionsOptionalParameters pageLimit(Long pageLimit) {
      this.pageLimit = pageLimit;
      return this;
    }

    /**
     * Set pageOffset.
     *
     * @param pageOffset Number of results to skip before returning this page. (optional)
     * @return ListMetricCollectionsOptionalParameters
     */
    public ListMetricCollectionsOptionalParameters pageOffset(Long pageOffset) {
      this.pageOffset = pageOffset;
      return this;
    }

    /**
     * Set search.
     *
     * @param search Find collections whose names contain the search text, regardless of case.
     *     Leading and trailing spaces are ignored. Blank values apply no filter. The maximum length
     *     is 1024 UTF-8 bytes. (optional)
     * @return ListMetricCollectionsOptionalParameters
     */
    public ListMetricCollectionsOptionalParameters search(String search) {
      this.search = search;
      return this;
    }

    /**
     * Set sort.
     *
     * @param sort Sort by one field: <code>name</code>, <code>created_at</code>, or <code>
     *     updated_at</code>. Prefix with <code>-</code> for descending order. The default is <code>
     *     -created_at</code>. (optional)
     * @return ListMetricCollectionsOptionalParameters
     */
    public ListMetricCollectionsOptionalParameters sort(String sort) {
      this.sort = sort;
      return this;
    }
  }

  /**
   * List metric collections.
   *
   * <p>See {@link #listMetricCollectionsWithHttpInfo}.
   *
   * @return ExperimentsMetricCollectionV2DTOArray
   * @throws ApiException if fails to make API call
   */
  public ExperimentsMetricCollectionV2DTOArray listMetricCollections() throws ApiException {
    return listMetricCollectionsWithHttpInfo(new ListMetricCollectionsOptionalParameters())
        .getData();
  }

  /**
   * List metric collections.
   *
   * <p>See {@link #listMetricCollectionsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;ExperimentsMetricCollectionV2DTOArray&gt;
   */
  public CompletableFuture<ExperimentsMetricCollectionV2DTOArray> listMetricCollectionsAsync() {
    return listMetricCollectionsWithHttpInfoAsync(new ListMetricCollectionsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List metric collections.
   *
   * <p>See {@link #listMetricCollectionsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return ExperimentsMetricCollectionV2DTOArray
   * @throws ApiException if fails to make API call
   */
  public ExperimentsMetricCollectionV2DTOArray listMetricCollections(
      ListMetricCollectionsOptionalParameters parameters) throws ApiException {
    return listMetricCollectionsWithHttpInfo(parameters).getData();
  }

  /**
   * List metric collections.
   *
   * <p>See {@link #listMetricCollectionsWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ExperimentsMetricCollectionV2DTOArray&gt;
   */
  public CompletableFuture<ExperimentsMetricCollectionV2DTOArray> listMetricCollectionsAsync(
      ListMetricCollectionsOptionalParameters parameters) {
    return listMetricCollectionsWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List metric collections for the organization. Collections are reusable ordered metric sets;
   * attaching one to an experiment creates an independent snapshot.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;ExperimentsMetricCollectionV2DTOArray&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ExperimentsMetricCollectionV2DTOArray> listMetricCollectionsWithHttpInfo(
      ListMetricCollectionsOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    List<String> include = parameters.include;
    Long pageLimit = parameters.pageLimit;
    Long pageOffset = parameters.pageOffset;
    String search = parameters.search;
    String sort = parameters.sort;
    // create path and map variables
    String localVarPath = "/api/v2/experiments/metric-collections";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[offset]", pageOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "search", search));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ExperimentsApi.listMetricCollections",
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
        new GenericType<ExperimentsMetricCollectionV2DTOArray>() {});
  }

  /**
   * List metric collections.
   *
   * <p>See {@link #listMetricCollectionsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;ExperimentsMetricCollectionV2DTOArray&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ExperimentsMetricCollectionV2DTOArray>>
      listMetricCollectionsWithHttpInfoAsync(ListMetricCollectionsOptionalParameters parameters) {
    Object localVarPostBody = null;
    List<String> include = parameters.include;
    Long pageLimit = parameters.pageLimit;
    Long pageOffset = parameters.pageOffset;
    String search = parameters.search;
    String sort = parameters.sort;
    // create path and map variables
    String localVarPath = "/api/v2/experiments/metric-collections";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[offset]", pageOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "search", search));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ExperimentsApi.listMetricCollections",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ExperimentsMetricCollectionV2DTOArray>> result =
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
        new GenericType<ExperimentsMetricCollectionV2DTOArray>() {});
  }

  /** Manage optional parameters to listMetrics. */
  public static class ListMetricsOptionalParameters {
    private List<String> include;
    private Long pageLimit;
    private Long pageOffset;
    private String search;
    private String sort;

    /**
     * Set include.
     *
     * @param include Optional fields to include. Repeat this parameter to request several fields.
     *     <code>counts</code> adds experiment_count on each metric, which costs an extra aggregate
     *     query. (optional)
     * @return ListMetricsOptionalParameters
     */
    public ListMetricsOptionalParameters include(List<String> include) {
      this.include = include;
      return this;
    }

    /**
     * Set pageLimit.
     *
     * @param pageLimit Maximum number of results to return. Defaults to 25 when omitted, and is
     *     capped at 50 (larger values are clamped to 50). The response includes meta.page (with
     *     total) and pagination links. (optional)
     * @return ListMetricsOptionalParameters
     */
    public ListMetricsOptionalParameters pageLimit(Long pageLimit) {
      this.pageLimit = pageLimit;
      return this;
    }

    /**
     * Set pageOffset.
     *
     * @param pageOffset Number of results to skip for pagination. Defaults to 0 when omitted.
     *     (optional)
     * @return ListMetricsOptionalParameters
     */
    public ListMetricsOptionalParameters pageOffset(Long pageOffset) {
      this.pageOffset = pageOffset;
      return this;
    }

    /**
     * Set search.
     *
     * @param search Find metrics whose names contain the search text, regardless of case.
     *     (optional)
     * @return ListMetricsOptionalParameters
     */
    public ListMetricsOptionalParameters search(String search) {
      this.search = search;
      return this;
    }

    /**
     * Set sort.
     *
     * @param sort Sort field: name, created_at, or updated_at. Prefix with <code>-</code> for
     *     descending (for example, <code>-created_at</code>). A single field only; a
     *     comma-separated list is rejected. Defaults to created_at descending. (optional)
     * @return ListMetricsOptionalParameters
     */
    public ListMetricsOptionalParameters sort(String sort) {
      this.sort = sort;
      return this;
    }
  }

  /**
   * List metrics.
   *
   * <p>See {@link #listMetricsWithHttpInfo}.
   *
   * @return ExperimentsMetricV2DTOArray
   * @throws ApiException if fails to make API call
   */
  public ExperimentsMetricV2DTOArray listMetrics() throws ApiException {
    return listMetricsWithHttpInfo(new ListMetricsOptionalParameters()).getData();
  }

  /**
   * List metrics.
   *
   * <p>See {@link #listMetricsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;ExperimentsMetricV2DTOArray&gt;
   */
  public CompletableFuture<ExperimentsMetricV2DTOArray> listMetricsAsync() {
    return listMetricsWithHttpInfoAsync(new ListMetricsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List metrics.
   *
   * <p>See {@link #listMetricsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return ExperimentsMetricV2DTOArray
   * @throws ApiException if fails to make API call
   */
  public ExperimentsMetricV2DTOArray listMetrics(ListMetricsOptionalParameters parameters)
      throws ApiException {
    return listMetricsWithHttpInfo(parameters).getData();
  }

  /**
   * List metrics.
   *
   * <p>See {@link #listMetricsWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ExperimentsMetricV2DTOArray&gt;
   */
  public CompletableFuture<ExperimentsMetricV2DTOArray> listMetricsAsync(
      ListMetricsOptionalParameters parameters) {
    return listMetricsWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List metrics. Returns a paginated list of the experiment metrics defined for the organization.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;ExperimentsMetricV2DTOArray&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Invalid query parameter: bad page[offset]/page[limit], or unknown sort field. </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Missing or invalid authentication (dd-api-key + dd-application-key headers, or a valid user session). </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authenticated caller lacks the product_analytics_metrics_read permission. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ExperimentsMetricV2DTOArray> listMetricsWithHttpInfo(
      ListMetricsOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    List<String> include = parameters.include;
    Long pageLimit = parameters.pageLimit;
    Long pageOffset = parameters.pageOffset;
    String search = parameters.search;
    String sort = parameters.sort;
    // create path and map variables
    String localVarPath = "/api/v2/experiments/metrics";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[offset]", pageOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "search", search));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ExperimentsApi.listMetrics",
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
        new GenericType<ExperimentsMetricV2DTOArray>() {});
  }

  /**
   * List metrics.
   *
   * <p>See {@link #listMetricsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;ExperimentsMetricV2DTOArray&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ExperimentsMetricV2DTOArray>> listMetricsWithHttpInfoAsync(
      ListMetricsOptionalParameters parameters) {
    Object localVarPostBody = null;
    List<String> include = parameters.include;
    Long pageLimit = parameters.pageLimit;
    Long pageOffset = parameters.pageOffset;
    String search = parameters.search;
    String sort = parameters.sort;
    // create path and map variables
    String localVarPath = "/api/v2/experiments/metrics";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[offset]", pageOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "search", search));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ExperimentsApi.listMetrics",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ExperimentsMetricV2DTOArray>> result =
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
        new GenericType<ExperimentsMetricV2DTOArray>() {});
  }

  /** Manage optional parameters to listMetricSQLModels. */
  public static class ListMetricSQLModelsOptionalParameters {
    private List<String> include;
    private Long pageLimit;
    private Long pageOffset;
    private String sort;

    /**
     * Set include.
     *
     * @param include Optional fields to include. Repeat this parameter to request several fields.
     *     <code>counts</code> adds metric_count and experiment_count, which cost an extra aggregate
     *     query. (optional)
     * @return ListMetricSQLModelsOptionalParameters
     */
    public ListMetricSQLModelsOptionalParameters include(List<String> include) {
      this.include = include;
      return this;
    }

    /**
     * Set pageLimit.
     *
     * @param pageLimit Maximum number of results to return. Defaults to 25 when omitted, and is
     *     capped at 50 (larger values are clamped to 50). The response includes meta.page (with
     *     total) and pagination links. (optional)
     * @return ListMetricSQLModelsOptionalParameters
     */
    public ListMetricSQLModelsOptionalParameters pageLimit(Long pageLimit) {
      this.pageLimit = pageLimit;
      return this;
    }

    /**
     * Set pageOffset.
     *
     * @param pageOffset Number of results to skip for pagination. Defaults to 0 when omitted.
     *     (optional)
     * @return ListMetricSQLModelsOptionalParameters
     */
    public ListMetricSQLModelsOptionalParameters pageOffset(Long pageOffset) {
      this.pageOffset = pageOffset;
      return this;
    }

    /**
     * Set sort.
     *
     * @param sort Sort field: name, created_at, updated_at, metric_count, or experiment_count. A
     *     single field only; a comma-separated list is rejected. Prefix with <code>-</code> for
     *     descending (for example, <code>-created_at</code>). Defaults to created_at descending.
     *     (optional)
     * @return ListMetricSQLModelsOptionalParameters
     */
    public ListMetricSQLModelsOptionalParameters sort(String sort) {
      this.sort = sort;
      return this;
    }
  }

  /**
   * List metric SQL models.
   *
   * <p>See {@link #listMetricSQLModelsWithHttpInfo}.
   *
   * @return ExperimentsMetricSQLModelV2DTOArray
   * @throws ApiException if fails to make API call
   */
  public ExperimentsMetricSQLModelV2DTOArray listMetricSQLModels() throws ApiException {
    return listMetricSQLModelsWithHttpInfo(new ListMetricSQLModelsOptionalParameters()).getData();
  }

  /**
   * List metric SQL models.
   *
   * <p>See {@link #listMetricSQLModelsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;ExperimentsMetricSQLModelV2DTOArray&gt;
   */
  public CompletableFuture<ExperimentsMetricSQLModelV2DTOArray> listMetricSQLModelsAsync() {
    return listMetricSQLModelsWithHttpInfoAsync(new ListMetricSQLModelsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List metric SQL models.
   *
   * <p>See {@link #listMetricSQLModelsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return ExperimentsMetricSQLModelV2DTOArray
   * @throws ApiException if fails to make API call
   */
  public ExperimentsMetricSQLModelV2DTOArray listMetricSQLModels(
      ListMetricSQLModelsOptionalParameters parameters) throws ApiException {
    return listMetricSQLModelsWithHttpInfo(parameters).getData();
  }

  /**
   * List metric SQL models.
   *
   * <p>See {@link #listMetricSQLModelsWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ExperimentsMetricSQLModelV2DTOArray&gt;
   */
  public CompletableFuture<ExperimentsMetricSQLModelV2DTOArray> listMetricSQLModelsAsync(
      ListMetricSQLModelsOptionalParameters parameters) {
    return listMetricSQLModelsWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List metric SQL models. Returns a paginated list of the SQL models that metrics are defined on
   * for the organization.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;ExperimentsMetricSQLModelV2DTOArray&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Invalid query parameter: bad page[offset]/page[limit], unknown sort field, or unknown include value. </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Missing or invalid authentication (dd-api-key + dd-application-key headers, or a valid user session). </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authenticated caller lacks the product_analytics_metrics_read permission. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ExperimentsMetricSQLModelV2DTOArray> listMetricSQLModelsWithHttpInfo(
      ListMetricSQLModelsOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    List<String> include = parameters.include;
    Long pageLimit = parameters.pageLimit;
    Long pageOffset = parameters.pageOffset;
    String sort = parameters.sort;
    // create path and map variables
    String localVarPath = "/api/v2/experiments/metric-sql-models";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[offset]", pageOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ExperimentsApi.listMetricSQLModels",
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
        new GenericType<ExperimentsMetricSQLModelV2DTOArray>() {});
  }

  /**
   * List metric SQL models.
   *
   * <p>See {@link #listMetricSQLModelsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;ExperimentsMetricSQLModelV2DTOArray&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ExperimentsMetricSQLModelV2DTOArray>>
      listMetricSQLModelsWithHttpInfoAsync(ListMetricSQLModelsOptionalParameters parameters) {
    Object localVarPostBody = null;
    List<String> include = parameters.include;
    Long pageLimit = parameters.pageLimit;
    Long pageOffset = parameters.pageOffset;
    String sort = parameters.sort;
    // create path and map variables
    String localVarPath = "/api/v2/experiments/metric-sql-models";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[offset]", pageOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ExperimentsApi.listMetricSQLModels",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ExperimentsMetricSQLModelV2DTOArray>> result =
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
        new GenericType<ExperimentsMetricSQLModelV2DTOArray>() {});
  }

  /** Manage optional parameters to listSubjectTypes. */
  public static class ListSubjectTypesOptionalParameters {
    private String include;
    private Long pageLimit;
    private Long pageOffset;
    private String search;
    private String sort;

    /**
     * Set include.
     *
     * @param include Set to <code>counts</code> to add experiment_count, exposure_source_count,
     *     metric_sql_model_count and protocol_count to each subject type. Each costs an extra
     *     query, so they are omitted unless asked for. (optional)
     * @return ListSubjectTypesOptionalParameters
     */
    public ListSubjectTypesOptionalParameters include(String include) {
      this.include = include;
      return this;
    }

    /**
     * Set pageLimit.
     *
     * @param pageLimit Maximum number of results to return. Defaults to 25 when omitted, and is
     *     capped at 50 (larger values are clamped to 50). The response includes meta.page (with
     *     total) and pagination links. (optional)
     * @return ListSubjectTypesOptionalParameters
     */
    public ListSubjectTypesOptionalParameters pageLimit(Long pageLimit) {
      this.pageLimit = pageLimit;
      return this;
    }

    /**
     * Set pageOffset.
     *
     * @param pageOffset Number of results to skip for pagination. Defaults to 0 when omitted.
     *     (optional)
     * @return ListSubjectTypesOptionalParameters
     */
    public ListSubjectTypesOptionalParameters pageOffset(Long pageOffset) {
      this.pageOffset = pageOffset;
      return this;
    }

    /**
     * Set search.
     *
     * @param search Find subject types whose names contain the search text, regardless of case.
     *     (optional)
     * @return ListSubjectTypesOptionalParameters
     */
    public ListSubjectTypesOptionalParameters search(String search) {
      this.search = search;
      return this;
    }

    /**
     * Set sort.
     *
     * @param sort Sort fields: name, created_at, or updated_at. Use a comma-separated list in
     *     priority order, for example name,-created_at. Prefix each field with <code>-</code> for
     *     descending. Defaults to created_at descending. (optional)
     * @return ListSubjectTypesOptionalParameters
     */
    public ListSubjectTypesOptionalParameters sort(String sort) {
      this.sort = sort;
      return this;
    }
  }

  /**
   * List subject types.
   *
   * <p>See {@link #listSubjectTypesWithHttpInfo}.
   *
   * @return ExperimentsSubjectTypeV2DTOArray
   * @throws ApiException if fails to make API call
   */
  public ExperimentsSubjectTypeV2DTOArray listSubjectTypes() throws ApiException {
    return listSubjectTypesWithHttpInfo(new ListSubjectTypesOptionalParameters()).getData();
  }

  /**
   * List subject types.
   *
   * <p>See {@link #listSubjectTypesWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;ExperimentsSubjectTypeV2DTOArray&gt;
   */
  public CompletableFuture<ExperimentsSubjectTypeV2DTOArray> listSubjectTypesAsync() {
    return listSubjectTypesWithHttpInfoAsync(new ListSubjectTypesOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List subject types.
   *
   * <p>See {@link #listSubjectTypesWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return ExperimentsSubjectTypeV2DTOArray
   * @throws ApiException if fails to make API call
   */
  public ExperimentsSubjectTypeV2DTOArray listSubjectTypes(
      ListSubjectTypesOptionalParameters parameters) throws ApiException {
    return listSubjectTypesWithHttpInfo(parameters).getData();
  }

  /**
   * List subject types.
   *
   * <p>See {@link #listSubjectTypesWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ExperimentsSubjectTypeV2DTOArray&gt;
   */
  public CompletableFuture<ExperimentsSubjectTypeV2DTOArray> listSubjectTypesAsync(
      ListSubjectTypesOptionalParameters parameters) {
    return listSubjectTypesWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List subject types. Returns a paginated list of the subject types defined for the organization.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;ExperimentsSubjectTypeV2DTOArray&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Invalid query parameter: bad page[offset]/page[limit], or unknown sort field. </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Missing or invalid authentication (dd-api-key + dd-application-key headers, or a valid user session). </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authenticated caller lacks the product_analytics_settings_read permission. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ExperimentsSubjectTypeV2DTOArray> listSubjectTypesWithHttpInfo(
      ListSubjectTypesOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    String include = parameters.include;
    Long pageLimit = parameters.pageLimit;
    Long pageOffset = parameters.pageOffset;
    String search = parameters.search;
    String sort = parameters.sort;
    // create path and map variables
    String localVarPath = "/api/v2/experiments/subject-types";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[offset]", pageOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "search", search));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ExperimentsApi.listSubjectTypes",
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
        new GenericType<ExperimentsSubjectTypeV2DTOArray>() {});
  }

  /**
   * List subject types.
   *
   * <p>See {@link #listSubjectTypesWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;ExperimentsSubjectTypeV2DTOArray&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ExperimentsSubjectTypeV2DTOArray>>
      listSubjectTypesWithHttpInfoAsync(ListSubjectTypesOptionalParameters parameters) {
    Object localVarPostBody = null;
    String include = parameters.include;
    Long pageLimit = parameters.pageLimit;
    Long pageOffset = parameters.pageOffset;
    String search = parameters.search;
    String sort = parameters.sort;
    // create path and map variables
    String localVarPath = "/api/v2/experiments/subject-types";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[offset]", pageOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "search", search));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ExperimentsApi.listSubjectTypes",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ExperimentsSubjectTypeV2DTOArray>> result =
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
        new GenericType<ExperimentsSubjectTypeV2DTOArray>() {});
  }

  /**
   * Patch experiment.
   *
   * <p>See {@link #patchExperimentWithHttpInfo}.
   *
   * @param experimentId The UUID of the experiment. (required)
   * @param body (required)
   * @return ExperimentsPatchExperimentV2Response
   * @throws ApiException if fails to make API call
   */
  public ExperimentsPatchExperimentV2Response patchExperiment(
      UUID experimentId, ExperimentsPatchExperimentV2Request body) throws ApiException {
    return patchExperimentWithHttpInfo(experimentId, body).getData();
  }

  /**
   * Patch experiment.
   *
   * <p>See {@link #patchExperimentWithHttpInfoAsync}.
   *
   * @param experimentId The UUID of the experiment. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ExperimentsPatchExperimentV2Response&gt;
   */
  public CompletableFuture<ExperimentsPatchExperimentV2Response> patchExperimentAsync(
      UUID experimentId, ExperimentsPatchExperimentV2Request body) {
    return patchExperimentWithHttpInfoAsync(experimentId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update mutable experiment fields. State and protocol restrictions apply.
   *
   * <p><strong>PATCH behavior</strong>
   *
   * <ul>
   *   <li>Omitted fields stay unchanged, including fields inside <code>datadog_flag_configuration
   *       </code>.
   *   <li>Supplied <code>tags</code>, <code>teams</code>, <code>related_links</code>, <code>
   *       decision_metrics</code>, and <code>variants</code> replace their stored lists.
   *   <li>Validation can return several field errors before saving any changes. The response is
   *       HTTP 400 if any error concerns invalid input. It is HTTP 409 if all errors concern state
   *       or protocol conflicts.
   * </ul>
   *
   * <p><strong>Result refreshes</strong>
   *
   * <p>This endpoint does not start a pipeline run. <code>meta.needs_pipeline_refresh</code> states
   * whether the edit requires a run. When true, POST to <code>meta.refresh_endpoint</code> after
   * finishing your edits. Its <code>full_refresh</code> query parameter selects the run type.
   *
   * <p>Keep refresh requirements across edits. A later false value does not clear an earlier
   * requirement. Any <code>full_refresh=true</code> requirement takes priority.
   *
   * <p>After start, STATIC and STEPS exposure changes for warehouse experiments without a Datadog
   * flag attempt to recalculate stored results. Changes to decision metrics or the control variant
   * also attempt recalculation when results exist. If stored data is insufficient or recalculation
   * fails, the edit stays saved and <code>meta.needs_pipeline_refresh</code> is true.
   *
   * <p><strong>Exposure rules</strong>
   *
   * <ul>
   *   <li>Draft experiments can replace the full STATIC or STEPS plan through <code>
   *       traffic_exposure</code>.
   *   <li>Warehouse steps start at <code>assignments_start_date</code> and can have different
   *       durations.
   *   <li>Running warehouse experiments can replace step fractions, durations, and exposure mode.
   *       Retained variant weights cannot change through this API. You can send unchanged values
   *       again.
   *   <li>After a warehouse experiment ends, configuration replacement supports only STATIC
   *       fraction changes.
   *   <li>New Datadog plans have at most five steps. The first fraction must be positive. All steps
   *       except the last have equal durations. Durations exclude pauses.
   *   <li>The last step has a null duration. Its fraction stays in effect until assignment ends.
   *   <li>After start, use the experiment UI to change traffic exposure for experiments linked to a
   *       Datadog flag.
   * </ul>
   *
   * <p><strong>Metadata</strong>
   *
   * <p><code>structured_metadata</code> updates fields by <code>field_key</code>. Use <code>
   * freetext_value: ""</code> or <code>enum_values: []</code> to clear an optional field. Omitted
   * fields stay unchanged. A null or empty <code>structured_metadata</code> attribute makes no
   * change.
   *
   * <p><strong>Flag changes</strong>
   *
   * <p>Before start, a Datadog update creates or edits the saved draft allocation. To add or
   * replace a flag, send <code>variants</code> and <code>traffic_exposure</code>. Inside <code>
   * datadog_flag_configuration</code>, send <code>feature_flag_id</code>, <code>environment_id
   * </code>, <code>targeting_rules</code>, and <code>entry_point</code>. Use <code>
   * targeting_rules: []</code> and <code>entry_point: null</code> when unused.
   *
   * <p>To replace a flag, also set <code>reset_on_feature_flag_change: true</code> inside that
   * object. The server deletes the old draft and creates a new one in the same transaction. The
   * response includes a <code>datadog_flag_configuration_reset</code> warning in <code>
   * meta.warnings</code>.
   *
   * <p>Set <code>datadog_flag_configuration: null</code> to delete the draft allocation. This also
   * clears the experiment's flag association, variants, assignment sources, and entry point. The
   * experiment remains.
   *
   * <p>Flag replacement and removal require a draft experiment without warehouse exposure. These
   * actions do not convert hybrid experiments.
   *
   * @param experimentId The UUID of the experiment. (required)
   * @param body (required)
   * @return ApiResponse&lt;ExperimentsPatchExperimentV2Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Invalid request: malformed field, a read-only attribute was sent, a referenced ID doesn&#39;t exist, an allocation change is not supported after start, or the resulting analysis configuration is invalid. May return multiple errors. </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Missing or invalid authentication (dd-api-key + dd-application-key headers, or a valid user session). </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authenticated caller lacks the product_analytics_experiments_write permission, lacks permission to edit this experiment, or lacks feature-flag and environment read permissions for a Datadog-backed configuration. </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> No experiment with this ID exists for the organization. </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> The requested configuration is incompatible with the experiment, or a feature flag change requires explicit reset consent and a complete target configuration (codes: unsupported_configuration, feature_flag_change_requires_reset, or feature_flag_change_requires_complete_configuration). </td><td>  -  </td></tr>
   *       <tr><td> 415 </td><td> Request body sent with a media type other than application/json or application/vnd.api+json. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ExperimentsPatchExperimentV2Response> patchExperimentWithHttpInfo(
      UUID experimentId, ExperimentsPatchExperimentV2Request body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'experimentId' is set
    if (experimentId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'experimentId' when calling patchExperiment");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling patchExperiment");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/experiments/{experiment_id}"
            .replaceAll(
                "\\{" + "experiment_id" + "\\}", apiClient.escapeString(experimentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ExperimentsApi.patchExperiment",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<ExperimentsPatchExperimentV2Response>() {});
  }

  /**
   * Patch experiment.
   *
   * <p>See {@link #patchExperimentWithHttpInfo}.
   *
   * @param experimentId The UUID of the experiment. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ExperimentsPatchExperimentV2Response&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ExperimentsPatchExperimentV2Response>>
      patchExperimentWithHttpInfoAsync(
          UUID experimentId, ExperimentsPatchExperimentV2Request body) {
    Object localVarPostBody = body;

    // verify the required parameter 'experimentId' is set
    if (experimentId == null) {
      CompletableFuture<ApiResponse<ExperimentsPatchExperimentV2Response>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'experimentId' when calling patchExperiment"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<ExperimentsPatchExperimentV2Response>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling patchExperiment"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/experiments/{experiment_id}"
            .replaceAll(
                "\\{" + "experiment_id" + "\\}", apiClient.escapeString(experimentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ExperimentsApi.patchExperiment",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ExperimentsPatchExperimentV2Response>> result =
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
        new GenericType<ExperimentsPatchExperimentV2Response>() {});
  }

  /**
   * Patch subject type.
   *
   * <p>See {@link #patchSubjectTypeWithHttpInfo}.
   *
   * @param subjectTypeId The UUID of the subject type. (required)
   * @param body (required)
   * @return ExperimentsSubjectTypeV2DTO
   * @throws ApiException if fails to make API call
   */
  public ExperimentsSubjectTypeV2DTO patchSubjectType(
      UUID subjectTypeId, ExperimentsPatchSubjectTypeV2Request body) throws ApiException {
    return patchSubjectTypeWithHttpInfo(subjectTypeId, body).getData();
  }

  /**
   * Patch subject type.
   *
   * <p>See {@link #patchSubjectTypeWithHttpInfoAsync}.
   *
   * @param subjectTypeId The UUID of the subject type. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ExperimentsSubjectTypeV2DTO&gt;
   */
  public CompletableFuture<ExperimentsSubjectTypeV2DTO> patchSubjectTypeAsync(
      UUID subjectTypeId, ExperimentsPatchSubjectTypeV2Request body) {
    return patchSubjectTypeWithHttpInfoAsync(subjectTypeId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update mutable fields on a subject type. Only the fields present in the body are changed. Any
   * subject type can be updated, including the organization's default one, but the is_default flag
   * itself is read-only here: which subject type is the default cannot be changed through this
   * endpoint.
   *
   * @param subjectTypeId The UUID of the subject type. (required)
   * @param body (required)
   * @return ApiResponse&lt;ExperimentsSubjectTypeV2DTO&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Malformed subject type ID, malformed body, or no updatable field supplied. </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Missing or invalid authentication. </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authenticated caller lacks the product_analytics_settings_write permission. </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> No subject type with this ID exists for the organization. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ExperimentsSubjectTypeV2DTO> patchSubjectTypeWithHttpInfo(
      UUID subjectTypeId, ExperimentsPatchSubjectTypeV2Request body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'subjectTypeId' is set
    if (subjectTypeId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'subjectTypeId' when calling patchSubjectType");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling patchSubjectType");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/experiments/subject-types/{subject_type_id}"
            .replaceAll(
                "\\{" + "subject_type_id" + "\\}",
                apiClient.escapeString(subjectTypeId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ExperimentsApi.patchSubjectType",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<ExperimentsSubjectTypeV2DTO>() {});
  }

  /**
   * Patch subject type.
   *
   * <p>See {@link #patchSubjectTypeWithHttpInfo}.
   *
   * @param subjectTypeId The UUID of the subject type. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ExperimentsSubjectTypeV2DTO&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ExperimentsSubjectTypeV2DTO>>
      patchSubjectTypeWithHttpInfoAsync(
          UUID subjectTypeId, ExperimentsPatchSubjectTypeV2Request body) {
    Object localVarPostBody = body;

    // verify the required parameter 'subjectTypeId' is set
    if (subjectTypeId == null) {
      CompletableFuture<ApiResponse<ExperimentsSubjectTypeV2DTO>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'subjectTypeId' when calling patchSubjectType"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<ExperimentsSubjectTypeV2DTO>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling patchSubjectType"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/experiments/subject-types/{subject_type_id}"
            .replaceAll(
                "\\{" + "subject_type_id" + "\\}",
                apiClient.escapeString(subjectTypeId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ExperimentsApi.patchSubjectType",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ExperimentsSubjectTypeV2DTO>> result =
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
        new GenericType<ExperimentsSubjectTypeV2DTO>() {});
  }

  /** Manage optional parameters to refreshExperimentResults. */
  public static class RefreshExperimentResultsOptionalParameters {
    private Boolean fullRefresh;

    /**
     * Set fullRefresh.
     *
     * @param fullRefresh Force a full warehouse rebuild. Defaults to false when omitted. (optional)
     * @return RefreshExperimentResultsOptionalParameters
     */
    public RefreshExperimentResultsOptionalParameters fullRefresh(Boolean fullRefresh) {
      this.fullRefresh = fullRefresh;
      return this;
    }
  }

  /**
   * Refresh experiment results.
   *
   * <p>See {@link #refreshExperimentResultsWithHttpInfo}.
   *
   * @param experimentId The UUID of the experiment. (required)
   * @return ExperimentsRefreshExperimentResultsV2DTO
   * @throws ApiException if fails to make API call
   */
  public ExperimentsRefreshExperimentResultsV2DTO refreshExperimentResults(UUID experimentId)
      throws ApiException {
    return refreshExperimentResultsWithHttpInfo(
            experimentId, new RefreshExperimentResultsOptionalParameters())
        .getData();
  }

  /**
   * Refresh experiment results.
   *
   * <p>See {@link #refreshExperimentResultsWithHttpInfoAsync}.
   *
   * @param experimentId The UUID of the experiment. (required)
   * @return CompletableFuture&lt;ExperimentsRefreshExperimentResultsV2DTO&gt;
   */
  public CompletableFuture<ExperimentsRefreshExperimentResultsV2DTO> refreshExperimentResultsAsync(
      UUID experimentId) {
    return refreshExperimentResultsWithHttpInfoAsync(
            experimentId, new RefreshExperimentResultsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Refresh experiment results.
   *
   * <p>See {@link #refreshExperimentResultsWithHttpInfo}.
   *
   * @param experimentId The UUID of the experiment. (required)
   * @param parameters Optional parameters for the request.
   * @return ExperimentsRefreshExperimentResultsV2DTO
   * @throws ApiException if fails to make API call
   */
  public ExperimentsRefreshExperimentResultsV2DTO refreshExperimentResults(
      UUID experimentId, RefreshExperimentResultsOptionalParameters parameters)
      throws ApiException {
    return refreshExperimentResultsWithHttpInfo(experimentId, parameters).getData();
  }

  /**
   * Refresh experiment results.
   *
   * <p>See {@link #refreshExperimentResultsWithHttpInfoAsync}.
   *
   * @param experimentId The UUID of the experiment. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ExperimentsRefreshExperimentResultsV2DTO&gt;
   */
  public CompletableFuture<ExperimentsRefreshExperimentResultsV2DTO> refreshExperimentResultsAsync(
      UUID experimentId, RefreshExperimentResultsOptionalParameters parameters) {
    return refreshExperimentResultsWithHttpInfoAsync(experimentId, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Request a results refresh for one experiment. HTTP 202 confirms acceptance, not completed
   * results. The response identifies the experiment and does not include a job ID. Read experiment
   * results to check freshness. A request while a refresh is queued or running returns 409. After
   * completion, another request can start another refresh.
   *
   * @param experimentId The UUID of the experiment. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;ExperimentsRefreshExperimentResultsV2DTO&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Malformed experiment ID (not a valid UUID), or full_refresh is not a valid boolean. </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Missing or invalid authentication. </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authenticated caller lacks the product_analytics_experiments_write permission, or lacks edit permission on this experiment. </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> No experiment with this ID exists for the organization. </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> A refresh is already queued or running for this experiment. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ExperimentsRefreshExperimentResultsV2DTO> refreshExperimentResultsWithHttpInfo(
      UUID experimentId, RefreshExperimentResultsOptionalParameters parameters)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'experimentId' is set
    if (experimentId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'experimentId' when calling refreshExperimentResults");
    }
    Boolean fullRefresh = parameters.fullRefresh;
    // create path and map variables
    String localVarPath =
        "/api/v2/experiments/{experiment_id}/results/refresh"
            .replaceAll(
                "\\{" + "experiment_id" + "\\}", apiClient.escapeString(experimentId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "full_refresh", fullRefresh));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ExperimentsApi.refreshExperimentResults",
            localVarPath,
            localVarQueryParams,
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<ExperimentsRefreshExperimentResultsV2DTO>() {});
  }

  /**
   * Refresh experiment results.
   *
   * <p>See {@link #refreshExperimentResultsWithHttpInfo}.
   *
   * @param experimentId The UUID of the experiment. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;ExperimentsRefreshExperimentResultsV2DTO&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ExperimentsRefreshExperimentResultsV2DTO>>
      refreshExperimentResultsWithHttpInfoAsync(
          UUID experimentId, RefreshExperimentResultsOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'experimentId' is set
    if (experimentId == null) {
      CompletableFuture<ApiResponse<ExperimentsRefreshExperimentResultsV2DTO>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'experimentId' when calling"
                  + " refreshExperimentResults"));
      return result;
    }
    Boolean fullRefresh = parameters.fullRefresh;
    // create path and map variables
    String localVarPath =
        "/api/v2/experiments/{experiment_id}/results/refresh"
            .replaceAll(
                "\\{" + "experiment_id" + "\\}", apiClient.escapeString(experimentId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "full_refresh", fullRefresh));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ExperimentsApi.refreshExperimentResults",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ExperimentsRefreshExperimentResultsV2DTO>> result =
          new CompletableFuture<>();
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
        new GenericType<ExperimentsRefreshExperimentResultsV2DTO>() {});
  }

  /** Manage optional parameters to refreshExperimentResultsForOrg. */
  public static class RefreshExperimentResultsForOrgOptionalParameters {
    private Boolean fullRefresh;

    /**
     * Set fullRefresh.
     *
     * @param fullRefresh Force a full warehouse rebuild. Defaults to false when omitted. (optional)
     * @return RefreshExperimentResultsForOrgOptionalParameters
     */
    public RefreshExperimentResultsForOrgOptionalParameters fullRefresh(Boolean fullRefresh) {
      this.fullRefresh = fullRefresh;
      return this;
    }
  }

  /**
   * Refresh experiment results for org.
   *
   * <p>See {@link #refreshExperimentResultsForOrgWithHttpInfo}.
   *
   * @return ExperimentsRefreshExperimentResultsV2DTOArray
   * @throws ApiException if fails to make API call
   */
  public ExperimentsRefreshExperimentResultsV2DTOArray refreshExperimentResultsForOrg()
      throws ApiException {
    return refreshExperimentResultsForOrgWithHttpInfo(
            new RefreshExperimentResultsForOrgOptionalParameters())
        .getData();
  }

  /**
   * Refresh experiment results for org.
   *
   * <p>See {@link #refreshExperimentResultsForOrgWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;ExperimentsRefreshExperimentResultsV2DTOArray&gt;
   */
  public CompletableFuture<ExperimentsRefreshExperimentResultsV2DTOArray>
      refreshExperimentResultsForOrgAsync() {
    return refreshExperimentResultsForOrgWithHttpInfoAsync(
            new RefreshExperimentResultsForOrgOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Refresh experiment results for org.
   *
   * <p>See {@link #refreshExperimentResultsForOrgWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return ExperimentsRefreshExperimentResultsV2DTOArray
   * @throws ApiException if fails to make API call
   */
  public ExperimentsRefreshExperimentResultsV2DTOArray refreshExperimentResultsForOrg(
      RefreshExperimentResultsForOrgOptionalParameters parameters) throws ApiException {
    return refreshExperimentResultsForOrgWithHttpInfo(parameters).getData();
  }

  /**
   * Refresh experiment results for org.
   *
   * <p>See {@link #refreshExperimentResultsForOrgWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ExperimentsRefreshExperimentResultsV2DTOArray&gt;
   */
  public CompletableFuture<ExperimentsRefreshExperimentResultsV2DTOArray>
      refreshExperimentResultsForOrgAsync(
          RefreshExperimentResultsForOrgOptionalParameters parameters) {
    return refreshExperimentResultsForOrgWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Trigger a results refresh across the organization's active experiments. Returns the count of
   * experiments whose refresh was triggered (meta.experiments_updated) plus a per-experiment
   * breakdown of what happened to each (meta.results).
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;ExperimentsRefreshExperimentResultsV2DTOArray&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> The full_refresh query parameter is not a valid boolean. </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Missing or invalid authentication. </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authenticated caller lacks the product_analytics_experiments_write permission. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ExperimentsRefreshExperimentResultsV2DTOArray>
      refreshExperimentResultsForOrgWithHttpInfo(
          RefreshExperimentResultsForOrgOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    Boolean fullRefresh = parameters.fullRefresh;
    // create path and map variables
    String localVarPath = "/api/v2/experiments/results/refresh";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "full_refresh", fullRefresh));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ExperimentsApi.refreshExperimentResultsForOrg",
            localVarPath,
            localVarQueryParams,
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<ExperimentsRefreshExperimentResultsV2DTOArray>() {});
  }

  /**
   * Refresh experiment results for org.
   *
   * <p>See {@link #refreshExperimentResultsForOrgWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return
   *     CompletableFuture&lt;ApiResponse&lt;ExperimentsRefreshExperimentResultsV2DTOArray&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ExperimentsRefreshExperimentResultsV2DTOArray>>
      refreshExperimentResultsForOrgWithHttpInfoAsync(
          RefreshExperimentResultsForOrgOptionalParameters parameters) {
    Object localVarPostBody = null;
    Boolean fullRefresh = parameters.fullRefresh;
    // create path and map variables
    String localVarPath = "/api/v2/experiments/results/refresh";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "full_refresh", fullRefresh));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ExperimentsApi.refreshExperimentResultsForOrg",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ExperimentsRefreshExperimentResultsV2DTOArray>> result =
          new CompletableFuture<>();
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
        new GenericType<ExperimentsRefreshExperimentResultsV2DTOArray>() {});
  }

  /**
   * Set default subject type.
   *
   * <p>See {@link #setDefaultSubjectTypeWithHttpInfo}.
   *
   * @param subjectTypeId The UUID of the subject type. (required)
   * @throws ApiException if fails to make API call
   */
  public void setDefaultSubjectType(UUID subjectTypeId) throws ApiException {
    setDefaultSubjectTypeWithHttpInfo(subjectTypeId);
  }

  /**
   * Set default subject type.
   *
   * <p>See {@link #setDefaultSubjectTypeWithHttpInfoAsync}.
   *
   * @param subjectTypeId The UUID of the subject type. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> setDefaultSubjectTypeAsync(UUID subjectTypeId) {
    return setDefaultSubjectTypeWithHttpInfoAsync(subjectTypeId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Make this subject type the organization's default. Experiment creation uses the default when
   * the request names no subject type. Promoting one subject type demotes the previous default in
   * the same transaction, so the organization always has exactly one. The call is idempotent:
   * promoting the current default succeeds and changes nothing. There is no matching demote,
   * because an organization cannot have no default; promote a different subject type instead.
   *
   * @param subjectTypeId The UUID of the subject type. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> The subject type is now the organization&#39;s default. </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Malformed subject type ID (not a valid UUID). </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Missing or invalid authentication. </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authenticated caller lacks the product_analytics_settings_write permission. </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> No subject type with this ID exists for the organization. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> setDefaultSubjectTypeWithHttpInfo(UUID subjectTypeId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'subjectTypeId' is set
    if (subjectTypeId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'subjectTypeId' when calling setDefaultSubjectType");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/experiments/subject-types/{subject_type_id}/default"
            .replaceAll(
                "\\{" + "subject_type_id" + "\\}",
                apiClient.escapeString(subjectTypeId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ExperimentsApi.setDefaultSubjectType",
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
   * Set default subject type.
   *
   * <p>See {@link #setDefaultSubjectTypeWithHttpInfo}.
   *
   * @param subjectTypeId The UUID of the subject type. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> setDefaultSubjectTypeWithHttpInfoAsync(
      UUID subjectTypeId) {
    Object localVarPostBody = null;

    // verify the required parameter 'subjectTypeId' is set
    if (subjectTypeId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'subjectTypeId' when calling setDefaultSubjectType"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/experiments/subject-types/{subject_type_id}/default"
            .replaceAll(
                "\\{" + "subject_type_id" + "\\}",
                apiClient.escapeString(subjectTypeId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ExperimentsApi.setDefaultSubjectType",
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

  /** Manage optional parameters to startExperiment. */
  public static class StartExperimentOptionalParameters {
    private ExperimentsStartExperimentV2Request body;

    /**
     * Set body.
     *
     * @param body (optional)
     * @return StartExperimentOptionalParameters
     */
    public StartExperimentOptionalParameters body(ExperimentsStartExperimentV2Request body) {
      this.body = body;
      return this;
    }
  }

  /**
   * Start experiment.
   *
   * <p>See {@link #startExperimentWithHttpInfo}.
   *
   * @param experimentId The UUID of the experiment. (required)
   * @throws ApiException if fails to make API call
   */
  public void startExperiment(UUID experimentId) throws ApiException {
    startExperimentWithHttpInfo(experimentId, new StartExperimentOptionalParameters());
  }

  /**
   * Start experiment.
   *
   * <p>See {@link #startExperimentWithHttpInfoAsync}.
   *
   * @param experimentId The UUID of the experiment. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> startExperimentAsync(UUID experimentId) {
    return startExperimentWithHttpInfoAsync(experimentId, new StartExperimentOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Start experiment.
   *
   * <p>See {@link #startExperimentWithHttpInfo}.
   *
   * @param experimentId The UUID of the experiment. (required)
   * @param parameters Optional parameters for the request.
   * @throws ApiException if fails to make API call
   */
  public void startExperiment(UUID experimentId, StartExperimentOptionalParameters parameters)
      throws ApiException {
    startExperimentWithHttpInfo(experimentId, parameters);
  }

  /**
   * Start experiment.
   *
   * <p>See {@link #startExperimentWithHttpInfoAsync}.
   *
   * @param experimentId The UUID of the experiment. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture
   */
  public CompletableFuture<Void> startExperimentAsync(
      UUID experimentId, StartExperimentOptionalParameters parameters) {
    return startExperimentWithHttpInfoAsync(experimentId, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Start an experiment. The experiment is started exactly as it is configured; this endpoint
   * accepts no attributes, and a request body carrying any is rejected rather than ignored. Set the
   * run window, duration, or variants with PATCH /api/v2/experiments/{experiment_id} before
   * starting. An unconfigured draft returns HTTP 409. Configure either
   * warehouse_exposure_configuration or datadog_flag_configuration, plus the required experiment
   * fields, before starting. Start validation errors can include meta.configuration_pointer to
   * identify a field on the experiment to correct. For a flag-backed experiment this enables the
   * linked feature flag's environment, clears any stored variant override on it, and starts the
   * allocation's rollout. The request is idempotent: an experiment that is already running or ready
   * for a decision still returns 204, so a retry after a timeout is safe. One exception: an
   * experiment scheduled to start is accepted only when it is backed by your own feature flag; a
   * Datadog-flag experiment in that state returns 409 because its stored state and flag allocation
   * disagree. Cancel and conclude are not idempotent and return 409 when repeated.
   *
   * @param experimentId The UUID of the experiment. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> The experiment was started. </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Malformed experiment ID, a request body carrying attributes this endpoint does not accept, or an experiment managed by a specialized workflow that cannot use this start endpoint. </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Missing or invalid authentication (dd-api-key + dd-application-key headers, or a valid user session). </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authenticated caller lacks the product_analytics_experiments_write permission, lacks permission to edit this experiment, or lacks contribute permission on the feature flag owning its allocation. </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> No experiment with this ID exists for the organization. </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> The experiment cannot be started from its current state, its stored setup is incomplete (missing subject type, primary metric, variants, assignment source, or run window), its linked feature flag environment requires an approval, or that flag has a pending suggestion for a property this would change (environment status, override variant, rollout, or allocations). </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> startExperimentWithHttpInfo(
      UUID experimentId, StartExperimentOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = parameters.body;

    // verify the required parameter 'experimentId' is set
    if (experimentId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'experimentId' when calling startExperiment");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/experiments/{experiment_id}/start"
            .replaceAll(
                "\\{" + "experiment_id" + "\\}", apiClient.escapeString(experimentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ExperimentsApi.startExperiment",
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
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Start experiment.
   *
   * <p>See {@link #startExperimentWithHttpInfo}.
   *
   * @param experimentId The UUID of the experiment. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> startExperimentWithHttpInfoAsync(
      UUID experimentId, StartExperimentOptionalParameters parameters) {
    Object localVarPostBody = parameters.body;

    // verify the required parameter 'experimentId' is set
    if (experimentId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'experimentId' when calling startExperiment"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/experiments/{experiment_id}/start"
            .replaceAll(
                "\\{" + "experiment_id" + "\\}", apiClient.escapeString(experimentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ExperimentsApi.startExperiment",
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
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Unarchive exposure SQL model.
   *
   * <p>See {@link #unarchiveExposureSQLModelWithHttpInfo}.
   *
   * @param exposureSqlModelId The UUID of the exposure SQL model. (required)
   * @throws ApiException if fails to make API call
   */
  public void unarchiveExposureSQLModel(UUID exposureSqlModelId) throws ApiException {
    unarchiveExposureSQLModelWithHttpInfo(exposureSqlModelId);
  }

  /**
   * Unarchive exposure SQL model.
   *
   * <p>See {@link #unarchiveExposureSQLModelWithHttpInfoAsync}.
   *
   * @param exposureSqlModelId The UUID of the exposure SQL model. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> unarchiveExposureSQLModelAsync(UUID exposureSqlModelId) {
    return unarchiveExposureSQLModelWithHttpInfoAsync(exposureSqlModelId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Unarchive an exposure SQL model. Restores an archived model to the default list.
   *
   * @param exposureSqlModelId The UUID of the exposure SQL model. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> The exposure SQL model was unarchived. Unarchiving a model that is not archived succeeds and changes nothing. </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Malformed exposure SQL model ID (not a valid UUID). </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Missing or invalid authentication. </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authenticated caller lacks the product_analytics_warehouse_model_write permission. </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> No exposure SQL model with this ID exists for the organization. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> unarchiveExposureSQLModelWithHttpInfo(UUID exposureSqlModelId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'exposureSqlModelId' is set
    if (exposureSqlModelId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'exposureSqlModelId' when calling"
              + " unarchiveExposureSQLModel");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/experiments/exposure-sql-models/{exposure_sql_model_id}/unarchive"
            .replaceAll(
                "\\{" + "exposure_sql_model_id" + "\\}",
                apiClient.escapeString(exposureSqlModelId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ExperimentsApi.unarchiveExposureSQLModel",
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
   * Unarchive exposure SQL model.
   *
   * <p>See {@link #unarchiveExposureSQLModelWithHttpInfo}.
   *
   * @param exposureSqlModelId The UUID of the exposure SQL model. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> unarchiveExposureSQLModelWithHttpInfoAsync(
      UUID exposureSqlModelId) {
    Object localVarPostBody = null;

    // verify the required parameter 'exposureSqlModelId' is set
    if (exposureSqlModelId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'exposureSqlModelId' when calling"
                  + " unarchiveExposureSQLModel"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/experiments/exposure-sql-models/{exposure_sql_model_id}/unarchive"
            .replaceAll(
                "\\{" + "exposure_sql_model_id" + "\\}",
                apiClient.escapeString(exposureSqlModelId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ExperimentsApi.unarchiveExposureSQLModel",
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
   * Update experiment analysis plan attributes.
   *
   * <p>See {@link #updateExperimentAnalysisPlanAttributesWithHttpInfo}.
   *
   * @param experimentId The UUID of the experiment. (required)
   * @param body (required)
   * @return ExperimentsAnalysisPlanV2MutationResponse
   * @throws ApiException if fails to make API call
   */
  public ExperimentsAnalysisPlanV2MutationResponse updateExperimentAnalysisPlanAttributes(
      UUID experimentId, ExperimentsAnalysisPlanWriteV2Request body) throws ApiException {
    return updateExperimentAnalysisPlanAttributesWithHttpInfo(experimentId, body).getData();
  }

  /**
   * Update experiment analysis plan attributes.
   *
   * <p>See {@link #updateExperimentAnalysisPlanAttributesWithHttpInfoAsync}.
   *
   * @param experimentId The UUID of the experiment. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ExperimentsAnalysisPlanV2MutationResponse&gt;
   */
  public CompletableFuture<ExperimentsAnalysisPlanV2MutationResponse>
      updateExperimentAnalysisPlanAttributesAsync(
          UUID experimentId, ExperimentsAnalysisPlanWriteV2Request body) {
    return updateExperimentAnalysisPlanAttributesWithHttpInfoAsync(experimentId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update selected statistical analysis settings. Omitted attributes remain unchanged and nullable
   * attributes can be cleared with null. Protocol-locked settings cannot be changed.
   *
   * @param experimentId The UUID of the experiment. (required)
   * @param body (required)
   * @return ApiResponse&lt;ExperimentsAnalysisPlanV2MutationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> The requested change conflicts with settings locked by the experiment protocol. </td><td>  -  </td></tr>
   *       <tr><td> 415 </td><td> Request body sent with a media type other than application/json or application/vnd.api+json. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ExperimentsAnalysisPlanV2MutationResponse>
      updateExperimentAnalysisPlanAttributesWithHttpInfo(
          UUID experimentId, ExperimentsAnalysisPlanWriteV2Request body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'experimentId' is set
    if (experimentId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'experimentId' when calling"
              + " updateExperimentAnalysisPlanAttributes");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'body' when calling"
              + " updateExperimentAnalysisPlanAttributes");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/experiments/{experiment_id}/analysis-plan"
            .replaceAll(
                "\\{" + "experiment_id" + "\\}", apiClient.escapeString(experimentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ExperimentsApi.updateExperimentAnalysisPlanAttributes",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<ExperimentsAnalysisPlanV2MutationResponse>() {});
  }

  /**
   * Update experiment analysis plan attributes.
   *
   * <p>See {@link #updateExperimentAnalysisPlanAttributesWithHttpInfo}.
   *
   * @param experimentId The UUID of the experiment. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ExperimentsAnalysisPlanV2MutationResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ExperimentsAnalysisPlanV2MutationResponse>>
      updateExperimentAnalysisPlanAttributesWithHttpInfoAsync(
          UUID experimentId, ExperimentsAnalysisPlanWriteV2Request body) {
    Object localVarPostBody = body;

    // verify the required parameter 'experimentId' is set
    if (experimentId == null) {
      CompletableFuture<ApiResponse<ExperimentsAnalysisPlanV2MutationResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'experimentId' when calling"
                  + " updateExperimentAnalysisPlanAttributes"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<ExperimentsAnalysisPlanV2MutationResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling"
                  + " updateExperimentAnalysisPlanAttributes"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/experiments/{experiment_id}/analysis-plan"
            .replaceAll(
                "\\{" + "experiment_id" + "\\}", apiClient.escapeString(experimentId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ExperimentsApi.updateExperimentAnalysisPlanAttributes",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ExperimentsAnalysisPlanV2MutationResponse>> result =
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
        new GenericType<ExperimentsAnalysisPlanV2MutationResponse>() {});
  }

  /**
   * Update experiment metric group.
   *
   * <p>See {@link #updateExperimentMetricGroupWithHttpInfo}.
   *
   * @param experimentId The UUID of the experiment. (required)
   * @param metricGroupId The UUID of the metric group. (required)
   * @param body (required)
   * @return ExperimentsExperimentMetricGroupMutationV2
   * @throws ApiException if fails to make API call
   */
  public ExperimentsExperimentMetricGroupMutationV2 updateExperimentMetricGroup(
      UUID experimentId, UUID metricGroupId, ExperimentsPatchExperimentMetricGroupV2Request body)
      throws ApiException {
    return updateExperimentMetricGroupWithHttpInfo(experimentId, metricGroupId, body).getData();
  }

  /**
   * Update experiment metric group.
   *
   * <p>See {@link #updateExperimentMetricGroupWithHttpInfoAsync}.
   *
   * @param experimentId The UUID of the experiment. (required)
   * @param metricGroupId The UUID of the metric group. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ExperimentsExperimentMetricGroupMutationV2&gt;
   */
  public CompletableFuture<ExperimentsExperimentMetricGroupMutationV2>
      updateExperimentMetricGroupAsync(
          UUID experimentId,
          UUID metricGroupId,
          ExperimentsPatchExperimentMetricGroupV2Request body) {
    return updateExperimentMetricGroupWithHttpInfoAsync(experimentId, metricGroupId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update a non-decision metric group. Omitted attributes are unchanged; a supplied metrics array
   * is the complete ordered replacement. Decision groups remain managed through the experiment
   * resource. This operation does not synchronously recompute results.
   *
   * @param experimentId The UUID of the experiment. (required)
   * @param metricGroupId The UUID of the metric group. (required)
   * @param body (required)
   * @return ApiResponse&lt;ExperimentsExperimentMetricGroupMutationV2&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 415 </td><td> Request body sent with a media type other than application/json or application/vnd.api+json. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ExperimentsExperimentMetricGroupMutationV2>
      updateExperimentMetricGroupWithHttpInfo(
          UUID experimentId,
          UUID metricGroupId,
          ExperimentsPatchExperimentMetricGroupV2Request body)
          throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'experimentId' is set
    if (experimentId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'experimentId' when calling updateExperimentMetricGroup");
    }

    // verify the required parameter 'metricGroupId' is set
    if (metricGroupId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'metricGroupId' when calling"
              + " updateExperimentMetricGroup");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateExperimentMetricGroup");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/experiments/{experiment_id}/metric-groups/{metric_group_id}"
            .replaceAll(
                "\\{" + "experiment_id" + "\\}", apiClient.escapeString(experimentId.toString()))
            .replaceAll(
                "\\{" + "metric_group_id" + "\\}",
                apiClient.escapeString(metricGroupId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ExperimentsApi.updateExperimentMetricGroup",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<ExperimentsExperimentMetricGroupMutationV2>() {});
  }

  /**
   * Update experiment metric group.
   *
   * <p>See {@link #updateExperimentMetricGroupWithHttpInfo}.
   *
   * @param experimentId The UUID of the experiment. (required)
   * @param metricGroupId The UUID of the metric group. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ExperimentsExperimentMetricGroupMutationV2&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ExperimentsExperimentMetricGroupMutationV2>>
      updateExperimentMetricGroupWithHttpInfoAsync(
          UUID experimentId,
          UUID metricGroupId,
          ExperimentsPatchExperimentMetricGroupV2Request body) {
    Object localVarPostBody = body;

    // verify the required parameter 'experimentId' is set
    if (experimentId == null) {
      CompletableFuture<ApiResponse<ExperimentsExperimentMetricGroupMutationV2>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'experimentId' when calling"
                  + " updateExperimentMetricGroup"));
      return result;
    }

    // verify the required parameter 'metricGroupId' is set
    if (metricGroupId == null) {
      CompletableFuture<ApiResponse<ExperimentsExperimentMetricGroupMutationV2>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'metricGroupId' when calling"
                  + " updateExperimentMetricGroup"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<ExperimentsExperimentMetricGroupMutationV2>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling updateExperimentMetricGroup"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/experiments/{experiment_id}/metric-groups/{metric_group_id}"
            .replaceAll(
                "\\{" + "experiment_id" + "\\}", apiClient.escapeString(experimentId.toString()))
            .replaceAll(
                "\\{" + "metric_group_id" + "\\}",
                apiClient.escapeString(metricGroupId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ExperimentsApi.updateExperimentMetricGroup",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ExperimentsExperimentMetricGroupMutationV2>> result =
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
        new GenericType<ExperimentsExperimentMetricGroupMutationV2>() {});
  }

  /** Manage optional parameters to updateExposureSQLModel. */
  public static class UpdateExposureSQLModelOptionalParameters {
    private List<String> include;

    /**
     * Set include.
     *
     * @param include Optional fields to include. Repeat this parameter to request several fields.
     *     <code>counts</code> adds experiment_count to the updated model. (optional)
     * @return UpdateExposureSQLModelOptionalParameters
     */
    public UpdateExposureSQLModelOptionalParameters include(List<String> include) {
      this.include = include;
      return this;
    }
  }

  /**
   * Update exposure SQL model.
   *
   * <p>See {@link #updateExposureSQLModelWithHttpInfo}.
   *
   * @param exposureSqlModelId The UUID of the exposure SQL model. (required)
   * @param body (required)
   * @return ExperimentsUpdateExposureSQLModelV2Response
   * @throws ApiException if fails to make API call
   */
  public ExperimentsUpdateExposureSQLModelV2Response updateExposureSQLModel(
      UUID exposureSqlModelId, ExperimentsCreateExposureSQLModelV2Request body)
      throws ApiException {
    return updateExposureSQLModelWithHttpInfo(
            exposureSqlModelId, body, new UpdateExposureSQLModelOptionalParameters())
        .getData();
  }

  /**
   * Update exposure SQL model.
   *
   * <p>See {@link #updateExposureSQLModelWithHttpInfoAsync}.
   *
   * @param exposureSqlModelId The UUID of the exposure SQL model. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ExperimentsUpdateExposureSQLModelV2Response&gt;
   */
  public CompletableFuture<ExperimentsUpdateExposureSQLModelV2Response> updateExposureSQLModelAsync(
      UUID exposureSqlModelId, ExperimentsCreateExposureSQLModelV2Request body) {
    return updateExposureSQLModelWithHttpInfoAsync(
            exposureSqlModelId, body, new UpdateExposureSQLModelOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update exposure SQL model.
   *
   * <p>See {@link #updateExposureSQLModelWithHttpInfo}.
   *
   * @param exposureSqlModelId The UUID of the exposure SQL model. (required)
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return ExperimentsUpdateExposureSQLModelV2Response
   * @throws ApiException if fails to make API call
   */
  public ExperimentsUpdateExposureSQLModelV2Response updateExposureSQLModel(
      UUID exposureSqlModelId,
      ExperimentsCreateExposureSQLModelV2Request body,
      UpdateExposureSQLModelOptionalParameters parameters)
      throws ApiException {
    return updateExposureSQLModelWithHttpInfo(exposureSqlModelId, body, parameters).getData();
  }

  /**
   * Update exposure SQL model.
   *
   * <p>See {@link #updateExposureSQLModelWithHttpInfoAsync}.
   *
   * @param exposureSqlModelId The UUID of the exposure SQL model. (required)
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ExperimentsUpdateExposureSQLModelV2Response&gt;
   */
  public CompletableFuture<ExperimentsUpdateExposureSQLModelV2Response> updateExposureSQLModelAsync(
      UUID exposureSqlModelId,
      ExperimentsCreateExposureSQLModelV2Request body,
      UpdateExposureSQLModelOptionalParameters parameters) {
    return updateExposureSQLModelWithHttpInfoAsync(exposureSqlModelId, body, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Replace an exposure SQL model. This is a full replacement and is destructive: any subject type
   * or property not present in the body is deleted, and properties are matched on name, column_name
   * and column_type together, so changing one of those replaces the property rather than editing
   * it. Send the complete set you want to keep. Anything removed is listed under
   * meta.removed_subject_type_ids and meta.removed_property_names in the response. The warehouse
   * connection is not settable and is left as stored.
   *
   * @param exposureSqlModelId The UUID of the exposure SQL model. (required)
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;ExperimentsUpdateExposureSQLModelV2Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Malformed exposure SQL model ID, malformed body, validation failure, or the SQL was rejected by the warehouse validator. </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Missing or invalid authentication. </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authenticated caller lacks the product_analytics_warehouse_model_write permission. </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> No exposure SQL model with this ID exists for the organization. </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> The write collided with an existing record for the organization. </td><td>  -  </td></tr>
   *       <tr><td> 415 </td><td> Request body sent with a media type other than application/json or application/vnd.api+json. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ExperimentsUpdateExposureSQLModelV2Response>
      updateExposureSQLModelWithHttpInfo(
          UUID exposureSqlModelId,
          ExperimentsCreateExposureSQLModelV2Request body,
          UpdateExposureSQLModelOptionalParameters parameters)
          throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'exposureSqlModelId' is set
    if (exposureSqlModelId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'exposureSqlModelId' when calling"
              + " updateExposureSQLModel");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateExposureSQLModel");
    }
    List<String> include = parameters.include;
    // create path and map variables
    String localVarPath =
        "/api/v2/experiments/exposure-sql-models/{exposure_sql_model_id}"
            .replaceAll(
                "\\{" + "exposure_sql_model_id" + "\\}",
                apiClient.escapeString(exposureSqlModelId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "include", include));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ExperimentsApi.updateExposureSQLModel",
            localVarPath,
            localVarQueryParams,
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "PUT",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<ExperimentsUpdateExposureSQLModelV2Response>() {});
  }

  /**
   * Update exposure SQL model.
   *
   * <p>See {@link #updateExposureSQLModelWithHttpInfo}.
   *
   * @param exposureSqlModelId The UUID of the exposure SQL model. (required)
   * @param body (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;ExperimentsUpdateExposureSQLModelV2Response&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ExperimentsUpdateExposureSQLModelV2Response>>
      updateExposureSQLModelWithHttpInfoAsync(
          UUID exposureSqlModelId,
          ExperimentsCreateExposureSQLModelV2Request body,
          UpdateExposureSQLModelOptionalParameters parameters) {
    Object localVarPostBody = body;

    // verify the required parameter 'exposureSqlModelId' is set
    if (exposureSqlModelId == null) {
      CompletableFuture<ApiResponse<ExperimentsUpdateExposureSQLModelV2Response>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'exposureSqlModelId' when calling"
                  + " updateExposureSQLModel"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<ExperimentsUpdateExposureSQLModelV2Response>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateExposureSQLModel"));
      return result;
    }
    List<String> include = parameters.include;
    // create path and map variables
    String localVarPath =
        "/api/v2/experiments/exposure-sql-models/{exposure_sql_model_id}"
            .replaceAll(
                "\\{" + "exposure_sql_model_id" + "\\}",
                apiClient.escapeString(exposureSqlModelId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "include", include));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ExperimentsApi.updateExposureSQLModel",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ExperimentsUpdateExposureSQLModelV2Response>> result =
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
        new GenericType<ExperimentsUpdateExposureSQLModelV2Response>() {});
  }

  /**
   * Update metric.
   *
   * <p>See {@link #updateMetricWithHttpInfo}.
   *
   * @param metricId The UUID of the metric. (required)
   * @param body (required)
   * @return ExperimentsMetricV2DTO
   * @throws ApiException if fails to make API call
   */
  public ExperimentsMetricV2DTO updateMetric(UUID metricId, ExperimentsUpdateMetricV2Request body)
      throws ApiException {
    return updateMetricWithHttpInfo(metricId, body).getData();
  }

  /**
   * Update metric.
   *
   * <p>See {@link #updateMetricWithHttpInfoAsync}.
   *
   * @param metricId The UUID of the metric. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ExperimentsMetricV2DTO&gt;
   */
  public CompletableFuture<ExperimentsMetricV2DTO> updateMetricAsync(
      UUID metricId, ExperimentsUpdateMetricV2Request body) {
    return updateMetricWithHttpInfoAsync(metricId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update a metric. Certified metrics are read-only through this endpoint. This is a partial
   * update: every attribute is optional and an omitted attribute keeps its stored value, so a body
   * carrying only the fields being changed is enough. <code>guardrail_cutoff_threshold</code> is
   * nullable -- send null to clear it, omit it to leave it alone. Omitting the aggregation leaves
   * the metric's definition untouched; supplying one replaces it wholesale, and the metric's type
   * is re-derived from the shape supplied. Property filters use property_id or measure_id UUIDs
   * from the aggregation's data source. Attributes that are computed rather than stored (short_id,
   * metric_type, certified_at, experiment_count, created_at, updated_at) are rejected rather than
   * ignored, so a body copied from GET must have them removed. The is_certified attribute is
   * rejected. Certification cannot be changed through this endpoint.
   *
   * @param metricId The UUID of the metric. (required)
   * @param body (required)
   * @return ApiResponse&lt;ExperimentsMetricV2DTO&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Malformed ID or body, or validation failure. </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Missing or invalid authentication. </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Caller lacks product_analytics_metrics_write or edit access to this specific metric. </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> No metric with this ID exists for the organization. </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> The metric is imported, certified, or managed by metric sync, or another metric in this organization already uses one of these values. </td><td>  -  </td></tr>
   *       <tr><td> 415 </td><td> Request body sent with a media type other than application/json or application/vnd.api+json. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ExperimentsMetricV2DTO> updateMetricWithHttpInfo(
      UUID metricId, ExperimentsUpdateMetricV2Request body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'metricId' is set
    if (metricId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'metricId' when calling updateMetric");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateMetric");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/experiments/metrics/{metric_id}"
            .replaceAll("\\{" + "metric_id" + "\\}", apiClient.escapeString(metricId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ExperimentsApi.updateMetric",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<ExperimentsMetricV2DTO>() {});
  }

  /**
   * Update metric.
   *
   * <p>See {@link #updateMetricWithHttpInfo}.
   *
   * @param metricId The UUID of the metric. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ExperimentsMetricV2DTO&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ExperimentsMetricV2DTO>> updateMetricWithHttpInfoAsync(
      UUID metricId, ExperimentsUpdateMetricV2Request body) {
    Object localVarPostBody = body;

    // verify the required parameter 'metricId' is set
    if (metricId == null) {
      CompletableFuture<ApiResponse<ExperimentsMetricV2DTO>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'metricId' when calling updateMetric"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<ExperimentsMetricV2DTO>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'body' when calling updateMetric"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/experiments/metrics/{metric_id}"
            .replaceAll("\\{" + "metric_id" + "\\}", apiClient.escapeString(metricId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ExperimentsApi.updateMetric",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ExperimentsMetricV2DTO>> result = new CompletableFuture<>();
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
        new GenericType<ExperimentsMetricV2DTO>() {});
  }

  /**
   * Update metric collection.
   *
   * <p>See {@link #updateMetricCollectionWithHttpInfo}.
   *
   * @param metricCollectionId The UUID of the metric collection. (required)
   * @param body (required)
   * @return ExperimentsMetricCollectionV2DTO
   * @throws ApiException if fails to make API call
   */
  public ExperimentsMetricCollectionV2DTO updateMetricCollection(
      UUID metricCollectionId, ExperimentsPatchMetricCollectionV2Request body) throws ApiException {
    return updateMetricCollectionWithHttpInfo(metricCollectionId, body).getData();
  }

  /**
   * Update metric collection.
   *
   * <p>See {@link #updateMetricCollectionWithHttpInfoAsync}.
   *
   * @param metricCollectionId The UUID of the metric collection. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ExperimentsMetricCollectionV2DTO&gt;
   */
  public CompletableFuture<ExperimentsMetricCollectionV2DTO> updateMetricCollectionAsync(
      UUID metricCollectionId, ExperimentsPatchMetricCollectionV2Request body) {
    return updateMetricCollectionWithHttpInfoAsync(metricCollectionId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update metric collection.
   *
   * @param metricCollectionId The UUID of the metric collection. (required)
   * @param body (required)
   * @return ApiResponse&lt;ExperimentsMetricCollectionV2DTO&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 415 </td><td> Request body sent with a media type other than application/json or application/vnd.api+json. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ExperimentsMetricCollectionV2DTO> updateMetricCollectionWithHttpInfo(
      UUID metricCollectionId, ExperimentsPatchMetricCollectionV2Request body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'metricCollectionId' is set
    if (metricCollectionId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'metricCollectionId' when calling"
              + " updateMetricCollection");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateMetricCollection");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/experiments/metric-collections/{metric_collection_id}"
            .replaceAll(
                "\\{" + "metric_collection_id" + "\\}",
                apiClient.escapeString(metricCollectionId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ExperimentsApi.updateMetricCollection",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<ExperimentsMetricCollectionV2DTO>() {});
  }

  /**
   * Update metric collection.
   *
   * <p>See {@link #updateMetricCollectionWithHttpInfo}.
   *
   * @param metricCollectionId The UUID of the metric collection. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ExperimentsMetricCollectionV2DTO&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ExperimentsMetricCollectionV2DTO>>
      updateMetricCollectionWithHttpInfoAsync(
          UUID metricCollectionId, ExperimentsPatchMetricCollectionV2Request body) {
    Object localVarPostBody = body;

    // verify the required parameter 'metricCollectionId' is set
    if (metricCollectionId == null) {
      CompletableFuture<ApiResponse<ExperimentsMetricCollectionV2DTO>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'metricCollectionId' when calling"
                  + " updateMetricCollection"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<ExperimentsMetricCollectionV2DTO>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateMetricCollection"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/experiments/metric-collections/{metric_collection_id}"
            .replaceAll(
                "\\{" + "metric_collection_id" + "\\}",
                apiClient.escapeString(metricCollectionId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ExperimentsApi.updateMetricCollection",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ExperimentsMetricCollectionV2DTO>> result =
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
        new GenericType<ExperimentsMetricCollectionV2DTO>() {});
  }

  /**
   * Update metric SQL model.
   *
   * <p>See {@link #updateMetricSQLModelWithHttpInfo}.
   *
   * @param metricSqlModelId The UUID of the metric SQL model. (required)
   * @param body (required)
   * @return ExperimentsUpdateMetricSQLModelV2Response
   * @throws ApiException if fails to make API call
   */
  public ExperimentsUpdateMetricSQLModelV2Response updateMetricSQLModel(
      UUID metricSqlModelId, ExperimentsCreateMetricSQLModelV2Request body) throws ApiException {
    return updateMetricSQLModelWithHttpInfo(metricSqlModelId, body).getData();
  }

  /**
   * Update metric SQL model.
   *
   * <p>See {@link #updateMetricSQLModelWithHttpInfoAsync}.
   *
   * @param metricSqlModelId The UUID of the metric SQL model. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ExperimentsUpdateMetricSQLModelV2Response&gt;
   */
  public CompletableFuture<ExperimentsUpdateMetricSQLModelV2Response> updateMetricSQLModelAsync(
      UUID metricSqlModelId, ExperimentsCreateMetricSQLModelV2Request body) {
    return updateMetricSQLModelWithHttpInfoAsync(metricSqlModelId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Replace a metric SQL model. This is a destructive full replace: subject types, customer-defined
   * measures, and properties absent from the body are deleted, so send the complete set. Properties
   * are matched by name; changing a property's column, type, or description preserves its ID.
   * column_type is required for every measure and property. Removing a measure or property that an
   * active metric references returns 409 Conflict. Server-generated IDs returned by GET are
   * read-only and can be left in a replayed body. The response reports removals in
   * meta.deleted_subject_types, meta.deleted_measures, and meta.deleted_properties. Certification
   * is read-only. Certified models cannot be replaced through this endpoint.
   *
   * @param metricSqlModelId The UUID of the metric SQL model. (required)
   * @param body (required)
   * @return ApiResponse&lt;ExperimentsUpdateMetricSQLModelV2Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Malformed ID or body, validation failure, or the SQL was rejected by the warehouse validator. </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Missing or invalid authentication. </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authenticated caller lacks the product_analytics_warehouse_model_write permission. </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> No metric SQL model with this ID exists for the organization. </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> The model is certified or managed by metric sync, or the update would remove a measure or property still used by an active metric. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ExperimentsUpdateMetricSQLModelV2Response> updateMetricSQLModelWithHttpInfo(
      UUID metricSqlModelId, ExperimentsCreateMetricSQLModelV2Request body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'metricSqlModelId' is set
    if (metricSqlModelId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'metricSqlModelId' when calling updateMetricSQLModel");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateMetricSQLModel");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/experiments/metric-sql-models/{metric_sql_model_id}"
            .replaceAll(
                "\\{" + "metric_sql_model_id" + "\\}",
                apiClient.escapeString(metricSqlModelId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ExperimentsApi.updateMetricSQLModel",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "PUT",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<ExperimentsUpdateMetricSQLModelV2Response>() {});
  }

  /**
   * Update metric SQL model.
   *
   * <p>See {@link #updateMetricSQLModelWithHttpInfo}.
   *
   * @param metricSqlModelId The UUID of the metric SQL model. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ExperimentsUpdateMetricSQLModelV2Response&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ExperimentsUpdateMetricSQLModelV2Response>>
      updateMetricSQLModelWithHttpInfoAsync(
          UUID metricSqlModelId, ExperimentsCreateMetricSQLModelV2Request body) {
    Object localVarPostBody = body;

    // verify the required parameter 'metricSqlModelId' is set
    if (metricSqlModelId == null) {
      CompletableFuture<ApiResponse<ExperimentsUpdateMetricSQLModelV2Response>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'metricSqlModelId' when calling"
                  + " updateMetricSQLModel"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<ExperimentsUpdateMetricSQLModelV2Response>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateMetricSQLModel"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/experiments/metric-sql-models/{metric_sql_model_id}"
            .replaceAll(
                "\\{" + "metric_sql_model_id" + "\\}",
                apiClient.escapeString(metricSqlModelId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ExperimentsApi.updateMetricSQLModel",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ExperimentsUpdateMetricSQLModelV2Response>> result =
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
        new GenericType<ExperimentsUpdateMetricSQLModelV2Response>() {});
  }
}
