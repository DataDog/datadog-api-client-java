// Update a change request returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ChangeManagementApi;
import com.datadog.api.client.v2.model.ChangeRequestChangeType;
import com.datadog.api.client.v2.model.ChangeRequestDecisionCreateAttributes;
import com.datadog.api.client.v2.model.ChangeRequestDecisionCreateItem;
import com.datadog.api.client.v2.model.ChangeRequestDecisionCreateRelationships;
import com.datadog.api.client.v2.model.ChangeRequestDecisionRelationshipData;
import com.datadog.api.client.v2.model.ChangeRequestDecisionResourceType;
import com.datadog.api.client.v2.model.ChangeRequestDecisionStatusType;
import com.datadog.api.client.v2.model.ChangeRequestDecisionsRelationship;
import com.datadog.api.client.v2.model.ChangeRequestResourceType;
import com.datadog.api.client.v2.model.ChangeRequestResponse;
import com.datadog.api.client.v2.model.ChangeRequestRiskLevel;
import com.datadog.api.client.v2.model.ChangeRequestUpdateAttributes;
import com.datadog.api.client.v2.model.ChangeRequestUpdateData;
import com.datadog.api.client.v2.model.ChangeRequestUpdateRelationships;
import com.datadog.api.client.v2.model.ChangeRequestUpdateRequest;
import com.datadog.api.client.v2.model.ChangeRequestUserRelationship;
import com.datadog.api.client.v2.model.ChangeRequestUserRelationshipData;
import java.time.OffsetDateTime;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.updateChangeRequest", true);
    ChangeManagementApi apiInstance = new ChangeManagementApi(defaultClient);

    ChangeRequestUpdateRequest body =
        new ChangeRequestUpdateRequest()
            .data(
                new ChangeRequestUpdateData()
                    .attributes(
                        new ChangeRequestUpdateAttributes()
                            .changeRequestPlan("Updated deployment plan")
                            .changeRequestRisk(ChangeRequestRiskLevel.LOW)
                            .changeRequestType(ChangeRequestChangeType.NORMAL)
                            .endDate(OffsetDateTime.parse("2024-01-02T15:00:00Z"))
                            .id("CHM-1234")
                            .startDate(OffsetDateTime.parse("2024-01-01T03:00:00Z")))
                    .relationships(
                        new ChangeRequestUpdateRelationships()
                            .changeRequestDecisions(
                                new ChangeRequestDecisionsRelationship()
                                    .data(
                                        Collections.singletonList(
                                            new ChangeRequestDecisionRelationshipData()
                                                .id("decision-id-0")
                                                .type(
                                                    ChangeRequestDecisionResourceType
                                                        .CHANGE_REQUEST_DECISION)))))
                    .type(ChangeRequestResourceType.CHANGE_REQUEST))
            .included(
                Collections.singletonList(
                    new ChangeRequestDecisionCreateItem()
                        .attributes(
                            new ChangeRequestDecisionCreateAttributes()
                                .changeRequestStatus(ChangeRequestDecisionStatusType.REQUESTED)
                                .requestReason("Please review and approve this change"))
                        .id("decision-id-0")
                        .relationships(
                            new ChangeRequestDecisionCreateRelationships()
                                .requestedUser(
                                    new ChangeRequestUserRelationship()
                                        .data(
                                            new ChangeRequestUserRelationshipData()
                                                .id("00000000-0000-0000-0000-000000000000")
                                                .type("user"))))
                        .type(ChangeRequestDecisionResourceType.CHANGE_REQUEST_DECISION)));

    try {
      ChangeRequestResponse result = apiInstance.updateChangeRequest("CHM-1234", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChangeManagementApi#updateChangeRequest");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
