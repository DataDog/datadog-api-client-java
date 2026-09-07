/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.auth;

import com.datadog.api.client.ApiException;
import com.datadog.api.client.Pair;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class HttpBasicAuth implements Authentication {
  private String username;
  private String password;

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public void applyToParams(
      List<Pair> queryParams,
      Map<String, String> headerParams,
      Map<String, String> cookieParams,
      String payload,
      String method,
      URI uri)
      throws ApiException {
    if (username == null && password == null) {
      return;
    }
    String str = (username == null ? "" : username) + ":" + (password == null ? "" : password);
    headerParams.put(
        "Authorization",
        "Basic " + Base64.getEncoder().encodeToString(str.getBytes(StandardCharsets.UTF_8)));
  }
}
