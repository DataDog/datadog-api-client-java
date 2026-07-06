// Create Linear issues for security findings returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.CaseManagementProject;
import com.datadog.api.client.v2.model.CaseManagementProjectData;
import com.datadog.api.client.v2.model.CaseManagementProjectDataType;
import com.datadog.api.client.v2.model.CasePriority;
import com.datadog.api.client.v2.model.CreateLinearIssueRequestArray;
import com.datadog.api.client.v2.model.CreateLinearIssueRequestData;
import com.datadog.api.client.v2.model.CreateLinearIssueRequestDataAttributes;
import com.datadog.api.client.v2.model.CreateLinearIssueRequestDataRelationships;
import com.datadog.api.client.v2.model.FindingCaseResponseArray;
import com.datadog.api.client.v2.model.FindingData;
import com.datadog.api.client.v2.model.FindingDataType;
import com.datadog.api.client.v2.model.Findings;
import com.datadog.api.client.v2.model.LinearIssuesDataType;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createLinearIssues", true);
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    CreateLinearIssueRequestArray body =
        new CreateLinearIssueRequestArray()
            .data(
                Collections.singletonList(
                    new CreateLinearIssueRequestData()
                        .attributes(
                            new CreateLinearIssueRequestDataAttributes()
                                .assigneeId("f315bdaf-9ee7-4808-a9c1-99c15bf0f4d0")
                                .description("A description of the Linear issue.")
                                .labelIds(
                                    Collections.singletonList(
                                        "a1b2c3d4-5e6f-7a8b-9c0d-1e2f3a4b5c6d"))
                                .linearProjectId("d4c3b2a1-6f5e-8b7a-0d9c-2f1e4a3b6c5d")
                                .priority(CasePriority.NOT_DEFINED)
                                .title("A title for the Linear issue."))
                        .relationships(
                            new CreateLinearIssueRequestDataRelationships()
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
                        .type(LinearIssuesDataType.LINEAR_ISSUES)));

    try {
      FindingCaseResponseArray result = apiInstance.createLinearIssues(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityMonitoringApi#createLinearIssues");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
