// Update a Salesforce incident template returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SalesforceIntegrationApi;
import com.datadog.api.client.v2.model.SalesforceIncidentsTemplatePriority;
import com.datadog.api.client.v2.model.SalesforceIncidentsTemplateResponse;
import com.datadog.api.client.v2.model.SalesforceIncidentsTemplateType;
import com.datadog.api.client.v2.model.SalesforceIncidentsTemplateUpdateAttributes;
import com.datadog.api.client.v2.model.SalesforceIncidentsTemplateUpdateData;
import com.datadog.api.client.v2.model.SalesforceIncidentsTemplateUpdateRequest;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SalesforceIntegrationApi apiInstance = new SalesforceIntegrationApi(defaultClient);

    SalesforceIncidentsTemplateUpdateRequest body =
        new SalesforceIncidentsTemplateUpdateRequest()
            .data(
                new SalesforceIncidentsTemplateUpdateData()
                    .attributes(
                        new SalesforceIncidentsTemplateUpdateAttributes()
                            .description("An incident was detected by Datadog monitors.")
                            .name("production-outage")
                            .ownerId("005000000000000")
                            .priority(SalesforceIncidentsTemplatePriority.HIGH)
                            .salesforceOrgId(
                                UUID.fromString("596da4af-0563-4097-90ff-07230c3f9db3"))
                            .subject("Datadog Incident: Production Outage"))
                    .id("596da4af-0563-4097-90ff-07230c3f9db3")
                    .type(SalesforceIncidentsTemplateType.SALESFORCE_INCIDENTS_INCIDENT_TEMPLATE));

    try {
      SalesforceIncidentsTemplateResponse result =
          apiInstance.updateIncidentTemplate("incident_template_id", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SalesforceIntegrationApi#updateIncidentTemplate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
