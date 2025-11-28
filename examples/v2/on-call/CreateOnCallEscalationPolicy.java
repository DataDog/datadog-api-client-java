// Create On-Call escalation policy returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.OnCallApi;
import com.datadog.api.client.v2.api.OnCallApi.CreateOnCallEscalationPolicyOptionalParameters;
import com.datadog.api.client.v2.model.DataRelationshipsTeams;
import com.datadog.api.client.v2.model.DataRelationshipsTeamsDataItems;
import com.datadog.api.client.v2.model.DataRelationshipsTeamsDataItemsType;
import com.datadog.api.client.v2.model.EscalationPolicy;
import com.datadog.api.client.v2.model.EscalationPolicyCreateRequest;
import com.datadog.api.client.v2.model.EscalationPolicyCreateRequestData;
import com.datadog.api.client.v2.model.EscalationPolicyCreateRequestDataAttributes;
import com.datadog.api.client.v2.model.EscalationPolicyCreateRequestDataAttributesStepsItems;
import com.datadog.api.client.v2.model.EscalationPolicyCreateRequestDataRelationships;
import com.datadog.api.client.v2.model.EscalationPolicyCreateRequestDataType;
import com.datadog.api.client.v2.model.EscalationPolicyStepAttributesAssignment;
import com.datadog.api.client.v2.model.EscalationPolicyStepTarget;
import com.datadog.api.client.v2.model.EscalationPolicyStepTargetConfig;
import com.datadog.api.client.v2.model.EscalationPolicyStepTargetConfigSchedule;
import com.datadog.api.client.v2.model.EscalationPolicyStepTargetType;
import com.datadog.api.client.v2.model.ScheduleTargetPosition;
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
                            .name("Example-On-Call")
                            .resolvePageOnPolicyEnd(true)
                            .retries(2L)
                            .steps(
                                Arrays.asList(
                                    new EscalationPolicyCreateRequestDataAttributesStepsItems()
                                        .assignment(
                                            EscalationPolicyStepAttributesAssignment.DEFAULT)
                                        .escalateAfterSeconds(3600L)
                                        .targets(
                                            Arrays.asList(
                                                new EscalationPolicyStepTarget()
                                                    .id(USER_DATA_ID)
                                                    .type(EscalationPolicyStepTargetType.USERS),
                                                new EscalationPolicyStepTarget()
                                                    .id(SCHEDULE_DATA_ID)
                                                    .type(EscalationPolicyStepTargetType.SCHEDULES),
                                                new EscalationPolicyStepTarget()
                                                    .config(
                                                        new EscalationPolicyStepTargetConfig()
                                                            .schedule(
                                                                new EscalationPolicyStepTargetConfigSchedule()
                                                                    .position(
                                                                        ScheduleTargetPosition
                                                                            .PREVIOUS)))
                                                    .id(SCHEDULE_DATA_ID)
                                                    .type(EscalationPolicyStepTargetType.SCHEDULES),
                                                new EscalationPolicyStepTarget()
                                                    .id(DD_TEAM_DATA_ID)
                                                    .type(EscalationPolicyStepTargetType.TEAMS))),
                                    new EscalationPolicyCreateRequestDataAttributesStepsItems()
                                        .assignment(
                                            EscalationPolicyStepAttributesAssignment.ROUND_ROBIN)
                                        .escalateAfterSeconds(3600L)
                                        .targets(
                                            Collections.singletonList(
                                                new EscalationPolicyStepTarget()
                                                    .id(DD_TEAM_DATA_ID)
                                                    .type(EscalationPolicyStepTargetType.TEAMS))))))
                    .relationships(
                        new EscalationPolicyCreateRequestDataRelationships()
                            .teams(
                                new DataRelationshipsTeams()
                                    .data(
                                        Collections.singletonList(
                                            new DataRelationshipsTeamsDataItems()
                                                .id(DD_TEAM_DATA_ID)
                                                .type(DataRelationshipsTeamsDataItemsType.TEAMS)))))
                    .type(EscalationPolicyCreateRequestDataType.POLICIES));

    try {
      EscalationPolicy result =
          apiInstance.createOnCallEscalationPolicy(
              body, new CreateOnCallEscalationPolicyOptionalParameters().include("steps.targets"));
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
