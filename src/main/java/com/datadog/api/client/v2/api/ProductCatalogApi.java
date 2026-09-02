package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.ProductCatalogSKUsAPIVersion;
import com.datadog.api.client.v2.model.ProductCatalogSKUsResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ProductCatalogApi {
  private ApiClient apiClient;

  public ProductCatalogApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public ProductCatalogApi(ApiClient apiClient) {
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

  /** Manage optional parameters to listProductCatalogSKUs. */
  public static class ListProductCatalogSKUsOptionalParameters {
    private OffsetDateTime asOfDate;

    /**
     * Set asOfDate.
     *
     * @param asOfDate The date the returned prices, allotments, and pricing tiers are effective as
     *     of, in <code>YYYY-MM-DD</code> format. Defaults to the date of the request, and must not
     *     be later than it. (optional)
     * @return ListProductCatalogSKUsOptionalParameters
     */
    public ListProductCatalogSKUsOptionalParameters asOfDate(OffsetDateTime asOfDate) {
      this.asOfDate = asOfDate;
      return this;
    }
  }

  /**
   * List SKUs.
   *
   * <p>See {@link #listProductCatalogSKUsWithHttpInfo}.
   *
   * @param version The version of the product catalog contract to return. <code>v1</code> is the
   *     latest. (required)
   * @return ProductCatalogSKUsResponse
   * @throws ApiException if fails to make API call
   */
  public ProductCatalogSKUsResponse listProductCatalogSKUs(ProductCatalogSKUsAPIVersion version)
      throws ApiException {
    return listProductCatalogSKUsWithHttpInfo(
            version, new ListProductCatalogSKUsOptionalParameters())
        .getData();
  }

  /**
   * List SKUs.
   *
   * <p>See {@link #listProductCatalogSKUsWithHttpInfoAsync}.
   *
   * @param version The version of the product catalog contract to return. <code>v1</code> is the
   *     latest. (required)
   * @return CompletableFuture&lt;ProductCatalogSKUsResponse&gt;
   */
  public CompletableFuture<ProductCatalogSKUsResponse> listProductCatalogSKUsAsync(
      ProductCatalogSKUsAPIVersion version) {
    return listProductCatalogSKUsWithHttpInfoAsync(
            version, new ListProductCatalogSKUsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List SKUs.
   *
   * <p>See {@link #listProductCatalogSKUsWithHttpInfo}.
   *
   * @param version The version of the product catalog contract to return. <code>v1</code> is the
   *     latest. (required)
   * @param parameters Optional parameters for the request.
   * @return ProductCatalogSKUsResponse
   * @throws ApiException if fails to make API call
   */
  public ProductCatalogSKUsResponse listProductCatalogSKUs(
      ProductCatalogSKUsAPIVersion version, ListProductCatalogSKUsOptionalParameters parameters)
      throws ApiException {
    return listProductCatalogSKUsWithHttpInfo(version, parameters).getData();
  }

  /**
   * List SKUs.
   *
   * <p>See {@link #listProductCatalogSKUsWithHttpInfoAsync}.
   *
   * @param version The version of the product catalog contract to return. <code>v1</code> is the
   *     latest. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ProductCatalogSKUsResponse&gt;
   */
  public CompletableFuture<ProductCatalogSKUsResponse> listProductCatalogSKUsAsync(
      ProductCatalogSKUsAPIVersion version, ListProductCatalogSKUsOptionalParameters parameters) {
    return listProductCatalogSKUsWithHttpInfoAsync(version, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get every generally available Datadog SKU, with the pricing and allotment metadata that applies
   * to it, for the Datadog site serving the request. A SKU is generally available when it is billed
   * through a metered commitment or through automatic billing; SKUs in any other phase are not
   * returned.
   *
   * <p>Prices, allotments, and pricing tiers are returned as they were in effect on <code>
   * as_of_date</code>, which defaults to the date of the request. Prices are public list prices:
   * they do not reflect discounts, commitments, or negotiated rates on an account.
   *
   * <p>Each SKU is a separate resource in <code>data</code>, identified by its SKU code, and sorted
   * by that code in ascending order. The whole catalog is returned in a single response, so this
   * endpoint is not paginated.
   *
   * @param version The version of the product catalog contract to return. <code>v1</code> is the
   *     latest. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;ProductCatalogSKUsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request - version is missing or invalid, or as_of_date is malformed or in the future </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden - the caller has neither the billing_read nor the usage_read permission </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found - the requested catalog version is not supported </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ProductCatalogSKUsResponse> listProductCatalogSKUsWithHttpInfo(
      ProductCatalogSKUsAPIVersion version, ListProductCatalogSKUsOptionalParameters parameters)
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listProductCatalogSKUs";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'version' is set
    if (version == null) {
      throw new ApiException(
          400, "Missing the required parameter 'version' when calling listProductCatalogSKUs");
    }
    OffsetDateTime asOfDate = parameters.asOfDate;
    // create path and map variables
    String localVarPath = "/api/v2/product-catalog/skus";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "version", version));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "as_of_date", asOfDate));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ProductCatalogApi.listProductCatalogSKUs",
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
        new GenericType<ProductCatalogSKUsResponse>() {});
  }

  /**
   * List SKUs.
   *
   * <p>See {@link #listProductCatalogSKUsWithHttpInfo}.
   *
   * @param version The version of the product catalog contract to return. <code>v1</code> is the
   *     latest. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;ProductCatalogSKUsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ProductCatalogSKUsResponse>>
      listProductCatalogSKUsWithHttpInfoAsync(
          ProductCatalogSKUsAPIVersion version,
          ListProductCatalogSKUsOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "listProductCatalogSKUs";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<ProductCatalogSKUsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'version' is set
    if (version == null) {
      CompletableFuture<ApiResponse<ProductCatalogSKUsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'version' when calling listProductCatalogSKUs"));
      return result;
    }
    OffsetDateTime asOfDate = parameters.asOfDate;
    // create path and map variables
    String localVarPath = "/api/v2/product-catalog/skus";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "version", version));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "as_of_date", asOfDate));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ProductCatalogApi.listProductCatalogSKUs",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ProductCatalogSKUsResponse>> result = new CompletableFuture<>();
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
        new GenericType<ProductCatalogSKUsResponse>() {});
  }
}
