// Assign or unassign security findings returns "Accepted" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.AssigneeDataType;
import com.datadog.api.client.v2.model.AssigneeRequest;
import com.datadog.api.client.v2.model.AssigneeRequestData;
import com.datadog.api.client.v2.model.AssigneeRequestDataAttributes;
import com.datadog.api.client.v2.model.AssigneeRequestDataRelationships;
import com.datadog.api.client.v2.model.AssigneeResponse;
import com.datadog.api.client.v2.model.FindingData;
import com.datadog.api.client.v2.model.FindingDataType;
import com.datadog.api.client.v2.model.Findings;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.updateFindingsAssignee", true);
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    AssigneeRequest body =
        new AssigneeRequest()
            .data(
                new AssigneeRequestData()
                    .attributes(
                        new AssigneeRequestDataAttributes()
                            .assigneeId("f315bdaf-9ee7-4808-a9c1-99c15bf0f4d0"))
                    .id("00000000-0000-0000-0000-000000000001")
                    .relationships(
                        new AssigneeRequestDataRelationships()
                            .findings(
                                new Findings()
                                    .data(
                                        Collections.singletonList(
                                            new FindingData()
                                                .id("ZGVmLTAwcC1pZXJ-aS0wZjhjNjMyZDNmMzRlZTgzNw==")
                                                .type(FindingDataType.FINDINGS)))))
                    .type(AssigneeDataType.ASSIGNEE));

    try {
      AssigneeResponse result = apiInstance.updateFindingsAssignee(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityMonitoringApi#updateFindingsAssignee");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
