/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v1.client.api;

import com.datadog.api.TestUtils;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.model.Monitor;
import com.datadog.api.v1.client.model.MonitorType;
import com.datadog.api.v1.client.model.MonitorOptions;
import com.datadog.api.v1.client.model.DeletedMonitor;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static com.github.tomakehurst.wiremock.client.WireMock.okJson;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * API tests for MonitorsApi
 */
public class MonitorsApiTest extends V1ApiTest {

    private static MonitorsApi api;
    private static MonitorsApi fakeAuthApi;
    private static MonitorsApi unitApi;
    private ArrayList<Long> deleteMonitors = null;

    private final String testingMonitorName = "Bytes received on host0";
    private final MonitorType testingMonitorType = MonitorType.METRIC_ALERT;
    private final String testingMonitorQuery = "avg(last_5m):sum:system.net.bytes_rcvd{host:host0} > 100";
    private final String testingMonitorMessage = "We may need to add web hosts if this is consistently high.";
    private final List<String> testingMonitorTags = Arrays.asList("app:webserver", "frontend");
    private final Boolean testingMonitorOptionsNotifyNoData = true;
    private final Long testingMonitorOptionsNoDataTimeframe = 20L;

    private final String fixturePrefix = "v1/client/api/monitors_fixtures";
    private final String apiUri = "/api/v1/monitor";

    @Before
    public void resetDeleteMonitors() {
        deleteMonitors = new ArrayList<Long>();
    }

    @BeforeClass
    public static void initApi() {
        api = new MonitorsApi(generalApiClient);
        fakeAuthApi = new MonitorsApi(generalFakeAuthApiClient);
        unitApi = new MonitorsApi(generalApiUnitTestClient);
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
    public void listMonitorsTest() throws ApiException {
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

    @Test
    public void monitorsCreateErrorsTest() {
        try {
            api.createMonitor().body(new Monitor()).execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(400, e.getCode());
        }

        try {
            fakeAuthApi.createMonitor().body(new Monitor()).execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(403, e.getCode());
        }
    }

    @Test
    public void monitorsListErrorsTest() {
        try {
            api.listMonitors().groupStates("notagroupstate").execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(400, e.getCode());
        }

        try {
            fakeAuthApi.listMonitors().groupStates("notagroupstate").execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(403, e.getCode());
        }
    }

    @Test
    public void monitorUpdateErrorsTest() throws ApiException {
        Monitor monitor = new Monitor()
                .name(testingMonitorName)
                .type(testingMonitorType)
                .query(testingMonitorQuery)
                .message(testingMonitorMessage)
                .tags(testingMonitorTags);

        // create monitor
        Monitor obtained = api.createMonitor().body(monitor).execute();
        Long monitorId = obtained.getId();
        deleteMonitors.add(monitorId);

        Monitor updateMonitor = new Monitor();
        updateMonitor.setType(MonitorType.COMPOSITE);

        try {
            api.updateMonitor(monitorId).body(updateMonitor).execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(400, e.getCode());
        }

        try {
            fakeAuthApi.updateMonitor(new Long(1234)).body(new Monitor()).execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(403, e.getCode());
        }

        try {
            api.updateMonitor(new Long(1234)).body(new Monitor()).execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(404, e.getCode());
        }
    }

    @Test
    public void monitorUpdate401ErrorTest() throws IOException {
        String fixtureData = TestUtils.getFixture(fixturePrefix + "/error_401.json");
        stubFor(put(urlPathEqualTo(apiUri + "/121"))
                .willReturn(okJson(fixtureData).withStatus(401))
        );
        // Cannot trigger 401 for client. Need underrestricted creds. Mock it.
        try {
            unitApi.updateMonitor(new Long(121)).body(new Monitor()).execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(401, e.getCode());
        }
    }

    @Test
    public void monitorGetErrorsTest() throws ApiException {
        Monitor monitor = new Monitor()
                .name(testingMonitorName)
                .type(testingMonitorType)
                .query(testingMonitorQuery)
                .message(testingMonitorMessage)
                .tags(testingMonitorTags);

        // create monitor
        Monitor obtained = api.createMonitor().body(monitor).execute();
        Long monitorId = obtained.getId();
        deleteMonitors.add(monitorId);

        Monitor updateMonitor = new Monitor();
        updateMonitor.setType(MonitorType.COMPOSITE);

        try {
            api.getMonitor(monitorId).groupStates("notagroupstate").execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(400, e.getCode());
        }

        try {
            fakeAuthApi.getMonitor(new Long(1234)).groupStates("notagroupstate").execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(403, e.getCode());
        }

        try {
            api.getMonitor(new Long(1234)).groupStates("notagroupstate").execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(404, e.getCode());
        }
    }

    @Test
    public void monitorDelete400ErrorTest() throws IOException {
        String fixtureData = TestUtils.getFixture(fixturePrefix + "/error_400.json");
        stubFor(delete(urlPathEqualTo(apiUri + "/121"))
                .willReturn(okJson(fixtureData).withStatus(400))
        );
        // Cannot trigger 400 due to client side validations, so mock it
        try {
            unitApi.deleteMonitor(new Long(121)).execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(400, e.getCode());
        }
    }

    @Test
    public void monitorDelete401ErrorTest() throws IOException {
        String fixtureData = TestUtils.getFixture(fixturePrefix + "/error_401.json");
        stubFor(delete(urlPathEqualTo(apiUri + "/121"))
                .willReturn(okJson(fixtureData).withStatus(401))
        );
        // Cannot trigger 401 for client. Need underrestricted creds. Mock it.
        try {
            unitApi.deleteMonitor(new Long(121)).execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(401, e.getCode());
        }
    }

    @Test
    public void monitorCanDeleteErrorsTest() throws ApiException {
        // create metrics monitor
        Monitor monitor = new Monitor()
                .type(MonitorType.QUERY_ALERT)
                .query("avg(last_5m):sum:system.net.bytes_rcvd{host:host0} > 100");

        Monitor obtained = api.createMonitor().body(monitor).execute();
        Long monitorId = obtained.getId();
        deleteMonitors.add(monitorId);

        // create composite monitor
        Monitor composite = new Monitor()
                .type(MonitorType.COMPOSITE)
                .query(Long.toString(monitorId));

        Monitor compositeObtained = api.createMonitor().body(composite).execute();
        Long compositeMonitorId = compositeObtained.getId();
        deleteMonitors.add(compositeMonitorId);

        List<Long> monitorIdlist = new ArrayList<Long>(Arrays.asList(monitorId));
        List<Long> emptyIdlist = new ArrayList<Long>();

        try {
            api.checkCanDeleteMonitor().monitorIds(emptyIdlist).execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(400, e.getCode());
        }

        try {
            fakeAuthApi.checkCanDeleteMonitor().monitorIds(emptyIdlist).execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(403, e.getCode());
        }

        try {
            api.checkCanDeleteMonitor().monitorIds(monitorIdlist).execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(409, e.getCode());
            // Manually delete the composite monitor as deleteMonitors() can fail
            // if trying to delete the dependent metrics monitor prior to deleting the composite monitor
            api.deleteMonitor(compositeMonitorId).execute();
        }
    }

    @Test
    public void monitorValidateErrorsTest() {
        try {
            api.validateMonitor().body(new Monitor()).execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(400, e.getCode());
        }

        try {
            fakeAuthApi.validateMonitor().body(new Monitor()).execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(403, e.getCode());
        }
    }
}
