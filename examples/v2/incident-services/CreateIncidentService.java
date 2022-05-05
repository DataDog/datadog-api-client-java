// Create a new incident service returns "CREATED" response

import com.datadog.api.client.ApiException;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.api.IncidentServicesApi;
import com.datadog.api.v2.client.model.IncidentServiceCreateAttributes;
import com.datadog.api.v2.client.model.IncidentServiceCreateData;
import com.datadog.api.v2.client.model.IncidentServiceCreateRequest;
import com.datadog.api.v2.client.model.IncidentServiceResponse;
import com.datadog.api.v2.client.model.IncidentServiceType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("createIncidentService", true);
    IncidentServicesApi apiInstance = new IncidentServicesApi(defaultClient);

    IncidentServiceCreateRequest body =
        new IncidentServiceCreateRequest()
            .data(
                new IncidentServiceCreateData()
                    .type(IncidentServiceType.SERVICES)
                    .attributes(
                        new IncidentServiceCreateAttributes()
                            .name(
                                "Example-Create_a_new_incident_service_returns_CREATED_response")));

    try {
      IncidentServiceResponse result = apiInstance.createIncidentService(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentServicesApi#createIncidentService");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
