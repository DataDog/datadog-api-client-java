// Import an incident returns "CREATED" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.IncidentsApi;
import com.datadog.api.client.v2.model.IncidentImportFieldAttributes;
import com.datadog.api.client.v2.model.IncidentImportFieldAttributesSingleValue;
import com.datadog.api.client.v2.model.IncidentImportRequest;
import com.datadog.api.client.v2.model.IncidentImportRequestAttributes;
import com.datadog.api.client.v2.model.IncidentImportRequestData;
import com.datadog.api.client.v2.model.IncidentImportResponse;
import com.datadog.api.client.v2.model.IncidentImportVisibility;
import com.datadog.api.client.v2.model.IncidentType;
import java.time.OffsetDateTime;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.importIncident", true);
    IncidentsApi apiInstance = new IncidentsApi(defaultClient);

    IncidentImportRequest body =
        new IncidentImportRequest()
            .data(
                new IncidentImportRequestData()
                    .type(IncidentType.INCIDENTS)
                    .attributes(
                        new IncidentImportRequestAttributes()
                            .declared(OffsetDateTime.parse("2025-01-01T00:00:00Z"))
                            .detected(OffsetDateTime.parse("2025-01-01T00:00:00Z"))
                            .fields(
                                Map.ofEntries(
                                    Map.entry(
                                        "severity",
                                        new IncidentImportFieldAttributes(
                                            new IncidentImportFieldAttributesSingleValue()
                                                .value("SEV-5"))),
                                    Map.entry(
                                        "state",
                                        new IncidentImportFieldAttributes(
                                            new IncidentImportFieldAttributesSingleValue()
                                                .value("active")))))
                            .title("Example-Incident")
                            .visibility(IncidentImportVisibility.ORGANIZATION)));

    try {
      IncidentImportResponse result = apiInstance.importIncident(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentsApi#importIncident");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
