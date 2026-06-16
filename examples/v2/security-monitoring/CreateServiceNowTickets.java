// Create ServiceNow tickets for security findings returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.CaseManagementProject;
import com.datadog.api.client.v2.model.CaseManagementProjectData;
import com.datadog.api.client.v2.model.CaseManagementProjectDataType;
import com.datadog.api.client.v2.model.CasePriority;
import com.datadog.api.client.v2.model.CreateServiceNowTicketRequestArray;
import com.datadog.api.client.v2.model.CreateServiceNowTicketRequestData;
import com.datadog.api.client.v2.model.CreateServiceNowTicketRequestDataAttributes;
import com.datadog.api.client.v2.model.CreateServiceNowTicketRequestDataRelationships;
import com.datadog.api.client.v2.model.FindingCaseResponseArray;
import com.datadog.api.client.v2.model.FindingData;
import com.datadog.api.client.v2.model.FindingDataType;
import com.datadog.api.client.v2.model.Findings;
import com.datadog.api.client.v2.model.ServiceNowTicketsDataType;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createServiceNowTickets", true);
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    CreateServiceNowTicketRequestArray body =
        new CreateServiceNowTicketRequestArray()
            .data(
                Collections.singletonList(
                    new CreateServiceNowTicketRequestData()
                        .attributes(
                            new CreateServiceNowTicketRequestDataAttributes()
                                .assigneeId("f315bdaf-9ee7-4808-a9c1-99c15bf0f4d0")
                                .description("A description of the ServiceNow ticket.")
                                .priority(CasePriority.NOT_DEFINED)
                                .title("A title for the ServiceNow ticket."))
                        .relationships(
                            new CreateServiceNowTicketRequestDataRelationships()
                                .findings(
                                    new Findings()
                                        .data(
                                            Collections.singletonList(
                                                new FindingData()
                                                    .id(
                                                        "ZGVmLTAwcC1pZXJ-aS0wZjhjNjMyZDNmMzRlZTgzNw==")
                                                    .type(FindingDataType.FINDINGS))))
                                .project(
                                    new CaseManagementProject()
                                        .data(
                                            new CaseManagementProjectData()
                                                .id("aeadc05e-98a8-11ec-ac2c-da7ad0900001")
                                                .type(CaseManagementProjectDataType.PROJECTS))))
                        .type(ServiceNowTicketsDataType.SERVICENOW_TICKETS)));

    try {
      FindingCaseResponseArray result = apiInstance.createServiceNowTickets(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityMonitoringApi#createServiceNowTickets");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
