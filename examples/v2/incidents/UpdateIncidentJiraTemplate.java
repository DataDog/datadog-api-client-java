// Update an incident Jira template returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.IncidentsApi;
import com.datadog.api.client.v2.model.IncidentJiraTemplateDataAttributesRequest;
import com.datadog.api.client.v2.model.IncidentJiraTemplateDataRequest;
import com.datadog.api.client.v2.model.IncidentJiraTemplateFieldConfiguration;
import com.datadog.api.client.v2.model.IncidentJiraTemplateIncidentTypeRelationship;
import com.datadog.api.client.v2.model.IncidentJiraTemplateIncidentTypeRelationshipData;
import com.datadog.api.client.v2.model.IncidentJiraTemplateRelationships;
import com.datadog.api.client.v2.model.IncidentJiraTemplateRequest;
import com.datadog.api.client.v2.model.IncidentJiraTemplateResponse;
import com.datadog.api.client.v2.model.IncidentJiraTemplateType;
import java.util.Collections;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.updateIncidentJiraTemplate", true);
    IncidentsApi apiInstance = new IncidentsApi(defaultClient);

    IncidentJiraTemplateRequest body =
        new IncidentJiraTemplateRequest()
            .data(
                new IncidentJiraTemplateDataRequest()
                    .attributes(
                        new IncidentJiraTemplateDataAttributesRequest()
                            .accountId("123456")
                            .fieldConfigurations(
                                Collections.singletonList(
                                    new IncidentJiraTemplateFieldConfiguration()
                                        .incidentField("title")
                                        .jiraFieldKey("summary")
                                        .jiraFieldType("string")
                                        .syncDirection("bidirectional")))
                            .isDefault(false)
                            .issueId("10001")
                            .name("Default Jira Template")
                            .projectId("10000")
                            .projectKey("INC")
                            .syncEnabled(true)
                            .type("jira"))
                    .relationships(
                        new IncidentJiraTemplateRelationships()
                            .incidentType(
                                new IncidentJiraTemplateIncidentTypeRelationship()
                                    .data(
                                        new IncidentJiraTemplateIncidentTypeRelationshipData()
                                            .id(
                                                UUID.fromString(
                                                    "00000000-0000-0000-0000-000000000000"))
                                            .type("incident_types"))))
                    .type(IncidentJiraTemplateType.INCIDENTS_JIRA_TEMPLATES));

    try {
      IncidentJiraTemplateResponse result =
          apiInstance.updateIncidentJiraTemplate(
              UUID.fromString("00000000-0000-0000-0000-000000000000"), body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentsApi#updateIncidentJiraTemplate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
