/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.auth;

import static org.junit.Assert.*;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.Pair;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.Test;

public class HttpBearerAuthTest {

  @Test
  public void testSetAndGetBearerToken() {
    HttpBearerAuth auth = new HttpBearerAuth("bearer");
    assertNull(auth.getBearerToken());

    auth.setBearerToken("test-token-123");
    assertEquals("test-token-123", auth.getBearerToken());
  }

  @Test
  public void testApplyToParamsAddsBearerHeader() throws ApiException {
    HttpBearerAuth auth = new HttpBearerAuth("bearer");
    auth.setBearerToken("my-pat-token");

    List<Pair> queryParams = new ArrayList<>();
    Map<String, String> headerParams = new HashMap<>();
    Map<String, String> cookieParams = new HashMap<>();

    auth.applyToParams(
        queryParams, headerParams, cookieParams, "", "", URI.create("https://example.com"));

    assertEquals("Bearer my-pat-token", headerParams.get("Authorization"));
    assertTrue(queryParams.isEmpty());
    assertTrue(cookieParams.isEmpty());
  }

  @Test
  public void testApplyToParamsNullTokenIsNoOp() throws ApiException {
    HttpBearerAuth auth = new HttpBearerAuth("bearer");

    List<Pair> queryParams = new ArrayList<>();
    Map<String, String> headerParams = new HashMap<>();
    Map<String, String> cookieParams = new HashMap<>();

    auth.applyToParams(
        queryParams, headerParams, cookieParams, "", "", URI.create("https://example.com"));

    assertFalse(headerParams.containsKey("Authorization"));
  }

  @Test
  public void testApiClientRegistersBearerAuth() {
    ApiClient client = new ApiClient();
    // setBearerToken should not throw since bearerAuth is now registered
    client.setBearerToken("test-pat");
  }

  @Test
  public void testApiClientSetBearerTokenApplied() throws ApiException {
    ApiClient client = new ApiClient();
    client.setBearerToken("my-pat-token");

    // Verify through the authentication map that the token was set
    Map<String, Authentication> auths = client.getAuthentications();
    Authentication auth = auths.get("bearerAuth");
    assertNotNull("bearerAuth should be registered", auth);
    assertTrue("bearerAuth should be HttpBearerAuth", auth instanceof HttpBearerAuth);
    assertEquals("my-pat-token", ((HttpBearerAuth) auth).getBearerToken());
  }
}
