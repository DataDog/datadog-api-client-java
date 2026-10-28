// List incident responders includes users and role assignments

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.IncidentsApi;
import com.datadog.api.client.v2.api.IncidentsApi.ListIncidentRespondersOptionalParameters;
import com.datadog.api.client.v2.model.IncidentResponderRelatedObject;
import com.datadog.api.client.v2.model.IncidentRespondersResponse;
import java.util.Arrays;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.createIncident", true);
    defaultClient.setUnstableOperationEnabled("v2.listIncidentResponders", true);
    IncidentsApi apiInstance = new IncidentsApi(defaultClient);

    // there is a valid "incident_with_commander" in the system
    String INCIDENT_WITH_COMMANDER_DATA_ID = System.getenv("INCIDENT_WITH_COMMANDER_DATA_ID");

    try {
      IncidentRespondersResponse result =
          apiInstance.listIncidentResponders(
              INCIDENT_WITH_COMMANDER_DATA_ID,
              new ListIncidentRespondersOptionalParameters()
                  .include(
                      Arrays.asList(
                          IncidentResponderRelatedObject.USERS,
                          IncidentResponderRelatedObject.ROLE_ASSIGNMENTS)));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentsApi#listIncidentResponders");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
