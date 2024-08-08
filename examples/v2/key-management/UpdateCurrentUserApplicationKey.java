// Edit an application key owned by current user returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.KeyManagementApi;
import com.datadog.api.client.v2.model.ApplicationKeyResponse;
import com.datadog.api.client.v2.model.ApplicationKeysType;
import com.datadog.api.client.v2.model.ApplicationKeyUpdateAttributes;
import com.datadog.api.client.v2.model.ApplicationKeyUpdateData;
import com.datadog.api.client.v2.model.ApplicationKeyUpdateRequest;
import java.io.File;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    KeyManagementApi apiInstance = new KeyManagementApi(defaultClient);

    // there is a valid "application_key" in the system
    String APPLICATION_KEY_DATA_ATTRIBUTES_NAME = System.getenv("APPLICATION_KEY_DATA_ATTRIBUTES_NAME");
    String APPLICATION_KEY_DATA_ID = System.getenv("APPLICATION_KEY_DATA_ID");

    ApplicationKeyUpdateRequest body = new ApplicationKeyUpdateRequest()
.data(new ApplicationKeyUpdateData()
.id(APPLICATION_KEY_DATA_ID)
.type(ApplicationKeysType.APPLICATION_KEYS)
.attributes(new ApplicationKeyUpdateAttributes()
.name("Application Key for managing dashboards-updated")));

    try {
      ApplicationKeyResponse result = apiInstance.updateCurrentUserApplicationKey(APPLICATION_KEY_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KeyManagementApi#updateCurrentUserApplicationKey");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}