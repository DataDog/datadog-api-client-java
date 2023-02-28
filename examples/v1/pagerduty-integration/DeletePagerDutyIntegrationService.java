// Delete a single service object returns "No Content" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v1.api.PagerDutyIntegrationApi;
import java.io.File;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    PagerDutyIntegrationApi apiInstance = new PagerDutyIntegrationApi(defaultClient);

    try {
      apiInstance.deletePagerDutyIntegrationService("service_name");
    } catch (ApiException e) {
      System.err.println("Exception when calling PagerDutyIntegrationApi#deletePagerDutyIntegrationService");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}