// Get a list of all incident services returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.IncidentServicesApi;
import com.datadog.api.client.v2.api.IncidentServicesApi.ListIncidentServicesOptionalParameters;
import com.datadog.api.client.v2.model.IncidentServicesResponse;
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
    defaultClient.setUnstableOperationEnabled("v2.listIncidentServices", true);
    IncidentServicesApi apiInstance = new IncidentServicesApi(defaultClient);

    // there is a valid "service" in the system
    String SERVICE_DATA_ATTRIBUTES_NAME = System.getenv("SERVICE_DATA_ATTRIBUTES_NAME");

    try {
      IncidentServicesResponse result = apiInstance.listIncidentServices(new ListIncidentServicesOptionalParameters().filter(SERVICE_DATA_ATTRIBUTES_NAME));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentServicesApi#listIncidentServices");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}