// Create a timestamp override for an incident returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.IncidentsApi;
import com.datadog.api.client.v2.model.IncidentTimestampOverrideCreateAttributes;
import com.datadog.api.client.v2.model.IncidentTimestampOverrideCreateData;
import com.datadog.api.client.v2.model.IncidentTimestampOverrideCreateRequest;
import com.datadog.api.client.v2.model.IncidentTimestampOverrideResponse;
import com.datadog.api.client.v2.model.IncidentsTimestampOverridesType;
import com.datadog.api.client.v2.model.TimestampType;
import java.time.OffsetDateTime;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createIncidentTimestampOverride", true);
    IncidentsApi apiInstance = new IncidentsApi(defaultClient);

    IncidentTimestampOverrideCreateRequest body =
        new IncidentTimestampOverrideCreateRequest()
            .data(
                new IncidentTimestampOverrideCreateData()
                    .attributes(
                        new IncidentTimestampOverrideCreateAttributes()
                            .timestampType(TimestampType.CREATED)
                            .timestampValue(OffsetDateTime.parse("2024-12-29T10:00:00Z")))
                    .type(IncidentsTimestampOverridesType.INCIDENTS_TIMESTAMP_OVERRIDES));

    try {
      IncidentTimestampOverrideResponse result =
          apiInstance.createIncidentTimestampOverride(
              UUID.fromString("9cecfde8-e35d-4387-8985-9b30dcb9cb1c"), body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentsApi#createIncidentTimestampOverride");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
