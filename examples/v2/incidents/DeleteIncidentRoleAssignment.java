// Delete an incident role assignment returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.IncidentsApi;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.deleteIncidentRoleAssignment", true);
    IncidentsApi apiInstance = new IncidentsApi(defaultClient);

    try {
      apiInstance.deleteIncidentRoleAssignment(
          UUID.fromString("00000000-0000-0000-0000-000000000000"));
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentsApi#deleteIncidentRoleAssignment");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
