/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v2.client;

import java.util.HashMap;

@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class Configuration {
  private static ApiClient defaultApiClient;

  /**
   * Get the default API client, which would be used when creating API instances without providing
   * an API client.
   *
   * @return Default API client
   */
  public static ApiClient getDefaultApiClient() {
    if (defaultApiClient != null) {
      return defaultApiClient;
    }
    defaultApiClient = new ApiClient();

    // Configure the Datadog site to send API calls to
    String site = System.getenv("DD_SITE");
    if (site != null) {
      HashMap<String, String> serverVariables = new HashMap<String, String>();
      serverVariables.put("site", site);
      defaultApiClient.setServerVariables(serverVariables);
    }
    // Configure API key authorization
    HashMap<String, String> secrets = new HashMap<String, String>();
    String apiKeyAuth = System.getenv("DD_API_KEY");
    if (apiKeyAuth != null) {
      secrets.put("apiKeyAuth", apiKeyAuth);
    }
    String appKeyAuth = System.getenv("DD_APP_KEY");
    if (appKeyAuth != null) {
      secrets.put("appKeyAuth", appKeyAuth);
    }
    defaultApiClient.configureApiKeys(secrets);

    return defaultApiClient;
  }

  /**
   * Set the default API client, which would be used when creating API instances without providing
   * an API client.
   *
   * @param apiClient API client
   */
  public static void setDefaultApiClient(ApiClient apiClient) {
    defaultApiClient = apiClient;
  }
}
