// Attach security findings to a ServiceNow ticket returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.AttachServiceNowTicketRequest;
import com.datadog.api.client.v2.model.AttachServiceNowTicketRequestData;
import com.datadog.api.client.v2.model.AttachServiceNowTicketRequestDataAttributes;
import com.datadog.api.client.v2.model.AttachServiceNowTicketRequestDataRelationships;
import com.datadog.api.client.v2.model.CaseManagementProject;
import com.datadog.api.client.v2.model.CaseManagementProjectData;
import com.datadog.api.client.v2.model.CaseManagementProjectDataType;
import com.datadog.api.client.v2.model.FindingCaseResponse;
import com.datadog.api.client.v2.model.FindingData;
import com.datadog.api.client.v2.model.FindingDataType;
import com.datadog.api.client.v2.model.Findings;
import com.datadog.api.client.v2.model.ServiceNowTicketsDataType;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    AttachServiceNowTicketRequest body =
        new AttachServiceNowTicketRequest()
            .data(
                new AttachServiceNowTicketRequestData()
                    .attributes(
                        new AttachServiceNowTicketRequestDataAttributes()
                            .servicenowTicketUrl(
                                "https://example.service-now.com/now/nav/ui/classic/params/target/incident.do?sys_id=abcdef0123456789abcdef0123456789"))
                    .relationships(
                        new AttachServiceNowTicketRequestDataRelationships()
                            .findings(
                                new Findings()
                                    .data(
                                        Collections.singletonList(
                                            new FindingData()
                                                .id("ZGVmLTAwcC1pZXJ-aS0wZjhjNjMyZDNmMzRlZTgzNw==")
                                                .type(FindingDataType.FINDINGS))))
                            .project(
                                new CaseManagementProject()
                                    .data(
                                        new CaseManagementProjectData()
                                            .id("aeadc05e-98a8-11ec-ac2c-da7ad0900001")
                                            .type(CaseManagementProjectDataType.PROJECTS))))
                    .type(ServiceNowTicketsDataType.SERVICENOW_TICKETS));

    try {
      FindingCaseResponse result = apiInstance.attachServiceNowTicket(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityMonitoringApi#attachServiceNowTicket");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
