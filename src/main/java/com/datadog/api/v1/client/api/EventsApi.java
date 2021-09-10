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
   * Post an event This endpoint allows you to post events to the stream. Tag them, set priority and
   * event aggregate them with other events.
   *
   * @param body Event request object (required)
   * @return EventCreateResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 202 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *     </table>
   */
  public EventCreateResponse createEvent(EventCreateRequest body) throws ApiException {
    return createEventWithHttpInfo(body).getData();
  }

  /**
   * Post an event This endpoint allows you to post events to the stream. Tag them, set priority and
   * event aggregate them with other events.
   *
   * @param body Event request object (required)
   * @return ApiResponse&lt;EventCreateResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 202 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "createEvent");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth"};

    GenericType<EventCreateResponse> localVarReturnType = new GenericType<EventCreateResponse>() {};

    return apiClient.invokeAPI(
        "EventsApi.createEvent",
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false);
  }

  /**
   * Get an event This endpoint allows you to query for event details. **Note**: If the event you’re
   * querying contains markdown formatting of any kind, you may see characters such as
   * &#x60;%&#x60;,&#x60;\\&#x60;,&#x60;n&#x60; in your output.
   *
   * @param eventId The ID of the event. (required)
   * @return EventResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Item Not Found </td><td>  -  </td></tr>
   *     </table>
   */
  public EventResponse getEvent(Long eventId) throws ApiException {
    return getEventWithHttpInfo(eventId).getData();
  }

  /**
   * Get an event This endpoint allows you to query for event details. **Note**: If the event you’re
   * querying contains markdown formatting of any kind, you may see characters such as
   * &#x60;%&#x60;,&#x60;\\&#x60;,&#x60;n&#x60; in your output.
   *
   * @param eventId The ID of the event. (required)
   * @return ApiResponse&lt;EventResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Item Not Found </td><td>  -  </td></tr>
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getEvent");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<EventResponse> localVarReturnType = new GenericType<EventResponse>() {};

    return apiClient.invokeAPI(
        "EventsApi.getEvent",
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false);
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
   * Query the event stream The event stream can be queried and filtered by time, priority, sources
   * and tags. **Notes**: - If the event you’re querying contains markdown formatting of any kind,
   * you may see characters such as &#x60;%&#x60;,&#x60;\\&#x60;,&#x60;n&#x60; in your output. -
   * This endpoint returns a maximum of &#x60;1000&#x60; most recent results. To return additional
   * results, identify the last timestamp of the last result and set that as the &#x60;end&#x60;
   * query time to paginate the results. You can also use the page parameter to specify which set of
   * &#x60;1000&#x60; results to return.
   *
   * @param start POSIX timestamp. (required)
   * @param end POSIX timestamp. (required)
   * @return EventListResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *     </table>
   */
  public EventListResponse listEvents(Long start, Long end) throws ApiException {
    return listEventsWithHttpInfo(start, end, new ListEventsOptionalParameters()).getData();
  }

  /**
   * Query the event stream The event stream can be queried and filtered by time, priority, sources
   * and tags. **Notes**: - If the event you’re querying contains markdown formatting of any kind,
   * you may see characters such as &#x60;%&#x60;,&#x60;\\&#x60;,&#x60;n&#x60; in your output. -
   * This endpoint returns a maximum of &#x60;1000&#x60; most recent results. To return additional
   * results, identify the last timestamp of the last result and set that as the &#x60;end&#x60;
   * query time to paginate the results. You can also use the page parameter to specify which set of
   * &#x60;1000&#x60; results to return.
   *
   * @param start POSIX timestamp. (required)
   * @param end POSIX timestamp. (required)
   * @param parameters Optional parameters for the request.
   * @return EventListResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><th> Status Code </th><th> Description </th><th> Response Headers </th></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *     </table>
   */
  public EventListResponse listEvents(Long start, Long end, ListEventsOptionalParameters parameters)
      throws ApiException {
    return listEventsWithHttpInfo(start, end, parameters).getData();
  }

  /**
   * Query the event stream The event stream can be queried and filtered by time, priority, sources
   * and tags. **Notes**: - If the event you’re querying contains markdown formatting of any kind,
   * you may see characters such as &#x60;%&#x60;,&#x60;\\&#x60;,&#x60;n&#x60; in your output. -
   * This endpoint returns a maximum of &#x60;1000&#x60; most recent results. To return additional
   * results, identify the last timestamp of the last result and set that as the &#x60;end&#x60;
   * query time to paginate the results. You can also use the page parameter to specify which set of
   * &#x60;1000&#x60; results to return.
   *
   * @param start POSIX timestamp. (required)
   * @param end POSIX timestamp. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;EventListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
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

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth", "appKeyAuth"};

    GenericType<EventListResponse> localVarReturnType = new GenericType<EventListResponse>() {};

    return apiClient.invokeAPI(
        "EventsApi.listEvents",
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false);
  }
}
