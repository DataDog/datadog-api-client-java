// Export incidents returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.IncidentsApi;
import com.datadog.api.client.v2.model.IncidentSearchIncidentsExportRequest;
import java.io.File;
import java.util.Arrays;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.exportIncidents", true);
    IncidentsApi apiInstance = new IncidentsApi(defaultClient);

    IncidentSearchIncidentsExportRequest body =
        new IncidentSearchIncidentsExportRequest()
            .fields(Arrays.asList("title", "severity", "state"))
            .query("state:active");

    try {
      File result = apiInstance.exportIncidents(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentsApi#exportIncidents");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
