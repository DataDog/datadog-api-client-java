package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.PaginationIterable;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.CreateEventEmailAddressRequest;
import com.datadog.api.client.v2.model.CreateOnCallEventEmailAddressRequest;
import com.datadog.api.client.v2.model.EventCreateRequestPayload;
import com.datadog.api.client.v2.model.EventCreateResponsePayload;
import com.datadog.api.client.v2.model.EventEmailAddressResponse;
import com.datadog.api.client.v2.model.EventEmailAddressResponseArray;
import com.datadog.api.client.v2.model.EventResponse;
import com.datadog.api.client.v2.model.EventsListRequest;
import com.datadog.api.client.v2.model.EventsListResponse;
import com.datadog.api.client.v2.model.EventsRequestPage;
import com.datadog.api.client.v2.model.EventsSort;
import com.datadog.api.client.v2.model.V2EventResponse;
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
public class EventsApi {
  private ApiClient apiClient;

  public EventsApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public EventsApi(ApiClient apiClient) {
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
   * Post an event.
   *
   * <p>See {@link #createEventWithHttpInfo}.
   *
   * @param body Event creation request payload. (required)
   * @return EventCreateResponsePayload
   * @throws ApiException if fails to make API call
   */
  public EventCreateResponsePayload createEvent(EventCreateRequestPayload body)
      throws ApiException {
    return createEventWithHttpInfo(body).getData();
  }

  /**
   * Post an event.
   *
   * <p>See {@link #createEventWithHttpInfoAsync}.
   *
   * @param body Event creation request payload. (required)
   * @return CompletableFuture&lt;EventCreateResponsePayload&gt;
   */
  public CompletableFuture<EventCreateResponsePayload> createEventAsync(
      EventCreateRequestPayload body) {
    return createEventWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * This endpoint allows you to publish events.
   *
   * <p><strong>Note:</strong> To utilize this endpoint with our client libraries, please ensure you
   * are using the latest version released on or after July 1, 2025. Earlier versions do not support
   * this functionality.
   *
   * <p>✅ <strong>Only events with the <code>change</code> or <code>alert</code> category</strong>
   * are in General Availability. For change events, see <a
   * href="https://docs.datadoghq.com/change_tracking">Change Tracking</a> for more details.
   *
   * <p>❌ For use cases involving other event categories, use the V1 endpoint or reach out to <a
   * href="https://www.datadoghq.com/support/">support</a>.
   *
   * <p>❌ Notifications are not yet supported for events sent to this endpoint. Use the V1 endpoint
   * for notification functionality.
   *
   * @param body Event creation request payload. (required)
   * @return ApiResponse&lt;EventCreateResponsePayload&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 202 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<EventCreateResponsePayload> createEventWithHttpInfo(
      EventCreateRequestPayload body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createEvent");
    }
    // create path and map variables
    String localVarPath = "/api/v2/events";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.EventsApi.createEvent",
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
        new GenericType<EventCreateResponsePayload>() {});
  }

  /**
   * Post an event.
   *
   * <p>See {@link #createEventWithHttpInfo}.
   *
   * @param body Event creation request payload. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;EventCreateResponsePayload&gt;&gt;
   */
  public CompletableFuture<ApiResponse<EventCreateResponsePayload>> createEventWithHttpInfoAsync(
      EventCreateRequestPayload body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<EventCreateResponsePayload>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'body' when calling createEvent"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/events";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.EventsApi.createEvent",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<EventCreateResponsePayload>> result = new CompletableFuture<>();
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
        new GenericType<EventCreateResponsePayload>() {});
  }

  /**
   * Create event email address.
   *
   * <p>See {@link #createEventEmailAddressWithHttpInfo}.
   *
   * @param body (required)
   * @return EventEmailAddressResponse
   * @throws ApiException if fails to make API call
   */
  public EventEmailAddressResponse createEventEmailAddress(CreateEventEmailAddressRequest body)
      throws ApiException {
    return createEventEmailAddressWithHttpInfo(body).getData();
  }

