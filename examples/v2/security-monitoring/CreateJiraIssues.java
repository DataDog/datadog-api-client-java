// Create Jira issues for security findings returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.CaseDataType;
import com.datadog.api.client.v2.model.CaseManagementProject;
import com.datadog.api.client.v2.model.CaseManagementProjectData;
import com.datadog.api.client.v2.model.CaseManagementProjectDataType;
import com.datadog.api.client.v2.model.CreateCaseRequestData;
import com.datadog.api.client.v2.model.CreateCaseRequestDataAttributes;
import com.datadog.api.client.v2.model.CreateCaseRequestDataRelationships;
import com.datadog.api.client.v2.model.CreateJiraIssueRequestArray;
import com.datadog.api.client.v2.model.CreateJiraIssueRequestArrayIncluded;
import com.datadog.api.client.v2.model.CreateJiraIssueRequestData;
import com.datadog.api.client.v2.model.CreateJiraIssueRequestDataAttributes;
import com.datadog.api.client.v2.model.CreateJiraIssueRequestDataRelationships;
import com.datadog.api.client.v2.model.CreateJiraIssueRequestDataRelationshipsCase;
import com.datadog.api.client.v2.model.CreateJiraIssueRequestDataRelationshipsCaseData;
import com.datadog.api.client.v2.model.FindingCaseResponseArray;
import com.datadog.api.client.v2.model.FindingData;
import com.datadog.api.client.v2.model.FindingDataType;
import com.datadog.api.client.v2.model.Findings;
import com.datadog.api.client.v2.model.JiraIssuesDataType;
import java.util.Arrays;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    CreateJiraIssueRequestArray body =
        new CreateJiraIssueRequestArray()
            .data(
                Arrays.asList(
                    new CreateJiraIssueRequestData()
                        .type(JiraIssuesDataType.JIRA_ISSUES)
                        .attributes(new CreateJiraIssueRequestDataAttributes())
                        .relationships(
                            new CreateJiraIssueRequestDataRelationships()
                                ._case(
                                    new CreateJiraIssueRequestDataRelationshipsCase()
                                        .data(
                                            new CreateJiraIssueRequestDataRelationshipsCaseData()
                                                .type(CaseDataType.CASES)
                                                .id("53e242c6-a7d6-46ad-9680-b8d14753f716")))),
                    new CreateJiraIssueRequestData()
                        .type(JiraIssuesDataType.JIRA_ISSUES)
                        .attributes(new CreateJiraIssueRequestDataAttributes())
                        .relationships(
                            new CreateJiraIssueRequestDataRelationships()
                                ._case(
                                    new CreateJiraIssueRequestDataRelationshipsCase()
                                        .data(
                                            new CreateJiraIssueRequestDataRelationshipsCaseData()
                                                .type(CaseDataType.CASES)
                                                .id("195772b2-1f53-41d2-b81e-48c8e6c21d33"))))))
            .included(
                Arrays.asList(
                    new CreateJiraIssueRequestArrayIncluded(
                        new CreateCaseRequestData()
                            .type(CaseDataType.CASES)
                            .attributes(
                                new CreateCaseRequestDataAttributes()
                                    .title("A title")
                                    .description("A description"))
                            .relationships(
                                new CreateCaseRequestDataRelationships()
                                    .project(
                                        new CaseManagementProject()
                                            .data(
                                                new CaseManagementProjectData()
                                                    .type(CaseManagementProjectDataType.PROJECTS)
                                                    .id("959a6f71-bac8-4027-b1d3-2264f569296f")))
                                    .findings(
                                        new Findings()
                                            .data(
                                                Collections.singletonList(
                                                    new FindingData()
                                                        .type(FindingDataType.FINDINGS)
                                                        .id(
                                                            "OTQ3NjJkMmYwMTIzMzMxNTc1Y2Q4MTA5NWU0NTBmMDl-ZjE3NjMxZWVkYzBjZGI1NDY2NWY2OGQxZDk4MDY4MmI=")))))
                            .id("53e242c6-a7d6-46ad-9680-b8d14753f716")),
                    new CreateJiraIssueRequestArrayIncluded(
                        new CreateCaseRequestData()
                            .type(CaseDataType.CASES)
                            .attributes(
                                new CreateCaseRequestDataAttributes()
                                    .title("A title")
                                    .description("A description"))
                            .relationships(
                                new CreateCaseRequestDataRelationships()
                                    .project(
                                        new CaseManagementProject()
                                            .data(
                                                new CaseManagementProjectData()
                                                    .type(CaseManagementProjectDataType.PROJECTS)
                                                    .id("959a6f71-bac8-4027-b1d3-2264f569296f")))
                                    .findings(
                                        new Findings()
                                            .data(
                                                Collections.singletonList(
                                                    new FindingData()
                                                        .type(FindingDataType.FINDINGS)
                                                        .id(
                                                            "MTNjN2ZmYWMzMDIxYmU1ZDFiZDRjNWUwN2I1NzVmY2F-YTA3MzllMTUzNWM3NmEyZjdiNzEzOWM5YmViZTMzOGM=")))))
                            .id("195772b2-1f53-41d2-b81e-48c8e6c21d33")),
                    new CreateJiraIssueRequestArrayIncluded(
                        new CaseManagementProjectData()
                            .type(CaseManagementProjectDataType.PROJECTS)
                            .id("959a6f71-bac8-4027-b1d3-2264f569296f")),
                    new CreateJiraIssueRequestArrayIncluded(
                        new FindingData()
                            .type(FindingDataType.FINDINGS)
                            .id(
                                "OTQ3NjJkMmYwMTIzMzMxNTc1Y2Q4MTA5NWU0NTBmMDl-ZjE3NjMxZWVkYzBjZGI1NDY2NWY2OGQxZDk4MDY4MmI=")),
                    new CreateJiraIssueRequestArrayIncluded(
                        new FindingData()
                            .type(FindingDataType.FINDINGS)
                            .id(
                                "MTNjN2ZmYWMzMDIxYmU1ZDFiZDRjNWUwN2I1NzVmY2F-YTA3MzllMTUzNWM3NmEyZjdiNzEzOWM5YmViZTMzOGM="))));

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
