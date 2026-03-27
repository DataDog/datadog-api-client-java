// Update incident notification rule returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.IncidentsApi;
import com.datadog.api.client.v2.model.IncidentNotificationRule;
import com.datadog.api.client.v2.model.IncidentNotificationRuleConditionsItems;
import com.datadog.api.client.v2.model.IncidentNotificationRuleCreateAttributes;
import com.datadog.api.client.v2.model.IncidentNotificationRuleCreateAttributesVisibility;
import com.datadog.api.client.v2.model.IncidentNotificationRuleCreateDataRelationships;
import com.datadog.api.client.v2.model.IncidentNotificationRuleType;
import com.datadog.api.client.v2.model.IncidentNotificationRuleUpdateData;
import com.datadog.api.client.v2.model.IncidentTypeType;
import com.datadog.api.client.v2.model.PutIncidentNotificationRuleRequest;
import com.datadog.api.client.v2.model.RelationshipToIncidentType;
import com.datadog.api.client.v2.model.RelationshipToIncidentTypeData;
import java.util.Collections;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.updateIncidentNotificationRule", true);
    IncidentsApi apiInstance = new IncidentsApi(defaultClient);

    // there is a valid "notification_rule" in the system
    UUID NOTIFICATION_RULE_DATA_ID = null;
    try {
      NOTIFICATION_RULE_DATA_ID = UUID.fromString(System.getenv("NOTIFICATION_RULE_DATA_ID"));
    } catch (IllegalArgumentException e) {
      System.err.println("Error parsing UUID: " + e.getMessage());
    }

    // there is a valid "incident_type" in the system
    String INCIDENT_TYPE_DATA_ID = System.getenv("INCIDENT_TYPE_DATA_ID");

    PutIncidentNotificationRuleRequest body =
        new PutIncidentNotificationRuleRequest()
            .data(
                new IncidentNotificationRuleUpdateData()
                    .attributes(
                        new IncidentNotificationRuleCreateAttributes()
                            .enabled(false)
                            .conditions(
                                Collections.singletonList(
                                    new IncidentNotificationRuleConditionsItems()
                                        .field("severity")
                                        .values(Collections.singletonList("SEV-1"))))
                            .handles(Collections.singletonList("@updated-team-email@company.com"))
                            .visibility(IncidentNotificationRuleCreateAttributesVisibility.PRIVATE)
                            .trigger("incident_modified_trigger"))
                    .relationships(
                        new IncidentNotificationRuleCreateDataRelationships()
                            .incidentType(
                                new RelationshipToIncidentType()
                                    .data(
                                        new RelationshipToIncidentTypeData()
                                            .id(INCIDENT_TYPE_DATA_ID)
                                            .type(IncidentTypeType.INCIDENT_TYPES))))
                    .id(NOTIFICATION_RULE_DATA_ID)
                    .type(IncidentNotificationRuleType.INCIDENT_NOTIFICATION_RULES));

    try {
      IncidentNotificationRule result =
          apiInstance.updateIncidentNotificationRule(NOTIFICATION_RULE_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentsApi#updateIncidentNotificationRule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
