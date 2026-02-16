// Assign or un-assign Jira issues to security findings returns "Accepted" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.IntegrationAssignmentDataAttributesRequest;
import com.datadog.api.client.v2.model.IntegrationAssignmentDataAttributesRequestAction;
import com.datadog.api.client.v2.model.IntegrationAssignmentDataAttributesRequestAssignment;
import com.datadog.api.client.v2.model.IntegrationAssignmentDataAttributesRequestType;
import com.datadog.api.client.v2.model.IntegrationAssignmentDataRequest;
import com.datadog.api.client.v2.model.IntegrationAssignmentRequest;
import com.datadog.api.client.v2.model.IntegrationAssignmentType;
import java.util.Collections;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.assignIntegrationIssues", true);
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    IntegrationAssignmentRequest body =
        new IntegrationAssignmentRequest()
            .data(
                new IntegrationAssignmentDataRequest()
                    .attributes(
                        new IntegrationAssignmentDataAttributesRequest()
                            .action(IntegrationAssignmentDataAttributesRequestAction.ASSIGN)
                            .assignment(
                                new IntegrationAssignmentDataAttributesRequestAssignment()
                                    .jira(
                                        Map.ofEntries(
                                            Map.entry(
                                                "https://jira.example.com/browse/SEC-123",
                                                Collections.singletonList(
                                                    "MDBjMzdhYzgyNGZkZGJiZmY0OGNmYjNiMWQ2ODY0YmR-OTc0YjMzNjM1Y2UyODA2YTEyNWQxYmNkZjhmODllNzg=")))))
                            .type(IntegrationAssignmentDataAttributesRequestType.FINDINGS))
                    .id("some_id")
                    .type(IntegrationAssignmentType.ISSUE_ASSIGNMENT));

    try {
      apiInstance.assignIntegrationIssues(body);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityMonitoringApi#assignIntegrationIssues");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
