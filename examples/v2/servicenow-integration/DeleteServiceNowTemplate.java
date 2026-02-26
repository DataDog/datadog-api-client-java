// Delete ServiceNow template returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.ServiceNowIntegrationApi;
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
    defaultClient.setUnstableOperationEnabled("v2.deleteServiceNowTemplate", true);
    ServiceNowIntegrationApi apiInstance = new ServiceNowIntegrationApi(defaultClient);

    try {
      apiInstance.deleteServiceNowTemplate(UUID.fromString("65b3341b-0680-47f9-a6d4-134db45c603e"));
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceNowIntegrationApi#deleteServiceNowTemplate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}