import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.PagerDutyIntegrationApi;
import com.datadog.api.v1.client.model.*;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();

    PagerDutyIntegrationApi apiInstance = new PagerDutyIntegrationApi(defaultClient);
    String serviceName = "serviceName_example"; // String | The service name
    PagerDutyServiceKey body =
        new PagerDutyServiceKey(); // PagerDutyServiceKey | Update an existing service object
    // request body.
    try {
      apiInstance.updatePagerDutyIntegrationService(serviceName, body);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling PagerDutyIntegrationApi#updatePagerDutyIntegrationService");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
