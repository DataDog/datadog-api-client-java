/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v1.client.api;

import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.model.Monitor;
import com.datadog.api.v1.client.model.MonitorType;
import com.datadog.api.v1.client.model.MonitorOptions;
import com.datadog.api.v1.client.model.DeletedMonitor;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * API tests for MonitorsApi
 */
public class MonitorsApiTest extends V1ApiTest {

    private static MonitorsApi api;
    private ArrayList<Long> deleteMonitors = null;

    private final String testingMonitorName = "Bytes received on host0";
    private final MonitorType testingMonitorType = MonitorType.METRIC_ALERT;
    private final String testingMonitorQuery = "avg(last_5m):sum:system.net.bytes_rcvd{host:host0} > 100";
    private final String testingMonitorMessage = "We may need to add web hosts if this is consistently high.";
    private final List<String> testingMonitorTags = Arrays.asList("app:webserver", "frontend");
    private final Boolean testingMonitorOptionsNotifyNoData = true;
    private final Long testingMonitorOptionsNoDataTimeframe = 20L;

    @Before
    public void resetDeleteMonitors() {
        deleteMonitors = new ArrayList<Long>();
    }

    @BeforeClass
    public static void initApi() {
        api = new MonitorsApi(generalApiClient);
    }

    @After
    public void deleteMonitors() throws ApiException {
        if (deleteMonitors != null) {
            for (Long id : deleteMonitors) {
                try {
                    api.getMonitor(id).groupStates("all").execute();
                } catch (ApiException e) {
                    // doesn't exist => continue
                    continue;
                }
                api.deleteMonitor(id).execute();
            }
        }
    }

   /**
     * Create, modify and delete monitor object, also test getting it
     */
    @Test
    public void monitorCreateModifyDeleteTest() throws ApiException {
        MonitorOptions options = new MonitorOptions()
            .notifyNoData(testingMonitorOptionsNotifyNoData)
            .noDataTimeframe(testingMonitorOptionsNoDataTimeframe);

        Monitor monitor = new Monitor()
            .name(testingMonitorName)
            .type(testingMonitorType)
            .query(testingMonitorQuery)
            .message(testingMonitorMessage)
            .tags(testingMonitorTags)
            .options(options);

        // test creating monitor
        Monitor obtained = api.createMonitor().body(monitor).execute();
        Long monitorId = obtained.getId();
        deleteMonitors.add(monitorId);

        // test getting monitor
        obtained = api.getMonitor(monitorId).groupStates("all").execute();
        assertEquals(testingMonitorName, obtained.getName());
        assertEquals(testingMonitorType, obtained.getType());
        assertEquals(testingMonitorQuery, obtained.getQuery());
        assertEquals(testingMonitorMessage, obtained.getMessage());
        assertEquals(testingMonitorTags, obtained.getTags());
        assertEquals(testingMonitorOptionsNotifyNoData, obtained.getOptions().getNotifyNoData());
        assertEquals(testingMonitorOptionsNoDataTimeframe, obtained.getOptions().getNoDataTimeframe());
        assertNull(obtained.getDeleted());
        assertTrue(obtained.getDeleted_JsonNullable().isPresent());

        // test updating monitor
        obtained.setName("New name");
        obtained = api.updateMonitor(monitorId).body(obtained).execute();

        assertEquals("New name", obtained.getName());
        assertEquals(testingMonitorType, obtained.getType());
        assertEquals(testingMonitorQuery, obtained.getQuery());
        assertEquals(testingMonitorMessage, obtained.getMessage());
        assertEquals(testingMonitorTags, obtained.getTags());
        assertEquals(testingMonitorOptionsNotifyNoData, obtained.getOptions().getNotifyNoData());
        assertEquals(testingMonitorOptionsNoDataTimeframe, obtained.getOptions().getNoDataTimeframe());

        // test deleting monitor
        DeletedMonitor deletedMonitor = api.deleteMonitor(monitorId).execute();
        assertEquals(monitorId, deletedMonitor.getDeletedMonitorId());
    }

   /**
     * Get all monitors
     */
    @Test
    public void getAllMonitorsTest() throws ApiException {
        ArrayList<String> prefixes = new ArrayList<String>(Arrays.asList("1", "2", "3"));
        for (String prefix: prefixes) {
            Monitor monitor = new Monitor()
                .name(prefix + testingMonitorName)
                .type(testingMonitorType)
                .query(testingMonitorQuery);
            Monitor created = api.createMonitor().body(monitor).execute();
            deleteMonitors.add(created.getId());
        }
        List<Monitor> allMonitors = api.listMonitors().execute();
        for (String prefix: prefixes) {
            boolean found = false;
            for (Monitor monitor: allMonitors) {
                if (monitor.getName().equals(prefix + testingMonitorName)) {
                    found = true;
                }
            }
            assertTrue(String.format("Monitor %s%s not found", prefix, testingMonitorName), found);
        }
    }

    /**
     * Validate monitor
     */

     @Test
     public void validateMonitorTest() throws ApiException {
        MonitorOptions options = new MonitorOptions()
            .notifyNoData(testingMonitorOptionsNotifyNoData)
            .noDataTimeframe(testingMonitorOptionsNoDataTimeframe);

        Monitor monitor = new Monitor()
            .name(testingMonitorName)
            .type(testingMonitorType)
            .query(testingMonitorQuery)
            .message(testingMonitorMessage)
            .tags(testingMonitorTags)
            .options(options);

        // if this doesn't throw exception, everything is fine
        api.validateMonitor().body(monitor).execute();

        monitor.setQuery("avg(last_5m):sum:system.net.bytes_rcvd{host:host0} ><><>< whaaaaaaa?");
        try {
            api.validateMonitor().body(monitor).execute();
            // junit 4 doesn't have better support for asserting that method threw an error
            assertTrue(false);
        } catch (ApiException e) {
            // noop
        }
     }
}
