// Update an incident type returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.IncidentsApi;
import com.datadog.api.client.v2.model.IncidentTypePatchData;
import com.datadog.api.client.v2.model.IncidentTypePatchRequest;
import com.datadog.api.client.v2.model.IncidentTypeResponse;
import com.datadog.api.client.v2.model.IncidentTypeType;
import com.datadog.api.client.v2.model.IncidentTypeUpdateAttributes;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.updateIncidentType", true);
    IncidentsApi apiInstance = new IncidentsApi(defaultClient);

    IncidentTypePatchRequest body =
        new IncidentTypePatchRequest()
            .data(
                new IncidentTypePatchData()
                    .attributes(
                        new IncidentTypeUpdateAttributes()
                            .description(
                                "Any incidents that harm (or have the potential to) the"
                                    + " confidentiality, integrity, or availability of our data."
                                    + " Note: This will notify the security team.")
                            .isDefault(true)
                            .name("Security Incident"))
                    .type(IncidentTypeType.INCIDENT_TYPES));

    try {
      IncidentTypeResponse result = apiInstance.updateIncidentType("incident_type_id", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentsApi#updateIncidentType");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
