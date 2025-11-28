// Create Jira issue for security findings returns "Created" response

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
                Collections.singletonList(
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
                                                .id("e469ceda-957a-4557-a607-9ff25032e9ca"))))))
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
                                                Arrays.asList(
                                                    new FindingData()
                                                        .type(FindingDataType.FINDINGS)
                                                        .id(
                                                            "MzUxMDI4OWYyYWEyODRhYjQ0Zjg2YjY2ZTFmNjRjYzd-NDU2OWQyNTk1MjM5OGI2NzJjMTVhYjhiODY1ZDcwZWY="),
                                                    new FindingData()
                                                        .type(FindingDataType.FINDINGS)
                                                        .id(
                                                            "ZjE2ZGI5YjdmYTQyYzhhMDQ3Nzc3YjM1NGQ2Y2NmZTd-NDU2OWQyNTk1MjM5OGI2NzJjMTVhYjhiODY1ZDcwZWY=")))))
                            .id("e469ceda-957a-4557-a607-9ff25032e9ca")),
                    new CreateJiraIssueRequestArrayIncluded(
                        new CaseManagementProjectData()
                            .type(CaseManagementProjectDataType.PROJECTS)
                            .id("959a6f71-bac8-4027-b1d3-2264f569296f")),
                    new CreateJiraIssueRequestArrayIncluded(
                        new FindingData()
                            .type(FindingDataType.FINDINGS)
                            .id(
                                "MzUxMDI4OWYyYWEyODRhYjQ0Zjg2YjY2ZTFmNjRjYzd-NDU2OWQyNTk1MjM5OGI2NzJjMTVhYjhiODY1ZDcwZWY=")),
                    new CreateJiraIssueRequestArrayIncluded(
                        new FindingData()
                            .type(FindingDataType.FINDINGS)
                            .id(
                                "ZjE2ZGI5YjdmYTQyYzhhMDQ3Nzc3YjM1NGQ2Y2NmZTd-NDU2OWQyNTk1MjM5OGI2NzJjMTVhYjhiODY1ZDcwZWY="))));

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
