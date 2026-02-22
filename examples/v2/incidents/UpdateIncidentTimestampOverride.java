// Update a timestamp override for an incident returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.IncidentsApi;
import com.datadog.api.client.v2.model.IncidentTimestampOverridePatchAttributes;
import com.datadog.api.client.v2.model.IncidentTimestampOverridePatchData;
import com.datadog.api.client.v2.model.IncidentTimestampOverridePatchRequest;
import com.datadog.api.client.v2.model.IncidentTimestampOverrideResponse;
import com.datadog.api.client.v2.model.IncidentsTimestampOverridesType;
import java.time.OffsetDateTime;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.updateIncidentTimestampOverride", true);
    IncidentsApi apiInstance = new IncidentsApi(defaultClient);

    IncidentTimestampOverridePatchRequest body =
        new IncidentTimestampOverridePatchRequest()
            .data(
                new IncidentTimestampOverridePatchData()
                    .attributes(
                        new IncidentTimestampOverridePatchAttributes()
                            .timestampValue(OffsetDateTime.parse("2024-12-29T11:00:00Z")))
                    .type(IncidentsTimestampOverridesType.INCIDENTS_TIMESTAMP_OVERRIDES));

    try {
      IncidentTimestampOverrideResponse result =
          apiInstance.updateIncidentTimestampOverride(
              UUID.fromString("9cecfde8-e35d-4387-8985-9b30dcb9cb1c"),
              UUID.fromString("6f48a86f-9a39-4bcf-a76b-9a1b20188995"),
              body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentsApi#updateIncidentTimestampOverride");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
