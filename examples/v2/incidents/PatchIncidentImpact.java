// Patch an incident impact returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.IncidentsApi;
import com.datadog.api.client.v2.model.IncidentImpactCreateAttributes;
import com.datadog.api.client.v2.model.IncidentImpactCreateData;
import com.datadog.api.client.v2.model.IncidentImpactCreateRequest;
import com.datadog.api.client.v2.model.IncidentImpactResponse;
import com.datadog.api.client.v2.model.IncidentImpactType;
import java.time.OffsetDateTime;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.patchIncidentImpact", true);
    IncidentsApi apiInstance = new IncidentsApi(defaultClient);

    IncidentImpactCreateRequest body =
        new IncidentImpactCreateRequest()
            .data(
                new IncidentImpactCreateData()
                    .attributes(
                        new IncidentImpactCreateAttributes()
                            .description("Service was unavailable for external users")
                            .endAt(OffsetDateTime.parse("2025-08-29T13:17:00Z"))
                            .fields(
                                Map.ofEntries(
                                    Map.entry("customers_impacted", "all"),
                                    Map.entry("products_impacted", "['shopping', 'marketing']")))
                            .startAt(OffsetDateTime.parse("2025-08-28T13:17:00Z")))
                    .type(IncidentImpactType.INCIDENT_IMPACTS));

    try {
      IncidentImpactResponse result =
          apiInstance.patchIncidentImpact("incident_id", "impact_id", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentsApi#patchIncidentImpact");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
