// Update On-Call escalation policy returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.OnCallApi;
import com.datadog.api.client.v2.model.DataRelationshipsTeams;
import com.datadog.api.client.v2.model.DataRelationshipsTeamsDataItems;
import com.datadog.api.client.v2.model.DataRelationshipsTeamsDataItemsType;
import com.datadog.api.client.v2.model.EscalationPolicy;
import com.datadog.api.client.v2.model.EscalationPolicyStepAttributesAssignment;
import com.datadog.api.client.v2.model.EscalationPolicyStepTarget;
import com.datadog.api.client.v2.model.EscalationPolicyStepTargetType;
import com.datadog.api.client.v2.model.EscalationPolicyUpdateRequest;
import com.datadog.api.client.v2.model.EscalationPolicyUpdateRequestData;
import com.datadog.api.client.v2.model.EscalationPolicyUpdateRequestDataAttributes;
import com.datadog.api.client.v2.model.EscalationPolicyUpdateRequestDataAttributesStepsItems;
import com.datadog.api.client.v2.model.EscalationPolicyUpdateRequestDataRelationships;
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
                            .name("Example-On-Call-updated")
                            .resolvePageOnPolicyEnd(false)
                            .retries(0L)
                            .steps(
                                Collections.singletonList(
                                    new EscalationPolicyUpdateRequestDataAttributesStepsItems()
                                        .assignment(
                                            EscalationPolicyStepAttributesAssignment.DEFAULT)
                                        .escalateAfterSeconds(3600L)
                                        .id(ESCALATION_POLICY_DATA_RELATIONSHIPS_STEPS_DATA_0_ID)
                                        .targets(
                                            Collections.singletonList(
                                                new EscalationPolicyStepTarget()
                                                    .id(USER_DATA_ID)
                                                    .type(EscalationPolicyStepTargetType.USERS))))))
                    .id(ESCALATION_POLICY_DATA_ID)
                    .relationships(
                        new EscalationPolicyUpdateRequestDataRelationships()
                            .teams(
                                new DataRelationshipsTeams()
                                    .data(
                                        Collections.singletonList(
                                            new DataRelationshipsTeamsDataItems()
                                                .id(DD_TEAM_DATA_ID)
                                                .type(DataRelationshipsTeamsDataItemsType.TEAMS)))))
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
