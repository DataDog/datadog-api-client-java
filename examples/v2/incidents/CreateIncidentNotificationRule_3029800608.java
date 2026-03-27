// Create incident notification rule returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.IncidentsApi;
import com.datadog.api.client.v2.model.CreateIncidentNotificationRuleRequest;
import com.datadog.api.client.v2.model.IncidentNotificationRule;
import com.datadog.api.client.v2.model.IncidentNotificationRuleConditionsItems;
import com.datadog.api.client.v2.model.IncidentNotificationRuleCreateAttributes;
import com.datadog.api.client.v2.model.IncidentNotificationRuleCreateAttributesVisibility;
import com.datadog.api.client.v2.model.IncidentNotificationRuleCreateData;
import com.datadog.api.client.v2.model.IncidentNotificationRuleCreateDataRelationships;
import com.datadog.api.client.v2.model.IncidentNotificationRuleType;
import com.datadog.api.client.v2.model.IncidentTypeType;
import com.datadog.api.client.v2.model.RelationshipToIncidentType;
import com.datadog.api.client.v2.model.RelationshipToIncidentTypeData;
import java.util.Arrays;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createIncidentNotificationRule", true);
    IncidentsApi apiInstance = new IncidentsApi(defaultClient);

    // there is a valid "incident_type" in the system
    String INCIDENT_TYPE_DATA_ID = System.getenv("INCIDENT_TYPE_DATA_ID");

    CreateIncidentNotificationRuleRequest body =
        new CreateIncidentNotificationRuleRequest()
            .data(
                new IncidentNotificationRuleCreateData()
                    .attributes(
                        new IncidentNotificationRuleCreateAttributes()
                            .conditions(
                                Collections.singletonList(
                                    new IncidentNotificationRuleConditionsItems()
                                        .field("severity")
                                        .values(Arrays.asList("SEV-1", "SEV-2"))))
                            .handles(Collections.singletonList("@test-email@company.com"))
                            .visibility(
                                IncidentNotificationRuleCreateAttributesVisibility.ORGANIZATION)
                            .trigger("incident_created_trigger")
                            .enabled(true))
                    .relationships(
                        new IncidentNotificationRuleCreateDataRelationships()
                            .incidentType(
                                new RelationshipToIncidentType()
                                    .data(
                                        new RelationshipToIncidentTypeData()
                                            .id(INCIDENT_TYPE_DATA_ID)
                                            .type(IncidentTypeType.INCIDENT_TYPES))))
                    .type(IncidentNotificationRuleType.INCIDENT_NOTIFICATION_RULES));

    try {
      IncidentNotificationRule result = apiInstance.createIncidentNotificationRule(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentsApi#createIncidentNotificationRule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
