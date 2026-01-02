package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.ProductAnalyticsServerSideEventItem;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ProductAnalyticsApi {
  private ApiClient apiClient;

  public ProductAnalyticsApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public ProductAnalyticsApi(ApiClient apiClient) {
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
   * Send server-side events.
   *
   * <p>See {@link #submitProductAnalyticsEventWithHttpInfo}.
   *
   * @param body Server-side event to send (JSON format). (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object submitProductAnalyticsEvent(ProductAnalyticsServerSideEventItem body)
      throws ApiException {
    return submitProductAnalyticsEventWithHttpInfo(body).getData();
  }

  /**
   * Send server-side events.
   *
   * <p>See {@link #submitProductAnalyticsEventWithHttpInfoAsync}.
   *
   * @param body Server-side event to send (JSON format). (required)
   * @return CompletableFuture&lt;Object&gt;
   */
  public CompletableFuture<Object> submitProductAnalyticsEventAsync(
      ProductAnalyticsServerSideEventItem body) {
    return submitProductAnalyticsEventWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Send server-side events to Product Analytics. Server-side events are retained for 15 months.
   *
   * <p>Server-Side events in Product Analytics are helpful for tracking events that occur on the
   * server, as opposed to client-side events, which are captured by Real User Monitoring (RUM)
   * SDKs. This allows for a more comprehensive view of the user journey by including actions that
   * happen on the server. Typical examples could be <code>checkout.completed</code> or <code>
   * payment.processed</code>.
   *
   * <p>Ingested server-side events are integrated into Product Analytics to allow users to select
   * and filter these events in the event picker, similar to how views or actions are handled.
   *
   * <p><strong>Requirements:</strong> - At least one of <code>usr</code>, <code>account</code>, or
   * <code>session</code> must be provided with a valid ID. - The <code>application.id</code> must
   * reference a Product Analytics-enabled application.
   *
   * <p><strong>Custom Attributes:</strong> Any additional fields in the payload are flattened and
   * searchable as facets. For example, a payload with <code>{"customer": {"tier": "premium"}}
   * </code> is searchable with the syntax <code>@customer.tier:premium</code> in Datadog.
   *
   * <p>The status codes answered by the HTTP API are: - 202: Accepted: The request has been
   * accepted for processing - 400: Bad request (likely an issue in the payload formatting) - 401:
   * Unauthorized (likely a missing API Key) - 403: Permission issue (likely using an invalid API
   * Key) - 408: Request Timeout, request should be retried after some time - 413: Payload too large
   * (batch is above 5MB uncompressed) - 429: Too Many Requests, request should be retried after
   * some time - 500: Internal Server Error, the server encountered an unexpected condition that
   * prevented it from fulfilling the request, request should be retried after some time - 503:
   * Service Unavailable, the server is not ready to handle the request probably because it is
   * overloaded, request should be retried after some time
   *
   * @param body Server-side event to send (JSON format). (required)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 202 </td><td> Request accepted for processing (always 202 empty JSON). </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 408 </td><td> Request Timeout </td><td>  -  </td></tr>
   *       <tr><td> 413 </td><td> Payload Too Large </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
   *       <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Object> submitProductAnalyticsEventWithHttpInfo(
      ProductAnalyticsServerSideEventItem body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling submitProductAnalyticsEvent");
    }
    // create path and map variables
    String localVarPath = "/api/v2/prodlytics";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.ProductAnalyticsApi.submitProductAnalyticsEvent",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<Object>() {});
  }

  /**
   * Send server-side events.
   *
   * <p>See {@link #submitProductAnalyticsEventWithHttpInfo}.
   *
   * @param body Server-side event to send (JSON format). (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Object&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Object>> submitProductAnalyticsEventWithHttpInfoAsync(
      ProductAnalyticsServerSideEventItem body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Object>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling submitProductAnalyticsEvent"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/prodlytics";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.ProductAnalyticsApi.submitProductAnalyticsEvent",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Object>> result = new CompletableFuture<>();
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
        new GenericType<Object>() {});
  }
}
