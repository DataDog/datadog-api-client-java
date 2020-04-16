/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v1.client.api;

import com.datadog.api.TestUtils;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.model.*;
import org.junit.*;

import java.io.IOException;
import java.util.*;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static com.github.tomakehurst.wiremock.client.WireMock.okJson;
import static org.junit.Assert.*;

/**
 * API tests for ServiceLevelObjectivesApi
 */
public class ServiceLevelObjectivesApiTest extends V1ApiTest {
    private static ServiceLevelObjectivesApi api;
    private static ServiceLevelObjectivesApi unitApi;
    private static ServiceLevelObjectivesApi fakeAuthApi;
    private static MonitorsApi mApi;
    private final String apiUri = "/api/v1/slo";
    private final String fixturePrefix = "v1/client/api/slo_fixtures";
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
        unitApi = new ServiceLevelObjectivesApi(generalApiUnitTestClient);
        fakeAuthApi = new ServiceLevelObjectivesApi(generalFakeAuthApiClient);
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
        SLOListResponse sloResp = api.createSLO().body(monitorSLO).execute();
        ServiceLevelObjective created = sloResp.getData().get(0);
        deleteSLOs.add(created.getId());
        assertEquals(monitorSLO.getName(), created.getName());

        // Update SLO
        created.setDescription("Updated description");
        sloResp = api.updateSLO(created.getId()).body(created).execute();
        ServiceLevelObjective edited = sloResp.getData().get(0);
        assertEquals(created.getDescription(), edited.getDescription());

        // Check that the SLO can be deleted
        CheckCanDeleteSLOResponse canDelete = api.checkCanDeleteSLO().ids(edited.getId()).execute();
        assertEquals(Arrays.asList(edited.getId()), canDelete.getData().getOk());

        // Get SLO
        SLOResponse oneSLO = api.getSLO(edited.getId()).execute();
        assertEquals(edited, oneSLO.getData());

