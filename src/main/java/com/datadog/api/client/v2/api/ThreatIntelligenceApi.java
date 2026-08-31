package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.STIXBundleRequest;
import com.datadog.api.client.v2.model.STIXContentEncoding;
import com.datadog.api.client.v2.model.STIXIngestResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ThreatIntelligenceApi {
  private ApiClient apiClient;

  public ThreatIntelligenceApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public ThreatIntelligenceApi(ApiClient apiClient) {
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

  /** Manage optional parameters to addSTIXThreatIntel. */
  public static class AddSTIXThreatIntelOptionalParameters {
    private STIXContentEncoding contentEncoding;

    /**
     * Set contentEncoding.
     *
     * @param contentEncoding Content encoding for the request body. Use gzip for a compressed STIX
     *     bundle. (optional)
     * @return AddSTIXThreatIntelOptionalParameters
     */
    public AddSTIXThreatIntelOptionalParameters contentEncoding(
        STIXContentEncoding contentEncoding) {
      this.contentEncoding = contentEncoding;
      return this;
    }
  }

  /**
   * Ingest STIX threat intelligence.
   *
   * <p>See {@link #addSTIXThreatIntelWithHttpInfo}.
   *
   * @param tiVendor Vendor identifier for the feed. The value must not exceed 10 characters.
   *     Datadog normalizes the accepted value to lowercase, converts non-alphanumeric characters to
   *     underscores, and trims leading and trailing underscores. (required)
   * @param body A STIX 2.1 bundle containing indicator objects. The request body must not exceed 50
   *     MB as received or 100 MB after decompression. (required)
   * @return STIXIngestResponse
   * @throws ApiException if fails to make API call
   */
  public STIXIngestResponse addSTIXThreatIntel(String tiVendor, STIXBundleRequest body)
      throws ApiException {
    return addSTIXThreatIntelWithHttpInfo(
            tiVendor, body, new AddSTIXThreatIntelOptionalParameters())
        .getData();
  }

  /**
   * Ingest STIX threat intelligence.
   *
   * <p>See {@link #addSTIXThreatIntelWithHttpInfoAsync}.
   *
   * @param tiVendor Vendor identifier for the feed. The value must not exceed 10 characters.
   *     Datadog normalizes the accepted value to lowercase, converts non-alphanumeric characters to
   *     underscores, and trims leading and trailing underscores. (required)
   * @param body A STIX 2.1 bundle containing indicator objects. The request body must not exceed 50
   *     MB as received or 100 MB after decompression. (required)
   * @return CompletableFuture&lt;STIXIngestResponse&gt;
   */
  public CompletableFuture<STIXIngestResponse> addSTIXThreatIntelAsync(
      String tiVendor, STIXBundleRequest body) {
    return addSTIXThreatIntelWithHttpInfoAsync(
            tiVendor, body, new AddSTIXThreatIntelOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Ingest STIX threat intelligence.
   *
   * <p>See {@link #addSTIXThreatIntelWithHttpInfo}.
   *
   * @param tiVendor Vendor identifier for the feed. The value must not exceed 10 characters.
   *     Datadog normalizes the accepted value to lowercase, converts non-alphanumeric characters to
   *     underscores, and trims leading and trailing underscores. (required)
   * @param body A STIX 2.1 bundle containing indicator objects. The request body must not exceed 50
   *     MB as received or 100 MB after decompression. (required)
   * @param parameters Optional parameters for the request.
   * @return STIXIngestResponse
   * @throws ApiException if fails to make API call
   */
  public STIXIngestResponse addSTIXThreatIntel(
      String tiVendor, STIXBundleRequest body, AddSTIXThreatIntelOptionalParameters parameters)
      throws ApiException {
    return addSTIXThreatIntelWithHttpInfo(tiVendor, body, parameters).getData();
  }

  /**
   * Ingest STIX threat intelligence.
   *
   * <p>See {@link #addSTIXThreatIntelWithHttpInfoAsync}.
   *
   * @param tiVendor Vendor identifier for the feed. The value must not exceed 10 characters.
   *     Datadog normalizes the accepted value to lowercase, converts non-alphanumeric characters to
   *     underscores, and trims leading and trailing underscores. (required)
   * @param body A STIX 2.1 bundle containing indicator objects. The request body must not exceed 50
   *     MB as received or 100 MB after decompression. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;STIXIngestResponse&gt;
   */
  public CompletableFuture<STIXIngestResponse> addSTIXThreatIntelAsync(
      String tiVendor, STIXBundleRequest body, AddSTIXThreatIntelOptionalParameters parameters) {
    return addSTIXThreatIntelWithHttpInfoAsync(tiVendor, body, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Ingest a STIX 2.1 bundle containing threat intelligence indicators. Only indicator objects are
   * processed. Supported indicator patterns contain IPv4 addresses, IPv6 addresses, domain names,
   * or SHA-256 file hashes.
   *
   * <p>Non-indicator objects are ignored and are not included in the response counters. Indicator
   * objects with unsupported STIX versions or patterns that produce no supported observable values
   * increment the <code>unsupported</code> counter. Patterns that cannot be parsed increment the
   * <code>invalid</code> counter. Processing is best effort, so valid supported indicators in the
   * same bundle are still added.
   *
   * <p>A successful response means ingestion has completed. Reference-table materialization and
   * enrichment happen asynchronously. Requests are limited to 50 MB as received, 100 MB after
   * decompression, and 10 requests per second per API key. Gzip-compressed request bodies are
   * supported.
   *
   * @param tiVendor Vendor identifier for the feed. The value must not exceed 10 characters.
   *     Datadog normalizes the accepted value to lowercase, converts non-alphanumeric characters to
   *     underscores, and trims leading and trailing underscores. (required)
   * @param body A STIX 2.1 bundle containing indicator objects. The request body must not exceed 50
   *     MB as received or 100 MB after decompression. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;STIXIngestResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 413 </td><td> The request body exceeds 50 MB as received or 100 MB after decompression. </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *       <tr><td> 502 </td><td> The STIX ingestion service returned an error while processing the request. </td><td>  -  </td></tr>
   *       <tr><td> 503 </td><td> The STIX ingestion service is temporarily unavailable. </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<STIXIngestResponse> addSTIXThreatIntelWithHttpInfo(
      String tiVendor, STIXBundleRequest body, AddSTIXThreatIntelOptionalParameters parameters)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "addSTIXThreatIntel";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'tiVendor' is set
    if (tiVendor == null) {
      throw new ApiException(
          400, "Missing the required parameter 'tiVendor' when calling addSTIXThreatIntel");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling addSTIXThreatIntel");
    }
    STIXContentEncoding contentEncoding = parameters.contentEncoding;
    // create path and map variables
    String localVarPath = "/api/v2/security/threat-intel/stix";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    if (tiVendor != null) {
      localVarHeaderParams.put("ti_vendor", apiClient.parameterToString(tiVendor));
    }
    if (contentEncoding != null) {
      localVarHeaderParams.put("Content-Encoding", apiClient.parameterToString(contentEncoding));
    }

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ThreatIntelligenceApi.addSTIXThreatIntel",
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
        new GenericType<STIXIngestResponse>() {});
  }

  /**
   * Ingest STIX threat intelligence.
   *
   * <p>See {@link #addSTIXThreatIntelWithHttpInfo}.
   *
   * @param tiVendor Vendor identifier for the feed. The value must not exceed 10 characters.
   *     Datadog normalizes the accepted value to lowercase, converts non-alphanumeric characters to
   *     underscores, and trims leading and trailing underscores. (required)
   * @param body A STIX 2.1 bundle containing indicator objects. The request body must not exceed 50
   *     MB as received or 100 MB after decompression. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;STIXIngestResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<STIXIngestResponse>> addSTIXThreatIntelWithHttpInfoAsync(
      String tiVendor, STIXBundleRequest body, AddSTIXThreatIntelOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "addSTIXThreatIntel";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<STIXIngestResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'tiVendor' is set
    if (tiVendor == null) {
      CompletableFuture<ApiResponse<STIXIngestResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'tiVendor' when calling addSTIXThreatIntel"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<STIXIngestResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling addSTIXThreatIntel"));
      return result;
    }
    STIXContentEncoding contentEncoding = parameters.contentEncoding;
    // create path and map variables
    String localVarPath = "/api/v2/security/threat-intel/stix";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    if (tiVendor != null) {
      localVarHeaderParams.put("ti_vendor", apiClient.parameterToString(tiVendor));
    }
    if (contentEncoding != null) {
      localVarHeaderParams.put("Content-Encoding", apiClient.parameterToString(contentEncoding));
    }

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ThreatIntelligenceApi.addSTIXThreatIntel",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<STIXIngestResponse>> result = new CompletableFuture<>();
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
        new GenericType<STIXIngestResponse>() {});
  }
}
