// Update an existing incident service returns "OK" response

import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.api.IncidentServicesApi;
import com.datadog.api.v2.client.model.IncidentServiceResponse;
import com.datadog.api.v2.client.model.IncidentServiceType;
import com.datadog.api.v2.client.model.IncidentServiceUpdateAttributes;
import com.datadog.api.v2.client.model.IncidentServiceUpdateData;
import com.datadog.api.v2.client.model.IncidentServiceUpdateRequest;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("updateIncidentService", true);
    IncidentServicesApi apiInstance = new IncidentServicesApi(defaultClient);

    // there is a valid "service" in the system
    String SERVICE_DATA_ATTRIBUTES_NAME = System.getenv("SERVICE_DATA_ATTRIBUTES_NAME");
    String SERVICE_DATA_ID = System.getenv("SERVICE_DATA_ID");

    IncidentServiceUpdateRequest body =
        new IncidentServiceUpdateRequest()
            .data(
                new IncidentServiceUpdateData()
                    .type(IncidentServiceType.SERVICES)
                    .attributes(
                        new IncidentServiceUpdateAttributes().name("service name-updated")));

    try {
      IncidentServiceResponse result = apiInstance.updateIncidentService(SERVICE_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentServicesApi#updateIncidentService");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
