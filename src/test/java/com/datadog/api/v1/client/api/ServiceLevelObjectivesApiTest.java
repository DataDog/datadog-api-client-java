/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v1.client.api;

import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.model.*;
import org.junit.*;

import java.util.*;

import static org.junit.Assert.*;

/**
 * API tests for ServiceLevelObjectivesApi
 */
public class ServiceLevelObjectivesApiTest extends V1ApiTest {
    private static ServiceLevelObjectivesApi api;
    private static MonitorsApi mApi;
    private ArrayList<String> deleteSLOs = null;
    private ArrayList<Long> deleteMonitors = null;
    private final ServiceLevelObjective monitorSLO = new ServiceLevelObjective()
            .type(SLOType.MONITOR)
            .name("Critical Foo Host Uptime")
            .description("Track the uptime of host foo which is critical to us.")
            .tags(Arrays.asList("app:core", "kpi"))
            .thresholds(Arrays.asList(new SLOThreshold()
                .timeframe(SLOTimeframe.THIRTY_DAYS)
                .target(95.0)
                .warning(98.0)
            ));
    private final ServiceLevelObjective eventSLO = new ServiceLevelObjective()
            .type(SLOType.METRIC)
            .name("HTTP Return Codes")
            .description("Make sure we don't have too many failed HTTP responses")
            .tags(Arrays.asList("app:httpd"))
            .thresholds(Arrays.asList(new SLOThreshold()
                    .timeframe(SLOTimeframe.SEVEN_DAYS)
                    .target(95.0)
                    .warning(98.0)
            ))
            .query(new ServiceLevelObjectiveQuery()
                // Using the default function with non-existant metrics ensures that this
                // test will behave the same in all environments. The default function
                // should never be used for real SLO queries.
                 .numerator("default(sum:non_existant_metric{*}.as_count(), 1)")
                 .denominator("default(sum:non_existant_metric{*}.as_count(), 2)")
            );

    @Before
    public void resetDeleteSLOsMonitors() {
        deleteSLOs = new ArrayList<String>();
        deleteMonitors = new ArrayList<Long>();
    }

    @BeforeClass
    public static void initApi() {
        api = new ServiceLevelObjectivesApi(generalApiClient);
        mApi = new MonitorsApi(generalApiClient);
    }

    @After
    public void deleteSLOs() throws ApiException {
        if (deleteSLOs != null) {
            for (String id : deleteSLOs) {
                try {
                    api.deleteSLO(id).execute();
                } catch (ApiException e) {
                    if (e.getCode() == 404) {
                        // doesn't exist => continue
                        continue;
                    } else {
                        throw e;
                    }
                }
            }
        }
    }

    @After
    public void deleteMonitors() throws ApiException {
        if (deleteMonitors != null) {
            for (Long id : deleteMonitors) {
                mApi.deleteMonitor(id).execute();
            }
        }
    }

    /**
     * Create, modify and delete Monitor SLO object, also test getting it
     */
    @Test
    public void createModifyDeleteMonitorSLO() throws ApiException {
        // Create a monitor for testing the monitor SLO
        Monitor m = new Monitor()
                .name("For testing monitor SLO")
                .type(MonitorType.METRIC_ALERT)
                .query("avg(last_5m):sum:system.net.bytes_rcvd{host:host0} > 100");
        m = mApi.createMonitor().body(m).execute();
        deleteMonitors.add(m.getId());
        monitorSLO.monitorIds(Arrays.asList(m.getId()));

        // Create SLO
        ServiceLevelObjectiveListResponse sloResp = api.createSLO().body(monitorSLO).execute();
        ServiceLevelObjective created = sloResp.getData().get(0);
        deleteSLOs.add(created.getId());
        assertEquals(monitorSLO.getName(), created.getName());

        // Update SLO
        created.setDescription("Updated description");
        sloResp = api.updateSLO(created.getId()).body(created).execute();
        ServiceLevelObjective edited = sloResp.getData().get(0);
        assertEquals(created.getDescription(), edited.getDescription());

        // Check that the SLO can be deleted
        CheckCanDeleteServiceLevelObjectiveResponse canDelete = api.checkCanDeleteSLO().ids(edited.getId()).execute();
        assertEquals(Arrays.asList(edited.getId()), canDelete.getData().getOk());

        // Get SLO
        ServiceLevelObjectiveResponse oneSLO = api.getSLO(edited.getId()).execute();
        assertEquals(edited, oneSLO.getData());

        // Delete SLO
        ServiceLevelObjectiveDeleted deletedResp = api.deleteSLO(edited.getId()).execute();
        assertEquals(Arrays.asList(edited.getId()), deletedResp.getData());
    }

