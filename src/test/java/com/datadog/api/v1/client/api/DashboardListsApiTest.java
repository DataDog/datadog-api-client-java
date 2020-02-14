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
import org.junit.*;

import java.time.OffsetDateTime;
import java.util.ArrayList;

/**
 * API tests for DashboardListsApi
 */
public class DashboardListsApiTest extends V1ApiTest {

    private static DashboardListsApi api;
    private ArrayList<Long> dashboardListsToDelete;

    @Before
    public void resetDashboardListsToDelete() {
        dashboardListsToDelete = new ArrayList<Long>();
    }

    @BeforeClass
    public static void initApi() {
        api = new DashboardListsApi(generalApiClient);
    }

    @Test
    public void dashboardListCreateModifyDeleteTest() throws ApiException {

        long start = System.currentTimeMillis();
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

        // Delete the dashboard list
        DashboardListDeleteResponse res = api.deleteDashboardList(dashboardList.getId()).execute();
        assertEquals(res.getDeletedDashboardListId(), dashboardList.getId());
    }

    @After
    public void deleteDashboardLists() throws ApiException {
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
}
