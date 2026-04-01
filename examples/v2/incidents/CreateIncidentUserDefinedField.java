// Create an incident user-defined field returns "CREATED" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.IncidentsApi;
import com.datadog.api.client.v2.model.IncidentTypeType;
import com.datadog.api.client.v2.model.IncidentUserDefinedFieldAttributesCreateRequest;
import com.datadog.api.client.v2.model.IncidentUserDefinedFieldCategory;
import com.datadog.api.client.v2.model.IncidentUserDefinedFieldCollected;
import com.datadog.api.client.v2.model.IncidentUserDefinedFieldCreateData;
import com.datadog.api.client.v2.model.IncidentUserDefinedFieldCreateRelationships;
import com.datadog.api.client.v2.model.IncidentUserDefinedFieldCreateRequest;
import com.datadog.api.client.v2.model.IncidentUserDefinedFieldFieldType;
import com.datadog.api.client.v2.model.IncidentUserDefinedFieldResponse;
import com.datadog.api.client.v2.model.IncidentUserDefinedFieldType;
import com.datadog.api.client.v2.model.IncidentUserDefinedFieldValidValue;
import com.datadog.api.client.v2.model.RelationshipToIncidentType;
import com.datadog.api.client.v2.model.RelationshipToIncidentTypeData;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createIncidentUserDefinedField", true);
    IncidentsApi apiInstance = new IncidentsApi(defaultClient);

    IncidentUserDefinedFieldCreateRequest body =
        new IncidentUserDefinedFieldCreateRequest()
            .data(
                new IncidentUserDefinedFieldCreateData()
                    .attributes(
                        new IncidentUserDefinedFieldAttributesCreateRequest()
                            .category(IncidentUserDefinedFieldCategory.WHAT_HAPPENED)
                            .collected(IncidentUserDefinedFieldCollected.ACTIVE)
                            .defaultValue("critical")
                            .displayName("Root Cause")
                            .name("root_cause")
                            .ordinal("1.5")
                            .required(false)
                            .tagKey("datacenter")
                            .type(IncidentUserDefinedFieldFieldType.TEXTBOX)
                            .validValues(
                                Collections.singletonList(
                                    new IncidentUserDefinedFieldValidValue()
                                        .description("A critical severity incident.")
                                        .displayName("Critical")
                                        .shortDescription("Critical")
                                        .value("critical"))))
                    .relationships(
                        new IncidentUserDefinedFieldCreateRelationships()
                            .incidentType(
                                new RelationshipToIncidentType()
                                    .data(
                                        new RelationshipToIncidentTypeData()
                                            .id("00000000-0000-0000-0000-000000000000")
                                            .type(IncidentTypeType.INCIDENT_TYPES))))
                    .type(IncidentUserDefinedFieldType.USER_DEFINED_FIELD));

    try {
      IncidentUserDefinedFieldResponse result = apiInstance.createIncidentUserDefinedField(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentsApi#createIncidentUserDefinedField");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
