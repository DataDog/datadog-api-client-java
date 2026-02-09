// Create ServiceNow ticket for case returns "Accepted" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CaseManagementApi;
import com.datadog.api.client.v2.model.ServiceNowTicketCreateAttributes;
import com.datadog.api.client.v2.model.ServiceNowTicketCreateData;
import com.datadog.api.client.v2.model.ServiceNowTicketCreateRequest;
import com.datadog.api.client.v2.model.ServiceNowTicketResourceType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createCaseServiceNowTicket", true);
    CaseManagementApi apiInstance = new CaseManagementApi(defaultClient);

    ServiceNowTicketCreateRequest body =
        new ServiceNowTicketCreateRequest()
            .data(
                new ServiceNowTicketCreateData()
                    .attributes(
                        new ServiceNowTicketCreateAttributes()
                            .assignmentGroup("IT Support")
                            .instanceName("my-instance"))
                    .type(ServiceNowTicketResourceType.TICKETS));

    try {
      apiInstance.createCaseServiceNowTicket("f98a5a5b-e0ff-45d4-b2f5-afe6e74de504", body);
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseManagementApi#createCaseServiceNowTicket");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
