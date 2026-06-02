// Create a Salesforce incident template returns "CREATED" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SalesforceIntegrationApi;
import com.datadog.api.client.v2.model.SalesforceIncidentsTemplateCreateAttributes;
import com.datadog.api.client.v2.model.SalesforceIncidentsTemplateCreateData;
import com.datadog.api.client.v2.model.SalesforceIncidentsTemplateCreateRequest;
import com.datadog.api.client.v2.model.SalesforceIncidentsTemplatePriority;
import com.datadog.api.client.v2.model.SalesforceIncidentsTemplateResponse;
import com.datadog.api.client.v2.model.SalesforceIncidentsTemplateType;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SalesforceIntegrationApi apiInstance = new SalesforceIntegrationApi(defaultClient);

    SalesforceIncidentsTemplateCreateRequest body =
        new SalesforceIncidentsTemplateCreateRequest()
            .data(
                new SalesforceIncidentsTemplateCreateData()
                    .attributes(
                        new SalesforceIncidentsTemplateCreateAttributes()
                            .description("An incident was detected by Datadog monitors.")
                            .name("production-outage")
                            .ownerId("005000000000000")
                            .priority(SalesforceIncidentsTemplatePriority.HIGH)
                            .salesforceOrgId(
                                UUID.fromString("596da4af-0563-4097-90ff-07230c3f9db3"))
                            .subject("Datadog Incident: Production Outage"))
                    .type(SalesforceIncidentsTemplateType.SALESFORCE_INCIDENTS_INCIDENT_TEMPLATE));

    try {
      SalesforceIncidentsTemplateResponse result = apiInstance.createIncidentTemplate(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SalesforceIntegrationApi#createIncidentTemplate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
