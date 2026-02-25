// Create Jira issue for security finding returns "Created" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.FindingCaseResponseArray;
import com.datadog.api.client.v2.model.CaseManagementProject;
import com.datadog.api.client.v2.model.CaseManagementProjectData;
import com.datadog.api.client.v2.model.CaseManagementProjectDataType;
import com.datadog.api.client.v2.model.CreateJiraIssueRequestArray;
import com.datadog.api.client.v2.model.CreateJiraIssueRequestData;
import com.datadog.api.client.v2.model.CreateJiraIssueRequestDataAttributes;
import com.datadog.api.client.v2.model.CreateJiraIssueRequestDataRelationships;
import com.datadog.api.client.v2.model.FindingData;
import com.datadog.api.client.v2.model.FindingDataType;
import com.datadog.api.client.v2.model.Findings;
import com.datadog.api.client.v2.model.JiraIssuesDataType;
import java.io.File;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    CreateJiraIssueRequestArray body = new CreateJiraIssueRequestArray()
.data(Collections.singletonList(new CreateJiraIssueRequestData()
.attributes(new CreateJiraIssueRequestDataAttributes()
.title("A title")
.description("A description"))
.relationships(new CreateJiraIssueRequestDataRelationships()
.findings(new Findings()
.data(Collections.singletonList(new FindingData()
.id("YmNlZmJhYTcyMDU5ZDk0ZDhiNjRmNGI0NDk4MDdiNzN-MDJlMjg0NzNmYzJiODY2MzJkNjU0OTI4NmVhZTUyY2U=")
.type(FindingDataType.FINDINGS))))
.project(new CaseManagementProject()
.data(new CaseManagementProjectData()
.id("959a6f71-bac8-4027-b1d3-2264f569296f")
.type(CaseManagementProjectDataType.PROJECTS))))
.type(JiraIssuesDataType.JIRA_ISSUES)));

    try {
      FindingCaseResponseArray result = apiInstance.createJiraIssues(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityMonitoringApi#createJiraIssues");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}