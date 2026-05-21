// Create an incident Jira issue returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.IncidentsApi;
import com.datadog.api.client.v2.model.IncidentJiraIssueDataAttributesRequest;
import com.datadog.api.client.v2.model.IncidentJiraIssueDataRequest;
import com.datadog.api.client.v2.model.IncidentJiraIssueIntegrationResponse;
import com.datadog.api.client.v2.model.IncidentJiraIssueRequest;
import com.datadog.api.client.v2.model.IncidentJiraIssueType;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createIncidentJiraIssue", true);
    IncidentsApi apiInstance = new IncidentsApi(defaultClient);

    IncidentJiraIssueRequest body =
        new IncidentJiraIssueRequest()
            .data(
                new IncidentJiraIssueDataRequest()
                    .attributes(
                        new IncidentJiraIssueDataAttributesRequest()
                            .accountId("123456")
                            .issueTypeId("10001")
                            .projectId("10000")
                            .templateId(UUID.fromString("00000000-0000-0000-0000-000000000000")))
                    .type(IncidentJiraIssueType.INCIDENT_JIRA_ISSUES));

    try {
      IncidentJiraIssueIntegrationResponse result =
          apiInstance.createIncidentJiraIssue("incident_id", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentsApi#createIncidentJiraIssue");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
