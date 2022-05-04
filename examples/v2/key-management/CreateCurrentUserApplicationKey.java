// Create an application key for current user returns "Created" response

import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.api.KeyManagementApi;
import com.datadog.api.v2.client.model.ApplicationKeyCreateAttributes;
import com.datadog.api.v2.client.model.ApplicationKeyCreateData;
import com.datadog.api.v2.client.model.ApplicationKeyCreateRequest;
import com.datadog.api.v2.client.model.ApplicationKeyResponse;
import com.datadog.api.v2.client.model.ApplicationKeysType;
import java.time.*;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    KeyManagementApi apiInstance = new KeyManagementApi(defaultClient);

    ApplicationKeyCreateRequest body =
        new ApplicationKeyCreateRequest()
            .data(
                new ApplicationKeyCreateData()
                    .attributes(
                        new ApplicationKeyCreateAttributes()
                            .name("Application Key for managing dashboards")
                            .scopes(
                                Arrays.asList(
                                    "dashboards_read",
                                    "dashboards_write",
                                    "dashboards_public_share")))
                    .type(ApplicationKeysType.APPLICATION_KEYS));

    try {
      ApplicationKeyResponse result = apiInstance.createCurrentUserApplicationKey(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KeyManagementApi#createCurrentUserApplicationKey");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
