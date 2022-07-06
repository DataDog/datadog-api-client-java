/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.api;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static com.github.tomakehurst.wiremock.client.WireMock.okJson;
import static org.junit.Assert.*;

import com.datadog.api.TestUtils;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.model.*;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.*;
import org.junit.*;

/** API tests for ServiceLevelObjectivesApi */
public class ServiceLevelObjectivesApiTest extends V1ApiTest {
  private static ServiceLevelObjectivesApi api;
  private static ServiceLevelObjectivesApi unitApi;
  private static ServiceLevelObjectivesApi fakeAuthApi;
  private static MonitorsApi mApi;
  private final String apiUri = "/api/v1/slo";
  private final String fixturePrefix = "client/v1/api/slo_fixtures";
  private ArrayList<String> deleteSLOs = null;
  private ArrayList<Long> deleteMonitors = null;
  private final ServiceLevelObjectiveRequest monitorSLO =
      new ServiceLevelObjectiveRequest()
          .type(SLOType.MONITOR)
          .description("Track the uptime of host foo which is critical to us.")
          .tags(Arrays.asList("app:core", "kpi"))
          .thresholds(
              Arrays.asList(
                  new SLOThreshold()
                      .timeframe(SLOTimeframe.THIRTY_DAYS)
                      .target(95.0)
                      .warning(98.0)));
  private final ServiceLevelObjectiveRequest eventSLO =
      new ServiceLevelObjectiveRequest()
          .type(SLOType.METRIC)
          .description("Make sure we don't have too many failed HTTP responses")
          .tags(Arrays.asList("app:httpd"))
          .thresholds(
              Arrays.asList(
                  new SLOThreshold().timeframe(SLOTimeframe.SEVEN_DAYS).target(95.0).warning(98.0)))
          .query(
              new ServiceLevelObjectiveQuery()
                  // Using the default function with non-existant metrics ensures that this
                  // test will behave the same in all environments. The default function
                  // should never be used for real SLO queries.
                  .numerator("default(sum:non_existant_metric{*}.as_count(), 1)")
                  .denominator("default(sum:non_existant_metric{*}.as_count(), 2)"));

  // ObjectMapper instance configure to not fail when encountering unknown properties
  private static ObjectMapper objectMapper =
      new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

  @Override
  public String getTracingEndpoint() {
    return "service-level-objectives";
  }

  @Before
  public void resetDeleteSLOsMonitors() {
    deleteSLOs = new ArrayList<String>();
    deleteMonitors = new ArrayList<Long>();
  }