        // Delete SLO
        SLODeleteResponse deletedResp = api.deleteSLO(edited.getId()).execute();
        assertEquals(Arrays.asList(edited.getId()), deletedResp.getData());
    }

    /**
     * Create, modify and delete Event SLO object, also test getting it
     */
    @Test
    public void createModifyDeleteEventSLO() throws ApiException {
        // Create SLO
        SLOListResponse sloResp = api.createSLO().body(eventSLO).execute();
        ServiceLevelObjective created = sloResp.getData().get(0);
        deleteSLOs.add(created.getId());
        assertEquals(eventSLO.getName(), created.getName());

        // Edit SLO
        created.setDescription("Updated description");
        sloResp = api.updateSLO(created.getId()).body(created).execute();
        ServiceLevelObjective edited = sloResp.getData().get(0);
        assertEquals(created.getDescription(), edited.getDescription());

        // Check that the SLO can be deleted
        CheckCanDeleteSLOResponse canDelete = api.checkCanDeleteSLO().ids(edited.getId()).execute();
        assertEquals(Arrays.asList(edited.getId()), canDelete.getData().getOk());

        // Get SLO
        SLOResponse oneSLO = api.getSLO(edited.getId()).execute();
        assertEquals(edited, oneSLO.getData());

        // Get SLO history
        // the contents of history really depend on the org that this test is running in, so we just ensure
        // that the structure deserialized properly and no exception was thrown
        Long time = now.toEpochSecond();
        SLOHistoryResponse historyResp = api.getSLOHistory(edited.getId())
                .fromTs(time - 11).toTs(time - 1).execute();

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
        SLODeleteResponse deletedResp = api.deleteSLO(edited.getId()).execute();
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
        SLOListResponse sloResp = api.createSLO().body(monitorSLO).execute();
        final ServiceLevelObjective createdMonitorSLO = sloResp.getData().get(0);
        deleteSLOs.add(createdMonitorSLO.getId());

        // Create Event SLO
        sloResp = api.createSLO().body(eventSLO).execute();
        final ServiceLevelObjective createdEventSLO = sloResp.getData().get(0);
        deleteSLOs.add(createdEventSLO.getId());

        // Get multiple SLOs
        SLOListResponse slosResp = api.listSLOs()
                .ids(String.format("%s,%s", createdMonitorSLO.getId(), createdEventSLO.getId())).execute();
        assertSLOInList(slosResp.getData(), createdEventSLO.getId());
        assertSLOInList(slosResp.getData(), createdMonitorSLO.getId());

        // Use bulk delete operation to delete the event SLO
        Map<String, List<SLOTimeframe>> toDelete = new HashMap<String, List<SLOTimeframe>>() {{
            put(createdEventSLO.getId(), Arrays.asList(SLOTimeframe.SEVEN_DAYS));
        }};
        SLOBulkDeleteResponse deletedResp = api.deleteSLOTimeframeInBulk().body(toDelete).execute();
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

    @Test
    public void createSLOErrorsTest() {
        try {
            api.createSLO().body(new ServiceLevelObjective()).execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(400, e.getCode());
        }

        try {
            fakeAuthApi.createSLO().body(new ServiceLevelObjective()).execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(403, e.getCode());
        }
    }

    @Test
    public void listSLOErrorsTest() {
        //FIXME: currently triggering a 404. Need to figure out how to trigger 400
//        try {
//            api.listSLOs().ids("id1,id2").execute();
//            throw new AssertionError();
//        } catch (ApiException e) {
//            assertEquals(400, e.getCode());
//        }

        try {
            fakeAuthApi.listSLOs().ids("id1,id2").execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(403, e.getCode());
        }
    }

    @Test
    public void updateSLOErrorsTest() {
        try {
            api.updateSLO("id").body(new ServiceLevelObjective()).execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(400, e.getCode());
        }

        try {
            fakeAuthApi.updateSLO("id").body(new ServiceLevelObjective()).execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(403, e.getCode());
        }

        try {
            api.updateSLO("id").body(monitorSLO).execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(404, e.getCode());
        }
    }

    @Test
    public void getSLOErrorsTest() {
        try {
            fakeAuthApi.getSLO("id").execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(403, e.getCode());
        }

        try {
            api.getSLO("id").execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(404, e.getCode());
        }
    }

    @Test
    public void deleteSLOErrorsTest() {
        try {
            fakeAuthApi.deleteSLO("id").execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(403, e.getCode());
        }

        try {
            api.deleteSLO("id").execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(404, e.getCode());
        }
    }

    @Test
    public void deleteSLO409ErrorTest() throws IOException {
        String fixtureData = TestUtils.getFixture(fixturePrefix + "/error_409_delete.json");
        stubFor(delete(urlPathEqualTo(apiUri + "/id"))
                .willReturn(okJson(fixtureData).withStatus(409))
        );

        // FIXME: Make it an integration test when feature is fixed
        //// Create SLO and reference it in a dashboard to trigger 409
        try {
            unitApi.deleteSLO("id").execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(409, e.getCode());
        }
    }

    @Test
    public void historyGetSLOErrorsTest() throws ApiException {
        // Create a monitor for testing the monitor SLO
        Monitor m = new Monitor()
                .name("For testing monitor SLO")
                .type(MonitorType.METRIC_ALERT)
                .query("avg(last_5m):sum:system.net.bytes_rcvd{host:host0} > 100");
        m = mApi.createMonitor().body(m).execute();
        deleteMonitors.add(m.getId());
        monitorSLO.monitorIds(Arrays.asList(m.getId()));

        // Create SLO
        SLOListResponse sloResp = api.createSLO().body(monitorSLO).execute();
        ServiceLevelObjective created = sloResp.getData().get(0);
        deleteSLOs.add(created.getId());

        try {
            api.getSLOHistory(created.getId()).fromTs(new Long(123)).toTs(new Long(12)).execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(400, e.getCode());
        }

        try {
            fakeAuthApi.getSLOHistory("id").fromTs(new Long(123)).toTs(new Long(12)).execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(403, e.getCode());
        }

        try {
            api.getSLOHistory("id").fromTs(new Long(123)).toTs(new Long(12)).execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(404, e.getCode());
        }
    }

    @Test
    public void canDelete409SLOErrorTest() throws IOException {
        String fixtureData = TestUtils.getFixture(fixturePrefix + "/error_409_can_delete.json");
        stubFor(get(urlPathEqualTo(apiUri + "/can_delete"))
                .willReturn(okJson(fixtureData).withStatus(409))
        );
        // Mocked as the feature is in a broken state right now
        // FIXME: Make it an integration test when feature is fixed
        try {
            unitApi.checkCanDeleteSLO().ids("id").execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(409, e.getCode());
        }
    }

    @Test
    public void bulkDeleteSLOErrorsTest() {
        Map<String, List<SLOTimeframe>> toDelete = new HashMap<String, List<SLOTimeframe>>();

        try {
            api.deleteSLOTimeframeInBulk().body(toDelete).execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(400, e.getCode());
        }

        try {
            fakeAuthApi.deleteSLOTimeframeInBulk().body(toDelete).execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(403, e.getCode());
        }
    }
}
