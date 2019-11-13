/*
 * (C) Datadog, Inc. 2019
 * All rights reserved
 * Licensed under a 3-clause BSD style license (see LICENSE)
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.datadog.api.v1.client.api;

import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.model.CancelDowntimesByScopeRequest;
import com.datadog.api.v1.client.model.CanceledDowntimesIds;
import com.datadog.api.v1.client.model.Downtime;
import com.datadog.api.v1.client.model.Error400;
import com.datadog.api.v1.client.model.Error404;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DowntimesApi
 */
@Ignore
public class DowntimesApiTest {

    private final DowntimesApi api = new DowntimesApi();

    
    /**
     * Cancel a downtime
     *
     * Cancel a Downtime
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cancelDowntimeTest() throws ApiException {
        Long downtimeId = null;
        api.cancelDowntime(downtimeId);

        // TODO: test validations
    }
    
    /**
     * Cancel downtimes by scope
     *
     * ### Overview DELETE all Downtimes that match the scope of X ### Arguments * **&#x60;scope&#x60;** [*required*]: Cancel all downtimes with the given scope(s),   e.g.: &#x60;env:prod&#x60;, &#x60;role:db,role:db-slave&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cancelDowntimesByScopeTest() throws ApiException {
        CancelDowntimesByScopeRequest cancelDowntimesByScopeRequest = null;
        CanceledDowntimesIds response = api.cancelDowntimesByScope(cancelDowntimesByScopeRequest);

        // TODO: test validations
    }
    
    /**
     * Schedule a downtime
     *
     * * **&#x60;scope&#x60;** [*required*]: The scope(s) to which the downtime applies, e.g. &#x60;host:app2&#x60;.   Provide multiple scopes as a comma-separated list, e.g. &#x60;env:dev,env:prod&#x60;. The   resulting downtime applies to sources that matches ALL provided scopes (i.e.   &#x60;env:dev&#x60; **AND** &#x60;env:prod&#x60;), NOT any of them.  * **&#x60;monitor_tags&#x60;** [*optional*, *default*&#x3D;**no monitor tag filter**]: A comma-separated   list of monitor tags, i.e. tags that are applied directly to monitors, *not* tags   that are used in monitor queries (which are filtered by the &#x60;scope&#x60; parameter), to   which the downtime applies. The resulting downtime applies to monitors that match   ALL provided monitor tags (i.e. &#x60;service:postgres&#x60; **AND** &#x60;team:frontend&#x60;), NOT any of them.  * **&#x60;monitor_id&#x60;** [*optional*, *default*&#x3D;**None**]: A single monitor to which the downtime   applies. If not provided, the downtime applies to all monitors.  * **&#x60;start&#x60;** [*optional*, *default*&#x3D;**None**]: POSIX timestamp to start the downtime.   If not provided, the downtime starts the moment it is created.  * **&#x60;end&#x60;** [*optional*, *default*&#x3D;**None**]: POSIX timestamp to end the downtime.   If not provided, the downtime is in effect indefinitely (i.e. until you cancel it).  * **&#x60;message&#x60;** [*optional*, *default*&#x3D;**None**]: A message to include with notifications   for this downtime. Email notifications can be sent to specific users by using    the same &#39;@username&#39; notation as events  * **&#x60;timezone&#x60;** [*optional*, *default* &#x3D; **UTC**]: The timezone for the downtime. * **&#x60;recurrence&#x60;** [*optional*, *default*&#x3D;**None**]: An object defining the recurrence of the   downtime with a variety of parameters:    * **&#x60;type&#x60;** the type of recurrence. Choose from: &#x60;days&#x60;, &#x60;weeks&#x60;, &#x60;months&#x60;, &#x60;years&#x60;.    * **&#x60;period&#x60;** how often to repeat as an integer. For example to repeat every 3 days,     select a type of &#x60;days&#x60; and a period of &#x60;3&#x60;.    * **&#x60;week_days&#x60;** (optional) a list of week days to repeat on. Choose from: &#x60;Mon&#x60;,     &#x60;Tue&#x60;, &#x60;Wed&#x60;, &#x60;Thu&#x60;, &#x60;Fri&#x60;, &#x60;Sat&#x60; or &#x60;Sun&#x60;. Only applicable when &#x60;type&#x60; is &#x60;weeks&#x60;.     **First letter must be capitalized.**   * **&#x60;until_occurrences&#x60;** (optional) how many times the downtime is rescheduled.     **&#x60;until_occurrences&#x60; and &#x60;until_date&#x60;** are mutually exclusive    * **&#x60;until_date&#x60;** (optional) the date at which the recurrence should end     as a POSIX timestmap. **&#x60;until_occurrences&#x60; and &#x60;until_date&#x60;** are mutually exclusive
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createDowntimeTest() throws ApiException {
        Downtime downtime = null;
        Downtime response = api.createDowntime(downtime);

        // TODO: test validations
    }
    
    /**
     * Get all downtimes
     *
     * ### Overview Get All Scheduled Downtimes ### Arguments * **&#x60;current_only&#x60;** [*optional*, *default* &#x3D; **False**]: Only return downtimes   that are active when the request is made.&#39;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllDowntimesTest() throws ApiException {
        Boolean currentOnly = null;
        List<Downtime> response = api.getAllDowntimes(currentOnly);

        // TODO: test validations
    }
    
    /**
     * Get a downtime
     *
     * ### Overview Get Downtime Detail by downtime_id ### Arguments This endpoint takes no JSON arguments.\&quot;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDowntimeTest() throws ApiException {
        Long downtimeId = null;
        Downtime response = api.getDowntime(downtimeId);

        // TODO: test validations
    }
    
    /**
     * Update a downtime
     *
     * ### Overview Update a single Downtime by downtime_id. ### Arguments * **&#x60;id&#x60;** [*required*]: The integer id of the downtime to be updated * **&#x60;scope&#x60;** [*required*]: The scope to which the downtime applies, e.g. &#39;host:app2&#39;.   Provide multiple scopes as a comma-separated list, e.g. &#39;env:dev,env:prod&#39;.   The resulting downtime applies to sources that matches ALL provided scopes   (i.e. env:dev AND env:prod), NOT any of them.  * **&#x60;monitor_tags&#x60;** [*optional*, *default*&#x3D;**no monitor tag filter**]: A comma-separated   list of monitor tags, i.e. tags that are applied directly to monitors, *not* tags that   are used in monitor queries (which are filtered by the &#x60;scope&#x60; parameter), to which   the downtime applies. The resulting downtime applies to monitors that match ALL provided   monitor tags (i.e. &#x60;service:postgres&#x60; **AND** &#x60;team:frontend&#x60;), NOT any of them.  * **&#x60;monitor_id&#x60;** [*optional*, *default*&#x3D;**None**]: A single monitor to which the downtime   applies. If not provided, the downtime applies to all monitors.  * **&#x60;start&#x60;** [*optional*, *default* &#x3D; **original start**]: POSIX timestamp to start   the downtime.  * **&#x60;end&#x60;** [*optional*, *default* &#x3D; **original end**]: POSIX timestamp to end the downtime.   If not provided, the downtime is in effect indefinitely (i.e. until you cancel it).  * **&#x60;message&#x60;** [*required*, *default* &#x3D; **original message**]: A message to include with   notifications for this downtime. Email notifications can be sent to specific users by   using the same &#39;@username&#39; notation as events  * **&#x60;timezone&#x60;** [*optional*, default &#x3D; **original timezone** ]: The timezone for the downtime. * **&#x60;recurrence&#x60;** [*optional*, *default* &#x3D; **original recurrence**]: An object defining the   recurrence of the downtime with a variety of parameters:      * **&#x60;type&#x60;** the type of recurrence. Choose from: &#x60;days&#x60;, &#x60;weeks&#x60;, &#x60;months&#x60;, &#x60;years&#x60;.      * **&#x60;period&#x60;** how often to repeat as an integer. For example to repeat every 3 days,       select a type of &#x60;days&#x60; and a period of &#x60;3&#x60;.      * **&#x60;week_days&#x60;** (optional) a list of week days to repeat on. Choose from: &#x60;Mon&#x60;, &#x60;Tue&#x60;,       &#x60;Wed&#x60;, &#x60;Thu&#x60;, &#x60;Fri&#x60;, &#x60;Sat&#x60; or &#x60;Sun&#x60;. Only applicable when &#x60;type&#x60; is &#x60;weeks&#x60;.       **First letter must be capitalized.**      * **&#x60;until_occurrences&#x60;** (optional) how many times the downtime is rescheduled.       **&#x60;until_occurrences&#x60; and &#x60;until_date&#x60;** are mutually exclusive      * **&#x60;until_date&#x60;** (optional) the date at which the recurrence should end as a POSIX       timestmap. **&#x60;until_occurrences&#x60; and &#x60;until_date&#x60;** are mutually exclusive
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateDowntimeTest() throws ApiException {
        Long downtimeId = null;
        Downtime downtime = null;
        Downtime response = api.updateDowntime(downtimeId, downtime);

        // TODO: test validations
    }
    
}
