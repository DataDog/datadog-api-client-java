// Update an incident timeline entry returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.IncidentsApi;
import com.datadog.api.client.v2.model.IncidentTimelineCellType;
import com.datadog.api.client.v2.model.IncidentTimelineEntryContent;
import com.datadog.api.client.v2.model.IncidentTimelineEntryDataAttributesRequest;
import com.datadog.api.client.v2.model.IncidentTimelineEntryDataRequest;
import com.datadog.api.client.v2.model.IncidentTimelineEntryRequest;
import com.datadog.api.client.v2.model.IncidentTimelineEntryResponse;
import com.datadog.api.client.v2.model.IncidentTimelineEntryType;
import java.time.OffsetDateTime;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.updateIncidentTimelineEntry", true);
    IncidentsApi apiInstance = new IncidentsApi(defaultClient);

    IncidentTimelineEntryRequest body =
        new IncidentTimelineEntryRequest()
            .data(
                new IncidentTimelineEntryDataRequest()
                    .attributes(
                        new IncidentTimelineEntryDataAttributesRequest()
                            .cellType(IncidentTimelineCellType.MARKDOWN)
                            .content(
                                new IncidentTimelineEntryContent()
                                    .message("Investigating the issue."))
                            .displayTime(OffsetDateTime.parse("2024-01-01T00:00:00.000Z"))
                            .important(false))
                    .type(IncidentTimelineEntryType.INCIDENT_TIMELINE_CELLS));

    try {
      IncidentTimelineEntryResponse result =
          apiInstance.updateIncidentTimelineEntry(
              "incident_id", UUID.fromString("00000000-0000-0000-0000-000000000000"), body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentsApi#updateIncidentTimelineEntry");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
