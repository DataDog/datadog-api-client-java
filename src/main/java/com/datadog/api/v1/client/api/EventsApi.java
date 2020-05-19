package com.datadog.api.v1.client.api;

import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiResponse;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.Pair;

import javax.ws.rs.core.GenericType;

import com.datadog.api.v1.client.model.APIErrorResponse;
import com.datadog.api.v1.client.model.EventListResponse;
import com.datadog.api.v1.client.model.EventPriority;
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

  /**
   * Get the API cilent
   *
   * @return API client
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * Set the API cilent
   *
   * @param apiClient an instance of API client
   */
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
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


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getEvent");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<EventResponse> localVarReturnType = new GenericType<EventResponse>() {};

    return apiClient.invokeAPI("EventsApi.getEvent", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, null);
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
         <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
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
         <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Item Not Found </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<EventResponse> executeWithHttpInfo() throws ApiException {
      return getEventWithHttpInfo(eventId);
    }
  }

  /**
   * Get an event
   * This endpoint allows you to query for event details.  **Note**: If the event you’re querying contains markdown formatting of any kind, you may see characters such as &#x60;%&#x60;,&#x60;\\&#x60;,&#x60;n&#x60; in your output.
   * @param eventId The ID of the event. (required)
   * @return getEventRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIgetEventRequest getEvent(Long eventId) throws ApiException {
    return new APIgetEventRequest(eventId);
  }

private ApiResponse<EventListResponse> listEventsWithHttpInfo(Long start, Long end, EventPriority priority, String sources, String tags, Boolean unaggregated) throws ApiException {
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

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listEvents");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<EventListResponse> localVarReturnType = new GenericType<EventListResponse>() {};

    return apiClient.invokeAPI("EventsApi.listEvents", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, null);
  }

  public class APIlistEventsRequest {
    private Long start;
    private Long end;
    private EventPriority priority;
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
     * @param priority Priority of your events, either &#x60;low&#x60; or &#x60;normal&#x60;. (optional)
     * @return APIlistEventsRequest
     */
    public APIlistEventsRequest priority(EventPriority priority) {
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
     * @param tags A comma separated list indicating what tags, if any, should be used to filter the list of monitors by scope. (optional)
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
         <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
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
         <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<EventListResponse> executeWithHttpInfo() throws ApiException {
      return listEventsWithHttpInfo(start, end, priority, sources, tags, unaggregated);
    }
  }

  /**
   * Query the event stream
   * The event stream can be queried and filtered by time, priority, sources and tags.  **Note**: If the event you’re querying contains markdown formatting of any kind, you may see characters such as %,\\,n in your output.
   * @return listEventsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistEventsRequest listEvents() throws ApiException {
    return new APIlistEventsRequest();
  }
}
