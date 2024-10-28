// Create an incident type returns "CREATED" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.IncidentsApi;
import com.datadog.api.client.v2.model.IncidentTypeAttributes;
import com.datadog.api.client.v2.model.IncidentTypeCreateData;
import com.datadog.api.client.v2.model.IncidentTypeCreateRequest;
import com.datadog.api.client.v2.model.IncidentTypeResponse;
import com.datadog.api.client.v2.model.IncidentTypeType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createIncidentType", true);
    IncidentsApi apiInstance = new IncidentsApi(defaultClient);

    IncidentTypeCreateRequest body =
        new IncidentTypeCreateRequest()
            .data(
                new IncidentTypeCreateData()
                    .attributes(
                        new IncidentTypeAttributes()
                            .description("8d4bbb66dccf2456")
                            .isDefault(true)
                            .name("8d4bbb66dccf2456"))
                    .type(IncidentTypeType.INCIDENT_TYPES));

    try {
      IncidentTypeResponse result = apiInstance.createIncidentType(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentsApi#createIncidentType");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
