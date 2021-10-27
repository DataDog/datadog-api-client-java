package com.test;

import com.datadog.api.v1.client.*;
import com.datadog.api.v1.client.api.*;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.model.*;
import java.util.*;
import org.openapitools.jackson.nullable.JsonNullable;

public class App {
  public static int downtimes(ApiClient c) {
    // turn on debugging
    c.setDebugging(true);
    // get DowntimesAPI instance
    DowntimesApi apiInstance = new DowntimesApi(c);

    // create a new downtime
    Downtime d = new Downtime();
    d.setScope(Arrays.asList("foo:bar"));
    // for nullable fields, it's possible to set explicit null like this
    d.setEnd(null);

    Downtime created = null;
    try {
      created = apiInstance.createDowntime(d);
    } catch (ApiException e) {
      System.err.println("Exception when creating a downtime");
      e.printStackTrace();
      return 1;
    }
    System.out.println("Created downtime:");
    System.out.println(created);

    // modify the downtime
    created.setMessage("changed message");
    // for nullable fields, it's possible to unset explicit null like this
    created.setEnd_JsonNullable(JsonNullable.<Long>undefined());

    Downtime modified = null;
    try {
      modified = apiInstance.updateDowntime(created.getId(), created);
    } catch (ApiException e) {
      System.err.println("Exception when updating a downtime");
      e.printStackTrace();
      return 1;
    }
    System.out.println("Modified downtime:");
    System.out.println(modified);

    // cancel the downtime
    CancelDowntimesByScopeRequest req = new CancelDowntimesByScopeRequest();
    req.setScope("foo:bar");
    CanceledDowntimesIds cids = null;
    try {
      cids = apiInstance.cancelDowntimesByScope(req);
    } catch (ApiException e) {
      System.err.println("Exception when cancelling a downtime");
      e.printStackTrace();
      return 1;
    }
    System.out.println("Canceled downtime ids:");
    System.out.println(cids);
    return 0;
  }

  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();

    // Configure API key authorization: apiKeyAuth
    String apiKey = System.getenv("DATADOG_API_KEY");
    if (apiKey == null) {
      System.err.println("DATADOG_API_KEY not set, exiting");
      System.exit(1);
    }
    ApiKeyAuth apiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyAuth");
    apiKeyAuth.setApiKey(apiKey);

    // Configure API key authorization: appKeyAuth
    String appKey = System.getenv("DATADOG_APP_KEY");
    if (appKey == null) {
      System.err.println("DATADOG_APP_KEY not set, exiting");
      System.exit(1);
    }
    ApiKeyAuth appKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("appKeyAuth");
    appKeyAuth.setApiKey(appKey);

    // an example method that manipulates downtimes
    System.exit(downtimes(defaultClient));
  }
}
