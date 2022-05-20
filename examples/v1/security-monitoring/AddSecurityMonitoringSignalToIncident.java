// Add a security signal to an incident returns "OK" response

import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.SecurityMonitoringApi;
import com.datadog.api.v1.client.model.AddSignalToIncidentRequest;
import com.datadog.api.v1.client.model.SuccessfulSignalUpdateResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    AddSignalToIncidentRequest body = new AddSignalToIncidentRequest().incidentId(2609L);

    try {
      SuccessfulSignalUpdateResponse result =
          apiInstance.addSecurityMonitoringSignalToIncident(
              "AQAAAYDiB_Ol8PbzFAAAAABBWURpQl9PbEFBQU0yeXhGTG9ZV2JnQUE", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling SecurityMonitoringApi#addSecurityMonitoringSignalToIncident");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
