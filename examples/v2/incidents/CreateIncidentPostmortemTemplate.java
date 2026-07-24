// Create postmortem template returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.IncidentsApi;
import com.datadog.api.client.v2.model.ConfluencePostmortemSettings;
import com.datadog.api.client.v2.model.GoogleDocsPostmortemSettings;
import com.datadog.api.client.v2.model.PostmortemTemplateAttributesRequest;
import com.datadog.api.client.v2.model.PostmortemTemplateCreateRelationships;
import com.datadog.api.client.v2.model.PostmortemTemplateDataRequest;
import com.datadog.api.client.v2.model.PostmortemTemplateIncidentTypeRelationship;
import com.datadog.api.client.v2.model.PostmortemTemplateIncidentTypeRelationshipData;
import com.datadog.api.client.v2.model.PostmortemTemplateLocation;
import com.datadog.api.client.v2.model.PostmortemTemplateRequest;
import com.datadog.api.client.v2.model.PostmortemTemplateResponse;
import com.datadog.api.client.v2.model.PostmortemTemplateType;
import java.time.OffsetDateTime;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createIncidentPostmortemTemplate", true);
    IncidentsApi apiInstance = new IncidentsApi(defaultClient);

    PostmortemTemplateRequest body =
        new PostmortemTemplateRequest()
            .data(
                new PostmortemTemplateDataRequest()
                    .attributes(
                        new PostmortemTemplateAttributesRequest()
                            .confluencePostmortemSettings(
                                new ConfluencePostmortemSettings()
                                    .accountId("123456")
                                    .parentId("345678")
                                    .spaceId("789012"))
                            .content(
                                """
# Overview

# What Happened

# Timeline

# Action Items
""")
                            .googleDocsPostmortemSettings(
                                new GoogleDocsPostmortemSettings()
                                    .accountId("123456")
                                    .parentFolderId("789012"))
                            .isDefault(OffsetDateTime.parse("2024-01-01T00:00:00+00:00"))
                            .location(PostmortemTemplateLocation.DATADOG_NOTEBOOKS)
                            .name("Standard Postmortem Template"))
                    .id("00000000-0000-0000-0000-000000000000")
                    .relationships(
                        new PostmortemTemplateCreateRelationships()
                            .incidentType(
                                new PostmortemTemplateIncidentTypeRelationship()
                                    .data(
                                        new PostmortemTemplateIncidentTypeRelationshipData()
                                            .id(
                                                UUID.fromString(
                                                    "00000000-0000-0000-0000-000000000009"))
                                            .type("incident_types"))))
                    .type(PostmortemTemplateType.POSTMORTEM_TEMPLATES));

    try {
      PostmortemTemplateResponse result = apiInstance.createIncidentPostmortemTemplate(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentsApi#createIncidentPostmortemTemplate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
