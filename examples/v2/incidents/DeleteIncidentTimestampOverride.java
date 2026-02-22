// Delete a timestamp override for an incident returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.IncidentsApi;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.deleteIncidentTimestampOverride", true);
    IncidentsApi apiInstance = new IncidentsApi(defaultClient);

    try {
      apiInstance.deleteIncidentTimestampOverride(
          UUID.fromString("9cecfde8-e35d-4387-8985-9b30dcb9cb1c"),
          UUID.fromString("6f48a86f-9a39-4bcf-a76b-9a1b20188995"));
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentsApi#deleteIncidentTimestampOverride");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
