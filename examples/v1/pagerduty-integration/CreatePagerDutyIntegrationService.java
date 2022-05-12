// Create a new service object returns "OK" response

import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.PagerDutyIntegrationApi;
import com.datadog.api.v1.client.model.PagerDutyService;
import com.datadog.api.v1.client.model.PagerDutyServiceName;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    PagerDutyIntegrationApi apiInstance = new PagerDutyIntegrationApi(defaultClient);

    PagerDutyService body = new PagerDutyService().serviceKey("").serviceName("");

    try {
      PagerDutyServiceName result = apiInstance.createPagerDutyIntegrationService(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling PagerDutyIntegrationApi#createPagerDutyIntegrationService");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
