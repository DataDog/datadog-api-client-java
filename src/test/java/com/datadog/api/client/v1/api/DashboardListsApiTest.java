/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.api;

import static org.junit.Assert.*;

import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.model.APIErrorResponse;
import com.datadog.api.client.v1.model.DashboardList;
import com.datadog.api.client.v1.model.DashboardListDeleteResponse;
import com.datadog.api.client.v1.model.DashboardListListResponse;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.ArrayList;
import org.junit.*;

/** API tests for DashboardListsApi */
public class DashboardListsApiTest extends V1ApiTest {

  private static DashboardListsApi api;
  private static DashboardListsApi fakeAuthApi;

  // ObjectMapper instance configure to not fail when encountering unknown properties
  private static ObjectMapper objectMapper =
      new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

  private ArrayList<Long> dashboardListsToDelete;

  @Override
  public String getTracingEndpoint() {
    return "dashboard-lists";
  }

  @Before
  public void resetDashboardListsToDelete() {
    dashboardListsToDelete = new ArrayList<Long>();
  }

  @BeforeClass
  public static void initApi() {
    api = new DashboardListsApi(generalApiClient);
    fakeAuthApi = new DashboardListsApi(generalFakeAuthApiClient);
  }

  @After
  public void deleteDashboardListsTest() throws ApiException {
    if (dashboardListsToDelete != null) {
      for (Long id : dashboardListsToDelete) {
        try {
          api.getDashboardList(id);
        } catch (ApiException e) {
          // doesn't exist => continue
          continue;
        }
        api.deleteDashboardList(id);
      }
    }
  }

  @Test
  public void dashboardListCreateModifyDeleteTest() throws ApiException {
    long start = now.toInstant().toEpochMilli();
    DashboardList testDashboardList = new DashboardList().name(getUniqueEntityName());

    // Create dashboard list
    DashboardList dashboardList = api.createDashboardList(testDashboardList);
    dashboardListsToDelete.add(dashboardList.getId());
    assertEquals(testDashboardList.getName(), dashboardList.getName());
    assertNotNull(dashboardList.getAuthor());
    assertNotNull(dashboardList.getCreated());
    assertEquals(new Long(0), dashboardList.getDashboardCount());
    assertNotNull(dashboardList.getModified());
    assertFalse(dashboardList.getIsFavorite());
    assertEquals("manual_dashboard_list", dashboardList.getType());

    // Get the dashboard list
    dashboardList = api.getDashboardList(dashboardList.getId());
    assertEquals(dashboardList.getName(), testDashboardList.getName());

    // Edit the dashboard list
    DashboardList editedDashboardList =
        new DashboardList().name(getUniqueEntityName() + "-updated");
    dashboardList = api.updateDashboardList(dashboardList.getId(), editedDashboardList);
    assertEquals(dashboardList.getName(), editedDashboardList.getName());

    // Get all dashboard lists
    DashboardListListResponse allDashboardLists = api.listDashboardLists();
    assertTrue(allDashboardLists.getDashboardLists().size() > 0);
    // The actual dashboardList model is asserted when we create and get, so just ensure the get all
    // is
    // returning the right object
    assertTrue(allDashboardLists.getDashboardLists().get(0) instanceof DashboardList);

    // Delete the dashboard list
    DashboardListDeleteResponse res = api.deleteDashboardList(dashboardList.getId());
    assertEquals(res.getDeletedDashboardListId(), dashboardList.getId());
  }

  @Test
  public void dashboardListListErrorsTest() throws IOException {
    try {
      fakeAuthApi.listDashboardLists();
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }

  @Test
  public void dashboardListCreateErrorsTest() throws IOException {
    try {
      api.createDashboardList(new DashboardList());
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }

    try {
      fakeAuthApi.createDashboardList(new DashboardList());
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }

  @Test
  public void dashboardListGetErrorsTest() throws IOException {
    try {
      fakeAuthApi.getDashboardList(new Long(1234));
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }

    try {
      api.getDashboardList(new Long(1234));
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(404, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }

  @Test
  public void dashboardListUpdateErrorsTest() throws IOException {
    try {
      api.updateDashboardList(new Long(1234), new DashboardList());
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }

    try {
      fakeAuthApi.updateDashboardList(new Long(1234), new DashboardList());
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }

    try {
      api.updateDashboardList(new Long(1234), new DashboardList().name("nonexistent"));
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(404, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }

  @Test
  public void dashboardListDeleteErrorsTest() throws IOException {
    try {
      fakeAuthApi.deleteDashboardList(new Long(1234));
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }

    try {
      api.getDashboardList(new Long(1234));
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(404, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }
}
