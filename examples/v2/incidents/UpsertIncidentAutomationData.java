// Create or update incident automation data returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.IncidentsApi;
import com.datadog.api.client.v2.model.IncidentAutomationDataAttributesRequest;
import com.datadog.api.client.v2.model.IncidentAutomationDataDataRequest;
import com.datadog.api.client.v2.model.IncidentAutomationDataRequest;
import com.datadog.api.client.v2.model.IncidentAutomationDataResponse;
import com.datadog.api.client.v2.model.IncidentAutomationDataType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.upsertIncidentAutomationData", true);
    IncidentsApi apiInstance = new IncidentsApi(defaultClient);

    IncidentAutomationDataRequest body =
        new IncidentAutomationDataRequest()
            .data(
                new IncidentAutomationDataDataRequest()
                    .attributes(new IncidentAutomationDataAttributesRequest().value("completed"))
                    .type(IncidentAutomationDataType.INCIDENTS_AUTOMATION_DATA));

    try {
      IncidentAutomationDataResponse result =
          apiInstance.upsertIncidentAutomationData("incident_id", "workflow_status", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentsApi#upsertIncidentAutomationData");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
