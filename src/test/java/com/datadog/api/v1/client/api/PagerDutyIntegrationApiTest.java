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

import static org.junit.Assert.*;

import com.datadog.api.TestUtils;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.ApiResponse;
import com.datadog.api.v1.client.model.*;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.ArrayList;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/** API tests for PagerDutyIntegrationApi */
public class PagerDutyIntegrationApiTest extends V1ApiTest {

  private static PagerDutyIntegrationApi api;
  private static PagerDutyIntegrationApi fakeAuthApi;

  private ArrayList<String> removeServices = null;

  // ObjectMapper instance configure to not fail when encountering unknown properties
  private static ObjectMapper objectMapper =
      new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

  @Override
  public String getTracingEndpoint() {
    return "integration-pagerduty";
  }

  @BeforeClass
  public static void initAPI() {
    api = new PagerDutyIntegrationApi(generalApiClient);
    fakeAuthApi = new PagerDutyIntegrationApi(generalFakeAuthApiClient);
  }

  @Before
  public void resetServices() {
    removeServices = new ArrayList<String>();
  }

  @After
  public void removeServices() {
    for (String serviceName : removeServices) {
      try {
        api.deletePagerDutyIntegrationService(serviceName);
      } catch (ApiException e) {
        System.out.println(
            String.format(
                "Problem with removing PagerDuty integration service %s: %s", serviceName, e));
      }
    }
  }

  /**
   * Test a PagerDuty integration lifecycle
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void lifecyclePagerDutyIntegrationTest() throws ApiException, TestUtils.RetryException {
    String serviceName = getUniqueEntityName();

    // Add single service object to the PagerDuty Integration
    PagerDutyService serviceBody =
        new PagerDutyService().serviceName(serviceName).serviceKey("deadbeef");
    ApiResponse<PagerDutyServiceName> serviceNameResponse =
        api.createPagerDutyIntegrationServiceWithHttpInfo(serviceBody);
    removeServices.add(serviceNameResponse.getData().getServiceName());
    assertEquals(201, serviceNameResponse.getStatusCode());
    assertEquals(serviceBody.getServiceName(), serviceNameResponse.getData().getServiceName());

    // Get created Service object
    PagerDutyServiceName service = api.getPagerDutyIntegrationService(serviceName);
    assertEquals(serviceBody.getServiceName(), service.getServiceName());

    // Update service object
    PagerDutyServiceKey serviceKey = new PagerDutyServiceKey();
    serviceKey.setServiceKey("newkey");
    api.updatePagerDutyIntegrationService(serviceName, serviceKey);

    // Delete Service Object
    ApiResponse<Void> serviceDeleteResponse =
        api.deletePagerDutyIntegrationServiceWithHttpInfo(serviceName);
    assertEquals(200, serviceDeleteResponse.getStatusCode());

    // Make sure the service object was deleted
    try {
      api.getPagerDutyIntegrationService(serviceName);
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(404, e.getCode());
    }
  }

  @Test
  public void createPagerDutyIntegrationServicesTest() throws IOException {
    PagerDutyService body =
        new PagerDutyService().serviceKey("lalaa").serviceName(getUniqueEntityName());

    try {
      PagerDutyServiceName service =
          api.createPagerDutyIntegrationService(new PagerDutyService());
      removeServices.add(service.getServiceName());
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }

    try {
      fakeAuthApi.createPagerDutyIntegrationService(body);
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }

  @Test
  public void getPagerDutyIntegrationServicesTest() throws IOException {
    try {
      fakeAuthApi.getPagerDutyIntegrationService(getUniqueEntityName());
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }

    try {
      api.getPagerDutyIntegrationService(getUniqueEntityName());
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(404, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }

  @Test
  public void updatePagerDutyIntegrationServicesTest() throws IOException {
    String serviceName = getUniqueEntityName();
    PagerDutyServiceKey body = new PagerDutyServiceKey().serviceKey("lalaa");

    try {
      api.updatePagerDutyIntegrationService(serviceName, new PagerDutyServiceKey());
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }

    try {
      fakeAuthApi.updatePagerDutyIntegrationService(serviceName, body);
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }

    try {
      api.updatePagerDutyIntegrationService(serviceName, body);
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(404, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }

  @Test
  public void deletePagerDutyIntegrationServicesTest() throws IOException {
    String serviceName = getUniqueEntityName();

    try {
      fakeAuthApi.deletePagerDutyIntegrationService(serviceName);
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }

    try {
      api.deletePagerDutyIntegrationService(serviceName);
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(404, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }
}
