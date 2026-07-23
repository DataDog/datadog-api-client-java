// Attach security findings to a Linear issue returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.AttachLinearIssueRequest;
import com.datadog.api.client.v2.model.AttachLinearIssueRequestData;
import com.datadog.api.client.v2.model.AttachLinearIssueRequestDataAttributes;
import com.datadog.api.client.v2.model.AttachLinearIssueRequestDataRelationships;
import com.datadog.api.client.v2.model.CaseManagementProject;
import com.datadog.api.client.v2.model.CaseManagementProjectData;
import com.datadog.api.client.v2.model.CaseManagementProjectDataType;
import com.datadog.api.client.v2.model.FindingCaseResponse;
import com.datadog.api.client.v2.model.FindingData;
import com.datadog.api.client.v2.model.FindingDataType;
import com.datadog.api.client.v2.model.Findings;
import com.datadog.api.client.v2.model.LinearIssuesDataType;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    AttachLinearIssueRequest body =
        new AttachLinearIssueRequest()
            .data(
                new AttachLinearIssueRequestData()
                    .attributes(
                        new AttachLinearIssueRequestDataAttributes()
                            .linearIssueUrl("https://linear.app/your-workspace/issue/ENG-123"))
                    .relationships(
                        new AttachLinearIssueRequestDataRelationships()
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
                    .type(LinearIssuesDataType.LINEAR_ISSUES));

    try {
      FindingCaseResponse result = apiInstance.attachLinearIssue(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityMonitoringApi#attachLinearIssue");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