  /**
   * Create event email address.
   *
   * <p>See {@link #createEventEmailAddressWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;EventEmailAddressResponse&gt;
   */
  public CompletableFuture<EventEmailAddressResponse> createEventEmailAddressAsync(
      CreateEventEmailAddressRequest body) {
    return createEventEmailAddressWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * @param body (required)
   * @return ApiResponse&lt;EventEmailAddressResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<EventEmailAddressResponse> createEventEmailAddressWithHttpInfo(
      CreateEventEmailAddressRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createEventEmailAddress";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createEventEmailAddress");
    }
    // create path and map variables
    String localVarPath = "/api/v2/events/mail";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.EventsApi.createEventEmailAddress",
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
        new GenericType<EventEmailAddressResponse>() {});
  }

  /**
   * Create event email address.
   *
   * <p>See {@link #createEventEmailAddressWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;EventEmailAddressResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<EventEmailAddressResponse>>
      createEventEmailAddressWithHttpInfoAsync(CreateEventEmailAddressRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createEventEmailAddress";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<EventEmailAddressResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<EventEmailAddressResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createEventEmailAddress"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/events/mail";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.EventsApi.createEventEmailAddress",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<EventEmailAddressResponse>> result = new CompletableFuture<>();
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
        new GenericType<EventEmailAddressResponse>() {});
  }

  /**
   * Create on-call event email address.
   *
   * <p>See {@link #createOnCallEventEmailAddressWithHttpInfo}.
   *
   * @param body (required)
   * @return EventEmailAddressResponse
   * @throws ApiException if fails to make API call
   */
  public EventEmailAddressResponse createOnCallEventEmailAddress(
      CreateOnCallEventEmailAddressRequest body) throws ApiException {
    return createOnCallEventEmailAddressWithHttpInfo(body).getData();
  }

  /**
   * Create on-call event email address.
   *
   * <p>See {@link #createOnCallEventEmailAddressWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;EventEmailAddressResponse&gt;
   */
  public CompletableFuture<EventEmailAddressResponse> createOnCallEventEmailAddressAsync(
      CreateOnCallEventEmailAddressRequest body) {
    return createOnCallEventEmailAddressWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * @param body (required)
   * @return ApiResponse&lt;EventEmailAddressResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<EventEmailAddressResponse> createOnCallEventEmailAddressWithHttpInfo(
      CreateOnCallEventEmailAddressRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createOnCallEventEmailAddress";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createOnCallEventEmailAddress");
    }
    // create path and map variables
    String localVarPath = "/api/v2/events/mail/on-call";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.EventsApi.createOnCallEventEmailAddress",
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
        new GenericType<EventEmailAddressResponse>() {});
  }

  /**
   * Create on-call event email address.
   *
   * <p>See {@link #createOnCallEventEmailAddressWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;EventEmailAddressResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<EventEmailAddressResponse>>
      createOnCallEventEmailAddressWithHttpInfoAsync(CreateOnCallEventEmailAddressRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createOnCallEventEmailAddress";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<EventEmailAddressResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<EventEmailAddressResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'body' when calling createOnCallEventEmailAddress"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/events/mail/on-call";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.EventsApi.createOnCallEventEmailAddress",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<EventEmailAddressResponse>> result = new CompletableFuture<>();
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
        new GenericType<EventEmailAddressResponse>() {});
  }

  /**
   * Get an event.
   *
   * <p>See {@link #getEventWithHttpInfo}.
   *
   * @param eventId The UID of the event. (required)
   * @return V2EventResponse
   * @throws ApiException if fails to make API call
   */
  public V2EventResponse getEvent(String eventId) throws ApiException {
    return getEventWithHttpInfo(eventId).getData();
  }

  /**
   * Get an event.
   *
   * <p>See {@link #getEventWithHttpInfoAsync}.
   *
   * @param eventId The UID of the event. (required)
   * @return CompletableFuture&lt;V2EventResponse&gt;
   */
  public CompletableFuture<V2EventResponse> getEventAsync(String eventId) {
    return getEventWithHttpInfoAsync(eventId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the details of an event by <code>event_id</code>.
   *
   * @param eventId The UID of the event. (required)
   * @return ApiResponse&lt;V2EventResponse&gt;
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
  public ApiResponse<V2EventResponse> getEventWithHttpInfo(String eventId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'eventId' is set
    if (eventId == null) {
      throw new ApiException(400, "Missing the required parameter 'eventId' when calling getEvent");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/events/{event_id}"
            .replaceAll("\\{" + "event_id" + "\\}", apiClient.escapeString(eventId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.EventsApi.getEvent",
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
        new GenericType<V2EventResponse>() {});
  }

  /**
   * Get an event.
   *
   * <p>See {@link #getEventWithHttpInfo}.
   *
   * @param eventId The UID of the event. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;V2EventResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<V2EventResponse>> getEventWithHttpInfoAsync(String eventId) {
    Object localVarPostBody = null;

    // verify the required parameter 'eventId' is set
    if (eventId == null) {
      CompletableFuture<ApiResponse<V2EventResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'eventId' when calling getEvent"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/events/{event_id}"
            .replaceAll("\\{" + "event_id" + "\\}", apiClient.escapeString(eventId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.EventsApi.getEvent",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<V2EventResponse>> result = new CompletableFuture<>();
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
        new GenericType<V2EventResponse>() {});
  }

  /**
   * Get on-call event email address.
   *
   * <p>See {@link #getOnCallEventEmailAddressWithHttpInfo}.
   *
   * @return EventEmailAddressResponseArray
   * @throws ApiException if fails to make API call
   */
  public EventEmailAddressResponseArray getOnCallEventEmailAddress() throws ApiException {
    return getOnCallEventEmailAddressWithHttpInfo().getData();
  }

  /**
   * Get on-call event email address.
   *
   * <p>See {@link #getOnCallEventEmailAddressWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;EventEmailAddressResponseArray&gt;
   */
  public CompletableFuture<EventEmailAddressResponseArray> getOnCallEventEmailAddressAsync() {
    return getOnCallEventEmailAddressWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * @return ApiResponse&lt;EventEmailAddressResponseArray&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<EventEmailAddressResponseArray> getOnCallEventEmailAddressWithHttpInfo()
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getOnCallEventEmailAddress";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/events/mail/on-call";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.EventsApi.getOnCallEventEmailAddress",
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
        new GenericType<EventEmailAddressResponseArray>() {});
  }

  /**
   * Get on-call event email address.
   *
   * <p>See {@link #getOnCallEventEmailAddressWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;EventEmailAddressResponseArray&gt;&gt;
   */
  public CompletableFuture<ApiResponse<EventEmailAddressResponseArray>>
      getOnCallEventEmailAddressWithHttpInfoAsync() {
    // Check if unstable operation is enabled
    String operationId = "getOnCallEventEmailAddress";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<EventEmailAddressResponseArray>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/events/mail/on-call";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.EventsApi.getOnCallEventEmailAddress",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<EventEmailAddressResponseArray>> result =
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
        new GenericType<EventEmailAddressResponseArray>() {});
  }

  /**
   * List event email addresses.
   *
   * <p>See {@link #listEventEmailAddressesWithHttpInfo}.
   *
   * @return EventEmailAddressResponseArray
   * @throws ApiException if fails to make API call
   */
  public EventEmailAddressResponseArray listEventEmailAddresses() throws ApiException {
    return listEventEmailAddressesWithHttpInfo().getData();
  }

  /**
   * List event email addresses.
   *
   * <p>See {@link #listEventEmailAddressesWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;EventEmailAddressResponseArray&gt;
   */
  public CompletableFuture<EventEmailAddressResponseArray> listEventEmailAddressesAsync() {
    return listEventEmailAddressesWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * @return ApiResponse&lt;EventEmailAddressResponseArray&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<EventEmailAddressResponseArray> listEventEmailAddressesWithHttpInfo()
      throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listEventEmailAddresses";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/events/mail";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.EventsApi.listEventEmailAddresses",
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
        new GenericType<EventEmailAddressResponseArray>() {});
  }

  /**
   * List event email addresses.
   *
   * <p>See {@link #listEventEmailAddressesWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;EventEmailAddressResponseArray&gt;&gt;
   */
  public CompletableFuture<ApiResponse<EventEmailAddressResponseArray>>
      listEventEmailAddressesWithHttpInfoAsync() {
    // Check if unstable operation is enabled
    String operationId = "listEventEmailAddresses";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<EventEmailAddressResponseArray>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/events/mail";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.EventsApi.listEventEmailAddresses",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<EventEmailAddressResponseArray>> result =
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
        new GenericType<EventEmailAddressResponseArray>() {});
  }

  /** Manage optional parameters to listEvents. */
  public static class ListEventsOptionalParameters {
    private String filterQuery;
    private String filterFrom;
    private String filterTo;
    private EventsSort sort;
    private String pageCursor;
    private Integer pageLimit;

    /**
     * Set filterQuery.
     *
     * @param filterQuery Search query following events syntax. (optional)
     * @return ListEventsOptionalParameters
     */
    public ListEventsOptionalParameters filterQuery(String filterQuery) {
      this.filterQuery = filterQuery;
      return this;
    }

    /**
     * Set filterFrom.
     *
     * @param filterFrom Minimum timestamp for requested events, in milliseconds. (optional)
     * @return ListEventsOptionalParameters
     */
    public ListEventsOptionalParameters filterFrom(String filterFrom) {
      this.filterFrom = filterFrom;
      return this;
    }

    /**
     * Set filterTo.
     *
     * @param filterTo Maximum timestamp for requested events, in milliseconds. (optional)
     * @return ListEventsOptionalParameters
     */
    public ListEventsOptionalParameters filterTo(String filterTo) {
      this.filterTo = filterTo;
      return this;
    }

    /**
     * Set sort.
     *
     * @param sort Order of events in results. (optional)
     * @return ListEventsOptionalParameters
     */
    public ListEventsOptionalParameters sort(EventsSort sort) {
      this.sort = sort;
      return this;
    }

    /**
     * Set pageCursor.
     *
     * @param pageCursor List following results with a cursor provided in the previous query.
     *     (optional)
     * @return ListEventsOptionalParameters
     */
    public ListEventsOptionalParameters pageCursor(String pageCursor) {
      this.pageCursor = pageCursor;
      return this;
    }

    /**
     * Set pageLimit.
     *
     * @param pageLimit Maximum number of events in the response. (optional, default to 10)
     * @return ListEventsOptionalParameters
     */
    public ListEventsOptionalParameters pageLimit(Integer pageLimit) {
      this.pageLimit = pageLimit;
      return this;
    }
  }

  /**
   * Get a list of events.
   *
   * <p>See {@link #listEventsWithHttpInfo}.
   *
   * @return EventsListResponse
   * @throws ApiException if fails to make API call
   */
  public EventsListResponse listEvents() throws ApiException {
    return listEventsWithHttpInfo(new ListEventsOptionalParameters()).getData();
  }

  /**
   * Get a list of events.
   *
   * <p>See {@link #listEventsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;EventsListResponse&gt;
   */
  public CompletableFuture<EventsListResponse> listEventsAsync() {
    return listEventsWithHttpInfoAsync(new ListEventsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a list of events.
   *
   * <p>See {@link #listEventsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return EventsListResponse
   * @throws ApiException if fails to make API call
   */
  public EventsListResponse listEvents(ListEventsOptionalParameters parameters)
      throws ApiException {
    return listEventsWithHttpInfo(parameters).getData();
  }

  /**
   * Get a list of events.
   *
   * <p>See {@link #listEventsWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;EventsListResponse&gt;
   */
  public CompletableFuture<EventsListResponse> listEventsAsync(
      ListEventsOptionalParameters parameters) {
    return listEventsWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a list of events.
   *
   * <p>See {@link #listEventsWithHttpInfo}.
   *
   * @return PaginationIterable&lt;EventResponse&gt;
   */
  public PaginationIterable<EventResponse> listEventsWithPagination() {
    ListEventsOptionalParameters parameters = new ListEventsOptionalParameters();
    return listEventsWithPagination(parameters);
  }

  /**
   * Get a list of events.
   *
   * <p>See {@link #listEventsWithHttpInfo}.
   *
   * @return EventsListResponse
   */
  public PaginationIterable<EventResponse> listEventsWithPagination(
      ListEventsOptionalParameters parameters) {
    String resultsPath = "getData";
    String valueGetterPath = "getMeta.getPage.getAfter";
    String valueSetterPath = "pageCursor";
    Boolean valueSetterParamOptional = true;
    Integer limit;

    if (parameters.pageLimit == null) {
      limit = 10;
      parameters.pageLimit(limit);
    } else {
      limit = parameters.pageLimit;
    }

    LinkedHashMap<String, Object> args = new LinkedHashMap<String, Object>();
    args.put("optionalParams", parameters);

    PaginationIterable iterator =
        new PaginationIterable(
            this,
            "listEvents",
            resultsPath,
            valueGetterPath,
            valueSetterPath,
            valueSetterParamOptional,
            true,
            limit,
            args);

    return iterator;
  }

  /**
   * List endpoint returns events that match an events search query. <a
   * href="https://docs.datadoghq.com/logs/guide/collect-multiple-logs-with-pagination">Results are
   * paginated similarly to logs</a>.
   *
   * <p>Use this endpoint to see your latest events.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;EventsListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<EventsListResponse> listEventsWithHttpInfo(
      ListEventsOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    String filterQuery = parameters.filterQuery;
    String filterFrom = parameters.filterFrom;
    String filterTo = parameters.filterTo;
    EventsSort sort = parameters.sort;
    String pageCursor = parameters.pageCursor;
    Integer pageLimit = parameters.pageLimit;
    // create path and map variables
    String localVarPath = "/api/v2/events";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[query]", filterQuery));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[from]", filterFrom));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[to]", filterTo));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[cursor]", pageCursor));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.EventsApi.listEvents",
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
        new GenericType<EventsListResponse>() {});
  }

  /**
   * Get a list of events.
   *
   * <p>See {@link #listEventsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;EventsListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<EventsListResponse>> listEventsWithHttpInfoAsync(
      ListEventsOptionalParameters parameters) {
    Object localVarPostBody = null;
    String filterQuery = parameters.filterQuery;
    String filterFrom = parameters.filterFrom;
    String filterTo = parameters.filterTo;
    EventsSort sort = parameters.sort;
    String pageCursor = parameters.pageCursor;
    Integer pageLimit = parameters.pageLimit;
    // create path and map variables
    String localVarPath = "/api/v2/events";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[query]", filterQuery));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[from]", filterFrom));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[to]", filterTo));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[cursor]", pageCursor));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.EventsApi.listEvents",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<EventsListResponse>> result = new CompletableFuture<>();
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
        new GenericType<EventsListResponse>() {});
  }

  /** Manage optional parameters to searchEvents. */
  public static class SearchEventsOptionalParameters {
    private EventsListRequest body;

    /**
     * Set body.
     *
     * @param body (optional)
     * @return SearchEventsOptionalParameters
     */
    public SearchEventsOptionalParameters body(EventsListRequest body) {
      this.body = body;
      return this;
    }
  }

  /**
   * Search events.
   *
   * <p>See {@link #searchEventsWithHttpInfo}.
   *
   * @return EventsListResponse
   * @throws ApiException if fails to make API call
   */
  public EventsListResponse searchEvents() throws ApiException {
    return searchEventsWithHttpInfo(new SearchEventsOptionalParameters()).getData();
  }

  /**
   * Search events.
   *
   * <p>See {@link #searchEventsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;EventsListResponse&gt;
   */
  public CompletableFuture<EventsListResponse> searchEventsAsync() {
    return searchEventsWithHttpInfoAsync(new SearchEventsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Search events.
   *
   * <p>See {@link #searchEventsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return EventsListResponse
   * @throws ApiException if fails to make API call
   */
  public EventsListResponse searchEvents(SearchEventsOptionalParameters parameters)
      throws ApiException {
    return searchEventsWithHttpInfo(parameters).getData();
  }

  /**
   * Search events.
   *
   * <p>See {@link #searchEventsWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;EventsListResponse&gt;
   */
  public CompletableFuture<EventsListResponse> searchEventsAsync(
      SearchEventsOptionalParameters parameters) {
    return searchEventsWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Search events.
   *
   * <p>See {@link #searchEventsWithHttpInfo}.
   *
   * @return PaginationIterable&lt;EventResponse&gt;
   */
  public PaginationIterable<EventResponse> searchEventsWithPagination() {
    SearchEventsOptionalParameters parameters = new SearchEventsOptionalParameters();
    return searchEventsWithPagination(parameters);
  }

  /**
   * Search events.
   *
   * <p>See {@link #searchEventsWithHttpInfo}.
   *
   * @return EventsListResponse
   */
  public PaginationIterable<EventResponse> searchEventsWithPagination(
      SearchEventsOptionalParameters parameters) {
    String resultsPath = "getData";
    String valueGetterPath = "getMeta.getPage.getAfter";
    String valueSetterPath = "body.getPage.setCursor";
    Boolean valueSetterParamOptional = true;
    Integer limit;

    if (parameters.body == null) {
      parameters.body(new EventsListRequest());
    }

    if (parameters.body.getPage() == null) {
      parameters.body.setPage(new EventsRequestPage());
    }

    if (parameters.body.getPage().getLimit() == null) {
      limit = 10;
      parameters.body.getPage().setLimit(limit);
    } else {
      limit = parameters.body.getPage().getLimit();
    }

    LinkedHashMap<String, Object> args = new LinkedHashMap<String, Object>();
    args.put("optionalParams", parameters);

    PaginationIterable iterator =
        new PaginationIterable(
            this,
            "searchEvents",
            resultsPath,
            valueGetterPath,
            valueSetterPath,
            valueSetterParamOptional,
            true,
            limit,
            args);

    return iterator;
  }

  /**
   * List endpoint returns events that match an events search query. <a
   * href="https://docs.datadoghq.com/logs/guide/collect-multiple-logs-with-pagination">Results are
   * paginated similarly to logs</a>.
   *
   * <p>Use this endpoint to build complex events filtering and search.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;EventsListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Not Authorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<EventsListResponse> searchEventsWithHttpInfo(
      SearchEventsOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = parameters.body;
    // create path and map variables
    String localVarPath = "/api/v2/events/search";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.EventsApi.searchEvents",
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
        new GenericType<EventsListResponse>() {});
  }

  /**
   * Search events.
   *
   * <p>See {@link #searchEventsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;EventsListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<EventsListResponse>> searchEventsWithHttpInfoAsync(
      SearchEventsOptionalParameters parameters) {
    Object localVarPostBody = parameters.body;
    // create path and map variables
    String localVarPath = "/api/v2/events/search";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.EventsApi.searchEvents",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<EventsListResponse>> result = new CompletableFuture<>();
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
        new GenericType<EventsListResponse>() {});
  }
}
