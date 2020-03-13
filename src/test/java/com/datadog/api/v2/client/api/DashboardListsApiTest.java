/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v2.client.api;

import com.datadog.api.TestUtils;
import com.datadog.api.v1.client.model.DashboardList;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.model.*;
import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.client.HttpUrlConnectorProvider;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.*;

/**
 * API tests for DashboardListsApi
 */
public class DashboardListsApiTest extends V2APITest {

    private static final String INTEGRATION_TIMEBOARD_ID = "1";
    private static final String CUSTOM_TIMEBOARD_ID = "q5j-nti-fv6";
    private static final String CUSTOM_SCREENBOARD_ID = "4n7-s4g-dqv";
    private static com.datadog.api.v1.client.api.DashboardListsApi dashboardListsApiV1;
    private static long dashboardListID;
    private final DashboardListsApi api = new DashboardListsApi(generalApiClient);

    @After
    public void deleteDashboardList() throws com.datadog.api.v1.client.ApiException {
        dashboardListsApiV1.deleteDashboardList(dashboardListID).execute();
    }

    @Before
    public void createDashboardList() throws com.datadog.api.v1.client.ApiException, NoSuchAlgorithmException {
        com.datadog.api.v1.client.ApiClient v1Client = new com.datadog.api.v1.client.ApiClient();
        HashMap<String, String> secrets = new HashMap<>();
        secrets.put("apiKeyAuth", TEST_API_KEY);
        secrets.put("appKeyAuth", TEST_APP_KEY);
        v1Client.configureApiKeys(secrets);
        v1Client.setDebugging("true".equals(System.getenv("DEBUG")));
        ClientConfig config = (ClientConfig) v1Client.getHttpClient().getConfiguration();
        config.connectorProvider(new HttpUrlConnectorProvider().connectionFactory(new TestUtils.MockServerProxyConnectionFactory()));

        dashboardListsApiV1 = new com.datadog.api.v1.client.api.DashboardListsApi(v1Client);
        DashboardList res = dashboardListsApiV1.createDashboardList().body(
                new DashboardList().name("java-test-client-v2-" + now.toInstant().toEpochMilli())
        ).execute();
        dashboardListID = res.getId();
    }

    @Test
    public void dashboardListItemCRUDTest() throws ApiException {
        DashboardListItem integrationTimeboard = new DashboardListItem().type(DashboardType.INTEGRATION_TIMEBOARD).id(INTEGRATION_TIMEBOARD_ID);
        DashboardListItem customTimeboard = new DashboardListItem().type(DashboardType.CUSTOM_TIMEBOARD).id(CUSTOM_TIMEBOARD_ID);
        DashboardListItem customScreenboard = new DashboardListItem().type(DashboardType.CUSTOM_SCREENBOARD).id(CUSTOM_SCREENBOARD_ID);
        ArrayList<DashboardListItem> dashboards = new ArrayList<>();
        dashboards.add(integrationTimeboard);
        dashboards.add(customTimeboard);
        dashboards.add(customScreenboard);
        DashboardListItems body = new DashboardListItems().dashboards(dashboards);

        DashboardListAddItemsResponse addResponse = api.addDashboardListItems(dashboardListID).body(body).execute();
        assertNotNull(addResponse.getAddedDashboardsToList());
        assertEquals(3, addResponse.getAddedDashboardsToList().size());
        assertTrue(addResponse.getAddedDashboardsToList().contains(integrationTimeboard));
        assertTrue(addResponse.getAddedDashboardsToList().contains(customTimeboard));
        assertTrue(addResponse.getAddedDashboardsToList().contains(customScreenboard));

        DashboardListDeleteItemsResponse deleteResponse = api.deleteDashboardListItems(dashboardListID).body(body).execute();
        assertNotNull(deleteResponse.getDeletedDashboardsFromList());
        assertEquals(3, deleteResponse.getDeletedDashboardsFromList().size());
        assertTrue(deleteResponse.getDeletedDashboardsFromList().contains(integrationTimeboard));
        assertTrue(deleteResponse.getDeletedDashboardsFromList().contains(customTimeboard));
        assertTrue(deleteResponse.getDeletedDashboardsFromList().contains(customScreenboard));

        DashboardListItems getResponse = api.getDashboardListItems(dashboardListID).execute();
        assertNotNull(getResponse.getTotal());
        assertEquals(0, (long) getResponse.getTotal());
        assertEquals(0, getResponse.getDashboards().size());

        DashboardListItems updateResponse = api.updateDashboardListItems(dashboardListID).body(body).execute();
        assertNotNull(updateResponse.getDashboards());
        assertEquals(3, updateResponse.getDashboards().size());
        assertTrue(updateResponse.getDashboards().contains(integrationTimeboard));
        assertTrue(updateResponse.getDashboards().contains(customTimeboard));
        assertTrue(updateResponse.getDashboards().contains(customScreenboard));

        // Leave only one dash in the list for easier assertion
        dashboards.remove(2);
        deleteResponse = api.deleteDashboardListItems(dashboardListID).body(body).execute();
        assertNotNull(deleteResponse.getDeletedDashboardsFromList());
        assertEquals(2, deleteResponse.getDeletedDashboardsFromList().size());
        getResponse = api.getDashboardListItems(dashboardListID).execute();
        assertNotNull(getResponse.getDashboards());
        assertNotNull(getResponse.getTotal());
        assertEquals(1, getResponse.getDashboards().size());
        assertEquals(1, (long) getResponse.getTotal());
        assertTrue(getResponse.getDashboards().get(0).getIsReadOnly());
        assertTrue(getResponse.getDashboards().get(0).getIsShared());
        assertEquals(CUSTOM_SCREENBOARD_ID, getResponse.getDashboards().get(0).getId());
        assertEquals(DashboardType.CUSTOM_SCREENBOARD, getResponse.getDashboards().get(0).getType());
        assertEquals("For dashboard list tests - DO NOT DELETE", getResponse.getDashboards().get(0).getTitle());
        assertEquals("/dashboard/4n7-s4g-dqv/for-dashboard-list-tests---do-not-delete", getResponse.getDashboards().get(0).getUrl());
        assertTrue(getResponse.getDashboards().get(0).getPopularity() >= 0);
        assertNotNull(getResponse.getDashboards().get(0).getAuthor());
        assertNotNull(getResponse.getDashboards().get(0).getModified());
        assertNotNull(getResponse.getDashboards().get(0).getCreated());
        assertNull(getResponse.getDashboards().get(0).getIcon());
    }
}