    /**
     * Create, modify and delete Event SLO object, also test getting it
     */
    @Test
    public void createModifyDeleteEventSLO() throws ApiException {
        // Create SLO
        ServiceLevelObjectiveListResponse sloResp = api.createSLO().body(eventSLO).execute();
        ServiceLevelObjective created = sloResp.getData().get(0);
        deleteSLOs.add(created.getId());
        assertEquals(eventSLO.getName(), created.getName());

        // Edit SLO
        created.setDescription("Updated description");
        sloResp = api.updateSLO(created.getId()).body(created).execute();
        ServiceLevelObjective edited = sloResp.getData().get(0);
        assertEquals(created.getDescription(), edited.getDescription());

        // Check that the SLO can be deleted
        CheckCanDeleteServiceLevelObjectiveResponse canDelete = api.checkCanDeleteSLO().ids(edited.getId()).execute();
        assertEquals(Arrays.asList(edited.getId()), canDelete.getData().getOk());

        // Get SLO
        ServiceLevelObjectiveResponse oneSLO = api.getSLO(edited.getId()).execute();
        assertEquals(edited, oneSLO.getData());

        // Get SLO history
        // the contents of history really depend on the org that this test is running in, so we just ensure
        // that the structure deserialized properly and no exception was thrown
        Long time = now.toEpochSecond();
        HistoryServiceLevelObjectiveResponse historyResp = api.getSLOHistory(edited.getId())
                .fromTs(Long.toString(time - 11)).toTs(Long.toString(time - 1)).execute();

        SLOHistorySLIData overall = historyResp.getData().getOverall();
        Double sliValue = overall.getSliValue();
        assertNotNull(sliValue);
        assertEquals(50, Math.round(sliValue));

        SLOHistoryMetrics series = historyResp.getData().getSeries();
        assertNotNull(series);
        assertNotNull(series.getTimes());
        SLOHistoryMetricsSeries numerator = series.getNumerator();
        assertNotNull(numerator);
        assertNotNull(numerator.getValues());

        // Delete SLO
        ServiceLevelObjectiveDeleted deletedResp = api.deleteSLO(edited.getId()).execute();
        assertEquals(Arrays.asList(edited.getId()), deletedResp.getData());
    }

    /**
     * Get multiple instances, test the bulk deletion endpoint
     */
    @Test
    public void testMultipleSLOInstances() throws ApiException {
        // Create a monitor for testing the monitor SLO
        Monitor m = new Monitor()
                .name("For testing monitor SLO")
                .type(MonitorType.METRIC_ALERT)
                .query("avg(last_5m):sum:system.net.bytes_rcvd{host:host0} > 100");
        m = mApi.createMonitor().body(m).execute();
        deleteMonitors.add(m.getId());
        monitorSLO.monitorIds(Arrays.asList(m.getId()));

        // Create Monitor SLO
        ServiceLevelObjectiveListResponse sloResp = api.createSLO().body(monitorSLO).execute();
        final ServiceLevelObjective createdMonitorSLO = sloResp.getData().get(0);
        deleteSLOs.add(createdMonitorSLO.getId());

        // Create Event SLO
        sloResp = api.createSLO().body(eventSLO).execute();
        final ServiceLevelObjective createdEventSLO = sloResp.getData().get(0);
        deleteSLOs.add(createdEventSLO.getId());

        // Get multiple SLOs
        ServiceLevelObjectiveListResponse slosResp = api.getSLOs()
                .ids(String.format("%s,%s", createdMonitorSLO.getId(), createdEventSLO.getId())).execute();
        assertSLOInList(slosResp.getData(), createdEventSLO.getId());
        assertSLOInList(slosResp.getData(), createdMonitorSLO.getId());

        // Use bulk delete operation to delete the event SLO
        Map<String, List<SLOTimeframe>> toDelete = new HashMap<String, List<SLOTimeframe>>() {{
            put(createdEventSLO.getId(), Arrays.asList(SLOTimeframe.SEVEN_DAYS));
        }};
        ServiceLevelObjectivesBulkDeleted deletedResp = api.deleteSLOTimeframeInBulk().body(toDelete).execute();
        assertEquals(Arrays.asList(createdEventSLO.getId()), deletedResp.getData().getDeleted());
        assertEquals(null, deletedResp.getData().getUpdated());
    }

    private void assertSLOInList(List<ServiceLevelObjective> slos, String sloId) {
        for (ServiceLevelObjective slo : slos) {
            if (slo.getId().equals(sloId)) {
                return;
            }
        }
        assertTrue(String.format("SLO %s not found in all retrieved SLOs", sloId), false);
    }
}
