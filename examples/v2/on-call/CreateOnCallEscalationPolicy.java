// Create on call escalation policy returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.OnCallApi;
import com.datadog.api.client.v2.model.EscalationPolicy;
import com.datadog.api.client.v2.model.EscalationPolicyCreateRequest;
import com.datadog.api.client.v2.model.EscalationPolicyCreateRequestData;
import com.datadog.api.client.v2.model.EscalationPolicyCreateRequestDataAttributes;
import com.datadog.api.client.v2.model.EscalationPolicyCreateRequestDataAttributesStepsItems;
import com.datadog.api.client.v2.model.EscalationPolicyCreateRequestDataAttributesStepsItemsAssignment;
import com.datadog.api.client.v2.model.EscalationPolicyCreateRequestDataAttributesStepsItemsTargetsItems;
import com.datadog.api.client.v2.model.EscalationPolicyCreateRequestDataAttributesStepsItemsTargetsItemsType;
import com.datadog.api.client.v2.model.EscalationPolicyCreateRequestDataRelationships;
import com.datadog.api.client.v2.model.EscalationPolicyCreateRequestDataRelationshipsTeams;
import com.datadog.api.client.v2.model.EscalationPolicyCreateRequestDataRelationshipsTeamsDataItems;
import com.datadog.api.client.v2.model.EscalationPolicyCreateRequestDataRelationshipsTeamsDataItemsType;
import com.datadog.api.client.v2.model.EscalationPolicyCreateRequestDataType;
import java.util.Arrays;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    OnCallApi apiInstance = new OnCallApi(defaultClient);

    // there is a valid "user" in the system
    String USER_DATA_ID = System.getenv("USER_DATA_ID");

    // there is a valid "schedule" in the system
    String SCHEDULE_DATA_ID = System.getenv("SCHEDULE_DATA_ID");

    // there is a valid "dd_team" in the system
    String DD_TEAM_DATA_ID = System.getenv("DD_TEAM_DATA_ID");

    EscalationPolicyCreateRequest body =
        new EscalationPolicyCreateRequest()
            .data(
                new EscalationPolicyCreateRequestData()
                    .attributes(
                        new EscalationPolicyCreateRequestDataAttributes()
                            .description("Escalation Policy 1 description")
                            .name("Example-On-Call")
                            .resolvePageOnPolicyEnd(true)
                            .retries(2L)
                            .steps(
                                Arrays.asList(
                                    new EscalationPolicyCreateRequestDataAttributesStepsItems()
                                        .assignment(
                                            EscalationPolicyCreateRequestDataAttributesStepsItemsAssignment
                                                .DEFAULT)
                                        .escalateAfterSeconds(3600L)
                                        .targets(
                                            Arrays.asList(
                                                new EscalationPolicyCreateRequestDataAttributesStepsItemsTargetsItems()
                                                    .id(USER_DATA_ID)
                                                    .type(
                                                        EscalationPolicyCreateRequestDataAttributesStepsItemsTargetsItemsType
                                                            .USERS),
                                                new EscalationPolicyCreateRequestDataAttributesStepsItemsTargetsItems()
                                                    .id(SCHEDULE_DATA_ID)
                                                    .type(
                                                        EscalationPolicyCreateRequestDataAttributesStepsItemsTargetsItemsType
                                                            .SCHEDULES),
                                                new EscalationPolicyCreateRequestDataAttributesStepsItemsTargetsItems()
                                                    .id(DD_TEAM_DATA_ID)
                                                    .type(
                                                        EscalationPolicyCreateRequestDataAttributesStepsItemsTargetsItemsType
                                                            .TEAMS))),
                                    new EscalationPolicyCreateRequestDataAttributesStepsItems()
                                        .assignment(
                                            EscalationPolicyCreateRequestDataAttributesStepsItemsAssignment
                                                .ROUND_ROBIN)
                                        .escalateAfterSeconds(3600L)
                                        .targets(
                                            Collections.singletonList(
                                                new EscalationPolicyCreateRequestDataAttributesStepsItemsTargetsItems()
                                                    .id(DD_TEAM_DATA_ID)
                                                    .type(
                                                        EscalationPolicyCreateRequestDataAttributesStepsItemsTargetsItemsType
                                                            .TEAMS))))))
                    .relationships(
                        new EscalationPolicyCreateRequestDataRelationships()
                            .teams(
                                new EscalationPolicyCreateRequestDataRelationshipsTeams()
                                    .data(
                                        Collections.singletonList(
                                            new EscalationPolicyCreateRequestDataRelationshipsTeamsDataItems()
                                                .id(DD_TEAM_DATA_ID)
                                                .type(
                                                    EscalationPolicyCreateRequestDataRelationshipsTeamsDataItemsType
                                                        .TEAMS)))))
                    .type(EscalationPolicyCreateRequestDataType.POLICIES));

    try {
      EscalationPolicy result = apiInstance.createOnCallEscalationPolicy(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OnCallApi#createOnCallEscalationPolicy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
