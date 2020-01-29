/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.datadog.api.v1.client.api;

import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.model.*;
import org.junit.*;

import java.util.ArrayList;
import java.util.List;

/**
 * API tests for DashboardsApi
 */
public class DashboardsApiTest extends V1ApiTest{

    private static DashboardsApi api;
    private List<String> cleanupDashIDs = new ArrayList<>();

    @BeforeClass
    public static void initAPI() {
        api = new DashboardsApi(generalApiClient);
    }

    @After
    public void cleanupDashboards() throws ApiException {
        for (String ID: cleanupDashIDs) {
            api.deleteDashboard(ID).execute();
        }
    }

    /**
     * Create a new Dashboard
     *
     * ### Overview Create a dashboard using the specified options ### Arguments * **&#x60;Dashboard&#x60;** [*required*] The Dashboard Object to create
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createDashboardTest() throws ApiException {
        NoteWidgetDefinition noteDefinition = new NoteWidgetDefinition()
                .fontSize("13").content("Test Note Widget Example");
        Widget noteWidget = new Widget()
                .definition(noteDefinition)
                .layout(new WidgetLayout()
                        .width(10L)
                        .height(10L)
                        .y(10L)
                        .x(10L));
        Dashboard dashboard = new Dashboard()
                .layoutType(Dashboard.LayoutTypeEnum.FREE)
                .addWidgetsItem(noteWidget)
                .title("Nick Test Dashboard");

        Dashboard response = api.createDashboard()
                .body(dashboard)
                .execute();
        cleanupDashIDs.add(response.getId());
        api.getDashboard(response.getId()).execute();
        // TODO: test validations
    }

}
