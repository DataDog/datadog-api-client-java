/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.api;

import static org.junit.Assert.*;

import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.model.APIErrorResponse;
import com.datadog.api.client.v1.model.AuthenticationValidationResponse;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import org.junit.BeforeClass;
import org.junit.Test;

/** API tests for AuthenticationApi */
public class AuthenticationApiTest extends V1ApiTest {

  private static AuthenticationApi api;
  private static AuthenticationApi fakeAuthApi;

  // ObjectMapper instance configure to not fail when encountering unknown properties
  private static ObjectMapper objectMapper =
      new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

  @Override
  public String getTracingEndpoint() {
    return "validation";
  }

  @BeforeClass
  public static void initApi() {
    api = new AuthenticationApi(generalApiClient);
    fakeAuthApi = new AuthenticationApi(generalFakeAuthApiClient);
  }

  @Test
  public void validateTest() throws ApiException {
    AuthenticationValidationResponse response = api.validate();
    assertTrue(response.getValid());
  }

  @Test
  public void validateInvalidTest() throws IOException {
    try {
      fakeAuthApi.validate();
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }
}
