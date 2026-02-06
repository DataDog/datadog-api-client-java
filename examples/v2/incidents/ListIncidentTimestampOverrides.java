// List timestamp overrides for an incident returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.IncidentsApi;
import com.datadog.api.client.v2.model.IncidentTimestampOverridesResponse;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.listIncidentTimestampOverrides", true);
    IncidentsApi apiInstance = new IncidentsApi(defaultClient);

    try {
      IncidentTimestampOverridesResponse result =
          apiInstance.listIncidentTimestampOverrides(
              UUID.fromString("9cecfde8-e35d-4387-8985-9b30dcb9cb1c"));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentsApi#listIncidentTimestampOverrides");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
