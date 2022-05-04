// Delete a single service object returns "OK" response

import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.PagerDutyIntegrationApi;
import java.time.*;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    PagerDutyIntegrationApi apiInstance = new PagerDutyIntegrationApi(defaultClient);

    try {
      apiInstance.deletePagerDutyIntegrationService("service_name");
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling PagerDutyIntegrationApi#deletePagerDutyIntegrationService");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
