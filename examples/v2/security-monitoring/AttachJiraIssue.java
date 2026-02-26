// Attach security findings to a Jira issue returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.FindingCaseResponse;
import com.datadog.api.client.v2.model.AttachJiraIssueRequest;
import com.datadog.api.client.v2.model.AttachJiraIssueRequestData;
import com.datadog.api.client.v2.model.AttachJiraIssueRequestDataAttributes;
import com.datadog.api.client.v2.model.AttachJiraIssueRequestDataRelationships;
import com.datadog.api.client.v2.model.CaseManagementProject;
import com.datadog.api.client.v2.model.CaseManagementProjectData;
import com.datadog.api.client.v2.model.CaseManagementProjectDataType;
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

    AttachJiraIssueRequest body = new AttachJiraIssueRequest()
.data(new AttachJiraIssueRequestData()
.attributes(new AttachJiraIssueRequestDataAttributes()
.jiraIssueUrl("https://datadoghq-sandbox-538.atlassian.net/browse/CSMSEC-105476"))
.relationships(new AttachJiraIssueRequestDataRelationships()
.findings(new Findings()
.data(Arrays.asList(new FindingData()
.id("OTQ3NjJkMmYwMTIzMzMxNTc1Y2Q4MTA5NWU0NTBmMDl-ZjE3NjMxZWVkYzBjZGI1NDY2NWY2OGQxZDk4MDY4MmI=")
.type(FindingDataType.FINDINGS), new FindingData()
.id("MTNjN2ZmYWMzMDIxYmU1ZDFiZDRjNWUwN2I1NzVmY2F-YTA3MzllMTUzNWM3NmEyZjdiNzEzOWM5YmViZTMzOGM=")
.type(FindingDataType.FINDINGS))))
.project(new CaseManagementProject()
.data(new CaseManagementProjectData()
.id("959a6f71-bac8-4027-b1d3-2264f569296f")
.type(CaseManagementProjectDataType.PROJECTS))))
.type(JiraIssuesDataType.JIRA_ISSUES));

    try {
      FindingCaseResponse result = apiInstance.attachJiraIssue(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityMonitoringApi#attachJiraIssue");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}