// Delete incident attachment returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.IncidentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.deleteIncidentAttachment", true);
    IncidentsApi apiInstance = new IncidentsApi(defaultClient);

    try {
      apiInstance.deleteIncidentAttachment("incident_id", "00000000-0000-0000-0000-000000000002");
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentsApi#deleteIncidentAttachment");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
