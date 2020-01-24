package com.datadog.api.v1.client.api;

import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiResponse;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.Pair;

import javax.ws.rs.core.GenericType;

import com.datadog.api.v1.client.model.Error400;
import com.datadog.api.v1.client.model.Error403;
import com.datadog.api.v1.client.model.Error404;
import com.datadog.api.v1.client.model.Event;
import com.datadog.api.v1.client.model.EventListResponse;
import com.datadog.api.v1.client.model.EventResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class EventsApi {
  private ApiClient apiClient;

  public EventsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public EventsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

private ApiResponse<EventResponse> createEventWithHttpInfo(Event body) throws ApiException {
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


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<EventResponse> localVarReturnType = new GenericType<EventResponse>() {};
    return apiClient.invokeAPI("EventsApi.createEvent", localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIcreateEventRequest {
    private Event body;

    private APIcreateEventRequest() {
    }
    

    /**
     * Set body
     * @param body Event request object (required)
     * @return APIcreateEventRequest
     */
    public APIcreateEventRequest body(Event body) {
      this.body = body;
      return this;
    }
    

    /**
     * Execute createEvent request
     * @return EventResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 202 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       </table>
     
     */
    
    public EventResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute createEvent request with HTTP info returned
     * @return ApiResponse&lt;EventResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 202 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<EventResponse> executeWithHttpInfo() throws ApiException {
      return createEventWithHttpInfo(body);
    }
  }

  /**
   * Post an event
   * ### Overview This endpoint allows you to post events to the stream. Tag them, set priority and event aggregate them with other events. ### Arguments * **&#x60;title&#x60;** [*required*]:     The event title. *Limited to 100 characters.*     Use &#x60;msg_title&#x60; with [the Datadog Ruby library][1].  * **&#x60;text&#x60;** [*required*]:     The body of the event. *Limited to 4000 characters.*     The text supports [markdown][2].     Use &#x60;msg_text&#x60; with [the Datadog Ruby library][1]  * **&#x60;date_happened&#x60;** [*optional*, *default* &#x3D; **now**]:     POSIX timestamp of the event. Must be sent as an integer (i.e. no quotes). *Limited to events no older than 1 year, 24 days (389 days)*  * **&#x60;priority&#x60;** [*optional*, *default* &#x3D; **normal**]:     The priority of the event: **normal** or **low**.  * **&#x60;host&#x60;** [*optional*, *default*&#x3D;**None**]:     Host name to associate with the event. Any tags associated with the host are also applied to this event.  * **&#x60;tags&#x60;** [*optional*, *default*&#x3D;**None**]:     A list of tags to apply to the event.  * **&#x60;alert_type&#x60;** [*optional*, *default* &#x3D; **info**]:     If it&#39;s an alert event, set its type between: **error**, **warning**, **info**, and **success**.  * **&#x60;aggregation_key&#x60;** [*optional*, *default*&#x3D;**None**]:     An arbitrary string to use for aggregation. *Limited to 100 characters.*     If you specify a key, all events using that key are grouped together in the Event Stream.  * **&#x60;source_type_name&#x60;** [*optional*, *default*&#x3D;**None**]:     The type of event being posted.     Options: **nagios**, **hudson**, **jenkins**, **my_apps**, **chef**, **puppet**, **git**, **bitbucket**...     [Complete list of source attribute values][3]  * **&#x60;related_event_id&#x60;** [*optional*, *default*&#x3D;**None**]:     ID of the parent event. Must be sent as an integer (i.e. no quotes).  * **&#x60;device_name&#x60;** [*optional*, *default*&#x3D;**None**]:     A list of device names to post the event with.
   * @return createEventRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIcreateEventRequest createEvent() throws ApiException {
    return new APIcreateEventRequest();
  }

private ApiResponse<EventResponse> getEventWithHttpInfo(Long eventId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'eventId' is set
    if (eventId == null) {
      throw new ApiException(400, "Missing the required parameter 'eventId' when calling getEvent");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/events/{event_id}"
      .replaceAll("\\{" + "event_id" + "\\}", apiClient.escapeString(eventId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<EventResponse> localVarReturnType = new GenericType<EventResponse>() {};
    return apiClient.invokeAPI("EventsApi.getEvent", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIgetEventRequest {
    private Long eventId;

    private APIgetEventRequest(Long eventId) {
      this.eventId = eventId;
    }
    

    /**
     * Execute getEvent request
     * @return EventResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Item Not Found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public EventResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getEvent request with HTTP info returned
     * @return ApiResponse&lt;EventResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Item Not Found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<EventResponse> executeWithHttpInfo() throws ApiException {
      return getEventWithHttpInfo(eventId);
    }
  }

  /**
   * Get an event
   * ### Overview This endpoint allows you to query for event details. Note: if the event you’re querying contains markdown formatting of any kind, you may see characters such as %,\\,n in your output.
   * @param eventId The id of the event (required)
   * @return getEventRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIgetEventRequest getEvent(Long eventId) throws ApiException {
    return new APIgetEventRequest(eventId);
  }

private ApiResponse<EventListResponse> listEventsWithHttpInfo(Long start, Long end, String priority, String sources, String tags, Boolean unaggregated) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'start' is set
    if (start == null) {
      throw new ApiException(400, "Missing the required parameter 'start' when calling listEvents");
    }
    
    // verify the required parameter 'end' is set
    if (end == null) {
      throw new ApiException(400, "Missing the required parameter 'end' when calling listEvents");
    }
    
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

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<EventListResponse> localVarReturnType = new GenericType<EventListResponse>() {};
    return apiClient.invokeAPI("EventsApi.listEvents", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIlistEventsRequest {
    private Long start;
    private Long end;
    private String priority;
    private String sources;
    private String tags;
    private Boolean unaggregated;

    private APIlistEventsRequest() {
    }
    

    /**
     * Set start
     * @param start POSIX timestamp. (required)
     * @return APIlistEventsRequest
     */
    public APIlistEventsRequest start(Long start) {
      this.start = start;
      return this;
    }
    

    /**
     * Set end
     * @param end POSIX timestamp. (required)
     * @return APIlistEventsRequest
     */
    public APIlistEventsRequest end(Long end) {
      this.end = end;
      return this;
    }
    

    /**
     * Set priority
     * @param priority Priority of your events: **low** or **normal**. (optional)
     * @return APIlistEventsRequest
     */
    public APIlistEventsRequest priority(String priority) {
      this.priority = priority;
      return this;
    }
    

    /**
     * Set sources
     * @param sources A comma separated string of sources. (optional)
     * @return APIlistEventsRequest
     */
    public APIlistEventsRequest sources(String sources) {
      this.sources = sources;
      return this;
    }
    

    /**
     * Set tags
     * @param tags A comma separated list indicating what tags, if any, should be used to filter the list of monitorsby scope, e.g. host:host0. (optional)
     * @return APIlistEventsRequest
     */
    public APIlistEventsRequest tags(String tags) {
      this.tags = tags;
      return this;
    }
    

    /**
     * Set unaggregated
     * @param unaggregated Set unaggregated to &#x60;true&#x60; to return all events within the specified [&#x60;start&#x60;,&#x60;end&#x60;] timeframe. Otherwise if an event is aggregated to a parent event with a timestamp outside of the timeframe, it won&#39;t be available in the output. (optional)
     * @return APIlistEventsRequest
     */
    public APIlistEventsRequest unaggregated(Boolean unaggregated) {
      this.unaggregated = unaggregated;
      return this;
    }
    

    /**
     * Execute listEvents request
     * @return EventListResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       </table>
     
     */
    
    public EventListResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listEvents request with HTTP info returned
     * @return ApiResponse&lt;EventListResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<EventListResponse> executeWithHttpInfo() throws ApiException {
      return listEventsWithHttpInfo(start, end, priority, sources, tags, unaggregated);
    }
  }

  /**
   * Query the event stream.
   * ### Overview The event stream can be queried and filtered by time, priority, sources and tags. Note: if the event you’re querying contains markdown formatting of any kind, you may see characters such as %,\\,n in your output. ### Arguments * **&#x60;start&#x60;** [*required*]:     POSIX timestamp.  * **&#x60;end&#x60;** [*required*]:     POSIX timestamp.  * **&#x60;priority&#x60;** [*optional*, *default*&#x3D;**None**]:     Priority of your events: **low** or **normal**.  * **&#x60;sources&#x60;** [*optional*, *default*&#x3D;**None**]:     A comma separated string of sources.  * **&#x60;tags&#x60;** [*optional*, *default*&#x3D;**None**]:     A comma separated string of tags. To use a negative tag filter, prefix your tag with &#x60;-&#x60;.     See the Event Stream documentation to learn more.  * **&#x60;unaggregated&#x60;** [*optional*, *default*&#x3D;*false*]:     Set unaggregated to &#x60;true&#x60; to return all events within the specified [&#x60;start&#x60;,&#x60;end&#x60;] timeframe. Otherwise if an event is aggregated to a parent event with a timestamp outside of the timeframe, it won&#39;t be available in the output.
   * @return listEventsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIlistEventsRequest listEvents() throws ApiException {
    return new APIlistEventsRequest();
  }
}
