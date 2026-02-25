// Create a change request returns "Created" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.ChangeManagementApi;
import com.datadog.api.client.v2.model.ChangeRequestResponse;
import com.datadog.api.client.v2.model.ChangeRequestChangeType;
import com.datadog.api.client.v2.model.ChangeRequestCreateAttributes;
import com.datadog.api.client.v2.model.ChangeRequestCreateData;
import com.datadog.api.client.v2.model.ChangeRequestCreateRequest;
import com.datadog.api.client.v2.model.ChangeRequestResourceType;
import com.datadog.api.client.v2.model.ChangeRequestRiskLevel;
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
    defaultClient.setUnstableOperationEnabled("v2.createChangeRequest", true);
    ChangeManagementApi apiInstance = new ChangeManagementApi(defaultClient);

    ChangeRequestCreateRequest body = new ChangeRequestCreateRequest()
.data(new ChangeRequestCreateData()
.attributes(new ChangeRequestCreateAttributes()
.changeRequestLinkedIncidentUuid("00000000-0000-0000-0000-000000000000")
.changeRequestMaintenanceWindowQuery("")
.changeRequestPlan("1. Deploy to staging 2. Run tests 3. Deploy to production")
.changeRequestRisk(ChangeRequestRiskLevel.LOW)
.changeRequestType(ChangeRequestChangeType.NORMAL)
.description("Deploying new payment service v2.1")
.endDate(OffsetDateTime.parse("2024-01-02T15:00:00Z"))
.projectId("d4bbe1af-f36e-42f1-87c1-493ca35c320e")
.requestedTeams(Collections.singletonList("team-handle-1"))
.startDate(OffsetDateTime.parse("2024-01-01T03:00:00Z"))
.title("Deploy new payment service"))
.type(ChangeRequestResourceType.CHANGE_REQUEST));

    try {
      ChangeRequestResponse result = apiInstance.createChangeRequest(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChangeManagementApi#createChangeRequest");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}