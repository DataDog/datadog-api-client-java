/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v1.client.api;

import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.model.DashboardList;
import com.datadog.api.v1.client.model.DashboardListDeleteResponse;

import static org.junit.Assert.*;

import com.datadog.api.v1.client.model.DashboardListListResponse;
import org.junit.*;

import java.util.ArrayList;

/**
 * API tests for DashboardListsApi
 */
public class DashboardListsApiTest extends V1ApiTest {

    private static DashboardListsApi api;
    private static DashboardListsApi fakeAuthApi;

    private ArrayList<Long> dashboardListsToDelete;

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
                    api.getDashboardList(id).execute();
                } catch (ApiException e) {
                    // doesn't exist => continue
                    continue;
                }
                api.deleteDashboardList(id).execute();
            }
        }
    }

    @Test
    public void dashboardListCreateModifyDeleteTest() throws ApiException {
        long start = now.toInstant().toEpochMilli();
        DashboardList testDashboardList = new DashboardList().name(String.format("java dashboard list %d", start));

        // Create dashboard list
        DashboardList dashboardList = api.createDashboardList().body(testDashboardList).execute();
        dashboardListsToDelete.add(dashboardList.getId());
        assertEquals(testDashboardList.getName(), dashboardList.getName());
        assertNotNull(dashboardList.getAuthor());
        assertNotNull(dashboardList.getCreated());
        assertEquals(new Long(0), dashboardList.getDashboardCount());
        assertNotNull(dashboardList.getModified());
        assertFalse(dashboardList.getIsFavorite());
        assertEquals("manual_dashboard_list", dashboardList.getType());

        // Get the dashboard list
        dashboardList = api.getDashboardList(dashboardList.getId()).execute();
        assertEquals(dashboardList.getName(), testDashboardList.getName());

        // Edit the dashboard list
        DashboardList editedDashboardList = new DashboardList().name(String.format("java updated dashboard list %d", start));
        dashboardList = api.updateDashboardList(dashboardList.getId()).body(editedDashboardList).execute();
        assertEquals(dashboardList.getName(), editedDashboardList.getName());

        // Get all dashboard lists
        DashboardListListResponse allDashboardLists = api.listDashboardLists().execute();
        assertTrue(allDashboardLists.getDashboardLists().size() > 0);
        // The actual dashboardList model is asserted when we create and get, so just ensure the get all is
        // returning the right object
        assertTrue(allDashboardLists.getDashboardLists().get(0) instanceof DashboardList);

        // Delete the dashboard list
        DashboardListDeleteResponse res = api.deleteDashboardList(dashboardList.getId()).execute();
        assertEquals(res.getDeletedDashboardListId(), dashboardList.getId());
    }

    @Test
    public void dashboardListListErrorsTest() {
        try {
            fakeAuthApi.listDashboardLists().execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(403, e.getCode());
        }
    }

    @Test
    public void dashboardListCreateErrorsTest() {
        try {
            api.createDashboardList().body(new DashboardList()).execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(400, e.getCode());
        }

        try {
            fakeAuthApi.createDashboardList().body(new DashboardList()).execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(403, e.getCode());
        }
    }

    @Test
    public void dashboardListGetErrorsTest() {
        try {
            fakeAuthApi.getDashboardList(new Long(1234)).execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(403, e.getCode());
        }

        try {
            api.getDashboardList(new Long(1234)).execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(404, e.getCode());
        }
    }

    @Test
    public void dashboardListUpdateErrorsTest() {
        try {
            api.updateDashboardList(new Long(1234)).body(new DashboardList()).execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(400, e.getCode());
        }

        try {
            fakeAuthApi.updateDashboardList(new Long(1234)).body(new DashboardList()).execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(403, e.getCode());
        }

        try {
            api.updateDashboardList(new Long(1234)).body(new DashboardList().name("nonexistent")).execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(404, e.getCode());
        }
    }

    @Test
    public void dashboardListDeleteErrorsTest() {
        try {
            fakeAuthApi.deleteDashboardList(new Long(1234)).execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(403, e.getCode());
        }

        try {
            api.getDashboardList(new Long(1234)).execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(404, e.getCode());
        }
    }
}
