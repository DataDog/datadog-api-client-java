// Delete a Salesforce incident template returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SalesforceIntegrationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SalesforceIntegrationApi apiInstance = new SalesforceIntegrationApi(defaultClient);

    try {
      apiInstance.deleteIncidentTemplate("incident_template_id");
    } catch (ApiException e) {
      System.err.println("Exception when calling SalesforceIntegrationApi#deleteIncidentTemplate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
