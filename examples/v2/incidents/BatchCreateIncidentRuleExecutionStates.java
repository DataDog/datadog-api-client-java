// Batch create incident rule execution states returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.IncidentsApi;
import com.datadog.api.client.v2.model.IncidentBatchCreateRuleExecutionStatesData;
import com.datadog.api.client.v2.model.IncidentBatchCreateRuleExecutionStatesDataAttributes;
import com.datadog.api.client.v2.model.IncidentBatchCreateRuleExecutionStatesRequest;
import com.datadog.api.client.v2.model.IncidentRuleExecutionStateRule;
import com.datadog.api.client.v2.model.IncidentRuleExecutionStateType;
import com.datadog.api.client.v2.model.IncidentRuleExecutionStatesResponse;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.batchCreateIncidentRuleExecutionStates", true);
    IncidentsApi apiInstance = new IncidentsApi(defaultClient);

    IncidentBatchCreateRuleExecutionStatesRequest body =
        new IncidentBatchCreateRuleExecutionStatesRequest()
            .data(
                new IncidentBatchCreateRuleExecutionStatesData()
                    .attributes(
                        new IncidentBatchCreateRuleExecutionStatesDataAttributes()
                            .rules(
                                Collections.singletonList(
                                    new IncidentRuleExecutionStateRule()
                                        .lastExecutedAt(
                                            OffsetDateTime.parse("2024-01-01T00:00:00.000Z"))
                                        .ruleUuid(
                                            UUID.fromString(
                                                "00000000-0000-0000-0000-000000000000")))))
                    .type(IncidentRuleExecutionStateType.INCIDENT_RULE_EXECUTION_STATES));

    try {
      IncidentRuleExecutionStatesResponse result =
          apiInstance.batchCreateIncidentRuleExecutionStates("incident_id", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling IncidentsApi#batchCreateIncidentRuleExecutionStates");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
