// Render an incident template returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.IncidentsApi;
import com.datadog.api.client.v2.model.IncidentRenderTemplateDataAttributesRequest;
import com.datadog.api.client.v2.model.IncidentRenderTemplateDataRequest;
import com.datadog.api.client.v2.model.IncidentRenderTemplateRequest;
import com.datadog.api.client.v2.model.IncidentRenderedTemplateResponse;
import com.datadog.api.client.v2.model.IncidentRenderedTemplateType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.renderIncidentTemplate", true);
    IncidentsApi apiInstance = new IncidentsApi(defaultClient);

    IncidentRenderTemplateRequest body =
        new IncidentRenderTemplateRequest()
            .data(
                new IncidentRenderTemplateDataRequest()
                    .attributes(
                        new IncidentRenderTemplateDataAttributesRequest()
                            .content("Incident INC-123 is SEV-1.")
                            .datetimeFormat("2006-01-02T15:04:05Z07:00")
                            .timezone("America/New_York")
                            .validateLinks(false)
                            .validateVariables(false))
                    .type(IncidentRenderedTemplateType.RENDERED_TEMPLATES));

    try {
      IncidentRenderedTemplateResponse result =
          apiInstance.renderIncidentTemplate("incident_id", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentsApi#renderIncidentTemplate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
