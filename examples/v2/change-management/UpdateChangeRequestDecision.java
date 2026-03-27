// Update a change request decision returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ChangeManagementApi;
import com.datadog.api.client.v2.model.ChangeRequestDecisionCreateAttributes;
import com.datadog.api.client.v2.model.ChangeRequestDecisionCreateItem;
import com.datadog.api.client.v2.model.ChangeRequestDecisionCreateRelationships;
import com.datadog.api.client.v2.model.ChangeRequestDecisionRelationshipData;
import com.datadog.api.client.v2.model.ChangeRequestDecisionResourceType;
import com.datadog.api.client.v2.model.ChangeRequestDecisionStatusType;
import com.datadog.api.client.v2.model.ChangeRequestDecisionUpdateData;
import com.datadog.api.client.v2.model.ChangeRequestDecisionUpdateDataAttributes;
import com.datadog.api.client.v2.model.ChangeRequestDecisionUpdateDataRelationships;
import com.datadog.api.client.v2.model.ChangeRequestDecisionUpdateRequest;
import com.datadog.api.client.v2.model.ChangeRequestDecisionsRelationship;
import com.datadog.api.client.v2.model.ChangeRequestResourceType;
import com.datadog.api.client.v2.model.ChangeRequestResponse;
import com.datadog.api.client.v2.model.ChangeRequestUserRelationship;
import com.datadog.api.client.v2.model.ChangeRequestUserRelationshipData;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.updateChangeRequestDecision", true);
    ChangeManagementApi apiInstance = new ChangeManagementApi(defaultClient);

    ChangeRequestDecisionUpdateRequest body =
        new ChangeRequestDecisionUpdateRequest()
            .data(
                new ChangeRequestDecisionUpdateData()
                    .attributes(new ChangeRequestDecisionUpdateDataAttributes().id("CHM-1234"))
                    .relationships(
                        new ChangeRequestDecisionUpdateDataRelationships()
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
      ChangeRequestResponse result =
          apiInstance.updateChangeRequestDecision("CHM-1234", "decision-id-0", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChangeManagementApi#updateChangeRequestDecision");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
