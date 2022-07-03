/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v1.client.auth;

import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Pair;
import java.net.URI;
import java.util.List;
import java.util.Map;

public interface Authentication {
  /**
   * Apply authentication settings to header and query params.
   *
   * @param queryParams List of query parameters
   * @param headerParams Map of header parameters
   * @param cookieParams Map of cookie parameters
   * @param payload Raw payload
   * @param method HTTP method to authenticate
   * @param uri URI to authenticate
   * @throws ApiException If the settings can't be applied
   */
  void applyToParams(
      List<Pair> queryParams,
      Map<String, String> headerParams,
      Map<String, String> cookieParams,
      String payload,
      String method,
      URI uri)
      throws ApiException;
}
