// Create Jira issue for security finding returns "Created" response

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
                                                .id("6a773295-8729-4034-aada-53b64cbe02e7"))))))
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
                                                            "ZGZhMDI3ZjdjMDM3YjJmNzcxNTlhZGMwMjdmZWNiNTZ-MTVlYTNmYWU3NjNlOTNlYTE2YjM4N2JmZmI4Yjk5N2Y=")))))
                            .id("6a773295-8729-4034-aada-53b64cbe02e7")),
                    new CreateJiraIssueRequestArrayIncluded(
                        new CaseManagementProjectData()
                            .type(CaseManagementProjectDataType.PROJECTS)
                            .id("959a6f71-bac8-4027-b1d3-2264f569296f")),
                    new CreateJiraIssueRequestArrayIncluded(
                        new FindingData()
                            .type(FindingDataType.FINDINGS)
                            .id(
                                "ZGZhMDI3ZjdjMDM3YjJmNzcxNTlhZGMwMjdmZWNiNTZ-MTVlYTNmYWU3NjNlOTNlYTE2YjM4N2JmZmI4Yjk5N2Y="))));

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
