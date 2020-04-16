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

import com.datadog.api.TestUtils;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.ApiResponse;
import com.datadog.api.v1.client.model.*;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * API tests for PagerDutyIntegrationApi
 */
public class PagerDutyIntegrationApiTest extends V1ApiTest {

    private static PagerDutyIntegrationApi api;
    private static PagerDutyIntegrationApi fakeAuthApi;

    @BeforeClass
    public static void initAPI() {
        api = new PagerDutyIntegrationApi(generalApiClient);
        fakeAuthApi = new PagerDutyIntegrationApi(generalFakeAuthApiClient);
    }

    @After
    public void removeIntegration() {
        try {
            api.deletePagerDutyIntegration().execute();
        } catch (ApiException e) {
            System.out.println(String.format("Problem with removing PagerDuty integration: %s", e));
        }
    }

    /**
     * Make sure that there is not parallel execution.
     *
     * @throws TestUtils.RetryException
     */
    protected void ensureNoPagerDuty() throws TestUtils.RetryException {
        TestUtils.retry(5, 10, () -> {
            try {
                api.getPagerDutyIntegration().execute();
            } catch (ApiException e) {
                // integration does not exist
                return true;
            }
            // wait until other test finish
            return false;
        });
    }

    /**
     * Test a PagerDuty integration lifecycle
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void lifecyclePagerDutyIntegrationTest() throws ApiException, TestUtils.RetryException {
        ensureNoPagerDuty();

        PagerDutyIntegration body = new PagerDutyIntegration()
                .subdomain("_deadbeef")
                .apiToken("y_NbAkKc66ryYTWUXYEu");

        // Create a new PagerDuty integration
        ApiResponse<Void> response = api.createPagerDutyIntegration()
                .body(body)
                .executeWithHttpInfo();
        assertEquals(204, response.getStatusCode());

        // Get PagerDuty integration
        PagerDutyIntegration pagerDuty = api.getPagerDutyIntegration().execute();
        assertEquals(body.getSubdomain(), pagerDuty.getSubdomain());
        assertEquals("*****", pagerDuty.getApiToken());
        assertEquals(0, pagerDuty.getServices().size());
        assertEquals(0, pagerDuty.getSchedules().size());

        // Add a Service and Schedules items by updating the PagerDuty Integration
        PagerDutyServicesAndSchedules servicesAndSchedules = new PagerDutyServicesAndSchedules()
                .addServicesItem(new PagerDutyService()
                        .serviceName("test_java")
                        .serviceKey("deadbeef"))
                .addSchedulesItem( "https://_deadbeef.pagerduty.com/schedules#DEAD3F");

        api.updatePagerDutyIntegration().body(servicesAndSchedules).execute();

        // Get Pager Duty Integration
        PagerDutyIntegration updatedPagerDuty = api.getPagerDutyIntegration().execute();
        assertEquals(pagerDuty.getSubdomain(), updatedPagerDuty.getSubdomain());
        assertEquals("*****", updatedPagerDuty.getApiToken());
        assertEquals(1, updatedPagerDuty.getSchedules().size());
        assertEquals(servicesAndSchedules.getSchedules().get(0), updatedPagerDuty.getSchedules().get(0));
        assertEquals(1, updatedPagerDuty.getServices().size());
        assertEquals(servicesAndSchedules.getServices().get(0).getServiceName(), updatedPagerDuty.getServices().get(0).getServiceName());
        assertEquals("*****", updatedPagerDuty.getServices().get(0).getServiceKey());

        // Add single service object to the PagerDuty Integration
        PagerDutyService serviceBody = new PagerDutyService().serviceName("test_java_2") .serviceKey("deadbeef");
        ApiResponse<PagerDutyServiceName> serviceNameResponse = api.createPagerDutyIntegrationService().body(serviceBody).executeWithHttpInfo();
        assertEquals(201, serviceNameResponse.getStatusCode());
        assertEquals(serviceBody.getServiceName(), serviceNameResponse.getData().getServiceName());

        // Get created Service object
        PagerDutyServiceName serviceName = api.getPagerDutyIntegrationService("test_java_2").execute();
        assertEquals(serviceBody.getServiceName(), serviceName.getServiceName());

        // Get previously added service item
        serviceName = api.getPagerDutyIntegrationService("test_java").execute();
        assertEquals("test_java", serviceName.getServiceName());

        // Update service object
        PagerDutyServiceKey serviceKey = new PagerDutyServiceKey();
        serviceKey.setServiceKey("newkey");
        api.updatePagerDutyIntegrationService("test_java_2").body(serviceKey).executeWithHttpInfo();

        // Delete Service Object
        ApiResponse<Void> serviceDeleteResponse = api.deletePagerDutyIntegrationService("test_java").executeWithHttpInfo();
        assertEquals(200, serviceDeleteResponse.getStatusCode());

        // Get created Service object
        pagerDuty = api.getPagerDutyIntegration().execute();
        assertEquals(1, pagerDuty.getSchedules().size());
        assertEquals(servicesAndSchedules.getSchedules().get(0), pagerDuty.getSchedules().get(0));
        assertEquals(1, pagerDuty.getServices().size());
        assertEquals("test_java_2", pagerDuty.getServices().get(0).getServiceName());
        assertEquals("*****", pagerDuty.getServices().get(0).getServiceKey());

        // Delete Pager Duty Integration
        ApiResponse<Void> deleteResponse = api.deletePagerDutyIntegration().executeWithHttpInfo();
        assertEquals(204, deleteResponse.getStatusCode());
    }

    /**
     * Get a PagerDuty integration
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPagerDutyIntegrationTest() throws TestUtils.RetryException {
        ensureNoPagerDuty();

        try {
            fakeAuthApi.getPagerDutyIntegration().execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(403, e.getCode());
        }

        try {
            api.getPagerDutyIntegration().execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(404, e.getCode());
        }
    }

    @Test
    public void createPagerDutyIntegrationTest() {
        PagerDutyIntegration body = new PagerDutyIntegration()
                .subdomain("subdomain")
                .apiToken("apitoken");

        try {
            api.createPagerDutyIntegration().body(body).execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(400, e.getCode());
        }

        try {
            fakeAuthApi.createPagerDutyIntegration().body(body).execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(403, e.getCode());
        }
    }

    @Test
    public void updatePagerDutyIntegrationTest() {
        PagerDutyServicesAndSchedules body = new PagerDutyServicesAndSchedules()
                .schedules(Arrays.asList(new String[]{"schedule"}));

        try {
            api.updatePagerDutyIntegration().body(body).execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(400, e.getCode());
        }

        try {
            fakeAuthApi.updatePagerDutyIntegration().body(body).execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(403, e.getCode());
        }
    }

    @Test
    public void deletePagerDutyIntegrationTest() {
        try {
            fakeAuthApi.deletePagerDutyIntegration().execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(403, e.getCode());
        }
    }

    @Test
    public void createPagerDutyIntegrationServicesTest() {
        PagerDutyService body = new PagerDutyService()
                .serviceKey("lalaa")
                .serviceName("lalasa");

        try {
            api.createPagerDutyIntegrationService().body(new PagerDutyService()).execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(400, e.getCode());
        }

        try {
            fakeAuthApi.createPagerDutyIntegrationService().body(body).execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(403, e.getCode());
        }

        try {
            api.createPagerDutyIntegrationService().body(body).execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(404, e.getCode());
        }
    }

    @Test
    public void getPagerDutyIntegrationServicesTest() {
        try {
            fakeAuthApi.getPagerDutyIntegrationService("service").execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(403, e.getCode());
        }

        try {
            api.getPagerDutyIntegrationService("service").execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(404, e.getCode());
        }
    }

    @Test
    public void updatePagerDutyIntegrationServicesTest() {
        PagerDutyServiceKey body = new PagerDutyServiceKey()
                .serviceKey("lalaa");

        try {
            api.updatePagerDutyIntegrationService("qoisdfhanniq").body(new PagerDutyServiceKey()).execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(400, e.getCode());
        }

        try {
            fakeAuthApi.updatePagerDutyIntegrationService("qoisdfhanniq").body(body).execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(403, e.getCode());
        }

        try {
            api.updatePagerDutyIntegrationService("qoisdfhanniq").body(body).execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(404, e.getCode());
        }
    }

    @Test
    public void deletePagerDutyIntegrationServicesTest() {
        try {
            fakeAuthApi.deletePagerDutyIntegrationService("lqnioiuyzbefnkje").execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(403, e.getCode());
        }

        try {
            api.deletePagerDutyIntegrationService("lqnioiuyzbefnkje").execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(404, e.getCode());
        }
    }
}
