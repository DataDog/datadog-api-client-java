// Create a page from an incident returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.IncidentsApi;
import com.datadog.api.client.v2.model.IncidentCreatePageAttributes;
import com.datadog.api.client.v2.model.IncidentCreatePageFromIncidentData;
import com.datadog.api.client.v2.model.IncidentCreatePageFromIncidentRequest;
import com.datadog.api.client.v2.model.IncidentCreatePageResponse;
import com.datadog.api.client.v2.model.IncidentPageTarget;
import com.datadog.api.client.v2.model.IncidentPageTargetType;
import com.datadog.api.client.v2.model.IncidentPageType;
import java.util.Arrays;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createPageFromIncident", true);
    IncidentsApi apiInstance = new IncidentsApi(defaultClient);

    IncidentCreatePageFromIncidentRequest body =
        new IncidentCreatePageFromIncidentRequest()
            .data(
                new IncidentCreatePageFromIncidentData()
                    .attributes(
                        new IncidentCreatePageAttributes()
                            .description("Page created for incident response")
                            .services(Arrays.asList("web-service", "api-service"))
                            .tags(Arrays.asList("urgent", "production"))
                            .target(
                                new IncidentPageTarget()
                                    .identifier("team-handle")
                                    .type(IncidentPageTargetType.TEAM_HANDLE))
                            .title("Incident Response Page"))
                    .type(IncidentPageType.PAGE));

    try {
      IncidentCreatePageResponse result = apiInstance.createPageFromIncident("incident_id", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentsApi#createPageFromIncident");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