  @BeforeClass
  public static void initApi() {
    generalApiClient.setUnstableOperationEnabled("v1.getSLOHistory", true);
    generalFakeAuthApiClient.setUnstableOperationEnabled("v1.getSLOHistory", true);
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
          api.deleteSLO(id);
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
        mApi.deleteMonitor(id);
      }
    }
  }

  /** Create, modify and delete Monitor SLO object, also test getting it */
  @Test
  public void createModifyDeleteMonitorSLO() throws ApiException {
    // Create a monitor for testing the monitor SLO
    Monitor m =
        new Monitor()
            .name(getUniqueEntityName())
            .type(MonitorType.METRIC_ALERT)
            .query("avg(last_5m):sum:system.net.bytes_rcvd{host:host0} > 100");
    m = mApi.createMonitor(m);
    deleteMonitors.add(m.getId());
    monitorSLO.monitorIds(Arrays.asList(m.getId()));
    monitorSLO.setName(getUniqueEntityName());

    // Create SLO
    SLOListResponse sloResp = api.createSLO(monitorSLO);
    ServiceLevelObjective created = sloResp.getData().get(0);
    deleteSLOs.add(created.getId());
    assertEquals(monitorSLO.getName(), created.getName());

    // Update SLO
    created.setDescription("Updated description");
    sloResp = api.updateSLO(created.getId(), created);
    ServiceLevelObjective edited = sloResp.getData().get(0);
    assertEquals(created.getDescription(), edited.getDescription());

    // Check that the SLO can be deleted
    CheckCanDeleteSLOResponse canDelete = api.checkCanDeleteSLO(edited.getId());
    assertEquals(Arrays.asList(edited.getId()), canDelete.getData().getOk());

    // Get SLO
    SLOResponse oneSLO = api.getSLO(edited.getId());
    assertEquals(edited.getId(), oneSLO.getData().getId());

    // Delete SLO
    SLODeleteResponse deletedResp = api.deleteSLO(edited.getId());
    assertEquals(Arrays.asList(edited.getId()), deletedResp.getData());
  }

  /** Create, modify and delete Event SLO object, also test getting it */
  @Test
  public void createModifyDeleteEventSLO() throws ApiException {
    // Create SLO
    eventSLO.setName(getUniqueEntityName());
    SLOListResponse sloResp = api.createSLO(eventSLO);
    ServiceLevelObjective created = sloResp.getData().get(0);
    deleteSLOs.add(created.getId());
    assertEquals(eventSLO.getName(), created.getName());

    // Edit SLO
    created.setDescription("Updated description");
    sloResp = api.updateSLO(created.getId(), created);
    ServiceLevelObjective edited = sloResp.getData().get(0);
    assertEquals(created.getDescription(), edited.getDescription());

    // Check that the SLO can be deleted
    CheckCanDeleteSLOResponse canDelete = api.checkCanDeleteSLO(edited.getId());
    assertEquals(Arrays.asList(edited.getId()), canDelete.getData().getOk());

    // Get SLO
    SLOResponse oneSLO = api.getSLO(edited.getId());
    assertEquals(edited.getId(), oneSLO.getData().getId());

    // Get SLO history
    // the contents of history really depend on the org that this test is running in, so we just
    // ensure
    // that the structure deserialized properly and no exception was thrown
    Long time = now.toEpochSecond();
    SLOHistoryResponse historyResp = api.getSLOHistory(edited.getId(), time - 11, time - 1);

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
    SLODeleteResponse deletedResp = api.deleteSLO(edited.getId());
    assertEquals(Arrays.asList(edited.getId()), deletedResp.getData());
  }

  /** Get multiple instances, test the bulk deletion endpoint */
  @Test
  public void testMultipleSLOInstances() throws ApiException {
    // Create a monitor for testing the monitor SLO
    Monitor m =
        new Monitor()
            .name(getUniqueEntityName())
            .type(MonitorType.METRIC_ALERT)
            .query("avg(last_5m):sum:system.net.bytes_rcvd{host:host0} > 100");
    m = mApi.createMonitor(m);
    deleteMonitors.add(m.getId());
    monitorSLO.monitorIds(Arrays.asList(m.getId()));
    monitorSLO.setName(getUniqueEntityName());

    // Create Monitor SLO
    SLOListResponse sloResp = api.createSLO(monitorSLO);
    final ServiceLevelObjective createdMonitorSLO = sloResp.getData().get(0);
    deleteSLOs.add(createdMonitorSLO.getId());

    // Create Event SLO
    eventSLO.setName(getUniqueEntityName());
    sloResp = api.createSLO(eventSLO);
    final ServiceLevelObjective createdEventSLO = sloResp.getData().get(0);
    deleteSLOs.add(createdEventSLO.getId());

    // Get multiple SLOs
    SLOListResponse slosResp =
        api.listSLOs(
            new ServiceLevelObjectivesApi.ListSLOsOptionalParameters()
                .ids(String.format("%s,%s", createdMonitorSLO.getId(), createdEventSLO.getId())));
    assertSLOInList(slosResp.getData(), createdEventSLO.getId());
    assertSLOInList(slosResp.getData(), createdMonitorSLO.getId());

    // Use bulk delete operation to delete the event SLO
    Map<String, List<SLOTimeframe>> toDelete =
        new HashMap<String, List<SLOTimeframe>>() {
          {
            put(createdEventSLO.getId(), Arrays.asList(SLOTimeframe.SEVEN_DAYS));
          }
        };
    SLOBulkDeleteResponse deletedResp = api.deleteSLOTimeframeInBulk(toDelete);
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
  public void createSLOErrorsTest() throws IOException {
    try {
      api.createSLO(new ServiceLevelObjectiveRequest());
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }

    try {
      fakeAuthApi.createSLO(new ServiceLevelObjectiveRequest());
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }

  @Test
  public void listSLOErrorsTest() throws IOException {
    try {
      api.listSLOs(new ServiceLevelObjectivesApi.ListSLOsOptionalParameters().ids("id1,id1"));
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }

    try {
      api.listSLOs(new ServiceLevelObjectivesApi.ListSLOsOptionalParameters().ids("id1,id2"));
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(404, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }

    try {
      fakeAuthApi.listSLOs(
          new ServiceLevelObjectivesApi.ListSLOsOptionalParameters().ids("id1,id2"));
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }

  @Test
  public void updateSLOErrorsTest() throws IOException {
    try {
      api.updateSLO("id", new ServiceLevelObjective());
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }

    try {
      fakeAuthApi.updateSLO("id", new ServiceLevelObjective());
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }

    ServiceLevelObjective updateMonitorSLO =
        new ServiceLevelObjective()
            .type(SLOType.MONITOR)
            .name(getUniqueEntityName())
            .description("Updated - Track the uptime of host foo which is critical to us.")
            .tags(Arrays.asList("app:core", "kpi"))
            .thresholds(
                Arrays.asList(
                    new SLOThreshold()
                        .timeframe(SLOTimeframe.THIRTY_DAYS)
                        .target(95.0)
                        .warning(98.0)));
    try {
      api.updateSLO("id", updateMonitorSLO);
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(404, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }

  @Test
  public void getSLOErrorsTest() throws IOException {
    try {
      fakeAuthApi.getSLO("id");
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }

    try {
      api.getSLO("id");
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(404, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }

  @Test
  public void deleteSLOErrorsTest() throws IOException {
    try {
      fakeAuthApi.deleteSLO("id");
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }

    try {
      api.deleteSLO("id");
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(404, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }

  @Test
  public void deleteSLO409ErrorTest() throws IOException {
    String fixtureData = TestUtils.getFixture(fixturePrefix + "/error_409_delete.json");
    stubFor(delete(urlPathEqualTo(apiUri + "/id")).willReturn(okJson(fixtureData).withStatus(409)));

    // FIXME: Make it an integration test when feature is fixed
    //// Create SLO and reference it in a dashboard to trigger 409
    try {
      unitApi.deleteSLO("id");
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(409, e.getCode());
      SLODeleteResponse error =
          objectMapper.readValue(e.getResponseBody(), SLODeleteResponse.class);
      assertNotNull(error.getErrors());
    }
  }

  @Test
  public void historyGetSLOErrorsTest() throws ApiException, IOException {
    // Create a monitor for testing the monitor SLO
    Monitor m =
        new Monitor()
            .name(getUniqueEntityName())
            .type(MonitorType.METRIC_ALERT)
            .query("avg(last_5m):sum:system.net.bytes_rcvd{host:host0} > 100");
    m = mApi.createMonitor(m);
    deleteMonitors.add(m.getId());
    monitorSLO.monitorIds(Arrays.asList(m.getId()));
    monitorSLO.setName(getUniqueEntityName());

    // Create SLO
    SLOListResponse sloResp = api.createSLO(monitorSLO);
    ServiceLevelObjective created = sloResp.getData().get(0);
    deleteSLOs.add(created.getId());

    try {
      api.getSLOHistory(created.getId(), Long.valueOf(123), Long.valueOf(12));
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }

    try {
      fakeAuthApi.getSLOHistory("id", Long.valueOf(123), Long.valueOf(12));
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }

    try {
      api.getSLOHistory("id", Long.valueOf(123), Long.valueOf(12));
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(404, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }

  @Test
  public void canDelete409SLOErrorTest() throws IOException {
    String fixtureData = TestUtils.getFixture(fixturePrefix + "/error_409_can_delete.json");
    stubFor(
        get(urlPathEqualTo(apiUri + "/can_delete"))
            .willReturn(okJson(fixtureData).withStatus(409)));
    // Mocked as the feature is in a broken state right now
    // FIXME: Make it an integration test when feature is fixed
    try {
      unitApi.checkCanDeleteSLO("id");
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(409, e.getCode());
      CheckCanDeleteSLOResponse error =
          objectMapper.readValue(e.getResponseBody(), CheckCanDeleteSLOResponse.class);
      assertNotNull(error.getErrors());
    }
  }

  @Test
  public void bulkDeleteSLOErrorsTest() throws IOException {
    Map<String, List<SLOTimeframe>> toDelete = new HashMap<String, List<SLOTimeframe>>();

    try {
      api.deleteSLOTimeframeInBulk(toDelete);
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }

    try {
      fakeAuthApi.deleteSLOTimeframeInBulk(toDelete);
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }
}
