// Update on call escalation policy returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.OnCallApi;
import com.datadog.api.client.v2.model.EscalationPolicy;
import com.datadog.api.client.v2.model.EscalationPolicyUpdateRequest;
import com.datadog.api.client.v2.model.EscalationPolicyUpdateRequestData;
import com.datadog.api.client.v2.model.EscalationPolicyUpdateRequestDataAttributes;
import com.datadog.api.client.v2.model.EscalationPolicyUpdateRequestDataAttributesStepsItems;
import com.datadog.api.client.v2.model.EscalationPolicyUpdateRequestDataAttributesStepsItemsAssignment;
import com.datadog.api.client.v2.model.EscalationPolicyUpdateRequestDataAttributesStepsItemsTargetsItems;
import com.datadog.api.client.v2.model.EscalationPolicyUpdateRequestDataAttributesStepsItemsTargetsItemsType;
import com.datadog.api.client.v2.model.EscalationPolicyUpdateRequestDataRelationships;
import com.datadog.api.client.v2.model.EscalationPolicyUpdateRequestDataRelationshipsTeams;
import com.datadog.api.client.v2.model.EscalationPolicyUpdateRequestDataRelationshipsTeamsDataItems;
import com.datadog.api.client.v2.model.EscalationPolicyUpdateRequestDataRelationshipsTeamsDataItemsType;
import com.datadog.api.client.v2.model.EscalationPolicyUpdateRequestDataType;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    OnCallApi apiInstance = new OnCallApi(defaultClient);

    // there is a valid "escalation_policy" in the system
    String ESCALATION_POLICY_DATA_ID = System.getenv("ESCALATION_POLICY_DATA_ID");
    String ESCALATION_POLICY_DATA_RELATIONSHIPS_STEPS_DATA_0_ID =
        System.getenv("ESCALATION_POLICY_DATA_RELATIONSHIPS_STEPS_DATA_0_ID");

    // there is a valid "user" in the system
    String USER_DATA_ID = System.getenv("USER_DATA_ID");

    // there is a valid "dd_team" in the system
    String DD_TEAM_DATA_ID = System.getenv("DD_TEAM_DATA_ID");

    EscalationPolicyUpdateRequest body =
        new EscalationPolicyUpdateRequest()
            .data(
                new EscalationPolicyUpdateRequestData()
                    .attributes(
                        new EscalationPolicyUpdateRequestDataAttributes()
                            .description("Example-On-Call")
                            .name("Example-On-Call-updated")
                            .resolvePageOnPolicyEnd(false)
                            .retries(0L)
                            .steps(
                                Collections.singletonList(
                                    new EscalationPolicyUpdateRequestDataAttributesStepsItems()
                                        .assignment(
                                            EscalationPolicyUpdateRequestDataAttributesStepsItemsAssignment
                                                .DEFAULT)
                                        .escalateAfterSeconds(3600L)
                                        .id(ESCALATION_POLICY_DATA_RELATIONSHIPS_STEPS_DATA_0_ID)
                                        .targets(
                                            Collections.singletonList(
                                                new EscalationPolicyUpdateRequestDataAttributesStepsItemsTargetsItems()
                                                    .id(USER_DATA_ID)
                                                    .type(
                                                        EscalationPolicyUpdateRequestDataAttributesStepsItemsTargetsItemsType
                                                            .USERS))))))
                    .id(ESCALATION_POLICY_DATA_ID)
                    .relationships(
                        new EscalationPolicyUpdateRequestDataRelationships()
                            .teams(
                                new EscalationPolicyUpdateRequestDataRelationshipsTeams()
                                    .data(
                                        Collections.singletonList(
                                            new EscalationPolicyUpdateRequestDataRelationshipsTeamsDataItems()
                                                .id(DD_TEAM_DATA_ID)
                                                .type(
                                                    EscalationPolicyUpdateRequestDataRelationshipsTeamsDataItemsType
                                                        .TEAMS)))))
                    .type(EscalationPolicyUpdateRequestDataType.POLICIES));

    try {
      EscalationPolicy result =
          apiInstance.updateOnCallEscalationPolicy(ESCALATION_POLICY_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OnCallApi#updateOnCallEscalationPolicy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
