// Create incident rule returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.IncidentsApi;
import com.datadog.api.client.v2.model.IncidentRuleAttributesRequest;
import com.datadog.api.client.v2.model.IncidentRuleDataRequest;
import com.datadog.api.client.v2.model.IncidentRuleRequest;
import com.datadog.api.client.v2.model.IncidentRuleResponse;
import com.datadog.api.client.v2.model.IncidentRuleType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createIncidentConfigRule", true);
    IncidentsApi apiInstance = new IncidentsApi(defaultClient);

    IncidentRuleRequest body =
        new IncidentRuleRequest()
            .data(
                new IncidentRuleDataRequest()
                    .attributes(new IncidentRuleAttributesRequest().name("High Severity Rule"))
                    .type(IncidentRuleType.INCIDENT_RULE));

    try {
      IncidentRuleResponse result = apiInstance.createIncidentConfigRule(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentsApi#createIncidentConfigRule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
