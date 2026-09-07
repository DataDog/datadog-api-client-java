package com.datadog.api.client.v1.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v1.model.EventCreateRequest;
import com.datadog.api.client.v1.model.EventCreateResponse;
import com.datadog.api.client.v1.model.EventListResponse;
import com.datadog.api.client.v1.model.EventPriority;
import com.datadog.api.client.v1.model.EventResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
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
   * @param body Event request object (required)
   * @return EventCreateResponse
   * @throws ApiException if fails to make API call
   */
  public EventCreateResponse createEvent(EventCreateRequest body) throws ApiException {
    return createEventWithHttpInfo(body).getData();
  }

  /**
   * Post an event.
   *
   * <p>See {@link #createEventWithHttpInfoAsync}.
   *
   * @param body Event request object (required)
   * @return CompletableFuture&lt;EventCreateResponse&gt;
   */
  public CompletableFuture<EventCreateResponse> createEventAsync(EventCreateRequest body) {
    return createEventWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * This endpoint allows you to post events to the stream. Tag them, set priority and event
   * aggregate them with other events.
   *
   * @param body Event request object (required)
   * @return ApiResponse&lt;EventCreateResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 202 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<EventCreateResponse> createEventWithHttpInfo(EventCreateRequest body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createEvent");
    }
    // create path and map variables
    String localVarPath = "/api/v1/events";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v1.EventsApi.createEvent",
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
        new GenericType<EventCreateResponse>() {});
  }

  /**
   * Post an event.
   *
   * <p>See {@link #createEventWithHttpInfo}.
   *
   * @param body Event request object (required)
   * @return CompletableFuture&lt;ApiResponse&lt;EventCreateResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<EventCreateResponse>> createEventWithHttpInfoAsync(
      EventCreateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<EventCreateResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'body' when calling createEvent"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/events";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1.EventsApi.createEvent",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<EventCreateResponse>> result = new CompletableFuture<>();
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
        new GenericType<EventCreateResponse>() {});
  }

  /**
   * Get an event.
   *
   * <p>See {@link #getEventWithHttpInfo}.
   *
   * @param eventId The ID of the event. (required)
   * @return EventResponse
   * @throws ApiException if fails to make API call
   */
  public EventResponse getEvent(Long eventId) throws ApiException {
    return getEventWithHttpInfo(eventId).getData();
  }

  /**
   * Get an event.
   *
   * <p>See {@link #getEventWithHttpInfoAsync}.
   *
   * @param eventId The ID of the event. (required)
   * @return CompletableFuture&lt;EventResponse&gt;
   */
  public CompletableFuture<EventResponse> getEventAsync(Long eventId) {
    return getEventWithHttpInfoAsync(eventId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * This endpoint allows you to query for event details.
   *
   * <p><strong>Note</strong>: If the event you’re querying contains markdown formatting of any
   * kind, you may see characters such as <code>%</code>,<code>\</code>,<code>n</code> in your
   * output.
   *
   * @param eventId The ID of the event. (required)
   * @return ApiResponse&lt;EventResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Item Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<EventResponse> getEventWithHttpInfo(Long eventId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'eventId' is set
    if (eventId == null) {
      throw new ApiException(400, "Missing the required parameter 'eventId' when calling getEvent");
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/events/{event_id}"
            .replaceAll("\\{" + "event_id" + "\\}", apiClient.escapeString(eventId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v1.EventsApi.getEvent",
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
        new GenericType<EventResponse>() {});
  }

  /**
   * Get an event.
   *
   * <p>See {@link #getEventWithHttpInfo}.
   *
   * @param eventId The ID of the event. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;EventResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<EventResponse>> getEventWithHttpInfoAsync(Long eventId) {
    Object localVarPostBody = null;

    // verify the required parameter 'eventId' is set
    if (eventId == null) {
      CompletableFuture<ApiResponse<EventResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'eventId' when calling getEvent"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/events/{event_id}"
            .replaceAll("\\{" + "event_id" + "\\}", apiClient.escapeString(eventId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1.EventsApi.getEvent",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<EventResponse>> result = new CompletableFuture<>();
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
        new GenericType<EventResponse>() {});
  }

  /** Manage optional parameters to listEvents. */
  public static class ListEventsOptionalParameters {
    private EventPriority priority;
    private String sources;
    private String tags;
    private Boolean unaggregated;
    private Boolean excludeAggregate;
    private Integer page;

    /**
     * Set priority.
     *
     * @param priority Priority of your events, either <code>low</code> or <code>normal</code>.
     *     (optional)
     * @return ListEventsOptionalParameters
     */
    public ListEventsOptionalParameters priority(EventPriority priority) {
      this.priority = priority;
      return this;
    }

    /**
     * Set sources.
     *
     * @param sources A comma separated string of sources. (optional)
     * @return ListEventsOptionalParameters
     */
    public ListEventsOptionalParameters sources(String sources) {
      this.sources = sources;
      return this;
    }

    /**
     * Set tags.
     *
     * @param tags A comma separated list indicating what tags, if any, should be used to filter the
     *     list of events. (optional)
     * @return ListEventsOptionalParameters
     */
    public ListEventsOptionalParameters tags(String tags) {
      this.tags = tags;
      return this;
    }

    /**
     * Set unaggregated.
     *
     * @param unaggregated Set unaggregated to <code>true</code> to return all events within the
     *     specified [<code>start</code>,<code>end</code>] timeframe. Otherwise if an event is
     *     aggregated to a parent event with a timestamp outside of the timeframe, it won't be
     *     available in the output. Aggregated events with <code>is_aggregate=true</code> in the
     *     response will still be returned unless exclude_aggregate is set to <code>true.</code>
     *     (optional)
     * @return ListEventsOptionalParameters
     */
    public ListEventsOptionalParameters unaggregated(Boolean unaggregated) {
      this.unaggregated = unaggregated;
      return this;
    }

    /**
     * Set excludeAggregate.
     *
     * @param excludeAggregate Set <code>exclude_aggregate</code> to <code>true</code> to only
     *     return unaggregated events where <code>is_aggregate=false</code> in the response. If the
     *     <code>exclude_aggregate</code> parameter is set to <code>true</code>, then the
     *     unaggregated parameter is ignored and will be <code>true</code> by default. (optional)
     * @return ListEventsOptionalParameters
     */
    public ListEventsOptionalParameters excludeAggregate(Boolean excludeAggregate) {
      this.excludeAggregate = excludeAggregate;
      return this;
    }

    /**
     * Set page.
     *
     * @param page By default 1000 results are returned per request. Set page to the number of the
     *     page to return with <code>0</code> being the first page. The page parameter can only be
     *     used when either unaggregated or exclude_aggregate is set to <code>true.</code>
     *     (optional)
     * @return ListEventsOptionalParameters
     */
    public ListEventsOptionalParameters page(Integer page) {
      this.page = page;
      return this;
    }
  }

  /**
   * Get a list of events.
   *
   * <p>See {@link #listEventsWithHttpInfo}.
   *
   * @param start POSIX timestamp. (required)
   * @param end POSIX timestamp. (required)
   * @return EventListResponse
   * @throws ApiException if fails to make API call
   */
  public EventListResponse listEvents(Long start, Long end) throws ApiException {
    return listEventsWithHttpInfo(start, end, new ListEventsOptionalParameters()).getData();
  }

  /**
   * Get a list of events.
   *
   * <p>See {@link #listEventsWithHttpInfoAsync}.
   *
   * @param start POSIX timestamp. (required)
   * @param end POSIX timestamp. (required)
   * @return CompletableFuture&lt;EventListResponse&gt;
   */
  public CompletableFuture<EventListResponse> listEventsAsync(Long start, Long end) {
    return listEventsWithHttpInfoAsync(start, end, new ListEventsOptionalParameters())
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
   * @param start POSIX timestamp. (required)
   * @param end POSIX timestamp. (required)
   * @param parameters Optional parameters for the request.
   * @return EventListResponse
   * @throws ApiException if fails to make API call
   */
  public EventListResponse listEvents(Long start, Long end, ListEventsOptionalParameters parameters)
      throws ApiException {
    return listEventsWithHttpInfo(start, end, parameters).getData();
  }

  /**
   * Get a list of events.
   *
   * <p>See {@link #listEventsWithHttpInfoAsync}.
   *
   * @param start POSIX timestamp. (required)
   * @param end POSIX timestamp. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;EventListResponse&gt;
   */
  public CompletableFuture<EventListResponse> listEventsAsync(
      Long start, Long end, ListEventsOptionalParameters parameters) {
    return listEventsWithHttpInfoAsync(start, end, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * The event stream can be queried and filtered by time, priority, sources and tags.
   *
   * <p><strong>Notes</strong>: - If the event you’re querying contains markdown formatting of any
   * kind, you may see characters such as <code>%</code>,<code>\</code>,<code>n</code> in your
   * output.
   *
   * <ul>
   *   <li>This endpoint returns a maximum of <code>1000</code> most recent results. To return
   *       additional results, identify the last timestamp of the last result and set that as the
   *       <code>end</code> query time to paginate the results. You can also use the page parameter
   *       to specify which set of <code>1000</code> results to return.
   * </ul>
   *
   * @param start POSIX timestamp. (required)
   * @param end POSIX timestamp. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;EventListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<EventListResponse> listEventsWithHttpInfo(
      Long start, Long end, ListEventsOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'start' is set
    if (start == null) {
      throw new ApiException(400, "Missing the required parameter 'start' when calling listEvents");
    }

    // verify the required parameter 'end' is set
    if (end == null) {
      throw new ApiException(400, "Missing the required parameter 'end' when calling listEvents");
    }
    EventPriority priority = parameters.priority;
    String sources = parameters.sources;
    String tags = parameters.tags;
    Boolean unaggregated = parameters.unaggregated;
    Boolean excludeAggregate = parameters.excludeAggregate;
    Integer page = parameters.page;
    // create path and map variables
    String localVarPath = "/api/v1/events";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start", start));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end", end));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "priority", priority));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sources", sources));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "tags", tags));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "unaggregated", unaggregated));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "exclude_aggregate", excludeAggregate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v1.EventsApi.listEvents",
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
        new GenericType<EventListResponse>() {});
  }

  /**
   * Get a list of events.
   *
   * <p>See {@link #listEventsWithHttpInfo}.
   *
   * @param start POSIX timestamp. (required)
   * @param end POSIX timestamp. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;EventListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<EventListResponse>> listEventsWithHttpInfoAsync(
      Long start, Long end, ListEventsOptionalParameters parameters) {
    Object localVarPostBody = null;

    // verify the required parameter 'start' is set
    if (start == null) {
      CompletableFuture<ApiResponse<EventListResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'start' when calling listEvents"));
      return result;
    }

    // verify the required parameter 'end' is set
    if (end == null) {
      CompletableFuture<ApiResponse<EventListResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'end' when calling listEvents"));
      return result;
    }
    EventPriority priority = parameters.priority;
    String sources = parameters.sources;
    String tags = parameters.tags;
    Boolean unaggregated = parameters.unaggregated;
    Boolean excludeAggregate = parameters.excludeAggregate;
    Integer page = parameters.page;
    // create path and map variables
    String localVarPath = "/api/v1/events";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start", start));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end", end));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "priority", priority));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sources", sources));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "tags", tags));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "unaggregated", unaggregated));
    localVarQueryParams.addAll(
        apiClient.parameterToPairs("", "exclude_aggregate", excludeAggregate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1.EventsApi.listEvents",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<EventListResponse>> result = new CompletableFuture<>();
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
        new GenericType<EventListResponse>() {});
  }
}
