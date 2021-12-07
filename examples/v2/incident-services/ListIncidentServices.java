// Get a list of all incident services returns "OK" response

import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.api.IncidentServicesApi;
import com.datadog.api.v2.client.api.IncidentServicesApi.ListIncidentServicesOptionalParameters;
import com.datadog.api.v2.client.model.IncidentServicesResponse;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("listIncidentServices", true);
    IncidentServicesApi apiInstance = new IncidentServicesApi(defaultClient);

    // there is a valid "service" in the system
    String SERVICE_DATA_ATTRIBUTES_NAME = System.getenv("SERVICE_DATA_ATTRIBUTES_NAME");

    try {
      IncidentServicesResponse result =
          apiInstance.listIncidentServices(
              new ListIncidentServicesOptionalParameters().filter(SERVICE_DATA_ATTRIBUTES_NAME));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DowntimesApi#updateDowntime");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
