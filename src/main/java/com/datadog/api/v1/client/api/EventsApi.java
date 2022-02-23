package com.datadog.api.v1.client.api;

import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.ApiResponse;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.Pair;
import com.datadog.api.v1.client.model.EventCreateRequest;
import com.datadog.api.v1.client.model.EventCreateResponse;
import com.datadog.api.v1.client.model.EventListResponse;
import com.datadog.api.v1.client.model.EventPriority;
import com.datadog.api.v1.client.model.EventResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.core.GenericType;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class EventsApi {
  private ApiClient apiClient;

  public EventsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public EventsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get the API client
   *
   * @return API client
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * Set the API client
   *
   * @param apiClient an instance of API client
   */
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Post an event
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
   * Post an event
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
   * Post an event
   *
   * <p>This endpoint allows you to post events to the stream. Tag them, set priority and event
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
            "EventsApi.createEvent",
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
   * Post an event
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

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "createEvent");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "EventsApi.createEvent",
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
   * Get an event
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
   * Get an event
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
   * Get an event
   *
   * <p>This endpoint allows you to query for event details. **Note**: If the event you’re querying
   * contains markdown formatting of any kind, you may see characters such as
   * &#x60;%&#x60;,&#x60;\\&#x60;,&#x60;n&#x60; in your output.
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
            "EventsApi.getEvent",
            localVarPath,
            new ArrayList<Pair>(),
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
        new GenericType<EventResponse>() {});
  }

  /**
   * Get an event
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

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getEvent");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "EventsApi.getEvent",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
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
     * Set priority
     *
     * @param priority Priority of your events, either &#x60;low&#x60; or &#x60;normal&#x60;.
     *     (optional)
     * @return ListEventsOptionalParameters
     */
    public ListEventsOptionalParameters priority(EventPriority priority) {
      this.priority = priority;
      return this;
    }

    /**
     * Set sources
     *
     * @param sources A comma separated string of sources. (optional)
     * @return ListEventsOptionalParameters
     */
    public ListEventsOptionalParameters sources(String sources) {
      this.sources = sources;
      return this;
    }

    /**
     * Set tags
     *
     * @param tags A comma separated list indicating what tags, if any, should be used to filter the
     *     list of monitors by scope. (optional)
     * @return ListEventsOptionalParameters
     */
    public ListEventsOptionalParameters tags(String tags) {
      this.tags = tags;
      return this;
    }

    /**
     * Set unaggregated
     *
     * @param unaggregated Set unaggregated to &#x60;true&#x60; to return all events within the
     *     specified [&#x60;start&#x60;,&#x60;end&#x60;] timeframe. Otherwise if an event is
     *     aggregated to a parent event with a timestamp outside of the timeframe, it won&#39;t be
     *     available in the output. Aggregated events with &#x60;is_aggregate&#x3D;true&#x60; in the
     *     response will still be returned unless exclude_aggregate is set to &#x60;true.&#x60;
     *     (optional)
     * @return ListEventsOptionalParameters
     */
    public ListEventsOptionalParameters unaggregated(Boolean unaggregated) {
      this.unaggregated = unaggregated;
      return this;
    }

    /**
     * Set excludeAggregate
     *
     * @param excludeAggregate Set &#x60;exclude_aggregate&#x60; to &#x60;true&#x60; to only return
     *     unaggregated events where &#x60;is_aggregate&#x3D;false&#x60; in the response. If the
     *     &#x60;exclude_aggregate&#x60; parameter is set to &#x60;true&#x60;, then the unaggregated
     *     parameter is ignored and will be &#x60;true&#x60; by default. (optional)
     * @return ListEventsOptionalParameters
     */
    public ListEventsOptionalParameters excludeAggregate(Boolean excludeAggregate) {
      this.excludeAggregate = excludeAggregate;
      return this;
    }

    /**
     * Set page
     *
     * @param page By default 1000 results are returned per request. Set page to the number of the
     *     page to return with &#x60;0&#x60; being the first page. The page parameter can only be
     *     used when either unaggregated or exclude_aggregate is set to &#x60;true.&#x60; (optional)
     * @return ListEventsOptionalParameters
     */
    public ListEventsOptionalParameters page(Integer page) {
      this.page = page;
      return this;
    }
  }

  /**
   * Query the event stream
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
   * Query the event stream
   *
   * <p>See {@link #listEventsWithHttpInfo}.
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
   * Query the event stream
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
   * Query the event stream
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
   * Query the event stream
   *
   * <p>The event stream can be queried and filtered by time, priority, sources and tags. **Notes**:
   * - If the event you’re querying contains markdown formatting of any kind, you may see characters
   * such as &#x60;%&#x60;,&#x60;\\&#x60;,&#x60;n&#x60; in your output. - This endpoint returns a
   * maximum of &#x60;1000&#x60; most recent results. To return additional results, identify the
   * last timestamp of the last result and set that as the &#x60;end&#x60; query time to paginate
   * the results. You can also use the page parameter to specify which set of &#x60;1000&#x60;
   * results to return.
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
            "EventsApi.listEvents",
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
        new GenericType<EventListResponse>() {});
  }

  /**
   * Query the event stream
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

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listEvents");

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "EventsApi.listEvents",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
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
