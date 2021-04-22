/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v2.client.api;

import static org.junit.Assert.*;

import com.datadog.api.RecordingMode;
import com.datadog.api.TestUtils;
import com.datadog.api.v1.client.model.DashboardList;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.model.*;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.client.HttpUrlConnectorProvider;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/** API tests for DashboardListsApi */
public class DashboardListsApiTest extends V2APITest {

  private static final String INTEGRATION_TIMEBOARD_ID = "1";
  private static final String CUSTOM_TIMEBOARD_ID = "q5j-nti-fv6";
  private static final String CUSTOM_SCREENBOARD_ID = "4n7-s4g-dqv";
  private static com.datadog.api.v1.client.api.DashboardListsApi dashboardListsApiV1;
  private static long dashboardListID;
  private final DashboardListsApi api = new DashboardListsApi(generalApiClient);

  @Override
  public String getTracingEndpoint() {
    return "dashboard-lists";
  }

  @After
  public void deleteDashboardList() throws com.datadog.api.v1.client.ApiException {
    dashboardListsApiV1.deleteDashboardList(dashboardListID);
  }

  @Before
  public void createDashboardList()
      throws com.datadog.api.v1.client.ApiException, NoSuchAlgorithmException {
    com.datadog.api.v1.client.ApiClient v1Client = new com.datadog.api.v1.client.ApiClient();
    HashMap<String, String> secrets = new HashMap<>();
    secrets.put("apiKeyAuth", TEST_API_KEY);
    secrets.put("appKeyAuth", TEST_APP_KEY);
    v1Client.configureApiKeys(secrets);
    v1Client.setDebugging("true".equals(System.getenv("DEBUG")));
    ClientConfig config = (ClientConfig) v1Client.getHttpClient().getConfiguration();
    if (!TestUtils.getRecordingMode().equals(RecordingMode.MODE_REPLAYING)) {
      if (!TestUtils.getRecordingMode().equals(RecordingMode.MODE_IGNORE)) {
        config.connectorProvider(
            new HttpUrlConnectorProvider()
                .connectionFactory(new TestUtils.MockServerProxyConnectionFactory()));
      }
    } else {
      // Set base path to the mock server for replaying
      v1Client.setBasePath(
          "https://" + TestUtils.MOCKSERVER_HOST + ":" + TestUtils.MOCKSERVER_PORT);
      v1Client.setServerIndex(null);
    }

    dashboardListsApiV1 = new com.datadog.api.v1.client.api.DashboardListsApi(v1Client);
    DashboardList res =
        dashboardListsApiV1.createDashboardList(new DashboardList().name(getUniqueEntityName()));
    dashboardListID = res.getId();
  }

  @Test
  public void dashboardListItemCRUDTest() throws ApiException {
    Set<String> expectedIds = new HashSet<String>();
    expectedIds.addAll(
        Arrays.asList(
            new String[] {INTEGRATION_TIMEBOARD_ID, CUSTOM_TIMEBOARD_ID, CUSTOM_SCREENBOARD_ID}));

    DashboardListItemRequest integrationTimeboardRequest =
        new DashboardListItemRequest()
            .type(DashboardType.INTEGRATION_TIMEBOARD)
            .id(INTEGRATION_TIMEBOARD_ID);
    DashboardListItemRequest customTimeboardRequest =
        new DashboardListItemRequest().type(DashboardType.CUSTOM_TIMEBOARD).id(CUSTOM_TIMEBOARD_ID);
    DashboardListItemRequest customScreenboardRequest =
        new DashboardListItemRequest()
            .type(DashboardType.CUSTOM_SCREENBOARD)
            .id(CUSTOM_SCREENBOARD_ID);
    ArrayList<DashboardListItemRequest> dashboardsRequest = new ArrayList<>();
    dashboardsRequest.add(integrationTimeboardRequest);
    dashboardsRequest.add(customTimeboardRequest);
    dashboardsRequest.add(customScreenboardRequest);

    DashboardListAddItemsRequest addRequest =
        new DashboardListAddItemsRequest().dashboards(dashboardsRequest);
    DashboardListAddItemsResponse addResponse =
        api.createDashboardListItems(dashboardListID, addRequest);
    assertNotNull(addResponse.getAddedDashboardsToList());
    assertEquals(3, addResponse.getAddedDashboardsToList().size());
    Set<String> ids =
        addResponse.getAddedDashboardsToList().stream()
            .map(DashboardListItemResponse::getId)
            .collect(Collectors.toSet());
    assertEquals(ids, expectedIds);

    DashboardListDeleteItemsRequest deleteRequest =
        new DashboardListDeleteItemsRequest().dashboards(dashboardsRequest);
    DashboardListDeleteItemsResponse deleteResponse =
        api.deleteDashboardListItems(dashboardListID, deleteRequest);
    assertNotNull(deleteResponse.getDeletedDashboardsFromList());
    assertEquals(3, deleteResponse.getDeletedDashboardsFromList().size());

    ids =
        deleteResponse.getDeletedDashboardsFromList().stream()
            .map(DashboardListItemResponse::getId)
            .collect(Collectors.toSet());
    assertEquals(ids, expectedIds);

    DashboardListItems getResponse = api.getDashboardListItems(dashboardListID);
    assertNotNull(getResponse.getTotal());
    assertEquals(0, (long) getResponse.getTotal());
    assertEquals(0, getResponse.getDashboards().size());

    DashboardListUpdateItemsRequest updateRequest =
        new DashboardListUpdateItemsRequest().dashboards(dashboardsRequest);
    DashboardListUpdateItemsResponse updateResponse =
        api.updateDashboardListItems(dashboardListID, updateRequest);
    assertNotNull(updateResponse.getDashboards());
    assertEquals(3, updateResponse.getDashboards().size());

    ids =
        updateResponse.getDashboards().stream()
            .map(DashboardListItemResponse::getId)
            .collect(Collectors.toSet());
    assertEquals(ids, expectedIds);

    // Leave only one dash in the list for easier assertion
    dashboardsRequest.remove(2);
    deleteResponse = api.deleteDashboardListItems(dashboardListID, deleteRequest);
    assertNotNull(deleteResponse.getDeletedDashboardsFromList());
    assertEquals(2, deleteResponse.getDeletedDashboardsFromList().size());
    getResponse = api.getDashboardListItems(dashboardListID);
    assertNotNull(getResponse.getDashboards());
    assertNotNull(getResponse.getTotal());
    assertEquals(1, getResponse.getDashboards().size());
    assertEquals(1, (long) getResponse.getTotal());
    assertTrue(getResponse.getDashboards().get(0).getIsReadOnly());
    assertTrue(getResponse.getDashboards().get(0).getIsShared());
    assertEquals(CUSTOM_SCREENBOARD_ID, getResponse.getDashboards().get(0).getId());
    assertEquals(DashboardType.CUSTOM_SCREENBOARD, getResponse.getDashboards().get(0).getType());
    assertEquals(
        "For dashboard list tests - DO NOT DELETE", getResponse.getDashboards().get(0).getTitle());
    assertEquals(
        "/dashboard/4n7-s4g-dqv/for-dashboard-list-tests---do-not-delete",
        getResponse.getDashboards().get(0).getUrl());
    assertTrue(getResponse.getDashboards().get(0).getPopularity() >= 0);
    assertNotNull(getResponse.getDashboards().get(0).getAuthor());
    assertNotNull(getResponse.getDashboards().get(0).getModified());
    assertNotNull(getResponse.getDashboards().get(0).getCreated());
    assertNull(getResponse.getDashboards().get(0).getIcon());
  }
}
