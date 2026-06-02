// Get all Salesforce incident templates returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SalesforceIntegrationApi;
import com.datadog.api.client.v2.model.SalesforceIncidentsTemplatesResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SalesforceIntegrationApi apiInstance = new SalesforceIntegrationApi(defaultClient);

    try {
      SalesforceIncidentsTemplatesResponse result = apiInstance.getIncidentTemplates();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SalesforceIntegrationApi#getIncidentTemplates");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
